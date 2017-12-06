package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.zg;
import java.util.List;

class zbxf
  implements zajt
{
  private zje b;
  private zanq c;
  private zbxh d;
  private double e;
  private boolean f;
  private boolean g;
  private double h;
  private double i;
  private boolean j;
  private String k;
  private int l;
  private int m;
  private int n;
  private zqx o;
  private double[] p;
  private double q;
  private boolean r = false;
  private int s;
  private boolean t = false;
  zo a = zo.a();
  private boolean u = false;
  
  zbxf(zje paramzje, zbxh paramzbxh)
  {
    this.b = paramzje;
    this.c = new zanq(paramzje);
    this.c.g().b(2.0D);
    this.d = paramzbxh;
    this.e = 0.0D;
    this.f = false;
    this.g = false;
    this.h = 0.0D;
    this.i = 0.0D;
    this.j = false;
    this.k = "";
    this.l = 2;
    this.m = 2;
    this.n = 0;
    this.o = new zqx(paramzje, this, 16);
  }
  
  zje c()
  {
    return this.b;
  }
  
  zanq d()
  {
    return this.c;
  }
  
  public zaip a()
  {
    return this.c;
  }
  
  zbxh e()
  {
    return this.d;
  }
  
  public double f()
  {
    return this.e;
  }
  
  public void a(double paramDouble)
  {
    this.e = paramDouble;
  }
  
  public boolean g()
  {
    return this.f;
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public boolean h()
  {
    return this.g;
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public double i()
  {
    return this.h;
  }
  
  public void b(double paramDouble)
  {
    this.h = paramDouble;
  }
  
  public double j()
  {
    return this.i;
  }
  
  public void c(double paramDouble)
  {
    this.i = paramDouble;
    this.r = true;
  }
  
  boolean k()
  {
    return this.r;
  }
  
  public boolean l()
  {
    return this.j;
  }
  
  public void c(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public String m()
  {
    if (l())
    {
      zbfc localzbfc = this.d.a();
      switch (p())
      {
      case 1: 
        return "Linear(" + localzbfc.i() + ")";
      case 0: 
        return "Expon.(" + localzbfc.i() + ")";
      case 2: 
        return "Log.(" + localzbfc.i() + ")";
      case 4: 
        return "Poly.(" + localzbfc.i() + ")";
      case 5: 
        return "Power(" + localzbfc.i() + ")";
      case 3: 
        return this.m + " per. Mov. Avg.(" + localzbfc.i() + ")";
      }
      return "";
    }
    return this.k;
  }
  
  public void a(String paramString)
  {
    this.k = paramString;
    c(false);
  }
  
  public int n()
  {
    return this.l;
  }
  
  public void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  public int o()
  {
    return this.m;
  }
  
  public void b(int paramInt)
  {
    this.m = paramInt;
  }
  
  public int p()
  {
    return this.n;
  }
  
  public void d(int paramInt)
  {
    this.n = paramInt;
  }
  
  zqx q()
  {
    return this.o;
  }
  
  public zahx b()
  {
    return this.o;
  }
  
  double[] r()
  {
    return this.p;
  }
  
  void a(double[] paramArrayOfDouble)
  {
    this.p = paramArrayOfDouble;
  }
  
  double s()
  {
    return this.q;
  }
  
  void d(double paramDouble)
  {
    this.q = paramDouble;
  }
  
  int t()
  {
    return e().b().indexOf(this);
  }
  
  public int u()
  {
    return this.s;
  }
  
  public void c(int paramInt)
  {
    this.s = paramInt;
  }
  
  protected void finalize()
    throws Exception
  {
    d(false);
  }
  
  public void dispose()
  {
    d(true);
    zg.a(this);
  }
  
  protected void d(boolean paramBoolean)
  {
    if (!this.u)
    {
      if ((paramBoolean) && (this.o != null)) {
        this.o.dispose();
      }
      this.u = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */