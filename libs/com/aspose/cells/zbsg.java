package com.aspose.cells;

class zbsg
  implements zaji
{
  private zaji a;
  
  public zbsg(zaji paramzaji)
  {
    this.a = paramzaji;
  }
  
  public zaie a()
  {
    return this.a.a();
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return this.a.a(paramzaie, paramBoolean);
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    if (paramzaie.i()) {
      return this.a.a(paramzaie, paramzaca, paramBoolean);
    }
    paramzaie = paramzaie.d(paramzaca);
    if (paramzaie.i()) {
      return this.a.a(paramzaie, paramzaca, paramBoolean);
    }
    zaiw localzaiw = paramzaie.a(paramzaca, false);
    paramzaie = zbam.a(localzaiw, this.a, paramzaca, paramBoolean, true);
    localzaiw.a(true);
    return paramzaie;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    if (paramzaie.i()) {
      return this.a.a(paramzaie, paramzaca, paramBoolean, paramInt);
    }
    paramzaie = paramzaie.d(paramzaca);
    if (paramzaie.i()) {
      return this.a.a(paramzaie, paramzaca, paramBoolean, paramInt);
    }
    zaiw localzaiw = paramzaie.a(paramzaca, false);
    paramzaie = zbam.a(localzaiw, this.a, paramzaca, paramBoolean, true);
    if ((paramzaie != null) && (paramzaie.b() == 0))
    {
      localzaiw.a(true);
      return paramzaie;
    }
    if (paramInt > 1) {
      for (;;)
      {
        paramzaie = zbam.a(localzaiw, this.a, paramzaca, paramBoolean, true);
        if ((paramzaie != null) && (paramzaie.b() == 0))
        {
          localzaiw.a(true);
          return paramzaie;
        }
        paramInt--;
        if (paramInt == 1) {
          break;
        }
      }
    }
    localzaiw.a(true);
    return zaba.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */