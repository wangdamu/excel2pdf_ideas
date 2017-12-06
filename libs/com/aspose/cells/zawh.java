package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.b.zw;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;

class zawh
  implements zj
{
  protected float a;
  protected float b;
  protected float c;
  protected float d;
  protected float e = 0.0F;
  protected float f = 0.0F;
  protected zawn[] g;
  protected ArrayList h = new ArrayList();
  protected double[] i = new double[0];
  protected zkh j = null;
  protected Color[] k = { Color.getRed(), Color.getGreen(), Color.getBlue(), Color.getYellow(), Color.getPurple(), Color.getOlive(), Color.getNavy(), Color.getAqua(), Color.getLime(), Color.getMaroon(), Color.getTeal(), Color.getFuchsia() };
  protected String[] l;
  protected com.aspose.cells.b.a.b.zg m;
  protected Color n = zw.a();
  protected float[] o = { 0.0F };
  protected int p = 1;
  protected float q = 1.0F;
  protected int r = 0;
  protected boolean s = true;
  protected int t = -1;
  private boolean u = false;
  
  protected zawh() {}
  
  public zawh(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble)
  {
    this();
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    a(paramArrayOfDouble);
  }
  
  public zawh(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, float paramFloat5)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble);
  }
  
  public zawh(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, Color[] paramArrayOfColor, float paramFloat5)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble, paramFloat5);
    this.k = paramArrayOfColor;
  }
  
  public zawh(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, Color[] paramArrayOfColor, float paramFloat5, String[] paramArrayOfString)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble, paramArrayOfColor, paramFloat5);
    this.l = paramArrayOfString;
  }
  
  public zawh(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, double[] paramArrayOfDouble, Color[] paramArrayOfColor, float paramFloat5, String[] paramArrayOfString, zkh paramzkh)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfDouble, paramArrayOfColor, paramFloat5, paramArrayOfString);
    this.j = paramzkh;
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
  
  public void a()
  {
    dispose();
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.u)
    {
      if (paramBoolean) {
        for (zawn localzawn : this.g) {
          localzawn.dispose();
        }
      }
      this.u = true;
    }
  }
  
  public void a(double[] paramArrayOfDouble)
  {
    this.i = paramArrayOfDouble;
  }
  
  public void a(Color paramColor)
  {
    this.n = paramColor;
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    this.o = paramArrayOfFloat;
  }
  
  public void a(float paramFloat)
  {
    this.f = (paramFloat % 360.0F);
    if (this.f < 0.0F) {
      this.f += 360.0F;
    }
  }
  
  void a(zbfd paramzbfd)
  {
    zkh localzkh = paramzbfd.F();
    int i1 = paramzbfd.v().E();
    a(i1 - 90);
    float[] arrayOfFloat = new float[localzkh.getCount()];
    for (int i2 = 0; i2 < localzkh.getCount(); i2++) {
      arrayOfFloat[i2] = (localzkh.a(i2).F() / 100.0F);
    }
    a(arrayOfFloat);
    zqy localzqy = paramzbfd.w();
    this.m = localzqy.a().h();
    a(localzqy.a().j());
    g();
    if (this.s)
    {
      zq localzq = b();
      a(localzq);
    }
  }
  
  public void a(zr paramzr)
    throws Exception
  {
    com.aspose.cells.b.a.b.a.zf localzf1 = paramzr.d();
    paramzr.a(4, true);
    c(paramzr);
    paramzr.a(localzf1);
    com.aspose.cells.b.a.b.a.zf localzf2 = paramzr.d();
    paramzr.a(0, true);
    if (this.e > 0.0F) {
      b(paramzr);
    }
    paramzr.a(localzf2);
    com.aspose.cells.b.a.b.a.zf localzf3 = paramzr.d();
    paramzr.a(4, true);
    if (this.e > 0.0F) {
      b(paramzr);
    }
    d(paramzr);
    paramzr.a(localzf3);
  }
  
  public void a(zr paramzr, zbfd paramzbfd)
    throws Exception
  {
    zawk.a(paramzbfd.F());
    zv localzv = new zv();
    localzv.a(1);
    localzv.c(1);
    zjf localzjf = this.j.b();
    double d1 = 0.0D;
    for (double d2 : this.i) {
      d1 += d2;
    }
    ??? = h();
    zq localzq1 = zn.a((ze)???);
    for (zawn localzawn : this.g) {
      if ((localzawn != null) && (localzawn.h().length() >= 1))
      {
        zkf localzkf = localzawn.l();
        zbfd localzbfd = localzkf.g().a();
        zqy localzqy = localzkf.o();
        if ((localzqy.z()) && (!zawk.a(localzkf)))
        {
          double d3;
          if (d1 == 0.0D) {
            d3 = 0.0D;
          } else {
            d3 = Math.abs(localzkf.w()) / d1;
          }
          float f1;
          if (localzqy.a().d().h()) {
            f1 = localzjf.a() * 0.175F;
          } else {
            f1 = localzjf.a() * 0.2F;
          }
          float f2 = localzjf.b();
          zt localzt = zawk.a(paramzr, localzjf.z(), localzbfd.ak(), localzkf.I(), d3, f1, f2, 0.0D);
          zq localzq2 = zq.c();
          float f3 = 0.0F;
          Object localObject2 = zo.a();
          int i5 = 0;
          int i6 = localzqy.j();
          Object localObject3;
          while (i5 == 0) {
            switch (i6)
            {
            case 1: 
              float[] arrayOfFloat = { f3 };
              localObject2 = localzawn.a(0.25F, arrayOfFloat);
              f3 = arrayOfFloat[0];
              ((zo)localObject2).a(((zo)localObject2).d() - localzt.b() / 2.0F);
              ((zo)localObject2).b(((zo)localObject2).e() - localzt.c() / 2.0F);
              i5 = 1;
              break;
            case 3: 
              float f4 = 0.485F;
              localObject3 = new float[] { f3 };
              localObject2 = localzawn.a(f4, (float[])localObject3);
              f3 = localObject3[0];
              localObject3 = new zo[] { localObject2 };
              b(localzawn, (zo[])localObject3, f3, localzt);
              localObject2 = localObject3[0];
              i5 = 1;
              break;
            case 4: 
              localObject3 = new float[] { f3 };
              localObject2 = localzawn.a(0.5F, (float[])localObject3);
              f3 = localObject3[0];
              localObject3 = new zo[] { localObject2 };
              a(localzawn, (zo[])localObject3, f3, localzt);
              localObject2 = localObject3[0];
              i5 = 1;
              break;
            case 9: 
              localObject3 = new float[] { f3 };
              localObject2 = localzawn.a(0.5F, (float[])localObject3);
              f3 = localObject3[0];
              localObject3 = new zo[] { localObject2 };
              a(localzawn, (zo[])localObject3, f3, localzt);
              localObject2 = localObject3[0];
              localObject3 = new zq(zbxz.a(((zo)localObject2).d()), zbxz.a(((zo)localObject2).e()), zbxz.a(localzt.b()), zbxz.a(localzt.c()));
              zq[] arrayOfzq2 = { localObject3 };
              localzjf.a(arrayOfzq2);
              localObject3 = arrayOfzq2[0];
              localzqy.a().b = zbxz.c(zp.a((zq)localObject3));
              localzqy.a().z();
              localObject2 = new zo(localzqy.a().a.c(), localzqy.a().a.d());
              i5 = 1;
              break;
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            default: 
              float f5 = 0.47F;
              Object localObject4 = { f3 };
              localObject2 = localzawn.a(f5, (float[])localObject4);
              f3 = localObject4[0];
              localObject4 = new zo[] { localObject2 };
              b(localzawn, (zo[])localObject4, f3, localzt);
              localObject2 = localObject4[0];
              boolean bool = a(paramzr, localzawn, new zq((zo)localObject2, localzt));
              if (bool)
              {
                i5 = 1;
              }
              else
              {
                zo localzo2 = a(paramzr, localzawn, localzt, f3);
                if (localzo2.b())
                {
                  i5 = 0;
                  i6 = 4;
                }
                else
                {
                  localObject2 = localzo2;
                  i5 = 1;
                }
              }
              break;
            }
          }
          localzq2 = new zq((zo)localObject2, localzt);
          zq[] arrayOfzq1 = { localzq2 };
          localzjf.a(arrayOfzq1);
          localzq2 = arrayOfzq1[0];
          zawk.a(paramzr, localzjf, localzbfd.ak(), localzkf.I(), d3, localzq2, 0.0D);
          if ((localzkf.g().a().S()) && (localzqy.j() == 9))
          {
            localObject3 = new float[] { f3 };
            zo localzo1 = localzawn.a(0.5F, (float[])localObject3);
            f3 = localObject3[0];
            if ((f3 >= 0.0F) && (f3 <= 180.0F)) {
              localzo1.b(localzo1.e() + localzawn.j());
            }
            a(paramzr, localzq1, localzawn, localzkf.g().a().T(), localzq2, localzo1);
          }
        }
      }
    }
  }
  
  private void a(zawn paramzawn, zo[] paramArrayOfzo, float paramFloat, zt paramzt)
  {
    if ((paramFloat > 67.5D) && (paramFloat < 112.5D)) {
      paramArrayOfzo[0].a((float)(paramArrayOfzo[0].d() - (paramFloat - 67.5D) * paramzt.b() / 45.0D));
    } else if ((paramFloat >= 112.5D) && (paramFloat <= 247.5D)) {
      paramArrayOfzo[0].a(paramArrayOfzo[0].d() - paramzt.b());
    } else if ((paramFloat > 247.5D) && (paramFloat < 292.5D)) {
      paramArrayOfzo[0].a((float)(paramArrayOfzo[0].d() - paramzt.b() + (paramFloat - 247.5D) * paramzt.b() / 45.0D));
    }
    if ((paramFloat >= 0.0F) && (paramFloat <= 180.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() + paramzawn.j());
    } else if ((paramFloat < 225.0F) && (paramFloat > 180.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - (paramFloat - 135.0F) * paramzt.c() / 90.0F);
    } else if ((paramFloat >= 225.0F) && (paramFloat <= 315.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - paramzt.c());
    } else if ((paramFloat > 315.0F) && (paramFloat <= 360.0F)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - paramzt.c() + (paramFloat - 315.0F) * paramzt.c() / 90.0F);
    }
  }
  
  private void b(zawn paramzawn, zo[] paramArrayOfzo, float paramFloat, zt paramzt)
  {
    if ((paramFloat > 67.5D) && (paramFloat < 112.5D)) {
      paramArrayOfzo[0].a((float)(paramArrayOfzo[0].d() - (112.5D - paramFloat) * paramzt.b() / 45.0D));
    } else if ((paramFloat > 247.5D) && (paramFloat < 292.5D)) {
      paramArrayOfzo[0].a((float)(paramArrayOfzo[0].d() - (paramFloat - 247.5D) * paramzt.b() / 45.0D));
    } else if ((paramFloat <= 67.5D) || (paramFloat >= 292.5D)) {
      paramArrayOfzo[0].a(paramArrayOfzo[0].d() - paramzt.b());
    }
    if (paramFloat < 22.5D) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - paramzt.c() / 2.0F - paramFloat * paramzt.c() / 45.0F);
    } else if (paramFloat > 337.5D) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - paramzt.c() / 2.0F + (360.0F - paramFloat) * paramzt.c() / 45.0F);
    } else if ((paramFloat > 157.5D) && (paramFloat < 202.5D)) {
      paramArrayOfzo[0].b((float)(paramArrayOfzo[0].e() - (202.5D - paramFloat) * paramzt.c() / 45.0D));
    } else if ((paramFloat <= 157.5D) && (paramFloat >= 22.5D)) {
      paramArrayOfzo[0].b(paramArrayOfzo[0].e() - paramzt.c());
    }
  }
  
  private void a(zr paramzr, zq paramzq1, zawn paramzawn, zanr paramzanr, zq paramzq2, zo paramzo)
  {
    float f1 = paramzawn.i().h() / 2.0F * 0.05F;
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
    zo localzo3 = new zo(paramzq2.j(), paramzq2.k() + paramzq2.i() / 3.0F);
    zo localzo4 = new zo(paramzq2.j() + paramzq2.h() / 3.0F, paramzq2.k());
    zo localzo5 = new zo(paramzq2.l(), paramzq2.k() + paramzq2.i() / 3.0F);
    zo localzo6 = new zo(paramzq2.j() + paramzq2.h() / 3.0F, paramzq2.m());
    int i1 = a(paramzo, paramzq2);
    zs localzs = null;
    ze localze1 = new ze();
    zo localzo7 = zo.a();
    ze localze2;
    switch (i1)
    {
    case 1: 
      localzo7 = new zo(localzo5.d() + f1, localzo5.e());
      localze1.a(localzo5, localzo7);
      localze1.a(localzo7, localzo2);
      localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
      localzs = paramzanr.b(localze1);
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
        if (localzs != null) {
          localzs.dispose();
        }
        localzs = paramzanr.b(localze1);
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
    if (localzs != null) {
      localzs.dispose();
    }
    localzs = null;
  }
  
  private boolean a(zr paramzr, ze paramze)
  {
    for (zawn localzawn : this.g)
    {
      ze localze1 = new ze();
      localze1.b(localzawn.i().f(), localzawn.i().g(), localzawn.i().h(), localzawn.i().i(), localzawn.b(), localzawn.c());
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
      localze2.b(localzawn.i().f(), localzawn.i().g() + localzawn.j(), localzawn.i().h(), localzawn.i().i(), localzawn.b(), localzawn.c());
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
  
  private ze h()
  {
    ze localze = new ze();
    for (zawn localzawn : this.g)
    {
      localze.b(localzawn.i().f(), localzawn.i().g(), localzawn.i().h(), localzawn.i().i(), localzawn.b(), localzawn.c());
      localze.b(localzawn.i().f(), localzawn.i().g() + localzawn.j(), localzawn.i().h(), localzawn.i().i(), localzawn.b(), localzawn.c());
    }
    return localze;
  }
  
  /* Error */
  private boolean a(zr paramzr, zawn paramzawn, zq paramzq)
  {
    // Byte code:
    //   0: new 31	com/aspose/cells/b/a/b/zq
    //   3: dup
    //   4: aload_3
    //   5: invokevirtual 157	com/aspose/cells/b/a/b/zq:f	()F
    //   8: aload_3
    //   9: invokevirtual 158	com/aspose/cells/b/a/b/zq:g	()F
    //   12: aload_3
    //   13: invokevirtual 159	com/aspose/cells/b/a/b/zq:h	()F
    //   16: aload_3
    //   17: invokevirtual 160	com/aspose/cells/b/a/b/zq:i	()F
    //   20: invokespecial 151	com/aspose/cells/b/a/b/zq:<init>	(FFFF)V
    //   23: astore 4
    //   25: new 27	com/aspose/cells/b/a/b/a/ze
    //   28: dup
    //   29: invokespecial 134	com/aspose/cells/b/a/b/a/ze:<init>	()V
    //   32: astore 5
    //   34: aload 5
    //   36: new 31	com/aspose/cells/b/a/b/zq
    //   39: dup
    //   40: aload_0
    //   41: getfield 90	com/aspose/cells/zawh:a	F
    //   44: aload_0
    //   45: getfield 91	com/aspose/cells/zawh:b	F
    //   48: aload_0
    //   49: getfield 92	com/aspose/cells/zawh:c	F
    //   52: aload_0
    //   53: getfield 93	com/aspose/cells/zawh:d	F
    //   56: invokespecial 151	com/aspose/cells/b/a/b/zq:<init>	(FFFF)V
    //   59: invokevirtual 138	com/aspose/cells/b/a/b/a/ze:b	(Lcom/aspose/cells/b/a/b/zq;)V
    //   62: new 27	com/aspose/cells/b/a/b/a/ze
    //   65: dup
    //   66: invokespecial 134	com/aspose/cells/b/a/b/a/ze:<init>	()V
    //   69: astore 6
    //   71: aload 6
    //   73: aload_2
    //   74: invokevirtual 239	com/aspose/cells/zawn:i	()Lcom/aspose/cells/b/a/b/zq;
    //   77: invokevirtual 157	com/aspose/cells/b/a/b/zq:f	()F
    //   80: aload_2
    //   81: invokevirtual 239	com/aspose/cells/zawn:i	()Lcom/aspose/cells/b/a/b/zq;
    //   84: invokevirtual 158	com/aspose/cells/b/a/b/zq:g	()F
    //   87: aload_2
    //   88: invokevirtual 239	com/aspose/cells/zawn:i	()Lcom/aspose/cells/b/a/b/zq;
    //   91: invokevirtual 159	com/aspose/cells/b/a/b/zq:h	()F
    //   94: aload_2
    //   95: invokevirtual 239	com/aspose/cells/zawn:i	()Lcom/aspose/cells/b/a/b/zq;
    //   98: invokevirtual 160	com/aspose/cells/b/a/b/zq:i	()F
    //   101: aload_2
    //   102: invokevirtual 229	com/aspose/cells/zawn:b	()F
    //   105: aload_2
    //   106: invokevirtual 230	com/aspose/cells/zawn:c	()F
    //   109: invokevirtual 137	com/aspose/cells/b/a/b/a/ze:b	(FFFFFF)V
    //   112: new 32	com/aspose/cells/b/a/b/zr
    //   115: dup
    //   116: aload 5
    //   118: invokespecial 165	com/aspose/cells/b/a/b/zr:<init>	(Lcom/aspose/cells/b/a/b/a/ze;)V
    //   121: astore 7
    //   123: aload 7
    //   125: aload 6
    //   127: invokevirtual 169	com/aspose/cells/b/a/b/zr:b	(Lcom/aspose/cells/b/a/b/a/ze;)V
    //   130: aload_2
    //   131: invokevirtual 242	com/aspose/cells/zawn:l	()Lcom/aspose/cells/zkf;
    //   134: invokevirtual 262	com/aspose/cells/zkf:o	()Lcom/aspose/cells/zqy;
    //   137: invokevirtual 270	com/aspose/cells/zqy:a	()Lcom/aspose/cells/zjy;
    //   140: invokevirtual 256	com/aspose/cells/zjy:d	()Lcom/aspose/cells/zanr;
    //   143: invokevirtual 182	com/aspose/cells/zanr:c	()I
    //   146: ifeq +25 -> 171
    //   149: aload_2
    //   150: invokevirtual 242	com/aspose/cells/zawn:l	()Lcom/aspose/cells/zkf;
    //   153: invokevirtual 262	com/aspose/cells/zkf:o	()Lcom/aspose/cells/zqy;
    //   156: invokevirtual 270	com/aspose/cells/zqy:a	()Lcom/aspose/cells/zjy;
    //   159: invokevirtual 256	com/aspose/cells/zjy:d	()Lcom/aspose/cells/zanr;
    //   162: invokevirtual 180	com/aspose/cells/zanr:a	()Lcom/aspose/cells/Color;
    //   165: invokevirtual 127	com/aspose/cells/Color:isEmpty	()Z
    //   168: ifeq +18 -> 186
    //   171: aload 4
    //   173: getstatic 111	com/aspose/cells/zawk:a	I
    //   176: ineg
    //   177: i2f
    //   178: getstatic 111	com/aspose/cells/zawk:a	I
    //   181: ineg
    //   182: i2f
    //   183: invokevirtual 153	com/aspose/cells/b/a/b/zq:a	(FF)V
    //   186: aload 7
    //   188: aload 4
    //   190: invokevirtual 167	com/aspose/cells/b/a/b/zr:a	(Lcom/aspose/cells/b/a/b/zq;)V
    //   193: aload_1
    //   194: invokeinterface 287 1 0
    //   199: aload 7
    //   201: invokeinterface 285 2 0
    //   206: ifeq +34 -> 240
    //   209: aload 7
    //   211: invokevirtual 170	com/aspose/cells/b/a/b/zr:c	()V
    //   214: iconst_1
    //   215: istore 8
    //   217: aload 7
    //   219: ifnull +8 -> 227
    //   222: aload 7
    //   224: invokevirtual 168	com/aspose/cells/b/a/b/zr:b	()V
    //   227: aload 5
    //   229: ifnull +8 -> 237
    //   232: aload 5
    //   234: invokevirtual 140	com/aspose/cells/b/a/b/a/ze:h	()V
    //   237: iload 8
    //   239: ireturn
    //   240: aload 7
    //   242: invokevirtual 170	com/aspose/cells/b/a/b/zr:c	()V
    //   245: iconst_0
    //   246: istore 8
    //   248: aload 7
    //   250: ifnull +8 -> 258
    //   253: aload 7
    //   255: invokevirtual 168	com/aspose/cells/b/a/b/zr:b	()V
    //   258: aload 5
    //   260: ifnull +8 -> 268
    //   263: aload 5
    //   265: invokevirtual 140	com/aspose/cells/b/a/b/a/ze:h	()V
    //   268: iload 8
    //   270: ireturn
    //   271: astore 9
    //   273: aload 7
    //   275: ifnull +8 -> 283
    //   278: aload 7
    //   280: invokevirtual 168	com/aspose/cells/b/a/b/zr:b	()V
    //   283: aload 9
    //   285: athrow
    //   286: astore 10
    //   288: aload 5
    //   290: ifnull +8 -> 298
    //   293: aload 5
    //   295: invokevirtual 140	com/aspose/cells/b/a/b/a/ze:h	()V
    //   298: aload 10
    //   300: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	301	0	this	zawh
    //   0	301	1	paramzr	zr
    //   0	301	2	paramzawn	zawn
    //   0	301	3	paramzq	zq
    //   23	166	4	localzq	zq
    //   32	262	5	localze1	ze
    //   69	57	6	localze2	ze
    //   121	158	7	localzr	com.aspose.cells.b.a.b.zr
    //   215	54	8	bool	boolean
    //   271	13	9	localObject1	Object
    //   286	13	10	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   123	217	271	finally
    //   240	248	271	finally
    //   271	273	271	finally
    //   34	227	286	finally
    //   240	258	286	finally
    //   271	288	286	finally
  }
  
  private zo a(zr paramzr, zawn paramzawn, zt paramzt, float paramFloat)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.5F;
    int i1 = 0;
    zawn localzawn;
    zq localzq;
    if ((paramFloat < 90.0F) || ((paramFloat >= 180.0F) && (paramFloat < 270.0F)))
    {
      localzawn = a(paramzawn, 0.0F);
      i1 = 0;
      while (localzawn.f() < paramzawn.f() + paramzawn.g() / 2.0F)
      {
        localzawn = a(localzawn, f3);
        localzq = a(localzawn, paramzt);
        f1 += f3;
        if (a(paramzr, paramzawn, localzq))
        {
          f2 += f3;
          if (i1 == 0) {
            i1 = 1;
          }
        }
        else if (i1 != 0)
        {
          localzawn = a(paramzawn, 0.0F);
          localzawn = a(localzawn, f1 - f2 / 2.0F);
          localzq = a(localzawn, paramzt);
          return localzq.d();
        }
      }
      localzawn = a(paramzawn, 0.0F);
      i1 = 0;
      while (localzawn.f() > paramzawn.f() - paramzawn.g() / 2.0F)
      {
        localzawn = a(localzawn, -f3);
        localzq = a(localzawn, paramzt);
        f1 -= f3;
        if (a(paramzr, paramzawn, localzq))
        {
          f2 -= f3;
          if (i1 == 0) {
            i1 = 1;
          }
        }
        else if (i1 != 0)
        {
          localzawn = a(paramzawn, 0.0F);
          localzawn = a(localzawn, f1 - f2 / 2.0F);
          localzq = a(localzawn, paramzt);
          return localzq.d();
        }
      }
    }
    else
    {
      localzawn = a(paramzawn, 0.0F);
      i1 = 0;
      while (localzawn.f() > paramzawn.f() - paramzawn.g() / 2.0F)
      {
        localzawn = a(localzawn, -f3);
        localzq = a(localzawn, paramzt);
        f1 -= f3;
        if (a(paramzr, paramzawn, localzq))
        {
          f2 -= f3;
          if (i1 == 0) {
            i1 = 1;
          }
        }
        else if (i1 != 0)
        {
          localzawn = a(paramzawn, 0.0F);
          localzawn = a(localzawn, f1 - f2 / 2.0F);
          localzq = a(localzawn, paramzt);
          return localzq.d();
        }
      }
      localzawn = a(paramzawn, 0.0F);
      i1 = 0;
      while (localzawn.f() < paramzawn.f() + paramzawn.g() / 2.0F)
      {
        localzawn = a(localzawn, f3);
        localzq = a(localzawn, paramzt);
        f1 += f3;
        if (a(paramzr, paramzawn, localzq))
        {
          f2 += f3;
          if (i1 == 0) {
            i1 = 1;
          }
        }
        else if (i1 != 0)
        {
          localzawn = a(paramzawn, 0.0F);
          localzawn = a(localzawn, f1 - f2 / 2.0F);
          localzq = a(localzawn, paramzt);
          return localzq.d();
        }
      }
    }
    return zo.a();
  }
  
  private zawn a(zawn paramzawn, float paramFloat)
  {
    zawn localzawn = paramzawn.a(paramFloat);
    return localzawn;
  }
  
  private zq a(zawn paramzawn, zt paramzt)
  {
    float f1 = 0.485F;
    float f2 = 0.0F;
    float[] arrayOfFloat = { f2 };
    zo localzo = paramzawn.a(f1, arrayOfFloat);
    f2 = arrayOfFloat[0];
    if ((f2 <= 90.0F) || (f2 >= 270.0F)) {
      localzo.a(localzo.d() - paramzt.b());
    }
    if ((f2 >= 0.0F) && (f2 <= 180.0F)) {
      localzo.b(localzo.e() - paramzt.c());
    }
    return new zq(localzo, paramzt);
  }
  
  protected zq b()
  {
    zq localzq = this.g[0].k();
    for (int i1 = 1; i1 < this.g.length; i1++) {
      localzq = zq.a(localzq, this.g[i1].k());
    }
    return localzq;
  }
  
  protected void a(zq paramzq)
  {
    float f1 = this.c / paramzq.h();
    float f2 = this.d / paramzq.i();
    float f3 = paramzq.f() - this.a;
    float f4 = paramzq.g() - this.b;
    for (zawn localzawn : this.g)
    {
      float f5 = localzawn.i().f() - f3;
      float f6 = localzawn.i().g() - f4;
      float f7 = localzawn.i().h() * f1;
      float f8 = localzawn.i().i() * f2;
      float f9 = localzawn.j() * f2;
      localzawn.a(f5, f6, f7, f8, f9);
    }
  }
  
  protected float c()
  {
    float f1 = 0.0F;
    for (int i1 = 0; (i1 < this.o.length) && (i1 < this.i.length); i1++) {
      if (this.o[i1] > f1) {
        f1 = this.o[i1];
      }
    }
    return f1;
  }
  
  protected zt d()
  {
    float f1 = 1.0F + c();
    float f2 = this.c / f1;
    float f3 = this.d / f1 * (1.0F - this.e);
    return new zt(f2, f3);
  }
  
  protected zt e()
  {
    float f1 = c();
    float f2 = d().b() * f1;
    float f3 = d().c() * f1;
    return new zt(f2, f3);
  }
  
  protected float f()
  {
    return this.d / (1.0F + c()) * this.e;
  }
  
  protected void g()
  {
    double d1 = 0.0D;
    for (double d2 : this.i) {
      d1 += d2;
    }
    ??? = d();
    zt localzt = e();
    ??? = this.o.length - 1;
    float f1 = c();
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
      float f2 = this.o[i5];
      float f3 = this.o[i5];
      if (f2 > 0.0F)
      {
        localObject2 = a((float)(d3 + d5 / 2.0D), this.o[i5]);
        f2 = ((zt)localObject2).b();
        f3 = ((zt)localObject2).c();
      }
      Object localObject2 = null;
      if (i6 == this.t)
      {
        localObject2 = a(this.a + localzt.b() / 2.0F + f2, this.b + localzt.c() / 2.0F + f3, ((zt)???).b(), ((zt)???).c(), f(), (float)(d3 % 360.0D), (float)d5, this.k[i3], this.r, this.p, this.q);
      }
      else
      {
        zkf localzkf = (this.j != null) && (i6 < this.j.getCount()) ? this.j.b(i6) : null;
        localObject2 = a(this.a + localzt.b() / 2.0F + f2, this.b + localzt.c() / 2.0F + f3, ((zt)???).b(), ((zt)???).c(), f(), (float)(d3 % 360.0D), (float)d5, this.k[i3], this.r, this.p, this.q, localzkf);
      }
      ((zawn)localObject2).a(this.l[i6]);
      if ((i4 > -1) || ((d3 <= 270.0D) && (d3 + d5 > 270.0D)) || ((d3 >= 270.0D) && (d3 + d5 > 630.0D)))
      {
        i4++;
        localArrayList.add(i4, localObject2);
        this.h.add(i4, Integer.valueOf(i6));
      }
      else
      {
        com.aspose.cells.b.a.a.zf.a(localArrayList, localObject2);
        com.aspose.cells.b.a.a.zf.a(this.h, Integer.valueOf(i6));
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
    this.g = ((zawn[])com.aspose.cells.b.a.a.zf.a(localArrayList, zawn.class));
  }
  
  protected zawn a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8, zkf paramzkf)
  {
    return new zawn(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6 % 360.0F, paramFloat7, paramColor, paramInt1, paramInt2, paramFloat8, paramzkf);
  }
  
  protected zawn a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, Color paramColor, int paramInt1, int paramInt2, float paramFloat8)
  {
    Color localColor = zlm.a(paramColor, zlm.a);
    return new zawn(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6 % 360.0F, paramFloat7, localColor, paramInt1, paramInt2, paramFloat8);
  }
  
  protected zt a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return zt.a();
    }
    float f1 = (float)(d().b() * paramFloat2 / 2.0F * Math.cos(paramFloat1 * 3.141592653589793D / 180.0D));
    float f2 = (float)(d().c() * paramFloat2 / 2.0F * Math.sin(paramFloat1 * 3.141592653589793D / 180.0D));
    return new zt(f1, f2);
  }
  
  protected void b(zr paramzr)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    com.aspose.cells.b.a.a.zf.b(localArrayList, this.g);
    zawn localzawn1 = null;
    zawn[] arrayOfzawn;
    if ((this.g[0].b() > 90.0F) && (this.g[0].b() <= 270.0F) && (this.g[0].b() + this.g[0].c() > 450.0F))
    {
      localzawn1 = (zawn)localArrayList.get(0);
      arrayOfzawn = localzawn1.c(0.0F);
      localArrayList.set(0, arrayOfzawn[0]);
      if (arrayOfzawn[1].c() > 0.0F) {
        localArrayList.add(1, arrayOfzawn[1]);
      }
    }
    else if (((this.g[0].b() > 270.0F) && (this.g[0].b() + this.g[0].c() > 450.0F)) || ((this.g[0].b() < 90.0F) && (this.g[0].b() + this.g[0].c() > 270.0F)))
    {
      localzawn1 = (zawn)localArrayList.get(0);
      arrayOfzawn = localzawn1.c(180.0F);
      localArrayList.set(0, arrayOfzawn[1]);
      if (arrayOfzawn[1].c() > 0.0F) {
        com.aspose.cells.b.a.a.zf.a(localArrayList, arrayOfzawn[0]);
      }
    }
    localzawn1 = (zawn)localArrayList.get(0);
    localzawn1.a(paramzr);
    int i1 = 1;
    int i2 = localArrayList.size() - 1;
    while (i1 < i2)
    {
      zawn localzawn2 = (zawn)localArrayList.get(i2);
      float f1 = localzawn2.b() - 90.0F;
      if ((f1 > 180.0F) || (f1 < 0.0F)) {
        f1 = 0.0F;
      }
      zawn localzawn3 = (zawn)localArrayList.get(i1);
      float f2 = (450.0F - localzawn3.e()) % 360.0F;
      if ((f2 > 180.0F) || (f2 < 0.0F)) {
        f2 = 0.0F;
      }
      if (f2 >= f1)
      {
        localzawn3.a(paramzr);
        i1++;
      }
      else if (f2 < f1)
      {
        localzawn2.a(paramzr);
        i2--;
      }
    }
    localzawn1 = (zawn)localArrayList.get(i2);
    localzawn1.a(paramzr);
  }
  
  protected void c(zr paramzr)
    throws Exception
  {
    for (zawn localzawn : this.g) {
      localzawn.f(paramzr);
    }
  }
  
  protected void d(zr paramzr)
    throws Exception
  {
    for (zawn localzawn : this.g) {
      localzawn.g(paramzr);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */