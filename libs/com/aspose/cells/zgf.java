package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;

class zgf
  implements zagw
{
  private zajg[] a;
  private zaiw[] b;
  private int c = -1;
  private int d = -1;
  private int e = -1;
  
  zgf(int paramInt)
  {
    this.a = new zajg[paramInt];
    this.b = new zaiw[paramInt];
  }
  
  zgf(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = new zajg[paramInt1];
    this.b = new zaiw[paramInt1];
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public boolean a()
  {
    return true;
  }
  
  public void a(boolean paramBoolean)
  {
    for (zajg localzajg : this.a) {
      localzajg.a(paramBoolean);
    }
  }
  
  public boolean b()
  {
    return this.e > -1;
  }
  
  public void a(zaca paramzaca)
  {
    for (this.e = 0; this.e < this.a.length; this.e += 1)
    {
      zajg localzajg1 = this.a[this.e];
      if (localzajg1 != null)
      {
        zajg localzajg2 = localzajg1.d(paramzaca);
        if (localzajg2 != localzajg1)
        {
          localzajg2.a(true);
          this.a[this.e] = localzajg2;
        }
      }
    }
    this.e = -1;
    this.c = -1;
    this.d = -1;
  }
  
  zaie a(zaie paramzaie1, zaie paramzaie2, zaca paramzaca)
  {
    this.e += 1;
    if (this.a[this.e] != null)
    {
      localObject1 = this.a[this.e].c(paramzaca);
      if (localObject1 != null)
      {
        if (!((zaiw)localObject1).a()) {
          localObject1 = ((zaiw)localObject1).b(paramzaca);
        }
        ((zaiw)localObject1).a(paramzaca);
        this.b[this.e] = localObject1;
        if (this.c < 0)
        {
          this.c = ((zaiw)localObject1).c();
          this.d = ((zaiw)localObject1).d();
        }
        return null;
      }
    }
    zaie localzaie = zabt.a(paramzaie1, paramzaca);
    if (localzaie.b() != 9)
    {
      if (this.e > 0) {
        for (this.e -= 1; this.e > -1; this.e -= 1) {
          this.b[this.e].a(true);
        }
      }
      return localzaie;
    }
    zbap localzbap = ((zabo)localzaie).o();
    if (this.c < 0)
    {
      this.c = localzbap.q();
      this.d = localzbap.p();
    }
    else if ((localzbap.q() != this.c) || (localzbap.p() != this.d))
    {
      if (this.e > 0) {
        for (this.e -= 1; this.e > -1; this.e -= 1) {
          this.b[this.e].a(true);
        }
      }
      return zabc.f;
    }
    zny localzny = zabt.a(paramzaie2, paramzaca, false);
    String str = null;
    int i = paramzaca.m;
    if (paramzaca.j)
    {
      if (this.a[this.e] == zbov.a)
      {
        paramzaca.m = 0;
      }
      else
      {
        paramzaca.f();
        paramzaca.m &= paramzaie2.b(paramzaca, false);
      }
      localObject1 = paramzaie1.a(paramzaca, false);
    }
    else
    {
      if ((this.c > 100) || (this.d > 100))
      {
        zwp localzwp = localzbap.a();
        if (localzwp == null) {
          localzwp = paramzaca.o;
        }
        CellArea localCellArea = localzbap.u();
        if ((!paramzaca.p.z) || (!paramzaca.p.a(localCellArea, localzwp.b & 0xFFFF)))
        {
          zbpe localzbpe = new zbpe(32);
          localzbpe.a(zi.a(localzwp.a & 0xFFFF));
          localzbpe.a('-');
          localzbpe.a(zi.a(localzwp.b & 0xFFFF));
          localzbpe.a('-');
          CellsHelper.a(localzbpe, localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
          localzbpe.a(localzny.d().p());
          localzny.b().a(localzbpe, paramzaca.i());
          str = zs.a(localzbpe);
          if (paramzaca.p.x == null)
          {
            paramzaca.p.x = new HashMap();
          }
          else
          {
            Object localObject2 = paramzaca.p.x.get(str);
            if (localObject2 != null)
            {
              zaiw localzaiw1 = (zaiw)localObject2;
              Object localObject3 = (zaiw)localzaiw1.d(paramzaca);
              if (localObject3 != localzaiw1)
              {
                paramzaca.p.x.put(str, localObject3);
              }
              else
              {
                if (((zaiw)localObject3).a())
                {
                  ((zaiw)localObject3).a(false);
                }
                else
                {
                  localObject3 = ((zaiw)localObject3).b(paramzaca);
                  paramzaca.p.x.put(str, localObject3);
                }
                if ((localObject3 instanceof zazi))
                {
                  ((zaiw)localObject3).f();
                  while (((zaiw)localObject3).g()) {
                    if (!((zaiw)localObject3).h().i()) {
                      break;
                    }
                  }
                  zaiw localzaiw2 = (zaiw)((zaiw)localObject3).d(paramzaca);
                  ((zaiw)localObject3).a(true);
                  paramzaca.p.x.put(str, localzaiw2);
                  localObject3 = localzaiw2;
                }
              }
              this.b[this.e] = localObject3;
              return null;
            }
          }
        }
      }
      localObject1 = localzaie.a(paramzaca, false);
    }
    Object localObject1 = new zazd((zaiw)localObject1, new zmb(paramzaca, localzny, paramzaca.d, paramzaca.e), paramzaca);
    if (paramzaca.j)
    {
      switch (paramzaca.m)
      {
      case 3: 
        localObject1 = zbam.a((zaiw)localObject1, paramzaca);
        this.a[this.e] = localObject1;
        break;
      case 1: 
        if (paramzaca.l.f() > 1)
        {
          if (((zaiw)localObject1).A()) {
            localObject1 = zbam.a((zaiw)localObject1, paramzaca);
          }
          if (paramzaca.l.g() > 1)
          {
            if (this.a[this.e] == null) {
              this.a[this.e] = new zbou(paramzaca, false);
            }
            this.a[this.e].a(paramzaca, (zaiw)localObject1);
          }
          else
          {
            this.a[this.e] = localObject1;
          }
        }
        else
        {
          this.a[this.e] = zbov.a;
        }
        break;
      case 2: 
        if (paramzaca.l.g() > 1)
        {
          if (((zaiw)localObject1).A()) {
            localObject1 = zbam.a((zaiw)localObject1, paramzaca);
          }
          if (paramzaca.l.f() > 1)
          {
            if (this.a[this.e] == null) {
              this.a[this.e] = new zbou(paramzaca, true);
            }
            this.a[this.e].a(paramzaca, (zaiw)localObject1);
          }
          else
          {
            this.a[this.e] = localObject1;
          }
        }
        else
        {
          this.a[this.e] = zbov.a;
        }
        break;
      default: 
        this.a[this.e] = zbov.a;
      }
      paramzaca.m = i;
    }
    else if (str != null)
    {
      localObject1 = zbam.a((zaiw)localObject1, paramzaca);
      paramzaca.p.x.put(str, localObject1);
    }
    this.b[this.e] = localObject1;
    return null;
  }
  
  zaiw b(zaca paramzaca)
  {
    if (this.b.length == 1) {
      return this.b[0];
    }
    if (this.b.length == 2) {
      return zbam.a(this.b[0], this.b[1], paramzaca, new zmj(paramzaca, true));
    }
    if ((this.c == 1) || (this.d == 1)) {
      return new zazb(this.b, new zmj(paramzaca, true), paramzaca);
    }
    return new zazc(this.b, new zmj(paramzaca, true), paramzaca);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */