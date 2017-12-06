package com.aspose.cells;

import com.aspose.cells.b.a.zs;

class zun
  extends ztp
{
  private Workbook b;
  private Worksheet c;
  private zpu d;
  private PageSetup e;
  
  zun(zpu paramzpu)
  {
    this.d = paramzpu;
    this.b = paramzpu.b;
    this.c = paramzpu.a;
    this.e = this.c.getCharts().get(0).getPageSetup();
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("chartsheet");
    if (zauj.a) {
      paramzcjz.a("xmlns", zaty.a);
    } else {
      paramzcjz.a("xmlns", zaty.b);
    }
    paramzcjz.a("xmlns", "r", null, zaty.e);
    d(paramzcjz);
    c(paramzcjz);
    b(paramzcjz);
    a(paramzcjz, this.e, null);
    a(paramzcjz, this.e, null, this.d.o);
    b(paramzcjz, this.e, null);
    if (this.d.j.a != null)
    {
      paramzcjz.b("drawing");
      paramzcjz.a("r:id", null, this.d.j.a);
      paramzcjz.b();
    }
    if (this.d.v != null)
    {
      paramzcjz.b("legacyDrawing");
      paramzcjz.a("r:id", null, this.d.v);
      paramzcjz.b();
    }
    if (this.d.u != null)
    {
      paramzcjz.b("legacyDrawingHF");
      paramzcjz.a("r:id", null, this.d.u);
      paramzcjz.b();
    }
    if (this.d.n != null)
    {
      paramzcjz.b("picture");
      paramzcjz.a("r:id", null, this.d.n);
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    if ((this.c.s != null) && (this.c.s.getCount() != 0))
    {
      paramzcjz.b("customSheetViews");
      for (int i = 0; i < this.c.s.getCount(); i++)
      {
        zoh localzoh = this.c.s.a(i);
        paramzcjz.b("customSheetView");
        a(paramzcjz, localzoh);
        a(paramzcjz, localzoh.e(), null);
        a(paramzcjz, localzoh.e(), null, null);
        b(paramzcjz, localzoh.e(), null);
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zoh paramzoh)
    throws Exception
  {
    int i = paramzoh.I();
    if (i < 64) {
      paramzcjz.a("colorId", zauj.z(i));
    }
    paramzcjz.a("guid", "{" + zs.a(paramzoh.n) + "}");
    if (paramzoh.p()) {
      paramzcjz.a("filter", "1");
    }
    if (paramzoh.q()) {
      paramzcjz.a("filterUnique", "1");
    }
    if (!paramzoh.e().isPercentScale()) {
      paramzcjz.a("fitToPage", "1");
    }
    if (paramzoh.l()) {
      paramzcjz.a("hiddenColumns", "1");
    }
    if (paramzoh.k()) {
      paramzcjz.a("hiddenRows", "1");
    }
    if (!paramzoh.B()) {
      paramzcjz.a("outlineSymbols", "0");
    }
    if (paramzoh.r()) {
      paramzcjz.a("printArea", "1");
    }
    if (paramzoh.D() != 100) {
      paramzcjz.a("scale", zauj.z(paramzoh.D()));
    }
    if (paramzoh.o()) {
      paramzcjz.a("showAutoFilter", "1");
    }
    if (paramzoh.v()) {
      paramzcjz.a("showFormulas", "1");
    }
    if (!paramzoh.w()) {
      paramzcjz.a("showGridLines", "0");
    }
    if (paramzoh.n()) {
      paramzcjz.a("showPageBreaks", "1");
    }
    if (!paramzoh.x()) {
      paramzcjz.a("showRowCol", "0");
    }
    if ((paramzoh.E() == 2) && (!paramzoh.G())) {
      paramzcjz.a("showRuler", "0");
    }
    if (paramzoh.F() != 0)
    {
      str1 = "hidden";
      if (paramzoh.F() == 2) {
        str1 = "veryHidden";
      }
      paramzcjz.a("state", str1);
    }
    String str1 = CellsHelper.cellIndexToName(paramzoh.i(), paramzoh.j());
    paramzcjz.a("topLeftCell", str1);
    String str2 = zauj.as(paramzoh.E());
    if (str2 != null) {
      paramzcjz.a("view", str2);
    }
    if (!paramzoh.A()) {
      paramzcjz.a("showZeros", "0");
    }
  }
  
  static void a(zcjz paramzcjz, PageSetup paramPageSetup, String paramString)
    throws Exception
  {
    paramzcjz.c(paramString, "pageMargins", null);
    paramzcjz.a("left", zauj.b(paramPageSetup.getLeftMarginInch()));
    paramzcjz.a("right", zauj.b(paramPageSetup.getRightMarginInch()));
    paramzcjz.a("top", zauj.b(paramPageSetup.getTopMarginInch()));
    paramzcjz.a("bottom", zauj.b(paramPageSetup.getBottomMarginInch()));
    paramzcjz.a("header", zauj.b(paramPageSetup.getHeaderMarginInch()));
    paramzcjz.a("footer", zauj.b(paramPageSetup.getFooterMarginInch()));
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, PageSetup paramPageSetup, String paramString1, String paramString2)
    throws Exception
  {
    if ((paramPageSetup == null) || (!paramPageSetup.e())) {
      return;
    }
    paramzcjz.c(paramString1, "pageSetup", null);
    if (paramPageSetup.getBlackAndWhite()) {
      paramzcjz.a("blackAndWhite", "1");
    }
    if (paramPageSetup.getPrintComments() != 1) {
      paramzcjz.a("cellComments", zauj.b(paramPageSetup.getPrintComments()));
    }
    if (paramPageSetup.getPrintDraft()) {
      paramzcjz.a("draft", "1");
    }
    if (paramPageSetup.getPrintErrors() != 2) {
      paramzcjz.a("errors", zauj.c(paramPageSetup.getPrintErrors()));
    }
    if (!paramPageSetup.isAutoFirstPageNumber())
    {
      paramzcjz.a("firstPageNumber", zauj.z(paramPageSetup.getFirstPageNumber()));
      paramzcjz.a("useFirstPageNumber", "1");
    }
    if (paramPageSetup.getFitToPagesTall() != 1) {
      paramzcjz.a("fitToHeight", zauj.z(paramPageSetup.getFitToPagesTall()));
    }
    if (paramPageSetup.getFitToPagesWide() != 1) {
      paramzcjz.a("fitToWidth", zauj.z(paramPageSetup.getFitToPagesWide()));
    }
    if ((paramPageSetup.getPrintQuality() > 0) && (paramPageSetup.getPrintQuality() != 600))
    {
      paramzcjz.a("horizontalDpi", zauj.z(paramPageSetup.getPrintQuality()));
      paramzcjz.a("verticalDpi", zauj.z(paramPageSetup.getPrintQuality()));
    }
    paramzcjz.a("orientation", zauj.a(paramPageSetup.getOrientation()));
    if (paramPageSetup.getOrder() != 0) {
      paramzcjz.a("pageOrder", zauj.d(paramPageSetup.getOrder()));
    }
    if (!paramPageSetup.k()) {
      paramzcjz.a("paperSize", zauj.z(paramPageSetup.a()));
    }
    if (paramPageSetup.getZoom() != 100) {
      paramzcjz.a("scale", zauj.z(paramPageSetup.getZoom()));
    }
    if (paramString2 != null) {
      paramzcjz.a("r:id", paramString2);
    }
    paramzcjz.b();
  }
  
  static void b(zcjz paramzcjz, PageSetup paramPageSetup, String paramString)
    throws Exception
  {
    String str1 = paramPageSetup.a(true, 2);
    String str2 = paramPageSetup.a(false, 2);
    String str3 = paramPageSetup.a(true, 0);
    String str4 = paramPageSetup.a(false, 0);
    String str5 = paramPageSetup.a(true, 1);
    String str6 = paramPageSetup.a(false, 1);
    if ((str1.length() > 0) || (str2.length() > 0) || (str3.length() > 0) || (str4.length() > 0) || (str5.length() > 0) || (str6.length() > 0) || (paramPageSetup.isHFDiffOddEven()) || (paramPageSetup.isHFDiffFirst()) || (!paramPageSetup.isHFScaleWithDoc()) || (!paramPageSetup.isHFAlignMargins()))
    {
      paramzcjz.c(paramString, "headerFooter", null);
      if (paramPageSetup.isHFDiffOddEven()) {
        paramzcjz.a("differentOddEven", "1");
      }
      if (paramPageSetup.isHFDiffFirst()) {
        paramzcjz.a("differentFirst", "1");
      }
      if (!paramPageSetup.isHFScaleWithDoc()) {
        paramzcjz.a("scaleWithDoc", "0");
      }
      if (!paramPageSetup.isHFAlignMargins()) {
        paramzcjz.a("alignWithMargins", "0");
      }
      if (str5.length() > 0) {
        a(paramzcjz, paramString, "oddHeader", str5);
      }
      if (str6.length() > 0) {
        a(paramzcjz, paramString, "oddFooter", str6);
      }
      if (str3.length() > 0) {
        a(paramzcjz, paramString, "evenHeader", str3);
      }
      if (str4.length() > 0) {
        a(paramzcjz, paramString, "evenFooter", str4);
      }
      if (str1.length() > 0) {
        a(paramzcjz, paramString, "firstHeader", str1);
      }
      if (str2.length() > 0) {
        a(paramzcjz, paramString, "firstFooter", str2);
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    paramzcjz.c(paramString1, paramString2, null);
    if ((paramString3.startsWith(" ")) || (paramString3.endsWith(" "))) {
      paramzcjz.a("xml:space", null, "preserve");
    }
    paramzcjz.a(paramString3);
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("sheetViews");
    paramzcjz.b("sheetView");
    if (!this.c.isGridlinesVisible()) {
      paramzcjz.a("showGridLines", "0");
    }
    if (!this.c.isRowColumnHeadersVisible()) {
      paramzcjz.a("showRowColHeaders", "0");
    }
    if ((this.c.isSelected()) || (this.c.getIndex() == this.b.getWorksheets().getActiveSheetIndex())) {
      paramzcjz.a("tabSelected", "1");
    }
    paramzcjz.a("workbookViewId", "0");
    if (this.c.isPageBreakPreview()) {
      paramzcjz.a("view", "pageBreakPreview");
    }
    if (this.c.getZoom() != 100) {
      paramzcjz.a("zoomScale", zauj.z(this.c.getZoom()));
    }
    if (this.c.getCharts().get(0).getSizeWithWindow()) {
      paramzcjz.a("zoomToFit", "1");
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    String str1 = null;
    if (this.c.k != null) {
      str1 = this.c.k.a;
    }
    String str2 = this.c.p;
    if ((str1 != null) || (!this.e.isPercentScale()) || (str2 != null) || (!this.c.o.b()))
    {
      paramzcjz.b("sheetPr");
      if (str2 != null) {
        paramzcjz.a("codeName", str2);
      }
      if (str1 != null) {
        paramzcjz.a("published", str1);
      }
      if (!this.e.isPercentScale())
      {
        paramzcjz.b("pageSetUpPr");
        paramzcjz.a("fitToPage", "1");
        paramzcjz.b();
      }
      if (!this.c.o.b()) {
        zvq.a(paramzcjz, this.c.o, "tabColor");
      }
      paramzcjz.b();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */