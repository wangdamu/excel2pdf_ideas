package com.aspose.cells;

import java.util.HashMap;

abstract class zhd
  implements zaha
{
  protected zaca a;
  private zaji c;
  private zgs d = new zgs();
  protected Worksheet b;
  private zaie e;
  private boolean f = false;
  
  zhd(zaca paramzaca, zaji paramzaji)
  {
    this.a = paramzaca;
    this.c = paramzaji;
  }
  
  protected abstract boolean a(zt paramzt);
  
  protected abstract boolean a(zaai paramzaai);
  
  void a(Worksheet paramWorksheet)
  {
    this.b = paramWorksheet;
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    if (a(paramzt)) {
      return false;
    }
    zgs localzgs = paramzt.a(paramInt, this.d, 4);
    Object localObject;
    if (localzgs.c == 5)
    {
      localObject = (zaai)localzgs.d;
      if (a((zaai)localObject)) {
        return false;
      }
    }
    if (this.a.p.z)
    {
      localObject = this.a.p.y.get(Long.valueOf(Cell.a(this.b.getIndex(), paramzt.i(), localzgs.a)));
      if (localObject != null) {
        this.e = this.c.a((zaie)localObject, this.a, true);
      } else {
        this.e = this.c.a(zabt.a(this.b, localzgs, false, this.a), this.a, true);
      }
    }
    else
    {
      this.e = this.c.a(zabt.a(this.b, localzgs, false, this.a), this.a, true);
    }
    if ((this.e != null) && (this.e.b() == 0))
    {
      this.f = true;
      return true;
    }
    return false;
  }
  
  public boolean a()
  {
    return this.f;
  }
  
  public zaie b()
  {
    if (this.f) {
      return this.e;
    }
    return this.c.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */