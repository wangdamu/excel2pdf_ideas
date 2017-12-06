package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.zj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zfo
  extends zfm
{
  private zb q;
  private zaie[] r;
  private HashMap s;
  private HashMap t;
  private zaak[][] u;
  private Object[] v;
  private Object[] w;
  private zaie x;
  private zaie y;
  private boolean z;
  private boolean A;
  private HashMap B;
  private HashMap C;
  private short D = 0;
  
  zfo(zaai paramzaai, zaca paramzaca)
  {
    super(paramzaai, paramzaca);
    zacb localzacb = paramzaai.b();
    this.r = new zaie[localzacb.a.g() + 1];
    zc.a(this.r, 0, this.r.length, zabg.a);
    this.x = zabg.a;
    this.q = new zb(this);
    this.y = zabg.a;
    if (paramzaca.p.C.a == null) {
      paramzaca.p.C.a = new HashMap();
    }
    Object localObject;
    if (this.m)
    {
      localObject = paramzaca.p.C.a.get(Long.valueOf(this.i));
      if (localObject == null)
      {
        this.s = new HashMap();
        paramzaca.p.C.a.put(Long.valueOf(this.i), this.s);
      }
      else
      {
        this.s = ((HashMap)localObject);
      }
    }
    else
    {
      this.s = null;
    }
    if (this.n)
    {
      localObject = paramzaca.p.C.a.get(Long.valueOf(this.j));
      if (localObject == null)
      {
        this.t = new HashMap();
        paramzaca.p.C.a.put(Long.valueOf(this.j), this.t);
      }
      else
      {
        this.t = ((HashMap)localObject);
      }
    }
    else
    {
      this.t = null;
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
        zaie localzaie = this.x;
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
        this.x = localzaie;
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
  
  private void b(zaai paramzaai)
  {
    if (this.q.a != paramzaai.e)
    {
      zt localzt = this.d.g.getRows().a.a(paramzaai.e);
      a(localzt, false);
    }
    else
    {
      this.x.b(true);
      this.d.p.a(this.j, this.d.a(this.x));
    }
    c(paramzaai);
  }
  
  private void c(zaai paramzaai)
  {
    if ((this.d.p.L.n.b()) && (this.d.p.L.n.e == this.d.n) && (this.d.p.L.n.f == paramzaai.e) && (this.d.p.L.n.g == paramzaai.f))
    {
      this.d.p.L.n.b(true);
      zl.a("Tracing " + paramzaai);
    }
    int i = this.d.p.C.i;
    int j = this.d.p.C.j;
    this.d.p.C.h = this.d.p.E;
    this.d.p.C.i = this.d.p.E;
    this.d.p.C.j = this.d.p.E;
    zaie localzaie;
    if (this.o)
    {
      localzaie = this.r[(paramzaai.f - this.l)];
      localzaie.b(true);
      this.d.p.a(this.i, this.d.a(localzaie));
      this.y.b(true);
      d(paramzaai);
      paramzaai.a(this.d.a(this.y), this.d);
    }
    else if (this.m)
    {
      this.d.d = paramzaai.e;
      localzaie = this.r[(paramzaai.f - this.l)];
      localzaie.b(true);
      this.d.p.a(this.i, this.d.a(localzaie));
      this.x.b(true);
      d(paramzaai);
      paramzaai.a(this.d.a(this.x), this.d);
    }
    else
    {
      this.d.e = paramzaai.f;
      localzaie = this.r[(paramzaai.f - this.l)];
      localzaie.b(true);
      d(paramzaai);
      paramzaai.a(this.d.a(localzaie), this.d);
    }
    if ((this.d.p.L.n.b()) && (this.d.p.L.n.c()))
    {
      this.d.p.L.n.b(false);
      this.d.p.L.n.a(false);
    }
    this.d.p.b(this.d.n, paramzaai);
    this.d.p.C.i = i;
    this.d.p.C.j = j;
    if (((this.z) || (this.A)) && (this.d.p.L.i == 1))
    {
      long l = zaai.a(this.d.n, paramzaai.a);
      Object localObject;
      if (this.z)
      {
        localObject = this.B.get(Long.valueOf(l));
        if ((localObject == null) || (((Boolean)localObject).booleanValue())) {
          this.B.put(Long.valueOf(l), znq.e);
        }
      }
      if (this.A)
      {
        localObject = this.C.get(Long.valueOf(l));
        if ((localObject == null) || (((Boolean)localObject).booleanValue())) {
          this.C.put(Long.valueOf(l), znq.e);
        }
      }
    }
  }
  
  private void d(zaai paramzaai)
  {
    if (this.d.p.E + 5 > this.d.p.F)
    {
      this.d.p.c(zaai.a(this.d.n, paramzaai.a));
      throw new zgi();
    }
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
    return localzaie;
  }
  
  private boolean a(zt paramzt, boolean paramBoolean)
  {
    int i = paramzt.b(this.l);
    if (i > -1)
    {
      zgs localzgs = paramzt.a(i, new zgs(), 5);
      this.x = a(paramzt.i(), localzgs);
      if ((this.o) || (this.n))
      {
        if ((paramBoolean) && (!this.x.i()))
        {
          b();
          paramBoolean = false;
        }
        this.d.p.a(this.j, this.d.a(this.x));
      }
    }
    else
    {
      this.x = zabg.a;
      if ((this.o) || (this.n)) {
        this.d.p.a(this.j, this.x);
      }
    }
    return paramBoolean;
  }
  
  private void b()
  {
    this.D = ((short)(this.D + 1));
    this.d.p.A = this.D;
  }
  
  private class zb
    implements zaha
  {
    private zgs d = new zgs();
    private zfo e;
    private boolean f = true;
    private boolean g = true;
    int a;
    int b;
    
    zb(zfo paramzfo)
    {
      this.a = paramzfo.k;
      this.e = paramzfo;
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
            zfo.a(this.e, zfo.a(this.e, i, localzgs));
            this.e.p = zfo.j(this.e).i();
          }
          this.f = false;
          return false;
        }
      }
      if (this.e.p)
      {
        if (localzgs.c == 5) {
          ((zaai)localzgs.d).b(this.e.d.a(zfo.j(this.e)), this.e.d);
        }
        return false;
      }
      if (this.g)
      {
        if (i == this.e.k)
        {
          zfo.k(this.e)[(this.b - this.e.l)] = zfo.a(this.e, i, localzgs);
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
          zfo.b(this.e, zfo.a(this.e, i, localzgs));
          if ((this.e.o) || (this.e.n))
          {
            if (!zfo.l(this.e).i()) {
              zfo.m(this.e);
            }
            this.e.d.p.a(this.e.j, this.e.d.a(zfo.l(this.e)));
          }
          return false;
        }
        if (this.e.e > -1)
        {
          bool = zfo.a(this.e, paramzt, bool);
        }
        else
        {
          zfo.b(this.e, zabg.a);
          if ((this.e.o) || (this.e.n)) {
            this.e.d.p.a(this.e.j, zfo.l(this.e));
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
        zfo.m(this.e);
      }
      zfo.a(this.e, (zaai)localzgs.d);
      return false;
    }
  }
  
  private class za
    implements zj
  {
    private zfo b;
    private zaak[][] c;
    private short d;
    private int e;
    private int f;
    private long g;
    private long h;
    
    za(zfo paramzfo)
    {
      this.b = paramzfo;
      zabz localzabz = paramzfo.d.p;
      zbvk localzbvk = localzabz.C;
      this.c = localzabz.B;
      this.d = localzabz.A;
      this.e = localzbvk.i;
      this.f = localzbvk.j;
      this.g = localzbvk.f;
      this.h = localzbvk.g;
      zfo.a(paramzfo, localzbvk.d);
      zfo.b(paramzfo, localzbvk.e);
      zfo.a(paramzfo, localzbvk.b);
      zfo.b(paramzfo, localzbvk.c);
      localzbvk.d = paramzfo.m;
      localzbvk.e = paramzfo.n;
      localzbvk.f = paramzfo.i;
      localzbvk.g = paramzfo.j;
      localzbvk.b = zfo.a(paramzfo);
      localzbvk.c = zfo.b(paramzfo);
      if ((this.c == null) || (this.c != zfo.c(this.b)))
      {
        if (zfo.c(this.b) == null)
        {
          zfo.a(this.b, new zaak[localzabz.e.getCount()][]);
          if (localzabz.z)
          {
            zfo.a(this.b, new Object[localzabz.y.size()]);
            zfo.b(this.b, new Object[zfo.d(this.b).length]);
            int i = 0;
            Iterator localIterator = localzabz.y.keySet().iterator();
            while (localIterator.hasNext())
            {
              Object localObject = localIterator.next();
              zfo.d(this.b)[i] = localObject;
              zfo.e(this.b)[i] = localzabz.y.get(localObject);
              i++;
            }
            localzabz.z = false;
            localzabz.y.clear();
          }
        }
        localzabz.B = zfo.c(this.b);
      }
    }
    
    public void dispose()
    {
      zabz localzabz = this.b.d.p;
      zbvk localzbvk = localzabz.C;
      localzabz.B = this.c;
      localzabz.A = this.d;
      localzbvk.i = this.e;
      localzbvk.j = this.f;
      localzbvk.f = this.g;
      localzbvk.g = this.h;
      localzbvk.d = zfo.f(this.b);
      localzbvk.e = zfo.g(this.b);
      localzbvk.b = zfo.h(this.b);
      localzbvk.c = zfo.i(this.b);
      if (this.b.c < 1)
      {
        Object localObject;
        for (int i = 0; i < zfo.c(this.b).length; i++) {
          if (zfo.c(this.b)[i] != null)
          {
            localObject = localzabz.e.get(i).getCells().a;
            zaak[] arrayOfzaak = zfo.c(this.b)[i];
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
          if (zfo.d(this.b) == null)
          {
            localzabz.z = false;
          }
          else
          {
            Object[] arrayOfObject = zfo.d(this.b);
            localObject = zfo.e(this.b);
            for (int j = 0; j < arrayOfObject.length; j++) {
              localzabz.y.put(arrayOfObject[j], localObject[j]);
            }
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */