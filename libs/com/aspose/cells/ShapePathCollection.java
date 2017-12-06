package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class ShapePathCollection
  extends CollectionBase
{
  private Shape d;
  long a = 0L;
  long b = 0L;
  boolean c = true;
  
  ShapePathCollection(Shape shape)
  {
    this.d = shape;
    zbme localzbme1 = this.d.R().d().c(323);
    if (localzbme1 != null) {
      this.a = ((Integer)localzbme1.d()).intValue();
    }
    zbme localzbme2 = this.d.R().d().c(322);
    if (localzbme2 != null) {
      this.b = ((Integer)localzbme2.d()).intValue();
    }
    c();
  }
  
  public int getCount()
  {
    return this.InnerList.size();
  }
  
  public ShapePath get(int index)
  {
    return (ShapePath)this.InnerList.get(index);
  }
  
  public int add()
  {
    ShapePath localShapePath = new ShapePath();
    zf.a(this.InnerList, localShapePath);
    return this.InnerList.size() - 1;
  }
  
  int a(ShapePath paramShapePath)
  {
    zf.a(this.InnerList, paramShapePath);
    return this.InnerList.size() - 1;
  }
  
  int a()
  {
    int i = 0;
    for (int j = 0; j < getCount(); j++) {
      i += get(j).a();
    }
    return i;
  }
  
  void b()
  {
    this.a = 0L;
    this.b = 0L;
    for (int i = 0; i < getCount(); i++)
    {
      ShapePath localShapePath = get(i);
      for (int j = 0; j < localShapePath.getPathSegementList().getCount(); j++)
      {
        ShapeSegmentPath localShapeSegmentPath = localShapePath.getPathSegementList().get(j);
        ShapePathPointCollection localShapePathPointCollection = localShapeSegmentPath.getPoints();
        if (localShapePathPointCollection.getCount() > 0) {
          for (int k = 0; k < localShapePathPointCollection.getCount(); k++)
          {
            ShapePathPoint localShapePathPoint = localShapePathPointCollection.get(k);
            if ((localShapePathPoint.getX() > 65535) || (localShapePathPoint.getX() < 0) || (localShapePathPoint.getY() > 65535) || (localShapePathPoint.getY() < 0)) {
              this.c = false;
            }
            if (localShapePathPoint.getX() > this.b) {
              this.b = localShapePathPoint.getX();
            }
            if (localShapePathPoint.getY() > this.a) {
              this.a = localShapePathPoint.getY();
            }
          }
        }
      }
    }
  }
  
  private void c()
  {
    this.d.R().a(this);
    for (int i = 0; i < getCount(); i++)
    {
      ShapePath localShapePath = get(i);
      localShapePath.e = this.b;
      localShapePath.d = this.a;
    }
  }
  
  void a(ShapePathCollection paramShapePathCollection)
  {
    Iterator localIterator = paramShapePathCollection.iterator();
    while (localIterator.hasNext())
    {
      ShapePath localShapePath1 = (ShapePath)localIterator.next();
      ShapePath localShapePath2 = new ShapePath();
      localShapePath2.a(localShapePath1);
      a(localShapePath2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapePathCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */