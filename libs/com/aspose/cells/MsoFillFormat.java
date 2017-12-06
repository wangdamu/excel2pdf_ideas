package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.zr;

public class MsoFillFormat
{
  private FillFormat a;
  
  MsoFillFormat(FillFormat fillFormat)
  {
    this.a = fillFormat;
  }
  
  public Color getForeColor()
  {
    Color localColor = Color.getWhite();
    if (this.a.getFillType() == 2) {
      localColor = this.a.getSolidFill().getColor();
    } else if (this.a.getFillType() == 5) {
      localColor = this.a.getPatternFill().getForegroundColor();
    }
    if (zh.a(localColor)) {
      localColor = Color.getWhite();
    }
    return localColor;
  }
  
  public void setForeColor(Color value)
  {
    if (this.a.getFillType() == 2)
    {
      this.a.getSolidFill().setColor(value);
    }
    else if (this.a.getFillType() == 5)
    {
      this.a.getPatternFill().setForegroundColor(value);
    }
    else if ((this.a.getFillType() == 0) || (this.a.getFillType() == 1))
    {
      this.a.setFillType(2);
      this.a.getSolidFill().setColor(value);
    }
  }
  
  public double getTransparency()
  {
    return zr.b(1.0D - a(), 2);
  }
  
  public void setTransparency(double value)
  {
    a(1.0D - value);
  }
  
  double a()
  {
    double d = 1.0D;
    if (this.a.getFillType() == 2) {
      d = 1.0D - this.a.getSolidFill().getTransparency();
    } else if (this.a.getFillType() == 4) {
      d = 1.0D - this.a.getTextureFill().getTransparency();
    } else if (this.a.getFillType() == 5) {
      d = 1.0D - this.a.getPatternFill().getForeTransparency();
    }
    return d;
  }
  
  void a(double paramDouble)
  {
    if (this.a.getFillType() == 2) {
      this.a.getSolidFill().setTransparency(1.0D - paramDouble);
    } else if (this.a.getFillType() == 4) {
      this.a.getTextureFill().setTransparency(1.0D - paramDouble);
    } else if (this.a.getFillType() == 5) {
      this.a.getPatternFill().setForeTransparency(1.0D - paramDouble);
    }
  }
  
  public Color getBackColor()
  {
    Color localColor = Color.getWhite();
    if (this.a.getFillType() == 5) {
      localColor = this.a.getPatternFill().getBackgroundColor();
    }
    if (zh.a(localColor)) {
      localColor = Color.getWhite();
    }
    return localColor;
  }
  
  public void setBackColor(Color value)
  {
    if (this.a.getFillType() == 5) {
      this.a.getPatternFill().setBackgroundColor(value);
    }
  }
  
  public byte[] getImageData()
  {
    switch (this.a.getFillType())
    {
    case 4: 
      return this.a.getTextureFill().getImageData();
    }
    return null;
  }
  
  public void setImageData(byte[] value)
  {
    this.a.setFillType(4);
    this.a.getTextureFill().setImageData(value);
  }
  
  public void setOneColorGradient(Color color, double degree, int style, int variant)
  {
    this.a.setFillType(3);
    this.a.getGradientFill().setOneColorGradient(color, degree, style, variant);
  }
  
  public int getTexture()
  {
    int i = 24;
    if (this.a.getFillType() == 4) {
      i = this.a.getTextureFill().getType();
    }
    return i;
  }
  
  public boolean isVisible()
  {
    boolean bool = true;
    Object localObject = this.a.b.g;
    if ((localObject != null) && ((localObject instanceof Shape))) {
      switch (((Shape)localObject).getMsoDrawingType())
      {
      case 0: 
      case 8: 
        bool = false;
        break;
      }
    }
    switch (this.a.getFillType())
    {
    case 1: 
      return false;
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return true;
    case 6: 
      if ((localObject != null) && ((localObject instanceof Shape)))
      {
        Shape localShape = (Shape)localObject;
        if (localShape.W()) {
          return localShape.getGroup().isFilled();
        }
      }
      return false;
    }
    return bool;
  }
  
  public void setVisible(boolean value)
  {
    if (value)
    {
      if (this.a.getFillType() == 1) {
        this.a.setFillType(0);
      }
    }
    else {
      this.a.setFillType(1);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MsoFillFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */