package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zl;

class zfs
{
  static zaie a(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject = new double[1];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, (double[])localObject, 7);
    if (localzabc != null) {
      return localzabc;
    }
    double d = localObject[0];
    if ((d < 0.0D) || (d > 2958465.99D)) {
      return zabc.b;
    }
    if (d == 0.0D)
    {
      switch (paramInt)
      {
      case 69: 
        return new zabb(1900.0D);
      case 68: 
        return new zabb(1.0D);
      }
      return new zabb(0.0D);
    }
    localObject = paramzaca.b(d);
    switch (paramInt)
    {
    case 69: 
      return new zabb(((DateTime)localObject).getYear());
    case 68: 
      return new zabb(((DateTime)localObject).getMonth());
    case 67: 
      return new zabb(((DateTime)localObject).getDay());
    case 71: 
      return new zabb(((DateTime)localObject).getHour());
    case 72: 
      return new zabb(((DateTime)localObject).getMinute());
    case 73: 
      return new zabb(((DateTime)localObject).getMillisecond() > 500 ? ((DateTime)localObject).getSecond() + 1 : ((DateTime)localObject).getSecond());
    }
    return null;
  }
  
  static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3)
  {
    DateTime[] arrayOfDateTime = new DateTime[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDateTime, paramInt3);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble = null;
    if (paramArrayOfzaie.length > paramInt2)
    {
      arrayOfDouble = new double[paramArrayOfzaie.length - paramInt2];
      localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfDouble, paramInt3);
      if (localzabc != null) {
        return localzabc;
      }
    }
    if (paramInt1 == 545)
    {
      arrayOfDouble = new double[1];
      arrayOfDouble[0] = 12.0D;
    }
    Object localObject1;
    DateTime localDateTime;
    Object localObject2;
    switch (paramInt1)
    {
    case 449: 
      localObject1 = paramzaca.a(arrayOfDateTime[0].addMonths((int)arrayOfDouble[0]));
      if (((zabb)localObject1).o() < 0.0D) {
        return zabc.b;
      }
      return (zaie)localObject1;
    case 450: 
      localObject1 = arrayOfDateTime[0];
      if (((DateTime)localObject1).getMonth() != 12)
      {
        localDateTime = new DateTime(((DateTime)localObject1).getYear(), ((DateTime)localObject1).getMonth() + 1, 1);
      }
      else if (((DateTime)localObject1).getYear() == 1899)
      {
        if ((int)arrayOfDouble[0] < 0) {
          return zabc.b;
        }
        localDateTime = new DateTime(1900, 2, 1);
      }
      else
      {
        localDateTime = new DateTime(((DateTime)localObject1).getYear() + 1, 1, 1);
      }
      localObject2 = paramzaca.a(localDateTime.addMonths((int)arrayOfDouble[0]).addDays(-1.0D));
      if (((zabb)localObject2).o() < 0.0D) {
        return zabc.b;
      }
      return (zaie)localObject2;
    case 70: 
      localObject1 = arrayOfDateTime[0];
      if (zk.d((DateTime)localObject1, znq.m)) {
        localObject1 = paramzaca.b(paramzaca.b((DateTime)localObject1) - 1.0D);
      }
      if (arrayOfDouble != null) {
        return a((int)arrayOfDouble[0], ((DateTime)localObject1).getDayOfWeek());
      }
      return a(1, ((DateTime)localObject1).getDayOfWeek());
    case 465: 
    case 545: 
      int i = 0;
      if (arrayOfDouble != null) {
        switch ((int)arrayOfDouble[0])
        {
        case 21: 
          localDateTime = arrayOfDateTime[0];
          localObject2 = new DateTime(localDateTime.addDays(3 - localDateTime.addDays(-1.0D).getDayOfWeek()).getYear(), 1, 3);
          return new zabb((zk.e(localDateTime, (DateTime)localObject2).b() + ((DateTime)localObject2).getDayOfWeek() + 6) / 7);
        case 1: 
        case 17: 
          break;
        case 2: 
        case 11: 
          i = 1;
          break;
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
          i = (int)arrayOfDouble[0] - 10;
          break;
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        case 10: 
        case 18: 
        case 19: 
        case 20: 
        default: 
          return zabc.b;
        }
      }
      localDateTime = new DateTime(arrayOfDateTime[0].getYear(), 1, 1);
      localObject2 = zk.e(arrayOfDateTime[0], localDateTime);
      int j = (int)((zl)localObject2).c() + 1;
      int k = localDateTime.getDayOfWeek();
      int m = 0;
      if (i == k) {
        m = 7;
      } else if (i < k) {
        m = 7 - (k - i);
      } else {
        m = i - k;
      }
      if (j <= m) {
        return zabb.b;
      }
      j -= m;
      int n = j / 7 + 1;
      if (j % 7 != 0) {
        n++;
      }
      return new zabb(n);
    }
    return null;
  }
  
  private static zaie a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 1: 
    case 17: 
      paramInt2++;
      break;
    case 2: 
      if (paramInt2 == 0) {
        paramInt2 = 7;
      }
      break;
    case 3: 
      if (paramInt2 == 0) {
        paramInt2 = 6;
      } else {
        paramInt2--;
      }
      break;
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
      paramInt2 -= paramInt1 % 10 - 1;
      if (paramInt2 <= 0) {
        paramInt2 += 7;
      }
      break;
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    default: 
      return zabc.b;
    }
    return new zabb(paramInt2);
  }
  
  static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    double[] arrayOfDouble = new double[2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    if ((!paramzaca.a(arrayOfDouble[0])) || (!paramzaca.a(arrayOfDouble[1]))) {
      return zabc.b;
    }
    int i = 0;
    if (paramArrayOfzaie.length > 2)
    {
      boolean[] arrayOfBoolean = new boolean[1];
      localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfBoolean);
      if (localzabc != null) {
        return localzabc;
      }
      i = arrayOfBoolean[0];
    }
    return new zabb(a((int)arrayOfDouble[0], (int)arrayOfDouble[1], i, paramzaca));
  }
  
  static zaie b(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject1 = new double[2];
    Object localObject2 = zabt.a(paramArrayOfzaie, paramzaca, 0, (double[])localObject1, 7);
    if (localObject2 != null) {
      return (zaie)localObject2;
    }
    int i = (int)localObject1[0];
    int j = (int)localObject1[1];
    localObject2 = new String[1];
    Object localObject3 = zabt.a(paramArrayOfzaie, paramzaca, 2, (String[])localObject2);
    if (localObject3 != null) {
      return (zaie)localObject3;
    }
    localObject1 = localObject2[0].toUpperCase();
    if ((i <= j) && (i >= 0))
    {
      if (((String)localObject1).equals("D")) {
        return new zabb(j - i);
      }
      int k;
      if (((String)localObject1).equals("Y"))
      {
        localObject2 = paramzaca.b(i);
        localObject3 = paramzaca.b(j);
        k = 0;
        if (((DateTime)localObject2).getMonth() > ((DateTime)localObject3).getMonth()) {
          k = -1;
        } else if ((((DateTime)localObject2).getMonth() == ((DateTime)localObject3).getMonth()) && (((DateTime)localObject2).getDay() > ((DateTime)localObject3).getDay())) {
          k = -1;
        }
        return new zabb(((DateTime)localObject3).getYear() - ((DateTime)localObject2).getYear() + k);
      }
      if (((String)localObject1).equals("M"))
      {
        localObject2 = paramzaca.b(i);
        localObject3 = paramzaca.b(j);
        k = ((DateTime)localObject3).getDay() < ((DateTime)localObject2).getDay() ? -1 : 0;
        return new zabb((((DateTime)localObject3).getYear() - ((DateTime)localObject2).getYear()) * 12 + ((DateTime)localObject3).getMonth() - ((DateTime)localObject2).getMonth() + k);
      }
      int m;
      if (((String)localObject1).equals("YD"))
      {
        localObject2 = paramzaca.b(i);
        localObject3 = paramzaca.b(j);
        k = 0;
        if (((DateTime)localObject2).getMonth() > ((DateTime)localObject3).getMonth()) {
          k = -1;
        } else if ((((DateTime)localObject2).getMonth() == ((DateTime)localObject3).getMonth()) && (((DateTime)localObject2).getDay() > ((DateTime)localObject3).getDay())) {
          k = -1;
        }
        m = ((DateTime)localObject3).getYear() - ((DateTime)localObject2).getYear() + k;
        localObject2 = ((DateTime)localObject2).addYears(m);
        int n = ((DateTime)localObject3).getYear();
        int i1 = 0;
        if (((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0))) && (((DateTime)localObject3).getMonth() >= 3)) {
          if (((DateTime)localObject3).getYear() == ((DateTime)localObject2).getYear())
          {
            if ((((DateTime)localObject2).getMonth() == 2) && (((DateTime)localObject2).getDay() == 1)) {
              i1 = 1;
            } else if (((DateTime)localObject2).getMonth() == 1) {
              i1 = 1;
            }
          }
          else if (((DateTime)localObject3).getYear() > ((DateTime)localObject2).getYear()) {
            i1 = 1;
          }
        }
        return new zabb(j - paramzaca.b((DateTime)localObject2) - i1);
      }
      if (((String)localObject1).equals("MD"))
      {
        localObject2 = paramzaca.b(i);
        localObject3 = paramzaca.b(j);
        k = ((DateTime)localObject3).getDay() < ((DateTime)localObject2).getDay() ? -1 : 0;
        m = (((DateTime)localObject3).getYear() - ((DateTime)localObject2).getYear()) * 12 + ((DateTime)localObject3).getMonth() - ((DateTime)localObject2).getMonth() + k;
        localObject2 = ((DateTime)localObject2).addMonths(m);
        return new zabb(j - paramzaca.b((DateTime)localObject2));
      }
      if (((String)localObject1).equals("YM"))
      {
        localObject2 = paramzaca.b(i);
        localObject3 = paramzaca.b(j);
        k = ((DateTime)localObject3).getDay() < ((DateTime)localObject2).getDay() ? -1 : 0;
        m = ((DateTime)localObject3).getMonth() - ((DateTime)localObject2).getMonth();
        if ((m == 0) && (k < 0)) {
          return new zabb(11.0D);
        }
        return new zabb(m < 0 ? m + 12 + k : m + k);
      }
    }
    return zabc.b;
  }
  
  static zaie c(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    double[] arrayOfDouble = new double[2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    if ((!paramzaca.a(arrayOfDouble[0])) || (!paramzaca.a(arrayOfDouble[1]))) {
      return zabc.b;
    }
    return new zabb(Math.ceil(arrayOfDouble[0] - arrayOfDouble[1]));
  }
  
  static zaie d(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject1 = new double[2];
    Object localObject2 = zabt.a(paramArrayOfzaie, paramzaca, 0, (double[])localObject1, 7);
    if (localObject2 != null) {
      return (zaie)localObject2;
    }
    if (!paramzaca.a(localObject1[0])) {
      return zabc.b;
    }
    int i = (int)localObject1[0];
    int j = (int)localObject1[1];
    localObject1 = null;
    if ((paramArrayOfzaie.length > 2) && (paramArrayOfzaie[2] != zabg.a))
    {
      localObject2 = a(i, j, paramArrayOfzaie[2], paramzaca);
      if (localObject2 != null)
      {
        if ((localObject2 instanceof zaie)) {
          return (zaie)localObject2;
        }
        localObject1 = (int[])localObject2;
      }
    }
    if (j == 0) {
      return new zabb(i);
    }
    return a(i, j, (int[])localObject1, paramzaca, 65);
  }
  
  private static zaie a(int paramInt1, int paramInt2, int[] paramArrayOfInt, zaca paramzaca, int paramInt3)
  {
    int i = 7 - a(paramInt3);
    int k;
    if (paramInt2 > 0)
    {
      j = 0;
      if (paramArrayOfInt != null)
      {
        j = za.a(paramArrayOfInt, paramInt1);
        if (j < 0) {
          j = -j - 1;
        }
      }
      if (paramInt2 >= i)
      {
        paramInt1 += paramInt2 / i * 7;
        k = paramInt2 % i;
        if ((paramArrayOfInt != null) && (j < paramArrayOfInt.length)) {
          for (;;)
          {
            if ((j < paramArrayOfInt.length) && (paramArrayOfInt[j] <= paramInt1))
            {
              if ((paramInt3 & 64 >> paramzaca.b(paramArrayOfInt[j]).getDayOfWeek()) == 0) {
                k++;
              }
              j++;
            }
            else
            {
              if (k < i) {
                break;
              }
              paramInt1 += k / i * 7;
              k %= i;
            }
          }
        }
        if (k == 0)
        {
          localDateTime = paramzaca.b(paramInt1);
          if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) != 0) {
            for (;;)
            {
              localDateTime = localDateTime.addDays(-1.0D);
              paramInt1--;
              if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) == 0) {
                break;
              }
            }
          }
          return new zabb(paramInt1);
        }
      }
      else
      {
        k = paramInt2;
      }
      localDateTime = paramzaca.b(paramInt1);
      for (;;)
      {
        localDateTime = localDateTime.addDays(1.0D);
        paramInt1++;
        if ((paramArrayOfInt != null) && (j < paramArrayOfInt.length) && (paramArrayOfInt[j] == paramInt1))
        {
          j++;
        }
        else if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) == 0)
        {
          k--;
          if (k < 1) {
            break;
          }
        }
      }
      return new zabb(paramInt1);
    }
    paramInt2 = -paramInt2;
    int j = 0;
    if (paramArrayOfInt != null)
    {
      j = za.a(paramArrayOfInt, paramInt1);
      if (j < 0) {
        j = -j - 2;
      }
    }
    if (paramInt2 >= i)
    {
      paramInt1 -= paramInt2 / i * 7;
      if (paramInt1 < 0) {
        return zabc.b;
      }
      k = paramInt2 % i;
      if ((paramArrayOfInt != null) && (j > -1)) {
        for (;;)
        {
          if ((j > -1) && (paramArrayOfInt[j] >= paramInt1))
          {
            if ((paramInt3 & 64 >> paramzaca.b(paramArrayOfInt[j]).getDayOfWeek()) == 0) {
              k++;
            }
            j--;
          }
          else
          {
            if (k < i) {
              break;
            }
            paramInt1 -= k / i * 7;
            if (paramInt1 < 0) {
              return zabc.b;
            }
            k %= i;
          }
        }
      }
      if (k == 0)
      {
        localDateTime = paramzaca.b(paramInt1);
        if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) != 0) {
          for (;;)
          {
            localDateTime = localDateTime.addDays(1.0D);
            paramInt1++;
            if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) == 0) {
              break;
            }
          }
        }
        return new zabb(paramInt1);
      }
    }
    else
    {
      k = paramInt2;
    }
    DateTime localDateTime = paramzaca.b(paramInt1);
    while (k > 0)
    {
      localDateTime = localDateTime.addDays(-1.0D);
      paramInt1--;
      if (paramInt1 < 0) {
        return zabc.b;
      }
      if ((paramArrayOfInt != null) && (j > -1) && (paramArrayOfInt[j] == paramInt1)) {
        j--;
      } else if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) == 0) {
        k--;
      }
    }
    return new zabb(paramInt1);
  }
  
  private static Object a(int paramInt1, int paramInt2, zaie paramzaie, zaca paramzaca)
  {
    zaiw localzaiw = paramzaie.a(paramzaca, false);
    if (localzaiw.b() == 0) {
      return localzaiw.a(0, 0);
    }
    double[] arrayOfDouble = new double[localzaiw.e()];
    localzaiw.f();
    paramzaie = zabt.a(localzaiw, arrayOfDouble, paramzaca, 0x5 | (ztr.b(zuf.i) & 0xFF) << 4 | 0xF000);
    localzaiw.a(true);
    localzaiw = null;
    if (paramzaie.b() == 0) {
      return paramzaie;
    }
    za.a(arrayOfDouble);
    int i = 0;
    int j = paramInt2 < 0 ? 1 : 0;
    int k = paramInt2 == 0 ? 1 : 0;
    int[] arrayOfInt = null;
    if (k == 0) {
      arrayOfInt = new int[arrayOfDouble.length];
    }
    int n = 0;
    for (double d : arrayOfDouble)
    {
      if (!paramzaca.a(d)) {
        return zabc.b;
      }
      if (k == 0)
      {
        int m = (int)d;
        if (m != n)
        {
          n = m;
          if (j != 0 ? m < paramInt1 : m > paramInt1)
          {
            arrayOfInt[i] = m;
            i++;
          }
        }
      }
    }
    if ((k != 0) || (i < 1)) {
      return null;
    }
    if (i < arrayOfInt.length)
    {
      ??? = new int[i];
      System.arraycopy(arrayOfInt, 0, ???, 0, i);
      return ???;
    }
    return arrayOfInt;
  }
  
  private static int a(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < 7; j++) {
      if ((paramInt & 1 << j) != 0) {
        i++;
      }
    }
    return i;
  }
  
  static zaie e(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    double[] arrayOfDouble = new double[2];
    Object localObject1 = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localObject1 != null) {
      return (zaie)localObject1;
    }
    if (!paramzaca.a(arrayOfDouble[0])) {
      return zabc.b;
    }
    int i = (int)arrayOfDouble[0];
    int j = (int)arrayOfDouble[1];
    arrayOfDouble = null;
    if (j == 0) {
      return new zabb(i);
    }
    int[] arrayOfInt = null;
    int k = 65;
    if (paramArrayOfzaie.length > 2)
    {
      localObject1 = paramArrayOfzaie[2].e(paramzaca);
      if (localObject1 == zabg.a) {
        return zabc.b;
      }
      localObject1 = a((zaie)localObject1);
      if (((zaie)localObject1).b() == 3)
      {
        k = (int)((zabb)localObject1).o();
        if (k == 127) {
          return zabc.f;
        }
      }
      else
      {
        return (zaie)localObject1;
      }
      if (paramArrayOfzaie.length > 3)
      {
        Object localObject2 = a(i, j, paramArrayOfzaie[3], paramzaca);
        if (localObject2 != null)
        {
          if ((localObject2 instanceof zaie)) {
            return (zaie)localObject2;
          }
          arrayOfInt = (int[])localObject2;
        }
      }
    }
    return a(i, j, arrayOfInt, paramzaca, k);
  }
  
  private static zaie a(zaie paramzaie)
  {
    if (paramzaie.b() == 3)
    {
      int i = (int)((zabb)paramzaie).o();
      switch (i)
      {
      case 1: 
        i = 65;
        break;
      case 2: 
        i = 96;
        break;
      case 11: 
        i = 64;
        break;
      default: 
        if ((i > 2) && (i < 8)) {
          i = 96 >> i - 2;
        } else if ((i > 11) && (i < 18)) {
          i = 64 >> i - 11;
        } else {
          return zabc.b;
        }
        break;
      }
      return new zabb(i);
    }
    if (paramzaie.b() == 2)
    {
      String str = ((zabp)paramzaie).o();
      if (str.length() != 7) {
        return zabc.b;
      }
      str = str.charAt(6) + str.substring(0, 6);
      str = zft.a(str);
      if (str == null) {
        return zabc.b;
      }
      return new zabb(ze.b(str, 2));
    }
    return zabc.f;
  }
  
  static zaie f(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    int k = 0;
    double[] arrayOfDouble = new double[2];
    Object localObject = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localObject != null) {
      return (zaie)localObject;
    }
    if ((!paramzaca.a(arrayOfDouble[0])) || (!paramzaca.a(arrayOfDouble[1]))) {
      return zabc.b;
    }
    int i = (int)arrayOfDouble[0];
    int j = (int)arrayOfDouble[1];
    if (i > j)
    {
      k = 1;
      j = i;
      i = (int)arrayOfDouble[1];
    }
    int m = 0;
    if ((paramArrayOfzaie.length > 2) && (paramArrayOfzaie[2] != zabg.a))
    {
      localObject = a(i, j, paramArrayOfzaie[2], paramzaca, 65);
      if (((zaie)localObject).b() == 0) {
        return (zaie)localObject;
      }
      m = (int)((zabb)localObject).o();
    }
    int n = a(i, j, paramzaca, 65);
    return new zabb(k != 0 ? m - n : n - m);
  }
  
  private static zaie a(int paramInt1, int paramInt2, zaie paramzaie, zaca paramzaca, int paramInt3)
  {
    zaiw localzaiw = paramzaie.a(paramzaca, false);
    if (localzaiw.b() == 0) {
      return localzaiw.a(0, 0);
    }
    int i = 0;
    double[] arrayOfDouble1 = new double[localzaiw.e()];
    localzaiw.f();
    paramzaie = zabt.a(localzaiw, arrayOfDouble1, paramzaca, 0x5 | (ztr.b(zuf.i) & 0xFF) << 4 | 0xF000);
    localzaiw.a(true);
    localzaiw = null;
    if (paramzaie.b() == 0) {
      return paramzaie;
    }
    za.a(arrayOfDouble1);
    int k = 0;
    for (double d : arrayOfDouble1)
    {
      if (!paramzaca.a(d)) {
        return zabc.b;
      }
      int j = (int)d;
      if ((j >= paramInt1) && (j <= paramInt2) && (j != k))
      {
        k = j;
        if ((paramInt3 & 64 >> paramzaca.b(j).getDayOfWeek()) == 0) {
          i++;
        }
      }
    }
    return new zabb(i);
  }
  
  static zaie g(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    int k = 0;
    double[] arrayOfDouble = new double[2];
    Object localObject = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localObject != null) {
      return (zaie)localObject;
    }
    if ((!paramzaca.a(arrayOfDouble[0])) || (!paramzaca.a(arrayOfDouble[1]))) {
      return zabc.b;
    }
    int i = (int)arrayOfDouble[0];
    int j = (int)arrayOfDouble[1];
    if (i > j)
    {
      k = 1;
      j = i;
      i = (int)arrayOfDouble[1];
    }
    int m = 65;
    int n = 0;
    if (paramArrayOfzaie.length > 2)
    {
      localObject = paramArrayOfzaie[2].e(paramzaca);
      if (localObject == zabg.a) {
        return zabc.b;
      }
      localObject = a((zaie)localObject);
      if (((zaie)localObject).b() == 3) {
        m = (int)((zabb)localObject).o();
      } else {
        return (zaie)localObject;
      }
      if ((paramArrayOfzaie.length > 3) && (paramArrayOfzaie[3] != zabg.a))
      {
        localObject = a(i, j, paramArrayOfzaie[3], paramzaca, m);
        if (((zaie)localObject).b() == 0) {
          return (zaie)localObject;
        }
        n = (int)((zabb)localObject).o();
      }
    }
    if (m == 127) {
      return zabb.a;
    }
    int i1 = a(i, j, paramzaca, m);
    return new zabb(k != 0 ? n - i1 : i1 - n);
  }
  
  private static int a(int paramInt1, int paramInt2, zaca paramzaca, int paramInt3)
  {
    if (paramInt2 == paramInt1) {
      return (paramInt3 & 64 >> paramzaca.b(paramInt1).getDayOfWeek()) == 0 ? 1 : 0;
    }
    int i = 7 - a(paramInt3);
    int j = paramInt2 - paramInt1 + 1;
    int k = j % 7;
    j = j / 7 * i;
    if (k == 0) {
      return j;
    }
    DateTime localDateTime = paramzaca.b(paramInt2 - k + 1);
    if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) == 0) {
      j++;
    }
    k--;
    while (k > 0)
    {
      localDateTime = localDateTime.addDays(1.0D);
      if ((paramInt3 & 64 >> localDateTime.getDayOfWeek()) == 0) {
        j++;
      }
      k--;
    }
    return j;
  }
  
  static zaie h(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    int k = 0;
    double[] arrayOfDouble = new double[paramArrayOfzaie.length];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    if ((!paramzaca.a(arrayOfDouble[0])) || (!paramzaca.a(arrayOfDouble[1]))) {
      return zabc.b;
    }
    int i = (int)arrayOfDouble[0];
    int j = (int)arrayOfDouble[1];
    if (i > j)
    {
      j = i;
      i = (int)arrayOfDouble[1];
    }
    if (arrayOfDouble.length > 2) {
      k = (int)arrayOfDouble[2];
    }
    switch (k)
    {
    case 0: 
      return new zabb(a(i, j, false, paramzaca) / 360.0D);
    case 1: 
      if (i == j) {
        return new zabb(0.0D);
      }
      return new zabb((j - i) / a(paramzaca.b(i), paramzaca.b(j)));
    case 2: 
      return new zabb((j - i) / 360.0D);
    case 3: 
      return new zabb((j - i) / 365.0D);
    case 4: 
      if (i == j) {
        return new zabb(0.0D);
      }
      return new zabb(a(i, j, true, paramzaca) / 360.0D);
    }
    return zabc.b;
  }
  
  private static int a(int paramInt1, int paramInt2, boolean paramBoolean, zaca paramzaca)
  {
    if (paramInt1 == paramInt2) {
      return 0;
    }
    if (paramInt1 == 60) {
      return 1 + a(paramzaca.b(paramInt1 + 1), paramzaca.b(paramInt2), paramBoolean);
    }
    return a(paramzaca.b(paramInt1), paramzaca.b(paramInt2), paramBoolean);
  }
  
  static int a(DateTime paramDateTime1, DateTime paramDateTime2, boolean paramBoolean)
  {
    int i = (paramDateTime2.getDay() == 29) && (paramDateTime2.getMonth() == 2) && (DateTime.a(paramDateTime2.getYear())) ? 1 : 0;
    int j = 0;
    int k = paramDateTime2.getYear() - paramDateTime1.getYear();
    paramDateTime2 = paramDateTime2.addYears(paramDateTime1.getYear() - paramDateTime2.getYear());
    if (zk.d(paramDateTime2, paramDateTime1))
    {
      paramDateTime2 = paramDateTime2.addYears(1);
      j += 360 * (k - 1);
      if (i != 0) {
        j++;
      }
    }
    else
    {
      j += 360 * k;
      if ((i != 0) && (!DateTime.a(paramDateTime2.getYear()))) {
        j++;
      }
    }
    if (paramDateTime2.getYear() > paramDateTime1.getYear())
    {
      j += (paramDateTime2.getMonth() - 1) * 30;
      j += paramDateTime2.getDay();
      if (paramDateTime2.getDay() == 31) {
        if (!paramBoolean)
        {
          if ((paramDateTime1.getDay() == 30) || (paramDateTime1.getDay() == 31)) {
            j--;
          }
        }
        else {
          j--;
        }
      }
      j += (13 - paramDateTime1.getMonth()) * 30 - paramDateTime1.getDay();
      if (paramDateTime1.getDay() == 31) {
        j++;
      }
    }
    else
    {
      j += (paramDateTime2.getMonth() - paramDateTime1.getMonth()) * 30 + paramDateTime2.getDay() - paramDateTime1.getDay();
      switch (paramDateTime1.getDay())
      {
      case 31: 
        j++;
        break;
      case 28: 
        if ((!paramBoolean) && (paramDateTime1.getMonth() == 2) && (paramDateTime1.getYear() != 1900) && (!DateTime.a(paramDateTime1.getYear()))) {
          j -= 2;
        }
        break;
      case 29: 
        if ((!paramBoolean) && (paramDateTime1.getMonth() == 2) && (DateTime.a(paramDateTime1.getYear()))) {
          j--;
        }
        break;
      }
      if (paramDateTime2.getDay() == 31) {
        if (!paramBoolean)
        {
          if ((paramDateTime1.getDay() == 30) || (paramDateTime1.getDay() == 31)) {
            j--;
          }
        }
        else {
          j--;
        }
      }
    }
    return j;
  }
  
  private static double a(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    int i = paramDateTime1.getYear();
    int j = paramDateTime2.getYear();
    int k = 1;
    if (k != 0)
    {
      m = j - i + 1;
      paramDateTime1 = new DateTime(i, 1, 1);
      paramDateTime2 = new DateTime(j + 1, 1, 1);
      localObject = zk.e(paramDateTime2, paramDateTime1);
      int n = (int)((zl)localObject).c();
      return n / m;
    }
    int m = j - i;
    Object localObject = new DateTime(j, paramDateTime1.getMonth(), paramDateTime1.getDay());
    zl localzl = zk.e((DateTime)localObject, paramDateTime1);
    int i1 = (int)localzl.c() + 1;
    return i1 / m;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */