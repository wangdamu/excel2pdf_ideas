package com.aspose.cells;

import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

class zwz
  extends zbes
{
  private zm a;
  private zagp b;
  
  zwz(zm paramzm, zagp paramzagp)
  {
    this.a = paramzm;
    this.b = paramzagp;
  }
  
  boolean a()
    throws Exception
  {
    zbes localzbes = zsg.a(this.a, this.b.f, this.b.k, this.b.l);
    byte[] arrayOfByte = new byte['Ȁ'];
    za localza = new za(new zh(arrayOfByte), Encoding.getUnicode());
    for (long l = 0L; (l & 0xFFFFFFFF) < this.b.f; l += 1L)
    {
      this.a.b(zbet.a(localzbes.b(l), true));
      if (this.a.a(arrayOfByte, 0, 512) <= 0) {
        return false;
      }
      localza.k().b(0L);
      for (int i = 0; i < 128; i++) {
        a(localza.r());
      }
    }
    return true;
  }
  
  void b()
    throws Exception
  {
    zh localzh = super.c();
    zb localzb = new zb(this.a, Encoding.getUnicode());
    long l = zbet.b(this.a.i(), true);
    int i = super.d();
    int j = zbrg.a(i, 128);
    j = zbrg.a(i + j, 128);
    this.a.b(localzh.m(), 0, (int)localzh.h());
    for (int k = 0; k < j; k++) {
      localzb.a(4294967293L);
    }
    k = zbrg.a(i + j, 128);
    if (k > 109)
    {
      int m = zbrg.a(k - 109, 127);
      for (int n = 0; n < m; n++) {
        localzb.a(4294967293L);
      }
      for (n = 0; n < m; n++) {
        localzb.a(4294967292L);
      }
      k = zbrg.a(i + j + m, 128);
    }
    this.b.f = k;
    zbet.a(localzb);
    zsg.a(this.a, l, k, this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */