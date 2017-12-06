package com.aspose.cells;

abstract class zu
{
  protected Cells a;
  protected RowCollection b;
  private zbdx c = new zbdx();
  
  zu(Cells paramCells, RowCollection paramRowCollection)
  {
    this.a = paramCells;
    this.b = paramRowCollection;
  }
  
  public abstract void a();
  
  public abstract Row a(int paramInt);
  
  public abstract Row a(int paramInt, boolean paramBoolean);
  
  public abstract Row a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  
  public abstract int b();
  
  public abstract void b(int paramInt);
  
  void a(zajl paramzajl) {}
  
  public int c(int paramInt)
  {
    int i = this.b.c.a(paramInt, b());
    if (i < 0)
    {
      b(-i - 1);
      return i;
    }
    b(i);
    return i;
  }
  
  public boolean a(Row paramRow, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramRow.c.g();
    if (i < 0)
    {
      i = -i - 1;
      if (paramBoolean1)
      {
        b(i);
        return false;
      }
      this.c.a(paramRow.c.i(), this.a);
      i = this.b.c.a(i, this.c, -1);
      b(i);
      zt localzt = this.b.c.f(i);
      if (paramBoolean2) {
        this.a.m();
      }
      paramRow.c = localzt;
    }
    else
    {
      b(i);
    }
    return true;
  }
  
  public Row b(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = this.b.c.a(paramInt, b());
    zt localzt;
    if (i < 0)
    {
      i = -i - 1;
      if (paramBoolean1)
      {
        b(i);
        return null;
      }
      this.c.a(paramInt, this.a);
      i = this.b.c.a(i, this.c, -1);
      b(i);
      localzt = this.b.c.f(i);
      if (paramBoolean2) {
        this.a.m();
      }
    }
    else
    {
      b(i);
      localzt = this.b.c.f(i);
    }
    return new Row(this.a, this.b, localzt, paramBoolean3);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */