package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zd;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.g.a.ze;

final class zbvx
{
  public static zs a(zr paramzr, String paramString, int paramInt1, zg paramzg, zt paramzt, int paramInt2, int paramInt3)
  {
    return a(paramzr, paramString, paramInt1, paramzg, paramzt, paramInt2, paramInt3, null);
  }
  
  public static zs a(zr paramzr, String paramString, int paramInt1, zg paramzg, zt paramzt, int paramInt2, int paramInt3, zbwx paramzbwx)
  {
    switch (Math.abs(paramInt1))
    {
    case 0: 
      zs localzs1 = a(paramzr, paramString, paramzg, paramzt, paramInt2, paramInt3);
      if (paramzbwx != null) {
        localzs1.b(localzs1.c() + 2 * paramzbwx.k());
      }
      return localzs1;
    case 90: 
      zs localzs2 = a(paramzr, paramString, paramzg, new zt((int)paramzt.c(), (int)paramzt.b()), paramInt2, paramInt3);
      if (paramzbwx != null) {
        localzs2.b(localzs2.c() + 2 * paramzbwx.k());
      }
      return new zs(localzs2.c(), localzs2.b());
    case 255: 
      zs localzs3 = a(paramzr, "H", paramzg);
      if ((paramzt.b() < localzs3.b()) || (paramzt.c() < localzs3.c())) {
        return new zs(0, 0);
      }
      int i = 0;
      int j = 0;
      int k = (int)(paramzt.c() / localzs3.c());
      int m = (int)(paramzt.b() / localzs3.b());
      int n = (int)Math.ceil(paramString.length() / k);
      if (k >= paramString.length())
      {
        j = paramString.length() * localzs3.c();
        i = localzs3.b();
      }
      else
      {
        if (n <= m) {
          i = localzs3.b() * n;
        } else {
          i = localzs3.b() * m;
        }
        j = localzs3.c() * k;
      }
      return new zs(i, j);
    }
    zt localzt = paramzr.a(paramString, paramzg, new zo(0.0F, 0.0F), new zv(zv.c()));
    if (paramzbwx != null) {
      localzt.b(localzt.c() + 2 * paramzbwx.k());
    }
    return a(localzt, paramzt, Math.abs(paramInt1));
  }
  
  private static zs a(zr paramzr, String paramString, zg paramzg, zt paramzt, int paramInt1, int paramInt2)
  {
    zv localzv = new zv();
    localzv.a(a(paramInt1));
    localzv.c(a(paramInt2));
    localzv.b(localzv.d() | 0x800);
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
  
  public static zs b(zr paramzr, String paramString, int paramInt1, zg paramzg, zt paramzt, int paramInt2, int paramInt3)
  {
    switch (Math.abs(paramInt1))
    {
    case 0: 
      zs localzs1 = b(paramzr, paramString, paramzg, paramzt, paramInt2, paramInt3);
      return localzs1;
    case 90: 
      zs localzs2 = a(paramzr, paramString, paramzg, new zs((int)paramzt.c(), (int)paramzt.b()), paramInt2, paramInt3);
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
  
  public static float c(zr paramzr, String paramString, zg paramzg)
  {
    ze localze = new ze("\\s+");
    String[] arrayOfString = localze.c(paramString);
    float f = 0.0F;
    for (int i = 0; i < arrayOfString.length; i++)
    {
      zs localzs = a(paramzr, arrayOfString[i], paramzg);
      if (localzs.b() > f) {
        f = localzs.b();
      }
    }
    return f;
  }
  
  public static zt d(zr paramzr, String paramString, zg paramzg)
  {
    zs localzs1 = new zs(Integer.MAX_VALUE, Integer.MAX_VALUE);
    zs localzs2 = a(paramzr, paramString, paramzg);
    zt localzt = a(paramzr, paramString, paramzg, localzs1);
    return new zt(localzs2.b() - localzt.b(), localzs2.c() - localzt.c());
  }
  
  public static zs a(zr paramzr, String paramString, int paramInt1, zg paramzg, zs paramzs, int paramInt2, int paramInt3)
  {
    zt localzt = new zt(paramzs.b(), paramzs.c());
    return a(paramzr, paramString, paramInt1, paramzg, localzt, paramInt2, paramInt3);
  }
  
  public static zs b(zr paramzr, String paramString, int paramInt1, zg paramzg, zs paramzs, int paramInt2, int paramInt3)
  {
    zt localzt = new zt(paramzs.b(), paramzs.c());
    return b(paramzr, paramString, paramInt1, paramzg, localzt, paramInt2, paramInt3);
  }
  
  public static zs a(zr paramzr, String paramString, zg paramzg, zs paramzs, int paramInt1, int paramInt2)
  {
    zt localzt = new zt(paramzs.b(), paramzs.c());
    return b(paramzr, paramString, paramzg, localzt, paramInt1, paramInt2);
  }
  
  public static void a(zr paramzr, String paramString, zg paramzg, Color paramColor, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    zs localzs = a(paramzr, "H", paramzg);
    int i = (int)(paramFloat4 / localzs.c());
    int j = (int)(paramFloat3 / localzs.b());
    zu localzu = new zu(paramColor);
    try
    {
      float f1 = paramFloat1;
      if (paramInt == 2) {
        f1 = paramFloat1 + paramFloat3 - localzs.b();
      }
      float f2 = paramFloat2;
      for (int k = 0; k < j; k++)
      {
        f2 = paramFloat2;
        if ((k == j - 1) && (k != 0))
        {
          m = paramString.length() % i;
          if (m != 0) {
            f2 = paramFloat2 + (i - m) * localzs.c() / 2;
          }
        }
        for (int m = 0; m < i; m++)
        {
          int n = k * i + m;
          if (n >= paramString.length()) {
            break;
          }
          String str = paramString.substring(n, n + 1);
          zt localzt = paramzr.a(str, paramzg);
          if (zbbt.a(str.charAt(0)))
          {
            zf localzf = paramzr.d();
            paramzr.b(f1 + localzs.b() / 2, f2 + localzs.c() / 2);
            paramzr.a(90.0F);
            paramzr.a(str, paramzg, localzu, -localzs.b() / 2, -localzs.c() / 2);
            paramzr.a(localzf);
          }
          else
          {
            paramzr.a(str, paramzg, localzu, f1 - (localzt.b() - localzs.b()) / 2.0F, f2);
          }
          f2 += localzs.c();
        }
        if (paramInt == 2) {
          f1 -= localzs.b();
        } else {
          f1 += localzs.b();
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */