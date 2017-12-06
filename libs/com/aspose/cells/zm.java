package com.aspose.cells;

abstract class zm
  extends zs
{
  private char d;
  private char e;
  private zbph f;
  private zir[][] g;
  private int[][] h;
  private boolean[] i;
  private int[] j;
  private int[] k;
  private int[] l;
  private int[][] m;
  private int n;
  private int o;
  private int p;
  private int[] q;
  private int[] r;
  
  public zm(zig paramzig)
  {
    super(paramzig);
  }
  
  protected abstract char[] a(char[] paramArrayOfChar, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  protected char c()
  {
    return this.d;
  }
  
  public void a(zzu paramzzu, double paramDouble, zzz paramzzz)
  {
    this.f.a(paramzzu, paramDouble, paramzzz);
    a(paramzzz.g(), paramzzu, paramzzz);
  }
  
  public void a(char[] paramArrayOfChar, zzu paramzzu, zzz paramzzz)
  {
    this.q[0] = 0;
    if ((paramArrayOfChar.length > 0) && (paramArrayOfChar[0] == '-')) {
      this.r[0] = 1;
    } else {
      this.r[0] = 0;
    }
    this.q[(this.q.length - 1)] = paramArrayOfChar.length;
    this.r[(this.q.length - 1)] = 0;
    paramArrayOfChar = a(paramArrayOfChar, this.q, this.r);
    int i1 = 0;
    int i2 = 0;
    int[] arrayOfInt1 = null;
    if (this.o > 0) {
      arrayOfInt1 = new int[this.o];
    }
    char[] arrayOfChar1 = null;
    int i3 = 0;
    int i4 = 0;
    int i9;
    int i5;
    int i6;
    int i7;
    int i16;
    if (this.o + this.p > 0)
    {
      int[] arrayOfInt2 = null;
      for (i9 = 0; i9 < this.m.length; i9++)
      {
        int[] arrayOfInt4 = this.m[i9];
        if (arrayOfInt4 != null)
        {
          i5 = this.q[i9] + this.r[i9];
          i6 = this.q[(i9 + 1)];
          i7 = i6 - i5;
          int i13;
          int i11;
          if (this.i[i9] != 0) {
            for (i13 = arrayOfInt4.length - 1; i13 > -1; i13--)
            {
              i11 = arrayOfInt4[i13];
              if (i11 < 0) {
                i11 = -i11 - 1;
              }
              if (i11 >= i7)
              {
                if (arrayOfChar1 == null)
                {
                  arrayOfChar1 = new char[paramArrayOfChar.length + (this.c.g() ? this.o + this.p + 1 + (this.o + this.p - 1) / 3 : this.o + this.p)];
                  System.arraycopy(paramArrayOfChar, 0, arrayOfChar1, 0, i5);
                  i3 = i5;
                  arrayOfInt2 = new int[this.q.length];
                  System.arraycopy(this.q, 0, arrayOfInt2, 0, this.q.length);
                }
                else
                {
                  System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i5 - i4);
                  i3 += i5 - i4;
                }
                i4 = i5;
                i16 = 0;
                int i17 = 0;
                if (this.c.g())
                {
                  i18 = i4 + i17;
                  while ((i18 < i6) && (paramArrayOfChar[i18] != this.e)) {
                    if ((paramArrayOfChar[i18] < '0') || (paramArrayOfChar[i18] > '9'))
                    {
                      i18++;
                    }
                    else
                    {
                      i17++;
                      if (i17 > 2)
                      {
                        i16 = 1;
                        i17 = 0;
                        break;
                      }
                      i18++;
                    }
                  }
                  i16 += (i13 + i17) / 3;
                }
                for (int i18 = i9 + 1; i18 < this.q.length; i18++) {
                  arrayOfInt2[i18] += i13 + 1 + i16;
                }
                for (i18 = 0; i18 <= i13; i18++)
                {
                  if (arrayOfInt4[i18] < 0)
                  {
                    arrayOfChar1[i3] = i1;
                    arrayOfInt1[i2] = i3;
                    i2++;
                  }
                  else
                  {
                    arrayOfChar1[i3] = '0';
                  }
                  i3++;
                  if ((this.c.g()) && (i16 > 0) && ((i13 - i18 + i17) % 3 == 0))
                  {
                    if (arrayOfInt4[i18] < 0)
                    {
                      arrayOfChar1[i3] = i1;
                      arrayOfInt1[i2] = i3;
                      i2++;
                    }
                    else
                    {
                      arrayOfChar1[i3] = this.e;
                    }
                    i3++;
                    i16--;
                  }
                }
                System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
                i4 = i6;
                i3 += i7;
                break;
              }
            }
          } else {
            for (i13 = 0; i13 < arrayOfInt4.length; i13++)
            {
              i11 = arrayOfInt4[i13];
              if (i11 < 0) {
                i11 = -i11 - 1;
              }
              if (i11 >= i7)
              {
                if (arrayOfChar1 == null)
                {
                  arrayOfChar1 = new char[paramArrayOfChar.length + this.o + this.p];
                  System.arraycopy(paramArrayOfChar, 0, arrayOfChar1, 0, i6);
                  i3 = i6;
                  arrayOfInt2 = new int[this.q.length];
                  System.arraycopy(this.q, 0, arrayOfInt2, 0, this.q.length);
                }
                else
                {
                  i7 = i6 - i4;
                  System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
                  i3 += i7;
                }
                i4 = i6;
                i13 = arrayOfInt4.length - i13;
                for (i16 = i9 + 1; i16 < this.q.length; i16++) {
                  arrayOfInt2[i16] += i13;
                }
                for (i13 = arrayOfInt4.length - i13; i13 < arrayOfInt4.length; i13++)
                {
                  if (arrayOfInt4[i13] < 0)
                  {
                    arrayOfChar1[i3] = i1;
                    arrayOfInt1[i2] = i3;
                    i2++;
                  }
                  else
                  {
                    arrayOfChar1[i3] = '0';
                  }
                  i3++;
                }
              }
            }
          }
        }
      }
      if (arrayOfChar1 != null)
      {
        System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, paramArrayOfChar.length - i4);
        i3 += paramArrayOfChar.length - i4;
        paramArrayOfChar = new char[i3];
        System.arraycopy(arrayOfChar1, 0, paramArrayOfChar, 0, i3);
        this.q = arrayOfInt2;
      }
    }
    if (i2 > 0) {
      com.aspose.cells.b.a.za.a(arrayOfInt1, 0, i2);
    }
    int i10;
    if ((this.n > 0) || (this.l != null))
    {
      arrayOfChar1 = new char[paramArrayOfChar.length + this.n];
      if (this.l != null) {
        paramzzz.a(this.l);
      }
      int i8 = 0;
      i3 = 0;
      i4 = 0;
      for (i9 = 0; i9 < this.g.length; i9++) {
        if (this.g[i9] != null)
        {
          i5 = this.q[i9] + this.r[i9];
          i6 = this.q[(i9 + 1)];
          i7 = i5 - i4;
          if (i7 > 0)
          {
            System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
            i4 = i5;
            i3 += i7;
          }
          zzz localzzz;
          int i14;
          if (this.i[i9] != 0)
          {
            if (this.k != null) {
              i8 = this.k[i9] - 1;
            }
            i3 += this.j[i9] + i6 - i5;
            i4 = i6;
            for (i10 = this.g[i9].length - 1; i10 > -1; i10--)
            {
              i7 = Math.min(i4 - i5, this.h[i9][i10]);
              if (i7 > 0)
              {
                i3 -= i7;
                i4 -= i7;
                System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
              }
              localzzz = this.g[i9][i10].a(paramzzu, 14, Double.valueOf(0.0D));
              if (!localzzz.c())
              {
                char[] arrayOfChar2 = localzzz.g();
                i3 -= arrayOfChar2.length;
                System.arraycopy(arrayOfChar2, 0, arrayOfChar1, i3, arrayOfChar2.length);
                if (i2 > 0) {
                  for (i16 = 0; i16 < i2; i16++) {
                    if (arrayOfInt1[i16] >= i4) {
                      while (i16 < i2)
                      {
                        arrayOfInt1[i16] += arrayOfChar2.length;
                        i16++;
                      }
                    }
                  }
                }
              }
              i7 = localzzz.j();
              if (i7 > 0) {
                for (i14 = i7 - 1; i14 > -1; i14--)
                {
                  paramzzz.a(i8, i3 + localzzz.b(i14));
                  i8--;
                }
              }
            }
            i7 = i4 - i5;
            if (i7 > 0)
            {
              i3 -= i7;
              i4 -= i7;
              System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
            }
            i3 += this.j[i9] + i6 - i5;
            i4 = i6;
            if (this.k != null) {
              i8 = this.k[i9];
            }
          }
          else
          {
            for (i10 = 0; i10 < this.g[i9].length; i10++)
            {
              i7 = Math.min(i6 - i4, this.h[i9][i10]);
              if (i7 > 0)
              {
                System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
                i3 += i7;
                i4 += i7;
              }
              localzzz = this.g[i9][i10].a(paramzzu, 14, Double.valueOf(0.0D));
              i7 = localzzz.j();
              if (i7 > 0) {
                for (i14 = 0; i14 < i7; i14++)
                {
                  paramzzz.a(i8, i3 + localzzz.b(i14));
                  i8++;
                }
              }
              if (!localzzz.c())
              {
                char[] arrayOfChar3 = localzzz.g();
                System.arraycopy(arrayOfChar3, 0, arrayOfChar1, i3, arrayOfChar3.length);
                i3 += arrayOfChar3.length;
                if (i2 > 0) {
                  for (i16 = 0; i16 < i2; i16++) {
                    if (arrayOfInt1[i16] >= i4) {
                      while (i16 < i2)
                      {
                        arrayOfInt1[i16] += arrayOfChar3.length;
                        i16++;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      i7 = paramArrayOfChar.length - i4;
      System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
      paramArrayOfChar = arrayOfChar1;
    }
    if (i2 > 0)
    {
      arrayOfChar1 = new char[paramArrayOfChar.length - i2];
      int[] arrayOfInt3;
      if (this.l != null)
      {
        arrayOfInt3 = new int[i2 + this.l.length];
        paramzzz.a(arrayOfInt3);
        i9 = 0;
        i10 = 0;
        i4 = 0;
        i3 = 0;
        for (int i12 = 0; i12 < i2; i12++)
        {
          while (i10 < this.l.length)
          {
            arrayOfInt3[i9] = this.l[i10];
            int i15 = paramzzz.b(i9);
            if (i15 > arrayOfInt1[i12]) {
              break;
            }
            paramzzz.a(i9, i15 - i12);
            i9++;
            i10++;
          }
          i7 = arrayOfInt1[i12] - i4;
          System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
          i3 += i7;
          i4 += i7 + 1;
          arrayOfInt3[i9] = zzz.a(false, arrayOfInt1[i12] - i12, paramzzu.d());
          i9++;
        }
        while (i10 < this.l.length)
        {
          arrayOfInt3[i9] = this.l[i10];
          paramzzz.a(i9, paramzzz.b(i9) - i2);
          i9++;
          i10++;
        }
        i7 = paramArrayOfChar.length - i4;
        System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
      }
      else
      {
        arrayOfInt3 = new int[i2];
        paramzzz.a(arrayOfInt3);
        i4 = 0;
        i3 = 0;
        for (i9 = 0; i9 < i2; i9++)
        {
          i7 = arrayOfInt1[i9] - i4;
          System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
          i3 += i7;
          i4 += i7 + 1;
          arrayOfInt3[i9] = zzz.a(false, arrayOfInt1[i9] - i9, paramzzu.d());
        }
        i7 = paramArrayOfChar.length - i4;
        System.arraycopy(paramArrayOfChar, i4, arrayOfChar1, i3, i7);
      }
      paramArrayOfChar = arrayOfChar1;
    }
    paramzzz.a(2, paramArrayOfChar);
  }
  
  protected void a(zmv paramzmv, String paramString)
  {
    this.g = paramzmv.e();
    if (this.g != null)
    {
      this.h = paramzmv.f();
      this.j = paramzmv.g();
      this.n = paramzmv.d();
      this.i = paramzmv.h();
      this.l = paramzmv.i();
      this.k = paramzmv.j();
      this.m = paramzmv.k();
      int[] arrayOfInt;
      int i2;
      for (int i1 = 0; i1 < this.h.length; i1++)
      {
        arrayOfInt = this.h[i1];
        if (arrayOfInt != null) {
          if (this.i[i1] != 0) {
            for (i2 = 1; i2 < arrayOfInt.length; i2++) {
              arrayOfInt[(i2 - 1)] -= arrayOfInt[i2];
            }
          } else {
            for (i2 = arrayOfInt.length - 1; i2 > 0; i2--) {
              arrayOfInt[i2] -= arrayOfInt[(i2 - 1)];
            }
          }
        }
      }
      if (this.m != null)
      {
        this.o = 0;
        this.p = 0;
        for (i1 = 0; i1 < this.m.length; i1++) {
          if (this.m[i1] != null) {
            for (int i4 : this.m[i1]) {
              if (i4 < 0) {
                this.o += 1;
              } else {
                this.p += 1;
              }
            }
          }
        }
      }
      this.q = new int[this.g.length + 1];
      this.r = new int[this.q.length];
    }
    this.f = new zbph(this.a, paramString);
  }
  
  protected int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, zmv paramzmv)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case '0': 
      paramzmv.a(true);
      paramzmv.a();
      paramzmv.c().append('#');
      break;
    case '#': 
      paramzmv.a();
      paramzmv.c().append(paramArrayOfChar[paramInt1]);
      break;
    case ',': 
      if (this.c.c() < 0) {
        paramzmv.c().append(',');
      } else {
        paramzmv.b().append(',');
      }
      break;
    case '.': 
      if (this.c.c() < 0)
      {
        paramzmv.a(true, paramzmv.c().length());
        this.c.b(paramzmv.c().length());
        paramzmv.c().append('.');
      }
      else
      {
        paramzmv.b().append(this.d);
      }
      break;
    case '?': 
      paramzmv.a(false);
      paramzmv.a();
      paramzmv.c().append('#');
      break;
    case '[': 
      return this.a.a(paramArrayOfChar, paramInt1, paramInt2, paramzmv.b(), false);
    default: 
      return b(paramArrayOfChar, paramInt1, paramInt2, paramzmv.b());
    }
    return paramInt1 + 1;
  }
  
  protected void a(zzx paramzzx)
  {
    this.d = paramzzx.f().d();
    this.e = paramzzx.f().e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */