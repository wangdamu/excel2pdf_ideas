package com.aspose.cells;

import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zd;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.g.a.ze;
import java.util.ArrayList;

final class zbvy
{
  public static void a(zr paramzr, zp paramzp, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(paramzr, localzq, paramString, paramInt1, paramzg, paramColor, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static void a(zr paramzr, zq paramzq, String paramString, int paramInt1, zg paramzg, Color paramColor, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    zv localzv = new zv();
    localzv.a(a(paramInt2));
    localzv.c(a(paramInt3));
    if (paramInt4 == 0)
    {
      com.aspose.cells.b.a.b.a.zf localzf = null;
      switch (Math.abs(paramInt1))
      {
      case 0: 
        paramzr.a(paramString, paramzg, new zu(paramColor), paramzq, localzv);
        break;
      case 90: 
        localzf = paramzr.d();
        paramzr.b(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
        paramzr.a(-paramInt1);
        paramzq = new zq(-paramzq.i() / 2.0F, -paramzq.h() / 2.0F, paramzq.i(), paramzq.h());
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
    else
    {
      a(paramzr, paramString, paramzg, paramColor, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramInt4, paramInt5);
    }
  }
  
  public static zs a(zr paramzr, String paramString, int paramInt1, zg paramzg, zs paramzs, int paramInt2, int paramInt3, int paramInt4)
  {
    zt localzt = new zt(paramzs.b(), paramzs.c());
    return a(paramzr, paramString, paramInt1, paramzg, localzt, paramInt2, paramInt3, paramInt4);
  }
  
  public static zs a(zr paramzr, String paramString, int paramInt1, zg paramzg, zt paramzt, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramString.endsWith("\n")) {
      paramString = paramString + " ";
    }
    if (paramInt4 == 0)
    {
      switch (Math.abs(paramInt1))
      {
      case 0: 
        zs localzs1 = a(paramzr, paramString, paramzg, paramzt, paramInt2, paramInt3);
        return localzs1;
      case 90: 
        zs localzs2 = a(paramzr, paramString, paramzg, new zt((int)paramzt.c(), (int)paramzt.b()), paramInt2, paramInt3);
        return new zs(localzs2.c(), localzs2.b());
      }
      zt localzt1 = paramzr.a(paramString, paramzg, new zo(0.0F, 0.0F), new zv(zv.c()));
      return a(localzt1, paramzt, Math.abs(paramInt1));
    }
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    for (int i = 0; i < paramString.length(); i++)
    {
      zt localzt2;
      if (paramString.charAt(i) == '\n')
      {
        localzt2 = zbxz.a(a(paramzr, a(paramString), paramzg));
        if (f1 == 0.0F) {
          f1 = localzt2.c();
        }
        if (f1 > f5) {
          f5 = f1;
        }
        f4 += localzt2.b();
        f1 = 0.0F;
        f3 = 0.0F;
        f2 += 1.0F;
      }
      else
      {
        localzt2 = b(paramzr, Character.toString(paramString.charAt(i)), paramzg);
        zt localzt3 = zbxz.a(a(paramzr, Character.toString(paramString.charAt(i)), paramzg));
        if ((zbbt.a(paramString.charAt(i))) || ((paramInt4 == 2) && (!zbbt.b(paramString.charAt(i))))) {
          localzt3 = new zt(localzt3.c(), localzt2.b());
        } else {
          localzt3.b(localzt2.c() * 0.95F);
        }
        if (localzt3.b() > f3) {
          f3 = localzt3.b();
        }
        if (f1 + localzt3.c() <= paramzt.c())
        {
          f1 += localzt3.c();
          if (f2 == 0.0F) {
            f5 += localzt3.c();
          }
          if (i == paramString.length() - 1)
          {
            if (f1 + localzt3.c() > f5) {
              f5 = f1 + localzt3.c();
            }
            f4 += f3;
          }
        }
        else
        {
          if (f1 > f5) {
            f5 = f1;
          }
          f4 += f3;
          f1 = 0.0F;
          f3 = 0.0F;
          f2 += 1.0F;
          i--;
        }
      }
    }
    return new zs(zbxz.a(f4), zbxz.a(f5));
  }
  
  private static String a(String paramString)
  {
    for (int i = 0; i < paramString.length(); i++) {
      if (paramString.charAt(i) != '\n') {
        return Character.toString(paramString.charAt(i));
      }
    }
    return "a";
  }
  
  private static zs a(zr paramzr, String paramString, zg paramzg, zt paramzt, int paramInt1, int paramInt2)
  {
    zv localzv = new zv();
    localzv.a(a(paramInt1));
    localzv.c(a(paramInt2));
    zt localzt = paramzr.a(paramString, paramzg, paramzt, localzv);
    int i = zbxz.a(localzt.b());
    int j = zbxz.a(localzt.c());
    return new zs(i, j);
  }
  
  private static zs a(zt paramzt1, zt paramzt2, int paramInt)
  {
    double d1 = Math.abs(paramInt % 90) / 180.0D * 3.141592653589793D;
    double d2 = paramzt1.b() * Math.cos(d1) + paramzt1.c() * Math.sin(d1);
    double d3 = paramzt1.b() * Math.sin(d1) + paramzt1.c() * Math.cos(d1);
    if (d2 > paramzt2.b())
    {
      d3 = paramzt2.b() * d3 / d2;
      d2 = paramzt2.b();
    }
    if (d3 > paramzt2.c())
    {
      d2 = paramzt2.c() * d2 / d3;
      d3 = paramzt2.c();
    }
    return new zs(zbxz.a(d2), zbxz.a(d3));
  }
  
  static zs a(zr paramzr, String paramString, zg paramzg)
  {
    zt localzt = paramzr.a(paramString, paramzg);
    int i = zbxz.a(localzt.b());
    int j = zbxz.a(localzt.c());
    return new zs(i, j);
  }
  
  public static zs a(zr paramzr, String paramString, int paramInt1, zg paramzg, zs paramzs, int paramInt2, int paramInt3)
  {
    zt localzt = new zt(paramzs.b(), paramzs.c());
    return a(paramzr, paramString, paramInt1, paramzg, localzt, paramInt2, paramInt3);
  }
  
  public static zs a(zr paramzr, String paramString, int paramInt1, zg paramzg, zt paramzt, int paramInt2, int paramInt3)
  {
    switch (Math.abs(paramInt1))
    {
    case 0: 
      zs localzs1 = b(paramzr, paramString, paramzg, paramzt, paramInt2, paramInt3);
      return localzs1;
    case 90: 
      zs localzs2 = b(paramzr, paramString, paramzg, new zt((int)paramzt.c(), (int)paramzt.b()), paramInt2, paramInt3);
      return new zs(localzs2.c(), localzs2.b());
    }
    zt localzt = paramzr.a(paramString, paramzg, new zo(0.0F, 0.0F), new zv(zv.c()));
    return a(localzt, paramzt, Math.abs(paramInt1));
  }
  
  private static zs b(zr paramzr, String paramString, zg paramzg, zt paramzt, int paramInt1, int paramInt2)
  {
    zv localzv = new zv(zv.c());
    localzv.b(localzv.d() | 0x800);
    localzv.a(a(paramInt1));
    localzv.c(a(paramInt2));
    zt localzt = paramzr.a(paramString, paramzg, paramzt, localzv);
    int i = zbxz.a(localzt.b());
    int j = zbxz.a(localzt.c());
    return new zs(i, j);
  }
  
  public static zt b(zr paramzr, String paramString, zg paramzg)
  {
    zv localzv = new zv(zv.c());
    localzv.b(localzv.d() | 0x800);
    zt localzt = paramzr.a(paramString, paramzg, Integer.MAX_VALUE, localzv);
    int i = zbxz.a(localzt.b());
    int j = zbxz.a(localzt.c());
    return new zt(i, j);
  }
  
  private static zt a(zr paramzr, String paramString, zg paramzg, zs paramzs)
  {
    zt localzt = new zt(paramzs.b(), paramzs.c());
    return a(paramzr, paramString, paramzg, localzt);
  }
  
  private static zt a(zr paramzr, String paramString, zg paramzg, zt paramzt)
  {
    paramzt = new zt(paramzt.b(), paramzt.c());
    int i = zbxz.a(paramzr.a().a(paramzg));
    if ((paramString == null) || (paramString.length() == 0)) {
      return new zt(0.0F, i);
    }
    ze localze1 = new ze("\\n");
    ze localze2 = new ze("^\\s{1,}$");
    if ((!localze2.d(paramString)) && (localze2.d(paramString.substring(paramString.length() - 1)))) {
      paramString = paramString + "|";
    }
    if ((!localze1.d(paramString)) && (localze2.d(paramString)))
    {
      localObject1 = paramzr.a(paramString, paramzg, new zo(0.0F, 0.0F), new zv(2048));
      if (((zt)localObject1).c() > i * 1.5F) {
        return (zt)localObject1;
      }
      localObject2 = "aaaaaaaaaa";
      String str = (String)localObject2 + paramString + (String)localObject2;
      zt localzt1 = new zt(2.14748365E9F, 2.14748365E9F);
      zt localzt2 = a(paramzr, (String)localObject2, paramzg, localzt1);
      localObject3 = a(paramzr, str, paramzg, localzt1);
      float f1 = ((zt)localObject3).b() - 2.0F * localzt2.b() > 0.0F ? ((zt)localObject3).b() - 2.0F * localzt2.b() : i / 5.0F;
      return new zt(f1, ((zt)localObject1).c());
    }
    Object localObject1 = new zv(zv.c());
    ((zv)localObject1).b(((zv)localObject1).d() | 0x800);
    Object localObject2 = paramzr.a(paramString, paramzg, paramzt, (zv)localObject1);
    int j = 0;
    if (((zt)localObject2).c() < i * 1.5F)
    {
      paramString = paramString + "|";
      paramzt.a(paramzt.b() + i);
      localObject2 = paramzr.a(paramString, paramzg, paramzt, (zv)localObject1);
      j = 1;
    }
    int k = zbxz.a(((zt)localObject2).c());
    if ((k < 1) || (((zt)localObject2).b() < 1.0F)) {
      return (zt)localObject2;
    }
    int m = (int)(((zt)localObject2).b() * 0.1D);
    if (m < 10) {
      m = 10;
    }
    Object localObject3 = new za(m, k);
    zi localzi = zi.a((zj)localObject3);
    float f2 = zbxz.a(((zt)localObject2).b());
    if (j == 0)
    {
      localzi.a(Color.getWhite());
      zq localzq = new zq(m - f2, 0.0F, f2, k);
      localzi.a(paramString, paramzg, zd.a(), localzq, (zv)localObject1);
      for (int i1 = m - 1; i1 >= 0; i1--)
      {
        f2 -= 1.0F;
        for (int i2 = 0; (i2 < k) && ((((za)localObject3).a(i1, i2).getR() & 0xFF) == 255); i2++) {}
        if (i2 < k)
        {
          f2 += 1.0F;
          break;
        }
      }
    }
    else
    {
      localzi.a(Color.getWhite());
      localzi.a(paramString, paramzg, zd.a(), m - f2, 0.0F, (zv)localObject1);
      for (int n = m - 1; n >= 0; n--)
      {
        f2 -= 1.0F;
        if ((((za)localObject3).a(n, i / 2).getR() & 0xFF) != 255) {
          break;
        }
      }
    }
    if (localObject3 != null) {
      ((za)localObject3).d();
    }
    if (localzi != null) {
      localzi.e();
    }
    if (f2 < 0.0F) {
      f2 = ((zt)localObject2).b();
    }
    return new zt(f2, k);
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
    return 1;
  }
  
  public static float a(zr paramzr, String paramString, zg paramzg, boolean paramBoolean)
  {
    ze localze = new ze("\\s+");
    String[] arrayOfString = localze.c(paramString);
    float f = 0.0F;
    for (int i = 0; i < arrayOfString.length; i++)
    {
      zv localzv;
      if (paramBoolean) {
        localzv = new zv(zv.c());
      } else {
        localzv = new zv();
      }
      zt localzt = paramzr.a(arrayOfString[i], paramzg, Integer.MAX_VALUE, localzv);
      if (localzt.b() > f) {
        f = localzt.b();
      }
    }
    return f;
  }
  
  public static zt c(zr paramzr, String paramString, zg paramzg)
  {
    zs localzs1 = new zs(Integer.MAX_VALUE, Integer.MAX_VALUE);
    zs localzs2 = a(paramzr, paramString, paramzg);
    zt localzt = a(paramzr, paramString, paramzg, localzs1);
    return new zt(localzs2.b() - localzt.b(), localzs2.c() - localzt.c());
  }
  
  public static void a(zr paramzr, String paramString, zg paramzg, Color paramColor, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2)
  {
    float f1 = paramFloat1;
    if (paramInt2 == 2) {
      f1 = paramFloat1 + paramFloat3;
    }
    float f2 = paramFloat2;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    zu localzu = new zu(paramColor);
    try
    {
      float f3 = 0.0F;
      for (int i = 0; i < paramString.length(); i++)
      {
        zt localzt2;
        if (paramString.charAt(i) == '\n')
        {
          f2 = paramFloat2;
          float f4 = f1;
          if (paramInt2 == 2) {
            f4 -= f3 / 2.0F;
          } else {
            f4 += f3 / 2.0F;
          }
          for (int j = 0; j < localArrayList1.size(); j++)
          {
            zt localzt3 = (zt)localArrayList2.get(j);
            if (((Boolean)localArrayList3.get(j)).booleanValue())
            {
              com.aspose.cells.b.a.b.a.zf localzf1 = paramzr.d();
              paramzr.b(f4, f2 + localzt3.c() / 2.0F);
              paramzr.a(90.0F);
              paramzr.a((String)localArrayList1.get(j), paramzg, localzu, -localzt3.c() / 2.0F, -localzt3.b() / 2.0F);
              paramzr.a(localzf1);
              f2 += localzt3.c();
            }
            else
            {
              paramzr.a((String)localArrayList1.get(j), paramzg, localzu, f4 - localzt3.b() / 2.0F, f2);
              f2 += localzt3.c();
            }
          }
          localzt2 = zbxz.a(a(paramzr, a(paramString), paramzg));
          if (paramInt2 == 2) {
            f1 -= localzt2.b();
          } else {
            f1 += localzt2.b();
          }
          f2 = paramFloat2;
          f3 = 0.0F;
          localArrayList1.clear();
          localArrayList2.clear();
          localArrayList3.clear();
        }
        else
        {
          zt localzt1 = b(paramzr, Character.toString(paramString.charAt(i)), paramzg);
          localzt2 = zbxz.a(a(paramzr, Character.toString(paramString.charAt(i)), paramzg));
          localzt2.b(localzt1.c());
          boolean bool = false;
          if ((zbbt.a(paramString.charAt(i))) || ((paramInt1 == 2) && (!zbbt.b(paramString.charAt(i)))))
          {
            bool = true;
            localzt2 = new zt(localzt2.c(), localzt1.b());
          }
          else
          {
            localzt2.b(localzt1.c() * 0.95F);
          }
          if (localzt2.b() > f3) {
            f3 = localzt2.b();
          }
          if ((f2 + localzt2.c() <= paramFloat2 + paramFloat4) && (i != paramString.length() - 1))
          {
            f2 += localzt2.c();
            com.aspose.cells.b.a.a.zf.a(localArrayList1, Character.toString(paramString.charAt(i)));
            com.aspose.cells.b.a.a.zf.a(localArrayList2, localzt2);
            com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool));
          }
          else
          {
            int k = 0;
            if (f2 + localzt2.c() <= paramFloat2 + paramFloat4) {
              k = 1;
            }
            if ((i == paramString.length() - 1) && (k != 0))
            {
              com.aspose.cells.b.a.a.zf.a(localArrayList1, Character.toString(paramString.charAt(i)));
              com.aspose.cells.b.a.a.zf.a(localArrayList2, localzt2);
              com.aspose.cells.b.a.a.zf.a(localArrayList3, Boolean.valueOf(bool));
            }
            f2 = paramFloat2;
            float f5 = f1;
            if (paramInt2 == 2) {
              f5 -= f3 / 2.0F;
            } else {
              f5 += f3 / 2.0F;
            }
            float f6 = 0.0F;
            for (int m = 0; m < localArrayList2.size(); m++)
            {
              zt localzt4 = (zt)localArrayList2.get(m);
              f6 += localzt4.c();
            }
            float f7 = 0.0F;
            if ((i == paramString.length() - 1) && (f6 < paramFloat4)) {
              f7 = (paramFloat4 - f6) / 2.0F;
            }
            for (int n = 0; n < localArrayList1.size(); n++)
            {
              zt localzt5 = (zt)localArrayList2.get(n);
              if (((Boolean)localArrayList3.get(n)).booleanValue())
              {
                com.aspose.cells.b.a.b.a.zf localzf2 = paramzr.d();
                paramzr.b(f5, f2 + localzt5.c() / 2.0F + f7);
                paramzr.a(90.0F);
                paramzr.a((String)localArrayList1.get(n), paramzg, localzu, -localzt5.c() / 2.0F, -localzt5.b() / 2.0F);
                paramzr.a(localzf2);
                f2 += localzt5.c();
              }
              else
              {
                paramzr.a((String)localArrayList1.get(n), paramzg, localzu, f5 - localzt5.b() / 2.0F, f2 + f7);
                f2 += localzt5.c();
              }
            }
            if ((i == paramString.length() - 1) && (k != 0)) {
              break;
            }
            i--;
            if (paramInt2 == 2)
            {
              f1 -= f3;
              if (f1 < paramFloat1) {
                break;
              }
            }
            else
            {
              f1 += f3;
              if (f1 > paramFloat1 + paramFloat3) {
                break;
              }
            }
            f2 = paramFloat2;
            f3 = 0.0F;
            localArrayList1.clear();
            localArrayList2.clear();
            localArrayList3.clear();
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
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */