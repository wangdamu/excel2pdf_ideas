package com.aspose.cells;

import com.aspose.cells.a.d.zf;
import java.util.HashMap;

class zagr
{
  private PageSetup b;
  private Workbook c;
  private Worksheet d;
  private HashMap e;
  private boolean f;
  zavs a;
  private zaer g;
  private zaeo h;
  private double i;
  private double j;
  private zf k;
  private zbox l;
  
  zagr(Workbook paramWorkbook, zavs paramzavs, double paramDouble1, double paramDouble2, zf paramzf, zbox paramzbox)
  {
    this.k = paramzf;
    this.l = paramzbox;
    this.c = paramWorkbook;
    this.e = new HashMap();
    this.a = paramzavs;
    this.i = paramDouble1;
    this.j = paramDouble2;
  }
  
  void a(Worksheet paramWorksheet, int paramInt1, int paramInt2, zaus paramzaus)
    throws Exception
  {
    this.d = paramWorksheet;
    this.b = this.d.getPageSetup();
    if (paramWorksheet.getType() == 2) {
      this.b = this.d.getCharts().get(0).getPageSetup();
    }
    this.f = true;
    a(paramInt1, paramInt2, paramzaus);
    this.f = false;
    a(paramInt1, paramInt2, paramzaus);
  }
  
  private void a(int paramInt1, int paramInt2, zaus paramzaus)
    throws Exception
  {
    String str1 = "";
    String str2 = "";
    String str3 = "";
    if ((this.b.isHFDiffFirst()) && (paramInt1 == 1))
    {
      if (this.f)
      {
        str1 = this.b.k(0);
        str2 = this.b.k(1);
        str3 = this.b.k(2);
      }
      else
      {
        str1 = this.b.j(0);
        str2 = this.b.j(1);
        str3 = this.b.j(2);
      }
    }
    else if ((this.b.isHFDiffOddEven()) && (paramInt1 % 2 == 0))
    {
      if (this.f)
      {
        str1 = this.b.h(0);
        str2 = this.b.h(1);
        str3 = this.b.h(2);
      }
      else
      {
        str1 = this.b.i(0);
        str2 = this.b.i(1);
        str3 = this.b.i(2);
      }
    }
    else if (this.f)
    {
      str1 = this.b.f(0);
      str2 = this.b.f(1);
      str3 = this.b.f(2);
    }
    else
    {
      str1 = this.b.g(0);
      str2 = this.b.g(1);
      str3 = this.b.g(2);
    }
    if ((str1 != null) && (str1.length() >= 1)) {
      a(str1, 7, paramInt1, paramInt2, paramzaus);
    }
    if ((str2 != null) && (str2.length() >= 1)) {
      a(str2, 1, paramInt1, paramInt2, paramzaus);
    }
    if ((str3 != null) && (str3.length() >= 1)) {
      a(str3, 8, paramInt1, paramInt2, paramzaus);
    }
  }
  
  private void a(String paramString, int paramInt1, int paramInt2, int paramInt3, zaus paramzaus)
    throws Exception
  {
    String str = paramString;
    int m;
    if (this.f) {
      m = 9;
    } else {
      m = 0;
    }
    this.g = new zaer(this.a, paramzaus, this.l, this.b, paramInt1, m, this.c, this.i, this.j, this.k);
    if (str != null)
    {
      this.h = new zaeo(this.g, this.c.getWorksheets().get(paramzaus.a), this.e, paramInt2, paramInt3, this.i, this.j);
      String[] arrayOfString = { str };
      int n = this.h.a(arrayOfString) == -1 ? 1 : 0;
      str = arrayOfString[0];
      if (n != 0) {
        throw new CellsException(19, "Such header or footer is not supported yet!");
      }
    }
    this.g.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */