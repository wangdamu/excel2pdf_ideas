package com.aspose.cells;

public class ComboBox
  extends Shape
{
  private Object c;
  String[] a;
  private int d;
  private boolean e;
  private int f = 8;
  int b = 15;
  
  ComboBox(ShapeCollection shapes)
  {
    super(shapes, 20, shapes);
    this.f = 8;
    this.e = false;
  }
  
  ComboBox(ShapeCollection shapes, Object embedded)
  {
    super(shapes, 20, shapes);
    this.c = embedded;
    R().i().a(true);
  }
  
  Object a()
  {
    return this.c;
  }
  
  int b()
  {
    if (this.a != null) {
      return this.a.length;
    }
    if (this.w == null) {
      return 0;
    }
    Range localRange = ag();
    if (localRange == null) {
      return 0;
    }
    return localRange.getRowCount();
  }
  
  public int getSelectedIndex()
  {
    if (!this.e) {
      return -1;
    }
    return this.d;
  }
  
  public void setSelectedIndex(int value)
  {
    Cell localCell = e(true);
    if (localCell != null) {
      if (value >= 0) {
        localCell.putValue(value + 1);
      } else {
        localCell.putValue((String)null);
      }
    }
    if (value == -1)
    {
      this.e = false;
      return;
    }
    if ((value < 0) || (value > 65535)) {
      throw new IllegalArgumentException("Invalid selected index.");
    }
    if (value >= b()) {
      throw new IllegalArgumentException("Invalid selected index.");
    }
    this.d = value;
    this.e = true;
  }
  
  void a(int paramInt)
  {
    this.d = paramInt;
    this.e = true;
  }
  
  public String getSelectedValue()
  {
    if ((this.a != null) && (this.e) && ((this.d & 0xFFFF) < this.a.length)) {
      return this.a[(this.d & 0xFFFF)];
    }
    Cell localCell = getSelectedCell();
    return localCell == null ? "" : localCell.k();
  }
  
  public Cell getSelectedCell()
  {
    if ((this.w == null) || (!this.e)) {
      return null;
    }
    Range localRange = d(this.w);
    if (localRange == null) {
      return null;
    }
    return localRange.getCellOrNull(this.d & 0xFFFF, 0);
  }
  
  public boolean getShadow()
  {
    return this.B;
  }
  
  public void setShadow(boolean value)
  {
    this.B = value;
  }
  
  public int getDropDownLines()
  {
    return this.f;
  }
  
  public void setDropDownLines(int value)
  {
    this.f = value;
  }
  
  void a(ComboBox paramComboBox, CopyOptions paramCopyOptions)
  {
    super.a(paramComboBox, paramCopyOptions);
    this.f = paramComboBox.f;
    this.w = zaam.a(paramComboBox.w, 0, 0, 0, paramCopyOptions);
    this.d = paramComboBox.d;
    this.e = paramComboBox.e;
    if (paramComboBox.a != null) {
      this.a = paramComboBox.a;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ComboBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */