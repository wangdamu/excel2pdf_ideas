package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zgq
  extends zcd
{
  zgq()
  {
    c(4128);
    b(8);
    this.b = new byte[8];
    this.b[0] = 1;
    this.b[2] = 1;
    this.b[4] = 1;
    this.b[6] = 1;
  }
  
  void a(int paramInt)
  {
    this.b[6] = 0;
  }
  
  void a(Axis paramAxis)
  {
    if (paramAxis.getCrossType() == 1)
    {
      byte[] tmp14_9 = this.b;
      tmp14_9[6] = ((byte)(tmp14_9[6] | 0x2));
    }
    else if ((paramAxis.getCrossType() == 2) && (paramAxis.getCategoryType() != 2))
    {
      System.arraycopy(zc.a((int)paramAxis.getCrossAt()), 0, this.b, 0, 2);
    }
    System.arraycopy(zc.a(paramAxis.getTickLabelSpacing()), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramAxis.getTickMarkSpacing()), 0, this.b, 4, 2);
    if (paramAxis.isPlotOrderReversed())
    {
      byte[] tmp104_99 = this.b;
      tmp104_99[6] = ((byte)(tmp104_99[6] | 0x4));
    }
    if (!paramAxis.getAxisBetweenCategories())
    {
      byte[] tmp123_118 = this.b;
      tmp123_118[6] = ((byte)(tmp123_118[6] & 0xFE));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */