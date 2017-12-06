package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.zw;

class zsl
{
  private boolean a;
  private String b;
  private int c;
  private int d;
  private zgs e;
  
  public zsl(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, zsl paramzsl)
  {
    this.b = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
    this.a = paramBoolean;
    if ((paramzsl != null) && (zw.b(paramString, paramzsl.b)) && (paramInt2 == paramzsl.d)) {
      this.e = paramzsl.e;
    }
  }
  
  public zsl(String paramString, int paramInt1, int paramInt2, zgs paramzgs)
  {
    this.b = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
    this.a = false;
    this.e = paramzgs;
  }
  
  public boolean a(zsl paramzsl)
  {
    return (this == paramzsl) || ((this.c == paramzsl.c) && (this.d == paramzsl.d) && (zw.b(this.b, paramzsl.b)));
  }
  
  public boolean a(String paramString, int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.c) && (paramInt2 == this.d) && (zw.b(paramString, this.b));
  }
  
  public boolean a(String paramString, int paramInt)
  {
    return (paramInt == this.d) && (zw.b(paramString, this.b));
  }
  
  public double a(String paramString)
  {
    return a(paramString, false, 1.0D);
  }
  
  public double a(String paramString, boolean paramBoolean, double paramDouble)
  {
    float f;
    if (paramBoolean) {
      f = zauu.a(this.c, (float)paramDouble);
    } else {
      f = this.c;
    }
    if (this.e != null) {
      return zn.a(paramString, this.e, f, paramBoolean);
    }
    if (this.a)
    {
      this.e = zn.a(this.b, this.d);
      if (this.e == null)
      {
        if (zl.a()) {
          zl.a("Cannot find font: " + this.b);
        }
        return paramString.length();
      }
      return zn.a(paramString, this.e, f, paramBoolean);
    }
    zgs localzgs = zn.a(this.b, this.d);
    return zn.a(paramString, localzgs, f, paramBoolean);
  }
  
  public double a(char paramChar)
  {
    return a(paramChar, false, 1.0D);
  }
  
  public double a(char paramChar, boolean paramBoolean, double paramDouble)
  {
    float f;
    if (paramBoolean) {
      f = zauu.a(this.c, (float)paramDouble);
    } else {
      f = this.c;
    }
    if (this.e != null) {
      return zn.a(paramChar, this.e, f, paramBoolean);
    }
    if (this.a)
    {
      this.e = zn.a(this.b, this.d);
      if (this.e == null)
      {
        if (zl.a()) {
          zl.a("Cannot find font: " + this.b);
        }
        return 1.0D;
      }
      return zn.a(paramChar, this.e, f, paramBoolean);
    }
    zgs localzgs = zn.a(this.b, this.d);
    return zn.a(paramChar, localzgs, f, paramBoolean);
  }
  
  public double a(boolean paramBoolean, double paramDouble)
  {
    return a("0123456789", paramBoolean, paramDouble) / 10.0D;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public zgs d()
  {
    return this.e;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */