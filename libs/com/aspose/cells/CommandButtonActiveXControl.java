package com.aspose.cells;

public class CommandButtonActiveXControl
  extends ActiveXControl
{
  CommandButtonActiveXControl(Shape shape)
  {
    super(shape);
    this.e = new zag();
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = 40;
      this.e.b = -2147483630;
      this.e.c = -2147483633;
      this.e.n = this.b.A();
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      this.c = zaj.a;
      a();
    }
  }
  
  public int getType()
  {
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
  
  public boolean getTakeFocusOnClick()
  {
    return c(24);
  }
  
  public void setTakeFocusOnClick(boolean value)
  {
    b(24);
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
    case 9: 
      return 128;
    case 0: 
      return 256;
    case 24: 
      return 512;
    case 15: 
      return 1024;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CommandButtonActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */