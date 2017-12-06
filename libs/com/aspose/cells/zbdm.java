package com.aspose.cells;

class zbdm
  extends zv
{
  private zajl a;
  private zabw b;
  private int c;
  private zc d;
  
  zbdm(int paramInt1, int paramInt2, zajl paramzajl, zabw paramzabw)
  {
    this.a = paramzajl;
    this.b = paramzabw;
    this.d = new zc(paramInt1);
    this.c = paramInt2;
  }
  
  public zajl c()
  {
    return this.a;
  }
  
  public void a(zajl paramzajl)
  {
    this.a = paramzajl;
  }
  
  public int b(int paramInt)
  {
    return zld.a(this.d, paramInt, -1);
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return zld.a(this.d, paramInt1, paramInt2);
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return this.d.a(paramInt1, paramInt2, paramInt3);
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    return zld.a(this.d, paramInt1, paramInt2);
  }
  
  public int c(int paramInt)
  {
    return paramInt;
  }
  
  public int d(int paramInt)
  {
    return paramInt;
  }
  
  public int a(int paramInt, boolean paramBoolean)
  {
    return this.d.a(paramInt, paramBoolean);
  }
  
  public zaiv b()
  {
    return this.d.a(this);
  }
  
  public zaiv a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return this.d.a(this, paramInt1, paramInt2, paramBoolean);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.d.a(paramInt1, paramInt2);
  }
  
  public int d(int paramInt1, int paramInt2)
  {
    return this.d.b(paramInt1, paramInt2);
  }
  
  public int e(int paramInt1, int paramInt2)
  {
    return this.d.c(paramInt1, paramInt2);
  }
  
  public void e(int paramInt)
  {
    this.d.b(paramInt);
  }
  
  public boolean g(int paramInt1, int paramInt2)
  {
    return this.d.d(paramInt1, paramInt2);
  }
  
  public int a()
  {
    return this.d.b();
  }
  
  public int a(int paramInt)
  {
    return this.d.b[paramInt].b.a;
  }
  
  public void f(int paramInt1, int paramInt2)
  {
    while (paramInt1 < this.d.a)
    {
      this.d.b[paramInt1].b.a += paramInt2;
      paramInt1++;
    }
  }
  
  public void j(int paramInt1, int paramInt2) {}
  
  public int a(int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    return this.d.a(paramInt1, new za(new zbdx(paramzbdx), paramInt2 < 0 ? this.c : paramInt2));
  }
  
  public int a(int paramInt, zt paramzt, boolean paramBoolean)
  {
    if ((paramBoolean) || (!(paramzt instanceof zb))) {
      return this.d.a(paramInt, a(paramzt, paramBoolean));
    }
    return this.d.a(paramInt, ((zb)paramzt).a);
  }
  
  private za a(zt paramzt, boolean paramBoolean)
  {
    zbdx localzbdx1 = new zbdx();
    zbdx localzbdx2 = paramzt.a(localzbdx1, 15);
    if ((paramBoolean) && (localzbdx2 != localzbdx1))
    {
      localzbdx1.a(localzbdx2);
      localzbdx2 = localzbdx1;
    }
    int i = paramzt.a();
    za localza = new za(localzbdx2, i);
    if (i > 0)
    {
      zaiv localzaiv = paramzt.a(-1, -1, false);
      zgs localzgs1 = new zgs();
      for (int j = 0; j < i; j++)
      {
        zgs localzgs2 = paramzt.a(localzaiv.a(), localzgs1, 7);
        if (localzgs2 == localzgs1)
        {
          localza.c[j] = localzgs2;
          localzgs1 = new zgs();
        }
        else if (paramBoolean)
        {
          localzgs1.a(localzgs2);
          localza.c[j] = localzgs1;
          localzgs1 = new zgs();
        }
        else
        {
          localza.c[j] = localzgs2;
        }
      }
      localza.a = i;
    }
    return localza;
  }
  
  public int a(int paramInt1, zv paramzv, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramInt3 < 1) {
      return paramInt1;
    }
    if ((paramBoolean) || (!(paramzv instanceof zbdm)))
    {
      za[] arrayOfza = new za[paramInt3];
      zaiv localzaiv = paramzv.a(paramInt2, -1, false);
      for (int i = 0; i < paramInt3; i++) {
        arrayOfza[i] = a(paramzv.f(localzaiv.a()), paramBoolean);
      }
      return this.d.a(paramInt1, arrayOfza, 0, arrayOfza.length);
    }
    return this.d.a(paramInt1, ((zbdm)paramzv).d.b, paramInt2 < 0 ? 0 : paramInt2, paramInt3);
  }
  
  public zt f(int paramInt)
  {
    return new zb(this, paramInt, this.d.b[paramInt]);
  }
  
  public zt a(Object paramObject)
  {
    return new zb(this, -1, (za)paramObject);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.d.d(paramInt1, paramInt2);
    for (int i = 0; i < this.d.a; i++) {
      this.d.b[i].d(paramInt3, paramInt4);
    }
  }
  
  public zbdx b(int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    return this.d.b[paramInt1].b;
  }
  
  public void c(int paramInt1, zbdx paramzbdx, int paramInt2)
  {
    zbdx localzbdx = this.d.b[paramInt1].b;
    if (localzbdx != paramzbdx) {
      localzbdx.a(paramzbdx, paramInt2);
    }
  }
  
  public byte k(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return this.d.b[paramInt1].b.b;
    }
    return this.d.b[paramInt1].b.c;
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte)
  {
    if (paramInt2 == 0) {
      this.d.b[paramInt1].b.b = paramByte;
    } else {
      this.d.b[paramInt1].b.c = paramByte;
    }
  }
  
  public int g(int paramInt)
  {
    return this.d.b[paramInt].b.e;
  }
  
  public boolean d()
  {
    return false;
  }
  
  private class za
    extends zj
  {
    zbdx b;
    zgs[] c;
    
    za(zbdx paramzbdx, int paramInt)
    {
      this.b = paramzbdx;
      this.c = new zgs[paramInt];
    }
    
    public int c(int paramInt)
    {
      return this.c[paramInt].a;
    }
    
    protected Object[] a()
    {
      return this.c;
    }
    
    protected void a(Object[] paramArrayOfObject)
    {
      this.c = ((zgs[])paramArrayOfObject);
    }
    
    protected Object[] a(int paramInt)
    {
      return new zgs[paramInt];
    }
  }
  
  private class zc
    extends zj
  {
    zbdm.za[] b;
    
    zc(int paramInt)
    {
      this.b = new zbdm.za[paramInt];
    }
    
    public int c(int paramInt)
    {
      return this.b[paramInt].b.a;
    }
    
    protected Object[] a()
    {
      return this.b;
    }
    
    protected void a(Object[] paramArrayOfObject)
    {
      this.b = ((zbdm.za[])paramArrayOfObject);
    }
    
    protected Object[] a(int paramInt)
    {
      return new zbdm.za[paramInt];
    }
  }
  
  private class zb
    extends zt
  {
    private zbdm c;
    zbdm.za a;
    private int d;
    
    zb(zbdm paramzbdm, int paramInt, zbdm.za paramza)
    {
      this.c = paramzbdm;
      this.d = paramInt;
      this.a = paramza;
    }
    
    public int a()
    {
      return this.a.a;
    }
    
    public int b(int paramInt)
    {
      return zld.a(this.a, paramInt, -1);
    }
    
    public int a(int paramInt1, int paramInt2)
    {
      return zld.a(this.a, paramInt1, paramInt2);
    }
    
    public int a(int paramInt1, int paramInt2, int paramInt3)
    {
      return this.a.a(paramInt1, paramInt2, paramInt3);
    }
    
    public int b(int paramInt1, int paramInt2)
    {
      return zld.a(this.a, paramInt1, paramInt2);
    }
    
    public int c(int paramInt)
    {
      return paramInt;
    }
    
    public int d(int paramInt)
    {
      return paramInt;
    }
    
    public int a(int paramInt, boolean paramBoolean)
    {
      return this.a.a(paramInt, paramBoolean);
    }
    
    public zaiv b()
    {
      return this.a.a(this);
    }
    
    public zaiv a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      return this.a.a(this, paramInt1, paramInt2, paramBoolean);
    }
    
    public void c(int paramInt1, int paramInt2)
    {
      this.a.a(paramInt1, paramInt2);
    }
    
    public int d(int paramInt1, int paramInt2)
    {
      return this.a.b(paramInt1, paramInt2);
    }
    
    public int e(int paramInt1, int paramInt2)
    {
      return this.a.c(paramInt1, paramInt2);
    }
    
    public void e(int paramInt)
    {
      this.a.b(paramInt);
    }
    
    public boolean g(int paramInt1, int paramInt2)
    {
      return this.a.d(paramInt1, paramInt2);
    }
    
    public int a(int paramInt)
    {
      return this.a.c[paramInt].a;
    }
    
    public void f(int paramInt1, int paramInt2)
    {
      while (paramInt1 < this.a.a)
      {
        zgs tmp20_19 = this.a.c[paramInt1];
        tmp20_19.a = ((short)(tmp20_19.a + (short)paramInt2));
        paramInt1++;
      }
    }
    
    public int a(int paramInt, zgs paramzgs)
    {
      return this.a.a(paramInt, new zgs(paramzgs));
    }
    
    public int a(int paramInt1, zgs[] paramArrayOfzgs, int paramInt2, int paramInt3)
    {
      return this.a.a(paramInt1, paramArrayOfzgs, paramInt2, paramInt3);
    }
    
    public int a(int paramInt1, zt paramzt, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      if (paramInt3 < 1) {
        return paramInt1;
      }
      if (!(paramzt instanceof zb)) {
        return super.a(paramInt1, paramzt, paramInt2, paramInt3, paramBoolean);
      }
      zb localzb = (zb)paramzt;
      if ((!paramBoolean) && (paramInt3 == localzb.a.a) && (this.a.a == 0))
      {
        this.a.c = localzb.a.c;
        this.a.a = paramInt3;
        return 0;
      }
      return this.a.a(paramInt1, localzb.a.c, paramInt2 < 0 ? 0 : paramInt2, paramInt3);
    }
    
    public int a(zt paramzt, boolean paramBoolean)
    {
      if (!(paramzt instanceof zb))
      {
        this.a.a = 0;
        return super.a(0, paramzt, -1, paramzt.a(), paramBoolean);
      }
      return a((zb)paramzt, paramBoolean);
    }
    
    public int a(zb paramzb, boolean paramBoolean)
    {
      if (paramzb.a == this.a) {
        return 0;
      }
      if (paramBoolean)
      {
        if (this.a.c != paramzb.a.c)
        {
          this.a.a = 0;
          this.a.a(0, paramzb.a.c, 0, paramzb.a.a);
        }
        else
        {
          this.a.a = paramzb.a.a;
        }
      }
      else
      {
        this.a.c = paramzb.a.c;
        this.a.a = paramzb.a.a;
      }
      return 0;
    }
    
    public int g(int paramInt)
    {
      return this.a.c[paramInt].b;
    }
    
    public void j(int paramInt1, int paramInt2)
    {
      this.a.c[paramInt1].b = paramInt2;
    }
    
    public int h(int paramInt)
    {
      return this.a.c[paramInt].c;
    }
    
    public Object i(int paramInt)
    {
      return this.a.c[paramInt].d;
    }
    
    public void b(int paramInt, zgs paramzgs)
    {
      zgs localzgs = this.a.c[paramInt];
      if (localzgs != paramzgs) {
        localzgs.a(paramzgs, 4);
      }
    }
    
    public int j(int paramInt)
    {
      switch (this.a.c[paramInt].c)
      {
      case 4: 
        return ((zbbj)this.a.c[paramInt].d).e;
      case 5: 
        return ((zaai)this.a.c[paramInt].d).a;
      }
      return -1;
    }
    
    public void k(int paramInt1, int paramInt2)
    {
      switch (this.a.c[paramInt1].c)
      {
      case 4: 
        this.a.c[paramInt1].d = this.c.c().a(paramInt2);
        break;
      case 5: 
        this.a.c[paramInt1].d = zbdm.a(this.c).a(paramInt2);
      }
    }
    
    public zgs c(int paramInt, zgs paramzgs)
    {
      return this.a.c[paramInt];
    }
    
    public zgs a(int paramInt1, zgs paramzgs, int paramInt2)
    {
      return this.a.c[paramInt1];
    }
    
    public void b(int paramInt1, zgs paramzgs, int paramInt2)
    {
      zgs localzgs = this.a.c[paramInt1];
      if (paramzgs != localzgs) {
        localzgs.a(paramzgs, paramInt2);
      }
    }
    
    public boolean d()
    {
      return true;
    }
    
    public boolean e()
    {
      return true;
    }
    
    public boolean f()
    {
      return true;
    }
    
    public int i()
    {
      return this.a.b.a;
    }
    
    public int j()
    {
      return this.a.b.d;
    }
    
    public void k(int paramInt)
    {
      this.a.b.d = paramInt;
    }
    
    public byte l(int paramInt)
    {
      if (paramInt == 0) {
        return this.a.b.b;
      }
      return this.a.b.c;
    }
    
    public void a(int paramInt, byte paramByte)
    {
      if (paramInt == 0) {
        this.a.b.b = paramByte;
      } else {
        this.a.b.c = paramByte;
      }
    }
    
    public int k()
    {
      return this.a.b.e;
    }
    
    public void m(int paramInt)
    {
      this.a.b.e = ((short)paramInt);
    }
    
    public boolean l(int paramInt1, int paramInt2)
    {
      return this.a.d(paramInt1, paramInt2);
    }
    
    public zbdx a(zbdx paramzbdx, int paramInt)
    {
      if (paramzbdx != this.a.b)
      {
        paramzbdx.a(this.a.b, paramInt);
        return this.a.b;
      }
      return paramzbdx;
    }
    
    public void b(zbdx paramzbdx, int paramInt)
    {
      if (paramzbdx != this.a.b) {
        this.a.b.a(paramzbdx, paramInt);
      }
    }
    
    public Object l()
    {
      return this.a;
    }
    
    public int g()
    {
      this.d = this.c.b(this.a.b.a, this.d);
      if (this.d > -1) {
        this.a = zbdm.b(this.c).b[this.d];
      }
      return this.d;
    }
    
    public void f(int paramInt)
    {
      this.d = paramInt;
      this.a = zbdm.b(this.c).b[this.d];
    }
    
    public void h() {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */