package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.g.a.ze;

class zbdc
{
  zq a = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  int b;
  private zg d;
  private zg e;
  private String f = "";
  private Color g;
  private zzo h;
  private int i = 7;
  private ztw j;
  private Bullet k;
  private boolean l = false;
  private int m = -1;
  private zbqv n;
  private zbqv o;
  private zbqv p;
  private int q;
  private int r;
  private double s = 0.0D;
  zbvz c = null;
  
  public int a()
  {
    return this.i;
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  zbdc(String paramString, zg paramzg, Color paramColor, zaid paramzaid, int paramInt1, int paramInt2)
  {
    this.f = paramString;
    this.d = paramzg;
    this.g = paramColor;
    this.b = paramInt1;
    if ((paramInt1 == 2) && ((paramString == null) || ("".equals(paramString)))) {
      this.b = 1;
    }
    a(paramInt2);
    this.h = new zzo();
    this.h.a(paramzaid.a());
    this.h.b(paramzaid.b());
    this.h.c(paramzaid.c());
    this.h.d(paramzaid.d());
    this.h.a(paramzaid.e());
    this.h.f(paramzaid.g());
    this.h.e(paramzaid.f());
    this.h.g(paramzaid.h());
  }
  
  public String b()
  {
    return this.f;
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public zg c()
  {
    return this.d;
  }
  
  public void a(zg paramzg)
  {
    this.d = paramzg;
  }
  
  public Color d()
  {
    return this.g;
  }
  
  public zzo e()
  {
    return this.h;
  }
  
  boolean f()
  {
    return (this.b == 1) && (b() != null) && (b().indexOf('\t') == 0);
  }
  
  boolean g()
  {
    ze localze = new ze("([\\uF020-\\uF0FF]+)");
    boolean bool = localze.d(b());
    return bool;
  }
  
  zg h()
  {
    if (this.e == null) {
      return c();
    }
    return this.e;
  }
  
  void b(zg paramzg)
  {
    this.e = paramzg;
  }
  
  boolean i()
  {
    return this.j != null;
  }
  
  ztw j()
  {
    return this.j;
  }
  
  void a(ztw paramztw)
  {
    this.j = paramztw;
  }
  
  Bullet k()
  {
    if (this.k == null) {
      this.k = new Bullet(null);
    }
    return this.k;
  }
  
  Bullet l()
  {
    return this.k;
  }
  
  boolean m()
  {
    return this.l;
  }
  
  void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  int n()
  {
    return this.m;
  }
  
  void b(int paramInt)
  {
    this.m = paramInt;
  }
  
  zbqv o()
  {
    if (this.n == null) {
      this.n = new zbqv();
    }
    return this.n;
  }
  
  zbqv p()
  {
    return this.n;
  }
  
  zbqv q()
  {
    if (this.o == null) {
      this.o = new zbqv();
    }
    return this.o;
  }
  
  zbqv r()
  {
    return this.o;
  }
  
  zbqv s()
  {
    if (this.p == null) {
      this.p = new zbqv();
    }
    return this.p;
  }
  
  zbqv t()
  {
    return this.p;
  }
  
  int u()
  {
    return this.q;
  }
  
  void c(int paramInt)
  {
    this.q = paramInt;
  }
  
  float v()
  {
    float f1 = (float)(u() / znq.j * zbxp.a() / 72.0D);
    return f1;
  }
  
  int w()
  {
    return this.r;
  }
  
  void d(int paramInt)
  {
    this.r = paramInt;
  }
  
  float x()
  {
    float f1 = (float)(w() / znq.j * zbxp.a() / 72.0D);
    return f1;
  }
  
  void a(zbdc paramzbdc)
  {
    this.l = paramzbdc.l;
    b(paramzbdc.n());
    if (paramzbdc.t() != null) {
      s().a(paramzbdc.s());
    }
    if (paramzbdc.p() != null) {
      o().a(paramzbdc.o());
    }
    if (paramzbdc.r() != null) {
      q().a(paramzbdc.q());
    }
    if (paramzbdc.l() != null) {
      k().a(paramzbdc.l(), null);
    }
    this.q = paramzbdc.q;
    this.r = paramzbdc.r;
    this.s = paramzbdc.s;
    this.c = paramzbdc.c;
  }
  
  static float a(zbqv paramzbqv, float paramFloat)
  {
    float f1 = 0.0F;
    if (paramzbqv.a == 1)
    {
      f1 = paramzbqv.b / 100.0F * zbxp.a() / 72.0F;
    }
    else
    {
      f1 = paramFloat * (paramzbqv.b / 100000.0F);
      if (f1 < 0.0F) {
        f1 = 0.0F;
      }
    }
    return f1;
  }
  
  double y()
  {
    return this.s;
  }
  
  void a(double paramDouble)
  {
    this.s = paramDouble;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */