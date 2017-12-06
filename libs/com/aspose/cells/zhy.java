package com.aspose.cells;

class zhy
  implements zahd
{
  private Cells a;
  private RowCollection b;
  private zv c;
  private Row d;
  private Cell e;
  private zt f;
  private zaja g;
  private zaiv h;
  private zgs i;
  private zgs j;
  private int k;
  private int l;
  private boolean m;
  private boolean n;
  
  zhy(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet.getCells();
    this.c = this.a.e();
    this.g = paramWorksheet.getCells().getRows().a.a(-1, -1, false);
    if (this.g == null)
    {
      this.m = true;
    }
    else
    {
      this.m = false;
      this.i = new zgs();
    }
  }
  
  public Row d()
  {
    if (this.m) {
      return null;
    }
    if (this.d == null) {
      this.d = new Row(this.a, this.b, this.f, false);
    }
    return this.d;
  }
  
  public Cell a()
  {
    if ((this.m) || (this.n)) {
      return null;
    }
    if (this.e == null) {
      this.e = new Cell(d(), this.l, this.j, !this.f.f());
    }
    return this.e;
  }
  
  public zt b()
  {
    this.d = null;
    if (this.m) {
      return null;
    }
    if (!this.g.hasNext())
    {
      this.m = true;
      return null;
    }
    this.f = this.g.e();
    this.k = this.g.a();
    this.h = this.f.a(-1, -1, false);
    if (this.h == null) {
      this.n = true;
    } else {
      this.n = false;
    }
    return this.f;
  }
  
  public zgs c()
  {
    this.e = null;
    if (this.n) {
      return null;
    }
    this.l = this.h.a();
    if (this.l < 0)
    {
      this.n = true;
      return null;
    }
    this.j = this.f.a(this.l, this.i, 7);
    return this.j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */