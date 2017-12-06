package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;

class zaz
  implements zagu
{
  private zjf b;
  private int c;
  private Color d;
  private zxg e;
  private Color f;
  private int g;
  private boolean h;
  boolean a;
  private Object i;
  private zaml j;
  private zaml k;
  private boolean l = false;
  private boolean m = true;
  private boolean n = false;
  
  zaz(zjf paramzjf, Object paramObject, int paramInt)
  {
    this.b = paramzjf;
    this.i = paramObject;
    this.c = paramInt;
    this.f = Color.getEmpty();
    this.d = Color.getEmpty();
    this.h = false;
    this.a = true;
    this.g = 1;
    this.e = new zxg(this);
  }
  
  zjf a()
  {
    return this.b;
  }
  
  int b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.h;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    this.a = false;
  }
  
  public Color e()
  {
    if (this.g == 0) {
      return Color.getEmpty();
    }
    return this.d;
  }
  
  public void a(Color paramColor)
  {
    this.d = paramColor;
  }
  
  zxg f()
  {
    return this.e;
  }
  
  public zaib d()
  {
    return this.e;
  }
  
  public Color g()
  {
    if (this.g == 0) {
      return Color.getEmpty();
    }
    return this.f;
  }
  
  public void b(Color paramColor)
  {
    this.f = paramColor;
  }
  
  public zaml i()
  {
    return this.j;
  }
  
  public void a(zaml paramzaml)
  {
    this.j = paramzaml;
  }
  
  public void b(zaml paramzaml)
  {
    this.k = paramzaml;
  }
  
  public int h()
  {
    return this.g;
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  boolean j()
  {
    return (this.g == 3) || (this.g == 5) || (this.g == 4);
  }
  
  boolean k()
  {
    if (j()) {
      return false;
    }
    if (this.g == 0) {
      return true;
    }
    return (this.f.getA() & 0xFF) <= 250;
  }
  
  public boolean a(zaz paramzaz)
  {
    if ((!j()) && (!paramzaz.j()))
    {
      if (h() != paramzaz.h()) {
        return false;
      }
      if (!e().equals(paramzaz.e())) {
        return false;
      }
      if (!g().equals(paramzaz.g())) {
        return false;
      }
    }
    else
    {
      if (j() != paramzaz.j()) {
        return false;
      }
      return f().a(paramzaz.f());
    }
    return true;
  }
  
  public boolean l()
  {
    return this.l;
  }
  
  public void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  void c(Color paramColor)
  {
    if (this.g == 1) {
      b(paramColor);
    } else if (!l()) {
      d(paramColor);
    }
  }
  
  private void d(Color paramColor)
  {
    if ((this.g == 2) && (i() != null) && (i().i()))
    {
      b(paramColor);
    }
    else
    {
      Object localObject;
      if (this.g == 5)
      {
        localObject = f().a().b();
        int i1 = 0;
        if ((f().b() != null) && (f().b().i()))
        {
          localObject = zkn.a(a().az(), paramColor, f().b());
          i1 = 1;
        }
        Color localColor = f().a().c();
        if ((f().c() != null) && (f().c().i()))
        {
          localColor = zkn.a(a().az(), paramColor, f().c());
          i1 = 1;
        }
        if (i1 != 0) {
          f().a(localColor, (Color)localObject, f().a().d());
        }
      }
      else if (this.g == 3)
      {
        localObject = f().d();
        zadu localzadu = ((zado)localObject).c();
        for (int i2 = 0; i2 < localzadu.getCount(); i2++)
        {
          zadt localzadt = localzadu.b(i2);
          if ((localzadt.b() != null) && (localzadt.b().i())) {
            localzadt.a(zkn.a(a().az(), paramColor, localzadt.b()));
          }
        }
      }
    }
  }
  
  void m()
  {
    if (this.g != 1) {
      return;
    }
    if (!this.m) {
      return;
    }
    Color localColor = this.b.Z().a().a("dk1");
    int i2;
    switch (this.c)
    {
    case 0: 
      if (this.b.R() <= 32)
      {
        this.f = this.b.Z().a().a("bg1");
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 40)
      {
        this.f = this.b.Z().a().a("lt1");
        this.f = Color.a(255, this.f);
      }
      else
      {
        this.f = localColor;
        this.f = Color.a(255, this.f);
      }
      break;
    case 1: 
      int i1 = 0;
      if ((this.b.N() == 44) || (this.b.N() == 45) || (this.b.N() == 48) || (this.b.N() == 49) || (this.b.N() == 47) || (this.b.N() == 46) || (this.b.N() == 35) || (this.b.N() == 36)) {
        i1 = 1;
      }
      if ((this.b.ab()) || (i1 != 0)) {
        this.g = 0;
      } else {
        d(true);
      }
      break;
    case 3: 
    case 4: 
      d(false);
      break;
    case 14: 
      if (this.b.R() == 1)
      {
        this.f = this.b.Z().a().a(localColor, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 2)
      {
        this.f = this.b.Z().a().a(localColor, 0.05D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 8)
      {
        i2 = this.b.R() - 2;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().a(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 9)
      {
        this.f = this.b.Z().a().a(localColor, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 10)
      {
        this.f = this.b.Z().a().a(localColor, 0.05D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 16)
      {
        i2 = this.b.R() - 10;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().a(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 17)
      {
        this.f = this.b.Z().a().a(localColor, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 18)
      {
        this.f = this.b.Z().a().a(localColor, 0.05D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 24)
      {
        i2 = this.b.R() - 18;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().a(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 25)
      {
        this.f = this.b.Z().a().a(localColor, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 26)
      {
        this.f = this.b.Z().a().a(localColor, 0.05D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 32)
      {
        i2 = this.b.R() - 26;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().a(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 40)
      {
        this.f = this.b.Z().a().a("lt1");
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 41)
      {
        this.f = this.b.Z().a().a(localColor, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 42)
      {
        this.f = this.b.Z().a().a("lt1");
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 48)
      {
        i2 = this.b.R() - 42;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().a(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      break;
    case 15: 
      if (this.b.R() == 1)
      {
        this.f = this.b.Z().a().a(localColor, 0.85D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 2)
      {
        this.f = this.b.Z().a().a(localColor, 0.95D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 8)
      {
        i2 = this.b.R() - 2;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().b(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 9)
      {
        this.f = this.b.Z().a().a(localColor, 0.85D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 10)
      {
        this.f = this.b.Z().a().a(localColor, 0.95D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 16)
      {
        i2 = this.b.R() - 10;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().b(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 17)
      {
        this.f = this.b.Z().a().a(localColor, 0.85D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 18)
      {
        this.f = this.b.Z().a().a(localColor, 0.95D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 24)
      {
        i2 = this.b.R() - 18;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().b(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 25)
      {
        this.f = this.b.Z().a().a(localColor, 0.85D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 26)
      {
        this.f = this.b.Z().a().a(localColor, 0.95D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 32)
      {
        i2 = this.b.R() - 26;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().b(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 33)
      {
        this.f = this.b.Z().a().a(localColor, 0.85D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 34)
      {
        this.f = this.b.Z().a().a(localColor, 0.95D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 40)
      {
        i2 = this.b.R() - 34;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().b(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 41)
      {
        this.f = this.b.Z().a().a(localColor, 0.85D);
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() == 42)
      {
        this.f = localColor;
        this.f = Color.a(255, this.f);
      }
      else if (this.b.R() <= 48)
      {
        i2 = this.b.R() - 42;
        this.f = this.b.Z().a().a("accent" + i2);
        this.f = this.b.Z().a().b(this.f, 0.25D);
        this.f = Color.a(255, this.f);
      }
      break;
    }
    this.m = false;
  }
  
  private void d(boolean paramBoolean)
  {
    if (this.b.R() <= 32)
    {
      if (paramBoolean)
      {
        this.f = this.b.Z().a().a("bg1");
        this.f = Color.a(255, this.f);
      }
    }
    else if (this.b.R() <= 34)
    {
      this.f = this.b.Z().a().a("dk1");
      this.f = this.b.Z().a().a(this.f, 0.2D);
      this.f = Color.a(255, this.f);
    }
    else if (this.b.R() <= 40)
    {
      int i1 = this.b.R() - 34;
      this.f = this.b.Z().a().a("accent" + i1);
      this.f = this.b.Z().a().a(this.f, 0.2D);
      this.f = Color.a(255, this.f);
    }
    else
    {
      this.f = this.b.Z().a().a("dk1");
      this.f = this.b.Z().a().a(this.f, 0.95D);
      this.f = Color.a(255, this.f);
    }
  }
  
  void b(zaz paramzaz)
  {
    this.b = paramzaz.b;
    this.c = paramzaz.c;
    this.d = paramzaz.d;
    this.e.b(paramzaz.e);
    this.f = paramzaz.f;
    this.g = paramzaz.g;
    this.h = paramzaz.h;
    this.a = paramzaz.a;
    this.i = paramzaz.i;
    this.j = paramzaz.j;
    this.k = paramzaz.k;
    this.m = paramzaz.m;
  }
  
  void a(zp paramzp)
    throws Exception
  {
    a(new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f()));
  }
  
  void a(zq paramzq)
    throws Exception
  {
    ze localze = new ze();
    localze.b(paramzq);
    a(localze, 1.0F);
  }
  
  void a(ze paramze)
    throws Exception
  {
    a(paramze, 1.0F);
  }
  
  void a(ze paramze, float paramFloat)
    throws Exception
  {
    a(paramze, paramFloat, paramze);
  }
  
  void a(ze paramze1, float paramFloat, ze paramze2)
    throws Exception
  {
    if ((h() == 0) || (paramze1 == null) || (paramze2 == null)) {
      return;
    }
    zc localzc = b(paramze2, paramFloat);
    zr localzr = this.b.ap();
    localzr.a(localzc, paramze1);
    a(localzc);
  }
  
  zc b(ze paramze)
    throws Exception
  {
    return b(paramze, 1.0F);
  }
  
  zc b(ze paramze, float paramFloat)
    throws Exception
  {
    m();
    boolean bool = n();
    Object localObject = null;
    if (j())
    {
      localObject = this.e.a(paramze, bool, paramFloat);
    }
    else
    {
      Color localColor = this.f;
      if (bool) {
        localColor = this.d;
      }
      localObject = new zu(Color.fromArgb(localColor.getA() & 0xFF, (int)((localColor.getR() & 0xFF) * paramFloat), (int)((localColor.getG() & 0xFF) * paramFloat), (int)((localColor.getB() & 0xFF) * paramFloat)));
    }
    return (zc)localObject;
  }
  
  private void a(zc paramzc)
  {
    if (j()) {
      this.e.a(paramzc);
    } else {
      paramzc.h();
    }
  }
  
  boolean n()
  {
    boolean bool = false;
    zkf localzkf;
    if ((this.c == 7) && (!this.a))
    {
      localzkf = (zkf)this.i;
      if ((b(localzkf.g().a().m())) && (c()) && (localzkf.G())) {
        bool = true;
      }
    }
    else if ((this.c == 7) && (this.a))
    {
      localzkf = (zkf)this.i;
      if ((b(localzkf.g().a().m())) && (localzkf.g().a().A().c()) && (localzkf.G())) {
        bool = true;
      }
    }
    return bool;
  }
  
  private boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
      return true;
    }
    return false;
  }
  
  protected void finalize()
    throws Exception
  {
    c(false);
  }
  
  public void dispose()
  {
    c(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void c(boolean paramBoolean)
  {
    if (!this.n)
    {
      if ((paramBoolean) && (this.e != null)) {
        this.e.dispose();
      }
      this.n = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */