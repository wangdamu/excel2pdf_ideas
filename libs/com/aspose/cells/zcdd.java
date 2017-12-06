package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdd
  extends zche
{
  zcdd(SparklineGroup paramSparklineGroup)
    throws Exception
  {
    this.d = 1041;
    zcfz localzcfz = new zcfz(paramSparklineGroup);
    int i = localzcfz.c() + 94;
    this.c = new byte[i];
    int j = localzcfz.b(this.c, 0);
    System.arraycopy(zc.a(paramSparklineGroup.a), 0, this.c, j, 2);
    j += 2;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getSeriesColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getNegativePointsColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getHorizontalAxisColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getMarkersColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getFirstPointColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getLastPointColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getHighPointColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getSeriesColor() != null) {
      zche.a(this.c, j, paramSparklineGroup.getLowPointColor().a, 100, paramSparklineGroup.a().a().d());
    }
    j += 8;
    if (paramSparklineGroup.getVerticalAxisMaxValueType() == 2) {
      System.arraycopy(zc.a(paramSparklineGroup.c), 0, this.c, j, 8);
    }
    j += 8;
    if (paramSparklineGroup.getVerticalAxisMinValueType() == 2) {
      System.arraycopy(zc.a(paramSparklineGroup.d), 0, this.c, j, 8);
    }
    j += 8;
    System.arraycopy(zc.a(paramSparklineGroup.getLineWeight()), 0, this.c, j, 8);
    j += 8;
    switch (paramSparklineGroup.getType())
    {
    case 0: 
      this.c[j] = 0;
      paramSparklineGroup.setType(0);
      break;
    case 1: 
      this.c[j] = 1;
      break;
    case 2: 
      this.c[j] = 2;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */