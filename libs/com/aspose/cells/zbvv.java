package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zbvv
  extends zcp
{
  zbvv(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  private static void a(zr paramzr, zbni paramzbni)
    throws Exception
  {
    if (!paramzbni.z().a())
    {
      ze localze = new ze();
      localze.b(paramzbni.y());
      zc localzc = zbyb.a(paramzbni.z(), localze);
      paramzr.b(localzc, paramzbni.y());
    }
    if (!paramzbni.A().a())
    {
      int i = paramzbni.A().i();
      int j = paramzbni.A().l();
      paramzbni.A().e(0);
      paramzbni.A().h(0);
      zs localzs = zbyb.a(paramzbni.A());
      if (paramzbni.A().h() <= 1.0F) {
        paramzr.c(localzs, paramzbni.W().f(), paramzbni.W().g(), paramzbni.s(), paramzbni.t());
      } else {
        paramzr.c(localzs, paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
      }
      paramzbni.A().e(i);
      paramzbni.A().h(j);
    }
  }
  
  void b()
    throws Exception
  {
    a(this.a, this.e);
    zf localzf = null;
    if ((this.e.z().a()) && (this.e.a))
    {
      localzf = this.a.d();
      this.a.b(4, false);
    }
    a();
    if ((this.e.z().a()) && (this.e.a)) {
      this.a.a(localzf);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */