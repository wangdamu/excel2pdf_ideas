package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.a.c.zw;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.zj;

public class zev
  extends zex
{
  private zg d;
  private static byte[] e = ;
  
  private zev() {}
  
  public zev(zg paramzg)
  {
    this.d = paramzg;
    h();
  }
  
  private void h()
  {
    this.a = new byte[8];
    System.arraycopy(e, this.d.d() * 8, this.a, 0, 8);
    this.c = new Color[2];
    this.c[0] = this.d.b();
    this.c[1] = this.d.c();
    if (f())
    {
      this.b = new byte[64];
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++)
        {
          int k = (this.a[i] & 0xFF & 128 >> j) > 0 ? 1 : 0;
          this.b[(j + i * 8)] = this.c[k].getA();
        }
      }
    }
    else
    {
      this.b = new byte[0];
    }
  }
  
  public zj a()
  {
    return null;
  }
  
  public int b()
  {
    return 8;
  }
  
  public int c()
  {
    return 8;
  }
  
  public int d()
  {
    return 1;
  }
  
  public zdy e()
  {
    return zdy.c();
  }
  
  public boolean f()
  {
    return ((this.d.b().getA() & 0xFF) < 255) || ((this.d.c().getA() & 0xFF) < 255);
  }
  
  public boolean g()
  {
    return !f();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */