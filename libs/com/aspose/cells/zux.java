package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zux
{
  private static String a = "http://schemas.openxmlformats.org/officeDocument/2006/math";
  
  static void a(zcjz paramzcjz, ztw paramztw)
    throws Exception
  {
    paramzcjz.b("a14:m");
    b(paramzcjz, paramztw);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, ztw paramztw)
    throws Exception
  {
    paramzcjz.b("m:oMathPara");
    paramzcjz.a("xmlns:m", a);
    c(paramzcjz, paramztw);
    a(paramzcjz, paramztw);
    paramzcjz.b();
  }
  
  private static void c(zcjz paramzcjz, ztw paramztw)
    throws Exception
  {
    paramzcjz.b("m:oMathParaPr");
    paramzcjz.b("m:jc");
    paramzcjz.a("m:val", zty.a(paramztw.b));
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, ztv paramztv)
    throws Exception
  {
    Iterator localIterator = paramztv.c().iterator();
    while (localIterator.hasNext())
    {
      ztv localztv1 = (ztv)localIterator.next();
      ztv localztv2 = localztv1;
      b(paramzcjz, localztv2);
    }
  }
  
  private static void b(zcjz paramzcjz, ztv paramztv)
    throws Exception
  {
    switch (paramztv.b())
    {
    case 22: 
      zvm.a(paramzcjz, (zbwg)paramztv);
      break;
    case 0: 
      b(paramzcjz, (ztw)paramztv);
      break;
    case 1: 
      paramzcjz.b("m:oMath");
      paramzcjz.a("xmlns:m", a);
      a(paramzcjz, paramztv);
      paramzcjz.b();
      break;
    case 2: 
      c(paramzcjz, paramztv);
      break;
    case 3: 
      a(paramzcjz, (zbtd)paramztv, "m:e");
      break;
    case 4: 
      a(paramzcjz, (zbtd)paramztv, "m:sup");
      break;
    case 12: 
      a(paramzcjz, (zbtd)paramztv, "m:sub");
      break;
    case 5: 
      a(paramzcjz, (zack)paramztv);
      break;
    case 6: 
      a(paramzcjz, (zbtd)paramztv, "m:den");
      break;
    case 7: 
      a(paramzcjz, (zbtd)paramztv, "m:num");
      break;
    case 8: 
      e(paramzcjz, paramztv);
      break;
    case 9: 
      a(paramzcjz, (zbtd)paramztv, "m:fName");
      break;
    case 10: 
      a(paramzcjz, (zsa)paramztv);
      break;
    case 11: 
      a(paramzcjz, (zaqk)paramztv);
      break;
    case 17: 
      a(paramzcjz, (zbtd)paramztv, "m:deg");
      break;
    case 13: 
      a(paramzcjz, (zayn)paramztv);
      break;
    case 14: 
      f(paramzcjz, paramztv);
      break;
    case 15: 
      g(paramzcjz, paramztv);
      break;
    case 16: 
      a(paramzcjz, (zbte)paramztv);
      break;
    case 18: 
      a(paramzcjz, (zaf)paramztv);
      break;
    case 19: 
      a(paramzcjz, (zci)paramztv);
      break;
    case 20: 
      a(paramzcjz, (zdj)paramztv);
      break;
    case 21: 
      a(paramzcjz, (zdp)paramztv);
      break;
    default: 
      paramzcjz.d(((zbxq)paramztv).a);
    }
  }
  
  private static void a(zcjz paramzcjz, zbtd paramzbtd, String paramString)
    throws Exception
  {
    paramzcjz.b(paramString);
    if (paramzbtd.c(1)) {
      d(paramzcjz, paramzbtd);
    }
    if (paramzbtd.a(1)) {
      a(paramzcjz, paramzbtd);
    }
    a(paramzcjz, paramzbtd);
    paramzcjz.b();
  }
  
  private static void c(zcjz paramzcjz, ztv paramztv)
    throws Exception
  {
    paramzcjz.b("m:sSup");
    a(paramzcjz, paramztv, "m:sSupPr");
    a(paramzcjz, paramztv);
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, ztv paramztv, String paramString)
    throws Exception
  {
    if (paramztv.c(1))
    {
      paramzcjz.b(paramString);
      d(paramzcjz, paramztv);
      paramzcjz.b();
    }
  }
  
  private static void d(zcjz paramzcjz, ztv paramztv)
    throws Exception
  {
    if (paramztv.q != null)
    {
      paramzcjz.b("m:ctrlPr");
      zvm.a(paramzcjz, "a:rPr", paramztv.q, null, null);
      ArrayList localArrayList = paramztv.n;
      if (localArrayList != null) {
        for (int i = 0; i < localArrayList.size(); i++) {
          paramzcjz.d((String)localArrayList.get(i));
        }
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zbtd paramzbtd)
    throws Exception
  {
    paramzcjz.b("m:argPr");
    if (paramzbtd.a(2)) {
      a(paramzcjz, paramzbtd.a);
    }
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, int paramInt)
    throws Exception
  {
    paramzcjz.b("m:argSz");
    paramzcjz.a("val", zauj.z(paramInt));
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zack paramzack)
    throws Exception
  {
    paramzcjz.b("m:f");
    b(paramzcjz, paramzack);
    a(paramzcjz, paramzack);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zack paramzack)
    throws Exception
  {
    if (paramzack.a(1))
    {
      paramzcjz.b("m:fPr");
      if (paramzack.c(1)) {
        d(paramzcjz, paramzack);
      }
      c(paramzcjz, paramzack);
      paramzcjz.b();
    }
  }
  
  private static void c(zcjz paramzcjz, zack paramzack)
    throws Exception
  {
    if (paramzack.a(2))
    {
      paramzcjz.b("m:type");
      paramzcjz.a("val", zty.b(paramzack.f));
      paramzcjz.b();
    }
  }
  
  private static void e(zcjz paramzcjz, ztv paramztv)
    throws Exception
  {
    paramzcjz.b("m:func");
    a(paramzcjz, paramztv, "m:funcPr");
    a(paramzcjz, paramztv);
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zsa paramzsa)
    throws Exception
  {
    paramzcjz.b("m:d");
    b(paramzcjz, paramzsa);
    a(paramzcjz, paramzsa);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zsa paramzsa)
    throws Exception
  {
    if (paramzsa.a(1))
    {
      paramzcjz.b("m:dPr");
      if (paramzsa.c(1)) {
        d(paramzcjz, paramzsa);
      }
      if (paramzsa.a(2))
      {
        paramzcjz.b("m:begChr");
        paramzcjz.a("m:val", paramzsa.a);
        paramzcjz.b();
      }
      if (paramzsa.a(4))
      {
        paramzcjz.b("m:endChr");
        paramzcjz.a("m:val", paramzsa.b);
        paramzcjz.b();
      }
      if (paramzsa.a(8))
      {
        paramzcjz.b("m:grow");
        paramzcjz.a("m:val", zty.b(paramzsa.c));
        paramzcjz.b();
      }
      if (paramzsa.a(16))
      {
        paramzcjz.b("m:sepChr");
        paramzcjz.a("m:val", paramzsa.d);
        paramzcjz.b();
      }
      if (paramzsa.a(32))
      {
        paramzcjz.b("m:shp");
        paramzcjz.a("m:val", zty.c(paramzsa.e));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zaqk paramzaqk)
    throws Exception
  {
    paramzcjz.b("m:nary");
    b(paramzcjz, paramzaqk);
    a(paramzcjz, paramzaqk);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zaqk paramzaqk)
    throws Exception
  {
    if (paramzaqk.a(1))
    {
      paramzcjz.b("m:naryPr");
      if (paramzaqk.c(1)) {
        d(paramzcjz, paramzaqk);
      }
      if (paramzaqk.a(2))
      {
        paramzcjz.b("m:chr");
        paramzcjz.a("m:val", paramzaqk.a);
        paramzcjz.b();
      }
      if (paramzaqk.a(4))
      {
        paramzcjz.b("m:grow");
        paramzcjz.a("m:val", zty.b(paramzaqk.b));
        paramzcjz.b();
      }
      if (paramzaqk.a(8))
      {
        paramzcjz.b("m:limLoc");
        paramzcjz.a("m:val", zty.d(paramzaqk.c));
        paramzcjz.b();
      }
      if (paramzaqk.a(16))
      {
        paramzcjz.b("m:subHide");
        paramzcjz.a("m:val", zty.b(paramzaqk.d));
        paramzcjz.b();
      }
      if (paramzaqk.a(32))
      {
        paramzcjz.b("m:supHide");
        paramzcjz.a("m:val", zty.b(paramzaqk.e));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zayn paramzayn)
    throws Exception
  {
    paramzcjz.b("m:rad");
    b(paramzcjz, paramzayn);
    a(paramzcjz, paramzayn);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zayn paramzayn)
    throws Exception
  {
    if (paramzayn.a(1))
    {
      paramzcjz.b("m:radPr");
      if (paramzayn.c(1)) {
        d(paramzcjz, paramzayn);
      }
      if (paramzayn.a(2))
      {
        paramzcjz.b("m:degHide");
        paramzcjz.a("m:val", zty.b(paramzayn.a));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void f(zcjz paramzcjz, ztv paramztv)
    throws Exception
  {
    paramzcjz.b("m:sPre");
    a(paramzcjz, paramztv, "m:sPrePr");
    a(paramzcjz, paramztv);
    paramzcjz.b();
  }
  
  private static void g(zcjz paramzcjz, ztv paramztv)
    throws Exception
  {
    paramzcjz.b("m:sSub");
    a(paramzcjz, paramztv, "m:sSubPr");
    a(paramzcjz, paramztv);
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, zbte paramzbte)
    throws Exception
  {
    paramzcjz.b("m:sSubSup");
    b(paramzcjz, paramzbte);
    a(paramzcjz, paramzbte);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zbte paramzbte)
    throws Exception
  {
    if (paramzbte.a(1))
    {
      paramzcjz.b("m:sSubSupPr");
      if (paramzbte.c(1)) {
        d(paramzcjz, paramzbte);
      }
      if (paramzbte.a(2))
      {
        paramzcjz.b("m:alnScr");
        paramzcjz.a("m:val", zty.b(paramzbte.a));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zaf paramzaf)
    throws Exception
  {
    paramzcjz.b("m:acc");
    b(paramzcjz, paramzaf);
    a(paramzcjz, paramzaf);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zaf paramzaf)
    throws Exception
  {
    if (paramzaf.a(1))
    {
      paramzcjz.b("m:accPr");
      if (paramzaf.c(1)) {
        d(paramzcjz, paramzaf);
      }
      if (paramzaf.a(2))
      {
        paramzcjz.b("m:chr");
        paramzcjz.a("m:val", paramzaf.a);
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zci paramzci)
    throws Exception
  {
    paramzcjz.b("m:bar");
    b(paramzcjz, paramzci);
    a(paramzcjz, paramzci);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zci paramzci)
    throws Exception
  {
    if (paramzci.a(1))
    {
      paramzcjz.b("m:barPr");
      if (paramzci.c(1)) {
        d(paramzcjz, paramzci);
      }
      if (paramzci.a(2))
      {
        paramzcjz.b("m:pos");
        paramzcjz.a("m:val", zty.e(paramzci.a));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zdj paramzdj)
    throws Exception
  {
    paramzcjz.b("m:borderBox");
    b(paramzcjz, paramzdj);
    a(paramzcjz, paramzdj);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zdj paramzdj)
    throws Exception
  {
    if (paramzdj.a(1))
    {
      paramzcjz.b("m:borderBoxPr");
      if (paramzdj.c(1)) {
        d(paramzcjz, paramzdj);
      }
      if (paramzdj.a(2))
      {
        paramzcjz.b("m:hideBot");
        paramzcjz.a("m:val", zty.b(paramzdj.a));
        paramzcjz.b();
      }
      if (paramzdj.a(4))
      {
        paramzcjz.b("m:hideLeft");
        paramzcjz.a("m:val", zty.b(paramzdj.b));
        paramzcjz.b();
      }
      if (paramzdj.a(8))
      {
        paramzcjz.b("m:hideRight");
        paramzcjz.a("m:val", zty.b(paramzdj.c));
        paramzcjz.b();
      }
      if (paramzdj.a(16))
      {
        paramzcjz.b("m:hideTop");
        paramzcjz.a("m:val", zty.b(paramzdj.d));
        paramzcjz.b();
      }
      if (paramzdj.a(32))
      {
        paramzcjz.b("m:strikeBLTR");
        paramzcjz.a("m:val", zty.b(paramzdj.e));
        paramzcjz.b();
      }
      if (paramzdj.a(64))
      {
        paramzcjz.b("m:strikeH");
        paramzcjz.a("m:val", zty.b(paramzdj.f));
        paramzcjz.b();
      }
      if (paramzdj.a(128))
      {
        paramzcjz.b("m:strikeTLBR");
        paramzcjz.a("m:val", zty.b(paramzdj.g));
        paramzcjz.b();
      }
      if (paramzdj.a(256))
      {
        paramzcjz.b("m:strikeV");
        paramzcjz.a("m:val", zty.b(paramzdj.h));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private static void a(zcjz paramzcjz, zdp paramzdp)
    throws Exception
  {
    paramzcjz.b("m:box");
    b(paramzcjz, paramzdp);
    a(paramzcjz, paramzdp);
    paramzcjz.b();
  }
  
  private static void b(zcjz paramzcjz, zdp paramzdp)
    throws Exception
  {
    if (paramzdp.a(1))
    {
      paramzcjz.b("m:boxPr");
      if (paramzdp.c(1)) {
        d(paramzcjz, paramzdp);
      }
      if (paramzdp.a(2))
      {
        paramzcjz.b("m:aln");
        paramzcjz.a("m:val", zty.b(paramzdp.a));
        paramzcjz.b();
      }
      if (paramzdp.a(4))
      {
        paramzcjz.b("m:brk");
        paramzcjz.a("m:alnAt", zauj.z(paramzdp.b));
        paramzcjz.b();
      }
      if (paramzdp.a(8))
      {
        paramzcjz.b("m:diff");
        paramzcjz.a("m:val", zty.b(paramzdp.c));
        paramzcjz.b();
      }
      if (paramzdp.a(16))
      {
        paramzcjz.b("m:noBreak");
        paramzcjz.a("m:val", zty.b(paramzdp.d));
        paramzcjz.b();
      }
      if (paramzdp.a(32))
      {
        paramzcjz.b("m:opEmu");
        paramzcjz.a("m:val", zty.b(paramzdp.e));
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */