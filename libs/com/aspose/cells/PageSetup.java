package com.aspose.cells;

import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class PageSetup
{
  String[] a;
  String[] b;
  String[] c;
  String[] d;
  String[] e = new String[3];
  String[] f = new String[3];
  private static ze i = null;
  private Worksheet j;
  private Object k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private double p = 0.5D;
  private double q = 0.5D;
  private byte[] r = null;
  private double s = 0.75D;
  private double t = 0.75D;
  private double u = 1.0D;
  private double v = 1.0D;
  private int w = 1;
  private int x = 1;
  private int y = 1;
  private boolean z = true;
  private int A = 0;
  double g = zr.b(8.267716535433072D, 2);
  double h = zr.b(11.692913385826772D, 2);
  private int B = 1;
  private boolean C = false;
  private int D = 1;
  private int E = 2;
  private boolean F;
  private boolean G;
  private int H = 100;
  private int I = 0;
  private int J = 300;
  private int K = 300;
  private int L = 1;
  private byte M = 4;
  private ShapeCollection N;
  private short O = 127;
  
  private static ze n()
  {
    if (i == null) {
      i = new ze("(?<!&)(&[lLcCrR])");
    }
    return i;
  }
  
  public void copy(PageSetup source, CopyOptions copyOptions)
  {
    this.l = source.l;
    this.v = source.v;
    this.m = source.m;
    this.n = source.n;
    this.o = source.o;
    this.w = source.w;
    this.x = source.x;
    this.y = source.y;
    this.z = source.z;
    this.q = source.q;
    this.p = source.p;
    this.s = source.s;
    this.A = source.A;
    this.B = source.B;
    this.C = source.C;
    this.I = source.I;
    if ((source.r != null) && (source.r.length > 0))
    {
      this.r = new byte[source.r.length];
      System.arraycopy(source.r, 0, this.r, 0, source.r.length);
    }
    this.D = source.D;
    this.E = source.E;
    this.G = source.G;
    this.F = source.F;
    this.t = source.t;
    this.u = source.u;
    this.H = source.H;
    this.M = source.M;
    int i1;
    if (source.f != null)
    {
      this.f = new String[3];
      for (i1 = 0; i1 < 3; i1++) {
        this.f[i1] = source.f[i1];
      }
    }
    if (source.e != null)
    {
      this.e = new String[3];
      for (i1 = 0; i1 < 3; i1++) {
        this.e[i1] = source.e[i1];
      }
    }
    this.N = null;
    if ((source.N != null) && (source.N.getCount() != 0))
    {
      Iterator localIterator = source.N.iterator();
      while (localIterator.hasNext())
      {
        Shape localShape = (Shape)localIterator.next();
        Picture localPicture1 = (Picture)localShape;
        Picture localPicture2 = new Picture(i());
        localPicture2.copy(localPicture1, copyOptions);
        i().c(localPicture2);
      }
    }
    this.J = source.J;
    this.K = source.K;
    this.O = source.O;
  }
  
  private boolean o()
  {
    return this.k instanceof Worksheet;
  }
  
  PageSetup(Worksheet sheet, Object parent)
  {
    this.j = sheet;
    this.k = parent;
    this.I = sheet.c().p().getSettings().getPaperSize();
    if (sheet.c().p().h())
    {
      this.K = (this.J = 'ɘ');
      this.M = 12;
    }
    else
    {
      this.K = (this.J = 'Ĭ');
      this.M = 4;
    }
  }
  
  public String getPrintArea()
  {
    Range[] arrayOfRange = b(false);
    if (arrayOfRange != null)
    {
      WorkbookSettings localWorkbookSettings = this.j.c().p().getSettings();
      int i1 = localWorkbookSettings.m();
      int i2 = localWorkbookSettings.n();
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i3 = 0; i3 < arrayOfRange.length; i3++)
      {
        localStringBuilder.append(arrayOfRange[i3].a(i1, i2, false));
        if (i3 != arrayOfRange.length - 1) {
          localStringBuilder.append(',');
        }
      }
      return zs.a(localStringBuilder);
    }
    return null;
  }
  
  public void setPrintArea(String value)
  {
    if (o()) {
      this.j.c().getNames().a(this.j.getIndex(), "Print_Area", value, true);
    }
  }
  
  public String getPrintTitleColumns()
  {
    Range[] arrayOfRange = b(true);
    if ((arrayOfRange != null) && (arrayOfRange[1] != null))
    {
      WorkbookSettings localWorkbookSettings = this.j.c().p().getSettings();
      int i1 = localWorkbookSettings.m();
      int i2 = localWorkbookSettings.n();
      return arrayOfRange[1].a(i1, i2, true);
    }
    return null;
  }
  
  public void setPrintTitleColumns(String value)
  {
    if (!o()) {
      return;
    }
    if ((!zbsn.a(value)) && (value.indexOf(":") == -1)) {
      throw new CellsException(6, "Invalid print title.");
    }
    String str1 = getPrintTitleRows();
    String str2 = value;
    String str3 = null;
    if ((str1 != null) && (!"".equals(str1)))
    {
      str3 = str1;
      if ((str2 != null) && (!"".equals(str2))) {
        str3 = str3 + "," + str2;
      }
    }
    else
    {
      str3 = str2;
    }
    this.j.c().getNames().a(this.j.getIndex(), "Print_Titles", str3, true);
  }
  
  public String getPrintTitleRows()
  {
    Range[] arrayOfRange = b(true);
    if ((arrayOfRange != null) && (arrayOfRange[0] != null))
    {
      WorkbookSettings localWorkbookSettings = this.j.c().p().getSettings();
      int i1 = localWorkbookSettings.m();
      int i2 = localWorkbookSettings.n();
      return arrayOfRange[0].a(i1, i2, true);
    }
    return null;
  }
  
  public void setPrintTitleRows(String value)
  {
    if (!o()) {
      return;
    }
    if ((!zbsn.a(value)) && (value.indexOf(":") == -1)) {
      throw new CellsException(6, "Invalid print title.");
    }
    String str1 = value;
    String str2 = getPrintTitleColumns();
    String str3 = null;
    if ((str1 != null) && (!"".equals(str1)))
    {
      str3 = str1;
      if ((str2 != null) && (!"".equals(str2))) {
        str3 = str3 + "," + str2;
      }
    }
    else
    {
      str3 = str2;
    }
    this.j.c().getNames().a(this.j.getIndex(), "Print_Titles", str3, true);
  }
  
  void a(String paramString)
  {
    if (o()) {
      this.j.c().getNames().a(this.j.getIndex(), "Print_Titles", paramString, true);
    }
  }
  
  boolean a(boolean paramBoolean)
  {
    if (!o()) {
      return false;
    }
    return this.j.c().getNames().a(paramBoolean ? "Print_Titles" : "Print_Area", this.j.getIndex(), false) > 0;
  }
  
  Range[] b(boolean paramBoolean)
  {
    if (!o()) {
      return null;
    }
    WorkbookSettings localWorkbookSettings = this.j.c().p().getSettings();
    int i1 = localWorkbookSettings.m();
    int i2 = localWorkbookSettings.n();
    Range[] arrayOfRange = this.j.c().getNames().f(this.j.getIndex(), paramBoolean ? "Print_Titles" : "Print_Area");
    if ((paramBoolean) && (arrayOfRange != null))
    {
      Object localObject;
      if (arrayOfRange.length == 1)
      {
        localObject = new Range[2];
        if (arrayOfRange[0].a(i2)) {
          localObject[0] = arrayOfRange[0];
        } else if (arrayOfRange[0].b(i1)) {
          localObject[1] = arrayOfRange[0];
        } else {
          return null;
        }
        return (Range[])localObject;
      }
      if ((arrayOfRange.length == 2) && (!arrayOfRange[0].a(i2)))
      {
        localObject = arrayOfRange[0];
        arrayOfRange[0] = arrayOfRange[1];
        arrayOfRange[1] = localObject;
      }
    }
    return arrayOfRange;
  }
  
  public boolean getBlackAndWhite()
  {
    return this.l;
  }
  
  public void setBlackAndWhite(boolean value)
  {
    this.l = value;
  }
  
  public boolean getCenterHorizontally()
  {
    return this.m;
  }
  
  public void setCenterHorizontally(boolean value)
  {
    this.m = value;
  }
  
  public boolean getCenterVertically()
  {
    return this.n;
  }
  
  public void setCenterVertically(boolean value)
  {
    this.n = value;
  }
  
  public boolean getPrintDraft()
  {
    return this.o;
  }
  
  public void setPrintDraft(boolean value)
  {
    this.o = value;
  }
  
  public double getFooterMargin()
  {
    return this.p * 2.54D;
  }
  
  public void setFooterMargin(double value)
  {
    this.p = (value / 2.54D);
  }
  
  public double getFooterMarginInch()
  {
    return this.p;
  }
  
  public void setFooterMarginInch(double value)
  {
    this.p = value;
  }
  
  public double getHeaderMargin()
  {
    return this.q * 2.54D;
  }
  
  public void setHeaderMargin(double value)
  {
    this.q = (value / 2.54D);
  }
  
  public double getHeaderMarginInch()
  {
    return this.q;
  }
  
  public void setHeaderMarginInch(double value)
  {
    this.q = value;
  }
  
  public byte[] getPrinterSettings()
  {
    return this.r;
  }
  
  public void setPrinterSettings(byte[] value)
  {
    this.r = value;
  }
  
  public double getLeftMargin()
  {
    return this.s * 2.54D;
  }
  
  public void setLeftMargin(double value)
  {
    this.s = (value / 2.54D);
  }
  
  public double getLeftMarginInch()
  {
    return this.s;
  }
  
  public void setLeftMarginInch(double value)
  {
    this.s = value;
  }
  
  public double getRightMargin()
  {
    return this.t * 2.54D;
  }
  
  public void setRightMargin(double value)
  {
    this.t = (value / 2.54D);
  }
  
  public double getRightMarginInch()
  {
    return this.t;
  }
  
  public void setRightMarginInch(double value)
  {
    this.t = value;
  }
  
  public double getTopMargin()
  {
    return this.u * 2.54D;
  }
  
  public void setTopMargin(double value)
  {
    this.u = (value / 2.54D);
  }
  
  public double getTopMarginInch()
  {
    return this.u;
  }
  
  public void setTopMarginInch(double value)
  {
    this.u = value;
  }
  
  public double getBottomMargin()
  {
    return this.v * 2.54D;
  }
  
  public void setBottomMargin(double value)
  {
    this.v = (value / 2.54D);
  }
  
  public double getBottomMarginInch()
  {
    return this.v;
  }
  
  public void setBottomMarginInch(double value)
  {
    this.v = value;
  }
  
  public int getFirstPageNumber()
  {
    return this.w;
  }
  
  public void setFirstPageNumber(int value)
  {
    this.w = value;
    setAutoFirstPageNumber(false);
  }
  
  public void setFitToPages(int wide, int tall)
  {
    e(false);
    this.y = wide;
    this.x = tall;
    this.z = false;
  }
  
  public int getFitToPagesTall()
  {
    return this.x;
  }
  
  public void setFitToPagesTall(int value)
  {
    if ((value >= 0) && (value <= 65535))
    {
      e(false);
      this.x = value;
      this.z = false;
    }
  }
  
  void a(int paramInt)
  {
    this.x = paramInt;
  }
  
  void b(int paramInt)
  {
    this.y = paramInt;
  }
  
  public int getFitToPagesWide()
  {
    return this.y;
  }
  
  public void setFitToPagesWide(int value)
  {
    if ((value >= 0) && (value <= 65535))
    {
      e(false);
      this.y = value;
      this.z = false;
    }
  }
  
  public boolean isPercentScale()
  {
    return this.z;
  }
  
  public void setPercentScale(boolean value)
  {
    this.z = value;
  }
  
  public int getOrder()
  {
    return this.A;
  }
  
  public void setOrder(int value)
  {
    this.A = value;
  }
  
  int a()
  {
    if (k()) {
      return this.j.c().p().getSettings().getPaperSize();
    }
    if (this.I == 0) {
      return zauu.a(this.g, this.h);
    }
    if (((this.I > 0) && (this.I <= 118)) || ((this.I >= 300) && (this.I <= 302))) {
      return this.I;
    }
    return 9;
  }
  
  public boolean isAutomaticPaperSize()
  {
    if (this.I == -1) {
      return true;
    }
    return (this.O & 0x1) != 0;
  }
  
  public int getPaperSize()
  {
    if (k()) {
      return this.j.c().p().getSettings().getPaperSize();
    }
    if (((this.I >= 0) && (this.I <= 118)) || ((this.I >= 300) && (this.I <= 302))) {
      return this.I;
    }
    return 9;
  }
  
  public void setPaperSize(int value)
  {
    d(false);
    this.I = value;
  }
  
  public double getPaperWidth()
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    zauu.a(this, arrayOfDouble1, arrayOfDouble2);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    return d1;
  }
  
  public double getPaperHeight()
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d1 };
    double[] arrayOfDouble2 = { d2 };
    zauu.a(this, arrayOfDouble1, arrayOfDouble2);
    d1 = arrayOfDouble1[0];
    d2 = arrayOfDouble2[0];
    return d2;
  }
  
  public void customPaperSize(double width, double height)
  {
    this.g = width;
    this.h = height;
    this.I = 0;
    d(false);
  }
  
  void b()
  {
    this.B = 0;
    this.C = false;
  }
  
  public int getOrientation()
  {
    return this.B;
  }
  
  public void setOrientation(int value)
  {
    h(false);
    this.B = value;
    this.C = false;
  }
  
  public int getPrintComments()
  {
    return this.D;
  }
  
  public void setPrintComments(int value)
  {
    this.D = value;
  }
  
  public int getPrintErrors()
  {
    return this.E;
  }
  
  public void setPrintErrors(int value)
  {
    this.E = value;
  }
  
  public boolean getPrintHeadings()
  {
    return this.F;
  }
  
  public void setPrintHeadings(boolean value)
  {
    this.F = value;
  }
  
  public boolean getPrintGridlines()
  {
    return this.G;
  }
  
  public void setPrintGridlines(boolean value)
  {
    this.G = value;
  }
  
  public int getZoom()
  {
    return this.H;
  }
  
  public void setZoom(int value)
  {
    if ((value >= 10) && (value <= 400))
    {
      e(false);
      this.H = value;
      this.z = true;
    }
    else
    {
      throw new IllegalArgumentException("Zoom value should be between 10 and 400.");
    }
  }
  
  void c(int paramInt)
  {
    this.H = paramInt;
  }
  
  int c()
  {
    return this.I;
  }
  
  public boolean isAutoFirstPageNumber()
  {
    return (this.O & 0x40) != 0;
  }
  
  public void setAutoFirstPageNumber(boolean value)
  {
    if (value) {
      this.O = ((short)(this.O | 0x40));
    } else {
      this.O = ((short)(this.O & 0xFFFFFFBF));
    }
  }
  
  void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 34) {
      return;
    }
    this.I = (zc.e(paramArrayOfByte, 0) & 0xFFFF);
    this.w = zc.b(paramArrayOfByte, 4);
    this.y = (zc.e(paramArrayOfByte, 6) & 0xFFFF);
    this.x = (zc.e(paramArrayOfByte, 8) & 0xFFFF);
    int i1 = paramArrayOfByte[10] & 0xFF & 0x1;
    if (i1 == 0) {
      this.A = 0;
    } else {
      this.A = 1;
    }
    i1 = paramArrayOfByte[10] & 0xFF & 0x2;
    if (i1 == 0) {
      this.B = 0;
    } else {
      this.B = 1;
    }
    i1 = paramArrayOfByte[10] & 0xFF & 0x4;
    if (i1 != 0)
    {
      c(false);
      if ((this.j != null) && (this.j.getType() != 2)) {
        this.B = 1;
      }
    }
    else
    {
      c(true);
      d(false);
      i2 = zc.e(paramArrayOfByte, 2);
      if (((i2 & 0xFFFF) >= 10) && ((i2 & 0xFFFF) <= 400)) {
        this.H = (i2 & 0xFFFF);
      }
    }
    i1 = paramArrayOfByte[10] & 0xFF & 0x8;
    if (i1 == 0) {
      this.l = false;
    } else {
      this.l = true;
    }
    i1 = paramArrayOfByte[10] & 0xFF & 0x10;
    if (i1 == 0) {
      this.o = false;
    } else {
      this.o = true;
    }
    i1 = paramArrayOfByte[10] & 0xFF & 0x80;
    setAutoFirstPageNumber(i1 == 0);
    this.C = ((paramArrayOfByte[10] & 0xFF & 0x40) != 0);
    if (this.C) {
      this.B = 1;
    }
    int i2 = paramArrayOfByte[10] & 0xFF & 0x20;
    i1 = paramArrayOfByte[11] & 0xFF & 0x2;
    if (i2 == 0) {
      this.D = 1;
    } else if (i1 == 0) {
      this.D = 0;
    } else {
      this.D = 2;
    }
    i1 = (paramArrayOfByte[11] & 0xFF & 0xC) >> 2;
    switch (i1)
    {
    case 0: 
      this.E = 2;
      break;
    case 1: 
      this.E = 0;
      break;
    case 2: 
      this.E = 1;
      break;
    case 3: 
      this.E = 3;
      break;
    }
    int i3 = zc.b(paramArrayOfByte, 12);
    if (i3 > 0) {
      this.J = i3;
    }
    i3 = zc.b(paramArrayOfByte, 14);
    if (i3 > 0) {
      this.K = i3;
    }
    this.q = zc.f(paramArrayOfByte, 16);
    this.p = zc.f(paramArrayOfByte, 24);
    if (e())
    {
      int i4 = zc.e(paramArrayOfByte, 32) & 0xFFFF;
      if (i4 > 0) {
        this.L = i4;
      }
    }
  }
  
  byte[] d()
  {
    byte[] arrayOfByte = new byte[34];
    int i1 = this.I;
    System.arraycopy(zc.a(i1), 0, arrayOfByte, 0, 2);
    System.arraycopy(zc.a(this.H), 0, arrayOfByte, 2, 2);
    System.arraycopy(zc.a(this.w), 0, arrayOfByte, 4, 2);
    System.arraycopy(zc.a(this.y), 0, arrayOfByte, 6, 2);
    System.arraycopy(zc.a(this.x), 0, arrayOfByte, 8, 2);
    if (this.A == 1)
    {
      byte[] tmp90_87 = arrayOfByte;
      tmp90_87[10] = ((byte)(tmp90_87[10] | 0x1));
    }
    if (this.B == 1)
    {
      byte[] tmp107_104 = arrayOfByte;
      tmp107_104[10] = ((byte)(tmp107_104[10] | 0x2));
    }
    if (!e())
    {
      byte[] tmp123_120 = arrayOfByte;
      tmp123_120[10] = ((byte)(tmp123_120[10] | 0x4));
    }
    if (this.l)
    {
      byte[] tmp139_136 = arrayOfByte;
      tmp139_136[10] = ((byte)(tmp139_136[10] | 0x8));
    }
    if (this.o)
    {
      byte[] tmp156_153 = arrayOfByte;
      tmp156_153[10] = ((byte)(tmp156_153[10] | 0x10));
    }
    if (this.D != 1)
    {
      byte[] tmp174_171 = arrayOfByte;
      tmp174_171[10] = ((byte)(tmp174_171[10] | 0x20));
    }
    if (this.C)
    {
      byte[] tmp191_188 = arrayOfByte;
      tmp191_188[10] = ((byte)(tmp191_188[10] | 0x40));
    }
    if ((!isAutoFirstPageNumber()) || (this.w != 1))
    {
      byte[] tmp216_213 = arrayOfByte;
      tmp216_213[10] = ((byte)(tmp216_213[10] | 0x80));
    }
    if (this.D == 2)
    {
      byte[] tmp235_232 = arrayOfByte;
      tmp235_232[11] = ((byte)(tmp235_232[11] | 0x2));
    }
    switch (this.E)
    {
    case 0: 
      byte[] tmp279_276 = arrayOfByte;
      tmp279_276[11] = ((byte)(tmp279_276[11] | 0x4));
      break;
    case 1: 
      byte[] tmp291_288 = arrayOfByte;
      tmp291_288[11] = ((byte)(tmp291_288[11] | 0x8));
      break;
    case 3: 
      byte[] tmp304_301 = arrayOfByte;
      tmp304_301[11] = ((byte)(tmp304_301[11] | 0xC));
      break;
    }
    System.arraycopy(zc.a(this.J), 0, arrayOfByte, 12, 2);
    System.arraycopy(zc.a(this.K), 0, arrayOfByte, 14, 2);
    System.arraycopy(zc.a(this.q), 0, arrayOfByte, 16, 8);
    System.arraycopy(zc.a(this.p), 0, arrayOfByte, 24, 8);
    System.arraycopy(zc.a(this.L), 0, arrayOfByte, 32, 2);
    return arrayOfByte;
  }
  
  boolean e()
  {
    return (this.O & 0x3F) != 63;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.O = ((short)(this.O & 0xFFFFFFC0));
    } else {
      this.O = ((short)(this.O | 0x3F));
    }
  }
  
  int f()
  {
    return this.J;
  }
  
  void d(int paramInt)
  {
    this.J = paramInt;
    if (this.j != null) {
      this.j.E();
    }
  }
  
  int g()
  {
    return this.K;
  }
  
  void e(int paramInt)
  {
    this.K = paramInt;
    if (this.j != null) {
      this.j.E();
    }
  }
  
  public int getPrintQuality()
  {
    return this.J;
  }
  
  public void setPrintQuality(int value)
  {
    if (value > 0)
    {
      this.J = value;
      this.K = value;
      f(false);
      g(false);
      if (this.j != null) {
        this.j.E();
      }
    }
  }
  
  public int getPrintCopies()
  {
    return this.L;
  }
  
  public void setPrintCopies(int value)
  {
    c(true);
    this.L = value;
  }
  
  public void clearHeaderFooter()
  {
    this.f = new String[3];
    this.e = new String[3];
  }
  
  public String getHeader(int section)
  {
    if ((section < 0) || (section > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.f == null) {
      return null;
    }
    return this.f[section];
  }
  
  public HeaderFooterCommand[] getCommands(String headerFooterScript)
  {
    if (zw.b(headerFooterScript)) {
      return null;
    }
    char[] arrayOfChar = headerFooterScript.toCharArray();
    int i1 = 0;
    for (int i2 = 0; i2 < arrayOfChar.length - 1; i2++) {
      if (arrayOfChar[i2] == '&')
      {
        i2++;
        switch (headerFooterScript.charAt(i2))
        {
        case 'C': 
        case 'L': 
        case 'R': 
        case 'c': 
        case 'l': 
        case 'r': 
          i1 = i2 + 1;
          break;
        default: 
          break label121;
        }
      }
    }
    label121:
    if (i1 == arrayOfChar.length) {
      return null;
    }
    ArrayList localArrayList = HeaderFooterCommand.a(this.j.c().p(), arrayOfChar, i1);
    HeaderFooterCommand[] arrayOfHeaderFooterCommand = new HeaderFooterCommand[localArrayList.size()];
    Font localFont = new Font(this.j.c(), null, false);
    localFont.a(this.j.c().T(), null);
    for (int i3 = 0; i3 < arrayOfHeaderFooterCommand.length; i3++)
    {
      arrayOfHeaderFooterCommand[i3] = ((HeaderFooterCommand)localArrayList.get(i3));
      if ((arrayOfHeaderFooterCommand[i3].getFont() == null) && (arrayOfHeaderFooterCommand[i3].getType() != 8)) {
        arrayOfHeaderFooterCommand[i3].a = localFont;
      }
    }
    return arrayOfHeaderFooterCommand;
  }
  
  String f(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.f == null) {
      return null;
    }
    String str = this.f[paramInt];
    if (str != null) {
      str = n().b(str, "");
    }
    return str;
  }
  
  public String getFooter(int section)
  {
    if ((section < 0) || (section > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.e == null) {
      return null;
    }
    return this.e[section];
  }
  
  String g(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.e == null) {
      return null;
    }
    String str = this.e[paramInt];
    if (str != null) {
      str = n().b(str, "");
    }
    return str;
  }
  
  public void setHeader(int section, String headerScript)
  {
    a(this.f, section, headerScript);
  }
  
  public void setFooter(int section, String footerScript)
  {
    a(this.e, section, footerScript);
  }
  
  static void a(String[] paramArrayOfString, int paramInt, String paramString)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if ((paramString == null) || ("".equals(paramString)))
    {
      paramArrayOfString[paramInt] = null;
      return;
    }
    paramString = n().b(paramString, "");
    switch (paramInt)
    {
    case 0: 
      paramArrayOfString[0] = paramString;
      break;
    case 1: 
      paramArrayOfString[1] = paramString;
      break;
    case 2: 
      paramArrayOfString[2] = paramString;
    }
  }
  
  byte h()
  {
    return this.M;
  }
  
  void a(byte paramByte)
  {
    this.M = paramByte;
  }
  
  public void setEvenHeader(int section, String headerScript)
  {
    if (this.a == null) {
      this.a = new String[3];
    }
    a(this.a, section, headerScript);
  }
  
  String h(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.a == null) {
      return null;
    }
    String str = this.a[paramInt];
    if (str != null) {
      str = n().b(str, "");
    }
    return str;
  }
  
  public String getEvenHeader(int section)
  {
    if ((section < 0) || (section > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.a == null) {
      return null;
    }
    return this.a[section];
  }
  
  String i(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.b == null) {
      return null;
    }
    String str = this.b[paramInt];
    if (str != null) {
      str = n().b(str, "");
    }
    return str;
  }
  
  public void setEvenFooter(int section, String footerScript)
  {
    if (this.b == null) {
      this.b = new String[3];
    }
    a(this.b, section, footerScript);
  }
  
  public String getEvenFooter(int section)
  {
    if ((section < 0) || (section > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.b == null) {
      return null;
    }
    return this.b[section];
  }
  
  private static String a(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramArrayOfString[0] != null) && (paramArrayOfString[0].length() != 0))
    {
      if (!paramArrayOfString[0].startsWith("&L")) {
        localStringBuilder.append("&L");
      }
      localStringBuilder.append(paramArrayOfString[0]);
    }
    if ((paramArrayOfString[1] != null) && (paramArrayOfString[1].length() != 0))
    {
      if (!paramArrayOfString[1].startsWith("&C")) {
        localStringBuilder.append("&C");
      }
      localStringBuilder.append(paramArrayOfString[1]);
    }
    if ((paramArrayOfString[2] != null) && (paramArrayOfString[2].length() != 0))
    {
      if (!paramArrayOfString[2].startsWith("&R")) {
        localStringBuilder.append("&R");
      }
      localStringBuilder.append(paramArrayOfString[2]);
    }
    return zs.a(localStringBuilder);
  }
  
  String a(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {
      switch (paramInt)
      {
      case 0: 
        return a(this.a);
      case 2: 
        return a(this.d);
      case 1: 
        return a(this.f);
      }
    } else {
      switch (paramInt)
      {
      case 0: 
        return a(this.b);
      case 2: 
        return a(this.c);
      case 1: 
        return a(this.e);
      }
    }
    return "";
  }
  
  public void setFirstPageHeader(int section, String headerScript)
  {
    if (this.d == null) {
      this.d = new String[3];
    }
    a(this.d, section, headerScript);
  }
  
  public String getFirstPageHeader(int section)
  {
    if ((section < 0) || (section > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.d == null) {
      return null;
    }
    return this.d[section];
  }
  
  public void setFirstPageFooter(int section, String footerScript)
  {
    if (this.c == null) {
      this.c = new String[3];
    }
    a(this.c, section, footerScript);
  }
  
  String j(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.c == null) {
      return null;
    }
    String str = this.c[paramInt];
    if (str != null) {
      str = n().b(str, "");
    }
    return str;
  }
  
  String k(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.d == null) {
      return null;
    }
    String str = this.d[paramInt];
    if (str != null) {
      str = n().b(str, "");
    }
    return str;
  }
  
  public String getFirstPageFooter(int section)
  {
    if ((section < 0) || (section > 2)) {
      throw new IllegalArgumentException("The section number is out of range.");
    }
    if (this.c == null) {
      return null;
    }
    return this.c[section];
  }
  
  public boolean isHFDiffOddEven()
  {
    return (this.M & 0xFF & 0x1) != 0;
  }
  
  public void setHFDiffOddEven(boolean value)
  {
    if (value) {
      this.M = ((byte)(this.M | 0x1));
    } else {
      this.M = ((byte)(this.M & 0xFFFFFFFE));
    }
  }
  
  public boolean isHFDiffFirst()
  {
    return (this.M & 0xFF & 0x2) != 0;
  }
  
  public void setHFDiffFirst(boolean value)
  {
    if (value) {
      this.M = ((byte)(this.M | 0x2));
    } else {
      this.M = ((byte)(this.M & 0xFFFFFFFD));
    }
  }
  
  public boolean isHFScaleWithDoc()
  {
    return (this.M & 0xFF & 0x4) != 0;
  }
  
  public void setHFScaleWithDoc(boolean value)
  {
    if (value) {
      this.M = ((byte)(this.M | 0x4));
    } else {
      this.M = ((byte)(this.M & 0xFFFFFFFB));
    }
  }
  
  public boolean isHFAlignMargins()
  {
    return (this.M & 0xFF & 0x8) != 0;
  }
  
  public void setHFAlignMargins(boolean value)
  {
    if (value) {
      this.M = ((byte)(this.M | 0x8));
    } else {
      this.M = ((byte)(this.M & 0xFFFFFFF7));
    }
  }
  
  static void a(String paramString, String[] paramArrayOfString)
  {
    int i1 = -1;
    int i2 = 0;
    for (int i3 = 0; i3 < paramString.length(); i3++) {
      if ((paramString.charAt(i3) == '&') && (i3 + 1 < paramString.length()))
      {
        int i4 = 1;
        switch (paramString.charAt(i3 + 1))
        {
        case '&': 
          i3++;
          break;
        case 'L': 
        case 'l': 
          i4 = 0;
          break;
        case 'R': 
        case 'r': 
          i4 = 2;
          break;
        case 'C': 
        case 'c': 
          i4 = 1;
          break;
        }
        if (i3 - i2 > 0)
        {
          if ((i2 == 0) && (i1 == -1)) {
            i1 = i4 - 1 < 0 ? 0 : i4 - 1;
          }
          a(paramArrayOfString, i1, paramString.substring(i2, i2 + (i3 - i2)));
        }
        i1 = i4;
        i2 = i3;
      }
    }
    if (i2 < paramString.length()) {
      a(paramArrayOfString, i1 == -1 ? 1 : i1, paramString.substring(i2));
    }
  }
  
  void b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length <= 2) {
      return;
    }
    String str;
    if (paramArrayOfByte[2] == 0)
    {
      byte[] arrayOfByte = new byte[(paramArrayOfByte.length - 3) * 2];
      for (int i1 = 0; i1 < arrayOfByte.length / 2; i1++) {
        arrayOfByte[(2 * i1)] = paramArrayOfByte[(3 + i1)];
      }
      str = Encoding.getUnicode().a(arrayOfByte);
    }
    else
    {
      str = Encoding.getUnicode().a(paramArrayOfByte, 3, paramArrayOfByte.length - 3);
    }
    if (this.f == null) {
      this.f = new String[3];
    }
    a(str, this.f);
  }
  
  void c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length <= 2) {
      return;
    }
    if (this.e == null) {
      this.e = new String[3];
    }
    String str;
    if (paramArrayOfByte[2] == 0)
    {
      byte[] arrayOfByte = new byte[(paramArrayOfByte.length - 3) * 2];
      for (int i1 = 0; i1 < arrayOfByte.length / 2; i1++) {
        arrayOfByte[(2 * i1)] = paramArrayOfByte[(3 + i1)];
      }
      str = Encoding.getUnicode().a(arrayOfByte);
    }
    else
    {
      str = Encoding.getUnicode().a(paramArrayOfByte, 3, paramArrayOfByte.length - 3);
    }
    a(str, this.e);
  }
  
  static char l(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 'L';
    case 1: 
      return 'C';
    case 2: 
      return 'R';
    }
    throw new IllegalArgumentException("The section number is out of range.");
  }
  
  ShapeCollection i()
  {
    if (this.N == null) {
      this.N = new ShapeCollection(this.j.c(), this.j, this.j.c().N(), this, -1);
    }
    return this.N;
  }
  
  void a(ShapeCollection paramShapeCollection)
  {
    this.N = paramShapeCollection;
  }
  
  ShapeCollection j()
  {
    return this.N;
  }
  
  public Picture setHeaderPicture(int section, byte[] headerPicture)
  {
    String str = l(section) + "H";
    int i1 = b(str);
    if (i1 != -1) {
      i().c(i1);
    }
    return a(str, headerPicture);
  }
  
  public Picture setFooterPicture(int section, byte[] footerPicture)
  {
    String str = l(section) + "F";
    int i1 = b(str);
    if (i1 != -1) {
      i().c(i1);
    }
    return a(str, footerPicture);
  }
  
  public Picture setPicture(boolean isFirst, boolean isEven, boolean isHeader, int section, byte[] imageData)
  {
    String str = a(isFirst, isEven, isHeader, section);
    int i1 = b(str);
    if (i1 != -1) {
      i().c(i1);
    }
    if ((imageData == null) || (imageData.length == 0)) {
      return null;
    }
    return a(str, imageData);
  }
  
  public Picture getPicture(boolean isHeader, int section)
  {
    String str = "" + l(section);
    if (isHeader) {
      str = str + "H";
    } else {
      str = str + "F";
    }
    int i1 = b(str);
    if (i1 != -1) {
      return (Picture)i().get(i1);
    }
    return null;
  }
  
  public Picture getPicture(boolean isFirst, boolean isEven, boolean isHeader, int section)
  {
    String str = a(isFirst, isEven, isHeader, section);
    int i1 = b(str);
    if (i1 != -1) {
      return (Picture)i().get(i1);
    }
    return null;
  }
  
  Picture a(String paramString, byte[] paramArrayOfByte)
  {
    Picture localPicture = new Picture(i());
    localPicture.a(i().a(localPicture, paramArrayOfByte));
    localPicture.a(null);
    localPicture.R().d().a(50048, 2, paramString);
    zcf localzcf = localPicture.a();
    int i1 = 0;
    int i2 = 0;
    if (localzcf != null)
    {
      i1 = localzcf.k();
      i2 = localzcf.l();
    }
    localPicture.a(0, false, 0, 0, i1, i2);
    return localPicture;
  }
  
  private String a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(l(paramInt));
    if (paramBoolean3) {
      localStringBuilder.append("H");
    } else {
      localStringBuilder.append("F");
    }
    if (paramBoolean1) {
      localStringBuilder.append("FIRST");
    } else if (paramBoolean2) {
      localStringBuilder.append("EVEN");
    }
    return zs.a(localStringBuilder);
  }
  
  private int b(String paramString)
  {
    if ((this.N == null) || (this.N.getCount() == 0)) {
      return -1;
    }
    int i1 = 0;
    Iterator localIterator = this.N.iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      String str = localShape.R().d().e(50048);
      if ((str == null) || ("".equals(str))) {
        str = localShape.R().d().e(33664);
      }
      if (zw.b(str, paramString)) {
        return i1;
      }
      i1++;
    }
    return -1;
  }
  
  boolean k()
  {
    return (this.O & 0x1) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.O = ((short)(this.O | 0x1));
    } else {
      this.O = ((short)(this.O & 0xFFFFFFFE));
    }
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.O = ((short)(this.O | 0x2));
    } else {
      this.O = ((short)(this.O & 0xFFFFFFFD));
    }
  }
  
  boolean l()
  {
    return (this.O & 0x4) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.O = ((short)(this.O | 0x4));
    } else {
      this.O = ((short)(this.O & 0xFFFFFFFB));
    }
  }
  
  boolean m()
  {
    return (this.O & 0x8) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.O = ((short)(this.O | 0x8));
    } else {
      this.O = ((short)(this.O & 0xFFFFFFF7));
    }
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.O = ((short)(this.O | 0x20));
    } else {
      this.O = ((short)(this.O & 0xFFFFFFDF));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PageSetup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */