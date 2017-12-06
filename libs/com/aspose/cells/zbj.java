package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.Iterator;

class zbj
  extends zcd
{
  private zcd[] a;
  
  zbj()
  {
    c(2174);
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    super.a(paramzrg);
    if (this.a != null) {
      for (zcd localzcd : this.a) {
        localzcd.a(paramzrg);
      }
    }
  }
  
  void a(FilterColumn paramFilterColumn)
  {
    this.a = null;
    MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)paramFilterColumn.getFilter();
    b(60);
    this.b = new byte[d()];
    int i = b(paramFilterColumn);
    this.b[i] = ((byte)paramFilterColumn.getFieldIndex());
    i += 2;
    if (paramFilterColumn.a()) {
      this.b[i] = 1;
    }
    i += 4;
    i += 8;
    int j = localMultipleFilterCollection.getCount();
    int k = 0;
    Object localObject1 = localMultipleFilterCollection.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof DateTimeGroupItem)) {
        k++;
      }
    }
    j -= k;
    if (localMultipleFilterCollection.getMatchBlank()) {
      j++;
    }
    System.arraycopy(zc.a(j), 0, this.b, i, 4);
    i += 4;
    System.arraycopy(zc.a(k), 0, this.b, i, 4);
    i += 4;
    localObject1 = paramFilterColumn.c().a();
    if ((((AutoFilter)localObject1).d == null) || ((((AutoFilter)localObject1).d instanceof Worksheet))) {
      this.b[i] = 8;
    }
    i++;
    i += 5;
    int m = -1;
    if ((((AutoFilter)localObject1).d != null) && ((((AutoFilter)localObject1).d instanceof ListObject))) {
      m = ((ListObject)((AutoFilter)localObject1).d).a();
    }
    System.arraycopy(zc.a(m), 0, this.b, i, 4);
    this.a = new zcd[j + k];
    int n = 0;
    Object localObject3 = localMultipleFilterCollection.iterator();
    Object localObject4;
    zns localzns;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = ((Iterator)localObject3).next();
      if (!(localObject4 instanceof DateTimeGroupItem))
      {
        localzns = new zns();
        localzns.a(paramFilterColumn, localObject4);
        this.a[(n++)] = localzns;
      }
    }
    if (localMultipleFilterCollection.getMatchBlank())
    {
      localObject3 = new zns();
      ((zns)localObject3).a(paramFilterColumn);
      this.a[(n++)] = localObject3;
    }
    localObject3 = localMultipleFilterCollection.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = ((Iterator)localObject3).next();
      if ((localObject4 instanceof DateTimeGroupItem))
      {
        localzns = new zns();
        localzns.a(paramFilterColumn, (DateTimeGroupItem)localObject4);
        this.a[(n++)] = localzns;
      }
    }
  }
  
  private int b(FilterColumn paramFilterColumn)
  {
    this.b[0] = 126;
    this.b[1] = 8;
    this.b[2] = 1;
    CellArea localCellArea = paramFilterColumn.c().a().i();
    System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, 4, 2);
    System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, 6, 2);
    System.arraycopy(zc.a(localCellArea.StartColumn), 0, this.b, 8, 2);
    System.arraycopy(zc.a(localCellArea.EndColumn), 0, this.b, 10, 2);
    return 12;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */