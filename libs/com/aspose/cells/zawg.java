package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.b.zw;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;

class zawg
  implements zj
{
  protected float a;
  protected float b;
  protected float c;
  protected float d;
  protected float e = 0.0F;
  protected float f = 0.0F;
  protected zawm[] g;
  protected ArrayList h = new ArrayList();
  protected double[] i = new double[0];
  protected zkg j = null;
  protected Color[] k = { Color.getRed(), Color.getGreen(), Color.getBlue(), Color.getYellow(), Color.getPurple(), Color.getOlive(), Color.getNavy(), Color.getAqua(), Color.getLime(), Color.getMaroon(), Color.getTeal(), Color.getFuchsia() };
  protected String[] l;
  protected com.aspose.cells.b.a.b.zg m;
  protected Color n = zw.a();
  protected float[] o = { 0.0F };
  protected int p = 1;
  protected float q = 1.0F;
  protected int r = 0;
  protected boolean s = false;
  protected int t = -1;
  private boolean u = false;
  
  protected zawg() {}
  
  public zawg(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble)
  {
    this();
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    a(paramArrayOfDouble);
  }
  
  public zawg(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, float paramFloat5)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble);
  }
  
  public zawg(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, Color[] paramArrayOfColor, float paramFloat5)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble, paramFloat5);
    this.k = paramArrayOfColor;
  }
  
  public zawg(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, Color[] paramArrayOfColor, float paramFloat5, String[] paramArrayOfString)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble, paramArrayOfColor, paramFloat5);
    this.l = paramArrayOfString;
  }
  
  public zawg(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, Color[] paramArrayOfColor, float paramFloat5, String[] paramArrayOfString, zkg paramzkg)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble, paramArrayOfColor, paramFloat5, paramArrayOfString);
    this.j = paramzkg;
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.u)
    {
      if (paramBoolean) {
        for (zawm localzawm : this.g) {
          localzawm.dispose();
        }
      }
      this.u = true;
    }
  }
  
  public double[] a()
  {
    return this.i;
  }
  
  public void a(double[] paramArrayOfDouble)
  {
    this.i = paramArrayOfDouble;
  }
  
  public zkg b()
  {
    return this.j;
  }
  
  public void a(com.aspose.cells.b.a.b.zg paramzg)
  {
    this.m = paramzg;
  }
  
  public void a(Color paramColor)
  {
    this.n = paramColor;
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    this.o = paramArrayOfFloat;
  }
  
  public float c()
  {
    return this.c;
  }
  
  public float d()
  {
    return this.d;
  }
  
  public float e()
  {
    return this.a;
  }
  
  public float f()
  {
    return this.b;
  }
  
  public void a(float paramFloat)
  {
    this.f = (paramFloat % 360.0F);
    if (this.f < 0.0F) {
      this.f += 360.0F;
    }
  }
  
  zawm[] g()
  {
    return this.g;
  }
  
  void a(zbfc paramzbfc)
  {
    zkg localzkg = paramzbfc.D();
    int i1 = paramzbfc.v().D();
    a(i1 - 90);
    float[] arrayOfFloat = new float[localzkg.getCount()];
    for (int i2 = 0; i2 < localzkg.getCount(); i2++) {
      arrayOfFloat[i2] = (localzkg.a(i2).F() / 100.0F);
    }
    a(arrayOfFloat);
    zqx localzqx = paramzbfc.w();
    a(localzqx.a().h());
    a(localzqx.a().j());
    m();
    if (this.s)
    {
      zq localzq = h();
      a(localzq);
    }
  }
  
  public void a(zr paramzr)
    throws Exception
  {
    c(paramzr);
    if (this.e > 0.0F) {
      b(paramzr);
    }
    d(paramzr);
  }
  
  public void a(zr paramzr, zbfc paramzbfc)
    throws Exception
  {
    zawj.a(paramzbfc.D());
    zv localzv = new zv();
    localzv.a(1);
    localzv.c(1);
    zje localzje = this.j.b();
    double d1 = 0.0D;
    for (double d2 : this.i) {
      d1 += d2;
    }
    ??? = n();
    zq localzq1 = zn.a((ze)???);
    for (zawm localzawm : this.g) {
      if ((localzawm != null) && (localzawm.e().length() >= 1))
      {
        zke localzke = localzawm.i();
        zbfc localzbfc = localzke.g().a();
        zqx localzqx = localzke.o();
        double d3;
        if (d1 == 0.0D) {
          d3 = 0.0D;
        } else {
          d3 = Math.abs(localzke.w()) / d1;
        }
        float f1;
        if (localzje.B().q())
        {
          if (localzqx.a().f().e()) {
            f1 = localzje.a() * 0.175F;
          } else {
            f1 = localzje.a() * 0.2F;
          }
        }
        else if (localzqx.a().f().e()) {
          f1 = localzje.a() * 0.175F;
        } else {
          f1 = localzje.a() * 0.2F;
        }
        float f2 = localzje.b();
        zt localzt = zawj.a(paramzr, localzje.z(), localzbfc.ai(), localzke.I(), d3, f1, f2, 0.0D);
        zq localzq2 = zq.c();
        float f3 = 0.0F;
        float[] arrayOfFloat1;
        zo localzo1;
        switch (localzqx.j())
        {
        case 1: 
          arrayOfFloat1 = new float[] { f3 };
          localzo1 = localzawm.a(0.25F, arrayOfFloat1);
          f3 = arrayOfFloat1[0];
          localzo1.a(localzo1.d() - localzt.b() / 2.0F);
          localzo1.b(localzo1.e() - localzt.c() / 2.0F);
          break;
        case 3: 
          arrayOfFloat1 = new float[] { f3 };
          localzo1 = localzawm.a(0.5F, arrayOfFloat1);
          f3 = arrayOfFloat1[0];
          double d4 = f3 * 3.141592653589793D / 180.0D;
          if ((f3 > 270.0F) || (f3 < 90.0F)) {
            localzo1.a(localzo1.d() - (float)(localzt.b() * Math.cos(d4)));
          }
          if ((f3 > 0.0F) && (f3 < 180.0F)) {
            localzo1.b(localzo1.e() - (float)(localzt.c() * Math.sin(d4)));
          }
          break;
        case 9: 
          int i5 = 0;
          float f4 = (float)Math.sin(localzje.p() * 3.141592653589793D / 180.0D);
          if (!localzqx.a().q()) {
            i5 = localzqx.a().n();
          }
          float f5 = 0.0F;
          if (!localzqx.a().r()) {
            f5 = localzqx.a().o() / 500.0F;
          }
          Object localObject2 = { f3 };
          localzo1 = localzawm.a(0.5F + f5 / 2.0F, i5, (float[])localObject2);
          f3 = localObject2[0];
          localObject2 = new zo[] { localzo1 };
          a(localzawm, (zo[])localObject2, f3, localzt);
          localzo1 = localObject2[0];
          float f6 = e() + c() / 2.0F;
          float f7 = f() + d() / 2.0F;
          localzo1.a(localzo1.d() - f6);
          localzo1.b(localzo1.e() - f7);
          zo localzo3 = a(localzawm, localzt);
          localzo3.a(localzo3.d() - f6);
          localzo3.b(localzo3.e() - f7);
          localzo1.a(localzo3.d() + (localzo1.d() - localzo3.d()) * f4);
          if ((localzqx.a().o() < 0) && (this.o[localzawm.i().I()] == 0.0F)) {
            if (localzo1.e() < 0.0F) {
              localzo1.b(localzo1.e() - localzawm.g() * f4);
            } else {
              localzo1.b(localzo1.e() + localzawm.g() * f4);
            }
          }
          localzo1.a(localzo1.d() + f6);
          localzo1.b(localzo1.e() + f7);
          break;
        default: 
          Object localObject3 = { f3 };
          localzo1 = localzawm.a(0.5F, (float[])localObject3);
          f3 = localObject3[0];
          localObject3 = new zo[] { localzo1 };
          a(localzawm, (zo[])localObject3, f3, localzt);
          localzo1 = localObject3[0];
        }
        localzq2 = new zq(localzo1, localzt);
        zawj.a(paramzr, localzje, localzbfc.ai(), localzke.I(), d3, localzq2, 0.0D);
        if ((localzke.g().a().Q()) && (localzqx.j() == 9))
        {
          float[] arrayOfFloat2 = { f3 };
          zo localzo2 = localzawm.a(0.5F, arrayOfFloat2);
          f3 = arrayOfFloat2[0];
          if ((f3 >= 0.0F) && (f3 <= 180.0F)) {
            localzo2.b(localzo2.e() + localzawm.g());
          }
          a(paramzr, localzq1, localzawm, localzke.g().a().R(), localzq2, localzo2);
        }
      }
    }
  }
  
  private zo a(zawm paramzawm, zt paramzt)
  {
    float f1 = 0.0F;
    float[] arrayOfFloat = { f1 };
    zo localzo = paramzawm.a(0.5F, arrayOfFloat);
    f1 = arrayOfFloat[0];
    zo[] arrayOfzo = { localzo };
    a(paramzawm, arrayOfzo, f1, paramzt);
    localzo = arrayOfzo[0];
    return localzo;
  }
  
  private void a(zawm paramzawm, zo[] paramArrayOfzo, float paramFloat, zt paramzt)
  {
    if ((paramFloat > 67.5D) && (paramFloat < 112.5D)) {
      paramArrayOfzo[0].a((float)(paramArrayOfzo[0].d() - (paramFloat - 67.5D) * paramzt.b() / 45.0D));
    } else if ((paramFloat >= 112.5D) && (paramFloat <= 247.5D)) {
      paramArrayOfzo[0].a(paramArrayOfzo[0].d() - paramzt.b());
    } else if ((paramFloat > 247.5D) && (paramFloat < 292.5D)) {
      paramArrayOfzo[0].a((float)(paramArrayOfzo[0].d() - paramzt.b() + (paramFloat - 247.5D) * paramzt.b() / 45.0D));
    }
    if ((paramFloat >= 0.0F) && (paramFloat <= 180.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() + paramzawm.g());
    } else if ((paramFloat < 225.0F) && (paramFloat > 180.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - (paramFloat - 135.0F) * paramzt.c() / 90.0F);
    } else if ((paramFloat >= 225.0F) && (paramFloat <= 315.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - paramzt.c());
    } else if ((paramFloat > 315.0F) && (paramFloat <= 360.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - paramzt.c() + (paramFloat - 315.0F) * paramzt.c() / 90.0F);
    }
  }
  
  private void a(zr paramzr, zq paramzq1, zawm paramzawm, zanq paramzanq, zq paramzq2, zo paramzo)
  {
    float f1 = paramzawm.f().h() / 2.0F * 0.05F;
    zo localzo1 = new zo(paramzq1.f() + paramzq1.h() / 2.0F, paramzq1.g() + paramzq1.i() / 2.0F);
    zo localzo2 = paramzo;
    if (paramzo.d() < localzo1.d()) {
      localzo2.a(localzo2.d() - 1.0F);
    } else {
      localzo2.a(localzo2.d() + 1.0F);
    }
    if (paramzo.e() < localzo1.e()) {
      localzo2.b(localzo2.e() - 1.0F);
    } else {
      localzo2.b(localzo2.e() + 1.0F);
    }
    zo localzo3 = new zo(paramzq2.j(), paramzq2.k() + paramzq2.i() / 2.0F);
    zo localzo4 = new zo(paramzq2.j() + paramzq2.h() / 2.0F, paramzq2.k());
    zo localzo5 = new zo(paramzq2.l(), paramzq2.k() + paramzq2.i() / 2.0F);
    zo localzo6 = new zo(paramzq2.j() + paramzq2.h() / 2.0F, paramzq2.m());
    int i1 = a(paramzo, paramzq2);
    zs localzs = zanv.a(paramzanq);
    try
    {
      ze localze1 = new ze();
      zo localzo7 = zo.a();
      ze localze2;
      switch (i1)
      {
      case 1: 
        localzo7 = new zo(localzo5.d() + f1, localzo5.e());
        localze1.a(localzo5, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.d() <= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo5, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 2: 
        localzo7 = new zo(localzo5.d() + f1, localzo5.e());
        localze1.a(localzo5, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.d() <= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo5, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo6.d(), localzo6.e() + f1);
          localze1.a(localzo6, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1)) && (localzo7.e() <= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo6, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
        break;
      case 3: 
        localze1 = new ze();
        localzo7 = new zo(localzo6.d(), localzo6.e() + f1);
        localze1.a(localzo6, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.e() <= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo6, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 4: 
        localze1 = new ze();
        localzo7 = new zo(localzo3.d() - f1, localzo3.e());
        localze1.a(localzo3, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.d() >= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo3, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo6.d(), localzo6.e() + f1);
          localze1.a(localzo6, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1)) && (localzo7.e() <= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo6, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
        break;
      case 5: 
        localze1 = new ze();
        localzo7 = new zo(localzo3.d() - f1, localzo3.e());
        localze1.a(localzo3, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.d() >= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo3, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 6: 
        localze1 = new ze();
        localzo7 = new zo(localzo3.d() - f1, localzo3.e());
        localze1.a(localzo3, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.d() >= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo3, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo4.d(), localzo4.e() - f1);
          localze1.a(localzo4, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1)) && (localzo7.e() >= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo4, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
        break;
      case 7: 
        localze1 = new ze();
        localzo7 = new zo(localzo4.d(), localzo4.e() - f1);
        localze1.a(localzo4, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.e() >= paramzo.e()))
        {
          localze2 = new ze();
          localze2.a(localzo4, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        break;
      case 8: 
        localze1 = new ze();
        localzo7 = new zo(localzo5.d() + f1, localzo5.e());
        localze1.a(localzo5, localzo7);
        localze1.a(localzo7, localzo2);
        localze1.a(localzs.r());
        if ((a(paramzr, localze1)) && (localzo7.d() <= paramzo.d()))
        {
          localze2 = new ze();
          localze2.a(localzo5, localzo7);
          localze2.a(localzo7, paramzo);
          paramzr.a(localzs, localze2);
          localze2.g();
        }
        else
        {
          localze1 = new ze();
          localzo7 = new zo(localzo4.d(), localzo4.e() - f1);
          localze1.a(localzo4, localzo7);
          localze1.a(localzo7, localzo2);
          localze1.a(localzs.r());
          if ((a(paramzr, localze1)) && (localzo7.e() >= paramzo.e()))
          {
            localze2 = new ze();
            localze2.a(localzo4, localzo7);
            localze2.a(localzo7, paramzo);
            paramzr.a(localzs, localze2);
            localze2.g();
          }
        }
        break;
      }
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  private boolean a(zr paramzr, ze paramze)
  {
    for (zawm localzawm : this.g)
    {
      ze localze1 = new ze();
      localze1.b(localzawm.f().f(), localzawm.f().g(), localzawm.f().h(), localzawm.f().i(), localzawm.b(), localzawm.c());
      com.aspose.cells.b.a.b.zr localzr1 = new com.aspose.cells.b.a.b.zr(paramze);
      try
      {
        localzr1.a(localze1);
        if (!paramzr.a().b(localzr1))
        {
          boolean bool1 = false;
          return bool1;
        }
      }
      finally
      {
        if (localzr1 != null) {
          localzr1.b();
        }
      }
      ze localze2 = new ze();
      localze2.b(localzawm.f().f(), localzawm.f().g() + localzawm.g(), localzawm.f().h(), localzawm.f().i(), localzawm.b(), localzawm.c());
      com.aspose.cells.b.a.b.zr localzr2 = new com.aspose.cells.b.a.b.zr(paramze);
      try
      {
        localzr2.a(localze2);
        if (!paramzr.a().b(localzr2))
        {
          boolean bool2 = false;
          return bool2;
        }
      }
      finally
      {
        if (localzr2 != null) {
          localzr2.b();
        }
      }
    }
    return true;
  }
  
  private int a(zo paramzo, zq paramzq)
  {
    int i1 = 0;
    if (paramzq.l() < paramzo.d())
    {
      if (paramzq.m() < paramzo.e()) {
        i1 = 2;
      } else if (paramzq.k() > paramzo.e()) {
        i1 = 8;
      } else {
        i1 = 1;
      }
    }
    else if (paramzq.j() > paramzo.d())
    {
      if (paramzq.m() < paramzo.e()) {
        i1 = 4;
      } else if (paramzq.k() > paramzo.e()) {
        i1 = 6;
      } else {
        i1 = 5;
      }
    }
    else if (paramzq.m() < paramzo.e()) {
      i1 = 3;
    } else if (paramzq.k() > paramzo.e()) {
      i1 = 7;
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  private ze n()
  {
    ze localze = new ze();
    for (zawm localzawm : this.g)
    {
      localze.b(localzawm.f().f(), localzawm.f().g(), localzawm.f().h(), localzawm.f().i(), localzawm.b(), localzawm.c());
      localze.b(localzawm.f().f(), localzawm.f().g() + localzawm.g(), localzawm.f().h(), localzawm.f().i(), localzawm.b(), localzawm.c());
    }
    return localze;
  }
  
  protected zq h()
  {
    zq localzq = this.g[0].h();
    for (int i1 = 1; i1 < this.g.length; i1++) {
      localzq = zq.a(localzq, this.g[i1].h());
    }
    return localzq;
  }
  
  protected void a(zq paramzq)
  {
    float f1 = this.c / paramzq.h();
    float f2 = this.d / paramzq.i();
    float f3 = paramzq.f() - this.a;
    float f4 = paramzq.g() - this.b;
    for (zawm localzawm : this.g)
    {
      float f5 = localzawm.f().f() - f3;
      float f6 = localzawm.f().g() - f4;
      float f7 = localzawm.f().h() * f1;
      float f8 = localzawm.f().i() * f2;
      float f9 = localzawm.g() * f2;
      localzawm.a(f5, f6, f7, f8, f9);
    }
  }
  
  protected float i()
  {
    float f1 = 0.0F;
    for (int i1 = 0; (i1 < this.o.length) && (i1 < this.i.length); i1++) {
      if (this.o[i1] > f1) {
        f1 = this.o[i1];
      }
    }
    return f1;
  }
  
  protected zt j()
  {
    float f1 = 1.0F + i();
    float f2 = this.c / f1;
    float f3 = this.d / f1 * (1.0F - this.e);
    return new zt(f2, f3);
  }
  
  protected zt k()
  {
    float f1 = i();
    float f2 = j().b() * f1;
    float f3 = j().c() * f1;
    return new zt(f2, f3);
  }
  
  protected float l()
  {
    return this.d / (1.0F + i()) * this.e;
  }
  
  protected void m()
  {
    double d1 = 0.0D;
    for (double d2 : this.i) {
      d1 += d2;
    }
    ??? = j();
    zt localzt = k();
    ??? = this.o.length - 1;
    float f1 = i();
    ArrayList localArrayList = new ArrayList();
    this.h.clear();
    int i3 = 0;
    int i4 = -1;
    int i5 = 0;
    double d3 = this.f;
    for (int i6 = 0; i6 < this.i.length; i6++)
    {
      double d4 = this.i[i6];
      double d5 = d4 / d1 * 360.0D;
      if (d1 == 0.0D) {
        d5 = 0.0D;
      }
      float f2 = this.o[i5];
      float f3 = this.o[i5];
      if (f2 > 0.0F)
      {
        localObject2 = a((float)(d3 + d5 / 2.0D), this.o[i5]);
        f2 = ((zt)localObject2).b();
        f3 = ((zt)localObject2).c();
      }
      Object localObject2 = null;
      zke localzke;
      if (i6 == this.t)
      {
        localzke = (this.j != null) && (i6 < this.j.getCount()) ? this.j.b(i6) : null;
        localObject2 = b(this.a + localzt.b() / 2.0F + f2, this.b + localzt.c() / 2.0F + f3, ((zt)???).b(), ((zt)???).c(), l(), (float)(d3 % 360.0D), (float)d5, this.k[i3], this.r, this.p, this.q, localzke);
      }
      else
      {
        localzke = (this.j != null) && (i6 < this.j.getCount()) ? this.j.b(i6) : null;
        localObject2 = a(this.a + localzt.b() / 2.0F + f2, this.b + localzt.c() / 2.0F + f3, ((zt)???).b(), ((zt)???).c(), l(), (float)(d3 % 360.0D), (float)d5, this.k[i3], this.r, this.p, this.q, localzke);
      }
      ((zawm)localObject2).a(this.l[i6]);
      if ((i4 > -1) || ((d3 <= 270.0D) && (d3 + d5 > 270.0D)) || ((d3 >= 270.0D) && (d3 + d5 > 630.0D)))
      {
        i4++;
        localArrayList.add(i4, localObject2);
        this.h.add(i4, Integer.valueOf(i6));
      }
      else
      {
        zf.a(localArrayList, localObject2);
        zf.a(this.h, Integer.valueOf(i6));
      }
      if (i5 < ???) {
        i5++;
      }
      i3++;
      if (i3 >= this.k.length) {
        i3 = 0;
      }
      d3 += d5;
      if (d3 > 360.0D) {
        d3 -= 360.0D;
      }
    }
    this.g = ((zawm[])zf.a(localArrayList, zawm.class));
  }
  
  protected zawm a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8, zke paramzke)
  {
    return new zawm(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6 % 360.0F, paramFloat7, paramColor, paramInt1, paramInt2, paramFloat8, paramzke);
  }
  
  protected zawm b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8, zke paramzke)
  {
    Color localColor = zll.a(paramColor, zll.a);
    zawm localzawm = new zawm(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6 % 360.0F, paramFloat7, localColor, paramInt1, paramInt2, paramFloat8);
    localzawm.a(paramzke);
    return localzawm;
  }
  
  protected zt a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return zt.a();
    }
    float f1 = (float)(j().b() * paramFloat2 / 2.0F * Math.cos(paramFloat1 * 3.141592653589793D / 180.0D));
    float f2 = (float)(j().c() * paramFloat2 / 2.0F * Math.sin(paramFloat1 * 3.141592653589793D / 180.0D));
    return new zt(f1, f2);
  }
  
  protected void b(zr paramzr)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    zf.b(localArrayList, this.g);
    zawm localzawm1 = null;
    zawm[] arrayOfzawm;
    if ((this.g[0].b() > 90.0F) && (this.g[0].b() <= 270.0F) && (this.g[0].b() + this.g[0].c() > 450.0F))
    {
      localzawm1 = (zawm)localArrayList.get(0);
      arrayOfzawm = localzawm1.a(0.0F);
      localArrayList.set(0, arrayOfzawm[0]);
      if (arrayOfzawm[1].c() > 0.0F) {
        localArrayList.add(1, arrayOfzawm[1]);
      }
    }
    else if (((this.g[0].b() > 270.0F) && (this.g[0].b() + this.g[0].c() > 450.0F)) || ((this.g[0].b() < 90.0F) && (this.g[0].b() + this.g[0].c() > 270.0F)))
    {
      localzawm1 = (zawm)localArrayList.get(0);
      arrayOfzawm = localzawm1.a(180.0F);
      localArrayList.set(0, arrayOfzawm[1]);
      if (arrayOfzawm[1].c() > 0.0F) {
        zf.a(localArrayList, arrayOfzawm[0]);
      }
    }
    localzawm1 = (zawm)localArrayList.get(0);
    localzawm1.a(paramzr);
    int i1 = 1;
    int i2 = localArrayList.size() - 1;
    while (i1 < i2)
    {
      zawm localzawm2 = (zawm)localArrayList.get(i2);
      float f1 = localzawm2.b() - 90.0F;
      if ((f1 > 180.0F) || (f1 < 0.0F)) {
        f1 = 0.0F;
      }
      zawm localzawm3 = (zawm)localArrayList.get(i1);
      float f2 = (450.0F - localzawm3.d()) % 360.0F;
      if ((f2 > 180.0F) || (f2 < 0.0F)) {
        f2 = 0.0F;
      }
      if (f2 >= f1)
      {
        localzawm3.a(paramzr);
        i1++;
      }
      else if (f2 < f1)
      {
        localzawm2.a(paramzr);
        i2--;
      }
    }
    localzawm1 = (zawm)localArrayList.get(i2);
    localzawm1.a(paramzr);
  }
  
  protected void c(zr paramzr)
    throws Exception
  {
    for (zawm localzawm : this.g) {
      localzawm.f(paramzr);
    }
  }
  
  protected void d(zr paramzr)
    throws Exception
  {
    for (zawm localzawm : this.g) {
      localzawm.g(paramzr);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */