package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.a.d.zan;
import com.aspose.cells.a.d.zdh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;

public class zas
{
  private zcjz b;
  private StringBuilder c;
  
  public zas(zm paramzm, Encoding paramEncoding, boolean paramBoolean)
    throws Exception
  {
    if (paramEncoding.i() == 65000)
    {
      if ((!a) && (!"utf-7".equals(paramEncoding.a()))) {
        throw new AssertionError();
      }
      byte[] arrayOfByte = paramEncoding.g();
      if (arrayOfByte.length == 0)
      {
        arrayOfByte = zan.a();
        paramzm.b(arrayOfByte, 0, arrayOfByte.length);
      }
    }
    this.b = zauy.a(paramzm, paramEncoding);
    this.c = new StringBuilder(2048);
    this.b.d(false);
    if (paramBoolean)
    {
      this.b.a(1);
      this.b.b(1);
      this.b.a('\t');
    }
  }
  
  public zas(zm paramzm, boolean paramBoolean)
    throws Exception
  {
    this(paramzm, Encoding.getUTF8(), paramBoolean);
  }
  
  public zcjz a()
  {
    return this.b;
  }
  
  public void a(String paramString)
    throws Exception
  {
    this.b.b(true);
    b(paramString);
  }
  
  public void b()
    throws Exception
  {
    this.b.b();
    this.b.d();
    this.b.e();
  }
  
  public void b(String paramString)
    throws Exception
  {
    this.b.b(paramString);
  }
  
  public void c()
    throws Exception
  {
    this.b.b();
  }
  
  public void a(String paramString1, String paramString2)
    throws Exception
  {
    b(paramString1);
    c(paramString2);
    c();
  }
  
  public void b(String paramString1, String paramString2)
    throws Exception
  {
    if (zdh.a(paramString2)) {
      a(paramString1, paramString2);
    }
  }
  
  public void a(String paramString, DateTime paramDateTime)
    throws Exception
  {
    if (paramDateTime.getYear() > 1) {
      a(paramString, zp.a(paramDateTime));
    }
  }
  
  public void c(String paramString)
    throws Exception
  {
    this.b.a(d(paramString));
  }
  
  public void c(String paramString1, String paramString2)
    throws Exception
  {
    this.b.a(paramString1, d(paramString2));
  }
  
  public String d(String paramString)
  {
    if (!e(paramString)) {
      return paramString;
    }
    this.c.setLength(0);
    for (int i = 0; i < paramString.length(); i++)
    {
      char c1 = paramString.charAt(i);
      if (a(c1)) {
        this.c.append(c1);
      }
    }
    return zs.a(this.c);
  }
  
  private static boolean e(String paramString)
  {
    if (!zdh.a(paramString)) {
      return false;
    }
    for (int i = 0; i < paramString.length(); i++) {
      if (!a(paramString.charAt(i))) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean a(char paramChar)
  {
    return (paramChar == '\t') || (paramChar == '\n') || (paramChar == '\r') || ((paramChar >= ' ') && (paramChar <= 55295)) || ((paramChar >= 57344) && (paramChar <= 65533));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */