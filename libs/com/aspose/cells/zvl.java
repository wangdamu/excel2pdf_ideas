package com.aspose.cells;

import com.aspose.cells.b.a.zr;
import java.util.Iterator;

class zvl
{
  zuw a;
  ShapeFormat b;
  zcjz c;
  
  zvl(zcjz paramzcjz, ShapeFormat paramShapeFormat, zuw paramzuw)
  {
    this.c = paramzcjz;
    this.a = paramzuw;
    this.b = paramShapeFormat;
  }
  
  void a()
    throws Exception
  {
    a(this.b.a(), this.b.a);
    c();
    a(this.c, this.b.d);
    b(this.c, this.b.c);
    a(this.c, this.b.c);
    if (this.b.h != null) {
      this.c.d(this.b.h);
    }
  }
  
  void b()
    throws Exception
  {
    c();
    a(this.b.a(), this.b.a);
    a(this.c, this.b.d);
    b(this.c, this.b.c);
    a(this.c, this.b.c);
  }
  
  static void a(zcjz paramzcjz, ztf paramztf)
    throws Exception
  {
    if (paramztf == null) {
      return;
    }
    if (paramztf.a != null)
    {
      paramzcjz.d(paramztf.a);
      return;
    }
    if (paramztf.b()) {
      return;
    }
    paramzcjz.c("a:effectLst", null);
    if (paramztf.d() != null) {
      a(paramzcjz, paramztf.d());
    }
    if (paramztf.f() != null) {
      a(paramzcjz, paramztf.f());
    }
    if (paramztf.c != null)
    {
      ShadowEffect localShadowEffect = paramztf.c;
      switch (localShadowEffect.a())
      {
      case 1: 
        a(paramzcjz, localShadowEffect.b());
        break;
      case 3: 
        a(paramzcjz, localShadowEffect.d());
        break;
      case 2: 
        a(paramzcjz, localShadowEffect.c());
        break;
      }
    }
    if (paramztf.d != null) {
      a(paramzcjz, paramztf.d);
    }
    if (paramztf.m() >= 0)
    {
      paramzcjz.c("a:softEdge", null);
      paramzcjz.a("rad", zauj.z(paramztf.m()));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, ReflectionEffect paramReflectionEffect)
    throws Exception
  {
    paramzcjz.c("a:reflection", null);
    if (paramReflectionEffect.k != 0) {
      paramzcjz.a("blurRad", zauj.z(paramReflectionEffect.k));
    }
    if (paramReflectionEffect.u != 100000) {
      paramzcjz.a("stA", zauj.z(paramReflectionEffect.u));
    }
    if (paramReflectionEffect.v != 0) {
      paramzcjz.a("stPos", zauj.z(paramReflectionEffect.v));
    }
    if (paramReflectionEffect.o != 0) {
      paramzcjz.a("endA", zauj.z(paramReflectionEffect.o));
    }
    if (paramReflectionEffect.p != 100000) {
      paramzcjz.a("endPos", zauj.z(paramReflectionEffect.p));
    }
    if (paramReflectionEffect.n != 0) {
      paramzcjz.a("dist", zauj.z(paramReflectionEffect.n));
    }
    if (paramReflectionEffect.m != 0.0D) {
      paramzcjz.a("dir", zauj.b(paramReflectionEffect.m));
    }
    if (paramReflectionEffect.q != 0.0D) {
      paramzcjz.a("fadeDir", zauj.b(paramReflectionEffect.q));
    }
    if (paramReflectionEffect.w != 100000.0D) {
      paramzcjz.a("sx", zauj.b(paramReflectionEffect.w));
    }
    if (paramReflectionEffect.x != 100000.0D) {
      paramzcjz.a("sy", zauj.b(paramReflectionEffect.x));
    }
    if (paramReflectionEffect.r != 0.0D) {
      paramzcjz.a("kx", zauj.b(paramReflectionEffect.r));
    }
    if (paramReflectionEffect.s != 0.0D) {
      paramzcjz.a("ky", zauj.b(paramReflectionEffect.s));
    }
    if (paramReflectionEffect.l != 0) {
      paramzcjz.a("algn", zauj.ap(paramReflectionEffect.l));
    }
    if (!paramReflectionEffect.t) {
      paramzcjz.a("rotWithShape", "0");
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zapz paramzapz)
    throws Exception
  {
    paramzcjz.c("a:prstShdw", null);
    if ((paramzapz.e != null) && (paramzapz.e.length() != 0)) {
      paramzcjz.a("prst", paramzapz.e);
    }
    if (paramzapz.d != 0) {
      paramzcjz.a("dist", zauj.z(paramzapz.d));
    }
    if (paramzapz.c != 0) {
      paramzcjz.a("dir", zauj.z(paramzapz.c));
    }
    if (paramzapz.b != null) {
      a(paramzcjz, paramzapz.b, paramzapz.a.e(), false);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zaun paramzaun)
    throws Exception
  {
    paramzcjz.c("a:outerShdw", null);
    if (paramzaun.e != 0) {
      paramzcjz.a("blurRad", zauj.z(paramzaun.e));
    }
    if (paramzaun.d != 0) {
      paramzcjz.a("dist", zauj.z(paramzaun.d));
    }
    if (paramzaun.c != 0) {
      paramzcjz.a("dir", zauj.z(paramzaun.c));
    }
    if (paramzaun.j != 100000) {
      paramzcjz.a("sx", zauj.z(paramzaun.j));
    }
    if (paramzaun.k != 100000) {
      paramzcjz.a("sy", zauj.z(paramzaun.k));
    }
    if (paramzaun.g != 0) {
      paramzcjz.a("kx", zauj.z(paramzaun.g));
    }
    if (paramzaun.h != 0) {
      paramzcjz.a("ky", zauj.z(paramzaun.h));
    }
    if (paramzaun.f != 0) {
      paramzcjz.a("algn", zauj.ap(paramzaun.f));
    }
    if (!paramzaun.i) {
      paramzcjz.a("rotWithShape", "0");
    }
    if (paramzaun.b != null)
    {
      boolean bool = a(paramzaun.b());
      a(paramzcjz, paramzaun.b, paramzaun.a.e(), bool);
    }
    paramzcjz.b();
  }
  
  private static boolean a(CellsColor paramCellsColor)
  {
    return (!paramCellsColor.a.b()) && (paramCellsColor.a.c() == 2) && (paramCellsColor.a.e() == 0);
  }
  
  private static void a(zcjz paramzcjz, zamg paramzamg)
    throws Exception
  {
    paramzcjz.c("a:innerShdw", null);
    if (paramzamg.e != 0) {
      paramzcjz.a("blurRad", zauj.z(paramzamg.e));
    }
    if (paramzamg.d != 0) {
      paramzcjz.a("dist", zauj.z(paramzamg.d));
    }
    if (paramzamg.c != 0) {
      paramzcjz.a("dir", zauj.z(paramzamg.c));
    }
    if (paramzamg.b != null)
    {
      boolean bool = a(paramzamg.b());
      a(paramzcjz, paramzamg.b, paramzamg.a.e(), bool);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, GlowEffect paramGlowEffect)
    throws Exception
  {
    if (!paramGlowEffect.a()) {
      return;
    }
    paramzcjz.c("a:glow", null);
    if (paramGlowEffect.c != 0) {
      paramzcjz.a("rad", zauj.z(paramGlowEffect.c));
    }
    if (paramGlowEffect.b != null) {
      a(paramzcjz, paramGlowEffect.b, paramGlowEffect.a.a(), false);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zdf paramzdf)
    throws Exception
  {
    paramzcjz.c("a:blur", null);
    if (paramzdf.a != 0) {
      paramzcjz.a("rad", zauj.z(paramzdf.a));
    }
    if (!paramzdf.a()) {
      paramzcjz.a("grow", "0");
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, zbqq paramzbqq)
    throws Exception
  {
    if (paramzbqq == null) {
      return;
    }
    if (paramzbqq.b != null)
    {
      paramzcjz.d(paramzbqq.b);
      return;
    }
    paramzcjz.c("a:sp3d", null);
    if (paramzbqq.g != 0) {
      paramzcjz.a("z", zauj.z(paramzbqq.g));
    }
    if (paramzbqq.f != 0) {
      paramzcjz.a("extrusionH", zauj.z(paramzbqq.f));
    }
    if (paramzbqq.e != 0) {
      paramzcjz.a("contourW", zauj.z(paramzbqq.e));
    }
    if (paramzbqq.e() != 14) {
      paramzcjz.a("prstMaterial", zauj.aA(paramzbqq.e()));
    }
    if (paramzbqq.c() != null) {
      a(paramzcjz, paramzbqq.c(), "bevelT");
    }
    if (paramzbqq.a() != null) {
      a(paramzcjz, paramzbqq.a(), "bevelB");
    }
    if (paramzbqq.d != null)
    {
      paramzcjz.c("a:extrusionClr", null);
      a(paramzcjz, paramzbqq.d, -1, paramzbqq.a);
      paramzcjz.b();
    }
    if (paramzbqq.c != null)
    {
      paramzcjz.c("a:contourClr", null);
      a(paramzcjz, paramzbqq.c, -1, paramzbqq.a);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, ThreeDFormat paramThreeDFormat)
    throws Exception
  {
    if (paramThreeDFormat == null) {
      return;
    }
    if (paramThreeDFormat.a != null)
    {
      paramzcjz.d(paramThreeDFormat.a);
      return;
    }
    if (!paramThreeDFormat.i()) {
      return;
    }
    paramzcjz.c("a:sp3d", null);
    if (paramThreeDFormat.i != 0) {
      paramzcjz.a("z", zauj.z(paramThreeDFormat.i));
    }
    if (paramThreeDFormat.g != 0) {
      paramzcjz.a("extrusionH", zauj.z(paramThreeDFormat.g));
    }
    if (paramThreeDFormat.e != 0) {
      paramzcjz.a("contourW", zauj.z(paramThreeDFormat.e));
    }
    if (paramThreeDFormat.getMaterial() != 14) {
      paramzcjz.a("prstMaterial", zauj.aA(paramThreeDFormat.getMaterial()));
    }
    c(paramzcjz, paramThreeDFormat);
    d(paramzcjz, paramThreeDFormat);
    if (paramThreeDFormat.f != null)
    {
      paramzcjz.c("a:extrusionClr", null);
      a(paramzcjz, paramThreeDFormat.f, -1, paramThreeDFormat.a());
      paramzcjz.b();
    }
    if (paramThreeDFormat.d != null)
    {
      paramzcjz.c("a:contourClr", null);
      a(paramzcjz, paramThreeDFormat.d, -1, paramThreeDFormat.a());
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private static void c(zcjz paramzcjz, ThreeDFormat paramThreeDFormat)
    throws Exception
  {
    if (paramThreeDFormat.g() == 0) {
      return;
    }
    paramzcjz.c("a:bevelT", null);
    if (paramThreeDFormat.e() != 76200) {
      paramzcjz.a("w", zauj.z(paramThreeDFormat.e()));
    }
    if (paramThreeDFormat.f() != 76200) {
      paramzcjz.a("h", zauj.z(paramThreeDFormat.f()));
    }
    if (paramThreeDFormat.g() != 3) {
      paramzcjz.a("prst", zauj.aB(paramThreeDFormat.g()));
    }
    paramzcjz.b();
  }
  
  private static void d(zcjz paramzcjz, ThreeDFormat paramThreeDFormat)
    throws Exception
  {
    if (paramThreeDFormat.d() == 0) {
      return;
    }
    paramzcjz.c("a:bevelB", null);
    if (paramThreeDFormat.b() != 76200) {
      paramzcjz.a("w", zauj.z(paramThreeDFormat.b()));
    }
    if (paramThreeDFormat.c() != 76200) {
      paramzcjz.a("h", zauj.z(paramThreeDFormat.c()));
    }
    if (paramThreeDFormat.d() != 3) {
      paramzcjz.a("prst", zauj.aB(paramThreeDFormat.d()));
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, Bevel paramBevel, String paramString)
    throws Exception
  {
    if (paramBevel.getType() == 0) {
      return;
    }
    paramzcjz.c("a:" + paramString, null);
    if (paramBevel.a != 76200) {
      paramzcjz.a("w", zauj.z(paramBevel.a));
    }
    if (paramBevel.b != 76200) {
      paramzcjz.a("h", zauj.z(paramBevel.b));
    }
    if (paramBevel.getType() != 3) {
      paramzcjz.a("prst", zauj.aB(paramBevel.a()));
    }
    paramzcjz.b();
  }
  
  void a(int paramInt, FillFormat paramFillFormat)
    throws Exception
  {
    Fill localFill = paramFillFormat == null ? null : paramFillFormat.a;
    switch (paramInt)
    {
    case 6: 
      this.c.b("a:grpFill", null);
      break;
    case 1: 
      this.c.b("a:noFill", null);
      break;
    case 3: 
      a(this.c, (GradientFill)localFill, this.b.f);
      break;
    case 5: 
      a(this.c, (PatternFill)localFill, this.b.f);
      break;
    case 2: 
      a(this.c, (SolidFill)localFill, this.b.f);
      break;
    case 4: 
      a(this.c, (TextureFill)localFill, this.a.a((TextureFill)localFill));
      break;
    }
  }
  
  static void a(zcjz paramzcjz, TextureFill paramTextureFill, String paramString)
    throws Exception
  {
    paramzcjz.c("a:blipFill", null);
    paramzcjz.c("a:blip", null);
    paramzcjz.a("r:embed", paramString);
    if (paramTextureFill.e() != 100000)
    {
      paramzcjz.c("a:alphaModFix", null);
      paramzcjz.a("amt", zauj.z(paramTextureFill.e()));
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.b("a:srcRect", null);
    if (paramTextureFill.isTiling()) {
      a(paramzcjz, paramTextureFill);
    } else {
      b(paramzcjz, paramTextureFill);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, TextureFill paramTextureFill)
    throws Exception
  {
    TilePicOption localTilePicOption = paramTextureFill.getTilePicOption();
    paramzcjz.c("a:tile", null);
    if (localTilePicOption.getOffsetX() != 0.0D) {
      paramzcjz.a("tx", zauj.z((int)localTilePicOption.getOffsetX()));
    }
    if (localTilePicOption.getOffsetY() != 0.0D) {
      paramzcjz.a("ty", zauj.z((int)localTilePicOption.getOffsetY()));
    }
    if (localTilePicOption.getScaleX() != 0.0D) {
      paramzcjz.a("sx", zauj.z((int)localTilePicOption.getScaleX() * 1000));
    }
    if (localTilePicOption.getScaleY() != 0.0D) {
      paramzcjz.a("sy", zauj.z((int)localTilePicOption.getScaleY() * 1000));
    }
    paramzcjz.a("flip", zauj.ao(localTilePicOption.getMirrorType()));
    paramzcjz.a("algn", zauj.ap(localTilePicOption.getAlignmentType()));
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, TextureFill paramTextureFill)
    throws Exception
  {
    PicFormatOption localPicFormatOption = paramTextureFill.getPicFormatOption();
    paramzcjz.c("a:stretch", null);
    paramzcjz.c("a:fillRect", null);
    if (localPicFormatOption.e() != 0.0D) {
      paramzcjz.a("l", zauj.z(localPicFormatOption.e()));
    }
    if (localPicFormatOption.f() != 0.0D) {
      paramzcjz.a("t", zauj.z(localPicFormatOption.f()));
    }
    if (localPicFormatOption.g() != 0.0D) {
      paramzcjz.a("r", zauj.z(localPicFormatOption.g()));
    }
    if (localPicFormatOption.h() != 0.0D) {
      paramzcjz.a("b", zauj.z(localPicFormatOption.h()));
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, PatternFill paramPatternFill, Workbook paramWorkbook)
    throws Exception
  {
    String str = zauj.S(paramPatternFill.getPattern());
    paramzcjz.c("a:pattFill", null);
    paramzcjz.a("prst", str);
    paramzcjz.c("a:fgClr", null);
    int i = paramPatternFill.e() == 100 ? -1 : paramPatternFill.e() * 1000;
    a(paramzcjz, paramPatternFill.b, i, paramWorkbook);
    paramzcjz.b();
    paramzcjz.c("a:bgClr", null);
    i = paramPatternFill.f() == 100 ? -1 : paramPatternFill.f() * 1000;
    a(paramzcjz, paramPatternFill.a, i, paramWorkbook);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, GradientFill paramGradientFill, Workbook paramWorkbook)
    throws Exception
  {
    paramzcjz.c("a:gradFill", null);
    String str = paramGradientFill.c ? "1" : "0";
    paramzcjz.a("rotWithShape", str);
    if (paramGradientFill.getGradientStops().getCount() > 0)
    {
      paramzcjz.c("a:gsLst", null);
      for (int i = 0; i < paramGradientFill.getGradientStops().getCount(); i++)
      {
        GradientStop localGradientStop = paramGradientFill.getGradientStops().get(i);
        paramzcjz.c("a:gs", null);
        paramzcjz.a("pos", zauj.a(zr.a(localGradientStop.getPosition() * 1000.0D)));
        a(paramzcjz, localGradientStop.a, -1, paramWorkbook);
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    if (paramGradientFill.b != null) {
      if (paramGradientFill.d())
      {
        paramzcjz.c("a:lin", null);
        paramzcjz.a("ang", zauj.z(paramGradientFill.e().a));
        if (paramGradientFill.e().b) {
          paramzcjz.a("scaled", "1");
        }
        paramzcjz.b();
      }
      else
      {
        zadq localzadq = paramGradientFill.f();
        paramzcjz.c("a:path", null);
        paramzcjz.a("path", zauj.al(localzadq.a));
        a(paramzcjz, localzadq, "fillToRect");
        paramzcjz.b();
      }
    }
    if (paramGradientFill.h() != null) {
      a(paramzcjz, paramGradientFill.h(), "tileRect");
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zadq paramzadq, String paramString)
    throws Exception
  {
    paramzcjz.c("a:" + paramString, null);
    if (paramzadq.b != 0) {
      paramzcjz.a("l", zauj.z(paramzadq.b));
    }
    if (paramzadq.c != 0) {
      paramzcjz.a("t", zauj.z(paramzadq.c));
    }
    if (paramzadq.e != 0) {
      paramzcjz.a("r", zauj.z(paramzadq.e));
    }
    if (paramzadq.d != 0) {
      paramzcjz.a("b", zauj.z(paramzadq.d));
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, SolidFill paramSolidFill, Workbook paramWorkbook)
    throws Exception
  {
    paramzcjz.c("a:solidFill", null);
    a(paramzcjz, paramSolidFill.a, -1, paramWorkbook);
    paramzcjz.b();
  }
  
  void c()
    throws Exception
  {
    if (this.b.b == null) {
      return;
    }
    this.c.b("a:ln");
    LineFormat localLineFormat = this.b.b;
    if ((localLineFormat != null) && (localLineFormat.e != 0))
    {
      if (localLineFormat.e(0)) {
        this.c.a("w", zauj.z(localLineFormat.j()));
      }
      if (localLineFormat.e(3)) {
        this.c.a("cap", zaui.c(localLineFormat.getCapType()));
      }
      if (localLineFormat.e(1)) {
        this.c.a("cmpd", zaui.a(localLineFormat.getCompoundType()));
      }
      if (localLineFormat.e(11)) {
        this.c.a("algn", zaui.d(localLineFormat.h()));
      }
    }
    if (this.b.b.a != null) {
      a(this.b.b(), this.b.b);
    }
    if (localLineFormat != null)
    {
      a(this.c, localLineFormat);
      b(this.c, localLineFormat);
      a(this.c, localLineFormat, true);
      a(this.c, localLineFormat, false);
    }
    this.c.b();
  }
  
  private void a(zcjz paramzcjz, LineFormat paramLineFormat)
    throws Exception
  {
    if (paramLineFormat.e(2))
    {
      Object localObject;
      if (paramLineFormat.getDashStyle() == 8)
      {
        if ((paramLineFormat.d != null) && (paramLineFormat.d.getCount() > 0))
        {
          paramzcjz.b("a:custDash");
          localObject = paramLineFormat.d.iterator();
          while (((Iterator)localObject).hasNext())
          {
            zoq localzoq = (zoq)((Iterator)localObject).next();
            paramzcjz.b("a:ds");
            paramzcjz.a("d", zauj.z(localzoq.a));
            paramzcjz.a("sp", zauj.z(localzoq.b));
            paramzcjz.b();
          }
          paramzcjz.b();
        }
      }
      else
      {
        localObject = zaui.b(paramLineFormat.getDashStyle());
        paramzcjz.b("a:prstDash");
        paramzcjz.a("val", (String)localObject);
        paramzcjz.b();
      }
    }
  }
  
  private void a(zcjz paramzcjz, LineFormat paramLineFormat, boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean)
    {
      if ((paramLineFormat.e(5)) || (paramLineFormat.e(6)))
      {
        paramzcjz.b("a:headEnd");
        if (paramLineFormat.e(5)) {
          paramzcjz.a("type", zaui.e(paramLineFormat.getBeginArrowheadStyle()));
        }
        if (paramLineFormat.e(6))
        {
          paramzcjz.a("len", zaui.f(paramLineFormat.getBeginArrowheadLength()));
          paramzcjz.a("w", zaui.g(paramLineFormat.getBeginArrowheadWidth()));
        }
        paramzcjz.b();
      }
    }
    else if ((paramLineFormat.e(8)) || (paramLineFormat.e(9)))
    {
      paramzcjz.b("a:tailEnd");
      if (paramLineFormat.e(8)) {
        paramzcjz.a("type", zaui.e(paramLineFormat.getEndArrowheadStyle()));
      }
      if (paramLineFormat.e(9))
      {
        paramzcjz.a("len", zaui.f(paramLineFormat.getEndArrowheadLength()));
        paramzcjz.a("w", zaui.g(paramLineFormat.getEndArrowheadWidth()));
      }
      paramzcjz.b();
    }
  }
  
  private void b(zcjz paramzcjz, LineFormat paramLineFormat)
    throws Exception
  {
    if (paramLineFormat.e(4)) {
      switch (paramLineFormat.getJoinType())
      {
      case 1: 
        paramzcjz.b("a:bevel", null);
        break;
      case 2: 
        paramzcjz.c("a:miter", null);
        paramzcjz.a("lim", "800000");
        paramzcjz.b();
        break;
      case 0: 
        paramzcjz.b("a:round", null);
        break;
      }
    }
  }
  
  static void a(zcjz paramzcjz, zaml paramzaml, Workbook paramWorkbook, boolean paramBoolean)
    throws Exception
  {
    int i = 0;
    Object localObject;
    if (paramBoolean)
    {
      localObject = zauj.aC(paramzaml.c(paramWorkbook));
      if (localObject != null)
      {
        paramzcjz.c("a", "prstClr", null);
        paramzcjz.a("val", (String)localObject);
        i = 1;
      }
    }
    if (i == 0) {
      if (paramzaml.c() == 4)
      {
        paramzcjz.c("a", "schemeClr", null);
        paramzcjz.a("val", zauj.ah(paramzaml.e()));
      }
      else
      {
        paramzcjz.c("a", "srgbClr", null);
        if (paramzaml.c() == 2) {
          paramzcjz.a("val", zauj.a(Color.fromArgb(paramzaml.e())));
        } else {
          paramzcjz.a("val", zauj.a(paramzaml.b(paramWorkbook)));
        }
      }
    }
    if (paramzaml.k() != null)
    {
      localObject = paramzaml.l().iterator();
      while (((Iterator)localObject).hasNext())
      {
        zlf localzlf = (zlf)((Iterator)localObject).next();
        String str = a(localzlf.a);
        if (str != null) {
          if ((localzlf.a != 23) && (localzlf.a != 24)) {
            a(paramzcjz, "a", str, zauj.z(localzlf.b));
          } else {
            paramzcjz.b("a:" + str, null);
          }
        }
      }
    }
    paramzcjz.b();
  }
  
  static void a(zcjz paramzcjz, zaml paramzaml, int paramInt, Workbook paramWorkbook)
    throws Exception
  {
    a(paramzcjz, paramzaml, paramInt, paramWorkbook, false);
  }
  
  static void a(zcjz paramzcjz, zaml paramzaml, int paramInt, Workbook paramWorkbook, boolean paramBoolean)
    throws Exception
  {
    int i = 0;
    if (paramBoolean)
    {
      String str1 = zauj.aC(paramzaml.c(paramWorkbook));
      if (str1 != null)
      {
        paramzcjz.c("a", "prstClr", null);
        paramzcjz.a("val", str1);
        i = 1;
      }
    }
    if (i == 0) {
      if (paramzaml.c() == 4)
      {
        paramzcjz.c("a", "schemeClr", null);
        paramzcjz.a("val", zauj.ah(paramzaml.e()));
      }
      else
      {
        paramzcjz.c("a", "srgbClr", null);
        if (paramzaml.c() == 2) {
          paramzcjz.a("val", zauj.a(Color.fromArgb(paramzaml.e())));
        } else {
          paramzcjz.a("val", zauj.a(paramzaml.b(paramWorkbook)));
        }
      }
    }
    boolean bool = false;
    if (paramInt != -1) {
      bool = a(paramzaml, paramInt);
    }
    if (paramzaml.k() != null)
    {
      Iterator localIterator = paramzaml.l().iterator();
      while (localIterator.hasNext())
      {
        zlf localzlf = (zlf)localIterator.next();
        String str2 = a(localzlf.a);
        if (str2 != null) {
          if ((localzlf.a != 23) && (localzlf.a != 24)) {
            a(paramzcjz, "a", str2, zauj.z(localzlf.b));
          } else {
            paramzcjz.b("a:" + str2, null);
          }
        }
      }
    }
    if (bool) {
      paramzaml.l().c(2);
    }
    paramzcjz.b();
  }
  
  private static boolean a(zaml paramzaml, int paramInt)
  {
    if (paramInt != -1)
    {
      zlf localzlf = paramzaml.l().b(2);
      if (localzlf != null)
      {
        localzlf.b = paramInt;
      }
      else
      {
        paramzaml.l().a(2, paramInt);
        return true;
      }
    }
    return false;
  }
  
  private static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "alpha";
    case 3: 
      return "alphaMod";
    case 4: 
      return "alphaOff";
    case 5: 
      return "red";
    case 6: 
      return "redMod";
    case 7: 
      return "redOff";
    case 8: 
      return "green";
    case 9: 
      return "greenMod";
    case 10: 
      return "greenOff";
    case 11: 
      return "blue";
    case 12: 
      return "blueMod";
    case 13: 
      return "blueOff";
    case 14: 
      return "hue";
    case 15: 
      return "hueMod";
    case 16: 
      return "hueOff";
    case 17: 
      return "sat";
    case 18: 
      return "satMod";
    case 19: 
      return "satOff";
    case 20: 
      return "lum";
    case 21: 
      return "lumMod";
    case 22: 
      return "lumOff";
    case 1: 
      return "shade";
    case 0: 
      return "tint";
    case 25: 
      return "comp";
    case 27: 
      return "inv";
    case 23: 
      return "gamma";
    case 24: 
      return "invGamma";
    case 26: 
      return "gray";
    }
    return null;
  }
  
  static void a(zcjz paramzcjz, zbep paramzbep)
    throws Exception
  {
    if (paramzbep == null) {
      return;
    }
    if (paramzbep.a != null)
    {
      paramzcjz.d(paramzbep.a);
      return;
    }
    paramzcjz.c("a:scene3d", null);
    a(paramzcjz, paramzbep.a());
    a(paramzcjz, paramzbep.b());
    if (paramzbep.c() != null) {
      a(paramzcjz, paramzbep.c());
    }
    paramzcjz.b();
  }
  
  static void b(zcjz paramzcjz, ThreeDFormat paramThreeDFormat)
    throws Exception
  {
    if (paramThreeDFormat == null) {
      return;
    }
    if (paramThreeDFormat.j != null)
    {
      paramzcjz.d(paramThreeDFormat.j);
      return;
    }
    if (!paramThreeDFormat.h()) {
      return;
    }
    paramzcjz.c("a:scene3d", null);
    a(paramzcjz, paramThreeDFormat.k);
    a(paramzcjz, paramThreeDFormat.l);
    if (paramThreeDFormat.n != null) {
      a(paramzcjz, paramThreeDFormat.n);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zcg paramzcg)
    throws Exception
  {
    paramzcjz.c("a:backdrop", null);
    a(paramzcjz, paramzcg.b, "anchor", "");
    a(paramzcjz, paramzcg.c, "norm", "d");
    a(paramzcjz, paramzcg.d, "up", "d");
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zaqt paramzaqt, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.c("a:" + paramString1, null);
    paramzcjz.a(paramString2 + "x", zauj.z(paramzaqt.a));
    paramzcjz.a(paramString2 + "y", zauj.z(paramzaqt.b));
    paramzcjz.a(paramString2 + "z", zauj.z(paramzaqt.c));
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zani paramzani)
    throws Exception
  {
    if ((paramzani == null) || (paramzani.a() == 27)) {
      return;
    }
    paramzcjz.c("a:lightRig", null);
    paramzcjz.a("rig", zauj.ay(paramzani.a()));
    paramzcjz.a("dir", zauj.az(paramzani.b()));
    if (paramzani.f(56))
    {
      paramzcjz.c("a:rot", null);
      paramzcjz.a("lat", zauj.z(paramzani.c()));
      paramzcjz.a("lon", zauj.z(paramzani.d()));
      paramzcjz.a("rev", zauj.z(paramzani.e()));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zbeq paramzbeq)
    throws Exception
  {
    if (paramzbeq == null) {
      return;
    }
    paramzcjz.c("a:camera", null);
    paramzcjz.a("prst", zauj.ax(paramzbeq.a));
    if (paramzbeq.h(4)) {
      paramzcjz.a("fov", zauj.z(paramzbeq.c));
    }
    if (paramzbeq.h(2)) {
      paramzcjz.a("zoom", zauj.z(paramzbeq.b));
    }
    if (paramzbeq.h(56))
    {
      paramzcjz.c("a:rot", null);
      if (paramzbeq.h(8)) {
        paramzcjz.a("lat", zauj.z(paramzbeq.d));
      }
      if (paramzbeq.h(16)) {
        paramzcjz.a("lon", zauj.z(paramzbeq.e));
      }
      if (paramzbeq.h(32)) {
        paramzcjz.a("rev", zauj.z(paramzbeq.f));
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    paramzcjz.c(paramString1 + ":" + paramString2, null);
    paramzcjz.a("val", paramString3);
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */