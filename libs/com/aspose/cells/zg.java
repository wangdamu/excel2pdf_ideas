package com.aspose.cells;

import com.aspose.cells.a.d.za;
import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.a.d.zk;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.a.d.zu;
import com.aspose.cells.a.d.zx;
import com.aspose.cells.a.d.zy;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.util.Stack;

abstract class zg
  implements zr
{
  protected int a = 1;
  protected zaec b;
  protected Stack c;
  protected Stack d;
  protected zb e;
  protected zb f;
  protected int g;
  protected float h;
  protected int i;
  protected int j;
  protected int k;
  protected int l;
  protected ImageFormat m;
  protected ImageOrPrintOptions n;
  protected zm o;
  protected zbic p;
  protected float q = 96.0F;
  protected float r = 96.0F;
  protected zaeg s = null;
  protected zwf t = new zwg();
  protected zhb u;
  private zi v;
  
  zg() {}
  
  public zg(int paramInt1, int paramInt2, ImageFormat paramImageFormat, ImageOrPrintOptions paramImageOrPrintOptions, zm paramzm, zbic paramzbic, zhb paramzhb)
  {
    if (paramImageOrPrintOptions == null) {
      this.n = new ImageOrPrintOptions();
    } else {
      this.n = paramImageOrPrintOptions;
    }
    this.k = paramInt1;
    this.l = paramInt2;
    this.m = paramImageFormat;
    this.o = paramzm;
    this.p = paramzbic;
    this.u = paramzhb;
    this.b = new zaec();
    b(3);
    c(0);
    this.g = 2;
    this.h = 1.0F;
    this.i = 4;
    this.j = 0;
    float f1 = zbxp.a();
    this.q = f1;
    this.r = f1;
    this.c = new Stack();
    n();
    if (this.p != null) {
      this.p.a(this);
    }
  }
  
  private void n()
  {
    this.d = new Stack();
    this.e = new zb();
    zi localzi = new zi();
    localzi.a((float)(1.0D / this.a), (float)(1.0D / this.a));
    this.e.a(localzi);
    this.f = new zb();
    this.e.a(this.f);
  }
  
  public zaeg a()
  {
    return this.s;
  }
  
  public void a(zaeg paramzaeg)
  {
    this.s = paramzaeg;
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq, String paramString)
  {
    zb localzb = new zb();
    localzb.a(this.b.b().b());
    zk localzk = new zk(new com.aspose.cells.b.a.b.zq(b(paramzq.f()), b(paramzq.g()), b(paramzq.h()), b(paramzq.i())), zw.a(paramString, "\\", "/"));
    localzb.a(localzk);
    this.f.a(localzb);
  }
  
  public void b()
    throws Exception
  {
    this.s.dispose();
  }
  
  public void dispose()
    throws Exception
  {
    b();
  }
  
  public void a(zs paramzs, com.aspose.cells.b.a.b.zq paramzq, float paramFloat1, float paramFloat2)
  {
    a(paramzs, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramFloat1, paramFloat2);
  }
  
  public void a(zs paramzs, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    if (a(paramzs))
    {
      zavv localzavv = b(paramzs);
      this.t.a(this, localzavv.a(), localzavv.b(), localzavv.c(), paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    }
    else
    {
      a(paramzs, null, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    }
  }
  
  public void a(zs paramzs, zo[] paramArrayOfzo)
  {
    a(paramzs, paramArrayOfzo, 0.5F);
  }
  
  public void a(zs paramzs, zo[] paramArrayOfzo, float paramFloat)
  {
    a(paramzs, paramArrayOfzo, 0, paramArrayOfzo.length - 1, paramFloat);
  }
  
  public void a(zs paramzs, zo[] paramArrayOfzo, int paramInt1, int paramInt2, float paramFloat)
  {
    if (a(paramzs))
    {
      zavv localzavv = b(paramzs);
      this.t.a(this, localzavv.a(), localzavv.b(), localzavv.c(), paramArrayOfzo, paramInt1, paramInt2, paramFloat);
    }
    else
    {
      a(paramzs, paramArrayOfzo, paramInt1, paramInt2, paramFloat, false);
    }
  }
  
  public void a(zs paramzs, com.aspose.cells.b.a.b.zq paramzq)
  {
    a(paramzs, null, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public void a(zs paramzs, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(paramzs, null, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void a(zj paramzj, com.aspose.cells.b.a.b.zp paramzp, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    a(paramzj, paramzp, (int)paramFloat1, (int)paramFloat2, (int)paramFloat3, (int)paramFloat4, paramInt);
  }
  
  public abstract void a(zj paramzj, com.aspose.cells.b.a.b.zp paramzp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public void a(zj paramzj, com.aspose.cells.b.a.b.zq paramzq1, com.aspose.cells.b.a.b.zq paramzq2, int paramInt)
  {
    a(paramzj, new com.aspose.cells.b.a.b.zp((int)paramzq1.f(), (int)paramzq1.g(), (int)paramzq1.h(), (int)paramzq1.i()), paramzq2.f(), paramzq2.g(), paramzq2.h(), paramzq2.i(), paramInt);
  }
  
  public void a(zj paramzj, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramInt2, paramInt3, paramInt4, paramzj);
  }
  
  public void a(zj paramzj, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramzj);
  }
  
  public void a(zs paramzs, zo paramzo1, zo paramzo2)
  {
    b(paramzs, paramzo1.d(), paramzo1.e(), paramzo2.d(), paramzo2.e());
  }
  
  public void b(zs paramzs, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (a(paramzs))
    {
      zavv localzavv = b(paramzs);
      this.t.a(this, localzavv.a(), localzavv.b(), localzavv.c(), paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    }
    else
    {
      d(paramzs, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    }
  }
  
  public void b(zs paramzs, zo[] paramArrayOfzo)
  {
    ze localze = new ze();
    localze.a(paramArrayOfzo);
    a(paramzs, localze);
  }
  
  public void a(zs paramzs, ze paramze)
  {
    if (a(paramzs))
    {
      zavv localzavv = b(paramzs);
      this.t.a(this, localzavv.a(), localzavv.b(), localzavv.c(), paramze);
    }
    else
    {
      a(paramzs, null, paramze);
    }
  }
  
  public void b(zs paramzs, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    b(paramzs, null, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void c(zs paramzs, zo[] paramArrayOfzo)
  {
    if ((paramArrayOfzo == null) || (paramArrayOfzo.length == 0)) {
      return;
    }
    float[] arrayOfFloat = new float[paramArrayOfzo.length * 2];
    for (int i1 = 0; i1 < paramArrayOfzo.length; i1++)
    {
      arrayOfFloat[(i1 * 2)] = paramArrayOfzo[i1].d();
      arrayOfFloat[(i1 * 2 + 1)] = paramArrayOfzo[i1].e();
    }
    a(paramzs, null, arrayOfFloat, 0);
  }
  
  public void a(zs paramzs, com.aspose.cells.b.a.b.zp paramzp)
  {
    b(paramzs, null, paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
  }
  
  public void a(zs paramzs, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b(paramzs, null, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void c(zs paramzs, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    b(paramzs, null, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, zo paramzo)
  {
    a(paramString, paramzg, paramzc, paramzo.d(), paramzo.e(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, null);
  }
  
  public void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, com.aspose.cells.b.a.b.zq paramzq)
  {
    a(paramString, paramzg, paramzc, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), null);
  }
  
  public void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, zo paramzo, zv paramzv)
  {
    a(paramString, paramzg, paramzc, paramzo.d(), paramzo.e(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, paramzv);
  }
  
  public void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, com.aspose.cells.b.a.b.zq paramzq, zv paramzv)
  {
    a(paramString, paramzg, paramzc, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramzv);
  }
  
  public void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, float paramFloat1, float paramFloat2)
  {
    a(paramString, paramzg, paramzc, paramFloat1, paramFloat2, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, null);
  }
  
  public void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, float paramFloat1, float paramFloat2, zv paramzv)
  {
    a(paramString, paramzg, paramzc, paramFloat1, paramFloat2, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, paramzv);
  }
  
  public void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, com.aspose.cells.b.a.b.zp paramzp, zv paramzv)
  {
    com.aspose.cells.b.a.b.zq localzq = new com.aspose.cells.b.a.b.zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramString, paramzg, paramzc, localzq, paramzv);
  }
  
  protected abstract void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zv paramzv);
  
  public void a(zc paramzc, com.aspose.cells.b.a.b.zq paramzq)
  {
    a(null, paramzc, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public void a(zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(null, paramzc, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void a(zc paramzc, ze paramze)
  {
    a(null, paramzc, paramze);
  }
  
  public void a(zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    b(null, paramzc, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void a(zc paramzc, zo[] paramArrayOfzo)
  {
    a(paramzc, paramArrayOfzo, 0);
  }
  
  public void a(zc paramzc, zo[] paramArrayOfzo, int paramInt)
  {
    if ((paramArrayOfzo == null) || (paramArrayOfzo.length == 0)) {
      return;
    }
    float[] arrayOfFloat = new float[paramArrayOfzo.length * 2];
    for (int i1 = 0; i1 < paramArrayOfzo.length; i1++)
    {
      arrayOfFloat[(i1 * 2)] = paramArrayOfzo[i1].d();
      arrayOfFloat[(i1 * 2 + 1)] = paramArrayOfzo[i1].e();
    }
    a(null, paramzc, arrayOfFloat, paramInt);
  }
  
  public void a(zc paramzc, com.aspose.cells.b.a.b.zp paramzp)
  {
    b(null, paramzc, paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
  }
  
  public void b(zc paramzc, com.aspose.cells.b.a.b.zq paramzq)
  {
    b(null, paramzc, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public void b(zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    b(null, paramzc, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public com.aspose.cells.b.a.b.zt a(String paramString, com.aspose.cells.b.a.b.zg paramzg)
  {
    return this.s.a(paramString, paramzg);
  }
  
  public com.aspose.cells.b.a.b.zt a(String paramString, com.aspose.cells.b.a.b.zg paramzg, zo paramzo, zv paramzv)
  {
    return this.s.a(paramString, paramzg, paramzo, paramzv);
  }
  
  public com.aspose.cells.b.a.b.zt a(String paramString, com.aspose.cells.b.a.b.zg paramzg, com.aspose.cells.b.a.b.zt paramzt, zv paramzv)
  {
    return this.s.a(paramString, paramzg, paramzt, paramzv);
  }
  
  public com.aspose.cells.b.a.b.zt a(String paramString, com.aspose.cells.b.a.b.zg paramzg, int paramInt, zv paramzv)
  {
    return this.s.a(paramString, paramzg, paramInt, paramzv);
  }
  
  public void a(zi paramzi)
  {
    a(paramzi, 0);
  }
  
  public void a(zi paramzi, int paramInt)
  {
    float[] arrayOfFloat = paramzi.d();
    zi localzi = new zi(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3], b(arrayOfFloat[4]), b(arrayOfFloat[5]));
    this.b.b().a(localzi, paramInt);
  }
  
  public void c()
  {
    if (this.v != null) {
      this.b.a(this.v);
    }
  }
  
  public void a(zf paramzf)
  {
    if ((this.c.size() == 0) || (this.d.size() == 0)) {
      throw new IllegalStateException();
    }
    this.b = ((zaec)this.c.pop());
    this.f = ((zb)this.d.pop());
  }
  
  public void a(float paramFloat)
  {
    a(paramFloat, 0);
  }
  
  public void a(float paramFloat, int paramInt)
  {
    this.b.b().a(paramFloat, paramInt);
  }
  
  public zf d()
  {
    zb localzb = new zb();
    this.f.a(localzb);
    this.d.push(this.f);
    this.f = localzb;
    this.c.push(this.b);
    this.b = this.b.a();
    return null;
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.b.b().a(paramFloat1, paramFloat2);
  }
  
  public void a(com.aspose.cells.b.a.b.zp paramzp)
  {
    a(new com.aspose.cells.b.a.b.zr(paramzp), 0);
  }
  
  public void a(com.aspose.cells.b.a.b.zq paramzq)
  {
    a(new com.aspose.cells.b.a.b.zr(paramzq), 0);
  }
  
  public void a(com.aspose.cells.b.a.b.zr paramzr, int paramInt)
  {
    b(paramzr, paramInt);
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    a(paramFloat1, paramFloat2, 0);
  }
  
  public void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    this.b.b().b(c(paramFloat1, f()), c(paramFloat2, g()), paramInt);
  }
  
  public com.aspose.cells.b.a.b.zq e()
  {
    return this.s.a(this.b.c());
  }
  
  public float f()
  {
    return this.q;
  }
  
  public float g()
  {
    return this.r;
  }
  
  public int h()
  {
    return this.g;
  }
  
  public void a(int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 3) || (paramInt == 1)) {
      this.g = paramInt;
    } else {
      throw new IllegalArgumentException("PageUnit must be Pixel Display or Point");
    }
  }
  
  public void b(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public int i()
  {
    return this.b.e();
  }
  
  public void c(int paramInt)
  {
    this.b.b(paramInt);
  }
  
  public zi j()
  {
    return this.b.b().b();
  }
  
  private void a(zs paramzs, zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    com.aspose.cells.a.d.zp localzp = new com.aspose.cells.a.d.zp();
    localzp.a(this.b.b().b());
    com.aspose.cells.a.d.zq localzq = new com.aspose.cells.a.d.zq();
    za localza = new za();
    localza.a(new zo(b(paramFloat1), b(paramFloat2)));
    localza.a(new com.aspose.cells.b.a.b.zt(b(paramFloat3), b(paramFloat4)));
    localza.a(paramFloat5);
    localza.b(paramFloat6);
    localzq.a(localza.a());
    localzq.a(localza);
    localzp.a(localzq);
    if (paramzs != null) {
      localzp.a(zx.a(paramzs, f()));
    }
    if (paramzc != null) {
      localzp.a(a(paramzc));
    }
    this.f.a(localzp);
  }
  
  private void b(zs paramzs, zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    com.aspose.cells.a.d.zp localzp = new com.aspose.cells.a.d.zp();
    localzp.a(this.b.b().b());
    com.aspose.cells.a.d.zq localzq = new com.aspose.cells.a.d.zq();
    za localza = new za();
    localza.a(new zo(b(paramFloat1), b(paramFloat2)));
    localza.a(new com.aspose.cells.b.a.b.zt(b(paramFloat3), b(paramFloat4)));
    localza.a(paramFloat5);
    localza.b(paramFloat6);
    localzq.a(localza);
    localzq.a(localza.a());
    localzp.a(localzq);
    if (paramzs != null) {
      localzp.a(zx.a(paramzs, f()));
    }
    if (paramzc != null) {
      localzp.a(a(paramzc));
    }
    this.f.a(localzp);
  }
  
  private void d(zs paramzs, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    com.aspose.cells.a.d.zp localzp = com.aspose.cells.a.d.zp.a(new zo(b(paramFloat1), b(paramFloat2)), new zo(b(paramFloat3), b(paramFloat4)));
    localzp.a(this.b.b().b());
    localzp.a(zx.a(paramzs, f()));
    this.f.a(localzp);
  }
  
  private void a(zs paramzs, zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    com.aspose.cells.a.d.zp localzp = com.aspose.cells.a.d.zp.a(new com.aspose.cells.b.a.b.zq(b(paramFloat1), b(paramFloat2), b(paramFloat3), b(paramFloat4)));
    localzp.a(this.b.b().b());
    if (paramzs != null) {
      localzp.a(zx.a(paramzs, f()));
    }
    if (paramzc != null) {
      localzp.a(a(paramzc));
    }
    this.f.a(localzp);
  }
  
  private void a(zs paramzs, zc paramzc, ze paramze)
  {
    com.aspose.cells.a.d.zp localzp = zaee.a(paramze, this);
    localzp.a(this.b.b().b());
    if (paramzs != null) {
      localzp.a(zx.a(paramzs, f()));
    }
    if (paramzc != null) {
      localzp.a(a(paramzc));
    }
    this.f.a(localzp);
  }
  
  private void a(zs paramzs, zc paramzc, float[] paramArrayOfFloat, int paramInt)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < 2)) {
      return;
    }
    for (int i1 = 0; i1 < paramArrayOfFloat.length; i1++) {
      paramArrayOfFloat[i1] = b(paramArrayOfFloat[i1]);
    }
    com.aspose.cells.a.d.zp localzp = new com.aspose.cells.a.d.zp();
    localzp.a(this.b.b().b());
    if (paramzs != null) {
      localzp.a(zx.a(paramzs, f()));
    }
    if (paramzc != null)
    {
      localzp.a(a(paramzc));
      localzp.b(paramInt);
    }
    com.aspose.cells.a.d.zq localzq = new com.aspose.cells.a.d.zq();
    localzq.a(new zo(paramArrayOfFloat[0], paramArrayOfFloat[1]));
    localzq.a(true);
    zu localzu = new zu(paramArrayOfFloat);
    localzq.a(localzu);
    localzp.a(localzq);
    this.f.a(localzp);
  }
  
  private void b(zs paramzs, zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    com.aspose.cells.a.d.zp localzp = com.aspose.cells.a.d.zp.b(new com.aspose.cells.b.a.b.zq(b(paramFloat1), b(paramFloat2), b(paramFloat3), b(paramFloat4)));
    localzp.a(this.b.b().b());
    if (paramzs != null) {
      localzp.a(zx.a(paramzs, f()));
    }
    if (paramzc != null) {
      localzp.a(a(paramzc));
    }
    this.f.a(localzp);
  }
  
  private void a(zs paramzs, zo[] paramArrayOfzo, int paramInt1, int paramInt2, float paramFloat, boolean paramBoolean)
  {
    int i1 = paramInt2 + 1;
    int i2 = i1 * 2 + 4;
    float[] arrayOfFloat = new float[i2];
    int i3 = paramInt1 + i1;
    if (i3 == paramArrayOfzo.length)
    {
      i3--;
      arrayOfFloat[(--i2)] = paramArrayOfzo[i3].e();
      arrayOfFloat[(--i2)] = paramArrayOfzo[i3].d();
    }
    while ((i2 > 0) && (i3 >= 0))
    {
      arrayOfFloat[(--i2)] = paramArrayOfzo[i3].e();
      arrayOfFloat[(--i2)] = paramArrayOfzo[i3].d();
      i3--;
    }
    if (i2 > 0)
    {
      arrayOfFloat[1] = paramArrayOfzo[0].e();
      arrayOfFloat[0] = paramArrayOfzo[0].d();
    }
    a(paramzs, arrayOfFloat, paramFloat, paramBoolean);
  }
  
  protected void a(zs paramzs, float[] paramArrayOfFloat, float paramFloat, boolean paramBoolean)
  {
    com.aspose.cells.a.d.zp localzp = new com.aspose.cells.a.d.zp();
    localzp.a(this.b.b().b());
    if (paramzs != null) {
      localzp.a(zx.a(paramzs, f()));
    }
    this.f.a(localzp);
    com.aspose.cells.a.d.zq localzq = new com.aspose.cells.a.d.zq();
    localzq.a(paramBoolean);
    localzq.a(new zo(b(paramArrayOfFloat[2]), b(paramArrayOfFloat[3])));
    localzp.a(localzq);
    com.aspose.cells.a.d.zt localzt = new com.aspose.cells.a.d.zt();
    localzq.a(localzt);
    float f1 = paramArrayOfFloat[2];
    float f2 = paramArrayOfFloat[3];
    paramFloat /= 3.0F;
    float f3 = paramArrayOfFloat[4] - paramArrayOfFloat[0];
    float f4 = paramArrayOfFloat[5] - paramArrayOfFloat[1];
    float f5 = paramArrayOfFloat[2] + paramFloat * f3;
    float f6 = paramArrayOfFloat[3] + paramFloat * f4;
    int i1 = 2;
    int i2 = paramArrayOfFloat.length - 4;
    while (i1 < i2)
    {
      int i3 = i1;
      int i4 = i3++;
      int i5 = i3++;
      int i6 = i3++;
      int i7 = i3++;
      int i8 = i3++;
      int i9 = i3++;
      f3 = paramArrayOfFloat[i8] - paramArrayOfFloat[i4];
      f4 = paramArrayOfFloat[i9] - paramArrayOfFloat[i5];
      float f7 = paramArrayOfFloat[i6] - paramFloat * f3;
      float f8 = paramArrayOfFloat[i7] - paramFloat * f4;
      zy localzy = new zy();
      localzy.a(new zo(b(f1), b(f2)));
      localzy.b(new zo(b(f5), b(f6)));
      localzy.c(new zo(b(f7), b(f8)));
      localzy.d(new zo(b(paramArrayOfFloat[i6]), b(paramArrayOfFloat[i7])));
      localzt.a(localzy);
      f1 = paramArrayOfFloat[i6];
      f2 = paramArrayOfFloat[i7];
      f5 = paramArrayOfFloat[i6] + paramFloat * f3;
      f6 = paramArrayOfFloat[i7] + paramFloat * f4;
      i1 += 2;
    }
  }
  
  protected abstract void b(com.aspose.cells.b.a.b.zr paramzr, int paramInt);
  
  protected abstract void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zj paramzj);
  
  abstract float c(float paramFloat1, float paramFloat2);
  
  abstract float b(float paramFloat);
  
  private boolean a(zs paramzs)
  {
    return (paramzs.o() == 255) || (paramzs.k() == 255);
  }
  
  private zavv b(zs paramzs)
  {
    zavv localzavv = new zavv();
    if (paramzs.o() == 255)
    {
      localzavv.a(paramzs.f());
      paramzs.e(0);
    }
    if (paramzs.k() == 255)
    {
      localzavv.b(paramzs.e());
      paramzs.c(0);
    }
    localzavv.a((zs)paramzs.q());
    return localzavv;
  }
  
  protected zc a(zc paramzc)
  {
    return (zc)paramzc.e();
  }
  
  public void a(int paramInt, boolean paramBoolean) {}
  
  public void b(int paramInt, boolean paramBoolean) {}
  
  public ImageOrPrintOptions k()
  {
    return this.n;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */