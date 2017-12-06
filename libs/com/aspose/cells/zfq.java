package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.zr;

class zfq
{
  static String a(Cells paramCells, int paramInt1, int paramInt2, zaca paramzaca)
  {
    Cell localCell = paramCells.checkCell(paramInt1, paramInt2);
    if (localCell == null) {
      return "";
    }
    if (localCell.getType() == 5) {
      switch (localCell.o().getHorizontalAlignment())
      {
      case 3: 
      case 5: 
      case 6: 
      case 7: 
        return "'";
      case 8: 
        return "\"";
      case 1: 
      case 2: 
        return "^";
      case 4: 
        return "\\";
      }
    }
    return "";
  }
  
  static double b(Cells paramCells, int paramInt1, int paramInt2, zaca paramzaca)
  {
    Style localStyle = a(paramCells, paramInt1, paramInt2);
    if (localStyle == null) {
      return 0.0D;
    }
    String str = localStyle.t();
    if ((str != null) && (!"".equals(str)))
    {
      zahf localzahf1 = paramzaca.p.a(str);
      if (localzahf1.a() == 6)
      {
        zaab localzaab = (zaab)localzahf1;
        zahf[] arrayOfzahf = localzaab.d();
        for (int i = 0; i < arrayOfzahf.length; i++) {
          if (!zh.a(arrayOfzahf[i].b().d())) {
            return 1.0D;
          }
        }
        zahf localzahf2 = localzaab.e();
        if (localzahf2 != null) {
          return zh.a(localzahf2.b().d()) ? 0.0D : 1.0D;
        }
        return 0.0D;
      }
      return zh.a(localzahf1.b().d()) ? 0.0D : 1.0D;
    }
    switch (localStyle.r())
    {
    case 6: 
    case 8: 
    case 38: 
    case 40: 
      return 1.0D;
    }
    return 0.0D;
  }
  
  static String c(Cells paramCells, int paramInt1, int paramInt2, zaca paramzaca)
  {
    Style localStyle = a(paramCells, paramInt1, paramInt2);
    if (localStyle == null) {
      return "G";
    }
    String str = localStyle.t();
    if ((str != null) && (!"".equals(str))) {
      return a(str, paramzaca.p.a(str), paramzaca);
    }
    switch (localStyle.r())
    {
    case 0: 
      return "G";
    case 1: 
      return "F0";
    case 2: 
      return "F2";
    case 3: 
      return ",0";
    case 4: 
      return ",2";
    case 5: 
      return "C0";
    case 6: 
      return "C0-";
    case 7: 
      return "C2";
    case 8: 
      return "C2-";
    case 9: 
      return "P0";
    case 10: 
      return "P2";
    case 11: 
      return "S2";
    case 12: 
      return "G";
    case 13: 
      return "G";
    case 14: 
      return "D4";
    case 15: 
      return "D1";
    case 16: 
      return "D2";
    case 17: 
      return "D3";
    case 18: 
      return "D7";
    case 19: 
      return "D6";
    case 20: 
      return "D9";
    case 21: 
      return "D8";
    case 22: 
      return "D4";
    case 23: 
      return ",0";
    case 24: 
      return ",0-";
    case 25: 
      return ",2";
    case 26: 
      return ",2-";
    case 27: 
      return "D4";
    case 28: 
      return "D4";
    case 29: 
      return "D4";
    case 30: 
      return "D4";
    case 31: 
      return "D4";
    case 32: 
      return "D8";
    case 33: 
      return "D8";
    case 34: 
      return "D4";
    case 35: 
      return "D4";
    case 36: 
      return "D4";
    case 37: 
      return ",0";
    case 38: 
      return ",0-";
    case 39: 
      return ",2";
    case 40: 
      return ",2-";
    case 41: 
      return ",0";
    case 42: 
      return "C0";
    case 43: 
      return ",2";
    case 44: 
      return "C2";
    case 45: 
      return "G";
    case 46: 
      return "G";
    case 47: 
      return "G";
    case 48: 
      return "S1";
    case 49: 
      return "G";
    case 50: 
      return "D4";
    case 51: 
      return "D4";
    case 52: 
      return "D4";
    case 53: 
      return "D4";
    case 54: 
      return "D4";
    case 55: 
      return "D4";
    case 56: 
      return "D4";
    case 57: 
      return "D4";
    case 58: 
      return "D4";
    }
    return "G";
  }
  
  static double d(Cells paramCells, int paramInt1, int paramInt2, zaca paramzaca)
  {
    Style localStyle = a(paramCells, paramInt1, paramInt2);
    if (localStyle == null) {
      return 0.0D;
    }
    String str = localStyle.t();
    if ((str != null) && (!"".equals(str)))
    {
      if ((str.indexOf('(') > -1) && (str.indexOf(')') > -1))
      {
        zahf localzahf = paramzaca.p.a(str);
        char[] arrayOfChar = localzahf.a(paramzaca.p.h.j(), Double.valueOf(-111111.0D)).g();
        if ((arrayOfChar.length > 1) && (arrayOfChar[0] == '(') && (arrayOfChar[(arrayOfChar.length - 1)] == ')')) {
          return 1.0D;
        }
        arrayOfChar = localzahf.a(paramzaca.p.h.j(), Double.valueOf(111111.0D)).g();
        if ((arrayOfChar.length > 1) && (arrayOfChar[0] == '(') && (arrayOfChar[(arrayOfChar.length - 1)] == ')')) {
          return 1.0D;
        }
        arrayOfChar = localzahf.a(paramzaca.p.h.j(), Double.valueOf(0.0D)).g();
        if ((arrayOfChar.length > 1) && (arrayOfChar[0] == '(') && (arrayOfChar[(arrayOfChar.length - 1)] == ')')) {
          return 1.0D;
        }
      }
      return 0.0D;
    }
    switch (localStyle.r())
    {
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
      return 1.0D;
    }
    return 0.0D;
  }
  
  static double e(Cells paramCells, int paramInt1, int paramInt2, zaca paramzaca)
  {
    Style localStyle = a(paramCells, paramInt1, paramInt2);
    if (localStyle == null) {
      return 0.0D;
    }
    return localStyle.isLocked() ? 1.0D : 0.0D;
  }
  
  static String f(Cells paramCells, int paramInt1, int paramInt2, zaca paramzaca)
  {
    Cell localCell = paramCells.checkCell(paramInt1, paramInt2);
    if (localCell == null) {
      return "b";
    }
    switch (localCell.getType())
    {
    case 3: 
      return "b";
    case 5: 
      return "l";
    }
    return "v";
  }
  
  private static Style a(Cells paramCells, int paramInt1, int paramInt2)
  {
    return paramCells.p().C().a(paramCells.d(paramInt1, paramInt2));
  }
  
  private static String a(String paramString, zahf paramzahf, zaca paramzaca)
  {
    Object localObject1;
    Object localObject2;
    switch (paramzahf.a())
    {
    case 2: 
      localObject1 = new StringBuilder(10);
      localObject2 = (zs)paramzahf;
      a(paramString, (zs)localObject2, paramzaca, (StringBuilder)localObject1);
      if (((zs)localObject2).d().h()) {
        ((StringBuilder)localObject1).append("()");
      }
      return com.aspose.cells.b.a.zs.a(localObject1);
    case 5: 
      localObject1 = "S" + ((zio)paramzahf).d().b();
      if (a(paramString)) {
        return (String)localObject1 + "()";
      }
      return (String)localObject1;
    case 4: 
      if (a(paramString)) {
        return "G()";
      }
      return "G";
    case 3: 
      localObject1 = a((zn)paramzahf, paramzaca);
      if (a(paramString)) {
        return (String)localObject1 + "()";
      }
      return (String)localObject1;
    case 6: 
      localObject1 = (zaab)paramzahf;
      localObject2 = ((zaab)localObject1).c();
      zahf[] arrayOfzahf = ((zaab)localObject1).d();
      if ((localObject2.length >= 2) && (localObject2[0].b() == 0.0D) && (localObject2[1].b() == 0.0D) && ((localObject2[0].a() == 2) || (localObject2[0].a() == 3)) && ((localObject2[1].a() == 6) || (localObject2[1].a() == 4)))
      {
        localObject3 = new StringBuilder(10);
        zahf localzahf1 = arrayOfzahf[0];
        zahf localzahf2 = arrayOfzahf[1];
        if (localzahf1.a() == 2)
        {
          a(localzahf1.b().b(), (zs)localzahf1, paramzaca, (StringBuilder)localObject3);
        }
        else if (localzahf2.a() == 2)
        {
          a(localzahf1.b().b(), (zs)localzahf2, paramzaca, (StringBuilder)localObject3);
        }
        else
        {
          if ((localzahf1.a() == 1) && (localzahf2.a() == 1) && (((zir)localzahf1).e()) && (((zir)localzahf2).e()) && (((zir)localzahf1).d() < 1) && (((zir)localzahf2).d() < 1))
          {
            if (arrayOfzahf.length < 3) {
              return "H";
            }
            int i = 1;
            for (int j = 2; j < arrayOfzahf.length; j++)
            {
              zahf localzahf3 = arrayOfzahf[j];
              if ((localzahf3.a() != 1) || (!((zir)localzahf3).e()) || (((zir)localzahf3).d() > 0))
              {
                i = 0;
                break;
              }
            }
            if (i != 0) {
              return "H";
            }
          }
          ((StringBuilder)localObject3).append(a(localzahf1.b().b(), localzahf1, paramzaca));
        }
        if ((!zh.a(localzahf1.b().d())) || (!zh.a(localzahf2.b().d()))) {
          ((StringBuilder)localObject3).append('-');
        }
        if (localzahf1.a() == 2)
        {
          if (((zs)localzahf1).d().h()) {
            ((StringBuilder)localObject3).append("()");
          }
        }
        else if (a(localzahf1.b().b())) {
          ((StringBuilder)localObject3).append("()");
        }
        return com.aspose.cells.b.a.zs.a(localObject3);
      }
      Object localObject3 = arrayOfzahf[0];
      return a(((zahf)localObject3).b().b(), (zahf)localObject3, paramzaca);
    case 0: 
      localObject1 = (zii)paramzahf;
      if (((zii)localObject1).c() != null) {
        return a(paramString, ((zii)localObject1).c(), paramzaca);
      }
      if (((zii)localObject1).d() != null) {
        return a(paramString, ((zii)localObject1).d(), paramzaca);
      }
      return "G";
    }
    return "G";
  }
  
  private static boolean a(String paramString)
  {
    if (paramString != null)
    {
      char[] arrayOfChar = paramString.toCharArray();
      int i = 0;
      while (i < arrayOfChar.length)
      {
        if (arrayOfChar[i] == '(') {
          return true;
        }
        if (arrayOfChar[i] == '\\')
        {
          i++;
          if (i >= arrayOfChar.length) {
            break;
          }
          if (arrayOfChar[i] == '(') {
            return true;
          }
          i++;
        }
        else
        {
          i = zl.a(arrayOfChar, i, arrayOfChar.length);
        }
      }
    }
    return false;
  }
  
  private static String a(zn paramzn, zaca paramzaca)
  {
    if ((paramzn.b(1)) || (paramzn.b(128)))
    {
      if (paramzn.b(4))
      {
        switch (paramzn.d())
        {
        case 2: 
          if (paramzn.b(256)) {
            return "D2";
          }
          return "D4";
        case 3: 
          return "D1";
        case 4: 
          if (paramzaca.p.h.f().f() == 4) {
            return "D1";
          }
          return "G";
        }
        return "G";
      }
      if (paramzn.b(256)) {
        return "D1";
      }
      return "D3";
    }
    if ((paramzn.b(2)) && (paramzn.b(4)))
    {
      if (paramzn.c()) {
        return "D2";
      }
      return "D5";
    }
    if (paramzn.b(64))
    {
      if (paramzn.b(32)) {
        return "D6";
      }
      return "D7";
    }
    if ((paramzn.b(8)) && (paramzn.b(16)))
    {
      if (paramzn.b(32)) {
        return "D8";
      }
      return "D9";
    }
    return "G";
  }
  
  private static void a(String paramString, zs paramzs, zaca paramzaca, StringBuilder paramStringBuilder)
  {
    int i = paramString.indexOf(paramzaca.p.h.a().d().d());
    if (i > -1)
    {
      int j = paramzaca.p.h.a().d().d().charAt(0);
      char[] arrayOfChar = paramString.toCharArray();
      for (int k = 0; k < arrayOfChar.length; k++)
      {
        int m;
        switch (arrayOfChar[k])
        {
        case '"': 
        case '\'': 
          if ((k < arrayOfChar.length - 2) && (arrayOfChar[(k + 2)] == arrayOfChar[k]) && (arrayOfChar[(k + 1)] == j))
          {
            paramStringBuilder.append('C');
            paramStringBuilder.append(paramzs.d().b());
            return;
          }
          m = arrayOfChar[k];
          k++;
        }
        while (k < arrayOfChar.length) {
          if (arrayOfChar[k] == m)
          {
            k++;
          }
          else
          {
            k++;
            continue;
            k++;
            while (k < arrayOfChar.length) {
              if (arrayOfChar[k] == ']')
              {
                k++;
              }
              else
              {
                k++;
                continue;
                if (arrayOfChar[k] == j)
                {
                  paramStringBuilder.append('C');
                  paramStringBuilder.append(paramzs.d().b());
                  return;
                }
              }
            }
          }
        }
      }
    }
    if ((paramzs.d().a() != 1.0D) && ((int)zr.a(Math.log10(paramzs.d().a())) % 3 != 0)) {
      paramStringBuilder.append('P');
    } else if (paramzs.d().g()) {
      paramStringBuilder.append(',');
    } else {
      paramStringBuilder.append('F');
    }
    paramStringBuilder.append(paramzs.d().b());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */