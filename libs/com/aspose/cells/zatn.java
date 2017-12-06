package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import java.util.ArrayList;
import java.util.Iterator;

class zatn
{
  private zcjz a;
  private zasb b;
  
  public zatn(zasb paramzasb)
  {
    this.b = paramzasb;
  }
  
  zatn(zasb paramzasb, zcjz paramzcjz)
  {
    this.b = paramzasb;
    this.a = paramzcjz;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.a = paramzcjz;
    b();
    paramzcjz.b("office:automatic-styles");
    c();
    d();
    e();
    a();
    f();
    g();
    paramzcjz.b();
  }
  
  private void b()
    throws Exception
  {
    this.a.b("office:font-face-decls");
    Iterator localIterator = this.b.b.iterator();
    while (localIterator.hasNext())
    {
      zase localzase = (zase)localIterator.next();
      a(localzase);
    }
    this.a.b();
  }
  
  private void c()
    throws Exception
  {
    Iterator localIterator = this.b.c.iterator();
    while (localIterator.hasNext())
    {
      zasa localzasa = (zasa)localIterator.next();
      a(localzasa);
    }
  }
  
  private void d()
    throws Exception
  {
    Iterator localIterator = this.b.d.iterator();
    while (localIterator.hasNext())
    {
      zasl localzasl = (zasl)localIterator.next();
      a(localzasl);
    }
  }
  
  private void e()
    throws Exception
  {
    Iterator localIterator = this.b.a.getWorksheets().iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      a(localWorksheet);
    }
  }
  
  void a()
    throws Exception
  {
    Iterator localIterator = this.b.f.iterator();
    while (localIterator.hasNext())
    {
      zary localzary = (zary)localIterator.next();
      if (localzary.c.getName() == null) {
        a(localzary);
      }
    }
  }
  
  private void f()
    throws Exception
  {
    ArrayList localArrayList = this.b.a.getWorksheets().A();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      Font localFont = (Font)localArrayList.get(i);
      a(localFont.m(), localFont);
    }
  }
  
  private void g()
    throws Exception
  {
    if ((this.b.g != null) && (this.b.g.size() > 0))
    {
      Iterator localIterator = this.b.g.iterator();
      while (localIterator.hasNext())
      {
        zasc localzasc = (zasc)localIterator.next();
        a(localzasc);
      }
    }
  }
  
  private void a(zase paramzase)
    throws Exception
  {
    this.a.b("style:font-face");
    this.a.a("style", "name", null, paramzase.a());
    this.a.a("svg", "font-family", null, paramzase.a());
    this.a.b();
  }
  
  private void a(zasa paramzasa)
    throws Exception
  {
    this.a.b("style:style");
    this.a.a("style", "name", null, paramzasa.b());
    this.a.a("style", "family", null, "table-column");
    this.a.b("style:table-column-properties");
    this.a.a("fo", "break-before", null, zasn.a(paramzasa.c()));
    this.a.a("style", "column-width", null, zasp.b(paramzasa.a()) + "in");
    this.a.b();
    this.a.b();
  }
  
  private void a(zasl paramzasl)
    throws Exception
  {
    this.a.b("style:style");
    this.a.a("style", "name", null, paramzasl.a());
    this.a.a("style", "family", null, "table-row");
    this.a.b("style:table-row-properties");
    this.a.a("style", "row-height", null, zasp.b(zbxp.g(paramzasl.b() / 20.0D)) + "in");
    this.a.a("fo", "break-before", null, zasn.a(paramzasl.d()));
    this.a.a("style", "use-optimal-row-height", null, zasp.a(paramzasl.c()));
    this.a.b();
    this.a.b();
  }
  
  private void a(Worksheet paramWorksheet)
    throws Exception
  {
    this.a.b("style:style");
    int i = paramWorksheet.getIndex() + 1;
    this.a.a("style", "name", null, "ta" + i);
    this.a.a("style", "family", null, "table");
    this.a.a("style", "master-page-name", null, "PageStyle_5f_" + paramWorksheet.getName());
    this.a.b("style:table-properties");
    this.a.a("table", "display", null, paramWorksheet.isVisible() ? "true" : "false");
    this.a.a("style", "writing-mode", null, paramWorksheet.getDisplayRightToLeft() ? "rl-tb" : "lr-tb");
    this.a.b();
    this.a.b();
  }
  
  void a(zary paramzary)
    throws Exception
  {
    this.a.b("style:style");
    this.a.a("style", "name", null, paramzary.a());
    this.a.a("style", "family", null, "table-cell");
    if (!zasp.e(paramzary.b())) {
      this.a.a("style", "parent-style-name", null, paramzary.b());
    }
    if (!zasp.e(paramzary.a)) {
      this.a.a("style", "data-style-name", null, paramzary.a);
    }
    Style localStyle = paramzary.c;
    if ((paramzary.g) || (paramzary.f) || (paramzary.e) || (paramzary.d)) {
      a(paramzary, paramzary.c);
    }
    if (paramzary.b != null) {
      a(paramzary.b, true);
    }
    this.a.b();
  }
  
  private void a(int paramInt, Font paramFont)
    throws Exception
  {
    this.a.b("style:style");
    this.a.a("style", "name", null, "T" + paramInt);
    this.a.a("style", "family", null, "text");
    a(new zasf(paramFont), false);
    this.a.b();
  }
  
  private void a(zasc paramzasc)
    throws Exception
  {
    if (paramzasc == null) {
      return;
    }
    if ((paramzasc.u != null) && (paramzasc.u.size() > 0))
    {
      Iterator localIterator = paramzasc.u.iterator();
      while (localIterator.hasNext())
      {
        zatg localzatg = (zatg)localIterator.next();
        this.a.b("style:style");
        int i = paramzasc.i.getIndex() + localzatg.a.w() + 1;
        this.a.a("style", "name", null, "S" + i);
        this.a.a("style", "family", null, "graphic");
        a(localzatg);
        a(localzatg.a.getTextBody().m(), new Style(localzatg.a.P()));
        this.a.b();
      }
    }
  }
  
  private void a(zatg paramzatg)
    throws Exception
  {
    if (paramzatg == null) {
      return;
    }
    Shape localShape = paramzatg.a;
    this.a.b("style:graphic-properties");
    FontSettingCollection localFontSettingCollection = localShape.getTextBody();
    ShapeTextAlignment localShapeTextAlignment = localFontSettingCollection.d;
    if (localShapeTextAlignment != null)
    {
      this.a.a("fo", "wrap-option", null, zasp.b(localShapeTextAlignment.isTextWrapped()));
      if (localShapeTextAlignment.isTextWrapped())
      {
        this.a.a("draw", "textarea-vertical-align", null, zasp.c(localShapeTextAlignment.n()));
        this.a.a("draw", "textarea-horizontal-align", null, zasp.d(localShapeTextAlignment.m()));
      }
    }
    FillFormat localFillFormat = localShape.getFill();
    if (localFillFormat.getImageData() != null)
    {
      if (localFillFormat.getFillType() == 4) {
        this.a.a("draw", "fill", null, "bitmap");
      }
      int i = localShape.Q().getIndex() + localShape.w() + 1;
      this.a.a("draw", "fill-image-name", null, "D" + i);
      if (!localShape.aq()) {
        this.a.a("style", "repeat", null, "stretch");
      }
    }
    else
    {
      switch (localFillFormat.getFillType())
      {
      case 2: 
        this.a.a("draw", "fill", null, "solid");
        localObject = zasp.b(localFillFormat.getSolidFill().getColor());
        this.a.a("draw", "fill-color", null, (String)localObject);
        break;
      case 1: 
        this.a.a("draw", "fill", null, "none");
        break;
      }
    }
    Object localObject = new MsoLineFormat(localShape.B().getLine());
    if (((MsoLineFormat)localObject).isVisible())
    {
      this.a.a("draw", "stroke", null, "solid");
      this.a.a("svg", "stroke-width", null, zasp.a(zbxp.a(), (int)((MsoLineFormat)localObject).getWeight()));
      this.a.a("svg", "stroke-color", null, zasp.b(((MsoLineFormat)localObject).getForeColor()));
      this.a.a("svg", "stroke-opacity", null, zasp.d(((MsoLineFormat)localObject).a()));
    }
    else
    {
      this.a.a("draw", "stroke", null, "none");
    }
    MsoTextFrame localMsoTextFrame = localShape.getTextFrame();
    if (!localMsoTextFrame.isAutoMargin())
    {
      this.a.a("fo", "padding-top", null, zasp.a(zbxp.a(), localMsoTextFrame.c()));
      this.a.a("fo", "padding-bottom", null, zasp.a(zbxp.a(), localMsoTextFrame.d()));
      this.a.a("fo", "padding-left", null, zasp.a(zbxp.a(), localMsoTextFrame.a()));
      this.a.a("fo", "padding-right", null, zasp.a(zbxp.a(), localMsoTextFrame.b()));
      this.a.a("draw", "auto-grow-width", null, "false");
      this.a.a("draw", "auto-grow-height", null, "false");
    }
    this.a.b();
  }
  
  private void a(zary paramzary, Style paramStyle)
    throws Exception
  {
    this.a.b("style:table-cell-properties");
    if (paramzary.f) {
      if (paramStyle.f())
      {
        a(paramStyle.getBorders().getByBorderType(1), "fo", "border-left");
        a(paramStyle.getBorders().getByBorderType(2), "fo", "border-right");
        a(paramStyle.getBorders().getByBorderType(4), "fo", "border-top");
        a(paramStyle.getBorders().getByBorderType(8), "fo", "border-bottom");
        a(paramStyle.getBorders().getByBorderType(32), "style", "diagonal-bl-tr");
        a(paramStyle.getBorders().getByBorderType(16), "style", "diagonal-tl-br");
      }
      else
      {
        this.a.a("style", "border", null, "none");
      }
    }
    int i = paramStyle.getHorizontalAlignment();
    String str1;
    if (paramzary.g)
    {
      int j = paramStyle.getRotationAngle();
      str1 = null;
      String str2 = "ltr";
      if (j != 0)
      {
        if (j == 255)
        {
          str2 = "ttb";
          str1 = "0";
        }
        else if (j < 0)
        {
          j = 360 + j;
          str1 = zp.a(j);
        }
        else
        {
          str1 = zp.a(j);
        }
        this.a.a("style", "rotation-angle", null, str1);
        this.a.a("style", "rotation-align", null, "none");
        this.a.a("style", "direction", null, str2);
      }
      if (paramStyle.getShrinkToFit()) {
        this.a.a("style", "shrink-to-fit", null, "true");
      }
      if (paramStyle.isTextWrapped()) {
        this.a.a("fo", "wrap-option", null, "wrap");
      }
      String str3 = null;
      int m = paramStyle.getVerticalAlignment();
      if (m != 5)
      {
        switch (m)
        {
        case 0: 
          str3 = "bottom";
          break;
        case 9: 
          str3 = "top";
          break;
        case 1: 
          str3 = "middle";
        }
        this.a.a("style", "vertical-align", null, str3);
      }
      if (i == 4) {
        this.a.a("style", "repeat-content", null, "true");
      }
    }
    if (paramzary.d)
    {
      Color localColor = paramStyle.getForegroundColor();
      if ((paramStyle.getPattern() != 0) && (!localColor.isEmpty()))
      {
        str1 = zasp.b(localColor);
        this.a.a("fo", "background-color", null, str1);
      }
      else
      {
        this.a.a("fo", "background-color", null, "transparent");
      }
    }
    if (paramzary.e)
    {
      int k = (paramStyle.getName() == null) || (paramStyle.o()) ? 1 : 0;
      if (k != 0) {
        if (paramStyle.isFormulaHidden())
        {
          if (paramStyle.isLocked()) {
            this.a.a("style", "cell-protect", null, "protected formula-hidden");
          } else {
            this.a.a("style", "cell-protect", null, "formula-hidden");
          }
        }
        else if (paramStyle.isLocked()) {
          this.a.a("style", "cell-protect", null, "protected");
        } else {
          this.a.a("style", "cell-protect", null, "none");
        }
      }
    }
    this.a.b();
    if (paramzary.g) {
      a(i, paramStyle);
    }
  }
  
  void a(Border paramBorder, String paramString1, String paramString2)
    throws Exception
  {
    if (paramBorder.getLineStyle() == 0) {
      return;
    }
    String str = zasp.b(paramBorder.getLineStyle());
    if (!paramBorder.a.b()) {
      str = str + zasp.b(paramBorder.getColor());
    }
    this.a.a(paramString1, paramString2, null, str);
  }
  
  private void a(int paramInt, Style paramStyle)
    throws Exception
  {
    this.a.b("style:paragraph-properties");
    String str1 = null;
    switch (paramInt)
    {
    case 4: 
    case 7: 
      str1 = "start";
      break;
    case 8: 
      str1 = "end";
      break;
    case 1: 
    case 2: 
      str1 = "center";
      break;
    case 3: 
    case 6: 
      str1 = "justify";
    }
    String str2 = null;
    if (paramInt == 7)
    {
      double d = paramStyle.getIndentLevel() * 0.353D;
      str2 = zasp.b(d) + "cm";
    }
    if (str2 != null)
    {
      if (str1 != null)
      {
        this.a.a("fo", "text-align", null, str1);
        this.a.a("fo", "margin-left", null, str2);
      }
      else
      {
        this.a.a("fo", "margin-left", null, str2);
      }
    }
    else if (str1 != null) {
      this.a.a("fo", "text-align", null, str1);
    }
    this.a.b();
  }
  
  private void a(zasf paramzasf, boolean paramBoolean)
    throws Exception
  {
    int i = paramzasf.i();
    this.a.b("style:text-properties ");
    if ((paramBoolean) || ((!zasp.e(paramzasf.g())) && (paramzasf.a.f(13))))
    {
      this.a.a("style", "font-name", null, paramzasf.g());
      this.a.a("style", "font-name-asian", null, paramzasf.g());
    }
    if (paramzasf.b())
    {
      this.a.a("fo", "font-weight", null, "bold");
      this.a.a("style", "font-weight-asian", null, "bold");
      this.a.a("style", "font-weight-complex", null, "bold");
    }
    else
    {
      this.a.a("fo", "font-weight", null, "normal");
      this.a.a("style", "font-weight-asian", null, "normal");
      this.a.a("style", "font-weight-complex", null, "normal");
    }
    if (paramzasf.c())
    {
      this.a.a("fo", "font-style", null, "italic");
      this.a.a("style", "font-style-asian", null, "italic");
      this.a.a("style", "font-style-complex", null, "italic");
    }
    else
    {
      this.a.a("fo", "font-style", null, "normal");
      this.a.a("style", "font-style-asian", null, "normal");
      this.a.a("style", "font-style-complex", null, "normal");
    }
    if (paramzasf.d()) {
      this.a.a("style", "text-line-through-style", null, "solid");
    } else {
      this.a.a("style", "text-line-through-style", null, "none");
    }
    if (paramzasf.h() != 0.0D)
    {
      this.a.a("fo", "font-size", null, zasp.a(paramzasf.h()) + "pt");
      this.a.a("style", "font-size-asian", null, zasp.a(paramzasf.h()) + "pt");
      this.a.a("style", "font-size-complex", null, zasp.a(paramzasf.h()) + "pt");
    }
    if (!paramzasf.b)
    {
      String str = zasp.b(paramzasf.a());
      this.a.a("fo", "color", null, str);
    }
    else
    {
      this.a.a("style", "use-window-font-color", null, "true");
    }
    if ((i == 2) || (i == 4))
    {
      this.a.a("style", "text-underline-style", null, "solid");
      this.a.a("style", "text-underline-type", null, "double");
    }
    else if ((i == 1) || (i == 3))
    {
      this.a.a("style", "text-underline-style", null, "solid");
      this.a.a("style", "text-underline-type", null, "single");
    }
    else
    {
      this.a.a("style", "text-underline-style", null, "none");
    }
    if (paramzasf.f()) {
      this.a.a("style", "text-position", null, "33% 58%");
    }
    if (paramzasf.e()) {
      this.a.a("style", "text-position", null, "-33% 58%");
    }
    this.a.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */