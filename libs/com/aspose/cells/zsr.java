package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zl;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import java.util.Iterator;

class zsr
{
  private BuiltInDocumentPropertyCollection a;
  private CustomDocumentPropertyCollection b;
  private zaxz c;
  private zaxz d;
  private zaxz e;
  private static DateTime f = new DateTime(1601, 1, 1);
  
  void a(zaoz paramzaoz, BuiltInDocumentPropertyCollection paramBuiltInDocumentPropertyCollection, CustomDocumentPropertyCollection paramCustomDocumentPropertyCollection)
    throws Exception
  {
    try
    {
      this.a = paramBuiltInDocumentPropertyCollection;
      this.b = paramCustomDocumentPropertyCollection;
      zh localzh1 = paramzaoz.a("\005SummaryInformation");
      if (localzh1 != null) {
        a(localzh1);
      }
      zh localzh2 = paramzaoz.a("\005DocumentSummaryInformation");
      if (localzh2 != null) {
        b(localzh2);
      }
    }
    catch (Exception localException) {}
  }
  
  private void a(zm paramzm)
    throws Exception
  {
    zaxy localzaxy = new zaxy(paramzm);
    if (localzaxy.a().size() > 0)
    {
      zaxw localzaxw = localzaxy.a().a(0).b();
      a(localzaxw, this.a, 0);
    }
  }
  
  private void b(zm paramzm)
    throws Exception
  {
    zaxy localzaxy = new zaxy(paramzm);
    zaxw localzaxw;
    if (localzaxy.a().size() > 0)
    {
      localzaxw = localzaxy.a().a(0).b();
      a(localzaxw, this.a, 1);
    }
    if (localzaxy.a().size() > 1)
    {
      localzaxw = localzaxy.a().a(1).b();
      a(localzaxw, this.b, 2);
    }
  }
  
  private static void a(zaxw paramzaxw, DocumentPropertyCollection paramDocumentPropertyCollection, int paramInt)
    throws Exception
  {
    for (int i = 0; i < paramzaxw.size(); i++)
    {
      zaxv localzaxv = paramzaxw.a(i);
      String str;
      switch (paramInt)
      {
      case 0: 
        str = BuiltInDocumentPropertyCollection.a(localzaxv.a, paramInt);
        switch (localzaxv.a)
        {
        case 10: 
          zl localzl = zk.e((DateTime)localzaxv.c, f);
          localzaxv.c = Double.valueOf(localzl.d());
          break;
        case 9: 
          if (!"".equals((String)localzaxv.c)) {
            try
            {
              localzaxv.c = Integer.valueOf(zp.a((String)localzaxv.c));
            }
            catch (Exception localException)
            {
              localzaxv.c = Integer.valueOf(0);
            }
          } else {
            localzaxv.c = Integer.valueOf(0);
          }
          break;
        }
        break;
      case 1: 
        str = BuiltInDocumentPropertyCollection.a(localzaxv.a, paramInt);
        break;
      case 2: 
        str = localzaxv.b;
        break;
      default: 
        throw new Exception("Unknown property group type.");
      }
      boolean bool = false;
      if (str == null)
      {
        str = "퀀_generated_" + paramInt + "." + localzaxv.a;
        bool = true;
      }
      paramDocumentPropertyCollection.a(paramInt, localzaxv.a, str, localzaxv.c, bool);
    }
  }
  
  static byte[] a(String paramString)
  {
    byte[] arrayOfByte1 = Encoding.getUnicode().a(paramString);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    return arrayOfByte2;
  }
  
  void a(BuiltInDocumentPropertyCollection paramBuiltInDocumentPropertyCollection, CustomDocumentPropertyCollection paramCustomDocumentPropertyCollection, zaoz paramzaoz)
    throws Exception
  {
    String str = null;
    this.a = paramBuiltInDocumentPropertyCollection;
    if (paramBuiltInDocumentPropertyCollection.contains("HyperlinkBase"))
    {
      str = paramBuiltInDocumentPropertyCollection.getHyperlinkBase();
      paramBuiltInDocumentPropertyCollection.remove("HyperlinkBase");
      if ((str != null) && (!"".equals(str)))
      {
        paramCustomDocumentPropertyCollection.remove("_PID_LINKBASE");
        paramCustomDocumentPropertyCollection.a("_PID_LINKBASE", a(str));
      }
    }
    this.b = paramCustomDocumentPropertyCollection;
    zaxy localzaxy1 = new zaxy();
    this.c = new zaxz(zaxz.a);
    zf.a(localzaxy1.a(), this.c);
    zaxy localzaxy2 = new zaxy();
    this.d = new zaxz(zaxz.b);
    zf.a(localzaxy2.a(), this.d);
    this.e = new zaxz(zaxz.c);
    zf.a(localzaxy2.a(), this.e);
    a(this.a);
    a(this.b);
    if (this.e.b().size() == 0) {
      localzaxy2.a().remove(this.e);
    }
    zh localzh1 = new zh();
    localzaxy1.a(localzh1);
    paramzaoz.b("\005SummaryInformation", localzh1);
    zh localzh2 = new zh();
    localzaxy2.a(localzh2);
    paramzaoz.b("\005DocumentSummaryInformation", localzh2);
    if ((str != null) && (!"".equals(str)))
    {
      paramBuiltInDocumentPropertyCollection.setHyperlinkBase(str);
      paramCustomDocumentPropertyCollection.remove("_PID_LINKBASE");
    }
  }
  
  private void a(DocumentPropertyCollection paramDocumentPropertyCollection)
    throws Exception
  {
    Iterator localIterator = paramDocumentPropertyCollection.iterator();
    while (localIterator.hasNext())
    {
      DocumentProperty localDocumentProperty = (DocumentProperty)localIterator.next();
      Object localObject;
      switch (localDocumentProperty.d())
      {
      case 0: 
        localObject = localDocumentProperty.getValue();
        switch (localDocumentProperty.a())
        {
        case 10: 
          zl localzl = zl.a(((Double)localObject).doubleValue());
          localObject = zk.a(f, localzl);
          break;
        case 9: 
          localObject = zs.a(localObject);
          break;
        }
        zf.a(this.c.b(), new zaxv(localDocumentProperty.a(), null, localObject));
        break;
      case 1: 
        zf.a(this.d.b(), new zaxv(localDocumentProperty.a(), null, localDocumentProperty.getValue()));
        break;
      case 2: 
        localObject = localDocumentProperty.isGeneratedName() ? null : localDocumentProperty.getName();
        zf.a(this.e.b(), new zaxv(localDocumentProperty.a(), (String)localObject, localDocumentProperty.getValue()));
        break;
      default: 
        throw new Exception("Unknown property group.");
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */