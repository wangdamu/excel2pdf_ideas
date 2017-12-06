package com.aspose.cells;

abstract class zabk
  extends zabh
{
  protected zaie a;
  protected zaie b;
  protected zabu c;
  
  public abstract zabk w();
  
  protected abstract zaie k(zaca paramzaca);
  
  public static zabk x()
  {
    return new zb(null);
  }
  
  public static zabk y()
  {
    return new ze(null);
  }
  
  public static zabk z()
  {
    return new za(null);
  }
  
  public static zabk A()
  {
    return new zc(null);
  }
  
  public static zabk B()
  {
    return new zj(null);
  }
  
  public static zabk C()
  {
    return new zd(null);
  }
  
  public static zabk D()
  {
    return new zg(null);
  }
  
  public static zabk E()
  {
    return new zh(null);
  }
  
  public static zabk F()
  {
    return new zi(null);
  }
  
  public zaie G()
  {
    return this.a;
  }
  
  public void c(zaie paramzaie)
  {
    this.a = paramzaie;
  }
  
  public zaie H()
  {
    return this.b;
  }
  
  public void d(zaie paramzaie)
  {
    this.b = paramzaie;
  }
  
  public zabk I()
  {
    zabk localzabk = w();
    localzabk.a = this.a;
    localzabk.b = this.b;
    return localzabk;
  }
  
  public boolean o()
  {
    return false;
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
    if (paramBoolean)
    {
      this.a.a(true);
      this.b.a(true);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.c != null) {
      this.c.a();
    }
    if (paramBoolean)
    {
      this.a.b(true);
      this.b.b(true);
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
  
  public zaie m()
  {
    zabk localzabk = w();
    localzabk.a = this.a.m();
    localzabk.b = this.b.m();
    if (this.c != null) {
      localzabk.c = this.c.b();
    }
    return localzabk;
  }
  
  public void n()
  {
    if (this.c != null) {
      this.c.c();
    }
  }
  
  public void J()
  {
    this.c = null;
  }
  
  public int g()
  {
    int i = this.a.g();
    if (i == 96) {
      return i;
    }
    int j = this.b.g();
    if (j != 64) {
      return j;
    }
    return i;
  }
  
  public int a(zaca paramzaca)
  {
    int i = this.a.a(paramzaca);
    if (i == 96) {
      return i;
    }
    int j = this.b.a(paramzaca);
    if (j != 64) {
      return j;
    }
    return i;
  }
  
  public void h()
  {
    this.a.h();
    this.b.h();
  }
  
  public boolean c(zaca paramzaca)
  {
    if (this.a.c(paramzaca)) {
      return true;
    }
    return this.b.c(paramzaca);
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    int i = this.a.b(paramzaca, paramInt) | this.b.b(paramzaca, paramInt);
    if (i > 1) {
      return 2;
    }
    return i;
  }
  
  public int b(zaca paramzaca, boolean paramBoolean)
  {
    return this.a.b(paramzaca, paramBoolean) & this.b.b(paramzaca, paramBoolean);
  }
  
  public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = false;
    if (this.a.a(paramzaca, paramInt1, paramInt2, false)) {
      bool = true;
    }
    if (this.b.a(paramzaca, paramInt1, paramInt2, false)) {
      bool = true;
    }
    if ((bool) && (this.c != null)) {
      this.c.a(paramzaca, paramInt1, paramInt2, paramBoolean);
    }
    return bool;
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    if (this.a.c(paramzaca, paramBoolean)) {
      return true;
    }
    return this.b.c(paramzaca, paramBoolean);
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    this.a.a(paramzahh, paramzaah);
    b(paramzahh, paramzaah);
    this.b.a(paramzahh, paramzaah);
  }
  
  public zaie d(zaca paramzaca)
  {
    if (this.c != null)
    {
      if (this.c.a == null) {
        this.c.a = k(paramzaca);
      }
      return this.c.a;
    }
    return k(paramzaca);
  }
  
  public boolean f(zaca paramzaca)
  {
    return (this.a.f(paramzaca)) && (this.b.f(paramzaca));
  }
  
  public boolean g(zaca paramzaca)
  {
    return (this.a.g(paramzaca)) && (this.b.g(paramzaca));
  }
  
  public boolean h(zaca paramzaca)
  {
    return (this.a.h(paramzaca)) && (this.b.h(paramzaca));
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = 1;
    int m = 1;
    zaie localzaie1 = this.a.a(paramArrayOfInt, paramzaca, paramBoolean);
    k = paramArrayOfInt[0];
    m = paramArrayOfInt[1];
    paramArrayOfInt[0] = i;
    paramArrayOfInt[1] = j;
    zaie localzaie2 = this.b.a(paramArrayOfInt, paramzaca, paramBoolean);
    if (k > paramArrayOfInt[0]) {
      paramArrayOfInt[0] = k;
    }
    if (m > paramArrayOfInt[1]) {
      paramArrayOfInt[1] = m;
    }
    if ((k == 1) && (m == 1)) {
      return this;
    }
    zabk localzabk = w();
    localzabk.a = localzaie1;
    localzabk.b = localzaie2;
    return localzabk;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    int i = paramArrayOfInt[0];
    int j = 1;
    zaie localzaie1 = this.a.a(paramArrayOfInt, paramzaca);
    j = paramArrayOfInt[0];
    paramArrayOfInt[0] = i;
    zaie localzaie2 = this.b.a(paramArrayOfInt, paramzaca);
    if (j > paramArrayOfInt[0]) {
      paramArrayOfInt[0] = j;
    }
    if (j == 1) {
      return this;
    }
    zabk localzabk = w();
    localzabk.a = localzaie1;
    localzabk.b = localzaie2;
    return localzabk;
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    int i = paramArrayOfInt[0];
    int j = 1;
    zaie localzaie1 = this.a.b(paramArrayOfInt, paramzaca);
    j = paramArrayOfInt[0];
    paramArrayOfInt[0] = i;
    zaie localzaie2 = this.b.a(paramArrayOfInt, paramzaca);
    if (j > paramArrayOfInt[0]) {
      paramArrayOfInt[0] = j;
    }
    if (j == 1) {
      return this;
    }
    zabk localzabk = w();
    localzabk.a = localzaie1;
    localzabk.b = localzaie2;
    return localzabk;
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    zabu localzabu = null;
    int i = paramzaca.m;
    if (paramzaca.j)
    {
      localzabu = l();
      if (localzabu != null)
      {
        if (localzabu.a != null) {
          return localzabu.a.a(paramzaca, paramBoolean);
        }
        if (localzabu.b != null)
        {
          if (localzabu.b.B() != 0)
          {
            localzaiw1 = localzabu.b.c(paramzaca);
            if (localzaiw1 != null)
            {
              if (!localzaiw1.a()) {
                localzaiw1 = localzaiw1.b(paramzaca);
              }
              localzaiw1.a(paramzaca);
              return localzaiw1;
            }
          }
          else
          {
            localzabu = null;
          }
        }
        else {
          paramzaca.f();
        }
      }
      else if (k())
      {
        localzabu = new zabu();
        a(localzabu);
        paramzaca.f();
      }
    }
    zaiw localzaiw1 = a(this.a, paramzaca);
    zaiw localzaiw2 = a(this.b, paramzaca);
    Object localObject = null;
    if (localzaiw1.l())
    {
      if (localzaiw2.l())
      {
        if ((localzaiw1.a(0, 0) == this.a) && (localzaiw2.a(0, 0) == this.b))
        {
          a(false);
          return new zbak(this);
        }
        zabk localzabk = w();
        localzabk.a = localzaiw1.a(0, 0);
        localzabk.b = localzaiw2.a(0, 0);
        localzabk.a(false);
        return new zbak(localzabk);
      }
      localObject = new zazd(localzaiw2, new zmm(paramzaca, this, paramzaca.d, paramzaca.e, localzaiw1.a(0, 0)), paramzaca);
    }
    else if (localzaiw2.l())
    {
      localObject = new zazd(localzaiw1, new zml(paramzaca, this, paramzaca.d, paramzaca.e, localzaiw2.a(0, 0)), paramzaca);
    }
    else
    {
      localObject = zbam.a(localzaiw1, localzaiw2, paramzaca, new zmn(paramzaca, this, paramzaca.d, paramzaca.e));
    }
    if ((paramzaca.j) && (localzabu != null))
    {
      localObject = localzabu.a((zaiw)localObject, paramzaca);
      paramzaca.b(i);
    }
    return (zaiw)localObject;
  }
  
  private zaiw a(zaie paramzaie, zaca paramzaca)
  {
    if ((paramzaca.h) || (paramzaie.g() == 96)) {
      return paramzaie.a(paramzaca, false);
    }
    return new zbak(paramzaie);
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
    zabk localzabk = (zabk)paramzaie;
    return (this.a.a(localzabk.a)) && (this.b.a(localzabk.b));
  }
  
  public zaie b(zaie paramzaie)
  {
    if (a(paramzaie)) {
      return this;
    }
    zaie localzaie = this.a.b(paramzaie);
    if (localzaie != null) {
      return localzaie;
    }
    return this.b.b(paramzaie);
  }
  
  private static class zd
    extends zabk.zk
  {
    private zd()
    {
      super();
    }
    
    public byte a()
    {
      return 15;
    }
    
    public zabk w()
    {
      return new zd();
    }
    
    public String p()
    {
      return " ";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a(" ");
    }
    
    protected zaie a(zbap paramzbap1, zbap paramzbap2, zwp paramzwp, zaca paramzaca)
    {
      if ((paramzwp != null) && (paramzwp.b != paramzwp.c)) {
        return zabc.f;
      }
      int i = Math.max(paramzbap1.b(), paramzbap2.b());
      int j = Math.min(paramzbap1.f(), paramzbap2.f());
      if (i <= j)
      {
        int k = Math.max(paramzbap1.d(), paramzbap2.d());
        int m = Math.min(paramzbap1.h(), paramzbap2.h());
        if (k <= m) {
          return new zabo(g(), new zbap(paramzwp, i, k, j, m));
        }
      }
      return zabc.d;
    }
  }
  
  private static class zj
    extends zabk.zk
  {
    private zj()
    {
      super();
    }
    
    public byte a()
    {
      return 17;
    }
    
    public zabk w()
    {
      return new zj();
    }
    
    public String p()
    {
      return ":";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a(":");
    }
    
    protected zaie a(zbap paramzbap1, zbap paramzbap2, zwp paramzwp, zaca paramzaca)
    {
      return new zabo(g(), new zbap(paramzwp, Math.min(paramzbap1.b(), paramzbap2.b()), Math.min(paramzbap1.d(), paramzbap2.d()), Math.max(paramzbap1.f(), paramzbap2.f()), Math.max(paramzbap1.h(), paramzbap2.h())));
    }
  }
  
  private static abstract class zk
    extends zabk
  {
    protected abstract zaie a(zbap paramzbap1, zbap paramzbap2, zwp paramzwp, zaca paramzaca);
    
    public int g()
    {
      return 32;
    }
    
    public int a(zaca paramzaca)
    {
      return 32;
    }
    
    public int b(zaca paramzaca, boolean paramBoolean)
    {
      int i = this.a.b(paramzaca, paramBoolean) & this.b.b(paramzaca, paramBoolean);
      if (paramBoolean) {
        return i;
      }
      if ((this.c != null) && (this.c.a != null)) {
        return i & this.c.a.b(paramzaca, paramBoolean);
      }
      return i;
    }
    
    public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      int i = 0;
      if (this.a.a(paramzaca, paramInt1, paramInt2, paramBoolean)) {
        i = 1;
      }
      if (this.b.a(paramzaca, paramInt1, paramInt2, paramBoolean)) {
        i = 1;
      }
      if (i != 0)
      {
        if (this.c != null) {
          this.c.a(paramzaca, paramInt1, paramInt2, paramBoolean);
        }
        return true;
      }
      if (paramBoolean) {
        return false;
      }
      if ((this.c != null) && (this.c.a != null))
      {
        if (paramzaca.d != paramInt1)
        {
          if (paramzaca.e != paramInt2) {
            return this.c.a.b(paramzaca, paramBoolean) != 3;
          }
          return (this.c.a.b(paramzaca, paramBoolean) & 0x1) == 0;
        }
        if (paramzaca.e != paramInt2) {
          return (this.c.a.b(paramzaca, paramBoolean) & 0x2) == 0;
        }
        return false;
      }
      return true;
    }
    
    public boolean c(zaca paramzaca, boolean paramBoolean)
    {
      return true;
    }
    
    protected zaie k(zaca paramzaca)
    {
      zaie localzaie1 = this.a.d(paramzaca);
      if (localzaie1.b() == 0) {
        return localzaie1;
      }
      zaie localzaie2 = this.b.d(paramzaca);
      if (localzaie2.b() == 0) {
        return localzaie2;
      }
      if (localzaie1 == zabg.a)
      {
        if ((localzaie2 == zabg.a) || (localzaie2.b() == 9)) {
          return localzaie2;
        }
        return zabc.c;
      }
      if (localzaie2 == zabg.a)
      {
        if (localzaie1.b() == 9) {
          return localzaie1;
        }
        return zabc.c;
      }
      if ((localzaie1.b() != 9) || (localzaie2.b() != 9)) {
        return zabc.c;
      }
      zbap localzbap1 = ((zabo)localzaie1).o();
      zbap localzbap2 = ((zabo)localzaie2).o();
      zwp localzwp = localzbap1.a();
      if (localzwp == null)
      {
        localzwp = localzbap2.a();
        if (localzwp != null)
        {
          if (((localzwp.a & 0xFFFF) != paramzaca.p.f) || ((localzwp.b & 0xFFFF) != paramzaca.n)) {
            return zabc.f;
          }
          localzwp = null;
        }
      }
      else if (localzbap2.a() == null)
      {
        if (((localzwp.a & 0xFFFF) != paramzaca.p.f) || ((localzwp.b & 0xFFFF) != paramzaca.n)) {
          return zabc.f;
        }
      }
      else if ((localzwp.a != localzbap2.a().a) || (localzwp.b != localzbap2.a().b))
      {
        return zabc.f;
      }
      return a(localzbap1, localzbap2, localzwp, paramzaca);
    }
    
    public zaiw a(zaca paramzaca, boolean paramBoolean)
    {
      return d(paramzaca).a(paramzaca, paramBoolean);
    }
  }
  
  private static class zi
    extends zabk.zf
  {
    private zi()
    {
      super();
    }
    
    public byte a()
    {
      return 7;
    }
    
    public zabk w()
    {
      return new zi();
    }
    
    public String p()
    {
      return "^";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("^");
    }
    
    protected zaie a(double paramDouble1, double paramDouble2, zais paramzais)
    {
      if (paramDouble1 == 0.0D)
      {
        if (paramDouble2 < 0.0D) {
          return zabc.a;
        }
        if (paramDouble2 == 0.0D) {
          return zabc.b;
        }
      }
      return new zabb(Math.pow(paramDouble1, paramDouble2));
    }
  }
  
  private static class zc
    extends zabk.zf
  {
    private zc()
    {
      super();
    }
    
    public byte a()
    {
      return 6;
    }
    
    public zabk w()
    {
      return new zc();
    }
    
    public String p()
    {
      return "/";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("/");
    }
    
    protected zaie a(double paramDouble1, double paramDouble2, zais paramzais)
    {
      if (paramDouble2 == 0.0D) {
        return zabc.a;
      }
      return new zabb(paramzais.d(paramDouble1, paramDouble2));
    }
  }
  
  private static class zh
    extends zabk.zf
  {
    private zh()
    {
      super();
    }
    
    public byte a()
    {
      return 5;
    }
    
    public zabk w()
    {
      return new zh();
    }
    
    public String p()
    {
      return "*";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("*");
    }
    
    protected zaie a(double paramDouble1, double paramDouble2, zais paramzais)
    {
      return new zabb(paramzais.c(paramDouble1, paramDouble2));
    }
  }
  
  private static class zg
    extends zabk.zf
  {
    private zg()
    {
      super();
    }
    
    public byte a()
    {
      return 4;
    }
    
    public zabk w()
    {
      return new zg();
    }
    
    public String p()
    {
      return "-";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("-");
    }
    
    protected zaie a(double paramDouble1, double paramDouble2, zais paramzais)
    {
      if (paramDouble1 == paramDouble2) {
        return zabb.a;
      }
      double d = paramzais.b(paramDouble1, paramDouble2);
      if (d == 0.0D) {
        return zabb.a;
      }
      return new zabb(d);
    }
  }
  
  private static class za
    extends zabk.zf
  {
    private za()
    {
      super();
    }
    
    public byte a()
    {
      return 3;
    }
    
    public zabk w()
    {
      return new za();
    }
    
    public String p()
    {
      return "+";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("+");
    }
    
    protected zaie a(double paramDouble1, double paramDouble2, zais paramzais)
    {
      return new zabb(paramzais.a(paramDouble1, paramDouble2));
    }
  }
  
  private static abstract class zf
    extends zabk
  {
    protected zaie k(zaca paramzaca)
    {
      zaie localzaie1 = this.a;
      zaie localzaie2 = this.b;
      double d1 = 0.0D;
      if (localzaie1 != null)
      {
        localzaie1 = localzaie1.e(paramzaca);
        if (localzaie1.b() == 0) {
          return localzaie1;
        }
        zabb localzabb1 = localzaie1.a(paramzaca, 7);
        if (localzabb1 == null) {
          return zabc.f;
        }
        d1 = localzabb1.o();
      }
      double d2 = 0.0D;
      if (localzaie2 != null)
      {
        localzaie2 = localzaie2.e(paramzaca);
        if (localzaie2.b() == 0) {
          return localzaie2;
        }
        zabb localzabb2 = localzaie2.a(paramzaca, 7);
        if (localzabb2 == null) {
          return zabc.f;
        }
        d2 = localzabb2.o();
      }
      return a(d1, d2, paramzaca.p.L.h);
    }
    
    protected abstract zaie a(double paramDouble1, double paramDouble2, zais paramzais);
  }
  
  private static class ze
    extends zabk
  {
    public byte a()
    {
      return 16;
    }
    
    public zabk w()
    {
      return new ze();
    }
    
    public boolean k()
    {
      return false;
    }
    
    public void a(boolean paramBoolean)
    {
      if (paramBoolean)
      {
        this.a.a(true);
        this.b.a(true);
      }
    }
    
    public String p()
    {
      return ",";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a(',');
    }
    
    protected zaie k(zaca paramzaca)
    {
      return this;
    }
    
    public zaie d(zaca paramzaca)
    {
      return this;
    }
    
    public zaie e(zaca paramzaca)
    {
      return zabc.f;
    }
    
    public boolean f(zaca paramzaca)
    {
      return false;
    }
    
    public boolean g(zaca paramzaca)
    {
      if ((this.a != null) && (!this.a.g(paramzaca))) {
        return false;
      }
      return (this.b == null) || (this.b.g(paramzaca));
    }
    
    public boolean h(zaca paramzaca)
    {
      if ((this.a != null) && (!this.a.h(paramzaca))) {
        return false;
      }
      return (this.b == null) || (this.b.g(paramzaca));
    }
    
    public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
    {
      zazs localzazs = new zazs(this, paramzaca, paramBoolean);
      zaie localzaie = localzazs.a(paramArrayOfInt[0], paramArrayOfInt[1]);
      paramArrayOfInt[0] = localzazs.c();
      paramArrayOfInt[1] = localzazs.d();
      return localzaie;
    }
    
    public zaiw a(zaca paramzaca, boolean paramBoolean)
    {
      return new zazs(this, paramzaca, paramBoolean);
    }
  }
  
  private static class zb
    extends zabk
  {
    public byte a()
    {
      return 8;
    }
    
    public zabk w()
    {
      return new zb();
    }
    
    public String p()
    {
      return "&";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("&");
    }
    
    protected zaie k(zaca paramzaca)
    {
      String str = null;
      zaie localzaie = this.a;
      if (localzaie != null)
      {
        localzaie = localzaie.e(paramzaca);
        if (localzaie != null)
        {
          if (localzaie.b() == 0) {
            return localzaie;
          }
          localObject = localzaie.i(paramzaca);
          if (localObject == null) {
            return zabc.f;
          }
          str = ((zabp)localObject).o();
        }
      }
      Object localObject = null;
      localzaie = this.b;
      if (localzaie != null)
      {
        localzaie = localzaie.e(paramzaca);
        if (localzaie != null)
        {
          if (localzaie.b() == 0) {
            return localzaie;
          }
          zabp localzabp = localzaie.i(paramzaca);
          if (localzabp == null) {
            return zabc.f;
          }
          localObject = localzabp.o();
        }
      }
      if (str == null)
      {
        if (localObject == null) {
          return zabp.a;
        }
        return new zabp((String)localObject);
      }
      if (localObject == null) {
        return new zabp(str);
      }
      return new zabp(str + (String)localObject);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */