package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.c.zr;
import com.aspose.cells.a.d.zcb;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.d.zgi;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;

class zcf
{
  private byte a = 5;
  private zwv b;
  private zde c;
  private int d;
  private int e;
  private int f;
  
  zcf(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    a(paramArrayOfByte, paramInt, paramInt);
  }
  
  zcf()
  {
    this.f = 96;
    this.b = new zwv();
    this.c = new zde(this);
  }
  
  public ImageFormat a()
    throws Exception
  {
    if ((f() == null) || (f().e() == null)) {
      return ImageFormat.getBmp();
    }
    switch (n())
    {
    case -4: 
    case -2: 
      return ImageFormat.getBmp();
    case 7: 
      return ImageFormat.getBmp();
    case 2: 
      return ImageFormat.getEmf();
    case -1: 
    case 0: 
    case 1: 
    case 32: 
      return a(f().e());
    case -3: 
      return ImageFormat.getGif();
    case 5: 
      return ImageFormat.getJpeg();
    case 4: 
      return ImageFormat.getEmf();
    case 6: 
      return ImageFormat.getPng();
    case 3: 
      return ImageFormat.getWmf();
    }
    return ImageFormat.getBmp();
  }
  
  byte[] b()
  {
    if (f().e() == null) {
      return null;
    }
    switch (n())
    {
    case -4: 
    case -2: 
      return f().e();
    case 7: 
      return b(f().e());
    case 2: 
      return zckd.a(false, false, k(), l(), m(), f().e(), f().a);
    case -1: 
    case 0: 
    case 1: 
    case 32: 
      return f().e();
    case -3: 
      return f().e();
    case 5: 
      return f().e();
    case 4: 
      return zckd.a(false, true, k(), l(), m(), f().e(), f().a);
    case 6: 
      return f().e();
    case 3: 
      return zckd.a(true, false, k(), l(), m(), f().e(), f().a);
    }
    return null;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    int i = paramArrayOfByte.length;
    zh localzh = new zh(paramArrayOfByte);
    int[] arrayOfInt = a(localzh, paramInt1, paramInt2);
    byte b1 = (byte)arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = arrayOfInt[2];
    za localza;
    Object localObject2;
    switch (b1)
    {
    case 2: 
    case 3: 
    case 4: 
      i = (int)(localzh.h() - localzh.i());
      paramArrayOfByte = new byte[i];
      int m = localzh.a(paramArrayOfByte, 0, paramArrayOfByte.length);
      paramArrayOfByte = zckd.a(paramArrayOfByte);
      break;
    case 5: 
    case 6: 
      paramArrayOfByte = new byte[(int)localzh.h()];
      localzh.a(paramArrayOfByte, 0, paramArrayOfByte.length);
      break;
    case -3: 
      b1 = 6;
      localObject1 = new zh();
      localza = (za)za.a(localzh);
      if (arrayOfInt[4] == 0) {
        localza.a(96.0F, 96.0F);
      }
      localza.a((zm)localObject1, ImageFormat.getPng());
      localza.d();
      if (arrayOfInt[4] == 0)
      {
        localObject2 = ((zh)localObject1).o();
        localObject3 = zcc.r((byte[])localObject2);
        j = (int)(((zcb)localObject3).f() * paramInt1 / 72.0D + 0.5D);
        k = (int)(((zcb)localObject3).g() * paramInt2 / 72.0D + 0.5D);
      }
      ((zh)localObject1).b(0L);
      localObject2 = new zh();
      Object localObject3 = new zgi(paramArrayOfByte, (zm)localObject2);
      ((zgi)localObject3).a((zm)localObject1);
      ((zh)localObject1).a();
      paramArrayOfByte = ((zh)localObject2).o();
      ((zh)localObject2).a();
      break;
    case -2: 
    case -1: 
    case 0: 
    case 1: 
    default: 
      b1 = 6;
      localObject1 = new zh();
      localza = (za)za.a(localzh);
      if (arrayOfInt[4] == 0) {
        localza.a(96.0F, 96.0F);
      }
      localza.a((zm)localObject1, ImageFormat.getPng());
      localza.d();
      paramArrayOfByte = ((zh)localObject1).o();
      if (arrayOfInt[4] == 0)
      {
        localObject2 = zcc.r(paramArrayOfByte);
        j = (int)(((zcb)localObject2).f() * paramInt1 / 72.0D + 0.5D);
        k = (int)(((zcb)localObject2).g() * paramInt2 / 72.0D + 0.5D);
      }
      ((zh)localObject1).a();
    }
    Object localObject1 = zr.a(paramArrayOfByte);
    this.b = new zwv();
    this.b.c = ((byte[])localObject1);
    this.a = b1;
    this.b.a = b1;
    this.b.b = b1;
    this.c = new zde(this, paramArrayOfByte, i);
    this.f = arrayOfInt[3];
    this.e = k;
    this.d = j;
  }
  
  static int[] a(zm paramzm, int paramInt1, int paramInt2)
    throws Exception
  {
    int[] arrayOfInt = new int[5];
    arrayOfInt[0] = 1;
    byte[] arrayOfByte = null;
    try
    {
      arrayOfByte = new byte[(int)paramzm.h()];
      paramzm.a(arrayOfByte, 0, arrayOfByte.length);
      int i = zcc.a(arrayOfByte);
      zcb localzcb = zcc.a(arrayOfByte, i);
      double d1 = 0.5D;
      switch (i)
      {
      case 6: 
        arrayOfInt[0] = 254;
        break;
      case 1: 
        arrayOfInt[0] = 2;
        d1 = 0.9D;
        break;
      case 7: 
        arrayOfInt[0] = 253;
        break;
      case 4: 
        arrayOfInt[0] = 5;
        break;
      case 3: 
        arrayOfInt[0] = 4;
        break;
      case 5: 
        arrayOfInt[0] = 6;
        break;
      case 8: 
        arrayOfInt[0] = 1;
        break;
      case 2: 
        arrayOfInt[0] = 3;
        break;
      case 0: 
        arrayOfInt[0] = 1;
      }
      double d2 = Math.abs(localzcb.f());
      arrayOfInt[1] = ((int)(d2 * paramInt1 / 72.0D + 0.5D));
      d2 = Math.abs(localzcb.g());
      arrayOfInt[2] = ((int)(d2 * paramInt1 / 72.0D + d1));
      arrayOfInt[3] = ((int)localzcb.d());
      arrayOfInt[4] = (arrayOfInt[3] == 96 ? 0 : 1);
    }
    catch (Exception localException)
    {
      return arrayOfInt;
    }
    if (paramzm.e()) {
      if (arrayOfInt[0] == 3)
      {
        if (arrayOfByte != null)
        {
          if (zc.a(arrayOfByte, 0) == -1698247209) {
            paramzm.a(22L, 0);
          } else {
            paramzm.a(0L, 0);
          }
        }
        else {
          paramzm.a(22L, 0);
        }
      }
      else {
        paramzm.a(0L, 0);
      }
    }
    return arrayOfInt;
  }
  
  static ImageFormat a(byte[] paramArrayOfByte)
    throws Exception
  {
    zh localzh = new zh(paramArrayOfByte);
    zj localzj = zj.a(localzh);
    return localzj.e();
  }
  
  static byte[] b(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte[0] == 66) && (paramArrayOfByte[1] == 77)) {
      return paramArrayOfByte;
    }
    try
    {
      int i = zc.a(paramArrayOfByte, 20);
      byte[] arrayOfByte = new byte[paramArrayOfByte.length + 54];
      arrayOfByte[0] = 66;
      arrayOfByte[1] = 77;
      System.arraycopy(zc.a(arrayOfByte.length), 0, arrayOfByte, 2, 4);
      arrayOfByte[10] = 54;
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 14, paramArrayOfByte.length);
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return paramArrayOfByte;
  }
  
  void a(zcf paramzcf)
  {
    this.b = new zwv();
    this.b.a(paramzcf.g());
    this.a = paramzcf.a;
    this.c = new zde(this);
    this.c.a(paramzcf.c);
    this.e = paramzcf.e;
    this.d = paramzcf.d;
  }
  
  long c()
  {
    long l = this.c.b();
    if ((l & 0xFFFFFFFF) != 0L) {
      return (l & 0xFFFFFFFF) + 8L + 36L;
    }
    return 36L;
  }
  
  int d()
  {
    if (f().e() == null) {
      return 36;
    }
    return this.c.f() + 8 + 36;
  }
  
  void c(byte[] paramArrayOfByte)
  {
    int i = 2;
    i |= (this.a & 0xFF) << 4;
    System.arraycopy(zc.a(i), 0, paramArrayOfByte, 0, 2);
    paramArrayOfByte[2] = 7;
    paramArrayOfByte[3] = -16;
    long l = f().b();
    if ((l & 0xFFFFFFFF) == 0L) {
      System.arraycopy(zc.a((l & 0xFFFFFFFF) + 36L), 0, paramArrayOfByte, 4, 4);
    } else {
      System.arraycopy(zc.a((l & 0xFFFFFFFF) + 8L + 36L), 0, paramArrayOfByte, 4, 4);
    }
    int j = 8;
    paramArrayOfByte[j] = this.b.a;
    paramArrayOfByte[(j + 1)] = this.b.b;
    j += 2;
    System.arraycopy(this.b.c, 0, paramArrayOfByte, j, 16);
    j += 16;
    System.arraycopy(zc.a(this.b.d), 0, paramArrayOfByte, j, 2);
    System.arraycopy(zc.a((l & 0xFFFFFFFF) + 8L), 0, paramArrayOfByte, j + 2, 4);
    System.arraycopy(zc.a(this.b.e), 0, paramArrayOfByte, j + 6, 4);
    paramArrayOfByte[(j + 14)] = this.b.f;
    paramArrayOfByte[(j + 15)] = 0;
    j += 18;
    if (f().e() == null) {
      return;
    }
    i = f().d() << 4;
    System.arraycopy(zc.a(i), 0, paramArrayOfByte, j, 2);
    i = f().c();
    System.arraycopy(zc.a(i), 0, paramArrayOfByte, j + 2, 2);
    System.arraycopy(zc.a(l), 0, paramArrayOfByte, j + 4, 4);
    j += 8;
    if (this.c.a() != null)
    {
      System.arraycopy(this.c.a(), 0, paramArrayOfByte, j, this.c.a().length);
      j += this.c.a().length;
    }
    System.arraycopy(this.b.c, 0, paramArrayOfByte, j, 16);
    j += 16;
    if (f().g())
    {
      System.arraycopy(zc.a(f().a), 0, paramArrayOfByte, j, 4);
      j += 4;
      System.arraycopy(zc.a(0), 0, paramArrayOfByte, j, 4);
      System.arraycopy(zc.a(0), 0, paramArrayOfByte, j + 4, 4);
      int k = k();
      if ((n() == 3) && (this.f != 96)) {
        k = (int)(k * this.f / 96.0F + 0.5D);
      }
      System.arraycopy(zc.a(k), 0, paramArrayOfByte, j + 8, 4);
      k = l();
      if ((n() == 3) && (this.f != 96)) {
        k = (int)(k * this.f / 96.0F + 0.5D);
      }
      System.arraycopy(zc.a(k), 0, paramArrayOfByte, j + 12, 4);
      j += 16;
      k = (int)(k() / 96.0F * 914400.0F + 0.5D);
      System.arraycopy(zc.a(k), 0, paramArrayOfByte, j, 4);
      k = (int)(l() / 96.0F * 914400.0F + 0.5D);
      System.arraycopy(zc.a(k), 0, paramArrayOfByte, j + 4, 4);
      j += 8;
      k = f().e().length;
      System.arraycopy(zc.a(k), 0, paramArrayOfByte, j, 4);
      j += 4;
      paramArrayOfByte[j] = f().b;
      paramArrayOfByte[(j + 1)] = f().c;
      j += 2;
    }
    else
    {
      paramArrayOfByte[j] = f().d;
      j++;
    }
  }
  
  byte[] e()
  {
    long l = f().b();
    byte[] arrayOfByte = new byte[(int)((l & 0xFFFFFFFF) + 8L)];
    int i = 0;
    int j = f().d() << 4;
    System.arraycopy(zc.a(j), 0, arrayOfByte, i, 2);
    j = f().c();
    System.arraycopy(zc.a(j), 0, arrayOfByte, i + 2, 2);
    System.arraycopy(zc.a(l), 0, arrayOfByte, i + 4, 4);
    i += 8;
    if (this.c.a() != null)
    {
      System.arraycopy(this.c.a(), 0, arrayOfByte, i, this.c.a().length);
      i += this.c.a().length;
    }
    System.arraycopy(this.b.c, 0, arrayOfByte, i, 16);
    i += 16;
    if (f().g())
    {
      System.arraycopy(zc.a(f().a), 0, arrayOfByte, i, 4);
      i += 4;
      System.arraycopy(zc.a(0), 0, arrayOfByte, i, 4);
      System.arraycopy(zc.a(0), 0, arrayOfByte, i + 4, 4);
      int k = k();
      if ((n() == 3) && (this.f != 96)) {
        k = (int)(k * this.f / 96.0F + 0.5D);
      }
      System.arraycopy(zc.a(k), 0, arrayOfByte, i + 8, 4);
      k = l();
      if ((n() == 3) && (this.f != 96)) {
        k = (int)(k * this.f / 96.0F + 0.5D);
      }
      System.arraycopy(zc.a(k), 0, arrayOfByte, i + 12, 4);
      i += 16;
      k = (int)(k() / 96.0F * 914400.0F + 0.5D);
      System.arraycopy(zc.a(k), 0, arrayOfByte, i, 4);
      k = (int)(l() / 96.0F * 914400.0F + 0.5D);
      System.arraycopy(zc.a(k), 0, arrayOfByte, i + 4, 4);
      i += 8;
      k = f().e().length;
      System.arraycopy(zc.a(k), 0, arrayOfByte, i, 4);
      i += 4;
      arrayOfByte[i] = f().b;
      arrayOfByte[(i + 1)] = f().c;
      i += 2;
    }
    else
    {
      arrayOfByte[i] = f().d;
      i++;
    }
    if (f().e() != null) {
      System.arraycopy(f().e(), 0, arrayOfByte, i, f().e().length);
    }
    return arrayOfByte;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
  {
    this.f = paramInt;
    this.b = new zwv();
    this.c = new zde(this);
    int i = 0;
    zde localzde = this.c;
    localzde.a((short)((zc.e(paramArrayOfByte, i) & 0xFFFF) >> 4));
    localzde.a(zc.e(paramArrayOfByte, i + 2));
    switch (localzde.d())
    {
    case 1760: 
    case 1761: 
      a((byte)6);
      break;
    case 1960: 
    case 1961: 
      a((byte)6);
      break;
    case 1346: 
    case 1347: 
      a((byte)6);
      break;
    case 980: 
    case 981: 
      a((byte)2);
      break;
    case 534: 
    case 535: 
      a((byte)3);
      break;
    case 1130: 
    case 1131: 
      a((byte)5);
      break;
    }
    this.b.b = n();
    this.b.a = n();
    int j = zc.a(paramArrayOfByte, i + 4);
    i += 8;
    int k = 0;
    switch (n())
    {
    case 6: 
      k = (localzde.d() ^ 0x6E0) == 1 ? 1 : 0;
      break;
    case 7: 
      k = (localzde.d() ^ 0x7A8) == 1 ? 1 : 0;
      break;
    case 4: 
      k = (localzde.d() ^ 0x542) == 1 ? 1 : 0;
      break;
    }
    if (localzde.g())
    {
      i += 16;
      if (k != 0)
      {
        localzde.a(new byte[16]);
        System.arraycopy(paramArrayOfByte, i, localzde.a(), 0, 16);
        i += 16;
      }
      localzde.a = zc.a(paramArrayOfByte, i);
      i += 4;
      m = zc.a(paramArrayOfByte, i + 8) - zc.a(paramArrayOfByte, i);
      i += 16;
      a((int)(zc.a(paramArrayOfByte, i) * paramInt / 914400 + 0.5D));
      b((int)(zc.a(paramArrayOfByte, i + 4) * paramInt / 914400 + 0.5D));
      if ((n() == 3) && (k() != 0)) {
        c(m * 96 / k());
      }
      i += 8;
      i += 4;
      localzde.b = paramArrayOfByte[i];
      localzde.c = paramArrayOfByte[(i + 1)];
      i += 2;
    }
    else
    {
      if (k != 0)
      {
        localzde.a(new byte[16]);
        System.arraycopy(paramArrayOfByte, i, localzde.a(), 0, 16);
        i += 16;
      }
      localzde.d = paramArrayOfByte[(i + 16)];
      i += 17;
    }
    int m = paramArrayOfByte.length - i;
    localzde.b(new byte[m]);
    System.arraycopy(paramArrayOfByte, i, localzde.e(), 0, m);
    byte[] arrayOfByte = zr.a(localzde.e());
    g().c = arrayOfByte;
    if (!f().g()) {
      switch (n())
      {
      case 7: 
        a(zc.a(localzde.e(), 4));
        b(zc.a(localzde.e(), 8));
        break;
      default: 
        try
        {
          int[] arrayOfInt = zn.a(n() == -2, localzde.e(), paramInt);
          a(arrayOfInt[0]);
          b(arrayOfInt[1]);
        }
        catch (Exception localException) {}
      }
    }
  }
  
  zde f()
  {
    return this.c;
  }
  
  zwv g()
  {
    return this.b;
  }
  
  byte[] h()
  {
    return this.b.c;
  }
  
  void i()
  {
    g().e += 1;
  }
  
  void j()
  {
    g().e += 1;
  }
  
  int k()
  {
    return this.d;
  }
  
  void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  int l()
  {
    return this.e;
  }
  
  void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  int m()
  {
    return this.f;
  }
  
  void c(int paramInt)
  {
    this.f = paramInt;
  }
  
  byte n()
  {
    return this.a;
  }
  
  void a(byte paramByte)
  {
    this.a = paramByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */