package com.aspose.cells;

import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zs;
import java.util.Iterator;

class zjp
  implements zahl
{
  private zje b;
  private com.aspose.cells.b.a.b.zg c;
  private Color d;
  private zanq e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  zp a;
  private zamw j;
  private zs k = zs.a();
  private int l = 0;
  private int m = 0;
  private boolean n = false;
  
  zjp(zje paramzje)
  {
    this.b = paramzje;
    this.d = Color.getBlack();
    this.e = new zanq(paramzje);
    this.f = true;
    this.g = true;
    this.h = true;
    this.i = true;
    this.a = zp.a();
    this.j = new zamw(paramzje);
  }
  
  zje a()
  {
    return this.b;
  }
  
  public com.aspose.cells.b.a.b.zg b()
  {
    if (this.c == null)
    {
      this.c = zbxz.a(this.b.ab());
      a(this.b.ac());
    }
    return this.c;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.c = paramzg;
  }
  
  public Color c()
  {
    return this.d;
  }
  
  public void a(Color paramColor)
  {
    this.d = paramColor;
  }
  
  zanq d()
  {
    return this.e;
  }
  
  public zaip e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public boolean g()
  {
    return this.g;
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  public void d(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  int j()
  {
    int i1 = 0;
    if (b() != null) {
      i1 = zbxz.c(p() * 0.25F);
    } else {
      return 0;
    }
    if (i1 < 4) {
      return 4;
    }
    return i1;
  }
  
  int k()
  {
    int i1 = 0;
    if (b() != null) {
      i1 = zbxz.c(p() * 0.2F);
    } else {
      return 0;
    }
    if (i1 < 4) {
      return 4;
    }
    return i1;
  }
  
  int l()
  {
    int i1 = 0;
    if (b() != null) {
      i1 = zbxz.c(p() * 0.2F);
    } else {
      return 0;
    }
    return i1;
  }
  
  int m()
  {
    zbfe localzbfe = this.b.z();
    int i1 = 0;
    if (localzbfe.p()) {
      i1 = this.b.x().n();
    } else {
      i1 = this.b.x().m();
    }
    return i1;
  }
  
  int n()
  {
    int i1 = 0;
    float f1 = 0.0F;
    if (b().h() <= 6.0F) {
      f1 = 0.6F;
    } else {
      f1 = 0.465F;
    }
    if (b() != null) {
      i1 = zbxz.c(p() * f1);
    } else {
      return 0;
    }
    if (i1 < 3) {
      return 3;
    }
    return i1;
  }
  
  zamw o()
  {
    return this.j;
  }
  
  float p()
  {
    return zbxz.a(a().ar().a().a(b()));
  }
  
  zs q()
  {
    return this.k;
  }
  
  void a(zs paramzs)
  {
    this.k = paramzs;
  }
  
  int r()
  {
    return this.l;
  }
  
  void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  int s()
  {
    return this.m;
  }
  
  void b(int paramInt)
  {
    this.m = paramInt;
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
    if (!this.n)
    {
      if (paramBoolean)
      {
        if (this.c != null) {
          this.c.n();
        }
        if (this.j != null)
        {
          Iterator localIterator = this.j.iterator();
          while (localIterator.hasNext())
          {
            zamy localzamy = (zamy)localIterator.next();
            localzamy.dispose();
          }
        }
      }
      this.n = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */