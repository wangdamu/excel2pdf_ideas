package com.aspose.cells;

class zaab
  extends zl
{
  private zahf[] c;
  private zzy[] d;
  private zahf e;
  
  public zaab(zig paramzig, zahf[] paramArrayOfzahf, zzy[] paramArrayOfzzy, zahf paramzahf)
  {
    super(paramzig);
    this.c = paramArrayOfzahf;
    this.d = paramArrayOfzzy;
    this.e = paramzahf;
  }
  
  public zzy[] c()
  {
    return this.d;
  }
  
  public zahf[] d()
  {
    return this.c;
  }
  
  public zahf e()
  {
    return this.e;
  }
  
  public double a(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    if (this.c.length >= 2)
    {
      zahf localzahf = paramDouble > 0.0D ? this.c[0] : this.c[1];
      switch (localzahf.a())
      {
      case 2: 
      case 4: 
      case 5: 
        return ((zs)localzahf).a(paramDouble);
      }
    }
    return paramDouble;
  }
  
  public zzz a(zzu paramzzu, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 9: 
      return b(paramzzu, ((Integer)paramObject).intValue());
    case 14: 
      return b(paramzzu, ((Double)paramObject).doubleValue());
    case 16: 
      return b(paramzzu, (DateTime)paramObject);
    case 18: 
      if (zbxa.a((String)paramObject))
      {
        this.b.a();
        this.b.a(1, com.aspose.cells.b.a.zs.a(paramObject));
        return this.b;
      }
      break;
    }
    zahf localzahf = b(paramzzu, paramInt, paramObject);
    if (localzahf != null)
    {
      if ((this.c.length == 3) && (this.e != null) && (localzahf.a() == 1)) {
        return ((zir)localzahf).a(paramzzu, paramInt, paramObject, true);
      }
      return localzahf.a(paramzzu, paramInt, paramObject);
    }
    return f();
  }
  
  public zahf a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return b(null, zaoj.a(paramObject.getClass()), paramObject);
  }
  
  public zahf a(zzu paramzzu, double paramDouble)
  {
    for (int i = 0; i < this.c.length; i++) {
      if (this.d[i].a(paramDouble)) {
        return this.c[i];
      }
    }
    return this.e;
  }
  
  public zahf a(zzu paramzzu, DateTime paramDateTime)
  {
    double d1 = a(paramDateTime);
    for (int i = 0; i < this.c.length; i++) {
      if (this.d[i].a(d1)) {
        return this.c[i];
      }
    }
    return this.e;
  }
  
  public zahf b(zzu paramzzu, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 9: 
      return a(paramzzu, ((Integer)paramObject).intValue());
    case 14: 
      return a(paramzzu, ((Double)paramObject).doubleValue());
    case 16: 
      return a(paramzzu, (DateTime)paramObject);
    case 3: 
    case 18: 
      if (this.e != null) {
        return this.e;
      }
      for (i = 0; i < this.c.length; i++) {
        if (this.d[i].a(paramInt, paramObject, this.a.c().c())) {
          return this.c[i];
        }
      }
      return this.e;
    }
    for (int i = 0; i < this.c.length; i++) {
      if (this.d[i].a(paramInt, paramObject, this.a.c().c())) {
        return this.c[i];
      }
    }
    return this.e;
  }
  
  public int b(Object paramObject)
  {
    if (paramObject == null) {
      return 0;
    }
    zahf localzahf = b(null, zaoj.a(paramObject.getClass()), paramObject);
    if (localzahf == null) {
      return 0;
    }
    return localzahf.g();
  }
  
  private zzz a(zahf paramzahf, zzu paramzzu, int paramInt, Object paramObject)
  {
    if (paramzahf.a() == 1) {
      return ((zir)paramzahf).a(paramzzu, paramInt, paramObject, true);
    }
    return paramzahf.a(paramzzu, paramInt, paramObject);
  }
  
  private zzz b(zzu paramzzu, DateTime paramDateTime)
  {
    double d1 = a(paramDateTime);
    zahf localzahf = a(paramzzu, d1);
    if (localzahf != null)
    {
      if (localzahf.a() == 3) {
        return ((zn)localzahf).a(paramzzu, paramDateTime, d1, true);
      }
      return a(localzahf, paramzzu, 14, Double.valueOf(d1));
    }
    return f();
  }
  
  private zzz b(zzu paramzzu, double paramDouble)
  {
    for (int i = 0; i < this.c.length; i++) {
      if (this.d[i].a(paramDouble)) {
        return a(this.c[i], paramzzu, 14, Double.valueOf((paramDouble < 0.0D) && ((this.c.length != 1) || (this.d[i].a() != 6)) ? -paramDouble : paramDouble));
      }
    }
    if (this.e != null) {
      return a(this.e, paramzzu, 14, Double.valueOf(paramDouble));
    }
    return f();
  }
  
  private zzz f()
  {
    this.b.a();
    this.b.a(1, "");
    return this.b;
  }
  
  public int a()
  {
    return 6;
  }
  
  public int g()
  {
    for (zahf localzahf : this.c) {
      switch (localzahf.a())
      {
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        return localzahf.g();
      }
    }
    if (this.e != null) {
      switch (this.e.a())
      {
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        return this.e.g();
      }
    }
    return this.c[0].g();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */