package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbko
  extends zcp
{
  private zq l = new zq();
  
  zbko(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[8];
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f1 = Math.min(paramzq.h(), paramzq.i()) * 0.24562F;
        f2 = Math.min(paramzq.h(), paramzq.i()) * 0.1176F;
      }
    }
    else
    {
      f1 = Math.min(paramzq.h(), paramzq.i()) * 0.24562F;
      f2 = Math.min(paramzq.h(), paramzq.i()) * 0.1176F;
    }
    if ((f1 <= 0.0F) && (f2 != 0.0F))
    {
      arrayOfzo[0] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - f2) / 2.0F + this.h);
      arrayOfzo[1] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - f2) / 2.0F + this.h);
      arrayOfzo[2] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - f2) / 2.0F + f2 + this.h);
      arrayOfzo[3] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - f2) / 2.0F + f2 + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.k();
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.k();
      return localze;
    }
    if ((f1 == 0.0F) && (f2 == 0.0F))
    {
      arrayOfzo[0] = new zo(0.135F * paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      arrayOfzo[1] = new zo(0.865F * paramzq.h() + this.g, paramzq.i() / 2.0F + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[0]);
      localze.j();
    }
    else
    {
      arrayOfzo[0] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + this.h);
      arrayOfzo[1] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + this.h);
      arrayOfzo[2] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + f1 + this.h);
      arrayOfzo[3] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + f1 + this.h);
      arrayOfzo[4] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + f1 + f2 + this.h);
      arrayOfzo[5] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + f1 + f2 + this.h);
      arrayOfzo[6] = new zo(0.865F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + f1 + f2 + f1 + this.h);
      arrayOfzo[7] = new zo(0.135F * paramzq.h() + this.g, (paramzq.i() - 2.0F * f1 - f2) / 2.0F + f1 + f2 + f1 + this.h);
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
      localze.a(arrayOfzo[2], arrayOfzo[3]);
      localze.a(arrayOfzo[3], arrayOfzo[0]);
      localze.j();
      localze.a(arrayOfzo[4], arrayOfzo[5]);
      localze.a(arrayOfzo[5], arrayOfzo[6]);
      localze.a(arrayOfzo[6], arrayOfzo[7]);
      localze.a(arrayOfzo[7], arrayOfzo[4]);
      localze.j();
    }
    this.l = new zq(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d() - arrayOfzo[0].d(), arrayOfzo[7].e() - arrayOfzo[0].e());
    return localze;
  }
  
  zq b(zq paramzq)
  {
    return this.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbko.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */