package com.aspose.cells;

public class SpinButtonActiveXControl
  extends ActiveXControl
{
  SpinButtonActiveXControl(Shape shape)
  {
    super(shape);
    this.e = new zber();
    c().r = 100;
  }
  
  zber c()
  {
    return (zber)this.e;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = 2056;
      c().y = 3;
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      this.c = zaj.f;
    }
  }
  
  public int getType()
  {
    return 5;
  }
  
  public int getMin()
  {
    return c().s;
  }
  
  public void setMin(int value)
  {
    c().s = value;
    b(43);
  }
  
  public int getMax()
  {
    return c().r;
  }
  
  public void setMax(int value)
  {
    c().r = value;
    b(44);
  }
  
  public int getPosition()
  {
    return c().t;
  }
  
  public void setPosition(int value)
  {
    c().t = value;
    b(45);
  }
  
  public int getSmallChange()
  {
    return c().w;
  }
  
  public void setSmallChange(int value)
  {
    c().w = value;
    b(48);
  }
  
  public int getOrientation()
  {
    return c().y & 0xFF;
  }
  
  public void setOrientation(int value)
  {
    c().y = ((byte)value);
    b(50);
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
      i = 8;
      break;
    case 47: 
      i = 9;
      break;
    case 48: 
      i = 10;
      break;
    case 50: 
      i = 11;
      break;
    case 52: 
      i = 12;
      break;
    case 15: 
      i = 13;
      break;
    case 5: 
      i = 14;
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
    case 49: 
    case 51: 
    default: 
      return 0;
    }
    return 1 << i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SpinButtonActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */