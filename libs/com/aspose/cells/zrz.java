package com.aspose.cells;

final class zrz
{
  private static final za[] af = new za[10];
  private static final String[] ag = { "need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", "" };
  zckc a;
  int b;
  byte[] c;
  int d;
  int e;
  int f;
  int g;
  byte h;
  byte i;
  int j;
  int k;
  int l;
  int m;
  byte[] n;
  int o;
  short[] p;
  short[] q;
  int r;
  int s;
  int t;
  int u;
  int v;
  int w;
  int x;
  int y;
  int z;
  int A;
  int B;
  int C;
  int D;
  int E;
  int F;
  int G;
  int H;
  int I;
  int J;
  short[] K = new short['Ѻ'];
  short[] L = new short[122];
  short[] M = new short[78];
  zbxb N = new zbxb();
  zbxb O = new zbxb();
  zbxb P = new zbxb();
  short[] Q = new short[16];
  int[] R = new int['Ƚ'];
  int S;
  int T;
  byte[] U = new byte['Ƚ'];
  int V;
  int W;
  int X;
  int Y;
  int Z;
  int aa;
  int ab;
  int ac;
  short ad;
  int ae;
  
  void a()
  {
    this.o = (2 * this.k);
    this.q[(this.s - 1)] = 0;
    for (int i1 = 0; i1 < this.s - 1; i1++) {
      this.q[i1] = 0;
    }
    this.F = af[this.G].b;
    this.I = af[this.G].a;
    this.J = af[this.G].c;
    this.E = af[this.G].d;
    this.A = 0;
    this.w = 0;
    this.C = 0;
    this.x = (this.D = 2);
    this.z = 0;
    this.r = 0;
  }
  
  void b()
  {
    this.N.i = this.K;
    this.N.k = zbrj.c;
    this.O.i = this.L;
    this.O.k = zbrj.d;
    this.P.i = this.M;
    this.P.k = zbrj.e;
    this.ad = 0;
    this.ae = 0;
    this.ac = 8;
    c();
  }
  
  void c()
  {
    for (int i1 = 0; i1 < 286; i1++) {
      this.K[(i1 * 2)] = 0;
    }
    for (i1 = 0; i1 < 30; i1++) {
      this.L[(i1 * 2)] = 0;
    }
    for (i1 = 0; i1 < 19; i1++) {
      this.M[(i1 * 2)] = 0;
    }
    this.K['Ȁ'] = 1;
    this.Z = (this.aa = 0);
    this.X = (this.ab = 0);
  }
  
  void a(short[] paramArrayOfShort, int paramInt)
  {
    int i1 = this.R[paramInt];
    int i2 = paramInt << 1;
    while (i2 <= this.S)
    {
      if ((i2 < this.S) && (a(paramArrayOfShort, this.R[(i2 + 1)], this.R[i2], this.U))) {
        i2++;
      }
      if (a(paramArrayOfShort, i1, this.R[i2], this.U)) {
        break;
      }
      this.R[paramInt] = this.R[i2];
      paramInt = i2;
      i2 <<= 1;
    }
    this.R[paramInt] = i1;
  }
  
  static boolean a(short[] paramArrayOfShort, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i1 = paramArrayOfShort[(paramInt1 * 2)];
    int i2 = paramArrayOfShort[(paramInt2 * 2)];
    return (i1 < i2) || ((i1 == i2) && (paramArrayOfByte[paramInt1] <= paramArrayOfByte[paramInt2]));
  }
  
  void b(short[] paramArrayOfShort, int paramInt)
  {
    int i2 = -1;
    int i4 = paramArrayOfShort[1];
    int i5 = 0;
    int i6 = 7;
    int i7 = 4;
    if (i4 == 0)
    {
      i6 = 138;
      i7 = 3;
    }
    paramArrayOfShort[((paramInt + 1) * 2 + 1)] = -1;
    for (int i1 = 0; i1 <= paramInt; i1++)
    {
      int i3 = i4;
      i4 = paramArrayOfShort[((i1 + 1) * 2 + 1)];
      i5++;
      if ((i5 >= i6) || (i3 != i4))
      {
        if (i5 < i7)
        {
          int tmp98_97 = (i3 * 2);
          short[] tmp98_91 = this.M;
          tmp98_91[tmp98_97] = ((short)(tmp98_91[tmp98_97] + i5));
        }
        else if (i3 != 0)
        {
          if (i3 != i2)
          {
            int tmp128_127 = (i3 * 2);
            short[] tmp128_121 = this.M;
            tmp128_121[tmp128_127] = ((short)(tmp128_121[tmp128_127] + 1));
          }
          short[] tmp140_135 = this.M;
          tmp140_135[32] = ((short)(tmp140_135[32] + 1));
        }
        else if (i5 <= 10)
        {
          short[] tmp162_157 = this.M;
          tmp162_157[34] = ((short)(tmp162_157[34] + 1));
        }
        else
        {
          short[] tmp177_172 = this.M;
          tmp177_172[36] = ((short)(tmp177_172[36] + 1));
        }
        i5 = 0;
        i2 = i3;
        if (i4 == 0)
        {
          i6 = 138;
          i7 = 3;
        }
        else if (i3 == i4)
        {
          i6 = 6;
          i7 = 3;
        }
        else
        {
          i6 = 7;
          i7 = 4;
        }
      }
    }
  }
  
  int d()
  {
    b(this.K, this.N.j);
    b(this.L, this.O.j);
    this.P.b(this);
    for (int i1 = 18; (i1 >= 3) && (this.M[(zbxb.d[i1] * 2 + 1)] == 0); i1--) {}
    this.Z += 3 * (i1 + 1) + 5 + 5 + 4;
    return i1;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1 - 257, 5);
    a(paramInt2 - 1, 5);
    a(paramInt3 - 4, 4);
    for (int i1 = 0; i1 < paramInt3; i1++) {
      a(this.M[(zbxb.d[i1] * 2 + 1)], 3);
    }
    c(this.K, paramInt1 - 1);
    c(this.L, paramInt2 - 1);
  }
  
  void c(short[] paramArrayOfShort, int paramInt)
  {
    int i2 = -1;
    int i4 = paramArrayOfShort[1];
    int i5 = 0;
    int i6 = 7;
    int i7 = 4;
    if (i4 == 0)
    {
      i6 = 138;
      i7 = 3;
    }
    for (int i1 = 0; i1 <= paramInt; i1++)
    {
      int i3 = i4;
      i4 = paramArrayOfShort[((i1 + 1) * 2 + 1)];
      i5++;
      if ((i5 >= i6) || (i3 != i4))
      {
        if (i5 < i7)
        {
          do
          {
            a(i3, this.M);
            i5--;
          } while (i5 != 0);
        }
        else if (i3 != 0)
        {
          if (i3 != i2)
          {
            a(i3, this.M);
            i5--;
          }
          a(16, this.M);
          a(i5 - 3, 2);
        }
        else if (i5 <= 10)
        {
          a(17, this.M);
          a(i5 - 3, 3);
        }
        else
        {
          a(18, this.M);
          a(i5 - 11, 7);
        }
        i5 = 0;
        i2 = i3;
        if (i4 == 0)
        {
          i6 = 138;
          i7 = 3;
        }
        else if (i3 == i4)
        {
          i6 = 6;
          i7 = 3;
        }
        else
        {
          i6 = 7;
          i7 = 4;
        }
      }
    }
  }
  
  final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(paramArrayOfByte, paramInt1, this.c, this.f, paramInt2);
    this.f += paramInt2;
  }
  
  final void a(byte paramByte)
  {
    this.c[(this.f++)] = paramByte;
  }
  
  final void a(int paramInt)
  {
    a((byte)paramInt);
    a((byte)(paramInt >>> 8));
  }
  
  final void b(int paramInt)
  {
    a((byte)(paramInt >> 8));
    a((byte)paramInt);
  }
  
  final void a(int paramInt, short[] paramArrayOfShort)
  {
    int i1 = paramInt * 2;
    a(paramArrayOfShort[i1] & 0xFFFF, paramArrayOfShort[(i1 + 1)] & 0xFFFF);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    if (this.ae > 16 - i1)
    {
      int i2 = paramInt1;
      this.ad = ((short)(this.ad | i2 << this.ae & 0xFFFF));
      a(this.ad);
      this.ad = ((short)(i2 >>> 16 - this.ae));
      this.ae += i1 - 16;
    }
    else
    {
      this.ad = ((short)(this.ad | paramInt1 << this.ae & 0xFFFF));
      this.ae += i1;
    }
  }
  
  void e()
  {
    a(2, 3);
    a(256, zbrj.a);
    g();
    if (1 + this.ac + 10 - this.ae < 9)
    {
      a(2, 3);
      a(256, zbrj.a);
      g();
    }
    this.ac = 7;
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    this.c[(this.Y + this.X * 2)] = ((byte)(paramInt1 >>> 8));
    this.c[(this.Y + this.X * 2 + 1)] = ((byte)paramInt1);
    this.c[(this.V + this.X)] = ((byte)paramInt2);
    this.X += 1;
    if (paramInt1 == 0)
    {
      int tmp78_77 = (paramInt2 * 2);
      short[] tmp78_72 = this.K;
      tmp78_72[tmp78_77] = ((short)(tmp78_72[tmp78_77] + 1));
    }
    else
    {
      this.ab += 1;
      paramInt1--;
      int tmp117_116 = ((zbxb.f[paramInt2] + 256 + 1) * 2);
      short[] tmp117_101 = this.K;
      tmp117_101[tmp117_116] = ((short)(tmp117_101[tmp117_116] + 1));
      int tmp133_132 = (zbxb.a(paramInt1) * 2);
      short[] tmp133_124 = this.L;
      tmp133_124[tmp133_132] = ((short)(tmp133_124[tmp133_132] + 1));
    }
    if (((this.X & 0x1FFF) == 0) && (this.G > 2))
    {
      int i1 = this.X * 8;
      int i2 = this.A - this.w;
      for (int i3 = 0; i3 < 30; i3++) {
        i1 = (int)(i1 + this.L[(i3 * 2)] * (5L + zbxb.b[i3]));
      }
      i1 >>>= 3;
      if ((this.ab < this.X / 2) && (i1 < i2 / 2)) {
        return true;
      }
    }
    return this.X == this.W - 1;
  }
  
  void a(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    int i3 = 0;
    if (this.X != 0) {
      do
      {
        int i1 = this.c[(this.Y + i3 * 2)] << 8 & 0xFF00 | this.c[(this.Y + i3 * 2 + 1)] & 0xFF;
        int i2 = this.c[(this.V + i3)] & 0xFF;
        i3++;
        if (i1 == 0)
        {
          a(i2, paramArrayOfShort1);
        }
        else
        {
          int i4 = zbxb.f[i2];
          a(i4 + 256 + 1, paramArrayOfShort1);
          int i5 = zbxb.a[i4];
          if (i5 != 0)
          {
            i2 -= zbxb.g[i4];
            a(i2, i5);
          }
          i1--;
          i4 = zbxb.a(i1);
          a(i4, paramArrayOfShort2);
          i5 = zbxb.b[i4];
          if (i5 != 0)
          {
            i1 -= zbxb.h[i4];
            a(i1, i5);
          }
        }
      } while (i3 < this.X);
    }
    a(256, paramArrayOfShort1);
    this.ac = paramArrayOfShort1['ȁ'];
  }
  
  void f()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    while (i1 < 7)
    {
      i3 += this.K[(i1 * 2)];
      i1++;
    }
    while (i1 < 128)
    {
      i2 += this.K[(i1 * 2)];
      i1++;
    }
    while (i1 < 256)
    {
      i3 += this.K[(i1 * 2)];
      i1++;
    }
    this.h = ((byte)(i3 > i2 >>> 2 ? 0 : 1));
  }
  
  void g()
  {
    if (this.ae == 16)
    {
      a(this.ad);
      this.ad = 0;
      this.ae = 0;
    }
    else if (this.ae >= 8)
    {
      a((byte)this.ad);
      this.ad = ((short)(this.ad >>> 8));
      this.ae -= 8;
    }
  }
  
  void h()
  {
    if (this.ae > 8) {
      a(this.ad);
    } else if (this.ae > 0) {
      a((byte)this.ad);
    }
    this.ad = 0;
    this.ae = 0;
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = 0;
    h();
    this.ac = 8;
    if (paramBoolean)
    {
      a((short)paramInt2);
      a((short)(paramInt2 ^ 0xFFFFFFFF));
    }
    a(this.n, paramInt1, paramInt2);
  }
  
  void a(boolean paramBoolean)
  {
    c(this.w >= 0 ? this.w : -1, this.A - this.w, paramBoolean);
    this.w = this.A;
    this.a.c();
  }
  
  int c(int paramInt)
  {
    int i1 = 65535;
    if (i1 > this.d - 5) {
      i1 = this.d - 5;
    }
    do
    {
      do
      {
        if (this.C <= 1)
        {
          i();
          if ((this.C == 0) && (paramInt == 0)) {
            return 0;
          }
          if (this.C == 0) {
            break;
          }
        }
        this.A += this.C;
        this.C = 0;
        int i2 = this.w + i1;
        if ((this.A == 0) || (this.A >= i2))
        {
          this.C = (this.A - i2);
          this.A = i2;
          a(false);
          if (this.a.g == 0) {
            return 0;
          }
        }
      } while (this.A - this.w < this.k - 262);
      a(false);
    } while (this.a.g != 0);
    return 0;
    a(paramInt == 4);
    if (this.a.g == 0) {
      return paramInt == 4 ? 2 : 0;
    }
    return paramInt == 4 ? 3 : 1;
  }
  
  void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(0 + (paramBoolean ? 1 : 0), 3);
    a(paramInt1, paramInt2, true);
  }
  
  void c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i3 = 0;
    int i1;
    int i2;
    if (this.G > 0)
    {
      if (this.h == 2) {
        f();
      }
      this.N.b(this);
      this.O.b(this);
      i3 = d();
      i1 = this.Z + 3 + 7 >>> 3;
      i2 = this.aa + 3 + 7 >>> 3;
      if (i2 <= i1) {
        i1 = i2;
      }
    }
    else
    {
      i1 = i2 = paramInt2 + 5;
    }
    if ((paramInt2 + 4 <= i1) && (paramInt1 != -1))
    {
      b(paramInt1, paramInt2, paramBoolean);
    }
    else if (i2 == i1)
    {
      a(2 + (paramBoolean ? 1 : 0), 3);
      a(zbrj.a, zbrj.b);
    }
    else
    {
      a(4 + (paramBoolean ? 1 : 0), 3);
      a(this.N.j + 1, this.O.j + 1, i3 + 1);
      a(this.K, this.L);
    }
    c();
    if (paramBoolean) {
      h();
    }
  }
  
  void i()
  {
    do
    {
      int i4 = this.o - this.C - this.A;
      if ((i4 == 0) && (this.A == 0) && (this.C == 0))
      {
        i4 = this.k;
      }
      else if (i4 == -1)
      {
        i4--;
      }
      else if (this.A >= this.k + this.k - 262)
      {
        System.arraycopy(this.n, this.k, this.n, 0, this.k);
        this.B -= this.k;
        this.A -= this.k;
        this.w -= this.k;
        i1 = this.s;
        int i3 = i1;
        int i2;
        do
        {
          i2 = this.q[(--i3)] & 0xFFFF;
          this.q[i3] = (i2 >= this.k ? (short)(i2 - this.k) : 0);
          i1--;
        } while (i1 != 0);
        i1 = this.k;
        i3 = i1;
        do
        {
          i2 = this.p[(--i3)] & 0xFFFF;
          this.p[i3] = (i2 >= this.k ? (short)(i2 - this.k) : 0);
          i1--;
        } while (i1 != 0);
        i4 += this.k;
      }
      if (this.a.c == 0) {
        return;
      }
      int i1 = this.a.a(this.n, this.A + this.C, i4);
      this.C += i1;
      if (this.C >= 3)
      {
        this.r = (this.n[this.A] & 0xFF);
        this.r = ((this.r << this.v ^ this.n[(this.A + 1)] & 0xFF) & this.u);
      }
    } while ((this.C < 262) && (this.a.c != 0));
  }
  
  int d(int paramInt)
  {
    int i1 = 0;
    do
    {
      boolean bool;
      do
      {
        if (this.C < 262)
        {
          i();
          if ((this.C < 262) && (paramInt == 0)) {
            return 0;
          }
          if (this.C == 0) {
            break;
          }
        }
        if (this.C >= 3)
        {
          this.r = ((this.r << this.v ^ this.n[(this.A + 2)] & 0xFF) & this.u);
          i1 = this.q[this.r] & 0xFFFF;
          this.p[(this.A & this.m)] = this.q[this.r];
          this.q[this.r] = ((short)this.A);
        }
        if ((i1 != 0L) && ((this.A - i1 & 0xFFFF) <= this.k - 262) && (this.H != 2)) {
          this.x = f(i1);
        }
        if (this.x >= 3)
        {
          bool = b(this.A - this.B, this.x - 3);
          this.C -= this.x;
          if ((this.x <= this.F) && (this.C >= 3))
          {
            this.x -= 1;
            do
            {
              this.A += 1;
              this.r = ((this.r << this.v ^ this.n[(this.A + 2)] & 0xFF) & this.u);
              i1 = this.q[this.r] & 0xFFFF;
              this.p[(this.A & this.m)] = this.q[this.r];
              this.q[this.r] = ((short)this.A);
            } while (--this.x != 0);
            this.A += 1;
          }
          else
          {
            this.A += this.x;
            this.x = 0;
            this.r = (this.n[this.A] & 0xFF);
            this.r = ((this.r << this.v ^ this.n[(this.A + 1)] & 0xFF) & this.u);
          }
        }
        else
        {
          bool = b(0, this.n[this.A] & 0xFF);
          this.C -= 1;
          this.A += 1;
        }
      } while (!bool);
      a(false);
    } while (this.a.g != 0);
    return 0;
    a(paramInt == 4);
    if (this.a.g == 0)
    {
      if (paramInt == 4) {
        return 2;
      }
      return 0;
    }
    return paramInt == 4 ? 3 : 1;
  }
  
  int e(int paramInt)
  {
    int i1 = 0;
    boolean bool;
    for (;;)
    {
      if (this.C < 262)
      {
        i();
        if ((this.C < 262) && (paramInt == 0)) {
          return 0;
        }
        if (this.C == 0) {
          break;
        }
      }
      if (this.C >= 3)
      {
        this.r = ((this.r << this.v ^ this.n[(this.A + 2)] & 0xFF) & this.u);
        i1 = this.q[this.r] & 0xFFFF;
        this.p[(this.A & this.m)] = this.q[this.r];
        this.q[this.r] = ((short)this.A);
      }
      this.D = this.x;
      this.y = this.B;
      this.x = 2;
      if ((i1 != 0) && (this.D < this.F) && ((this.A - i1 & 0xFFFF) <= this.k - 262))
      {
        if (this.H != 2) {
          this.x = f(i1);
        }
        if ((this.x <= 5) && ((this.H == 1) || ((this.x == 3) && (this.A - this.B > 4096)))) {
          this.x = 2;
        }
      }
      if ((this.D >= 3) && (this.x <= this.D))
      {
        int i2 = this.A + this.C - 3;
        bool = b(this.A - 1 - this.y, this.D - 3);
        this.C -= this.D - 1;
        this.D -= 2;
        do
        {
          if (++this.A <= i2)
          {
            this.r = ((this.r << this.v ^ this.n[(this.A + 2)] & 0xFF) & this.u);
            i1 = this.q[this.r] & 0xFFFF;
            this.p[(this.A & this.m)] = this.q[this.r];
            this.q[this.r] = ((short)this.A);
          }
        } while (--this.D != 0);
        this.z = 0;
        this.x = 2;
        this.A += 1;
        if (bool)
        {
          a(false);
          if (this.a.g == 0) {
            return 0;
          }
        }
      }
      else if (this.z != 0)
      {
        bool = b(0, this.n[(this.A - 1)] & 0xFF);
        if (bool) {
          a(false);
        }
        this.A += 1;
        this.C -= 1;
        if (this.a.g == 0) {
          return 0;
        }
      }
      else
      {
        this.z = 1;
        this.A += 1;
        this.C -= 1;
      }
    }
    if (this.z != 0)
    {
      bool = b(0, this.n[(this.A - 1)] & 0xFF);
      this.z = 0;
    }
    a(paramInt == 4);
    if (this.a.g == 0)
    {
      if (paramInt == 4) {
        return 2;
      }
      return 0;
    }
    return paramInt == 4 ? 3 : 1;
  }
  
  int f(int paramInt)
  {
    int i1 = this.E;
    int i2 = this.A;
    int i5 = this.D;
    int i6 = this.A > this.k - 262 ? this.A - (this.k - 262) : 0;
    int i7 = this.J;
    int i8 = this.m;
    int i9 = this.A + 258;
    int i10 = this.n[(i2 + i5 - 1)];
    int i11 = this.n[(i2 + i5)];
    if (this.D >= this.I) {
      i1 >>= 2;
    }
    if (i7 > this.C) {
      i7 = this.C;
    }
    do
    {
      int i3 = paramInt;
      if ((this.n[(i3 + i5)] == i11) && (this.n[(i3 + i5 - 1)] == i10) && (this.n[i3] == this.n[i2]) && (this.n[(++i3)] == this.n[(i2 + 1)]))
      {
        i2 += 2;
        i3++;
        while ((this.n[(++i2)] == this.n[(++i3)]) && (this.n[(++i2)] == this.n[(++i3)]) && (this.n[(++i2)] == this.n[(++i3)]) && (this.n[(++i2)] == this.n[(++i3)]) && (this.n[(++i2)] == this.n[(++i3)]) && (this.n[(++i2)] == this.n[(++i3)]) && (this.n[(++i2)] == this.n[(++i3)]) && (this.n[(++i2)] == this.n[(++i3)]) && (i2 < i9)) {}
        int i4 = 258 - (i9 - i2);
        i2 = i9 - 258;
        if (i4 > i5)
        {
          this.B = paramInt;
          i5 = i4;
          if (i4 >= i7) {
            break;
          }
          i10 = this.n[(i2 + i5 - 1)];
          i11 = this.n[(i2 + i5)];
        }
      }
      if ((paramInt = this.p[(paramInt & i8)] & 0xFFFF) <= i6) {
        break;
      }
      i1--;
    } while (i1 != 0);
    if (i5 <= this.C) {
      return i5;
    }
    return this.C;
  }
  
  int a(zckc paramzckc, int paramInt1, int paramInt2)
  {
    return a(paramzckc, paramInt1, 8, paramInt2, 8, 0);
  }
  
  int a(zckc paramzckc, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = 0;
    paramzckc.i = null;
    if (paramInt1 == -1) {
      paramInt1 = 6;
    }
    if (paramInt3 < 0)
    {
      i1 = 1;
      paramInt3 = -paramInt3;
    }
    if ((paramInt4 < 1) || (paramInt4 > 9) || (paramInt2 != 8) || (paramInt3 < 9) || (paramInt3 > 15) || (paramInt1 < 0) || (paramInt1 > 9) || (paramInt5 < 0) || (paramInt5 > 2)) {
      return -2;
    }
    paramzckc.j = this;
    this.g = i1;
    this.l = paramInt3;
    this.k = (1 << this.l);
    this.m = (this.k - 1);
    this.t = (paramInt4 + 7);
    this.s = (1 << this.t);
    this.u = (this.s - 1);
    this.v = ((this.t + 3 - 1) / 3);
    this.n = new byte[this.k * 2];
    this.p = new short[this.k];
    this.q = new short[this.s];
    this.W = (1 << paramInt4 + 6);
    this.c = new byte[this.W * 4];
    this.d = (this.W * 4);
    this.Y = (this.W / 2);
    this.V = (3 * this.W);
    this.G = paramInt1;
    this.H = paramInt5;
    this.i = ((byte)paramInt2);
    return a(paramzckc);
  }
  
  int a(zckc paramzckc)
  {
    paramzckc.d = (paramzckc.h = 0L);
    paramzckc.i = null;
    paramzckc.l = 2;
    this.f = 0;
    this.e = 0;
    if (this.g < 0) {
      this.g = 0;
    }
    this.b = (this.g != 0 ? 113 : 42);
    paramzckc.m = paramzckc.n.a(0L, null, 0, 0);
    this.j = 0;
    b();
    a();
    return 0;
  }
  
  int j()
  {
    if ((this.b != 42) && (this.b != 113) && (this.b != 666)) {
      return -2;
    }
    this.c = null;
    this.q = null;
    this.p = null;
    this.n = null;
    return this.b == 113 ? -3 : 0;
  }
  
  int a(zckc paramzckc, int paramInt)
  {
    if ((paramInt > 4) || (paramInt < 0)) {
      return -2;
    }
    if ((paramzckc.e == null) || ((paramzckc.a == null) && (paramzckc.c != 0)) || ((this.b == 666) && (paramInt != 4)))
    {
      paramzckc.i = ag[4];
      return -2;
    }
    if (paramzckc.g == 0)
    {
      paramzckc.i = ag[7];
      return -5;
    }
    this.a = paramzckc;
    int i1 = this.j;
    this.j = paramInt;
    int i2;
    int i3;
    if (this.b == 42)
    {
      i2 = 8 + (this.l - 8 << 4) << 8;
      i3 = (this.G - 1 & 0xFF) >> 1;
      if (i3 > 3) {
        i3 = 3;
      }
      i2 |= i3 << 6;
      if (this.A != 0) {
        i2 |= 0x20;
      }
      i2 += 31 - i2 % 31;
      this.b = 113;
      b(i2);
      if (this.A != 0)
      {
        b((int)(paramzckc.m >>> 16));
        b((int)(paramzckc.m & 0xFFFF));
      }
      paramzckc.m = paramzckc.n.a(0L, null, 0, 0);
    }
    if (this.f != 0)
    {
      paramzckc.c();
      if (paramzckc.g == 0)
      {
        this.j = -1;
        return 0;
      }
    }
    else if ((paramzckc.c == 0) && (paramInt <= i1) && (paramInt != 4))
    {
      paramzckc.i = ag[7];
      return -5;
    }
    if ((this.b == 666) && (paramzckc.c != 0))
    {
      paramzckc.i = ag[7];
      return -5;
    }
    if ((paramzckc.c != 0) || (this.C != 0) || ((paramInt != 0) && (this.b != 666)))
    {
      i2 = -1;
      switch (af[this.G].e)
      {
      case 0: 
        i2 = c(paramInt);
        break;
      case 1: 
        i2 = d(paramInt);
        break;
      case 2: 
        i2 = e(paramInt);
        break;
      }
      if ((i2 == 2) || (i2 == 3)) {
        this.b = 666;
      }
      if ((i2 == 0) || (i2 == 2))
      {
        if (paramzckc.g == 0) {
          this.j = -1;
        }
        return 0;
      }
      if (i2 == 1)
      {
        if (paramInt == 1)
        {
          e();
        }
        else
        {
          b(0, 0, false);
          if (paramInt == 3) {
            for (i3 = 0; i3 < this.s; i3++) {
              this.q[i3] = 0;
            }
          }
        }
        paramzckc.c();
        if (paramzckc.g == 0)
        {
          this.j = -1;
          return 0;
        }
      }
    }
    if (paramInt != 4) {
      return 0;
    }
    if (this.g != 0) {
      return 1;
    }
    b((int)(paramzckc.m >>> 16));
    b((int)(paramzckc.m & 0xFFFF));
    paramzckc.c();
    this.g = -1;
    return this.f != 0 ? 0 : 1;
  }
  
  static
  {
    af[0] = new za(0, 0, 0, 0, 0);
    af[1] = new za(4, 4, 8, 4, 1);
    af[2] = new za(4, 5, 16, 8, 1);
    af[3] = new za(4, 6, 32, 32, 1);
    af[4] = new za(4, 4, 16, 16, 2);
    af[5] = new za(8, 16, 32, 32, 2);
    af[6] = new za(8, 16, 128, 128, 2);
    af[7] = new za(8, 32, 128, 256, 2);
    af[8] = new za(32, 128, 258, 1024, 2);
    af[9] = new za(32, 258, 258, 4096, 2);
  }
  
  static class za
  {
    int a;
    int b;
    int c;
    int d;
    int e;
    
    za(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramInt3;
      this.d = paramInt4;
      this.e = paramInt5;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */