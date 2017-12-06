package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Random;

class zabe
  extends zaau
{
  private zacm a;
  private zaie[] b;
  private int c;
  private zabu d;
  
  public zabe(int paramInt, zacm paramzacm)
  {
    this.a = paramzacm;
    this.c = paramInt;
  }
  
  public zabe(int paramInt, zacm paramzacm, zaie[] paramArrayOfzaie)
  {
    this.a = paramzacm;
    this.c = paramInt;
    this.b = paramArrayOfzaie;
  }
  
  private zabe() {}
  
  public zaie m()
  {
    zabe localzabe = new zabe();
    localzabe.a = this.a;
    localzabe.c = this.c;
    if (this.b != null)
    {
      localzabe.b = new zaie[this.b.length];
      for (int i = 0; i < this.b.length; i++) {
        localzabe.b[i] = this.b[i].m();
      }
    }
    if (this.d != null) {
      localzabe.d = this.d.b();
    }
    return localzabe;
  }
  
  public void n()
  {
    if (this.d != null) {
      this.d.c();
    }
  }
  
  public void o()
  {
    this.d = null;
  }
  
  public zacm p()
  {
    return this.a;
  }
  
  public int b()
  {
    return 7;
  }
  
  public Object c()
  {
    return this.a;
  }
  
  public Object b(zaca paramzaca)
  {
    return d(paramzaca).b(paramzaca);
  }
  
  public int g()
  {
    return this.c;
  }
  
  public int a(zaca paramzaca)
  {
    return this.a.c().a();
  }
  
  public void h()
  {
    if (this.b != null)
    {
      Object localObject1;
      if (this.a.b() == 1)
      {
        this.b[0].h();
        localObject1 = this.b[1];
        if ((localObject1 != null) && (((zaie)localObject1).b() != 9)) {
          ((zaie)localObject1).h();
        }
        if (this.b.length > 2)
        {
          localObject1 = this.b[2];
          if ((localObject1 != null) && (((zaie)localObject1).b() != 9)) {
            ((zaie)localObject1).h();
          }
        }
      }
      else
      {
        for (Object localObject2 : this.b) {
          ((zaie)localObject2).h();
        }
      }
    }
    this.c = 96;
  }
  
  public boolean c(zaca paramzaca)
  {
    zaif localzaif = this.a.c();
    if (localzaif.a() == 96) {
      return true;
    }
    if (this.b != null) {
      for (int i = 0; i < this.b.length; i++) {
        if ((localzaif.b(i) == 64) && (this.b[i].c(paramzaca))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    int i = 0;
    switch (this.a.b())
    {
    case 50: 
    case 52: 
    case 63: 
    case 74: 
    case 464: 
      i = 1;
      break;
    case 8: 
    case 9: 
      if (this.b == null) {
        return 1;
      }
      break;
    case 125: 
      if (this.b.length == 1) {
        return 1;
      }
      break;
    }
    zaif localzaif = this.a.c();
    if (this.b != null) {
      for (int j = 0; j < this.b.length; j++)
      {
        i |= this.b[j].b(paramzaca, paramInt == 96 ? paramInt : localzaif.b(j));
        if (i > 1) {
          return i;
        }
      }
    }
    return i;
  }
  
  public int b(zaca paramzaca, boolean paramBoolean)
  {
    if ((this.a.b() == 63) || (this.a.b() == 464)) {
      return 0;
    }
    if (this.b == null) {
      return 0;
    }
    int i = 3;
    zaif localzaif = this.a.c();
    for (int k = 0; k < this.b.length; k++)
    {
      int j = this.b[k].b(paramzaca, localzaif.b(k) != 64);
      i &= j;
      if (i == 0) {
        return i;
      }
    }
    if ((localzaif.a() == 32) && (!paramBoolean))
    {
      if ((this.d != null) && (this.d.a != null)) {
        return i & this.d.a.b(paramzaca, paramBoolean);
      }
      return 0;
    }
    return i;
  }
  
  public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = false;
    switch (this.a.b())
    {
    case 63: 
    case 74: 
    case 221: 
      this.d = null;
      return true;
    case 8: 
    case 9: 
      if (this.b == null)
      {
        this.d = null;
        return true;
      }
      break;
    case 464: 
      bool = true;
      this.d = null;
      break;
    default: 
      if (this.b == null) {
        return false;
      }
      break;
    }
    zaif localzaif = this.a.c();
    for (int i = 0; i < this.b.length; i++) {
      if (this.b[i].a(paramzaca, paramInt1, paramInt2, localzaif.b(i) != 64)) {
        bool = true;
      }
    }
    if (bool)
    {
      if (this.d != null) {
        this.d.a(paramzaca, paramInt1, paramInt2, paramBoolean);
      }
    }
    else if (localzaif.a() == 32) {
      if ((this.d != null) && (this.d.a != null))
      {
        if ((this.a.b() == 148) && (this.b.length > 1) && (this.d.a.b() == 9))
        {
          zaba localzaba = this.b[1].j(paramzaca);
          if ((localzaba == null) || (!localzaba.o()))
          {
            zaie localzaie = this.b[0];
            if ((localzaie.b() != 2) && (localzaie.l() != null) && (localzaie.l().a != null)) {
              localzaie = localzaie.l().a;
            }
            if (localzaie.b() != 2)
            {
              bool = true;
            }
            else
            {
              String str = ((zabp)localzaie).o();
              if (str.indexOf('[') > -1)
              {
                bool = true;
              }
              else
              {
                str = str.toUpperCase();
                if ((str.endsWith("C")) || (str.indexOf("RC") > -1)) {
                  bool = true;
                }
              }
            }
            if ((bool) && (this.d != null)) {
              this.d.a(paramzaca, paramInt1, paramInt2, paramBoolean);
            }
          }
        }
        if ((!bool) && (this.d.a.a(paramzaca, paramInt1, paramInt2, paramBoolean))) {
          bool = true;
        }
      }
      else if (!paramBoolean)
      {
        bool = true;
      }
    }
    return bool;
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    if (this.b == null) {
      return false;
    }
    zaif localzaif = this.a.c();
    for (int i = 0; i < this.b.length; i++) {
      if (this.b[i].c(paramzaca, localzaif.b(i) != 64)) {
        return true;
      }
    }
    if (localzaif.a() == 32)
    {
      if ((this.d != null) && (this.d.a != null)) {
        return this.d.a.c(paramzaca, paramBoolean);
      }
      return true;
    }
    return false;
  }
  
  public boolean k()
  {
    return true;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.d == null) {
      switch (this.a.b())
      {
      case 63: 
      case 74: 
      case 221: 
        return;
      case 8: 
      case 9: 
        if (this.b == null) {
          return;
        }
        this.d = new zabu();
        break;
      case 464: 
        break;
      default: 
        if (this.b == null) {
          return;
        }
        this.d = new zabu();
      }
    }
    if ((paramBoolean) && (this.b != null)) {
      for (zaie localzaie : this.b) {
        localzaie.a(true);
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.a();
    }
    if ((paramBoolean) && (this.b != null)) {
      for (zaie localzaie : this.b) {
        localzaie.b(true);
      }
    }
  }
  
  public zabu l()
  {
    return this.d;
  }
  
  public void a(zabu paramzabu)
  {
    this.d = paramzabu;
  }
  
  public zaie e(zaca paramzaca)
  {
    zaie localzaie = d(paramzaca);
    if ((localzaie != null) && (localzaie != this)) {
      localzaie = localzaie.e(paramzaca);
    }
    return localzaie;
  }
  
  public byte a()
  {
    if (this.a.c().d()) {
      return 33;
    }
    return 34;
  }
  
  public int q()
  {
    return this.b == null ? 0 : this.b.length;
  }
  
  public zaie[] r()
  {
    return this.b;
  }
  
  public void a(zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    if ((paramArrayOfzaie != null) && (paramArrayOfzaie.length < 1)) {
      paramArrayOfzaie = null;
    }
    this.d = null;
    this.b = paramArrayOfzaie;
    if (paramArrayOfzaie != null)
    {
      zaif localzaif = this.a.c();
      if (paramArrayOfzaie.length > localzaif.b()) {
        throw new CellsException(5, "You have entered too many parameters for function " + this.a.a());
      }
      if (paramArrayOfzaie.length < localzaif.c()) {
        throw new CellsException(5, "You have entered too few parameters for function " + this.a.a());
      }
      if ((paramzaca != null) && (!paramzaca.h) && (this.c != 96) && (c(paramzaca))) {
        this.c = 96;
      }
    }
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    paramzahh.a(this.a.a());
    if ((this.b == null) || (this.b.length < 1))
    {
      paramzahh.a("()");
      return;
    }
    paramzahh.a('(');
    char c1 = paramzaah == null ? ',' : paramzaah.j;
    for (zaie localzaie : this.b)
    {
      if (localzaie != null) {
        localzaie.a(paramzahh, paramzaah);
      }
      paramzahh.a(c1);
    }
    paramzahh.b(')');
  }
  
  public zaie d(zaca paramzaca)
  {
    if ((this.d != null) && (this.d.a != null)) {
      return this.d.a;
    }
    if (paramzaca.p.L.d != null)
    {
      CalculationData localCalculationData = new CalculationData(paramzaca, this);
      paramzaca.p.L.d.calculate(localCalculationData);
      if (localCalculationData.a)
      {
        localzaie = zabt.a(localCalculationData.b, paramzaca);
        if (this.d != null) {
          this.d.a = localzaie;
        }
        return localzaie;
      }
      if (localCalculationData.c != null)
      {
        localzaie = localCalculationData.c;
        if (this.d != null) {
          this.d.a = localzaie;
        }
        return localzaie;
      }
    }
    zaie localzaie = k(paramzaca);
    if (this.d != null) {
      this.d.a = localzaie;
    }
    return localzaie;
  }
  
  zaie k(zaca paramzaca)
  {
    int i = this.a.b();
    Object localObject;
    zabc localzabc;
    switch (i)
    {
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 98: 
    case 99: 
    case 100: 
    case 111: 
    case 184: 
    case 229: 
    case 230: 
    case 231: 
    case 232: 
    case 233: 
    case 234: 
    case 271: 
    case 279: 
    case 283: 
    case 284: 
    case 294: 
    case 296: 
    case 298: 
    case 342: 
    case 343: 
    case 415: 
    case 416: 
    case 424: 
    case 502: 
      return zfw.a(i, this.b, paramzaca, 7, 1);
    case 420: 
    case 421: 
      return zfw.a(i, this.b, paramzaca, 5, 1);
    case 27: 
    case 39: 
    case 97: 
    case 212: 
    case 213: 
    case 274: 
    case 275: 
    case 276: 
    case 285: 
    case 288: 
    case 299: 
    case 332: 
    case 337: 
    case 417: 
    case 422: 
    case 425: 
    case 426: 
    case 427: 
    case 428: 
    case 443: 
    case 444: 
    case 445: 
    case 446: 
    case 464: 
    case 508: 
    case 510: 
    case 535: 
    case 536: 
    case 538: 
      return zfw.a(i, this.b, paramzaca, 7, 2);
    case 65: 
    case 66: 
    case 142: 
    case 277: 
    case 278: 
    case 281: 
    case 282: 
    case 287: 
    case 290: 
    case 291: 
    case 292: 
    case 295: 
    case 297: 
    case 301: 
    case 501: 
    case 512: 
    case 517: 
    case 519: 
    case 522: 
      return zfw.a(i, this.b, paramzaca, 7, 3);
    case 143: 
    case 289: 
    case 350: 
      return zfw.a(i, this.b, paramzaca, 7, 4);
    case 438: 
    case 439: 
    case 440: 
      return zfw.a(i, this.b, paramzaca);
    case 447: 
    case 448: 
      return zfw.b(i, this.b, paramzaca);
    case 500: 
      return zfw.b(i, this.b, paramzaca, 7, 1);
    case 280: 
    case 300: 
    case 507: 
    case 531: 
      return zfw.b(i, this.b, paramzaca, 7, 2);
    case 273: 
    case 286: 
    case 293: 
    case 302: 
    case 499: 
    case 505: 
    case 516: 
    case 521: 
    case 524: 
    case 528: 
    case 542: 
      return zfw.b(i, this.b, paramzaca, 7, 3);
    case 523: 
      return zfw.b(i, this.b, paramzaca, 7, 4);
    case 140: 
    case 141: 
      return zfw.a(i, this.b[0], paramzaca);
    case 32: 
    case 112: 
    case 113: 
    case 114: 
    case 118: 
    case 121: 
    case 162: 
    case 211: 
    case 385: 
    case 392: 
    case 393: 
      return zfw.a(i, this.b, paramzaca, 1);
    case 117: 
      return zfw.a(i, this.b, paramzaca, 2);
    case 399: 
    case 400: 
    case 401: 
    case 402: 
    case 403: 
    case 404: 
    case 405: 
    case 406: 
    case 407: 
    case 408: 
    case 409: 
    case 410: 
      return zfw.b(i, this.b, paramzaca, 1);
    case 396: 
    case 397: 
      return zfw.b(i, this.b, paramzaca, 2);
    case 398: 
      return zfw.a(this.b, paramzaca);
    case 38: 
      return zfw.c(i, this.b, paramzaca, 1);
    case 30: 
      return zfw.a(i, this.b, paramzaca, 1, 1, 7);
    case 31: 
    case 119: 
    case 207: 
    case 210: 
      if (!paramzaca.p.r) {
        if (i == 210) {
          i = 31;
        } else if (i == 207) {
          i = 119;
        }
      }
      return zfw.a(i, this.b, paramzaca, 1, 2, 7);
    case 130: 
      return zfw.b(this.b[0], paramzaca);
    case 131: 
      return zfw.c(this.b[0], paramzaca);
    case 33: 
      return zfw.d(this.b[0], paramzaca);
    case 86: 
      return zfw.e(this.b[0], paramzaca);
    case 261: 
      return zfw.f(this.b[0], paramzaca);
    case 76: 
      return zfw.a(true, this.b[0], paramzaca);
    case 77: 
      return zfw.a(false, this.b[0], paramzaca);
    case 546: 
      return zfw.a(this.b[0], paramzaca);
    case 48: 
      return zfw.a(this.b[0], this.b[1], paramzaca);
    case 2: 
    case 3: 
    case 105: 
    case 126: 
    case 127: 
    case 128: 
    case 129: 
    case 190: 
    case 198: 
      return zfw.b(i, this.b[0], paramzaca);
    case 480: 
      localObject = this.b[0].e(paramzaca);
      return zfw.b(3, (zaie)localObject, paramzaca).o() ? this.b[1] : localObject;
    case 75: 
      return zfw.g(this.b[0], paramzaca);
    case 13: 
    case 14: 
    case 109: 
    case 197: 
    case 204: 
    case 387: 
    case 388: 
    case 389: 
    case 411: 
    case 418: 
    case 419: 
    case 423: 
      return zfv.a(this, this.b, paramzaca, 2, 7);
    case 354: 
      localObject = new double[1];
      localzabc = zabt.a(this.b, paramzaca, 0, (double[])localObject, 7);
      if (localzabc != null) {
        return localzabc;
      }
      int j = 0;
      if (this.b.length > 1)
      {
        zaie localzaie = this.b[1].e(paramzaca);
        if (localzaie.b() == 1)
        {
          if (!((zaba)localzaie).o()) {
            j = 4;
          }
        }
        else
        {
          if (localzaie.b() == 0) {
            return localzaie;
          }
          zabb localzabb = localzaie.a(paramzaca, 7);
          if (localzabb == null) {
            return zabc.f;
          }
          j = (int)localzabb.o();
          if ((j < 0) || (j > 4)) {
            return zabc.f;
          }
        }
      }
      int k = (int)localObject[0];
      if ((k < 0) || (k > 3999)) {
        return zabc.f;
      }
      if (k == 0) {
        return zabp.a;
      }
      return new zabp(zgd.a(k, j));
    case 219: 
      return zfv.a(this, this.b, paramzaca, 3, 7);
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 144: 
    case 247: 
    case 270: 
    case 272: 
    case 504: 
      return zfv.a(this, this.b, paramzaca, 5, 7);
    case 60: 
    case 167: 
    case 168: 
    case 222: 
      return zfv.a(this, this.b, paramzaca, 6, 7);
    case 148: 
      return zfv.a(i, this.b, paramzaca, 1);
    case 359: 
      return zfv.a(i, this.b, paramzaca, 2);
    case 115: 
    case 116: 
    case 208: 
    case 209: 
    case 384: 
    case 386: 
    case 390: 
    case 391: 
    case 394: 
    case 395: 
      return zfv.a(i, this.b, paramzaca, 1, 1, 7);
    case 82: 
    case 124: 
    case 205: 
    case 206: 
      return zfv.a(i, this.b, paramzaca, 2, 1, 7);
    case 120: 
      return zfv.a(i, this.b, paramzaca, 3, 1, 7);
    case 452: 
    case 453: 
    case 454: 
    case 455: 
    case 456: 
    case 457: 
      return zfv.b(i, this.b, paramzaca, 2, 2, 7);
    case 433: 
    case 434: 
    case 435: 
    case 436: 
    case 437: 
    case 470: 
      return zfv.b(i, this.b, paramzaca, 2, 3, 7);
    case 458: 
    case 459: 
      return zfv.b(i, this.b, paramzaca, 2, 4, 7);
    case 441: 
    case 442: 
      return zfv.b(i, this.b, paramzaca, 2, 5, 7);
    case 431: 
    case 432: 
      return zfv.b(i, this.b, paramzaca, 3, 3, 7);
    case 469: 
      return zfv.b(i, this.b, paramzaca, 3, 4, 7);
    case 460: 
    case 461: 
      return zfv.b(i, this.b, paramzaca, 3, 5, 7);
    case 462: 
    case 463: 
      return zfv.b(i, this.b, paramzaca, 4, 5, 7);
    case 503: 
      return zfv.c(i, this.b, paramzaca, 3, 1, 7);
    case 466: 
    case 467: 
      return zfv.a(i, this.b, paramzaca, 1, 2, 4, 7);
    case 78: 
      return zfv.a(this.c, this.b, paramzaca);
    case 29: 
      return zfv.b(this.c, this.b, paramzaca);
    case 8: 
      return zfv.a(this.b, paramzaca, true);
    case 9: 
      return zfv.a(this.b, paramzaca, false);
    case 1: 
      return zfv.b(this.b, paramzaca);
    case 125: 
      return zfv.a(this.b, paramzaca);
    case 412: 
    case 413: 
      return zfy.a(new zbro(i), this.b, paramzaca, 0);
    case 36: 
      return zfy.a(new zbrl(true), this.b, paramzaca, 0);
    case 37: 
      return zfy.a(new zbrl(false), this.b, paramzaca, 0);
    case 0: 
      return zfy.a(new zbrq(false, false), this.b, paramzaca, 0);
    case 169: 
      return zfy.a(new zbrq(true, false), this.b, paramzaca, 0);
    case 5: 
      return zfy.a(new zbrk(false, false), this.b, paramzaca, 0);
    case 361: 
      return zfy.a(new zbrk(true, false), this.b, paramzaca, 0);
    case 4: 
      return zfy.a(new zbsi(false), this.b, paramzaca, 0);
    case 321: 
      return zfy.a(new zbsh(), this.b, paramzaca, 0);
    case 183: 
      return zfy.a(new zbsf(false), this.b, paramzaca, 0);
    case 7: 
      return zfy.a(new zbsc(false, false), this.b, paramzaca, 0);
    case 6: 
      return zfy.a(new zbsd(false, false), this.b, paramzaca, 0);
    case 362: 
      return zfy.a(new zbsc(true, false), this.b, paramzaca, 0);
    case 363: 
      return zfy.a(new zbsd(true, false), this.b, paramzaca, 0);
    case 319: 
      return zfy.a(new zbru(), this.b, paramzaca, 0);
    case 320: 
      return zfy.a(new zbrx(), this.b, paramzaca, 0);
    case 473: 
      return zfy.a(new zbrt(), this.b, paramzaca, 0);
    case 474: 
      return zfy.a(new zbsa(), this.b, paramzaca, 0);
    case 475: 
      return zfy.a(new zbry(), this.b, paramzaca, 0);
    case 12: 
    case 193: 
    case 227: 
    case 269: 
    case 318: 
    case 322: 
    case 323: 
    case 364: 
    case 366: 
      return zfy.a(new zbrr(i, false), this.b, paramzaca, 0);
    case 330: 
    case 526: 
      return zfy.a(new zbrz(false, 1), this.b, paramzaca, 0);
    case 527: 
      return zfy.a(new zbrz(false, paramzaca.h ? paramzaca.l.f() : 1), this.b, paramzaca, 0);
    case 46: 
    case 541: 
      return zfy.a(new zbsj(false, false, false), this.b, paramzaca, 0);
    case 367: 
      return zfy.a(new zbsj(false, true, false), this.b, paramzaca, 0);
    case 194: 
    case 540: 
      return zfy.a(new zbsj(true, false, false), this.b, paramzaca, 0);
    case 365: 
      return zfy.a(new zbsj(true, true, false), this.b, paramzaca, 0);
    case 344: 
      return zfy.c(this.b, paramzaca);
    case 11: 
      return zfy.b(this.b, paramzaca);
    case 228: 
      return zfy.a(this.b, paramzaca);
    case 336: 
      return zfy.d(this.b, paramzaca);
    case 551: 
      return zfy.e(this.b, paramzaca);
    case 552: 
      return zfy.f(this.b, paramzaca);
    case 549: 
      return zfy.g(this.b, paramzaca);
    case 550: 
      return zfy.h(this.b, paramzaca);
    case 28: 
      return zfz.a(this.b, paramzaca);
    case 101: 
      return zfz.a(this.b, paramzaca, false);
    case 102: 
      return zfz.a(this.b, paramzaca, true);
    case 64: 
      return zfz.b(this.b, paramzaca);
    case 324: 
    case 325: 
    case 326: 
    case 327: 
    case 328: 
    case 331: 
    case 495: 
    case 496: 
    case 497: 
    case 498: 
    case 543: 
      return zfx.a(this, this.b, paramzaca, 7);
    case 329: 
    case 529: 
    case 530: 
      return zfx.a(this, this.b, paramzaca, 3);
    case 61: 
    case 62: 
      return zfx.a(this, this.b, paramzaca, 0);
    case 49: 
    case 51: 
    case 303: 
    case 304: 
    case 305: 
    case 306: 
    case 307: 
    case 308: 
    case 311: 
    case 312: 
    case 313: 
    case 314: 
    case 315: 
    case 511: 
    case 514: 
    case 515: 
      return zfx.b(i, this.b, paramzaca, 0, 2);
    case 309: 
      return zfx.b(i, this.b, paramzaca, 1, 2);
    case 50: 
      return zfx.a(this.b, paramzaca, false, false);
    case 52: 
      return zfx.a(this.b, paramzaca, true, false);
    case 216: 
    case 532: 
    case 533: 
      return zfx.a(i, this.b, paramzaca, 1, 57344);
    case 163: 
    case 164: 
      return zfx.a(i, this.b, paramzaca, 1);
    case 165: 
      return zfx.a(i, this.b, paramzaca, 2);
    case 252: 
      return zfx.a(this.b, paramzaca);
    case 414: 
      return zfx.d(this.b, paramzaca);
    case 476: 
      return zfx.c(this.b, paramzaca);
    case 317: 
      return zfx.b(this.b, paramzaca);
    case 83: 
      return zfx.g(this.b, paramzaca);
    case 345: 
    case 483: 
      return zfx.a(i, this.b, paramzaca);
    case 346: 
      return zfx.a(this, this.b[0], this.b[1], paramzaca);
    case 347: 
      return zfx.a(this.b[0], paramzaca);
    case 482: 
      return zfx.a(this, this.b, paramzaca, new zbsi(false));
    case 484: 
      return zfx.a(this, this.b, paramzaca, new zbrk(false, false));
    case 547: 
      return zfx.a(this, this.b, paramzaca, new zbsc(false, false));
    case 548: 
      return zfx.a(this, this.b, paramzaca, new zbsd(false, false));
    case 481: 
      return zfx.a(this, this.b, paramzaca);
    case 316: 
    case 539: 
      return zfx.e(this.b, paramzaca);
    case 430: 
      return zfx.f(this.b, paramzaca);
    case 429: 
      return zfx.h(this.b, paramzaca);
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 47: 
    case 189: 
    case 195: 
    case 196: 
    case 199: 
    case 235: 
      return zfr.a(i, this.b, paramzaca);
    case 34: 
      return zaba.a;
    case 35: 
      return zaba.b;
    case 63: 
      return new zabb(paramzaca.p.c().nextDouble());
    case 19: 
      return new zabb(3.141592653589793D);
    case 10: 
      return zabc.g;
    case 74: 
      return paramzaca.a(DateTime.getNow());
    case 221: 
      return paramzaca.a(DateTime.g());
    case 67: 
    case 68: 
    case 69: 
    case 71: 
    case 72: 
    case 73: 
      return zfs.a(i, this.b, paramzaca);
    case 449: 
    case 450: 
    case 465: 
    case 545: 
      return zfs.a(i, this.b, paramzaca, 1, 5);
    case 70: 
      return zfs.a(i, this.b, paramzaca, 1, 7);
    case 220: 
      return zfs.a(this.b, paramzaca);
    case 351: 
      return zfs.b(this.b, paramzaca);
    case 471: 
      return zfs.d(this.b, paramzaca);
    case 472: 
      return zfs.f(this.b, paramzaca);
    case 451: 
      return zfs.h(this.b, paramzaca);
    case 358: 
      return zfy.i(this.b, paramzaca);
    case 487: 
      return zfs.g(this.b, paramzaca);
    case 486: 
      return zfs.e(this.b, paramzaca);
    case 485: 
      return zfs.c(this.b, paramzaca);
    case 468: 
      localObject = new double[1];
      localzabc = zabt.a(this.b, paramzaca, 0, (double[])localObject, 7);
      if (localzabc != null) {
        return localzabc;
      }
      String[] arrayOfString = new String[2];
      localzabc = zabt.a(this.b, paramzaca, 1, arrayOfString);
      if (localzabc != null) {
        return localzabc;
      }
      return zft.a(localObject[0], arrayOfString[0], arrayOfString[1]);
    case 489: 
      localObject = this.b[0].e(paramzaca);
      if (localObject == zabc.g) {
        return this.b[1];
      }
      return (zaie)localObject;
    case 490: 
      return zfw.c(490, this.b, paramzaca);
    case 491: 
      return zfw.c(491, this.b, paramzaca);
    case 492: 
      return zfw.c(492, this.b, paramzaca);
    case 493: 
      return zfw.a(this.b, paramzaca, true);
    case 494: 
      return zfw.a(this.b, paramzaca, false);
    case 380: 
    case 381: 
    case 382: 
    case 383: 
    case 477: 
    case 478: 
    case 479: 
      throw new CellsException(5, "Unsupported function: " + this.a.a());
    case 488: 
      return zfy.j(this.b, paramzaca);
    }
    return l(paramzaca);
  }
  
  private zaie l(zaca paramzaca)
  {
    if (paramzaca.p.L.c == null)
    {
      if (paramzaca.p.L.n.a) {
        zl.a(zs.a(paramzaca.c(null).append(": Unsupported function[").append(this.a.a()).append("]")));
      }
      return zabc.e;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    zf.a(localArrayList2, paramzaca.p.d);
    zf.a(localArrayList2, paramzaca.c);
    zf.a(localArrayList2, paramzaca.g.checkCell(paramzaca.d, paramzaca.e));
    ArrayList localArrayList3 = new ArrayList();
    paramzaca = new zaca(paramzaca);
    if (this.b != null)
    {
      localObject1 = paramzaca.i();
      zbpe localzbpe = new zbpe();
      for (int i = 0; i < this.b.length; i++)
      {
        zaie localzaie = this.b[i];
        localzbpe.b();
        localzaie.a(localzbpe, (zaah)localObject1);
        zf.a(localArrayList3, localzbpe.c());
        Object localObject2 = localzaie.b(paramzaca);
        zf.a(localArrayList1, localObject2);
      }
    }
    zf.a(localArrayList2, localArrayList3);
    Object localObject1 = paramzaca.p.L.c.calculateCustomFunction(this.a.a(), localArrayList1, localArrayList2);
    return zabt.a(localObject1, paramzaca);
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean j()
  {
    return true;
  }
  
  public boolean f(zaca paramzaca)
  {
    if (this.d != null) {
      return true;
    }
    switch (this.b == null ? 0 : this.b.length)
    {
    case 0: 
      return true;
    case 1: 
      switch (this.a.b())
      {
      case 8: 
        return this.b[0].g(paramzaca);
      case 9: 
        return this.b[0].h(paramzaca);
      }
      return a(0, paramzaca);
    case 2: 
      return (a(0, paramzaca)) && (a(1, paramzaca));
    }
    switch (this.a.b())
    {
    case 101: 
      if (!this.b[0].f(paramzaca)) {
        return false;
      }
      if (!this.b[2].g(paramzaca)) {
        return false;
      }
      if (this.b.length > 3) {
        for (i = 3; i < this.b.length; i++) {
          if (!this.b[i].f(paramzaca)) {
            return false;
          }
        }
      }
      return true;
    case 102: 
      if (!this.b[0].f(paramzaca)) {
        return false;
      }
      if (!this.b[2].h(paramzaca)) {
        return false;
      }
      if (this.b.length > 3) {
        for (i = 3; i < this.b.length; i++) {
          if (!this.b[i].f(paramzaca)) {
            return false;
          }
        }
      }
      return true;
    }
    for (int i = 0; i < this.b.length; i++) {
      if (!a(i, paramzaca)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean g(zaca paramzaca)
  {
    if (this.d != null) {
      return true;
    }
    switch (this.b == null ? 0 : this.b.length)
    {
    case 0: 
      return true;
    case 1: 
      switch (this.a.b())
      {
      case 8: 
        return this.b[0].g(paramzaca);
      case 9: 
        return true;
      }
      return b(0, paramzaca);
    case 2: 
      return (b(0, paramzaca)) && (b(1, paramzaca));
    }
    switch (this.a.b())
    {
    case 101: 
      if (!this.b[0].g(paramzaca)) {
        return false;
      }
      if (!this.b[2].g(paramzaca)) {
        return false;
      }
      if (this.b.length > 3) {
        for (i = 3; i < this.b.length; i++) {
          if (!this.b[i].g(paramzaca)) {
            return false;
          }
        }
      }
      return true;
    case 102: 
      if (!this.b[0].f(paramzaca)) {
        return false;
      }
      if (this.b.length > 3) {
        for (i = 3; i < this.b.length; i++) {
          if (!this.b[i].g(paramzaca)) {
            return false;
          }
        }
      }
      return true;
    }
    for (int i = 0; i < this.b.length; i++) {
      if (!b(i, paramzaca)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean h(zaca paramzaca)
  {
    if (this.d != null) {
      return true;
    }
    switch (this.b == null ? 0 : this.b.length)
    {
    case 0: 
      return true;
    case 1: 
      switch (this.a.b())
      {
      case 8: 
        return true;
      case 9: 
        return this.b[0].h(paramzaca);
      }
      return c(0, paramzaca);
    case 2: 
      return (c(0, paramzaca)) && (c(1, paramzaca));
    }
    switch (this.a.b())
    {
    case 101: 
      if (!this.b[0].h(paramzaca)) {
        return false;
      }
      if (this.b.length > 3) {
        for (i = 3; i < this.b.length; i++) {
          if (!this.b[i].h(paramzaca)) {
            return false;
          }
        }
      }
      return true;
    case 102: 
      if (!this.b[0].h(paramzaca)) {
        return false;
      }
      if (!this.b[2].h(paramzaca)) {
        return false;
      }
      if (this.b.length > 3) {
        for (i = 3; i < this.b.length; i++) {
          if (!this.b[i].h(paramzaca)) {
            return false;
          }
        }
      }
      return true;
    }
    for (int i = 0; i < this.b.length; i++) {
      if (!c(i, paramzaca)) {
        return false;
      }
    }
    return true;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    if ((this.d != null) && (this.d.a != null)) {
      return this.d.a.a(paramArrayOfInt, paramzaca, paramBoolean);
    }
    int i = a(paramzaca);
    Object localObject;
    if ((i == 96) || ((i == 32) && (this.a.b() != 1)))
    {
      localObject = d(paramzaca);
      if (localObject != this) {
        return ((zaie)localObject).a(paramArrayOfInt, paramzaca, paramBoolean);
      }
    }
    if (this.c == 96)
    {
      localObject = a(paramzaca, paramBoolean);
      zaie localzaie1 = ((zaiw)localObject).a(paramArrayOfInt[0], paramArrayOfInt[1]);
      paramArrayOfInt[0] = ((zaiw)localObject).c();
      paramArrayOfInt[1] = ((zaiw)localObject).d();
      return localzaie1;
    }
    switch (this.b == null ? 0 : this.b.length)
    {
    case 0: 
      paramArrayOfInt[0] = 1;
      paramArrayOfInt[1] = 1;
      return this;
    case 1: 
      switch (this.a.b())
      {
      case 8: 
        paramArrayOfInt[1] = 0;
        localObject = this.b[0].a(paramArrayOfInt, paramzaca, true);
        if ((localObject == this.b[0]) || (paramArrayOfInt[0] == 1)) {
          return this;
        }
        return new zabe(this.c, this.a, new zaie[] { localObject });
      case 9: 
        paramArrayOfInt[0] = 0;
        localObject = this.b[0].a(paramArrayOfInt, paramzaca, true);
        if ((localObject == this.b[0]) || (paramArrayOfInt[1] == 1)) {
          return this;
        }
        return new zabe(this.c, this.a, new zaie[] { localObject });
      }
      localObject = a(0, paramArrayOfInt, paramzaca);
      if ((localObject == this.b[0]) || ((paramArrayOfInt[0] == 1) && (paramArrayOfInt[1] == 1))) {
        return this;
      }
      return new zabe(this.c, this.a, new zaie[] { localObject });
    case 2: 
      int j = paramArrayOfInt[0];
      k = paramArrayOfInt[1];
      zaie localzaie2 = a(0, paramArrayOfInt, paramzaca);
      n = paramArrayOfInt[0];
      i1 = paramArrayOfInt[1];
      paramArrayOfInt[0] = j;
      paramArrayOfInt[1] = k;
      zaie localzaie3 = a(1, paramArrayOfInt, paramzaca);
      if (n > paramArrayOfInt[0]) {
        paramArrayOfInt[0] = n;
      }
      if (i1 > paramArrayOfInt[1]) {
        paramArrayOfInt[1] = i1;
      }
      if ((paramArrayOfInt[0] == 1) && (paramArrayOfInt[1] == 1)) {
        return this;
      }
      return new zabe(this.c, this.a, new zaie[] { localzaie2, localzaie3 });
    }
    zaie[] arrayOfzaie = new zaie[this.b.length];
    int k = paramArrayOfInt[0];
    int m = paramArrayOfInt[1];
    int n = 1;
    int i1 = 1;
    int i2;
    switch (this.a.b())
    {
    case 101: 
      arrayOfzaie[0] = this.b[0].a(paramArrayOfInt, paramzaca, false);
      n = paramArrayOfInt[0];
      i1 = paramArrayOfInt[1];
      paramArrayOfInt[0] = k;
      paramArrayOfInt[1] = m;
      arrayOfzaie[1] = this.b[1];
      arrayOfzaie[2] = this.b[2].a(paramArrayOfInt, paramzaca, false);
      if (paramArrayOfInt[1] > 1) {
        arrayOfzaie[2] = zabc.c;
      }
      if (paramArrayOfInt[0] > n) {
        n = paramArrayOfInt[0];
      }
      if (this.b.length > 3) {
        for (i2 = 3; i2 < this.b.length; i2++)
        {
          paramArrayOfInt[0] = k;
          paramArrayOfInt[1] = m;
          arrayOfzaie[i2] = this.b[i2].a(paramArrayOfInt, paramzaca, false);
          if (paramArrayOfInt[0] > n) {
            n = paramArrayOfInt[0];
          }
          if (paramArrayOfInt[1] > i1) {
            i1 = paramArrayOfInt[1];
          }
        }
      }
      paramArrayOfInt[0] = n;
      paramArrayOfInt[1] = i1;
      break;
    case 102: 
      arrayOfzaie[0] = this.b[0].a(paramArrayOfInt, paramzaca, false);
      n = paramArrayOfInt[0];
      i1 = paramArrayOfInt[1];
      paramArrayOfInt[0] = k;
      paramArrayOfInt[1] = m;
      arrayOfzaie[1] = this.b[1];
      arrayOfzaie[2] = this.b[2].a(paramArrayOfInt, paramzaca, false);
      if (paramArrayOfInt[0] > 1) {
        arrayOfzaie[2] = zabc.c;
      }
      if (paramArrayOfInt[1] > i1) {
        i1 = paramArrayOfInt[1];
      }
      if (this.b.length > 3) {
        for (i2 = 3; i2 < this.b.length; i2++)
        {
          paramArrayOfInt[0] = k;
          paramArrayOfInt[1] = m;
          arrayOfzaie[i2] = this.b[i2].a(paramArrayOfInt, paramzaca, false);
          if (paramArrayOfInt[0] > n) {
            n = paramArrayOfInt[0];
          }
          if (paramArrayOfInt[1] > i1) {
            i1 = paramArrayOfInt[1];
          }
        }
      }
      paramArrayOfInt[0] = n;
      paramArrayOfInt[1] = i1;
      break;
    default: 
      for (i2 = 0; i2 < this.b.length; i2++)
      {
        paramArrayOfInt[0] = k;
        paramArrayOfInt[1] = m;
        arrayOfzaie[i2] = a(i2, paramArrayOfInt, paramzaca);
        if (paramArrayOfInt[0] > n) {
          n = paramArrayOfInt[0];
        }
        if (paramArrayOfInt[1] > i1) {
          i1 = paramArrayOfInt[1];
        }
      }
      paramArrayOfInt[0] = n;
      paramArrayOfInt[1] = i1;
    }
    if ((n == 1) && (i1 == 1)) {
      return this;
    }
    return new zabe(this.c, this.a, arrayOfzaie);
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    if ((this.d != null) && (this.d.a != null)) {
      return this.d.a.a(paramArrayOfInt, paramzaca);
    }
    int i = a(paramzaca);
    Object localObject1;
    if ((i == 96) || ((i == 32) && (this.a.b() != 1)))
    {
      localObject1 = d(paramzaca);
      if (localObject1 != this) {
        return ((zaie)localObject1).a(paramArrayOfInt, paramzaca);
      }
    }
    Object localObject2;
    if (this.c == 96)
    {
      localObject1 = a(paramzaca, false);
      localObject2 = ((zaiw)localObject1).b(paramArrayOfInt[0]);
      zaie localzaie1 = zbam.a((zaiw)localObject2);
      paramArrayOfInt[0] = ((zaiw)localObject1).c();
      ((zaiw)localObject1).a(true);
      ((zaiw)localObject2).a(true);
      return localzaie1;
    }
    switch (this.b == null ? 0 : this.b.length)
    {
    case 0: 
      paramArrayOfInt[0] = 1;
      return this;
    case 1: 
      switch (this.a.b())
      {
      case 8: 
        localObject1 = this.b[0].a(paramArrayOfInt, paramzaca);
        if (paramArrayOfInt[0] == 1) {
          return this;
        }
        return new zabe(this.c, this.a, new zaie[] { localObject1 });
      case 9: 
        return this;
      }
      localObject1 = b(0, paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] == 1) {
        return this;
      }
      return new zabe(this.c, this.a, new zaie[] { localObject1 });
    case 2: 
      int j = paramArrayOfInt[0];
      localObject2 = b(0, paramArrayOfInt, paramzaca);
      m = paramArrayOfInt[0];
      paramArrayOfInt[0] = j;
      zaie localzaie2 = b(1, paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] < m) {
        paramArrayOfInt[0] = m;
      }
      if (m == 1) {
        return this;
      }
      return new zabe(this.c, this.a, new zaie[] { localObject2, localzaie2 });
    }
    zaie[] arrayOfzaie = new zaie[this.b.length];
    int k = paramArrayOfInt[0];
    int m = 1;
    int n;
    switch (this.a.b())
    {
    case 101: 
      arrayOfzaie[0] = this.b[0].a(paramArrayOfInt, paramzaca);
      m = paramArrayOfInt[0];
      paramArrayOfInt[0] = k;
      arrayOfzaie[1] = this.b[1];
      arrayOfzaie[2] = this.b[2].a(paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] > m) {
        m = paramArrayOfInt[0];
      }
      if (this.b.length > 3) {
        for (n = 3; n < this.b.length; n++)
        {
          paramArrayOfInt[0] = k;
          arrayOfzaie[n] = this.b[n].a(paramArrayOfInt, paramzaca);
          if (paramArrayOfInt[0] > m) {
            m = paramArrayOfInt[0];
          }
        }
      }
      paramArrayOfInt[0] = m;
      break;
    case 102: 
      arrayOfzaie[0] = this.b[0].a(paramArrayOfInt, paramzaca);
      m = paramArrayOfInt[0];
      paramArrayOfInt[0] = k;
      arrayOfzaie[1] = this.b[1];
      arrayOfzaie[2] = this.b[2].a(paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] > 1) {
        arrayOfzaie[2] = zabc.c;
      }
      if (this.b.length > 3) {
        for (n = 3; n < this.b.length; n++)
        {
          paramArrayOfInt[0] = k;
          arrayOfzaie[n] = this.b[n].a(paramArrayOfInt, paramzaca);
          if (paramArrayOfInt[0] > m) {
            m = paramArrayOfInt[0];
          }
        }
      }
      paramArrayOfInt[0] = m;
      break;
    default: 
      for (n = 0; n < this.b.length; n++)
      {
        paramArrayOfInt[0] = k;
        arrayOfzaie[n] = b(n, paramArrayOfInt, paramzaca);
        if (paramArrayOfInt[0] > m) {
          m = paramArrayOfInt[0];
        }
      }
      paramArrayOfInt[0] = m;
    }
    if (m == 1) {
      return this;
    }
    return new zabe(this.c, this.a, arrayOfzaie);
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    if ((this.d != null) && (this.d.a != null)) {
      return this.d.a.b(paramArrayOfInt, paramzaca);
    }
    int i = a(paramzaca);
    Object localObject1;
    if ((i == 96) || ((i == 32) && (this.a.b() != 1)))
    {
      localObject1 = d(paramzaca);
      if (localObject1 != this) {
        return ((zaie)localObject1).b(paramArrayOfInt, paramzaca);
      }
    }
    Object localObject2;
    if (this.c == 96)
    {
      localObject1 = a(paramzaca, false);
      localObject2 = ((zaiw)localObject1).c(paramArrayOfInt[0]);
      zaie localzaie1 = zbam.a((zaiw)localObject2);
      paramArrayOfInt[0] = ((zaiw)localObject1).d();
      ((zaiw)localObject1).a(true);
      ((zaiw)localObject2).a(true);
      return localzaie1;
    }
    switch (this.b == null ? 0 : this.b.length)
    {
    case 0: 
      paramArrayOfInt[0] = 1;
      return this;
    case 1: 
      switch (this.a.b())
      {
      case 8: 
        localObject1 = this.b[0].b(paramArrayOfInt, paramzaca);
        if (paramArrayOfInt[0] == 1) {
          return this;
        }
        return new zabe(this.c, this.a, new zaie[] { localObject1 });
      case 9: 
        return this;
      }
      localObject1 = c(0, paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] == 1) {
        return this;
      }
      return new zabe(this.c, this.a, new zaie[] { localObject1 });
    case 2: 
      int j = paramArrayOfInt[0];
      localObject2 = c(0, paramArrayOfInt, paramzaca);
      m = paramArrayOfInt[0];
      paramArrayOfInt[0] = j;
      zaie localzaie2 = c(1, paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] < m) {
        paramArrayOfInt[0] = m;
      }
      if (m == 1) {
        return this;
      }
      return new zabe(this.c, this.a, new zaie[] { localObject2, localzaie2 });
    }
    zaie[] arrayOfzaie = new zaie[this.b.length];
    int k = paramArrayOfInt[0];
    int m = 1;
    int n;
    switch (this.a.b())
    {
    case 101: 
      arrayOfzaie[0] = this.b[0].b(paramArrayOfInt, paramzaca);
      m = paramArrayOfInt[0];
      paramArrayOfInt[0] = k;
      arrayOfzaie[1] = this.b[1];
      arrayOfzaie[2] = this.b[2].b(paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] > 1) {
        arrayOfzaie[2] = zabc.c;
      }
      if (this.b.length > 3) {
        for (n = 3; n < this.b.length; n++)
        {
          paramArrayOfInt[0] = k;
          arrayOfzaie[n] = this.b[n].b(paramArrayOfInt, paramzaca);
          if (paramArrayOfInt[0] > m) {
            m = paramArrayOfInt[0];
          }
        }
      }
      paramArrayOfInt[0] = m;
      break;
    case 102: 
      arrayOfzaie[0] = this.b[0].b(paramArrayOfInt, paramzaca);
      m = paramArrayOfInt[0];
      paramArrayOfInt[0] = k;
      arrayOfzaie[1] = this.b[1];
      arrayOfzaie[2] = this.b[2].b(paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] > m) {
        m = paramArrayOfInt[0];
      }
      if (this.b.length > 3) {
        for (n = 3; n < this.b.length; n++)
        {
          paramArrayOfInt[0] = k;
          arrayOfzaie[n] = this.b[n].b(paramArrayOfInt, paramzaca);
          if (paramArrayOfInt[0] > m) {
            m = paramArrayOfInt[0];
          }
        }
      }
      paramArrayOfInt[0] = m;
      break;
    default: 
      for (n = 0; n < this.b.length; n++)
      {
        paramArrayOfInt[0] = k;
        arrayOfzaie[n] = c(n, paramArrayOfInt, paramzaca);
        if (paramArrayOfInt[0] > m) {
          m = paramArrayOfInt[0];
        }
      }
      paramArrayOfInt[0] = m;
    }
    if (m == 1) {
      return this;
    }
    return new zabe(this.c, this.a, arrayOfzaie);
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    boolean bool = paramzaca.k;
    paramzaca.k = false;
    if (this.a.b() == 255)
    {
      if (this.d == null) {
        this.d = new zabu();
      }
      return d(paramzaca).a(paramzaca, paramBoolean);
    }
    if (paramzaca.j)
    {
      if (this.d == null)
      {
        this.d = new zabu();
      }
      else if (this.d.b == zbov.a)
      {
        paramzaca.m = 0;
        if (this.d.a != null) {
          return this.d.a.a(paramzaca, paramBoolean);
        }
      }
      else if (this.d.b != null)
      {
        zaiw localzaiw1 = this.d.b.c(paramzaca);
        if (localzaiw1 != null)
        {
          if (!localzaiw1.a()) {
            localzaiw1 = localzaiw1.b(paramzaca);
          }
          localzaiw1.a(paramzaca);
          return localzaiw1;
        }
      }
    }
    else if ((this.d != null) && (this.d.a != null)) {
      return this.d.a.a(paramzaca, paramBoolean);
    }
    Object localObject4;
    zaiw localzaiw4;
    switch (this.b == null ? 0 : this.b.length)
    {
    case 0: 
      if ((this.d == null) && (this.a.b() != 63)) {
        this.d = new zabu();
      }
      return new zbak(this);
    case 1: 
      Object localObject2;
      zaiw localzaiw3;
      int k;
      switch (this.a.b())
      {
      case 8: 
        if ((paramzaca.j) && (this.d.b != zbov.a))
        {
          int i = paramzaca.m;
          paramzaca.f();
          localObject1 = this.b[0].a(paramzaca, true);
          if (((zaiw)localObject1).m())
          {
            this.d.b = zbov.a;
            paramzaca.b(i);
            localObject2 = new zaie[] { ((zaiw)localObject1).a(0, 0) };
            return new zabe(this.c, this.a, (zaie[])localObject2).e(paramzaca, paramBoolean);
          }
          localObject1 = new zazd(((zaiw)localObject1).c(0), new zmh(paramzaca, this, new zaie[1], paramzaca.d, paramzaca.e, 0), paramzaca);
          localObject1 = this.d.a((zaiw)localObject1, paramzaca);
          paramzaca.b(i);
          return (zaiw)localObject1;
        }
        zaiw localzaiw2 = this.b[0].a(paramzaca, true);
        if (localzaiw2.m())
        {
          localObject1 = new zaie[] { localzaiw2.a(0, 0) };
          return new zabe(this.c, this.a, (zaie[])localObject1).e(paramzaca, paramBoolean);
        }
        return new zazd(localzaiw2.c(0), new zmh(paramzaca, this, new zaie[1], paramzaca.d, paramzaca.e, 0), paramzaca);
      case 9: 
        if ((paramzaca.j) && (this.d.b != zbov.a))
        {
          int j = paramzaca.m;
          paramzaca.f();
          localObject1 = this.b[0].a(paramzaca, true);
          if (((zaiw)localObject1).n())
          {
            this.d.b = zbov.a;
            paramzaca.b(j);
            localObject2 = new zaie[] { ((zaiw)localObject1).a(0, 0) };
            return new zabe(this.c, this.a, (zaie[])localObject2).e(paramzaca, paramBoolean);
          }
          localObject1 = new zazd(((zaiw)localObject1).b(0), new zmh(paramzaca, this, new zaie[1], paramzaca.d, paramzaca.e, 0), paramzaca);
          localObject1 = this.d.a((zaiw)localObject1, paramzaca);
          paramzaca.b(j);
          return (zaiw)localObject1;
        }
        localzaiw3 = this.b[0].a(paramzaca, true);
        if (localzaiw3.n())
        {
          localObject1 = new zaie[] { localzaiw3.a(0, 0) };
          return new zabe(this.c, this.a, (zaie[])localObject1).e(paramzaca, paramBoolean);
        }
        return new zazd(localzaiw3.b(0), new zmh(paramzaca, this, new zaie[1], paramzaca.d, paramzaca.e, 0), paramzaca);
      case 148: 
        if (paramzaca.h) {
          if (paramzaca.l.c())
          {
            localzaiw3 = this.b[0].a(paramzaca, false);
            if (!localzaiw3.l())
            {
              localObject1 = this.b[0];
              this.b[0] = localzaiw3.a(0, 0);
              localObject2 = d(paramzaca);
              this.b[0] = localObject1;
              return ((zaie)localObject2).a(paramzaca, paramBoolean);
            }
          }
          else if (!this.b[0].a(paramzaca, false).l())
          {
            return new zbak(zabc.f);
          }
        }
        if (paramzaca.j)
        {
          k = paramzaca.m;
          paramzaca.m = this.b[0].b(paramzaca, false);
          localObject1 = d(paramzaca).a(paramzaca, paramBoolean);
          localObject1 = this.d.a((zaiw)localObject1, paramzaca);
          paramzaca.b(k);
          return (zaiw)localObject1;
        }
        return d(paramzaca).a(paramzaca, paramBoolean);
      }
      if (this.a.c().a() == 96)
      {
        a(false);
        return d(paramzaca).a(paramzaca, paramBoolean);
      }
      if ((paramzaca.j) && (this.d.b != zbov.a))
      {
        k = paramzaca.m;
        paramzaca.f();
        localObject1 = a(0, paramzaca, paramBoolean);
        if (((zaiw)localObject1).l())
        {
          this.d.b = zbov.a;
          paramzaca.b(k);
          if (((zaiw)localObject1).a(0, 0) == this.b[0]) {
            return e(paramzaca, paramBoolean);
          }
          localObject2 = new zaie[] { ((zaiw)localObject1).a(0, 0) };
          localObject4 = new zabe(this.c, this.a, (zaie[])localObject2);
          ((zabe)localObject4).a(false);
          return new zbak((zaie)localObject4, 7);
        }
        localObject1 = new zazd((zaiw)localObject1, new zmh(paramzaca, this, new zaie[1], paramzaca.d, paramzaca.e, 0), paramzaca);
        localObject1 = this.d.a((zaiw)localObject1, paramzaca);
        paramzaca.b(k);
        return (zaiw)localObject1;
      }
      localzaiw4 = a(0, paramzaca, paramBoolean);
      if (localzaiw4.l())
      {
        if (localzaiw4.a(0, 0) == this.b[0]) {
          return e(paramzaca, paramBoolean);
        }
        localObject1 = new zaie[] { localzaiw4.a(0, 0) };
        localObject2 = new zabe(this.c, this.a, (zaie[])localObject1);
        ((zabe)localObject2).a(false);
        return new zbak((zaie)localObject2, 7);
      }
      return new zazd(localzaiw4, new zmh(paramzaca, this, new zaie[1], paramzaca.d, paramzaca.e, 0), paramzaca);
    case 2: 
      localzaiw4 = null;
      localObject1 = null;
      int n = paramzaca.m;
      if ((paramzaca.j) && (this.d.b != zbov.a)) {
        paramzaca.f();
      }
      Object localObject6;
      Object localObject5;
      switch (this.a.b())
      {
      case 1: 
        localzaiw4 = this.b[0].a(paramzaca, false);
        if ((localzaiw4.l()) && (!localzaiw4.x()) && (!localzaiw4.y()))
        {
          localObject4 = localzaiw4.a(0, 0).e(paramzaca);
          if (((zaie)localObject4).b() != 0)
          {
            localObject4 = ((zaie)localObject4).j(paramzaca);
            if (localObject4 == null) {
              localObject4 = zabc.f;
            } else if (((zaba)localObject4).o()) {
              localObject4 = this.b[1];
            } else {
              localObject4 = zaba.b;
            }
          }
          if (this.d == null) {
            this.d = new zabu();
          }
          this.d.a = ((zaie)localObject4);
          if ((paramzaca.j) && (this.d.b != zbov.a))
          {
            this.d.b = zbov.a;
            paramzaca.b(n);
          }
          return ((zaie)localObject4).a(paramzaca, paramBoolean);
        }
        localObject1 = a(1, paramzaca, paramBoolean);
        break;
      case 148: 
        if (paramzaca.h) {
          if (paramzaca.l.c())
          {
            localzaiw4 = this.b[0].a(paramzaca, false);
            localObject1 = this.b[1].a(paramzaca, false);
            if (!localzaiw4.l())
            {
              localObject4 = this.b[0];
              this.b[0] = localzaiw4.a(0, 0);
              if (!((zaiw)localObject1).l())
              {
                localObject6 = this.b[1];
                this.b[1] = ((zaiw)localObject1).a(0, 0);
                localObject5 = d(paramzaca);
                this.b[1] = localObject6;
              }
              else
              {
                localObject5 = d(paramzaca);
              }
              this.b[0] = localObject4;
              if ((paramzaca.j) && (this.d.b != zbov.a))
              {
                this.d.b = zbov.a;
                paramzaca.b(n);
              }
              return ((zaie)localObject5).a(paramzaca, paramBoolean);
            }
            if (!((zaiw)localObject1).l())
            {
              localObject4 = this.b[1];
              this.b[1] = ((zaiw)localObject1).a(0, 0);
              localObject5 = d(paramzaca);
              this.b[1] = localObject4;
              if ((paramzaca.j) && (this.d.b != zbov.a))
              {
                this.d.b = zbov.a;
                paramzaca.b(n);
              }
              return ((zaie)localObject5).a(paramzaca, paramBoolean);
            }
          }
          else if ((!this.b[0].f(paramzaca)) || (!this.b[1].f(paramzaca)))
          {
            if ((paramzaca.j) && (this.d.b != zbov.a))
            {
              this.d.b = zbov.a;
              paramzaca.b(n);
            }
            return new zbak(zabc.f);
          }
        }
        if (paramzaca.j)
        {
          paramzaca.m = (this.b[0].b(paramzaca, false) & this.b[1].b(paramzaca, false));
          localObject4 = d(paramzaca).a(paramzaca, paramBoolean);
          localObject4 = this.d.a((zaiw)localObject4, paramzaca);
          paramzaca.b(n);
          return (zaiw)localObject4;
        }
        return d(paramzaca).a(paramzaca, paramBoolean);
      default: 
        if (this.a.c().a() == 96)
        {
          switch (this.a.b())
          {
          case 50: 
            return zfx.a(this.b, paramzaca, false, (!bool) || (!paramzaca.l.c())).a(paramzaca, paramBoolean);
          case 52: 
            return zfx.a(this.b, paramzaca, true, (!bool) || (!paramzaca.l.c())).a(paramzaca, paramBoolean);
          }
          a(false);
          return d(paramzaca).a(paramzaca, paramBoolean);
        }
        localzaiw4 = a(0, paramzaca, paramBoolean);
        localObject1 = a(1, paramzaca, paramBoolean);
      }
      if (localzaiw4.l())
      {
        if (((zaiw)localObject1).l())
        {
          if ((paramzaca.j) && (this.d.b != zbov.a))
          {
            this.d.b = zbov.a;
            paramzaca.b(n);
          }
          if ((localzaiw4.a(0, 0) == this.b[0]) && (((zaiw)localObject1).a(0, 0) == this.b[1])) {
            return e(paramzaca, paramBoolean);
          }
          localObject5 = new zaie[] { localzaiw4.a(0, 0), ((zaiw)localObject1).a(0, 0) };
          localObject6 = new zabe(this.c, this.a, (zaie[])localObject5);
          ((zabe)localObject6).a(false);
          return new zbak((zaie)localObject6, 7);
        }
        localObject5 = new zaie[] { localzaiw4.a(0, 0), null };
        localObject4 = new zazd((zaiw)localObject1, new zmh(paramzaca, this, (zaie[])localObject5, paramzaca.d, paramzaca.e, 1), paramzaca);
      }
      else if (((zaiw)localObject1).l())
      {
        localObject5 = new zaie[] { null, ((zaiw)localObject1).a(0, 0) };
        localObject4 = new zazd(localzaiw4, new zmh(paramzaca, this, (zaie[])localObject5, paramzaca.d, paramzaca.e, 0), paramzaca);
      }
      else
      {
        localObject4 = zbam.a(localzaiw4, (zaiw)localObject1, paramzaca, new zmi(paramzaca, this, new zaie[2], paramzaca.d, paramzaca.e, 0, 1));
      }
      if ((paramzaca.j) && (this.d.b != zbov.a))
      {
        localObject4 = this.d.a((zaiw)localObject4, paramzaca);
        paramzaca.b(n);
      }
      return (zaiw)localObject4;
    }
    if (this.a.c().a() == 96)
    {
      switch (this.a.b())
      {
      case 50: 
        return zfx.a(this.b, paramzaca, false, (!bool) || (!paramzaca.l.c())).a(paramzaca, paramBoolean);
      case 52: 
        paramzaca.k = bool;
        return zfx.a(this.b, paramzaca, true, (!bool) || (!paramzaca.l.c())).a(paramzaca, paramBoolean);
      }
      a(false);
      return d(paramzaca).a(paramzaca, paramBoolean);
    }
    int m = paramzaca.m;
    if ((paramzaca.j) && (this.d.b != zbov.a)) {
      paramzaca.f();
    }
    Object localObject3;
    switch (this.a.b())
    {
    case 1: 
      localObject1 = this.b[0].a(paramzaca, false);
      if (((zaiw)localObject1).l())
      {
        localObject3 = ((zaiw)localObject1).a(0, 0).e(paramzaca);
        if (((zaie)localObject3).b() != 0)
        {
          localObject3 = ((zaie)localObject3).j(paramzaca);
          if (localObject3 == null) {
            localObject3 = zabc.f;
          } else if (((zaba)localObject3).o()) {
            localObject3 = this.b[1];
          } else {
            localObject3 = this.b[2];
          }
        }
        if (this.d == null) {
          this.d = new zabu();
        }
        this.d.a = ((zaie)localObject3);
        if ((paramzaca.j) && (this.d.b != zbov.a))
        {
          this.d.b = zbov.a;
          paramzaca.b(m);
        }
        return ((zaie)localObject3).a(paramzaca, paramBoolean);
      }
      localObject3 = new zacw(this, paramzaca);
      ((zacw)localObject3).a(0, (zaiw)localObject1);
      ((zacw)localObject3).a(1, this.b[1].a(paramzaca, paramBoolean));
      ((zacw)localObject3).a(2, this.b[2].a(paramzaca, paramBoolean));
      localObject4 = ((zacw)localObject3).b();
      if (localObject4 == null) {
        localObject4 = a((zacw)localObject3, paramzaca, paramBoolean);
      }
      if ((paramzaca.j) && (this.d.b != zbov.a))
      {
        localObject4 = this.d.a((zaiw)localObject4, paramzaca);
        paramzaca.b(m);
      }
      return (zaiw)localObject4;
    case 101: 
      localObject1 = new zacw(this, paramzaca);
      ((zacw)localObject1).a(0, this.b[0].a(paramzaca, false));
      ((zacw)localObject1).a(1, this.b[1]);
      localObject3 = this.b[2].a(paramzaca, false);
      if (!((zaiw)localObject3).l()) {
        if (((zaiw)localObject3).m()) {
          localObject3 = new zbak(((zaiw)localObject3).a(0, 0));
        } else if (!((zaiw)localObject3).n()) {
          localObject3 = new zbak(zabc.c);
        }
      }
      ((zacw)localObject1).a(2, (zaiw)localObject3);
      if (this.b.length > 3) {
        for (int i2 = 3; i2 < this.b.length; i2++) {
          ((zacw)localObject1).a(i2, this.b[i2].a(paramzaca, false));
        }
      }
      zaiw localzaiw6 = ((zacw)localObject1).b();
      if (localzaiw6 == null) {
        localzaiw6 = a((zacw)localObject1, paramzaca, paramBoolean);
      }
      if ((paramzaca.j) && (this.d.b != zbov.a))
      {
        localzaiw6 = this.d.a(localzaiw6, paramzaca);
        paramzaca.b(m);
      }
      return localzaiw6;
    case 102: 
      localObject1 = new zacw(this, paramzaca);
      ((zacw)localObject1).a(0, this.b[0].a(paramzaca, false));
      ((zacw)localObject1).a(1, this.b[1]);
      localObject3 = this.b[2].a(paramzaca, false);
      if (!((zaiw)localObject3).l()) {
        if (((zaiw)localObject3).n()) {
          localObject3 = new zbak(((zaiw)localObject3).a(0, 0));
        } else if (!((zaiw)localObject3).m()) {
          localObject3 = new zbak(zabc.c);
        }
      }
      ((zacw)localObject1).a(2, (zaiw)localObject3);
      if (this.b.length > 3) {
        for (int i3 = 3; i3 < this.b.length; i3++) {
          ((zacw)localObject1).a(i3, this.b[i3].a(paramzaca, false));
        }
      }
      zaiw localzaiw7 = ((zacw)localObject1).b();
      if (localzaiw7 == null) {
        localzaiw7 = a((zacw)localObject1, paramzaca, paramBoolean);
      }
      if ((paramzaca.j) && (this.d.b != zbov.a))
      {
        localzaiw7 = this.d.a(localzaiw7, paramzaca);
        paramzaca.b(m);
      }
      return localzaiw7;
    case 78: 
      localObject1 = d(paramzaca).a(paramzaca, paramBoolean);
      if ((paramzaca.j) && (this.d.b != zbov.a)) {
        paramzaca.b(m);
      }
      return (zaiw)localObject1;
    }
    Object localObject1 = new zacw(this, paramzaca);
    for (int i1 = 0; i1 < this.b.length; i1++) {
      ((zacw)localObject1).a(i1, a(i1, paramzaca, paramBoolean));
    }
    zaiw localzaiw5 = ((zacw)localObject1).b();
    if (localzaiw5 == null) {
      localzaiw5 = a((zacw)localObject1, paramzaca, paramBoolean);
    }
    if ((paramzaca.j) && (this.d.b != zbov.a))
    {
      localzaiw5 = this.d.a(localzaiw5, paramzaca);
      paramzaca.b(m);
    }
    return localzaiw5;
  }
  
  zaiw d(zaca paramzaca, boolean paramBoolean)
  {
    zacw localzacw = new zacw(this, paramzaca);
    for (int i = 0; i < this.b.length; i++) {
      localzacw.a(i, a(i, paramzaca, paramBoolean));
    }
    zaiw localzaiw = localzacw.b();
    if (localzaiw == null) {
      return new zbak(this);
    }
    return localzaiw;
  }
  
  private zaiw a(zacw paramzacw, zaca paramzaca, boolean paramBoolean)
  {
    zaie[] arrayOfzaie = paramzacw.a();
    for (int i = 0; i < this.b.length; i++) {
      if ((this.b[i] != arrayOfzaie[i]) && ((this.b[i].l() == null) || (this.b[i].l().a != arrayOfzaie[i])))
      {
        zabe localzabe = new zabe(this.c, this.a, arrayOfzaie);
        if (this.a.c().a() != 64)
        {
          zaie localzaie = localzabe.d(paramzaca);
          if (this.d != null) {
            this.d.a = localzaie;
          }
          return localzaie.a(paramzaca, paramBoolean);
        }
        localzabe.a(false);
        return new zbak(localzabe, 7);
      }
    }
    return e(paramzaca, paramBoolean);
  }
  
  private zaiw a(int paramInt, zaca paramzaca, boolean paramBoolean)
  {
    zaie localzaie = this.b[paramInt];
    int i = this.a.c().b(paramInt);
    if (i == 96)
    {
      if (localzaie.b() == 7)
      {
        zabe localzabe = (zabe)localzaie;
        if (localzabe.a.b() == 78) {
          return localzabe.d(paramzaca, paramBoolean);
        }
      }
      return new zbak(localzaie);
    }
    return localzaie.a(paramzaca, (paramBoolean) || (i == 32));
  }
  
  private boolean a(int paramInt, zaca paramzaca)
  {
    zaie localzaie = this.b[paramInt];
    int i = this.a.c().b(paramInt);
    if (i == 96)
    {
      if ((localzaie.b() == 7) && (((zabe)localzaie).a.b() == 78)) {
        return localzaie.f(paramzaca);
      }
      return true;
    }
    if ((localzaie.g() == 32) && (this.a.c().a(paramInt) == 32)) {
      return true;
    }
    return localzaie.f(paramzaca);
  }
  
  private boolean b(int paramInt, zaca paramzaca)
  {
    zaie localzaie = this.b[paramInt];
    int i = this.a.c().b(paramInt);
    if (i == 96)
    {
      if ((localzaie.b() == 7) && (((zabe)localzaie).a.b() == 78)) {
        return localzaie.g(paramzaca);
      }
      return true;
    }
    if ((localzaie.g() == 32) && (this.a.c().a(paramInt) == 32)) {
      return true;
    }
    return localzaie.g(paramzaca);
  }
  
  private boolean c(int paramInt, zaca paramzaca)
  {
    zaie localzaie = this.b[paramInt];
    int i = this.a.c().b(paramInt);
    if (i == 96)
    {
      if ((localzaie.b() == 7) && (((zabe)localzaie).a.b() == 78)) {
        return localzaie.h(paramzaca);
      }
      return true;
    }
    if ((localzaie.g() == 32) && (this.a.c().a(paramInt) == 32)) {
      return true;
    }
    return localzaie.h(paramzaca);
  }
  
  private zaie a(int paramInt, int[] paramArrayOfInt, zaca paramzaca)
  {
    zaie localzaie = this.b[paramInt];
    int i = this.a.c().b(paramInt);
    if (i == 96)
    {
      if ((localzaie.b() == 7) && (((zabe)localzaie).a.b() == 78)) {
        return localzaie.a(paramArrayOfInt, paramzaca, false);
      }
      paramArrayOfInt[0] = 1;
      paramArrayOfInt[1] = 1;
      return localzaie;
    }
    if ((localzaie.g() == 32) && (this.a.c().a(paramInt) == 32))
    {
      paramArrayOfInt[0] = 1;
      paramArrayOfInt[1] = 1;
      return localzaie;
    }
    return localzaie.a(paramArrayOfInt, paramzaca, i == 32);
  }
  
  private zaie b(int paramInt, int[] paramArrayOfInt, zaca paramzaca)
  {
    zaie localzaie = this.b[paramInt];
    int i = this.a.c().b(paramInt);
    if (i == 96)
    {
      if ((localzaie.b() == 7) && (((zabe)localzaie).a.b() == 78)) {
        return localzaie.a(paramArrayOfInt, paramzaca);
      }
      paramArrayOfInt[0] = 1;
      return localzaie;
    }
    if ((localzaie.g() == 32) && (this.a.c().a(paramInt) == 32))
    {
      paramArrayOfInt[0] = 1;
      return localzaie;
    }
    return localzaie.a(paramArrayOfInt, paramzaca);
  }
  
  private zaie c(int paramInt, int[] paramArrayOfInt, zaca paramzaca)
  {
    zaie localzaie = this.b[paramInt];
    int i = this.a.c().b(paramInt);
    if (i == 96)
    {
      if ((localzaie.b() == 7) && (((zabe)localzaie).a.b() == 78)) {
        return localzaie.b(paramArrayOfInt, paramzaca);
      }
      paramArrayOfInt[0] = 1;
      return localzaie;
    }
    if ((localzaie.g() == 32) && (this.a.c().a(paramInt) == 32))
    {
      paramArrayOfInt[0] = 1;
      return localzaie;
    }
    return localzaie.b(paramArrayOfInt, paramzaca);
  }
  
  private zaiw e(zaca paramzaca, boolean paramBoolean)
  {
    if (this.a.c().a() != 64)
    {
      zaie localzaie = d(paramzaca);
      if (this.d != null) {
        this.d.a = localzaie;
      }
      return localzaie.a(paramzaca, paramBoolean);
    }
    if (this.d == null) {
      this.d = new zabu();
    }
    return new zbak(this);
  }
  
  public boolean a(zaie paramzaie)
  {
    if (paramzaie.b() != 7) {
      return false;
    }
    zabe localzabe = (zabe)paramzaie;
    if (this.c != localzabe.c) {
      return false;
    }
    if (!zw.b(this.a.a(), localzabe.a.a())) {
      return false;
    }
    return zabt.a(this.b, localzabe.b);
  }
  
  public zaie b(zaie paramzaie)
  {
    if (a(paramzaie)) {
      return this;
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++) {
        if (this.b[i] != null)
        {
          zaie localzaie = this.b[i].b(paramzaie);
          if (localzaie != null) {
            return localzaie;
          }
        }
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */