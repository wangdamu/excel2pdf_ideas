package com.aspose.cells;

public class CheckBox
  extends Shape
{
  private int b;
  boolean a = true;
  
  CheckBox(ShapeCollection shapes)
  {
    super(shapes, 11, shapes);
    this.x = new FontSettingCollection(shapes.j(), this);
  }
  
  public boolean getValue()
  {
    return this.b == 1;
  }
  
  public void setValue(boolean value)
  {
    if (value) {
      setCheckedValue(1);
    } else {
      setCheckedValue(0);
    }
  }
  
  /**
   * @deprecated
   */
  public int getCheckValue()
  {
    return this.b;
  }
  
  /**
   * @deprecated
   */
  public void setCheckValue(int value)
  {
    setCheckedValue(value);
  }
  
  public int getCheckedValue()
    throws Exception
  {
    if (this.m_linkedCell != null) {
      updateSelectedValue();
    }
    return this.b;
  }
  
  public void setCheckedValue(int value)
  {
    this.b = value;
    if (this.m_linkedCell != null)
    {
      Object localObject = Boolean.valueOf(false);
      if (value == 1) {
        localObject = Boolean.valueOf(true);
      } else if (value == 2) {
        localObject = "#N/A";
      } else {
        localObject = Boolean.valueOf(false);
      }
      b(localObject);
    }
  }
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  int a()
  {
    return this.b;
  }
  
  public boolean getShadow()
  {
    return this.B;
  }
  
  public void setShadow(boolean value)
  {
    this.B = value;
  }
  
  void a(CheckBox paramCheckBox, CopyOptions paramCopyOptions)
  {
    this.b = paramCheckBox.b;
    super.a(paramCheckBox, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CheckBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */