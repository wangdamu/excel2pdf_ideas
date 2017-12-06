package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.zr;

public class MsoLineFormatHelper
{
  private Shape a;
  
  MsoLineFormatHelper(Shape shape)
  {
    this.a = shape;
  }
  
  void a(LineFormat paramLineFormat)
  {
    if (!isVisible())
    {
      paramLineFormat.setFillType(1);
    }
    else if (b())
    {
      paramLineFormat.setFillType(0);
    }
    else
    {
      paramLineFormat.setFillType(2);
      paramLineFormat.getSolidFill().setColor(getForeColor());
      paramLineFormat.getSolidFill().a(getBackColor());
      if (a(449)) {
        paramLineFormat.getSolidFill().setTransparency(zr.b(getTransparency(), 2));
      }
    }
    if (a(461)) {
      paramLineFormat.setCompoundType(getStyle());
    }
    paramLineFormat.setWeight(getWeight());
    if (a(462)) {
      paramLineFormat.setDashStyle(getDashStyle());
    }
    if ((!a(471)) || ((!a(470)) || (a(464)))) {
      paramLineFormat.setBeginArrowheadStyle(d());
    }
    if (a(467)) {
      paramLineFormat.setBeginArrowheadLength(f());
    }
    if (a(466)) {
      paramLineFormat.setBeginArrowheadWidth(e());
    }
    if (a(465)) {
      paramLineFormat.setEndArrowheadStyle(g());
    }
    if (a(469)) {
      paramLineFormat.setEndArrowheadLength(i());
    }
    if (a(468)) {
      paramLineFormat.setEndArrowheadWidth(h());
    }
  }
  
  void a(ShapeFormat paramShapeFormat)
  {
    if ((this.a.r) && (paramShapeFormat.b == null) && (paramShapeFormat.b == null)) {
      return;
    }
    LineFormat localLineFormat = paramShapeFormat.getLine();
    setVisible(true);
    switch (localLineFormat.getFillType())
    {
    case 1: 
      setVisible(false);
      break;
    case 2: 
      setForeColor(localLineFormat.getSolidFill().getColor());
      setTransparency(localLineFormat.getSolidFill().getTransparency());
      break;
    case 5: 
      setForeColor(localLineFormat.getPatternFill().getForegroundColor());
      setTransparency(localLineFormat.getPatternFill().e());
      setBackColor(localLineFormat.getPatternFill().getBackgroundColor());
      break;
    case 3: 
      setForeColor(localLineFormat.getGradientColor1());
      break;
    }
    if (localLineFormat.e(1)) {
      setStyle(localLineFormat.getCompoundType());
    }
    if (localLineFormat.e(0)) {
      setWeight(localLineFormat.getWeight());
    }
    if (localLineFormat.e(2)) {
      setDashStyle(localLineFormat.getDashStyle());
    }
    if ((!localLineFormat.e(3)) || ((!localLineFormat.e(4)) || (localLineFormat.e(5)))) {
      b(localLineFormat.getBeginArrowheadStyle());
    }
    if (localLineFormat.e(6))
    {
      d(localLineFormat.getBeginArrowheadLength());
      c(localLineFormat.getBeginArrowheadWidth());
    }
    if (localLineFormat.e(8)) {
      e(localLineFormat.getEndArrowheadStyle());
    }
    if (localLineFormat.e(9))
    {
      g(localLineFormat.getEndArrowheadLength());
      f(localLineFormat.getEndArrowheadWidth());
    }
  }
  
  zaum a()
  {
    return this.a.R().d();
  }
  
  public boolean isVisible()
  {
    boolean bool = true;
    if (this.a != null) {
      switch (this.a.getMsoDrawingType())
      {
      case 8: 
      case 24: 
        bool = false;
        break;
      }
    }
    return a().a(511, 3, bool);
  }
  
  public void setVisible(boolean value)
  {
    a().b(511, 3, value);
  }
  
  public int getStyle()
  {
    int i = a().c(461, 0);
    switch (i)
    {
    case 0: 
      return 0;
    case 1: 
      return 4;
    case 2: 
      return 3;
    case 3: 
      return 2;
    case 4: 
      return 1;
    }
    return 0;
  }
  
  public void setStyle(int value)
  {
    int i = 0;
    switch (value)
    {
    case 0: 
      i = 0;
      break;
    case 4: 
      i = 1;
      break;
    case 3: 
      i = 2;
      break;
    case 2: 
      i = 3;
      break;
    case 1: 
      i = 4;
      break;
    }
    if (i == 0) {
      a().b(461);
    } else {
      a().a(461, 0, Integer.valueOf(i));
    }
  }
  
  boolean b()
  {
    return a().g(448);
  }
  
  public Color getForeColor()
  {
    Color localColor = a().a(448, Color.getBlack());
    if (zh.a(localColor)) {
      return Color.getBlack();
    }
    return localColor;
  }
  
  public void setForeColor(Color value)
  {
    a().a(448, 1, value);
    setVisible(true);
  }
  
  public Color getBackColor()
  {
    return a().a(450, Color.getWhite());
  }
  
  public void setBackColor(Color value)
  {
    a().a(450, 1, value);
  }
  
  public int getDashStyle()
  {
    int i = 0;
    i = a().c(462, i);
    switch (i)
    {
    case 0: 
      return 6;
    case 2: 
      int j = a().c(471, 0);
      if (j == 1) {
        return 5;
      }
      return 7;
    case 6: 
      return 0;
    case 8: 
      return 1;
    case 7: 
      return 3;
    case 9: 
      return 4;
    case 10: 
      return 2;
    }
    return 0;
  }
  
  public void setDashStyle(int value)
  {
    int i = 0;
    a().b(471);
    switch (value)
    {
    case 6: 
      i = 0;
      break;
    case 7: 
      i = 2;
      break;
    case 5: 
      a().a(471, 0, Integer.valueOf(1));
      i = 2;
      break;
    case 0: 
      i = 6;
      break;
    case 1: 
      i = 8;
      break;
    case 3: 
      i = 7;
      break;
    case 4: 
      i = 9;
      break;
    case 2: 
      i = 10;
      break;
    }
    if (i == 0) {
      a().b(462);
    } else {
      a().a(462, 0, Integer.valueOf(i));
    }
  }
  
  public double getTransparency()
  {
    return 1.0D - c();
  }
  
  public void setTransparency(double value)
  {
    a(1.0D - value);
  }
  
  double c()
  {
    return a().a(449, 1.0F);
  }
  
  void a(double paramDouble)
  {
    a().b(449, (float)paramDouble);
  }
  
  boolean a(int paramInt)
  {
    return a().a(paramInt);
  }
  
  public double getWeight()
  {
    int i = 9525;
    if ((this.a.P().p().h()) && (this.a.x() != null)) {
      i = this.a.x().b();
    }
    return a().c(459, i) / 12700.0F;
  }
  
  public void setWeight(double value)
  {
    a().a(459, 0, Integer.valueOf((int)(value * 12700.0D + 0.5D)));
  }
  
  int d()
  {
    return a().c(464, 0);
  }
  
  void b(int paramInt)
  {
    a().a(464, 0, Integer.valueOf(paramInt));
  }
  
  int e()
  {
    return a().c(466, 1);
  }
  
  void c(int paramInt)
  {
    a().a(466, 0, Integer.valueOf(paramInt));
  }
  
  int f()
  {
    return a().c(467, 1);
  }
  
  void d(int paramInt)
  {
    a().a(467, 0, Integer.valueOf(paramInt));
  }
  
  int g()
  {
    return a().c(465, 0);
  }
  
  void e(int paramInt)
  {
    a().a(465, 0, Integer.valueOf(paramInt));
  }
  
  int h()
  {
    return a().c(468, 1);
  }
  
  void f(int paramInt)
  {
    a().a(468, 0, Integer.valueOf(paramInt));
  }
  
  int i()
  {
    return a().c(469, 1);
  }
  
  void g(int paramInt)
  {
    a().a(469, 0, Integer.valueOf(paramInt));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MsoLineFormatHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */