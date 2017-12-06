package com.aspose.cells;

public class AboveAverage
{
  private boolean a = true;
  private boolean b = false;
  private int c;
  
  void a(AboveAverage paramAboveAverage)
  {
    this.a = paramAboveAverage.a;
    this.b = paramAboveAverage.b;
    this.c = paramAboveAverage.c;
  }
  
  public boolean isAboveAverage()
  {
    return this.a;
  }
  
  public void setAboveAverage(boolean value)
  {
    this.a = value;
  }
  
  public boolean isEqualAverage()
  {
    return this.b;
  }
  
  public void setEqualAverage(boolean value)
  {
    this.b = value;
    if (value) {
      this.c = 0;
    }
  }
  
  public int getStdDev()
  {
    return this.c;
  }
  
  public void setStdDev(int value)
  {
    if ((value < 0) || (value > 3)) {
      throw new CellsException(2, "Please input a integer between 0 and 3");
    }
    if ((value >= 1) && (value <= 3)) {
      setEqualAverage(false);
    }
    this.c = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/AboveAverage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */