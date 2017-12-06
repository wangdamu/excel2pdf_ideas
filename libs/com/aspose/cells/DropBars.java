package com.aspose.cells;

public class DropBars
{
  private Area a;
  private Line b;
  private Chart c;
  private ShapePropertyCollection d;
  
  DropBars(Chart chart)
  {
    this.c = chart;
  }
  
  public Line getBorder()
  {
    if (this.b == null) {
      this.b = new Line(this.c, this);
    }
    return this.b;
  }
  
  Line a()
  {
    return this.b;
  }
  
  Area b()
  {
    return this.a;
  }
  
  public Area getArea()
  {
    if (this.a == null) {
      this.a = new Area(this.c, this);
    }
    return this.a;
  }
  
  void a(DropBars paramDropBars, CopyOptions paramCopyOptions)
  {
    if (paramDropBars.a != null) {
      getArea().a(paramDropBars.a, paramCopyOptions);
    }
    if (paramDropBars.b != null) {
      getBorder().a(paramDropBars.b);
    }
    if (paramDropBars.d != null) {
      c().a(paramDropBars.d, paramCopyOptions);
    }
  }
  
  ShapePropertyCollection c()
  {
    if (this.d == null) {
      this.d = new ShapePropertyCollection(this.c, this, 9);
    }
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DropBars.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */