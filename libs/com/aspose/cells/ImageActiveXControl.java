package com.aspose.cells;

public class ImageActiveXControl
  extends ActiveXControl
{
  ImageActiveXControl(Shape shape)
  {
    super(shape);
    this.e = new zag();
    this.e.a = 27;
    this.e.f = 0;
    this.e.d = 1;
    this.e.e = -2147483642;
    this.e.c = -2147483633;
    this.e.p = 2;
  }
  
  public int getType()
  {
    return 8;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = 512;
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      this.c = zaj.i;
    }
  }
  
  int a(int paramInt)
  {
    switch (paramInt)
    {
    case 13: 
      return 4;
    case 2: 
      return 8;
    case 4: 
      return 16;
    case 1: 
      return 32;
    case 5: 
      return 64;
    case 6: 
      return 128;
    case 7: 
      return 256;
    case 8: 
      return 512;
    case 9: 
      return 1024;
    case 10: 
      return 2048;
    case 11: 
      return 4096;
    case 14: 
      return 8192;
    case 15: 
      return 16384;
    }
    return 0;
  }
  
  public boolean isAutoSize()
  {
    return c(13);
  }
  
  public void setAutoSize(boolean value)
  {
    b(13);
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
  
  public int getPictureSizeMode()
  {
    return this.e.o & 0xFF;
  }
  
  public void setPictureSizeMode(int value)
  {
    this.e.o = ((byte)value);
    b(6);
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
  
  public int getPictureAlignment()
  {
    return this.e.p & 0xFF;
  }
  
  public void setPictureAlignment(int value)
  {
    this.e.p = ((byte)value);
    b(10);
  }
  
  public boolean isTiled()
  {
    return c(11);
  }
  
  public void setTiled(boolean value)
  {
    b(11);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ImageActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */