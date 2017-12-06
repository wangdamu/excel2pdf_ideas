package com.aspose.cells;

class zacw
{
  private zabe a;
  private zaif b;
  private zaca c;
  private zaiw[] d;
  private zaie[] e;
  private int f;
  private boolean g = false;
  private boolean h = false;
  private int i = 1;
  private int j = 1;
  private int k = 0;
  private int l = 0;
  private int m = 0;
  private int n;
  private int o;
  private int p;
  
  public zacw(zabe paramzabe, zaca paramzaca)
  {
    this.a = paramzabe;
    this.c = paramzaca;
    this.b = paramzabe.p().c();
    this.d = new zaiw[paramzabe.q()];
    this.e = new zaie[this.d.length];
    this.n = this.d.length;
    this.o = this.n;
    this.p = this.n;
  }
  
  public void a(int paramInt, zaie paramzaie)
  {
    this.e[paramInt] = paramzaie;
    if (this.c.j) {
      this.c.m &= paramzaie.b(this.c, this.b.b(paramInt) == 64);
    }
  }
  
  public void a(int paramInt, zaiw paramzaiw)
  {
    if (paramzaiw.l())
    {
      this.e[paramInt] = paramzaiw.a(0, 0);
      if (this.c.j) {
        this.c.m &= this.a.r()[paramInt].b(this.c, this.b.b(paramInt) == 64);
      }
      return;
    }
    this.d[paramInt] = paramzaiw;
    if (paramzaiw.m())
    {
      if (this.c.j)
      {
        if (paramzaiw.x()) {
          this.c.m &= 0xFFFFFFFE;
        }
        if (this.h)
        {
          if (paramzaiw.y() != ((this.f & 0x2) == 0)) {
            this.c.m &= 0xFFFFFFFD;
          }
        }
        else {
          this.f = (paramzaiw.y() ? 1 : 3);
        }
      }
      this.k += 1;
      if (this.k == 1) {
        this.n = paramInt;
      }
      if (this.j > 1)
      {
        if (paramzaiw.d() != this.j)
        {
          this.g = true;
          if (this.c.j) {
            this.c.m &= 0xFFFFFFFD;
          }
          if (paramzaiw.d() > this.j) {
            this.j = paramzaiw.d();
          }
        }
      }
      else {
        this.j = paramzaiw.d();
      }
    }
    else if (paramzaiw.n())
    {
      if (this.c.j)
      {
        if (paramzaiw.y()) {
          this.c.m &= 0xFFFFFFFD;
        }
        if (this.h)
        {
          if (paramzaiw.x() != ((this.f & 0x1) == 0)) {
            this.c.m &= 0xFFFFFFFE;
          }
        }
        else {
          this.f = (paramzaiw.x() ? 2 : 3);
        }
      }
      this.l += 1;
      if (this.l == 1) {
        this.o = paramInt;
      }
      if (this.i > 1)
      {
        if (paramzaiw.c() != this.i)
        {
          this.g = true;
          if (this.c.j) {
            this.c.m &= 0xFFFFFFFE;
          }
          if (paramzaiw.c() > this.i) {
            this.i = paramzaiw.c();
          }
        }
      }
      else {
        this.i = paramzaiw.c();
      }
    }
    else
    {
      if (this.c.j) {
        if (this.h)
        {
          if (paramzaiw.x() != ((this.f & 0x1) == 0)) {
            this.c.m &= 0xFFFFFFFE;
          }
          if (paramzaiw.y() != ((this.f & 0x2) == 0)) {
            this.c.m &= 0xFFFFFFFD;
          }
        }
        else if (paramzaiw.x())
        {
          if (paramzaiw.y()) {
            this.f = 0;
          } else {
            this.f = 2;
          }
        }
        else if (paramzaiw.y())
        {
          this.f = 1;
        }
        else
        {
          this.f = 3;
        }
      }
      this.m += 1;
      if (this.m == 1) {
        this.p = paramInt;
      }
      if (this.i > 1)
      {
        if (paramzaiw.c() != this.i)
        {
          this.g = true;
          if (this.c.j) {
            this.c.m &= 0xFFFFFFFE;
          }
          if (paramzaiw.c() > this.i) {
            this.i = paramzaiw.c();
          }
        }
      }
      else {
        this.i = paramzaiw.c();
      }
      if (this.j > 1)
      {
        if (paramzaiw.d() != this.j)
        {
          this.g = true;
          if (this.c.j) {
            this.c.m &= 0xFFFFFFFD;
          }
          if (paramzaiw.d() > this.j) {
            this.j = paramzaiw.d();
          }
        }
      }
      else {
        this.j = paramzaiw.d();
      }
    }
  }
  
  zaie[] a()
  {
    return this.e;
  }
  
  public zaiw b()
  {
    Object localObject3;
    int i5;
    int i6;
    zaiw localzaiw1;
    if (this.i == 1)
    {
      if (this.j == 1) {
        return null;
      }
      switch (this.k)
      {
      case 1: 
        return new zazd(this.d[this.n], new zmh(this.c, this.a, this.e, this.c.d, this.c.e, this.n), this.c);
      case 2: 
        int i1 = this.n + 1;
        if ((this.e.length > 2) && (this.d[i1] == null))
        {
          i1++;
          while (this.d[i1] == null) {
            i1++;
          }
        }
        return zbam.a(this.d[this.n], this.d[i1], this.c, new zmi(this.c, this.a, this.e, this.c.d, this.c.e, this.n, i1));
      }
      if (this.k != this.d.length)
      {
        localObject1 = new zaiw[this.k];
        localObject3 = null;
        i5 = 0;
        i6 = 0;
        for (int i8 = 0; i8 < this.d.length; i8++)
        {
          localzaiw1 = this.d[i8];
          if (localzaiw1 != null)
          {
            if ((this.g) && (localzaiw1.d() < this.j))
            {
              localzaiw1 = zbam.a(localzaiw1, this.j);
              this.d[i8] = localzaiw1;
            }
            if (i5 != 0) {
              localObject3[i6] = i8;
            }
            localObject1[i6] = localzaiw1;
            i6++;
          }
          else if ((i5 == 0) && (i6 > 0) && (i6 < this.k))
          {
            i5 = 1;
            localObject3 = new int[this.k];
            i11 = i8 - i6;
            localObject3[0] = i11;
            i11++;
            if (i11 < i8) {
              for (i12 = 1;; i12++)
              {
                localObject3[i12] = i11;
                i11++;
                if (i11 == i8) {
                  break;
                }
              }
            }
          }
        }
        Object localObject4;
        if (i5 != 0) {
          localObject4 = new zme(this.c, this.a, this.e, this.c.d, this.c.e, (int[])localObject3);
        } else if (this.n > 0) {
          localObject4 = new zmf(this.c, this.a, this.e, this.c.d, this.c.e, this.n, this.k);
        } else {
          localObject4 = new zmg(this.c, this.a, this.e, this.c.d, this.c.e, this.k);
        }
        return new zazb((zaiw[])localObject1, (zaht)localObject4, this.c);
      }
      Object localObject1 = new zmg(this.c, this.a, this.e, this.c.d, this.c.e, this.k);
      if (this.g) {
        for (i5 = 0; i5 < this.d.length; i5++)
        {
          localObject3 = this.d[i5];
          if ((localObject3 != null) && (((zaiw)localObject3).d() < this.j)) {
            this.d[i5] = zbam.a((zaiw)localObject3, this.j);
          }
        }
      }
      return new zazb(this.d, (zaht)localObject1, this.c);
    }
    if (this.j == 1)
    {
      switch (this.l)
      {
      case 1: 
        return new zazd(this.d[this.o], new zmh(this.c, this.a, this.e, this.c.d, this.c.e, this.o), this.c);
      case 2: 
        int i2 = this.o + 1;
        if ((this.e.length > 2) && (this.d[i2] == null))
        {
          i2++;
          while (this.d[i2] == null) {
            i2++;
          }
        }
        return zbam.a(this.d[this.o], this.d[i2], this.c, new zmi(this.c, this.a, this.e, this.c.d, this.c.e, this.o, i2));
      }
      if (this.l != this.d.length)
      {
        localObject2 = new zaiw[this.l];
        localObject3 = null;
        i5 = 0;
        i6 = 0;
        for (int i9 = 0; i9 < this.d.length; i9++)
        {
          localzaiw1 = this.d[i9];
          if (localzaiw1 != null)
          {
            if ((this.g) && (localzaiw1.c() < this.i))
            {
              localzaiw1 = zbam.a(localzaiw1, this.i);
              this.d[i9] = localzaiw1;
            }
            if (i5 != 0) {
              localObject3[i6] = i9;
            }
            localObject2[i6] = localzaiw1;
            i6++;
          }
          else if ((i5 == 0) && (i6 > 0) && (i6 < this.l))
          {
            i5 = 1;
            localObject3 = new int[this.l];
            i11 = i9 - i6;
            localObject3[0] = i11;
            i11++;
            if (i11 < i9) {
              for (i12 = 1;; i12++)
              {
                localObject3[i12] = i11;
                i11++;
                if (i11 == i9) {
                  break;
                }
              }
            }
          }
        }
        Object localObject5;
        if (i5 != 0) {
          localObject5 = new zme(this.c, this.a, this.e, this.c.d, this.c.e, (int[])localObject3);
        } else if (this.o > 0) {
          localObject5 = new zmf(this.c, this.a, this.e, this.c.d, this.c.e, this.o, this.l);
        } else {
          localObject5 = new zmg(this.c, this.a, this.e, this.c.d, this.c.e, this.l);
        }
        return new zazb((zaiw[])localObject2, (zaht)localObject5, this.c);
      }
      Object localObject2 = new zmg(this.c, this.a, this.e, this.c.d, this.c.e, this.l);
      if (this.g) {
        for (i5 = 0; i5 < this.d.length; i5++)
        {
          localObject3 = this.d[i5];
          if ((localObject3 != null) && (((zaiw)localObject3).c() < this.i)) {
            this.d[i5] = zbam.a((zaiw)localObject3, this.i);
          }
        }
      }
      return new zazb(this.d, (zaht)localObject2, this.c);
    }
    int i3 = this.m + this.k + this.l;
    switch (i3)
    {
    case 1: 
      return new zazd(this.d[this.p], new zmh(this.c, this.a, this.e, this.c.d, this.c.e, this.p), this.c);
    case 2: 
      int i4;
      if (this.m == 2)
      {
        i4 = this.p;
        i5 = this.p + 1;
        if ((this.e.length > 2) && (this.d[i5] == null))
        {
          i5++;
          while (this.d[i5] == null) {
            i5++;
          }
        }
      }
      else if (this.m == 1)
      {
        i4 = this.p;
        i5 = this.n < this.d.length ? this.n : this.o;
      }
      else
      {
        i4 = this.n;
        i5 = this.o;
      }
      return zbam.a(this.d[i4], this.d[i5], this.c, new zmi(this.c, this.a, this.e, this.c.d, this.c.e, i4, i5));
    }
    zaiw[] arrayOfzaiw = null;
    int[] arrayOfInt;
    if ((this.p > this.n) || (this.p > this.o) || (this.n > this.o))
    {
      i5 = 1;
      arrayOfInt = new int[i3];
    }
    else
    {
      i5 = 0;
      arrayOfInt = null;
    }
    if ((i5 != 0) || (i3 != this.d.length)) {
      arrayOfzaiw = new zaiw[i3];
    }
    int i7 = 0;
    int i10 = 0;
    int i11 = this.m;
    int i12 = this.m + this.k;
    int i13 = i12;
    for (int i14 = 0; i14 < this.d.length; i14++)
    {
      zaiw localzaiw2 = this.d[i14];
      if (localzaiw2 != null)
      {
        i7++;
        if (localzaiw2.m())
        {
          if ((this.g) && (localzaiw2.d() < this.j))
          {
            localzaiw2 = zbam.a(localzaiw2, this.j);
            this.d[i14] = localzaiw2;
          }
          if (i5 != 0)
          {
            arrayOfInt[i11] = i14;
            arrayOfzaiw[i11] = localzaiw2;
            i11++;
          }
          else if (i10 < this.m)
          {
            i5 = 1;
            arrayOfInt = new int[i3];
            if (arrayOfzaiw == null)
            {
              arrayOfzaiw = new zaiw[i3];
              a(arrayOfInt, i10, i14, arrayOfzaiw);
            }
            else
            {
              a(arrayOfInt, i10, i14, null);
            }
            arrayOfzaiw[i11] = localzaiw2;
            i11++;
          }
        }
        else if (localzaiw2.n())
        {
          if ((this.g) && (localzaiw2.c() < this.i))
          {
            localzaiw2 = zbam.a(localzaiw2, this.i);
            this.d[i14] = localzaiw2;
          }
          if (i5 != 0)
          {
            arrayOfInt[i12] = i14;
            arrayOfzaiw[i12] = localzaiw2;
            i12++;
          }
          else if (i10 < this.m)
          {
            i5 = 1;
            arrayOfInt = new int[i3];
            if (arrayOfzaiw == null)
            {
              arrayOfzaiw = new zaiw[i3];
              a(arrayOfInt, i10, i14, arrayOfzaiw);
            }
            else
            {
              a(arrayOfInt, i10, i14, null);
            }
            arrayOfzaiw[i12] = localzaiw2;
            i12++;
          }
          else if (i11 < i13)
          {
            i5 = 1;
            arrayOfInt = new int[i3];
            if (arrayOfzaiw == null)
            {
              arrayOfzaiw = new zaiw[i3];
              a(arrayOfInt, i10 + i11, i14, arrayOfzaiw);
            }
            else
            {
              a(arrayOfInt, i10 + i11, i14, null);
            }
            arrayOfzaiw[i12] = localzaiw2;
            i12++;
          }
        }
        else
        {
          if (this.g) {
            if (localzaiw2.c() < this.i)
            {
              if (localzaiw2.d() < this.j) {
                localzaiw2 = zbam.b(localzaiw2, this.i, this.j);
              } else {
                localzaiw2 = zbam.c(localzaiw2, this.i);
              }
              this.d[i14] = localzaiw2;
            }
            else if (localzaiw2.d() < this.j)
            {
              localzaiw2 = zbam.b(localzaiw2, this.j);
              this.d[i14] = localzaiw2;
            }
          }
          if (i5 != 0)
          {
            arrayOfInt[i10] = i14;
            arrayOfzaiw[i10] = localzaiw2;
            i10++;
          }
        }
      }
      else if ((i5 == 0) && (i10 > 0) && (i7 < i3))
      {
        i5 = 1;
        arrayOfInt = new int[i3];
        if (arrayOfzaiw == null)
        {
          arrayOfzaiw = new zaiw[i3];
          a(arrayOfInt, i10 + i11 + i12, i14, arrayOfzaiw);
        }
        else
        {
          a(arrayOfInt, i10 + i11 + i12, i14, null);
        }
      }
    }
    Object localObject6;
    if (i5 != 0) {
      localObject6 = new zme(this.c, this.a, this.e, this.c.d, this.c.e, arrayOfInt);
    } else if (this.p > 0) {
      localObject6 = new zmf(this.c, this.a, this.e, this.c.d, this.c.e, this.p, i3);
    } else {
      localObject6 = new zmg(this.c, this.a, this.e, this.c.d, this.c.e, i3);
    }
    if (this.m == i3) {
      return new zazc(arrayOfzaiw, (zaht)localObject6, this.c);
    }
    return new zaza(arrayOfzaiw, (zaht)localObject6, this.c, this.i, this.j, this.m, i13);
  }
  
  private void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, zaiw[] paramArrayOfzaiw)
  {
    switch (paramInt1)
    {
    case 0: 
      break;
    case 1: 
      if (paramArrayOfzaiw != null)
      {
        paramInt2--;
        paramArrayOfInt[0] = paramInt2;
        paramArrayOfzaiw[0] = this.d[paramInt2];
      }
      else
      {
        paramArrayOfInt[0] = (paramInt2 - 1);
      }
      break;
    case 2: 
      if (paramArrayOfzaiw != null)
      {
        paramInt2--;
        paramArrayOfInt[1] = paramInt2;
        paramArrayOfzaiw[1] = this.d[paramInt2];
        paramInt2--;
        paramArrayOfInt[0] = paramInt2;
        paramArrayOfzaiw[0] = this.d[paramInt2];
      }
      else
      {
        paramArrayOfInt[0] = (paramInt2 - 2);
        paramArrayOfInt[1] = (paramInt2 - 1);
      }
      break;
    default: 
      int i1 = paramInt2 - paramInt1;
      int i2 = 0;
      if (paramArrayOfzaiw != null) {
        for (;;)
        {
          paramArrayOfInt[i2] = i1;
          paramArrayOfzaiw[i2] = this.d[i2];
          i2++;
          if (i2 == paramInt1) {
            break;
          }
          i1++;
        }
      }
      for (;;)
      {
        paramArrayOfInt[i2] = i1;
        i2++;
        if (i2 == paramInt1) {
          break;
        }
        i1++;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */