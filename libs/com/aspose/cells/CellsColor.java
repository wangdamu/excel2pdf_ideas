package com.aspose.cells;

import com.aspose.cells.b.a.zr;

public class CellsColor
{
  private Workbook b;
  zaml a;
  
  CellsColor(Workbook book)
  {
    this.b = book;
    this.a = new zaml(false);
  }
  
  CellsColor(Workbook book, zaml color)
  {
    this.b = book;
    this.a = color;
  }
  
  public boolean isShapeColor()
  {
    return this.a.d();
  }
  
  public void setShapeColor(boolean value)
  {
    this.a.c(value);
  }
  
  public int getType()
  {
    return this.a.c();
  }
  
  public ThemeColor getThemeColor()
  {
    if (getType() == 4)
    {
      int i = ztr.f(this.a.e());
      double d = this.a.g();
      return new ThemeColor(i, d);
    }
    return new ThemeColor(0, 0.0D);
  }
  
  public void setThemeColor(ThemeColor value)
  {
    this.a.a(4, ztr.g(value.getColorType()));
    this.a.a(value.getTint());
  }
  
  public int getColorIndex()
  {
    return this.a.e() - 8;
  }
  
  public void setColorIndex(int value)
  {
    this.a.a(3, value + 8);
  }
  
  public Color getColor()
  {
    return this.a.b(this.b);
  }
  
  public void setColor(Color value)
  {
    this.a.a(2, value.toArgb());
  }
  
  public int getArgb()
  {
    return getColor().toArgb();
  }
  
  public void setArgb(int value)
  {
    setColor(Color.fromArgb(value));
  }
  
  void a(CellsColor paramCellsColor, CopyOptions paramCopyOptions)
  {
    if ((paramCellsColor.b == this.b) || (paramCopyOptions.a())) {
      this.a.f(paramCellsColor.a);
    } else {
      setColor(paramCellsColor.getColor());
    }
  }
  
  int a()
  {
    if (this.a == null) {
      return 100;
    }
    return (int)zbxp.m(this.a.j());
  }
  
  void a(int paramInt)
  {
    this.a.a(zbxp.l(paramInt));
  }
  
  public double getTransparency()
  {
    return zr.b((100 - a()) / 100.0D, 2);
  }
  
  public void setTransparency(double value)
  {
    a((int)((1.0D - value) * 100.0D + 0.5D));
  }
  
  public void setTintOfShapeColor(double tint)
  {
    this.a.b(tint);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CellsColor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */