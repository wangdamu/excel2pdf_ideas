package com.aspose.cells;

import com.aspose.cells.b.a.zs;

public class ListColumn
{
  private ListColumnCollection p;
  private String q;
  private XmlColumnProperty r;
  private String s;
  private int t;
  String a;
  boolean b;
  String c;
  boolean d;
  byte[] e;
  byte[] f;
  int g;
  String h;
  String i;
  private String u;
  private String v;
  int j = -1;
  int k = -1;
  int l = -1;
  int m = 0;
  int n = -1;
  long o;
  private int w = -1;
  
  XmlColumnProperty a()
  {
    return this.r;
  }
  
  void a(XmlColumnProperty paramXmlColumnProperty)
  {
    this.r = paramXmlColumnProperty;
  }
  
  FilterColumn b()
  {
    AutoFilter localAutoFilter = this.p.c().n();
    if (localAutoFilter == null) {
      return null;
    }
    return localAutoFilter.c.a(d());
  }
  
  boolean c()
  {
    return this.p.c().A();
  }
  
  ListColumn(ListColumnCollection listColumns, String name, int index)
  {
    this.q = name;
    this.p = listColumns;
    this.n = (index + 1);
  }
  
  ListColumn(ListColumnCollection listColumns)
  {
    this.p = listColumns;
  }
  
  void a(ListColumn paramListColumn, CopyOptions paramCopyOptions)
  {
    WorksheetCollection localWorksheetCollection1 = paramListColumn.p.c().c().d().c();
    WorksheetCollection localWorksheetCollection2 = this.p.c().c().d().c();
    int i1 = (localWorksheetCollection1 == localWorksheetCollection2) || (paramCopyOptions == null) || (paramCopyOptions.a()) ? 1 : 0;
    this.q = paramListColumn.q;
    this.i = paramListColumn.i;
    this.h = paramListColumn.h;
    this.t = paramListColumn.t;
    if (i1 != 0)
    {
      this.c = paramListColumn.c;
      this.e = paramListColumn.e;
      this.d = paramListColumn.d;
      this.b = paramListColumn.b;
      this.a = paramListColumn.a;
    }
    this.v = paramListColumn.v;
    this.u = paramListColumn.u;
    this.n = paramListColumn.n;
    this.k = paramListColumn.k;
    this.j = paramListColumn.j;
    this.l = paramListColumn.l;
    if (q() != paramListColumn.q())
    {
      if (paramListColumn.k > -1) {
        c(paramListColumn.n());
      }
      if (paramListColumn.j > -1) {
        b(paramListColumn.m());
      }
      if (paramListColumn.l > -1) {
        d(paramListColumn.o());
      }
    }
    b(paramListColumn.p());
  }
  
  private WorksheetCollection q()
  {
    return this.p.c().c().d().c();
  }
  
  public String getName()
  {
    return this.q;
  }
  
  public void setName(String value)
  {
    this.q = value;
    ListObject localListObject = this.p.c();
    if (localListObject.getShowHeaderRow())
    {
      Cells localCells = localListObject.c().d().getCells();
      localCells.a(localListObject.getStartRow(), e(), false).putValue(value);
    }
  }
  
  void a(String paramString)
  {
    this.q = paramString;
  }
  
  void b(String paramString)
  {
    this.s = paramString;
  }
  
  int d()
  {
    for (int i1 = 0; i1 < this.p.getCount(); i1++) {
      if (this.p.get(i1) == this) {
        return i1;
      }
    }
    return 0;
  }
  
  int e()
  {
    return this.p.c().getStartColumn() + d();
  }
  
  public int getTotalsCalculation()
  {
    return this.t;
  }
  
  public void setTotalsCalculation(int value)
  {
    if (this.t == value) {
      return;
    }
    ListObject localListObject = this.p.c();
    this.t = value;
    if (!localListObject.getShowTotals()) {
      return;
    }
    Cells localCells = localListObject.c().d().getCells();
    Cell localCell = localCells.a(localListObject.getEndRow(), e(), false);
    if (value == 0) {
      localCell.putValue((String)null);
    } else {
      localCell.setFormula(c(value));
    }
  }
  
  void a(int paramInt)
  {
    this.t = paramInt;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      return;
    }
    int i1 = this.p.c().getStartRow() + this.p.c().x();
    if (paramInt1 < i1) {
      return;
    }
    if ((this.c != null) && (!"".equals(this.c)))
    {
      CopyOptions localCopyOptions = new CopyOptions(0, q().p(), q().p());
      Cells localCells = this.p.c().c().d().getCells();
      int i2 = e();
      Cell localCell = null;
      int i3 = 8;
      if (i1 != paramInt1) {
        localCell = localCells.get(i1, i2);
      }
      if (localCell != null) {
        for (int i4 = 0; i4 < paramInt2; i4++) {
          localCells.get(paramInt1 + i4, i2).b(localCell, i3, localCopyOptions);
        }
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    ListObject localListObject = this.p.c();
    Worksheet localWorksheet = localListObject.c().d();
    if (this.e != null) {
      zaaq.b(localWorksheet, false, paramInt1, paramInt2, 0, 0, -1, -1, this.e);
    }
  }
  
  private String c(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder("=subtotal(");
    int i1 = d(paramInt);
    localStringBuilder.append(i1);
    localStringBuilder.append(",[");
    localStringBuilder.append("");
    localStringBuilder.append(getName());
    localStringBuilder.append("");
    localStringBuilder.append("])");
    return zs.a(localStringBuilder);
  }
  
  private int d(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 101;
    case 2: 
      return 103;
    case 3: 
      return 102;
    case 4: 
      return 104;
    case 5: 
      return 105;
    case 7: 
      return 107;
    case 6: 
      return 109;
    case 8: 
      return 110;
    }
    return 109;
  }
  
  public Range getRange()
  {
    ListObject localListObject = this.p.c();
    int i1 = localListObject.getStartColumn() + d();
    int i2 = localListObject.getStartRow();
    int i3 = localListObject.getEndRow();
    return new Range(i2, i1, i3 - i2 + 1, 1, this.p.c().c().d().getCells());
  }
  
  void a(String paramString, boolean paramBoolean)
  {
    this.b = paramBoolean;
    this.a = paramString;
  }
  
  boolean f()
  {
    return this.b;
  }
  
  String g()
  {
    if (this.f != null)
    {
      ListObject localListObject = this.p.c();
      Worksheet localWorksheet = localListObject.c().d();
      return localWorksheet.c().d().a(-1, this.f, 0, 0, false);
    }
    return this.a;
  }
  
  void b(String paramString, boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.c = paramString;
  }
  
  boolean h()
  {
    return this.d;
  }
  
  public String getFormula()
  {
    return i();
  }
  
  public void setFormula(String value)
  {
    c(value);
    ListObject localListObject = this.p.c();
    int i1 = localListObject.getStartColumn() + d();
    int i2 = localListObject.getStartRow();
    if (localListObject.getShowHeaderRow()) {
      i2++;
    }
    int i3 = localListObject.getEndRow();
    if (localListObject.f()) {
      i3--;
    }
    Worksheet localWorksheet = localListObject.c().d();
    Cells localCells = localWorksheet.getCells();
    Cell localCell1 = localCells.get(i2, i1);
    localCell1.setFormula(value);
    i2++;
    while (i2 <= i3)
    {
      Cell localCell2 = localCells.get(i2, i1);
      int i4 = localCell2.s();
      localCell2.copy(localCell1);
      localCell2.b(i4);
      i2++;
    }
  }
  
  String i()
  {
    if (this.e != null)
    {
      ListObject localListObject = this.p.c();
      Worksheet localWorksheet = localListObject.c().d();
      return localWorksheet.c().d().a(-1, this.e, 0, 0, false);
    }
    return this.c;
  }
  
  void c(String paramString)
  {
    ListObject localListObject = this.p.c();
    Worksheet localWorksheet = localListObject.c().d();
    this.c = paramString;
    if (this.c != null) {
      this.e = localWorksheet.c().y().a(localWorksheet.getIndex(), this.c, localListObject.getStartRow() + 1, localListObject.getStartColumn(), this.d ? 1 : 0, 64, false, true, false);
    }
  }
  
  void j()
  {
    ListObject localListObject = this.p.c();
    Worksheet localWorksheet = localListObject.c().d();
    if (this.c != null) {
      this.e = localWorksheet.c().y().a(localWorksheet.getIndex(), this.c, localListObject.getStartRow() + 1, localListObject.getStartColumn(), this.d ? 1 : 0, 64, false, true, false);
    }
    if (this.a != null) {
      this.f = localWorksheet.c().y().a(localWorksheet.getIndex(), this.a, localListObject.getEndRow(), localListObject.getStartColumn(), this.b ? 1 : 0, 64, false, true, false);
    }
  }
  
  String k()
  {
    return this.u;
  }
  
  void d(String paramString)
  {
    this.u = paramString;
  }
  
  String l()
  {
    return this.v;
  }
  
  void e(String paramString)
  {
    this.v = paramString;
  }
  
  zbzi a(Style paramStyle)
  {
    if (paramStyle != null)
    {
      zbzi localzbzi = new zbzi();
      localzbzi.a(paramStyle);
      if (localzbzi.getCount() < 1) {
        localzbzi = null;
      }
      return localzbzi;
    }
    return null;
  }
  
  Style m()
  {
    if (this.j > -1) {
      return q().getDxfs().get(this.j);
    }
    return null;
  }
  
  void b(Style paramStyle)
  {
    this.j = q().getDxfs().a(paramStyle);
  }
  
  Style n()
  {
    if (this.k != -1) {
      return q().getDxfs().get(this.k);
    }
    return null;
  }
  
  void c(Style paramStyle)
  {
    this.k = q().getDxfs().a(paramStyle);
  }
  
  Style o()
  {
    if (this.l != -1) {
      return q().getDxfs().get(this.l);
    }
    return null;
  }
  
  void d(Style paramStyle)
  {
    this.l = q().getDxfs().a(paramStyle);
  }
  
  int p()
  {
    return this.w;
  }
  
  void b(int paramInt)
  {
    this.w = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ListColumn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */