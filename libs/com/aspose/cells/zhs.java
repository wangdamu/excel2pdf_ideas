package com.aspose.cells;

class zhs
  implements zahb
{
  private Cells a;
  private RowCollection b;
  
  zhs(Cells paramCells, RowCollection paramRowCollection)
  {
    this.a = paramCells;
    this.b = paramRowCollection;
  }
  
  public zt a(int paramInt)
  {
    Row localRow = this.b.a(paramInt, true, true, false);
    if (localRow == null) {
      return null;
    }
    return localRow.c;
  }
  
  public Row b(int paramInt)
  {
    return this.b.a(paramInt, true, true, false);
  }
  
  public Cell a(int paramInt1, int paramInt2)
  {
    return this.b.a(paramInt1, paramInt2, true, true, true);
  }
  
  public zgs a(int paramInt1, zgs paramzgs, int paramInt2)
  {
    Row localRow = this.b.a(paramInt1, true, true, false);
    if (localRow == null) {
      return null;
    }
    Cell localCell = localRow.d.b(paramzgs.a);
    if (localCell != null)
    {
      localCell.b();
      return localCell.c;
    }
    int i = localRow.d.d(paramzgs.a);
    if (i < 0) {
      return null;
    }
    return localRow.c.a(i, paramzgs, paramInt2);
  }
  
  public int a()
  {
    if (this.b.c.a() > 0)
    {
      zv localzv = this.b.c;
      zaiv localzaiv = localzv.a(-1, -1, true);
      for (;;)
      {
        int i = localzaiv.a();
        if (i < 0) {
          break;
        }
        zt localzt = localzv.f(i);
        if (localzt.a() > 0) {
          return localzt.i();
        }
      }
    }
    return -1;
  }
  
  public int a_()
  {
    if (this.b.c.a() > 0)
    {
      zv localzv = this.b.c;
      zaiv localzaiv1 = localzv.a(-1, -1, true);
      int i = localzaiv1.a();
      if (i >= 0)
      {
        zt localzt = localzv.f(i);
        zaiv localzaiv2 = localzt.b();
        do
        {
          i = localzaiv2.a();
          if (i < 0) {
            break;
          }
        } while (localzt.h(i) == 0);
        return localzt.i();
      }
    }
    return -1;
  }
  
  public zaja a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new za(this.a, this.b, paramInt1, paramInt2, paramBoolean);
  }
  
  private class za
    implements zaja
  {
    private Cells b;
    private RowCollection c;
    private zv d;
    private zaiv e;
    private int f;
    private zt g;
    private Row h;
    
    za(Cells paramCells, RowCollection paramRowCollection, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.b = paramCells;
      this.c = paramRowCollection;
      this.d = paramCells.e();
      this.e = this.d.b(paramInt1, paramInt2, paramBoolean);
      this.f = (this.e == null ? -1 : 0);
    }
    
    public boolean hasNext()
    {
      return c();
    }
    
    public Object next()
    {
      return d();
    }
    
    public void remove()
    {
      throw new CellsException(19, "Removing cells data while iteration is not supported");
    }
    
    public int a()
    {
      return this.f;
    }
    
    public void b()
    {
      if (this.e != null)
      {
        this.e.b();
        this.f = 0;
        this.h = null;
        this.g = null;
      }
    }
    
    public void a(int paramInt)
    {
      if (this.e != null)
      {
        this.f = 0;
        this.e.b(paramInt);
        this.h = null;
        this.g = null;
      }
    }
    
    public boolean c()
    {
      if (this.f < 0) {
        return false;
      }
      this.f = this.e.a();
      this.h = null;
      this.g = null;
      return this.f > -1;
    }
    
    public Object d()
    {
      return f();
    }
    
    public zt e()
    {
      if (this.g == null) {
        this.g = this.d.f(this.f);
      }
      return this.g;
    }
    
    public Row f()
    {
      if (this.h == null) {
        this.h = new Row(this.b, this.c, e(), false);
      }
      return this.h;
    }
    
    public void g() {}
    
    public boolean h()
    {
      return false;
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      this.e.a(paramInt1, paramInt2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */