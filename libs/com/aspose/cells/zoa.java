package com.aspose.cells;

import com.aspose.cells.a.c.zl;

class zoa
  extends zny
{
  private zabc d;
  
  zoa(zaca paramzaca, zabi paramzabi, zabc paramzabc)
  {
    super(paramzaca, paramzabi);
    this.d = paramzabc;
  }
  
  public int a()
  {
    return 0;
  }
  
  public zaie b()
  {
    return this.d;
  }
  
  public boolean a(zaie paramzaie)
  {
    if (this.b) {
      return paramzaie == this.d;
    }
    if (this.c) {
      return paramzaie != this.d;
    }
    return false;
  }
  
  public boolean b(zaie paramzaie)
  {
    if (this.b) {
      return paramzaie == this.d;
    }
    if (this.c) {
      return paramzaie != this.d;
    }
    return false;
  }
  
  public int c(zaie paramzaie)
  {
    if (paramzaie == this.d) {
      return 0;
    }
    if (zl.a()) {
      zl.a("Unsupported node type to compare with Error: " + paramzaie.b());
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */