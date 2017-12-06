package com.aspose.cells;

abstract class zh
{
  protected Row a;
  
  zh(Row paramRow)
  {
    this.a = paramRow;
  }
  
  public abstract void a();
  
  public abstract Cell a(int paramInt);
  
  public abstract Cell b(int paramInt);
  
  public abstract Cell a(int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract int b();
  
  public abstract void c(int paramInt);
  
  public int d(int paramInt)
  {
    int i = this.a.c.a(paramInt, b());
    if (i < 0)
    {
      c(-i - 1);
      return i;
    }
    return i;
  }
  
  public boolean a(Cell paramCell, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = this.a.c.a(paramInt, paramCell.a);
    if (i < 0)
    {
      i = -i - 1;
      if (paramBoolean1)
      {
        c(i);
        return false;
      }
      if (paramBoolean2) {
        this.a.b.m();
      }
      if (paramInt > this.a.b.getMaxColumn()) {
        this.a.b.a((short)paramInt);
      }
      zgs localzgs = paramCell.c;
      localzgs.a(paramInt);
      i = this.a.c.a(i, localzgs);
      c(i);
      paramCell.c = this.a.c.a(i, localzgs, 7);
      paramCell.a = i;
    }
    else
    {
      paramCell.a = i;
      c(i);
      paramCell.c = this.a.c.a(i, paramCell.c, 7);
    }
    return true;
  }
  
  public Cell a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramInt2 = this.a.c.a(paramInt1, paramInt2 > 0 ? paramInt2 : b());
    if (paramInt2 < 0)
    {
      paramInt2 = -paramInt2 - 1;
      if (paramBoolean1)
      {
        c(paramInt2);
        return null;
      }
      if (paramBoolean2) {
        this.a.b.m();
      }
      if (paramInt1 > this.a.b.getMaxColumn()) {
        this.a.b.a((short)paramInt1);
      }
      zgs localzgs = new zgs(paramInt1);
      paramInt2 = this.a.c.a(paramInt2, localzgs);
      c(paramInt2);
      return new Cell(this.a, paramInt2);
    }
    c(paramInt2);
    return new Cell(this.a, paramInt2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */