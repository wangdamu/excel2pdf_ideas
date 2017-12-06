package com.aspose.cells;

class zbwu
  implements zajr
{
  private zbs a;
  private com.aspose.cells.b.a.b.zg b;
  private Color c;
  private String d;
  private boolean e = true;
  private int f;
  private boolean g = true;
  private int h;
  private boolean i;
  private int j = 0;
  private Font k;
  private boolean l = false;
  private boolean m = false;
  private int n = 0;
  private boolean o = false;
  
  zbwu(zbs paramzbs)
  {
    this.a = paramzbs;
    this.c = Color.getBlack();
    this.d = "";
    this.f = 100;
    this.h = 0;
  }
  
  zbs g()
  {
    return this.a;
  }
  
  public com.aspose.cells.b.a.b.zg a()
  {
    if (this.b == null)
    {
      this.b = zbxz.a(g().c().ab());
      a(this.a.c().ac());
    }
    return this.b;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.b = paramzg;
  }
  
  public void a(Font paramFont)
  {
    this.k = paramFont;
  }
  
  public Color h()
  {
    return this.c;
  }
  
  public void a(Color paramColor)
  {
    this.c = paramColor;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public boolean c()
  {
    return this.e;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public int d()
  {
    return this.f;
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public int e()
  {
    if (this.g) {
      return 0;
    }
    return this.h;
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
    this.g = false;
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  public boolean j()
  {
    return this.g;
  }
  
  public void d(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (paramBoolean) {
      this.h = 0;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public int f()
  {
    return this.n;
  }
  
  public void c(int paramInt)
  {
    this.n = paramInt;
  }
  
  int k()
  {
    return this.j;
  }
  
  void d(int paramInt)
  {
    this.j = paramInt;
  }
  
  float l()
  {
    return zbxz.a(this.a.c().ar().a().a(a()));
  }
  
  protected void finalize()
    throws Exception
  {
    e(false);
  }
  
  public void dispose()
  {
    e(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void e(boolean paramBoolean)
  {
    if (!this.o)
    {
      if ((paramBoolean) && (this.b != null)) {
        this.b.n();
      }
      this.o = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */