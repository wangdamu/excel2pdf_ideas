package com.aspose.cells;

import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.c.a.za;

class zakd
{
  private zqh a = null;
  private Worksheet b = null;
  private zqi c;
  private PageSetup d;
  private static final za e = new za(new String[] { "colorId", "guid", "filter", "filterUnique", "fitToPage", "hiddenColumns", "hiddenRows", "outlineSymbols", "printArea", "scale", "showAutoFilter", "showFormulas", "showGridLines", "showPageBreaks", "showRuler", "showRowCol", "showZeros", "view", "topLeftCell", "state", "pageLayout", "pageBreakPreview", "hidden", "veryHidden", "headerFooter", "pageMargins", "pageSetup", "extLst", "left", "l", "right", "r", "top", "t", "bottom", "b", "header", "footer" });
  
  zakd(zqh paramzqh, zqi paramzqi)
  {
    this.a = paramzqh;
    this.c = paramzqi;
    this.b = paramzqi.d;
    this.b.getCharts().a(new Chart(this.b));
    this.b.setType(2);
    this.d = this.b.getCharts().get(0).getPageSetup();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    l(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("sheetViews".equals(paramzcjy.q())) {
        j(paramzcjy);
      } else if ("sheetPr".equals(paramzcjy.q())) {
        h(paramzcjy);
      } else if ("pageMargins".equals(paramzcjy.q())) {
        b(paramzcjy, this.d);
      } else if ("pageSetup".equals(paramzcjy.q())) {
        a(paramzcjy, this.d, this.c);
      } else if ("headerFooter".equals(paramzcjy.q())) {
        a(paramzcjy, this.d);
      } else if ("legacyDrawing".equals(paramzcjy.q())) {
        i(paramzcjy);
      } else if ("drawing".equals(paramzcjy.q())) {
        g(paramzcjy);
      } else if ("sheetProtection".equals(paramzcjy.q())) {
        f(paramzcjy);
      } else if ("picture".equals(paramzcjy.q())) {
        e(paramzcjy);
      } else if ("customSheetViews".equals(paramzcjy.q())) {
        c(paramzcjy);
      } else if ("legacyDrawingHF".equals(paramzcjy.q())) {
        b(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    this.c.g = paramzcjy.a("id", null);
    paramzcjy.a();
    if (this.c.g == null) {
      throw new CellsException(6, "Invalid LegacyDrawingHFRid element");
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("customSheetView".equals(paramzcjy.q())) {
        d(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    zoh localzoh = new zoh(this.b);
    this.b.K().a(localzoh);
    if (paramzcjy.n()) {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 0: 
          localzoh.f(zauj.F(paramzcjy.t()));
          break;
        case 1: 
          localzoh.n = new zh(paramzcjy.t().substring(1, 1 + (paramzcjy.t().length() - 2)));
          break;
        case 2: 
          localzoh.f(zauj.aB(paramzcjy.t()));
          break;
        case 3: 
          localzoh.g(zauj.aB(paramzcjy.t()));
          break;
        case 4: 
          localzoh.e().setPercentScale(!zauj.aB(paramzcjy.t()));
          break;
        case 5: 
          localzoh.b(zauj.aB(paramzcjy.t()));
          break;
        case 6: 
          localzoh.a(zauj.aB(paramzcjy.t()));
          break;
        case 7: 
          localzoh.r(zauj.aB(paramzcjy.t()));
          break;
        case 8: 
          localzoh.h(zauj.aB(paramzcjy.t()));
          break;
        case 9: 
          localzoh.c(zauj.F(paramzcjy.t()));
          break;
        case 10: 
          localzoh.e(zauj.aB(paramzcjy.t()));
          break;
        case 11: 
          localzoh.l(zauj.aB(paramzcjy.t()));
          break;
        case 12: 
          localzoh.m(zauj.aB(paramzcjy.t()));
          break;
        case 13: 
          localzoh.d(zauj.aB(paramzcjy.t()));
          break;
        case 14: 
          localzoh.s(zauj.aB(paramzcjy.t()));
          break;
        case 15: 
          localzoh.n(zauj.aB(paramzcjy.t()));
          break;
        case 16: 
          localzoh.q(zauj.aB(paramzcjy.t()));
          break;
        case 17: 
          switch (e.a(paramzcjy.t()))
          {
          case 20: 
            localzoh.d(2);
            break;
          case 21: 
            localzoh.d(1);
          }
          break;
        case 18: 
          int i = 0;
          int j = 0;
          int[] arrayOfInt1 = { i };
          int[] arrayOfInt2 = { j };
          CellsHelper.a(paramzcjy.t(), arrayOfInt1, arrayOfInt2);
          i = arrayOfInt1[0];
          j = arrayOfInt2[0];
          localzoh.a(i);
          localzoh.b(j);
          break;
        case 19: 
          switch (e.a(paramzcjy.t()))
          {
          case 22: 
            localzoh.e(1);
            break;
          case 23: 
            localzoh.e(2);
          }
          break;
        }
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (e.a(paramzcjy.q()))
      {
      case 24: 
        a(paramzcjy, localzoh.e());
        break;
      case 25: 
        b(paramzcjy, this.b.getPageSetup());
        break;
      case 26: 
        a(paramzcjy, localzoh.e(), this.c);
        break;
      case 27: 
        localzoh.c = paramzcjy.v();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    this.c.i = paramzcjy.a("id", null);
    paramzcjy.a();
    if (this.c.i == null) {
      throw new CellsException(6, "Invalid Picture r:id element");
    }
  }
  
  private void a()
  {
    Protection localProtection = this.b.getProtection();
    localProtection.setAllowEditingContent(true);
    localProtection.setAllowEditingObject(true);
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      a();
      Protection localProtection = this.b.getProtection();
      while (paramzcjy.m()) {
        if ("password".equals(paramzcjy.q())) {
          localProtection.a(zp.a(paramzcjy.t(), 515));
        } else if ("sheet".equals(paramzcjy.q()))
        {
          if ("0".equals(paramzcjy.t())) {
            localProtection.setAllowEditingContent(true);
          } else {
            localProtection.setAllowEditingContent(false);
          }
        }
        else if ("objects".equals(paramzcjy.q())) {
          if ("0".equals(paramzcjy.t())) {
            localProtection.setAllowEditingObject(true);
          } else {
            localProtection.setAllowEditingObject(false);
          }
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    this.c.h = paramzcjy.a("id", null);
    paramzcjy.a();
    if (this.c.h == null) {
      throw new CellsException(6, "Invalid legacyDrawing element");
    }
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    this.b.k.a = paramzcjy.a("published");
    String str1 = paramzcjy.a("codeName");
    if (str1 != null) {
      this.b.p = str1;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ("sheetPr".equals(paramzcjy.q()))
      {
        paramzcjy.d();
        while (paramzcjy.s() != 4)
        {
          paramzcjy.k();
          if ("pageSetUpPr".equals(paramzcjy.q()))
          {
            String str2 = paramzcjy.a("fitToPage");
            if ((str2 != null) && ("1".equals(str2))) {
              this.d.setPercentScale(true);
            }
            paramzcjy.a();
          }
          else
          {
            paramzcjy.a();
          }
        }
        paramzcjy.h();
      }
      else if ("tabColor".equals(paramzcjy.q()))
      {
        this.b.o = zalk.g(paramzcjy);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    this.c.f = paramzcjy.a("id", null);
    paramzcjy.a();
  }
  
  static void a(zcjy paramzcjy, PageSetup paramPageSetup)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String[] arrayOfString;
        int i;
        if ("oddHeader".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i = 0; i < 3; i++) {
            if (arrayOfString[i] != null) {
              paramPageSetup.setHeader(i, arrayOfString[i]);
            }
          }
        }
        else if ("oddFooter".equals(paramzcjy.q()))
        {
          arrayOfString = a(paramzcjy.j());
          for (i = 0; i < 3; i++) {
            if (arrayOfString[i] != null) {
              paramPageSetup.setFooter(i, arrayOfString[i]);
            }
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private static String[] a(String paramString)
  {
    String[] arrayOfString = new String[3];
    int i = 1;
    int j = 0;
    for (int k = 0; k < paramString.length(); k++) {
      if ((paramString.charAt(k) == '&') && (k + 1 < paramString.length()))
      {
        int m;
        switch (paramString.charAt(k + 1))
        {
        case 'L': 
        case 'l': 
          m = 0;
          break;
        case 'C': 
        case 'c': 
          m = 1;
          break;
        case 'R': 
        case 'r': 
          m = 2;
          break;
        }
        if (k - j > 0) {
          arrayOfString[i] = paramString.substring(j, j + (k - j));
        }
        i = m;
        j = k + 2;
      }
    }
    if (j < paramString.length()) {
      arrayOfString[i] = paramString.substring(j);
    }
    return arrayOfString;
  }
  
  static void a(zcjy paramzcjy, PageSetup paramPageSetup, zqi paramzqi)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    a(paramPageSetup);
    while (paramzcjy.m()) {
      if (("blackAndWhite".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
      {
        paramPageSetup.setBlackAndWhite(true);
      }
      else if ("cellComments".equals(paramzcjy.q()))
      {
        paramPageSetup.setPrintComments(zauj.d(paramzcjy.t()));
      }
      else if (("draft".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
      {
        paramPageSetup.setPrintDraft(true);
      }
      else if ("errors".equals(paramzcjy.q()))
      {
        paramPageSetup.setPrintErrors(zauj.e(paramzcjy.t()));
      }
      else if ("firstPageNumber".equals(paramzcjy.q()))
      {
        paramPageSetup.setFirstPageNumber(zauj.F(paramzcjy.t()));
      }
      else if ("fitToHeight".equals(paramzcjy.q()))
      {
        paramPageSetup.setFitToPagesTall(zauj.F(paramzcjy.t()));
      }
      else if ("fitToWidth".equals(paramzcjy.q()))
      {
        paramPageSetup.setFitToPagesWide(zauj.F(paramzcjy.t()));
      }
      else if ("horizontalDpi".equals(paramzcjy.q()))
      {
        a(paramPageSetup, paramzcjy.t());
      }
      else if ("verticalDpi".equals(paramzcjy.q()))
      {
        a(paramPageSetup, paramzcjy.t());
      }
      else if ("orientation".equals(paramzcjy.q()))
      {
        paramPageSetup.setOrientation(zauj.c(paramzcjy.t()));
      }
      else if ("pageOrder".equals(paramzcjy.q()))
      {
        paramPageSetup.setOrder(zauj.f(paramzcjy.t()));
      }
      else if ("paperSize".equals(paramzcjy.q()))
      {
        paramPageSetup.setPaperSize(zauj.F(paramzcjy.t()));
      }
      else if ("scale".equals(paramzcjy.q()))
      {
        int i = zauj.F(paramzcjy.t());
        if ((i >= 10) && (i <= 400)) {
          paramPageSetup.setZoom(i);
        }
      }
      else if ("id".equals(paramzcjy.q()))
      {
        paramzqi.j = paramzcjy.t();
      }
    }
    paramzcjy.l();
    paramzcjy.a();
  }
  
  private static void a(PageSetup paramPageSetup, String paramString)
  {
    try
    {
      paramPageSetup.setPrintQuality(zauj.F(paramString));
    }
    catch (Exception localException) {}
  }
  
  private static void a(PageSetup paramPageSetup)
  {
    paramPageSetup.setPrintQuality(600);
  }
  
  static void b(zcjy paramzcjy, PageSetup paramPageSetup)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    while (paramzcjy.m()) {
      switch (e.a(paramzcjy.q()))
      {
      case 28: 
      case 29: 
        paramPageSetup.setLeftMarginInch(zauj.C(paramzcjy.t()));
        break;
      case 30: 
      case 31: 
        paramPageSetup.setRightMarginInch(zauj.C(paramzcjy.t()));
        break;
      case 32: 
      case 33: 
        paramPageSetup.setTopMarginInch(zauj.C(paramzcjy.t()));
        break;
      case 34: 
      case 35: 
        paramPageSetup.setBottomMarginInch(zauj.C(paramzcjy.t()));
        break;
      case 36: 
        paramPageSetup.setHeaderMarginInch(zauj.C(paramzcjy.t()));
        break;
      case 37: 
        paramPageSetup.setFooterMarginInch(zauj.C(paramzcjy.t()));
      }
    }
    paramzcjy.l();
    paramzcjy.a();
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("sheetView".equals(paramzcjy.q())) {
        k(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    int i = 0;
    int j = 0;
    this.b.getCharts().get(0).setSizeWithWindow(false);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("showGridLines".equals(paramzcjy.q()))
        {
          this.b.setGridlinesVisible(zauj.aB(paramzcjy.t()));
        }
        else if ("showRowColHeaders".equals(paramzcjy.q()))
        {
          this.b.setRowColumnHeadersVisible(zauj.aB(paramzcjy.t()));
        }
        else if ("tabSelected".equals(paramzcjy.q()))
        {
          this.b.setSelected(zauj.aB(paramzcjy.t()));
        }
        else if ("view".equals(paramzcjy.q()))
        {
          this.b.setPageBreakPreview("pageBreakPreview".equals(paramzcjy.t()));
        }
        else if ("zoomScale".equals(paramzcjy.q()))
        {
          this.b.setZoom(zauj.F(paramzcjy.t()));
        }
        else if ("topLeftCell".equals(paramzcjy.q()))
        {
          String str = paramzcjy.t();
          int k = 0;
          int m = 0;
          int[] arrayOfInt1 = { k };
          int[] arrayOfInt2 = { m };
          CellsHelper.a(str, arrayOfInt1, arrayOfInt2);
          k = arrayOfInt1[0];
          m = arrayOfInt2[0];
          this.b.setFirstVisibleRow(k);
          this.b.setFirstVisibleColumn(m);
          i = k;
          j = m;
        }
        else if ("zoomToFit".equals(paramzcjy.q()))
        {
          this.b.getCharts().get(0).setSizeWithWindow(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void l(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"chartsheet".equals(paramzcjy.q()))) {
      throw new CellsException(6, "chartsheet root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */