package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaxo
  extends zcd
{
  zaxo(boolean paramBoolean)
  {
    c(4175);
    b(20);
    this.b = new byte[20];
    if (paramBoolean) {
      this.b[0] = 5;
    } else {
      this.b[0] = 2;
    }
    this.b[2] = 2;
  }
  
  void a(ChartFrame paramChartFrame)
    throws Exception
  {
    if (paramChartFrame.getWidth() + paramChartFrame.getHeight() == 0) {
      paramChartFrame.getChart().a(false, false);
    }
    System.arraycopy(zc.a(paramChartFrame.getX()), 0, this.b, 4, 2);
    System.arraycopy(zc.a(paramChartFrame.getY()), 0, this.b, 8, 4);
    System.arraycopy(zc.a(paramChartFrame.getWidth()), 0, this.b, 12, 4);
    System.arraycopy(zc.a(paramChartFrame.getHeight()), 0, this.b, 16, 4);
  }
  
  int[] a(Legend paramLegend)
  {
    int[] arrayOfInt = new int[2];
    System.arraycopy(zc.a(paramLegend.getX()), 0, this.b, 4, 4);
    System.arraycopy(zc.a(paramLegend.getY()), 0, this.b, 8, 4);
    if (!paramLegend.p())
    {
      arrayOfInt[0] = ((int)(paramLegend.getWidth() / 4000.0F * paramLegend.getChart().getChartObject().getWidthPt() - paramLegend.a()));
      arrayOfInt[1] = ((int)(paramLegend.getHeight() / 4000.0F * paramLegend.getChart().getChartObject().getHeightPt() - paramLegend.E()));
      System.arraycopy(zc.a(arrayOfInt[0]), 0, this.b, 12, 4);
      System.arraycopy(zc.a(arrayOfInt[1]), 0, this.b, 16, 4);
      this.b[2] = 1;
    }
    return arrayOfInt;
  }
  
  void a(Title paramTitle)
    throws Exception
  {
    int i;
    int j;
    if ((paramTitle.f() == 3) && ((paramTitle.d()) || (paramTitle.e())))
    {
      paramTitle.getChart().a(false, false);
      i = paramTitle.getX() - paramTitle.getDefaultX();
      j = paramTitle.getY() - paramTitle.getDefaultY();
      System.arraycopy(zc.a(i), 0, this.b, 4, 4);
      System.arraycopy(zc.a(j), 0, this.b, 8, 4);
    }
    else if ((paramTitle.f() == 4) && ((paramTitle.d()) || (paramTitle.e())) && (paramTitle.k != null) && ((paramTitle.k instanceof Axis)))
    {
      paramTitle.getChart().a(false, false);
      i = paramTitle.getX() - paramTitle.getDefaultX();
      j = paramTitle.getY() - paramTitle.getDefaultY();
      Axis localAxis = paramTitle.k;
      float f1 = i * localAxis.a().getChartObject().getWidth() / 4000.0F;
      float f2 = j * localAxis.a().getChartObject().getHeight() / 4000.0F;
      float f3 = localAxis.a().getPlotArea().getWidth() * localAxis.a().getChartObject().getWidth() / 4000.0F;
      float f4 = localAxis.a().getPlotArea().getHeight() * localAxis.a().getChartObject().getHeight() / 4000.0F;
      int k = (int)(f1 * 1000.0F / f3 + 0.5D);
      int m = (int)(f2 * 1000.0F / f4 + 0.5D);
      int n = 0;
      int i1 = 0;
      if (localAxis.c() == 0)
      {
        m = -m;
        n = k;
        i1 = m;
      }
      else if (localAxis.c() == 1)
      {
        k = -k;
        m = -m;
        n = k;
        i1 = m;
      }
      else if (localAxis.c() == 3)
      {
        m = -m;
        n = m;
        i1 = k;
      }
      else if (localAxis.c() == 2)
      {
        n = m;
        i1 = k;
      }
      System.arraycopy(zc.a(n), 0, this.b, 4, 4);
      System.arraycopy(zc.a(i1), 0, this.b, 8, 4);
    }
    else
    {
      System.arraycopy(zc.a(paramTitle.z()), 0, this.b, 4, 4);
      System.arraycopy(zc.a(paramTitle.A()), 0, this.b, 8, 4);
    }
    if (paramTitle.B() == 0)
    {
      this.b[12] = 25;
      this.b[16] = 23;
    }
    else
    {
      i = paramTitle.B();
      j = paramTitle.C();
      if ((i == 0) || (j == 0))
      {
        paramTitle.getChart().a(false, false);
        i = paramTitle.B();
        j = paramTitle.C();
      }
      System.arraycopy(zc.a(i), 0, this.b, 12, 4);
      System.arraycopy(zc.a(j), 0, this.b, 16, 4);
    }
  }
  
  void a(DataLabels paramDataLabels)
    throws Exception
  {
    if ((paramDataLabels.d()) || (paramDataLabels.e()))
    {
      paramDataLabels.getChart().a(false, false);
      i = paramDataLabels.getX() - paramDataLabels.getDefaultX();
      j = paramDataLabels.getY() - paramDataLabels.getDefaultY();
      float f1 = i * paramDataLabels.getChart().getChartObject().getWidth() / 4000.0F;
      float f2 = j * paramDataLabels.getChart().getChartObject().getHeight() / 4000.0F;
      float f3 = paramDataLabels.getChart().getPlotArea().getWidth() * paramDataLabels.getChart().getChartObject().getWidth() / 4000.0F;
      float f4 = paramDataLabels.getChart().getPlotArea().getHeight() * paramDataLabels.getChart().getChartObject().getHeight() / 4000.0F;
      int k = (int)(f1 * 1000.0F / f3 + 0.5D);
      int m = (int)(f2 * 1000.0F / f4 + 0.5D);
      if (paramDataLabels.K() == 6)
      {
        k = -k;
        m = -m;
      }
      System.arraycopy(zc.a(k), 0, this.b, 4, 4);
      System.arraycopy(zc.a(m), 0, this.b, 8, 4);
    }
    else
    {
      System.arraycopy(zc.a(paramDataLabels.z()), 0, this.b, 4, 4);
      System.arraycopy(zc.a(paramDataLabels.A()), 0, this.b, 8, 4);
    }
    int i = paramDataLabels.B();
    int j = paramDataLabels.C();
    if ((i == 0) || (j == 0))
    {
      paramDataLabels.getChart().a(false, false);
      i = paramDataLabels.B();
      j = paramDataLabels.C();
    }
    System.arraycopy(zc.a(i), 0, this.b, 12, 4);
    System.arraycopy(zc.a(j), 0, this.b, 16, 4);
  }
  
  void a(DisplayUnitLabel paramDisplayUnitLabel)
    throws Exception
  {
    if ((paramDisplayUnitLabel.d()) || (paramDisplayUnitLabel.e()))
    {
      paramDisplayUnitLabel.getChart().a(false, false);
      i = paramDisplayUnitLabel.getX() - paramDisplayUnitLabel.getDefaultX();
      j = paramDisplayUnitLabel.getY() - paramDisplayUnitLabel.getDefaultY();
      Axis localAxis = paramDisplayUnitLabel.J();
      float f1 = i * localAxis.a().getChartObject().getWidth() / 4000.0F;
      float f2 = j * localAxis.a().getChartObject().getHeight() / 4000.0F;
      float f3 = localAxis.a().getPlotArea().getWidth() * localAxis.a().getChartObject().getWidth() / 4000.0F;
      float f4 = localAxis.a().getPlotArea().getHeight() * localAxis.a().getChartObject().getHeight() / 4000.0F;
      int k = (int)(f1 * 1000.0F / f3 + 0.5D);
      int m = (int)(f2 * 1000.0F / f4 + 0.5D);
      System.arraycopy(zc.a(k), 0, this.b, 4, 4);
      System.arraycopy(zc.a(m), 0, this.b, 8, 4);
    }
    else
    {
      System.arraycopy(zc.a(paramDisplayUnitLabel.z()), 0, this.b, 4, 4);
      System.arraycopy(zc.a(paramDisplayUnitLabel.A()), 0, this.b, 8, 4);
    }
    int i = paramDisplayUnitLabel.B();
    int j = paramDisplayUnitLabel.C();
    if ((i == 0) || (j == 0))
    {
      paramDisplayUnitLabel.getChart().a(false, false);
      i = paramDisplayUnitLabel.B();
      j = paramDisplayUnitLabel.C();
    }
    System.arraycopy(zc.a(paramDisplayUnitLabel.B()), 0, this.b, 12, 4);
    System.arraycopy(zc.a(paramDisplayUnitLabel.C()), 0, this.b, 16, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */