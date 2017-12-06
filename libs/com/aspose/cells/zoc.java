package com.aspose.cells;

import com.aspose.cells.a.c.zl;

class zoc
  extends zny
{
  private zaca d;
  private double e;
  private boolean f;
  private boolean g;
  private boolean h;
  
  zoc(zaca paramzaca, zabi paramzabi, double paramDouble)
  {
    super(paramzaca, paramzabi);
    this.d = paramzaca;
    this.e = paramDouble;
    if (zga.a(paramDouble))
    {
      this.g = true;
      this.f = false;
      this.h = false;
    }
    else
    {
      this.g = false;
      if (zga.a(paramDouble, 1.0D))
      {
        this.f = true;
        this.h = false;
      }
      else
      {
        this.f = false;
        this.h = (paramDouble < 0.0D);
      }
    }
  }
  
  zoc(zaca paramzaca, zabi paramzabi)
  {
    super(paramzaca, paramzabi);
    this.d = paramzaca;
    this.g = true;
    this.f = false;
    this.h = false;
  }
  
  public int a()
  {
    return 3;
  }
  
  public zaie b()
  {
    if (this.g) {
      return zabb.a;
    }
    if (this.f) {
      return zabb.b;
    }
    return new zabb(this.e);
  }
  
  public boolean a(zaie paramzaie)
  {
    if (paramzaie.b() == 3) {
      return b(paramzaie);
    }
    if ((this.b) && (paramzaie.b() == 2))
    {
      zabb localzabb = zabt.a(((zabp)paramzaie).o(), this.d);
      if (localzabb != null) {
        return zga.a(localzabb.o(), this.e);
      }
      return false;
    }
    return this.c;
  }
  
  public boolean b(zaie paramzaie)
  {
    return this.a.a(c(paramzaie));
  }
  
  public int c(zaie paramzaie)
  {
    double d1 = ((zabb)paramzaie).o();
    if (zga.a(d1, this.e)) {
      return 0;
    }
    if (d1 > this.e) {
      return 1;
    }
    return -1;
  }
  
  static int a(zaie paramzaie, double paramDouble, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 1: 
      if (a(paramzaca)) {
        return a(((zaba)paramzaie).o() ? 1.0D : 0.0D, paramDouble);
      }
      return 1;
    case 2: 
      if (a(paramzaca)) {
        return a(0.0D, paramDouble);
      }
      return 1;
    case 3: 
      return a(((zabb)paramzaie).o(), paramDouble);
    case 12: 
      if (zga.a(paramDouble)) {
        return 0;
      }
      if (paramDouble > 0.0D) {
        return -1;
      }
      return 1;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to compare with Number: " + paramzaie.b());
    }
    return -1;
  }
  
  static int a(double paramDouble1, double paramDouble2)
  {
    if (zga.a(paramDouble1, paramDouble2)) {
      return 0;
    }
    if (paramDouble1 > paramDouble2) {
      return 1;
    }
    return -1;
  }
  
  static boolean b(zaie paramzaie, double paramDouble, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 1: 
      if (a(paramzaca)) {
        return (((zaba)paramzaie).o() ? 1.0D : 0.0D) == paramDouble;
      }
      return false;
    case 2: 
      if (a(paramzaca)) {
        return paramDouble == 0.0D;
      }
      return false;
    case 3: 
      double d1 = ((zabb)paramzaie).o();
      return (zga.a(d1, paramDouble)) || (Math.abs(d1 - paramDouble) <= 1.0E-16D);
    case 12: 
      return zga.a(paramDouble);
    case 0: 
      return false;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to match Number: " + paramzaie.b());
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zoc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */