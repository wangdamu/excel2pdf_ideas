package com.aspose.cells;

class zanq
  implements zaip
{
  private zje a;
  private Color b;
  private zanz c;
  private int d = 1;
  private boolean e = true;
  private zaml f;
  
  zanq(zje paramzje)
  {
    this.a = paramzje;
    this.b = Color.getBlack();
    this.c = new zanz();
  }
  
  public zaih d()
  {
    return null;
  }
  
  public Color a()
  {
    if (this.d == 0) {
      return Color.getEmpty();
    }
    return this.b;
  }
  
  public void a(Color paramColor)
  {
    this.b = paramColor;
  }
  
  public void a(zaml paramzaml)
  {
    this.f = paramzaml;
  }
  
  public boolean e()
  {
    return this.d != 0;
  }
  
  boolean f()
  {
    if (!e()) {
      return false;
    }
    if (b().a() <= 0.0D) {
      return false;
    }
    return (!a().isEmpty()) && (a().getA() != 0);
  }
  
  zanz g()
  {
    return this.c;
  }
  
  public zaiq b()
  {
    return this.c;
  }
  
  double h()
  {
    if (c() == 0) {
      return 0.0D;
    }
    return this.c.a();
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public boolean i()
  {
    return this.e;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  void b(Color paramColor)
  {
    if ((this.d == 1) || ((i()) && (c() != 0))) {
      a(paramColor);
    }
  }
  
  public boolean a(zanq paramzanq)
  {
    if (e() != paramzanq.e()) {
      return false;
    }
    if ((e()) && (paramzanq.e()))
    {
      if (c() != paramzanq.c()) {
        return false;
      }
      if (b().b() != paramzanq.b().b()) {
        return false;
      }
      if (!a().equals(paramzanq.a())) {
        return false;
      }
      if (b().a() != paramzanq.b().a()) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zanq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */