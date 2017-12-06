package com.aspose.cells;

class zow
{
  int a;
  zox b;
  zox c;
  zox d;
  zox e;
  zox f;
  zox g;
  zox h;
  boolean i = false;
  boolean j = false;
  
  private void a(zox paramzox, Border paramBorder)
  {
    if ((paramzox.a != null) && (paramzox.a.length() > 0)) {
      paramBorder.setLineStyle(zauj.j(paramzox.a));
    }
    paramBorder.a.f(paramzox.b);
  }
  
  void a(Style paramStyle)
  {
    if (this.b != null) {
      a(this.b, paramStyle.getBorders().getByBorderType(4));
    }
    if (this.d != null) {
      a(this.d, paramStyle.getBorders().getByBorderType(8));
    }
    if (this.c != null) {
      a(this.c, paramStyle.getBorders().getByBorderType(1));
    }
    if (this.e != null) {
      a(this.e, paramStyle.getBorders().getByBorderType(2));
    }
    if ((this.g != null) || (this.h != null))
    {
      if (this.g != null)
      {
        paramStyle.getBorders().a(new Border(paramStyle.getBorders(), 128));
        a(this.g, paramStyle.getBorders().b());
      }
      if (this.h != null)
      {
        paramStyle.getBorders().b(new Border(paramStyle.getBorders(), 64));
        a(this.h, paramStyle.getBorders().c());
      }
    }
    if (this.f != null)
    {
      if (this.i) {
        a(this.f, paramStyle.getBorders().getByBorderType(16));
      }
      if (this.j) {
        a(this.f, paramStyle.getBorders().getByBorderType(32));
      }
    }
  }
  
  static zow b(Style paramStyle)
  {
    zow localzow = new zow();
    localzow.b = zox.a(paramStyle, 4);
    localzow.c = zox.a(paramStyle, 1);
    localzow.d = zox.a(paramStyle, 8);
    localzow.e = zox.a(paramStyle, 2);
    if (paramStyle.getBorders().b() != null) {
      localzow.g = zox.a(paramStyle.getBorders().b());
    }
    if (paramStyle.getBorders().c() != null) {
      localzow.h = zox.a(paramStyle.getBorders().c());
    }
    int k = paramStyle.getBorders().f() & 0xFF;
    switch (k)
    {
    case 0: 
      localzow.i = false;
      localzow.j = false;
      break;
    case 1: 
      localzow.i = true;
      localzow.j = false;
      break;
    case 2: 
      localzow.i = false;
      localzow.j = true;
      break;
    case 3: 
      localzow.i = true;
      localzow.j = true;
    }
    if (localzow.i) {
      localzow.f = zox.a(paramStyle, 16);
    } else if (localzow.j) {
      localzow.f = zox.a(paramStyle, 32);
    }
    return localzow;
  }
  
  static boolean a(zow paramzow1, zow paramzow2)
  {
    if ((paramzow1 == null) && (paramzow2 == null)) {
      return true;
    }
    if ((paramzow1 != null) && (paramzow2 != null))
    {
      if (!zox.a(paramzow1.d, paramzow2.d)) {
        return false;
      }
      if (!zox.a(paramzow1.b, paramzow2.b)) {
        return false;
      }
      if (!zox.a(paramzow1.c, paramzow2.c)) {
        return false;
      }
      if (!zox.a(paramzow1.e, paramzow2.e)) {
        return false;
      }
      if (!zox.a(paramzow1.f, paramzow2.f)) {
        return false;
      }
      if (!zox.a(paramzow1.g, paramzow2.g)) {
        return false;
      }
      if (!zox.a(paramzow1.h, paramzow2.h)) {
        return false;
      }
      if (paramzow1.i != paramzow2.i) {
        return false;
      }
      return paramzow1.j == paramzow2.j;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */