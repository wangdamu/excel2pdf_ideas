package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zz;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zm;
import java.util.ArrayList;
import java.util.HashMap;

public class zgs
{
  private static Object E = new Object();
  private static Object F = new Object();
  private static float G = zap.b();
  private static float H = zap.a();
  private zbc I;
  protected String a;
  protected String b;
  protected String c;
  protected String d;
  protected zgy e;
  protected int f;
  protected int g;
  protected int h;
  protected int i;
  protected int j;
  protected int k;
  protected int l;
  protected int m;
  protected int n;
  protected int o;
  protected int p;
  protected int q;
  protected int r;
  protected int s;
  protected int t;
  protected int u;
  protected float v;
  protected int w;
  protected int x;
  protected zha y;
  protected zha z;
  protected zbq A;
  protected boolean B;
  protected zbt C;
  private zaz J;
  private boolean K;
  private boolean L = false;
  private zaf M;
  private boolean N;
  private boolean O;
  public ArrayList D = new ArrayList();
  private static zi P = null;
  private static HashMap Q = new HashMap();
  private static HashMap R = new HashMap();
  
  private static zi z()
  {
    if (P == null) {
      synchronized (F)
      {
        if (P == null) {
          P = A();
        }
      }
    }
    return P;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public zaz d()
  {
    return this.J;
  }
  
  public void a(zaz paramzaz)
  {
    this.J = paramzaz;
  }
  
  public zgy e()
  {
    return this.e;
  }
  
  public void a(zgy paramzgy)
  {
    this.e = paramzgy;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public void b(int paramInt)
  {
    this.g = paramInt;
  }
  
  public int h()
  {
    return this.h;
  }
  
  public void c(int paramInt)
  {
    this.h = paramInt;
  }
  
  public int i()
  {
    return this.i;
  }
  
  public void d(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int j()
  {
    return this.h + this.i;
  }
  
  public int k()
  {
    return this.j;
  }
  
  public void e(int paramInt)
  {
    this.j = paramInt;
  }
  
  public float a(float paramFloat)
  {
    if (k() != 0) {
      return a(k(), paramFloat);
    }
    if (p() - n() > 0) {
      return a(p() - n(), paramFloat);
    }
    if (x() > 0) {
      return a(x(), paramFloat);
    }
    return paramFloat;
  }
  
  public void f(int paramInt)
  {
    this.k = paramInt;
  }
  
  public float b(float paramFloat)
  {
    return a(i(), paramFloat);
  }
  
  public void g(int paramInt)
  {
    this.m = paramInt;
  }
  
  public void h(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void i(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void j(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void k(int paramInt)
  {
    this.l = paramInt;
  }
  
  public int l()
  {
    return this.q;
  }
  
  public void l(int paramInt)
  {
    this.q = paramInt;
  }
  
  public zaf m()
  {
    return this.M;
  }
  
  public void a(zaf paramzaf)
  {
    this.M = paramzaf;
  }
  
  public int n()
  {
    return this.r;
  }
  
  public void m(int paramInt)
  {
    this.r = paramInt;
  }
  
  public int o()
  {
    return this.s;
  }
  
  public void n(int paramInt)
  {
    this.s = paramInt;
  }
  
  public int p()
  {
    return this.t;
  }
  
  public void o(int paramInt)
  {
    this.t = paramInt;
  }
  
  public int q()
  {
    return this.u;
  }
  
  public void p(int paramInt)
  {
    this.u = paramInt;
  }
  
  public float r()
  {
    return this.v;
  }
  
  public void c(float paramFloat)
  {
    this.v = paramFloat;
  }
  
  public int q(int paramInt)
  {
    return this.e.b(paramInt).b();
  }
  
  public int e(String paramString)
  {
    int i1 = 0;
    zcd[] arrayOfzcd = zce.a().a(paramString);
    for (int i2 = 0; i2 < arrayOfzcd.length; i2++)
    {
      zgx localzgx = this.e.b(arrayOfzcd[i2].a);
      i1 += localzgx.c();
    }
    return i1;
  }
  
  public float a(int paramInt, float paramFloat)
  {
    zgx localzgx = this.e.b(paramInt);
    return localzgx.c() * paramFloat / g() * G / 72.0F;
  }
  
  public float b(int paramInt, float paramFloat)
    throws Exception
  {
    int i1 = 96;
    int i2 = (int)((paramFloat * 20.0F * i1 + 720.0F) / 1440.0F);
    i2 = (i2 ^ 0xFFFFFFFF) + 1;
    zam localzam = a(-i2, paramInt, (int)paramFloat);
    return localzam.i * G / H;
  }
  
  public float a(String paramString, float paramFloat)
    throws Exception
  {
    int i1 = b(paramString, paramFloat);
    return i1 / G * 72.0F;
  }
  
  public int b(String paramString, float paramFloat)
    throws Exception
  {
    int i1 = 96;
    int i2 = (int)((paramFloat * 20.0F * i1 + 720.0F) / 1440.0F);
    i2 = (i2 ^ 0xFFFFFFFF) + 1;
    int i3 = 0;
    zcd[] arrayOfzcd1 = zce.a().a(paramString);
    for (zcd localzcd : arrayOfzcd1)
    {
      zam localzam = a(-i2, localzcd.a, (int)paramFloat);
      i3 += localzam.i;
    }
    return (int)(i3 * G / H + 0.5D);
  }
  
  public float c(String paramString, float paramFloat)
  {
    return a(e(paramString), paramFloat);
  }
  
  public float a(float paramFloat1, float paramFloat2)
  {
    float f1 = g() / paramFloat2;
    return paramFloat1 / f1;
  }
  
  public zbc s()
  {
    return this.I;
  }
  
  public void a(zbc paramzbc)
  {
    this.I = paramzbc;
  }
  
  public int t()
  {
    return this.w;
  }
  
  public void r(int paramInt)
  {
    this.w = paramInt;
  }
  
  public void s(int paramInt)
  {
    this.x = paramInt;
  }
  
  public void a(zbt paramzbt)
  {
    this.C = paramzbt;
  }
  
  public zbq u()
  {
    return this.A;
  }
  
  public void a(zbq paramzbq)
  {
    this.A = paramzbq;
  }
  
  public void a(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  public void a(zha paramzha)
  {
    this.y = paramzha;
  }
  
  public void b(zha paramzha)
  {
    this.z = paramzha;
  }
  
  public boolean v()
  {
    return this.K;
  }
  
  public void b(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  public zam a(int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    zam localzam = new zam();
    int i1 = paramInt1;
    int i2 = paramInt1;
    if (i1 >= 65535) {
      i1 = 65535;
    }
    if (i2 >= 65535) {
      i2 = 65535;
    }
    i1 <<= 6;
    i2 <<= 6;
    int i4;
    int i3 = i4 = g();
    int i5 = i1;
    int i6 = i2;
    localzam.c = zay.b(i5, i3);
    localzam.d = zay.b(i6, i4);
    localzam.a = (i5 + 32 >> 6);
    localzam.b = (i6 + 32 >> 6);
    localzam.e = zay.c(zay.a(h(), localzam.d));
    localzam.f = zay.a(zay.a(-i(), localzam.d));
    localzam.g = zay.b(zay.a(j(), localzam.d));
    localzam.h = zay.b(zay.a(t(), localzam.c));
    int i7 = q(paramInt2);
    int i9 = a(i7, paramInt1, u());
    int i8;
    if (i9 > 0)
    {
      i8 = i9 << 6;
      i8 = zay.b(i8);
      localzam.i = (i8 + 63 >> 6);
    }
    else
    {
      zgx localzgx = e().b(paramInt2);
      i8 = localzgx.c();
      i8 = zay.a(i8, localzam.c);
      i8 = zay.b(i8);
      localzam.i = (i8 + 63 >> 6);
      byte[] arrayOfByte = a(a(), paramInt3, f());
      if ((arrayOfByte != null) && (arrayOfByte.length > 0) && (paramInt2 <= 127) && (paramInt2 >= 32))
      {
        int i10 = arrayOfByte[((paramInt3 - 2) * 96 + paramInt2 - 32)] & 0xFF;
        if (i10 > 128) {
          i10 -= 256;
        }
        localzam.i += i10;
      }
    }
    localzam.e = (localzam.e + 32 >> 6);
    localzam.f = (Math.abs(localzam.f) + 32 >> 6);
    localzam.g = (localzam.e + localzam.f + 1);
    return localzam;
  }
  
  public static zs a(String paramString1, float paramFloat, String paramString2, int paramInt)
    throws Exception
  {
    int i1 = 96;
    int i2 = (int)((paramFloat * 20.0F * i1 + 720.0F) / 1440.0F);
    i2 = (i2 ^ 0xFFFFFFFF) + 1;
    zgs localzgs = zav.a().b(paramString1, paramInt, false);
    zs localzs = new zs();
    zcd[] arrayOfzcd1 = zce.a().a(paramString2);
    for (zcd localzcd : arrayOfzcd1)
    {
      int i5 = localzcd.a;
      zam localzam = localzgs.a(-i2, i5, (int)paramFloat);
      localzs.a(localzs.b() + localzam.i);
      int i6 = -1;
      int[] arrayOfInt = { i6 };
      boolean bool = localzgs.a(localzgs.a(), (int)paramFloat, paramInt, arrayOfInt);
      i6 = arrayOfInt[0];
      if (bool) {
        localzam.g = i6;
      } else {
        localzam.g = ((int)(localzgs.a(paramFloat) * H / 72.0F + 0.5D));
      }
      if (localzs.c() < localzam.g) {
        localzs.b(localzam.g);
      }
    }
    localzs.a((int)(localzs.b() * G / H + 0.5D));
    localzs.b((int)(localzs.c() * G / H + 0.5D));
    return localzs;
  }
  
  public boolean a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    throws Exception
  {
    if ((paramInt1 < 2) || (paramInt1 > 33)) {
      return false;
    }
    String str = paramString + paramInt1 + paramInt2;
    Object localObject1 = Q.get(str);
    if (localObject1 == null)
    {
      synchronized (E)
      {
        localObject1 = Q.get(str);
        if (localObject1 == null)
        {
          zh localzh = z().a(paramString + ".dat");
          if (localzh == null)
          {
            paramArrayOfInt[0] = -1;
            Q.put(str, Integer.valueOf(paramArrayOfInt[0]));
            return false;
          }
          za localza = new za(z().a(localzh));
          int i1 = 0;
          if ((paramInt2 & 0x1) != 0) {
            i1 = 32;
          }
          byte[] arrayOfByte = localza.f(64);
          localza.l();
          paramArrayOfInt[0] = (arrayOfByte[(paramInt1 + i1 - 2)] & 0xFF);
          Q.put(str, Integer.valueOf(paramArrayOfInt[0]));
        }
        else
        {
          paramArrayOfInt[0] = ((Integer)localObject1).intValue();
          if (paramArrayOfInt[0] == -1) {
            return false;
          }
        }
      }
    }
    else
    {
      paramArrayOfInt[0] = ((Integer)localObject1).intValue();
      if (paramArrayOfInt[0] == -1) {
        return false;
      }
    }
    return true;
  }
  
  public byte[] a(String paramString, int paramInt1, int paramInt2)
    throws Exception
  {
    if ((paramInt1 < 2) || (paramInt1 > 33)) {
      return null;
    }
    String str = a(paramString, paramInt2);
    byte[] arrayOfByte = (byte[])R.get(str);
    if (arrayOfByte == null) {
      synchronized (E)
      {
        arrayOfByte = (byte[])R.get(str);
        if (arrayOfByte == null)
        {
          zh localzh = z().a(str);
          if (localzh == null)
          {
            arrayOfByte = new byte[0];
            R.put(str, arrayOfByte);
            return arrayOfByte;
          }
          za localza = new za(z().a(localzh));
          arrayOfByte = new byte[(int)localzh.a()];
          localza.a(arrayOfByte, 0, arrayOfByte.length);
          localza.l();
          R.put(str, arrayOfByte);
        }
      }
    }
    return arrayOfByte;
  }
  
  private static String a(String paramString, int paramInt)
  {
    String str = paramString;
    if (paramInt == 0) {
      str = str + "_Regular.diff";
    } else if (paramInt == 1) {
      str = str + "_Bold.diff";
    } else if (paramInt == 2) {
      str = str + "_Bold.diff";
    } else if (paramInt == 3) {
      str = str + "_Bold, Italic.diff";
    }
    return str;
  }
  
  private static int a(int paramInt1, int paramInt2, zbq paramzbq)
  {
    if ((paramzbq.d != null) && (paramzbq.d.length > 0)) {
      for (zaq localzaq : paramzbq.d) {
        if (((localzaq.a & 0xFF) == paramInt2) && (paramInt1 < localzaq.c.length)) {
          return localzaq.c[paramInt1];
        }
      }
    }
    return -1;
  }
  
  public boolean w()
  {
    return this.N;
  }
  
  public void c(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }
  
  public void d(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }
  
  public int x()
  {
    return this.g;
  }
  
  public boolean y()
  {
    return this.L;
  }
  
  public void e(boolean paramBoolean)
  {
    this.L = paramBoolean;
  }
  
  private static zi A()
  {
    zm localzm = zz.a("Aspose.Cells.font.zip");
    zi localzi = zi.a(localzm);
    return localzi;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */