package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbih
  extends zcp
{
  zbih(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
  
  void b()
    throws Exception
  {
    long l1 = 0L;
    long l2 = 0L;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        l1 = com.aspose.cells.b.a.ze.c(this.e.n.a.get(0));
        l2 = com.aspose.cells.b.a.ze.c(this.e.n.a.get(1));
      }
      else
      {
        l1 = -20833L;
        l2 = 62500L;
      }
      float f1 = this.e.s() / 2.0F + this.e.s() * Math.abs((float)l1 / 100000.0F);
      f2 = this.e.t() / 2.0F + this.e.t() * Math.abs((float)l2 / 100000.0F);
      if ((f1 <= this.e.s()) && (f2 <= this.e.t()))
      {
        Object localObject1;
        if (!this.e.z().a())
        {
          localObject1 = new com.aspose.cells.b.a.b.a.ze();
          ((com.aspose.cells.b.a.b.a.ze)localObject1).b(new zq(this.e.u(), this.e.v(), this.e.s(), this.e.t()));
          zc localzc1 = zbyb.a(this.e.z(), (com.aspose.cells.b.a.b.a.ze)localObject1);
          this.a.a(localzc1, this.e.u(), this.e.v(), this.e.s(), this.e.t());
        }
        if (!this.e.A().a())
        {
          localObject1 = zbyb.a(this.e.A());
          this.a.a((zs)localObject1, this.e.u(), this.e.v(), this.e.s(), this.e.t());
        }
        a();
        return;
      }
    }
    else
    {
      l1 = -20833L;
      l2 = 62500L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj1", l1), new zam("adj2", l2) }, new zadh[] { new zadh("dxPos", 0, -27273042329602L, 27273042316901L, 100000L, false), new zadh("dyPos", 0, -27273042329603L, 27273042316902L, 100000L, false), new zadh("xPos", 1, -27273042329606L, -27273042329612L, 0L, false), new zadh("yPos", 1, -27273042329607L, -27273042329613L, 0L, false), new zadh("sdx", 0, -27273042329612L, -27273042329603L, 1L, false), new zadh("sdy", 0, -27273042329613L, -27273042329602L, 1L, false), new zadh("pang", 5, -27273042329616L, -27273042329617L, 0L, false), new zadh("stAng", 1, -27273042329618L, 660000L, 0L, false), new zadh("enAng", 1, -27273042329618L, 0L, 660000L, false), new zadh("dx1", 7, -27273042329640L, -27273042329619L, 0L, false), new zadh("dy1", 13, -27273042329641L, -27273042329619L, 0L, false), new zadh("x1", 1, -27273042329606L, -27273042329621L, 0L, false), new zadh("y1", 1, -27273042329607L, -27273042329622L, 0L, false), new zadh("dx2", 7, -27273042329640L, -27273042329620L, 0L, false), new zadh("dy2", 13, -27273042329641L, -27273042329620L, 0L, false), new zadh("x2", 1, -27273042329606L, -27273042329625L, 0L, false), new zadh("y2", 1, -27273042329607L, -27273042329626L, 0L, false), new zadh("stAng1", 5, -27273042329621L, -27273042329622L, 0L, false), new zadh("enAng1", 5, -27273042329625L, -27273042329626L, 0L, false), new zadh("swAng1", 1, -27273042329630L, 0L, -27273042329629L, false), new zadh("swAng2", 1, -27273042329631L, 21600000L, 0L, false), new zadh("swAng", 3, -27273042329631L, -27273042329631L, -27273042329632L, false), new zadh("idx", 7, -27273042329640L, 2700000L, 0L, false), new zadh("idy", 13, -27273042329641L, 2700000L, 0L, false), new zadh("il", 1, -27273042329606L, 0L, -27273042329634L, false), new zadh("ir", 1, -27273042329606L, -27273042329634L, 0L, false), new zadh("it", 1, -27273042329607L, 0L, -27273042329635L, false), new zadh("ib", 1, -27273042329607L, -27273042329635L, 0L, false), new zadh("wd2", 0, -27273042329602L, 1L, 2L, true), new zadh("hd2", 0, -27273042329603L, 1L, 2L, true), new zadh("3cd4", 0, -27273042329601L, 3L, 4L, true), new zadh("cd4", 0, -27273042329601L, 1L, 4L, true) }, new znk[] { new znk(-27273042329606L, -27273042329609L, -27273042329642L), new znk(-27273042329636L, -27273042329638L, -27273042329642L), new znk(-27273042329636L, -27273042329639L, -27273042329643L), new znk(-27273042329606L, -27273042329611L, -27273042329643L), new znk(-27273042329637L, -27273042329639L, -27273042329643L), new znk(-27273042329610L, -27273042329607L, 0L), new znk(-27273042329637L, -27273042329638L, -27273042329642L), new znk(-27273042329614L, -27273042329615L, -27273042329618L) }, new zal[] { new zal(false, 27273042316901L, -2147483647L, 2147483647L, 27273042316902L, -2147483647L, 2147483647L, -27273042329614L, -27273042329615L) }, new zavr[] { new zavr(new byte[] { 1, 2, 3, 0 }, new long[] { -27273042329614L, -27273042329615L, -27273042329623L, -27273042329624L, -27273042329640L, -27273042329641L, -27273042329629L, -27273042329633L }, 0L, 0L, 1, true, true) }, new zan(-27273042329636L, -27273042329638L), new zan(-27273042329637L, -27273042329639L));
    localzadg.a(0);
    float f2 = this.g;
    float f3 = this.h;
    float f4 = this.e.y().h();
    float f5 = this.e.y().i();
    zq localzq = new zq(f2, f3, f4, f5);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbyb.a(this.e.A());
    Object localObject2 = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(localzq.f(), localzq.g(), localzq.h(), localzq.i());
    int i = arrayOfze.length;
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i; j++)
    {
      if (!this.e.z().a())
      {
        zc localzc2 = zbyb.a(this.e.z(), arrayOfze[j]);
        this.a.a(localzc2, arrayOfze[j]);
      }
      if (!this.e.A().a()) {
        this.a.a(localzs, arrayOfze[j]);
      }
    }
    a();
    this.a.a(localzf);
  }
  
  zq b(zq paramzq)
  {
    paramzq = zbiy.a(paramzq);
    return paramzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */