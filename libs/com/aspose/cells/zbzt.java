package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import java.util.ArrayList;
import java.util.List;

final class zbzt
{
  static ArrayList a(zr paramzr, zbfc paramzbfc, zp paramzp, float paramFloat, double paramDouble, int paramInt)
  {
    zje localzje = paramzbfc.v();
    int i = paramzbfc.af();
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
    double d1 = localzbs1.n() ? zbxz.e(localzbs1.D()) : localzbs1.D();
    double d2 = localzbs1.n() ? zbxz.e(localzbs1.z()) : localzbs1.z();
    paramDouble = localzbs1.n() ? zbxz.e(paramDouble) : paramDouble;
    double d3 = localzbs2.n() ? zbxz.e(localzbs2.D()) : localzbs2.D();
    double d4 = localzbs2.n() ? zbxz.e(localzbs2.z()) : localzbs2.z();
    boolean bool = paramzbfc.L();
    zanq localzanq1 = paramzbfc.O();
    zanq localzanq2 = paramzbfc.P();
    zjx localzjx1 = paramzbfc.S();
    zjx localzjx2 = paramzbfc.T();
    ArrayList localArrayList1 = new ArrayList();
    double d5 = paramzp.e() / (d4 - d3);
    int j = paramInt;
    if (localzbs2.p)
    {
      j = (int)localzbs2.z();
      if (localzbs2.f()) {
        d5 = paramzp.e() / (d4 - d3 + 1.0D);
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    zkg localzkg = paramzbfc.D();
    for (int k = 0; k < j; k++)
    {
      zke localzke = localzkg.b(k);
      if ((localzke != null) && (!localzke.a()) && (!localzke.b()) && (!localzke.J()))
      {
        double d6 = (float)d5 * (localzke.q() - d3);
        if (localzbs2.f()) {
          d6 += (float)d5 / 2.0F;
        }
        if (localzbs2.p()) {
          d6 = paramzp.c() + paramzp.e() - d6;
        } else {
          d6 = paramzp.c() + d6;
        }
        double d7 = paramFloat;
        double d8 = localzke.w();
        double d9 = (d8 - paramDouble) / (d2 - d1) * paramzp.f();
        zub localzub1 = paramzbfc.y();
        zo localzo1 = new zo((float)d6, paramFloat);
        double d10 = 0.0D;
        double d11 = 0.0D;
        float f1 = 0.0F;
        float f2 = 0.0F;
        if (localzub1 != null)
        {
          switch (localzub1.g())
          {
          case 1: 
            d10 = localzub1.c();
            d11 = d10;
            break;
          case 2: 
            d10 = localzub1.c() * localzke.q() / 100.0D;
            d11 = -d10;
            break;
          case 0: 
            double d12 = localzub1.e().size() > k ? localzub1.a(localzub1.e().get(k)) : 0.0D;
            d10 = d12;
            d12 = localzub1.f().size() > k ? localzub1.a(localzub1.f().get(k)) : 0.0D;
            d11 = d12;
          }
          f1 = (float)(d10 / (d4 - d3) * paramzp.e());
          f2 = (float)(d11 / (d4 - d3) * paramzp.e());
          if (!localzbs1.p()) {
            localzo1.b(localzo1.e() - (float)d9);
          } else {
            localzo1.b(localzo1.e() + (float)d9);
          }
        }
        localzub1.a(localzo1, f1, f2);
        zub localzub2 = paramzbfc.x();
        d10 = 0.0D;
        d11 = 0.0D;
        f1 = 0.0F;
        f2 = 0.0F;
        if (localzub2 != null)
        {
          switch (localzub2.g())
          {
          case 1: 
            d10 = localzub2.c();
            d11 = d10;
            break;
          case 2: 
            d10 = localzub2.c() * localzke.w() / 100.0D;
            d11 = -d10;
            break;
          case 0: 
            double d13 = localzub2.e().size() > k ? localzub2.a(localzub2.e().get(k)) : 0.0D;
            d10 = d13;
            d13 = localzub2.f().size() > k ? localzub2.a(localzub2.f().get(k)) : 0.0D;
            d11 = d13;
          }
          f1 = (float)d10 / (float)(d2 - d1) * paramzp.f();
          f2 = (float)d11 / (float)(d2 - d1) * paramzp.f();
        }
        localzub2.a(localzo1, f1, f2);
        if (!localzbs1.p()) {
          d7 -= d9;
        } else {
          d7 += d9;
        }
        zo localzo2 = new zo((float)d6, (float)d7);
        zf.a(localArrayList2, localzo2);
        zf.a(localArrayList3, Integer.valueOf(k));
        zqx localzqx = localzke.o();
        if (localzqx.t())
        {
          Object[] arrayOfObject = new Object[4];
          arrayOfObject[0] = Integer.valueOf(paramzbfc.ai());
          arrayOfObject[1] = Integer.valueOf(k);
          arrayOfObject[2] = localzo2;
          arrayOfObject[3] = localzbs2;
          zf.a(localArrayList1, arrayOfObject);
        }
      }
      else
      {
        zf.a(localArrayList2, null);
        zf.a(localArrayList3, Integer.valueOf(k));
      }
    }
    zs localzs = zanv.a(paramzbfc.z());
    zlq.a(paramzr, paramzbfc, localArrayList2, localArrayList3, localzs, paramzp);
    zlq.a(paramzr, paramzbfc, localArrayList2, paramzp);
    localzs.dispose();
    return localArrayList1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */