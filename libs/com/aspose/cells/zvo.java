package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zvo
  extends ztp
{
  private zbpr b;
  private String c;
  
  zvo(zbpr paramzbpr, String paramString)
  {
    this.b = paramzbpr;
    this.c = paramString;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("slicers");
    c(paramzcjz);
    b(paramzcjz);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    if ((this.b != null) && (this.b.getCount() > 0))
    {
      zbpo localzbpo = null;
      for (int i = 0; i < this.b.getCount(); i++)
      {
        localzbpo = this.b.a(i);
        if (zw.b(localzbpo.a, this.c))
        {
          paramzcjz.b("slicer");
          paramzcjz.a("name", b(localzbpo.b));
          paramzcjz.a("cache", b(localzbpo.b()));
          paramzcjz.a("caption", b(localzbpo.c()));
          if (1 != localzbpo.f()) {
            paramzcjz.a("columnCount", zauj.z(localzbpo.f()));
          }
          if (0 != localzbpo.g()) {
            paramzcjz.a("rowHeight", zauj.z(localzbpo.g()));
          }
          if (!"SlicerStyleLight1".equals(localzbpo.a())) {
            paramzcjz.a("style", localzbpo.a());
          }
          if (!localzbpo.d()) {
            paramzcjz.a("showCaption", "0");
          }
          if (localzbpo.e()) {
            paramzcjz.a("lockedPosition", "1");
          }
          if (localzbpo.m != 0) {
            paramzcjz.a("level", zauj.z(localzbpo.m));
          }
          if (localzbpo.l != null) {
            paramzcjz.a(localzbpo.l);
          }
          paramzcjz.b();
        }
      }
    }
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
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.a("xmlns", zaty.c);
    paramzcjz.a("xmlns:mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
    paramzcjz.a("mc:Ignorable", "x");
    paramzcjz.a("xmlns:x", zaty.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */