package com.aspose.cells;

final class zamc
{
  private static final int[] u = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535 };
  static final int[] a = { 16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15 };
  int b;
  int c;
  int d;
  int e;
  int[] f;
  int[] g = new int[1];
  int[] h = new int[1];
  zamd i = new zamd();
  int j;
  int k;
  int l;
  int[] m = new int['რ'];
  byte[] n;
  int o;
  int p;
  int q;
  Object r;
  long s;
  zame t = new zame();
  
  zamc(zckc paramzckc, Object paramObject, int paramInt)
  {
    this.n = new byte[paramInt];
    this.o = paramInt;
    this.r = paramObject;
    this.b = 0;
    a(paramzckc, null);
  }
  
  void a(zckc paramzckc, long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null) {
      paramArrayOfLong[0] = this.s;
    }
    if (((this.b == 4) || (this.b != 5)) || (this.b == 6)) {
      this.i.a(paramzckc);
    }
    this.b = 0;
    this.k = 0;
    this.l = 0;
    this.p = (this.q = 0);
    if (this.r != null) {
      paramzckc.m = (this.s = paramzckc.n.a(0L, null, 0, 0));
    }
  }
  
  int a(zckc paramzckc, int paramInt)
  {
    int i4 = paramzckc.b;
    int i5 = paramzckc.c;
    int i2 = this.l;
    int i3 = this.k;
    int i6 = this.q;
    int i7 = i6 < this.p ? this.p - i6 - 1 : this.o - i6;
    for (;;)
    {
      int i1;
      switch (this.b)
      {
      case 0: 
        while (i3 < 3)
        {
          if (i5 != 0)
          {
            paramInt = 0;
          }
          else
          {
            this.l = i2;
            this.k = i3;
            paramzckc.c = i5;
            paramzckc.d += i4 - paramzckc.b;
            paramzckc.b = i4;
            this.q = i6;
            return b(paramzckc, paramInt);
          }
          i5--;
          i2 |= (paramzckc.a[(i4++)] & 0xFF) << i3;
          i3 += 8;
        }
        i1 = i2 & 0x7;
        this.j = (i1 & 0x1);
        switch (i1 >>> 1)
        {
        case 0: 
          i2 >>>= 3;
          i3 -= 3;
          i1 = i3 & 0x7;
          i2 >>>= i1;
          i3 -= i1;
          this.b = 1;
          break;
        case 1: 
          int[] arrayOfInt1 = new int[1];
          int[] arrayOfInt3 = new int[1];
          int[][] arrayOfInt5 = new int[1][];
          int[][] arrayOfInt7 = new int[1][];
          zame.a(arrayOfInt1, arrayOfInt3, arrayOfInt5, arrayOfInt7, paramzckc);
          this.i.a(arrayOfInt1[0], arrayOfInt3[0], arrayOfInt5[0], 0, arrayOfInt7[0], 0, paramzckc);
          i2 >>>= 3;
          i3 -= 3;
          this.b = 6;
          break;
        case 2: 
          i2 >>>= 3;
          i3 -= 3;
          this.b = 3;
          break;
        case 3: 
          i2 >>>= 3;
          i3 -= 3;
          this.b = 9;
          paramzckc.i = "invalid block type";
          paramInt = -3;
          this.l = i2;
          this.k = i3;
          paramzckc.c = i5;
          paramzckc.d += i4 - paramzckc.b;
          paramzckc.b = i4;
          this.q = i6;
          return b(paramzckc, paramInt);
        }
        break;
      case 1: 
        while (i3 < 32)
        {
          if (i5 != 0)
          {
            paramInt = 0;
          }
          else
          {
            this.l = i2;
            this.k = i3;
            paramzckc.c = i5;
            paramzckc.d += i4 - paramzckc.b;
            paramzckc.b = i4;
            this.q = i6;
            return b(paramzckc, paramInt);
          }
          i5--;
          i2 |= (paramzckc.a[(i4++)] & 0xFF) << i3;
          i3 += 8;
        }
        if (((i2 ^ 0xFFFFFFFF) >>> 16 & 0xFFFF) != (i2 & 0xFFFF))
        {
          this.b = 9;
          paramzckc.i = "invalid stored block lengths";
          paramInt = -3;
          this.l = i2;
          this.k = i3;
          paramzckc.c = i5;
          paramzckc.d += i4 - paramzckc.b;
          paramzckc.b = i4;
          this.q = i6;
          return b(paramzckc, paramInt);
        }
        this.c = (i2 & 0xFFFF);
        i2 = i3 = 0;
        this.b = (this.j != 0 ? 7 : this.c != 0 ? 2 : 0);
        break;
      case 2: 
        if (i5 == 0)
        {
          this.l = i2;
          this.k = i3;
          paramzckc.c = i5;
          paramzckc.d += i4 - paramzckc.b;
          paramzckc.b = i4;
          this.q = i6;
          return b(paramzckc, paramInt);
        }
        if (i7 == 0)
        {
          if ((i6 == this.o) && (this.p != 0))
          {
            i6 = 0;
            i7 = i6 < this.p ? this.p - i6 - 1 : this.o - i6;
          }
          if (i7 == 0)
          {
            this.q = i6;
            paramInt = b(paramzckc, paramInt);
            i6 = this.q;
            i7 = i6 < this.p ? this.p - i6 - 1 : this.o - i6;
            if ((i6 == this.o) && (this.p != 0))
            {
              i6 = 0;
              i7 = i6 < this.p ? this.p - i6 - 1 : this.o - i6;
            }
            if (i7 == 0)
            {
              this.l = i2;
              this.k = i3;
              paramzckc.c = i5;
              paramzckc.d += i4 - paramzckc.b;
              paramzckc.b = i4;
              this.q = i6;
              return b(paramzckc, paramInt);
            }
          }
        }
        paramInt = 0;
        i1 = this.c;
        if (i1 > i5) {
          i1 = i5;
        }
        if (i1 > i7) {
          i1 = i7;
        }
        System.arraycopy(paramzckc.a, i4, this.n, i6, i1);
        i4 += i1;
        i5 -= i1;
        i6 += i1;
        i7 -= i1;
        if (this.c -= i1 == 0) {
          this.b = (this.j != 0 ? 7 : 0);
        }
        break;
      case 3: 
        while (i3 < 14)
        {
          if (i5 != 0)
          {
            paramInt = 0;
          }
          else
          {
            this.l = i2;
            this.k = i3;
            paramzckc.c = i5;
            paramzckc.d += i4 - paramzckc.b;
            paramzckc.b = i4;
            this.q = i6;
            return b(paramzckc, paramInt);
          }
          i5--;
          i2 |= (paramzckc.a[(i4++)] & 0xFF) << i3;
          i3 += 8;
        }
        this.d = (i1 = i2 & 0x3FFF);
        if (((i1 & 0x1F) > 29) || ((i1 >> 5 & 0x1F) > 29))
        {
          this.b = 9;
          paramzckc.i = "too many length or distance symbols";
          paramInt = -3;
          this.l = i2;
          this.k = i3;
          paramzckc.c = i5;
          paramzckc.d += i4 - paramzckc.b;
          paramzckc.b = i4;
          this.q = i6;
          return b(paramzckc, paramInt);
        }
        i1 = 258 + (i1 & 0x1F) + (i1 >> 5 & 0x1F);
        if ((this.f == null) || (this.f.length < i1)) {
          this.f = new int[i1];
        } else {
          for (int i8 = 0; i8 < i1; i8++) {
            this.f[i8] = 0;
          }
        }
        i2 >>>= 14;
        i3 -= 14;
        this.e = 0;
        this.b = 4;
      case 4: 
        while (this.e < 4 + (this.d >>> 10))
        {
          while (i3 < 3)
          {
            if (i5 != 0)
            {
              paramInt = 0;
            }
            else
            {
              this.l = i2;
              this.k = i3;
              paramzckc.c = i5;
              paramzckc.d += i4 - paramzckc.b;
              paramzckc.b = i4;
              this.q = i6;
              return b(paramzckc, paramInt);
            }
            i5--;
            i2 |= (paramzckc.a[(i4++)] & 0xFF) << i3;
            i3 += 8;
          }
          this.f[a[(this.e++)]] = (i2 & 0x7);
          i2 >>>= 3;
          i3 -= 3;
        }
        while (this.e < 19) {
          this.f[a[(this.e++)]] = 0;
        }
        this.g[0] = 7;
        i1 = this.t.a(this.f, this.g, this.h, this.m, paramzckc);
        if (i1 != 0)
        {
          paramInt = i1;
          if (paramInt == -3)
          {
            this.f = null;
            this.b = 9;
          }
          this.l = i2;
          this.k = i3;
          paramzckc.c = i5;
          paramzckc.d += i4 - paramzckc.b;
          paramzckc.b = i4;
          this.q = i6;
          return b(paramzckc, paramInt);
        }
        this.e = 0;
        this.b = 5;
      case 5: 
        for (;;)
        {
          i1 = this.d;
          if (this.e >= 258 + (i1 & 0x1F) + (i1 >> 5 & 0x1F)) {
            break;
          }
          i1 = this.g[0];
          while (i3 < i1)
          {
            if (i5 != 0)
            {
              paramInt = 0;
            }
            else
            {
              this.l = i2;
              this.k = i3;
              paramzckc.c = i5;
              paramzckc.d += i4 - paramzckc.b;
              paramzckc.b = i4;
              this.q = i6;
              return b(paramzckc, paramInt);
            }
            i5--;
            i2 |= (paramzckc.a[(i4++)] & 0xFF) << i3;
            i3 += 8;
          }
          if (this.h[0] == -1) {}
          i1 = this.m[((this.h[0] + (i2 & u[i1])) * 3 + 1)];
          int i11 = this.m[((this.h[0] + (i2 & u[i1])) * 3 + 2)];
          if (i11 < 16)
          {
            i2 >>>= i1;
            i3 -= i1;
            this.f[(this.e++)] = i11;
          }
          else
          {
            int i9 = i11 == 18 ? 7 : i11 - 14;
            int i10 = i11 == 18 ? 11 : 3;
            while (i3 < i1 + i9)
            {
              if (i5 != 0)
              {
                paramInt = 0;
              }
              else
              {
                this.l = i2;
                this.k = i3;
                paramzckc.c = i5;
                paramzckc.d += i4 - paramzckc.b;
                paramzckc.b = i4;
                this.q = i6;
                return b(paramzckc, paramInt);
              }
              i5--;
              i2 |= (paramzckc.a[(i4++)] & 0xFF) << i3;
              i3 += 8;
            }
            i2 >>>= i1;
            i3 -= i1;
            i10 += (i2 & u[i9]);
            i2 >>>= i9;
            i3 -= i9;
            i9 = this.e;
            i1 = this.d;
            if ((i9 + i10 > 258 + (i1 & 0x1F) + (i1 >> 5 & 0x1F)) || ((i11 == 16) && (i9 < 1)))
            {
              this.f = null;
              this.b = 9;
              paramzckc.i = "invalid bit length repeat";
              paramInt = -3;
              this.l = i2;
              this.k = i3;
              paramzckc.c = i5;
              paramzckc.d += i4 - paramzckc.b;
              paramzckc.b = i4;
              this.q = i6;
              return b(paramzckc, paramInt);
            }
            i11 = i11 == 16 ? this.f[(i9 - 1)] : 0;
            do
            {
              this.f[(i9++)] = i11;
              i10--;
            } while (i10 != 0);
            this.e = i9;
          }
        }
        this.h[0] = -1;
        int[] arrayOfInt2 = new int[1];
        int[] arrayOfInt4 = new int[1];
        int[] arrayOfInt6 = new int[1];
        int[] arrayOfInt8 = new int[1];
        arrayOfInt2[0] = 9;
        arrayOfInt4[0] = 6;
        i1 = this.d;
        i1 = this.t.a(257 + (i1 & 0x1F), 1 + (i1 >> 5 & 0x1F), this.f, arrayOfInt2, arrayOfInt4, arrayOfInt6, arrayOfInt8, this.m, paramzckc);
        if (i1 != 0)
        {
          if (i1 == -3)
          {
            this.f = null;
            this.b = 9;
          }
          paramInt = i1;
          this.l = i2;
          this.k = i3;
          paramzckc.c = i5;
          paramzckc.d += i4 - paramzckc.b;
          paramzckc.b = i4;
          this.q = i6;
          return b(paramzckc, paramInt);
        }
        this.i.a(arrayOfInt2[0], arrayOfInt4[0], this.m, arrayOfInt6[0], this.m, arrayOfInt8[0], paramzckc);
        this.b = 6;
      case 6: 
        this.l = i2;
        this.k = i3;
        paramzckc.c = i5;
        paramzckc.d += i4 - paramzckc.b;
        paramzckc.b = i4;
        this.q = i6;
        if ((paramInt = this.i.a(this, paramzckc, paramInt)) != 1) {
          return b(paramzckc, paramInt);
        }
        paramInt = 0;
        this.i.a(paramzckc);
        i4 = paramzckc.b;
        i5 = paramzckc.c;
        i2 = this.l;
        i3 = this.k;
        i6 = this.q;
        i7 = i6 < this.p ? this.p - i6 - 1 : this.o - i6;
        if (this.j != 0) {
          break label2631;
        }
        this.b = 0;
      }
    }
    label2631:
    this.b = 7;
    this.q = i6;
    paramInt = b(paramzckc, paramInt);
    i6 = this.q;
    i7 = i6 < this.p ? this.p - i6 - 1 : this.o - i6;
    if (this.p != this.q)
    {
      this.l = i2;
      this.k = i3;
      paramzckc.c = i5;
      paramzckc.d += i4 - paramzckc.b;
      paramzckc.b = i4;
      this.q = i6;
      return b(paramzckc, paramInt);
    }
    this.b = 8;
    paramInt = 1;
    this.l = i2;
    this.k = i3;
    paramzckc.c = i5;
    paramzckc.d += i4 - paramzckc.b;
    paramzckc.b = i4;
    this.q = i6;
    return b(paramzckc, paramInt);
    paramInt = -3;
    this.l = i2;
    this.k = i3;
    paramzckc.c = i5;
    paramzckc.d += i4 - paramzckc.b;
    paramzckc.b = i4;
    this.q = i6;
    return b(paramzckc, paramInt);
    paramInt = -2;
    this.l = i2;
    this.k = i3;
    paramzckc.c = i5;
    paramzckc.d += i4 - paramzckc.b;
    paramzckc.b = i4;
    this.q = i6;
    return b(paramzckc, paramInt);
  }
  
  void a(zckc paramzckc)
  {
    a(paramzckc, null);
    this.n = null;
    this.m = null;
  }
  
  int b(zckc paramzckc, int paramInt)
  {
    int i2 = paramzckc.f;
    int i3 = this.p;
    int i1 = (i3 <= this.q ? this.q : this.o) - i3;
    if (i1 > paramzckc.g) {
      i1 = paramzckc.g;
    }
    if ((i1 != 0) && (paramInt == -5)) {
      paramInt = 0;
    }
    paramzckc.g -= i1;
    paramzckc.h += i1;
    if (this.r != null) {
      paramzckc.m = (this.s = paramzckc.n.a(this.s, this.n, i3, i1));
    }
    System.arraycopy(this.n, i3, paramzckc.e, i2, i1);
    i2 += i1;
    i3 += i1;
    if (i3 == this.o)
    {
      i3 = 0;
      if (this.q == this.o) {
        this.q = 0;
      }
      i1 = this.q - i3;
      if (i1 > paramzckc.g) {
        i1 = paramzckc.g;
      }
      if ((i1 != 0) && (paramInt == -5)) {
        paramInt = 0;
      }
      paramzckc.g -= i1;
      paramzckc.h += i1;
      if (this.r != null) {
        paramzckc.m = (this.s = paramzckc.n.a(this.s, this.n, i3, i1));
      }
      System.arraycopy(this.n, i3, paramzckc.e, i2, i1);
      i2 += i1;
      i3 += i1;
    }
    paramzckc.f = i2;
    this.p = i3;
    return paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */