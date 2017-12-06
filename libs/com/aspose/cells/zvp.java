package com.aspose.cells;

class zvp
  extends ztp
{
  private zbpp b;
  
  zvp(zbpp paramzbpp)
  {
    this.b = paramzbpp;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("slicerCacheDefinition");
    d(paramzcjz);
    b(paramzcjz);
    c(paramzcjz);
    if (this.b.g != null) {
      paramzcjz.d(this.b.g);
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    int i = this.b.j().getCount();
    if (i > 0)
    {
      paramzcjz.b("pivotTables");
      for (int j = 0; j < i; j++)
      {
        paramzcjz.b("pivotTable");
        paramzcjz.a("tabId", zauj.z(this.b.j().a(j).a()));
        paramzcjz.a("name", b(this.b.j().a(j).b()));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    if ((!this.b.c()) && ((this.b.p == null) || (!this.b.b()))) {
      return;
    }
    paramzcjz.b("data");
    if (this.b.c())
    {
      paramzcjz.b("tabular");
      paramzcjz.a("pivotCacheId", zauj.a(this.b.i & 0xFFFFFFFF));
      String str = zbqb.b(this.b.j);
      if (!str.equals("ascending")) {
        paramzcjz.a("sortOrder", str);
      }
      if (!this.b.k) {
        paramzcjz.a("customListSort", "0");
      }
      str = zbqb.a(this.b.l);
      if (!str.equals("showItemsWithDataAtTop")) {
        paramzcjz.a("crossFilter", str);
      }
      if (!this.b.m) {
        paramzcjz.a("showMissing", "0");
      }
      zbpt localzbpt = this.b.e();
      int i = localzbpt.getCount();
      if (i > 0)
      {
        paramzcjz.b("items");
        paramzcjz.a("count", zauj.z(i));
        for (int j = 0; j < i; j++)
        {
          paramzcjz.b("i");
          paramzcjz.a("x", zauj.z(localzbpt.a(j).a));
          if (localzbpt.a(j).b) {
            paramzcjz.a("s", "1");
          }
          if (localzbpt.a(j).c) {
            paramzcjz.a("nd", "1");
          }
          paramzcjz.b();
        }
        paramzcjz.b();
      }
      if (this.b.o != null) {
        paramzcjz.a(this.b.o);
      }
      paramzcjz.b();
    }
    if ((this.b.p != null) && (this.b.b())) {
      paramzcjz.d(this.b.p);
    }
    paramzcjz.b();
  }
  
  private boolean a(String paramString)
  {
    return (null == paramString) || ("".equals(paramString));
  }
  
  private String b(String paramString)
  {
    if (a(paramString)) {
      return "";
    }
    return paramString;
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.a("xmlns", zaty.c);
    paramzcjz.a("xmlns:mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
    paramzcjz.a("mc:Ignorable", "x");
    paramzcjz.a("xmlns:x", zaty.a);
    paramzcjz.a("name", b(this.b.f()));
    paramzcjz.a("sourceName", b(this.b.g()));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */