package com.aspose.cells;

import com.aspose.cells.a.c.zx;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.d.zm;

class zcz
  extends zp
{
  private byte[] b;
  private int c;
  private int d;
  
  zcz(zm paramzm)
  {
    this.b = zx.a(paramzm, false);
    this.d = this.b.length;
  }
  
  zcz(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
    this.c = 0;
    this.d = (paramArrayOfByte == null ? 0 : paramArrayOfByte.length);
  }
  
  boolean a()
  {
    return false;
  }
  
  void a(zj paramzj)
    throws Exception
  {
    a(paramzj, this.a, this.b, this.c, this.d);
  }
  
  static void a(zj paramzj, String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    paramzj.b(paramArrayOfByte, paramInt1, paramInt2);
    paramzj.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */