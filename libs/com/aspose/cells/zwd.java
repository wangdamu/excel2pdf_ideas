package com.aspose.cells;

class zwd
{
  byte a;
  String b;
  zwe c;
  
  boolean a()
  {
    return (this.a & 0xFF & 0x2) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a = ((byte)(this.a | 0x2));
    } else {
      this.a = ((byte)(this.a & 0xFD));
    }
  }
  
  boolean b()
  {
    return (this.a & 0xFF & 0x8) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a = ((byte)(this.a | 0x8));
    } else {
      this.a = ((byte)(this.a & 0xF7));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */