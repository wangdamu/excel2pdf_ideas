package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.a.c.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zt;

class zfw
{
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3)
  {
    double[] arrayOfDouble = new double[paramInt3];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, paramInt2);
    if (localzabc != null) {
      return localzabc;
    }
    double d1;
    int i1;
    int i;
    double d2;
    double d5;
    int j;
    int n;
    double d3;
    int k;
    double d4;
    switch (paramInt1)
    {
    case 24: 
      return new zabb(Math.abs(arrayOfDouble[0]));
    case 279: 
      d1 = arrayOfDouble[0];
      if (Math.abs(d1 % 2.0D) < 1.0E-14D) {
        return new zabb(d1);
      }
      i1 = d1 < 0.0D ? 1 : 0;
      d1 = Math.abs(d1);
      d1 += 1.0D;
      d1 = Math.floor(d1);
      if (d1 % 2.0D < 1.0E-14D) {
        return new zabb(i1 != 0 ? -d1 : d1);
      }
      return new zabb(i1 != 0 ? -d1 - 1.0D : d1 + 1.0D);
    case 298: 
      d1 = arrayOfDouble[0];
      i1 = d1 < 0.0D ? 1 : 0;
      d1 = Math.ceil(Math.abs(d1));
      if (d1 % 2.0D <= 1.0E-14D) {
        return new zabb(i1 != 0 ? -d1 - 1.0D : d1 + 1.0D);
      }
      return new zabb(i1 != 0 ? -d1 : d1);
    case 184: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.b;
      }
      return new zabb(zbpi.b((int)arrayOfDouble[0]));
    case 25: 
      return new zabb(Math.floor(arrayOfDouble[0]));
    case 420: 
      return 0 == (int)arrayOfDouble[0] % 2 ? zaba.a : zaba.b;
    case 421: 
      return 0 != (int)arrayOfDouble[0] % 2 ? zaba.a : zaba.b;
    case 99: 
      if ((arrayOfDouble[0] > 1.0D) || (arrayOfDouble[0] < -1.0D)) {
        return zabc.b;
      }
      return new zabb(Math.acos(arrayOfDouble[0]));
    case 233: 
      if (arrayOfDouble[0] < 1.0D) {
        return zabc.b;
      }
      return new zabb(Math.log(arrayOfDouble[0] + Math.sqrt(arrayOfDouble[0] * arrayOfDouble[0] - 1.0D)));
    case 98: 
      if ((arrayOfDouble[0] > 1.0D) || (arrayOfDouble[0] < -1.0D)) {
        return zabc.b;
      }
      return new zabb(Math.asin(arrayOfDouble[0]));
    case 232: 
      return new zabb(Math.log(arrayOfDouble[0] + Math.sqrt(arrayOfDouble[0] * arrayOfDouble[0] + 1.0D)));
    case 18: 
      return new zabb(Math.atan(arrayOfDouble[0]));
    case 234: 
    case 283: 
      if ((arrayOfDouble[0] >= 1.0D) || (arrayOfDouble[0] <= -1.0D)) {
        return zabc.b;
      }
      return new zabb(0.5D * Math.log((1.0D + arrayOfDouble[0]) / (1.0D - arrayOfDouble[0])));
    case 16: 
      return new zabb(Math.cos(arrayOfDouble[0]));
    case 230: 
      return new zabb(Math.cosh(arrayOfDouble[0]));
    case 21: 
      d1 = Math.exp(arrayOfDouble[0]);
      if (Double.isInfinite(d1)) {
        return zabc.b;
      }
      return new zabb(d1);
    case 271: 
      if (arrayOfDouble[0] <= 0.0D) {
        return zabc.b;
      }
      return new zabb(zacz.a(arrayOfDouble[0]));
    case 22: 
      if (arrayOfDouble[0] <= 0.0D) {
        return zabc.b;
      }
      return new zabb(Math.log(arrayOfDouble[0]));
    case 23: 
      if (arrayOfDouble[0] <= 0.0D) {
        return zabc.b;
      }
      return new zabb(Math.log10(arrayOfDouble[0]));
    case 26: 
      if (arrayOfDouble[0] < 0.0D) {
        return new zabb(-1.0D);
      }
      if (arrayOfDouble[0] > 0.0D) {
        return new zabb(1.0D);
      }
      return new zabb(0.0D);
    case 15: 
      return new zabb(Math.sin(arrayOfDouble[0]));
    case 229: 
      return new zabb(Math.sinh(arrayOfDouble[0]));
    case 17: 
      d1 = Math.tan(arrayOfDouble[0]);
      if (Double.isInfinite(d1)) {
        return zabc.b;
      }
      return new zabb(d1);
    case 231: 
      return new zabb(Math.tanh(arrayOfDouble[0]));
    case 342: 
      return new zabb(arrayOfDouble[0] * 3.141592653589793D / 180.0D);
    case 343: 
      return new zabb(arrayOfDouble[0] * 180.0D / 3.141592653589793D);
    case 284: 
      d1 = Math.exp(arrayOfDouble[0] * 2.0D);
      return new zabb((d1 - 1.0D) / (d1 + 1.0D));
    case 294: 
      return new zabb(zaqs.b(arrayOfDouble[0]));
    case 296: 
    case 502: 
      if ((arrayOfDouble[0] <= 0.0D) || (arrayOfDouble[0] >= 1.0D)) {
        return zabc.b;
      }
      return new zabb(zaqs.a(arrayOfDouble[0]));
    case 111: 
      i = (int)arrayOfDouble[0];
      if ((i < 1) || (i > 65535)) {
        return zabc.f;
      }
      if (paramzaca.p.q == null)
      {
        if (i > 255) {
          return zabc.f;
        }
        return new zabp(Character.toString((char)i));
      }
      byte[] arrayOfByte;
      if (i < 256)
      {
        arrayOfByte = new byte[] { (byte)i };
      }
      else
      {
        if (i < 33025) {
          return zabc.f;
        }
        arrayOfByte = new byte[] { (byte)(i >> 8), (byte)(i & 0xFF) };
      }
      return new zabp(paramzaca.p.q.a(arrayOfByte).substring(0, 1));
    case 100: 
      i = (int)arrayOfDouble[0];
      if ((i < 1) || (i > 255) || (i >= paramArrayOfzaie.length)) {
        return zabc.f;
      }
      return paramArrayOfzaie[i];
    case 20: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.b;
      }
      return new zabb(Math.sqrt(arrayOfDouble[0]));
    case 424: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.b;
      }
      return new zabb(1.0D - zft.a(arrayOfDouble[0]));
    case 415: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.b;
      }
      return new zabb(zbpi.a((int)arrayOfDouble[0]));
    case 416: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.b;
      }
      return new zabb(Math.sqrt(arrayOfDouble[0] * 3.141592653589793D));
    case 97: 
      if ((arrayOfDouble[0] == 0.0D) && (arrayOfDouble[1] == 0.0D)) {
        return zabc.a;
      }
      return new zabb(Math.atan2(arrayOfDouble[1], arrayOfDouble[0]));
    case 39: 
      if (Math.abs(arrayOfDouble[1]) < Double.MIN_VALUE) {
        return zabc.a;
      }
      if (Math.abs(arrayOfDouble[0]) < Double.MIN_VALUE) {
        return new zabb(0.0D);
      }
      d2 = arrayOfDouble[0] % arrayOfDouble[1];
      if ((d2 != 0.0D) && (Math.signum(arrayOfDouble[0]) != Math.signum(arrayOfDouble[1]))) {
        d2 += arrayOfDouble[1];
      }
      return new zabb(d2);
    case 337: 
      if (Math.abs(arrayOfDouble[0]) < Double.MIN_VALUE)
      {
        if (arrayOfDouble[1] < 0.0D) {
          return zabc.a;
        }
        if (arrayOfDouble[1] > 0.0D) {
          return new zabb(0.0D);
        }
        return zabc.b;
      }
      if (arrayOfDouble[0] < 0.0D)
      {
        if (Math.abs(arrayOfDouble[1]) < Double.MIN_VALUE) {
          return zabb.b;
        }
        if (Math.abs(arrayOfDouble[1]) < 1.0D)
        {
          d2 = 1.0D / arrayOfDouble[1];
          if (d2 % 2.0D != 0.0D)
          {
            d5 = -Math.pow(-arrayOfDouble[0], arrayOfDouble[1]);
            if (Double.isNaN(d5)) {
              return zabc.b;
            }
            return new zabb(d5);
          }
          return zabc.b;
        }
      }
      d2 = Math.pow(arrayOfDouble[0], arrayOfDouble[1]);
      if (Double.isNaN(d2)) {
        return zabc.b;
      }
      return new zabb(d2);
    case 464: 
      if (arrayOfDouble[0] > arrayOfDouble[1]) {
        return zabc.b;
      }
      j = (int)Math.ceil(arrayOfDouble[0]);
      n = (int)Math.ceil(arrayOfDouble[1]);
      if (j == n) {
        return new zabb(j);
      }
      return new zabb(zt.a(paramzaca.p.c(), j, (int)arrayOfDouble[1]));
    case 276: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] < 0.0D) || (arrayOfDouble[0] < arrayOfDouble[1])) {
        return zabc.b;
      }
      j = (int)arrayOfDouble[0];
      n = (int)arrayOfDouble[1];
      return new zabb(zbpi.b(j) / (zbpi.b(n) * zbpi.b(j - n)));
    case 299: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] < 0.0D) || (arrayOfDouble[0] < arrayOfDouble[1])) {
        return zabc.b;
      }
      return new zabb(zgc.d(arrayOfDouble[0], arrayOfDouble[1]));
    case 274: 
    case 508: 
      return zgc.c(arrayOfDouble[0], arrayOfDouble[1]);
    case 275: 
    case 510: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1]);
    case 332: 
    case 538: 
      return zgc.b(arrayOfDouble[0], arrayOfDouble[1]);
    case 27: 
      return new zabb(zm.a(zga.b(arrayOfDouble[0]), (int)arrayOfDouble[1]));
    case 213: 
      return new zabb(zm.a(arrayOfDouble[0], (int)arrayOfDouble[1], false));
    case 212: 
      if (arrayOfDouble[1] <= -309.0D) {
        return zabc.b;
      }
      return new zabb(zm.a(arrayOfDouble[0], (int)arrayOfDouble[1], true));
    case 422: 
      if ((arrayOfDouble[0] == 0.0D) || (arrayOfDouble[1] == 0.0D)) {
        return new zabb(0.0D);
      }
      if (Math.signum(arrayOfDouble[0]) != Math.signum(arrayOfDouble[1])) {
        return zabc.b;
      }
      return new zabb(arrayOfDouble[1] * (int)(arrayOfDouble[0] / arrayOfDouble[1] + 0.5D));
    case 285: 
      d3 = arrayOfDouble[0];
      d5 = arrayOfDouble[1];
      if (d3 == 0.0D) {
        return zabb.a;
      }
      if (d5 == 0.0D) {
        return zabc.a;
      }
      if (d3 < 0.0D)
      {
        if (d5 > 0.0D) {
          return zabc.b;
        }
      }
      else if (d5 < 0.0D) {
        return zabc.b;
      }
      if ((d5 >= -1.0D) && (d5 <= 1.0D)) {
        return new zabb((int)(d3 * (1.0D / d5)) * d5);
      }
      return new zabb(arrayOfDouble[1] * (int)(arrayOfDouble[0] / arrayOfDouble[1]));
    case 288: 
      d3 = arrayOfDouble[0];
      d5 = arrayOfDouble[1];
      if ((d3 == 0.0D) || (d5 == 0.0D)) {
        return zabb.a;
      }
      if ((d3 > 0.0D) && (d5 < 0.0D)) {
        return zabc.b;
      }
      return new zabb(Math.ceil(zga.c(d3) / d5) * d5);
    case 443: 
      if (arrayOfDouble[1] < 0.0D) {
        return zabc.b;
      }
      k = (int)arrayOfDouble[1];
      if (k == 0) {
        return zabc.a;
      }
      return new zabb((int)arrayOfDouble[0] + arrayOfDouble[0] % 1.0D / k * Math.pow(10.0D, 1.0D + (int)Math.floor(Math.log10(k))));
    case 444: 
      if (arrayOfDouble[1] < 0.0D) {
        return zabc.b;
      }
      k = (int)arrayOfDouble[1];
      if (k == 0) {
        return zabc.a;
      }
      return new zabb((int)arrayOfDouble[0] + arrayOfDouble[0] % 1.0D * k / Math.pow(10.0D, 1.0D + (int)Math.floor(Math.log10(k))));
    case 446: 
      if ((arrayOfDouble[0] <= 0.0D) || (arrayOfDouble[1] < 1.0D)) {
        return zabc.b;
      }
      k = (int)arrayOfDouble[1];
      return new zabb(Math.pow(1.0D + arrayOfDouble[0] / k, k) - 1.0D);
    case 445: 
      if ((arrayOfDouble[0] <= 0.0D) || (arrayOfDouble[1] < 1.0D)) {
        return zabc.b;
      }
      k = (int)arrayOfDouble[1];
      return new zabb((Math.pow(1.0D + arrayOfDouble[0], 1.0D / k) - 1.0D) * k);
    case 428: 
      if (arrayOfDouble[1] < 0.0D) {
        return zabc.b;
      }
      return new zabb(zft.a(arrayOfDouble[0], (int)arrayOfDouble[1]));
    case 425: 
      if (arrayOfDouble[1] < 0.0D) {
        return zabc.b;
      }
      return new zabb(zft.b(arrayOfDouble[0], (int)arrayOfDouble[1]));
    case 427: 
      if (arrayOfDouble[1] < 0.0D) {
        return zabc.b;
      }
      return new zabb(zft.c(arrayOfDouble[0], (int)arrayOfDouble[1]));
    case 426: 
      if (arrayOfDouble[1] < 0.0D) {
        return zabc.b;
      }
      return new zabb(zft.d(arrayOfDouble[0], (int)arrayOfDouble[1]));
    case 417: 
      if (arrayOfDouble[1] == 0.0D) {
        return zabc.a;
      }
      return new zabb((int)(arrayOfDouble[0] / arrayOfDouble[1]));
    case 535: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], 2);
    case 536: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], 1);
    case 278: 
      return zgc.a((int)arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2]);
    case 142: 
    case 297: 
      if (arrayOfDouble[2] == 0.0D) {
        return zabc.a;
      }
      return new zabb((arrayOfDouble[0] - arrayOfDouble[1]) / arrayOfDouble[2]);
    case 281: 
    case 517: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], true);
    case 282: 
    case 519: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2]);
    case 292: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] < 0.0D) || (arrayOfDouble[2] < 0.0D) || (arrayOfDouble[2] > 1.0D)) {
        return zabc.b;
      }
      d4 = 1.0D - arrayOfDouble[2];
      d5 = Math.pow(arrayOfDouble[2], arrayOfDouble[1]);
      for (double d6 = 0.0D; d6 < arrayOfDouble[0]; d6 += 1.0D) {
        d5 *= (d6 + arrayOfDouble[1]) / (d6 + 1.0D) * d4;
      }
      return new zabb(d5);
    case 295: 
    case 501: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[0] > 1.0D) || (arrayOfDouble[2] < 0.0D)) {
        return zabc.b;
      }
      return new zabb(zaqs.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2]));
    case 277: 
    case 512: 
      if ((arrayOfDouble[0] <= 0.0D) || (arrayOfDouble[0] >= 1.0D) || (arrayOfDouble[1] <= 0.0D) || (arrayOfDouble[2] < 1.0D)) {
        return zabc.b;
      }
      return new zabb(zaqs.a(1.0D - arrayOfDouble[0] * 0.5D) * arrayOfDouble[1] / Math.sqrt(arrayOfDouble[2]));
    case 66: 
      d4 = (int)arrayOfDouble[0] + (int)arrayOfDouble[1] / 60.0D + (int)arrayOfDouble[2] / 3600.0D;
      if (d4 < 0.0D) {
        return zabc.b;
      }
      d4 /= 24.0D;
      if (d4 >= 1.0D) {
        d4 -= (int)d4;
      }
      return new zabb(d4);
    case 65: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.b;
      }
      int m = (int)arrayOfDouble[0];
      if (m < 1900) {
        m += 1900;
      }
      try
      {
        DateTime localDateTime = DateTime.a.addYears(m - 1).addMonths((int)arrayOfDouble[1] - 1).addDays((int)arrayOfDouble[2] - 1);
        if (localDateTime.getYear() >= 1900) {
          return zabt.a(localDateTime, paramzaca);
        }
      }
      catch (Exception localException) {}
      return zabc.b;
    case 287: 
    case 522: 
      return zgc.b(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2]);
    case 291: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[0] > 1.0D) || (arrayOfDouble[2] <= 0.0D)) {
        return zabc.b;
      }
      return new zabb(Math.exp(arrayOfDouble[1] + arrayOfDouble[2] * zaqs.a(arrayOfDouble[0])));
    case 290: 
      if ((arrayOfDouble[0] <= 0.0D) || (arrayOfDouble[2] <= 0.0D)) {
        return zabc.b;
      }
      return new zabb(zaqs.b((Math.log(arrayOfDouble[0]) - arrayOfDouble[1]) / arrayOfDouble[2]));
    case 301: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], (int)arrayOfDouble[2]);
    case 289: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3]);
    case 143: 
      if ((arrayOfDouble[3] <= 0.0D) || (arrayOfDouble[2] < arrayOfDouble[3])) {
        return zabc.b;
      }
      return new zabb((arrayOfDouble[0] - arrayOfDouble[1]) * (arrayOfDouble[2] - arrayOfDouble[3] + 1.0D) * 2.0D / (arrayOfDouble[2] * (arrayOfDouble[2] + 1.0D)));
    case 350: 
      if (arrayOfDouble[2] == 0.0D) {
        return zabc.a;
      }
      return new zabb(arrayOfDouble[0] * arrayOfDouble[3] * (arrayOfDouble[1] / arrayOfDouble[2] - 1.0D));
    }
    return null;
  }
  
  public static zaie a(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    for (int i = 0; i < 3; i++) {
      if (paramArrayOfzaie[i].b() == 12) {
        return zabc.g;
      }
    }
    DateTime[] arrayOfDateTime = new DateTime[2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDateTime, 7);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble = new double[1];
    localzabc = zabt.a(paramArrayOfzaie, paramzaca, 2, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    if ((arrayOfDouble[0] <= 0.0D) || (zk.b(arrayOfDateTime[0], arrayOfDateTime[1])) || (arrayOfDateTime[0].getYear() > 9998) || (zk.d(arrayOfDateTime[0].addYears(1), arrayOfDateTime[1]))) {
      return zabc.b;
    }
    switch (paramInt)
    {
    case 438: 
      return new zabb(zfu.a(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0]));
    case 439: 
      return new zabb(zfu.b(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0]));
    case 440: 
      return new zabb(zfu.c(arrayOfDateTime[0], arrayOfDateTime[1], arrayOfDouble[0]));
    }
    return null;
  }
  
  public static zaie b(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    for (int i = 0; i < 6; i++) {
      if (paramArrayOfzaie[i].b() == 12) {
        return zabc.g;
      }
    }
    double[] arrayOfDouble = new double[6];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 1);
    if (localzabc != null) {
      return localzabc;
    }
    if ((arrayOfDouble[0] <= 0.0D) || (arrayOfDouble[1] <= 0.0D) || (arrayOfDouble[2] <= 0.0D) || (arrayOfDouble[3] <= 0.0D) || (arrayOfDouble[3] > arrayOfDouble[4]) || ((arrayOfDouble[5] != 0.0D) && (arrayOfDouble[5] != 1.0D))) {
      return zabc.b;
    }
    double d = 0.0D;
    switch (paramInt)
    {
    case 448: 
      d = zfu.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], (int)arrayOfDouble[3], (int)arrayOfDouble[4], (int)arrayOfDouble[5]);
      break;
    case 447: 
      d = zfu.b(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], (int)arrayOfDouble[3], (int)arrayOfDouble[4], (int)arrayOfDouble[5]);
      break;
    }
    return zabt.b(d);
  }
  
  public static zaie b(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3)
  {
    double[] arrayOfDouble = new double[paramInt3];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, paramInt2);
    if (localzabc != null) {
      return localzabc;
    }
    boolean[] arrayOfBoolean = new boolean[1];
    localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt3, arrayOfBoolean);
    if (localzabc != null) {
      return localzabc;
    }
    switch (paramInt1)
    {
    case 500: 
      return new zabb(zaqs.a(arrayOfDouble[0], 0.0D, 1.0D, arrayOfBoolean[0]));
    case 280: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] <= 0.0D)) {
        return zabc.b;
      }
      return new zabb(arrayOfBoolean[0] != 0 ? 1.0D - Math.exp(-arrayOfDouble[1] * arrayOfDouble[0]) : arrayOfDouble[1] * Math.exp(-arrayOfDouble[1] * arrayOfDouble[0]));
    case 300: 
    case 531: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] < 0.0D)) {
        return zabc.b;
      }
      if (arrayOfDouble[1] == 0.0D) {
        return new zabb((arrayOfBoolean[0] != 0) || (arrayOfDouble[0] == 0.0D) ? 1.0D : 0.0D);
      }
      int i = (int)arrayOfDouble[0];
      if (arrayOfBoolean[0] != 0)
      {
        double d2 = 0.0D;
        for (int j = 0; j <= i; j++) {
          d2 += Math.exp(-arrayOfDouble[1]) * Math.pow(arrayOfDouble[1], j) / zgc.d(j, j);
        }
        return new zabb(d2);
      }
      return new zabb(Math.exp(-arrayOfDouble[1]) * Math.pow(arrayOfDouble[1], i) / zgc.d(i, i));
    case 507: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfBoolean[0]);
    case 273: 
    case 505: 
      return zgc.a((int)arrayOfDouble[0], (int)arrayOfDouble[1], arrayOfDouble[2], arrayOfBoolean[0]);
    case 302: 
    case 542: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] <= 0.0D) || (arrayOfDouble[2] <= 0.0D)) {
        return zabc.b;
      }
      return new zabb(zgc.b(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfBoolean[0]));
    case 293: 
    case 499: 
      if (arrayOfDouble[2] <= 0.0D) {
        return zabc.b;
      }
      return new zabb(zaqs.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfBoolean[0]));
    case 286: 
    case 521: 
      return zgc.c(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfBoolean[0]);
    case 516: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfBoolean[0]);
    case 524: 
      if ((arrayOfDouble[0] <= 0.0D) || (arrayOfDouble[2] <= 0.0D)) {
        return zabc.b;
      }
      if (arrayOfBoolean[0] != 0) {
        return new zabb(zaqs.b((Math.log(arrayOfDouble[0]) - arrayOfDouble[1]) / arrayOfDouble[2]));
      }
      return new zabb(zaqs.a(Math.log(arrayOfDouble[0]), arrayOfDouble[1], arrayOfDouble[2], false) / arrayOfDouble[0]);
    case 528: 
      if ((arrayOfDouble[0] < 0.0D) || (arrayOfDouble[1] < 0.0D) || (arrayOfDouble[2] < 0.0D) || (arrayOfDouble[2] > 1.0D)) {
        return zabc.b;
      }
      double d1 = 1.0D - arrayOfDouble[2];
      double d3 = Math.pow(arrayOfDouble[2], arrayOfDouble[1]);
      for (double d4 = 0.0D; d4 < arrayOfDouble[0]; d4 += 1.0D) {
        d3 *= (d4 + arrayOfDouble[1]) / (d4 + 1.0D) * d1;
      }
      return new zabb(d3);
    case 523: 
      return zgc.a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3]);
    }
    return null;
  }
  
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2)
  {
    String[] arrayOfString = new String[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfString);
    if (localzabc != null) {
      return localzabc;
    }
    Object localObject;
    switch (paramInt1)
    {
    case 32: 
      return new zabb(arrayOfString[0].length());
    case 211: 
      if ((paramzaca.p.r) && (paramzaca.p.q != null)) {
        return new zabb(paramzaca.p.q.b(arrayOfString[0]));
      }
      return new zabb(arrayOfString[0].length());
    case 113: 
      return new zabp(arrayOfString[0].toUpperCase());
    case 112: 
      return new zabp(arrayOfString[0].toLowerCase());
    case 118: 
      return new zabp(zgd.b(arrayOfString[0]));
    case 162: 
      return new zabp(zgd.c(arrayOfString[0]));
    case 121: 
      if (arrayOfString[0].length() < 1) {
        return zabc.f;
      }
      if (paramzaca.p.q == null) {
        return new zabb(arrayOfString[0].charAt(0));
      }
      localObject = paramzaca.p.q.a(new char[] { arrayOfString[0].charAt(0) });
      if (localObject.length > 1)
      {
        int i = localObject[0];
        localObject[0] = localObject[1];
        localObject[1] = i;
      }
      return new zabb(localObject.length < 2 ? localObject[0] & 0xFF : zc.e((byte[])localObject, 0) & 0xFFFF);
    case 114: 
      return new zabp(zgd.a(arrayOfString[0]));
    case 393: 
      localObject = arrayOfString[0];
      if (((String)localObject).length() == 0) {
        return zabb.a;
      }
      localObject = zft.a((String)localObject);
      if (localObject == null) {
        return zabc.b;
      }
      return new zabb(zo.a(zft.a((String)localObject, 2, 10)));
    case 392: 
      localObject = arrayOfString[0];
      if (((String)localObject).length() == 0) {
        return zabb.a;
      }
      localObject = zft.b((String)localObject);
      if (localObject == null) {
        return zabc.b;
      }
      return new zabb(zo.a(zft.a((String)localObject, 8, 10)));
    case 385: 
      localObject = arrayOfString[0];
      if (((String)localObject).length() == 0) {
        return zabb.a;
      }
      localObject = zft.c((String)localObject);
      if (localObject == null) {
        return zabc.b;
      }
      return new zabb(zo.a(zft.a((String)localObject, 16, 10)));
    case 117: 
      return arrayOfString[0].equals(arrayOfString[1]) ? zaba.a : zaba.b;
    }
    return null;
  }
  
  public static zaie b(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2)
  {
    zne[] arrayOfzne = new zne[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfzne);
    if (localzabc != null) {
      return localzabc;
    }
    switch (paramInt1)
    {
    case 400: 
      return new zabp(zs.a(arrayOfzne[0].f()));
    case 404: 
      return new zabp(zs.a(arrayOfzne[0].g()));
    case 402: 
      return new zabp(zs.a(arrayOfzne[0].e().c(new zne(zr.a(2.718281828459045D, 2.0D), 0.0D))));
    case 403: 
      return new zabp(zs.a(arrayOfzne[0].e().c(new zne(Math.log10(2.718281828459045D), 0.0D))));
    case 401: 
      return new zabp(zs.a(arrayOfzne[0].e()));
    case 406: 
      return new zabp(zs.a(arrayOfzne[0].i()));
    case 405: 
      return new zabp(zs.a(arrayOfzne[0].h()));
    case 408: 
      return new zabp(zs.a(arrayOfzne[0].k()));
    case 409: 
      return new zabb(arrayOfzne[0].b());
    case 410: 
      return new zabb(arrayOfzne[0].a());
    case 407: 
      return new zabb(arrayOfzne[0].j());
    case 399: 
      return new zabb(arrayOfzne[0].d());
    case 396: 
      return new zabp(zs.a(arrayOfzne[0].b(arrayOfzne[1])));
    case 397: 
      return new zabp(zs.a(arrayOfzne[0].d(arrayOfzne[1])));
    }
    return null;
  }
  
  public static zaie a(int paramInt, zaie paramzaie, zaca paramzaca)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 0: 
      return paramzaie;
    case 2: 
      if (paramzaca.p.h.i().parseObject(((zabp)paramzaie).o()) != null)
      {
        zavo localzavo = paramzaca.p.h.i().a();
        if (localzavo.a(paramzaca.p.h))
        {
          double d;
          if (localzavo.a() == 1) {
            d = paramzaca.b((DateTime)localzavo.d());
          } else {
            d = ((Double)localzavo.d()).doubleValue();
          }
          switch (paramInt)
          {
          case 140: 
            return new zabb((int)d);
          case 141: 
            return new zabb(d - (int)d);
          }
        }
      }
      break;
    }
    return zabc.f;
  }
  
  public static zaie a(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2, int paramInt3, int paramInt4)
  {
    String[] arrayOfString1 = new String[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfString1);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble = new double[paramInt3];
    localzabc = zabt.a(paramArrayOfzaie, paramzaca, paramInt2, arrayOfDouble, paramInt4);
    if (localzabc != null) {
      return localzabc;
    }
    int i;
    int j;
    String[] arrayOfString2;
    switch (paramInt1)
    {
    case 30: 
      if (arrayOfDouble[0] < 0.0D) {
        return zabc.f;
      }
      i = (int)arrayOfDouble[0];
      if (arrayOfString1[0].length() * i > 32767) {
        return zabc.f;
      }
      if (arrayOfString1[0].length() < 1) {
        return new zabp("");
      }
      char[] arrayOfChar1 = new char[arrayOfString1[0].length() * i];
      char[] arrayOfChar2 = arrayOfString1[0].toCharArray();
      for (int m = 0; m < i; m++) {
        System.arraycopy(arrayOfChar2, 0, arrayOfChar1, m * arrayOfChar2.length, arrayOfChar2.length);
      }
      return new zabp(new String(arrayOfChar1));
    case 31: 
      if ((arrayOfDouble[0] < 1.0D) || (arrayOfDouble[1] < 0.0D)) {
        return zabc.f;
      }
      i = (int)arrayOfDouble[0];
      j = (int)arrayOfDouble[1];
      i--;
      if ((j > 0) && (i < arrayOfString1[0].length())) {
        return new zabp(arrayOfString1[0].substring(i, i + Math.min(j, arrayOfString1[0].length() - i)));
      }
      return new zabp("");
    case 210: 
      if ((arrayOfDouble[0] < 1.0D) || (arrayOfDouble[1] < 0.0D)) {
        return zabc.f;
      }
      return new zabp(zgd.a(arrayOfString1[0], (int)arrayOfDouble[0], (int)arrayOfDouble[1]));
    case 119: 
      if ((arrayOfDouble[0] < 1.0D) || (arrayOfDouble[1] < 0.0D)) {
        return zabc.f;
      }
      arrayOfString2 = new String[1];
      localzabc = zabt.a(paramArrayOfzaie, paramzaca, 3, arrayOfString2);
      if (localzabc != null) {
        return localzabc;
      }
      j = (int)arrayOfDouble[0];
      int k = (int)arrayOfDouble[1];
      if (j > arrayOfString1[0].length()) {
        return new zabp(arrayOfString1[0] + arrayOfString2[0]);
      }
      j--;
      if (j + k < arrayOfString1[0].length())
      {
        char[] arrayOfChar3 = arrayOfString1[0].toCharArray();
        char[] arrayOfChar4 = arrayOfString2[0].toCharArray();
        char[] arrayOfChar5 = new char[arrayOfChar3.length - k + arrayOfChar4.length];
        if (j > 0) {
          System.arraycopy(arrayOfChar3, 0, arrayOfChar5, 0, j);
        }
        System.arraycopy(arrayOfChar4, 0, arrayOfChar5, j, arrayOfChar4.length);
        System.arraycopy(arrayOfChar3, j + k, arrayOfChar5, j + arrayOfChar4.length, arrayOfChar3.length - j - k);
        return new zabp(new String(arrayOfChar5));
      }
      return new zabp(arrayOfString1[0].substring(0, 0 + j) + arrayOfString2[0]);
    case 207: 
      if ((arrayOfDouble[0] < 1.0D) || (arrayOfDouble[1] < 0.0D)) {
        return zabc.f;
      }
      arrayOfString2 = new String[1];
      localzabc = zabt.a(paramArrayOfzaie, paramzaca, 3, arrayOfString2);
      if (localzabc != null) {
        return localzabc;
      }
      return new zabp(zgd.a(arrayOfString1[0], (int)arrayOfDouble[0], (int)arrayOfDouble[1], arrayOfString2[0]));
    }
    return null;
  }
  
  public static zaie c(int paramInt1, zaie[] paramArrayOfzaie, zaca paramzaca, int paramInt2)
  {
    boolean[] arrayOfBoolean = new boolean[paramInt2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfBoolean);
    if (localzabc != null) {
      return localzabc;
    }
    return arrayOfBoolean[0] != 0 ? zaba.b : zaba.a;
  }
  
  public static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zne[] arrayOfzne = new zne[1];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfzne);
    if (localzabc != null) {
      return localzabc;
    }
    double[] arrayOfDouble = new double[1];
    localzabc = zabt.a(paramArrayOfzaie, paramzaca, 1, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    if ((arrayOfzne[0].a() == 0.0D) && (arrayOfzne[0].b() == 0.0D) && (arrayOfDouble[0] < 0.0D)) {
      return zabc.b;
    }
    return new zabp(zs.a(arrayOfzne[0].c(arrayOfDouble[0])));
  }
  
  public static zaie a(zaie paramzaie, zaca paramzaca)
  {
    zaie localzaie = paramzaie.d(paramzaca);
    if (localzaie.b() == 0) {
      return localzaie;
    }
    if (localzaie.b() == 9)
    {
      zbap localzbap = ((zabo)localzaie).o();
      Range localRange = localzbap.b(paramzaca);
      if (localRange != null)
      {
        Cell localCell = localRange.getCellOrNull(0, 0);
        if ((localCell != null) && (localCell.isFormula())) {
          return new zabp(localCell.getFormula());
        }
      }
      else
      {
        return zabc.f;
      }
    }
    return zabc.g;
  }
  
  public static zaie a(zaie paramzaie1, zaie paramzaie2, zaca paramzaca)
  {
    Object localObject1 = null;
    int i = 14;
    paramzaie1 = paramzaie1.e(paramzaca);
    switch (paramzaie1.b())
    {
    case 0: 
      return paramzaie1;
    case 1: 
      localObject1 = paramzaie1.c();
      i = 3;
      break;
    case 3: 
      localObject1 = paramzaie1.c();
      break;
    case 2: 
      localObject2 = zabt.a(((zabp)paramzaie1).o(), paramzaca);
      if (localObject2 != null)
      {
        localObject1 = Double.valueOf(((zabb)localObject2).o());
      }
      else
      {
        localObject1 = paramzaie1.c();
        i = 18;
      }
      break;
    default: 
      localObject1 = paramzaie1.c();
      if (localObject1 != null) {
        i = zaoj.a(localObject1.getClass());
      }
      break;
    }
    Object localObject2 = "";
    if (paramzaie2 != null)
    {
      paramzaie2 = paramzaie2.e(paramzaca);
      if (paramzaie2.b() == 0) {
        return paramzaie2;
      }
      if (paramzaie2.b() == 1) {
        return zabc.f;
      }
      paramzaie2 = paramzaie2.i(paramzaca);
      if (paramzaie2 != null) {
        localObject2 = zaac.a(((zabp)paramzaie2).o(), paramzaca.p.h, true);
      }
    }
    if (localObject1 == null) {
      localObject1 = Double.valueOf(0.0D);
    }
    try
    {
      zzz localzzz = paramzaca.p.a((String)localObject2, i, localObject1);
      if (localzzz.e()) {
        return zabc.f;
      }
      return new zabp(localzzz.h());
    }
    catch (Exception localException) {}
    return zabc.f;
  }
  
  public static zaie b(zaie paramzaie, zaca paramzaca)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 0: 
    case 2: 
      return paramzaie;
    }
    return zabp.a;
  }
  
  public static zaie c(zaie paramzaie, zaca paramzaca)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 0: 
    case 3: 
      return paramzaie;
    case 1: 
      return ((zaba)paramzaie).o() ? zabb.b : zabb.a;
    }
    return new zabb(0.0D);
  }
  
  public static zaie d(zaie paramzaie, zaca paramzaca)
  {
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 0: 
    case 3: 
      return paramzaie;
    case 2: 
      zabb localzabb = zabt.a(((zabp)paramzaie).o(), paramzaca);
      if (localzabb != null) {
        return localzabb;
      }
      break;
    case 12: 
      return zabb.a;
    }
    return zabc.f;
  }
  
  public static zaie e(zaie paramzaie, zaca paramzaca)
  {
    if (paramzaie.b() == 6) {
      return new zabb(64.0D);
    }
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 3: 
    case 12: 
      return zabb.b;
    case 2: 
      return new zabb(2.0D);
    case 1: 
      return new zabb(4.0D);
    case 0: 
      return new zabb(16.0D);
    }
    return zabb.a;
  }
  
  public static zaie f(zaie paramzaie, zaca paramzaca)
  {
    paramzaie = paramzaie.e(paramzaca);
    if (paramzaie.b() == 0) {
      return ((zabc)paramzaie).p();
    }
    return zabc.g;
  }
  
  public static zaie a(boolean paramBoolean, zaie paramzaie, zaca paramzaca)
  {
    paramzaie = paramzaie.d(paramzaca);
    switch (paramzaie.b())
    {
    case 9: 
      zbap localzbap = ((zabo)paramzaie).o();
      return new zabb((paramBoolean ? localzbap.f() - localzbap.b() : localzbap.h() - localzbap.d()) + 1.0D);
    case 6: 
      return new zabb(paramBoolean ? ((zaav)paramzaie).o() : ((zaav)paramzaie).p());
    case 3: 
      return new zabb(1.0D);
    case 0: 
      return paramzaie;
    }
    return zabc.f;
  }
  
  public static zaba b(int paramInt, zaie paramzaie, zaca paramzaca)
  {
    if (paramInt == 105)
    {
      paramzaie = paramzaie.d(paramzaca);
      if (paramzaie.b() == 9) {
        return zaba.a;
      }
      return zaba.b;
    }
    paramzaie = paramzaie.e(paramzaca);
    switch (paramInt)
    {
    case 129: 
      return paramzaie.b() == 12 ? zaba.a : zaba.b;
    case 128: 
      return paramzaie.b() == 3 ? zaba.a : zaba.b;
    case 127: 
      return paramzaie.b() == 2 ? zaba.a : zaba.b;
    case 190: 
      return paramzaie.b() != 2 ? zaba.a : zaba.b;
    case 198: 
      return paramzaie.b() == 1 ? zaba.a : zaba.b;
    case 3: 
      return paramzaie.b() == 0 ? zaba.a : zaba.b;
    case 126: 
      return (paramzaie.b() == 0) && (((zabc)paramzaie).o() != zuf.c) ? zaba.a : zaba.b;
    case 2: 
      return (paramzaie.b() == 0) && (((zabc)paramzaie).o() == zuf.c) ? zaba.a : zaba.b;
    }
    return zaba.b;
  }
  
  public static zaie g(zaie paramzaie, zaca paramzaca)
  {
    paramzaie = paramzaie.d(paramzaca);
    switch (paramzaie.b())
    {
    case 0: 
      return paramzaie;
    case 9: 
      return zabb.b;
    case 5: 
      zabh localzabh = (zabh)paramzaie;
      if (localzabh.o()) {
        return g((zabm)localzabh, paramzaca);
      }
      zabk localzabk = (zabk)paramzaie;
      zaie localzaie = g(localzabk.G(), paramzaca);
      if (localzaie.b() == 0) {
        return localzaie;
      }
      double d = ((zabb)localzaie).o();
      localzaie = g(localzabk.G(), paramzaca);
      if (localzaie.b() == 0) {
        return localzaie;
      }
      return new zabb(d + ((zabb)localzaie).o());
    }
    return zabb.a;
  }
  
  public static zaie c(int paramInt, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    double[] arrayOfDouble = new double[2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    double d = arrayOfDouble[0];
    long l1 = d;
    if ((l1 < 0L) || (l1 > 281474976710655L) || (l1 != d)) {
      return zabc.b;
    }
    d = arrayOfDouble[1];
    long l2 = d;
    if ((l2 < 0L) || (l2 > 281474976710655L) || (l2 != d)) {
      return zabc.b;
    }
    arrayOfDouble = null;
    switch (paramInt)
    {
    case 490: 
      return zabt.a(l1 & l2);
    case 491: 
      return zabt.a(l1 | l2);
    case 492: 
      return zabt.a(l1 ^ l2);
    }
    return zabc.e;
  }
  
  public static zaie a(zaie[] paramArrayOfzaie, zaca paramzaca, boolean paramBoolean)
  {
    double[] arrayOfDouble = new double[2];
    zabc localzabc = zabt.a(paramArrayOfzaie, paramzaca, 0, arrayOfDouble, 7);
    if (localzabc != null) {
      return localzabc;
    }
    double d = arrayOfDouble[0];
    long l = d;
    if ((l < 0L) || (l > 281474976710655L) || (l != d)) {
      return zabc.b;
    }
    d = arrayOfDouble[1];
    int i = (int)d;
    if (Math.abs(i) > 53) {
      return zabc.b;
    }
    arrayOfDouble = null;
    if (paramBoolean) {
      return zabt.a(l << i);
    }
    return zabt.a(l >> i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */