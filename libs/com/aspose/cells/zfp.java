package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zfp
  extends zfm
{
  private za q = new zf(zabg.a);
  private zg r;
  private za[] s;
  private zabu t;
  private zabu u;
  private HashMap v;
  private HashMap w;
  private zhf x;
  private zhf y;
  private HashMap z;
  private za A;
  private long B = 255L;
  
  zfp(zaai paramzaai, zaca paramzaca)
  {
    super(paramzaai, paramzaca);
    zacb localzacb = paramzaai.b();
    this.s = new za[localzacb.a.g() + 1];
    zc.a(this.s, 0, this.s.length, this.q);
    this.A = this.q;
    if (this.m)
    {
      this.t = new zabu();
      this.v = new HashMap();
      this.x = new zhf(paramzaca.n, localzacb.b, localzacb.c, this.d, this.v);
    }
    else
    {
      this.t = null;
      this.v = null;
      this.x = null;
    }
    if (this.n)
    {
      this.u = new zabu();
      this.w = new HashMap();
      this.y = new zhf(paramzaca.n, localzacb.d, localzacb.e, this.d, this.w);
    }
    else
    {
      this.u = null;
      this.w = null;
      this.y = null;
    }
    this.z = new HashMap();
    this.r = new zg(this);
  }
  
  void a(zaai paramzaai)
  {
    Object[] arrayOfObject1 = null;
    Object[] arrayOfObject2 = null;
    Object localObject2;
    Object localObject3;
    if (this.d.p.z)
    {
      arrayOfObject1 = new Object[this.d.p.y.size()];
      arrayOfObject2 = new Object[arrayOfObject1.length];
      int i = 0;
      localObject2 = this.d.p.y.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = ((Iterator)localObject2).next();
        arrayOfObject1[i] = localObject3;
        arrayOfObject2[i] = this.d.p.y.get(localObject3);
        i++;
      }
    }
    Object localObject1;
    if (this.g)
    {
      localObject1 = this.d;
      localObject2 = this.A;
      this.d = new zaca(this.d);
      if (this.h)
      {
        this.h = false;
        this.e = this.r.a;
        this.f = this.r.b;
        this.r = new zg(this.r);
        this.d.g.a(this.b, this.b.EndRow, this.b.EndColumn, this.r, true, true);
      }
      else
      {
        b(paramzaai);
        this.c -= 1;
      }
      this.d = ((zaca)localObject1);
      this.A = ((za)localObject2);
    }
    else if (this.h)
    {
      localObject1 = CellArea.d(this.b);
      localObject1.StartColumn -= 1;
      localObject1.StartRow -= 1;
      this.d.g.a((CellArea)localObject1, ((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, this.r, false, false);
      localObject2 = this.z.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = ((Iterator)localObject2).next();
        long l = ((Long)localObject3).longValue();
        ((zaak)this.z.get(localObject3)).b(this.d.p.e.get(zaai.a(l)).getCells().a.a(zaai.b(l)));
      }
    }
    else
    {
      this.g = true;
      b(paramzaai);
      this.g = false;
      this.c -= 1;
    }
    if (this.d.p.z)
    {
      this.d.p.y.clear();
      if (arrayOfObject1 == null) {
        this.d.p.z = false;
      } else {
        for (int j = 0; j < arrayOfObject1.length; j++) {
          this.d.p.y.put(arrayOfObject1[j], arrayOfObject2[j]);
        }
      }
    }
  }
  
  private void b(zaai paramzaai)
  {
    if (this.r.a != paramzaai.e)
    {
      zt localzt = this.d.g.getRows().a.a(paramzaai.e);
      a(localzt);
    }
    else
    {
      this.d.p.a(this.j, this.u.a);
    }
    c(paramzaai);
  }
  
  private void c(zaai paramzaai)
  {
    if (this.o)
    {
      this.t.a = this.s[(paramzaai.f - this.l)].a(this);
      this.d.p.a(this.i, this.t.a);
      paramzaai.a(this.s[0].a(this), this.d);
    }
    else if (this.m)
    {
      this.d.d = paramzaai.e;
      this.t.a = this.s[(paramzaai.f - this.l)].a(this);
      this.d.p.a(this.i, this.t.a);
      paramzaai.a(this.A.a(this), this.d);
    }
    else
    {
      this.d.e = paramzaai.f;
      paramzaai.a(this.s[(paramzaai.f - this.l)].a(this), this.d);
    }
    this.c -= 1;
  }
  
  private boolean a(zaie paramzaie, zabu paramzabu, ArrayList paramArrayList, int paramInt, zhe paramzhe)
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
        int j = 0;
        for (zaie localzaie : localObject2) {
          if (a(localzaie, paramzabu, paramArrayList, paramInt, paramzhe)) {
            j = 1;
          }
        }
        if (j != 0)
        {
          a(paramzaie, paramArrayList, paramInt);
          return true;
        }
      }
      switch (((zabe)localObject1).p().b())
      {
      case 63: 
      case 74: 
      case 464: 
        a(paramzaie, paramArrayList, paramInt);
        return true;
      }
      break;
    case 5: 
      if (((zabh)paramzaie).o())
      {
        if (a(((zabm)paramzaie).u(), paramzabu, paramArrayList, paramInt, paramzhe))
        {
          a(paramzaie, paramArrayList, paramInt);
          return true;
        }
      }
      else
      {
        localObject1 = (zabk)paramzaie;
        if ((a(((zabk)localObject1).G(), paramzabu, paramArrayList, paramInt, paramzhe) | a(((zabk)localObject1).H(), paramzabu, paramArrayList, paramInt, paramzhe)))
        {
          a(paramzaie, paramArrayList, paramInt);
          return true;
        }
      }
      break;
    case 9: 
      localObject1 = ((zabo)paramzaie).o();
      localObject2 = ((zbap)localObject1).a();
      if ((((zbap)localObject1).m()) && ((localObject2 == null) || (localObject2 == this.d.o)) && (((zbap)localObject1).b() == paramzhe.b()) && (((zbap)localObject1).d() == paramzhe.c()))
      {
        paramzaie.a(paramzabu);
        return true;
      }
      if (paramzhe.a((zbap)localObject1))
      {
        a(paramzaie, paramArrayList, paramInt);
        return true;
      }
      break;
    }
    if (paramInt > 0) {
      for (int i = 0; i < paramInt; i++) {
        if (paramArrayList.get(i) == paramzaie) {
          return true;
        }
      }
    }
    paramzaie.a(false);
    return false;
  }
  
  private void b()
  {
    this.B += 1L;
  }
  
  private void a(long paramLong, HashMap paramHashMap)
  {
    zaai localzaai = this.d.p.e.get(zaai.a(paramLong)).getCells().a.a(zaai.b(paramLong));
    if (!this.z.containsKey(Long.valueOf(paramLong))) {
      this.z.put(Long.valueOf(paramLong), new zaak(localzaai));
    }
    localzaai.a((byte)3);
    Object localObject = paramHashMap.get(Long.valueOf(paramLong));
    if ((localObject != zhf.j) && (localObject != zhf.k))
    {
      long[] arrayOfLong = (long[])localObject;
      if (arrayOfLong[0] != this.B)
      {
        arrayOfLong[0] = this.B;
        for (int i = 1; i < arrayOfLong.length; i++) {
          a(arrayOfLong[i], paramHashMap);
        }
      }
    }
  }
  
  private void b(long paramLong, HashMap paramHashMap)
  {
    Object localObject = paramHashMap.get(Long.valueOf(paramLong));
    if (localObject == zhf.j) {
      return;
    }
    Worksheet localWorksheet = this.d.p.e.get(zaai.a(paramLong));
    zaai localzaai = localWorksheet.getCells().a.a(zaai.b(paramLong));
    zaca localzaca = new zaca(this.d);
    if (localzaca.c != localWorksheet) {
      localzaca.a(localWorksheet);
    }
    localzaai.b(localzaca);
  }
  
  private void a(zaie paramzaie, ArrayList paramArrayList, int paramInt)
  {
    if (paramInt > 0) {
      if (paramzaie.l() != null) {
        paramzaie.a(null);
      } else {
        for (int i = 0; i < paramInt; i++) {
          if (paramArrayList.get(i) == paramzaie) {
            return;
          }
        }
      }
    }
    zf.a(paramArrayList, paramzaie);
  }
  
  private za a(int paramInt, zgs paramzgs)
  {
    if (paramzgs.c != 5) {
      return new zf(zabt.a(paramzgs.c, paramzgs.d));
    }
    zaca localzaca = this.d;
    this.d = new zaca(this.d);
    zaai localzaai = (zaai)paramzgs.d;
    this.d.a(localzaai);
    zaie localzaie = localzaai.a(this.d, true);
    ArrayList localArrayList = new ArrayList(8);
    long[] arrayOfLong1 = null;
    long[] arrayOfLong2 = null;
    if (this.m)
    {
      this.x.d();
      this.x.a(this.d);
      if (a(localzaie, this.t, localArrayList, 0, this.x)) {
        arrayOfLong1 = this.x.e();
      }
      this.x.a(localzaca);
    }
    if (this.n)
    {
      this.y.d();
      this.y.a(this.d);
      if (a(localzaie, this.u, localArrayList, localArrayList.size(), this.y)) {
        arrayOfLong2 = this.y.e();
      }
      this.y.a(localzaca);
    }
    this.d = localzaca;
    if (localArrayList.size() < 1) {
      return new zf(localzaie.e(this.d));
    }
    long l = Cell.a(this.d.n, paramInt, paramzgs.a);
    zaie[] arrayOfzaie = new zaie[localArrayList.size()];
    for (int i = 0; i < arrayOfzaie.length; i++) {
      arrayOfzaie[i] = ((zaie)localArrayList.get(i));
    }
    if (arrayOfLong1 != null)
    {
      if (arrayOfLong2 != null) {
        return new ze(localzaie, l, arrayOfzaie, arrayOfLong1, arrayOfLong2);
      }
      return new zd(localzaie, l, arrayOfzaie, arrayOfLong1);
    }
    if (arrayOfLong2 != null) {
      return new zb(localzaie, l, arrayOfzaie, arrayOfLong2);
    }
    return new zc(localzaie, l, arrayOfzaie);
  }
  
  private void a(zt paramzt)
  {
    int i = paramzt.b(this.l);
    if (i > -1)
    {
      zgs localzgs = paramzt.a(i, new zgs(), 5);
      this.A = a(paramzt.i(), localzgs);
      if ((this.o) || (this.n))
      {
        this.u.a = this.A.a(this);
        this.d.p.a(this.j, this.u.a);
      }
    }
    else
    {
      this.A = this.q;
      if ((this.o) || (this.n))
      {
        this.u.a = zabg.a;
        this.d.p.a(this.j, this.u.a);
      }
    }
  }
  
  private class ze
    extends zfp.zc
  {
    private long[] g;
    private long[] h;
    
    ze(zaie paramzaie, long paramLong, zaie[] paramArrayOfzaie, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
    {
      super(paramzaie, paramLong, paramArrayOfzaie);
      this.g = paramArrayOfLong1;
      this.h = paramArrayOfLong2;
    }
    
    protected void b(zfp paramzfp)
    {
      zfp.e(paramzfp);
      long l;
      for (l : this.g) {
        zfp.a(paramzfp, l, zfp.f(paramzfp));
      }
      for (l : this.h) {
        zfp.a(paramzfp, l, zfp.g(paramzfp));
      }
      zfp.e(paramzfp);
      for (l : this.g) {
        zfp.b(paramzfp, l, zfp.f(paramzfp));
      }
      for (l : this.h) {
        zfp.b(paramzfp, l, zfp.g(paramzfp));
      }
    }
  }
  
  private class zb
    extends zfp.zc
  {
    private long[] g;
    
    zb(zaie paramzaie, long paramLong, zaie[] paramArrayOfzaie, long[] paramArrayOfLong)
    {
      super(paramzaie, paramLong, paramArrayOfzaie);
      this.g = paramArrayOfLong;
    }
    
    protected void b(zfp paramzfp)
    {
      zfp.e(paramzfp);
      long l;
      for (l : this.g) {
        zfp.a(paramzfp, l, zfp.g(paramzfp));
      }
      zfp.e(paramzfp);
      for (l : this.g) {
        zfp.b(paramzfp, l, zfp.g(paramzfp));
      }
    }
  }
  
  private class zd
    extends zfp.zc
  {
    private long[] g;
    
    zd(zaie paramzaie, long paramLong, zaie[] paramArrayOfzaie, long[] paramArrayOfLong)
    {
      super(paramzaie, paramLong, paramArrayOfzaie);
      this.g = paramArrayOfLong;
    }
    
    protected void b(zfp paramzfp)
    {
      zfp.e(paramzfp);
      long l;
      for (l : this.g) {
        zfp.a(paramzfp, l, zfp.f(paramzfp));
      }
      zfp.e(paramzfp);
      for (l : this.g) {
        zfp.b(paramzfp, l, zfp.f(paramzfp));
      }
    }
  }
  
  private class zc
    extends zfp.za
  {
    protected long d;
    protected zaie[] e;
    
    boolean a()
    {
      return false;
    }
    
    zc(zaie paramzaie, long paramLong, zaie[] paramArrayOfzaie)
    {
      super(paramzaie);
      this.d = paramLong;
      this.e = paramArrayOfzaie;
    }
    
    zaie a(zfp paramzfp)
    {
      if (this.e != null) {
        for (Object localObject2 : this.e) {
          ((zaie)localObject2).a(null);
        }
      }
      b(paramzfp);
      ??? = this.a.e(paramzfp.d);
      paramzfp.d.p.a(this.d, (zaie)???);
      return (zaie)???;
    }
    
    protected void b(zfp paramzfp) {}
  }
  
  private class zf
    extends zfp.za
  {
    zf(zaie paramzaie)
    {
      super(paramzaie);
    }
    
    boolean a()
    {
      return true;
    }
    
    zaie a(zfp paramzfp)
    {
      return this.a;
    }
  }
  
  private abstract class za
  {
    protected zaie a;
    
    protected za(zaie paramzaie)
    {
      this.a = paramzaie;
    }
    
    abstract boolean a();
    
    abstract zaie a(zfp paramzfp);
  }
  
  private class zg
    implements zaha
  {
    private zgs d = new zgs();
    private zfp e;
    private boolean f = true;
    private boolean g = true;
    int a;
    int b;
    
    zg(zfp paramzfp)
    {
      this.a = paramzfp.k;
      this.e = paramzfp;
    }
    
    zg(zg paramzg)
    {
      this.a = paramzg.a;
      this.b = paramzg.b;
      this.f = paramzg.f;
      this.g = paramzg.g;
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
            zfp.a(this.e)[0] = zfp.a(this.e, i, localzgs);
            this.e.p = zfp.a(this.e)[0].a();
          }
          this.f = false;
          return false;
        }
      }
      if (this.e.p)
      {
        if (localzgs.c == 5) {
          ((zaai)localzgs.d).b(zfp.a(this.e)[0].a(this.e), this.e.d);
        }
        return false;
      }
      if (this.g)
      {
        if (i == this.e.k)
        {
          zfp.a(this.e)[(this.b - this.e.l)] = zfp.a(this.e, i, localzgs);
          return false;
        }
        this.g = false;
      }
      if (i != this.a)
      {
        this.a = i;
        if (this.b == this.e.l)
        {
          zfp.a(this.e, zfp.a(this.e, i, localzgs));
          if ((this.e.o) || (this.e.n))
          {
            zfp.b(this.e).a = zfp.c(this.e).a(this.e);
            this.e.d.p.a(this.e.j, zfp.b(this.e).a);
          }
          return false;
        }
        if (this.e.e > -1)
        {
          zfp.a(this.e, paramzt);
        }
        else
        {
          zfp.a(this.e, zfp.d(this.e));
          if ((this.e.o) || (this.e.n))
          {
            zfp.b(this.e).a = zabg.a;
            this.e.d.p.a(this.e.j, zfp.b(this.e).a);
          }
        }
      }
      if ((localzgs.c != 5) || (this.b == this.e.l)) {
        return false;
      }
      zfp.a(this.e, (zaai)localzgs.d);
      return false;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */