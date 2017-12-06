package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.zg;

class zaos
  implements zair
{
  private zjf a;
  private zaz b;
  private zanr c;
  private int d;
  private int e = 0;
  private int f = 1;
  private Object g;
  private boolean h = false;
  
  zaos(zjf paramzjf, Object paramObject)
  {
    this.a = paramzjf;
    this.g = paramObject;
    h();
  }
  
  private void h()
  {
    this.b = new zaz(this.a, this.g, 5);
    this.c = new zanr(this.a, 7);
    zr localzr = this.a.ap();
    float f1;
    if (localzr == null) {
      f1 = 96.0F;
    } else {
      f1 = localzr.f();
    }
    this.d = zbxz.c(7.0F * f1 / 72.0F);
  }
  
  zaz e()
  {
    return this.b;
  }
  
  public zagu a()
  {
    return this.b;
  }
  
  zanr f()
  {
    return this.c;
  }
  
  public zaip b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public int d()
  {
    if (this.f == 0) {
      return 1;
    }
    return this.e;
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  boolean g()
  {
    return d() != 1;
  }
  
  boolean a(zaos paramzaos)
  {
    if ((g() == paramzaos.g()) && (g()))
    {
      if (d() != paramzaos.d()) {
        return false;
      }
      if (!e().a(paramzaos.e())) {
        return false;
      }
      if (!f().a(paramzaos.f())) {
        return false;
      }
      if (d() != paramzaos.d()) {
        return false;
      }
      if (c() != paramzaos.c()) {
        return false;
      }
    }
    return true;
  }
  
  void c(int paramInt)
  {
    if (d() == 0) {
      b(paramInt);
    }
  }
  
  void d(int paramInt)
  {
    if (d() == 0)
    {
      zr localzr = this.a.ap();
      float f1;
      if (localzr == null) {
        f1 = 96.0F;
      } else {
        f1 = localzr.f();
      }
      this.d = zbxz.c(paramInt * f1 / 72.0F);
    }
  }
  
  void a(float paramFloat1, float paramFloat2)
    throws Exception
  {
    if (this.e == 11)
    {
      if ((e().j()) && (e().f().g() != null) && (e().f().g().a() != null))
      {
        zs localzs = e().f().e().b();
        ze localze = new ze();
        paramFloat1 -= localzs.b() / 2;
        paramFloat2 -= localzs.c() / 2;
        localze.b(new zq(paramFloat1, paramFloat2, localzs.b(), localzs.c()));
        e().a(localze);
        this.c.a(localze);
      }
    }
    else {
      a(paramFloat1, paramFloat2, c());
    }
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3)
    throws Exception
  {
    if (d() == 1) {
      return;
    }
    zq localzq1 = new zq(paramFloat1 - paramFloat3 / 2.0F, paramFloat2 - paramFloat3 / 2.0F, paramFloat3, paramFloat3);
    float f1 = paramFloat3;
    int i = zbxz.c(f1 / 2.0F);
    ze localze = new ze();
    zq localzq2 = zq.c();
    float f2 = 0.0F;
    int j;
    int k;
    switch (d())
    {
    case 2: 
      zo[] arrayOfzo1 = new zo[4];
      zbxz.a(arrayOfzo1);
      arrayOfzo1[0].a(paramFloat1 - i);
      arrayOfzo1[0].b(paramFloat2);
      arrayOfzo1[1].a(paramFloat1);
      arrayOfzo1[1].b(paramFloat2 - i);
      arrayOfzo1[2].a(paramFloat1 + i);
      arrayOfzo1[2].b(paramFloat2);
      arrayOfzo1[3].a(paramFloat1);
      arrayOfzo1[3].b(paramFloat2 + i);
      localze.b(arrayOfzo1);
      e().a(localze);
      this.c.a(localze);
      break;
    case 3: 
      paramFloat1 -= i;
      paramFloat2 -= i;
      localze.b(new zq(paramFloat1, paramFloat2, 2 * i, 2 * i));
      e().a(localze);
      this.c.a(localze);
      break;
    case 4: 
      zo[] arrayOfzo2 = new zo[3];
      zbxz.a(arrayOfzo2);
      arrayOfzo2[0].a(paramFloat1 - i);
      arrayOfzo2[0].b(paramFloat2 + i);
      arrayOfzo2[1].a(paramFloat1);
      arrayOfzo2[1].b(paramFloat2 - i);
      arrayOfzo2[2].a(paramFloat1 + i);
      arrayOfzo2[2].b(paramFloat2 + i);
      localze.b(arrayOfzo2);
      e().a(localze);
      this.c.a(localze);
      break;
    case 5: 
    case 6: 
      paramFloat1 -= i;
      paramFloat2 -= i;
      localzq2 = new zq(paramFloat1, paramFloat2, i * 2, i * 2);
      e().a(localzq2);
      if ((e().h() != 0) || (this.c.i() > 1.0D))
      {
        f2 = (float)(this.c.i() / 2.0D * Math.sin(0.7853981633974483D));
        localzq2.a(-f2, -f2);
      }
      this.c.a(localzq2.j(), localzq2.k(), localzq2.l(), localzq2.m());
      this.c.a(localzq2.j(), localzq2.m(), localzq2.l(), localzq2.k());
      if (d() == 6) {
        this.c.a(localzq2.j() + localzq2.h() / 2.0F, localzq2.k(), localzq2.j() + localzq2.h() / 2.0F, localzq2.m());
      }
      break;
    case 7: 
      paramFloat1 -= i;
      paramFloat2 -= i;
      localze.a(paramFloat1, paramFloat2, i * 2, i * 2);
      e().a(localze);
      this.c.a(localze);
      break;
    case 8: 
      paramFloat1 -= i;
      paramFloat2 -= i;
      localzq2 = new zq(paramFloat1, paramFloat2, i * 2, i * 2);
      e().a(localzq2);
      if ((e().h() != 0) || (this.c.i() > 1.0D))
      {
        f2 = (float)(this.c.i() / 2.0D * Math.sin(0.7853981633974483D));
        localzq2.a(-f2, -f2);
      }
      this.c.a(localzq2.j() + localzq2.h() / 2.0F, localzq2.k(), localzq2.j() + localzq2.h() / 2.0F, localzq2.m());
      this.c.a(localzq2.j(), localzq2.k() + localzq2.i() / 2.0F, localzq2.l(), localzq2.k() + localzq2.i() / 2.0F);
      break;
    case 9: 
      j = zbxz.c(f1 / 2.0F);
      k = zbxz.c(f1 / 4.0F);
      if (k < 2) {
        paramFloat2 = (int)(paramFloat2 - k / 2 + 0.5D);
      } else {
        paramFloat2 -= k / 2;
      }
      e().a(new zq(paramFloat1, paramFloat2, j, k));
      this.c.a(new zq(paramFloat1, paramFloat2, j, k));
      break;
    case 10: 
      j = zbxz.c(f1);
      k = zbxz.c(f1 / 4.0F);
      paramFloat1 -= j / 2;
      paramFloat2 -= k / 2;
      e().a(new zq(paramFloat1, paramFloat2, j, k));
      this.c.a(new zq(paramFloat1, paramFloat2, j, k));
      break;
    case 11: 
      paramFloat1 -= i;
      paramFloat2 -= i;
      localze.b(new zq(paramFloat1, paramFloat2, 2 * i, 2 * i));
      e().a(localze);
      this.c.a(localze);
      break;
    }
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.h)
    {
      if ((paramBoolean) && (this.b != null)) {
        this.b.dispose();
      }
      this.h = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */