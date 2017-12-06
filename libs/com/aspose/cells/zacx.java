package com.aspose.cells;

class zacx
  extends zcd
{
  zacx()
  {
    c(171);
    b(34);
    this.b = new byte[34];
    this.b[0] = 32;
    this.b[1] = 0;
    for (int i = 2; i < 34; i++) {
      this.b[i] = -1;
    }
  }
  
  void a(byte paramByte)
  {
    int i = (byte)((paramByte & 0xFF) / 8);
    int j = (byte)((paramByte & 0xFF) % 8);
    int k = (byte)(1 << (j & 0xFF));
    this.b[(2 + (i & 0xFF))] = ((byte)((this.b[(2 + (i & 0xFF))] & 0xFF) - (k & 0xFF)));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */