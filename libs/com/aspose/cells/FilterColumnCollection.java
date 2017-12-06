package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class FilterColumnCollection
  extends CollectionBase
{
  private AutoFilter a;
  
  AutoFilter a()
  {
    return this.a;
  }
  
  FilterColumnCollection(AutoFilter m_AutoFilter)
  {
    this.a = m_AutoFilter;
  }
  
  public void removeAt(int index)
  {
    this.InnerList.remove(index);
  }
  
  public FilterColumn getByIndex(int index)
  {
    return (FilterColumn)this.InnerList.get(index);
  }
  
  public FilterColumn get(int fieldIndex)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      FilterColumn localFilterColumn2 = (FilterColumn)this.InnerList.get(i);
      if (localFilterColumn2.getFieldIndex() == fieldIndex) {
        return localFilterColumn2;
      }
      if (localFilterColumn2.getFieldIndex() > fieldIndex)
      {
        FilterColumn localFilterColumn3 = new FilterColumn(this, fieldIndex);
        this.InnerList.add(i, localFilterColumn3);
        return localFilterColumn3;
      }
    }
    FilterColumn localFilterColumn1 = new FilterColumn(this, fieldIndex);
    zf.a(this.InnerList, localFilterColumn1);
    return localFilterColumn1;
  }
  
  FilterColumn a(int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      FilterColumn localFilterColumn = (FilterColumn)this.InnerList.get(i);
      if (localFilterColumn.getFieldIndex() == paramInt) {
        return localFilterColumn;
      }
      if (localFilterColumn.getFieldIndex() > paramInt) {
        return null;
      }
    }
    return null;
  }
  
  int a(FilterColumn paramFilterColumn)
  {
    if (this.InnerList.size() == 0)
    {
      zf.a(this.InnerList, paramFilterColumn);
      return 0;
    }
    for (int i = this.InnerList.size() - 1; i >= 0; i--)
    {
      FilterColumn localFilterColumn = (FilterColumn)this.InnerList.get(i);
      if (localFilterColumn.getFieldIndex() == paramFilterColumn.getFieldIndex())
      {
        this.InnerList.set(i, paramFilterColumn);
        return i;
      }
      if (localFilterColumn.getFieldIndex() < paramFilterColumn.getFieldIndex())
      {
        if (i == this.InnerList.size() - 1) {
          zf.a(this.InnerList, paramFilterColumn);
        } else {
          this.InnerList.add(i + 1, paramFilterColumn);
        }
        return i + 1;
      }
    }
    this.InnerList.add(0, paramFilterColumn);
    return 0;
  }
  
  void a(FilterColumnCollection paramFilterColumnCollection)
  {
    if ((paramFilterColumnCollection.InnerList != null) && (paramFilterColumnCollection.InnerList.size() != 0))
    {
      Iterator localIterator = paramFilterColumnCollection.InnerList.iterator();
      while (localIterator.hasNext())
      {
        FilterColumn localFilterColumn1 = (FilterColumn)localIterator.next();
        FilterColumn localFilterColumn2 = get(localFilterColumn1.getFieldIndex());
        localFilterColumn2.a(localFilterColumn1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FilterColumnCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */