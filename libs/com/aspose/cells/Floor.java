package com.aspose.cells;

public class Floor
  extends Area
{
  private Chart d = null;
  Line c;
  protected ShapePropertyCollection m_SpPr;
  
  Floor(Chart chart)
  {
    super(chart, chart);
    this.d = chart;
    this.c = new Line(chart, this);
  }
  
  public Line getBorder()
  {
    return this.c;
  }
  
  public void setBorder(Line value)
  {
    this.c = value;
  }
  
  void a(Floor paramFloor, CopyOptions paramCopyOptions)
  {
    super.a(paramFloor, paramCopyOptions);
    this.c.a(paramFloor.c);
    if (paramFloor.m_SpPr != null)
    {
      this.m_SpPr = new ShapePropertyCollection(this.d, this, 10);
      this.m_SpPr.a(paramFloor.m_SpPr, paramCopyOptions);
    }
  }
  
  ShapePropertyCollection j()
  {
    if (this.m_SpPr == null) {
      this.m_SpPr = new ShapePropertyCollection(this.d, this, 10);
    }
    return this.m_SpPr;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Floor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */