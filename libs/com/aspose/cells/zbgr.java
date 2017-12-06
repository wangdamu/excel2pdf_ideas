package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbgr
  extends zcp
{
  zbgr(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq1 = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zc localzc = zbyb.a(this.e.z(), localzq1);
    zs localzs = zbyb.a(this.e.A());
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[7];
    float f5 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = localzq1.i() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f5 = localzq1.i() * 0.24F;
      }
    }
    else {
      f5 = localzq1.i() * 0.24F;
    }
    Object localObject2;
    com.aspose.cells.b.a.b.a.ze localze2;
    Object localObject3;
    com.aspose.cells.b.a.b.a.ze localze3;
    if (!this.e.z().a()) {
      if (f5 == 0.0F) {
        this.a.b(localzc, localzq1);
      } else {
        switch (this.e.c)
        {
        case 1: 
          arrayOfzo[0] = new zo(this.g, f5 + this.h);
          arrayOfzo[1] = new zo(f5 + this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq1.h() - f5 + this.g, f5 + this.h);
          arrayOfzo[4] = new zo(localzq1.h() + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[5] = new zo(localzq1.h() - f5 + this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq1.i() + this.h);
          localObject1 = new com.aspose.cells.b.a.b.a.ze();
          localObject2 = new zq(f1, f2, f3, f5);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[0], arrayOfzo[1]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[1], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[2], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo[3], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject1).j();
          this.a.a(zbyb.a(this.e.z(), (zq)localObject2, 1.0F, 20.0F), (com.aspose.cells.b.a.b.a.ze)localObject1);
          localze2 = new com.aspose.cells.b.a.b.a.ze();
          localObject3 = new zq(f1, f2 + f5, f3, f4 - f5);
          localze2.a(arrayOfzo[0], arrayOfzo[3]);
          localze2.a(arrayOfzo[3], arrayOfzo[5]);
          localze2.a(arrayOfzo[5], arrayOfzo[6]);
          localze2.a(arrayOfzo[6], arrayOfzo[0]);
          localze2.j();
          this.a.a(localzc, localze2);
          localze3 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq2 = new zq(f1 + f3 - f5, f2, f5, f4);
          localze3.a(arrayOfzo[3], arrayOfzo[2]);
          localze3.a(arrayOfzo[2], arrayOfzo[4]);
          localze3.a(arrayOfzo[4], arrayOfzo[5]);
          localze3.a(arrayOfzo[5], arrayOfzo[3]);
          localze3.j();
          this.a.a(zbyb.a(this.e.z(), localzq2, 0.8F, 0.0F), localze3);
          break;
        case 2: 
          arrayOfzo[0] = new zo(this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[1] = new zo(this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() - f5 + this.g, this.h);
          arrayOfzo[3] = new zo(localzq1.h() - f5 + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[4] = new zo(localzq1.h() + this.g, f5 + this.h);
          arrayOfzo[5] = new zo(localzq1.h() + this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(f5 + this.g, localzq1.i() + this.h);
          com.aspose.cells.b.a.b.a.ze localze4 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq3 = new zq(f1, f2, f3, f5);
          localze4.a(arrayOfzo[0], arrayOfzo[1]);
          localze4.a(arrayOfzo[1], arrayOfzo[2]);
          localze4.a(arrayOfzo[2], arrayOfzo[3]);
          localze4.a(arrayOfzo[3], arrayOfzo[0]);
          localze4.j();
          this.a.a(localzc, localze4);
          com.aspose.cells.b.a.b.a.ze localze5 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq4 = new zq(f1, f2 + f5, f3, f4 - f5);
          localze5.a(arrayOfzo[3], arrayOfzo[2]);
          localze5.a(arrayOfzo[2], arrayOfzo[4]);
          localze5.a(arrayOfzo[4], arrayOfzo[5]);
          localze5.a(arrayOfzo[5], arrayOfzo[3]);
          localze5.j();
          this.a.a(zbyb.a(this.e.z(), localzq4, 0.8F, 0.0F), localze5);
          com.aspose.cells.b.a.b.a.ze localze6 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq5 = new zq(f1 + f3 - f5, f2, f5, f4);
          localze6.a(arrayOfzo[0], arrayOfzo[3]);
          localze6.a(arrayOfzo[3], arrayOfzo[5]);
          localze6.a(arrayOfzo[5], arrayOfzo[6]);
          localze6.a(arrayOfzo[6], arrayOfzo[0]);
          localze6.j();
          this.a.a(zbyb.a(this.e.z(), localzq5, 1.0F, 20.0F), localze6);
          break;
        case 3: 
          arrayOfzo[0] = new zo(this.g, f5 + this.h);
          arrayOfzo[1] = new zo(f5 + this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq1.h() + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[4] = new zo(f5 + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[5] = new zo(this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(localzq1.h() - f5 + this.g, localzq1.i() + this.h);
          com.aspose.cells.b.a.b.a.ze localze7 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq6 = new zq(f1, f2, f3, f5);
          localze7.a(arrayOfzo[1], arrayOfzo[2]);
          localze7.a(arrayOfzo[2], arrayOfzo[3]);
          localze7.a(arrayOfzo[3], arrayOfzo[4]);
          localze7.a(arrayOfzo[4], arrayOfzo[1]);
          localze7.j();
          this.a.a(localzc, localze7);
          com.aspose.cells.b.a.b.a.ze localze8 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq7 = new zq(f1, f2, f3, f5);
          localze8.a(arrayOfzo[1], arrayOfzo[4]);
          localze8.a(arrayOfzo[4], arrayOfzo[5]);
          localze8.a(arrayOfzo[5], arrayOfzo[0]);
          localze8.a(arrayOfzo[0], arrayOfzo[1]);
          localze8.j();
          this.a.a(zbyb.a(this.e.z(), localzq7, 0.8F, 0.0F), localze8);
          com.aspose.cells.b.a.b.a.ze localze9 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq8 = new zq(f1, f2, f3, f5);
          localze9.a(arrayOfzo[4], arrayOfzo[5]);
          localze9.a(arrayOfzo[5], arrayOfzo[6]);
          localze9.a(arrayOfzo[6], arrayOfzo[3]);
          localze9.a(arrayOfzo[3], arrayOfzo[4]);
          localze9.j();
          this.a.a(zbyb.a(this.e.z(), localzq8, 1.0F, 20.0F), localze9);
          break;
        case 4: 
          arrayOfzo[0] = new zo(this.g, this.h);
          arrayOfzo[1] = new zo(localzq1.h() - f5 + this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, f5 + this.h);
          arrayOfzo[3] = new zo(f5 + this.g, f5 + this.h);
          arrayOfzo[4] = new zo(localzq1.h() + this.g, localzq1.i() + this.h);
          arrayOfzo[5] = new zo(f5 + this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq1.i() - f5 + this.h);
          com.aspose.cells.b.a.b.a.ze localze10 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq9 = new zq(f1, f2, f3, f5);
          localze10.a(arrayOfzo[0], arrayOfzo[1]);
          localze10.a(arrayOfzo[1], arrayOfzo[2]);
          localze10.a(arrayOfzo[2], arrayOfzo[3]);
          localze10.a(arrayOfzo[3], arrayOfzo[0]);
          localze10.j();
          this.a.a(zbyb.a(this.e.z(), localzq9, 1.0F, 20.0F), localze10);
          com.aspose.cells.b.a.b.a.ze localze11 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq10 = new zq(f1, f2, f3, f5);
          localze11.a(arrayOfzo[3], arrayOfzo[0]);
          localze11.a(arrayOfzo[0], arrayOfzo[6]);
          localze11.a(arrayOfzo[6], arrayOfzo[5]);
          localze11.a(arrayOfzo[5], arrayOfzo[3]);
          localze11.j();
          this.a.a(zbyb.a(this.e.z(), localzq10, 0.8F, 0.0F), localze11);
          com.aspose.cells.b.a.b.a.ze localze12 = new com.aspose.cells.b.a.b.a.ze();
          zq localzq11 = new zq(f1, f2, f3, f5);
          localze12.a(arrayOfzo[3], arrayOfzo[2]);
          localze12.a(arrayOfzo[2], arrayOfzo[4]);
          localze12.a(arrayOfzo[4], arrayOfzo[5]);
          localze12.a(arrayOfzo[5], arrayOfzo[3]);
          localze12.j();
          this.a.a(localzc, localze12);
        }
      }
    }
    Object localObject1 = new zq();
    if (!this.e.A().a()) {
      if (f5 == 0.0F) {
        this.a.a(localzs, (int)f1, (int)f2, (int)f3, (int)f4);
      } else {
        switch (this.e.c)
        {
        case 1: 
          localObject2 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, f5 + this.h);
          arrayOfzo[1] = new zo(f5 + this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq1.h() - f5 + this.g, f5 + this.h);
          arrayOfzo[4] = new zo(localzq1.h() + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[5] = new zo(localzq1.h() - f5 + this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq1.i() + this.h);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[0], arrayOfzo[1]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[1], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[2], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[3], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[0], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[3], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[5], arrayOfzo[6]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[6], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[3], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[2], arrayOfzo[4]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[4], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).a(arrayOfzo[5], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject2).j();
          this.a.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject2);
          localObject1 = new zq(arrayOfzo[0].d(), arrayOfzo[0].e(), localzq1.h() - f5, localzq1.i() - f5);
          break;
        case 2: 
          localze2 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[1] = new zo(this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() - f5 + this.g, this.h);
          arrayOfzo[3] = new zo(localzq1.h() - f5 + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[4] = new zo(localzq1.h() + this.g, f5 + this.h);
          arrayOfzo[5] = new zo(localzq1.h() + this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(f5 + this.g, localzq1.i() + this.h);
          localze2.a(arrayOfzo[0], arrayOfzo[1]);
          localze2.a(arrayOfzo[1], arrayOfzo[2]);
          localze2.a(arrayOfzo[2], arrayOfzo[3]);
          localze2.a(arrayOfzo[3], arrayOfzo[0]);
          localze2.a(arrayOfzo[3], arrayOfzo[2]);
          localze2.a(arrayOfzo[2], arrayOfzo[4]);
          localze2.a(arrayOfzo[4], arrayOfzo[5]);
          localze2.a(arrayOfzo[5], arrayOfzo[3]);
          localze2.a(arrayOfzo[0], arrayOfzo[3]);
          localze2.a(arrayOfzo[3], arrayOfzo[5]);
          localze2.a(arrayOfzo[5], arrayOfzo[6]);
          localze2.a(arrayOfzo[6], arrayOfzo[0]);
          localze2.j();
          this.a.a(localzs, localze2);
          localObject1 = new zq(arrayOfzo[1].d(), arrayOfzo[1].e(), localzq1.h() - f5, localzq1.i() - f5);
          break;
        case 3: 
          localObject3 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, f5 + this.h);
          arrayOfzo[1] = new zo(f5 + this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, this.h);
          arrayOfzo[3] = new zo(localzq1.h() + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[4] = new zo(f5 + this.g, localzq1.i() - f5 + this.h);
          arrayOfzo[5] = new zo(this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(localzq1.h() - f5 + this.g, localzq1.i() + this.h);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[1], arrayOfzo[2]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[2], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[3], arrayOfzo[4]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[4], arrayOfzo[1]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[1], arrayOfzo[4]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[4], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[5], arrayOfzo[0]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[0], arrayOfzo[1]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[4], arrayOfzo[5]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[5], arrayOfzo[6]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[6], arrayOfzo[3]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).a(arrayOfzo[3], arrayOfzo[4]);
          ((com.aspose.cells.b.a.b.a.ze)localObject3).j();
          this.a.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject3);
          localObject1 = new zq(arrayOfzo[1].d(), arrayOfzo[1].e(), localzq1.h() - f5, localzq1.i() - f5);
          break;
        case 4: 
          localze3 = new com.aspose.cells.b.a.b.a.ze();
          arrayOfzo[0] = new zo(this.g, this.h);
          arrayOfzo[1] = new zo(localzq1.h() - f5 + this.g, this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, f5 + this.h);
          arrayOfzo[3] = new zo(f5 + this.g, f5 + this.h);
          arrayOfzo[4] = new zo(localzq1.h() + this.g, localzq1.i() + this.h);
          arrayOfzo[5] = new zo(f5 + this.g, localzq1.i() + this.h);
          arrayOfzo[6] = new zo(this.g, localzq1.i() - f5 + this.h);
          localze3.a(arrayOfzo[0], arrayOfzo[1]);
          localze3.a(arrayOfzo[1], arrayOfzo[2]);
          localze3.a(arrayOfzo[2], arrayOfzo[3]);
          localze3.a(arrayOfzo[3], arrayOfzo[0]);
          localze3.a(arrayOfzo[3], arrayOfzo[0]);
          localze3.a(arrayOfzo[0], arrayOfzo[6]);
          localze3.a(arrayOfzo[6], arrayOfzo[5]);
          localze3.a(arrayOfzo[5], arrayOfzo[3]);
          localze3.a(arrayOfzo[3], arrayOfzo[2]);
          localze3.a(arrayOfzo[2], arrayOfzo[4]);
          localze3.a(arrayOfzo[4], arrayOfzo[5]);
          localze3.a(arrayOfzo[5], arrayOfzo[3]);
          localze3.j();
          this.a.a(localzs, localze3);
          localObject1 = new zq(arrayOfzo[3].d(), arrayOfzo[3].e(), localzq1.h() - f5, localzq1.i() - f5);
        }
      }
    }
    super.c((zq)localObject1);
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */