package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbgw
  extends zcp
{
  zbgw(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  static com.aspose.cells.b.a.b.a.ze[] a(zbni paramzbni, zq paramzq)
  {
    long l1 = 0L;
    long l2 = 0L;
    if (paramzbni.n != null)
    {
      if (paramzbni.n.a.size() > 0)
      {
        l1 = com.aspose.cells.b.a.ze.c(paramzbni.n.a.get(0));
        l2 = com.aspose.cells.b.a.ze.c(paramzbni.n.a.get(1));
      }
      else
      {
        l1 = 50000L;
        l2 = 50000L;
      }
    }
    else
    {
      l1 = 50000L;
      l2 = 50000L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj1", l1), new zam("adj2", l2) }, new zadh[] { new zadh("x2", 0, -27273042329602L, 27273042316901L, 100000L, false), new zadh("x1", 2, -27273042329608L, -27273042329612L, 2L, false), new zadh("x3", 2, -27273042329610L, -27273042329612L, 2L, false), new zadh("x4", 2, -27273042329612L, -27273042329614L, 2L, false), new zadh("x5", 2, -27273042329614L, -27273042329610L, 2L, false), new zadh("y4", 0, -27273042329603L, 27273042316902L, 100000L, false), new zadh("y1", 2, -27273042329609L, -27273042329617L, 2L, false), new zadh("y2", 2, -27273042329609L, -27273042329618L, 2L, false), new zadh("y3", 2, -27273042329618L, -27273042329617L, 2L, false), new zadh("y5", 2, -27273042329611L, -27273042329617L, 2L, false) }, null, new zal[] { new zal(false, 27273042316901L, -2147483647L, 2147483647L, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, -27273042329612L, -27273042329618L), new zal(false, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 27273042316902L, -2147483647L, 2147483647L, -27273042329614L, -27273042329617L) }, new zavr[] { new zavr(new byte[] { 1, 5, 5, 5 }, new long[] { -27273042329608L, -27273042329609L, -27273042329613L, -27273042329609L, -27273042329612L, -27273042329619L, -27273042329612L, -27273042329618L, -27273042329612L, -27273042329620L, -27273042329615L, -27273042329617L, -27273042329614L, -27273042329617L, -27273042329616L, -27273042329617L, -27273042329610L, -27273042329621L, -27273042329610L, -27273042329611L }, 0L, 0L, 0, true, true) }, new zan(-27273042329608L, -27273042329609L), new zan(-27273042329610L, -27273042329611L));
    localzadg.a(0);
    Object localObject = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    return arrayOfze;
  }
  
  void b()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = a(this.e, localzq);
    int i = arrayOfze.length;
    if (i > 0)
    {
      zf localzf = this.a.d();
      this.a.a(4, true);
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      localze.b(localzq);
      zc localzc = zbyb.a(this.e.z(), localze);
      zs localzs = zbyb.a(this.e.A());
      for (int j = 0; j < i; j++) {
        if (!this.e.A().a()) {
          this.a.a(localzs, arrayOfze[j]);
        }
      }
      super.a();
      this.a.a(localzf);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */