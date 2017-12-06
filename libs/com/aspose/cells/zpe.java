package com.aspose.cells;

import com.aspose.cells.a.d.zcc;

class zpe
{
  Chart a = null;
  zbbs b = new zbbs();
  String c = null;
  zph d = null;
  zpu e;
  String f = null;
  
  zpt a()
  {
    return this.e.e;
  }
  
  zpe(zpu paramzpu, Chart paramChart)
    throws Exception
  {
    this.e = paramzpu;
    this.a = paramChart;
    this.d = new zph(this);
    if (this.d.b == null) {
      this.d = null;
    } else {
      this.d.a = a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartUserShapes", "../drawings/" + this.d.b, null);
    }
  }
  
  void a(String paramString)
  {
    zcz localzcz = null;
    if ((this.a.a != null) && (this.a.a.a != null))
    {
      int i = a().s;
      String str = "themeOverride" + i + ".xml";
      a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/themeOverride", "../theme/" + str, null);
      a().a(false, "/xl/theme/" + str, "application/vnd.openxmlformats-officedocument.themeOverride+xml");
      a().s += 1;
      localzcz = new zcz(this.a.a.a);
      a().a("xl/theme/" + str, localzcz);
    }
    if (this.a.c != null)
    {
      a("http://schemas.microsoft.com/office/2011/relationships/chartStyle", "style" + paramString + ".xml", null);
      a().a(false, "/xl/charts/style" + paramString + ".xml", "application/vnd.ms-office.chartstyle+xml");
      localzcz = new zcz(this.a.c);
      a().a("xl/charts/style" + paramString + ".xml", localzcz);
    }
    if (this.a.d != null)
    {
      a("http://schemas.microsoft.com/office/2011/relationships/chartColorStyle", "color" + paramString + ".xml", null);
      a().a(false, "/xl/charts/color" + paramString + ".xml", "application/vnd.ms-office.chartcolorstyle+xml");
      localzcz = new zcz(this.a.d);
      a().a("xl/charts/color" + paramString + ".xml", localzcz);
    }
  }
  
  String a(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    zp localzp = a().a(paramArrayOfByte, zcc.b(zcc.a(paramArrayOfByte)));
    return a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "../media/" + localzp.c(), null);
  }
  
  String a(String paramString1, String paramString2, String paramString3)
  {
    return this.b.b(paramString1, paramString2, paramString3).b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */