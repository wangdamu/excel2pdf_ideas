package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;
import java.util.Iterator;

class zbir
  extends zco
{
  zbir(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  private zaef[] c(zq paramzq)
  {
    ze localze = null;
    if (this.e.c() == null) {
      return null;
    }
    zade localzade = this.e.c();
    int i = localzade.a().size();
    zaef[] arrayOfzaef = new zaef[i];
    for (int j = 0; j < i; j++) {
      arrayOfzaef[j] = new zaef();
    }
    j = 0;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    int m = (int)paramzq.f();
    int n = (int)paramzq.g();
    int i1 = (int)paramzq.h();
    int i2 = (int)paramzq.i();
    zadc localzadc = null;
    for (int i3 = 0; i3 < i; i3++)
    {
      localzadc = (zadc)localzade.a().get(i3);
      j = (int)localzadc.c();
      k = (int)localzadc.b();
      if (j == 0) {
        j = 1;
      }
      if (k == 0) {
        k = 1;
      }
      localze = new ze();
      Iterator localIterator = ((zadc)localzade.a().get(i3)).a().iterator();
      while (localIterator.hasNext())
      {
        zapx localzapx = (zapx)localIterator.next();
        zn[] arrayOfzn = new zn[4];
        if ((localzapx.b().size() != 0) || (localzapx.b().size() == 1))
        {
          arrayOfzn[0] = ((zn)localzapx.b().get(0));
        }
        else if (localzapx.b().size() == 2)
        {
          arrayOfzn[0] = ((zn)localzapx.b().get(0));
          arrayOfzn[1] = ((zn)localzapx.b().get(1));
        }
        else if (localzapx.b().size() == 4)
        {
          arrayOfzn[0] = ((zn)localzapx.b().get(0));
          arrayOfzn[1] = ((zn)localzapx.b().get(1));
          arrayOfzn[2] = ((zn)localzapx.b().get(2));
          arrayOfzn[3] = ((zn)localzapx.b().get(3));
        }
        switch (localzapx.a())
        {
        case 3: 
          localze.j();
          break;
        case 2: 
          localze.k();
          f1 = arrayOfzn[0].a() / j * i1 + m;
          f2 = arrayOfzn[0].b() / k * i2 + n;
          break;
        case 0: 
          f3 = arrayOfzn[1].a() / j * i1 + m;
          f4 = arrayOfzn[1].b() / k * i2 + n;
          localze.b(f1, f2, f3, f4);
          f1 = f3;
          f2 = f4;
          break;
        case 1: 
          f3 = arrayOfzn[1].a() / j * i1 + m;
          f4 = arrayOfzn[1].b() / k * i2 + n;
          f5 = arrayOfzn[2].a() / j * i1 + m;
          f6 = arrayOfzn[2].b() / k * i2 + n;
          f7 = arrayOfzn[3].a() / j * i1 + m;
          f8 = arrayOfzn[3].b() / k * i2 + n;
          localze.a(f1, f2, f3, f4, f5, f6, f7, f8);
          f1 = f7;
          f2 = f8;
        }
      }
      arrayOfzaef[i3].a = localze;
      arrayOfzaef[i3].c = localzadc.e();
      arrayOfzaef[i3].b = localzadc.d();
    }
    return arrayOfzaef;
  }
  
  void c()
    throws Exception
  {
    float f1 = this.e.l().f();
    float f2 = this.e.l().g();
    float f3 = this.e.l().h();
    float f4 = this.e.l().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    zs localzs = zbya.a(this.e.n());
    zaef[] arrayOfzaef = c(localzq);
    zc localzc = null;
    if (arrayOfzaef == null) {
      return;
    }
    int i = arrayOfzaef.length;
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i; j++)
    {
      if ((!this.e.m().a()) && (arrayOfzaef[j].c))
      {
        localzc = zbya.a(this.e.m(), arrayOfzaef[j].a);
        this.a.a(localzc, arrayOfzaef[j].a);
      }
      if ((!this.e.n().a()) && (arrayOfzaef[j].b)) {
        this.a.a(localzs, arrayOfzaef[j].a);
      }
    }
    super.b();
    this.a.a(localzf);
  }
  
  void a()
    throws Exception
  {
    c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */