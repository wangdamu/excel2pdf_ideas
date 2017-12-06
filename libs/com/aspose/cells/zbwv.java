package com.aspose.cells;

class zbwv
  implements zajr
{
  private zbt a;
  private com.aspose.cells.b.a.b.zg b;
  private boolean c;
  private Color d;
  private String e;
  private boolean f = true;
  private int g;
  private boolean h = true;
  private int i;
  private boolean j;
  private float k = 0.0F;
  private Font l;
  private boolean m = false;
  private boolean n = false;
  private int o = 0;
  private boolean p = false;
  
  zbwv(zbt paramzbt)
  {
    this.a = paramzbt;
    this.c = true;
    this.d = paramzbt.e().Z().a().a("dk1");
    this.e = "";
    this.g = 100;
    this.i = 0;
  }
  
  zbt g()
  {
    return this.a;
  }
  
  public com.aspose.cells.b.a.b.zg a()
  {
    if (this.b == null)
    {
      this.b = zbxz.a(g().e().ad());
      if (!g().e().aA()) {
        a(this.a.e().j().j());
      }
    }
    return this.b;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.b = paramzg;
  }
  
  public Font h()
  {
    return this.l;
  }
  
  public void a(Font paramFont)
  {
    this.l = paramFont;
  }
  
  public Color i()
  {
    if (this.c)
    {
      if (this.a.e().aA())
      {
        zjf localzjf = this.a.e();
        zsw localzsw;
        if ((this.a.g() == 0) || (this.a.g() == 2)) {
          localzsw = localzjf.az().Q().e().g();
        } else if ((this.a.g() == 1) || (this.a.g() == 3)) {
          localzsw = localzjf.az().Q().C().g();
        } else {
          localzsw = localzjf.az().Q().w().g();
        }
        Color localColor = zbxy.a(localzjf, localzsw);
        if (!localColor.isEmpty()) {
          return localColor;
        }
      }
      if (this.a.e().R() > 40) {
        return this.a.e().Z().a().a("lt1");
      }
      return this.a.e().Z().a().a("dk1");
    }
    return this.d;
  }
  
  public void a(Color paramColor)
  {
    this.c = false;
    this.d = paramColor;
  }
  
  public String b()
  {
    return this.e;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public boolean c()
  {
    return this.f;
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public int d()
  {
    return this.g;
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public int e()
  {
    if (this.h) {
      return 0;
    }
    return this.i;
  }
  
  public void b(int paramInt)
  {
    this.i = paramInt;
    this.h = false;
  }
  
  public boolean j()
  {
    return this.j;
  }
  
  public boolean k()
  {
    return this.h;
  }
  
  public boolean l()
  {
    return this.m;
  }
  
  public void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean m()
  {
    return this.n;
  }
  
  public void c(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  int n()
  {
    if (l()) {
      return 1;
    }
    if (m()) {
      return 2;
    }
    return 0;
  }
  
  public int f()
  {
    return this.o;
  }
  
  public void c(int paramInt)
  {
    this.o = paramInt;
  }
  
  float o()
  {
    return p() + this.k;
  }
  
  float p()
  {
    float f1 = a().h();
    if (f1 <= 1.0F) {
      return -3.0F;
    }
    if (f1 <= 2.0F) {
      return -2.0F;
    }
    if (f1 <= 3.0F) {
      return -1.0F;
    }
    if (f1 <= 5.0F) {
      return 0.0F;
    }
    if (f1 <= 6.0F) {
      return 1.0F;
    }
    if (f1 <= 7.0F) {
      return 2.0F;
    }
    return f1 / 3.0F + (int)(f1 / 10.0F);
  }
  
  float q()
  {
    return s() * d() / 100.0F;
  }
  
  void a(float paramFloat)
  {
    this.k = paramFloat;
  }
  
  private float s()
  {
    float f1 = this.b.d() / 4.0F;
    if (f1 < 3.0F) {
      f1 = 3.0F;
    }
    return f1;
  }
  
  float r()
  {
    return zbxz.a(this.a.e().ap().a().a(a()));
  }
  
  protected void finalize()
    throws Exception
  {
    d(false);
  }
  
  public void dispose()
  {
    d(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void d(boolean paramBoolean)
  {
    if (!this.p)
    {
      if ((paramBoolean) && (this.b != null)) {
        this.b.n();
      }
      this.p = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */