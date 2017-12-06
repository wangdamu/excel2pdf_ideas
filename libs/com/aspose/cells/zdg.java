package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zdg
{
  int a;
  byte b = 30;
  byte c;
  int d = 21;
  
  void a(zdg paramzdg)
  {
    this.a = paramzdg.a;
    this.b = paramzdg.b;
    this.c = paramzdg.c;
    this.d = paramzdg.d;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.d = (paramArrayOfByte[12] & 0xFF);
    this.a = zc.a(paramArrayOfByte, 16);
    if (this.d > 20) {
      this.b = paramArrayOfByte[20];
    }
    if (this.d > 21) {
      this.c = paramArrayOfByte[21];
    }
  }
  
  byte[] a()
  {
    byte[] arrayOfByte = new byte[this.d + 4];
    arrayOfByte[0] = 99;
    arrayOfByte[1] = 8;
    arrayOfByte[2] = ((byte)this.d);
    int i = 4;
    arrayOfByte[(i + 0)] = 99;
    arrayOfByte[(i + 1)] = 8;
    arrayOfByte[(i + 12)] = ((byte)this.d);
    System.arraycopy(zc.a(this.a), 0, arrayOfByte, i + 16, 4);
    if (this.d > 20) {
      arrayOfByte[(i + 20)] = this.b;
    }
    if (this.d > 21) {
      arrayOfByte[(i + 21)] = this.c;
    }
    return arrayOfByte;
  }
  
  boolean b()
  {
    return (this.a & 0x2) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a |= 0x2;
    } else {
      this.a &= 0xFFFFFFFD;
    }
  }
  
  boolean c()
  {
    return (this.a & 0x4) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a |= 0x4;
    } else {
      this.a &= 0xFFFFFFFB;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */