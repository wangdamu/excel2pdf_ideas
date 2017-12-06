package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zdi
  extends zcd
{
  zdi(zka paramzka)
  {
    c(4193);
    b(22);
    this.b = new byte[22];
    switch (paramzka.j())
    {
    case 46: 
      this.b[0] = 1;
      break;
    case 49: 
      this.b[0] = 2;
    }
    if (paramzka.G()) {
      this.b[1] = 1;
    } else {
      this.b[1] = 0;
    }
    switch (paramzka.D())
    {
    case 2: 
      this.b[2] = 2;
      System.arraycopy(zc.a((int)paramzka.E()), 0, this.b, 6, 2);
      break;
    case 0: 
      this.b[2] = 0;
      System.arraycopy(zc.a((int)paramzka.E()), 0, this.b, 4, 2);
      break;
    case 1: 
      this.b[2] = 1;
      System.arraycopy(zc.a(paramzka.E()), 0, this.b, 12, 8);
      break;
    case 3: 
      this.b[2] = 3;
    }
    System.arraycopy(zc.a(paramzka.C()), 0, this.b, 8, 2);
    System.arraycopy(zc.a(paramzka.z()), 0, this.b, 10, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */