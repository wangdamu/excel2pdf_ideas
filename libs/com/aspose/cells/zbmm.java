package com.aspose.cells;

import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;
import java.util.Iterator;

class zbmm
  extends zco
{
  zbmm(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    float f2 = 0.0F;
    zo[] arrayOfzo = new zo[7];
    float f3 = 1111.0F;
    float f4 = 26041.0F;
    ArrayList localArrayList = this.e.l.a;
    if (localArrayList.size() > 0)
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zar localzar = (zar)localIterator.next();
        if (localzar.b() == 327) {
          f3 = com.aspose.cells.b.a.ze.a(Integer.valueOf(localzar.a()));
        }
        if (localzar.b() == 328) {
          f4 = com.aspose.cells.b.a.ze.a(Integer.valueOf(localzar.a()));
        }
      }
      f1 = Math.abs(paramzq.h() * (f3 / 21600.0F));
      f2 = Math.abs(paramzq.i() * (f4 / 21600.0F));
      if ((f3 > 0.0F) && (f4 > 0.0F) && (f1 <= paramzq.h()) && (f2 <= paramzq.i()))
      {
        localze.b(paramzq);
        return localze;
      }
    }
    else
    {
      f3 = 1111.0F;
      f4 = 26041.0F;
      f1 = paramzq.h() * Math.abs(f3 / 21600.0F);
      f2 = paramzq.i() * Math.abs(f4 / 21600.0F);
    }
    float f5 = (float)(Math.atan(paramzq.h() / paramzq.i()) * 180.0D / 3.141592653589793D);
    float f6 = 0.0F;
    if ((f3 > 0.0F) && (f4 > 0.0F))
    {
      if ((f1 < paramzq.h() / 2.0F) && (f2 > paramzq.i())) {
        f6 = 90.0F + (float)(Math.atan((paramzq.h() / 2.0F - f1) / (f2 - paramzq.i() / 2.0F)) * 180.0D / 3.141592653589793D);
      } else if ((f1 > paramzq.h()) && (f2 < paramzq.i() / 2.0F)) {
        f6 = 360.0F - (float)(Math.atan((paramzq.i() / 2.0F + f2) / (f1 - paramzq.h() / 2.0F)) * 180.0D / 3.141592653589793D);
      } else {
        f6 = (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
      }
    }
    else if ((f3 < 0.0F) && (f4 > 0.0F))
    {
      if (f2 > paramzq.i() / 2.0F) {
        f6 = 90.0F + (float)(Math.atan((paramzq.h() / 2.0F + f1) / (f2 - paramzq.i() / 2.0F)) * 180.0D / 3.141592653589793D);
      } else {
        f6 = 180.0F + (float)(Math.atan((paramzq.i() / 2.0F - f2) / (f1 + paramzq.h() / 2.0F)) * 180.0D / 3.141592653589793D);
      }
    }
    else if ((f3 < 0.0F) && (f4 < 0.0F)) {
      f6 = 180.0F + (float)(Math.atan((paramzq.i() / 2.0F + f2) / (f1 + paramzq.h() / 2.0F)) * 180.0D / 3.141592653589793D);
    } else if (f1 > paramzq.h() / 2.0F) {
      f6 = 360.0F - (float)(Math.atan((paramzq.i() / 2.0F + f2) / (f1 - paramzq.h() / 2.0F)) * 180.0D / 3.141592653589793D);
    } else {
      f6 = 180.0F + (float)(Math.atan((paramzq.i() / 2.0F + f2) / (paramzq.h() / 2.0F - f1)) * 180.0D / 3.141592653589793D);
    }
    if ((f6 >= 0.0F) && (f6 < 90.0F - f5))
    {
      arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g() + f2);
      arrayOfzo[1] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.83F);
      arrayOfzo[2] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i());
      arrayOfzo[3] = new zo(paramzq.f(), paramzq.g() + paramzq.i());
      arrayOfzo[4] = new zo(paramzq.f(), paramzq.g());
      arrayOfzo[5] = new zo(paramzq.f() + paramzq.h(), paramzq.g());
      arrayOfzo[6] = new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i() * 0.58F);
    }
    else if ((f6 >= 90.0F - f5) && (f6 < 90.0F))
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
      if ((f6 >= 90.0F) && (f6 <= 90.0F + f5))
      {
        if (f3 < 0.0F)
        {
          f7 = f1;
          arrayOfzo[0] = new zo(paramzq.f(), f2 + paramzq.g());
          arrayOfzo[1] = new zo(f7 + 0.17F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[2] = new zo(f7 + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[3] = new zo(f7 + paramzq.f(), paramzq.g());
          arrayOfzo[4] = new zo(f7 + paramzq.h() + paramzq.f(), paramzq.g());
          arrayOfzo[5] = new zo(f7 + paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[6] = new zo(f7 + 0.42F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
        }
        else
        {
          arrayOfzo[0] = new zo(paramzq.f() + f1, f2 + paramzq.g());
          arrayOfzo[1] = new zo(0.17F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[2] = new zo(paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[3] = new zo(paramzq.f(), paramzq.g());
          arrayOfzo[4] = new zo(paramzq.h() + paramzq.f(), paramzq.g());
          arrayOfzo[5] = new zo(paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
          arrayOfzo[6] = new zo(0.42F * paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g());
        }
      }
      else if ((f6 >= 90.0F + f5) && (f6 < 180.0F))
      {
        f7 = f1;
        arrayOfzo[0] = new zo(paramzq.f(), f2 + paramzq.g());
        arrayOfzo[1] = new zo(f7 + paramzq.f(), paramzq.i() * 0.58F + paramzq.g());
        arrayOfzo[2] = new zo(f7 + paramzq.f(), paramzq.g());
        arrayOfzo[3] = new zo(f7 + paramzq.h() + paramzq.f(), paramzq.g());
        arrayOfzo[4] = new zo(f7 + paramzq.h() + paramzq.f(), paramzq.g() + paramzq.i());
        arrayOfzo[5] = new zo(f7 + paramzq.f(), paramzq.i() + paramzq.g());
        arrayOfzo[6] = new zo(f7 + paramzq.f(), paramzq.i() * 0.83F + paramzq.g());
      }
      else
      {
        float f8;
        if ((f6 >= 180.0F) && (f6 <= 180.0F + (90.0F - f5)))
        {
          if (f4 < 0.0F)
          {
            f7 = f1;
            f8 = f2;
            arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
            arrayOfzo[1] = new zo(f7 + paramzq.f(), paramzq.i() * 0.17F + f8 + paramzq.g());
            arrayOfzo[2] = new zo(f7 + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[3] = new zo(f7 + paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[4] = new zo(f7 + paramzq.h() + paramzq.f(), paramzq.g() + paramzq.i() + f2);
            arrayOfzo[5] = new zo(f7 + paramzq.f(), f2 + paramzq.i() + paramzq.g());
            arrayOfzo[6] = new zo(f7 + paramzq.f(), paramzq.i() * 0.42F + f8 + paramzq.g());
          }
          else
          {
            f7 = f1;
            arrayOfzo[0] = new zo(paramzq.f(), f2 + paramzq.g());
            arrayOfzo[1] = new zo(f7 + paramzq.f(), paramzq.i() * 0.17F + paramzq.g());
            arrayOfzo[2] = new zo(f7 + paramzq.f(), paramzq.g());
            arrayOfzo[3] = new zo(f7 + paramzq.h() + paramzq.f(), paramzq.g());
            arrayOfzo[4] = new zo(f7 + paramzq.h() + paramzq.f(), paramzq.g() + paramzq.i());
            arrayOfzo[5] = new zo(f7 + paramzq.f(), paramzq.i() + paramzq.g());
            arrayOfzo[6] = new zo(f7 + paramzq.f(), paramzq.i() * 0.42F + paramzq.g());
          }
        }
        else if ((f6 >= 180.0F + (90.0F - f5)) && (f6 < 270.0F))
        {
          if (f3 < 0.0F)
          {
            f7 = f1;
            f8 = f2;
            arrayOfzo[0] = new zo(paramzq.f(), paramzq.g());
            arrayOfzo[1] = new zo(f7 + 0.42F * paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[2] = new zo(f7 + paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[3] = new zo(f7 + paramzq.h() + paramzq.f(), f8 + paramzq.i() + paramzq.g());
            arrayOfzo[4] = new zo(f7 + paramzq.f(), paramzq.g() + paramzq.i() + f8);
            arrayOfzo[5] = new zo(f7 + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[6] = new zo(f7 + 0.17F * paramzq.h() + paramzq.f(), f8 + paramzq.g());
          }
          else
          {
            f7 = f2;
            arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g());
            arrayOfzo[1] = new zo(0.42F * paramzq.h() + paramzq.f(), f7 + paramzq.g());
            arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), f7 + paramzq.g());
            arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f7 + paramzq.i() + paramzq.g());
            arrayOfzo[4] = new zo(paramzq.f(), paramzq.g() + f7 + paramzq.i());
            arrayOfzo[5] = new zo(paramzq.f(), f7 + paramzq.g());
            arrayOfzo[6] = new zo(paramzq.h() * 0.17F + paramzq.f(), f7 + paramzq.g());
          }
        }
        else if ((f6 >= 270.0F) && (f6 <= 270.0F + f5))
        {
          if (f1 > paramzq.h())
          {
            f7 = f1 - paramzq.h();
            f8 = f2;
            arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g());
            arrayOfzo[1] = new zo(0.83F * paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f8 + paramzq.i() + paramzq.g());
            arrayOfzo[4] = new zo(paramzq.f(), paramzq.g() + f8 + paramzq.i());
            arrayOfzo[5] = new zo(paramzq.f(), f8 + paramzq.g());
            arrayOfzo[6] = new zo(0.58F * paramzq.h() + paramzq.f(), f8 + paramzq.g());
          }
          else
          {
            f7 = f2;
            arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g());
            arrayOfzo[1] = new zo(0.83F * paramzq.h() + paramzq.f(), f7 + paramzq.g());
            arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), f7 + paramzq.g());
            arrayOfzo[3] = new zo(paramzq.h() + paramzq.f(), f7 + paramzq.i() + paramzq.g());
            arrayOfzo[4] = new zo(paramzq.f(), paramzq.g() + f7 + paramzq.i());
            arrayOfzo[5] = new zo(paramzq.f(), f7 + paramzq.g());
            arrayOfzo[6] = new zo(0.58F * paramzq.h() + paramzq.f(), f7 + paramzq.g());
          }
        }
        else if ((f6 >= 270.0F + f5) && (f6 <= 360.0F)) {
          if (f4 < 0.0F)
          {
            f7 = f1 - paramzq.h();
            f8 = f2;
            arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g());
            arrayOfzo[1] = new zo(paramzq.h() + paramzq.f(), 0.42F * paramzq.i() + f8 + paramzq.g());
            arrayOfzo[2] = new zo(paramzq.h() + paramzq.f(), f8 + paramzq.i() + paramzq.g());
            arrayOfzo[3] = new zo(paramzq.f(), f8 + paramzq.i() + paramzq.g());
            arrayOfzo[4] = new zo(paramzq.f(), paramzq.g() + f8);
            arrayOfzo[5] = new zo(paramzq.h() + paramzq.f(), f8 + paramzq.g());
            arrayOfzo[6] = new zo(paramzq.h() + paramzq.f(), f8 + paramzq.i() * 0.17F + paramzq.g());
          }
          else
          {
            f7 = f1 - paramzq.h();
            arrayOfzo[0] = new zo(paramzq.f() + f1, paramzq.g() + f2);
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
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[0]);
    localze.j();
    return localze;
  }
  
  void b()
    throws Exception
  {
    this.a.c();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 1111.0F;
    float f4 = 26041.0F;
    ArrayList localArrayList = this.e.l.a;
    if (localArrayList.size() > 0)
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zar localzar = (zar)localIterator.next();
        if (localzar.b() == 327) {
          f3 = com.aspose.cells.b.a.ze.a(Integer.valueOf(localzar.a()));
        }
        if (localzar.b() == 328) {
          f4 = com.aspose.cells.b.a.ze.a(Integer.valueOf(localzar.a()));
        }
      }
      f1 = Math.abs(this.e.f() * (f3 / 21600.0F));
      f2 = Math.abs(this.e.g() * (f4 / 21600.0F));
    }
    else
    {
      f3 = 1111.0F;
      f4 = 26041.0F;
      f1 = this.e.f() * Math.abs(f3 / 21600.0F);
      f2 = this.e.g() * Math.abs(f4 / 21600.0F);
    }
    float f5 = (float)(Math.atan(this.e.f() / this.e.g()) * 180.0D / 3.141592653589793D);
    float f6 = 0.0F;
    if ((f3 > 0.0F) && (f4 > 0.0F))
    {
      if ((f1 < this.e.f() / 2.0F) && (f2 > this.e.g())) {
        f6 = 90.0F + (float)(Math.atan((this.e.f() / 2.0F - f1) / (f2 - this.e.g() / 2.0F)) * 180.0D / 3.141592653589793D);
      } else if ((f1 > this.e.f()) && (f2 < this.e.g() / 2.0F)) {
        f6 = 360.0F - (float)(Math.atan((this.e.g() / 2.0F + f2) / (f1 - this.e.f() / 2.0F)) * 180.0D / 3.141592653589793D);
      } else {
        f6 = (float)(Math.atan(f2 / f1) * 180.0D / 3.141592653589793D);
      }
    }
    else if ((f3 < 0.0F) && (f4 > 0.0F))
    {
      if (f2 > this.e.g() / 2.0F) {
        f6 = 90.0F + (float)(Math.atan((this.e.f() / 2.0F + f1) / (f2 - this.e.g() / 2.0F)) * 180.0D / 3.141592653589793D);
      } else {
        f6 = 180.0F + (float)(Math.atan((this.e.g() / 2.0F - f2) / (f1 + this.e.f() / 2.0F)) * 180.0D / 3.141592653589793D);
      }
    }
    else if ((f3 < 0.0F) && (f4 < 0.0F)) {
      f6 = 180.0F + (float)(Math.atan((this.e.g() / 2.0F + f2) / (f1 + this.e.f() / 2.0F)) * 180.0D / 3.141592653589793D);
    } else if (f1 > this.e.f() / 2.0F) {
      f6 = 360.0F - (float)(Math.atan((this.e.g() / 2.0F + f2) / (f1 - this.e.f() / 2.0F)) * 180.0D / 3.141592653589793D);
    } else {
      f6 = 180.0F + (float)(Math.atan((this.e.g() / 2.0F + f2) / (this.e.f() / 2.0F - f1)) * 180.0D / 3.141592653589793D);
    }
    zq localzq1 = new zq();
    if ((f6 >= 0.0F) && (f6 <= 90.0F - f5))
    {
      localzq1 = this.e.l();
    }
    else if ((f6 > 90.0F - f5) && (f6 < 90.0F))
    {
      localzq1 = this.e.l();
    }
    else
    {
      float f7;
      if ((f6 >= 90.0F) && (f6 <= 90.0F + f5))
      {
        if (f3 < 0.0F)
        {
          f7 = f1;
          localzq1 = new zq(this.e.h() + f7, this.e.i(), this.e.l().h(), this.e.l().i());
        }
        else
        {
          localzq1 = this.e.l();
        }
      }
      else if ((f6 >= 90.0F + f5) && (f6 < 180.0F))
      {
        f7 = f1;
        localzq1 = new zq(this.e.h() + f7, this.e.i(), this.e.l().h(), this.e.l().i());
      }
      else if ((f6 >= 180.0F) && (f6 <= 180.0F + (90.0F - f5)))
      {
        if (f4 < 0.0F)
        {
          f7 = f1;
          f8 = f2;
          localzq1 = new zq(this.e.h() + f7, this.e.i() + f8, this.e.l().h(), this.e.l().i());
        }
        else
        {
          f7 = f1;
          localzq1 = new zq(this.e.h() + f7, this.e.i(), this.e.l().h(), this.e.l().i());
        }
      }
      else if ((f6 >= 180.0F + (90.0F - f5)) && (f6 < 270.0F))
      {
        if (f3 < 0.0F)
        {
          f7 = f1;
          f8 = f2;
          localzq1 = new zq(this.e.h() + f7, this.e.i() + f8, this.e.l().h(), this.e.l().i());
        }
        else
        {
          f7 = f2;
          localzq1 = new zq(this.e.h(), this.e.i() + f7, this.e.l().h(), this.e.l().i());
        }
      }
      else if ((f6 >= 270.0F) && (f6 <= 270.0F + f5))
      {
        f7 = f2;
        localzq1 = new zq(this.e.h(), this.e.i() + f7, this.e.l().h(), this.e.l().i());
      }
      else if ((f6 >= 270.0F + f5) && (f6 <= 360.0F))
      {
        if (f4 < 0.0F)
        {
          f7 = f1;
          f8 = f2;
          localzq1 = new zq(this.e.h(), this.e.i() + f8, this.e.l().h(), this.e.l().i());
        }
        else
        {
          f7 = f1;
          localzq1 = this.e.l();
        }
      }
    }
    zq localzq2 = localzq1;
    if (!this.e.n().a()) {
      localzq2.a(-(this.e.n().f() / 2.0F), -(this.e.n().f() / 2.0F));
    }
    float f8 = zbya.a(this.e.o().h());
    if ((this.e.q() == 7) || (this.e.q() == 9))
    {
      if ((int)this.e.d().a() == 0) {
        localzq2.a(localzq2.f() + f8);
      }
    }
    else if (((this.e.q() == 0) || (this.e.q() == 8)) && ((int)this.e.d().c() == 0)) {
      localzq2.c(localzq2.h() - f8);
    }
    if (this.e.u().equals("\n")) {
      return;
    }
    zbya.a(this.a, this.e, localzq2, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */