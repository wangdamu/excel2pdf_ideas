package com.aspose.cells;

public class ChartFrame
{
  private byte[] i;
  private byte[] j;
  byte[] a;
  byte[] b;
  byte[] c;
  zrb d = null;
  boolean e = true;
  boolean f = true;
  private byte k;
  private boolean l = false;
  private boolean m = false;
  private boolean n = false;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  private int A;
  private Chart B;
  private Line C;
  private Area D;
  protected Font m_font;
  protected int m_fontIndex = -1;
  protected boolean m_AutoScaleFont = true;
  protected int m_BackgroundMode = 0;
  boolean g = true;
  boolean h;
  private boolean E = true;
  private zbwc F;
  private ShapePropertyCollection G;
  private int H = 0;
  
  byte[] b()
  {
    return this.j;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.j = paramArrayOfByte;
    this.B.b(true);
  }
  
  byte[] c()
  {
    return this.i;
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.i = paramArrayOfByte;
    this.B.b(true);
  }
  
  void a(Object paramObject)
  {
    this.E = false;
  }
  
  public boolean isInnerMode()
  {
    return (this.k & 0xFF & 0x10) != 0;
  }
  
  public void setInnerMode(boolean value)
  {
    if (value) {
      this.k = ((byte)(this.k | 0x10));
    } else {
      this.k = ((byte)(this.k & 0xEF));
    }
  }
  
  boolean d()
  {
    return (this.k & 0xFF & 0x1) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.k = ((byte)(this.k | 0x1));
    } else {
      this.k = ((byte)(this.k & 0xFE));
    }
  }
  
  boolean e()
  {
    return (this.k & 0xFF & 0x2) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.k = ((byte)(this.k | 0x2));
    } else {
      this.k = ((byte)(this.k & 0xFD));
    }
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.k = ((byte)(this.k | 0x4));
    } else {
      this.k = ((byte)(this.k & 0xFB));
    }
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.k = ((byte)(this.k | 0x8));
    } else {
      this.k = ((byte)(this.k & 0xF7));
    }
  }
  
  public Chart getChart()
  {
    return this.B;
  }
  
  ChartFrame(Chart chart)
  {
    this.B = chart;
  }
  
  int f()
  {
    return this.A;
  }
  
  void b(int paramInt)
  {
    this.A = paramInt;
  }
  
  public Line getBorder()
  {
    if (this.C == null)
    {
      boolean bool = this.E;
      this.C = new Line(this.B, this);
      if ((this instanceof DataLabels)) {
        this.C.setVisible(false);
      }
      this.E = bool;
    }
    return this.C;
  }
  
  Line g()
  {
    return this.C;
  }
  
  public Area getArea()
  {
    if (this.D == null)
    {
      boolean bool = this.E;
      this.D = new Area(this.B, this);
      if ((this instanceof DataLabels)) {
        this.D.setFormatting(1);
      }
      this.E = bool;
    }
    return this.D;
  }
  
  Area h()
  {
    return this.D;
  }
  
  /**
   * @deprecated
   */
  public Font getTextFont()
  {
    return getFont();
  }
  
  public Font getFont()
  {
    if (this.m_font == null)
    {
      String str = getChart().O().f.a(getChart().n().p().getSettings().getRegion(), false);
      this.m_font = new Font(this.B.n(), null, true);
      if (str != null) {
        this.m_font.f = str;
      }
      this.m_font.b(10.0D);
      Font localFont = null;
      Object localObject1;
      Object localObject2;
      if (this.m_fontIndex != -1)
      {
        localFont = getChart().n().i(this.m_fontIndex);
        this.m_font.a(localFont, null);
        this.m_font.c(true);
        localObject1 = getChart().e(this.m_fontIndex);
        if (localObject1 != null)
        {
          localObject2 = new zbm(((zbm)localObject1).f, 0, false);
          ((zbm)localObject2).a((zbm)localObject1);
          this.m_font.a((zbm)localObject2);
        }
      }
      else
      {
        if ((this.B.n().p().h()) && ((this instanceof Title)))
        {
          localObject1 = (Title)this;
          localObject2 = ((Title)localObject1).L();
          if (localObject2 != null) {
            this.m_font = ((Font)localObject2);
          } else {
            Title.a(this.B, this.m_font, !(((Title)localObject1).k instanceof Axis));
          }
          return this.m_font;
        }
        localFont = this.B.getChartArea().getFont();
        this.m_font.a(localFont, null);
        if (getAutoScaleFont()) {
          this.m_font.a(new zbm(getChart(), 10, true));
        }
      }
      return this.m_font;
    }
    return this.m_font;
  }
  
  Font i()
  {
    return this.m_font;
  }
  
  Font j()
  {
    if ((this.m_font == null) && (this.m_fontIndex != -1)) {
      return this.B.n().i(this.m_fontIndex);
    }
    return this.m_font;
  }
  
  zbm k()
  {
    if (this.m_font != null) {
      return this.m_font.c();
    }
    if (this.m_fontIndex != -1)
    {
      zbm localzbm1 = getChart().e(this.m_fontIndex);
      if (localzbm1 != null)
      {
        zbm localzbm2 = new zbm(localzbm1.f, 0, false);
        localzbm2.a(localzbm1);
        return localzbm2;
      }
      if (this.m_AutoScaleFont) {
        return new zbm(getChart(), 10, true);
      }
    }
    return null;
  }
  
  int l()
  {
    return this.m_fontIndex;
  }
  
  void c(int paramInt)
  {
    this.m_fontIndex = paramInt;
  }
  
  public boolean getAutoScaleFont()
  {
    return this.m_AutoScaleFont;
  }
  
  public void setAutoScaleFont(boolean value)
  {
    if (this.m_AutoScaleFont == value) {
      return;
    }
    if (value)
    {
      if (this.m_font != null)
      {
        zbm localzbm = new zbm(this.B, this.m_font.getSize(), true);
        this.m_font.a(localzbm);
      }
    }
    else {
      getFont().a(null);
    }
    this.m_AutoScaleFont = value;
  }
  
  void a(boolean paramBoolean, zbm paramzbm)
  {
    this.m_AutoScaleFont = paramBoolean;
    if (paramBoolean)
    {
      if (this.m_font != null) {
        this.m_font.a(paramzbm);
      }
    }
    else if (this.m_font != null) {
      this.m_font.a(null);
    }
  }
  
  public int getBackgroundMode()
  {
    return this.m_BackgroundMode;
  }
  
  public void setBackgroundMode(int value)
  {
    this.m_BackgroundMode = value;
  }
  
  /**
   * @deprecated
   */
  public int getBackground()
  {
    return this.m_BackgroundMode;
  }
  
  /**
   * @deprecated
   */
  public void setBackground(int value)
  {
    this.m_BackgroundMode = value;
  }
  
  void d(int paramInt)
  {
    this.m_BackgroundMode = paramInt;
  }
  
  boolean m()
  {
    return (this.e) && (this.f);
  }
  
  boolean n()
  {
    return this.e;
  }
  
  void e(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  boolean o()
  {
    return this.f;
  }
  
  void f(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  boolean p()
  {
    return this.g;
  }
  
  void g(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (!paramBoolean) {
      h(false);
    }
  }
  
  public boolean isAutomaticSize()
  {
    return p();
  }
  
  public void setAutomaticSize(boolean value)
  {
    g(value);
  }
  
  public int getX()
  {
    return this.w;
  }
  
  public void setX(int value)
  {
    this.w = value;
    h(false);
    this.e = false;
    a(true);
    this.l = true;
  }
  
  void e(int paramInt)
  {
    this.w = paramInt;
  }
  
  int q()
  {
    return this.w;
  }
  
  public int getY()
  {
    return this.x;
  }
  
  public void setY(int value)
  {
    this.x = value;
    h(false);
    this.f = false;
    this.e = false;
    b(true);
    this.l = true;
  }
  
  void f(int paramInt)
  {
    this.x = paramInt;
  }
  
  int r()
  {
    return this.x;
  }
  
  public int getHeight()
  {
    return this.y;
  }
  
  public void setHeight(int value)
  {
    this.y = value;
    h(false);
    this.g = false;
    this.l = true;
  }
  
  int s()
  {
    return this.y;
  }
  
  void g(int paramInt)
  {
    this.y = paramInt;
  }
  
  public int getWidth()
  {
    return this.z;
  }
  
  public void setWidth(int value)
  {
    this.z = value;
    h(false);
    this.g = false;
    this.l = true;
  }
  
  void h(int paramInt)
  {
    this.z = paramInt;
  }
  
  int t()
  {
    return this.z;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.w = paramInt1;
    this.x = paramInt2;
    this.z = paramInt3;
    this.y = paramInt4;
  }
  
  public boolean getShadow()
  {
    return this.h;
  }
  
  public void setShadow(boolean value)
  {
    if (this.h != value) {
      h(false);
    }
    this.h = value;
  }
  
  boolean u()
  {
    return this.E;
  }
  
  void h(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }
  
  void a(ChartFrame paramChartFrame, CopyOptions paramCopyOptions)
  {
    this.E = paramChartFrame.E;
    if (paramChartFrame.D != null)
    {
      this.D = null;
      getArea().a(paramChartFrame.D, paramCopyOptions);
    }
    else
    {
      this.D = null;
    }
    if (paramChartFrame.C != null)
    {
      this.C = null;
      getBorder().a(paramChartFrame.C);
    }
    else
    {
      this.C = null;
    }
    this.m_AutoScaleFont = paramChartFrame.m_AutoScaleFont;
    this.m_BackgroundMode = paramChartFrame.m_BackgroundMode;
    this.m_fontIndex = -1;
    if ((paramChartFrame.m_font != null) || (paramChartFrame.m_fontIndex != -1))
    {
      int i1 = 1;
      if ((paramChartFrame.m_font == null) && ((paramCopyOptions.a()) || (paramCopyOptions.b())))
      {
        this.m_fontIndex = paramChartFrame.m_fontIndex;
        i1 = 0;
      }
      if (i1 != 0)
      {
        this.m_font = new Font(this.B.n(), null, true);
        Font localFont = paramChartFrame.j();
        this.m_font.a(localFont, paramCopyOptions);
        zbm localzbm1 = paramChartFrame.k();
        if ((localzbm1 != null) && (paramChartFrame.m_AutoScaleFont))
        {
          zbm localzbm2 = new zbm(this.B, 0, false);
          localzbm2.a(localzbm1);
          this.m_font.a(localzbm2);
        }
      }
    }
    this.y = paramChartFrame.y;
    this.z = paramChartFrame.z;
    this.w = paramChartFrame.w;
    this.x = paramChartFrame.x;
    this.e = paramChartFrame.e;
    this.f = paramChartFrame.f;
    this.g = paramChartFrame.g;
    this.h = paramChartFrame.h;
    this.k = paramChartFrame.k;
    this.s = paramChartFrame.s;
    this.t = paramChartFrame.t;
    this.u = paramChartFrame.u;
    this.v = paramChartFrame.v;
    this.n = paramChartFrame.n;
    this.o = paramChartFrame.o;
    this.p = paramChartFrame.p;
    this.q = paramChartFrame.q;
    this.r = paramChartFrame.r;
    this.m = paramChartFrame.m;
    this.l = paramChartFrame.l;
    if (paramChartFrame.F != null)
    {
      this.F = new zbwc();
      this.F.a = paramChartFrame.F.a;
      this.F.b = paramChartFrame.F.b;
      this.F.c = paramChartFrame.F.c;
      this.F.d = paramChartFrame.F.d;
    }
    if (paramChartFrame.G != null)
    {
      this.G = new ShapePropertyCollection(this.B, this, 11);
      this.G.a(paramChartFrame.G, paramCopyOptions);
    }
    this.d = paramChartFrame.d;
    this.A = paramChartFrame.A;
    a(paramChartFrame.b());
    b(paramChartFrame.c());
    this.a = paramChartFrame.a;
    this.b = paramChartFrame.b;
    this.c = paramChartFrame.c;
  }
  
  void b(ChartFrame paramChartFrame, CopyOptions paramCopyOptions)
  {
    this.E = paramChartFrame.E;
    if (paramChartFrame.D != null)
    {
      this.D = null;
      getArea().a(paramChartFrame.D, paramCopyOptions);
    }
    else
    {
      this.D = null;
    }
    if (paramChartFrame.C != null)
    {
      this.C = null;
      getBorder().a(paramChartFrame.C);
    }
    else
    {
      this.C = null;
    }
    if (paramChartFrame.G != null)
    {
      this.G = new ShapePropertyCollection(this.B, this, 17);
      this.G.a(paramChartFrame.G, paramCopyOptions);
    }
  }
  
  boolean a(ChartFrame paramChartFrame)
  {
    if (this.E != paramChartFrame.E) {
      return false;
    }
    if (this.m_AutoScaleFont != paramChartFrame.m_AutoScaleFont) {
      return false;
    }
    if (this.m_BackgroundMode != paramChartFrame.m_BackgroundMode) {
      return false;
    }
    if (this.m_fontIndex != paramChartFrame.m_fontIndex) {
      return false;
    }
    if (this.y != paramChartFrame.y) {
      return false;
    }
    if (this.z != paramChartFrame.z) {
      return false;
    }
    if (this.w != paramChartFrame.w) {
      return false;
    }
    if (this.x != paramChartFrame.x) {
      return false;
    }
    if (this.e != paramChartFrame.e) {
      return false;
    }
    if (this.f != paramChartFrame.f) {
      return false;
    }
    if (this.g != paramChartFrame.g) {
      return false;
    }
    if (this.h != paramChartFrame.h) {
      return false;
    }
    if (this.k != paramChartFrame.k) {
      return false;
    }
    if (this.s != paramChartFrame.s) {
      return false;
    }
    if (this.t != paramChartFrame.t) {
      return false;
    }
    if (this.u != paramChartFrame.u) {
      return false;
    }
    if (this.v != paramChartFrame.v) {
      return false;
    }
    if (this.n != paramChartFrame.n) {
      return false;
    }
    if (this.o != paramChartFrame.o) {
      return false;
    }
    if (this.p != paramChartFrame.p) {
      return false;
    }
    if (this.q != paramChartFrame.q) {
      return false;
    }
    if (this.r != paramChartFrame.r) {
      return false;
    }
    if (this.m != paramChartFrame.m) {
      return false;
    }
    if (this.l != paramChartFrame.l) {
      return false;
    }
    if ((this.F != null) && (paramChartFrame.F != null))
    {
      if (this.F.a != paramChartFrame.F.a) {
        return false;
      }
      if (this.F.b != paramChartFrame.F.b) {
        return false;
      }
      if (this.F.c != paramChartFrame.F.c) {
        return false;
      }
      if (this.F.d != paramChartFrame.F.d) {
        return false;
      }
    }
    return true;
  }
  
  zbwc v()
  {
    return this.F;
  }
  
  void a(zbwc paramzbwc)
  {
    this.F = paramzbwc;
  }
  
  public ShapePropertyCollection getShapeProperties()
  {
    if (this.G == null) {
      this.G = new ShapePropertyCollection(this.B, this, 17);
    }
    return this.G;
  }
  
  ShapePropertyCollection w()
  {
    return this.G;
  }
  
  boolean x()
  {
    return this.l;
  }
  
  void i(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public boolean isDefaultPosBeSet()
  {
    return this.n;
  }
  
  public int getDefaultX()
  {
    return this.s;
  }
  
  public int getDefaultY()
  {
    return this.t;
  }
  
  public int getDefaultWidth()
  {
    return this.u;
  }
  
  public int getDefaultHeight()
  {
    return this.v;
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.n = true;
    this.s = paramInt1;
    this.t = paramInt2;
    this.u = paramInt3;
    this.v = paramInt4;
  }
  
  boolean y()
  {
    return this.m;
  }
  
  int z()
  {
    return this.o;
  }
  
  void i(int paramInt)
  {
    this.m = true;
    a(false);
    this.o = paramInt;
  }
  
  int A()
  {
    return this.p;
  }
  
  void j(int paramInt)
  {
    this.m = true;
    b(false);
    this.p = paramInt;
  }
  
  int B()
  {
    return this.q;
  }
  
  void k(int paramInt)
  {
    this.q = paramInt;
  }
  
  int C()
  {
    return this.r;
  }
  
  void l(int paramInt)
  {
    this.r = paramInt;
  }
  
  int D()
  {
    return this.H;
  }
  
  void m(int paramInt)
  {
    this.H = paramInt;
  }
  
  public void setPositionAuto()
  {
    e(true);
    f(true);
    g(true);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */