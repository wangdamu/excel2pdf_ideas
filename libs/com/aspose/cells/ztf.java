package com.aspose.cells;

class ztf
{
  String a;
  Object b;
  private zdf e;
  private GlowEffect f;
  ShadowEffect c;
  ReflectionEffect d;
  private int g;
  
  Workbook a()
  {
    if ((this.b instanceof ShapePropertyCollection)) {
      return ((ShapePropertyCollection)this.b).a();
    }
    return ((ShapeFormat)this.b).f;
  }
  
  ztf(Object paramObject)
  {
    this.b = paramObject;
    this.g = -1;
  }
  
  boolean b()
  {
    return (this.e == null) && (!i()) && ((this.d == null) || (this.d.getType() == 0)) && (this.g == -1) && ((this.f == null) || (!this.f.a()));
  }
  
  zdf c()
  {
    if (this.e == null) {
      this.e = new zdf();
    }
    return this.e;
  }
  
  zdf d()
  {
    return this.e;
  }
  
  GlowEffect e()
  {
    if (this.f == null) {
      this.f = new GlowEffect(this);
    }
    return this.f;
  }
  
  void a(GlowEffect paramGlowEffect)
  {
    this.f = paramGlowEffect;
  }
  
  GlowEffect f()
  {
    return this.f;
  }
  
  void g()
  {
    this.c = null;
  }
  
  ShadowEffect h()
  {
    if (this.c == null) {
      this.c = new ShadowEffect(this);
    }
    return this.c;
  }
  
  public boolean i()
  {
    if (this.c == null) {
      return false;
    }
    return this.c.a() != 0;
  }
  
  void j()
  {
    Object localObject = null;
    if ((this.b instanceof ShapePropertyCollection)) {
      localObject = ((ShapePropertyCollection)this.b).a;
    } else {
      localObject = ((ShapeFormat)this.b).g;
    }
    if ((localObject instanceof ChartFrame)) {
      ((ChartFrame)localObject).setShadow(k());
    } else if ((localObject instanceof Series)) {
      ((Series)localObject).setShadow(k());
    } else if ((localObject instanceof ChartPoint)) {
      ((ChartPoint)localObject).setShadow(k());
    }
  }
  
  boolean k()
  {
    if (this.c == null) {
      return false;
    }
    return this.c.a() == 2;
  }
  
  void a(boolean paramBoolean)
  {
    g();
    if (!paramBoolean) {
      return;
    }
    h().a(2);
    zaun localzaun = h().c();
    CellsColor localCellsColor = new CellsColor(a());
    localCellsColor.a.a(2, Color.getBlack().toArgb());
    localzaun.a(localCellsColor);
    localzaun.c = 2700000;
    localzaun.d = 35921;
    localzaun.f = 2;
  }
  
  ReflectionEffect l()
  {
    if (this.d == null) {
      this.d = new ReflectionEffect();
    }
    return this.d;
  }
  
  int m()
  {
    return this.g;
  }
  
  void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public double n()
  {
    return this.g / znq.j;
  }
  
  public void a(double paramDouble)
  {
    this.g = ((int)(paramDouble * znq.j));
  }
  
  void a(ztf paramztf, CopyOptions paramCopyOptions)
  {
    this.a = paramztf.a;
    if (paramztf.a != null) {
      return;
    }
    if (paramztf.e != null)
    {
      this.e = new zdf();
      this.e.a(paramztf.e);
    }
    if (paramztf.f != null)
    {
      this.f = new GlowEffect(this);
      this.f.a(paramztf.f);
    }
    if (paramztf.c != null)
    {
      this.c = new ShadowEffect(this);
      this.c.a(paramztf.c, paramCopyOptions);
    }
    if (paramztf.d != null)
    {
      this.d = new ReflectionEffect();
      this.d.a(paramztf.d);
    }
    this.g = paramztf.g;
  }
  
  boolean a(ztf paramztf)
  {
    if ((this.e != null) || (paramztf.e != null)) {
      if ((this.e != null) && (paramztf.e != null))
      {
        if (!this.e.b(paramztf.e)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.f != null) || (paramztf.f != null)) {
      if ((this.f != null) && (paramztf.f != null))
      {
        if (!this.f.b(paramztf.f)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.c != null) || (paramztf.c != null)) {
      if ((this.c != null) && (paramztf.c != null))
      {
        if (!this.c.a(paramztf.c)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.d != null) || (paramztf.d != null)) {
      if ((this.d != null) && (paramztf.d != null))
      {
        if (!this.d.b(paramztf.d)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return this.g == paramztf.g;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */