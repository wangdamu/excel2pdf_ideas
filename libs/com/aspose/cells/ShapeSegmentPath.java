package com.aspose.cells;

import java.util.Iterator;

public class ShapeSegmentPath
{
  private int a;
  private ShapePathPointCollection b;
  
  ShapeSegmentPath(int type)
  {
    this.a = type;
    this.b = new ShapePathPointCollection();
  }
  
  public int getType()
  {
    return this.a;
  }
  
  public ShapePathPointCollection getPoints()
  {
    return this.b;
  }
  
  void a(ShapeSegmentPath paramShapeSegmentPath)
  {
    this.a = paramShapeSegmentPath.a;
    Iterator localIterator = paramShapeSegmentPath.b.iterator();
    while (localIterator.hasNext())
    {
      ShapePathPoint localShapePathPoint1 = (ShapePathPoint)localIterator.next();
      ShapePathPoint localShapePathPoint2 = new ShapePathPoint();
      localShapePathPoint2.a(localShapePathPoint1);
      this.b.a(localShapePathPoint2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeSegmentPath.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */