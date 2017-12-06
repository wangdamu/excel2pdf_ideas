package com.aspose.cells;

import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;

class zbt
  implements zj, zagv
{
  private zjf y;
  private int z;
  private boolean A;
  private zanr B;
  private zaz C;
  private int D;
  private boolean E = true;
  private int F;
  private double G;
  private int H;
  private boolean I;
  private boolean J;
  private boolean K;
  private zanr L;
  private zanr M;
  private int N;
  private double O;
  private int P;
  private double Q;
  private int R;
  private double S;
  private int T;
  private double U;
  private int V;
  private zbwv W;
  private int X;
  private boolean Y;
  private int Z;
  private zbwy aa;
  private boolean ab;
  private boolean ac;
  private boolean ad;
  private boolean ae;
  private zsq af;
  ArrayList a = new ArrayList();
  double b;
  double c;
  double d;
  double e;
  private int ag;
  private int ah;
  float f = 0.0F;
  float g = 0.0F;
  float h = 0.0F;
  float i = 0.0F;
  float j = 0.0F;
  float k = 0.0F;
  ArrayList l;
  int m = 0;
  boolean n = true;
  boolean o = false;
  boolean p = false;
  boolean q = false;
  boolean r = false;
  boolean s = false;
  boolean t = false;
  boolean u = false;
  zs v = zs.a();
  zbt w = null;
  boolean x = false;
  private int ai;
  private int aj = 3;
  private boolean ak = false;
  private double al = 10.0D;
  private String am = "";
  private com.aspose.cells.b.a.b.zo an = com.aspose.cells.b.a.b.zo.a();
  private com.aspose.cells.b.a.b.zo ao = com.aspose.cells.b.a.b.zo.a();
  private boolean ap = false;
  private boolean aq = false;
  
  int a()
  {
    return this.ai;
  }
  
  void a(int paramInt)
  {
    this.ai = paramInt;
  }
  
  int b()
  {
    return this.aj;
  }
  
  void b(int paramInt)
  {
    this.aj = paramInt;
  }
  
  boolean c()
  {
    return (g() == 0) || (g() == 2);
  }
  
  boolean d()
  {
    return (g() == 1) || (g() == 3);
  }
  
  zbt(zjf paramzjf, int paramInt)
  {
    this.y = paramzjf;
    this.z = paramInt;
    this.A = true;
    this.B = new zanr(paramzjf, 4);
    this.C = new zaz(paramzjf, this, 2);
    this.D = 1;
    this.F = 1;
    this.H = 0;
    this.L = new zanr(paramzjf, 2);
    this.M = new zanr(paramzjf, 3);
    this.M.a(0);
    if (paramInt == 4) {
      a(true);
    }
    if (paramInt == 0) {
      this.L.a(0);
    } else if (paramInt == 2) {
      this.L.a(0);
    } else if (paramInt != 1) {
      if (paramInt == 3) {
        this.L.a(0);
      } else if (paramInt == 4) {
        this.L.a(0);
      }
    }
    this.aa = new zbwy(paramzjf, this, 9, 11);
    this.I = false;
    this.J = false;
    this.K = true;
    this.N = 3;
    this.O = 0.0D;
    this.P = 1;
    this.Q = 0.0D;
    this.R = 2;
    this.S = 0.0D;
    this.T = 1;
    this.U = 0.0D;
    this.V = 2;
    this.W = new zbwv(this);
    this.X = 1;
    this.Y = true;
    this.Z = 1;
    this.ab = true;
    this.ac = true;
    this.ad = true;
    this.ae = true;
    this.l = new ArrayList();
    this.ag = 4;
    this.ah = 3;
    this.af = new zsq(paramzjf, this, 13);
  }
  
  zjf e()
  {
    return this.y;
  }
  
  int g()
  {
    return this.z;
  }
  
  public boolean f()
  {
    return this.A;
  }
  
  public void a(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  zanr m()
  {
    return this.B;
  }
  
  public zaip h()
  {
    return this.B;
  }
  
  public zagu i()
  {
    return this.C;
  }
  
  zaz s()
  {
    return this.C;
  }
  
  public int j()
  {
    return this.D;
  }
  
  public void c(int paramInt)
  {
    this.D = paramInt;
    e(false);
  }
  
  public int k()
  {
    return this.F;
  }
  
  public void d(int paramInt)
  {
    this.F = paramInt;
  }
  
  public double l()
  {
    return this.G;
  }
  
  public void a(double paramDouble)
  {
    this.G = paramDouble;
    this.H = 2;
  }
  
  public int u()
  {
    return this.H;
  }
  
  public void e(int paramInt)
  {
    this.H = paramInt;
    if (paramInt == 1) {
      this.o = true;
    }
  }
  
  public boolean n()
  {
    return this.I;
  }
  
  public void b(boolean paramBoolean)
  {
    this.I = paramBoolean;
  }
  
  public double o()
  {
    return this.al;
  }
  
  public void b(double paramDouble)
  {
    if ((this.al < 2.0D) || (this.al > 1000.0D)) {
      throw new IllegalArgumentException("Logarithmic Scale Base must between 2 to 1000");
    }
    int i1 = zbxz.g(paramDouble);
    if (i1 > 1)
    {
      double d1 = com.aspose.cells.b.a.zr.b(paramDouble, 2);
      if (i1 <= 2) {
        this.al = d1;
      } else {
        this.al = ze.g(com.aspose.cells.b.a.zo.b(d1).substring(0, 0 + (com.aspose.cells.b.a.zo.b(d1).length() - 1)));
      }
    }
    else
    {
      this.al = paramDouble;
    }
  }
  
  double g(double paramDouble)
  {
    double d1 = com.aspose.cells.b.a.zr.a(paramDouble, o());
    return d1;
  }
  
  double h(double paramDouble)
  {
    return Math.pow(o(), paramDouble);
  }
  
  public boolean p()
  {
    return this.J;
  }
  
  public void c(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public boolean q()
  {
    return this.K;
  }
  
  public void d(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  public boolean r()
  {
    return this.E;
  }
  
  public void e(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }
  
  zanr w()
  {
    return this.L;
  }
  
  public zaip t()
  {
    return this.L;
  }
  
  zanr A()
  {
    return this.M;
  }
  
  public zaip v()
  {
    return this.M;
  }
  
  public int E()
  {
    return this.N;
  }
  
  public void f(int paramInt)
  {
    this.N = paramInt;
  }
  
  public double x()
  {
    return this.O;
  }
  
  public void c(double paramDouble)
  {
    if (paramDouble > 0.0D)
    {
      this.O = paramDouble;
      this.ad = false;
    }
  }
  
  public int y()
  {
    return this.P;
  }
  
  public void g(int paramInt)
  {
    this.P = paramInt;
  }
  
  public double z()
  {
    return this.Q;
  }
  
  public void d(double paramDouble)
  {
    this.Q = paramDouble;
    this.ac = false;
  }
  
  public int F()
  {
    return this.R;
  }
  
  public void h(int paramInt)
  {
    this.R = paramInt;
  }
  
  public double B()
  {
    return this.S;
  }
  
  public void e(double paramDouble)
  {
    this.S = paramDouble;
    j(false);
  }
  
  public int C()
  {
    return this.T;
  }
  
  public void i(int paramInt)
  {
    this.T = paramInt;
  }
  
  public double D()
  {
    return this.U;
  }
  
  public void f(double paramDouble)
  {
    this.U = paramDouble;
    g(false);
  }
  
  public int I()
  {
    return this.V;
  }
  
  public void j(int paramInt)
  {
    this.V = paramInt;
  }
  
  zbwv J()
  {
    return this.W;
  }
  
  public zajr G()
  {
    return this.W;
  }
  
  public int H()
  {
    return this.X;
  }
  
  public void k(int paramInt)
  {
    if (paramInt > 0) {
      this.X = paramInt;
    }
  }
  
  public boolean K()
  {
    return this.Y;
  }
  
  public void f(boolean paramBoolean)
  {
    this.Y = paramBoolean;
  }
  
  public int Q()
  {
    return this.Z;
  }
  
  public void l(int paramInt)
  {
    if (paramInt > 0) {
      this.Z = paramInt;
    }
  }
  
  zbwy S()
  {
    return this.aa;
  }
  
  public zajs L()
  {
    return this.aa;
  }
  
  public boolean M()
  {
    return this.ab;
  }
  
  public void g(boolean paramBoolean)
  {
    this.ab = paramBoolean;
  }
  
  public boolean N()
  {
    return this.ac;
  }
  
  public void h(boolean paramBoolean)
  {
    this.ac = paramBoolean;
  }
  
  public boolean O()
  {
    return this.ad;
  }
  
  public void i(boolean paramBoolean)
  {
    this.ad = paramBoolean;
  }
  
  public boolean P()
  {
    return this.ae;
  }
  
  public void j(boolean paramBoolean)
  {
    this.ae = paramBoolean;
  }
  
  zsq T()
  {
    return this.af;
  }
  
  public zahz R()
  {
    return this.af;
  }
  
  public String U()
  {
    return this.am;
  }
  
  public void a(String paramString)
  {
    this.am = paramString;
  }
  
  double V()
  {
    if (n()) {
      return g(z());
    }
    return z();
  }
  
  double W()
  {
    if (n()) {
      return g(D());
    }
    return D();
  }
  
  double X()
  {
    if (n()) {
      return g(l());
    }
    return l();
  }
  
  double Y()
  {
    if (n()) {
      return g(x());
    }
    return x();
  }
  
  double Z()
  {
    if (n()) {
      return g(B());
    }
    return B();
  }
  
  double i(double paramDouble)
  {
    if (paramDouble > V()) {
      paramDouble = V();
    }
    if (paramDouble < W()) {
      paramDouble = W();
    }
    return paramDouble;
  }
  
  int aa()
  {
    return this.ag;
  }
  
  void m(int paramInt)
  {
    this.ag = paramInt;
  }
  
  int ab()
  {
    return this.ah;
  }
  
  void n(int paramInt)
  {
    this.ah = paramInt;
  }
  
  int ac()
  {
    int i1 = 0;
    if (G().a() != null) {
      i1 = zbxz.c(ad() * 0.2F);
    } else {
      return 0;
    }
    if (i1 < 2) {
      return 2;
    }
    return i1;
  }
  
  float ad()
  {
    return zbxz.a(e().ap().a().a(G().a()));
  }
  
  zbt ae()
  {
    zbt localzbt = null;
    if (g() == 0) {
      localzbt = e().G();
    } else if (g() == 2) {
      localzbt = e().I();
    } else if (g() == 1) {
      localzbt = e().e();
    } else if (g() == 3) {
      localzbt = e().g();
    }
    return localzbt;
  }
  
  void a(com.aspose.cells.b.a.b.zo paramzo)
  {
    this.an = paramzo;
  }
  
  void b(com.aspose.cells.b.a.b.zo paramzo)
  {
    this.ao = paramzo;
  }
  
  public boolean af()
  {
    return this.ap;
  }
  
  public void k(boolean paramBoolean)
  {
    this.ap = paramBoolean;
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
    if (!this.aq)
    {
      if (paramBoolean)
      {
        if (this.W != null) {
          this.W.dispose();
        }
        if (this.aa != null) {
          this.aa.dispose();
        }
        if (this.af != null) {
          this.af.dispose();
        }
      }
      this.aq = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */