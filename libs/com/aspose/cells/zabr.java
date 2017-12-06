package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zabr
  extends zaaz
{
  public zabr(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramArrayOfByte, paramInt, 6);
  }
  
  public zaie e(zaca paramzaca)
  {
    if (this.a != null)
    {
      if (this.a.a != null) {
        return this.a.a;
      }
    }
    else {
      this.a = new zabu();
    }
    int i = zc.a(this.b, this.c + 2);
    if (paramzaca.p.e.c() != null)
    {
      zaxb localzaxb = (zaxb)paramzaca.p.e.c();
      if (localzaxb.r) {
        this.a.a = localzaxb.a(i, paramzaca);
      } else {
        this.a.a = localzaxb.b(i, paramzaca);
      }
      return this.a.a;
    }
    this.a.a = null;
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */