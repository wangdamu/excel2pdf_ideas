package com.aspose.cells;

public class TableStyleElement
{
  private TableStyleElementCollection b;
  private int c = 1;
  private int d;
  private Style e;
  int a = -1;
  
  TableStyleElement(TableStyleElementCollection parent, int type)
  {
    this.b = parent;
    this.d = type;
  }
  
  void a(TableStyleElement paramTableStyleElement, CopyOptions paramCopyOptions)
  {
    this.c = paramTableStyleElement.c;
    this.d = paramTableStyleElement.d;
    if ((paramTableStyleElement.a != -1) && (b() != paramTableStyleElement.b())) {
      this.a = b().getDxfs().a(paramTableStyleElement.getElementStyle());
    } else {
      this.a = paramTableStyleElement.a;
    }
  }
  
  private WorksheetCollection b()
  {
    return this.b.a().a().c();
  }
  
  public int getSize()
  {
    return this.c;
  }
  
  public void setSize(int value)
  {
    this.c = value;
  }
  
  public int getType()
  {
    return this.d;
  }
  
  public Style getElementStyle()
  {
    Style localStyle1 = new Style(b());
    if (this.e != null)
    {
      localStyle1.copy(this.e);
      return localStyle1;
    }
    if (this.a == -1) {
      return localStyle1;
    }
    Style localStyle2 = b().getDxfs().get(this.a);
    localStyle1.copy(localStyle2);
    return localStyle1;
  }
  
  public void setElementStyle(Style style)
  {
    this.e = style;
    this.a = b().getDxfs().a(style);
  }
  
  Style a()
  {
    if (this.e == null)
    {
      if (this.a == -1) {
        return null;
      }
      return b().getDxfs().get(this.a);
    }
    return this.e;
  }
  
  void a(Style paramStyle)
  {
    this.e = paramStyle;
    this.a = b().getDxfs().a(paramStyle);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TableStyleElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */