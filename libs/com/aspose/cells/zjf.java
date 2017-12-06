package com.aspose.cells;

import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import java.util.Iterator;
import java.util.List;

class zjf
  implements zahj
{
  private zr n;
  private zbt o;
  private zbt p;
  private zbt q;
  private zbt r;
  private zbwy s;
  private int t;
  private zbff u;
  private zjy v;
  private zjy w;
  private zjq x;
  private boolean y;
  private boolean z;
  private boolean A;
  private zamv B;
  private zbt C;
  private int D;
  private int E;
  private int F;
  private int G;
  private int H;
  private int I;
  private zbyv J;
  private zbyv K;
  private zbyv L;
  private zxq M;
  private boolean N;
  private boolean O;
  private boolean P;
  private boolean Q;
  private zjh R;
  private String S;
  private int T;
  private zbwq U;
  private int V;
  private int W;
  private zzx X;
  boolean a = false;
  private String Y = "Other";
  private zbop Z;
  private int aa = 0;
  private int ab = 0;
  private int ac = 0;
  private zq ad;
  private float ae = 0.0F;
  boolean b = false;
  zbt c;
  double d;
  double e;
  int f;
  int g;
  int h;
  int i;
  private boolean af = true;
  zp j = zp.a();
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
  
  public zjf(com.aspose.cells.b.a.b.zg paramzg, Color paramColor)
  {
    a(paramzg, paramColor);
  }
  
  public zjf()
  {
    a(null, Color.getEmpty());
  }
  
  private void a(com.aspose.cells.b.a.b.zg paramzg, Color paramColor)
  {
    this.T = 2;
    this.U = new zbwq(this);
    this.v = new zjy(this, this, 0, 0);
    this.v.a(480);
    this.v.b(288);
    this.v.d().g().b(1.0D);
    Color localColor = this.v.j();
    this.v.b(paramzg);
    if (!paramColor.isEmpty()) {
      this.v.a(paramColor);
    }
    this.o = new zbt(this, 0);
    this.p = new zbt(this, 2);
    this.p.d(false);
    this.q = new zbt(this, 1);
    this.r = new zbt(this, 3);
    this.r.d(false);
    this.C = new zbt(this, 4);
    this.C.d(false);
    this.x = new zjq(this);
    this.y = false;
    this.z = true;
    this.A = true;
    this.B = new zamv(this, this, 10);
    this.u = new zbff(this);
    this.w = new zjy(this, this, 1, 1);
    this.s = new zbwy(this, this, 8, 10);
    this.t = 14;
    this.D = 100;
    this.E = 150;
    this.F = 150;
    this.I = 100;
    this.G = 15;
    this.H = 20;
    this.J = new zbyv(this);
    this.K = new zbyv(this);
    this.L = new zbyv(this);
    this.M = new zxq(this);
    this.Z = new zbop(this);
    this.N = false;
    this.O = true;
    this.P = true;
    this.Q = false;
    this.R = new zjh();
    this.X = new zzx();
  }
  
  public int a()
    throws Exception
  {
    if (this.v.l() == 0) {
      return 1;
    }
    return this.v.l();
  }
  
  public int b()
    throws Exception
  {
    if (this.v.m() == 0) {
      return 1;
    }
    return this.v.m();
  }
  
  public int c()
  {
    return this.V;
  }
  
  public void a(int paramInt)
  {
    this.V = paramInt;
  }
  
  public int d()
  {
    return this.W;
  }
  
  public void b(int paramInt)
  {
    this.W = paramInt;
  }
  
  zbt e()
  {
    return this.o;
  }
  
  public zagv f()
  {
    return this.o;
  }
  
  zbt g()
  {
    return this.p;
  }
  
  public zagv h()
  {
    return this.p;
  }
  
  zjy i()
  {
    return this.v;
  }
  
  public zahm j()
  {
    return this.v;
  }
  
  zjq k()
  {
    return this.x;
  }
  
  public zahl l()
  {
    return this.x;
  }
  
  public int m()
  {
    return this.D;
  }
  
  public void c(int paramInt)
  {
    if ((paramInt >= 20) && (paramInt <= 2000)) {
      this.D = paramInt;
    }
  }
  
  public int n()
  {
    return this.E;
  }
  
  public void d(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 500)) {
      this.E = paramInt;
    }
  }
  
  public int o()
  {
    return this.F;
  }
  
  public void e(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 500))
    {
      this.F = paramInt;
      Iterator localIterator = this.u.iterator();
      while (localIterator.hasNext())
      {
        zbfd localzbfd = (zbfd)localIterator.next();
        localzbfd.e(paramInt);
      }
    }
  }
  
  public int p()
  {
    return this.G;
  }
  
  public void f(int paramInt)
  {
    this.G = paramInt;
  }
  
  public int q()
  {
    return this.I;
  }
  
  public void g(int paramInt)
  {
    this.I = paramInt;
  }
  
  public boolean r()
  {
    return this.P;
  }
  
  public void a(boolean paramBoolean)
  {
    this.P = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }
  
  zxq s()
  {
    return this.M;
  }
  
  public zaic t()
  {
    return this.M;
  }
  
  public boolean u()
  {
    return this.y;
  }
  
  public void c(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  public boolean v()
  {
    return this.z;
  }
  
  public void d(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public boolean w()
  {
    return this.A;
  }
  
  public void e(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  zamv x()
  {
    return this.B;
  }
  
  public zaim y()
  {
    return this.B;
  }
  
  zbff z()
  {
    return this.u;
  }
  
  public zajf A()
  {
    return this.u;
  }
  
  zjy B()
  {
    return this.w;
  }
  
  public zahm C()
  {
    return this.w;
  }
  
  public boolean D()
  {
    return this.Q;
  }
  
  public void f(boolean paramBoolean)
  {
    this.Q = paramBoolean;
  }
  
  public int E()
  {
    return this.H;
  }
  
  public void h(int paramInt)
  {
    this.H = paramInt;
  }
  
  zbt G()
  {
    return this.q;
  }
  
  public zagv F()
  {
    return this.q;
  }
  
  zbt I()
  {
    return this.r;
  }
  
  public zagv H()
  {
    return this.r;
  }
  
  zbt K()
  {
    return this.C;
  }
  
  public zagv J()
  {
    return this.C;
  }
  
  zbwy M()
  {
    return this.s;
  }
  
  public zajs L()
  {
    return this.s;
  }
  
  public int N()
  {
    return this.t;
  }
  
  public void i(int paramInt)
  {
    this.t = paramInt;
  }
  
  zbyv S()
  {
    return this.J;
  }
  
  public zajv O()
  {
    return this.J;
  }
  
  zbyv T()
  {
    return this.K;
  }
  
  public zajv Q()
  {
    return this.K;
  }
  
  zbyv W()
  {
    return this.L;
  }
  
  public zajv P()
  {
    return this.L;
  }
  
  public boolean U()
  {
    return this.N;
  }
  
  public void h(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }
  
  public String X()
  {
    return this.S;
  }
  
  public void b(String paramString)
  {
    this.S = paramString;
  }
  
  public zahk Y()
  {
    return this.R;
  }
  
  public int R()
  {
    return this.T;
  }
  
  public void j(int paramInt)
  {
    this.T = paramInt;
  }
  
  zbwq Z()
  {
    return this.U;
  }
  
  public void a(Color[] paramArrayOfColor, int paramInt1, int paramInt2, List paramList)
  {
    this.U.a().a(paramArrayOfColor, paramInt1, paramInt2, paramList);
  }
  
  public String aa()
  {
    return this.Y;
  }
  
  public void a(String paramString)
  {
    this.Y = paramString;
  }
  
  boolean ab()
  {
    int i1 = N();
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
  
  zbop ac()
  {
    return this.Z;
  }
  
  com.aspose.cells.b.a.b.zg ad()
  {
    return this.v.h();
  }
  
  Color ae()
  {
    return this.v.j();
  }
  
  int af()
  {
    return this.aa;
  }
  
  void k(int paramInt)
  {
    this.aa = paramInt;
  }
  
  int ag()
  {
    return this.ab;
  }
  
  void l(int paramInt)
  {
    this.ab = paramInt;
  }
  
  int ah()
  {
    return this.ac;
  }
  
  void m(int paramInt)
  {
    this.ac = paramInt;
  }
  
  void a(zq paramzq)
  {
    this.ad = paramzq;
  }
  
  float ai()
  {
    return this.ae;
  }
  
  void a(float paramFloat)
  {
    this.ae = paramFloat;
  }
  
  zp aj()
    throws Exception
  {
    int i1 = a();
    return new zp((int)(this.f * 4000.0F / a() + 0.5D), (int)(this.g * 4000.0F / b() + 0.5D), (int)(this.h * 4000.0F / a() + 0.5D), (int)(this.i * 4000.0F / b() + 0.5D));
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramInt4;
  }
  
  public boolean ak()
  {
    return this.af;
  }
  
  public void i(boolean paramBoolean)
  {
    this.af = paramBoolean;
  }
  
  public zs V()
    throws Exception
  {
    i().d().n();
    if (i().d().h())
    {
      double d1 = i().d().i();
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
  
  zp al()
    throws Exception
  {
    i().d().n();
    int i1 = (int)i().d().i();
    int i2 = i1 / 2;
    int i3 = i2;
    return new zp(i2, i3, a(), b());
  }
  
  void a(zp[] paramArrayOfzp)
    throws Exception
  {
    zq localzq = new zq(paramArrayOfzp[0].c(), paramArrayOfzp[0].d(), paramArrayOfzp[0].e(), paramArrayOfzp[0].f());
    zq[] arrayOfzq = { localzq };
    a(arrayOfzq);
    localzq = arrayOfzq[0];
    paramArrayOfzp[0].a(zbxz.c(localzq.f()));
    paramArrayOfzp[0].b(zbxz.c(localzq.g()));
    paramArrayOfzp[0].c(zbxz.c(localzq.h()));
    paramArrayOfzp[0].d(zbxz.c(localzq.i()));
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
  
  boolean b(zq paramzq)
    throws Exception
  {
    if ((paramzq.m() <= 0.0F) || (paramzq.l() <= 0.0F)) {
      return true;
    }
    return (paramzq.f() >= a()) || (paramzq.g() >= b());
  }
  
  public zzx an()
  {
    return this.X;
  }
  
  public void a(zzx paramzzx)
  {
    this.X = paramzzx;
  }
  
  public void am()
    throws Exception
  {
    i().d().n();
    i().c().m();
    this.ag = true;
    if (ab()) {
      zjb.b(this);
    } else {
      ziz.b(this);
    }
    this.ag = false;
  }
  
  boolean ao()
  {
    return this.ag;
  }
  
  public zr ap()
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
  
  public int ar()
    throws Exception
  {
    if (this.l) {
      return this.ak;
    }
    return a();
  }
  
  public void o(int paramInt)
    throws Exception
  {
    this.ak = paramInt;
    this.l = true;
  }
  
  public int au()
    throws Exception
  {
    if (this.m) {
      return this.al;
    }
    return b();
  }
  
  public void p(int paramInt)
    throws Exception
  {
    this.al = paramInt;
    this.m = true;
  }
  
  int aw()
    throws Exception
  {
    return a() - ar();
  }
  
  int ax()
    throws Exception
  {
    return b() - au();
  }
  
  public int ay()
  {
    return this.am;
  }
  
  public void q(int paramInt)
  {
    this.am = paramInt;
  }
  
  public boolean av()
  {
    return this.ao;
  }
  
  public void l(boolean paramBoolean)
  {
    this.ao = paramBoolean;
  }
  
  public Chart az()
  {
    return this.an;
  }
  
  public void a(Chart paramChart)
  {
    this.an = paramChart;
  }
  
  boolean aA()
  {
    switch (this.t)
    {
    case 76: 
    case 77: 
    case 78: 
    case 79: 
      return true;
    }
    return false;
  }
  
  public void aq()
    throws Exception
  {
    aB();
    if (ab()) {
      zjb.b(this);
    } else {
      ziz.b(this);
    }
    aC();
    ac().a(ap());
    aD();
    n(100);
  }
  
  private void aB()
    throws Exception
  {
    i().d().n();
    i().c().m();
    zq localzq = zbxz.a(this, V(), (float)i().d().i(), i().d().h());
    if (w()) {
      i().c().a(localzq);
    } else {
      a(localzq.f(), localzq.g(), localzq.h(), localzq.i(), 13.0F);
    }
  }
  
  private void aC()
    throws Exception
  {
    i().d().n();
    i().c().m();
    zq localzq = zbxz.a(this, V(), (float)i().d().i(), i().d().h());
    if (w()) {
      i().d().a(localzq);
    } else {
      b(localzq.f(), localzq.g(), localzq.h(), localzq.i(), 13.0F);
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
    throws Exception
  {
    zf localzf = this.n.d();
    this.n.a(4, true);
    ze localze = new ze();
    localze.b(paramFloat1 + paramFloat5, paramFloat2, paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 270.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3, paramFloat2 + paramFloat5, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 0.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4, paramFloat1 + paramFloat5, paramFloat2 + paramFloat4);
    localze.a(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 90.0F, 90.0F);
    localze.b(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat1, paramFloat2 + paramFloat5);
    localze.a(paramFloat1, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 180.0F, 90.0F);
    localze.j();
    i().c().a(localze);
    this.n.a(localzf);
  }
  
  private void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    zf localzf = this.n.d();
    this.n.a(4, true);
    ze localze = new ze();
    localze.b(paramFloat1 + paramFloat5, paramFloat2, paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 270.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3, paramFloat2 + paramFloat5, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 0.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4, paramFloat1 + paramFloat5, paramFloat2 + paramFloat4);
    localze.a(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 90.0F, 90.0F);
    localze.b(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat1, paramFloat2 + paramFloat5);
    localze.a(paramFloat1, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 180.0F, 90.0F);
    localze.j();
    i().d().a(localze);
    this.n.a(localzf);
  }
  
  private void n(int paramInt)
    throws Exception
  {
    String str1 = X();
    if ((str1 == null) || ("".equals(str1))) {
      return;
    }
    zp localzp = al();
    int i1 = 10;
    String str2 = "Arail";
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
        if (localzt.b() < localzp.e() * 0.55D)
        {
          i1++;
          i2 = 1;
        }
        else
        {
          if (localzt.b() <= localzp.e() * 0.8D) {
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
      float f1 = localzp.g() + (localzp.e() - localzt.b()) / 2.0F;
      float f2 = localzp.h() + (localzp.f() - localzt.c()) / 2.0F;
      zq localzq = new zq(f1, f2, localzt.b(), localzt.c());
      zf localzf = null;
      int i4 = 0;
      if ((i().c().k()) && (this.n.i() != 4))
      {
        localzf = this.n.d();
        i4 = 1;
        this.n.b(4, false);
      }
      this.n.a(str1, localzg, localzu, localzq);
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
  
  private void aD()
    throws Exception
  {
    for (int i1 = 0; i1 < Y().getCount(); i1++)
    {
      zjf localzjf = this.R.b(i1);
      zf localzf = ap().d();
      zi localzi = new zi();
      localzi.b(localzjf.c(), localzjf.d());
      ap().a(localzi);
      localzjf.a(ap());
      localzjf.aq();
      ap().a(localzf);
    }
  }
  
  protected void finalize()
    throws Exception
  {
    g(false);
  }
  
  public void dispose()
  {
    g(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void g(boolean paramBoolean)
  {
    if (!this.ap)
    {
      if (paramBoolean)
      {
        if (this.s != null) {
          this.s.dispose();
        }
        if (this.w != null) {
          this.w.dispose();
        }
        if (this.v != null) {
          this.v.dispose();
        }
        if (this.B != null) {
          this.B.dispose();
        }
        if (this.x != null) {
          this.x.dispose();
        }
        if (this.J != null) {
          this.J.dispose();
        }
        if (this.K != null) {
          this.K.dispose();
        }
        if (this.L != null) {
          this.L.dispose();
        }
        if (this.M != null) {
          this.M.dispose();
        }
        if (this.o != null) {
          this.o.dispose();
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
        if (this.C != null) {
          this.C.dispose();
        }
        int i1;
        Object localObject;
        if (this.u != null) {
          for (i1 = 0; i1 < this.u.getCount(); i1++)
          {
            localObject = this.u.c(i1);
            if (localObject != null) {
              ((zbfd)localObject).dispose();
            }
          }
        }
        if (this.R != null) {
          for (i1 = 0; i1 < this.R.getCount(); i1++)
          {
            localObject = this.R.b(i1);
            if (localObject != null) {
              ((zjf)localObject).dispose();
            }
          }
        }
      }
      this.ap = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */