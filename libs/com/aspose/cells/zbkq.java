package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbkq
  extends zcp
{
  private zq l = new zq();
  
  zbkq(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = (float)zbkt.a(zbkt.b(Math.atan(paramzq.i() / paramzq.h())));
    zo[] arrayOfzo = new zo[12];
    float f2 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f2 = Math.min(paramzq.h(), paramzq.i()) * 0.24153F;
      }
    }
    else {
      f2 = Math.min(paramzq.h(), paramzq.i()) * 0.24153F;
    }
    if (f2 <= 0.0F)
    {
      arrayOfzo[0] = new zo(0.24F * paramzq.h() + this.g, 0.24F * paramzq.i() + this.h);
      arrayOfzo[1] = new zo(paramzq.h() * 0.76F + this.g, paramzq.i() * 0.24F + this.h);
      arrayOfzo[2] = new zo(0.76F * paramzq.h() + this.g, paramzq.i() * 0.76F + this.h);
      arrayOfzo[3] = new zo(0.24F * paramzq.h() + this.g, paramzq.i() * 0.76F + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[2]);
      localze.k();
      localze.a(arrayOfzo[1], arrayOfzo[3]);
      localze.k();
      return localze;
    }
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    f5 = f2 / 2.0F;
    f3 = (float)(f5 * Math.sin(f1));
    f4 = (float)(f5 * Math.cos(f1));
    float f6 = 0.24F * paramzq.h();
    float f7 = 0.24F * paramzq.i();
    float f8 = f5 / (float)Math.cos(f1);
    float f9 = f5 / (float)Math.sin(f1);
    arrayOfzo[0] = new zo(this.g + f3 + f6, this.h + f7 - f4);
    arrayOfzo[1] = new zo(this.g + paramzq.h() / 2.0F, this.h + paramzq.i() / 2.0F - f8);
    arrayOfzo[2] = new zo(this.g + paramzq.h() / 2.0F + f6 - f3, this.h + f7 - f4);
    arrayOfzo[3] = new zo(this.g + paramzq.h() / 2.0F + f6 + f3, this.h + f7 + f4);
    arrayOfzo[4] = new zo(this.g + paramzq.h() / 2.0F + f9, this.h + paramzq.i() / 2.0F);
    arrayOfzo[5] = new zo(this.g + paramzq.h() / 2.0F + f6 + f3, this.h + paramzq.i() - (f7 + f4));
    arrayOfzo[6] = new zo(this.g + paramzq.h() / 2.0F + f6 - f3, this.h + paramzq.i() - (f7 - f4));
    arrayOfzo[7] = new zo(this.g + paramzq.h() / 2.0F, this.h + paramzq.i() / 2.0F + f8);
    arrayOfzo[8] = new zo(this.g + f6 + f3, this.h + paramzq.i() - (f7 - f4));
    arrayOfzo[9] = new zo(this.g + f6 - f3, this.h + paramzq.i() - (f7 + f4));
    arrayOfzo[10] = new zo(this.g + paramzq.h() / 2.0F - f9, this.h + paramzq.i() / 2.0F);
    arrayOfzo[11] = new zo(this.g + f6 - f3, this.h + f7 + f4);
    localze.a(arrayOfzo[0], arrayOfzo[1]);
    localze.a(arrayOfzo[1], arrayOfzo[2]);
    localze.a(arrayOfzo[2], arrayOfzo[3]);
    localze.a(arrayOfzo[3], arrayOfzo[4]);
    localze.a(arrayOfzo[4], arrayOfzo[5]);
    localze.a(arrayOfzo[5], arrayOfzo[6]);
    localze.a(arrayOfzo[6], arrayOfzo[7]);
    localze.a(arrayOfzo[7], arrayOfzo[8]);
    localze.a(arrayOfzo[8], arrayOfzo[9]);
    localze.a(arrayOfzo[9], arrayOfzo[10]);
    localze.a(arrayOfzo[10], arrayOfzo[11]);
    localze.a(arrayOfzo[11], arrayOfzo[0]);
    localze.j();
    this.l = new zq(arrayOfzo[11].d(), arrayOfzo[11].e() * 0.7F, arrayOfzo[3].d() - arrayOfzo[11].d(), arrayOfzo[9].e() - arrayOfzo[11].e());
    return localze;
  }
  
  zq b(zq paramzq)
  {
    return this.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */