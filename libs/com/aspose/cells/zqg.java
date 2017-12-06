package com.aspose.cells;

class zqg
{
  String a;
  int b;
  String c;
  String d;
  String e;
  boolean f;
  String g;
  zcjn h;
  zcjn i;
  zcjn j;
  zcjn k;
  zcjn l;
  zcjn m;
  zbrf n;
  String o;
  zqe p;
  String q;
  int r;
  double s;
  int t;
  double u;
  int v;
  double w;
  int x;
  double y;
  double z;
  double A;
  double B;
  double C;
  int D;
  int E;
  int F;
  int G;
  int H;
  int I;
  String J;
  String K;
  boolean L = false;
  boolean M = false;
  boolean N = false;
  private int R = 30;
  int O = 188;
  int P = 4095;
  Shape Q = null;
  
  zbrf a()
  {
    if (this.n == null) {
      this.n = new zbrf();
    }
    return this.n;
  }
  
  boolean b()
  {
    if (this.P == 0) {
      return true;
    }
    if (this.O != 188)
    {
      int i1 = zauj.aI(this.O);
      if (i1 == 4095) {
        return false;
      }
      this.P = i1;
      int i2 = zauj.aH(i1);
      if (i2 == this.O) {
        return true;
      }
    }
    return false;
  }
  
  int c()
  {
    if (this.Q == null) {
      return this.R;
    }
    return this.Q.getMsoDrawingType();
  }
  
  void a(int paramInt)
  {
    this.R = paramInt;
    this.N = true;
  }
  
  int d()
  {
    if (this.P == 4095) {
      this.P = zauj.aI(this.O);
    }
    return this.P;
  }
  
  void e()
  {
    if ("absoluteAnchor".equals(this.o))
    {
      if ((this.Q != null) && ((this.Q instanceof ChartShape)) && (this.Q.Q().getType() == 2))
      {
        this.Q.setWidth(this.D);
        this.Q.setHeight(this.E);
      }
      else
      {
        this.Q.a(0, false, this.F, this.G, this.D, this.E);
      }
    }
    else if ("oneCellAnchor".equals(this.o))
    {
      this.Q.a(this.t, (int)(this.u + 0.5D), this.r, (int)this.s, this.E, this.D);
    }
    else if ("freeFloating".equals(this.o))
    {
      if (this.L)
      {
        this.Q.b(this.F, this.G, this.H, this.I);
        return;
      }
      int i1 = zbxp.a();
      this.Q.a(0, false, zauj.a(this.F, i1), zauj.a(this.G, i1), zauj.a(this.H, i1), zauj.a(this.I, i1));
    }
    else if ("relSizeAnchor".equals(this.o))
    {
      if (this.Q.T()) {
        this.Q.a(2, (int)(this.z * 4000.0D), (int)(this.A * 4000.0D), (int)((this.B - this.z) * 4000.0D), (int)((this.C - this.A) * 4000.0D));
      } else {
        this.Q.a(0, false, (int)(this.z * 4000.0D), (int)(this.A * 4000.0D), (int)((this.B - this.z) * 4000.0D), (int)((this.C - this.A) * 4000.0D));
      }
    }
    else if ("absSizeAnchor".equals(this.o))
    {
      if (this.Q.T())
      {
        Chart localChart = (Chart)this.Q.N().i();
        double d1 = localChart.getChartObject().getWidth();
        double d2 = localChart.getChartObject().getHeight();
        this.Q.a(1, (int)(this.z * 4000.0D), (int)(this.A * 4000.0D), (int)(this.D / d1 * 4000.0D), (int)(this.E / d2 * 4000.0D));
      }
    }
    else
    {
      int i2 = 2;
      if (this.Q.N().g()) {
        i2 = 1;
      }
      if (this.q != null) {
        i2 = zauj.o(this.q);
      }
      if (this.t >= 1048576)
      {
        this.t = 1048575;
        this.u = this.Q.Q().getCells().getRowHeightPixel(this.t);
      }
      this.Q.a(i2, this.t, this.u, this.r, this.s, this.x, this.y, this.v, this.w);
      return;
    }
    if ((this.q != null) && (this.q.length() != 0)) {
      this.Q.setPlacement(zauj.o(this.q));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */