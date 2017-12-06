package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zamt
  extends zcp
{
  zamt(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
    switch (this.e.c)
    {
    case 1: 
      break;
    case 4: 
      zi localzi = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
      this.a.c();
      this.a.a(localzi);
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
        l = 8333L;
      }
    }
    else {
      l = 8333L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj", l) }, new zadh[] { new zadh("maxAdj", 0, 50000L, -27273042329603L, -27273042329604L, false), new zadh("a", 11, 0L, 27273042316901L, -27273042329612L, false), new zadh("y1", 0, -27273042329604L, -27273042329613L, 100000L, false), new zadh("y2", 1, -27273042329611L, 0L, -27273042329614L, false), new zadh("dx1", 7, -27273042329602L, 2700000L, 0L, false), new zadh("dy1", 13, -27273042329614L, 2700000L, 0L, false), new zadh("il", 1, -27273042329610L, 0L, -27273042329616L, false), new zadh("it", 1, -27273042329614L, 0L, -27273042329617L, false), new zadh("ib", 1, -27273042329611L, -27273042329617L, -27273042329614L, false), new zadh("cd4", 0, -27273042329601L, 1L, 4L, true), new zadh("cd2", 0, -27273042329601L, 1L, 2L, true), new zadh("3cd4", 0, -27273042329601L, 3L, 4L, true) }, new znk[] { new znk(-27273042329610L, -27273042329609L, -27273042329621L), new znk(-27273042329608L, -27273042329607L, -27273042329622L), new znk(-27273042329610L, -27273042329611L, -27273042329623L) }, new zal[] { new zal(false, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 27273042316901L, 0L, -27273042329612L, -27273042329608L, -27273042329614L) }, new zavr[] { new zavr(new byte[] { 1, 3, 2, 3, 0 }, new long[] { -27273042329610L, -27273042329611L, -27273042329602L, -27273042329614L, -27273042329621L, -27273042329621L, -27273042329608L, -27273042329614L, -27273042329602L, -27273042329614L, -27273042329622L, -27273042329621L }, 0L, 0L, 1, false, false), new zavr(new byte[] { 1, 3, 2, 3 }, new long[] { -27273042329610L, -27273042329611L, -27273042329602L, -27273042329614L, -27273042329621L, -27273042329621L, -27273042329608L, -27273042329614L, -27273042329602L, -27273042329614L, -27273042329622L, -27273042329621L }, 0L, 0L, 0, true, true) }, new zan(-27273042329618L, -27273042329619L), new zan(-27273042329610L, -27273042329620L));
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
    zc localzc = zbyb.a(this.e.z(), arrayOfze[1]);
    if (!this.e.z().a()) {
      this.a.a(localzc, arrayOfze[1]);
    }
    if (!this.e.A().a()) {
      this.a.a(localzs, arrayOfze[1]);
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */