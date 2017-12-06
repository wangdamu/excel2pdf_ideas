package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ShapePathPointCollection
  extends CollectionBase
{
  public ShapePathPoint get(int index)
  {
    return (ShapePathPoint)this.InnerList.get(index);
  }
  
  public int add(int x, int y)
  {
    ShapePathPoint localShapePathPoint = new ShapePathPoint(Integer.valueOf(x), Integer.valueOf(y));
    zf.a(this.InnerList, localShapePathPoint);
    return getCount() - 1;
  }
  
  int a(ShapePathPoint paramShapePathPoint)
  {
    zf.a(this.InnerList, paramShapePathPoint);
    return this.InnerList.size() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapePathPointCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */