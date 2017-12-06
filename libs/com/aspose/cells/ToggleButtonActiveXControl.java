package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

public class ToggleButtonActiveXControl
  extends ActiveXControl
{
  private static final za f = new za(new String[] { "1", "0" });
  
  ToggleButtonActiveXControl(Shape shape)
  {
    super(shape);
    this.e = new zapr();
    c().b = -2147483640;
  }
  
  private zapr c()
  {
    return (zapr)this.e;
  }
  
  public int getType()
  {
    return 9;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = -2134900410;
      this.e.b = -2147483630;
      this.e.c = -2147483633;
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      c().t = 6;
      c().G = "0";
      c().n = this.b.A();
      this.c = zaj.j;
    }
  }
  
  int a(int paramInt)
  {
    return zapr.b(paramInt);
  }
  
  public String getCaption()
  {
    return this.e.n;
  }
  
  public void setCaption(String value)
  {
    this.e.n = value;
    b(16);
  }
  
  public int getPicturePosition()
  {
    return this.e.l;
  }
  
  public void setPicturePosition(int value)
  {
    this.e.l = value;
    b(12);
  }
  
  public int getSpecialEffect()
  {
    return this.e.f & 0xFF;
  }
  
  public void setSpecialEffect(int value)
  {
    this.e.f = ((byte)value);
    b(7);
  }
  
  public byte[] getPicture()
  {
    return this.e.j;
  }
  
  public void setPicture(byte[] value)
  {
    this.e.j = value;
    b(9);
  }
  
  public char getAccelerator()
  {
    return this.e.m;
  }
  
  public void setAccelerator(char value)
  {
    this.e.m = value;
    b(0);
  }
  
  public int getValue()
  {
    if (c().G == null) {
      return 0;
    }
    switch (f.a(c().G))
    {
    case 0: 
      return 1;
    case 1: 
      return 0;
    }
    return 2;
  }
  
  public void setValue(int value)
  {
    switch (value)
    {
    case 1: 
      c().G = "1";
      break;
    case 0: 
      c().G = "0";
      break;
    default: 
      c().G = "2";
    }
    b(40);
  }
  
  public boolean isTripleState()
  {
    return (c(39)) && (c().F == 1);
  }
  
  public void setTripleState(boolean value)
  {
    c().F = ((byte)(value ? 1 : 0));
    a(39, value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ToggleButtonActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */