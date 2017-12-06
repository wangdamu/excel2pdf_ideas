package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class RangeCollection
  extends CollectionBase
{
  public Range get(int index)
  {
    return (Range)this.InnerList.get(index);
  }
  
  public int add(Range range)
  {
    zf.a(this.InnerList, range);
    return getCount() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/RangeCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */