package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbho
  extends zco
{
  zbho(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.l().h();
    float f4 = this.e.l().i();
    float f5 = 0.0F;
    if (this.e.l.a.size() > 0) {
      f5 = com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
    } else {
      f5 = 0.25F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zq localzq = new zq(f1, f2, f3, f4);
    localze.a(localzq);
    localzq.a(-f5 * f3, -f5 * f4);
    localze.a(localzq);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */