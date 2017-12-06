package com.aspose.cells;

public class TextBoxActiveXControl
  extends ActiveXControl
{
  TextBoxActiveXControl(Shape shape)
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
    return 4;
  }
  
  void b()
  {
    if (this.b != null)
    {
      this.d = -2147483391;
      this.e.a = 746604571;
      this.e.h = zbxp.e(this.b.getWidthPt());
      this.e.i = zbxp.e(this.b.getHeightPt());
      this.c = zaj.e;
    }
  }
  
  int a(int paramInt)
  {
    return zapr.b(paramInt);
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
  
  public int getMaxLength()
  {
    return c().r;
  }
  
  public void setMaxLength(int value)
  {
    c().r = value;
    b(25);
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
  
  public char getPasswordChar()
  {
    return c().u;
  }
  
  public void setPasswordChar(char value)
  {
    c().u = value;
    b(28);
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
  
  public boolean getIntegralHeight()
  {
    return this.e.a(11);
  }
  
  public void setIntegralHeight(boolean value)
  {
    this.e.a(11, value);
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
  
  public boolean getEnterKeyBehavior()
  {
    return this.e.a(20);
  }
  
  public void setEnterKeyBehavior(boolean value)
  {
    this.e.a(20, value);
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
  
  public boolean getTabKeyBehavior()
  {
    return this.e.a(22);
  }
  
  public void setTabKeyBehavior(boolean value)
  {
    this.e.a(22, value);
    b(14);
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
  
  public boolean isAutoTab()
  {
    return this.e.a(30);
  }
  
  public void setAutoTab(boolean value)
  {
    this.e.a(30, value);
    b(14);
  }
  
  public boolean isMultiLine()
  {
    return this.e.a(31);
  }
  
  public void setMultiLine(boolean value)
  {
    this.e.a(31, value);
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
  
  public boolean isWordWrapped()
  {
    return this.e.a(23);
  }
  
  public void setWordWrapped(boolean value)
  {
    this.e.a(23, value);
    b(14);
  }
  
  public String getText()
  {
    return c().G;
  }
  
  public void setText(String value)
  {
    c().G = value;
    a(40, (value != null) && (!"".equals(value)));
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
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextBoxActiveXControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */