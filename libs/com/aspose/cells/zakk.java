package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;
import java.util.Iterator;

class zakk
{
  private Workbook a = null;
  private HashMap b = new HashMap();
  private static final za c = new za(new String[] { "contentTypeSchema", "FormTemplates", "properties", "documentManagement" });
  
  zakk(Workbook paramWorkbook)
  {
    this.a = paramWorkbook;
  }
  
  void a(zxf paramzxf)
    throws Exception
  {
    String str = "MsoDataStore";
    if ((paramzxf != null) && (paramzxf.a().b(str)))
    {
      zaoz localzaoz1 = (zaoz)paramzxf.a().d(str);
      Iterator localIterator = localzaoz1.f().iterator();
      while (localIterator.hasNext())
      {
        zaoz localzaoz2 = (zaoz)localIterator.next();
        CustomXmlPart localCustomXmlPart = new CustomXmlPart();
        zh localzh = (zh)localzaoz2.d("item");
        if (localzh != null) {
          localCustomXmlPart.a = localzh.o();
        }
        localzh = (zh)localzaoz2.d("Properties");
        if (localzh != null) {
          localCustomXmlPart.b = localzh.o();
        }
        this.a.f.a(localCustomXmlPart);
      }
      paramzxf.a().g(str);
    }
  }
  
  void a()
    throws Exception
  {
    CustomXmlPartCollection localCustomXmlPartCollection = this.a.f;
    if ((localCustomXmlPartCollection == null) || (localCustomXmlPartCollection.getCount() == 0)) {
      return;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    boolean[] arrayOfBoolean = new boolean[localCustomXmlPartCollection.getCount()];
    for (int i = localCustomXmlPartCollection.getCount() - 1; i >= 0; i--)
    {
      zcjy localzcjy = new zcjy(new zh(localCustomXmlPartCollection.get(i).getData()));
      localzcjy.b(true);
      c(localzcjy);
      switch (c.a(localzcjy.q()))
      {
      case 0: 
        localObject1 = localzcjy;
        break;
      case 1: 
        break;
      case 2: 
        localObject2 = localzcjy;
        break;
      }
      arrayOfBoolean[i] = true;
    }
    if (localObject1 != null)
    {
      for (i = localCustomXmlPartCollection.getCount() - 1; i >= 0; i--) {
        if (arrayOfBoolean[i] != 0) {
          localCustomXmlPartCollection.removeAt(i);
        }
      }
      a((zcjy)localObject1);
      if (localObject2 == null) {
        a(this.a.getCustomDocumentProperties());
      } else {
        b((zcjy)localObject2);
      }
    }
    if (localCustomXmlPartCollection.getCount() == 0) {
      this.a.f = null;
    }
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    zakj localzakj = new zakj(this.a.e);
    localzakj.a(paramzcjy);
  }
  
  private void a(CustomDocumentPropertyCollection paramCustomDocumentPropertyCollection)
  {
    Iterator localIterator = this.a.e.iterator();
    while (localIterator.hasNext())
    {
      ContentTypeProperty localContentTypeProperty = (ContentTypeProperty)localIterator.next();
      DocumentProperty localDocumentProperty = paramCustomDocumentPropertyCollection.get(localContentTypeProperty.getName());
      if (localDocumentProperty != null)
      {
        localContentTypeProperty.setValue(zs.a(localDocumentProperty));
        paramCustomDocumentPropertyCollection.remove(localDocumentProperty.getName());
      }
    }
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 3: 
        a(paramzcjy, this.a.e);
      }
    }
  }
  
  void a(zcjy paramzcjy, ContentTypePropertyCollection paramContentTypePropertyCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      ContentTypeProperty localContentTypeProperty = paramContentTypePropertyCollection.get(paramzcjy.q());
      localContentTypeProperty.c = paramzcjy.a("xmlns");
      this.b.put(localContentTypeProperty.c, localContentTypeProperty);
      paramContentTypePropertyCollection.a = localContentTypeProperty.c;
      localContentTypeProperty.setName(paramzcjy.q());
      if (!paramzcjy.o()) {
        localContentTypeProperty.setValue(paramzcjy.b());
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private boolean c(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */