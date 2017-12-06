package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbgg
  extends zco
{
  private float i = 0.0F;
  
  zbgg(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.l().h();
    float f4 = this.e.l().i();
    zq localzq1 = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    ze localze1 = new ze();
    localze1.b(localzq1);
    zc localzc1 = zbya.a(this.e.m(), localze1);
    zs localzs = zbya.a(this.e.n());
    if (this.e.l.a.size() > 0) {
      this.i = (localzq1.i() * ((zar)this.e.l.a.get(0)).a() / 21600.0F);
    } else {
      this.i = (localzq1.i() * 0.25F);
    }
    zo[] arrayOfzo = new zo[4];
    Object localObject1;
    zq localzq2;
    zq localzq3;
    Object localObject2;
    if (!this.e.m().a()) {
      if (this.i == 0.0F)
      {
        this.a.b(localzc1, localzq1);
      }
      else
      {
        localObject1 = null;
        switch (this.e.a)
        {
        case 1: 
        case 4: 
          localzq2 = new zq(localzq1.d(), new zt(localzq1.h(), this.i));
          localzq3 = new zq(localzq1.d(), new zt(localzq1.h(), this.i));
          arrayOfzo[0] = new zo(this.g, this.i / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, this.i / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.i + (localzq1.i() - 2.0F * this.i) + this.i / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, this.i + (localzq1.i() - 2.0F * this.i) + this.i / 2.0F + this.h);
          if (this.e.m().d()) {
            localObject1 = zbya.a(this.e.m(), localze1, 0.8F, 0.0F);
          } else if (this.e.m().b().toArgb() == Color.getWhite().toArgb()) {
            localObject1 = localzc1;
          } else {
            localObject1 = zbya.a(this.e.m(), localzq2, 0.8F, 80.0F);
          }
          this.a.a((zc)localObject1, localzq2);
          localObject2 = new ze();
          ((ze)localObject2).a(localzq3, 0.0F, 180.0F);
          ((ze)localObject2).a(arrayOfzo[0], arrayOfzo[3]);
          localzq3.b(this.i + (localzq1.i() - 2.0F * this.i + this.h));
          ((ze)localObject2).a(localzq3, 180.0F, -180.0F);
          ((ze)localObject2).a(arrayOfzo[2], arrayOfzo[1]);
          ((ze)localObject2).j();
          this.a.a(localzc1, (ze)localObject2);
          break;
        case 2: 
        case 3: 
          zq localzq4 = new zq(f1, f2 + f4 - this.i, f3, this.i);
          zq localzq5 = new zq(f1, f2 + f4 - this.i, f3, this.i);
          arrayOfzo[0] = new zo(this.g, f4 - this.i / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, f4 - this.i / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.i / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, this.i / 2.0F + this.h);
          zc localzc2 = null;
          if (this.e.m().d()) {
            localzc2 = zbya.a(this.e.m(), localze1, 0.8F, 0.0F);
          } else if (this.e.m().b().toArgb() == Color.getWhite().toArgb()) {
            localObject1 = localzc1;
          } else {
            localzc2 = zbya.a(this.e.m(), localzq4, 0.8F, 80.0F);
          }
          this.a.a(localzc2, localzq4);
          ze localze2 = new ze();
          localze2.a(localzq5, 0.0F, -180.0F);
          localze2.a(arrayOfzo[0], arrayOfzo[3]);
          localzq5.b(this.h);
          localze2.a(localzq5, 180.0F, 180.0F);
          localze2.a(arrayOfzo[2], arrayOfzo[1]);
          localze2.j();
          this.a.a(localzc1, localze2);
        }
      }
    }
    if (!this.e.n().a()) {
      if (this.i == 0.0F) {
        this.a.a(localzs, (int)f1, (int)f2, (int)f3, (int)f4);
      } else {
        switch (this.e.a)
        {
        case 1: 
        case 4: 
          localObject1 = new zq(localzq1.d(), new zt(localzq1.h(), this.i));
          localzq2 = new zq(localzq1.d(), new zt(localzq1.h(), this.i));
          arrayOfzo[0] = new zo(this.g, this.i / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, this.i / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.i + (localzq1.i() - 2.0F * this.i) + this.i / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, this.i + (localzq1.i() - 2.0F * this.i) + this.i / 2.0F + this.h);
          this.a.a(localzs, (zq)localObject1);
          this.a.a(localzs, localzq2, 0.0F, 180.0F);
          this.a.a(localzs, arrayOfzo[0], arrayOfzo[3]);
          localzq2.b(this.i + (localzq1.i() - 2.0F * this.i + this.h));
          this.a.a(localzs, localzq2, 180.0F, -180.0F);
          this.a.a(localzs, arrayOfzo[2], arrayOfzo[1]);
          break;
        case 2: 
        case 3: 
          localzq3 = new zq(f1, f2 + f4 - this.i, f3, this.i);
          localObject2 = new zq(f1, f2 + f4 - this.i, f3, this.i);
          arrayOfzo[0] = new zo(this.g, f4 - this.i / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, f4 - this.i / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.i / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, this.i / 2.0F + this.h);
          this.a.a(localzs, localzq3);
          this.a.a(localzs, (zq)localObject2, 0.0F, -180.0F);
          this.a.a(localzs, arrayOfzo[0], arrayOfzo[3]);
          ((zq)localObject2).b(this.h);
          this.a.a(localzs, (zq)localObject2, 180.0F, 180.0F);
          this.a.a(localzs, arrayOfzo[2], arrayOfzo[1]);
        }
      }
    }
    b();
    this.a.a(localzf);
  }
  
  void b()
    throws Exception
  {
    this.a.c();
    zq localzq = this.e.l();
    if (!this.e.n().a()) {
      localzq.a(-(this.e.n().f() / 2.0F), -(this.e.n().f() / 2.0F));
    }
    float f1 = zbya.a(this.e.o().h());
    if ((this.e.q() == 7) || (this.e.q() == 9))
    {
      if ((int)this.e.d().a() == 0) {
        localzq.a(localzq.f() + f1);
      }
    }
    else if (((this.e.q() == 0) || (this.e.q() == 8)) && ((int)this.e.d().c() == 0)) {
      localzq.c(localzq.h() - f1);
    }
    localzq.a(localzq.f() + (float)this.e.d().a());
    localzq.b(localzq.g() + ((float)this.e.d().b() + this.i));
    localzq.c(localzq.h() - (float)this.e.d().c());
    localzq.d(localzq.i() - (float)this.e.d().d());
    int j = this.e.o().d();
    if (localzq.i() < j)
    {
      float f2 = (j - localzq.i()) / 2.0F;
      localzq = new zq(localzq.f(), localzq.g() - f2, localzq.h(), j);
    }
    if (this.e.u().equals("\n")) {
      return;
    }
    zbya.a(this.a, this.e, localzq, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */