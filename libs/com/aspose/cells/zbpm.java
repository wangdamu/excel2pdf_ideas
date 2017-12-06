package com.aspose.cells;

class zbpm
  extends zu
{
  private Row c;
  private int d = -1;
  
  zbpm(Cells paramCells, RowCollection paramRowCollection)
  {
    super(paramCells, paramRowCollection);
  }
  
  void a(zajl paramzajl)
  {
    if (this.c != null) {
      this.c.c.a(paramzajl);
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  public void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a()
  {
    this.c = null;
  }
  
  public Row a(int paramInt)
  {
    if ((this.c != null) && (this.c.c.i() == paramInt)) {
      return this.c;
    }
    return null;
  }
  
  public Row a(int paramInt, boolean paramBoolean)
  {
    this.d = paramInt;
    if ((this.c != null) && (this.c.c.i() == this.b.c.a(paramInt)))
    {
      this.c.c.f(paramInt);
      return this.c;
    }
    this.c = new Row(this.a, this.b, this.b.c.f(paramInt), paramBoolean);
    return this.c;
  }
  
  public Row a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((this.c != null) && (this.c.c.i() == paramInt))
    {
      if (a(this.c, paramBoolean1, paramBoolean2)) {
        return this.c;
      }
      return null;
    }
    this.c = b(paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
    return this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */