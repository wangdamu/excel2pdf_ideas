package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class CustomPropertyCollection
  extends CollectionBase
{
  public int add(String name, String value)
  {
    for (int i = 0; i < getCount(); i++) {
      if (zw.b(get(i).getName(), name))
      {
        get(i).setValue(value);
        return i;
      }
    }
    CustomProperty localCustomProperty = new CustomProperty();
    localCustomProperty.setName(name);
    localCustomProperty.setValue(value);
    zf.a(this.InnerList, localCustomProperty);
    return this.InnerList.size() - 1;
  }
  
  public CustomProperty get(int index)
  {
    return (CustomProperty)this.InnerList.get(index);
  }
  
  public CustomProperty get(String name)
  {
    for (int i = 0; i < getCount(); i++) {
      if (zw.b(get(i).getName(), name)) {
        return get(i);
      }
    }
    return null;
  }
  
  void a(CustomPropertyCollection paramCustomPropertyCollection)
  {
    for (int i = 0; i < paramCustomPropertyCollection.getCount(); i++)
    {
      CustomProperty localCustomProperty1 = paramCustomPropertyCollection.get(i);
      CustomProperty localCustomProperty2 = new CustomProperty();
      localCustomProperty2.a(localCustomProperty1);
      zf.a(this.InnerList, localCustomProperty2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomPropertyCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */