package com.aspose.cells;

class zlw
  implements zahq
{
  private WorksheetCollection a;
  private double b;
  private zma c;
  private zma d;
  private zly e;
  
  zlw(Cells paramCells, int paramInt)
  {
    this.a = paramCells.p();
    this.b = zbxp.a();
    this.c = new zma(paramCells, paramInt, new zlz(this.a, paramCells.g().getShowFormulas()));
    this.e = new zly(100.0D);
    this.d = new zma(paramCells, paramInt, this.e);
  }
  
  public int a(int paramInt)
  {
    return this.c.a(paramInt);
  }
  
  public double b(int paramInt)
  {
    return a(paramInt) / this.b;
  }
  
  public double a(int paramInt1, int paramInt2)
  {
    return this.e.a(this.d.a(paramInt1, paramInt2));
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    return this.c.a(paramInt1, paramInt2);
  }
  
  public double c(int paramInt1, int paramInt2)
  {
    return b(paramInt1, paramInt2) / this.b;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.c.a(paramArrayOfInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */