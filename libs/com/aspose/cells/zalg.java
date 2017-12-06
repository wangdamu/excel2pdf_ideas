package com.aspose.cells;

import com.aspose.cells.a.c.zw;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zalg
{
  private zcjy a;
  private FontSettingCollection b;
  private HashMap c;
  private int d;
  private StringBuilder e;
  private WorksheetCollection f;
  private Object g;
  private TextParagraph h = null;
  private zbsy i = null;
  private static final za j = new za(new String[] { "bodyPr", "lstStyle", "p", "lvl1pPr", "lvl2pPr", "lvl3pPr", "lvl4pPr", "lvl5pPr", "lvl6pPr", "lvl7pPr", "lvl8pPr", "lvl9pPr", "lIns", "tIns", "rIns", "bIns", "vertOverflow", "horzOverflow", "anchor", "anchorCtr", "vert", "wrap", "upright", "rot", "fromWordArt", "spAutoFit", "noAutofit", "normAutofit", "prstTxWarp", "scene3d", "sp3d", "flatTx", "pPr", "br", "r", "fld", "defRPr", "endParaRPr", "m", "algn", "defTabSz", "fontAlgn", "indent", "lvl", "marL", "marR", "hangingPunct", "eaLnBrk", "latinLnBrk", "rtl", "buAutoNum", "buClr", "buClrTx", "buFont", "buFontTx", "buNone", "buChar", "buSzPct", "buSzPts", "buSzTx", "lnSpc", "spcAft", "spcBef", "tabLst", "extLst", "tab", "spcPct", "spcPts", "rPr", "t", "altLang", "lang", "sz", "u", "b", "i", "strike", "cap", "kern", "spc", "baseline", "normalizeH", "kumimoji", "dirty", "err", "smtClean", "smtId", "bmk", "noProof", "blipFill", "gradFill", "noFill", "solidFill", "pattFill", "ln", "grpFill", "effectDag", "effectLst", "uFillTx", "uFill", "cs", "ea", "latin", "sym", "highlight", "hlinkClick", "hlinkMouseOver", "uLn", "uLnTx" });
  
  zalg(WorksheetCollection paramWorksheetCollection, zcjy paramzcjy, Shape paramShape, FontSettingCollection paramFontSettingCollection, HashMap paramHashMap)
  {
    this.f = paramWorksheetCollection;
    this.a = paramzcjy;
    this.b = paramFontSettingCollection;
    this.c = paramHashMap;
    this.e = new StringBuilder();
    this.g = paramFontSettingCollection.b;
    this.i = (paramShape.p == null ? null : paramShape.p.b);
  }
  
  void a()
    throws Exception
  {
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (j.a(this.a.q()))
      {
      case 0: 
        a(this.a, this.b.getTextAlignment());
        break;
      case 1: 
        this.b.b().a = this.a.v();
        break;
      case 2: 
        if (this.h == null)
        {
          this.h = this.b.h();
        }
        else
        {
          this.e.append("\n");
          FontSetting localFontSetting = this.b.get(this.b.getCount() - 1);
          localFontSetting.p += 1;
          this.d += 1;
          if ((localFontSetting == this.h) && (this.h.e != null)) {
            this.h.q = this.h.e;
          }
          this.h = new TextParagraph(this.d, 0, this.f.p(), this.b);
          this.b.a(this.h);
        }
        a(this.h);
        break;
      default: 
        this.a.a();
      }
    }
    if (this.e.length() != 0) {
      this.b.c = this.e.substring(0, 0 + this.e.length());
    } else if (this.b.getCount() > 1) {
      this.b.c = "";
    }
    if ((this.h == this.b.get(this.b.getCount() - 1)) && (this.h.e != null)) {
      this.h.q = this.h.e;
    }
    switch (this.b.getCount())
    {
    case 0: 
    case 1: 
      break;
    case 2: 
      if ((this.b.get(1).getType() != 1) && (this.b.get(1).q != null)) {
        this.b.get(0).q = this.b.get(1).getFont();
      }
      break;
    default: 
      if ((!this.b.h().c) && (this.b.get(1).getType() != 1)) {
        this.b.get(0).q = this.b.get(1).getFont();
      }
      break;
    }
  }
  
  static void a(zane paramzane, FontSettingCollection paramFontSettingCollection)
    throws Exception
  {
    zcjy localzcjy = zauy.a(paramzane.a, false);
    localzcjy.a(0);
    localzcjy.d();
    a(localzcjy, paramzane, paramFontSettingCollection);
  }
  
  static void a(zcjy paramzcjy, zane paramzane, FontSettingCollection paramFontSettingCollection)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
        TextParagraph localTextParagraph = new TextParagraph(0, 0, paramFontSettingCollection.a.p(), paramFontSettingCollection);
        a(paramzcjy, localTextParagraph, null);
        paramzane.a(localTextParagraph);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  static void a(zcjy paramzcjy, ShapeTextAlignment paramShapeTextAlignment)
    throws Exception
  {
    String str1;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 12: 
          paramShapeTextAlignment.d(zauj.F(paramzcjy.t()));
          break;
        case 13: 
          paramShapeTextAlignment.b(zauj.F(paramzcjy.t()));
          break;
        case 14: 
          paramShapeTextAlignment.e(zauj.F(paramzcjy.t()));
          break;
        case 15: 
          paramShapeTextAlignment.c(zauj.F(paramzcjy.t()));
          break;
        case 16: 
          paramShapeTextAlignment.setTextVerticalOverflow(zauj.aU(paramzcjy.t()));
          break;
        case 17: 
          paramShapeTextAlignment.setTextHorizontalOverflow(zauj.aU(paramzcjy.t()));
          break;
        case 18: 
          paramShapeTextAlignment.g(zauj.M(paramzcjy.t()));
          break;
        case 19: 
          paramShapeTextAlignment.f(zauj.aB(paramzcjy.t()) ? 1 : 7);
          break;
        case 20: 
          paramShapeTextAlignment.setTextVerticalType(zauj.aV(paramzcjy.t()));
          break;
        case 21: 
          paramShapeTextAlignment.setTextWrapped((paramzcjy.t() == null) || (!"none".equals(paramzcjy.t())));
          break;
        case 22: 
          paramShapeTextAlignment.b(zauj.aB(paramzcjy.t()));
          break;
        case 23: 
          str1 = paramzcjy.t();
          if ((str1 != null) && (str1.length() > 0)) {
            paramShapeTextAlignment.c = zauj.F(str1);
          }
          break;
        case 24: 
          paramShapeTextAlignment.a(zauj.aB(paramzcjy.t()));
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
      switch (j.a(paramzcjy.q()))
      {
      case 25: 
        paramShapeTextAlignment.setAutoSize(true);
        paramzcjy.a();
        break;
      case 26: 
        paramShapeTextAlignment.setAutoSize(false);
        paramzcjy.a();
        break;
      case 27: 
        paramShapeTextAlignment.d(true);
        str1 = paramzcjy.a("fontScale");
        if (str1 != null) {
          paramShapeTextAlignment.d = zauj.F(str1);
        }
        str1 = paramzcjy.a("lnSpcReduction");
        if (str1 != null) {
          paramShapeTextAlignment.e = zauj.F(str1);
        }
        paramzcjy.a();
        break;
      case 28: 
        a(paramzcjy, paramShapeTextAlignment.d());
        break;
      case 29: 
        paramShapeTextAlignment.e().j = paramzcjy.v();
        break;
      case 30: 
        paramShapeTextAlignment.e().a = paramzcjy.v();
        break;
      case 31: 
        int k = 0;
        String str2 = paramzcjy.a("z");
        if (str2 != null) {
          k = zauj.F(str2);
        }
        paramShapeTextAlignment.a(k);
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  static void a(String paramString, zaxp paramzaxp)
    throws Exception
  {
    zcjy localzcjy = zauy.a(paramzaxp.a, false);
    localzcjy.a(0);
    localzcjy.d();
    a(localzcjy, paramzaxp);
    paramzaxp.a = null;
  }
  
  static void a(zcjy paramzcjy, zaxp paramzaxp)
    throws Exception
  {
    String str = paramzcjy.a("prst");
    if (str != null) {
      paramzaxp.b = zauj.aQ(str);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("avLst".equals(paramzcjy.q())) {
        a(paramzcjy, paramzaxp);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  static void a(zcjy paramzcjy, Geometry paramGeometry)
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
      if ("gd".equals(paramzcjy.q()))
      {
        String str1 = paramzcjy.a("name");
        String str2 = paramzcjy.a("fmla");
        ShapeGuide localShapeGuide = new ShapeGuide(str1, str2);
        paramGeometry.getShapeAdjustValues().a(localShapeGuide);
      }
      paramzcjy.a();
    }
  }
  
  void a(TextParagraph paramTextParagraph)
    throws Exception
  {
    paramTextParagraph.c = false;
    if (this.a.o())
    {
      this.a.a();
    }
    else
    {
      this.a.d();
      while (zauz.a(this.a))
      {
        Object localObject;
        String str;
        switch (j.a(this.a.q()))
        {
        case 32: 
          a(this.a, paramTextParagraph, this.c);
          break;
        case 33: 
          localObject = this.b.b(this.d, 1);
          str = a(this.a, (FontSetting)localObject, this.c);
          this.e.append("\n");
          this.d += 1;
          break;
        case 34: 
        case 35: 
          localObject = this.b.b(this.d, 0);
          str = a(this.a, (FontSetting)localObject, this.c);
          if ((str != null) && (str.length() > 0))
          {
            ((FontSetting)localObject).p = str.length();
            this.e.append(str);
            this.d += str.length();
          }
          break;
        case 36: 
          if (b(this.a)) {
            this.a.a();
          } else {
            a(this.a, paramTextParagraph.getTextOptions(), this.c, false);
          }
          break;
        case 37: 
          if (b(this.a)) {
            this.a.a();
          } else {
            a(this.a, paramTextParagraph.b(), this.c, false);
          }
          break;
        case 38: 
          localObject = new ztw(this.f.p(), null, paramTextParagraph);
          this.b.a((FontSetting)localObject);
          zakr.a(this.a, (ztw)localObject, this.c);
          break;
        default: 
          this.a.a();
        }
      }
    }
  }
  
  private static boolean b(zcjy paramzcjy)
  {
    return (!paramzcjy.n()) && (paramzcjy.o());
  }
  
  private static boolean a(zcjy paramzcjy, TextParagraph paramTextParagraph, HashMap paramHashMap)
    throws Exception
  {
    boolean bool = false;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 39: 
          paramTextParagraph.setAlignmentType(zauj.N(paramzcjy.t()));
          break;
        case 40: 
          paramTextParagraph.f(zauj.F(paramzcjy.t()));
          break;
        case 41: 
          paramTextParagraph.setFontAlignType(zauj.y(paramzcjy.t()));
          break;
        case 42: 
          paramTextParagraph.c(zauj.F(paramzcjy.t()));
          break;
        case 43: 
          paramTextParagraph.d(zauj.F(paramzcjy.t()));
          break;
        case 44: 
          paramTextParagraph.b(zauj.F(paramzcjy.t()));
          break;
        case 45: 
          paramTextParagraph.a(zauj.F(paramzcjy.t()));
          break;
        case 46: 
          paramTextParagraph.setHangingPunctuation(zauj.aB(paramzcjy.t()));
          break;
        case 47: 
          paramTextParagraph.setEastAsianLineBreak(zauj.aB(paramzcjy.t()));
          break;
        case 48: 
          paramTextParagraph.setLatinLineBreak(zauj.aB(paramzcjy.t()));
          break;
        case 49: 
          paramTextParagraph.c(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return bool;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      Object localObject1;
      Object localObject2;
      switch (j.a(paramzcjy.q()))
      {
      case 36: 
        if (b(paramzcjy))
        {
          paramzcjy.a();
        }
        else
        {
          bool = true;
          paramTextParagraph.c = true;
          a(paramzcjy, paramTextParagraph.getTextOptions(), paramHashMap, false);
        }
        break;
      case 50: 
        localObject1 = paramzcjy.a("startAt");
        localObject2 = paramzcjy.a("type");
        paramTextParagraph.getBullet().setType(3);
        AutoNumberedBulletValue localAutoNumberedBulletValue = (AutoNumberedBulletValue)paramTextParagraph.getBullet().a;
        if (localObject1 != null) {
          localAutoNumberedBulletValue.setStartAt(zauj.F((String)localObject1));
        }
        if (localObject2 != null) {
          localAutoNumberedBulletValue.setAutonumberScheme(zauj.z((String)localObject2));
        }
        paramzcjy.a();
        break;
      case 51: 
        localObject1 = zakf.a(paramzcjy);
        paramTextParagraph.getBullet().a((zaml)localObject1);
        break;
      case 52: 
        paramTextParagraph.getBullet().d = true;
        paramzcjy.a();
        break;
      case 53: 
        a(paramzcjy, paramTextParagraph.getBullet().a());
        break;
      case 54: 
        paramTextParagraph.getBullet().e = true;
        paramzcjy.a();
        break;
      case 55: 
        paramTextParagraph.getBullet().setType(0);
        paramzcjy.a();
        break;
      case 56: 
        localObject2 = paramzcjy.a("char");
        paramTextParagraph.getBullet().setType(1);
        ((CharacterBulletValue)paramTextParagraph.getBullet().a).a = ((String)localObject2).charAt(0);
        paramzcjy.a();
        break;
      case 57: 
        localObject2 = paramzcjy.a("val");
        paramTextParagraph.getBullet().f = 0;
        if (localObject2 != null) {
          paramTextParagraph.getBullet().g = zauj.F((String)localObject2);
        }
        paramzcjy.a();
        break;
      case 58: 
        localObject2 = paramzcjy.a("val");
        paramTextParagraph.getBullet().f = 1;
        if (localObject2 != null) {
          paramTextParagraph.getBullet().g = zauj.F((String)localObject2);
        }
        paramzcjy.a();
        break;
      case 59: 
        paramTextParagraph.getBullet().f = 2;
        paramzcjy.a();
        break;
      case 60: 
        localObject2 = a(paramzcjy);
        if (localObject2 != null)
        {
          paramTextParagraph.setLineSpaceSizeType(((zbqv)localObject2).a);
          paramTextParagraph.f = ((zbqv)localObject2).b;
        }
        break;
      case 61: 
        localObject2 = a(paramzcjy);
        if (localObject2 != null)
        {
          paramTextParagraph.setSpaceAfterSizeType(((zbqv)localObject2).a);
          paramTextParagraph.g = ((zbqv)localObject2).b;
        }
        break;
      case 62: 
        localObject2 = a(paramzcjy);
        if (localObject2 != null)
        {
          paramTextParagraph.setSpaceBeforeSizeType(((zbqv)localObject2).a);
          paramTextParagraph.h = ((zbqv)localObject2).b;
        }
        break;
      case 63: 
        a(paramzcjy, paramTextParagraph);
        break;
      case 64: 
        paramTextParagraph.j = paramzcjy.v();
        break;
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      default: 
        paramzcjy.a();
      }
    }
    return bool;
  }
  
  static void a(zcjy paramzcjy, TextParagraph paramTextParagraph)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 65: 
        String str1 = paramzcjy.a("algn");
        int k = 0;
        if (str1 != null) {
          k = zauj.I(str1);
        }
        String str2 = paramzcjy.a("pos");
        int m = 0;
        if (str2 != null) {
          m = zauj.F(str2);
        }
        paramTextParagraph.getStops().a(k, m);
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  static zbqv a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    zbqv localzbqv = null;
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      String str;
      switch (j.a(paramzcjy.q()))
      {
      case 66: 
        localzbqv = new zbqv();
        localzbqv.a = 0;
        str = paramzcjy.a("val");
        if (str != null) {
          localzbqv.b = zauj.F(str);
        }
        paramzcjy.a();
        break;
      case 67: 
        localzbqv = new zbqv();
        localzbqv.a = 1;
        str = paramzcjy.a("val");
        if (str != null) {
          localzbqv.b = zauj.F(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzbqv;
  }
  
  static String a(zcjy paramzcjy, FontSetting paramFontSetting, HashMap paramHashMap)
    throws Exception
  {
    String str = null;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return str;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 68: 
        if (b(paramzcjy)) {
          paramzcjy.a();
        } else {
          a(paramzcjy, paramFontSetting.getTextOptions(), paramHashMap, false);
        }
        break;
      case 69: 
        paramzcjy.g = true;
        str = paramzcjy.j();
        paramzcjy.g = false;
        break;
      default: 
        paramzcjy.a();
      }
    }
    return str;
  }
  
  static void a(zcjy paramzcjy, zbwg paramzbwg, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (j.a(paramzcjy.q()))
      {
      case 68: 
        if (b(paramzcjy)) {
          paramzcjy.a();
        } else {
          a(paramzcjy, paramzbwg.p(), paramHashMap, false);
        }
        break;
      case 69: 
        paramzcjy.g = true;
        paramzbwg.a(paramzcjy.j());
        paramzcjy.g = false;
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  static void a(zcjy paramzcjy, TextOptions paramTextOptions, HashMap paramHashMap, boolean paramBoolean)
    throws Exception
  {
    Object localObject;
    if ((!paramBoolean) && (paramzcjy.n()))
    {
      while (paramzcjy.m()) {
        switch (j.a(paramzcjy.q()))
        {
        case 70: 
          paramTextOptions.h(zamr.a(paramzcjy.t()));
          break;
        case 71: 
          paramTextOptions.i(zamr.a(paramzcjy.t()));
          break;
        case 72: 
          paramTextOptions.a(zauj.F(paramzcjy.t()) / 100.0D);
          break;
        case 73: 
          paramTextOptions.setUnderline(zauj.A(paramzcjy.t()));
          break;
        case 74: 
          paramTextOptions.setBold(zauj.aB(paramzcjy.t()));
          break;
        case 75: 
          paramTextOptions.setItalic(zauj.aB(paramzcjy.t()));
          break;
        case 76: 
          if ("sngStrike".equals(paramzcjy.t())) {
            paramTextOptions.setStrikeType(0);
          } else if ("dblStrike".equals(paramzcjy.t())) {
            paramTextOptions.setStrikeType(1);
          }
          break;
        case 77: 
          if ("small".equals(paramzcjy.t())) {
            paramTextOptions.setCapsType(2);
          } else if ("all".equals(paramzcjy.t())) {
            paramTextOptions.setCapsType(1);
          }
          break;
        case 78: 
          paramTextOptions.j(zauj.F(paramzcjy.t()));
          break;
        case 79: 
          paramTextOptions.k(zauj.F(paramzcjy.t()));
          break;
        case 80: 
          localObject = paramzcjy.t();
          if (((String)localObject).endsWith("%"))
          {
            double d1 = zauj.C(((String)localObject).substring(0, 0 + (((String)localObject).length() - 1)));
            paramTextOptions.a((int)(d1 * 1000.0D));
          }
          else
          {
            paramTextOptions.a(zauj.F((String)localObject));
          }
          break;
        case 81: 
          paramTextOptions.setNormalizeHeights(zauj.aB(paramzcjy.t()));
          break;
        case 82: 
          paramTextOptions.e(zauj.aB(paramzcjy.t()));
          break;
        case 83: 
          paramTextOptions.d(zauj.aB(paramzcjy.t()));
          break;
        case 84: 
          paramTextOptions.f(zauj.aB(paramzcjy.t()));
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
      switch (j.a(paramzcjy.q()))
      {
      case 89: 
        zalf.a(paramzcjy, paramTextOptions.u().getFill(), paramHashMap);
        break;
      case 90: 
        zalf.d(paramzcjy, paramTextOptions.u().getFill());
        break;
      case 91: 
        zalf.a(paramzcjy, paramTextOptions.u().getFill());
        break;
      case 92: 
        zalf.b(paramzcjy, paramTextOptions.u().getFill());
        paramTextOptions.g(16);
        break;
      case 93: 
        zalf.c(paramzcjy, paramTextOptions.u().getFill());
        break;
      case 94: 
        zalf.a(paramzcjy, paramTextOptions.u().getLine());
        break;
      case 95: 
        paramTextOptions.u().a(6);
        paramzcjy.a();
        break;
      case 96: 
        zalf.a(paramzcjy, paramTextOptions.u());
        break;
      case 97: 
        zalf.a(paramzcjy, paramTextOptions.u().f());
        break;
      case 98: 
        paramTextOptions.g(true);
        paramzcjy.a();
        break;
      case 99: 
        paramTextOptions.l = zalf.a(paramzcjy);
        break;
      case 100: 
      case 101: 
      case 102: 
      case 103: 
        localObject = paramTextOptions.t().a(paramzcjy.q());
        a(paramzcjy, (zbwj)localObject);
        break;
      case 104: 
      case 105: 
      case 106: 
      case 107: 
      case 108: 
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zbwj paramzbwj)
    throws Exception
  {
    String str1 = paramzcjy.a("typeface");
    String str2 = paramzcjy.a("panose");
    String str3 = paramzcjy.a("pitchFamily");
    String str4 = paramzcjy.a("charset");
    if (str1 != null) {
      paramzbwj.a = str1;
    }
    if (str2 != null) {
      paramzbwj.d = str2;
    }
    if (str3 != null) {
      paramzbwj.b = ((byte)zauj.F(str3));
    }
    if (str4 != null) {
      paramzbwj.c = zauj.F(str4);
    }
    paramzcjy.a();
  }
  
  static void a(int paramInt, FontSettingCollection paramFontSettingCollection, TextOptions paramTextOptions, boolean paramBoolean)
    throws Exception
  {
    int k = paramInt;
    int m = 1;
    paramFontSettingCollection.get(0).e(1);
    zm localzm = zw.d();
    zn localzn = new zn(localzm);
    String str1 = null;
    while (m <= k)
    {
      str1 = localzn.f();
      m++;
    }
    zcjy localzcjy = zcjy.a(str1, false);
    localzcjy.d();
    a(localzcjy, paramTextOptions, null, paramBoolean);
    if (paramFontSettingCollection == null) {
      return;
    }
    if (k == 5) {
      k = 21;
    } else if (k == 10) {
      k = 23;
    } else {
      return;
    }
    while (m <= k)
    {
      str1 = localzn.f();
      m++;
    }
    String str2 = str1;
    String str3 = localzn.f();
    ThreeDFormat localThreeDFormat = paramFontSettingCollection.getTextAlignment().f();
    localThreeDFormat.j = str2;
    localThreeDFormat.a = str3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */