package com.aspose.cells;

import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.zg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zbfd
  implements zaje
{
  private zjf c;
  private zqy d;
  private zuc e = null;
  private zuc f = null;
  private zanr g;
  private zaz h;
  private zaos i;
  private String j = null;
  private boolean k;
  private zkh l;
  private boolean m;
  private zbxi n;
  private int o;
  private boolean p = false;
  private boolean q = false;
  private boolean r = false;
  private boolean s = true;
  private zanr t;
  private zanr u;
  private zanr v;
  private zjy w;
  private zjy x;
  private boolean y = false;
  private boolean z = true;
  private int A;
  private int B;
  private int C = 0;
  private int D = 50;
  private int E = 75;
  private boolean F = false;
  private zanr G;
  private int H = 100;
  private boolean I = false;
  private int J = 0;
  private int K;
  private boolean L = false;
  private int M;
  private int N;
  private zbff O;
  private zkf P;
  private zbfi Q;
  private zbda R = new zbda();
  private int S;
  private int T;
  zs a = new zs(0, 0);
  private boolean U = false;
  private float V = 0.0F;
  private boolean W = true;
  private int X = 1;
  private double Y = 0.0D;
  private int[] Z;
  ArrayList b = null;
  private boolean aa = false;
  
  zkf u()
  {
    return this.P;
  }
  
  public zahn b()
  {
    return this.P;
  }
  
  zbfd(zjf paramzjf, zbff paramzbff, int paramInt)
  {
    this.c = paramzjf;
    this.O = paramzbff;
    c(paramInt);
    this.d = new zqy(paramzjf, this, 12);
    this.g = new zanr(paramzjf, 8);
    this.h = new zaz(paramzjf, this, 6);
    this.i = new zaos(paramzjf, this);
    this.G = new zanr(paramzjf, 20);
    this.n = new zbxi(paramzjf, this);
    this.l = new zkh(paramzjf, this);
    this.A = 150;
    this.t = new zanr(paramzjf, 21);
    this.u = new zanr(paramzjf, 22);
    this.v = new zanr(paramzjf, 23);
    this.w = new zjy(paramzjf, this, 14, 16);
    this.x = new zjy(paramzjf, this, 15, 17);
    this.x.c().b(Color.getBlack());
    aH();
  }
  
  private void aH()
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
      this.g.a(0);
      break;
    case 61: 
      b(true);
      break;
    case 46: 
    case 49: 
      this.P = new zkf(this.c);
      this.P.a(this.l);
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
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      this.g.g().b(3.0D);
      this.g.b().c(2);
      this.g.b().d(1);
      break;
    }
  }
  
  public boolean equals(Object obj)
  {
    if (obj == null) {
      return false;
    }
    if ((obj instanceof zbfd))
    {
      zbfd localzbfd = (zbfd)obj;
      if (this != obj) {
        return false;
      }
      if (this.O != localzbfd.O) {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    return ak() + 1 + this.O.hashCode();
  }
  
  zjf v()
  {
    return this.c;
  }
  
  zqy w()
  {
    return this.d;
  }
  
  public zahx c()
  {
    return this.d;
  }
  
  zuc x()
  {
    if (this.e == null) {
      this.e = new zuc(this.c, this);
    }
    return this.e;
  }
  
  public zaia d()
  {
    if (this.e == null) {
      this.e = new zuc(this.c, this);
    }
    return this.e;
  }
  
  zuc y()
  {
    if (this.f == null) {
      this.f = new zuc(this.c, this);
    }
    this.f.a(false);
    return this.f;
  }
  
  public zaia e()
  {
    if (this.f == null) {
      this.f = new zuc(this.c, this);
    }
    this.f.a(false);
    return this.f;
  }
  
  zanr z()
  {
    return this.g;
  }
  
  public zaip f()
  {
    return this.g;
  }
  
  zaz A()
  {
    return this.h;
  }
  
  public zagu g()
  {
    return this.h;
  }
  
  zaos B()
  {
    return this.i;
  }
  
  public zair h()
  {
    return this.i;
  }
  
  public String i()
  {
    if (this.j == null)
    {
      String str = zkn.b(this.c.az().getWorksheet().getWorkbook().getSettings());
      return str + (al() + 1);
    }
    if (this.j.length() > 255) {
      return this.j.substring(0, 255);
    }
    return this.j;
  }
  
  public void a(String paramString)
  {
    this.j = paramString;
  }
  
  String C()
  {
    return i();
  }
  
  public zaiz t()
  {
    return this.R;
  }
  
  public zbfi D()
  {
    return this.Q;
  }
  
  public void a(zbfi paramzbfi)
  {
    this.Q = paramzbfi;
  }
  
  boolean E()
  {
    return this.R.getCount() > 0;
  }
  
  public boolean j()
  {
    return this.k;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  zkh F()
  {
    return this.l;
  }
  
  public zaho k()
  {
    return this.l;
  }
  
  public boolean G()
  {
    return this.m;
  }
  
  public void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  zbxi H()
  {
    return this.n;
  }
  
  public zaju l()
  {
    return this.n;
  }
  
  public int m()
  {
    return this.o;
  }
  
  public void c(int paramInt)
  {
    this.o = paramInt;
  }
  
  public int I()
  {
    return this.N;
  }
  
  public void d(int paramInt)
  {
    this.N = paramInt;
  }
  
  public boolean J()
  {
    return this.y;
  }
  
  public void c(boolean paramBoolean)
  {
    this.y = paramBoolean;
    this.z = false;
  }
  
  boolean K()
  {
    return this.z;
  }
  
  public int L()
  {
    return this.A;
  }
  
  public void e(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 500)) {
      this.A = paramInt;
    }
  }
  
  public int M()
  {
    return this.B;
  }
  
  public void f(int paramInt)
  {
    if ((paramInt >= -100) && (paramInt <= 100)) {
      this.B = paramInt;
    }
  }
  
  public boolean N()
  {
    return this.p;
  }
  
  public void d(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public boolean O()
  {
    return this.q;
  }
  
  public void e(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public boolean P()
  {
    return this.r;
  }
  
  public void f(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  zanr Q()
  {
    return this.u;
  }
  
  public zaip n()
  {
    return this.u;
  }
  
  zanr R()
  {
    return this.v;
  }
  
  public zaip o()
  {
    return this.v;
  }
  
  public boolean S()
  {
    return this.s;
  }
  
  public void g(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  zanr T()
  {
    return this.t;
  }
  
  public zaip p()
  {
    return this.t;
  }
  
  zjy U()
  {
    return this.w;
  }
  
  public zahm q()
  {
    return this.w;
  }
  
  zjy V()
  {
    return this.x;
  }
  
  public zahm r()
  {
    return this.x;
  }
  
  public int W()
  {
    return this.C;
  }
  
  public void g(int paramInt)
  {
    this.C = (paramInt % 360);
  }
  
  public int X()
  {
    return this.D;
  }
  
  public void h(int paramInt)
  {
    if (paramInt < 10) {
      this.D = 10;
    } else if (paramInt > 90) {
      this.D = 90;
    } else {
      this.D = paramInt;
    }
  }
  
  public int Y()
  {
    return this.E;
  }
  
  public void i(int paramInt)
  {
    if ((paramInt >= 5) && (paramInt <= 200)) {
      this.E = paramInt;
    }
  }
  
  public boolean Z()
  {
    return this.F;
  }
  
  public void h(boolean paramBoolean)
  {
    this.F = paramBoolean;
  }
  
  zanr aa()
  {
    return this.G;
  }
  
  public zaip s()
  {
    return this.G;
  }
  
  public int ab()
  {
    return this.H;
  }
  
  public void j(int paramInt)
  {
    if (paramInt > 300) {
      this.H = 300;
    } else {
      this.H = paramInt;
    }
  }
  
  public boolean ac()
  {
    return this.I;
  }
  
  public void i(boolean paramBoolean)
  {
    this.I = paramBoolean;
  }
  
  public int ad()
  {
    return this.J;
  }
  
  public void k(int paramInt)
  {
    this.J = paramInt;
  }
  
  public int ae()
  {
    return this.K;
  }
  
  public void l(int paramInt)
  {
    this.K = paramInt;
  }
  
  public void k(boolean paramBoolean)
  {
    this.L = paramBoolean;
  }
  
  public boolean af()
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
    {
      zkf localzkf = (zkf)localIterator.next();
      if (localzkf.r() != 3) {
        return false;
      }
    }
    return true;
  }
  
  public boolean ag()
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
    {
      zkf localzkf = (zkf)localIterator.next();
      if (localzkf.x() != 3) {
        return false;
      }
    }
    return true;
  }
  
  int ah()
  {
    if (j()) {
      return 2;
    }
    return 1;
  }
  
  void n(int paramInt)
  {
    if (paramInt == 2) {
      a(true);
    } else {
      a(false);
    }
  }
  
  int ai()
  {
    return this.M;
  }
  
  void o(int paramInt)
  {
    this.M = paramInt;
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
      if (this.M == i3) {
        return true;
      }
    }
    return false;
  }
  
  zbff aj()
  {
    return this.O;
  }
  
  int ak()
  {
    return this.O.i().indexOf(this);
  }
  
  public int al()
  {
    return this.S;
  }
  
  public void a(int paramInt)
  {
    this.S = paramInt;
  }
  
  boolean am()
  {
    return (m() == 37) || (m() == 38) || (m() == 39) || (m() == 40) || (m() == 41) || (m() == 42) || (m() == 57) || (m() == 58) || (m() == 60) || (m() == 61) || (m() == 62) || (m() == 63) || (m() == 64);
  }
  
  boolean an()
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
      return z().h();
    }
    return false;
  }
  
  boolean ao()
  {
    return m() == 14;
  }
  
  boolean ap()
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
  
  boolean aq()
  {
    switch (m())
    {
    case 38: 
    case 41: 
      return true;
    }
    return false;
  }
  
  boolean ar()
  {
    switch (m())
    {
    case 1: 
    case 4: 
      return true;
    }
    return false;
  }
  
  boolean as()
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
  
  boolean at()
  {
    switch (m())
    {
    case 2: 
    case 5: 
      return true;
    }
    return false;
  }
  
  boolean au()
  {
    switch (m())
    {
    case 2: 
    case 8: 
    case 11: 
    case 16: 
    case 20: 
    case 23: 
    case 26: 
    case 30: 
    case 33: 
    case 52: 
    case 55: 
      return true;
    }
    return false;
  }
  
  boolean av()
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
  
  boolean aw()
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
  
  boolean ax()
  {
    switch (m())
    {
    case 12: 
    case 13: 
      return true;
    }
    return false;
  }
  
  boolean ay()
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
  
  boolean az()
  {
    Iterator localIterator = F().iterator();
    while (localIterator.hasNext())
    {
      zkf localzkf = (zkf)localIterator.next();
      if (localzkf.o().z()) {
        return true;
      }
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
  
  public void j(boolean paramBoolean)
  {
    this.U = paramBoolean;
  }
  
  public float aA()
  {
    if (this.W) {
      switch (this.o)
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
  
  public int aB()
  {
    return this.X;
  }
  
  public void m(int paramInt)
  {
    this.X = paramInt;
  }
  
  public double aC()
  {
    return this.Y;
  }
  
  public void a(double paramDouble)
  {
    this.Y = paramDouble;
  }
  
  public int[] aD()
  {
    return this.Z;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.Z = paramArrayOfInt;
  }
  
  boolean aE()
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
    {
      zkf localzkf = (zkf)localIterator.next();
      if (!localzkf.o().C()) {
        return false;
      }
    }
    return true;
  }
  
  int aF()
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
      return 2;
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return 3;
    case 59: 
      return 4;
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
      return 6;
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      return 7;
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return 8;
    case 57: 
    case 58: 
      return 9;
    case 12: 
    case 13: 
      return 10;
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
      return 11;
    }
    return 100;
  }
  
  boolean aG()
  {
    for (int i1 = 0; i1 < F().getCount(); i1++)
    {
      zkf localzkf = F().b(i1);
      if (localzkf.k().h()) {
        return true;
      }
    }
    return false;
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
        if (this.d != null) {
          this.d.dispose();
        }
        if (this.h != null) {
          this.h.dispose();
        }
        if (this.w != null) {
          this.w.dispose();
        }
        if (this.x != null) {
          this.x.dispose();
        }
        int i1;
        Object localObject;
        if (this.l != null) {
          for (i1 = 0; i1 < this.l.getCount(); i1++)
          {
            localObject = this.l.b(i1);
            if (localObject != null) {
              ((zkf)localObject).dispose();
            }
          }
        }
        if (this.P != null) {
          this.P.dispose();
        }
        if (this.n != null) {
          for (i1 = 0; i1 < this.n.getCount(); i1++)
          {
            localObject = this.n.c(i1);
            if (localObject != null) {
              ((zbxg)localObject).dispose();
            }
          }
        }
      }
      this.aa = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */