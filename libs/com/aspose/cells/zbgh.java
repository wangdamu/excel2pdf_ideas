package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

class zbgh
  extends zcp
{
  zbgh(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.b(localzq1);
    zc localzc = zbyb.a(this.e.z(), localze1);
    zs localzs = zbyb.a(this.e.A());
    float f5 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = Math.min(localzq1.h(), localzq1.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f5 = localzq1.i() * 0.17F;
      }
    }
    else {
      f5 = localzq1.i() * 0.17F;
    }
    zo[] arrayOfzo = new zo[4];
    zq localzq3;
    Object localObject;
    zq localzq4;
    zq localzq5;
    if (!this.e.z().a()) {
      if (f5 == 0.0F) {
        this.a.b(localzc, localzq1);
      } else {
        switch (this.e.c)
        {
        case 1: 
        case 4: 
          localzq2 = new zq(localzq1.d(), new zt(localzq1.h(), f5));
          localzq3 = new zq(localzq1.d(), new zt(localzq1.h(), f5));
          arrayOfzo[0] = new zo(this.g, f5 / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, f5 / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, f5 + (localzq1.i() - 2.0F * f5) + f5 / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, f5 + (localzq1.i() - 2.0F * f5) + f5 / 2.0F + this.h);
          this.a.a(localzc, localzq2);
          localObject = new com.aspose.cells.b.a.b.a.ze();
          ((com.aspose.cells.b.a.b.a.ze)localObject).a(localzq3, 0.0F, 180.0F);
          ((com.aspose.cells.b.a.b.a.ze)localObject).a(arrayOfzo[0], arrayOfzo[3]);
          localzq3.b(f5 + (localzq1.i() - 2.0F * f5 + this.h));
          ((com.aspose.cells.b.a.b.a.ze)localObject).a(localzq3, 180.0F, -180.0F);
          ((com.aspose.cells.b.a.b.a.ze)localObject).a(arrayOfzo[2], arrayOfzo[1]);
          ((com.aspose.cells.b.a.b.a.ze)localObject).j();
          this.a.a(localzc, (com.aspose.cells.b.a.b.a.ze)localObject);
          break;
        case 2: 
        case 3: 
          localzq4 = new zq(f1, f2 + f4 - f5, f3, f5);
          localzq5 = new zq(f1, f2 + f4 - f5, f3, f5);
          arrayOfzo[0] = new zo(this.g, f4 - f5 / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, f4 - f5 / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, f5 / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, f5 / 2.0F + this.h);
          this.a.a(localzc, localzq4);
          com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
          localze2.a(localzq5, 0.0F, -180.0F);
          localze2.a(arrayOfzo[0], arrayOfzo[3]);
          localzq5.b(this.h);
          localze2.a(localzq5, 180.0F, 180.0F);
          localze2.a(arrayOfzo[2], arrayOfzo[1]);
          localze2.j();
          this.a.a(localzc, localze2);
        }
      }
    }
    zq localzq2 = new zq();
    if (!this.e.A().a()) {
      if (f5 == 0.0F) {
        this.a.a(localzs, (int)f1, (int)f2, (int)f3, (int)f4);
      } else {
        switch (this.e.c)
        {
        case 1: 
        case 4: 
          localzq3 = new zq(localzq1.d(), new zt(localzq1.h(), f5));
          localObject = new zq(localzq1.d(), new zt(localzq1.h(), f5));
          arrayOfzo[0] = new zo(this.g, f5 / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, f5 / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, f5 + (localzq1.i() - 2.0F * f5) + f5 / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, f5 + (localzq1.i() - 2.0F * f5) + f5 / 2.0F + this.h);
          this.a.a(localzs, localzq3);
          this.a.a(localzs, (zq)localObject, 0.0F, 180.0F);
          this.a.a(localzs, arrayOfzo[0], arrayOfzo[3]);
          ((zq)localObject).b(f5 + (localzq1.i() - 2.0F * f5 + this.h));
          this.a.a(localzs, (zq)localObject, 180.0F, -180.0F);
          this.a.a(localzs, arrayOfzo[2], arrayOfzo[1]);
          localzq2 = new zq(arrayOfzo[0].d(), arrayOfzo[0].e() + f5 / 2.0F, localzq1.h(), localzq1.i() - 1.0F * f5);
          break;
        case 2: 
        case 3: 
          localzq4 = new zq(f1, f2 + f4 - f5, f3, f5);
          localzq5 = new zq(f1, f2 + f4 - f5, f3, f5);
          arrayOfzo[0] = new zo(this.g, f4 - f5 / 2.0F + this.h);
          arrayOfzo[1] = new zo(localzq1.h() + this.g, f4 - f5 / 2.0F + this.h);
          arrayOfzo[2] = new zo(localzq1.h() + this.g, f5 / 2.0F + this.h);
          arrayOfzo[3] = new zo(this.g, f5 / 2.0F + this.h);
          this.a.a(localzs, localzq4);
          this.a.a(localzs, localzq5, 0.0F, -180.0F);
          this.a.a(localzs, arrayOfzo[0], arrayOfzo[3]);
          localzq5.b(this.h);
          this.a.a(localzs, localzq5, 180.0F, 180.0F);
          this.a.a(localzs, arrayOfzo[2], arrayOfzo[1]);
          localzq2 = new zq(arrayOfzo[0].d(), arrayOfzo[2].e(), localzq1.h(), localzq1.i() - 1.0F * f5);
        }
      }
    }
    super.c(localzq2);
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */