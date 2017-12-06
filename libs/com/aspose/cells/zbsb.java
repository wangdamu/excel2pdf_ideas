package com.aspose.cells;

abstract class zbsb
  implements zaji
{
  protected boolean c;
  protected boolean d;
  protected boolean e;
  
  public zbsb(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
  }
  
  protected abstract zaie a(double paramDouble);
  
  protected abstract zaie a(double paramDouble, int paramInt);
  
  protected abstract zaie a(int paramInt);
  
  protected abstract zaie c();
  
  protected abstract boolean b();
  
  protected boolean c_()
  {
    return false;
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    if (paramzaie.b() == 12)
    {
      if (paramBoolean)
      {
        if (this.d) {
          return b();
        }
        return true;
      }
      if (c_()) {
        return true;
      }
      return b();
    }
    if ((paramzaie.b() == 3) && (((zabb)paramzaie).q())) {
      return b();
    }
    return false;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 12: 
      if (paramBoolean)
      {
        if (this.d) {
          return c();
        }
        return zaba.b;
      }
      if (c_()) {
        return zaba.b;
      }
      return c();
    case 3: 
      return a(((zabb)paramzaie).o());
    case 0: 
      if (this.e) {
        return zaba.b;
      }
      return paramzaie;
    case 1: 
      if (this.d) {
        return zabc.f;
      }
      if ((this.c) || (!paramBoolean))
      {
        if (((zaba)paramzaie).o()) {
          return a(1.0D);
        }
        return c();
      }
      return zaba.b;
    }
    if (this.d)
    {
      localzabb = paramzaie.a(paramzaca, 5);
      if (localzabb == null) {
        return zabc.f;
      }
      return a(localzabb.o());
    }
    if (paramBoolean)
    {
      if (this.c) {
        return c();
      }
      return zaba.b;
    }
    zabb localzabb = paramzaie.a(paramzaca, 7);
    if (localzabb == null) {
      return zabc.f;
    }
    return a(localzabb.o());
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 12: 
      if (paramBoolean)
      {
        if (this.d) {
          return a(paramInt);
        }
        return zaba.b;
      }
      return a(paramInt);
    case 3: 
      return a(((zabb)paramzaie).o(), paramInt);
    case 0: 
      if (this.e) {
        return zaba.b;
      }
      return paramzaie;
    case 1: 
      if (this.d) {
        return zabc.f;
      }
      if ((this.c) || (!paramBoolean))
      {
        if (((zaba)paramzaie).o()) {
          return a(1.0D, paramInt);
        }
        return a(paramInt);
      }
      return zaba.b;
    }
    if (this.d)
    {
      localzabb = paramzaie.a(paramzaca, 5);
      if (localzabb == null) {
        return zabc.f;
      }
      return a(localzabb.o());
    }
    if (paramBoolean)
    {
      if (this.c) {
        return a(paramInt);
      }
      return zaba.b;
    }
    zabb localzabb = paramzaie.a(paramzaca, 7);
    if (localzabb == null) {
      return zabc.f;
    }
    return a(localzabb.o());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */