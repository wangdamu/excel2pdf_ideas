package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class TextTabStopCollection
  extends CollectionBase
{
  int a(int paramInt1, int paramInt2)
  {
    TextTabStop localTextTabStop = new TextTabStop(paramInt1, paramInt2);
    zf.a(this.InnerList, localTextTabStop);
    return this.InnerList.size() - 1;
  }
  
  public int add(int tabAlignment, double tabPosition)
  {
    return a(tabAlignment, zbxp.f(tabPosition));
  }
  
  public TextTabStop get(int index)
  {
    return (TextTabStop)this.InnerList.get(index);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextTabStopCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */