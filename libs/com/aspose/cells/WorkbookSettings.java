package com.aspose.cells;

import com.aspose.cells.a.c.zj;
import com.aspose.cells.a.d.zav;
import com.aspose.cells.b.a.zg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public class WorkbookSettings
{
  boolean a = false;
  String b = "162913";
  boolean c = false;
  LoadOptions d;
  short e = 1200;
  boolean f;
  zdg g;
  boolean h = false;
  byte i = 2;
  boolean j = false;
  Encoding k = Encoding.getDefault();
  boolean l = true;
  int m = -1;
  byte n;
  boolean o = false;
  boolean p = false;
  WriteProtection q;
  private Workbook r;
  private zzx s;
  private boolean t;
  private zava u;
  private boolean v;
  private boolean w;
  private boolean x = false;
  private boolean y;
  private int z = 0;
  private boolean A;
  private int B = 100;
  private double C = 0.001D;
  private int D = 0;
  private int E = 200;
  private boolean F = false;
  private boolean G = true;
  private boolean H = true;
  private short I = 600;
  private boolean J = true;
  private boolean K = true;
  private int L = 0;
  private GlobalizationSettings M = new GlobalizationSettings();
  private String N;
  private int O = 3;
  private int P = 128;
  private boolean Q = false;
  private HashMap R;
  private boolean S;
  private boolean T;
  private boolean U = true;
  private boolean V = true;
  private short W;
  private boolean X = true;
  private SmartTagOptions Y;
  private String Z = "Arial";
  private int aa = 200;
  private int ab = 9225;
  private int ac = 14940;
  private int ad = 120;
  private int ae = 240;
  private boolean af = false;
  private int ag = -1;
  private boolean ah = true;
  private boolean ai = true;
  private zqp aj;
  private int ak = znq.s;
  private IWarningCallback al = null;
  
  void a()
  {
    this.d = null;
    this.q = null;
    this.g = null;
    this.aj = null;
    this.R = null;
    this.s = null;
    this.u = null;
    this.r = null;
    zg.a(this);
  }
  
  void b()
  {
    if (this.g == null) {
      this.g = new zdg();
    }
  }
  
  zdg c()
  {
    if (this.g == null) {
      this.g = new zdg();
    }
    return this.g;
  }
  
  zava d()
  {
    return this.u;
  }
  
  public boolean getCheckCustomNumberFormat()
  {
    return this.y;
  }
  
  public void setCheckCustomNumberFormat(boolean value)
  {
    this.y = value;
  }
  
  public boolean getEnableMacros()
  {
    return this.v;
  }
  
  public void setEnableMacros(boolean value)
  {
    this.v = value;
  }
  
  WorkbookSettings(Workbook workbook, com.aspose.cells.b.a.c.za cultureInfo)
  {
    this.r = workbook;
    this.u = new zava();
    this.s = new zzx(cultureInfo);
    this.s.a(new zama(this.u));
    this.s.a(this.w);
    this.s.j().a(this.M);
    this.P = 128;
    this.q = null;
    this.N = null;
    zav localzav = zav.a();
  }
  
  public boolean getDate1904()
  {
    return this.w;
  }
  
  public void setDate1904(boolean value)
  {
    this.w = value;
    this.s.a(value);
  }
  
  public int getProtectionType()
  {
    return this.r.getWorksheets().E();
  }
  
  public boolean getPrecisionAsDisplayed()
  {
    return this.x;
  }
  
  public void setPrecisionAsDisplayed(boolean value)
  {
    this.x = value;
  }
  
  public boolean getReCalculateOnOpen()
  {
    return (this.i & 0xFF & 0x2) != 0;
  }
  
  public void setReCalculateOnOpen(boolean value)
  {
    if (value) {
      this.i = ((byte)(this.i | 0x2));
    } else {
      this.i = ((byte)(this.i & 0xFD));
    }
  }
  
  public boolean getCreateCalcChain()
  {
    return this.c;
  }
  
  public void setCreateCalcChain(boolean value)
  {
    if (this.c != value)
    {
      if (this.c)
      {
        Iterator localIterator = this.r.getWorksheets().iterator();
        while (localIterator.hasNext())
        {
          Worksheet localWorksheet = (Worksheet)localIterator.next();
          localWorksheet.getCells().a.f = null;
        }
      }
      else
      {
        this.r.getWorksheets().a((byte)0);
      }
      this.c = value;
    }
  }
  
  public int getDisplayDrawingObjects()
  {
    return this.z;
  }
  
  public void setDisplayDrawingObjects(int value)
  {
    this.z = value;
  }
  
  public boolean getIteration()
  {
    return this.A;
  }
  
  public void setIteration(boolean value)
  {
    this.A = value;
  }
  
  public int getMaxIteration()
  {
    return this.B;
  }
  
  public void setMaxIteration(int value)
  {
    this.B = value;
  }
  
  public double getMaxChange()
  {
    return this.C;
  }
  
  public void setMaxChange(double value)
  {
    this.C = value;
  }
  
  public int getCalcMode()
  {
    return this.D;
  }
  
  public void setCalcMode(int value)
  {
    this.D = value;
  }
  
  public String getCalculationId()
  {
    return this.b;
  }
  
  public void setCalculationId(String value)
  {
    this.b = value;
  }
  
  public int getCalcStackSize()
  {
    return this.E;
  }
  
  public void setCalcStackSize(int value)
  {
    this.E = value;
    this.j = true;
  }
  
  boolean e()
  {
    return this.F;
  }
  
  void a(boolean paramBoolean)
  {
    this.F = paramBoolean;
  }
  
  public boolean getRecalculateBeforeSave()
  {
    return this.G;
  }
  
  public void setRecalculateBeforeSave(boolean value)
  {
    this.G = value;
  }
  
  public int getSheetTabBarWidth()
  {
    return this.I;
  }
  
  public void setSheetTabBarWidth(int value)
  {
    this.I = ((short)value);
  }
  
  public boolean getShowTabs()
  {
    return this.H;
  }
  
  public void setShowTabs(boolean value)
  {
    this.H = value;
  }
  
  public int getFirstVisibleTab()
  {
    return this.r.getWorksheets().P();
  }
  
  public void setFirstVisibleTab(int value)
  {
    this.r.getWorksheets().k(value);
  }
  
  public boolean isHScrollBarVisible()
  {
    return this.J;
  }
  
  public void setHScrollBarVisible(boolean value)
  {
    this.J = value;
  }
  
  public boolean isVScrollBarVisible()
  {
    return this.K;
  }
  
  public void setVScrollBarVisible(boolean value)
  {
    this.K = value;
  }
  
  public boolean getShared()
  {
    if ((this.r.getWorksheets().m != null) && (this.r.getWorksheets().m.getCount() != 0)) {
      return true;
    }
    return this.t;
  }
  
  public void setShared(boolean value)
  {
    this.t = value;
  }
  
  public int getLanguageCode()
  {
    return this.L;
  }
  
  public void setLanguageCode(int value)
  {
    this.L = value;
  }
  
  zzx f()
  {
    return this.s;
  }
  
  public int getRegion()
  {
    return this.s.b();
  }
  
  public void setRegion(int value)
  {
    this.s.a(value);
  }
  
  public Locale getLocale()
  {
    return zj.a(this.s.a());
  }
  
  public void setLocale(Locale value)
  {
    a(zj.a(value));
  }
  
  void a(com.aspose.cells.b.a.c.za paramza)
  {
    this.s.a(paramza);
  }
  
  public GlobalizationSettings getGlobalizationSettings()
  {
    return this.M;
  }
  
  public void setGlobalizationSettings(GlobalizationSettings value)
  {
    this.M = value;
    this.s.j().a(value);
  }
  
  public char getNumberDecimalSeparator()
  {
    return this.s.f().d();
  }
  
  public void setNumberDecimalSeparator(char value)
  {
    if (value != this.s.f().d()) {
      this.s.a(value, this.s.f().e());
    }
  }
  
  public char getNumberGroupSeparator()
  {
    return this.s.f().e();
  }
  
  public void setNumberGroupSeparator(char value)
  {
    if (value != this.s.f().e()) {
      this.s.a(this.s.f().d(), value);
    }
  }
  
  Encoding g()
  {
    return this.k;
  }
  
  void a(Encoding paramEncoding)
  {
    this.k = paramEncoding;
    this.l = false;
  }
  
  public String getPassword()
  {
    return this.N;
  }
  
  public void setPassword(String value)
  {
    this.N = value;
  }
  
  public WriteProtection getWriteProtection()
  {
    if (this.q == null) {
      this.q = new WriteProtection();
    }
    return this.q;
  }
  
  /**
   * @deprecated
   */
  public boolean getRecommendReadOnly()
  {
    return (this.q != null) && (this.q.getRecommendReadOnly());
  }
  
  /**
   * @deprecated
   */
  public void setRecommendReadOnly(boolean value)
  {
    getWriteProtection().setRecommendReadOnly(value);
  }
  
  /**
   * @deprecated
   */
  public boolean isWriteProtected()
  {
    return (this.q != null) && (this.q.isWriteProtected());
  }
  
  /**
   * @deprecated
   */
  public void setWriteProtected(boolean value) {}
  
  /**
   * @deprecated
   */
  public void setWriteProtectedPassword(String value)
  {
    getWriteProtection().setPassword(value);
  }
  
  int h()
  {
    return this.O;
  }
  
  void a(int paramInt)
  {
    this.O = paramInt;
  }
  
  int i()
  {
    return this.P;
  }
  
  void b(int paramInt)
  {
    this.P = paramInt;
  }
  
  public boolean isEncrypted()
  {
    return (this.N != null) && (!"".equals(this.N));
  }
  
  public boolean isProtected()
  {
    return this.r.getWorksheets().F();
  }
  
  public boolean isDefaultEncrypted()
  {
    return this.Q;
  }
  
  public void setDefaultEncrypted(boolean value)
  {
    this.Q = value;
  }
  
  String a(String paramString)
  {
    String str = (String)j().get(paramString);
    if (str == null) {
      return paramString;
    }
    return str;
  }
  
  HashMap j()
  {
    if (this.R == null)
    {
      this.R = new HashMap();
      this.R.put("CG Times (W1)", "Times New Roman");
      this.R.put("CG Times", "Times New Roman");
    }
    return this.R;
  }
  
  public boolean isMinimized()
  {
    return this.S;
  }
  
  public void setMinimized(boolean value)
  {
    this.S = value;
  }
  
  public boolean isHidden()
  {
    return this.T;
  }
  
  public void setHidden(boolean value)
  {
    this.T = value;
  }
  
  boolean k()
  {
    return this.U;
  }
  
  void b(boolean paramBoolean)
  {
    this.U = paramBoolean;
  }
  
  public boolean getAutoCompressPictures()
  {
    return this.V;
  }
  
  public void setAutoCompressPictures(boolean value)
  {
    this.V = value;
  }
  
  public boolean getRemovePersonalInformation()
  {
    if (this.g == null) {
      return false;
    }
    return this.g.c();
  }
  
  public void setRemovePersonalInformation(boolean value)
  {
    c().b(value);
  }
  
  public boolean getHidePivotFieldList()
  {
    if (this.g == null) {
      return false;
    }
    return this.g.b();
  }
  
  public void setHidePivotFieldList(boolean value)
  {
    c().a(value);
  }
  
  short l()
  {
    return this.W;
  }
  
  void a(short paramShort)
  {
    this.W = paramShort;
  }
  
  public int getUpdateLinksType()
  {
    int i1 = 0;
    switch (this.W & 0x60)
    {
    case 32: 
      i1 = 1;
      break;
    case 64: 
      i1 = 2;
      break;
    }
    return i1;
  }
  
  public void setUpdateLinksType(int value)
  {
    this.W = ((short)(this.W & 0xFFFFFF9F));
    switch (value)
    {
    case 1: 
      this.W = ((short)(this.W | 0x20));
      break;
    case 2: 
      this.W = ((short)(this.W | 0x40));
      break;
    }
  }
  
  void a(WorkbookSettings paramWorkbookSettings)
  {
    if (paramWorkbookSettings.g != null) {
      c().a(paramWorkbookSettings.g);
    }
    this.n = paramWorkbookSettings.n;
    this.W = paramWorkbookSettings.W;
    this.U = paramWorkbookSettings.U;
    this.I = paramWorkbookSettings.I;
    this.ae = paramWorkbookSettings.ae;
    this.ad = paramWorkbookSettings.ad;
    this.ac = paramWorkbookSettings.ac;
    this.ab = paramWorkbookSettings.ab;
    this.T = paramWorkbookSettings.T;
    this.S = paramWorkbookSettings.S;
    this.J = paramWorkbookSettings.J;
    this.K = paramWorkbookSettings.K;
    this.t = paramWorkbookSettings.t;
    this.u.a(paramWorkbookSettings.u);
    this.e = paramWorkbookSettings.e;
    this.X = paramWorkbookSettings.X;
    this.q = null;
    if (paramWorkbookSettings.q != null)
    {
      this.q = new WriteProtection();
      this.q.a(paramWorkbookSettings.q);
    }
    this.N = paramWorkbookSettings.N;
    this.w = paramWorkbookSettings.w;
    this.x = paramWorkbookSettings.x;
    this.z = paramWorkbookSettings.z;
    this.i = paramWorkbookSettings.i;
    this.A = paramWorkbookSettings.A;
    this.C = paramWorkbookSettings.C;
    this.B = paramWorkbookSettings.B;
    this.D = paramWorkbookSettings.D;
    this.s.a(paramWorkbookSettings.s);
    this.L = paramWorkbookSettings.L;
    this.k = paramWorkbookSettings.k;
    this.l = paramWorkbookSettings.l;
    if (paramWorkbookSettings.Y != null)
    {
      this.Y = new SmartTagOptions();
      this.Y.a(paramWorkbookSettings.Y);
    }
  }
  
  int m()
  {
    if (this.r.f() == 0) {
      return 65535;
    }
    return 1048575;
  }
  
  int n()
  {
    if (this.r.f() == 0) {
      return 255;
    }
    return 16383;
  }
  
  public boolean getParsingFormulaOnOpen()
  {
    return this.X;
  }
  
  public void setParsingFormulaOnOpen(boolean value)
  {
    this.X = value;
  }
  
  SmartTagOptions o()
  {
    if (this.Y == null) {
      this.Y = new SmartTagOptions();
    }
    return this.Y;
  }
  
  SmartTagOptions p()
  {
    return this.Y;
  }
  
  String q()
  {
    return this.Z;
  }
  
  void b(String paramString)
  {
    this.Z = paramString;
  }
  
  int r()
  {
    return this.aa;
  }
  
  void a(double paramDouble)
  {
    this.aa = ((int)(paramDouble * 20.0D + 0.5D));
  }
  
  int s()
  {
    return this.ae;
  }
  
  void c(int paramInt)
  {
    this.ae = paramInt;
  }
  
  public double getWindowLeft()
  {
    return s() / 20.0D;
  }
  
  public void setWindowLeft(double value)
  {
    c((int)(value * 20.0D + 0.5D));
  }
  
  public double getWindowLeftInch()
  {
    return s() / 1440.0F;
  }
  
  public void setWindowLeftInch(double value)
  {
    c((int)(value * 20.0D * 72.0D + 0.5D));
  }
  
  public double getWindowLeftCM()
  {
    return getWindowLeftInch() * 2.54D;
  }
  
  public void setWindowLeftCM(double value)
  {
    setWindowLeftInch(value / 2.54D);
  }
  
  int t()
  {
    return this.ad;
  }
  
  void d(int paramInt)
  {
    this.ad = paramInt;
  }
  
  public double getWindowTop()
  {
    return t() / 20.0D;
  }
  
  public void setWindowTop(double value)
  {
    d((int)(value * 20.0D + 0.5D));
  }
  
  public double getWindowTopInch()
  {
    return t() / 1440.0F;
  }
  
  public void setWindowTopInch(double value)
  {
    d((int)(value * 20.0D * 72.0D + 0.5D));
  }
  
  public double getWindowTopCM()
  {
    return getWindowTopInch() * 2.54D;
  }
  
  public void setWindowTopCM(double value)
  {
    setWindowTopInch(value / 2.54D);
  }
  
  int u()
  {
    return this.ac;
  }
  
  void e(int paramInt)
  {
    this.ac = paramInt;
  }
  
  public double getWindowWidth()
  {
    return u() / 20.0D;
  }
  
  public void setWindowWidth(double value)
  {
    e((int)(value * 20.0D + 0.5D));
  }
  
  public double getWindowWidthInch()
  {
    return u() / 1440.0F;
  }
  
  public void setWindowWidthInch(double value)
  {
    e((int)(value * 20.0D * 72.0D + 0.5D));
  }
  
  public double getWindowWidthCM()
  {
    return getWindowWidthInch() * 2.54D;
  }
  
  public void setWindowWidthCM(double value)
  {
    setWindowWidthInch(value / 2.54D);
  }
  
  int v()
  {
    return this.ab;
  }
  
  void f(int paramInt)
  {
    this.ab = paramInt;
  }
  
  public double getWindowHeight()
  {
    return v() / 20.0D;
  }
  
  public void setWindowHeight(double value)
  {
    f((int)(value * 20.0D + 0.5D));
  }
  
  public double getWindowHeightInch()
  {
    return v() / 1440.0F;
  }
  
  public void setWindowHeightInch(double value)
  {
    f((int)(value * 20.0D * 72.0D + 0.5D));
  }
  
  public double getWindowHeightCM()
  {
    return getWindowHeightInch() * 2.54D;
  }
  
  public void setWindowHeightCM(double value)
  {
    setWindowHeightInch(value / 2.54D);
  }
  
  public boolean getUpdateAdjacentCellsBorder()
  {
    return this.af;
  }
  
  public void setUpdateAdjacentCellsBorder(boolean value)
  {
    this.af = value;
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.H = true;
    this.I = 600;
    this.T = false;
    this.S = false;
    this.J = true;
    this.K = true;
    this.t = false;
    this.ab = 9225;
    this.ac = 14940;
    this.ad = 120;
    this.ae = 240;
    this.u = new zava();
    this.a = false;
    this.q = null;
    this.w = false;
    this.x = false;
    this.z = 0;
    this.i = 2;
    this.A = false;
    this.C = 0.001D;
    this.B = 100;
    this.D = 0;
    this.Y = null;
    switch (paramInt1)
    {
    case 5: 
    case 52: 
      f().a(null);
      setLanguageCode(0);
      break;
    }
  }
  
  public int getSignificantDigits()
  {
    if (this.ag == -1) {
      return CellsHelper.getSignificantDigits();
    }
    return this.ag;
  }
  
  public void setSignificantDigits(int value)
  {
    this.ag = value;
  }
  
  /**
   * @deprecated
   */
  public boolean getCheckComptiliblity()
  {
    return this.ah;
  }
  
  /**
   * @deprecated
   */
  public void setCheckComptiliblity(boolean value)
  {
    this.ah = value;
  }
  
  public boolean getCheckCompatibility()
  {
    return this.ah;
  }
  
  public void setCheckCompatibility(boolean value)
  {
    this.ah = value;
  }
  
  public boolean getCheckExcelRestriction()
  {
    return this.ai;
  }
  
  public void setCheckExcelRestriction(boolean value)
  {
    this.ai = value;
  }
  
  public boolean getAutoRecover()
  {
    return (this.n & 0xFF & 0x1) == 0;
  }
  
  public void setAutoRecover(boolean value)
  {
    if (value) {
      this.n = ((byte)(this.n & 0xFE));
    } else {
      this.n = ((byte)(this.n | 0x1));
    }
  }
  
  public boolean getCrashSave()
  {
    return (this.n & 0xFF & 0x2) != 0;
  }
  
  public void setCrashSave(boolean value)
  {
    if (value) {
      this.n = ((byte)(this.n | 0x2));
    } else {
      this.n = ((byte)(this.n & 0xFD));
    }
  }
  
  public boolean getDataExtractLoad()
  {
    return (this.n & 0xFF & 0x4) != 0;
  }
  
  public void setDataExtractLoad(boolean value)
  {
    if (value) {
      this.n = ((byte)(this.n | 0x4));
    } else {
      this.n = ((byte)(this.n & 0xFB));
    }
  }
  
  public boolean getRepairLoad()
  {
    return (this.n & 0xFF & 0x8) != 0;
  }
  
  public void setRepairLoad(boolean value)
  {
    if (value) {
      this.n = ((byte)(this.n | 0x8));
    } else {
      this.n = ((byte)(this.n & 0xF7));
    }
  }
  
  zqp w()
  {
    if (this.aj == null) {
      this.aj = new zqp(true);
    }
    return this.aj;
  }
  
  void a(zqp paramzqp)
  {
    this.aj = paramzqp;
  }
  
  zqp x()
  {
    return this.aj;
  }
  
  public String getBuildVersion()
  {
    return w().d;
  }
  
  public void setBuildVersion(String value)
  {
    w().d = value;
  }
  
  public int getMemorySetting()
  {
    return this.ak;
  }
  
  public void setMemorySetting(int value)
  {
    this.ak = value;
  }
  
  public int getPaperSize()
  {
    if (this.m == -1)
    {
      if (this.r.h()) {
        return 1;
      }
      return 9;
    }
    return this.m;
  }
  
  public void setPaperSize(int value)
  {
    this.m = value;
  }
  
  public IWarningCallback getWarningCallback()
  {
    return this.al;
  }
  
  public void setWarningCallback(IWarningCallback value)
  {
    this.al = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WorkbookSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */