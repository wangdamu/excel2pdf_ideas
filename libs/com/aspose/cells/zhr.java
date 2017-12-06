package com.aspose.cells;

class zhr
  implements zaha
{
  private byte a;
  private boolean b;
  private int c;
  private Object d;
  private zaca e;
  private boolean f;
  private zgs g = new zgs();
  private zgs h;
  
  zhr(int paramInt)
  {
    this.a = ((byte)paramInt);
    this.b = false;
    this.c = 0;
    this.d = null;
    this.e = null;
    this.f = false;
  }
  
  zhr(int paramInt, zaca paramzaca)
  {
    this.a = ((byte)paramInt);
    this.b = false;
    this.c = 0;
    this.d = null;
    this.e = paramzaca;
    this.f = ((paramzaca != null) && (paramzaca.p.z) && (paramzaca.p.L.i != 0));
  }
  
  zhr(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a = ((byte)paramInt1);
    this.b = true;
    this.c = paramInt2;
    this.d = paramObject;
    this.e = null;
    this.f = false;
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    this.h = paramzt.c(paramInt, this.g);
    if (this.h.c == 5)
    {
      zaai localzaai;
      if (this.b)
      {
        localzaai = (zaai)this.h.d;
        localzaai.a(this.a);
        localzaai.c = this.c;
        localzaai.d = this.d;
        if (this.f) {
          this.e.p.a(this.e.n, localzaai);
        }
      }
      else if (this.f)
      {
        localzaai = (zaai)this.h.d;
        localzaai.a(this.a);
        this.e.p.a(this.e.n, localzaai);
      }
      else
      {
        ((zaai)this.h.d).a(this.a);
      }
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */