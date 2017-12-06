package com.aspose.cells;

final class zamd
{
  private static final int[] o = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535 };
  int a;
  int b;
  int[] c;
  int d = 0;
  int e;
  int f;
  int g;
  int h;
  byte i;
  byte j;
  int[] k;
  int l;
  int[] m;
  int n;
  
  void a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, int[] paramArrayOfInt2, int paramInt4, zckc paramzckc)
  {
    this.a = 0;
    this.i = ((byte)paramInt1);
    this.j = ((byte)paramInt2);
    this.k = paramArrayOfInt1;
    this.l = paramInt3;
    this.m = paramArrayOfInt2;
    this.n = paramInt4;
    this.c = null;
  }
  
  int a(zamc paramzamc, zckc paramzckc, int paramInt)
  {
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    i6 = paramzckc.b;
    int i7 = paramzckc.c;
    i4 = paramzamc.l;
    i5 = paramzamc.k;
    int i8 = paramzamc.q;
    int i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
    for (;;)
    {
      int i1;
      int i2;
      int i3;
      switch (this.a)
      {
      case 0: 
        if ((i9 >= 258) && (i7 >= 10))
        {
          paramzamc.l = i4;
          paramzamc.k = i5;
          paramzckc.c = i7;
          paramzckc.d += i6 - paramzckc.b;
          paramzckc.b = i6;
          paramzamc.q = i8;
          paramInt = a(this.i, this.j, this.k, this.l, this.m, this.n, paramzamc, paramzckc);
          i6 = paramzckc.b;
          i7 = paramzckc.c;
          i4 = paramzamc.l;
          i5 = paramzamc.k;
          i8 = paramzamc.q;
          i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
          if (paramInt != 0)
          {
            this.a = (paramInt == 1 ? 7 : 9);
            continue;
          }
        }
        this.e = this.i;
        this.c = this.k;
        this.d = this.l;
        this.a = 1;
      case 1: 
        i1 = this.e;
        while (i5 < i1)
        {
          if (i7 != 0)
          {
            paramInt = 0;
          }
          else
          {
            paramzamc.l = i4;
            paramzamc.k = i5;
            paramzckc.c = i7;
            paramzckc.d += i6 - paramzckc.b;
            paramzckc.b = i6;
            paramzamc.q = i8;
            return paramzamc.b(paramzckc, paramInt);
          }
          i7--;
          i4 |= (paramzckc.a[(i6++)] & 0xFF) << i5;
          i5 += 8;
        }
        i2 = (this.d + (i4 & o[i1])) * 3;
        i4 >>>= this.c[(i2 + 1)];
        i5 -= this.c[(i2 + 1)];
        i3 = this.c[i2];
        if (i3 == 0)
        {
          this.f = this.c[(i2 + 2)];
          this.a = 6;
        }
        else if ((i3 & 0x10) != 0)
        {
          this.g = (i3 & 0xF);
          this.b = this.c[(i2 + 2)];
          this.a = 2;
        }
        else if ((i3 & 0x40) == 0)
        {
          this.e = i3;
          this.d = (i2 / 3 + this.c[(i2 + 2)]);
        }
        else if ((i3 & 0x20) != 0)
        {
          this.a = 7;
        }
        else
        {
          this.a = 9;
          paramzckc.i = "invalid literal/length code";
          paramInt = -3;
          paramzamc.l = i4;
          paramzamc.k = i5;
          paramzckc.c = i7;
          paramzckc.d += i6 - paramzckc.b;
          paramzckc.b = i6;
          paramzamc.q = i8;
          return paramzamc.b(paramzckc, paramInt);
        }
        break;
      case 2: 
        i1 = this.g;
        while (i5 < i1)
        {
          if (i7 != 0)
          {
            paramInt = 0;
          }
          else
          {
            paramzamc.l = i4;
            paramzamc.k = i5;
            paramzckc.c = i7;
            paramzckc.d += i6 - paramzckc.b;
            paramzckc.b = i6;
            paramzamc.q = i8;
            return paramzamc.b(paramzckc, paramInt);
          }
          i7--;
          i4 |= (paramzckc.a[(i6++)] & 0xFF) << i5;
          i5 += 8;
        }
        this.b += (i4 & o[i1]);
        i4 >>= i1;
        i5 -= i1;
        this.e = this.j;
        this.c = this.m;
        this.d = this.n;
        this.a = 3;
      case 3: 
        i1 = this.e;
        while (i5 < i1)
        {
          if (i7 != 0)
          {
            paramInt = 0;
          }
          else
          {
            paramzamc.l = i4;
            paramzamc.k = i5;
            paramzckc.c = i7;
            paramzckc.d += i6 - paramzckc.b;
            paramzckc.b = i6;
            paramzamc.q = i8;
            return paramzamc.b(paramzckc, paramInt);
          }
          i7--;
          i4 |= (paramzckc.a[(i6++)] & 0xFF) << i5;
          i5 += 8;
        }
        i2 = (this.d + (i4 & o[i1])) * 3;
        i4 >>= this.c[(i2 + 1)];
        i5 -= this.c[(i2 + 1)];
        i3 = this.c[i2];
        if ((i3 & 0x10) != 0)
        {
          this.g = (i3 & 0xF);
          this.h = this.c[(i2 + 2)];
          this.a = 4;
        }
        else if ((i3 & 0x40) == 0)
        {
          this.e = i3;
          this.d = (i2 / 3 + this.c[(i2 + 2)]);
        }
        else
        {
          this.a = 9;
          paramzckc.i = "invalid distance code";
          paramInt = -3;
          paramzamc.l = i4;
          paramzamc.k = i5;
          paramzckc.c = i7;
          paramzckc.d += i6 - paramzckc.b;
          paramzckc.b = i6;
          paramzamc.q = i8;
          return paramzamc.b(paramzckc, paramInt);
        }
        break;
      case 4: 
        i1 = this.g;
        while (i5 < i1)
        {
          if (i7 != 0)
          {
            paramInt = 0;
          }
          else
          {
            paramzamc.l = i4;
            paramzamc.k = i5;
            paramzckc.c = i7;
            paramzckc.d += i6 - paramzckc.b;
            paramzckc.b = i6;
            paramzamc.q = i8;
            return paramzamc.b(paramzckc, paramInt);
          }
          i7--;
          i4 |= (paramzckc.a[(i6++)] & 0xFF) << i5;
          i5 += 8;
        }
        this.h += (i4 & o[i1]);
        i4 >>= i1;
        i5 -= i1;
        this.a = 5;
      case 5: 
        int i10 = i8 - this.h;
        while (i10 < 0) {
          i10 += paramzamc.o;
        }
        while (this.b != 0)
        {
          if (i9 == 0)
          {
            if ((i8 == paramzamc.o) && (paramzamc.p != 0))
            {
              i8 = 0;
              i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
            }
            if (i9 == 0)
            {
              paramzamc.q = i8;
              paramInt = paramzamc.b(paramzckc, paramInt);
              i8 = paramzamc.q;
              i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
              if ((i8 == paramzamc.o) && (paramzamc.p != 0))
              {
                i8 = 0;
                i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
              }
              if (i9 == 0)
              {
                paramzamc.l = i4;
                paramzamc.k = i5;
                paramzckc.c = i7;
                paramzckc.d += i6 - paramzckc.b;
                paramzckc.b = i6;
                paramzamc.q = i8;
                return paramzamc.b(paramzckc, paramInt);
              }
            }
          }
          paramzamc.n[(i8++)] = paramzamc.n[(i10++)];
          i9--;
          if (i10 == paramzamc.o) {
            i10 = 0;
          }
          this.b -= 1;
        }
        this.a = 0;
        break;
      case 6: 
        if (i9 == 0)
        {
          if ((i8 == paramzamc.o) && (paramzamc.p != 0))
          {
            i8 = 0;
            i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
          }
          if (i9 == 0)
          {
            paramzamc.q = i8;
            paramInt = paramzamc.b(paramzckc, paramInt);
            i8 = paramzamc.q;
            i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
            if ((i8 == paramzamc.o) && (paramzamc.p != 0))
            {
              i8 = 0;
              i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
            }
            if (i9 == 0)
            {
              paramzamc.l = i4;
              paramzamc.k = i5;
              paramzckc.c = i7;
              paramzckc.d += i6 - paramzckc.b;
              paramzckc.b = i6;
              paramzamc.q = i8;
              return paramzamc.b(paramzckc, paramInt);
            }
          }
        }
        paramInt = 0;
        paramzamc.n[(i8++)] = ((byte)this.f);
        i9--;
        this.a = 0;
      }
    }
    if (i5 > 7)
    {
      i5 -= 8;
      i7++;
      i6--;
    }
    paramzamc.q = i8;
    paramInt = paramzamc.b(paramzckc, paramInt);
    i8 = paramzamc.q;
    i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
    if (paramzamc.p != paramzamc.q)
    {
      paramzamc.l = i4;
      paramzamc.k = i5;
      paramzckc.c = i7;
      paramzckc.d += i6 - paramzckc.b;
      paramzckc.b = i6;
      paramzamc.q = i8;
      return paramzamc.b(paramzckc, paramInt);
    }
    this.a = 8;
    paramInt = 1;
    paramzamc.l = i4;
    paramzamc.k = i5;
    paramzckc.c = i7;
    paramzckc.d += i6 - paramzckc.b;
    paramzckc.b = i6;
    paramzamc.q = i8;
    return paramzamc.b(paramzckc, paramInt);
    paramInt = -3;
    paramzamc.l = i4;
    paramzamc.k = i5;
    paramzckc.c = i7;
    paramzckc.d += i6 - paramzckc.b;
    paramzckc.b = i6;
    paramzamc.q = i8;
    return paramzamc.b(paramzckc, paramInt);
    paramInt = -2;
    paramzamc.l = i4;
    paramzamc.k = i5;
    paramzckc.c = i7;
    paramzckc.d += i6 - paramzckc.b;
    paramzckc.b = i6;
    paramzamc.q = i8;
    return paramzamc.b(paramzckc, paramInt);
  }
  
  void a(zckc paramzckc) {}
  
  int a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, int[] paramArrayOfInt2, int paramInt4, zamc paramzamc, zckc paramzckc)
  {
    int i6 = paramzckc.b;
    int i7 = paramzckc.c;
    int i4 = paramzamc.l;
    int i5 = paramzamc.k;
    int i8 = paramzamc.q;
    int i9 = i8 < paramzamc.p ? paramzamc.p - i8 - 1 : paramzamc.o - i8;
    int i10 = o[paramInt1];
    int i11 = o[paramInt2];
    label1308:
    do
    {
      while (i5 < 20)
      {
        i7--;
        i4 |= (paramzckc.a[(i6++)] & 0xFF) << i5;
        i5 += 8;
      }
      int i1 = i4 & i10;
      int[] arrayOfInt = paramArrayOfInt1;
      int i2 = paramInt3;
      int i15 = (i2 + i1) * 3;
      int i3;
      if ((i3 = arrayOfInt[i15]) == 0)
      {
        i4 >>= arrayOfInt[(i15 + 1)];
        i5 -= arrayOfInt[(i15 + 1)];
        paramzamc.n[(i8++)] = ((byte)arrayOfInt[(i15 + 2)]);
        i9--;
      }
      else
      {
        do
        {
          i4 >>= arrayOfInt[(i15 + 1)];
          i5 -= arrayOfInt[(i15 + 1)];
          if ((i3 & 0x10) != 0)
          {
            i3 &= 0xF;
            i12 = arrayOfInt[(i15 + 2)] + (i4 & o[i3]);
            i4 >>= i3;
            i5 -= i3;
            while (i5 < 15)
            {
              i7--;
              i4 |= (paramzckc.a[(i6++)] & 0xFF) << i5;
              i5 += 8;
            }
            i1 = i4 & i11;
            arrayOfInt = paramArrayOfInt2;
            i2 = paramInt4;
            i15 = (i2 + i1) * 3;
            for (i3 = arrayOfInt[i15];; i3 = arrayOfInt[i15])
            {
              i4 >>= arrayOfInt[(i15 + 1)];
              i5 -= arrayOfInt[(i15 + 1)];
              if ((i3 & 0x10) != 0)
              {
                i3 &= 0xF;
                while (i5 < i3)
                {
                  i7--;
                  i4 |= (paramzckc.a[(i6++)] & 0xFF) << i5;
                  i5 += 8;
                }
                int i13 = arrayOfInt[(i15 + 2)] + (i4 & o[i3]);
                i4 >>= i3;
                i5 -= i3;
                i9 -= i12;
                int i14;
                if (i8 >= i13)
                {
                  i14 = i8 - i13;
                  if ((i8 - i14 > 0) && (2 > i8 - i14))
                  {
                    paramzamc.n[(i8++)] = paramzamc.n[(i14++)];
                    paramzamc.n[(i8++)] = paramzamc.n[(i14++)];
                    i12 -= 2;
                  }
                  else
                  {
                    System.arraycopy(paramzamc.n, i14, paramzamc.n, i8, 2);
                    i8 += 2;
                    i14 += 2;
                    i12 -= 2;
                  }
                }
                else
                {
                  i14 = i8 - i13;
                  do
                  {
                    i14 += paramzamc.o;
                  } while (i14 < 0);
                  i3 = paramzamc.o - i14;
                  if (i12 > i3)
                  {
                    i12 -= i3;
                    if ((i8 - i14 > 0) && (i3 > i8 - i14))
                    {
                      do
                      {
                        paramzamc.n[(i8++)] = paramzamc.n[(i14++)];
                        i3--;
                      } while (i3 != 0);
                    }
                    else
                    {
                      System.arraycopy(paramzamc.n, i14, paramzamc.n, i8, i3);
                      i8 += i3;
                      i14 += i3;
                      i3 = 0;
                    }
                    i14 = 0;
                  }
                }
                if ((i8 - i14 > 0) && (i12 > i8 - i14))
                {
                  do
                  {
                    paramzamc.n[(i8++)] = paramzamc.n[(i14++)];
                    i12--;
                  } while (i12 != 0);
                  break label1308;
                }
                System.arraycopy(paramzamc.n, i14, paramzamc.n, i8, i12);
                i8 += i12;
                i14 += i12;
                i12 = 0;
                break label1308;
              }
              if ((i3 & 0x40) != 0) {
                break;
              }
              i1 += arrayOfInt[(i15 + 2)];
              i1 += (i4 & o[i3]);
              i15 = (i2 + i1) * 3;
            }
            paramzckc.i = "invalid distance code";
            i12 = paramzckc.c - i7;
            i12 = i5 >> 3 < i12 ? i5 >> 3 : i12;
            i7 += i12;
            i6 -= i12;
            i5 -= (i12 << 3);
            paramzamc.l = i4;
            paramzamc.k = i5;
            paramzckc.c = i7;
            paramzckc.d += i6 - paramzckc.b;
            paramzckc.b = i6;
            paramzamc.q = i8;
            return -3;
          }
          if ((i3 & 0x40) != 0) {
            break;
          }
          i1 += arrayOfInt[(i15 + 2)];
          i1 += (i4 & o[i3]);
          i15 = (i2 + i1) * 3;
        } while ((i3 = arrayOfInt[i15]) != 0);
        i4 >>= arrayOfInt[(i15 + 1)];
        i5 -= arrayOfInt[(i15 + 1)];
        paramzamc.n[(i8++)] = ((byte)arrayOfInt[(i15 + 2)]);
        i9--;
        continue;
        if ((i3 & 0x20) != 0)
        {
          i12 = paramzckc.c - i7;
          i12 = i5 >> 3 < i12 ? i5 >> 3 : i12;
          i7 += i12;
          i6 -= i12;
          i5 -= (i12 << 3);
          paramzamc.l = i4;
          paramzamc.k = i5;
          paramzckc.c = i7;
          paramzckc.d += i6 - paramzckc.b;
          paramzckc.b = i6;
          paramzamc.q = i8;
          return 1;
        }
        paramzckc.i = "invalid literal/length code";
        i12 = paramzckc.c - i7;
        i12 = i5 >> 3 < i12 ? i5 >> 3 : i12;
        i7 += i12;
        i6 -= i12;
        i5 -= (i12 << 3);
        paramzamc.l = i4;
        paramzamc.k = i5;
        paramzckc.c = i7;
        paramzckc.d += i6 - paramzckc.b;
        paramzckc.b = i6;
        paramzamc.q = i8;
        return -3;
      }
    } while ((i9 >= 258) && (i7 >= 10));
    int i12 = paramzckc.c - i7;
    i12 = i5 >> 3 < i12 ? i5 >> 3 : i12;
    i7 += i12;
    i6 -= i12;
    i5 -= (i12 << 3);
    paramzamc.l = i4;
    paramzamc.k = i5;
    paramzckc.c = i7;
    paramzckc.d += i6 - paramzckc.b;
    paramzckc.b = i6;
    paramzamc.q = i8;
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */