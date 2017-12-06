package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

public class CheckBoxActiveXControl
  extends ActiveXControl
{
  private static final za f = new za(new String[] { "1", "0" });
  
  CheckBoxActiveXControl(Shape shape)
  {
    super(shape);
    this.e = new zapr();
  }
  
  private zapr c()
  {
    return (zapr)this.e;
  }
  
  public int getType()
  {
    return 2;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = -2134900416;
      b(41);
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      c().t = 4;
      c().G = "0";
      c().n = this.b.A();
      c().H = this.b.Q().getName();
      this.c = zaj.c;
    }
  }
  
  int a(int paramInt)
  {
    return zapr.b(paramInt);
  }
  
  public String getGroupName()
  {
    return c().H;
  }
  
  public void setGroupName(String value)
  {
    c().H = value;
    b(41);
  }
  
  public int getAlignment()
  {
    return this.e.a(13) ? 0 : 1;
  }
  
  public void setAlignment(int value)
  {
    this.e.a(13, value == 0);
    b(14);
  }
  
  public boolean isWordWrapped()
  {
    return this.e.a(23);
  }
  
  public void setWordWrapped(boolean value)
  {
    this.e.a(23, value);
    b(14);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CheckBoxActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */