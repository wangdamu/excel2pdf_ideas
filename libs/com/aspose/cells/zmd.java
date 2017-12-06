package com.aspose.cells;

abstract class zmd
  extends zmc
  implements zaht
{
  protected zaie[] h;
  
  public zmd(zaca paramzaca, zabe paramzabe, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2)
  {
    super(paramzaca, paramzabe, paramArrayOfzaie, paramInt1, paramInt2);
    this.h = paramArrayOfzaie;
  }
  
  public boolean a()
  {
    return this.g;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (!paramBoolean) {
      this.h = this.d;
    }
  }
  
  public void c()
  {
    if (this.g)
    {
      this.h = new zaie[this.d.length];
      System.arraycopy(this.d, 0, this.h, 0, this.h.length);
    }
  }
  
  public zaie d()
  {
    if (this.g) {
      return new zabe(this.b.g(), this.b.p(), this.h);
    }
    this.b.o();
    return this.b;
  }
  
  public zaie b(boolean paramBoolean)
  {
    if (this.g)
    {
      System.arraycopy(this.h, 0, this.d, 0, this.h.length);
      if (this.b.c(this.a, true))
      {
        if (paramBoolean) {
          return null;
        }
        zaie[] arrayOfzaie = new zaie[this.h.length];
        System.arraycopy(this.h, 0, arrayOfzaie, 0, arrayOfzaie.length);
        return new zabe(this.b.g(), this.b.p(), arrayOfzaie);
      }
    }
    else if ((paramBoolean) && (this.b.c(this.a, true)))
    {
      return null;
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */