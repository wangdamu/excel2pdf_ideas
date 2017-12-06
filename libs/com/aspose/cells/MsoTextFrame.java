package com.aspose.cells;

public class MsoTextFrame
{
  private Shape a;
  
  MsoTextFrame(Shape shape)
  {
    this.a = shape;
  }
  
  public boolean getAutoSize()
    throws Exception
  {
    return this.a.x == null ? false : this.a.x.getTextAlignment().getAutoSize();
  }
  
  public void setAutoSize(boolean value)
    throws Exception
  {
    this.a.getTextBody().getTextAlignment().setAutoSize(value);
  }
  
  public boolean isAutoMargin()
    throws Exception
  {
    return this.a.x == null ? true : this.a.x.getTextAlignment().l();
  }
  
  public void setAutoMargin(boolean value)
    throws Exception
  {
    this.a.getTextBody().getTextAlignment().e(value);
  }
  
  int a()
    throws Exception
  {
    return this.a.x == null ? (int)(7.2D * znq.j + 0.5D) : this.a.x.getTextAlignment().j();
  }
  
  void a(int paramInt)
    throws Exception
  {
    this.a.getTextBody().getTextAlignment().d(paramInt);
  }
  
  public double getLeftMarginPt()
    throws Exception
  {
    return a() / znq.j;
  }
  
  public void setLeftMarginPt(double value)
    throws Exception
  {
    a((int)(value * znq.j + 0.5D));
  }
  
  int b()
    throws Exception
  {
    return this.a.x == null ? (int)(7.2D * znq.j + 0.5D) : this.a.x.getTextAlignment().k();
  }
  
  void b(int paramInt)
    throws Exception
  {
    this.a.getTextBody().getTextAlignment().e(paramInt);
  }
  
  public double getRightMarginPt()
    throws Exception
  {
    return b() / znq.j;
  }
  
  public void setRightMarginPt(double value)
    throws Exception
  {
    b((int)(value * znq.j + 0.5D));
  }
  
  int c()
    throws Exception
  {
    return this.a.x == null ? (int)(306.0D * znq.j + 0.5D) : this.a.x.getTextAlignment().h();
  }
  
  void c(int paramInt)
    throws Exception
  {
    this.a.getTextBody().getTextAlignment().b(paramInt);
  }
  
  public double getTopMarginPt()
    throws Exception
  {
    return c() / znq.j;
  }
  
  public void setTopMarginPt(double value)
    throws Exception
  {
    c((int)(value * znq.j + 0.5D));
  }
  
  int d()
    throws Exception
  {
    return this.a.x == null ? (int)(306.0D * znq.j + 0.5D) : this.a.x.getTextAlignment().i();
  }
  
  void d(int paramInt)
    throws Exception
  {
    this.a.getTextBody().getTextAlignment().c(paramInt);
  }
  
  public double getBottomMarginPt()
    throws Exception
  {
    return d() / znq.j;
  }
  
  public void setBottomMarginPt(double value)
    throws Exception
  {
    d((int)(value * znq.j + 0.5D));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MsoTextFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */