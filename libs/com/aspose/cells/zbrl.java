package com.aspose.cells;

class zbrl
  implements zaji
{
  private boolean a = false;
  private boolean b = false;
  private boolean c;
  
  public zbrl(boolean paramBoolean)
  {
    this.c = paramBoolean;
    this.b = paramBoolean;
  }
  
  public zaie a()
  {
    if (!this.a) {
      return zabc.f;
    }
    return this.b ? zaba.a : zaba.b;
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return (paramBoolean) && (paramzaie.b() == 12);
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    if (paramzaie != null) {
      paramzaie = paramzaie.e(paramzaca);
    }
    if (paramzaie == null)
    {
      if (paramBoolean) {
        return zaba.b;
      }
      a(false);
      return zaba.b;
    }
    switch (paramzaie.b())
    {
    case 1: 
      a(((zaba)paramzaie).o());
      return zaba.b;
    case 0: 
      return paramzaie;
    case 3: 
      a(((zabb)paramzaie).o() != 0.0D);
      return zaba.b;
    }
    if (paramBoolean) {
      return zaba.b;
    }
    zaba localzaba = paramzaie.j(paramzaca);
    if (localzaba == null) {
      return zabc.f;
    }
    a(localzaba.o());
    return zaba.b;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    return a(paramzaie, paramzaca, paramBoolean);
  }
  
  private void a(boolean paramBoolean)
  {
    this.a = true;
    if (this.c)
    {
      if (!paramBoolean) {
        this.b = false;
      }
    }
    else if (paramBoolean) {
      this.b = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */