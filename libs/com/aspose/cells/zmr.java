package com.aspose.cells;

class zmr
  extends zmq
  implements zaht
{
  public zmr(zaca paramzaca)
  {
    super(paramzaca);
  }
  
  public zahs a(zaca paramzaca)
  {
    return new zmr(paramzaca == null ? this.a : paramzaca);
  }
  
  public void c()
  {
    this.b = true;
    this.d = 1.0D;
  }
  
  public boolean a(int paramInt, zaie paramzaie)
  {
    paramzaie = paramzaie.e(this.a);
    if (paramzaie.b() == 0)
    {
      this.c = paramInt;
      this.e = paramzaie;
      return true;
    }
    if (this.b) {
      if (paramzaie.b() == 3)
      {
        if (((zabb)paramzaie).q()) {
          this.b = false;
        } else {
          this.d *= ((zabb)paramzaie).o();
        }
      }
      else {
        this.b = false;
      }
    }
    return false;
  }
  
  public zaie d()
  {
    if (this.b) {
      return new zabb(this.d);
    }
    return zabb.a;
  }
  
  public zaie b(boolean paramBoolean)
  {
    if (this.b) {
      return new zabb(this.d);
    }
    return zabb.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */