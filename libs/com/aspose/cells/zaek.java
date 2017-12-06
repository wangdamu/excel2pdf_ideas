package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaek
  extends zcd
{
  zaek()
  {
    c(128);
    b(8);
    this.b = new byte[8];
  }
  
  void a(int paramInt)
  {
    System.arraycopy(zc.a(paramInt), 0, this.b, 2, 2);
  }
  
  void a(byte paramByte)
  {
    this.b[6] = paramByte;
  }
  
  void d(int paramInt)
  {
    System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
  }
  
  void b(byte paramByte)
  {
    this.b[4] = paramByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */