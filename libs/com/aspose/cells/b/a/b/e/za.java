package com.aspose.cells.b.a.b.e;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class za
  implements Shape, Cloneable
{
  private Shape a;
  
  protected za(Shape paramShape)
  {
    this.a = paramShape;
  }
  
  protected Shape l()
  {
    return this.a;
  }
  
  protected void a(Shape paramShape)
  {
    this.a = paramShape;
  }
  
  public boolean contains(double x, double y)
  {
    return this.a.contains(x, y);
  }
  
  public boolean contains(double x, double y, double w, double h)
  {
    return this.a.contains(x, y, w, h);
  }
  
  public boolean contains(Point2D p)
  {
    return this.a.contains(p);
  }
  
  public boolean contains(Rectangle2D r)
  {
    return this.a.contains(r);
  }
  
  public Rectangle getBounds()
  {
    return this.a.getBounds();
  }
  
  public Rectangle2D getBounds2D()
  {
    return this.a.getBounds2D();
  }
  
  public boolean intersects(double x, double y, double w, double h)
  {
    return this.a.intersects(x, y, w, h);
  }
  
  public boolean intersects(Rectangle2D r)
  {
    return this.a.intersects(r);
  }
  
  public PathIterator getPathIterator(AffineTransform at)
  {
    return this.a.getPathIterator(at);
  }
  
  public PathIterator getPathIterator(AffineTransform at, double flatness)
  {
    return this.a.getPathIterator(at, flatness);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/e/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */