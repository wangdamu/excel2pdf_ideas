package com.aspose.cells;

abstract class zfm
  extends zfh
{
  protected zaca d;
  protected int e = -1;
  protected int f = -1;
  protected boolean g = false;
  protected boolean h = true;
  protected long i;
  protected long j;
  protected int k;
  protected int l;
  protected boolean m;
  protected boolean n;
  protected boolean o;
  protected boolean p = false;
  
  zfm(zaai paramzaai, zaca paramzaca)
  {
    super(paramzaai, paramzaai.b().a);
    this.d = paramzaca;
    zacb localzacb = paramzaai.b();
    this.k = (localzacb.a.StartRow - 1);
    this.l = (localzacb.a.StartColumn - 1);
    boolean bool1 = false;
    boolean bool2 = false;
    if (localzacb.d())
    {
      this.o = true;
      paramzaca.d = this.k;
      paramzaca.e = ((short)this.l);
      if (!localzacb.b()) {
        bool1 = true;
      }
      if (!localzacb.c()) {
        bool2 = true;
      }
    }
    else
    {
      this.o = false;
      if (localzacb.e())
      {
        paramzaca.e = ((short)this.l);
        bool1 = true;
      }
      else
      {
        paramzaca.d = this.k;
        bool2 = true;
      }
    }
    this.m = bool1;
    this.n = bool2;
    if (bool1) {
      this.i = Cell.a(paramzaca.n, localzacb.b, localzacb.c);
    } else {
      this.i = -1L;
    }
    if (bool2) {
      this.j = Cell.a(paramzaca.n, localzacb.d, localzacb.e);
    } else {
      this.j = -1L;
    }
  }
  
  abstract void a(zaai paramzaai);
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */