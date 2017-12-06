package com.aspose.cells;

class zmi
  extends zmc
  implements zahv
{
  private int h;
  private int i;
  
  public zmi(zaca paramzaca, zabe paramzabe, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramzaca, paramzabe, paramArrayOfzaie, paramInt1, paramInt2);
    this.h = paramInt3;
    this.i = paramInt4;
  }
  
  public zahs a(zaca paramzaca)
  {
    zaie[] arrayOfzaie = new zaie[this.c.length];
    System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
    return new zmi(paramzaca == null ? this.a : paramzaca, this.b, arrayOfzaie, this.e, this.f, this.h, this.i);
  }
  
  public void b(zaca paramzaca)
  {
    super.b(paramzaca);
    if (this.c.length > 2) {
      for (int j = 0; j < this.c.length; j++) {
        if ((j != this.h) && (j != this.i) && (this.c[j] != null)) {
          this.d[j] = this.c[j].e(paramzaca);
        }
      }
    }
  }
  
  public boolean a(zaie paramzaie)
  {
    this.d[this.h] = paramzaie;
    return false;
  }
  
  public boolean b(zaie paramzaie)
  {
    this.d[this.i] = paramzaie;
    return false;
  }
  
  public zaie d()
  {
    if (this.g)
    {
      zaie[] arrayOfzaie = new zaie[this.d.length];
      System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
      return new zabe(this.b.g(), this.b.p(), arrayOfzaie);
    }
    this.b.o();
    return this.b;
  }
  
  public zaie b(boolean paramBoolean)
  {
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
      zabe localzabe = new zabe(this.b.g(), this.b.p(), arrayOfzaie);
      return localzabe;
    }
    this.b.o();
    return this.b.d(this.a);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */