package com.aspose.cells;

import java.util.Iterator;

public abstract class Geometry
{
  String a;
  private ShapeGuideCollection b;
  
  ShapeGuideCollection g()
  {
    return this.b;
  }
  
  public ShapeGuideCollection getShapeAdjustValues()
  {
    if (this.b == null) {
      this.b = new ShapeGuideCollection();
    }
    return this.b;
  }
  
  abstract boolean a();
  
  void a(Geometry paramGeometry)
  {
    this.a = paramGeometry.a;
    if (paramGeometry.b != null)
    {
      this.b = new ShapeGuideCollection();
      Iterator localIterator = paramGeometry.b.iterator();
      while (localIterator.hasNext())
      {
        ShapeGuide localShapeGuide = (ShapeGuide)localIterator.next();
        this.b.a(localShapeGuide);
      }
    }
    else
    {
      this.b = null;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Geometry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */