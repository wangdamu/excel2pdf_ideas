package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zchh
{
  private int b;
  private byte[] c;
  private int d;
  private zcbw e;
  zqh a;
  private Workbook f;
  private zbci g;
  
  zchh(zqh paramzqh)
  {
    this.a = paramzqh;
    this.f = paramzqh.a;
  }
  
  static zbcn a(byte[] paramArrayOfByte, int paramInt)
  {
    zbcn localzbcn = new zbcn();
    localzbcn.a = zc.a(paramArrayOfByte, paramInt);
    paramInt += 4;
    localzbcn.b = zc.a(paramArrayOfByte, paramInt);
    paramInt += 4;
    localzbcn.c = zc.b(paramArrayOfByte, paramInt);
    paramInt += 2;
    localzbcn.d = ((paramArrayOfByte[paramInt] & 0xFF & 0x1) != 0);
    localzbcn.e = ((paramArrayOfByte[paramInt] & 0xFF & 0x2) != 0);
    localzbcn.f = ((paramArrayOfByte[paramInt] & 0xFF & 0x4) != 0);
    localzbcn.g = ((paramArrayOfByte[paramInt] & 0xFF & 0x8) != 0);
    paramInt += 2;
    localzbcn.h = zc.b(paramArrayOfByte, paramInt);
    paramInt += 2;
    return localzbcn;
  }
  
  void a(zcbw paramzcbw, zbci paramzbci)
    throws Exception
  {
    this.e = paramzcbw;
    this.g = paramzbci;
    for (;;)
    {
      this.b = paramzcbw.a();
      switch (this.b)
      {
      case 407: 
        paramzbci.c.a(i());
        break;
      case 409: 
        zbbu localzbbu = j();
        if (localzbbu != null) {
          paramzbci.c.a(localzbbu);
        }
        break;
      case 419: 
        paramzbci.c.a(k());
        break;
      case 405: 
        paramzbci.c.a(h());
        break;
      case 412: 
        paramzbci.c.a(g());
        break;
      case 413: 
        paramzbci.c.a(e());
        break;
      case 414: 
        paramzbci.c.a(f());
        break;
      case 415: 
        paramzbci.c.a(d());
        break;
      case 416: 
        paramzbci.c.a(c());
        break;
      case 418: 
        paramzbci.c.a(l());
        break;
      case 421: 
        paramzbci.c.a(b());
        break;
      case 403: 
        this.d = paramzcbw.b();
        paramzcbw.a(this.d);
        return;
      case 404: 
      case 406: 
      case 408: 
      case 410: 
      case 411: 
      case 417: 
      case 420: 
      default: 
        this.d = paramzcbw.b();
        paramzcbw.a(this.d);
      }
    }
  }
  
  private zbbu l()
  {
    zbcm localzbcm = new zbcm();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbcm.d = localzbcn.h;
    localzbcm.e = localzbcn.b;
    int i = 14;
    localzbcm.c = zcgj.a(this.c, i);
    i += 16;
    localzbcm.b = zc.a(this.c, i);
    return localzbcm;
  }
  
  zbbu a()
    throws Exception
  {
    zbcr localzbcr = new zbcr();
    this.c = this.e.d();
    int i = 0;
    localzbcr.f = (zc.e(this.c, i) & 0xFFFF);
    i += 2;
    localzbcr.b = this.c[i];
    i++;
    localzbcr.g = ((this.c[i] & 0xFF & 0x1) != 0);
    localzbcr.h = ((this.c[i] & 0xFF & 0x2) != 0);
    i++;
    i += 5;
    localzbcr.e = zcgj.a(this.c, i);
    i += 16;
    localzbcr.i = zc.a(this.c, i);
    i += 4;
    localzbcr.j = zc.a(this.c, i);
    i += 4;
    localzbcr.k = zc.b(this.c, i);
    i += 2;
    if (localzbcr.g) {
      localzbcr.c = zcgj.d(this.c, i);
    }
    return localzbcr;
  }
  
  zbbu b()
  {
    zbbv localzbbv = new zbbv();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbbv.e = localzbcn.h;
    int i = 14;
    localzbbv.c = zc.a(this.c, i);
    i += 4;
    localzbbv.b = zc.a(this.c, i);
    i += 4;
    localzbbv.d = zcgj.a(this.c, i);
    return localzbbv;
  }
  
  zbbu c()
    throws Exception
  {
    zbbx localzbbx = new zbbx();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbbx.l = localzbcn.h;
    int i = 14;
    localzbbx.e = zc.a(this.c, i);
    localzbbx.f = zc.a(this.c, i + 4);
    i += 8;
    if ((this.c[i] & 0xFF & 0x2) != 0) {
      localzbbx.b = 0;
    }
    if ((this.c[i] & 0xFF & 0x1) != 0) {
      localzbbx.b = 1;
    }
    i += 2;
    localzbbx.c = ((this.c[i] & 0xFF & 0x2) != 0);
    localzbbx.g = ((this.c[i] & 0xFF & 0x80) != 0);
    localzbbx.h = ((this.c[(i + 1)] & 0xFF & 0x1) != 0);
    i += 2;
    localzbbx.d = new byte[16];
    System.arraycopy(this.c, i, localzbbx.d, 0, 16);
    i += 16;
    localzbbx.k = zc.a(this.c, i);
    i += 4;
    localzbbx.i = (zc.a(this.c, i) + localzbbx.k);
    i += 4;
    localzbbx.a(zcgj.d(this.c, i));
    return localzbbx;
  }
  
  zbbu d()
    throws Exception
  {
    zbcc localzbcc = new zbcc();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbcc.C = localzbcn.b;
    localzbcc.B = localzbcn.d;
    localzbcc.A = localzbcn.e;
    localzbcc.b = (localzbcn.c == 34);
    int i = 14;
    localzbcc.w = zc.b(this.c, i);
    i += 2;
    localzbcc.p = ((this.c[i] & 0xFF & 0x1) != 0);
    localzbcc.q = ((this.c[i] & 0xFF & 0x2) != 0);
    i++;
    i += 2;
    localzbcc.s = ((this.c[i] & 0xFF & 0x2) != 0);
    localzbcc.a((byte)((this.c[i] & 0xFF) >> 2));
    localzbcc.c(this.c[(i + 1)]);
    i += 2;
    int j = zc.b(this.c, i);
    i += 2;
    localzbcc.u = ((j & 0x1) != 0);
    i += 2;
    localzbcc.t = ((this.c[i] & 0xFF & 0x2) != 0);
    localzbcc.b((byte)((this.c[i] & 0xFF) >> 2));
    localzbcc.d(this.c[(i + 1)]);
    i += 2;
    int k = zc.b(this.c, i);
    i += 2;
    localzbcc.v = ((k & 0x1) != 0);
    i += 8;
    localzbcc.x = zcgj.d(this.c, i);
    i += 4 + localzbcc.x.length() * 2;
    localzbcc.d = b(this.c, i);
    i += localzbcc.d.length;
    localzbcc.j = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.j != null) {
      i += localzbcc.j.length() * 2;
    }
    localzbcc.l = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.l != null) {
      i += localzbcc.l.length() * 2;
    }
    localzbcc.n = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.n != null) {
      i += localzbcc.n.length() * 2;
    }
    localzbcc.y = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.y != null) {
      i += localzbcc.y.length() * 2;
    }
    localzbcc.h = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.h != null) {
      i += localzbcc.h.length() * 2;
    }
    localzbcc.c = b(this.c, i);
    i += localzbcc.c.length;
    localzbcc.k = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.k != null) {
      i += localzbcc.k.length() * 2;
    }
    localzbcc.m = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.m != null) {
      i += localzbcc.m.length() * 2;
    }
    localzbcc.o = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.o != null) {
      i += localzbcc.o.length() * 2;
    }
    localzbcc.z = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.z != null) {
      i += localzbcc.z.length() * 2;
    }
    localzbcc.i = zcgj.d(this.c, i);
    i += 4;
    if (localzbcc.i != null) {
      i += localzbcc.i.length() * 2;
    }
    return localzbcc;
  }
  
  private static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    int i = zc.a(paramArrayOfByte, paramInt);
    int j = zc.a(paramArrayOfByte, paramInt + i + 4);
    byte[] arrayOfByte = new byte[8 + i + j];
    System.arraycopy(paramArrayOfByte, paramInt, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  zbbu e()
    throws Exception
  {
    zbco localzbco = new zbco();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbco.e = localzbcn.b;
    localzbco.g = localzbcn.d;
    localzbco.d = localzbcn.e;
    localzbco.f = localzbcn.h;
    int i = 14;
    localzbco.c = zcgj.d(this.c, i);
    i += localzbco.c.length() * 2 + 4;
    localzbco.b = zcgj.d(this.c, i);
    i += localzbco.b.length() * 2 + 4;
    return localzbco;
  }
  
  zbbu f()
    throws Exception
  {
    zbch localzbch = new zbch();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbch.d = localzbcn.b;
    localzbch.g = localzbcn.d;
    localzbch.c = localzbcn.e;
    localzbch.e = localzbcn.h;
    int i = 14;
    localzbch.f = (zc.e(this.c, i) & 0xFFFF);
    i += 2;
    localzbch.b = zcgj.d(this.c, i);
    return localzbch;
  }
  
  zbbu g()
  {
    zbcb localzbcb = new zbcb();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    switch (localzbcn.c)
    {
    case 43: 
      localzbcb.c = 0;
      break;
    case 44: 
      localzbcb.c = 1;
      break;
    default: 
      localzbcb.c = 0;
    }
    int i = 14;
    localzbcb.b = new byte[16];
    System.arraycopy(this.c, i, localzbcb.b, 0, 16);
    return localzbcb;
  }
  
  zbbu h()
    throws Exception
  {
    zbcg localzbcg = new zbcg();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbcg.g = localzbcn.b;
    localzbcg.i = localzbcn.d;
    localzbcg.e = localzbcn.e;
    localzbcg.h = localzbcn.h;
    switch (localzbcn.c)
    {
    case 0: 
      localzbcg.b = 5;
      break;
    case 1: 
      localzbcg.b = 4;
      break;
    case 2: 
      localzbcg.b = 3;
      break;
    case 3: 
      localzbcg.b = 2;
      break;
    }
    int i = 14;
    localzbcg.d = ((this.c[i] & 0xFF & 0x1) != 0);
    i++;
    localzbcg.f = zcgj.a(this.c, i);
    int j = 1;
    while (j != 0)
    {
      this.b = this.e.a();
      switch (this.b)
      {
      case 404: 
        localzbcg.b().a(a());
        break;
      case 419: 
        localzbcg.b().a(k());
        break;
      case 409: 
        zbbu localzbbu = j();
        if (localzbbu != null) {
          localzbcg.b().a(localzbbu);
        }
        break;
      case 406: 
        this.d = this.e.b();
        this.e.a(this.d);
        j = 0;
      }
    }
    return localzbcg;
  }
  
  zbbu i()
    throws Exception
  {
    zbbz localzbbz = new zbbz();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbcn.a(localzbbz);
    int i = 14;
    localzbbz.b = zcgj.a(this.c, i);
    i += 16;
    localzbbz.c = zcgj.a(this.c, i);
    i += 16;
    localzbbz.g = (zc.e(this.c, i) & 0xFFFF);
    int j = 1;
    while (j != 0)
    {
      this.b = this.e.a();
      switch (this.b)
      {
      case 404: 
        localzbbz.d().a(a());
        break;
      case 419: 
        localzbbz.d().a(k());
        break;
      case 409: 
        zbbu localzbbu = j();
        if (localzbbu != null) {
          localzbbz.d().a(localzbbu);
        }
        break;
      case 408: 
        this.d = this.e.b();
        this.e.a(this.d);
        j = 0;
      }
    }
    return localzbbz;
  }
  
  zbbu j()
    throws Exception
  {
    zbbw localzbbw = new zbbw();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbcn.a(localzbbw);
    int i = 14;
    int j = zc.a(this.c, i);
    i += 4;
    int k = zc.a(this.c, i);
    i += 4;
    int m = 0;
    int n = 0;
    if (localzbcn.c == 8)
    {
      int i1 = zc.b(this.c, i);
      int i2 = a(i1 & 0x7);
      n = a(i1 >> 3 & 0x7);
      localzbbw.i = ((i1 & 0x40) != 0);
      localzbbw.g = ((i1 & 0x80) != 0);
      localzbbw.c = ((i1 & 0x100) != 0);
      m = (i1 & 0x200) != 0 ? 1 : 0;
      localzbbw.o = ((i1 & 0x400) != 0);
      localzbbw.l = ((i1 & 0x800) != 0);
      localzbbw.b = ((i1 & 0x1000) != 0);
      i3 = (i1 & 0x2000) != 0 ? 1 : 0;
      i += 2;
      localzbbw.e = (this.c[i] & 0xFF);
      i++;
      localzbbw.f = ((this.c[i] & 0xFF & 0x1) != 0);
      localzbbw.h = ((this.c[i] & 0xFF & 0x2) != 0);
      localzbbw.d = ((this.c[i] & 0xFF & 0x4) != 0);
      i4 = (this.c[i] & 0xFF & 0x8) != 0 ? 1 : 0;
      i++;
      int i5 = zc.a(this.c, i);
      i += 4;
      if (i + 4 <= this.c.length)
      {
        int i6 = zc.a(this.c, i) / 100;
        i += 4;
        localzbbw.t = new Font[i6];
        for (i7 = 0; i7 < i6; i7++)
        {
          localzbbw.t[i7] = new Font(this.f.getWorksheets(), null, false);
          i = a(localzbbw.t[i7], i);
        }
      }
    }
    zbby[] arrayOfzbby = new zbby[2];
    zbcp[] arrayOfzbcp = new zbcp[2];
    int i3 = 0;
    int i4 = 0;
    byte[] arrayOfByte = null;
    String str = null;
    int i7 = 1;
    while (i7 != 0)
    {
      this.b = this.e.a();
      switch (this.b)
      {
      case 62: 
        this.c = this.e.d();
        i = 8;
        zbbj localzbbj = zchn.a(this.c, 8, this.a);
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, localzbbj, null);
        }
        break;
      case 1: 
        this.c = this.e.d();
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, null, null);
        }
        break;
      case 2: 
        this.c = this.e.d();
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, Double.valueOf(zayi.a(this.c, 8)), null);
        }
        break;
      case 3: 
        this.c = this.e.d();
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, ztr.b(this.c[8]), null);
        }
        break;
      case 4: 
        this.c = this.e.d();
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, this.c[8] != 0 ? znq.d : znq.e, null);
        }
        break;
      case 5: 
        this.c = this.e.d();
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, Double.valueOf(zc.f(this.c, 8)), null);
        }
        break;
      case 6: 
        this.c = this.e.d();
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, zcgj.d(this.c, 8), null);
        }
        break;
      case 8: 
        this.c = this.e.d();
        i = 8;
        int[] arrayOfInt = { i };
        str = zcgj.a(this.c, arrayOfInt);
        i = arrayOfInt[0];
        i += 2;
        arrayOfByte = new byte[this.c.length - 10 - 4 - str.length() * 2];
        System.arraycopy(this.c, i, arrayOfByte, 0, arrayOfByte.length);
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, str, arrayOfByte);
        }
        break;
      case 9: 
        this.c = this.e.d();
        arrayOfByte = new byte[this.c.length - 18];
        System.arraycopy(this.c, 18, arrayOfByte, 0, this.c.length - 18);
        if (i3 < 2) {
          arrayOfzbby[(i3++)] = a(localzbbw, this.c, 0, j, Double.valueOf(zc.f(this.c, 8)), arrayOfByte);
        }
        break;
      case 505: 
        zbcp localzbcp = m();
        if (i4 < 2) {
          arrayOfzbcp[(i4++)] = localzbcp;
        }
        break;
      case 410: 
        this.d = this.e.b();
        this.e.a(this.d);
        i7 = 0;
        break;
      default: 
        this.d = this.e.b();
        this.e.a(this.d);
      }
    }
    if (localzbcn.c != 8) {
      return null;
    }
    i4 = 0;
    if ((localzbbw.c) && (m == 0)) {
      localzbbw.r = arrayOfzbcp[(i4++)];
    }
    localzbbw.s = arrayOfzbcp[i4];
    i3 = 0;
    if (n != 0) {
      localzbbw.p = arrayOfzbby[(i3++)];
    }
    localzbbw.q = arrayOfzbby[i3];
    return localzbbw;
  }
  
  zbbu k()
    throws Exception
  {
    zbcd localzbcd = new zbcd();
    this.c = this.e.d();
    zbcn localzbcn = a(this.c, 0);
    localzbcd.e = localzbcn.h;
    int i = 14;
    localzbcd.h = ((this.c[i] & 0xFF & 0x1) != 0);
    int j = (this.c[i] & 0xFF & 0x1) != 0 ? 1 : 0;
    localzbcd.d = ((this.c[i] & 0xFF & 0x4) != 0);
    i++;
    localzbcd.g = zc.a(this.c, i);
    i += 4;
    localzbcd.c = zc.a(this.c, i);
    if (localzbcd.c == Integer.MAX_VALUE) {
      localzbcd.c = 0;
    }
    i += 4;
    localzbcd.f = zcgj.b(this.c, i);
    int k = 1;
    while (k != 0)
    {
      this.b = this.e.a();
      switch (this.b)
      {
      case 505: 
        zbcp localzbcp = m();
        localzbcd.b = localzbcp;
        break;
      case 420: 
        this.d = this.e.b();
        this.e.a(this.d);
        k = 0;
        break;
      default: 
        this.d = this.e.b();
        this.e.a(this.d);
      }
    }
    return localzbcd;
  }
  
  private zbcp m()
    throws Exception
  {
    this.d = this.e.b();
    this.e.a(this.d);
    zbcp localzbcp = null;
    for (;;)
    {
      this.b = this.e.a();
      switch (this.b)
      {
      case 507: 
        localzbcp = new zbcp();
        this.c = this.e.d();
        zcdi localzcdi = zchu.a(this.c, 0, this.f.getWorksheets());
        localzbcp.c = localzcdi.b;
        localzbcp.b = localzcdi.a;
        break;
      case 506: 
        this.d = this.e.b();
        this.e.a(this.d);
        return localzbcp;
      default: 
        this.d = this.e.b();
        this.e.a(this.d);
      }
    }
  }
  
  private zbby a(zbbu paramzbbu, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, Object paramObject, byte[] paramArrayOfByte2)
  {
    int i = zc.a(paramArrayOfByte1, paramInt1);
    int j = ((Integer)this.a.d.get(Integer.valueOf(zc.a(paramArrayOfByte1, paramInt1 + 4) & 0xFFFFFF))).intValue();
    zbby localzbby = new zbby(paramzbbu, paramInt2, i);
    localzbby.d = j;
    localzbby.e = paramObject;
    localzbby.h = paramArrayOfByte2;
    return localzbby;
  }
  
  private int a(Font paramFont, int paramInt)
    throws Exception
  {
    paramFont.setName(zcgj.e(this.c, paramInt));
    paramInt += 64;
    paramFont.c(zc.a(this.c, paramInt));
    paramInt += 4;
    paramFont.setItalic((this.c[paramInt] & 0xFF & 0x2) != 0);
    paramFont.setStrikeout((this.c[paramInt] & 0xFF & 0x80) != 0);
    paramInt += 4;
    paramFont.b(zc.b(this.c, paramInt));
    paramInt += 2;
    switch (this.c[paramInt])
    {
    case 1: 
      paramFont.setSuperscript(true);
      break;
    case 2: 
      paramFont.setSubscript(true);
    }
    paramInt += 2;
    switch (this.c[paramInt])
    {
    case 1: 
      paramFont.setUnderline(1);
      break;
    case 2: 
      paramFont.setUnderline(2);
      break;
    case 3: 
      paramFont.setUnderline(3);
      break;
    case 4: 
      paramFont.setUnderline(4);
    }
    paramInt++;
    paramFont.a(this.c[paramInt]);
    paramInt++;
    paramFont.setCharset(this.c[paramInt]);
    paramInt++;
    paramInt += 9;
    switch (this.c[paramInt])
    {
    case 1: 
      paramFont.a("Major");
      break;
    case 2: 
      paramFont.a("Minor");
    }
    paramInt += 4;
    int i = 0;
    boolean[] arrayOfBoolean = { i };
    paramFont.a(zchu.a(this.c, paramInt, arrayOfBoolean));
    i = arrayOfBoolean[0];
    paramInt += 8;
    return paramInt;
  }
  
  static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
    case 2: 
      return 1;
    case 3: 
      return 4;
    case 4: 
      return 2;
    case 5: 
      return 5;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */