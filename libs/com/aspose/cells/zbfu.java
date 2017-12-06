package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zbfu
  extends zcp
{
  zbfu(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze[] c()
  {
    zadg localzadg = new zadg(new zam[0], new zadh[0], null, null, new zavr[] { new zavr(new byte[] { 1, 2, 2 }, new long[] { -27273042329608L, -27273042329609L, -27273042329610L, -27273042329609L, -27273042329610L, -27273042329611L }, 0L, 0L, 0, true, true) }, new zan(-27273042329608L, -27273042329609L), new zan(-27273042329610L, -27273042329611L));
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
    ze[] arrayOfze = localzadg.a(localzq.f(), localzq.g(), localzq.h(), localzq.i());
    return arrayOfze;
  }
  
  void b()
    throws Exception
  {
    ze[] arrayOfze = c();
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
      ze localze = new ze();
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */