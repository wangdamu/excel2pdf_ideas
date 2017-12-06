package com.aspose.cells;

public class GradientStop
{
  private GradientStopCollection b;
  private int c = 0;
  zaml a;
  
  GradientStop(GradientStopCollection stops)
  {
    this.b = stops;
    this.a = new zaml(true);
  }
  
  public double getPosition()
  {
    return this.c / 1000.0D;
  }
  
  public void setPosition(double value)
  {
    this.c = ((int)(value * 1000.0D + 0.5D));
  }
  
  public CellsColor getCellsColor()
  {
    Workbook localWorkbook = this.b.a().e;
    CellsColor localCellsColor = new CellsColor(localWorkbook);
    localCellsColor.a = this.a;
    return localCellsColor;
  }
  
  int a()
  {
    return zaml.e(this.a);
  }
  
  void a(int paramInt)
  {
    this.a = zaml.a(this.a, paramInt);
  }
  
  public double getTransparency()
  {
    return zaml.d(this.a);
  }
  
  public void setTransparency(double value)
  {
    this.a = zaml.a(this.a, value);
  }
  
  void a(GradientStop paramGradientStop, CopyOptions paramCopyOptions)
  {
    this.a.b(paramGradientStop.a, paramCopyOptions);
    this.c = paramGradientStop.c;
  }
  
  boolean a(GradientStop paramGradientStop)
  {
    if (!this.a.g(paramGradientStop.a)) {
      return false;
    }
    return this.c == paramGradientStop.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/GradientStop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */