package com.aspose.cells;

import com.aspose.cells.b.a.b.a.za;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import java.util.ArrayList;
import java.util.Iterator;

final class zbya
{
  static zg a = new zg("Arial", 8.0F);
  
  static com.aspose.cells.b.a.b.zc a(zxk paramzxk, com.aspose.cells.b.a.b.a.ze paramze)
    throws Exception
  {
    if (paramzxk.a()) {
      return new zu(Color.getEmpty());
    }
    Object localObject = null;
    if (paramzxk.d()) {
      localObject = paramzxk.c().a(paramze, null, false, 1.0F);
    } else {
      localObject = new zu(paramzxk.b());
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  static com.aspose.cells.b.a.b.zc a(zxk paramzxk, com.aspose.cells.b.a.b.a.ze paramze, float paramFloat1, float paramFloat2)
    throws Exception
  {
    if (paramzxk.a()) {
      return new zu(Color.getEmpty());
    }
    Object localObject = null;
    if (paramzxk.d()) {
      localObject = paramzxk.c().a(paramzxk, paramze, paramFloat1, paramFloat2);
    } else {
      localObject = new zu(paramzxk.b());
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  static com.aspose.cells.b.a.b.zc a(zxk paramzxk, zq paramzq)
    throws Exception
  {
    if (paramzxk.a()) {
      return new zu(Color.getEmpty());
    }
    Object localObject = null;
    if (paramzxk.d()) {
      localObject = paramzxk.c().a(paramzq);
    } else {
      localObject = new zu(paramzxk.b());
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  static com.aspose.cells.b.a.b.zc a(zxk paramzxk, zq paramzq, float paramFloat1, float paramFloat2)
    throws Exception
  {
    if (paramzxk.a()) {
      return new zu(Color.getEmpty());
    }
    Object localObject = null;
    if (paramzxk.d()) {
      localObject = paramzxk.c().a(paramzq);
    } else {
      localObject = new zu(a(paramzxk, paramFloat1, paramFloat2));
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  static com.aspose.cells.a.d.zs a(zant paramzant)
  {
    if (paramzant.a()) {
      return new com.aspose.cells.a.d.zs(Color.getEmpty());
    }
    com.aspose.cells.a.d.zs localzs = null;
    if (paramzant.e() != 0)
    {
      localzs = new com.aspose.cells.a.d.zs(paramzant.c(), paramzant.f());
    }
    else
    {
      localzs = new com.aspose.cells.a.d.zs(paramzant.c(), paramzant.f());
      switch (paramzant.d())
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
    switch (paramzant.b())
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
    a(localzs, paramzant);
    return localzs;
  }
  
  private static void a(com.aspose.cells.a.d.zs paramzs, zant paramzant)
  {
    if (paramzant.g() != 0) {
      a(paramzs, paramzant.g(), paramzant.h(), paramzant.i(), true, paramzant);
    }
    if (paramzant.j() != 0) {
      a(paramzs, paramzant.j(), paramzant.k(), paramzant.l(), false, paramzant);
    }
  }
  
  static void a(zr paramzr, zbnh paramzbnh, zq paramzq, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
    throws Exception
  {
    if (paramInt1 == 3)
    {
      paramzq = a(paramzbnh.j(), paramzq);
      a(paramzr, paramString, paramzg, paramColor, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramInt2, paramInt3, 2);
    }
    else
    {
      int i = 0;
      int j = paramInt2;
      int k = paramInt3;
      switch (paramInt1)
      {
      case 0: 
        paramzr.c();
        i = -90;
        if (j == 7) {
          paramInt3 = 0;
        } else if (j == 8) {
          paramInt3 = 9;
        } else {
          paramInt3 = j;
        }
        if (k == 9) {
          paramInt2 = 7;
        } else if (k == 0) {
          paramInt2 = 8;
        } else {
          paramInt2 = k;
        }
        break;
      case 1: 
        paramzr.c();
        i = 90;
        if (j == 7) {
          paramInt3 = 9;
        } else if (j == 8) {
          paramInt3 = 0;
        } else {
          paramInt3 = j;
        }
        if (k == 9) {
          paramInt2 = 8;
        } else if (k == 0) {
          paramInt2 = 7;
        } else {
          paramInt2 = k;
        }
        break;
      case 2: 
        i = 0;
        break;
      case 3: 
        i = 0;
        break;
      default: 
        i = 0;
      }
      if (paramzbnh.v().size() > 0)
      {
        a(paramzr, paramzbnh, paramzq, i, paramInt2, paramInt3);
      }
      else
      {
        if ((paramString == null) || ("".equals(paramString)) || (paramString.equals("\n"))) {
          return;
        }
        if ((paramzbnh.e() != 6) || (i != 0)) {
          paramzq = a(paramzbnh.j(), paramzq);
        }
        if (paramString.startsWith("UYGUN OLMAYAN"))
        {
          zbdb localzbdb = new zbdb(paramString, paramzg, Color.a(255, paramzbnh.p()), 2);
          com.aspose.cells.b.a.a.zf.a(paramzbnh.v(), localzbdb);
          a(paramzr, paramzbnh, paramzq, i, paramInt2, paramInt3);
        }
        else
        {
          b(paramzr, paramzbnh, paramzq, paramString, i, paramzg, paramColor, paramInt2, paramInt3);
        }
      }
    }
  }
  
  private static zq a(double paramDouble, zq paramzq)
  {
    float f = Math.abs(paramzq.h() - paramzq.i());
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    if (paramzq.h() > paramzq.i())
    {
      if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
      {
        localzq.a(localzq.f() + f / 2.0F);
        localzq.b(localzq.g() - f / 2.0F);
        localzq.c(paramzq.i());
        localzq.d(paramzq.h());
      }
    }
    else if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
    {
      localzq.a(localzq.f() - f / 2.0F);
      localzq.b(localzq.g() + f / 2.0F);
      localzq.c(paramzq.i());
      localzq.d(paramzq.h());
    }
    return localzq;
  }
  
  private static void a(zr paramzr, zbnh paramzbnh, zq paramzq, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    zbcx localzbcx = new zbcx();
    localzbcx.c(paramzbnh.s());
    localzbcx.d(paramzbnh.t());
    localzbcx.a(a(paramInt2));
    localzbcx.b(a(paramInt3));
    zq localzq = paramzq;
    if (paramInt1 == 0) {
      localzq = a(paramzq, paramzbnh.j());
    }
    zbdg localzbdg = new zbdg(localzq, localzbcx, paramzbnh.v(), paramzbnh.o());
    localzbdg.a(paramzr, -paramInt1, paramzbnh.at());
  }
  
  public static void a(zr paramzr, String paramString, zg paramzg, Color paramColor, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, int paramInt3)
  {
    com.aspose.cells.b.a.b.zs localzs = a(paramzr, paramString, paramzg, new zt(paramFloat3, paramFloat4));
    if (paramInt1 == 1) {
      paramFloat1 += (paramFloat3 - localzs.b()) / 2.0F;
    }
    if (paramInt1 == 8) {
      paramFloat1 = paramFloat1 + paramFloat3 - localzs.b();
    }
    if (paramInt2 == 1) {
      paramFloat2 += (paramFloat4 - localzs.c()) / 2.0F;
    } else if (paramInt2 == 0) {
      paramFloat2 = paramFloat2 + paramFloat4 - localzs.c();
    }
    paramFloat3 = localzs.b();
    paramFloat4 = localzs.c();
    zt localzt = paramzr.a("H", paramzg);
    localzt.a(a(localzt.b()));
    localzt.b(a(localzt.c() / 2.0F + paramzg.d() / 2));
    zu localzu = new zu(paramColor);
    try
    {
      float f1 = paramFloat1;
      if (paramInt3 == 2) {
        f1 = paramFloat1 + paramFloat3 - localzt.b();
      }
      float f2 = paramFloat2;
      com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("(\\s){1,}");
      com.aspose.cells.b.a.g.a.zd localzd = localze.b(paramString);
      int i;
      Object localObject1;
      int m;
      if (localzd.a() > 0)
      {
        i = -1;
        for (int j = 0; j < localzd.a(); j++)
        {
          localObject1 = "";
          if (j == 0)
          {
            if (localzd.a(j).d() != 0) {
              localObject1 = paramString.substring(0, 0 + localzd.a(j).d());
            }
          }
          else {
            localObject1 = paramString.substring(localzd.a(j - 1).d() + localzd.a(j - 1).e(), localzd.a(j - 1).d() + localzd.a(j - 1).e() + (localzd.a(j).d() - (localzd.a(j - 1).d() + localzd.a(j - 1).e())));
          }
          if ((f2 != paramFloat2) && (f2 + localzt.c() * ((String)localObject1).length() > paramFloat4 + paramFloat2))
          {
            if (paramInt3 == 2) {
              f1 -= localzt.b();
            } else {
              f1 += localzt.b();
            }
            f2 = paramFloat2;
          }
          String str2;
          if ((paramInt2 == 1) && (i < j))
          {
            float f3 = 0.0F;
            str2 = null;
            for (int n = j; n < localzd.a(); n++)
            {
              if (n == 0)
              {
                if (localzd.a(n).d() != 0) {
                  str2 = paramString.substring(0, 0 + localzd.a(n).d());
                }
              }
              else {
                str2 = paramString.substring(localzd.a(n - 1).d() + localzd.a(n - 1).e(), localzd.a(n - 1).d() + localzd.a(n - 1).e() + (localzd.a(n).d() - (localzd.a(n - 1).d() + localzd.a(n - 1).e())));
              }
              if ((str2 == null) || (paramFloat4 - f3 < str2.length() * localzt.c())) {
                break;
              }
              i = n;
              f3 += str2.length() * localzt.c();
              if (localzd.a(n).a().indexOf("\n") == -1) {
                f3 += localzd.a(n).a().length() * localzt.c();
              }
            }
            if (paramFloat4 > f3) {
              f2 += (paramFloat4 - f3) / 2.0F;
            }
          }
          Object localObject2;
          Object localObject3;
          for (int k = 0; k < ((String)localObject1).length(); k++)
          {
            str2 = ((String)localObject1).substring(k, k + 1);
            localObject2 = paramzr.a(str2, paramzg);
            if ((f2 + localzt.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
            {
              if (paramInt3 == 2) {
                f1 -= localzt.b();
              } else {
                f1 += localzt.b();
              }
              f2 = paramFloat2;
              if (paramInt2 == 1)
              {
                float f5 = 0.0F;
                for (int i1 = k; i1 < ((String)localObject1).length(); i1++) {
                  f5 += localzt.c();
                }
                if (f5 < paramFloat4) {
                  f2 += (paramFloat4 - f5) / 2.0F;
                }
              }
              k--;
            }
            else
            {
              if (zbbt.a(str2.charAt(0)))
              {
                localObject3 = paramzr.d();
                paramzr.b(f1 + localzt.b() / 2.0F, f2 + localzt.c() / 2.0F);
                paramzr.a(90.0F);
                paramzr.a(str2, paramzg, localzu, -localzt.b() / 2.0F, -localzt.c() / 2.0F);
                paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject3);
              }
              else
              {
                paramzr.a(str2, paramzg, localzu, f1 - (((zt)localObject2).b() - localzt.b()) / 2.0F, f2);
              }
              f2 += localzt.c();
            }
          }
          k = localzd.a(j).a().indexOf("\n");
          if (k >= 0)
          {
            for (m = 0; m < k; m++)
            {
              if ((f2 + localzt.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt.b();
                } else {
                  f1 += localzt.b();
                }
                f2 = paramFloat2;
                break;
              }
              f2 += localzt.c();
            }
            if (paramInt3 == 2) {
              f1 -= localzt.b();
            } else {
              f1 += localzt.b();
            }
            f2 = paramFloat2;
            for (m = k + 1; m < localzd.a(j).e(); m++)
            {
              if ((f2 + localzt.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt.b();
                } else {
                  f1 += localzt.b();
                }
                f2 = paramFloat2;
                break;
              }
              f2 += localzt.c();
            }
          }
          else
          {
            for (m = 0; m < localzd.a(j).e(); m++)
            {
              if ((f2 + localzt.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt.b();
                } else {
                  f1 += localzt.b();
                }
                f2 = paramFloat2;
                break;
              }
              f2 += localzt.c();
            }
          }
          if (j == localzd.a() - 1)
          {
            localObject1 = paramString.substring(localzd.a(j).d() + localzd.a(j).e(), localzd.a(j).d() + localzd.a(j).e() + (paramString.length() - (localzd.a(j).d() + localzd.a(j).e())));
            if ((f2 != paramFloat2) && (f2 + localzt.c() * ((String)localObject1).length() > paramFloat4))
            {
              if (paramInt3 == 2) {
                f1 -= localzt.b();
              } else {
                f1 += localzt.b();
              }
              f2 = paramFloat2;
            }
            if ((f2 == paramFloat2) && (f2 + ((String)localObject1).length() * localzt.c() < paramFloat2 + paramFloat4) && (paramInt2 == 1)) {
              f2 += (paramFloat4 - ((String)localObject1).length() * localzt.c()) / 2.0F;
            }
            for (m = 0; m < ((String)localObject1).length(); m++)
            {
              localObject2 = ((String)localObject1).substring(m, m + 1);
              localObject3 = paramzr.a((String)localObject2, paramzg);
              if ((f2 + localzt.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
              {
                if (paramInt3 == 2) {
                  f1 -= localzt.b();
                } else {
                  f1 += localzt.b();
                }
                f2 = paramFloat2;
                if (paramInt2 == 1)
                {
                  float f6 = 0.0F;
                  for (int i2 = m; i2 < ((String)localObject1).length(); i2++) {
                    f6 += localzt.c();
                  }
                  if (f6 < paramFloat4) {
                    f2 += (paramFloat4 - f6) / 2.0F;
                  }
                }
                m--;
              }
              else
              {
                if (zbbt.a(((String)localObject2).charAt(0)))
                {
                  com.aspose.cells.b.a.b.a.zf localzf2 = paramzr.d();
                  paramzr.b(f1 + localzt.b() / 2.0F, f2 + localzt.c() / 2.0F);
                  paramzr.a(90.0F);
                  paramzr.a((String)localObject2, paramzg, localzu, -localzt.b() / 2.0F, -localzt.c() / 2.0F);
                  paramzr.a(localzf2);
                }
                else
                {
                  paramzr.a((String)localObject2, paramzg, localzu, f1 - (((zt)localObject3).b() - localzt.b()) / 2.0F, f2);
                }
                f2 += localzt.c();
              }
            }
          }
        }
      }
      else
      {
        for (i = 0; i < paramString.length(); i++)
        {
          String str1 = paramString.substring(i, i + 1);
          localObject1 = paramzr.a(str1, paramzg);
          if ((f2 + localzt.c() > paramFloat2 + paramFloat4) && (f2 != paramFloat2))
          {
            if (paramInt3 == 2) {
              f1 -= localzt.b();
            } else {
              f1 += localzt.b();
            }
            f2 = paramFloat2;
            if (paramInt2 == 1)
            {
              float f4 = 0.0F;
              for (m = i; m < paramString.length(); m++) {
                f4 += localzt.c();
              }
              if (f4 < paramFloat4) {
                f2 += (paramFloat4 - f4) / 2.0F;
              }
            }
            i--;
          }
          else
          {
            if (zbbt.a(str1.charAt(0)))
            {
              com.aspose.cells.b.a.b.a.zf localzf1 = paramzr.d();
              paramzr.b(f1 + localzt.b() / 2.0F, f2 + localzt.c() / 2.0F);
              paramzr.a(90.0F);
              paramzr.a(str1, paramzg, localzu, -localzt.b() / 2.0F, -localzt.c() / 2.0F);
              paramzr.a(localzf1);
            }
            else
            {
              paramzr.a(str1, paramzg, localzu, f1 - (((zt)localObject1).b() - localzt.b()) / 2.0F, f2);
            }
            f2 += localzt.c();
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
  
  private static com.aspose.cells.b.a.b.zs a(zr paramzr, String paramString, zg paramzg, zt paramzt)
  {
    zt localzt = paramzr.a("H", paramzg);
    localzt.a(a(localzt.b()));
    localzt.b(a(localzt.c() / 2.0F + paramzg.d() / 2));
    if ((paramString == null) || (paramString.length() == 0)) {
      return new com.aspose.cells.b.a.b.zs(0, 0);
    }
    float f1 = localzt.b();
    float f2 = localzt.c();
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
        if ((f4 != 0.0F) && (f4 + localzt.c() * str1.length() > paramzt.c()))
        {
          f1 += localzt.b();
          f4 = 0.0F;
        }
        for (int k = 0; k < str1.length(); k++)
        {
          String str2 = str1.substring(k, k + 1);
          if ((f4 + localzt.c() > paramzt.c()) && (f4 != 0.0F))
          {
            f1 += localzt.b();
            f3 = f4;
            f4 = 0.0F;
            i = 1;
            k--;
          }
          else
          {
            f4 += localzt.c();
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
            if ((f4 + localzt.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt.b();
              f4 = 0.0F;
              break;
            }
            f4 += localzt.c();
          }
          f1 += localzt.b();
          f4 = 0.0F;
          for (m = k + 1; m < localzd.a(j).e(); m++)
          {
            if ((f4 + localzt.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt.b();
              f4 = 0.0F;
              break;
            }
            f4 += localzt.c();
          }
        }
        else
        {
          for (m = 0; m < localzd.a(j).e(); m++)
          {
            if ((f4 + localzt.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt.b();
              f4 = 0.0F;
              break;
            }
            f4 += localzt.c();
          }
        }
        if (j == localzd.a() - 1)
        {
          str1 = paramString.substring(localzd.a(j).d() + localzd.a(j).e(), localzd.a(j).d() + localzd.a(j).e() + (paramString.length() - (localzd.a(j).d() + localzd.a(j).e())));
          if ((f4 != 0.0F) && (f4 + localzt.c() * str1.length() > paramzt.c()))
          {
            f1 += localzt.b();
            f4 = 0.0F;
          }
          for (m = 0; m < str1.length(); m++)
          {
            String str3 = str1.substring(m, m + 1);
            if ((f4 + localzt.c() > paramzt.c()) && (f4 != 0.0F))
            {
              f1 += localzt.b();
              f3 = f4;
              f4 = 0.0F;
              i = 1;
              m--;
            }
            else
            {
              f4 += localzt.c();
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
        if ((f4 + localzt.c() > paramzt.c()) && (f4 != 0.0F))
        {
          f1 += localzt.b();
          f3 = f4;
          f4 = 0.0F;
          i = 1;
          j--;
        }
        else
        {
          f4 += localzt.c();
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
  
  private static void b(zr paramzr, zbnh paramzbnh, zq paramzq, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3)
    throws Exception
  {
    zv localzv = new zv(zv.c());
    localzv.a(a(paramInt2));
    localzv.c(a(paramInt3));
    com.aspose.cells.b.a.b.a.zf localzf = null;
    Object localObject;
    switch (Math.abs(paramInt1))
    {
    case 0: 
      if ((paramzbnh.at()) && (paramString.length() > 20))
      {
        localObject = new zbdb(paramString, paramzg, paramColor, 2);
        paramzbnh.v().clear();
        com.aspose.cells.b.a.a.zf.a(paramzbnh.v(), localObject);
        a(paramzr, paramzbnh, paramzq, paramzbnh.j(), paramzbnh.q(), paramzbnh.r());
        paramzbnh.v().clear();
      }
      else
      {
        paramzr.a(paramString, paramzg, new zu(paramColor), paramzq, localzv);
      }
      break;
    case 90: 
      localzf = paramzr.d();
      localObject = new zn((int)(paramzq.j() + paramzq.h() / 2.0F), (int)(paramzq.k() + paramzq.i() / 2.0F));
      paramzr.b(((zn)localObject).a(), ((zn)localObject).b());
      paramzr.a(-paramInt1);
      paramzq = new zq(-(paramzq.i() / 2.0F), -(paramzq.h() / 2.0F), paramzq.i(), paramzq.h());
      paramzr.a(paramString, paramzg, new zu(paramColor), paramzq, localzv);
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
      paramzr.a(paramString, paramzg, new zu(paramColor), localzq, localzv);
      paramzr.a(localzf);
    }
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
  
  static float a(float paramFloat)
  {
    return paramFloat / 4.0F;
  }
  
  static zq a(zbnh paramzbnh)
  {
    zant localzant = paramzbnh.n();
    ArrayList localArrayList = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbnh.h(), paramzbnh.i()));
    com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbnh.h(), paramzbnh.l().m()));
    com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbnh.l().l(), paramzbnh.i()));
    com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzbnh.l().l(), paramzbnh.l().m()));
    zo[] arrayOfzo1 = new zo[2];
    if (!localzant.a())
    {
      float f1 = localzant.f();
      float f2 = 0.0F;
      float f3 = 0.0F;
      if (f1 < 3.0F) {
        f1 = 3.0F;
      }
      switch (localzant.i())
      {
      case 1: 
        f3 = 3.0F * f1;
        break;
      case 0: 
        f3 = 2.0F * f1;
        break;
      case 2: 
        f3 = 5.0F * f1;
      }
      switch (localzant.h())
      {
      case 1: 
        f2 = 3.0F * f1;
        break;
      case 0: 
        f2 = 2.0F * f1;
        break;
      case 2: 
        f2 = 5.0F * f1;
      }
      if (localzant.g() == 5)
      {
        f2 += 2.0F * f1;
        f3 += 2.0F * f1;
      }
      double d1 = Math.sqrt(Math.pow(paramzbnh.f(), 2.0D) + Math.pow(paramzbnh.g(), 2.0D));
      double d2 = 0.0D;
      double d3 = 0.0D;
      switch (localzant.g())
      {
      case 1: 
      case 2: 
      case 5: 
        d2 = paramzbnh.f() * f3 / d1;
        d3 = paramzbnh.g() * f3 / d1;
      }
      if ((paramzbnh.a == 1) || (paramzbnh.a == 2)) {
        d4 = paramzbnh.h() + d2;
      } else {
        d4 = paramzbnh.l().l() - d2;
      }
      double d5;
      if ((paramzbnh.a == 1) || (paramzbnh.a == 4)) {
        d5 = paramzbnh.i() + d3;
      } else {
        d5 = paramzbnh.l().m() - d3;
      }
      double d6;
      double d7;
      double d8;
      double d9;
      switch (paramzbnh.a)
      {
      case 1: 
        d6 = paramzbnh.l().f();
        d7 = paramzbnh.l().g();
        d8 = paramzbnh.l().l();
        d9 = paramzbnh.l().m();
        break;
      case 2: 
        d6 = paramzbnh.l().f();
        d7 = paramzbnh.l().m();
        d8 = paramzbnh.l().l();
        d9 = paramzbnh.l().g();
        break;
      case 3: 
        d6 = paramzbnh.l().l();
        d7 = paramzbnh.l().m();
        d8 = paramzbnh.l().f();
        d9 = paramzbnh.l().g();
        break;
      case 4: 
        d6 = paramzbnh.l().l();
        d7 = paramzbnh.l().g();
        d8 = paramzbnh.l().f();
        d9 = paramzbnh.l().m();
        break;
      default: 
        d6 = paramzbnh.l().f();
        d7 = paramzbnh.l().g();
        d8 = paramzbnh.l().l();
        d9 = paramzbnh.l().m();
      }
      double d10 = f2;
      zo[] arrayOfzo3;
      if (localzant.g() == 0) {
        arrayOfzo3 = a(d6, d7, d6, d7, localzant.f(), d8, d9);
      } else {
        arrayOfzo3 = a(d6, d7, d4, d5, d10, d8, d9);
      }
      com.aspose.cells.b.a.a.zf.b(localArrayList, arrayOfzo3);
      double d12;
      double d13;
      double d14;
      if (localzant.g() == 3)
      {
        d12 = f3 / 2.0F;
        d2 = paramzbnh.f() * d12 / d1;
        d3 = paramzbnh.g() * d12 / d1;
        if ((paramzbnh.a == 1) || (paramzbnh.a == 2)) {
          d13 = paramzbnh.h() - d2;
        } else {
          d13 = paramzbnh.l().l() + d2;
        }
        if ((paramzbnh.a == 1) || (paramzbnh.a == 4)) {
          d14 = paramzbnh.i() - d3;
        } else {
          d14 = paramzbnh.l().m() + d3;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d13, (float)d14));
      }
      else if (localzant.g() == 4)
      {
        d12 = f3 / 2.0F;
        d2 = paramzbnh.f() * d12 / d1;
        d3 = paramzbnh.g() * d12 / d1;
        if ((paramzbnh.a == 1) || (paramzbnh.a == 2)) {
          d13 = paramzbnh.h() - d2;
        } else {
          d13 = paramzbnh.l().l() + d2;
        }
        if ((paramzbnh.a == 1) || (paramzbnh.a == 4)) {
          d14 = paramzbnh.i() - d3;
        } else {
          d14 = paramzbnh.l().m() + d3;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d13, (float)d14));
      }
      float f4 = 0.0F;
      float f5 = 0.0F;
      switch (localzant.l())
      {
      case 1: 
        f5 = 3.0F * f1;
        break;
      case 0: 
        f5 = 2.0F * f1;
        break;
      case 2: 
        f5 = 5.0F * f1;
      }
      switch (localzant.k())
      {
      case 1: 
        f4 = 3.0F * f1;
        break;
      case 0: 
        f4 = 2.0F * f1;
        break;
      case 2: 
        f4 = 5.0F * f1;
      }
      if (localzant.j() == 5)
      {
        f4 += 2.0F * f1;
        f5 += 2.0F * f1;
      }
      d2 = Math.sqrt(Math.pow(paramzbnh.f(), 2.0D) + Math.pow(paramzbnh.g(), 2.0D));
      d3 = 0.0D;
      double d4 = 0.0D;
      switch (localzant.j())
      {
      case 1: 
      case 2: 
      case 5: 
        d3 = paramzbnh.f() * f5 / d2;
        d4 = paramzbnh.g() * f5 / d2;
      }
      if ((paramzbnh.a == 3) || (paramzbnh.a == 4)) {
        d7 = paramzbnh.h() + d3;
      } else {
        d7 = paramzbnh.l().l() - d3;
      }
      if ((paramzbnh.a == 3) || (paramzbnh.a == 2)) {
        d8 = paramzbnh.i() + d4;
      } else {
        d8 = paramzbnh.l().m() - d4;
      }
      switch (paramzbnh.a)
      {
      case 3: 
        d5 = paramzbnh.h();
        d6 = paramzbnh.i();
        d9 = paramzbnh.l().l();
        d10 = paramzbnh.l().m();
        break;
      case 4: 
        d5 = paramzbnh.h();
        d6 = paramzbnh.l().m();
        d9 = paramzbnh.l().l();
        d10 = paramzbnh.i();
        break;
      case 1: 
        d5 = paramzbnh.l().l();
        d6 = paramzbnh.l().m();
        d9 = paramzbnh.h();
        d10 = paramzbnh.i();
        break;
      case 2: 
        d5 = paramzbnh.l().l();
        d6 = paramzbnh.i();
        d9 = paramzbnh.h();
        d10 = paramzbnh.l().m();
        break;
      default: 
        d5 = paramzbnh.h();
        d6 = paramzbnh.i();
        d9 = paramzbnh.l().l();
        d10 = paramzbnh.l().m();
      }
      double d11 = f4;
      zo[] arrayOfzo4 = a(d5, d6, d7, d8, d11, d9, d10);
      if (localzant.j() == 0) {
        arrayOfzo4 = a(d5, d6, d5, d6, localzant.f(), d9, d10);
      } else {
        arrayOfzo4 = a(d5, d6, d7, d8, d11, d9, d10);
      }
      com.aspose.cells.b.a.a.zf.b(localArrayList, arrayOfzo4);
      double d15;
      if (localzant.j() == 3)
      {
        d13 = f5 / 2.0F;
        d3 = paramzbnh.f() * d13 / d2;
        d4 = paramzbnh.g() * d13 / d2;
        if ((paramzbnh.a == 3) || (paramzbnh.a == 4)) {
          d14 = paramzbnh.h() - d3;
        } else {
          d14 = paramzbnh.l().l() + d3;
        }
        if ((paramzbnh.a == 3) || (paramzbnh.a == 2)) {
          d15 = paramzbnh.i() - d4;
        } else {
          d15 = paramzbnh.l().m() + d4;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d14, (float)d15));
      }
      else if (localzant.j() == 4)
      {
        d13 = f5 / 2.0F;
        d3 = paramzbnh.f() * d13 / d2;
        d4 = paramzbnh.g() * d13 / d2;
        if ((paramzbnh.a == 3) || (paramzbnh.a == 4)) {
          d14 = paramzbnh.h() - d3;
        } else {
          d14 = paramzbnh.l().l() + d3;
        }
        if ((paramzbnh.a == 3) || (paramzbnh.a == 2)) {
          d15 = paramzbnh.i() - d4;
        } else {
          d15 = paramzbnh.l().m() + d4;
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d14, (float)d15));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)(d5 - f5 / 2.0F), (float)d6));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)(d5 + f5 / 2.0F), (float)d6));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d5, (float)(d6 - f4 / 2.0F)));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo((float)d5, (float)(d6 + f4 / 2.0F)));
      }
    }
    zo[] arrayOfzo2 = a(localArrayList);
    if ((!paramzbnh.d) && (paramzbnh.j() != 0))
    {
      localObject = new zi();
      zo localzo = new zo(paramzbnh.l().f() + paramzbnh.l().h() / 2.0F, paramzbnh.l().g() + paramzbnh.l().i() / 2.0F);
      ((zi)localObject).a(paramzbnh.j(), localzo);
      ((zi)localObject).a(arrayOfzo2);
    }
    Object localObject = a(arrayOfzo2);
    return (zq)localObject;
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
  
  static zq a(zbnh paramzbnh, boolean paramBoolean)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 1111.0F;
    float f4 = 26041.0F;
    ArrayList localArrayList = paramzbnh.l.a;
    if (localArrayList.size() > 0)
    {
      localObject = localArrayList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        zar localzar = (zar)((Iterator)localObject).next();
        if (localzar.b() == 327) {
          f3 = com.aspose.cells.b.a.ze.a(Integer.valueOf(localzar.a()));
        }
        if (localzar.b() == 328) {
          f4 = com.aspose.cells.b.a.ze.a(Integer.valueOf(localzar.a()));
        }
      }
      f1 = Math.abs(paramzbnh.f() * (f3 / 21600.0F));
      f2 = Math.abs(paramzbnh.g() * (f4 / 21600.0F));
    }
    else
    {
      f3 = 1111.0F;
      f4 = 26041.0F;
      f1 = Math.abs(paramzbnh.f() * 0.051435184F);
      f2 = Math.abs(paramzbnh.g() * 1.2056018F);
    }
    Object localObject = new zq();
    if ((f3 > 0.0F) && (f4 > 0.0F))
    {
      if ((f1 > paramzbnh.f()) && (f2 > paramzbnh.g())) {
        localObject = new zq(paramzbnh.h(), paramzbnh.i(), f1, f2);
      } else if ((f1 > paramzbnh.f()) && (f2 < paramzbnh.g())) {
        localObject = new zq(paramzbnh.h(), paramzbnh.i(), f1, paramzbnh.l().i());
      } else if ((f1 < paramzbnh.f()) && (f2 > paramzbnh.g())) {
        localObject = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.l().h(), f2);
      } else if ((f1 < paramzbnh.f()) && (f2 < paramzbnh.g())) {
        localObject = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.l().h(), paramzbnh.l().i());
      }
    }
    else if ((f3 < 0.0F) && (f4 > 0.0F))
    {
      if (f2 > paramzbnh.g()) {
        localObject = new zq(paramzbnh.h(), paramzbnh.i(), f1 + paramzbnh.l().h() + 1.0F, f2);
      } else {
        localObject = new zq(paramzbnh.h(), paramzbnh.i(), f1 + paramzbnh.l().h() + 1.0F, paramzbnh.l().i());
      }
    }
    else if ((f3 < 0.0F) && (f4 < 0.0F)) {
      localObject = new zq(paramzbnh.h(), paramzbnh.i(), f1 + paramzbnh.l().h() + 1.0F, f2 + paramzbnh.l().i());
    } else if (f1 > paramzbnh.f()) {
      localObject = new zq(paramzbnh.h(), paramzbnh.i(), f1, f2 + paramzbnh.l().i() + 1.0F);
    } else {
      localObject = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.l().h(), f2 + paramzbnh.l().i() + 1.0F);
    }
    if ((paramBoolean) && (f3 < 0.0F)) {
      ((zq)localObject).a(((zq)localObject).f() - f1);
    }
    if ((paramBoolean) && (f4 < 0.0F)) {
      ((zq)localObject).b(((zq)localObject).g() - f2);
    }
    ((zq)localObject).a(paramzbnh.n().f(), paramzbnh.n().f());
    return (zq)localObject;
  }
  
  static zq b(zbnh paramzbnh, boolean paramBoolean)
  {
    int i = paramzbnh.L();
    int j = paramzbnh.M();
    int k = paramzbnh.J();
    int m = paramzbnh.K();
    float f3;
    float f1;
    if (i + 1 <= k)
    {
      f3 = paramzbnh.a(i + 1, 0, k, paramzbnh.N());
      f1 = f3 + paramzbnh.l().h() + 5.0F;
    }
    else
    {
      f3 = paramzbnh.a(k, paramzbnh.N(), i + 1, 0);
      f1 = f3 + 5.0F;
      if (paramzbnh.l().h() > f3) {
        f1 = paramzbnh.l().h() + 5.0F;
      }
    }
    float f4;
    float f2;
    if (j <= m)
    {
      f4 = paramzbnh.b(j, 0, m, paramzbnh.O());
      f2 = f4 + paramzbnh.l().i() + 5.0F;
    }
    else
    {
      f4 = paramzbnh.b(m, paramzbnh.O(), j, 0);
      f2 = f4 + 5.0F;
      if (paramzbnh.l().i() > f4) {
        f2 = paramzbnh.l().i() + 5.0F;
      }
    }
    paramzbnh.e(f3);
    paramzbnh.f(f4);
    zq localzq = new zq(paramzbnh.l().f(), paramzbnh.l().g(), f1, f2);
    if (paramBoolean)
    {
      float f5;
      float f6;
      if ((paramzbnh.M() > paramzbnh.K()) && (paramzbnh.L() + 1 <= paramzbnh.J()))
      {
        f5 = -paramzbnh.P();
        f6 = 0.0F;
      }
      else if ((paramzbnh.L() + 1 > paramzbnh.J()) && (paramzbnh.M() <= paramzbnh.K()))
      {
        f5 = 0.0F;
        f6 = -paramzbnh.Q();
      }
      else if ((paramzbnh.L() + 1 > paramzbnh.J()) && (paramzbnh.M() > paramzbnh.K()))
      {
        f5 = 0.0F;
        f6 = 0.0F;
      }
      else
      {
        f5 = -paramzbnh.P();
        f6 = -paramzbnh.Q();
      }
      localzq.a(localzq.f() + f5);
      localzq.b(localzq.g() + f6);
    }
    return localzq;
  }
  
  private static Color a(zxk paramzxk, float paramFloat1, float paramFloat2)
  {
    Color localColor = paramzxk.b();
    float f1 = localColor.getA() & 0xFF;
    float f2 = (localColor.getR() & 0xFF) + (int)paramFloat2;
    f2 = Math.max(0.0F, Math.min(f2, 255.0F)) * paramFloat1;
    float f3 = (localColor.getG() & 0xFF) + (int)paramFloat2;
    f3 = Math.max(0.0F, Math.min(f3, 255.0F)) * paramFloat1;
    float f4 = (localColor.getB() & 0xFF) + (int)paramFloat2;
    f4 = Math.max(0.0F, Math.min(f4, 255.0F)) * paramFloat1;
    return Color.fromArgb((int)f1, (int)f2, (int)f3, (int)f4);
  }
  
  private static void a(com.aspose.cells.a.d.zs paramzs, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, zant paramzant)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (paramzant.f() <= 0.0F)
    {
      if (paramInt2 == 0) {
        switch (paramInt1)
        {
        case 1: 
          f1 = 4.0F;
          break;
        case 3: 
          f1 = 4.0F;
          break;
        case 5: 
          f1 = 4.0F;
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
          f1 = 4.0F;
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
          f1 = 4.0F;
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
          f2 = 4.0F;
          break;
        case 3: 
          f2 = 4.0F;
          break;
        case 5: 
          f2 = 4.0F;
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
          f2 = 6.0F;
          break;
        case 3: 
          f2 = 4.0F;
          break;
        case 5: 
          f2 = 5.0F;
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
          f2 = 5.0F;
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
        f1 = 2.0F;
      } else if (paramInt2 == 1) {
        f1 = 3.0F;
      } else {
        f1 = 5.0F;
      }
      if (paramInt3 == 0) {
        f2 = 3.0F;
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
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, zant paramzant, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (paramzant.f() <= 1.0F)
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
          paramArrayOfFloat1[0] = 6.5F;
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
          paramArrayOfFloat1[0] = 9.0F;
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
          paramArrayOfFloat1[0] = 13.5F;
        }
      }
      if (paramInt3 == 0) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat2[0] = 4.5F;
          break;
        case 5: 
          paramArrayOfFloat2[0] = 6.0F;
        }
      } else if (paramInt3 == 1) {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramArrayOfFloat2[0] = 7.0F;
          break;
        case 5: 
          paramArrayOfFloat2[0] = 8.5F;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
          paramArrayOfFloat2[0] = 12.5F;
        }
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
          paramArrayOfFloat1[0] = 10.0F;
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
          paramArrayOfFloat1[0] = 14.0F;
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
          paramArrayOfFloat2[0] = 10.0F;
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
          paramArrayOfFloat2[0] = 14.0F;
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
          paramArrayOfFloat2[0] = 20.0F;
        }
      }
    }
  }
  
  static zq b(zbnh paramzbnh)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    if (paramzbnh.l.a.size() > 0)
    {
      if (((zar)paramzbnh.l.a.get(0)).b() == 327) {
        f7 = (paramzbnh.f() > paramzbnh.g() ? paramzbnh.f() : paramzbnh.g()) * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)paramzbnh.l.a.get(0)).a())) - 10800.0F) / 21600.0F;
      } else {
        f7 = 0.0F;
      }
    }
    else {
      f7 = 0.0F;
    }
    float[] arrayOfFloat;
    Object localObject;
    if (paramzbnh.n().g() != 0)
    {
      arrayOfFloat = new float[] { f2 };
      localObject = new float[] { f1 };
      a(paramzbnh.n().g(), paramzbnh.n().h(), paramzbnh.n().i(), paramzbnh.n(), arrayOfFloat, (float[])localObject);
      f2 = arrayOfFloat[0];
      f1 = localObject[0];
    }
    if (paramzbnh.n().j() != 0)
    {
      arrayOfFloat = new float[] { f4 };
      localObject = new float[] { f3 };
      a(paramzbnh.n().j(), paramzbnh.n().k(), paramzbnh.n().l(), paramzbnh.n(), arrayOfFloat, (float[])localObject);
      f4 = arrayOfFloat[0];
      f3 = localObject[0];
    }
    float f8 = paramzbnh.n().f();
    if (paramzbnh.f() > paramzbnh.g())
    {
      if ((paramzbnh.g() < f1) || (paramzbnh.g() < f3)) {
        f6 += f8 + 2.0F * (f1 > f3 ? f1 : f3);
      } else {
        f6 = f1 + f3 + f8 + 1.0F;
      }
      if ((f7 > paramzbnh.f() / 2.0F) || (f7 < -paramzbnh.f() / 2.0F)) {
        f5 += Math.abs(f7) - paramzbnh.f() / 2.0F + f8 / 2.0F;
      } else {
        f5 += f2 + f4;
      }
    }
    else
    {
      f5 += f2 + f4;
      if ((f2 > 0.0F) || (f4 > 0.0F) || (paramzbnh.f() <= 0.0F)) {
        f5 += f8;
      }
      if ((f7 > paramzbnh.g() / 2.0F) || (f7 < -paramzbnh.g() / 2.0F)) {
        f6 += Math.abs(f7) - paramzbnh.g() / 2.0F + f8 / 2.0F;
      } else {
        f6 = f1 + f3 + f8 + 1.0F;
      }
    }
    if ((paramzbnh.j() == 180) && ((f3 > 0.0F) || (f4 > 0.0F)))
    {
      if ((f1 == 0.0F) && (f2 == 0.0F)) {
        localObject = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.l().h() + f5, paramzbnh.l().i() + f6);
      } else {
        localObject = new zq(paramzbnh.h() - f4 / 2.0F, paramzbnh.i() - f3 / 2.0F, paramzbnh.l().h() + f5, paramzbnh.l().i() + f6);
      }
    }
    else if ((f1 > 0.0F) || (f2 > 0.0F)) {
      localObject = new zq(paramzbnh.h() - f2 / 2.0F, paramzbnh.i() - f1 / 2.0F, paramzbnh.l().h() + f5, paramzbnh.l().i() + f6);
    } else {
      localObject = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.l().h() + f5, paramzbnh.l().i() + f6);
    }
    return (zq)localObject;
  }
  
  static zq c(zbnh paramzbnh)
  {
    zq localzq = new zq();
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    double d1 = zbks.a(paramzbnh.j());
    double d2 = zbks.a(90 - paramzbnh.j());
    f1 = (float)(paramzbnh.f() * Math.sin(d1));
    f2 = (float)(paramzbnh.f() * Math.cos(d1));
    f3 = (float)(paramzbnh.g() * Math.cos(d2));
    f4 = (float)(paramzbnh.g() * Math.sin(d2));
    float f5 = 0.0F;
    float f6 = 0.0F;
    f5 = Math.abs(f2) + Math.abs(f3);
    f6 = Math.abs(f1) + Math.abs(f4);
    localzq = new zq(paramzbnh.h(), paramzbnh.i(), f5, f6);
    localzq.a(paramzbnh.n().f(), paramzbnh.n().f());
    return localzq;
  }
  
  static zq d(zbnh paramzbnh)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = paramzbnh.n().f();
    if ((paramzbnh.l != null) && (paramzbnh.l.a.size() > 0)) {
      f6 = (paramzbnh.f() > paramzbnh.g() ? paramzbnh.f() : paramzbnh.g()) * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)paramzbnh.l.a.get(0)).a())) - 10800.0F) / 21600.0F;
    } else {
      f6 = (paramzbnh.f() > paramzbnh.g() ? paramzbnh.f() : paramzbnh.g()) * 10800.0F / 21600.0F;
    }
    float[] arrayOfFloat;
    if (paramzbnh.n().g() != 0)
    {
      localObject = new float[] { f2 };
      arrayOfFloat = new float[] { f1 };
      b(paramzbnh.n().g(), paramzbnh.n().h(), paramzbnh.n().i(), paramzbnh.n(), (float[])localObject, arrayOfFloat);
      f2 = localObject[0];
      f1 = arrayOfFloat[0];
    }
    if (paramzbnh.n().j() != 0)
    {
      localObject = new float[] { f2 };
      arrayOfFloat = new float[] { f3 };
      b(paramzbnh.n().j(), paramzbnh.n().k(), paramzbnh.n().l(), paramzbnh.n(), (float[])localObject, arrayOfFloat);
      f2 = localObject[0];
      f3 = arrayOfFloat[0];
    }
    if (paramzbnh.f() > paramzbnh.g())
    {
      f5 += f7 + f1 + f3;
      if (Math.abs(f6) >= paramzbnh.f() / 2.0F) {
        f4 += f7 / 2.0F + Math.abs(f6) - paramzbnh.f() / 2.0F;
      } else {
        f4 += 0.0F;
      }
    }
    else
    {
      f4 = f7 + f1 + f3;
      if (Math.abs(f6) >= paramzbnh.g() / 2.0F) {
        f5 += f7 / 2.0F + Math.abs(f6) - paramzbnh.g() / 2.0F;
      }
    }
    Object localObject = new zq(paramzbnh.h(), paramzbnh.i(), paramzbnh.l().h() + f4, paramzbnh.l().i() + f5);
    return (zq)localObject;
  }
  
  private static void b(int paramInt1, int paramInt2, int paramInt3, zant paramzant, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (paramzant.f() <= 1.0F)
    {
      if (paramInt2 == 0) {
        switch (paramInt1)
        {
        case 1: 
          paramArrayOfFloat1[0] = 4.0F;
          break;
        case 3: 
          paramArrayOfFloat1[0] = 4.0F;
          break;
        case 5: 
          paramArrayOfFloat1[0] = 8.0F;
          break;
        case 4: 
          paramArrayOfFloat1[0] = 4.0F;
          break;
        case 2: 
          paramArrayOfFloat1[0] = 4.0F;
        }
      } else if (paramInt2 == 1) {
        switch (paramInt1)
        {
        case 1: 
          paramArrayOfFloat1[0] = 4.0F;
          break;
        case 3: 
          paramArrayOfFloat1[0] = 4.0F;
          break;
        case 5: 
          paramArrayOfFloat1[0] = 8.0F;
          break;
        case 4: 
          paramArrayOfFloat1[0] = 4.0F;
          break;
        case 2: 
          paramArrayOfFloat1[0] = 4.0F;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 3: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 5: 
          paramArrayOfFloat2[0] = 8.0F;
          break;
        case 4: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 2: 
          paramArrayOfFloat2[0] = 4.0F;
        }
      }
      if (paramInt3 == 0) {
        switch (paramInt1)
        {
        case 1: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 3: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 5: 
          paramArrayOfFloat2[0] = 8.0F;
          break;
        case 4: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 2: 
          paramArrayOfFloat2[0] = 4.0F;
        }
      } else if (paramInt3 == 1) {
        switch (paramInt1)
        {
        case 1: 
          paramArrayOfFloat2[0] = 6.0F;
          break;
        case 3: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 5: 
          paramArrayOfFloat2[0] = 10.0F;
          break;
        case 4: 
          paramArrayOfFloat2[0] = 4.0F;
          break;
        case 2: 
          paramArrayOfFloat2[0] = 4.0F;
        }
      } else {
        switch (paramInt1)
        {
        case 1: 
          paramArrayOfFloat2[0] = 6.0F;
          break;
        case 3: 
          paramArrayOfFloat2[0] = 6.0F;
          break;
        case 5: 
          paramArrayOfFloat2[0] = 10.0F;
          break;
        case 4: 
          paramArrayOfFloat2[0] = 6.0F;
          break;
        case 2: 
          paramArrayOfFloat2[0] = 6.0F;
        }
      }
    }
    else
    {
      if (paramInt2 == 0) {
        paramArrayOfFloat1[0] = 3.0F;
      } else if (paramInt2 == 1) {
        paramArrayOfFloat1[0] = 3.0F;
      } else {
        paramArrayOfFloat1[0] = 5.0F;
      }
      if (paramInt3 == 0) {
        paramArrayOfFloat2[0] = 3.0F;
      } else if (paramInt3 == 1) {
        paramArrayOfFloat2[0] = 3.0F;
      } else {
        paramArrayOfFloat2[0] = 5.0F;
      }
    }
  }
  
  static zq e(zbnh paramzbnh)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = paramzbnh.h();
    float f6 = paramzbnh.i();
    float f7 = paramzbnh.f();
    float f8 = paramzbnh.g();
    float f9 = paramzbnh.n().f();
    if (paramzbnh.l.a.size() > 0)
    {
      f1 = ((zar)paramzbnh.l.a.get(0)).a() / 21600.0F * f7;
      f2 = ((zar)paramzbnh.l.a.get(1)).a() / 21600.0F * f8;
      f3 = ((zar)paramzbnh.l.a.get(2)).a() / 21600.0F * f7;
      f4 = ((zar)paramzbnh.l.a.get(3)).a() / 21600.0F * f8;
    }
    boolean bool1 = paramzbnh.F();
    boolean bool2 = paramzbnh.E();
    if ((f1 > 0.0F) && (f2 > 0.0F) && (f3 > 0.0F) && (f4 > 0.0F) && (f2 > f8) && (f4 > f8))
    {
      f7 += f9;
      f8 = f2 + f9;
    }
    zq localzq = new zq(paramzbnh.h(), paramzbnh.i(), f7, f8);
    return localzq;
  }
  
  static zq a(zq paramzq, int paramInt)
  {
    zi localzi = new zi();
    zo localzo = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + paramzq.i() / 2.0F);
    localzi.a(paramInt, localzo);
    zo[] arrayOfzo = { new zo(paramzq.f(), paramzq.g()), new zo(paramzq.f() + paramzq.h(), paramzq.g()), new zo(paramzq.f(), paramzq.g() + paramzq.i()), new zo(paramzq.f() + paramzq.h(), paramzq.g() + paramzq.i()) };
    localzi.a(arrayOfzo);
    return a(arrayOfzo);
  }
  
  static zq a(zq paramzq1, int paramInt, zq paramzq2)
  {
    zi localzi = new zi();
    zo localzo = new zo(paramzq1.f() + paramzq1.h() / 2.0F, paramzq1.g() + paramzq1.i() / 2.0F);
    localzi.a(paramInt, localzo);
    zo[] arrayOfzo = { new zo(paramzq2.f(), paramzq2.g()), new zo(paramzq2.f() + paramzq2.h(), paramzq2.g()), new zo(paramzq2.f(), paramzq2.g() + paramzq2.i()), new zo(paramzq2.f() + paramzq2.h(), paramzq2.g() + paramzq2.i()) };
    localzi.a(arrayOfzo);
    return a(arrayOfzo);
  }
  
  static zq a(zo[] paramArrayOfzo, zo paramzo, int paramInt)
  {
    zi localzi = new zi();
    localzi.a(paramInt, paramzo);
    localzi.a(paramArrayOfzo);
    return a(paramArrayOfzo);
  }
  
  static zq a(zq paramzq, zadj paramzadj, int paramInt1, int paramInt2)
  {
    float f1 = 21600.0F;
    float f2 = 1.0F;
    float f3 = 1.0F;
    ArrayList localArrayList = new ArrayList();
    switch (paramzadj.a.size())
    {
    case 2: 
      f3 = com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)paramzadj.a.get(0)).a())) / f1 * paramzq.h();
      f2 = paramzq.i() - 2.0F * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)paramzadj.a.get(1)).a())) / f1 * paramzq.i());
      break;
    case 1: 
      if (((zar)paramzadj.a.get(0)).b() == 327)
      {
        f3 = com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)paramzadj.a.get(0)).a())) / f1 * paramzq.h();
        f2 = paramzq.i() - 2.0F * (paramzq.i() * (5047.0F / f1));
      }
      else
      {
        f3 = paramzq.h() * (16136.0F / f1);
        f2 = paramzq.i() - 2.0F * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)paramzadj.a.get(0)).a())) / f1 * paramzq.i());
      }
      break;
    default: 
      f2 = paramzq.i() - 2.0F * (paramzq.i() * (5047.0F / f1));
      f3 = paramzq.h() * (16136.0F / f1);
    }
    if ((f2 <= 0.0F) && (f3 == paramzq.h()))
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), paramzq.i() / 2.0F + paramzq.g()));
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), paramzq.g()));
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g()));
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), paramzq.i() + paramzq.g()));
    }
    else if ((f2 <= 0.0F) && (f3 <= 0.0F))
    {
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), paramzq.g()));
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g()));
      com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), paramzq.i() + paramzq.g()));
    }
    else
    {
      switch (paramInt1)
      {
      case 1: 
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), paramzq.i() + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), paramzq.i() - (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), paramzq.i() - (paramzq.i() - f2) / 2.0F + paramzq.g()));
        break;
      case 2: 
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), paramzq.i() / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), paramzq.i() + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(f3 + paramzq.f(), paramzq.i() - (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), paramzq.i() - (paramzq.i() - f2) / 2.0F + paramzq.g()));
        break;
      case 3: 
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), paramzq.i() / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f2) / 2.0F + f2 + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), paramzq.i() - (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), paramzq.i() + paramzq.g()));
        break;
      case 4: 
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.f(), paramzq.i() / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() + paramzq.f(), (paramzq.i() - f2) / 2.0F + f2 + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), paramzq.i() - (paramzq.i() - f2) / 2.0F + paramzq.g()));
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zo(paramzq.h() - f3 + paramzq.f(), paramzq.i() + paramzq.g()));
      }
    }
    zo[] arrayOfzo = a(localArrayList);
    zo localzo = new zo(paramzq.f() + paramzq.h() / 2.0F, paramzq.g() + paramzq.i() / 2.0F);
    return a(arrayOfzo, localzo, paramInt2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */