package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;

class zbmk
  extends zco
{
  zbmk(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  private static void a(zr paramzr, zbnh paramzbnh)
    throws Exception
  {
    if (!paramzbnh.m().a())
    {
      ze localze = new ze();
      localze.b(paramzbnh.l());
      zc localzc = zbya.a(paramzbnh.m(), localze);
      paramzr.b(localzc, paramzbnh.l());
    }
    if (!paramzbnh.n().a())
    {
      int i = paramzbnh.n().g();
      int j = paramzbnh.n().j();
      paramzbnh.n().c(0);
      paramzbnh.n().f(0);
      zs localzs = zbya.a(paramzbnh.n());
      paramzr.c(localzs, paramzbnh.h(), paramzbnh.i(), paramzbnh.f(), paramzbnh.g());
      paramzbnh.n().c(i);
      paramzbnh.n().f(j);
    }
  }
  
  void a()
    throws Exception
  {
    a(this.a, this.e);
    b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */