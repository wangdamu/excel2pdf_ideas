package com.aspose.cells;

class zbpj
  extends zh
{
  private Cell b;
  private int c = -1;
  
  zbpj(Row paramRow)
  {
    super(paramRow);
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a()
  {
    this.b = null;
  }
  
  public Cell a(int paramInt)
  {
    zgs localzgs = new zgs();
    localzgs = this.a.c.a(paramInt, localzgs, 7);
    if ((this.b != null) && (this.b.getColumn() == localzgs.a))
    {
      this.b.c = localzgs;
      this.b.a = paramInt;
    }
    else
    {
      this.b = new Cell(this.a, paramInt);
    }
    return this.b;
  }
  
  public Cell b(int paramInt)
  {
    if ((this.b != null) && (this.b.getColumn() == paramInt)) {
      return this.b;
    }
    return null;
  }
  
  public Cell a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.b != null) && (this.b.getColumn() == paramInt))
    {
      a(this.b, paramInt, paramBoolean1, paramBoolean2);
      return this.b;
    }
    Cell localCell = a(paramInt, -1, paramBoolean1, paramBoolean2);
    this.b = localCell;
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */