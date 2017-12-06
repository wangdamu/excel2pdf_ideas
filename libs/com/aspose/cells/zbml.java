package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zp;

class zbml
  extends zcp
{
  zbml(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  private void a(zr paramzr, zbni paramzbni)
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
      if (paramzbni.A().h() <= 1.0F)
      {
        zp localzp = new zp((int)paramzbni.u(), (int)paramzbni.v(), (int)paramzbni.s(), (int)paramzbni.t());
        paramzr.a(localzs, localzp);
      }
      else
      {
        paramzr.c(localzs, paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
      }
      paramzbni.A().e(i);
      paramzbni.A().h(j);
    }
    Hyperlink localHyperlink = paramzbni.k.getHyperlink();
    if ((localHyperlink != null) && (localHyperlink.getAddress() != null) && (paramzbni.f)) {
      paramzr.a(paramzbni.y(), localHyperlink.getAddress());
    }
  }
  
  void b()
    throws Exception
  {
    a(this.a, this.e);
    a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */