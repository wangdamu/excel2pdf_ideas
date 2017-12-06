package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ConditionalFormattingIconCollection
  extends CollectionBase
{
  void a(ConditionalFormattingIconCollection paramConditionalFormattingIconCollection)
  {
    for (int i = 0; i < paramConditionalFormattingIconCollection.getCount(); i++)
    {
      ConditionalFormattingIcon localConditionalFormattingIcon = new ConditionalFormattingIcon();
      localConditionalFormattingIcon.a(paramConditionalFormattingIconCollection.get(i));
      zf.a(this.InnerList, localConditionalFormattingIcon);
    }
  }
  
  public ConditionalFormattingIcon get(int index)
  {
    if (index >= this.InnerList.size()) {
      throw new IllegalArgumentException("Invalid conditionalFormattingIcon index : " + index);
    }
    return (ConditionalFormattingIcon)this.InnerList.get(index);
  }
  
  public int add(int type, int index)
  {
    zf.a(this.InnerList, new ConditionalFormattingIcon(type, index));
    return getCount() - 1;
  }
  
  public int add(ConditionalFormattingIcon cficon)
  {
    zf.a(this.InnerList, cficon);
    return getCount() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConditionalFormattingIconCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */