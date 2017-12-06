package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zchf
{
  private zbcj a;
  private int b;
  private byte[] c;
  private zcbw d;
  
  zchf(zbcj paramzbcj)
  {
    this.a = paramzbcj;
  }
  
  void a(zcbw paramzcbw)
    throws Exception
  {
    this.d = paramzcbw;
    for (;;)
    {
      this.b = paramzcbw.a();
      switch (this.b)
      {
      case 398: 
        a();
        break;
      case 411: 
        b();
        break;
      case 403: 
        return;
      }
    }
  }
  
  private void a()
  {
    this.c = this.d.d();
    int i = 0;
    if ((this.c[i] & 0xFF & 0x2) != 0) {
      this.a.a = true;
    }
    i = 2;
    this.a.l = new byte[16];
    System.arraycopy(this.c, i, this.a.l, 0, 16);
    i += 16;
    this.a.m = new byte[16];
    System.arraycopy(this.c, i, this.a.m, 0, 16);
    i += 16;
    this.a.i = zc.a(this.c, i);
    i += 4;
    this.a.j = zc.a(this.c, i);
    i += 4;
    this.a.d = ((this.c[i] & 0xFF & 0x1) == 0);
    this.a.f = ((this.c[i] & 0xFF & 0x2) != 0);
    i += 2;
    this.a.e = zc.b(this.c, i);
  }
  
  static DateTime a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = zc.b(paramArrayOfByte, paramInt);
    return new DateTime(i, paramArrayOfByte[(paramInt + 2)] & 0xFF, paramArrayOfByte[(paramInt + 3)] & 0xFF, paramArrayOfByte[(paramInt + 4)] & 0xFF, paramArrayOfByte[(paramInt + 5)] & 0xFF, paramArrayOfByte[(paramInt + 6)] & 0xFF);
  }
  
  private void b()
    throws Exception
  {
    zbci localzbci = new zbci(this.a);
    this.a.a(localzbci);
    zbce localzbce = new zbce();
    localzbci.b = localzbce;
    this.c = this.d.d();
    int i = 14;
    localzbce.b = new byte[16];
    System.arraycopy(this.c, i, localzbce.b, 0, 16);
    i += 16;
    localzbce.a = a(this.c, i);
    i += 8;
    localzbce.e = zc.b(this.c, i);
    i += 2;
    localzbce.d = zc.a(this.c, i);
    i += 4;
    localzbce.c = zc.a(this.c, i);
    i += 4;
    localzbce.f = zcgj.d(this.c, i);
    i += 4 + (localzbce.f == null ? 0 : localzbce.f.length() * 2);
    localzbce.i = zcgj.d(this.c, i);
    i += 4 + (localzbce.i == null ? 0 : localzbce.i.length() * 2);
    int j = zc.a(this.c, i);
    i += 4;
    int k;
    if (j > 0)
    {
      localzbce.g = new int[j];
      for (k = 0; k < j; k++)
      {
        localzbce.g[k] = (zc.e(this.c, i) & 0xFFFF);
        i += 2;
      }
    }
    j = zc.a(this.c, i);
    i += 4;
    if (j > 0)
    {
      localzbce.h = new int[j];
      for (k = 0; k < j; k++)
      {
        localzbce.h[k] = zc.a(this.c, i);
        i += 4;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */