package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zgb
{
  public static zaie a(zaca paramzaca, zaiw paramzaiw1, zaiw paramzaiw2, zait paramzait)
  {
    zaie localzaie1;
    zaie localzaie2;
    zaie localzaie3;
    if (paramzaiw1.l())
    {
      localzaie1 = paramzaiw1.a(0, 0).e(paramzaca);
      if (localzaie1.b() == 3)
      {
        localzaie2 = paramzaiw2.a(0, 0).e(paramzaca);
        if (localzaie2.b() == 3)
        {
          localzaie3 = paramzait.a(((zabb)localzaie1).o(), ((zabb)localzaie2).o());
          if ((localzaie3 != null) && (localzaie3.b() == 0)) {
            return localzaie3;
          }
          return paramzait.a();
        }
        if (localzaie2.b() == 0) {
          return localzaie2;
        }
        if (a(paramzaiw2)) {
          return zabc.f;
        }
        return paramzait.b();
      }
      if (localzaie1.b() == 0) {
        return localzaie1;
      }
      localzaie2 = paramzaiw2.a(0, 0).e(paramzaca);
      if (localzaie2.b() == 0) {
        return localzaie2;
      }
      if ((a(paramzaiw1)) || ((localzaie2.b() != 3) && (a(paramzaiw2)))) {
        return zabc.f;
      }
      return paramzait.b();
    }
    int i = 1;
    int j = 1;
    int k = 1;
    int m = 1;
    int n = 1;
    int i1 = 0;
    int i2 = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    int i5 = 0;
    int i6 = 0;
    paramzaiw1.f();
    paramzaiw2.f();
    int i3;
    if (paramzaiw1.g())
    {
      i3 = paramzaiw1.k();
    }
    else
    {
      i3 = paramzaiw1.e();
      i6 = 1;
    }
    int i4;
    if (paramzaiw2.g())
    {
      i4 = paramzaiw2.k();
    }
    else
    {
      i4 = paramzaiw2.e();
      i6 = 1;
    }
    for (;;)
    {
      if (i3 > i5)
      {
        if (m != 0)
        {
          m = 0;
          localzaie1 = paramzaiw1.o().e(paramzaca);
          if (localzaie1.b() == 3)
          {
            i = 0;
            i1 = 1;
            d1 = ((zabb)localzaie1).o();
          }
          else
          {
            if (localzaie1.b() == 0) {
              return localzaie1;
            }
            k = 0;
          }
        }
        if (i4 > i5)
        {
          if (n != 0)
          {
            n = 0;
            localzaie2 = paramzaiw2.o().e(paramzaca);
            if (localzaie2.b() == 3)
            {
              j = 0;
              i2 = 1;
              d2 = ((zabb)localzaie2).o();
            }
            else
            {
              if (localzaie2.b() == 0) {
                return localzaie2;
              }
              k = 0;
            }
          }
          if (i4 == i3)
          {
            if (k != 0)
            {
              localzaie3 = paramzait.a(d1, d2, i3 - i5);
              if (localzaie3 != null) {
                if (localzaie3 == zabg.a) {
                  k = 0;
                } else if (localzaie3.b() == 0) {
                  return localzaie3;
                }
              }
            }
            if (i6 != 0) {
              break;
            }
            localzaie1 = paramzaiw1.h().e(paramzaca);
            if (localzaie1.b() == 3)
            {
              i = 0;
              localzaie2 = paramzaiw2.h().e(paramzaca);
              if (localzaie2.b() == 3)
              {
                j = 0;
                localzaie3 = paramzait.a(((zabb)localzaie1).o(), ((zabb)localzaie2).o());
                if ((localzaie3 != null) && (localzaie3.b() == 0)) {
                  return localzaie3;
                }
              }
              else if (localzaie2.b() == 0)
              {
                return localzaie2;
              }
            }
            else
            {
              if (localzaie1.b() == 0) {
                return localzaie1;
              }
              localzaie2 = paramzaiw2.h().e(paramzaca);
              if (localzaie2.b() == 0) {
                return localzaie2;
              }
            }
            i5 = i3 + 1;
            if (paramzaiw1.g())
            {
              i3 = paramzaiw1.k();
            }
            else
            {
              i6 = 1;
              i3 = paramzaiw1.e();
              if (i3 == i5) {
                break;
              }
            }
            if (paramzaiw2.g())
            {
              i4 = paramzaiw2.k();
            }
            else
            {
              i6 = 1;
              i4 = paramzaiw2.e();
            }
          }
          else if (i4 > i3)
          {
            if (k != 0)
            {
              localzaie3 = paramzait.a(d1, d2, i3 - i5);
              if (localzaie3 != null) {
                if (localzaie3 == zabg.a) {
                  k = 0;
                } else if (localzaie3.b() == 0) {
                  return localzaie3;
                }
              }
            }
            localzaie1 = paramzaiw1.h().e(paramzaca);
            if (localzaie1.b() == 3)
            {
              i = 0;
              if (i2 != 0)
              {
                localzaie3 = paramzait.a(((zabb)localzaie1).o(), d2);
                if ((localzaie3 != null) && (localzaie3.b() == 0)) {
                  return localzaie3;
                }
              }
            }
            else if (localzaie1.b() == 0)
            {
              return localzaie1;
            }
            i5 = i3 + 1;
            if (paramzaiw1.g())
            {
              i3 = paramzaiw1.k();
            }
            else
            {
              i6 = 1;
              i3 = paramzaiw1.e();
              if (i3 == i5) {
                break;
              }
            }
          }
          else
          {
            if (k != 0)
            {
              localzaie3 = paramzait.a(d1, d2, i4 - i5);
              if (localzaie3 != null) {
                if (localzaie3 == zabg.a) {
                  k = 0;
                } else if (localzaie3.b() == 0) {
                  return localzaie3;
                }
              }
            }
            localzaie2 = paramzaiw2.h().e(paramzaca);
            if (localzaie2.b() == 3)
            {
              j = 0;
              if (i1 != 0)
              {
                localzaie3 = paramzait.a(d1, ((zabb)localzaie2).o());
                if ((localzaie3 != null) && (localzaie3.b() == 0)) {
                  return localzaie3;
                }
              }
            }
            else if (localzaie2.b() == 0)
            {
              return localzaie2;
            }
            i5 = i4 + 1;
            if (paramzaiw2.g())
            {
              i4 = paramzaiw2.k();
            }
            else
            {
              i6 = 1;
              i4 = paramzaiw2.e();
              if (i4 == i5) {
                break;
              }
            }
          }
        }
        else
        {
          localzaie2 = paramzaiw2.h().e(paramzaca);
          if (localzaie2.b() == 3)
          {
            j = 0;
            if (i1 != 0)
            {
              localzaie3 = paramzait.a(d1, ((zabb)localzaie2).o());
              if ((localzaie3 != null) && (localzaie3.b() == 0)) {
                return localzaie3;
              }
            }
          }
          else if (localzaie2.b() == 0)
          {
            return localzaie2;
          }
          i5 = i4 + 1;
          if (paramzaiw2.g())
          {
            i4 = paramzaiw2.k();
          }
          else
          {
            i6 = 1;
            i4 = paramzaiw2.e();
            if (i4 == i5) {
              break;
            }
          }
        }
      }
      else if (i4 > i5)
      {
        localzaie1 = paramzaiw1.h().e(paramzaca);
        if (localzaie1.b() == 3)
        {
          i = 0;
          if (n != 0)
          {
            n = 0;
            localzaie2 = paramzaiw2.o();
            if (localzaie2.b() == 3)
            {
              j = 0;
              i2 = 1;
              d2 = ((zabb)localzaie2).o();
            }
            else
            {
              if (localzaie2.b() == 0) {
                return localzaie2;
              }
              k = 0;
            }
          }
          if (i2 != 0)
          {
            localzaie3 = paramzait.a(((zabb)localzaie1).o(), d2);
            if ((localzaie3 != null) && (localzaie3.b() == 0)) {
              return localzaie3;
            }
          }
        }
        else
        {
          if (localzaie1.b() == 0) {
            return localzaie1;
          }
          if (n != 0)
          {
            n = 0;
            localzaie2 = paramzaiw2.o();
            if (localzaie2.b() == 3)
            {
              j = 0;
              i2 = 1;
              d2 = ((zabb)localzaie2).o();
            }
            else
            {
              if (localzaie2.b() == 0) {
                return localzaie2;
              }
              k = 0;
            }
          }
        }
        i5 = i3 + 1;
        if (paramzaiw1.g())
        {
          i3 = paramzaiw1.k();
        }
        else
        {
          i6 = 1;
          i3 = paramzaiw1.e();
          if (i3 == i5) {
            break;
          }
        }
      }
      else
      {
        localzaie1 = paramzaiw1.h().e(paramzaca);
        if (localzaie1.b() == 3)
        {
          i = 0;
          localzaie2 = paramzaiw2.h().e(paramzaca);
          if (localzaie2.b() == 3)
          {
            j = 0;
            localzaie3 = paramzait.a(((zabb)localzaie1).o(), ((zabb)localzaie2).o());
            if ((localzaie3 != null) && (localzaie3.b() == 0)) {
              return localzaie3;
            }
          }
          else if (localzaie2.b() == 0)
          {
            return localzaie2;
          }
        }
        else
        {
          if (localzaie1.b() == 0) {
            return localzaie1;
          }
          localzaie2 = paramzaiw2.h().e(paramzaca);
          if (localzaie2.b() == 3) {
            j = 0;
          } else if (localzaie2.b() == 0) {
            return localzaie2;
          }
        }
        i5 = i3 + 1;
        if (paramzaiw1.g())
        {
          i3 = paramzaiw1.k();
        }
        else
        {
          i6 = 1;
          i3 = paramzaiw1.e();
          if (i3 == i5) {
            break;
          }
        }
        if (paramzaiw2.g())
        {
          i4 = paramzaiw2.k();
        }
        else
        {
          i6 = 1;
          i4 = paramzaiw2.e();
        }
      }
    }
    if (i != 0)
    {
      if ((a(paramzaiw1)) || ((j != 0) && (a(paramzaiw2)))) {
        return zabc.f;
      }
      return paramzait.b();
    }
    if (j != 0)
    {
      if (a(paramzaiw2)) {
        return zabc.f;
      }
      return paramzait.b();
    }
    return paramzait.a();
  }
  
  private static boolean a(zaiw paramzaiw)
  {
    return (paramzaiw.l()) && (paramzaiw.b() != 6);
  }
  
  private static zaie a(zaiw paramzaiw, zaca paramzaca)
  {
    if ((paramzaiw.l()) && (paramzaiw.b() != 6))
    {
      zaie localzaie = paramzaiw.a(0, 0).e(paramzaca);
      if (localzaie.b() == 3) {
        return null;
      }
      if (localzaie.b() == 0) {
        return localzaie;
      }
      return zabc.f;
    }
    return null;
  }
  
  public static zaie a(zaiw paramzaiw1, zaiw paramzaiw2, zaca paramzaca)
  {
    if (paramzaiw1.e() != paramzaiw2.e()) {
      return zabc.g;
    }
    int i = 0;
    if (paramzaiw1.c() > 1)
    {
      if (paramzaiw1.d() > 1) {
        i = (paramzaiw1.c() - 1) * (paramzaiw1.d() - 1);
      } else {
        i = paramzaiw1.c() - 1;
      }
    }
    else if (paramzaiw1.d() > 1)
    {
      i = paramzaiw1.d() - 1;
    }
    else
    {
      zaie localzaie = a(paramzaiw1, paramzaca);
      if (localzaie != null) {
        return localzaie;
      }
      localzaie = a(paramzaiw2, paramzaca);
      if (localzaie != null) {
        return localzaie;
      }
      return zabc.g;
    }
    return a(paramzaca, paramzaiw1, paramzaiw2, new zave(i));
  }
  
  public static zaie a(zaiw paramzaiw1, zaiw paramzaiw2, zaiw paramzaiw3, zaca paramzaca, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramzaiw1 == null) {
      return zabc.f;
    }
    if (paramzaiw2 != null) {
      if ((paramzaiw2.l()) && (paramzaiw2.a(0, 0) == zabg.a)) {
        paramzaiw2 = null;
      } else if (paramzaiw3 != null)
      {
        if (paramzaiw1.n())
        {
          if ((!paramzaiw2.n()) && (paramzaiw2.d() != paramzaiw3.d())) {
            return zabc.c;
          }
        }
        else if ((paramzaiw1.m()) && (!paramzaiw2.m()) && (paramzaiw2.c() != paramzaiw3.c())) {
          return zabc.c;
        }
      }
      else {
        paramzaiw3 = paramzaiw2;
      }
    }
    Object localObject1 = a(paramzaiw1, paramzaiw2, paramzaca, paramBoolean1, false, paramBoolean2);
    if (((zaie)localObject1).b() == 0) {
      return (zaie)localObject1;
    }
    double d1;
    Object localObject3;
    double d3;
    if (((zaie)localObject1).b() == 3)
    {
      localObject2 = paramzaiw1.a(0, 0).a(paramzaca, 0);
      if (paramBoolean1) {
        return (zaie)localObject2;
      }
      d1 = ((zabb)localObject2).o();
      if (paramzaiw3 != null)
      {
        zaie localzaie = paramzaiw3.a(0, 0).e(paramzaca);
        if (localzaie.b() == 0) {
          return localzaie;
        }
        localObject3 = localzaie.a(paramzaca, 0);
        if (localObject3 == null) {
          return zabc.f;
        }
        d3 = ((zabb)localObject3).o();
      }
      else
      {
        d3 = 1.0D;
      }
      if (paramzaiw2 != null)
      {
        double d5 = paramzaiw2.a(0, 0).a(paramzaca, 0).o();
        if (d5 == 0.0D) {
          return (zaie)localObject1;
        }
        return new zabb(paramBoolean2 ? Math.pow(d1, d3 / d5) : d1 / d5 * d3);
      }
      return new zabb(paramBoolean2 ? Math.pow(d1, d3) : d1 * d3);
    }
    Object localObject2 = ((zaav)localObject1).a(0);
    int i5;
    if (localObject2.length == 2)
    {
      d1 = ((zabb)localObject2[0]).o();
      d3 = ((zabb)localObject2[1]).o();
      if (paramzaiw3 != null)
      {
        localObject1 = paramzaiw3.a(0, 0).e(paramzaca);
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        if (((zaie)localObject1).b() != 3) {
          return zabc.f;
        }
        if (!paramBoolean3) {
          return new zabb(paramBoolean2 ? Math.pow(d1, ((zabb)localObject1).o()) * d3 : d1 * ((zabb)localObject1).o() + d3);
        }
        int m = paramzaiw3.d();
        localObject3 = new double[paramzaiw3.c()][];
        for (int i2 = 0; i2 < localObject3.length; i2++) {
          localObject3[i2] = new double[m];
        }
        paramzaiw3.f();
        localObject1 = zabt.a(paramzaiw3, (double[][])localObject3, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
        if (localObject1 != null) {
          return zabc.f;
        }
        zaie[][] arrayOfzaie3 = new zaie[localObject3.length][];
        for (i5 = 0; i5 < arrayOfzaie3.length; i5++)
        {
          Object localObject4 = localObject3[i5];
          localObject2 = new zaie[localObject4.length];
          arrayOfzaie3[i5] = localObject2;
          for (i6 = 0; i6 < localObject4.length; i6++) {
            localObject2[i6] = new zabb(paramBoolean2 ? Math.pow(d1, localObject4[i6]) * d3 : d1 * localObject4[i6] + d3);
          }
        }
        return new zaax(arrayOfzaie3);
      }
      zaie[][] arrayOfzaie2 = new zaie[paramzaiw1.c()][];
      int i1 = paramzaiw1.d();
      int i3 = 1;
      for (int i4 = 0; i4 < arrayOfzaie2.length; i4++)
      {
        localObject2 = new zaie[i1];
        arrayOfzaie2[i4] = localObject2;
        for (i5 = 0; i5 < localObject2.length; i5++)
        {
          localObject2[i5] = new zabb(paramBoolean2 ? Math.pow(d1, i3) * d3 : d1 * i3 + d3);
          i3++;
        }
      }
      return new zaax(arrayOfzaie2);
    }
    if (paramzaiw3 == null)
    {
      zaie[] arrayOfzaie1;
      if (paramzaiw1.m()) {
        arrayOfzaie1 = new zaie[paramzaiw1.d()];
      } else {
        arrayOfzaie1 = new zaie[paramzaiw1.c()];
      }
      for (i = 0; i < arrayOfzaie1.length; i++) {
        arrayOfzaie1[i] = new zabb(i + 1.0D);
      }
      paramzaiw3 = new zayq(arrayOfzaie1, paramzaiw1.m(), 0, arrayOfzaie1.length, 6, zabg.a, 0, false);
    }
    if (!paramBoolean3)
    {
      double d2 = ((zabb)localObject2[(localObject2.length - 1)]).o();
      if (paramzaiw1.m())
      {
        j = 1;
        k = paramzaiw3.c();
      }
      else
      {
        j = 0;
        k = paramzaiw3.d();
      }
      for (int n = 0; n < k; n++)
      {
        localObject1 = (j != 0 ? paramzaiw3.a(n, 0) : paramzaiw3.a(0, n)).e(paramzaca);
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        if (((zaie)localObject1).b() != 3) {
          return zabc.f;
        }
        if (paramBoolean2) {
          d2 *= Math.pow(((zabb)localObject2[(localObject2.length - 2 - n)]).o(), ((zabb)localObject1).o());
        } else {
          d2 += ((zabb)localObject2[(localObject2.length - 2 - n)]).o() * ((zabb)localObject1).o();
        }
      }
      return new zabb(d2);
    }
    double[][] arrayOfDouble = new double[paramzaiw3.c()][];
    int i = paramzaiw3.d();
    for (int j = 0; j < arrayOfDouble.length; j++) {
      arrayOfDouble[j] = new double[i];
    }
    paramzaiw3.f();
    localObject1 = zabt.a(paramzaiw3, arrayOfDouble, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
    if (localObject1 != null) {
      return zabc.f;
    }
    double[] arrayOfDouble1 = new double[localObject2.length - 1];
    for (int k = 0; k < localObject2.length - 1; k++) {
      arrayOfDouble1[k] = ((zabb)localObject2[(localObject2.length - 2 - k)]).o();
    }
    double d4 = ((zabb)localObject2[(localObject2.length - 1)]).o();
    double d6;
    if (paramzaiw1.m())
    {
      arrayOfzaie4 = new zaie[i];
      for (i5 = 0; i5 < i; i5++)
      {
        d6 = d4;
        if (paramBoolean2) {
          for (i6 = 0; i6 < arrayOfDouble.length; i6++) {
            d6 *= Math.pow(arrayOfDouble1[i6], arrayOfDouble[i6][i5]);
          }
        } else {
          for (i6 = 0; i6 < arrayOfDouble.length; i6++) {
            d6 += arrayOfDouble1[i6] * arrayOfDouble[i6][i5];
          }
        }
        arrayOfzaie4[i5] = new zabb(d6);
      }
      return new zaaw(arrayOfzaie4, false, 0, arrayOfzaie4.length, 0, 1, zabg.a);
    }
    zaie[] arrayOfzaie4 = new zaie[arrayOfDouble.length];
    for (int i6 = 0; i6 < arrayOfzaie4.length; i6++)
    {
      double[] arrayOfDouble2 = arrayOfDouble[i6];
      d6 = d4;
      int i7;
      if (paramBoolean2) {
        for (i7 = 0; i7 < arrayOfDouble2.length; i7++) {
          d6 *= Math.pow(arrayOfDouble1[i7], arrayOfDouble2[i7]);
        }
      } else {
        for (i7 = 0; i7 < arrayOfDouble2.length; i7++) {
          d6 += arrayOfDouble1[i7] * arrayOfDouble2[i7];
        }
      }
      arrayOfzaie4[i6] = new zabb(d6);
    }
    return new zaaw(arrayOfzaie4, true, 0, arrayOfzaie4.length, 0, 1, zabg.a);
  }
  
  public static zaie a(zaiw paramzaiw1, zaiw paramzaiw2, zaca paramzaca, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = paramzaiw1.c();
    boolean bool = false;
    double[] arrayOfDouble1;
    Object localObject1;
    double[][] arrayOfDouble;
    int i1;
    Object localObject2;
    if (i > 1)
    {
      if (paramzaiw2 != null)
      {
        if (paramzaiw2.c() != i) {
          return zabc.c;
        }
        if (paramzaiw1.d() > 1)
        {
          if (paramzaiw2.d() != paramzaiw1.d()) {
            return zabc.c;
          }
          i *= paramzaiw1.d();
          arrayOfDouble1 = new double[i];
          paramzaiw1.f();
          localObject1 = zabt.a(paramzaiw1, arrayOfDouble1, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
          if (((zaie)localObject1).b() == 0) {
            return (zaie)localObject1;
          }
          double[] arrayOfDouble2 = new double[i];
          paramzaiw2.f();
          localObject1 = zabt.a(paramzaiw2, arrayOfDouble2, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
          if (((zaie)localObject1).b() == 0) {
            return (zaie)localObject1;
          }
          arrayOfDouble = new double[][] { arrayOfDouble2 };
        }
        else
        {
          arrayOfDouble1 = new double[i];
          paramzaiw1.f();
          localObject1 = zabt.a(paramzaiw1, arrayOfDouble1, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
          if (((zaie)localObject1).b() == 0) {
            return (zaie)localObject1;
          }
          arrayOfDouble = new double[i][];
          int k = paramzaiw2.d();
          for (i1 = 0; i1 < i; i1++) {
            arrayOfDouble[i1] = new double[k];
          }
          paramzaiw2.f();
          localObject1 = zabt.a(paramzaiw2, arrayOfDouble, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
          if (localObject1 != null) {
            return (zaie)localObject1;
          }
          bool = true;
        }
      }
      else
      {
        arrayOfDouble1 = new double[paramzaiw1.e()];
        paramzaiw1.f();
        localObject1 = zabt.a(paramzaiw1, arrayOfDouble1, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        double[] arrayOfDouble3 = new double[arrayOfDouble1.length];
        for (i1 = 0; i1 < arrayOfDouble3.length; i1++) {
          arrayOfDouble3[i1] = (i1 + 1.0D);
        }
        arrayOfDouble = new double[][] { arrayOfDouble3 };
      }
    }
    else
    {
      i = paramzaiw1.d();
      if (paramzaiw2 != null)
      {
        if (paramzaiw2.d() != i) {
          return zabc.c;
        }
        arrayOfDouble1 = new double[i];
        paramzaiw1.f();
        localObject1 = zabt.a(paramzaiw1, arrayOfDouble1, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        arrayOfDouble = new double[paramzaiw2.c()][];
        for (int m = 0; m < arrayOfDouble.length; m++) {
          arrayOfDouble[m] = new double[i];
        }
        paramzaiw2.f();
        localObject1 = zabt.a(paramzaiw2, arrayOfDouble, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
        if (localObject1 != null) {
          return (zaie)localObject1;
        }
      }
      else
      {
        arrayOfDouble1 = new double[i];
        paramzaiw1.f();
        localObject1 = zabt.a(paramzaiw1, arrayOfDouble1, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x3000);
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        localObject2 = new double[arrayOfDouble1.length];
        for (i1 = 0; i1 < localObject2.length; i1++) {
          localObject2[i1] = (i1 + 1.0D);
        }
        arrayOfDouble = new double[][] { localObject2 };
      }
    }
    if (paramBoolean3) {
      for (int j = 0; j < arrayOfDouble1.length; j++)
      {
        if (arrayOfDouble1[j] <= 0.0D) {
          return zabc.b;
        }
        arrayOfDouble1[j] = Math.log(arrayOfDouble1[j]);
      }
    }
    if (arrayOfDouble1.length == 1)
    {
      if (!paramBoolean1)
      {
        double d = arrayOfDouble[0][0];
        if (d != 0.0D) {
          return new zabb(paramBoolean3 ? Math.pow(Math.exp(arrayOfDouble1[0]), 1.0D / d) : arrayOfDouble1[0] / d);
        }
      }
      return paramBoolean3 ? zabb.b : zabb.a;
    }
    zaie[][] arrayOfzaie = a(arrayOfDouble1, arrayOfDouble, bool, paramBoolean1, paramBoolean2);
    if (paramBoolean3)
    {
      localObject2 = arrayOfzaie[0];
      for (i1 = 0; i1 < localObject2.length; i1++) {
        if (localObject2[i1] != null) {
          localObject2[i1] = new zabb(Math.exp(((zabb)localObject2[i1]).o()));
        }
      }
    }
    for (int n = 2; n < arrayOfzaie.length; n++) {
      zc.a(arrayOfzaie[n], 2, arrayOfzaie[n].length, zabc.g);
    }
    return new zaax(arrayOfzaie);
  }
  
  private static zaie[][] a(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = paramArrayOfDouble.length;
    int j;
    if (paramBoolean1)
    {
      j = paramArrayOfDouble1[0].length;
      if (paramBoolean2)
      {
        localObject1 = new double[j + 1][];
        localObject1[0] = new double[i];
        zc.a(localObject1[0], 0, i, 1.0D);
        for (int k = 0; k < j; k++)
        {
          double[] arrayOfDouble1 = new double[i];
          localObject1[(k + 1)] = arrayOfDouble1;
          for (int n = 0; n < i; n++) {
            arrayOfDouble1[n] = paramArrayOfDouble1[n][k];
          }
        }
        paramArrayOfDouble1 = (double[][])localObject1;
        paramBoolean1 = false;
      }
      else if (j > i)
      {
        paramArrayOfDouble1 = a(paramArrayOfDouble1);
        paramBoolean1 = false;
      }
    }
    else
    {
      j = paramArrayOfDouble1.length;
      if (paramBoolean2)
      {
        localObject1 = new double[j + 1][];
        localObject1[0] = new double[i];
        zc.a(localObject1[0], 0, i, 1.0D);
        System.arraycopy(paramArrayOfDouble1, 0, localObject1, 1, j);
        paramArrayOfDouble1 = (double[][])localObject1;
      }
    }
    Object localObject1 = null;
    if ((!paramBoolean1) && (paramArrayOfDouble1.length > i))
    {
      localObject1 = zayb.a(paramArrayOfDouble1, paramBoolean2);
      localObject2 = new double[i][];
      for (int m = 0; m < i; m++) {
        localObject2[m] = paramArrayOfDouble1[localObject1[m]];
      }
      paramArrayOfDouble1 = (double[][])localObject2;
    }
    Object localObject2 = new zayb(paramArrayOfDouble1, !paramBoolean1);
    double[] arrayOfDouble2 = ((zayb)localObject2).a();
    zami localzami = null;
    int i6;
    for (int i1 = 0; i1 < arrayOfDouble2.length; i1++) {
      if (Math.abs(arrayOfDouble2[i1]) < 1.0E-12D)
      {
        double[][] arrayOfDouble3;
        double[] arrayOfDouble5;
        if (paramBoolean1)
        {
          arrayOfDouble3 = new double[j][];
          for (i3 = 0; i3 < j; i3++)
          {
            arrayOfDouble5 = new double[i];
            arrayOfDouble3[i3] = arrayOfDouble5;
            for (i6 = 0; i6 < i; i6++) {
              arrayOfDouble5[i6] = paramArrayOfDouble1[i6][i3];
            }
          }
        }
        else
        {
          arrayOfDouble3 = new double[paramArrayOfDouble1.length][];
          if (paramBoolean2)
          {
            arrayOfDouble3[0] = paramArrayOfDouble1[0];
            for (i3 = 1; i3 < paramArrayOfDouble1.length; i3++) {
              arrayOfDouble3[i3] = paramArrayOfDouble1[(paramArrayOfDouble1.length - i3)];
            }
          }
          else
          {
            for (i3 = 0; i3 < paramArrayOfDouble1.length; i3++) {
              arrayOfDouble3[i3] = paramArrayOfDouble1[(paramArrayOfDouble1.length - 1 - i3)];
            }
          }
        }
        localObject2 = new zayb(arrayOfDouble3, true);
        arrayOfDouble2 = ((zayb)localObject2).a();
        for (i3 = arrayOfDouble2.length - 1; i3 > -1; i3--) {
          if (Math.abs(arrayOfDouble2[i3]) < 1.0E-12D)
          {
            if (localzami == null) {
              localzami = new zami(arrayOfDouble2.length - 1);
            }
            localzami.a(arrayOfDouble2.length - i3 - 1);
          }
        }
        if (!paramBoolean1) {
          break;
        }
        paramArrayOfDouble1 = arrayOfDouble3;
        for (i3 = paramArrayOfDouble1.length / 2 - 1; i3 > -1; i3--)
        {
          arrayOfDouble5 = paramArrayOfDouble1[i3];
          paramArrayOfDouble1[i3] = paramArrayOfDouble1[(paramArrayOfDouble1.length - 1 - i3)];
          paramArrayOfDouble1[(paramArrayOfDouble1.length - 1 - i3)] = arrayOfDouble5;
        }
        paramBoolean1 = false;
        break;
      }
    }
    if (localzami != null)
    {
      int i2;
      int i4;
      if (localObject1 == null)
      {
        localObject1 = new int[arrayOfDouble2.length - localzami.a()];
        i1 = localObject1.length - 1;
        i2 = paramArrayOfDouble1.length - 1;
        for (i3 = localzami.a() - 1; i3 > -1; i3--)
        {
          i4 = localzami.b(i3);
          while (i1 > i4)
          {
            localObject1[(i1--)] = (i2--);
            i1--;
          }
          i2--;
        }
        while (i1 >= 0) {
          localObject1[i1] = (i1--);
        }
      }
      else
      {
        localObject3 = new int[arrayOfDouble2.length - localzami.a()];
        i2 = localObject3.length - 1;
        i3 = localObject1.length - 1;
        for (i4 = localzami.a() - 1; i4 > -1; i4--)
        {
          i6 = localzami.b(i4);
          while (i2 > i6)
          {
            localObject1[(i2--)] = localObject1[(i3--)];
            i2--;
          }
          i3--;
        }
        localObject1 = localObject3;
      }
      localObject3 = new double[localObject1.length][];
      if (paramBoolean1)
      {
        for (i2 = 0; i2 < localObject3.length; i2++) {
          for (i3 = 0; i3 < i; i3++) {
            localObject3[i2][i3] = paramArrayOfDouble1[i3][localObject1[i2]];
          }
        }
        paramBoolean1 = false;
      }
      else
      {
        for (i2 = 0; i2 < localObject3.length; i2++) {
          localObject3[i2] = paramArrayOfDouble1[localObject1[i2]];
        }
      }
      paramArrayOfDouble1 = (double[][])localObject3;
      localObject2 = new zayb(paramArrayOfDouble1, !paramBoolean1);
    }
    Object localObject3 = a(b(((zayb)localObject2).b()), ((zayb)localObject2).c());
    double[] arrayOfDouble4 = new double[localObject3.length];
    for (int i3 = 0; i3 < localObject3.length; i3++)
    {
      Object localObject4 = localObject3[i3];
      double d1 = 0.0D;
      for (int i9 = 0; i9 < localObject4.length; i9++) {
        d1 += localObject4[i9] * paramArrayOfDouble[i9];
      }
      arrayOfDouble4[i3] = d1;
    }
    zaie[][] arrayOfzaie = new zaie[paramBoolean3 ? 5 : 1][];
    for (int i5 = 0; i5 < arrayOfzaie.length; i5++) {
      arrayOfzaie[i5] = new zaie[j + 1];
    }
    zaie[] arrayOfzaie1 = arrayOfzaie[0];
    int i7;
    if (localObject1 != null)
    {
      zc.a(arrayOfzaie1, 0, arrayOfzaie1.length, zabb.a);
      if (paramBoolean2) {
        for (i7 = 0; i7 < localObject1.length; i7++) {
          arrayOfzaie1[(j - localObject1[i7])] = new zabb(arrayOfDouble4[i7]);
        }
      } else {
        for (i7 = 0; i7 < localObject1.length; i7++) {
          arrayOfzaie1[(j - localObject1[i7] - 1)] = new zabb(arrayOfDouble4[i7]);
        }
      }
    }
    else if (paramBoolean2)
    {
      for (i7 = 0; i7 < arrayOfDouble4.length; i7++) {
        arrayOfzaie1[(j - i7)] = new zabb(arrayOfDouble4[i7]);
      }
    }
    else
    {
      arrayOfzaie1[j] = zabb.a;
      for (i7 = 0; i7 < arrayOfDouble4.length; i7++) {
        arrayOfzaie1[(j - i7 - 1)] = new zabb(arrayOfDouble4[i7]);
      }
    }
    if (!paramBoolean3) {
      return arrayOfzaie;
    }
    double[] arrayOfDouble6 = new double[i];
    for (int i8 = 0; i8 < i; i8++)
    {
      double d3 = 0.0D;
      if (paramBoolean1)
      {
        double[] arrayOfDouble7 = paramArrayOfDouble1[i8];
        for (int i11 = 0; i11 < arrayOfDouble7.length; i11++) {
          d3 += arrayOfDouble4[i11] * arrayOfDouble7[i11];
        }
      }
      else
      {
        for (int i10 = 0; i10 < paramArrayOfDouble1.length; i10++) {
          d3 += arrayOfDouble4[i10] * paramArrayOfDouble1[i10][i8];
        }
      }
      arrayOfDouble6[i8] = d3;
    }
    double d2 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    int i12;
    double d7;
    if (paramBoolean2)
    {
      d5 = zbpi.b(paramArrayOfDouble, 0, paramArrayOfDouble.length);
      for (i12 = 0; i12 < i; i12++)
      {
        d7 = paramArrayOfDouble[i12] - arrayOfDouble6[i12];
        d4 += d7 * d7;
        d7 = arrayOfDouble6[i12] - d5;
        d2 += d7 * d7;
      }
    }
    else
    {
      for (i12 = 0; i12 < i; i12++)
      {
        d7 = paramArrayOfDouble[i12];
        d2 += d7 * d7;
        d7 -= arrayOfDouble6[i12];
        d4 += d7 * d7;
      }
      d2 -= d4;
    }
    arrayOfzaie[4][0] = new zabb(d2);
    arrayOfzaie[4][1] = new zabb(d4);
    arrayOfzaie[2][0] = new zabb(d2 / (d2 + d4));
    double d6 = i - paramArrayOfDouble1.length;
    if (d6 <= 0.0D)
    {
      arrayOfzaie[2][1] = zabb.a;
      arrayOfzaie[3][0] = zabc.b;
      arrayOfzaie[3][1] = zabb.a;
      zc.a(arrayOfzaie[1], 0, arrayOfzaie[1].length, zabb.a);
      return arrayOfzaie;
    }
    double d8 = d4 / d6;
    double d9 = Math.sqrt(d8);
    double d10 = d2 / j / d8;
    arrayOfzaie[2][1] = new zabb(d9);
    arrayOfzaie[3][0] = new zabb(d10);
    arrayOfzaie[3][1] = new zabb(d6);
    double[][] arrayOfDouble8 = b(paramBoolean1 ? a(a(paramArrayOfDouble1), paramArrayOfDouble1) : a(paramArrayOfDouble1, a(paramArrayOfDouble1)));
    arrayOfzaie1 = arrayOfzaie[1];
    if (arrayOfDouble8 == null)
    {
      zc.a(arrayOfzaie1, 0, arrayOfzaie1.length, zabb.a);
      return arrayOfzaie;
    }
    int i13;
    if (localObject1 == null)
    {
      if (!paramBoolean2) {
        arrayOfzaie1[j] = zabc.g;
      }
      for (i13 = 0; i13 < arrayOfDouble8.length; i13++) {
        arrayOfzaie1[(arrayOfDouble8.length - i13 - 1)] = new zabb(Math.sqrt(arrayOfDouble8[i13][i13] * d8));
      }
    }
    else
    {
      zc.a(arrayOfzaie1, 0, arrayOfzaie1.length, zabb.a);
      if (paramBoolean2)
      {
        for (i13 = 0; i13 < arrayOfDouble8.length; i13++) {
          arrayOfzaie1[(j - i13)] = new zabb(Math.sqrt(arrayOfDouble8[i13][i13] * d8));
        }
      }
      else
      {
        arrayOfzaie1[j] = zabc.g;
        for (i13 = 0; i13 < arrayOfDouble8.length; i13++) {
          arrayOfzaie1[(j - i13 - 1)] = new zabb(Math.sqrt(arrayOfDouble8[i13][i13] * d8));
        }
      }
    }
    return arrayOfzaie;
  }
  
  public static double[][] a(double[][] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return (double[][])null;
    }
    int i = paramArrayOfDouble.length;
    int j = paramArrayOfDouble[0].length;
    double[][] arrayOfDouble = new double[j][];
    for (int k = 0; k < j; k++) {
      arrayOfDouble[k] = new double[i];
    }
    for (k = 0; k < j; k++) {
      for (int m = 0; m < i; m++) {
        arrayOfDouble[k][m] = paramArrayOfDouble[m][k];
      }
    }
    return arrayOfDouble;
  }
  
  public static double[][] a(double[][] paramArrayOfDouble1, double[][] paramArrayOfDouble2)
  {
    if ((paramArrayOfDouble1 == null) || (paramArrayOfDouble2 == null)) {
      return (double[][])null;
    }
    int i = paramArrayOfDouble1.length;
    int j = paramArrayOfDouble1[0].length;
    int k = paramArrayOfDouble2[0].length;
    if (j > paramArrayOfDouble2.length) {
      return (double[][])null;
    }
    double[][] arrayOfDouble = new double[i][];
    for (int m = 0; m < i; m++) {
      arrayOfDouble[m] = new double[k];
    }
    for (m = 0; m < i; m++) {
      for (int n = 0; n < k; n++)
      {
        double d = 0.0D;
        for (int i1 = 0; i1 < j; i1++) {
          d += paramArrayOfDouble1[m][i1] * paramArrayOfDouble2[i1][n];
        }
        arrayOfDouble[m][n] = d;
      }
    }
    return arrayOfDouble;
  }
  
  public static double[][] b(double[][] paramArrayOfDouble)
  {
    double[][] arrayOfDouble1 = new double[paramArrayOfDouble.length][];
    for (int i = 0; i < arrayOfDouble1.length; i++)
    {
      arrayOfDouble1[i] = new double[paramArrayOfDouble[0].length + paramArrayOfDouble[0].length];
      for (j = 0; j < arrayOfDouble1[i].length; j++) {
        if (j < paramArrayOfDouble[0].length) {
          arrayOfDouble1[i][j] = paramArrayOfDouble[i][j];
        } else if (j == i + paramArrayOfDouble[0].length) {
          arrayOfDouble1[i][j] = 1.0D;
        }
      }
    }
    i = arrayOfDouble1.length;
    int j = arrayOfDouble1[0].length;
    double d1 = 1;
    double d2;
    int n;
    int i1;
    for (;;)
    {
      d2 = Math.abs(arrayOfDouble1[(d1 - 1)][(d1 - 1)]);
      n = d1 - 1;
      for (i1 = d1 - 1; i1 < i; i1++) {
        if (Math.abs(arrayOfDouble1[i1][(d1 - 1)]) > d2)
        {
          d2 = Math.abs(arrayOfDouble1[i1][(d1 - 1)]);
          n = i1;
        }
      }
      double d4;
      if (n != d1 - 1) {
        for (i1 = 0; i1 < j; i1++)
        {
          d4 = arrayOfDouble1[(d1 - 1)][i1];
          arrayOfDouble1[(d1 - 1)][i1] = arrayOfDouble1[n][i1];
          arrayOfDouble1[n][i1] = d4;
        }
      }
      for (i1 = d1; i1 < i; i1++)
      {
        if (arrayOfDouble1[(d1 - 1)][(d1 - 1)] == 0.0D) {
          return (double[][])null;
        }
        d4 = arrayOfDouble1[i1][(d1 - 1)] / arrayOfDouble1[(d1 - 1)][(d1 - 1)];
        for (int i2 = 0; i2 < j; i2++) {
          arrayOfDouble1[i1][i2] -= d4 * arrayOfDouble1[(d1 - 1)][i2];
        }
      }
      d1++;
      if (d1 > arrayOfDouble1.length) {
        break;
      }
    }
    d1 = arrayOfDouble1.length - 2;
    double d3;
    for (;;)
    {
      for (d2 = d1; d2 >= 0; d2--)
      {
        if (arrayOfDouble1[(d1 + 1)][(d1 + 1)] == 0.0D) {
          return (double[][])null;
        }
        d3 = arrayOfDouble1[d2][(d1 + 1)] / arrayOfDouble1[(d1 + 1)][(d1 + 1)];
        for (i1 = 0; i1 < j; i1++) {
          arrayOfDouble1[d2][i1] -= d3 * arrayOfDouble1[(d1 + 1)][i1];
        }
      }
      d1--;
      if (d1 < 0) {
        break;
      }
    }
    for (int k = 0; k < i; k++)
    {
      d3 = arrayOfDouble1[k][k];
      if (d3 == 0.0D) {
        return (double[][])null;
      }
      for (i1 = 0; i1 < j; i1++) {
        arrayOfDouble1[k][i1] /= d3;
      }
    }
    double[][] arrayOfDouble2 = new double[paramArrayOfDouble.length][];
    for (int m = 0; m < i; m++)
    {
      arrayOfDouble2[m] = new double[i];
      for (n = 0; n < i; n++) {
        arrayOfDouble2[m][n] = arrayOfDouble1[m][(n + i)];
      }
    }
    return arrayOfDouble2;
  }
  
  public static double c(double[][] paramArrayOfDouble)
  {
    double d1 = 1.0D;
    double d2 = 0.0D;
    int i = paramArrayOfDouble[0].length;
    for (int j = 0; j < paramArrayOfDouble[0].length - 1; j++)
    {
      int m;
      if (paramArrayOfDouble[j][j] == 0.0D)
      {
        k = -1;
        for (m = j + 1; m < i; m++) {
          if (paramArrayOfDouble[m][j] != 0.0D)
          {
            k = m;
            break;
          }
        }
        if (k == -1) {
          return 0.0D;
        }
        for (m = j; m < paramArrayOfDouble[0].length; m++) {
          paramArrayOfDouble[j][m] -= paramArrayOfDouble[k][m];
        }
      }
      for (int k = j + 1; k < paramArrayOfDouble.length; k++)
      {
        d2 = paramArrayOfDouble[k][j] / paramArrayOfDouble[j][j];
        paramArrayOfDouble[k][j] = 0.0D;
        for (m = j + 1; m < paramArrayOfDouble[0].length; m++) {
          paramArrayOfDouble[k][m] -= d2 * paramArrayOfDouble[j][m];
        }
      }
    }
    for (j = 0; j < paramArrayOfDouble.length; j++) {
      d1 *= paramArrayOfDouble[j][j];
    }
    return d1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */