package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;
import java.util.Iterator;

class zbis
  extends zcp
{
  zbis(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  ze[] c()
  {
    zq localzq = new zq(this.e.y().f(), this.e.y().g(), this.e.y().h(), this.e.y().i());
    ze localze = new ze();
    if (this.e.c() == null) {
      return null;
    }
    zadf localzadf = this.e.c();
    int i = localzadf.a().size();
    Object localObject = null;
    ze[] arrayOfze = new ze[i];
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = (int)localzq.f();
    float f12 = (int)localzq.g();
    int j = (int)localzq.h();
    int k = (int)localzq.i();
    float f13 = 0.0F;
    float f14 = 0.0F;
    for (int m = 0; m < i; m++)
    {
      f1 = (int)((zadd)localzadf.a().get(m)).c();
      f2 = (int)((zadd)localzadf.a().get(m)).b();
      if (f1 == 0.0F) {
        f13 = 0.013888889F * zbxp.a() / (float)znq.j;
      } else {
        f13 = j / f1;
      }
      if (f2 == 0.0F) {
        f14 = 0.013888889F * zbxp.a() / (float)znq.j;
      } else {
        f14 = k / f2;
      }
      Iterator localIterator = ((zadd)localzadf.a().get(m)).a().iterator();
      while (localIterator.hasNext())
      {
        zapy localzapy = (zapy)localIterator.next();
        zn[] arrayOfzn = new zn[4];
        if ((localzapy.b().size() != 0) || (localzapy.b().size() == 1))
        {
          arrayOfzn[0] = ((zn)localzapy.b().get(0));
        }
        else if (localzapy.b().size() == 2)
        {
          arrayOfzn[0] = ((zn)localzapy.b().get(0));
          arrayOfzn[1] = ((zn)localzapy.b().get(1));
        }
        else if (localzapy.b().size() == 3)
        {
          arrayOfzn[0] = ((zn)localzapy.b().get(0));
          arrayOfzn[1] = ((zn)localzapy.b().get(1));
          arrayOfzn[2] = ((zn)localzapy.b().get(2));
        }
        else if (localzapy.b().size() == 4)
        {
          arrayOfzn[0] = ((zn)localzapy.b().get(0));
          arrayOfzn[1] = ((zn)localzapy.b().get(1));
          arrayOfzn[2] = ((zn)localzapy.b().get(2));
          arrayOfzn[3] = ((zn)localzapy.b().get(3));
        }
        switch (localzapy.a())
        {
        case 3: 
          localze.j();
          break;
        case 2: 
          localze.k();
          f3 = a(arrayOfzn[0].a(), f13) + f11;
          f4 = a(arrayOfzn[0].b(), f14) + f12;
          break;
        case 0: 
          f5 = a(arrayOfzn[1].a(), f13) + f11;
          f6 = a(arrayOfzn[1].b(), f14) + f12;
          localze.b(f3, f4, f5, f6);
          f3 = f5;
          f4 = f6;
          break;
        case 1: 
          f5 = a(arrayOfzn[1].a(), f13) + f11;
          f6 = a(arrayOfzn[1].b(), f14) + f12;
          f7 = a(arrayOfzn[2].a(), f13) + f11;
          f8 = a(arrayOfzn[2].b(), f14) + f12;
          f9 = a(arrayOfzn[3].a(), f13) + f11;
          f10 = a(arrayOfzn[3].b(), f14) + f12;
          localze.a(f3, f4, f5, f6, f7, f8, f9, f10);
          f3 = f9;
          f4 = f10;
          break;
        case 5: 
          f5 = a(arrayOfzn[1].a(), f13);
          f6 = a(arrayOfzn[1].b(), f14);
          f7 = arrayOfzn[2].a();
          f8 = arrayOfzn[2].b();
          zo localzo1 = a(f3, f4, f5, f6, f7);
          localze.a(localzo1.d(), localzo1.e(), f5 * 2.0F, f6 * 2.0F, f7, f8);
          zo localzo2 = localze.i();
          f3 = localzo2.d();
          f4 = localzo2.e();
        }
      }
      arrayOfze[m] = localze;
    }
    return arrayOfze;
  }
  
  private float a(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 * paramFloat2;
  }
  
  private zo a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    double d = paramFloat5 / 180.0F * 3.141592653589793D;
    float f1 = paramFloat1 - paramFloat3 * (float)Math.cos(d);
    float f2 = paramFloat2 - paramFloat4 * (float)Math.sin(d);
    zo localzo = new zo(f1 - paramFloat3, f2 - paramFloat4);
    return localzo;
  }
  
  void b()
    throws Exception
  {
    ze[] arrayOfze = c();
    if (arrayOfze == null) {
      return;
    }
    int i = arrayOfze.length;
    if (i > 0)
    {
      float f1 = this.e.y().f();
      float f2 = this.e.y().g();
      float f3 = this.e.y().h();
      float f4 = this.e.y().i();
      zq localzq = new zq(f1, f2, f3, f4);
      zf localzf = this.a.d();
      this.a.a(4, true);
      ze localze = new ze();
      localze.b(localzq);
      zc localzc = zbyb.a(this.e.z(), localze);
      zs localzs = zbyb.a(this.e.A());
      for (int j = 0; j < i; j++)
      {
        if (!this.e.z().a()) {
          this.a.a(localzc, arrayOfze[j]);
        }
        if (!this.e.A().a()) {
          this.a.a(localzs, arrayOfze[j]);
        }
      }
      super.a();
      this.a.a(localzf);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */