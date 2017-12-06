package com.aspose.cells;

class zamz
  implements zaio
{
  private Object a;
  private boolean b;
  private zzo c;
  private zjf d;
  private com.aspose.cells.b.a.b.zg e;
  private boolean f = true;
  private Color g;
  private int h;
  private String i;
  private zbda j = new zbda();
  private boolean k = false;
  private int l;
  private zbfd m;
  private zbxg n;
  private boolean o = false;
  
  zamz(zjf paramzjf, Object paramObject, int paramInt)
  {
    this.d = paramzjf;
    this.a = paramObject;
    this.h = paramInt;
    this.b = false;
    this.f = true;
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
      if ((this.a instanceof zamv)) {
        this.e = ((zamv)this.a).c().f();
      } else if ((this.a instanceof zjq)) {
        this.e = ((zjq)this.a).b();
      } else {
        this.e = zbxz.a(this.d.ad());
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
      if ((this.a instanceof zamv)) {
        this.e = ((zamv)this.a).c().f();
      } else if ((this.a instanceof zjq)) {
        this.e = ((zjq)this.a).b();
      } else {
        this.e = zbxz.a(this.d.ad());
      }
    }
    return this.e;
  }
  
  public zaid a()
  {
    return this.c;
  }
  
  public Color e()
  {
    if (this.f)
    {
      if ((this.a instanceof zamv)) {
        return ((zamv)this.a).c().j();
      }
      if ((this.a instanceof zjq)) {
        return ((zjq)this.a).c();
      }
      return this.d.ae();
    }
    return this.g;
  }
  
  public void a(Color paramColor)
  {
    this.f = false;
    this.g = paramColor;
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
  
  public zaiz h()
  {
    return this.j;
  }
  
  public void a(zaiz paramzaiz)
  {
    for (int i1 = 0; i1 < paramzaiz.getCount(); i1++)
    {
      zaiy localzaiy = paramzaiz.a(i1);
      this.j.a(localzaiy.a(), c(), e(), a(), 2);
    }
  }
  
  public boolean i()
  {
    return zbxz.b(this.i);
  }
  
  boolean j()
  {
    return this.j.getCount() > 0;
  }
  
  int k()
  {
    return this.l;
  }
  
  void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  zbfd l()
  {
    return this.m;
  }
  
  void a(zbfd paramzbfd)
  {
    this.m = paramzbfd;
  }
  
  zbxg m()
  {
    return this.n;
  }
  
  void a(zbxg paramzbxg)
  {
    this.n = paramzbxg;
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
    if (!this.o)
    {
      if ((paramBoolean) && (this.e != null)) {
        this.e.n();
      }
      this.o = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */