package com.aspose.cells;

class zhx
  implements zahd
{
  private int a;
  private short b;
  private Cells c;
  private zaiv d;
  private zaiv e;
  private RowCollection f;
  private zv g;
  private zt h;
  private LightCellsDataProvider i;
  private zanj j;
  private Row k;
  private Cell l;
  private zbdx m;
  private zbdx n;
  private Row o;
  private Row p;
  private Cell q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x = -1;
  private int y = -1;
  private zang z;
  private int A;
  private boolean B;
  private boolean C;
  
  zhx(Worksheet paramWorksheet, LightCellsDataProvider paramLightCellsDataProvider, zang paramzang)
  {
    this.a = paramzang.a.a;
    this.b = paramzang.a.b;
    this.c = paramWorksheet.getCells();
    this.f = this.c.getRows();
    this.i = paramLightCellsDataProvider;
    this.z = paramzang;
    this.g = this.c.e();
    this.j = new zanj();
    this.k = new Row(this.c, this.f, this.j, false);
    this.n = this.j.a;
    this.m = new zbdx();
    this.m.a(0, this.c);
    this.l = new Cell(this.k, 0, this.j.m(), false);
    this.d = this.g.a(-1, -1, false);
    this.t = this.d.a();
    if (this.t > -1)
    {
      this.o = this.f.b(this.t, false);
      this.v = this.o.getIndex();
    }
    else
    {
      this.v = -1;
    }
  }
  
  public Cell a()
  {
    if (this.C) {
      return this.l;
    }
    return this.q;
  }
  
  public zt b()
  {
    int i1 = this.i.nextRow();
    if ((i1 < 0) || (i1 > this.a)) {
      return null;
    }
    if (i1 <= this.x) {
      throw new CellsException(6, "Row index must be greater than prior one.");
    }
    this.x = i1;
    this.r = -1;
    if (this.v > -1)
    {
      if (i1 > this.v) {
        for (;;)
        {
          this.t = this.d.a();
          if (this.t < 0)
          {
            this.v = -1;
          }
          else
          {
            this.o = this.f.b(this.t, false);
            this.v = this.o.getIndex();
            if (this.v >= i1) {
              break;
            }
          }
        }
      }
      if (i1 == this.v)
      {
        this.r = this.t;
        this.p = this.o;
        this.h = this.p.c;
        this.t = this.d.a();
        if (this.t > -1)
        {
          this.o = this.f.b(this.t, false);
          this.v = this.o.getIndex();
        }
        else
        {
          this.v = -1;
        }
        this.e = this.h.a(-1, -1, false);
        if (this.e == null)
        {
          this.u = -1;
          this.w = -1;
        }
        else
        {
          this.u = this.e.a();
          this.w = (this.u < 0 ? -1 : this.h.a(this.u));
        }
        this.B = false;
        this.y = -1;
        this.A = -1;
        this.i.startRow(this.p);
        zbdx localzbdx = this.h.a(this.j.a, 15);
        if (localzbdx != this.j.a) {
          this.j.a.a(localzbdx);
        }
        return this.h;
      }
    }
    this.w = -1;
    this.m.a = i1;
    this.j.b(this.m, 15);
    this.B = true;
    this.y = -1;
    this.A = -1;
    this.i.startRow(this.k);
    return this.k.c;
  }
  
  public zgs c()
  {
    int i1 = this.i.nextCell();
    if ((i1 < 0) || (i1 > this.b)) {
      return null;
    }
    if (i1 <= this.y) {
      throw new CellsException(6, "Cell's column index must be greater than prior one.");
    }
    this.y = i1;
    if (this.w > -1)
    {
      if (i1 > this.w) {
        for (;;)
        {
          this.u = this.e.a();
          if (this.u < 0)
          {
            this.w = -1;
          }
          else
          {
            this.w = this.p.c.a(this.u);
            if (this.w >= i1) {
              break;
            }
          }
        }
      }
      if (this.w == i1)
      {
        this.s = this.u;
        this.q = this.p.a(this.u);
        this.u = this.e.a();
        this.w = (this.u < 0 ? -1 : this.h.a(this.u));
        this.C = false;
        this.i.startCell(this.q);
        return this.q.c;
      }
    }
    this.s = 0;
    this.C = true;
    this.l.c.a(i1);
    if (this.A < 0) {
      this.A = this.k.e();
    }
    this.j.k(this.A);
    this.i.startCell(this.l);
    return this.l.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */