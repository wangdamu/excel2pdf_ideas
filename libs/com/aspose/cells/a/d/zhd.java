package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

public class zhd
{
  private long b;
  private long c;
  private long d;
  private double e;
  private double f;
  private int g = 32767;
  private int h = 2;
  private int i = 1;
  private int j = 1;
  private int k = 1;
  private int l = 1;
  private int m = 4;
  private int[] n = { 0 };
  
  public zhd(byte[] paramArrayOfByte)
    throws Exception
  {
    this(new zz(new zh(paramArrayOfByte)));
  }
  
  public zhd(zz paramzz)
    throws Exception
  {
    this.b = paramzz.a().i();
    a(paramzz);
  }
  
  private void a(zz paramzz)
    throws Exception
  {
    int i1 = paramzz.d();
    boolean bool = i1 == 19789;
    int i2 = a(paramzz, bool);
    if ((i2 & 0xFFFF) != 42) {
      return;
    }
    long l1 = b(paramzz, bool);
    paramzz.a().b(this.b + (l1 & 0xFFFFFFFF));
    int i3 = a(paramzz, bool);
    long l2 = paramzz.a().i();
    for (int i4 = 0; i4 < (i3 & 0xFFFF); i4++)
    {
      paramzz.a().b(l2);
      l2 += 12L;
      int i5 = a(paramzz, bool);
      int i6 = a(paramzz, bool);
      long l3 = b(paramzz, bool);
      if ((((i6 & 0xFFFF) != 1) && ((i6 & 0xFFFF) != 2)) || (((l3 & 0xFFFFFFFF) > 4L) || (((i6 & 0xFFFF) == 3) && ((l3 & 0xFFFFFFFF) > 2L)) || (((i6 & 0xFFFF) == 4) && ((l3 & 0xFFFFFFFF) > 1L)) || ((i6 & 0xFFFF) == 5)))
      {
        long l4 = b(paramzz, bool);
        paramzz.a().b(this.b + (l4 & 0xFFFFFFFF));
      }
      switch (i5)
      {
      case 256: 
        this.c = ((i6 & 0xFFFF) == 3 ? a(paramzz, bool) : b(paramzz, bool));
        break;
      case 257: 
        this.d = ((i6 & 0xFFFF) == 3 ? a(paramzz, bool) : b(paramzz, bool));
        break;
      case 282: 
        this.e = c(paramzz, bool);
        break;
      case 283: 
        this.f = c(paramzz, bool);
        break;
      case 262: 
        this.g = (a(paramzz, bool) & 0xFFFF);
        break;
      case 296: 
        this.h = (a(paramzz, bool) & 0xFFFF);
        break;
      case 259: 
        this.i = (a(paramzz, bool) & 0xFFFF);
        break;
      case 258: 
        this.n = a(paramzz, bool, l3);
        break;
      case 284: 
        this.j = (a(paramzz, bool) & 0xFFFF);
        break;
      case 277: 
        this.l = a(paramzz, bool);
        break;
      case 332: 
        this.k = (a(paramzz, bool) & 0xFFFF);
        break;
      case 334: 
        this.m = a(paramzz, bool);
      }
    }
  }
  
  private static int a(zz paramzz, boolean paramBoolean)
    throws Exception
  {
    int i1 = paramzz.e();
    if (!paramBoolean) {
      i1 = zab.a(i1);
    }
    return i1;
  }
  
  private static long b(zz paramzz, boolean paramBoolean)
    throws Exception
  {
    long l1 = paramzz.c();
    if (!paramBoolean) {
      l1 = zab.a(l1);
    }
    return l1;
  }
  
  private static int[] a(zz paramzz, boolean paramBoolean, long paramLong)
    throws Exception
  {
    int[] arrayOfInt = new int[(int)(paramLong & 0xFFFFFFFF)];
    for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
      arrayOfInt[i1] = a(paramzz, paramBoolean);
    }
    return arrayOfInt;
  }
  
  private static double c(zz paramzz, boolean paramBoolean)
    throws Exception
  {
    long l1 = b(paramzz, paramBoolean);
    long l2 = b(paramzz, paramBoolean);
    return (l2 & 0xFFFFFFFF) != 0L ? (l1 & 0xFFFFFFFF) / (l2 & 0xFFFFFFFF) : 0.0D;
  }
  
  public boolean a()
  {
    if ((this.h != 1) && (this.h != 2) && (this.h != 3)) {
      return false;
    }
    return (b()) || (c()) || (d()) || (e()) || (f());
  }
  
  private boolean b()
  {
    return ((this.g == 0) || (this.g == 1)) && ((this.n[0] & 0xFFFF) == 0) && ((this.i == 1) || (this.i == 2) || (this.i == 3) || (this.i == 4) || (this.i == 5) || (this.i == 32773));
  }
  
  private boolean c()
  {
    return ((this.g == 0) || (this.g == 1)) && (((this.n[0] & 0xFFFF) == 4) || ((this.n[0] & 0xFFFF) == 8) || ((this.n[0] & 0xFFFF) == 16)) && ((this.i == 1) || (this.i == 2) || (this.i == 32773));
  }
  
  private boolean d()
  {
    return (this.g == 3) && (((this.n[0] & 0xFFFF) == 1) || ((this.n[0] & 0xFFFF) == 4) || ((this.n[0] & 0xFFFF) == 8)) && ((this.i == 1) || (this.i == 5) || (this.i == 32773));
  }
  
  private boolean e()
  {
    return (this.g == 2) && (this.j == 1) && (this.n.length == (this.l & 0xFFFF)) && (g()) && ((this.i == 1) || (this.i == 5) || (this.i == 6) || (this.i == 32773));
  }
  
  private boolean f()
  {
    return (this.g == 5) && (this.j == 1) && (this.k == 1) && (this.m == 4) && (this.n.length == (this.l & 0xFFFF)) && (g()) && ((this.i == 1) || (this.i == 5) || (this.i == 6) || (this.i == 32773));
  }
  
  private boolean g()
  {
    boolean bool = ((this.n[0] & 0xFFFF) == 8) || ((this.n[0] & 0xFFFF) == 16);
    for (int i1 = 0; i1 < this.n.length; i1++) {
      bool = (bool) && (this.n[i1] == this.n[0]);
    }
    return bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */