package com.aspose.cells;

import com.aspose.cells.b.a.zg;

class zbwx
  implements zajs
{
  private zjx b;
  private int c;
  private String d;
  private int e;
  private int f;
  private zbda g;
  boolean a = true;
  private boolean h = false;
  private boolean i = false;
  private int j = 0;
  private boolean k = false;
  private boolean l = false;
  
  zbwx(zje paramzje, Object paramObject, int paramInt)
  {
    this.b = new zjx(paramzje, paramObject, paramInt);
    this.c = 0;
    this.d = "";
    this.b.d().a(0);
    this.e = 1;
    this.f = 1;
    this.b.g().a(0);
    this.g = new zbda();
  }
  
  zjx e()
  {
    return this.b;
  }
  
  public zahm a()
  {
    return this.b;
  }
  
  public int f()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
    this.a = false;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public int g()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  public int h()
  {
    return this.f;
  }
  
  public void c(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public int i()
  {
    return this.j;
  }
  
  public void d(int paramInt)
  {
    this.j = paramInt;
  }
  
  public zaiz d()
  {
    return this.g;
  }
  
  public boolean c()
  {
    return this.k;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  boolean j()
  {
    if (this.d == null) {
      return false;
    }
    return this.d.length() > 0;
  }
  
  int k()
  {
    int m = 0;
    if (this.b.h() != null) {
      m = zbxz.c(l() * 0.2F);
    } else {
      return 0;
    }
    if (m < 2) {
      return 2;
    }
    return m;
  }
  
  float l()
  {
    return zbxz.a(e().a().ar().a().a(this.b.h()));
  }
  
  protected void finalize()
    throws Exception
  {
    d(false);
  }
  
  public void dispose()
  {
    d(true);
    zg.a(this);
  }
  
  protected void d(boolean paramBoolean)
  {
    if (!this.l)
    {
      if ((paramBoolean) && (this.b != null)) {
        this.b.dispose();
      }
      this.l = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */