package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class TableStyleElementCollection
  extends CollectionBase
{
  private TableStyle a;
  
  TableStyle a()
  {
    return this.a;
  }
  
  TableStyleElementCollection(TableStyle tableStyle)
  {
    this.a = tableStyle;
  }
  
  /**
   * @deprecated
   */
  public TableStyleElement getTableStyleElementWithIndex(int index)
  {
    return get(index);
  }
  
  public TableStyleElement get(int index)
  {
    return (TableStyleElement)this.InnerList.get(index);
  }
  
  /**
   * @deprecated
   */
  public TableStyleElement getTableStyleElementWithType(int type)
  {
    return getByTableStyleElementType(type);
  }
  
  public TableStyleElement getByTableStyleElementType(int type)
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).getType() == type) {
        return get(i);
      }
    }
    return null;
  }
  
  public int add(int type)
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).getType() == type) {
        return i;
      }
    }
    TableStyleElement localTableStyleElement = new TableStyleElement(this, type);
    return a(localTableStyleElement);
  }
  
  int a(TableStyleElement paramTableStyleElement)
  {
    zf.a(this.InnerList, paramTableStyleElement);
    return getCount() - 1;
  }
  
  void a(TableStyleElementCollection paramTableStyleElementCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramTableStyleElementCollection.getCount(); i++)
    {
      TableStyleElement localTableStyleElement1 = paramTableStyleElementCollection.get(i);
      TableStyleElement localTableStyleElement2 = new TableStyleElement(this, localTableStyleElement1.getType());
      localTableStyleElement2.a(localTableStyleElement1, paramCopyOptions);
      zf.a(this.InnerList, localTableStyleElement2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TableStyleElementCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */