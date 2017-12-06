package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zkk
  extends zcd
{
  zkk(Chart paramChart)
  {
    c(4098);
    b(16);
    this.b = new byte[16];
    if (paramChart.getWorksheet().getType() == 2)
    {
      a(paramChart, paramChart.getChartObject().getLeftToCorner(), 0);
      a(paramChart, paramChart.getChartObject().getTopToCorner(), 4);
    }
    a(paramChart, paramChart.getChartObject().getWidth(), 8);
    a(paramChart, paramChart.getChartObject().getHeight(), 12);
  }
  
  void a(Chart paramChart, int paramInt1, int paramInt2)
  {
    double d = paramInt1 * 72.0F / zbxp.a();
    System.arraycopy(zc.a((int)d), 0, this.b, paramInt2 + 2, 2);
    d -= (int)d;
    System.arraycopy(zc.a((int)(d * 65535.0D + 0.5D)), 0, this.b, paramInt2, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */