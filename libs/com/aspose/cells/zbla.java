package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbla
  extends zcp
{
  private zq l = new zq();
  
  zbla(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = this.e.t() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 60000.0F;
        f3 = this.e.t() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
      }
      else
      {
        f1 = this.e.t() * 23520.0F / 100000.0F;
        f2 = 110.0F;
        f3 = this.e.t() * 11759.0F / 100000.0F;
      }
    }
    else
    {
      f1 = this.e.t() * 23520.0F / 100000.0F;
      f2 = 110.0F;
      f3 = this.e.t() * 11759.0F / 100000.0F;
    }
    float f4 = 0.0F;
    if (f2 < 90.0F) {
      f4 = (float)zbkt.a(f2);
    } else {
      f4 = (float)zbkt.a(180.0F - f2);
    }
    float f5 = 0.135F * paramzq.h();
    float f6 = paramzq.h() - f5;
    float f7 = (paramzq.i() - f1 * 2.0F - f3) / 2.0F;
    float f8 = paramzq.i() - f7;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = f1;
    f9 = (float)(f11 * Math.cos(f4));
    f10 = (float)(f11 * Math.sin(f4));
    float f12 = 0.0F;
    float f13 = 0.0F;
    f13 = f7 - f9;
    f12 = (float)(f13 / Math.tan(f4));
    float f14 = 0.0F;
    float f15 = 0.0F;
    f14 = paramzq.i() - f7;
    f15 = (float)(f14 / Math.tan(f4));
    float f16 = (paramzq.h() - f10 - f15) / 2.0F;
    float f17 = 0.0F;
    float f18 = 0.0F;
    float f19 = 0.0F;
    float f20 = 0.0F;
    float f21 = 0.0F;
    float f22 = 0.0F;
    float f23 = 0.0F;
    float f24 = 0.0F;
    float f25 = 0.0F;
    if (f2 < 90.0F)
    {
      f17 = paramzq.h() - f16 - (f1 * 2.0F + f3 + f13) / (float)Math.tan(f4);
      f18 = paramzq.h() - f16 - (f13 + f1 + f3) / (float)Math.tan(f4);
      f19 = paramzq.h() - f16 - (f13 + f1) / (float)Math.tan(f4);
      f20 = paramzq.h() - f16 - f13 / (float)Math.tan(f4);
      f21 = paramzq.h() - f16;
      f25 = (f13 + 2.0F * f1 + f3) / (float)Math.tan(f4) + f16;
      f22 = (f13 + f1 * 2.0F + f3) / (float)Math.tan(f4) + f16;
      f23 = (f13 + f1 + f3) / (float)Math.tan(f4) + f16;
      f24 = (f13 + f1) / (float)Math.tan(f4) + f16;
    }
    else
    {
      f17 = paramzq.h() - f16 - f12;
      f18 = paramzq.h() - f16 - (f13 + f1) / (float)Math.tan(f4);
      f19 = paramzq.h() - f16 - (f13 + f1 + f3) / (float)Math.tan(f4);
      f20 = paramzq.h() - f16 - (f13 + f1 * 2.0F + f3) / (float)Math.tan(f4);
      f21 = paramzq.h() - f16 - (f13 + f1 * 2.0F + f3 + f7) / (float)Math.tan(f4);
      f22 = (f13 + f1 * 2.0F + f3) / (float)Math.tan(f4) + f16;
      f23 = (f13 + f1) / (float)Math.tan(f4) + f16;
      f24 = (f13 + f1 + f3) / (float)Math.tan(f4) + f16;
    }
    zo[] arrayOfzo = new zo[20];
    if (f1 > 0.0F)
    {
      if (f2 < 90.0F)
      {
        arrayOfzo[0] = new zo(this.g + f5, this.h + f7);
        arrayOfzo[1] = new zo(this.g + f16 + f12, this.h + f7);
        arrayOfzo[2] = new zo(this.g + f16, this.h + f9);
        arrayOfzo[3] = new zo(this.g + f16 + f10, this.h);
        arrayOfzo[4] = new zo(this.g + f17 + f12, this.h + f7);
        arrayOfzo[5] = new zo(this.g + f6, this.h + f7);
        arrayOfzo[6] = new zo(this.g + f6, this.h + f7 + f1);
        arrayOfzo[7] = new zo(this.g + f18 + f12, this.h + f7 + f1);
        arrayOfzo[8] = new zo(this.g + f19 + f12, this.h + f7 + f1 + f3);
        arrayOfzo[9] = new zo(this.g + f6, this.h + f7 + f1 + f3);
        arrayOfzo[10] = new zo(this.g + f6, this.h + f7 + 2.0F * f1 + f3);
        arrayOfzo[11] = new zo(this.g + f20 + f12, this.h + f7 + 2.0F * f1 + f3);
        arrayOfzo[12] = new zo(this.g + f21 + f12, this.h + paramzq.i() - f9);
        arrayOfzo[13] = new zo(this.g + paramzq.h() - f16 - f10 + f12, this.h + paramzq.i());
        arrayOfzo[14] = new zo(this.g + f25, this.h + f8);
        arrayOfzo[15] = new zo(this.g + f5, this.h + f8);
        arrayOfzo[16] = new zo(this.g + f5, this.h + f7 + f1 + f3);
        arrayOfzo[17] = new zo(this.g + f23, this.h + f7 + f1 + f3);
        arrayOfzo[18] = new zo(this.g + f24, this.h + f7 + f1);
        arrayOfzo[19] = new zo(this.g + f5, this.h + f7 + f1);
      }
      else
      {
        arrayOfzo[0] = new zo(this.g + f5, this.h + f7);
        arrayOfzo[1] = new zo(this.g + f22 - f12, this.h + f7);
        arrayOfzo[2] = new zo(this.g + f16 + f15, this.h);
        arrayOfzo[3] = new zo(this.g + f16 + f15 + f10, this.h + f9);
        arrayOfzo[4] = new zo(this.g + f17, this.h + f7);
        arrayOfzo[5] = new zo(this.g + f6, this.h + f7);
        arrayOfzo[6] = new zo(this.g + f6, this.h + f7 + f1);
        arrayOfzo[7] = new zo(this.g + f18, this.h + f7 + f1);
        arrayOfzo[8] = new zo(this.g + f19, this.h + f7 + f1 + f3);
        arrayOfzo[9] = new zo(this.g + f6, this.h + f7 + f1 + f3);
        arrayOfzo[10] = new zo(this.g + f6, this.h + f7 + 2.0F * f1 + f3);
        arrayOfzo[11] = new zo(this.g + f20, this.h + f7 + 2.0F * f1 + f3);
        arrayOfzo[12] = new zo(this.g + f21, this.h + paramzq.i());
        arrayOfzo[13] = new zo(this.g + f16 - f12, this.h + paramzq.i() - f9);
        arrayOfzo[14] = new zo(this.g + f16, this.h + f8);
        arrayOfzo[15] = new zo(this.g + f5, this.h + f8);
        arrayOfzo[16] = new zo(this.g + f5, this.h + f7 + f1 + f3);
        arrayOfzo[17] = new zo(this.g + f23 - f12, this.h + f7 + f1 + f3);
        arrayOfzo[18] = new zo(this.g + f24 - f12, this.h + f7 + f1);
        arrayOfzo[19] = new zo(this.g + f5, this.h + f7 + f1);
      }
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
      localze.a(arrayOfzo[11], arrayOfzo[12]);
      localze.a(arrayOfzo[12], arrayOfzo[13]);
      localze.a(arrayOfzo[13], arrayOfzo[14]);
      localze.a(arrayOfzo[15], arrayOfzo[16]);
      localze.a(arrayOfzo[16], arrayOfzo[17]);
      localze.a(arrayOfzo[17], arrayOfzo[18]);
      localze.a(arrayOfzo[18], arrayOfzo[19]);
      localze.a(arrayOfzo[19], arrayOfzo[0]);
      localze.j();
    }
    this.l = new zq(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[5].d() - arrayOfzo[0].d(), arrayOfzo[15].e() - arrayOfzo[0].e());
    return localze;
  }
  
  zq b(zq paramzq)
  {
    return this.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */