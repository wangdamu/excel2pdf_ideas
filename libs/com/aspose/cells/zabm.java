package com.aspose.cells;

abstract class zabm
  extends zabh
{
  protected zaie a;
  
  public abstract zabm q();
  
  public static zabm r()
  {
    return new zb(null);
  }
  
  public static zabm s()
  {
    return new zd(null);
  }
  
  public static zabm t()
  {
    return new ze(null);
  }
  
  public zaie u()
  {
    return this.a;
  }
  
  public void c(zaie paramzaie)
  {
    this.a = paramzaie;
  }
  
  public void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a != null)) {
      this.a.b(true);
    }
  }
  
  public boolean o()
  {
    return true;
  }
  
  public zaie m()
  {
    zabm localzabm = q();
    localzabm.a = this.a.m();
    return localzabm;
  }
  
  public int g()
  {
    if (this.a.g() == 96) {
      return 96;
    }
    return 64;
  }
  
  public int a(zaca paramzaca)
  {
    if (this.a.a(paramzaca) == 96) {
      return 96;
    }
    return 64;
  }
  
  public void h()
  {
    this.a.h();
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    return this.a.b(paramzaca, paramInt);
  }
  
  public boolean c(zaca paramzaca)
  {
    return this.a.c(paramzaca);
  }
  
  public int b(zaca paramzaca, boolean paramBoolean)
  {
    return this.a.b(paramzaca, paramBoolean);
  }
  
  public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return this.a.a(paramzaca, paramInt1, paramInt2, paramBoolean);
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    return this.a.c(paramzaca, paramBoolean);
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    b(paramzahh, paramzaah);
    this.a.a(paramzahh, paramzaah);
  }
  
  public boolean f(zaca paramzaca)
  {
    return this.a.f(paramzaca);
  }
  
  public boolean g(zaca paramzaca)
  {
    return this.a.g(paramzaca);
  }
  
  public boolean h(zaca paramzaca)
  {
    return this.a.h(paramzaca);
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    zaie localzaie = this.a.a(paramArrayOfInt, paramzaca, paramBoolean);
    if ((paramArrayOfInt[0] == 1) && (paramArrayOfInt[1] == 1)) {
      return this;
    }
    zabm localzabm = q();
    localzabm.a = localzaie;
    return localzabm;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    zaie localzaie = this.a.a(paramArrayOfInt, paramzaca);
    if (paramArrayOfInt[0] == 1) {
      return this;
    }
    zabm localzabm = q();
    localzabm.a = localzaie;
    return localzabm;
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    zaie localzaie = this.a.b(paramArrayOfInt, paramzaca);
    if (paramArrayOfInt[0] == 1) {
      return this;
    }
    zabm localzabm = q();
    localzabm.a = localzaie;
    return localzabm;
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    if ((paramzaca.h) || (this.a.g() == 96))
    {
      zaiw localzaiw = this.a.a(paramzaca, false);
      if (!localzaiw.l()) {
        return new zazd(localzaiw, new zmo(paramzaca, this, paramzaca.d, paramzaca.e), paramzaca);
      }
    }
    this.a.a(false);
    return new zbak(this);
  }
  
  public boolean a(zaie paramzaie)
  {
    if (paramzaie.b() != 5) {
      return false;
    }
    zabh localzabh = (zabh)paramzaie;
    if (localzabh.a() != a()) {
      return false;
    }
    zabm localzabm = (zabm)paramzaie;
    return this.a.a(localzabm.a);
  }
  
  public zaie b(zaie paramzaie)
  {
    if (a(paramzaie)) {
      return this;
    }
    return this.a.b(paramzaie);
  }
  
  private static class zb
    extends zabm.zc
  {
    private zb()
    {
      super();
    }
    
    public byte a()
    {
      return 20;
    }
    
    public zabm q()
    {
      return new zb();
    }
    
    public String p()
    {
      return "%";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("%");
    }
    
    public double a(double paramDouble)
    {
      return paramDouble / 100.0D;
    }
  }
  
  private static class zd
    extends zabm.zc
  {
    private zd()
    {
      super();
    }
    
    public byte a()
    {
      return 19;
    }
    
    public zabm q()
    {
      return new zd();
    }
    
    public String p()
    {
      return "-";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("-");
    }
    
    public double a(double paramDouble)
    {
      return -paramDouble;
    }
  }
  
  private static abstract class zc
    extends zabm
  {
    public abstract double a(double paramDouble);
    
    public zaie d(zaca paramzaca)
    {
      zaie localzaie = this.a.e(paramzaca);
      if (localzaie.b() == 0) {
        return localzaie;
      }
      if (localzaie == zabg.a) {
        return zabb.a;
      }
      zabb localzabb = localzaie.a(paramzaca, 7);
      if (localzabb != null) {
        return new zabb(a(localzabb.o()));
      }
      return zabc.f;
    }
  }
  
  private static class ze
    extends zabm.za
  {
    private ze()
    {
      super();
    }
    
    public byte a()
    {
      return 18;
    }
    
    public zabm q()
    {
      return new ze();
    }
    
    public String p()
    {
      return "+";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("+");
    }
    
    public zaiw a(zaca paramzaca, boolean paramBoolean)
    {
      return this.a.a(paramzaca, paramBoolean);
    }
    
    public void a(zahh paramzahh, zaah paramzaah)
    {
      b(paramzahh, paramzaah);
      this.a.a(paramzahh, paramzaah);
    }
  }
  
  private static abstract class za
    extends zabm
  {
    public zaie d(zaca paramzaca)
    {
      return this.a.d(paramzaca);
    }
    
    public boolean j()
    {
      return this.a.j();
    }
    
    public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
    {
      zaie localzaie = this.a.a(paramArrayOfInt, paramzaca, paramBoolean);
      if ((paramArrayOfInt[0] == 1) && (paramArrayOfInt[1] == 1)) {
        return this;
      }
      return localzaie;
    }
    
    public zaie a(int[] paramArrayOfInt, zaca paramzaca)
    {
      zaie localzaie = this.a.a(paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] == 1) {
        return this;
      }
      return localzaie;
    }
    
    public zaie b(int[] paramArrayOfInt, zaca paramzaca)
    {
      zaie localzaie = this.a.b(paramArrayOfInt, paramzaca);
      if (paramArrayOfInt[0] == 1) {
        return this;
      }
      return localzaie;
    }
    
    public zaiw a(zaca paramzaca, boolean paramBoolean)
    {
      if ((paramzaca.h) || (this.a.g() == 96)) {
        return this.a.a(paramzaca, false);
      }
      return new zbak(this.a.e(paramzaca));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */