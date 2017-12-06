package com.aspose.cells;

import com.aspose.cells.b.a.zg;

class zay
  implements zagu
{
  private zje b;
  private Color c;
  private zxg d;
  private Color e;
  private int f;
  private boolean g;
  boolean a;
  private zaml h;
  private zaml i;
  private boolean j = false;
  private boolean k = false;
  
  zay(zje paramzje)
  {
    this.b = paramzje;
    this.e = Color.getWhite();
    this.c = Color.getWhite();
    this.g = false;
    this.a = true;
    this.f = 1;
    this.d = new zxg(this);
  }
  
  public boolean a()
  {
    return this.g;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    this.a = false;
  }
  
  public Color b()
  {
    if (this.f == 0) {
      return Color.getEmpty();
    }
    return this.c;
  }
  
  public void a(Color paramColor)
  {
    this.c = paramColor;
  }
  
  public void a(zaml paramzaml)
  {
    this.h = paramzaml;
  }
  
  public void b(zaml paramzaml)
  {
    this.i = paramzaml;
  }
  
  zxg c()
  {
    return this.d;
  }
  
  public zaib d()
  {
    return this.d;
  }
  
  public Color e()
  {
    if (this.f == 0) {
      return Color.getEmpty();
    }
    return this.e;
  }
  
  public void b(Color paramColor)
  {
    this.e = paramColor;
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  void c(Color paramColor)
  {
    if (this.f == 1) {
      b(paramColor);
    }
  }
  
  boolean f()
  {
    return (this.f == 3) || (this.f == 5) || (this.f == 4);
  }
  
  boolean g()
  {
    if (f()) {
      return false;
    }
    if (this.f == 0) {
      return true;
    }
    return (this.e.getA() & 0xFF) <= 250;
  }
  
  public int h()
  {
    return this.f;
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public boolean a(zay paramzay)
  {
    if ((!f()) && (!paramzay.f()))
    {
      if (h() != paramzay.h()) {
        return false;
      }
      if (!b().equals(paramzay.b())) {
        return false;
      }
      if (!e().equals(paramzay.e())) {
        return false;
      }
    }
    else
    {
      if (f() != paramzay.f()) {
        return false;
      }
      return c().a(paramzay.c());
    }
    return true;
  }
  
  protected void finalize()
    throws Exception
  {
    c(false);
  }
  
  public void dispose()
  {
    c(true);
    zg.a(this);
  }
  
  protected void c(boolean paramBoolean)
  {
    if (!this.k)
    {
      if ((paramBoolean) && (this.d != null)) {
        this.d.dispose();
      }
      this.k = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */