package com.aspose.cells;

import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.zg;
import java.util.ArrayList;
import java.util.Iterator;

class zbfc
  implements zaje
{
  private zje b;
  private zqx c;
  private zub d = null;
  private zub e = null;
  private zanq f;
  private zay g;
  private zaor h;
  private String i = null;
  private boolean j;
  private zkg k;
  private boolean l;
  private zbxh m;
  private int n;
  private boolean o = false;
  private boolean p = false;
  private boolean q = false;
  private boolean r = true;
  private zanq s;
  private zanq t;
  private zanq u;
  private zjx v;
  private zjx w;
  private boolean x = false;
  private boolean y = true;
  private int z;
  private int A;
  private int B = 0;
  private int C = 50;
  private int D = 75;
  private boolean E = false;
  private zanq F;
  private int G = 100;
  private boolean H = false;
  private int I = 0;
  private int J;
  private boolean K;
  private int L;
  private int M;
  private zbfe N;
  private zke O;
  private zbfi P;
  private zbda Q = new zbda();
  private int R;
  private boolean S = false;
  private int T;
  private boolean U = false;
  zs a = new zs(0, 0);
  private float V = 0.0F;
  private boolean W = true;
  private int X = 1;
  private double Y = 0.0D;
  private int[] Z;
  private boolean aa = false;
  
  zke u()
  {
    return this.O;
  }
  
  public zahn b()
  {
    return this.O;
  }
  
  public zbfc(zje paramzje, zbfe paramzbfe, int paramInt)
  {
    this.b = paramzje;
    c(paramInt);
    this.N = paramzbfe;
    this.c = new zqx(paramzje, this, 12);
    this.f = new zanq(paramzje);
    this.g = new zay(paramzje);
    this.h = new zaor(paramzje, this);
    this.F = new zanq(paramzje);
    this.m = new zbxh(paramzje, this);
    this.k = new zkg(paramzje, this);
    this.z = 150;
    this.s = new zanq(paramzje);
    this.t = new zanq(paramzje);
    this.u = new zanq(paramzje);
    this.v = new zjx(paramzje, this, 14);
    this.w = new zjx(paramzje, this, 15);
    this.w.d().b(Color.getBlack());
    this.K = false;
    aE();
  }
  
  private void aE()
  {
    switch (m())
    {
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 15: 
    case 16: 
    case 19: 
    case 20: 
      f(100);
      break;
    case 60: 
      this.f.a(0);
      break;
    case 61: 
      b(true);
      break;
    case 46: 
    case 49: 
      this.O = new zke(this.b);
      this.O.a(this.k);
      h(true);
      break;
    case 37: 
    case 38: 
    case 39: 
    case 57: 
    case 64: 
      B().b(1);
      break;
    case 62: 
      B().b(1);
      b(true);
      break;
    }
  }
  
  public boolean equals(Object obj)
  {
    if (obj == null) {
      return false;
    }
    if ((obj instanceof zbfc))
    {
      zbfc localzbfc = (zbfc)obj;
      if (this != obj) {
        return false;
      }
      if (this.N != localzbfc.N) {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    return ai() + 1 + this.N.hashCode();
  }
  
  zje v()
  {
    return this.b;
  }
  
  void a(zje paramzje)
  {
    this.b = paramzje;
  }
  
  zqx w()
  {
    return this.c;
  }
  
  public zahx c()
  {
    return this.c;
  }
  
  zub x()
  {
    if (this.d == null) {
      this.d = new zub(this.b, this);
    }
    return this.d;
  }
  
  public zaia d()
  {
    if (this.d == null) {
      this.d = new zub(this.b, this);
    }
    return this.d;
  }
  
  zub y()
  {
    if (this.e == null) {
      this.e = new zub(this.b, this);
    }
    this.e.a(false);
    return this.e;
  }
  
  public zaia e()
  {
    if (this.e == null) {
      this.e = new zub(this.b, this);
    }
    this.e.a(false);
    return this.e;
  }
  
  zanq z()
  {
    return this.f;
  }
  
  public zaip f()
  {
    return this.f;
  }
  
  zay A()
  {
    return this.g;
  }
  
  public zagu g()
  {
    return this.g;
  }
  
  zaor B()
  {
    return this.h;
  }
  
  public zair h()
  {
    return this.h;
  }
  
  public String i()
  {
    if (this.i == null)
    {
      String str = zkn.b(this.b.au().getWorksheet().getWorkbook().getSettings());
      return str + (aj() + 1);
    }
    if (this.i.length() > 255) {
      return this.i.substring(0, 255);
    }
    return this.i;
  }
  
  public void a(String paramString)
  {
    this.i = paramString;
  }
  
  public zaiz t()
  {
    return this.Q;
  }
  
  public void a(zbfi paramzbfi)
  {
    this.P = paramzbfi;
  }
  
  public String C()
  {
    if (this.i == null) {
      return "S" + (ai() + 1);
    }
    return this.i;
  }
  
  public boolean j()
  {
    return this.j;
  }
  
  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  zkg D()
  {
    return this.k;
  }
  
  public zaho k()
  {
    return this.k;
  }
  
  public boolean E()
  {
    return this.l;
  }
  
  public void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  zbxh F()
  {
    return this.m;
  }
  
  public zaju l()
  {
    return this.m;
  }
  
  public int m()
  {
    return this.n;
  }
  
  public void c(int paramInt)
  {
    this.n = paramInt;
  }
  
  public int G()
  {
    return this.M;
  }
  
  public void d(int paramInt)
  {
    this.M = paramInt;
  }
  
  public boolean H()
  {
    return this.x;
  }
  
  public void c(boolean paramBoolean)
  {
    this.x = paramBoolean;
    this.y = false;
  }
  
  boolean I()
  {
    return this.y;
  }
  
  public int J()
  {
    return this.z;
  }
  
  public void e(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 500)) {
      this.z = paramInt;
    }
  }
  
  public int K()
  {
    return this.A;
  }
  
  public void f(int paramInt)
  {
    if ((paramInt >= -100) && (paramInt <= 100)) {
      this.A = paramInt;
    }
  }
  
  public boolean L()
  {
    return this.o;
  }
  
  public void d(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean M()
  {
    return this.p;
  }
  
  public void e(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public boolean N()
  {
    return this.q;
  }
  
  public void f(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  zanq O()
  {
    return this.t;
  }
  
  public zaip n()
  {
    return this.t;
  }
  
  zanq P()
  {
    return this.u;
  }
  
  public zaip o()
  {
    return this.u;
  }
  
  public boolean Q()
  {
    return this.r;
  }
  
  public void g(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  zanq R()
  {
    return this.s;
  }
  
  public zaip p()
  {
    return this.s;
  }
  
  zjx S()
  {
    return this.v;
  }
  
  public zahm q()
  {
    return this.v;
  }
  
  zjx T()
  {
    return this.w;
  }
  
  public zahm r()
  {
    return this.w;
  }
  
  public int U()
  {
    return this.B;
  }
  
  public void g(int paramInt)
  {
    this.B = (paramInt % 360);
  }
  
  public int V()
  {
    return this.C;
  }
  
  public void h(int paramInt)
  {
    if (paramInt < 10) {
      this.C = 10;
    } else if (paramInt > 90) {
      this.C = 90;
    } else {
      this.C = paramInt;
    }
  }
  
  public int W()
  {
    return this.D;
  }
  
  public void i(int paramInt)
  {
    if ((paramInt >= 5) && (paramInt <= 200)) {
      this.D = paramInt;
    }
  }
  
  public boolean X()
  {
    return this.E;
  }
  
  public void h(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }
  
  zanq Y()
  {
    return this.F;
  }
  
  public zaip s()
  {
    return this.F;
  }
  
  public int Z()
  {
    return this.G;
  }
  
  public void j(int paramInt)
  {
    if (paramInt > 300) {
      this.G = 300;
    } else {
      this.G = paramInt;
    }
  }
  
  public boolean aa()
  {
    return this.H;
  }
  
  public void i(boolean paramBoolean)
  {
    this.H = paramBoolean;
  }
  
  public int ab()
  {
    return this.I;
  }
  
  public void k(int paramInt)
  {
    this.I = paramInt;
  }
  
  public int ac()
  {
    return this.J;
  }
  
  public void l(int paramInt)
  {
    this.J = paramInt;
  }
  
  public void k(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  public boolean ad()
  {
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      zke localzke = (zke)localIterator.next();
      if (localzke.r() != 3) {
        return false;
      }
    }
    return true;
  }
  
  public boolean ae()
  {
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      zke localzke = (zke)localIterator.next();
      if (localzke.x() != 3) {
        return false;
      }
    }
    return true;
  }
  
  int af()
  {
    if (j()) {
      return 2;
    }
    return 1;
  }
  
  int ag()
  {
    return this.L;
  }
  
  void n(int paramInt)
  {
    this.L = paramInt;
  }
  
  boolean b(int[] paramArrayOfInt)
  {
    for (int i3 : paramArrayOfInt) {
      if (m() == i3) {
        return true;
      }
    }
    return false;
  }
  
  boolean c(int[] paramArrayOfInt)
  {
    for (int i3 : paramArrayOfInt) {
      if (this.L == i3) {
        return true;
      }
    }
    return false;
  }
  
  zbfe ah()
  {
    return this.N;
  }
  
  void a(zbfe paramzbfe)
  {
    this.N = paramzbfe;
  }
  
  int ai()
  {
    return this.N.i().indexOf(this);
  }
  
  public int aj()
  {
    return this.R;
  }
  
  public void a(int paramInt)
  {
    this.R = paramInt;
  }
  
  boolean ak()
  {
    switch (m())
    {
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 57: 
    case 58: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
  
  boolean al()
  {
    switch (m())
    {
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 57: 
    case 58: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return z().e();
    }
    return false;
  }
  
  public int a()
  {
    return this.T;
  }
  
  public void b(int paramInt)
  {
    this.T = paramInt;
  }
  
  boolean am()
  {
    return m() == 14;
  }
  
  boolean an()
  {
    switch (m())
    {
    case 1: 
    case 4: 
    case 7: 
    case 10: 
    case 15: 
    case 19: 
    case 22: 
    case 25: 
    case 29: 
    case 32: 
    case 38: 
    case 41: 
    case 51: 
    case 54: 
      return true;
    }
    return false;
  }
  
  boolean ao()
  {
    switch (m())
    {
    case 1: 
    case 4: 
      return true;
    }
    return false;
  }
  
  boolean ap()
  {
    switch (m())
    {
    case 38: 
    case 41: 
      return true;
    }
    return false;
  }
  
  boolean aq()
  {
    switch (m())
    {
    case 2: 
    case 5: 
    case 8: 
    case 11: 
    case 16: 
    case 20: 
    case 23: 
    case 26: 
    case 30: 
    case 33: 
    case 39: 
    case 42: 
    case 52: 
    case 55: 
      return true;
    }
    return false;
  }
  
  boolean ar()
  {
    switch (m())
    {
    case 2: 
    case 5: 
      return true;
    }
    return false;
  }
  
  boolean as()
  {
    switch (m())
    {
    case 35: 
    case 36: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return true;
    }
    return false;
  }
  
  boolean at()
  {
    switch (m())
    {
    case 45: 
    case 48: 
      return true;
    }
    return false;
  }
  
  boolean au()
  {
    switch (m())
    {
    case 57: 
    case 58: 
    case 59: 
      return true;
    }
    return false;
  }
  
  boolean av()
  {
    switch (m())
    {
    case 12: 
    case 13: 
      return true;
    }
    return false;
  }
  
  boolean aw()
  {
    switch (m())
    {
    case 12: 
    case 13: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
  
  public boolean ax()
  {
    return this.U;
  }
  
  public void j(boolean paramBoolean)
  {
    this.U = paramBoolean;
  }
  
  public float ay()
  {
    if (this.W) {
      switch (this.n)
      {
      case 36: 
      case 47: 
      case 48: 
        return 25.0F;
      }
    }
    return this.V;
  }
  
  public void a(float paramFloat)
  {
    this.V = paramFloat;
    this.W = false;
  }
  
  public int az()
  {
    return this.X;
  }
  
  public void m(int paramInt)
  {
    this.X = paramInt;
  }
  
  public double aA()
  {
    return this.Y;
  }
  
  public void a(double paramDouble)
  {
    this.Y = paramDouble;
  }
  
  public int[] aB()
  {
    return this.Z;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.Z = paramArrayOfInt;
  }
  
  boolean aC()
  {
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      zke localzke = (zke)localIterator.next();
      if (!localzke.o().x()) {
        return false;
      }
    }
    return true;
  }
  
  int aD()
  {
    switch (m())
    {
    case 35: 
    case 36: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return 1;
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return 2;
    case 59: 
      return 3;
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return 4;
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
      return 5;
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      return 6;
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return 7;
    case 57: 
    case 58: 
      return 8;
    case 12: 
    case 13: 
      return 9;
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
    case 65: 
    case 66: 
    case 67: 
    case 68: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return 10;
    }
    return 100;
  }
  
  protected void finalize()
    throws Exception
  {
    l(false);
  }
  
  public void dispose()
  {
    l(true);
    zg.a(this);
  }
  
  protected void l(boolean paramBoolean)
  {
    if (!this.aa)
    {
      if (paramBoolean)
      {
        if (this.h != null) {
          this.h.dispose();
        }
        if (this.g != null) {
          this.g.dispose();
        }
        if (this.c != null) {
          this.c.dispose();
        }
        if (this.v != null) {
          this.v.dispose();
        }
        if (this.w != null) {
          this.w.dispose();
        }
        int i1;
        Object localObject;
        if (this.k != null) {
          for (i1 = 0; i1 < this.k.getCount(); i1++)
          {
            localObject = this.k.b(i1);
            if (localObject != null) {
              ((zke)localObject).dispose();
            }
          }
        }
        if (this.O != null) {
          this.O.dispose();
        }
        if (this.m != null) {
          for (i1 = 0; i1 < this.m.getCount(); i1++)
          {
            localObject = this.m.c(i1);
            if (localObject != null) {
              ((zbxf)localObject).dispose();
            }
          }
        }
      }
      this.aa = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */