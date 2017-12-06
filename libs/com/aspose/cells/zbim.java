package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbim
  extends zcp
{
  zbim(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbyb.a(this.e.A());
    zq localzq = new zq(this.c, this.d, this.e.s(), this.e.t());
    Object localObject;
    if (!this.e.z().a())
    {
      localObject = new ze();
      ((ze)localObject).b(localzq);
      zc localzc = zbyb.a(this.e.z(), (ze)localObject);
      this.a.a(localzc, localzq);
    }
    if (!this.e.A().a())
    {
      localObject = new zo[4];
      localObject[0] = new zo(localzq.f(), localzq.m() / 2.0F);
      localObject[1] = new zo(localzq.l() / 2.0F, localzq.g());
      localObject[2] = new zo(localzq.l(), localzq.m() / 2.0F);
      localObject[3] = new zo(localzq.l() / 2.0F, localzq.m());
      this.a.a(localzs, localzq);
      this.a.a(localzs, localObject[0], localObject[2]);
      this.a.a(localzs, localObject[1], localObject[3]);
    }
    super.a();
    this.a.a(localzf);
  }
  
  void c(zq paramzq)
    throws Exception
  {
    paramzq = zbiy.a(paramzq);
    super.c(paramzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */