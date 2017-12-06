package com.aspose.cells;

class zms
  extends zmq
  implements zahv
{
  public zms(zaca paramzaca)
  {
    super(paramzaca);
  }
  
  public zahs a(zaca paramzaca)
  {
    return new zms(paramzaca == null ? this.a : paramzaca);
  }
  
  public boolean a(zaie paramzaie)
  {
    paramzaie = paramzaie.e(this.a);
    if (paramzaie.b() == 0)
    {
      this.c = 0;
      this.e = paramzaie;
      return true;
    }
    if (paramzaie.b() == 3)
    {
      if (((zabb)paramzaie).q())
      {
        this.b = false;
      }
      else
      {
        this.b = true;
        this.d = ((zabb)paramzaie).o();
      }
    }
    else {
      this.b = false;
    }
    return false;
  }
  
  public boolean b(zaie paramzaie)
  {
    paramzaie = paramzaie.e(this.a);
    if (paramzaie.b() == 0)
    {
      this.c = 1;
      this.e = paramzaie;
      return true;
    }
    if (this.b) {
      if (paramzaie.b() == 3) {
        this.d *= ((zabb)paramzaie).o();
      } else {
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */