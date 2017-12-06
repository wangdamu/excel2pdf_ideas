package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbif
  extends zcp
{
  zbif(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  static com.aspose.cells.b.a.b.a.ze[] a(zbni paramzbni, zq paramzq)
  {
    long l = 0L;
    if (paramzbni.n != null)
    {
      if (paramzbni.n.a.size() > 0)
      {
        l = com.aspose.cells.b.a.ze.c(paramzbni.n.a.get(0));
        if (((float)(l / 100000L) > Math.max(paramzbni.s(), paramzbni.t())) && ((paramzbni.s() <= 1.0F) || (paramzbni.t() <= 1.0F))) {
          l /= 10000L;
        }
      }
      else
      {
        l = 50000L;
      }
    }
    else {
      l = 50000L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj1", l) }, new zadh[] { new zadh("x1", 0, -27273042329602L, 27273042316901L, 100000L, false) }, null, new zal[] { new zal(false, 27273042316901L, -2147483647L, 2147483647L, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, -27273042329612L, -27273042329607L) }, new zavr[] { new zavr(new byte[] { 1, 2, 2, 2 }, new long[] { -27273042329608L, -27273042329609L, -27273042329612L, -27273042329609L, -27273042329612L, -27273042329611L, -27273042329610L, -27273042329611L }, 0L, 0L, 0, true, true) }, new zan(-27273042329608L, -27273042329609L), new zan(-27273042329610L, -27273042329611L));
    localzadg.a(0);
    Object localObject1 = null;
    Object localObject2 = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    return arrayOfze;
  }
  
  void b()
    throws Exception
  {
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */