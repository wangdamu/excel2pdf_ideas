package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zdb
  extends zbzp
{
  private zxf b;
  
  public zdb(zxf paramzxf)
    throws Exception
  {
    this.b = paramzxf;
    a();
  }
  
  protected boolean a(zcjs paramzcjs)
    throws Exception
  {
    Iterator localIterator = paramzcjs.l().iterator();
    while (localIterator.hasNext())
    {
      zcjn localzcjn = (zcjn)localIterator.next();
      try
      {
        byte[] arrayOfByte = a(localzcjn.a("URI"));
        if (!a(zhu.b(arrayOfByte, this.a), ze.b(localzcjn.e("DigestValue").d()))) {
          return false;
        }
      }
      catch (Exception localException) {}
    }
    return true;
  }
  
  protected boolean a()
    throws Exception
  {
    zaoz localzaoz = this.b.a().b("_xmlsignatures");
    if (localzaoz != null)
    {
      Iterator localIterator = localzaoz.c().iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        Object localObject = null;
        String str2 = null;
        DateTime localDateTime = null;
        boolean bool = true;
        String str3 = a(localzaoz.a(str1));
        if (str3 != null)
        {
          zhu[] arrayOfzhu = { localObject };
          int i = !a(str3, arrayOfzhu) ? 1 : 0;
          localObject = arrayOfzhu[0];
          if (i != 0) {
            bool = false;
          }
          String[] arrayOfString = { str2 };
          DateTime[] arrayOfDateTime = { localDateTime };
          int j = !a(str3, arrayOfString, arrayOfDateTime) ? 1 : 0;
          str2 = arrayOfString[0];
          localDateTime = arrayOfDateTime[0];
          if (j != 0) {
            bool = false;
          }
          DigitalSignature localDigitalSignature = new DigitalSignature(localObject == null ? null : ((zhu)localObject).c(), str2, localDateTime, bool);
          zf.a(b().a, localDigitalSignature);
        }
      }
    }
    this.b = null;
    return true;
  }
  
  private byte[] a(String paramString)
    throws Exception
  {
    String str1 = paramString.substring(0, 0 + paramString.indexOf("?"));
    String[] arrayOfString1 = zw.d(str1, '/');
    ArrayList localArrayList = new ArrayList();
    Object localObject2;
    for (localObject1 : arrayOfString1) {
      if (((String)localObject1).length() != 0)
      {
        localObject2 = localObject1;
        localObject2 = zbpd.c((String)localObject2);
        zf.a(localArrayList, zbpd.b((String)localObject2));
      }
    }
    int i = localArrayList.size();
    zaoz localzaoz = this.b.a();
    for (??? = 0; ??? < i - 1; ???++) {
      localzaoz = localzaoz.b((String)localArrayList.get(???));
    }
    String str2 = (String)localArrayList.get(i - 1);
    Object localObject1 = localzaoz.a(str2);
    ((zh)localObject1).b(0L);
    if (zbpd.a(str2))
    {
      zh localzh = zbpd.a((zh)localObject1);
      localObject2 = new byte[(int)localzh.h()];
      localzh.a((byte[])localObject2, 0, localObject2.length);
      localzh.a();
    }
    else
    {
      localObject2 = new byte[(int)((zh)localObject1).h()];
      ((zh)localObject1).a((byte[])localObject2, 0, localObject2.length);
    }
    return (byte[])localObject2;
  }
  
  private String a(zm paramzm)
    throws Exception
  {
    zn localzn = new zn(paramzm);
    String str = localzn.e();
    return str;
  }
  
  static boolean a(zxf paramzxf)
  {
    zaoz localzaoz1 = paramzxf.a();
    if (localzaoz1.b("_signatures")) {
      return true;
    }
    zaoz localzaoz2 = localzaoz1.b("_xmlsignatures");
    return (localzaoz2 != null) && (localzaoz2.b() > 0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */