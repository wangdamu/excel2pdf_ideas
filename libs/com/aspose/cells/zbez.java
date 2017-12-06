package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbez
  extends zcd
{
  zbez()
  {
    c(4171);
    b(28);
    this.b = new byte[28];
  }
  
  void a(Trendline paramTrendline)
  {
    this.b[1] = 1;
    switch (paramTrendline.getType())
    {
    case 0: 
      this.b[0] = 1;
      break;
    case 2: 
      this.b[0] = 2;
      break;
    case 3: 
      this.b[0] = 4;
      this.b[1] = ((byte)paramTrendline.getPeriod());
      break;
    case 4: 
      this.b[1] = ((byte)paramTrendline.getOrder());
      break;
    case 5: 
      this.b[0] = 3;
    }
    System.arraycopy(zc.a(paramTrendline.getIntercept()), 0, this.b, 2, 8);
    if (!paramTrendline.c())
    {
      for (int i = 2; i < 6; i++) {
        this.b[i] = -1;
      }
      this.b[7] = 1;
      this.b[8] = -1;
      this.b[9] = -1;
    }
    if (paramTrendline.getDisplayEquation()) {
      this.b[10] = 1;
    }
    if (paramTrendline.getDisplayRSquared()) {
      this.b[11] = 1;
    }
    System.arraycopy(zc.a(paramTrendline.getForward()), 0, this.b, 12, 8);
    System.arraycopy(zc.a(paramTrendline.getBackward()), 0, this.b, 20, 8);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */