package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbng
  extends zcp
{
  zbng(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
    switch (this.e.c)
    {
    case 1: 
      break;
    case 2: 
      zi localzi1 = new zi(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.e.W().i());
      this.a.c();
      this.a.a(localzi1);
      break;
    case 3: 
      zi localzi2 = new zi(-1.0F, 0.0F, 0.0F, -1.0F, this.e.W().h(), this.e.W().i());
      this.a.c();
      this.a.a(localzi2);
      break;
    case 4: 
      zi localzi3 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
      this.a.c();
      this.a.a(localzi3);
    }
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    zo[] arrayOfzo = new zo[7];
    float f5 = 2.0F * Math.min(paramzq.h(), paramzq.i()) * 0.15F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f3 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0));
        f4 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1));
        f1 = paramzq.h() / 2.0F + paramzq.h() * Math.abs(com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f2 = paramzq.i() / 2.0F + paramzq.i() * Math.abs(com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F);
      }
      else
      {
        f3 = -20473.0F;
        f4 = 61957.0F;
        f1 = paramzq.h() / 2.0F + paramzq.h() * Math.abs(-0.20473F);
        f2 = paramzq.i() / 2.0F + paramzq.i() * Math.abs(0.61957F);
      }
      if ((f1 <= paramzq.h()) && (f2 <= paramzq.i()))
      {
        zt localzt1 = new zt(f5, f5);
        zq localzq1 = new zq(paramzq.d(), localzt1);
        localze.a(localzq1, 180.0F, 90.0F);
        localzq1.a(paramzq.l() - f5);
        localze.a(localzq1, 270.0F, 90.0F);
        localzq1.b(paramzq.m() - f5);
        localze.a(localzq1, 0.0F, 90.0F);
        localzq1.a(paramzq.j());
        localze.a(localzq1, 90.0F, 90.0F);
        localze.j();
        return localze;
      }
    }
    else
    {
      f3 = -20473.0F;
      f4 = 61957.0F;
      f1 = paramzq.h() / 2.0F + paramzq.h() * Math.abs(-0.20473F);
      f2 = paramzq.i() / 2.0F + paramzq.i() * Math.abs(0.61957F);
    }
    float f6 = (float)(Math.atan(paramzq.h() / paramzq.i()) * 180.0D / 3.141592653589793D);
    float f7 = 0.0F;
    if ((f3 > 0.0F) && (f4 > 0.0F)) {
      f7 = (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    } else if ((f3 < 0.0F) && (f4 > 0.0F)) {
      f7 = 180.0F - (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    } else if ((f3 < 0.0F) && (f4 < 0.0F)) {
      f7 = 180.0F + (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    } else {
      f7 = 360.0F - (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    }
    zt localzt2;
    zq localzq2;
    if ((f7 >= 0.0F) && (f7 <= 90.0F - f6))
    {
      localzt2 = new zt(f5, f5);
      localzq2 = new zq(paramzq.d(), localzt2);
      arrayOfzo[0] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.58F);
      arrayOfzo[1] = new zo(paramzq.f() + f1, paramzq.g() + f2);
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.83F);
      localze.a(localzq2, 180.0F, 90.0F);
      localzq2.a(paramzq.l() - f5);
      localze.a(localzq2, 270.0F, 90.0F);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localzq2.b(paramzq.m() - f5);
      localze.a(localzq2, 0.0F, 90.0F);
      localzq2.a(paramzq.j());
      localze.a(localzq2, 90.0F, 90.0F);
    }
    else if ((f7 >= 90.0F - f6) && (f7 <= 90.0F))
    {
      localzt2 = new zt(f5, f5);
      localzq2 = new zq(paramzq.d(), localzt2);
      arrayOfzo[0] = new zo(paramzq.f() + paramzq.h() * 0.83F, paramzq.g() + paramzq.i());
      arrayOfzo[1] = new zo(paramzq.f() + f1, paramzq.g() + f2);
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h() * 0.58F, paramzq.g() + paramzq.i());
      localze.a(localzq2, 180.0F, 90.0F);
      localzq2.a(paramzq.l() - f5);
      localze.a(localzq2, 270.0F, 90.0F);
      localzq2.b(paramzq.m() - f5);
      localze.a(localzq2, 0.0F, 90.0F);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localzq2.a(paramzq.j());
      localze.a(localzq2, 90.0F, 90.0F);
    }
    else
    {
      zq localzq3;
      if ((f7 > 90.0F) && (f7 <= 90.0F + f6))
      {
        if (f1 > paramzq.h())
        {
          localzt2 = new zt(f5, f5);
          float f8 = f1 - paramzq.h();
          zq localzq4 = new zq(paramzq.d(), localzt2);
          arrayOfzo[0] = new zo(f8 + 0.42F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[1] = new zo(paramzq.f(), f2 + paramzq.g());
          arrayOfzo[2] = new zo(f8 + 0.17F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          localzq4.a(localzq4.f() + f8);
          localze.a(localzq4, 180.0F, 90.0F);
          localzq4.a(paramzq.l() - f5 + f8);
          localze.a(localzq4, 270.0F, 90.0F);
          localzq4.b(paramzq.m() - f5);
          localze.a(localzq4, 0.0F, 90.0F);
          localze.a(arrayOfzo[0], arrayOfzo[1]);
          localze.a(arrayOfzo[1], arrayOfzo[2]);
          localzq4.a(paramzq.j() + f8);
          localze.a(localzq4, 90.0F, 90.0F);
        }
        else
        {
          localzt2 = new zt(f5, f5);
          localzq3 = new zq(paramzq.d(), localzt2);
          arrayOfzo[0] = new zo(0.42F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[1] = new zo(paramzq.f() + paramzq.h() - f1, f2 + paramzq.g());
          arrayOfzo[2] = new zo(0.17F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          localze.a(localzq3, 180.0F, 90.0F);
          localzq3.a(paramzq.l() - f5);
          localze.a(localzq3, 270.0F, 90.0F);
          localzq3.b(paramzq.m() - f5);
          localze.a(localzq3, 0.0F, 90.0F);
          localze.a(arrayOfzo[0], arrayOfzo[1]);
          localze.a(arrayOfzo[1], arrayOfzo[2]);
          localzq3.a(paramzq.j());
          localze.a(localzq3, 90.0F, 90.0F);
        }
      }
      else
      {
        float f9;
        if ((f7 >= 90.0F + f6) && (f7 <= 180.0F))
        {
          localzt2 = new zt(f5, f5);
          localzq3 = new zq(paramzq.d(), localzt2);
          f9 = f1 - paramzq.h();
          arrayOfzo[0] = new zo(f9 + paramzq.f(), paramzq.i() * 0.83F + paramzq.g());
          arrayOfzo[1] = new zo(paramzq.f(), f2 + paramzq.g());
          arrayOfzo[2] = new zo(f9 + paramzq.f(), paramzq.i() * 0.58F + paramzq.g());
          localzq3.a(localzq3.f() + f9);
          localze.a(localzq3, 180.0F, 90.0F);
          localzq3.a(paramzq.l() - f5 + f9);
          localze.a(localzq3, 270.0F, 90.0F);
          localzq3.b(paramzq.m() - f5);
          localze.a(localzq3, 0.0F, 90.0F);
          localzq3.a(paramzq.j() + f9);
          localze.a(localzq3, 90.0F, 90.0F);
          localze.a(arrayOfzo[0], arrayOfzo[1]);
          localze.a(arrayOfzo[1], arrayOfzo[2]);
        }
        else
        {
          float f10;
          if ((f7 > 180.0F) && (f7 <= 180.0F + (90.0F - f6)))
          {
            if (f2 > paramzq.i())
            {
              localzt2 = new zt(f5, f5);
              localzq3 = new zq(paramzq.d(), localzt2);
              f9 = f1 - paramzq.h();
              f10 = f2 - paramzq.i();
              arrayOfzo[0] = new zo(f9 + paramzq.f(), paramzq.i() * 0.42F + f10 + paramzq.g());
              arrayOfzo[1] = new zo(paramzq.f(), paramzq.g());
              arrayOfzo[2] = new zo(f9 + paramzq.f(), paramzq.i() * 0.17F + f10 + paramzq.g());
              localzq3.a(localzq3.f() + f9);
              localzq3.b(localzq3.g() + f10);
              localze.a(localzq3, 180.0F, 90.0F);
              localzq3.a(paramzq.l() - f5 + f9);
              localze.a(localzq3, 270.0F, 90.0F);
              localzq3.b(paramzq.m() - f5 + f10);
              localze.a(localzq3, 0.0F, 90.0F);
              localzq3.a(paramzq.j() + f9);
              localze.a(localzq3, 90.0F, 90.0F);
              localze.a(arrayOfzo[0], arrayOfzo[1]);
              localze.a(arrayOfzo[1], arrayOfzo[2]);
            }
            else
            {
              localzt2 = new zt(f5, f5);
              localzq3 = new zq(paramzq.d(), localzt2);
              f9 = f1 - paramzq.h();
              arrayOfzo[0] = new zo(f9 + paramzq.f(), paramzq.i() * 0.42F + paramzq.g());
              arrayOfzo[1] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
              arrayOfzo[2] = new zo(f9 + paramzq.f(), paramzq.i() * 0.17F + paramzq.g());
              localzq3.a(localzq3.f() + f9);
              localze.a(localzq3, 180.0F, 90.0F);
              localzq3.a(paramzq.l() - f5 + f9);
              localze.a(localzq3, 270.0F, 90.0F);
              localzq3.b(paramzq.m() - f5);
              localze.a(localzq3, 0.0F, 90.0F);
              localzq3.a(paramzq.j() + f9);
              localze.a(localzq3, 90.0F, 90.0F);
              localze.a(arrayOfzo[0], arrayOfzo[1]);
              localze.a(arrayOfzo[1], arrayOfzo[2]);
            }
          }
          else if ((f7 >= 180.0F + (90.0F - f6)) && (f7 <= 270.0F))
          {
            if (f1 > paramzq.h())
            {
              localzt2 = new zt(f5, f5);
              localzq3 = new zq(paramzq.d(), localzt2);
              f9 = f1 - paramzq.h();
              f10 = f2 - paramzq.i();
              arrayOfzo[0] = new zo(f9 + 0.17F * paramzq.h() + paramzq.f(), f10 + paramzq.g());
              arrayOfzo[1] = new zo(paramzq.f(), paramzq.g());
              arrayOfzo[2] = new zo(f9 + 0.42F * paramzq.h() + paramzq.f(), f10 + paramzq.g());
              localzq3.a(localzq3.f() + f9);
              localzq3.b(localzq3.g() + f10);
              localze.a(localzq3, 180.0F, 90.0F);
              localze.a(arrayOfzo[0], arrayOfzo[1]);
              localze.a(arrayOfzo[1], arrayOfzo[2]);
              localzq3.a(paramzq.l() - f5 + f9);
              localze.a(localzq3, 270.0F, 90.0F);
              localzq3.b(paramzq.m() - f5 + f10);
              localze.a(localzq3, 0.0F, 90.0F);
              localzq3.a(paramzq.j() + f9);
              localze.a(localzq3, 90.0F, 90.0F);
            }
            else
            {
              localzt2 = new zt(f5, f5);
              localzq3 = new zq(paramzq.d(), localzt2);
              f9 = f2 - paramzq.i();
              arrayOfzo[0] = new zo(paramzq.h() * 0.17F + paramzq.f(), f9 + paramzq.g());
              arrayOfzo[1] = new zo(paramzq.f() + paramzq.h() - f1, paramzq.g());
              arrayOfzo[2] = new zo(0.42F * paramzq.h() + paramzq.f(), f9 + paramzq.g());
              localzq3.b(localzq3.g() + f9);
              localze.a(localzq3, 180.0F, 90.0F);
              localze.a(arrayOfzo[0], arrayOfzo[1]);
              localze.a(arrayOfzo[1], arrayOfzo[2]);
              localzq3.a(paramzq.l() - f5);
              localze.a(localzq3, 270.0F, 90.0F);
              localzq3.b(paramzq.m() - f5 + f9);
              localze.a(localzq3, 0.0F, 90.0F);
              localzq3.a(paramzq.j());
              localze.a(localzq3, 90.0F, 90.0F);
            }
          }
          else if ((f7 > 270.0F) && (f7 <= 270.0F + f6))
          {
            localzt2 = new zt(f5, f5);
            localzq3 = new zq(paramzq.d(), localzt2);
            f9 = f2 - paramzq.i();
            arrayOfzo[0] = new zo(0.58F * paramzq.h() + paramzq.f(), f9 + paramzq.g());
            arrayOfzo[1] = new zo(paramzq.f() + f1, paramzq.g());
            arrayOfzo[2] = new zo(0.83F * paramzq.h() + paramzq.f(), f9 + paramzq.g());
            localzq3.b(localzq3.g() + f9);
            localze.a(localzq3, 180.0F, 90.0F);
            localze.a(arrayOfzo[0], arrayOfzo[1]);
            localze.a(arrayOfzo[1], arrayOfzo[2]);
            localzq3.a(paramzq.l() - f5);
            localze.a(localzq3, 270.0F, 90.0F);
            localzq3.b(paramzq.m() - f5 + f9);
            localze.a(localzq3, 0.0F, 90.0F);
            localzq3.a(paramzq.j());
            localze.a(localzq3, 90.0F, 90.0F);
          }
          else if ((f7 >= 270.0F + f6) && (f7 <= 360.0F))
          {
            if (f2 > paramzq.i())
            {
              localzt2 = new zt(f5, f5);
              localzq3 = new zq(paramzq.d(), localzt2);
              f9 = f1 - paramzq.h();
              f10 = f2 - paramzq.i();
              arrayOfzo[0] = new zo(paramzq.h() + paramzq.f(), f10 + paramzq.i() * 0.17F + paramzq.g());
              arrayOfzo[1] = new zo(paramzq.f() + f1, paramzq.g());
              arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), 0.42F * paramzq.i() + f10 + paramzq.g());
              localzq3.b(localzq3.g() + f10);
              localze.a(localzq3, 180.0F, 90.0F);
              localzq3.a(paramzq.l() - f5);
              localze.a(localzq3, 270.0F, 90.0F);
              localze.a(arrayOfzo[0], arrayOfzo[1]);
              localze.a(arrayOfzo[1], arrayOfzo[2]);
              localzq3.b(paramzq.m() - f5 + f10);
              localze.a(localzq3, 0.0F, 90.0F);
              localzq3.a(paramzq.j());
              localze.a(localzq3, 90.0F, 90.0F);
            }
            else
            {
              localzt2 = new zt(f5, f5);
              localzq3 = new zq(paramzq.d(), localzt2);
              f9 = f1 - paramzq.h();
              arrayOfzo[0] = new zo(paramzq.h() + paramzq.f(), paramzq.i() * 0.17F + paramzq.g());
              arrayOfzo[1] = new zo(paramzq.f() + f1, paramzq.g() + paramzq.i() - f2);
              arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), 0.42F * paramzq.i() + paramzq.g());
              localze.a(localzq3, 180.0F, 90.0F);
              localzq3.a(paramzq.l() - f5);
              localze.a(localzq3, 270.0F, 90.0F);
              localze.a(arrayOfzo[0], arrayOfzo[1]);
              localze.a(arrayOfzo[1], arrayOfzo[2]);
              localzq3.b(paramzq.m() - f5);
              localze.a(localzq3, 0.0F, 90.0F);
              localzq3.a(paramzq.j());
              localze.a(localzq3, 90.0F, 90.0F);
            }
          }
        }
      }
    }
    localze.j();
    return localze;
  }
  
  void a()
    throws Exception
  {
    c();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (this.e.n != null)
    {
      f3 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0));
      f4 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1));
      f1 = this.e.s() / 2.0F + this.e.s() * Math.abs(com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
      f2 = this.e.t() / 2.0F + this.e.t() * Math.abs(com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F);
    }
    else
    {
      f3 = -20473.0F;
      f4 = 61957.0F;
      f1 = this.e.s() / 2.0F + this.e.s() * Math.abs(-0.20473F);
      f2 = this.e.t() / 2.0F + this.e.t() * Math.abs(0.61957F);
    }
    float f5 = (float)(Math.atan(this.e.s() / this.e.t()) * 180.0D / 3.141592653589793D);
    float f6 = 0.0F;
    if ((f3 > 0.0F) && (f4 > 0.0F)) {
      f6 = (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    } else if ((f3 < 0.0F) && (f4 > 0.0F)) {
      f6 = 180.0F - (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    } else if ((f3 < 0.0F) && (f4 < 0.0F)) {
      f6 = 180.0F + (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    } else {
      f6 = 360.0F - (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
    }
    zq localzq1 = new zq();
    if ((f6 >= 0.0F) && (f6 <= 90.0F - f5))
    {
      localzq1 = this.e.y();
    }
    else if ((f6 >= 90.0F - f5) && (f6 <= 90.0F))
    {
      localzq1 = this.e.y();
    }
    else
    {
      float f7;
      if ((f6 > 90.0F) && (f6 <= 90.0F + f5))
      {
        if (f1 > this.e.s())
        {
          f7 = f1 - this.e.s();
          localzq1 = new zq(this.e.u() + f7, this.e.v(), this.e.y().h(), this.e.y().i());
        }
        else
        {
          localzq1 = this.e.y();
        }
      }
      else if ((f6 >= 90.0F + f5) && (f6 <= 180.0F))
      {
        f7 = f1 - this.e.s();
        localzq1 = new zq(this.e.u() + f7, this.e.v(), this.e.y().h(), this.e.y().i());
      }
      else
      {
        float f8;
        if ((f6 > 180.0F) && (f6 <= 180.0F + (90.0F - f5)))
        {
          if (f2 > this.e.t())
          {
            f7 = f1 - this.e.s();
            f8 = f2 - this.e.t();
            localzq1 = new zq(this.e.u() + f7, this.e.v() + f8, this.e.y().h(), this.e.y().i());
          }
          else
          {
            f7 = f1 - this.e.s();
            localzq1 = new zq(this.e.u() + f7, this.e.v(), this.e.y().h(), this.e.y().i());
          }
        }
        else if ((f6 >= 180.0F + (90.0F - f5)) && (f6 <= 270.0F))
        {
          if (f1 > this.e.s())
          {
            f7 = f1 - this.e.s();
            f8 = f2 - this.e.t();
            localzq1 = new zq(this.e.u() + f7, this.e.v() + f8, this.e.y().h(), this.e.y().i());
          }
          else
          {
            f7 = f2 - this.e.t();
            localzq1 = new zq(this.e.u(), this.e.v() + f7, this.e.y().h(), this.e.y().i());
          }
        }
        else if ((f6 > 270.0F) && (f6 <= 270.0F + f5))
        {
          f7 = f2 - this.e.t();
          localzq1 = new zq(this.e.u(), this.e.v() + f7, this.e.y().h(), this.e.y().i());
        }
        else if ((f6 >= 270.0F + f5) && (f6 <= 360.0F))
        {
          if (f2 > this.e.t())
          {
            f7 = f1 - this.e.s();
            f8 = f2 - this.e.t();
            localzq1 = new zq(this.e.u(), this.e.v() + f8, this.e.y().h(), this.e.y().i());
          }
          else
          {
            f7 = f1 - this.e.s();
            localzq1 = this.e.y();
          }
        }
      }
    }
    zq localzq2 = localzq1;
    zq[] arrayOfzq = { localzq2 };
    a(arrayOfzq);
    localzq2 = arrayOfzq[0];
    c(localzq2);
  }
  
  public static void a(zq[] paramArrayOfzq)
  {
    float f1 = 2.0F * Math.min(paramArrayOfzq[0].h(), paramArrayOfzq[0].i()) * 0.15F;
    float f2 = paramArrayOfzq[0].f() + f1 / 2.0F - (float)Math.sqrt(f1 * f1 / 8.0F);
    float f3 = paramArrayOfzq[0].f() + f1 / 2.0F + (float)Math.sqrt(f1 * f1 / 8.0F);
    float f4 = Math.min(f2, f3);
    float f5 = f4 + paramArrayOfzq[0].g() - paramArrayOfzq[0].f();
    float f6 = f4 - paramArrayOfzq[0].f();
    paramArrayOfzq[0].a(f4);
    paramArrayOfzq[0].b(f5);
    paramArrayOfzq[0].c(paramArrayOfzq[0].h() - 2.0F * f6);
    paramArrayOfzq[0].d(paramArrayOfzq[0].i() - 2.0F * f6);
  }
  
  void c()
  {
    switch (this.e.c)
    {
    case 1: 
      break;
    case 2: 
      zi localzi1 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
      this.a.c();
      this.a.a(localzi1);
      break;
    case 3: 
      break;
    case 4: 
      zi localzi2 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
      this.a.c();
      this.a.a(localzi2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */