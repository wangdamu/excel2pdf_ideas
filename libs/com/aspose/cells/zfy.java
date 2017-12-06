package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zs;

abstract class zfy
{
  public static zaie a(zaji paramzaji, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt)
  {
    while (paramInt < paramArrayOfzaie.length)
    {
      zaie localzaie = paramArrayOfzaie[paramInt];
      if (localzaie.i())
      {
        localzaie = paramzaji.a(localzaie, paramzaca, false);
        if ((localzaie != null) && (localzaie.b() == 0)) {
          return localzaie;
        }
      }
      else
      {
        int i = localzaie.g();
        if (i == 32) {
          i = localzaie.a(paramzaca);
        }
        boolean bool = i != 64;
        zaiw localzaiw;
        if ((paramzaca.h) || (i == 96) || (localzaie.c(paramzaca)))
        {
          localzaiw = localzaie.a(paramzaca, false);
          localzaie = zbam.a(localzaiw, new zbsg(paramzaji), paramzaca, bool, true);
          localzaiw.a(true);
        }
        else
        {
          localzaie = localzaie.d(paramzaca);
          if (localzaie.i())
          {
            localzaie = paramzaji.a(localzaie, paramzaca, false);
            if ((localzaie == null) || (localzaie.b() != 0)) {
              break label349;
            }
            return localzaie;
          }
          localzaiw = localzaie.a(paramzaca, false);
          if (localzaiw.l())
          {
            if ((bool) && (localzaie.b() != 9))
            {
              localzaie = localzaiw.a(0, 0);
              localzaie = paramzaji.a(localzaie, paramzaca, localzaie.a(paramzaca) != 64);
            }
            else
            {
              localzaie = paramzaji.a(localzaiw.a(0, 0), paramzaca, bool);
            }
          }
          else {
            localzaie = zbam.a(localzaiw, paramzaji, paramzaca, bool, true);
          }
          localzaiw.a(true);
        }
        if ((localzaie != null) && (localzaie.b() == 0)) {
          return localzaie;
        }
      }
      label349:
      paramInt++;
    }
    return paramzaji.a();
  }
  
  public static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    paramzaca = paramzaca.e();
    Object localObject2;
    if (paramArrayOfzaie.length == 1)
    {
      localObject1 = paramArrayOfzaie[0];
      if (localObject1 == zabg.a) {
        return zabc.f;
      }
      if (((zaie)localObject1).b() == 0) {
        return (zaie)localObject1;
      }
      localObject2 = zbam.a((zaie)localObject1, paramzaca);
      if (((zaiw)localObject2).b() == 0) {
        return ((zaiw)localObject2).a(0, 0);
      }
      if (((zaiw)localObject2).l())
      {
        localObject1 = ((zaiw)localObject2).a(0, 0).e(paramzaca);
        if (((zaie)localObject1).b() == 3) {
          return (zaie)localObject1;
        }
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        if (((zaiw)localObject2).b() == 6) {
          return zabb.a;
        }
        return zabc.f;
      }
      localObject3 = new zbsi(false);
      localObject1 = zbam.a((zaiw)localObject2, (zaji)localObject3, paramzaca, true, true);
      ((zaiw)localObject2).a(true);
      if ((localObject1 != null) && (((zaie)localObject1).b() == 0)) {
        return (zaie)localObject1;
      }
      return ((zbsi)localObject3).a();
    }
    if (paramArrayOfzaie.length == 2)
    {
      localObject1 = paramArrayOfzaie[0];
      if (localObject1 == zabg.a) {
        return zabc.f;
      }
      if (((zaie)localObject1).b() == 0) {
        return (zaie)localObject1;
      }
      localObject3 = zbam.a((zaie)localObject1, paramzaca);
      if (((zaiw)localObject3).b() == 0)
      {
        ((zaiw)localObject3).a(true);
        return ((zaiw)localObject3).a(0, 0);
      }
      localObject1 = paramArrayOfzaie[1];
      if (localObject1 == zabg.a) {
        return zabc.f;
      }
      if (((zaie)localObject1).b() == 0) {
        return (zaie)localObject1;
      }
      zaiw localzaiw = zbam.a((zaie)localObject1, paramzaca);
      if (localzaiw.b() == 0)
      {
        ((zaiw)localObject3).a(true);
        localzaiw.a(true);
        return localzaiw.a(0, 0);
      }
      if ((((zaiw)localObject3).c() != localzaiw.c()) || (((zaiw)localObject3).d() != localzaiw.d()))
      {
        zbrn localzbrn1 = new zbrn();
        localObject1 = zbam.a((zaiw)localObject3, localzbrn1, paramzaca, true, true);
        ((zaiw)localObject3).a(true);
        if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
        {
          localzaiw.a(true);
          return (zaie)localObject1;
        }
        localObject1 = zbam.a(localzaiw, localzbrn1, paramzaca, true, true);
        localzaiw.a(true);
        if ((localObject1 != null) && (((zaie)localObject1).b() == 0)) {
          return (zaie)localObject1;
        }
        return zabc.f;
      }
      if (((zaiw)localObject3).l())
      {
        ((zaiw)localObject3).a(true);
        localzaiw.a(true);
        localObject1 = ((zaiw)localObject3).a(0, 0).e(paramzaca);
        if (((zaie)localObject1).b() == 3)
        {
          double d1 = ((zabb)localObject1).o();
          localObject1 = localzaiw.a(0, 0).e(paramzaca);
          if (((zaie)localObject1).b() == 3)
          {
            if ((d1 == 0.0D) || (((zabb)localObject1).q())) {
              return zabb.a;
            }
            return new zabb(d1 * ((zabb)localObject1).o());
          }
          if (((zaie)localObject1).b() == 0) {
            return (zaie)localObject1;
          }
          if (((zaiw)localObject3).b() == 6) {
            return zabb.a;
          }
          return zabc.f;
        }
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        if (paramArrayOfzaie[0].g() != 96) {
          return zabc.f;
        }
        localObject1 = localzaiw.a(0, 0).e(paramzaca);
        if (((zaie)localObject1).b() == 0) {
          return (zaie)localObject1;
        }
        if ((((zaie)localObject1).b() == 3) || (localzaiw.b() == 6)) {
          return zabb.a;
        }
        return zabc.f;
      }
      zms localzms = new zms(paramzaca);
      localObject2 = new zazh((zaiw)localObject3, localzaiw, localzms, paramzaca);
      zbsi localzbsi1 = new zbsi(false);
      localObject1 = zbam.a((zaiw)localObject2, localzbsi1, paramzaca, true, true);
      if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
      {
        if (localzms.g() > 0)
        {
          zbrn localzbrn2 = new zbrn();
          zaie localzaie = zbam.a((zaiw)localObject3, localzbrn2, paramzaca, true, false);
          if ((localzaie != null) && (localzaie.b() == 0)) {
            localObject1 = localzaie;
          }
        }
        ((zaiw)localObject3).a(true);
        localzaiw.a(true);
        return (zaie)localObject1;
      }
      ((zaiw)localObject3).a(true);
      localzaiw.a(true);
      return localzbsi1.a();
    }
    Object localObject3 = new zaiw[paramArrayOfzaie.length];
    int i = 0;
    int j = 0;
    int k = -1;
    int m = -1;
    int n = -1;
    int i1 = -1;
    int i2 = 0;
    int i3 = 0;
    int i5;
    int i7;
    int i8;
    for (int i4 = 0; i4 < paramArrayOfzaie.length; i4++)
    {
      localObject1 = paramArrayOfzaie[i4];
      if (localObject1 == zabg.a)
      {
        for (i5 = 0; i5 < i4; i5++) {
          localObject3[i5].a(true);
        }
        return zabc.f;
      }
      if (((zaie)localObject1).b() == 0)
      {
        for (i5 = 0; i5 < i4; i5++) {
          localObject3[i5].a(true);
        }
        return (zaie)localObject1;
      }
      localObject2 = zbam.a((zaie)localObject1, paramzaca);
      if (((zaiw)localObject2).b() == 0)
      {
        for (i5 = 0; i5 < i4; i5++) {
          localObject3[i5].a(true);
        }
        return ((zaiw)localObject2).a(0, 0);
      }
      localObject3[i4] = localObject2;
      if (i4 == 0)
      {
        i = ((zaiw)localObject2).c();
        j = ((zaiw)localObject2).d();
        k = ((zaiw)localObject2).r();
        if (k < 0)
        {
          localObject1 = ((zaiw)localObject2).o();
          switch (((zaie)localObject1).b())
          {
          case 12: 
            i2 = 1;
            break;
          case 0: 
            i3 = 1;
            break;
          case 3: 
            if (((zabb)localObject1).q())
            {
              i2 = 1;
            }
            else
            {
              k = 0;
              n = i - 1;
              m = 0;
              i1 = j - 1;
            }
            break;
          default: 
            i2 = 1;
            break;
          }
        }
        else
        {
          n = ((zaiw)localObject2).s();
          m = ((zaiw)localObject2).t();
          i1 = ((zaiw)localObject2).u();
          if ((k > 0) || (m > 0) || (n < i - 1) || (i1 < j - 1))
          {
            localObject1 = ((zaiw)localObject2).o();
            if ((((zaie)localObject1).b() == 3) && (!((zabb)localObject1).q()))
            {
              k = 0;
              m = 0;
              n = i - 1;
              i1 = j - 1;
            }
          }
        }
      }
      else if (i3 == 0)
      {
        if ((i != ((zaiw)localObject2).c()) || (j != ((zaiw)localObject2).d()))
        {
          i3 = 1;
        }
        else if (i2 == 0)
        {
          i5 = ((zaiw)localObject2).r();
          if (i5 < 0)
          {
            localObject1 = ((zaiw)localObject2).o();
            if ((localObject1 == zabg.a) || (localObject1 == zabb.a) || (((zaie)localObject1).b() != 3) || (((zabb)localObject1).o() == 0.0D)) {
              i2 = 1;
            } else if (((zaie)localObject1).b() == 0) {
              i3 = 1;
            }
          }
          else
          {
            int i6 = ((zaiw)localObject2).s();
            i7 = ((zaiw)localObject2).t();
            i8 = ((zaiw)localObject2).u();
            if ((i5 > 0) || (i7 > 0) || (i6 < i - 1) || (i6 < j - 1))
            {
              localObject1 = ((zaiw)localObject2).o();
              if (((zaie)localObject1).b() == 0) {
                i3 = 1;
              } else if ((((zaie)localObject1).b() != 3) || (((zabb)localObject1).q())) {
                if ((i6 < k) || (i5 > n) || (i8 < m) || (i7 > i1))
                {
                  i2 = 1;
                }
                else
                {
                  if (i6 < n) {
                    n = i6;
                  }
                  if (i5 > k) {
                    k = i5;
                  }
                  if (i8 < i1) {
                    i1 = i8;
                  }
                  if (i7 > m) {
                    m = i7;
                  }
                }
              }
            }
          }
        }
      }
    }
    if ((i3 != 0) || (i2 != 0))
    {
      if ((i3 == 0) && (i == 1) && (j == 1))
      {
        for (i4 = 0; i4 < localObject3.length; i4++) {
          if ((localObject3[i4].a(0, 0).e(paramzaca).b() != 3) && (localObject3[i4].b() != 6))
          {
            i4++;
            while (i4 < localObject3.length)
            {
              localObject3[i4].a(true);
              i4++;
            }
            return zabc.f;
          }
        }
        return zabb.a;
      }
      localObject4 = new zbrn();
      for (i5 = 0; i5 < localObject3.length; i5++)
      {
        localObject2 = localObject3[i5];
        localObject1 = zbam.a((zaiw)localObject2, (zaji)localObject4, paramzaca, true, true);
        ((zaiw)localObject2).a(true);
        if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
        {
          i5++;
          while (i5 < localObject3.length)
          {
            localObject3[i5].a(true);
            i5++;
          }
          return (zaie)localObject1;
        }
      }
      if (i3 != 0) {
        return zabc.f;
      }
      return zabb.a;
    }
    Object localObject4 = null;
    Object localObject6;
    if (i == 1)
    {
      if (j == 1)
      {
        double d2 = 1.0D;
        i7 = 0;
        for (i8 = 0; i8 < localObject3.length; i8++)
        {
          localObject1 = localObject3[i8].a(0, 0).e(paramzaca);
          switch (((zaie)localObject1).b())
          {
          case 12: 
            i3 = 1;
            break;
          case 0: 
            while (i8 < localObject3.length)
            {
              localObject3[i8].a(true);
              i8++;
            }
            return (zaie)localObject1;
          case 3: 
            if (i7 == 0)
            {
              localObject6 = (zabb)localObject1;
              if (((zabb)localObject6).q()) {
                i7 = 1;
              } else {
                d2 *= ((zabb)localObject6).o();
              }
            }
            break;
          default: 
            if (localObject3[i8].b() == 6) {
              i7 = 1;
            } else {
              i3 = 1;
            }
            break;
          }
          localObject3[i8].a(true);
        }
        if (i3 != 0) {
          return zabc.f;
        }
        if (i7 != 0) {
          return zabb.a;
        }
        return new zabb(d2);
      }
      if (m == i1) {
        return a((zaiw[])localObject3, paramzaca, 0, m);
      }
      localObject4 = new zmr(paramzaca);
      localObject2 = new zazb((zaiw[])localObject3, (zaht)localObject4, paramzaca);
    }
    else if (j == 1)
    {
      if (k == n) {
        return a((zaiw[])localObject3, paramzaca, k, 0);
      }
      localObject4 = new zmr(paramzaca);
      localObject2 = new zazb((zaiw[])localObject3, (zaht)localObject4, paramzaca);
    }
    else if (k == n)
    {
      if (m == i1) {
        return a((zaiw[])localObject3, paramzaca, k, m);
      }
      localObject4 = new zmr(paramzaca);
      localObject2 = new zazc((zaiw[])localObject3, (zaht)localObject4, paramzaca);
    }
    else
    {
      localObject4 = new zmr(paramzaca);
      localObject2 = new zazc((zaiw[])localObject3, (zaht)localObject4, paramzaca);
    }
    zbsi localzbsi2 = new zbsi(false);
    Object localObject1 = zbam.a((zaiw)localObject2, localzbsi2, paramzaca, true, true);
    Object localObject5;
    if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
    {
      if (((zmr)localObject4).g() > 0)
      {
        localObject5 = new zbrn();
        i7 = ((zmr)localObject4).g();
        for (i8 = 0; i8 < i7; i8++)
        {
          localObject6 = zbam.a(localObject3[i8], (zaji)localObject5, paramzaca, true, false);
          if ((localObject6 != null) && (((zaie)localObject6).b() == 0))
          {
            localObject1 = localObject6;
            break;
          }
        }
      }
    }
    else {
      localObject1 = localzbsi2.a();
    }
    for (localObject6 : localObject3) {
      ((zaiw)localObject6).a(true);
    }
    return (zaie)localObject1;
  }
  
  private static zaie a(zaiw[] paramArrayOfzaiw, zaca paramzaca, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    double d = 1.0D;
    int i = 0;
    for (int j = 0; j < paramArrayOfzaiw.length; j++)
    {
      zaie localzaie;
      if (i != 0)
      {
        localzaie = zbam.a(paramArrayOfzaiw[j], (zaji)localObject, paramzaca, true, true);
        if ((localzaie != null) && (localzaie.b() == 0))
        {
          while (j < paramArrayOfzaiw.length)
          {
            paramArrayOfzaiw[j].a(true);
            j++;
          }
          return localzaie;
        }
      }
      else
      {
        localzaie = paramArrayOfzaiw[j].a(paramInt1, paramInt2).e(paramzaca);
        switch (localzaie.b())
        {
        case 0: 
          while (j < paramArrayOfzaiw.length)
          {
            paramArrayOfzaiw[j].a(true);
            j++;
          }
          return localzaie;
        case 3: 
          zabb localzabb = (zabb)localzaie;
          if (localzabb.q()) {
            i = 1;
          } else {
            d *= localzabb.o();
          }
          break;
        default: 
          i = 1;
        }
        if (i != 0)
        {
          localObject = new zbrn();
          localzaie = zbam.a(paramArrayOfzaiw[j], (zaji)localObject, paramzaca, true, true);
          if ((localzaie != null) && (localzaie.b() == 0))
          {
            while (j < paramArrayOfzaiw.length)
            {
              paramArrayOfzaiw[j].a(true);
              j++;
            }
            return localzaie;
          }
        }
      }
    }
    if (i != 0) {
      return zabb.a;
    }
    return new zabb(d);
  }
  
  public static zaie b(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject = null;
    zaie localzaie = paramArrayOfzaie[0].d(paramzaca);
    if (localzaie.b() == 0) {
      return localzaie;
    }
    zabb localzabb = localzaie.a(paramzaca, 7);
    if (localzabb == null) {
      return zabc.f;
    }
    if (localzabb.o() != 0.0D) {
      localObject = new zbse(paramzaca.c.m(), localzabb.o());
    }
    if (localObject == null) {
      localObject = new zbsi(false);
    }
    return a((zaji)localObject, paramArrayOfzaie, paramzaca, 1);
  }
  
  public static zaie c(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    double[] arrayOfDouble = new double[1];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    Object localObject = null;
    switch ((int)arrayOfDouble[0])
    {
    case 1: 
    case 101: 
      localObject = new zbrk(false, false);
      break;
    case 2: 
    case 102: 
      localObject = new zbrq(false, false);
      break;
    case 3: 
    case 103: 
      localObject = new zbrq(true, false);
      break;
    case 4: 
    case 104: 
      localObject = new zbsc(false, false);
      break;
    case 5: 
    case 105: 
      localObject = new zbsd(false, false);
      break;
    case 6: 
    case 106: 
      localObject = new zbsf(false);
      break;
    case 7: 
    case 107: 
      localObject = new zbrr(12, false);
      break;
    case 8: 
    case 108: 
      localObject = new zbrr(193, false);
      break;
    case 9: 
    case 109: 
      localObject = new zbsi(false);
      break;
    case 10: 
    case 110: 
      localObject = new zbsj(false, false, false);
      break;
    case 11: 
    case 111: 
      localObject = new zbsj(true, false, false);
      break;
    default: 
      return zabc.f;
    }
    boolean bool = (int)arrayOfDouble[0] > 100;
    zhq localzhq = new zhq(paramzaca, (zaji)localObject, bool);
    for (int i = 1; i < paramArrayOfzaie.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[i].d(paramzaca);
      if (localzaie.b() != 9)
      {
        if (zl.a())
        {
          zbpe localzbpe = new zbpe();
          localzbpe.a("Unexpected parameter for SUBTOTAL: expected Reference but was ");
          localzaie.a(localzbpe, paramzaca.i());
          zl.a(zs.a(localzbpe));
        }
      }
      else
      {
        localzaie = a((zaji)localObject, localzhq, paramzaca, (zabo)localzaie);
        if (localzaie != null) {
          return localzaie;
        }
      }
    }
    return ((zaji)localObject).a();
  }
  
  public static zaie d(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfzaie.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[i].e(paramzaca);
      if (localzaie.b() == 0) {
        return localzaie;
      }
      zabp localzabp = localzaie.i(paramzaca);
      if (localzabp == null) {
        return zabc.f;
      }
      localStringBuilder.append(localzabp.o());
    }
    return new zabp(zs.a(localStringBuilder));
  }
  
  static zaie e(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zbrp localzbrp = new zbrp(true, "");
    for (int i = 0; i < paramArrayOfzaie.length; i++)
    {
      zaiw localzaiw = paramArrayOfzaie[i].a(paramzaca, false);
      zaie localzaie = zbam.a(localzaiw, localzbrp, paramzaca, true, true);
      localzaiw.a(true);
      if ((localzaie != null) && (localzaie.b() == 0)) {
        return localzaie;
      }
    }
    return localzbrp.a();
  }
  
  static zaie f(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zaie localzaie = paramArrayOfzaie[0].e(paramzaca);
    if (localzaie.b() == 0) {
      return localzaie;
    }
    zabp localzabp = localzaie.i(paramzaca);
    if (localzabp == null) {
      return zabc.f;
    }
    localzaie = paramArrayOfzaie[1].e(paramzaca);
    if (localzaie.b() == 0) {
      return localzaie;
    }
    zaba localzaba = localzaie.j(paramzaca);
    if (localzaba == null) {
      return zabc.f;
    }
    zbrp localzbrp = new zbrp(localzaba.o(), localzabp.o());
    zaiw localzaiw = paramArrayOfzaie[2].a(paramzaca, false);
    localzaie = zbam.a(localzaiw, localzbrp, paramzaca, true, true);
    localzaiw.a(true);
    if ((localzaie != null) && (localzaie.b() == 0)) {
      return localzaie;
    }
    return localzbrp.a();
  }
  
  static zaie g(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    for (int i = 0; i < paramArrayOfzaie.length - 1; i += 2)
    {
      zaie localzaie = paramArrayOfzaie[i].e(paramzaca);
      if (localzaie.b() == 0) {
        return localzaie;
      }
      boolean bool = false;
      zaba localzaba = localzaie.j(paramzaca);
      if (localzaba == null) {
        return zabc.f;
      }
      bool = localzaba.o();
      if (bool) {
        return paramArrayOfzaie[(i + 1)];
      }
    }
    return zabg.a;
  }
  
  static zaie h(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zaie localzaie = paramArrayOfzaie[0].e(paramzaca);
    if (localzaie.b() == 0) {
      return localzaie;
    }
    zny localzny = zabt.b(localzaie, paramzaca, false);
    for (int i = 1; i < paramArrayOfzaie.length - 1; i += 2)
    {
      localzaie = paramArrayOfzaie[i].e(paramzaca);
      if (localzaie.b() == 0) {
        return localzaie;
      }
      if (localzny.a(localzaie)) {
        return paramArrayOfzaie[(i + 1)];
      }
    }
    if (paramArrayOfzaie.length % 2 == 0) {
      return paramArrayOfzaie[(paramArrayOfzaie.length - 1)];
    }
    return zabg.a;
  }
  
  public static zaie i(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    String[] arrayOfString = new String[1];
    Object localObject = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfString);
    if (localObject != null) {
      return (zaie)localObject;
    }
    if (arrayOfString[0] == null) {
      return zabc.f;
    }
    localObject = paramArrayOfzaie[1].d(paramzaca);
    switch (((zaie)localObject).b())
    {
    case 0: 
      return (zaie)localObject;
    case 9: 
      break;
    default: 
      return zabc.f;
    }
    zbap localzbap = ((zabo)localObject).o();
    Worksheet localWorksheet = paramzaca.c;
    if (localzbap.a() != null)
    {
      zwp localzwp = localzbap.a();
      WorksheetCollection localWorksheetCollection = paramzaca.p.e;
      if (((localzwp.a & 0xFFFF) != localWorksheetCollection.v()) || (localzwp.b != localzwp.c) || ((localzwp.b & 0xFFFF) >= localWorksheetCollection.getCount())) {
        return zabc.c;
      }
      localWorksheet = localWorksheetCollection.get(localzwp.b & 0xFFFF);
    }
    return localWorksheet.getPivotTables().a(localzbap.b(), localzbap.d(), arrayOfString[0], paramArrayOfzaie, paramzaca);
  }
  
  static zaie j(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    if (paramArrayOfzaie.length < 3) {
      return zabc.f;
    }
    double[] arrayOfDouble = new double[2];
    Object localObject1 = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localObject1 != null) {
      return (zaie)localObject1;
    }
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    switch ((int)arrayOfDouble[1])
    {
    case 0: 
      bool2 = true;
      bool3 = true;
      break;
    case 1: 
      bool4 = true;
      bool2 = true;
      bool3 = true;
      break;
    case 2: 
      bool1 = true;
      bool2 = true;
      bool3 = true;
      break;
    case 3: 
      bool1 = true;
      bool4 = true;
      bool2 = true;
      bool3 = true;
      break;
    case 4: 
      break;
    case 5: 
      bool4 = true;
      break;
    case 6: 
      bool1 = true;
      break;
    case 7: 
      bool1 = true;
      bool4 = true;
      break;
    default: 
      return zabc.f;
    }
    int i = (int)arrayOfDouble[0];
    arrayOfDouble = null;
    if ((i < 1) || (i > 19)) {
      return zabc.f;
    }
    Object localObject2;
    if (i < 14)
    {
      localObject2 = new zabo[paramArrayOfzaie.length - 2];
      Object localObject4;
      for (int j = 0; j < localObject2.length; j++)
      {
        localObject4 = zabt.c(paramArrayOfzaie[(2 + j)], paramzaca);
        if (((zaie)localObject4).b() == 0) {
          return (zaie)localObject4;
        }
        if (((zaie)localObject4).b() != 9) {
          return zabc.f;
        }
        localObject2[j] = ((zabo)localObject4);
      }
      Object localObject3 = null;
      switch (i)
      {
      case 1: 
        localObject3 = new zbrk(false, bool1);
        break;
      case 2: 
        localObject3 = new zbrq(false, bool1);
        break;
      case 3: 
        localObject3 = new zbrq(true, bool1);
        break;
      case 4: 
        localObject3 = new zbsc(false, bool1);
        break;
      case 5: 
        localObject3 = new zbsd(false, bool1);
        break;
      case 6: 
        localObject3 = new zbsf(bool1);
        break;
      case 7: 
        localObject3 = new zbrr(12, bool1);
        break;
      case 8: 
        localObject3 = new zbrr(193, bool1);
        break;
      case 9: 
        localObject3 = new zbsi(bool1);
        break;
      case 10: 
        localObject3 = new zbsj(false, false, bool1);
        break;
      case 11: 
        localObject3 = new zbsj(true, false, bool1);
        break;
      case 12: 
        localObject3 = new zbrr(227, bool1);
        break;
      case 13: 
        localObject3 = new zbrz(bool1, 1);
        break;
      default: 
        return zabc.f;
      }
      zaiw localzaiw;
      if ((!bool4) && (!bool2) && (!bool3))
      {
        for (Object localObject6 : localObject2)
        {
          localzaiw = ((zabo)localObject6).a(paramzaca, false);
          localObject1 = zbam.a(localzaiw, (zaji)localObject3, paramzaca, true, true);
          localzaiw.a(true);
          if ((localObject1 != null) && (((zaie)localObject1).b() == 0)) {
            return (zaie)localObject1;
          }
        }
      }
      else
      {
        localObject4 = new zhc(paramzaca, (zaji)localObject3, bool4, bool3, bool2);
        for (localzaiw : localObject2)
        {
          localObject1 = a((zaji)localObject3, (zhd)localObject4, paramzaca, localzaiw);
          if (localObject1 != null) {
            return (zaie)localObject1;
          }
        }
      }
      return ((zaji)localObject3).a();
    }
    if (paramArrayOfzaie.length != 4) {
      return zabc.f;
    }
    localObject1 = paramArrayOfzaie[2];
    if ((paramzaca.h) || (((zaie)localObject1).c(paramzaca)))
    {
      localObject2 = ((zaie)localObject1).a(paramzaca, false);
      if (((zaiw)localObject2).l())
      {
        ((zaiw)localObject2).a(true);
        localObject2 = ((zaiw)localObject2).a(0, 0).a(paramzaca, false);
      }
    }
    else if (((zaie)localObject1).g() == 64)
    {
      localObject2 = ((zaie)localObject1).a(paramzaca.e(), false);
    }
    else
    {
      localObject1 = ((zaie)localObject1).d(paramzaca);
      localObject2 = ((zaie)localObject1).a(paramzaca, false);
    }
    if (((zaiw)localObject2).b() == 0) {
      return ((zaiw)localObject2).a(0, 0);
    }
    double d = 0.0D;
    arrayOfDouble = new double[1];
    localObject1 = zabt.a(paramArrayOfzaie, paramzaca, 3, arrayOfDouble, 7);
    if (localObject1 != null) {
      return (zaie)localObject1;
    }
    d = arrayOfDouble[0];
    int m = -1;
    zbrv localzbrv;
    if ((((zaiw)localObject2).b() == 9) && ((bool4) || (bool2) || (bool3)))
    {
      localObject1 = zabt.c(paramArrayOfzaie[2], paramzaca);
      if (((zaie)localObject1).b() == 9)
      {
        ((zaiw)localObject2).a(true);
        localzbrv = new zbrv(64, false, false, bool1);
        zhc localzhc = new zhc(paramzaca, localzbrv, bool4, bool3, bool2);
        localObject1 = a(localzbrv, localzhc, paramzaca, (zabo)localObject1);
        if (localObject1 != null) {
          return (zaie)localObject1;
        }
        arrayOfDouble = localzbrv.d();
        m = localzbrv.e();
        if (m < 1) {
          return zabc.b;
        }
      }
    }
    if (m < 0)
    {
      if (((zaiw)localObject2).l())
      {
        localObject1 = zabt.c(paramArrayOfzaie[2], paramzaca);
        if ((((zaie)localObject1).b() != 6) && (((zaie)localObject1).b() != 9))
        {
          localObject1 = ((zaie)localObject1).e(paramzaca);
          if (((zaie)localObject1).b() == 3)
          {
            arrayOfDouble = new double[] { ((zabb)localObject1).o() };
            m = 1;
          }
          else
          {
            return zabc.f;
          }
        }
      }
      if (m < 0)
      {
        localzbrv = new zbrv(64, false, false, bool1);
        localObject1 = zbam.a((zaiw)localObject2, localzbrv, paramzaca, true, true);
        ((zaiw)localObject2).a(true);
        if ((localObject1 != null) && (((zaie)localObject1).b() == 0)) {
          return (zaie)localObject1;
        }
        arrayOfDouble = localzbrv.d();
        m = localzbrv.e();
        if (m < 1) {
          return zabc.b;
        }
      }
    }
    int i1;
    switch (i)
    {
    case 14: 
      i1 = (int)Math.ceil(d);
      if ((i1 < 1) || (i1 > m)) {
        return zabc.b;
      }
      za.a(arrayOfDouble, 0, m);
      return new zabb(arrayOfDouble[(m - i1)]);
    case 15: 
      i1 = (int)d;
      if ((i1 < 1) || (i1 > m)) {
        return zabc.b;
      }
      za.a(arrayOfDouble, 0, m);
      return new zabb(arrayOfDouble[(i1 - 1)]);
    case 16: 
      if ((m < 1) || (d < 0.0D) || (d > 1.0D)) {
        return zabc.b;
      }
      za.a(arrayOfDouble, 0, m);
      return new zabb(zgc.a(arrayOfDouble, (m - 1) * d));
    case 17: 
      if (m > 0)
      {
        za.a(arrayOfDouble, 0, m);
        switch ((int)d)
        {
        case 0: 
          return new zabb(arrayOfDouble[0]);
        case 1: 
          return new zabb(zgc.a(arrayOfDouble, (m - 1) * 0.25D));
        case 2: 
          return new zabb(zgc.a(arrayOfDouble, (m - 1) * 0.5D));
        case 3: 
          return new zabb(zgc.a(arrayOfDouble, (m - 1) * 0.75D));
        case 4: 
          return new zabb(arrayOfDouble[(m - 1)]);
        }
      }
      return zabc.b;
    case 18: 
      if (m < 1) {
        return zabc.b;
      }
      d = (m + 1) * d - 1.0D;
      if ((d < 0.0D) || (d > m - 1.0D)) {
        return zabc.b;
      }
      za.a(arrayOfDouble, 0, m);
      return new zabb(zgc.a(arrayOfDouble, d));
    case 19: 
      if (m > 0)
      {
        za.a(arrayOfDouble, 0, m);
        switch ((int)d)
        {
        case 1: 
          if (m < 3) {
            return zabc.b;
          }
          return new zabb(zgc.a(arrayOfDouble, (m + 1) * 0.25D - 1.0D));
        case 2: 
          return new zabb(zgc.a(arrayOfDouble, (m + 1) * 0.5D - 1.0D));
        case 3: 
          if (m < 3) {
            return zabc.b;
          }
          return new zabb(zgc.a(arrayOfDouble, (m + 1) * 0.75D - 1.0D));
        }
      }
      return zabc.b;
    }
    return zabc.f;
  }
  
  private static zaie a(zaji paramzaji, zhd paramzhd, zaca paramzaca, zabo paramzabo)
  {
    zwp localzwp = paramzabo.o().a(paramzaca);
    Cells localCells = null;
    if (localzwp != null)
    {
      if (paramzabo.a(localzwp, paramzaca)) {
        return zabc.c;
      }
      if (localzwp.b != localzwp.c) {
        return zabc.f;
      }
      if ((localzwp.a & 0xFFFF) == paramzaca.p.f) {
        localCells = paramzaca.p.e.get(localzwp.b & 0xFFFF).getCells();
      }
    }
    else
    {
      localCells = paramzaca.g;
    }
    Object localObject;
    if (localCells != null)
    {
      localObject = paramzabo.o();
      paramzhd.a(localCells.g());
      localCells.a(((zbap)localObject).u(), ((zbap)localObject).b(), ((zbap)localObject).d(), paramzhd, false, true);
      if (paramzhd.a()) {
        return paramzhd.b();
      }
    }
    else
    {
      localObject = paramzabo.a(paramzaca, false);
      zaie localzaie = zbam.a((zaiw)localObject, paramzaji, paramzaca, true, true);
      ((zaiw)localObject).a(true);
      if ((localzaie != null) && (localzaie.b() == 0)) {
        return localzaie;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */