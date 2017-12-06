package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class ListColumnCollection
  extends CollectionBase
{
  private ListObject a;
  
  ListColumnCollection(ListObject listObject)
  {
    this.a = listObject;
  }
  
  void a(int paramInt, ListColumn paramListColumn)
  {
    this.InnerList.add(paramInt, paramListColumn);
  }
  
  void a(ListColumnCollection paramListColumnCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramListColumnCollection.getCount(); i++)
    {
      ListColumn localListColumn1 = paramListColumnCollection.get(i);
      ListColumn localListColumn2 = new ListColumn(this);
      localListColumn2.a(localListColumn1, paramCopyOptions);
      zf.a(this.InnerList, localListColumn2);
    }
  }
  
  public ListColumn get(int index)
  {
    return (ListColumn)this.InnerList.get(index);
  }
  
  public ListColumn get(String name)
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      ListColumn localListColumn = (ListColumn)localIterator.next();
      if (zw.b(localListColumn.getName(), name)) {
        return localListColumn;
      }
    }
    return null;
  }
  
  int a()
  {
    int i = -1;
    for (int j = 0; j < getCount(); j++) {
      if (i < get(j).n) {
        i = get(j).n;
      }
    }
    return i;
  }
  
  boolean b()
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).getTotalsCalculation() != 0) {
        return true;
      }
    }
    return false;
  }
  
  void a(ListColumn paramListColumn)
  {
    zf.a(this.InnerList, paramListColumn);
  }
  
  ListObject c()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ListColumnCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */