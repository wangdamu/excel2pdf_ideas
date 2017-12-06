package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.a.c.zy;
import java.util.ArrayList;

abstract class zfr
{
  public static zaie a(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject1 = zabt.c(paramArrayOfzaie[0], paramzaca);
    if (((zaie)localObject1).b() == 0) {
      return (zaie)localObject1;
    }
    if (((zaie)localObject1).b() != 9) {
      return zabc.f;
    }
    zbap localzbap = ((zabo)localObject1).o();
    if (localzbap.q() < 2) {
      return zabc.f;
    }
    String[] arrayOfString = new String[localzbap.p()];
    zc.a(arrayOfString, 0, arrayOfString.length, "");
    zabo localzabo = new zabo(64, new zbap(localzbap.a(), localzbap.b(), localzbap.d(), localzbap.b(), localzbap.h()));
    zaiw localzaiw = localzabo.a(paramzaca, false);
    localzaiw.f();
    while (localzaiw.g())
    {
      zabp localzabp = localzaiw.h().i(paramzaca);
      if (localzabp != null) {
        arrayOfString[localzaiw.j()] = localzabp.o();
      }
    }
    localzaiw.a(true);
    int i = -1;
    localObject1 = paramArrayOfzaie[1].e(paramzaca);
    if (((zaie)localObject1).b() == 3)
    {
      i = (int)((zabb)paramArrayOfzaie[1]).o() - 1;
    }
    else if (localObject1 != zabg.a)
    {
      localObject2 = ((zaie)localObject1).i(paramzaca);
      if (localObject2 != null)
      {
        localObject3 = ((zabp)localObject2).o();
        for (int j = 0; j < arrayOfString.length; j++) {
          if (zy.a(arrayOfString[j], (String)localObject3))
          {
            i = j;
            break;
          }
        }
      }
    }
    if ((i < 0) || (i >= arrayOfString.length)) {
      return zabc.f;
    }
    localObject1 = zabt.c(paramArrayOfzaie[2], paramzaca);
    if (((zaie)localObject1).b() == 0) {
      return (zaie)localObject1;
    }
    if (((zaie)localObject1).b() != 9) {
      return zabc.f;
    }
    Object localObject2 = ((zabo)localObject1).o();
    if (((zbap)localObject2).q() < 2) {
      return zabc.f;
    }
    localzabo = new zabo(64, new zbap(((zbap)localObject2).a(), ((zbap)localObject2).b(), ((zbap)localObject2).d(), ((zbap)localObject2).b(), ((zbap)localObject2).h()));
    localzaiw = localzabo.a(paramzaca, false);
    Object localObject3 = new int[((zbap)localObject2).p()];
    Object localObject4 = new int[arrayOfString.length];
    zc.a((int[])localObject3, 0, localObject3.length, -1);
    localzaiw.f();
    while (localzaiw.g())
    {
      localObject5 = localzaiw.h().i(paramzaca);
      if ((localObject5 != null) && (!((zabp)localObject5).o().equals(""))) {
        for (int k = 0; k < arrayOfString.length; k++) {
          if (zy.a(((zabp)localObject5).o(), arrayOfString[k]))
          {
            localObject3[localzaiw.j()] = k;
            localObject4[k] += 1;
            break;
          }
        }
      }
    }
    localzaiw.a(true);
    localzabo = new zabo(64, new zbap(((zbap)localObject2).a(), ((zbap)localObject2).b() + 1, ((zbap)localObject2).d(), ((zbap)localObject2).f(), ((zbap)localObject2).h()));
    localzaiw = localzabo.a(paramzaca, false);
    localzaiw.f();
    Object localObject5 = new boolean[localzaiw.c()];
    zc.a((boolean[])localObject5, 0, localObject5.length, true);
    Object localObject6 = new ArrayList(localObject5.length);
    for (int m = 0; m < localObject5.length; m++) {
      ((ArrayList)localObject6).add(null);
    }
    zny[][] arrayOfzny = (zny[][])null;
    int[] arrayOfInt = new int[arrayOfString.length];
    int n = -1;
    int i1 = i;
    int i2 = i;
    Object localObject7;
    while (localzaiw.g())
    {
      if (localzaiw.i() != n)
      {
        if ((arrayOfzny != null) && (a(arrayOfzny))) {
          ((ArrayList)localObject6).set(n, null);
        }
        n = localzaiw.i();
        arrayOfzny = new zny[arrayOfString.length][];
        ((ArrayList)localObject6).set(n, arrayOfzny);
      }
      if (localObject3[localzaiw.j()] < 0)
      {
        localObject1 = localzaiw.h().e(paramzaca);
        zaba localzaba = ((zaie)localObject1).j(paramzaca);
        if ((localzaba == null) || (!localzaba.o()))
        {
          localObject5[n] = 0;
          arrayOfzny = (zny[][])null;
          ((ArrayList)localObject6).set(n, null);
        }
      }
      else if (arrayOfzny != null)
      {
        i3 = localObject3[localzaiw.j()];
        localObject7 = arrayOfzny[i3];
        if (localObject7 == null)
        {
          localObject7 = new zny[localObject4[i3]];
          arrayOfzny[i3] = localObject7;
          arrayOfInt[i3] = 0;
        }
        zny localzny = zabt.a(localzaiw.h(), paramzaca, false);
        if (localzny != null)
        {
          int tmp929_927 = i3;
          int[] tmp929_925 = arrayOfInt;
          int tmp931_930 = tmp929_925[tmp929_927];
          tmp929_925[tmp929_927] = (tmp931_930 + 1);
          localObject7[tmp931_930] = localzny;
          if (i3 < i2) {
            i2 = i3;
          } else if (i3 > i1) {
            i1 = i3;
          }
        }
      }
    }
    localzaiw.a(true);
    if ((arrayOfzny != null) && (a(arrayOfzny))) {
      ((ArrayList)localObject6).set(n, null);
    }
    int i3 = 1;
    int i4 = 0;
    for (n = 0; n < localObject5.length; n++) {
      if (localObject5[n] != 0)
      {
        i3 = 0;
        if (((ArrayList)localObject6).get(n) == null)
        {
          localObject6 = null;
          break;
        }
        i4++;
      }
    }
    localzbap = new zbap(localzbap);
    localzbap.a(localzbap.b() + 1);
    Object localObject8 = null;
    zbrs localzbrs = null;
    boolean bool = paramzaca.c.h;
    if (bool)
    {
      localzbrs = new zbrs();
      localObject8 = localzbrs;
    }
    else
    {
      localObject8 = a(paramInt, Math.min(localzbap.q(), 100));
    }
    if (i3 != 0)
    {
      if (localObject8 == null) {
        return zabg.a;
      }
      return ((zaji)localObject8).a();
    }
    arrayOfString = null;
    localObject3 = null;
    arrayOfInt = null;
    if (localObject6 == null)
    {
      localzbap.d(localzbap.d() + i);
      localzbap.b(localzbap.d() + i);
      localzabo = new zabo(64, localzbap);
      localzaiw = localzabo.a(paramzaca, false);
      localzaiw.f();
      while (localzaiw.g()) {
        if (bool)
        {
          localzbrs.a(localzaiw.i());
        }
        else
        {
          localObject1 = ((zaji)localObject8).a(localzaiw.h(), paramzaca, true);
          if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
          {
            localzaiw.a(true);
            return (zaie)localObject1;
          }
        }
      }
      localzaiw.a(true);
      return ((zaji)localObject8).a();
    }
    if (i4 < localObject5.length)
    {
      ArrayList localArrayList = new ArrayList(i4);
      for (n = 0; n < localObject5.length; n++) {
        if ((localObject5[n] != 0) && (((ArrayList)localObject6).get(n) != null)) {
          localArrayList.add(((ArrayList)localObject6).get(n));
        }
      }
      localObject6 = localArrayList;
    }
    int i5 = (i2 > localzbap.d()) || (i1 < localzbap.h()) ? 1 : 0;
    int i10;
    if (i5 != 0)
    {
      i -= i2;
      localzbap.d(localzbap.d() + i1);
      localzbap.b(localzbap.d() + i2);
      i6 = i1 - i2 + 1;
      for (n = 0; n < ((ArrayList)localObject6).size(); n++)
      {
        arrayOfzny = (zny[][])((ArrayList)localObject6).get(n);
        localObject9 = new zny[i6][];
        for (int i8 = i2; i8 <= i1; i8++)
        {
          localObject7 = arrayOfzny[i8];
          if ((localObject7 != null) && (localObject7[0] != null))
          {
            if (localObject7.length > 1) {
              for (i10 = 1; i10 < localObject7.length; i10++) {
                if (localObject7[i10] == null)
                {
                  zny[] arrayOfzny2 = new zny[i10];
                  System.arraycopy(localObject7, 0, arrayOfzny2, 0, i10);
                  localObject7 = arrayOfzny2;
                  break;
                }
              }
            }
            localObject9[(i8 - i2)] = localObject7;
          }
        }
        ((ArrayList)localObject6).set(n, localObject9);
      }
      Object localObject9 = new int[i6];
      System.arraycopy(localObject4, i2, localObject9, 0, i6);
      localObject4 = localObject9;
      i1 -= i2;
      i2 = 0;
    }
    else
    {
      for (n = 0; n < ((ArrayList)localObject6).size(); n++)
      {
        arrayOfzny = (zny[][])((ArrayList)localObject6).get(n);
        for (i6 = i2; i6 <= i1; i6++)
        {
          localObject7 = arrayOfzny[i6];
          if ((localObject7 != null) && (localObject7[0] != null))
          {
            if (localObject7.length > 1) {
              for (i7 = 1; i7 < localObject7.length; i7++) {
                if (localObject7[i7] == null)
                {
                  zny[] arrayOfzny1 = new zny[i7];
                  System.arraycopy(localObject7, 0, arrayOfzny1, 0, i7);
                  arrayOfzny[i6] = arrayOfzny1;
                  break;
                }
              }
            }
          }
          else {
            arrayOfzny[i6] = null;
          }
        }
      }
    }
    localzabo = new zabo(64, localzbap);
    localzaiw = localzabo.a(paramzaca, false);
    localzaiw.f();
    if (!localzaiw.g()) {
      return ((zaji)localObject8).a();
    }
    if (i2 == i1)
    {
      for (;;)
      {
        if (a((ArrayList)localObject6, localzaiw.h(), paramzaca)) {
          if (bool)
          {
            localzbrs.a(localzaiw.i());
          }
          else
          {
            localObject1 = ((zaji)localObject8).a(localzaiw.h(), paramzaca, true);
            if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
            {
              localzaiw.a(true);
              return (zaie)localObject1;
            }
          }
        }
        if (!localzaiw.g()) {
          break;
        }
      }
      localzaiw.a(true);
      return ((zaji)localObject8).a();
    }
    int i6 = 2;
    for (int i7 = localzbap.p() - 2; i7 > 0; i7--) {
      for (n = 0; n < ((ArrayList)localObject6).size(); n++)
      {
        arrayOfzny = (zny[][])((ArrayList)localObject6).get(n);
        if (arrayOfzny[i7] != null)
        {
          i6++;
          break;
        }
      }
    }
    i7 = 1;
    int i9 = -1;
    if ((i6 << 1 > localzbap.p()) && ((localzaiw instanceof zayu)))
    {
      n = -1;
      i10 = 0;
      i6 = localzbap.p();
      i7 = 0;
      localObject1 = null;
      i9 = -1;
      for (;;)
      {
        if (localzaiw.i() != n)
        {
          if ((i7 != 0) && (localObject1 != null))
          {
            if (i10 < i6) {
              if (i6 == i10 + 1)
              {
                if (localObject4[i10] > 0) {
                  i7 = a((ArrayList)localObject6, zabg.a, i10, (boolean[])localObject5) > 0 ? 1 : 0;
                }
              }
              else {
                i7 = a((ArrayList)localObject6, i10, i6, (boolean[])localObject5) > 0 ? 1 : 0;
              }
            }
            if (i7 != 0) {
              if (bool)
              {
                if (i9 != -1) {
                  localzbrs.a(i9);
                }
              }
              else
              {
                localObject1 = ((zaji)localObject8).a((zaie)localObject1, paramzaca, true);
                if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
                {
                  localzaiw.a(true);
                  return (zaie)localObject1;
                }
              }
            }
          }
          n = localzaiw.i();
          i10 = 0;
          localObject1 = null;
          i9 = -1;
          localObject5[0] = 1;
          if (localObject5.length > 1) {
            zc.a((boolean[])localObject5, 1, localObject5.length, true);
          }
          i7 = 1;
        }
        int i11 = localzaiw.j();
        if (i11 > i10) {
          if (i11 == i10 + 1)
          {
            if (localObject4[i10] > 0) {
              i7 = a((ArrayList)localObject6, zabg.a, i10, (boolean[])localObject5) > 0 ? 1 : 0;
            }
          }
          else {
            i7 = a((ArrayList)localObject6, i10, i11, (boolean[])localObject5) > 0 ? 1 : 0;
          }
        }
        i10 = i11 + 1;
        if (i7 != 0) {
          if (i11 == i)
          {
            localObject1 = localzaiw.h().e(paramzaca);
            i9 = localzaiw.i();
            i7 = a((ArrayList)localObject6, (zaie)localObject1, i11, (boolean[])localObject5) > 0 ? 1 : 0;
          }
          else if ((i11 > i) && (localObject1 == zabg.a))
          {
            i7 = 0;
          }
          else if (localObject4[i11] > 0)
          {
            i7 = a((ArrayList)localObject6, localzaiw.h().e(paramzaca), i11, (boolean[])localObject5) > 0 ? 1 : 0;
          }
        }
        if (i7 != 0)
        {
          if (!localzaiw.g()) {
            break;
          }
        }
        else if (!localzaiw.b(n + 1, 0)) {
          break;
        }
      }
      if ((i7 != 0) && (localObject1 != null))
      {
        if (i10 < i6) {
          if (i6 == i10 + 1)
          {
            if (localObject4[i10] > 0) {
              i7 = a((ArrayList)localObject6, zabg.a, i10, (boolean[])localObject5) > 0 ? 1 : 0;
            }
          }
          else {
            i7 = a((ArrayList)localObject6, i10, i6, (boolean[])localObject5) > 0 ? 1 : 0;
          }
        }
        if (i7 != 0) {
          if (bool)
          {
            if (i9 != -1) {
              localzbrs.a(i9);
            }
          }
          else
          {
            localObject1 = ((zaji)localObject8).a((zaie)localObject1, paramzaca, true);
            if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
            {
              localzaiw.a(true);
              return (zaie)localObject1;
            }
          }
        }
      }
      return ((zaji)localObject8).a();
    }
    if (i1 == i)
    {
      i7 = 0;
      for (i10 = localzbap.p() - 1; i10 > -1; i10--)
      {
        for (n = 0; n < ((ArrayList)localObject6).size(); n++)
        {
          arrayOfzny = (zny[][])((ArrayList)localObject6).get(n);
          if (arrayOfzny[i10] != null)
          {
            i7 = 1;
            break;
          }
        }
        if (i7 != 0)
        {
          i1 = i10;
          break;
        }
      }
    }
    i1++;
    i4 = localzbap.q();
    for (n = 0; n < i4; n++)
    {
      localObject5[0] = 1;
      if (localObject5.length > 1) {
        zc.a((boolean[])localObject5, 1, localObject5.length, true);
      }
      i7 = 1;
      localObject1 = zabg.a;
      i9 = -1;
      for (i10 = 0; i10 < i1; i10++) {
        if (localObject4[i10] > 0) {
          if (i10 == i)
          {
            i9 = n;
            localObject1 = localzaiw.a(n, i10).e(paramzaca);
            if ((localObject1 == zabg.a) || (a((ArrayList)localObject6, (zaie)localObject1, i10, (boolean[])localObject5) < 1))
            {
              i7 = 0;
              break;
            }
          }
          else if (a((ArrayList)localObject6, localzaiw.a(n, i10).e(paramzaca), i10, (boolean[])localObject5) < 1)
          {
            i7 = 0;
            break;
          }
        }
      }
      if (i7 != 0)
      {
        if (localObject1 == zabg.a)
        {
          i9 = n;
          localObject1 = localzaiw.a(n, i);
        }
        if (localObject1 != zabg.a) {
          if (bool)
          {
            if (i9 != -1) {
              localzbrs.a(i9);
            }
          }
          else
          {
            localObject1 = ((zaji)localObject8).a((zaie)localObject1, paramzaca, true);
            if ((localObject1 != null) && (((zaie)localObject1).b() == 0))
            {
              localzaiw.a(true);
              return (zaie)localObject1;
            }
          }
        }
      }
    }
    localzaiw.a(true);
    return ((zaji)localObject8).a();
  }
  
  private static zaji a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 40: 
      return new zbrq(false, false);
    case 199: 
      return new zbrq(true, false);
    case 235: 
      return new zbrw();
    case 47: 
      return new zbsj(false, false, false);
    case 196: 
      return new zbsj(true, false, false);
    case 45: 
    case 195: 
      return new zbrr(paramInt2, paramInt1, false);
    case 44: 
      return new zbsc(false, false);
    case 43: 
      return new zbsd(false, false);
    case 41: 
      return new zbsi(false);
    case 42: 
      return new zbrk(false, false);
    case 189: 
      return new zbsf(false);
    }
    return null;
  }
  
  private static boolean a(zny[][] paramArrayOfzny)
  {
    for (int i = 0; i < paramArrayOfzny.length; i++)
    {
      zny[] arrayOfzny = paramArrayOfzny[i];
      if (arrayOfzny != null)
      {
        if (arrayOfzny[0] != null) {
          return false;
        }
        if (arrayOfzny.length > 1) {
          for (int j = 1; j < arrayOfzny.length; j++) {
            if (arrayOfzny[j] != null) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
  
  private static boolean a(ArrayList paramArrayList, zaie paramzaie, zaca paramzaca)
  {
    zny[][] arrayOfzny = (zny[][])paramArrayList.get(0);
    zny[] arrayOfzny1 = arrayOfzny[0];
    int i;
    int j;
    if (a(paramzaie, arrayOfzny1[0])) {
      if (arrayOfzny1.length > 1)
      {
        i = 1;
        for (j = 1; j < arrayOfzny1.length; j++) {
          if (!a(paramzaie, arrayOfzny1[j]))
          {
            i = 0;
            break;
          }
        }
        if (i != 0) {
          return true;
        }
      }
      else
      {
        return true;
      }
    }
    if (paramArrayList.size() > 1) {
      for (i = 1; i < paramArrayList.size(); i++)
      {
        arrayOfzny = (zny[][])paramArrayList.get(i);
        arrayOfzny1 = arrayOfzny[0];
        if (a(paramzaie, arrayOfzny1[0])) {
          if (arrayOfzny1.length > 1)
          {
            j = 1;
            for (int k = 1; k < arrayOfzny1.length; k++) {
              if (!a(paramzaie, arrayOfzny1[k]))
              {
                j = 0;
                break;
              }
            }
            if (j != 0) {
              return true;
            }
          }
          else
          {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private static int a(ArrayList paramArrayList, zaie paramzaie, int paramInt, boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    zny[][] arrayOfzny;
    if (paramArrayOfBoolean[0] != 0)
    {
      i++;
      arrayOfzny = (zny[][])paramArrayList.get(0);
      if (arrayOfzny[paramInt] != null)
      {
        zny[] arrayOfzny1 = arrayOfzny[paramInt];
        if (a(paramzaie, arrayOfzny1[0]))
        {
          if (arrayOfzny1.length > 1) {
            for (int k = 1; k < arrayOfzny1.length; k++) {
              if (!a(paramzaie, arrayOfzny1[k]))
              {
                paramArrayOfBoolean[0] = false;
                i--;
                break;
              }
            }
          }
        }
        else
        {
          paramArrayOfBoolean[0] = false;
          i--;
        }
      }
    }
    if (paramArrayList.size() > 1) {
      for (int j = 1; j < paramArrayList.size(); j++) {
        if (paramArrayOfBoolean[j] != 0)
        {
          i++;
          arrayOfzny = (zny[][])paramArrayList.get(j);
          if (arrayOfzny[paramInt] != null)
          {
            zny[] arrayOfzny2 = arrayOfzny[paramInt];
            if (a(paramzaie, arrayOfzny2[0]))
            {
              if (arrayOfzny2.length > 1) {
                for (int m = 1; m < arrayOfzny2.length; m++) {
                  if (!a(paramzaie, arrayOfzny2[m]))
                  {
                    paramArrayOfBoolean[j] = false;
                    i--;
                    break;
                  }
                }
              }
            }
            else
            {
              paramArrayOfBoolean[j] = false;
              i--;
            }
          }
        }
      }
    }
    return i;
  }
  
  private static int a(ArrayList paramArrayList, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    zny[][] arrayOfzny;
    int j;
    if (paramArrayOfBoolean[0] != 0)
    {
      i++;
      arrayOfzny = (zny[][])paramArrayList.get(0);
      for (j = paramInt1; j < paramInt2; j++) {
        if (arrayOfzny[j] != null)
        {
          zny[] arrayOfzny1 = arrayOfzny[j];
          if (a(arrayOfzny1[0]))
          {
            if (arrayOfzny1.length > 1)
            {
              for (int m = 1; m < arrayOfzny1.length; m++) {
                if (!a(arrayOfzny1[m]))
                {
                  paramArrayOfBoolean[0] = false;
                  i--;
                  break;
                }
              }
              if (paramArrayOfBoolean[0] == 0) {
                break;
              }
            }
          }
          else
          {
            paramArrayOfBoolean[0] = false;
            i--;
            break;
          }
        }
      }
    }
    if (paramArrayList.size() > 1) {
      for (j = 1; j < paramArrayList.size(); j++) {
        if (paramArrayOfBoolean[j] != 0)
        {
          i++;
          arrayOfzny = (zny[][])paramArrayList.get(j);
          for (int k = paramInt1; k < paramInt2; k++) {
            if (arrayOfzny[k] != null)
            {
              zny[] arrayOfzny2 = arrayOfzny[k];
              if (a(arrayOfzny2[0]))
              {
                if (arrayOfzny2.length > 1)
                {
                  for (int n = 1; n < arrayOfzny2.length; n++) {
                    if (!a(arrayOfzny2[n]))
                    {
                      paramArrayOfBoolean[j] = false;
                      i--;
                      break;
                    }
                  }
                  if (paramArrayOfBoolean[j] == 0) {
                    break;
                  }
                }
              }
              else
              {
                paramArrayOfBoolean[j] = false;
                i--;
                break;
              }
            }
          }
        }
      }
    }
    return i;
  }
  
  private static boolean a(zaie paramzaie, zny paramzny)
  {
    if (paramzaie == zabg.a) {
      return a(paramzny);
    }
    if (paramzny.a() == 12) {
      return paramzny.c() == 14;
    }
    return paramzny.a(paramzaie);
  }
  
  private static boolean a(zny paramzny)
  {
    if (paramzny.c() == 11) {
      return paramzny.a() == 12;
    }
    if (paramzny.c() == 14) {
      return paramzny.a() != 12;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */