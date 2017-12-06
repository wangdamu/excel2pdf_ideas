package com.aspose.cells.a.d;

import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;

public abstract class zhi
{
  private int a;
  private int b;
  private StringBuilder c = new StringBuilder();
  private String d;
  private HashMap e = new HashMap();
  private HashMap f = new HashMap();
  private HashMap g = new HashMap();
  private HashMap h = new HashMap();
  private HashMap i = new HashMap();
  private zar j = new zar();
  
  protected zhi(String paramString)
  {
    this.d = paramString;
  }
  
  public String a(zgs paramzgs)
  {
    String str = c(paramzgs);
    return str;
  }
  
  public zhn a(byte[] paramArrayOfByte)
    throws Exception
  {
    paramArrayOfByte = b(paramArrayOfByte);
    int k = zby.a(paramArrayOfByte);
    zhn localzhn = (zhn)this.e.get(Integer.valueOf(k));
    if (localzhn == null)
    {
      localzhn = new zhn(c(paramArrayOfByte), zcc.b(paramArrayOfByte), paramArrayOfByte);
      this.e.put(Integer.valueOf(k), localzhn);
    }
    return localzhn;
  }
  
  public void a()
    throws Exception
  {}
  
  public String a(String paramString)
  {
    String str = (String)this.i.get(paramString);
    if (str != null) {
      return str;
    }
    str = "bookmark_" + this.a++;
    this.i.put(paramString, str);
    return str;
  }
  
  private byte[] b(byte[] paramArrayOfByte)
    throws Exception
  {
    int k = paramArrayOfByte.hashCode();
    byte[] arrayOfByte = (byte[])this.f.get(Integer.valueOf(k));
    if (arrayOfByte == null)
    {
      arrayOfByte = zho.a(paramArrayOfByte);
      this.f.put(Integer.valueOf(k), arrayOfByte);
    }
    return arrayOfByte;
  }
  
  public String a(zgs paramzgs, String paramString)
  {
    zgw localzgw = b(paramzgs);
    this.c.setLength(0);
    zcd[] arrayOfzcd = zce.a().a(paramString);
    for (int k = 0; k < arrayOfzcd.length; k++) {
      if (localzgw.a(arrayOfzcd[k].a) >= 0)
      {
        String str = zce.a().b(arrayOfzcd[k].a);
        this.c.append(str);
      }
    }
    return zs.a(this.c);
  }
  
  private zgw b(zgs paramzgs)
  {
    String str = c(paramzgs);
    zgw localzgw = (zgw)this.g.get(str);
    if (localzgw == null)
    {
      localzgw = new zgw(paramzgs, false);
      this.g.put(str, localzgw);
    }
    return localzgw;
  }
  
  private String c(byte[] paramArrayOfByte)
    throws Exception
  {
    int k = zcc.a(paramArrayOfByte);
    StringBuilder localStringBuilder = new StringBuilder(16);
    localStringBuilder.append("image");
    localStringBuilder.append(b());
    localStringBuilder.append('.');
    localStringBuilder.append(zcc.a(k));
    String str = zs.a(localStringBuilder);
    return b(str);
  }
  
  private String c(zgs paramzgs)
  {
    String str1 = (String)this.h.get(paramzgs.d());
    if (str1 == null)
    {
      byte[] arrayOfByte = new byte[16];
      zdh.a(c(paramzgs.a()), arrayOfByte, 0);
      zdh.a(paramzgs.f(), arrayOfByte, 4);
      zh localzh = zh.b();
      String str2 = "odttf";
      String str3 = localzh.a("D");
      str1 = b(str3 + "." + str2);
      this.h.put(paramzgs.d(), str1);
    }
    return str1;
  }
  
  private String b(String paramString)
  {
    return zhf.a(this.d, paramString);
  }
  
  private static int c(String paramString)
  {
    int k = 352654597;
    int m = k;
    int n = 0;
    for (int i1 = paramString.length(); i1 > 0; i1 -= 4)
    {
      int i2 = paramString.charAt(n);
      int i3 = 0;
      if (i1 > 1) {
        i3 = paramString.charAt(n + 1);
      }
      int i4 = 0;
      if (i1 > 2) {
        i4 = paramString.charAt(n + 2);
      }
      int i5 = 0;
      if (i1 > 3) {
        i5 = paramString.charAt(n + 3);
      }
      int i6 = i3;
      i6 <<= 16;
      i6 += i2;
      int i7 = i5;
      i7 <<= 16;
      i7 += i4;
      k = (k << 5) + k + (k >> 27) ^ i6;
      if (i1 <= 2) {
        break;
      }
      m = (m << 5) + m + (m >> 27) ^ i7;
      n += 4;
    }
    return k + m * 1566083941;
  }
  
  private int b()
  {
    return ++this.b;
  }
  
  public zar d()
  {
    return this.j;
  }
  
  public HashMap e()
  {
    return this.g;
  }
  
  protected HashMap f()
  {
    return this.e;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */