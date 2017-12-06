package com.aspose.cells;

public class ChartShape
  extends Shape
{
  private Chart a;
  
  ChartShape(ShapeCollection shapes, Chart chart)
  {
    super(shapes, 5, shapes);
    this.a = chart;
  }
  
  Chart a()
  {
    return this.a;
  }
  
  public Chart getChart()
  {
    return this.a;
  }
  
  void a(ChartShape paramChartShape, CopyOptions paramCopyOptions)
    throws Exception
  {
    super.a(paramChartShape, paramCopyOptions);
    this.a.a(paramChartShape.a, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartShape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */