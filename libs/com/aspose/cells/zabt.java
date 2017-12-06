package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

abstract class zabt
{
  public static int a(byte paramByte)
  {
    return paramByte & 0xFF & 0x60;
  }
  
  public static zabb a(String paramString, zaca paramzaca)
  {
    zavp localzavp = zaac.a(paramString, paramzaca.p.h);
    if (localzavp == null) {
      return null;
    }
    switch (localzavp.a())
    {
    case 1: 
      return paramzaca.a((DateTime)localzavp.d());
    case 4: 
      return new zabb(((Double)localzavp.d()).doubleValue());
    }
    return null;
  }
  
  public static zaie a(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean, zaca paramzaca)
  {
    if (paramzaca.p.z)
    {
      localObject = paramzaca.p.y.get(Long.valueOf(Cell.a(paramCells.g().getIndex(), paramInt1, paramInt2)));
      if (localObject != null) {
        return (zaie)localObject;
      }
    }
    Object localObject = paramCells.getRows().a.a(paramInt1, new zgs(paramInt2), 4);
    if (localObject == null) {
      return zabg.a;
    }
    if (((zgs)localObject).c == 5)
    {
      zaai localzaai = (zaai)((zgs)localObject).d;
      if (paramzaca.p.L.m)
      {
        int i = paramCells.g().getIndex();
        if (paramBoolean)
        {
          if (localzaai.a(paramzaca, i)) {
            return new zabd(i, localzaai);
          }
        }
        else if (localzaai.b(paramzaca, i))
        {
          zaca localzaca = new zaca(paramzaca);
          if (localzaca.c != paramCells.g()) {
            localzaca.a(paramCells.g());
          }
          localzaai.b(localzaca);
        }
        return localzaai.m();
      }
      if (localzaai.c == 0)
      {
        if (paramzaca.p.L.n.a) {
          zl.a(zs.a(paramzaca.b(new StringBuilder(128).append("Null value of cell formula was used without recursive calculation, take it as 0: "))));
        }
        return zabb.a;
      }
    }
    return a(((zgs)localObject).c, ((zgs)localObject).d);
  }
  
  public static zaie a(Worksheet paramWorksheet, zgs paramzgs, boolean paramBoolean, zaca paramzaca)
  {
    if (paramzgs.c == 5)
    {
      zaai localzaai = (zaai)paramzgs.d;
      if (paramzaca.p.L.m)
      {
        int i = paramWorksheet.getIndex();
        if (paramBoolean)
        {
          if (localzaai.a(paramzaca, i)) {
            return new zabd(i, localzaai);
          }
        }
        else if (localzaai.b(paramzaca, i))
        {
          zaca localzaca = new zaca(paramzaca);
          if (localzaca.c != paramWorksheet) {
            localzaca.a(paramWorksheet);
          }
          localzaai.b(localzaca);
        }
        return localzaai.m();
      }
      if (localzaai.c == 0)
      {
        if (paramzaca.p.L.n.a) {
          zl.a(zs.a(new StringBuilder(64).append("Null value of cell formula was used without recursive calculation, take it as 0: ").append(paramWorksheet.getName()).append("!").append(CellsHelper.cellIndexToName(localzaai.e, localzaai.f))));
        }
        return zabb.a;
      }
    }
    return a(paramzgs.c, paramzgs.d);
  }
  
  public static zaie a(zgs paramzgs, zaca paramzaca)
  {
    switch (paramzgs.c)
    {
    case 0: 
      return zabg.a;
    case 2: 
      return ((Boolean)paramzgs.d).booleanValue() ? zaba.a : zaba.b;
    case 1: 
      double d = ((Double)paramzgs.d).doubleValue();
      if (d == 0.0D) {
        return zabb.a;
      }
      return new zabb(d);
    case 6: 
      int i = ((Integer)paramzgs.d).intValue();
      if (i == 0) {
        return zabb.a;
      }
      return new zabb(i);
    case 3: 
      return zabc.a(((Byte)paramzgs.d).byteValue());
    case 4: 
      return new zabp((String)paramzgs.d);
    case 5: 
      return ((zaai)paramzgs.d).m();
    }
    return new zabp(zs.a(paramzgs.d));
  }
  
  public static zaie a(int paramInt, Object paramObject)
  {
    double d;
    switch (paramInt)
    {
    case 0: 
      return zabg.a;
    case 2: 
      return ((Boolean)paramObject).booleanValue() ? zaba.a : zaba.b;
    case 1: 
      d = ((Double)paramObject).doubleValue();
      if (d == 0.0D) {
        return zabb.a;
      }
      return new zabb(d);
    case 6: 
      d = zayi.a(((Integer)paramObject).intValue());
      if (d == 0.0D) {
        return zabb.a;
      }
      return new zabb(d);
    case 3: 
      return zabc.a(((Byte)paramObject).byteValue());
    case 4: 
      return new zabp(((zbbj)paramObject).c);
    case 5: 
      return ((zaai)paramObject).m();
    }
    return new zabp(zs.a(paramObject));
  }
  
  public static zaie a(DateTime paramDateTime, zaca paramzaca)
  {
    return paramzaca.a(paramDateTime);
  }
  
  public static zabb a(int paramInt)
  {
    if (paramInt == 0) {
      return zabb.a;
    }
    if (paramInt == 1) {
      return zabb.b;
    }
    return new zabb(paramInt);
  }
  
  public static zabb a(long paramLong)
  {
    if (paramLong == 0L) {
      return zabb.a;
    }
    if (paramLong == 1L) {
      return zabb.b;
    }
    return new zabb(paramLong);
  }
  
  public static zabb a(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return zabb.a;
    }
    if (paramDouble == 1.0D) {
      return zabb.b;
    }
    return new zabb(zga.c(paramDouble));
  }
  
  public static zaie a(Object paramObject, zaca paramzaca)
  {
    if (paramObject == null) {
      return zabg.a;
    }
    Object localObject1;
    Object localObject2;
    if ((paramObject instanceof Object[][]))
    {
      localObject1 = (Object[][])paramObject;
      localObject2 = new zaie[localObject1.length][];
      for (int i = 0; i < localObject1.length; i++)
      {
        Object localObject3 = localObject1[i];
        if (localObject3 != null)
        {
          zaie[] arrayOfzaie2 = new zaie[localObject3.length];
          for (int m = 0; m < arrayOfzaie2.length; m++) {
            arrayOfzaie2[m] = b(localObject3[m], paramzaca);
          }
          localObject2[i] = arrayOfzaie2;
        }
      }
      return new zaax((zaie[][])localObject2);
    }
    if ((paramObject instanceof Object[]))
    {
      localObject1 = (Object[])paramObject;
      localObject2 = (zaie[][])null;
      zaie[] arrayOfzaie1 = new zaie[localObject1.length];
      for (int j = 0; j < arrayOfzaie1.length; j++) {
        if ((localObject1[j] != null) && ((localObject1[j] instanceof Object[])))
        {
          if (j > 0)
          {
            if (localObject2 == null)
            {
              localObject2 = new zaie[localObject1.length][];
              for (int k = 0; k < j; k++) {
                localObject2[k] = { arrayOfzaie1[k] };
              }
            }
          }
          else {
            localObject2 = new zaie[localObject1.length][];
          }
          Object[] arrayOfObject = (Object[])localObject1[j];
          zaie[] arrayOfzaie3 = new zaie[arrayOfObject.length];
          for (int n = 0; n < arrayOfzaie3.length; n++) {
            arrayOfzaie3[n] = b(arrayOfObject[n], paramzaca);
          }
          localObject2[j] = arrayOfzaie3;
        }
        else if (localObject2 != null)
        {
          localObject2[j] = { b(localObject1[j], paramzaca) };
        }
        else
        {
          arrayOfzaie1[j] = b(localObject1[j], paramzaca);
        }
      }
      if (localObject2 != null) {
        return new zaax((zaie[][])localObject2);
      }
      return new zaax(new zaie[][] { arrayOfzaie1 });
    }
    if ((paramObject instanceof Range))
    {
      localObject1 = (Range)paramObject;
      localObject2 = ((Range)localObject1).a();
      return new zabo(32, new zbap(paramzaca.c(((Range)localObject1).getWorksheet().getIndex()), ((CellArea)localObject2).StartRow, ((CellArea)localObject2).StartColumn, ((CellArea)localObject2).EndRow, ((CellArea)localObject2).EndColumn));
    }
    return b(paramObject, paramzaca);
  }
  
  private static zaie b(Object paramObject, zaca paramzaca)
  {
    if ((paramObject instanceof ReferredArea)) {
      return new zabo(32, ((ReferredArea)paramObject).a());
    }
    zgs localzgs = new zgs();
    if (!localzgs.a(paramObject, false)) {
      switch (localzgs.c)
      {
      case 4: 
        String str = (String)paramObject;
        if ("".equals(str)) {
          return zabp.a;
        }
        return new zabp(str);
      case 1: 
        return a((DateTime)localzgs.d, paramzaca);
      }
    }
    return a(localzgs.c, localzgs.d);
  }
  
  public static zny a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    paramzaie = paramzaie.e(paramzaca);
    if (paramzaie == zabg.a) {
      return new zoc(paramzaca, zabi.q());
    }
    if (paramzaie.b() != 2) {
      return a(paramzaie, paramzaca, zabi.q(), paramBoolean);
    }
    String str1 = ((zabp)paramzaie).o();
    if (str1.equals("")) {
      return new zod(paramzaca, zabi.q(), "", false);
    }
    int i = 0;
    zabi localzabi;
    switch (str1.charAt(0))
    {
    case '>': 
      if ((str1.length() > 1) && (str1.charAt(1) == '='))
      {
        localzabi = zabi.r();
        i = 2;
      }
      else
      {
        localzabi = zabi.s();
        i = 1;
      }
      break;
    case '<': 
      if (str1.length() > 1)
      {
        switch (str1.charAt(1))
        {
        case '=': 
          localzabi = zabi.t();
          i = 2;
          break;
        case '>': 
          localzabi = zabi.v();
          i = 2;
          break;
        default: 
          localzabi = zabi.u();
          i = 1;
          break;
        }
      }
      else
      {
        localzabi = zabi.u();
        i = 1;
      }
      break;
    case '=': 
      localzabi = zabi.q();
      i = 1;
      break;
    default: 
      localzabi = zabi.q();
    }
    if (i < str1.length())
    {
      String str2 = str1.substring(i);
      zabb localzabb = a(str2, paramzaca);
      if (localzabb != null) {
        return new zoc(paramzaca, localzabi, localzabb.o());
      }
      String str3 = str2.toUpperCase();
      if (str3.equals("TRUE")) {
        return new znz(paramzaca, localzabi, true);
      }
      if (str3.equals("FALSE")) {
        return new znz(paramzaca, localzabi, false);
      }
      zabc localzabc = zabc.a(str2);
      if (localzabc == null) {
        return new zod(paramzaca, localzabi, str2, (localzabi.a() == 11) || (localzabi.a() == 14));
      }
      return new zoa(paramzaca, localzabi, localzabc);
    }
    return new zob(paramzaca, localzabi);
  }
  
  public static zny b(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    return a(paramzaie, paramzaca, zabi.q(), paramBoolean);
  }
  
  public static zny a(zaie paramzaie, zaca paramzaca, zabi paramzabi, boolean paramBoolean)
  {
    switch (paramzaie.b())
    {
    case 2: 
      return new zod(paramzaca, paramzabi, ((zabp)paramzaie).o(), paramBoolean);
    case 3: 
      return new zoc(paramzaca, paramzabi, ((zabb)paramzaie).o());
    case 1: 
      return new znz(paramzaca, paramzabi, ((zaba)paramzaie).o());
    case 12: 
      return new zob(paramzaca, paramzabi);
    case 0: 
      return new zoa(paramzaca, paramzabi, (zabc)paramzaie);
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported criteria node type: " + paramzaie.b());
    }
    return new zob(paramzaca, paramzabi);
  }
  
  public static boolean a(zaie paramzaie1, zaie paramzaie2, zaca paramzaca)
  {
    if (paramzaie1 == paramzaie2) {
      return true;
    }
    switch (paramzaie2.b())
    {
    case 2: 
      return zod.b(paramzaie1, ((zabp)paramzaie2).o(), paramzaca);
    case 3: 
      return zoc.b(paramzaie1, ((zabb)paramzaie2).o(), paramzaca);
    case 1: 
      return znz.b(paramzaie1, ((zaba)paramzaie2).o(), paramzaca);
    case 0: 
      return false;
    case 12: 
      return zob.b(paramzaie1, paramzaca);
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to compare EQ/NE: " + paramzaie2.b());
    }
    return false;
  }
  
  public static boolean b(int paramInt)
  {
    return ((byte)paramInt & 0x1) != 0;
  }
  
  public static boolean c(int paramInt)
  {
    return ((byte)paramInt & 0x2) != 0;
  }
  
  public static boolean d(int paramInt)
  {
    return ((byte)paramInt & 0x4) != 0;
  }
  
  public static zabc a(zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt1, double[] paramArrayOfDouble, int paramInt2)
  {
    for (int i = 0; i < paramArrayOfDouble.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[(i + paramInt1)].e(paramzaca);
      if (localzaie.b() == 0) {
        return (zabc)localzaie;
      }
      zabb localzabb = localzaie.a(paramzaca, paramInt2);
      if (localzabb == null) {
        return zabc.f;
      }
      paramArrayOfDouble[i] = localzabb.o();
    }
    return null;
  }
  
  public static zabc a(zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt, boolean[] paramArrayOfBoolean)
  {
    for (int i = 0; i < paramArrayOfBoolean.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[(i + paramInt)].e(paramzaca);
      if (localzaie.b() == 0) {
        return (zabc)localzaie;
      }
      zaba localzaba = localzaie.j(paramzaca);
      if (localzaba == null) {
        return zabc.f;
      }
      paramArrayOfBoolean[i] = localzaba.o();
    }
    return null;
  }
  
  public static zabc a(zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt, String[] paramArrayOfString)
  {
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[(i + paramInt)].e(paramzaca);
      if (localzaie.b() == 0) {
        return (zabc)localzaie;
      }
      zabp localzabp = localzaie.i(paramzaca);
      if (localzabp == null) {
        return zabc.f;
      }
      paramArrayOfString[i] = localzabp.o();
    }
    return null;
  }
  
  public static zabc a(zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt1, DateTime[] paramArrayOfDateTime, int paramInt2)
  {
    for (int i = 0; i < paramArrayOfDateTime.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[(i + paramInt1)].e(paramzaca);
      if (localzaie.b() == 0) {
        return (zabc)localzaie;
      }
      zabb localzabb = localzaie.a(paramzaca, 7);
      if (localzabb == null) {
        return zabc.f;
      }
      if (!paramzaca.a(localzabb.o())) {
        return zabc.b;
      }
      paramArrayOfDateTime[i] = paramzaca.b(localzabb.o());
    }
    return null;
  }
  
  public static zabc a(zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt, zne[] paramArrayOfzne)
  {
    String str1 = null;
    for (int i = 0; i < paramArrayOfzne.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[(i + paramInt)].e(paramzaca);
      switch (localzaie.b())
      {
      case 0: 
        return (zabc)localzaie;
      case 3: 
        paramArrayOfzne[i] = new zne(((zabb)localzaie).o(), 0.0D);
        break;
      case 2: 
        String str2 = ((zabp)localzaie).o();
        if (zw.b(str2)) {
          return zabc.b;
        }
        try
        {
          paramArrayOfzne[i] = new zne(str2);
          if (str1 == null) {
            str1 = paramArrayOfzne[i].c();
          } else if (!str1.equals(paramArrayOfzne[i].c())) {
            return zabc.b;
          }
        }
        catch (Exception localException)
        {
          return zabc.b;
        }
      case 1: 
      default: 
        return zabc.b;
      }
    }
    return null;
  }
  
  public static zabc a(zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt, zaiw[] paramArrayOfzaiw, zabc paramzabc)
  {
    for (int i = 0; i < paramArrayOfzaiw.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[(i + paramInt)];
      if (localzaie == zabg.a)
      {
        if (paramzabc != null)
        {
          if (i > 0) {
            for (;;)
            {
              i--;
              paramArrayOfzaiw[i].a(true);
              if (i == 0) {
                break;
              }
            }
          }
          return paramzabc;
        }
        paramArrayOfzaiw[i] = localzaie.a(paramzaca, false);
      }
      else
      {
        if (localzaie.b() == 0)
        {
          if (i > 0) {
            for (;;)
            {
              i--;
              paramArrayOfzaiw[i].a(true);
              if (i == 0) {
                break;
              }
            }
          }
          return (zabc)localzaie;
        }
        paramArrayOfzaiw[i] = localzaie.a(paramzaca, false);
        if (paramArrayOfzaiw[i].b() == 0)
        {
          zabc localzabc = (zabc)paramArrayOfzaiw[i].a(0, 0);
          if (i > 0) {
            for (;;)
            {
              i--;
              paramArrayOfzaiw[i].a(true);
              if (i == 0) {
                break;
              }
            }
          }
          return localzabc;
        }
      }
    }
    return null;
  }
  
  public static zabc a(zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt1, double[][] paramArrayOfDouble, int paramInt2, double paramDouble)
  {
    for (int i = 0; i < paramArrayOfDouble.length; i++)
    {
      zaie localzaie = paramArrayOfzaie[(i + paramInt1)];
      if (localzaie.b() == 0) {
        return (zabc)localzaie;
      }
      zaiw localzaiw = localzaie.a(paramzaca, false);
      if (localzaiw.b() == 0) {
        return (zabc)localzaiw.a(0, 0);
      }
      Object localObject = new double[localzaiw.e()];
      if (((paramInt2 & 0x8000) == 0) && (paramDouble != 0.0D))
      {
        zc.a((double[])localObject, 0, localObject.length, paramDouble);
        paramInt2 |= 0x10000;
      }
      localzaiw.f();
      localzaie = a(localzaiw, (double[])localObject, paramzaca, paramInt2);
      localzaiw.a(true);
      if (localzaie.b() == 0) {
        return (zabc)localzaie;
      }
      int j = (int)((zabb)localzaie).o();
      if (j < localObject.length)
      {
        double[] arrayOfDouble = new double[j];
        System.arraycopy(localObject, 0, arrayOfDouble, 0, j);
        localObject = arrayOfDouble;
      }
      paramArrayOfDouble[i] = localObject;
    }
    return null;
  }
  
  public static zaie a(zaiw paramzaiw, double[] paramArrayOfDouble, zaca paramzaca, int paramInt)
  {
    int i = (byte)(paramInt & 0xF) & 0xFF;
    int j = (paramInt & 0x1000) != 0 ? 1 : 0;
    int k = (paramInt & 0x2000) != 0 ? 1 : 0;
    int m = (paramInt & 0x4000) != 0 ? 1 : 0;
    int n = (paramInt & 0x8000) != 0 ? 1 : 0;
    zaie localzaie = paramzaiw.o();
    zabb localzabb1 = localzaie.a(paramzaca, i);
    zabb localzabb3;
    if (localzabb1 != null)
    {
      double d = localzabb1.o();
      int i3;
      if ((paramInt & 0x10000) != 0)
      {
        i3 = 0;
        int i5;
        if (n != 0)
        {
          int i6 = 0;
          while (paramzaiw.g())
          {
            i5 = paramzaiw.k() - i6;
            if (i5 > i3) {
              zc.a(paramArrayOfDouble, i3, i5, d);
            }
            i3 = i5 + 1;
            localzaie = paramzaiw.h().e(paramzaca);
            if (localzaie.b() == 0)
            {
              if (k != 0) {
                return m != 0 ? localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
              }
              i6++;
            }
            else
            {
              zabb localzabb5 = localzaie.a(paramzaca, i);
              if (localzabb5 != null)
              {
                paramArrayOfDouble[i5] = localzabb5.o();
              }
              else
              {
                if (j != 0) {
                  return zabc.a((byte)(paramInt >> 4 & 0xFF));
                }
                i6++;
              }
            }
          }
          i5 = ((paramInt & 0x20000) != 0 ? paramzaiw.e() : paramArrayOfDouble.length) - i6;
        }
        else
        {
          while (paramzaiw.g())
          {
            i5 = paramzaiw.k();
            if (i5 > i3) {
              zc.a(paramArrayOfDouble, i3, i5, 0.0D);
            }
            i3 = i5 + 1;
            localzaie = paramzaiw.h().e(paramzaca);
            if (localzaie.b() == 0)
            {
              if (k != 0) {
                return m != 0 ? localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
              }
            }
            else
            {
              zabb localzabb4 = localzaie.a(paramzaca, i);
              if (localzabb4 != null) {
                paramArrayOfDouble[i5] = localzabb4.o();
              } else if (j != 0) {
                return zabc.a((byte)(paramInt >> 4 & 0xFF));
              }
            }
          }
          i5 = (paramInt & 0x20000) != 0 ? paramzaiw.e() : paramArrayOfDouble.length;
        }
        if (i5 > i3) {
          zc.a(paramArrayOfDouble, i3, i5, d);
        }
        return new zabb(i5);
      }
      if (n != 0)
      {
        i3 = 0;
        while (paramzaiw.g())
        {
          localzaie = paramzaiw.h().e(paramzaca);
          if (localzaie.b() == 0)
          {
            if (k != 0) {
              return m != 0 ? localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
            }
            i3++;
          }
          else
          {
            localzabb3 = localzaie.a(paramzaca, i);
            if (localzabb3 != null)
            {
              paramArrayOfDouble[(paramzaiw.k() - i3)] = localzabb3.o();
            }
            else
            {
              if (j != 0) {
                return zabc.a((byte)(paramInt >> 4 & 0xFF));
              }
              i3++;
            }
          }
        }
        return new zabb(((paramInt & 0x20000) != 0 ? paramzaiw.e() : paramArrayOfDouble.length) - i3);
      }
      while (paramzaiw.g())
      {
        localzaie = paramzaiw.h().e(paramzaca);
        if (localzaie.b() == 0)
        {
          if (k != 0) {
            return m != 0 ? localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
        }
        else
        {
          zabb localzabb2 = localzaie.a(paramzaca, i);
          if (localzabb2 != null) {
            paramArrayOfDouble[paramzaiw.k()] = localzabb2.o();
          } else if (j != 0) {
            return zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
        }
      }
      return new zabb((paramInt & 0x20000) != 0 ? paramzaiw.e() : paramArrayOfDouble.length);
    }
    if (n != 0)
    {
      i1 = 0;
      i2 = -1;
      i4 = 0;
      while (paramzaiw.g())
      {
        i2 = paramzaiw.k();
        if (i2 > i1)
        {
          if (j != 0) {
            return zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
          i4 += i2 - i1;
        }
        i1 = i2 + 1;
        localzaie = paramzaiw.h().e(paramzaca);
        if (localzaie.b() == 0)
        {
          if (k != 0) {
            return m != 0 ? localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
          i4++;
        }
        else
        {
          localzabb3 = localzaie.a(paramzaca, i);
          if (localzabb3 != null)
          {
            paramArrayOfDouble[(i2 - i4)] = localzabb3.o();
          }
          else
          {
            if (j != 0) {
              return zabc.a((byte)(paramInt >> 4 & 0xFF));
            }
            i4++;
          }
        }
      }
      if (j != 0)
      {
        i2 = (paramInt & 0x20000) != 0 ? paramzaiw.e() : paramArrayOfDouble.length;
        if (i2 > i1) {
          return zabc.a((byte)(paramInt >> 4 & 0xFF));
        }
      }
      else
      {
        i2++;
      }
      return new zabb(i2 - i4);
    }
    int i1 = (paramInt & 0x10000) != 0 ? 1 : 0;
    int i2 = 0;
    int i4 = -1;
    while (paramzaiw.g())
    {
      i4 = paramzaiw.k();
      if (i4 > i2)
      {
        if (j != 0) {
          return zabc.a((byte)(paramInt >> 4 & 0xFF));
        }
        if (i1 != 0) {
          zc.a(paramArrayOfDouble, i2, i4, 0.0D);
        }
      }
      i2 = i4 + 1;
      localzaie = paramzaiw.h().e(paramzaca);
      if (localzaie.b() == 0)
      {
        if (k != 0) {
          return m != 0 ? localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
        }
        if (i1 != 0) {
          paramArrayOfDouble[i4] = 0.0D;
        }
      }
      else
      {
        localzabb3 = localzaie.a(paramzaca, i);
        if (localzabb3 != null)
        {
          paramArrayOfDouble[i4] = localzabb3.o();
        }
        else
        {
          if (j != 0) {
            return zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
          if (i1 != 0) {
            paramArrayOfDouble[i4] = 0.0D;
          }
        }
      }
    }
    i4 = (paramInt & 0x20000) != 0 ? paramzaiw.e() : paramArrayOfDouble.length;
    if (i4 > i2)
    {
      if (j != 0) {
        return zabc.a((byte)(paramInt >> 4 & 0xFF));
      }
      if (i1 != 0) {
        zc.a(paramArrayOfDouble, i2, i4, 0.0D);
      }
    }
    return new zabb(i4);
  }
  
  public static zabc a(zaiw paramzaiw, double[][] paramArrayOfDouble, zaca paramzaca, int paramInt)
  {
    int i = (byte)(paramInt & 0xF) & 0xFF;
    int j = (paramInt & 0x1000) != 0 ? 1 : 0;
    int k = (paramInt & 0x2000) != 0 ? 1 : 0;
    int m = (paramInt & 0x4000) != 0 ? 1 : 0;
    zaie localzaie = paramzaiw.o();
    zabb localzabb1 = localzaie.a(paramzaca, i);
    int i4;
    if (localzabb1 != null)
    {
      double d = localzabb1.o();
      if ((paramInt & 0x10000) != 0)
      {
        int i2 = 0;
        i4 = 0;
        double[] arrayOfDouble2 = paramArrayOfDouble[0];
        while (paramzaiw.g())
        {
          int i5 = paramzaiw.i();
          int i6 = paramzaiw.j();
          if (i5 > i2)
          {
            if (i4 < arrayOfDouble2.length) {
              zc.a(arrayOfDouble2, i4, arrayOfDouble2.length, d);
            }
            i2++;
            if (i2 < i5) {
              while (i2 < i5)
              {
                zc.a(paramArrayOfDouble[i2], 0, arrayOfDouble2.length, d);
                i2++;
              }
            }
            arrayOfDouble2 = paramArrayOfDouble[i2];
            i4 = 0;
          }
          if (i6 > i4) {
            zc.a(arrayOfDouble2, i4, i6, d);
          }
          i4 = i6 + 1;
          localzaie = paramzaiw.h().e(paramzaca);
          if (localzaie.b() == 0)
          {
            if (k != 0) {
              return m != 0 ? (zabc)localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
            }
          }
          else
          {
            zabb localzabb5 = localzaie.a(paramzaca, i);
            if (localzabb5 != null) {
              paramArrayOfDouble[i5][i6] = localzabb5.o();
            } else if (j != 0) {
              return zabc.a((byte)(paramInt >> 4 & 0xFF));
            }
          }
        }
        if (i4 < arrayOfDouble2.length) {
          zc.a(arrayOfDouble2, i4, arrayOfDouble2.length, d);
        }
        i2++;
        if (i2 < paramArrayOfDouble.length) {
          while (i2 < paramArrayOfDouble.length)
          {
            zc.a(paramArrayOfDouble[i2], 0, arrayOfDouble2.length, d);
            i2++;
          }
        }
        return null;
      }
      while (paramzaiw.g())
      {
        localzaie = paramzaiw.h().e(paramzaca);
        if (localzaie.b() == 0)
        {
          if (k != 0) {
            return m != 0 ? (zabc)localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
        }
        else
        {
          zabb localzabb3 = localzaie.a(paramzaca, i);
          if (localzabb3 != null) {
            paramArrayOfDouble[paramzaiw.i()][paramzaiw.j()] = localzabb3.o();
          } else if (j != 0) {
            return zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
        }
      }
      return null;
    }
    if (j != 0)
    {
      int n = 0;
      int i1 = 0;
      double[] arrayOfDouble1 = paramArrayOfDouble[0];
      while (paramzaiw.g())
      {
        int i3 = paramzaiw.i();
        i4 = paramzaiw.j();
        if (i3 > n)
        {
          if (i1 < arrayOfDouble1.length) {
            return zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
          n++;
          if (i3 > n) {
            return zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
          arrayOfDouble1 = paramArrayOfDouble[i3];
          i1 = 0;
        }
        if (i4 > i1) {
          return zabc.a((byte)(paramInt >> 4 & 0xFF));
        }
        i1 = i4 + 1;
        localzaie = paramzaiw.h().e(paramzaca);
        if (localzaie.b() == 0)
        {
          if (k != 0) {
            return m != 0 ? (zabc)localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
        }
        else
        {
          zabb localzabb4 = localzaie.a(paramzaca, i);
          if (localzabb4 != null) {
            paramArrayOfDouble[i3][i4] = localzabb4.o();
          } else {
            return zabc.a((byte)(paramInt >> 4 & 0xFF));
          }
        }
      }
      if ((i1 < paramzaiw.d()) || (n + 1 < paramzaiw.c())) {
        return zabc.a((byte)(paramInt >> 4 & 0xFF));
      }
      return null;
    }
    while (paramzaiw.g())
    {
      localzaie = paramzaiw.h().e(paramzaca);
      if (localzaie.b() == 0)
      {
        if (k != 0) {
          return m != 0 ? (zabc)localzaie : zabc.a((byte)(paramInt >> 4 & 0xFF));
        }
      }
      else
      {
        zabb localzabb2 = localzaie.a(paramzaca, i);
        if (localzabb2 != null) {
          paramArrayOfDouble[paramzaiw.i()][paramzaiw.j()] = localzabb2.o();
        }
      }
    }
    return null;
  }
  
  public static zaie a(zaie paramzaie, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 12: 
      return zabc.c;
    case 0: 
      return paramzaie;
    case 9: 
      if (((zabo)paramzaie).k(paramzaca)) {
        return zabc.c;
      }
      return paramzaie;
    }
    for (;;)
    {
      zaie localzaie = paramzaie.d(paramzaca);
      if (localzaie == paramzaie) {
        return zabc.c;
      }
      paramzaie = localzaie;
      switch (paramzaie.b())
      {
      case 12: 
        return zabc.c;
      case 0: 
      case 9: 
        return paramzaie;
      }
      paramzaie = localzaie;
    }
  }
  
  public static zaie b(zaie paramzaie, zaca paramzaca)
  {
    if (paramzaie.b() == 9) {
      return paramzaie;
    }
    zaie localzaie = paramzaie.d(paramzaca);
    if (localzaie == paramzaie) {
      return localzaie;
    }
    do
    {
      if (paramzaie.b() == 9) {
        return paramzaie;
      }
      paramzaie = localzaie.d(paramzaca);
      if (localzaie == paramzaie) {
        return localzaie;
      }
      localzaie = paramzaie.d(paramzaca);
    } while (localzaie != paramzaie);
    return localzaie;
  }
  
  public static zaie c(zaie paramzaie, zaca paramzaca)
  {
    zaie localzaie = paramzaie.d(paramzaca);
    if (localzaie == paramzaie) {
      return localzaie;
    }
    do
    {
      paramzaie = localzaie.d(paramzaca);
      if (localzaie == paramzaie) {
        return localzaie;
      }
      localzaie = paramzaie.d(paramzaca);
    } while (localzaie != paramzaie);
    return localzaie;
  }
  
  public static zaie[][] a(double[][] paramArrayOfDouble)
  {
    zaie[][] arrayOfzaie = new zaie[paramArrayOfDouble.length][];
    for (int i = 0; i < paramArrayOfDouble.length; i++)
    {
      double[] arrayOfDouble = paramArrayOfDouble[i];
      zaie[] arrayOfzaie1 = new zaie[arrayOfDouble.length];
      arrayOfzaie[i] = arrayOfzaie1;
      for (int j = 0; j < arrayOfDouble.length; j++) {
        arrayOfzaie1[j] = new zabb(arrayOfDouble[j]);
      }
    }
    return arrayOfzaie;
  }
  
  public static boolean a(zaie[] paramArrayOfzaie1, zaie[] paramArrayOfzaie2)
  {
    if ((paramArrayOfzaie1 == null) || (paramArrayOfzaie1.length < 1))
    {
      if ((paramArrayOfzaie2 != null) && (paramArrayOfzaie2.length > 0)) {
        return false;
      }
    }
    else
    {
      if ((paramArrayOfzaie2 == null) || (paramArrayOfzaie2.length < 1)) {
        return false;
      }
      if (paramArrayOfzaie1.length != paramArrayOfzaie2.length) {
        return false;
      }
      for (int i = 0; i < paramArrayOfzaie1.length; i++) {
        if (paramArrayOfzaie1[i] == null)
        {
          if (paramArrayOfzaie2[i] != null) {
            return false;
          }
        }
        else if (!paramArrayOfzaie1[i].a(paramArrayOfzaie2[i])) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static zaie b(double paramDouble)
  {
    if ((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) {
      return zabc.b;
    }
    return new zabb(paramDouble);
  }
  
  public static zaie[] a(zabk paramzabk)
  {
    ArrayList localArrayList = new ArrayList();
    a(localArrayList, paramzabk.G());
    a(localArrayList, paramzabk.H());
    zaie[] arrayOfzaie = new zaie[localArrayList.size()];
    for (int i = 0; i < arrayOfzaie.length; i++) {
      arrayOfzaie[i] = ((zaie)localArrayList.get(i));
    }
    return arrayOfzaie;
  }
  
  public static void a(ArrayList paramArrayList, zaie paramzaie)
  {
    if ((paramzaie != null) && (paramzaie.a() == 16))
    {
      zabk localzabk = (zabk)paramzaie;
      a(paramArrayList, localzabk.G());
      a(paramArrayList, localzabk.H());
    }
    else
    {
      zf.a(paramArrayList, paramzaie);
    }
  }
  
  public static void a(zaie paramzaie1, zaie paramzaie2)
  {
    if (!paramzaie2.k()) {
      return;
    }
    paramzaie1 = paramzaie1.b(paramzaie2);
    if (paramzaie1 == null) {
      return;
    }
    zabu localzabu = paramzaie1.l();
    if (localzabu == null)
    {
      localzabu = paramzaie2.l();
      if (localzabu == null)
      {
        localzabu = new zabu();
        paramzaie2.a(localzabu);
      }
      paramzaie1.a(localzabu);
    }
    else
    {
      paramzaie2.a(localzabu);
    }
  }
  
  public static zaie a(zaca paramzaca, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramzaca.a == 5) {
      return zabc.c;
    }
    zbti localzbti = paramzaca.p.e.w().a(paramInt1);
    if ((localzbti.c() == null) || (paramInt2 >= localzbti.c().length)) {
      return zabc.c;
    }
    zwr localzwr = localzbti.c(paramInt2);
    if (localzwr == null) {
      return zabc.c;
    }
    zgs localzgs = localzwr.a(paramInt3, paramInt4);
    if (localzgs == null) {
      return zabg.a;
    }
    return a(localzgs, paramzaca);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */