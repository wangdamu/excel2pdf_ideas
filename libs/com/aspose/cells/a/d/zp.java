package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zh;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;

public class zp
  extends zd
  implements zbv
{
  private zx a;
  private zc b;
  private zi c;
  private zp d;
  private int e = 0;
  
  public zp() {}
  
  public zp(zx paramzx)
  {
    this.a = paramzx;
  }
  
  public zp(com.aspose.cells.b.a.b.zq paramzq)
  {
    zq localzq = new zq(paramzq.d());
    localzq.a(true);
    a(localzq);
    zu localzu = new zu(new float[] { paramzq.l(), paramzq.k(), paramzq.l(), paramzq.m(), paramzq.j(), paramzq.m() });
    localzq.a(localzu);
  }
  
  public zx d()
  {
    return this.a;
  }
  
  public void a(zx paramzx)
  {
    this.a = paramzx;
  }
  
  public zc e()
  {
    return this.b;
  }
  
  public void a(zc paramzc)
  {
    this.b = paramzc;
  }
  
  public zi a()
  {
    return this.c;
  }
  
  public void a(zi paramzi)
  {
    this.c = paramzi;
  }
  
  public zp b()
  {
    return this.d;
  }
  
  public boolean c()
  {
    return d() != null;
  }
  
  public int f()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(zf paramzf)
    throws Exception
  {
    if (b(paramzf))
    {
      zc localzc = e();
      if ((localzc != null) && (((localzc instanceof zh)) || ((localzc instanceof zr)) || ((localzc instanceof zv))))
      {
        zb localzb1;
        if ((localzc instanceof zh)) {
          localzb1 = zj.a((zh)localzc);
        } else if ((localzc instanceof zr)) {
          localzb1 = zj.a((zr)localzc);
        } else {
          localzb1 = zj.a((zv)localzc);
        }
        zb localzb2 = new zb();
        localzb2.a(this);
        localzb1.a(a());
        localzb2.a(localzb1);
        localzb2.a(paramzf);
        return;
      }
    }
    paramzf.a(this);
    super.a(paramzf);
    paramzf.b(this);
  }
  
  public static zp a(zo paramzo1, zo paramzo2, zo paramzo3)
  {
    zp localzp = new zp();
    zq localzq = new zq(paramzo1);
    localzq.a(true);
    localzp.a(localzq);
    zu localzu = new zu(new float[] { paramzo2.d(), paramzo2.e(), paramzo3.d(), paramzo3.e(), paramzo1.d(), paramzo1.e() });
    localzq.a(localzu);
    return localzp;
  }
  
  public static zp a(com.aspose.cells.b.a.b.zq paramzq)
  {
    float f = 0.2761424F;
    zp localzp = new zp();
    zq localzq = new zq(paramzq.d());
    localzq.a(true);
    localzp.a(localzq);
    zo localzo1 = new zo(paramzq.h() * f, paramzq.i() * f);
    zo localzo2 = new zo(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
    zo[] arrayOfzo = new zo[13];
    for (int i = 0; i < 13; i++) {
      arrayOfzo[i] = new zo();
    }
    arrayOfzo[0].a(paramzq.j());
    arrayOfzo[1].a(paramzq.j());
    arrayOfzo[11].a(paramzq.j());
    arrayOfzo[12].a(paramzq.j());
    arrayOfzo[5].a(paramzq.l());
    arrayOfzo[6].a(paramzq.l());
    arrayOfzo[7].a(paramzq.l());
    arrayOfzo[2].a(localzo2.d() - localzo1.d());
    arrayOfzo[10].a(localzo2.d() - localzo1.d());
    arrayOfzo[4].a(localzo2.d() + localzo1.d());
    arrayOfzo[8].a(localzo2.d() + localzo1.d());
    arrayOfzo[3].a(localzo2.d());
    arrayOfzo[9].a(localzo2.d());
    arrayOfzo[2].b(paramzq.k());
    arrayOfzo[3].b(paramzq.k());
    arrayOfzo[4].b(paramzq.k());
    arrayOfzo[8].b(paramzq.m());
    arrayOfzo[9].b(paramzq.m());
    arrayOfzo[10].b(paramzq.m());
    arrayOfzo[7].b(localzo2.e() + localzo1.e());
    arrayOfzo[11].b(localzo2.e() + localzo1.e());
    arrayOfzo[1].b(localzo2.e() - localzo1.e());
    arrayOfzo[5].b(localzo2.e() - localzo1.e());
    arrayOfzo[0].b(localzo2.e());
    arrayOfzo[12].b(localzo2.e());
    arrayOfzo[6].b(localzo2.e());
    zt localzt = new zt();
    for (int j = 0; j < 12; j += 3)
    {
      zy localzy = new zy();
      localzy.a(arrayOfzo[(j + 0)]);
      localzy.b(arrayOfzo[(j + 1)]);
      localzy.c(arrayOfzo[(j + 2)]);
      localzy.d(arrayOfzo[(j + 3)]);
      localzt.a(localzy);
    }
    localzq.a(localzt);
    localzq.a(arrayOfzo[0]);
    return localzp;
  }
  
  public static zp b(com.aspose.cells.b.a.b.zq paramzq)
  {
    zp localzp = new zp();
    zq localzq = new zq(paramzq.d());
    localzq.a(true);
    localzp.a(localzq);
    zu localzu = new zu(new float[] { paramzq.l(), paramzq.k(), paramzq.l(), paramzq.m(), paramzq.j(), paramzq.m() });
    localzq.a(localzu);
    return localzp;
  }
  
  public static zp a(zo paramzo1, zo paramzo2)
  {
    zp localzp = new zp();
    zq localzq = new zq(paramzo1);
    localzp.a(localzq);
    zu localzu = new zu(new float[] { paramzo2.d(), paramzo2.e() });
    localzq.a(localzu);
    return localzp;
  }
  
  public static zp a(zo[] paramArrayOfzo, boolean paramBoolean)
  {
    zp localzp = new zp();
    localzp.a(zq.a(paramArrayOfzo, paramBoolean));
    return localzp;
  }
  
  private boolean b(zf paramzf)
  {
    return (!(paramzf instanceof zbh)) && ((!(paramzf instanceof zhp)) || (!((zhp)paramzf).d()));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */