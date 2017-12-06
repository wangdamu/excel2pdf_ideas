package com.aspose.cells;

import java.util.Iterator;

class zvm
{
  private zcjz a;
  private WorksheetCollection b;
  private FontSettingCollection c;
  private String d;
  private zuw e = null;
  private boolean f = false;
  
  zvm(zcjz paramzcjz, Shape paramShape, String paramString, zuw paramzuw)
  {
    this.f = paramShape.T();
    this.a = paramzcjz;
    this.b = paramShape.P();
    this.c = paramShape.x;
    this.d = paramString;
    this.e = paramzuw;
  }
  
  void a()
    throws Exception
  {
    this.a.b(this.f ? "cdr:txBody" : "xdr:txBody");
    a(this.c.getTextAlignment());
    a(this.c.e);
    TextParagraph localTextParagraph = null;
    for (int i = 0; i < this.c.getCount(); i++)
    {
      FontSetting localFontSetting = this.c.get(i);
      switch (localFontSetting.getType())
      {
      case 1: 
        if (localTextParagraph != null) {
          a(localTextParagraph);
        }
        localTextParagraph = (TextParagraph)localFontSetting;
        b(localTextParagraph, i);
        break;
      case 2: 
        zux.a(this.a, (ztw)localFontSetting);
        break;
      case 0: 
        a(this.a, localFontSetting, i);
      }
    }
    a(localTextParagraph);
    this.a.b();
  }
  
  private void a(ShapeTextAlignment paramShapeTextAlignment)
    throws Exception
  {
    if (paramShapeTextAlignment.a != null)
    {
      this.a.d(paramShapeTextAlignment.a);
      return;
    }
    this.a.a(this.d, "bodyPr", false);
    if (paramShapeTextAlignment.j(4096)) {
      this.a.a("fromWordArt", paramShapeTextAlignment.a() ? "1" : "0");
    }
    if (paramShapeTextAlignment.j(1024))
    {
      this.a.a("lIns", zauj.z(paramShapeTextAlignment.j()));
      this.a.a("tIns", zauj.z(paramShapeTextAlignment.h()));
      this.a.a("rIns", zauj.z(paramShapeTextAlignment.k()));
      this.a.a("bIns", zauj.z(paramShapeTextAlignment.i()));
    }
    if (paramShapeTextAlignment.j(64)) {
      this.a.a("vertOverflow", zauj.aN(paramShapeTextAlignment.getTextVerticalOverflow()));
    }
    if (paramShapeTextAlignment.j(32)) {
      this.a.a("horzOverflow", zauj.aN(paramShapeTextAlignment.getTextHorizontalOverflow()));
    }
    if (paramShapeTextAlignment.j(16)) {
      this.a.a("vert", zauj.aO(paramShapeTextAlignment.getTextVerticalType()));
    }
    if (paramShapeTextAlignment.j(1)) {
      this.a.a("wrap", paramShapeTextAlignment.isTextWrapped() ? "square" : "none");
    }
    if (paramShapeTextAlignment.j(8)) {
      this.a.a("anchor", zauj.C(paramShapeTextAlignment.n()));
    }
    if (paramShapeTextAlignment.j(4)) {
      this.a.a("anchorCtr", paramShapeTextAlignment.m() == 1 ? "1" : "0");
    }
    if (paramShapeTextAlignment.b()) {
      this.a.a("upright", "1");
    }
    if (paramShapeTextAlignment.c != 0) {
      this.a.a("rot", zauj.z(paramShapeTextAlignment.c));
    }
    if (paramShapeTextAlignment.f != null) {
      a(this.a, "a:prstTxWarp", paramShapeTextAlignment.f);
    }
    if (paramShapeTextAlignment.j(128))
    {
      this.a.b(paramShapeTextAlignment.getAutoSize() ? "a:spAutoFit" : "a:noAutofit");
      this.a.b();
    }
    if (paramShapeTextAlignment.j(256))
    {
      this.a.b("a:normAutofit");
      this.a.a("fontScale", zauj.z(paramShapeTextAlignment.d));
      this.a.a("lnSpcReduction", zauj.z(paramShapeTextAlignment.e));
      this.a.b();
    }
    zvl.b(this.a, paramShapeTextAlignment.g);
    zvl.a(this.a, paramShapeTextAlignment.g);
    if (paramShapeTextAlignment.j(2048))
    {
      this.a.b("a:flatTx");
      this.a.a("z", zauj.z(paramShapeTextAlignment.g()));
      this.a.b();
    }
    this.a.b();
  }
  
  private void a(zane paramzane)
    throws Exception
  {
    if ((paramzane != null) && (paramzane.a != null)) {
      this.a.d(paramzane.a);
    }
  }
  
  static void a(zcjz paramzcjz, String paramString, zaxp paramzaxp)
    throws Exception
  {
    if (paramzaxp.a != null)
    {
      paramzcjz.d(paramzaxp.a);
      return;
    }
    if (paramzaxp.b == 202) {
      return;
    }
    paramzcjz.b("a:prstTxWarp");
    paramzcjz.a("prst", zauj.aF(paramzaxp.b));
    ShapeGuideCollection localShapeGuideCollection = null;
    if (paramzaxp != null) {
      localShapeGuideCollection = paramzaxp.g();
    }
    if ((paramzaxp != null) && (localShapeGuideCollection != null) && (localShapeGuideCollection.getCount() > 0))
    {
      paramzcjz.b("a:avLst");
      Iterator localIterator = localShapeGuideCollection.iterator();
      while (localIterator.hasNext())
      {
        ShapeGuide localShapeGuide = (ShapeGuide)localIterator.next();
        a(paramzcjz, localShapeGuide);
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, ShapeGuide paramShapeGuide)
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
  
  private void a(TextParagraph paramTextParagraph, int paramInt)
    throws Exception
  {
    int i = (paramTextParagraph.c) && (paramTextParagraph.q != null) ? 1 : 0;
    if ((i != 0) && (paramInt + 1 < this.c.getCount()) && (this.c.get(paramInt + 1).getType() == 0)) {
      i = this.c.get(paramInt + 1).q != paramTextParagraph.q ? 1 : 0;
    }
    if ((paramTextParagraph.l == 0) && (paramTextParagraph.d == null) && ((paramTextParagraph.q == null) || (paramTextParagraph.q == paramTextParagraph.e)) && (i == 0) && (paramTextParagraph.j == null) && ((paramTextParagraph.i == null) || (paramTextParagraph.i.getCount() == 0))) {
      return;
    }
    this.a.a(this.d, "pPr", false);
    if (paramTextParagraph.g(4096)) {
      this.a.a("algn", zauj.D(paramTextParagraph.getAlignmentType()));
    }
    if (paramTextParagraph.g(2048)) {
      this.a.a("defTabSz", zauj.z(paramTextParagraph.r()));
    }
    if (paramTextParagraph.g(1024)) {
      this.a.a("fontAlgn", zauj.w(paramTextParagraph.getFontAlignType()));
    }
    if (paramTextParagraph.g(8192)) {
      this.a.a("indent", zauj.z(paramTextParagraph.p()));
    }
    if (paramTextParagraph.g(512)) {
      this.a.a("lvl", zauj.z(paramTextParagraph.q()));
    }
    if (paramTextParagraph.g(256)) {
      this.a.a("marL", zauj.z(paramTextParagraph.o()));
    }
    if (paramTextParagraph.g(128)) {
      this.a.a("marR", zauj.z(paramTextParagraph.d()));
    }
    if (paramTextParagraph.g(64)) {
      this.a.a("hangingPunct", paramTextParagraph.isHangingPunctuation() ? "1" : "0");
    }
    if (paramTextParagraph.g(32)) {
      this.a.a("eaLnBrk", paramTextParagraph.isEastAsianLineBreak() ? "1" : "0");
    }
    if (paramTextParagraph.g(16)) {
      this.a.a("latinLnBrk", paramTextParagraph.isLatinLineBreak() ? "1" : "0");
    }
    if (paramTextParagraph.g(8)) {
      this.a.a("rtl", paramTextParagraph.c() ? "1" : "0");
    }
    if (paramTextParagraph.g(1))
    {
      this.a.b("a:lnSpc");
      a(paramTextParagraph.getLineSpaceSizeType(), paramTextParagraph.f);
      this.a.b();
    }
    if (paramTextParagraph.g(4))
    {
      this.a.b("a:spcBef");
      a(paramTextParagraph.getSpaceBeforeSizeType(), paramTextParagraph.h);
      this.a.b();
    }
    if (paramTextParagraph.g(2))
    {
      this.a.b("a:spcAft");
      a(paramTextParagraph.getSpaceAfterSizeType(), paramTextParagraph.g);
      this.a.b();
    }
    Bullet localBullet = paramTextParagraph.d;
    if (localBullet != null)
    {
      if (localBullet.d)
      {
        this.a.b("a:buClrTx", null);
      }
      else if (localBullet.c != null)
      {
        this.a.b("a:buClr");
        zvl.a(this.a, localBullet.c, -1, this.b.p());
        this.a.b();
      }
      switch (localBullet.f)
      {
      case 2: 
        this.a.b("a:buSzTx", null);
        break;
      case 0: 
        this.a.b("a:buSzPct");
        this.a.a("val", zauj.z(localBullet.g));
        this.a.b();
        break;
      case 1: 
        this.a.b("a:buSzPts");
        this.a.a("val", zauj.z(localBullet.g));
        this.a.b();
        break;
      }
      if (localBullet.e) {
        this.a.b("a:buFontTx", null);
      } else if (localBullet.b != null) {
        a(this.a, localBullet.b);
      }
      switch (localBullet.getType())
      {
      case 0: 
        this.a.b("a:buNone", null);
        break;
      case 1: 
        this.a.b("a:buChar");
        this.a.a("char", "" + ((CharacterBulletValue)localBullet.getBulletValue()).a);
        this.a.b();
        break;
      case 3: 
        this.a.b("a:buAutoNum");
        AutoNumberedBulletValue localAutoNumberedBulletValue = (AutoNumberedBulletValue)localBullet.a;
        if (localAutoNumberedBulletValue.getStartAt() != 1) {
          this.a.a("startAt", zauj.z(localAutoNumberedBulletValue.getStartAt()));
        }
        String str = zauj.x(localAutoNumberedBulletValue.getAutonumberScheme());
        if (str != null) {
          this.a.a("type", str);
        }
        this.a.b();
        break;
      case 2: 
        break;
      }
    }
    if (paramTextParagraph.i != null) {
      a(paramTextParagraph.i);
    }
    if ((i != 0) && (paramTextParagraph.e != paramTextParagraph.q) && (paramTextParagraph.q != null)) {
      a(this.a, "a:defRPr", paramTextParagraph.q, this.e, this.b.p());
    }
    this.a.b();
  }
  
  private void a(TextTabStopCollection paramTextTabStopCollection)
    throws Exception
  {
    this.a.b("a:tabLst");
    Iterator localIterator = paramTextTabStopCollection.iterator();
    while (localIterator.hasNext())
    {
      TextTabStop localTextTabStop = (TextTabStop)localIterator.next();
      this.a.b("a:tab");
      this.a.a("algn", zauj.A(localTextTabStop.a));
      this.a.a("pos", zauj.z(localTextTabStop.b));
      this.a.b();
    }
    this.a.b();
  }
  
  private void b(TextParagraph paramTextParagraph, int paramInt)
    throws Exception
  {
    this.a.c("a", "p", null);
    a(paramTextParagraph, paramInt);
  }
  
  private void a(int paramInt1, int paramInt2)
    throws Exception
  {
    if (paramInt1 == 1) {
      this.a.b("a:spcPts");
    } else {
      this.a.b("a:spcPct");
    }
    this.a.a("val", zauj.z(paramInt2));
    this.a.b();
  }
  
  private void a(TextParagraph paramTextParagraph)
    throws Exception
  {
    if (paramTextParagraph.e != null) {
      a(this.a, "a:endParaRPr", paramTextParagraph.e, this.e, this.b.p());
    }
    this.a.b();
  }
  
  void a(zcjz paramzcjz, FontSetting paramFontSetting, int paramInt)
    throws Exception
  {
    int i = paramFontSetting.getLength();
    int j = paramFontSetting.getStartIndex();
    if ((paramInt + 1 < this.c.getCount()) && (this.c.get(paramInt + 1).getType() == 1)) {
      i--;
    }
    String str = null;
    Object localObject = this.c.b;
    if ((localObject != null) && ((localObject instanceof Shape)) && (((Shape)localObject).af() != null)) {
      str = "TxLink";
    }
    if (str == null)
    {
      paramzcjz.a(this.d, "r", false);
    }
    else
    {
      paramzcjz.a(this.d, "fld", false);
      paramzcjz.a("id", zum.d());
      paramzcjz.a("type", str);
    }
    a(paramzcjz, "a:rPr", paramFontSetting.q, this.e, this.b.p());
    a(paramzcjz, this.d, this.c.getText().substring(j, j + i));
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, zbwg paramzbwg)
    throws Exception
  {
    paramzcjz.b("m:r");
    a(paramzcjz, "a:rPr", paramzbwg.p(), null, null);
    a(paramzcjz, "m", paramzbwg.o());
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, String paramString, Font paramFont, zuw paramzuw, Workbook paramWorkbook)
    throws Exception
  {
    if (paramFont == null) {
      return;
    }
    if (!paramFont.l())
    {
      zul.a(paramzcjz, paramFont, paramString, paramWorkbook);
      return;
    }
    TextOptions localTextOptions = (TextOptions)paramFont;
    String str = null;
    paramzcjz.b(paramString);
    str = zamr.b((short)localTextOptions.r());
    if ((str != null) && (!"".equals(str))) {
      paramzcjz.a("altLang", str);
    }
    str = zamr.b((short)localTextOptions.s());
    if ((str != null) && (!"".equals(str))) {
      paramzcjz.a("lang", str);
    }
    if (localTextOptions.f(12)) {
      paramzcjz.a("sz", zauj.z(localTextOptions.j() * 5));
    }
    if (localTextOptions.f(19)) {
      paramzcjz.a("u", zauj.v(localTextOptions.getUnderline()));
    }
    if (localTextOptions.f(17)) {
      paramzcjz.a("b", zty.a(localTextOptions.isBold()));
    }
    if (localTextOptions.f(18)) {
      paramzcjz.a("i", zty.a(localTextOptions.isItalic()));
    }
    if (localTextOptions.f(20)) {
      if (localTextOptions.getStrikeType() == 0) {
        paramzcjz.a("strike", "sngStrike");
      } else if (localTextOptions.getStrikeType() == 1) {
        paramzcjz.a("strike", "dblStrike");
      }
    }
    if (localTextOptions.f(47)) {
      if (localTextOptions.getCapsType() == 2) {
        paramzcjz.a("cap", "small");
      } else if (localTextOptions.getCapsType() == 1) {
        paramzcjz.a("cap", "all");
      } else {
        paramzcjz.a("cap", "none");
      }
    }
    if (localTextOptions.f(45)) {
      paramzcjz.a("kern", zauj.z(localTextOptions.w()));
    }
    if (localTextOptions.f(44)) {
      paramzcjz.a("spc", zauj.z(localTextOptions.x()));
    }
    if (localTextOptions.f(23)) {
      paramzcjz.a("baseline", zauj.z(localTextOptions.f()));
    }
    if (localTextOptions.f(46)) {
      paramzcjz.a("normalizeH", zty.a(localTextOptions.isNormalizeHeights()));
    }
    if (localTextOptions.f(26)) {
      paramzcjz.a("kumimoji", zty.a(localTextOptions.y()));
    }
    if (localTextOptions.f(41)) {
      paramzcjz.a("dirty", zty.a(localTextOptions.v()));
    }
    if (localTextOptions.f(42)) {
      paramzcjz.a("err", zty.a(localTextOptions.z()));
    }
    if (localTextOptions.k != null)
    {
      zvl localzvl = new zvl(paramzcjz, localTextOptions.k, paramzuw);
      localzvl.b();
    }
    for (int i = 0; i < localTextOptions.t().getCount(); i++) {
      a(paramzcjz, localTextOptions.t().a(i));
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.a(paramString1, "t", false);
    paramzcjz.a(paramString2);
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zbwj paramzbwj)
    throws Exception
  {
    switch (paramzbwj.a())
    {
    case 0: 
      paramzcjz.b("a:latin");
      break;
    case 2: 
      paramzcjz.b("a:cs");
      break;
    case 1: 
      paramzcjz.b("a:ea");
      break;
    case 3: 
      paramzcjz.b("a:sym");
      break;
    case 4: 
      paramzcjz.b("a:buFont");
      break;
    default: 
      return;
    }
    if (paramzbwj.a != null) {
      paramzcjz.a("typeface", paramzbwj.a);
    }
    if (paramzbwj.d != null) {
      paramzcjz.a("panose", paramzbwj.d);
    }
    if (paramzbwj.b != 0) {
      paramzcjz.a("pitchFamily", zauj.a(paramzbwj.b));
    }
    if (paramzbwj.c != 1) {
      paramzcjz.a("charset", zauj.z(paramzbwj.c));
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */