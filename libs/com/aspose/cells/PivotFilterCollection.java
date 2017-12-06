package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class PivotFilterCollection
  extends CollectionBase
{
  PivotTable a;
  
  PivotFilterCollection(PivotTable table)
  {
    this.a = table;
  }
  
  public PivotFilter get(int index)
  {
    return (PivotFilter)this.InnerList.get(index);
  }
  
  void a(PivotFilter paramPivotFilter)
  {
    zf.a(this.InnerList, paramPivotFilter);
  }
  
  public int add(int fieldIndex, int type)
  {
    if ((fieldIndex < 0) || (fieldIndex >= this.a.getBaseFields().getCount())) {
      throw new CellsException(12, "This pivot field index is out of range");
    }
    clearFilter(fieldIndex);
    PivotFilter localPivotFilter = new PivotFilter(this.a.a.a);
    localPivotFilter.a = fieldIndex;
    localPivotFilter.b = type;
    zf.a(this.InnerList, localPivotFilter);
    return this.InnerList.size() - 1;
  }
  
  public void clearFilter(int fieldIndex)
  {
    if ((fieldIndex < 0) || (fieldIndex >= this.a.getBaseFields().getCount())) {
      throw new CellsException(12, "This pivot field index is out of range");
    }
    for (int i = 0; i < getCount(); i++)
    {
      PivotFilter localPivotFilter = get(i);
      if (localPivotFilter.a == fieldIndex) {
        removeAt(i);
      }
    }
  }
  
  void a(PivotFilterCollection paramPivotFilterCollection)
  {
    this.InnerList.clear();
    for (int i = 0; i < paramPivotFilterCollection.getCount(); i++)
    {
      PivotFilter localPivotFilter = new PivotFilter(this.a.a.a);
      localPivotFilter = paramPivotFilterCollection.get(i);
      zf.a(this.InnerList, localPivotFilter);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotFilterCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */