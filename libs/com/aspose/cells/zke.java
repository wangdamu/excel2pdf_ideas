package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.List;

class zke
  implements zahn
{
  private zkg f;
  private zje g;
  private zay h;
  private zanq i;
  private zaor j;
  private zqx k;
  private double l;
  private Object m;
  private double n;
  private Object o;
  private double p;
  private String q;
  private String r;
  private String s;
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w = false;
  private boolean x = false;
  private boolean y = false;
  private boolean z = false;
  private boolean A = false;
  private boolean B = false;
  private int C = 6;
  private boolean D = false;
  private double E;
  private int F = 6;
  private double G;
  float a = 0.0F;
  private float H = 0.0F;
  private boolean I = true;
  private boolean J = false;
  private zq K = zq.c();
  private float L;
  private float M;
  private float N;
  ArrayList b = new ArrayList();
  ArrayList c = new ArrayList();
  ArrayList d = new ArrayList();
  boolean e = false;
  private boolean O = false;
  
  public boolean a()
  {
    return this.y;
  }
  
  public void a(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  public boolean b()
  {
    return this.z;
  }
  
  public void b(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public boolean c()
  {
    return this.A;
  }
  
  public void c(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public boolean d()
  {
    return this.w;
  }
  
  public void d(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public boolean e()
  {
    return this.x;
  }
  
  public void e(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  
  zke(zje paramzje)
  {
    this.g = paramzje;
    this.h = new zay(paramzje);
    this.i = new zanq(paramzje);
    this.j = new zaor(paramzje, this);
    this.k = new zqx(paramzje, this, 12);
  }
  
  void f()
  {
    if ((this.f == null) || (this.f.a() == null)) {
      return;
    }
    if (this.f.a().m() == 60) {
      this.i.a(0);
    }
  }
  
  zke(zje paramzje, double paramDouble)
  {
    this(paramzje);
    this.n = paramDouble;
  }
  
  zkg g()
  {
    return this.f;
  }
  
  void a(zkg paramzkg)
  {
    this.f = paramzkg;
  }
  
  zje h()
  {
    return this.g;
  }
  
  zay i()
  {
    return this.h;
  }
  
  public zagu j()
  {
    return this.h;
  }
  
  zanq k()
  {
    return this.i;
  }
  
  public zaip l()
  {
    return this.i;
  }
  
  zaor m()
  {
    return this.j;
  }
  
  public zair n()
  {
    return this.j;
  }
  
  zqx o()
  {
    return this.k;
  }
  
  public zahx p()
  {
    return this.k;
  }
  
  public double q()
  {
    return this.l;
  }
  
  public void a(double paramDouble)
  {
    this.l = paramDouble;
  }
  
  public int r()
  {
    return this.C;
  }
  
  public void a(int paramInt)
  {
    this.C = paramInt;
  }
  
  public Object s()
  {
    if (this.m == null) {
      return Double.valueOf(q());
    }
    return this.m;
  }
  
  public void a(Object paramObject)
  {
    this.m = paramObject;
    this.D = true;
  }
  
  public boolean t()
  {
    return this.D;
  }
  
  void b(double paramDouble)
  {
    this.E = paramDouble;
  }
  
  public String u()
  {
    return this.q;
  }
  
  public void a(String paramString)
  {
    this.q = paramString;
  }
  
  public boolean v()
  {
    return this.t;
  }
  
  public void f(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public double w()
  {
    return this.n;
  }
  
  public void c(double paramDouble)
  {
    this.n = paramDouble;
  }
  
  public int x()
  {
    return this.F;
  }
  
  public void b(int paramInt)
  {
    this.F = paramInt;
  }
  
  public Object y()
  {
    return this.o;
  }
  
  public void b(Object paramObject)
  {
    this.o = paramObject;
  }
  
  double z()
  {
    return this.G;
  }
  
  void d(double paramDouble)
  {
    this.G = paramDouble;
  }
  
  public String A()
  {
    return this.r;
  }
  
  public void b(String paramString)
  {
    this.r = paramString;
  }
  
  public boolean B()
  {
    return this.u;
  }
  
  public void g(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }
  
  public double C()
  {
    return this.p;
  }
  
  public void e(double paramDouble)
  {
    this.p = paramDouble;
  }
  
  public String D()
  {
    return this.s;
  }
  
  public void c(String paramString)
  {
    this.s = paramString;
  }
  
  public boolean E()
  {
    return this.v;
  }
  
  public void h(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public float F()
  {
    if (this.I) {
      return this.f.a().ay();
    }
    return this.H;
  }
  
  public void a(float paramFloat)
  {
    this.H = paramFloat;
    this.I = false;
  }
  
  public boolean G()
  {
    return this.J;
  }
  
  public void i(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public boolean H()
  {
    return this.B;
  }
  
  public void j(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  int I()
  {
    return g().c().indexOf(this);
  }
  
  boolean J()
  {
    return (e()) && (y() != null) && ("#N/A".equals(zs.a(y())));
  }
  
  zq K()
  {
    return this.K;
  }
  
  void a(zq paramzq)
  {
    this.K = paramzq;
  }
  
  float L()
  {
    return this.L;
  }
  
  void b(float paramFloat)
  {
    this.L = paramFloat;
  }
  
  float M()
  {
    return this.M;
  }
  
  void c(float paramFloat)
  {
    this.M = paramFloat;
  }
  
  float N()
  {
    return this.N;
  }
  
  void d(float paramFloat)
  {
    this.N = paramFloat;
  }
  
  protected void finalize()
    throws Exception
  {
    k(false);
  }
  
  public void dispose()
  {
    k(true);
    zg.a(this);
  }
  
  protected void k(boolean paramBoolean)
  {
    if (!this.O)
    {
      if (paramBoolean)
      {
        if (this.k != null) {
          this.k.dispose();
        }
        if (this.h != null) {
          this.h.dispose();
        }
        if (this.j != null) {
          this.j.dispose();
        }
      }
      this.O = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */