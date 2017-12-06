package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcl
  extends zcd
{
  zcl(int paramInt1, int paramInt2)
  {
    c(4119);
    b(6);
    this.b = new byte[6];
    System.arraycopy(zc.a((short)-paramInt1), 0, this.b, 0, 2);
    System.arraycopy(zc.a((short)paramInt2), 0, this.b, 2, 2);
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    case 15: 
    case 19: 
      this.b[4] = 2;
      break;
    case 16: 
    case 20: 
      this.b[4] = 6;
      break;
    case 6: 
    case 9: 
      this.b[4] = 1;
      break;
    case 7: 
    case 10: 
      this.b[4] = 3;
      break;
    case 8: 
    case 11: 
      this.b[4] = 7;
      break;
    case 29: 
      this.b[4] = 2;
      break;
    case 30: 
      this.b[4] = 6;
      break;
    case 31: 
      this.b[4] = 1;
      break;
    case 32: 
      this.b[4] = 3;
      break;
    case 33: 
      this.b[4] = 7;
      break;
    case 22: 
    case 51: 
      this.b[4] = 2;
      break;
    case 23: 
    case 52: 
      this.b[4] = 6;
      break;
    case 24: 
    case 53: 
      this.b[4] = 1;
      break;
    case 25: 
    case 54: 
      this.b[4] = 3;
      break;
    case 26: 
    case 55: 
      this.b[4] = 7;
    }
    if (paramBoolean)
    {
      int tmp378_377 = 4;
      byte[] tmp378_374 = this.b;
      tmp378_374[tmp378_377] = ((byte)(tmp378_374[tmp378_377] | 0x8));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */