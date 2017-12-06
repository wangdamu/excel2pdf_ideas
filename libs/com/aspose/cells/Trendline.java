package com.aspose.cells;

public class Trendline
  extends Line
{
  private Series d;
  private boolean e;
  private int f;
  private String g;
  int a = 2;
  private int h = 2;
  private double i;
  private double j;
  private boolean k;
  private boolean l;
  private double m;
  private DataLabels n;
  private boolean o;
  private int p;
  private ShapePropertyCollection q;
  
  Series a()
  {
    return this.d;
  }
  
  Trendline(Series parent, int type)
  {
    super(parent.i().e(), parent);
    this.f = type;
    this.e = true;
    a(parent);
    this.d = parent;
  }
  
  Trendline(Series parent)
  {
    super(parent.i().e(), parent);
    this.e = true;
    a(parent);
    this.d = parent;
  }
  
  Trendline(Series parent, int type, String name)
  {
    super(parent.i().e(), parent);
    this.f = type;
    this.g = name;
    a(parent);
    this.d = parent;
  }
  
  private void a(Series paramSeries)
  {
    if (paramSeries.i().e().L() == 2) {
      setWeight(1);
    } else {
      c(0.75D);
    }
  }
  
  public boolean isNameAuto()
  {
    return this.e;
  }
  
  public void setNameAuto(boolean value)
  {
    this.e = value;
  }
  
  public int getType()
  {
    return this.f;
  }
  
  void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public String getName()
  {
    return this.g;
  }
  
  public void setName(String value)
  {
    this.g = value;
    if ((value != null) && (!"".equals(value))) {
      this.e = false;
    }
  }
  
  public int getOrder()
  {
    return this.a;
  }
  
  public void setOrder(int value)
  {
    if ((value < 2) || (value > 6)) {
      throw new IllegalArgumentException("Invalid the trendline order");
    }
    this.a = value;
  }
  
  public int getPeriod()
  {
    return this.h;
  }
  
  public void setPeriod(int value)
  {
    int i1 = 0;
    if (this.d.m() != null) {
      i1 = this.d.m().s();
    }
    if ((value < 2) || (value > i1)) {
      throw new IllegalArgumentException("This value should be between 2 and  the number of the chart points in the series.");
    }
    this.h = value;
  }
  
  void o(int paramInt)
  {
    this.h = paramInt;
  }
  
  public double getForward()
  {
    return this.i;
  }
  
  public void setForward(double value)
  {
    if (value < 0.0D) {
      throw new IllegalArgumentException("The forward value must be greater than and equal to zero");
    }
    this.i = value;
  }
  
  public double getBackward()
  {
    return this.j;
  }
  
  public void setBackward(double value)
  {
    if (value < 0.0D) {
      throw new IllegalArgumentException("The backward value must greater than and equal to zero");
    }
    if ((!ChartCollection.k(this.d.getType())) && (!ChartCollection.q(this.d.getType())) && (value > 0.5D)) {
      throw new IllegalArgumentException("The backward value must be between 0 and 0.5 when the chart type is column");
    }
    this.j = value;
  }
  
  void a(double paramDouble)
  {
    this.j = paramDouble;
  }
  
  public boolean getDisplayEquation()
  {
    return this.k;
  }
  
  public void setDisplayEquation(boolean value)
  {
    this.k = value;
    if ((value) && (this.n == null)) {
      this.n = new DataLabels(this, this.d.i().e());
    }
  }
  
  public boolean getDisplayRSquared()
  {
    return this.l;
  }
  
  public void setDisplayRSquared(boolean value)
  {
    this.l = value;
    if ((value) && (this.n == null)) {
      this.n = new DataLabels(this, this.d.i().e());
    }
  }
  
  public double getIntercept()
  {
    return this.m;
  }
  
  public void setIntercept(double value)
  {
    this.m = value;
    this.o = true;
  }
  
  public DataLabels getDataLabels()
  {
    if (this.n == null) {
      this.n = new DataLabels(this, this.d.i().e());
    }
    return this.n;
  }
  
  DataLabels b()
  {
    return this.n;
  }
  
  boolean c()
  {
    return this.o;
  }
  
  int d()
  {
    return this.p;
  }
  
  void p(int paramInt)
  {
    this.p = paramInt;
  }
  
  public LegendEntry getLegendEntry()
  {
    LegendEntryCollection localLegendEntryCollection = this.d.i().e().getLegend().getLegendEntries();
    return localLegendEntryCollection.get(this.p + this.d.i().getCount());
  }
  
  void a(Trendline paramTrendline, CopyOptions paramCopyOptions)
  {
    super.a(paramTrendline);
    if (paramTrendline.q != null)
    {
      this.q = new ShapePropertyCollection(this.d.u().a().a(), this, 6);
      this.q.a(paramTrendline.q, paramCopyOptions);
    }
    this.d = paramTrendline.d;
    if (paramTrendline.n != null) {
      getDataLabels().a(paramTrendline.n, paramCopyOptions);
    }
    this.j = paramTrendline.j;
    this.k = paramTrendline.k;
    this.l = paramTrendline.l;
    this.p = paramTrendline.p;
    this.i = paramTrendline.i;
    this.m = paramTrendline.m;
    this.o = paramTrendline.o;
    this.e = paramTrendline.e;
    this.g = paramTrendline.g;
    this.a = paramTrendline.a;
    this.h = paramTrendline.h;
    this.f = paramTrendline.f;
  }
  
  ShapePropertyCollection e()
  {
    if (this.q == null) {
      this.q = new ShapePropertyCollection(this.d.u().a().a(), this, 6);
    }
    return this.q;
  }
  
  public boolean isInterceptAuto()
  {
    return this.o;
  }
  
  public void setInterceptAuto(boolean isInterceptAuto)
  {
    this.o = isInterceptAuto;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Trendline.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */