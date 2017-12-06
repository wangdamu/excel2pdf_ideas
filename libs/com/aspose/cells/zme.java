package com.aspose.cells;

class zme
  extends zmd
{
  private int[] i;
  
  public zme(zaca paramzaca, zabe paramzabe, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    super(paramzaca, paramzabe, paramArrayOfzaie, paramInt1, paramInt2);
    this.i = paramArrayOfInt;
  }
  
  public zahs a(zaca paramzaca)
  {
    zaie[] arrayOfzaie = new zaie[this.c.length];
    System.arraycopy(this.d, 0, arrayOfzaie, 0, arrayOfzaie.length);
    return new zme(paramzaca == null ? this.a : paramzaca, this.b, arrayOfzaie, this.e, this.f, this.i);
  }
  
  public void b(zaca paramzaca)
  {
    super.b(paramzaca);
    if (this.c.length > this.i.length) {
      for (int j = 0; j < this.c.length; j++)
      {
        int k = 1;
        for (int m = 0; m < this.i.length; m++) {
          if (j == this.i[m])
          {
            k = 0;
            break;
          }
        }
        if (k != 0) {
          this.d[j] = this.c[j].e(paramzaca);
        }
      }
    }
  }
  
  public boolean a(int paramInt, zaie paramzaie)
  {
    this.h[this.i[paramInt]] = paramzaie;
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zme.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */