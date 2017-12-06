package com.aspose.cells;

public class ScrollBarActiveXControl
  extends SpinButtonActiveXControl
{
  ScrollBarActiveXControl(Shape shape)
  {
    super(shape);
    c().r = 32767;
  }
  
  public int getType()
  {
    return 10;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = 2056;
      c().y = 3;
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      this.c = zaj.k;
    }
  }
  
  public int getLargeChange()
  {
    return c().x;
  }
  
  public void setLargeChange(int value)
  {
    c().x = value;
    b(49);
  }
  
  int a(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    case 3: 
      i = 0;
      break;
    case 4: 
      i = 1;
      break;
    case 14: 
      i = 2;
      break;
    case 8: 
      i = 3;
      break;
    case 5: 
      i = 4;
      break;
    case 43: 
      i = 5;
      break;
    case 44: 
      i = 6;
      break;
    case 45: 
      i = 7;
      break;
    case 46: 
      i = 9;
      break;
    case 47: 
      i = 10;
      break;
    case 48: 
      i = 11;
      break;
    case 49: 
      i = 12;
      break;
    case 50: 
      i = 13;
      break;
    case 51: 
      i = 14;
      break;
    case 52: 
      i = 15;
      break;
    case 15: 
      i = 16;
      break;
    case 6: 
    case 7: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    default: 
      return 0;
    }
    return 1 << i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ScrollBarActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */