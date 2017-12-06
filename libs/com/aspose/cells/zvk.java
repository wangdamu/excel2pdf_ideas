package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import java.util.ArrayList;
import java.util.Iterator;

class zvk
  extends ztp
{
  private zpt b;
  private zvq c;
  private zbci d;
  
  zvk(zpt paramzpt, zvq paramzvq, zbci paramzbci)
  {
    this.b = paramzpt;
    this.d = paramzbci;
    this.c = paramzvq;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("revisions");
    paramzcjz.a("xmlns", zaty.a);
    paramzcjz.a("xmlns:r", zaty.e);
    a(paramzcjz, this.d.c);
    paramzcjz.b();
    paramzcjz.e();
  }
  
  private void a(zcjz paramzcjz, zbca paramzbca)
    throws Exception
  {
    Iterator localIterator = paramzbca.iterator();
    while (localIterator.hasNext())
    {
      zbbu localzbbu = (zbbu)localIterator.next();
      switch (localzbbu.a())
      {
      case 0: 
        a(paramzcjz, (zbcb)localzbbu);
        break;
      case 1: 
        a(paramzcjz, (zbcc)localzbbu);
        break;
      case 2: 
        a(paramzcjz, (zbbw)localzbbu);
        break;
      case 3: 
        a(paramzcjz, (zbbv)localzbbu);
        break;
      case 4: 
        a(paramzcjz, (zbck)localzbbu);
        break;
      case 5: 
        a(paramzcjz, (zbbx)localzbbu);
        break;
      case 6: 
        a(paramzcjz, (zbcd)localzbbu);
        break;
      case 7: 
        a(paramzcjz, (zbch)localzbbu);
        break;
      case 8: 
        a(paramzcjz, (zbbz)localzbbu);
        break;
      case 9: 
        a(paramzcjz, (zbcr)localzbbu);
        break;
      case 10: 
        a(paramzcjz, (zbcm)localzbbu);
        break;
      case 11: 
        a(paramzcjz, (zbcg)localzbbu);
        break;
      case 12: 
        a(paramzcjz, (zbco)localzbbu);
      }
    }
  }
  
  private void a(zcjz paramzcjz, zbbw paramzbbw)
    throws Exception
  {
    paramzcjz.b("rcc");
    if (paramzbbw.j) {
      paramzcjz.a("ra", "1");
    }
    paramzcjz.a("rId", zauj.z(paramzbbw.k));
    if (paramzbbw.n) {
      paramzcjz.a("ua", "1");
    }
    paramzcjz.a("sId", zauj.z(paramzbbw.m));
    if (paramzbbw.c) {
      paramzcjz.a("odxf", "1");
    }
    if (paramzbbw.b) {
      paramzcjz.a("dxf", "1");
    }
    if (paramzbbw.o) {
      paramzcjz.a("xfDxf", "1");
    }
    if (paramzbbw.l) {
      paramzcjz.a("s", "1");
    }
    if (paramzbbw.e != 0) {
      paramzcjz.a("numFmtId", zauj.z(paramzbbw.e));
    }
    if (paramzbbw.i) {
      paramzcjz.a("quotePrefix", "1");
    }
    if (paramzbbw.g) {
      paramzcjz.a("oldQuotePrefix", "1");
    }
    if (paramzbbw.h) {
      paramzcjz.a("ph", "1");
    }
    if (paramzbbw.f) {
      paramzcjz.a("oldPh", "1");
    }
    if (paramzbbw.d) {
      paramzcjz.a("endOfListFormulaUpdate", "1");
    }
    if (paramzbbw.p != null) {
      a(paramzcjz, paramzbbw.p, "oc");
    }
    if (paramzbbw.q != null) {
      a(paramzcjz, paramzbbw.q, "nc");
    }
    if (paramzbbw.r != null) {
      a(paramzcjz, paramzbbw.r, "odxf");
    }
    if (paramzbbw.s != null) {
      a(paramzcjz, paramzbbw.s, "ndxf");
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbby paramzbby, String paramString)
    throws Exception
  {
    paramzcjz.b(paramString);
    paramzcjz.a("r", paramzbby.a());
    if ((paramzbby.d != -1) && (paramzbby.d != 15)) {
      paramzcjz.a("s", zauj.z(paramzbby.d));
    }
    String str1 = null;
    String str2 = null;
    zbbj localzbbj = null;
    boolean bool1 = paramzbby.e();
    boolean bool2 = false;
    int i = 0;
    switch (paramzbby.b())
    {
    case 5: 
      if (bool1)
      {
        str1 = "str";
        str2 = zauj.a((String)paramzbby.e);
        i = (str2 != null) && (str2.length() > 0) && (str2.charAt(0) == ' ') ? 1 : 0;
      }
      else
      {
        bool2 = paramzbby.f;
        str1 = "inlineStr";
        localzbbj = (zbbj)paramzbby.f();
      }
      break;
    case 1: 
    case 4: 
      str1 = "n";
      str2 = zp.b(((Double)paramzbby.f()).doubleValue());
      break;
    case 0: 
      str1 = "b";
      str2 = ((Boolean)paramzbby.f()).booleanValue() ? "1" : "0";
      break;
    case 2: 
      str1 = "e";
      str2 = (String)paramzbby.f();
      if (str2 == null) {
        str2 = "#VALUE!";
      }
      break;
    }
    if ((str1 != null) && (!"n".equals(str1))) {
      paramzcjz.a("t", str1);
    }
    if (bool1)
    {
      String str3 = paramzbby.h();
      if ((str3 != null) && (str3.length() > 0))
      {
        paramzcjz.b("f");
        if (paramzbby.g()) {
          paramzcjz.a("ca", "1");
        }
        String str4 = zauj.L(str3);
        paramzcjz.a(str4);
        paramzcjz.b();
      }
    }
    if (str2 != null)
    {
      if (str2.length() > 0)
      {
        paramzcjz.b("v");
        if (i != 0) {
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
    else if (localzbbj != null) {
      a(paramzcjz, localzbbj, this.b.a);
    }
    if (paramzbby.f) {
      paramzcjz.a("ph", "1");
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbbj paramzbbj, Workbook paramWorkbook)
    throws Exception
  {
    paramzcjz.b("is");
    if (paramzbbj == null)
    {
      zvn.a(paramzcjz, "r");
    }
    else
    {
      if (paramzbbj.f()) {
        zvn.a(paramzcjz, (zbdd)paramzbbj, paramWorkbook);
      } else {
        zvn.a(paramzcjz, paramzbbj);
      }
      if (paramzbbj.g())
      {
        zawa localzawa = ((zawb)paramzbbj).a();
        if ((localzawa != null) && (localzawa.c.getCount() > 0)) {
          zvn.a(paramzcjz, localzawa, this.c);
        }
      }
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbcp paramzbcp, String paramString)
    throws Exception
  {
    paramzcjz.b(paramString);
    this.c.a(paramzcjz, paramzbcp.c);
    if (paramzbcp.a != null) {
      paramzcjz.d(paramzbcp.a);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbbz paramzbbz)
    throws Exception
  {
    paramzcjz.b("rm");
    paramzcjz.a("source", paramzbbz.b());
    if (paramzbbz.g != 0) {
      paramzcjz.a("sourceSheetId", zauj.z(paramzbbz.g));
    }
    paramzcjz.a("destination", paramzbbz.c());
    paramzcjz.a("ra", paramzbbz.d ? "1" : "0");
    paramzcjz.a("rId", zauj.z(paramzbbz.e));
    paramzcjz.a("ua", paramzbbz.h ? "1" : "0");
    paramzcjz.a("sheetId", zauj.z(paramzbbz.f));
    if (paramzbbz.i != null) {
      a(paramzcjz, paramzbbz.i);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbcr paramzbcr)
    throws Exception
  {
    paramzcjz.b("undo");
    paramzcjz.a("index", zauj.z(paramzbcr.f));
    boolean[] arrayOfBoolean = paramzbcr.b();
    int i = arrayOfBoolean[0];
    int j = arrayOfBoolean[1];
    int k = arrayOfBoolean[2];
    int m = arrayOfBoolean[3];
    int n = arrayOfBoolean[4];
    int i1 = arrayOfBoolean[5];
    int i2 = arrayOfBoolean[6];
    String str = null;
    switch (zbcr.a(n, i1, i2))
    {
    case 0: 
      str = "area";
      break;
    case 2: 
      str = "computedArea";
      break;
    case 1: 
      str = "areaError";
      break;
    case 4: 
      str = "refError";
      break;
    case 3: 
      str = "ref";
    }
    paramzcjz.a("exp", str);
    if (j != 0) {
      paramzcjz.a("array", "1");
    }
    if (i != 0) {
      paramzcjz.a("ref3D", "1");
    }
    if (m != 0) {
      paramzcjz.a("cs", "1");
    }
    if (paramzbcr.g) {
      paramzcjz.a("nf", "1");
    }
    if (k != 0) {
      paramzcjz.a("v", "1");
    }
    if (paramzbcr.c != null) {
      paramzcjz.a("dn", paramzbcr.c);
    }
    paramzcjz.a("dr", zauj.a(paramzbcr.e));
    if (paramzbcr.c == null) {
      paramzcjz.a("r", paramzbcr.c());
    }
    if (paramzbcr.k != -1) {
      paramzcjz.a("sId", zauj.z(paramzbcr.k));
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbcg paramzbcg)
    throws Exception
  {
    paramzcjz.b("rrc");
    if (paramzbcg.e) {
      paramzcjz.a("ra", "1");
    }
    paramzcjz.a("rId", zauj.z(paramzbcg.g));
    if (paramzbcg.i) {
      paramzcjz.a("ua", "1");
    }
    paramzcjz.a("sId", zauj.z(paramzbcg.h));
    if (paramzbcg.d) {
      paramzcjz.a("eol", "1");
    }
    paramzcjz.a("ref", zauj.a(paramzbcg.f));
    paramzcjz.a("action", zbcf.a(paramzbcg.b));
    if (paramzbcg.c) {
      paramzcjz.a("edge", "1");
    }
    if (paramzbcg.j != null) {
      a(paramzcjz, paramzbcg.j);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbcd paramzbcd)
    throws Exception
  {
    paramzcjz.b("rfmt");
    paramzcjz.a("sheetId", zauj.z(paramzbcd.e + 1));
    if (paramzbcd.h) {
      paramzcjz.a("xfDxf", "1");
    }
    if (paramzbcd.d) {
      paramzcjz.a("s", "1");
    }
    if (paramzbcd.g != -1) {
      paramzcjz.a("start", zauj.z(paramzbcd.g));
    }
    if (paramzbcd.c != -1) {
      paramzcjz.a("length", zauj.z(paramzbcd.c));
    }
    paramzcjz.a("sqref", zauj.b(paramzbcd.f, 0, paramzbcd.f.size()));
    if ((paramzbcd.b != null) && (paramzbcd.b.c != null)) {
      this.c.a(paramzcjz, paramzbcd.b.c, null);
    }
    if (paramzbcd.i != null) {
      paramzcjz.d(paramzbcd.i);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbch paramzbch)
    throws Exception
  {
    paramzcjz.b("ris");
    paramzcjz.a("ra", paramzbch.c ? "1" : "0");
    paramzcjz.a("rId", zauj.z(paramzbch.d));
    paramzcjz.a("ua", paramzbch.g ? "1" : "0");
    paramzcjz.a("sheetId", zauj.z(paramzbch.e));
    paramzcjz.a("sheetPosition", zauj.z(paramzbch.f));
    paramzcjz.a("name", paramzbch.b);
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbco paramzbco)
    throws Exception
  {
    paramzcjz.b("rsnm");
    if (paramzbco.d) {
      paramzcjz.a("ra", "1");
    }
    paramzcjz.a("rId", zauj.z(paramzbco.e));
    if (paramzbco.g) {
      paramzcjz.a("ua", "1");
    }
    paramzcjz.a("sheetId", zauj.z(paramzbco.f));
    paramzcjz.a("oldName", paramzbco.c);
    paramzcjz.a("newName", paramzbco.b);
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbck paramzbck)
    throws Exception
  {
    paramzcjz.b("rcft");
    if (paramzbck.b) {
      paramzcjz.a("ra", "1");
    }
    paramzcjz.a("rId", zauj.z(paramzbck.d));
    if (paramzbck.c) {
      paramzcjz.a("ua", "1");
    }
    paramzcjz.a("sheetId", zauj.z(paramzbck.e));
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbbv paramzbbv)
    throws Exception
  {
    paramzcjz.b("raf");
    if (paramzbbv.d()) {
      paramzcjz.a("applyAlignmentFormats", "1");
    }
    if (paramzbbv.e()) {
      paramzcjz.a("applyBorderFormats", "1");
    }
    if (paramzbbv.c()) {
      paramzcjz.a("applyFontFormats", "1");
    }
    if (paramzbbv.b()) {
      paramzcjz.a("applyNumberFormats", "1");
    }
    if (paramzbbv.f()) {
      paramzcjz.a("applyPatternFormats", "1");
    }
    if (paramzbbv.g()) {
      paramzcjz.a("applyWidthHeightFormats", "1");
    }
    paramzcjz.a("sheetId", zauj.z(paramzbbv.e));
    paramzcjz.a("ref", zauj.a(paramzbbv.d));
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbcm paramzbcm)
    throws Exception
  {
    paramzcjz.b("rqt");
    paramzcjz.a("fieldId", zauj.z(paramzbcm.b));
    paramzcjz.a("sheetId", zauj.z(paramzbcm.d));
    paramzcjz.a("ref", zauj.a(paramzbcm.c));
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbbx paramzbbx)
    throws Exception
  {
    paramzcjz.b("rcmt");
    paramzcjz.a("sheetId", zauj.z(paramzbbx.l));
    paramzcjz.a("cell", paramzbbx.c());
    paramzcjz.a("guid", zauj.a(paramzbbx.d));
    paramzcjz.a("action", zbcf.a(paramzbbx.b));
    if (paramzbbx.c) {
      paramzcjz.a("alwaysShow", "1");
    }
    if (paramzbbx.j) {
      paramzcjz.a("old", "1");
    }
    if (paramzbbx.g) {
      paramzcjz.a("hiddenRow", "1");
    }
    if (paramzbbx.h) {
      paramzcjz.a("hiddenColumn", "1");
    }
    paramzcjz.a("author", paramzbbx.b());
    paramzcjz.a("oldLength", zauj.z(paramzbbx.k));
    paramzcjz.a("newLength", zauj.z(paramzbbx.i));
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbcb paramzbcb)
    throws Exception
  {
    paramzcjz.b("rcv");
    paramzcjz.a("guid", zauj.a(paramzbcb.b));
    paramzcjz.a("action", zbcf.a(paramzbcb.c));
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbcc paramzbcc)
    throws Exception
  {
    paramzcjz.b("rdn");
    if (paramzbcc.A) {
      paramzcjz.a("ra", "1");
    }
    paramzcjz.a("rId", zauj.z(paramzbcc.C));
    if (paramzbcc.B) {
      paramzcjz.a("ua", "1");
    }
    if (paramzbcc.w != -1) {
      paramzcjz.a("localSheetId", zauj.z(paramzbcc.w));
    }
    if (paramzbcc.p) {
      paramzcjz.a("customView", "1");
    }
    paramzcjz.a("name", paramzbcc.x);
    if (paramzbcc.s) {
      paramzcjz.a("function", "1");
    }
    if (paramzbcc.t) {
      paramzcjz.a("oldFunction", "1");
    }
    if (paramzbcc.d() != 0) {
      paramzcjz.a("functionGroupId", zauj.a(paramzbcc.d()));
    }
    if (paramzbcc.e() != 0) {
      paramzcjz.a("oldFunctionGroupId", zauj.a(paramzbcc.e()));
    }
    if (paramzbcc.f() != 0) {
      paramzcjz.a("shortcutKey", zauj.a(paramzbcc.f()));
    }
    if (paramzbcc.g() != 0) {
      paramzcjz.a("oldShortcutKey", zauj.a(paramzbcc.g()));
    }
    if (paramzbcc.u) {
      paramzcjz.a("hidden", "1");
    }
    if (paramzbcc.v) {
      paramzcjz.a("oldHidden", "1");
    }
    if (paramzbcc.j != null) {
      paramzcjz.a("customMenu", paramzbcc.j);
    }
    if (paramzbcc.k != null) {
      paramzcjz.a("oldCustomMenu", paramzbcc.k);
    }
    if (paramzbcc.l != null) {
      paramzcjz.a("description", paramzbcc.l);
    }
    if (paramzbcc.m != null) {
      paramzcjz.a("oldDescription", paramzbcc.m);
    }
    if (paramzbcc.n != null) {
      paramzcjz.a("help", paramzbcc.n);
    }
    if (paramzbcc.o != null) {
      paramzcjz.a("oldHelp", paramzbcc.o);
    }
    if (paramzbcc.y != null) {
      paramzcjz.a("statusBar", paramzbcc.y);
    }
    if (paramzbcc.z != null) {
      paramzcjz.a("oldStatusBar", paramzbcc.z);
    }
    if (paramzbcc.h != null) {
      paramzcjz.a("comment", paramzbcc.h);
    }
    if (paramzbcc.i != null) {
      paramzcjz.a("oldComment", paramzbcc.i);
    }
    if (paramzbcc.c() != null) {
      paramzcjz.b("formula", zauj.L(paramzbcc.c()));
    }
    if (paramzbcc.b() != null) {
      paramzcjz.b("oldFormula", zauj.L(paramzbcc.b()));
    }
    if (paramzbcc.g != null) {
      paramzcjz.d(paramzbcc.g);
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */