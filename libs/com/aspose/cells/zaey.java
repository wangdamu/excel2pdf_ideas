package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.zc;
import java.util.Iterator;

class zaey
  extends zcd
{
  zaey()
  {
    c(27);
  }
  
  void a(HorizontalPageBreakCollection paramHorizontalPageBreakCollection)
  {
    int i = paramHorizontalPageBreakCollection.getCount();
    a((short)(2 + 6 * i));
    this.b = new byte[d()];
    System.arraycopy(zc.a(i), 0, this.b, 0, 2);
    zd localzd = new zd(new zael());
    int j = 0;
    for (j = 0; j < i; j++)
    {
      localObject = paramHorizontalPageBreakCollection.get(j);
      localzd.a(localObject, localObject);
    }
    j = 0;
    Object localObject = localzd.f().iterator();
    while (((Iterator)localObject).hasNext())
    {
      HorizontalPageBreak localHorizontalPageBreak = (HorizontalPageBreak)((Iterator)localObject).next();
      System.arraycopy(zc.a(localHorizontalPageBreak.getRow()), 0, this.b, 6 * j + 2, 2);
      System.arraycopy(zc.a(localHorizontalPageBreak.getStartColumn()), 0, this.b, 6 * j + 4, 2);
      System.arraycopy(zc.a(localHorizontalPageBreak.getEndColumn()), 0, this.b, 6 * j + 6, 2);
      j++;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */