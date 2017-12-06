package com.aspose.cells;

import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.c.a.za;

class zald
{
  private zqh a = null;
  private Workbook b;
  private static final za c = new za(new String[] { "raf", "rcc", "rcft", "rcmt", "rcv", "rdn", "rfmt", "ris", "rm", "rqt", "rrc", "rsnm", "newName", "oldName", "rId", "sheetId", "ra", "ua", "ref", "fieldId", "name", "sheetPosition", "action", "edge", "eol", "sId", "undo", "array", "cs", "dn", "dr", "exp", "index", "nf", "r", "ref3D", "v", "destination", "source", "sourceSheetId", "dxf", "endOfListFormulaUpdate", "numFmtId", "odxf", "oldPh", "oldQuotePrefix", "ph", "quotePrefix", "s", "xfDxf", "nc", "oc", "ndxf", "t", "n", "str", "inlineStr", "e", "b", "author", "cell", "guid", "hiddenColumn", "hiddenRow", "newLength", "old", "oldLength", "applyAlignmentFormats", "applyBorderFormats", "applyFontFormats", "applyNumberFormats", "applyPatternFormats", "ApplyWidthHeightFormats", "AutoFormatId", "comment", "customMenu", "customView", "description", "function", "functionGroupId", "help", "hidden", "localSheetId", "oldComment", "oldCustomMenu", "oldDescription", "oldFunction", "oldFunctionGroupId", "oldHelp", "oldHidden", "oldShortcutKey", "oldStatusBar", "shortcutKey", "statusBar", "formula", "oldFormula", "extLst", "length", "sqref", "start" });
  
  zald(zqh paramzqh)
  {
    this.a = paramzqh;
    this.b = paramzqh.a;
  }
  
  void a(zcjy paramzcjy, zbci paramzbci)
    throws Exception
  {
    paramzcjy.k();
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 0: 
        paramzbci.c.a(j(paramzcjy));
        break;
      case 1: 
        paramzbci.c.a(g(paramzcjy));
        break;
      case 2: 
        paramzbci.c.a(h(paramzcjy));
        break;
      case 3: 
        paramzbci.c.a(i(paramzcjy));
        break;
      case 4: 
        paramzbci.c.a(m(paramzcjy));
        break;
      case 5: 
        paramzbci.c.a(k(paramzcjy));
        break;
      case 6: 
        paramzbci.c.a(l(paramzcjy));
        break;
      case 7: 
        paramzbci.c.a(c(paramzcjy));
        break;
      case 8: 
        paramzbci.c.a(f(paramzcjy));
        break;
      case 9: 
        paramzbci.c.a(b(paramzcjy));
        break;
      case 10: 
        paramzbci.c.a(d(paramzcjy));
        break;
      case 11: 
        paramzbci.c.a(a(paramzcjy));
        break;
      default: 
        paramzbci.c.a(new zbcs(paramzcjy.v()));
      }
    }
  }
  
  zbbu a(zcjy paramzcjy)
    throws Exception
  {
    zbco localzbco = new zbco();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 12: 
          localzbco.b = paramzcjy.t();
          break;
        case 13: 
          localzbco.c = paramzcjy.t();
          break;
        case 14: 
          localzbco.e = zauj.F(paramzcjy.t());
          break;
        case 15: 
          localzbco.f = zauj.F(paramzcjy.t());
          break;
        case 16: 
          localzbco.d = zauj.aB(paramzcjy.t());
          break;
        case 17: 
          localzbco.g = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzbco;
  }
  
  zbbu b(zcjy paramzcjy)
    throws Exception
  {
    zbcm localzbcm = new zbcm();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 18: 
          localzbcm.c = ((CellArea)CellArea.a(paramzcjy.t(), true));
          break;
        case 19: 
          localzbcm.b = zauj.F(paramzcjy.t());
          break;
        case 15: 
          localzbcm.d = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzbcm;
  }
  
  zbbu c(zcjy paramzcjy)
    throws Exception
  {
    zbch localzbch = new zbch();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 20: 
          localzbch.b = paramzcjy.t();
          break;
        case 14: 
          localzbch.d = zauj.F(paramzcjy.t());
          break;
        case 21: 
          localzbch.f = zauj.F(paramzcjy.t());
          break;
        case 15: 
          localzbch.e = zauj.F(paramzcjy.t());
          break;
        case 16: 
          localzbch.c = zauj.aB(paramzcjy.t());
          break;
        case 17: 
          localzbch.g = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzbch;
  }
  
  zbbu d(zcjy paramzcjy)
    throws Exception
  {
    zbcg localzbcg = new zbcg();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 22: 
          localzbcg.b = zbcf.b(paramzcjy.t());
          break;
        case 23: 
          localzbcg.c = zauj.aB(paramzcjy.t());
          break;
        case 24: 
          localzbcg.d = zauj.aB(paramzcjy.t());
          break;
        case 18: 
          localzbcg.f = ((CellArea)CellArea.a(paramzcjy.t(), true));
          break;
        case 16: 
          localzbcg.e = zauj.aB(paramzcjy.t());
          break;
        case 14: 
          localzbcg.g = zauj.F(paramzcjy.t());
          break;
        case 25: 
          localzbcg.h = zauj.F(paramzcjy.t());
          break;
        case 17: 
          localzbcg.i = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzbcg;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 1: 
        localzbcg.b().a(g(paramzcjy));
        break;
      case 6: 
        localzbcg.b().a(l(paramzcjy));
        break;
      case 26: 
        localzbcg.b().a(e(paramzcjy));
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzbcg;
  }
  
  zbbu e(zcjy paramzcjy)
    throws Exception
  {
    zbcr localzbcr = new zbcr();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    int i = 3;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 27: 
          bool2 = zauj.aB(paramzcjy.t());
          break;
        case 28: 
          bool4 = zauj.aB(paramzcjy.t());
          break;
        case 29: 
          localzbcr.c = paramzcjy.t();
          break;
        case 30: 
          localzbcr.e = ((CellArea)CellArea.a(paramzcjy.t(), true));
          break;
        case 31: 
          i = zbcf.a(paramzcjy.t());
          break;
        case 32: 
          localzbcr.f = zauj.F(paramzcjy.t());
          break;
        case 33: 
          localzbcr.g = zauj.aB(paramzcjy.t());
          break;
        case 34: 
          localzbcr.a(paramzcjy.t());
          break;
        case 35: 
          bool1 = zauj.aB(paramzcjy.t());
          break;
        case 25: 
          localzbcr.k = zauj.F(paramzcjy.t());
          break;
        case 36: 
          bool3 = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    localzbcr.a(bool1, bool2, bool3, bool4, i);
    paramzcjy.a();
    return localzbcr;
  }
  
  zbbu f(zcjy paramzcjy)
    throws Exception
  {
    zbbz localzbbz = new zbbz();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 37: 
          localzbbz.b(paramzcjy.t());
          break;
        case 16: 
          localzbbz.d = zauj.aB(paramzcjy.t());
          break;
        case 14: 
          localzbbz.e = zauj.F(paramzcjy.t());
          break;
        case 15: 
          localzbbz.f = zauj.F(paramzcjy.t());
          break;
        case 38: 
          localzbbz.a(paramzcjy.t());
          break;
        case 39: 
          localzbbz.g = zauj.F(paramzcjy.t());
          break;
        case 17: 
          localzbbz.h = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzbbz;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 1: 
        localzbbz.d().a(g(paramzcjy));
        break;
      case 6: 
        localzbbz.d().a(l(paramzcjy));
        break;
      case 26: 
        localzbbz.d().a(e(paramzcjy));
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzbbz;
  }
  
  zbbu g(zcjy paramzcjy)
    throws Exception
  {
    zbbw localzbbw = new zbbw();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 40: 
          localzbbw.b = zauj.aB(paramzcjy.t());
          break;
        case 41: 
          localzbbw.d = zauj.aB(paramzcjy.t());
          break;
        case 42: 
          localzbbw.e = zauj.F(paramzcjy.t());
          break;
        case 43: 
          localzbbw.c = zauj.aB(paramzcjy.t());
          break;
        case 44: 
          localzbbw.f = zauj.aB(paramzcjy.t());
          break;
        case 45: 
          localzbbw.g = zauj.aB(paramzcjy.t());
          break;
        case 46: 
          localzbbw.h = zauj.aB(paramzcjy.t());
          break;
        case 47: 
          localzbbw.i = zauj.aB(paramzcjy.t());
          break;
        case 16: 
          localzbbw.j = zauj.aB(paramzcjy.t());
          break;
        case 14: 
          localzbbw.k = zauj.F(paramzcjy.t());
          break;
        case 48: 
          localzbbw.l = zauj.aB(paramzcjy.t());
          break;
        case 25: 
          localzbbw.m = zauj.F(paramzcjy.t());
          break;
        case 17: 
          localzbbw.n = zauj.aB(paramzcjy.t());
          break;
        case 49: 
          localzbbw.o = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzbbw;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 50: 
        localzbbw.q = a(paramzcjy, localzbbw.m, localzbbw);
        break;
      case 51: 
        localzbbw.p = a(paramzcjy, localzbbw.m, localzbbw);
        break;
      case 52: 
        localzbbw.s = a(paramzcjy, false);
        break;
      case 43: 
        localzbbw.r = a(paramzcjy, false);
        break;
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
    return localzbbw;
  }
  
  zbby a(zcjy paramzcjy, int paramInt, zbbu paramzbbu)
    throws Exception
  {
    zbby localzbby = new zbby(paramzbbu);
    String str1 = "n";
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 46: 
          localzbby.f = zauj.aB(paramzcjy.t());
          break;
        case 34: 
          localzbby.a(paramzcjy.t());
          break;
        case 48: 
          localzbby.d = zauj.F(paramzcjy.t());
          break;
        case 53: 
          str1 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzbby;
    }
    paramzcjy.d();
    Object localObject1 = null;
    String str2 = null;
    while (zauz.a(paramzcjy))
    {
      Object localObject2;
      if ("f".equals(paramzcjy.q()))
      {
        localObject2 = paramzcjy.a("t");
        str2 = paramzcjy.j();
      }
      else if ("v".equals(paramzcjy.q()))
      {
        paramzcjy.a(1);
        localObject1 = paramzcjy.j();
        paramzcjy.a(0);
        if (paramzcjy.s() == 3) {
          paramzcjy.a();
        }
      }
      else if ("is".equals(paramzcjy.q()))
      {
        localObject2 = zalh.a(paramzcjy, this.b.getWorksheets(), this.a.c(), false);
        localObject1 = localObject2;
      }
      else
      {
        paramzcjy.a();
      }
    }
    if (str2 != null)
    {
      localzbby.b("=" + str2);
      localzbby.e = a(localObject1, str1);
    }
    else
    {
      localzbby.e = a(localObject1, str1);
    }
    return localzbby;
  }
  
  private Object a(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return null;
    }
    switch (c.a(paramString))
    {
    case 54: 
      double d = zauj.C((String)paramObject);
      return Double.valueOf(d);
    case 48: 
      int i = zauj.F((String)paramObject);
      return this.b.getWorksheets().g.a(i);
    case 55: 
    case 56: 
      return paramObject;
    case 57: 
      return paramObject;
    case 58: 
      return Boolean.valueOf(zauj.aB((String)paramObject));
    }
    return paramObject;
  }
  
  zbcp a(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return null;
    }
    zbcp localzbcp = new zbcp();
    localzbcp.c = new Style(this.b.getWorksheets());
    zalu.a(localzbcp.c, zalk.a(this.b.getWorksheets(), paramzcjy));
    return localzbcp;
  }
  
  zbbu h(zcjy paramzcjy)
    throws Exception
  {
    zbck localzbck = new zbck();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 16: 
          localzbck.b = zauj.aB(paramzcjy.t());
          break;
        case 14: 
          localzbck.d = zauj.F(paramzcjy.t());
          break;
        case 15: 
          localzbck.e = zauj.F(paramzcjy.t());
          break;
        case 17: 
          localzbck.c = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzbck;
  }
  
  zbbu i(zcjy paramzcjy)
    throws Exception
  {
    zbbx localzbbx = new zbbx();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 22: 
          localzbbx.b = zbcf.b(paramzcjy.t());
          break;
        case 16: 
          localzbbx.c = zauj.aB(paramzcjy.t());
          break;
        case 59: 
          localzbbx.a(paramzcjy.t());
          break;
        case 60: 
          localzbbx.b(paramzcjy.t());
          break;
        case 61: 
          localzbbx.d = zauj.aX(paramzcjy.t()).a();
          break;
        case 62: 
          localzbbx.h = zauj.aB(paramzcjy.t());
          break;
        case 63: 
          localzbbx.g = zauj.aB(paramzcjy.t());
          break;
        case 64: 
          localzbbx.i = zauj.F(paramzcjy.t());
          break;
        case 65: 
          localzbbx.j = zauj.aB(paramzcjy.t());
          break;
        case 66: 
          localzbbx.k = zauj.F(paramzcjy.t());
          break;
        case 15: 
          localzbbx.l = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzbbx;
  }
  
  zbbu j(zcjy paramzcjy)
    throws Exception
  {
    zbbv localzbbv = new zbbv();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 67: 
          localzbbv.b(zauj.aB(paramzcjy.t()));
          break;
        case 68: 
          localzbbv.c(zauj.aB(paramzcjy.t()));
          break;
        case 69: 
          localzbbv.a(zauj.aB(paramzcjy.t()));
          break;
        case 70: 
          localzbbv.b(zauj.aB(paramzcjy.t()));
          break;
        case 71: 
          localzbbv.d(zauj.aB(paramzcjy.t()));
          break;
        case 72: 
          localzbbv.b(zauj.aB(paramzcjy.t()));
          break;
        case 73: 
          localzbbv.c = zauj.F(paramzcjy.t());
          break;
        case 18: 
          localzbbv.d = ((CellArea)CellArea.a(paramzcjy.t(), true));
          break;
        case 15: 
          localzbbv.e = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzbbv;
  }
  
  zbbu k(zcjy paramzcjy)
    throws Exception
  {
    zbcc localzbcc = new zbcc();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 74: 
          localzbcc.h = paramzcjy.t();
          break;
        case 75: 
          localzbcc.j = paramzcjy.t();
          break;
        case 76: 
          localzbcc.p = zauj.aB(paramzcjy.t());
          break;
        case 77: 
          localzbcc.l = paramzcjy.t();
          break;
        case 78: 
          localzbcc.s = zauj.aB(paramzcjy.t());
          break;
        case 79: 
          localzbcc.a((byte)zauj.F(paramzcjy.t()));
          break;
        case 80: 
          localzbcc.n = paramzcjy.t();
          break;
        case 81: 
          localzbcc.u = zauj.aB(paramzcjy.t());
          break;
        case 82: 
          localzbcc.w = zauj.F(paramzcjy.t());
          break;
        case 20: 
          localzbcc.x = paramzcjy.t();
          break;
        case 83: 
          localzbcc.i = paramzcjy.t();
          break;
        case 84: 
          localzbcc.k = paramzcjy.t();
          break;
        case 85: 
          localzbcc.m = paramzcjy.t();
          break;
        case 86: 
          localzbcc.t = zauj.aB(paramzcjy.t());
          break;
        case 87: 
          localzbcc.b((byte)zauj.F(paramzcjy.t()));
          break;
        case 88: 
          localzbcc.o = paramzcjy.t();
          break;
        case 89: 
          localzbcc.v = zauj.aB(paramzcjy.t());
          break;
        case 90: 
          localzbcc.d((byte)zauj.F(paramzcjy.t()));
          break;
        case 91: 
          localzbcc.z = paramzcjy.t();
          break;
        case 16: 
          localzbcc.A = zauj.aB(paramzcjy.t());
          break;
        case 14: 
          localzbcc.C = zauj.F(paramzcjy.t());
          break;
        case 92: 
          localzbcc.c((byte)zauj.F(paramzcjy.t()));
          break;
        case 93: 
          localzbcc.y = paramzcjy.t();
          break;
        case 17: 
          localzbcc.B = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzbcc;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 94: 
        localzbcc.b("=" + paramzcjy.j());
        break;
      case 95: 
        localzbcc.a("=" + paramzcjy.j());
        break;
      case 96: 
        localzbcc.g = paramzcjy.v();
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzbcc;
  }
  
  zbbu l(zcjy paramzcjy)
    throws Exception
  {
    zbcd localzbcd = new zbcd();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 97: 
          localzbcd.c = zauj.F(paramzcjy.t());
          break;
        case 48: 
          localzbcd.d = zauj.aB(paramzcjy.t());
          break;
        case 98: 
          zauj.a(paramzcjy.t(), localzbcd.f);
          break;
        case 15: 
          localzbcd.e = (zauj.F(paramzcjy.t()) - 1);
          break;
        case 99: 
          localzbcd.g = zauj.F(paramzcjy.t());
          break;
        case 49: 
          localzbcd.h = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return localzbcd;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 40: 
        localzbcd.b = new zbcp();
        localzbcd.b.c = new Style(this.b.getWorksheets());
        zalu.a(localzbcd.b.c, zalk.a(this.b.getWorksheets(), paramzcjy));
        break;
      case 96: 
        localzbcd.i = paramzcjy.v();
        break;
      default: 
        paramzcjy.a();
      }
    }
    return localzbcd;
  }
  
  zbbu m(zcjy paramzcjy)
    throws Exception
  {
    zbcb localzbcb = new zbcb();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 61: 
          localzbcb.b = zauj.aX(paramzcjy.t()).a();
          break;
        case 22: 
          localzbcb.c = zbcf.b(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    return localzbcb;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zald.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */