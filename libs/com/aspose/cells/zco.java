package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.zj;

class zco
  implements zj
{
  protected zr a;
  protected boolean b = false;
  protected float c;
  protected float d;
  protected zbnh e;
  protected float f = 0.0F;
  protected float g;
  protected float h;
  private boolean i = false;
  
  zco(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    this.a = paramzr;
    this.e = paramzbnh;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.g = this.c;
    this.h = this.d;
    zi localzi = new zi();
    boolean bool;
    switch (this.e.I())
    {
    case 13: 
    case 20: 
    case 32: 
    case 87: 
    case 136: 
      if (paramzbnh.j() != 0)
      {
        zq localzq = new zq(this.c, this.d, this.e.l().h(), this.e.l().i());
        if ((this.e.l().i() == 0.0F) || (this.e.l().h() == 0.0F)) {
          localzq = new zq(this.e.G().f(), this.e.G().g(), this.e.G().h(), this.e.G().i());
        }
        zo localzo = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
        localzi.b(zbxz.a(localzo.d()), zbxz.a(localzo.e()));
        localzi.a(paramzbnh.j());
        localzi.b(-zbxz.a(localzo.d()), -zbxz.a(localzo.e()));
        this.i = true;
      }
      break;
    case 54: 
      if (this.e.E())
      {
        this.e.a(this.e.j() + 180);
        localzi = a(this.e.j());
      }
      else if (this.e.j() > 0)
      {
        localzi = a(this.e.j());
      }
      break;
    case 53: 
      if (!this.e.E())
      {
        this.e.a(this.e.j() + 180);
        localzi = a(this.e.j());
      }
      else if (this.e.j() > 0)
      {
        localzi = a(this.e.j());
      }
      break;
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
      if (this.e.d) {
        localzi = a(this.e);
      } else {
        localzi = b(this.e);
      }
      break;
    case 0: 
      if (this.e.d) {
        localzi = a(this.e);
      } else if ((this.e.F()) || (this.e.E()) || (this.e.j() != 0)) {
        localzi = b(this.e);
      }
      break;
    case 1: 
      if (this.e.d)
      {
        bool = this.e.F();
        localzi = a(this.e);
        this.e.b(bool);
      }
      else if ((this.e.j() > 0) && ((this.e.j() != 180) || (!this.e.E())))
      {
        if ((!this.e.d) && (!this.e.f)) {
          localzi = c(this.e);
        } else {
          localzi = a(paramzbnh.j());
        }
      }
      break;
    case 4: 
      if (this.e.d)
      {
        bool = this.e.F();
        localzi = a(this.e);
        this.e.b(bool);
      }
      else if (this.e.j() > 0)
      {
        if (!this.e.f) {
          localzi = c(this.e);
        } else {
          localzi = a(paramzbnh.j());
        }
      }
      break;
    default: 
      if (this.e.j() > 0) {
        if ((!this.e.d) && (!this.e.f)) {
          localzi = c(this.e);
        } else {
          localzi = a(paramzbnh.j());
        }
      }
      break;
    }
    this.a.a(localzi);
  }
  
  ze a(zq paramzq)
  {
    return new ze();
  }
  
  void a(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    zq localzq = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    ze localze = a(localzq);
    zs localzs = zbya.a(this.e.n());
    zf localzf = paramzr.d();
    paramzr.a(4, true);
    paramzr.a(localzs, localze);
    paramzr.a(localzf);
  }
  
  void b(zr paramzr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    throws Exception
  {
    zq localzq = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    ze localze = a(localzq);
    zc localzc = zbya.a(this.e.m(), localze);
    zf localzf = paramzr.d();
    paramzr.a(4, true);
    paramzr.a(localzc, localze);
    paramzr.a(localzf);
  }
  
  void a()
    throws Exception
  {
    zq localzq = new zq(this.c, this.d, this.e.l().h(), this.e.l().i());
    if (!this.e.m().a()) {
      b(this.a, this.c, this.d, this.e.l().h(), this.e.l().i());
    }
    if (!this.e.n().a()) {
      a(this.a, this.c, this.d, this.e.l().h(), this.e.l().i());
    }
    b();
  }
  
  void b()
    throws Exception
  {
    b(this.e.l());
  }
  
  void b(zq paramzq)
    throws Exception
  {
    if (this.e.u().equals("\n")) {
      return;
    }
    if (!this.e.n().a()) {
      paramzq.a(-(this.e.n().f() / 2.0F), -(this.e.n().f() / 2.0F));
    }
    float f1 = zbya.a(this.e.o().h());
    if ((this.e.q() == 7) && ((int)this.e.d().a() == 0))
    {
      paramzq.a(paramzq.f() + f1);
      paramzq.c(paramzq.h() - f1);
    }
    else if ((this.e.q() == 8) && ((int)this.e.d().c() == 0))
    {
      paramzq.c(paramzq.h() - f1);
    }
    paramzq.a(paramzq.f() + (float)this.e.d().a());
    paramzq.c(paramzq.h() - (float)(this.e.d().a() + this.e.d().c()));
    paramzq.b(paramzq.g() + (float)this.e.d().b());
    paramzq.d(paramzq.i() - (float)(this.e.d().b() + this.e.d().d()));
    int j = this.e.o().d();
    if (paramzq.i() < j)
    {
      float f2 = (j - paramzq.i()) / 2.0F;
      paramzq = new zq(paramzq.f(), paramzq.g() - f2, paramzq.h(), j);
    }
    zf localzf = null;
    if (this.i)
    {
      localzf = this.a.d();
      zn localzn = new zn((int)(paramzq.j() + paramzq.h() / 2.0F), (int)(paramzq.k() + paramzq.i() / 2.0F));
      this.a.b(localzn.a(), localzn.b());
      zi localzi = new zi();
      double d1 = 0.0D;
      zi[] arrayOfzi = { localzi };
      double[] arrayOfDouble = { d1 };
      a(arrayOfzi, arrayOfDouble);
      localzi = arrayOfzi[0];
      d1 = arrayOfDouble[0];
      this.a.a(-(float)d1);
      this.a.a(localzi);
      this.a.b(-localzn.a(), -localzn.b());
    }
    zbya.a(this.a, this.e, paramzq, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
    if (this.i) {
      this.a.a(localzf);
    }
  }
  
  private zi a(int paramInt)
  {
    zi localzi = new zi();
    zq localzq = new zq(this.c, this.d, this.e.l().h(), this.e.l().i());
    zo localzo = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
    localzi.b(zbxz.a(localzo.d()), zbxz.a(localzo.e()));
    localzi.a(paramInt);
    localzi.b(-zbxz.a(localzo.d()), -zbxz.a(localzo.e()));
    this.i = true;
    return localzi;
  }
  
  private zi c(zbnh paramzbnh)
  {
    zi localzi = new zi();
    int j = paramzbnh.j();
    float f3 = Math.abs(paramzbnh.f() - paramzbnh.g());
    float f1;
    float f2;
    if (paramzbnh.k())
    {
      if (paramzbnh.U())
      {
        f1 = paramzbnh.i() + paramzbnh.g() / 2.0F;
        f2 = paramzbnh.h() + paramzbnh.f() / 2.0F;
      }
      else
      {
        f1 = paramzbnh.h() + paramzbnh.f() / 2.0F;
        f2 = paramzbnh.i() + paramzbnh.g() / 2.0F;
      }
    }
    else
    {
      f1 = paramzbnh.h() + paramzbnh.f() / 2.0F;
      f2 = paramzbnh.i() + paramzbnh.g() / 2.0F;
    }
    localzi.a(j, new zo(zbxz.a(f1), zbxz.a(f2)));
    if ((paramzbnh.k()) && (paramzbnh.U())) {
      localzi.b(zbxz.a(paramzbnh.g() / 2.0F - paramzbnh.f() / 2.0F), zbxz.a(paramzbnh.f() / 2.0F - paramzbnh.g() / 2.0F));
    }
    this.i = true;
    return localzi;
  }
  
  zi a(zbnh paramzbnh)
  {
    float f1;
    float f2;
    if (!paramzbnh.d)
    {
      if (paramzbnh.k())
      {
        f1 = paramzbnh.i() + paramzbnh.g() / 2.0F;
        f2 = paramzbnh.h() + paramzbnh.f() / 2.0F;
      }
      else
      {
        f1 = paramzbnh.h() + paramzbnh.f() / 2.0F;
        f2 = paramzbnh.i() + paramzbnh.g() / 2.0F;
      }
    }
    else
    {
      f1 = paramzbnh.h() + paramzbnh.f() / 2.0F;
      f2 = paramzbnh.i() + paramzbnh.g() / 2.0F;
    }
    zi localzi = new zi(paramzbnh.F() ? -1.0F : 1.0F, 0.0F, 0.0F, paramzbnh.E() ? -1.0F : 1.0F, paramzbnh.F() ? zbxz.a(f1 * 2.0F) : 0.0F, paramzbnh.E() ? zbxz.a(f2 * 2.0F) : 0.0F);
    localzi.a((paramzbnh.F() ^ paramzbnh.E()) ? -paramzbnh.j() : paramzbnh.j(), new zo(zbxz.a(f1), zbxz.a(f2)));
    this.i = true;
    return localzi;
  }
  
  zi b(zbnh paramzbnh)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (paramzbnh.k())
    {
      f1 = 1.0F + paramzbnh.g() / 2.0F;
      f2 = 1.0F + paramzbnh.f() / 2.0F;
    }
    else
    {
      f1 = paramzbnh.h() + paramzbnh.f() / 2.0F;
      f2 = paramzbnh.i() + paramzbnh.g() / 2.0F;
    }
    zi localzi = new zi(paramzbnh.F() ? -1.0F : 1.0F, 0.0F, 0.0F, paramzbnh.E() ? -1.0F : 1.0F, paramzbnh.F() ? zbxz.a(f1 * 2.0F) : 0.0F, paramzbnh.E() ? zbxz.a(f2 * 2.0F) : 0.0F);
    localzi.a((paramzbnh.F() ^ paramzbnh.E()) ? -paramzbnh.j() : paramzbnh.j(), new zo(zbxz.a(f1), zbxz.a(f2)));
    if (paramzbnh.k())
    {
      if (!paramzbnh.d) {
        localzi.b(zbxz.a(paramzbnh.g() / 2.0F - paramzbnh.f() / 2.0F), zbxz.a(paramzbnh.f() / 2.0F - paramzbnh.g() / 2.0F));
      } else if (paramzbnh.j() == 90) {
        localzi.b(zbxz.a(paramzbnh.i() + (paramzbnh.g() / 2.0F - paramzbnh.f() / 2.0F)), zbxz.a(-paramzbnh.h() + (paramzbnh.f() / 2.0F - paramzbnh.g() / 2.0F)));
      } else if (paramzbnh.j() == 270) {
        localzi.b(zbxz.a(paramzbnh.i() + (paramzbnh.g() / 2.0F - paramzbnh.f() / 2.0F)), zbxz.a(paramzbnh.h() + (paramzbnh.f() / 2.0F - paramzbnh.g() / 2.0F)));
      } else {
        localzi.b(zbxz.a(paramzbnh.g() / 2.0F - paramzbnh.f() / 2.0F), zbxz.a(paramzbnh.f() / 2.0F - paramzbnh.g() / 2.0F));
      }
    }
    else if ((paramzbnh.j() == 180) || (paramzbnh.j() == 0)) {
      localzi.b(zbxz.a(paramzbnh.h()), zbxz.a(paramzbnh.i()));
    }
    this.i = true;
    return localzi;
  }
  
  public void dispose()
  {
    a(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.b)
    {
      if (paramBoolean) {}
      this.b = true;
    }
  }
  
  protected void finalize()
    throws Exception
  {
    dispose();
  }
  
  private void a(zi[] paramArrayOfzi, double[] paramArrayOfDouble)
  {
    if ((4 == this.e.h.getAutoShapeType()) || (1 == this.e.I()))
    {
      float f1 = 1.0F;
      float f2 = 1.0F;
      paramArrayOfDouble[0] = this.e.h.getRotationAngle();
      if (this.e.h.isFlippedHorizontally()) {
        f1 = -f1;
      }
      if (this.e.h.isFlippedVertically()) {
        f2 = -f2;
      }
      paramArrayOfDouble[0] = (f1 * f2 * paramArrayOfDouble[0]);
      Shape localShape;
      for (Object localObject = this.e.h; ((Shape)localObject).W(); localObject = localShape)
      {
        localShape = (Shape)((Shape)localObject).J();
        if (localShape.isFlippedHorizontally()) {
          f1 = -f1;
        }
        if (localShape.isFlippedVertically()) {
          f2 = -f2;
        }
        paramArrayOfDouble[0] += f1 * f2 * localShape.getRotationAngle();
      }
      paramArrayOfDouble[0] = ((float)(paramArrayOfDouble[0] % 360.0D));
      paramArrayOfzi[0] = new zi(f1, 0.0F, 0.0F, f2, 0.0F, 0.0F);
    }
    else
    {
      paramArrayOfDouble[0] = this.e.j();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */