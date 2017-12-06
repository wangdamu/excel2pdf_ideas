package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ShapeSegmentPathCollection
  extends CollectionBase
{
  public int add(int type)
  {
    ShapeSegmentPath localShapeSegmentPath = new ShapeSegmentPath(type);
    zf.a(this.InnerList, localShapeSegmentPath);
    return this.InnerList.size() - 1;
  }
  
  public ShapeSegmentPath get(int index)
  {
    return (ShapeSegmentPath)this.InnerList.get(index);
  }
  
  int a(ShapeSegmentPath paramShapeSegmentPath)
  {
    zf.a(this.InnerList, paramShapeSegmentPath);
    return this.InnerList.size() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeSegmentPathCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */