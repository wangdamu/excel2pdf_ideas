package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbpa
  extends zcd
{
  long a = 0L;
  
  zbpa(Chart paramChart)
  {
    c(4164);
    b(4);
    this.b = new byte[4];
    int i = paramChart.k() & 0xFF;
    if ((!paramChart.getPlotArea().m()) || (!paramChart.getPlotArea().p())) {
      i |= 0x18;
    }
    if (paramChart.i.getCount() > 1) {
      i |= 0x1;
    }
    System.arraycopy(zc.a(i), 0, this.b, 0, 2);
    paramChart.a((byte)i);
    switch (paramChart.getPlotEmptyCellsType())
    {
    case 1: 
      this.b[2] = 1;
      break;
    case 2: 
      this.b[2] = 2;
    }
  }
  
  void a(Chart paramChart)
  {
    this.b = new byte[4];
    int i = paramChart.k() & 0xFF;
    if ((!paramChart.getPlotArea().m()) || (!paramChart.getPlotArea().p())) {
      i |= 0x18;
    }
    if (paramChart.i.getCount() > 1) {
      i |= 0x1;
    }
    System.arraycopy(zc.a(i), 0, this.b, 0, 2);
    paramChart.a((byte)i);
    switch (paramChart.getPlotEmptyCellsType())
    {
    case 1: 
      this.b[2] = 1;
      break;
    case 2: 
      this.b[2] = 2;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */