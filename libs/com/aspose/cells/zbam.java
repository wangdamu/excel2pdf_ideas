package com.aspose.cells;

import com.aspose.cells.a.c.zc;

abstract class zbam
{
  public static zaie a(zaiw paramzaiw, int paramInt1, int paramInt2)
  {
    if (paramInt1 >= paramzaiw.c())
    {
      if (paramzaiw.c() != 1) {
        return zabc.g;
      }
      if (paramInt2 >= paramzaiw.d())
      {
        if (paramzaiw.d() != 1) {
          return zabc.g;
        }
        return paramzaiw.a(0, 0);
      }
      return paramzaiw.a(0, paramInt2);
    }
    if (paramInt2 >= paramzaiw.d())
    {
      if (paramzaiw.d() != 1) {
        return zabc.g;
      }
      return paramzaiw.a(paramInt1, 0);
    }
    return paramzaiw.a(paramInt1, paramInt2);
  }
  
  public static zaiw a(zaie paramzaie, zaca paramzaca)
  {
    zaiw localzaiw = paramzaie.a(paramzaca, false);
    if (localzaiw.l())
    {
      switch (paramzaie.b())
      {
      case 5: 
      case 7: 
      case 8: 
        if ((paramzaie.g() != 64) || (paramzaie.a(paramzaca) != 64))
        {
          localzaiw.a(true);
          return localzaiw.a(0, 0).d(paramzaca).a(paramzaca, false);
        }
        return localzaiw;
      }
      return localzaiw;
    }
    return localzaiw;
  }
  
  public static zaiw a(zaiw paramzaiw, int paramInt)
  {
    int i = paramzaiw.e() << 1;
    if (i < paramInt) {
      return new zazv(paramzaiw, paramInt);
    }
    int j = paramzaiw.w();
    if ((j > 0) && (i < paramInt + (j - paramzaiw.v() + 1))) {
      return new zazv(paramzaiw, paramInt);
    }
    return new zazw(paramzaiw, paramInt);
  }
  
  public static zaiw b(zaiw paramzaiw, int paramInt)
  {
    int i = paramzaiw.d() << 1;
    if (i < paramInt) {
      return new zbad(paramzaiw, paramInt);
    }
    int j = paramzaiw.w();
    if ((j > 0) && (paramzaiw.c() * (i - paramInt) < j - paramzaiw.v() + 1)) {
      return new zbad(paramzaiw, paramInt);
    }
    return new zbae(paramzaiw, paramInt);
  }
  
  public static zaiw c(zaiw paramzaiw, int paramInt)
  {
    int i = paramzaiw.c() << 1;
    if (i < paramInt) {
      return new zbag(paramzaiw, paramInt);
    }
    int j = paramzaiw.w();
    if ((j > 0) && (paramzaiw.d() * (i - paramInt) < j - paramzaiw.v() + 1)) {
      return new zbag(paramzaiw, paramInt);
    }
    return new zbah(paramzaiw, paramInt);
  }
  
  public static zaiw b(zaiw paramzaiw, int paramInt1, int paramInt2)
  {
    int i = paramzaiw.e() << 1;
    int j = paramInt1 * paramInt2;
    if (i < j) {
      return new zazz(paramzaiw, paramInt1, paramInt2);
    }
    int k = paramzaiw.w();
    if ((k > 0) && (i - (k - paramzaiw.v() + 1) < j)) {
      return new zazz(paramzaiw, paramInt1, paramInt2);
    }
    return new zbaa(paramzaiw, paramInt1, paramInt2);
  }
  
  public static zaiw a(zaiw paramzaiw, zaca paramzaca)
  {
    CellArea localCellArea = paramzaca.l;
    Object localObject;
    if (paramzaiw.m())
    {
      arrayOfInt = new int[2];
      if (paramzaiw.b(paramzaca, arrayOfInt))
      {
        localObject = new zaie[arrayOfInt[1] - arrayOfInt[0] + 1];
        return new zazi(paramzaiw, new zbzb((zaie[])localObject, paramzaiw, null, paramzaiw.y() ? paramzaca.e - localCellArea.StartColumn - arrayOfInt[0] : -arrayOfInt[0], paramzaiw.d(), paramzaca.e, false, paramzaiw.y(), new zbza(localObject.length)), paramzaca);
      }
      return new zazj(paramzaiw.o(), paramzaiw.b(), 1, paramzaiw.d());
    }
    if (paramzaiw.n())
    {
      arrayOfInt = new int[2];
      if (paramzaiw.b(paramzaca, arrayOfInt))
      {
        localObject = new zaie[arrayOfInt[1] - arrayOfInt[0] + 1];
        return new zazi(paramzaiw, new zbzb((zaie[])localObject, paramzaiw, null, paramzaiw.x() ? paramzaca.d - localCellArea.StartRow - arrayOfInt[0] : -arrayOfInt[0], paramzaiw.c(), paramzaca.d, true, paramzaiw.x(), new zbza(localObject.length)), paramzaca);
      }
      return new zazj(paramzaiw.o(), paramzaiw.b(), paramzaiw.c(), 1);
    }
    int[] arrayOfInt = new int[4];
    if (paramzaiw.a(paramzaca, arrayOfInt))
    {
      localObject = new zaie[arrayOfInt[2] - arrayOfInt[0] + 1][];
      return new zazi(paramzaiw, new zbzd((zaie[][])localObject, paramzaiw, null, arrayOfInt[3] - arrayOfInt[1] + 1, paramzaiw.c(), paramzaiw.d(), paramzaiw.x() ? paramzaca.d - localCellArea.StartRow - arrayOfInt[0] : -arrayOfInt[0], paramzaiw.y() ? paramzaca.e - localCellArea.StartColumn - arrayOfInt[1] : -arrayOfInt[1], paramzaca.d, paramzaca.e, paramzaiw.x(), paramzaiw.y()), paramzaca);
    }
    return new zazj(paramzaiw.o(), paramzaiw.b(), paramzaiw.c(), paramzaiw.d());
  }
  
  public static zaiw a(zaiw paramzaiw1, zaiw paramzaiw2, zaca paramzaca, zahv paramzahv)
  {
    if (paramzaca.j) {
      switch (paramzaca.m)
      {
      case 3: 
        if ((paramzaca.l.f() > 1) && (paramzaiw1.x() != paramzaiw2.x()))
        {
          if ((paramzaca.l.g() > 1) && (paramzaiw1.y() != paramzaiw2.y())) {
            paramzaca.m = 0;
          } else {
            paramzaca.m = 2;
          }
        }
        else if ((paramzaca.l.g() > 1) && (paramzaiw1.y() != paramzaiw2.y())) {
          paramzaca.m = 1;
        }
        break;
      case 1: 
        if ((paramzaca.l.f() > 1) && (paramzaiw1.x() != paramzaiw2.x())) {
          paramzaca.m = 0;
        }
        break;
      case 2: 
        if ((paramzaca.l.g() > 1) && (paramzaiw1.y() != paramzaiw2.y())) {
          paramzaca.m = 0;
        }
        break;
      }
    }
    if (paramzaiw1.m())
    {
      i = paramzaiw1.d();
      if (paramzaiw2.m())
      {
        if (i == paramzaiw2.d()) {
          return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
        }
        paramzaca.m &= 0xFFFFFFFD;
        if (i > paramzaiw2.d()) {
          paramzaiw2 = a(paramzaiw2, i);
        } else {
          paramzaiw1 = a(paramzaiw1, paramzaiw2.d());
        }
        return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
      }
      if ((paramzaiw2.n()) || (i == paramzaiw2.d())) {
        return new zazg(paramzaiw1.c(paramzaca), paramzaiw2.c(paramzaca), paramzahv, paramzaca, paramzaiw2.c(), i);
      }
      paramzaca.m &= 0xFFFFFFFD;
      if (i > paramzaiw2.d())
      {
        paramzaiw2 = c(paramzaiw2, i);
      }
      else
      {
        i = paramzaiw2.d();
        paramzaiw1 = a(paramzaiw1, i);
      }
      return new zazg(paramzaiw1.c(paramzaca), paramzaiw2, paramzahv, paramzaca, paramzaiw2.c(), i);
    }
    if (paramzaiw2.m())
    {
      i = paramzaiw2.d();
      if ((paramzaiw1.n()) || (i == paramzaiw1.d())) {
        return new zazg(paramzaiw1.c(paramzaca), paramzaiw2.c(paramzaca), paramzahv, paramzaca, paramzaiw1.c(), i);
      }
      paramzaca.m &= 0xFFFFFFFD;
      if (i > paramzaiw1.d())
      {
        paramzaiw1 = c(paramzaiw1, i);
      }
      else
      {
        i = paramzaiw1.d();
        paramzaiw2 = a(paramzaiw2, i);
      }
      return new zazg(paramzaiw1, paramzaiw2.c(paramzaca), paramzahv, paramzaca, paramzaiw1.c(), i);
    }
    if (paramzaiw1.n())
    {
      i = paramzaiw1.c();
      if (paramzaiw2.n())
      {
        if (i == paramzaiw2.c()) {
          return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
        }
        paramzaca.m &= 0xFFFFFFFE;
        if (i > paramzaiw2.c())
        {
          paramzaiw2 = a(paramzaiw2, i);
        }
        else
        {
          i = paramzaiw2.c();
          paramzaiw1 = a(paramzaiw1, i);
        }
        return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
      }
      if (i == paramzaiw2.c()) {
        return new zazg(paramzaiw1.c(paramzaca), paramzaiw2, paramzahv, paramzaca, i, paramzaiw2.d());
      }
      paramzaca.m &= 0xFFFFFFFE;
      if (i > paramzaiw2.c())
      {
        paramzaiw2 = c(paramzaiw2, i);
      }
      else
      {
        i = paramzaiw2.c();
        paramzaiw1 = a(paramzaiw1, i);
      }
      return new zazg(paramzaiw1.c(paramzaca), paramzaiw2, paramzahv, paramzaca, i, paramzaiw2.d());
    }
    if (paramzaiw2.n())
    {
      paramzaiw2 = paramzaiw2.c(paramzaca);
      i = paramzaiw2.c();
      if (i == paramzaiw1.c()) {
        return new zazg(paramzaiw1, paramzaiw2, paramzahv, paramzaca, i, paramzaiw1.d());
      }
      paramzaca.m &= 0xFFFFFFFE;
      if (i > paramzaiw1.c())
      {
        paramzaiw1 = c(paramzaiw1, i);
      }
      else
      {
        i = paramzaiw1.c();
        paramzaiw2 = a(paramzaiw2, i);
      }
      return new zazg(paramzaiw1, paramzaiw2, paramzahv, paramzaca, i, paramzaiw1.d());
    }
    int i = paramzaiw1.c();
    int j = paramzaiw1.d();
    if (i == paramzaiw2.c())
    {
      if (j == paramzaiw2.d()) {
        return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
      }
      paramzaca.m &= 0xFFFFFFFD;
      if (j > paramzaiw2.d())
      {
        paramzaiw2 = b(paramzaiw2, j);
      }
      else
      {
        j = paramzaiw2.d();
        paramzaiw1 = b(paramzaiw1, j);
      }
      return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
    }
    if (j == paramzaiw2.d())
    {
      paramzaca.m &= 0xFFFFFFFE;
      if (i > paramzaiw2.c())
      {
        paramzaiw2 = c(paramzaiw2, i);
      }
      else
      {
        i = paramzaiw2.c();
        paramzaiw1 = c(paramzaiw1, i);
      }
      return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
    }
    paramzaca.m = 0;
    if (i > paramzaiw2.c())
    {
      if (j > paramzaiw2.d())
      {
        paramzaiw2 = b(paramzaiw2, i, j);
      }
      else
      {
        j = paramzaiw2.d();
        paramzaiw1 = b(paramzaiw1, j);
        paramzaiw2 = c(paramzaiw2, i);
      }
      return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
    }
    if (j > paramzaiw2.d())
    {
      i = paramzaiw2.c();
      paramzaiw2 = b(paramzaiw2, j);
      paramzaiw1 = c(paramzaiw1, i);
    }
    else
    {
      paramzaiw1 = b(paramzaiw1, i, j);
    }
    return new zazh(paramzaiw1, paramzaiw2, paramzahv, paramzaca);
  }
  
  public static zaie a(zaiw paramzaiw)
  {
    zaie[][] arrayOfzaie = new zaie[paramzaiw.c()][];
    zaie localzaie = paramzaiw.o();
    int i = paramzaiw.d();
    for (int j = 0; j < arrayOfzaie.length; j++)
    {
      arrayOfzaie[j] = new zaie[i];
      zc.a(arrayOfzaie[j], 0, i, localzaie);
    }
    paramzaiw.f();
    while (paramzaiw.g()) {
      arrayOfzaie[paramzaiw.i()][paramzaiw.j()] = paramzaiw.h();
    }
    return new zaax(arrayOfzaie);
  }
  
  public static Object[][] b(zaiw paramzaiw, zaca paramzaca)
  {
    Object[][] arrayOfObject = new Object[paramzaiw.c()][];
    zaie localzaie = paramzaiw.o();
    int i = paramzaiw.d();
    for (int j = 0; j < arrayOfObject.length; j++)
    {
      arrayOfObject[j] = new Object[i];
      zc.a(arrayOfObject[j], 0, i, localzaie.b(paramzaca));
    }
    paramzaiw.f();
    while (paramzaiw.g()) {
      arrayOfObject[paramzaiw.i()][paramzaiw.j()] = paramzaiw.h().b(paramzaca);
    }
    return arrayOfObject;
  }
  
  public static zaie a(zaiw paramzaiw, zaji paramzaji, zaca paramzaca, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramzaiw.l()) {
      return paramzaji.a(paramzaiw.a(0, 0), paramzaca, paramBoolean1);
    }
    if (paramzaiw.q())
    {
      int i = paramzaiw.r();
      if (i < 0) {
        return paramzaji.a(paramzaiw.o(), paramzaca, paramBoolean1, paramzaiw.e());
      }
      if (((i > 0) || (paramzaiw.t() > 0) || (paramzaiw.s() < paramzaiw.c() - 1) || (paramzaiw.u() < paramzaiw.d() - 1)) && (paramzaji.a(paramzaiw.o(), paramBoolean1)))
      {
        if (paramBoolean2) {
          paramzaiw.f();
        }
        while (paramzaiw.g())
        {
          zaie localzaie2 = paramzaji.a(paramzaiw.h(), paramzaca, paramBoolean1);
          if ((localzaie2 != null) && ((localzaie2.b() == 0) || (((zaba)localzaie2).o()))) {
            return localzaie2;
          }
        }
        return null;
      }
    }
    zaie localzaie1 = paramzaiw.p();
    if ((localzaie1 != null) && (!localzaie1.c(paramzaca, false)))
    {
      localzaie1 = localzaie1.e(paramzaca);
      if (paramzaji.a(localzaie1, paramBoolean1))
      {
        if (paramBoolean2) {
          paramzaiw.f();
        }
        while (paramzaiw.g())
        {
          localzaie1 = paramzaji.a(paramzaiw.h(), paramzaca, paramBoolean1);
          if ((localzaie1 != null) && ((localzaie1.b() == 0) || (((zaba)localzaie1).o()))) {
            return localzaie1;
          }
        }
        return null;
      }
    }
    return a(paramzaiw, paramzaji, paramzaca, paramBoolean1, paramBoolean2, true);
  }
  
  public static zaie a(zaiw paramzaiw, zaji paramzaji, zaca paramzaca, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i;
    int j;
    int m;
    if ((paramzaiw.m()) || (paramzaiw.n()))
    {
      if (paramBoolean2)
      {
        paramzaiw.f();
        i = 0;
      }
      else if (paramBoolean3)
      {
        i = paramzaiw.k() + 1;
      }
      else
      {
        i = 0;
      }
      while (paramzaiw.g())
      {
        if (paramBoolean3)
        {
          j = paramzaiw.k();
          if (j > i)
          {
            localzaie1 = paramzaji.a(paramzaiw.o(), paramzaca, paramBoolean1, j - i);
            if (localzaie1 == null)
            {
              i = j + 1;
            }
            else
            {
              if ((localzaie1.b() == 0) || (((zaba)localzaie1).o())) {
                return localzaie1;
              }
              paramBoolean3 = false;
            }
          }
          else
          {
            i++;
          }
        }
        zaie localzaie1 = paramzaji.a(paramzaiw.h(), paramzaca, paramBoolean1);
        if ((localzaie1 != null) && ((localzaie1.b() == 0) || (((zaba)localzaie1).o()))) {
          return localzaie1;
        }
      }
      if (paramBoolean3)
      {
        m = paramzaiw.e();
        if (i < m) {
          return paramzaji.a(paramzaiw.o(), paramzaca, paramBoolean1, m - i);
        }
      }
    }
    else
    {
      i = paramzaiw.d();
      int k;
      if (paramBoolean2)
      {
        paramzaiw.f();
        j = 0;
        k = 0;
      }
      else if (paramBoolean3)
      {
        k = paramzaiw.j() + 1;
        if (k == i)
        {
          k = 0;
          j = paramzaiw.i() + 1;
        }
        else
        {
          j = paramzaiw.i();
        }
      }
      else
      {
        j = 0;
        k = 0;
      }
      while (paramzaiw.g())
      {
        if (paramBoolean3)
        {
          m = paramzaiw.i();
          int n = paramzaiw.j();
          if ((m != j) || (n != k))
          {
            localzaie2 = paramzaji.a(paramzaiw.o(), paramzaca, paramBoolean1, (m - j) * i + (n - k));
            if (localzaie2 == null)
            {
              k = n + 1;
              if (k == i)
              {
                j = m + 1;
                k = 0;
              }
              else
              {
                j = m;
              }
            }
            else
            {
              if ((localzaie2.b() == 0) || (((zaba)localzaie2).o())) {
                return localzaie2;
              }
              paramBoolean3 = false;
            }
          }
          else
          {
            k++;
            if (k == i)
            {
              j++;
              k = 0;
            }
          }
        }
        zaie localzaie2 = paramzaji.a(paramzaiw.h(), paramzaca, paramBoolean1);
        if ((localzaie2 != null) && ((localzaie2.b() == 0) || (((zaba)localzaie2).o()))) {
          return localzaie2;
        }
      }
      if (paramBoolean3)
      {
        int i1 = paramzaiw.c();
        if (j != i1) {
          return paramzaji.a(paramzaiw.o(), paramzaca, paramBoolean1, (i1 - j) * i - k);
        }
      }
    }
    return null;
  }
  
  static zaiw a(zaie[] paramArrayOfzaie, zaie paramzaie1, zaie paramzaie2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, int paramInt7, boolean paramBoolean2)
  {
    int i = paramInt4 - paramInt3;
    if (i == 1)
    {
      if (paramBoolean1) {
        return new zazr(paramzaie1, paramzaie2, paramInt1, paramInt6, 1, paramInt3 - paramInt5, 0, paramInt7, 0, paramBoolean2, false);
      }
      return new zazr(paramzaie1, paramzaie2, paramInt1, 1, paramInt6, 0, paramInt3 - paramInt5, 0, paramInt7, false, paramBoolean2);
    }
    if (paramInt2 == 0)
    {
      if (paramBoolean1) {
        return new zazj(paramzaie2, paramInt1, paramInt6, 1);
      }
      return new zazj(paramzaie2, paramInt1, 1, paramInt6);
    }
    if (paramInt2 == 1) {
      while (paramInt3 < paramInt4)
      {
        if (paramArrayOfzaie[paramInt3] == paramzaie1)
        {
          if (paramBoolean1) {
            return new zazr(paramzaie1, paramzaie2, paramInt1, paramInt6, 1, paramInt3 - paramInt5, 0, paramInt7, 0, paramBoolean2, false);
          }
          return new zazr(paramzaie1, paramzaie2, paramInt1, 1, paramInt6, 0, paramInt3 - paramInt5, 0, paramInt7, false, paramBoolean2);
        }
        paramInt3++;
      }
    }
    Object localObject1 = new int[paramInt2 < 0 ? i >> 2 : Math.min(paramInt2, i >> 2)];
    Object localObject2 = new int[localObject1.length];
    i = 0;
    int j = 0;
    int k = 0;
    while (paramInt3 < paramInt4)
    {
      if (paramArrayOfzaie[paramInt3] == paramzaie1)
      {
        if (k != 0)
        {
          localObject2[j] += 1;
        }
        else
        {
          if (j == localObject1.length) {
            break;
          }
          k = 1;
          localObject1[j] = paramInt3;
          localObject2[j] = paramInt3;
        }
        i++;
      }
      else if (k != 0)
      {
        localObject2[j] += 1;
        k = 0;
        j++;
      }
      paramInt3++;
    }
    if (k != 0)
    {
      localObject2[j] += 1;
      j++;
    }
    else if (paramInt3 < paramInt4)
    {
      localObject3 = new int[paramInt2 < 0 ? i + paramInt4 - paramInt3 : paramInt2];
      j = 0;
      for (int n = 0; n < localObject1.length; n++)
      {
        i = localObject1[n];
        localObject3[(j++)] = i;
        i++;
        m = localObject2[n];
        if (i < m) {
          for (;;)
          {
            localObject3[(j++)] = (i++);
            if (i == m) {
              break;
            }
          }
        }
      }
      localObject3[(j++)] = paramInt3;
      paramInt3++;
      if (paramInt3 < paramInt4) {
        for (;;)
        {
          if (paramArrayOfzaie[paramInt3] == paramzaie1) {
            localObject3[(j++)] = paramInt3;
          }
          paramInt3++;
          if (paramInt3 == paramInt4) {
            break;
          }
        }
      }
      if (j < localObject3.length)
      {
        int[] arrayOfInt = new int[j];
        System.arraycopy(localObject3, 0, arrayOfInt, 0, j);
        localObject3 = arrayOfInt;
      }
      return new zbal(paramzaie2, paramzaie1, paramInt1, (int[])localObject3, paramInt5, paramInt6, paramBoolean1, paramInt7, paramBoolean2);
    }
    if (i > j << 2)
    {
      if (j < localObject1.length)
      {
        localObject3 = new int[j];
        System.arraycopy(localObject1, 0, localObject3, 0, j);
        localObject1 = localObject3;
        localObject3 = new int[j];
        System.arraycopy(localObject2, 0, localObject3, 0, j);
        localObject2 = localObject3;
      }
      return new zazq(paramzaie2, paramzaie1, paramInt1, (int[])localObject1, (int[])localObject2, paramInt5, paramInt6, paramBoolean1, paramInt7, paramBoolean2);
    }
    if (i == 0)
    {
      if (paramBoolean1) {
        return new zazj(paramzaie2, paramInt1, paramInt6, 1);
      }
      return new zazj(paramzaie2, paramInt1, 1, paramInt6);
    }
    if (i == 1)
    {
      if (paramBoolean1) {
        return new zazr(paramzaie1, paramzaie2, paramInt1, paramInt6, 1, localObject1[0] - paramInt5, 0, paramInt7, 0, paramBoolean2, false);
      }
      return new zazr(paramzaie1, paramzaie2, paramInt1, 1, paramInt6, 0, localObject1[0] - paramInt5, 0, paramInt7, false, paramBoolean2);
    }
    Object localObject3 = new int[i];
    i = 0;
    for (int m = 0; m < j; m++)
    {
      paramInt3 = localObject1[m];
      localObject3[(i++)] = paramInt3;
      paramInt3++;
      paramInt4 = localObject2[m];
      if (paramInt3 < paramInt4) {
        for (;;)
        {
          localObject3[(i++)] = (paramInt3++);
          if (paramInt3 == paramInt4) {
            break;
          }
        }
      }
    }
    return new zbal(paramzaie2, paramzaie1, paramInt1, (int[])localObject3, paramInt5, paramInt6, paramBoolean1, paramInt7, paramBoolean2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */