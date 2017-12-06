package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.ze;
import java.util.Iterator;

class zatz
  extends zbzp
{
  private zi b;
  
  public zatz(zi paramzi)
    throws Exception
  {
    this.b = paramzi;
    a();
  }
  
  protected boolean a(zcjs paramzcjs)
    throws Exception
  {
    Iterator localIterator = paramzcjs.l().iterator();
    while (localIterator.hasNext())
    {
      zcjn localzcjn = (zcjn)localIterator.next();
      if (("Reference".equals(localzcjn.k())) && (!zbzo.a(localzcjn, "URI").endsWith(".relationships+xml"))) {
        try
        {
          byte[] arrayOfByte = a(localzcjn.a("URI"));
          if (!a(zhu.b(arrayOfByte, this.a), ze.b(localzcjn.e("DigestValue").d()))) {
            return false;
          }
        }
        catch (Exception localException) {}
      }
    }
    return true;
  }
  
  protected boolean a()
    throws Exception
  {
    zh localzh = this.b.a("[Content_Types].xml");
    zm localzm = this.b.a(localzh);
    zn localzn = new zn(localzm);
    String str1 = localzn.e();
    localzn.a();
    zcjm localzcjm = new zcjm();
    localzcjm.a(str1, false, false);
    zcjn localzcjn = localzcjm.f();
    if (localzcjn != null)
    {
      Iterator localIterator = localzcjn.l().iterator();
      while (localIterator.hasNext())
      {
        zcjs localzcjs = (zcjs)localIterator.next();
        if (zbzo.a(localzcjs, "ContentType").endsWith("digital-signature-xmlsignature+xml"))
        {
          Object localObject = null;
          String str2 = null;
          DateTime localDateTime = null;
          boolean bool = true;
          String str3 = b(zbzo.a(localzcjs, "PartName"));
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
    }
    this.b = null;
    return true;
  }
  
  private byte[] a(String paramString)
    throws Exception
  {
    int i = paramString.charAt(0) == '/' ? 1 : 0;
    int j = paramString.indexOf('?');
    j = j == -1 ? paramString.length() - i : j - i;
    zh localzh = this.b.a(paramString.substring(i, i + j));
    zm localzm = this.b.a(localzh);
    byte[] arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, arrayOfByte.length);
    localzm.a();
    return arrayOfByte;
  }
  
  private String b(String paramString)
    throws Exception
  {
    int i = paramString.charAt(0) == '/' ? 1 : 0;
    int j = paramString.indexOf('?');
    j = j == -1 ? paramString.length() - i : j - i;
    zh localzh = this.b.a(paramString.substring(i, i + j));
    if (localzh == null) {
      return null;
    }
    zn localzn = new zn(this.b.a(localzh));
    String str = localzn.e();
    localzn.a();
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */