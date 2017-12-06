package com.aspose.cells;

import com.aspose.cells.a.c.zh;

public class Border
{
  private BorderCollection b;
  zaml a;
  private int c;
  private int d = 0;
  
  Border(BorderCollection borders)
  {
    this.b = borders;
    this.a = new zaml(false);
    this.a.b(true);
  }
  
  Border(BorderCollection borders, int type)
  {
    this.b = borders;
    this.a = new zaml(false);
    this.a.b(true);
    this.c = type;
  }
  
  public ThemeColor getThemeColor()
  {
    if (this.a.c() == 4)
    {
      int i = ztr.f(this.a.e());
      return new ThemeColor(i, this.a.g());
    }
    return null;
  }
  
  public void setThemeColor(ThemeColor value)
  {
    this.a.a(4, ztr.g(value.getColorType()));
    this.a.a(value.getTint());
    b();
  }
  
  public Color getColor()
  {
    if (this.a.b()) {
      return Color.getBlack();
    }
    return this.a.b(this.b.a().e().p());
  }
  
  public void setColor(Color value)
  {
    if ((zh.a(value)) || (value == Color.getBlack())) {
      this.a.b(true);
    } else {
      this.a.a(2, value.toArgb());
    }
    this.a.f();
    b();
  }
  
  public int getArgbColor()
  {
    return getColor().toArgb();
  }
  
  public void setArgbColor(int value)
  {
    setColor(Color.fromArgb(value));
  }
  
  private void b()
  {
    if (!this.b.a().m()) {
      this.b.a().f(true);
    }
    int i = 6;
    switch (this.c)
    {
    case 1: 
      i = 2;
      break;
    case 2: 
      i = 3;
      break;
    case 4: 
      i = 4;
      break;
    case 8: 
      i = 5;
      break;
    case 32: 
      i = 10;
      break;
    case 16: 
      i = 9;
      break;
    case 128: 
      i = 6;
      break;
    case 64: 
      i = 7;
      break;
    }
    this.b.a().b(i);
  }
  
  int a()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int getLineStyle()
  {
    return this.d;
  }
  
  public void setLineStyle(int value)
  {
    this.d = value;
    b();
  }
  
  void b(int paramInt)
  {
    this.d = paramInt;
    if (this.b != null) {
      b();
    }
  }
  
  void a(Border paramBorder)
  {
    a(paramBorder, null);
  }
  
  void a(Border paramBorder, CopyOptions paramCopyOptions)
  {
    if (paramCopyOptions == null)
    {
      int i = 0;
      if ((paramBorder.b.a().e() != this.b.a().e()) && ((paramBorder.a.c() == 4) || (paramBorder.a.c() == 3))) {
        i = 1;
      }
      if (i != 0) {
        this.a.a(2, paramBorder.a.c(paramBorder.b.a().e().p()));
      } else {
        this.a.f(paramBorder.a);
      }
    }
    else
    {
      this.a.a(paramBorder.a, paramCopyOptions);
    }
    this.d = paramBorder.d;
  }
  
  boolean a(Border paramBorder, Workbook paramWorkbook1, Workbook paramWorkbook2)
  {
    if (this.d != paramBorder.d) {
      return false;
    }
    return (this.d == 0) || (!this.a.b(paramBorder.a, paramWorkbook1, paramWorkbook2));
  }
  
  boolean b(Border paramBorder)
  {
    if (this.d != paramBorder.d) {
      return false;
    }
    return (this.d == 0) || (!this.a.c(paramBorder.a));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Border.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */