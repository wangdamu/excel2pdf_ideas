package com.aspose.cells;

import java.util.Iterator;

public class ShapePath
{
  boolean a = false;
  int b = 5;
  boolean c = true;
  long d = 0L;
  long e = 0L;
  private ShapeSegmentPathCollection f = new ShapeSegmentPathCollection();
  
  public ShapeSegmentPathCollection getPathSegementList()
  {
    return this.f;
  }
  
  int a()
  {
    int i = 2 * getPathSegementList().getCount();
    if (this.b == 4) {
      i += 2;
    }
    if (!this.c) {
      i += 2;
    }
    return i;
  }
  
  void a(ShapeSegmentPath paramShapeSegmentPath)
  {
    this.f.a(paramShapeSegmentPath);
  }
  
  void a(ShapePath paramShapePath)
  {
    this.b = paramShapePath.b;
    this.a = paramShapePath.a;
    this.d = paramShapePath.d;
    this.e = paramShapePath.e;
    this.c = paramShapePath.c;
    if (paramShapePath.f != null)
    {
      Iterator localIterator = paramShapePath.f.iterator();
      while (localIterator.hasNext())
      {
        ShapeSegmentPath localShapeSegmentPath1 = (ShapeSegmentPath)localIterator.next();
        ShapeSegmentPath localShapeSegmentPath2 = new ShapeSegmentPath(localShapeSegmentPath1.getType());
        localShapeSegmentPath2.a(localShapeSegmentPath1);
        this.f.a(localShapeSegmentPath1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapePath.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */