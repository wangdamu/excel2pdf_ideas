package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;

class zayc
  implements zj
{
  private ze b = new ze();
  private boolean c = false;
  private static byte[] d = { 0, 1, 1, -127 };
  public static zayc a = new zayc();
  
  protected zayc() {}
  
  public zayc(zo paramzo1, zo paramzo2, zo paramzo3, zo paramzo4, boolean paramBoolean)
  {
    byte[] arrayOfByte = (byte[])za.a(d);
    if (paramBoolean)
    {
      int tmp39_38 = 3;
      byte[] tmp39_36 = arrayOfByte;
      tmp39_36[tmp39_38] = ((byte)(tmp39_36[tmp39_38] | 0xFFFFFF80));
    }
    this.b = new ze(new zo[] { paramzo1, paramzo2, paramzo3, paramzo4 }, arrayOfByte);
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.c)
    {
      if (paramBoolean) {
        this.b.g();
      }
      this.c = true;
    }
  }
  
  public void a(zr paramzr, zs paramzs, zc paramzc, zke paramzke)
    throws Exception
  {
    if ((paramzke == null) || (this.b.e() == 0)) {
      return;
    }
    if (paramzke.i().f()) {
      paramzc = zbd.a(paramzke.i(), zn.a(this.b), 0.5F);
    }
    if (paramzke.i().h() != 0) {
      paramzr.a(paramzc, this.b);
    }
    if (paramzke.k().e())
    {
      zo[] arrayOfzo = this.b.c();
      if (arrayOfzo.length >= 4)
      {
        paramzr.a(paramzs, arrayOfzo[0], arrayOfzo[1]);
        paramzr.a(paramzs, arrayOfzo[1], arrayOfzo[2]);
        paramzr.a(paramzs, arrayOfzo[2], arrayOfzo[3]);
        paramzr.a(paramzs, arrayOfzo[3], arrayOfzo[0]);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */