package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zanc
  extends zcd
{
  zanc()
  {
    c(4117);
    b(20);
    this.b = new byte[20];
    this.b[16] = 3;
    this.b[17] = 1;
    this.b[18] = 31;
    this.b[0] = 103;
    this.b[1] = 13;
    this.b[4] = -5;
    this.b[5] = 5;
    this.b[8] = 24;
    this.b[9] = 2;
    this.b[12] = 94;
    this.b[13] = 2;
  }
  
  void a()
  {
    this.b[16] = 7;
  }
  
  void a(Legend paramLegend)
  {
    System.arraycopy(zc.a(paramLegend.getX()), 0, this.b, 0, 4);
    System.arraycopy(zc.a(paramLegend.getY()), 0, this.b, 4, 4);
    int i = 0;
    if (paramLegend.t() != 0) {
      i = paramLegend.t();
    } else if (paramLegend.p()) {
      i = 532;
    }
    System.arraycopy(zc.a(i), 0, this.b, 8, 4);
    i = 0;
    if (paramLegend.s() != 0) {
      i = paramLegend.s();
    } else if (paramLegend.p()) {
      i = 323;
    }
    System.arraycopy(zc.a(i), 0, this.b, 12, 4);
    if (!paramLegend.m())
    {
      this.b[18] = 2;
      this.b[16] = 7;
      if (paramLegend.n())
      {
        byte[] tmp157_152 = this.b;
        tmp157_152[18] = ((byte)(tmp157_152[18] | 0x4));
      }
      if (paramLegend.o())
      {
        byte[] tmp176_171 = this.b;
        tmp176_171[18] = ((byte)(tmp176_171[18] | 0x8));
      }
    }
    if (paramLegend.G())
    {
      byte[] tmp196_191 = this.b;
      tmp196_191[18] = ((byte)(tmp196_191[18] | 0x10));
    }
  }
  
  void a(byte paramByte)
  {
    this.b[16] = paramByte;
    if ((paramByte == 0) || (paramByte == 2))
    {
      byte[] tmp23_18 = this.b;
      tmp23_18[18] = ((byte)(tmp23_18[18] & 0xEF));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zanc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */