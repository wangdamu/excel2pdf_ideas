package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbip
  extends zcp
{
  zbip(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    float f5 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f5 = 0.17F;
      }
    }
    else {
      f5 = 0.17F;
    }
    zq localzq = new zq(f1, f2, f3, f4);
    zs localzs = zbyb.a(this.e.A());
    float f6 = f5 * (f3 > f4 ? f4 : f3);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zo[] arrayOfzo1 = new zo[5];
    zo[] arrayOfzo2 = new zo[3];
    zo localzo1;
    zo localzo2;
    zo localzo3;
    zo localzo4;
    zo localzo5;
    zo localzo6;
    switch (this.e.c)
    {
    case 1: 
      localzo1 = new zo(f1, f2);
      localzo2 = new zo(f1 + f3, f2);
      localzo3 = new zo(f1 + f3, f2 + f4 - f6);
      localzo4 = new zo(f1 + f3 - f6, f2 + f4);
      localzo5 = new zo(f1, f2 + f4);
      localzo6 = new zo(f1 + f3 - 0.8F * f6, f2 + f4 - 0.8F * f6);
      arrayOfzo1[0] = localzo1;
      arrayOfzo1[1] = localzo2;
      arrayOfzo1[2] = localzo3;
      arrayOfzo1[3] = localzo4;
      arrayOfzo1[4] = localzo5;
      arrayOfzo2[0] = localzo3;
      arrayOfzo2[1] = localzo4;
      arrayOfzo2[2] = localzo6;
      break;
    case 2: 
      localzo1 = new zo(f1, f2);
      localzo2 = new zo(f1 + f3 - f6, f2);
      localzo3 = new zo(f1 + f3, f2 + f6);
      localzo4 = new zo(f1 + f3, f2 + f4);
      localzo5 = new zo(f1, f2 + f4);
      localzo6 = new zo(f1 + f3 - 0.8F * f6, f2 + 0.8F * f6);
      arrayOfzo1[0] = localzo1;
      arrayOfzo1[1] = localzo2;
      arrayOfzo1[2] = localzo3;
      arrayOfzo1[3] = localzo4;
      arrayOfzo1[4] = localzo5;
      arrayOfzo2[0] = localzo2;
      arrayOfzo2[1] = localzo3;
      arrayOfzo2[2] = localzo6;
      break;
    case 3: 
      localzo1 = new zo(f1 + f6, f2);
      localzo2 = new zo(f1 + f3, f2);
      localzo3 = new zo(f1 + f3, f2 + f4);
      localzo4 = new zo(f1, f2 + f4);
      localzo5 = new zo(f1, f2 + f6);
      localzo6 = new zo(f1 + 0.8F * f6, f2 + 0.8F * f6);
      arrayOfzo1[0] = localzo1;
      arrayOfzo1[1] = localzo2;
      arrayOfzo1[2] = localzo3;
      arrayOfzo1[3] = localzo4;
      arrayOfzo1[4] = localzo5;
      arrayOfzo2[0] = localzo1;
      arrayOfzo2[1] = localzo5;
      arrayOfzo2[2] = localzo6;
      break;
    case 4: 
      localzo1 = new zo(f1, f2);
      localzo2 = new zo(f1 + f3, f2);
      localzo3 = new zo(f1 + f3, f2 + f4);
      localzo4 = new zo(f1 + f6, f2 + f4);
      localzo5 = new zo(f1, f2 + f4 - f6);
      localzo6 = new zo(f1 + 0.8F * f6, f2 + f4 - 0.8F * f6);
      arrayOfzo1[0] = localzo1;
      arrayOfzo1[1] = localzo2;
      arrayOfzo1[2] = localzo3;
      arrayOfzo1[3] = localzo4;
      arrayOfzo1[4] = localzo5;
      arrayOfzo2[0] = localzo4;
      arrayOfzo2[1] = localzo5;
      arrayOfzo2[2] = localzo6;
    }
    if (!this.e.z().a())
    {
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      localze.b(localzq);
      zc localzc = zbyb.a(this.e.z(), localze);
      this.a.a(localzc, arrayOfzo1);
      this.a.a(localzc, arrayOfzo2);
    }
    if (!this.e.A().a())
    {
      this.a.c(localzs, arrayOfzo1);
      this.a.c(localzs, arrayOfzo2);
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */