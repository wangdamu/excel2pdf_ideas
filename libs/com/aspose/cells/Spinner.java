package com.aspose.cells;

public class Spinner
  extends Shape
{
  int a = 0;
  int b = 0;
  int c = 30000;
  int d = 1;
  int e = 10;
  private boolean C = false;
  int f = 15;
  
  Spinner(ShapeCollection shapes)
  {
    super(shapes, 16, shapes);
    this.B = true;
  }
  
  public int getCurrentValue()
  {
    return this.a;
  }
  
  public void setCurrentValue(int value)
  {
    c(value);
    if (value < (this.b & 0xFFFF)) {
      this.a = this.b;
    } else if (value > (this.c & 0xFFFF)) {
      this.a = this.c;
    } else {
      this.a = value;
    }
    Cell localCell = e(true);
    if (localCell != null) {
      if (value >= 0) {
        localCell.putValue((this.a & 0xFFFF) + 1);
      } else {
        localCell.putValue((String)null);
      }
    }
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public int getMin()
  {
    return this.b;
  }
  
  public void setMin(int value)
  {
    c(value);
    if (value > (this.c & 0xFFFF)) {
      throw new IllegalArgumentException("The scroll value maximum cannot be less than the scroll value minmum");
    }
    this.b = value;
    if ((this.a & 0xFFFF) < value) {
      this.a = value;
    }
  }
  
  public int getMax()
  {
    return this.c;
  }
  
  public void setMax(int value)
  {
    c(value);
    if (value < (this.b & 0xFFFF)) {
      throw new IllegalArgumentException("The scroll value maximum cannot be less than the scroll value minmum");
    }
    this.c = value;
    if ((this.a & 0xFFFF) > value) {
      this.a = value;
    }
  }
  
  public int getIncrementalChange()
  {
    return this.d;
  }
  
  public void setIncrementalChange(int value)
  {
    c(value);
    this.d = value;
  }
  
  int a()
  {
    return this.e;
  }
  
  void b(int paramInt)
  {
    c(paramInt);
    this.e = paramInt;
  }
  
  private void c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 30000)) {
      throw new IllegalArgumentException("Scroll value must be between 0 and 30000.");
    }
  }
  
  public boolean getShadow()
  {
    return this.B;
  }
  
  public void setShadow(boolean value)
  {
    this.B = value;
  }
  
  public boolean isHorizontal()
  {
    return this.C;
  }
  
  public void setHorizontal(boolean value)
  {
    this.C = value;
  }
  
  void a(Spinner paramSpinner, CopyOptions paramCopyOptions)
  {
    this.f = paramSpinner.f;
    this.C = paramSpinner.C;
    this.b = paramSpinner.b;
    this.c = paramSpinner.c;
    this.e = paramSpinner.e;
    this.d = paramSpinner.d;
    this.a = paramSpinner.a;
    super.a(paramSpinner, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Spinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */