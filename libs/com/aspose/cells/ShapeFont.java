package com.aspose.cells;

/**
 * @deprecated
 */
public class ShapeFont
  extends TextOptions
{
  public ShapeFormat getFillFormat()
  {
    return u();
  }
  
  public ShapeFormat getFormat()
  {
    if (this.k == null)
    {
      zaml localzaml = this.b;
      this.k = new ShapeFormat(this.c.p(), this);
      this.k.a(2);
      this.k.getFill().getSolidFill().a = localzaml;
    }
    return this.k;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeFont.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */