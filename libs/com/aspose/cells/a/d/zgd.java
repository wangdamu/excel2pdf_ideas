package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.DateTime;
import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

public class zgd
{
  private zm a;
  private zfq b;
  
  public zgd(zm paramzm)
  {
    if (paramzm == null) {
      throw new IllegalArgumentException("stream");
    }
    this.a = paramzm;
  }
  
  public zm d()
  {
    return this.a;
  }
  
  public void e()
    throws Exception
  {
    this.a.a();
  }
  
  public void a(byte paramByte)
    throws Exception
  {
    this.a.a(paramByte);
  }
  
  public void a(String paramString)
    throws Exception
  {
    for (int i = 0; i < paramString.length(); i++) {
      this.a.a((byte)paramString.charAt(i));
    }
  }
  
  public void a(byte[] paramArrayOfByte)
    throws Exception
  {
    for (int k : paramArrayOfByte) {
      a(com.aspose.cells.a.c.zp.b(k & 0xFF));
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    this.a.b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void b(String paramString)
    throws Exception
  {
    a(paramString);
    a(" ");
  }
  
  public void f()
    throws Exception
  {
    a("\r\n");
  }
  
  public void c(String paramString)
    throws Exception
  {
    a(paramString);
    f();
  }
  
  public void g()
    throws Exception
  {
    a("<<");
  }
  
  public void h()
    throws Exception
  {
    a(">>");
  }
  
  public void a(String paramString1, String paramString2)
    throws Exception
  {
    if ((paramString2 == null) || (zw.b(paramString2, ""))) {
      return;
    }
    a(paramString1);
    a(" ");
    a(paramString2);
    a(" ");
  }
  
  public void b(String paramString1, String paramString2)
    throws Exception
  {
    if ((paramString2 == null) || (zw.b(paramString2, ""))) {
      return;
    }
    a(paramString1);
    byte[] arrayOfByte;
    if (i() == null)
    {
      a("(");
      arrayOfByte = Encoding.getUTF8().a(paramString2);
      a(arrayOfByte, 0, arrayOfByte.length);
      a(")");
    }
    else
    {
      a("<");
      arrayOfByte = i().d(paramString2);
      a(arrayOfByte);
      a(">");
    }
  }
  
  public void c(String paramString1, String paramString2)
    throws Exception
  {
    if ((paramString2 == null) || (zw.b(paramString2, ""))) {
      return;
    }
    a(paramString1);
    if (i() == null)
    {
      a("(");
      a((byte)-2);
      a((byte)-1);
      for (int i = 0; i < paramString2.length(); i++)
      {
        int j = paramString2.charAt(i);
        b((byte)(j >> 8 & 0xFF));
        b((byte)(j & 0xFF));
      }
      a(")");
    }
    else
    {
      a("<");
      byte[] arrayOfByte = i().c(paramString2);
      a(arrayOfByte);
      a(">");
    }
  }
  
  public void a(String paramString, zq paramzq)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    a(paramzq, localStringBuilder);
    a(paramString, zs.a(localStringBuilder));
  }
  
  public void a(String paramString, DateTime paramDateTime)
    throws Exception
  {
    if (DateTime.a(paramDateTime, DateTime.a)) {
      return;
    }
    StringBuilder localStringBuilder;
    if (i() == null)
    {
      localStringBuilder = new StringBuilder(16);
      a(paramDateTime, localStringBuilder);
      a(paramString, zs.a(localStringBuilder));
    }
    else
    {
      localStringBuilder = new StringBuilder(16);
      b(paramDateTime, localStringBuilder);
      a(paramString);
      a("<");
      byte[] arrayOfByte = i().d(zs.a(localStringBuilder));
      a(arrayOfByte);
      a(">");
    }
  }
  
  public void a(String paramString, int paramInt)
    throws Exception
  {
    a(paramString, com.aspose.cells.b.a.zp.a(paramInt));
  }
  
  public void a(String paramString, float paramFloat)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(16);
    a(paramFloat, localStringBuilder);
    a(paramString, zs.a(localStringBuilder));
  }
  
  public void d(String paramString)
    throws Exception
  {
    for (int i = 0; i < paramString.length(); i++) {
      b((byte)paramString.charAt(i));
    }
  }
  
  public void b(byte[] paramArrayOfByte)
    throws Exception
  {
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      b(paramArrayOfByte[i]);
    }
  }
  
  public void b(byte paramByte)
    throws Exception
  {
    switch (paramByte)
    {
    case 40: 
    case 41: 
    case 92: 
      a((byte)92);
      a(paramByte);
      break;
    case 13: 
      a("\\015");
      break;
    default: 
      a(paramByte);
    }
  }
  
  public static void a(DateTime paramDateTime, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("(D:");
    com.aspose.cells.a.c.zp.a(paramDateTime, paramStringBuilder);
    paramStringBuilder.append(')');
  }
  
  public static void b(DateTime paramDateTime, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("D:");
    com.aspose.cells.a.c.zp.a(paramDateTime, paramStringBuilder);
  }
  
  public static void a(zo paramzo, StringBuilder paramStringBuilder)
  {
    a(paramzo.d(), paramStringBuilder);
    paramStringBuilder.append(' ');
    a(paramzo.e(), paramStringBuilder);
  }
  
  public static void a(zo[] paramArrayOfzo, StringBuilder paramStringBuilder)
  {
    a(paramArrayOfzo[0], paramStringBuilder);
    for (int i = 1; i < paramArrayOfzo.length; i++)
    {
      paramStringBuilder.append(' ');
      a(paramArrayOfzo[i], paramStringBuilder);
    }
  }
  
  public static void a(zq paramzq, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append('[');
    a(paramzq.j(), paramStringBuilder);
    paramStringBuilder.append(' ');
    a(paramzq.k(), paramStringBuilder);
    paramStringBuilder.append(' ');
    a(paramzq.l(), paramStringBuilder);
    paramStringBuilder.append(' ');
    a(paramzq.m(), paramStringBuilder);
    paramStringBuilder.append(']');
  }
  
  public static void a(float paramFloat, StringBuilder paramStringBuilder)
  {
    com.aspose.cells.a.c.zp.a(paramFloat, 4, paramStringBuilder);
  }
  
  public static void a(float[] paramArrayOfFloat, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("[");
    a(paramArrayOfFloat[0], paramStringBuilder);
    for (int i = 1; i < paramArrayOfFloat.length; i++)
    {
      paramStringBuilder.append(' ');
      a(paramArrayOfFloat[i], paramStringBuilder);
    }
    paramStringBuilder.append("]");
  }
  
  public static void a(Color paramColor, StringBuilder paramStringBuilder)
  {
    a((paramColor.getR() & 0xFF) / 255.0F, paramStringBuilder);
    paramStringBuilder.append(' ');
    a((paramColor.getG() & 0xFF) / 255.0F, paramStringBuilder);
    paramStringBuilder.append(' ');
    a((paramColor.getB() & 0xFF) / 255.0F, paramStringBuilder);
  }
  
  public zfq i()
  {
    return this.b;
  }
  
  public void a(zfq paramzfq)
  {
    this.b = paramzfq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */