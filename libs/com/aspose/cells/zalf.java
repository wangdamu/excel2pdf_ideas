package com.aspose.cells;

import java.util.HashMap;

class zalf
{
  static void a(zcjy paramzcjy, FillFormat paramFillFormat)
    throws Exception
  {
    paramFillFormat.setFillType(1);
    paramzcjy.a();
  }
  
  static zaml a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    zaml localzaml = zakf.a(paramzcjy);
    return localzaml;
  }
  
  static void b(zcjy paramzcjy, FillFormat paramFillFormat)
    throws Exception
  {
    paramFillFormat.setFillType(2);
    SolidFill localSolidFill = paramFillFormat.getSolidFill();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    localSolidFill.a = zakf.a(paramzcjy);
  }
  
  static void c(zcjy paramzcjy, FillFormat paramFillFormat)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramFillFormat.setFillType(5);
    PatternFill localPatternFill = paramFillFormat.getPatternFill();
    String str = paramzcjy.a("prst");
    if (str != null) {
      localPatternFill.setPattern(zauj.Y(str));
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if (("fgClr".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        localPatternFill.b = zakf.a(paramzcjy);
      } else if (("bgClr".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        localPatternFill.a = zakf.a(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  static void d(zcjy paramzcjy, FillFormat paramFillFormat)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramFillFormat.setFillType(3);
    GradientFill localGradientFill = paramFillFormat.getGradientFill();
    String str1 = paramzcjy.a("rotWithShape");
    if (str1 != null) {
      localGradientFill.c = ("1".equals(str1));
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("gsLst".equals(paramzcjy.q()))
      {
        b(paramzcjy, localGradientFill);
      }
      else if ("lin".equals(paramzcjy.q()))
      {
        localGradientFill.b = new zadp();
        zadp localzadp = localGradientFill.e();
        String str2 = paramzcjy.a("ang");
        if (str2 != null) {
          localzadp.a = zauj.F(str2);
        }
        String str3 = paramzcjy.a("scaled");
        if ("1".equals(str3)) {
          localzadp.b = true;
        }
        paramzcjy.a();
      }
      else if ("path".equals(paramzcjy.q()))
      {
        localGradientFill.b = new zadq();
        a(paramzcjy, localGradientFill);
      }
      else if ("tileRect".equals(paramzcjy.q()))
      {
        a(paramzcjy, localGradientFill.g());
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, GradientFill paramGradientFill)
    throws Exception
  {
    zadq localzadq = paramGradientFill.f();
    String str = paramzcjy.a("path");
    if (str != null) {
      localzadq.a = zauj.au(str);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("fillToRect".equals(paramzcjy.q())) {
        a(paramzcjy, localzadq);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zadq paramzadq)
    throws Exception
  {
    String str1 = paramzcjy.a("l");
    String str2 = paramzcjy.a("t");
    String str3 = paramzcjy.a("r");
    String str4 = paramzcjy.a("b");
    paramzcjy.a();
    if (str1 != null) {
      paramzadq.b = zauj.F(str1);
    }
    if (str2 != null) {
      paramzadq.c = zauj.F(str2);
    }
    if (str3 != null) {
      paramzadq.e = zauj.F(str3);
    }
    if (str4 != null) {
      paramzadq.d = zauj.F(str4);
    }
  }
  
  private static void b(zcjy paramzcjy, GradientFill paramGradientFill)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("gs".equals(paramzcjy.q()))
      {
        GradientStop localGradientStop = new GradientStop(paramGradientFill.getGradientStops());
        String str = paramzcjy.a("pos");
        if (str != null) {
          localGradientStop.setPosition(zauj.F(str) / 1000.0D);
        }
        localGradientStop.a = zakf.a(paramzcjy);
        paramGradientFill.getGradientStops().a(localGradientStop);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  static void a(zcjy paramzcjy, FillFormat paramFillFormat, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramFillFormat.setFillType(4);
    TextureFill localTextureFill = paramFillFormat.getTextureFill();
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("blip".equals(paramzcjy.q())) {
        a(paramzcjy, localTextureFill, paramHashMap);
      } else if ("stretch".equals(paramzcjy.q())) {
        b(paramzcjy, localTextureFill);
      } else if ("tile".equals(paramzcjy.q())) {
        a(paramzcjy, localTextureFill);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, TextureFill paramTextureFill)
    throws Exception
  {
    paramTextureFill.setTilePicOption(new TilePicOption());
    if (paramzcjy.n())
    {
      TilePicOption localTilePicOption = paramTextureFill.getTilePicOption();
      while (paramzcjy.m()) {
        if ("tx".equals(paramzcjy.q())) {
          localTilePicOption.setOffsetX(zauj.C(paramzcjy.t()));
        } else if ("ty".equals(paramzcjy.q())) {
          localTilePicOption.setOffsetY(zauj.C(paramzcjy.t()));
        } else if ("sx".equals(paramzcjy.q())) {
          localTilePicOption.setScaleX(zauj.C(paramzcjy.t()) / 1000.0D);
        } else if ("sy".equals(paramzcjy.q())) {
          localTilePicOption.setScaleY(zauj.C(paramzcjy.t()) / 1000.0D);
        } else if ("flip".equals(paramzcjy.q())) {
          localTilePicOption.setMirrorType(zauj.aw(paramzcjy.t()));
        } else if ("algn".equals(paramzcjy.q())) {
          localTilePicOption.setAlignmentType(zauj.ax(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private static void a(zcjy paramzcjy, TextureFill paramTextureFill, HashMap paramHashMap)
    throws Exception
  {
    String str1 = paramzcjy.a("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
    if ((str1 == null) || (paramzcjy.o()))
    {
      paramzcjy.a();
      return;
    }
    zrl localzrl = (zrl)paramHashMap.get(str1);
    int i = localzrl.a(true);
    if (i == -1) {
      paramTextureFill.d = localzrl.h;
    } else {
      paramTextureFill.a(localzrl.a(true));
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("alphaModFix".equals(paramzcjy.q()))
      {
        String str2 = paramzcjy.a("amt");
        paramzcjy.a();
        if (str2 != null) {
          paramTextureFill.b(zauj.F(str2));
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private static void b(zcjy paramzcjy, TextureFill paramTextureFill)
    throws Exception
  {
    paramTextureFill.setPicFormatOption(new PicFormatOption());
    PicFormatOption localPicFormatOption = paramTextureFill.getPicFormatOption();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("fillRect".equals(paramzcjy.q()))
      {
        String str1 = paramzcjy.a("l");
        String str2 = paramzcjy.a("t");
        String str3 = paramzcjy.a("r");
        String str4 = paramzcjy.a("b");
        paramzcjy.a();
        if (str1 != null) {
          localPicFormatOption.setLeft(zauj.F(str1));
        }
        if (str2 != null) {
          localPicFormatOption.setTop(zauj.F(str2));
        }
        if (str3 != null) {
          localPicFormatOption.setRight(zauj.F(str3));
        }
        if (str4 != null) {
          localPicFormatOption.setBottom(zauj.F(str4));
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  static void a(zcjy paramzcjy, LineFormat paramLineFormat)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("w".equals(paramzcjy.q())) {
          paramLineFormat.c(zauj.F(paramzcjy.t()));
        } else if ("cap".equals(paramzcjy.q())) {
          paramLineFormat.setCapType(zaui.b(paramzcjy.t()));
        } else if ("cmpd".equals(paramzcjy.q())) {
          paramLineFormat.setCompoundType(zaui.a(paramzcjy.t()));
        } else if ("algn".equals(paramzcjy.q())) {
          paramLineFormat.b(zaui.c(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("noFill".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramLineFormat);
      }
      else if ("solidFill".equals(paramzcjy.q()))
      {
        b(paramzcjy, paramLineFormat);
      }
      else if ("gradFill".equals(paramzcjy.q()))
      {
        d(paramzcjy, paramLineFormat);
      }
      else if ("pattFill".equals(paramzcjy.q()))
      {
        c(paramzcjy, paramLineFormat);
      }
      else if ("prstDash".equals(paramzcjy.q()))
      {
        String str = b(paramzcjy);
        if (str != null) {
          paramLineFormat.setDashStyle(zaui.a(str, paramLineFormat.getCapType()));
        }
      }
      else if ("miter".equals(paramzcjy.q()))
      {
        paramLineFormat.setJoinType(2);
        paramzcjy.a();
      }
      else if ("round".equals(paramzcjy.q()))
      {
        paramLineFormat.setJoinType(0);
        paramzcjy.a();
      }
      else if ("bevel".equals(paramzcjy.q()))
      {
        paramLineFormat.setJoinType(1);
        paramzcjy.a();
      }
      else if ("headEnd".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramLineFormat, true);
      }
      else if ("tailEnd".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramLineFormat, false);
      }
      else if ("custDash".equals(paramzcjy.q()))
      {
        paramLineFormat.setDashStyle(8);
        b(paramzcjy, paramLineFormat);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private static void b(zcjy paramzcjy, LineFormat paramLineFormat)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("ds".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("d");
        int i = 0;
        if (str != null) {
          i = zauj.F(str);
        }
        str = paramzcjy.a("sp");
        int j = 0;
        if (str != null) {
          j = zauj.F(str);
        }
        paramLineFormat.i().a(i, j);
      }
      paramzcjy.a();
    }
  }
  
  private static void a(zcjy paramzcjy, LineFormat paramLineFormat, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("len".equals(paramzcjy.q()))
        {
          if (paramBoolean) {
            paramLineFormat.setBeginArrowheadLength(zaui.f(paramzcjy.t()));
          } else {
            paramLineFormat.setEndArrowheadLength(zaui.f(paramzcjy.t()));
          }
        }
        else if ("type".equals(paramzcjy.q()))
        {
          if (paramBoolean) {
            paramLineFormat.setBeginArrowheadStyle(zaui.d(paramzcjy.t()));
          } else {
            paramLineFormat.setEndArrowheadStyle(zaui.d(paramzcjy.t()));
          }
        }
        else if ("w".equals(paramzcjy.q())) {
          if (paramBoolean) {
            paramLineFormat.setBeginArrowheadWidth(zaui.g(paramzcjy.t()));
          } else {
            paramLineFormat.setEndArrowheadWidth(zaui.g(paramzcjy.t()));
          }
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  static void a(zcjy paramzcjy, zbep paramzbep)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("backdrop".equals(paramzcjy.q())) {
        a(paramzcjy, paramzbep.d());
      } else if ("camera".equals(paramzcjy.q())) {
        a(paramzcjy, paramzbep.a());
      } else if ("lightRig".equals(paramzcjy.q())) {
        b(paramzcjy, paramzbep.b());
      } else {
        paramzcjy.a();
      }
    }
  }
  
  static void a(zcjy paramzcjy, ThreeDFormat paramThreeDFormat)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("backdrop".equals(paramzcjy.q())) {
        a(paramzcjy, paramThreeDFormat.l());
      } else if ("camera".equals(paramzcjy.q())) {
        a(paramzcjy, paramThreeDFormat.j());
      } else if ("lightRig".equals(paramzcjy.q())) {
        b(paramzcjy, paramThreeDFormat.k());
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zcg paramzcg)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("anchor".equals(paramzcjy.q())) {
        a(paramzcjy, paramzcg.b);
      } else if ("norm".equals(paramzcjy.q())) {
        a(paramzcjy, paramzcg.c);
      } else if ("up".equals(paramzcjy.q())) {
        a(paramzcjy, paramzcg.d);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private static void a(zcjy paramzcjy, zaqt paramzaqt)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("dx".equals(paramzcjy.q())) {
          paramzaqt.a = zauj.F(paramzcjy.t());
        } else if ("dy".equals(paramzcjy.q())) {
          paramzaqt.b = zauj.F(paramzcjy.t());
        } else if ("dz".equals(paramzcjy.q())) {
          paramzaqt.c = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private static void a(zcjy paramzcjy, zbeq paramzbeq)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("fov".equals(paramzcjy.q())) {
          paramzbeq.d(zauj.F(paramzcjy.t()));
        } else if ("prst".equals(paramzcjy.q())) {
          paramzbeq.a(zauj.aI(paramzcjy.t()));
        } else if ("zoom".equals(paramzcjy.q())) {
          paramzbeq.c(zauj.F(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("rot".equals(paramzcjy.q())) {
        b(paramzcjy, paramzbeq);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private static void b(zcjy paramzcjy, zbeq paramzbeq)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("lat".equals(paramzcjy.q())) {
          paramzbeq.e(zauj.F(paramzcjy.t()));
        } else if ("lon".equals(paramzcjy.q())) {
          paramzbeq.f(zauj.F(paramzcjy.t()));
        } else if ("rev".equals(paramzcjy.q())) {
          paramzbeq.g(zauj.F(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private static void a(zcjy paramzcjy, zani paramzani)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("lat".equals(paramzcjy.q())) {
          paramzani.c(zauj.F(paramzcjy.t()));
        } else if ("lon".equals(paramzcjy.q())) {
          paramzani.d(zauj.F(paramzcjy.t()));
        } else if ("rev".equals(paramzcjy.q())) {
          paramzani.e(zauj.F(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private static void b(zcjy paramzcjy, zani paramzani)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("rig".equals(paramzcjy.q())) {
          paramzani.a(zauj.aJ(paramzcjy.t()));
        } else if ("dir".equals(paramzcjy.q())) {
          paramzani.b(zauj.aK(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("rot".equals(paramzcjy.q())) {
        a(paramzcjy, paramzani);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  static void a(ThreeDFormat paramThreeDFormat)
    throws Exception
  {
    zcjy localzcjy;
    if (paramThreeDFormat.a != null)
    {
      localzcjy = zauy.a(paramThreeDFormat.a, false);
      localzcjy.a(0);
      localzcjy.d();
      b(localzcjy, paramThreeDFormat);
      paramThreeDFormat.a = null;
    }
    if (paramThreeDFormat.j != null)
    {
      localzcjy = zauy.a(paramThreeDFormat.j, false);
      localzcjy.a(0);
      localzcjy.d();
      a(localzcjy, paramThreeDFormat);
      paramThreeDFormat.j = null;
    }
  }
  
  static void a(zcjy paramzcjy, zbqq paramzbqq)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("z".equals(paramzcjy.q())) {
          paramzbqq.g = zauj.F(paramzcjy.t());
        } else if ("extrusionH".equals(paramzcjy.q())) {
          paramzbqq.f = zauj.F(paramzcjy.t());
        } else if ("contourW".equals(paramzcjy.q())) {
          paramzbqq.e = zauj.F(paramzcjy.t());
        } else if ("prstMaterial".equals(paramzcjy.q())) {
          paramzbqq.a(zauj.aL(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("bevelT".equals(paramzcjy.q())) {
        a(paramzcjy, paramzbqq.d());
      } else if ("bevelB".equals(paramzcjy.q())) {
        a(paramzcjy, paramzbqq.b());
      } else if ("extrusionClr".equals(paramzcjy.q())) {
        paramzbqq.d = zakf.a(paramzcjy);
      } else if ("contourClr".equals(paramzcjy.q())) {
        paramzbqq.c = zakf.a(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  static void b(zcjy paramzcjy, ThreeDFormat paramThreeDFormat)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("z".equals(paramzcjy.q())) {
          paramThreeDFormat.i = zauj.F(paramzcjy.t());
        } else if ("extrusionH".equals(paramzcjy.q())) {
          paramThreeDFormat.g = zauj.F(paramzcjy.t());
        } else if ("contourW".equals(paramzcjy.q())) {
          paramThreeDFormat.e = zauj.F(paramzcjy.t());
        } else if ("prstMaterial".equals(paramzcjy.q())) {
          paramThreeDFormat.c = zauj.aL(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("bevelT".equals(paramzcjy.q())) {
        a(paramzcjy, paramThreeDFormat, false);
      } else if ("bevelB".equals(paramzcjy.q())) {
        a(paramzcjy, paramThreeDFormat, true);
      } else if ("extrusionClr".equals(paramzcjy.q())) {
        paramThreeDFormat.f = zakf.a(paramzcjy);
      } else if ("contourClr".equals(paramzcjy.q())) {
        paramThreeDFormat.d = zakf.a(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, ThreeDFormat paramThreeDFormat, boolean paramBoolean)
    throws Exception
  {
    int i = -1;
    int j = -1;
    int k = 3;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("w".equals(paramzcjy.q())) {
          i = zauj.F(paramzcjy.t());
        } else if ("h".equals(paramzcjy.q())) {
          j = zauj.F(paramzcjy.t());
        } else if ("prst".equals(paramzcjy.q())) {
          k = zauj.aM(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    if (paramBoolean)
    {
      paramThreeDFormat.c(k);
      if (i != -1) {
        paramThreeDFormat.a(i);
      }
      if (j != -1) {
        paramThreeDFormat.b(j);
      }
    }
    else
    {
      paramThreeDFormat.f(k);
      if (i != -1) {
        paramThreeDFormat.d(i);
      }
      if (j != -1) {
        paramThreeDFormat.e(j);
      }
    }
  }
  
  private static void a(zcjy paramzcjy, Bevel paramBevel)
    throws Exception
  {
    paramBevel.a = 76200;
    paramBevel.b = 76200;
    paramBevel.c = 3;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("w".equals(paramzcjy.q())) {
          paramBevel.a = zauj.F(paramzcjy.t());
        } else if ("h".equals(paramzcjy.q())) {
          paramBevel.b = zauj.F(paramzcjy.t());
        } else if ("prst".equals(paramzcjy.q())) {
          paramBevel.c = zauj.aM(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  static void a(zcjy paramzcjy, ShapeFormat paramShapeFormat)
    throws Exception
  {
    paramShapeFormat.e = paramzcjy.v();
  }
  
  static void a(String paramString, ztf paramztf)
    throws Exception
  {
    zcjy localzcjy = zauy.a(paramztf.a, false);
    localzcjy.a(0);
    localzcjy.d();
    a(localzcjy, paramztf);
    paramztf.a = null;
  }
  
  static void a(zcjy paramzcjy, ztf paramztf)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("blur".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramztf.c());
      }
      else if ("glow".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramztf.e());
      }
      else if ("innerShdw".equals(paramzcjy.q()))
      {
        paramztf.h().a(1);
        a(paramzcjy, paramztf.h().b());
      }
      else if ("outerShdw".equals(paramzcjy.q()))
      {
        paramztf.h().a(2);
        a(paramzcjy, paramztf.h().c());
      }
      else if ("prstShdw".equals(paramzcjy.q()))
      {
        paramztf.h().a(3);
        a(paramzcjy, paramztf.h().d());
      }
      else if ("reflection".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramztf.l());
      }
      else if ("softEdge".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("rad");
        if (str != null) {
          paramztf.a(zauj.F(str));
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, ReflectionEffect paramReflectionEffect)
    throws Exception
  {
    paramReflectionEffect.j = false;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("blurRad".equals(paramzcjy.q())) {
          paramReflectionEffect.k = zauj.F(paramzcjy.t());
        } else if ("dist".equals(paramzcjy.q())) {
          paramReflectionEffect.n = zauj.F(paramzcjy.t());
        } else if ("dir".equals(paramzcjy.q())) {
          paramReflectionEffect.m = zauj.F(paramzcjy.t());
        } else if ("sx".equals(paramzcjy.q())) {
          paramReflectionEffect.w = zauj.F(paramzcjy.t());
        } else if ("sy".equals(paramzcjy.q())) {
          paramReflectionEffect.x = zauj.F(paramzcjy.t());
        } else if ("kx".equals(paramzcjy.q())) {
          paramReflectionEffect.r = zauj.F(paramzcjy.t());
        } else if ("ky".equals(paramzcjy.q())) {
          paramReflectionEffect.s = zauj.F(paramzcjy.t());
        } else if ("algn".equals(paramzcjy.q())) {
          paramReflectionEffect.l = zauj.ax(paramzcjy.t());
        } else if ("rotWithShape".equals(paramzcjy.q())) {
          paramReflectionEffect.t = (!"0".equals(paramzcjy.t()));
        } else if ("fadeDir".equals(paramzcjy.q())) {
          paramReflectionEffect.q = zauj.F(paramzcjy.t());
        } else if ("stA".equals(paramzcjy.q())) {
          paramReflectionEffect.u = zauj.F(paramzcjy.t());
        } else if ("stPos".equals(paramzcjy.q())) {
          paramReflectionEffect.v = zauj.F(paramzcjy.t());
        } else if ("endA".equals(paramzcjy.q())) {
          paramReflectionEffect.o = zauj.F(paramzcjy.t());
        } else if ("endPos".equals(paramzcjy.q())) {
          paramReflectionEffect.p = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private static void a(zcjy paramzcjy, zapz paramzapz)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("prst".equals(paramzcjy.q())) {
          paramzapz.e = paramzcjy.t();
        } else if ("dist".equals(paramzcjy.q())) {
          paramzapz.d = zauj.F(paramzcjy.t());
        } else if ("dir".equals(paramzcjy.q())) {
          paramzapz.c = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzapz.b = zakf.a(paramzcjy);
  }
  
  private static void a(zcjy paramzcjy, zaun paramzaun)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("blurRad".equals(paramzcjy.q())) {
          paramzaun.e = zauj.F(paramzcjy.t());
        } else if ("dist".equals(paramzcjy.q())) {
          paramzaun.d = zauj.F(paramzcjy.t());
        } else if ("dir".equals(paramzcjy.q())) {
          paramzaun.c = zauj.F(paramzcjy.t());
        } else if ("sx".equals(paramzcjy.q())) {
          paramzaun.j = zauj.F(paramzcjy.t());
        } else if ("sy".equals(paramzcjy.q())) {
          paramzaun.k = zauj.F(paramzcjy.t());
        } else if ("kx".equals(paramzcjy.q())) {
          paramzaun.g = zauj.F(paramzcjy.t());
        } else if ("ky".equals(paramzcjy.q())) {
          paramzaun.h = zauj.F(paramzcjy.t());
        } else if ("algn".equals(paramzcjy.q())) {
          paramzaun.f = zauj.ax(paramzcjy.t());
        } else if ("rotWithShape".equals(paramzcjy.q())) {
          paramzaun.i = (!"0".equals(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzaun.b = zakf.a(paramzcjy);
  }
  
  private static void a(zcjy paramzcjy, zamg paramzamg)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("blurRad".equals(paramzcjy.q())) {
          paramzamg.e = zauj.F(paramzcjy.t());
        } else if ("dist".equals(paramzcjy.q())) {
          paramzamg.d = zauj.F(paramzcjy.t());
        } else if ("dir".equals(paramzcjy.q())) {
          paramzamg.c = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzamg.b = zakf.a(paramzcjy);
  }
  
  private static void a(zcjy paramzcjy, GlowEffect paramGlowEffect)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("rad".equals(paramzcjy.q())) {
          paramGlowEffect.c = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramGlowEffect.b = zakf.a(paramzcjy);
  }
  
  private static void a(zcjy paramzcjy, zdf paramzdf)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("rad".equals(paramzcjy.q())) {
          paramzdf.a = zauj.F(paramzcjy.t());
        } else if ("grow".equals(paramzcjy.q())) {
          paramzdf.a(!"0".equals(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private static String b(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("val");
    paramzcjy.a();
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */