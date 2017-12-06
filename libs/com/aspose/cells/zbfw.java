package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbfw
  extends zcp
{
  zbfw(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze[] c()
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
        l1 = 50000L;
        l2 = 50000L;
      }
    }
    else
    {
      l1 = 50000L;
      l2 = 50000L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj1", l1), new zam("adj2", l2) }, new zadh[] { new zadh("x1", 0, -27273042329602L, 27273042316901L, 100000L, false), new zadh("x2", 2, -27273042329612L, -27273042329610L, 2L, false), new zadh("y2", 0, -27273042329603L, 27273042316902L, 100000L, false), new zadh("y1", 2, -27273042329609L, -27273042329614L, 2L, false) }, null, new zal[] { new zal(false, 27273042316901L, -2147483647L, 2147483647L, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, -27273042329612L, -27273042329615L), new zal(false, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 27273042316902L, -2147483647L, 2147483647L, -27273042329613L, -27273042329614L) }, new zavr[] { new zavr(new byte[] { 1, 2, 2, 2, 2 }, new long[] { -27273042329608L, -27273042329609L, -27273042329612L, -27273042329609L, -27273042329612L, -27273042329614L, -27273042329610L, -27273042329614L, -27273042329610L, -27273042329611L }, 0L, 0L, 0, true, true) }, new zan(-27273042329608L, -27273042329609L), new zan(-27273042329610L, -27273042329611L));
    localzadg.a(0);
    float f1 = 0.0F;
    float f2 = 0.0F;
    if ((!this.e.f) && (!this.e.i))
    {
      f1 = -this.e.m().f();
      f2 = -this.e.m().g();
    }
    else
    {
      f1 = this.g;
      f2 = this.h;
    }
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    Object localObject = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(localzq.f(), localzq.g(), localzq.h(), localzq.i());
    return arrayOfze;
  }
  
  void b()
    throws Exception
  {
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = c();
    int i = arrayOfze.length;
    if (i > 0)
    {
      zf localzf = this.a.d();
      this.a.a(4, true);
      float f1 = 0.0F;
      float f2 = 0.0F;
      if ((!this.e.f) && (!this.e.i))
      {
        f1 = -this.e.m().f();
        f2 = -this.e.m().g();
      }
      else
      {
        f1 = this.g;
        f2 = this.h;
      }
      float f3 = this.e.y().h();
      float f4 = this.e.y().i();
      zq localzq = new zq(f1, f2, f3, f4);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */