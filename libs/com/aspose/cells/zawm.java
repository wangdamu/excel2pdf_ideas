package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zh;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;

class zawm
  implements zj
{
  protected zq a;
  protected float b;
  protected float c;
  protected float d;
  private float s;
  private float t;
  private Color u = Color.getEmpty();
  private int v = 0;
  private int w = 0;
  protected com.aspose.cells.b.a.b.zc e = null;
  protected com.aspose.cells.b.a.b.zc f = null;
  protected com.aspose.cells.b.a.b.zc g = null;
  protected com.aspose.cells.b.a.b.zc h = null;
  protected com.aspose.cells.b.a.b.zc i = null;
  protected zs j = null;
  protected zo k;
  protected zo l;
  protected zo m;
  protected zo n;
  protected zo o;
  protected zo p;
  protected zayc q = zayc.a;
  protected zayc r = zayc.a;
  private String x;
  private boolean y = false;
  private static float z = 20.0F;
  private zke A = null;
  
  protected zawm() {}
  
  public zawm(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2)
  {
    this();
    this.s = paramFloat6;
    this.t = paramFloat7;
    Color localColor = ztd.a(paramInt2, paramColor);
    this.j = new zs(localColor);
    this.j.d(2);
    c(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
  }
  
  public zawm(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8, zke paramzke)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramColor, paramInt1, paramInt2, paramFloat8);
    this.A = paramzke;
    if (paramzke != null) {
      this.j = zanv.a(paramzke.k());
    }
  }
  
  public zawm(zq paramzq, float paramFloat1, float paramFloat2, float paramFloat3, Color paramColor, int paramInt1, int paramInt2)
  {
    this(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramFloat1, paramFloat2, paramFloat3, paramColor, paramInt1, paramInt2);
  }
  
  public zawm(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramColor, paramInt1, paramInt2);
    this.j.b(paramFloat8);
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.y)
    {
      if (paramBoolean)
      {
        this.j.dispose();
        j();
        this.q.dispose();
        this.r.dispose();
      }
      this.y = true;
    }
  }
  
  public Object a()
  {
    zawm localzawm = new zawm(f(), g(), b(), c(), this.u, this.v, this.w);
    localzawm.a(i());
    return localzawm;
  }
  
  public float b()
  {
    return this.c;
  }
  
  public float c()
  {
    return this.d;
  }
  
  public float d()
  {
    return (this.c + this.d) % 360.0F;
  }
  
  public String e()
  {
    return this.x;
  }
  
  public void a(String paramString)
  {
    this.x = paramString;
  }
  
  public zo a(float paramFloat, float[] paramArrayOfFloat)
  {
    zo localzo = zo.a();
    if (c() >= 180.0F)
    {
      paramArrayOfFloat[0] = (c(b()) + c() / 2.0F);
      localzo = b(this.k.d(), this.k.e(), this.a.h() * paramFloat, this.a.i() * paramFloat, paramArrayOfFloat[0]);
    }
    else
    {
      float f1 = (this.m.d() + this.o.d()) / 2.0F;
      float f2 = (this.m.e() + this.o.e()) / 2.0F;
      float f3 = (float)(Math.atan2(f2 - this.k.e(), f1 - this.k.d()) * 180.0D / 3.141592653589793D);
      paramArrayOfFloat[0] = c(f3);
      localzo = b(this.k.d(), this.k.e(), this.a.h() * paramFloat, this.a.i() * paramFloat, paramArrayOfFloat[0]);
    }
    paramArrayOfFloat[0] %= 360.0F;
    if (paramArrayOfFloat[0] < 0.0F) {
      paramArrayOfFloat[0] += 360.0F;
    }
    return localzo;
  }
  
  public zo a(float paramFloat, int paramInt, float[] paramArrayOfFloat)
  {
    zo localzo = zo.a();
    if (c() >= 180.0F)
    {
      paramArrayOfFloat[0] = (c(b()) + c() / 2.0F);
      paramArrayOfFloat[0] += paramInt;
      localzo = b(this.k.d(), this.k.e(), this.a.h() * paramFloat, this.a.i() * paramFloat, paramArrayOfFloat[0]);
    }
    else
    {
      float f1 = (this.m.d() + this.o.d()) / 2.0F;
      float f2 = (this.m.e() + this.o.e()) / 2.0F;
      float f3 = (float)(Math.atan2(f2 - this.k.e(), f1 - this.k.d()) * 180.0D / 3.141592653589793D);
      paramArrayOfFloat[0] = c(f3);
      paramArrayOfFloat[0] += paramInt;
      localzo = b(this.k.d(), this.k.e(), this.a.h() * paramFloat, this.a.i() * paramFloat, paramArrayOfFloat[0]);
    }
    paramArrayOfFloat[0] %= 360.0F;
    if (paramArrayOfFloat[0] < 0.0F) {
      paramArrayOfFloat[0] += 360.0F;
    }
    return localzo;
  }
  
  zq f()
  {
    return this.a;
  }
  
  float g()
  {
    return this.b;
  }
  
  void a(zr paramzr)
    throws Exception
  {
    e(paramzr);
    if ((b() > 90.0F) && (b() < 270.0F))
    {
      c(paramzr);
      b(paramzr);
    }
    else
    {
      b(paramzr);
      c(paramzr);
    }
    d(paramzr);
  }
  
  zawm[] a(float paramFloat)
  {
    if ((b() == paramFloat) || (d() == paramFloat)) {
      return new zawm[] { (zawm)a() };
    }
    float f1 = b(paramFloat);
    float f2 = c(b());
    float f3 = (paramFloat - f2 + 360.0F) % 360.0F;
    zawm localzawm1 = new zawm(f(), g(), f2, f3, this.u, this.v, this.w);
    localzawm1.a(this.A);
    localzawm1.a(true, false);
    f3 = c(d()) - paramFloat;
    zawm localzawm2 = new zawm(f(), g(), paramFloat, f3, this.u, this.v, this.w);
    localzawm2.a(this.A);
    localzawm2.a(false, true);
    return new zawm[] { localzawm1, localzawm2 };
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    c(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
  }
  
  void b(zr paramzr)
    throws Exception
  {
    if (this.q != null) {
      if ((b() > 90.0F) && (b() < 270.0F)) {
        this.q.a(paramzr, this.j, this.g, this.A);
      } else {
        this.q.a(paramzr, this.j, this.e, this.A);
      }
    }
  }
  
  void c(zr paramzr)
    throws Exception
  {
    if (this.r != null) {
      if ((d() > 90.0F) && (d() < 270.0F)) {
        this.r.a(paramzr, this.j, this.e, this.A);
      } else {
        this.r.a(paramzr, this.j, this.h, this.A);
      }
    }
  }
  
  void d(zr paramzr)
    throws Exception
  {
    za[] arrayOfza1 = l();
    for (za localza : arrayOfza1) {
      a(paramzr, this.j, this.i, localza.a(), localza.b(), localza.c(), localza.d());
    }
  }
  
  void e(zr paramzr)
    throws Exception
  {
    za[] arrayOfza1 = m();
    for (za localza : arrayOfza1) {
      a(paramzr, this.j, this.e, localza.a(), localza.b(), localza.c(), localza.d());
    }
  }
  
  void f(zr paramzr)
    throws Exception
  {
    com.aspose.cells.b.a.b.zc localzc = this.e;
    zs localzs = this.j;
    ze localze = new ze();
    localze.b(this.a.f(), this.a.g() + this.b, this.a.h(), this.a.i(), this.c, this.d);
    if ((this.A != null) && (this.A.i().f())) {
      localzc = zbd.a(this.A.i(), zn.a(localze));
    }
    paramzr.a(localzc, localze);
    paramzr.a(localzs, localze);
  }
  
  void g(zr paramzr)
    throws Exception
  {
    com.aspose.cells.b.a.b.zc localzc = this.e;
    zs localzs1 = this.j;
    ze localze = new ze();
    localze.b(this.a.f(), this.a.g(), this.a.h(), this.a.i(), this.c, this.d);
    if ((this.A != null) && (this.A.i().f())) {
      localzc = zbd.a(this.A.i(), zn.a(localze));
    }
    paramzr.a(localzc, localze);
    if (localzs1.c().getA() != 0)
    {
      paramzr.a(localzs1, localze);
    }
    else
    {
      zs localzs2 = new zs(localzc, 1.0F);
      try
      {
        paramzr.a(localzs2, localze);
      }
      finally
      {
        if (localzs2 != null) {
          localzs2.s();
        }
      }
    }
  }
  
  zq h()
  {
    zq localzq = new zq(this.m.d(), this.m.e(), 0.0F, 0.0F);
    if ((this.c == 0.0F) || (this.c + this.d >= 360.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaeh.a(arrayOfzq, this.a.l());
      localzq = arrayOfzq[0];
    }
    if (((this.c <= 90.0F) && (this.c + this.d >= 90.0F)) || (this.c + this.d >= 450.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaeh.b(arrayOfzq, this.a.m() + g());
      localzq = arrayOfzq[0];
    }
    if (((this.c <= 180.0F) && (this.c + this.d >= 180.0F)) || (this.c + this.d >= 540.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaeh.a(arrayOfzq, this.a.j());
      localzq = arrayOfzq[0];
    }
    if (((this.c <= 270.0F) && (this.c + this.d >= 270.0F)) || (this.c + this.d >= 630.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaeh.b(arrayOfzq, this.a.k());
      localzq = arrayOfzq[0];
    }
    zq[] arrayOfzq = { localzq };
    zaeh.a(arrayOfzq, this.k);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaeh.a(arrayOfzq, this.l);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaeh.a(arrayOfzq, this.m);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaeh.a(arrayOfzq, this.n);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaeh.a(arrayOfzq, this.o);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaeh.a(arrayOfzq, this.p);
    localzq = arrayOfzq[0];
    return localzq;
  }
  
  zke i()
  {
    return this.A;
  }
  
  void a(zke paramzke)
  {
    this.A = paramzke;
  }
  
  protected void a(Color paramColor, int paramInt)
  {
    this.e = new zu(paramColor);
    this.f = new zu(zll.a(paramColor, zll.a));
    switch (paramInt)
    {
    case 0: 
      Color localColor = Color.fromArgb((paramColor.getR() & 0xFF) / 2, (paramColor.getG() & 0xFF) / 2, (paramColor.getB() & 0xFF) / 2);
      this.g = (this.h = this.i = new zu(localColor));
      break;
    case 1: 
      this.g = (this.h = this.i = new zu(zll.a(paramColor, -zll.a)));
      break;
    case 2: 
      double d1 = this.c - 180.0F - z;
      if (d1 < 0.0D) {
        d1 += 360.0D;
      }
      this.g = a(paramColor, d1);
      d1 = this.c + this.d - z;
      if (d1 < 0.0D) {
        d1 += 360.0D;
      }
      this.h = a(paramColor, d1);
      this.i = a(paramColor);
    }
  }
  
  protected void j()
  {
    this.e.h();
    this.g.h();
    this.h.h();
    this.i.h();
    this.f.h();
  }
  
  protected com.aspose.cells.b.a.b.zc a(Color paramColor, double paramDouble)
  {
    return new zu(zll.a(paramColor, -(float)(zll.a * (1.0D - 0.8D * Math.cos(paramDouble * 3.141592653589793D / 180.0D)))));
  }
  
  protected com.aspose.cells.b.a.b.zc a(Color paramColor)
  {
    com.aspose.cells.b.a.b.a.zc localzc = new com.aspose.cells.b.a.b.a.zc();
    localzc.a(new Color[] { zll.a(paramColor, -zll.a / 2.0F), paramColor, zll.a(paramColor, -zll.a) });
    localzc.a(new float[] { 0.0F, 0.1F, 1.0F });
    zh localzh = new zh(this.a, Color.getBlue(), Color.getWhite(), 0);
    localzh.a(localzc);
    return localzh;
  }
  
  protected void a(zr paramzr, zs paramzs, com.aspose.cells.b.a.b.zc paramzc, float paramFloat1, float paramFloat2, zo paramzo1, zo paramzo2)
    throws Exception
  {
    ze localze = a(paramFloat1, paramFloat2, paramzo1, paramzo2);
    if ((this.A != null) && (this.A.i().f())) {
      paramzc = zbd.a(this.A.i(), zn.a(localze), 0.5F);
    }
    if (this.A.i().h() != 0) {
      paramzr.a(paramzc, localze);
    }
    if (this.A.k().e()) {
      paramzr.a(paramzs, localze);
    }
  }
  
  protected float b(float paramFloat)
  {
    double d1 = this.a.h() * Math.cos(paramFloat * 3.141592653589793D / 180.0D);
    double d2 = this.a.i() * Math.sin(paramFloat * 3.141592653589793D / 180.0D);
    float f1 = (float)(Math.atan2(d2, d1) * 180.0D / 3.141592653589793D);
    if (f1 < 0.0F) {
      return f1 + 360.0F;
    }
    return f1;
  }
  
  protected float c(float paramFloat)
  {
    double d1 = this.a.i() * Math.cos(paramFloat * 3.141592653589793D / 180.0D);
    double d2 = this.a.h() * Math.sin(paramFloat * 3.141592653589793D / 180.0D);
    float f1 = (float)(Math.atan2(d2, d1) * 180.0D / 3.141592653589793D);
    if (f1 < 0.0F) {
      return f1 + 360.0F;
    }
    return f1;
  }
  
  protected zo b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    double d1 = paramFloat5 * 3.141592653589793D / 180.0D;
    return new zo(paramFloat1 + (float)(paramFloat3 * Math.cos(d1)), paramFloat2 + (float)(paramFloat4 * Math.sin(d1)));
  }
  
  private void c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.a = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    this.b = paramFloat5;
    this.c = b(this.s);
    this.d = this.t;
    if (this.d % 180.0F != 0.0F) {
      this.d = (b(this.s + this.t) - this.c);
    }
    if (this.d < 0.0F) {
      this.d += 360.0F;
    }
    a(this.u, this.v);
    float f1 = paramFloat1 + paramFloat3 / 2.0F;
    float f2 = paramFloat2 + paramFloat4 / 2.0F;
    this.k = new zo(f1, f2);
    this.l = new zo(f1, f2 + paramFloat5);
    this.m = b(f1, f2, paramFloat3 / 2.0F, paramFloat4 / 2.0F, this.s);
    this.n = new zo(this.m.d(), this.m.e() + paramFloat5);
    this.o = b(f1, f2, paramFloat3 / 2.0F, paramFloat4 / 2.0F, this.s + this.t);
    this.p = new zo(this.o.d(), this.o.e() + paramFloat5);
    k();
  }
  
  private void k()
  {
    a(true, true);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      this.q = new zayc(this.k, this.m, this.n, this.l, this.d != 180.0F);
    } else {
      this.q = zayc.a;
    }
    if (paramBoolean2) {
      this.r = new zayc(this.k, this.o, this.p, this.l, this.d != 180.0F);
    } else {
      this.r = zayc.a;
    }
  }
  
  private za[] l()
  {
    ArrayList localArrayList = new ArrayList();
    if ((this.d != 0.0F) && ((this.c < 180.0F) || (this.c + this.d > 360.0F)))
    {
      float f1;
      zo localzo1;
      float f2;
      zo localzo2;
      if (b() < 180.0F)
      {
        f1 = this.c;
        localzo1 = new zo(this.m.d(), this.m.e());
        f2 = d();
        localzo2 = new zo(this.o.d(), this.o.e());
        if (this.c + this.d > 180.0F)
        {
          f2 = 180.0F;
          localzo2.a(this.a.f());
          localzo2.b(this.k.e());
        }
        zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      }
      if (this.c + this.d > 360.0F)
      {
        f1 = 0.0F;
        localzo1 = new zo(this.a.l(), this.k.e());
        f2 = d();
        localzo2 = new zo(this.o.d(), this.o.e());
        if (f2 > 180.0F)
        {
          f2 = 180.0F;
          localzo2.a(this.a.j());
          localzo2.b(this.k.e());
        }
        zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      }
    }
    return (za[])zf.a(localArrayList, za.class);
  }
  
  private za[] m()
  {
    ArrayList localArrayList = new ArrayList();
    if ((this.d != 0.0F) && ((this.c < 0.0F) || (this.c + this.d > 180.0F)) && (this.c + this.d > 180.0F))
    {
      float f1 = this.c;
      zo localzo1 = new zo(this.m.d(), this.m.e());
      float f2 = this.c + this.d;
      zo localzo2 = new zo(this.o.d(), this.o.e());
      if (f1 < 180.0F)
      {
        f1 = 180.0F;
        localzo1.a(this.a.j());
        localzo1.b(this.k.e());
      }
      if (f2 > 360.0F)
      {
        f2 = 360.0F;
        localzo2.a(this.a.l());
        localzo2.b(this.k.e());
      }
      zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      if ((this.c < 360.0F) && (this.c + this.d > 540.0F))
      {
        f1 = 180.0F;
        localzo1 = new zo(this.a.j(), this.k.e());
        f2 = d();
        localzo2 = new zo(this.o.d(), this.o.e());
        zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      }
    }
    return (za[])zf.a(localArrayList, za.class);
  }
  
  private ze a(float paramFloat1, float paramFloat2, zo paramzo1, zo paramzo2)
  {
    ze localze = new ze();
    localze.a(this.a, paramFloat1, paramFloat2 - paramFloat1);
    localze.b(paramzo2.d(), paramzo2.e(), paramzo2.d(), paramzo2.e() + this.b);
    localze.a(this.a.f(), this.a.g() + this.b, this.a.h(), this.a.i(), paramFloat2, paramFloat1 - paramFloat2);
    localze.b(paramzo1.d(), paramzo1.e() + this.b, paramzo1.d(), paramzo1.e());
    localze.j();
    return localze;
  }
  
  private final class za
  {
    private float b;
    private float c;
    private zo d;
    private zo e;
    
    public za(float paramFloat1, float paramFloat2, zo paramzo1, zo paramzo2)
    {
      this.b = paramFloat1;
      this.c = paramFloat2;
      this.d = paramzo1;
      this.e = paramzo2;
    }
    
    public float a()
    {
      return this.b;
    }
    
    public float b()
    {
      return this.c;
    }
    
    public zo c()
    {
      return this.d;
    }
    
    public zo d()
    {
      return this.e;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */