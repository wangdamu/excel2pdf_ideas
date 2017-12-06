package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class CheckBoxCollection
  extends CollectionBase
{
  private ShapeCollection a;
  
  CheckBoxCollection(ShapeCollection shapes)
  {
    this.a = shapes;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, int height, int width)
  {
    this.a.a(upperLeftRow, 0, upperLeftColumn, 0, height, width);
    return getCount() - 1;
  }
  
  public CheckBox get(int index)
  {
    return (CheckBox)this.InnerList.get(index);
  }
  
  void a(CheckBox paramCheckBox)
  {
    zf.a(this.InnerList, paramCheckBox);
  }
  
  void b(CheckBox paramCheckBox)
  {
    this.InnerList.remove(paramCheckBox);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CheckBoxCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */