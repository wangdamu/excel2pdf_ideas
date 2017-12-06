package com.aspose.cells;

class zmh
  extends zmc
  implements zahu
{
  private int h;
  
  public zmh(zaca paramzaca, zabe paramzabe, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramzaca, paramzabe, paramArrayOfzaie, paramInt1, paramInt2);
    this.h = paramInt3;
  }
  
  public zahs a(zaca paramzaca)
  {
    zaie[] arrayOfzaie = new zaie[this.c.length];
    System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
    return new zmh(paramzaca == null ? this.a : paramzaca, this.b, arrayOfzaie, this.e, this.f, this.h);
  }
  
  public void b(zaca paramzaca)
  {
    super.b(paramzaca);
    if (this.d.length > 1) {
      for (int i = 0; i < this.c.length; i++) {
        if ((i != this.h) && (this.c[i] != null)) {
          this.d[i] = this.c[i].e(paramzaca);
        }
      }
    }
  }
  
  public zaie a(zaie paramzaie)
  {
    if (this.g)
    {
      zaie[] arrayOfzaie = new zaie[this.d.length];
      if (arrayOfzaie.length > 1) {
        System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
      }
      arrayOfzaie[this.h] = paramzaie;
      return new zabe(this.b.g(), this.b.p(), arrayOfzaie);
    }
    this.d[this.h] = paramzaie;
    this.b.o();
    return this.b;
  }
  
  public zaie a(zaie paramzaie, boolean paramBoolean)
  {
    this.d[this.h] = paramzaie;
    if (paramBoolean)
    {
      if (this.b.c(this.a, true)) {
        return null;
      }
    }
    else if ((this.g) && (this.b.c(this.a, true)))
    {
      zaie[] arrayOfzaie = new zaie[this.d.length];
      System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
      return new zabe(this.b.g(), this.b.p(), arrayOfzaie);
    }
    this.b.o();
    return this.b.d(this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */