package com.aspose.cells;

class zwv
{
  byte a = 5;
  byte b = 5;
  byte[] c;
  short d = 255;
  int e = 1;
  byte f = 0;
  byte g = 0;
  byte h = 0;
  
  void a(zwv paramzwv)
  {
    this.a = paramzwv.a;
    this.b = paramzwv.b;
    this.d = paramzwv.d;
    this.e = 0;
    this.f = paramzwv.f;
    this.g = paramzwv.g;
    this.h = paramzwv.h;
    this.c = new byte[16];
    System.arraycopy(paramzwv.c, 0, this.c, 0, 16);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */