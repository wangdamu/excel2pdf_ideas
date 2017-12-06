package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.List;

final class zayk
{
  static ArrayList a(zr paramzr, zbfc paramzbfc, zp paramzp, int paramInt)
    throws Exception
  {
    zje localzje = paramzbfc.v();
    int i = paramzbfc.af();
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = 57;
    arrayOfInt[1] = 58;
    arrayOfInt[2] = 59;
    zbs localzbs2;
    zbs localzbs1;
    if (i == 1)
    {
      localzbs2 = localzje.e();
      localzbs1 = localzje.E();
    }
    else
    {
      localzbs2 = localzje.g();
      localzbs1 = localzje.G();
    }
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    zbfe localzbfe = localzje.z();
    int j = localzbfe.getCount();
    ArrayList localArrayList1 = new ArrayList();
    double d3 = paramzp.c() + paramzp.e() / 2.0D;
    double d4 = paramzp.d() + paramzp.f() / 2.0D;
    double d5 = paramzp.e() / 2;
    double d6 = 6.283185307179586D / paramInt;
    int k = paramzbfc.ai();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    zkg localzkg = paramzbfc.D();
    double d7 = 1.5707963267948966D;
    for (int m = 0; m < paramInt; m++)
    {
      zke localzke = localzkg.b(m);
      double d8;
      double d9;
      double d10;
      double d11;
      zo localzo;
      if ((localzke != null) && (!localzke.a()) && (!localzke.J()))
      {
        d8 = Math.abs(localzke.w() - d2);
        d9 = d5 * d8 / (d1 - d2);
        d10 = d3 + d9 * Math.cos(d7);
        d11 = d4 - d9 * Math.sin(d7);
        localzo = new zo((float)d10, (float)d11);
        zf.a(localArrayList2, localzo);
        zf.a(localArrayList3, Integer.valueOf(m));
        zf.a(localArrayList4, localzo);
        zana.a(paramzr, (float)d10, (float)d11, paramzbfc.B(), paramzbfc.B().c(), false);
        zqx localzqx = localzke.o();
        zt localzt = zqz.a(paramzr, localzbs2, localzbfe, k, m, (int)d5);
        double d12 = d9 + localzt.b() / 2.0F + localzt.c() / 2.0F;
        double d13 = d3 + d12 * Math.cos(d7);
        double d14 = d4 - d12 * Math.sin(d7);
        Object[] arrayOfObject = new Object[5];
        arrayOfObject[0] = Integer.valueOf(k);
        arrayOfObject[1] = Integer.valueOf(m);
        arrayOfObject[2] = new zo((float)d13, (float)d14);
        arrayOfObject[3] = localzbs2;
        arrayOfObject[4] = Double.valueOf(d5);
        zf.a(localArrayList1, arrayOfObject);
      }
      else
      {
        zf.a(localArrayList2, null);
        zf.a(localArrayList3, Integer.valueOf(m));
        zf.a(localArrayList4, new zo((float)d3, (float)d4));
      }
      if (m == paramInt - 1)
      {
        localzke = localzkg.b(0);
        if ((localzke != null) && (!localzke.a()))
        {
          d8 = Math.abs(localzke.w() - d2);
          d9 = d5 * d8 / (d1 - d2);
          d10 = d3 + d9 * Math.cos(1.5707963267948966D);
          d11 = d4 - d9 * Math.sin(1.5707963267948966D);
          localzo = new zo((float)d10, (float)d11);
          zf.a(localArrayList2, localzo);
        }
        else
        {
          zf.a(localArrayList2, null);
        }
        zf.a(localArrayList3, Integer.valueOf(m));
      }
      d7 -= d6;
    }
    if (paramzbfc.ag() != 59)
    {
      zs localzs = zanv.a(paramzbfc.z());
      zlq.a(paramzr, paramzbfc, localArrayList2, localArrayList3, localzs, paramzp);
      localzs.dispose();
    }
    else
    {
      a(paramzr, localArrayList4, paramzbfc);
    }
    return localArrayList1;
  }
  
  static void a(zr paramzr, zje paramzje, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zo localzo = (zo)arrayOfObject[2];
      zbs localzbs = (zbs)arrayOfObject[3];
      int m = ze.f(arrayOfObject[4]);
      zlq.a(paramzr, localzbs, j, k, localzo, m);
    }
  }
  
  private static void a(zr paramzr, List paramList, zbfc paramzbfc)
    throws Exception
  {
    zo[] arrayOfzo = new zo[paramList.size()];
    zbxz.a(arrayOfzo);
    for (int i = 0; i < paramList.size(); i++)
    {
      localObject1 = (zo)paramList.get(i);
      arrayOfzo[i] = localObject1;
      zke localzke = paramzbfc.D().b(i);
      if (localzke != null) {
        localzke.a(new zq(((zo)localObject1).d(), ((zo)localObject1).e(), 0.0F, 0.0F));
      }
    }
    zq localzq = zba.a(arrayOfzo);
    Object localObject1 = zbd.a(paramzbfc.A(), localzq);
    try
    {
      paramzr.a((zc)localObject1, arrayOfzo);
    }
    finally
    {
      if (localObject1 != null) {
        ((zc)localObject1).f();
      }
    }
    paramzr.c(zanv.a(paramzbfc.z()), arrayOfzo);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */