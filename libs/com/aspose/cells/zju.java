package com.aspose.cells;

class zju
{
  private Chart a;
  private Line b;
  private Area c;
  private ShapePropertyCollection d;
  private zsw e;
  
  public zju(Chart paramChart)
  {
    this.a = paramChart;
  }
  
  public Line a()
  {
    if (this.b == null) {
      this.b = new Line(this.a, this);
    }
    return this.b;
  }
  
  Line b()
  {
    return this.b;
  }
  
  public Area c()
  {
    if (this.c == null) {
      this.c = new Area(this.a, this);
    }
    return this.c;
  }
  
  Area d()
  {
    return this.c;
  }
  
  ShapePropertyCollection e()
  {
    if (this.d == null) {
      this.d = new ShapePropertyCollection(this.a, this, 18);
    }
    return this.d;
  }
  
  public zsw f()
  {
    if (this.e == null) {
      this.e = new zsw(this.a.getChartObject());
    }
    return this.e;
  }
  
  zsw g()
  {
    return this.e;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */