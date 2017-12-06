package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbhp
  extends zcp
{
  zbhp(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    float f5 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f5 = 0.25F;
      }
    }
    else {
      f5 = 0.25F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zq localzq = new zq(f1, f2, f3, f4);
    localze.a(localzq);
    float f6 = f3 > f4 ? f4 : f3;
    localzq.a(-f5 * f6, -f5 * f6);
    localze.a(localzq);
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */