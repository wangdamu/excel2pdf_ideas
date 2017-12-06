package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class Axis
{
  ArrayList a;
  ArrayList b;
  byte[] c;
  private Chart j;
  private int k;
  String d = "";
  String e = "";
  private int l = 3;
  private Area m;
  private Object n;
  private boolean o = true;
  private boolean p = true;
  private Object q;
  private boolean r = true;
  private double s;
  private boolean t = true;
  private double u;
  private Line v;
  private int w = 3;
  private int x = 2;
  private int y = 2;
  private double z;
  boolean f = false;
  private int A = 0;
  private boolean B;
  private double C = 10.0D;
  private boolean D;
  private boolean E;
  private boolean F = true;
  private boolean G = true;
  private TickLabels H;
  private int I = 1;
  private boolean J = true;
  private int K = 1;
  private int L = 0;
  private int M = 0;
  private DisplayUnitLabel N;
  private boolean O = true;
  private Title P;
  boolean g;
  private int Q = 0;
  private int R;
  private boolean S = true;
  private int T;
  private int U;
  private boolean V;
  private Line W;
  private Line X;
  private boolean Y = true;
  ShapePropertyCollection h;
  ShapePropertyCollection i;
  private ShapePropertyCollection Z;
  
  Axis(int type, boolean visible, Chart chart)
  {
    this.j = chart;
    this.k = type;
    if (type == 0) {
      this.z = 1.0D;
    }
    setVisible(visible);
  }
  
  Chart a()
  {
    return this.j;
  }
  
  int b()
  {
    return this.k;
  }
  
  void a(int paramInt)
  {
    this.k = paramInt;
  }
  
  int c()
  {
    return this.l;
  }
  
  void b(int paramInt)
  {
    this.l = paramInt;
  }
  
  public Area getArea()
  {
    if (this.m == null) {
      this.m = new Area(this.j, this);
    }
    return this.m;
  }
  
  Area d()
  {
    return this.m;
  }
  
  boolean e()
  {
    return this.o;
  }
  
  public boolean isAutomaticMinValue()
  {
    return this.o;
  }
  
  public void setAutomaticMinValue(boolean value)
  {
    this.o = value;
  }
  
  public Object getMinValue()
  {
    return this.n;
  }
  
  public void setMinValue(Object value)
  {
    if (value == null)
    {
      this.o = true;
      return;
    }
    Class localClass = value.getClass();
    switch (zaoj.a(localClass))
    {
    case 6: 
      this.n = Double.valueOf(((Byte)value).byteValue() & 0xFF);
      this.o = false;
      break;
    case 7: 
      this.n = Double.valueOf(((Short)value).shortValue());
      this.o = false;
      break;
    case 9: 
      this.n = Double.valueOf(((Integer)value).intValue());
      this.o = false;
      break;
    case 5: 
      this.n = Double.valueOf(((Byte)value).byteValue());
      this.o = false;
      break;
    case 8: 
      this.n = Double.valueOf(((Integer)value).intValue() & 0xFFFF);
      this.o = false;
      break;
    case 13: 
      this.n = Double.valueOf(((Float)value).floatValue());
      this.o = false;
      break;
    case 10: 
      this.n = Double.valueOf(((Long)value).longValue() & 0xFFFFFFFF);
      this.o = false;
      break;
    case 12: 
      this.n = Double.valueOf(((Long)value).longValue());
      this.o = false;
      break;
    case 11: 
      this.n = Double.valueOf(((Long)value).longValue());
      this.o = false;
      break;
    case 14: 
    case 16: 
      this.n = value;
      this.o = false;
      break;
    case 15: 
    default: 
      throw new CellsException(1, "MinValue should be numeric or Date values.");
    }
  }
  
  void a(Object paramObject)
  {
    this.n = paramObject;
  }
  
  void b(Object paramObject)
  {
    this.q = paramObject;
  }
  
  public boolean isAutomaticMaxValue()
  {
    return this.p;
  }
  
  public void setAutomaticMaxValue(boolean value)
  {
    this.p = value;
  }
  
  boolean f()
  {
    return this.p;
  }
  
  public Object getMaxValue()
  {
    return this.q;
  }
  
  public void setMaxValue(Object value)
  {
    if (value == null)
    {
      this.p = true;
      return;
    }
    Class localClass = value.getClass();
    switch (zaoj.a(localClass))
    {
    case 6: 
      this.q = Double.valueOf(((Byte)value).byteValue() & 0xFF);
      this.p = false;
      break;
    case 7: 
      this.q = Double.valueOf(((Short)value).shortValue());
      this.p = false;
      break;
    case 9: 
      this.q = Double.valueOf(((Integer)value).intValue());
      this.p = false;
      break;
    case 5: 
      this.q = Double.valueOf(((Byte)value).byteValue());
      this.p = false;
      break;
    case 8: 
      this.q = Double.valueOf(((Integer)value).intValue() & 0xFFFF);
      this.p = false;
      break;
    case 13: 
      this.q = Double.valueOf(((Float)value).floatValue());
      this.p = false;
      break;
    case 10: 
      this.q = Double.valueOf(((Long)value).longValue() & 0xFFFFFFFF);
      this.p = false;
      break;
    case 12: 
      this.q = Double.valueOf(((Long)value).longValue());
      this.p = false;
      break;
    case 11: 
      this.q = Double.valueOf(((Long)value).longValue());
      this.p = false;
      break;
    case 14: 
    case 16: 
      this.q = value;
      this.p = false;
      break;
    case 15: 
    default: 
      throw new CellsException(1, "MaxValue should be numeric or Date values.");
    }
  }
  
  public boolean isAutomaticMajorUnit()
  {
    return this.r;
  }
  
  public void setAutomaticMajorUnit(boolean value)
  {
    this.r = value;
  }
  
  boolean g()
  {
    return this.r;
  }
  
  public double getMajorUnit()
  {
    return this.s;
  }
  
  public void setMajorUnit(double value)
  {
    if (value <= 0.0D) {
      throw new IllegalArgumentException("Invalid major unit: it must be greated than zero.");
    }
    this.s = value;
    this.r = false;
  }
  
  void a(double paramDouble)
  {
    this.s = paramDouble;
  }
  
  public boolean isAutomaticMinorUnit()
  {
    return this.t;
  }
  
  public void setAutomaticMinorUnit(boolean value)
  {
    this.t = value;
  }
  
  boolean h()
  {
    return this.t;
  }
  
  public double getMinorUnit()
  {
    return this.u;
  }
  
  public void setMinorUnit(double value)
  {
    if (value <= 0.0D) {
      throw new IllegalArgumentException("Invalid minor unit: it must be greated than zero.");
    }
    this.u = value;
    this.t = false;
  }
  
  void b(double paramDouble)
  {
    this.u = paramDouble;
  }
  
  public Line getAxisLine()
  {
    if (this.v == null) {
      this.v = new Line(this.j, this);
    }
    return this.v;
  }
  
  Line i()
  {
    return this.v;
  }
  
  public int getMajorTickMark()
  {
    return this.w;
  }
  
  public void setMajorTickMark(int value)
  {
    this.w = value;
    this.B = true;
  }
  
  public int getMinorTickMark()
  {
    return this.x;
  }
  
  public void setMinorTickMark(int value)
  {
    this.x = value;
    this.B = true;
  }
  
  public int getTickLabelPosition()
  {
    return this.y;
  }
  
  public void setTickLabelPosition(int value)
  {
    this.y = value;
    this.B = true;
  }
  
  public double getCrossAt()
  {
    return this.z;
  }
  
  public void setCrossAt(double value)
  {
    this.f = false;
    switch (this.k)
    {
    case 1: 
      this.z = value;
      this.A = 2;
      break;
    case 0: 
      if (ChartCollection.l(this.j.getType()))
      {
        this.z = value;
        this.A = 2;
      }
      else
      {
        int i1 = (int)value;
        if ((i1 >= 1) && (i1 <= 31999))
        {
          this.z = i1;
          this.A = 2;
        }
      }
      break;
    }
  }
  
  void c(double paramDouble)
  {
    this.z = paramDouble;
    this.A = 2;
    this.f = false;
  }
  
  /**
   * @deprecated
   */
  public int getCrosses()
  {
    return this.A;
  }
  
  /**
   * @deprecated
   */
  public void setCrosses(int value)
  {
    this.A = value;
    if (value != 0) {
      this.f = false;
    }
  }
  
  public int getCrossType()
  {
    return this.A;
  }
  
  public void setCrossType(int value)
  {
    this.A = value;
  }
  
  boolean j()
  {
    return this.B;
  }
  
  public double getLogBase()
  {
    return this.C;
  }
  
  public void setLogBase(double value)
  {
    this.C = value;
  }
  
  public boolean isLogarithmic()
  {
    return this.D;
  }
  
  public void setLogarithmic(boolean value)
  {
    this.D = value;
  }
  
  public boolean isPlotOrderReversed()
  {
    return this.E;
  }
  
  public void setPlotOrderReversed(boolean value)
  {
    this.E = value;
  }
  
  public boolean getAxisBetweenCategories()
  {
    return this.F;
  }
  
  public void setAxisBetweenCategories(boolean value)
  {
    this.F = value;
    this.G = true;
  }
  
  public TickLabels getTickLabels()
  {
    if (this.H == null)
    {
      this.H = new TickLabels(this);
      this.B = true;
    }
    return this.H;
  }
  
  TickLabels k()
  {
    return this.H;
  }
  
  public int getTickLabelSpacing()
  {
    return this.I;
  }
  
  public void setTickLabelSpacing(int value)
  {
    if ((value >= 1) && (value <= 31999)) {
      this.I = value;
    } else {
      throw new IllegalArgumentException("Invalid tick label spacing : it must be between 1 and 31999.");
    }
    this.J = false;
  }
  
  void c(int paramInt)
  {
    this.I = paramInt;
  }
  
  boolean l()
  {
    return this.J;
  }
  
  void a(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public int getTickMarkSpacing()
  {
    return this.K;
  }
  
  public void setTickMarkSpacing(int value)
  {
    if ((value >= 1) && (value <= 31999)) {
      this.K = value;
    }
  }
  
  public int getDisplayUnit()
  {
    return this.L;
  }
  
  public void setDisplayUnit(int value)
  {
    if (this.L == value) {
      return;
    }
    if (value == 0)
    {
      this.N = null;
      this.L = value;
      return;
    }
    if ((this.L == 0) && (this.O)) {
      this.N = new DisplayUnitLabel(this);
    }
    this.L = value;
  }
  
  public int getCustUnit()
  {
    return this.M;
  }
  
  public void setCustUnit(int value)
  {
    setDisplayUnit(11);
    this.M = value;
  }
  
  public DisplayUnitLabel getDisplayUnitLabel()
  {
    if (this.N == null) {
      this.N = new DisplayUnitLabel(this);
    }
    return this.N;
  }
  
  DisplayUnitLabel m()
  {
    return this.N;
  }
  
  public boolean isDisplayUnitLabelShown()
  {
    return this.O;
  }
  
  public void setDisplayUnitLabelShown(boolean value)
  {
    if ((value) && (this.N == null)) {
      this.N = new DisplayUnitLabel(this);
    }
    this.O = value;
  }
  
  void b(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }
  
  Title n()
  {
    return this.P;
  }
  
  public Title getTitle()
  {
    if (this.P == null)
    {
      this.P = new Title(this);
      if (this.k == 1) {
        this.P.setRotationAngle(90);
      }
      this.P.getBorder().setVisible(false);
      this.P.getArea().setFormatting(1);
      this.P.j(false);
    }
    return this.P;
  }
  
  public int getCategoryType()
  {
    return this.Q;
  }
  
  public void setCategoryType(int value)
  {
    this.Q = value;
    this.g = true;
  }
  
  public int getBaseUnitScale()
  {
    return this.R;
  }
  
  public void setBaseUnitScale(int value)
  {
    this.R = value;
    this.S = false;
  }
  
  void d(int paramInt)
  {
    this.R = paramInt;
  }
  
  public boolean isBaseUnitAuto()
  {
    return this.S;
  }
  
  public void setBaseUnitAuto(boolean value)
  {
    this.S = value;
  }
  
  public int getMajorUnitScale()
  {
    return this.T;
  }
  
  public void setMajorUnitScale(int value)
  {
    this.T = value;
    this.r = false;
    if (this.s == 0.0D) {
      this.s = 1.0D;
    }
  }
  
  void e(int paramInt)
  {
    this.T = paramInt;
  }
  
  public int getMinorUnitScale()
  {
    return this.U;
  }
  
  public void setMinorUnitScale(int value)
  {
    this.U = value;
    this.t = false;
    if (this.u == 0.0D) {
      this.u = 1.0D;
    }
  }
  
  void f(int paramInt)
  {
    this.U = paramInt;
  }
  
  public boolean isVisible()
  {
    return this.V;
  }
  
  public void setVisible(boolean value)
  {
    this.V = value;
  }
  
  void a(Axis paramAxis, CopyOptions paramCopyOptions)
  {
    this.k = paramAxis.k;
    this.d = paramAxis.d;
    if (paramAxis.v != null) {
      getAxisLine().a(paramAxis.v);
    } else {
      this.v = null;
    }
    this.Y = paramAxis.Y;
    this.V = paramAxis.V;
    this.q = paramAxis.q;
    this.n = paramAxis.n;
    this.s = paramAxis.s;
    this.u = paramAxis.u;
    this.r = paramAxis.r;
    this.t = paramAxis.t;
    this.o = paramAxis.o;
    this.p = paramAxis.p;
    this.w = paramAxis.w;
    this.x = paramAxis.x;
    this.B = paramAxis.B;
    this.y = paramAxis.y;
    this.z = paramAxis.z;
    this.A = paramAxis.A;
    this.D = paramAxis.D;
    this.E = paramAxis.E;
    this.F = paramAxis.F;
    if (paramAxis.H != null)
    {
      this.H = new TickLabels(this);
      this.H.a(paramAxis.H);
    }
    else
    {
      this.H = null;
    }
    this.J = paramAxis.J;
    this.I = paramAxis.I;
    this.K = paramAxis.K;
    this.L = paramAxis.L;
    this.M = paramAxis.M;
    this.O = paramAxis.O;
    if (paramAxis.N != null) {
      getDisplayUnitLabel().a(paramAxis.N, paramCopyOptions);
    } else {
      this.N = null;
    }
    if (paramAxis.P != null)
    {
      this.P = new Title(this);
      this.P.a(paramAxis.P, paramCopyOptions);
    }
    else
    {
      this.P = null;
    }
    this.g = paramAxis.g;
    this.Q = paramAxis.Q;
    this.R = paramAxis.R;
    this.S = paramAxis.S;
    this.T = paramAxis.T;
    this.U = paramAxis.U;
    if (paramAxis.W != null)
    {
      this.W = new Line(this.j, this);
      this.W.a(paramAxis.W);
    }
    else
    {
      this.W = null;
    }
    if (paramAxis.X != null) {
      getMinorGridLines().a(paramAxis.X);
    } else {
      this.X = null;
    }
    if (paramAxis.h != null)
    {
      this.h = new ShapePropertyCollection(this.j, this, 0);
      this.h.a(paramAxis.h, paramCopyOptions);
    }
    if (paramAxis.i != null)
    {
      this.i = new ShapePropertyCollection(this.j, this, 1);
      this.i.a(paramAxis.i, paramCopyOptions);
    }
    if (paramAxis.Z != null)
    {
      this.Z = new ShapePropertyCollection(this.j, this, 2);
      this.Z.a(paramAxis.Z, paramCopyOptions);
    }
    int i1;
    if ((paramAxis.a != null) && (paramAxis.a.size() > 0))
    {
      this.a = new ArrayList();
      for (i1 = 0; i1 < paramAxis.a.size(); i1++) {
        zf.a(this.a, paramAxis.a.get(i1));
      }
    }
    if ((paramAxis.b != null) && (paramAxis.b.size() > 0))
    {
      this.b = new ArrayList();
      for (i1 = 0; i1 < paramAxis.b.size(); i1++) {
        zf.a(this.b, paramAxis.b.get(i1));
      }
    }
    this.c = paramAxis.c;
  }
  
  Line o()
  {
    return this.W;
  }
  
  void a(Line paramLine)
  {
    this.W = paramLine;
  }
  
  public Line getMajorGridLines()
  {
    if (this.W == null)
    {
      this.W = new Line(this.j, this);
      this.W.setVisible(false);
    }
    return this.W;
  }
  
  Line p()
  {
    return this.X;
  }
  
  void b(Line paramLine)
  {
    this.X = paramLine;
  }
  
  public Line getMinorGridLines()
  {
    if (this.X == null)
    {
      this.X = new Line(this.j, this);
      this.X.setVisible(false);
    }
    return this.X;
  }
  
  boolean q()
  {
    switch (this.k)
    {
    case 1: 
      return this.j.getValueAxis() == this;
    case 0: 
      return this.j.getCategoryAxis() == this;
    }
    return true;
  }
  
  public boolean hasMultiLevelLabels()
  {
    return this.Y;
  }
  
  public void setHasMultiLevelLabels(boolean value)
  {
    this.Y = value;
  }
  
  ShapePropertyCollection r()
  {
    if (this.h == null) {
      this.h = new ShapePropertyCollection(this.j, this, 0);
    }
    return this.h;
  }
  
  ShapePropertyCollection s()
  {
    if (this.i == null) {
      this.i = new ShapePropertyCollection(this.j, this, 1);
    }
    return this.i;
  }
  
  ShapePropertyCollection t()
  {
    if (this.Z == null) {
      this.Z = new ShapePropertyCollection(this.j, this, 2);
    }
    return this.Z;
  }
  
  /**
   * @deprecated
   */
  public boolean isAutoCross()
  {
    return getCrossType() == 0;
  }
  
  /**
   * @deprecated
   */
  public boolean isCrossAtMax()
  {
    return getCrossType() == 1;
  }
  
  /**
   * @deprecated
   */
  public void setAutoCross()
  {
    setCrossType(0);
  }
  
  /**
   * @deprecated
   */
  public void setCrossAtMax(boolean isCrossAtMax)
  {
    if (isCrossAtMax) {
      setCrossType(1);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Axis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */