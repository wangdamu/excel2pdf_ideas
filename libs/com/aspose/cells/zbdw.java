package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.zc;

class zbdw
  extends zt
{
  private zajl a;
  private zabw b;
  private zbdk c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h = -1;
  private byte[] i;
  private zami j;
  private byte[] k = new byte[14];
  private byte l;
  private byte m;
  
  public zbdw(zbdk paramzbdk, int paramInt, zajl paramzajl, zabw paramzabw)
  {
    this.a = paramzajl;
    this.b = paramzabw;
    this.c = paramzbdk;
    this.e = paramInt;
    q();
    this.d = m(this.f + 5, (this.i[(this.f + 4)] & 0xFF & 0x3) + 1);
  }
  
  public zbdw(zbdk paramzbdk, zajl paramzajl, zabw paramzabw, Object paramObject)
  {
    this.a = paramzajl;
    this.b = paramzabw;
    this.c = paramzbdk;
    int[] arrayOfInt = (int[])paramObject;
    this.e = arrayOfInt[(arrayOfInt.length - 1)];
    q();
    this.d = arrayOfInt[(arrayOfInt.length - 2)];
    this.h = arrayOfInt[(arrayOfInt.length - 3)];
    this.j = new zami(arrayOfInt, arrayOfInt.length - 3);
  }
  
  private void q()
  {
    this.i = this.c.h(this.e);
    this.f = this.c.i(this.e);
    this.g = this.c.j(this.e);
    this.l = this.i[(this.f + 2)];
    this.m = this.i[(this.f + 3)];
  }
  
  public zajl c()
  {
    return this.a;
  }
  
  public void a(zajl paramzajl)
  {
    this.a = paramzajl;
  }
  
  byte[] m()
  {
    return this.i;
  }
  
  int n()
  {
    return this.e;
  }
  
  int o()
  {
    if (this.h > -1) {
      return this.h;
    }
    return d(this.i, this.f, this.g);
  }
  
  int p()
  {
    return this.f;
  }
  
  private int r()
  {
    int n = this.i[(this.f + 4)];
    return 5 + (n & 0xFF & 0x3) + ((n & 0xFF & 0x4) == 0 ? 2 : 3) + ((n & 0xFF & 0x18) >> 3);
  }
  
  private void s()
  {
    if (this.j == null) {
      this.j = new zami(Math.max((this.g - this.f) / 7, 10));
    } else {
      this.j.c();
    }
    int n = this.f + r();
    while ((n < this.g) && (this.i[n] != 0))
    {
      this.j.a(n);
      n += r(n);
    }
    this.h = n;
  }
  
  private int r(int paramInt)
  {
    if (this.i[paramInt] == 0) {
      return 0;
    }
    int n = this.i[paramInt];
    return (n & 0xFF & 0x3) + ((n & 0xFF & 0x4) == 0 ? 2 : 3) + t(n & 0xFF & 0xF8);
  }
  
  private int s(int paramInt)
  {
    int n = this.i[paramInt];
    return paramInt + (n & 0xFF & 0x3) + ((n & 0xFF & 0x4) == 0 ? 2 : 3);
  }
  
  private static int t(int paramInt)
  {
    switch (paramInt)
    {
    case 32: 
      return 8;
    case 48: 
    case 112: 
    case 176: 
    case 240: 
      return 4;
    case 96: 
    case 160: 
    case 224: 
      return 3;
    case 24: 
    case 56: 
    case 80: 
    case 144: 
    case 208: 
      return 2;
    case 8: 
    case 40: 
    case 64: 
    case 128: 
    case 192: 
      return 1;
    }
    return 0;
  }
  
  private static int u(int paramInt)
  {
    if (paramInt > 16777215) {
      return 4;
    }
    if (paramInt > 65535) {
      return 3;
    }
    if (paramInt > 255) {
      return 2;
    }
    return 1;
  }
  
  private int a(zgs paramzgs, int paramInt1, int paramInt2)
  {
    int n = b(paramzgs, paramInt1, paramInt2);
    return n + a(paramzgs, n);
  }
  
  private int b(zgs paramzgs, int paramInt1, int paramInt2)
  {
    int n = paramInt1;
    int i1 = 0;
    int i2 = 1;
    int i3 = 0;
    if ((paramInt2 & 0x1) != 0)
    {
      if (paramzgs.a > 255)
      {
        i3 = (byte)(i3 | 0x4);
        q(i2, paramzgs.a);
        i2 += 2;
      }
      else
      {
        this.k[(i2++)] = ((byte)paramzgs.a);
      }
      if ((paramInt2 & 0x2) == 0)
      {
        n = this.j.b(n);
        i1 = this.i[n];
        n += ((i1 & 0xFF & 0x4) != 0 ? 3 : 2);
      }
    }
    else
    {
      n = this.j.b(n);
      i1 = this.i[n];
      n++;
      if ((i1 & 0xFF & 0x4) != 0)
      {
        i3 = (byte)(i3 | 0x4);
        this.k[(i2++)] = this.i[(n++)];
        this.k[(i2++)] = this.i[(n++)];
      }
      else
      {
        this.k[(i2++)] = this.i[(n++)];
      }
    }
    if ((paramInt2 & 0x2) != 0)
    {
      int i4 = paramzgs.b - 15;
      if (i4 > -1) {
        if (i4 <= 255)
        {
          i3 = (byte)(i3 | 0x1);
          this.k[(i2++)] = ((byte)i4);
        }
        else if (i4 < 65535)
        {
          i3 = (byte)(i3 | 0x2);
          q(i2, i4);
          i2 += 2;
        }
        else
        {
          i3 = (byte)(i3 | 0x3);
          r(i2, i4);
          i2 += 3;
        }
      }
    }
    else
    {
      switch (i1 & 0xFF & 0x3)
      {
      case 0: 
        i3 = (byte)(i3 | 0x1);
        this.k[(i2++)] = this.i[(n++)];
        break;
      case 1: 
        i3 = (byte)(i3 | 0x2);
        this.k[(i2++)] = this.i[(n++)];
        this.k[(i2++)] = this.i[(n++)];
        break;
      case 2: 
        i3 = (byte)(i3 | 0x3);
        this.k[(i2++)] = this.i[(n++)];
        this.k[(i2++)] = this.i[(n++)];
        this.k[(i2++)] = this.i[(n++)];
      }
    }
    this.k[0] = i3;
    return i2;
  }
  
  private int a(zgs paramzgs, int paramInt)
  {
    int n;
    switch (paramzgs.c)
    {
    case 1: 
      int tmp49_48 = 0;
      byte[] tmp49_45 = this.k;
      tmp49_45[tmp49_48] = ((byte)(tmp49_45[tmp49_48] | 0x20));
      long l1 = Double.doubleToRawLongBits(((Double)paramzgs.d).doubleValue());
      this.k[paramInt] = ((byte)(int)(l1 & 0xFF));
      this.k[(paramInt + 1)] = ((byte)(int)(l1 >> 8 & 0xFF));
      this.k[(paramInt + 2)] = ((byte)(int)(l1 >> 16 & 0xFF));
      this.k[(paramInt + 3)] = ((byte)(int)(l1 >> 24 & 0xFF));
      this.k[(paramInt + 4)] = ((byte)(int)(l1 >> 32 & 0xFF));
      this.k[(paramInt + 5)] = ((byte)(int)(l1 >> 40 & 0xFF));
      this.k[(paramInt + 6)] = ((byte)(int)(l1 >> 48 & 0xFF));
      this.k[(paramInt + 7)] = ((byte)(int)(l1 >> 56));
      return 8;
    case 6: 
      n = ((Integer)paramzgs.d).intValue();
      if ((n & 0x3) == 2)
      {
        int i1 = u(n >> 2, paramInt);
        if (i1 > -1) {
          return i1;
        }
      }
      int tmp252_251 = 0;
      byte[] tmp252_248 = this.k;
      tmp252_248[tmp252_251] = ((byte)(tmp252_248[tmp252_251] | 0x30));
      this.k[paramInt] = ((byte)(n & 0xFF));
      this.k[(paramInt + 1)] = ((byte)(n >> 8 & 0xFF));
      this.k[(paramInt + 2)] = ((byte)(n >> 16 & 0xFF));
      this.k[(paramInt + 3)] = ((byte)(n >> 24 & 0xFF));
      return 4;
    case 4: 
      n = ((zbbj)paramzgs.d).e;
      if (n < 255)
      {
        int tmp347_346 = 0;
        byte[] tmp347_343 = this.k;
        tmp347_343[tmp347_346] = ((byte)(tmp347_343[tmp347_346] | (paramzgs.e ? '' : 64)));
        this.k[paramInt] = ((byte)n);
        return 1;
      }
      if (n <= 65535)
      {
        int tmp388_387 = 0;
        byte[] tmp388_384 = this.k;
        tmp388_384[tmp388_387] = ((byte)(tmp388_384[tmp388_387] | (paramzgs.e ? '' : 80)));
        q(paramInt, n);
        return 2;
      }
      if (n <= 16777215)
      {
        int tmp427_426 = 0;
        byte[] tmp427_423 = this.k;
        tmp427_423[tmp427_426] = ((byte)(tmp427_423[tmp427_426] | (paramzgs.e ? ' ' : 96)));
        r(paramInt, n);
        return 3;
      }
      int tmp460_459 = 0;
      byte[] tmp460_456 = this.k;
      tmp460_456[tmp460_459] = ((byte)(tmp460_456[tmp460_459] | (paramzgs.e ? '°' : 112)));
      s(paramInt, n);
      return 4;
    case 5: 
      n = ((zaai)paramzgs.d).a;
      if (n < 255)
      {
        int tmp511_510 = 0;
        byte[] tmp511_507 = this.k;
        tmp511_507[tmp511_510] = ((byte)(tmp511_507[tmp511_510] | 0xC0));
        this.k[paramInt] = ((byte)n);
        return 1;
      }
      if (n <= 65535)
      {
        int tmp540_539 = 0;
        byte[] tmp540_536 = this.k;
        tmp540_536[tmp540_539] = ((byte)(tmp540_536[tmp540_539] | 0xD0));
        q(paramInt, n);
        return 2;
      }
      if (n <= 16777215)
      {
        int tmp567_566 = 0;
        byte[] tmp567_563 = this.k;
        tmp567_563[tmp567_566] = ((byte)(tmp567_563[tmp567_566] | 0xE0));
        r(paramInt, n);
        return 3;
      }
      int tmp588_587 = 0;
      byte[] tmp588_584 = this.k;
      tmp588_584[tmp588_587] = ((byte)(tmp588_584[tmp588_587] | 0xF0));
      s(paramInt, n);
      return 4;
    case 2: 
      int tmp609_608 = 0;
      byte[] tmp609_605 = this.k;
      tmp609_605[tmp609_608] = ((byte)(tmp609_605[tmp609_608] | (((Boolean)paramzgs.d).booleanValue() ? 72 : 88)));
      return 0;
    case 3: 
      switch (((Byte)paramzgs.d).byteValue())
      {
      case 7: 
        int tmp725_724 = 0;
        byte[] tmp725_721 = this.k;
        tmp725_721[tmp725_724] = ((byte)(tmp725_721[tmp725_724] | 0x68));
        return 0;
      case 42: 
        int tmp739_738 = 0;
        byte[] tmp739_735 = this.k;
        tmp739_735[tmp739_738] = ((byte)(tmp739_735[tmp739_738] | 0xC8));
        return 0;
      case 29: 
        int tmp754_753 = 0;
        byte[] tmp754_750 = this.k;
        tmp754_750[tmp754_753] = ((byte)(tmp754_750[tmp754_753] | 0xA8));
        return 0;
      case 0: 
        int tmp769_768 = 0;
        byte[] tmp769_765 = this.k;
        tmp769_765[tmp769_768] = ((byte)(tmp769_765[tmp769_768] | 0x78));
        return 0;
      case 36: 
        int tmp783_782 = 0;
        byte[] tmp783_779 = this.k;
        tmp783_779[tmp783_782] = ((byte)(tmp783_779[tmp783_782] | 0xB8));
        return 0;
      case -2: 
        int tmp798_797 = 0;
        byte[] tmp798_794 = this.k;
        tmp798_794[tmp798_797] = ((byte)(tmp798_794[tmp798_797] | 0xD8));
        return 0;
      case 23: 
        int tmp813_812 = 0;
        byte[] tmp813_809 = this.k;
        tmp813_809[tmp813_812] = ((byte)(tmp813_809[tmp813_812] | 0x98));
        return 0;
      case 15: 
        int tmp828_827 = 0;
        byte[] tmp828_824 = this.k;
        tmp828_824[tmp828_827] = ((byte)(tmp828_824[tmp828_827] | 0x88));
        return 0;
      }
      int tmp843_842 = 0;
      byte[] tmp843_839 = this.k;
      tmp843_839[tmp843_842] = ((byte)(tmp843_839[tmp843_842] | 0xE8));
      return 0;
    }
    int tmp858_857 = 0;
    byte[] tmp858_854 = this.k;
    tmp858_854[tmp858_857] = ((byte)(tmp858_854[tmp858_857] | 0x10));
    return 0;
  }
  
  private int m(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 1: 
      int n = this.i[paramInt1] & 0xFF;
      return n;
    case 2: 
      return (this.i[paramInt1] & 0xFF) << 8 | this.i[(paramInt1 + 1)] & 0xFF;
    case 3: 
      return (this.i[paramInt1] & 0xFF) << 16 | (this.i[(paramInt1 + 1)] & 0xFF) << 8 | this.i[(paramInt1 + 2)] & 0xFF;
    case 4: 
      return (this.i[paramInt1] & 0xFF) << 24 | (this.i[(paramInt1 + 1)] & 0xFF) << 16 | (this.i[(paramInt1 + 2)] & 0xFF) << 8 | this.i[(paramInt1 + 3)] & 0xFF;
    }
    return -1;
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt3)
    {
    case 1: 
      this.i[paramInt1] = ((byte)paramInt2);
      break;
    case 2: 
      n(paramInt1, paramInt2);
      break;
    case 3: 
      o(paramInt1, paramInt2);
      break;
    case 4: 
      p(paramInt1, paramInt2);
    }
  }
  
  private void n(int paramInt1, int paramInt2)
  {
    this.i[paramInt1] = ((byte)(paramInt2 >> 8));
    this.i[(paramInt1 + 1)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private void o(int paramInt1, int paramInt2)
  {
    this.i[paramInt1] = ((byte)(paramInt2 >> 16));
    this.i[(paramInt1 + 1)] = ((byte)(paramInt2 >> 8 & 0xFF));
    this.i[(paramInt1 + 2)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private void p(int paramInt1, int paramInt2)
  {
    this.i[paramInt1] = ((byte)(paramInt2 >> 24));
    this.i[(paramInt1 + 1)] = ((byte)(paramInt2 >> 16 & 0xFF));
    this.i[(paramInt1 + 2)] = ((byte)(paramInt2 >> 8 & 0xFF));
    this.i[(paramInt1 + 3)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private void q(int paramInt1, int paramInt2)
  {
    this.k[paramInt1] = ((byte)(paramInt2 >> 8));
    this.k[(paramInt1 + 1)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private void r(int paramInt1, int paramInt2)
  {
    this.k[paramInt1] = ((byte)(paramInt2 >> 16));
    this.k[(paramInt1 + 1)] = ((byte)(paramInt2 >> 8 & 0xFF));
    this.k[(paramInt1 + 2)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private void s(int paramInt1, int paramInt2)
  {
    this.k[paramInt1] = ((byte)(paramInt2 >> 24));
    this.k[(paramInt1 + 1)] = ((byte)(paramInt2 >> 16 & 0xFF));
    this.k[(paramInt1 + 2)] = ((byte)(paramInt2 >> 8 & 0xFF));
    this.k[(paramInt1 + 3)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private void t()
  {
    int tmp10_9 = (this.f + 2);
    byte[] tmp10_1 = this.i;
    tmp10_1[tmp10_9] = ((byte)(tmp10_1[tmp10_9] + 1));
    this.l = ((byte)(this.l + 1));
  }
  
  private void u()
  {
    this.m = ((byte)Math.min(255, this.h - this.f - 7));
    this.i[(this.f + 3)] = this.m;
    if (this.h < this.g) {
      this.i[this.h] = 0;
    }
  }
  
  private int v(int paramInt)
  {
    int n = paramInt;
    n -= this.g - this.h;
    if (n > 0)
    {
      this.e = this.c.a(this.e, this.f, this.h, this.g, n);
      return v();
    }
    return 0;
  }
  
  private int v()
  {
    this.i = this.c.h(this.e);
    int n = this.c.i(this.e) - this.f;
    if (n != 0)
    {
      int[] arrayOfInt = this.j.d();
      int i1 = this.j.a();
      for (int i2 = 0; i2 < i1; i2++) {
        arrayOfInt[i2] += n;
      }
      this.h += n;
      this.f += n;
    }
    this.g = this.c.j(this.e);
    if (this.h < this.g) {
      this.i[this.h] = 0;
    }
    return n;
  }
  
  private int c(int paramInt1, int paramInt2, int paramInt3)
  {
    int n = paramInt2;
    int i1 = v(paramInt3);
    n += i1;
    System.arraycopy(this.i, n, this.i, n + paramInt3, this.h - n);
    if (paramInt1 < this.j.a())
    {
      int[] arrayOfInt = this.j.d();
      int i2 = this.j.a();
      while (paramInt1 < i2)
      {
        arrayOfInt[paramInt1] += paramInt3;
        paramInt1++;
      }
    }
    this.h += paramInt3;
    u();
    return i1;
  }
  
  public int a()
  {
    if (this.h < 0) {
      s();
    }
    return this.j.a();
  }
  
  public int g()
  {
    this.e = this.c.b(this.d, this.e);
    if (this.e < 0) {
      return this.e;
    }
    f(this.e);
    return this.e;
  }
  
  public void h()
  {
    g();
  }
  
  public void f(int paramInt)
  {
    this.e = paramInt;
    this.i = this.c.h(this.e);
    int n = this.c.i(this.e) - this.f;
    if (n != 0) {
      this.f += n;
    }
    this.g = this.c.j(this.e);
    if (this.l != this.i[(this.f + 2)])
    {
      this.l = this.i[(this.f + 2)];
      this.m = this.i[(this.f + 3)];
      this.h = -1;
      this.j = null;
    }
    else if (this.m != this.i[(this.f + 3)])
    {
      this.m = this.i[(this.f + 3)];
      this.h = -1;
      this.j = null;
    }
    else if ((n != 0) && (this.h > -1))
    {
      int[] arrayOfInt = this.j.d();
      for (int i1 = this.j.a() - 1; i1 > -1; i1--) {
        arrayOfInt[i1] += n;
      }
      this.h += n;
    }
  }
  
  public int b(int paramInt)
  {
    if (this.h < 0) {
      s();
    }
    if (this.j.a() < 1) {
      return -1;
    }
    return a(paramInt, -1, -1);
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    int n = paramInt2;
    if (this.h < 0) {
      s();
    }
    if (this.j.a() < 1) {
      return -1;
    }
    if (n >= this.j.a()) {
      n = this.j.a() - 1;
    } else if (n < 0) {
      n = 0;
    }
    int i1 = a(n);
    if (i1 == paramInt1) {
      return n;
    }
    if (i1 > paramInt1)
    {
      if (n == 0) {
        return -1;
      }
      return a(paramInt1, n - (i1 - paramInt1), n - 1);
    }
    if (n == this.j.a() - 1) {
      return -this.j.a() - 1;
    }
    return a(paramInt1, n + 1, n + (paramInt1 - i1));
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int n = paramInt2;
    int i1 = paramInt3;
    if (this.h < 0) {
      s();
    }
    if (n < 0) {
      n = 0;
    } else if (n >= this.j.a()) {
      return -this.j.a() - 1;
    }
    int i2 = a(n);
    if (paramInt1 == i2) {
      return n;
    }
    if (paramInt1 < i2) {
      return -n - 1;
    }
    if ((i1 < 0) || (i1 >= this.j.a())) {
      i1 = this.j.a() - 1;
    }
    if (n == i1) {
      return -i1 - 2;
    }
    i1 = Math.min(i1, n + (paramInt1 - i2));
    i2 = a(i1);
    if (paramInt1 == i2) {
      return i1;
    }
    if (paramInt1 > i2) {
      return -i1 - 2;
    }
    n = Math.max(n + 1, i1 - (i2 - paramInt1));
    i1--;
    if (i1 < n) {
      return -n - 1;
    }
    if (i1 == n)
    {
      i2 = a(i1);
      if (paramInt1 < i2) {
        return -i1 - 1;
      }
      if (paramInt1 == i2) {
        return i1;
      }
      return -i1 - 2;
    }
    for (;;)
    {
      int i3 = n + i1 >> 1;
      i2 = a(i3);
      if (i3 == n)
      {
        if (paramInt1 == i2) {
          return n;
        }
        if (paramInt1 < i2) {
          return -n - 1;
        }
        if (n < i1)
        {
          i2 = a(i1);
          if (paramInt1 == i2) {
            return i1;
          }
          if (paramInt1 < i2) {
            return -i1 - 1;
          }
        }
        return -i1 - 2;
      }
      if (paramInt1 < i2)
      {
        i1 = i3 - 1;
        if (i1 == n)
        {
          i2 = a(n);
          if (paramInt1 == i2) {
            return n;
          }
          if (paramInt1 < i2) {
            return -n - 1;
          }
          return -i3 - 1;
        }
        n = Math.max(n, i3 - (i2 - paramInt1));
      }
      else
      {
        if (paramInt1 == i2) {
          return i3;
        }
        n = i3 + 1;
        if (i1 == n)
        {
          i2 = a(n);
          if (paramInt1 == i2) {
            return n;
          }
          if (paramInt1 > i2) {
            return -n - 2;
          }
          return -n - 1;
        }
        i1 = Math.min(i1, i3 + (paramInt1 - i2));
      }
    }
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    if (this.h < 0) {
      s();
    }
    if (paramInt2 < 0)
    {
      paramInt2 = 0;
    }
    else if (paramInt2 >= this.j.a())
    {
      if (this.j.a() < 1) {
        return -1;
      }
      paramInt2 = this.j.a();
    }
    int n = a(paramInt2);
    if (paramInt1 == n) {
      return paramInt2;
    }
    if (paramInt1 < n)
    {
      do
      {
        paramInt2--;
        if (paramInt2 < 0) {
          return -1;
        }
        n = a(paramInt2);
        if (n == paramInt1) {
          return paramInt2;
        }
      } while (n >= paramInt1);
      return -paramInt2 - 2;
    }
    do
    {
      paramInt2++;
      if (paramInt2 >= this.j.a()) {
        return -this.j.a() - 1;
      }
      n = a(paramInt2);
      if (n == paramInt1) {
        return paramInt2;
      }
    } while (n <= paramInt1);
    return -paramInt2 - 1;
  }
  
  public int a(int paramInt, boolean paramBoolean)
  {
    int n = paramInt;
    if (paramBoolean)
    {
      if (n < 0)
      {
        if (this.h < 0) {
          s();
        }
        return this.j.a() - 1;
      }
      return n - 1;
    }
    if (this.h < 0) {
      s();
    }
    if (n < 0) {
      return this.j.a() > 0 ? 0 : -1;
    }
    n++;
    if (n >= this.j.a()) {
      return -this.j.a() - 1;
    }
    return n;
  }
  
  public zaiv b()
  {
    if (this.h < 0) {
      s();
    }
    return new zua(this, -1, 0, -1, this.j.a() - 1, 1);
  }
  
  public zaiv a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int n = paramInt1;
    int i1 = paramInt2;
    if (this.h < 0) {
      s();
    }
    int i2;
    if (n < 0)
    {
      n = 0;
      i2 = -1;
    }
    else
    {
      i2 = a(n);
    }
    int i3;
    if (i1 < 0)
    {
      i1 = this.j.a() - 1;
      i3 = -1;
    }
    else
    {
      i3 = a(i1);
    }
    if (paramBoolean) {
      return new ztz(this, i2, n, i3, i1, 1);
    }
    return new zua(this, i2, n, i3, i1, 1);
  }
  
  public zaiv a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (this.h < 0) {
      s();
    }
    if (paramBoolean) {
      return new ztz(this, paramInt1, paramInt2, paramInt3, paramInt4, 1);
    }
    return new zua(this, paramInt1, paramInt2, paramInt3, paramInt4, 1);
  }
  
  public int c(int paramInt)
  {
    if (this.h < 0) {
      s();
    }
    return paramInt;
  }
  
  public int d(int paramInt)
  {
    return paramInt;
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    int n = paramInt1;
    if (this.h < 0) {
      s();
    }
    if (paramInt2 < 0)
    {
      if (n < 0) {
        n = this.j.a() - 1;
      }
      d(n + paramInt2 + 1, n);
    }
    else
    {
      if (n < 0) {
        n = 0;
      }
      d(n, n + paramInt2 - 1);
    }
  }
  
  public int d(int paramInt1, int paramInt2)
  {
    int n = paramInt1;
    int i1 = paramInt2;
    if (this.h < 0) {
      s();
    }
    if (n < 0)
    {
      if (i1 < 0) {
        i1 = this.j.a();
      }
      n = 0;
    }
    else if (i1 < 0)
    {
      i1 = this.j.a();
    }
    else if (i1 < this.j.a())
    {
      i1++;
    }
    if (n == i1) {
      return 0;
    }
    if (i1 < this.j.a()) {
      c(i1, this.j.b(i1), this.j.b(n) - this.j.b(i1));
    } else {
      this.h = this.j.b(n);
    }
    this.j.a(n, i1 - n);
    u();
    t();
    return i1 - n;
  }
  
  public int e(int paramInt1, int paramInt2)
  {
    if (this.h < 0) {
      s();
    }
    if (paramInt1 < 0)
    {
      if (paramInt2 < 0) {
        return this.j.a();
      }
      paramInt1 = 0;
    }
    else if (paramInt2 < 0)
    {
      return this.j.a() - paramInt1;
    }
    return paramInt2 - paramInt1 + 1;
  }
  
  public void e(int paramInt)
  {
    int n;
    if ((this.h < 0) || (this.j.a() < 1)) {
      n = this.f + r();
    } else {
      n = this.j.b(0);
    }
    if (paramInt > -1)
    {
      paramInt *= 14;
      if (this.g - n > paramInt)
      {
        this.e = this.c.a(this.e, this.f, n, this.g, paramInt, true);
        v();
      }
    }
    if (this.h > n)
    {
      this.h = n;
      u();
      this.j.c();
      t();
    }
    else if ((this.h < 0) && (d(this.i, this.f, this.g) > n))
    {
      this.m = ((byte)(n - this.f - 7));
      this.i[(this.f + 3)] = this.m;
      this.i[n] = 0;
      t();
    }
  }
  
  public boolean g(int paramInt1, int paramInt2)
  {
    return c(paramInt1, paramInt2, false);
  }
  
  public boolean l(int paramInt1, int paramInt2)
  {
    return c(paramInt1, paramInt2, true);
  }
  
  private boolean c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.h < 0) {
      s();
    }
    if (paramInt1 < -1) {
      paramInt1 = (int)((this.g - this.f) / 100.0F * (-paramInt1 - 1));
    } else if (paramInt1 < 0) {
      paramInt1 = this.c.e();
    } else if (paramInt1 > 0) {
      paramInt1 *= 14;
    }
    if (this.g - this.h <= paramInt1) {
      return false;
    }
    if (paramInt2 < 0) {
      paramInt2 = this.c.e();
    } else if (paramInt2 > 0) {
      paramInt2 *= 14;
    }
    if (this.g - this.h <= paramInt2) {
      return false;
    }
    this.e = this.c.a(this.e, this.f, this.h, this.g, paramInt2, paramBoolean);
    v();
    return true;
  }
  
  public Object l()
  {
    if (this.h < 0) {
      s();
    }
    int n = this.j.a();
    int[] arrayOfInt1 = this.j.d();
    int[] arrayOfInt2;
    if (arrayOfInt1.length != n + 3)
    {
      arrayOfInt2 = new int[n + 3];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, n);
    }
    else
    {
      arrayOfInt2 = arrayOfInt1;
    }
    arrayOfInt2[n] = this.h;
    arrayOfInt2[(n + 1)] = this.d;
    arrayOfInt2[(n + 2)] = this.e;
    return arrayOfInt2;
  }
  
  public void f(int paramInt1, int paramInt2)
  {
    int n = paramInt1;
    if (this.h < 0) {
      s();
    }
    if (n < 0) {}
    for (n = 0; n < this.j.a(); n++)
    {
      int i3 = this.j.b(n);
      int i1;
      int i2;
      if ((this.i[i3] & 0xFF & 0x4) == 0)
      {
        i1 = this.i[(i3 + 1)] & 0xFF;
        i2 = i1 + paramInt2;
        if (i2 <= 255)
        {
          this.i[(i3 + 1)] = ((byte)i2);
        }
        else
        {
          i3 += c(n + 1, i3 + 2, 1);
          t();
          int tmp127_125 = i3;
          byte[] tmp127_122 = this.i;
          tmp127_122[tmp127_125] = ((byte)(tmp127_122[tmp127_125] | 0x4));
          n(i3 + 1, i2);
        }
      }
      else
      {
        i1 = (this.i[(i3 + 1)] & 0xFF) << 8 | this.i[(i3 + 2)] & 0xFF;
        i2 = i1 + paramInt2;
        if (i2 > 255)
        {
          n(i3 + 1, i2);
        }
        else
        {
          i3 += c(n + 1, i3 + 3, -1);
          t();
          int tmp232_230 = i3;
          byte[] tmp232_227 = this.i;
          tmp232_227[tmp232_230] = ((byte)(tmp232_227[tmp232_230] & 0xFB));
          this.i[(i3 + 1)] = ((byte)i2);
        }
      }
    }
  }
  
  public int a(zgs paramzgs)
  {
    if (this.h < 0) {
      s();
    }
    int n = a(paramzgs, -1, 7);
    w(n);
    System.arraycopy(this.k, 0, this.i, this.h - n, n);
    return this.j.a() - 1;
  }
  
  private void w(int paramInt)
  {
    v(paramInt);
    this.j.a(this.h);
    this.h += paramInt;
    u();
    t();
  }
  
  private int a(zgs[] paramArrayOfzgs, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 1) {
      return a(paramArrayOfzgs[paramInt1]);
    }
    if (this.h < 0) {
      s();
    }
    byte[] arrayOfByte = new byte[this.k.length * paramArrayOfzgs.length];
    this.j.c(paramArrayOfzgs.length);
    int n = 0;
    paramInt2 += paramInt1;
    while (paramInt1 < paramInt2)
    {
      zgs localzgs = paramArrayOfzgs[paramInt1];
      this.j.a(this.h + n);
      int i1 = a(localzgs, -1, 7);
      System.arraycopy(this.k, 0, arrayOfByte, n, i1);
      n += i1;
      paramInt1++;
    }
    v(n);
    System.arraycopy(arrayOfByte, 0, this.i, this.h, n);
    this.h += n;
    u();
    t();
    return this.j.a() - paramArrayOfzgs.length;
  }
  
  public int a(int paramInt, zgs paramzgs)
  {
    if ((paramInt < 0) || (paramInt >= this.j.a())) {
      return a(paramzgs);
    }
    if (this.h < 0) {
      s();
    }
    int n = a(paramzgs, -1, 7);
    int i1 = t(paramInt, n);
    System.arraycopy(this.k, 0, this.i, i1, n);
    return paramInt;
  }
  
  private int t(int paramInt1, int paramInt2)
  {
    int n = this.j.b(paramInt1);
    n += c(paramInt1, n, paramInt2);
    t();
    this.j.b(paramInt1, n);
    return n;
  }
  
  public int a(int paramInt1, zgs[] paramArrayOfzgs, int paramInt2, int paramInt3)
  {
    if (paramInt3 < 1) {
      return paramInt1;
    }
    if ((paramInt1 < 0) || (paramInt1 >= this.j.a())) {
      return a(paramArrayOfzgs, paramInt2, paramInt3);
    }
    if (paramInt3 == 1) {
      return a(paramInt1, paramArrayOfzgs[paramInt2]);
    }
    if (this.h < 0) {
      s();
    }
    byte[] arrayOfByte = new byte[this.k.length * paramInt3];
    int[] arrayOfInt = new int[paramInt3];
    int n = this.j.b(paramInt1);
    int i1 = 0;
    for (int i3 = 0; i3 < paramInt3; i3++)
    {
      arrayOfInt[i3] = (n + i1);
      int i2 = a(paramArrayOfzgs[(i3 + paramInt2)], -1, 7);
      System.arraycopy(this.k, 0, arrayOfByte, i1, i2);
      i1 += i2;
    }
    i3 = c(paramInt1, n, i1);
    if (i3 != 0)
    {
      for (int i4 = 0; i4 < arrayOfInt.length; i4++) {
        arrayOfInt[i4] += i3;
      }
      n += i3;
    }
    this.j.a(paramInt1, arrayOfInt, 0, arrayOfInt.length);
    System.arraycopy(arrayOfByte, 0, this.i, n, i1);
    t();
    return paramInt1;
  }
  
  public int a(int paramInt1, zt paramzt, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramInt3 < 1) {
      return paramInt1;
    }
    if (this.h < 0) {
      s();
    }
    if ((paramzt instanceof zbdw))
    {
      if (paramInt1 < 0) {
        paramInt1 = this.j.a();
      }
      zbdw localzbdw = (zbdw)paramzt;
      if (paramInt2 < 0)
      {
        paramInt2 = 0;
        if (localzbdw.h < 0) {
          localzbdw.s();
        }
      }
      int n = paramInt2 + paramInt3;
      if (n < localzbdw.j.a())
      {
        n = localzbdw.j.b(n) - localzbdw.j.b(paramInt2);
      }
      else
      {
        n = localzbdw.h - localzbdw.j.b(paramInt2);
        paramInt3 = localzbdw.j.a() - paramInt2;
      }
      int[] arrayOfInt1;
      int i2;
      if (paramInt1 < this.j.a())
      {
        arrayOfInt1 = new int[paramInt3];
        int[] arrayOfInt2 = localzbdw.j.d();
        i2 = arrayOfInt2[paramInt2];
        int i3 = this.j.b(paramInt1);
        for (int i4 = 0; i4 < arrayOfInt1.length; i4++) {
          arrayOfInt1[i4] = (arrayOfInt2[(paramInt2 + i4)] - i2 + i3);
        }
        i4 = c(paramInt1, i3, n);
        if (i4 != 0)
        {
          for (int i5 = 0; i5 < arrayOfInt1.length; i5++) {
            arrayOfInt1[i5] += i4;
          }
          i3 += i4;
        }
        this.j.a(paramInt1, arrayOfInt1, 0, arrayOfInt1.length);
        System.arraycopy(localzbdw.i, i2, this.i, i3, n);
      }
      else
      {
        v(n);
        arrayOfInt1 = localzbdw.j.d();
        int i1 = arrayOfInt1[paramInt2];
        this.j.c(paramInt3);
        for (i2 = 0; i2 < paramInt3; i2++) {
          this.j.a(arrayOfInt1[(paramInt2 + i2)] - i1 + this.h);
        }
        System.arraycopy(localzbdw.i, i1, this.i, this.h, n);
        this.h += n;
        u();
      }
      t();
      return paramInt1;
    }
    return super.a(paramInt1, paramzt, paramInt2, paramInt3, paramBoolean);
  }
  
  public int a(int paramInt)
  {
    int n = paramInt;
    if (this.h < 0) {
      s();
    }
    n = this.j.b(n);
    if ((this.i[n] & 0xFF & 0x4) == 0)
    {
      int i1 = this.i[(n + 1)] & 0xFF;
      return i1;
    }
    return (this.i[(n + 1)] & 0xFF) << 8 | this.i[(n + 2)] & 0xFF;
  }
  
  public int g(int paramInt)
  {
    int n = paramInt;
    if (this.h < 0) {
      s();
    }
    n = this.j.b(n);
    int i1 = this.i[n];
    int i2 = m(n + ((i1 & 0xFF & 0x4) == 0 ? 2 : 3), i1 & 0xFF & 0x3);
    if (i2 < 0) {
      return -1;
    }
    return i2 + 15;
  }
  
  public void j(int paramInt1, int paramInt2)
  {
    if (this.h < 0) {
      s();
    }
    int n = this.j.b(paramInt1);
    int i1 = this.i[n];
    int i2 = i1 & 0xFF & 0x3;
    paramInt2 -= 15;
    if (paramInt2 < 0)
    {
      if (i2 > 0)
      {
        int tmp55_54 = n;
        byte[] tmp55_51 = this.i;
        tmp55_51[tmp55_54] = ((byte)(tmp55_51[tmp55_54] & 0xFC));
        c(paramInt1 + 1, n + ((i1 & 0xFF & 0x4) == 0 ? 2 : 3) + i2, -i2);
        t();
      }
      return;
    }
    int i3 = u(paramInt2);
    if (i2 != i3)
    {
      int tmp118_117 = n;
      byte[] tmp118_114 = this.i;
      tmp118_114[tmp118_117] = ((byte)(tmp118_114[tmp118_117] & 0xFC));
      int tmp131_130 = n;
      byte[] tmp131_127 = this.i;
      tmp131_127[tmp131_130] = ((byte)(tmp131_127[tmp131_130] | (byte)i3));
      n += c(paramInt1 + 1, n + ((i1 & 0xFF & 0x4) == 0 ? 2 : 3) + i2, i3 - i2);
      t();
    }
    b(n + ((i1 & 0xFF & 0x4) == 0 ? 2 : 3), paramInt2, i3);
  }
  
  public int h(int paramInt)
  {
    if (this.h < 0) {
      s();
    }
    switch (this.i[this.j.b(paramInt)] & 0xFF & 0xF8)
    {
    case 72: 
    case 88: 
      return 2;
    case 32: 
      return 1;
    case 8: 
    case 24: 
    case 40: 
    case 48: 
    case 56: 
      return 6;
    case 64: 
    case 80: 
    case 96: 
    case 112: 
    case 128: 
    case 144: 
    case 160: 
    case 176: 
      return 4;
    case 192: 
    case 208: 
    case 224: 
    case 240: 
      return 5;
    case 104: 
    case 120: 
    case 136: 
    case 152: 
    case 168: 
    case 184: 
    case 200: 
    case 216: 
    case 232: 
      return 3;
    }
    return 0;
  }
  
  public Object i(int paramInt)
  {
    int n = paramInt;
    if (this.h < 0) {
      s();
    }
    n = this.j.b(n);
    switch (this.i[n] & 0xFF & 0xF8)
    {
    case 32: 
      return Double.valueOf(zc.f(this.i, s(n)));
    case 40: 
      return Integer.valueOf((this.i[s(n)] & 0xFF) - 256 << 2 | 0x2);
    case 56: 
      n = s(n);
      return Integer.valueOf(((this.i[n] & 0xFF) << 8 | this.i[(n + 1)] & 0xFF) - 65536 << 2 | 0x2);
    case 8: 
      return Integer.valueOf((this.i[s(n)] & 0xFF) << 2 | 0x2);
    case 24: 
      n = s(n);
      return Integer.valueOf(((this.i[n] & 0xFF) << 8 | this.i[(n + 1)] & 0xFF) << 2 | 0x2);
    case 48: 
      return Integer.valueOf(zc.a(this.i, s(n)));
    case 64: 
    case 128: 
      return this.a.a(this.i[s(n)] & 0xFF);
    case 80: 
    case 144: 
      n = s(n);
      return this.a.a((this.i[n] & 0xFF) << 8 | this.i[(n + 1)] & 0xFF);
    case 96: 
    case 160: 
      n = s(n);
      return this.a.a((this.i[n] & 0xFF) << 16 | (this.i[(n + 1)] & 0xFF) << 8 | this.i[(n + 2)] & 0xFF);
    case 112: 
    case 176: 
      n = s(n);
      return this.a.a((this.i[n] & 0xFF) << 24 | (this.i[(n + 1)] & 0xFF) << 16 | (this.i[(n + 2)] & 0xFF) << 8 | this.i[(n + 3)] & 0xFF);
    case 192: 
      return this.b.b[(this.i[s(n)] & 0xFF)];
    case 208: 
      n = s(n);
      return this.b.b[((this.i[n] & 0xFF) << 8 | this.i[(n + 1)] & 0xFF)];
    case 224: 
      n = s(n);
      return this.b.b[((this.i[n] & 0xFF) << 16 | (this.i[(n + 1)] & 0xFF) << 8 | this.i[(n + 2)] & 0xFF)];
    case 240: 
      n = s(n);
      return this.b.b[((this.i[n] & 0xFF) << 24 | (this.i[(n + 1)] & 0xFF) << 16 | (this.i[(n + 2)] & 0xFF) << 8 | this.i[(n + 3)] & 0xFF)];
    case 88: 
      return znq.e;
    case 72: 
      return znq.d;
    case 104: 
      return Byte.valueOf((byte)7);
    case 232: 
      return Byte.valueOf((byte)-1);
    case 200: 
      return Byte.valueOf((byte)42);
    case 168: 
      return Byte.valueOf((byte)29);
    case 120: 
      return Byte.valueOf((byte)0);
    case 184: 
      return Byte.valueOf((byte)36);
    case 216: 
      return Byte.valueOf((byte)-2);
    case 152: 
      return Byte.valueOf((byte)23);
    case 136: 
      return Byte.valueOf((byte)15);
    }
    return Integer.valueOf(0);
  }
  
  private int u(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      if (paramInt1 > 65279)
      {
        int tmp16_15 = 0;
        byte[] tmp16_12 = this.k;
        tmp16_12[tmp16_15] = ((byte)(tmp16_12[tmp16_15] | 0x28));
        this.k[paramInt2] = ((byte)(paramInt1 + 256));
        return 1;
      }
      if (paramInt1 > -65536)
      {
        int tmp48_47 = 0;
        byte[] tmp48_44 = this.k;
        tmp48_44[tmp48_47] = ((byte)(tmp48_44[tmp48_47] | 0x38));
        q(paramInt2, paramInt1 + 65536);
        return 2;
      }
    }
    else
    {
      if (paramInt1 <= 255)
      {
        int tmp78_77 = 0;
        byte[] tmp78_74 = this.k;
        tmp78_74[tmp78_77] = ((byte)(tmp78_74[tmp78_77] | 0x8));
        this.k[paramInt2] = ((byte)paramInt1);
        return 1;
      }
      if (paramInt1 <= 65535)
      {
        int tmp106_105 = 0;
        byte[] tmp106_102 = this.k;
        tmp106_102[tmp106_105] = ((byte)(tmp106_102[tmp106_105] | 0x18));
        q(paramInt2, paramInt1);
        return 2;
      }
    }
    return -1;
  }
  
  public void b(int paramInt, zgs paramzgs)
  {
    if (this.h < 0) {
      s();
    }
    int n = this.j.b(paramInt);
    int i1 = s(n);
    this.k[0] = ((byte)(this.i[n] & 0xFF & 0x7));
    int i2 = a(paramzgs, 1);
    if (this.i[n] != this.k[0])
    {
      int i3 = t(this.i[n] & 0xFF & 0xF8);
      if (i3 != i2)
      {
        int i4 = c(paramInt + 1, i1 + i3, i2 - i3);
        t();
        if (i4 != 0)
        {
          n += i4;
          i1 += i4;
        }
      }
      this.i[n] = this.k[0];
    }
    if (i2 > 0) {
      System.arraycopy(this.k, 1, this.i, i1, i2);
    }
  }
  
  public int j(int paramInt)
  {
    if (this.h < 0) {
      s();
    }
    paramInt = this.j.b(paramInt);
    switch (this.i[paramInt] & 0xFF & 0xF8)
    {
    case 64: 
    case 128: 
    case 192: 
      int n = this.i[s(paramInt)] & 0xFF;
      return n;
    case 80: 
    case 144: 
    case 208: 
      paramInt = s(paramInt);
      return (this.i[paramInt] & 0xFF) << 8 | this.i[(paramInt + 1)] & 0xFF;
    case 96: 
    case 160: 
    case 224: 
      paramInt = s(paramInt);
      return (this.i[paramInt] & 0xFF) << 16 | (this.i[(paramInt + 1)] & 0xFF) << 8 | this.i[(paramInt + 2)] & 0xFF;
    case 112: 
    case 176: 
    case 240: 
      paramInt = s(paramInt);
      return (this.i[paramInt] & 0xFF) << 24 | (this.i[(paramInt + 1)] & 0xFF) << 16 | (this.i[(paramInt + 2)] & 0xFF) << 8 | this.i[(paramInt + 3)] & 0xFF;
    }
    return -1;
  }
  
  public void k(int paramInt1, int paramInt2)
  {
    if (this.h < 0) {
      s();
    }
    int n = this.j.b(paramInt1);
    int i1;
    int i2;
    int i3;
    switch (this.i[n] & 0xFF & 0xF8)
    {
    case 64: 
    case 128: 
    case 192: 
      i1 = u(paramInt2);
      i2 = s(n);
      if (i1 != 1)
      {
        i3 = c(paramInt1 + 1, i2 + 1, i1 - 1);
        t();
        if (i3 != 0)
        {
          n += i3;
          i2 += i3;
        }
        this.i[n] = ((byte)((this.i[n] & 0xFF) + (i1 - 1 << 4)));
        b(i2, paramInt2, i1);
      }
      else
      {
        this.i[i2] = ((byte)paramInt2);
      }
      return;
    case 80: 
    case 144: 
    case 208: 
      i1 = u(paramInt2);
      i2 = s(n);
      if (i1 != 2)
      {
        i3 = c(paramInt1 + 1, i2 + 2, i1 - 2);
        t();
        if (i3 != 0)
        {
          n += i3;
          i2 += i3;
        }
        this.i[n] = ((byte)((this.i[n] & 0xFF) + (i1 - 2 << 4)));
        b(i2, paramInt2, i1);
      }
      else
      {
        n(i2, paramInt2);
      }
      return;
    case 96: 
    case 160: 
    case 224: 
      i1 = u(paramInt2);
      i2 = s(n);
      if (i1 != 3)
      {
        i3 = c(paramInt1 + 1, i2 + 3, i1 - 3);
        t();
        if (i3 != 0)
        {
          n += i3;
          i2 += i3;
        }
        this.i[n] = ((byte)((this.i[n] & 0xFF) + (i1 - 3 << 4)));
        b(i2, paramInt2, i1);
      }
      else
      {
        o(i2, paramInt2);
      }
      return;
    case 112: 
    case 176: 
    case 240: 
      i1 = u(paramInt2);
      i2 = s(n);
      if (i1 != 4)
      {
        i3 = c(paramInt1 + 1, i2 + 4, i1 - 4);
        t();
        if (i3 != 0)
        {
          n += i3;
          i2 += i3;
        }
        this.i[n] = ((byte)((this.i[n] & 0xFF) + (i1 - 4 << 4)));
        b(i2, paramInt2, i1);
      }
      else
      {
        p(i2, paramInt2);
      }
      return;
    }
  }
  
  public zgs c(int paramInt, zgs paramzgs)
  {
    if (this.h < 0) {
      s();
    }
    paramzgs.e = false;
    paramInt = this.j.b(paramInt);
    switch (this.i[paramInt] & 0xFF & 0xF8)
    {
    case 32: 
      paramzgs.c = 1;
      paramzgs.d = Double.valueOf(zc.f(this.i, s(paramInt)));
      break;
    case 48: 
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf(zc.a(this.i, s(paramInt)));
      break;
    case 40: 
      zayi.a((this.i[s(paramInt)] & 0xFF) - 256, paramzgs);
      break;
    case 56: 
      paramInt = s(paramInt);
      zayi.a(((this.i[paramInt] & 0xFF) << 8 | this.i[(paramInt + 1)] & 0xFF) - 65536, paramzgs);
      break;
    case 8: 
      zayi.a(this.i[s(paramInt)] & 0xFF & 0xFF, paramzgs);
      break;
    case 24: 
      paramInt = s(paramInt);
      zayi.a((this.i[paramInt] & 0xFF) << 8 | this.i[(paramInt + 1)] & 0xFF, paramzgs);
      break;
    case 64: 
      paramzgs.e = false;
      paramzgs.c = 4;
      paramzgs.d = this.a.a(this.i[s(paramInt)] & 0xFF);
      break;
    case 80: 
      paramzgs.e = false;
      paramzgs.c = 4;
      paramInt = s(paramInt);
      paramzgs.d = this.a.a((this.i[paramInt] & 0xFF) << 8 | this.i[(paramInt + 1)] & 0xFF);
      break;
    case 96: 
      paramzgs.e = false;
      paramzgs.c = 4;
      paramInt = s(paramInt);
      paramzgs.d = this.a.a((this.i[paramInt] & 0xFF) << 16 | (this.i[(paramInt + 1)] & 0xFF) << 8 | this.i[(paramInt + 2)] & 0xFF);
      break;
    case 112: 
      paramzgs.e = false;
      paramzgs.c = 4;
      paramInt = s(paramInt);
      paramzgs.d = this.a.a((this.i[paramInt] & 0xFF) << 24 | (this.i[(paramInt + 1)] & 0xFF) << 16 | (this.i[(paramInt + 2)] & 0xFF) << 8 | this.i[(paramInt + 3)] & 0xFF);
      break;
    case 128: 
      paramzgs.e = true;
      paramzgs.c = 4;
      paramzgs.d = this.a.a(this.i[s(paramInt)] & 0xFF);
      break;
    case 144: 
      paramzgs.e = true;
      paramzgs.c = 4;
      paramInt = s(paramInt);
      paramzgs.d = this.a.a((this.i[paramInt] & 0xFF) << 8 | this.i[(paramInt + 1)] & 0xFF);
      break;
    case 160: 
      paramzgs.e = true;
      paramzgs.c = 4;
      paramInt = s(paramInt);
      paramzgs.d = this.a.a((this.i[paramInt] & 0xFF) << 16 | (this.i[(paramInt + 1)] & 0xFF) << 8 | this.i[(paramInt + 2)] & 0xFF);
      break;
    case 176: 
      paramzgs.e = true;
      paramzgs.c = 4;
      paramInt = s(paramInt);
      paramzgs.d = this.a.a((this.i[paramInt] & 0xFF) << 24 | (this.i[(paramInt + 1)] & 0xFF) << 16 | (this.i[(paramInt + 2)] & 0xFF) << 8 | this.i[(paramInt + 3)] & 0xFF);
      break;
    case 192: 
      paramzgs.c = 5;
      paramzgs.d = this.b.b[(this.i[s(paramInt)] & 0xFF)];
      break;
    case 208: 
      paramzgs.c = 5;
      paramInt = s(paramInt);
      paramzgs.d = this.b.b[((this.i[paramInt] & 0xFF) << 8 | this.i[(paramInt + 1)] & 0xFF)];
      break;
    case 224: 
      paramzgs.c = 5;
      paramInt = s(paramInt);
      paramzgs.d = this.b.b[((this.i[paramInt] & 0xFF) << 16 | (this.i[(paramInt + 1)] & 0xFF) << 8 | this.i[(paramInt + 2)] & 0xFF)];
      break;
    case 240: 
      paramzgs.c = 5;
      paramInt = s(paramInt);
      paramzgs.d = this.b.b[((this.i[paramInt] & 0xFF) << 24 | (this.i[(paramInt + 1)] & 0xFF) << 16 | (this.i[(paramInt + 2)] & 0xFF) << 8 | this.i[(paramInt + 3)] & 0xFF)];
      break;
    case 88: 
      paramzgs.c = 2;
      paramzgs.d = znq.e;
      break;
    case 72: 
      paramzgs.c = 2;
      paramzgs.d = znq.d;
      break;
    case 104: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)7);
      break;
    case 232: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)-1);
      break;
    case 200: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)42);
      break;
    case 168: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)29);
      break;
    case 120: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)0);
      break;
    case 184: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)36);
      break;
    case 216: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)-2);
      break;
    case 152: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)23);
      break;
    case 136: 
      paramzgs.c = 3;
      paramzgs.d = zi.a((byte)15);
      break;
    default: 
      paramzgs.c = 0;
      paramzgs.d = null;
    }
    return paramzgs;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean f()
  {
    return false;
  }
  
  public zgs a(int paramInt1, zgs paramzgs, int paramInt2)
  {
    if ((paramInt2 & 0x4) != 0) {
      c(paramInt1, paramzgs);
    }
    paramInt1 = this.j.b(paramInt1);
    int n = this.i[paramInt1];
    if ((n & 0xFF & 0x4) == 0)
    {
      if ((paramInt2 & 0x1) != 0) {
        paramzgs.a = ((short)(this.i[(paramInt1 + 1)] & 0xFF));
      }
      if ((paramInt2 & 0x2) != 0)
      {
        paramzgs.b = m(paramInt1 + 2, n & 0xFF & 0x3);
        paramzgs.b = (paramzgs.b < 0 ? -1 : paramzgs.b + 15);
      }
    }
    else
    {
      if ((paramInt2 & 0x1) != 0) {
        paramzgs.a = ((short)((this.i[(paramInt1 + 1)] & 0xFF) << 8 | this.i[(paramInt1 + 2)] & 0xFF));
      }
      if ((paramInt2 & 0x2) != 0)
      {
        paramzgs.b = m(paramInt1 + 3, n & 0xFF & 0x3);
        paramzgs.b = (paramzgs.b < 0 ? -1 : paramzgs.b + 15);
      }
    }
    return paramzgs;
  }
  
  public void b(int paramInt1, zgs paramzgs, int paramInt2)
  {
    if (this.h < 0) {
      s();
    }
    switch (paramInt2)
    {
    case 1: 
      throw new CellsException(7, "Column index should not be changed when setting properties");
    case 4: 
      b(paramInt1, paramzgs);
      return;
    case 2: 
      j(paramInt1, paramzgs.b);
      return;
    }
    int n = this.j.b(paramInt1);
    int i1;
    int i2;
    if ((paramInt2 & 0x4) == 0)
    {
      i1 = this.i[n];
      i2 = ((i1 & 0xFF & 0x4) == 0 ? 2 : 3) + (i1 & 0xFF & 0x3);
      int i3 = b(paramzgs, paramInt1, paramInt2);
      if (i3 != i2)
      {
        n += c(paramInt1 + 1, n + i2, i3 - i2);
        t();
      }
      i1 = (byte)(this.k[0] & 0xFF | i1 & 0xFF & 0xF8);
      this.i[n] = i1;
      System.arraycopy(this.k, 1, this.i, n + 1, i3 - 1);
    }
    else
    {
      i1 = a(paramzgs, paramInt1, paramInt2);
      i2 = (paramInt1 < this.j.a() - 1 ? this.j.b(paramInt1 + 1) : this.h) - n;
      if (i1 != i2)
      {
        n += c(paramInt1 + 1, n + i2, i1 - i2);
        t();
      }
      System.arraycopy(this.k, 0, this.i, n, i1);
    }
  }
  
  public int i()
  {
    return this.d;
  }
  
  public int j()
  {
    int n = this.i[(this.f + 4)];
    int i1 = (n & 0xFF & 0x18) >> 3;
    if (i1 > 0) {
      return m(this.f + 5 + (n & 0xFF & 0x3) + ((n & 0xFF & 0x4) == 0 ? 2 : 3), i1) + 16;
    }
    return 15;
  }
  
  public void k(int paramInt)
  {
    paramInt -= 16;
    int n = paramInt < 0 ? 0 : u(paramInt);
    int i1 = this.i[(this.f + 4)];
    int i2 = (i1 & 0xFF & 0x18) >> 3;
    int i3 = this.f + 5 + (i1 & 0xFF & 0x3) + ((i1 & 0xFF & 0x4) == 0 ? 2 : 3);
    if (n != i2)
    {
      if (this.h < 0) {
        s();
      }
      i3 += c(0, i3 + i2, n - i2);
      t();
      b(i3, paramInt, n);
      i3 = this.f + 4;
      int tmp134_132 = i3;
      byte[] tmp134_129 = this.i;
      tmp134_129[tmp134_132] = ((byte)(tmp134_129[tmp134_132] & 0xE7));
      int tmp148_146 = i3;
      byte[] tmp148_143 = this.i;
      tmp148_143[tmp148_146] = ((byte)(tmp148_143[tmp148_146] | (byte)(n << 3)));
    }
    else
    {
      b(i3, paramInt, n);
    }
  }
  
  public int k()
  {
    int n = this.i[(this.f + 4)];
    return m(this.f + 5 + (n & 0xFF & 0x3) + 1, (n & 0xFF & 0x4) == 0 ? 1 : 2);
  }
  
  public void m(int paramInt)
  {
    int n = this.i[(this.f + 4)];
    int i1 = ((n & 0xFF & 0x4) >> 2) + 1;
    int i2 = this.f + 5 + (n & 0xFF & 0x3) + 1;
    if ((n & 0xFF & 0x4) != 0)
    {
      if (paramInt > 255)
      {
        n(i2, paramInt);
      }
      else
      {
        if (this.h < 0) {
          s();
        }
        int tmp90_89 = (this.f + 4);
        byte[] tmp90_81 = this.i;
        tmp90_81[tmp90_89] = ((byte)(tmp90_81[tmp90_89] & 0xFB));
        i2 += c(0, i2 + 2, -1);
        t();
        this.i[i2] = ((byte)paramInt);
      }
    }
    else if (paramInt > 255)
    {
      if (this.h < 0) {
        s();
      }
      int tmp157_156 = (this.f + 4);
      byte[] tmp157_148 = this.i;
      tmp157_148[tmp157_156] = ((byte)(tmp157_148[tmp157_156] | 0x4));
      i2 += c(0, i2 + 1, 1);
      t();
      n(i2, paramInt);
    }
    else
    {
      this.i[i2] = ((byte)paramInt);
    }
  }
  
  public byte l(int paramInt)
  {
    return this.i[(this.f + 0 + paramInt)];
  }
  
  public void a(int paramInt, byte paramByte)
  {
    this.i[(this.f + 0 + paramInt)] = paramByte;
  }
  
  public zbdx a(zbdx paramzbdx, int paramInt)
  {
    a(this.i, this.f, paramzbdx, paramInt);
    return paramzbdx;
  }
  
  public void b(zbdx paramzbdx, int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      this.i[(this.f + 0)] = paramzbdx.b;
      this.i[(this.f + 0 + 1)] = paramzbdx.c;
      return;
    case 2: 
      throw new CellsException(7, "Row index should not be changed when setting properties");
    case 4: 
      m(paramzbdx.e);
      return;
    case 8: 
      k(paramzbdx.d);
      return;
    }
    if ((paramInt & 0x1) != 0)
    {
      this.i[(this.f + 0)] = paramzbdx.b;
      this.i[(this.f + 0 + 1)] = paramzbdx.c;
    }
    if (paramInt < 4) {
      return;
    }
    int n = this.i[(this.f + 4)];
    int i1 = this.f + 5 + (n & 0xFF & 0x3) + 1;
    int i2 = i1;
    int i3 = 0;
    if ((paramInt & 0x4) != 0)
    {
      if (paramzbdx.e > 255)
      {
        q(i3, paramzbdx.e);
        i3 += 2;
        if ((n & 0xFF & 0x4) == 0)
        {
          n = (byte)(n | 0x4);
          i2++;
        }
        else
        {
          i2 += 2;
        }
      }
      else
      {
        this.k[i3] = ((byte)paramzbdx.e);
        i3++;
        if ((n & 0xFF & 0x4) != 0)
        {
          n = (byte)(n & 0xFB);
          i2 += 2;
        }
        else
        {
          i2++;
        }
      }
    }
    else
    {
      this.k[(i3++)] = this.i[(i2++)];
      if ((n & 0xFF & 0x4) != 0) {
        this.k[(i3++)] = this.i[(i2++)];
      }
    }
    if ((paramInt & 0x8) != 0)
    {
      if (paramzbdx.d > 15)
      {
        int i4 = paramzbdx.d - 16;
        if (i4 <= 255)
        {
          this.k[i3] = ((byte)i4);
          i3++;
          switch (n & 0xFF & 0x18)
          {
          case 0: 
            n = (byte)(n | 0x8);
            break;
          case 8: 
            i2++;
            break;
          case 16: 
            n = (byte)(n & 0xE7);
            n = (byte)(n | 0x8);
            i2 += 2;
            break;
          case 24: 
            n = (byte)(n & 0xEF);
            i2 += 3;
          }
        }
        else if (i4 <= 65535)
        {
          q(i3, i4);
          i3 += 2;
          switch (n & 0xFF & 0x18)
          {
          case 0: 
            n = (byte)(n | 0x10);
            break;
          case 8: 
            n = (byte)(n & 0xE7);
            n = (byte)(n | 0x10);
            i2++;
            break;
          case 16: 
            i2 += 2;
            break;
          case 24: 
            n = (byte)(n & 0xF7);
            i2 += 3;
          }
        }
        else
        {
          r(i3, i4);
          i3 += 3;
          switch (n & 0xFF & 0x18)
          {
          case 0: 
            n = (byte)(n | 0x18);
            break;
          case 8: 
            n = (byte)(n | 0x10);
            i2++;
            break;
          case 16: 
            n = (byte)(n | 0x8);
            i2 += 2;
            break;
          case 3: 
            i2 += 3;
          }
        }
      }
      else
      {
        i2 += ((n & 0xFF & 0x18) >> 3);
        n = (byte)(n & 0xE7);
      }
    }
    else {
      switch (n & 0xFF & 0x18)
      {
      case 8: 
        this.k[(i3++)] = this.i[(i2++)];
        break;
      case 16: 
        this.k[(i3++)] = this.i[(i2++)];
        this.k[(i3++)] = this.i[(i2++)];
        break;
      case 24: 
        this.k[(i3++)] = this.i[(i2++)];
        this.k[(i3++)] = this.i[(i2++)];
        this.k[(i3++)] = this.i[(i2++)];
      }
    }
    if (i3 != i2 - i1)
    {
      if (this.h < 0) {
        s();
      }
      i1 += c(0, i2, i3 - (i2 - i1));
      t();
    }
    this.i[(this.f + 4)] = n;
    System.arraycopy(this.k, 0, this.i, i1, i3);
  }
  
  static int n(int paramInt)
  {
    return 10 + u(paramInt);
  }
  
  static int o(int paramInt)
  {
    return 7 + u(paramInt);
  }
  
  static int p(int paramInt)
  {
    return paramInt * 2;
  }
  
  static int q(int paramInt)
  {
    return paramInt * 7;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt)
  {
    switch (paramArrayOfByte[(paramInt + 4)] & 0xFF & 0x3)
    {
    case 0: 
      int n = paramArrayOfByte[(paramInt + 5)] & 0xFF;
      return n;
    case 1: 
      paramInt += 5;
      return (paramArrayOfByte[paramInt] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 1)] & 0xFF;
    case 2: 
      paramInt += 5;
      return (paramArrayOfByte[paramInt] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 2)] & 0xFF;
    case 3: 
      paramInt += 5;
      return (paramArrayOfByte[paramInt] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 3)] & 0xFF;
    }
    return -1;
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    if ((paramInt2 & 0x1) != 0)
    {
      paramzbdx.b = paramArrayOfByte[(paramInt1 + 0)];
      paramzbdx.c = paramArrayOfByte[(paramInt1 + 0 + 1)];
    }
    if (paramInt2 < 2) {
      return;
    }
    int n = paramArrayOfByte[(paramInt1 + 4)];
    paramInt1 += 5;
    int i1 = (n & 0xFF & 0x3) + 1;
    if ((paramInt2 & 0x2) != 0) {
      paramzbdx.a = h(paramArrayOfByte, paramInt1, i1);
    }
    if (paramInt2 < 4) {
      return;
    }
    paramInt1 += i1;
    i1 = (n & 0xFF & 0x4) == 0 ? 1 : 2;
    if ((paramInt2 & 0x4) != 0) {
      paramzbdx.e = ((short)h(paramArrayOfByte, paramInt1, i1));
    }
    if (paramInt2 < 8) {
      return;
    }
    paramInt1 += i1;
    i1 = (n & 0xFF & 0x18) >> 3;
    if (i1 > 0) {
      paramzbdx.d = (h(paramArrayOfByte, paramInt1, i1) + 16);
    } else {
      paramzbdx.d = 15;
    }
  }
  
  static byte a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return paramArrayOfByte[(paramInt1 + 0 + paramInt2)];
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
  {
    paramArrayOfByte[(paramInt1 + 0 + paramInt2)] = paramByte;
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt)
  {
    int n = paramArrayOfByte[(paramInt + 4)];
    return h(paramArrayOfByte, paramInt + 5 + (n & 0xFF & 0x3) + 1, (n & 0xFF & 0x4) == 0 ? 1 : 2);
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zbdx paramzbdx)
  {
    paramArrayOfByte[(paramInt1 + 0)] = paramzbdx.b;
    paramArrayOfByte[(paramInt1 + 0 + 1)] = paramzbdx.c;
    int n = 0;
    int i1 = paramInt1 + 5;
    if (paramzbdx.a > 16777215)
    {
      n = 3;
      g(paramArrayOfByte, i1, paramzbdx.a);
      i1 += 4;
    }
    else if (paramzbdx.a > 65535)
    {
      n = 2;
      f(paramArrayOfByte, i1, paramzbdx.a);
      i1 += 3;
    }
    else if (paramzbdx.a > 255)
    {
      n = 1;
      e(paramArrayOfByte, i1, paramzbdx.a);
      i1 += 2;
    }
    else
    {
      paramArrayOfByte[i1] = ((byte)paramzbdx.a);
      i1++;
    }
    if (paramzbdx.e > 255)
    {
      n = (byte)(n | 0x4);
      e(paramArrayOfByte, i1, paramzbdx.e);
      i1 += 2;
    }
    else
    {
      paramArrayOfByte[i1] = ((byte)paramzbdx.e);
      i1++;
    }
    if (paramzbdx.d > 15)
    {
      int i2 = paramzbdx.d - 16;
      if (i2 <= 255)
      {
        n = (byte)(n | 0x8);
        paramArrayOfByte[i1] = ((byte)i2);
        i1++;
      }
      else if (i2 <= 65535)
      {
        n = (byte)(n | 0x10);
        e(paramArrayOfByte, i1, i2);
        i1 += 2;
      }
      else
      {
        n = (byte)(n | 0x18);
        f(paramArrayOfByte, i1, i2);
        i1 += 3;
      }
    }
    paramArrayOfByte[(paramInt1 + 4)] = n;
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(i1 - paramInt1 - 7));
    if (i1 < paramInt2) {
      paramArrayOfByte[i1] = 0;
    }
    return i1;
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int n;
    switch (paramArrayOfByte[(paramInt1 + 4)] & 0xFF & 0x3)
    {
    case 0: 
      n = (paramArrayOfByte[(paramInt1 + 5)] & 0xFF) + paramInt2;
      if (n <= 255)
      {
        paramArrayOfByte[(paramInt1 + 5)] = ((byte)n);
        return 0;
      }
      paramInt2 = 1;
      break;
    case 1: 
      paramInt1 += 5;
      n = ((paramArrayOfByte[paramInt1] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 1)] & 0xFF) + paramInt2;
      if ((n > 255) && (n <= 65535))
      {
        e(paramArrayOfByte, paramInt1, n);
        return 0;
      }
      paramInt2 = 2;
      break;
    case 2: 
      paramInt1 += 5;
      n = ((paramArrayOfByte[paramInt1] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 2)] & 0xFF) + paramInt2;
      if ((n > 65535) && (n <= 16777215))
      {
        f(paramArrayOfByte, paramInt1, n);
        return 0;
      }
      paramInt2 = 3;
      break;
    default: 
      paramInt1 += 5;
      n = ((paramArrayOfByte[paramInt1] & 0xFF) << 24 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 3)] & 0xFF) + paramInt2;
      if (n > 16777215)
      {
        g(paramArrayOfByte, paramInt1, n);
        return 0;
      }
      paramInt2 = 4;
    }
    return u(n) - paramInt2;
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)Math.min(255, (paramArrayOfByte[(paramInt1 + 3)] & 0xFF) + paramInt5));
    int n = paramArrayOfByte[(paramInt1 + 4)] & 0xFF;
    int tmp39_38 = (paramInt1 + 4);
    paramArrayOfByte[tmp39_38] = ((byte)(paramArrayOfByte[tmp39_38] & 0xFC));
    paramInt1 += 5;
    switch (n & 0x3)
    {
    case 0: 
      n = (paramArrayOfByte[paramInt1] & 0xFF) + paramInt4;
      paramInt4 = 1;
      break;
    case 1: 
      n = ((paramArrayOfByte[paramInt1] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 1)] & 0xFF) + paramInt4;
      paramInt4 = 2;
      break;
    case 2: 
      n = ((paramArrayOfByte[paramInt1] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 2)] & 0xFF) + paramInt4;
      paramInt4 = 3;
      break;
    default: 
      n = ((paramArrayOfByte[paramInt1] & 0xFF) << 24 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 3)] & 0xFF) + paramInt4;
      paramInt4 = 4;
    }
    paramInt1 += paramInt4;
    System.arraycopy(paramArrayOfByte, paramInt1, paramArrayOfByte, paramInt1 + paramInt5, paramInt2 - paramInt1);
    paramInt2 += paramInt5;
    if (paramInt2 < paramInt3) {
      paramArrayOfByte[paramInt2] = 0;
    }
    paramInt1 -= paramInt4;
    switch (paramInt4 + paramInt5)
    {
    case 1: 
      paramArrayOfByte[paramInt1] = ((byte)n);
      break;
    case 2: 
      int tmp315_314 = (paramInt1 - 5 + 4);
      paramArrayOfByte[tmp315_314] = ((byte)(paramArrayOfByte[tmp315_314] | 0x1));
      e(paramArrayOfByte, paramInt1, n);
      break;
    case 3: 
      int tmp337_336 = (paramInt1 - 5 + 4);
      paramArrayOfByte[tmp337_336] = ((byte)(paramArrayOfByte[tmp337_336] | 0x2));
      f(paramArrayOfByte, paramInt1, n);
      break;
    case 4: 
      int tmp359_358 = (paramInt1 - 5 + 4);
      paramArrayOfByte[tmp359_358] = ((byte)(paramArrayOfByte[tmp359_358] | 0x3));
      g(paramArrayOfByte, paramInt1, n);
    }
  }
  
  static void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      paramArrayOfByte[paramInt1] = 0;
    }
  }
  
  static int d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte[(paramInt1 + 3)] & 0xFF) != 255) {
      return paramInt1 + 7 + (paramArrayOfByte[(paramInt1 + 3)] & 0xFF);
    }
    int n = paramArrayOfByte[(paramInt1 + 4)];
    int i1 = paramInt1 + 5 + (n & 0xFF & 0x3) + ((n & 0xFF & 0x4) == 0 ? 2 : 3) + ((n & 0xFF & 0x18) >> 3);
    while (i1 < paramInt2)
    {
      if (paramArrayOfByte[i1] == 0) {
        return i1;
      }
      n = paramArrayOfByte[i1];
      i1 += (n & 0xFF & 0x3) + ((n & 0xFF & 0x4) == 0 ? 2 : 3) + t(n & 0xFF & 0xF8);
    }
    return i1;
  }
  
  private static void e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private static void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 8 & 0xFF));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private static void g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 24));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 16 & 0xFF));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 >> 8 & 0xFF));
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(paramInt2 & 0xFF));
  }
  
  private static int h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 1: 
      int n = paramArrayOfByte[paramInt1] & 0xFF;
      return n;
    case 2: 
      return (paramArrayOfByte[paramInt1] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 1)] & 0xFF;
    case 3: 
      return (paramArrayOfByte[paramInt1] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 2)] & 0xFF;
    case 4: 
      return (paramArrayOfByte[paramInt1] & 0xFF) << 24 | (paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt1 + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt1 + 3)] & 0xFF;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */