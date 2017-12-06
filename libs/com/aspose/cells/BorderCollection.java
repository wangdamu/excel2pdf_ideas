package com.aspose.cells;

import com.aspose.cells.a.c.zh;

public class BorderCollection
{
  boolean a;
  private Style b;
  private Border[] c;
  
  BorderCollection(Style style)
  {
    this.b = style;
    this.c = new Border[8];
    for (int i = 0; i < 6; i++)
    {
      Border localBorder = new Border(this);
      switch (i)
      {
      case 0: 
        localBorder.a(8);
        break;
      case 1: 
        localBorder.a(16);
        break;
      case 2: 
        localBorder.a(32);
        break;
      case 3: 
        localBorder.a(1);
        break;
      case 4: 
        localBorder.a(2);
        break;
      case 5: 
        localBorder.a(4);
      }
      this.c[i] = localBorder;
    }
  }
  
  Style a()
  {
    return this.b;
  }
  
  Border b()
  {
    return this.c[6];
  }
  
  void a(Border paramBorder)
  {
    this.c[6] = paramBorder;
  }
  
  Border c()
  {
    return this.c[7];
  }
  
  void b(Border paramBorder)
  {
    this.c[7] = paramBorder;
  }
  
  public Border getByBorderType(int borderType)
  {
    switch (borderType)
    {
    case 8: 
      return this.c[0];
    case 16: 
      return this.c[1];
    case 32: 
      return this.c[2];
    case 1: 
      return this.c[3];
    case 2: 
      return this.c[4];
    case 4: 
      return this.c[5];
    case 128: 
      if (this.c[6] == null) {
        this.c[6] = new Border(this, 128);
      }
      return this.c[6];
    case 64: 
      if (this.c[7] == null) {
        this.c[7] = new Border(this, 64);
      }
      return this.c[7];
    }
    return null;
  }
  
  boolean d()
  {
    return (this.c[0].getLineStyle() != 0) || (this.c[1].getLineStyle() != 0) || (this.c[2].getLineStyle() != 0) || (this.c[3].getLineStyle() != 0) || (this.c[4].getLineStyle() != 0) || (this.c[5].getLineStyle() != 0) || ((this.c[6] != null) && (this.c[6].getLineStyle() != 0)) || ((this.c[7] != null) && (this.c[7].getLineStyle() != 0));
  }
  
  boolean a(BorderCollection paramBorderCollection, Workbook paramWorkbook1, Workbook paramWorkbook2)
  {
    if (paramBorderCollection == null) {
      return !d();
    }
    for (int i = 0; i < 6; i++)
    {
      Border localBorder1 = this.c[i];
      Border localBorder2 = paramBorderCollection.c[i];
      if (localBorder1.getLineStyle() != localBorder2.getLineStyle()) {
        return false;
      }
      if ((localBorder1.getLineStyle() != 0) && (localBorder1.a.b(localBorder2.a, paramWorkbook1, paramWorkbook2))) {
        return false;
      }
    }
    return true;
  }
  
  public void setColor(Color color)
  {
    for (int i = 0; i < 6; i++)
    {
      Border localBorder = this.c[i];
      localBorder.setColor(color);
    }
  }
  
  public void setStyle(int style)
  {
    for (int i = 0; i < 6; i++)
    {
      Border localBorder = this.c[i];
      localBorder.setLineStyle(style);
    }
  }
  
  public Color getDiagonalColor()
  {
    if (this.c[2].getLineStyle() == 0) {
      return this.c[1].getColor();
    }
    return this.c[2].getColor();
  }
  
  public void setDiagonalColor(Color value)
  {
    zaml localzaml = new zaml(false);
    if ((zh.a(value)) || (value == Color.getBlack())) {
      localzaml.b(true);
    } else {
      localzaml.a(2, value.toArgb());
    }
    this.c[1].a = localzaml;
    this.c[2].a = localzaml;
  }
  
  zaml e()
  {
    if (this.c[2].getLineStyle() == 0) {
      return this.c[1].a;
    }
    return this.c[2].a;
  }
  
  public int getDiagonalStyle()
  {
    if (this.c[2].getLineStyle() == 0) {
      return this.c[1].getLineStyle();
    }
    return this.c[2].getLineStyle();
  }
  
  public void setDiagonalStyle(int value)
  {
    this.c[1].setLineStyle(value);
    this.c[2].setLineStyle(value);
  }
  
  byte f()
  {
    Border localBorder1 = getByBorderType(16);
    Border localBorder2 = getByBorderType(32);
    if (localBorder1.getLineStyle() != 0)
    {
      if (localBorder2.getLineStyle() != 0) {
        return 3;
      }
      return 1;
    }
    if (localBorder2.getLineStyle() != 0) {
      return 2;
    }
    return 0;
  }
  
  void a(BorderCollection paramBorderCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < 6; i++)
    {
      Border localBorder1 = paramBorderCollection.c[i];
      Border localBorder2 = this.c[i];
      localBorder2.a(localBorder1);
    }
    for (i = 6; i < 8; i++) {
      if (paramBorderCollection.c[i] != null)
      {
        this.c[i] = new Border(this);
        this.c[i].a(paramBorderCollection.c[i]);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/BorderCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */