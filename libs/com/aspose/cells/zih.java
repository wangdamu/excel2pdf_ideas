package com.aspose.cells;

class zih
  extends zs
{
  private zs d;
  private zs e;
  private zs f;
  private zl g;
  private int h;
  private int i;
  private double j;
  
  public zih(zig paramzig, String paramString)
  {
    super(paramzig);
    if (paramString == null) {
      paramString = paramzig.b();
    }
    char[] arrayOfChar = paramString.toCharArray();
    b(arrayOfChar, 0, arrayOfChar.length);
  }
  
  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder1 = new StringBuilder(paramInt2 - paramInt1);
    super.d(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1);
    paramArrayOfChar = com.aspose.cells.b.a.zs.a(localStringBuilder1).toCharArray();
    paramInt1 = 0;
    paramInt2 = paramArrayOfChar.length;
    localStringBuilder1.setLength(0);
    int k = -1;
    int m = -1;
    int n = -1;
    int i1 = 0;
    int i2 = 0;
    while (paramInt1 < paramInt2) {
      switch (paramArrayOfChar[paramInt1])
      {
      case '#': 
      case '0': 
        if ((n > 0) && (n < paramInt1))
        {
          k = n;
          i1 = 0;
        }
        paramInt1++;
        n = paramInt1;
        break;
      case '?': 
        if ((n > 0) && (n < paramInt1)) {
          k = n;
        }
        i1 = 1;
        paramInt1++;
        n = paramInt1;
        break;
      case '/': 
        m = paramInt1;
        if (k < 0)
        {
          i1 = 0;
          paramInt1 = paramInt2;
        }
        else if (i1 != 0)
        {
          i2 = 1;
          paramInt1 = paramInt2;
        }
        else
        {
          paramInt1++;
          n = -1;
          i3 = 1;
          while (paramInt1 < paramInt2) {
            switch (paramArrayOfChar[paramInt1])
            {
            case '#': 
            case '0': 
              paramInt1++;
              n = paramInt1;
              if (i2 == 0) {
                i3 = 0;
              }
              break;
            case '?': 
              i2 = 1;
              paramInt1++;
              n = paramInt1;
              break;
            default: 
              if (n > -1)
              {
                if ((paramArrayOfChar[paramInt1] > '0') && (paramArrayOfChar[paramInt1] <= '9'))
                {
                  paramInt1++;
                  n = paramInt1;
                }
                else
                {
                  paramInt1 = paramInt2;
                }
              }
              else {
                paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2);
              }
              break;
            }
          }
          if ((i2 != 0) && (i3 != 0)) {
            i1 = 1;
          }
        }
        break;
      default: 
        paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2);
      }
    }
    int i3 = 1;
    int i4 = 0;
    StringBuilder localStringBuilder2 = null;
    int i5 = 1;
    n = -1;
    paramInt1 = 0;
    zmu localzmu1;
    if (k > -1)
    {
      localStringBuilder1.setLength(0);
      while (paramInt1 < k) {
        switch (paramArrayOfChar[paramInt1])
        {
        case '0': 
          if ((n > -1) && (n < paramInt1)) {
            i3 = 0;
          }
          i4 = 1;
          localStringBuilder1.append('0');
          n = paramInt1 + 1;
          break;
        case '#': 
          if ((n > -1) && (n < paramInt1)) {
            i3 = 0;
          }
          localStringBuilder1.append(i4 != 0 ? '0' : '#');
          n = paramInt1 + 1;
          break;
        case '?': 
          localStringBuilder1.append('?');
          i3 = 0;
          n = paramInt1 + 1;
          break;
        case '[': 
          paramInt1 = this.a.a(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1, false);
          break;
        case '*': 
        case '_': 
          i3 = 0;
          localStringBuilder1.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
          if (paramInt1 < paramInt2)
          {
            localStringBuilder1.append(paramArrayOfChar[paramInt1]);
            paramInt1++;
          }
          break;
        default: 
          paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1);
          continue;
          paramInt1++;
        }
      }
      if (i2 != 0)
      {
        localStringBuilder2 = new StringBuilder(paramArrayOfChar.length);
        localStringBuilder2.append(com.aspose.cells.b.a.zs.a(localStringBuilder1));
        if (i4 == 0) {
          localStringBuilder2.setCharAt(k - 1, '0');
        }
        i5 = i3;
      }
      else if (i4 == 0)
      {
        localStringBuilder1.setCharAt(k - 1, '0');
      }
      if (i3 != 0)
      {
        this.d = new zbph(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder1));
      }
      else
      {
        localzmu1 = new zmu(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder1));
        this.d = localzmu1;
      }
    }
    i3 = 1;
    i4 = 0;
    localStringBuilder1.setLength(0);
    n = -1;
    while (paramInt1 < m) {
      switch (paramArrayOfChar[paramInt1])
      {
      case '0': 
        i4 = 1;
        localStringBuilder1.append('0');
        if (i1 != 0)
        {
          i5 = 0;
          localStringBuilder2.append("_0");
        }
        break;
      case '#': 
        if (i4 != 0) {
          localStringBuilder1.append('0');
        } else {
          n = -localStringBuilder1.length() - 2;
        }
        break;
      case '?': 
        localStringBuilder1.append('?');
        i3 = 0;
        if (i1 != 0) {
          localStringBuilder2.append(' ');
        }
        n = localStringBuilder1.length();
        break;
      case '[': 
        paramInt1 = this.a.a(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1, false);
        break;
      case '*': 
      case '_': 
        i3 = 0;
        localStringBuilder1.append(paramArrayOfChar[paramInt1]);
        if (i1 != 0)
        {
          i5 = 0;
          localStringBuilder2.append(paramArrayOfChar[paramInt1]);
        }
        paramInt1++;
        if (paramInt1 < paramInt2)
        {
          localStringBuilder1.append(paramArrayOfChar[paramInt1]);
          if (i1 != 0) {
            localStringBuilder2.append(paramArrayOfChar[paramInt1]);
          }
          paramInt1++;
        }
        break;
      default: 
        if (i1 != 0)
        {
          i5 = 0;
          e(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder2);
        }
        paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1);
        continue;
        paramInt1++;
      }
    }
    if (i4 == 0) {
      if (n > 0) {
        localStringBuilder1.setCharAt(n - 1, '0');
      } else if (n < -1) {
        localStringBuilder1.insert(-n - 2, '0');
      }
    }
    if (i3 != 0)
    {
      this.f = new zbph(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder1));
    }
    else
    {
      localzmu1 = new zmu(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder1));
      this.f = localzmu1;
    }
    if (i1 != 0) {
      localStringBuilder2.append("_/");
    }
    i3 = 1;
    i4 = 0;
    localStringBuilder1.setLength(0);
    n = -1;
    this.h = 0;
    int i6 = 0;
    paramInt1++;
    while (paramInt1 < paramInt2) {
      switch (paramArrayOfChar[paramInt1])
      {
      case '0': 
        if ((n > -1) && (n < paramInt1))
        {
          localStringBuilder1.append("\\0");
        }
        else
        {
          i4 = 1;
          localStringBuilder1.append('0');
          i6++;
          if (this.h > 0) {
            this.h *= 10;
          }
          n = paramInt1 + 1;
        }
        if (i2 != 0)
        {
          i5 = 0;
          localStringBuilder2.append("_0");
        }
        break;
      case '#': 
        if ((n > -1) && (n < paramInt1))
        {
          localStringBuilder1.append("\\0");
        }
        else
        {
          localStringBuilder1.append(i4 != 0 ? '0' : '#');
          i6++;
          n = paramInt1 + 1;
        }
        break;
      case '?': 
        if ((n > -1) && (n < paramInt1))
        {
          localStringBuilder1.append("\\0");
        }
        else
        {
          localStringBuilder1.append('?');
          i6++;
          i3 = 0;
          if (i2 != 0) {
            localStringBuilder2.append(' ');
          }
          n = paramInt1 + 1;
        }
        break;
      case '[': 
        paramInt1 = this.a.a(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1, false);
        break;
      case '*': 
      case '_': 
        i3 = 0;
        localStringBuilder1.append(paramArrayOfChar[paramInt1]);
        if (i2 != 0)
        {
          i5 = 0;
          localStringBuilder2.append(paramArrayOfChar[paramInt1]);
        }
        paramInt1++;
        if (paramInt1 < paramInt2)
        {
          localStringBuilder1.append(paramArrayOfChar[paramInt1]);
          if (i2 != 0) {
            localStringBuilder2.append(paramArrayOfChar[paramInt1]);
          }
          paramInt1++;
        }
        break;
      default: 
        if (((n < 0) || (n == paramInt1)) && (paramArrayOfChar[paramInt1] > '0') && (paramArrayOfChar[paramInt1] <= '9'))
        {
          if (this.h <= 0) {
            this.h = (paramArrayOfChar[paramInt1] - '0');
          } else {
            this.h = (this.h * 10 + (paramArrayOfChar[paramInt1] - '0'));
          }
          localStringBuilder1.append(paramArrayOfChar[paramInt1]);
          n = paramInt1 + 1;
        }
        else
        {
          if ((i2 != 0) && (n > -1))
          {
            i5 = 0;
            e(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder2);
          }
          paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1);
          continue;
        }
        paramInt1++;
      }
    }
    if (this.h == 0)
    {
      if (i3 != 0) {
        this.g = new zbph(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder1));
      } else {
        this.g = new zacj(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder1));
      }
      localStringBuilder1.setLength(0);
    }
    else
    {
      this.g = new zir(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder1));
    }
    if (this.h == 0) {
      this.h = (-i6);
    }
    if (this.h < 0)
    {
      this.i = ((int)Math.pow(10.0D, -this.h));
      this.j = Math.pow(10.0D, this.h);
    }
    if (i2 != 0)
    {
      if (i5 != 0)
      {
        this.e = new zbph(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder2));
      }
      else
      {
        zmu localzmu2 = new zmu(this.a, com.aspose.cells.b.a.zs.a(localStringBuilder2));
        this.e = localzmu2;
      }
    }
    else if (this.d != null) {
      this.e = this.d;
    }
  }
  
  private void e(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case '"': 
      paramInt1++;
    }
    while (paramInt1 < paramInt2) {
      if (paramArrayOfChar[paramInt1] == '"')
      {
        paramInt1++;
      }
      else
      {
        paramStringBuilder.append('_');
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
        continue;
        paramStringBuilder.append('_');
        paramInt1++;
        if (paramInt1 < paramInt2)
        {
          paramStringBuilder.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
          break;
          paramStringBuilder.append('_');
          paramStringBuilder.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
        }
      }
    }
  }
  
  protected double c(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    int k = paramDouble < 0.0D ? 1 : 0;
    if (k != 0) {
      paramDouble = -paramDouble;
    }
    int m;
    if (this.h > 0) {
      m = this.h;
    } else {
      m = d(paramDouble - Math.floor(paramDouble));
    }
    paramDouble = Math.floor(paramDouble * m + 0.5D) / m;
    return k != 0 ? -paramDouble : paramDouble;
  }
  
  public void a(zzu paramzzu, double paramDouble, zzz paramzzz)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int k = paramDouble < 0.0D ? 1 : 0;
    if (k != 0) {
      paramDouble = -paramDouble;
    }
    double d1 = Math.floor(paramDouble);
    if (this.d != null)
    {
      paramDouble -= d1;
      if (paramDouble == 0.0D)
      {
        a(paramzzu, k != 0 ? -d1 : d1, paramzzz, localStringBuilder);
        return;
      }
    }
    double d2;
    int n;
    int m;
    if (this.h > 0)
    {
      d2 = paramDouble * this.h;
      if (d2 >= 32767.5D)
      {
        paramzzz.a(paramzzu.c());
        return;
      }
      if (this.d != null)
      {
        n = (int)(d2 + 0.5D);
        if (n == 0)
        {
          a(paramzzu, k != 0 ? -d1 : d1, paramzzz, localStringBuilder);
          return;
        }
        if (n == this.h)
        {
          a(paramzzu, k != 0 ? -d1 - 1.0D : d1 + 1.0D, paramzzz, localStringBuilder);
          return;
        }
      }
      m = this.h;
    }
    else
    {
      if (paramDouble <= this.j)
      {
        d2 = 0.0D;
        m = 1;
      }
      else
      {
        m = d(this.d != null ? paramDouble : paramDouble - d1);
        d2 = paramDouble * m;
      }
      n = (int)(d2 + 0.5D);
      if (n == 0)
      {
        if (this.d != null)
        {
          a(paramzzu, k != 0 ? -d1 : d1, paramzzz, localStringBuilder);
          return;
        }
        m = 1;
      }
      else if (n == m)
      {
        if (this.d != null)
        {
          a(paramzzu, k != 0 ? -d1 - 1.0D : d1 + 1.0D, paramzzz, localStringBuilder);
          return;
        }
        d2 = 1.0D;
        m = 1;
      }
      else
      {
        int i1 = zbpi.a(m, n);
        if (i1 > 1)
        {
          m /= i1;
          d2 /= i1;
        }
      }
    }
    if (this.d != null)
    {
      if (k != 0) {
        localStringBuilder.append('-');
      }
      localzzz = this.d.a(paramzzu, 14, Double.valueOf(d1));
      a(paramzzz, localzzz, localStringBuilder.length());
      if (!localzzz.c()) {
        localStringBuilder.append(localzzz.g());
      }
      k = 0;
    }
    zzz localzzz = this.f.a(paramzzu, 14, Double.valueOf(k != 0 ? -d2 : d2));
    a(paramzzz, localzzz, localStringBuilder.length());
    if (!localzzz.c()) {
      localStringBuilder.append(localzzz.g());
    }
    localStringBuilder.append('/');
    if (this.g != null)
    {
      localzzz = this.g.a(paramzzu, 9, Integer.valueOf(m));
      a(paramzzz, localzzz, localStringBuilder.length());
      if (!localzzz.c()) {
        localStringBuilder.append(localzzz.g());
      }
    }
    paramzzz.a(4, com.aspose.cells.b.a.zs.a(localStringBuilder).toCharArray());
  }
  
  private void a(zzu paramzzu, double paramDouble, zzz paramzzz, StringBuilder paramStringBuilder)
  {
    zzz localzzz = this.e.a(paramzzu, 14, Double.valueOf(paramDouble));
    a(paramzzz, localzzz, paramStringBuilder.length());
    if (!localzzz.c()) {
      paramStringBuilder.append(localzzz.g());
    }
    paramzzz.a(4, com.aspose.cells.b.a.zs.a(paramStringBuilder).toCharArray());
  }
  
  private int d(double paramDouble)
  {
    int k = 2;
    double d1 = 1.0D;
    for (int m = 2; m < this.i; m++)
    {
      double d2 = paramDouble * m;
      d2 -= Math.floor(d2);
      if (d2 < 0.5D)
      {
        if (d2 <= d1)
        {
          d1 = d2;
          k = m;
        }
      }
      else
      {
        d2 = 1.0D - d2;
        if (d2 <= d1)
        {
          d1 = d2;
          k = m;
        }
      }
    }
    return k;
  }
  
  public int a()
  {
    return 4;
  }
  
  public int g()
  {
    return 5;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */