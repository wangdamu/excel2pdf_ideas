package com.aspose.cells;

class zmo
  extends zmk
  implements zahu
{
  private zabm e;
  
  public zmo(zaca paramzaca, zabm paramzabm, int paramInt1, int paramInt2)
  {
    super(paramzaca, paramInt1, paramInt2);
    this.e = paramzabm.q();
  }
  
  public zahs a(zaca paramzaca)
  {
    return new zmo(paramzaca == null ? this.a : paramzaca, this.e, this.b, this.c);
  }
  
  public zaie a(zaie paramzaie)
  {
    if (this.d)
    {
      zabm localzabm = this.e.q();
      localzabm.c(paramzaie);
      return localzabm;
    }
    this.e.c(paramzaie);
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
      localObject = this.e.q();
      ((zabm)localObject).c(paramzaie);
      return (zaie)localObject;
    }
    this.e.c(paramzaie);
    Object localObject = this.e.d(this.a);
    if ((((zaie)localObject).b() == 3) && (((zabb)localObject).q())) {
      return zabb.a;
    }
    return (zaie)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */