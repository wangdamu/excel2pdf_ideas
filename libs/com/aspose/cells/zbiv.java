package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zbiv
  extends zcp
{
  zbiv(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zadg localzadg = new zadg();
    localzadg.a(76);
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbyb.a(this.e.A());
    Object localObject = null;
    ze[] arrayOfze = localzadg.a(localzq.f(), localzq.g(), localzq.h(), localzq.i());
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbiv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */