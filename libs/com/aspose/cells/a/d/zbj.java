package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zv;
import java.util.HashMap;

public class zbj
{
  public float a;
  private int b;
  private zg c;
  private zgs d;
  private float e;
  private float f;
  private float g;
  private static zv h;
  private static HashMap i = new HashMap();
  private String j = "";
  private static HashMap k = new HashMap();
  
  public zbj(String paramString, float paramFloat, int paramInt)
    throws Exception
  {
    this.b = paramInt;
    this.a = paramFloat;
    this.d = zav.a().b(paramString, paramInt, false);
    this.j = paramString;
    float f1 = this.d.a(this.d.x(), paramFloat);
    if (f1 < Float.MIN_VALUE)
    {
      this.e = this.d.a(paramFloat);
      this.f = (this.e * 0.8F);
      this.g = (this.e * 0.2F);
    }
    else
    {
      this.e = this.d.a(paramFloat);
      this.f = this.d.a(this.d.h(), paramFloat);
      this.g = this.d.a(this.d.i(), paramFloat);
    }
  }
  
  public String a()
  {
    return this.j;
  }
  
  public float b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public boolean d()
  {
    return (c() & 0x1) != 0;
  }
  
  public boolean e()
  {
    return (c() & 0x2) != 0;
  }
  
  public boolean f()
  {
    return (c() & 0x8) != 0;
  }
  
  public boolean g()
  {
    return (c() & 0x4) != 0;
  }
  
  public float h()
  {
    return this.f;
  }
  
  public float i()
  {
    return this.g;
  }
  
  public zgs j()
  {
    return this.d;
  }
  
  public zg k()
  {
    return a(false);
  }
  
  public zg a(boolean paramBoolean)
  {
    int m = c();
    if (!paramBoolean) {
      m = c() & 0xB;
    }
    if (this.c == null)
    {
      try
      {
        this.c = new zg(a(), this.a, m, 3, (byte)Byte.MIN_VALUE, true);
      }
      catch (Exception localException1) {}
      if (this.c == null) {
        try
        {
          this.c = new zg(a(), this.a, 0);
        }
        catch (Exception localException2) {}
      }
      if (this.c == null) {
        try
        {
          this.c = new zg(a(), this.a, 1);
        }
        catch (Exception localException3) {}
      }
      if (this.c == null) {
        try
        {
          this.c = new zg(a(), this.a, 2);
        }
        catch (Exception localException4) {}
      }
      if (this.c == null) {
        this.c = new zg("Arial", this.a, c());
      }
    }
    return this.c;
  }
  
  public static zt a(String paramString, zbj paramzbj)
  {
    float f1 = paramzbj.j().a(paramzbj.j().x(), paramzbj.a);
    float f2 = paramzbj.j().c(paramString, paramzbj.a);
    return new zt(f2, f1);
  }
  
  public static zt b(String paramString, zbj paramzbj)
    throws Exception
  {
    float f1 = paramzbj.j().a(paramzbj.j().x(), paramzbj.a);
    float f2 = paramzbj.j().a(paramString, paramzbj.a);
    return new zt(f2, f1);
  }
  
  public static void l()
  {
    synchronized (k)
    {
      k.clear();
    }
  }
  
  public static zbj a(String paramString, float paramFloat, int paramInt)
    throws Exception
  {
    String str1 = paramString + paramInt;
    String str2 = (String)k.get(str1);
    if ((str2 == null) || (str2.length() == 0)) {
      synchronized (k)
      {
        str2 = (String)k.get(str1);
        if ((str2 == null) || (str2.length() == 0))
        {
          localObject1 = zav.a().b(paramString, paramInt, false);
          str2 = ((zgs)localObject1).a();
          k.put(str1, str2);
        }
      }
    }
    int m = b(str2, paramFloat, paramInt);
    Object localObject1 = (zbj)i.get(Integer.valueOf(m));
    if (localObject1 == null) {
      synchronized (i)
      {
        localObject1 = (zbj)i.get(Integer.valueOf(m));
        if (localObject1 == null)
        {
          localObject1 = new zbj(str2, paramFloat, paramInt);
          i.put(Integer.valueOf(m), localObject1);
        }
      }
    }
    return (zbj)localObject1;
  }
  
  private static int b(String paramString, float paramFloat, int paramInt)
  {
    return paramString.hashCode() ^ new Float(paramFloat).hashCode() ^ paramInt;
  }
  
  static
  {
    h = new zv(zv.c());
    h.b(h.d() | 0x800);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */