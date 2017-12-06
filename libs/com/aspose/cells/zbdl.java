package com.aspose.cells;

class zbdl
  extends zbdk
{
  private byte[][] a = new byte[f()][];
  private int b = -1;
  private int c = 0;
  private int d;
  private int e;
  private int f;
  private int g;
  private zabw h;
  private zajl i;
  private zbqs j = new zbqs();
  private zbqt k = new zbqt();
  private zbqu l = new zbqu();
  private zbdw m;
  private boolean n = false;
  
  zbdl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, zajl paramzajl, zabw paramzabw)
  {
    this.d = (97 + (k(paramInt3) << 5) / 2);
    j(paramInt2, paramInt4);
    this.i = paramzajl;
    this.h = paramzabw;
  }
  
  public zajl c()
  {
    return this.i;
  }
  
  public void a(zajl paramzajl)
  {
    this.i = paramzajl;
  }
  
  byte[] h(int paramInt)
  {
    return this.a[(paramInt >> 5)];
  }
  
  int i(int paramInt)
  {
    return a(this.a[(paramInt >> 5)], paramInt & 0x1F);
  }
  
  int j(int paramInt)
  {
    int i1 = paramInt;
    byte[] arrayOfByte = this.a[(i1 >> 5)];
    i1 = (i1 & 0x1F) * 3;
    return 97 + ((arrayOfByte[(i1 + 1)] & 0xFF) << 16 | (arrayOfByte[(i1 + 2)] & 0xFF) << 8 | arrayOfByte[(i1 + 3)] & 0xFF);
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt == 0) {
      return 97;
    }
    int i1 = (paramInt - 1) * 3;
    return 97 + ((paramArrayOfByte[(i1 + 1)] & 0xFF) << 16 | (paramArrayOfByte[(i1 + 2)] & 0xFF) << 8 | paramArrayOfByte[(i1 + 3)] & 0xFF);
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1;
    int i2 = paramInt2;
    i2 -= 97;
    i1 = (i1 - 1) * 3;
    paramArrayOfByte[(i1 + 1)] = ((byte)(i2 >> 16));
    paramArrayOfByte[(i1 + 2)] = ((byte)(i2 >> 8 & 0xFF));
    paramArrayOfByte[(i1 + 3)] = ((byte)(i2 & 0xFF));
  }
  
  int e()
  {
    return this.g;
  }
  
  int k(int paramInt)
  {
    return zbdw.o(65535) + zbdw.q(paramInt);
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = paramInt5;
    int i2;
    if (i1 < 0)
    {
      i2 = 1;
      i1 = -i1;
    }
    else
    {
      i2 = 0;
    }
    Object localObject = this.a[(paramInt1 >> 5)];
    int i3 = paramInt1 & 0x1F;
    if (i3 == (localObject[0] & 0xFF) - 1)
    {
      if (localObject.length - paramInt4 < i1)
      {
        byte[] arrayOfByte1 = new byte[paramInt4 + i1 + m(localObject[0] & 0xFF, paramInt3)];
        System.arraycopy(localObject, 0, arrayOfByte1, 0, paramInt3);
        localObject = arrayOfByte1;
        this.a[(paramInt1 >> 5)] = arrayOfByte1;
      }
      if (i2 == 0) {
        i1 = n(localObject.length - paramInt4, i1);
      }
      a((byte[])localObject, localObject[0] & 0xFF, paramInt4 + i1);
      return paramInt1;
    }
    int i4 = 97;
    if (i3 > 0)
    {
      i4 = zbdw.d((byte[])localObject, a((byte[])localObject, i3 - 1), paramInt2);
      if (paramInt2 - i4 >= i1)
      {
        if (i2 == 0) {
          i1 = n(paramInt2 - i4, i1);
        }
        System.arraycopy(localObject, paramInt2, localObject, paramInt2 - i1, paramInt3 - paramInt2);
        a((byte[])localObject, i3, paramInt2 - i1);
        return paramInt1;
      }
    }
    int i5 = a((byte[])localObject, i3 + 2);
    int i6 = zbdw.d((byte[])localObject, paramInt4, i5);
    if (i5 - i6 >= i1)
    {
      if (i2 == 0) {
        i1 = n(i5 - i6, i1);
      }
      System.arraycopy(localObject, paramInt4, localObject, paramInt4 + i1, i6 - paramInt4);
      zbdw.c((byte[])localObject, i6 + i1, i5);
      a((byte[])localObject, i3 + 1, paramInt4 + i1);
      return paramInt1;
    }
    if (paramInt2 - i4 + i5 - i6 >= i1)
    {
      System.arraycopy(localObject, paramInt2, localObject, i4, paramInt3 - paramInt2);
      i1 -= paramInt2 - i4;
      System.arraycopy(localObject, paramInt4, localObject, paramInt4 + i1, i6 - paramInt4);
      zbdw.c((byte[])localObject, i6 + i1, i5);
      a((byte[])localObject, i3 + 1, paramInt4 + i1);
      a((byte[])localObject, i3, i4);
      return paramInt1;
    }
    if (i3 < (localObject[0] & 0xFF) - 2)
    {
      i5 = a((byte[])localObject, localObject[0] & 0xFF);
      i6 = zbdw.d((byte[])localObject, a((byte[])localObject, (localObject[0] & 0xFF) - 1), i5);
    }
    if (localObject.length - i6 < i1)
    {
      if (i2 == 0) {
        i1 += this.g;
      }
      byte[] arrayOfByte2 = new byte[i5 + i1 + m(localObject[0] & 0xFF, i6)];
      System.arraycopy(localObject, 0, arrayOfByte2, 0, paramInt3);
      System.arraycopy(localObject, paramInt4, arrayOfByte2, paramInt4 + i1, i6 - paramInt4);
      localObject = arrayOfByte2;
      this.a[(paramInt1 >> 5)] = arrayOfByte2;
      zbdw.c((byte[])localObject, i6 + i1, Math.min(i5 + i1, localObject.length));
      b((byte[])localObject, i3 + 1, i1);
      return paramInt1;
    }
    if (i2 == 0) {
      i1 = n(localObject.length - i5 >= i1 ? localObject.length - i5 : localObject.length - i6, i1);
    }
    System.arraycopy(localObject, paramInt4, localObject, paramInt4 + i1, i6 - paramInt4);
    zbdw.c((byte[])localObject, i6 + i1, Math.min(i5 + i1, localObject.length));
    b((byte[])localObject, i3 + 1, i1);
    return paramInt1;
  }
  
  private int a(int paramInt1, int paramInt2, zajh paramzajh, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    int i1 = paramInt1;
    int i2 = paramInt3;
    int i3 = paramInt4;
    int i4 = paramInt5;
    int i5 = paramInt6;
    int i6 = paramInt7;
    if (i1 > this.b)
    {
      if (this.a[(this.b + 1)] == null)
      {
        paramzajh.a(-1);
        this.a[(this.b + 1)] = new byte[Math.max(this.d, paramzajh.a())];
      }
      else if (!paramzajh.a(this.a[(this.b + 1)].length))
      {
        this.a[(this.b + 1)] = new byte[Math.max(this.d, paramzajh.a())];
      }
      return 97;
    }
    if (i1 < 0)
    {
      if (this.b < 0)
      {
        if (this.a[0] == null)
        {
          paramzajh.a(-1);
          this.a[0] = new byte[Math.max(this.d, paramzajh.a())];
        }
        else if (!paramzajh.a(this.a[0].length))
        {
          this.a[0] = new byte[Math.max(this.d, paramzajh.a())];
        }
        return 97;
      }
      i1 = this.b;
    }
    Object localObject = this.a[i1];
    if ((paramInt2 < 0) || (paramInt2 >= (localObject[0] & 0xFF)))
    {
      if (i4 < 0) {
        i4 = a((byte[])localObject, localObject[0] & 0xFF);
      }
      if (paramzajh.a(localObject.length - i4)) {
        return i4;
      }
      if (i3 < 0)
      {
        if (i2 < 0) {
          i2 = a((byte[])localObject, (localObject[0] & 0xFF) - 1);
        }
        i3 = zbdw.d((byte[])localObject, i2, i4);
      }
      if (paramzajh.a(localObject.length - i3)) {
        return i3;
      }
      paramzajh.a(-1);
      byte[] arrayOfByte1 = new byte[i4 + Math.max(paramzajh.a(), m(localObject[0] & 0xFF, i3))];
      System.arraycopy(localObject, 0, arrayOfByte1, 0, i3);
      localObject = arrayOfByte1;
      this.a[i1] = arrayOfByte1;
      return i3;
    }
    if (i4 < 0) {
      i4 = a((byte[])localObject, paramInt2);
    }
    if (paramInt2 > 0)
    {
      if (i3 < 0)
      {
        if (i2 < 0) {
          i2 = a((byte[])localObject, paramInt2 - 1);
        }
        i3 = zbdw.d((byte[])localObject, i2, i4);
      }
      if (paramzajh.a(i4 - i3)) {
        return i4 - paramzajh.a();
      }
    }
    else
    {
      i3 = i4;
    }
    if (i6 < 0) {
      i6 = a((byte[])localObject, paramInt2 + 1);
    }
    if (i5 < 0) {
      i5 = zbdw.d((byte[])localObject, i4, i6);
    }
    if (paramzajh.a(i4 - i3 + i6 - i5))
    {
      System.arraycopy(localObject, i4, localObject, i3 + paramzajh.a(), i5 - i4);
      zbdw.c((byte[])localObject, i5 + i3 + paramzajh.a() - i4, i6);
      return i3;
    }
    if ((localObject[0] & 0xFF) > paramInt2 + 1)
    {
      i6 = a((byte[])localObject, localObject[0] & 0xFF);
      i5 = zbdw.d((byte[])localObject, a((byte[])localObject, (localObject[0] & 0xFF) - 1), i6);
    }
    if ((paramzajh.a(localObject.length - i6)) || (paramzajh.a(localObject.length - i5)))
    {
      System.arraycopy(localObject, i4, localObject, i4 + paramzajh.a(), i5 - i4);
      zbdw.c((byte[])localObject, i5 + paramzajh.a(), Math.min(localObject.length, i6 + paramzajh.a()));
      b((byte[])localObject, paramInt2 + 1, paramzajh.a());
      return i4;
    }
    if (paramzajh.a(localObject.length - i5 + i4 - i3))
    {
      int i7 = i3 + paramzajh.a();
      System.arraycopy(localObject, i4, localObject, i7, i5 - i4);
      i7 -= i4;
      zbdw.c((byte[])localObject, i5 + i7, Math.min(localObject.length, i6 + i7));
      b((byte[])localObject, paramInt2 + 1, i7);
      return i3;
    }
    paramzajh.a(-1);
    byte[] arrayOfByte2 = new byte[i5 + Math.max(paramzajh.a(), m(localObject[0] & 0xFF, i5))];
    System.arraycopy(localObject, 0, arrayOfByte2, 0, (localObject[0] & 0xFF) * 3 + 1);
    System.arraycopy(localObject, 97, arrayOfByte2, 97, i3 - 97);
    System.arraycopy(localObject, i4, arrayOfByte2, i4 + paramzajh.a(), i5 - i4);
    localObject = arrayOfByte2;
    this.a[i1] = arrayOfByte2;
    zbdw.c((byte[])localObject, i5 + paramzajh.a(), Math.min(localObject.length, i6 + paramzajh.a()));
    b((byte[])localObject, paramInt2 + 1, paramzajh.a());
    return i4;
  }
  
  private int m(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 32) {
      return this.g << 3;
    }
    return (int)(Math.min(32 - paramInt1, this.e) / paramInt1 * (paramInt2 - 97));
  }
  
  private int n(int paramInt1, int paramInt2)
  {
    return Math.min(paramInt1, paramInt2 + this.g);
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1--;
    int i1 = paramInt1 * 3 + 1;
    int i2 = paramInt2 > 0 ? (paramArrayOfByte[0] & 0xFF) - 1 : paramArrayOfByte[0] & 0xFF;
    int i3;
    while (paramInt1 < i2)
    {
      i3 = ((paramArrayOfByte[i1] & 0xFF) << 16 | (paramArrayOfByte[(i1 + 1)] & 0xFF) << 8 | paramArrayOfByte[(i1 + 2)] & 0xFF) + paramInt2;
      paramArrayOfByte[(i1++)] = ((byte)(i3 >> 16));
      paramArrayOfByte[(i1++)] = ((byte)(i3 >> 8 & 0xFF));
      paramArrayOfByte[(i1++)] = ((byte)(i3 & 0xFF));
      paramInt1++;
    }
    if (paramInt2 > 0)
    {
      i3 = Math.min(((paramArrayOfByte[i1] & 0xFF) << 16 | (paramArrayOfByte[(i1 + 1)] & 0xFF) << 8 | paramArrayOfByte[(i1 + 2)] & 0xFF) + paramInt2, paramArrayOfByte.length - 97);
      paramArrayOfByte[(i1++)] = ((byte)(i3 >> 16));
      paramArrayOfByte[(i1++)] = ((byte)(i3 >> 8 & 0xFF));
      paramArrayOfByte[(i1++)] = ((byte)(i3 & 0xFF));
    }
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    int i1 = paramInt5;
    if (i1 < 0) {
      i1 = this.g;
    }
    int i2 = paramInt1 >> 5;
    int i3 = (paramInt1 & 0x1F) + 1;
    if ((paramBoolean) && (i3 == 1) && (i2 > 0))
    {
      arrayOfByte1 = this.a[(i2 - 1)];
      int i4 = a(arrayOfByte1, arrayOfByte1[0] & 0xFF);
      if (arrayOfByte1.length > i4 + i1)
      {
        byte[] arrayOfByte3 = new byte[i4 + i1];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, i4);
        this.a[(i2 - 1)] = arrayOfByte3;
      }
    }
    byte[] arrayOfByte1 = this.a[i2];
    if (i3 == (arrayOfByte1[0] & 0xFF))
    {
      a(arrayOfByte1, i3, paramInt3 + i1);
      if ((paramBoolean) && (arrayOfByte1.length > paramInt3 + i1) && (((arrayOfByte1[0] & 0xFF) == 32) || ((i2 << 5) + 32 - 1 == zbdw.a(arrayOfByte1, paramInt2))))
      {
        byte[] arrayOfByte2 = new byte[paramInt3 + i1];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, paramInt3);
        this.a[i2] = arrayOfByte2;
      }
    }
    else if (paramBoolean)
    {
      int i5 = zbdw.d(arrayOfByte1, paramInt4, a(arrayOfByte1, i3 + 1));
      System.arraycopy(arrayOfByte1, paramInt4, arrayOfByte1, paramInt3 + i1, i5 - paramInt4);
      a(arrayOfByte1, i3, paramInt3 + i1);
      arrayOfByte1[(i5 + paramInt3 + i1 - paramInt4)] = 0;
    }
    else
    {
      System.arraycopy(arrayOfByte1, paramInt4, arrayOfByte1, paramInt3 + i1, a(arrayOfByte1, arrayOfByte1[0] & 0xFF) - paramInt4);
      b(arrayOfByte1, i3, paramInt3 + i1 - paramInt4);
    }
    return paramInt1;
  }
  
  public void j(int paramInt1, int paramInt2)
  {
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = zbdw.q(paramInt2);
    this.j.b(this.g);
    this.k.b(this.f);
    this.l.b(this.f);
  }
  
  private int m(int paramInt)
  {
    return paramInt & 0xFFFFFFE0;
  }
  
  private void d(int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    int i1 = paramInt2;
    this.b += 1;
    if (this.b < this.a.length)
    {
      System.arraycopy(this.a, paramInt1, this.a, paramInt1 + 1, this.b - paramInt1);
    }
    else
    {
      localObject = new byte[this.b + f()][];
      System.arraycopy(this.a, 0, localObject, 0, paramInt1);
      System.arraycopy(this.a, paramInt1, localObject, paramInt1 + 1, this.b - paramInt1);
      this.a = ((byte[][])localObject);
    }
    Object localObject = new byte[i1 + this.d];
    this.a[paramInt1] = localObject;
    localObject[0] = 1;
    this.c += 1;
    i1 += 97;
    a((byte[])localObject, 1, i1);
    zbdw.a((byte[])localObject, 97, i1, paramzbdx);
  }
  
  public int a(int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    int i1 = paramInt1;
    this.k.a(paramzbdx, paramInt2);
    if (this.b < 0)
    {
      this.k.a(-1);
      d(0, paramzbdx, this.k.a());
      return 0;
    }
    int i2;
    int i3;
    if (i1 < 0)
    {
      if (paramzbdx.a >= m(zbdw.a(this.a[this.b], 97)) + 32)
      {
        this.k.a(-1);
        d(this.b + 1, paramzbdx, this.k.a());
        return this.b << 5;
      }
      i2 = this.b;
      i3 = this.a[this.b][0] & 0xFF;
      i1 = i2 << 5 | i3;
    }
    else
    {
      i2 = i1 >> 5;
      if (i2 > this.b)
      {
        this.k.a(-1);
        d(this.b + 1, paramzbdx, this.k.a());
        return this.b << 5;
      }
      i3 = i1 & 0x1F;
      if ((i3 == 0) && (paramzbdx.a < m(zbdw.a(this.a[i2], 97))))
      {
        this.k.a(-1);
        d(i2, paramzbdx, this.k.a());
        return i1;
      }
    }
    int i4 = a(i2, i3, this.k, -1, -1, -1, -1, -1);
    byte[] arrayOfByte = this.a[i2];
    int i5 = i3 * 3 + 1;
    if (i3 < (arrayOfByte[0] & 0xFF)) {
      System.arraycopy(arrayOfByte, i5, arrayOfByte, i5 + 3, ((arrayOfByte[0] & 0xFF) - i3) * 3);
    }
    int tmp333_332 = 0;
    byte[] tmp333_330 = arrayOfByte;
    tmp333_330[tmp333_332] = ((byte)(tmp333_330[tmp333_332] + 1));
    this.c += 1;
    if (i3 > 0) {
      a(arrayOfByte, i3, i4);
    }
    a(arrayOfByte, i3 + 1, i4 + this.k.a());
    this.k.a(arrayOfByte, i4);
    return i1;
  }
  
  private void a(int paramInt, zbdw paramzbdw)
  {
    this.b += 1;
    this.c += 1;
    if (this.b < this.a.length)
    {
      System.arraycopy(this.a, paramInt, this.a, paramInt + 1, this.b - paramInt);
    }
    else
    {
      byte[][] arrayOfByte = new byte[this.b + f()][];
      System.arraycopy(this.a, 0, arrayOfByte, 0, paramInt);
      System.arraycopy(this.a, paramInt, arrayOfByte, paramInt + 1, this.b - paramInt);
      this.a = arrayOfByte;
    }
    int i1 = paramzbdw.o() - paramzbdw.p();
    byte[] arrayOfByte1 = new byte[i1 + this.g + this.d];
    this.a[paramInt] = arrayOfByte1;
    arrayOfByte1[0] = 1;
    a(arrayOfByte1, 1, 97 + i1 + this.g);
    System.arraycopy(paramzbdw.m(), paramzbdw.p(), arrayOfByte1, 97, i1);
  }
  
  public int a(int paramInt, zt paramzt, boolean paramBoolean)
  {
    int i1 = paramInt;
    if ((paramzt instanceof zbdw))
    {
      zbdw localzbdw = (zbdw)paramzt;
      if (this.b < 0)
      {
        a(0, localzbdw);
        return 0;
      }
      int i2;
      int i3;
      if (i1 < 0)
      {
        if (localzbdw.i() >= m(zbdw.a(this.a[this.b], 97)) + 32)
        {
          a(this.b + 1, localzbdw);
          return this.b << 5;
        }
        i2 = this.b;
        i3 = this.a[this.b][0] & 0xFF;
        i1 = i2 << 5 | i3;
      }
      else
      {
        i2 = i1 >> 5;
        if (i2 > this.b)
        {
          a(this.b + 1, localzbdw);
          return this.b << 5;
        }
        i3 = i1 & 0x1F;
        if ((i3 == 0) && (localzbdw.i() < m(zbdw.a(this.a[i2], 97))))
        {
          a(i2, localzbdw);
          return i1;
        }
      }
      int i4 = localzbdw.o() - localzbdw.p();
      this.j.a(-i4, 1);
      int i5 = a(i2, i3, this.j, -1, -1, -1, -1, -1);
      byte[] arrayOfByte = this.a[i2];
      int i6 = i3 * 3 + 1;
      System.arraycopy(arrayOfByte, i6, arrayOfByte, i6 + 3, ((arrayOfByte[0] & 0xFF) - i3) * 3);
      int tmp290_289 = 0;
      byte[] tmp290_287 = arrayOfByte;
      tmp290_287[tmp290_289] = ((byte)(tmp290_287[tmp290_289] + 1));
      this.c += 1;
      if (i3 > 0) {
        a(arrayOfByte, i3, i5);
      }
      a(arrayOfByte, i3 + 1, i5 + this.j.a());
      System.arraycopy(localzbdw.m(), localzbdw.p(), arrayOfByte, i5, i4);
      return i1;
    }
    return super.a(i1, paramzt, paramBoolean);
  }
  
  public int a(int paramInt1, zv paramzv, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1 = paramInt1;
    int i2 = paramInt2;
    if (i2 < 0) {
      i2 = 0;
    }
    switch (paramInt3)
    {
    case 0: 
      return i1;
    case 1: 
      return a(i1, paramzv.f(i2), paramBoolean);
    }
    if ((paramzv instanceof zbdl))
    {
      i3 = -1;
      int i4 = i2;
      i5 = 0;
      if (this.b < 0)
      {
        i3 = m(paramzv.a(i2)) + 32;
      }
      else
      {
        localObject1 = paramzv.a(i2, -1, false);
        i6 = -1;
        int i7 = 0;
        Object localObject2;
        int i15;
        int i16;
        zbdw localzbdw3;
        if (i1 < 0)
        {
          i6 = paramzv.a(i2);
          i3 = m(i6);
          if (i3 <= zbdw.a(this.a[this.b], 97))
          {
            i7 = 1;
            i5 = this.b;
            i1 = i5 << 5 | this.a[this.b][0] & 0xFF;
          }
          else
          {
            i5 = this.b + 1;
            i1 = i5 << 5;
          }
        }
        else
        {
          i5 = i1 >> 5;
          i8 = i1 & 0x1F;
          if (i8 == 0)
          {
            i6 = paramzv.a(i2);
            i3 = m(i6);
            if ((i5 > 0) && (zbdw.a(this.a[(i5 - 1)], 97) >= i3))
            {
              i7 = 1;
              i5--;
            }
          }
          else if (i8 >= (this.a[i5][0] & 0xFF))
          {
            i6 = paramzv.a(i2);
            i3 = m(i6);
            if (zbdw.a(this.a[i5], 97) >= i3) {
              i7 = 1;
            } else {
              i5++;
            }
          }
          else
          {
            i9 = 0;
            for (int i10 = 0; i10 < paramInt3; i10++)
            {
              localObject2 = (zbdw)paramzv.f(((zaiv)localObject1).a());
              i9 += ((zbdw)localObject2).o() - ((zbdw)localObject2).p();
            }
            ((zaiv)localObject1).b();
            this.j.a(-i9, paramInt3);
            i10 = a(i5, i8, this.j, -1, -1, -1, -1, -1);
            localObject2 = this.a[i5];
            i15 = i8 * 3 + 1;
            System.arraycopy(localObject2, i15, localObject2, i15 + paramInt3 * 3, ((localObject2[0] & 0xFF) - i8) * 3);
            localObject2[0] = ((byte)((localObject2[0] & 0xFF) + paramInt3));
            this.c += paramInt3;
            for (i16 = 0; i16 < paramInt3; i16++)
            {
              a((byte[])localObject2, i8 + i16, i10);
              localzbdw3 = (zbdw)paramzv.f(((zaiv)localObject1).a());
              i9 = localzbdw3.o() - localzbdw3.p();
              System.arraycopy(localzbdw3.m(), localzbdw3.p(), localObject2, i10, i9);
              i10 += i9;
            }
            a((byte[])localObject2, i8 + paramInt3, i10);
            return i1;
          }
        }
        i3 += 32;
        if (i7 != 0)
        {
          i8 = 0;
          i9 = 0;
          while (i8 < paramInt3)
          {
            i4 = ((zaiv)localObject1).a();
            zbdw localzbdw1 = (zbdw)paramzv.f(i4);
            i6 = localzbdw1.i();
            if (i6 >= i3) {
              break;
            }
            i9 += localzbdw1.o() - localzbdw1.p();
            i8++;
          }
          ((zaiv)localObject1).b();
          this.j.a(-i9, i8);
          i11 = a(i5, -1, this.j, -1, -1, -1, -1, -1);
          localObject2 = this.a[i5];
          i15 = localObject2[0] & 0xFF;
          localObject2[0] = ((byte)((localObject2[0] & 0xFF) + i8));
          for (i16 = 0; i16 < i8; i16++)
          {
            a((byte[])localObject2, i15 + i16, i11);
            localzbdw3 = (zbdw)paramzv.f(((zaiv)localObject1).a());
            i9 = localzbdw3.o() - localzbdw3.p();
            System.arraycopy(localzbdw3.m(), localzbdw3.p(), localObject2, i11, i9);
            i11 += i9;
          }
          a((byte[])localObject2, i15 + i8, i11);
          this.c += i8;
          i1 = i5 << 5 | i15;
          if (i8 == paramInt3) {
            return i1;
          }
          i5++;
          paramInt3 -= i8;
          i3 += 32;
        }
        if (i5 <= this.b)
        {
          i8 = m(zbdw.a(this.a[i5], 97));
          i9 = i4;
          i11 = 0;
          if (i6 < i8) {
            for (i11 = 1; i11 < paramInt3; i11++)
            {
              i9 = ((zaiv)localObject1).a();
              if (paramzv.a(i9) >= i8) {
                break;
              }
            }
          }
          if (i11 < paramInt3)
          {
            int i13 = 0;
            localObject1 = paramzv.a(i9, -1, false);
            i11 = paramInt3 - i11;
            for (i15 = 0; i15 < i11; i15++)
            {
              localObject3 = (zbdw)paramzv.f(((zaiv)localObject1).a());
              i13 += ((zbdw)localObject3).o() - ((zbdw)localObject3).p();
            }
            ((zaiv)localObject1).b();
            this.j.a(-i13, i11);
            i15 = a(i5, 0, this.j, -1, -1, -1, -1, -1);
            Object localObject3 = this.a[i5];
            System.arraycopy(localObject3, 1, localObject3, i11 * 3 + 1, (localObject3[0] & 0xFF) * 3);
            localObject3[0] = ((byte)((localObject3[0] & 0xFF) + i11));
            for (int i18 = 0; i18 < i11; i18++)
            {
              zbdw localzbdw5 = (zbdw)paramzv.f(((zaiv)localObject1).a());
              i13 = localzbdw5.o() - localzbdw5.p();
              System.arraycopy(localzbdw5.m(), localzbdw5.p(), localObject3, i15, i13);
              i15 += i13;
              a((byte[])localObject3, i18 + 1, i15);
            }
            this.c += i11;
            if (paramInt3 == i11) {
              return i1;
            }
            paramInt3 -= i11;
          }
        }
      }
      Object localObject1 = new byte[paramInt3][];
      int i6 = 0;
      zaiv localzaiv2 = paramzv.a(i4, -1, false);
      int i8 = 0;
      int i9 = 0;
      byte[] arrayOfByte1;
      int i17;
      for (int i11 = 0; i11 < paramInt3; i11++)
      {
        zbdw localzbdw2 = (zbdw)paramzv.f(localzaiv2.a());
        if (localzbdw2.i() >= i3)
        {
          arrayOfByte1 = new byte[i8 + 97];
          arrayOfByte1[0] = ((byte)i9);
          localObject1[i6] = arrayOfByte1;
          i6++;
          i8 = 0;
          i9 = 0;
          i17 = localzbdw2.i();
          for (;;)
          {
            i3 += 32;
            if (i17 < i3) {
              break;
            }
          }
        }
        i8 += localzbdw2.o() - localzbdw2.p();
        i9++;
      }
      localObject1[i6] = new byte[i8 + 97];
      localObject1[i6][0] = ((byte)i9);
      i6++;
      if (this.a.length < this.b + 1 + i6)
      {
        byte[][] arrayOfByte = new byte[this.b + 1 + i6 + f()][];
        System.arraycopy(this.a, 0, arrayOfByte, 0, i5);
        System.arraycopy(this.a, i5, arrayOfByte, i5 + i6, this.b - i5 + 1);
        this.a = arrayOfByte;
      }
      else
      {
        System.arraycopy(this.a, i5, this.a, i5 + i6, this.b - i5 + 1);
      }
      localzaiv2.b();
      for (int i14 = 0; i14 < i6; i14++)
      {
        int i12 = 97;
        arrayOfByte1 = localObject1[i14];
        this.a[(i5 + i14)] = arrayOfByte1;
        for (i17 = 0; i17 < (arrayOfByte1[0] & 0xFF); i17++)
        {
          zbdw localzbdw4 = (zbdw)paramzv.f(localzaiv2.a());
          i8 = localzbdw4.o() - localzbdw4.p();
          System.arraycopy(localzbdw4.m(), localzbdw4.p(), arrayOfByte1, i12, i8);
          i12 += i8;
          a(arrayOfByte1, i17 + 1, i12);
        }
      }
      this.b += i6;
      this.c += paramInt3;
      return i1;
    }
    int i3 = i1;
    l(paramInt3);
    zaiv localzaiv1 = paramzv.a(i2, -1, false);
    for (int i5 = 0; i5 < paramInt3; i5++)
    {
      i2 = localzaiv1.a();
      if (i2 < 0) {
        break;
      }
      i3 = a(i3, paramzv.f(i2), paramBoolean);
      f(i3).l(0, 0);
      i3 = a(i3, false);
    }
    return i1;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public int b(int paramInt)
  {
    if (this.b < 0) {
      return -1;
    }
    int i1 = m(paramInt);
    return b(paramInt, i1, i1 + 32, 0, this.b);
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    if (this.b < 0) {
      return -1;
    }
    if (paramInt1 < 0) {
      return -1;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    int i1 = paramInt2 >> 5;
    byte[] arrayOfByte;
    int i2;
    if (i1 > this.b)
    {
      i1 = this.b;
      arrayOfByte = this.a[i1];
      i2 = (arrayOfByte[0] & 0xFF) - 1;
      paramInt2 = i1 << 5 | i2;
    }
    else
    {
      arrayOfByte = this.a[i1];
      i2 = paramInt2 & 0x1F;
      if (i2 >= (arrayOfByte[0] & 0xFF))
      {
        i2 = (arrayOfByte[0] & 0xFF) - 1;
        paramInt2 = i1 << 5 | i2;
      }
    }
    int i3 = zbdw.a(arrayOfByte, a(arrayOfByte, i2));
    if (i3 == paramInt1) {
      return paramInt2;
    }
    int i4 = m(paramInt1);
    int i5 = i4 + 32;
    if (i3 > paramInt1)
    {
      if (i3 >= i5)
      {
        if (i1 < 1) {
          return -1;
        }
        return b(paramInt1, i4, i5, 0, i1 - 1);
      }
      if (i2 == 0) {
        return -(i1 << 5) - 1;
      }
      i3 = a(paramInt1, arrayOfByte, Math.max(i2 + paramInt1 - i3, 0), i2 - 1);
      if (i3 < 0) {
        return -(i1 << 5) + i3;
      }
      return (i1 << 5) + i3;
    }
    if (i3 < i4)
    {
      if (i1 == this.b) {
        return -(this.b + 1 << 5) - 1;
      }
      return b(paramInt1, i4, i5, i1 + 1, this.b);
    }
    if (i2 == (arrayOfByte[0] & 0xFF) - 1) {
      return -(i1 << 5) - i2 - 2;
    }
    i3 = a(paramInt1, arrayOfByte, i2 + 1, Math.min(i2 + paramInt1 - i3, (arrayOfByte[0] & 0xFF) - 1));
    if (i3 < 0) {
      return -(i1 << 5) + i3;
    }
    return (i1 << 5) + i3;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.b < 0) {
      return -1;
    }
    int i1 = m(paramInt1);
    int i2 = i1 + 32;
    if (paramInt2 < 0)
    {
      if (paramInt3 < 0) {
        return b(paramInt1, i1, i2, 0, this.b);
      }
      paramInt2 = 0;
    }
    else if (paramInt2 > 0)
    {
      i3 = paramInt2 >> 5;
      if (i3 > this.b) {
        return -(this.b << 5) - 32 - 1;
      }
      int i4 = paramInt2 & 0x1F;
      byte[] arrayOfByte2 = this.a[i3];
      if (i4 >= (arrayOfByte2[0] & 0xFF))
      {
        if (zbdw.a(arrayOfByte2, 97) >= i1) {
          return -(i3 << 5) - (arrayOfByte2[0] & 0xFF) - 1;
        }
        i3++;
        if (i3 > this.b) {
          return -(this.b << 5) - 32 - 1;
        }
        i4 = 0;
        paramInt2 = i3 << 5;
        arrayOfByte2 = this.a[i3];
      }
      i6 = zbdw.a(arrayOfByte2, a(arrayOfByte2, i4));
      if (i6 == paramInt1) {
        return paramInt2;
      }
      if (i6 > paramInt1) {
        return -paramInt2 - 1;
      }
      if (i6 >= i1)
      {
        if (i4 == (arrayOfByte2[0] & 0xFF) - 1) {
          return -paramInt2 - 2;
        }
        i6 = a(paramInt1, arrayOfByte2, i4 + 1, Math.min(i4 + paramInt1 - i6, (arrayOfByte2[0] & 0xFF) - 1));
        if (i6 < 0) {
          return -(i3 << 5) + i6;
        }
        return (i3 << 5) + i6;
      }
      paramInt2 = i3 + 1;
      if (paramInt2 > this.b) {
        return -(paramInt2 << 5) - 1;
      }
    }
    if (paramInt3 < 0) {
      return b(paramInt1, i1, i2, paramInt2, this.b);
    }
    int i3 = paramInt3 >> 5;
    if (i3 > this.b) {
      return b(paramInt1, i1, i2, paramInt2, this.b);
    }
    byte[] arrayOfByte1 = this.a[i3];
    int i5 = paramInt3 & 0x1F;
    if (i5 >= (arrayOfByte1[0] & 0xFF) - 1) {
      return b(paramInt1, i1, i2, paramInt2, i3);
    }
    int i6 = zbdw.a(arrayOfByte1, a(arrayOfByte1, i5));
    if (paramInt1 == i6) {
      return paramInt3;
    }
    if (paramInt1 > i6) {
      return -paramInt3 - 2;
    }
    if (i6 >= i2)
    {
      i3--;
      if (i3 < paramInt2) {
        return paramInt2 << 5;
      }
      return b(paramInt1, i1, i2, paramInt2, i3);
    }
    if (i5 == 0) {
      return -paramInt3 - 1;
    }
    i6 = a(paramInt1, arrayOfByte1, Math.max(0, i5 + paramInt1 - i6), i5 - 1);
    if (i6 < 0) {
      return -(i3 << 5) + i6;
    }
    return (i3 << 5) + i6;
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt5 = Math.min(paramInt5, paramInt2 >> 5);
    paramInt4 = Math.min(paramInt4, paramInt5);
    for (;;)
    {
      int i1 = paramInt4 + paramInt5 >> 1;
      byte[] arrayOfByte = this.a[i1];
      int i2 = zbdw.a(arrayOfByte, 97);
      if (i2 == paramInt1) {
        return i1 << 5;
      }
      if (i2 >= paramInt3)
      {
        if (paramInt4 == i1) {
          return -(i1 << 5) - 1;
        }
        paramInt5 = i1 - 1;
        paramInt4 = Math.max(paramInt4, i1 - (m(i2) - paramInt2 >> 5));
      }
      else
      {
        if (i2 >= paramInt2)
        {
          if (i2 > paramInt1) {
            return -(i1 << 5) - 1;
          }
          if ((arrayOfByte[0] & 0xFF) < 2) {
            return -(i1 << 5) - 2;
          }
          i2 = a(paramInt1, arrayOfByte, 1, Math.min(paramInt1 - i2, (arrayOfByte[0] & 0xFF) - 1));
          if (i2 < 0) {
            return -(i1 << 5) + i2;
          }
          return (i1 << 5) + i2;
        }
        if (paramInt5 == i1) {
          return -(i1 + 1 << 5) - 1;
        }
        paramInt4 = i1 + 1;
        paramInt5 = Math.min(paramInt5, i1 - (m(i2) - paramInt2 >> 5));
      }
    }
  }
  
  private int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (;;)
    {
      int i1 = paramInt2 + paramInt3 >> 1;
      int i2 = zbdw.a(paramArrayOfByte, a(paramArrayOfByte, i1));
      if (i2 == paramInt1) {
        return i1;
      }
      if (i2 < paramInt1)
      {
        if (i1 == paramInt3) {
          return -i1 - 2;
        }
        paramInt3 = Math.min(i1 + paramInt1 - i2, paramInt3);
        paramInt2 = i1 + 1;
      }
      else
      {
        if (paramInt2 == i1) {
          return -i1 - 1;
        }
        paramInt2 = Math.max(i1 + paramInt1 - i2, paramInt2);
        paramInt3 = i1 - 1;
      }
    }
  }
  
  public int a(int paramInt)
  {
    byte[] arrayOfByte = this.a[(paramInt >> 5)];
    return zbdw.a(arrayOfByte, a(arrayOfByte, paramInt & 0x1F));
  }
  
  public void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public zt f(int paramInt)
  {
    if (this.n) {
      return new zbdw(this, paramInt, this.i, this.h);
    }
    if ((this.m != null) && (this.m.n() == paramInt))
    {
      this.m.g();
      if (this.m.n() == paramInt) {
        return this.m;
      }
    }
    this.m = new zbdw(this, paramInt, this.i, this.h);
    return this.m;
  }
  
  public zbdx b(int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    byte[] arrayOfByte = this.a[(paramInt1 >> 5)];
    zbdw.a(arrayOfByte, a(arrayOfByte, paramInt1 & 0x1F), paramzbdx, paramInt2);
    return paramzbdx;
  }
  
  public void c(int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    f(paramInt1).b(paramzbdx, paramInt2);
  }
  
  public byte k(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.a[(paramInt1 >> 5)];
    return zbdw.a(arrayOfByte, a(arrayOfByte, paramInt1 & 0x1F), paramInt2);
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte)
  {
    byte[] arrayOfByte = this.a[(paramInt1 >> 5)];
    zbdw.a(arrayOfByte, a(arrayOfByte, paramInt1 & 0x1F), paramInt2, paramByte);
  }
  
  public int g(int paramInt)
  {
    byte[] arrayOfByte = this.a[(paramInt >> 5)];
    return zbdw.b(arrayOfByte, a(arrayOfByte, paramInt & 0x1F));
  }
  
  public zt a(Object paramObject)
  {
    return new zbdw(this, this.i, this.h, paramObject);
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2);
  }
  
  public int c(int paramInt)
  {
    if (this.b < 0) {
      return -1;
    }
    if (paramInt == 0) {
      return 0;
    }
    int i1 = 0;
    for (int i3 = 0; i3 <= this.b; i3++)
    {
      int i2 = this.a[i3][0] & 0xFF;
      if (i1 + i2 > paramInt) {
        return (i3 << 5) + paramInt - i1;
      }
      i1 += i2;
    }
    return -(this.b << 5) - (this.a[this.b][0] & 0xFF);
  }
  
  public int d(int paramInt)
  {
    int i1 = (paramInt >> 5) - 1;
    paramInt &= 0x1F;
    while (i1 > -1)
    {
      paramInt += (this.a[i1][0] & 0xFF);
      i1--;
    }
    return paramInt;
  }
  
  public int a(int paramInt, boolean paramBoolean)
  {
    if (this.b < 0) {
      return -1;
    }
    if (paramBoolean)
    {
      if (paramInt < 0) {
        return this.b << 5 | (this.a[this.b][0] & 0xFF) - 1;
      }
      if (paramInt > 0)
      {
        i1 = paramInt >> 5;
        if (i1 > this.b) {
          return this.b << 5 | (this.a[this.b][0] & 0xFF) - 1;
        }
        if ((paramInt & 0x1F) == 0) {
          return i1 - 1 << 5 | (this.a[(i1 - 1)][0] & 0xFF) - 1;
        }
        return paramInt - 1;
      }
      return -1;
    }
    if (paramInt < 0) {
      return 0;
    }
    int i1 = paramInt >> 5;
    if ((paramInt & 0x1F) < (this.a[i1][0] & 0xFF) - 1) {
      return paramInt + 1;
    }
    if (i1 < this.b) {
      return i1 + 1 << 5;
    }
    return -(this.b << 5 | this.a[this.b][0] & 0xFF);
  }
  
  public zaiv b()
  {
    return new zb(this, -1, 0, -1, this.b < 0 ? -1 : this.b << 5 | (this.a[this.b][0] & 0xFF) - 1);
  }
  
  public zaiv a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1;
    int i3;
    byte[] arrayOfByte;
    int i4;
    if (paramInt1 < 0)
    {
      paramInt1 = 0;
      i1 = -1;
    }
    else if (this.b < 0)
    {
      i1 = 0;
    }
    else
    {
      i3 = paramInt1 >> 5;
      if (i3 > this.b)
      {
        arrayOfByte = this.a[this.b];
        paramInt1 = (i3 << 5) + (arrayOfByte[0] & 0xFF);
        i1 = zbdw.a(arrayOfByte, a(arrayOfByte, (arrayOfByte[0] & 0xFF) - 1)) + 1;
      }
      else
      {
        arrayOfByte = this.a[i3];
        i4 = paramInt1 & 0x1F;
        if (i4 >= (arrayOfByte[0] & 0xFF))
        {
          paramInt1 = (i3 << 5) + (arrayOfByte[0] & 0xFF);
          i1 = zbdw.a(arrayOfByte, a(arrayOfByte, (arrayOfByte[0] & 0xFF) - 1)) + 1;
        }
        else
        {
          i1 = zbdw.a(arrayOfByte, a(arrayOfByte, i4));
        }
      }
    }
    int i2;
    if (paramInt2 < 0)
    {
      paramInt2 = this.b < 0 ? -1 : this.b << 5 | (this.a[this.b][0] & 0xFF) - 1;
      i2 = -1;
    }
    else
    {
      if (this.b < 0)
      {
        i2 = 0;
        paramInt2 = -1;
      }
      else
      {
        i3 = paramInt2 >> 5;
        if (i3 > this.b)
        {
          arrayOfByte = this.a[this.b];
          paramInt2 = (this.b << 5) + ((arrayOfByte[0] & 0xFF) - 1);
          i2 = zbdw.a(arrayOfByte, a(arrayOfByte, (arrayOfByte[0] & 0xFF) - 1)) + 1;
        }
        else
        {
          arrayOfByte = this.a[i3];
          i4 = paramInt2 & 0x1F;
          if (i4 >= (arrayOfByte[0] & 0xFF))
          {
            paramInt2 = (this.b << 5) + ((arrayOfByte[0] & 0xFF) - 1);
            i2 = zbdw.a(arrayOfByte, a(arrayOfByte, (arrayOfByte[0] & 0xFF) - 1));
          }
          else
          {
            i2 = zbdw.a(arrayOfByte, a(arrayOfByte, i4));
          }
        }
      }
      i2 = a(paramInt2);
    }
    if (paramBoolean) {
      return new za(this, i1, paramInt1, i2, paramInt2);
    }
    return new zb(this, i1, paramInt1, i2, paramInt2);
  }
  
  public zaiv a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramBoolean) {
      return new za(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    return new zb(this, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void l(int paramInt)
  {
    paramInt >>= 5;
    paramInt++;
    if (this.b + paramInt >= this.a.length)
    {
      byte[][] arrayOfByte = new byte[this.b + paramInt][];
      System.arraycopy(this.a, 0, arrayOfByte, 0, this.b + 1);
      this.a = arrayOfByte;
    }
  }
  
  private int f()
  {
    return Math.max((this.e >> 5) + 1, 10);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    if (paramInt2 < 0)
    {
      paramInt2 = -paramInt2;
      if (paramInt1 < 0)
      {
        i1 = this.b;
        paramInt1 = this.a[this.b][0] & 0xFF;
      }
      else
      {
        i1 = paramInt1 >> 5;
        paramInt1 = (paramInt1 & 0x1F) + 1;
      }
      if (paramInt1 >= paramInt2)
      {
        b(i1, paramInt1 - paramInt2, i1, paramInt1 - 1);
        return;
      }
      paramInt2 -= paramInt1;
      paramInt1--;
      for (i2 = i1 - 1; i2 > -1; i2--) {
        if ((this.a[i2][0] & 0xFF) >= paramInt2)
        {
          b(i2, (this.a[i2][0] & 0xFF) - paramInt2, i1, paramInt1);
          return;
        }
      }
      b(0, 0, i1, paramInt1);
    }
    else
    {
      if (paramInt1 < 0)
      {
        paramInt1 = 0;
        i1 = 0;
      }
      else
      {
        i1 = paramInt1 >> 5;
        paramInt1 &= 0x1F;
      }
      if ((this.a[i1][0] & 0xFF) - paramInt1 >= paramInt2)
      {
        b(i1, paramInt1, i1, paramInt1 + paramInt2 - 1);
        return;
      }
      paramInt2 -= (this.a[i1][0] & 0xFF) - paramInt1;
      for (i2 = i1 + 1; i2 <= this.b; i2++) {
        if ((this.a[i2][0] & 0xFF) >= paramInt2)
        {
          b(i1, paramInt1, i2, paramInt2 - 1);
          return;
        }
      }
      b(i1, paramInt1, this.b, (this.a[this.b][0] & 0xFF) - 1);
    }
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    byte[] arrayOfByte;
    int i3;
    if (paramInt1 == paramInt3)
    {
      paramInt4++;
      arrayOfByte = this.a[paramInt1];
      if ((paramInt2 == 0) && (paramInt4 == (arrayOfByte[0] & 0xFF)))
      {
        i1 = arrayOfByte[0] & 0xFF;
        System.arraycopy(this.a, paramInt3 + 1, this.a, paramInt1, this.b - paramInt3);
        this.b -= 1;
      }
      else
      {
        i1 = paramInt4 - paramInt2;
        i3 = a(arrayOfByte, paramInt2);
        int i4 = a(arrayOfByte, paramInt4);
        System.arraycopy(arrayOfByte, i4, arrayOfByte, i3, a(arrayOfByte, arrayOfByte[0] & 0xFF) - i4);
        b(arrayOfByte, paramInt4, i3 - i4);
        System.arraycopy(arrayOfByte, paramInt4 * 3 + 1, arrayOfByte, paramInt2 * 3 + 1, ((arrayOfByte[0] & 0xFF) - paramInt4) * 3);
        arrayOfByte[0] = ((byte)((arrayOfByte[0] & 0xFF) - i1));
      }
      this.c -= i1;
      return i1;
    }
    if (paramInt2 > 0)
    {
      arrayOfByte = this.a[paramInt1];
      i1 = (arrayOfByte[0] & 0xFF) - paramInt2;
      arrayOfByte[0] = ((byte)paramInt2);
      paramInt1++;
    }
    if (paramInt4 < (this.a[paramInt3][0] & 0xFF) - 1)
    {
      paramInt4++;
      arrayOfByte = this.a[paramInt3];
      i1 += paramInt4;
      i3 = a(arrayOfByte, paramInt4);
      System.arraycopy(arrayOfByte, i3, arrayOfByte, 97, a(arrayOfByte, arrayOfByte[0] & 0xFF) - i3);
      b(arrayOfByte, paramInt4, 97 - i3);
      System.arraycopy(arrayOfByte, paramInt4 * 3 + 1, arrayOfByte, 1, ((arrayOfByte[0] & 0xFF) - paramInt4) * 3);
      arrayOfByte[0] = ((byte)((arrayOfByte[0] & 0xFF) - paramInt4));
    }
    else
    {
      paramInt3++;
    }
    if (paramInt1 < paramInt3)
    {
      for (int i2 = paramInt1; i2 < paramInt3; i2++) {
        i1 += (this.a[i2][0] & 0xFF);
      }
      System.arraycopy(this.a, paramInt3, this.a, paramInt1, this.b - paramInt3 + 1);
      this.b -= paramInt3 - paramInt1;
    }
    this.c -= i1;
    return i1;
  }
  
  public int d(int paramInt1, int paramInt2)
  {
    if (this.b < 0) {
      return 0;
    }
    int i1;
    if (paramInt1 < 0)
    {
      i1 = 0;
      paramInt1 = 0;
    }
    else
    {
      i1 = paramInt1 >> 5;
      paramInt1 &= 0x1F;
    }
    int i2;
    if (paramInt2 < 0)
    {
      i2 = this.b;
      paramInt2 = (this.a[this.b][0] & 0xFF) - 1;
    }
    else
    {
      i2 = paramInt2 >> 5;
      paramInt2 &= 0x1F;
    }
    if ((i1 > i2) || ((i1 == i2) && (paramInt1 > paramInt2))) {
      return 0;
    }
    return b(i1, paramInt1, i2, paramInt2);
  }
  
  public int e(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (paramInt1 < 0)
    {
      if (paramInt2 < 0) {
        return this.c;
      }
      paramInt1 = 0;
    }
    else
    {
      i1 = (this.a[paramInt1][0] & 0xFF) - paramInt1;
      paramInt1 = (paramInt1 >> 5) + 1;
    }
    if (paramInt2 < 0)
    {
      if (paramInt1 == 0) {
        return this.c;
      }
      if (this.b < paramInt1) {
        return i1;
      }
      i1 += (this.a[this.b][0] & 0xFF);
      paramInt2 = this.b;
    }
    else
    {
      int i2 = paramInt2 & 0x1F;
      paramInt2 >>= 5;
      if (paramInt2 < paramInt1) {
        return i1 - ((this.a[paramInt2][0] & 0xFF) - i2) + 1;
      }
    }
    if (paramInt2 == paramInt1) {
      return i1;
    }
    while (paramInt1 < paramInt2)
    {
      i1 += (this.a[paramInt1][0] & 0xFF);
      paramInt1++;
    }
    return i1;
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = this.a[paramInt1];
    int i1;
    int i2;
    int i3;
    int i5;
    int i4;
    if (paramInt3 > 0)
    {
      i1 = localObject[0] & 0xFF;
      i2 = a((byte[])localObject, i1);
      i3 = 0;
      i5 = a((byte[])localObject, paramInt2);
      while (paramInt2 < i1)
      {
        paramInt2++;
        i4 = i5;
        i5 = a((byte[])localObject, paramInt2) + i3;
        int i7 = zbdw.b((byte[])localObject, i4, paramInt3);
        if (i7 > 0)
        {
          int i6 = zbdw.d((byte[])localObject, i4, i5);
          if (i5 - i6 < i7)
          {
            if (localObject.length - i2 >= i7 - (i5 - i6))
            {
              System.arraycopy(localObject, i5, localObject, i5 + i7 - (i5 - i6), i2 - i5);
            }
            else
            {
              byte[] arrayOfByte = new byte[localObject.length + 64];
              this.a[paramInt1] = arrayOfByte;
              System.arraycopy(localObject, 0, arrayOfByte, 0, i6);
              System.arraycopy(localObject, i5, arrayOfByte, i5 + i7, i2 - i5);
              localObject = arrayOfByte;
            }
            i3 += i7;
            i2 += i7;
            i5 += i7;
            zbdw.c((byte[])localObject, i2, localObject.length);
          }
          zbdw.a((byte[])localObject, i4, i6, i5, paramInt3, i7);
        }
        if (i3 > 0) {
          a((byte[])localObject, paramInt2, i5);
        }
      }
    }
    else if (paramInt3 < 0)
    {
      i1 = localObject[0] & 0xFF;
      i3 = a((byte[])localObject, paramInt2);
      while (paramInt2 < i1)
      {
        paramInt2++;
        i2 = i3;
        i3 = a((byte[])localObject, paramInt2);
        i5 = zbdw.b((byte[])localObject, i2, paramInt3);
        if (i5 < 0)
        {
          i4 = zbdw.d((byte[])localObject, i2, i3);
          zbdw.a((byte[])localObject, i2, i4, i3, paramInt3, i5);
        }
      }
    }
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    paramArrayOfByte[0] = ((byte)((paramArrayOfByte[0] & 0xFF) - paramInt1));
    System.arraycopy(paramArrayOfByte, paramInt1 * 3 + 1, paramArrayOfByte, 1, (paramArrayOfByte[0] & 0xFF) * 3);
    System.arraycopy(paramArrayOfByte, paramInt2, paramArrayOfByte, 97, paramInt3);
    b(paramArrayOfByte, 1, 97 - paramInt2);
  }
  
  public void f(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    int i1 = paramInt1 >> 5;
    paramInt1 &= 0x1F;
    if (i1 > this.b) {
      return;
    }
    int i4 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    byte[] arrayOfByte1;
    byte[] arrayOfByte4;
    int i6;
    int i3;
    int i2;
    Object localObject2;
    int i5;
    Object localObject1;
    Object localObject3;
    if (paramInt2 > 0)
    {
      if (paramInt1 >= (this.a[i1][0] & 0xFF))
      {
        i1++;
        if (i1 > this.b) {
          return;
        }
        paramInt1 = 0;
      }
      if (paramInt2 % 32 == 0)
      {
        if (paramInt1 > 0)
        {
          arrayOfByte1 = this.a[i1];
          i1++;
          this.b += 1;
          if (this.b == this.a.length)
          {
            byte[][] arrayOfByte2 = new byte[this.b + f()][];
            System.arraycopy(this.a, 0, arrayOfByte2, 0, i1);
            System.arraycopy(this.a, i1, arrayOfByte2, i1 + 1, this.b - i1);
            this.a = arrayOfByte2;
          }
          else
          {
            System.arraycopy(this.a, i1, this.a, i1 + 1, this.b - i1);
          }
          int i10 = a(arrayOfByte1, paramInt1);
          int i12 = a(arrayOfByte1, arrayOfByte1[0] & 0xFF) - i10;
          arrayOfByte4 = new byte[97 + i12];
          arrayOfByte4[0] = ((byte)((arrayOfByte1[0] & 0xFF) - paramInt1));
          System.arraycopy(arrayOfByte1, paramInt1 * 3 + 1, arrayOfByte4, 1, (arrayOfByte4[0] & 0xFF) * 3);
          System.arraycopy(arrayOfByte1, i10, arrayOfByte4, 97, i12);
          b(arrayOfByte4, 1, 97 - i10);
          this.a[i1] = arrayOfByte4;
          arrayOfByte1[0] = ((byte)paramInt1);
        }
        while (i1 <= this.b)
        {
          b(i1, 0, paramInt2);
          i1++;
        }
        return;
      }
      i9 = 64;
      arrayOfByte1 = this.a[i1];
      i6 = arrayOfByte1[0] & 0xFF;
      i3 = paramInt1;
      if (paramInt1 > 0)
      {
        i2 = m(zbdw.a(arrayOfByte1, 97)) + 32 - paramInt2;
        if (i2 < 0) {
          i4 = a(arrayOfByte1, paramInt1);
        } else {
          while (paramInt1 < i6)
          {
            i4 = a(arrayOfByte1, paramInt1);
            if (zbdw.a(arrayOfByte1, i4) >= i2) {
              break;
            }
            paramInt1++;
          }
        }
        if (paramInt1 < i6)
        {
          localObject2 = new byte[i4 + m(paramInt1, i4)];
          System.arraycopy(arrayOfByte1, 0, localObject2, 0, i4);
          localObject2[0] = ((byte)paramInt1);
          this.a[i1] = localObject2;
          if (paramInt1 > i3) {
            b(i1, i3, paramInt2);
          }
          i2 = m(zbdw.a(arrayOfByte1, i4) + paramInt2) + 32 - paramInt2;
          i3 = paramInt1;
          i5 = i4;
          while (paramInt1 < i6)
          {
            i4 = a(arrayOfByte1, paramInt1);
            if (zbdw.a(arrayOfByte1, i4) >= i2)
            {
              i7 = i6 - paramInt1;
              i2 += 32;
              localObject2 = new byte[i4 - i5 + 97 + i9];
              localObject2[0] = ((byte)(paramInt1 - i3));
              System.arraycopy(arrayOfByte1, i3 * 3 + 1, localObject2, 1, (localObject2[0] & 0xFF) * 3);
              System.arraycopy(arrayOfByte1, i5, localObject2, 97, i4 - i5);
              b((byte[])localObject2, 1, 97 - i5);
              this.b += 1;
              i1++;
              if (this.a.length == this.b)
              {
                byte[][] arrayOfByte3 = new byte[this.b + f()][];
                System.arraycopy(this.a, 0, arrayOfByte3, 0, i1);
                System.arraycopy(this.a, i1, arrayOfByte3, i1 + 1, this.b - i1);
                this.a = arrayOfByte3;
              }
              else
              {
                System.arraycopy(this.a, i1, this.a, i1 + 1, this.b - i1);
              }
              this.a[i1] = localObject2;
              b(i1, 0, paramInt2);
              break;
            }
            paramInt1++;
          }
          if (paramInt1 == i6)
          {
            paramInt1 = i3;
            i7 = i6 - paramInt1;
            i4 = i5;
          }
          i8 = a(arrayOfByte1, i6) - i4;
        }
        else
        {
          b(i1, i3, paramInt2);
          i2 += 32;
        }
      }
      else
      {
        i2 = m(zbdw.a(arrayOfByte1, 97) + paramInt2) + 32 - paramInt2;
        for (paramInt1 = 1; paramInt1 < i6; paramInt1++)
        {
          i4 = a(arrayOfByte1, paramInt1);
          if (zbdw.a(arrayOfByte1, i4) >= i2)
          {
            i7 = i6 - paramInt1;
            i2 += 32;
            localObject2 = new byte[i4 + i9];
            System.arraycopy(arrayOfByte1, 0, localObject2, 0, i4);
            localObject2[0] = ((byte)paramInt1);
            this.a[i1] = localObject2;
            b(i1, 0, paramInt2);
            break;
          }
        }
        if (paramInt1 == i6)
        {
          paramInt1 = 0;
          i4 = 97;
          i7 = i6;
          System.arraycopy(this.a, i1 + 1, this.a, i1, this.b - i1);
          this.b -= 1;
          i1--;
        }
        i8 = a(arrayOfByte1, i6) - i4;
      }
    }
    else
    {
      if (i1 == this.b)
      {
        arrayOfByte1 = this.a[i1];
        i2 = zbdw.a(arrayOfByte1, 97);
        if (paramInt1 == 0) {
          i2 += paramInt2;
        }
        i2 = m(i2) + 32 - paramInt2;
        i6 = arrayOfByte1[0] & 0xFF;
        i3 = paramInt1;
        paramInt1++;
        while (paramInt1 < i6)
        {
          i4 = a(arrayOfByte1, paramInt1);
          if (zbdw.a(arrayOfByte1, i4) >= i2) {
            break;
          }
          paramInt1++;
        }
        if (paramInt1 < i6)
        {
          this.b += 1;
          if (this.b == this.a.length)
          {
            localObject2 = new byte[i1 + f()][];
            System.arraycopy(this.a, 0, localObject2, 0, i1);
            this.a = ((byte[][])localObject2);
          }
          localObject2 = new byte[a(arrayOfByte1, i6)];
          System.arraycopy(arrayOfByte1, 0, localObject2, 0, localObject2.length);
          this.a[this.b] = localObject2;
          a((byte[])localObject2, paramInt1, i4, localObject2.length - i4);
          b(this.b, 0, paramInt2);
          arrayOfByte1[0] = ((byte)paramInt1);
        }
        b(i1, i3, paramInt2);
        return;
      }
      if ((paramInt1 == 0) && (i1 > 0))
      {
        localObject1 = this.a[(i1 - 1)];
        arrayOfByte1 = this.a[i1];
        i2 = zbdw.a(arrayOfByte1, 97) + paramInt2;
        if (m(zbdw.a((byte[])localObject1, 97)) + 32 > i2)
        {
          i1--;
          paramInt1 = a((byte[])localObject1, localObject1[0] & 0xFF);
        }
      }
      if (paramInt2 % 32 == 0)
      {
        localObject1 = this.a[i1];
        arrayOfByte1 = this.a[(i1 + 1)];
        i2 = zbdw.a((byte[])localObject1, 97);
        if (paramInt1 == 0) {
          i2 += paramInt2;
        }
        if (m(i2) + 32 > zbdw.a(arrayOfByte1, 97) + paramInt2)
        {
          int i11 = a((byte[])localObject1, localObject1[0] & 0xFF);
          int i13 = a(arrayOfByte1, arrayOfByte1[0] & 0xFF);
          if (localObject1.length - i11 < i13)
          {
            arrayOfByte4 = new byte[i11 + i13 - 97];
            System.arraycopy(localObject1, 0, arrayOfByte4, 0, i11);
            this.a[i1] = arrayOfByte4;
            localObject1 = arrayOfByte4;
          }
          System.arraycopy(arrayOfByte1, 1, localObject1, (localObject1[0] & 0xFF) * 3 + 1, (arrayOfByte1[0] & 0xFF) * 3);
          System.arraycopy(arrayOfByte1, 97, localObject1, i11, i13 - 97);
          localObject1[0] = ((byte)((localObject1[0] & 0xFF) + (arrayOfByte1[0] & 0xFF)));
          b((byte[])localObject1, (localObject1[0] & 0xFF) - (arrayOfByte1[0] & 0xFF) + 1, i11 - 97);
          this.b -= 1;
          if (this.b > i1) {
            System.arraycopy(this.a, i1 + 2, this.a, i1 + 1, this.b - i1);
          }
          this.a[(this.b + 1)] = null;
        }
        b(i1, paramInt1, paramInt2);
        i1++;
        while (i1 <= this.b)
        {
          b(i1, 0, paramInt2);
          i1++;
        }
        return;
      }
      i9 = 0;
      localObject1 = this.a[i1];
      i2 = zbdw.a((byte[])localObject1, 97);
      if (paramInt1 == 0) {
        i2 += paramInt2;
      }
      i2 = m(i2) + 32 - paramInt2;
      for (;;)
      {
        arrayOfByte1 = this.a[(i1 + 1)];
        i6 = arrayOfByte1[0] & 0xFF;
        i3 = paramInt1;
        for (paramInt1 = 0; paramInt1 < i6; paramInt1++)
        {
          i4 = a(arrayOfByte1, paramInt1);
          if (zbdw.a(arrayOfByte1, i4) >= i2) {
            break;
          }
        }
        if (paramInt1 <= 0) {
          break;
        }
        i5 = a((byte[])localObject1, localObject1[0] & 0xFF);
        if (paramInt1 == i6)
        {
          i4 = a(arrayOfByte1, paramInt1);
          i7 = 0;
          i8 = 0;
        }
        else
        {
          i7 = i6 - paramInt1;
          i8 = a(arrayOfByte1, i6) - i4;
        }
        if (localObject1.length < i5 + i4 - 97)
        {
          localObject3 = new byte[i5 + i4 - 97];
          System.arraycopy(localObject1, 0, localObject3, 0, i5);
          localObject1 = localObject3;
          this.a[i1] = localObject3;
        }
        System.arraycopy(arrayOfByte1, 1, localObject1, (localObject1[0] & 0xFF) * 3 + 1, paramInt1 * 3);
        System.arraycopy(arrayOfByte1, 97, localObject1, i5, i4 - 97);
        localObject1[0] = ((byte)((localObject1[0] & 0xFF) + paramInt1));
        b((byte[])localObject1, (localObject1[0] & 0xFF) - paramInt1 + 1, i5 - 97);
        b(i1, i3, paramInt2);
        this.b -= 1;
        if (i1 == this.b)
        {
          if (i7 > 0)
          {
            this.b += 1;
            a(arrayOfByte1, paramInt1, i4, i8);
            b(this.b, 0, paramInt2);
          }
          return;
        }
        System.arraycopy(this.a, i1 + 2, this.a, i1 + 1, this.b - i1);
        this.a[(this.b + 1)] = null;
        if (i7 > 0) {
          break label2105;
        }
        paramInt1 = localObject1[0] & 0xFF;
      }
      b(i1, i3, paramInt2);
      i7 = i6;
      i8 = a(arrayOfByte1, i6) - 97;
      i2 = m(zbdw.a(arrayOfByte1, 97) + paramInt2) - paramInt2;
      this.b -= 1;
      if (i1 < this.b)
      {
        System.arraycopy(this.a, i1 + 2, this.a, i1 + 1, this.b - i1);
        this.a[(this.b + 1)] = null;
      }
      else
      {
        this.b += 1;
      }
      label2105:
      i2 += 32;
    }
    i1++;
    while (i1 <= this.b)
    {
      localObject1 = arrayOfByte1;
      i3 = paramInt1;
      i5 = i4;
      arrayOfByte1 = this.a[i1];
      i6 = arrayOfByte1[0] & 0xFF;
      for (paramInt1 = 0; paramInt1 < i6; paramInt1++)
      {
        i4 = a(arrayOfByte1, paramInt1);
        if (zbdw.a(arrayOfByte1, i4) >= i2) {
          break;
        }
      }
      if (paramInt1 == 0)
      {
        if (i7 == (localObject1[0] & 0xFF))
        {
          this.a[i1] = localObject1;
          b(i1, 0, paramInt2);
        }
        else if (i7 > 0)
        {
          this.a[i1] = localObject1;
          a((byte[])localObject1, i3, i5, i8);
          b(i1, 0, paramInt2);
        }
        i2 = m(zbdw.a(arrayOfByte1, 97) + paramInt2) + 32 - paramInt2;
        for (paramInt1 = 1; paramInt1 < i6; paramInt1++)
        {
          i4 = a(arrayOfByte1, paramInt1);
          if (zbdw.a(arrayOfByte1, i4) >= i2)
          {
            if (i7 > 0)
            {
              this.b += 1;
              i1++;
              if (this.a.length == this.b)
              {
                localObject3 = new byte[this.b + f()][];
                System.arraycopy(this.a, 0, localObject3, 0, i1);
                System.arraycopy(this.a, i1, localObject3, i1 + 1, this.b - i1);
                this.a = ((byte[][])localObject3);
              }
              else
              {
                System.arraycopy(this.a, i1, this.a, i1 + 1, this.b - i1);
              }
            }
            localObject3 = new byte[i4 + i9];
            this.a[i1] = localObject3;
            localObject3[0] = ((byte)paramInt1);
            System.arraycopy(arrayOfByte1, 1, localObject3, 1, paramInt1 * 3);
            System.arraycopy(arrayOfByte1, 97, localObject3, 97, i4 - 97);
            b(i1, 0, paramInt2);
            i7 = i6 - paramInt1;
            i2 += 32;
            i8 = a(arrayOfByte1, i6) - i4;
            break;
          }
        }
        if (paramInt1 == i6)
        {
          if (i7 == 0)
          {
            System.arraycopy(this.a, i1 + 1, this.a, i1, this.b - i1);
            this.b -= 1;
            i1--;
          }
          paramInt1 = 0;
          i7 = i6;
          i4 = 97;
          i8 = a(arrayOfByte1, i6) - i4;
        }
      }
      else
      {
        if (paramInt1 == i6)
        {
          i4 = a(arrayOfByte1, i6);
          if (i7 == 0)
          {
            this.a[i1] = arrayOfByte1;
            b(i1, 0, paramInt2);
            i2 += 32;
            break label2797;
          }
        }
        localObject3 = new byte[i8 + i4 + i9];
        if (i7 > 0)
        {
          localObject3[0] = ((byte)i7);
          System.arraycopy(localObject1, i3 * 3 + 1, localObject3, 1, i7 * 3);
          System.arraycopy(localObject1, i5, localObject3, 97, i8);
          if (i5 > 97) {
            b((byte[])localObject3, 1, 97 - i5);
          }
        }
        localObject3[0] = ((byte)((localObject3[0] & 0xFF) + paramInt1));
        System.arraycopy(arrayOfByte1, 1, localObject3, i7 * 3 + 1, paramInt1 * 3);
        System.arraycopy(arrayOfByte1, 97, localObject3, 97 + i8, i4 - 97);
        if (i7 > 0) {
          b((byte[])localObject3, i7 + 1, i8);
        }
        this.a[i1] = localObject3;
        b(i1, 0, paramInt2);
        i2 += 32;
        if (i6 == paramInt1)
        {
          i7 = 0;
          i8 = 0;
        }
        else
        {
          i7 = i6 - paramInt1;
          i8 = a(arrayOfByte1, i6) - i4;
        }
      }
      label2797:
      i1++;
    }
    if (i7 > 0)
    {
      if (paramInt1 > 0) {
        a(arrayOfByte1, paramInt1, i4, i8);
      }
      if (i1 == this.a.length)
      {
        localObject3 = new byte[i1 + f()][];
        System.arraycopy(this.a, 0, localObject3, 0, i1);
        this.a = ((byte[][])localObject3);
      }
      this.a[i1] = arrayOfByte1;
      this.b = i1;
      b(i1, 0, paramInt2);
    }
  }
  
  public void e(int paramInt)
  {
    if (paramInt > 0) {
      this.a = new byte[Math.max((paramInt >> 5) + 1, 10)][];
    }
    this.b = -1;
    this.c = 0;
  }
  
  public boolean g(int paramInt1, int paramInt2)
  {
    if (paramInt1 < -1) {
      paramInt1 = (int)(this.a.length / 100.0F * (-paramInt1 - 1));
    } else if (paramInt1 == -1) {
      paramInt1 = f();
    }
    if (this.a.length - this.b - 1 <= paramInt1) {
      return false;
    }
    if (paramInt2 < 0) {
      paramInt2 = f();
    }
    if (this.a.length - this.b - 1 <= paramInt2) {
      return false;
    }
    byte[][] arrayOfByte = new byte[this.b + 1 + paramInt2][];
    System.arraycopy(this.a, 0, arrayOfByte, 0, this.b + 1);
    this.a = arrayOfByte;
    return true;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    float f1 = 0.0F;
    if (paramInt3 > 0)
    {
      paramInt3 = zbdw.q(paramInt3);
    }
    else if (paramInt3 == -1)
    {
      paramInt3 = this.g;
    }
    else if (paramInt3 < -1)
    {
      i1 = 1;
      f1 = 1.0F + (paramInt3 + 1) / 100.0F;
    }
    if (paramInt4 < 0) {
      paramInt4 = this.g;
    } else {
      paramInt4 = zbdw.q(paramInt4);
    }
    if ((i1 == 0) && (paramInt3 < paramInt4)) {
      paramInt4 = paramInt3;
    }
    for (int i8 = 0; i8 <= this.b; i8++)
    {
      byte[] arrayOfByte1 = this.a[i8];
      int i5 = arrayOfByte1[0] & 0xFF;
      int i3 = 0;
      int i7 = 97;
      int i2 = 0;
      for (int i9 = 0; i9 < i5; i9++)
      {
        int i6 = i7;
        i7 = a(arrayOfByte1, i9 + 1);
        int i4 = zbdw.d(arrayOfByte1, i6, i7) - i6;
        if (i3 != 0)
        {
          System.arraycopy(arrayOfByte1, i6, arrayOfByte1, i2, i4);
          a(arrayOfByte1, i9, i2);
          i2 += i4 + paramInt4;
        }
        else if (i1 != 0)
        {
          if (i4 < (int)((i7 - i6) * f1))
          {
            i2 = i6 + i4 + paramInt4;
            i3 = 1;
          }
        }
        else if (i7 - i6 - i4 > paramInt3)
        {
          i2 = i6 + i4 + paramInt4;
          i3 = 1;
        }
      }
      if (i3 != 0)
      {
        a(arrayOfByte1, i5, i2);
        byte[] arrayOfByte2 = new byte[i2];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i2);
        this.a[i8] = arrayOfByte2;
      }
    }
    g(paramInt1, paramInt2);
  }
  
  public zahb a(Cells paramCells, RowCollection paramRowCollection, int paramInt)
  {
    switch (paramInt)
    {
    case 16: 
    case 17: 
    case 19: 
      return new zht(paramCells, paramRowCollection, paramInt);
    }
    return new zhs(paramCells, paramRowCollection);
  }
  
  private class za
    extends zk
  {
    private int g;
    private int h;
    private int i;
    private int j;
    
    za(zbdl paramzbdl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super(paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramInt2 > -1)
      {
        this.g = (paramInt2 >> 5);
        this.h = (paramInt2 & 0x1F);
      }
      else
      {
        this.g = 0;
      }
      b();
    }
    
    public void b()
    {
      if (this.e > -1)
      {
        this.i = (this.e >> 5);
        this.j = ((this.e & 0x1F) + 1);
      }
      else
      {
        this.i = -1;
      }
    }
    
    public int a()
    {
      if (this.i > this.g)
      {
        this.j -= 1;
        if (this.j < 0)
        {
          this.i -= 1;
          this.j = ((zbdl.a((zbdl)this.c)[this.i][0] & 0xFF) - 1);
        }
        return this.i << 5 | this.j;
      }
      if ((this.i == this.g) && (this.j > this.h))
      {
        this.j -= 1;
        return this.i << 5 | this.j;
      }
      return this.d < 0 ? this.d : -this.d - 1;
    }
    
    public void b(int paramInt)
    {
      if (paramInt < this.a)
      {
        this.i = this.g;
        this.j = this.h;
      }
      else if (paramInt == this.a)
      {
        this.i = this.g;
        this.j = (this.h + 1);
      }
      else if ((this.b > -1) && (paramInt > this.b))
      {
        b();
      }
      else
      {
        int k = this.c.a(paramInt, this.d, this.e);
        if (k < 0)
        {
          k = -k - 1;
          this.i = (k >> 5);
          this.j = (k & 0x1F);
        }
        else
        {
          this.i = (k >> 5);
          this.j = ((k & 0x1F) + 1);
        }
      }
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      super.a(paramInt1, paramInt2);
      this.g = (this.d >> 5);
      this.h = (this.d & 0x1F);
    }
    
    protected void a(int paramInt)
    {
      if (paramInt < 0) {
        paramInt = -paramInt - 1;
      }
      this.i = (paramInt >> 5);
      this.j = (paramInt & 0x1F);
    }
  }
  
  private class zb
    extends zk
  {
    private int g;
    private int h;
    private int i;
    private int j;
    
    zb(zbdl paramzbdl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super(paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramInt4 > -1)
      {
        this.g = (paramInt4 >> 5);
        this.h = (paramInt4 & 0x1F);
      }
      else
      {
        this.g = -1;
      }
      b();
    }
    
    public void b()
    {
      if (this.d > -1)
      {
        this.i = (this.d >> 5);
        this.j = ((this.d & 0x1F) - 1);
      }
      else
      {
        this.i = 0;
      }
    }
    
    public int a()
    {
      if (this.i < this.g)
      {
        this.j += 1;
        if (this.j >= (zbdl.a((zbdl)this.c)[this.i][0] & 0xFF))
        {
          this.i += 1;
          this.j = 0;
        }
        return this.i << 5 | this.j;
      }
      if ((this.i == this.g) && (this.j < this.h))
      {
        this.j += 1;
        return this.i << 5 | this.j;
      }
      return this.e < 0 ? this.e : -this.e - 2;
    }
    
    public void b(int paramInt)
    {
      if (paramInt <= this.a)
      {
        b();
      }
      else if (paramInt == this.b)
      {
        this.i = this.g;
        this.j = (this.h - 1);
      }
      else if ((this.b > -1) && (paramInt > this.b))
      {
        this.i = this.g;
        this.j = this.h;
      }
      else
      {
        int k = this.c.a(paramInt, this.d, this.e);
        if (k < 0) {
          k = -k - 1;
        }
        this.i = (k >> 5);
        this.j = ((k & 0x1F) - 1);
      }
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      super.a(paramInt1, paramInt2);
      if (this.e > -1)
      {
        this.g = (this.e >> 5);
        this.h = (this.e & 0x1F);
      }
      else
      {
        this.g = -1;
      }
    }
    
    protected void a(int paramInt)
    {
      if (paramInt < 0) {
        paramInt = -paramInt - 2;
      }
      this.i = (paramInt >> 5);
      this.j = (paramInt & 0x1F);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */