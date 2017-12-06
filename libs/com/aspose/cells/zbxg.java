package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.zg;

class zbxg
  implements zajt
{
  private zanr b;
  private zbxi c;
  private double d;
  private boolean e;
  private boolean f;
  private double g;
  private double h;
  private boolean i;
  private String j;
  private int k;
  private int l;
  private int m;
  private zqy n;
  private double[] o;
  private double p;
  private boolean q = false;
  private zbda r = new zbda();
  private boolean s = false;
  private int t;
  private boolean u = false;
  zo a = zo.a();
  private boolean v = false;
  
  zbxg(zjf paramzjf, zbxi paramzbxi)
  {
    this.b = new zanr(paramzjf, 19);
    this.c = paramzbxi;
    this.d = 0.0D;
    this.e = false;
    this.f = false;
    this.g = 0.0D;
    this.h = 0.0D;
    this.i = false;
    this.j = "";
    this.k = 2;
    this.l = 2;
    this.m = 0;
    this.n = new zqy(paramzjf, this, 16);
  }
  
  zbxi c()
  {
    return this.c;
  }
  
  zanr d()
  {
    return this.b;
  }
  
  public zaip a()
  {
    return this.b;
  }
  
  public double e()
  {
    return this.d;
  }
  
  public void a(double paramDouble)
  {
    this.d = paramDouble;
  }
  
  public boolean f()
  {
    return this.e;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public boolean g()
  {
    return this.f;
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public double h()
  {
    return this.g;
  }
  
  public void b(double paramDouble)
  {
    this.g = paramDouble;
  }
  
  public double i()
  {
    return this.h;
  }
  
  public void c(double paramDouble)
  {
    this.h = paramDouble;
    this.q = true;
  }
  
  boolean j()
  {
    return this.q;
  }
  
  public boolean k()
  {
    return this.i;
  }
  
  public void c(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public String l()
  {
    if (k())
    {
      zbfd localzbfd = this.c.a();
      switch (q())
      {
      case 1: 
        return "Linear(" + localzbfd.i() + ")";
      case 0: 
        return "Expon.(" + localzbfd.i() + ")";
      case 2: 
        return "Log.(" + localzbfd.i() + ")";
      case 4: 
        return "Poly.(" + localzbfd.i() + ")";
      case 5: 
        return "Power(" + localzbfd.i() + ")";
      case 3: 
        return this.l + " per. Mov. Avg.(" + localzbfd.i() + ")";
      }
      return "";
    }
    return this.j;
  }
  
  public void a(String paramString)
  {
    this.j = paramString;
    c(false);
  }
  
  public zaiz m()
  {
    return this.r;
  }
  
  boolean n()
  {
    return this.r.getCount() > 0;
  }
  
  public int o()
  {
    return this.k;
  }
  
  public void a(int paramInt)
  {
    this.k = paramInt;
  }
  
  public int p()
  {
    return this.l;
  }
  
  public void b(int paramInt)
  {
    this.l = paramInt;
  }
  
  public int q()
  {
    return this.m;
  }
  
  public void d(int paramInt)
  {
    this.m = paramInt;
  }
  
  zqy r()
  {
    return this.n;
  }
  
  public zahx b()
  {
    return this.n;
  }
  
  double[] s()
  {
    return this.o;
  }
  
  void a(double[] paramArrayOfDouble)
  {
    this.o = paramArrayOfDouble;
  }
  
  double t()
  {
    return this.p;
  }
  
  void d(double paramDouble)
  {
    this.p = paramDouble;
  }
  
  public int u()
  {
    return this.t;
  }
  
  public void c(int paramInt)
  {
    this.t = paramInt;
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
    if (!this.v)
    {
      if ((paramBoolean) && (this.n != null)) {
        this.n.dispose();
      }
      this.v = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */