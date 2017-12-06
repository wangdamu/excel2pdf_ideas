package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomXmlPartCollection
  extends CollectionBase
{
  public int add(byte[] data, byte[] shemaData)
  {
    CustomXmlPart localCustomXmlPart = new CustomXmlPart(data, shemaData);
    zf.a(this.InnerList, localCustomXmlPart);
    return this.InnerList.size() - 1;
  }
  
  int a(CustomXmlPart paramCustomXmlPart)
  {
    zf.a(this.InnerList, paramCustomXmlPart);
    return this.InnerList.size() - 1;
  }
  
  public CustomXmlPart get(int index)
  {
    return (CustomXmlPart)this.InnerList.get(index);
  }
  
  void a(CustomXmlPartCollection paramCustomXmlPartCollection)
  {
    Iterator localIterator = paramCustomXmlPartCollection.iterator();
    while (localIterator.hasNext())
    {
      CustomXmlPart localCustomXmlPart1 = (CustomXmlPart)localIterator.next();
      CustomXmlPart localCustomXmlPart2 = new CustomXmlPart();
      localCustomXmlPart2.a(localCustomXmlPart1);
      zf.a(this.InnerList, localCustomXmlPart2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomXmlPartCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */