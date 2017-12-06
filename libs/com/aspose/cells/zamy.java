package com.aspose.cells;

class zamy
  implements zaio
{
  private Object a;
  private boolean b;
  private zzo c;
  private zje d = null;
  private com.aspose.cells.b.a.b.zg e;
  private boolean f = true;
  private Color g;
  private int h;
  private String i;
  private int j;
  private zbfc k;
  private zbxf l;
  private boolean m = false;
  
  zamy(zje paramzje, Object paramObject, int paramInt)
  {
    this.d = paramzje;
    this.a = paramObject;
    this.h = paramInt;
    this.b = false;
    this.c = new zzo();
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public com.aspose.cells.b.a.b.zg c()
  {
    if (this.e == null) {
      if ((this.a instanceof zamu)) {
        this.e = ((zamu)this.a).d().i();
      } else if ((this.a instanceof zjp)) {
        this.e = ((zjp)this.a).b();
      } else {
        this.e = zbxz.a(this.d.ab());
      }
    }
    if ((a().d()) || (a().c()))
    {
      com.aspose.cells.b.a.b.zg localzg = new com.aspose.cells.b.a.b.zg(this.e.b(), 0.7F * this.e.h(), this.e.k());
      return localzg;
    }
    return this.e;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.e = paramzg;
  }
  
  public com.aspose.cells.b.a.b.zg d()
  {
    if (this.e == null) {
      if ((this.a instanceof zamu)) {
        this.e = ((zamu)this.a).d().i();
      } else if ((this.a instanceof zjp)) {
        this.e = ((zjp)this.a).b();
      } else {
        this.e = zbxz.a(this.d.ab());
      }
    }
    return this.e;
  }
  
  public Color e()
  {
    if (this.f)
    {
      if ((this.a instanceof zamu)) {
        return ((zamu)this.a).d().j();
      }
      if ((this.a instanceof zjp)) {
        return ((zjp)this.a).c();
      }
      return this.d.ac();
    }
    return this.g;
  }
  
  public void a(Color paramColor)
  {
    this.f = false;
    this.g = paramColor;
  }
  
  public zaid a()
  {
    return this.c;
  }
  
  public int f()
  {
    return this.h;
  }
  
  String g()
  {
    return this.i;
  }
  
  void a(String paramString)
  {
    this.i = paramString;
  }
  
  int h()
  {
    return this.j;
  }
  
  void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  zbfc i()
  {
    return this.k;
  }
  
  void a(zbfc paramzbfc)
  {
    this.k = paramzbfc;
  }
  
  zbxf j()
  {
    return this.l;
  }
  
  void a(zbxf paramzbxf)
  {
    this.l = paramzbxf;
  }
  
  protected void finalize()
    throws Exception
  {
    b(false);
  }
  
  public void dispose()
  {
    b(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void b(boolean paramBoolean)
  {
    if (!this.m)
    {
      if ((paramBoolean) && (this.e != null)) {
        this.e.n();
      }
      this.m = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */