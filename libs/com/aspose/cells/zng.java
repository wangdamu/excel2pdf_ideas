package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zr;

class zng
{
  zm a;
  zm b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private byte[] j;
  
  void a(int paramInt1, int paramInt2)
  {
    int k = paramInt1 - paramInt2;
    this.c = ((int)Math.ceil(zr.a(k, 2.0D)));
    this.c = Math.max(this.c, 4);
    this.d = (65535 >> this.c);
    this.e = (this.d ^ 0xFFFFFFFF);
    this.f = ((65535 >> this.c) + 3);
  }
  
  private int[] a(int paramInt)
  {
    int k = this.i;
    int m = 0;
    int n = 0;
    int i1;
    int i2;
    while (k < this.h)
    {
      i1 = k;
      i2 = this.h;
      int i3 = 0;
      while ((i2 < paramInt) && (this.j[i2] == this.j[i1]))
      {
        i3++;
        i1++;
        i2++;
      }
      if (i3 > m)
      {
        m = i3;
        n = k;
      }
      k++;
    }
    if (m >= 3)
    {
      a(this.h, this.i);
      i1 = Math.min(m, this.f);
      i2 = this.h - n;
      return new int[] { i2, i1 };
    }
    return new int[] { 0, 0 };
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    a(this.h, this.i);
    int k = paramInt1 - 1;
    int m = 16 - this.c;
    int n = paramInt2 - 3;
    int i1 = k << m | n;
    return i1;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int k = paramInt2 << paramInt1;
    int m = paramInt3 & (k ^ 0xFFFFFFFF);
    paramInt3 = m | k;
    return paramInt3;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws Exception
  {
    int[] arrayOfInt = a(paramInt2);
    int k = arrayOfInt[0];
    int m = arrayOfInt[1];
    if (k != 0)
    {
      if (this.g + 1 < paramInt1)
      {
        int n = b(k, m);
        this.a.b(zc.a(n), 0, 2);
        paramInt4 = a(paramInt3, 1, paramInt4);
        this.g += 2;
        this.h += m;
      }
      else
      {
        this.g = paramInt1;
      }
    }
    else if (this.g < paramInt1)
    {
      this.a.a(this.j[this.h]);
      this.g += 1;
      this.h += 1;
    }
    else
    {
      this.g = paramInt1;
    }
    return paramInt4;
  }
  
  void a(zm paramzm, int paramInt)
    throws Exception
  {
    byte[] arrayOfByte = new byte[2];
    this.g = 0;
    this.h = 0;
    this.j = new byte[(int)(paramzm.h() - paramInt)];
    paramzm.a(paramInt, 0);
    paramzm.a(this.j, 0, this.j.length);
    zh localzh = new zh();
    this.a = localzh;
    localzh.a((byte)1);
    this.g += 1;
    int k = this.j.length;
    while (this.h < k)
    {
      int m = this.g;
      this.i = this.h;
      int n = m + 4098;
      this.g = (m + 2);
      localzh.b(arrayOfByte, 0, 2);
      int i1 = Math.min(this.i + 4096, k);
      while ((this.h < i1) && (this.g < n))
      {
        i2 = this.g;
        i3 = 0;
        localzh.b(arrayOfByte, 0, 1);
        this.g += 1;
        for (i4 = 0; i4 <= 7; i4++) {
          if ((this.h < i1) && (this.g < n)) {
            i3 = a(n, i1, i4, i3);
          }
        }
        localzh.m()[i2] = ((byte)i3);
      }
      int i2 = 0;
      if (this.h < i1)
      {
        i3 = i1 - 1;
        this.g = (m + 2);
        localzh.a(this.g, 0);
        this.h = this.i;
        i4 = 4096;
        int i5 = i3 - this.h + 1;
        localzh.b(this.j, this.h, i5);
        this.h += i5;
        this.g += i5;
        i4 -= i5;
        for (int i6 = 0; i6 < i4; i6++) {
          localzh.a((byte)0);
        }
        this.g += i4;
        i2 = 0;
      }
      else
      {
        i2 = 1;
      }
      int i3 = this.g - m;
      int i4 = i3 - 3;
      i4 |= i2 << 15;
      i4 |= 0x3000;
      localzh.b();
      System.arraycopy(zc.a(i4), 0, localzh.m(), m, 2);
    }
    localzh.b();
  }
  
  void b(zm paramzm, int paramInt)
    throws Exception
  {
    int k = 0;
    int m = 0;
    byte[] arrayOfByte = new byte[(int)(paramzm.h() - paramInt)];
    paramzm.a(paramInt, 0);
    paramzm.a(arrayOfByte, 0, arrayOfByte.length);
    if (arrayOfByte[k] != 1) {
      throw new Exception("Invalid VBA stream");
    }
    k++;
    zh localzh = new zh();
    this.b = localzh;
    while (k < arrayOfByte.length)
    {
      int n = k;
      int i1 = zc.e(arrayOfByte, n) & 0xFFFF;
      int i2 = (i1 & 0xFFF) + 3;
      int i3 = (i1 & 0x8000) != 0 ? 1 : 0;
      int i4 = m;
      int i5 = Math.min(arrayOfByte.length, n + i2);
      k = n + 2;
      if (i3 != 0) {
        while (k < i5)
        {
          i6 = arrayOfByte[k];
          k++;
          if (k < i5) {
            for (int i7 = 0; i7 <= 7; i7++) {
              if (k < i5) {
                if (((i6 & 0xFF) >> i7 & 0x1) == 0)
                {
                  localzh.b(arrayOfByte, k, 1);
                  k++;
                  m++;
                }
                else
                {
                  a(m, i4);
                  int i8 = zc.e(arrayOfByte, k) & 0xFFFF;
                  int i9 = (i8 & this.d) + 3;
                  int i10 = i8 & this.e;
                  int i11 = 16 - this.c;
                  int i12 = (i10 >> i11) + 1;
                  int i13 = m - i12;
                  if (i9 > i12)
                  {
                    localzh.b(localzh.m(), i13, i12);
                    while (i12 < i9)
                    {
                      localzh.a(localzh.m()[(i13 + i12)]);
                      i12++;
                    }
                  }
                  localzh.b(localzh.m(), i13, i9);
                  m += i9;
                  k += 2;
                }
              }
            }
          }
        }
      }
      int i6 = 4096;
      localzh.b(arrayOfByte, k, i6);
      k += i6;
      m += i6;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */