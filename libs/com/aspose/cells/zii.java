package com.aspose.cells;

import com.aspose.cells.a.a.za;
import com.aspose.cells.b.a.zs;

class zii
  extends zl
{
  private static double[] c = { 0.95D, 9.5D, 99.5D, 999.5D, 9999.5D, 99999.5D, 999999.5D, 9999999.5D, 9.99999995E7D, 9.999999995E8D, 9.9999999995E9D, 9.99999999995E10D, 9.999999999995E11D, 9.9999999999995E12D, 9.99999999999995E13D, 9.999999999999995E14D, 1.0E16D };
  private zahf d;
  private zahf e;
  private char f;
  private boolean g;
  private boolean h;
  private boolean i;
  private zon j;
  
  public zii(zig paramzig, zl paramzl1, zl paramzl2)
  {
    super(paramzig);
    a(this.a.c());
    this.d = paramzl1;
    this.e = paramzl2;
    this.i = false;
    this.g = false;
    this.h = false;
    if (paramzl1 != null)
    {
      this.i = true;
      if ((paramzl1.a() == 3) && (((zn)paramzl1).f())) {
        this.g = true;
      }
    }
    if (paramzl2 != null)
    {
      this.i = true;
      if ((paramzl2.a() == 3) && (((zn)paramzl2).f())) {
        this.h = true;
      }
    }
    if (paramzig.f() > 0) {
      this.j = new zon(paramzig);
    }
  }
  
  public zahf c()
  {
    return this.d;
  }
  
  public zahf d()
  {
    return this.e;
  }
  
  public zzz a(zzu paramzzu, int paramInt, Object paramObject)
  {
    zzz localzzz = super.a(paramzzu, paramInt, paramObject);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    switch (paramInt)
    {
    case 16: 
      a(paramzzu, a((DateTime)paramObject), localzzz);
      return localzzz;
    case 14: 
      a(paramzzu, ((Double)paramObject).doubleValue(), localzzz);
      return localzzz;
    case 9: 
      int k = ((Integer)paramObject).intValue();
      a(paramzzu, k, localzzz);
      return localzzz;
    case 3: 
      a(paramzzu, ((Boolean)paramObject).booleanValue(), localzzz);
      return localzzz;
    }
    a(paramObject, paramInt, localzzz);
    return localzzz;
  }
  
  private void a(zzu paramzzu, double paramDouble, zzz paramzzz)
  {
    boolean bool;
    if (paramDouble < 0.0D)
    {
      bool = true;
      paramDouble = -paramDouble;
    }
    else
    {
      bool = false;
    }
    zzz localzzz1 = null;
    zzz localzzz2 = null;
    if (this.i)
    {
      if ((bool) && ((this.g) || (this.h)))
      {
        paramzzz.a(paramzzu.c());
        return;
      }
      if (this.d != null)
      {
        localzzz1 = this.d.a(paramzzu, 14, Double.valueOf(paramDouble));
        if (localzzz1.e())
        {
          paramzzz.a(paramzzu.c());
          return;
        }
      }
      if (this.e != null)
      {
        localzzz2 = this.e.a(paramzzu, 14, Double.valueOf(paramDouble));
        if (localzzz2.e())
        {
          paramzzz.a(paramzzu.c());
          return;
        }
      }
    }
    Object localObject1 = null;
    if (this.j != null)
    {
      StringBuilder localStringBuilder = this.j.a(paramDouble, null);
      localObject1 = zs.a(localStringBuilder).toCharArray();
    }
    else
    {
      int k;
      if (paramzzu.a() == null)
      {
        k = this.a.c().l();
      }
      else
      {
        localObject2 = null;
        if (this.i)
        {
          localObject2 = new StringBuilder();
          if (localzzz1 != null) {
            ((StringBuilder)localObject2).append(localzzz1.a(0, false));
          }
          if (localzzz2 != null) {
            ((StringBuilder)localObject2).append(localzzz2.a(0, false));
          }
        }
        k = paramzzu.a().a(localObject2 == null ? null : zs.a(localObject2), bool);
      }
      if (k < 1)
      {
        paramzzz.a(paramzzu.c());
        return;
      }
      Object localObject2 = null;
      if (paramDouble == 0.0D)
      {
        localObject2 = "0";
      }
      else
      {
        localObject2 = a(paramzzu, paramDouble, k);
        if (localObject2 == null)
        {
          paramzzz.a(paramzzu.c());
          return;
        }
      }
      localObject1 = ((String)localObject2).toCharArray();
    }
    char[] arrayOfChar1;
    if (this.i)
    {
      arrayOfChar1 = new char[(bool ? 1 : 0) + ((localzzz1 == null) || (localzzz1.c()) ? 0 : localzzz1.g().length) + localObject1.length + ((localzzz2 == null) || (localzzz2.c()) ? 0 : localzzz2.g().length)];
      int m = 0;
      if (bool)
      {
        arrayOfChar1[0] = '-';
        m = 1;
      }
      char[] arrayOfChar2;
      if (localzzz1 != null)
      {
        a(paramzzz, localzzz1, m);
        if (!localzzz1.c())
        {
          arrayOfChar2 = localzzz1.g();
          System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, arrayOfChar2.length);
          m += arrayOfChar2.length;
        }
      }
      System.arraycopy(localObject1, 0, arrayOfChar1, m, localObject1.length);
      m += localObject1.length;
      if (localzzz2 != null)
      {
        a(paramzzz, localzzz2, m);
        if (!localzzz2.c())
        {
          arrayOfChar2 = localzzz2.g();
          System.arraycopy(arrayOfChar2, 0, arrayOfChar1, m, arrayOfChar2.length);
          m += arrayOfChar2.length;
        }
      }
      localObject1 = arrayOfChar1;
    }
    else if (bool)
    {
      arrayOfChar1 = new char[localObject1.length + 1];
      arrayOfChar1[0] = '-';
      System.arraycopy(localObject1, 0, arrayOfChar1, 1, localObject1.length);
      localObject1 = arrayOfChar1;
    }
    paramzzz.a(2, (char[])localObject1);
  }
  
  private String a(zzu paramzzu, double paramDouble, int paramInt)
  {
    if (paramDouble == 0.0D) {
      return "0";
    }
    if (paramDouble >= 9999.5D)
    {
      if (paramInt < 5) {
        return null;
      }
      StringBuilder localStringBuilder1 = new StringBuilder(paramInt);
      int m = (int)Math.log10(paramDouble);
      if (paramDouble >= c[paramInt])
      {
        paramInt -= (m > 99 ? 7 : 6);
        if (paramInt > 0) {
          paramDouble /= Math.pow(10.0D, m - paramInt);
        } else {
          paramDouble /= Math.pow(10.0D, m);
        }
        localStringBuilder1.append((paramDouble + 0.5D));
        if (localStringBuilder1.length() > (paramInt > 0 ? paramInt + 1 : 1)) {
          m++;
        }
        a(localStringBuilder1, 0);
        c(localStringBuilder1, m);
      }
      else
      {
        if (paramInt > m + 2) {
          paramDouble *= Math.pow(10.0D, paramInt - (m + 2));
        }
        localStringBuilder1.append((paramDouble + 0.5D));
        if (localStringBuilder1.length() > (paramInt >= m + 2 ? paramInt - 1 : paramInt)) {
          m++;
        }
        a(localStringBuilder1, m);
        if (localStringBuilder1.length() > m + 1) {
          localStringBuilder1.insert(m + 1, this.f);
        }
      }
      return zs.a(localStringBuilder1);
    }
    int k;
    if (paramDouble < 1.0D)
    {
      k = -(int)Math.floor(Math.log10(paramDouble));
      if (k < paramInt - 1)
      {
        localStringBuilder2 = new StringBuilder(paramInt);
        if ((paramInt < 5) || (k < 4) || (paramInt == 6))
        {
          b(localStringBuilder2, k);
          int n = localStringBuilder2.length();
          localStringBuilder2.append((paramDouble * Math.pow(10.0D, paramInt - 2) + 0.5D));
          if (localStringBuilder2.length() - n > paramInt - 1 - k) {
            if (k > 1)
            {
              localStringBuilder2.delete(n - 1, n - 1 + 1);
              n -= 2;
            }
            else
            {
              localStringBuilder2.delete(0, 2);
              n = 0;
            }
          }
          a(localStringBuilder2, n);
          return zs.a(localStringBuilder2);
        }
        if (k == 4)
        {
          String str1 = Long.toString((paramDouble * Math.pow(10.0D, paramInt - 2) + 0.5D));
          if (str1.length() > paramInt - 5)
          {
            b(localStringBuilder2, 3);
            localStringBuilder2.append(str1.charAt(0));
            return zs.a(localStringBuilder2);
          }
        }
        if (paramInt > 6) {
          paramDouble *= Math.pow(10.0D, paramInt + k - 6);
        } else {
          paramDouble *= Math.pow(10.0D, k);
        }
        localStringBuilder2.append((paramDouble + 0.5D));
        int i1 = 0;
        if (localStringBuilder2.length() > paramInt - 5)
        {
          k--;
          i1 = 1;
        }
        a(localStringBuilder2, 0);
        if ((i1 != 0) || (localStringBuilder2.length() >= paramInt - k))
        {
          c(localStringBuilder2, -k);
        }
        else
        {
          String str2 = zs.a(localStringBuilder2);
          localStringBuilder2.setLength(0);
          b(localStringBuilder2, k);
          localStringBuilder2.append(str2);
        }
        return zs.a(localStringBuilder2);
      }
      if (paramInt < 5) {
        return "0";
      }
      localStringBuilder2 = new StringBuilder(paramInt);
      paramInt -= (k > 99 ? 7 : 6);
      if (paramInt > 0) {
        paramDouble *= Math.pow(10.0D, paramInt + k);
      } else {
        paramDouble *= Math.pow(10.0D, k);
      }
      localStringBuilder2.append((paramDouble + 0.5D));
      if (localStringBuilder2.length() > (paramInt > 0 ? paramInt + 1 : 1)) {
        k--;
      }
      a(localStringBuilder2, 0);
      c(localStringBuilder2, -k);
      return zs.a(localStringBuilder2);
    }
    if (paramDouble >= c[paramInt]) {
      return null;
    }
    if (paramDouble >= 1000.0D) {
      k = 3;
    } else if (paramDouble >= 100.0D) {
      k = 2;
    } else if (paramDouble >= 10.0D) {
      k = 1;
    } else {
      k = 0;
    }
    if (paramInt > k + 2) {
      paramDouble *= Math.pow(10.0D, paramInt - k - 2);
    }
    StringBuilder localStringBuilder2 = new StringBuilder(paramInt);
    localStringBuilder2.append((paramDouble + 0.5D));
    if (localStringBuilder2.length() > (paramInt >= k + 2 ? paramInt - 1 : paramInt)) {
      k++;
    }
    a(localStringBuilder2, k);
    if (localStringBuilder2.length() > k + 1) {
      localStringBuilder2.insert(k + 1, this.f);
    }
    return zs.a(localStringBuilder2);
  }
  
  private void a(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int k = paramStringBuilder.length() - 1; (k > paramInt) && (paramStringBuilder.charAt(k) == '0'); k--) {}
    paramStringBuilder.setLength(k + 1);
  }
  
  private void b(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder.append('0');
    paramStringBuilder.append(this.f);
    for (int k = 1; k < paramInt; k++) {
      paramStringBuilder.append('0');
    }
  }
  
  private void c(StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramStringBuilder.length() > 1) {
      paramStringBuilder.insert(1, this.f);
    }
    paramStringBuilder.append("E");
    if (paramInt >= 0)
    {
      paramStringBuilder.append('+');
    }
    else
    {
      paramStringBuilder.append('-');
      paramInt = -paramInt;
    }
    if (paramInt < 10) {
      paramStringBuilder.append('0');
    }
    paramStringBuilder.append(paramInt);
  }
  
  public int a()
  {
    return 0;
  }
  
  public int g()
  {
    return 0;
  }
  
  private void a(zzx paramzzx)
  {
    this.f = paramzzx.f().d();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */