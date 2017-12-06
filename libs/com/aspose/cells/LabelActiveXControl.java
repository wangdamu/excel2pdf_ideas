package com.aspose.cells;

public class LabelActiveXControl
  extends ActiveXControl
{
  LabelActiveXControl(Shape shape)
  {
    super(shape);
    this.e = new zag();
    this.e.a = 8388635;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = 43;
      this.e.e = -2147483642;
      this.e.b = -2147483640;
      this.e.c = -2147483643;
      this.e.n = this.b.A();
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      this.c = zaj.h;
      a();
    }
  }
  
  public int getType()
  {
    return 7;
  }
  
  int a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return 1;
    case 4: 
      return 2;
    case 14: 
      return 4;
    case 16: 
      return 8;
    case 12: 
      return 16;
    case 8: 
      return 32;
    case 5: 
      return 64;
    case 2: 
      return 128;
    case 1: 
      return 256;
    case 7: 
      return 512;
    case 9: 
      return 1024;
    case 0: 
      return 2048;
    case 15: 
      return 4096;
    }
    return 0;
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
  
  public int getBorderOleColor()
  {
    return this.e.e;
  }
  
  public void setBorderOleColor(int value)
  {
    this.e.e = value;
    b(2);
  }
  
  public int getBorderStyle()
  {
    return this.e.d & 0xFF;
  }
  
  public void setBorderStyle(int value)
  {
    this.e.d = 1;
    b(1);
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
  
  public boolean isWordWrapped()
  {
    return this.e.a(23);
  }
  
  public void setWordWrapped(boolean value)
  {
    this.e.a(23, value);
    b(14);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LabelActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */