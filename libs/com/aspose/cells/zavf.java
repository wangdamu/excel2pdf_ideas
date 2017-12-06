package com.aspose.cells;

class zavf
  implements zait
{
  private int a;
  private zst b;
  private zst c;
  private double d = 0.0D;
  private double e = 0.0D;
  
  zavf(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = new zst(paramInt2 < 100 ? paramInt2 : paramInt2 / 2, 0);
    this.c = new zst(this.b.b().length, 0);
  }
  
  public zaie a(double paramDouble1, double paramDouble2)
  {
    this.b.a(paramDouble1);
    this.c.a(paramDouble2);
    this.d = ((this.d * (this.b.a() - 1.0D) + paramDouble1) / this.b.a());
    this.e = ((this.e * (this.c.a() - 1.0D) + paramDouble2) / this.c.a());
    return null;
  }
  
  public zaie a(double paramDouble1, double paramDouble2, int paramInt)
  {
    this.d = ((this.d * this.b.a() + paramDouble1 * paramInt) / (this.b.a() + paramInt));
    this.d = ((this.e * this.c.a() + paramDouble2 * paramInt) / (this.c.a() + paramInt));
    this.b.a(paramDouble1, paramInt);
    this.c.a(paramDouble2, paramInt);
    return null;
  }
  
  public zaie a()
  {
    int i = this.b.a();
    int j;
    switch (this.a)
    {
    case 308: 
    case 514: 
      if (i < 1) {
        return zabc.a;
      }
      d1 = 0.0D;
      for (j = 0; j < i; j++) {
        d1 += (this.b.a(j) - this.d) * (this.c.a(j) - this.e);
      }
      return new zabb(d1 / i);
    case 515: 
      if (i < 2) {
        return zabc.a;
      }
      d1 = 0.0D;
      for (j = 0; j < i; j++) {
        d1 += (this.b.a(j) - this.d) * (this.c.a(j) - this.e);
      }
      return new zabb(d1 / (i - 1.0D));
    case 307: 
      if (i < 2) {
        return zabc.a;
      }
      break;
    case 314: 
      if (i < 3) {
        return zabc.a;
      }
      break;
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int k = 0; k < i; k++)
    {
      double d4 = this.b.a(k) - this.d;
      double d5 = this.c.a(k) - this.e;
      d1 += d4 * d5;
      d2 += d4 * d4;
      d3 += d5 * d5;
    }
    switch (this.a)
    {
    case 307: 
      if ((d2 == 0.0D) || (d3 == 0.0D)) {
        return zabc.a;
      }
      return zabt.b(d1 / Math.sqrt(d2) / Math.sqrt(d3));
    case 314: 
      if (d2 == 0.0D) {
        return zabc.a;
      }
      return zabt.b(Math.sqrt((d2 - d1 * d1 / d3) / (i - 2)));
    }
    return zabg.a;
  }
  
  public zaie b()
  {
    return zabc.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */