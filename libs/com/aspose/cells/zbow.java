package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbow
  extends zcd
{
  public zbow(int paramInt, zaml paramzaml)
  {
    c(2146);
    if (paramzaml.c() == 4)
    {
      b(40);
      this.b = new byte[40];
      this.b[12] = 40;
      this.b[20] = ((byte)paramInt);
    }
    else
    {
      b(20);
      this.b = new byte[20];
      this.b[12] = 20;
    }
    this.b[0] = 98;
    this.b[1] = 8;
    System.arraycopy(zc.a(paramInt), 0, this.b, 16, 4);
    if (paramzaml.c() == 4) {
      zfb.a(paramzaml, this.b, 24);
    }
  }
  
  public zbow(int paramInt1, int paramInt2, zaml paramzaml)
  {
    c(2146);
    b(40);
    this.b = new byte[40];
    this.b[0] = 98;
    this.b[1] = 8;
    this.b[12] = 40;
    System.arraycopy(zc.a(paramInt1), 0, this.b, 16, 4);
    this.b[20] = ((byte)paramInt1);
    zfb.a(paramzaml, this.b, 24);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */