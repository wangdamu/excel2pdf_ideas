package com.aspose.cells;

class zos
  extends zcd
{
  zos()
  {
    c(4195);
    b(2);
    this.b = new byte[2];
    this.b[0] = 15;
  }
  
  void a(ChartDataTable paramChartDataTable)
  {
    if (!paramChartDataTable.hasBorderHorizontal())
    {
      int tmp12_11 = 0;
      byte[] tmp12_8 = this.b;
      tmp12_8[tmp12_11] = ((byte)(tmp12_8[tmp12_11] & 0xFE));
    }
    if (!paramChartDataTable.hasBorderVertical())
    {
      int tmp32_31 = 0;
      byte[] tmp32_28 = this.b;
      tmp32_28[tmp32_31] = ((byte)(tmp32_28[tmp32_31] & 0xFD));
    }
    if (!paramChartDataTable.hasBorderOutline())
    {
      int tmp52_51 = 0;
      byte[] tmp52_48 = this.b;
      tmp52_48[tmp52_51] = ((byte)(tmp52_48[tmp52_51] & 0xFB));
    }
    if (!paramChartDataTable.getShowLegendKey())
    {
      int tmp72_71 = 0;
      byte[] tmp72_68 = this.b;
      tmp72_68[tmp72_71] = ((byte)(tmp72_68[tmp72_71] & 0x7));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */