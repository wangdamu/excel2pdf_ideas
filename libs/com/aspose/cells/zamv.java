package com.aspose.cells;

import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.Iterator;

class zamv
  implements zaim
{
  private zjy d;
  private int e;
  private zamx f;
  private zamx g;
  ArrayList a = new ArrayList();
  boolean b = false;
  private boolean h = false;
  private boolean i = true;
  private int j = 0;
  private boolean k = false;
  ArrayList c = new ArrayList();
  private boolean l = false;
  
  zamv(zjf paramzjf, Object paramObject, int paramInt)
  {
    this.d = new zjy(paramzjf, paramObject, 10, 12);
    this.e = 4;
    this.f = new zamx(paramzjf);
    this.g = new zamx(paramzjf);
  }
  
  zjy c()
  {
    return this.d;
  }
  
  public zahm a()
  {
    return this.d;
  }
  
  public int d()
  {
    return this.e;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  zamx e()
  {
    return this.g;
  }
  
  public zain b()
  {
    return this.f;
  }
  
  zamx f()
  {
    return this.f;
  }
  
  boolean g()
    throws Exception
  {
    if ((d() == 5) || (d() == 0) || ((d() == 3) && (!i())))
    {
      zt localzt1 = zanb.b(c().a().ap(), this);
      zs localzs = new zs(c().a().ar(), c().a().au());
      zt localzt2 = new zt(localzs.b(), localzs.c());
      zt localzt3 = zanb.b(c().a().ap(), this, localzt2);
      int m = zbxz.a(localzt1.b() + localzt3.b());
      return zbxz.b((localzs.b() - 2 * l()) / m) < 2;
    }
    return true;
  }
  
  boolean h()
  {
    return this.h;
  }
  
  void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  int j()
  {
    int m = 0;
    if (q() != null) {
      m = zbxz.c(p() * 0.2F);
    } else {
      return 0;
    }
    if (m < 3) {
      m = 3;
    }
    if (c().a().N() == 77) {
      m += 5;
    }
    return m;
  }
  
  int k()
  {
    if (c().a().N() == 77) {
      return 12;
    }
    return 7;
  }
  
  int l()
  {
    int m = 0;
    if (q() != null) {
      m = zbxz.c(p() * 0.2F);
    } else {
      return 0;
    }
    if (m < 2) {
      m = 2;
    }
    return m;
  }
  
  int m()
  {
    int m = 0;
    float f1 = 0.0F;
    com.aspose.cells.b.a.b.zg localzg = q();
    float f2 = localzg.h();
    if (f2 <= 1.0F)
    {
      m = 1;
    }
    else if (f2 <= 3.0F)
    {
      m = 2;
    }
    else if (f2 <= 4.0F)
    {
      m = 3;
    }
    else if (f2 <= 6.0F)
    {
      m = 4;
    }
    else if (f2 <= 7.0F)
    {
      m = 5;
    }
    else if (f2 <= 8.0F)
    {
      m = 6;
    }
    else
    {
      f1 = 0.465F;
      if (localzg != null)
      {
        float f3 = zbxz.a(c().a().ap().a().a(localzg));
        m = zbxz.c(f3 * f1);
      }
      else
      {
        return 0;
      }
      if (m < 3) {
        return 3;
      }
    }
    if (c().a().N() == 77) {
      m += 2;
    }
    return m;
  }
  
  int n()
  {
    if (v()) {
      return 36;
    }
    return 27;
  }
  
  zt o()
  {
    return new zt(n(), p());
  }
  
  float p()
  {
    int m = 0;
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      zamz localzamz = (zamz)localIterator.next();
      int n = zbxz.a(c().a().ap().a().a(localzamz.d()));
      if (n > m) {
        m = n;
      }
    }
    float f1 = this.d.D();
    if (m > f1) {
      return m;
    }
    return f1;
  }
  
  com.aspose.cells.b.a.b.zg q()
  {
    Object localObject = this.d.f();
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      zamz localzamz = (zamz)localIterator.next();
      com.aspose.cells.b.a.b.zg localzg = localzamz.d();
      if (localzg.h() > ((com.aspose.cells.b.a.b.zg)localObject).h()) {
        localObject = localzg;
      }
    }
    return (com.aspose.cells.b.a.b.zg)localObject;
  }
  
  float r()
  {
    float f1 = 0.0F;
    if (q() != null) {
      f1 = p() * 0.25F;
    } else {
      return 0.0F;
    }
    if (f1 < 2.0F) {
      f1 = 2.0F;
    }
    return -f1;
  }
  
  float s()
  {
    float f1 = 0.0F;
    float f2 = 0.01F;
    if (q().h() <= 6.0F) {
      f2 = 0.0F;
    } else {
      f2 += q().h() * 0.02F;
    }
    if (this.d.h() != null) {
      f1 = p() * f2;
    } else {
      return 0.0F;
    }
    if (f1 > 10.0F) {
      f1 = 10.0F;
    }
    return -f1;
  }
  
  int t()
  {
    return this.j;
  }
  
  void b(int paramInt)
  {
    this.j = paramInt;
  }
  
  public boolean u()
  {
    return this.k;
  }
  
  public void b(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  boolean v()
  {
    Iterator localIterator = e().iterator();
    while (localIterator.hasNext())
    {
      zamz localzamz = (zamz)localIterator.next();
      Object localObject;
      if (localzamz.k() == 1)
      {
        localObject = localzamz.l();
        if ((localObject != null) && (!localzamz.b()) && (((zbfd)localObject).an()) && (((zbfd)localObject).z().g().b() != 6)) {
          return true;
        }
      }
      else
      {
        localObject = localzamz.m();
        if ((localObject != null) && (!localzamz.b()) && (((zbxg)localObject).d().g().b() != 6)) {
          return true;
        }
      }
    }
    return false;
  }
  
  protected void finalize()
    throws Exception
  {
    d(false);
  }
  
  public void dispose()
  {
    d(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void d(boolean paramBoolean)
  {
    if (!this.l)
    {
      if (paramBoolean)
      {
        if (this.d != null) {
          this.d.dispose();
        }
        Iterator localIterator;
        zamz localzamz;
        if (this.g != null)
        {
          localIterator = this.g.iterator();
          while (localIterator.hasNext())
          {
            localzamz = (zamz)localIterator.next();
            localzamz.dispose();
          }
        }
        if (this.f != null)
        {
          localIterator = this.f.iterator();
          while (localIterator.hasNext())
          {
            localzamz = (zamz)localIterator.next();
            localzamz.dispose();
          }
        }
      }
      this.l = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */