package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.zs;

class zfi
{
  int a;
  int b;
  CellArea c;
  private za d;
  
  public zfi(CellArea paramCellArea, int paramInt1, int paramInt2, zaiw paramzaiw)
  {
    this.c = paramCellArea;
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = new za(paramzaiw);
  }
  
  public zaiw a(zbap paramzbap, zaca paramzaca)
  {
    return this.d.a(this, paramzbap, paramzaca);
  }
  
  boolean a()
  {
    return this.d.a();
  }
  
  public String toString()
  {
    return zs.a(this.c);
  }
  
  private class za
  {
    private Object b;
    private int c = 0;
    private int d = 0;
    private byte e = 0;
    
    za(zaiw paramzaiw)
    {
      this.b = paramzaiw;
    }
    
    boolean a()
    {
      return this.e != 0;
    }
    
    zaiw a(zfi paramzfi, zbap paramzbap, zaca paramzaca)
    {
      Object localObject;
      if (this.e == 0) {
        if (this.b == null)
        {
          this.e = 1;
        }
        else if ((this.b instanceof zayu))
        {
          localObject = (zayu)this.b;
          if (!((zayu)localObject).a()) {
            localObject = (zayu)((zayu)localObject).b(paramzaca);
          }
          ((zayu)localObject).b(true);
          ((zayu)localObject).d(5);
          a((zaiw)localObject);
        }
        else if ((this.b instanceof zazk))
        {
          localObject = (zazk)this.b;
          if (!((zazk)localObject).a()) {
            localObject = (zazk)((zazk)localObject).b(paramzaca);
          }
          a((zaiw)localObject);
        }
        else
        {
          this.e = 4;
        }
      }
      int i;
      int j;
      switch (this.e)
      {
      case 1: 
      case 17: 
        if (this.b == null) {
          return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
        }
        localObject = (zaie[])this.b;
        i = this.c + paramzfi.c.StartRow - paramzbap.b();
        j = paramzbap.d() - paramzfi.c.StartColumn - this.d;
        if (paramzaca.m != 0) {
          if ((paramzbap.c()) || ((paramzaca.m & 0x1) == 0))
          {
            if ((!paramzbap.e()) && ((paramzaca.m & 0x2) != 0))
            {
              if ((i < 0) || (i >= paramzbap.q()) || (j + paramzaca.l.EndColumn - paramzaca.e + paramzbap.p() < 1) || (j + paramzaca.l.StartColumn - paramzaca.e >= localObject.length)) {
                return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
              }
              if (paramzbap.q() == 1) {
                return new zayq((zaie[])localObject, false, j, paramzbap.p(), 9, zabg.a, paramzaca.e, true);
              }
              return new zayt((zaie[])localObject, false, j, paramzbap.p(), i, paramzbap.q(), 9, zabg.a, paramzaca.d, paramzaca.e, false, true);
            }
          }
          else
          {
            if ((i + paramzaca.d - paramzaca.l.StartRow < 0) || (i + paramzaca.d - paramzaca.l.EndRow >= paramzbap.q())) {
              return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
            }
            if (paramzbap.e()) {
              return a(paramzbap, paramzaca, (zaie[])localObject, j, i, true, false);
            }
            if ((j + paramzaca.l.EndColumn - paramzaca.e + paramzbap.p() < 1) || (j + paramzaca.l.StartColumn - paramzaca.e >= localObject.length)) {
              return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
            }
            return new zayt((zaie[])localObject, false, j, paramzbap.p(), i, paramzbap.q(), 9, zabg.a, paramzaca.d, paramzaca.e, true, true);
          }
        }
        if ((i < 0) || (i >= paramzbap.q())) {
          return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
        }
        return a(paramzbap, paramzaca, (zaie[])localObject, j, i, false, false);
      case 2: 
      case 18: 
        if (this.b == null) {
          return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
        }
        localObject = (zaie[])this.b;
        i = this.d + paramzfi.c.StartColumn - paramzbap.d();
        j = paramzbap.b() - paramzfi.c.StartRow - this.c;
        if (paramzaca.m != 0) {
          if ((paramzbap.e()) || ((paramzaca.m & 0x2) == 0))
          {
            if ((!paramzbap.c()) && ((paramzaca.m & 0x1) != 0))
            {
              if ((i < 0) || (i >= paramzbap.p()) || (j + paramzaca.l.EndRow - paramzaca.d + paramzbap.q() < 1) || (j + paramzaca.l.StartRow - paramzaca.d >= localObject.length)) {
                return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
              }
              if (paramzbap.p() == 1) {
                return new zayq((zaie[])localObject, true, j, paramzbap.q(), 9, zabg.a, paramzaca.d, true);
              }
              return new zayt((zaie[])localObject, true, j, paramzbap.q(), i, paramzbap.p(), 9, zabg.a, paramzaca.d, paramzaca.e, true, false);
            }
          }
          else
          {
            if ((i + paramzaca.e - paramzaca.l.StartColumn < 0) || (i + paramzaca.e - paramzaca.l.EndColumn >= paramzbap.p())) {
              return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
            }
            if (paramzbap.c()) {
              return b(paramzbap, paramzaca, (zaie[])localObject, j, i, false, true);
            }
            if ((j + paramzaca.l.EndRow - paramzaca.d + paramzbap.q() < 1) || (j + paramzaca.l.StartRow - paramzaca.d >= localObject.length)) {
              return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
            }
            return new zayt((zaie[])localObject, true, j, paramzbap.q(), i, paramzbap.p(), 9, zabg.a, paramzaca.d, paramzaca.e, true, true);
          }
        }
        if ((i < 0) || (i >= paramzbap.p())) {
          return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
        }
        return b(paramzbap, paramzaca, (zaie[])localObject, j, i, false, false);
      case 3: 
      case 19: 
        localObject = (Object[])this.b;
        zaie[][] arrayOfzaie = (zaie[][])localObject[0];
        int[] arrayOfInt = localObject[1] == null ? null : (int[])localObject[1];
        int k = ((Integer)localObject[2]).intValue();
        int m = paramzbap.b() - paramzfi.c.StartRow - this.c;
        int n = paramzbap.d() - paramzfi.c.StartColumn - this.d;
        if (paramzaca.m != 0) {
          if ((paramzbap.c()) || ((paramzaca.m & 0x1) == 0))
          {
            if ((m < 0) || (m >= arrayOfzaie.length)) {
              return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
            }
            if ((!paramzbap.e()) && ((paramzaca.m & 0x2) != 0))
            {
              if (paramzbap.q() == 1)
              {
                zaie[] arrayOfzaie1 = arrayOfzaie[m];
                if (arrayOfzaie1 == null) {
                  return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
                }
                int i1 = (arrayOfInt != null) && (m < arrayOfInt.length) ? n - arrayOfInt[m] : n;
                if ((i1 + paramzaca.l.EndColumn - paramzaca.e + paramzbap.p() < 1) || (i1 + paramzaca.l.StartColumn - paramzaca.e >= arrayOfzaie1.length)) {
                  return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
                }
                return new zayq(arrayOfzaie1, false, i1, paramzbap.p(), 9, zabg.a, paramzaca.e, true);
              }
              if ((n + paramzaca.l.EndColumn - paramzaca.e + paramzbap.p() < 1) || (n + paramzaca.l.StartColumn - paramzaca.e >= k)) {
                return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
              }
              return new zays(arrayOfzaie, m, n, arrayOfInt, paramzbap.q(), paramzbap.p(), 9, zabg.a, paramzaca.d, paramzaca.e, false, true, k);
            }
          }
          else
          {
            if ((m + paramzaca.l.EndRow - paramzaca.d + paramzbap.q() < 1) || (m + paramzaca.l.StartRow - paramzaca.d >= arrayOfzaie.length)) {
              return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
            }
            if (paramzbap.e())
            {
              if (n <= -paramzbap.p()) {
                return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
              }
              return new zays(arrayOfzaie, m, n, arrayOfInt, paramzbap.q(), paramzbap.p(), 9, zabg.a, paramzaca.d, paramzaca.e, true, false, k);
            }
            if ((n + paramzaca.l.EndColumn - paramzaca.e + paramzbap.p() < 1) || (n + paramzaca.l.StartColumn - paramzaca.e >= k)) {
              return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
            }
            return new zays(arrayOfzaie, m, n, arrayOfInt, paramzbap.q(), paramzbap.p(), 9, zabg.a, paramzaca.d, paramzaca.e, true, true, k);
          }
        }
        if (paramzbap.q() == 1)
        {
          if ((m < 0) || (m >= arrayOfzaie.length) || (arrayOfzaie[m] == null)) {
            return new zazj(zabg.a, 9, 1, paramzbap.p());
          }
          return a(paramzbap, paramzaca, arrayOfzaie[m], (arrayOfInt != null) && (m < arrayOfInt.length) ? n - arrayOfInt[m] : n, 0, false, false);
        }
        if (paramzbap.p() == 1)
        {
          if ((n < 0) || (n >= k) || (m >= arrayOfzaie.length) || (m + paramzbap.q() < 1)) {
            return new zazj(zabg.a, 9, paramzbap.q(), 1);
          }
          return new zayr(arrayOfzaie, m, n, arrayOfInt, paramzbap.q(), 9, zabg.a, paramzaca.d, paramzaca.e, false, false, k);
        }
        if ((m >= arrayOfzaie.length) || (m + paramzbap.q() < 1) || (n >= k) || (n + paramzbap.p() < 1)) {
          return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
        }
        return new zays(arrayOfzaie, m, n, arrayOfInt, paramzbap.q(), paramzbap.p(), 9, zabg.a, paramzaca.d, paramzaca.e, false, false, k);
      case 4: 
        return (zaiw)this.b;
      }
      return null;
    }
    
    private zaiw a(zbap paramzbap, zaca paramzaca, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (paramzbap.p() == 1)
      {
        if ((paramInt1 < 0) || (paramInt1 >= paramArrayOfzaie.length) || (paramArrayOfzaie[paramInt1] == null)) {
          return new zazj(zabg.a, 9, paramzbap.q(), 1);
        }
        return new zazr(paramArrayOfzaie[paramInt1], zabg.a, 9, paramzbap.q(), 1, paramInt2, 0, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
      }
      if ((paramInt1 >= paramArrayOfzaie.length) || (paramInt1 + paramzbap.p() < 1)) {
        return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
      }
      if (paramInt1 + paramzbap.p() == 1) {
        return new zazr(paramArrayOfzaie[0], zabg.a, 9, paramzbap.q(), paramzbap.p(), paramInt2, -paramInt1, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
      }
      if (paramInt1 == paramArrayOfzaie.length - 1) {
        return new zazr(paramArrayOfzaie[paramInt1], zabg.a, 9, paramzbap.q(), paramzbap.p(), paramInt2, 0, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
      }
      if (paramzbap.q() == 1) {
        return new zayq(paramArrayOfzaie, false, paramInt1, paramzbap.p(), 9, zabg.a, paramzaca.e, paramBoolean2);
      }
      return new zayt(paramArrayOfzaie, false, paramInt1, paramzbap.p(), paramInt2, paramzbap.q(), 9, zabg.a, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
    }
    
    private zaiw b(zbap paramzbap, zaca paramzaca, zaie[] paramArrayOfzaie, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (paramzbap.q() == 1)
      {
        if ((paramInt1 < 0) || (paramInt1 >= paramArrayOfzaie.length) || (paramArrayOfzaie[paramInt1] == null)) {
          return new zazj(zabg.a, 9, 1, paramzbap.p());
        }
        return new zazr(paramArrayOfzaie[paramInt1], zabg.a, 9, 1, paramzbap.p(), 0, paramInt2, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
      }
      if ((paramInt1 >= paramArrayOfzaie.length) || (paramInt1 + paramzbap.q() < 1)) {
        return new zazj(zabg.a, 9, paramzbap.q(), paramzbap.p());
      }
      if (paramInt1 + paramzbap.q() == 1) {
        return new zazr(paramArrayOfzaie[0], zabg.a, 9, paramzbap.q(), paramzbap.p(), -paramInt1, paramInt2, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
      }
      if (paramInt1 == paramArrayOfzaie.length - 1) {
        return new zazr(paramArrayOfzaie[paramInt1], zabg.a, 9, paramzbap.q(), paramzbap.p(), 0, paramInt2, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
      }
      if (paramzbap.p() == 1) {
        return new zayq(paramArrayOfzaie, true, paramInt1, paramzbap.q(), 9, zabg.a, paramzaca.d, paramBoolean1);
      }
      return new zayt(paramArrayOfzaie, true, paramInt1, paramzbap.q(), paramInt2, paramzbap.p(), 9, zabg.a, paramzaca.d, paramzaca.e, paramBoolean1, paramBoolean2);
    }
    
    private void a(zaiw paramzaiw)
    {
      this.b = null;
      int i = paramzaiw.s();
      if (i < 0)
      {
        this.e = 1;
        return;
      }
      int j = paramzaiw.r();
      int k = paramzaiw.t();
      int m = paramzaiw.u();
      paramzaiw.f();
      Object localObject3;
      if (i == j)
      {
        int n = 1;
        Object localObject2;
        if (m == k)
        {
          paramzaiw.g();
          localObject2 = paramzaiw.h();
          if (((zaie)localObject2).b() == 13) {
            n = 0;
          }
          this.b = new zaie[] { localObject2 };
          this.c = j;
          this.d = k;
        }
        else
        {
          this.c = j;
          this.d = k;
          localObject2 = new zaie[m - k + 1];
          zc.a((Object[])localObject2, 0, localObject2.length, zabg.a);
          this.b = localObject2;
          while (paramzaiw.g())
          {
            localObject3 = paramzaiw.h();
            if ((n != 0) && (((zaie)localObject3).b() == 13)) {
              n = 0;
            }
            localObject2[(paramzaiw.j() - k)] = localObject3;
          }
        }
        if (n != 0) {
          this.e = 1;
        } else {
          this.e = 17;
        }
      }
      else
      {
        Object localObject1;
        if (m == k)
        {
          this.c = j;
          this.d = k;
          localObject1 = new zaie[i - j + 1];
          zc.a((Object[])localObject1, 0, localObject1.length, zabg.a);
          this.b = localObject1;
          int i1 = 1;
          while (paramzaiw.g())
          {
            localObject3 = paramzaiw.h();
            if ((i1 != 0) && (((zaie)localObject3).b() == 13)) {
              i1 = 0;
            }
            localObject1[(paramzaiw.i() - j)] = localObject3;
          }
          if (i1 != 0) {
            this.e = 2;
          } else {
            this.e = 18;
          }
        }
        else
        {
          this.c = j;
          localObject1 = new zaie[i - j + 1][];
          int[] arrayOfInt = new int[localObject1.length];
          m -= k;
          localObject3 = new zaie[m + 1];
          zc.a((Object[])localObject3, 0, localObject3.length, zabg.a);
          int i2 = -1;
          int i3 = -1;
          int i4 = -1;
          int i5 = 1;
          int i6 = 1;
          zaie[] arrayOfzaie;
          while (paramzaiw.g())
          {
            i4 = paramzaiw.i() - j;
            if (i4 != i3)
            {
              if (i2 > -1)
              {
                if ((arrayOfInt[i3] != 0) || (i2 != m))
                {
                  arrayOfzaie = new zaie[i2 - arrayOfInt[i3] + 1];
                  System.arraycopy(localObject3, arrayOfInt[i3], arrayOfzaie, 0, arrayOfzaie.length);
                  localObject1[i3] = arrayOfzaie;
                }
                else
                {
                  localObject1[i3] = localObject3;
                  localObject3 = new zaie[localObject3.length];
                }
                zc.a((Object[])localObject3, 0, localObject3.length, zabg.a);
                i2 = paramzaiw.j() - k;
                if ((i5 != 0) && (i2 != arrayOfInt[i3])) {
                  i5 = 0;
                }
              }
              else
              {
                i2 = paramzaiw.j() - k;
              }
              i3 = i4;
              arrayOfInt[i4] = i2;
            }
            else
            {
              i2 = paramzaiw.j() - k;
            }
            zaie localzaie = paramzaiw.h();
            if ((i6 != 0) && (localzaie.b() == 13)) {
              i6 = 0;
            }
            localObject3[i2] = localzaie;
          }
          if (i6 != 0) {
            this.e = 3;
          } else {
            this.e = 19;
          }
          if ((arrayOfInt[i3] != 0) || (i2 != m))
          {
            arrayOfzaie = new zaie[i2 - arrayOfInt[i3] + 1];
            System.arraycopy(localObject3, arrayOfInt[i3], arrayOfzaie, 0, arrayOfzaie.length);
            localObject1[i3] = arrayOfzaie;
          }
          else
          {
            localObject1[i3] = localObject3;
          }
          if (i5 != 0)
          {
            this.d = (k + arrayOfInt[i3]);
            arrayOfInt = null;
          }
          else
          {
            this.d = k;
          }
          this.b = new Object[] { localObject1, arrayOfInt, Integer.valueOf(m + k + 1) };
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */