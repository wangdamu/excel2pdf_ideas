package com.aspose.cells;

class zmn
  extends zmk
  implements zahv
{
  private zabk e;
  
  public zmn(zaca paramzaca, zabk paramzabk, int paramInt1, int paramInt2)
  {
    super(paramzaca, paramInt1, paramInt2);
    this.e = paramzabk.w();
  }
  
  public zahs a(zaca paramzaca)
  {
    return new zmn(paramzaca == null ? this.a : paramzaca, this.e, this.b, this.c);
  }
  
  public boolean a(zaie paramzaie)
  {
    this.e.c(paramzaie);
    return false;
  }
  
  public boolean b(zaie paramzaie)
  {
    this.e.d(paramzaie);
    return false;
  }
  
  public zaie d()
  {
    if (this.d) {
      return this.e.I();
    }
    this.e.J();
    return this.e;
  }
  
  public zaie b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.e.c(this.a, true)) {
        return null;
      }
    }
    else if ((this.d) && (this.e.c(this.a, true))) {
      return this.e.I();
    }
    this.e.J();
    zaie localzaie = this.e.d(this.a);
    if ((localzaie.b() == 3) && (((zabb)localzaie).q())) {
      return zabb.a;
    }
    return localzaie;
  }
  
  public zaie e()
  {
    return null;
  }
  
  public boolean f()
  {
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */