package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class ShapeGuideCollection
  extends CollectionBase
{
  int a(ShapeGuide paramShapeGuide)
  {
    zf.a(this.InnerList, paramShapeGuide);
    return this.InnerList.size() - 1;
  }
  
  public ShapeGuide get(int index)
  {
    return (ShapeGuide)this.InnerList.get(index);
  }
  
  int a(Object paramObject)
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      ShapeGuide localShapeGuide = (ShapeGuide)localIterator.next();
      if (localShapeGuide.a().equals(paramObject)) {
        return localShapeGuide.c();
      }
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeGuideCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */