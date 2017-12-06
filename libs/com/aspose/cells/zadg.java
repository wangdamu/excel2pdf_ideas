package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;

class zadg
{
  private int g = -1;
  private zadg h = null;
  zam[] a;
  private znk[] i;
  zal[] b;
  private zadh[] j;
  private zavr[] k;
  zan[] c;
  zan[] d;
  static zal[] e = new zal[0];
  static String[] f = { "c", "w", "h", "ss", "ls", "hc", "vc", "l", "t", "r", "b" };
  
  void a(int paramInt)
  {
    if ((this.g == paramInt) || (paramInt == 0)) {
      return;
    }
    if (this.g == 0)
    {
      this.a = null;
      this.i = null;
      this.b = e;
      this.j = null;
      this.k = null;
      this.c = null;
      this.d = null;
    }
    this.g = paramInt;
    this.h = zadl.a(this.g);
    if (this.h == null) {
      return;
    }
    this.a = a(this.h.a);
  }
  
  ze[] a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    zadg localzadg = this;
    if (this.g != 0) {
      localzadg = this.h;
    }
    zavr[] arrayOfzavr = localzadg.k;
    if (arrayOfzavr.length == 0) {
      return null;
    }
    ze[] arrayOfze = new ze[arrayOfzavr.length];
    byte[] arrayOfByte = null;
    double[] arrayOfDouble = null;
    byte[][] arrayOfByte1 = { arrayOfByte };
    double[][] arrayOfDouble1 = { arrayOfDouble };
    a(paramFloat3, paramFloat4, arrayOfByte1, arrayOfDouble1);
    arrayOfByte = arrayOfByte1[0];
    arrayOfDouble = arrayOfDouble1[0];
    for (int m = 0; m < arrayOfzavr.length; m++)
    {
      int n = 0;
      boolean[] arrayOfBoolean = { n };
      arrayOfze[m] = arrayOfzavr[m].a(this, arrayOfDouble, arrayOfByte, paramFloat1, paramFloat2, paramFloat3, paramFloat4, arrayOfBoolean);
      n = arrayOfBoolean[0];
    }
    return arrayOfze;
  }
  
  float a(double[] paramArrayOfDouble, byte[] paramArrayOfByte, long paramLong)
  {
    int m = 0;
    byte[] arrayOfByte = { m };
    float f1 = a(paramArrayOfDouble, paramArrayOfByte, paramLong, arrayOfByte);
    m = arrayOfByte[0];
    return f1;
  }
  
  float a(double[] paramArrayOfDouble, byte[] paramArrayOfByte1, long paramLong, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte2[0] = 0;
    if (paramLong < -27273042329600L)
    {
      paramArrayOfByte2[0] = paramArrayOfByte1[((int)(-27273042329600L - paramLong - 1L))];
      return (float)paramArrayOfDouble[((int)(-27273042329600L - paramLong - 1L))];
    }
    if (paramLong <= 27273042316900L) {
      return (float)paramLong;
    }
    return (float)this.a[((int)(paramLong - 27273042316900L - 1L))].a();
  }
  
  void a(float paramFloat1, float paramFloat2, byte[][] paramArrayOfByte, double[][] paramArrayOfDouble)
  {
    zadg localzadg = this;
    if (this.g != 0) {
      localzadg = this.h;
    }
    zadh[] arrayOfzadh = localzadg.j;
    paramArrayOfDouble[0] = new double[arrayOfzadh.length + 11];
    paramArrayOfByte[0] = new byte[arrayOfzadh.length + 11];
    paramArrayOfByte[0][7] = 1;
    paramArrayOfByte[0][8] = 4;
    paramArrayOfByte[0][9] = 2;
    paramArrayOfByte[0][10] = 8;
    int m = 0;
    int n = -1;
    for (int i1 = 0; i1 < 11; i1++)
    {
      int tmp96_94 = i1;
      byte[] tmp96_93 = paramArrayOfByte[0];
      tmp96_93[tmp96_94] = ((byte)(tmp96_93[tmp96_94] | 0x10));
    }
    paramArrayOfDouble[0][0] = 2.16E7D;
    paramArrayOfDouble[0][1] = paramFloat1;
    paramArrayOfDouble[0][2] = paramFloat2;
    paramArrayOfDouble[0][3] = (paramFloat1 > paramFloat2 ? paramFloat2 : paramFloat1);
    paramArrayOfDouble[0][4] = (paramFloat1 > paramFloat2 ? paramFloat1 : paramFloat2);
    paramArrayOfDouble[0][5] = (paramFloat1 / 2.0F);
    paramArrayOfDouble[0][6] = (paramFloat2 / 2.0F);
    paramArrayOfDouble[0][7] = 0.0D;
    paramArrayOfDouble[0][8] = 0.0D;
    paramArrayOfDouble[0][9] = paramFloat1;
    paramArrayOfDouble[0][10] = paramFloat2;
    i1 = 10;
    while ((i1 > 0) && (m < paramArrayOfDouble[0].length))
    {
      n = m;
      m = paramArrayOfDouble[0].length;
      i1 = 0;
      for (int i2 = Math.max(n, 11); i2 < paramArrayOfDouble[0].length; i2++) {
        if ((paramArrayOfByte[0][i2] & 0x10) != 16)
        {
          zadh localzadh = arrayOfzadh[(i2 - 11)];
          int i3 = 0;
          int i4 = 0;
          int i5 = 0;
          byte[] arrayOfByte1 = { i3 };
          double d1 = b(paramArrayOfDouble[0], paramArrayOfByte[0], localzadh.b, arrayOfByte1);
          i3 = arrayOfByte1[0];
          byte[] arrayOfByte2 = { i4 };
          double d2 = b(paramArrayOfDouble[0], paramArrayOfByte[0], localzadh.c, arrayOfByte2);
          i4 = arrayOfByte2[0];
          byte[] arrayOfByte3 = { i5 };
          double d3 = b(paramArrayOfDouble[0], paramArrayOfByte[0], localzadh.d, arrayOfByte3);
          i5 = arrayOfByte3[0];
          if ((Double.isNaN(d1)) || (Double.isNaN(d2)) || (Double.isNaN(d3)))
          {
            if (i2 < m) {
              m = i2;
            }
          }
          else
          {
            switch (localzadh.a)
            {
            case 0: 
              paramArrayOfDouble[0][i2] = (d1 * d2 / d3);
              break;
            case 1: 
              paramArrayOfDouble[0][i2] = (d1 + d2 - d3);
              break;
            case 2: 
              paramArrayOfDouble[0][i2] = ((d1 + d2) / d3);
              break;
            case 3: 
              paramArrayOfDouble[0][i2] = (d1 > 0.0D ? d2 : d3);
              break;
            case 4: 
              paramArrayOfDouble[0][i2] = Math.abs(d1);
              break;
            case 5: 
              paramArrayOfDouble[0][i2] = (Math.atan2(d2, d1) / 2.9088820866572157E-7D);
              break;
            case 6: 
              paramArrayOfDouble[0][i2] = (d1 * Math.cos(Math.atan2(d3, d2)));
              break;
            case 7: 
              paramArrayOfDouble[0][i2] = (d1 * Math.cos(d2 * 2.9088820866572157E-7D));
              break;
            case 8: 
              paramArrayOfDouble[0][i2] = Math.max(d1, d2);
              break;
            case 9: 
              paramArrayOfDouble[0][i2] = Math.min(d1, d2);
              break;
            case 10: 
              paramArrayOfDouble[0][i2] = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
              break;
            case 11: 
              paramArrayOfDouble[0][i2] = (d2 > d3 ? d3 : d1 > d2 ? d1 : d2);
              break;
            case 12: 
              paramArrayOfDouble[0][i2] = (d1 * Math.sin(Math.atan2(d3, d2)));
              break;
            case 13: 
              paramArrayOfDouble[0][i2] = (d1 * Math.sin(d2 * 2.9088820866572157E-7D));
              break;
            case 14: 
              paramArrayOfDouble[0][i2] = Math.sqrt(d1);
              break;
            case 15: 
              paramArrayOfDouble[0][i2] = (d1 * Math.tan(d2 * 2.9088820866572157E-7D));
              break;
            case 16: 
              paramArrayOfDouble[0][i2] = d1;
            }
            paramArrayOfByte[0][i2] = ((byte)(i3 | i4 | i5 | 0x10));
            i1++;
          }
        }
      }
    }
  }
  
  public zadg() {}
  
  public zadg(zam[] paramArrayOfzam, zadh[] paramArrayOfzadh, znk[] paramArrayOfznk, zal[] paramArrayOfzal, zavr[] paramArrayOfzavr, zan paramzan1, zan paramzan2)
  {
    this.a = paramArrayOfzam;
    this.i = paramArrayOfznk;
    this.b = paramArrayOfzal;
    this.j = paramArrayOfzadh;
    this.k = paramArrayOfzavr;
    this.g = 0;
    if (paramzan1 != null)
    {
      this.c = new zan[1];
      this.c[0] = paramzan1;
      this.d = new zan[1];
      this.d[0] = paramzan2;
    }
  }
  
  static zam[] a(zam[] paramArrayOfzam)
  {
    zam[] arrayOfzam = new zam[paramArrayOfzam.length];
    for (int m = 0; m < paramArrayOfzam.length; m++) {
      arrayOfzam[m] = new zam(paramArrayOfzam[m]);
    }
    return arrayOfzam;
  }
  
  float b(double[] paramArrayOfDouble, byte[] paramArrayOfByte, long paramLong)
  {
    int m = 0;
    byte[] arrayOfByte = { m };
    float f1 = a(paramArrayOfDouble, paramArrayOfByte, paramLong, arrayOfByte) / 60000.0F;
    m = arrayOfByte[0];
    return f1;
  }
  
  private double b(double[] paramArrayOfDouble, byte[] paramArrayOfByte1, long paramLong, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte2[0] = 0;
    if (paramLong > 27273042316900L) {
      return this.a[((int)(paramLong - 27273042316900L - 1L))].a();
    }
    if (paramLong < -27273042329600L)
    {
      int m = (int)(-27273042329600L - paramLong - 1L);
      if ((paramArrayOfByte1[m] & 0x10) == 16)
      {
        paramArrayOfByte2[0] = paramArrayOfByte1[m];
        return paramArrayOfDouble[m];
      }
      return NaN.0D;
    }
    return paramLong;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */