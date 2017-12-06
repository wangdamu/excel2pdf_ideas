package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import java.util.ArrayList;

class zbgq
  extends zco
{
  private float i = 0.0F;
  
  zbgq(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbya.a(this.e.n());
    zo[] arrayOfzo = new zo[7];
    if (this.e.l.a.size() > 0) {
      this.i = (localzq.i() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
    } else {
      this.i = (localzq.i() * 0.24F);
    }
    com.aspose.cells.b.a.b.a.ze localze1;
    Object localObject1;
    com.aspose.cells.b.a.b.a.ze localze2;
    Object localObject2;
    if (!this.e.m().a()) {
      if (this.i == 0.0F) {
        this.a.b(new zu(Color.getWhite()), localzq);
      } else {
        switch (this.e.a)
        {
        case 1: 
          arrayOfzo[0] = new zo(this.g, this.i + this.h);
          arrayOfzo[1] = new zo(this.i + this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq.h() - this.i + this.g, this.i + this.h);
          arrayOfzo[4] = new zo(localzq.h() + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[5] = new zo(localzq.h() - this.i + this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq.i() + this.h);
          localze1 = new com.aspose.cells.b.a.b.a.ze();
          localze1.a(arrayOfzo[0], arrayOfzo[1]);
          localze1.a(arrayOfzo[1], arrayOfzo[2]);
          localze1.a(arrayOfzo[2], arrayOfzo[3]);
          localze1.a(arrayOfzo[3], arrayOfzo[0]);
          localze1.j();
          localObject1 = zbya.a(this.e.m(), localze1, 1.0F, 20.0F);
          this.a.a((zc)localObject1, localze1);
          localze2 = new com.aspose.cells.b.a.b.a.ze();
          localze2.a(arrayOfzo[0], arrayOfzo[3]);
          localze2.a(arrayOfzo[3], arrayOfzo[5]);
          localze2.a(arrayOfzo[5], arrayOfzo[6]);
          localze2.a(arrayOfzo[6], arrayOfzo[0]);
          localze2.j();
          localObject2 = zbya.a(this.e.m(), localze2);
          this.a.a((zc)localObject2, localze2);
          com.aspose.cells.b.a.b.a.ze localze3 = new com.aspose.cells.b.a.b.a.ze();
          localze3.a(arrayOfzo[3], arrayOfzo[2]);
          localze3.a(arrayOfzo[2], arrayOfzo[4]);
          localze3.a(arrayOfzo[4], arrayOfzo[5]);
          localze3.a(arrayOfzo[5], arrayOfzo[3]);
          localze3.j();
          zc localzc1 = zbya.a(this.e.m(), localze3, 0.8F, 0.0F);
          this.a.a(localzc1, localze3);
          break;
        case 2: 
          arrayOfzo[0] = new zo(this.g, localzq.i() - this.i + this.h);
          arrayOfzo[1] = new zo(this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() - this.i + this.g, this.h);
          arrayOfzo[3] = new zo(localzq.h() - this.i + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[4] = new zo(localzq.h() + this.g, this.i + this.h);
          arrayOfzo[5] = new zo(localzq.h() + this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(this.i + this.g, localzq.i() + this.h);
          com.aspose.cells.b.a.b.a.ze localze4 = new com.aspose.cells.b.a.b.a.ze();
          localze4.a(arrayOfzo[0], arrayOfzo[1]);
          localze4.a(arrayOfzo[1], arrayOfzo[2]);
          localze4.a(arrayOfzo[2], arrayOfzo[3]);
          localze4.a(arrayOfzo[3], arrayOfzo[0]);
          localze4.j();
          zc localzc2 = zbya.a(this.e.m(), localze4);
          this.a.a(localzc2, localze4);
          com.aspose.cells.b.a.b.a.ze localze5 = new com.aspose.cells.b.a.b.a.ze();
          localze5.a(arrayOfzo[3], arrayOfzo[2]);
          localze5.a(arrayOfzo[2], arrayOfzo[4]);
          localze5.a(arrayOfzo[4], arrayOfzo[5]);
          localze5.a(arrayOfzo[5], arrayOfzo[3]);
          localze5.j();
          zc localzc3 = zbya.a(this.e.m(), localze5, 0.8F, 0.0F);
          this.a.a(localzc3, localze5);
          com.aspose.cells.b.a.b.a.ze localze6 = new com.aspose.cells.b.a.b.a.ze();
          localze6.a(arrayOfzo[0], arrayOfzo[3]);
          localze6.a(arrayOfzo[3], arrayOfzo[5]);
          localze6.a(arrayOfzo[5], arrayOfzo[6]);
          localze6.a(arrayOfzo[6], arrayOfzo[0]);
          localze6.j();
          zc localzc4 = zbya.a(this.e.m(), localze6, 1.0F, 20.0F);
          this.a.a(localzc4, localze6);
          break;
        case 3: 
          arrayOfzo[0] = new zo(this.g, this.i + this.h);
          arrayOfzo[1] = new zo(this.i + this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq.h() + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[4] = new zo(this.i + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[5] = new zo(this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(localzq.h() - this.i + this.g, localzq.i() + this.h);
          com.aspose.cells.b.a.b.a.ze localze7 = new com.aspose.cells.b.a.b.a.ze();
          localze7.a(arrayOfzo[1], arrayOfzo[2]);
          localze7.a(arrayOfzo[2], arrayOfzo[3]);
          localze7.a(arrayOfzo[3], arrayOfzo[4]);
          localze7.a(arrayOfzo[4], arrayOfzo[1]);
          localze7.j();
          zc localzc5 = zbya.a(this.e.m(), localze7);
          this.a.a(localzc5, localze7);
          com.aspose.cells.b.a.b.a.ze localze8 = new com.aspose.cells.b.a.b.a.ze();
          localze8.a(arrayOfzo[1], arrayOfzo[4]);
          localze8.a(arrayOfzo[4], arrayOfzo[5]);
          localze8.a(arrayOfzo[5], arrayOfzo[0]);
          localze8.a(arrayOfzo[0], arrayOfzo[1]);
          localze8.j();
          zc localzc6 = zbya.a(this.e.m(), localze8, 0.8F, 0.0F);
          this.a.a(localzc6, localze8);
          com.aspose.cells.b.a.b.a.ze localze9 = new com.aspose.cells.b.a.b.a.ze();
          localze9.a(arrayOfzo[4], arrayOfzo[5]);
          localze9.a(arrayOfzo[5], arrayOfzo[6]);
          localze9.a(arrayOfzo[6], arrayOfzo[3]);
          localze9.a(arrayOfzo[3], arrayOfzo[4]);
          localze9.j();
          zc localzc7 = zbya.a(this.e.m(), localze9, 1.0F, 20.0F);
          this.a.a(localzc7, localze9);
          break;
        case 4: 
          arrayOfzo[0] = new zo(this.g, this.h);
          arrayOfzo[1] = new zo(localzq.h() - this.i + this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() + this.g, this.i + this.h);
          arrayOfzo[3] = new zo(this.i + this.g, this.i + this.h);
          arrayOfzo[4] = new zo(localzq.h() + this.g, localzq.i() + this.h);
          arrayOfzo[5] = new zo(this.i + this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq.i() - this.i + this.h);
          com.aspose.cells.b.a.b.a.ze localze10 = new com.aspose.cells.b.a.b.a.ze();
          localze10.a(arrayOfzo[0], arrayOfzo[1]);
          localze10.a(arrayOfzo[1], arrayOfzo[2]);
          localze10.a(arrayOfzo[2], arrayOfzo[3]);
          localze10.a(arrayOfzo[3], arrayOfzo[0]);
          localze10.j();
          zc localzc8 = zbya.a(this.e.m(), localze10, 1.0F, 20.0F);
          this.a.a(localzc8, localze10);
          com.aspose.cells.b.a.b.a.ze localze11 = new com.aspose.cells.b.a.b.a.ze();
          localze11.a(arrayOfzo[3], arrayOfzo[0]);
          localze11.a(arrayOfzo[0], arrayOfzo[6]);
          localze11.a(arrayOfzo[6], arrayOfzo[5]);
          localze11.a(arrayOfzo[5], arrayOfzo[3]);
          localze11.j();
          zc localzc9 = zbya.a(this.e.m(), localze11, 0.8F, 0.0F);
          this.a.a(localzc9, localze11);
          com.aspose.cells.b.a.b.a.ze localze12 = new com.aspose.cells.b.a.b.a.ze();
          localze12.a(arrayOfzo[3], arrayOfzo[2]);
          localze12.a(arrayOfzo[2], arrayOfzo[4]);
          localze12.a(arrayOfzo[4], arrayOfzo[5]);
          localze12.a(arrayOfzo[5], arrayOfzo[3]);
          localze12.j();
          zc localzc10 = zbya.a(this.e.m(), localze12);
          this.a.a(localzc10, localze12);
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
          localze1 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, this.i + this.h);
          arrayOfzo[1] = new zo(this.i + this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq.h() - this.i + this.g, this.i + this.h);
          arrayOfzo[4] = new zo(localzq.h() + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[5] = new zo(localzq.h() - this.i + this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq.i() + this.h);
          localze1.a(arrayOfzo[0], arrayOfzo[1]);
          localze1.a(arrayOfzo[1], arrayOfzo[2]);
          localze1.a(arrayOfzo[2], arrayOfzo[3]);
          localze1.a(arrayOfzo[3], arrayOfzo[0]);
          localze1.a(arrayOfzo[0], arrayOfzo[3]);
          localze1.a(arrayOfzo[3], arrayOfzo[5]);
          localze1.a(arrayOfzo[5], arrayOfzo[6]);
          localze1.a(arrayOfzo[6], arrayOfzo[0]);
          localze1.a(arrayOfzo[3], arrayOfzo[2]);
          localze1.a(arrayOfzo[2], arrayOfzo[4]);
          localze1.a(arrayOfzo[4], arrayOfzo[5]);
          localze1.a(arrayOfzo[5], arrayOfzo[3]);
          localze1.j();
          this.a.a(localzs, localze1);
          break;
        case 2: 
          localObject1 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, localzq.i() - this.i + this.h);
          arrayOfzo[1] = new zo(this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() - this.i + this.g, this.h);
          arrayOfzo[3] = new zo(localzq.h() - this.i + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[4] = new zo(localzq.h() + this.g, this.i + this.h);
          arrayOfzo[5] = new zo(localzq.h() + this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(this.i + this.g, localzq.i() + this.h);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[0], arrayOfzo[1]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[1], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[2], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[3], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[3], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[2], arrayOfzo[4]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[4], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[5], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[0], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[3], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[5], arrayOfzo[6]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[6], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).j();
          this.a.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject1);
          break;
        case 3: 
          localze2 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, this.i + this.h);
          arrayOfzo[1] = new zo(this.i + this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq.h() + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[4] = new zo(this.i + this.g, localzq.i() - this.i + this.h);
          arrayOfzo[5] = new zo(this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(localzq.h() - this.i + this.g, localzq.i() + this.h);
          localze2.a(arrayOfzo[1], arrayOfzo[2]);
          localze2.a(arrayOfzo[2], arrayOfzo[3]);
          localze2.a(arrayOfzo[3], arrayOfzo[4]);
          localze2.a(arrayOfzo[4], arrayOfzo[1]);
          localze2.a(arrayOfzo[1], arrayOfzo[4]);
          localze2.a(arrayOfzo[4], arrayOfzo[5]);
          localze2.a(arrayOfzo[5], arrayOfzo[0]);
          localze2.a(arrayOfzo[0], arrayOfzo[1]);
          localze2.a(arrayOfzo[4], arrayOfzo[5]);
          localze2.a(arrayOfzo[5], arrayOfzo[6]);
          localze2.a(arrayOfzo[6], arrayOfzo[3]);
          localze2.a(arrayOfzo[3], arrayOfzo[4]);
          localze2.j();
          this.a.a(localzs, localze2);
          break;
        case 4: 
          localObject2 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, this.h);
          arrayOfzo[1] = new zo(localzq.h() - this.i + this.g, this.h);
          arrayOfzo[2] = new zo(localzq.h() + this.g, this.i + this.h);
          arrayOfzo[3] = new zo(this.i + this.g, this.i + this.h);
          arrayOfzo[4] = new zo(localzq.h() + this.g, localzq.i() + this.h);
          arrayOfzo[5] = new zo(this.i + this.g, localzq.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq.i() - this.i + this.h);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[0], arrayOfzo[1]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[1], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[2], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[3], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[3], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[0], arrayOfzo[6]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[6], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[5], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[3], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[2], arrayOfzo[4]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[4], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[5], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).j();
          this.a.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject2);
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
    localzq.c(localzq.h() - this.i);
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
    localzq.b(localzq.g() + (float)this.e.d().b() + this.i);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */