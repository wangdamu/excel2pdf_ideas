package com.aspose.cells;

public class ListBoxActiveXControl
  extends ActiveXControl
{
  ListBoxActiveXControl(Shape shape)
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
    return 3;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = -2147417760;
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      c().s = 3;
      c().t = 2;
      c().B = 0;
      this.c = zaj.d;
    }
  }
  
  int a(int paramInt)
  {
    return zapr.b(paramInt);
  }
  
  public int getScrollBars()
  {
    return c().s & 0xFF;
  }
  
  public void setScrollBars(int value)
  {
    c().s = ((byte)value);
    b(26);
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
  
  public int getMatchEntry()
  {
    return c().B & 0xFF;
  }
  
  public void setMatchEntry(int value)
  {
    c().B = ((byte)value);
    b(35);
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
  
  public int getSelectionType()
  {
    return c().F & 0xFF;
  }
  
  public void setSelectionType(int value)
  {
    c().F = ((byte)value);
    b(39);
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
  
  public boolean getShowColumnHeads()
  {
    return this.e.a(10);
  }
  
  public void setShowColumnHeads(boolean value)
  {
    this.e.a(10, value);
    b(14);
  }
  
  public boolean getIntegralHeight()
  {
    return this.e.a(11);
  }
  
  public void setIntegralHeight(boolean value)
  {
    this.e.a(11, value);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ListBoxActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */