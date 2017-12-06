package com.aspose.cells;

class zmf
  extends zmd
{
  private int i;
  private int j;
  
  public zmf(zaca paramzaca, zabe paramzabe, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramzaca, paramzabe, paramArrayOfzaie, paramInt1, paramInt2);
    this.i = paramInt3;
    this.j = paramInt4;
  }
  
  public zahs a(zaca paramzaca)
  {
    zaie[] arrayOfzaie = new zaie[this.c.length];
    System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
    return new zmf(paramzaca == null ? this.a : paramzaca, this.b, arrayOfzaie, this.e, this.f, this.i, this.j);
  }
  
  public void b(zaca paramzaca)
  {
    super.b(paramzaca);
    for (int k = 0; k < this.i; k++) {
      if (this.c[k] != null) {
        this.d[k] = this.c[k].e(paramzaca);
      }
    }
    if (this.c.length > this.i + this.j) {
      for (k = this.i + this.j; k < this.c.length; k++) {
        if (this.c[k] != null) {
          this.d[k] = this.c[k].e(paramzaca);
        }
      }
    }
  }
  
  public boolean a(int paramInt, zaie paramzaie)
  {
    this.h[(this.i + paramInt)] = paramzaie;
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */