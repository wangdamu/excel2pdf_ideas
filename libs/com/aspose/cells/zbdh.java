package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.zd;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zbdh
{
  private zr a;
  private boolean b = false;
  private zq c;
  private zbcy d;
  private zg e;
  private float f;
  private float g;
  private float h;
  private ArrayList i;
  private int j = 0;
  private float k = zbxp.a();
  private boolean l = false;
  
  public int a()
  {
    return this.j;
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public zbdh(zq paramzq, zbcy paramzbcy, ArrayList paramArrayList, zg paramzg, boolean paramBoolean)
  {
    this(paramzq, paramzbcy, paramArrayList, paramzg, paramBoolean, 1.0F, 1.0F);
  }
  
  public zbdh(zq paramzq, zbcy paramzbcy, ArrayList paramArrayList, zg paramzg, boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    this.c = paramzq;
    this.d = paramzbcy;
    this.i = paramArrayList;
    this.e = paramzg;
    this.g = paramFloat1;
    this.h = paramFloat2;
    this.l = paramBoolean;
  }
  
  boolean a(zr paramzr, boolean paramBoolean)
    throws Exception
  {
    this.a = paramzr;
    this.b = paramBoolean;
    this.f = (this.a.a("A", this.e).c() * this.h);
    if ((this.i == null) || (this.i.size() <= 0)) {
      return false;
    }
    a(this.i);
    c(this.i);
    int m = this.i.size();
    zbdc localzbdc = (zbdc)this.i.get(m - 1);
    return localzbdc.a.g() + localzbdc.a.e().c() > this.c.i();
  }
  
  public zq a(zr paramzr, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    this.a = paramzr;
    this.b = paramBoolean;
    this.f = (this.a.a("A", this.e).c() * this.h);
    if (!b()) {
      return zq.c();
    }
    if ((this.i == null) || (this.i.size() <= 0)) {
      return zq.c();
    }
    zv localzv = new zv();
    localzv.a(this.d.a());
    localzv.c(this.d.b());
    a(this.i);
    if (this.d.b() == 0)
    {
      if (this.d.c())
      {
        c(this.i);
        e(this.i);
        f(this.i);
      }
      else if (this.d.d())
      {
        c(this.i);
        d(this.i);
        f(this.i);
      }
      else if (this.d.a() == 0)
      {
        c(this.i);
        f(this.i);
      }
      else if (this.d.a() == 1)
      {
        c(this.i);
        a(this.i, true);
        f(this.i);
      }
      else
      {
        c(this.i);
        a(this.i, false);
        f(this.i);
      }
    }
    else if (this.d.b() == 2)
    {
      if (this.d.c())
      {
        c(this.i);
        e(this.i);
        b(this.i, false);
        f(this.i);
      }
      else if (this.d.d())
      {
        c(this.i);
        d(this.i);
        b(this.i, false);
        f(this.i);
      }
      else if (this.d.a() == 0)
      {
        c(this.i);
        b(this.i, false);
        f(this.i);
      }
      else if (this.d.a() == 1)
      {
        c(this.i);
        a(this.i, true);
        b(this.i, false);
        f(this.i);
      }
      else
      {
        c(this.i);
        a(this.i, false);
        b(this.i, false);
        f(this.i);
      }
    }
    else if (this.d.c())
    {
      c(this.i);
      e(this.i);
      b(this.i, true);
      f(this.i);
    }
    else if (this.d.d())
    {
      c(this.i);
      d(this.i);
      b(this.i, true);
      f(this.i);
    }
    else if (this.d.a() == 0)
    {
      c(this.i);
      b(this.i, true);
      f(this.i);
    }
    else if (this.d.a() == 1)
    {
      c(this.i);
      a(this.i, true);
      b(this.i, true);
      f(this.i);
    }
    else
    {
      c(this.i);
      a(this.i, false);
      b(this.i, true);
      f(this.i);
    }
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    int m = 1;
    for (int n = 0; n < this.i.size(); n++)
    {
      zbdc localzbdc = (zbdc)this.i.get(n);
      if ((localzbdc.b == 2) || (localzbdc.b == 1)) {
        if (m != 0)
        {
          f1 = localzbdc.a.j();
          f2 = localzbdc.a.k();
          f4 = localzbdc.a.l();
          f3 = localzbdc.a.m();
          m = 0;
        }
        else
        {
          if (localzbdc.a.j() < f1) {
            f1 = localzbdc.a.j();
          }
          if (localzbdc.a.k() < f2) {
            f2 = localzbdc.a.k();
          }
          if (localzbdc.a.l() > f4) {
            f4 = localzbdc.a.l();
          }
          if (localzbdc.a.m() > f3) {
            f3 = localzbdc.a.m();
          }
        }
      }
    }
    n = zbxz.a(f4 - f1);
    int i1 = zbxz.a(f3 - f2);
    return new zq(f1, f2, n, i1);
  }
  
  public void b(zr paramzr, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    this.a = paramzr;
    this.b = paramBoolean;
    this.f = (this.a.a("A", this.e).c() * this.h);
    if (!b()) {
      return;
    }
    if ((this.i == null) || (this.i.size() <= 0)) {
      return;
    }
    zv localzv1 = new zv();
    localzv1.a(this.d.a());
    localzv1.c(this.d.b());
    a(this.i);
    if (this.d.b() == 0)
    {
      if (this.d.c())
      {
        c(this.i);
        e(this.i);
        f(this.i);
      }
      else if (this.d.d())
      {
        c(this.i);
        d(this.i);
        f(this.i);
      }
      else if (this.d.a() == 0)
      {
        c(this.i);
        f(this.i);
      }
      else if (this.d.a() == 1)
      {
        c(this.i);
        a(this.i, true);
        f(this.i);
      }
      else
      {
        c(this.i);
        a(this.i, false);
        f(this.i);
      }
    }
    else if (this.d.b() == 2)
    {
      if (this.d.c())
      {
        c(this.i);
        e(this.i);
        b(this.i, false);
        f(this.i);
      }
      else if (this.d.d())
      {
        c(this.i);
        d(this.i);
        b(this.i, false);
        f(this.i);
      }
      else if (this.d.a() == 0)
      {
        c(this.i);
        b(this.i, false);
        f(this.i);
      }
      else if (this.d.a() == 1)
      {
        c(this.i);
        a(this.i, true);
        b(this.i, false);
        f(this.i);
      }
      else
      {
        c(this.i);
        a(this.i, false);
        b(this.i, false);
        f(this.i);
      }
    }
    else if (this.d.c())
    {
      c(this.i);
      e(this.i);
      b(this.i, true);
      f(this.i);
    }
    else if (this.d.d())
    {
      c(this.i);
      d(this.i);
      b(this.i, true);
      f(this.i);
    }
    else if (this.d.a() == 0)
    {
      c(this.i);
      b(this.i, true);
      f(this.i);
    }
    else if (this.d.a() == 1)
    {
      c(this.i);
      a(this.i, true);
      b(this.i, true);
      f(this.i);
    }
    else
    {
      c(this.i);
      a(this.i, false);
      b(this.i, true);
      f(this.i);
    }
    zo localzo1 = new zo(this.c.j() + this.c.h() / 2.0F, this.c.k() + this.c.i() / 2.0F);
    zf localzf1 = null;
    if (paramFloat != 0.0F)
    {
      localzf1 = paramzr.d();
      paramzr.b(localzo1.d(), localzo1.e());
      paramzr.a(paramFloat);
    }
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      zbdc localzbdc = (zbdc)localIterator.next();
      Object localObject;
      float f1;
      float f2;
      if (localzbdc.i())
      {
        localObject = new ztx();
        localzbdc.j().j = zt.a();
        ((ztx)localObject).b(paramzr, localzbdc.j(), 0, 0);
        zt localzt = localzbdc.j().j;
        f1 = this.c.f();
        if ((localzbdc.j().b == 0) || (localzbdc.j().b == 1)) {
          f1 = this.c.f() + (this.c.h() - localzt.b()) / 2.0F;
        } else if (localzbdc.j().b == 3) {
          f1 = this.c.l() - localzt.b();
        }
        f2 = this.c.g();
        if (this.b) {}
        zf localzf2 = paramzr.d();
        paramzr.b(f1, f2);
        ((ztx)localObject).a(paramzr, localzbdc.j(), 0, 0);
        paramzr.a(localzf2);
      }
      else if (localzbdc.b == 2)
      {
        localObject = localzbdc.c();
        int m = a((zg)localObject);
        f1 = m * ((zg)localObject).b().c(((zg)localObject).k()) / ((zg)localObject).b().e(((zg)localObject).k());
        f2 = m * ((zg)localObject).b().d(((zg)localObject).k()) / ((zg)localObject).b().e(((zg)localObject).k());
        float f3 = m * ((zg)localObject).b().f(((zg)localObject).k()) / ((zg)localObject).b().e(((zg)localObject).k());
        float f4 = localzbdc.a.g() - (f3 - m) / 2.0F + f1;
        zv localzv2 = new zv(zv.c());
        zo localzo2 = new zo(localzbdc.a.d().d(), localzbdc.a.d().e());
        if (localzbdc.g())
        {
          localzo2.b(localzo2.e() - 1.0F);
          if ((localzbdc.b().length() == 1) && (localzbdc.b().charAt(0) == 61630))
          {
            localzo2.a(localzo2.d() + 2.0F);
            localzo2.b(localzo2.e() + 1.0F);
          }
        }
        if (a(localzbdc))
        {
          zzo localzzo = localzbdc.e();
          if (localzzo.i())
          {
            if (paramFloat != 0.0F)
            {
              localzo2.a(localzo2.d() - localzo1.d());
              localzo2.b(localzo2.e() - localzo1.e());
            }
            zbyb.a(this.a, localzbdc.c, localzbdc.b(), localzbdc.c(), new zu(localzbdc.d()), new zq(localzo2.d(), localzo2.e(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), localzv2);
          }
          else
          {
            String str = localzbdc.b();
            if ((localzzo.f()) || (localzzo.g())) {
              str = str.toUpperCase();
            }
            float f5 = localzbdc.c().h();
            if ((!localzzo.h()) && ((localzzo.d()) || (localzzo.c()))) {
              f5 *= 0.7F;
            }
            zg localzg = new zg(localzbdc.c().b(), f5, localzbdc.c().k());
            if (localzzo.e() != 0.0D)
            {
              float f6 = a(localzg);
              float f7 = f6 * localzg.b().d(localzg.k()) / localzg.b().e(localzg.k());
              float f8 = f6 * localzg.b().c(localzg.k()) / localzg.b().e(localzg.k());
              float f9 = f6 * localzg.b().f(localzg.k()) / localzg.b().e(localzg.k());
              float f10 = f9 - f8 - f7;
              float f11 = f4 - f8;
              localzo2.b(f11 - (float)(localzzo.e() / 100.0D * m));
            }
            if (paramFloat != 0.0F)
            {
              localzo2.a(localzo2.d() - localzo1.d());
              localzo2.b(localzo2.e() - localzo1.e());
            }
            zbyb.a(this.a, localzbdc.c, str, localzg, new zu(localzbdc.d()), new zq(localzo2.d(), localzo2.e(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), localzv2);
          }
        }
      }
    }
    if (paramFloat != 0.0F) {
      paramzr.a(localzf1);
    }
  }
  
  private boolean a(zbdc paramzbdc)
  {
    if (a() == 2) {
      return true;
    }
    if (paramzbdc.a.f() < this.c.f() - 4.0F) {
      return false;
    }
    if (paramzbdc.a.g() < this.c.g() - 4.0F) {
      return false;
    }
    if (paramzbdc.a.l() > this.c.l() + 4.0F) {
      return false;
    }
    return paramzbdc.a.m() <= this.c.m() + 4.0F;
  }
  
  private boolean b()
  {
    return (this.c.h() > 0.0F) && (this.c.i() > 0.0F);
  }
  
  private int a(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    int m = 0;
    int n = paramString.indexOf("-", m);
    return n;
  }
  
  private void a(ArrayList paramArrayList)
    throws Exception
  {
    ze localze1 = new ze("\\n");
    Object localObject1;
    zbdc localzbdc2;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zbdc localzbdc1 = (zbdc)paramArrayList.get(m);
      localObject1 = localze1.c(localzbdc1.b());
      if (localObject1.length > 1)
      {
        for (int i2 = 0; i2 < localObject1.length; i2++)
        {
          if (!"".equals(localObject1[i2]))
          {
            localzbdc2 = new zbdc(localObject1[i2], localzbdc1.c(), localzbdc1.d(), localzbdc1.e(), 2, localzbdc1.a());
            localzbdc2.a(localzbdc1);
            paramArrayList.add(m, localzbdc2);
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
            localzbdc2 = new zbdc("", localzbdc1.c(), localzbdc1.d(), localzbdc1.e(), 0, localzbdc1.a());
            localzbdc2.a(localzbdc1);
            paramArrayList.add(m, localzbdc2);
            m++;
          }
        }
        paramArrayList.remove(m);
        m--;
      }
    }
    ze localze2 = new ze("(\\s){1,}");
    Object localObject2;
    int i7;
    for (int n = 0; n < paramArrayList.size(); n++)
    {
      localObject1 = (zbdc)paramArrayList.get(n);
      localObject2 = localze2.b(((zbdc)localObject1).b());
      if (((zd)localObject2).a() > 0)
      {
        int i6 = 0;
        for (i7 = 0; i7 < ((zd)localObject2).a(); i7++)
        {
          String str1;
          if (((zd)localObject2).a(i7).d() > i6)
          {
            str1 = ((zbdc)localObject1).b().substring(i6, i6 + (((zd)localObject2).a(i7).d() - i6));
            localzbdc2 = new zbdc(str1, ((zbdc)localObject1).c(), ((zbdc)localObject1).d(), ((zbdc)localObject1).e(), 2, ((zbdc)localObject1).a());
            localzbdc2.a((zbdc)localObject1);
            paramArrayList.add(n, localzbdc2);
            n++;
          }
          localzbdc2 = new zbdc(((zd)localObject2).a(i7).a(), ((zbdc)localObject1).c(), ((zbdc)localObject1).d(), ((zbdc)localObject1).e(), 1, ((zbdc)localObject1).a());
          localzbdc2.a((zbdc)localObject1);
          paramArrayList.add(n, localzbdc2);
          n++;
          i6 = ((zd)localObject2).a(i7).d() + ((zd)localObject2).a(i7).a().length();
          if ((i7 == ((zd)localObject2).a() - 1) && (i6 <= ((zbdc)localObject1).b().length() - 1))
          {
            str1 = ((zbdc)localObject1).b().substring(i6, i6 + (((zbdc)localObject1).b().length() - i6));
            localzbdc2 = new zbdc(str1, ((zbdc)localObject1).c(), ((zbdc)localObject1).d(), ((zbdc)localObject1).e(), 2, ((zbdc)localObject1).a());
            localzbdc2.a((zbdc)localObject1);
            paramArrayList.add(n, localzbdc2);
            n++;
          }
        }
        paramArrayList.remove(n);
        n--;
      }
    }
    Object localObject4;
    for (n = 0; n < paramArrayList.size(); n++)
    {
      localObject1 = (zbdc)paramArrayList.get(n);
      if ((((zbdc)localObject1).b == 2) && (((zbdc)localObject1).b() != null) && (((zbdc)localObject1).b().length() > 1))
      {
        localObject2 = ((zbdc)localObject1).b();
        for (int i4 = a((String)localObject2); i4 > 0; i4 = a((String)localObject2))
        {
          localObject4 = new zbdc(((String)localObject2).substring(0, 0 + (i4 + 1)), ((zbdc)localObject1).c(), ((zbdc)localObject1).d(), ((zbdc)localObject1).e(), 2, ((zbdc)localObject1).a());
          ((zbdc)localObject4).a((zbdc)localObject1);
          paramArrayList.add(n, localObject4);
          n++;
          localObject4 = new zbdc("", ((zbdc)localObject1).c(), ((zbdc)localObject1).d(), ((zbdc)localObject1).e(), 1, ((zbdc)localObject1).a());
          ((zbdc)localObject4).a((zbdc)localObject1);
          paramArrayList.add(n, localObject4);
          n++;
          localObject2 = ((String)localObject2).substring(i4 + 1);
        }
        ((zbdc)localObject1).a((String)localObject2);
      }
    }
    ze localze3 = new ze("(\\s+)|([\\u2E80-\\u9FFF\\uF900-\\uFAFF\\uFF00-\\uFFEF])|([^\\u2E80-\\u9FFF\\uF900-\\uFAFF\\uFF00-\\uFFEF\\s]+)");
    Object localObject3;
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      localObject2 = (zbdc)paramArrayList.get(i1);
      if ((((zbdc)localObject2).b == 2) && (((zbdc)localObject2).b() != null) && (((zbdc)localObject2).b().length() > 0))
      {
        localObject3 = localze3.b(((zbdc)localObject2).b());
        if (((zd)localObject3).a() > 1)
        {
          for (i7 = 0; i7 < ((zd)localObject3).a(); i7++)
          {
            localObject4 = new zbdc(((zd)localObject3).a(i7).a(), ((zbdc)localObject2).c(), ((zbdc)localObject2).d(), ((zbdc)localObject2).e(), 2, ((zbdc)localObject2).a());
            ((zbdc)localObject4).a((zbdc)localObject2);
            paramArrayList.add(i1, localObject4);
            i1++;
          }
          paramArrayList.remove(i1);
          i1--;
        }
      }
    }
    ze localze4 = new ze("\\t");
    int i9;
    String str3;
    Object localObject5;
    for (int i3 = 0; i3 < paramArrayList.size(); i3++)
    {
      localObject3 = (zbdc)paramArrayList.get(i3);
      if ((((zbdc)localObject3).b == 1) && (((zbdc)localObject3).b() != null) && (((zbdc)localObject3).b().length() > 1))
      {
        localObject4 = localze4.b(((zbdc)localObject3).b());
        if (((zd)localObject4).a() > 0)
        {
          int i8 = 0;
          for (i9 = 0; i9 < ((zd)localObject4).a(); i9++)
          {
            if (((zd)localObject4).a(i9).d() > i8)
            {
              str3 = ((zbdc)localObject3).b().substring(i8, i8 + (((zd)localObject4).a(i9).d() - i8));
              localObject5 = new zbdc(str3, ((zbdc)localObject3).c(), ((zbdc)localObject3).d(), ((zbdc)localObject3).e(), 1, ((zbdc)localObject3).a());
              ((zbdc)localObject5).a((zbdc)localObject3);
              paramArrayList.add(i3, localObject5);
              i3++;
            }
            localObject5 = new zbdc(((zd)localObject4).a(i9).a(), ((zbdc)localObject3).c(), ((zbdc)localObject3).d(), ((zbdc)localObject3).e(), 1, ((zbdc)localObject3).a());
            ((zbdc)localObject5).a((zbdc)localObject3);
            paramArrayList.add(i3, localObject5);
            i3++;
            i8 = ((zd)localObject4).a(i9).d() + ((zd)localObject4).a(i9).a().length();
            if ((i9 == ((zd)localObject4).a() - 1) && (i8 <= ((zbdc)localObject3).b().length() - 1))
            {
              str3 = ((zbdc)localObject3).b().substring(i8, i8 + (((zbdc)localObject3).b().length() - i8));
              localObject5 = new zbdc(str3, ((zbdc)localObject3).c(), ((zbdc)localObject3).d(), ((zbdc)localObject3).e(), 1, ((zbdc)localObject3).a());
              ((zbdc)localObject5).a((zbdc)localObject3);
              paramArrayList.add(i3, localObject5);
              i3++;
            }
          }
          paramArrayList.remove(i3);
          i3--;
        }
      }
    }
    b(paramArrayList);
    zv localzv = new zv();
    localzv.b(2048);
    Object localObject6;
    float f2;
    for (int i5 = 0; i5 < paramArrayList.size(); i5++)
    {
      localObject4 = (zbdc)paramArrayList.get(i5);
      if (((zbdc)localObject4).b != 0)
      {
        localObject5 = new zt(0.0F, 0.0F);
        if (((zbdc)localObject4).f())
        {
          localObject5 = new zt(this.k, ((zbdc)localObject4).c().d());
        }
        else
        {
          String str2 = ((zbdc)localObject4).b();
          if (((zbdc)localObject4).g())
          {
            localObject5 = zbxz.a(this.a, this.b, str2, ((zbdc)localObject4).h());
            ((zbdc)localObject4).a(str2);
            if (this.b) {
              ((zt)localObject5).a(((zt)localObject5).b() * 1.3F);
            } else {
              ((zt)localObject5).a(((zt)localObject5).b() * 1.3F);
            }
          }
          else if (((zbdc)localObject4).y() != 0.0D)
          {
            for (i9 = 0; i9 < str2.length(); i9++)
            {
              str3 = str2.substring(i9, i9 + 1);
              localObject5 = zbxz.a(this.a, this.b, str3, ((zbdc)localObject4).c());
              localObject6 = new zbdc(str3, ((zbdc)localObject4).c(), ((zbdc)localObject4).d(), ((zbdc)localObject4).e(), 2, ((zbdc)localObject4).a());
              ((zbdc)localObject6).a((zbdc)localObject4);
              paramArrayList.add(i5, localObject6);
              i5++;
              ((zt)localObject5).a(((zt)localObject5).b() + zbxz.d(((zbdc)localObject4).y()));
              ((zt)localObject5).a(((zt)localObject5).b() * this.g);
              ((zt)localObject5).b(((zt)localObject5).c() * this.h);
              ((zbdc)localObject6).a.a((zt)localObject5);
            }
            paramArrayList.remove(i5);
            i5--;
          }
          else
          {
            if ((((zbdc)localObject4).e().d()) || (((zbdc)localObject4).e().c()))
            {
              f2 = ((zbdc)localObject4).c().h() * 0.7F;
              ((zbdc)localObject4).b(new zg(((zbdc)localObject4).c().b(), f2, ((zbdc)localObject4).c().k(), ((zbdc)localObject4).c().m()));
            }
            localObject5 = zbxz.a(this.a, this.b, str2, ((zbdc)localObject4).h());
          }
        }
        ((zt)localObject5).a(((zt)localObject5).b() * this.g);
        ((zt)localObject5).b(((zt)localObject5).c() * this.h);
        ((zbdc)localObject4).a.a((zt)localObject5);
      }
      else
      {
        localObject5 = zbxz.a(this.a, this.b, "A", ((zbdc)localObject4).c());
        ((zt)localObject5).a(((zt)localObject5).b() * this.g);
        ((zt)localObject5).b(((zt)localObject5).c() * this.h);
        ((zbdc)localObject4).a.a((zt)localObject5);
      }
    }
    for (i5 = 0; i5 < paramArrayList.size(); i5++)
    {
      localObject4 = (zbdc)paramArrayList.get(i5);
      localObject5 = ((zbdc)localObject4).a.e();
      float f1 = ((zt)localObject5).c();
      f2 = f1 * ((zbdc)localObject4).c().b().f(((zbdc)localObject4).c().k()) / ((zbdc)localObject4).c().b().e(((zbdc)localObject4).c().k());
      float f3;
      if (zbxz.a(f1) == zbxz.a(f2))
      {
        f3 = 0.0F;
        if ((((zbdc)localObject4).s().b > 100000) && (((zbdc)localObject4).s().a == 0))
        {
          f3 = zbxz.a(zbdc.a(((zbdc)localObject4).s(), f1));
        }
        else
        {
          localObject6 = new zbqv();
          ((zbqv)localObject6).b = ((int)(((zbdc)localObject4).c().h() + 2.0F) * 100);
          ((zbqv)localObject6).a = 1;
          f3 = zbxz.a(zbdc.a((zbqv)localObject6, f1));
        }
        ((zt)localObject5).b(f3);
        ((zbdc)localObject4).a.a((zt)localObject5);
        if ((i5 == 0) && ((this.d.b() == 0) || (this.d.b() == 1))) {
          this.c.b(this.c.g() - (f1 - f3) / 2.0F);
        }
        if ((i5 == paramArrayList.size() - 1) && (this.d.b() == 2)) {
          this.c.d(this.c.i() - (f1 - f3) / 2.0F);
        }
      }
      else if (((zbdc)localObject4).s().b > 0)
      {
        if ((((zbdc)localObject4).s().a == 0) && (((zbdc)localObject4).s().b == 100000)) {
          break;
        }
        f3 = zbxz.a(zbdc.a(((zbdc)localObject4).s(), f1));
        ((zt)localObject5).b(f3);
        ((zbdc)localObject4).a.a((zt)localObject5);
        if ((i5 == 0) && ((this.d.b() == 0) || (this.d.b() == 1))) {
          this.c.b(this.c.g() - (f1 - f3) / 2.0F);
        }
        if ((i5 == paramArrayList.size() - 1) && (this.d.b() == 2)) {
          this.c.d(this.c.i() - (f1 - f3) / 2.0F);
        }
      }
    }
  }
  
  private void b(ArrayList paramArrayList)
  {
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zbdc localzbdc1 = (zbdc)paramArrayList.get(m);
      if (localzbdc1.b == 2)
      {
        ArrayList localArrayList = zgz.a(localzbdc1.b());
        if (localArrayList.size() > 1)
        {
          ze localze = new ze("([\\uF020-\\uF0FF]+)");
          for (int n = 0; n < localArrayList.size(); n++)
          {
            String str = (String)localArrayList.get(n);
            zg localzg = localzbdc1.c();
            boolean bool = localze.d(str);
            if (bool) {
              localzg = new zg("Symbol", localzg.h(), localzg.k());
            }
            zbdc localzbdc2 = new zbdc(str, localzg, localzbdc1.d(), localzbdc1.e(), 2, localzbdc1.a());
            localzbdc2.b(localzbdc1.c());
            localzbdc2.a(localzbdc1);
            paramArrayList.add(m, localzbdc2);
            m++;
          }
          paramArrayList.remove(m);
          m--;
        }
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
  
  private void c(ArrayList paramArrayList)
    throws Exception
  {
    zo localzo = this.c.d();
    float f1 = -3.4028235E38F;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zbdc localzbdc1 = (zbdc)paramArrayList.get(m);
      zbdc localzbdc2 = null;
      if (m > 0) {
        localzbdc2 = (zbdc)paramArrayList.get(m - 1);
      }
      float f2;
      if ((localzbdc2 != null) && (localzbdc1.n() != localzbdc2.n()) && (localzbdc2.o().b > 0))
      {
        f2 = zbdc.a(localzbdc1.o(), this.f);
        localzo.b(localzo.e() + f2);
      }
      if ((localzbdc1.q().b > 0) && (localzbdc2 != null) && (localzbdc1.n() != localzbdc2.n()))
      {
        f2 = zbdc.a(localzbdc1.q(), this.f);
        localzo.b(localzo.e() + f2);
      }
      if (localzbdc1.b == 0)
      {
        localzbdc1.a = new zq(this.c.f(), localzo.e(), this.c.h(), localzbdc1.a.i());
        localzo.a(this.c.d().d());
        localzo.b(localzo.e() + (f1 == -3.4028235E38F ? localzbdc1.a.e().c() : f1));
        f1 = -3.4028235E38F;
      }
      else
      {
        zbdc localzbdc4;
        float f4;
        if (localzbdc1.b == 1)
        {
          f2 = this.c.l() - localzo.d();
          localzbdc4 = null;
          zbdc localzbdc5 = null;
          if (m > 0) {
            localzbdc4 = (zbdc)paramArrayList.get(m - 1);
          }
          if (m + 1 < paramArrayList.size()) {
            localzbdc5 = (zbdc)paramArrayList.get(m + 1);
          }
          if (localzbdc1.f())
          {
            f4 = localzo.d() - this.c.f();
            int n = (int)Math.floor(f4 / this.k) + 1;
            float f6 = this.c.f() + n * this.k;
            if (f6 < this.c.l())
            {
              localzbdc1.a.a(localzo);
              localzbdc1.a.a(new zt(f6 - localzo.d(), f1 == -3.4028235E38F ? this.f : f1));
              localzo.a(f6);
            }
            else
            {
              localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
              localzo.a(this.c.f());
              localzbdc1.a.a(localzo);
              localzbdc1.a.a(new zt(this.k, f1 == -3.4028235E38F ? this.f : f1));
              localzo.a(this.c.f() + this.k);
            }
          }
          else if (localzbdc1.a.e().b() < f2)
          {
            localzbdc1.a.a(localzo);
            localzo.a(localzo.d() + localzbdc1.a.e().b());
          }
          else if (f2 != 0.0F)
          {
            localzbdc1.a.c(f2);
            localzbdc1.a.a(localzo);
            localzo.a(this.c.f());
            if ((localzbdc5 != null) && (localzbdc5.b != 0))
            {
              localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
              f1 = -3.4028235E38F;
            }
          }
          else
          {
            localzbdc1.a.c(f2);
            localzbdc1.a.a(localzo);
            localzo.a(this.c.f());
            f1 = -3.4028235E38F;
          }
        }
        else if (localzbdc1.b == 2)
        {
          zbdc localzbdc3 = null;
          localzbdc4 = null;
          if (m > 0) {
            localzbdc3 = (zbdc)paramArrayList.get(m - 1);
          }
          if (m + 1 < paramArrayList.size()) {
            localzbdc4 = (zbdc)paramArrayList.get(m + 1);
          }
          float f3 = localzo.d();
          if (localzbdc1.m())
          {
            if ((localzbdc4 != null) && (localzbdc4.b == 1)) {
              if (localzbdc4.b().length() > 1)
              {
                localzbdc4.a(localzbdc4.b().substring(1, 1 + (localzbdc4.b().length() - 1)));
              }
              else
              {
                paramArrayList.remove(m + 1);
                if (m + 1 < paramArrayList.size()) {
                  localzbdc4 = (zbdc)paramArrayList.get(m + 1);
                }
              }
            }
            if (localzbdc1.v() > 0.0F) {
              localzo.a(localzo.d() + localzbdc1.v());
            }
            if (localzbdc1.x() > 0.0F) {
              localzo.a(localzo.d() + localzbdc1.x());
            } else if (localzbdc1.x() < 0.0F) {
              if (-localzbdc1.x() < localzbdc1.v()) {
                localzo.a(localzo.d() + localzbdc1.x());
              } else {
                localzo.a(localzo.d() - localzbdc1.v());
              }
            }
            localzbdc1.a.a(localzo);
            localzo.a(localzo.d() + localzbdc1.a.e().b());
            if ((localzbdc1.x() < 0.0F) && (localzo.d() - f3 < -localzbdc1.x())) {
              localzo.a(f3 - localzbdc1.x());
            }
          }
          else
          {
            if (a(paramArrayList, m))
            {
              localzo.a(localzo.d() + localzbdc1.v() + localzbdc1.x());
              if (localzo.d() < f3) {
                localzo.a(f3);
              }
            }
            else if (localzo.d() == this.c.f())
            {
              localzo.a(localzo.d() + localzbdc1.v());
            }
            f4 = this.c.l() - localzo.d();
            Object localObject;
            if ((localzbdc3 == null) || (localzbdc3.b != 1))
            {
              if (localzbdc1.a.e().b() < f4)
              {
                if (f1 < localzbdc1.a.e().c()) {
                  f1 = localzbdc1.a.e().c();
                }
                localzbdc1.a.a(localzo);
                localzo.a(localzo.d() + localzbdc1.a.e().b());
              }
              else if (localzbdc1.a.e().b() == f4)
              {
                localzbdc1.a.a(localzo);
                if (f1 < localzbdc1.a.e().c()) {
                  f1 = localzbdc1.a.e().c();
                }
                localzo.a(localzo.d() + localzbdc1.a.e().b());
                localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                f1 = -3.4028235E38F;
              }
              else
              {
                String[] arrayOfString1 = a(localzbdc1.b(), f4, localzbdc1.c());
                zbdc localzbdc6 = new zbdc(arrayOfString1[0], localzbdc1.c(), localzbdc1.d(), localzbdc1.e(), 2, localzbdc1.a());
                localzbdc6.a(localzbdc1);
                localObject = zbxz.a(this.a, this.b, localzbdc1.b(), localzbdc1.c());
                if ((localzbdc6.b().length() == 1) && (((zt)localObject).b() > f4) && (((zt)localObject).b() <= this.c.h()))
                {
                  localzo.a(this.c.f());
                  localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                  f1 = -3.4028235E38F;
                  m--;
                }
                else
                {
                  localzbdc6.a = new zq(localzo, (zt)localObject);
                  paramArrayList.add(m, localzbdc6);
                  localzbdc1.a(arrayOfString1[1]);
                  localzbdc1.a.a(zbxz.a(this.a, this.b, localzbdc1.b(), localzbdc1.c()));
                  if (f1 < localzbdc1.a.e().c()) {
                    f1 = localzbdc1.a.e().c();
                  }
                  localzo.a(this.c.f());
                  localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                  f1 = -3.4028235E38F;
                }
              }
            }
            else if (localzbdc1.a.e().b() <= f4)
            {
              float f5 = localzbdc1.a.e().b();
              for (int i1 = m + 1; (i1 < paramArrayList.size()) && (localzbdc4.b == 2); i1++)
              {
                localzbdc4 = (zbdc)paramArrayList.get(i1);
                if ((localzbdc4.b != 2) || (b(localzbdc4.b()))) {
                  break;
                }
                f5 += localzbdc4.a.e().b();
                if (f5 > f4) {
                  break;
                }
              }
              if (f5 < f4)
              {
                while (m < i1)
                {
                  localzbdc4 = (zbdc)paramArrayList.get(m);
                  localzbdc4.a.a(localzo);
                  if (f1 < localzbdc4.a.e().c()) {
                    f1 = localzbdc4.a.e().c();
                  }
                  localzo.a(localzo.d() + localzbdc4.a.e().b());
                  m++;
                }
                m--;
              }
              else if (f5 == f4)
              {
                while (m < i1)
                {
                  localzbdc4 = (zbdc)paramArrayList.get(m);
                  localzbdc4.a.a(localzo);
                  if (f1 < localzbdc4.a.e().c()) {
                    f1 = localzbdc4.a.e().c();
                  }
                  localzo.a(localzo.d() + localzbdc4.a.e().b());
                  m++;
                }
                m--;
                localzo.b(localzo.e() + localzbdc4.a.e().c());
                f1 = -3.4028235E38F;
              }
              else if (localzo.d() == this.c.f())
              {
                while (m < i1)
                {
                  localzbdc4 = (zbdc)paramArrayList.get(m);
                  f4 -= localzbdc4.a.e().b();
                  if (f4 < 0.0F) {
                    if (localzo.d() == this.c.f())
                    {
                      localObject = a(localzbdc4.b(), this.c.h(), localzbdc4.c());
                      zbdc localzbdc8 = new zbdc(localObject[0], localzbdc4.c(), localzbdc4.d(), localzbdc4.e(), 2, localzbdc1.a());
                      localzbdc8.a(localzbdc1);
                      zt localzt = zbxz.a(this.a, this.b, localzbdc1.b(), localzbdc1.c());
                      if ((localzbdc8.b().length() == 1) && (localzt.b() > f4) && (localzt.b() <= this.c.h()))
                      {
                        localzo.a(this.c.f());
                        localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                        f1 = -3.4028235E38F;
                        m--;
                      }
                      else
                      {
                        localzbdc8.a = new zq(localzo, localzt);
                        paramArrayList.add(m, localzbdc8);
                        localzbdc4.a(localObject[1]);
                        localzbdc4.a.a(zbxz.a(this.a, this.b, localzbdc4.b(), localzbdc4.c()));
                        if (f1 < localzbdc4.a.e().c()) {
                          f1 = localzbdc4.a.e().c();
                        }
                        localzo.a(this.c.f());
                        localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                        f1 = -3.4028235E38F;
                      }
                    }
                    else
                    {
                      localzo.a(this.c.f());
                      localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                      f1 = -3.4028235E38F;
                      break;
                    }
                  }
                  localzbdc4.a.a(localzo);
                  if (f1 < localzbdc4.a.e().c()) {
                    f1 = localzbdc4.a.e().c();
                  }
                  localzo.a(localzo.d() + localzbdc4.a.e().b());
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
              f1 = localzbdc1.a.e().c();
              f4 = this.c.l() - localzo.d();
              if (localzbdc1.a.e().b() < f4)
              {
                localzo.a(localzo.d() + localzbdc1.v());
                localzbdc1.a.a(localzo);
                localzbdc1.a.a(localzbdc1.a.e());
                localzo.a(localzo.d() + localzbdc1.a.e().b());
              }
              else if (localzbdc1.a.e().b() == f4)
              {
                localzo.a(localzo.d() + localzbdc1.v());
                localzbdc1.a.a(localzo);
                localzbdc1.a.a(localzbdc1.a.e());
                localzo.a(this.c.f());
                localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                f1 = -3.4028235E38F;
              }
              else
              {
                String[] arrayOfString2 = a(localzbdc1.b(), f4, localzbdc1.c());
                if ((arrayOfString2.length != 2) || (!"".equals(arrayOfString2[0])) || (!arrayOfString2[1].equals(localzbdc1.b())))
                {
                  zbdc localzbdc7 = new zbdc(arrayOfString2[0], localzbdc1.c(), localzbdc1.d(), localzbdc1.e(), 2, localzbdc1.a());
                  localzbdc7.a(localzbdc1);
                  localObject = zbxz.a(this.a, this.b, localzbdc1.b(), localzbdc1.c());
                  if ((localzbdc7.b().length() == 1) && (((zt)localObject).b() > f4) && (((zt)localObject).b() <= this.c.h()))
                  {
                    localzo.a(this.c.f());
                    localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                    f1 = -3.4028235E38F;
                    m--;
                  }
                  else
                  {
                    localzbdc7.a = new zq(localzo, (zt)localObject);
                    paramArrayList.add(m, localzbdc7);
                    localzbdc1.a(arrayOfString2[1]);
                    localzbdc1.a.a(zbxz.a(this.a, this.b, localzbdc1.b(), localzbdc1.c()));
                    if (f1 < localzbdc1.a.e().c()) {
                      f1 = localzbdc1.a.e().c();
                    }
                    localzo.a(this.c.f());
                    localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
                    f1 = -3.4028235E38F;
                  }
                }
              }
            }
          }
        }
      }
    }
    g(paramArrayList);
  }
  
  private boolean a(ArrayList paramArrayList, int paramInt)
  {
    zbdc localzbdc1 = (zbdc)paramArrayList.get(paramInt);
    if (paramInt == 0) {
      return true;
    }
    zbdc localzbdc2 = null;
    for (int m = paramInt - 1; m >= 0; m--)
    {
      localzbdc2 = (zbdc)paramArrayList.get(m);
      if (localzbdc2.b != 0) {
        break;
      }
    }
    return (localzbdc2 != null) && (localzbdc2.n() != localzbdc1.n());
  }
  
  private void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    zbdc localzbdc1 = 0;
    float f1 = Float.MAX_VALUE;
    float f2 = 0.0F;
    for (zbdc localzbdc2 = 0; localzbdc2 < paramArrayList.size(); localzbdc2++)
    {
      localzbdc3 = (zbdc)paramArrayList.get(localzbdc2);
      if ((localzbdc3.a() != 7) && (localzbdc3.b != 0))
      {
        if (localzbdc3.a.g() > f1)
        {
          for (int m = localzbdc2 - 1; m > localzbdc1; m--)
          {
            localzbdc5 = (zbdc)paramArrayList.get(m);
            if (localzbdc5.b == 2) {
              break;
            }
            if (localzbdc5.b == 1) {
              f2 -= localzbdc5.a.e().b();
            }
          }
          float f4 = 0.0F;
          if (paramBoolean) {
            f4 = (this.c.h() - f2) / 2.0F;
          } else {
            f4 = this.c.h() - f2;
          }
          for (zbdc localzbdc5 = localzbdc1; localzbdc5 < localzbdc2; localzbdc5++)
          {
            zbdc localzbdc6 = (zbdc)paramArrayList.get(localzbdc5);
            localzbdc6.a.a(localzbdc6.a.f() + f4);
          }
          f2 = 0.0F;
          localzbdc1 = localzbdc2;
        }
        f2 += localzbdc3.a.e().b();
        f1 = localzbdc3.a.g();
      }
    }
    for (localzbdc2 = paramArrayList.size() - 1; localzbdc2 > localzbdc1; localzbdc2--)
    {
      localzbdc3 = (zbdc)paramArrayList.get(localzbdc2);
      if (localzbdc3.b == 2) {
        break;
      }
      if (localzbdc3.b == 1) {
        f2 -= localzbdc3.a.e().b();
      }
    }
    float f3 = 0.0F;
    if (paramBoolean) {
      f3 = (this.c.h() - f2) / 2.0F;
    } else {
      f3 = this.c.h() - f2;
    }
    for (zbdc localzbdc3 = localzbdc1; localzbdc3 < paramArrayList.size(); localzbdc3++)
    {
      zbdc localzbdc4 = (zbdc)paramArrayList.get(localzbdc3);
      if (localzbdc4.a() != 7) {
        localzbdc4.a.a(localzbdc4.a.f() + f3);
      }
    }
  }
  
  private void d(ArrayList paramArrayList)
  {
    int m = 0;
    float f1 = Float.MAX_VALUE;
    float f2 = 0.0F;
    int n = 0;
    int i1 = 1;
    for (int i2 = 0; i2 < paramArrayList.size(); i2++)
    {
      zbdc localzbdc1 = (zbdc)paramArrayList.get(i2);
      if (localzbdc1.b != 0)
      {
        if ((localzbdc1.a.g() > f1) && (i1 != 0))
        {
          float f3 = 0.0F;
          float f4 = 0.0F;
          for (int i3 = i2 - 1; i3 > m; i3--)
          {
            zbdc localzbdc2 = (zbdc)paramArrayList.get(i3);
            if (localzbdc2.b == 2)
            {
              f3 = this.c.l() - localzbdc2.a.l();
              localzbdc2.a.a(this.c.l() - localzbdc2.a.h());
              f2 -= localzbdc2.a.e().b();
              n--;
              f4 = localzbdc2.a.f();
              break;
            }
            if (localzbdc2.b == 1)
            {
              f2 -= localzbdc2.a.e().b();
              n--;
              paramArrayList.remove(i3);
              i2--;
            }
          }
          float f5 = ((zbdc)paramArrayList.get(m)).a.f();
          float f6 = f4 - f5;
          float f7 = (f6 - f2) / n;
          if ((f3 > 0.1F) && (n > 0) && (f7 > 0.0F))
          {
            zbdc localzbdc3 = (zbdc)paramArrayList.get(m);
            if (n == 1)
            {
              localzbdc3.a.a(localzbdc3.a.f() + f7);
            }
            else
            {
              localzbdc3.a.c(localzbdc3.a.h() + f7);
              float f8 = localzbdc3.a.l();
              for (int i4 = m + 1; i4 < i2 - 1; i4++)
              {
                zbdc localzbdc4 = (zbdc)paramArrayList.get(i4);
                localzbdc4.a.a(f8);
                localzbdc4.a.c(localzbdc4.a.h() + f7);
                f8 = localzbdc4.a.l();
              }
            }
          }
          n = 0;
          f2 = 0.0F;
          m = i2;
        }
        if (f2 == 0.0F) {
          i1 = 1;
        }
        if (localzbdc1.m())
        {
          m++;
        }
        else
        {
          n++;
          f2 += localzbdc1.a.e().b();
        }
        f1 = localzbdc1.a.g();
      }
      else if (f2 < this.c.h())
      {
        i1 = 0;
        f2 = 0.0F;
        n = 0;
        m = i2 + 1;
      }
    }
  }
  
  private void e(ArrayList paramArrayList)
  {
    int m = 0;
    float f1 = Float.MAX_VALUE;
    float f2 = 0.0F;
    int n = 0;
    zbdc localzbdc1;
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      localzbdc1 = (zbdc)paramArrayList.get(i1);
      if (localzbdc1.b != 0)
      {
        if (localzbdc1.a.g() > f1)
        {
          zbdc localzbdc2;
          for (int i3 = i1 - 1; i3 > m; i3--)
          {
            localzbdc2 = (zbdc)paramArrayList.get(i3);
            if (localzbdc2.b == 2) {
              break;
            }
            if (localzbdc2.b == 1)
            {
              f2 -= localzbdc2.a.e().b();
              n--;
            }
          }
          for (i3 = m; i3 < i1; i3++)
          {
            localzbdc2 = (zbdc)paramArrayList.get(i3);
            if (localzbdc2.b == 2) {
              break;
            }
            if (localzbdc2.b == 1)
            {
              f2 -= localzbdc2.a.e().b();
              n--;
            }
          }
          f4 = (this.c.h() - f2) / n;
          i4 = 0;
          float f5 = this.c.f();
          for (int i5 = m; i5 < i1; i5++)
          {
            zbdc localzbdc4 = (zbdc)paramArrayList.get(i5);
            if ((localzbdc4.b == 1) && (i4 == 0))
            {
              f5 += localzbdc4.a.e().b();
            }
            else if (localzbdc4.b == 2)
            {
              if (i4 == 0) {
                i4 = 1;
              }
              localzbdc4.a.a(f5);
              f5 += localzbdc4.a.e().b();
            }
            else if (localzbdc4.b == 1)
            {
              f5 += localzbdc4.a.e().b() + f4;
            }
          }
          n = 0;
          f2 = 0.0F;
          m = i1;
        }
        if (localzbdc1.b == 1) {
          n++;
        }
        f2 += localzbdc1.a.e().b();
        f1 = localzbdc1.a.g();
      }
    }
    for (i1 = paramArrayList.size() - 1; i1 > m; i1--)
    {
      localzbdc1 = (zbdc)paramArrayList.get(i1);
      if (localzbdc1.b == 2) {
        break;
      }
      if (localzbdc1.b == 1) {
        f2 -= localzbdc1.a.e().b();
      }
    }
    for (i1 = m; i1 < paramArrayList.size(); i1++)
    {
      localzbdc1 = (zbdc)paramArrayList.get(i1);
      if (localzbdc1.b == 2) {
        break;
      }
      if (localzbdc1.b == 1)
      {
        f2 -= localzbdc1.a.e().b();
        n--;
      }
    }
    float f3 = 0.0F;
    f3 = (this.c.h() - f2) / n;
    int i2 = 0;
    float f4 = this.c.f();
    for (int i4 = m; i4 < paramArrayList.size(); i4++)
    {
      zbdc localzbdc3 = (zbdc)paramArrayList.get(i4);
      if ((localzbdc3.b == 1) && (i2 == 0))
      {
        f4 += localzbdc3.a.e().b();
      }
      else if (localzbdc3.b == 2)
      {
        if (i2 == 0) {
          i2 = 1;
        }
        localzbdc3.a.a(f4);
        f4 += localzbdc3.a.e().b();
      }
      else if (localzbdc3.b == 1)
      {
        f4 += localzbdc3.a.e().b() + f3;
      }
    }
  }
  
  private void f(ArrayList paramArrayList)
    throws Exception
  {
    float f1 = 0;
    float f2 = 1.0F;
    float f3 = Float.MAX_VALUE;
    float f4 = -3.4028235E38F;
    float f5 = Float.MAX_VALUE;
    Object localObject1 = null;
    Object localObject2;
    float f9;
    float f10;
    float f11;
    float f12;
    Object localObject3;
    float f16;
    float f17;
    float f18;
    for (float f6 = 0; f6 < paramArrayList.size(); f6++)
    {
      localObject2 = (zbdc)paramArrayList.get(f6);
      if (((zbdc)localObject2).b == 2)
      {
        if (((zbdc)localObject2).a.g() > f5)
        {
          if (f3 != f4)
          {
            zg localzg2 = ((zbdc)localObject1).c();
            zgs localzgs1 = zav.a().b(localzg2.g(), localzg2.k(), false);
            f9 = localzgs1.j();
            f10 = localzgs1.a(localzg2.h()) / 72.0F * 96.0F;
            f11 = localzgs1.h() / localzgs1.k() * f10;
            f12 = localzgs1.i() / localzgs1.k() * f10;
            float f13 = (localzgs1.k() - f9) / localzgs1.k() * f10;
            for (int m = f1; m < f6; m++)
            {
              localObject3 = (zbdc)paramArrayList.get(m);
              if ((((zbdc)localObject3).b == 2) && (((zbdc)localObject3).a.i() + f2 < f4))
              {
                zg localzg4 = ((zbdc)localObject3).c();
                zgs localzgs2 = zav.a().b(localzg4.g(), localzg4.k(), false);
                f16 = localzgs2.j();
                f17 = localzgs2.a(localzg4.h()) / 72.0F * 96.0F;
                f18 = localzgs2.h() / localzgs2.k() * f17;
                float f19 = localzgs2.i() / localzgs2.k() * f17;
                float f20 = (localzgs2.k() - f16) / localzgs2.k() * f17;
                if ((ze.a(((zbdc)localObject3).b(), "[\\u4e00-\\u9fbb]")) || (ze.a(((zbdc)localObject3).b(), "[\\u3040-\\u30ff]"))) {
                  ((zbdc)localObject3).a.b(((zbdc)localObject3).a.g() + (f10 - f12 - f13 / 2.0F - f18 - f20 / 2.0F + 1.33333F) * this.h);
                } else {
                  ((zbdc)localObject3).a.b(((zbdc)localObject3).a.g() + (f10 - f12 - f13 / 2.0F - f18 - f20 / 2.0F) * this.h);
                }
              }
            }
          }
          f1 = f6;
          f3 = Float.MAX_VALUE;
          f4 = -3.4028235E38F;
        }
        f5 = ((zbdc)localObject2).a.g();
        if (((zbdc)localObject2).a.e().c() < f3) {
          f3 = ((zbdc)localObject2).a.e().c();
        }
        if (((zbdc)localObject2).a.e().c() > f4)
        {
          f4 = ((zbdc)localObject2).a.e().c();
          localObject1 = localObject2;
        }
      }
    }
    if ((f3 != f4) && (f3 != Float.MAX_VALUE) && (f4 != -3.4028235E38F) && (localObject1 != null))
    {
      zg localzg1 = ((zbdc)localObject1).c();
      localObject2 = zav.a().b(localzg1.g(), localzg1.k(), false);
      float f7 = ((zgs)localObject2).j();
      float f8 = ((zgs)localObject2).a(localzg1.h()) / 72.0F * 96.0F;
      f9 = ((zgs)localObject2).h() / ((zgs)localObject2).k() * f8;
      f10 = ((zgs)localObject2).i() / ((zgs)localObject2).k() * f8;
      f11 = (((zgs)localObject2).k() - f7) / ((zgs)localObject2).k() * f8;
      for (f12 = f1; f12 < paramArrayList.size(); f12++)
      {
        zbdc localzbdc = (zbdc)paramArrayList.get(f12);
        if ((localzbdc.b == 2) && (localzbdc.a.i() + f2 < f4))
        {
          zg localzg3 = localzbdc.c();
          localObject3 = zav.a().b(localzg3.g(), localzg3.k(), false);
          float f14 = ((zgs)localObject3).j();
          float f15 = ((zgs)localObject3).a(localzg3.h()) / 72.0F * 96.0F;
          f16 = ((zgs)localObject3).h() / ((zgs)localObject3).k() * f15;
          f17 = ((zgs)localObject3).i() / ((zgs)localObject3).k() * f15;
          f18 = (((zgs)localObject3).k() - f14) / ((zgs)localObject3).k() * f15;
          if ((ze.a(localzbdc.b(), "[\\u4e00-\\u9fbb]")) || (ze.a(localzbdc.b(), "[\\u3040-\\u30ff]"))) {
            localzbdc.a.b(localzbdc.a.g() + (f8 - f10 - f11 / 2.0F - f16 - f18 / 2.0F + 1.33333F) * this.h);
          } else {
            localzbdc.a.b(localzbdc.a.g() + (f8 - f10 - f11 / 2.0F - f16 - f18 / 2.0F) * this.h);
          }
        }
      }
    }
  }
  
  private void b(ArrayList paramArrayList, boolean paramBoolean)
  {
    float f1 = -3.4028235E38F;
    float f2 = -3.4028235E38F;
    float f3 = 0.0F;
    for (int m = paramArrayList.size() - 1; m >= 0; m--)
    {
      zbdc localzbdc1 = (zbdc)paramArrayList.get(m);
      if (localzbdc1.b == 0)
      {
        if (m < paramArrayList.size() - 1) {
          if (((zbdc)paramArrayList.get(m + 1)).b == 2) {
            f3 += f1;
          } else {
            f3 += this.f;
          }
        }
        if (m == 0) {
          f3 += this.f;
        }
        f1 = -3.4028235E38F;
        f2 = -3.4028235E38F;
      }
      else if (localzbdc1.b == 2)
      {
        if (localzbdc1.a.g() < f2)
        {
          f3 += f1;
          f1 = -3.4028235E38F;
        }
        f2 = localzbdc1.a.g();
        if (localzbdc1.a.e().c() > f1) {
          f1 = localzbdc1.a.e().c();
        }
      }
      else if (localzbdc1.b != 1) {}
    }
    if (f1 != -3.4028235E38F) {
      f3 += f1;
    }
    zbdc localzbdc2;
    float f4;
    if (paramBoolean)
    {
      if ((a() == 0) && (f3 > this.c.i())) {
        for (n = paramArrayList.size() - 1; n >= 0; n--)
        {
          localzbdc2 = (zbdc)paramArrayList.get(n);
          if (localzbdc2.b == 0)
          {
            f3 -= this.f;
          }
          else
          {
            if (localzbdc2.b == 2) {
              break;
            }
            if (localzbdc2.b != 1) {}
          }
          if (f3 <= this.c.i()) {
            break;
          }
        }
      }
      f4 = (this.c.i() - f3) / 2.0F;
    }
    else
    {
      f4 = this.c.i() - f3;
    }
    if ((f4 < 0.0F) && (a() == 0)) {
      f4 = 0.0F;
    }
    for (int n = paramArrayList.size() - 1; n >= 0; n--)
    {
      localzbdc2 = (zbdc)paramArrayList.get(n);
      localzbdc2.a.b(localzbdc2.a.g() + f4);
    }
  }
  
  private void g(ArrayList paramArrayList)
  {
    int m = 0;
    float f1 = Float.MAX_VALUE;
    for (int n = 0; n < paramArrayList.size(); n++)
    {
      zbdc localzbdc = (zbdc)paramArrayList.get(n);
      if (localzbdc.b != 0)
      {
        if (localzbdc.a.g() > f1)
        {
          if (n - 1 >= m) {
            a(paramArrayList, m, n - 1);
          }
          m = n;
        }
        f1 = localzbdc.a.g();
      }
      else
      {
        if (n - 1 >= m) {
          a(paramArrayList, m, n - 1);
        }
        m = n + 1;
        f1 = localzbdc.a.g();
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
        zbdc localzbdc1 = (zbdc)paramArrayList.get(m);
        if (localzbdc1.b == 2) {
          break;
        }
      }
      for (int n = m; (n >= paramInt1) && (n >= 0); n--)
      {
        zbdc localzbdc2 = (zbdc)paramArrayList.get(n);
        localzbdc2.a.a(f1);
        f1 += localzbdc2.a.h();
      }
    }
  }
  
  private int a(zg paramzg)
  {
    return zbyb.a(this.a.a().a(paramzg));
  }
  
  private boolean b(String paramString)
  {
    if (("".equals(paramString)) || (zw.b(paramString, ""))) {
      return false;
    }
    return (paramString.charAt(0) > '一') && (paramString.charAt(0) < 40869);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */