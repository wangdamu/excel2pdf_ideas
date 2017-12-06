package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zvq
  extends ztp
{
  private Workbook c;
  zpj b;
  private zpo d;
  private static final za e = new za(new String[] { "none", "solid" });
  
  zvq(Workbook paramWorkbook, zpo paramzpo)
  {
    this.c = paramWorkbook;
    this.d = paramzpo;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.b = zpj.a(this.c);
    paramzcjz.b(true);
    paramzcjz.b("styleSheet");
    b(paramzcjz);
    h(paramzcjz);
    i(paramzcjz);
    a(paramzcjz, this.d);
    b(paramzcjz, this.d);
    d(paramzcjz, this.d);
    e(paramzcjz, this.d);
    c(paramzcjz, this.d);
    j(paramzcjz);
    f(paramzcjz);
    g(paramzcjz);
    c(paramzcjz);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    if (zauj.a) {
      paramzcjz.a("xmlns", zaty.a);
    } else {
      paramzcjz.a("xmlns", zaty.b);
    }
    if (this.c.a != null)
    {
      Object localObject1 = this.c.a.j.a(4);
      if (localObject1 != null)
      {
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = localIterator.next();
          zou localzou = (zou)localObject2;
          paramzcjz.a(localzou.a, localzou.b);
        }
      }
    }
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    if (this.c.a == null)
    {
      if ((this.c.getWorksheets().Y().getCount() > 0) && (this.c.getWorksheets().K().getCount() > 0))
      {
        paramzcjz.b("extLst");
        d(paramzcjz);
        e(paramzcjz);
        paramzcjz.b();
      }
      return;
    }
    Object localObject = this.c.a.j.a(5);
    if (localObject != null)
    {
      zcjm localzcjm = zauz.a((String)localObject, null, true);
      zcju localzcju = localzcjm.b("ext", null);
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = localzcju.iterator();
      while (localIterator.hasNext())
      {
        zcjs localzcjs = (zcjs)localIterator.next();
        zcjn localzcjn = (zcjn)localzcjs;
        if ((localzcjn.e().a("uri") == null) || ((!"{46F421CA-312F-682f-3DD2-61675219B42D}".equals(localzcjn.e().a("uri").h)) && (!"{EB79DEF2-80B8-43e5-95BD-54CBDDF9020C}".equals(localzcjn.e().a("uri").h)))) {
          if ("{9260A510-F301-46a8-8635-F512D64BE5F5}".equals(localzcjn.e().a("uri").h)) {
            zf.a(localArrayList2, localzcjn);
          } else {
            zf.a(localArrayList1, localzcjn);
          }
        }
      }
      if ((localArrayList1.size() > 0) || ((this.c.getWorksheets().Y().getCount() > 0) && (this.c.getWorksheets().K().getCount() > 0)))
      {
        paramzcjz.b("extLst");
        for (int i = 0; i < localArrayList1.size(); i++) {
          paramzcjz.d(((zcjn)localArrayList1.get(i)).c());
        }
        d(paramzcjz);
        e(paramzcjz);
        for (i = 0; i < localArrayList2.size(); i++) {
          paramzcjz.d(((zcjn)localArrayList2.get(i)).c());
        }
        paramzcjz.b();
      }
      else
      {
        paramzcjz.d((String)localObject);
      }
    }
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    DxfCollection localDxfCollection = this.c.getWorksheets().Y();
    int i = localDxfCollection.getCount();
    if (i > 0)
    {
      paramzcjz.b("ext");
      paramzcjz.a("uri", "{46F421CA-312F-682f-3DD2-61675219B42D}");
      paramzcjz.a("xmlns:x14", "http://schemas.microsoft.com/office/spreadsheetml/2009/9/main");
      paramzcjz.b("x14:dxfs");
      paramzcjz.a("count", zauj.z(i));
      for (int j = 0; j < i; j++)
      {
        Style localStyle = localDxfCollection.get(j);
        a(paramzcjz, localStyle, null);
      }
      paramzcjz.b();
      paramzcjz.b();
    }
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    zbpy localzbpy = this.c.getWorksheets().K();
    int i = localzbpy.getCount();
    if (i > 0)
    {
      paramzcjz.b("ext");
      paramzcjz.a("uri", "{EB79DEF2-80B8-43e5-95BD-54CBDDF9020C}");
      paramzcjz.a("xmlns:x14", "http://schemas.microsoft.com/office/spreadsheetml/2009/9/main");
      paramzcjz.b("x14:slicerStyles");
      paramzcjz.a("defaultSlicerStyle", localzbpy.b());
      for (int j = 0; j < i; j++) {
        a(paramzcjz, localzbpy.a(j));
      }
      paramzcjz.b();
      paramzcjz.b();
    }
  }
  
  private void a(zcjz paramzcjz, zbpx paramzbpx)
    throws Exception
  {
    paramzcjz.b("x14:slicerStyle");
    paramzcjz.a("name", paramzbpx.b());
    if (paramzbpx.a().getCount() > 0)
    {
      paramzcjz.b("x14:slicerStyleElements");
      zbqa localzbqa = paramzbpx.a();
      for (int i = 0; i < localzbqa.getCount(); i++)
      {
        paramzcjz.b("x14:slicerStyleElement");
        paramzcjz.a("type", zbqb.c(localzbqa.a(i).a()));
        paramzcjz.a("dxfId", zauj.z(localzbqa.a(i).a));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    TableStyleCollection localTableStyleCollection = this.c.getWorksheets().Z();
    if (localTableStyleCollection == null) {
      return;
    }
    int i = localTableStyleCollection.getCount();
    paramzcjz.b("tableStyles");
    paramzcjz.a("count", zauj.z(i));
    String str = localTableStyleCollection.a();
    if (str != null) {
      paramzcjz.a("defaultTableStyle", localTableStyleCollection.a());
    }
    if (localTableStyleCollection.b() != null) {
      paramzcjz.a("defaultPivotStyle", localTableStyleCollection.b());
    }
    for (int j = 0; j < i; j++)
    {
      TableStyle localTableStyle = localTableStyleCollection.get(j);
      a(localTableStyle, paramzcjz);
    }
    paramzcjz.b();
  }
  
  private void a(TableStyle paramTableStyle, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("tableStyle");
    paramzcjz.a("name", paramTableStyle.getName());
    if (!paramTableStyle.c()) {
      paramzcjz.a("pivot", "0");
    }
    if (!paramTableStyle.d()) {
      paramzcjz.a("table", "0");
    }
    TableStyleElementCollection localTableStyleElementCollection = paramTableStyle.getTableStyleElements();
    if ((localTableStyleElementCollection != null) && (localTableStyleElementCollection.getCount() != 0))
    {
      int i = localTableStyleElementCollection.getCount();
      paramzcjz.a("count", zauj.z(i));
      for (int j = 0; j < i; j++)
      {
        TableStyleElement localTableStyleElement = localTableStyleElementCollection.get(j);
        int k = localTableStyleElement.getType();
        if ((paramTableStyle.c()) || (!paramTableStyle.d())) {
          if (k == 28) {
            k = 7;
          } else if (k == 29) {
            k = 10;
          }
        }
        paramzcjz.b("tableStyleElement");
        paramzcjz.a("type", zauj.aw(k));
        if (localTableStyleElement.getSize() != 1) {
          paramzcjz.a("size", zauj.z(localTableStyleElement.getSize()));
        }
        if (localTableStyleElement.a != -1) {
          paramzcjz.a("dxfId", zauj.z(localTableStyleElement.a));
        }
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("colors");
    paramzcjz.b("indexedColors");
    a(paramzcjz, 0, 64);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, int paramInt1, int paramInt2)
    throws Exception
  {
    for (int i = paramInt1; i < paramInt2; i++)
    {
      Color localColor = this.c.getWorksheets().o().e(i);
      int j = localColor.toArgb();
      String str = "00" + zp.d(j).substring(2);
      paramzcjz.b("rgbColor");
      paramzcjz.a("rgb", str);
      paramzcjz.b();
    }
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.c.getWorksheets().B();
    int i = localArrayList.size();
    if (i == 0) {
      return;
    }
    paramzcjz.b("numFmts");
    paramzcjz.a("count", zauj.z(i));
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zzw localzzw = (zzw)localIterator.next();
      paramzcjz.b("numFmt");
      paramzcjz.a("numFmtId", zauj.z(localzzw.b()));
      paramzcjz.a("formatCode", zauj.a(localzzw.a()));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  static void a(Font paramFont, zcjz paramzcjz, String paramString)
    throws Exception
  {
    if (paramFont.isBold()) {
      paramzcjz.b("b", null);
    }
    if (paramFont.isItalic()) {
      paramzcjz.b("i", null);
    }
    if (paramFont.getUnderline() != 0)
    {
      paramzcjz.b("u");
      paramzcjz.a("val", zauj.y(paramFont.getUnderline()));
      paramzcjz.b();
    }
    if (paramFont.isStrikeout()) {
      paramzcjz.b("strike", null);
    }
    if ((paramFont.isSubscript()) || (paramFont.isSuperscript()))
    {
      String str = null;
      if (paramFont.isSubscript()) {
        str = "subscript";
      }
      if (paramFont.isSuperscript()) {
        str = "superscript";
      }
      paramzcjz.b("vertAlign");
      paramzcjz.a("val", str);
      paramzcjz.b();
    }
    if (paramFont.getSize() > 0)
    {
      paramzcjz.b("sz");
      paramzcjz.a("val", zauj.b(paramFont.getDoubleSize()));
      paramzcjz.b();
    }
    switch (paramFont.b().c())
    {
    case 0: 
    case 1: 
      break;
    default: 
      a(paramzcjz, paramFont.b(), "color");
    }
    if ((paramFont.getName() != null) && (!"".equals(paramFont.getName())))
    {
      paramzcjz.b(paramString);
      paramzcjz.a("val", zauj.a(paramFont.getName()));
      paramzcjz.b();
    }
    paramzcjz.b("family");
    paramzcjz.a("val", zauj.a(paramFont.h()));
    paramzcjz.b();
    if (paramFont.getCharset() != 0)
    {
      paramzcjz.b("charset");
      paramzcjz.a("val", zauj.z(paramFont.getCharset()));
      paramzcjz.b();
    }
    if (paramFont.a() != null)
    {
      paramzcjz.b("scheme");
      paramzcjz.a("val", paramFont.a());
      paramzcjz.b();
    }
  }
  
  private void i(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.b.a;
    paramzcjz.b("fonts");
    paramzcjz.a("count", zauj.z(localArrayList.size()));
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      Font localFont = (Font)localIterator.next();
      paramzcjz.b("font");
      a(localFont, paramzcjz, "name");
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.a;
    paramzcjz.b("fills");
    paramzcjz.a("count", zauj.z(localArrayList.size()));
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zpv localzpv = (zpv)localIterator.next();
      a(paramzcjz, localzpv);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zpv paramzpv)
    throws Exception
  {
    paramzcjz.b("fill");
    if (paramzpv.c != null)
    {
      b(paramzcjz, paramzpv);
    }
    else
    {
      paramzcjz.b("patternFill");
      switch (e.a(paramzpv.b.a))
      {
      case 0: 
        break;
      case 1: 
        paramzcjz.a("patternType", "solid");
        a(paramzcjz, paramzpv.b.b, "fgColor");
        paramzcjz.b("bgColor");
        paramzcjz.a("indexed", "64");
        paramzcjz.b();
        break;
      default: 
        paramzcjz.a("patternType", paramzpv.b.a);
        if (!paramzpv.b.b.b()) {
          a(paramzcjz, paramzpv.b.b, "fgColor");
        }
        if (!paramzpv.b.c.b()) {
          a(paramzcjz, paramzpv.b.c, "bgColor");
        }
        break;
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, zpv paramzpv)
    throws Exception
  {
    zoy localzoy = paramzpv.c;
    paramzcjz.b("gradientFill");
    if (localzoy.f != 0) {
      paramzcjz.a("degree", zauj.z(localzoy.f));
    }
    if (localzoy.e != null) {
      paramzcjz.a("type", localzoy.e);
    }
    if (localzoy.a != 0.0D) {
      paramzcjz.a("left", zauj.b(localzoy.a));
    }
    if (localzoy.b != 0.0D) {
      paramzcjz.a("right", zauj.b(localzoy.b));
    }
    if (localzoy.c != 0.0D) {
      paramzcjz.a("top", zauj.b(localzoy.c));
    }
    if (localzoy.d != 0.0D) {
      paramzcjz.a("bottom", zauj.b(localzoy.d));
    }
    if (localzoy.g != null)
    {
      int i = localzoy.g.length;
      for (int j = 0; j < i; j++)
      {
        paramzcjz.b("stop");
        paramzcjz.a("position", zauj.b(localzoy.g[j]));
        a(paramzcjz, localzoy.h[j], "color");
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.b;
    paramzcjz.b("borders");
    paramzcjz.a("count", zauj.z(localArrayList.size()));
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zow localzow = (zow)localIterator.next();
      paramzcjz.b("border");
      if (localzow.j) {
        paramzcjz.a("diagonalUp", "1");
      }
      if (localzow.i) {
        paramzcjz.a("diagonalDown", "1");
      }
      a(paramzcjz, localzow.c, "left");
      a(paramzcjz, localzow.e, "right");
      a(paramzcjz, localzow.b, "top");
      a(paramzcjz, localzow.d, "bottom");
      a(paramzcjz, localzow.f, "diagonal");
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz, zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.e;
    paramzcjz.b("cellStyles");
    paramzcjz.a("count", zauj.z(localArrayList.size()));
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zoz localzoz = (zoz)localIterator.next();
      paramzcjz.b("cellStyle");
      paramzcjz.a("name", localzoz.a);
      paramzcjz.a("xfId", zauj.z(localzoz.b));
      if (localzoz.d) {
        paramzcjz.a("hidden", "1");
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz, zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.c;
    paramzcjz.b("cellStyleXfs");
    paramzcjz.a("count", zauj.z(localArrayList.size()));
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zrv localzrv = (zrv)localIterator.next();
      a(paramzcjz, localzrv);
    }
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz, zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.d;
    paramzcjz.b("cellXfs");
    paramzcjz.a("count", zauj.z(localArrayList.size()));
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zrv localzrv = (zrv)localIterator.next();
      a(paramzcjz, localzrv);
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, zaml paramzaml, String paramString)
    throws Exception
  {
    a(paramzcjz, paramzaml, paramString, false);
  }
  
  private static void a(zcjz paramzcjz, zaml paramzaml, String paramString, boolean paramBoolean)
    throws Exception
  {
    if ((paramzaml.b()) && (paramzaml.c() != 1))
    {
      if (paramBoolean)
      {
        paramzcjz.b(paramString);
        paramzcjz.a("auto", "1");
        paramzcjz.b();
      }
      return;
    }
    String str1 = null;
    String str2 = null;
    switch (paramzaml.c())
    {
    case 1: 
    case 3: 
      str1 = "indexed";
      str2 = zauj.z(paramzaml.e());
      break;
    case 2: 
      str1 = "rgb";
      str2 = "FF" + zauj.a(Color.fromArgb(paramzaml.e()));
      break;
    case 4: 
      str1 = "theme";
      str2 = zauj.z(paramzaml.e());
      break;
    }
    paramzcjz.b(paramString);
    paramzcjz.a(str1, str2);
    if (paramzaml.g() != 0.0D) {
      paramzcjz.a("tint", zauj.b(paramzaml.g()));
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zox paramzox, String paramString)
    throws Exception
  {
    if (paramzox == null) {
      return;
    }
    paramzcjz.b(paramString);
    if ((paramzox.a != null) && (!"none".equals(paramzox.a))) {
      paramzcjz.a("style", paramzox.a);
    }
    if (!paramzox.b.b()) {
      a(paramzcjz, paramzox.b, "color");
    } else if ((paramzox.a != null) && (!"none".equals(paramzox.a))) {
      paramzcjz.d("<color auto=\"1\"/>");
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zrv paramzrv)
    throws Exception
  {
    paramzcjz.b("xf");
    String str = zauj.z(paramzrv.e);
    if (paramzrv.e == -1) {
      str = "0";
    }
    paramzcjz.a("numFmtId", str);
    if (this.b.b.containsKey(Integer.valueOf(paramzrv.f)))
    {
      int i = ((Integer)this.b.b.get(Integer.valueOf(paramzrv.f))).intValue();
      paramzcjz.a("fontId", zauj.z(i));
    }
    if (paramzrv.g != -1) {
      paramzcjz.a("fillId", zauj.z(paramzrv.g));
    }
    if (paramzrv.h != -1) {
      paramzcjz.a("borderId", zauj.z(paramzrv.h));
    }
    if (paramzrv.b) {
      paramzcjz.a("xfId", zauj.z(paramzrv.i));
    }
    Style localStyle;
    if (paramzrv.b)
    {
      localStyle = paramzrv.r;
      if (localStyle.j()) {
        paramzcjz.a("applyNumberFormat", "1");
      }
      if (localStyle.k()) {
        paramzcjz.a("applyFont", "1");
      }
      if (localStyle.n()) {
        paramzcjz.a("applyFill", "1");
      }
      if (localStyle.m()) {
        paramzcjz.a("applyBorder", "1");
      }
      if (localStyle.l()) {
        paramzcjz.a("applyAlignment", "1");
      }
      if (localStyle.o()) {
        paramzcjz.a("applyProtection", "1");
      }
    }
    else
    {
      localStyle = paramzrv.r;
      if (!localStyle.j()) {
        paramzcjz.a("applyNumberFormat", "0");
      }
      if (!localStyle.k()) {
        paramzcjz.a("applyFont", "0");
      }
      if (!localStyle.n()) {
        paramzcjz.a("applyFill", "0");
      }
      if (!localStyle.m()) {
        paramzcjz.a("applyBorder", "0");
      }
      if (!localStyle.l()) {
        paramzcjz.a("applyAlignment", "0");
      }
      if (!localStyle.o()) {
        paramzcjz.a("applyProtection", "0");
      }
    }
    if (paramzrv.r.w()) {
      paramzcjz.a("quotePrefix", "1");
    }
    if (paramzrv.p) {
      a(paramzcjz, paramzrv.c, false);
    }
    if (paramzrv.q) {
      a(paramzcjz, paramzrv.d, false);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zot paramzot, Style paramStyle)
    throws Exception
  {
    paramzcjz.b("alignment");
    if ((paramzot.b != null) && (paramStyle.isModified(25))) {
      paramzcjz.a("horizontal", paramzot.b);
    }
    if ((paramzot.d != null) && (paramStyle.isModified(26))) {
      paramzcjz.a("vertical", paramzot.d);
    }
    if (paramStyle.isModified(28)) {
      paramzcjz.a("textRotation", zauj.z(paramzot.a()));
    }
    if (paramStyle.isModified(29)) {
      paramzcjz.a("wrapText", paramStyle.isTextWrapped() ? "1" : "0");
    }
    if (paramStyle.isModified(27)) {
      paramzcjz.a("indent", zauj.z(paramzot.c()));
    }
    if (paramStyle.isModified(48)) {
      paramzcjz.a("relativeIndent", zauj.z(paramzot.a));
    }
    if (paramStyle.isModified(30)) {
      paramzcjz.a("shrinkToFit", paramStyle.getShrinkToFit() ? "1" : "0");
    }
    if (paramStyle.isModified(31)) {
      paramzcjz.a("readingOrder", zauj.u(paramzot.e()));
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zot paramzot, boolean paramBoolean)
    throws Exception
  {
    paramzcjz.b("alignment");
    if (paramzot.b != null)
    {
      if ((paramBoolean) || (!"general".equals(paramzot.b))) {
        paramzcjz.a("horizontal", paramzot.b);
      }
      if (paramzot.c) {
        paramzcjz.a("justifyLastLine", "1");
      }
    }
    if ((paramzot.d != null) && ((paramBoolean) || (!"bottom".equals(paramzot.d)))) {
      paramzcjz.a("vertical", paramzot.d);
    }
    if ((paramBoolean) || (paramzot.a() > 0)) {
      paramzcjz.a("textRotation", zauj.z(paramzot.a()));
    }
    if ((paramBoolean) || (paramzot.b())) {
      paramzcjz.a("wrapText", "1");
    }
    if ((paramBoolean) || (paramzot.c() > 0)) {
      paramzcjz.a("indent", zauj.z(paramzot.c()));
    }
    if ((paramBoolean) || (paramzot.d())) {
      paramzcjz.a("shrinkToFit", "1");
    }
    if ((paramBoolean) || (paramzot.e() != 0)) {
      paramzcjz.a("readingOrder", zauj.u(paramzot.e()));
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zrk paramzrk, boolean paramBoolean)
    throws Exception
  {
    if (paramzrk == null) {
      return;
    }
    paramzcjz.b("protection");
    if ((paramBoolean) || (paramzrk.b)) {
      paramzcjz.a("hidden", "1");
    }
    if ((paramBoolean) || (!paramzrk.a)) {
      paramzcjz.a("locked", "0");
    }
    paramzcjz.b();
  }
  
  private void j(zcjz paramzcjz)
    throws Exception
  {
    DxfCollection localDxfCollection = this.c.getWorksheets().getDxfs();
    int i = localDxfCollection.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("dxfs");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < localDxfCollection.getCount(); j++)
    {
      Style localStyle = localDxfCollection.get(j);
      a(paramzcjz, localStyle, null);
    }
    paramzcjz.b();
  }
  
  static void a(Style paramStyle, Font paramFont, zcjz paramzcjz, String paramString)
    throws Exception
  {
    if (paramStyle.isModified(17)) {
      if (paramFont.isBold()) {
        paramzcjz.b("b", null);
      } else {
        a(paramzcjz, "b", "0");
      }
    }
    if (paramStyle.isModified(18)) {
      if (paramFont.isItalic()) {
        paramzcjz.b("i", null);
      } else {
        a(paramzcjz, "i", "0");
      }
    }
    if (paramStyle.isModified(19)) {
      a(paramzcjz, "u", zauj.y(paramFont.getUnderline()));
    }
    if (paramStyle.isModified(20)) {
      if (paramFont.isStrikeout()) {
        paramzcjz.b("strike", null);
      } else {
        a(paramzcjz, "strike", "0");
      }
    }
    if ((paramStyle.isModified(23)) && ((paramFont.isSubscript()) || (paramFont.isSuperscript())))
    {
      String str = null;
      if (paramFont.isSubscript()) {
        str = "subscript";
      }
      if (paramFont.isSuperscript()) {
        str = "superscript";
      }
      paramzcjz.b("vertAlign");
      paramzcjz.a("val", str);
      paramzcjz.b();
    }
    if (paramStyle.isModified(12)) {
      a(paramzcjz, "sz", zauj.z(paramFont.getSize()));
    }
    if ((paramStyle.isModified(13)) && (paramFont.getName() != null)) {
      a(paramzcjz, paramString, zauj.a(paramFont.getName()));
    }
    if (paramStyle.isModified(14)) {
      a(paramzcjz, "family", zauj.a(paramFont.h()));
    }
    if (paramStyle.isModified(16)) {
      a(paramzcjz, paramFont.b(), "color", true);
    }
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.b(paramString1);
    paramzcjz.a("val", paramString2);
    paramzcjz.b();
  }
  
  private void a(Style paramStyle, zcjz paramzcjz, zpv paramzpv)
    throws Exception
  {
    paramzcjz.b("fill");
    if (paramzpv.c != null)
    {
      b(paramzcjz, paramzpv);
    }
    else
    {
      paramzcjz.b("patternFill");
      if (paramStyle.isModified(33)) {
        paramzcjz.a("patternType", paramzpv.b.a);
      }
      if (paramStyle.isModified(34)) {
        a(paramzcjz, paramzpv.b.b, "fgColor");
      }
      if (paramStyle.isModified(35)) {
        a(paramzcjz, paramzpv.b.c, "bgColor");
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  void a(zcjz paramzcjz, Style paramStyle, String paramString)
    throws Exception
  {
    if (paramString != null) {
      paramzcjz.b(paramString + ":dxf");
    } else {
      paramzcjz.b("dxf");
    }
    a(paramzcjz, paramStyle);
    paramzcjz.b();
  }
  
  void a(zcjz paramzcjz, Style paramStyle)
    throws Exception
  {
    if ((paramStyle.q() != null) && (paramStyle.isModified(11)))
    {
      paramzcjz.b("font");
      a(paramStyle, paramStyle.getFont(), paramzcjz, "name");
      paramzcjz.b();
    }
    if (paramStyle.isModified(24))
    {
      int i = paramStyle.r();
      if ((i != -1) && (i != 0))
      {
        paramzcjz.b("numFmt");
        paramzcjz.a("numFmtId", zauj.z(i));
        String str = paramStyle.s();
        if ((str == null) || (str.length() == 0)) {
          if (i < 59) {
            str = this.c.getSettings().f().d(i);
          } else {
            str = "";
          }
        }
        paramzcjz.a("formatCode", str);
        paramzcjz.b();
      }
    }
    Object localObject;
    if ((paramStyle.isModified(33)) || (paramStyle.isModified(34)) || (paramStyle.isModified(35)) || (paramStyle.isGradient()))
    {
      localObject = zpv.a(paramStyle);
      a(paramStyle, paramzcjz, (zpv)localObject);
    }
    if (paramStyle.isModified(38))
    {
      localObject = zot.a(paramStyle);
      if (localObject != null) {
        a(paramzcjz, (zot)localObject, paramStyle);
      }
    }
    if (paramStyle.d() != null)
    {
      localObject = zow.b(paramStyle);
      paramzcjz.b("border");
      if (paramStyle.isModified(1))
      {
        if ((paramStyle.isModified(8)) && (!paramStyle.isModified(10))) {
          paramzcjz.a("diagonalUp", "0");
        }
        if ((paramStyle.isModified(8)) && (!paramStyle.isModified(9))) {
          paramzcjz.a("diagonalDown", "0");
        }
        if (paramStyle.isModified(2)) {
          a(paramzcjz, ((zow)localObject).c, "left");
        }
        if (paramStyle.isModified(3)) {
          a(paramzcjz, ((zow)localObject).e, "right");
        }
        if (paramStyle.isModified(4)) {
          a(paramzcjz, ((zow)localObject).b, "top");
        }
        if (paramStyle.isModified(5)) {
          a(paramzcjz, ((zow)localObject).d, "bottom");
        }
        if ((paramStyle.isModified(8)) || (paramStyle.isModified(9)) || (paramStyle.isModified(10))) {
          a(paramzcjz, ((zow)localObject).f, "diagonal");
        }
      }
      if (((zow)localObject).h != null) {
        a(paramzcjz, ((zow)localObject).h, "vertical");
      }
      if (((zow)localObject).g != null) {
        a(paramzcjz, ((zow)localObject).g, "horizontal");
      }
      paramzcjz.b();
    }
    if (paramStyle.isModified(36))
    {
      localObject = zrk.b(paramStyle);
      a(paramzcjz, (zrk)localObject, true);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */