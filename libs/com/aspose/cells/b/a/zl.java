package com.aspose.cells.b.a;

import com.aspose.cells.b.b.zb;

public final class zl
  implements Comparable<Object>
{
  public static final zl a = new zl(0L);
  public static final zl b = new zl(Long.MAX_VALUE);
  public static final zl c = new zl(Long.MIN_VALUE);
  private long d;
  
  public zl(long paramLong)
  {
    this.d = paramLong;
  }
  
  public zl(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = a(paramInt1, paramInt2, paramInt3);
  }
  
  public long a()
  {
    return this.d;
  }
  
  public int b()
  {
    return (int)(this.d / 864000000000L);
  }
  
  public double c()
  {
    return this.d * 1.1574074074074074E-12D;
  }
  
  public double d()
  {
    return this.d * 1.6666666666666667E-9D;
  }
  
  public int compareTo(Object value)
  {
    if (value == null) {
      return 1;
    }
    if (!(value instanceof zl)) {
      throw new IllegalArgumentException("Arg_MustBeTimeSpan");
    }
    long l = ((zl)value).d;
    if (this.d > l) {
      return 1;
    }
    if (this.d < l) {
      return -1;
    }
    return 0;
  }
  
  public int hashCode()
  {
    return (int)this.d ^ (int)(this.d >> 32);
  }
  
  public boolean equals(Object value)
  {
    return ((value instanceof zl)) && (a(this, (zl)value));
  }
  
  public static boolean a(zl paramzl1, zl paramzl2)
  {
    if (paramzl1 == paramzl2) {
      return true;
    }
    return (paramzl1 != null) && (paramzl2 != null) && (paramzl1.d == paramzl2.d);
  }
  
  private static zl a(double paramDouble, int paramInt)
  {
    if (Double.isNaN(paramDouble)) {
      throw new IllegalArgumentException("Arg_CannotBeNaN");
    }
    double d1 = paramDouble * paramInt;
    double d2 = d1 + (paramDouble >= 0.0D ? 0.5D : -0.5D);
    if ((d2 > 9.22337203685477E14D) || (d2 < -9.22337203685477E14D)) {
      throw new IllegalStateException("Overflow_TimeSpanTooLong");
    }
    return new zl(d2 * 10000L);
  }
  
  public static zl a(double paramDouble)
  {
    return a(paramDouble, 60000);
  }
  
  public static long a(int paramInt1, int paramInt2, int paramInt3)
  {
    long l = paramInt1 * 3600L + paramInt2 * 60L + paramInt3;
    if ((l > 922337203685L) || (l < -922337203685L)) {
      throw new IndexOutOfBoundsException("Overflow_TimeSpanTooLong");
    }
    return l * 10000000L;
  }
  
  private String a(int paramInt1, int paramInt2)
  {
    return zb.a(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = (int)(this.d / 864000000000L);
    long l = this.d % 864000000000L;
    if (this.d < 0L)
    {
      localStringBuilder.append("-");
      i = -i;
      l = -l;
    }
    if (i != 0)
    {
      localStringBuilder.append(i);
      localStringBuilder.append(".");
    }
    localStringBuilder.append(a((int)(l / 36000000000L % 24L), 2));
    localStringBuilder.append(":");
    localStringBuilder.append(a((int)(l / 600000000L % 60L), 2));
    localStringBuilder.append(":");
    localStringBuilder.append(a((int)(l / 10000000L % 60L), 2));
    int j = (int)(l % 10000000L);
    if (j != 0)
    {
      localStringBuilder.append(".");
      localStringBuilder.append(a(j, 7));
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */