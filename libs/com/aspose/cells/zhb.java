package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zhb
  extends zaem
{
  zhb(zgw paramzgw, float paramFloat1, float paramFloat2)
  {
    super(paramzgw, paramFloat1, paramFloat2, 1.0F, c());
    if ((paramzgw.c() != null) && ("Calibri Light".equals(paramzgw.c().getFont().getName())) && (this.g == 0)) {
      this.f += 144.0F / a;
    }
  }
  
  private static double[] c()
  {
    return new double[] { 1.0D, 1.0D };
  }
  
  protected void a(double[] paramArrayOfDouble)
    throws Exception
  {
    while (this.k.r().size() > 0)
    {
      zanx localzanx = new zanx(this.i.size() == 0, this.n, this.c - this.k.a() * a / 72.0F, this.d, this.k, this.m, paramArrayOfDouble);
      localzanx.a();
      zf.a(this.i, localzanx);
    }
  }
  
  protected float a(double paramDouble, float paramFloat)
  {
    return zgz.c(paramDouble, paramFloat);
  }
  
  void a(zb paramzb)
    throws Exception
  {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */