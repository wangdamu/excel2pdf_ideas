package com.aspose.cells;

class zvg
  extends ztp
{
  private QueryTable b = null;
  
  zvg(QueryTable paramQueryTable)
  {
    this.b = paramQueryTable;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.c("queryTable", null);
    paramzcjz.a("xmlns", zaty.a);
    paramzcjz.a("name", this.b.f);
    switch (this.b.k())
    {
    case 0: 
      paramzcjz.a("growShrinkType", "insertClear");
      break;
    case 2: 
      paramzcjz.a("growShrinkType", "overwriteClear");
      break;
    }
    if (this.b.e != -1) {
      paramzcjz.a("connectionId", zauj.z(this.b.e));
    }
    paramzcjz.a("autoFormatId", zauj.z(this.b.d));
    if (!this.b.p()) {
      paramzcjz.a("applyNumberFormats", "0");
    }
    if (!this.b.q()) {
      paramzcjz.a("applyFontFormats", "0");
    }
    if (!this.b.s()) {
      paramzcjz.a("applyBorderFormats", "0");
    }
    if (!this.b.t()) {
      paramzcjz.a("applyPatternFormats", "0");
    }
    if (!this.b.r()) {
      paramzcjz.a("applyAlignmentFormats", "0");
    }
    if (!this.b.u()) {
      paramzcjz.a("applyWidthHeightFormats", "0");
    }
    if (!this.b.e()) {
      paramzcjz.a("headers", "0");
    }
    if (this.b.f()) {
      paramzcjz.a("rowNumbers", "1");
    }
    if (this.b.g()) {
      paramzcjz.a("disableRefresh", "1");
    }
    if (this.b.n()) {
      paramzcjz.a("disableEdit", "1");
    }
    if (!this.b.h()) {
      paramzcjz.a("backgroundRefresh", "0");
    }
    if (this.b.i()) {
      paramzcjz.a("firstBackgroundRefresh", "1");
    }
    if (this.b.l()) {
      paramzcjz.a("fillFormulas", "1");
    }
    if (this.b.o()) {
      paramzcjz.a("intermediate", "1");
    }
    if (this.b.j()) {
      paramzcjz.a("refreshOnLoad", "1");
    }
    if (!this.b.getPreserveFormatting()) {
      paramzcjz.a("preserveFormatting", "0");
    }
    if (!this.b.m()) {
      paramzcjz.a("removeDataOnSave", "1");
    }
    if (((this.b.h != null) && (this.b.h.getCount() != 0)) || ((this.b.g != null) && (this.b.g.getCount() != 0)))
    {
      paramzcjz.b("queryTableRefresh");
      paramzcjz.a("nextId", zauj.z(this.b.k));
      if (this.b.m != 0) {
        paramzcjz.a("unboundColumnsLeft", zauj.z(this.b.m));
      }
      if (this.b.n != 0) {
        paramzcjz.a("unboundColumnsRight", zauj.z(this.b.n));
      }
      if ((this.b.g != null) && (this.b.g.getCount() != 0)) {
        a(paramzcjz, this.b.g, true);
      }
      if ((this.b.h != null) && (this.b.h.getCount() != 0)) {
        a(paramzcjz, this.b.h, false);
      }
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.d();
  }
  
  private void a(zcjz paramzcjz, zayf paramzayf, boolean paramBoolean)
    throws Exception
  {
    String str = paramBoolean ? "queryTableField" : "deletedField";
    paramzcjz.b(paramBoolean ? "queryTableFields" : "queryTableDeletedFields");
    paramzcjz.a("count", zauj.z(paramzayf.getCount()));
    for (int i = 0; i < paramzayf.getCount(); i++) {
      a(paramzcjz, paramzayf.a(i), paramBoolean, str);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zaye paramzaye, boolean paramBoolean, String paramString)
    throws Exception
  {
    paramzcjz.b(paramString);
    if (paramBoolean) {
      paramzcjz.a("id", zauj.z(paramzaye.a));
    }
    if ((paramzaye.b != null) && (!"".equals(paramzaye.b))) {
      paramzcjz.a("name", paramzaye.b);
    }
    if (paramBoolean)
    {
      paramzcjz.a("tableColumnId", zauj.z(paramzaye.c));
      if (paramzaye.d()) {
        paramzcjz.a("clipped", "1");
      }
      if (!paramzaye.a()) {
        paramzcjz.a("dataBound", "0");
      }
      if (paramzaye.c()) {
        paramzcjz.a("rowNumbers", "1");
      }
      if (paramzaye.b()) {
        paramzcjz.a("fillFormulas", "1");
      }
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */