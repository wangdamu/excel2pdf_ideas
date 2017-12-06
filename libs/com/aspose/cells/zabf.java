package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zabf
  extends zaau
{
  private Object b;
  private zaqg c;
  int a = 0;
  private int d;
  private zabu e;
  
  public zabf(int paramInt1, Name paramName, int paramInt2)
  {
    this.d = paramInt1;
    this.b = paramName;
    this.c = paramName.b;
    if (paramInt2 > -1) {
      this.a = (-paramInt2 - 1);
    }
  }
  
  public zabf(int paramInt1, zwh paramzwh, int paramInt2)
  {
    this.d = paramInt1;
    this.b = paramzwh;
    this.c = paramzwh.a;
    this.a = (paramInt2 + 1);
  }
  
  private zabf() {}
  
  public zaie m()
  {
    zabf localzabf = new zabf();
    localzabf.d = this.d;
    localzabf.b = this.b;
    localzabf.c = this.c;
    if (this.e != null) {
      localzabf.e = this.e.b();
    }
    return localzabf;
  }
  
  public void n()
  {
    if (this.e != null) {
      this.e.c();
    }
  }
  
  public boolean o()
  {
    return this.a > 0;
  }
  
  public zaqg p()
  {
    return this.c;
  }
  
  public int b()
  {
    return 8;
  }
  
  public Object c()
  {
    return this.b;
  }
  
  public Object b(zaca paramzaca)
  {
    zaie localzaie = d(paramzaca);
    return localzaie == this ? null : localzaie.b(paramzaca);
  }
  
  public int g()
  {
    return this.d;
  }
  
  public int a(zaca paramzaca)
  {
    zaie localzaie = this.c.a;
    if (localzaie != null) {
      return localzaie.a(paramzaca);
    }
    localzaie = l(paramzaca);
    return localzaie.a(paramzaca);
  }
  
  public boolean c(zaca paramzaca)
  {
    return l(paramzaca).c(paramzaca);
  }
  
  public int b(zaca paramzaca, boolean paramBoolean)
  {
    if (this.c.c) {
      return 0;
    }
    zaie localzaie = this.c.a;
    if (localzaie != null) {
      return localzaie.b(paramzaca, paramBoolean);
    }
    localzaie = l(paramzaca);
    return localzaie.b(paramzaca, paramBoolean);
  }
  
  public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.c.c)
    {
      if (this.e != null) {
        this.e.a = null;
      }
      return true;
    }
    zaie localzaie = this.c.a;
    if (localzaie == null) {
      return true;
    }
    if (localzaie.a(paramzaca, paramInt1, paramInt2, paramBoolean))
    {
      if (this.e != null) {
        this.e.a(paramzaca, paramInt1, paramInt2, paramBoolean);
      }
      return true;
    }
    return false;
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    zaie localzaie = this.c.a;
    if (localzaie != null) {
      return localzaie.c(paramzaca, paramBoolean);
    }
    localzaie = l(paramzaca);
    return localzaie.c(paramzaca, paramBoolean);
  }
  
  public void h()
  {
    this.d = 96;
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean j()
  {
    return true;
  }
  
  public byte a()
  {
    if (this.a != 0) {
      return 57;
    }
    return 35;
  }
  
  public boolean k()
  {
    return true;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.e == null) {
      this.e = new zabu();
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.e != null) {
      this.e.a();
    }
  }
  
  public zabu l()
  {
    return this.e;
  }
  
  public void a(zabu paramzabu)
  {
    this.e = paramzabu;
  }
  
  public zaie e(zaca paramzaca)
  {
    if ((this.e != null) && (this.e.a != null)) {
      return this.e.a;
    }
    Object localObject = a(d(paramzaca), paramzaca);
    if (localObject != this) {
      if (this.c.b)
      {
        localObject = zabc.e;
      }
      else if (((zaie)localObject).j())
      {
        paramzaca.p.a(this.c);
        localObject = ((zaie)localObject).d(paramzaca);
        paramzaca.p.h();
        if (paramzaca.p.z)
        {
          localObject = ((zaie)localObject).e(paramzaca);
          this.c.a.l().a();
        }
        else
        {
          localObject = ((zaie)localObject).e(paramzaca);
        }
      }
      else
      {
        localObject = ((zaie)localObject).e(paramzaca);
      }
    }
    if (this.e != null) {
      this.e.a = ((zaie)localObject);
    }
    return (zaie)localObject;
  }
  
  public zaie d(zaca paramzaca)
  {
    zaie localzaie = this.c.a;
    if (localzaie == null) {
      localzaie = l(paramzaca);
    } else if ((localzaie.l() != null) && (localzaie.l().a != null) && ((paramzaca.p.z) || (localzaie.b(paramzaca, false) != 3))) {
      localzaie.l().a();
    }
    return localzaie;
  }
  
  private zaie a(zaie paramzaie, zaca paramzaca)
  {
    if ((paramzaie.b() == 9) && (!o()) && (((Name)this.b).getSheetIndex() > 0))
    {
      zbap localzbap = ((zabo)paramzaie).o();
      zwp localzwp = localzbap.a();
      if ((localzwp != null) && ((localzwp.b & 0xFFFF) == 65534) && ((localzwp.c & 0xFFFF) == 65534) && (paramzaca.p.e.w().a(localzwp.a & 0xFFFF).a() == 5))
      {
        localzbap = new zbap(localzbap);
        int i = ((Name)this.b).getSheetIndex() - 1;
        localzbap.a(paramzaca.c(i));
        paramzaie = new zabo(g(), localzbap);
      }
    }
    return paramzaie;
  }
  
  private zaca k(zaca paramzaca)
  {
    if (paramzaca.b == this.c) {
      return paramzaca;
    }
    zaca localzaca = new zaca(paramzaca);
    if ((!localzaca.h) || (localzaca.l.c()))
    {
      localzaca.h = true;
      if ((localzaca.l.c()) || (localzaca.l.b())) {
        localzaca.l = CellArea.createCellArea(paramzaca.d, paramzaca.e, paramzaca.d + 2, paramzaca.e + 2);
      }
    }
    localzaca.a(this.c);
    return localzaca;
  }
  
  public boolean f(zaca paramzaca)
  {
    return d(paramzaca).f(paramzaca);
  }
  
  public boolean g(zaca paramzaca)
  {
    return d(paramzaca).g(paramzaca);
  }
  
  public boolean h(zaca paramzaca)
  {
    return d(paramzaca).h(paramzaca);
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    return d(paramzaca).a(paramArrayOfInt, paramzaca, paramBoolean);
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    return d(paramzaca).a(paramArrayOfInt, paramzaca);
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    return d(paramzaca).b(paramArrayOfInt, paramzaca);
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    paramzaca = k(paramzaca);
    return d(paramzaca).a(paramzaca, paramBoolean);
  }
  
  private zaie l(zaca paramzaca)
  {
    if (this.c.a != null) {
      return this.c.a;
    }
    Object localObject1;
    Object localObject2;
    if (this.a > 0)
    {
      if (this.c.a(null))
      {
        if (((zwh)this.b).a().a() != 0) {
          localObject1 = zabc.c;
        } else {
          localObject1 = zabc.e;
        }
      }
      else
      {
        localObject2 = this.c.e;
        int i = paramzaca.p.g ? 2 : 4;
        zbap localzbap;
        int j;
        switch (localObject2[i])
        {
        case 58: 
        case 90: 
        case 122: 
          localzbap = new zbap();
          localzbap.a(paramzaca.a(paramzaca.p.e.r().b(this.a - 1).a & 0xFFFF, zc.e((byte[])localObject2, i + 1) & 0xFFFF, zc.e((byte[])localObject2, i + 3) & 0xFFFF));
          localzbap.a(zc.e((byte[])localObject2, i + 5));
          localzbap.b(zc.e((byte[])localObject2, i + 7) & 0xFFFF & 0x3FFF);
          j = localObject2[(i + 8)];
          localzbap.a((j & 0xFF & 0x80) == 0);
          localzbap.b((j & 0xFF & 0x40) == 0);
          localzbap.t();
          localObject1 = new zabo(zabt.a(localObject2[i]), localzbap);
          break;
        case 59: 
        case 91: 
        case 123: 
          localzbap = new zbap();
          localzbap.a(paramzaca.a(paramzaca.p.e.r().b(this.a - 1).a & 0xFFFF, zc.e((byte[])localObject2, i + 1) & 0xFFFF, zc.e((byte[])localObject2, i + 3) & 0xFFFF));
          localzbap.a(zc.e((byte[])localObject2, i + 5));
          localzbap.c(zc.e((byte[])localObject2, i + 7));
          localzbap.b(zc.e((byte[])localObject2, i + 9) & 0xFFFF & 0x3FFF);
          localzbap.d(zc.e((byte[])localObject2, i + 11) & 0xFFFF & 0x3FFF);
          j = localObject2[(i + 10)];
          localzbap.a((j & 0xFF & 0x80) == 0);
          localzbap.b((j & 0xFF & 0x40) == 0);
          j = localObject2[(i + 12)];
          localzbap.c((j & 0xFF & 0x80) == 0);
          localzbap.d((j & 0xFF & 0x40) == 0);
          localObject1 = new zabo(zabt.a(localObject2[i]), localzbap);
          break;
        case 28: 
          localObject1 = zabc.a(localObject2[(i + 1)]);
          break;
        case 60: 
        case 61: 
        case 92: 
        case 93: 
        case 124: 
        case 125: 
          localObject1 = zabc.c;
          break;
        default: 
          localObject1 = zabc.e;
        }
      }
    }
    else if (this.c.a(null))
    {
      localObject1 = zabc.e;
    }
    else
    {
      paramzaca = k(paramzaca);
      localObject2 = new zaag(paramzaca, this.c.e, 0, -1, false);
      localObject1 = ((zaag)localObject2).a();
    }
    if (!this.c.c)
    {
      localObject1 = a((zaie)localObject1, paramzaca);
      switch (((zaie)localObject1).b(paramzaca, 32))
      {
      case 0: 
        if (this.c.b) {
          localObject1 = zabc.e;
        } else if (((zaie)localObject1).j()) {
          if (paramzaca.p.o)
          {
            paramzaca.p.a(this.c);
            paramzaca = k(paramzaca);
            localObject2 = ((zaie)localObject1).d(paramzaca);
            paramzaca.p.h();
            if (localObject2 != localObject1)
            {
              localObject1 = localObject2;
              break;
            }
          }
          else
          {
            paramzaca.p.a(this.c);
            paramzaca = k(paramzaca);
            localObject1 = a(((zaie)localObject1).d(paramzaca), paramzaca);
            paramzaca.p.h();
          }
        }
        this.c.a = ((zaie)localObject1);
        break;
      case 1: 
        this.c.a = ((zaie)localObject1);
        break;
      default: 
        this.c.c = true;
      }
    }
    if (((zaie)localObject1).b() != 9) {
      ((zaie)localObject1).h();
    }
    return (zaie)localObject1;
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    if (this.c.b) {
      return 0;
    }
    if (this.c.c) {
      return 2;
    }
    Object localObject = this.c.a;
    if (localObject != null) {
      return ((zaie)localObject).b(paramzaca, paramInt);
    }
    if (this.c.a(paramzaca.p.e))
    {
      if ((this.a > 0) && (((zwh)this.b).a().a() != 0)) {
        localObject = zabc.c;
      } else {
        localObject = zabc.e;
      }
      this.c.a = ((zaie)localObject);
      return 0;
    }
    paramzaca = k(paramzaca);
    zaag localzaag = new zaag(paramzaca, this.c.e, 0, -1, false);
    paramzaca.p.a(this.c);
    localObject = localzaag.a();
    paramzaca.p.h();
    return ((zaie)localObject).b(paramzaca, paramInt);
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    Object localObject;
    if (this.a > 0)
    {
      localObject = (zwh)this.b;
      zwp localzwp;
      switch (((zwh)localObject).a().a())
      {
      case 0: 
        if (paramzaah != null)
        {
          localzwp = paramzaah.u.r().b(this.a - 1);
          zabq.a(paramzaah, localzwp.a & 0xFFFF, localzwp.b & 0xFFFF, localzwp.c & 0xFFFF, paramzahh);
        }
        paramzahh.a('!');
        break;
      case 3: 
        localzwp = null;
        String str = null;
        String[] arrayOfString1 = { localzwp };
        String[] arrayOfString2 = { str };
        ((zwh)localObject).a().a(arrayOfString1, arrayOfString2);
        localzwp = arrayOfString1[0];
        str = arrayOfString2[0];
        paramzahh.a(localzwp);
        paramzahh.a("|");
        paramzahh.a(str);
        paramzahh.a('!');
        break;
      }
      paramzahh.a(((zwh)localObject).e());
    }
    else
    {
      localObject = (Name)this.b;
      if (((Name)localObject).getSheetIndex() > 0)
      {
        int i = ((Name)localObject).getSheetIndex() - 1;
        if (paramzaah != null)
        {
          if (this.a >= 0)
          {
            if ((paramzaah.c == null ? -1 : paramzaah.c.getIndex()) == i) {}
          }
          else
          {
            paramzahh.a(paramzaah.u.get(i).getName());
            paramzahh.a('!');
          }
        }
        else
        {
          paramzahh.a(((Name)localObject).h().get(i).getName());
          paramzahh.a('!');
        }
      }
      paramzahh.a(((Name)localObject).getText());
    }
  }
  
  public boolean a(zaie paramzaie)
  {
    if (paramzaie.b() != 8) {
      return false;
    }
    zabf localzabf = (zabf)paramzaie;
    return this.b == localzabf.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */