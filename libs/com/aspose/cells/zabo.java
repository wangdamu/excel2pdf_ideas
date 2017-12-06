package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;
import java.util.Iterator;

class zabo
  extends zaau
{
  private zbap a;
  private int b;
  private zabu c;
  
  public zabo(int paramInt, zbap paramzbap)
  {
    this.a = paramzbap;
    this.b = paramInt;
  }
  
  public zaie m()
  {
    return new zabo(this.b, new zbap(this.a));
  }
  
  public zbap o()
  {
    return this.a;
  }
  
  public int b()
  {
    return 9;
  }
  
  public Object c()
  {
    return this.a;
  }
  
  public boolean k()
  {
    return true;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.c == null) {
      this.c = new zabu();
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public zabu l()
  {
    return this.c;
  }
  
  public void a(zabu paramzabu)
  {
    this.c = paramzabu;
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    if (this.a.l()) {
      return 2;
    }
    if (this.a.a() == null) {
      return 1;
    }
    if (this.a.a(paramzaca) == null) {
      return 2;
    }
    if ((paramInt != 96) && (!this.a.m())) {
      return 1;
    }
    return 0;
  }
  
  public int b(zaca paramzaca, boolean paramBoolean)
  {
    if (this.a.j())
    {
      if (this.a.k()) {
        return 0;
      }
      return (paramBoolean) || (this.a.m()) ? 2 : 0;
    }
    if (this.a.k()) {
      return (paramBoolean) || (this.a.m()) ? 1 : 0;
    }
    return (paramBoolean) || (this.a.m()) ? 3 : 0;
  }
  
  public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    if (paramzaca.d != paramInt1)
    {
      if (!this.a.c())
      {
        this.a.a(this.a.b() + paramzaca.d - paramInt1);
        i = 1;
      }
      if (!this.a.g())
      {
        this.a.c(this.a.f() + paramzaca.d - paramInt1);
        i = 1;
      }
    }
    if (paramzaca.e != paramInt2)
    {
      if (!this.a.e())
      {
        this.a.b(this.a.d() + paramzaca.e - paramInt2);
        i = 1;
      }
      if (!this.a.i())
      {
        this.a.d(this.a.h() + paramzaca.e - paramInt2);
        i = 1;
      }
    }
    if (i != 0)
    {
      if (this.c != null)
      {
        this.c.a = null;
        if (this.c.b != null) {
          this.c.b.a(paramzaca);
        }
      }
      return true;
    }
    if (paramBoolean) {
      return false;
    }
    if (((paramzaca.d != paramInt1) && (this.a.q() > 1)) || ((paramzaca.e != paramInt2) && (this.a.p() > 1)))
    {
      if (this.c != null) {
        this.c.a = null;
      }
      return true;
    }
    return false;
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    if (paramBoolean) {
      return true;
    }
    if (this.c == null) {
      this.c = new zabu();
    } else if (this.c.a != null) {
      return this.c.a.c(paramzaca, paramBoolean);
    }
    zwp localzwp = this.a.a(paramzaca);
    Object localObject;
    if ((localzwp != null) && (localzwp.b != localzwp.c)) {
      localObject = zabc.c;
    } else if (this.b == 96) {
      localObject = b(paramzaca, localzwp, this.a.b(), this.a.d(), true, false);
    } else {
      localObject = a(paramzaca, localzwp, paramzaca.d, paramzaca.e, false, false);
    }
    this.c.a = ((zaie)localObject);
    return ((zaie)localObject).c(paramzaca, paramBoolean);
  }
  
  public Object b(zaca paramzaca)
  {
    return new ReferredArea(this.a, paramzaca);
  }
  
  public int g()
  {
    return this.b;
  }
  
  public int a(zaca paramzaca)
  {
    return 32;
  }
  
  public void h()
  {
    this.b = 96;
  }
  
  public byte a()
  {
    return -1;
  }
  
  public zabb a(zaca paramzaca, int paramInt)
  {
    zaie localzaie = e(paramzaca);
    if (localzaie == null)
    {
      if (zabt.d(paramInt)) {
        return new zabb(0.0D);
      }
      return null;
    }
    return localzaie.a(paramzaca, paramInt);
  }
  
  public zabp i(zaca paramzaca)
  {
    zaie localzaie = e(paramzaca);
    if (localzaie == null) {
      return new zabp("");
    }
    return localzaie.i(paramzaca);
  }
  
  public zaba j(zaca paramzaca)
  {
    zaie localzaie = e(paramzaca);
    if (localzaie == null) {
      return zaba.b;
    }
    return localzaie.j(paramzaca);
  }
  
  public zaie e(zaca paramzaca)
  {
    Object localObject;
    if (this.c == null)
    {
      this.c = new zabu();
    }
    else if (this.c.a != null)
    {
      if ((paramzaca.p.o) && (paramzaca.a == 0))
      {
        localObject = this.a.a(paramzaca);
        if ((localObject == null) || ((((zwp)localObject).a & 0xFFFF) == paramzaca.p.f)) {
          paramzaca.b(localObject == null ? paramzaca.n : ((zwp)localObject).b & 0xFFFF, this.a.b(), this.a.d());
        }
      }
      return this.c.a.e(paramzaca);
    }
    zwp localzwp = this.a.a(paramzaca);
    if ((localzwp != null) && (localzwp.b != localzwp.c)) {
      localObject = zabc.c;
    } else if ((this.b == 96) || (paramzaca.a == 5)) {
      localObject = b(paramzaca, localzwp, this.a.b(), this.a.d(), false, true);
    } else {
      localObject = a(paramzaca, localzwp, paramzaca.d, paramzaca.e, true, true);
    }
    if ((!paramzaca.p.s) && (!paramzaca.p.z)) {
      this.c.a = ((zaie)localObject);
    }
    return (zaie)localObject;
  }
  
  private zaie a(zaca paramzaca, zwp paramzwp, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!this.a.n())
    {
      if (!this.a.e(paramInt1)) {
        return zabc.f;
      }
      if (!this.a.o())
      {
        if (!this.a.f(paramInt2)) {
          return zabc.f;
        }
      }
      else {
        paramInt2 = this.a.d();
      }
    }
    else if (!this.a.o())
    {
      if (!this.a.f(paramInt2)) {
        return zabc.f;
      }
      paramInt1 = this.a.b();
    }
    else
    {
      paramInt1 = this.a.b();
      paramInt2 = this.a.d();
    }
    Object localObject1;
    Object localObject3;
    if (paramzwp == null)
    {
      if ((paramBoolean2) && (paramzaca.p.o) && (paramzaca.a == 0)) {
        paramzaca.g.a.f.a(((zaai)paramzaca.b).a, paramzaca.n, paramInt1, paramInt2);
      }
      if (paramzaca.p.z)
      {
        long l1 = Cell.a(paramzaca.g.g().getIndex(), paramInt1, paramInt2);
        Object localObject2 = paramzaca.p.y.get(Long.valueOf(l1));
        if (localObject2 != null)
        {
          paramzaca.p.b(l1);
          return (zaie)localObject2;
        }
      }
      localObject1 = paramzaca.g.getRows().a.a(paramInt1, new zgs(paramInt2), 4);
      if (localObject1 == null) {
        return zabg.a;
      }
      if (((zgs)localObject1).c == 5)
      {
        zaai localzaai1 = (zaai)((zgs)localObject1).d;
        if (paramzaca.p.L.m)
        {
          int i = paramzaca.c.getIndex();
          if (!paramBoolean1)
          {
            if (localzaai1.a(paramzaca, i)) {
              return new zabd(i, localzaai1);
            }
          }
          else if (localzaai1.b(paramzaca, i))
          {
            localObject3 = new zaca(paramzaca);
            localzaai1.b((zaca)localObject3);
          }
          return localzaai1.m();
        }
        if (localzaai1.c == 0)
        {
          if (paramzaca.p.L.n.a) {
            zl.a(zs.a(paramzaca.b(new StringBuilder(128).append("Null value of cell formula was used without recursive calculation, take it as 0: "))));
          }
          return zabb.a;
        }
      }
      return zabt.a(((zgs)localObject1).c, ((zgs)localObject1).d);
    }
    if ((paramzwp.a & 0xFFFF) == paramzaca.p.f)
    {
      if ((paramzwp.b & 0xFFFF) >= paramzaca.p.e.getCount()) {
        return zabc.c;
      }
      if ((paramBoolean2) && (paramzaca.p.o) && (paramzaca.a == 0)) {
        paramzaca.g.a.f.a(((zaai)paramzaca.b).a, paramzwp.b & 0xFFFF, paramInt1, paramInt2);
      }
      localObject1 = paramzaca.p.e.get(paramzwp.b & 0xFFFF).getCells();
      if (paramzaca.p.z)
      {
        long l2 = Cell.a(((Cells)localObject1).g().getIndex(), paramInt1, paramInt2);
        localObject3 = paramzaca.p.y.get(Long.valueOf(l2));
        if (localObject3 != null)
        {
          paramzaca.p.b(l2);
          return (zaie)localObject3;
        }
      }
      zgs localzgs = ((Cells)localObject1).getRows().a.a(paramInt1, new zgs(paramInt2), 4);
      if (localzgs == null) {
        return zabg.a;
      }
      if (localzgs.c == 5)
      {
        zaai localzaai2 = (zaai)localzgs.d;
        if (paramzaca.p.L.m)
        {
          int j = ((Cells)localObject1).g().getIndex();
          if (!paramBoolean1)
          {
            if (localzaai2.a(paramzaca, j)) {
              return new zabd(j, localzaai2);
            }
          }
          else if (localzaai2.b(paramzaca, j))
          {
            zaca localzaca = new zaca(paramzaca);
            if (localzaca.c != ((Cells)localObject1).g()) {
              localzaca.a(((Cells)localObject1).g());
            }
            localzaai2.b(localzaca);
          }
          return localzaai2.m();
        }
        if (localzaai2.c == 0)
        {
          if (paramzaca.p.L.n.a) {
            zl.a(zs.a(paramzaca.b(new StringBuilder(128).append("Null value of cell formula was used without recursive calculation, take it as 0: "))));
          }
          return zabb.a;
        }
      }
      return zabt.a(localzgs.c, localzgs.d);
    }
    return zabt.a(paramzaca, paramzwp.a & 0xFFFF, paramzwp.b & 0xFFFF, paramInt1, paramInt2);
  }
  
  private zaie b(zaca paramzaca, zwp paramzwp, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramzwp == null)
    {
      if ((paramBoolean2) && (paramzaca.p.o) && (paramzaca.a == 0)) {
        paramzaca.g.a.f.a(((zaai)paramzaca.b).a, paramzaca.n, paramInt1, paramInt2);
      }
      return zabt.a(paramzaca.g, paramInt1, paramInt2, paramBoolean1, paramzaca);
    }
    if ((paramzwp.a & 0xFFFF) == paramzaca.p.f)
    {
      if ((paramzwp.b & 0xFFFF) >= paramzaca.p.e.getCount()) {
        return zabc.c;
      }
      if ((paramBoolean2) && (paramzaca.p.o) && (paramzaca.a == 0)) {
        paramzaca.g.a.f.a(((zaai)paramzaca.b).a, paramzwp.b & 0xFFFF, paramInt1, paramInt2);
      }
      return zabt.a(paramzaca.p.e.get(paramzwp.b & 0xFFFF).getCells(), paramInt1, paramInt2, paramBoolean1, paramzaca);
    }
    return zabt.a(paramzaca, paramzwp.a & 0xFFFF, paramzwp.b & 0xFFFF, paramInt1, paramInt2);
  }
  
  boolean k(zaca paramzaca)
  {
    zwp localzwp = this.a.a(paramzaca);
    return a(localzwp, paramzaca);
  }
  
  boolean a(zwp paramzwp, zaca paramzaca)
  {
    if (paramzwp == null) {
      return false;
    }
    if ((paramzwp.a & 0xFFFF) == paramzaca.p.f) {
      return (Math.max(paramzwp.b, paramzwp.c) & 0xFFFF) >= paramzaca.p.e.getCount();
    }
    if (paramzaca.a == 5) {
      return true;
    }
    zbti localzbti = paramzaca.p.e.w().a(paramzwp.a & 0xFFFF);
    if ((localzbti.c() == null) || ((Math.max(paramzwp.b, paramzwp.c) & 0xFFFF) >= localzbti.c().length)) {
      return true;
    }
    if ((paramzwp.c & 0xFFFF) > (paramzwp.b & 0xFFFF)) {
      for (int i = paramzwp.b & 0xFFFF; i <= (paramzwp.c & 0xFFFF); i++) {
        if (localzbti.c(i) == null) {
          return true;
        }
      }
    } else if (localzbti.c(paramzwp.b & 0xFFFF) == null) {
      return true;
    }
    return false;
  }
  
  public zaie d(zaca paramzaca)
  {
    if (k(paramzaca)) {
      return zabc.c;
    }
    return this;
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean f(zaca paramzaca)
  {
    return this.a.m();
  }
  
  public boolean g(zaca paramzaca)
  {
    return this.a.q() == 1;
  }
  
  public boolean h(zaca paramzaca)
  {
    return this.a.p() == 1;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    if ((this.a.q() == 1) && (this.a.p() == 1))
    {
      paramArrayOfInt[0] = 1;
      paramArrayOfInt[1] = 1;
      return this;
    }
    int i = paramArrayOfInt[0] + this.a.b();
    int j = paramArrayOfInt[1] + this.a.d();
    paramArrayOfInt[0] = this.a.q();
    paramArrayOfInt[1] = this.a.p();
    if ((i > this.a.f()) || (j > this.a.h())) {
      return zabc.g;
    }
    Object localObject;
    if (paramBoolean)
    {
      localObject = new zbap(this.a.a(), i, j, i, j);
      return new zabo(this.b, (zbap)localObject);
    }
    if ((paramzaca.p.o) && (paramzaca.a == 0))
    {
      localObject = this.a.a();
      if ((localObject == null) || ((((zwp)localObject).a & 0xFFFF) == paramzaca.p.f)) {
        paramzaca.b(localObject == null ? paramzaca.n : ((zwp)localObject).b & 0xFFFF, this.a.b(), this.a.d());
      }
    }
    return b(paramzaca, this.a.a(paramzaca), i, j, true, true);
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    if (this.a.q() == 1)
    {
      paramArrayOfInt[0] = 1;
      return this;
    }
    int i = paramArrayOfInt[0] + this.a.b();
    paramArrayOfInt[0] = this.a.q();
    if (i > this.a.f()) {
      return zabc.g;
    }
    zbap localzbap = new zbap(this.a.a(), i, this.a.d(), i, this.a.h());
    return new zabo(this.b, localzbap);
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    if (this.a.p() == 1)
    {
      paramArrayOfInt[0] = 1;
      return this;
    }
    int i = paramArrayOfInt[0] + this.a.d();
    paramArrayOfInt[0] = this.a.p();
    if (i > this.a.h()) {
      return zabc.g;
    }
    zbap localzbap = new zbap(this.a.a(), this.a.b(), i, this.a.f(), i);
    return new zabo(this.b, localzbap);
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    Object localObject1;
    if ((!paramBoolean) && (this.c != null) && (this.c.b != null))
    {
      localObject1 = this.c.b.c(paramzaca);
      if (localObject1 != null)
      {
        if ((!((zaiw)localObject1).l()) && (paramzaca.p.o) && (paramzaca.a == 0))
        {
          localzwp = this.a.a(paramzaca);
          if ((localzwp == null) || ((localzwp.a & 0xFFFF) == paramzaca.p.f)) {
            paramzaca.g.a.f.a(((zaai)paramzaca.b).a, localzwp == null ? paramzaca.n : localzwp.b & 0xFFFF, this.a.b(), this.a.d(), this.a.f(), this.a.h());
          }
        }
        if (((zaiw)localObject1).a()) {
          ((zaiw)localObject1).a(false);
        } else {
          localObject1 = ((zaiw)localObject1).b(paramzaca);
        }
        ((zaiw)localObject1).a(paramzaca);
        return (zaiw)localObject1;
      }
    }
    zwp localzwp = this.a.a(paramzaca);
    if (a(localzwp, paramzaca))
    {
      if (this.c == null) {
        this.c = new zabu();
      }
      this.c.a = zabc.c;
      localObject1 = new zbak(zabc.c);
      this.c.b = ((zajg)localObject1);
      return (zaiw)localObject1;
    }
    Object localObject2;
    if (paramBoolean)
    {
      localObject2 = this.a;
      if (localzwp != this.a.a())
      {
        localObject2 = new zbap(this.a);
        ((zbap)localObject2).a(localzwp);
      }
      localObject1 = new zbaj((zbap)localObject2);
      return (zaiw)localObject1;
    }
    if (this.a.m())
    {
      if ((paramzaca.p.o) && (paramzaca.a == 0) && ((localzwp == null) || ((localzwp.a & 0xFFFF) == paramzaca.p.f))) {
        paramzaca.b(localzwp == null ? paramzaca.n : localzwp.b & 0xFFFF, this.a.b(), this.a.d());
      }
      if ((paramzaca.j) && (paramzaca.m != 0))
      {
        if (this.a.j()) {
          paramzaca.m &= 0xFFFFFFFE;
        }
        if (this.a.k()) {
          paramzaca.m &= 0xFFFFFFFD;
        }
      }
      if ((this.c != null) && (this.c.a != null))
      {
        localObject1 = this.c.a.a(paramzaca, paramBoolean);
        return (zaiw)localObject1;
      }
      if ((localzwp == null) || (localzwp == paramzaca.o)) {
        localObject2 = zabt.a(paramzaca.c.getCells(), this.a.b(), this.a.d(), true, paramzaca);
      } else if ((localzwp.a & 0xFFFF) == paramzaca.p.f) {
        localObject2 = zabt.a(paramzaca.p.e.get(localzwp.b & 0xFFFF).getCells(), this.a.b(), this.a.d(), true, paramzaca);
      } else {
        localObject2 = zabt.a(paramzaca, localzwp.a & 0xFFFF, localzwp.b & 0xFFFF, this.a.b(), this.a.d());
      }
      if (this.c == null) {
        this.c = new zabu();
      }
      this.c.a = ((zaie)localObject2);
      localObject1 = new zbak((zaie)localObject2, 9);
      return (zaiw)localObject1;
    }
    if ((paramzaca.p.o) && (paramzaca.a == 0) && ((localzwp == null) || ((localzwp.a & 0xFFFF) == paramzaca.p.f))) {
      paramzaca.g.a.f.a(((zaai)paramzaca.b).a, localzwp == null ? paramzaca.n : localzwp.b & 0xFFFF, this.a.b(), this.a.d(), this.a.f(), this.a.h());
    }
    int i = paramzaca.m;
    if (paramzaca.j) {
      paramzaca.f();
    }
    if (localzwp == null) {
      localzwp = paramzaca.o;
    }
    if (localzwp.b == localzwp.c)
    {
      localObject1 = a(paramzaca, localzwp.a & 0xFFFF, localzwp.b & 0xFFFF);
    }
    else
    {
      zaiw[] arrayOfzaiw = new zaiw[(localzwp.c & 0xFFFF) - (localzwp.b & 0xFFFF) + 1];
      for (int j = 0; j < arrayOfzaiw.length; j++) {
        arrayOfzaiw[j] = a(paramzaca, localzwp.a & 0xFFFF, (localzwp.b & 0xFFFF) + j);
      }
      localObject1 = new zazt(arrayOfzaiw, this.a.q(), this.a.p());
    }
    if (paramzaca.j)
    {
      if (this.c != null) {
        this.c.a((zaiw)localObject1, paramzaca);
      }
      paramzaca.b(i);
    }
    return (zaiw)localObject1;
  }
  
  private zaiw a(zaca paramzaca, int paramInt1, int paramInt2)
  {
    if (this.a.q() == 1)
    {
      localCellArea = this.a.u();
      if (paramzaca.j)
      {
        if (this.a.j()) {
          paramzaca.m &= 0xFFFFFFFE;
        }
        if (this.a.e())
        {
          if (!this.a.i())
          {
            paramzaca.m &= 0xFFFFFFFD;
            localCellArea.EndColumn += paramzaca.l.EndColumn - paramzaca.e;
          }
        }
        else
        {
          localCellArea.StartColumn += paramzaca.l.StartColumn - paramzaca.e;
          if (this.a.i()) {
            paramzaca.m &= 0xFFFFFFFD;
          } else {
            localCellArea.EndColumn += paramzaca.l.EndColumn - paramzaca.e;
          }
        }
      }
      return a(paramzaca, paramInt1, paramInt2, localCellArea);
    }
    if (this.a.p() == 1)
    {
      localCellArea = this.a.u();
      if (paramzaca.j)
      {
        if (this.a.k()) {
          paramzaca.m &= 0xFFFFFFFD;
        }
        if (this.a.c())
        {
          if (!this.a.g())
          {
            paramzaca.m &= 0xFFFFFFFE;
            localCellArea.EndRow = (this.a.f() + paramzaca.l.EndRow - paramzaca.d);
          }
        }
        else
        {
          localCellArea.StartRow = (this.a.b() + paramzaca.l.StartRow - paramzaca.d);
          if (this.a.g()) {
            paramzaca.m &= 0xFFFFFFFE;
          } else {
            localCellArea.EndRow = (this.a.f() + paramzaca.l.EndRow - paramzaca.d);
          }
        }
      }
      return a(paramzaca, paramInt1, paramInt2, localCellArea);
    }
    CellArea localCellArea = this.a.u();
    if (paramzaca.j)
    {
      if (this.a.c())
      {
        if (!this.a.g())
        {
          paramzaca.m &= 0xFFFFFFFE;
          localCellArea.EndRow = (this.a.f() + paramzaca.l.EndRow - paramzaca.d);
        }
      }
      else
      {
        localCellArea.StartRow = (this.a.b() + paramzaca.l.StartRow - paramzaca.d);
        if (this.a.g()) {
          paramzaca.m &= 0xFFFFFFFE;
        } else {
          localCellArea.EndRow = (this.a.f() + paramzaca.l.EndRow - paramzaca.d);
        }
      }
      if (this.a.e())
      {
        if (!this.a.i())
        {
          paramzaca.m &= 0xFFFFFFFD;
          localCellArea.EndColumn += paramzaca.l.EndColumn - paramzaca.e;
        }
      }
      else
      {
        localCellArea.StartColumn += paramzaca.l.StartColumn - paramzaca.e;
        if (this.a.i()) {
          paramzaca.m &= 0xFFFFFFFD;
        } else {
          localCellArea.EndColumn += paramzaca.l.EndColumn - paramzaca.e;
        }
      }
    }
    return a(paramzaca, paramInt1, paramInt2, localCellArea);
  }
  
  private zaiw a(zaca paramzaca, int paramInt1, int paramInt2, CellArea paramCellArea)
  {
    int i = (paramzaca.j) && (paramzaca.m != 0) ? 1 : 0;
    zkv localzkv = paramzaca.p.b();
    int k;
    if ((!paramzaca.p.z) && (localzkv.b() > 0))
    {
      localObject1 = null;
      int j = 0;
      Iterator localIterator = localzkv.f();
      Object localObject4;
      while (localIterator.hasNext())
      {
        Object localObject3 = localIterator.next();
        if (localObject3 != null)
        {
          localObject4 = (zfi)localObject3;
          if ((((zfi)localObject4).a == paramInt1) && (((zfi)localObject4).b == paramInt2)) {
            switch (((zfi)localObject4).c.c(paramCellArea))
            {
            case 1: 
            case 4: 
              if (localObject1 != null)
              {
                k = ((zfi)localObject4).c.c(((zfi)localObject1).c);
                if (k == 4)
                {
                  if (((zfi)localObject4).a())
                  {
                    localObject1 = localObject4;
                    j = 1;
                  }
                }
                else if (k == 3)
                {
                  if (((zfi)localObject1).a()) {
                    j = 1;
                  } else if (((zfi)localObject4).a()) {
                    localObject1 = localObject4;
                  }
                }
                else if (((zfi)localObject4).a()) {
                  localObject1 = localObject4;
                }
              }
              else
              {
                localObject1 = localObject4;
              }
              break;
            case 3: 
              if (i != 0) {
                j = 1;
              }
              break;
            }
          }
        }
      }
      if (j != 0)
      {
        int m = localzkv.b();
        if (localObject1 != null) {
          paramCellArea = ((zfi)localObject1).c;
        }
        for (int n = m - 1; n > -1; n--)
        {
          localObject4 = localzkv.a(n);
          if (localObject4 == localObject1)
          {
            localzkv.a(n, null);
          }
          else if (localObject4 != null)
          {
            zfi localzfi = (zfi)localObject4;
            if ((localzfi.a == paramInt1) && (localzfi.b == paramInt2) && (paramCellArea.c(localzfi.c) == 4)) {
              localzkv.a(n, null);
            }
          }
        }
        localzkv.e();
        if (localObject1 != null)
        {
          localzkv.a(localObject1);
          return ((zfi)localObject1).a(this.a, paramzaca);
        }
      }
      if (localObject1 != null)
      {
        localzkv.b(localObject1);
        return ((zfi)localObject1).a(this.a, paramzaca);
      }
    }
    Object localObject1 = null;
    if (paramCellArea.g() == 1)
    {
      if (paramInt1 == paramzaca.p.f)
      {
        localObject1 = new zayx(paramzaca, paramzaca.p.e.get(paramInt2), paramCellArea.StartColumn, paramCellArea.StartRow, paramCellArea.EndRow);
      }
      else
      {
        localObject2 = paramzaca.p.e.w().a(paramInt1).c(paramInt2);
        if (localObject2 == null) {
          return new zazj(zabg.a, paramCellArea.f(), 1);
        }
        localObject1 = new zazm(paramzaca, (zwr)localObject2, paramCellArea.StartColumn, paramCellArea.StartRow, paramCellArea.EndRow);
      }
    }
    else if (paramCellArea.f() == 1)
    {
      if (paramInt1 == paramzaca.p.f)
      {
        localObject2 = paramzaca.p.e.get(paramInt2).getCells().getRows().a.a(paramCellArea.StartRow);
        if ((localObject2 == null) || (((zt)localObject2).a() < 1)) {
          return new zazj(zabg.a, 9, 1, paramCellArea.g());
        }
        localObject1 = new zayy(paramzaca, paramzaca.p.e.get(paramInt2), (zt)localObject2, paramCellArea.StartColumn, paramCellArea.EndColumn);
      }
      else
      {
        localObject2 = paramzaca.p.e.w().a(paramInt1).c(paramInt2);
        k = -1;
        if (localObject2 != null) {
          k = ((zwr)localObject2).d(this.a.b());
        }
        if (k < 0) {
          return new zazj(zabg.a, 9, 1, paramCellArea.g());
        }
        localObject1 = new zazn(paramzaca, ((zwr)localObject2).b(k), paramCellArea.StartColumn, paramCellArea.EndColumn);
      }
    }
    else if (paramInt1 == paramzaca.p.f)
    {
      localObject1 = new zayv(paramzaca, paramzaca.p.e.get(paramInt2).getCells(), paramCellArea.StartRow, paramCellArea.StartColumn, paramCellArea.EndRow, paramCellArea.EndColumn);
    }
    else
    {
      localObject2 = paramzaca.p.e.w().a(paramInt1).c(paramInt2);
      if (localObject2 == null) {
        return new zazj(zabg.a, 9, paramCellArea.f(), paramCellArea.g());
      }
      localObject1 = new zazl(paramzaca, (zwr)localObject2, this.a.b(), this.a.d(), this.a.f(), this.a.h());
    }
    if (paramzaca.p.z) {
      return (zaiw)localObject1;
    }
    Object localObject2 = new zfi(paramCellArea, paramInt1, paramInt2, (zaiw)localObject1);
    localzkv.a(localObject2);
    if ((i != 0) || (!this.a.u().a(paramCellArea)))
    {
      ((zaiw)localObject1).a(true);
      return ((zfi)localObject2).a(this.a, paramzaca);
    }
    return (zaiw)localObject1;
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if (paramzaah == null) {
      this.a.a(paramzahh);
    } else {
      this.a.a(paramzahh, paramzaah);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */