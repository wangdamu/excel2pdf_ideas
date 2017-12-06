package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbmn
  extends zcp
{
  zbmn(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f3 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0));
        f4 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1));
        f1 = paramzq.h() / 2.0F + paramzq.h() * Math.abs(com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f2 = paramzq.i() / 2.0F + paramzq.i() * Math.abs(com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F);
        if ((f1 <= paramzq.h()) && (f2 <= paramzq.i()))
        {
          localze.b(paramzq);
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
    }
    else
    {
      f3 = -20473.0F;
      f4 = 61957.0F;
      f1 = paramzq.h() / 2.0F + paramzq.h() * Math.abs(-0.20473F);
      f2 = paramzq.i() / 2.0F + paramzq.i() * Math.abs(0.61957F);
    }
    float f5 = (float)(Math.atan(paramzq.h() / paramzq.i()) * 180.0D / 3.141592653589793D);
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
    if ((f6 >= 0.0F) && (f6 <= 90.0F - f5))
    {
      arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g() + f2);
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.83F);
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.g() + paramzq.i());
      arrayOfzo[4] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f() + paramzq.h(), paramzq.g());
      arrayOfzo[6] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.58F);
    }
    else if ((f6 >= 90.0F - f5) && (f6 <= 90.0F))
    {
      arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g() + f2);
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h() * 0.58F, paramzq.g() + paramzq.i());
      arrayOfzo[2] = new zo(paramzq.f(), paramzq.g() + paramzq.i());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[4] = new zo(paramzq.f() + paramzq.h(), paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i());
      arrayOfzo[6] = new zo(paramzq.f() + paramzq.h() * 0.83F, paramzq.g() + paramzq.i());
    }
    else
    {
      float f7;
      if ((f6 > 90.0F) && (f6 <= 90.0F + f5))
      {
        if (f1 > paramzq.h())
        {
          f7 = f1 - paramzq.h();
          arrayOfzo[0] = new zo(paramzq.f(), f2 + paramzq.g());
          arrayOfzo[1] = new zo(f7 + 0.17F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[2] = new zo(f7 + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[3] = new zo(f7 + paramzq.f(), paramzq.g());
          arrayOfzo[4] = new zo(f1 + paramzq.f(), paramzq.g());
          arrayOfzo[5] = new zo(f1 + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[6] = new zo(f7 + 0.42F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
        }
        else
        {
          arrayOfzo[0] = new zo(paramzq.f() + paramzq.h() - f1, f2 + paramzq.g());
          arrayOfzo[1] = new zo(0.17F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[2] = new zo(paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[3] = new zo(paramzq.f(), paramzq.g());
          arrayOfzo[4] = new zo(paramzq.h() + paramzq.f(), paramzq.g());
          arrayOfzo[5] = new zo(paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[6] = new zo(0.42F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
        }
      }
      else if ((f6 >= 90.0F + f5) && (f6 <= 180.0F))
      {
        f7 = f1 - paramzq.h();
        arrayOfzo[0] = new zo(paramzq.f(), f2 + paramzq.g());
        arrayOfzo[1] = new zo(f7 + paramzq.f(), paramzq.i() * 0.58F + paramzq.g());
        arrayOfzo[2] = new zo(f7 + paramzq.f(), paramzq.g());
        arrayOfzo[3] = new zo(f1 + paramzq.f(), paramzq.g());
        arrayOfzo[4] = new zo(f1 + paramzq.f(), paramzq.g() + paramzq.i());
        arrayOfzo[5] = new zo(f7 + paramzq.f(), paramzq.i() + paramzq.g());
        arrayOfzo[6] = new zo(f7 + paramzq.f(), paramzq.i() * 0.83F + paramzq.g());
      }
      else
      {
        float f8;
        if ((f6 > 180.0F) && (f6 <= 180.0F + (90.0F - f5)))
        {
          if (f2 > paramzq.i())
          {
            f7 = f1 - paramzq.h();
            f8 = f2 - paramzq.i();
            arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
            arrayOfzo[1] = new zo(f7 + paramzq.f(), paramzq.i() * 0.17F + f8 + paramzq.g());
            arrayOfzo[2] = new zo(f7 + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[3] = new zo(f1 + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[4] = new zo(f1 + paramzq.f(), paramzq.g() + f2);
            arrayOfzo[5] = new zo(f7 + paramzq.f(), f2 + paramzq.g());
            arrayOfzo[6] = new zo(f7 + paramzq.f(), paramzq.i() * 0.42F + f8 + paramzq.g());
          }
          else
          {
            f7 = f1 - paramzq.h();
            arrayOfzo[0] = new zo(paramzq.f(), paramzq.i() - f2 + paramzq.g());
            arrayOfzo[1] = new zo(f7 + paramzq.f(), paramzq.i() * 0.17F + paramzq.g());
            arrayOfzo[2] = new zo(f7 + paramzq.f(), paramzq.g());
            arrayOfzo[3] = new zo(f1 + paramzq.f(), paramzq.g());
            arrayOfzo[4] = new zo(f1 + paramzq.f(), paramzq.g() + paramzq.i());
            arrayOfzo[5] = new zo(f7 + paramzq.f(), paramzq.i() + paramzq.g());
            arrayOfzo[6] = new zo(f7 + paramzq.f(), paramzq.i() * 0.42F + paramzq.g());
          }
        }
        else if ((f6 >= 180.0F + (90.0F - f5)) && (f6 <= 270.0F))
        {
          if (f1 > paramzq.h())
          {
            f7 = f1 - paramzq.h();
            f8 = f2 - paramzq.i();
            arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
            arrayOfzo[1] = new zo(f7 + 0.42F * paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[2] = new zo(f1 + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[3] = new zo(f1 + paramzq.f(), f2 + paramzq.g());
            arrayOfzo[4] = new zo(f7 + paramzq.f(), paramzq.g() + f2);
            arrayOfzo[5] = new zo(f7 + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[6] = new zo(f7 + 0.17F * paramzq.h() + paramzq.f(), f8 + paramzq.g());
          }
          else
          {
            f7 = f2 - paramzq.i();
            arrayOfzo[0] = new zo(paramzq.f() + paramzq.h() - f1, paramzq.g());
            arrayOfzo[1] = new zo(0.42F * paramzq.h() + paramzq.f(), f7 + paramzq.g());
            arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), f7 + paramzq.g());
            arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f2 + paramzq.g());
            arrayOfzo[4] = new zo(paramzq.f(), paramzq.g() + f2);
            arrayOfzo[5] = new zo(paramzq.f(), f7 + paramzq.g());
            arrayOfzo[6] = new zo(paramzq.h() * 0.17F + paramzq.f(), f7 + paramzq.g());
          }
        }
        else if ((f6 > 270.0F) && (f6 <= 270.0F + f5))
        {
          f7 = f2 - paramzq.i();
          arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g());
          arrayOfzo[1] = new zo(0.83F * paramzq.h() + paramzq.f(), f7 + paramzq.g());
          arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), f7 + paramzq.g());
          arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f2 + paramzq.g());
          arrayOfzo[4] = new zo(paramzq.f(), paramzq.g() + f2);
          arrayOfzo[5] = new zo(paramzq.f(), f7 + paramzq.g());
          arrayOfzo[6] = new zo(0.58F * paramzq.h() + paramzq.f(), f7 + paramzq.g());
        }
        else if ((f6 >= 270.0F + f5) && (f6 <= 360.0F))
        {
          if (f2 > paramzq.i())
          {
            f7 = f1 - paramzq.h();
            f8 = f2 - paramzq.i();
            arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g());
            arrayOfzo[1] = new zo(paramzq.h() + paramzq.f(), 0.42F * paramzq.i() + f8 + paramzq.g());
            arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), f2 + paramzq.g());
            arrayOfzo[3] = new zo(paramzq.f(), f2 + paramzq.g());
            arrayOfzo[4] = new zo(paramzq.f(), paramzq.g() + f8);
            arrayOfzo[5] = new zo(paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[6] = new zo(paramzq.h() + paramzq.f(), f8 + paramzq.i() * 0.17F + paramzq.g());
          }
          else
          {
            f7 = f1 - paramzq.h();
            arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g() + paramzq.i() - f2);
            arrayOfzo[1] = new zo(paramzq.h() + paramzq.f(), 0.42F * paramzq.i() + paramzq.g());
            arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
            arrayOfzo[3] = new zo(paramzq.f(), paramzq.i() + paramzq.g());
            arrayOfzo[4] = new zo(paramzq.f(), paramzq.g());
            arrayOfzo[5] = new zo(paramzq.h() + paramzq.f(), paramzq.g());
            arrayOfzo[6] = new zo(paramzq.h() + paramzq.f(), paramzq.i() * 0.17F + paramzq.g());
          }
        }
      }
    }
    localze.b(arrayOfzo);
    localze.j();
    return localze;
  }
  
  void a()
    throws Exception
  {
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
    if ((f6 >= 0.0F) && (f6 < 90.0F - f5))
    {
      localzq1 = this.e.y();
    }
    else if ((f6 > 90.0F - f5) && (f6 <= 90.0F))
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
            if (f7 < 0.0F) {
              f7 = 0.0F;
            }
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
        else if ((f6 > 270.0F + f5) && (f6 <= 360.0F))
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
    c(localzq2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */