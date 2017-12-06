package com.aspose.cells;

abstract class zfz
{
  static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca, boolean paramBoolean)
  {
    Object localObject1 = paramArrayOfzaie[0].e(paramzaca);
    if (localObject1 == zabg.a) {
      localObject1 = zabb.a;
    } else if (((zaie)localObject1).b() == 0) {
      return (zaie)localObject1;
    }
    zaie localzaie = paramArrayOfzaie[1];
    if (localzaie == zabg.a) {
      return zabc.g;
    }
    if (localzaie.b() == 0) {
      return localzaie;
    }
    zabc localzabc1 = null;
    int i = 0;
    Object localObject2 = new double[1];
    localzabc1 = zabt.a(paramArrayOfzaie, paramzaca, 2, (double[])localObject2, 7);
    if (localzabc1 == null) {
      i = (int)localObject2[0] - 1;
    }
    if (i > 0)
    {
      localObject2 = new zaie[1];
      localzaie = a(localzaie, (zaie[])localObject2, i, paramBoolean, paramzaca);
      localzabc1 = localObject2[0];
    }
    else
    {
      localzaie = a(localzaie, null, 0, paramBoolean, paramzaca);
    }
    if (localzaie.b() == 0) {
      return localzaie;
    }
    localObject2 = localzaie.a(paramzaca, false);
    if (((zaiw)localObject2).l())
    {
      if (((zaiw)localObject2).b() == 0)
      {
        ((zaiw)localObject2).a(true);
        return ((zaiw)localObject2).a(0, 0);
      }
      if (localzaie.g() == 64)
      {
        ((zaiw)localObject2).a(true);
        return zabc.g;
      }
    }
    int j = 1;
    if ((((zaie)localObject1).b() == 2) && (paramzaca.c.m())) {
      j = 0;
    }
    if (paramArrayOfzaie.length > 3)
    {
      boolean[] arrayOfBoolean = new boolean[1];
      zabc localzabc2 = zabt.a(paramArrayOfzaie, paramzaca, 3, arrayOfBoolean);
      if (localzabc2 != null)
      {
        ((zaiw)localObject2).a(true);
        return localzabc2;
      }
      if (arrayOfBoolean[0] == 0) {
        j = 0;
      }
    }
    int k = a((zaie)localObject1, paramBoolean ? ((zaiw)localObject2).c(0) : ((zaiw)localObject2).b(0), j, paramzaca);
    ((zaiw)localObject2).a(true);
    if (k == -1) {
      return zabc.g;
    }
    if (i < 0) {
      return zabc.f;
    }
    if (localzabc1 != null)
    {
      if (localzabc1.b() == 0) {
        return localzabc1;
      }
      if (paramBoolean) {
        return localzabc1.a(new int[] { k, 0 }, paramzaca, false);
      }
      return localzabc1.a(new int[] { 0, k }, paramzaca, false);
    }
    if (paramBoolean)
    {
      if (i < ((zaiw)localObject2).d()) {
        return ((zaiw)localObject2).a(k, i);
      }
      return zabc.c;
    }
    if (i < ((zaiw)localObject2).c()) {
      return ((zaiw)localObject2).a(i, k);
    }
    return zabc.c;
  }
  
  private static zaie a(zaie paramzaie, zaie[] paramArrayOfzaie, int paramInt, boolean paramBoolean, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 9: 
      return a((zabo)paramzaie, paramInt, paramBoolean, paramArrayOfzaie);
    case 7: 
      zabe localzabe = (zabe)paramzaie;
      if ((!paramzaca.h) && (localzabe.p().c().a() == 32)) {
        return a(localzabe.d(paramzaca), paramArrayOfzaie, paramInt, paramBoolean, paramzaca);
      }
      break;
    case 8: 
      return a(paramzaie.d(paramzaca), paramArrayOfzaie, paramInt, paramBoolean, paramzaca);
    }
    return paramzaie;
  }
  
  private static zabo a(zabo paramzabo, int paramInt, boolean paramBoolean, zaie[] paramArrayOfzaie)
  {
    zbap localzbap1 = paramzabo.o();
    if (paramBoolean)
    {
      if (localzbap1.p() == 1) {
        return paramzabo;
      }
      localzbap2 = new zbap(localzbap1);
      localzbap2.d(localzbap1.d());
      localzabo = new zabo(paramzabo.g(), localzbap2);
      if ((paramArrayOfzaie != null) && (paramInt > 0) && (paramInt < localzbap1.p()))
      {
        localzbap2 = new zbap(localzbap1);
        localzbap2.b(localzbap1.d() + paramInt);
        localzbap2.d(localzbap2.d());
        paramArrayOfzaie[0] = new zabo(paramzabo.g(), localzbap2);
      }
      return localzabo;
    }
    if (localzbap1.q() == 1) {
      return paramzabo;
    }
    zbap localzbap2 = new zbap(localzbap1);
    localzbap2.c(localzbap1.b());
    zabo localzabo = new zabo(paramzabo.g(), localzbap2);
    if ((paramArrayOfzaie != null) && (paramInt > 0) && (paramInt < localzbap1.q()))
    {
      localzbap2 = new zbap(localzbap1);
      localzbap2.a(localzbap1.b() + paramInt);
      localzbap2.c(localzbap2.b());
      paramArrayOfzaie[0] = new zabo(paramzabo.g(), localzbap2);
    }
    return localzabo;
  }
  
  static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject1 = paramArrayOfzaie[0].e(paramzaca);
    if (localObject1 == zabg.a) {
      localObject1 = zabb.a;
    } else if (((zaie)localObject1).b() == 0) {
      return (zaie)localObject1;
    }
    zaie localzaie = paramArrayOfzaie[1];
    if (localzaie == zabg.a) {
      return zabc.g;
    }
    Object localObject2 = null;
    if (paramArrayOfzaie.length > 2)
    {
      localzaie = a(localzaie, null, paramzaca);
    }
    else
    {
      localObject3 = new zaie[1];
      localzaie = a(localzaie, (zaie[])localObject3, paramzaca);
      localObject2 = localObject3[0];
    }
    if (localzaie.b() == 0) {
      return localzaie;
    }
    Object localObject3 = localzaie.a(paramzaca.e(), false);
    if (((zaiw)localObject3).b() == 0) {
      return ((zaiw)localObject3).a(0, 0);
    }
    int i = ((zaiw)localObject3).c();
    int j = ((zaiw)localObject3).d();
    int k;
    int m;
    if (j <= i)
    {
      k = 1;
      m = i;
    }
    else
    {
      k = 0;
      m = j;
    }
    int n = k;
    if (paramArrayOfzaie.length > 2)
    {
      m = -1;
      localObject2 = paramArrayOfzaie[2];
      if (((zaie)localObject2).b() == 12) {
        return zabc.f;
      }
      Object localObject4;
      if (((zaie)localObject2).a(paramzaca) == 32)
      {
        localzaie = ((zaie)localObject2).d(paramzaca);
        if (localzaie.b() == 9)
        {
          localObject2 = localzaie;
          localObject4 = ((zabo)localObject2).o();
          m = ((zbap)localObject4).q();
          if (m > 1)
          {
            if (((zbap)localObject4).p() > 1)
            {
              ((zaiw)localObject3).a(true);
              return zabc.g;
            }
            n = 1;
            if (m < (k != 0 ? i : j))
            {
              m = k != 0 ? i : j;
              localObject4 = new zbap(((zbap)localObject4).a(), ((zbap)localObject4).b(), ((zbap)localObject4).d(), ((zbap)localObject4).b() + m - 1, ((zbap)localObject4).h());
              localObject2 = new zabo(((zaie)localObject2).g(), (zbap)localObject4);
            }
          }
          else
          {
            m = ((zbap)localObject4).p();
            n = 0;
            if (((zbap)localObject4).p() < (k != 0 ? i : j))
            {
              m = k != 0 ? i : j;
              localObject4 = new zbap(((zbap)localObject4).a(), ((zbap)localObject4).b(), ((zbap)localObject4).d(), ((zbap)localObject4).f(), ((zbap)localObject4).d() + m - 1);
              localObject2 = new zabo(((zaie)localObject2).g(), (zbap)localObject4);
            }
          }
        }
      }
      if (m < 0)
      {
        localObject4 = new int[2];
        ((zaie)localObject2).a((int[])localObject4, paramzaca, false);
        m = localObject4[0];
        if (m > 1)
        {
          if (localObject4[1] > 1)
          {
            ((zaiw)localObject3).a(true);
            return zabc.g;
          }
          n = 1;
        }
        else
        {
          n = 0;
          m = localObject4[1];
        }
      }
    }
    int i1 = a((zaie)localObject1, k != 0 ? ((zaiw)localObject3).c(0) : ((zaiw)localObject3).b(0), 1, paramzaca);
    ((zaiw)localObject3).a(true);
    if ((i1 == -1) || (i1 >= m)) {
      return zabc.g;
    }
    if (localObject2 != null)
    {
      if (n != 0) {
        return ((zaie)localObject2).a(new int[] { i1, 0 }, paramzaca, false);
      }
      return ((zaie)localObject2).a(new int[] { 0, i1 }, paramzaca, false);
    }
    if (k != 0) {
      return ((zaiw)localObject3).a(i1, j - 1);
    }
    return ((zaiw)localObject3).a(i - 1, i1);
  }
  
  private static zaie a(zaie paramzaie, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 9: 
      return a((zabo)paramzaie, paramArrayOfzaie);
    case 7: 
      zabe localzabe = (zabe)paramzaie;
      if ((!paramzaca.h) && (localzabe.p().c().a() == 32)) {
        return a(localzabe.d(paramzaca), paramArrayOfzaie, paramzaca);
      }
      break;
    case 8: 
      return a(paramzaie.d(paramzaca), paramArrayOfzaie, paramzaca);
    }
    return paramzaie;
  }
  
  private static zabo a(zabo paramzabo, zaie[] paramArrayOfzaie)
  {
    zbap localzbap1 = paramzabo.o();
    if (localzbap1.p() <= localzbap1.q())
    {
      if (localzbap1.p() == 1) {
        return paramzabo;
      }
      localzbap2 = new zbap(localzbap1);
      localzbap2.d(localzbap1.d());
      localzabo = new zabo(paramzabo.g(), localzbap2);
      if (paramArrayOfzaie != null)
      {
        localzbap2 = new zbap(localzbap1);
        localzbap2.b(localzbap1.h());
        paramArrayOfzaie[0] = new zabo(paramzabo.g(), localzbap2);
      }
      return localzabo;
    }
    if (localzbap1.q() == 1) {
      return paramzabo;
    }
    zbap localzbap2 = new zbap(localzbap1);
    localzbap2.c(localzbap1.b());
    zabo localzabo = new zabo(paramzabo.g(), localzbap2);
    if (paramArrayOfzaie != null)
    {
      localzbap2 = new zbap(localzbap1);
      localzbap2.a(localzbap1.f());
      paramArrayOfzaie[0] = new zabo(paramzabo.g(), localzbap2);
    }
    return localzabo;
  }
  
  static zaie b(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject = paramArrayOfzaie[0].e(paramzaca);
    if (localObject == zabg.a) {
      localObject = zabb.a;
    } else if (((zaie)localObject).b() == 0) {
      return (zaie)localObject;
    }
    zaie localzaie = a(paramArrayOfzaie[1], paramzaca);
    if (localzaie == zabg.a) {
      return zabc.g;
    }
    if (localzaie.b() == 0) {
      return localzaie;
    }
    zaiw localzaiw = localzaie.a(paramzaca, false);
    if (localzaiw.l())
    {
      if (localzaiw.b() == 0)
      {
        localzaiw.a(true);
        return localzaiw.a(0, 0);
      }
      if (localzaie.g() == 64)
      {
        localzaiw.a(true);
        return zabc.g;
      }
    }
    if ((!localzaiw.m()) && (!localzaiw.n()))
    {
      localzaiw.a(true);
      return zabc.g;
    }
    int i = 1;
    if (paramArrayOfzaie.length > 2)
    {
      double[] arrayOfDouble = new double[1];
      zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfDouble, 7);
      if (localzabc != null) {
        return localzabc;
      }
      if (arrayOfDouble[0] > 0.0D) {
        i = 1;
      } else if (arrayOfDouble[0] < 0.0D) {
        i = -1;
      } else {
        i = 0;
      }
    }
    int j = a((zaie)localObject, localzaiw, i, paramzaca);
    localzaiw.a(true);
    if (j == -1) {
      return zabc.g;
    }
    return new zabb(j + 1);
  }
  
  private static zaie a(zaie paramzaie, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 7: 
      zabe localzabe = (zabe)paramzaie;
      if ((!paramzaca.h) && (localzabe.p().c().a() == 32)) {
        return a(localzabe.d(paramzaca), paramzaca);
      }
      return paramzaie;
    case 8: 
      return a(paramzaie.d(paramzaca), paramzaca);
    }
    return paramzaie;
  }
  
  private static int a(zaie paramzaie, zaiw paramzaiw, int paramInt, zaca paramzaca)
  {
    switch (paramInt)
    {
    case 0: 
      return a(paramzaie, paramzaiw, paramzaca);
    case -1: 
      return b(paramzaie, paramzaiw, paramzaca);
    }
    return c(paramzaie, paramzaiw, paramzaca);
  }
  
  private static int a(zaie paramzaie, zaiw paramzaiw, zaca paramzaca)
  {
    zny localzny = zabt.b(paramzaie, paramzaca, true);
    int i = paramzaie.b();
    zaie localzaie = paramzaiw.o();
    paramzaiw.f();
    if ((localzaie.b() == i) && (localzny.a(localzaie)))
    {
      int j = 0;
      while (paramzaiw.g())
      {
        int k = paramzaiw.k();
        if (k > j) {
          return j;
        }
        j++;
        localzaie = paramzaiw.h().e(paramzaca);
        if ((localzaie.b() == i) && (localzny.b(localzaie))) {
          return k;
        }
      }
      if (j < paramzaiw.e()) {
        return j;
      }
      return -1;
    }
    while (paramzaiw.g())
    {
      localzaie = paramzaiw.h().e(paramzaca);
      if ((localzaie.b() == i) && (localzny.b(localzaie))) {
        return paramzaiw.k();
      }
    }
    return -1;
  }
  
  private static int b(zaie paramzaie, zaiw paramzaiw, zaca paramzaca)
  {
    zny localzny = zabt.b(paramzaie, paramzaca, true);
    int i = paramzaie.b();
    int j = -1;
    zaie localzaie = paramzaiw.o();
    paramzaiw.f();
    int k;
    if (localzaie.b() == i)
    {
      int m = localzny.c(localzaie);
      int n = 0;
      while (paramzaiw.g())
      {
        int i1 = paramzaiw.k();
        if (i1 > n)
        {
          if (m == 0) {
            return n;
          }
          if (m > 0) {
            j = i1 - 1;
          } else {
            return j;
          }
          n = i1 + 1;
        }
        else
        {
          n++;
        }
        localzaie = paramzaiw.h().e(paramzaca);
        if (localzaie.b() == i)
        {
          k = localzny.c(localzaie);
          if (k == 0) {
            return i1;
          }
          if (k > 0) {
            j = paramzaiw.k();
          } else {
            return j;
          }
        }
      }
      if (n < paramzaiw.e())
      {
        if (m == 0) {
          return n;
        }
        if (m > 0) {
          j = paramzaiw.e() - 1;
        }
      }
      return j;
    }
    while (paramzaiw.g())
    {
      localzaie = paramzaiw.h().e(paramzaca);
      if (localzaie.b() == i)
      {
        k = localzny.c(localzaie);
        if (k == 0) {
          return paramzaiw.k();
        }
        if (k > 0) {
          j = paramzaiw.k();
        } else {
          return j;
        }
      }
    }
    return j;
  }
  
  private static int c(zaie paramzaie, zaiw paramzaiw, zaca paramzaca)
  {
    int i = 0;
    int j = paramzaiw.e() - 1;
    int k = -1;
    int m = 0;
    zny localzny = zabt.b(paramzaie, paramzaca, false);
    int i1 = paramzaie.b();
    int i2 = (i + j) / 2;
    while (i <= j) {
      if (!paramzaiw.a(i2))
      {
        j = i2 - 1;
        i2 = (i + i2) / 2;
      }
      else
      {
        int n = paramzaiw.k();
        if (n > j)
        {
          j = i2 - 1;
          i2 = (i + i2) / 2;
        }
        else
        {
          zaie localzaie = paramzaiw.h().e(paramzaca);
          if (localzaie.b() != paramzaie.b())
          {
            int i3 = 1;
            if (n < j) {
              while (paramzaiw.g())
              {
                n = paramzaiw.k();
                if (n <= j)
                {
                  localzaie = paramzaiw.h().e(paramzaca);
                  if (localzaie.b() == i1) {
                    i3 = 0;
                  }
                }
              }
            }
            if (i3 != 0)
            {
              j = i2 - 1;
              i2 = (i + i2) / 2;
              continue;
            }
          }
          m = localzny.c(localzaie);
          if (m == 0) {
            return Math.max(n, a(localzny, paramzaiw, n + 1, paramzaca));
          }
          if (m < 0)
          {
            k = n;
            i = k + 1;
            i2 = (i + j) / 2;
          }
          else
          {
            j = i2 - 1;
            i2 = (i + i2) / 2;
          }
        }
      }
    }
    return k;
  }
  
  private static int a(zny paramzny, zaiw paramzaiw, int paramInt, zaca paramzaca)
  {
    zaie localzaie = paramzaiw.o();
    int i = -1;
    int j = paramzny.a();
    if (localzaie.b() == j)
    {
      boolean bool = paramzny.a(localzaie);
      while (paramzaiw.g())
      {
        int k = paramzaiw.k();
        if (k > paramInt)
        {
          if (bool) {
            i = k - 1;
          } else {
            return i;
          }
          paramInt = k + 1;
        }
        else
        {
          paramInt++;
        }
        localzaie = paramzaiw.h().e(paramzaca);
        if ((localzaie.b() != j) || (!paramzny.b(localzaie))) {
          return i;
        }
        i = k;
      }
      if ((bool) && (paramInt < paramzaiw.e())) {
        return paramzaiw.e() - 1;
      }
      return i;
    }
    while (paramzaiw.g())
    {
      localzaie = paramzaiw.h().e(paramzaca);
      if ((localzaie.b() != j) || (!paramzny.b(localzaie))) {
        return i;
      }
      i = paramzaiw.k();
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */