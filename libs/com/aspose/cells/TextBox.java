package com.aspose.cells;

public class TextBox
  extends Shape
{
  TextBox(ShapeCollection shapes)
  {
    super(shapes, 6, shapes);
    this.x = new FontSettingCollection(shapes.j(), this);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */