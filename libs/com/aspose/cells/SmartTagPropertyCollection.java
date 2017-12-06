package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class SmartTagPropertyCollection
  extends CollectionBase
{
  public SmartTagProperty get(int index)
  {
    return (SmartTagProperty)this.InnerList.get(index);
  }
  
  public SmartTagProperty get(String name)
  {
    for (int i = 0; i < getCount(); i++)
    {
      SmartTagProperty localSmartTagProperty = (SmartTagProperty)this.InnerList.get(i);
      if (zw.a(localSmartTagProperty.getName(), name, true) == 0) {
        return localSmartTagProperty;
      }
    }
    return null;
  }
  
  public int add(String name, String value)
  {
    for (int i = 0; i < getCount(); i++)
    {
      SmartTagProperty localSmartTagProperty2 = (SmartTagProperty)this.InnerList.get(i);
      if (zw.a(localSmartTagProperty2.getName(), name, true) == 0)
      {
        localSmartTagProperty2.setValue(value);
        return i;
      }
    }
    SmartTagProperty localSmartTagProperty1 = new SmartTagProperty(name, value);
    zf.a(this.InnerList, localSmartTagProperty1);
    return getCount() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SmartTagPropertyCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */