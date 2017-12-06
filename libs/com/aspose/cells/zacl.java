package com.aspose.cells;

class zacl
  extends zcd
{
  zacl(byte paramByte)
  {
    c(4146);
    b(4);
    this.b = new byte[4];
    this.b[2] = paramByte;
  }
  
  void a(ChartFrame paramChartFrame)
  {
    if (paramChartFrame.getShadow())
    {
      int tmp12_11 = 0;
      byte[] tmp12_8 = this.b;
      tmp12_8[tmp12_11] = ((byte)(tmp12_8[tmp12_11] | 0x4));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */