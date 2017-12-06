package com.aspose.cells;

public class ComboBoxActiveXControl
  extends ActiveXControl
{
  ComboBoxActiveXControl(Shape shape)
  {
    super(shape);
    this.e = new zapr();
  }
  
  private zapr c()
  {
    return (zapr)this.e;
  }
  
  public int getType()
  {
    return 1;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = -2147155647;
      this.e.a = 746604571;
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      c().t = 3;
      c().B = 1;
      c().D = 2;
      this.c = zaj.b;
    }
  }
  
  int a(int paramInt)
  {
    return zapr.b(paramInt);
  }
  
  public int getMaxLength()
  {
    return c().r;
  }
  
  public void setMaxLength(int value)
  {
    c().r = value;
    b(25);
  }
  
  public double getListWidth()
  {
    return zbxp.b(c().v);
  }
  
  public void setListWidth(double value)
  {
    c().v = zbxp.e(value);
    b(29);
  }
  
  public int getBoundColumn()
  {
    return c().w;
  }
  
  public void setBoundColumn(int value)
  {
    c().w = value;
    b(30);
  }
  
  public int getTextColumn()
  {
    return c().x;
  }
  
  public void setTextColumn(int value)
  {
    c().x = value;
    b(31);
  }
  
  public int getColumnCount()
  {
    return c().y;
  }
  
  public void setColumnCount(int value)
  {
    c().y = value;
    b(32);
  }
  
  public int getListRows()
  {
    return c().z;
  }
  
  public void setListRows(int value)
  {
    c().z = value;
    b(33);
  }
  
  public int getMatchEntry()
  {
    return c().B & 0xFF;
  }
  
  public void setMatchEntry(int value)
  {
    c().B = ((byte)value);
    b(35);
  }
  
  public int getDropButtonStyle()
  {
    return c().E & 0xFF;
  }
  
  public void setDropButtonStyle(int value)
  {
    c().E = ((byte)value);
    b(38);
  }
  
  public int getShowDropButtonTypeWhen()
  {
    return c().D & 0xFF;
  }
  
  public void setShowDropButtonTypeWhen(int value)
  {
    c().D = ((byte)value);
    b(37);
  }
  
  public int getListStyle()
  {
    return c().C & 0xFF;
  }
  
  public void setListStyle(int value)
  {
    c().C = ((byte)value);
    b(36);
  }
  
  public int getBorderStyle()
  {
    return this.e.d & 0xFF;
  }
  
  public void setBorderStyle(int value)
  {
    this.e.d = 1;
    b(1);
  }
  
  public int getBorderOleColor()
  {
    return this.e.e;
  }
  
  public void setBorderOleColor(int value)
  {
    this.e.e = value;
    b(2);
  }
  
  public int getSpecialEffect()
  {
    return this.e.f & 0xFF;
  }
  
  public void setSpecialEffect(int value)
  {
    this.e.f = ((byte)value);
    b(7);
  }
  
  public boolean isEditable()
  {
    return this.e.a(14);
  }
  
  public void setEditable(boolean value)
  {
    this.e.a(14, value);
    b(14);
  }
  
  public boolean getShowColumnHeads()
  {
    return this.e.a(10);
  }
  
  public void setShowColumnHeads(boolean value)
  {
    this.e.a(10, value);
    b(14);
  }
  
  public boolean isDragBehaviorEnabled()
  {
    return this.e.a(19);
  }
  
  public void setDragBehaviorEnabled(boolean value)
  {
    this.e.a(19, value);
    b(14);
  }
  
  public boolean getEnterFieldBehavior()
  {
    return this.e.a(21);
  }
  
  public void setEnterFieldBehavior(boolean value)
  {
    this.e.a(21, value);
    b(14);
  }
  
  public boolean isAutoWordSelected()
  {
    return !this.e.a(27);
  }
  
  public void setAutoWordSelected(boolean value)
  {
    this.e.a(27, !value);
    b(14);
  }
  
  public boolean getSelectionMargin()
  {
    return this.e.a(26);
  }
  
  public void setSelectionMargin(boolean value)
  {
    this.e.a(26, value);
    b(14);
  }
  
  public String getValue()
  {
    return c().G;
  }
  
  public void setValue(String value)
  {
    c().G = value;
    b(40);
  }
  
  public boolean getHideSelection()
  {
    return this.e.a(29);
  }
  
  public void setHideSelection(boolean value)
  {
    this.e.a(29, value);
    b(14);
  }
  
  public double getColumnWidths()
  {
    if (c().J == -1) {
      return -1.0D;
    }
    return zbxp.b(c().J);
  }
  
  public void setColumnWidths(double value)
  {
    int i = zbxp.e(value);
    c().J = i;
    c().d(42);
    b(34);
    c().A = 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ComboBoxActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */