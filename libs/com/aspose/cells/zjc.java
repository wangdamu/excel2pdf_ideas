package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zjc
  extends zcd
{
  zjc()
  {
    c(4154);
    b(14);
    this.b = new byte[14];
    this.b[0] = 20;
    this.b[2] = 15;
    this.b[4] = 30;
    this.b[6] = 100;
    this.b[8] = 100;
    this.b[10] = -106;
  }
  
  void a(int paramInt)
  {
    System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
  }
  
  void d(int paramInt)
  {
    System.arraycopy(zc.a((short)paramInt), 0, this.b, 2, 2);
  }
  
  void e(int paramInt)
  {
    System.arraycopy(zc.a((short)paramInt), 0, this.b, 4, 2);
  }
  
  void f(int paramInt)
  {
    System.arraycopy(zc.a((short)paramInt), 0, this.b, 6, 2);
  }
  
  void g(int paramInt)
  {
    System.arraycopy(zc.a(paramInt), 0, this.b, 8, 2);
  }
  
  void h(int paramInt)
  {
    System.arraycopy(zc.a(paramInt), 0, this.b, 10, 2);
  }
  
  void a(Chart paramChart)
  {
    a(paramChart.getRotationAngle());
    d(paramChart.getElevation());
    e(paramChart.getPerspective() * 2);
    f(paramChart.getHeightPercent());
    g(paramChart.getDepthPercent());
    h(paramChart.getGapDepth());
    int i = 20;
    i = 20;
    if (!paramChart.getAutoScaling()) {
      i = (byte)(i & 0xFB);
    }
    if (!paramChart.getRightAngleAxes()) {
      i = (byte)(i | 0x1);
    }
    switch (paramChart.getType())
    {
    case 9: 
    case 18: 
    case 21: 
    case 24: 
    case 28: 
    case 31: 
    case 50: 
    case 53: 
      i = (byte)(i | 0x2);
    }
    if (paramChart.getWallsAndGridlines2D()) {
      i = (byte)(i | 0x20);
    }
    this.b[12] = i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */