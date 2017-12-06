package com.aspose.cells;

public class ShapePathPoint
{
  Object a;
  Object b;
  
  ShapePathPoint() {}
  
  ShapePathPoint(Object x, Object y)
  {
    this.a = x;
    this.b = y;
  }
  
  public int getX()
  {
    if ((this.a instanceof Integer)) {
      return ((Integer)this.a).intValue();
    }
    return 0;
  }
  
  public void setX(int value)
  {
    this.a = Integer.valueOf(value);
  }
  
  public int getY()
  {
    if ((this.b instanceof Integer)) {
      return ((Integer)this.b).intValue();
    }
    return 0;
  }
  
  public void setY(int value)
  {
    this.b = Integer.valueOf(value);
  }
  
  void a(ShapePathPoint paramShapePathPoint)
  {
    this.a = paramShapePathPoint.a;
    this.b = paramShapePathPoint.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapePathPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */