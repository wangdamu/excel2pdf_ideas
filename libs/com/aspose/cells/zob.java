package com.aspose.cells;

import com.aspose.cells.a.c.zl;

class zob
  extends zny
{
  zob(zaca paramzaca, zabi paramzabi)
  {
    super(paramzaca, paramzabi);
  }
  
  public int a()
  {
    return 12;
  }
  
  public zaie b()
  {
    return zabg.a;
  }
  
  public boolean a(zaie paramzaie)
  {
    if (this.b) {
      return paramzaie == zabg.a;
    }
    if (this.c) {
      return paramzaie != zabg.a;
    }
    return false;
  }
  
  public boolean b(zaie paramzaie)
  {
    return true;
  }
  
  public int c(zaie paramzaie)
  {
    return 0;
  }
  
  static int a(zaie paramzaie, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 2: 
      return (((zabp)paramzaie).o().equals("")) || (a(paramzaca)) ? 0 : 1;
    case 3: 
      return ((zabb)paramzaie).s();
    case 1: 
      return ((zaba)paramzaie).o() ? 1 : 0;
    case 12: 
      return 0;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to compare with NULL: " + paramzaie.b());
    }
    return 1;
  }
  
  static boolean b(zaie paramzaie, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 2: 
      return (((zabp)paramzaie).o().equals("")) || (a(paramzaca));
    case 3: 
      return ((zabb)paramzaie).r();
    case 1: 
      return !((zaba)paramzaie).o();
    case 12: 
      return true;
    case 0: 
      return false;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to match NULL: " + paramzaie.b());
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */