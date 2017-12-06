package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.b.a.za;
import com.aspose.cells.b.a.b.a.zh;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.a.zk;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import java.util.ArrayList;

final class zbyb
{
  static com.aspose.cells.b.a.b.zg a = new com.aspose.cells.b.a.b.zg("Arial", 8.0F);
  
  static com.aspose.cells.a.d.zs a(zanu paramzanu)
  {
    return a(paramzanu, null);
  }
  
  static com.aspose.cells.a.d.zs a(zanu paramzanu, com.aspose.cells.b.a.b.a.ze paramze)
  {
    if (paramzanu.a()) {
      return new com.aspose.cells.a.d.zs(Color.getEmpty());
    }
    com.aspose.cells.a.d.zs localzs = null;
    Color localColor = paramzanu.b();
    if (paramzanu.a) {
      localColor = a(localColor, false);
    }
    if (paramzanu.d() != 0)
    {
      localzs = new com.aspose.cells.a.d.zs(localColor, paramzanu.h());
    }
    else
    {
      if ((paramzanu.p() == 3) && (paramze != null))
      {
        com.aspose.cells.b.a.b.zc localzc = paramzanu.o().a(paramze, null, false, 1.0F);
        if (paramzanu.a) {
          localzc = a(localzc, false);
        }
        localzs = new com.aspose.cells.a.d.zs(localzc, paramzanu.h());
      }
      else
      {
        localzs = new com.aspose.cells.a.d.zs(localColor, paramzanu.h());
      }
      switch (paramzanu.c())
      {
      case 6: 
        localzs.b(0);
        break;
      case 5: 
        localzs.b(2);
        localzs.a(2);
        break;
      case 7: 
        localzs.b(2);
        break;
      case 0: 
        localzs.b(5);
        localzs.b(new float[] { 4.0F, 4.0F });
        break;
      case 1: 
        localzs.b(5);
        localzs.b(new float[] { 4.0F, 3.0F, 1.0F, 3.0F });
        break;
      case 2: 
        localzs.b(2);
        break;
      case 3: 
        localzs.b(2);
        break;
      case 4: 
        localzs.b(2);
      }
    }
    switch (paramzanu.f())
    {
    case 1: 
      localzs.a(2);
      break;
    }
    switch (paramzanu.e())
    {
    case 4: 
      localzs.a(new float[] { 0.0F, 0.33333334F, 0.6666667F, 1.0F });
      break;
    case 2: 
      localzs.a(new float[] { 0.0F, 0.2F, 0.4F, 1.0F });
      break;
    case 3: 
      localzs.a(new float[] { 0.0F, 0.6F, 0.8F, 1.0F });
      break;
    case 1: 
      localzs.a(new float[] { 0.0F, 0.16666667F, 0.33333334F, 0.6666667F, 0.8333333F, 1.0F });
    }
    a(localzs, paramzanu);
    return localzs;
  }
  
  private static void a(com.aspose.cells.a.d.zs paramzs, zanu paramzanu)
  {
    if (paramzanu.i() != 0) {
      a(paramzs, paramzanu.i(), paramzanu.j(), paramzanu.k(), true, paramzanu);
    } else if (paramzanu.f() == 1) {
      paramzs.e(2);
    }
    if (paramzanu.l() != 0) {
      a(paramzs, paramzanu.l(), paramzanu.m(), paramzanu.n(), false, paramzanu);
    } else if (paramzanu.f() == 1) {
      paramzs.c(2);
    }
    switch (paramzanu.g())
    {
    case 1: 
      paramzs.d(1);
      break;
    case 2: 
      paramzs.d(0);
      break;
    case 0: 
      paramzs.d(2);
      break;
    }
  }
  
  private static void a(com.aspose.cells.a.d.zs paramzs, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, zanu paramzanu)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (paramzanu.h() <= 1.0F)
    {
      if (paramInt2 == 0) {
        switch (paramInt1)
        {
        case 1: 
          f1 = 2.5F;
          break;
        case 3: 
          f1 = 4.0F;
          break;
        case 5: 
          f1 = 8.0F;
          break;
        case 4: 
          f1 = 4.0F;
          break;
        case 2: 
          f1 = 4.0F;
        }
      } else if (paramInt2 == 1) {
        switch (paramInt1)
        {
        case 1: 
          f1 = 4.0F;
          break;
        case 3: 
          f1 = 4.0F;
          break;
        case 5: 
          f1 = 8.0F;
          break;
        case 4: 
          f1 = 4.0F;
          break;
        case 2: 
          f1 = 4.0F;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
          f1 = 4.0F;
          break;
        case 3: 
          f1 = 4.0F;
          break;
        case 5: 
          f1 = 8.0F;
          break;
        case 4: 
          f1 = 4.0F;
          break;
        case 2: 
          f1 = 4.0F;
        }
      }
      if (paramInt3 == 0) {
        switch (paramInt1)
        {
        case 1: 
          f2 = 3.0F;
          break;
        case 3: 
          f2 = 4.0F;
          break;
        case 5: 
          f2 = 8.0F;
          break;
        case 4: 
          f2 = 4.0F;
          break;
        case 2: 
          f2 = 4.0F;
        }
      } else if (paramInt3 == 1) {
        switch (paramInt1)
        {
        case 1: 
          f2 = 4.0F;
          break;
        case 3: 
          f2 = 4.0F;
          break;
        case 5: 
          f2 = 10.0F;
          break;
        case 4: 
          f2 = 4.0F;
          break;
        case 2: 
          f2 = 4.0F;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
          f2 = 6.0F;
          break;
        case 3: 
          f2 = 6.0F;
          break;
        case 5: 
          f2 = 10.0F;
          break;
        case 4: 
          f2 = 6.0F;
          break;
        case 2: 
          f2 = 6.0F;
        }
      }
    }
    else
    {
      if (paramInt2 == 0) {
        f1 = 3.0F;
      } else if (paramInt2 == 1) {
        f1 = 3.0F;
      } else {
        f1 = 5.0F;
      }
      if (paramInt3 == 0) {
        f2 = 2.0F;
      } else if (paramInt3 == 1) {
        f2 = 3.0F;
      } else {
        f2 = 5.0F;
      }
    }
    za localza;
    switch (paramInt1)
    {
    case 1: 
      localza = new za(f1, f2);
      if (paramBoolean) {
        paramzs.b(localza);
      } else {
        paramzs.a(localza);
      }
      break;
    case 3: 
      com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
      zo[] arrayOfzo = new zo[4];
      arrayOfzo[0] = new zo(-f1 / 2.0F, 0.0F);
      arrayOfzo[1] = new zo(0.0F, -f2 / 2.0F);
      arrayOfzo[2] = new zo(f1 / 2.0F, 0.0F);
      arrayOfzo[3] = new zo(0.0F, f2 / 2.0F);
      localze1.b(arrayOfzo);
      com.aspose.cells.a.d.ze localze2 = new com.aspose.cells.a.d.ze(localze1, null);
      if (paramBoolean) {
        paramzs.b(localze2);
      } else {
        paramzs.a(localze2);
      }
      break;
    case 5: 
      f1 += 0.5F;
      f2 += 0.5F;
      com.aspose.cells.b.a.b.a.ze localze3 = new com.aspose.cells.b.a.b.a.ze();
      localze3.a(new zo(f1 / 2.0F, -f2), new zo(0.0F, 0.0F));
      localze3.k();
      localze3.a(new zo(-f1 / 2.0F, -f2), new zo(0.0F, 0.0F));
      com.aspose.cells.a.d.ze localze4 = new com.aspose.cells.a.d.ze(null, localze3);
      localze4.a(0);
      localze4.b(2);
      localze4.a(2, 2);
      if (paramBoolean) {
        paramzs.b(localze4);
      } else {
        paramzs.a(localze4);
      }
      break;
    case 4: 
      com.aspose.cells.b.a.b.a.ze localze5 = new com.aspose.cells.b.a.b.a.ze();
      zq localzq = new zq(-f1 / 2.0F, -f2 / 2.0F, f1, f2);
      localze5.a(localzq);
      com.aspose.cells.a.d.ze localze6 = new com.aspose.cells.a.d.ze(localze5, null);
      if (paramBoolean) {
        paramzs.b(localze6);
      } else {
        paramzs.a(localze6);
      }
      break;
    case 2: 
      localza = new za(f1, f2);
      localza.a(0.9F);
      if (paramBoolean) {
        paramzs.b(localza);
      } else {
        paramzs.a(localza);
      }
      break;
    }
  }
  
  static zt a(zr paramzr, zbni paramzbni, zq paramzq, String paramString, int paramInt1, com.aspose.cells.b.a.b.zg paramzg, Color paramColor, int paramInt2, int paramInt3, int paramInt4)
    throws Exception
  {
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    zt localzt = zt.a();
    if (paramInt1 == 3)
    {
      com.aspose.cells.b.a.b.zs localzs1 = a(paramzr, paramString, paramzg, new zt(paramzq.h(), paramzq.i()));
      localzt.a(localzs1.b());
      localzt.b(localzs1.c());
    }
    else if ((paramzbni.L().size() > 0) || (paramInt2 == 3) || (paramInt2 == 6))
    {
      localzt = b(paramzr, paramzbni, paramzq);
    }
    else if ((paramString != null) && (!"".equals(paramString)) && (!paramString.equals("\n")))
    {
      int i = 0;
      switch (paramInt1)
      {
      case 0: 
        i = -90;
        break;
      case 1: 
        i = 90;
        break;
      case 2: 
        i = 0;
        break;
      default: 
        i = 0;
      }
      i -= (int)paramzbni.I();
      com.aspose.cells.b.a.b.zs localzs2 = a(paramzr, paramzbni, new zt(paramzq.h(), paramzq.i()), paramString, i, paramzg, paramColor, paramInt2, paramInt3);
      localzt.a(localzs2.b());
      localzt.b(localzs2.c());
    }
    paramzr.a(localzf);
    return localzt;
  }
  
  static void b(zr paramzr, zbni paramzbni, zq paramzq, String paramString, int paramInt1, com.aspose.cells.b.a.b.zg paramzg, Color paramColor, int paramInt2, int paramInt3, int paramInt4)
    throws Exception
  {
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(4, true);
    if (paramInt1 == 3)
    {
      a(paramzr, paramString, paramzg, paramColor, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramInt2, paramInt3, paramInt4);
    }
    else if ((paramzbni.L().size() > 0) || (paramInt2 == 3) || (paramInt2 == 6))
    {
      a(paramzr, paramzbni, paramzq);
    }
    else if ((paramString != null) && (!"".equals(paramString)) && (!paramString.equals("\n")))
    {
      int i = 0;
      switch (paramInt1)
      {
      case 0: 
        i = -90;
        break;
      case 1: 
        i = 90;
        break;
      case 2: 
        i = 0;
        break;
      default: 
        i = 0;
      }
      i -= (int)paramzbni.I();
      a(paramzr, paramzbni, paramzq, paramString, i, paramzg, paramColor, paramInt2, paramInt3);
    }
    paramzr.a(localzf);
  }
  
  private static void a(zr paramzr, zbni paramzbni, zq paramzq)
    throws Exception
  {
    zbcy localzbcy = new zbcy();
    localzbcy.c(paramzbni.G());
    localzbcy.a(a(paramzbni.E()));
    localzbcy.d(paramzbni.H());
    localzbcy.b(a(paramzbni.F()));
    localzbcy.a(paramzbni.E() == 3);
    localzbcy.b(paramzbni.E() == 6);
    int i = 0;
    if ((paramzbni.L().size() == 0) && ((paramzbni.E() == 3) || (paramzbni.E() == 6)))
    {
      zbdc localzbdc1 = new zbdc(paramzbni.K(), paramzbni.B(), paramzbni.C(), paramzbni.D(), 2, paramzbni.E());
      localzbdc1.c = paramzbni.q;
      paramzbni.L().clear();
      com.aspose.cells.b.a.a.zf.a(paramzbni.L(), localzbdc1);
      i = 1;
    }
    int j = 0;
    switch (paramzbni.H())
    {
    case 0: 
      j = -90;
      break;
    case 1: 
      j = 90;
      break;
    default: 
      j = 0;
    }
    zq localzq = zbya.a(paramzq, -j);
    zbdh localzbdh = new zbdh(localzq, localzbcy, paramzbni.L(), paramzbni.B(), paramzbni.p());
    if (localzbdh.a(paramzr, paramzbni.at()))
    {
      float f1 = zauu.a(paramzbni.k.Q(), paramzbni.ad());
      zbdc localzbdc2 = null;
      for (int k = 0; k < paramzbni.L().size(); k++)
      {
        localzbdc2 = (zbdc)paramzbni.L().get(k);
        float f2 = localzbdc2.c().h() / f1;
        localzbdc2.a(new com.aspose.cells.b.a.b.zg(localzbdc2.c().b(), f2, localzbdc2.c().k(), localzbdc2.c().m()));
      }
    }
    localzbdh.a(paramzbni.k.getTextVerticalOverflow());
    j -= (int)paramzbni.I();
    localzbdh.b(paramzr, -j, paramzbni.at());
    if (i != 0) {
      paramzbni.L().clear();
    }
  }
  
  private static zt b(zr paramzr, zbni paramzbni, zq paramzq)
    throws Exception
  {
    zbcy localzbcy = new zbcy();
    localzbcy.c(paramzbni.G());
    localzbcy.a(a(paramzbni.E()));
    localzbcy.d(paramzbni.H());
    localzbcy.b(a(paramzbni.F()));
    localzbcy.a(paramzbni.E() == 3);
    localzbcy.b(paramzbni.E() == 6);
    int i = 0;
    if ((paramzbni.L().size() == 0) && ((paramzbni.E() == 3) || (paramzbni.E() == 6)))
    {
      zbdc localzbdc = new zbdc(paramzbni.K(), paramzbni.B(), paramzbni.C(), paramzbni.D(), 2, paramzbni.E());
      localzbdc.c = paramzbni.q;
      paramzbni.L().clear();
      com.aspose.cells.b.a.a.zf.a(paramzbni.L(), localzbdc);
      i = 1;
    }
    int j = 0;
    switch (paramzbni.H())
    {
    case 0: 
      j = -90;
      break;
    case 1: 
      j = 90;
      break;
    default: 
      j = 0;
    }
    zq localzq1 = zbya.a(paramzq, -j);
    zbdh localzbdh = new zbdh(localzq1, localzbcy, paramzbni.L(), paramzbni.B(), paramzbni.p());
    localzbdh.a(paramzbni.k.getTextVerticalOverflow());
    j -= (int)paramzbni.I();
    zq localzq2 = localzbdh.a(paramzr, -j, paramzbni.at());
    if (i != 0) {
      paramzbni.L().clear();
    }
    return localzq2.e();
  }
  
  public static void a(zr paramzr, String paramString, com.aspose.cells.b.a.b.zg paramzg, Color paramColor, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, int paramInt3)
  {
    com.aspose.cells.b.a.b.zs localzs = a(paramzr, paramString, paramzg, new zt(paramFloat3, paramFloat4));
    if (paramInt2 == 1) {
      paramFloat1 += (paramFloat3 - localzs.b()) / 2.0F;
    }
    if (((paramInt2 == 0) && (paramInt3 == 1)) || ((paramInt2 == 9) && (paramInt3 == 2))) {
      paramFloat1 = paramFloat1 + paramFloat3 - localzs.b();
    }
    if (paramInt1 == 1) {
      paramFloat2 += (paramFloat4 - localzs.c()) / 2.0F;
    } else if (paramInt1 == 8) {
      paramFloat2 = paramFloat2 + paramFloat4 - localzs.c();
    }
    paramFloat3 = localzs.b();
    paramFloat4 = localzs.c();
    zt localzt1 = paramzr.a("H", paramzg);
    localzt1.a(a(localzt1.b()));
    localzt1.b(a(localzt1.c()));
    zu localzu = new zu(paramColor);
    try
    {
      float f1 = paramFloat1;
      if (paramInt3 == 2) {
        f1 = paramFloat1 + paramFloat3 - localzt1.b();
      }
      float f2 = paramFloat2;
      com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("(\\s){1,}");
      com.aspose.cells.b.a.g.a.zd localzd = localze.b(paramString);
      int i;
      String str1;
      if (localzd.a() > 0) {
        for (i = 0; i < localzd.a(); i++)
        {
          str1 = "";
          if (i == 0)
          {
            if (localzd.a(i).d() != 0) {
              str1 = paramString.substring(0, 0 + localzd.a(i).d());
            }
          }
          else {
            str1 = paramString.substring(localzd.a(i - 1).d() + localzd.a(i - 1).e(), localzd.a(i - 1).d() + localzd.a(i - 1).e() + (localzd.a(i).d() - (localzd.a(i - 1).d() + localzd.a(i - 1).e())));
          }
          if ((f2 != paramFloat2) && (f2 + localzt1.c() * str1.length() > paramFloat4))
          {
            if (paramInt3 == 2) {
              f1 -= localzt1.b();
            } else {
              f1 += localzt1.b();
            }
            f2 = paramFloat2;
          }
          Object localObject1;
          Object localObject2;
          for (int j = 0; j < str1.length(); j++)
          {
            String str2 = str1.substring(j, j + 1);
            localObject1 = paramzr.a(str2, paramzg);
            if ((f2 + localzt1.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
            {
              if (paramInt3 == 2) {
                f1 -= localzt1.b();
              } else {
                f1 += localzt1.b();
              }
              f2 = paramFloat2;
              if (paramInt2 == 1)
              {
                float f3 = 0.0F;
                for (int m = j; m < str1.length(); m++) {
                  f3 += localzt1.c();
                }
                if (f3 < paramFloat4) {
                  f2 += (paramFloat4 - f3) / 2.0F;
                }
              }
              j--;
            }
            else
            {
              if (zbbt.a(str2.charAt(0)))
              {
                localObject2 = paramzr.d();
                paramzr.b(f1 + localzt1.b() / 2.0F, f2 + localzt1.c() / 2.0F);
                paramzr.a(90.0F);
                paramzr.a(str2, paramzg, localzu, -localzt1.b() / 2.0F, -localzt1.c() / 2.0F);
                paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject2);
              }
              else
              {
                paramzr.a(str2, paramzg, localzu, f1 - (((zt)localObject1).b() - localzt1.b()) / 2.0F, f2);
              }
              f2 += localzt1.c();
            }
          }
          j = localzd.a(i).a().indexOf("\n");
          int k;
          if (j >= 0)
          {
            for (k = 0; k < j; k++)
            {
              if ((f2 + localzt1.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt1.b();
                } else {
                  f1 += localzt1.b();
                }
                f2 = paramFloat2;
                break;
              }
              f2 += localzt1.c();
            }
            if (paramInt3 == 2) {
              f1 -= localzt1.b();
            } else {
              f1 += localzt1.b();
            }
            f2 = paramFloat2;
            for (k = j + 1; k < localzd.a(i).e(); k++)
            {
              if ((f2 + localzt1.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt1.b();
                } else {
                  f1 += localzt1.b();
                }
                f2 = paramFloat2;
                break;
              }
              f2 += localzt1.c();
            }
          }
          else
          {
            for (k = 0; k < localzd.a(i).e(); k++)
            {
              if ((f2 + localzt1.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt1.b();
                } else {
                  f1 += localzt1.b();
                }
                f2 = paramFloat2;
                break;
              }
              f2 += localzt1.c();
            }
          }
          if (i == localzd.a() - 1)
          {
            str1 = paramString.substring(localzd.a(i).d() + localzd.a(i).e(), localzd.a(i).d() + localzd.a(i).e() + (paramString.length() - (localzd.a(i).d() + localzd.a(i).e())));
            if ((f2 != paramFloat2) && (f2 + localzt1.c() * str1.length() > paramFloat4))
            {
              if (paramInt3 == 2) {
                f1 -= localzt1.b();
              } else {
                f1 += localzt1.b();
              }
              f2 = paramFloat2;
            }
            for (k = 0; k < str1.length(); k++)
            {
              localObject1 = str1.substring(k, k + 1);
              localObject2 = paramzr.a((String)localObject1, paramzg);
              if ((f2 + localzt1.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt1.b();
                } else {
                  f1 += localzt1.b();
                }
                f2 = paramFloat2;
                k--;
              }
              else
              {
                if (zbbt.a(((String)localObject1).charAt(0)))
                {
                  com.aspose.cells.b.a.b.a.zf localzf2 = paramzr.d();
                  paramzr.b(f1 + localzt1.b() / 2.0F, f2 + localzt1.c() / 2.0F);
                  paramzr.a(90.0F);
                  paramzr.a((String)localObject1, paramzg, localzu, -localzt1.b() / 2.0F, -localzt1.c() / 2.0F);
                  paramzr.a(localzf2);
                }
                else
                {
                  paramzr.a((String)localObject1, paramzg, localzu, f1 - (((zt)localObject2).b() - localzt1.b()) / 2.0F, f2);
                }
                f2 += localzt1.c();
              }
            }
          }
        }
      } else {
        for (i = 0; i < paramString.length(); i++)
        {
          str1 = paramString.substring(i, i + 1);
          zt localzt2 = paramzr.a(str1, paramzg);
          if ((f2 + localzt1.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
          {
            if (paramInt3 == 2) {
              f1 -= localzt1.b();
            } else {
              f1 += localzt1.b();
            }
            f2 = paramFloat2;
            i--;
          }
          else
          {
            if (zbbt.a(str1.charAt(0)))
            {
              com.aspose.cells.b.a.b.a.zf localzf1 = paramzr.d();
              paramzr.b(f1 + localzt1.b() / 2.0F, f2 + localzt1.c() / 2.0F);
              paramzr.a(90.0F);
              paramzr.a(str1, paramzg, localzu, -localzt1.b() / 2.0F, -localzt1.c() / 2.0F);
              paramzr.a(localzf1);
            }
            else
            {
              paramzr.a(str1, paramzg, localzu, f1 - (localzt2.b() - localzt1.b()) / 2.0F, f2);
            }
            f2 += localzt1.c();
          }
        }
      }
    }
    finally
    {
      if (localzu != null) {
        localzu.f();
      }
    }
  }
  
  private static com.aspose.cells.b.a.b.zs a(zr paramzr, String paramString, com.aspose.cells.b.a.b.zg paramzg, zt paramzt)
  {
    zt localzt1 = paramzr.a("H", paramzg);
    localzt1.a(a(localzt1.b()));
    localzt1.b(a(localzt1.c()));
    if ((paramString == null) || (paramString.length() == 0)) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    float f1 = localzt1.b();
    float f2 = localzt1.c();
    int i = 0;
    float f3 = 0.0F;
    float f4 = 0.0F;
    com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("(\\s){1,}");
    com.aspose.cells.b.a.g.a.zd localzd = localze.b(paramString);
    int j;
    String str1;
    if (localzd.a() > 0)
    {
      for (j = 0; j < localzd.a(); j++)
      {
        str1 = "";
        if (j == 0)
        {
          if (localzd.a(j).d() != 0) {
            str1 = paramString.substring(0, 0 + localzd.a(j).d());
          }
        }
        else {
          str1 = paramString.substring(localzd.a(j - 1).d() + localzd.a(j - 1).e(), localzd.a(j - 1).d() + localzd.a(j - 1).e() + (localzd.a(j).d() - (localzd.a(j - 1).d() + localzd.a(j - 1).e())));
        }
        if ((f4 != 0.0F) && (f4 + localzt1.c() * str1.length() > paramzt.c()))
        {
          f1 += localzt1.b();
          f4 = 0.0F;
        }
        Object localObject;
        for (int k = 0; k < str1.length(); k++)
        {
          String str2 = str1.substring(k, k + 1);
          localObject = paramzr.a(str2, paramzg);
          if ((f4 + localzt1.c() > paramzt.c()) && (f4 != 0.0F))
          {
            f1 += localzt1.b();
            f3 = f4;
            f4 = 0.0F;
            i = 1;
            k--;
          }
          else
          {
            f4 += localzt1.c();
          }
        }
        if (f4 > f2) {
          f2 = f4;
        }
        k = localzd.a(j).a().indexOf("\n");
        int m;
        if (k >= 0)
        {
          for (m = 0; m < k; m++)
          {
            if ((f4 + localzt1.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt1.b();
              f4 = 0.0F;
              break;
            }
            f4 += localzt1.c();
          }
          f1 += localzt1.b();
          f4 = 0.0F;
          for (m = k + 1; m < localzd.a(j).e(); m++)
          {
            if ((f4 + localzt1.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt1.b();
              f4 = 0.0F;
              break;
            }
            f4 += localzt1.c();
          }
        }
        else
        {
          for (m = 0; m < localzd.a(j).e(); m++)
          {
            if ((f4 + localzt1.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt1.b();
              f4 = 0.0F;
              break;
            }
            f4 += localzt1.c();
          }
        }
        if (j == localzd.a() - 1)
        {
          str1 = paramString.substring(localzd.a(j).d() + localzd.a(j).e(), localzd.a(j).d() + localzd.a(j).e() + (paramString.length() - (localzd.a(j).d() + localzd.a(j).e())));
          if ((f4 != 0.0F) && (f4 + localzt1.c() * str1.length() > paramzt.c()))
          {
            f1 += localzt1.b();
            f4 = 0.0F;
          }
          for (m = 0; m < str1.length(); m++)
          {
            localObject = str1.substring(m, m + 1);
            zt localzt3 = paramzr.a((String)localObject, paramzg);
            if ((f4 + localzt1.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt1.b();
              f3 = f4;
              f4 = 0.0F;
              i = 1;
              m--;
            }
            else
            {
              f4 += localzt1.c();
            }
          }
          if (f4 > f2) {
            f2 = f4;
          }
        }
      }
    }
    else
    {
      for (j = 0; j < paramString.length(); j++)
      {
        str1 = paramString.substring(j, j + 1);
        zt localzt2 = paramzr.a(str1, paramzg);
        if ((f4 + localzt1.c() > paramzt.c()) && (f4 != 0.0F))
        {
          f1 += localzt1.b();
          f3 = f4;
          i = 1;
          f4 = 0.0F;
          j--;
        }
        else
        {
          f4 += localzt1.c();
        }
      }
      if (f4 > f2) {
        f2 = f4;
      }
    }
    if (i != 0) {
      f2 = f3;
    }
    return new com.aspose.cells.b.a.b.zs((int)(f1 + 0.5F), (int)(f2 + 0.5F));
  }
  
  private static com.aspose.cells.b.a.b.zs a(zr paramzr, zbni paramzbni, zt paramzt, String paramString, int paramInt1, com.aspose.cells.b.a.b.zg paramzg, Color paramColor, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 90) {
      paramzt = new zt(paramzt.c(), paramzt.b());
    }
    zv localzv = new zv();
    localzv.a(a(paramInt2));
    localzv.c(a(paramInt3));
    zt localzt1 = paramzr.a(paramString, paramzg, paramzt, localzv);
    int i = zbxz.a(localzt1.b());
    int j = zbxz.a(localzt1.c());
    zt localzt2 = new zt(i, j);
    double d = paramInt1 * 3.141592653589793D / 180.0D;
    int k = (int)(localzt2.b() * Math.abs(Math.cos(d)) + localzt2.c() * Math.abs(Math.sin(d)) + 0.5D);
    int m = (int)(localzt2.b() * Math.abs(Math.sin(d)) + localzt2.c() * Math.abs(Math.cos(d)) + 0.5D);
    return new com.aspose.cells.b.a.b.zs(k, m);
  }
  
  private static void a(zr paramzr, zbni paramzbni, zq paramzq, String paramString, int paramInt1, com.aspose.cells.b.a.b.zg paramzg, Color paramColor, int paramInt2, int paramInt3)
    throws Exception
  {
    zv localzv = new zv(zv.c());
    if ((paramzbni.k.getTextHorizontalOverflow() == 2) && (paramzbni.k.getTextVerticalOverflow() == 2)) {
      localzv.b(localzv.d() & 0xDFFF & 0xFFFFFFFB);
    }
    if (!paramzbni.p) {
      localzv.b(localzv.d() | 0x1000);
    }
    if ((paramzbni.ae()) && (paramzbni.K().length() > 1))
    {
      localzv.a(0);
      localzv.c(0);
    }
    else
    {
      localzv.a(a(paramInt2));
      localzv.c(a(paramInt3));
    }
    if (paramzbni.ae()) {
      localzv.b(localzv.d() & 0xDFFF);
    }
    com.aspose.cells.b.a.b.a.zf localzf = null;
    switch (Math.abs(paramInt1))
    {
    case 0: 
      if ((paramzbni.at()) && (paramString.length() > 20))
      {
        zbdc localzbdc = new zbdc(paramString, paramzg, paramColor, paramzbni.D(), 2, paramzbni.E());
        localzbdc.c = paramzbni.q;
        paramzbni.L().clear();
        com.aspose.cells.b.a.a.zf.a(paramzbni.L(), localzbdc);
        a(paramzr, paramzbni, paramzq);
        paramzbni.L().clear();
      }
      else
      {
        a(paramzr, paramzbni.q, paramString, paramzg, new zu(paramColor), paramzq, localzv);
      }
      break;
    case 90: 
      localzf = paramzr.d();
      paramzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
      paramzr.a(-paramInt1);
      paramzq = new zq(-paramzq.i() / 2.0F, -paramzq.h() / 2.0F, paramzq.i(), paramzq.h());
      a(paramzr, paramzbni.q, paramString, paramzg, new zu(paramColor), paramzq, localzv);
      paramzr.a(localzf);
      break;
    case 180: 
      localzf = paramzr.d();
      paramzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
      paramzr.a(-paramInt1);
      paramzq = new zq(-paramzq.h() / 2.0F, -paramzq.i() / 2.0F, paramzq.h(), paramzq.i());
      a(paramzr, paramzbni.q, paramString, paramzg, new zu(paramColor), paramzq, localzv);
      paramzr.a(localzf);
      break;
    default: 
      localzf = paramzr.d();
      double d = Math.sqrt(Math.pow(paramzq.h(), 2.0D) + Math.pow(paramzq.i(), 2.0D));
      localzv.b(4096);
      zt localzt = paramzr.a(paramString, paramzg, (int)d, localzv);
      paramzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
      paramzr.a(-paramInt1);
      zq localzq = new zq(-localzt.b() / 2.0F, -localzt.c() / 2.0F, localzt.b(), localzt.c());
      a(paramzr, paramzbni.q, paramString, paramzg, new zu(paramColor), localzq, localzv);
      paramzr.a(localzf);
    }
  }
  
  static void a(zr paramzr, zbvz paramzbvz, String paramString, com.aspose.cells.b.a.b.zg paramzg, com.aspose.cells.b.a.b.zc paramzc, zq paramzq, zv paramzv)
    throws Exception
  {
    if (a(paramzbvz))
    {
      if ((paramzbvz != null) && (paramzbvz.b().a)) {
        paramzc = a(paramzc, false);
      }
      paramzr.a(paramString, paramzg, paramzc, paramzq, paramzv);
      return;
    }
    if (paramString.trim().length() == 0) {
      return;
    }
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.a(paramString, paramzg.b(), paramzg.k(), paramzg.h() * zbxp.a() / 72.0F, paramzq, paramzv);
    zxl localzxl = paramzbvz.b();
    if (!localzxl.a())
    {
      localObject = new com.aspose.cells.b.a.b.a.ze();
      ((com.aspose.cells.b.a.b.a.ze)localObject).b(paramzbvz.a().y());
      com.aspose.cells.b.a.b.zc localzc = a(localzxl, (com.aspose.cells.b.a.b.a.ze)localObject);
      paramzr.a(localzc, localze1);
    }
    Object localObject = paramzbvz.c();
    if (!((zanu)localObject).a())
    {
      int i = ((zanu)localObject).i();
      int j = ((zanu)localObject).l();
      ((zanu)localObject).e(0);
      ((zanu)localObject).h(0);
      com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
      localze2.b(paramzbvz.a().y());
      com.aspose.cells.a.d.zs localzs = a((zanu)localObject, localze2);
      paramzr.a(localzs, localze1);
      ((zanu)localObject).e(i);
      ((zanu)localObject).h(j);
    }
  }
  
  static boolean a(zbvz paramzbvz)
  {
    if (paramzbvz == null) {
      return true;
    }
    return ((paramzbvz.b().a()) || (paramzbvz.b().c == 2)) && (paramzbvz.c().a());
  }
  
  public static int a(int paramInt)
  {
    if (paramInt == 1) {
      return 1;
    }
    if ((paramInt == 7) || (paramInt == 9)) {
      return 0;
    }
    if ((paramInt == 0) || (paramInt == 8)) {
      return 2;
    }
    return 0;
  }
  
  static int a(double paramDouble)
  {
    return (int)Math.ceil(paramDouble);
  }
  
  static float a(com.aspose.cells.b.a.b.zg paramzg)
  {
    return paramzg.h() / 4.0F;
  }
  
  static zq a(zbni paramzbni)
  {
    zanu localzanu = paramzbni.A();
    ArrayList localArrayList = new ArrayList();
    if ((paramzbni.c == 1) || (paramzbni.c == 4))
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbni.u(), paramzbni.v()));
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbni.y().l(), paramzbni.y().m()));
    }
    else
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbni.u(), paramzbni.y().m()));
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbni.y().l(), paramzbni.v()));
    }
    zo[] arrayOfzo1 = new zo[2];
    if (!localzanu.a())
    {
      int i = paramzbni.c;
      if (paramzbni.w() == 180) {
        switch (i)
        {
        case 1: 
          i = 2;
          break;
        case 2: 
          i = 4;
          break;
        case 3: 
          i = 1;
          break;
        default: 
          i = 2;
        }
      }
      float f1 = localzanu.h();
      float f2 = 0.0F;
      float f3 = 0.0F;
      if ((paramzbni.A().i() != 0) && (f1 <= 1.0F))
      {
        float[] arrayOfFloat1 = { f2 };
        float[] arrayOfFloat2 = { f3 };
        a(paramzbni.A().i(), paramzbni.A().j(), paramzbni.A().k(), paramzbni.A(), arrayOfFloat1, arrayOfFloat2);
        f2 = arrayOfFloat1[0];
        f3 = arrayOfFloat2[0];
      }
      else
      {
        switch (localzanu.k())
        {
        case 1: 
          f3 = 4.0F * f1;
          break;
        case 0: 
          f3 = 3.0F * f1;
          break;
        case 2: 
          f3 = 6.0F * f1;
        }
        switch (localzanu.j())
        {
        case 1: 
          f2 = 4.0F * f1;
          break;
        case 0: 
          f2 = 2.5F * f1;
          break;
        case 2: 
          f2 = 6.0F * f1;
        }
        if (localzanu.i() == 5)
        {
          f2 += 2.0F * f1;
          f3 += 2.0F * f1;
        }
      }
      double d1 = Math.sqrt(Math.pow(paramzbni.s(), 2.0D) + Math.pow(paramzbni.t(), 2.0D));
      double d2 = 0.0D;
      double d4 = 0.0D;
      switch (localzanu.i())
      {
      case 2: 
      case 5: 
        d2 = paramzbni.s() * f3 / d1;
        d4 = paramzbni.t() * f3 / d1;
      }
      if ((paramzbni.c == 1) || (paramzbni.c == 2)) {
        d5 = paramzbni.u() + d2;
      } else {
        d5 = paramzbni.y().l() - d2;
      }
      double d6;
      if ((paramzbni.c == 1) || (paramzbni.c == 4)) {
        d6 = paramzbni.v() + d4;
      } else {
        d6 = paramzbni.y().m() - d4;
      }
      double d7;
      double d8;
      double d9;
      double d10;
      switch (paramzbni.c)
      {
      case 1: 
        d7 = paramzbni.y().f();
        d8 = paramzbni.y().g();
        d9 = paramzbni.y().l();
        d10 = paramzbni.y().m();
        break;
      case 2: 
        d7 = paramzbni.y().f();
        d8 = paramzbni.y().m();
        d9 = paramzbni.y().l();
        d10 = paramzbni.y().g();
        break;
      case 3: 
        d7 = paramzbni.y().l();
        d8 = paramzbni.y().m();
        d9 = paramzbni.y().f();
        d10 = paramzbni.y().g();
        break;
      case 4: 
        d7 = paramzbni.y().l();
        d8 = paramzbni.y().g();
        d9 = paramzbni.y().f();
        d10 = paramzbni.y().m();
        break;
      default: 
        d7 = paramzbni.y().f();
        d8 = paramzbni.y().g();
        d9 = paramzbni.y().l();
        d10 = paramzbni.y().m();
      }
      if (t(paramzbni)) {
        switch (i)
        {
        case 1: 
        case 4: 
          d7 = paramzbni.u();
          d8 = paramzbni.v();
          d5 = paramzbni.y().l() - f3;
          d6 = paramzbni.v();
          d9 = paramzbni.y().l();
          d10 = paramzbni.v();
          break;
        default: 
          d7 = paramzbni.u();
          d8 = paramzbni.y().m();
          d5 = paramzbni.y().l() - f3;
          d6 = paramzbni.y().m();
          d9 = paramzbni.y().l();
          d10 = paramzbni.y().m();
        }
      }
      double d11 = f2;
      zo[] arrayOfzo3;
      if (localzanu.i() == 0) {
        arrayOfzo3 = a(d7, d8, d7, d8, f1, d9, d10);
      } else {
        arrayOfzo3 = a(d7, d8, d5, d6, d11, d9, d10);
      }
      com.aspose.cells.b.a.a.zf.b(localArrayList, arrayOfzo3);
      double d13;
      double d14;
      double d15;
      if (localzanu.i() == 3)
      {
        d13 = f3 / 2.0F;
        d2 = paramzbni.s() * d13 / d1;
        d4 = paramzbni.t() * d13 / d1;
        if ((paramzbni.c == 1) || (paramzbni.c == 2)) {
          d14 = paramzbni.u() - d2;
        } else {
          d14 = paramzbni.y().l() + d2;
        }
        if ((paramzbni.c == 1) || (paramzbni.c == 4)) {
          d15 = paramzbni.v() - d4;
        } else {
          d15 = paramzbni.y().m() + d4;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d14, (float)d15));
      }
      else if (localzanu.i() == 4)
      {
        d13 = f3 / 2.0F;
        d2 = paramzbni.s() * d13 / d1;
        d4 = paramzbni.t() * d13 / d1;
        if ((paramzbni.c == 1) || (paramzbni.c == 2)) {
          d14 = paramzbni.u() - d2;
        } else {
          d14 = paramzbni.y().l() + d2;
        }
        if ((paramzbni.c == 1) || (paramzbni.c == 4)) {
          d15 = paramzbni.v() - d4;
        } else {
          d15 = paramzbni.y().m() + d4;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d14, (float)d15));
      }
      float f4 = 0.0F;
      float f5 = 0.0F;
      if ((paramzbni.A().l() != 0) && (f1 <= 1.0F))
      {
        float[] arrayOfFloat3 = { f4 };
        float[] arrayOfFloat4 = { f5 };
        a(paramzbni.A().l(), paramzbni.A().m(), paramzbni.A().n(), paramzbni.A(), arrayOfFloat3, arrayOfFloat4);
        f4 = arrayOfFloat3[0];
        f5 = arrayOfFloat4[0];
      }
      else
      {
        switch (localzanu.n())
        {
        case 1: 
          f5 = 4.0F * f1;
          break;
        case 0: 
          f5 = 3.0F * f1;
          break;
        case 2: 
          f5 = 6.0F * f1;
        }
        switch (localzanu.m())
        {
        case 1: 
          f4 = 4.0F * f1;
          break;
        case 0: 
          f4 = 2.5F * f1;
          break;
        case 2: 
          f4 = 6.0F * f1;
        }
        if (localzanu.l() == 5)
        {
          f4 += 2.0F * f1;
          f5 += 2.0F * f1;
        }
      }
      double d3 = Math.sqrt(Math.pow(paramzbni.s(), 2.0D) + Math.pow(paramzbni.t(), 2.0D));
      d4 = 0.0D;
      double d5 = 0.0D;
      switch (localzanu.l())
      {
      case 2: 
      case 5: 
        d4 = paramzbni.s() * f5 / d3;
        d5 = paramzbni.t() * f5 / d3;
      }
      if ((paramzbni.c == 3) || (paramzbni.c == 4)) {
        d8 = paramzbni.u() + d4;
      } else {
        d8 = paramzbni.y().l() - d4;
      }
      if ((paramzbni.c == 3) || (paramzbni.c == 2)) {
        d9 = paramzbni.v() + d5;
      } else {
        d9 = paramzbni.y().m() - d5;
      }
      switch (paramzbni.c)
      {
      case 3: 
        d6 = paramzbni.u();
        d7 = paramzbni.v();
        d10 = paramzbni.y().l();
        d11 = paramzbni.y().m();
        break;
      case 4: 
        d6 = paramzbni.u();
        d7 = paramzbni.y().m();
        d10 = paramzbni.y().l();
        d11 = paramzbni.v();
        break;
      case 1: 
        d6 = paramzbni.y().l();
        d7 = paramzbni.y().m();
        d10 = paramzbni.u();
        d11 = paramzbni.v();
        break;
      case 2: 
        d6 = paramzbni.y().l();
        d7 = paramzbni.v();
        d10 = paramzbni.u();
        d11 = paramzbni.y().m();
        break;
      default: 
        d6 = paramzbni.u();
        d7 = paramzbni.v();
        d10 = paramzbni.y().l();
        d11 = paramzbni.y().m();
      }
      if (t(paramzbni)) {
        switch (i)
        {
        case 1: 
        case 4: 
          d6 = paramzbni.u();
          d7 = paramzbni.y().m();
          d8 = paramzbni.y().l() - f5;
          d9 = paramzbni.y().m();
          d10 = paramzbni.y().l();
          d11 = paramzbni.y().m();
          break;
        default: 
          d6 = paramzbni.y().l();
          d7 = paramzbni.v();
          d8 = paramzbni.u() + f5;
          d9 = paramzbni.v();
          d10 = paramzbni.u();
          d11 = paramzbni.v();
        }
      }
      double d12 = f4;
      zo[] arrayOfzo4 = a(d6, d7, d8, d9, d12, d10, d11);
      if (localzanu.l() == 0) {
        arrayOfzo4 = a(d6, d7, d6, d7, f1, d10, d11);
      } else {
        arrayOfzo4 = a(d6, d7, d8, d9, d12, d10, d11);
      }
      com.aspose.cells.b.a.a.zf.b(localArrayList, arrayOfzo4);
      double d16;
      if (localzanu.l() == 3)
      {
        d14 = f5 / 2.0F;
        d4 = paramzbni.s() * d14 / d3;
        d5 = paramzbni.t() * d14 / d3;
        if ((paramzbni.c == 3) || (paramzbni.c == 4)) {
          d15 = paramzbni.u() - d4;
        } else {
          d15 = paramzbni.y().l() + d4;
        }
        if ((paramzbni.c == 3) || (paramzbni.c == 2)) {
          d16 = paramzbni.v() - d5;
        } else {
          d16 = paramzbni.y().m() + d5;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d15, (float)d16));
      }
      else if (localzanu.l() == 4)
      {
        d14 = f5 / 2.0F;
        d4 = paramzbni.s() * d14 / d3;
        d5 = paramzbni.t() * d14 / d3;
        if ((paramzbni.c == 3) || (paramzbni.c == 4)) {
          d15 = paramzbni.u() - d4;
        } else {
          d15 = paramzbni.y().l() + d4;
        }
        if ((paramzbni.c == 3) || (paramzbni.c == 2)) {
          d16 = paramzbni.v() - d5;
        } else {
          d16 = paramzbni.y().m() + d5;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d15, (float)d16));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)(d6 - f5 / 2.0F), (float)d7));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)(d6 + f5 / 2.0F), (float)d7));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d6, (float)(d7 - f4 / 2.0F)));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d6, (float)(d7 + f4 / 2.0F)));
      }
    }
    zo[] arrayOfzo2 = a(localArrayList);
    if ((!paramzbni.f) && (paramzbni.w() != 0) && (!t(paramzbni)))
    {
      localObject = new zi();
      zo localzo = new zo(paramzbni.y().f() + paramzbni.y().h() / 2.0F, paramzbni.y().g() + paramzbni.y().i() / 2.0F);
      ((zi)localObject).a(paramzbni.w(), localzo);
      ((zi)localObject).a(arrayOfzo2);
    }
    Object localObject = a(arrayOfzo2);
    return (zq)localObject;
  }
  
  static zq a(zbni paramzbni, boolean paramBoolean)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (paramzbni.n != null)
    {
      f1 = paramzbni.s() / 2.0F + Math.abs(paramzbni.s() * (com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F));
      f2 = paramzbni.t() / 2.0F + Math.abs(paramzbni.t() * (com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F));
      f3 = paramzbni.s() / 2.0F + paramzbni.s() * (com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F);
      f4 = paramzbni.t() / 2.0F + paramzbni.t() * (com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F);
    }
    else
    {
      f1 = paramzbni.s() / 2.0F + Math.abs(paramzbni.s() * -0.20473F);
      f2 = paramzbni.t() / 2.0F + Math.abs(paramzbni.t() * 0.61957F);
      f3 = paramzbni.s() / 2.0F + paramzbni.s() * -0.20473F;
      f4 = paramzbni.t() / 2.0F + paramzbni.t() * 0.61957F;
    }
    zq localzq = new zq();
    if ((f1 > paramzbni.s()) && (f2 > paramzbni.t())) {
      localzq = new zq(paramzbni.u(), paramzbni.v(), f1, f2);
    } else if ((f1 > paramzbni.s()) && (f2 < paramzbni.t())) {
      localzq = new zq(paramzbni.u(), paramzbni.v(), f1, paramzbni.y().i());
    } else if ((f1 < paramzbni.s()) && (f2 > paramzbni.t())) {
      localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.y().h(), f2);
    } else if ((f1 < paramzbni.s()) && (f2 < paramzbni.t())) {
      localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.y().h(), paramzbni.y().i());
    }
    if ((paramBoolean) && (f3 < 0.0F)) {
      localzq.a(localzq.f() + f3);
    }
    if ((paramBoolean) && (f4 < 0.0F)) {
      localzq.b(localzq.g() + f4);
    }
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq b(zbni paramzbni)
  {
    zq localzq = new zq();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    double d1 = zbkt.a(paramzbni.w());
    double d2 = zbkt.a(90 - paramzbni.w());
    f1 = (float)(paramzbni.s() * Math.sin(d1));
    f2 = (float)(paramzbni.s() * Math.cos(d1));
    f3 = (float)(paramzbni.t() * Math.cos(d2));
    f4 = (float)(paramzbni.t() * Math.sin(d2));
    float f5 = 0.0F;
    float f6 = 0.0F;
    f5 = Math.abs(f2) + Math.abs(f3);
    f6 = Math.abs(f1) + Math.abs(f4);
    localzq = new zq(paramzbni.u(), paramzbni.v(), f5, f6);
    localzq.a(paramzbni.A().h(), paramzbni.A().h());
    return localzq;
  }
  
  static zq c(zbni paramzbni)
  {
    zq localzq = new zq();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    double d1 = zbkt.a(paramzbni.w());
    double d2 = zbkt.a(90 - paramzbni.w());
    f1 = (float)(paramzbni.s() * Math.sin(d1));
    f2 = (float)(paramzbni.s() * Math.cos(d1));
    f3 = (float)(paramzbni.t() * Math.cos(d2));
    f4 = (float)(paramzbni.t() * Math.sin(d2));
    float f5 = 0.0F;
    float f6 = 0.0F;
    f5 = Math.abs(f2) + Math.abs(f3);
    f6 = Math.abs(f1) + Math.abs(f4);
    localzq = new zq(paramzbni.u(), paramzbni.v(), f5, f6);
    localzq.a(paramzbni.A().h(), paramzbni.A().h());
    if ((paramzbni.A().i() != 0) || (paramzbni.A().l() != 0)) {
      if (localzq.h() < localzq.i()) {
        localzq.c(localzq.h() + 4.0F);
      } else {
        localzq.d(localzq.i() + 4.0F);
      }
    }
    return localzq;
  }
  
  static zq d(zbni paramzbni)
  {
    zq localzq = new zq();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    double d1 = zbkt.a(paramzbni.w());
    double d2 = zbkt.a(90 - paramzbni.w());
    f1 = (float)(paramzbni.s() * Math.sin(d1));
    f2 = (float)(paramzbni.s() * Math.cos(d1));
    f3 = (float)(paramzbni.t() * Math.cos(d2));
    f4 = (float)(paramzbni.t() * Math.sin(d2));
    float f5 = 0.0F;
    float f6 = 0.0F;
    f5 = Math.abs(f2) + Math.abs(f3);
    f6 = Math.abs(f1) + Math.abs(f4);
    localzq = new zq(paramzbni.u(), paramzbni.v(), f5, f6);
    localzq.a(paramzbni.A().h(), paramzbni.A().h());
    return localzq;
  }
  
  private static Color a(zxl paramzxl, float paramFloat1, float paramFloat2)
  {
    Color localColor = paramzxl.b();
    float f1 = localColor.getA() & 0xFF;
    float f2 = (localColor.getR() & 0xFF) + (int)paramFloat2;
    f2 = Math.max(0.0F, Math.min(f2, 255.0F)) * paramFloat1;
    float f3 = (localColor.getG() & 0xFF) + (int)paramFloat2;
    f3 = Math.max(0.0F, Math.min(f3, 255.0F)) * paramFloat1;
    float f4 = (localColor.getB() & 0xFF) + (int)paramFloat2;
    f4 = Math.max(0.0F, Math.min(f4, 255.0F)) * paramFloat1;
    return Color.fromArgb((int)f1, (int)f2, (int)f3, (int)f4);
  }
  
  static com.aspose.cells.b.a.b.zc a(zxl paramzxl, zq paramzq, float paramFloat1, float paramFloat2)
    throws Exception
  {
    if (paramzxl.a()) {
      return new zu(Color.getEmpty());
    }
    Object localObject = null;
    if (paramzxl.d()) {
      localObject = paramzxl.c().a(paramzq);
    } else {
      localObject = new zu(a(paramzxl, paramFloat1, paramFloat2));
    }
    if (paramzxl.a) {
      localObject = a((com.aspose.cells.b.a.b.zc)localObject, !paramzxl.b);
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  static com.aspose.cells.b.a.b.zc a(zxl paramzxl, zq paramzq)
    throws Exception
  {
    if (paramzxl.a()) {
      return new zu(Color.getEmpty());
    }
    Object localObject = null;
    if (paramzxl.d()) {
      localObject = paramzxl.c().a(paramzq);
    } else {
      localObject = new zu(paramzxl.b());
    }
    if (paramzxl.a) {
      localObject = a((com.aspose.cells.b.a.b.zc)localObject, !paramzxl.b);
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  static com.aspose.cells.b.a.b.zc a(zxl paramzxl, com.aspose.cells.b.a.b.a.ze paramze)
    throws Exception
  {
    if (paramzxl.a()) {
      return new zu(Color.getEmpty());
    }
    Object localObject = null;
    if (paramzxl.d()) {
      localObject = paramzxl.c().a(paramze, null, false, 1.0F);
    } else {
      localObject = new zu(paramzxl.b());
    }
    if (paramzxl.a) {
      localObject = a((com.aspose.cells.b.a.b.zc)localObject, !paramzxl.b);
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  static Color a(Color paramColor, boolean paramBoolean)
  {
    if (paramBoolean) {
      return Color.a(paramColor.getA() & 0xFF, Color.getWhite());
    }
    return Color.a(paramColor.getA() & 0xFF, Color.getBlack());
  }
  
  static Color[] a(Color[] paramArrayOfColor, boolean paramBoolean)
  {
    if (paramArrayOfColor == null) {
      return null;
    }
    for (int i = 0; i < paramArrayOfColor.length; i++) {
      paramArrayOfColor[i] = a(paramArrayOfColor[i], paramBoolean);
    }
    return paramArrayOfColor;
  }
  
  static com.aspose.cells.b.a.b.zc a(com.aspose.cells.b.a.b.zc paramzc, boolean paramBoolean)
  {
    if (paramzc == null) {
      return null;
    }
    Object localObject;
    if ((paramzc instanceof zu))
    {
      localObject = (zu)paramzc;
      ((zu)localObject).a(a(((zu)localObject).a(), paramBoolean));
    }
    else
    {
      com.aspose.cells.b.a.b.a.zc localzc;
      if ((paramzc instanceof zh))
      {
        localObject = (zh)paramzc;
        ((zh)localObject).a(a(((zh)localObject).p(), paramBoolean));
        localzc = ((zh)localObject).m();
        if (localzc != null)
        {
          localzc.a(a(localzc.b(), paramBoolean));
          ((zh)localObject).a(localzc);
        }
      }
      else if ((paramzc instanceof zk))
      {
        localObject = (zk)paramzc;
        ((zk)localObject).a(a(((zk)localObject).b(), paramBoolean));
        ((zk)localObject).a(a(((zk)localObject).i(), paramBoolean));
        localzc = ((zk)localObject).c();
        if (localzc != null)
        {
          localzc.a(a(localzc.b(), paramBoolean));
          ((zk)localObject).a(localzc);
        }
      }
      else if ((paramzc instanceof com.aspose.cells.a.d.zr))
      {
        localObject = (com.aspose.cells.a.d.zr)paramzc;
        ((com.aspose.cells.a.d.zr)localObject).a(a(((com.aspose.cells.a.d.zr)localObject).a(), paramBoolean));
        ((com.aspose.cells.a.d.zr)localObject).a(a(((com.aspose.cells.a.d.zr)localObject).d(), paramBoolean));
        localzc = ((com.aspose.cells.a.d.zr)localObject).b();
        if (localzc != null)
        {
          localzc.a(a(localzc.b(), paramBoolean));
          ((com.aspose.cells.a.d.zr)localObject).a(localzc);
        }
      }
      else if ((paramzc instanceof com.aspose.cells.b.a.b.a.zg))
      {
        localObject = (com.aspose.cells.b.a.b.a.zg)paramzc;
        paramzc = new com.aspose.cells.b.a.b.a.zg(((com.aspose.cells.b.a.b.a.zg)localObject).d(), a(((com.aspose.cells.b.a.b.a.zg)localObject).c(), paramBoolean), a(((com.aspose.cells.b.a.b.a.zg)localObject).b(), paramBoolean));
      }
    }
    return paramzc;
  }
  
  static ArrayList e(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
    }
    else
    {
      f1 = 0.1875F * paramzbni.t();
      f2 = -0.08333F * paramzbni.s();
      f3 = 1.125F * paramzbni.t();
      f4 = -0.38333F * paramzbni.s();
    }
    float f5 = 0.0F;
    float f6 = f2;
    float f7 = f4;
    float f8 = f6 > f7 ? f7 : f6;
    float f9 = f6 < f7 ? f7 : f6;
    float f10 = 0.0F;
    float f11 = 0.0F;
    if (f8 < 0.0F)
    {
      f5 += -f8;
      f10 = f8;
    }
    if (f9 > paramzbni.s()) {
      f5 += f9 - paramzbni.s();
    }
    float f12 = 0.0F;
    float f13 = f1;
    float f14 = f3;
    float f15 = f13 > f14 ? f14 : f13;
    float f16 = f13 < f14 ? f14 : f13;
    if (f15 < 0.0F)
    {
      f12 += -f15;
      f11 = f15;
    }
    if (f16 > paramzbni.t()) {
      f12 += f16 - paramzbni.t();
    }
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s() + f5, paramzbni.t() + f12);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    ArrayList localArrayList = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList, localzq);
    com.aspose.cells.b.a.a.zf.a(localArrayList, Float.valueOf(f10));
    com.aspose.cells.b.a.a.zf.a(localArrayList, Float.valueOf(f11));
    return localArrayList;
  }
  
  static ArrayList f(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(5)) / 100000.0F * paramzbni.s();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(4)) / 100000.0F * paramzbni.t();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f5 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
      f6 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
    }
    else
    {
      f1 = -0.46667F * paramzbni.s();
      f2 = 1.125F * paramzbni.t();
      f3 = -0.08333F * paramzbni.s();
      f4 = 0.1875F * paramzbni.t();
      f5 = -0.16667F * paramzbni.s();
      f6 = 0.1875F * paramzbni.t();
    }
    float f7 = 0.0F;
    float f8 = f1;
    float f9 = f3;
    float f10 = f5;
    float f11 = f10 > (f8 > f9 ? f9 : f8) ? f8 : f8 > f9 ? f9 : f10;
    float f12 = f10 < (f8 < f9 ? f9 : f8) ? f8 : f8 < f9 ? f9 : f10;
    float f13 = 0.0F;
    float f14 = 0.0F;
    if (f11 < 0.0F)
    {
      f7 += -f11;
      f13 = f11;
    }
    if (f12 > paramzbni.s()) {
      f7 += f12 - paramzbni.s();
    }
    float f15 = 0.0F;
    float f16 = f2;
    float f17 = f4;
    float f18 = f6;
    float f19 = f18 > (f16 > f17 ? f17 : f16) ? f16 : f16 > f17 ? f17 : f18;
    float f20 = f18 < (f16 < f17 ? f17 : f16) ? f16 : f16 < f17 ? f17 : f18;
    if (f19 < 0.0F)
    {
      f15 += -f19;
      f14 = f19;
    }
    if (f20 > paramzbni.t()) {
      f15 += f20 - paramzbni.t();
    }
    switch (paramzbni.c)
    {
    case 1: 
      break;
    case 2: 
      f14 = -(f20 - paramzbni.t());
      break;
    case 3: 
      f13 = 0.0F;
      f14 = -(f20 - paramzbni.t());
      break;
    case 4: 
      f13 = 0.0F;
    }
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s() + f7, paramzbni.t() + f15);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    ArrayList localArrayList = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList, localzq);
    com.aspose.cells.b.a.a.zf.a(localArrayList, Float.valueOf(f13));
    com.aspose.cells.b.a.a.zf.a(localArrayList, Float.valueOf(f14));
    return localArrayList;
  }
  
  static zq g(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
      f5 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(5)) / 100000.0F * paramzbni.s();
      f6 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(4)) / 100000.0F * paramzbni.t();
      f7 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(7)) / 100000.0F * paramzbni.s();
      f8 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(6)) / 100000.0F * paramzbni.t();
    }
    else
    {
      f1 = -0.08333F * paramzbni.s();
      f2 = 0.1875F * paramzbni.t();
      f3 = -0.16667F * paramzbni.s();
      f4 = 0.1875F * paramzbni.t();
      f5 = -0.16667F * paramzbni.s();
      f6 = 1.0F * paramzbni.t();
      f7 = -0.08333F * paramzbni.s();
      f8 = 1.12963F * paramzbni.t();
    }
    float f9 = 0.0F;
    float f10 = f1;
    float f11 = f3;
    float f12 = f5;
    float f13 = f7;
    float f14 = f12 > (f10 > f11 ? f11 : f10) ? f10 : f10 > f11 ? f11 : f12;
    f14 = f13 > f14 ? f14 : f13;
    float f15 = f12 < (f10 < f11 ? f11 : f10) ? f10 : f10 < f11 ? f11 : f12;
    f15 = f13 < f15 ? f15 : f13;
    if (f14 < 0.0F) {
      f9 += -f14;
    }
    if (f15 > paramzbni.s()) {
      f9 += f15 - paramzbni.s();
    }
    float f16 = 0.0F;
    float f17 = f2;
    float f18 = f4;
    float f19 = f6;
    float f20 = f8;
    float f21 = f19 > (f17 > f18 ? f18 : f17) ? f17 : f17 > f18 ? f18 : f19;
    f21 = f20 > f21 ? f21 : f20;
    float f22 = f19 < (f17 < f18 ? f18 : f17) ? f17 : f17 < f18 ? f18 : f19;
    f22 = f20 < f22 ? f22 : f20;
    if (f21 < 0.0F) {
      f16 += -f21;
    }
    if (f22 > paramzbni.t()) {
      f16 += f22 - paramzbni.t();
    }
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s() + f9, paramzbni.t() + f16);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq h(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    zq localzq = new zq();
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
      f5 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(5)) / 100000.0F * paramzbni.s();
      f6 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(4)) / 100000.0F * paramzbni.t();
      f7 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(7)) / 100000.0F * paramzbni.s();
      f8 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(6)) / 100000.0F * paramzbni.t();
    }
    else
    {
      f1 = -0.08333F * paramzbni.s();
      f2 = 0.1875F * paramzbni.t();
      f3 = -0.16667F * paramzbni.s();
      f4 = 0.1875F * paramzbni.t();
      f5 = -0.16667F * paramzbni.s();
      f6 = 1.0F * paramzbni.t();
      f7 = -0.08333F * paramzbni.s();
      f8 = 1.12963F * paramzbni.t();
    }
    float f9 = 0.0F;
    float f10 = f1;
    float f11 = f3;
    float f12 = f5;
    float f13 = f7;
    float f14 = f12 > (f10 > f11 ? f11 : f10) ? f10 : f10 > f11 ? f11 : f12;
    f14 = f13 > f14 ? f14 : f13;
    float f15 = f12 < (f10 < f11 ? f11 : f10) ? f10 : f10 < f11 ? f11 : f12;
    f15 = f13 < f15 ? f15 : f13;
    if (f14 < 0.0F)
    {
      f9 += -f14;
      localzq.a(f14 + paramzbni.u());
    }
    if (f15 > paramzbni.s()) {
      f9 += f15 - paramzbni.s();
    }
    localzq.c(paramzbni.s() + f9);
    float f16 = 0.0F;
    float f17 = f2;
    float f18 = f4;
    float f19 = f6;
    float f20 = f8;
    float f21 = f19 > (f17 > f18 ? f18 : f17) ? f17 : f17 > f18 ? f18 : f19;
    f21 = f20 > f21 ? f21 : f20;
    float f22 = f19 < (f17 < f18 ? f18 : f17) ? f17 : f17 < f18 ? f18 : f19;
    f22 = f20 < f22 ? f22 : f20;
    if (f21 < 0.0F)
    {
      f16 += -f21;
      localzq.b(f21 + paramzbni.v());
    }
    if (f22 > paramzbni.t()) {
      f16 += f22 - paramzbni.t();
    }
    localzq.d(paramzbni.t() + f16);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq i(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
    }
    else
    {
      f1 = -0.08333F * paramzbni.s();
      f2 = -0.38333F * paramzbni.s();
      f3 = 0.1875F * paramzbni.t();
      f4 = 1.125F * paramzbni.t();
    }
    float f5 = 0.0F;
    float f6 = f1;
    float f7 = f2;
    float f8 = f6 > f7 ? f7 : f6;
    float f9 = f6 < f7 ? f7 : f6;
    if (f8 < 0.0F) {
      f5 += -f8;
    }
    if (f9 > paramzbni.s()) {
      f5 += f9 - paramzbni.s();
    }
    float f10 = 0.0F;
    float f11 = f3;
    float f12 = f4;
    float f13 = f11 > f12 ? f12 : f11;
    float f14 = f11 < f12 ? f12 : f11;
    if (f13 < 0.0F) {
      f10 += -f13;
    }
    if (f14 > paramzbni.t()) {
      f10 += f14 - paramzbni.t();
    }
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s() + f5, paramzbni.t() + f10);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq j(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(5)) / 100000.0F * paramzbni.s();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(4)) / 100000.0F * paramzbni.t();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f5 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
      f6 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
    }
    else
    {
      f1 = -0.46667F * paramzbni.s();
      f2 = 1.125F * paramzbni.t();
      f3 = -0.08333F * paramzbni.s();
      f4 = 0.1875F * paramzbni.t();
      f5 = -0.16667F * paramzbni.s();
      f6 = 0.1875F * paramzbni.t();
    }
    float f7 = 0.0F;
    float f8 = f1;
    float f9 = f3;
    float f10 = f5;
    float f11 = f10 > (f8 > f9 ? f9 : f8) ? f8 : f8 > f9 ? f9 : f10;
    float f12 = f10 < (f8 < f9 ? f9 : f8) ? f8 : f8 < f9 ? f9 : f10;
    if (f11 < 0.0F) {
      f7 += -f11;
    }
    if (f12 > paramzbni.s()) {
      f7 += f12 - paramzbni.s();
    }
    float f13 = 0.0F;
    float f14 = f2;
    float f15 = f4;
    float f16 = f6;
    float f17 = f16 > (f14 > f15 ? f15 : f14) ? f14 : f14 > f15 ? f15 : f16;
    float f18 = f16 < (f14 < f15 ? f15 : f14) ? f14 : f14 < f15 ? f15 : f16;
    if (f17 < 0.0F) {
      f13 += -f17;
    }
    if (f18 > paramzbni.t()) {
      f13 += f18 - paramzbni.t();
    }
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s() + f7, paramzbni.t() + f13);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq k(zbni paramzbni)
  {
    zo localzo1 = new zo();
    zo localzo2 = new zo();
    zo localzo3 = new zo();
    zq localzq = new zq();
    if (paramzbni.n != null)
    {
      localzo1.a(com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(5)) / 100000.0F * paramzbni.s());
      localzo1.b(com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(4)) / 100000.0F * paramzbni.t());
      localzo2.a(com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s());
      localzo2.b(com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t());
      localzo3.a(com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s());
      localzo3.b(com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t());
    }
    else
    {
      localzo1.a(-0.46667F * paramzbni.s());
      localzo1.b(1.125F * paramzbni.t());
      localzo2.a(-0.08333F * paramzbni.s());
      localzo2.b(0.1875F * paramzbni.t());
      localzo3.a(-0.16667F * paramzbni.s());
      localzo3.b(0.1875F * paramzbni.t());
    }
    float f1 = 0.0F;
    float f2 = localzo3.d() > (localzo1.d() > localzo2.d() ? localzo2.d() : localzo1.d()) ? localzo1.d() : localzo1.d() > localzo2.d() ? localzo2.d() : localzo3.d();
    float f3 = localzo3.d() < (localzo1.d() < localzo2.d() ? localzo2.d() : localzo1.d()) ? localzo1.d() : localzo1.d() < localzo2.d() ? localzo2.d() : localzo3.d();
    if (f2 < 0.0F)
    {
      f1 += -f2;
      localzq.a(f2 + paramzbni.u());
    }
    if (f3 > paramzbni.s()) {
      f1 += f3 - paramzbni.s();
    }
    localzq.c(paramzbni.s() + f1);
    float f4 = 0.0F;
    float f5 = localzo3.e() > (localzo1.e() > localzo2.e() ? localzo2.e() : localzo1.e()) ? localzo1.e() : localzo1.e() > localzo2.e() ? localzo2.e() : localzo3.e();
    float f6 = localzo3.e() < (localzo1.e() < localzo2.e() ? localzo2.e() : localzo1.e()) ? localzo1.e() : localzo1.e() < localzo2.e() ? localzo2.e() : localzo3.e();
    if (f5 < 0.0F)
    {
      f4 += -f5;
      localzq.b(f5 + paramzbni.v());
    }
    if (f6 > paramzbni.t()) {
      f4 += f6 - paramzbni.t();
    }
    localzq.d(paramzbni.t() + f4);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq l(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
      f5 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(5)) / 100000.0F * paramzbni.s();
      f6 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(4)) / 100000.0F * paramzbni.t();
      f7 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(7)) / 100000.0F * paramzbni.s();
      f8 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(6)) / 100000.0F * paramzbni.t();
    }
    else
    {
      f1 = -0.08333F * paramzbni.s();
      f2 = 0.1875F * paramzbni.t();
      f3 = -0.08333F * paramzbni.s();
      f4 = 0.1875F * paramzbni.t();
      f5 = -0.16667F * paramzbni.s();
      f6 = 1.0F * paramzbni.t();
      f7 = -0.08918F * paramzbni.s();
      f8 = 1.12963F * paramzbni.t();
    }
    float f9 = 0.0F;
    float f10 = f1;
    float f11 = f3;
    float f12 = f5;
    float f13 = f7;
    float f14 = f12 > (f10 > f11 ? f11 : f10) ? f10 : f10 > f11 ? f11 : f12;
    f14 = f13 > f14 ? f14 : f13;
    float f15 = f12 < (f10 < f11 ? f11 : f10) ? f10 : f10 < f11 ? f11 : f12;
    f15 = f13 < f15 ? f15 : f13;
    if (f14 < 0.0F) {
      f9 += -f14;
    }
    if (f15 > paramzbni.s()) {
      f9 += f15 - paramzbni.s();
    }
    float f16 = 0.0F;
    float f17 = f2;
    float f18 = f4;
    float f19 = f6;
    float f20 = f8;
    float f21 = f19 > (f17 > f18 ? f18 : f17) ? f17 : f17 > f18 ? f18 : f19;
    f21 = f20 > f21 ? f21 : f20;
    float f22 = f19 < (f17 < f18 ? f18 : f17) ? f17 : f17 < f18 ? f18 : f19;
    f22 = f20 < f22 ? f22 : f20;
    if (f21 < 0.0F) {
      f16 += -f21;
    }
    if (f22 > paramzbni.t()) {
      f16 += f22 - paramzbni.t();
    }
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s() + f9, paramzbni.t() + f16);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq m(zbni paramzbni)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    zq localzq = new zq();
    if (paramzbni.n != null)
    {
      f1 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * paramzbni.s();
      f2 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * paramzbni.t();
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(3)) / 100000.0F * paramzbni.s();
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(2)) / 100000.0F * paramzbni.t();
      f5 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(5)) / 100000.0F * paramzbni.s();
      f6 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(4)) / 100000.0F * paramzbni.t();
      f7 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(7)) / 100000.0F * paramzbni.s();
      f8 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(6)) / 100000.0F * paramzbni.t();
    }
    else
    {
      f1 = -0.08333F * paramzbni.s();
      f2 = 0.1875F * paramzbni.t();
      f3 = -0.08333F * paramzbni.s();
      f4 = 0.1875F * paramzbni.t();
      f5 = -0.16667F * paramzbni.s();
      f6 = 1.0F * paramzbni.t();
      f7 = -0.08918F * paramzbni.s();
      f8 = 1.12963F * paramzbni.t();
    }
    float f9 = 0.0F;
    float f10 = f1;
    float f11 = f3;
    float f12 = f5;
    float f13 = f7;
    float f14 = f12 > (f10 > f11 ? f11 : f10) ? f10 : f10 > f11 ? f11 : f12;
    f14 = f13 > f14 ? f14 : f13;
    float f15 = f12 < (f10 < f11 ? f11 : f10) ? f10 : f10 < f11 ? f11 : f12;
    f15 = f13 < f15 ? f15 : f13;
    if (f14 < 0.0F)
    {
      f9 += -f14;
      localzq.a(f14 + paramzbni.u());
    }
    if (f15 > paramzbni.s()) {
      f9 += f15 - paramzbni.s();
    }
    localzq.c(paramzbni.s() + f9);
    float f16 = 0.0F;
    float f17 = f2;
    float f18 = f4;
    float f19 = f6;
    float f20 = f8;
    float f21 = f19 > (f17 > f18 ? f18 : f17) ? f17 : f17 > f18 ? f18 : f19;
    f21 = f20 > f21 ? f21 : f20;
    float f22 = f19 < (f17 < f18 ? f18 : f17) ? f17 : f17 < f18 ? f18 : f19;
    f22 = f20 < f22 ? f22 : f20;
    if (f21 < 0.0F)
    {
      f16 += -f21;
      localzq.b(f21 + paramzbni.v());
    }
    if (f22 > paramzbni.t()) {
      f16 += f22 - paramzbni.t();
    }
    localzq.d(paramzbni.t() + f16);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  static zq n(zbni paramzbni)
  {
    float f1 = paramzbni.s();
    float f2 = paramzbni.t();
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    if (paramzbni.n != null)
    {
      f3 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(0)) / 100000.0F * f1;
      f4 = com.aspose.cells.b.a.ze.a(paramzbni.n.a.get(1)) / 100000.0F * f2;
    }
    else
    {
      f3 = -0.20833F * f1;
      f4 = 0.625F * f2;
    }
    if (Math.abs(f3) > f1 / 2.0F) {
      f5 = Math.abs(f3) - f1 / 2.0F + f1 / 36.0F;
    } else {
      f5 = 0.0F;
    }
    if (Math.abs(f4) > f2 / 2.0F) {
      f6 = Math.abs(f4) - f2 / 2.0F + f2 / 36.0F;
    } else {
      f6 = 0.0F;
    }
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s() + f5, paramzbni.t() + f6);
    localzq.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq;
  }
  
  private static zo[] a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7)
  {
    if (paramDouble7 == paramDouble2) {
      return new zo[] { new zo((float)paramDouble3, (float)(paramDouble4 - paramDouble5 / 2.0D)), new zo((float)paramDouble3, (float)(paramDouble4 + paramDouble5 / 2.0D)) };
    }
    if (paramDouble6 == paramDouble1) {
      return new zo[] { new zo((float)(paramDouble3 - paramDouble5 / 2.0D), (float)paramDouble4), new zo((float)(paramDouble3 + paramDouble5 / 2.0D), (float)paramDouble4) };
    }
    double d1 = (paramDouble7 - paramDouble2) / (paramDouble6 - paramDouble1);
    double d2 = -1.0D / d1;
    double d3 = paramDouble4 - d2 * paramDouble3;
    double d4 = 1.0D + d2 * d2;
    double d5 = 2.0D * d2 * d3 - 2.0D * paramDouble3 - 2.0D * paramDouble4 * d2;
    double d6 = paramDouble3 * paramDouble3 + paramDouble4 * paramDouble4 + d3 * d3 - paramDouble5 / 2.0D * paramDouble5 / 2.0D - 2.0D * paramDouble4 * d3;
    double d7 = (-d5 - Math.sqrt(d5 * d5 - 4.0D * d4 * d6)) / (2.0D * d4);
    double d8 = (-d5 + Math.sqrt(d5 * d5 - 4.0D * d4 * d6)) / (2.0D * d4);
    double d9 = d2 * d7 + d3;
    double d10 = d2 * d8 + d3;
    return new zo[] { new zo((float)d7, (float)d9), new zo((float)d8, (float)d10) };
  }
  
  static zq a(zo[] paramArrayOfzo)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (paramArrayOfzo.length > 0)
    {
      f1 = paramArrayOfzo[0].d();
      f2 = paramArrayOfzo[0].d();
      f3 = paramArrayOfzo[0].e();
      f4 = paramArrayOfzo[0].e();
    }
    for (int i = 1; i < paramArrayOfzo.length; i++)
    {
      zo localzo = paramArrayOfzo[i];
      if (!zo.a(localzo, zo.a()))
      {
        if (localzo.d() < f1) {
          f1 = localzo.d();
        }
        if (localzo.d() > f2) {
          f2 = localzo.d();
        }
        if (localzo.e() < f3) {
          f3 = localzo.e();
        }
        if (localzo.e() > f4) {
          f4 = localzo.e();
        }
      }
    }
    float f5 = f1;
    float f6 = f3;
    float f7 = (float)Math.ceil(f2 - f5);
    if (f7 == 0.0F) {
      f7 = 1.0F;
    }
    float f8 = (float)Math.ceil(f4 - f6);
    if (f8 == 0.0F) {
      f8 = 1.0F;
    }
    return new zq(f5, f6, f7, f8);
  }
  
  static zo[] a(ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++) {
      if (paramArrayList.get(i) == null)
      {
        paramArrayList.remove(i);
        i--;
      }
    }
    zo[] arrayOfzo = new zo[paramArrayList.size()];
    for (int j = 0; j < paramArrayList.size(); j++) {
      arrayOfzo[j] = ((zo)paramArrayList.get(j));
    }
    return arrayOfzo;
  }
  
  static zq o(zbni paramzbni)
  {
    long l = 0L;
    if ((paramzbni.n != null) && (paramzbni.n.a.size() > 0))
    {
      l = com.aspose.cells.b.a.ze.c(paramzbni.n.a.get(0));
      if ((paramzbni.V()) && (paramzbni.w() != 180)) {
        l = Math.abs(l);
      }
      if (((float)(l / 100000L) > Math.max(paramzbni.s(), paramzbni.t())) && ((paramzbni.s() <= 1.0F) || (paramzbni.t() <= 1.0F))) {
        l /= 10000L;
      }
    }
    else
    {
      l = 50000L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj1", l) }, new zadh[] { new zadh("x1", 0, -27273042329602L, 27273042316901L, 100000L, false) }, null, new zal[] { new zal(false, 27273042316901L, -2147483647L, 2147483647L, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, -27273042329612L, -27273042329607L) }, new zavr[] { new zavr(new byte[] { 1, 2, 2, 2 }, new long[] { -27273042329608L, -27273042329609L, -27273042329612L, -27273042329609L, -27273042329612L, -27273042329611L, -27273042329610L, -27273042329611L }, 0L, 0L, 0, true, true) }, new zan(-27273042329608L, -27273042329609L), new zan(-27273042329610L, -27273042329611L));
    localzadg.a(0);
    float f1 = paramzbni.u();
    float f2 = paramzbni.v();
    float f3 = paramzbni.y().h();
    float f4 = paramzbni.y().i();
    zq localzq1 = new zq(f1, f2, f3, f4);
    Object localObject = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
    int i = arrayOfze.length;
    zq localzq2 = zn.a(arrayOfze[0]);
    localzq2.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    zq localzq3 = a(paramzbni);
    zo[] arrayOfzo = new zo[8];
    arrayOfzo[0] = new zo(localzq2.j(), localzq2.k());
    arrayOfzo[1] = new zo(localzq2.l(), localzq2.k());
    arrayOfzo[2] = new zo(localzq2.j(), localzq2.m());
    arrayOfzo[3] = new zo(localzq2.l(), localzq2.m());
    arrayOfzo[4] = new zo(localzq3.j(), localzq3.k());
    arrayOfzo[5] = new zo(localzq3.l(), localzq3.k());
    arrayOfzo[6] = new zo(localzq3.j(), localzq3.m());
    arrayOfzo[7] = new zo(localzq3.l(), localzq3.m());
    zq localzq4 = a(arrayOfzo);
    return localzq4;
  }
  
  static zq p(zbni paramzbni)
  {
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = null;
    zq localzq1 = new zq(paramzbni.y().f(), paramzbni.y().g(), paramzbni.y().h(), paramzbni.y().i());
    switch (paramzbni.r())
    {
    case 38: 
      arrayOfze = zbgy.a(paramzbni, localzq1);
      break;
    case 37: 
      arrayOfze = zbgt.a(paramzbni, localzq1);
      break;
    case 39: 
      arrayOfze = zbgw.a(paramzbni, localzq1);
      break;
    case 40: 
      break;
    }
    zq localzq2;
    if ((arrayOfze != null) && (arrayOfze.length > 0)) {
      localzq2 = zn.a(arrayOfze[0]);
    } else {
      localzq2 = new zq(paramzbni.y().f(), paramzbni.y().g(), paramzbni.y().h(), paramzbni.y().i());
    }
    localzq2.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    zq localzq3 = a(paramzbni);
    zo[] arrayOfzo = new zo[8];
    arrayOfzo[0] = new zo(localzq2.j(), localzq2.k());
    arrayOfzo[1] = new zo(localzq2.l(), localzq2.k());
    arrayOfzo[2] = new zo(localzq2.j(), localzq2.m());
    arrayOfzo[3] = new zo(localzq2.l(), localzq2.m());
    arrayOfzo[4] = new zo(localzq3.j(), localzq3.k());
    arrayOfzo[5] = new zo(localzq3.l(), localzq3.k());
    arrayOfzo[6] = new zo(localzq3.j(), localzq3.m());
    arrayOfzo[7] = new zo(localzq3.l(), localzq3.m());
    zq localzq4 = a(arrayOfzo);
    return localzq4;
  }
  
  private static boolean t(zbni paramzbni)
  {
    switch (paramzbni.r())
    {
    case 34: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
      return true;
    }
    return false;
  }
  
  static zq q(zbni paramzbni)
  {
    long l1 = 0L;
    long l2 = 0L;
    if (paramzbni.n != null)
    {
      l1 = com.aspose.cells.b.a.ze.c(paramzbni.n.a.get(0));
      l2 = com.aspose.cells.b.a.ze.c(paramzbni.n.a.get(1));
    }
    else
    {
      l1 = 50000L;
      l2 = 50000L;
    }
    zadg localzadg = new zadg(new zam[] { new zam("adj1", l1), new zam("adj2", l2) }, new zadh[] { new zadh("x1", 0, -27273042329602L, 27273042316901L, 100000L, false), new zadh("x2", 2, -27273042329612L, -27273042329610L, 2L, false), new zadh("y2", 0, -27273042329603L, 27273042316902L, 100000L, false), new zadh("y1", 2, -27273042329609L, -27273042329614L, 2L, false) }, null, new zal[] { new zal(false, 27273042316901L, -2147483647L, 2147483647L, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, -27273042329612L, -27273042329615L), new zal(false, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 27273042316902L, -2147483647L, 2147483647L, -27273042329613L, -27273042329614L) }, new zavr[] { new zavr(new byte[] { 1, 2, 2, 2, 2 }, new long[] { -27273042329608L, -27273042329609L, -27273042329612L, -27273042329609L, -27273042329612L, -27273042329614L, -27273042329610L, -27273042329614L, -27273042329610L, -27273042329611L }, 0L, 0L, 0, true, true) }, new zan(-27273042329608L, -27273042329609L), new zan(-27273042329610L, -27273042329611L));
    localzadg.a(0);
    float f1 = paramzbni.u();
    float f2 = paramzbni.v();
    float f3 = paramzbni.y().h();
    float f4 = paramzbni.y().i();
    zq localzq1 = new zq(f1, f2, f3, f4);
    Object localObject = null;
    com.aspose.cells.b.a.b.a.ze[] arrayOfze = localzadg.a(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
    zq localzq2 = zn.a(arrayOfze[0]);
    localzq2.a(paramzbni.A().h(), paramzbni.A().h());
    return new zq(localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i());
  }
  
  static zq b(zbni paramzbni, boolean paramBoolean)
  {
    int i = paramzbni.f();
    int j = paramzbni.g();
    int k = paramzbni.d();
    int m = paramzbni.e();
    float f3;
    float f1;
    if (i + 1 <= k)
    {
      f3 = paramzbni.a(i + 1, 0, k, paramzbni.h());
      f1 = f3 + paramzbni.y().h() + 5.0F;
    }
    else
    {
      f3 = paramzbni.a(k, paramzbni.h(), i + 1, 0);
      f1 = f3 + 5.0F;
      if (paramzbni.y().h() > f3) {
        f1 = paramzbni.y().h() + 5.0F;
      }
    }
    float f4;
    float f2;
    if (j <= m)
    {
      f4 = paramzbni.b(j, 0, m, paramzbni.i());
      f2 = f4 + paramzbni.y().i() + 5.0F;
    }
    else
    {
      f4 = paramzbni.b(m, paramzbni.i(), j, 0);
      f2 = f4 + 5.0F;
      if (paramzbni.y().i() > f4) {
        f2 = paramzbni.y().i() + 5.0F;
      }
    }
    paramzbni.a(f3);
    paramzbni.b(f4);
    zq localzq = new zq(paramzbni.y().f(), paramzbni.y().g(), f1, f2);
    if (paramBoolean)
    {
      float f5;
      float f6;
      if ((paramzbni.g() > paramzbni.e()) && (paramzbni.f() + 1 <= paramzbni.d()))
      {
        f5 = -paramzbni.j();
        f6 = 0.0F;
      }
      else if ((paramzbni.f() + 1 > paramzbni.d()) && (paramzbni.g() <= paramzbni.e()))
      {
        f5 = 0.0F;
        f6 = -paramzbni.k();
      }
      else if ((paramzbni.f() + 1 > paramzbni.d()) && (paramzbni.g() > paramzbni.e()))
      {
        f5 = 0.0F;
        f6 = 0.0F;
      }
      else
      {
        f5 = -paramzbni.j();
        f6 = -paramzbni.k();
      }
      localzq.a(localzq.f() + f5);
      localzq.b(localzq.g() + f6);
    }
    return localzq;
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, zanu paramzanu, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (paramzanu.h() <= 1.0F)
    {
      if (paramInt2 == 0) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat1[0] = 4.5F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat1[0] = 6.5F;
          break;
        }
      } else if (paramInt2 == 1) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat1[0] = 7.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat1[0] = 9.0F;
          break;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat1[0] = 12.5F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat1[0] = 13.5F;
        }
      }
      if (paramInt3 == 0)
      {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat2[0] = 4.5F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat2[0] = 6.0F;
          break;
        }
      }
      else if (paramInt3 == 1)
      {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat2[0] = 7.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat2[0] = 8.5F;
          break;
        }
      }
      else
      {
        switch (paramInt1)
        {
        }
        paramArrayOfFloat2[0] = 12.5F;
      }
    }
    else
    {
      if (paramInt2 == 0) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat1[0] = 4.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat1[0] = 10.0F;
          break;
        }
      } else if (paramInt2 == 1) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat1[0] = 8.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat1[0] = 14.0F;
          break;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat1[0] = 16.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat1[0] = 20.0F;
        }
      }
      if (paramInt3 == 0) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat2[0] = 10.0F;
          break;
        }
      } else if (paramInt3 == 1) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat2[0] = 8.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat2[0] = 14.0F;
          break;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat2[0] = 16.0F;
          break;
        case 5: 
        default: 
          paramArrayOfFloat2[0] = 20.0F;
        }
      }
    }
  }
  
  static zq r(zbni paramzbni)
  {
    zq localzq1 = new zq(paramzbni.y().f(), paramzbni.y().g(), paramzbni.y().h(), paramzbni.y().i());
    com.aspose.cells.b.a.b.a.ze localze = null;
    switch (paramzbni.r())
    {
    case 13: 
      localze = zbmu.a(paramzbni, localzq1, false);
      break;
    case 67: 
      localze = zbhz.a(paramzbni, localzq1, false);
      break;
    case 68: 
      localze = zboe.a(paramzbni, localzq1, false);
      break;
    case 66: 
      localze = zbjj.a(paramzbni, localzq1, false);
      break;
    }
    zq localzq2;
    if (localze != null)
    {
      zo[] arrayOfzo = localze.c();
      zi localzi = s(paramzbni);
      localzi.a(arrayOfzo);
      localzq2 = zbya.a(arrayOfzo);
    }
    else
    {
      localzq2 = localzq1;
    }
    localzq2.a(paramzbni.A().h() / 2.0F, paramzbni.A().h() / 2.0F);
    return localzq2;
  }
  
  static zi s(zbni paramzbni)
  {
    zi localzi = new zi();
    zq localzq = new zq(paramzbni.u(), paramzbni.v(), paramzbni.s(), paramzbni.t());
    if ((paramzbni.y().i() == 0.0F) || (paramzbni.y().h() == 0.0F)) {
      localzq = new zq(paramzbni.W().f(), paramzbni.W().g(), paramzbni.W().h(), paramzbni.W().i());
    }
    zo localzo = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
    localzi.b(zbxz.a(localzo.d()), zbxz.a(localzo.e()));
    localzi.a(paramzbni.w());
    localzi.b(-zbxz.a(localzo.d()), -zbxz.a(localzo.e()));
    return localzi;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */