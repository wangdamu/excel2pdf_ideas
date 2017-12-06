package com.aspose.cells;

class zabu
{
  zaie a;
  zajg b;
  zagw c;
  
  void a()
  {
    this.a = null;
    this.b = null;
    this.c = null;
  }
  
  void a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.a = null;
    if (this.b != null)
    {
      zajg localzajg = this.b.d(paramzaca);
      if (this.b != localzajg)
      {
        localzajg.a(true);
        this.b = localzajg;
      }
      this.b.a(paramzaca);
    }
    if (this.c != null) {
      this.c.a(paramzaca);
    }
  }
  
  zabu b()
  {
    zabu localzabu = new zabu();
    if (this.a != null) {
      localzabu.a = this.a.m();
    }
    if (this.b != null)
    {
      this.b.a(false);
      localzabu.b = this.b;
    }
    if (this.c != null)
    {
      this.c.a(false);
      localzabu.c = this.c;
    }
    return localzabu;
  }
  
  void c()
  {
    if (this.b != null) {
      this.b.a(true);
    }
    if (this.c != null) {
      this.c.a(true);
    }
  }
  
  zaiw a(zaiw paramzaiw, zaca paramzaca)
  {
    switch (paramzaca.m)
    {
    case 3: 
      if (paramzaiw.A()) {
        paramzaiw = zbam.a(paramzaiw, paramzaca);
      }
      this.b = paramzaiw;
      return paramzaiw;
    case 1: 
      if (paramzaca.l.f() > 1)
      {
        if (paramzaiw.A()) {
          paramzaiw = zbam.a(paramzaiw, paramzaca);
        }
        if (paramzaca.l.g() > 1)
        {
          if (this.b == null) {
            this.b = new zbou(paramzaca, false);
          }
          this.b.a(paramzaca, paramzaiw);
        }
        else
        {
          this.b = paramzaiw;
        }
        return paramzaiw;
      }
      break;
    case 2: 
      if (paramzaca.l.g() > 1)
      {
        if (paramzaiw.A()) {
          paramzaiw = zbam.a(paramzaiw, paramzaca);
        }
        if (paramzaca.l.f() > 1)
        {
          if (this.b == null) {
            this.b = new zbou(paramzaca, true);
          }
          this.b.a(paramzaca, paramzaiw);
        }
        else
        {
          this.b = paramzaiw;
        }
        return paramzaiw;
      }
      break;
    }
    this.b = zbov.a;
    return paramzaiw;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */