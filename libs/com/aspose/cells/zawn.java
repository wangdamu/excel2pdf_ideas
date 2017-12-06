package com.aspose.cells;

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
import java.util.Iterator;

class zawn
  implements zj
{
  private float u;
  boolean a = false;
  boolean b = false;
  protected zq c;
  protected float d;
  protected float e;
  protected float f;
  private float v;
  private float w;
  private Color x = Color.getEmpty();
  private int y = 0;
  private int z = 0;
  protected com.aspose.cells.b.a.b.zc g = null;
  protected com.aspose.cells.b.a.b.zc h = null;
  protected com.aspose.cells.b.a.b.zc i = null;
  protected com.aspose.cells.b.a.b.zc j = null;
  protected com.aspose.cells.b.a.b.zc k = null;
  protected zs l = null;
  protected zo m;
  protected zo n;
  protected zo o;
  protected zo p;
  protected zo q;
  protected zo r;
  protected zayd s = zayd.a;
  protected zayd t = zayd.a;
  private String A;
  private boolean B = false;
  private static float C = 20.0F;
  private zkf D = null;
  
  protected zawn() {}
  
  public zawn(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2)
  {
    this();
    this.v = paramFloat6;
    this.w = paramFloat7;
    this.x = paramColor;
    this.y = paramInt1;
    this.z = paramInt2;
    Color localColor = zte.a(paramInt2, paramColor);
    this.l = new zs(localColor);
    this.l.d(2);
    c(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
  }
  
  public zawn(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8, zkf paramzkf)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramColor, paramInt1, paramInt2, paramFloat8);
    this.D = paramzkf;
    if (paramzkf != null)
    {
      zq localzq = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      ze localze = new ze();
      localze.b(localzq);
      this.l = paramzkf.k().b(localze);
    }
  }
  
  public zawn(zq paramzq, float paramFloat1, float paramFloat2, float paramFloat3, Color paramColor, int paramInt1, int paramInt2, float paramFloat4, zkf paramzkf)
  {
    this(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramFloat1, paramFloat2, paramFloat3, paramColor, paramInt1, paramInt2, paramFloat4, paramzkf);
  }
  
  public zawn(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramColor, paramInt1, paramInt2);
    this.l.b(paramFloat8);
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
    if (!this.B)
    {
      if (paramBoolean)
      {
        this.l.dispose();
        m();
        this.s.dispose();
        this.t.dispose();
      }
      this.B = true;
    }
  }
  
  public Object a()
  {
    zawn localzawn = new zawn(i(), j(), b(), c(), this.x, this.y, this.z, this.l.p(), this.D);
    return localzawn;
  }
  
  public zawn a(float paramFloat)
  {
    zawn localzawn = new zawn(i(), j(), this.v + paramFloat, this.w, this.x, this.y, this.z, this.l.p(), this.D);
    return localzawn;
  }
  
  public float b()
  {
    return this.e;
  }
  
  public float c()
  {
    return this.f;
  }
  
  public float d()
  {
    return this.u;
  }
  
  public void b(float paramFloat)
  {
    this.u = paramFloat;
  }
  
  public float e()
  {
    return (this.e + this.f) % 360.0F;
  }
  
  float f()
  {
    return this.v;
  }
  
  float g()
  {
    return this.w;
  }
  
  public String h()
  {
    return this.A;
  }
  
  public void a(String paramString)
  {
    this.A = paramString;
  }
  
  public zo a(float paramFloat, float[] paramArrayOfFloat)
  {
    zo localzo = zo.a();
    if (c() >= 180.0F)
    {
      paramArrayOfFloat[0] = (e(b()) + c() / 2.0F);
      localzo = b(this.m.d(), this.m.e(), this.c.h() * paramFloat, this.c.i() * paramFloat, paramArrayOfFloat[0]);
    }
    else
    {
      float f1 = (this.o.d() + this.q.d()) / 2.0F;
      float f2 = (this.o.e() + this.q.e()) / 2.0F;
      float f3 = (float)(Math.atan2(f2 - this.m.e(), f1 - this.m.d()) * 180.0D / 3.141592653589793D);
      paramArrayOfFloat[0] = e(f3);
      localzo = b(this.m.d(), this.m.e(), this.c.h() * paramFloat, this.c.i() * paramFloat, paramArrayOfFloat[0]);
    }
    paramArrayOfFloat[0] %= 360.0F;
    if (paramArrayOfFloat[0] < 0.0F) {
      paramArrayOfFloat[0] += 360.0F;
    }
    return localzo;
  }
  
  zq i()
  {
    return this.c;
  }
  
  float j()
  {
    return this.d;
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
  
  zawn[] c(float paramFloat)
  {
    if ((b() == paramFloat) || (e() == paramFloat)) {
      return new zawn[] { (zawn)a() };
    }
    float f1 = d(paramFloat);
    float f2 = e(b());
    float f3 = (paramFloat - f2 + 360.0F) % 360.0F;
    zawn localzawn1 = new zawn(i(), j(), f2, f3, this.x, this.y, this.z, this.l.p(), this.D);
    localzawn1.b(c());
    localzawn1.a = true;
    if (c() == 360.0F) {
      localzawn1.a(false, false);
    } else {
      localzawn1.a(true, false);
    }
    f3 = e(e()) - paramFloat;
    zawn localzawn2 = new zawn(i(), j(), paramFloat, f3, this.x, this.y, this.z, this.l.p(), this.D);
    localzawn2.b(c());
    localzawn2.a = true;
    if (c() == 360.0F) {
      localzawn2.a(false, false);
    } else {
      localzawn2.a(false, true);
    }
    return new zawn[] { localzawn1, localzawn2 };
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    c(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
  }
  
  void b(zr paramzr)
    throws Exception
  {
    if (this.s != null) {
      if ((b() > 90.0F) && (b() < 270.0F)) {
        this.s.a(paramzr, this.l, this.i, this.D);
      } else {
        this.s.a(paramzr, this.l, this.g, this.D);
      }
    }
  }
  
  void c(zr paramzr)
    throws Exception
  {
    if (this.t != null) {
      if ((e() > 90.0F) && (e() < 270.0F)) {
        this.t.a(paramzr, this.l, this.g, this.D);
      } else {
        this.t.a(paramzr, this.l, this.j, this.D);
      }
    }
  }
  
  void d(zr paramzr)
    throws Exception
  {
    za[] arrayOfza1 = o();
    for (za localza : arrayOfza1) {
      a(paramzr, this.l, this.k, localza.a(), localza.b(), localza.c(), localza.d());
    }
  }
  
  void e(zr paramzr)
    throws Exception
  {
    za[] arrayOfza1 = p();
    for (za localza : arrayOfza1) {
      a(paramzr, this.l, this.g, localza.a(), localza.b(), localza.c(), localza.d());
    }
  }
  
  void f(zr paramzr)
    throws Exception
  {
    com.aspose.cells.b.a.b.zc localzc = this.g;
    zs localzs = this.l;
    ze localze;
    if (this.D != null)
    {
      localze = new ze();
      localze.b(this.c.f(), this.c.g(), this.c.h(), this.c.i(), this.e, this.f);
      this.D.i().a(localze);
    }
    if (this.D != null)
    {
      localze = new ze();
      if (this.f == 360.0F) {
        localze.a(this.c.f(), this.c.g(), this.c.h(), this.c.i(), this.e, this.f);
      } else {
        localze.b(this.c.f(), this.c.g(), this.c.h(), this.c.i(), this.e, this.f);
      }
      this.D.k().a(localze);
    }
  }
  
  void g(zr paramzr)
    throws Exception
  {
    com.aspose.cells.b.a.b.zc localzc1 = this.g;
    zs localzs1 = this.l;
    com.aspose.cells.b.a.b.zc localzc2 = null;
    ze localze;
    if (this.D != null)
    {
      localze = new ze();
      localze.b(this.c.f(), this.c.g(), this.c.h(), this.c.i(), this.e, this.f);
      localzc2 = this.D.i().b(localze);
      this.D.i().a(localze);
    }
    if (this.D != null)
    {
      localze = new ze();
      if (this.f == 360.0F) {
        localze.a(this.c.f(), this.c.g(), this.c.h(), this.c.i(), this.e, this.f);
      } else {
        localze.b(this.c.f(), this.c.g(), this.c.h(), this.c.i(), this.e, this.f);
      }
      if (this.D.k().b(localze).c().getA() != 0)
      {
        this.D.k().a(localze);
      }
      else if (localzc2 != null)
      {
        zs localzs2 = new zs(localzc2, 1.0F);
        if (localzs2 != null) {
          localzs2.s();
        }
      }
    }
  }
  
  zq k()
  {
    zq localzq = new zq(this.o.d(), this.o.e(), 0.0F, 0.0F);
    if ((this.e == 0.0F) || (this.e + this.f >= 360.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaei.a(arrayOfzq, this.c.l());
      localzq = arrayOfzq[0];
    }
    if (((this.e <= 90.0F) && (this.e + this.f >= 90.0F)) || (this.e + this.f >= 450.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaei.b(arrayOfzq, this.c.m() + j());
      localzq = arrayOfzq[0];
    }
    if (((this.e <= 180.0F) && (this.e + this.f >= 180.0F)) || (this.e + this.f >= 540.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaei.a(arrayOfzq, this.c.j());
      localzq = arrayOfzq[0];
    }
    if (((this.e <= 270.0F) && (this.e + this.f >= 270.0F)) || (this.e + this.f >= 630.0F))
    {
      arrayOfzq = new zq[] { localzq };
      zaei.b(arrayOfzq, this.c.k());
      localzq = arrayOfzq[0];
    }
    zq[] arrayOfzq = { localzq };
    zaei.a(arrayOfzq, this.m);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaei.a(arrayOfzq, this.n);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaei.a(arrayOfzq, this.o);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaei.a(arrayOfzq, this.p);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaei.a(arrayOfzq, this.q);
    localzq = arrayOfzq[0];
    arrayOfzq[0] = localzq;
    zaei.a(arrayOfzq, this.r);
    localzq = arrayOfzq[0];
    return localzq;
  }
  
  zkf l()
  {
    return this.D;
  }
  
  protected void a(Color paramColor, int paramInt)
  {
    this.g = new zu(paramColor);
    this.h = new zu(zlm.a(paramColor, zlm.a));
    switch (paramInt)
    {
    case 0: 
      Color localColor = Color.fromArgb((paramColor.getR() & 0xFF) / 2, (paramColor.getG() & 0xFF) / 2, (paramColor.getB() & 0xFF) / 2);
      this.i = (this.j = this.k = new zu(localColor));
      break;
    case 1: 
      this.i = (this.j = this.k = new zu(zlm.a(paramColor, -zlm.a)));
      break;
    case 2: 
      double d1 = this.e - 180.0F - C;
      if (d1 < 0.0D) {
        d1 += 360.0D;
      }
      this.i = a(paramColor, d1);
      d1 = this.e + this.f - C;
      if (d1 < 0.0D) {
        d1 += 360.0D;
      }
      this.j = a(paramColor, d1);
      this.k = a(paramColor);
    }
  }
  
  protected void m()
  {
    this.g.h();
    this.i.h();
    this.j.h();
    this.k.h();
    this.h.h();
  }
  
  protected com.aspose.cells.b.a.b.zc a(Color paramColor, double paramDouble)
  {
    return new zu(zlm.a(paramColor, -(float)(zlm.a * (1.0D - 0.8D * Math.cos(paramDouble * 3.141592653589793D / 180.0D)))));
  }
  
  protected com.aspose.cells.b.a.b.zc a(Color paramColor)
  {
    com.aspose.cells.b.a.b.a.zc localzc = new com.aspose.cells.b.a.b.a.zc();
    localzc.a(new Color[] { zlm.a(paramColor, -zlm.a / 2.0F), paramColor, zlm.a(paramColor, -zlm.a) });
    localzc.a(new float[] { 0.0F, 0.1F, 1.0F });
    zh localzh = new zh(this.c, Color.getBlue(), Color.getWhite(), 0);
    localzh.a(localzc);
    return localzh;
  }
  
  protected void a(zr paramzr, zs paramzs, com.aspose.cells.b.a.b.zc paramzc, float paramFloat1, float paramFloat2, zo paramzo1, zo paramzo2)
    throws Exception
  {
    float f1 = 0.5F;
    Object localObject1;
    Object localObject2;
    if (this.D != null)
    {
      localObject1 = b(paramFloat1, paramFloat2, paramzo1, paramzo2);
      if (this.a)
      {
        localObject2 = a(paramFloat1, paramFloat2, paramzo1, paramzo2);
        this.D.i().a((ze)localObject1, f1, (ze)localObject2);
      }
      else
      {
        this.D.i().a((ze)localObject1, f1);
      }
    }
    if (this.D != null)
    {
      localObject1 = a(paramFloat1, paramFloat2, paramzo1, paramzo2, d());
      localObject2 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ze localze = (ze)((Iterator)localObject2).next();
        this.D.k().a(localze);
      }
    }
  }
  
  protected float d(float paramFloat)
  {
    double d1 = this.c.h() * Math.cos(paramFloat * 3.141592653589793D / 180.0D);
    double d2 = this.c.i() * Math.sin(paramFloat * 3.141592653589793D / 180.0D);
    float f1 = (float)(Math.atan2(d2, d1) * 180.0D / 3.141592653589793D);
    if (f1 < 0.0F) {
      return f1 + 360.0F;
    }
    return f1;
  }
  
  protected float e(float paramFloat)
  {
    double d1 = this.c.i() * Math.cos(paramFloat * 3.141592653589793D / 180.0D);
    double d2 = this.c.h() * Math.sin(paramFloat * 3.141592653589793D / 180.0D);
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
    this.c = new zq(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    this.d = paramFloat5;
    this.e = d(this.v);
    this.f = this.w;
    if (this.f % 180.0F != 0.0F) {
      this.f = (d(this.v + this.w) - this.e);
    }
    if (this.f < 0.0F) {
      this.f += 360.0F;
    }
    a(this.x, this.y);
    float f1 = paramFloat1 + paramFloat3 / 2.0F;
    float f2 = paramFloat2 + paramFloat4 / 2.0F;
    this.m = new zo(f1, f2);
    this.n = new zo(f1, f2 + paramFloat5);
    this.o = b(f1, f2, paramFloat3 / 2.0F, paramFloat4 / 2.0F, this.v);
    this.p = new zo(this.o.d(), this.o.e() + paramFloat5);
    this.q = b(f1, f2, paramFloat3 / 2.0F, paramFloat4 / 2.0F, this.v + this.w);
    this.r = new zo(this.q.d(), this.q.e() + paramFloat5);
    n();
  }
  
  private void n()
  {
    a(true, true);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      this.s = new zayd(this.m, this.o, this.p, this.n, this.f != 180.0F);
    } else {
      this.s = zayd.a;
    }
    if (paramBoolean2) {
      this.t = new zayd(this.m, this.q, this.r, this.n, this.f != 180.0F);
    } else {
      this.t = zayd.a;
    }
  }
  
  private za[] o()
  {
    ArrayList localArrayList = new ArrayList();
    if ((this.f != 0.0F) && ((this.e < 180.0F) || (this.e + this.f > 360.0F)))
    {
      float f1;
      zo localzo1;
      float f2;
      zo localzo2;
      if (b() < 180.0F)
      {
        f1 = this.e;
        localzo1 = new zo(this.o.d(), this.o.e());
        f2 = e();
        localzo2 = new zo(this.q.d(), this.q.e());
        if (this.e + this.f > 180.0F)
        {
          f2 = 180.0F;
          localzo2.a(this.c.f());
          localzo2.b(this.m.e());
        }
        zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      }
      if (this.e + this.f > 360.0F)
      {
        f1 = 0.0F;
        localzo1 = new zo(this.c.l(), this.m.e());
        f2 = e();
        localzo2 = new zo(this.q.d(), this.q.e());
        if (f2 > 180.0F)
        {
          f2 = 180.0F;
          localzo2.a(this.c.j());
          localzo2.b(this.m.e());
        }
        zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      }
    }
    return (za[])zf.a(localArrayList, za.class);
  }
  
  private za[] p()
  {
    ArrayList localArrayList = new ArrayList();
    if ((this.f != 0.0F) && ((this.e < 0.0F) || (this.e + this.f > 180.0F)) && (this.e + this.f > 180.0F))
    {
      float f1 = this.e;
      zo localzo1 = new zo(this.o.d(), this.o.e());
      float f2 = this.e + this.f;
      zo localzo2 = new zo(this.q.d(), this.q.e());
      if (f1 < 180.0F)
      {
        f1 = 180.0F;
        localzo1.a(this.c.j());
        localzo1.b(this.m.e());
      }
      if (f2 > 360.0F)
      {
        f2 = 360.0F;
        localzo2.a(this.c.l());
        localzo2.b(this.m.e());
      }
      zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      if ((this.e < 360.0F) && (this.e + this.f > 540.0F))
      {
        f1 = 180.0F;
        localzo1 = new zo(this.c.j(), this.m.e());
        f2 = e();
        localzo2 = new zo(this.q.d(), this.q.e());
        zf.a(localArrayList, new za(f1, f2, localzo1, localzo2));
      }
    }
    return (za[])zf.a(localArrayList, za.class);
  }
  
  private ze a(float paramFloat1, float paramFloat2, zo paramzo1, zo paramzo2)
  {
    ze localze = new ze();
    localze.a(this.c, paramFloat1, d());
    localze.a(this.c.f(), this.c.g() + this.d, this.c.h(), this.c.i(), paramFloat2, -d());
    return localze;
  }
  
  private ze b(float paramFloat1, float paramFloat2, zo paramzo1, zo paramzo2)
  {
    ze localze = new ze();
    localze.a(this.c, paramFloat1, paramFloat2 - paramFloat1);
    localze.b(paramzo2.d() + 1.0E-4F, paramzo2.e(), paramzo2.d(), paramzo2.e() + this.d);
    localze.a(this.c.f(), this.c.g() + this.d, this.c.h(), this.c.i(), paramFloat2, paramFloat1 - paramFloat2);
    localze.b(paramzo1.d() + 1.0E-4F, paramzo1.e() + this.d, paramzo1.d(), paramzo1.e());
    localze.j();
    return localze;
  }
  
  private ArrayList a(float paramFloat1, float paramFloat2, zo paramzo1, zo paramzo2, float paramFloat3)
  {
    ArrayList localArrayList = new ArrayList();
    ze localze1;
    if (paramFloat3 != 360.0F)
    {
      localze1 = new ze();
      localze1.a(this.c, paramFloat1, paramFloat2 - paramFloat1);
      localze1.b(paramzo2.d(), paramzo2.e(), paramzo2.d(), paramzo2.e() + this.d);
      localze1.a(this.c.f(), this.c.g() + this.d, this.c.h(), this.c.i(), paramFloat2, paramFloat1 - paramFloat2);
      localze1.b(paramzo1.d(), paramzo1.e() + this.d, paramzo1.d(), paramzo1.e());
      zf.a(localArrayList, localze1);
    }
    else
    {
      localze1 = new ze();
      localze1.a(this.c, paramFloat1, paramFloat2 - paramFloat1);
      zf.a(localArrayList, localze1);
      ze localze2 = new ze();
      localze2.a(this.c.f(), this.c.g() + this.d, this.c.h(), this.c.i(), paramFloat2, paramFloat1 - paramFloat2);
      zf.a(localArrayList, localze2);
      int i1 = (int)com.aspose.cells.b.a.zr.a(paramFloat1, 1);
      if (i1 % 180 == 0)
      {
        ze localze3 = new ze();
        localze3.b(paramzo1.d(), paramzo1.e() + this.d, paramzo1.d(), paramzo1.e());
        zf.a(localArrayList, localze3);
      }
      int i2 = (int)com.aspose.cells.b.a.zr.a(paramFloat2, 1);
      if (i2 % 180 == 0)
      {
        ze localze4 = new ze();
        localze4.b(paramzo2.d(), paramzo2.e(), paramzo2.d(), paramzo2.e() + this.d);
        zf.a(localArrayList, localze4);
      }
    }
    return localArrayList;
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */