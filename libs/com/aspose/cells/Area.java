package com.aspose.cells;

import com.aspose.cells.b.a.zr;

public class Area
{
  private Chart c;
  Object a;
  private boolean d = false;
  ShapeFormat b;
  
  Chart a()
  {
    return this.c;
  }
  
  Area(Chart chart, Object parent)
  {
    this.c = chart;
    this.a = parent;
  }
  
  boolean b()
  {
    FillFormat localFillFormat = i();
    return (localFillFormat != null) && ((localFillFormat.getFillType() == 5) || (localFillFormat.getFillType() == 4) || (localFillFormat.getFillType() == 3));
  }
  
  void c()
  {
    if (this.a != null) {
      if ((this.a instanceof zpz))
      {
        ((zpz)this.a).a(null);
      }
      else if ((this.a instanceof ChartFrame))
      {
        ((ChartFrame)this.a).a(null);
        if (a().getWorksheet().c().p().getSettings().f) {
          ((ChartFrame)this.a).a(null);
        }
      }
    }
  }
  
  void d()
  {
    c();
  }
  
  public Color getBackgroundColor()
  {
    if (getFillFormat().getFillType() == 5) {
      return getFillFormat().getPatternFill().getBackgroundColor();
    }
    if (getFillFormat().getFillType() == 2) {
      return getFillFormat().getSolidFill().d();
    }
    return Color.getEmpty();
  }
  
  public void setBackgroundColor(Color value)
  {
    setFormatting(2);
    if (getFillFormat().getFillType() == 5) {
      getFillFormat().getPatternFill().setBackgroundColor(value);
    } else if (getFillFormat().getFillType() == 2) {
      getFillFormat().getSolidFill().a(value);
    }
    c();
  }
  
  zaml e()
  {
    if (getFillFormat().getFillType() == 2) {
      return getFillFormat().getSolidFill().b;
    }
    if (getFillFormat().getFillType() == 5) {
      return getFillFormat().getPatternFill().a;
    }
    return null;
  }
  
  public Color getForegroundColor()
  {
    if (getFillFormat().getFillType() == 2) {
      return getFillFormat().getSolidFill().getColor();
    }
    if (getFillFormat().getFillType() == 5) {
      return getFillFormat().getPatternFill().getForegroundColor();
    }
    return Color.getEmpty();
  }
  
  public void setForegroundColor(Color value)
  {
    setFormatting(2);
    if (getFillFormat().getFillType() == 2) {
      getFillFormat().getSolidFill().setColor(value);
    } else if (getFillFormat().getFillType() == 5) {
      getFillFormat().getPatternFill().setForegroundColor(value);
    }
    c();
  }
  
  zaml f()
  {
    if (getFillFormat().getFillType() == 2) {
      return getFillFormat().getSolidFill().a;
    }
    if (getFillFormat().getFillType() == 5) {
      return getFillFormat().getPatternFill().b;
    }
    return null;
  }
  
  public int getFormatting()
  {
    if (getFillFormat().getFillType() == 0) {
      return 0;
    }
    if (getFillFormat().getFillType() == 1) {
      return 1;
    }
    return 2;
  }
  
  public void setFormatting(int value)
  {
    if (value == 0) {
      getFillFormat().setFillType(0);
    } else if (value == 1) {
      getFillFormat().setFillType(1);
    } else if ((value == 2) && ((getFillFormat().getFillType() == 0) || (getFillFormat().getFillType() == 1))) {
      getFillFormat().setFillType(2);
    }
    c();
  }
  
  public boolean getInvertIfNegative()
  {
    return this.d;
  }
  
  public void setInvertIfNegative(boolean value)
  {
    this.d = value;
  }
  
  ShapeFormat g()
  {
    if (this.b == null) {
      this.b = new ShapeFormat(this.c.n().p(), this);
    }
    return this.b;
  }
  
  public FillFormat getFillFormat()
  {
    c();
    return g().getFill();
  }
  
  int h()
  {
    int i = 100;
    if (i() != null) {
      return g().getFill().e();
    }
    return i;
  }
  
  public double getTransparency()
  {
    return zr.b((100 - h()) / 100.0D, 2);
  }
  
  public void setTransparency(double value)
  {
    if ((value < 0.0D) || (value > 1.0D)) {
      throw new CellsException(6, "Transparency must between 0.0 (opaque) and 1.0 (clear)");
    }
    g().getFill().setTransparency(value);
  }
  
  FillFormat i()
  {
    if ((this.b != null) && (this.b.a != null)) {
      return this.b.getFill();
    }
    return null;
  }
  
  void a(Area paramArea, CopyOptions paramCopyOptions)
  {
    this.d = paramArea.d;
    if (paramArea.i() == null) {
      this.b = null;
    } else {
      g().b(paramArea.g(), paramCopyOptions);
    }
  }
  
  boolean a(Area paramArea, zmz paramzmz)
  {
    if (this.d != paramArea.d) {
      return false;
    }
    FillFormat localFillFormat1 = paramArea.i();
    FillFormat localFillFormat2 = i();
    if ((localFillFormat1 != null) || (localFillFormat2 != null)) {
      if ((localFillFormat2 != null) && (localFillFormat1 != null))
      {
        if (!localFillFormat2.a(localFillFormat1, paramzmz)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return true;
  }
  
  /**
   * @deprecated
   */
  public boolean isAuto()
  {
    return getFormatting() == 0;
  }
  
  /**
   * @deprecated
   */
  public boolean isVisible()
  {
    return getFormatting() != 1;
  }
  
  /**
   * @deprecated
   */
  public void setAuto(boolean isAuto)
  {
    if (isAuto) {
      setFormatting(0);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Area.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */