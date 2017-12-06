package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.a.zd;

class zava
{
  private zd a = a();
  private Color[] b;
  
  static zd a()
  {
    zd localzd = new zd();
    localzd.b(Integer.valueOf(0), Integer.valueOf(0));
    localzd.b(Integer.valueOf(1), Integer.valueOf(16777215));
    localzd.b(Integer.valueOf(2), Integer.valueOf(255));
    localzd.b(Integer.valueOf(3), Integer.valueOf(65280));
    localzd.b(Integer.valueOf(4), Integer.valueOf(16711680));
    localzd.b(Integer.valueOf(5), Integer.valueOf(65535));
    localzd.b(Integer.valueOf(6), Integer.valueOf(16711935));
    localzd.b(Integer.valueOf(7), Integer.valueOf(16776960));
    localzd.b(Integer.valueOf(8), Integer.valueOf(0));
    localzd.b(Integer.valueOf(9), Integer.valueOf(16777215));
    localzd.b(Integer.valueOf(10), Integer.valueOf(255));
    localzd.b(Integer.valueOf(11), Integer.valueOf(65280));
    localzd.b(Integer.valueOf(12), Integer.valueOf(16711680));
    localzd.b(Integer.valueOf(13), Integer.valueOf(65535));
    localzd.b(Integer.valueOf(14), Integer.valueOf(16711935));
    localzd.b(Integer.valueOf(15), Integer.valueOf(16776960));
    localzd.b(Integer.valueOf(16), Integer.valueOf(128));
    localzd.b(Integer.valueOf(17), Integer.valueOf(32768));
    localzd.b(Integer.valueOf(18), Integer.valueOf(8388608));
    localzd.b(Integer.valueOf(19), Integer.valueOf(32896));
    localzd.b(Integer.valueOf(20), Integer.valueOf(8388736));
    localzd.b(Integer.valueOf(21), Integer.valueOf(8421376));
    localzd.b(Integer.valueOf(22), Integer.valueOf(12632256));
    localzd.b(Integer.valueOf(23), Integer.valueOf(8421504));
    localzd.b(Integer.valueOf(24), Integer.valueOf(16751001));
    localzd.b(Integer.valueOf(25), Integer.valueOf(6697881));
    localzd.b(Integer.valueOf(26), Integer.valueOf(13434879));
    localzd.b(Integer.valueOf(27), Integer.valueOf(16777164));
    localzd.b(Integer.valueOf(28), Integer.valueOf(6684774));
    localzd.b(Integer.valueOf(29), Integer.valueOf(8421631));
    localzd.b(Integer.valueOf(30), Integer.valueOf(13395456));
    localzd.b(Integer.valueOf(31), Integer.valueOf(16764108));
    localzd.b(Integer.valueOf(32), Integer.valueOf(8388608));
    localzd.b(Integer.valueOf(33), Integer.valueOf(16711935));
    localzd.b(Integer.valueOf(34), Integer.valueOf(65535));
    localzd.b(Integer.valueOf(35), Integer.valueOf(16776960));
    localzd.b(Integer.valueOf(36), Integer.valueOf(8388736));
    localzd.b(Integer.valueOf(37), Integer.valueOf(128));
    localzd.b(Integer.valueOf(38), Integer.valueOf(8421376));
    localzd.b(Integer.valueOf(39), Integer.valueOf(16711680));
    localzd.b(Integer.valueOf(40), Integer.valueOf(16763904));
    localzd.b(Integer.valueOf(41), Integer.valueOf(16777164));
    localzd.b(Integer.valueOf(42), Integer.valueOf(13434828));
    localzd.b(Integer.valueOf(43), Integer.valueOf(10092543));
    localzd.b(Integer.valueOf(44), Integer.valueOf(16764057));
    localzd.b(Integer.valueOf(45), Integer.valueOf(13408767));
    localzd.b(Integer.valueOf(46), Integer.valueOf(16751052));
    localzd.b(Integer.valueOf(47), Integer.valueOf(10079487));
    localzd.b(Integer.valueOf(48), Integer.valueOf(16737843));
    localzd.b(Integer.valueOf(49), Integer.valueOf(13421619));
    localzd.b(Integer.valueOf(50), Integer.valueOf(52377));
    localzd.b(Integer.valueOf(51), Integer.valueOf(52479));
    localzd.b(Integer.valueOf(52), Integer.valueOf(39423));
    localzd.b(Integer.valueOf(53), Integer.valueOf(26367));
    localzd.b(Integer.valueOf(54), Integer.valueOf(10053222));
    localzd.b(Integer.valueOf(55), Integer.valueOf(9868950));
    localzd.b(Integer.valueOf(56), Integer.valueOf(6697728));
    localzd.b(Integer.valueOf(57), Integer.valueOf(6723891));
    localzd.b(Integer.valueOf(58), Integer.valueOf(13056));
    localzd.b(Integer.valueOf(59), Integer.valueOf(13107));
    localzd.b(Integer.valueOf(60), Integer.valueOf(13209));
    localzd.b(Integer.valueOf(61), Integer.valueOf(6697881));
    localzd.b(Integer.valueOf(62), Integer.valueOf(10040115));
    localzd.b(Integer.valueOf(63), Integer.valueOf(3355443));
    return localzd;
  }
  
  zd b()
  {
    return this.a;
  }
  
  private int f(int paramInt)
  {
    int i = 0;
    for (int j = 63; j >= 8; j--)
    {
      i = ((Integer)this.a.d(Integer.valueOf(j))).intValue();
      if (paramInt == i) {
        return j;
      }
    }
    for (j = 0; j < 8; j++)
    {
      i = ((Integer)this.a.d(Integer.valueOf(j))).intValue();
      if (paramInt == i) {
        return j;
      }
    }
    return -1;
  }
  
  int a(Color paramColor)
  {
    int i = (zh.b(paramColor) & 0xFF) + ((zh.c(paramColor) & 0xFF) << 8) + ((zh.d(paramColor) & 0xFF) << 16);
    return f(i);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.a.b(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
  }
  
  void a(Color paramColor, int paramInt)
  {
    int i = (zh.b(paramColor) & 0xFF) + ((zh.c(paramColor) & 0xFF) << 8) + ((zh.d(paramColor) & 0xFF) << 16);
    a(i, paramInt);
    if (this.b != null) {
      this.b[(paramInt - 8)] = paramColor;
    }
  }
  
  void a(zava paramzava)
  {
    for (int i = 8; i < 64; i++) {
      this.a.b(Integer.valueOf(i), paramzava.a.d(Integer.valueOf(i)));
    }
  }
  
  Color a(int paramInt)
  {
    if (paramInt >= this.a.b()) {
      return Color.getEmpty();
    }
    int i = ((Integer)this.a.d(Integer.valueOf(paramInt))).intValue();
    int j = i & 0xFF;
    int k = (i & 0xFF00) >> 8;
    int m = (i & 0xFF0000) >> 16;
    return Color.fromArgb(j, k, m);
  }
  
  int b(int paramInt)
  {
    int i = ((Integer)this.a.d(Integer.valueOf(paramInt))).intValue();
    int j = i & 0xFF;
    int k = (i & 0xFF0000) >> 16;
    i = (int)(i & 0xFF00FF00);
    i |= j << 16;
    i |= k;
    return i;
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = -1;
    int j = Integer.MAX_VALUE;
    int k = 0;
    int m;
    int i1;
    int i2;
    int i3;
    for (int n = 8; n <= 63; n++)
    {
      m = ((Integer)this.a.d(Integer.valueOf(n))).intValue();
      i1 = m & 0xFF;
      i2 = (m & 0xFF00) >> 8;
      i3 = (m & 0xFF0000) >> 16;
      k = (paramInt1 - i1) * (paramInt1 - i1) + (paramInt3 - i3) * (paramInt3 - i3) + (paramInt2 - i2) * (paramInt2 - i2);
      if (j > k)
      {
        j = k;
        i = n;
      }
    }
    for (n = 0; n < 8; n++)
    {
      m = ((Integer)this.a.d(Integer.valueOf(n))).intValue();
      i1 = m & 0xFF;
      i2 = (m & 0xFF00) >> 8;
      i3 = (m & 0xFF0000) >> 16;
      k = (paramInt1 - i1) * (paramInt1 - i1) + (paramInt3 - i3) * (paramInt3 - i3) + (paramInt2 - i2) * (paramInt2 - i2);
      if (j > k)
      {
        j = k;
        i = n;
      }
    }
    return i;
  }
  
  int c(int paramInt)
  {
    int i = paramInt & 0xFF;
    int j = (paramInt & 0xFF00) >> 8;
    int k = (paramInt & 0xFF0000) >> 16;
    int m = -1;
    int n = Integer.MAX_VALUE;
    int i1 = 0;
    int i2;
    int i4;
    int i5;
    int i6;
    for (int i3 = 8; i3 <= 63; i3++)
    {
      i2 = ((Integer)this.a.d(Integer.valueOf(i3))).intValue();
      i4 = i2 & 0xFF;
      i5 = (i2 & 0xFF00) >> 8;
      i6 = (i2 & 0xFF0000) >> 16;
      i1 = (i - i4) * (i - i4) + (k - i6) * (k - i6) + (j - i5) * (j - i5);
      if (n > i1)
      {
        n = i1;
        m = i3;
      }
    }
    for (i3 = 0; i3 < 8; i3++)
    {
      i2 = ((Integer)this.a.d(Integer.valueOf(i3))).intValue();
      i4 = i2 & 0xFF;
      i5 = (i2 & 0xFF00) >> 8;
      i6 = (i2 & 0xFF0000) >> 16;
      i1 = (i - i4) * (i - i4) + (k - i6) * (k - i6) + (j - i5) * (j - i5);
      if (n > i1)
      {
        n = i1;
        m = i3;
      }
    }
    return m;
  }
  
  static Color d(int paramInt)
  {
    int i = paramInt & 0xFF;
    int j = (paramInt & 0xFF00) >> 8;
    int k = (paramInt & 0xFF0000) >> 16;
    return Color.fromArgb(i, j, k);
  }
  
  Color e(int paramInt)
  {
    return a(paramInt, this.a);
  }
  
  static Color a(int paramInt, zd paramzd)
  {
    switch (paramInt)
    {
    case 64: 
    case 65: 
    case 67: 
    case 77: 
    case 78: 
    case 79: 
    case 81: 
    case 32767: 
      return Color.getEmpty();
    case 80: 
      return Color.fromArgb(255, 255, 225);
    }
    if (paramInt > paramzd.b()) {
      return Color.getEmpty();
    }
    int i = ((Integer)paramzd.d(Integer.valueOf(paramInt))).intValue();
    return d(i);
  }
  
  Color[] c()
  {
    if (this.b == null)
    {
      this.b = new Color[56];
      for (int i = 0; i < 56; i++) {
        this.b[i] = a(i + 8);
      }
    }
    return this.b;
  }
  
  boolean b(Color paramColor)
  {
    int i = (zh.b(paramColor) & 0xFF) + ((zh.c(paramColor) & 0xFF) << 8) + ((zh.d(paramColor) & 0xFF) << 16);
    for (int j = 0; j < this.a.b(); j++)
    {
      int k = ((Integer)this.a.d(Integer.valueOf(j))).intValue();
      if (k == i) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zava.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */