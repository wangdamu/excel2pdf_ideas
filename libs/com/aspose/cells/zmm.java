package com.aspose.cells;

class zmm
  extends zmk
  implements zahu
{
  private zabk e;
  private zaie f;
  private zaie g;
  
  public zmm(zaca paramzaca, zabk paramzabk, int paramInt1, int paramInt2, zaie paramzaie)
  {
    super(paramzaca, paramInt1, paramInt2);
    this.e = paramzabk.w();
    this.e.d(zabg.a);
    this.f = paramzabk.G();
    this.g = paramzaie.e(paramzaca);
    this.e.c(paramzaie);
  }
  
  public zahs a(zaca paramzaca)
  {
    return new zmm(paramzaca == null ? this.a : paramzaca, this.e, this.b, this.c, this.g);
  }
  
  public void b(zaca paramzaca)
  {
    super.b(paramzaca);
    if (this.f != null)
    {
      this.g = this.f.e(paramzaca);
      this.e.c(this.g);
    }
  }
  
  public zaie a(zaie paramzaie)
  {
    if (this.d)
    {
      zabk localzabk = this.e.w();
      localzabk.c(this.g);
      localzabk.d(paramzaie);
      return localzabk;
    }
    this.e.d(paramzaie);
    this.e.J();
    return this.e;
  }
  
  public zaie a(zaie paramzaie, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramzaie.c(this.a, true)) {
        return null;
      }
    }
    else if ((this.d) && (paramzaie.c(this.a, true)))
    {
      localObject = this.e.w();
      ((zabk)localObject).c(this.g);
      ((zabk)localObject).d(paramzaie);
      return (zaie)localObject;
    }
    this.e.d(paramzaie);
    this.e.J();
    Object localObject = this.e.d(this.a);
    if ((((zaie)localObject).b() == 3) && (((zabb)localObject).q())) {
      return zabb.a;
    }
    return (zaie)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */