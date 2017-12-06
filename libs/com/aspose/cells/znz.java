package com.aspose.cells;

import com.aspose.cells.a.c.zl;

class znz
  extends zny
{
  private boolean d;
  
  znz(zaca paramzaca, zabi paramzabi, boolean paramBoolean)
  {
    super(paramzaca, paramzabi);
    this.d = paramBoolean;
  }
  
  public int a()
  {
    return 1;
  }
  
  public zaie b()
  {
    return this.d ? zaba.a : zaba.b;
  }
  
  public boolean a(zaie paramzaie)
  {
    if (paramzaie.b() == 1) {
      return b(paramzaie);
    }
    return this.c;
  }
  
  public boolean b(zaie paramzaie)
  {
    if (this.b)
    {
      if (this.d) {
        return paramzaie == zaba.a;
      }
      return paramzaie == zaba.b;
    }
    if (this.c)
    {
      if (this.d) {
        return paramzaie == zaba.b;
      }
      return paramzaie == zaba.a;
    }
    if (this.d)
    {
      if (paramzaie == zaba.a) {
        return this.a.a(0);
      }
      return this.a.a(-1);
    }
    if (paramzaie == zaba.a) {
      return this.a.a(1);
    }
    return this.a.a(0);
  }
  
  public int c(zaie paramzaie)
  {
    if (this.d)
    {
      if (paramzaie == zaba.a) {
        return 0;
      }
      return -1;
    }
    if (paramzaie == zaba.a) {
      return 1;
    }
    return -1;
  }
  
  static int a(zaie paramzaie, boolean paramBoolean, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 2: 
      if (a(paramzaca))
      {
        if (paramBoolean) {
          return -1;
        }
        return 0;
      }
      return -1;
    case 3: 
      if (a(paramzaca))
      {
        if (paramBoolean) {
          return ((zabb)paramzaie).t();
        }
        return ((zabb)paramzaie).s();
      }
      return -1;
    case 1: 
      return a(((zaba)paramzaie).o(), paramBoolean);
    case 12: 
      return paramBoolean ? -1 : 0;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to compare with Boolean: " + paramzaie.b());
    }
    return -1;
  }
  
  static int a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == paramBoolean2) {
      return 0;
    }
    if (paramBoolean1) {
      return 1;
    }
    return -1;
  }
  
  static boolean b(zaie paramzaie, boolean paramBoolean, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 2: 
      if (a(paramzaca)) {
        return !paramBoolean;
      }
      return false;
    case 3: 
      if (a(paramzaca)) {
        return ((zabb)paramzaie).o() == (paramBoolean ? 1.0D : 0.0D);
      }
      return false;
    case 1: 
      return ((zaba)paramzaie).o() == paramBoolean;
    case 12: 
      return !paramBoolean;
    case 0: 
      return false;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to match Boolean: " + paramzaie.b());
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */