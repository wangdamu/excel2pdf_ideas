package com.aspose.cells;

class zif
  implements zahe
{
  private int a;
  private RowCollection b;
  private zaja c;
  private short d;
  private boolean e;
  private zgs f;
  private boolean g;
  private int h;
  private boolean i;
  private zgs j;
  private zt k;
  private Row l;
  private Cell m;
  
  zif(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, boolean paramBoolean2)
  {
    this.d = ((short)paramInt3);
    this.b = paramCells.getRows();
    if (paramCells.e().d())
    {
      if (paramBoolean1)
      {
        this.e = true;
        this.f = new zgs();
      }
      else
      {
        this.e = false;
        this.f = null;
      }
    }
    else
    {
      this.e = true;
      this.f = null;
    }
    this.c = paramCells.getRows().a.a(paramInt1, paramInt2, false);
    this.h = -1;
    if (this.c == null)
    {
      this.i = true;
      this.g = false;
      this.a = paramInt4;
    }
    else
    {
      this.i = false;
      if (paramBoolean2)
      {
        this.a = (paramInt4 & 0xFFFFFFFE);
        if (this.c.h()) {
          this.g = false;
        } else {
          this.g = true;
        }
      }
      else
      {
        this.g = false;
        this.a = paramInt4;
      }
    }
  }
  
  public boolean hasNext()
  {
    return a();
  }
  
  public Object next()
  {
    return b();
  }
  
  public void remove()
  {
    throw new CellsException(19, "Removing cells data while iteration is not supported");
  }
  
  public boolean a()
  {
    if (this.i) {
      return false;
    }
    this.j = null;
    this.m = null;
    this.l = null;
    if (this.g)
    {
      this.c.g();
      this.c.a(this.k.i(), this.c.a());
    }
    g();
    return !this.i;
  }
  
  public Object b()
  {
    return f();
  }
  
  private void g()
  {
    if (!this.c.hasNext())
    {
      this.i = true;
      return;
    }
    this.k = this.c.e();
    this.h = this.k.b(this.d);
    if (this.h > -1) {
      return;
    }
    while (this.c.hasNext())
    {
      this.k = this.c.e();
      this.h = this.k.b(this.d);
      if (this.h > -1) {
        return;
      }
    }
    this.i = true;
  }
  
  public zt c()
  {
    return this.k;
  }
  
  public Row d()
  {
    if (this.l == null) {
      this.l = this.c.f();
    }
    return this.l;
  }
  
  public zgs e()
  {
    if (this.j == null) {
      if (this.e) {
        this.j = this.k.a(this.h, this.f, this.a);
      } else {
        this.j = this.k.a(this.h, new zgs(), this.a);
      }
    }
    return this.j;
  }
  
  public Cell f()
  {
    if (this.m == null) {
      this.m = new Cell(d(), this.h, e(), this.j == this.f);
    }
    return this.m;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */