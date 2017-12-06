package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.zj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zfn
  extends zfm
{
  private zb q;
  private zaie[] r;
  private HashMap s;
  private HashMap t;
  private zhf u;
  private zhf v;
  private zaak[][] w;
  private Object[] x;
  private Object[] y;
  private zaie z;
  private zaie A;
  private short B = 0;
  
  zfn(zaai paramzaai, zaca paramzaca)
  {
    super(paramzaai, paramzaca);
    zacb localzacb = paramzaai.b();
    this.r = new zaie[localzacb.a.g() + 1];
    zc.a(this.r, 0, this.r.length, zabg.a);
    this.z = zabg.a;
    this.q = new zb(this);
    this.A = zabg.a;
    if (this.m)
    {
      this.s = new HashMap();
      this.u = new zhf(paramzaca.n, localzacb.b, localzacb.c, this.d, this.s);
    }
    else
    {
      this.s = null;
      this.u = null;
    }
    if (this.n)
    {
      this.t = new HashMap();
      this.v = new zhf(paramzaca.n, localzacb.d, localzacb.e, this.d, this.t);
    }
    else
    {
      this.t = null;
      this.v = null;
    }
  }
  
  void a(zaai paramzaai)
  {
    za localza = new za(this);
    this.d.p.b(this.d.n, paramzaai);
    try
    {
      Object localObject1;
      if (this.h)
      {
        localObject1 = CellArea.d(this.b);
        localObject1.StartColumn -= 1;
        localObject1.StartRow -= 1;
        this.d.g.a((CellArea)localObject1, ((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, this.q, false, false);
      }
      else if (this.g)
      {
        localObject1 = this.d;
        zaie localzaie = this.z;
        this.d = new zaca(this.d);
        if (this.h)
        {
          this.h = false;
          this.e = this.q.a;
          this.f = this.q.b;
          this.q = new zb(this.q);
          this.d.g.a(this.b, this.b.EndRow, this.b.EndColumn, this.q, true, true);
        }
        else
        {
          b(paramzaai);
          this.c -= 1;
        }
        this.d = ((zaca)localObject1);
        this.z = localzaie;
      }
      else
      {
        this.g = true;
        b(paramzaai);
        this.g = false;
        this.c -= 1;
      }
    }
    finally
    {
      localza.dispose();
    }
  }
  
  static boolean a(long paramLong, HashMap paramHashMap, int paramInt, boolean paramBoolean)
  {
    Object localObject = paramHashMap.get(Long.valueOf(paramLong));
    if (localObject == null) {
      return false;
    }
    if (localObject == zhf.j) {
      return false;
    }
    if (localObject == zhf.k) {
      return true;
    }
    long[] arrayOfLong = (long[])localObject;
    if (arrayOfLong[0] == paramInt) {
      return false;
    }
    if (paramBoolean) {
      arrayOfLong[0] = paramInt;
    }
    return true;
  }
  
  private void b(zaai paramzaai)
  {
    if (this.q.a != paramzaai.e)
    {
      zt localzt = this.d.g.getRows().a.a(paramzaai.e);
      a(localzt, false);
    }
    else
    {
      this.z.b(true);
      this.d.p.a(this.j, this.d.a(this.z));
    }
    c(paramzaai);
  }
  
  private void c(zaai paramzaai)
  {
    zaie localzaie;
    if (this.o)
    {
      localzaie = this.r[(paramzaai.f - this.l)];
      localzaie.b(true);
      this.d.p.a(this.i, this.d.a(localzaie));
      this.A.b(true);
      d(paramzaai);
      paramzaai.a(this.d.a(this.A), this.d);
    }
    else if (this.m)
    {
      this.d.d = paramzaai.e;
      localzaie = this.r[(paramzaai.f - this.l)];
      localzaie.b(true);
      this.d.p.a(this.i, this.d.a(localzaie));
      this.z.b(true);
      d(paramzaai);
      paramzaai.a(this.d.a(this.z), this.d);
    }
    else
    {
      this.d.e = paramzaai.f;
      localzaie = this.r[(paramzaai.f - this.l)];
      localzaie.b(true);
      d(paramzaai);
      paramzaai.a(this.d.a(localzaie), this.d);
    }
    this.d.p.b(this.d.n, paramzaai);
  }
  
  private void d(zaai paramzaai)
  {
    if (this.d.p.E + 5 > this.d.p.F)
    {
      this.d.p.c(zaai.a(this.d.n, paramzaai.a));
      throw new zgi();
    }
  }
  
  private boolean a(zaie paramzaie, zhe paramzhe)
  {
    Object localObject1;
    Object localObject2;
    switch (paramzaie.b())
    {
    case 7: 
      localObject1 = (zabe)paramzaie;
      localObject2 = ((zabe)localObject1).r();
      if (localObject2 != null)
      {
        int i = 0;
        for (zaie localzaie : localObject2) {
          if (a(localzaie, paramzhe)) {
            i = 1;
          }
        }
        if (i != 0) {
          return true;
        }
      }
      switch (((zabe)localObject1).p().b())
      {
      case 63: 
      case 74: 
      case 464: 
        return true;
      }
      break;
    case 5: 
      if (((zabh)paramzaie).o())
      {
        if (a(((zabm)paramzaie).u(), paramzhe)) {
          return true;
        }
      }
      else
      {
        localObject1 = (zabk)paramzaie;
        if ((a(((zabk)localObject1).G(), paramzhe) | a(((zabk)localObject1).H(), paramzhe))) {
          return true;
        }
      }
      break;
    case 9: 
      localObject1 = ((zabo)paramzaie).o();
      localObject2 = ((zbap)localObject1).a();
      if ((((zbap)localObject1).m()) && ((localObject2 == null) || (localObject2 == this.d.o)) && (((zbap)localObject1).b() == paramzhe.b()) && (((zbap)localObject1).d() == paramzhe.c())) {
        return true;
      }
      if (paramzhe.a((zbap)localObject1)) {
        return true;
      }
      break;
    }
    paramzaie.a(false);
    return false;
  }
  
  private zaie a(int paramInt, zgs paramzgs)
  {
    if (paramzgs.c != 5) {
      return zabt.a(paramzgs.c, paramzgs.d);
    }
    zaca localzaca = this.d;
    this.d = new zaca(this.d);
    zaai localzaai = (zaai)paramzgs.d;
    this.d.a(localzaai);
    zaie localzaie = localzaai.a(this.d, true);
    long[] arrayOfLong1 = null;
    long[] arrayOfLong2 = null;
    if (this.m)
    {
      this.u.d();
      this.u.a(this.d);
      if (a(localzaie, this.u)) {
        arrayOfLong1 = this.u.e();
      }
      this.u.a(localzaca);
    }
    if (this.n)
    {
      this.v.d();
      this.v.a(this.d);
      if (a(localzaie, this.v)) {
        arrayOfLong2 = this.v.e();
      }
      this.v.a(localzaca);
    }
    this.d = localzaca;
    return localzaie;
  }
  
  private boolean a(zt paramzt, boolean paramBoolean)
  {
    int i = paramzt.b(this.l);
    if (i > -1)
    {
      zgs localzgs = paramzt.a(i, new zgs(), 5);
      this.z = a(paramzt.i(), localzgs);
      if ((this.o) || (this.n))
      {
        if ((paramBoolean) && (!this.z.i()))
        {
          b();
          paramBoolean = false;
        }
        this.d.p.a(this.j, this.d.a(this.z));
      }
    }
    else
    {
      this.z = zabg.a;
      if ((this.o) || (this.n)) {
        this.d.p.a(this.j, this.z);
      }
    }
    return paramBoolean;
  }
  
  private void b()
  {
    this.B = ((short)(this.B + 1));
    this.d.p.A = this.B;
  }
  
  private class zb
    implements zaha
  {
    private zgs d = new zgs();
    private zfn e;
    private boolean f = true;
    private boolean g = true;
    int a;
    int b;
    
    zb(zfn paramzfn)
    {
      this.a = paramzfn.k;
      this.e = paramzfn;
    }
    
    zb(zb paramzb)
    {
      this.a = paramzb.a;
      this.b = paramzb.b;
      this.f = paramzb.f;
      this.g = paramzb.g;
    }
    
    public boolean a(zt paramzt, int paramInt)
    {
      zgs localzgs = paramzt.a(paramInt, this.d, 5);
      int i = paramzt.i();
      this.b = localzgs.a;
      if ((i == this.e.e) && (this.b == this.e.f)) {
        return true;
      }
      if (this.f)
      {
        if (i != this.e.k)
        {
          this.f = false;
          this.g = false;
          if (this.e.o) {
            this.e.p = true;
          }
        }
        else if (this.b != this.e.l)
        {
          this.f = false;
          if (this.e.o) {
            this.e.p = true;
          }
        }
        if (this.f)
        {
          if (this.e.o)
          {
            zfn.a(this.e, zfn.a(this.e, i, localzgs));
            this.e.p = zfn.f(this.e).i();
          }
          this.f = false;
          return false;
        }
      }
      if (this.e.p)
      {
        if (localzgs.c == 5) {
          ((zaai)localzgs.d).b(this.e.d.a(zfn.f(this.e)), this.e.d);
        }
        return false;
      }
      if (this.g)
      {
        if (i == this.e.k)
        {
          zfn.g(this.e)[(this.b - this.e.l)] = zfn.a(this.e, i, localzgs);
          return false;
        }
        this.g = false;
      }
      boolean bool = true;
      if (i != this.a)
      {
        this.a = i;
        if (this.b == this.e.l)
        {
          zfn.b(this.e, zfn.a(this.e, i, localzgs));
          if ((this.e.o) || (this.e.n))
          {
            if (!zfn.h(this.e).i()) {
              zfn.i(this.e);
            }
            this.e.d.p.a(this.e.j, this.e.d.a(zfn.h(this.e)));
          }
          return false;
        }
        if (this.e.e > -1)
        {
          bool = zfn.a(this.e, paramzt, bool);
        }
        else
        {
          zfn.b(this.e, zabg.a);
          if ((this.e.o) || (this.e.n)) {
            this.e.d.p.a(this.e.j, zfn.h(this.e));
          }
        }
      }
      if (this.b == this.e.l) {
        return false;
      }
      this.e.c -= 1;
      if (localzgs.c != 5) {
        return false;
      }
      if (bool) {
        zfn.i(this.e);
      }
      zfn.a(this.e, (zaai)localzgs.d);
      return false;
    }
  }
  
  private class za
    implements zj
  {
    private zfn b;
    private zaak[][] c;
    private short d;
    private long e;
    private long f;
    private HashMap g;
    private HashMap h;
    
    za(zfn paramzfn)
    {
      this.b = paramzfn;
      zabz localzabz = paramzfn.d.p;
      zbvk localzbvk = localzabz.C;
      this.c = localzabz.B;
      this.d = localzabz.A;
      this.e = localzbvk.f;
      this.f = localzbvk.g;
      this.g = localzbvk.b;
      this.h = localzbvk.c;
      localzbvk.d = paramzfn.m;
      localzbvk.e = paramzfn.n;
      localzbvk.f = paramzfn.i;
      localzbvk.g = paramzfn.j;
      localzbvk.b = zfn.a(paramzfn);
      localzbvk.c = zfn.b(paramzfn);
      if ((this.c == null) || (this.c != zfn.c(this.b)))
      {
        if (zfn.c(this.b) == null)
        {
          zfn.a(this.b, new zaak[localzabz.e.getCount()][]);
          if (localzabz.z)
          {
            zfn.a(this.b, new Object[localzabz.y.size()]);
            zfn.b(this.b, new Object[zfn.d(this.b).length]);
            int i = 0;
            Iterator localIterator = localzabz.y.keySet().iterator();
            while (localIterator.hasNext())
            {
              Object localObject = localIterator.next();
              zfn.d(this.b)[i] = localObject;
              zfn.e(this.b)[i] = localzabz.y.get(localObject);
              i++;
            }
            localzabz.z = false;
            localzabz.y.clear();
          }
        }
        localzabz.B = zfn.c(this.b);
      }
    }
    
    public void dispose()
    {
      zabz localzabz = this.b.d.p;
      zbvk localzbvk = localzabz.C;
      localzabz.B = this.c;
      localzabz.A = this.d;
      localzbvk.f = this.e;
      localzbvk.g = this.f;
      localzbvk.d = (this.g != null);
      localzbvk.e = (this.h != null);
      localzbvk.b = this.g;
      localzbvk.c = this.h;
      if (this.b.c < 1)
      {
        Object localObject;
        for (int i = 0; i < zfn.c(this.b).length; i++) {
          if (zfn.c(this.b)[i] != null)
          {
            localObject = localzabz.e.get(i).getCells().a;
            zaak[] arrayOfzaak = zfn.c(this.b)[i];
            for (int k = 0; k < arrayOfzaak.length; k++) {
              if (arrayOfzaak[k] != null) {
                arrayOfzaak[k].b(((zabw)localObject).a(k));
              }
            }
          }
        }
        if (localzabz.z)
        {
          localzabz.y.clear();
          if (zfn.d(this.b) == null)
          {
            localzabz.z = false;
          }
          else
          {
            Object[] arrayOfObject = zfn.d(this.b);
            localObject = zfn.e(this.b);
            for (int j = 0; j < arrayOfObject.length; j++) {
              localzabz.y.put(arrayOfObject[j], localObject[j]);
            }
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */