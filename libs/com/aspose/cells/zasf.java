package com.aspose.cells;

class zasf
{
  private Color c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private String i;
  private double j;
  private int k;
  Font a;
  boolean b = true;
  
  Color a()
  {
    return this.c;
  }
  
  boolean b()
  {
    return this.d;
  }
  
  boolean c()
  {
    return this.e;
  }
  
  boolean d()
  {
    return this.f;
  }
  
  boolean e()
  {
    return this.g;
  }
  
  boolean f()
  {
    return this.h;
  }
  
  String g()
  {
    return this.i;
  }
  
  double h()
  {
    return this.j;
  }
  
  int i()
  {
    return this.k;
  }
  
  zasf() {}
  
  zasf(Font paramFont)
  {
    if (paramFont != null)
    {
      this.a = paramFont;
      this.b = paramFont.k();
      this.c = paramFont.getColor();
      this.d = paramFont.isBold();
      this.e = paramFont.isItalic();
      this.f = paramFont.isStrikeout();
      this.g = paramFont.isSubscript();
      this.h = paramFont.isSuperscript();
      this.i = paramFont.getName();
      this.j = paramFont.getDoubleSize();
      this.k = paramFont.getUnderline();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */