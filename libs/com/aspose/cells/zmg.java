package com.aspose.cells;

class zmg
  extends zmd
{
  private int i;
  
  public zmg(zaca paramzaca, zabe paramzabe, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramzaca, paramzabe, paramArrayOfzaie, paramInt1, paramInt2);
    this.i = paramInt3;
  }
  
  public zahs a(zaca paramzaca)
  {
    zaie[] arrayOfzaie = new zaie[this.c.length];
    System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
    return new zmg(paramzaca == null ? this.a : paramzaca, this.b, arrayOfzaie, this.e, this.f, this.i);
  }
  
  public void b(zaca paramzaca)
  {
    super.b(paramzaca);
    if (this.c.length > this.i) {
      for (int j = this.i; j < this.c.length; j++) {
        if (this.c[j] != null) {
          this.d[j] = this.c[j].e(paramzaca);
        }
      }
    }
  }
  
  public boolean a(int paramInt, zaie paramzaie)
  {
    this.h[paramInt] = paramzaie;
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */