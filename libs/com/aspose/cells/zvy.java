package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zl;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zvy
  extends ztp
{
  private Workbook c;
  private Worksheet d;
  private Cells e;
  private RowCollection f;
  private zpu g;
  private zpo h;
  private String[] i;
  private boolean j;
  private ArrayList k;
  private OoxmlSaveOptions l;
  private String m = "";
  zvq b = null;
  private int n = 0;
  
  zvy(zpu paramzpu, zpo paramzpo, OoxmlSaveOptions paramOoxmlSaveOptions, zvq paramzvq)
  {
    this.g = paramzpu;
    this.c = paramzpu.b;
    this.d = paramzpu.a;
    this.e = this.d.getCells();
    this.f = this.e.getRows();
    this.h = paramzpo;
    this.i = new String[Math.max(this.e.b((short)0) + 1, 0)];
    this.l = paramOoxmlSaveOptions;
    this.j = paramOoxmlSaveOptions.getExportCellName();
    this.k = new ArrayList();
    this.b = paramzvq;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("worksheet");
    f(paramzcjz);
    o(paramzcjz);
    q(paramzcjz);
    r(paramzcjz);
    u(paramzcjz);
    v(paramzcjz);
    t(paramzcjz);
    n(paramzcjz);
    m(paramzcjz);
    c(paramzcjz);
    if (this.d.hasAutofilter()) {
      a(paramzcjz, this.d.getAutoFilter(), true);
    }
    DataSorter localDataSorter = this.d.r();
    if ((localDataSorter != null) && (localDataSorter.a().size() > 0)) {
      a(paramzcjz, localDataSorter);
    }
    g(paramzcjz);
    s(paramzcjz);
    x(paramzcjz);
    p(paramzcjz);
    w(paramzcjz);
    b(paramzcjz, this.d.getPageSetup());
    a(paramzcjz, this.d.getPageSetup());
    a(paramzcjz, this.d.getPageSetup(), this.g.o);
    c(paramzcjz, this.d.getPageSetup());
    a(paramzcjz, this.d.getHorizontalPageBreaks());
    a(paramzcjz, this.d.getVerticalPageBreaks());
    e(paramzcjz);
    h(paramzcjz);
    d(paramzcjz);
    if (this.g.j.a != null)
    {
      paramzcjz.b("drawing");
      paramzcjz.a("r:id", null, this.g.j.a);
      paramzcjz.b();
    }
    if (this.g.v != null)
    {
      paramzcjz.b("legacyDrawing");
      paramzcjz.a("r:id", null, this.g.v);
      paramzcjz.b();
    }
    if (this.g.u != null)
    {
      paramzcjz.b("legacyDrawingHF");
      paramzcjz.a("r:id", null, this.g.u);
      paramzcjz.b();
    }
    if (this.g.n != null)
    {
      paramzcjz.b("picture");
      paramzcjz.a("r:id", null, this.g.n);
      paramzcjz.b();
    }
    j(paramzcjz);
    k(paramzcjz);
    l(paramzcjz);
    i(paramzcjz);
    a(paramzcjz, this);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
    if (this.l.getClearData()) {
      this.g.a.getCells().clear();
    }
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    if ((this.d.t == null) || (this.d.t.getCount() == 0)) {
      return;
    }
    ScenarioCollection localScenarioCollection = this.d.t;
    paramzcjz.b("scenarios");
    paramzcjz.a("current", zauj.z(localScenarioCollection.a));
    paramzcjz.a("show", zauj.z(localScenarioCollection.b));
    if ((localScenarioCollection.c != null) && (localScenarioCollection.c.size() > 0))
    {
      String str = zauj.b(localScenarioCollection.c, 0, localScenarioCollection.c.size() - 1);
      paramzcjz.a("sqref", str);
    }
    for (int i1 = 0; i1 < localScenarioCollection.getCount(); i1++)
    {
      Scenario localScenario = this.d.t.get(i1);
      paramzcjz.b("scenario");
      paramzcjz.a("name", localScenario.b);
      if (localScenario.isLocked()) {
        paramzcjz.a("locked", localScenario.isLocked() ? "1" : "0");
      }
      paramzcjz.a("count", zauj.z(localScenario.getInputCells().getCount()));
      paramzcjz.a("user", localScenario.getUser());
      paramzcjz.a("comment", localScenario.getComment());
      if (localScenario.isHidden()) {
        paramzcjz.a("hidden", localScenario.isHidden() ? "1" : "0");
      }
      for (int i2 = 0; i2 < localScenario.getInputCells().getCount(); i2++)
      {
        ScenarioInputCell localScenarioInputCell = localScenario.getInputCells().get(i2);
        paramzcjz.b("inputCells");
        paramzcjz.a("r", localScenarioInputCell.getName());
        paramzcjz.a("val", localScenarioInputCell.c);
        if (localScenarioInputCell.d != 0) {
          paramzcjz.a("numFmtId", zauj.z(localScenarioInputCell.d));
        }
        if (localScenarioInputCell.e) {
          paramzcjz.a("deleted", localScenarioInputCell.e ? "1" : "0");
        }
        if (localScenarioInputCell.f) {
          paramzcjz.a("undone", localScenarioInputCell.f ? "1" : "0");
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    ErrorCheckOptionCollection localErrorCheckOptionCollection = this.d.m;
    if ((localErrorCheckOptionCollection == null) || (localErrorCheckOptionCollection.getCount() == 0)) {
      return;
    }
    int i1 = 0;
    ErrorCheckOption localErrorCheckOption;
    for (int i2 = 0; i2 < localErrorCheckOptionCollection.getCount(); i2++)
    {
      localErrorCheckOption = localErrorCheckOptionCollection.get(i2);
      if ((localErrorCheckOption.a != null) && (localErrorCheckOption.a.size() != 0))
      {
        i1 = 1;
        break;
      }
    }
    if (i1 == 0) {
      return;
    }
    paramzcjz.b("ignoredErrors");
    for (i2 = 0; i2 < localErrorCheckOptionCollection.getCount(); i2++)
    {
      localErrorCheckOption = localErrorCheckOptionCollection.get(i2);
      if ((localErrorCheckOption.a != null) && (localErrorCheckOption.a.size() != 0))
      {
        paramzcjz.b("ignoredError");
        paramzcjz.a("sqref", zauj.b(localErrorCheckOption.a, 0, localErrorCheckOption.a.size()));
        if (!localErrorCheckOption.isErrorCheck(1)) {
          paramzcjz.a("evalError", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(32)) {
          paramzcjz.a("twoDigitTextYear", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(4)) {
          paramzcjz.a("numberStoredAsText", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(16)) {
          paramzcjz.a("formula", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(8)) {
          paramzcjz.a("formulaRange", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(64)) {
          paramzcjz.a("unlockedFormula", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(2)) {
          paramzcjz.a("emptyCellReference", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(128)) {
          paramzcjz.a("listDataValidation", "1");
        }
        if (!localErrorCheckOption.isErrorCheck(129)) {
          paramzcjz.a("calculatedColumn", "1");
        }
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    SmartTagSetting localSmartTagSetting = this.d.J();
    if ((localSmartTagSetting == null) || (localSmartTagSetting.getCount() == 0)) {
      return;
    }
    paramzcjz.b("smartTags");
    for (int i1 = 0; i1 < localSmartTagSetting.getCount(); i1++)
    {
      SmartTagCollection localSmartTagCollection = localSmartTagSetting.get(i1);
      paramzcjz.b("cellSmartTags");
      paramzcjz.a("r", CellsHelper.cellIndexToName(localSmartTagCollection.getRow(), localSmartTagCollection.getColumn()));
      for (int i2 = 0; i2 < localSmartTagCollection.getCount(); i2++)
      {
        SmartTag localSmartTag = localSmartTagCollection.get(i2);
        int i3 = 0;
        if (localSmartTag.b() != null)
        {
          i3 = this.c.getWorksheets().aa().a(localSmartTag.b());
          if (i3 >= 0)
          {
            paramzcjz.b("cellSmartTag");
            paramzcjz.a("type", zauj.z(i3));
            if (localSmartTag.getDeleted()) {
              paramzcjz.a("deleted", "1");
            }
            if (localSmartTag.a()) {
              paramzcjz.a("xmlBased", "1");
            }
            for (int i4 = 0; i4 < localSmartTag.getProperties().getCount(); i4++)
            {
              SmartTagProperty localSmartTagProperty = localSmartTag.getProperties().get(i4);
              paramzcjz.b("cellSmartTagPr");
              paramzcjz.a("key", localSmartTagProperty.getName());
              paramzcjz.a("val", localSmartTagProperty.getValue());
              paramzcjz.b();
            }
            paramzcjz.b();
          }
        }
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    if (zauj.a) {
      paramzcjz.a("xmlns", zaty.a);
    } else {
      paramzcjz.a("xmlns", zaty.b);
    }
    paramzcjz.a("xmlns", "r", null, zaty.e);
    paramzcjz.a("xmlns", "xdr", null, "http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing");
    paramzcjz.a("xmlns", "x14", null, zaty.c);
    paramzcjz.a("xmlns", "mc", null, "http://schemas.openxmlformats.org/markup-compatibility/2006");
    if ((this.d.k != null) && (this.d.k.c.size() > 0))
    {
      Iterator localIterator = this.d.k.c.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        zou localzou = (zou)localObject;
        paramzcjz.a(localzou.a, localzou.b);
      }
    }
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    if ((this.d.s != null) && (this.d.s.getCount() != 0))
    {
      paramzcjz.b("customSheetViews");
      for (int i1 = 0; i1 < this.d.s.getCount(); i1++)
      {
        zoh localzoh = this.d.s.a(i1);
        paramzcjz.b("customSheetView");
        a(paramzcjz, localzoh);
        a(paramzcjz, zro.b(localzoh));
        a(paramzcjz, localzoh.k);
        a(paramzcjz, localzoh.l);
        a(paramzcjz, localzoh.e());
        b(paramzcjz, localzoh.e());
        a(paramzcjz, localzoh.e(), localzoh.b);
        c(paramzcjz, localzoh.e());
        if (localzoh.a() > 0) {
          a(paramzcjz, localzoh.b(), false);
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zoh paramzoh)
    throws Exception
  {
    int i1 = paramzoh.I();
    if (i1 < 64) {
      paramzcjz.a("colorId", zauj.z(i1));
    }
    paramzcjz.a("guid", "{" + zs.a(paramzoh.n) + "}");
    if (paramzoh.p()) {
      paramzcjz.a("filter", "1");
    }
    if (paramzoh.q()) {
      paramzcjz.a("filterUnique", "1");
    }
    if (!paramzoh.e().isPercentScale()) {
      paramzcjz.a("fitToPage", "1");
    }
    if (paramzoh.l()) {
      paramzcjz.a("hiddenColumns", "1");
    }
    if (paramzoh.k()) {
      paramzcjz.a("hiddenRows", "1");
    }
    if (!paramzoh.B()) {
      paramzcjz.a("outlineSymbols", "0");
    }
    if (paramzoh.r()) {
      paramzcjz.a("printArea", "1");
    }
    if (paramzoh.D() != 100) {
      paramzcjz.a("scale", zauj.z(paramzoh.D()));
    }
    if (paramzoh.o()) {
      paramzcjz.a("showAutoFilter", "1");
    }
    if (paramzoh.v()) {
      paramzcjz.a("showFormulas", "1");
    }
    if (!paramzoh.w()) {
      paramzcjz.a("showGridLines", "0");
    }
    if (paramzoh.n()) {
      paramzcjz.a("showPageBreaks", "1");
    }
    if (!paramzoh.x()) {
      paramzcjz.a("showRowCol", "0");
    }
    if ((paramzoh.E() == 2) && (!paramzoh.G())) {
      paramzcjz.a("showRuler", "0");
    }
    if (paramzoh.F() != 0)
    {
      str1 = "hidden";
      if (paramzoh.F() == 2) {
        str1 = "veryHidden";
      }
      paramzcjz.a("state", str1);
    }
    String str1 = CellsHelper.cellIndexToName(paramzoh.i(), paramzoh.j());
    paramzcjz.a("topLeftCell", str1);
    String str2 = zauj.as(paramzoh.E());
    if (str2 != null) {
      paramzcjz.a("view", str2);
    }
    if (!paramzoh.A()) {
      paramzcjz.a("showZeros", "0");
    }
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    int i1 = this.g.p.size();
    if (i1 == 0) {
      return;
    }
    paramzcjz.b("customProperties");
    for (int i2 = 0; i2 < i1; i2++)
    {
      zpn localzpn = (zpn)this.g.p.get(i2);
      paramzcjz.b("customPr");
      paramzcjz.a("name", localzpn.a);
      paramzcjz.a("r:id", null, localzpn.b);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void i(zcjz paramzcjz)
    throws Exception
  {
    if (this.g.q.size() == 0) {
      return;
    }
    paramzcjz.b("tableParts");
    Iterator localIterator = this.g.q.iterator();
    while (localIterator.hasNext())
    {
      zrc localzrc = (zrc)localIterator.next();
      paramzcjz.b("tablePart");
      paramzcjz.a("r:id", null, localzrc.b.b);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zvy paramzvy)
    throws Exception
  {
    zvz localzvz = new zvz(this.g);
    localzvz.a(paramzcjz, paramzvy);
  }
  
  private void j(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.g.l;
    int i1 = localArrayList.size();
    if (i1 == 0) {
      return;
    }
    paramzcjz.b("oleObjects");
    for (int i2 = 0; i2 < i1; i2++)
    {
      zpl localzpl = (zpl)localArrayList.get(i2);
      paramzcjz.d("<mc:AlternateContent xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\">");
      paramzcjz.d("<mc:Choice Requires=\"x14\">");
      a(paramzcjz, localzpl, true, localzpl.b);
      paramzcjz.d("</mc:Choice>");
      paramzcjz.d("<mc:Fallback>");
      a(paramzcjz, localzpl, false, localzpl.b);
      paramzcjz.d("</mc:Fallback>");
      paramzcjz.d("</mc:AlternateContent>");
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zpl paramzpl, boolean paramBoolean, String paramString)
    throws Exception
  {
    paramzcjz.b("oleObject");
    if (paramzpl.a.getProgID() != null) {
      paramzcjz.a("progId", paramzpl.a.getProgID());
    }
    if (paramzpl.a.getDisplayAsIcon()) {
      paramzcjz.a("dvAspect", "DVASPECT_ICON");
    }
    if (paramzpl.a.isLink())
    {
      paramzcjz.a("link", paramzpl.a.q());
      if (paramzpl.a.getAutoUpdate()) {
        paramzcjz.a("oleUpdate", "OLEUPDATE_ALWAYS");
      }
    }
    if (paramzpl.a.getAutoLoad()) {
      paramzcjz.a("autoLoad", "1");
    }
    if (paramzpl.b != null) {
      paramzcjz.a("shapeId", paramString);
    }
    if (paramzpl.c != null) {
      paramzcjz.a("r:id", null, paramzpl.c);
    }
    if (paramBoolean)
    {
      paramzcjz.b("objectPr");
      paramzcjz.a("defaultSize", "0");
      if (paramzpl.d == null)
      {
        paramzcjz.a("autoPict", "0");
      }
      else
      {
        if (!paramzpl.a.isAutoSize()) {
          paramzcjz.a("autoPict", "0");
        }
        paramzcjz.a("r:id", paramzpl.d);
      }
      a(paramzcjz, paramzpl.a);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void k(zcjz paramzcjz)
    throws Exception
  {
    if (this.g.m.size() == 0) {
      return;
    }
    int i1 = 0;
    ArrayList localArrayList = this.g.m;
    zpf localzpf;
    zqn localzqn;
    for (int i2 = 0; i2 < localArrayList.size(); i2++)
    {
      localzpf = (zpf)localArrayList.get(i2);
      localzqn = localzpf.a;
      if (!localzqn.a()) {
        i1 = 1;
      }
    }
    if (i1 == 0)
    {
      paramzcjz.d("<mc:AlternateContent xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\">");
      paramzcjz.d("<mc:Choice Requires=\"x14\">");
    }
    paramzcjz.b("controls");
    for (i2 = 0; i2 < localArrayList.size(); i2++)
    {
      localzpf = (zpf)localArrayList.get(i2);
      localzqn = localzpf.a;
      paramzcjz.d("<mc:AlternateContent xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\">");
      paramzcjz.d("<mc:Choice Requires=\"x14\">");
      a(paramzcjz, localzpf, true, localzqn.b);
      paramzcjz.d("</mc:Choice>");
      if (!localzqn.a())
      {
        paramzcjz.d("<mc:Fallback>");
        a(paramzcjz, localzpf, false, localzqn.b);
        paramzcjz.d("</mc:Fallback>");
      }
      paramzcjz.d("</mc:AlternateContent>");
    }
    paramzcjz.b();
    if (i1 == 0)
    {
      paramzcjz.d("</mc:Choice>");
      paramzcjz.d("</mc:AlternateContent>");
    }
  }
  
  private void a(zcjz paramzcjz, zpf paramzpf, boolean paramBoolean, String paramString)
    throws Exception
  {
    zqn localzqn = paramzpf.a;
    paramzcjz.b("control");
    paramzcjz.a("shapeId", paramString);
    paramzcjz.a("r:id", null, paramzpf.c);
    paramzcjz.a("name", localzqn.a);
    if (paramBoolean)
    {
      paramzcjz.b("controlPr");
      if (!paramzpf.b.isLocked()) {
        paramzcjz.a("locked", "0");
      }
      paramzcjz.a("defaultSize", "0");
      if (!paramzpf.b.isPrintable()) {
        paramzcjz.a("print", "0");
      }
      paramzcjz.a("autoLine", "0");
      String str1 = paramzpf.b.getLinkedCell();
      if ((str1 != null) && (!"".equals(str1)) && (!"#REF!".equals(str1))) {
        paramzcjz.a("linkedCell", zw.a(str1, "$", ""));
      }
      String str2 = paramzpf.b.getInputRange();
      if ((str2 != null) && (!"".equals(str2)) && (!"#REF!".equals(str2))) {
        paramzcjz.a("listFillRange", zw.a(str2, "$", ""));
      }
      if (paramzpf.d == null)
      {
        paramzcjz.a("autoPict", "0");
      }
      else
      {
        if (localzqn.h != null) {
          paramzcjz.a("autoPict", "0");
        }
        if (localzqn.i != null) {
          paramzcjz.a("altText", localzqn.i);
        }
        paramzcjz.a("r:id", paramzpf.d);
      }
      String str3 = paramzpf.b.getMacroName();
      if (str3 != null) {
        paramzcjz.a("macro", str3);
      }
      a(paramzcjz, paramzpf.b);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Shape paramShape)
    throws Exception
  {
    paramzcjz.b("anchor");
    if (paramShape.getPlacement() == 1)
    {
      paramzcjz.a("moveWithCells", "1");
    }
    else if (paramShape.getPlacement() == 2)
    {
      paramzcjz.a("moveWithCells", "1");
      paramzcjz.a("sizeWithCells", "1");
    }
    zvb.a(paramzcjz, paramShape, true);
    paramzcjz.b();
  }
  
  private void l(zcjz paramzcjz)
    throws Exception
  {
    zqv localzqv = this.d.k;
    if ((localzqv == null) || ((localzqv.f.size() == 0) && (localzqv.e.size() == 0))) {
      return;
    }
    paramzcjz.d("<mc:AlternateContent xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\">");
    paramzcjz.d("<mc:Choice Requires=\"x14\">");
    Object localObject = localzqv.e.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      paramzcjz.d(str);
    }
    paramzcjz.d("</mc:Choice>");
    localObject = localzqv.f;
    for (int i1 = 0; i1 < ((ArrayList)localObject).size(); i1++) {
      paramzcjz.d((String)((ArrayList)localObject).get(i1));
    }
    paramzcjz.d("</mc:AlternateContent>");
  }
  
  private void m(zcjz paramzcjz)
    throws Exception
  {
    ProtectedRangeCollection localProtectedRangeCollection = this.d.getAllowEditRanges();
    if (localProtectedRangeCollection.getCount() == 0) {
      return;
    }
    paramzcjz.b("protectedRanges");
    Iterator localIterator = localProtectedRangeCollection.iterator();
    while (localIterator.hasNext())
    {
      ProtectedRange localProtectedRange = (ProtectedRange)localIterator.next();
      if ((localProtectedRange.a() != null) && (localProtectedRange.a().size() != 0))
      {
        paramzcjz.b("protectedRange");
        if ((localProtectedRange.b() & 0xFFFF) != 0) {
          paramzcjz.a("password", zp.c(localProtectedRange.b() & 0xFFFF));
        }
        String str = zauj.b(localProtectedRange.a(), 0, localProtectedRange.a().size());
        paramzcjz.a("sqref", str);
        paramzcjz.a("name", localProtectedRange.getName());
        if (localProtectedRange.getSecurityDescriptor() != null) {
          paramzcjz.a("securityDescriptor", localProtectedRange.getSecurityDescriptor());
        }
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void n(zcjz paramzcjz)
    throws Exception
  {
    Protection localProtection = this.d.a();
    if (localProtection == null) {
      return;
    }
    paramzcjz.b("sheetProtection");
    if (localProtection.a != null)
    {
      ztm localztm = localProtection.a;
      if (localztm.a == null)
      {
        if (localztm.b() != 0) {
          paramzcjz.a("password", zp.c(localztm.b()));
        }
      }
      else
      {
        paramzcjz.a("algorithmName", localztm.a);
        paramzcjz.a("hashValue", ze.a(localztm.b));
        paramzcjz.a("saltValue", ze.a(localztm.c));
        paramzcjz.a("spinCount", zauj.z(localztm.d));
      }
    }
    if (!localProtection.getAllowEditingContent()) {
      paramzcjz.a("sheet", "1");
    }
    if (!localProtection.getAllowEditingObject()) {
      paramzcjz.a("objects", "1");
    }
    if (!localProtection.getAllowEditingScenario()) {
      paramzcjz.a("scenarios", "1");
    }
    if (localProtection.getAllowFormattingCell()) {
      paramzcjz.a("formatCells", "0");
    }
    if (localProtection.getAllowFormattingColumn()) {
      paramzcjz.a("formatColumns", "0");
    }
    if (localProtection.getAllowFormattingRow()) {
      paramzcjz.a("formatRows", "0");
    }
    if (localProtection.getAllowInsertingColumn()) {
      paramzcjz.a("insertColumns", "0");
    }
    if (localProtection.getAllowInsertingRow()) {
      paramzcjz.a("insertRows", "0");
    }
    if (localProtection.getAllowInsertingHyperlink()) {
      paramzcjz.a("insertHyperlinks", "0");
    }
    if (localProtection.getAllowDeletingColumn()) {
      paramzcjz.a("deleteColumns", "0");
    }
    if (localProtection.getAllowDeletingRow()) {
      paramzcjz.a("deleteRows", "0");
    }
    if (!localProtection.getAllowSelectingLockedCell()) {
      paramzcjz.a("selectLockedCells", "1");
    }
    if (localProtection.getAllowSorting()) {
      paramzcjz.a("sort", "0");
    }
    if (localProtection.getAllowFiltering()) {
      paramzcjz.a("autoFilter", "0");
    }
    if (localProtection.getAllowUsingPivotTable()) {
      paramzcjz.a("pivotTables", "0");
    }
    if (!localProtection.getAllowSelectingUnlockedCell()) {
      paramzcjz.a("selectUnlockedCells", "1");
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, DataSorter paramDataSorter)
    throws Exception
  {
    paramzcjz.b("sortState");
    if (paramDataSorter.getCaseSensitive()) {
      paramzcjz.a("caseSensitive", "1");
    }
    if (paramDataSorter.getSortLeftToRight()) {
      paramzcjz.a("columnSort", "1");
    }
    CellArea localCellArea1 = paramDataSorter.b();
    paramzcjz.a("ref", zauj.a(localCellArea1));
    if ((paramDataSorter.b != null) && (!"".equals(paramDataSorter.b))) {
      paramzcjz.a("sortMethod", paramDataSorter.b);
    }
    Iterator localIterator = paramDataSorter.a().iterator();
    while (localIterator.hasNext())
    {
      zrr localzrr = (zrr)localIterator.next();
      CellArea localCellArea2 = new CellArea();
      if (paramDataSorter.getSortLeftToRight())
      {
        localCellArea2.StartRow = localzrr.c();
        localCellArea2.EndRow = localzrr.c();
        localCellArea2.StartColumn = localCellArea1.StartColumn;
        localCellArea2.EndColumn = localCellArea1.EndColumn;
      }
      else
      {
        localCellArea2.StartRow = localCellArea1.StartRow;
        localCellArea2.EndRow = localCellArea1.EndRow;
        localCellArea2.StartColumn = localzrr.c();
        localCellArea2.EndColumn = localzrr.c();
      }
      a(paramzcjz, localzrr, localCellArea2);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zrr paramzrr, CellArea paramCellArea)
    throws Exception
  {
    paramzcjz.b("sortCondition");
    if (paramzrr.b() == 1) {
      paramzcjz.a("descending", "1");
    }
    switch (paramzrr.d())
    {
    case 0: 
      if ((paramzrr.g() != null) && (!"".equals(paramzrr.g()))) {
        paramzcjz.a("customList", paramzrr.g());
      } else {
        paramzcjz.a("sortBy", "value");
      }
      break;
    case 1: 
      paramzcjz.a("sortBy", "cellColor");
      if (paramzrr.e() != -1) {
        paramzcjz.a("dxfId", zauj.z(paramzrr.e()));
      }
      break;
    case 2: 
      paramzcjz.a("sortBy", "fontColor");
      if (paramzrr.e() != -1) {
        paramzcjz.a("dxfId", zauj.z(paramzrr.e()));
      }
      break;
    case 3: 
      paramzcjz.a("sortBy", "icon");
      paramzcjz.a("iconSet", zauj.T(paramzrr.h()));
      if (paramzrr.i() != -1) {
        paramzcjz.a("iconId", zauj.z(paramzrr.i()));
      }
      break;
    }
    paramzcjz.a("ref", zauj.a(paramCellArea));
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, AutoFilter paramAutoFilter, boolean paramBoolean)
    throws Exception
  {
    paramzcjz.b("autoFilter");
    paramzcjz.a("ref", paramAutoFilter.getRange());
    paramAutoFilter.d();
    FilterColumnCollection localFilterColumnCollection = paramAutoFilter.c;
    if ((localFilterColumnCollection != null) && (localFilterColumnCollection.getCount() > 0)) {
      for (int i1 = 0; i1 < localFilterColumnCollection.getCount(); i1++)
      {
        FilterColumn localFilterColumn = localFilterColumnCollection.getByIndex(i1);
        a(paramzcjz, localFilterColumn);
      }
    }
    DataSorter localDataSorter = paramAutoFilter.c();
    if ((paramBoolean) && (localDataSorter != null) && (localDataSorter.a().size() > 0)) {
      a(paramzcjz, localDataSorter);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, FilterColumn paramFilterColumn)
    throws Exception
  {
    paramzcjz.b("filterColumn");
    paramzcjz.a("colId", zauj.z(paramFilterColumn.getFieldIndex()));
    if (paramFilterColumn.a()) {
      paramzcjz.a("hiddenButton", "1");
    }
    if (!paramFilterColumn.b()) {
      paramzcjz.a("showButton", "0");
    }
    if (paramFilterColumn.getFilterType() == 6)
    {
      paramzcjz.b();
      return;
    }
    Object localObject1;
    int i1;
    Object localObject2;
    Object localObject3;
    switch (paramFilterColumn.getFilterType())
    {
    case 5: 
      localObject1 = (Top10Filter)paramFilterColumn.getFilter();
      paramzcjz.b("top10");
      if (!((Top10Filter)localObject1).isTop()) {
        paramzcjz.a("top", "0");
      }
      if (((Top10Filter)localObject1).isPercent()) {
        paramzcjz.a("percent", "1");
      }
      paramzcjz.a("val", zauj.z(((Top10Filter)localObject1).getItems()));
      if (((Top10Filter)localObject1).getCriteria() != null) {
        paramzcjz.a("filterVal", AutoFilter.b(((Top10Filter)localObject1).getCriteria()));
      }
      paramzcjz.b();
      break;
    case 3: 
      localObject1 = (MultipleFilterCollection)paramFilterColumn.getFilter();
      paramzcjz.b("filters");
      if (((MultipleFilterCollection)localObject1).getMatchBlank()) {
        paramzcjz.a("blank", "1");
      }
      if (((MultipleFilterCollection)localObject1).a != null) {
        paramzcjz.a("calendarType", ((MultipleFilterCollection)localObject1).a);
      }
      for (i1 = 0; i1 < ((MultipleFilterCollection)localObject1).getCount(); i1++)
      {
        localObject2 = ((MultipleFilterCollection)localObject1).get(i1);
        if ((localObject2 instanceof DateTimeGroupItem))
        {
          localObject3 = (DateTimeGroupItem)localObject2;
          paramzcjz.b("dateGroupItem");
          paramzcjz.a("dateTimeGrouping", zauj.aj(((DateTimeGroupItem)localObject3).getDateTimeGroupingType()));
          switch (((DateTimeGroupItem)localObject3).getDateTimeGroupingType())
          {
          case 5: 
            paramzcjz.a("year", zauj.z(((DateTimeGroupItem)localObject3).getYear()));
            break;
          case 3: 
            paramzcjz.a("year", zauj.z(((DateTimeGroupItem)localObject3).getYear()));
            paramzcjz.a("month", zauj.z(((DateTimeGroupItem)localObject3).getMonth()));
            break;
          case 0: 
            paramzcjz.a("year", zauj.z(((DateTimeGroupItem)localObject3).getYear()));
            paramzcjz.a("month", zauj.z(((DateTimeGroupItem)localObject3).getMonth()));
            paramzcjz.a("day", zauj.z(((DateTimeGroupItem)localObject3).getDay()));
            break;
          case 1: 
            paramzcjz.a("year", zauj.z(((DateTimeGroupItem)localObject3).getYear()));
            paramzcjz.a("month", zauj.z(((DateTimeGroupItem)localObject3).getMonth()));
            paramzcjz.a("day", zauj.z(((DateTimeGroupItem)localObject3).getDay()));
            paramzcjz.a("hour", zauj.z(((DateTimeGroupItem)localObject3).getHour()));
            break;
          case 2: 
            paramzcjz.a("year", zauj.z(((DateTimeGroupItem)localObject3).getYear()));
            paramzcjz.a("month", zauj.z(((DateTimeGroupItem)localObject3).getMonth()));
            paramzcjz.a("day", zauj.z(((DateTimeGroupItem)localObject3).getDay()));
            paramzcjz.a("hour", zauj.z(((DateTimeGroupItem)localObject3).getHour()));
            paramzcjz.a("minute", zauj.z(((DateTimeGroupItem)localObject3).getMinute()));
            break;
          case 4: 
            paramzcjz.a("year", zauj.z(((DateTimeGroupItem)localObject3).getYear()));
            paramzcjz.a("month", zauj.z(((DateTimeGroupItem)localObject3).getMonth()));
            paramzcjz.a("day", zauj.z(((DateTimeGroupItem)localObject3).getDay()));
            paramzcjz.a("hour", zauj.z(((DateTimeGroupItem)localObject3).getHour()));
            paramzcjz.a("minute", zauj.z(((DateTimeGroupItem)localObject3).getMinute()));
            paramzcjz.a("second", zauj.z(((DateTimeGroupItem)localObject3).getSecond()));
            break;
          }
          paramzcjz.b();
        }
        else
        {
          paramzcjz.b("filter");
          paramzcjz.a("val", AutoFilter.b(localObject2));
          paramzcjz.b();
        }
      }
      paramzcjz.b();
      break;
    case 0: 
      localObject1 = (ColorFilter)paramFilterColumn.getFilter();
      paramzcjz.b("colorFilter");
      paramzcjz.a("dxfId", zauj.z(((ColorFilter)localObject1).a()));
      paramzcjz.a("cellColor", ((ColorFilter)localObject1).getFilterByFillColor() ? "1" : "0");
      paramzcjz.b();
      break;
    case 1: 
      localObject1 = (CustomFilterCollection)paramFilterColumn.getFilter();
      paramzcjz.b("customFilters");
      if ((((CustomFilterCollection)localObject1).getAnd()) && (((CustomFilterCollection)localObject1).getCount() > 1)) {
        paramzcjz.a("and", "1");
      }
      for (i1 = 0; i1 < ((CustomFilterCollection)localObject1).getCount(); i1++)
      {
        localObject2 = ((CustomFilterCollection)localObject1).get(i1);
        paramzcjz.b("customFilter");
        localObject3 = zauj.am(((CustomFilter)localObject2).getFilterOperatorType());
        if (localObject3 != null) {
          paramzcjz.a("operator", (String)localObject3);
        }
        if (((CustomFilter)localObject2).getCriteria() != null) {
          paramzcjz.a("val", AutoFilter.b(((CustomFilter)localObject2).getCriteria()));
        } else {
          paramzcjz.a("val", " ");
        }
        paramzcjz.b();
      }
      paramzcjz.b();
      break;
    case 2: 
      localObject1 = (DynamicFilter)paramFilterColumn.getFilter();
      paramzcjz.b("dynamicFilter");
      paramzcjz.a("type", zauj.ai(((DynamicFilter)localObject1).getDynamicFilterType()));
      if (((DynamicFilter)localObject1).getValue() != null) {
        paramzcjz.a("val", AutoFilter.b(((DynamicFilter)localObject1).getValue()));
      }
      if (((DynamicFilter)localObject1).getMaxValue() != null) {
        paramzcjz.a("maxVal", AutoFilter.b(((DynamicFilter)localObject1).getMaxValue()));
      }
      paramzcjz.b();
      break;
    case 4: 
      localObject1 = (IconFilter)paramFilterColumn.getFilter();
      paramzcjz.b("iconFilter");
      if (((IconFilter)localObject1).getIconId() != -1) {
        paramzcjz.a("iconId", zauj.z(((IconFilter)localObject1).getIconId()));
      }
      paramzcjz.a("iconSet", zauj.T(((IconFilter)localObject1).getIconSetType()));
      paramzcjz.b();
      break;
    }
    paramzcjz.b();
  }
  
  private void o(zcjz paramzcjz)
    throws Exception
  {
    String str1 = null;
    if (this.d.p != null)
    {
      str1 = this.d.p;
      i1 = str1.length();
      if ((i1 > 0) && (Character.isDigit(str1.charAt(0))))
      {
        int i2 = 9;
        if (i1 + i2 > 31) {
          str1 = str1.substring(0, 0 + (31 - i2));
        }
      }
      else if (i1 > 31)
      {
        str1 = str1.substring(0, 31);
      }
    }
    int i1 = 0;
    if ((!this.d.getOutline().SummaryColumnRight) || (!this.d.getOutline().SummaryRowBelow)) {
      i1 = 1;
    }
    String str2 = null;
    if (this.d.k != null) {
      str2 = this.d.k.a;
    }
    String str3 = null;
    if (this.d.getTransitionEvaluation()) {
      str3 = "1";
    }
    String str4 = null;
    if (this.d.getTransitionEntry()) {
      str4 = "1";
    }
    if ((!this.d.getPageSetup().isPercentScale()) || (str1 != null) || (!this.d.o.b()) || (i1 != 0) || (str2 != null) || (str3 != null) || (str4 != null))
    {
      paramzcjz.b("sheetPr");
      if (str2 != null) {
        paramzcjz.a("published", str2);
      }
      if (str1 != null) {
        paramzcjz.a("codeName", str1);
      }
      if (str3 != null) {
        paramzcjz.a("transitionEvaluation", str3);
      }
      if (str4 != null) {
        paramzcjz.a("transitionEntry", str4);
      }
      if (!this.d.o.b()) {
        zvq.a(paramzcjz, this.d.o, "tabColor");
      }
      if (i1 != 0)
      {
        paramzcjz.b("outlinePr");
        if (!this.d.getOutline().SummaryRowBelow) {
          paramzcjz.a("summaryBelow", "0");
        }
        if (!this.d.getOutline().SummaryColumnRight) {
          paramzcjz.a("summaryRight", "0");
        }
        paramzcjz.b();
      }
      if (!this.d.getPageSetup().isPercentScale())
      {
        paramzcjz.b("pageSetUpPr");
        paramzcjz.a("fitToPage", "1");
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private void p(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList(this.d.getValidations().getCount());
    Iterator localIterator = this.d.getValidations().iterator();
    while (localIterator.hasNext())
    {
      Validation localValidation1 = (Validation)localIterator.next();
      if (localValidation1.getAreaList().size() > 0) {
        zf.a(localArrayList, localValidation1);
      }
    }
    int i1 = localArrayList.size();
    if (i1 == 0) {
      return;
    }
    int i2 = 100;
    paramzcjz.b("dataValidations");
    int i3 = 0;
    Validation localValidation2;
    for (int i4 = 0; i4 < i1; i4++)
    {
      localValidation2 = (Validation)localArrayList.get(i4);
      if (localValidation2.getAreaList().size() > i2) {
        i3 += localValidation2.getAreaList().size() / i2;
      }
      i3++;
    }
    paramzcjz.a("count", zauj.z(i3));
    for (i4 = 0; i4 < i1; i4++)
    {
      localValidation2 = (Validation)localArrayList.get(i4);
      if (localValidation2.getAreaList().size() > i2)
      {
        int i5 = localValidation2.getAreaList().size() / i2;
        for (int i6 = 0; i6 < i5; i6++) {
          a(localValidation2, i6 * i2, (i6 + 1) * i2, paramzcjz);
        }
        a(localValidation2, i5 * i2, localValidation2.getAreaList().size(), paramzcjz);
      }
      else
      {
        a(localValidation2, 0, localValidation2.getAreaList().size(), paramzcjz);
      }
    }
    paramzcjz.b();
  }
  
  private void a(Validation paramValidation, int paramInt1, int paramInt2, zcjz paramzcjz)
    throws Exception
  {
    if (paramInt1 >= paramInt2) {
      return;
    }
    paramzcjz.b("dataValidation");
    if (paramValidation.getAlertStyle() != 1) {
      if (paramValidation.getAlertStyle() == 0) {
        paramzcjz.a("errorStyle", "information");
      } else if (paramValidation.getAlertStyle() == 2) {
        paramzcjz.a("errorStyle", "warning");
      }
    }
    if (paramValidation.getType() != 0) {
      paramzcjz.a("type", zauj.e(paramValidation.getType()));
    }
    if ((paramValidation.getOperator() != 0) && (paramValidation.getOperator() != 6))
    {
      str1 = zauj.f(paramValidation.getOperator());
      paramzcjz.a("operator", str1);
    }
    if (paramValidation.getIgnoreBlank()) {
      paramzcjz.a("allowBlank", "1");
    }
    if ((paramValidation.getType() == 3) && (!paramValidation.getInCellDropDown())) {
      paramzcjz.a("showDropDown", "1");
    }
    if (paramValidation.getShowInput()) {
      paramzcjz.a("showInputMessage", "1");
    }
    if (paramValidation.getShowError()) {
      paramzcjz.a("showErrorMessage", "1");
    }
    if ((paramValidation.getInputTitle() != null) && (paramValidation.getInputTitle().length() > 0)) {
      paramzcjz.a("promptTitle", paramValidation.getInputTitle());
    }
    if ((paramValidation.getInputMessage() != null) && (paramValidation.getInputMessage().length() > 0)) {
      paramzcjz.a("prompt", paramValidation.getInputMessage());
    }
    if ((paramValidation.getErrorTitle() != null) && (paramValidation.getErrorTitle().length() > 0)) {
      paramzcjz.a("errorTitle", paramValidation.getErrorTitle());
    }
    if ((paramValidation.getErrorMessage() != null) && (paramValidation.getErrorMessage().length() > 0)) {
      paramzcjz.a("error", paramValidation.getErrorMessage());
    }
    if (paramValidation.c() != 0) {
      paramzcjz.a("imeMode", zauj.k(paramValidation.c()));
    }
    String str1 = zauj.b(paramValidation.getAreaList(), paramInt1, paramInt2);
    paramzcjz.a("sqref", str1);
    String str2 = paramValidation.getFormula1();
    int i1 = 0;
    Object localObject2;
    if ((str2 != null) && (str2.length() > 0))
    {
      Object localObject1;
      if (paramValidation.getType() == 3)
      {
        localObject1 = paramValidation.e();
        if ((((String)localObject1).indexOf(0) != -1) && (((String)localObject1).indexOf(',') != -1))
        {
          paramzcjz.b("mc:AlternateContent");
          paramzcjz.a("xmlns:x12ac", "http://schemas.microsoft.com/office/spreadsheetml/2011/1/ac");
          paramzcjz.a("xmlns:mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
          paramzcjz.b("mc:Choice");
          paramzcjz.a("Requires", "x12ac");
          paramzcjz.b("x12ac:list");
          localObject2 = ((String)localObject1).toCharArray();
          StringBuilder localStringBuilder = new StringBuilder();
          int i2 = 0;
          int i3 = 0;
          for (int i4 = 0; i4 < localObject2.length; i4++) {
            if (localObject2[i4] == 0)
            {
              if (i3 != 0) {
                localStringBuilder.append('"');
              }
              localStringBuilder.append((char[])localObject2, i2, i4 - i2);
              if (i3 != 0) {
                localStringBuilder.append('"');
              }
              localStringBuilder.append(",");
              i3 = 0;
              i2 = i4 + 1;
            }
            else if (localObject2[i4] == ',')
            {
              i3 = 1;
            }
            else if (i4 + 1 == localObject2.length)
            {
              if (i3 != 0) {
                localStringBuilder.append('"');
              }
              localStringBuilder.append((char[])localObject2, i2, i4 + 1 - i2);
              if (i3 != 0) {
                localStringBuilder.append('"');
              }
              i3 = 0;
              i2 = i4 + 1;
            }
          }
          paramzcjz.a(zs.a(localStringBuilder));
          paramzcjz.b();
          paramzcjz.b();
          i1 = 1;
        }
        if (str2.charAt(0) == '=') {
          str2 = str2.substring(1);
        } else if (str2.charAt(0) != '"') {
          str2 = "\"" + str2 + "\"";
        }
      }
      else if ((paramValidation.getType() == 4) || (paramValidation.getType() == 5))
      {
        if (str2.charAt(0) == '=') {
          str2 = str2.substring(1);
        }
        if (!zarb.b(str2)) {
          try
          {
            localObject1 = DateTime.a(str2);
            if (paramValidation.getType() == 5) {
              str2 = zauj.b(((DateTime)localObject1).f().c());
            } else {
              str2 = zauj.b(CellsHelper.getDoubleFromDateTime((DateTime)localObject1, this.c.getSettings().getDate1904()));
            }
          }
          catch (Exception localException1)
          {
            str2 = zauj.L(str2);
          }
        }
      }
      else
      {
        str2 = zauj.L(str2);
      }
      if (i1 != 0) {
        paramzcjz.b("mc:Fallback");
      }
      paramzcjz.b("formula1");
      paramzcjz.a(zauj.a(str2));
      paramzcjz.b();
      if (i1 != 0)
      {
        paramzcjz.b();
        paramzcjz.b();
      }
    }
    if (((paramValidation.getOperator() == 0) || (paramValidation.getOperator() == 7)) && (paramValidation.getFormula2() != null) && (paramValidation.getFormula2().length() > 0))
    {
      paramzcjz.b("formula2");
      String str3 = zauj.L(paramValidation.getFormula2());
      if (((paramValidation.getType() == 4) || (paramValidation.getType() == 5)) && (!zarb.b(str3))) {
        try
        {
          localObject2 = DateTime.a(str3);
          if (paramValidation.getType() == 5) {
            str3 = zauj.b(((DateTime)localObject2).f().c());
          } else {
            str3 = zauj.b(CellsHelper.getDoubleFromDateTime((DateTime)localObject2, this.c.getSettings().getDate1904()));
          }
        }
        catch (Exception localException2)
        {
          str3 = zauj.L(str3);
        }
      }
      paramzcjz.a(zauj.a(str3));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, PageSetup paramPageSetup)
    throws Exception
  {
    paramzcjz.b("pageMargins");
    paramzcjz.a("left", zauj.b(paramPageSetup.getLeftMarginInch()));
    paramzcjz.a("right", zauj.b(paramPageSetup.getRightMarginInch()));
    paramzcjz.a("top", zauj.b(paramPageSetup.getTopMarginInch()));
    paramzcjz.a("bottom", zauj.b(paramPageSetup.getBottomMarginInch()));
    paramzcjz.a("header", zauj.b(paramPageSetup.getHeaderMarginInch()));
    paramzcjz.a("footer", zauj.b(paramPageSetup.getFooterMarginInch()));
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, PageSetup paramPageSetup)
    throws Exception
  {
    if ((paramPageSetup.getPrintGridlines()) || (paramPageSetup.getPrintHeadings()) || (paramPageSetup.getCenterHorizontally()) || (paramPageSetup.getCenterVertically()))
    {
      paramzcjz.b("printOptions");
      if (paramPageSetup.getPrintGridlines()) {
        paramzcjz.a("gridLines", "1");
      }
      if (paramPageSetup.getPrintHeadings()) {
        paramzcjz.a("headings", "1");
      }
      if (paramPageSetup.getCenterHorizontally()) {
        paramzcjz.a("horizontalCentered", "1");
      }
      if (paramPageSetup.getCenterVertically()) {
        paramzcjz.a("verticalCentered", "1");
      }
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, PageSetup paramPageSetup, String paramString)
    throws Exception
  {
    paramzcjz.b("pageSetup");
    if (paramPageSetup.getBlackAndWhite()) {
      paramzcjz.a("blackAndWhite", "1");
    }
    if (paramPageSetup.getPrintComments() != 1) {
      paramzcjz.a("cellComments", zauj.b(paramPageSetup.getPrintComments()));
    }
    if (paramPageSetup.getPrintDraft()) {
      paramzcjz.a("draft", "1");
    }
    if (paramPageSetup.getPrintErrors() != 2) {
      paramzcjz.a("errors", zauj.c(paramPageSetup.getPrintErrors()));
    }
    if (!paramPageSetup.isAutoFirstPageNumber())
    {
      paramzcjz.a("firstPageNumber", zauj.z(paramPageSetup.getFirstPageNumber()));
      paramzcjz.a("useFirstPageNumber", "1");
    }
    if (paramPageSetup.getFitToPagesTall() != 1) {
      paramzcjz.a("fitToHeight", zauj.z(paramPageSetup.getFitToPagesTall()));
    }
    if (paramPageSetup.getFitToPagesWide() != 1) {
      paramzcjz.a("fitToWidth", zauj.z(paramPageSetup.getFitToPagesWide()));
    }
    if ((paramPageSetup.f() > 0) && (paramPageSetup.f() != 600) && (!paramPageSetup.l())) {
      paramzcjz.a("horizontalDpi", zauj.z(paramPageSetup.f()));
    }
    if ((paramPageSetup.g() > 0) && (paramPageSetup.g() != 600) && (!paramPageSetup.m())) {
      paramzcjz.a("verticalDpi", zauj.z(paramPageSetup.g()));
    }
    paramzcjz.a("orientation", zauj.a(paramPageSetup.getOrientation()));
    if (paramPageSetup.getOrder() != 0) {
      paramzcjz.a("pageOrder", zauj.d(paramPageSetup.getOrder()));
    }
    if (!paramPageSetup.k()) {
      paramzcjz.a("paperSize", zauj.z(paramPageSetup.a()));
    }
    if (paramPageSetup.getPrintCopies() > 1) {
      paramzcjz.a("copies", zauj.z(paramPageSetup.getPrintCopies()));
    }
    if (paramPageSetup.getZoom() != 100) {
      paramzcjz.a("scale", zauj.z(paramPageSetup.getZoom()));
    }
    if (paramString != null) {
      paramzcjz.a("r:id", paramString);
    }
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz, PageSetup paramPageSetup)
    throws Exception
  {
    String str1 = paramPageSetup.a(true, 2);
    String str2 = paramPageSetup.a(false, 2);
    String str3 = paramPageSetup.a(true, 0);
    String str4 = paramPageSetup.a(false, 0);
    String str5 = paramPageSetup.a(true, 1);
    String str6 = paramPageSetup.a(false, 1);
    if ((str1.length() > 0) || (str2.length() > 0) || (str3.length() > 0) || (str4.length() > 0) || (str5.length() > 0) || (str6.length() > 0) || (paramPageSetup.isHFDiffOddEven()) || (paramPageSetup.isHFDiffFirst()) || (!paramPageSetup.isHFScaleWithDoc()) || (!paramPageSetup.isHFAlignMargins()))
    {
      paramzcjz.b("headerFooter");
      if (paramPageSetup.isHFDiffOddEven()) {
        paramzcjz.a("differentOddEven", "1");
      }
      if (paramPageSetup.isHFDiffFirst()) {
        paramzcjz.a("differentFirst", "1");
      }
      if (!paramPageSetup.isHFScaleWithDoc()) {
        paramzcjz.a("scaleWithDoc", "0");
      }
      if (!paramPageSetup.isHFAlignMargins()) {
        paramzcjz.a("alignWithMargins", "0");
      }
      if (str5.length() > 0) {
        a(paramzcjz, "oddHeader", str5);
      }
      if (str6.length() > 0) {
        a(paramzcjz, "oddFooter", str6);
      }
      if (str3.length() > 0) {
        a(paramzcjz, "evenHeader", str3);
      }
      if (str4.length() > 0) {
        a(paramzcjz, "evenFooter", str4);
      }
      if (str1.length() > 0) {
        a(paramzcjz, "firstHeader", str1);
      }
      if (str2.length() > 0) {
        a(paramzcjz, "firstFooter", str2);
      }
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.b(paramString1);
    if ((paramString2.startsWith(" ")) || (paramString2.endsWith(" ")) || (paramString2.startsWith("\n")) || (paramString2.endsWith("\n"))) {
      paramzcjz.a("xml:space", null, "preserve");
    }
    paramzcjz.a(paramString2);
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, HorizontalPageBreakCollection paramHorizontalPageBreakCollection)
    throws Exception
  {
    if ((paramHorizontalPageBreakCollection != null) && (paramHorizontalPageBreakCollection.getCount() > 0))
    {
      paramzcjz.b("rowBreaks");
      int i1 = paramHorizontalPageBreakCollection.getCount();
      paramzcjz.a("count", zauj.z(i1));
      paramzcjz.a("manualBreakCount", zauj.z(i1));
      for (int i2 = 0; i2 < i1; i2++)
      {
        HorizontalPageBreak localHorizontalPageBreak = paramHorizontalPageBreakCollection.get(i2);
        if (localHorizontalPageBreak != null)
        {
          paramzcjz.b("brk");
          paramzcjz.a("id", zauj.z(localHorizontalPageBreak.getRow()));
          if (localHorizontalPageBreak.getStartColumn() != 0) {
            paramzcjz.a("min", zauj.z(localHorizontalPageBreak.getStartColumn()));
          }
          paramzcjz.a("max", zauj.z(localHorizontalPageBreak.getEndColumn()));
          paramzcjz.a("man", "1");
          paramzcjz.b();
        }
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, VerticalPageBreakCollection paramVerticalPageBreakCollection)
    throws Exception
  {
    if ((paramVerticalPageBreakCollection != null) && (paramVerticalPageBreakCollection.getCount() > 0))
    {
      paramzcjz.b("colBreaks");
      int i1 = paramVerticalPageBreakCollection.getCount();
      paramzcjz.a("count", zauj.z(i1));
      paramzcjz.a("manualBreakCount", zauj.z(i1));
      for (int i2 = 0; i2 < i1; i2++)
      {
        VerticalPageBreak localVerticalPageBreak = paramVerticalPageBreakCollection.get(i2);
        if (localVerticalPageBreak != null)
        {
          paramzcjz.b("brk");
          paramzcjz.a("id", zauj.z(localVerticalPageBreak.getColumn()));
          if (localVerticalPageBreak.getStartRow() != 0) {
            paramzcjz.a("min", zauj.z(localVerticalPageBreak.getStartRow()));
          }
          paramzcjz.a("max", zauj.z(localVerticalPageBreak.getEndRow()));
          paramzcjz.a("man", "1");
          paramzcjz.b();
        }
      }
      paramzcjz.b();
    }
  }
  
  private void q(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("dimension");
    int i1 = this.e.e(0);
    if ((i1 < 0) || (this.i.length < 1))
    {
      paramzcjz.a("ref", "A1:A1");
    }
    else
    {
      String str = CellsHelper.a(this.e.getMinRow(), this.e.getMinColumn(), i1, this.i.length - 1);
      paramzcjz.a("ref", str);
    }
    paramzcjz.b();
  }
  
  private void r(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("sheetViews");
    paramzcjz.b("sheetView");
    if ((this.c.getWorksheets().h != null) && (this.c.getWorksheets().h.a)) {
      paramzcjz.a("windowProtection", "1");
    }
    if (this.d.getShowFormulas()) {
      paramzcjz.a("showFormulas", "1");
    }
    if (!this.d.isGridlinesVisible()) {
      paramzcjz.a("showGridLines", "0");
    }
    if (!this.d.isRowColumnHeadersVisible()) {
      paramzcjz.a("showRowColHeaders", "0");
    }
    if (!this.d.getDisplayZeros()) {
      paramzcjz.a("showZeros", "0");
    }
    if (this.d.getDisplayRightToLeft()) {
      paramzcjz.a("rightToLeft", "1");
    }
    if (this.d.isSelected()) {
      paramzcjz.a("tabSelected", "1");
    }
    if (!this.d.isOutlineShown()) {
      paramzcjz.a("showOutlineSymbols", "0");
    }
    int i1 = this.d.B();
    if (i1 < 64) {
      paramzcjz.a("defaultGridColor", "0");
    }
    String str1 = zauj.as(this.d.getViewType());
    if (str1 != null) {
      paramzcjz.a("view", str1);
    }
    if ((this.d.getViewType() == 2) && (!this.d.isRulerVisible())) {
      paramzcjz.a("showRuler", "0");
    }
    if (this.d.getZoom() != 100) {
      paramzcjz.a("zoomScale", zauj.z(this.d.getZoom()));
    }
    if ((this.d.y()[0] != 100) || (this.d.getViewType() != 0)) {
      paramzcjz.a("zoomScaleNormal", zauj.z(this.d.y()[0]));
    }
    if (this.d.y()[1] != 60) {
      paramzcjz.a("zoomScaleSheetLayoutView", zauj.z(this.d.y()[1]));
    }
    if (this.d.y()[2] != 100) {
      paramzcjz.a("zoomScalePageLayoutView", zauj.z(this.d.y()[2]));
    }
    if (i1 < 64) {
      paramzcjz.a("colorId", zauj.z(i1));
    }
    paramzcjz.a("workbookViewId", "0");
    String str2 = CellsHelper.cellIndexToName(this.d.getFirstVisibleRow(), this.d.getFirstVisibleColumn());
    paramzcjz.a("topLeftCell", str2);
    zro localzro = zro.b(this.d);
    a(paramzcjz, localzro);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zro paramzro)
    throws Exception
  {
    if (paramzro.a != null)
    {
      localObject = paramzro.a;
      paramzcjz.b("pane");
      if (((zrp)localObject).b != 0.0D) {
        paramzcjz.a("xSplit", zauj.b(((zrp)localObject).b));
      }
      if (((zrp)localObject).c != 0.0D) {
        paramzcjz.a("ySplit", zauj.b(((zrp)localObject).c));
      }
      if (((zrp)localObject).d != null) {
        paramzcjz.a("topLeftCell", ((zrp)localObject).d);
      }
      if (((zrp)localObject).e != null) {
        paramzcjz.a("activePane", ((zrp)localObject).e);
      }
      paramzcjz.a("state", ((zrp)localObject).a);
      paramzcjz.b();
    }
    Object localObject = paramzro.b;
    for (int i1 = 0; i1 < ((ArrayList)localObject).size(); i1++)
    {
      zrq localzrq = (zrq)((ArrayList)localObject).get(i1);
      paramzcjz.b("selection");
      if (localzrq.a != null) {
        paramzcjz.a("pane", localzrq.a);
      }
      if (localzrq.b != null) {
        paramzcjz.a("activeCell", localzrq.b);
      }
      if (localzrq.c != 0) {
        paramzcjz.a("activeCellId", zauj.z(localzrq.c));
      }
      if ((localzrq.d != null) && (localzrq.d.length() > 0)) {
        paramzcjz.a("sqref", localzrq.d);
      }
      paramzcjz.b();
    }
  }
  
  private void s(zcjz paramzcjz)
    throws Exception
  {
    if (this.e.o().getCount() == 0) {
      return;
    }
    paramzcjz.b("mergeCells");
    zapd localzapd = this.e.o();
    paramzcjz.a("count", zauj.z(localzapd.getCount()));
    ArrayList localArrayList = new ArrayList(localzapd.getCount());
    for (int i1 = 0; i1 < localzapd.getCount(); i1++)
    {
      CellArea localCellArea = localzapd.a(i1);
      paramzcjz.b("mergeCell");
      paramzcjz.a("ref", zauj.a(localCellArea));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zbdx paramzbdx, int paramInt, String paramString, zcjz paramzcjz)
    throws Exception
  {
    if (paramString != null) {
      paramzcjz.a("spans", paramString);
    }
    if ((paramInt > -1) && (this.h.f.containsKey(Integer.valueOf(paramInt))))
    {
      String str = (String)this.h.f.get(Integer.valueOf(paramInt));
      paramzcjz.a("s", str);
      paramzcjz.a("customFormat", "1");
    }
    double d1 = paramzbdx.e / 20.0D;
    paramzcjz.a("ht", zauj.b(d1));
    if (!paramzbdx.c()) {
      paramzcjz.a("customHeight", "1");
    }
    if (paramzbdx.b()) {
      paramzcjz.a("hidden", "1");
    }
    byte b1 = paramzbdx.e();
    if (b1 != 0) {
      paramzcjz.a("outlineLevel", zauj.a(b1));
    }
    if (paramzbdx.a()) {
      paramzcjz.a("collapsed", "1");
    }
    if (paramzbdx.f()) {
      paramzcjz.a("thickTop", "1");
    }
    if (paramzbdx.g()) {
      paramzcjz.a("thickBot", "1");
    }
  }
  
  private void t(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("sheetData");
    Object localObject1 = null;
    zhx localzhx = null;
    int i1 = 0;
    if (this.g.e.v != null)
    {
      localObject1 = this.g.e.v.a(this.d);
      if (localObject1 == null)
      {
        localObject1 = new zhy(this.d);
      }
      else
      {
        i1 = 1;
        localzhx = (zhx)localObject1;
      }
    }
    else
    {
      localObject1 = new zhy(this.d);
    }
    String str1 = null;
    zt localzt = null;
    zgs localzgs = null;
    int i2 = -2;
    zbdx localzbdx1 = new zbdx();
    for (;;)
    {
      localzt = ((zahd)localObject1).b();
      if (localzt == null) {
        break;
      }
      zbdx localzbdx2 = localzt.a(localzbdx1, 15);
      i2 = -2;
      str1 = zauj.z(localzt.i() + 1);
      paramzcjz.b("row");
      paramzcjz.a("r", str1);
      int i4;
      int i3;
      if (localzbdx2.d())
      {
        i4 = localzt.j();
        i3 = 1;
      }
      else
      {
        i4 = 15;
        i3 = 0;
      }
      int i5;
      int i6;
      int i10;
      if ((i1 == 0) && (localzt.a() > 0))
      {
        i5 = localzt.a(localzt.a(-1, false));
        i6 = localzt.a(localzt.a(-1, true));
        int i7 = localzt.a();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(i5 + 1);
        localStringBuilder.append(':');
        if (i6 - i5 > i7 + 32)
        {
          zaiv localzaiv = localzt.b();
          localzaiv.a();
          for (;;)
          {
            i10 = localzaiv.a();
            if (i10 < 0) {
              break;
            }
            i6 = localzt.a(i10);
            if (i6 - i5 > 16)
            {
              localStringBuilder.append(i5 + 1);
              localStringBuilder.append(' ');
              localStringBuilder.append(i6 + 1);
              localStringBuilder.append(':');
            }
            i5 = i6;
          }
        }
        localStringBuilder.append(i6 + 1);
        a(localzbdx2, i3 != 0 ? i4 : -1, zs.a(localStringBuilder), paramzcjz);
      }
      else
      {
        a(localzbdx2, i3 != 0 ? i4 : -1, null, paramzcjz);
      }
      for (;;)
      {
        localzgs = ((zahd)localObject1).c();
        if (localzgs == null) {
          break;
        }
        i5 = localzgs.b;
        if (localzgs.c == 0)
        {
          if (i5 == -1) {
            continue;
          }
          if ((i5 == 15) && (i3 == 0))
          {
            i6 = this.e.c.a(localzgs.a);
            if ((i6 == -1) || (i6 == 15)) {
              continue;
            }
          }
        }
        if (i5 == -1) {
          if (i3 != 0)
          {
            i5 = i4;
          }
          else
          {
            i5 = this.e.c.a(localzgs.a);
            if (i5 < 0) {
              i5 = 15;
            }
          }
        }
        paramzcjz.b("c");
        if ((this.j) || (localzgs.a != i2 + 1))
        {
          localObject2 = a(localzgs.a) + str1;
          paramzcjz.a("r", (String)localObject2);
        }
        if ((i5 != -1) && (i5 != 15))
        {
          localObject2 = this.h.f.get(Integer.valueOf(i5));
          if (localObject2 != null)
          {
            str2 = (String)localObject2;
            if (!"0".equals(str2)) {
              paramzcjz.a("s", str2);
            }
          }
        }
        Object localObject2 = null;
        String str2 = null;
        int i8 = 0;
        int i9 = 0;
        i10 = localzgs.c;
        Object localObject3 = localzgs.d;
        Object localObject4;
        switch (i10)
        {
        case 4: 
          localObject4 = (zbbj)localzgs.d;
          i8 = (localzgs.e) && (((zbbj)localObject4).g()) ? 1 : 0;
          localObject2 = "s";
          int i11 = ((zbbj)localObject4).e;
          if (i11 > -1)
          {
            str2 = zauj.z(i11);
          }
          else
          {
            localObject2 = "str";
            str2 = zauj.a(((zbbj)localObject4).c);
          }
          break;
        case 5: 
          localObject4 = (zaai)localzgs.d;
          if (((zaai)localObject4).c == 4)
          {
            localObject2 = "str";
            str2 = zauj.a((String)((zaai)localObject4).d);
            if ((!zw.b(str2)) && ((str2.startsWith(" ")) || (str2.endsWith(" ")))) {
              i9 = 1;
            }
          }
          else
          {
            i10 = ((zaai)localObject4).c;
            localObject3 = ((zaai)localObject4).d;
          }
          break;
        }
        switch (i10)
        {
        case 1: 
        case 6: 
          localObject2 = "n";
          str2 = localzgs.a(true, this.c.getSettings());
          break;
        case 2: 
          localObject2 = "b";
          str2 = ((Boolean)localObject3).booleanValue() ? "1" : "0";
          break;
        case 3: 
          localObject2 = "e";
          str2 = zgs.a(localObject3);
          if (str2 == null) {
            str2 = "#VALUE!";
          }
          break;
        }
        if ((localObject2 != null) && (!"n".equals(localObject2))) {
          paramzcjz.a("t", (String)localObject2);
        }
        if (i8 != 0) {
          paramzcjz.a("ph", "1");
        }
        if (localzgs.c == 5)
        {
          localObject4 = ((zahd)localObject1).a();
          zaai localzaai = (zaai)localzgs.d;
          if (localzaai.d())
          {
            if (localzaai.k()) {
              a(paramzcjz, (Cell)localObject4, false, -1);
            }
          }
          else
          {
            Object localObject5;
            if (localzaai.b(this.e))
            {
              if (localzaai.l())
              {
                int i12 = zf.a(this.k, Long.valueOf(a(localzt.i(), localzgs.a)));
                a(paramzcjz, (Cell)localObject4, true, i12);
              }
              else
              {
                localObject5 = ((Cell)localObject4).C();
                int i13 = this.k.indexOf(Long.valueOf(a(((Cell)localObject5).getRow(), ((Cell)localObject5).getColumn())));
                if (i13 != -1)
                {
                  paramzcjz.b("f");
                  paramzcjz.a("t", "shared");
                  if (((Cell)localObject4).a((Cell)localObject5)) {
                    paramzcjz.a("ca", "1");
                  }
                  paramzcjz.a("si", zauj.z(i13));
                  paramzcjz.b();
                }
              }
            }
            else
            {
              String str3;
              if (((Cell)localObject4).B())
              {
                localObject5 = ((Cell)localObject4).G();
                if (localObject5 != null)
                {
                  paramzcjz.b("f");
                  str3 = zauj.a(((zacb)localObject5).a);
                  paramzcjz.a("t", "dataTable");
                  paramzcjz.a("ref", str3);
                  paramzcjz.a("dt2D", ((zacb)localObject5).d() ? "1" : "0");
                  paramzcjz.a("dtr", ((zacb)localObject5).e() ? "1" : "0");
                  if (((zacb)localObject5).d())
                  {
                    paramzcjz.a("r1", ((zacb)localObject5).g());
                    paramzcjz.a("r2", ((zacb)localObject5).h());
                  }
                  else if (((zacb)localObject5).e())
                  {
                    paramzcjz.a("r1", ((zacb)localObject5).g());
                  }
                  else
                  {
                    paramzcjz.a("r1", ((zacb)localObject5).h());
                  }
                  if (((zacb)localObject5).b()) {
                    paramzcjz.a("del1", "1");
                  }
                  if (((zacb)localObject5).c()) {
                    paramzcjz.a("del2", "1");
                  }
                  paramzcjz.b();
                }
              }
              else
              {
                localObject5 = ((Cell)localObject4).u();
                if ((localObject5 != null) && (((String)localObject5).length() > 0))
                {
                  paramzcjz.b("f");
                  if (((Cell)localObject4).a(null)) {
                    paramzcjz.a("ca", "1");
                  }
                  str3 = zauj.L((String)localObject5);
                  paramzcjz.a(str3);
                  paramzcjz.b();
                }
              }
            }
          }
        }
        if (str2 != null) {
          if (str2.length() > 0)
          {
            paramzcjz.b("v");
            if (i9 != 0) {
              paramzcjz.a("xml:space", "preserve");
            }
            paramzcjz.a(str2);
            paramzcjz.b();
          }
          else
          {
            paramzcjz.b("v", null);
          }
        }
        paramzcjz.b();
        i2 = localzgs.a;
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private long a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 16 | paramInt2;
  }
  
  private void a(zcjz paramzcjz, Cell paramCell, boolean paramBoolean, int paramInt)
    throws Exception
  {
    String str1 = paramCell.u();
    paramzcjz.b("f");
    if (paramCell.a(null)) {
      paramzcjz.a("ca", "1");
    }
    if (paramBoolean)
    {
      paramzcjz.a("t", "shared");
      paramzcjz.a("si", zauj.z(paramInt));
    }
    else
    {
      paramzcjz.a("t", "array");
    }
    String str2 = zauj.a(paramCell.F().a());
    paramzcjz.a("ref", str2);
    String str3 = zauj.L(str1);
    paramzcjz.a(str3);
    paramzcjz.b();
  }
  
  private String a(int paramInt)
  {
    if (paramInt < this.i.length)
    {
      String str = this.i[paramInt];
      if (str == null)
      {
        str = CellsHelper.columnIndexToName(paramInt);
        this.i[paramInt] = str;
      }
      return str;
    }
    return CellsHelper.columnIndexToName(paramInt);
  }
  
  private void u(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("sheetFormatPr");
    if (this.e.getColumns().b)
    {
      double d1 = 0.0D;
      if (this.e.getColumns().b() != 0.0D) {
        d1 = this.e.getColumns().b() + 5.0D / this.c.getWorksheets().U();
      }
      paramzcjz.a("defaultColWidth", zauj.b(d1));
    }
    paramzcjz.a("defaultRowHeight", zauj.b(this.e.getStandardHeight()));
    if ((this.g.e.b.g != null) && (this.g.e.b.g[this.d.getIndex()] != 0)) {
      paramzcjz.a("thickTop", "1");
    }
    if ((this.g.e.b.h != null) && (this.g.e.b.h[this.d.getIndex()] != 0)) {
      paramzcjz.a("thickBottom", "1");
    }
    if (!this.e.isDefaultRowHeightMatched()) {
      paramzcjz.a("customHeight", "1");
    }
    if (this.e.isDefaultRowHidden()) {
      paramzcjz.a("zeroHeight", "1");
    }
    if (this.e.s() != 0) {
      paramzcjz.a("outlineLevelRow", zauj.a(this.e.s()));
    }
    if (this.e.r() != 0) {
      paramzcjz.a("outlineLevelCol", zauj.a(this.e.r()));
    }
    paramzcjz.b();
  }
  
  private void v(zcjz paramzcjz)
    throws Exception
  {
    ColumnCollection localColumnCollection = this.e.getColumns();
    if ((localColumnCollection.getCount() == 0) && ((localColumnCollection.a == null) || (!localColumnCollection.a.j()))) {
      return;
    }
    paramzcjz.b("cols");
    Object localObject = localColumnCollection.a;
    int i1 = 16383;
    if (localObject != null) {
      if (((Column)localObject).j())
      {
        Column localColumn1 = new Column(((Column)localObject).getIndex(), this.d, localColumnCollection.b(), (Column)localObject);
        localObject = localColumn1;
        i1 = localColumn1.getIndex();
      }
      else
      {
        localObject = null;
      }
    }
    int i2 = 0;
    for (int i3 = 0; i3 < localColumnCollection.getCount(); i3++)
    {
      Column localColumn2 = localColumnCollection.getColumnByIndex(i3);
      if ((localColumn2.getIndex() - i2 != 0) && (localObject != null) && (localColumn2.getIndex() > i1))
      {
        if (i2 < i1) {
          i2 = i1;
        }
        ((Column)localObject).a(i2);
        a(paramzcjz, (Column)localObject, localColumn2.getIndex() - i2 - 1);
      }
      int i4 = localColumn2.c();
      int i5 = 0;
      i3 += 1;
      while (i3 < localColumnCollection.getCount())
      {
        Column localColumn3 = localColumnCollection.getColumnByIndex(i3);
        if ((localColumn3.getIndex() == localColumn2.getIndex() + i5 + 1) && (localColumn2.b(localColumn3)))
        {
          i5++;
        }
        else
        {
          i3--;
          break;
        }
        i3++;
      }
      a(paramzcjz, localColumn2, i5);
      i2 = localColumn2.getIndex() + i5 + 1;
    }
    if ((localObject != null) && (i2 <= 16383))
    {
      if (i2 < i1) {
        i2 = i1;
      }
      ((Column)localObject).a(i2);
      a(paramzcjz, (Column)localObject, 16383 - i2);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Column paramColumn, int paramInt)
    throws Exception
  {
    paramzcjz.b("col");
    paramzcjz.a("min", zauj.z(paramColumn.getIndex() + 1));
    String str = null;
    int i1 = paramColumn.c();
    if ((i1 != 15) && (i1 != 4095) && (i1 != 0) && (this.h.f.containsKey(Integer.valueOf(i1)))) {
      str = (String)this.h.f.get(Integer.valueOf(i1));
    }
    int i2 = paramColumn.getIndex() + 1 + paramInt;
    paramzcjz.a("max", zauj.z(i2));
    double d1 = zlp.b(paramColumn.a, this.c.getWorksheets());
    double d2 = d1 / this.c.getWorksheets().U();
    paramzcjz.a("width", zauj.b(d2));
    if (str != null) {
      paramzcjz.a("style", str);
    }
    if (paramColumn.isHidden()) {
      paramzcjz.a("hidden", "1");
    } else if (paramColumn.h()) {
      paramzcjz.a("bestFit", "1");
    }
    if (!paramColumn.i()) {
      paramzcjz.a("customWidth", "1");
    }
    if (paramColumn.b() != 0) {
      paramzcjz.a("outlineLevel", zauj.a(paramColumn.b()));
    }
    if (paramColumn.g()) {
      paramzcjz.a("collapsed", "1");
    }
    paramzcjz.b();
  }
  
  private void w(zcjz paramzcjz)
    throws Exception
  {
    if ((this.g.f == null) || (this.g.f.size() == 0)) {
      return;
    }
    paramzcjz.b("hyperlinks");
    for (int i1 = 0; i1 < this.g.f.size(); i1++)
    {
      zpk localzpk = (zpk)this.g.f.get(i1);
      paramzcjz.b("hyperlink");
      paramzcjz.a("ref", zauj.a(localzpk.b.getArea()));
      if ((localzpk.a != null) && (localzpk.a.length() > 0)) {
        paramzcjz.a("r:id", null, localzpk.a);
      }
      if (localzpk.d == 2) {
        paramzcjz.a("location", localzpk.c);
      }
      if ((localzpk.b.getScreenTip() != null) && (localzpk.b.getScreenTip().length() > 0)) {
        paramzcjz.a("tooltip", localzpk.b.getScreenTip());
      }
      String str = localzpk.b.getTextToDisplay();
      if ((str != null) && (str.length() > 0) && (str.length() < 2084)) {
        paramzcjz.a("display", str);
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private int d()
  {
    int i1 = 1;
    Object localObject;
    int i3;
    for (int i2 = 0; i2 < this.d.getConditionalFormattings().getCount(); i2++)
    {
      localObject = this.d.getConditionalFormattings().get(i2);
      for (i3 = 0; i3 < ((FormatConditionCollection)localObject).getCount(); i3++) {
        i1++;
      }
    }
    if (this.d.b != null) {
      for (i2 = 0; i2 < this.d.b.getCount(); i2++)
      {
        localObject = this.d.b.get(i2);
        if (((PivotTable)localObject).aj != null) {
          for (i3 = 0; i3 < ((PivotTable)localObject).aj.getCount(); i3++) {
            i1++;
          }
        }
      }
    }
    return i1;
  }
  
  private void x(zcjz paramzcjz)
    throws Exception
  {
    if (this.d.getConditionalFormattings().getCount() == 0) {
      return;
    }
    this.n = d();
    for (int i1 = 0; i1 < this.d.getConditionalFormattings().getCount(); i1++)
    {
      FormatConditionCollection localFormatConditionCollection = this.d.getConditionalFormattings().get(i1);
      if ((localFormatConditionCollection.getCount() != 0) && (!localFormatConditionCollection.a(false))) {
        a(paramzcjz, localFormatConditionCollection, false);
      }
    }
  }
  
  private void a(zcjz paramzcjz, FormatConditionCollection paramFormatConditionCollection, boolean paramBoolean)
    throws Exception
  {
    String str;
    int i1;
    FormatCondition localFormatCondition;
    if (!paramBoolean)
    {
      paramzcjz.b("conditionalFormatting");
      if (paramFormatConditionCollection.d) {
        paramzcjz.a("pivot", "1");
      }
      if ((paramFormatConditionCollection.b != null) && (paramFormatConditionCollection.b.size() > 0))
      {
        this.m = zauj.b(paramFormatConditionCollection.b, 0, paramFormatConditionCollection.b.size());
        paramzcjz.a("sqref", this.m);
      }
      str = a(paramFormatConditionCollection);
      for (i1 = 0; i1 < paramFormatConditionCollection.getCount(); i1++)
      {
        localFormatCondition = paramFormatConditionCollection.get(i1);
        a(paramzcjz, localFormatCondition, str, this.n, paramBoolean);
        this.n -= 1;
      }
      paramzcjz.b();
    }
    else
    {
      if ((paramFormatConditionCollection.b != null) && (paramFormatConditionCollection.b.size() > 0)) {
        this.m = zauj.b(paramFormatConditionCollection.b, 0, paramFormatConditionCollection.b.size());
      }
      paramzcjz.b("x14:conditionalFormatting");
      paramzcjz.a("xmlns:xm", "http://schemas.microsoft.com/office/excel/2006/main");
      if (paramFormatConditionCollection.d) {
        paramzcjz.a("pivot", "1");
      }
      str = a(paramFormatConditionCollection);
      for (i1 = 0; i1 < paramFormatConditionCollection.getCount(); i1++)
      {
        localFormatCondition = paramFormatConditionCollection.get(i1);
        a(paramzcjz, localFormatCondition, str, this.n, paramBoolean);
        this.n -= 1;
      }
      paramzcjz.b("xm:sqref");
      paramzcjz.a(this.m);
      paramzcjz.b();
      paramzcjz.b();
    }
  }
  
  void b(zcjz paramzcjz)
    throws Exception
  {
    ConditionalFormattingCollection localConditionalFormattingCollection = this.d.getConditionalFormattings();
    if (localConditionalFormattingCollection.getCount() == 0) {
      return;
    }
    if (!localConditionalFormattingCollection.b()) {
      return;
    }
    paramzcjz.b("ext");
    paramzcjz.a("uri", "{78C0D931-6437-407d-A8EE-F0AAD7539E65}");
    paramzcjz.a("xmlns:x14", zaty.c);
    paramzcjz.b("x14:conditionalFormattings");
    this.n = d();
    Iterator localIterator = localConditionalFormattingCollection.iterator();
    while (localIterator.hasNext())
    {
      FormatConditionCollection localFormatConditionCollection = (FormatConditionCollection)localIterator.next();
      if (localFormatConditionCollection.a(true)) {
        a(paramzcjz, localFormatConditionCollection, true);
      }
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private String a(FormatCondition paramFormatCondition)
  {
    String str = null;
    if ((paramFormatCondition.getType() == 0) && (paramFormatCondition.b != 6)) {
      str = zauj.f(paramFormatCondition.b);
    } else if (paramFormatCondition.getType() == 8) {
      str = "containsText";
    } else if (paramFormatCondition.getType() == 9) {
      str = "notContains";
    } else if (paramFormatCondition.getType() == 10) {
      str = "beginsWith";
    } else if (paramFormatCondition.getType() == 11) {
      str = "endsWith";
    }
    return str;
  }
  
  private String a(FormatConditionCollection paramFormatConditionCollection)
  {
    int i1 = 16383;
    int i2 = 1048575;
    for (int i3 = 0; i3 < paramFormatConditionCollection.b.size(); i3++)
    {
      CellArea localCellArea = (CellArea)paramFormatConditionCollection.b.get(i3);
      if (localCellArea.StartRow < i2) {
        i2 = localCellArea.StartRow;
      }
      if (localCellArea.EndRow < i2) {
        i2 = localCellArea.EndRow;
      }
      if (localCellArea.EndColumn < i1) {
        i1 = localCellArea.EndColumn;
      }
      if (localCellArea.StartColumn < i1) {
        i1 = localCellArea.StartColumn;
      }
    }
    return CellsHelper.cellIndexToName(i2, i1);
  }
  
  private void a(zcjz paramzcjz, FormatCondition paramFormatCondition, String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    int i1 = paramFormatCondition.c;
    if (!paramBoolean) {
      paramzcjz.b("cfRule");
    } else {
      paramzcjz.b("x14:cfRule");
    }
    paramzcjz.a("type", zauj.B(i1));
    String str1 = "{" + paramFormatCondition.b() + "}";
    if ((paramFormatCondition.getType() == 3) && (paramBoolean))
    {
      paramzcjz.a("id", str1);
    }
    else
    {
      if (paramFormatCondition.getPriority() == 0) {
        paramzcjz.a("priority", zauj.z(paramInt));
      } else {
        paramzcjz.a("priority", zauj.z(paramFormatCondition.getPriority()));
      }
      if (paramBoolean) {
        paramzcjz.a("id", str1);
      }
    }
    if ((paramFormatCondition.d() != -1) && (!paramBoolean)) {
      paramzcjz.a("dxfId", zauj.z(paramFormatCondition.d()));
    }
    String str2 = a(paramFormatCondition);
    if (str2 != null) {
      paramzcjz.a("operator", str2);
    }
    if (paramFormatCondition.getStopIfTrue()) {
      paramzcjz.a("stopIfTrue", "1");
    }
    int i2 = 1;
    Object localObject;
    switch (i1)
    {
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      localObject = paramFormatCondition.getText();
      if ((localObject == null) || (((String)localObject).length() <= 1) || (((String)localObject).charAt(0) != '=')) {
        paramzcjz.a("text", (String)localObject);
      }
      break;
    case 16: 
      localObject = zauj.X(paramFormatCondition.getTimePeriod());
      paramzcjz.a("timePeriod", (String)localObject);
      break;
    case 5: 
      localObject = paramFormatCondition.getTop10();
      if (((Top10)localObject).getRank() != 0) {
        paramzcjz.a("rank", zauj.z(((Top10)localObject).getRank()));
      }
      if (((Top10)localObject).isBottom()) {
        paramzcjz.a("bottom", "1");
      }
      if (((Top10)localObject).isPercent()) {
        paramzcjz.a("percent", "1");
      }
      break;
    case 17: 
      i2 = 0;
      localObject = paramFormatCondition.getAboveAverage();
      if (!((AboveAverage)localObject).isAboveAverage()) {
        paramzcjz.a("aboveAverage", "0");
      }
      if (((AboveAverage)localObject).isEqualAverage()) {
        paramzcjz.a("equalAverage", "1");
      }
      if (((AboveAverage)localObject).getStdDev() != 0) {
        paramzcjz.a("stdDev", zauj.z(paramFormatCondition.getAboveAverage().getStdDev()));
      }
      break;
    }
    switch (i1)
    {
    case 0: 
    case 1: 
      a(paramzcjz, paramFormatCondition.getFormula1(), paramBoolean);
      if ((paramFormatCondition.b == 0) || (paramFormatCondition.b == 7)) {
        a(paramzcjz, paramFormatCondition.getFormula2(), paramBoolean);
      }
      break;
    case 4: 
      a(paramzcjz, paramFormatCondition, paramBoolean);
      break;
    case 3: 
      b(paramzcjz, paramFormatCondition, paramBoolean);
      if (!paramBoolean) {
        a(paramzcjz, paramFormatCondition, str1);
      }
      break;
    case 2: 
      a(paramzcjz, paramFormatCondition);
      break;
    default: 
      if ((i2 != 0) || (paramBoolean))
      {
        localObject = paramFormatCondition.getFormula1();
        a(paramzcjz, (String)localObject, paramBoolean);
        if (paramBoolean) {
          switch (i1)
          {
          case 8: 
          case 9: 
          case 10: 
          case 11: 
            localObject = paramFormatCondition.getText();
            a(paramzcjz, (String)localObject, paramBoolean);
          }
        }
      }
      break;
    }
    if (paramBoolean) {
      if (paramFormatCondition.d() != -1) {
        this.b.a(paramzcjz, paramFormatCondition.getStyle(), "x14");
      } else {
        paramzcjz.b("x14:dxf", "");
      }
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, FormatCondition paramFormatCondition, boolean paramBoolean)
    throws Exception
  {
    IconSet localIconSet = paramFormatCondition.getIconSet();
    if (!paramBoolean) {
      paramzcjz.b("iconSet");
    } else {
      paramzcjz.b("x14:iconSet");
    }
    if (!paramFormatCondition.getIconSet().isCustom())
    {
      paramzcjz.a("iconSet", zauj.T(localIconSet.getType()));
    }
    else
    {
      paramzcjz.a("iconSet", zauj.T(localIconSet.a));
      paramzcjz.a("custom", "1");
    }
    if (!localIconSet.getShowValue()) {
      paramzcjz.a("showValue", "0");
    }
    if (localIconSet.b) {
      paramzcjz.a("reverse", "1");
    }
    Object localObject;
    for (int i1 = 0; i1 < localIconSet.getCfvos().getCount(); i1++)
    {
      localObject = localIconSet.getCfvos().get(i1);
      a(paramzcjz, (ConditionalFormattingValue)localObject, paramBoolean, false);
    }
    if ((localIconSet.isCustom()) && (paramBoolean)) {
      for (i1 = 0; i1 < localIconSet.c.getCount(); i1++)
      {
        localObject = localIconSet.c.get(i1);
        a(paramzcjz, (ConditionalFormattingIcon)localObject);
      }
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, ConditionalFormattingIcon paramConditionalFormattingIcon)
    throws Exception
  {
    paramzcjz.b("x14:cfIcon");
    paramzcjz.a("iconSet", zauj.T(paramConditionalFormattingIcon.getType()));
    paramzcjz.a("iconId", zauj.z(paramConditionalFormattingIcon.getIndex()));
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, ConditionalFormattingValue paramConditionalFormattingValue, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (!paramBoolean1) {
      paramzcjz.b("cfvo");
    } else {
      paramzcjz.b("x14:cfvo");
    }
    if (!paramConditionalFormattingValue.isGTE()) {
      paramzcjz.a("gte", "0");
    }
    String str1 = zauj.U(paramConditionalFormattingValue.getType());
    if (!paramBoolean1) {
      switch (paramConditionalFormattingValue.getType())
      {
      case 7: 
        str1 = "min";
        break;
      case 6: 
        str1 = "max";
      }
    }
    paramzcjz.a("type", str1);
    String str2 = paramConditionalFormattingValue.c();
    if (paramBoolean2)
    {
      if ((paramConditionalFormattingValue.getType() == 6) || (paramConditionalFormattingValue.getType() == 7) || (paramConditionalFormattingValue.getType() == 1) || (paramConditionalFormattingValue.getType() == 2)) {
        paramzcjz.b();
      }
    }
    else if ((paramConditionalFormattingValue.getType() == 1) || (paramConditionalFormattingValue.getType() == 2)) {
      str2 = "0";
    }
    if (str2 != null) {
      if (!paramBoolean1)
      {
        paramzcjz.a("val", zs.a(str2));
      }
      else
      {
        paramzcjz.b("xm:f");
        paramzcjz.a(zs.a(str2));
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, FormatCondition paramFormatCondition, boolean paramBoolean)
    throws Exception
  {
    DataBar localDataBar = paramFormatCondition.getDataBar();
    if (!paramBoolean) {
      paramzcjz.b("dataBar");
    } else {
      paramzcjz.b("x14:dataBar");
    }
    if ((paramFormatCondition.getType() == 3) && (paramBoolean))
    {
      paramzcjz.a("minLength", zauj.z(localDataBar.getMinLength()));
      paramzcjz.a("maxLength", zauj.z(localDataBar.getMaxLength()));
      if (localDataBar.getBarFillType() == 0) {
        paramzcjz.a("gradient", "0");
      }
      if (localDataBar.getBarBorder().getType() == 1) {
        paramzcjz.a("border", "1");
      }
      if (localDataBar.getDirection() != 0) {
        paramzcjz.a("direction", zauj.V(localDataBar.getDirection()));
      }
      if (localDataBar.getNegativeBarFormat().getBorderColorType() != 1) {
        paramzcjz.a("negativeBarBorderColorSameAsPositive", "0");
      }
      if (localDataBar.getNegativeBarFormat().getColorType() == 1) {
        paramzcjz.a("negativeBarColorSameAsPositive", "1");
      }
      if (localDataBar.getAxisPosition() != 0) {
        paramzcjz.a("axisPosition", zauj.W(localDataBar.getAxisPosition()));
      }
    }
    else
    {
      if (localDataBar.getMinLength() != 10) {
        paramzcjz.a("minLength", zauj.z(localDataBar.getMinLength()));
      }
      if (localDataBar.getMaxLength() != 90) {
        paramzcjz.a("maxLength", zauj.z(localDataBar.getMaxLength()));
      }
    }
    if (!localDataBar.getShowValue()) {
      paramzcjz.a("showValue", "0");
    }
    a(paramzcjz, localDataBar.getMinCfvo(), paramBoolean, true);
    a(paramzcjz, localDataBar.getMaxCfvo(), paramBoolean, true);
    if (!paramBoolean)
    {
      zvq.a(paramzcjz, localDataBar.b(), "color");
    }
    else
    {
      if (localDataBar.getBarBorder().getType() == 1) {
        zvq.a(paramzcjz, localDataBar.getBarBorder().a(), "x14:borderColor");
      }
      if (localDataBar.getNegativeBarFormat().getColorType() == 0) {
        zvq.a(paramzcjz, localDataBar.getNegativeBarFormat().b(), "x14:negativeFillColor");
      }
      if ((localDataBar.getBarBorder().getType() == 1) && (localDataBar.getNegativeBarFormat().getBorderColorType() != 1)) {
        zvq.a(paramzcjz, localDataBar.getNegativeBarFormat().a(), "x14:negativeBorderColor");
      }
      zvq.a(paramzcjz, localDataBar.a(), "x14:axisColor");
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, FormatCondition paramFormatCondition)
    throws Exception
  {
    ColorScale localColorScale = paramFormatCondition.getColorScale();
    paramzcjz.b("colorScale");
    a(paramzcjz, localColorScale.a, false, false);
    if (localColorScale.a()) {
      a(paramzcjz, localColorScale.b, false, false);
    }
    a(paramzcjz, localColorScale.c, false, false);
    zvq.a(paramzcjz, localColorScale.b(), "color");
    if (localColorScale.b != null) {
      zvq.a(paramzcjz, localColorScale.c(), "color");
    }
    zvq.a(paramzcjz, localColorScale.d(), "color");
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString, boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean) {
      paramzcjz.b("xm:f");
    } else {
      paramzcjz.b("formula");
    }
    paramzcjz.a(a(paramString));
    paramzcjz.b();
  }
  
  private String a(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    if (paramString.length() == 0) {
      return "\"\"";
    }
    if (paramString.charAt(0) == '=')
    {
      if (paramString.length() == 1) {
        return "\"=\"";
      }
      return paramString.substring(1);
    }
    if ((zarb.b(paramString)) || (ztr.d(paramString))) {
      return paramString;
    }
    return "\"" + paramString + "\"";
  }
  
  private void a(zcjz paramzcjz, FormatCondition paramFormatCondition, String paramString)
    throws Exception
  {
    paramzcjz.b("extLst");
    paramzcjz.b("ext");
    paramzcjz.a("uri", "{B025F937-C7B1-47D3-B67F-A62EFF666E3E}");
    paramzcjz.a("xmlns:x14", zaty.c);
    paramzcjz.b("x14:id");
    paramzcjz.a(paramString);
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */