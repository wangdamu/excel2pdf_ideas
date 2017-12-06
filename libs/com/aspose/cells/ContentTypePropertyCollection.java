package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class ContentTypePropertyCollection
  extends CollectionBase
{
  String a = "f0ee3e2c-6582-4549-9afa-575e8dac0aa5";
  int b = -1;
  
  void a(ContentTypePropertyCollection paramContentTypePropertyCollection)
  {
    this.b = paramContentTypePropertyCollection.b;
    this.a = paramContentTypePropertyCollection.a;
    Iterator localIterator = paramContentTypePropertyCollection.iterator();
    while (localIterator.hasNext())
    {
      ContentTypeProperty localContentTypeProperty1 = (ContentTypeProperty)localIterator.next();
      ContentTypeProperty localContentTypeProperty2 = new ContentTypeProperty(this);
      a(localContentTypeProperty2);
      localContentTypeProperty2.a(localContentTypeProperty1);
    }
  }
  
  public int add(String name, String value)
  {
    return add(name, value, null);
  }
  
  public int add(String name, String value, String type)
  {
    ContentTypeProperty localContentTypeProperty = new ContentTypeProperty(this);
    localContentTypeProperty.setName(name);
    localContentTypeProperty.setValue(value);
    if ((type != null) && (type.indexOf(":") == -1)) {
      type = "dms:" + type;
    }
    localContentTypeProperty.d = type;
    zf.a(this.InnerList, localContentTypeProperty);
    return this.InnerList.size() - 1;
  }
  
  int a(ContentTypeProperty paramContentTypeProperty)
  {
    zf.a(this.InnerList, paramContentTypeProperty);
    return this.InnerList.size() - 1;
  }
  
  public ContentTypeProperty get(int index)
  {
    return (ContentTypeProperty)this.InnerList.get(index);
  }
  
  public ContentTypeProperty get(String name)
  {
    for (int i = 0; i < getCount(); i++) {
      if (zw.b(get(i).getName(), name)) {
        return get(i);
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ContentTypePropertyCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */