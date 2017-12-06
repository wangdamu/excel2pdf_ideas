package com.aspose.cells;

import com.aspose.cells.a.e.zf;

class ztl
{
  private boolean g;
  private long h;
  private short i;
  private int j;
  zaol a;
  byte[] b;
  byte[] c;
  private zbtn k;
  byte[] d;
  byte[] e;
  String f;
  
  public static ztl a()
  {
    byte[] arrayOfByte1 = { 21, 122, 103, 84, 81, 87, 50, 85, 62, 80, 120, 119, 24, 18, -76, -125 };
    byte[] arrayOfByte2 = { 124, 52, -52, 7, -95, 117, -109, Byte.MIN_VALUE, -76, -68, -1, 58, 124, -41, 52, -70 };
    byte[] arrayOfByte3 = { -22, 87, 79, -87, -77, 114, 80, 50, -71, 103, 111, 80, 29, 110, 25, 46 };
    return new ztl("VelvetSweatshop", arrayOfByte1, arrayOfByte2, arrayOfByte3);
  }
  
  public ztl(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    if ((paramArrayOfByte1.length != 16) || (paramArrayOfByte2.length != 16) || (paramArrayOfByte3.length != 16)) {
      throw new IllegalArgumentException();
    }
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("The password could not be null or empty.");
    }
    this.i = 0;
    this.g = false;
    this.h = 4294967295L;
    this.k = new zbtn();
    this.c = new byte[16];
    this.a = new zaol();
    this.j = 1024;
    a(paramString, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3);
    this.f = paramString;
  }
  
  public ztl(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt)
  {
    if ((paramArrayOfByte1.length != 16) || (paramArrayOfByte2.length != 16) || (paramArrayOfByte3.length != 16)) {
      throw new IllegalArgumentException();
    }
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("The password could not be null or empty.");
    }
    this.i = 0;
    this.g = false;
    this.h = 4294967295L;
    this.k = new zbtn();
    this.c = new byte[16];
    this.a = new zaol();
    this.j = paramInt;
    a(paramString, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3);
    this.f = paramString;
  }
  
  public byte[] b()
  {
    return this.c;
  }
  
  private void a(zbtn paramzbtn, short paramShort)
  {
    if (this.g)
    {
      int m = paramzbtn.a();
      if ((this.h != m) || (this.i != paramShort))
      {
        a(this.h, m, paramShort);
        this.h = m;
        this.i = paramShort;
      }
    }
  }
  
  public byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong)
  {
    if ((paramArrayOfByte == null) || (paramInt2 <= 0) || (paramInt1 + paramInt2 > paramArrayOfByte.length)) {
      throw new IllegalArgumentException();
    }
    byte[] arrayOfByte = new byte[paramInt2];
    this.k.a(paramArrayOfByte, (short)paramInt1, (int)paramLong);
    if (this.g)
    {
      a(this.k, this.i);
      a(this.k, arrayOfByte, (short)paramInt2);
      this.h = this.k.a();
    }
    else
    {
      this.k.a(arrayOfByte, 0, paramInt2);
    }
    return arrayOfByte;
  }
  
  private void a(long paramLong1, long paramLong2, short paramShort)
  {
    if (paramLong2 != paramLong1)
    {
      int m = a(paramLong1);
      int n = b(paramLong1);
      int i1 = a(paramLong2);
      int i2 = b(paramLong2);
      if ((i1 != m) || (i2 < n))
      {
        this.a.a(i1);
        n = 0;
      }
      if (i2 > n) {
        this.a.b(i2 - n);
      }
    }
  }
  
  private short a(zbtn paramzbtn, byte[] paramArrayOfByte, short paramShort)
  {
    short s = 0;
    int m = 0;
    int i2;
    for (int n = paramShort; n > 0; n = (short)(n - i2))
    {
      int i1 = (short)(this.j - b(paramzbtn.a()));
      i2 = (short)Math.min(n, i1);
      s = (short)(s + (short)paramzbtn.a(paramArrayOfByte, m, i2));
      this.a.a(paramArrayOfByte, m, i2, paramArrayOfByte, m, i2);
      if (b(paramzbtn.a()) == 0) {
        this.a.a(a(paramzbtn.a()));
      }
      m = (short)(m + i2);
    }
    return s;
  }
  
  private void a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    zf.a((paramArrayOfByte1.length == 16) && (paramArrayOfByte2.length == 16) && (paramArrayOfByte3.length == 16));
    int m = paramString.length();
    this.b = Encoding.getUnicode().a(paramString);
    for (int n = 0; n < paramArrayOfByte1.length; n++) {
      this.c[n] = paramArrayOfByte1[n];
    }
    this.a.a(this.b, this.c);
    this.a.b(paramArrayOfByte2, paramArrayOfByte3);
    this.d = paramArrayOfByte2;
    this.e = paramArrayOfByte3;
    this.g = true;
  }
  
  private int a(long paramLong)
  {
    return (int)(paramLong / this.j);
  }
  
  private short b(long paramLong)
  {
    return (short)(int)(paramLong % this.j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */