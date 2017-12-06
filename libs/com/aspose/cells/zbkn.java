package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbkn
  extends zcp
{
  zbkn(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 1.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = Math.min(this.e.s(), this.e.t()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        f2 = Math.min(this.e.s(), this.e.t()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F * f4;
        f3 = Math.min(this.e.s(), this.e.t()) * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
      }
      else
      {
        f1 = Math.min(this.e.s(), this.e.t()) * 23520.0F / 100000.0F;
        f2 = Math.min(this.e.s(), this.e.t()) * 2930.0F / 100000.0F;
        f3 = Math.min(this.e.s(), this.e.t()) * 11760.0F / 100000.0F;
      }
    }
    else
    {
      f1 = Math.min(this.e.s(), this.e.t()) * 23520.0F / 100000.0F;
      f2 = Math.min(this.e.s(), this.e.t()) * 2930.0F / 100000.0F;
      f3 = Math.min(this.e.s(), this.e.t()) * 11760.0F / 100000.0F;
    }
    float f5 = 2.0F * f3;
    float f6 = f1;
    float f7 = f2;
    float f8 = f3;
    zq localzq = new zq(this.g + 0.135F * this.e.y().h(), this.h + (this.e.y().i() - f6) / 2.0F, 0.73F * this.e.y().h(), f6);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze);
    zs localzs = zbyb.a(this.e.A());
    this.a.b(localzc, localzq);
    this.a.c(localzs, this.g + 0.135F * this.e.y().h(), this.h + (this.e.y().i() - f6) / 2.0F, 0.73F * this.e.y().h(), f6);
    this.a.a(localzc, this.g + this.e.y().h() / 2.0F - f8, this.h + (this.e.y().i() - (f6 + f5 * 2.0F + f7 * 2.0F)) / 2.0F, f5, f5);
    this.a.a(localzs, this.g + this.e.y().h() / 2.0F - f8, this.h + (this.e.y().i() - (f6 + f5 * 2.0F + f7 * 2.0F)) / 2.0F, f5, f5);
    this.a.a(localzc, this.g + this.e.y().h() / 2.0F - f8, this.h + this.e.y().i() - f5 - (this.e.y().i() - (f6 + f5 * 2.0F + f7 * 2.0F)) / 2.0F, f5, f5);
    this.a.a(localzs, this.g + this.e.y().h() / 2.0F - f8, this.h + this.e.y().i() - f5 - (this.e.y().i() - (f6 + f5 * 2.0F + f7 * 2.0F)) / 2.0F, f5, f5);
    super.c(localzq);
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbkn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */