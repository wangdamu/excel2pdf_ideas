package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.za;
import java.util.ArrayList;

class zfx
{
  public static zaie a(zabe paramzabe, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt)
  {
    Object localObject1 = null;
    int i = -1;
    zgg localzgg = null;
    int j = 1;
    if (paramzaca.j)
    {
      localObject2 = paramzabe.l();
      if (localObject2 == null)
      {
        localObject2 = new zabu();
        localzgg = new zgg();
        ((zabu)localObject2).c = localzgg;
      }
      else if (((zabu)localObject2).c == null)
      {
        localzgg = new zgg();
        ((zabu)localObject2).c = localzgg;
      }
      else
      {
        localzgg = (zgg)((zabu)localObject2).c;
        if (localzgg.b == 3)
        {
          localObject1 = (double[])localzgg.a;
          i = localObject1.length;
          j = 0;
          localzgg = null;
        }
        else if (localzgg.b == 2)
        {
          localObject1 = ((double[][])(double[][])localzgg.a)[(paramzaca.d - paramzaca.l.StartRow)];
          if (localObject1 != null)
          {
            i = localObject1.length;
            j = 0;
            localzgg = null;
          }
        }
        else if (localzgg.b == 1)
        {
          localObject1 = ((double[][])(double[][])localzgg.a)[(paramzaca.e - paramzaca.l.StartColumn)];
          if (localObject1 != null)
          {
            i = localObject1.length;
            j = 0;
            localzgg = null;
          }
        }
        else
        {
          localzgg = null;
        }
      }
    }
    else
    {
      localzgg = null;
    }
    Object localObject3;
    if (i < 0)
    {
      localObject2 = paramArrayOfzaie[0];
      localObject3 = ((zaie)localObject2).a(paramzaca, false);
      if (((zaiw)localObject3).b() == 0) {
        return ((zaiw)localObject3).a(0, 0);
      }
      Object localObject4;
      if ((((zaiw)localObject3).l()) && (((zaie)localObject2).g() == 64))
      {
        localObject4 = ((zaie)localObject2).a(paramzaca, paramInt);
        if (localObject4 == null) {
          return zabc.f;
        }
        localObject1 = new double[] { ((zabb)localObject4).o() };
        i = 1;
      }
      else
      {
        localObject4 = new zbrv(64, false, false, paramzaca.a == 5);
        localObject2 = zbam.a((zaiw)localObject3, (zaji)localObject4, paramzaca, true, true);
        ((zaiw)localObject3).a(true);
        if ((localObject2 != null) && (((zaie)localObject2).b() == 0))
        {
          if (paramzabe.p().b() == 62) {
            return zabc.f;
          }
          return (zaie)localObject2;
        }
        localObject1 = ((zbrv)localObject4).d();
        i = ((zbrv)localObject4).e();
      }
      if (localzgg != null)
      {
        if (localzgg.b == 0) {
          localzgg.b = paramArrayOfzaie[0].b(paramzaca, true);
        }
        if (localzgg.b == 0)
        {
          localzgg = null;
        }
        else
        {
          if (localObject1.length != i)
          {
            localObject4 = new double[i];
            System.arraycopy(localObject1, 0, localObject4, 0, i);
            localObject1 = localObject4;
          }
          if (localzgg.b == 3)
          {
            localzgg.a = localObject1;
          }
          else if (localzgg.b == 2)
          {
            if (localzgg.a == null)
            {
              localObject4 = new double[paramzaca.l.f()][];
              localzgg.a = localObject4;
            }
            else
            {
              localObject4 = (double[][])localzgg.a;
            }
            localObject4[(paramzaca.d - paramzaca.l.StartRow)] = localObject1;
          }
          else
          {
            if (localzgg.a == null)
            {
              localObject4 = new double[paramzaca.l.g()][];
              localzgg.a = localObject4;
            }
            else
            {
              localObject4 = (double[][])localzgg.a;
            }
            localObject4[(paramzaca.e - paramzaca.l.StartColumn)] = localObject1;
          }
        }
      }
    }
    Object localObject2 = null;
    if (paramArrayOfzaie.length > 1)
    {
      localObject2 = new double[paramArrayOfzaie.length - 1];
      localObject3 = zabt.a(paramArrayOfzaie, paramzaca, 1, (double[])localObject2, 7);
      if (localObject3 != null) {
        return (zaie)localObject3;
      }
    }
    int k;
    double d1;
    switch (paramzabe.p().b())
    {
    case 325: 
      k = (int)Math.ceil(localObject2[0]);
      if ((k < 1) || (k > i))
      {
        if ((j != 0) && (localzgg != null)) {
          za.a((double[])localObject1, 0, i);
        }
        return zabc.b;
      }
      if (j != 0) {
        za.a((double[])localObject1, 0, i);
      }
      return new zabb(localObject1[(i - k)]);
    case 326: 
      k = (int)localObject2[0];
      if ((k < 1) || (k > i))
      {
        if ((j != 0) && (localzgg != null)) {
          za.a((double[])localObject1, 0, i);
        }
        return zabc.b;
      }
      if (j != 0) {
        za.a((double[])localObject1, 0, i);
      }
      return new zabb(localObject1[(k - 1)]);
    case 331: 
      if (i < 1) {
        return zabc.b;
      }
      d1 = localObject2[0];
      if ((d1 < 0.0D) || (d1 >= 1.0D))
      {
        if ((j != 0) && (localzgg != null)) {
          za.a((double[])localObject1, 0, i);
        }
        return zabc.b;
      }
      if (j != 0) {
        za.a((double[])localObject1, 0, i);
      }
      int i1 = (int)(i * d1) / 2;
      return new zabb(zbpi.b((double[])localObject1, i1, i - i1));
    case 328: 
    case 495: 
      if (i < 1) {
        return zabc.b;
      }
      d1 = localObject2[0];
      if ((d1 < 0.0D) || (d1 > 1.0D))
      {
        if ((j != 0) && (localzgg != null)) {
          za.a((double[])localObject1, 0, i);
        }
        return zabc.b;
      }
      if (j != 0) {
        za.a((double[])localObject1, 0, i);
      }
      return new zabb(zgc.a((double[])localObject1, (i - 1) * d1));
    case 496: 
      if (i < 1) {
        return zabc.b;
      }
      d1 = localObject2[0] * (i + 1) - 1.0D;
      if ((d1 < 0.0D) || (d1 > i - 1.0D))
      {
        if ((j != 0) && (localzgg != null)) {
          za.a((double[])localObject1, 0, i);
        }
        return zabc.b;
      }
      if (j != 0) {
        za.a((double[])localObject1, 0, i);
      }
      return new zabb(zgc.a((double[])localObject1, d1));
    case 327: 
    case 497: 
      if (i < 1) {
        return zabc.b;
      }
      switch ((int)localObject2[0])
      {
      case 0: 
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(localObject1[0]);
      case 1: 
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(zgc.a((double[])localObject1, (i - 1) * 0.25D));
      case 2: 
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(zgc.a((double[])localObject1, (i - 1) * 0.5D));
      case 3: 
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(zgc.a((double[])localObject1, (i - 1) * 0.75D));
      case 4: 
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(localObject1[(i - 1)]);
      }
      if ((j != 0) && (localzgg != null)) {
        za.a((double[])localObject1, 0, i);
      }
      return zabc.b;
    case 498: 
      if (i < 1) {
        return zabc.b;
      }
      switch ((int)localObject2[0])
      {
      case 1: 
        if (i < 3)
        {
          if ((j != 0) && (localzgg != null)) {
            za.a((double[])localObject1, 0, i);
          }
          return zabc.b;
        }
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(zgc.a((double[])localObject1, (i + 1) * 0.25D - 1.0D));
      case 2: 
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(zgc.a((double[])localObject1, (i + 1) * 0.5D - 1.0D));
      case 3: 
        if (i < 3)
        {
          if ((j != 0) && (localzgg != null)) {
            za.a((double[])localObject1, 0, i);
          }
          return zabc.b;
        }
        if (j != 0) {
          za.a((double[])localObject1, 0, i);
        }
        return new zabb(zgc.a((double[])localObject1, (i + 1) * 0.75D - 1.0D));
      }
      if ((j != 0) && (localzgg != null)) {
        za.a((double[])localObject1, 0, i);
      }
      return zabc.b;
    case 329: 
    case 529: 
    case 530: 
      if (i < 1) {
        return zabc.g;
      }
      if (i == 1)
      {
        if (localObject2[0] == localObject1[0]) {
          return zabb.b;
        }
        return zabc.g;
      }
      int m = 3;
      if (localObject2.length > 1)
      {
        m = (int)localObject2[1];
        if (m < 1)
        {
          if ((j != 0) && (localzgg != null)) {
            za.a((double[])localObject1, 0, i);
          }
          return zabc.b;
        }
      }
      if (j != 0) {
        za.a((double[])localObject1, 0, i);
      }
      if ((localObject2[0] < localObject1[0]) || (localObject2[0] > localObject1[(i - 1)])) {
        return zabc.g;
      }
      if (paramzabe.p().b() == 530) {
        d3 = zgc.b((double[])localObject1, i, localObject2[0]);
      } else {
        d3 = zgc.a((double[])localObject1, i, localObject2[0]);
      }
      if (d3 == 0.0D) {
        return zabb.a;
      }
      double d3 = zga.c(d3);
      if (d3 == 1.0D) {
        return zabb.b;
      }
      if (m > 15) {
        return new zabb(d3);
      }
      double d4 = Math.pow(10.0D, m);
      return new zabb((d3 * d4) / d4);
    case 61: 
      if (i < 1) {
        return zabc.a;
      }
      return zfu.a((double[])localObject1, 0, i, localObject2[0], localObject2[1]);
    case 324: 
    case 543: 
      if (i < 2) {
        return zabc.a;
      }
      double d2;
      if (localObject2.length > 1)
      {
        if (localObject2[1] == 0.0D) {
          return zabc.a;
        }
        d2 = zgc.a((double[])localObject1, 0, i, localObject2[0], localObject2[1]);
      }
      else
      {
        d2 = zgc.a((double[])localObject1, 0, i, localObject2[0]);
      }
      if (Double.isInfinite(d2)) {
        return zabc.a;
      }
      return new zabb(d2);
    case 62: 
      if ((i == 0) && (paramArrayOfzaie[0].f(paramzaca)) && (paramArrayOfzaie[0].a(paramzaca) != 96)) {
        return zabc.f;
      }
      for (int n = 0; (n < i) && (localObject1[n] == 0.0D); n++) {}
      if (n >= i - 1) {
        return zabc.b;
      }
      return zaqv.a((double[])localObject1, n, i, localObject2 == null ? 0.1D : localObject2[0]);
    }
    return null;
  }
  
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3)
  {
    double[] arrayOfDouble1 = new double[paramInt2];
    Object localObject = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble1, 7);
    if (localObject != null) {
      return (zaie)localObject;
    }
    double[] arrayOfDouble2 = null;
    int i = 0;
    if (paramArrayOfzaie[1] != null)
    {
      zaiw localzaiw = paramArrayOfzaie[1].a(paramzaca, false);
      if (localzaiw.b() == 0) {
        return localzaiw.a(0, 0);
      }
      arrayOfDouble2 = new double[localzaiw.e()];
      localzaiw.f();
      localObject = zabt.a(localzaiw, arrayOfDouble2, paramzaca, paramInt3);
      localzaiw.a(true);
      if (((zaie)localObject).b() == 0) {
        return (zaie)localObject;
      }
      i = (int)((zabb)localObject).o();
    }
    switch (paramInt1)
    {
    case 216: 
    case 532: 
    case 533: 
      int j = 0;
      if (paramArrayOfzaie.length > 2)
      {
        boolean[] arrayOfBoolean = new boolean[1];
        localObject = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfBoolean);
        if (localObject != null) {
          return (zaie)localObject;
        }
        j = arrayOfBoolean[0];
      }
      if (i < 1) {
        return zabc.g;
      }
      za.a(arrayOfDouble2, 0, i);
      int k = za.a(arrayOfDouble2, 0, i, arrayOfDouble1[0]);
      if (k < 0) {
        return zabc.g;
      }
      if (paramInt1 == 532)
      {
        int m = 1;
        double d2 = arrayOfDouble1[0];
        int n;
        if (j != 0)
        {
          if ((k < i - 1) && (arrayOfDouble2[(k + 1)] == d2))
          {
            m++;
            for (n = k + 2; (n < i) && (arrayOfDouble2[n] == d2); n++) {
              m++;
            }
          }
          if ((k > 0) && (arrayOfDouble2[(k - 1)] == d2))
          {
            m++;
            k -= 2;
            while ((k > -1) && (arrayOfDouble2[k] == d2))
            {
              m++;
              k--;
            }
            k++;
          }
          if (m > 1) {
            return new zabb((k + 1 + k + m) / 2.0D);
          }
          return new zabb(k + 1);
        }
        if ((k > 0) && (arrayOfDouble2[(k - 1)] == d2))
        {
          m++;
          for (n = k - 2; (n > -1) && (arrayOfDouble2[n] == d2); n--) {
            m++;
          }
        }
        if ((k < i - 1) && (arrayOfDouble2[(k + 1)] == d2))
        {
          m++;
          k += 2;
          while ((k < i) && (arrayOfDouble2[k] == d2))
          {
            m++;
            k++;
          }
          k--;
        }
        if (m > 1) {
          return new zabb((i - k + i - (k - m + 1)) / 2.0D);
        }
        return new zabb(i - k);
      }
      double d1;
      if (j != 0)
      {
        if ((k > 0) && (arrayOfDouble2[(k - 1)] == arrayOfDouble1[0]))
        {
          k -= 2;
          d1 = arrayOfDouble1[0];
          while ((k > -1) && (arrayOfDouble2[k] == d1)) {
            k--;
          }
          return new zabb(k + 2);
        }
        return new zabb(k + 1);
      }
      if ((k < i - 1) && (arrayOfDouble2[(k + 1)] == arrayOfDouble1[0]))
      {
        k += 2;
        d1 = arrayOfDouble1[0];
        while ((k < i) && (arrayOfDouble2[k] == d1)) {
          k++;
        }
        return new zabb(i - k + 1);
      }
      return new zabb(i - k);
    }
    return null;
  }
  
  public static zaie b(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3)
  {
    zaiw[] arrayOfzaiw = new zaiw[Math.min(paramArrayOfzaie.length - paramInt2, paramInt3)];
    Object localObject2;
    Object localObject1;
    if (!paramzaca.h)
    {
      paramzaca.h = true;
      localObject2 = paramzaca.l;
      if ((paramzaca.l.b()) || (paramzaca.l.c())) {
        paramzaca.l = CellArea.createCellArea(paramzaca.d, paramzaca.e, paramzaca.d + 2, paramzaca.e + 2);
      }
      localObject1 = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfzaiw, null);
      paramzaca.h = false;
      paramzaca.l = ((CellArea)localObject2);
    }
    else
    {
      localObject1 = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfzaiw, null);
    }
    if (localObject1 != null) {
      return (zaie)localObject1;
    }
    int k;
    switch (paramInt1)
    {
    case 307: 
    case 308: 
    case 314: 
    case 514: 
    case 515: 
      localObject2 = arrayOfzaiw[0];
      k = ((zaiw)localObject2).e();
      if (k != arrayOfzaiw[1].e()) {
        return zabc.g;
      }
      localObject1 = zgb.a(paramzaca, (zaiw)localObject2, arrayOfzaiw[1], new zavf(paramInt1, k));
      break;
    case 309: 
    case 311: 
    case 315: 
      if (arrayOfzaiw[0].e() != arrayOfzaiw[1].e()) {
        return zabc.g;
      }
      localObject1 = zgb.a(paramzaca, arrayOfzaiw[0], arrayOfzaiw[1], new zavg(paramInt1, paramzaca, paramArrayOfzaie[0]));
      break;
    case 306: 
    case 511: 
      localObject1 = zgb.a(arrayOfzaiw[0], arrayOfzaiw[1], paramzaca);
      break;
    case 312: 
      if (arrayOfzaiw[0].e() != arrayOfzaiw[1].e()) {
        return zabc.g;
      }
      localObject1 = zgb.a(paramzaca, arrayOfzaiw[0], arrayOfzaiw[1], new zavh());
      break;
    case 303: 
      if (arrayOfzaiw[0].e() != arrayOfzaiw[1].e()) {
        return zabc.g;
      }
      localObject1 = zgb.a(paramzaca, arrayOfzaiw[0], arrayOfzaiw[1], new zavk());
      break;
    case 304: 
      if (arrayOfzaiw[0].e() != arrayOfzaiw[1].e()) {
        return zabc.g;
      }
      localObject1 = zgb.a(paramzaca, arrayOfzaiw[0], arrayOfzaiw[1], new zavi());
      break;
    case 305: 
      if (arrayOfzaiw[0].e() != arrayOfzaiw[1].e()) {
        return zabc.g;
      }
      localObject1 = zgb.a(paramzaca, arrayOfzaiw[0], arrayOfzaiw[1], new zavj());
      break;
    case 313: 
      if (arrayOfzaiw[0].e() != arrayOfzaiw[1].e()) {
        return zabc.g;
      }
      localObject1 = zgb.a(paramzaca, arrayOfzaiw[0], arrayOfzaiw[1], new zavh());
      if (((zaie)localObject1).b() == 3)
      {
        double d = ((zabb)localObject1).o();
        localObject1 = new zabb(d * d);
      }
      break;
    case 49: 
    case 51: 
      int i = 1;
      k = 0;
      if (paramArrayOfzaie.length > 2)
      {
        boolean[] arrayOfBoolean = new boolean[paramArrayOfzaie.length - 2];
        zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfBoolean);
        if (localzabc != null) {
          return localzabc;
        }
        if (paramArrayOfzaie[2] != zabg.a) {
          i = arrayOfBoolean[0];
        }
        if (arrayOfBoolean.length > 1) {
          k = arrayOfBoolean[1];
        }
      }
      localObject1 = zgb.a(arrayOfzaiw[0], arrayOfzaiw.length > 1 ? arrayOfzaiw[1] : null, paramzaca, i, k, paramInt1 == 51);
      break;
    }
    for (int j = 0; j < arrayOfzaiw.length; j++) {
      if (arrayOfzaiw[j] != null) {
        arrayOfzaiw[j].a(true);
      }
    }
    return (zaie)localObject1;
  }
  
  public static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca, boolean paramBoolean1, boolean paramBoolean2)
  {
    zaiw[] arrayOfzaiw = new zaiw[Math.min(paramArrayOfzaie.length, 3)];
    if (!paramzaca.h)
    {
      paramzaca.h = true;
      CellArea localCellArea = paramzaca.l;
      if ((paramzaca.l.b()) || (paramzaca.l.c())) {
        paramzaca.l = CellArea.createCellArea(paramzaca.d, paramzaca.e, paramzaca.d + 2, paramzaca.e + 2);
      }
      localObject = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfzaiw, null);
      paramzaca.h = false;
      paramzaca.l = localCellArea;
    }
    else
    {
      localObject = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfzaiw, null);
    }
    if (localObject != null) {
      return (zaie)localObject;
    }
    if (arrayOfzaiw[0] == null)
    {
      for (i = 0; i < arrayOfzaiw.length; i++) {
        if (arrayOfzaiw[i] != null) {
          arrayOfzaiw[i].a(true);
        }
      }
      return zabc.f;
    }
    int i = 1;
    boolean bool;
    if (paramArrayOfzaie.length > 3)
    {
      localObject = paramArrayOfzaie[3];
      if ((!paramzaca.h) || (((zaie)localObject).i()))
      {
        localObject = ((zaie)localObject).e(paramzaca);
      }
      else
      {
        zaiw localzaiw = ((zaie)localObject).a(paramzaca, false);
        localObject = localzaiw.a(0, 0);
        localzaiw.a(true);
      }
      switch (((zaie)localObject).b())
      {
      case 0: 
        for (j = 0; j < arrayOfzaiw.length; j++) {
          if (arrayOfzaiw[j] != null) {
            arrayOfzaiw[j].a(true);
          }
        }
        return (zaie)localObject;
      case 1: 
        bool = ((zaba)localObject).o();
        break;
      case 3: 
        bool = true;
        break;
      case 2: 
      default: 
        for (j = 0; j < arrayOfzaiw.length; j++) {
          if (arrayOfzaiw[j] != null) {
            arrayOfzaiw[j].a(true);
          }
        }
        return zabc.c;
      }
    }
    Object localObject = zgb.a(arrayOfzaiw[0], arrayOfzaiw.length > 1 ? arrayOfzaiw[1] : null, arrayOfzaiw.length > 2 ? arrayOfzaiw[2] : null, paramzaca, bool, paramBoolean1, paramBoolean2);
    for (int j = 0; j < arrayOfzaiw.length; j++) {
      if (arrayOfzaiw[j] != null) {
        arrayOfzaiw[j].a(true);
      }
    }
    return (zaie)localObject;
  }
  
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList(paramInt2);
    Object localObject;
    for (int i = 0; i < paramInt2; i++)
    {
      localObject = paramArrayOfzaie[i];
      if (localObject == zabg.a) {
        return zabc.f;
      }
      if (((zaie)localObject).f()) {
        return (zaie)localObject;
      }
      zaiw localzaiw = ((zaie)localObject).a(paramzaca, false);
      if (localzaiw.b() == 0) {
        return localzaiw.a(0, 0);
      }
      if ((paramInt1 == 163) && (localzaiw.c() != localzaiw.d()))
      {
        localzaiw.a(true);
        return zabc.f;
      }
      double[][] arrayOfDouble2 = new double[localzaiw.c()][];
      int j = localzaiw.d();
      for (int k = 0; k < arrayOfDouble2.length; k++) {
        arrayOfDouble2[k] = new double[j];
      }
      localzaiw.f();
      localObject = zabt.a(localzaiw, arrayOfDouble2, paramzaca, 0x0 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x7000);
      localzaiw.a(true);
      if (localObject != null) {
        return (zaie)localObject;
      }
      localArrayList.add(arrayOfDouble2);
    }
    double[][] arrayOfDouble1;
    switch (paramInt1)
    {
    case 164: 
      arrayOfDouble1 = zgb.b((double[][])localArrayList.get(0));
      if (arrayOfDouble1 == null)
      {
        localObject = (double[][])localArrayList.get(0);
        return new zaay(zabc.b, localObject[0].length, localObject.length);
      }
      return new zaax(zabt.a(arrayOfDouble1));
    case 163: 
      return new zabb(zgb.c((double[][])localArrayList.get(0)));
    case 165: 
      arrayOfDouble1 = (double[][])localArrayList.get(0);
      localObject = (double[][])localArrayList.get(1);
      if (arrayOfDouble1[0].length != localObject.length) {
        return zabc.f;
      }
      return new zaax(zabt.a(zgb.a(arrayOfDouble1, (double[][])localObject)));
    }
    return null;
  }
  
  public static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zaie localzaie1 = paramArrayOfzaie[0];
    if (localzaie1 == zabg.a) {
      return zabc.f;
    }
    zaiw localzaiw1 = localzaie1.a(paramzaca, false);
    if (localzaiw1.b() == 0) {
      return localzaiw1.a(0, 0);
    }
    localzaie1 = paramArrayOfzaie[1];
    if (localzaie1 == zabg.a) {
      return zabc.f;
    }
    zaiw localzaiw2 = localzaie1.a(paramzaca, false);
    if (localzaiw2.b() == 0)
    {
      localzaiw1.a(true);
      return localzaiw2.a(0, 0);
    }
    double[] arrayOfDouble = new double[localzaiw2.w() + 1];
    localzaiw2.f();
    localzaie1 = zabt.a(localzaiw2, arrayOfDouble, paramzaca, 0x0 | (ztr.b(zuf.c) & 0xFF) << 4 | 0x8000);
    localzaiw2.a(true);
    localzaiw2 = null;
    if (localzaie1.b() == 0)
    {
      localzaiw1.f();
      while (localzaiw1.g())
      {
        zaie localzaie2 = localzaiw1.h().e(paramzaca);
        if (localzaie2.b() == 0)
        {
          localzaiw1.a(true);
          return localzaie2;
        }
      }
      localzaiw1.a(true);
      return localzaie1;
    }
    int i = (int)((zabb)localzaie1).o();
    double d1 = -1.7976931348623157E308D;
    if (i > 0)
    {
      za.a(arrayOfDouble, 0, i);
      d1 = arrayOfDouble[(i - 1)];
    }
    int[] arrayOfInt = new int[i + 1];
    localzaiw1.f();
    while (localzaiw1.g())
    {
      localObject = localzaiw1.h().e(paramzaca);
      switch (((zaie)localObject).b())
      {
      case 0: 
        return (zaie)localObject;
      case 3: 
        if (i < 1)
        {
          arrayOfInt[0] += 1;
        }
        else
        {
          double d2 = ((zabb)localObject).o();
          if (d2 > d1) {
            arrayOfInt[i] += 1;
          } else {
            for (int k = 0; k < i; k++) {
              if (d2 <= arrayOfDouble[k])
              {
                arrayOfInt[k] += 1;
                break;
              }
            }
          }
        }
        break;
      }
    }
    localzaiw1.a(true);
    localzaiw1 = null;
    Object localObject = new zaie[arrayOfInt.length][];
    for (int j = 0; j < arrayOfInt.length; j++) {
      localObject[j] = { new zabb(arrayOfInt[j]) };
    }
    return new zaax((zaie[][])localObject);
  }
  
  static zaie b(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zaiw[] arrayOfzaiw = new zaiw[2];
    Object localObject = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfzaiw, zabc.g);
    if (localObject != null)
    {
      if (arrayOfzaiw[0] != null) {
        arrayOfzaiw[0].a(true);
      }
      if (arrayOfzaiw[1] != null) {
        arrayOfzaiw[1].a(true);
      }
      return (zaie)localObject;
    }
    int i = arrayOfzaiw[0].e();
    if (i != arrayOfzaiw[1].e())
    {
      arrayOfzaiw[0].a(true);
      arrayOfzaiw[1].a(true);
      return zabc.g;
    }
    double[] arrayOfDouble1 = new double[i];
    arrayOfzaiw[0].f();
    localObject = zabt.a(arrayOfzaiw[0], arrayOfDouble1, paramzaca, 0x0 | (ztr.b(zuf.f) & 0xFF) << 4 | 0xB000);
    arrayOfzaiw[0].a(true);
    if (((zaie)localObject).b() == 0)
    {
      arrayOfzaiw[1].a(true);
      return (zaie)localObject;
    }
    double[] arrayOfDouble2 = new double[i];
    arrayOfzaiw[1].f();
    localObject = zabt.a(arrayOfzaiw[1], arrayOfDouble2, paramzaca, 0x0 | (ztr.b(zuf.f) & 0xFF) << 4 | 0x2000);
    arrayOfzaiw[1].a(true);
    arrayOfzaiw = null;
    if (((zaie)localObject).b() == 0) {
      return (zaie)localObject;
    }
    double d1 = 0.0D;
    for (int j = 0; j < arrayOfDouble2.length; j++)
    {
      if ((arrayOfDouble2[j] < 0.0D) || (arrayOfDouble2[j] > 1.0D)) {
        return zabc.b;
      }
      d1 += arrayOfDouble2[j];
      if (d1 > 1.0D) {
        return zabc.b;
      }
    }
    d1 = 0.0D;
    double[] arrayOfDouble3 = new double[paramArrayOfzaie.length - 2];
    localObject = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfDouble3, 7);
    if (localObject != null) {
      return (zaie)localObject;
    }
    double d2 = arrayOfDouble3[0];
    if (arrayOfDouble3.length > 1)
    {
      double d3 = arrayOfDouble3[1];
      for (int m = 0; m < arrayOfDouble1.length; m++) {
        if ((arrayOfDouble1[m] <= d3) && (arrayOfDouble1[m] >= d2)) {
          d1 += arrayOfDouble2[m];
        }
      }
    }
    else
    {
      for (int k = 0; k < arrayOfDouble1.length; k++) {
        if (arrayOfDouble1[k] == d2)
        {
          d1 = arrayOfDouble2[k];
          break;
        }
      }
    }
    return new zabb(d1);
  }
  
  public static zaie c(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    if ((paramArrayOfzaie[0] == zabg.a) || (paramArrayOfzaie[1] == zabg.a)) {
      return zabc.g;
    }
    double[] arrayOfDouble = new double[1];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    zaiw localzaiw = paramArrayOfzaie[1].a(paramzaca, false);
    if (localzaiw.b() == 0) {
      return localzaiw.a(0, 0);
    }
    double d = arrayOfDouble[0];
    localzaiw.f();
    while (localzaiw.g())
    {
      zabb localzabb = localzaiw.h().a(paramzaca, 4);
      if (localzabb == null) {
        return zabc.f;
      }
      d *= (1.0D + localzabb.o());
    }
    localzaiw.a(true);
    return new zabb(d);
  }
  
  public static zaie a(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    Object localObject = zabt.a(paramArrayOfzaie[0], paramzaca);
    if (((zaie)localObject).b() != 9) {
      return (zaie)localObject;
    }
    zaiw localzaiw1 = ((zaie)localObject).a(paramzaca, false);
    zny localzny = zabt.a(paramArrayOfzaie[1], paramzaca, false);
    zaiw localzaiw2 = localzaiw1;
    if (paramArrayOfzaie.length > 2)
    {
      zbap localzbap1 = ((zabo)localObject).o();
      localObject = zabt.a(paramArrayOfzaie[2], paramzaca);
      if (((zaie)localObject).b() != 9)
      {
        localzaiw1.a(true);
        return (zaie)localObject;
      }
      zbap localzbap2 = ((zabo)localObject).o();
      i = 1;
      if ((localzbap1.b() == localzbap2.b()) && (localzbap1.d() == localzbap2.d())) {
        if (localzbap1.a() != localzbap2.a())
        {
          zwp localzwp1 = null;
          if (localzbap1.a() == null) {
            localzwp1 = localzbap2.a();
          } else if (localzbap2.a() == null) {
            localzwp1 = localzbap1.a();
          }
          if (localzwp1 != null)
          {
            if (((localzwp1.a & 0xFFFF) == paramzaca.p.f) && (localzwp1.b == localzwp1.c) && ((localzwp1.b & 0xFFFF) == paramzaca.n)) {
              i = 0;
            }
          }
          else
          {
            localzwp1 = localzbap1.a();
            zwp localzwp2 = localzbap2.a();
            if ((localzwp1.a == localzwp2.a) && (localzwp1.b == localzwp2.b) && (localzwp1.c == localzwp2.c)) {
              i = 0;
            }
          }
        }
        else
        {
          i = 0;
        }
      }
      if (i != 0)
      {
        int j = localzbap1.p();
        int k = localzbap1.q();
        if ((localzbap2.q() != k) || (localzbap2.p() != j))
        {
          switch (paramInt)
          {
          case 482: 
          case 484: 
            localzaiw1.a(true);
            return zabc.f;
          }
          localObject = new zabo(((zabo)localObject).g(), new zbap(localzbap2.a(), localzbap2.b(), localzbap2.d(), localzbap2.b() + k - 1, localzbap2.d() + j - 1));
        }
        localzaiw2 = ((zaie)localObject).a(paramzaca, false);
      }
    }
    double d = 0.0D;
    int i = 0;
    if (localzaiw1 == localzaiw2)
    {
      zaie localzaie1;
      if (localzny.a() == 3)
      {
        localzaiw1.f();
        while (localzaiw1.g())
        {
          localzaie1 = localzaiw1.h().e(paramzaca);
          if ((localzaie1.b() == 3) && (localzny.b(localzaie1)))
          {
            i++;
            d += ((zabb)localzaie1).o();
          }
        }
      }
      if (localzny.d().a() != 11)
      {
        localzaiw1.f();
        while (localzaiw1.g())
        {
          localzaie1 = localzaiw1.h().e(paramzaca);
          if ((localzaie1.b() == 3) && (localzny.a(localzaie1)))
          {
            i++;
            d += ((zabb)localzaie1).o();
          }
        }
      }
      localzaiw1.a(true);
      return a(paramInt, d, i);
    }
    localzaiw1.f();
    localzaiw2.f();
    if (!localzaiw2.g())
    {
      localzaiw1.a(true);
      localzaiw2.a(true);
      return a(paramInt, 0.0D, 0);
    }
    boolean bool = localzny.a(zabg.a);
    zaie localzaie2;
    if (localzaiw1.g())
    {
      int m = localzaiw1.i();
      int n = localzaiw1.j();
      int i1 = localzaiw2.i();
      int i2 = localzaiw2.j();
      for (;;)
      {
        if (m == i1)
        {
          if (n == i2)
          {
            if (localzny.a(localzaiw1.h().e(paramzaca)))
            {
              localzaie2 = localzaiw2.h().e(paramzaca);
              if (localzaie2.b() == 3)
              {
                i++;
                d += ((zabb)localzaie2).o();
              }
              else if (localzaie2.b() == 0)
              {
                localzaiw1.a(true);
                localzaiw2.a(true);
                return localzaie2;
              }
            }
            if (!localzaiw2.g())
            {
              localzaiw1.a(true);
              localzaiw2.a(true);
              return a(paramInt, d, i);
            }
            if (!localzaiw1.g()) {
              break;
            }
            m = localzaiw1.i();
            n = localzaiw1.j();
            i1 = localzaiw2.i();
            i2 = localzaiw2.j();
          }
          else if (n < i2)
          {
            if (!localzaiw1.b(i1, i2)) {
              break;
            }
            m = localzaiw1.i();
            n = localzaiw1.j();
          }
          else
          {
            if (!localzaiw2.b(m, n))
            {
              localzaiw1.a(true);
              localzaiw2.a(true);
              return a(paramInt, d, i);
            }
            i1 = localzaiw2.i();
            i2 = localzaiw2.j();
          }
        }
        else if (m < i1)
        {
          if (!localzaiw1.b(i1, i2)) {
            break;
          }
          m = localzaiw1.i();
          n = localzaiw1.j();
        }
        else
        {
          if (bool)
          {
            localzaie2 = localzaiw2.h().e(paramzaca);
            if (localzaie2.b() == 3)
            {
              i++;
              d += ((zabb)localzaie2).o();
            }
            if (!localzaiw2.g())
            {
              localzaiw1.a(true);
              localzaiw2.a(true);
              return a(paramInt, d, i);
            }
          }
          else if (!localzaiw2.b(m, n))
          {
            localzaiw1.a(true);
            localzaiw2.a(true);
            return a(paramInt, d, i);
          }
          i1 = localzaiw2.i();
          i2 = localzaiw2.j();
        }
      }
    }
    localzaiw1.a(true);
    if (bool) {
      for (;;)
      {
        localzaie2 = localzaiw2.h().e(paramzaca);
        if (localzaie2.b() == 3)
        {
          i++;
          d += ((zabb)localzaie2).o();
        }
        if (!localzaiw2.g())
        {
          localzaiw2.a(true);
          return a(paramInt, d, i);
        }
      }
    }
    localzaiw2.a(true);
    return a(paramInt, d, i);
  }
  
  private static zaie a(int paramInt1, double paramDouble, int paramInt2)
  {
    switch (paramInt1)
    {
    case 345: 
    case 482: 
      return new zabb(paramDouble);
    case 483: 
    case 484: 
      if (paramInt2 == 0) {
        return zabc.a;
      }
      return new zabb(paramDouble / paramInt2);
    }
    return new zabb(0.0D);
  }
  
  public static zaie a(zabe paramzabe, zaie paramzaie1, zaie paramzaie2, zaca paramzaca)
  {
    int i = paramzaca.m;
    zgf localzgf = null;
    if (paramzaca.j)
    {
      localObject = paramzabe.l();
      paramzaca.f();
      if (localObject == null)
      {
        localObject = new zabu();
        localzgf = new zgf(1);
        ((zabu)localObject).c = localzgf;
      }
      else if (((zabu)localObject).c == null)
      {
        localzgf = new zgf(1);
        ((zabu)localObject).c = localzgf;
      }
      else
      {
        localzgf = (zgf)((zabu)localObject).c;
      }
    }
    else
    {
      localzgf = new zgf(1);
    }
    Object localObject = localzgf.a(paramzaie1, paramzaie2, paramzaca);
    if (paramzaca.j) {
      paramzaca.b(i);
    }
    if (localObject != null) {
      return (zaie)localObject;
    }
    zbrm localzbrm = new zbrm(zaba.a);
    zaiw localzaiw = localzgf.b(paramzaca);
    localObject = zbam.a(localzaiw, localzbrm, paramzaca, true, true);
    localzaiw.a(true);
    if ((localObject != null) && (((zaie)localObject).b() == 0)) {
      return (zaie)localObject;
    }
    return localzbrm.a();
  }
  
  public static zaie a(zabe paramzabe, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    int i = paramzaca.m;
    zgf localzgf = null;
    if (paramzaca.j)
    {
      zabu localzabu = paramzabe.l();
      paramzaca.f();
      if (localzabu == null)
      {
        localzabu = new zabu();
        localzgf = new zgf(paramArrayOfzaie.length / 2);
        localzabu.c = localzgf;
      }
      else if (localzabu.c == null)
      {
        localzgf = new zgf(paramArrayOfzaie.length / 2);
        localzabu.c = localzgf;
      }
      else
      {
        localzgf = (zgf)localzabu.c;
      }
    }
    else
    {
      localzgf = new zgf(paramArrayOfzaie.length / 2);
    }
    for (int j = 0; j < paramArrayOfzaie.length; j += 2)
    {
      localObject = localzgf.a(paramArrayOfzaie[j], paramArrayOfzaie[(j + 1)], paramzaca);
      if (localObject != null)
      {
        if (paramzaca.j) {
          paramzaca.b(i);
        }
        return (zaie)localObject;
      }
    }
    if (paramzaca.j) {
      paramzaca.b(i);
    }
    zbrm localzbrm = new zbrm(zaba.a);
    Object localObject = localzgf.b(paramzaca);
    zaie localzaie = zbam.a((zaiw)localObject, localzbrm, paramzaca, true, true);
    ((zaiw)localObject).a(true);
    if ((localzaie != null) && (localzaie.b() == 0)) {
      return localzaie;
    }
    return localzbrm.a();
  }
  
  public static zaie a(zabe paramzabe, zaie[] paramArrayOfzaie, zaca paramzaca, zaji paramzaji)
  {
    zaie localzaie = zabt.a(paramArrayOfzaie[0], paramzaca);
    if (localzaie.b() != 9) {
      return localzaie;
    }
    int i = paramzaca.m;
    zgf localzgf = null;
    Object localObject1;
    if (paramzaca.j)
    {
      localObject1 = paramzabe.l();
      paramzaca.f();
      if (localObject1 == null)
      {
        localObject1 = new zabu();
        localObject2 = ((zabo)localzaie).o();
        localzgf = new zgf(paramArrayOfzaie.length / 2, ((zbap)localObject2).q(), ((zbap)localObject2).p());
        ((zabu)localObject1).c = localzgf;
      }
      else if (((zabu)localObject1).c == null)
      {
        localObject2 = ((zabo)localzaie).o();
        localzgf = new zgf(paramArrayOfzaie.length / 2, ((zbap)localObject2).q(), ((zbap)localObject2).p());
        ((zabu)localObject1).c = localzgf;
      }
      else
      {
        localzgf = (zgf)((zabu)localObject1).c;
      }
    }
    else
    {
      localObject1 = ((zabo)localzaie).o();
      localzgf = new zgf(paramArrayOfzaie.length / 2, ((zbap)localObject1).q(), ((zbap)localObject1).p());
    }
    if (!localzgf.b()) {
      for (int j = 1; j < paramArrayOfzaie.length; j += 2)
      {
        localObject2 = localzgf.a(paramArrayOfzaie[j], paramArrayOfzaie[(j + 1)], paramzaca);
        if (localObject2 != null)
        {
          if (paramzaca.j) {
            paramzaca.b(i);
          }
          return (zaie)localObject2;
        }
      }
    }
    if (paramzaca.j) {
      paramzaca.b(i);
    }
    zazh localzazh = new zazh(localzgf.b(paramzaca), localzaie.a(paramzaca, false), new zmp(paramzaca), paramzaca);
    Object localObject2 = zbam.a(localzazh, paramzaji, paramzaca, true, true);
    localzazh.a(true);
    if ((localObject2 != null) && (((zaie)localObject2).b() == 0)) {
      return (zaie)localObject2;
    }
    return paramzaji.a();
  }
  
  public static zaie a(zaie paramzaie, zaca paramzaca)
  {
    paramzaie = zabt.a(paramzaie, paramzaca);
    if (paramzaie.b() != 9) {
      return paramzaie;
    }
    zaiw localzaiw = paramzaie.a(paramzaca, false);
    localzaiw.f();
    for (int i = 0; localzaiw.g(); i++)
    {
      zaie localzaie = localzaiw.h().e(paramzaca);
      if ((localzaie.b() == 12) || ((localzaie.b() == 2) && (((zabp)localzaie).o().equals("")))) {}
    }
    localzaiw.a(true);
    return new zabb(localzaiw.c() * localzaiw.d() - i);
  }
  
  public static zaie d(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    double[] arrayOfDouble = new double[3];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    if (paramArrayOfzaie[3] == zabg.a) {
      return zabc.g;
    }
    zaiw localzaiw = paramArrayOfzaie[3].a(paramzaca, false);
    if (localzaiw.b() == 0) {
      return localzaiw.a(0, 0);
    }
    double d1 = arrayOfDouble[0];
    double d2 = arrayOfDouble[1];
    double d3 = arrayOfDouble[2];
    double d4 = 0.0D;
    double d5 = 1.0D;
    int i = 0;
    localzaiw.f();
    while (localzaiw.g())
    {
      zabb localzabb = localzaiw.h().a(paramzaca, 4);
      if (localzabb == null)
      {
        localzaiw.a(true);
        return zabc.f;
      }
      d5 = Math.pow(d1, d2 + i * d3);
      d4 += localzabb.o() * d5;
      i++;
    }
    localzaiw.a(true);
    return new zabb(d4);
  }
  
  public static zaie e(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    if ((paramArrayOfzaie[0] == zabg.a) || (paramArrayOfzaie[1] == zabg.a)) {
      return zabc.g;
    }
    double[][] arrayOfDouble = new double[2][];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 24576, 0.0D);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble1 = new double[2];
    localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfDouble1, 7);
    if (localzabc != null) {
      return localzabc;
    }
    switch ((int)arrayOfDouble1[0])
    {
    case 1: 
    case 2: 
      break;
    default: 
      return zabc.b;
    }
    switch ((int)arrayOfDouble1[1])
    {
    case 1: 
      if (arrayOfDouble[0].length != arrayOfDouble[1].length) {
        return zabc.g;
      }
      break;
    case 2: 
    case 3: 
      break;
    default: 
      return zabc.b;
    }
    return zgc.a(arrayOfDouble[0], arrayOfDouble[1], (int)arrayOfDouble1[0], (int)arrayOfDouble1[1]);
  }
  
  public static zaie f(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    if (paramArrayOfzaie[0] == zabg.a) {
      return zabc.g;
    }
    Object localObject2 = new double[1];
    Object localObject1 = zabt.a(paramArrayOfzaie, paramzaca, 0, (double[])localObject2, 7);
    if (localObject1 != null) {
      return (zaie)localObject1;
    }
    double d1 = localObject2[0];
    if (d1 <= 0.0D) {
      return zabc.b;
    }
    localObject1 = paramArrayOfzaie[1];
    if (localObject1 == zabg.a) {
      return zabc.g;
    }
    if (((zaie)localObject1).b() == 0) {
      return (zaie)localObject1;
    }
    localObject2 = ((zaie)localObject1).a(paramzaca, false);
    if (((zaiw)localObject2).b() == 0) {
      return ((zaiw)localObject2).a(0, 0);
    }
    localObject1 = paramArrayOfzaie[2];
    if (localObject1 == zabg.a)
    {
      ((zaiw)localObject2).a(true);
      return zabc.g;
    }
    if (((zaie)localObject1).b() == 0)
    {
      ((zaiw)localObject2).a(true);
      return (zaie)localObject1;
    }
    zaiw localzaiw = ((zaie)localObject1).a(paramzaca, false);
    if (localzaiw.b() == 0)
    {
      ((zaiw)localObject2).a(true);
      return localzaiw.a(0, 0);
    }
    int i = ((zaiw)localObject2).c() * ((zaiw)localObject2).d();
    if (localzaiw.c() * localzaiw.d() != i)
    {
      ((zaiw)localObject2).a(true);
      localzaiw.a(true);
      return zabc.b;
    }
    d1 += 1.0D;
    int j = 0;
    ((zaiw)localObject2).f();
    localzaiw.f();
    int k = 0;
    int n;
    double d3;
    for (double d2 = 0.0D; localzaiw.g(); d2 += d3 / Math.pow(d1, (n - k) / 365.0D))
    {
      if (!((zaiw)localObject2).g())
      {
        ((zaiw)localObject2).a(true);
        localzaiw.a(true);
        return zabc.b;
      }
      int m = localzaiw.k();
      if (m != j)
      {
        ((zaiw)localObject2).a(true);
        localzaiw.a(true);
        return zabc.b;
      }
      m = ((zaiw)localObject2).k();
      if (m != j)
      {
        ((zaiw)localObject2).a(true);
        localzaiw.a(true);
        return zabc.b;
      }
      j++;
      zaie localzaie = localzaiw.h().e(paramzaca);
      if (localzaie.b() != 3)
      {
        ((zaiw)localObject2).a(true);
        localzaiw.a(true);
        return localzaie.b() == 0 ? localzaie : zabc.f;
      }
      n = (int)((zabb)localzaie).o();
      if (n < k)
      {
        ((zaiw)localObject2).a(true);
        localzaiw.a(true);
        return zabc.b;
      }
      if (m < 1) {
        k = n;
      }
      localzaie = ((zaiw)localObject2).h().e(paramzaca);
      if (localzaie.b() != 3)
      {
        ((zaiw)localObject2).a(true);
        localzaiw.a(true);
        return zabc.b;
      }
      d3 = ((zabb)localzaie).o();
    }
    ((zaiw)localObject2).a(true);
    localzaiw.a(true);
    if (j != i) {
      return zabc.b;
    }
    return new zabb(d2);
  }
  
  public static zaie g(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    if (paramArrayOfzaie[0] == zabg.a) {
      return zabg.a;
    }
    zaiw localzaiw = paramArrayOfzaie[0].a(paramzaca, false);
    if ((localzaiw.l()) || (localzaiw.b() == 0)) {
      return localzaiw.a(0, 0);
    }
    zaie[][] arrayOfzaie = new zaie[localzaiw.d()][];
    int i = localzaiw.c();
    zaie localzaie = localzaiw.o();
    for (int j = 0; j < arrayOfzaie.length; j++)
    {
      arrayOfzaie[j] = new zaie[i];
      zc.a(arrayOfzaie[j], 0, i, localzaie);
    }
    localzaiw.b(true);
    localzaiw.f();
    while (localzaiw.g()) {
      arrayOfzaie[localzaiw.j()][localzaiw.i()] = localzaiw.h();
    }
    localzaiw.a(true);
    return new zaax(arrayOfzaie);
  }
  
  public static zaie h(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    if ((paramArrayOfzaie[0] == zabg.a) || (paramArrayOfzaie[1] == zabg.a)) {
      return zabc.g;
    }
    zaiw localzaiw1 = paramArrayOfzaie[0].a(paramzaca, false);
    if (localzaiw1.b() == 0) {
      return localzaiw1.a(0, 0);
    }
    zaiw localzaiw2 = paramArrayOfzaie[1].a(paramzaca, false);
    if (localzaiw2.b() == 0) {
      return localzaiw2.a(0, 0);
    }
    if ((localzaiw1.c() != localzaiw2.c()) || (localzaiw1.d() != localzaiw2.d())) {
      return zabc.b;
    }
    if (localzaiw1.l()) {
      return zabc.g;
    }
    double[] arrayOfDouble1 = new double[localzaiw1.e()];
    localzaiw1.f();
    Object localObject = zabt.a(localzaiw1, arrayOfDouble1, paramzaca, 0x5 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x7000);
    localzaiw1.a(true);
    localzaiw1 = null;
    if (((zaie)localObject).b() == 0) {
      return (zaie)localObject;
    }
    double[] arrayOfDouble2 = new double[arrayOfDouble1.length];
    localzaiw2.f();
    localObject = zabt.a(localzaiw2, arrayOfDouble2, paramzaca, 0x5 | (ztr.b(zuf.i) & 0xFF) << 4 | 0x7000);
    localzaiw2.a(true);
    localzaiw2 = null;
    if (((zaie)localObject).b() == 0) {
      return (zaie)localObject;
    }
    int[] arrayOfInt = new int[arrayOfDouble2.length];
    for (int i = 0; i < arrayOfDouble2.length; i++)
    {
      if (!paramzaca.a(arrayOfDouble2[i])) {
        return zabc.b;
      }
      arrayOfInt[i] = ((int)arrayOfDouble2[i]);
    }
    arrayOfDouble2 = null;
    double d = 0.1D;
    if (paramArrayOfzaie.length > 2)
    {
      arrayOfDouble2 = new double[1];
      localObject = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfDouble2, 7);
      if (localObject != null) {
        return (zaie)localObject;
      }
      d = arrayOfDouble2[0];
      arrayOfDouble2 = null;
    }
    return zaqy.a(arrayOfDouble1, arrayOfInt, d);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */