package com.aspose.cells;

class zbrm
  implements zaji
{
  private int a = 0;
  private zaie b;
  
  zbrm(zaie paramzaie)
  {
    this.b = paramzaie;
  }
  
  public zaie a()
  {
    if (this.a == 0) {
      return zabb.a;
    }
    if (this.a == 1) {
      return zabb.b;
    }
    return new zabb(this.a);
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return paramzaie != this.b;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    if (paramzaie != this.b) {
      return zaba.b;
    }
    this.a += 1;
    return null;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    if (paramzaie != this.b) {
      return zaba.b;
    }
    this.a += paramInt;
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */