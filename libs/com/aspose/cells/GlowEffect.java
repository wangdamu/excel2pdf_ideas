package com.aspose.cells;

public class GlowEffect
{
  ztf a;
  zaml b;
  int c;
  
  GlowEffect(ztf parent)
  {
    this.a = parent;
  }
  
  boolean a()
  {
    return (this.c != 0) || (this.b != null);
  }
  
  public CellsColor getColor()
  {
    if (this.b == null) {
      this.b = new zaml(true);
    }
    return new CellsColor(this.a.a(), this.b);
  }
  
  public void setColor(CellsColor value)
  {
    this.b = value.a;
  }
  
  /**
   * @deprecated
   */
  public double getRadius()
  {
    return this.c / znq.j;
  }
  
  /**
   * @deprecated
   */
  public void setRadius(double value)
  {
    this.c = ((int)(value * znq.j));
  }
  
  public double getSize()
  {
    return zbxp.c(this.c);
  }
  
  public void setSize(double value)
  {
    this.c = zbxp.f(value);
  }
  
  public double getTransparency()
  {
    if (this.b == null) {
      return 0.0D;
    }
    CellsColor localCellsColor = getColor();
    return localCellsColor.getTransparency();
  }
  
  public void setTransparency(double value)
  {
    if ((value < 0.0D) || (value > 1.0D)) {
      throw new CellsException(6, "Transparency must between 0.0 (opaque) and 1.0 (clear)");
    }
    getColor().setTransparency(value);
  }
  
  void a(GlowEffect paramGlowEffect)
  {
    if (paramGlowEffect.b != null)
    {
      this.b = new zaml(true);
      this.b.f(paramGlowEffect.b);
    }
    else
    {
      this.b = null;
    }
    this.c = paramGlowEffect.c;
  }
  
  boolean b(GlowEffect paramGlowEffect)
  {
    if ((this.b != null) || (paramGlowEffect.b != null)) {
      if ((this.b != null) && (paramGlowEffect.b != null))
      {
        if (!this.b.g(paramGlowEffect.b)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return this.c == paramGlowEffect.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/GlowEffect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */