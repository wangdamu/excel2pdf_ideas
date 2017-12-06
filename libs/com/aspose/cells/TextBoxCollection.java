package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class TextBoxCollection
  extends CollectionBase
{
  private ShapeCollection a;
  
  TextBoxCollection(ShapeCollection shapes)
  {
    this.a = shapes;
  }
  
  public TextBox get(int index)
  {
    return (TextBox)this.InnerList.get(index);
  }
  
  public TextBox get(String name)
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      TextBox localTextBox = (TextBox)localIterator.next();
      if (zw.b(localTextBox.getName(), name)) {
        return localTextBox;
      }
    }
    return null;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, int height, int width)
  {
    this.a.b(upperLeftRow, 0, upperLeftColumn, 0, height, width);
    return getCount() - 1;
  }
  
  public void removeAt(int index)
  {
    this.a.b(get(index));
  }
  
  public void clear()
  {
    for (int i = getCount() - 1; i >= 0; i--) {
      this.a.a(get(i));
    }
    this.InnerList.clear();
  }
  
  int a(TextBox paramTextBox)
  {
    zf.a(this.InnerList, paramTextBox);
    return getCount() - 1;
  }
  
  void b(TextBox paramTextBox)
  {
    this.InnerList.remove(paramTextBox);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextBoxCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */