package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.g.ze;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;

class zaai
{
  int a = -1;
  byte[] b;
  int c;
  Object d;
  int e;
  short f;
  private byte g = 0;
  
  zaai(int paramInt1, int paramInt2)
  {
    this.e = paramInt1;
    this.f = ((short)paramInt2);
  }
  
  zaai(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this.e = paramInt1;
    this.f = ((short)paramInt2);
    this.b = paramArrayOfByte;
  }
  
  zaai(int paramInt1, int paramInt2, String paramString)
  {
    this(paramInt1, paramInt2);
    byte[] arrayOfByte = zct.c(paramString);
    if (arrayOfByte.length == paramString.length())
    {
      this.b = new byte[arrayOfByte.length + 1];
      System.arraycopy(arrayOfByte, 0, this.b, 1, arrayOfByte.length);
      this.b[0] = 0;
    }
    else
    {
      arrayOfByte = Encoding.getUnicode().a(paramString);
      this.b = new byte[arrayOfByte.length + 1];
      System.arraycopy(arrayOfByte, 0, this.b, 1, arrayOfByte.length);
      this.b[0] = 1;
    }
    this.g = ((byte)(this.g | 0x80));
  }
  
  zbf a()
  {
    return null;
  }
  
  zacb b()
  {
    return null;
  }
  
  byte c()
  {
    return (byte)(this.g & 0xFF & 0x3);
  }
  
  void a(byte paramByte)
  {
    this.g = ((byte)(this.g & 0xFC));
    this.g = ((byte)(this.g | paramByte));
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g = ((byte)(this.g | 0x4));
    } else {
      this.g = ((byte)(this.g & 0xFB));
    }
  }
  
  boolean d()
  {
    return (this.g & 0xFF & 0x8) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g = ((byte)(this.g | 0x8));
    } else {
      this.g = ((byte)(this.g & 0xF7));
    }
  }
  
  boolean e()
  {
    return (this.g & 0xFF & 0x20) != 0;
  }
  
  boolean f()
  {
    return (this.g & 0xFF & 0x40) != 0;
  }
  
  boolean g()
  {
    return false;
  }
  
  boolean h()
  {
    return (this.g & 0xFF & 0x10) != 0;
  }
  
  void a(zaca paramzaca)
  {
    this.g = ((byte)(this.g | 0x10));
    byte[] arrayOfByte;
    if (a() != null) {
      arrayOfByte = a().c();
    } else {
      arrayOfByte = this.b;
    }
    zacc localzacc = paramzaca.j();
    localzacc.a(arrayOfByte, 0, -1);
    while (localzacc.h())
    {
      int i = localzacc.e();
      switch (arrayOfByte[i])
      {
      case 1: 
      case 2: 
        zbap localzbap = localzacc.a(paramzaca);
        zaai localzaai = a(paramzaca.g, localzbap.b(), localzbap.d());
        if ((localzaai == null) || (localzaai.a() == null)) {
          return;
        }
        arrayOfByte = localzaai.a().c();
        localzacc.a(arrayOfByte, 0, -1);
        i = localzacc.e();
        break;
      case 33: 
      case 65: 
      case 97: 
        a(zc.e(arrayOfByte, i + 1) & 0xFFFF);
        localzacc.b(i + 3);
        break;
      case 34: 
      case 66: 
      case 98: 
        a(zc.e(arrayOfByte, i + 2) & 0xFFFF & 0x7FFF);
        localzacc.b(i + 4);
        break;
      default: 
        localzacc.k();
      }
    }
  }
  
  private void a(int paramInt)
  {
    switch (paramInt)
    {
    case 63: 
    case 74: 
    case 78: 
    case 125: 
    case 148: 
    case 221: 
      this.g = ((byte)(this.g | 0x20));
      break;
    case 344: 
      this.g = ((byte)(this.g | 0x40));
    }
  }
  
  zaai a(Cells paramCells, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == this.e) && (paramInt2 == this.f)) {
      return this;
    }
    zt localzt = paramCells.getRows().a.a(paramInt1);
    if (localzt == null) {
      return null;
    }
    int i = localzt.b(paramInt2);
    if (i < 0) {
      return null;
    }
    if (localzt.h(i) != 5) {
      return null;
    }
    return (zaai)localzt.i(i);
  }
  
  boolean i()
  {
    return (this.g & 0xFF & 0x80) != 0;
  }
  
  String j()
  {
    if ((this.g & 0xFF & 0x80) != 0) {
      try
      {
        if (this.b[0] == 0) {
          return zct.a(this.b, 1, this.b.length - 1);
        }
        return Encoding.getUnicode().a(this.b, 1, this.b.length - 1);
      }
      catch (Exception localException)
      {
        throw new CellsException(5, "Invalid formula");
      }
    }
    return null;
  }
  
  void a(WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    if ((this.g & 0xFF & 0x80) != 0)
    {
      String str = null;
      try
      {
        if (this.b[0] == 0) {
          str = zct.a(this.b, 1, this.b.length - 1);
        } else {
          str = Encoding.getUnicode().a(this.b, 1, this.b.length - 1);
        }
      }
      catch (Exception localException)
      {
        throw new CellsException(5, "Invalid formula");
      }
      this.b = paramWorksheetCollection.y().a(paramInt, this.e, this.e, str.trim(), (byte)0);
      this.g = ((byte)(this.g & 0x7F));
    }
  }
  
  boolean k()
  {
    return false;
  }
  
  boolean l()
  {
    return false;
  }
  
  boolean a(Cells paramCells)
  {
    if (this.b == null) {
      return false;
    }
    return paramCells.p().y().a((byte)2, this.b);
  }
  
  boolean b(Cells paramCells)
  {
    if (d()) {
      return false;
    }
    if (this.b == null) {
      return false;
    }
    return paramCells.p().y().a((byte)1, this.b);
  }
  
  void a(zaai paramzaai)
  {
    this.b = paramzaai.b;
    this.g = paramzaai.g;
    a(false);
    this.c = paramzaai.c;
    this.d = paramzaai.d;
  }
  
  zaai a(int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, CopyOptions paramCopyOptions)
  {
    zaai localzaai = new zaai(paramInt1, paramInt2);
    localzaai.a(this);
    if ((this.g & 0xFF & 0x80) != 0)
    {
      localzaai.b = new byte[this.b.length];
      System.arraycopy(this.b, 0, localzaai.b, 0, this.b.length);
    }
    else
    {
      localzaai.b = zaam.a(this.b, -1, 0, 0, paramCopyOptions);
    }
    return localzaai;
  }
  
  static long a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 32 | paramInt2;
  }
  
  static int a(long paramLong)
  {
    return (int)(paramLong >> 32);
  }
  
  static int b(long paramLong)
  {
    return (int)(paramLong & 0xFFFFFFFF);
  }
  
  void a(ReferredAreaCollection paramReferredAreaCollection, zaca paramzaca)
  {
    paramzaca.a(this);
    zacc localzacc = paramzaca.j();
    localzacc.a(this.b, 0, -1);
    if (!localzacc.h()) {
      return;
    }
    zbap localzbap;
    zaai localzaai;
    zbf localzbf;
    if (paramzaca.h)
    {
      localzbap = localzacc.a(paramzaca);
      localzaai = a(paramzaca.g, localzbap.b(), localzbap.d());
      if ((localzaai == null) || (!localzaai.k())) {
        return;
      }
      paramzaca.d = localzbap.b();
      paramzaca.e = ((short)localzbap.d());
      localzbf = localzaai.a();
      paramzaca.l = localzbf.a();
      localzacc.a(localzbf.c(), 0, -1);
      zaci.a(paramReferredAreaCollection, paramzaca, localzacc);
      return;
    }
    if (this.b[localzacc.e()] == 1)
    {
      localzbap = localzacc.a(paramzaca);
      localzaai = a(paramzaca.g, localzbap.b(), localzbap.d());
      if (localzaai == null) {
        return;
      }
      localzbf = localzaai.a();
      paramzaca.i = true;
      paramzaca.f = true;
      paramzaca.l = localzbf.a();
      localzacc.a(localzbf.c(), 0, -1);
      zaci.a(paramReferredAreaCollection, paramzaca, localzacc);
      return;
    }
    zaci.a(paramReferredAreaCollection, paramzaca, localzacc);
  }
  
  void b(zaca paramzaca)
  {
    if (paramzaca.p.L.getCalculationMonitor() != null)
    {
      paramzaca.p.L.getCalculationMonitor().a = this.c;
      paramzaca.p.L.getCalculationMonitor().b = this.d;
      paramzaca.p.L.getCalculationMonitor().beforeCalculate(paramzaca.n, this.e, this.f);
    }
    paramzaca.a(this);
    int i = 0;
    if (c() != 3) {
      if ((paramzaca.p.z) && (paramzaca.p.L.i != 0))
      {
        paramzaca.p.a(paramzaca.n, this);
      }
      else if ((paramzaca.p.L.n.a()) && (paramzaca.g()))
      {
        paramzaca.p.L.n.b(true);
        i = 1;
      }
    }
    int j = this.c;
    Object localObject1 = this.d;
    if (paramzaca.p.L.n.c()) {
      com.aspose.cells.a.c.zl.a(zs.a(paramzaca.b(new StringBuilder(zs.a(paramzaca.p.L.n.b)))));
    }
    Object localObject2;
    if (paramzaca.h)
    {
      c(paramzaca);
    }
    else
    {
      zacc localzacc = paramzaca.j();
      localzacc.a(this.b, 0, -1);
      if (!localzacc.h())
      {
        a((byte)2);
        return;
      }
      Object localObject3;
      long l;
      zaai localzaai3;
      if (this.b[localzacc.e()] == 1)
      {
        paramzaca.i = true;
        paramzaca.f = true;
        paramzaca.j = true;
        localObject2 = localzacc.a(paramzaca);
        if ((paramzaca.p.s) || (c() == 3) || ((paramzaca.p.z) && (paramzaca.p.L.i != 0)))
        {
          zaai localzaai1 = a(paramzaca.g, ((zbap)localObject2).b(), ((zbap)localObject2).d());
          if ((localzaai1 == null) || (localzaai1.a() == null))
          {
            if (paramzaca.p.L.n.a) {
              com.aspose.cells.a.c.zl.a(zs.a(paramzaca.c(null).append(": Formula with token[01] without header formula")));
            }
            a((byte)2);
          }
          else
          {
            zbf localzbf1 = localzaai1.a();
            localzacc.a(localzbf1.c(), 0, -1);
            localObject3 = new zaag(paramzaca, localzbf1.c(), localzacc);
            paramzaca.j = false;
            a((zaag)localObject3, paramzaca);
          }
        }
        else
        {
          l = Cell.a(paramzaca.n, ((zbap)localObject2).b(), ((zbap)localObject2).d());
          localObject3 = (zfl)paramzaca.p.a(Long.valueOf(l));
          if (localObject3 != null)
          {
            ((zfl)localObject3).a(this, paramzaca);
            if (((zfl)localObject3).c == 0) {
              paramzaca.p.b(Long.valueOf(l));
            }
          }
          else
          {
            localzaai3 = a(paramzaca.g, ((zbap)localObject2).b(), ((zbap)localObject2).d());
            if ((localzaai3 == null) || (localzaai3.a() == null))
            {
              if (paramzaca.p.L.n.a) {
                com.aspose.cells.a.c.zl.a(zs.a(paramzaca.c(null).append(": SharedFormula without header formula")));
              }
              a((byte)2);
            }
            else
            {
              zbf localzbf2 = localzaai3.a();
              zaag localzaag;
              if (localzbf2.a().c())
              {
                localzacc.a(localzbf2.c(), 0, -1);
                localzaag = new zaag(paramzaca, localzbf2.c(), localzacc);
                paramzaca.j = false;
                a(localzaag, paramzaca);
              }
              else
              {
                paramzaca.l = localzbf2.a();
                paramzaca.f();
                localzaag = new zaag(paramzaca, localzbf2.c(), 0, -1, false);
                zaie localzaie = localzaag.a();
                localObject3 = new zfl(paramzaca, localzaai3, localzaie, this.e, this.f);
                paramzaca.p.a(Long.valueOf(l), (zfh)localObject3);
                try
                {
                  a(localzaie, paramzaca);
                }
                finally
                {
                  ((zfl)localObject3).a();
                }
                localObject3.c -= 1;
                if (((zfl)localObject3).c == 0) {
                  paramzaca.p.b(Long.valueOf(l));
                }
              }
            }
          }
        }
      }
      else if (this.b[localzacc.e()] == 2)
      {
        localObject2 = localzacc.a(paramzaca);
        l = Cell.a(paramzaca.n, ((zbap)localObject2).b(), ((zbap)localObject2).d());
        localObject3 = (zfm)paramzaca.p.a(Long.valueOf(l));
        if (localObject3 != null) {
          return;
        }
        localzaai3 = a(paramzaca.g, ((zbap)localObject2).b(), ((zbap)localObject2).d());
        if ((localzaai3 == null) || (localzaai3.b() == null))
        {
          if (paramzaca.p.L.n.a) {
            com.aspose.cells.a.c.zl.a(zs.a(paramzaca.c(null).append(": TableFormula without header formula")));
          }
          a((byte)2);
        }
        else
        {
          if (paramzaca.p.s) {
            return;
          }
          if (paramzaca.p.C == null) {
            paramzaca.p.C = new zbvk();
          }
          int m = paramzaca.p.L.i;
          if (m == 0) {
            localObject3 = new zfp(localzaai3, paramzaca);
          } else if (m == 1) {
            localObject3 = new zfo(localzaai3, paramzaca);
          } else {
            localObject3 = new zfn(localzaai3, paramzaca);
          }
          paramzaca.p.a(Long.valueOf(l), (zfh)localObject3);
          ((zfm)localObject3).a(this);
          paramzaca.p.b(Long.valueOf(l));
        }
      }
      else
      {
        localObject2 = new zaag(paramzaca, this.b, localzacc);
        a((zaag)localObject2, paramzaca);
      }
    }
    if (paramzaca.p.L.n.c())
    {
      int k = !paramzaca.p.z ? 1 : 0;
      if (paramzaca.p.L.n.d != null)
      {
        localObject2 = paramzaca.p.L.n.d.getWorksheets().get(paramzaca.n).getCells().checkCell(this.e, this.f);
        if ((localObject2 != null) && (((Cell)localObject2).isFormula()))
        {
          zaai localzaai2 = (zaai)((Cell)localObject2).c.d;
          j = localzaai2.c;
          localObject1 = localzaai2.d;
          k = 1;
        }
      }
      if ((k != 0) && (paramzaca.p.L.n.c.a(j, localObject1, this.c, this.d)))
      {
        localObject2 = new StringBuilder(zs.a(paramzaca.p.L.n.b));
        paramzaca.b((StringBuilder)localObject2);
        ((StringBuilder)localObject2).append(": Old [");
        zgj.a(j, localObject1, (StringBuilder)localObject2);
        ((StringBuilder)localObject2).append("], New [");
        zgj.a(this.c, this.d, (StringBuilder)localObject2);
        ((StringBuilder)localObject2).append("]");
        com.aspose.cells.a.c.zl.a(zs.a(localObject2));
        com.aspose.cells.a.c.zl.b(null);
      }
      if (i != 0)
      {
        paramzaca.p.L.n.b(false);
        paramzaca.p.L.n.a(false);
      }
    }
  }
  
  private void c(zaca paramzaca)
  {
    zacc localzacc = paramzaca.j();
    localzacc.a(this.b, 0, -1);
    zbap localzbap = localzacc.a(paramzaca);
    long l = Cell.a(paramzaca.n, localzbap.b(), localzbap.d());
    zfj localzfj = (zfj)paramzaca.p.a(Long.valueOf(l));
    if (localzfj != null)
    {
      paramzaca.l = localzfj.b;
      paramzaca.d = localzfj.b.StartRow;
      paramzaca.e = ((short)localzfj.b.StartColumn);
      a(zbam.a(localzfj.d, this.e - localzfj.b.StartRow, this.f - localzfj.b.StartColumn), paramzaca);
      return;
    }
    zaai localzaai = a(paramzaca.g, localzbap.b(), localzbap.d());
    if ((localzaai == null) || (!localzaai.k()))
    {
      if (paramzaca.p.L.n.a)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Cannot get array formula header ");
        paramzaca.c((StringBuilder)localObject1);
        com.aspose.cells.a.c.zl.a(zs.a(localObject1));
      }
      a((byte)2);
      return;
    }
    paramzaca.d = localzbap.b();
    paramzaca.e = ((short)localzbap.d());
    Object localObject1 = localzaai.a();
    CellArea localCellArea = ((zbf)localObject1).a();
    paramzaca.l = localCellArea;
    Object localObject2 = null;
    zaag localzaag = new zaag(paramzaca, ((zbf)localObject1).c(), 0, -1, false);
    zaie localzaie = localzaag.a();
    if (localzaie == zabg.a)
    {
      paramzaca.g.a(localCellArea, localCellArea.StartRow, localCellArea.StartColumn, new zhr(2, paramzaca), false, false);
      return;
    }
    int i = 1;
    if (localzaai != this)
    {
      int j = localzaai.c() & 0xFF;
      if (j == 1) {
        paramzaca.p.a(localzaai, paramzaca.n);
      } else if (j == 2) {
        if (c() == 3)
        {
          i = 0;
        }
        else if ((!paramzaca.p.z) || (paramzaca.p.L.i == 0))
        {
          if (paramzaca.p.L.n.a)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Calculated header without cached result, finish all cells in array formula. Maybe ");
            paramzaca.a(localStringBuilder);
            if (localzaai != this)
            {
              localStringBuilder.append("<-");
              CellsHelper.a(localStringBuilder, this.e, this.f);
            }
            com.aspose.cells.a.c.zl.a(zs.a(localStringBuilder));
          }
          paramzaca.g.a(localCellArea, localCellArea.StartRow, localCellArea.StartColumn, new zhr(2), false, false);
          return;
        }
      }
    }
    localzaai.a((byte)1);
    localObject2 = paramzaca.a(localzaai, localzaie);
    if (localObject2 == null) {
      return;
    }
    ((zaiw)localObject2).b(true);
    localzaai.a((byte)0);
    if (localCellArea.c())
    {
      a(((zaiw)localObject2).a(0, 0), paramzaca);
      return;
    }
    if ((localzaie.b() == 7) && (((zabe)localzaie).p().b() == 78)) {
      if (((zaiw)localObject2).l())
      {
        ((zaiw)localObject2).a(true);
        localObject2 = ((zaiw)localObject2).a(0, 0).d(paramzaca).a(paramzaca, false);
      }
      else
      {
        localObject2 = new zazj(zabc.f, 7, ((zaiw)localObject2).c(), ((zaiw)localObject2).d());
      }
    }
    if ((((zaiw)localObject2).l()) || (((zaiw)localObject2).m()) || (((zaiw)localObject2).n()))
    {
      zaiw localzaiw = ((zaiw)localObject2).c(paramzaca);
      if (localzaiw != localObject2)
      {
        ((zaiw)localObject2).a(true);
        localObject2 = localzaiw;
      }
    }
    localzfj = new zfj(localzaai, (zaiw)localObject2);
    paramzaca.p.a(Long.valueOf(l), localzfj);
    if (i != 0)
    {
      int k = paramzaca.p.O;
      paramzaca.p.O = paramzaca.p.E;
      int m = paramzaca.p.F;
      try
      {
        paramzaca.g.a(localzfj.b, paramzaca.d, paramzaca.e, new za(paramzaca, l, localzfj), false, false);
        localzfj.d.a(true);
        paramzaca.p.b(Long.valueOf(l));
      }
      catch (Exception localException)
      {
        paramzaca.p.a(paramzaca.p.O, m);
      }
      finally
      {
        localzfj.a();
        paramzaca.p.O = k;
      }
      if (c() != 2) {
        a(zbam.a((zaiw)localObject2, this.e - localzfj.b.StartRow, this.f - localzfj.b.StartColumn), paramzaca);
      }
    }
    else
    {
      a(zbam.a((zaiw)localObject2, this.e - localzfj.b.StartRow, this.f - localzfj.b.StartColumn), paramzaca);
    }
  }
  
  private void a(zaag paramzaag, zaca paramzaca)
  {
    if (c() == 1)
    {
      paramzaca.a(this, paramzaag);
    }
    else
    {
      a((byte)1);
      paramzaca.a(this, paramzaag);
      a((byte)2);
    }
  }
  
  void a(zaie paramzaie, zaca paramzaca)
  {
    if (!paramzaie.i())
    {
      if (c() == 1)
      {
        paramzaca.b(this, paramzaie);
      }
      else
      {
        a((byte)1);
        paramzaca.b(this, paramzaie);
        a((byte)2);
      }
    }
    else
    {
      b(paramzaie, paramzaca);
      if (c() == 0) {
        a((byte)2);
      }
    }
  }
  
  void b(zaie paramzaie, zaca paramzaca)
  {
    int i = this.c;
    Object localObject = this.d;
    switch (paramzaie.b())
    {
    case 12: 
      this.c = 1;
      this.d = znq.g;
      break;
    case 3: 
      if (!((zabb)paramzaie).p())
      {
        zuf localzuf = zuf.f;
        this.c = 3;
        this.d = zi.a(ztr.b(localzuf));
      }
      else
      {
        int j = 1;
        if (paramzaca.p.j)
        {
          Style localStyle = paramzaca.p.e.C().a(paramzaca.g.d(this.e, this.f));
          zahf localzahf = null;
          if ((localStyle.s() == null) || ("".equals(localStyle.s())))
          {
            if (localStyle.getNumber() != 0) {
              localzahf = paramzaca.p.h.e(localStyle.getNumber());
            }
          }
          else {
            localzahf = paramzaca.p.h.a(localStyle.s(), true);
          }
          if (localzahf != null) {
            switch (localzahf.a())
            {
            case 2: 
            case 4: 
            case 5: 
            case 6: 
              double d1 = ((zabb)paramzaie).o();
              double d2 = ((zl)localzahf).a(d1);
              if (d1 != d2)
              {
                zgs localzgs = new zgs();
                zayi.a(d2, localzgs);
                this.c = localzgs.c;
                this.d = localzgs.d;
                j = 0;
              }
              break;
            }
          }
        }
        if (j != 0)
        {
          this.c = 1;
          this.d = paramzaie.c();
        }
      }
      break;
    case 2: 
      this.c = 4;
      this.d = paramzaie.c();
      break;
    case 1: 
      this.c = 2;
      this.d = paramzaie.c();
      break;
    case 0: 
      this.c = 3;
      this.d = ((zabc)paramzaie).c();
      break;
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    default: 
      if (com.aspose.cells.a.c.zl.a()) {
        com.aspose.cells.a.c.zl.a("Unsupported calculated result[type=" + paramzaie.b() + ", value=" + paramzaie.c() + "]");
      }
      this.c = 1;
      this.d = znq.g;
    }
    if (paramzaca.p.L.getCalculationMonitor() != null)
    {
      paramzaca.p.L.getCalculationMonitor().a = i;
      paramzaca.p.L.getCalculationMonitor().b = localObject;
      paramzaca.p.L.getCalculationMonitor().c = this.c;
      paramzaca.p.L.getCalculationMonitor().d = this.d;
      paramzaca.p.L.getCalculationMonitor().afterCalculate(paramzaca.n, this.e, this.f);
    }
  }
  
  boolean a(zaca paramzaca, int paramInt)
  {
    return (c() != 2) || (paramzaca.p.a(paramInt, this, false));
  }
  
  boolean b(zaca paramzaca, int paramInt)
  {
    switch (c())
    {
    case 0: 
      if (paramzaca.p.o) {
        if (paramInt == paramzaca.n) {
          paramzaca.g.a.f.a(this);
        } else {
          paramzaca.p.e.get(paramInt).getCells().a.f.a(this);
        }
      }
      return true;
    case 1: 
      paramzaca.p.a(this, paramInt);
      return false;
    case 2: 
      return paramzaca.p.a(paramInt, this, true);
    case 3: 
      return true;
    }
    throw new CellsException(6, "Invalid formula status in calculation.");
  }
  
  zaie m()
  {
    if (this.c == 4) {
      return new zabp((String)this.d);
    }
    return zabt.a(this.c, this.d);
  }
  
  zaie a(zaca paramzaca, boolean paramBoolean)
  {
    zaag localzaag = new zaag(paramzaca, this.b, 0, -1, false);
    zaie localzaie = localzaag.a();
    if (localzaie != zabg.a) {
      return localzaie;
    }
    zacc localzacc = localzaag.b();
    localzacc.a(this.b, 0, -1);
    if (localzacc.h())
    {
      int i = this.b[localzacc.e()];
      if ((i == 1) || (i == 2))
      {
        zbap localzbap = localzacc.a(paramzaca);
        if (localzacc.h()) {
          return zabg.a;
        }
        zaai localzaai = a(paramzaca.g, localzbap.b(), localzbap.d());
        if (localzaai == null) {
          return zabg.a;
        }
        Object localObject1;
        Object localObject2;
        if (i == 1)
        {
          localObject1 = localzaai.a();
          if (localObject1 != null)
          {
            if (!localzaai.k())
            {
              paramzaca.i = true;
              paramzaca.f = true;
            }
            localzaag = new zaag(paramzaca, ((zbf)localObject1).c(), 0, -1, false);
            localObject2 = localzaag.a();
            return (zaie)localObject2;
          }
        }
        else if (localzaai.b() != null)
        {
          localObject1 = localzaai.b();
          localObject2 = new zabe(32, zacm.b("TABLE"));
          zaie[] arrayOfzaie = null;
          if (((zacb)localObject1).d())
          {
            if (((zacb)localObject1).b())
            {
              if (((zacb)localObject1).c()) {
                return (zaie)localObject2;
              }
              arrayOfzaie = new zaie[3];
              arrayOfzaie[0] = new zabo(32, new zbap(null, ((zacb)localObject1).b, ((zacb)localObject1).c));
              arrayOfzaie[1] = new zabo(32, new zbap(null, ((zacb)localObject1).a.StartRow - 1, ((zacb)localObject1).a.StartColumn - 1));
              arrayOfzaie[2] = new zabo(32, new zbap(null, ((zacb)localObject1).a.StartRow - 1, this.f));
            }
            else if (((zacb)localObject1).c())
            {
              arrayOfzaie = new zaie[3];
              arrayOfzaie[0] = new zabo(32, new zbap(null, ((zacb)localObject1).b, ((zacb)localObject1).c));
              arrayOfzaie[1] = new zabo(32, new zbap(null, ((zacb)localObject1).a.StartRow - 1, ((zacb)localObject1).a.StartColumn - 1));
              arrayOfzaie[2] = new zabo(32, new zbap(null, this.e, ((zacb)localObject1).a.StartColumn - 1));
            }
            else
            {
              arrayOfzaie = new zaie[5];
              arrayOfzaie[0] = new zabo(32, new zbap(null, ((zacb)localObject1).b, ((zacb)localObject1).c));
              arrayOfzaie[1] = new zabo(32, new zbap(null, ((zacb)localObject1).d, ((zacb)localObject1).e));
              arrayOfzaie[2] = new zabo(32, new zbap(null, ((zacb)localObject1).a.StartRow - 1, ((zacb)localObject1).a.StartColumn - 1));
              arrayOfzaie[3] = new zabo(32, new zbap(null, this.e, ((zacb)localObject1).a.StartColumn - 1));
              arrayOfzaie[4] = new zabo(32, new zbap(null, ((zacb)localObject1).a.StartRow - 1, this.f));
            }
          }
          else if (((zacb)localObject1).e())
          {
            if (((zacb)localObject1).b()) {
              return (zaie)localObject2;
            }
            arrayOfzaie = new zaie[3];
            arrayOfzaie[0] = new zabo(32, new zbap(null, ((zacb)localObject1).b, ((zacb)localObject1).c));
            arrayOfzaie[1] = new zabo(32, new zbap(null, ((zacb)localObject1).a.StartRow - 1, this.f));
            arrayOfzaie[2] = new zabo(32, new zbap(null, this.e, ((zacb)localObject1).a.StartColumn - 1));
          }
          else
          {
            if (((zacb)localObject1).c()) {
              return (zaie)localObject2;
            }
            arrayOfzaie = new zaie[3];
            arrayOfzaie[0] = new zabo(32, new zbap(null, ((zacb)localObject1).b, ((zacb)localObject1).c));
            arrayOfzaie[1] = new zabo(32, new zbap(null, this.e, ((zacb)localObject1).a.StartColumn - 1));
            arrayOfzaie[2] = new zabo(32, new zbap(null, ((zacb)localObject1).a.StartRow - 1, this.f));
          }
          ((zabe)localObject2).a(arrayOfzaie, null);
          return (zaie)localObject2;
        }
      }
    }
    return zabg.a;
  }
  
  void a(Cell paramCell, Object paramObject)
  {
    zgs localzgs = new zgs();
    if (localzgs.a(paramObject, false))
    {
      this.c = localzgs.c;
      this.d = localzgs.d;
    }
    else
    {
      a(paramCell, localzgs);
    }
  }
  
  void a(Cell paramCell, zgs paramzgs)
  {
    switch (paramzgs.c)
    {
    case 1: 
      double d1 = zbxa.a((DateTime)paramzgs.d, paramCell.getWorksheet().d().getSettings().getDate1904());
      if (d1 < 0.0D)
      {
        this.c = 4;
        this.d = zs.a(paramzgs.d);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(d1);
      }
      break;
    case 4: 
      this.c = 4;
      this.d = paramzgs.d;
      break;
    default: 
      this.c = 4;
      this.d = zs.a(paramzgs.d);
    }
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    int i = this.e;
    if ((paramBoolean) && (i >= paramInt1)) {
      this.e += paramInt2;
    }
    if (a() != null) {
      a().a(paramWorksheet, paramBoolean, i, this.e, paramInt2, paramInt1);
    }
    zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, i, this.e, -1, -1, this.b);
  }
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    int i = this.f;
    if ((paramBoolean) && (i >= paramInt1)) {
      this.f = ((short)(this.f + (short)paramInt2));
    }
    if (a() != null) {
      a().b(paramWorksheet, paramBoolean, i, this.f, paramInt2, paramInt1);
    }
    zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, i, this.f, -1, -1, this.b);
  }
  
  void a(WorksheetCollection paramWorksheetCollection, int paramInt1, int paramInt2)
  {
    int i = this.e;
    int j = this.f;
    if (a() != null) {
      a().a(zaaq.a(a().c(), 0, -1, paramWorksheetCollection, paramInt1, paramInt2, i, j));
    }
    this.b = zaaq.a(this.b, 0, -1, paramWorksheetCollection, paramInt1, paramInt2, i, j);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    CellsHelper.a(localStringBuilder, this.e, this.f);
    localStringBuilder.append(": Flag=");
    ze.a(localStringBuilder, c());
    localStringBuilder.append("; Value=");
    localStringBuilder.append(this.d);
    if (k()) {
      localStringBuilder.append("; IsArrayHeader");
    } else if (l()) {
      localStringBuilder.append("; IsSharedHeader");
    } else if (d()) {
      localStringBuilder.append("; IsInArray");
    }
    if (h())
    {
      if (f()) {
        localStringBuilder.append("; IsSubtotal");
      }
      if (e()) {
        localStringBuilder.append("; IsVolatile");
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private class za
    implements zaha
  {
    private zaca b;
    private zfj c;
    private int d;
    private int e;
    private long f;
    private zgs g = new zgs();
    private boolean h;
    
    za(zaca paramzaca, long paramLong, zfj paramzfj)
    {
      this.b = paramzaca;
      this.f = paramLong;
      this.c = paramzfj;
      this.d = paramzfj.d.c();
      this.e = paramzfj.d.d();
      this.h = ((paramzaca.p.z) && (paramzaca.p.L.i != 0));
    }
    
    public boolean a(zt paramzt, int paramInt)
    {
      zgs localzgs = paramzt.a(paramInt, this.g, 5);
      if (localzgs.c == 5)
      {
        zaai localzaai = (zaai)localzgs.d;
        if (this.h) {
          this.b.p.a(this.b.n, localzaai);
        }
        int i = paramzt.i() - this.b.d;
        Object localObject;
        int j;
        if (i >= this.d)
        {
          if (this.d != 1)
          {
            localObject = zabc.g;
          }
          else
          {
            j = localzgs.a - this.b.e;
            if (j >= this.e)
            {
              if (this.e != 1) {
                localObject = zabc.g;
              } else {
                localObject = this.c.d.a(0, 0);
              }
            }
            else {
              localObject = this.c.d.a(0, j);
            }
          }
        }
        else
        {
          j = localzgs.a - this.b.e;
          if (j >= this.e)
          {
            if (this.e != 1) {
              localObject = zabc.g;
            } else {
              localObject = this.c.d.a(i, 0);
            }
          }
          else {
            localObject = this.c.d.a(i, j);
          }
        }
        localzaai.a((zaie)localObject, this.b);
        this.c.c -= 1;
        if (this.c.c == 0) {
          this.b.p.b(Long.valueOf(this.f));
        }
        return true;
      }
      return false;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */