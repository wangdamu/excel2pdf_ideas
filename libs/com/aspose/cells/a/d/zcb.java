package com.aspose.cells.a.d;

public class zcb
{
  private int a;
  private int b;
  private int c;
  private int d;
  private double e;
  private double f;
  
  public static zcb a()
  {
    return a(0, 0, 96.0D, 96.0D);
  }
  
  public static zcb a(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    return new zcb(0, 0, paramInt1, paramInt2, paramDouble1, paramDouble2);
  }
  
  public static zcb a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2)
  {
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    return new zcb(paramInt1, paramInt2, i, j, paramDouble1, paramDouble2);
  }
  
  public static zcb a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    double d1 = i / zao.a(paramInt5);
    double d2 = j / zao.a(paramInt6);
    return new zcb(paramInt1, paramInt2, i, j, d1, d2);
  }
  
  private zcb() {}
  
  public zcb(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramDouble1;
    this.f = paramDouble2;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  public double d()
  {
    return this.e;
  }
  
  public void a(double paramDouble)
  {
    this.e = paramDouble;
  }
  
  public double e()
  {
    return this.f;
  }
  
  public void b(double paramDouble)
  {
    this.f = paramDouble;
  }
  
  public double f()
  {
    return zao.c(this.c, this.e);
  }
  
  public double g()
  {
    return zao.c(this.d, this.f);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */