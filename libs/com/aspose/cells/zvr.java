package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zvr
  extends ztp
{
  private zpu b;
  private ListObject c;
  private boolean d = false;
  
  zvr(zpu paramzpu, ListObject paramListObject, SaveOptions paramSaveOptions)
  {
    this.c = paramListObject;
    this.b = paramzpu;
    if ((paramListObject.getDataSourceType() == 3) && (paramSaveOptions.e == 16)) {
      this.d = true;
    }
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("table");
    paramzcjz.a("xmlns", zaty.a);
    d(paramzcjz);
    if ((this.c.m()) && (this.c.getShowHeaderRow())) {
      zvy.a(paramzcjz, this.c.n(), false);
    }
    if ((this.c.n() != null) && (this.c.getAutoFilter().c() != null)) {
      zvy.a(paramzcjz, this.c.getAutoFilter().c());
    }
    c(paramzcjz);
    b(paramzcjz);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("tableStyleInfo");
    if ((this.c.getTableStyleName() != null) && (!"None".equals(this.c.getTableStyleName()))) {
      paramzcjz.a("name", this.c.getTableStyleName());
    }
    String str = this.c.getShowTableStyleFirstColumn() ? "1" : "0";
    paramzcjz.a("showFirstColumn", str);
    str = this.c.getShowTableStyleLastColumn() ? "1" : "0";
    paramzcjz.a("showLastColumn", str);
    str = this.c.getShowTableStyleRowStripes() ? "1" : "0";
    paramzcjz.a("showRowStripes", str);
    str = this.c.getShowTableStyleColumnStripes() ? "1" : "0";
    paramzcjz.a("showColumnStripes", str);
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("tableColumns");
    int i = this.c.getListColumns().getCount();
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      ListColumn localListColumn = this.c.getListColumns().get(j);
      a(paramzcjz, localListColumn);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, ListColumn paramListColumn)
    throws Exception
  {
    paramzcjz.b("tableColumn");
    int i = paramListColumn.n == -1 ? paramListColumn.d() + 1 : paramListColumn.n;
    paramzcjz.a("id", zauj.z(i));
    if (paramListColumn.k() != null) {
      paramzcjz.a("uniqueName", paramListColumn.k());
    }
    paramzcjz.a("name", paramListColumn.getName());
    if (paramListColumn.j > -1) {
      paramzcjz.a("dataDxfId", zauj.z(paramListColumn.j));
    }
    if ((paramListColumn.p() != -1) && (!this.d)) {
      paramzcjz.a("queryTableFieldId", zauj.z(paramListColumn.p()));
    }
    if (paramListColumn.getTotalsCalculation() != 0) {
      paramzcjz.a("totalsRowFunction", zauj.au(paramListColumn.getTotalsCalculation()));
    }
    if (paramListColumn.l() != null) {
      paramzcjz.a("totalsRowLabel", paramListColumn.l());
    }
    if (paramListColumn.k > -1) {
      paramzcjz.a("headerRowDxfId", zauj.z(paramListColumn.k));
    }
    if (paramListColumn.l > -1) {
      paramzcjz.a("totalsRowDxfId", zauj.z(paramListColumn.l));
    }
    if (paramListColumn.c != null)
    {
      paramzcjz.b("calculatedColumnFormula");
      if (paramListColumn.h()) {
        paramzcjz.a("array", "1");
      }
      str = paramListColumn.i();
      if (str.startsWith("=")) {
        str = str.substring(1);
      }
      paramzcjz.a(str);
      paramzcjz.b();
    }
    String str = paramListColumn.g();
    if ((str != null) && (!"".equals(str)))
    {
      if (str.startsWith("=")) {
        str = str.substring(1);
      }
      paramzcjz.b("totalsRowFormula");
      if (paramListColumn.b) {
        paramzcjz.a("array", "1");
      }
      paramzcjz.a(str);
      paramzcjz.b();
    }
    if (paramListColumn.a() != null)
    {
      paramzcjz.b("xmlColumnPr");
      paramzcjz.a("mapId", zauj.z(paramListColumn.a().a()));
      paramzcjz.a("xpath", paramListColumn.a().b());
      paramzcjz.a("xmlDataType", ztr.a(paramListColumn.a().c()));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private String d()
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = this.c.getStartRow();
    localCellArea.StartColumn = this.c.getStartColumn();
    localCellArea.EndRow = this.c.getEndRow();
    if (this.c.getEndRow() - this.c.getStartRow() == 0) {
      localCellArea.EndRow += 1;
    }
    localCellArea.EndColumn = this.c.getEndColumn();
    return zauj.a(localCellArea);
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.a("id", zauj.z(this.c.a()));
    String str = this.c.b();
    if (str != null) {
      paramzcjz.a("name", str);
    }
    str = this.c.o();
    paramzcjz.a("displayName", str);
    paramzcjz.a("ref", d());
    if ((this.c.getDataSourceType() != 0) && (!this.d)) {
      paramzcjz.a("tableType", zauj.av(this.c.getDataSourceType()));
    }
    str = this.c.getComment();
    if (!zw.b(str)) {
      paramzcjz.a("comment", str);
    }
    if (this.c.e()) {
      paramzcjz.a("insertRow", "1");
    }
    int i = this.c.x() == -1 ? 1 : this.c.x();
    if (i != 1) {
      paramzcjz.a("headerRowCount", zauj.z(i));
    }
    if (!this.c.f())
    {
      paramzcjz.a("totalsRowShown", "0");
    }
    else
    {
      int j = this.c.z() > 1 ? this.c.z() : 1;
      paramzcjz.a("totalsRowCount", zauj.z(j));
    }
    if (this.c.j()) {
      paramzcjz.a("published", "1");
    }
    if (this.c.e != -1)
    {
      str = zauj.z(this.c.e);
      paramzcjz.a("headerRowDxfId", str);
    }
    if (this.c.f != -1)
    {
      str = zauj.z(this.c.f);
      paramzcjz.a("dataDxfId", str);
    }
    if (this.c.g != -1)
    {
      str = zauj.z(this.c.g);
      paramzcjz.a("totalsRowDxfId", str);
    }
    if (this.c.h != -1)
    {
      str = zauj.z(this.c.h);
      paramzcjz.a("tableBorderDxfId", str);
    }
    if (this.c.i != -1)
    {
      str = zauj.z(this.c.i);
      paramzcjz.a("headerRowBorderDxfId", str);
    }
    if (this.c.j != -1)
    {
      str = zauj.z(this.c.j);
      paramzcjz.a("totalsRowBorderDxfId", str);
    }
    if ((this.c.k() != -1) && (!this.d)) {
      paramzcjz.a("connectionId", zauj.z(this.c.k()));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */