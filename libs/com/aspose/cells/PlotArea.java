package com.aspose.cells;

public class PlotArea
  extends ChartFrame
{
  int i;
  int j;
  int k;
  int l;
  byte[] m;
  byte[] n;
  private boolean o = false;
  private String p;
  
  void a()
  {
    if (ChartCollection.c(getChart().getType()))
    {
      getBorder().setVisible(false);
      getArea().setFormatting(1);
    }
    else
    {
      getBorder().a(Color.fromArgb(128, 128, 128));
      getBorder().setWeight(0);
      getArea().setForegroundColor(Color.fromArgb(192, 192, 192));
    }
  }
  
  PlotArea(Chart chart)
  {
    super(chart);
    b(1);
  }
  
  public int getX()
  {
    return q();
  }
  
  public void setX(int value)
  {
    e(value);
    h(false);
    this.e = false;
    setInnerMode(false);
  }
  
  public int getY()
  {
    return r();
  }
  
  public void setY(int value)
  {
    f(value);
    h(false);
    this.f = false;
    setInnerMode(false);
  }
  
  public int getHeight()
  {
    return s();
  }
  
  public void setHeight(int value)
  {
    g(value);
    h(false);
    this.g = false;
    setInnerMode(false);
  }
  
  public int getWidth()
  {
    return t();
  }
  
  public void setWidth(int value)
  {
    h(value);
    h(false);
    this.g = false;
    setInnerMode(false);
  }
  
  public int getInnerX()
  {
    return this.i;
  }
  
  public void setInnerX(int value)
  {
    this.i = value;
    h(false);
    this.e = false;
    setInnerMode(true);
  }
  
  public int getInnerY()
  {
    return this.j;
  }
  
  public void setInnerY(int value)
  {
    this.j = value;
    h(false);
    this.f = false;
    setInnerMode(true);
  }
  
  public int getInnerHeight()
  {
    return this.l;
  }
  
  public void setInnerHeight(int value)
  {
    this.l = value;
    h(false);
    this.g = false;
    setInnerMode(true);
  }
  
  public int getInnerWidth()
  {
    return this.k;
  }
  
  public void setInnerWidth(int value)
  {
    this.k = value;
    h(false);
    this.g = false;
    setInnerMode(true);
  }
  
  public void setPositionAuto()
  {
    super.setPositionAuto();
    getChart().a((byte)(getChart().k() & 0xFF & 0xE7));
  }
  
  void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.i = paramInt1;
    this.j = paramInt2;
    this.k = paramInt3;
    this.l = paramInt4;
  }
  
  boolean E()
  {
    return this.o;
  }
  
  void j(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  String F()
  {
    return this.p;
  }
  
  void a(String paramString)
  {
    this.p = paramString;
  }
  
  void a(PlotArea paramPlotArea, CopyOptions paramCopyOptions)
  {
    super.a(paramPlotArea, paramCopyOptions);
    if ((paramCopyOptions.i() != paramCopyOptions.j()) && (paramCopyOptions.i() == 1))
    {
      this.e = false;
      this.f = false;
      this.g = false;
    }
    this.i = paramPlotArea.getInnerX();
    this.j = paramPlotArea.getInnerY();
    this.k = paramPlotArea.getInnerWidth();
    this.l = paramPlotArea.getInnerHeight();
    this.n = paramPlotArea.n;
    this.o = paramPlotArea.o;
    this.p = paramPlotArea.p;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PlotArea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */