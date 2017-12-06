package com.aspose.cells;

class zaxi
{
  static int a = 0;
  static int b = 3;
  static int c = 4;
  static int d = 5;
  static int e = 7;
  static int f = 8;
  
  static Style a(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setItalic(true);
    return localStyle;
  }
  
  static Style b(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(1);
    return localStyle;
  }
  
  static Style a(WorksheetCollection paramWorksheetCollection, int paramInt, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean) {
      localStyle.setHorizontalAlignment(8);
    } else {
      localStyle.setHorizontalAlignment(7);
    }
    if (paramInt > 0) {
      localStyle.setIndentLevel(paramInt);
    }
    return localStyle;
  }
  
  static Style c(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style d(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style e(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style f(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style g(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(e, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style h(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style i(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style j(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style k(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setSize(9);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(1);
    return localStyle;
  }
  
  static Style l(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style m(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style n(WorksheetCollection paramWorksheetCollection)
  {
    return h(paramWorksheetCollection);
  }
  
  static Style a(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style b(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style o(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style p(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style q(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style r(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style s(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style t(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style u(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style v(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style w(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style x(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style y(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style z(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style A(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style B(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style C(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style D(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style E(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 153));
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style F(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style G(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style H(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style I(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 153));
    localStyle.getFont().setSize(11);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style c(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style d(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style J(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.getFont().setSize(11);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(102, 102, 153));
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style K(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style L(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style M(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(102, 102, 153));
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(e, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style N(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style O(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style P(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style Q(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style R(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(1);
    localStyle.a(d, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style S(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(1);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(e, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style T(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(1);
    localStyle.a(c, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style U(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(1);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style V(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    return localStyle;
  }
  
  static Style W(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style X(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style Y(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style Z(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.getFont().setItalic(true);
    localStyle.setHorizontalAlignment(1);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style aa(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.getFont().setItalic(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style ab(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ac(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ad(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ae(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style af(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ag(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ah(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ai(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aj(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ak(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style al(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(e, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style am(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(c, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style an(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(1);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ao(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(255, 255, 204));
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ap(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setItalic(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(255, 255, 204));
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aq(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ar(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(f, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style as(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(255, 255, 204));
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style at(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style au(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style av(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style aw(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style ax(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(8);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style ay(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style az(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aA(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(e, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aB(WorksheetCollection paramWorksheetCollection)
  {
    return aA(paramWorksheetCollection);
  }
  
  static Style aC(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style aD(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aE(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(12);
    localStyle.setRotationAngle(90);
    return localStyle;
  }
  
  static Style aF(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aG(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aH(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style aI(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aJ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style aK(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style aL(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aM(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style a(WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, zauj.h(paramInt), 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aN(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aO(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aP(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aQ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aR(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aS(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aT(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aU(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aV(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(128, 128, 0));
    return localStyle;
  }
  
  static Style aW(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 0));
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 0));
    return localStyle;
  }
  
  static Style aX(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aY(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style aZ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ba(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(128, 128, 0));
    return localStyle;
  }
  
  static Style bb(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bc(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bd(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "thick", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style be(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bf(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bg(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bh(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(e, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bi(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style bj(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.a(b, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style bk(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style bl(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style bm(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bn(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style bo(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style bp(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bq(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style e(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style f(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style br(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(1);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bs(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setHorizontalAlignment(1);
    return localStyle;
  }
  
  static Style bt(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bu(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bv(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bw(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bx(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style by(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bz(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bA(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bB(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 0, 0));
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(f, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bC(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 0));
    localStyle.getFont().setSize(12);
    localStyle.setRotationAngle(90);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bD(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(0, 0, 0));
    localStyle.getFont().setSize(12);
    localStyle.setRotationAngle(90);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bE(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bF(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getBlack());
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style bG(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bH(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style bI(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style g(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style bJ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(d, "thick", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bK(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(12);
    localStyle.setRotationAngle(90);
    localStyle.a(d, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bL(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style bM(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bN(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bO(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "dotted", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bP(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "hair", 2, Color.fromArgb(128, 0, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bQ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bR(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bS(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style bT(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bU(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bV(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style bW(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setRotationAngle(90);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bX(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style bY(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(1);
    return localStyle;
  }
  
  static Style bZ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ca(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cb(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style cc(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cd(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style h(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style i(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style ce(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setRotationAngle(90);
    return localStyle;
  }
  
  static Style cf(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style cg(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ch(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ci(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cj(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ck(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style cl(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cm(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cn(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(255, 204, 0));
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style co(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cp(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cq(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(9);
    localStyle.setHorizontalAlignment(1);
    return localStyle;
  }
  
  static Style cr(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cs(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ct(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "none", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(255, 204, 0));
    return localStyle;
  }
  
  static Style cu(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style j(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style cv(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(255, 204, 0));
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style cw(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(1);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cx(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "dotted", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cy(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "hair", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cz(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cA(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cB(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cC(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(f, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cD(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cE(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cF(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cG(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cH(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style k(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    if (paramBoolean)
    {
      localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
      localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    }
    return localStyle;
  }
  
  static Style cI(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cJ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cK(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cL(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cM(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cN(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style cO(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.setHorizontalAlignment(8);
    return localStyle;
  }
  
  static Style cP(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cQ(WorksheetCollection paramWorksheetCollection)
  {
    return cP(paramWorksheetCollection);
  }
  
  static Style cR(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(5);
    return localStyle;
  }
  
  static Style cS(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setSize(11);
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style cT(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setSize(11);
    return localStyle;
  }
  
  static Style cU(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setItalic(true);
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style cV(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style cW(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(5);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style cX(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style cY(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style cZ(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style da(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style db(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.setHorizontalAlignment(8);
    return localStyle;
  }
  
  static Style dc(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(255, 255, 204));
    return localStyle;
  }
  
  static Style dd(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style de(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style df(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 51));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style dg(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style dh(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 51));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style di(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style dj(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dk(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dl(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(255, 255, 204));
    return localStyle;
  }
  
  static Style dm(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style dn(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 51));
    localStyle.a(a, "thin", 2, Color.fromArgb(51, 51, 51).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style jdMethod_do(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style dp(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dq(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.setHorizontalAlignment(8);
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dr(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ds(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dt(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style du(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dv(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dw(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dx(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style dy(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style dz(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(102, 102, 153));
    return localStyle;
  }
  
  static Style dA(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(102, 102, 153));
    localStyle.setHorizontalAlignment(8);
    return localStyle;
  }
  
  static Style dB(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(204, 204, 255));
    return localStyle;
  }
  
  static Style dC(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(a, "thick", 2, Color.fromArgb(51, 51, 153).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dD(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 153));
    localStyle.a(d, "thin", 2, Color.fromArgb(51, 51, 153).toArgb(), 0.0D);
    localStyle.a(a, "thick", 2, Color.fromArgb(51, 51, 153).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dE(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(204, 204, 255));
    return localStyle;
  }
  
  static Style dF(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "thick", 2, Color.fromArgb(102, 102, 153).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dG(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 153));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style dH(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 153));
    return localStyle;
  }
  
  static Style dI(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(102, 102, 153));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style dJ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(102, 102, 153));
    return localStyle;
  }
  
  static Style dK(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(102, 102, 153));
    return localStyle;
  }
  
  static Style dL(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style dM(WorksheetCollection paramWorksheetCollection)
  {
    return cN(paramWorksheetCollection);
  }
  
  static Style dN(WorksheetCollection paramWorksheetCollection)
  {
    return cO(paramWorksheetCollection);
  }
  
  static Style dO(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style dP(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dQ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    localStyle.a(d, "dashed", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dR(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style dS(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style dT(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style dU(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style dV(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    return localStyle;
  }
  
  static Style dW(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 51));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style dX(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style dY(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style dZ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ea(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style eb(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.fromArgb(153, 51, 0));
    return localStyle;
  }
  
  static Style ec(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.fromArgb(153, 51, 0));
    localStyle.setHorizontalAlignment(8);
    return localStyle;
  }
  
  static Style ed(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(0, 0, 128));
    return localStyle;
  }
  
  static Style ee(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(0, 0, 128));
    return localStyle;
  }
  
  static Style ef(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setHorizontalAlignment(5);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(0, 0, 128));
    return localStyle;
  }
  
  static Style eg(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "thin", 2, Color.fromArgb(153, 51, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eh(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "thin", 2, Color.fromArgb(153, 51, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ei(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setHorizontalAlignment(5);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(128, 128, 128));
    localStyle.a(a, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ej(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(0, 0, 128));
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "thick", 2, Color.fromArgb(51, 51, 153).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ek(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(0, 0, 128));
    return localStyle;
  }
  
  static Style el(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(0, 0, 128));
    localStyle.setHorizontalAlignment(7);
    localStyle.a(b, "dashed", 2, Color.fromArgb(0, 0, 128).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style em(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(0, 0, 128));
    localStyle.a(c, "dashed", 2, Color.fromArgb(0, 0, 128).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style en(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.fromArgb(0, 0, 128));
    localStyle.a(b, "thick", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(c, "thick", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(d, "thick", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    localStyle.a(a, "thick", 2, Color.fromArgb(128, 128, 128).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eo(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ep(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style eq(WorksheetCollection paramWorksheetCollection)
  {
    return da(paramWorksheetCollection);
  }
  
  static Style er(WorksheetCollection paramWorksheetCollection)
  {
    return db(paramWorksheetCollection);
  }
  
  static Style es(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(12);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style et(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style eu(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style ev(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(12);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style ew(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ex(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(b, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ey(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    return localStyle;
  }
  
  static Style ez(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "dashed", 2, Color.fromArgb(0, 0, 128).toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eA(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eB(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(12);
    localStyle.a(d, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eC(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style eD(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    return localStyle;
  }
  
  static Style eE(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(51, 51, 51));
    localStyle.setHorizontalAlignment(8);
    return localStyle;
  }
  
  static Style eF(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(102, 102, 153));
    return localStyle;
  }
  
  static Style eG(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eH(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    localStyle.a(d, "dashed", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "dashed", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eI(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(102, 102, 153));
    return localStyle;
  }
  
  static Style eJ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style eK(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style eL(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    return localStyle;
  }
  
  static Style eM(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style eN(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 128));
    return localStyle;
  }
  
  static Style eO(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.a(d, "dashed", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eP(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style eQ(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style eR(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.setHorizontalAlignment(8);
    return localStyle;
  }
  
  static Style eS(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(128, 128, 128));
    return localStyle;
  }
  
  static Style eT(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    localStyle.a(b, "thick", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eU(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(192, 192, 192));
    return localStyle;
  }
  
  static Style eV(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.a(b, "thick", 2, Color.fromArgb(150, 150, 150).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eW(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(c, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(d, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    localStyle.a(a, "thin", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style eX(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setItalic(true);
    return localStyle;
  }
  
  static Style eY(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    return localStyle;
  }
  
  static Style eZ(WorksheetCollection paramWorksheetCollection)
  {
    return cM(paramWorksheetCollection);
  }
  
  static Style fa(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style fb(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.setHorizontalAlignment(8);
    return localStyle;
  }
  
  static Style fc(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(16);
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style fd(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(16);
    return localStyle;
  }
  
  static Style fe(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setHorizontalAlignment(7);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(128, 128, 0));
    localStyle.a(a, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style ff(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "hair", 2, Color.fromArgb(128, 128, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style fg(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setHorizontalAlignment(5);
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.fromArgb(128, 128, 0));
    localStyle.a(a, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style fh(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(7);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style fi(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.setHorizontalAlignment(5);
    localStyle.a(a, "medium", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style fj(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 0));
    localStyle.setHorizontalAlignment(7);
    return localStyle;
  }
  
  static Style fk(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setColor(Color.fromArgb(128, 128, 0));
    localStyle.a(c, "hair", 2, Color.fromArgb(128, 128, 0).toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style fl(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.getFont().setBold(true);
    localStyle.getFont().setSize(11);
    localStyle.getFont().setColor(Color.getWhite());
    localStyle.setPattern(1);
    localStyle.setForegroundColor(Color.getBlack());
    localStyle.a(b, "none", 2, Color.getBlack().toArgb(), 0.0D);
    return localStyle;
  }
  
  static Style fm(WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle = new Style(paramWorksheetCollection);
    localStyle.a(b, "thin", 2, Color.fromArgb(128, 128, 0).toArgb(), 0.0D);
    return localStyle;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */