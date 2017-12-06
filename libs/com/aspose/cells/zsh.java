package com.aspose.cells;

import com.aspose.cells.a.e.zf;

class zsh
{
  public static zsj a(zcki paramzcki)
  {
    zsj localzsj = null;
    if (paramzcki == zcki.a) {
      localzsj = a();
    } else {
      zf.a(false);
    }
    return localzsj;
  }
  
  public static zckj a(zsj paramzsj, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zsj localzsj = paramzsj;
    int i = paramInt1;
    if ((localzsj == null) || (paramArrayOfByte == null)) {
      return zckj.b;
    }
    if (localzsj.a.a != zcki.a) {
      return zckj.c;
    }
    if (paramInt2 == 0) {
      return zckj.a;
    }
    zsi localzsi = localzsj.b;
    int j = localzsi.g + (paramInt2 << 3);
    if (j < localzsi.g) {
      localzsi.h += 1;
    }
    localzsi.h += (paramInt2 >> 29);
    localzsi.g = j;
    if (localzsi.a != 0)
    {
      int k = localzsi.a;
      int m = 64 - localzsi.a;
      if (paramInt2 < m)
      {
        zaoy.a(localzsi.b, k, paramArrayOfByte, i, paramInt2);
        localzsi.a += paramInt2;
        return zckj.a;
      }
      zaoy.a(localzsi.b, k, paramArrayOfByte, i, m);
      i += m;
      paramInt2 -= m;
      a(localzsi);
      localzsi.a = 0;
    }
    while (paramInt2 >= 64)
    {
      zaoy.a(localzsi.b, 0, paramArrayOfByte, i, 64);
      i += 64;
      paramInt2 -= 64;
      a(localzsi);
    }
    zaoy.a(localzsi.b, 0, paramArrayOfByte, i, paramInt2);
    localzsi.a = paramInt2;
    return zckj.a;
  }
  
  public static zckj a(zsj paramzsj, byte[] paramArrayOfByte, int paramInt)
  {
    zsj localzsj = paramzsj;
    int i = 0;
    if ((localzsj == null) || (paramArrayOfByte == null)) {
      return zckj.b;
    }
    if (localzsj.a.a != zcki.a) {
      return zckj.c;
    }
    if (localzsj.a.b > paramInt) {
      return zckj.d;
    }
    zsi localzsi = localzsj.b;
    i = a(localzsi.c, paramArrayOfByte, i);
    i = a(localzsi.d, paramArrayOfByte, i);
    i = a(localzsi.e, paramArrayOfByte, i);
    i = a(localzsi.f, paramArrayOfByte, i);
    b(localzsi);
    return zckj.a;
  }
  
  private static void a(zsi paramzsi)
  {
    int i = paramzsi.c;
    int j = paramzsi.d;
    int k = paramzsi.e;
    int m = paramzsi.f;
    int[] arrayOfInt = paramzsi.b;
    i += (int)(arrayOfInt[0] + 3614090360L + a(j, k, m));
    i = a(i, 7);
    i += j;
    m += (int)(arrayOfInt[1] + 3905402710L + a(i, j, k));
    m = a(m, 12);
    m += i;
    k += (int)(arrayOfInt[2] + 606105819L + a(m, i, j));
    k = a(k, 17);
    k += m;
    j += (int)(arrayOfInt[3] + 3250441966L + a(k, m, i));
    j = a(j, 22);
    j += k;
    i += (int)(arrayOfInt[4] + 4118548399L + a(j, k, m));
    i = a(i, 7);
    i += j;
    m += (int)(arrayOfInt[5] + 1200080426L + a(i, j, k));
    m = a(m, 12);
    m += i;
    k += (int)(arrayOfInt[6] + 2821735955L + a(m, i, j));
    k = a(k, 17);
    k += m;
    j += (int)(arrayOfInt[7] + 4249261313L + a(k, m, i));
    j = a(j, 22);
    j += k;
    i += (int)(arrayOfInt[8] + 1770035416L + a(j, k, m));
    i = a(i, 7);
    i += j;
    m += (int)(arrayOfInt[9] + 2336552879L + a(i, j, k));
    m = a(m, 12);
    m += i;
    k += (int)(arrayOfInt[10] + 4294925233L + a(m, i, j));
    k = a(k, 17);
    k += m;
    j += (int)(arrayOfInt[11] + 2304563134L + a(k, m, i));
    j = a(j, 22);
    j += k;
    i += (int)(arrayOfInt[12] + 1804603682L + a(j, k, m));
    i = a(i, 7);
    i += j;
    m += (int)(arrayOfInt[13] + 4254626195L + a(i, j, k));
    m = a(m, 12);
    m += i;
    k += (int)(arrayOfInt[14] + 2792965006L + a(m, i, j));
    k = a(k, 17);
    k += m;
    j += (int)(arrayOfInt[15] + 1236535329L + a(k, m, i));
    j = a(j, 22);
    j += k;
    i += (int)(arrayOfInt[1] + 4129170786L + b(j, k, m));
    i = a(i, 5);
    i += j;
    m += (int)(arrayOfInt[6] + 3225465664L + b(i, j, k));
    m = a(m, 9);
    m += i;
    k += (int)(arrayOfInt[11] + 643717713L + b(m, i, j));
    k = a(k, 14);
    k += m;
    j += (int)(arrayOfInt[0] + 3921069994L + b(k, m, i));
    j = a(j, 20);
    j += k;
    i += (int)(arrayOfInt[5] + 3593408605L + b(j, k, m));
    i = a(i, 5);
    i += j;
    m += (int)(arrayOfInt[10] + 38016083L + b(i, j, k));
    m = a(m, 9);
    m += i;
    k += (int)(arrayOfInt[15] + 3634488961L + b(m, i, j));
    k = a(k, 14);
    k += m;
    j += (int)(arrayOfInt[4] + 3889429448L + b(k, m, i));
    j = a(j, 20);
    j += k;
    i += (int)(arrayOfInt[9] + 568446438L + b(j, k, m));
    i = a(i, 5);
    i += j;
    m += (int)(arrayOfInt[14] + 3275163606L + b(i, j, k));
    m = a(m, 9);
    m += i;
    k += (int)(arrayOfInt[3] + 4107603335L + b(m, i, j));
    k = a(k, 14);
    k += m;
    j += (int)(arrayOfInt[8] + 1163531501L + b(k, m, i));
    j = a(j, 20);
    j += k;
    i += (int)(arrayOfInt[13] + 2850285829L + b(j, k, m));
    i = a(i, 5);
    i += j;
    m += (int)(arrayOfInt[2] + 4243563512L + b(i, j, k));
    m = a(m, 9);
    m += i;
    k += (int)(arrayOfInt[7] + 1735328473L + b(m, i, j));
    k = a(k, 14);
    k += m;
    j += (int)(arrayOfInt[12] + 2368359562L + b(k, m, i));
    j = a(j, 20);
    j += k;
    i += (int)(arrayOfInt[5] + 4294588738L + c(j, k, m));
    i = a(i, 4);
    i += j;
    m += (int)(arrayOfInt[8] + 2272392833L + c(i, j, k));
    m = a(m, 11);
    m += i;
    k += (int)(arrayOfInt[11] + 1839030562L + c(m, i, j));
    k = a(k, 16);
    k += m;
    j += (int)(arrayOfInt[14] + 4259657740L + c(k, m, i));
    j = a(j, 23);
    j += k;
    i += (int)(arrayOfInt[1] + 2763975236L + c(j, k, m));
    i = a(i, 4);
    i += j;
    m += (int)(arrayOfInt[4] + 1272893353L + c(i, j, k));
    m = a(m, 11);
    m += i;
    k += (int)(arrayOfInt[7] + 4139469664L + c(m, i, j));
    k = a(k, 16);
    k += m;
    j += (int)(arrayOfInt[10] + 3200236656L + c(k, m, i));
    j = a(j, 23);
    j += k;
    i += (int)(arrayOfInt[13] + 681279174L + c(j, k, m));
    i = a(i, 4);
    i += j;
    m += (int)(arrayOfInt[0] + 3936430074L + c(i, j, k));
    m = a(m, 11);
    m += i;
    k += (int)(arrayOfInt[3] + 3572445317L + c(m, i, j));
    k = a(k, 16);
    k += m;
    j += (int)(arrayOfInt[6] + 76029189L + c(k, m, i));
    j = a(j, 23);
    j += k;
    i += (int)(arrayOfInt[9] + 3654602809L + c(j, k, m));
    i = a(i, 4);
    i += j;
    m += (int)(arrayOfInt[12] + 3873151461L + c(i, j, k));
    m = a(m, 11);
    m += i;
    k += (int)(arrayOfInt[15] + 530742520L + c(m, i, j));
    k = a(k, 16);
    k += m;
    j += (int)(arrayOfInt[2] + 3299628645L + c(k, m, i));
    j = a(j, 23);
    j += k;
    i += (int)(arrayOfInt[0] + 4096336452L + d(j, k, m));
    i = a(i, 6);
    i += j;
    m += (int)(arrayOfInt[7] + 1126891415L + d(i, j, k));
    m = a(m, 10);
    m += i;
    k += (int)(arrayOfInt[14] + 2878612391L + d(m, i, j));
    k = a(k, 15);
    k += m;
    j += (int)(arrayOfInt[5] + 4237533241L + d(k, m, i));
    j = a(j, 21);
    j += k;
    i += (int)(arrayOfInt[12] + 1700485571L + d(j, k, m));
    i = a(i, 6);
    i += j;
    m += (int)(arrayOfInt[3] + 2399980690L + d(i, j, k));
    m = a(m, 10);
    m += i;
    k += (int)(arrayOfInt[10] + 4293915773L + d(m, i, j));
    k = a(k, 15);
    k += m;
    j += (int)(arrayOfInt[1] + 2240044497L + d(k, m, i));
    j = a(j, 21);
    j += k;
    i += (int)(arrayOfInt[8] + 1873313359L + d(j, k, m));
    i = a(i, 6);
    i += j;
    m += (int)(arrayOfInt[15] + 4264355552L + d(i, j, k));
    m = a(m, 10);
    m += i;
    k += (int)(arrayOfInt[6] + 2734768916L + d(m, i, j));
    k = a(k, 15);
    k += m;
    j += (int)(arrayOfInt[13] + 1309151649L + d(k, m, i));
    j = a(j, 21);
    j += k;
    i += (int)(arrayOfInt[4] + 4149444226L + d(j, k, m));
    i = a(i, 6);
    i += j;
    m += (int)(arrayOfInt[11] + 3174756917L + d(i, j, k));
    m = a(m, 10);
    m += i;
    k += (int)(arrayOfInt[2] + 718787259L + d(m, i, j));
    k = a(k, 15);
    k += m;
    j += (int)(arrayOfInt[9] + 3951481745L + d(k, m, i));
    j = a(j, 21);
    j += k;
    paramzsi.c += i;
    paramzsi.d += j;
    paramzsi.e += k;
    paramzsi.f += m;
  }
  
  private static zsj a()
  {
    zsj localzsj = new zsj();
    localzsj.a.a = zcki.a;
    localzsj.a.b = 16;
    b(localzsj.b);
    return localzsj;
  }
  
  private static void b(zsi paramzsi)
  {
    paramzsi.c = 1732584193;
    paramzsi.d = -271733879;
    paramzsi.e = -1732584194;
    paramzsi.f = 271733878;
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt2 ^ paramInt3) & paramInt1 ^ paramInt3;
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 ^ paramInt2) & paramInt3 ^ paramInt2;
  }
  
  private static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 ^ paramInt2 ^ paramInt3;
  }
  
  private static int d(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 | paramInt3 ^ 0xFFFFFFFF) ^ paramInt2;
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 << paramInt2 | paramInt1 >>> 32 - paramInt2;
  }
  
  private static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    paramArrayOfByte[(paramInt2++)] = ((byte)(paramInt1 & 0xFF));
    paramArrayOfByte[(paramInt2++)] = ((byte)(paramInt1 >>> 8 & 0xFF));
    paramArrayOfByte[(paramInt2++)] = ((byte)(paramInt1 >>> 16 & 0xFF));
    paramArrayOfByte[(paramInt2++)] = ((byte)(paramInt1 >>> 24 & 0xFF));
    return paramInt2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */