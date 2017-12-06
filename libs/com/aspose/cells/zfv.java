package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.a.c.zm;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

abstract class zfv
{
  private static final za a = new za(new String[] { "COL", "ROW", "ADDRESS", "FILENAME", "WIDTH", "FORMAT", "PREFIX", "PROTECT", "CONTENTS", "TYPE", "COLOR", "PARENTHESES" });
  
  public static zaie a(zabe paramzabe, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt1, int paramInt2)
  {
    double[] arrayOfDouble = new double[Math.min(paramArrayOfzaie.length, paramInt1)];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, paramInt2);
    if (localzabc != null) {
      return localzabc;
    }
    int i;
    Object localObject1;
    double d2;
    double d4;
    switch (paramzabe.p().b())
    {
    case 13: 
    case 204: 
      i = 2;
      if (arrayOfDouble.length > 1)
      {
        i = (int)arrayOfDouble[1];
        if (i > 127) {
          return zabc.f;
        }
      }
      return new zabp(a(arrayOfDouble[0], i, paramzaca));
    case 14: 
      i = 2;
      if (arrayOfDouble.length > 1) {
        i = (int)arrayOfDouble[1];
      }
      int k = 0;
      if (paramArrayOfzaie.length > 2)
      {
        boolean[] arrayOfBoolean1 = new boolean[1];
        localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfBoolean1);
        if (localzabc != null) {
          return localzabc;
        }
        k = arrayOfBoolean1[0];
      }
      if (i > 127) {
        return zabc.f;
      }
      if (i < 65213) {
        return new zabp("0");
      }
      return new zabp(a(arrayOfDouble[0], i, k, paramzaca));
    case 109: 
      if (arrayOfDouble[0] <= 0.0D) {
        return zabc.b;
      }
      double d1;
      if (arrayOfDouble.length > 1)
      {
        d1 = arrayOfDouble[1];
        if (d1 <= 0.0D) {
          return zabc.b;
        }
        if (d1 == 1.0D) {
          return zabc.a;
        }
      }
      else
      {
        d1 = 10.0D;
      }
      return new zabb(zr.a(arrayOfDouble[0], d1));
    case 197: 
      return new zabb(zm.a(arrayOfDouble[0], arrayOfDouble.length > 1 ? (int)arrayOfDouble[1] : 0, false));
    case 387: 
      if ((arrayOfDouble[0] >= 512.0D) || (arrayOfDouble[0] <= -513.0D)) {
        return zabc.b;
      }
      if (arrayOfDouble.length < 2)
      {
        localObject1 = ze.a((int)arrayOfDouble[0], 2);
        if (((String)localObject1).length() > 10) {
          localObject1 = ((String)localObject1).substring(((String)localObject1).length() - 10, ((String)localObject1).length() - 10 + 10);
        }
        return new zabp(((String)localObject1).toUpperCase());
      }
      if ((arrayOfDouble[1] < 1.0D) || (arrayOfDouble[1] >= 11.0D)) {
        return zabc.b;
      }
      return a(ze.a((int)arrayOfDouble[0], 2), (int)arrayOfDouble[1]);
    case 389: 
      if ((arrayOfDouble[0] >= 5.36870912E8D) || (arrayOfDouble[0] <= -5.36870913E8D)) {
        return zabc.b;
      }
      if (arrayOfDouble.length < 2)
      {
        localObject1 = ze.a((int)arrayOfDouble[0], 8);
        if (((String)localObject1).length() > 10) {
          localObject1 = ((String)localObject1).substring(((String)localObject1).length() - 10, ((String)localObject1).length() - 10 + 10);
        }
        return new zabp(((String)localObject1).toUpperCase());
      }
      if ((arrayOfDouble[1] < 1.0D) || (arrayOfDouble[1] >= 11.0D)) {
        return zabc.b;
      }
      return a(ze.a((int)arrayOfDouble[0], 8), (int)arrayOfDouble[1]);
    case 388: 
      if ((arrayOfDouble[0] >= 5.49755813888E11D) || (arrayOfDouble[0] <= -5.49755813889E11D)) {
        return zabc.b;
      }
      if (arrayOfDouble.length < 2)
      {
        localObject1 = ze.a(arrayOfDouble[0], 16);
        if (((String)localObject1).length() > 10) {
          localObject1 = ((String)localObject1).substring(((String)localObject1).length() - 10, ((String)localObject1).length() - 10 + 10);
        }
        return new zabp(((String)localObject1).toUpperCase());
      }
      if ((arrayOfDouble[1] < 1.0D) || (arrayOfDouble[1] >= 11.0D)) {
        return zabc.b;
      }
      return a(ze.a(arrayOfDouble[0], 16), (int)arrayOfDouble[1]);
    case 418: 
      return new zabb(arrayOfDouble[0] == (arrayOfDouble.length > 1 ? arrayOfDouble[1] : 0.0D) ? 1.0D : 0.0D);
    case 419: 
      return new zabb(arrayOfDouble[0] >= (arrayOfDouble.length > 1 ? arrayOfDouble[1] : 0.0D) ? 1.0D : 0.0D);
    case 423: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.b;
      }
      if (arrayOfDouble.length < 2) {
        return new zabb(zft.a(arrayOfDouble[0]));
      }
      if (arrayOfDouble[1] < 0.0D) {
        return zabc.b;
      }
      return new zabb(zft.a(arrayOfDouble[0]) - zft.a(arrayOfDouble[1]));
    case 411: 
      if (paramArrayOfzaie.length > 2)
      {
        localObject1 = new String[1];
        localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, (String[])localObject1);
        if (localzabc != null) {
          return localzabc;
        }
        if ((!"i".equals(localObject1[0])) && (!"j".equals(localObject1[0]))) {
          return zabc.f;
        }
        zne localzne = new zne(arrayOfDouble[0], arrayOfDouble[1], localObject1[0]);
        return new zabp(zs.a(localzne));
      }
      localObject1 = new zne(arrayOfDouble[0], arrayOfDouble[1], "i");
      return new zabp(zs.a(localObject1));
    case 219: 
      if ((arrayOfDouble[0] < 1.0D) || (arrayOfDouble[1] < 0.0D)) {
        return zabc.f;
      }
      int j = (int)arrayOfDouble[0] - 1;
      int m = (int)arrayOfDouble[1] - 1;
      if ((j > paramzaca.p.k()) || (m > paramzaca.p.l())) {
        return zabc.f;
      }
      int n = 1;
      int i2 = 1;
      String str = null;
      Object localObject2;
      if (paramArrayOfzaie.length > 2)
      {
        if ((arrayOfDouble[2] < 1.0D) || (arrayOfDouble[2] >= 9.0D))
        {
          if (paramArrayOfzaie[2] != zabg.a) {
            return zabc.f;
          }
        }
        else {
          n = (int)arrayOfDouble[2];
        }
        if (paramArrayOfzaie.length > 3)
        {
          if (paramArrayOfzaie[3] != zabg.a)
          {
            localObject2 = new boolean[1];
            localzabc = zabt.a(paramArrayOfzaie, paramzaca, 3, (boolean[])localObject2);
            if (localzabc != null) {
              return localzabc;
            }
            i2 = localObject2[0];
          }
          if ((paramArrayOfzaie.length > 4) && (paramArrayOfzaie[4] != zabg.a))
          {
            localObject2 = new String[1];
            localzabc = zabt.a(paramArrayOfzaie, paramzaca, 4, (String[])localObject2);
            if (localzabc != null) {
              return localzabc;
            }
            str = localObject2[0];
          }
        }
      }
      if (m < 0)
      {
        if (i2 != 0) {
          return zabc.f;
        }
        localObject2 = new zbap(null, j, 0, j, paramzaca.p.l());
      }
      else
      {
        localObject2 = new zbap(null, j, m, j, m);
      }
      switch (n)
      {
      case 1: 
      case 5: 
        break;
      case 2: 
      case 6: 
        ((zbap)localObject2).b(false);
        break;
      case 3: 
      case 7: 
        ((zbap)localObject2).a(false);
        break;
      case 4: 
      case 8: 
        ((zbap)localObject2).a(false);
        ((zbap)localObject2).b(false);
        break;
      }
      zaah localzaah = paramzaca.i();
      localzaah.r = i2;
      localzaah.d = -1;
      localzaah.e = -1;
      zbpe localzbpe = new zbpe();
      if (str != null)
      {
        if (zabq.a(str, localzaah))
        {
          localzbpe.a('\'');
          localzbpe.a(zw.a(str, "'", "''"));
          localzbpe.a('\'');
        }
        else
        {
          localzbpe.a(str);
        }
        localzbpe.a('!');
      }
      ((zbap)localObject2).a(localzbpe, localzaah);
      return new zabp(zs.a(localzbpe));
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
      d2 = 0.0D;
      double d3 = 0.0D;
      if (arrayOfDouble.length > 3)
      {
        d2 = arrayOfDouble[3];
        if ((arrayOfDouble.length > 4) && (arrayOfDouble[4] != 0.0D)) {
          d3 = 1.0D;
        }
      }
      switch (paramzabe.p().b())
      {
      case 56: 
        return new zabb(zfu.b(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], d2, d3));
      case 57: 
        return new zabb(zfu.c(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], d2, d3));
      case 59: 
        if (arrayOfDouble[1] == 0.0D) {
          return zabc.b;
        }
        return new zabb(zfu.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], d2, d3));
      case 58: 
        return zfu.f(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], d2, d3);
      case 60: 
        double d5 = 0.1D;
        if (arrayOfDouble.length > 5)
        {
          d5 = arrayOfDouble[5];
          if (d5 == 0.0D) {
            d5 = 0.1D;
          }
        }
        return zfu.c(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], d2, d3, d5);
      }
      return null;
    case 144: 
    case 222: 
    case 247: 
      if (arrayOfDouble[2] == 0.0D) {
        return zabc.a;
      }
      if (paramzabe.p().b() == 247)
      {
        if ((arrayOfDouble[3] > arrayOfDouble[2] + 1.0D) || ((arrayOfDouble[3] > arrayOfDouble[2]) && ((arrayOfDouble.length < 5) || (arrayOfDouble[4] == 12.0D)))) {
          return zabc.b;
        }
        if (arrayOfDouble[0] == 0.0D) {
          return zabb.a;
        }
        return new zabb(zfu.d(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], arrayOfDouble.length > 4 ? arrayOfDouble[4] : 12.0D));
      }
      if (paramzabe.p().b() == 144)
      {
        if (arrayOfDouble[3] >= arrayOfDouble[2] + 1.0D) {
          return zabc.b;
        }
        return new zabb(zfu.e(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], arrayOfDouble.length > 4 ? arrayOfDouble[4] : 2.0D));
      }
      if (arrayOfDouble[4] > arrayOfDouble[2] + 1.0D) {
        return zabc.b;
      }
      d2 = 2.0D;
      int i1 = 0;
      if (arrayOfDouble.length > 5)
      {
        d2 = arrayOfDouble[5];
        if (arrayOfDouble.length > 6)
        {
          boolean[] arrayOfBoolean2 = new boolean[1];
          localzabc = zabt.a(paramArrayOfzaie, paramzaca, 6, arrayOfBoolean2);
          if (localzabc != null) {
            return localzabc;
          }
          i1 = arrayOfBoolean2[0];
        }
      }
      return new zabb(zfu.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], arrayOfDouble[4], d2, i1));
    case 270: 
    case 272: 
    case 504: 
      d2 = 0.0D;
      d4 = 1.0D;
      if (arrayOfDouble.length > 3)
      {
        d2 = arrayOfDouble[3];
        if (arrayOfDouble.length > 4) {
          d4 = arrayOfDouble[4];
        }
      }
      if (paramzabe.p().b() == 270) {
        return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], d2, d4, true);
      }
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], d2, d4);
    case 167: 
    case 168: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] < 1.0D) || (arrayOfDouble[2] < arrayOfDouble[1])) {
        return zabc.b;
      }
      d2 = 0.0D;
      d4 = 0.0D;
      if (arrayOfDouble.length > 4)
      {
        d2 = arrayOfDouble[4];
        if ((arrayOfDouble.length > 5) && (arrayOfDouble[5] != 0.0D)) {
          d4 = 1.0D;
        }
      }
      if (paramzabe.p().b() == 168) {
        return zabt.b(zfu.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], d2, d4));
      }
      return zabt.b(zfu.b(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], d2, d4));
    }
    return null;
  }
  
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2)
  {
    String[] arrayOfString = new String[Math.min(paramArrayOfzaie.length, paramInt2)];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfString);
    if (localzabc != null) {
      return localzabc;
    }
    switch (paramInt1)
    {
    case 148: 
      int i = 1;
      if (paramArrayOfzaie.length > 1)
      {
        localObject1 = new boolean[1];
        localzabc = zabt.a(paramArrayOfzaie, paramzaca, 1, (boolean[])localObject1);
        if (localzabc != null) {
          return localzabc;
        }
        i = localObject1[0];
        if ((i == 0) && (arrayOfString[0].indexOf('R') == -1) && (arrayOfString[0].indexOf('C') == -1)) {
          return zabc.c;
        }
      }
      Object localObject1 = a(arrayOfString[0], paramzaca);
      if (localObject1 == null) {
        return zabc.c;
      }
      for (int j = ((String)localObject1).length() - 1; (j > -1) && (((String)localObject1).charAt(j) == ' '); j--) {}
      if (j < 0) {
        return zabc.c;
      }
      localObject1 = ((String)localObject1).substring(0, 0 + (j + 1));
      if (!((String)localObject1).equals(((String)localObject1).trim())) {
        return zabc.c;
      }
      Range localRange = paramzaca.p.e.f((String)localObject1);
      if (localRange != null)
      {
        if (((ListObject)localRange.c).getShowHeaderRow()) {
          return new zabo(96, new zbap(paramzaca.a(localRange.getWorksheet().getIndex(), localRange.getWorksheet().getIndex()), localRange.getFirstRow() + 1, localRange.getFirstColumn(), localRange.getFirstRow() + localRange.getRowCount() - 2, localRange.getFirstColumn() + localRange.getColumnCount() - 1));
        }
        return new zabo(96, new zbap(paramzaca.a(localRange.getWorksheet().getIndex(), localRange.getWorksheet().getIndex()), localRange.getFirstRow(), localRange.getFirstColumn(), localRange.getFirstRow() + localRange.getRowCount() - 1, localRange.getFirstColumn() + localRange.getColumnCount() - 1));
      }
      if (((String)localObject1).endsWith("]"))
      {
        localObject2 = zbvl.a(paramzaca.p.e, paramzaca.n, paramzaca.d, paramzaca.e, (String)localObject1, false);
        return new zabo(96, new zbap(paramzaca.p.e.r().b(localObject2[0]), localObject2[1], localObject2[2], localObject2[3], localObject2[4]));
      }
      Object localObject2 = null;
      if (((String)localObject1).indexOf('!') != -1)
      {
        localObject2 = paramzaca.p.e.getNames().get((String)localObject1);
      }
      else
      {
        int k = paramzaca.p.e.getNames().a((String)localObject1, paramzaca.n, true);
        if (k >= 0) {
          localObject2 = paramzaca.p.e.getNames().get(k);
        }
      }
      if ((localObject2 != null) && (((Name)localObject2).isVisible()) && (!((Name)localObject2).o())) {
        return zabt.a(new zabf(32, (Name)localObject2, -1), paramzaca);
      }
      zaie localzaie = paramzaca.a("=" + (String)localObject1, 32, i);
      if (localzaie.b() == 9)
      {
        zabo localzabo = (zabo)localzaie;
        if ((localzabo.o().a() == null) || ((localzabo.o().a().b & 0xFFFF) != 65534)) {
          return localzaie;
        }
      }
      return zabc.c;
    case 359: 
      if (arrayOfString.length > 1) {
        return new zabp(arrayOfString[1]);
      }
      return new zabp(arrayOfString[0]);
    }
    return null;
  }
  
  private static String a(String paramString, zaca paramzaca)
  {
    if (paramString.length() < 2) {
      return paramString;
    }
    int i;
    if (paramString.charAt(0) == '[') {
      i = 1;
    } else if ((paramString.charAt(0) == '\'') && (paramString.charAt(1) == '[')) {
      i = 2;
    } else {
      return paramString;
    }
    int j = paramString.indexOf(']');
    if (j > 0)
    {
      String str1 = paramString.substring(i, i + (j - i));
      String str2 = paramzaca.p.d.getFileName();
      if (str2.length() == str1.length())
      {
        if (zy.a(str2, str1))
        {
          if (i > 1) {
            return "'" + paramString.substring(j + 1);
          }
          return paramString.substring(j + 1);
        }
      }
      else if ((str2.length() > str1.length()) && (str2.replace('\\', '/').toUpperCase().endsWith(str1.toUpperCase())))
      {
        if (i > 1) {
          return "'" + paramString.substring(j + 1);
        }
        return paramString.substring(j + 1);
      }
    }
    return null;
  }
  
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3, int paramInt4)
  {
    String[] arrayOfString = new String[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfString);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble = null;
    if (paramArrayOfzaie.length > paramInt2)
    {
      arrayOfDouble = new double[Math.min(paramArrayOfzaie.length - paramInt2, paramInt3)];
      localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfDouble, paramInt4);
      if (localzabc != null) {
        return localzabc;
      }
    }
    String str1;
    int j;
    int k;
    switch (paramInt1)
    {
    case 115: 
    case 116: 
    case 208: 
    case 209: 
      int i = 1;
      if (arrayOfDouble != null)
      {
        if (arrayOfDouble[0] < 0.0D) {
          return zabc.f;
        }
        i = (int)arrayOfDouble[0];
        if (i == 0) {
          return new zabp("");
        }
      }
      if (!paramzaca.p.r) {
        if (paramInt1 == 208) {
          paramInt1 = 115;
        } else if (paramInt1 == 209) {
          paramInt1 = 116;
        }
      }
      switch (paramInt1)
      {
      case 208: 
        return new zabp(zgd.a(arrayOfString[0], 1, i));
      case 209: 
        return new zabp(zgd.a(arrayOfString[0], i));
      }
      if (i >= arrayOfString[0].length()) {
        return new zabp(arrayOfString[0]);
      }
      if (paramInt1 == 115) {
        return new zabp(arrayOfString[0].substring(0, 0 + i));
      }
      return new zabp(arrayOfString[0].substring(arrayOfString[0].length() - i));
    case 394: 
      str1 = zft.a(arrayOfString[0]);
      if (str1 == null) {
        return zabc.b;
      }
      return a(str1, 2, 8, arrayOfDouble);
    case 395: 
      str1 = zft.a(arrayOfString[0]);
      if (str1 == null) {
        return zabc.b;
      }
      return a(str1, 2, 16, arrayOfDouble);
    case 390: 
      str1 = zft.b(arrayOfString[0]);
      if (str1 == null) {
        return zabc.b;
      }
      if (str1.length() > 3) {
        if (str1.length() == 10)
        {
          if (!str1.startsWith("7777777")) {
            return zabc.b;
          }
        }
        else {
          return zabc.b;
        }
      }
      return a(arrayOfString[0], 8, 2, arrayOfDouble);
    case 391: 
      str1 = zft.b(arrayOfString[0]);
      if (str1 == null) {
        return zabc.b;
      }
      return a(str1, 8, 16, arrayOfDouble);
    case 384: 
      str1 = zft.c(arrayOfString[0]);
      if (str1 == null) {
        return zabc.b;
      }
      switch (str1.length())
      {
      case 1: 
      case 2: 
        break;
      case 3: 
        if (str1.charAt(0) > '1') {
          return zabc.b;
        }
        break;
      case 10: 
        if ((!str1.startsWith("FFFFFFF")) || ((str1.charAt(7) != 'F') && (str1.charAt(7) != 'E'))) {
          return zabc.b;
        }
        break;
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        return zabc.b;
      }
      return a(arrayOfString[0], 16, 2, arrayOfDouble);
    case 386: 
      str1 = zft.c(arrayOfString[0]);
      if (str1 == null) {
        return zabc.b;
      }
      switch (str1.length())
      {
      case 8: 
        if (str1.charAt(0) > '1') {
          return zabc.b;
        }
        break;
      case 9: 
        return zabc.b;
      case 10: 
        if ((!str1.startsWith("FF")) || ((str1.charAt(2) != 'F') && (str1.charAt(2) != 'E'))) {
          return zabc.b;
        }
        break;
      }
      return a(arrayOfString[0], 16, 8, arrayOfDouble);
    case 82: 
    case 206: 
      if ("".equals(arrayOfString[1])) {
        return zabc.f;
      }
      j = 1;
      if (arrayOfDouble != null)
      {
        if (arrayOfDouble[0] < 1.0D) {
          return zabc.f;
        }
        j = (int)arrayOfDouble[0];
      }
      if ((paramzaca.p.r) && (paramInt1 == 206)) {
        return zgd.b(arrayOfString[0].toUpperCase(), arrayOfString[1].toUpperCase(), j);
      }
      return zgd.a(arrayOfString[0], arrayOfString[1], j - 1);
    case 124: 
    case 205: 
      j = 1;
      if (arrayOfDouble != null)
      {
        if (arrayOfDouble[0] < 1.0D) {
          return zabc.f;
        }
        j = (int)arrayOfDouble[0];
      }
      if ((paramzaca.p.r) && (paramInt1 == 205)) {
        return zgd.b(arrayOfString[0], arrayOfString[1], j);
      }
      if ("".equals(arrayOfString[0]))
      {
        if (j <= arrayOfString[1].length() + 1) {
          return new zabb(j);
        }
        return zabc.f;
      }
      if (arrayOfString[1].length() < j) {
        return zabc.f;
      }
      k = arrayOfString[1].indexOf(arrayOfString[0], j - 1);
      if (k < 0) {
        return zabc.f;
      }
      return new zabb(k + 1.0D);
    case 120: 
      if (arrayOfDouble == null)
      {
        if ("".equals(arrayOfString[1])) {
          return new zabp(arrayOfString[0]);
        }
        return new zabp(zw.a(arrayOfString[0], arrayOfString[1], arrayOfString[2]));
      }
      j = (int)arrayOfDouble[0];
      if ((j < 1) || ((j == 1) && (paramArrayOfzaie[3].e(paramzaca).b() == 1))) {
        return zabc.f;
      }
      if ("".equals(arrayOfString[1])) {
        return new zabp(arrayOfString[0]);
      }
      k = -1;
      String str2 = arrayOfString[0];
      String str3 = arrayOfString[1];
      for (int m = 0; m < j; m++)
      {
        k = str2.indexOf(str3, k + 1);
        if (k < 0) {
          return new zabp(str2);
        }
      }
      return new zabp(str2.substring(0, 0 + k) + arrayOfString[2] + str2.substring(k + str3.length()));
    }
    return null;
  }
  
  public static zaie b(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3, int paramInt4)
  {
    DateTime[] arrayOfDateTime = new DateTime[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDateTime, paramInt4);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble = null;
    if (paramArrayOfzaie.length > paramInt2)
    {
      arrayOfDouble = new double[Math.min(paramArrayOfzaie.length - paramInt2, paramInt3)];
      localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfDouble, paramInt4);
      if (localzabc != null) {
        return localzabc;
      }
    }
    int j;
    switch (paramInt1)
    {
    case 452: 
    case 453: 
    case 454: 
    case 455: 
    case 456: 
    case 457: 
      if (zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) {
        switch ((int)arrayOfDouble[0])
        {
        case 1: 
        case 2: 
        case 4: 
          int i = 0;
          if (arrayOfDouble.length > 1)
          {
            if ((arrayOfDouble[1] < 0.0D) || (arrayOfDouble[1] >= 5.0D)) {
              return zabc.b;
            }
            i = (int)arrayOfDouble[1];
          }
          switch (paramInt1)
          {
          case 452: 
            return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], (int)arrayOfDouble[0], i));
          case 453: 
            return new zabb(zfu.b(arrayOfDateTime[0], arrayOfDateTime[1], (int)arrayOfDouble[0], i));
          case 454: 
            return new zabb(zfu.c(arrayOfDateTime[0], arrayOfDateTime[1], (int)arrayOfDouble[0], i));
          case 456: 
            return new zabb(zfu.f(arrayOfDateTime[0], arrayOfDateTime[1], (int)arrayOfDouble[0], i));
          case 455: 
            return zabt.a(zfu.d(arrayOfDateTime[0], arrayOfDateTime[1], (int)arrayOfDouble[0], i), paramzaca);
          case 457: 
            return zabt.a(zfu.e(arrayOfDateTime[0], arrayOfDateTime[1], (int)arrayOfDouble[0], i), paramzaca);
          }
          break;
        }
      }
      return zabc.b;
    case 470: 
      if ((zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] > 0.0D))
      {
        double d = 1000.0D;
        int m = 0;
        if (arrayOfDouble.length > 1)
        {
          if (arrayOfDouble[1] <= 0.0D) {
            return zabc.b;
          }
          d = arrayOfDouble[1];
          if (arrayOfDouble.length > 2)
          {
            if ((arrayOfDouble[2] < 0.0D) || (arrayOfDouble[2] >= 5.0D)) {
              return zabc.b;
            }
            m = (int)arrayOfDouble[2];
          }
        }
        return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], d, m));
      }
      return zabc.b;
    case 433: 
    case 434: 
    case 435: 
    case 436: 
    case 437: 
      if ((zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] > 0.0D) && (arrayOfDouble[1] > 0.0D))
      {
        j = 0;
        if (arrayOfDouble.length > 2)
        {
          if ((arrayOfDouble[2] < 0.0D) || (arrayOfDouble[2] >= 5.0D)) {
            return zabc.b;
          }
          j = (int)arrayOfDouble[2];
        }
        switch (paramInt1)
        {
        case 435: 
          return new zabb(zfu.b(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], j));
        case 433: 
          return new zabb(zfu.c(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], j));
        case 436: 
          return new zabb(zfu.d(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], j));
        case 434: 
          return new zabb(zfu.e(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], j));
        case 437: 
          return new zabb(zfu.f(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], j));
        }
      }
      return zabc.b;
    case 458: 
    case 459: 
      if ((zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] >= 0.0D)) {
        switch ((int)arrayOfDouble[2])
        {
        case 1: 
        case 2: 
        case 4: 
          j = 0;
          if (arrayOfDouble.length > 3)
          {
            if ((arrayOfDouble[3] < 0.0D) || (arrayOfDouble[3] >= 5.0D)) {
              return zabc.b;
            }
            j = (int)arrayOfDouble[3];
          }
          return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], (int)arrayOfDouble[2], j, paramInt1 == 459));
        }
      }
      return zabc.b;
    case 441: 
      if ((zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] >= 0.0D) && (arrayOfDouble[2] > 0.0D)) {
        switch ((int)arrayOfDouble[3])
        {
        case 1: 
        case 2: 
        case 4: 
          j = 0;
          if (arrayOfDouble.length > 4)
          {
            if ((arrayOfDouble[4] < 0.0D) || (arrayOfDouble[4] >= 5.0D)) {
              return zabc.b;
            }
            j = (int)arrayOfDouble[4];
          }
          return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], (int)arrayOfDouble[2], (int)arrayOfDouble[3], j));
        }
      }
      return zabc.b;
    case 442: 
      if ((zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] > 0.0D) && (arrayOfDouble[2] > 0.0D)) {
        switch ((int)arrayOfDouble[3])
        {
        case 1: 
        case 2: 
        case 4: 
          j = 0;
          if (arrayOfDouble.length > 4)
          {
            if ((arrayOfDouble[4] < 0.0D) || (arrayOfDouble[4] >= 5.0D)) {
              return zabc.b;
            }
            j = (int)arrayOfDouble[4];
          }
          return zfu.b(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0], arrayOfDouble[1], (int)arrayOfDouble[2], (int)arrayOfDouble[3], j);
        }
      }
      return zabc.b;
    case 431: 
      if ((zk.d(arrayOfDateTime[2], arrayOfDateTime[0])) && (zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] >= 0.0D))
      {
        j = 0;
        if (arrayOfDouble.length > 2)
        {
          if ((arrayOfDouble[2] < 0.0D) || (arrayOfDouble[2] >= 5.0D)) {
            return zabc.b;
          }
          j = (int)arrayOfDouble[2];
        }
        return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDateTime[2], arrayOfDouble[0], arrayOfDouble[1], j));
      }
      return zabc.b;
    case 432: 
      if ((zk.d(arrayOfDateTime[2], arrayOfDateTime[0])) && (zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] > 0.0D))
      {
        j = 0;
        if (arrayOfDouble.length > 2)
        {
          if ((arrayOfDouble[2] < 0.0D) || (arrayOfDouble[2] >= 5.0D)) {
            return zabc.b;
          }
          j = (int)arrayOfDouble[2];
        }
        return new zabb(zfu.b(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDateTime[2], arrayOfDouble[0], arrayOfDouble[1], j));
      }
      return zabc.b;
    case 460: 
    case 461: 
      if ((zk.d(arrayOfDateTime[2], arrayOfDateTime[0])) && (zk.d(arrayOfDateTime[0], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] >= 0.0D) && (arrayOfDouble[2] >= 0.0D)) {
        switch ((int)arrayOfDouble[3])
        {
        case 1: 
        case 2: 
        case 4: 
          j = 0;
          if (arrayOfDouble.length > 4)
          {
            if ((arrayOfDouble[4] < 0.0D) || (arrayOfDouble[4] >= 5.0D)) {
              return zabc.b;
            }
            j = (int)arrayOfDouble[4];
          }
          return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDateTime[2], arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], (int)arrayOfDouble[3], j, paramInt1 == 460));
        }
      }
      return zabc.b;
    case 469: 
      if ((zk.d(arrayOfDateTime[0], arrayOfDateTime[2])) && (arrayOfDouble[0] > 0.0D) && (arrayOfDouble[1] > 0.0D)) {
        switch ((int)arrayOfDouble[2])
        {
        case 1: 
        case 2: 
        case 4: 
          j = 0;
          int k = 1;
          if (arrayOfDouble.length > 3)
          {
            if ((arrayOfDouble[3] < 0.0D) || (arrayOfDouble[3] >= 5.0D)) {
              return zabc.b;
            }
            j = (int)arrayOfDouble[3];
            if (paramArrayOfzaie.length > 7)
            {
              boolean[] arrayOfBoolean = new boolean[1];
              localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfBoolean);
              if (localzabc != null) {
                return localzabc;
              }
              k = arrayOfBoolean[0];
            }
          }
          return zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDateTime[2], arrayOfDouble[0], arrayOfDouble[1], (int)arrayOfDouble[2], j);
        }
      }
      return zabc.b;
    case 462: 
      if ((zk.d(arrayOfDateTime[2], arrayOfDateTime[0])) && (zk.d(arrayOfDateTime[0], arrayOfDateTime[3])) && (zk.d(arrayOfDateTime[3], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] >= 0.0D) && (arrayOfDouble[2] >= 0.0D)) {
        switch ((int)arrayOfDouble[3])
        {
        case 1: 
        case 2: 
        case 4: 
          j = 0;
          if (arrayOfDouble.length > 4)
          {
            if ((arrayOfDouble[4] < 0.0D) || (arrayOfDouble[4] >= 5.0D)) {
              return zabc.b;
            }
            j = (int)arrayOfDouble[4];
          }
          return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDateTime[2], arrayOfDateTime[3], arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], (int)arrayOfDouble[3], j));
        }
      }
      return zabc.b;
    case 463: 
      if ((zk.d(arrayOfDateTime[2], arrayOfDateTime[0])) && (zk.d(arrayOfDateTime[0], arrayOfDateTime[3])) && (zk.d(arrayOfDateTime[3], arrayOfDateTime[1])) && (arrayOfDouble[0] >= 0.0D) && (arrayOfDouble[1] > 0.0D) && (arrayOfDouble[2] > 0.0D)) {
        switch ((int)arrayOfDouble[3])
        {
        case 1: 
        case 2: 
        case 4: 
          j = 0;
          if (arrayOfDouble.length > 4)
          {
            if ((arrayOfDouble[4] < 0.0D) || (arrayOfDouble[4] >= 5.0D)) {
              return zabc.b;
            }
            j = (int)arrayOfDouble[4];
          }
          zaqw localzaqw = new zaqw(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDateTime[2], arrayOfDateTime[3], arrayOfDouble[0], arrayOfDouble[1], (int)arrayOfDouble[2], (int)arrayOfDouble[3], j, 0.05D);
          return localzaqw.c(0.05D);
        }
      }
      return zabc.b;
    }
    return null;
  }
  
  public static zaie c(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3, int paramInt4)
  {
    double[] arrayOfDouble1 = new double[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble1, paramInt4);
    if (localzabc != null) {
      return localzabc;
    }
    boolean[] arrayOfBoolean = new boolean[paramInt3];
    localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfBoolean);
    if (localzabc != null) {
      return localzabc;
    }
    switch (paramInt1)
    {
    case 503: 
      double d1 = 0.0D;
      double d2 = 1.0D;
      if (paramArrayOfzaie.length > 4)
      {
        double[] arrayOfDouble2 = new double[paramArrayOfzaie.length - 4];
        localzabc = zabt.a(paramArrayOfzaie, paramzaca, 4, arrayOfDouble2, paramInt4);
        if (localzabc != null) {
          return localzabc;
        }
        d1 = arrayOfDouble2[0];
        if (arrayOfDouble2.length > 1) {
          d2 = arrayOfDouble2[1];
        }
      }
      return zgc.a(arrayOfDouble1[0], arrayOfDouble1[1], arrayOfDouble1[2], d1, d2, arrayOfBoolean[0]);
    }
    return null;
  }
  
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    double[] arrayOfDouble1 = new double[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble1, paramInt5);
    if (localzabc != null) {
      return localzabc;
    }
    DateTime[] arrayOfDateTime = new DateTime[paramInt3];
    localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfDateTime, paramInt5);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble2 = null;
    if (paramArrayOfzaie.length > paramInt2 + paramInt3)
    {
      arrayOfDouble2 = new double[Math.min(paramArrayOfzaie.length - paramInt2 - paramInt3, paramInt4)];
      localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt2 + paramInt3, arrayOfDouble2, paramInt5);
      if (localzabc != null) {
        return localzabc;
      }
    }
    switch (paramInt1)
    {
    case 466: 
      return zfu.a(arrayOfDouble1[0], arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble2[0], arrayOfDouble2[1], arrayOfDouble2[2], arrayOfDouble2.length > 3 ? (int)arrayOfDouble2[3] : 0);
    case 467: 
      return zfu.b(arrayOfDouble1[0], arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble2[0], arrayOfDouble2[1], arrayOfDouble2[2], arrayOfDouble2.length > 3 ? (int)arrayOfDouble2[3] : 0);
    }
    return null;
  }
  
  static zaie a(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    int i = 1;
    int j = 1;
    zaie localzaie = zabt.a(paramArrayOfzaie[0], paramzaca);
    if (localzaie.b() != 9) {
      return localzaie;
    }
    zbap localzbap = ((zabo)localzaie).o();
    i = localzbap.f() - localzbap.b() + 1;
    j = localzbap.h() - localzbap.d() + 1;
    double[] arrayOfDouble = new double[Math.min(paramArrayOfzaie.length - 1, 4)];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 1, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    int k = localzbap.b() + (int)arrayOfDouble[0];
    if ((k < 0) || (k > paramzaca.p.k())) {
      return zabc.c;
    }
    int m = localzbap.d() + (int)arrayOfDouble[1];
    if ((m < 0) || (m > paramzaca.p.l())) {
      return zabc.c;
    }
    if (arrayOfDouble.length > 2)
    {
      if (paramArrayOfzaie[3] != zabg.a)
      {
        if (arrayOfDouble[2] == 0.0D) {
          return zabc.c;
        }
        i = a(arrayOfDouble[2]);
      }
      if ((arrayOfDouble.length > 3) && (paramArrayOfzaie[4] != zabg.a))
      {
        if (arrayOfDouble[3] == 0.0D) {
          return zabc.c;
        }
        j = a(arrayOfDouble[3]);
      }
    }
    int n;
    if (i <= 0)
    {
      n = k;
      k = k + i + 1;
      if ((k < 0) || (k > paramzaca.p.k())) {
        return zabc.c;
      }
    }
    else
    {
      n = k + i - 1;
      if ((n < 0) || (n > paramzaca.p.k())) {
        return zabc.c;
      }
    }
    int i1;
    if (j <= 0)
    {
      i1 = m;
      m = m + j + 1;
      if ((m < 0) || (m > paramzaca.p.l())) {
        return zabc.c;
      }
    }
    else
    {
      i1 = m + j - 1;
      if ((i1 < 0) || (i1 > paramzaca.p.l())) {
        return zabc.c;
      }
    }
    return new zabo(paramInt, new zbap(localzbap.a(), k, m, n, i1));
  }
  
  static zaie b(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    for (zaie localzaie1 = paramArrayOfzaie[0];; localzaie1 = localzaie1.d(paramzaca)) {
      switch (localzaie1.b())
      {
      case 7: 
      case 8: 
        if ((localzaie1.g() == 96) || ((localzaie1.g() != 32) && (localzaie1.a(paramzaca) == 64))) {
          break label106;
        }
      }
    }
    return localzaie1;
    return zabc.f;
    label106:
    double[] arrayOfDouble = new double[Math.min(paramArrayOfzaie.length - 1, 3)];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 1, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    int i = (int)arrayOfDouble[0];
    if (i < 0) {
      return zabc.f;
    }
    int j = -1;
    int k = 1;
    if (arrayOfDouble.length > 1)
    {
      j = (int)arrayOfDouble[1];
      if (j < 0) {
        return zabc.f;
      }
      if (arrayOfDouble.length > 2)
      {
        k = (int)arrayOfDouble[2];
        if (k < 1) {
          return zabc.f;
        }
      }
    }
    for (;;)
    {
      switch (localzaie1.b())
      {
      case 7: 
      case 8: 
        if ((localzaie1.g() == 96) || ((localzaie1.g() != 32) && (localzaie1.a(paramzaca) == 64))) {
          break label509;
        }
        localzaie1 = localzaie1.d(paramzaca);
        break;
      case 5: 
        switch (localzaie1.a())
        {
        case 16: 
          localObject = zabt.a((zabk)localzaie1);
          if (k > localObject.length) {
            return zabc.c;
          }
          localzaie1 = localObject[(k - 1)];
          break;
        case 15: 
        case 17: 
        case 18: 
        case 21: 
          localzaie1 = localzaie1.d(paramzaca);
        }
        break;
      }
    }
    Object localObject = localzaie1.a(paramzaca, false);
    if (((zaiw)localObject).l()) {
      return zabc.f;
    }
    ((zaiw)localObject).b(true);
    localzaie1 = zbam.a((zaiw)localObject);
    ((zaiw)localObject).a(true);
    break label509;
    localObject = ((zabo)localzaie1).o();
    if ((j < 0) && (((zbap)localObject).q() > 1) && (((zbap)localObject).p() > 1))
    {
      return zabc.c;
      return localzaie1;
      return zabc.f;
    }
    label509:
    if (i == 0)
    {
      if (j <= 0) {
        return localzaie1;
      }
      localObject = new int[] { j - 1 };
      localzaie2 = localzaie1.b((int[])localObject, paramzaca);
      if (j > localObject[0]) {
        return zabc.c;
      }
      return localzaie2;
    }
    if (j <= 0)
    {
      i--;
      localObject = new int[] { i };
      localzaie2 = localzaie1.a((int[])localObject, paramzaca);
      if ((j < 0) && (localObject[0] == 1))
      {
        localObject[0] = i;
        localzaie2 = localzaie1.b((int[])localObject, paramzaca);
        if (i < localObject[0]) {
          return localzaie2;
        }
      }
      if (i < localObject[0]) {
        return localzaie2;
      }
      return zabc.c;
    }
    localObject = new int[] { i - 1, j - 1 };
    zaie localzaie2 = localzaie1.a((int[])localObject, paramzaca, true);
    if ((i > localObject[0]) || (j > localObject[1])) {
      return zabc.c;
    }
    return localzaie2;
  }
  
  public static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca, boolean paramBoolean)
  {
    if ((paramArrayOfzaie == null) || (paramArrayOfzaie.length < 1)) {
      return new zabb((paramBoolean ? paramzaca.d : paramzaca.e) + 1);
    }
    zaie localzaie = zabt.a(paramArrayOfzaie[0], paramzaca);
    if (localzaie.b() == 0) {
      return localzaie;
    }
    zbap localzbap = ((zabo)localzaie).o();
    return new zabb(1.0D + (paramBoolean ? localzbap.b() : localzbap.d()));
  }
  
  public static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    String[] arrayOfString = new String[1];
    Object localObject1 = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfString);
    if (localObject1 != null) {
      return (zaie)localObject1;
    }
    arrayOfString[0] = arrayOfString[0].toUpperCase();
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject6;
    switch (a.a(arrayOfString[0]))
    {
    case 0: 
      if (paramArrayOfzaie.length < 2) {
        return new zabb(paramzaca.e + 1.0D);
      }
      localObject1 = zabt.a(paramArrayOfzaie[1], paramzaca);
      if (((zaie)localObject1).b() != 9) {
        return (zaie)localObject1;
      }
      localObject2 = ((zabo)localObject1).o();
      if ((((zbap)localObject2).a() != null) && ((((zbap)localObject2).a().a & 0xFFFF) != paramzaca.p.f)) {
        return zabc.g;
      }
      return new zabb(((zbap)localObject2).d() + 1.0D);
    case 1: 
      if (paramArrayOfzaie.length < 2) {
        return new zabb(paramzaca.d + 1.0D);
      }
      localObject1 = zabt.a(paramArrayOfzaie[1], paramzaca);
      if (((zaie)localObject1).b() != 9) {
        return (zaie)localObject1;
      }
      localObject2 = ((zabo)localObject1).o();
      if ((((zbap)localObject2).a() != null) && ((((zbap)localObject2).a().a & 0xFFFF) != paramzaca.p.f)) {
        return zabc.g;
      }
      return new zabb(((zbap)localObject2).b() + 1.0D);
    case 2: 
      if (paramArrayOfzaie.length < 2) {
        return new zabp(CellsHelper.a(paramzaca.d, paramzaca.e, true, true));
      }
      localObject1 = zabt.a(paramArrayOfzaie[1], paramzaca);
      if (((zaie)localObject1).b() != 9) {
        return (zaie)localObject1;
      }
      localObject2 = ((zabo)localObject1).o();
      localObject3 = ((zbap)localObject2).a();
      if (localObject3 != null)
      {
        if ((((zwp)localObject3).a & 0xFFFF) != paramzaca.p.f) {
          return zabc.g;
        }
        if (((zwp)localObject3).b != ((zwp)localObject3).c) {
          return zabc.f;
        }
        if ((((zwp)localObject3).b & 0xFFFF) == paramzaca.n)
        {
          localObject3 = null;
        }
        else if (((((zwp)localObject3).b & 0xFFFF) != paramzaca.n) && ((((zwp)localObject3).b & 0xFFFF) < paramzaca.p.e.getCount()))
        {
          localObject4 = paramzaca.p.e.get(((zwp)localObject3).b & 0xFFFF).getName();
          StringBuilder localStringBuilder = new StringBuilder();
          boolean bool = zabq.a((String)localObject4, paramzaca.i());
          if (bool) {
            localStringBuilder.append('\'');
          }
          localObject6 = paramzaca.p.d.getFileName();
          if (!zw.b((String)localObject6))
          {
            localObject6 = ((String)localObject6).replace('/', '\\');
            localStringBuilder.append('[');
            localStringBuilder.append(((String)localObject6).substring(((String)localObject6).lastIndexOf('\\') + 1));
            localStringBuilder.append(']');
          }
          localStringBuilder.append((String)localObject4);
          if (bool) {
            localStringBuilder.append('\'');
          }
          localStringBuilder.append("!$");
          CellsHelper.a(localStringBuilder, ((zbap)localObject2).d());
          localStringBuilder.append('$');
          localStringBuilder.append(((zbap)localObject2).b() + 1);
          return new zabp(zs.a(localStringBuilder));
        }
      }
      localObject2 = new zbap((zwp)localObject3, ((zbap)localObject2).b(), ((zbap)localObject2).d(), ((zbap)localObject2).b(), ((zbap)localObject2).d());
      localObject4 = new zbpe(16);
      ((zbap)localObject2).a((zahh)localObject4, paramzaca.i());
      return new zabp(((zbpe)localObject4).c());
    case 3: 
      localObject2 = paramzaca.c.getName();
      localObject3 = new StringBuilder();
      if (paramArrayOfzaie.length > 1)
      {
        localObject1 = zabt.a(paramArrayOfzaie[1], paramzaca);
        if (((zaie)localObject1).b() != 9) {
          return (zaie)localObject1;
        }
        localObject4 = ((zabo)localObject1).o().a();
        if (localObject4 != null)
        {
          if ((((zwp)localObject4).a & 0xFFFF) != paramzaca.p.f) {
            return zabc.g;
          }
          if ((((zwp)localObject4).b & 0xFFFF) < paramzaca.p.e.getCount()) {
            localObject2 = paramzaca.p.e.get(((zwp)localObject4).b & 0xFFFF).getName();
          }
        }
      }
      localObject4 = paramzaca.p.d.getFileName();
      if ((localObject4 == null) || ("".equals(localObject4))) {
        return zabp.a;
      }
      localObject4 = ((String)localObject4).replace('/', '\\');
      int k = ((String)localObject4).lastIndexOf('\\');
      ((StringBuilder)localObject3).append(((String)localObject4).substring(0, 0 + (k + 1)));
      ((StringBuilder)localObject3).append('[');
      ((StringBuilder)localObject3).append(((String)localObject4).substring(k + 1));
      ((StringBuilder)localObject3).append(']');
      ((StringBuilder)localObject3).append((String)localObject2);
      return new zabp(zs.a(localObject3));
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      localObject2 = null;
      int i = paramzaca.d;
      int j = paramzaca.e;
      Object localObject5;
      if (paramArrayOfzaie.length > 1)
      {
        localObject1 = zabt.a(paramArrayOfzaie[1], paramzaca);
        if (((zaie)localObject1).b() != 9) {
          return (zaie)localObject1;
        }
        localObject5 = ((zabo)localObject1).o();
        i = ((zbap)localObject5).b();
        j = ((zbap)localObject5).d();
        if (((zbap)localObject5).a() != null)
        {
          zwp localzwp = ((zbap)localObject5).a();
          localObject6 = paramzaca.p.e;
          if ((localzwp.a & 0xFFFF) != ((WorksheetCollection)localObject6).v()) {
            return zabc.g;
          }
          if ((localzwp.b & 0xFFFF) < ((WorksheetCollection)localObject6).getCount()) {
            localObject2 = ((WorksheetCollection)localObject6).get(localzwp.b & 0xFFFF).getCells();
          } else {
            return zabc.c;
          }
        }
      }
      if (localObject2 == null) {
        localObject2 = paramzaca.c.getCells();
      }
      switch (a.a(arrayOfString[0]))
      {
      case 4: 
        return new zabb(zr.a(((Cells)localObject2).getColumnWidth(j)));
      case 5: 
        return new zabp(zfq.c((Cells)localObject2, i, j, paramzaca));
      case 10: 
        return new zabb(zfq.b((Cells)localObject2, i, j, paramzaca));
      case 11: 
        return new zabb(zfq.d((Cells)localObject2, i, j, paramzaca));
      case 7: 
        return new zabb(zfq.e((Cells)localObject2, i, j, paramzaca));
      case 6: 
        return new zabp(zfq.a((Cells)localObject2, i, j, paramzaca));
      case 8: 
        localObject5 = zabt.a((Cells)localObject2, i, j, true, paramzaca);
        if (localObject5 == null) {
          return zabb.a;
        }
        return (zaie)localObject5;
      case 9: 
        return new zabp(zfq.f((Cells)localObject2, i, j, paramzaca));
      }
      break;
    }
    if (paramArrayOfzaie.length > 1)
    {
      localObject1 = zabt.a(paramArrayOfzaie[1], paramzaca);
      if (((zaie)localObject1).b() != 9) {
        return (zaie)localObject1;
      }
      localObject2 = ((zabo)localObject1).o();
      if ((((zbap)localObject2).a() != null) && ((((zbap)localObject2).a().a & 0xFFFF) != paramzaca.p.f)) {
        return zabc.g;
      }
    }
    return zabc.f;
  }
  
  static zaie b(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zaie localzaie = paramArrayOfzaie[0];
    if (!localzaie.i())
    {
      zabt.a(localzaie, paramArrayOfzaie[1]);
      if (paramArrayOfzaie.length > 2) {
        zabt.a(localzaie, paramArrayOfzaie[2]);
      }
    }
    localzaie = localzaie.e(paramzaca);
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
      return paramArrayOfzaie[1];
    }
    if (paramArrayOfzaie.length > 2) {
      return paramArrayOfzaie[2];
    }
    return zaba.b;
  }
  
  private static zaie a(String paramString, int paramInt)
  {
    if (paramString.length() < 10)
    {
      if (paramString.length() > paramInt) {
        return zabc.b;
      }
      paramString = zw.a(paramString, paramInt, '0');
    }
    else if (paramString.length() > 10)
    {
      paramString = paramString.substring(paramString.length() - 10, paramString.length() - 10 + 10);
    }
    return new zabp(paramString);
  }
  
  private static zaie a(String paramString, int paramInt1, int paramInt2, double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null)
    {
      String str = zft.a(paramString, paramInt1, paramInt2);
      if (str.length() > 10) {
        str = str.substring(str.length() - 10, str.length() - 10 + 10);
      }
      return new zabp(str);
    }
    if ((paramArrayOfDouble[0] < 1.0D) || (paramArrayOfDouble[0] >= 11.0D)) {
      return zabc.b;
    }
    return a(zft.a(paramString, paramInt1, paramInt2), (int)paramArrayOfDouble[0]);
  }
  
  private static String a(double paramDouble, int paramInt, zaca paramzaca)
  {
    int i = 0;
    if (paramDouble < 0.0D)
    {
      i = 1;
      paramDouble = Math.abs(paramDouble);
    }
    if (paramInt > 0)
    {
      str = "$#,##0." + zw.a('0', paramInt);
    }
    else
    {
      if (paramInt < 0) {
        paramDouble = (int)(paramDouble / Math.pow(10.0D, -paramInt) + 0.5D) * Math.pow(10.0D, -paramInt);
      }
      str = "$#,##0";
    }
    String str = paramzaca.p.a(str, 14, Double.valueOf(paramDouble)).h();
    if ((i != 0) && (paramDouble > 0.0D)) {
      return "(" + str + ")";
    }
    return str;
  }
  
  private static String a(double paramDouble, int paramInt, boolean paramBoolean, zaca paramzaca)
  {
    String str;
    if (paramBoolean) {
      str = "0";
    } else {
      str = "#,##0";
    }
    if (paramInt > 0)
    {
      str = str + "." + zw.a('0', paramInt);
    }
    else if (paramInt < 0)
    {
      double d = Math.pow(10.0D, paramInt);
      if (paramDouble > 0.0D) {
        paramDouble = (int)(paramDouble * d + 0.5D) / d;
      } else {
        paramDouble = (int)(paramDouble * d - 0.5D) / d;
      }
    }
    return paramzaca.p.a(str, 14, Double.valueOf(paramDouble)).h();
  }
  
  private static int a(double paramDouble)
  {
    if (paramDouble >= 1.0D) {
      return (int)paramDouble;
    }
    if (paramDouble > 0.0D) {
      return -2;
    }
    if (paramDouble > -1.0D) {
      return 2;
    }
    if (paramDouble > -2.0D) {
      return 1;
    }
    return (int)paramDouble;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */