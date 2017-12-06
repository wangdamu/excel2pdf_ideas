package com.aspose.cells;

import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zaro
{
  private zcjz a;
  private zasb b;
  
  public zaro(zasb paramzasb)
  {
    this.b = paramzasb;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.a = paramzcjz;
    paramzcjz.b("office:automatic-styles");
    Object localObject;
    for (int i = 0; i < this.b.a.getWorksheets().getCount(); i++)
    {
      localObject = this.b.a.getWorksheets().get(i);
      a((Worksheet)localObject);
    }
    if (this.b.k.size() > 0) {
      for (i = 0; i < this.b.k.size(); i++)
      {
        localObject = (Font)this.b.k.get(i);
        a(i + 1, (Font)localObject);
      }
    }
    paramzcjz.b();
  }
  
  private void a(Worksheet paramWorksheet)
    throws Exception
  {
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    this.a.b("style:page-layout");
    this.a.a("style", "name", null, "pm" + (paramWorksheet.getIndex() + 1));
    a(localPageSetup);
    b(localPageSetup);
    c(localPageSetup);
    this.a.b();
  }
  
  private void a(PageSetup paramPageSetup)
    throws Exception
  {
    this.a.b("style:page-layout-properties");
    if (paramPageSetup.getOrientation() == 0) {
      this.a.a("style", "print-orientation", null, "landscape");
    } else {
      this.a.a("style", "print-orientation", null, "portrait");
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    zauu.a(paramPageSetup, arrayOfDouble1, arrayOfDouble2);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    this.a.a("fo", "page-width", null, zasp.b(zr.b(d1, 4)) + "in");
    this.a.a("fo", "page-height", null, zasp.b(zr.b(d2, 4)) + "in");
    if (paramPageSetup.isPercentScale())
    {
      this.a.a("style", "scale-to", null, zasp.a(paramPageSetup.getZoom()) + "%");
    }
    else
    {
      this.a.a("style", "scale-to-X", null, zasp.a(paramPageSetup.getFitToPagesWide()));
      this.a.a("style", "scale-to-Y", null, zasp.a(paramPageSetup.getFitToPagesTall()));
    }
    if (paramPageSetup.getOrder() == 1) {
      this.a.a("style", "print-page-order", null, "ltr");
    } else if (paramPageSetup.getOrder() == 0) {
      this.a.a("style", "print-page-order", null, "ttb");
    }
    this.a.a("fo", "margin-left", null, zasp.b(zr.b(paramPageSetup.getLeftMarginInch(), 4)) + "in");
    this.a.a("fo", "margin-right", null, zasp.b(zr.b(paramPageSetup.getRightMarginInch(), 4)) + "in");
    this.a.a("fo", "margin-top", null, zasp.b(zr.b(paramPageSetup.getHeaderMarginInch(), 4)) + "in");
    this.a.a("fo", "margin-bottom", null, zasp.b(zr.b(paramPageSetup.getFooterMarginInch(), 4)) + "in");
    if (paramPageSetup.isAutoFirstPageNumber()) {
      this.a.a("style", "first-page-number", null, "continue");
    } else {
      this.a.a("style", "first-page-number", null, zasp.a(paramPageSetup.getFirstPageNumber()));
    }
    if (paramPageSetup.getCenterHorizontally())
    {
      if (paramPageSetup.getCenterVertically()) {
        this.a.a("style", "table-centering", null, "both");
      } else {
        this.a.a("style", "table-centering", null, "horizontal");
      }
    }
    else if (paramPageSetup.getCenterVertically()) {
      this.a.a("style", "table-centering", null, "vertical");
    }
    StringBuilder localStringBuilder = new StringBuilder("zero-values");
    if (paramPageSetup.getPrintHeadings()) {
      localStringBuilder.append(" headers");
    }
    if (paramPageSetup.getPrintGridlines()) {
      localStringBuilder.append(" grid");
    }
    if (paramPageSetup.getPrintDraft()) {
      localStringBuilder.append(" charts drawings objects");
    }
    if (paramPageSetup.getPrintComments() != 1) {
      localStringBuilder.append(" annotations");
    }
    this.a.a("style", "print", null, zs.a(localStringBuilder));
    this.a.b();
  }
  
  private void b(PageSetup paramPageSetup)
    throws Exception
  {
    this.a.b("style:header-style");
    a(paramPageSetup, true);
    this.a.b();
  }
  
  private void c(PageSetup paramPageSetup)
    throws Exception
  {
    this.a.b("style:footer-style");
    a(paramPageSetup, false);
    this.a.b();
  }
  
  private void a(PageSetup paramPageSetup, boolean paramBoolean)
    throws Exception
  {
    this.a.b("style:header-footer-properties");
    if (paramBoolean)
    {
      this.a.a("fo", "min-height", null, zasp.b(zr.b(paramPageSetup.getTopMarginInch() - paramPageSetup.getHeaderMarginInch(), 4)) + "in");
      this.a.a("fo", "margin-left", null, "0in");
      this.a.a("fo", "margin-right", null, "0in");
      this.a.a("fo", "margin-bottom", null, "0in");
    }
    else
    {
      this.a.a("fo", "min-height", null, zasp.b(zr.b(paramPageSetup.getBottomMarginInch() - paramPageSetup.getFooterMarginInch(), 4)) + "in");
      this.a.a("fo", "margin-left", null, "0in");
      this.a.a("fo", "margin-right", null, "0in");
      this.a.a("fo", "margin-top", null, "0in");
    }
    this.a.b();
  }
  
  private void a(int paramInt, Font paramFont)
    throws Exception
  {
    this.a.b("style:style");
    this.a.a("style", "name", null, "T" + paramInt);
    this.a.a("style", "family", null, "text");
    a(new zasf(paramFont));
    this.a.b();
  }
  
  private void a(zasf paramzasf)
    throws Exception
  {
    int i = paramzasf.i();
    this.a.b("style:text-properties ");
    if (!zasp.e(paramzasf.g()))
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
    if (paramzasf.c())
    {
      this.a.a("fo", "font-style", null, "italic");
      this.a.a("style", "font-style-asian", null, "italic");
      this.a.a("style", "font-style-complex", null, "italic");
    }
    if (paramzasf.d()) {
      this.a.a("style", "text-line-through-style", null, "solid");
    }
    if (paramzasf.h() != 0.0D) {
      this.a.a("fo", "font-size", null, zasp.a(paramzasf.h()) + "pt");
    }
    if (!paramzasf.a().isEmpty())
    {
      String str = zasp.b(paramzasf.a());
      this.a.a("fo", "color", null, str);
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
    if (paramzasf.f()) {
      this.a.a("style", "text-position", null, "33% 58%");
    }
    if (paramzasf.e()) {
      this.a.a("style", "text-position", null, "-33% 58%");
    }
    this.a.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */