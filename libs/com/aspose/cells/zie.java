package com.aspose.cells;

class zie
  implements zahe
{
  private int a;
  private RowCollection b;
  private zaja c;
  private short d;
  private short e;
  private boolean f;
  private zgs g;
  private boolean h;
  private boolean i;
  private zaiv j;
  private int k;
  private boolean l;
  private zgs m;
  private zt n;
  private Row o;
  private Cell p;
  private int q;
  
  zie(Cells paramCells, boolean paramBoolean, int paramInt)
  {
    this(paramCells, -1, (short)-1, -1, (short)-1, paramBoolean, paramInt, false);
  }
  
  zie(Cells paramCells, CellArea paramCellArea, boolean paramBoolean, int paramInt)
  {
    this(paramCells, paramCellArea.StartRow, (short)paramCellArea.StartColumn, paramCellArea.EndRow, (short)paramCellArea.EndColumn, paramBoolean, paramInt, false);
  }
  
  zie(Cells paramCells, int paramInt1, short paramShort1, int paramInt2, short paramShort2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2)
  {
    this.d = paramShort1;
    this.e = paramShort2;
    this.b = paramCells.getRows();
    if (paramCells.e().d())
    {
      if (paramBoolean1)
      {
        this.f = true;
        this.g = new zgs();
      }
      else
      {
        this.f = false;
        this.g = null;
      }
    }
    else
    {
      this.f = true;
      this.g = null;
    }
    this.c = paramCells.getRows().a.a(paramInt1, paramInt2, false);
    this.k = -1;
    if (this.c == null)
    {
      this.l = true;
      this.i = false;
      this.h = false;
      this.a = paramInt3;
    }
    else
    {
      a(false);
      if (paramBoolean2)
      {
        this.h = true;
        this.q = -1;
        this.a = (paramInt3 & 0xFFFFFFFE);
        if (this.c.h()) {
          this.i = false;
        } else {
          this.i = true;
        }
      }
      else
      {
        this.i = false;
        this.h = false;
        this.a = paramInt3;
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
    if (this.l) {
      return false;
    }
    if (this.h) {
      this.j.a(this.q, this.k);
    }
    this.m = null;
    this.p = null;
    this.k = this.j.a();
    if (this.k > -1)
    {
      if (this.h) {
        this.q = this.n.a(this.k);
      }
      return true;
    }
    this.o = null;
    if (this.i)
    {
      this.c.g();
      this.c.a(this.n.i(), this.c.a());
    }
    a(true);
    return !this.l;
  }
  
  public Object b()
  {
    return f();
  }
  
  private void a(boolean paramBoolean)
  {
    if (!this.c.hasNext())
    {
      this.l = true;
      return;
    }
    this.n = this.c.e();
    this.j = this.n.b(this.d, this.e, false);
    if (this.j != null) {
      if (paramBoolean)
      {
        this.k = this.j.a();
        if (this.k > -1) {
          if (this.h) {
            this.q = this.n.a(this.k);
          }
        }
      }
      else
      {
        return;
      }
    }
    while (this.c.hasNext())
    {
      this.n = this.c.e();
      this.j = this.n.b(this.d, this.e, false);
      if (this.j != null) {
        if (paramBoolean)
        {
          this.k = this.j.a();
          if (this.k > -1) {
            if (this.h) {
              this.q = this.n.a(this.k);
            }
          }
        }
        else
        {
          return;
        }
      }
    }
    this.l = true;
  }
  
  public zt c()
  {
    return this.n;
  }
  
  public Row d()
  {
    if (this.o == null) {
      this.o = this.c.f();
    }
    return this.o;
  }
  
  public zgs e()
  {
    if (this.m == null) {
      if (this.f) {
        this.m = this.n.a(this.k, this.g, this.a);
      } else {
        this.m = this.n.a(this.k, new zgs(), this.a);
      }
    }
    return this.m;
  }
  
  public Cell f()
  {
    if (this.p == null) {
      this.p = new Cell(d(), this.k, e(), this.m == this.g);
    }
    return this.p;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */