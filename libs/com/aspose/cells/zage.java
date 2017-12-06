package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zage
{
  private zagd h;
  private HashMap i;
  private HashMap j;
  private HashMap k;
  private ArrayList l;
  HashMap a;
  private String m;
  private String n;
  private String o;
  private boolean p;
  private String q;
  private String r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private int z = 0;
  private int A = 0;
  private int B = 0;
  HTMLLoadOptions b;
  int c = 0;
  int d = 0;
  int e = 0;
  private boolean C;
  private HashMap D;
  HashMap f = new HashMap();
  private boolean E;
  Object g = null;
  private int F = 0;
  private int G = 0;
  private ArrayList H = new ArrayList();
  private int I = -1;
  private HashMap J = null;
  private boolean K = false;
  private ArrayList L = null;
  private ArrayList M = null;
  private boolean N = false;
  private int O = 0;
  private int P = 0;
  private int Q = 0;
  private boolean R = false;
  private int S = 0;
  private int T = 0;
  private int U = 0;
  private static final za V = new za(new String[] { "style", "link", "col", "table", "p", "div", "thead", "tr", "td", "th", "html", "title", "a", "span", "img", "font", "sup", "sub", "s", "h1", "h2", "h3", "h4", "h5", "h6", "u", "br", "br/", "b", "strong", "i", "em", "li", "ol", "ul", "/li", "/ol", "/ul", "/style", "/td", "/th", "/b", "/strong", "/span", "/title", "/tr", "/font", "/table", "/p", "/div", "/body", "/a", "/h1", "/h2", "/h3", "/h4", "/h5", "/h6", "mso-page-orientation", "mso-page-numbers-start", "margin", "mso-header-margin", "mso-footer-margin", "mso-horizontal-page-align", "mso-vertical-page-align", "mso-header-data", "mso-footer-data", "width", "height", "word-wrap", "color", "background", "background-color", "mso-number-format", "white-space", "font-size", "text-align", "vertical-align", "padding-right", "padding-left", "mso-char-indent-count", "font-family", "font-style", "font-weight", "text-underline-style", "border-bottom-width", "border-bottom-color", "border-bottom-style", "border-left-width", "border-left-color", "border-left-style", "border-top-width", "border-top-color", "border-top-style", "border-right-width", "border-right-color", "border-right-style", "border-top", "border-right", "border-bottom", "border-left", "mso-diagonal-down", "mso-diagonal-up", "border", "border-width", "border-style", "border-color", "mso-pattern", "mso-rotate", "mso-protection", "text-decoration", "mso-text-underline", "ms-text-underline", "layout-flow", "WorksheetType", "WorksheetSource", "Name", "WorksheetOptions", "ConditionalFormatting", "SheetIndex", "Formula", "Print_Area", "print_area", "Print_Titles", "print_titles", "DefaultRowHeight", "CodeName", "Selected", "Panes", "ProtectContents", "ProtectObjects", "ProtectScenarios", "Pane", "Number", "ActiveRow", "ActiveCol", "RangeSelection", "Range", "Condition", "Qualifier", "Value1", "Value2", "Format", "Between", "Equal", "GreaterOrEqual", "GreaterThan", "LessOrEqual", "LessThan", "NotBetween", "NotEqual", "None" });
  
  boolean a()
  {
    return this.E;
  }
  
  int b()
  {
    return this.F;
  }
  
  IStreamProvider c()
  {
    return this.b.getStreamProvider();
  }
  
  void a(int paramInt)
  {
    this.I = paramInt;
  }
  
  HashMap d()
  {
    return this.J;
  }
  
  boolean e()
  {
    return this.K;
  }
  
  boolean f()
  {
    return this.v;
  }
  
  boolean g()
  {
    return this.N;
  }
  
  int h()
  {
    return this.Q;
  }
  
  public zage(zm paramzm, Workbook paramWorkbook, HTMLLoadOptions paramHTMLLoadOptions)
    throws Exception
  {
    a(null, paramzm, paramWorkbook, paramHTMLLoadOptions);
  }
  
  private void a(String paramString, zm paramzm, Workbook paramWorkbook, HTMLLoadOptions paramHTMLLoadOptions)
    throws Exception
  {
    this.b = paramHTMLLoadOptions;
    this.h = new zagd(paramWorkbook, this);
    this.h.a(paramHTMLLoadOptions);
    this.n = paramHTMLLoadOptions.getAttachedFilesDirectory();
    this.m = paramString;
    this.i = new HashMap();
    this.k = new HashMap();
    this.h.t(this.j = new HashMap());
    this.p = false;
    this.s = false;
    this.l = new ArrayList();
    if ((paramzm != null) && ((paramzm instanceof com.aspose.cells.b.a.d.ze))) {
      this.m = ((com.aspose.cells.b.a.d.ze)paramzm).h_();
    }
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.C = false;
    this.D = null;
    this.L = new ArrayList();
    this.M = new ArrayList();
  }
  
  private int a(ArrayList paramArrayList)
  {
    int i1 = -1;
    int i2 = paramArrayList.size();
    for (int i3 = 0; i3 < i2; i3++) {
      if (i1 < ((Integer)paramArrayList.get(i3)).intValue()) {
        i1 = ((Integer)paramArrayList.get(i3)).intValue();
      }
    }
    return i1 < 0 ? this.h.d() : i1;
  }
  
  private boolean e(String paramString)
  {
    return "wbr".equals(paramString);
  }
  
  public void a(String paramString, ArrayList paramArrayList)
    throws Exception
  {
    if (("!octype".equals(paramString)) || (e(paramString))) {
      return;
    }
    if (this.C)
    {
      if ((!"tr".equals(paramString)) && (("th".equals(paramString)) || ("td".equals(paramString)))) {
        this.h.a(this.D);
      }
      this.C = false;
      this.D = null;
    }
    zf.a(this.L, paramString);
    HashMap localHashMap = f(paramArrayList);
    Object localObject3;
    switch (V.a(paramString))
    {
    case 0: 
      this.h.x();
      break;
    case 1: 
      Object localObject1 = localHashMap.get("id");
      Object localObject2 = localHashMap.get("href");
      if ((localObject1 != null) && (localObject1.equals("shLink")) && (localObject2 != null))
      {
        zf.a(this.l, localObject2);
      }
      else
      {
        localObject3 = localHashMap.get("rel");
        if ((localObject3 != null) && (((String)localObject3).equals("stylesheet")))
        {
          if (this.a == null) {
            this.a = new HashMap();
          }
          if (this.a.get(localObject2) == null) {
            this.a.put(localObject2, Boolean.valueOf(false));
          }
        }
      }
      break;
    case 2: 
      this.S += 1;
      this.h.e(localHashMap);
      break;
    case 3: 
      if (this.h.e() >= 0)
      {
        this.T = this.h.e();
        this.U = this.h.e();
      }
      else
      {
        this.T = 0;
        this.U = 0;
      }
      this.S = 0;
      this.h.g();
      this.J = new HashMap();
      this.h.k();
      this.g = localHashMap.get("class");
      localObject3 = localHashMap.get("style");
      Object localObject4 = localHashMap.get("border");
      if ((this.g != null) || (localObject3 != null) || (localObject4 != null)) {
        this.h.f(localHashMap);
      }
      this.u = true;
      this.A += 1;
      if (!this.w) {
        this.z += 1;
      }
      break;
    case 4: 
      this.v = true;
      if (this.w) {
        this.h.s();
      }
      if ((!this.u) && (this.A == this.B)) {
        this.h.c(localHashMap);
      }
      this.h.u(localHashMap);
      this.h.m(localHashMap);
      break;
    case 5: 
      if ((!this.w) || (this.b.getSupportDivTag()))
      {
        this.c += 1;
        this.h.b(localHashMap);
      }
      this.y = true;
      break;
    case 6: 
      this.C = true;
      this.D = localHashMap;
      break;
    case 7: 
      this.E = true;
      this.h.a(a(this.H));
      this.F = this.h.d();
      this.G = this.h.d();
      this.H.clear();
      if (this.s) {
        this.h.g(localHashMap);
      } else {
        this.h.a(localHashMap);
      }
      break;
    case 8: 
      if ((this.E) && (this.G > this.F)) {
        this.h.a(this.F);
      } else {
        this.F = this.h.d();
      }
      if (this.s) {
        this.h.h(localHashMap);
      } else {
        this.h.a(localHashMap, "td");
      }
      this.w = true;
      break;
    case 9: 
      this.h.a(localHashMap, "th");
      break;
    case 10: 
      e(paramArrayList);
      break;
    case 11: 
      this.h.v();
      break;
    case 12: 
      this.h.a(true);
      this.h.i(localHashMap);
      break;
    case 13: 
      if (this.o != null)
      {
        this.h.b(true);
        this.h.u(localHashMap);
        String str = (String)localHashMap.get("style");
        if (str != null) {
          if ((!this.u) && (this.v))
          {
            this.h.o(localHashMap);
          }
          else if (str.equals("mso-spacerun:yes"))
          {
            this.h.p(localHashMap);
          }
          else if (str.equals("display:none"))
          {
            this.h.k(localHashMap);
          }
          else
          {
            this.s = true;
            if (str.indexOf("z-index") > -1) {
              this.h.b(localHashMap, i());
            } else {
              this.h.n(localHashMap);
            }
          }
        }
      }
      break;
    case 14: 
      try
      {
        this.h.j(localHashMap);
      }
      catch (Exception localException)
      {
        zl.b(localException);
      }
    case 15: 
      this.x = true;
      if ((!this.u) && ((this.v) || (this.y)))
      {
        this.h.o(localHashMap);
      }
      else
      {
        this.k = localHashMap;
        this.h.e(false);
        this.h.f(true);
        this.h.g(true);
        this.h.S();
      }
      break;
    case 16: 
      if ((this.w) && (!this.x)) {
        this.h.N();
      } else if (!this.k.containsKey("sup")) {
        this.k.put("sup", Boolean.valueOf(true));
      }
      break;
    case 17: 
      if ((this.w) && (!this.x)) {
        this.h.O();
      } else {
        this.k.put("sub", Boolean.valueOf(true));
      }
      break;
    case 18: 
      if ((this.w) && (!this.x)) {
        this.h.R();
      } else {
        this.k.put("s", Boolean.valueOf(true));
      }
      break;
    case 19: 
      a("h1", localHashMap);
      break;
    case 20: 
      a("h2", localHashMap);
      break;
    case 21: 
      a("h3", localHashMap);
      break;
    case 22: 
      a("h4", localHashMap);
      break;
    case 23: 
      a("h5", localHashMap);
      break;
    case 24: 
      a("h6", localHashMap);
      break;
    case 25: 
      this.h.P();
      break;
    case 26: 
      int i1 = (!this.y) || ((this.w) && (this.y)) ? 1 : 0;
      if ((this.h.B()) || ((this.h.e() >= 0) && (i1 != 0) && (this.h.X() > 0) && (!this.h.C())) || ((this.h.e() >= 0) && (this.w) && (this.h.H()) && (t())))
      {
        this.h.D();
        return;
      }
      if ((this.y) && (!this.u))
      {
        w();
        this.h.z();
      }
      else
      {
        this.h.F();
      }
      break;
    case 27: 
      int i2 = (!this.y) || ((this.w) && (this.y)) ? 1 : 0;
      if ((this.h.B()) || ((this.h.e() >= 0) && (i2 != 0) && (this.h.X() > 0) && (!this.h.C())) || ((this.h.e() >= 0) && (this.w) && (this.h.H()) && (t())))
      {
        this.h.D();
        return;
      }
      if ((this.y) && (!this.v))
      {
        w();
        this.h.z();
        if (this.w) {
          this.h.A();
        }
      }
      break;
    case 28: 
    case 29: 
      this.h.r(localHashMap);
      this.K = true;
      break;
    case 30: 
    case 31: 
      this.h.Q();
      break;
    case 32: 
      this.N = true;
      this.h.u(localHashMap);
      this.h.l(localHashMap);
      this.h.d(localHashMap);
      break;
    case 33: 
      this.R = true;
      this.P = 0;
      this.O += 1;
      if (this.N) {
        x();
      }
      if (this.w) {
        this.h.a(this.h.d() + 1);
      }
      break;
    case 34: 
      this.O += 1;
      if (this.N) {
        x();
      }
      if ((this.w) && ((this.F != this.h.d()) || ((this.h.o() != null) && (!zw.b(this.h.o().getStringValue()))))) {
        this.h.a(this.h.d() + 1);
      }
      break;
    }
  }
  
  private boolean t()
  {
    int i1 = this.L.size();
    for (int i2 = i1 - 1; i2 >= 0; i2--)
    {
      String str = (String)this.L.get(i2);
      if ((!"div".equals(str)) && (!"br".equals(str))) {
        return "td".equals(str);
      }
    }
    return false;
  }
  
  private void a(String paramString, HashMap paramHashMap)
    throws Exception
  {
    int i1 = this.h.e();
    int i2 = this.h.d();
    this.h.a(paramHashMap);
    if (this.w)
    {
      this.h.b(i1);
      if ((i2 == this.h.d()) && (this.h.d() > this.G)) {
        this.h.a(this.h.d() + 1);
      }
    }
    String str1 = null;
    switch (V.a(paramString.toLowerCase()))
    {
    case 19: 
      str1 = "font-size:24pt;font-weight:bold";
      break;
    case 20: 
      str1 = "font-size:18pt;font-weight:bold";
      break;
    case 21: 
      str1 = "font-size:13.5pt;font-weight:bold";
      break;
    case 22: 
      str1 = "font-size:12pt;font-weight:bold";
      break;
    case 23: 
      str1 = "font-size:10pt;font-weight:bold";
      break;
    case 24: 
      str1 = "font-size:7.5pt;font-weight:bold";
      break;
    }
    if (paramHashMap.get("style") != null)
    {
      String str2 = ((String)paramHashMap.get("style")).trim().toLowerCase();
      if (str2.indexOf("text-align") != -1)
      {
        String[] arrayOfString1 = zw.d(str2, new char[] { ';' });
        for (int i3 = 0; i3 < arrayOfString1.length; i3++) {
          if (arrayOfString1[i3].indexOf("text-align") != -1)
          {
            String[] arrayOfString2 = zw.d(arrayOfString1[i3], new char[] { ':' });
            if ((arrayOfString2[1].trim().equals("center")) || (arrayOfString2[1].trim().equals("right"))) {
              this.h.ah();
            }
          }
        }
      }
      if (str2.endsWith(";")) {
        paramHashMap.put("style", str2 + str1);
      } else {
        paramHashMap.put("style", str2 + ";" + str1);
      }
    }
    else
    {
      paramHashMap.put("style", str1);
    }
    if (this.w) {
      this.h.r();
    }
    this.h.a(paramHashMap, paramString);
  }
  
  private void a(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramArrayOfInt1[0] = -1;
    paramArrayOfInt2[0] = -1;
    for (int i1 = paramInt - 1; i1 >= 0; i1--)
    {
      String str = (String)this.L.get(i1);
      switch (V.a(str))
      {
      case 26: 
      case 27: 
        break;
      default: 
        if (paramArrayOfInt1[0] == -1)
        {
          paramArrayOfInt1[0] = i1;
        }
        else
        {
          paramArrayOfInt2[0] = i1;
          return;
        }
        break;
      }
    }
  }
  
  private void f(String paramString)
    throws Exception
  {
    int i1 = this.L.size();
    int i2 = this.M.size();
    if ((i1 > 0) && (i2 > 0))
    {
      int i3 = -1;
      int i4 = -1;
      int[] arrayOfInt1 = { i3 };
      int[] arrayOfInt2 = { i4 };
      a(i1, arrayOfInt1, arrayOfInt2);
      i3 = arrayOfInt1[0];
      i4 = arrayOfInt2[0];
      if ((i3 == -1) || (i4 == -1)) {
        return;
      }
      String str1 = "/" + (String)this.L.get(i3);
      String str2 = "/" + (String)this.L.get(i4);
      if (paramString.equals(str1)) {
        return;
      }
      if (paramString.equals(str2))
      {
        zf.a(this.M, str1);
        b(str1, null);
      }
    }
  }
  
  public void b(String paramString, ArrayList paramArrayList)
    throws Exception
  {
    paramString = paramString.toLowerCase();
    f(paramString);
    zf.a(this.M, paramString);
    switch (V.a(paramString))
    {
    case 35: 
      if (this.R)
      {
        this.P += 1;
        String str = this.P + ". ";
        this.Q = str.length();
        this.h.c(str);
      }
      x();
      this.Q = 0;
      this.N = false;
      break;
    case 36: 
      this.R = false;
      this.O -= 1;
      break;
    case 37: 
      this.O -= 1;
      break;
    case 38: 
      this.h.y();
      break;
    case 39: 
    case 40: 
      this.w = false;
      this.h.E();
      if (!this.s) {
        u();
      } else {
        this.h.q();
      }
      if (paramString.equals("/td"))
      {
        this.G = this.h.d();
        zf.a(this.H, Integer.valueOf(this.G));
      }
      break;
    case 41: 
    case 42: 
      this.h.u();
      this.K = false;
      break;
    case 43: 
      this.h.b(false);
      this.s = false;
      this.h.t();
      break;
    case 44: 
      this.h.w();
      break;
    case 45: 
      if (this.s) {
        this.h.p();
      }
      this.h.i();
      this.E = false;
      this.H.clear();
      break;
    case 46: 
      this.x = false;
      this.h.q(this.k);
      this.h.c(false);
      this.h.d(false);
      break;
    case 47: 
      this.U = this.h.e();
      this.h.h();
      this.u = false;
      this.B += 1;
      this.g = null;
      this.h.m();
      this.h.a(this.J, this.I);
      this.J = null;
      this.I = -1;
      if ((!this.x) && (!this.v) && (!this.w) && (!this.N)) {
        this.h.U();
      }
      break;
    case 48: 
      v();
      this.v = false;
      break;
    case 49: 
      this.d += 1;
      if (this.d > this.c) {
        this.d -= 1;
      }
      y();
      this.y = false;
      break;
    case 50: 
      if (this.z == 1) {
        this.h.U();
      }
      break;
    case 51: 
      this.h.I();
      this.h.a(false);
      break;
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
      if (!this.h.H())
      {
        this.h.J();
        this.h.a(this.h.d() - 1);
      }
      else
      {
        this.h.L();
        if (!this.w) {
          this.h.a(null);
        }
      }
      break;
    }
  }
  
  private void u()
    throws Exception
  {
    if (this.h.X() > 0)
    {
      Cell localCell = this.h.o();
      if ((localCell != null) && (localCell.getFormula() != null) && (!"".equals(localCell.getFormula().trim())) && (localCell.getType() != 3))
      {
        this.h.h(false);
        this.h.T();
        this.h.d(0);
        this.h.g(false);
        this.t = false;
        this.h.G();
        return;
      }
      this.h.M();
      if (this.h.o() != null) {
        this.h.Y();
      }
      this.h.W();
    }
    else
    {
      this.h.L();
    }
    this.h.h(false);
    this.h.T();
    this.h.d(0);
    this.h.g(false);
    this.t = false;
  }
  
  private void v()
    throws Exception
  {
    if (this.h.X() > 0)
    {
      if ((this.h.K()) && (this.h.X() == 1))
      {
        this.h.L();
        return;
      }
      this.h.M();
      if ((this.h.o() != null) && (this.h.o().getValue() != null)) {
        this.h.Y();
      }
      this.h.W();
    }
    else
    {
      this.h.L();
    }
  }
  
  private void w()
    throws Exception
  {
    v();
  }
  
  private void x()
    throws Exception
  {
    Cell localCell = this.h.o();
    Style localStyle = localCell.getStyle();
    if (!localStyle.isTextWrapped())
    {
      localStyle.setTextWrapped(true);
      localCell.a(localStyle);
    }
    v();
  }
  
  private void y()
    throws Exception
  {
    this.h.l();
    v();
  }
  
  public void a(String paramString)
    throws Exception
  {
    this.h.d(paramString);
  }
  
  public void b(String paramString)
    throws Exception
  {
    paramString = paramString.trim();
    if ((paramString.startsWith("table")) || (paramString.startsWith("@page")))
    {
      if (-1 != paramString.indexOf("@page")) {
        g(paramString);
      }
      if (!this.p) {
        c(paramString);
      }
    }
    else if (paramString.startsWith("[if gte vml 1]"))
    {
      j(paramString);
    }
    else if (paramString.startsWith("[if !mso & vml]"))
    {
      i(paramString);
    }
    else if (paramString.indexOf("xml") != -1)
    {
      h(paramString);
    }
  }
  
  private void g(String paramString)
    throws Exception
  {
    if (("/*".equals(paramString)) || ("*/".equals(paramString)) || (paramString.startsWith("@import"))) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    zagb localzagb = new zagb();
    byte[] arrayOfByte = Encoding.getEncoding("gb2312").a(paramString);
    zh localzh = new zh(arrayOfByte);
    localzagb.a(localzh);
    localArrayList = localzagb.m();
    if (localArrayList.size() > 0) {
      b(localArrayList);
    }
  }
  
  private void b(ArrayList paramArrayList)
  {
    if (m().aa() == null) {
      m().a(m().ac().get(0));
    }
    Worksheet localWorksheet = m().aa();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zaga localzaga = (zaga)localIterator.next();
      if ("@page".equals(localzaga.k()))
      {
        a(localWorksheet, localzaga.d());
        break;
      }
    }
  }
  
  private void a(Worksheet paramWorksheet, ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      switch (V.a(localzafw.a().toLowerCase()))
      {
      case 58: 
        if ("landscape".equals(localzafw.b().toLowerCase())) {
          paramWorksheet.getPageSetup().setOrientation(0);
        } else {
          paramWorksheet.getPageSetup().setOrientation(1);
        }
        break;
      case 59: 
        paramWorksheet.getPageSetup().setFirstPageNumber(zauj.F(localzafw.b()));
        break;
      case 60: 
        a(paramWorksheet, localzafw.b());
        break;
      case 61: 
        if (localzafw.b().indexOf("in") != -1) {
          paramWorksheet.getPageSetup().setHeaderMarginInch(zagn.i(localzafw.b().substring(0, 0 + (localzafw.b().length() - 2))));
        } else {
          paramWorksheet.getPageSetup().setHeaderMargin(zagn.i(localzafw.b()));
        }
        break;
      case 62: 
        if (localzafw.b().indexOf("in") != -1) {
          paramWorksheet.getPageSetup().setFooterMarginInch(zagn.i(localzafw.b().substring(0, 0 + (localzafw.b().length() - 2))));
        } else {
          paramWorksheet.getPageSetup().setFooterMargin(zagn.i(localzafw.b()));
        }
        break;
      case 63: 
        paramWorksheet.getPageSetup().setCenterHorizontally(true);
        break;
      case 64: 
        paramWorksheet.getPageSetup().setCenterVertically(true);
        break;
      case 65: 
        localzafw.a(zw.a(localzafw.b(), "\"", ""));
        String[] arrayOfString1 = zauw.a(localzafw.b());
        for (int i1 = 0; i1 < 3; i1++) {
          if (null != arrayOfString1[i1]) {
            paramWorksheet.getPageSetup().setHeader(i1, arrayOfString1[i1]);
          }
        }
        break;
      case 66: 
        localzafw.a(zw.a(localzafw.b(), "\"", ""));
        String[] arrayOfString2 = zauw.a(localzafw.b());
        for (int i2 = 0; i2 < 3; i2++) {
          if (null != arrayOfString2[i2]) {
            paramWorksheet.getPageSetup().setFooter(i2, arrayOfString2[i2]);
          }
        }
      }
    }
  }
  
  private void a(Worksheet paramWorksheet, String paramString)
  {
    String[] arrayOfString = zw.d(paramString, new char[] { ' ' });
    if (4 != arrayOfString.length)
    {
      zl.b(new Exception("pagesetup margins error"));
      return;
    }
    if (-1 != arrayOfString[0].indexOf("in")) {
      paramWorksheet.getPageSetup().setTopMarginInch(zagn.i(arrayOfString[0].substring(0, 0 + (arrayOfString[0].length() - 2))));
    } else {
      paramWorksheet.getPageSetup().setTopMargin(zagn.i(arrayOfString[0]));
    }
    if (-1 != arrayOfString[1].indexOf("in")) {
      paramWorksheet.getPageSetup().setRightMarginInch(zagn.i(arrayOfString[1].substring(0, 0 + (arrayOfString[1].length() - 2))));
    } else {
      paramWorksheet.getPageSetup().setRightMargin(zagn.i(arrayOfString[1]));
    }
    if (-1 != arrayOfString[2].indexOf("in")) {
      paramWorksheet.getPageSetup().setBottomMarginInch(zagn.i(arrayOfString[2].substring(0, 0 + (arrayOfString[2].length() - 2))));
    } else {
      paramWorksheet.getPageSetup().setBottomMargin(zagn.i(arrayOfString[2]));
    }
    if (-1 != arrayOfString[3].indexOf("in")) {
      paramWorksheet.getPageSetup().setLeftMarginInch(zagn.i(arrayOfString[3].substring(0, 0 + (arrayOfString[3].length() - 2))));
    } else {
      paramWorksheet.getPageSetup().setLeftMargin(zagn.i(arrayOfString[3]));
    }
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    zagb localzagb = new zagb();
    localzagb.a(paramzm);
    localArrayList = localzagb.m();
    if (localArrayList.size() > 0) {
      c(localArrayList);
    }
  }
  
  public void c(String paramString)
    throws Exception
  {
    if (("/*".equals(paramString)) || ("*/".equals(paramString)) || (paramString.startsWith("@import"))) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    zagb localzagb = new zagb();
    byte[] arrayOfByte = Encoding.getEncoding("gb2312").a(paramString);
    zh localzh = new zh(arrayOfByte);
    localzagb.a(localzh);
    localArrayList = localzagb.m();
    if (localArrayList.size() > 0) {
      c(localArrayList);
    }
  }
  
  private void c(ArrayList paramArrayList)
    throws Exception
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zaga localzaga = (zaga)localIterator.next();
      if ((m().af() != null) && (!m().af().containsKey(localzaga.k())) && (!localzaga.k().equals("@page")))
      {
        String str1 = d(localzaga.d());
        ArrayList localArrayList = new ArrayList();
        int i2;
        if (localzaga.k().indexOf(',') != -1)
        {
          String[] arrayOfString = zw.d(localzaga.k(), new char[] { ',' });
          i2 = arrayOfString.length;
          for (int i3 = 0; i3 < i2; i3++)
          {
            String str2 = zw.c(arrayOfString[i3], new char[] { ' ', ',', '.' });
            zf.a(localArrayList, str2);
          }
        }
        else
        {
          zf.a(localArrayList, localzaga.k());
        }
        int i1 = localArrayList.size();
        Object localObject1;
        if (i1 > 1)
        {
          for (i2 = 0; i2 < i1; i2++)
          {
            localObject1 = (String)localArrayList.get(i2);
            int i4 = 0;
            Object localObject2 = m().af().get(localObject1);
            Style localStyle;
            if (localObject2 == null)
            {
              localStyle = m().ad().createStyle();
              a(localzaga.d(), localStyle);
              i4 = m().ad().getWorksheets().C().a(localStyle);
              m().af().put(localObject1, Integer.valueOf(i4));
              if (!"".equals(str1)) {
                m().ae().put(localObject1, str1);
              }
            }
            else
            {
              localStyle = m().ad().getWorksheets().C().a(((Integer)localObject2).intValue());
              a(localzaga.d(), localStyle);
              i4 = m().ad().getWorksheets().C().a(localStyle);
              m().af().put(localObject1, Integer.valueOf(i4));
              if (!"".equals(str1)) {
                m().ae().put(localObject1, str1);
              }
            }
          }
        }
        else
        {
          i2 = 0;
          if (localzaga.k().equals("style0"))
          {
            localObject1 = m().ad().getDefaultStyle();
            i2 = 0;
          }
          else
          {
            localObject1 = m().ad().createStyle();
            i2 = -1;
          }
          a(localzaga.d(), (Style)localObject1);
          if (i2 < 0) {
            i2 = m().ad().getWorksheets().C().a((Style)localObject1);
          } else {
            m().ad().setDefaultStyle((Style)localObject1);
          }
          m().af().put(localzaga.k(), Integer.valueOf(i2));
          if (!"".equals(str1)) {
            m().ae().put(localzaga.k(), str1);
          }
        }
      }
    }
  }
  
  private String d(ArrayList paramArrayList)
  {
    String str1 = "";
    String str2 = "";
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      switch (V.a(localzafw.a().toLowerCase()))
      {
      case 67: 
        str1 = localzafw.b();
        break;
      case 68: 
        str2 = localzafw.b();
      }
    }
    return str1 + ";" + str2;
  }
  
  private void a(ArrayList paramArrayList, Style paramStyle)
    throws Exception
  {
    Font localFont = paramStyle.getFont();
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = "";
    String str7 = "";
    String str8 = "";
    String str9 = "";
    Object localObject = paramArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zafw localzafw = (zafw)((Iterator)localObject).next();
      int i1;
      switch (V.a(localzafw.a().toLowerCase()))
      {
      case 69: 
        if ("break-word".equals(localzafw.b().toLowerCase())) {
          paramStyle.setTextWrapped(true);
        }
        break;
      case 70: 
        localFont.setColor(zafz.g(localzafw.b()));
        break;
      case 71: 
      case 72: 
        if (!"auto".equals(localzafw.b())) {
          str1 = localzafw.b();
        }
        break;
      case 73: 
        zafz.a(paramStyle, localzafw.b());
        break;
      case 74: 
        String str10 = localzafw.b().toLowerCase();
        paramStyle.setTextWrapped((str10.indexOf("normal") != -1) && (str10.indexOf("nowrap") == -1));
        break;
      case 75: 
        zagc.a(localFont, localzafw.b().trim().toLowerCase());
        break;
      case 76: 
        i1 = zafz.d(localzafw.b());
        paramStyle.setHorizontalAlignment(i1);
        if ((paramStyle.getHorizontalAlignment() != 7) && (paramStyle.getHorizontalAlignment() != 8))
        {
          paramStyle.setIndentLevel(0);
          paramStyle.setHorizontalAlignment(i1);
        }
        break;
      case 77: 
        i1 = zafz.e(localzafw.b());
        paramStyle.setVerticalAlignment(i1);
        break;
      case 78: 
        String str11 = localzafw.b().toLowerCase();
        int i2 = this.h.f().a(paramStyle, "0");
        int i3 = 0;
        if ((str11.endsWith("pt")) || (str11.endsWith("px")) || (str11.endsWith("in")))
        {
          i3 = (int)zbxp.a(str11);
        }
        else if (str11.endsWith("em"))
        {
          str11 = str11.substring(0, 0 + (str11.length() - 2));
          i3 = (int)(i2 * com.aspose.cells.a.c.zp.a(str11));
        }
        paramStyle.setIndentLevel(i3 / i2 + (i3 % i2 == 0 ? 0 : 1));
        paramStyle.setHorizontalAlignment(8);
        break;
      case 79: 
        String str12 = localzafw.b().toLowerCase();
        int i4 = this.h.f().a(paramStyle, "0");
        int i5 = 0;
        if ((str12.endsWith("pt")) || (str12.endsWith("px")) || (str12.endsWith("in")))
        {
          i5 = (int)zbxp.a(str12);
        }
        else if (str12.endsWith("em"))
        {
          str12 = str12.substring(0, 0 + (str12.length() - 2));
          i5 = (int)(i4 * com.aspose.cells.a.c.zp.a(str12));
        }
        paramStyle.setIndentLevel(i5 / i4 + (i5 % i4 == 0 ? 0 : 1));
        paramStyle.setHorizontalAlignment(7);
        break;
      case 80: 
        paramStyle.setIndentLevel(zauj.F(localzafw.b()));
        break;
      case 81: 
        zagc.a(localzafw.b(), localFont);
        break;
      case 82: 
        localFont.setItalic(localzafw.b().equals("italic"));
        break;
      case 83: 
        String str13 = localzafw.b().toLowerCase();
        if (str13.indexOf("bold") != -1) {
          localFont.setBold(true);
        } else if ("plain".equals(str13)) {
          localFont.setBold(false);
        } else if ("normal".equals(str13)) {
          localFont.setBold(false);
        } else {
          try
          {
            localFont.setBold(zauj.F(str13) >= 700);
          }
          catch (Exception localException)
          {
            localFont.setBold(false);
          }
        }
        break;
      case 84: 
        zafz.a(localFont, localzafw.b());
        break;
      case 85: 
      case 86: 
      case 87: 
        str7 = str7 + localzafw.b().trim() + " ";
        break;
      case 88: 
      case 89: 
      case 90: 
        str8 = str8 + localzafw.b().trim() + " ";
        break;
      case 91: 
      case 92: 
      case 93: 
        str6 = str6 + localzafw.b().trim() + " ";
        break;
      case 94: 
      case 95: 
      case 96: 
        str9 = str9 + localzafw.b().trim() + " ";
        break;
      case 97: 
      case 98: 
      case 99: 
      case 100: 
      case 101: 
      case 102: 
      case 103: 
        zafy.a(localzafw.a(), localzafw.b(), paramStyle);
        break;
      case 104: 
        str3 = localzafw.b();
        break;
      case 105: 
        str4 = localzafw.b();
        break;
      case 106: 
        String str14 = localzafw.b();
        if (str14.indexOf(" ") != -1) {
          str5 = localzafw.b().substring(0, 0 + str14.indexOf(" "));
        } else {
          str5 = localzafw.b();
        }
        break;
      case 107: 
        str2 = localzafw.b();
        break;
      case 108: 
        paramStyle.setRotationAngle(zauj.F(localzafw.b()));
        break;
      case 109: 
        if (localzafw.b().indexOf("unlocked") != -1) {
          paramStyle.setLocked(false);
        }
        if (localzafw.b().indexOf("hidden") != -1) {
          paramStyle.setFormulaHidden(true);
        }
        break;
      case 110: 
        if ("underline".equals(localzafw.b())) {
          localFont.setUnderline(zafz.f(localzafw.b()));
        }
        if ("line-through".equals(localzafw.b())) {
          localFont.setStrikeout(true);
        }
        break;
      case 111: 
        localFont.setUnderline(zafz.f(localzafw.b()));
        break;
      case 112: 
        localFont.setUnderline(zafz.f(localzafw.b()));
        break;
      case 113: 
        if (localzafw.b().toLowerCase().equals("vertical")) {
          paramStyle.setRotationAngle(255);
        }
        break;
      }
    }
    if (!zw.b(str6)) {
      zafy.a("border-top", str6.trim(), paramStyle);
    }
    if (!zw.b(str9)) {
      zafy.a("border-right", str9.trim(), paramStyle);
    }
    if (!zw.b(str7)) {
      zafy.a("border-bottom", str7.trim(), paramStyle);
    }
    if (!zw.b(str8)) {
      zafy.a("border-left", str8.trim(), paramStyle);
    }
    if ((str1 != null) && ((str2 == null) || ("auto none".equals(str2))))
    {
      paramStyle.setForegroundColor(zafz.g(str1));
      paramStyle.setBackgroundColor(paramStyle.getForegroundColor());
      paramStyle.setPattern(1);
    }
    if ((str1 == null) && (str2 != null)) {
      zafz.a(str2, paramStyle);
    }
    if ((str1 != null) && (str2 != null))
    {
      localObject = zafz.g(str1);
      zafz.a(str2, paramStyle, (Color)localObject);
    }
    if ((str3 != null) && (str5 != null) && (str4 != null))
    {
      localObject = str3 + " " + str4 + " " + str5;
      zafy.a("border", (String)localObject, paramStyle);
    }
  }
  
  private void h(String paramString)
    throws Exception
  {
    int i1 = paramString.indexOf("<xml>");
    String str1 = "<![endif]";
    if (paramString.endsWith(str1))
    {
      String str2 = paramString.substring(i1, i1 + (paramString.length() - str1.length() - i1));
      String str3 = m(str2);
      zcjm localzcjm = zauz.a(k(str3), null, false);
      zcju localzcju = localzcjm.c("o:DocumentProperties");
      if (localzcju.a() > 0)
      {
        localObject = m().ac().getBuiltInDocumentProperties();
        zagc.a(localzcju, (BuiltInDocumentPropertyCollection)localObject);
      }
      Object localObject = localzcjm.c("o:CustomDocumentProperties");
      if (((zcju)localObject).a() > 0)
      {
        CustomDocumentPropertyCollection localCustomDocumentPropertyCollection = m().ac().getCustomDocumentProperties();
        zagc.a((zcju)localObject, localCustomDocumentPropertyCollection);
      }
      a(localzcjm);
      d(localzcjm);
      e(localzcjm);
      if (m().aa() != null)
      {
        b(localzcjm);
        c(localzcjm);
      }
    }
  }
  
  private void i(String paramString)
    throws Exception
  {
    int i1 = "[if !mso & vml]>".length();
    String str1 = "<![endif]";
    if (paramString.endsWith(str1))
    {
      String str2 = paramString.substring(i1, i1 + (paramString.length() - str1.length() - i1));
      String str3 = n(str2);
      zcjm localzcjm = zauz.a(l(str3), null, false);
      zcju localzcju1 = localzcjm.c("ele");
      for (int i2 = 0; i2 < localzcju1.a(); i2++)
      {
        zcjn localzcjn1 = (zcjn)localzcju1.a(i2);
        zcju localzcju2 = localzcjn1.l();
        for (int i3 = 0; i3 < localzcju2.a(); i3++)
        {
          zcjs localzcjs = localzcju2.a(i3);
          if (!(localzcjs instanceof zcjx))
          {
            zcjn localzcjn2 = (zcjn)localzcjs;
            String str4 = localzcjn2.g;
            switch (V.a(str4.toLowerCase()))
            {
            case 13: 
              String str5 = localzcjn2.a("style");
              String[] arrayOfString1 = zw.d(str5, ';');
              for (String str6 : arrayOfString1)
              {
                String[] arrayOfString3 = zw.d(str6, ':');
                String str7 = zagc.e(arrayOfString3[0]);
                switch (V.a(str7.toLowerCase()))
                {
                case 67: 
                  this.h.c((int)zbxp.a(arrayOfString3[1]));
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void j(String paramString)
    throws Exception
  {
    int i1 = "[if gte vml 1]>".length();
    String str1 = "<![endif]";
    if (paramString.endsWith(str1))
    {
      String str2 = paramString.substring(i1, i1 + (paramString.length() - str1.length() - i1));
      String str3 = n(str2);
      zcjm localzcjm = zauz.a(l(str3), null, false);
      zcju localzcju = localzcjm.c("ele");
      if (localzcju.a() > 0)
      {
        localObject = i();
        zagc.a(localzcju, this.j, (String)localObject, c());
      }
      Object localObject = localzcjm.c("o:CustomDocumentProperties");
      if (((zcju)localObject).a() > 0)
      {
        CustomDocumentPropertyCollection localCustomDocumentPropertyCollection = m().ac().getCustomDocumentProperties();
        zagc.a((zcju)localObject, localCustomDocumentPropertyCollection);
      }
    }
  }
  
  private String k(String paramString)
  {
    return zw.a(zw.a(zw.a(zw.a(zw.a(zw.a(paramString, "&", "&amp;"), "<=", "&lt;"), "<br>", "\n"), "<![if excel]>", "<SkipEle>"), "<![if gte mso 9]>", "<SkipEle>"), "<![endif]>", "</SkipEle>");
  }
  
  private String l(String paramString)
  {
    return zw.a(zw.a(zw.a(zw.a(zw.a(paramString, "<=", "&lt;"), "<br>", "\n"), "<![if excel]>", "<SkipEle>"), "<![if gte mso 9]>", "<SkipEle>"), "<![endif]>", "</SkipEle>");
  }
  
  public String i()
  {
    String str = null;
    if (this.r == null)
    {
      if (this.n == null)
      {
        if (this.m == null) {
          return null;
        }
        if (this.m.lastIndexOf("\\") == -1) {
          str = this.m.substring(0, 0 + this.m.lastIndexOf("/")) + "/";
        } else {
          str = this.m.substring(0, 0 + this.m.lastIndexOf("\\")) + "\\";
        }
      }
      else
      {
        str = this.n;
      }
    }
    else {
      str = this.r;
    }
    return str;
  }
  
  public String j()
  {
    return this.m;
  }
  
  private void e(ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<html ");
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      if ((localzafw.a().toLowerCase().equals("dir")) && ("rtl".equals(localzafw.b().toLowerCase()))) {
        this.h.n();
      }
      localStringBuilder.append(localzafw.a());
      localStringBuilder.append("=\"");
      localStringBuilder.append(localzafw.b());
      localStringBuilder.append("\" ");
    }
    localStringBuilder.append(">");
    this.o = zs.a(localStringBuilder);
  }
  
  private HashMap f(ArrayList paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zafw localzafw = (zafw)localIterator.next();
      if (!"".equals(localzafw.a())) {
        if (localHashMap.get(localzafw.a()) == null) {
          localHashMap.put(localzafw.a(), localzafw.b());
        } else if ((localzafw.a().toLowerCase().equals("colspan")) && (zauj.F(localzafw.b()) > zauj.F((String)localHashMap.get(localzafw.a())))) {
          localHashMap.put(localzafw.a(), localzafw.b());
        }
      }
    }
    return localHashMap;
  }
  
  private String m(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    return zs.a(localStringBuilder.append(this.o).append(paramString).append("</html>"));
  }
  
  private String n(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    return zs.a(localStringBuilder.append(this.o).append("<ele>").append(paramString).append("</ele></html>"));
  }
  
  private void a(zcjm paramzcjm)
  {
    zagc.a(paramzcjm, m().ad());
  }
  
  private void b(zcjm paramzcjm)
    throws Exception
  {
    zagc.a(paramzcjm, m());
  }
  
  private void c(zcjm paramzcjm)
  {
    zagc.b(paramzcjm, m());
  }
  
  private void d(zcjm paramzcjm)
    throws Exception
  {
    zcju localzcju = paramzcjm.c("x:Stylesheet");
    Object localObject1 = null;
    if (localzcju.a() == 1)
    {
      this.p = true;
      localObject2 = (zcjn)localzcju.a(0);
      localObject1 = ((zcjn)localObject2).a("HRef");
    }
    else if ((this.a != null) && (this.a.size() == 1))
    {
      localObject2 = this.a.keySet();
      localObject3 = ((Iterable)localObject2).iterator();
      if (((Iterator)localObject3).hasNext())
      {
        localObject4 = (String)((Iterator)localObject3).next();
        localObject1 = localObject4;
        if (!((Boolean)this.a.get(localObject4)).booleanValue()) {
          this.a.put(localObject4, znq.d);
        }
      }
    }
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = "";
    if (((String)localObject1).startsWith("file:///"))
    {
      localObject2 = zafz.c((String)localObject1);
    }
    else if ((((String)localObject1).startsWith("http://")) || (((String)localObject1).startsWith("https://")))
    {
      localObject2 = localObject1;
    }
    else
    {
      if (null != this.m) {
        localObject2 = zk.e(this.m) + "/" + zafz.c((String)localObject1);
      }
      if (null != this.n) {
        localObject2 = this.n + "/" + zafz.c((String)localObject1);
      }
    }
    Object localObject3 = new ArrayList();
    Object localObject4 = new zagb();
    StreamProviderOptions localStreamProviderOptions = new StreamProviderOptions();
    localStreamProviderOptions.a = ((String)localObject1);
    localStreamProviderOptions.b = ((String)localObject2);
    c().initStream(localStreamProviderOptions);
    if (localStreamProviderOptions.c != null)
    {
      ((zagb)localObject4).a(localStreamProviderOptions.c);
      localObject3 = ((zagb)localObject4).m();
      c((ArrayList)localObject3);
    }
  }
  
  private void e(zcjm paramzcjm)
    throws Exception
  {
    int i1 = 1;
    zcju localzcju1 = paramzcjm.c("x:ExcelWorksheet");
    if ((localzcju1.a() > 0) && (this.p)) {
      m().ac().clear();
    }
    for (int i2 = 0; i2 < localzcju1.a(); i2++)
    {
      String str1 = "";
      zm localzm = null;
      String str2 = null;
      Worksheet localWorksheet = null;
      if (i2 >= m().ac().getCount())
      {
        int i3 = m().ac().add();
        localWorksheet = m().ac().get(i3);
      }
      else
      {
        localWorksheet = m().ac().get(i2);
      }
      zcjn localzcjn1 = (zcjn)localzcju1.a(i2);
      zcju localzcju2 = localzcjn1.l();
      for (int i4 = 0; i4 < localzcju2.a(); i4++)
      {
        zcjs localzcjs = localzcju2.a(i4);
        if (!(localzcjs instanceof zcjx))
        {
          zcjn localzcjn2 = (zcjn)localzcjs;
          String str4 = localzcjn2.a();
          String str5 = localzcjn2.g;
          Object localObject2;
          switch (V.a(str5))
          {
          case 114: 
            if (str4.equals("Chart")) {
              i1 = 2;
            }
            break;
          case 115: 
            str2 = localzcjn2.a("HRef");
            if (str2.startsWith("file:///"))
            {
              str1 = zafz.c(str2);
            }
            else
            {
              localObject1 = "";
              if ((str2.indexOf("/") != -1) || (str2.indexOf("\\") != -1)) {
                localObject1 = str2.substring(0, 0 + (str2.lastIndexOf("/") == -1 ? str2.lastIndexOf("\\") : str2.lastIndexOf("/")));
              }
              if (null != this.m)
              {
                str1 = zk.e(this.m) + "/" + zafz.c(str2);
                this.r = (zk.e(this.m) + "/" + (String)localObject1 + "/");
              }
              if (null != this.n)
              {
                str1 = this.n + "/" + zafz.c(str2);
                this.r = (this.n + (String)localObject1 + "/");
              }
            }
            Object localObject1 = new StreamProviderOptions();
            ((StreamProviderOptions)localObject1).a = str2;
            if (str2.startsWith("./")) {
              ((StreamProviderOptions)localObject1).a = ((StreamProviderOptions)localObject1).a.substring(1);
            }
            ((StreamProviderOptions)localObject1).b = str1;
            c().initStream((StreamProviderOptions)localObject1);
            localzm = ((StreamProviderOptions)localObject1).c;
            break;
          case 116: 
            localObject2 = zagn.b(str4);
            if (((String)localObject2).length() < 32) {
              localWorksheet.setName((String)localObject2);
            }
            break;
          case 117: 
            localObject2 = localzcjn2.l();
            a((zcju)localObject2, localWorksheet);
            break;
          case 118: 
            zcju localzcju3 = localzcjn2.l();
            d(localzcju3, localWorksheet);
          }
        }
      }
      localWorksheet.setType(i1);
      i1 = 1;
      if (localzm != null)
      {
        String str3 = "".equals(str1) ? str2 : str1;
        this.i.put(localWorksheet.getName() + '\b' + str3, localzm);
      }
    }
    a(paramzcjm, m());
    if ((localzcju1.a() == 1) || (this.i.size() == 0))
    {
      m().a(m().ac().get(0));
      m().a(m().aa().getCells());
    }
  }
  
  private void a(zcjm paramzcjm, zagd paramzagd)
  {
    zcju localzcju1 = paramzcjm.c("x:ExcelName");
    if ((null == localzcju1) || (localzcju1.a() <= 0)) {
      return;
    }
    String str1 = "";
    String str2 = "";
    int i1 = -1;
    String str3 = "";
    zcjn localzcjn1 = null;
    zcju localzcju2 = null;
    zcjn localzcjn2 = null;
    com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("\\S?!\\$\\d{1,}:\\$\\d{1,}");
    for (int i2 = 0; i2 < localzcju1.a(); i2++)
    {
      localzcjn1 = (zcjn)localzcju1.a(i2);
      localzcju2 = localzcjn1.l();
      for (int i3 = 0; i3 < localzcju2.a(); i3++) {
        if (!(localzcju2.a(i3) instanceof zcjx))
        {
          localzcjn2 = (zcjn)localzcju2.a(i3);
          switch (V.a(localzcjn2.g))
          {
          case 116: 
            str1 = localzcjn2.a().toLowerCase();
            break;
          case 119: 
            i1 = zauj.F(localzcjn2.a());
            break;
          case 120: 
            if (("print_area".equals(str1)) || ("print_titles".equals(str1)))
            {
              str3 = localzcjn2.a();
              try
              {
                str2 = str3.substring(1, 1 + (str3.indexOf("!") - 1));
              }
              catch (Exception localException) {}
            }
            else
            {
              str3 = localzcjn2.a();
              str2 = "";
            }
            break;
          }
        }
      }
      if (!"".equals(str3))
      {
        if ((i1 == -1) && ("".equals(str2))) {
          this.f.put(str1, str3);
        }
        Iterator localIterator = paramzagd.ac().iterator();
        while (localIterator.hasNext())
        {
          Worksheet localWorksheet = (Worksheet)localIterator.next();
          if (localWorksheet.getName().equals(str2)) {
            switch (V.a(str1))
            {
            case 121: 
            case 122: 
              localWorksheet.getPageSetup().setPrintArea(str3);
              break;
            case 123: 
            case 124: 
              localWorksheet.getPageSetup().a(str3);
            }
          }
        }
        i1 = -1;
        str3 = "";
      }
    }
  }
  
  private void a(zcju paramzcju, Worksheet paramWorksheet)
  {
    for (int i1 = 0; i1 < paramzcju.a(); i1++)
    {
      zcjs localzcjs = paramzcju.a(i1);
      if (!(localzcjs instanceof zcjx))
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str = localzcjn.g;
        switch (V.a(str))
        {
        case 125: 
          break;
        case 126: 
          break;
        case 127: 
          break;
        case 128: 
          zcju localzcju = localzcjn.l();
          b(localzcju, paramWorksheet);
          break;
        case 129: 
          break;
        case 130: 
          break;
        case 131: 
          
        }
      }
    }
  }
  
  private void b(zcju paramzcju, Worksheet paramWorksheet)
  {
    for (int i1 = 0; i1 < paramzcju.a(); i1++)
    {
      zcjs localzcjs = paramzcju.a(i1);
      if (!(localzcjs instanceof zcjx))
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str = localzcjn.g;
        switch (V.a(str))
        {
        case 132: 
          zcju localzcju = localzcjn.l();
          c(localzcju, paramWorksheet);
        }
      }
    }
  }
  
  private void c(zcju paramzcju, Worksheet paramWorksheet)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    for (int i1 = 0; i1 < paramzcju.a(); i1++)
    {
      zcjs localzcjs = paramzcju.a(i1);
      if (!(localzcjs instanceof zcjx))
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str1 = localzcjn.a();
        String str2 = localzcjn.g;
        switch (V.a(str2))
        {
        case 133: 
          localObject1 = str1;
          break;
        case 134: 
          localObject2 = str1;
          break;
        case 135: 
          localObject3 = str1;
          break;
        case 136: 
          localObject4 = str1;
        }
      }
    }
    if ((localObject2 != null) && (!"".equals(localObject2)) && (localObject3 != null) && (!"".equals(localObject3))) {
      paramWorksheet.setActiveCell(CellsHelper.cellIndexToName(com.aspose.cells.b.a.zp.a((String)localObject2), com.aspose.cells.b.a.zp.a((String)localObject3)));
    }
  }
  
  private void d(zcju paramzcju, Worksheet paramWorksheet)
  {
    Object localObject1 = null;
    int i1 = 6;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    for (int i2 = 0; i2 < paramzcju.a(); i2++)
    {
      localObject5 = paramzcju.a(i2);
      if (!(localObject5 instanceof zcjx))
      {
        localObject6 = (zcjn)localObject5;
        String str1 = ((zcjn)localObject6).a();
        String str2 = ((zcjn)localObject6).g;
        switch (V.a(str2))
        {
        case 137: 
          localObject1 = str1;
          break;
        case 138: 
          zcju localzcju = ((zcjn)localObject6).l();
          int[] arrayOfInt = { i1 };
          String[] arrayOfString1 = { localObject2 };
          String[] arrayOfString2 = { localObject3 };
          String[] arrayOfString3 = { localObject4 };
          a(localzcju, arrayOfInt, arrayOfString1, arrayOfString2, arrayOfString3);
          i1 = arrayOfInt[0];
          localObject2 = arrayOfString1[0];
          localObject3 = arrayOfString2[0];
          localObject4 = arrayOfString3[0];
        }
      }
    }
    i2 = paramWorksheet.getConditionalFormattings().add();
    Object localObject5 = paramWorksheet.getConditionalFormattings().get(i2);
    a((String)localObject1, (FormatConditionCollection)localObject5);
    Object localObject6 = new FormatCondition((FormatConditionCollection)localObject5);
    ((FormatCondition)localObject6).setOperator(i1);
    ((FormatCondition)localObject6).setType(2);
    ((FormatConditionCollection)localObject5).a((FormatCondition)localObject6);
  }
  
  private void a(String paramString, FormatConditionCollection paramFormatConditionCollection)
  {
    paramString = zw.a(paramString, "$", "");
    String[] arrayOfString1 = zw.d(paramString, ' ');
    for (int i1 = 0; i1 < arrayOfString1.length; i1++)
    {
      String[] arrayOfString2 = zw.d(arrayOfString1[i1], ':');
      String str1 = arrayOfString2[0];
      String str2 = arrayOfString2[(arrayOfString2.length - 1)];
      CellArea localCellArea = CellArea.createCellArea(str1, str2);
      zf.a(paramFormatConditionCollection.b, localCellArea);
    }
  }
  
  private void a(zcju paramzcju, int[] paramArrayOfInt, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3)
  {
    paramArrayOfInt[0] = 6;
    paramArrayOfString1[0] = null;
    paramArrayOfString2[0] = null;
    paramArrayOfString3[0] = null;
    for (int i1 = 0; i1 < paramzcju.a(); i1++)
    {
      zcjs localzcjs = paramzcju.a(i1);
      if (!(localzcjs instanceof zcjx))
      {
        zcjn localzcjn = (zcjn)localzcjs;
        String str1 = localzcjn.a();
        String str2 = localzcjn.g;
        switch (V.a(str2))
        {
        case 139: 
          paramArrayOfInt[0] = o(str1);
          break;
        case 140: 
          paramArrayOfString1[0] = str1;
          break;
        case 141: 
          paramArrayOfString2[0] = str1;
          break;
        case 142: 
          paramArrayOfString3[0] = localzcjn.a("Style");
        }
      }
    }
  }
  
  private int o(String paramString)
  {
    switch (V.a(paramString))
    {
    case 143: 
      return 0;
    case 144: 
      return 1;
    case 145: 
      return 3;
    case 146: 
      return 2;
    case 147: 
      return 5;
    case 148: 
      return 4;
    case 149: 
      return 7;
    case 150: 
      return 8;
    }
    return 6;
  }
  
  public void k()
  {
    this.h.Z();
  }
  
  public HashMap l()
  {
    return this.i;
  }
  
  public zagd m()
  {
    return this.h;
  }
  
  public void d(String paramString)
  {
    this.q = paramString;
  }
  
  public void n()
  {
    this.j.clear();
  }
  
  public ArrayList o()
  {
    return this.l;
  }
  
  boolean p()
  {
    return this.w;
  }
  
  boolean q()
  {
    return this.u;
  }
  
  int r()
  {
    return this.O;
  }
  
  void s()
    throws Exception
  {
    this.h.ai();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */