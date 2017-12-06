package com.aspose.cells;

class zhp
  implements zaha
{
  private zaca a;
  private zacc b;
  private zfl c;
  private int d;
  private int e;
  private int f = 0;
  
  zhp(zaca paramzaca, zfl paramzfl)
  {
    this.a = paramzaca;
    this.b = paramzaca.j();
    this.c = paramzfl;
    this.d = paramzfl.e;
    this.e = paramzfl.f;
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    if (paramzt.h(paramInt) != 5)
    {
      this.c.c -= 1;
      return false;
    }
    zaai localzaai = (zaai)paramzt.i(paramInt);
    if ((localzaai.c() == 2) || (localzaai.d()))
    {
      this.c.c -= 1;
      return false;
    }
    if ((localzaai.e == this.d) && (localzaai.f == this.e)) {
      return true;
    }
    this.b.a(localzaai.b, 0, -1);
    if (!this.b.h())
    {
      this.c.c -= 1;
      localzaai.a((byte)2);
      return false;
    }
    if (localzaai.b[this.b.e()] != 1)
    {
      this.c.c -= 1;
      return false;
    }
    zbap localzbap = this.b.a(this.a);
    if ((localzbap.b() != this.c.a.e) || (localzbap.d() != this.c.a.f))
    {
      this.c.c -= 1;
      return false;
    }
    if (localzaai.c() != 0) {
      return false;
    }
    this.a.a(localzaai);
    this.a.l = this.c.b;
    this.c.a(this.a);
    try
    {
      localzaai.a(this.c.d, this.a);
      this.f = 0;
    }
    catch (zgh localzgh)
    {
      localzaai.a((byte)0);
      if (this.f > 3) {
        throw localzgh;
      }
      this.f += 1;
    }
    finally
    {
      this.c.a();
    }
    this.c.c -= 1;
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */