package com.aspose.cells;

public class Legend
  extends ChartFrame
{
  int i = 1;
  private int k = 3;
  private LegendEntryCollection l;
  private int m = 0;
  private int n = 0;
  private boolean o = false;
  private boolean p = false;
  boolean j = false;
  
  Legend(Chart chart)
  {
    super(chart);
    if (chart.getChartArea() != null) {
      this.m_AutoScaleFont = chart.getChartArea().getAutoScaleFont();
    }
    b(2);
  }
  
  public int getPosition()
  {
    return this.k;
  }
  
  public void setPosition(int value)
  {
    if (value == 7)
    {
      if ((this.k == 4) || (this.k == 3) || (this.k == 1)) {
        this.o = true;
      }
      getChart().getPlotArea().j(true);
    }
    else
    {
      e(true);
      f(true);
      g(true);
    }
    this.k = value;
  }
  
  void a(int paramInt)
  {
    this.k = paramInt;
  }
  
  public LegendEntryCollection getLegendEntries()
  {
    if (this.l == null) {
      this.l = new LegendEntryCollection(getChart());
    }
    return this.l;
  }
  
  int a()
  {
    return this.m;
  }
  
  void n(int paramInt)
  {
    this.m = paramInt;
  }
  
  int E()
  {
    return this.n;
  }
  
  void o(int paramInt)
  {
    this.n = paramInt;
  }
  
  LegendEntryCollection F()
  {
    return this.l;
  }
  
  boolean G()
  {
    return this.o;
  }
  
  void j(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  void H()
  {
    this.l = null;
  }
  
  void a(Legend paramLegend, CopyOptions paramCopyOptions)
  {
    super.a(paramLegend, paramCopyOptions);
    this.k = paramLegend.k;
    if ((paramCopyOptions.i() != paramCopyOptions.j()) && (!paramLegend.p) && (paramCopyOptions.i() == 1))
    {
      this.k = 7;
      this.e = false;
      this.f = false;
      this.g = false;
    }
    this.o = paramLegend.o;
    if ((paramLegend.l != null) && (paramLegend.l.getCount() != 0))
    {
      this.l = new LegendEntryCollection(getChart());
      this.l.a(paramLegend.l);
    }
    this.p = paramLegend.p;
    this.j = paramLegend.j;
    this.m = paramLegend.m;
    this.n = paramLegend.n;
  }
  
  public boolean isOverLay()
  {
    return this.p;
  }
  
  public void setOverLay(boolean value)
  {
    this.p = value;
    this.j = true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Legend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */