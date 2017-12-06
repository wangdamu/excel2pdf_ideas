package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbll
  extends zcp
{
  zbll(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f5 = 0.0F;
    float f6 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 60000.0F;
        f6 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 60000.0F;
      }
      else
      {
        f5 = 0.0F;
        f6 = 270.0F;
      }
    }
    else
    {
      f5 = 0.0F;
      f6 = 270.0F;
    }
    if (f6 > f5) {
      localze.b(f1, f2, f3, f4, f5, f6 - f5);
    } else {
      localze.b(f1, f2, f3, f4, f5, 360.0F + f6 - f5);
    }
    localze.j();
    return localze;
  }
  
  zq b(zq paramzq)
  {
    paramzq = zbiy.a(paramzq);
    return paramzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */