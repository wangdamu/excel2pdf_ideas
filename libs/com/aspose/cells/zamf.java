package com.aspose.cells;

final class zamf
{
  int a;
  int b;
  long[] c = new long[1];
  long d;
  int e;
  int f;
  int g;
  zamc h;
  private static byte[] i = { 0, 0, -1, -1 };
  
  int a(zckc paramzckc)
  {
    if ((paramzckc == null) || (paramzckc.k == null)) {
      return -2;
    }
    paramzckc.d = (paramzckc.h = 0L);
    paramzckc.i = null;
    paramzckc.k.a = (paramzckc.k.f != 0 ? 7 : 0);
    paramzckc.k.h.a(paramzckc, null);
    return 0;
  }
  
  int b(zckc paramzckc)
  {
    if (this.h != null) {
      this.h.a(paramzckc);
    }
    this.h = null;
    return 0;
  }
  
  int a(zckc paramzckc, int paramInt)
  {
    paramzckc.i = null;
    this.h = null;
    this.f = 0;
    if (paramInt < 0)
    {
      paramInt = -paramInt;
      this.f = 1;
    }
    if ((paramInt < 8) || (paramInt > 15))
    {
      b(paramzckc);
      return -2;
    }
    this.g = paramInt;
    paramzckc.k.h = new zamc(paramzckc, paramzckc.k.f != 0 ? null : this, 1 << paramInt);
    a(paramzckc);
    return 0;
  }
  
  int b(zckc paramzckc, int paramInt)
  {
    if ((paramzckc == null) || (paramzckc.k == null) || (paramzckc.a == null)) {
      return -2;
    }
    paramInt = paramInt == 4 ? -5 : 0;
    int j = -5;
    for (;;)
    {
      switch (paramzckc.k.a)
      {
      case 0: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        if (((paramzckc.k.b = paramzckc.a[(paramzckc.b++)]) & 0xF) != 8)
        {
          paramzckc.k.a = 13;
          paramzckc.i = "unknown compression method";
          paramzckc.k.e = 5;
        }
        else if ((paramzckc.k.b >> 4) + 8 > paramzckc.k.g)
        {
          paramzckc.k.a = 13;
          paramzckc.i = "invalid window size";
          paramzckc.k.e = 5;
        }
        else
        {
          paramzckc.k.a = 1;
        }
        break;
      case 1: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        int k = paramzckc.a[(paramzckc.b++)] & 0xFF;
        if (((paramzckc.k.b << 8) + k) % 31 != 0)
        {
          paramzckc.k.a = 13;
          paramzckc.i = "incorrect header check";
          paramzckc.k.e = 5;
        }
        else if ((k & 0x20) == 0)
        {
          paramzckc.k.a = 7;
        }
        else
        {
          paramzckc.k.a = 2;
        }
        break;
      case 2: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d = ((paramzckc.a[(paramzckc.b++)] & 0xFF) << 24 & 0xFF000000);
        paramzckc.k.a = 3;
      case 3: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d += ((paramzckc.a[(paramzckc.b++)] & 0xFF) << 16 & 0xFF0000);
        paramzckc.k.a = 4;
      case 4: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d += ((paramzckc.a[(paramzckc.b++)] & 0xFF) << 8 & 0xFF00);
        paramzckc.k.a = 5;
      case 5: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d += (paramzckc.a[(paramzckc.b++)] & 0xFF);
        paramzckc.m = paramzckc.k.d;
        paramzckc.k.a = 6;
        return 2;
      case 6: 
        paramzckc.k.a = 13;
        paramzckc.i = "need dictionary";
        paramzckc.k.e = 0;
        return -2;
      case 7: 
        j = paramzckc.k.h.a(paramzckc, j);
        if (j == -3)
        {
          paramzckc.k.a = 13;
          paramzckc.k.e = 0;
        }
        else
        {
          if (j == 0) {
            j = paramInt;
          }
          if (j != 1) {
            return j;
          }
          j = paramInt;
          paramzckc.k.h.a(paramzckc, paramzckc.k.c);
          if (paramzckc.k.f != 0) {
            paramzckc.k.a = 12;
          } else {
            paramzckc.k.a = 8;
          }
        }
        break;
      case 8: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d = ((paramzckc.a[(paramzckc.b++)] & 0xFF) << 24 & 0xFF000000);
        paramzckc.k.a = 9;
      case 9: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d += ((paramzckc.a[(paramzckc.b++)] & 0xFF) << 16 & 0xFF0000);
        paramzckc.k.a = 10;
      case 10: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d += ((paramzckc.a[(paramzckc.b++)] & 0xFF) << 8 & 0xFF00);
        paramzckc.k.a = 11;
      case 11: 
        if (paramzckc.c == 0) {
          return j;
        }
        j = paramInt;
        paramzckc.c -= 1;
        paramzckc.d += 1L;
        paramzckc.k.d += (paramzckc.a[(paramzckc.b++)] & 0xFF);
        if ((int)paramzckc.k.c[0] == (int)paramzckc.k.d) {
          break label1176;
        }
        paramzckc.k.a = 13;
        paramzckc.i = "incorrect data check";
        paramzckc.k.e = 5;
      }
    }
    label1176:
    paramzckc.k.a = 12;
    return 1;
    return -3;
    return -2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */