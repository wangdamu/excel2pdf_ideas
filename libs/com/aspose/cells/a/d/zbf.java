package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.zm;

public class zbf
  implements Cloneable
{
  private zcs b;
  private zq c;
  private int d;
  private int e;
  private Color f;
  private Color g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  public zi a;
  private zi u;
  private zck v;
  private zcg w;
  private zci x;
  private zs y;
  private zc z;
  private zbj A;
  private zt B;
  private boolean C;
  private float D = 1.0F;
  private float E = 1.0F;
  private long[] F;
  
  public zbf(zcs paramzcs)
    throws Exception
  {
    this.b = paramzcs;
    b();
  }
  
  public void a(long paramLong)
    throws Exception
  {
    zbw localzbw = this.b.g().a(paramLong);
    if (localzbw == null) {
      return;
    }
    switch (localzbw.a())
    {
    case 2: 
      this.v = ((zck)zm.a(localzbw, zck.class));
      this.y = null;
      break;
    case 1: 
      this.w = ((zcg)zm.a(localzbw, zcg.class));
      v();
      break;
    case 6: 
      this.x = ((zci)zm.a(localzbw, zci.class));
      this.A = null;
      break;
    case 10: 
      break;
    case 11: 
      break;
    case 3: 
    case 4: 
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    default: 
      throw new IllegalStateException("Unknown GDI object type.");
    }
  }
  
  public void a(zo paramzo)
  {
    this.c.a(paramzo);
  }
  
  public void a(zt paramzt)
  {
    this.c.a(paramzt);
    this.C = true;
  }
  
  public void b(zt paramzt)
  {
    this.B = d(paramzt);
  }
  
  public zbf a()
  {
    zbf localzbf = (zbf)u();
    if (this.a != null) {
      localzbf.a = this.a.b();
    }
    if (this.u != null) {
      localzbf.u = this.u.b();
    }
    return localzbf;
  }
  
  private float c(zt paramzt)
  {
    switch (0x6 & this.h)
    {
    case 2: 
      return paramzt.b();
    case 6: 
      return paramzt.b() / 2.0F;
    }
    return 0.0F;
  }
  
  private float a(zbj paramzbj)
  {
    switch (0x18 & this.h)
    {
    case 0: 
      return paramzbj.h();
    case 8: 
      return -paramzbj.i();
    }
    return 0.0F;
  }
  
  public zi a(zo[] paramArrayOfzo, zt paramzt, zbj paramzbj)
  {
    zi localzi = new zi();
    localzi.b(-c(paramzt), a(paramzbj));
    float[] arrayOfFloat1 = localzi.d();
    float[] arrayOfFloat2 = { Math.signum(arrayOfFloat1[0]), Math.signum(arrayOfFloat1[3]), Math.signum(arrayOfFloat1[4]), Math.signum(arrayOfFloat1[5]) };
    arrayOfFloat2[2] = (arrayOfFloat2[0] < 0.0F ? arrayOfFloat2[2] : 1.0F);
    arrayOfFloat2[3] = (arrayOfFloat2[1] < 0.0F ? arrayOfFloat2[3] : 1.0F);
    paramArrayOfzo[0] = new zo(arrayOfFloat2[0] * paramArrayOfzo[0].d(), arrayOfFloat2[1] * paramArrayOfzo[0].e());
    localzi = new zi(arrayOfFloat2[0] * arrayOfFloat1[0], arrayOfFloat1[1], arrayOfFloat1[2], arrayOfFloat2[1] * arrayOfFloat1[3], arrayOfFloat2[2] * arrayOfFloat1[4], arrayOfFloat2[3] * arrayOfFloat1[5]);
    localzi.a(-this.x.e(), new zo(paramArrayOfzo[0].d(), paramArrayOfzo[0].e() + a(paramzbj)));
    return localzi;
  }
  
  public void b()
    throws Exception
  {
    this.c = zbe.a();
    this.d = 2;
    this.e = 8;
    this.f = Color.getWhite();
    this.g = Color.getBlack();
    this.h = 0;
    this.i = 0;
    this.j = 1;
    this.k = 1;
    this.l = 3;
    this.m = 0;
    this.n = 1;
    this.o = 0;
    this.p = 0;
    this.q = 0;
    this.s = 4;
    this.t = 1;
    this.a = new zi();
    this.v = new zck();
    this.w = new zcg();
    this.x = new zci();
    this.y = new zs(this.g);
    this.y.e(2);
    this.y.c(2);
    this.y.d(2);
    this.z = new zu(this.f);
    this.A = zbj.a("Microsoft Sans Serif", 12.0F, 0);
    this.B = zbe.b();
    this.C = false;
    this.D = 1.0F;
    this.E = 1.0F;
  }
  
  private void v()
  {
    if (((this.w != null) && (this.w.c() == 2)) || (this.w.c() == 240)) {
      this.w.b(h() == 2 ? this.f : Color.getEmpty());
    }
    this.z = null;
  }
  
  public zs c()
    throws Exception
  {
    if (this.y == null) {
      this.y = this.v.a(g());
    }
    return this.y;
  }
  
  public zc d()
  {
    if (this.z == null)
    {
      zi localzi = new zi();
      switch (this.b.c().n())
      {
      case 2: 
        float f1 = this.b.c().g() / 96.0F;
        localzi.a(f1, f1);
        this.z = this.w.a(localzi);
        break;
      default: 
        localzi.a(1.0F / p().d()[0], 1.0F / p().d()[3]);
      }
      this.z = this.w.a(localzi);
    }
    return this.z;
  }
  
  public zbj e()
    throws Exception
  {
    if (this.A == null) {
      this.A = this.x.c();
    }
    return this.A;
  }
  
  public zq f()
  {
    return this.c;
  }
  
  public Color g()
  {
    if (this.d == 1) {
      return Color.a(0, this.f);
    }
    return this.f;
  }
  
  public void a(Color paramColor)
  {
    this.f = paramColor;
    v();
  }
  
  public int h()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
    v();
  }
  
  public Color i()
  {
    return this.g;
  }
  
  public void b(Color paramColor)
  {
    this.g = paramColor;
  }
  
  public int j()
  {
    return this.h;
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void c(int paramInt)
  {
    this.e = paramInt;
    this.B = zbe.b();
    this.C = false;
  }
  
  public int k()
  {
    return this.j;
  }
  
  public void d(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void e(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void f(int paramInt)
  {
    this.l = paramInt;
  }
  
  public int l()
  {
    return this.i;
  }
  
  public void g(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int m()
  {
    return this.r;
  }
  
  public void h(int paramInt)
  {
    this.r = paramInt;
  }
  
  public zi n()
  {
    if (this.u == null) {
      o();
    }
    return this.u;
  }
  
  public void o()
  {
    this.u = new zi();
    float f3 = this.b.c().g() / 72.0F;
    float f4 = this.b.c().h() / 72.0F;
    float f1;
    float f2;
    switch (this.e)
    {
    case 1: 
      break;
    case 2: 
      this.u.a(0.28346458F * f3, -0.28346458F * f4);
      break;
    case 3: 
      this.u.a(0.028346457F * f3, -0.028346457F * f4);
      break;
    case 4: 
      this.u.a(0.71999997F * f3, -0.71999997F * f4);
      break;
    case 5: 
      this.u.a(0.072000004F * f3, -0.072000004F * f4);
      break;
    case 6: 
      this.u.a(0.05F * f3, -0.05F * f4);
      break;
    case 7: 
      w();
      if (this.C)
      {
        zt localzt = d(this.c.e());
        f1 = this.B.b() / localzt.b();
        f2 = this.B.c() / localzt.c();
        this.u.b(-f().f() * f1 + this.b.e().f(), -f().g() * f2 + this.b.e().g());
        this.u.a(f1, f2);
      }
      else
      {
        this.u.a(0.28346458F * f3, -0.28346458F * f4);
      }
      break;
    case 8: 
      w();
      f1 = Math.max(this.b.e().h(), 1.0F) / this.c.h();
      f2 = Math.max(this.b.e().i(), 1.0F) / this.c.i();
      this.u.b(-f().f() * f1 + this.b.e().f(), -f().g() * f2 + this.b.e().g());
      this.u.a(f1, f2);
      break;
    default: 
      throw new IllegalStateException("Unknown mapping mode.");
    }
  }
  
  private void w()
  {
    if (this.c.h() == 0.0F) {
      this.c.c(1.0F);
    }
    if (this.c.i() == 0.0F) {
      this.c.d(1.0F);
    }
    if (this.b.e().i() == 0.0F) {
      this.b.a(new zq(this.b.e().d(), new zt(this.b.e().h(), 1.0F)));
    }
  }
  
  public zi p()
  {
    zi localzi = n().b();
    localzi.b(this.a);
    return localzi;
  }
  
  public void a(zi paramzi)
  {
    this.a = paramzi;
  }
  
  public void a(zi paramzi, int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      this.a = new zi();
      break;
    case 2: 
      this.a.a(paramzi, 0);
      break;
    case 3: 
      this.a.a(paramzi, 1);
      break;
    case 4: 
      a(paramzi);
    }
  }
  
  private static zt d(zt paramzt)
  {
    float f1 = Math.abs(paramzt.b());
    float f2 = Math.abs(paramzt.c());
    float f3 = f1 < f2 ? f1 : f2;
    f1 = Math.signum(paramzt.b()) * f3;
    f2 = Math.signum(paramzt.c()) * f3;
    return new zt(f1, f2);
  }
  
  public float q()
  {
    return this.D;
  }
  
  public void a(float paramFloat)
  {
    this.D = paramFloat;
  }
  
  public float r()
  {
    return this.E;
  }
  
  public void b(float paramFloat)
  {
    this.E = paramFloat;
  }
  
  public long[] s()
  {
    return this.F;
  }
  
  public void a(long[] paramArrayOfLong)
  {
    this.F = paramArrayOfLong;
  }
  
  public zci t()
  {
    return this.x;
  }
  
  protected Object u()
  {
    try
    {
      return clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new IllegalStateException(localCloneNotSupportedException);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */