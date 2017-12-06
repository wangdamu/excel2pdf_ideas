package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zl;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;

class zaep
  extends zaes
{
  private zh d;
  private zt e;
  
  public zaep(zh paramzh, zt paramzt)
  {
    this.a = paramzt.c();
    this.b = paramzt.b();
    this.c = this.a;
    this.d = paramzh;
    this.e = paramzt;
  }
  
  public void a(zb[] paramArrayOfzb, zo paramzo)
  {
    zo localzo = new zo(paramzo.d(), paramzo.e() - this.e.c());
    zl localzl = zl.a(localzo, this.e, this.d);
    paramArrayOfzb[0].a(localzl);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */