package com.aspose.cells;

import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zs;
import java.util.Iterator;

class zjq
  implements zahl
{
  private zjf b;
  private com.aspose.cells.b.a.b.zg c;
  private boolean d;
  private Color e;
  private zanr f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  zp a;
  private zamx k;
  private zs l = zs.a();
  private int m = 0;
  private int n = 0;
  private boolean o = false;
  
  zjq(zjf paramzjf)
  {
    this.b = paramzjf;
    this.d = true;
    this.e = paramzjf.Z().a().a("dk1");
    this.f = new zanr(paramzjf, 13);
    this.g = true;
    this.h = true;
    this.i = true;
    this.j = true;
    this.a = zp.a();
    this.k = new zamx(paramzjf);
  }
  
  zjf a()
  {
    return this.b;
  }
  
  public com.aspose.cells.b.a.b.zg b()
  {
    if (this.c == null)
    {
      this.c = zbxz.a(this.b.ad());
      a(a().j().j());
    }
    return this.c;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.c = paramzg;
  }
  
  public Color c()
  {
    if (this.d)
    {
      if (a().R() > 40) {
        return a().Z().a().a("lt1");
      }
      return a().Z().a().a("dk1");
    }
    return this.e;
  }
  
  public void a(Color paramColor)
  {
    this.d = false;
    this.e = paramColor;
  }
  
  zanr d()
  {
    return this.f;
  }
  
  public zaip e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean g()
  {
    return this.h;
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean h()
  {
    return this.i;
  }
  
  public void c(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public boolean i()
  {
    return this.j;
  }
  
  public void d(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  zamx j()
  {
    return this.k;
  }
  
  zs k()
  {
    return this.l;
  }
  
  void a(zs paramzs)
  {
    this.l = paramzs;
  }
  
  int l()
  {
    return this.m;
  }
  
  void a(int paramInt)
  {
    this.m = paramInt;
  }
  
  int m()
  {
    return this.n;
  }
  
  void b(int paramInt)
  {
    this.n = paramInt;
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
      if (paramBoolean)
      {
        if (this.c != null) {
          this.c.n();
        }
        if (this.k != null)
        {
          Iterator localIterator = this.k.iterator();
          while (localIterator.hasNext())
          {
            zamz localzamz = (zamz)localIterator.next();
            localzamz.dispose();
          }
        }
      }
      this.o = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */