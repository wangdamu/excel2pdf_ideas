package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.List;

final class zayl
{
  static ArrayList a(zr paramzr, zbfd paramzbfd, zp paramzp, int paramInt)
    throws Exception
  {
    zjf localzjf = paramzbfd.v();
    int i = paramzbfd.ah();
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = 57;
    arrayOfInt[1] = 58;
    arrayOfInt[2] = 59;
    zbt localzbt2;
    zbt localzbt1;
    if (i == 1)
    {
      localzbt2 = localzjf.e();
      localzbt1 = localzjf.G();
    }
    else
    {
      localzbt2 = localzjf.g();
      localzbt1 = localzjf.I();
    }
    zbff localzbff = localzjf.z();
    int j = localzbff.getCount();
    ArrayList localArrayList1 = new ArrayList();
    double d1 = paramzp.c() + paramzp.e() / 2.0D;
    double d2 = paramzp.d() + paramzp.f() / 2.0D;
    double d3 = paramzp.e() / 2;
    double d4 = 6.283185307179586D / paramInt;
    int k = paramzbfd.ak();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    zkh localzkh = paramzbfd.F();
    double d5 = 1.5707963267948966D;
    for (int m = 0; m < paramInt; m++)
    {
      zkf localzkf = localzkh.b(m);
      double d6;
      double d7;
      double d8;
      double d9;
      zo localzo;
      if (localzkf != null)
      {
        d6 = Math.abs(localzkf.w() - localzbt1.D());
        d7 = d3 * d6 / (localzbt1.z() - localzbt1.D());
        d8 = d1 + d7 * Math.cos(d5);
        d9 = d2 - d7 * Math.sin(d5);
        localzo = new zo((float)d8, (float)d9);
        zf.a(localArrayList2, localzo);
        zf.a(localArrayList3, Integer.valueOf(m));
        zf.a(localArrayList4, localzo);
        localzkf.m().a((float)d8, (float)d9);
        zqy localzqy = localzkf.o();
        zt localzt = zra.a(paramzr, localzbt2, localzbff, k, m, (int)d3);
        double d10 = d7 + localzt.b() / 2.0F + localzt.c() / 2.0F;
        double d11 = d1 + d10 * Math.cos(d5);
        double d12 = d2 - d10 * Math.sin(d5);
        if ((d11 > 0.0D) && (d12 > 0.0D) && (d11 < localzjf.a()) && (d12 < localzjf.b()))
        {
          Object[] arrayOfObject = new Object[5];
          arrayOfObject[0] = Integer.valueOf(k);
          arrayOfObject[1] = Integer.valueOf(m);
          arrayOfObject[2] = new zo((float)d11, (float)d12);
          arrayOfObject[3] = localzbt2;
          arrayOfObject[4] = Double.valueOf(d3);
          zf.a(localArrayList1, arrayOfObject);
        }
      }
      else
      {
        zf.a(localArrayList2, null);
        zf.a(localArrayList3, Integer.valueOf(m));
        zf.a(localArrayList4, new zo((float)d1, (float)d2));
      }
      if (m == paramInt - 1)
      {
        localzkf = localzkh.b(0);
        if (localzkf != null)
        {
          d6 = Math.abs(localzkf.w() - localzbt1.D());
          d7 = d3 * d6 / (localzbt1.z() - localzbt1.D());
          d8 = d1 + d7 * Math.cos(1.5707963267948966D);
          d9 = d2 - d7 * Math.sin(1.5707963267948966D);
          localzo = new zo((float)d8, (float)d9);
          zf.a(localArrayList2, localzo);
          zf.a(localArrayList3, Integer.valueOf(0));
        }
        else
        {
          zf.a(localArrayList2, null);
          zf.a(localArrayList3, Integer.valueOf(0));
        }
      }
      d5 -= d4;
    }
    if (paramzbfd.ai() != 59) {
      zlr.a(paramzr, paramzbfd, localArrayList2, localArrayList3, paramzp);
    } else {
      a(paramzr, localArrayList4, paramzbfd);
    }
    return localArrayList1;
  }
  
  static void a(zr paramzr, zjf paramzjf, ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Object[] arrayOfObject = (Object[])paramArrayList.get(i);
      int j = ((Integer)arrayOfObject[0]).intValue();
      int k = ((Integer)arrayOfObject[1]).intValue();
      zo localzo = (zo)arrayOfObject[2];
      zbt localzbt = (zbt)arrayOfObject[3];
      int m = com.aspose.cells.b.a.ze.f(arrayOfObject[4]);
      zlr.a(paramzr, localzbt, j, k, localzo, m);
    }
  }
  
  private static void a(zr paramzr, List paramList, zbfd paramzbfd)
    throws Exception
  {
    zo[] arrayOfzo = new zo[paramList.size()];
    zbxz.a(arrayOfzo);
    for (int i = 0; i < paramList.size(); i++)
    {
      zo localzo = (zo)paramList.get(i);
      arrayOfzo[i] = localzo;
      zkf localzkf = paramzbfd.F().b(i);
      if (localzkf != null) {
        localzkf.a(new zq(localzo.d(), localzo.e(), 0.0F, 0.0F));
      }
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(arrayOfzo);
    paramzbfd.A().a(localze);
    paramzbfd.z().a(localze);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */