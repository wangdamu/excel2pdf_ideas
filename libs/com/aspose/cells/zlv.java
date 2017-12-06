package com.aspose.cells;

class zlv
  implements zahq
{
  private WorksheetCollection a;
  private boolean b;
  private double c;
  private zma d;
  private zly e;
  
  zlv(Cells paramCells, int paramInt)
  {
    this.a = paramCells.p();
    this.b = paramCells.g().getShowFormulas();
    this.c = (this.b ? zbxp.a() / 2.0D : zbxp.a());
    this.e = new zly(100.0D);
    this.d = new zma(paramCells, paramInt, this.e);
  }
  
  public double c(int paramInt)
  {
    return this.e.a(this.d.a(paramInt));
  }
  
  public int a(int paramInt)
  {
    if (this.b) {
      return zlp.b(c(paramInt), this.a) << 1;
    }
    return zlp.b(c(paramInt), this.a);
  }
  
  public double b(int paramInt)
  {
    return zlp.b(c(paramInt), this.a) / this.c;
  }
  
  public double a(int paramInt1, int paramInt2)
  {
    return this.e.a(this.d.a(paramInt1, paramInt2));
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    if (this.b) {
      return zlp.b(a(paramInt1, paramInt2), this.a) << 1;
    }
    return zlp.b(a(paramInt1, paramInt2), this.a);
  }
  
  public double c(int paramInt1, int paramInt2)
  {
    return zlp.b(a(paramInt1, paramInt2), this.a) / this.c;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    paramArrayOfInt[1] = this.e.a(zlp.a(this.b ? paramArrayOfInt[1] >> 1 : paramArrayOfInt[1], this.a));
    paramArrayOfInt[2] = this.e.a(zlp.a(this.b ? paramArrayOfInt[2] >> 1 : paramArrayOfInt[2], this.a));
    this.d.a(paramArrayOfInt);
    paramArrayOfInt[1] = zlp.b(this.e.a(paramArrayOfInt[1]), this.a);
    paramArrayOfInt[2] = zlp.b(this.e.a(paramArrayOfInt[2]), this.a);
    if (this.b)
    {
      paramArrayOfInt[1] <<= 1;
      paramArrayOfInt[2] <<= 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */