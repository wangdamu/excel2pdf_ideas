package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.zd;
import com.aspose.cells.b.a.g.a.ze;
import java.util.ArrayList;
import java.util.Iterator;

class zbde
{
  private zr a;
  private boolean b = false;
  private zq c;
  private zbcw d;
  private zg e;
  private float f;
  private float g;
  private float h;
  private ArrayList i;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  
  public zbde(zp paramzp, zbcw paramzbcw, zaiz paramzaiz, zg paramzg, boolean paramBoolean)
  {
    this(new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f()), paramzbcw, paramzaiz, paramzg, paramBoolean);
  }
  
  public zbde(zq paramzq, zbcw paramzbcw, zaiz paramzaiz, zg paramzg, boolean paramBoolean)
  {
    this(paramzq, paramzbcw, paramzaiz, paramzg, paramBoolean, 1.0F, 1.0F);
  }
  
  public zbde(zq paramzq, zbcw paramzbcw, zaiz paramzaiz, zg paramzg, boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    this.c = paramzq;
    this.d = paramzbcw;
    this.i = new ArrayList();
    for (int m = 0; m < paramzaiz.getCount(); m++) {
      zf.a(this.i, paramzaiz.a(m));
    }
    this.e = paramzg;
    this.g = paramFloat1;
    this.h = paramFloat2;
    this.l = paramBoolean;
  }
  
  public zq a(zr paramzr, boolean paramBoolean)
    throws Exception
  {
    this.a = paramzr;
    this.b = paramBoolean;
    if (!a()) {
      return zq.c();
    }
    this.f = (this.a.a("A", this.e).c() * this.h);
    if ((this.i == null) || (this.i.size() <= 0)) {
      return zq.c();
    }
    zv localzv = new zv();
    localzv.a(this.d.a());
    localzv.c(this.d.b());
    a(this.i);
    if (this.d.b() == 0)
    {
      if (this.d.a() == 0)
      {
        b(this.i);
        c(this.i);
      }
      else if (this.d.a() == 1)
      {
        b(this.i);
        a(this.i, this.c, true);
        c(this.i);
      }
      else
      {
        b(this.i);
        a(this.i, this.c, false);
        c(this.i);
      }
    }
    else if (this.d.b() == 2)
    {
      if (this.d.a() == 0)
      {
        b(this.i);
        a(this.i, false);
        c(this.i);
      }
      else if (this.d.a() == 1)
      {
        b(this.i);
        a(this.i, this.c, true);
        a(this.i, false);
        c(this.i);
      }
      else
      {
        b(this.i);
        a(this.i, this.c, false);
        a(this.i, false);
        c(this.i);
      }
    }
    else if (this.d.a() == 0)
    {
      b(this.i);
      a(this.i, true);
      c(this.i);
    }
    else if (this.d.a() == 1)
    {
      b(this.i);
      a(this.i, this.c, true);
      a(this.i, true);
      c(this.i);
    }
    else
    {
      b(this.i);
      a(this.i, this.c, false);
      a(this.i, true);
      c(this.i);
    }
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    int m = 1;
    for (int n = 0; n < this.i.size(); n++)
    {
      zbcz localzbcz = (zbcz)this.i.get(n);
      if ((localzbcz.e() == 2) || (localzbcz.e() == 1)) {
        if (m != 0)
        {
          f1 = localzbcz.a.j();
          f2 = localzbcz.a.k();
          f4 = localzbcz.a.l();
          f3 = localzbcz.a.m();
          m = 0;
        }
        else
        {
          if (localzbcz.a.j() < f1) {
            f1 = localzbcz.a.j();
          }
          if (localzbcz.a.k() < f2) {
            f2 = localzbcz.a.k();
          }
          if (localzbcz.a.l() > f4) {
            f4 = localzbcz.a.l();
          }
          if (localzbcz.a.m() > f3) {
            f3 = localzbcz.a.m();
          }
        }
      }
    }
    this.j = true;
    n = zbxz.a(f4 - f1);
    int i1 = zbxz.a(f3 - f2);
    return new zq(f1, f2, n, i1);
  }
  
  public void b(zr paramzr, boolean paramBoolean)
    throws Exception
  {
    this.b = paramBoolean;
    Object localObject1 = this.i.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zbcz)((Iterator)localObject1).next();
      ((zbcz)localObject2).a.a(0.0F);
      ((zbcz)localObject2).a.b(0.0F);
    }
    localObject1 = this.c;
    if (!this.j)
    {
      this.k = true;
      localObject1 = a(paramzr, paramBoolean);
    }
    else
    {
      this.a = paramzr;
    }
    if ((this.l) && (this.d.a() == 0)) {
      a(this.i, (zq)localObject1, false);
    }
    Object localObject2 = this.i.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      zbcz localzbcz = (zbcz)((Iterator)localObject2).next();
      if (localzbcz.e() == 2)
      {
        zg localzg1 = localzbcz.b();
        float f1 = a(localzg1);
        float f2 = f1 * localzg1.b().c(localzg1.k()) / localzg1.b().e(localzg1.k());
        float f3 = f1 * localzg1.b().d(localzg1.k()) / localzg1.b().e(localzg1.k());
        float f4 = f1 * localzg1.b().f(localzg1.k()) / localzg1.b().e(localzg1.k());
        float f5 = f4 - f2 - f3;
        float f6 = localzbcz.a.g() - (f4 - f1) / 2.0F + f2;
        zv localzv = new zv(zv.c());
        zzo localzzo = localzbcz.d();
        if (localzzo.i())
        {
          this.a.a(localzbcz.a(), localzbcz.b(), new zu(localzbcz.c()), localzbcz.a.d(), localzv);
        }
        else
        {
          String str = localzbcz.a();
          if ((localzzo.f()) || (localzzo.g())) {
            str = str.toUpperCase();
          }
          float f7 = localzbcz.b().h();
          if (localzzo.h()) {
            f7 *= 1.2F;
          } else if ((localzzo.d()) || (localzzo.c())) {
            f7 *= 0.7F;
          }
          zg localzg2 = new zg(localzbcz.b().b(), f7, localzbcz.b().k());
          zo localzo = new zo(localzbcz.a.d().d(), localzbcz.a.d().e());
          if (localzzo.e() != 0.0D)
          {
            float f8 = a(localzg2);
            float f9 = f8 * localzg2.b().d(localzg2.k()) / localzg2.b().e(localzg2.k());
            float f10 = f8 * localzg2.b().c(localzg2.k()) / localzg2.b().e(localzg2.k());
            float f11 = f8 * localzg2.b().f(localzg2.k()) / localzg2.b().e(localzg2.k());
            float f12 = f11 - f10 - f9;
            float f13 = f6 - f10;
            localzo.b(f13 - (float)(localzzo.e() / 100.0D * f1));
          }
          this.a.a(str, localzg2, new zu(localzbcz.c()), localzo, localzv);
        }
      }
    }
  }
  
  private boolean a()
  {
    return (this.c.h() > 0.0F) && (this.c.i() > 0.0F);
  }
  
  private void a(ArrayList paramArrayList)
    throws Exception
  {
    ze localze1 = new ze("\\n");
    Object localObject1;
    Object localObject3;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zbcz localzbcz = (zbcz)paramArrayList.get(m);
      localObject1 = localze1.c(localzbcz.a());
      if (localObject1.length > 1)
      {
        for (int i2 = 0; i2 < localObject1.length; i2++)
        {
          if (!"".equals(localObject1[i2]))
          {
            localObject3 = new zbcz(localObject1[i2], localzbcz.b(), localzbcz.c(), localzbcz.d(), 2);
            paramArrayList.add(m, localObject3);
            m++;
          }
          else
          {
            if (("".equals(localObject1[i2])) && (i2 == localObject1.length - 1)) {
              break;
            }
          }
          if (i2 != localObject1.length - 1)
          {
            localObject3 = new zbcz("", localzbcz.b(), localzbcz.c(), localzbcz.d(), 0);
            paramArrayList.add(m, localObject3);
            m++;
          }
        }
        paramArrayList.remove(m);
        m--;
      }
    }
    ze localze2 = new ze("(\\s){1,}");
    Object localObject2;
    for (int n = 0; n < paramArrayList.size(); n++)
    {
      localObject1 = (zbcz)paramArrayList.get(n);
      localObject2 = localze2.b(((zbcz)localObject1).a());
      if (((zd)localObject2).a() > 0)
      {
        int i3 = 0;
        for (int i4 = 0; i4 < ((zd)localObject2).a(); i4++)
        {
          String str;
          if (((zd)localObject2).a(i4).d() > i3)
          {
            str = ((zbcz)localObject1).a().substring(i3, i3 + (((zd)localObject2).a(i4).d() - i3));
            localObject3 = new zbcz(str, ((zbcz)localObject1).b(), ((zbcz)localObject1).c(), ((zbcz)localObject1).d(), 2);
            paramArrayList.add(n, localObject3);
            n++;
          }
          localObject3 = new zbcz(((zd)localObject2).a(i4).a(), ((zbcz)localObject1).b(), ((zbcz)localObject1).c(), ((zbcz)localObject1).d(), 1);
          paramArrayList.add(n, localObject3);
          n++;
          i3 = ((zd)localObject2).a(i4).d() + ((zd)localObject2).a(i4).a().length();
          if ((i4 == ((zd)localObject2).a() - 1) && (i3 <= ((zbcz)localObject1).a().length() - 1))
          {
            str = ((zbcz)localObject1).a().substring(i3, i3 + (((zbcz)localObject1).a().length() - i3));
            localObject3 = new zbcz(str, ((zbcz)localObject1).b(), ((zbcz)localObject1).c(), ((zbcz)localObject1).d(), 2);
            paramArrayList.add(n, localObject3);
            n++;
          }
        }
        paramArrayList.remove(n);
        n--;
      }
    }
    zv localzv = new zv();
    localzv.b(2048);
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      localObject2 = (zbcz)paramArrayList.get(i1);
      if (((zbcz)localObject2).e() != 0)
      {
        localObject3 = zbxz.a(this.a, this.b, ((zbcz)localObject2).a(), ((zbcz)localObject2).b());
        ((zt)localObject3).a(((zt)localObject3).b() * this.g);
        ((zt)localObject3).b(((zt)localObject3).c() * this.h);
        ((zbcz)localObject2).c = ((zt)localObject3);
      }
      else
      {
        localObject3 = zbxz.a(this.a, this.b, "A", ((zbcz)localObject2).b());
        ((zt)localObject3).a(((zt)localObject3).b() * this.g);
        ((zt)localObject3).b(((zt)localObject3).c() * this.h);
        ((zbcz)localObject2).c = ((zt)localObject3);
      }
    }
  }
  
  private String[] a(String paramString, float paramFloat, zg paramzg)
    throws Exception
  {
    if ((paramString == null) || (paramString.length() < 1)) {
      return new String[] { "", "" };
    }
    String[] arrayOfString = new String[2];
    if (paramString.length() == 1) {
      return new String[] { paramString, "" };
    }
    for (int m = 1; m <= paramString.length(); m++)
    {
      String str = paramString.substring(0, 0 + m);
      zt localzt = zbxz.a(this.a, this.b, str, paramzg);
      if (localzt.b() > paramFloat)
      {
        arrayOfString[0] = paramString.substring(0, 0 + (m - 1));
        arrayOfString[1] = paramString.substring(m - 1);
        break;
      }
    }
    return arrayOfString;
  }
  
  private void b(ArrayList paramArrayList)
    throws Exception
  {
    zo localzo = this.c.d();
    float f1 = -3.4028235E38F;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zbcz localzbcz1 = (zbcz)paramArrayList.get(m);
      float f2 = this.c.l() - localzo.d();
      zbcz localzbcz2;
      if (localzbcz1.e() == 0)
      {
        localzbcz1.a = new zq(this.c.f(), localzo.e(), this.c.h(), localzbcz1.c.c());
        localzo.a(this.c.d().d());
        localzbcz2 = null;
        if (m > 0) {
          localzbcz2 = (zbcz)paramArrayList.get(m - 1);
        }
        if ((f2 != this.c.l() - this.c.j()) && (localzbcz2 != null) && (localzbcz2.e() == 1))
        {
          int n = 0;
          for (int i1 = m - 1; m > 0; i1--)
          {
            localzbcz2 = (zbcz)paramArrayList.get(i1);
            if (localzbcz2.e() == 2) {
              n = 1;
            } else {
              if (localzbcz2.a.f() == this.c.f()) {
                break;
              }
            }
          }
          if (n != 0) {
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? localzbcz1.c.c() : f1));
          }
        }
        else
        {
          localzo.b(localzo.e() + (f1 == -3.4028235E38F ? localzbcz1.c.c() : f1));
        }
        f1 = -3.4028235E38F;
      }
      else if (localzbcz1.e() == 1)
      {
        if (localzbcz1.c.b() <= f2)
        {
          localzbcz1.a.a(localzo);
          localzbcz1.a.a(localzbcz1.c);
          localzo.a(localzo.d() + localzbcz1.c.b());
        }
        else if (f2 != 0.0F)
        {
          localzbcz1.c.a(f2);
          localzbcz1.a.a(localzo);
          localzbcz1.a.a(localzbcz1.c);
          localzo.a(this.c.f());
          localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
          f1 = -3.4028235E38F;
        }
        else
        {
          localzbcz1.c.a(f2);
          localzbcz1.a.a(localzo);
          localzbcz1.a.a(localzbcz1.c);
          localzo.a(this.c.f());
          f1 = -3.4028235E38F;
        }
      }
      else if (localzbcz1.e() == 2)
      {
        localzbcz2 = null;
        zbcz localzbcz3 = null;
        if (m > 0) {
          localzbcz2 = (zbcz)paramArrayList.get(m - 1);
        }
        if (m + 1 < paramArrayList.size()) {
          localzbcz3 = (zbcz)paramArrayList.get(m + 1);
        }
        if ((localzbcz2 == null) || (localzbcz2.e() != 1))
        {
          if (localzbcz1.c.b() < f2)
          {
            localzbcz1.a.a(localzo);
            localzbcz1.a.a(localzbcz1.c);
            if (f1 < localzbcz1.c.c()) {
              f1 = localzbcz1.c.c();
            }
            localzo.a(localzo.d() + localzbcz1.c.b());
          }
          else if (localzbcz1.c.b() == f2)
          {
            localzbcz1.a.a(localzo);
            localzbcz1.a.a(localzbcz1.c);
            if (f1 < localzbcz1.c.c()) {
              f1 = localzbcz1.c.c();
            }
            localzo.a(localzo.d() + localzbcz1.c.b());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
            if ((localzbcz3 != null) && (localzbcz3.e() == 0))
            {
              localzbcz3.a = new zq(this.c.f(), localzo.e(), 0.0F, this.f);
              localzo.a(this.c.f());
              m++;
            }
          }
          else
          {
            String[] arrayOfString1 = a(localzbcz1.a(), f2, localzbcz1.b());
            zbcz localzbcz4 = new zbcz(arrayOfString1[0], localzbcz1.b(), localzbcz1.c(), localzbcz1.d(), 2);
            localzbcz4.a = new zq(localzo, new zt(f2, localzbcz1.c.c()));
            localzbcz4.c = localzbcz4.a.e();
            paramArrayList.add(m, localzbcz4);
            localzbcz1.a(arrayOfString1[1]);
            localzbcz1.c = zbxz.a(this.a, this.b, localzbcz1.a(), localzbcz1.b());
            if (f1 < localzbcz1.c.c()) {
              f1 = localzbcz1.c.c();
            }
            localzo.a(this.c.f());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
          }
        }
        else if (localzbcz1.c.b() <= f2)
        {
          float f3 = localzbcz1.c.b();
          for (int i2 = m + 1; (i2 < paramArrayList.size()) && (localzbcz3.e() == 2); i2++)
          {
            localzbcz3 = (zbcz)paramArrayList.get(i2);
            if (localzbcz3.e() != 2) {
              break;
            }
            f3 += localzbcz3.c.b();
            if (f3 > f2) {
              break;
            }
          }
          if (f3 < f2)
          {
            while (m < i2)
            {
              localzbcz3 = (zbcz)paramArrayList.get(m);
              localzbcz3.a.a(localzo);
              localzbcz3.a.a(localzbcz3.c);
              if (f1 < localzbcz3.c.c()) {
                f1 = localzbcz3.c.c();
              }
              localzo.a(localzo.d() + localzbcz3.c.b());
              m++;
            }
            m--;
          }
          else if (f3 == f2)
          {
            while (m < i2)
            {
              localzbcz3 = (zbcz)paramArrayList.get(m);
              localzbcz3.a.a(localzo);
              localzbcz3.a.a(localzbcz3.c);
              if (f1 < localzbcz3.c.c()) {
                f1 = localzbcz3.c.c();
              }
              localzo.a(localzo.d() + localzbcz3.c.b());
              m++;
            }
            m--;
            localzo.b(localzo.e() + localzbcz3.c.c());
            f1 = -3.4028235E38F;
          }
          else if (localzo.d() == this.c.f())
          {
            while (m < i2)
            {
              localzbcz3 = (zbcz)paramArrayList.get(m);
              f2 -= localzbcz3.c.b();
              if (f2 < 0.0F) {
                if (localzo.d() == this.c.f())
                {
                  String[] arrayOfString3 = a(localzbcz3.a(), this.c.h(), localzbcz3.b());
                  zbcz localzbcz6 = new zbcz(arrayOfString3[0], localzbcz3.b(), localzbcz3.c(), localzbcz1.d(), 2);
                  localzbcz6.a = new zq(localzo, new zt(f2, localzbcz3.c.c()));
                  localzbcz6.c = localzbcz6.a.e();
                  paramArrayList.add(m, localzbcz6);
                  localzbcz3.a(arrayOfString3[1]);
                  localzbcz3.c = zbxz.a(this.a, this.b, localzbcz3.a(), localzbcz3.b());
                  if (f1 < localzbcz3.c.c()) {
                    f1 = localzbcz3.c.c();
                  }
                  localzo.a(this.c.f());
                  localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                  f1 = -3.4028235E38F;
                }
                else
                {
                  localzo.a(this.c.f());
                  localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                  f1 = -3.4028235E38F;
                  break;
                }
              }
              localzbcz3.a.a(localzo);
              localzbcz3.a.a(localzbcz3.c);
              if (f1 < localzbcz3.c.c()) {
                f1 = localzbcz3.c.c();
              }
              localzo.a(localzo.d() + localzbcz3.c.b());
              m++;
            }
            m--;
          }
          else
          {
            localzo.a(this.c.f());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
            m--;
          }
        }
        else
        {
          localzo.a(this.c.f());
          localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
          f1 = localzbcz1.c.c();
          f2 = this.c.l() - localzo.d();
          if (localzbcz1.c.b() < f2)
          {
            localzbcz1.a.a(localzo);
            localzbcz1.a.a(localzbcz1.c);
            localzo.a(localzo.d() + localzbcz1.c.b());
          }
          else if (localzbcz1.c.b() == f2)
          {
            localzbcz1.a.a(localzo);
            localzbcz1.a.a(localzbcz1.c);
            localzo.a(this.c.f());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
          }
          else
          {
            String[] arrayOfString2 = a(localzbcz1.a(), f2, localzbcz1.b());
            zbcz localzbcz5 = new zbcz(arrayOfString2[0], localzbcz1.b(), localzbcz1.c(), localzbcz1.d(), 2);
            localzbcz5.a = new zq(localzo, new zt(f2, localzbcz1.c.c()));
            localzbcz5.c = localzbcz5.a.e();
            paramArrayList.add(m, localzbcz5);
            localzbcz1.a(arrayOfString2[1]);
            localzbcz1.c = zbxz.a(this.a, this.b, localzbcz1.a(), localzbcz1.b());
            if (f1 < localzbcz1.c.c()) {
              f1 = localzbcz1.c.c();
            }
            localzo.a(this.c.f());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
          }
        }
      }
    }
    if (this.k) {
      d(paramArrayList);
    }
  }
  
  private void a(ArrayList paramArrayList, zq paramzq, boolean paramBoolean)
  {
    zbcz localzbcz1 = 0;
    float f1 = Float.MAX_VALUE;
    float f2 = 0.0F;
    for (zbcz localzbcz2 = 0; localzbcz2 < paramArrayList.size(); localzbcz2++)
    {
      localzbcz3 = (zbcz)paramArrayList.get(localzbcz2);
      if (localzbcz3.e() != 0)
      {
        if (localzbcz3.a.g() > f1)
        {
          for (int m = localzbcz2 - 1; m > localzbcz1; m--)
          {
            localzbcz5 = (zbcz)paramArrayList.get(m);
            if (localzbcz5.e() == 2) {
              break;
            }
            if (localzbcz5.e() == 1) {
              f2 -= localzbcz5.c.b();
            }
          }
          float f4 = 0.0F;
          if (paramBoolean) {
            f4 = (paramzq.h() - f2) / 2.0F;
          } else {
            f4 = paramzq.h() - f2;
          }
          for (zbcz localzbcz5 = localzbcz1; localzbcz5 < localzbcz2; localzbcz5++)
          {
            zbcz localzbcz6 = (zbcz)paramArrayList.get(localzbcz5);
            localzbcz6.a.a(localzbcz6.a.f() + f4);
          }
          f2 = 0.0F;
          localzbcz1 = localzbcz2;
        }
        f2 += localzbcz3.c.b();
        f1 = localzbcz3.a.g();
      }
    }
    for (localzbcz2 = paramArrayList.size() - 1; localzbcz2 > localzbcz1; localzbcz2--)
    {
      localzbcz3 = (zbcz)paramArrayList.get(localzbcz2);
      if (localzbcz3.e() == 2) {
        break;
      }
      if (localzbcz3.e() == 1) {
        f2 -= localzbcz3.c.b();
      }
    }
    float f3 = 0.0F;
    if (paramBoolean) {
      f3 = (paramzq.h() - f2) / 2.0F;
    } else {
      f3 = paramzq.h() - f2;
    }
    for (zbcz localzbcz3 = localzbcz1; localzbcz3 < paramArrayList.size(); localzbcz3++)
    {
      zbcz localzbcz4 = (zbcz)paramArrayList.get(localzbcz3);
      localzbcz4.a.a(localzbcz4.a.f() + f3);
    }
  }
  
  private void c(ArrayList paramArrayList)
  {
    float f1 = 0;
    float f2 = 1.0F;
    float f3 = Float.MAX_VALUE;
    float f4 = -3.4028235E38F;
    float f5 = Float.MAX_VALUE;
    Object localObject1 = null;
    float f9;
    float f10;
    float f11;
    float f12;
    Object localObject2;
    float f14;
    float f15;
    float f16;
    float f17;
    for (float f6 = 0; f6 < paramArrayList.size(); f6++)
    {
      zbcz localzbcz1 = (zbcz)paramArrayList.get(f6);
      if (localzbcz1.e() == 2)
      {
        if (localzbcz1.a.g() > f5)
        {
          if (f3 != f4)
          {
            zg localzg2 = ((zbcz)localObject1).b();
            f9 = a(localzg2) * localzg2.b().c(localzg2.k()) / localzg2.b().e(localzg2.k());
            f10 = a(localzg2) * localzg2.b().d(localzg2.k()) / localzg2.b().e(localzg2.k());
            f11 = a(localzg2) * localzg2.b().f(localzg2.k()) / localzg2.b().e(localzg2.k());
            f12 = f11 - f9 - f10;
            for (int m = f1; m < f6; m++)
            {
              localObject2 = (zbcz)paramArrayList.get(m);
              if ((((zbcz)localObject2).e() == 2) && (((zbcz)localObject2).a.i() + f2 < f4))
              {
                zg localzg3 = ((zbcz)localObject2).b();
                f14 = a(localzg3);
                f15 = f14 * localzg3.b().d(localzg3.k()) / localzg3.b().e(localzg3.k());
                f16 = f14 * localzg3.b().c(localzg3.k()) / localzg3.b().e(localzg3.k());
                f17 = f14 * localzg3.b().f(localzg3.k()) / localzg3.b().e(localzg3.k());
                float f18 = f17 - f16 - f15;
                ((zbcz)localObject2).a.b(((zbcz)localObject2).a.g() + (f9 - f16 - f12) * this.h);
              }
            }
          }
          f1 = f6;
          f3 = Float.MAX_VALUE;
          f4 = -3.4028235E38F;
        }
        f5 = localzbcz1.a.g();
        if (localzbcz1.c.c() < f3) {
          f3 = localzbcz1.c.c();
        }
        if (localzbcz1.c.c() > f4)
        {
          f4 = localzbcz1.c.c();
          localObject1 = localzbcz1;
        }
      }
    }
    if ((f3 != f4) && (f3 != Float.MAX_VALUE) && (f4 != -3.4028235E38F) && (localObject1 != null))
    {
      zg localzg1 = ((zbcz)localObject1).b();
      float f7 = a(localzg1);
      float f8 = f7 * localzg1.b().c(localzg1.k()) / localzg1.b().e(localzg1.k());
      f9 = f7 * localzg1.b().d(localzg1.k()) / localzg1.b().e(localzg1.k());
      f10 = f7 * localzg1.b().f(localzg1.k()) / localzg1.b().e(localzg1.k());
      f11 = f10 - f8 - f9;
      for (f12 = f1; f12 < paramArrayList.size(); f12++)
      {
        zbcz localzbcz2 = (zbcz)paramArrayList.get(f12);
        if ((localzbcz2.e() == 2) && (localzbcz2.a.i() + f2 < f4))
        {
          localObject2 = localzbcz2.b();
          float f13 = a((zg)localObject2);
          f14 = f13 * ((zg)localObject2).b().d(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
          f15 = f13 * ((zg)localObject2).b().c(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
          f16 = f13 * ((zg)localObject2).b().f(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
          f17 = f16 - f15 - f14;
          localzbcz2.a.b(localzbcz2.a.g() + (f8 - f15 - f11) * this.h);
        }
      }
    }
  }
  
  private void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    float f1 = -3.4028235E38F;
    float f2 = -3.4028235E38F;
    float f3 = 0.0F;
    zbcz localzbcz1;
    for (int m = paramArrayList.size() - 1; m >= 0; m--)
    {
      localzbcz1 = (zbcz)paramArrayList.get(m);
      if (localzbcz1.e() == 0)
      {
        if (m < paramArrayList.size() - 1) {
          if (((zbcz)paramArrayList.get(m + 1)).e() == 2) {
            f3 += f1;
          } else {
            f3 += this.f;
          }
        }
        f1 = -3.4028235E38F;
        f2 = -3.4028235E38F;
      }
      else if (localzbcz1.e() == 2)
      {
        if (localzbcz1.a.g() < f2)
        {
          f3 += f1;
          f1 = -3.4028235E38F;
        }
        f2 = localzbcz1.a.g();
        if (localzbcz1.c.c() > f1) {
          f1 = localzbcz1.c.c();
        }
      }
      else if (localzbcz1.e() != 1) {}
    }
    if (f1 != -3.4028235E38F) {
      f3 += f1;
    }
    zbcz localzbcz2;
    float f4;
    if (paramBoolean)
    {
      localzbcz1 = (zbcz)paramArrayList.get(0);
      localzbcz2 = (zbcz)paramArrayList.get(paramArrayList.size() - 1);
      f4 = (this.c.i() - f3) / 2.0F;
    }
    else
    {
      f4 = this.c.i() - f3;
    }
    for (int n = paramArrayList.size() - 1; n >= 0; n--)
    {
      localzbcz2 = (zbcz)paramArrayList.get(n);
      localzbcz2.a.b(localzbcz2.a.g() + f4);
    }
  }
  
  private void d(ArrayList paramArrayList)
  {
    int m = 0;
    float f1 = Float.MAX_VALUE;
    for (int n = 0; n < paramArrayList.size(); n++)
    {
      zbcz localzbcz = (zbcz)paramArrayList.get(n);
      if (localzbcz.e() != 0)
      {
        if (localzbcz.a.g() > f1)
        {
          if (n - 1 >= m) {
            a(paramArrayList, m, n - 1);
          }
          m = n;
        }
        f1 = localzbcz.a.g();
      }
      else
      {
        if (n - 1 >= m) {
          a(paramArrayList, m, n - 1);
        }
        m = n + 1;
        f1 = localzbcz.a.g();
      }
    }
    a(paramArrayList, m, paramArrayList.size() - 1);
  }
  
  private void a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    if (this.l)
    {
      float f1 = this.c.j();
      for (int m = paramInt2; (m >= paramInt1) && (m >= 0); m--)
      {
        zbcz localzbcz1 = (zbcz)paramArrayList.get(m);
        if (localzbcz1.e() == 2) {
          break;
        }
      }
      for (int n = m; (n >= paramInt1) && (n >= 0); n--)
      {
        zbcz localzbcz2 = (zbcz)paramArrayList.get(n);
        localzbcz2.a.a(f1);
        f1 += localzbcz2.a.h();
      }
    }
  }
  
  private float a(zg paramzg)
  {
    return (int)Math.ceil(this.a.a().a(paramzg));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */