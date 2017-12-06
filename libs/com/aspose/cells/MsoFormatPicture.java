package com.aspose.cells;

import com.aspose.cells.b.a.zr;
import java.util.ArrayList;

public class MsoFormatPicture
{
  private zaum c;
  zle a = null;
  ArrayList b = null;
  
  MsoFormatPicture(Shape shape)
  {
    this.c = shape.R().d();
  }
  
  public double getTopCrop()
  {
    return this.c.a(256, 0.0F);
  }
  
  public void setTopCrop(double value)
  {
    this.c.b(256, (float)value);
  }
  
  public double getBottomCrop()
  {
    return this.c.a(257, 0.0F);
  }
  
  public void setBottomCrop(double value)
  {
    this.c.b(257, (float)value);
  }
  
  public double getLeftCrop()
  {
    return this.c.a(258, 0.0F);
  }
  
  public void setLeftCrop(double value)
  {
    this.c.b(258, (float)value);
  }
  
  public double getRightCrop()
  {
    return this.c.a(259, 0.0F);
  }
  
  public void setRightCrop(double value)
  {
    this.c.b(259, (float)value);
  }
  
  public CellsColor getTransparentColor()
  {
    if (this.a == null) {
      return null;
    }
    if ((this.a.a != null) && (this.a.b != null) && (this.a.a.c() == this.a.b.c()) && (this.a.a.e() == this.a.b.e()) && (!this.a.a.b(2)) && (this.a.b.j() == 0))
    {
      CellsColor localCellsColor = this.c.g().p().createCellsColor();
      localCellsColor.a = this.a.a;
      return localCellsColor;
    }
    return null;
  }
  
  public void setTransparentColor(CellsColor value)
  {
    if ((value == null) || (value.a.b()))
    {
      this.a = null;
    }
    else
    {
      this.a = new zle();
      this.a.a = value.a;
      zaml localzaml = new zaml(true);
      localzaml.f(value.a);
      this.a.b = localzaml;
      this.a.b.a(0);
      this.c.a(263, 1, value.getColor());
    }
  }
  
  public double getContrast()
  {
    double d = this.c.c(264, 65536);
    if (d == 0.0D) {
      d = 0.0D;
    }
    if (d >= 65536.0D) {
      d = 100.0D - 100.0D / (d / 32768.0D);
    } else {
      d = 100.0D * (d / 131072.0D);
    }
    return d * 2.0D - 100.0D;
  }
  
  public void setContrast(double value)
  {
    double d = (value + 100.0D) / 2.0D;
    if (d >= 50.0D) {
      d = 3276800.0D / (100.0D - d);
    } else {
      d = 131072.0D * d / 100.0D;
    }
    this.c.a(264, 0, Integer.valueOf((int)d));
  }
  
  public double getBrightness()
  {
    double d = this.c.c(265, 0);
    return zr.b(d / 32768.0D * 100.0D, 2);
  }
  
  public void setBrightness(double value)
  {
    double d = value * 32768.0D / 100.0D;
    this.c.a(265, 0, Integer.valueOf((int)d));
  }
  
  public boolean isBiLevel()
  {
    return this.c.a(319, 1, false);
  }
  
  public void setBiLevel(boolean value)
  {
    this.c.b(319, 1, value);
  }
  
  public boolean isGray()
  {
    return this.c.a(319, 2, false);
  }
  
  public void setGray(boolean value)
  {
    this.c.b(319, 2, value);
  }
  
  void a()
  {
    if (this.c.a(263))
    {
      Color localColor = this.c.a(263, Color.getEmpty());
      this.a = new zle();
      this.a.a = new zaml(true, 2, localColor.toArgb());
      this.a.b = new zaml(true, 2, localColor.toArgb());
      this.a.b.l().a(2, 0);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MsoFormatPicture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */