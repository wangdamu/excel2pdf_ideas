package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import java.util.Iterator;
import java.util.List;

class zje
  implements zahj
{
  private zr n;
  private boolean o;
  private zbs p;
  private zbs q;
  private zbs r;
  private zbs s;
  private zbwx t;
  private int u;
  private zbfe v;
  private zjx w;
  private zjx x;
  private zjp y;
  private boolean z;
  private boolean A;
  private boolean B;
  private zamu C;
  private zln D;
  private zln E;
  private String F;
  private zjg G;
  private zbs H;
  private int I;
  private int J;
  private int K;
  private int L;
  private int M;
  private int N;
  private zbyu O;
  private zxp P;
  private boolean Q;
  private boolean R;
  private int S;
  private int T;
  private zzx U;
  private boolean V = false;
  private String W = "Other";
  private boolean X = true;
  private zboo Y;
  private int Z = 0;
  private int aa = 0;
  private int ab = 0;
  private zq ac;
  private float ad = 0.0F;
  int a;
  int b;
  int c;
  int d;
  private boolean ae = true;
  private zp af = zp.a();
  zp e = zp.a();
  zp f = zp.a();
  boolean g = false;
  zbs h;
  double i;
  double j;
  boolean k = false;
  private boolean ag = false;
  private ImageOrPrintOptions ah = new ImageOrPrintOptions();
  private boolean ai = false;
  private boolean aj = false;
  private int ak = 0;
  private int al = 0;
  boolean l = false;
  boolean m = false;
  private int am = 0;
  private Chart an;
  private boolean ao = false;
  private boolean ap = false;
  
  public zje(com.aspose.cells.b.a.b.zg paramzg, Color paramColor)
  {
    a(paramzg, paramColor);
  }
  
  public zje()
  {
    a(null, Color.getEmpty());
    this.x.f().a(g(false).a(55));
  }
  
  private void a(com.aspose.cells.b.a.b.zg paramzg, Color paramColor)
  {
    this.D = new zln(null, false);
    this.E = new zln(null, true);
    this.w = new zjx(this, this, 0);
    this.w.a(533);
    this.w.b(400);
    this.w.b(paramzg);
    if (!paramColor.isEmpty()) {
      this.w.a(paramColor);
    }
    this.p = new zbs(this, 0);
    this.q = new zbs(this, 2);
    this.q.d(false);
    this.r = new zbs(this, 1);
    this.s = new zbs(this, 3);
    this.s.d(false);
    this.H = new zbs(this, 4);
    this.H.d(aj());
    this.y = new zjp(this);
    this.z = false;
    this.A = true;
    this.B = true;
    this.C = new zamu(this, this, 10);
    this.v = new zbfe(this);
    this.x = new zjx(this, this, 1);
    this.t = new zbwx(this, this, 8);
    this.u = 14;
    this.o = false;
    this.R = true;
    this.Q = true;
    this.G = new zjg();
    this.I = 100;
    this.J = 150;
    this.K = 150;
    this.N = 100;
    this.L = 15;
    this.M = 20;
    this.O = new zbyu(this);
    this.P = new zxp(this);
    this.Y = new zboo(this);
    this.U = new zzx();
  }
  
  public int a()
    throws Exception
  {
    if (this.w.l() == 0) {
      return 1;
    }
    return this.w.l();
  }
  
  public int b()
    throws Exception
  {
    if (this.w.m() == 0) {
      return 1;
    }
    return this.w.m();
  }
  
  public int c()
  {
    return this.S;
  }
  
  public void a(int paramInt)
  {
    this.S = paramInt;
  }
  
  public int d()
  {
    return this.T;
  }
  
  public void b(int paramInt)
  {
    this.T = paramInt;
  }
  
  zbs e()
  {
    return this.p;
  }
  
  public zagv f()
  {
    return this.p;
  }
  
  zbs g()
  {
    return this.q;
  }
  
  public zagv h()
  {
    return this.q;
  }
  
  zjx i()
  {
    return this.w;
  }
  
  public zahm j()
  {
    return this.w;
  }
  
  zjp k()
  {
    return this.y;
  }
  
  public zahl l()
  {
    return this.y;
  }
  
  public int m()
  {
    return this.I;
  }
  
  public void c(int paramInt)
  {
    if ((paramInt >= 20) && (paramInt <= 2000)) {
      this.I = paramInt;
    }
  }
  
  public int n()
  {
    return this.J;
  }
  
  public void d(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 500)) {
      this.J = paramInt;
    }
  }
  
  public int o()
  {
    return this.K;
  }
  
  public void e(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 500))
    {
      this.K = paramInt;
      Iterator localIterator = this.v.iterator();
      while (localIterator.hasNext())
      {
        zbfc localzbfc = (zbfc)localIterator.next();
        localzbfc.e(paramInt);
      }
    }
  }
  
  public int p()
  {
    return this.L;
  }
  
  public void f(int paramInt)
  {
    this.L = paramInt;
  }
  
  public int q()
  {
    return this.N;
  }
  
  public void g(int paramInt)
  {
    this.N = paramInt;
  }
  
  public boolean r()
  {
    return this.Q;
  }
  
  public void a(boolean paramBoolean)
  {
    this.Q = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.R = paramBoolean;
  }
  
  zxp s()
  {
    return this.P;
  }
  
  public zaic t()
  {
    return this.P;
  }
  
  public boolean u()
  {
    return this.z;
  }
  
  public void c(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public boolean v()
  {
    return this.A;
  }
  
  public void d(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public boolean w()
  {
    return this.B;
  }
  
  public void e(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  zamu x()
  {
    return this.C;
  }
  
  public zaim y()
  {
    return this.C;
  }
  
  zbfe z()
  {
    return this.v;
  }
  
  public zajf A()
  {
    return this.v;
  }
  
  zjx B()
  {
    return this.x;
  }
  
  public zahm C()
  {
    return this.x;
  }
  
  public int D()
  {
    return this.M % 360;
  }
  
  public void h(int paramInt)
  {
    this.M = paramInt;
  }
  
  zbs E()
  {
    return this.r;
  }
  
  public zagv F()
  {
    return this.r;
  }
  
  zbs G()
  {
    return this.s;
  }
  
  public zagv H()
  {
    return this.s;
  }
  
  zbs I()
  {
    return this.H;
  }
  
  public zagv J()
  {
    return this.H;
  }
  
  zbwx K()
  {
    return this.t;
  }
  
  public zajs L()
  {
    return this.t;
  }
  
  public int M()
  {
    return this.u;
  }
  
  public void i(int paramInt)
  {
    this.u = paramInt;
  }
  
  zbyu N()
  {
    return this.O;
  }
  
  public zajv O()
  {
    return this.O;
  }
  
  public zajv P()
  {
    return this.O;
  }
  
  public zajv Q()
  {
    return this.O;
  }
  
  public int R()
  {
    return 0;
  }
  
  public void j(int paramInt) {}
  
  public boolean S()
  {
    return this.V;
  }
  
  public void f(boolean paramBoolean)
  {
    this.V = paramBoolean;
  }
  
  zln g(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.E;
    }
    return this.D;
  }
  
  public String T()
  {
    return this.W;
  }
  
  public void a(String paramString)
  {
    this.W = paramString;
  }
  
  public void a(Color[] paramArrayOfColor, int paramInt1, int paramInt2, List paramList)
  {
    this.D.a(paramArrayOfColor, false);
    this.E.a(paramArrayOfColor, true);
  }
  
  public boolean U()
  {
    return this.o;
  }
  
  public void h(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public zs V()
    throws Exception
  {
    if (i().f().e())
    {
      double d1 = i().f().h();
      int i1 = 0;
      if ((d1 > 0.0D) && (d1 < 1.0D)) {
        i1 = 1;
      } else {
        i1 = zbxz.a(d1);
      }
      return new zs(a() + i1, b() + i1);
    }
    return new zs(a(), b());
  }
  
  public void i(boolean paramBoolean)
  {
    this.X = paramBoolean;
  }
  
  boolean W()
  {
    int i1 = M();
    switch (i1)
    {
    case 3: 
    case 4: 
    case 5: 
    case 9: 
    case 10: 
    case 11: 
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
    case 43: 
    case 45: 
    case 48: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return true;
    }
    return false;
  }
  
  public zboo X()
  {
    return this.Y;
  }
  
  public zahk Y()
  {
    return this.G;
  }
  
  public String Z()
  {
    return this.F;
  }
  
  public void b(String paramString)
  {
    this.F = paramString;
  }
  
  void aa()
    throws Exception
  {
    for (int i1 = 0; i1 < Y().getCount(); i1++)
    {
      zje localzje = this.G.b(i1);
      zf localzf = ar().d();
      zi localzi = new zi();
      localzi.b(localzje.c(), localzje.d());
      ar().a(localzi);
      localzje.a(ar());
      localzje.aq();
      ar().a(localzf);
    }
  }
  
  com.aspose.cells.b.a.b.zg ab()
  {
    return this.w.h();
  }
  
  Color ac()
  {
    return this.w.j();
  }
  
  int ad()
  {
    return this.Z;
  }
  
  void k(int paramInt)
  {
    this.Z = paramInt;
  }
  
  int ae()
  {
    return this.aa;
  }
  
  void l(int paramInt)
  {
    this.aa = paramInt;
  }
  
  int af()
  {
    return this.ab;
  }
  
  void m(int paramInt)
  {
    this.ab = paramInt;
  }
  
  zq ag()
  {
    return this.ac;
  }
  
  void a(zq paramzq)
  {
    this.ac = paramzq;
  }
  
  float ah()
  {
    return this.ad;
  }
  
  void a(float paramFloat)
  {
    this.ad = paramFloat;
  }
  
  zp ai()
  {
    zp localzp;
    if (!C().s())
    {
      localzp = new zp(this.a, this.b, this.c, this.d);
    }
    else
    {
      int i1 = this.w.l() - 2 * ziy.c;
      int i2 = this.w.m() - 2 * ziy.c;
      localzp = new zp((int)(this.a * 4000.0F / i1 + 0.5D), (int)(this.b * 4000.0F / i2 + 0.5D), (int)(this.c * 4000.0F / i1 + 0.5D), (int)(this.d * 4000.0F / i2 + 0.5D));
    }
    return localzp;
  }
  
  void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.ae = paramBoolean;
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  boolean aj()
  {
    switch (this.u)
    {
    case 3: 
    case 17: 
    case 27: 
    case 34: 
    case 43: 
    case 56: 
      return true;
    }
    return false;
  }
  
  boolean ak()
  {
    return (M() == 44) || (M() == 45) || (M() == 48) || (M() == 49) || (M() == 47) || (M() == 46);
  }
  
  boolean al()
  {
    return (M() == 35) || (M() == 36);
  }
  
  boolean am()
  {
    return (M() == 57) || (M() == 59) || (M() == 58);
  }
  
  void a(zq[] paramArrayOfzq)
    throws Exception
  {
    if (paramArrayOfzq[0].f() < 0.0F) {
      paramArrayOfzq[0].a(0.0F);
    }
    if (paramArrayOfzq[0].g() < 0.0F) {
      paramArrayOfzq[0].b(0.0F);
    }
    if (paramArrayOfzq[0].l() > a()) {
      paramArrayOfzq[0].a(a() - paramArrayOfzq[0].h());
    }
    if (paramArrayOfzq[0].m() > b()) {
      paramArrayOfzq[0].b(b() - paramArrayOfzq[0].i());
    }
  }
  
  public zzx an()
  {
    return this.U;
  }
  
  public void a(zzx paramzzx)
  {
    this.U = paramzzx;
  }
  
  public void ao()
    throws Exception
  {
    this.ag = true;
    if (W()) {
      zja.b(this);
    } else {
      ziy.b(this);
    }
    this.ag = false;
  }
  
  boolean ap()
  {
    return this.ag;
  }
  
  void n(int paramInt)
    throws Exception
  {
    String str1 = Z();
    if ((str1 == null) || ("".equals(str1))) {
      return;
    }
    zq localzq1 = new zq(0.0F, 0.0F, a(), b());
    int i1 = 10;
    String str2 = "Microsoft Sans Serif";
    com.aspose.cells.b.a.b.zg localzg = null;
    int i2 = 0;
    int i3 = 0;
    zu localzu = new zu(Color.fromArgb(paramInt, 120, 120, 191));
    try
    {
      zt localzt;
      for (;;)
      {
        if (localzg != null) {
          localzg.n();
        }
        localzg = zbxz.a(str2, i1, 0);
        localzt = this.n.a(str1, localzg);
        if (localzt.b() < localzq1.h() * 0.55D)
        {
          i1++;
          i2 = 1;
        }
        else
        {
          if (localzt.b() <= localzq1.h() * 0.8D) {
            break;
          }
          i1--;
          i3 = 1;
        }
        if (i1 > 1) {
          if ((i2 != 0) && (i3 != 0)) {
            break;
          }
        }
      }
      float f1 = localzq1.j() + (localzq1.h() - localzt.b()) / 2.0F;
      float f2 = localzq1.k() + (localzq1.i() - localzt.c()) / 2.0F;
      zq localzq2 = new zq(f1, f2, localzt.b(), localzt.c());
      zf localzf = null;
      int i4 = 0;
      if ((i().d().g()) && (this.n.i() != 4))
      {
        localzf = this.n.d();
        i4 = 1;
        this.n.b(4, false);
      }
      this.n.a(str1, localzg, localzu, localzq2);
      if (i4 != 0) {
        this.n.a(localzf);
      }
      if (localzg != null) {
        localzg.n();
      }
    }
    finally
    {
      if (localzu != null) {
        localzu.f();
      }
    }
  }
  
  public void aq()
    throws Exception
  {
    zjz.a(ar(), this);
    if (W()) {
      zja.b(this);
    } else {
      ziy.b(this);
    }
    X().a(ar());
    aa();
    n(100);
  }
  
  public zr ar()
  {
    return this.n;
  }
  
  public void a(zr paramzr)
  {
    this.n = paramzr;
  }
  
  public ImageOrPrintOptions as()
  {
    return this.ah;
  }
  
  public void a(ImageOrPrintOptions paramImageOrPrintOptions)
  {
    this.ah = paramImageOrPrintOptions;
  }
  
  public boolean at()
  {
    return this.ai;
  }
  
  public void j(boolean paramBoolean)
  {
    this.ai = paramBoolean;
  }
  
  public void k(boolean paramBoolean)
  {
    this.aj = paramBoolean;
  }
  
  public void o(int paramInt)
    throws Exception
  {
    this.ak = paramInt;
    this.l = true;
  }
  
  public void p(int paramInt)
    throws Exception
  {
    this.al = paramInt;
    this.m = true;
  }
  
  public void q(int paramInt)
  {
    this.am = paramInt;
  }
  
  public Chart au()
  {
    return this.an;
  }
  
  public void a(Chart paramChart)
  {
    this.an = paramChart;
  }
  
  public boolean av()
  {
    return this.ao;
  }
  
  public void l(boolean paramBoolean)
  {
    this.ao = paramBoolean;
  }
  
  protected void finalize()
    throws Exception
  {
    m(false);
  }
  
  public void dispose()
  {
    m(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void m(boolean paramBoolean)
  {
    if (!this.ap)
    {
      if (paramBoolean)
      {
        if (this.t != null) {
          this.t.dispose();
        }
        if (this.x != null) {
          this.x.dispose();
        }
        if (this.w != null) {
          this.w.dispose();
        }
        if (this.C != null) {
          this.C.dispose();
        }
        if (this.P != null) {
          this.P.dispose();
        }
        if (this.O != null) {
          this.O.dispose();
        }
        if (this.y != null) {
          this.y.dispose();
        }
        if (this.p != null) {
          this.p.dispose();
        }
        if (this.q != null) {
          this.q.dispose();
        }
        if (this.r != null) {
          this.r.dispose();
        }
        if (this.s != null) {
          this.s.dispose();
        }
        if (this.H != null) {
          this.H.dispose();
        }
        int i1;
        Object localObject;
        if (this.v != null) {
          for (i1 = 0; i1 < this.v.getCount(); i1++)
          {
            localObject = this.v.c(i1);
            if (localObject != null) {
              ((zbfc)localObject).dispose();
            }
          }
        }
        if (this.G != null) {
          for (i1 = 0; i1 < this.G.getCount(); i1++)
          {
            localObject = this.G.b(i1);
            if (localObject != null) {
              ((zje)localObject).dispose();
            }
          }
        }
      }
      this.ap = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */