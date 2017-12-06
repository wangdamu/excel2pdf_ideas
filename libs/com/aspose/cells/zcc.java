package com.aspose.cells;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class zcc
{
  private MessageDigest g;
  private long h = 0L;
  private long i = 0L;
  private byte[] j;
  long a;
  long b;
  String c;
  private boolean k;
  private zkt l;
  byte[] d;
  byte[] e;
  byte[] f;
  
  public zcc(String paramString1, byte[] paramArrayOfByte, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
    throws UnsupportedEncodingException
  {
    if ((paramString1 == null) || (paramString1.length() == 0)) {
      throw new IllegalArgumentException("The password could not be null or empty.");
    }
    try
    {
      this.g = MessageDigest.getInstance("SHA-1");
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
    byte[] arrayOfByte = paramString1.getBytes("UTF-16LE");
    this.a = paramLong1;
    this.b = paramLong5;
    this.c = paramString2;
    this.d = paramArrayOfByte;
    this.j = a(arrayOfByte, paramArrayOfByte);
    this.l = zks.a(zcke.b, zckh.c);
    if (this.j == null) {
      throw new IllegalArgumentException("The container's parameter is wrong.");
    }
    if ((this.c.equals("Microsoft Base Cryptographic Provider v1.0")) || (this.c.equals("Microsoft Base DSS and Diffie-Hellman Cryptographic Provider")) || (this.c.equals("Microsoft DH SChannel Cryptographic Provider")) || (this.c.equals("Microsoft Enhanced DSS and Diffie-Hellman Cryptographic Provider"))) {
      this.k = true;
    } else {
      this.k = false;
    }
  }
  
  public static zcc a(String paramString, int paramInt1, int paramInt2)
    throws UnsupportedEncodingException
  {
    byte[] arrayOfByte = { -3, 34, 93, -54, 1, 39, 59, -93, -92, -108, 96, -57, 85, 46, -12, 62 };
    String str = "";
    switch (paramInt1)
    {
    case 3: 
      str = "Microsoft Strong Cryptographic Provider";
      break;
    case 2: 
      str = "Microsoft Enhanced Cryptographic Provider v1.0";
      break;
    }
    zcc localzcc = new zcc(paramString, arrayOfByte, str, 1L, 0L, 32772L, 26625L, paramInt2);
    localzcc.d = new byte[] { -3, 34, 93, -54, 1, 39, 59, -93, -92, -108, 96, -57, 85, 46, -12, 62 };
    localzcc.e = new byte[16];
    localzcc.f = new byte[20];
    localzcc.a(0L);
    zks.b(localzcc.l, arrayOfByte, 0, 16, localzcc.e, 0, 16);
    System.arraycopy(localzcc.a(localzcc.d), 0, localzcc.f, 0, 20);
    zks.b(localzcc.l, localzcc.f, 0, 20, localzcc.f, 0, 20);
    return localzcc;
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte1 = new byte[paramArrayOfByte1.length + paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte1, 0, paramArrayOfByte2.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, paramArrayOfByte2.length, paramArrayOfByte1.length);
    byte[] arrayOfByte2 = a(arrayOfByte1);
    return arrayOfByte2;
  }
  
  public boolean b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int m = 16;
    a(0L);
    zks.a(this.l, paramArrayOfByte1, 0, m, paramArrayOfByte1, 0, m);
    byte[] arrayOfByte = new byte[20];
    arrayOfByte = a(paramArrayOfByte1);
    zks.a(this.l, paramArrayOfByte2, 0, 20, paramArrayOfByte2, 0, 20);
    return new String(paramArrayOfByte2).equals(new String(arrayOfByte));
  }
  
  public void a()
  {
    this.i = 0L;
    this.h = 0L;
  }
  
  public void a(long paramLong)
  {
    byte[] arrayOfByte1 = new byte[4];
    arrayOfByte1[0] = ((byte)(int)(paramLong & 0xFF));
    arrayOfByte1[1] = ((byte)(int)((paramLong & 0xFF00) >> 8));
    arrayOfByte1[2] = ((byte)(int)((paramLong & 0xFF0000) >> 16));
    arrayOfByte1[3] = ((byte)(int)((paramLong & 0xFFFFFFFFFF000000) >> 24));
    byte[] arrayOfByte2 = new byte[4 + this.j.length];
    System.arraycopy(this.j, 0, arrayOfByte2, 0, this.j.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, this.j.length, 4);
    byte[] arrayOfByte3 = a(arrayOfByte2);
    byte[] arrayOfByte4 = new byte[20];
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, (int)(this.b / 8L));
    if (this.k) {
      zks.a(this.l, zckf.b, arrayOfByte4, (int)(this.b / 8L), null, 0);
    } else {
      zks.b(this.l, zckf.b, arrayOfByte4, (int)(this.b / 8L), null, 0);
    }
  }
  
  public byte[] a(byte[] paramArrayOfByte, long paramLong)
  {
    return a(paramArrayOfByte, paramArrayOfByte.length, paramLong);
  }
  
  private byte[] a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    long l1 = paramLong;
    long l2 = paramLong;
    int m = 0;
    m = (int)(paramLong - this.i);
    if (paramLong % 1024L == m) {
      a(paramLong >> 10);
    }
    byte[] arrayOfByte2;
    int i1;
    if (m + this.i % 1024L > 1024L)
    {
      arrayOfByte2 = new byte[1024 - (int)(this.i % 1024L)];
      for (i1 = 0; i1 < arrayOfByte2.length; i1++) {
        arrayOfByte2[i1] = -52;
      }
      m = arrayOfByte2.length;
      zks.a(this.l, arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte2, 0, arrayOfByte2.length);
      a(paramLong >> 10);
      arrayOfByte2 = new byte[(int)(paramLong % 1024L)];
      for (i1 = 0; i1 < arrayOfByte2.length; i1++) {
        arrayOfByte2[i1] = -52;
      }
      m = arrayOfByte2.length;
      zks.a(this.l, arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte2, 0, arrayOfByte2.length);
    }
    else
    {
      arrayOfByte2 = new byte[m];
      for (i1 = 0; i1 < m; i1++) {
        arrayOfByte2[i1] = -52;
      }
      zks.a(this.l, arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte2, 0, arrayOfByte2.length);
    }
    int n;
    byte[] arrayOfByte1;
    if (paramLong % 1024L + paramInt >= 1024L)
    {
      n = (int)(1024L - paramLong % 1024L);
      m = n;
      i1 = paramInt - n;
      arrayOfByte1 = new byte[n];
      byte[] arrayOfByte3 = new byte[paramInt];
      for (int i2 = 0; i2 < n; i2++) {
        arrayOfByte1[i2] = paramArrayOfByte[i2];
      }
      zks.a(this.l, arrayOfByte1, 0, arrayOfByte1.length, arrayOfByte1, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, n);
      l2 += n;
      while (i1 > 0)
      {
        a(l2 >> 10);
        i2 = i1 > 1024 ? 1024 : i1;
        m = i2;
        arrayOfByte1 = new byte[m];
        for (int i3 = 0; i3 < i2; i3++) {
          arrayOfByte1[i3] = paramArrayOfByte[(n + i3)];
        }
        zks.a(this.l, arrayOfByte1, 0, arrayOfByte1.length, arrayOfByte1, 0, arrayOfByte1.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, n, i2);
        i1 -= i2;
        l2 += i2;
        n += i2;
      }
      this.i = (paramLong + paramInt);
      return arrayOfByte3;
    }
    if (paramLong % 1024L + paramInt < 1024L)
    {
      arrayOfByte1 = new byte[paramInt];
      m = paramInt;
      for (n = 0; n < paramInt; n++) {
        arrayOfByte1[n] = paramArrayOfByte[n];
      }
      if (paramLong % 1024L == 0L) {
        a(paramLong >> 10);
      }
      zks.a(this.l, arrayOfByte1, 0, arrayOfByte1.length, arrayOfByte1, 0, arrayOfByte1.length);
      this.i = (paramLong + paramInt);
      return arrayOfByte1;
    }
    return null;
  }
  
  public byte[] b(byte[] paramArrayOfByte, long paramLong)
  {
    return b(paramArrayOfByte, paramArrayOfByte.length, paramLong);
  }
  
  private byte[] b(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    long l1 = paramLong;
    long l2 = paramLong;
    int m = 0;
    m = (int)(paramLong - this.h);
    if (paramLong % 1024L == m) {
      a(paramLong >> 10);
    }
    byte[] arrayOfByte2;
    int i1;
    if (m + this.h % 1024L >= 1024L)
    {
      arrayOfByte2 = new byte[1024 - (int)(this.h % 1024L)];
      for (i1 = 0; i1 < arrayOfByte2.length; i1++) {
        arrayOfByte2[i1] = -52;
      }
      m = arrayOfByte2.length;
      zks.a(this.l, arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte2, 0, arrayOfByte2.length);
      a(paramLong >> 10);
      arrayOfByte2 = new byte[(int)paramLong % 1024];
      for (i1 = 0; i1 < arrayOfByte2.length; i1++) {
        arrayOfByte2[i1] = -52;
      }
      m = arrayOfByte2.length;
      zks.a(this.l, arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte2, 0, arrayOfByte2.length);
    }
    else
    {
      arrayOfByte2 = new byte[m];
      for (i1 = 0; i1 < m; i1++) {
        arrayOfByte2[i1] = -52;
      }
      zks.a(this.l, arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte2, 0, arrayOfByte2.length);
    }
    int n;
    byte[] arrayOfByte1;
    if (paramLong % 1024L + paramInt >= 1024L)
    {
      n = (int)(1024L - paramLong % 1024L);
      m = n;
      i1 = paramInt - n;
      arrayOfByte1 = new byte[n];
      byte[] arrayOfByte3 = new byte[paramInt];
      for (int i2 = 0; i2 < n; i2++) {
        arrayOfByte1[i2] = paramArrayOfByte[i2];
      }
      zks.a(this.l, arrayOfByte1, 0, arrayOfByte1.length, arrayOfByte1, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, n);
      l2 += n;
      while (i1 > 0)
      {
        a(l2 >> 10);
        i2 = i1 > 1024 ? 1024 : i1;
        m = i2;
        arrayOfByte1 = new byte[m];
        for (int i3 = 0; i3 < i2; i3++) {
          arrayOfByte1[i3] = paramArrayOfByte[(n + i3)];
        }
        zks.a(this.l, arrayOfByte1, 0, arrayOfByte1.length, arrayOfByte1, 0, arrayOfByte1.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, n, i2);
        i1 -= i2;
        l2 += i2;
        n += i2;
      }
      this.h = (paramLong + paramInt);
      return arrayOfByte3;
    }
    if (paramLong % 1024L + paramInt < 1024L)
    {
      arrayOfByte1 = new byte[paramInt];
      m = paramInt;
      for (n = 0; n < paramInt; n++) {
        arrayOfByte1[n] = paramArrayOfByte[n];
      }
      if (paramLong % 1024L == 0L) {
        a(paramLong >> 10);
      }
      zks.a(this.l, arrayOfByte1, 0, arrayOfByte1.length, arrayOfByte1, 0, arrayOfByte1.length);
      this.h = (paramLong + paramInt);
      return arrayOfByte1;
    }
    return null;
  }
  
  public byte[] c(byte[] paramArrayOfByte, long paramLong)
  {
    a();
    a(paramLong);
    zks.a(this.l, paramArrayOfByte, 0, paramArrayOfByte.length, paramArrayOfByte, 0, paramArrayOfByte.length);
    return paramArrayOfByte;
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    this.g.update(paramArrayOfByte);
    return this.g.digest();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */