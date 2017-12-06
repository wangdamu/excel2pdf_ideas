package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Iterator;

class zvb
{
  private zpi a = null;
  private String b = "http://schemas.openxmlformats.org/drawingml/2006/chartDrawing";
  private String c = "http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing";
  private int d = 0;
  private Shape e = null;
  private String f = null;
  private zph g = null;
  private zuw h = null;
  private static final za i = new za(new String[] { "nvSpPr", "cNvSpPr", "a:spLocks" });
  
  zvb(zpi paramzpi)
  {
    this.a = paramzpi;
    this.d = zbxp.a();
    this.e = this.a.a;
    this.g = paramzpi.k;
    if ((this.a.d == 2) || (this.a.d == 4)) {
      this.f = "cdr";
    } else {
      this.f = "xdr";
    }
    this.h = new zuw(this.a);
  }
  
  private void a(zcjz paramzcjz, String paramString)
    throws Exception
  {
    paramzcjz.d("</mc:Choice>");
    paramzcjz.d("<mc:Fallback>");
    paramzcjz.d("<xdr:sp macro=\"\" textlink=\"\">");
    paramzcjz.d("<xdr:nvSpPr>");
    paramzcjz.b("xdr:cNvPr");
    paramzcjz.a("id", zauj.z(this.a.a.O()));
    paramzcjz.a("name", this.a.a.getName());
    paramzcjz.b();
    paramzcjz.d("<xdr:cNvSpPr>");
    paramzcjz.d("<a:spLocks noTextEdit=\"1\"/>");
    paramzcjz.d("</xdr:cNvSpPr>");
    paramzcjz.d("</xdr:nvSpPr>");
    paramzcjz.d("<xdr:spPr>");
    n(paramzcjz);
    paramzcjz.d("<a:prstGeom prst=\"rect\">");
    paramzcjz.d("<a:avLst/>");
    paramzcjz.d("</a:prstGeom>");
    paramzcjz.d("<a:solidFill>");
    paramzcjz.d("<a:prstClr val=\"white\"/>");
    paramzcjz.d("</a:solidFill>");
    paramzcjz.d("<a:ln w=\"1\">");
    paramzcjz.d("<a:solidFill>");
    paramzcjz.d("<a:prstClr val=\"green\"/>");
    paramzcjz.d("</a:solidFill>");
    paramzcjz.d("</a:ln>");
    paramzcjz.d("</xdr:spPr>");
    paramzcjz.d("<xdr:txBody>");
    paramzcjz.d("<a:bodyPr vertOverflow=\"clip\" horzOverflow=\"clip\"/>");
    paramzcjz.d("<a:lstStyle/>");
    paramzcjz.d("<a:p>");
    paramzcjz.d("<a:r>");
    paramzcjz.d("<a:rPr lang=\"en-US\" sz=\"1100\"/>");
    paramzcjz.d("<a:t>");
    paramzcjz.d(paramString);
    paramzcjz.d("</a:t>");
    paramzcjz.d("</a:r>");
    paramzcjz.d("</a:p>");
    paramzcjz.d("</xdr:txBody>");
    paramzcjz.d("</xdr:sp>");
    paramzcjz.d("</mc:Fallback>");
    paramzcjz.d("</mc:AlternateContent>");
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    String str1 = null;
    if (this.a.a.h != null) {
      str1 = this.a.a.h.h;
    }
    if ((this.a.a.getMsoDrawingType() == 6) && (str1 != null) && (str1.indexOf("<m:oMath") != -1))
    {
      paramzcjz.d(str1);
      return;
    }
    if (this.a.b)
    {
      paramzcjz.d("<mc:AlternateContent xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\">");
      paramzcjz.d("<mc:Choice xmlns:a14=\"http://schemas.microsoft.com/office/drawing/2010/main\" Requires=\"a14\">");
    }
    if (!this.a.l)
    {
      switch (this.a.d)
      {
      case 2: 
        paramzcjz.b("cdr:relSizeAnchor");
        paramzcjz.a("xmlns:cdr", this.b);
        break;
      case 4: 
        paramzcjz.b("cdr:absSizeAnchor");
        paramzcjz.a("xmlns:cdr", this.b);
        break;
      case 1: 
        paramzcjz.b("xdr:absoluteAnchor");
        break;
      case 3: 
        paramzcjz.b("xdr:oneCellAnchor");
        break;
      case 0: 
      default: 
        paramzcjz.b("xdr:twoCellAnchor");
      }
      if (((this.e.getMsoDrawingType() != 5) || (this.a.d != 1)) && (this.a.d == 0) && (this.e.getPlacement() != 2))
      {
        String str2 = zauj.m(this.e.getPlacement());
        paramzcjz.a("editAs", str2);
      }
      w(paramzcjz);
    }
    switch (this.e.getMsoDrawingType())
    {
    case 5: 
      u(paramzcjz);
      break;
    case 8: 
      if (this.e.z == null) {
        l(paramzcjz);
      } else {
        f(paramzcjz);
      }
      break;
    case 0: 
      d(paramzcjz);
      break;
    case 31: 
      c(paramzcjz);
      break;
    default: 
      f(paramzcjz);
    }
    if (!this.a.l)
    {
      e(paramzcjz);
      paramzcjz.b();
    }
    if (this.a.b)
    {
      paramzcjz.d("</mc:Choice>");
      paramzcjz.d("<mc:Fallback/>");
      paramzcjz.d("</mc:AlternateContent>");
    }
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("mc:AlternateContent");
    paramzcjz.a("xmlns:mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
    paramzcjz.b("mc:Choice");
    paramzcjz.a("xmlns:a14", "http://schemas.microsoft.com/office/drawing/2010/main");
    paramzcjz.a("Requires", "a14");
    paramzcjz.b(this.f + ":graphicFrame");
    v(paramzcjz);
    paramzcjz.b(this.f + ":nvGraphicFramePr");
    t(paramzcjz);
    paramzcjz.b(this.f + ":cNvGraphicFramePr", null);
    paramzcjz.b();
    paramzcjz.b("xdr:xfrm");
    paramzcjz.b("a:off");
    paramzcjz.a("x", "0");
    paramzcjz.a("y", "0");
    paramzcjz.b();
    paramzcjz.b("a:ext");
    paramzcjz.a("cx", "0");
    paramzcjz.a("cy", "0");
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b("a:graphic");
    paramzcjz.b("a:graphicData");
    paramzcjz.a("uri", "http://schemas.microsoft.com/office/drawing/2010/slicer");
    paramzcjz.b("sle:slicer");
    paramzcjz.a("xmlns:sle", "http://schemas.microsoft.com/office/drawing/2010/slicer");
    paramzcjz.a("name", this.e.getName());
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b("mc:Fallback");
    f(paramzcjz);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  void b(zcjz paramzcjz)
    throws Exception
  {
    if (!this.a.l)
    {
      switch (this.a.d)
      {
      case 2: 
        paramzcjz.b("cdr:relSizeAnchor");
        paramzcjz.a("xmlns:cdr", this.b);
        break;
      case 1: 
        paramzcjz.b("xdr:absoluteAnchor");
        break;
      case 3: 
        paramzcjz.b("xdr:oneCellAnchor");
        break;
      case 0: 
      default: 
        paramzcjz.b("xdr:twoCellAnchor");
      }
      if (((this.e.getMsoDrawingType() != 5) || (this.a.d != 1)) && (this.a.d == 0) && (this.e.getPlacement() != 2))
      {
        String str = zauj.m(this.e.getPlacement());
        paramzcjz.a("editAs", str);
      }
      w(paramzcjz);
    }
    g(paramzcjz);
    if (!this.a.l)
    {
      e(paramzcjz);
      paramzcjz.b();
    }
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    if (this.e.getMsoDrawingType() != 0) {
      return;
    }
    paramzcjz.b(this.f + ":grpSp");
    a(paramzcjz, true, false, false);
    p(paramzcjz);
    GroupShape localGroupShape = (GroupShape)this.e;
    Shape[] arrayOfShape1 = localGroupShape.getGroupedShapes();
    for (Shape localShape : arrayOfShape1)
    {
      boolean bool = localShape.am();
      zpi localzpi = new zpi(this.g, localShape, bool);
      localzpi.l = true;
      zvb localzvb = new zvb(localzpi);
      localzvb.a(paramzcjz);
    }
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    if ((this.a.d == 2) || (this.a.d == 4)) {
      return;
    }
    paramzcjz.b("xdr:clientData");
    if (!this.e.isLocked()) {
      paramzcjz.a("fLocksWithSheet", "0");
    }
    if (!this.e.isPrintable()) {
      paramzcjz.a("fPrintsWithSheet", "0");
    }
    paramzcjz.b();
  }
  
  private boolean a(Shape paramShape)
  {
    if (paramShape.T()) {
      return false;
    }
    if ((this.e.h != null) && (paramShape.h.a))
    {
      if (this.e.getMsoDrawingType() == 1) {
        return true;
      }
      switch (this.e.getAutoShapeType())
      {
      case 20: 
        return true;
      }
    }
    switch (this.e.getAutoShapeType())
    {
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
      return true;
    }
    return false;
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    boolean bool = a(this.e);
    if (bool) {
      paramzcjz.b(this.f + ":cxnSp");
    } else {
      paramzcjz.b(this.f + ":sp");
    }
    v(paramzcjz);
    a(paramzcjz, false, bool, false);
    p(paramzcjz);
    h(paramzcjz);
    if ((!bool) && (this.e.x != null))
    {
      zvm localzvm = new zvm(paramzcjz, this.e, "a", this.h);
      localzvm.a();
    }
    paramzcjz.b();
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(this.f + ":sp");
    v(paramzcjz);
    a(paramzcjz, false, false, false);
    q(paramzcjz);
    j(paramzcjz);
    paramzcjz.b();
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    zsw localzsw = this.e.p;
    if (localzsw == null) {
      return;
    }
    paramzcjz.b(this.f + ":style");
    paramzcjz.b("a:lnRef");
    paramzcjz.a("idx", localzsw.a.a);
    zvl.a(paramzcjz, localzsw.a.b, -1, this.a.j.a);
    paramzcjz.b();
    paramzcjz.b("a:fillRef");
    paramzcjz.a("idx", localzsw.d.a);
    zvl.a(paramzcjz, localzsw.d.b, -1, this.a.j.a);
    paramzcjz.b();
    paramzcjz.b("a:effectRef");
    paramzcjz.a("idx", localzsw.e.a);
    zvl.a(paramzcjz, localzsw.e.b, -1, this.a.j.a);
    paramzcjz.b();
    paramzcjz.b("a:fontRef");
    paramzcjz.a("idx", localzsw.b.a);
    zvl.a(paramzcjz, localzsw.b.b, -1, this.a.j.a);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private String a(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {
      switch (i.a(paramString))
      {
      case 0: 
        return this.f + ":nvPicPr";
      case 1: 
        return this.f + ":cNvPicPr";
      case 2: 
        return "a:picLocks";
      }
    } else if (paramBoolean1) {
      switch (i.a(paramString))
      {
      case 0: 
        return this.f + ":nvGrpSpPr";
      case 1: 
        return this.f + ":cNvGrpSpPr";
      case 2: 
        return "a:grpSpLocks";
      }
    } else if (paramBoolean2) {
      switch (i.a(paramString))
      {
      case 0: 
        return this.f + ":nvCxnSpPr";
      case 1: 
        return this.f + ":cNvCxnSpPr";
      case 2: 
        return "a:cxnSpLocks";
      }
    } else {
      switch (i.a(paramString))
      {
      case 0: 
        return this.f + ":nvSpPr";
      case 1: 
        return this.f + ":cNvSpPr";
      case 2: 
        return "a:spLocks";
      }
    }
    return null;
  }
  
  private void a(zcjz paramzcjz, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    throws Exception
  {
    paramzcjz.b(a("nvSpPr", paramBoolean1, paramBoolean2, paramBoolean3));
    t(paramzcjz);
    paramzcjz.b(a("cNvSpPr", paramBoolean1, paramBoolean2, paramBoolean3));
    if (this.e.getMsoDrawingType() == 6) {
      paramzcjz.a("txBox", "1");
    }
    if (this.e.G())
    {
      paramzcjz.b(a("a:spLocks", paramBoolean1, paramBoolean2, paramBoolean3));
      if (!paramBoolean1)
      {
        if (this.e.getLockedProperty(1)) {
          paramzcjz.a("noAdjustHandles", "1");
        }
        if (this.e.getLockedProperty(12)) {
          paramzcjz.a("noChangeArrowheads", "1");
        }
      }
      if (this.e.getLockedProperty(7)) {
        paramzcjz.a("noChangeAspect", "1");
      }
      if ((!paramBoolean1) && (this.e.getLockedProperty(11))) {
        paramzcjz.a("noChangeShapeType", "1");
      }
      if (this.e.getLockedProperty(3)) {
        paramzcjz.a("noEditPoints", "1");
      }
      if (this.e.getLockedProperty(0)) {
        paramzcjz.a("noGrp", "1");
      }
      if (this.e.getLockedProperty(6)) {
        paramzcjz.a("noMove", "1");
      }
      if (this.e.getLockedProperty(10)) {
        paramzcjz.a("noResize", "1");
      }
      if (this.e.getLockedProperty(8)) {
        paramzcjz.a("noRot", "1");
      }
      if (this.e.getLockedProperty(5)) {
        paramzcjz.a("noSelect", "1");
      }
      if ((!paramBoolean1) && (!paramBoolean2) && (!paramBoolean3) && (this.e.getLockedProperty(2))) {
        paramzcjz.a("noTextEdit", "1");
      }
      if ((paramBoolean3) && (this.e.getLockedProperty(4))) {
        paramzcjz.a("noCrop", "1");
      }
      paramzcjz.b();
    }
    if ((this.a.c != null) && (paramBoolean3) && (this.e.aj() != null))
    {
      paramzcjz.b("a:extLst");
      paramzcjz.b("a:ext");
      paramzcjz.a("uri", "{84589F7E-364E-4C9E-8A38-B11213B215E9}");
      paramzcjz.b("a14:cameraTool");
      paramzcjz.a("cellRange", this.e.aj());
      paramzcjz.a("spid", this.a.c.f);
      paramzcjz.b();
      paramzcjz.b();
      paramzcjz.b();
    }
    if (paramBoolean2)
    {
      znn localznn = this.e.g;
      if ((localznn != null) && ((localznn.a != -1) || (localznn.c != -1)))
      {
        if (localznn.a != -1)
        {
          paramzcjz.b("a:stCxn");
          paramzcjz.a("id", zauj.z(this.e.N().get(localznn.a).O()));
          paramzcjz.a("idx", zauj.z(localznn.b));
          paramzcjz.b();
        }
        if (localznn.c != -1)
        {
          paramzcjz.b("a:endCxn");
          paramzcjz.a("id", zauj.z(this.e.N().get(localznn.c).O()));
          paramzcjz.a("idx", zauj.z(localznn.d));
          paramzcjz.b();
        }
      }
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void i(zcjz paramzcjz)
    throws Exception
  {
    TextEffectFormat localTextEffectFormat = this.e.getTextEffect();
    paramzcjz.b("a:p");
    String str1 = TextEffectFormat.a(localTextEffectFormat.d());
    if (str1 != null)
    {
      paramzcjz.b("a:pPr");
      paramzcjz.a("algn", str1);
      paramzcjz.b();
    }
    paramzcjz.b("a:r");
    paramzcjz.b("a:rPr");
    paramzcjz.a("sz", zauj.z(localTextEffectFormat.getFontSize() * 100));
    if (localTextEffectFormat.getFontItalic()) {
      paramzcjz.a("i", "1");
    }
    if (localTextEffectFormat.getFontBold()) {
      paramzcjz.a("b", "1");
    }
    if (localTextEffectFormat.b()) {
      paramzcjz.a("kern", "10");
    }
    double d1 = localTextEffectFormat.c();
    if (d1 < 1.0D) {
      paramzcjz.a("spc", zauj.z((int)(localTextEffectFormat.getFontSize() * 100 * (d1 - 1.0D) / 2.0D)));
    } else if (d1 == 1.0D) {
      paramzcjz.a("spc", "0");
    } else {
      paramzcjz.a("spc", zauj.z((int)(localTextEffectFormat.getFontSize() * 100 * (d1 - 1.0D))));
    }
    if (this.e.q != null)
    {
      localObject = new zvl(paramzcjz, this.e.q, this.h);
      ((zvl)localObject).b();
    }
    Object localObject = this.e.Z();
    if (((zaqa)localObject).s())
    {
      paramzcjz.b("a:effectLst");
      paramzcjz.b("a:outerShdw");
      double d2 = ((zaqa)localObject).f();
      double d3 = ((zaqa)localObject).g();
      double d4 = Math.sqrt(d2 * d2 + d3 * d3);
      paramzcjz.a("dist", zauj.z((int)(d4 * znq.j)));
      String str2 = "ctr";
      double d5 = 0.0D;
      if (d2 != 0.0D)
      {
        d5 = Math.atan(d3 / d2) / 3.141592653589793D * 180.0D;
        if (d2 > 0.0D)
        {
          if (d3 < 0.0D) {
            d5 += 360.0D;
          }
        }
        else if (d3 >= 0.0D)
        {
          d5 += 180.0D;
        }
        else
        {
          str2 = "tl";
          d5 += 180.0D;
        }
      }
      else if (d3 > 0.0D)
      {
        d5 = 90.0D;
      }
      else
      {
        d5 = -90.0D;
      }
      paramzcjz.a("dir", zauj.z((int)(d5 * znq.k)));
      double d6 = ((zaqa)localObject).j();
      if (d6 != 1.0D) {
        paramzcjz.a("sx", zauj.z((int)(d6 * znq.l)));
      }
      double d7 = ((zaqa)localObject).m();
      if (d7 != 1.0D) {
        paramzcjz.a("sy", zauj.z((int)(d7 * znq.l)));
      }
      double d8 = ((zaqa)localObject).k();
      if (d8 != 0.0D)
      {
        paramzcjz.a("kx", zauj.z((int)(Math.atan(d8) / 3.141592653589793D * 180.0D * znq.k)));
        str2 = "bl";
      }
      double d9 = ((zaqa)localObject).q();
      double d10 = ((zaqa)localObject).r();
      if (d9 > 0.0D)
      {
        if (d10 > 0.0D) {
          str2 = "br";
        } else if (d10 == 0.0D) {
          str2 = "r";
        } else {
          str2 = "tr";
        }
      }
      else if (d9 == 0.0D)
      {
        if (d10 > 0.0D) {
          str2 = "b";
        } else if (d10 == 0.0D) {
          str2 = "ctr";
        } else {
          str2 = "t";
        }
      }
      else if (d10 > 0.0D) {
        str2 = "bl";
      } else if (d10 == 0.0D) {
        str2 = "l";
      } else {
        str2 = "tl";
      }
      if (!"".equals(str2)) {
        paramzcjz.a("algn", str2);
      }
      paramzcjz.b("a:srgbClr");
      paramzcjz.a("val", zauj.a(((zaqa)localObject).c()));
      paramzcjz.b("a:alpha");
      paramzcjz.a("val", zauj.z((int)(((zaqa)localObject).e() * znq.l)));
      paramzcjz.b();
      paramzcjz.b();
      paramzcjz.b();
      paramzcjz.b();
    }
    if (localTextEffectFormat.getFontName() != null)
    {
      paramzcjz.b("a:latin");
      paramzcjz.a("typeface", localTextEffectFormat.getFontName());
      paramzcjz.b();
      paramzcjz.b("a:cs");
      paramzcjz.a("typeface", localTextEffectFormat.getFontName());
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.b("a:t", zw.a(localTextEffectFormat.getText(), "\r", ""));
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void j(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(this.f + ":txBody");
    k(paramzcjz);
    i(paramzcjz);
    paramzcjz.b();
  }
  
  private void k(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("a:bodyPr");
    paramzcjz.a("fromWordArt", "1");
    paramzcjz.a("wrap", "none");
    MsoTextFrame localMsoTextFrame = this.e.getTextFrame();
    if (!localMsoTextFrame.isAutoMargin())
    {
      paramzcjz.a("lIns", zauj.z(localMsoTextFrame.a()));
      paramzcjz.a("tIns", zauj.z(localMsoTextFrame.c()));
      paramzcjz.a("rIns", zauj.z(localMsoTextFrame.b()));
      paramzcjz.a("bIns", zauj.z(localMsoTextFrame.d()));
    }
    if (localMsoTextFrame.getAutoSize()) {
      paramzcjz.b("a:spAutoFit", null);
    }
    paramzcjz.b("a:prstTxWarp");
    paramzcjz.a("prst", zauj.aJ(this.e.getAutoShapeType()));
    zadi localzadi = this.e.ap();
    int j = localzadi == null ? 0 : localzadi.b();
    if (j > 0)
    {
      int k = 1;
      paramzcjz.b("a:avLst");
      for (int m = 327; m <= 336; m++) {
        if (localzadi.d(m))
        {
          int n = localzadi.a(m);
          paramzcjz.b("a:gd");
          if (j > 1) {
            paramzcjz.a("name", "adj" + k);
          } else {
            paramzcjz.a("name", "adj");
          }
          paramzcjz.a("fmla", "val " + zauj.z((int)(n / 21600.0D * 100000.0D)));
          paramzcjz.b();
          k++;
        }
      }
      paramzcjz.b();
    }
    paramzcjz.b();
    zaps localzaps = new zaps(this.e);
    if (localzaps.d())
    {
      paramzcjz.b("a:scene3d");
      paramzcjz.b("a:camera");
      String str1 = "legacyObliqueRight";
      double d1 = localzaps.h();
      double d2 = localzaps.i();
      double d3 = localzaps.j();
      if (d1 > 0.0D)
      {
        if (d2 > 0.0D)
        {
          if (d3 > 0.0D) {
            str1 = "legacyPerspectiveBottomRight";
          }
        }
        else if (d2 == 0.0D) {
          str1 = "legacyObliqueRight";
        }
      }
      else if (d1 == 0.0D)
      {
        if ((d2 <= 0.0D) && (d2 == 0.0D)) {
          str1 = "legacyPerspectiveFront";
        }
      }
      else if ((d2 <= 0.0D) && (d2 != 0.0D)) {
        if (d3 > 0.0D) {
          str1 = "legacyPerspectiveTopLeft";
        } else {
          str1 = "legacyObliqueTopLeft";
        }
      }
      paramzcjz.a("prst", str1);
      if ((localzaps.g() != 0.0D) || (localzaps.f() != 0.0D))
      {
        paramzcjz.b("a:rot");
        double d4 = localzaps.g();
        if (d4 > 0.0D) {
          d4 = 360.0D - d4;
        }
        paramzcjz.a("lat", zauj.z((int)(d4 * znq.k)));
        double d5 = localzaps.f();
        if (d5 < 0.0D) {
          d5 += 360.0D;
        }
        paramzcjz.a("lon", zauj.z((int)(d5 * znq.k)));
        paramzcjz.a("rev", "0");
        paramzcjz.b();
      }
      paramzcjz.b();
      paramzcjz.b("a:lightRig");
      String str2 = "legacyHarsh3";
      if (!localzaps.m()) {
        str2 = "legacyNormal3";
      }
      paramzcjz.a("rig", str2);
      String str3 = "t";
      int i1 = localzaps.k();
      int i2 = localzaps.l();
      if (i1 > 0)
      {
        if (i2 > 0) {
          str3 = "b";
        } else if (i2 != 0) {}
      }
      else if (i1 == 0)
      {
        if (i2 > 0) {
          str3 = "l";
        } else if (i2 != 0) {
          str3 = "r";
        }
      }
      else if ((i2 > 0) || (i2 != 0)) {}
      paramzcjz.a("dir", str3);
      paramzcjz.b();
      paramzcjz.b();
      paramzcjz.b("a:sp3d");
      paramzcjz.a("extrusionH", zauj.z((int)(localzaps.b() * znq.j) - 27000));
      paramzcjz.a("prstMaterial", localzaps.e() ? "legacyMetal" : "legacyMatte");
      Color localColor = localzaps.c();
      if (!localColor.isEmpty())
      {
        paramzcjz.b("a:extrusionClr");
        paramzcjz.b("a:srgbClr");
        paramzcjz.a("val", zauj.a(localColor));
        paramzcjz.b();
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void l(zcjz paramzcjz)
    throws Exception
  {
    if (this.a.a.getMsoDrawingType() != 8) {
      return;
    }
    paramzcjz.b(this.f + ":pic");
    v(paramzcjz);
    a(paramzcjz, false, false, true);
    m(paramzcjz);
    p(paramzcjz);
    paramzcjz.b();
  }
  
  private void m(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(this.f + ":blipFill");
    paramzcjz.b("a:blip");
    if (this.a.e != null) {
      paramzcjz.a("r:embed", this.a.e);
    }
    if (this.a.f != null) {
      paramzcjz.a("r:link", this.a.f);
    }
    MsoFormatPicture localMsoFormatPicture = this.a.a.getFormatPicture();
    if (localMsoFormatPicture.a != null) {
      r(paramzcjz);
    }
    if ((localMsoFormatPicture.getBrightness() != 0.0D) || (localMsoFormatPicture.getContrast() != 0.0D))
    {
      paramzcjz.b("a:lum");
      if (localMsoFormatPicture.getBrightness() != 0.0D) {
        paramzcjz.a("bright", zauj.b((int)localMsoFormatPicture.getBrightness() / 100.0D * znq.l));
      }
      if (localMsoFormatPicture.getContrast() != 0.0D) {
        paramzcjz.a("contrast", zauj.b((int)localMsoFormatPicture.getContrast() / 100.0D * znq.l));
      }
      paramzcjz.b();
    }
    if (localMsoFormatPicture.isGray()) {
      paramzcjz.d("<a:grayscl/>");
    }
    if (localMsoFormatPicture.b != null) {
      for (int j = 0; j < this.a.a.getFormatPicture().b.size(); j++) {
        paramzcjz.d((String)this.a.a.getFormatPicture().b.get(j));
      }
    }
    paramzcjz.b();
    s(paramzcjz);
    if (!this.e.aq())
    {
      paramzcjz.b("a:stretch");
      paramzcjz.b("a:fillRect");
      paramzcjz.b();
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void n(zcjz paramzcjz)
    throws Exception
  {
    boolean bool1 = this.e.R().j().e();
    boolean bool2 = this.e.R().j().f();
    if (this.e.getMsoDrawingType() == 5) {
      paramzcjz.b(this.f + ":xfrm");
    } else {
      paramzcjz.b("a:xfrm");
    }
    if (this.e.getRotationAngle() != 0.0D) {
      paramzcjz.a("rot", zauj.z((int)(this.e.getRotationAngle() * 60000.0D)));
    }
    if (bool2) {
      paramzcjz.a("flipH", "1");
    }
    if (bool1) {
      paramzcjz.a("flipV", "1");
    }
    int j = zbxp.a();
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    if (this.e.W())
    {
      int[] arrayOfInt1 = this.e.c(false);
      GroupShape localGroupShape = (GroupShape)this.e.J();
      k = (int)(arrayOfInt1[0] * (localGroupShape.a().b / 4000.0D) + 0.5D) + localGroupShape.a().a;
      m = (int)(arrayOfInt1[1] * (localGroupShape.a().d / 4000.0D) + 0.5D) + localGroupShape.a().c;
      n = (int)(arrayOfInt1[2] * (localGroupShape.a().b / 4000.0D) + 0.5D);
      i1 = (int)(arrayOfInt1[3] * (localGroupShape.a().d / 4000.0D) + 0.5D);
    }
    else
    {
      if ((this.a.d == 2) || (this.a.d == 4))
      {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int[] arrayOfInt2 = { i2 };
        int[] arrayOfInt3 = { i3 };
        int[] arrayOfInt4 = { i4 };
        int[] arrayOfInt5 = { i5 };
        this.e.a(arrayOfInt2, arrayOfInt3, arrayOfInt4, arrayOfInt5);
        i2 = arrayOfInt2[0];
        i3 = arrayOfInt3[0];
        i4 = arrayOfInt4[0];
        i5 = arrayOfInt5[0];
        double d1 = Math.min(1.0D, i2 / 4000.0D);
        double d2 = Math.min(1.0D, i3 / 4000.0D);
        double d3 = Math.min(1.0D, i4 / 4000.0D);
        double d4 = Math.min(1.0D, i5 / 4000.0D);
        double d5 = d1 * this.a.h.getChartObject().getWidth();
        k = zauj.a((int)d5, this.d);
        double d6 = d2 * this.a.h.getChartObject().getHeight();
        m = zauj.a((int)d6, j);
      }
      else
      {
        k = zauj.a(this.e.getLeftToCorner(), this.d);
        m = zauj.a(this.e.getTopToCorner(), j);
      }
      n = zauj.a(this.e.getWidth(), this.d);
      if (n < 0) {
        n = 0;
      }
      i1 = zauj.a(this.e.getHeight(), j);
      if (i1 < 0) {
        i1 = 0;
      }
    }
    paramzcjz.b("a:off");
    paramzcjz.a("x", zauj.z(k));
    paramzcjz.a("y", zauj.z(m));
    paramzcjz.b();
    paramzcjz.b("a:ext");
    paramzcjz.a("cx", zauj.z(n));
    paramzcjz.a("cy", zauj.z(i1));
    paramzcjz.b();
    if (this.e.isGroup())
    {
      zbrf localzbrf = ((GroupShape)this.e).a();
      paramzcjz.b("a:chOff");
      paramzcjz.a("x", zauj.z(localzbrf.a));
      paramzcjz.a("y", zauj.z(localzbrf.c));
      paramzcjz.b();
      paramzcjz.b("a:chExt");
      paramzcjz.a("cx", zauj.z(localzbrf.b));
      paramzcjz.a("cy", zauj.z(localzbrf.d));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, ShapePathPointCollection paramShapePathPointCollection)
    throws Exception
  {
    if (paramShapePathPointCollection.getCount() == 3)
    {
      paramzcjz.b("a:arcTo");
      ShapePathPoint localShapePathPoint1 = paramShapePathPointCollection.get(1);
      if ((localShapePathPoint1.a instanceof Integer)) {
        paramzcjz.a("wR", zauj.z(((Integer)localShapePathPoint1.a).intValue()));
      } else {
        paramzcjz.a("wR", (String)localShapePathPoint1.a);
      }
      if ((localShapePathPoint1.b instanceof Integer)) {
        paramzcjz.a("hR", zauj.z(((Integer)localShapePathPoint1.b).intValue()));
      } else {
        paramzcjz.a("hR", (String)localShapePathPoint1.b);
      }
      ShapePathPoint localShapePathPoint2 = paramShapePathPointCollection.get(2);
      if ((localShapePathPoint2.a instanceof Integer)) {
        paramzcjz.a("stAng", zauj.z(((Integer)localShapePathPoint2.a).intValue()));
      } else {
        paramzcjz.a("stAng", (String)localShapePathPoint2.a);
      }
      if ((localShapePathPoint2.b instanceof Integer)) {
        paramzcjz.a("swAng", zauj.z(((Integer)localShapePathPoint2.b).intValue()));
      } else {
        paramzcjz.a("swAng", (String)localShapePathPoint2.b);
      }
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, ShapePathPoint paramShapePathPoint)
    throws Exception
  {
    paramzcjz.b("a:pt");
    if ((paramShapePathPoint.a instanceof Integer)) {
      paramzcjz.a("x", zauj.z(((Integer)paramShapePathPoint.a).intValue()));
    } else {
      paramzcjz.a("x", (String)paramShapePathPoint.a);
    }
    if ((paramShapePathPoint.b instanceof Integer)) {
      paramzcjz.a("y", zauj.z(((Integer)paramShapePathPoint.b).intValue()));
    } else {
      paramzcjz.a("y", (String)paramShapePathPoint.b);
    }
    paramzcjz.b();
  }
  
  private void o(zcjz paramzcjz)
    throws Exception
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.e.ao())
    {
      localObject1 = (CustomGeometry)this.e.getGeometry();
      paramzcjz.b("a:custGeom");
      ShapeGuideCollection localShapeGuideCollection = null;
      if (localObject1 != null) {
        localShapeGuideCollection = ((CustomGeometry)localObject1).g();
      }
      if (localShapeGuideCollection != null)
      {
        paramzcjz.b("a:avLst");
        localObject2 = localShapeGuideCollection.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ShapeGuide localShapeGuide1 = (ShapeGuide)((Iterator)localObject2).next();
          a(paramzcjz, localShapeGuide1);
        }
        paramzcjz.b();
      }
      localObject2 = ((CustomGeometry)localObject1).d();
      if ((localObject2 != null) && (((ShapeGuideCollection)localObject2).getCount() > 0))
      {
        paramzcjz.b("a:gdLst");
        for (int k = 0; k < ((ShapeGuideCollection)localObject2).getCount(); k++)
        {
          ShapeGuide localShapeGuide2 = ((ShapeGuideCollection)localObject2).get(k);
          paramzcjz.b("a:gd");
          paramzcjz.a("name", localShapeGuide2.a());
          paramzcjz.a("fmla", localShapeGuide2.b());
          paramzcjz.b();
        }
        paramzcjz.b();
      }
      if (((CustomGeometry)localObject1).b() != null) {
        paramzcjz.d(((CustomGeometry)localObject1).b());
      }
      paramzcjz.b("a:pathLst");
      localObject3 = ((CustomGeometry)localObject1).getPaths();
      ((ShapePathCollection)localObject3).b();
      for (int m = 0; m < ((ShapePathCollection)localObject3).getCount(); m++)
      {
        ShapePath localShapePath = ((ShapePathCollection)localObject3).get(m);
        paramzcjz.b("a:path");
        if (localShapePath.a) {
          paramzcjz.a("extrusionOk", "1");
        }
        if (localShapePath.b != 5) {
          paramzcjz.a("fill", ztr.l(localShapePath.b));
        }
        if (!localShapePath.c) {
          paramzcjz.a("stroke", "0");
        }
        paramzcjz.a("h", zauj.a(localShapePath.d));
        paramzcjz.a("w", zauj.a(localShapePath.e));
        for (int n = 0; n < localShapePath.getPathSegementList().getCount(); n++)
        {
          ShapeSegmentPath localShapeSegmentPath = localShapePath.getPathSegementList().get(n);
          switch (localShapeSegmentPath.getType())
          {
          case 2: 
            paramzcjz.b("a:moveTo");
            a(paramzcjz, localShapeSegmentPath.getPoints().get(0));
            paramzcjz.b();
            break;
          case 0: 
            paramzcjz.b("a:lnTo");
            a(paramzcjz, localShapeSegmentPath.getPoints().get(1));
            paramzcjz.b();
            break;
          case 1: 
            paramzcjz.b("a:cubicBezTo");
            a(paramzcjz, localShapeSegmentPath.getPoints().get(1));
            a(paramzcjz, localShapeSegmentPath.getPoints().get(2));
            a(paramzcjz, localShapeSegmentPath.getPoints().get(3));
            paramzcjz.b();
            break;
          case 6: 
            a(paramzcjz, localShapeSegmentPath.getPoints());
            break;
          case 3: 
            paramzcjz.b("a:close");
            paramzcjz.b();
          }
        }
        paramzcjz.b();
      }
      paramzcjz.b();
      paramzcjz.b();
    }
    else
    {
      paramzcjz.b("a:prstGeom");
      localObject1 = "rect";
      if (this.e.getMsoDrawingType() != 8)
      {
        int j = zauj.aH(this.e.getAutoShapeType());
        if (j != 188) {
          localObject1 = zauj.aG(j);
        }
      }
      else
      {
        switch (this.e.getAutoShapeType())
        {
        case 2: 
          localObject1 = "roundRect";
          break;
        }
      }
      paramzcjz.a("prst", (String)localObject1);
      Geometry localGeometry = this.e.an();
      localObject2 = null;
      if (localGeometry != null) {
        localObject2 = localGeometry.g();
      }
      if ((localGeometry != null) && (localObject2 != null) && (((ShapeGuideCollection)localObject2).getCount() > 0))
      {
        paramzcjz.b("a:avLst");
        localObject3 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          ShapeGuide localShapeGuide3 = (ShapeGuide)((Iterator)localObject3).next();
          a(paramzcjz, localShapeGuide3);
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, ShapeGuide paramShapeGuide)
    throws Exception
  {
    if ((paramShapeGuide.a() == null) || (paramShapeGuide.b() == null)) {
      return;
    }
    paramzcjz.b("a:gd");
    paramzcjz.a("name", paramShapeGuide.a());
    paramzcjz.a("fmla", paramShapeGuide.b());
    paramzcjz.b();
  }
  
  private void p(zcjz paramzcjz)
    throws Exception
  {
    if (this.e.isGroup()) {
      paramzcjz.b(this.f + ":grpSpPr");
    } else {
      paramzcjz.b(this.f + ":spPr");
    }
    if (this.e.A != null) {
      paramzcjz.a("bwMode", this.e.A);
    }
    n(paramzcjz);
    if (!this.e.isGroup()) {
      o(paramzcjz);
    }
    this.e.D();
    ShapeFormat localShapeFormat = this.e.q;
    if (localShapeFormat != null)
    {
      zvl localzvl = new zvl(paramzcjz, localShapeFormat, this.h);
      localzvl.a();
    }
    paramzcjz.b();
  }
  
  private void q(zcjz paramzcjz)
    throws Exception
  {
    if (this.e.isGroup()) {
      paramzcjz.b(this.f + ":grpSpPr");
    } else {
      paramzcjz.b(this.f + ":spPr");
    }
    n(paramzcjz);
    paramzcjz.c("a:prstGeom", null);
    paramzcjz.a("prst", "rect");
    paramzcjz.b();
    paramzcjz.b("a:noFill", null);
    paramzcjz.b();
  }
  
  private void r(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("a:clrChange");
    paramzcjz.b("a:clrFrom");
    zvl.a(paramzcjz, this.a.a.getFormatPicture().a.a, -1, this.a.j.a);
    paramzcjz.b();
    paramzcjz.b("a:clrTo");
    zvl.a(paramzcjz, this.a.a.getFormatPicture().a.b, -1, this.a.j.a);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void s(zcjz paramzcjz)
    throws Exception
  {
    MsoFormatPicture localMsoFormatPicture = this.e.getFormatPicture();
    double d1 = localMsoFormatPicture.getTopCrop();
    double d2 = localMsoFormatPicture.getBottomCrop();
    double d3 = localMsoFormatPicture.getLeftCrop();
    double d4 = localMsoFormatPicture.getRightCrop();
    if ((d1 == 0.0D) && (d2 == 0.0D) && (d3 == 0.0D) && (d4 == 0.0D)) {
      return;
    }
    paramzcjz.b("a:srcRect");
    if (d3 > 0.0D) {
      paramzcjz.a("l", zauj.z((int)(d3 * 100000.0D)));
    }
    if (d1 > 0.0D) {
      paramzcjz.a("t", zauj.z((int)(d1 * 100000.0D)));
    }
    if (d4 > 0.0D) {
      paramzcjz.a("r", zauj.z((int)(d4 * 100000.0D)));
    }
    if (d2 > 0.0D) {
      paramzcjz.a("b", zauj.z((int)(d2 * 100000.0D)));
    }
    paramzcjz.b();
  }
  
  private boolean a()
  {
    if ((this.e.getMsoDrawingType() == 5) && (this.e.Q().getType() == 2)) {
      return this.e == this.e.Q().getCharts().get(0).getChartObject();
    }
    return false;
  }
  
  private void t(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(this.f + ":cNvPr");
    boolean bool = a();
    if (this.a.c != null)
    {
      paramzcjz.a("id", this.a.c.g);
    }
    else
    {
      int j = this.e.O();
      if ((j == 0) && (bool)) {
        j = 1;
      }
      paramzcjz.a("id", zauj.z(j));
    }
    String str1 = this.e.getName();
    if (!zw.b(str1)) {
      paramzcjz.a("name", str1);
    } else if (bool) {
      paramzcjz.a("name", "Chart1");
    }
    String str2 = this.e.getAlternativeText();
    if ((str2 != null) && (!"".equals(str2))) {
      paramzcjz.a("descr", str2);
    }
    String str3 = this.e.getTitle();
    if ((str3 != null) && (!"".equals(str3))) {
      paramzcjz.a("title", str3);
    }
    if (this.e.isHidden()) {
      paramzcjz.a("hidden", "1");
    } else if ((this.a.c != null) && ((this.e.getMsoDrawingType() != 8) || (this.e.z != null))) {
      paramzcjz.a("hidden", "1");
    }
    if (this.a.c != null)
    {
      paramzcjz.b("a:extLst");
      paramzcjz.b("a:ext");
      paramzcjz.a("uri", "{63B3BB69-23CF-44E3-9099-C40C66FF867C}");
      paramzcjz.b("a14:compatExt");
      paramzcjz.a("spid", this.a.c.f == null ? this.a.c.e : this.a.c.f);
      paramzcjz.b();
      paramzcjz.b();
      paramzcjz.b();
    }
    if (this.a.g != null)
    {
      Hyperlink localHyperlink = this.e.getHyperlink();
      paramzcjz.b("a:hlinkClick");
      paramzcjz.a("r:id", this.a.g);
      if ((localHyperlink.getScreenTip() != null) && (!"".equals(localHyperlink.getScreenTip()))) {
        paramzcjz.a("tooltip", localHyperlink.getScreenTip());
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void u(zcjz paramzcjz)
    throws Exception
  {
    if (this.a.a.getMsoDrawingType() != 5) {
      return;
    }
    Chart localChart = ((ChartShape)this.e).a();
    boolean bool = zum.a(localChart.getType());
    if (bool)
    {
      paramzcjz.d("<mc:AlternateContent xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\">");
      paramzcjz.d("<mc:Choice xmlns:cx1=\"http://schemas.microsoft.com/office/drawing/2015/9/8/chartex\" Requires=\"cx1\">");
    }
    paramzcjz.b(this.f + ":graphicFrame");
    v(paramzcjz);
    paramzcjz.b(this.f + ":nvGraphicFramePr");
    t(paramzcjz);
    paramzcjz.b(this.f + ":cNvGraphicFramePr", null);
    paramzcjz.b();
    n(paramzcjz);
    paramzcjz.b("a:graphic");
    paramzcjz.b("a:graphicData");
    if (bool)
    {
      paramzcjz.a("uri", "http://schemas.microsoft.com/office/drawing/2014/chartex");
      paramzcjz.b("cx:chart");
      paramzcjz.a("xmlns:cx", "http://schemas.microsoft.com/office/drawing/2014/chartex");
      paramzcjz.a("r:id", this.a.e);
      paramzcjz.b();
    }
    else
    {
      paramzcjz.a("uri", "http://schemas.openxmlformats.org/drawingml/2006/chart");
      paramzcjz.b("c:chart");
      paramzcjz.a("xmlns:c", "http://schemas.openxmlformats.org/drawingml/2006/chart");
      paramzcjz.a("r:id", this.a.e);
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
    if (bool) {
      a(paramzcjz, "This chart isn't available in your version of Excel.\n\nEditing this shape or saving this workbook into a different file format will permanently break the chart.");
    }
  }
  
  private void v(zcjz paramzcjz)
    throws Exception
  {
    if (this.e.getMacroName() != null) {
      paramzcjz.a("macro", this.e.getMacroName());
    }
    if (this.e.ar()) {
      paramzcjz.a("fPublished", "1");
    }
    switch (this.e.getMsoDrawingType())
    {
    case 8: 
      break;
    default: 
      if ((this.e.x != null) && (this.e.x.d != null) && (!this.e.x.d.c())) {
        paramzcjz.a("fLocksText", "0");
      }
      String str = this.e.getLinkedCell();
      if ((str != null) && (this.a.c == null)) {
        paramzcjz.a("textlink", str);
      }
      break;
    }
  }
  
  private void w(zcjz paramzcjz)
    throws Exception
  {
    switch (this.a.d)
    {
    case 2: 
      x(paramzcjz);
      break;
    case 4: 
      y(paramzcjz);
      break;
    case 1: 
      z(paramzcjz);
      break;
    case 3: 
      A(paramzcjz);
      break;
    case 0: 
    default: 
      a(paramzcjz, this.e, false);
    }
  }
  
  private void x(zcjz paramzcjz)
    throws Exception
  {
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int[] arrayOfInt1 = { j };
    int[] arrayOfInt2 = { k };
    int[] arrayOfInt3 = { m };
    int[] arrayOfInt4 = { n };
    this.e.a(arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4);
    j = arrayOfInt1[0];
    k = arrayOfInt2[0];
    m = arrayOfInt3[0];
    n = arrayOfInt4[0];
    double d1 = Math.min(1.0D, j / 4000.0D);
    double d2 = Math.min(1.0D, k / 4000.0D);
    double d3 = Math.min(1.0D, m / 4000.0D);
    double d4 = Math.min(1.0D, n / 4000.0D);
    paramzcjz.b("cdr:from");
    paramzcjz.b("cdr:x");
    paramzcjz.a(zauj.b(d1));
    paramzcjz.b();
    paramzcjz.b("cdr:y");
    paramzcjz.a(zauj.b(d2));
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b("cdr:to");
    paramzcjz.b("cdr:x");
    paramzcjz.a(zauj.b(d3));
    paramzcjz.b();
    paramzcjz.b("cdr:y");
    paramzcjz.a(zauj.b(d4));
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void y(zcjz paramzcjz)
    throws Exception
  {
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int[] arrayOfInt1 = { j };
    int[] arrayOfInt2 = { k };
    int[] arrayOfInt3 = { m };
    int[] arrayOfInt4 = { n };
    this.e.a(arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4);
    j = arrayOfInt1[0];
    k = arrayOfInt2[0];
    m = arrayOfInt3[0];
    n = arrayOfInt4[0];
    double d1 = Math.min(1.0D, j / 4000.0D);
    double d2 = Math.min(1.0D, k / 4000.0D);
    int i1 = this.e.getWidth();
    int i2 = this.e.getHeight();
    i1 = zauj.a(i1, this.d);
    i2 = zauj.a(i2, this.d);
    paramzcjz.b("cdr:from");
    paramzcjz.b("cdr:x");
    paramzcjz.a(zauj.b(d1));
    paramzcjz.b();
    paramzcjz.b("cdr:y");
    paramzcjz.a(zauj.b(d2));
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b("cdr:ext");
    paramzcjz.a("cx", zauj.z(i1));
    paramzcjz.a("cy", zauj.z(i2));
    paramzcjz.b();
  }
  
  private void z(zcjz paramzcjz)
    throws Exception
  {
    int j = this.e.getWidth();
    int k = this.e.getHeight();
    j = zauj.a(j, this.d);
    k = zauj.a(k, this.d);
    paramzcjz.b("xdr:pos");
    paramzcjz.a("x", "0");
    paramzcjz.a("y", "0");
    paramzcjz.b();
    paramzcjz.b("xdr:ext");
    paramzcjz.a("cx", zauj.z(j));
    paramzcjz.a("cy", zauj.z(k));
    paramzcjz.b();
  }
  
  private void A(zcjz paramzcjz)
    throws Exception
  {
    int j = this.e.getUpperLeftColumn();
    int k = this.e.getLeft();
    int m = this.e.getUpperLeftRow();
    int n = this.e.getTop();
    paramzcjz.b("xdr:from");
    paramzcjz.b("xdr:col");
    paramzcjz.a(zauj.z(j));
    paramzcjz.b();
    paramzcjz.b("xdr:colOff");
    paramzcjz.a(zauj.z(zauj.a(k, this.d)));
    paramzcjz.b();
    paramzcjz.b("xdr:row");
    paramzcjz.a(zauj.z(m));
    paramzcjz.b();
    paramzcjz.b("xdr:rowOff");
    paramzcjz.a(zauj.z(zauj.a(n, this.d)));
    paramzcjz.b();
    paramzcjz.b();
    int i1 = this.e.getWidth();
    int i2 = this.e.getHeight();
    i1 = zauj.a(i1, this.d);
    i2 = zauj.a(i2, this.d);
    paramzcjz.b("xdr:ext");
    paramzcjz.a("cx", zauj.z(i1));
    paramzcjz.a("cy", zauj.z(i2));
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, Shape paramShape, boolean paramBoolean)
    throws Exception
  {
    int[] arrayOfInt = paramShape.M();
    int j = arrayOfInt[0];
    int k = arrayOfInt[1];
    int m = arrayOfInt[2];
    int n = arrayOfInt[3];
    int i1 = arrayOfInt[4];
    int i2 = arrayOfInt[5];
    int i3 = arrayOfInt[6];
    int i4 = arrayOfInt[7];
    paramzcjz.b(paramBoolean ? "from" : "xdr:from");
    paramzcjz.b("xdr:col");
    paramzcjz.a(zauj.z(j));
    paramzcjz.b();
    paramzcjz.b("xdr:colOff");
    paramzcjz.a(zauj.z(k));
    paramzcjz.b();
    paramzcjz.b("xdr:row");
    paramzcjz.a(zauj.z(m));
    paramzcjz.b();
    paramzcjz.b("xdr:rowOff");
    paramzcjz.a(zauj.z(n));
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b(paramBoolean ? "to" : "xdr:to");
    paramzcjz.b("xdr:col");
    paramzcjz.a(zauj.z(i1));
    paramzcjz.b();
    paramzcjz.b("xdr:colOff");
    paramzcjz.a(zauj.z(i2));
    paramzcjz.b();
    paramzcjz.b("xdr:row");
    paramzcjz.a(zauj.z(i3));
    paramzcjz.b();
    paramzcjz.b("xdr:rowOff");
    paramzcjz.a(zauj.z(i4));
    paramzcjz.b();
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */