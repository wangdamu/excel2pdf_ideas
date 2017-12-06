package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import java.util.Stack;

class zaag
{
  private zaca a;
  private boolean b;
  private zacc c;
  private Stack d;
  private byte[] e;
  private int f;
  private boolean g;
  private int h = -1;
  
  zaag(zaca paramzaca, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramzaca;
    this.b = paramzaca.p.L.l;
    this.g = this.b;
    this.d = new Stack();
    this.e = paramArrayOfByte;
    this.c = paramzaca.j();
    this.c.a(this.e, paramInt1, paramInt2);
  }
  
  zaag(zaca paramzaca, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.a = paramzaca;
    this.b = paramBoolean;
    this.g = this.b;
    this.d = new Stack();
    this.e = paramArrayOfByte;
    this.c = paramzaca.j();
    this.c.a(this.e, paramInt1, paramInt2);
  }
  
  zaag(zaca paramzaca, byte[] paramArrayOfByte, zacc paramzacc)
  {
    this.a = paramzaca;
    this.b = paramzaca.p.L.l;
    this.g = this.b;
    this.d = new Stack();
    this.e = paramArrayOfByte;
    this.c = paramzacc;
  }
  
  public zaie a()
  {
    if (this.e == null) {
      return zabg.a;
    }
    if (!c()) {
      return zabg.a;
    }
    if (this.d.size() != 1) {
      a("More than one token in stack");
    }
    return (zaie)this.d.pop();
  }
  
  private boolean c()
  {
    while (this.c.h())
    {
      this.f = this.c.e();
      Object localObject;
      switch (this.e[this.f])
      {
      case 1: 
      case 2: 
        return false;
      case 3: 
        a(zabk.z());
        break;
      case 4: 
        a(zabk.D());
        break;
      case 5: 
        a(zabk.E());
        break;
      case 6: 
        a(zabk.A());
        break;
      case 7: 
        a(zabk.F());
        break;
      case 8: 
        a(zabk.x());
        break;
      case 9: 
        a(zabi.u());
        break;
      case 10: 
        a(zabi.t());
        break;
      case 11: 
        a(zabi.q());
        break;
      case 12: 
        a(zabi.r());
        break;
      case 13: 
        a(zabi.s());
        break;
      case 14: 
        a(zabi.v());
        break;
      case 15: 
        b(zabk.C());
        break;
      case 16: 
        b(zabk.y());
        break;
      case 17: 
        b(zabk.B());
        break;
      case 21: 
        this.c.b(this.f + 1);
        break;
      case 19: 
        a(zabm.s());
        break;
      case 18: 
        a(zabm.t());
        break;
      case 20: 
        a(zabm.r());
        break;
      case 22: 
        this.d.push(zabg.a);
        this.c.b(this.f + 1);
        break;
      case 23: 
        this.d.push(new zabp(this.c.b()));
        break;
      case 24: 
        switch (this.e[(this.f + 1)])
        {
        case 25: 
          this.d.push(new zabs(this.e, this.f));
          this.c.b(this.f + 14);
          break;
        case 29: 
          this.d.push(new zabr(this.e, this.f));
          this.c.b(this.f + 6);
          break;
        case 7: 
          this.d.push(new zaaz(this.e, this.f, 6));
          this.c.b(this.f + 6);
          break;
        default: 
          this.d.push(zabg.a);
          this.c.b(this.f + 6);
        }
        break;
      case 25: 
        switch (this.e[(this.f + 1)])
        {
        case 16: 
          localObject = new zabe(64, zacm.a(4));
          ((zabe)localObject).a(new zaie[] { (zaie)this.d.pop() }, null);
          if (this.g) {
            this.d.push(((zabe)localObject).d(this.a));
          } else {
            this.d.push(localObject);
          }
          this.c.b(this.f + 4);
          break;
        case 2: 
          localObject = (zaie)this.d.peek();
          if ((this.g) && (((zaie)localObject).g() == 64) && (!((zaie)localObject).c(this.a))) {
            e();
          } else {
            this.c.b(this.f + 4);
          }
          break;
        case 4: 
          localObject = (zaie)this.d.peek();
          if ((this.g) && (((zaie)localObject).g() == 64) && (!((zaie)localObject).c(this.a)))
          {
            d();
          }
          else
          {
            int i = zc.e(this.e, this.f + 2) & 0xFFFF;
            this.c.b(this.f + i * 2 + 6);
          }
          break;
        default: 
          this.c.k();
        }
        break;
      case 28: 
        localObject = zabc.a(this.e[(this.f + 1)]);
        this.d.push(localObject);
        this.c.b(this.f + 2);
        break;
      case 29: 
        localObject = this.e[(this.f + 1)] != 0 ? zaba.a : zaba.b;
        this.d.push(localObject);
        this.c.b(this.f + 2);
        break;
      case 30: 
        this.d.push(new zabb(zc.e(this.e, this.f + 1)));
        this.c.b(this.f + 3);
        break;
      case 31: 
        this.d.push(new zabb(zc.f(this.e, this.f + 1)));
        this.c.b(this.f + 9);
        break;
      case 32: 
      case 64: 
      case 96: 
        this.d.push(new zaax(this.c.a()));
        break;
      case 33: 
      case 65: 
      case 97: 
        a(zc.e(this.e, this.f + 1) & 0xFFFF, -1);
        this.c.b(this.f + 3);
        break;
      case 34: 
      case 66: 
      case 98: 
        a(zc.e(this.e, this.f + 2) & 0xFFFF, this.c.d());
        this.c.b(this.f + 4);
        break;
      case 35: 
      case 57: 
      case 67: 
      case 89: 
      case 99: 
      case 121: 
        localObject = this.c.a(this.a.p.d);
        this.d.push(localObject);
        if ((this.g) && (((zabf)localObject).p().e == null))
        {
          zacm localzacm = zacm.a(((zabf)localObject).p().f);
          if ((localzacm != null) && (localzacm.b() == 488))
          {
            this.g = false;
            this.h = this.d.size();
          }
        }
        break;
      case 36: 
      case 37: 
      case 44: 
      case 45: 
      case 58: 
      case 59: 
      case 68: 
      case 69: 
      case 76: 
      case 77: 
      case 90: 
      case 91: 
      case 100: 
      case 101: 
      case 108: 
      case 109: 
      case 122: 
      case 123: 
        this.d.push(new zabo(zabt.a(this.e[this.f]), this.c.a(this.a)));
        break;
      case 42: 
      case 43: 
      case 60: 
      case 61: 
      case 74: 
      case 75: 
      case 92: 
      case 93: 
      case 106: 
      case 107: 
      case 124: 
      case 125: 
        this.d.push(this.c.c());
        break;
      case 26: 
      case 27: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
      case 62: 
      case 63: 
      case 70: 
      case 71: 
      case 72: 
      case 73: 
      case 78: 
      case 79: 
      case 80: 
      case 81: 
      case 82: 
      case 83: 
      case 84: 
      case 85: 
      case 86: 
      case 87: 
      case 88: 
      case 94: 
      case 95: 
      case 102: 
      case 103: 
      case 104: 
      case 105: 
      case 110: 
      case 111: 
      case 112: 
      case 113: 
      case 114: 
      case 115: 
      case 116: 
      case 117: 
      case 118: 
      case 119: 
      case 120: 
      default: 
        if (!this.c.k()) {
          return false;
        }
        break;
      }
    }
    return true;
  }
  
  zacc b()
  {
    return this.c;
  }
  
  private void d()
  {
    int i = zc.e(this.e, this.f + 2) & 0xFFFF;
    zaie localzaie = ((zaie)this.d.pop()).e(this.a);
    if (localzaie == null)
    {
      this.d.push(zabc.f);
    }
    else if (localzaie.b() == 0)
    {
      this.d.push(localzaie);
    }
    else
    {
      zabb localzabb = localzaie.a(this.a, 7);
      if (localzabb == null)
      {
        this.d.push(zabc.f);
      }
      else
      {
        int j = (int)localzabb.o();
        if ((j > 0) && (j <= i))
        {
          this.f += 4;
          j <<= 1;
          int k = this.c.g();
          this.c.b(this.f + (zc.e(this.e, this.f + j - 2) & 0xFFFF));
          this.c.d(this.f + (zc.e(this.e, this.f + j) & 0xFFFF) - 4);
          if (!c()) {
            a("Absent parameter for CHOOSE function");
          }
          this.c.b(this.c.g() + (zc.e(this.e, this.c.g() + 2) & 0xFFFF) + 5);
          this.c.d(k);
          return;
        }
        this.d.push(zabc.f);
      }
    }
    this.c.b(this.f + 8 + (zc.e(this.e, this.f + 4 + (i << 1)) & 0xFFFF));
  }
  
  private void e()
  {
    zaie localzaie = ((zaie)this.d.pop()).e(this.a);
    int i = this.f + (zc.e(this.e, this.f + 2) & 0xFFFF);
    if ((this.e[i] != 25) || (this.e[(i + 1)] != 8)) {
      a("Absent TAttrSkip for tAttrIf");
    }
    boolean bool = false;
    int j = 0;
    if (localzaie.b() == 0)
    {
      j = 1;
      this.d.push(localzaie);
    }
    else
    {
      zaba localzaba = localzaie.j(this.a);
      if (localzaba == null)
      {
        j = 1;
        this.d.push(zabc.f);
      }
      else
      {
        bool = localzaba.o();
      }
    }
    if (j != 0)
    {
      this.c.b(i + (zc.e(this.e, i + 2) & 0xFFFF) + 5);
      return;
    }
    int k;
    if (bool)
    {
      k = this.c.g();
      this.c.b(this.f + 4);
      this.c.d(i);
      if (!c()) {
        a("Absent parameter for TRUE of IF function");
      }
      this.c.b(i + (zc.e(this.e, i + 2) & 0xFFFF) + 5);
      this.c.d(k);
    }
    else
    {
      k = (zc.e(this.e, i + 2) & 0xFFFF) + 1;
      if (k == 4)
      {
        this.d.push(zaba.b);
        this.c.b(i + 8);
      }
      else
      {
        i += 4;
        k += i;
        this.c.b(i);
        int m = this.c.g();
        this.c.d(k - 8);
        if (!c()) {
          a("Absent parameter for FALSE of IF function");
        }
        this.c.b(k);
        this.c.d(m);
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    zabe localzabe = null;
    Object localObject;
    if (paramInt1 == 255)
    {
      if (paramInt2 > this.d.size()) {
        b(paramInt1, paramInt2 - 1);
      }
      localObject = null;
      if (paramInt2 > 1)
      {
        localObject = new zaie[paramInt2 - 1];
        for (int i = localObject.length - 1; i > -1; i--) {
          localObject[i] = ((zaie)this.d.pop());
        }
      }
      zaie localzaie = (zaie)this.d.pop();
      switch (localzaie.b())
      {
      case 8: 
        zacm localzacm = zacm.a(((zabf)localzaie).p().f);
        if (localzacm == null)
        {
          localzacm = zacm.b(((zabf)localzaie).p().f);
        }
        else if ((this.b) && (!this.g) && (localzacm.b() == 488) && (this.h >= this.d.size()))
        {
          this.g = true;
          this.h = -1;
        }
        localzabe = new zabe(zabt.a(this.e[this.f]), localzacm);
        break;
      case 7: 
        localzabe = (zabe)localzaie;
        break;
      case 9: 
        this.d.push(zabc.c);
        return;
      default: 
        this.d.push(zabc.e);
        return;
      }
      if (paramInt2 > 1) {
        localzabe.a((zaie[])localObject, this.a);
      }
    }
    else
    {
      localObject = null;
      if (paramInt2 == -1)
      {
        localObject = zacm.a(paramInt1);
        if (localObject == null) {
          throw new CellsException(5, "Formula error: unknown function with id[" + paramInt1 + "]");
        }
        paramInt2 = ((zacm)localObject).c().c();
      }
      else if ((paramInt1 & 0x8000) == 0)
      {
        localObject = zacm.a(paramInt1);
        if (localObject == null) {
          throw new CellsException(5, "Formula error: unknown function with id[" + paramInt1 + "]");
        }
      }
      else
      {
        if (paramInt2 > this.d.size()) {
          b(paramInt1, paramInt2);
        }
        if (paramInt2 > 0) {
          for (int j = paramInt2 - 1; j > -1; j--) {
            this.d.pop();
          }
        }
        this.d.push(zabc.e);
        return;
      }
      if (paramInt2 > this.d.size()) {
        b(paramInt1, paramInt2);
      }
      localzabe = new zabe(zabt.a(this.e[this.f]), (zacm)localObject);
      if (paramInt2 > 0)
      {
        zaie[] arrayOfzaie = new zaie[paramInt2];
        for (int k = paramInt2 - 1; k > -1; k--) {
          arrayOfzaie[k] = ((zaie)this.d.pop());
        }
        localzabe.a(arrayOfzaie, this.a);
      }
    }
    if ((this.g) && (localzabe.g() == 64)) {
      this.d.push(localzabe.d(this.a));
    } else {
      this.d.push(localzabe);
    }
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    throw new CellsException(5, zs.a(this.a.c(null).append("-Invalid formula: expected ").append(paramInt2).append(" but was ").append(this.d.size()).append(" parameters for function[").append(paramInt1).append(']')));
  }
  
  private void a(String paramString)
  {
    throw new CellsException(5, zs.a(this.a.c(null).append("-Invalid formula: ").append(paramString)));
  }
  
  private void a(zabk paramzabk)
  {
    paramzabk.d((zaie)this.d.pop());
    paramzabk.c((zaie)this.d.pop());
    if ((this.g) && (paramzabk.g() != 96)) {
      this.d.push(paramzabk.d(this.a));
    } else {
      this.d.push(paramzabk);
    }
    this.c.b(this.f + 1);
  }
  
  private void a(zabm paramzabm)
  {
    paramzabm.c((zaie)this.d.pop());
    if ((this.g) && (paramzabm.g() != 96)) {
      this.d.push(paramzabm.d(this.a));
    } else {
      this.d.push(paramzabm);
    }
    this.c.b(this.f + 1);
  }
  
  private void b(zabk paramzabk)
  {
    paramzabk.d((zaie)this.d.pop());
    paramzabk.c((zaie)this.d.pop());
    if (this.g) {
      this.d.push(paramzabk.d(this.a));
    } else {
      this.d.push(paramzabk);
    }
    this.c.b(this.f + 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */