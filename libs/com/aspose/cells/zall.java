package com.aspose.cells;

class zall
{
  private zqh a = null;
  private zqi b;
  private Worksheet c = null;
  private ListObject d = null;
  
  public ListObject a()
  {
    return this.d;
  }
  
  zall(zqi paramzqi)
  {
    this.a = paramzqi.m;
    this.b = paramzqi;
    this.c = this.b.d;
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n()) {
      return;
    }
    String str1 = paramzcjy.a("ref");
    if (str1 != null)
    {
      localObject = (CellArea)CellArea.a(str1, true);
      this.d = new ListObject(this.c.getListObjects());
      this.d.a(((CellArea)localObject).StartRow);
      this.d.b(((CellArea)localObject).StartColumn);
      this.d.c(((CellArea)localObject).EndRow);
      this.d.d(((CellArea)localObject).EndColumn);
      this.c.getListObjects().a(this.d);
    }
    else
    {
      paramzcjy.l();
      return;
    }
    Object localObject = null;
    String str2 = null;
    while (paramzcjy.m())
    {
      if ("id".equals(paramzcjy.q())) {
        this.d.k(zauj.F(paramzcjy.t()));
      } else if ("name".equals(paramzcjy.q())) {
        this.d.d(paramzcjy.t());
      }
      if ("displayName".equals(paramzcjy.q())) {
        this.d.c(paramzcjy.t());
      } else if ("comment".equals(paramzcjy.q())) {
        this.d.setComment(paramzcjy.t());
      } else if ("insertRow".equals(paramzcjy.q())) {
        this.d.a(zauj.aB(paramzcjy.t()));
      } else if ("headerRowCount".equals(paramzcjy.q())) {
        this.d.l(zauj.F(paramzcjy.t()));
      } else if ("totalsRowCount".equals(paramzcjy.q())) {
        localObject = paramzcjy.t();
      } else if ("totalsRowShown".equals(paramzcjy.q())) {
        str2 = paramzcjy.t();
      } else if ("published".equals(paramzcjy.q())) {
        this.d.d(zauj.aB(paramzcjy.t()));
      } else if ("headerRowDxfId".equals(paramzcjy.q())) {
        this.d.e = zauj.F(paramzcjy.t());
      } else if ("dataDxfId".equals(paramzcjy.q())) {
        this.d.f = zauj.F(paramzcjy.t());
      } else if ("totalsRowDxfId".equals(paramzcjy.q())) {
        this.d.g = zauj.F(paramzcjy.t());
      } else if ("tableBorderDxfId".equals(paramzcjy.q())) {
        this.d.h = zauj.F(paramzcjy.t());
      } else if ("headerRowBorderDxfId".equals(paramzcjy.q())) {
        this.d.i = zauj.F(paramzcjy.t());
      } else if ("totalsRowBorderDxfId".equals(paramzcjy.q())) {
        this.d.j = zauj.F(paramzcjy.t());
      } else if ("connectionId".equals(paramzcjy.q())) {
        this.d.j(zauj.F(paramzcjy.t()));
      } else if ("tableType".equals(paramzcjy.q())) {
        this.d.a = zauj.aF(paramzcjy.t());
      }
    }
    paramzcjy.l();
    if (localObject != null)
    {
      this.d.m(zauj.F((String)localObject));
      if (this.d.z() == 0) {
        this.d.b(false);
      } else {
        this.d.b(true);
      }
    }
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    e(paramzcjy);
    b(paramzcjy);
    if ((this.d == null) || (paramzcjy.o()))
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
      } else if ("autoFilter".equals(paramzcjy.q())) {
        zalu.a(paramzcjy, this.d.getAutoFilter());
      } else if ("tableColumns".equals(paramzcjy.q())) {
        d(paramzcjy);
      } else if ("tableStyleInfo".equals(paramzcjy.q())) {
        c(paramzcjy);
      } else if ("sortState".equals(paramzcjy.q())) {
        zalu.a(paramzcjy, this.d.getAutoFilter().getSorter());
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    this.d.setTableStyleName("None");
    while (paramzcjy.m()) {
      if ("name".equals(paramzcjy.q())) {
        this.d.setTableStyleName(paramzcjy.t());
      } else if ("showFirstColumn".equals(paramzcjy.q())) {
        this.d.setShowTableStyleFirstColumn(zauj.aB(paramzcjy.t()));
      } else if ("showLastColumn".equals(paramzcjy.q())) {
        this.d.setShowTableStyleLastColumn(zauj.aB(paramzcjy.t()));
      } else if ("showRowStripes".equals(paramzcjy.q())) {
        this.d.setShowTableStyleRowStripes(zauj.aB(paramzcjy.t()));
      } else if ("showColumnStripes".equals(paramzcjy.q())) {
        this.d.setShowTableStyleColumnStripes(zauj.aB(paramzcjy.t()));
      }
    }
    paramzcjy.l();
    paramzcjy.a();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int i = 0;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() == 1) && ("tableColumn".equals(paramzcjy.q()))) {
        a(paramzcjy, i++);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, ListColumn paramListColumn)
    throws Exception
  {
    if (!paramzcjy.n()) {
      return;
    }
    while (paramzcjy.m()) {
      if ("dataDxfId".equals(paramzcjy.q())) {
        paramListColumn.j = zauj.F(paramzcjy.t());
      } else if ("uniqueName".equals(paramzcjy.q())) {
        paramListColumn.d(paramzcjy.t());
      } else if ("queryTableFieldId".equals(paramzcjy.q())) {
        paramListColumn.b(zauj.F(paramzcjy.t()));
      } else if ("totalsRowFunction".equals(paramzcjy.q())) {
        paramListColumn.a(zauj.aE(paramzcjy.t()));
      } else if ("totalsRowLabel".equals(paramzcjy.q())) {
        paramListColumn.e(paramzcjy.t());
      } else if ("headerRowDxfId".equals(paramzcjy.q())) {
        paramListColumn.k = zauj.F(paramzcjy.t());
      } else if ("totalsRowDxfId".equals(paramzcjy.q())) {
        paramListColumn.l = zauj.F(paramzcjy.t());
      } else if ("id".equals(paramzcjy.q())) {
        paramListColumn.n = zauj.F(paramzcjy.t());
      }
    }
    paramzcjy.l();
  }
  
  private void a(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    String str1 = paramzcjy.a("name");
    if (str1 == null) {
      return;
    }
    ListColumn localListColumn = new ListColumn(this.d.getListColumns(), zauj.b(str1), paramInt);
    this.d.getListColumns().a(localListColumn);
    a(paramzcjy, localListColumn);
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
        String str2;
        String str3;
        boolean bool;
        if ("calculatedColumnFormula".equals(paramzcjy.q()))
        {
          str2 = paramzcjy.a("array");
          str3 = paramzcjy.j();
          bool = false;
          if (str2 != null) {
            bool = zauj.aB(str2);
          }
          localListColumn.b(str3, bool);
        }
        else if ("xmlColumnPr".equals(paramzcjy.q()))
        {
          localListColumn.a(new XmlColumnProperty());
          localListColumn.a().a(zauj.F(paramzcjy.a("mapId")));
          localListColumn.a().a(paramzcjy.a("xpath"));
          localListColumn.a().b(ztr.a(paramzcjy.a("xmlDataType")));
          paramzcjy.a();
        }
        else if ("totalsRowFormula".equals(paramzcjy.q()))
        {
          str2 = paramzcjy.a("array");
          str3 = paramzcjy.j();
          bool = false;
          if (str2 != null) {
            bool = zauj.aB(str2);
          }
          localListColumn.a(str3, bool);
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"table".equals(paramzcjy.q()))) {
      throw new IllegalStateException("Table root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */