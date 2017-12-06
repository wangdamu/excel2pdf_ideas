package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zxr
  extends zco
{
  zxr(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbya.a(this.e.n());
    zq localzq = new zq(this.c, this.d, this.e.f(), this.e.g());
    Object localObject;
    if (!this.e.m().a())
    {
      localObject = new ze();
      ((ze)localObject).a(localzq);
      zc localzc = zbya.a(this.e.m(), (ze)localObject);
      this.a.a(localzc, localzq);
    }
    if (!this.e.n().a())
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
    super.b();
    this.a.a(localzf);
  }
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = zbix.a(paramzq);
    super.b(paramzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */