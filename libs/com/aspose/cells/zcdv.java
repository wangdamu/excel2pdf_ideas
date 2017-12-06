package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdv
  extends zche
{
  zche a;
  zche b;
  private Workbook e;
  private zbbw f;
  
  zcdv(zbbw paramzbbw, Workbook paramWorkbook)
    throws Exception
  {
    this.d = 409;
    this.f = paramzbbw;
    this.e = paramWorkbook;
    a();
  }
  
  private void a()
    throws Exception
  {
    if (this.f.q != null) {
      this.b = a(this.f.q);
    }
    if (this.f.p != null) {
      this.a = a(this.f.p);
    }
    int i = 34;
    if (this.f.t != null) {
      i += this.f.t.length * 100;
    }
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.f);
    int j = localzbcn.a(this.c);
    System.arraycopy(zc.a(this.f.b()), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(this.f.c()), 0, this.c, j, 4);
    j += 4;
    int k = 0;
    int m = 0;
    if (this.f.q != null)
    {
      m = zchk.a(this.f.q);
      k |= m;
    }
    if (this.f.p != null) {
      k |= zchk.a(this.f.p) << 3;
    }
    if (this.f.i) {
      k |= 0x40;
    }
    if (this.f.g) {
      k |= 0x80;
    }
    if (this.f.c) {
      k |= 0x100;
    }
    if (this.f.r != null) {
      k |= 0x200;
    }
    if (this.f.o) {
      k |= 0x400;
    }
    if (this.f.l) {
      k |= 0x800;
    }
    if (this.f.b) {
      k |= 0x1000;
    }
    if (this.f.s != null) {
      k |= 0x2000;
    }
    System.arraycopy(zc.a(k), 0, this.c, j, 2);
    j += 2;
    k = 0;
    int n = this.f.e;
    if ((n > 0) && (n <= 59)) {
      this.c[j] = ((byte)n);
    }
    j++;
    if (this.f.h) {
      k |= 0x1;
    }
    if (this.f.f) {
      k |= 0x2;
    }
    if (this.f.d) {
      k |= 0x4;
    }
    if (this.f.p != null) {
      k |= 0x8;
    }
    this.c[j] = ((byte)k);
    j++;
    if (this.a != null) {
      System.arraycopy(zc.a(this.a.c.length), 0, this.c, j, 4);
    }
    j += 4;
    j = zchk.a(this.c, j, this.f.t);
  }
  
  private zche a(zbby paramzbby)
    throws Exception
  {
    zche localzche = null;
    int i = 8;
    int j = 0;
    if (paramzbby.h != null) {
      j = 2 + paramzbby.h.length;
    }
    byte[] arrayOfByte = null;
    switch (paramzbby.b())
    {
    case 0: 
      localzche = new zche(j == 0 ? 4 : 10);
      i++;
      arrayOfByte = new byte[i + j];
      a(paramzbby, arrayOfByte);
      if (((Boolean)paramzbby.e).booleanValue()) {
        arrayOfByte[8] = 1;
      }
      break;
    case 3: 
      if (j == 0)
      {
        localzche = new zche(1);
        arrayOfByte = new byte[i + j];
      }
      else
      {
        localzche = new zche(9);
        i += 8;
        arrayOfByte = new byte[i + j];
      }
      a(paramzbby, arrayOfByte);
      break;
    case 5: 
      localzche = new zche(j == 0 ? 62 : 8);
      zchm localzchm = new zchm();
      if (j == 0)
      {
        zbbj localzbbj = (zbbj)paramzbby.e;
        if (localzbbj.f()) {
          localzchm.a((zbdd)localzbbj, this.e);
        } else {
          localzchm.a(localzbbj.c);
        }
      }
      else
      {
        localzchm.a((String)paramzbby.d());
      }
      i += localzchm.c.length;
      arrayOfByte = new byte[i + j];
      a(paramzbby, arrayOfByte);
      System.arraycopy(localzchm.c, 0, arrayOfByte, 8, localzchm.c.length);
      break;
    case 1: 
    case 4: 
      localzche = new zche(j == 0 ? 5 : 9);
      i += 8;
      arrayOfByte = new byte[i + j];
      a(paramzbby, arrayOfByte);
      double d = paramzbby.c();
      System.arraycopy(zc.a(d), 0, arrayOfByte, 8, 8);
      break;
    case 2: 
      localzche = new zche(j == 0 ? 3 : 11);
      i++;
      arrayOfByte = new byte[i + j];
      a(paramzbby, arrayOfByte);
      arrayOfByte[8] = ztr.b((String)paramzbby.e);
      break;
    }
    if ((arrayOfByte != null) && (j != 0))
    {
      System.arraycopy(zc.a(paramzbby.i), 0, arrayOfByte, i, 2);
      System.arraycopy(paramzbby.h, 0, arrayOfByte, i + 2, paramzbby.h.length);
    }
    if (localzche != null) {
      localzche.c = arrayOfByte;
    }
    return localzche;
  }
  
  private void a(zbby paramzbby, byte[] paramArrayOfByte)
  {
    System.arraycopy(zc.a(paramzbby.c), 0, paramArrayOfByte, 0, 2);
    int i = 0;
    System.arraycopy(zc.a(i), 0, paramArrayOfByte, 4, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */