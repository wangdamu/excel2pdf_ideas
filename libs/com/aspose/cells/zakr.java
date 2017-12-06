package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zakr
{
  private static final za a = new za(new String[] { "oMathPara", "oMath", "oMathParaPr", "jc", "r", "ctrlPr", "sSupPr", "funcPr", "sPrePr", "sSubPr", "argPr", "fPr", "dPr", "naryPr", "radPr", "sSubSupPr", "accPr", "barPr", "borderBoxPr", "boxPr", "sSup", "e", "sup", "f", "den", "num", "func", "fName", "d", "nary", "sub", "rad", "sPre", "sSub", "sSubSup", "deg", "acc", "bar", "borderBox", "box", "rPr", "argSz", "del", "ins", "type", "begChr", "endChr", "grow", "sepChr", "shp", "chr", "limLoc", "subHide", "supHide", "degHide", "alnScr", "pos", "hideBot", "hideLeft", "hideRight", "hideTop", "strikeBLTR", "strikeH", "strikeTLBR", "strikeV", "aln", "brk", "diff", "noBreak", "opEmu" });
  
  static void a(zcjy paramzcjy, ztw paramztw, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 0: 
        b(paramzcjy, paramztw, paramHashMap);
        break;
      case 1: 
        ztv localztv = paramztw.a(zty.c(paramzcjy.q()), paramztw.a(), paramztw);
        a(paramzcjy, localztv, paramHashMap);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void b(zcjy paramzcjy, ztw paramztw, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 2: 
        a(paramzcjy, paramztw);
        break;
      case 1: 
        ztv localztv = paramztw.a(zty.c(paramzcjy.q()), paramztw.a(), paramztw);
        a(paramzcjy, localztv, paramHashMap);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, ztw paramztw)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 3: 
        String str = paramzcjy.a("val");
        if (str != null) {
          paramztw.b = zty.b(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, ztv paramztv, HashMap paramHashMap)
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
      Object localObject;
      switch (a.a(paramzcjy.q()))
      {
      case 0: 
        localObject = (ztw)paramztv.a(0, paramztv.a(), paramztv);
        b(paramzcjy, (ztw)localObject, paramHashMap);
        break;
      case 4: 
        localObject = (zbwg)paramztv.a(22, paramztv.a(), paramztv);
        zalg.a(paramzcjy, (zbwg)localObject, paramHashMap);
        break;
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
        paramztv.d(1);
        b(paramzcjy, paramztv, paramHashMap);
        break;
      case 10: 
        ((zbtd)paramztv).b(1);
        b(paramzcjy, paramztv, paramHashMap);
        break;
      case 11: 
        ((zack)paramztv).b(1);
        a(paramzcjy, (zack)paramztv, paramHashMap);
        break;
      case 12: 
        ((zsa)paramztv).b(1);
        a(paramzcjy, (zsa)paramztv, paramHashMap);
        break;
      case 13: 
        ((zaqk)paramztv).b(1);
        a(paramzcjy, (zaqk)paramztv, paramHashMap);
        break;
      case 14: 
        ((zayn)paramztv).b(1);
        a(paramzcjy, (zayn)paramztv, paramHashMap);
        break;
      case 15: 
        ((zbte)paramztv).b(1);
        a(paramzcjy, (zbte)paramztv, paramHashMap);
        break;
      case 16: 
        ((zaf)paramztv).b(1);
        a(paramzcjy, (zaf)paramztv, paramHashMap);
        break;
      case 17: 
        ((zci)paramztv).b(1);
        a(paramzcjy, (zci)paramztv, paramHashMap);
        break;
      case 18: 
        ((zdj)paramztv).b(1);
        a(paramzcjy, (zdj)paramztv, paramHashMap);
        break;
      case 19: 
        ((zdp)paramztv).b(1);
        a(paramzcjy, (zdp)paramztv, paramHashMap);
        break;
      case 1: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
        localObject = paramztv.a(zty.c(paramzcjy.q()), paramztv.a(), paramztv);
        a(paramzcjy, (ztv)localObject, paramHashMap);
        break;
      case 2: 
      case 3: 
      default: 
        localObject = (zbxq)paramztv.a(zty.c(paramzcjy.q()), paramztv.a(), paramztv);
        ((zbxq)localObject).a = paramzcjy.v();
      }
    }
  }
  
  private static void b(zcjy paramzcjy, ztv paramztv, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramztv.d(1);
        c(paramzcjy, paramztv, paramHashMap);
        break;
      case 40: 
        paramztv.d(1);
        zalg.a(paramzcjy, paramztv.getTextOptions(), paramHashMap, false);
        break;
      case 41: 
        String str = paramzcjy.a("val");
        if (str != null)
        {
          ((zbtd)paramztv).b(2);
          ((zbtd)paramztv).a = zauj.F(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void c(zcjy paramzcjy, ztv paramztv, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 40: 
        zalg.a(paramzcjy, paramztv.getTextOptions(), paramHashMap, false);
        break;
      case 41: 
      case 42: 
      case 43: 
      default: 
        zf.a(paramztv.d(), paramzcjy.v());
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zack paramzack, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzack.d(1);
        c(paramzcjy, paramzack, paramHashMap);
        break;
      case 44: 
        paramzack.b(2);
        String str = paramzcjy.a("val");
        if (str != null) {
          paramzack.f = zty.d(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zsa paramzsa, HashMap paramHashMap)
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
      String str;
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzsa.d(1);
        c(paramzcjy, paramzsa, paramHashMap);
        break;
      case 45: 
        paramzsa.b(2);
        paramzsa.a = paramzcjy.a("val");
        paramzcjy.a();
        break;
      case 46: 
        paramzsa.b(4);
        paramzsa.b = paramzcjy.a("val");
        paramzcjy.a();
        break;
      case 47: 
        paramzsa.b(8);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzsa.c = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 48: 
        paramzsa.b(16);
        paramzsa.d = paramzcjy.a("val");
        paramzcjy.a();
        break;
      case 49: 
        paramzsa.b(32);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzsa.e = zty.e(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zaqk paramzaqk, HashMap paramHashMap)
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
      String str;
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzaqk.d(1);
        c(paramzcjy, paramzaqk, paramHashMap);
        break;
      case 50: 
        paramzaqk.b(2);
        paramzaqk.a = paramzcjy.a("val");
        paramzcjy.a();
        break;
      case 47: 
        paramzaqk.b(4);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzaqk.b = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 51: 
        paramzaqk.b(8);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzaqk.c = zty.f(str);
        }
        paramzcjy.a();
        break;
      case 52: 
        paramzaqk.b(16);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzaqk.d = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 53: 
        paramzaqk.b(32);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzaqk.e = zty.a(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zayn paramzayn, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzayn.d(1);
        c(paramzcjy, paramzayn, paramHashMap);
        break;
      case 54: 
        paramzayn.b(2);
        String str = paramzcjy.a("val");
        if (str != null) {
          paramzayn.a = zty.a(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zbte paramzbte, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzbte.d(1);
        c(paramzcjy, paramzbte, paramHashMap);
        break;
      case 55: 
        paramzbte.b(2);
        String str = paramzcjy.a("val");
        if (str != null) {
          paramzbte.a = zty.a(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zaf paramzaf, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzaf.d(1);
        c(paramzcjy, paramzaf, paramHashMap);
        break;
      case 50: 
        paramzaf.b(2);
        paramzaf.a = paramzcjy.a("val");
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zci paramzci, HashMap paramHashMap)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzci.d(1);
        c(paramzcjy, paramzci, paramHashMap);
        break;
      case 56: 
        paramzci.b(2);
        String str = paramzcjy.a("val");
        if (str != null) {
          paramzci.a = zty.g(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zdj paramzdj, HashMap paramHashMap)
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
      String str;
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzdj.d(1);
        c(paramzcjy, paramzdj, paramHashMap);
        break;
      case 57: 
        paramzdj.b(2);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.a = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 58: 
        paramzdj.b(4);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.b = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 59: 
        paramzdj.b(8);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.c = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 60: 
        paramzdj.b(16);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.d = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 61: 
        paramzdj.b(32);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.e = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 62: 
        paramzdj.b(64);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.f = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 63: 
        paramzdj.b(128);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.g = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 64: 
        paramzdj.b(256);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdj.h = zty.a(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private static void a(zcjy paramzcjy, zdp paramzdp, HashMap paramHashMap)
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
      String str;
      switch (a.a(paramzcjy.q()))
      {
      case 5: 
        paramzdp.d(1);
        c(paramzcjy, paramzdp, paramHashMap);
        break;
      case 65: 
        paramzdp.b(2);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdp.a = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 66: 
        paramzdp.b(4);
        str = paramzcjy.a("alnAt");
        if (str != null) {
          paramzdp.b = zauj.F(str);
        }
        paramzcjy.a();
        break;
      case 67: 
        paramzdp.b(8);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdp.c = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 68: 
        paramzdp.b(16);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdp.d = zty.a(str);
        }
        paramzcjy.a();
        break;
      case 69: 
        paramzdp.b(32);
        str = paramzcjy.a("val");
        if (str != null) {
          paramzdp.e = zty.a(str);
        }
        paramzcjy.a();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */