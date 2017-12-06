package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;

class zayd
  implements zj
{
  private ze b = new ze();
  private boolean c = false;
  private static byte[] d = { 0, 1, 1, -127 };
  public static zayd a = new zayd();
  
  protected zayd() {}
  
  public zayd(zo paramzo1, zo paramzo2, zo paramzo3, zo paramzo4, boolean paramBoolean)
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
  
  public void a(zr paramzr, zs paramzs, zc paramzc, zkf paramzkf)
    throws Exception
  {
    if ((paramzkf == null) || (this.b.e() == 0)) {
      return;
    }
    if (paramzkf.i().h() != 0) {
      paramzkf.i().a(this.b, 0.5F);
    }
    if (paramzkf.k().h())
    {
      zo[] arrayOfzo = this.b.c();
      if (arrayOfzo.length >= 4)
      {
        zs localzs = paramzkf.k().b(this.b);
        try
        {
          paramzr.a(localzs, arrayOfzo[0], arrayOfzo[1]);
          paramzr.a(localzs, arrayOfzo[1], arrayOfzo[2]);
          paramzr.a(localzs, arrayOfzo[2], arrayOfzo[3]);
          paramzr.a(localzs, arrayOfzo[3], arrayOfzo[0]);
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */