package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbns
  extends zcp
{
  zbns(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    long l = 0L;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        l = com.aspose.cells.b.a.ze.c(this.e.n.a.get(0));
      } else {
        l = 100000L;
      }
    }
    else {
      l = 100000L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj", l) }, new zadh[] { new zadh("a", 11, 0L, 27273042316901L, 200000L, false), new zadh("r2", 14, 2L, 0L, 0L, false), new zadh("tw", 0, -27273042329630L, -27273042329613L, 1L, false), new zadh("th", 0, -27273042329631L, -27273042329613L, 1L, false), new zadh("sw", 0, -27273042329614L, -27273042329612L, 100000L, false), new zadh("sh", 0, -27273042329615L, -27273042329612L, 100000L, false), new zadh("dx1", 7, -27273042329616L, 2700000L, 0L, false), new zadh("dy1", 13, -27273042329617L, 2700000L, 0L, false), new zadh("x1", 1, -27273042329606L, -27273042329618L, 0L, false), new zadh("y1", 1, -27273042329607L, 0L, -27273042329619L, false), new zadh("x2", 2, -27273042329606L, -27273042329620L, 2L, false), new zadh("y2", 2, -27273042329607L, -27273042329621L, 2L, false), new zadh("idx", 7, -27273042329630L, 2700000L, 0L, false), new zadh("idy", 13, -27273042329631L, 2700000L, 0L, false), new zadh("il", 1, -27273042329606L, 0L, -27273042329624L, false), new zadh("ir", 1, -27273042329606L, -27273042329624L, 0L, false), new zadh("it", 1, -27273042329607L, 0L, -27273042329625L, false), new zadh("ib", 1, -27273042329607L, -27273042329625L, 0L, false), new zadh("wd2", 0, -27273042329602L, 1L, 2L, true), new zadh("hd2", 0, -27273042329603L, 1L, 2L, true), new zadh("cd4", 0, -27273042329601L, 1L, 4L, true), new zadh("cd2", 0, -27273042329601L, 1L, 2L, true), new zadh("3cd4", 0, -27273042329601L, 3L, 4L, true) }, new znk[] { new znk(-27273042329610L, -27273042329607L, 0L), new znk(-27273042329627L, -27273042329629L, -27273042329632L), new znk(-27273042329606L, -27273042329611L, -27273042329632L), new znk(-27273042329626L, -27273042329629L, -27273042329632L), new znk(-27273042329608L, -27273042329607L, -27273042329633L), new znk(-27273042329626L, -27273042329628L, -27273042329634L), new znk(-27273042329606L, -27273042329609L, -27273042329634L), new znk(-27273042329620L, -27273042329621L, -27273042329634L) }, new zal[] { new zal(false, 27273042316901L, 0L, 200000L, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, -27273042329620L, -27273042329609L) }, new zavr[] { new zavr(new byte[] { 1, 3, 4, 4, 3, 3, 0 }, new long[] { -27273042329608L, -27273042329607L, -27273042329630L, -27273042329631L, -27273042329633L, -27273042329632L, -27273042329622L, -27273042329609L, -27273042329620L, -27273042329621L, -27273042329610L, -27273042329623L, -27273042329610L, -27273042329607L, -27273042329630L, -27273042329631L, 0L, -27273042329632L, -27273042329630L, -27273042329631L, -27273042329632L, -27273042329632L }, 0L, 0L, 1, true, true) }, new zan(-27273042329626L, -27273042329628L), new zan(-27273042329627L, -27273042329629L));
    localzadg.a(0);
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbyb.a(this.e.A());
    Object localObject = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(localzq.f(), localzq.g(), localzq.h(), localzq.i());
    int i = arrayOfze.length;
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i; j++)
    {
      if (!this.e.z().a())
      {
        zc localzc = zbyb.a(this.e.z(), arrayOfze[j]);
        this.a.a(localzc, arrayOfze[j]);
      }
      if (!this.e.A().a()) {
        this.a.a(localzs, arrayOfze[j]);
      }
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */