package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;

public class zaf
  extends zgz
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int[] h;
  public int[] i;
  public int[] j;
  public int[] k;
  public int[] l;
  public boolean m = false;
  public int n;
  public int o;
  public int p;
  public int q;
  public int[] r;
  public int[] s;
  public int[] t;
  
  public zaf(zz paramzz)
    throws Exception
  {
    int i1 = (int)paramzz.a().i();
    int i2 = paramzz.e() & 0xFFFF;
    if (i2 != 0) {
      throw new IllegalStateException("Unexpected cmap table version.");
    }
    int i3 = paramzz.e() & 0xFFFF;
    int i4 = 0;
    for (int i5 = 0; i5 < i3; i5++)
    {
      int i6 = paramzz.e() & 0xFFFF;
      int i7 = paramzz.e() & 0xFFFF;
      int i8 = paramzz.b();
      if ((i6 == 3) && ((i7 == 1) || (i7 == 10) || (i7 == 0)))
      {
        int i9 = (int)paramzz.a().i();
        int i10 = i1 + i8;
        paramzz.a().b(i10);
        int i11 = paramzz.e() & 0xFFFF;
        if (i11 == 4)
        {
          this.a = i6;
          this.b = i7;
          paramzz.a().b(i10);
          a(paramzz);
          paramzz.a().b(i9);
          i4 = 1;
        }
        else if (i11 == 12)
        {
          this.n = i6;
          this.o = i7;
          paramzz.a().b(i10);
          try
          {
            b(paramzz);
          }
          catch (Exception localException)
          {
            this.m = false;
          }
          finally
          {
            paramzz.a().b(i9);
          }
        }
        else
        {
          paramzz.a().b(i9);
        }
      }
    }
    if (i4 == 0) {
      throw new IllegalStateException("Cannot find a required cmap table.");
    }
  }
  
  private void a(zz paramzz)
    throws Exception
  {
    int i1 = (int)paramzz.a().i();
    int i2 = 4;
    int i3 = paramzz.e() & 0xFFFF;
    if (i3 != 4) {
      throw new IllegalStateException("Unexpected cmap subtable format.");
    }
    int i4 = paramzz.e() & 0xFFFF;
    this.c = (paramzz.e() & 0xFFFF);
    this.d = (paramzz.e() & 0xFFFF);
    this.e = (paramzz.e() & 0xFFFF);
    this.f = (paramzz.e() & 0xFFFF);
    this.g = (paramzz.e() & 0xFFFF);
    int i5 = this.d / 2;
    this.h = a(paramzz, i5);
    paramzz.e();
    this.i = a(paramzz, i5);
    this.j = b(paramzz, i5);
    this.k = a(paramzz, i5);
    int i6 = i1 + i4;
    int i7 = i6 - (int)paramzz.a().i();
    int i8 = i7 / 2;
    if (i6 + i2 <= paramzz.a().h()) {
      i8 += i2 / 2;
    }
    this.l = a(paramzz, i8);
  }
  
  private void b(zz paramzz)
    throws Exception
  {
    int i1 = (int)paramzz.a().i();
    int i2 = paramzz.e() & 0xFFFF;
    if (i2 != 12) {
      throw new IllegalStateException("Unexpected cmap subtable format.");
    }
    int i3 = paramzz.e() & 0xFFFF;
    int i4 = paramzz.b();
    this.p = paramzz.b();
    this.q = paramzz.b();
    this.r = new int[this.q];
    this.s = new int[this.q];
    this.t = new int[this.q];
    for (int i5 = 0; i5 < this.q; i5++)
    {
      this.r[i5] = paramzz.b();
      this.s[i5] = paramzz.b();
      this.t[i5] = paramzz.b();
    }
    this.m = true;
  }
  
  public zgy a(zbt paramzbt, String paramString)
  {
    zgy localzgy = new zgy(a());
    int i1 = this.h.length;
    int i3;
    int i4;
    zbs localzbs;
    zgx localzgx;
    for (int i2 = 0; i2 < i1; i2++) {
      for (i3 = this.i[i2]; i3 <= this.h[i2]; i3++)
      {
        if (i3 == 65535)
        {
          i4 = 0;
        }
        else
        {
          int i5 = this.k[i2];
          switch (i5)
          {
          case 0: 
            i4 = i3 + this.j[i2] & 0xFFFF;
            if (i4 == 65535) {
              i4 = 0;
            }
            break;
          case 65535: 
            i4 = 0;
            break;
          default: 
            int i6 = i3 - this.i[i2];
            int i7 = this.k[i2] / 2 + i6 - i1 + i2;
            i4 = this.l[i7];
            if (i4 != 0) {
              i4 = i4 + this.j[i2] & 0xFFFF;
            }
            break;
          }
        }
        localzbs = paramzbt.a(i4);
        localzgx = new zgx(i3, i4, localzbs.a & 0xFFFF, localzbs.b);
        localzgy.b(localzgx);
        if (localzgx.b() == 0) {
          localzgy.a(localzgx);
        }
      }
    }
    if (this.m) {
      for (i2 = this.q - 1; (i2 >= 0) && (this.s[i2] >= 65536); i2--) {
        for (i3 = this.r[i2]; i3 <= this.s[i2]; i3++) {
          if (i3 >= 65536)
          {
            i4 = this.t[i2] + (i3 - this.r[i2]);
            localzbs = paramzbt.a(i4);
            localzgx = new zgx(i3, i4, localzbs.a & 0xFFFF, localzbs.b);
            localzgy.b(localzgx);
          }
        }
      }
    }
    return localzgy;
  }
  
  public void a(zgl paramzgl)
  {
    int i1 = paramzgl.a() - 1;
    if (paramzgl.d(i1) != 65535) {
      throw new IllegalStateException("Last character is supposed to be the 0xffff (the missing character).");
    }
    if (((Integer)paramzgl.c(i1)).intValue() != 0) {
      throw new IllegalStateException("Glyph index for the missing character is expected to be zero.");
    }
    int i2 = paramzgl.a();
    this.d = (i2 * 2);
    this.e = (2 << (int)Math.floor(Math.log(i2) / Math.log(2.0D)));
    this.f = ((int)(Math.log(this.e / 2.0D) / Math.log(2.0D)));
    this.g = (2 * i2 - this.e);
    this.h = new int[i2];
    this.i = new int[i2];
    this.j = new int[i2];
    this.k = new int[i2];
    this.l = new int[0];
    for (int i3 = 0; i3 < paramzgl.a(); i3++)
    {
      int i4 = paramzgl.d(i3);
      int i5 = ((Integer)paramzgl.c(i3)).intValue();
      this.h[i3] = i4;
      this.i[i3] = i4;
      this.j[i3] = (i5 - i4);
    }
  }
  
  public void a(zaa paramzaa)
    throws Exception
  {
    int i1 = (int)paramzaa.a().i();
    paramzaa.b(0);
    paramzaa.b(this.m ? 2 : 1);
    paramzaa.b(this.a);
    paramzaa.b(this.b);
    paramzaa.a(12L);
    c(paramzaa);
    if (this.m)
    {
      paramzaa.b(this.n);
      paramzaa.b(this.o);
      int i2 = (int)paramzaa.a().i() - i1 + 4;
      paramzaa.a(i2);
      b(paramzaa);
    }
  }
  
  private void b(zaa paramzaa)
    throws Exception
  {
    paramzaa.c(12);
    paramzaa.c(0);
    int i1 = 16 + this.q * 3 * 4;
    paramzaa.a(i1);
    paramzaa.a(this.p);
    paramzaa.a(this.q);
    for (int i2 = 0; i2 < this.q; i2++)
    {
      paramzaa.a(this.r[i2]);
      paramzaa.a(this.s[i2]);
      paramzaa.a(this.t[i2]);
    }
  }
  
  private void c(zaa paramzaa)
    throws Exception
  {
    int i1 = (int)paramzaa.a().i();
    paramzaa.b(4);
    int i2 = 16 + this.d * 4 + this.l.length * 2;
    paramzaa.b(i2);
    paramzaa.b(this.c);
    paramzaa.b(this.d);
    paramzaa.b(this.e);
    paramzaa.b(this.f);
    paramzaa.b(this.g);
    a(this.h, paramzaa);
    paramzaa.b(0);
    a(this.i, paramzaa);
    a(this.j, paramzaa);
    a(this.k, paramzaa);
    a(this.l, paramzaa);
  }
  
  private static int[] a(zz paramzz, int paramInt)
    throws Exception
  {
    int[] arrayOfInt = new int[paramInt];
    for (int i1 = 0; i1 < paramInt; i1++) {
      arrayOfInt[i1] = (paramzz.e() & 0xFFFF);
    }
    return arrayOfInt;
  }
  
  private static int[] b(zz paramzz, int paramInt)
    throws Exception
  {
    int[] arrayOfInt = new int[paramInt];
    for (int i1 = 0; i1 < paramInt; i1++) {
      arrayOfInt[i1] = paramzz.d();
    }
    return arrayOfInt;
  }
  
  private static void a(int[] paramArrayOfInt, zaa paramzaa)
    throws Exception
  {
    for (int i3 : paramArrayOfInt) {
      paramzaa.b(i3);
    }
  }
  
  public boolean a()
  {
    return this.b == 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */