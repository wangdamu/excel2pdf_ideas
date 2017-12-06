package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbem
  extends zcd
{
  zbem(zka paramzka)
  {
    c(4123);
    b(6);
    this.b = new byte[6];
    if (ChartCollection.k(paramzka.j()))
    {
      this.b[0] = 100;
      this.b[2] = 1;
    }
    else
    {
      System.arraycopy(zc.a(paramzka.H()), 0, this.b, 0, 2);
      switch (paramzka.I())
      {
      case 0: 
        this.b[2] = 1;
        break;
      case 1: 
        this.b[2] = 2;
      }
      this.b[4] = 1;
      if (paramzka.J())
      {
        int tmp136_135 = 4;
        byte[] tmp136_132 = this.b;
        tmp136_132[tmp136_135] = ((byte)(tmp136_132[tmp136_135] | 0x2));
      }
      if (paramzka.L())
      {
        int tmp154_153 = 4;
        byte[] tmp154_150 = this.b;
        tmp154_150[tmp154_153] = ((byte)(tmp154_150[tmp154_153] | 0x4));
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */