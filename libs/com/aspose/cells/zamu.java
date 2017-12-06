package com.aspose.cells;

import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.Iterator;

class zamu
  implements zaim
{
  private zjx c;
  private zje d;
  private int e;
  private zamw f;
  private zamw g;
  ArrayList a = new ArrayList();
  boolean b = false;
  private boolean h = true;
  private boolean i = true;
  private boolean j = false;
  private boolean k = false;
  
  zamu(zje paramzje, Object paramObject, int paramInt)
  {
    this.c = new zjx(paramzje, paramObject, paramInt);
    this.d = paramzje;
    this.e = 4;
    this.f = new zamw(paramzje);
    this.g = new zamw(paramzje);
  }
  
  zje c()
  {
    return this.d;
  }
  
  zjx d()
  {
    return this.c;
  }
  
  public zahm a()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  zamw f()
  {
    return this.g;
  }
  
  public zain b()
  {
    return this.f;
  }
  
  zamw g()
  {
    return this.f;
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
    if (this.c.h() != null) {
      return zbxz.c(this.c.C());
    }
    return 0;
  }
  
  int k()
  {
    int m = 0;
    if (this.c.h() != null) {
      m = zbxz.c(this.c.C() * 0.25F);
    } else {
      return 0;
    }
    if (m < 3) {
      return 3;
    }
    return m;
  }
  
  int l()
  {
    int m = 0;
    if (this.c.h() != null) {
      m = zbxz.c(this.c.C() * 0.2F);
    } else {
      return 0;
    }
    if (m < 2) {
      return 2;
    }
    return m;
  }
  
  int m()
  {
    int m = 0;
    float f1 = 0.0F;
    com.aspose.cells.b.a.b.zg localzg = this.c.i();
    float f2 = localzg.h();
    if (f2 <= 1.0F) {
      return 1;
    }
    if (f2 <= 3.0F) {
      return 2;
    }
    if (f2 <= 4.0F) {
      return 3;
    }
    if (f2 <= 6.0F) {
      return 4;
    }
    if (f2 <= 7.0F) {
      return 5;
    }
    if (f2 <= 8.0F) {
      return 6;
    }
    f1 = 0.465F;
    if (localzg != null) {
      m = zbxz.c(this.c.C() * f1);
    } else {
      return 0;
    }
    if (m < 3) {
      return 3;
    }
    return m;
  }
  
  int n()
  {
    if (r()) {
      return 36;
    }
    return 27;
  }
  
  zt o()
  {
    return new zt(n(), this.c.C());
  }
  
  float p()
  {
    float f1 = 0.0F;
    if (this.c.h() != null) {
      f1 = this.c.C() * 0.25F;
    } else {
      return 0.0F;
    }
    if (f1 < 2.0F) {
      f1 = 2.0F;
    }
    return -f1;
  }
  
  float q()
  {
    float f1 = 0.0F;
    float f2 = 0.01F;
    if (this.c.h().h() <= 6.0F) {
      f2 = 0.0F;
    } else {
      f2 += this.c.h().h() * 0.02F;
    }
    if (this.c.h() != null) {
      f1 = this.c.C() * f2;
    } else {
      return 0.0F;
    }
    if (f1 > 10.0F) {
      f1 = 10.0F;
    }
    return -f1;
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  private boolean r()
  {
    Iterator localIterator = f().iterator();
    while (localIterator.hasNext())
    {
      zamy localzamy = (zamy)localIterator.next();
      Object localObject;
      if (localzamy.h() == 1)
      {
        localObject = localzamy.i();
        if ((localObject != null) && (!localzamy.b()) && (((zbfc)localObject).al()) && (((zbfc)localObject).z().b().b() != 6)) {
          return true;
        }
      }
      else
      {
        localObject = localzamy.j();
        if ((localObject != null) && (!localzamy.b()) && (((zbxf)localObject).d().b().b() != 6)) {
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
    if (!this.k)
    {
      if (paramBoolean)
      {
        if (this.c != null) {
          this.c.dispose();
        }
        Iterator localIterator;
        zamy localzamy;
        if (this.g != null)
        {
          localIterator = this.g.iterator();
          while (localIterator.hasNext())
          {
            localzamy = (zamy)localIterator.next();
            localzamy.dispose();
          }
        }
        if (this.f != null)
        {
          localIterator = this.f.iterator();
          while (localIterator.hasNext())
          {
            localzamy = (zamy)localIterator.next();
            localzamy.dispose();
          }
        }
      }
      this.k = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */