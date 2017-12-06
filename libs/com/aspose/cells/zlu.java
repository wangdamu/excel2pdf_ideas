package com.aspose.cells;

class zlu
  implements zahq
{
  private ColumnCollection a;
  private WorksheetCollection b;
  private zahr c;
  private zahr d;
  private double e;
  
  zlu(Cells paramCells)
  {
    this.b = paramCells.p();
    this.a = paramCells.getColumns();
    this.c = new za(this.b, paramCells.g());
    this.e = zbxp.a();
    this.d = new zly(100.0D);
  }
  
  public int a(int paramInt)
  {
    return this.c.a(this.a.f(paramInt));
  }
  
  public double b(int paramInt)
  {
    return this.c.a(this.a.f(paramInt)) / this.e;
  }
  
  public double a(int paramInt1, int paramInt2)
  {
    return this.a.a(paramInt1, paramInt2, this.d) / 100.0D;
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    return this.a.a(paramInt1, paramInt2, this.c);
  }
  
  public double c(int paramInt1, int paramInt2)
  {
    return this.a.a(paramInt1, paramInt2, this.c) / this.e;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.a.a(paramArrayOfInt, this.c);
  }
  
  private class za
    implements zahr
  {
    private WorksheetCollection b;
    private Worksheet c;
    
    za(WorksheetCollection paramWorksheetCollection, Worksheet paramWorksheet)
    {
      this.b = paramWorksheetCollection;
      this.c = paramWorksheet;
    }
    
    public int a(double paramDouble)
    {
      if (this.c.getShowFormulas()) {
        return zlp.b(paramDouble, this.b) << 1;
      }
      return zlp.b(paramDouble, this.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */