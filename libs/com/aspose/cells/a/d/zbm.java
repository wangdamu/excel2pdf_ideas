package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zu;

public class zbm
  extends zbk
{
  private long a;
  private long b;
  private long c;
  private zde d;
  
  public zbm(zcw paramzcw, zde paramzde)
    throws Exception
  {
    this.a = (paramzcw.r() & 0xFFFFFFFF);
    this.b = (paramzcw.r() & 0xFFFFFFFF);
    this.c = (paramzcw.r() & 0xFFFFFFFF);
    this.d = paramzde;
  }
  
  public void a(zhe[] paramArrayOfzhe)
  {
    zo localzo1 = new zo(paramArrayOfzhe[((int)this.a)].a, paramArrayOfzhe[((int)this.a)].b);
    zo localzo2 = new zo(paramArrayOfzhe[((int)this.b)].a, paramArrayOfzhe[((int)this.b)].b);
    zo localzo3 = new zo(paramArrayOfzhe[((int)this.c)].a, paramArrayOfzhe[((int)this.c)].b);
    zp localzp = zp.a(localzo1, localzo2, localzo3);
    localzp.a(new zu(Color.a(255, paramArrayOfzhe[((int)this.a)].c)));
    localzp.a(this.d.a().p());
    this.d.c.a(localzp);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */