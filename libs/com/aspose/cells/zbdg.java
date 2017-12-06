package com.aspose.cells;

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

class zbdg
{
  private zr a;
  private boolean b = false;
  private zq c;
  private zbcx d;
  private zg e;
  private float f;
  private float g;
  private float h;
  private ArrayList i;
  
  public zbdg(zq paramzq, zbcx paramzbcx, ArrayList paramArrayList, zg paramzg)
  {
    this(paramzq, paramzbcx, paramArrayList, paramzg, 1.0F, 1.0F);
  }
  
  public zbdg(zq paramzq, zbcx paramzbcx, ArrayList paramArrayList, zg paramzg, float paramFloat1, float paramFloat2)
  {
    this.c = paramzq;
    this.d = paramzbcx;
    this.i = paramArrayList;
    this.e = paramzg;
    this.g = paramFloat1;
    this.h = paramFloat2;
  }
  
  public void a(zr paramzr, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    if (!a()) {
      return;
    }
    this.a = paramzr;
    this.b = paramBoolean;
    this.f = (this.a.a("A", this.e).c() * this.h);
    if ((this.i == null) || (this.i.size() <= 0)) {
      return;
    }
    a(this.i);
    if (this.d.b() == 0)
    {
      if (this.d.a() == 0)
      {
        c(this.i);
        d(this.i);
      }
      else if (this.d.a() == 1)
      {
        c(this.i);
        a(this.i, true);
        d(this.i);
      }
      else
      {
        c(this.i);
        a(this.i, false);
        d(this.i);
      }
    }
    else if (this.d.b() == 2)
    {
      if (this.d.a() == 0)
      {
        c(this.i);
        b(this.i, false);
        d(this.i);
      }
      else if (this.d.a() == 1)
      {
        c(this.i);
        a(this.i, true);
        b(this.i, false);
        d(this.i);
      }
      else
      {
        c(this.i);
        a(this.i, false);
        b(this.i, false);
        d(this.i);
      }
    }
    else if (this.d.a() == 0)
    {
      c(this.i);
      b(this.i, true);
      d(this.i);
    }
    else if (this.d.a() == 1)
    {
      c(this.i);
      a(this.i, true);
      b(this.i, true);
      d(this.i);
    }
    else
    {
      c(this.i);
      a(this.i, false);
      b(this.i, true);
      d(this.i);
    }
    zq localzq = new zq(this.c.f(), this.c.g(), this.c.h(), this.c.i());
    zo localzo1 = new zo(this.c.j() + this.c.h() / 2.0F, this.c.k() + this.c.i() / 2.0F);
    zf localzf = null;
    if (paramFloat != 0.0F)
    {
      localzf = paramzr.d();
      this.a.b(localzo1.d(), localzo1.e());
      this.a.a(paramFloat);
    }
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      zbdb localzbdb = (zbdb)localIterator.next();
      if (localzbdb.b == 2)
      {
        zg localzg = localzbdb.b();
        Color localColor = localzbdb.c();
        String str = localzbdb.a();
        float f1 = a(localzg) * localzg.b().c(localzg.k()) / localzg.b().e(localzg.k());
        float f2 = a(localzg) * localzg.b().d(localzg.k()) / localzg.b().e(localzg.k());
        float f3 = a(localzg) * localzg.b().f(localzg.k()) / localzg.b().e(localzg.k());
        zv localzv = new zv(zv.c());
        zo localzo2 = new zo(localzbdb.a.d().d(), localzbdb.a.d().e());
        if (a(localzbdb))
        {
          if (paramFloat != 0.0F)
          {
            localzo2.a(localzo2.d() - localzo1.d());
            localzo2.b(localzo2.e() - localzo1.e());
          }
          this.a.a(localzbdb.a(), localzbdb.b(), new zu(localzbdb.c()), localzo2, localzv);
        }
      }
    }
    if (paramFloat != 0.0F) {
      paramzr.a(localzf);
    }
  }
  
  private boolean a(zbdb paramzbdb)
  {
    if (paramzbdb.a.f() < this.c.f() - 5.0F) {
      return false;
    }
    if (paramzbdb.a.g() < this.c.g() - 5.0F) {
      return false;
    }
    if (paramzbdb.a.l() > this.c.l() + 5.0F) {
      return false;
    }
    return paramzbdb.a.m() <= this.c.m() + 5.0F;
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
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zbdb localzbdb = (zbdb)paramArrayList.get(j);
      localObject1 = localze1.c(localzbdb.a());
      if (localObject1.length > 1)
      {
        for (int n = 0; n < localObject1.length; n++)
        {
          if (!"".equals(localObject1[n]))
          {
            localObject3 = new zbdb(localObject1[n], localzbdb.b(), localzbdb.c(), 2);
            paramArrayList.add(j, localObject3);
            j++;
          }
          else
          {
            if (("".equals(localObject1[n])) && (n == localObject1.length - 1)) {
              break;
            }
          }
          if (n != localObject1.length - 1)
          {
            localObject3 = new zbdb("", localzbdb.b(), localzbdb.c(), 0);
            paramArrayList.add(j, localObject3);
            j++;
          }
        }
        paramArrayList.remove(j);
        j--;
      }
    }
    ze localze2 = new ze("(\\s){1,}");
    Object localObject2;
    for (int k = 0; k < paramArrayList.size(); k++)
    {
      localObject1 = (zbdb)paramArrayList.get(k);
      localObject2 = localze2.b(((zbdb)localObject1).a());
      if (((zd)localObject2).a() > 0)
      {
        int i1 = 0;
        for (int i2 = 0; i2 < ((zd)localObject2).a(); i2++)
        {
          String str;
          if (((zd)localObject2).a(i2).d() > i1)
          {
            str = ((zbdb)localObject1).a().substring(i1, i1 + (((zd)localObject2).a(i2).d() - i1));
            localObject3 = new zbdb(str, ((zbdb)localObject1).b(), ((zbdb)localObject1).c(), 2);
            paramArrayList.add(k, localObject3);
            k++;
          }
          localObject3 = new zbdb(((zd)localObject2).a(i2).a(), ((zbdb)localObject1).b(), ((zbdb)localObject1).c(), 1);
          paramArrayList.add(k, localObject3);
          k++;
          i1 = ((zd)localObject2).a(i2).d() + ((zd)localObject2).a(i2).a().length();
          if ((i2 == ((zd)localObject2).a() - 1) && (i1 <= ((zbdb)localObject1).a().length() - 1))
          {
            str = ((zbdb)localObject1).a().substring(i1, i1 + (((zbdb)localObject1).a().length() - i1));
            localObject3 = new zbdb(str, ((zbdb)localObject1).b(), ((zbdb)localObject1).c(), 2);
            paramArrayList.add(k, localObject3);
            k++;
          }
        }
        paramArrayList.remove(k);
        k--;
      }
    }
    b(paramArrayList);
    zv localzv = new zv();
    localzv.b(2048);
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      localObject2 = (zbdb)paramArrayList.get(m);
      if (((zbdb)localObject2).b != 0)
      {
        localObject3 = zbxz.a(this.a, this.b, ((zbdb)localObject2).a(), ((zbdb)localObject2).b());
        ((zt)localObject3).a(((zt)localObject3).b() * this.g);
        ((zt)localObject3).b(((zt)localObject3).c() * this.h);
        ((zbdb)localObject2).c = ((zt)localObject3);
      }
      else
      {
        localObject3 = zbxz.a(this.a, this.b, "A", ((zbdb)localObject2).b());
        ((zt)localObject3).a(((zt)localObject3).b() * this.g);
        ((zt)localObject3).b(((zt)localObject3).c() * this.h);
        ((zbdb)localObject2).c = ((zt)localObject3);
      }
    }
    for (m = 0; m < paramArrayList.size(); m++)
    {
      localObject2 = (zbdb)paramArrayList.get(m);
      if (zbxz.b(((zbdb)localObject2).b()))
      {
        localObject3 = ((zbdb)localObject2).c;
        float f1 = ((zt)localObject3).c();
        zbqv localzbqv = new zbqv();
        localzbqv.b = ((int)(((zbdb)localObject2).b().h() + 2.0F) * 100);
        localzbqv.a = 1;
        float f2 = zbxz.a(zbdc.a(localzbqv, f1));
        ((zt)localObject3).b(f2);
        ((zbdb)localObject2).c = ((zt)localObject3);
        if ((m == 0) && ((this.d.b() == 0) || (this.d.b() == 1))) {
          this.c.b(this.c.g() - (f1 - f2) / 2.0F);
        }
        if ((m == paramArrayList.size() - 1) && (this.d.b() == 2)) {
          this.c.d(this.c.i() - (f1 - f2) / 2.0F);
        }
      }
    }
  }
  
  private void b(ArrayList paramArrayList)
  {
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zbdb localzbdb1 = (zbdb)paramArrayList.get(j);
      if (localzbdb1.b == 2)
      {
        ArrayList localArrayList = zgz.a(localzbdb1.a());
        if (localArrayList.size() > 1)
        {
          for (int k = 0; k < localArrayList.size(); k++)
          {
            zbdb localzbdb2 = new zbdb((String)localArrayList.get(k), localzbdb1.b(), localzbdb1.c(), 2);
            paramArrayList.add(j, localzbdb2);
            j++;
          }
          paramArrayList.remove(j);
          j--;
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
      return new String[] { paramString };
    }
    for (int j = 1; j <= paramString.length(); j++)
    {
      String str = paramString.substring(0, 0 + j);
      zt localzt = zbxz.a(this.a, this.b, str, paramzg);
      if (localzt.b() > paramFloat)
      {
        arrayOfString[0] = paramString.substring(0, 0 + (j - 1));
        arrayOfString[1] = paramString.substring(j - 1);
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
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zbdb localzbdb1 = (zbdb)paramArrayList.get(j);
      float f2 = this.c.l() - localzo.d();
      if (localzbdb1.b == 0)
      {
        localzbdb1.a = new zq(this.c.f(), localzo.e(), this.c.h(), localzbdb1.c.c());
        localzo.a(this.c.d().d());
        localzo.b(localzo.e() + (f1 == -3.4028235E38F ? localzbdb1.c.c() : f1));
        f1 = -3.4028235E38F;
      }
      else if (localzbdb1.b == 1)
      {
        if (localzbdb1.c.b() < f2)
        {
          localzbdb1.a.a(localzo);
          localzbdb1.a.a(localzbdb1.c);
          localzo.a(localzo.d() + localzbdb1.c.b());
        }
        else
        {
          localzbdb1.c.a(f2);
          localzbdb1.a.a(localzo);
          localzbdb1.a.a(localzbdb1.c);
          localzo.a(this.c.f());
          localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
          f1 = -3.4028235E38F;
        }
      }
      else if (localzbdb1.b == 2)
      {
        zbdb localzbdb2 = null;
        zbdb localzbdb3 = null;
        if (j > 0) {
          localzbdb2 = (zbdb)paramArrayList.get(j - 1);
        }
        if (j + 1 < paramArrayList.size()) {
          localzbdb3 = (zbdb)paramArrayList.get(j + 1);
        }
        if ((localzbdb2 == null) || (localzbdb2.b != 1))
        {
          if (localzbdb1.c.b() < f2)
          {
            localzbdb1.a.a(localzo);
            localzbdb1.a.a(localzbdb1.c);
            if (f1 < localzbdb1.c.c()) {
              f1 = localzbdb1.c.c();
            }
            localzo.a(localzo.d() + localzbdb1.c.b());
          }
          else if (localzbdb1.c.b() == f2)
          {
            localzbdb1.a.a(localzo);
            localzbdb1.a.a(localzbdb1.c);
            if (f1 < localzbdb1.c.c()) {
              f1 = localzbdb1.c.c();
            }
            localzo.a(localzo.d() + localzbdb1.c.b());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
          }
          else
          {
            String[] arrayOfString1 = a(localzbdb1.a(), f2, localzbdb1.b());
            zbdb localzbdb4 = new zbdb(arrayOfString1[0], localzbdb1.b(), localzbdb1.c(), 2);
            localzbdb4.a = new zq(localzo, new zt(f2, localzbdb1.c.c()));
            localzbdb4.c = zbxz.a(this.a, this.b, arrayOfString1[0], localzbdb1.b());
            if (localzbdb4.c.b() > f2)
            {
              localzo.a(this.c.f());
              localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            }
            localzbdb4.a.a(localzo);
            paramArrayList.add(j, localzbdb4);
            paramArrayList.remove(j + 1);
            localzo.a(localzo.d() + localzbdb4.c.b());
            if (arrayOfString1.length > 1)
            {
              localzbdb1.a(arrayOfString1[1]);
              localzbdb1.c = zbxz.a(this.a, this.b, localzbdb1.a(), localzbdb1.b());
              if (f1 < localzbdb1.c.c()) {
                f1 = localzbdb1.c.c();
              }
              if (localzbdb1.c.b() > f2)
              {
                localzo.a(this.c.f());
                localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
              }
              localzbdb1.a.a(localzo);
              paramArrayList.add(j + 1, localzbdb1);
            }
            f1 = -3.4028235E38F;
          }
        }
        else if (localzbdb1.c.b() <= f2)
        {
          float f3 = localzbdb1.c.b();
          for (int k = j + 1; (k < paramArrayList.size()) && (localzbdb3.b == 2); k++)
          {
            localzbdb3 = (zbdb)paramArrayList.get(k);
            if ((localzbdb3.b != 2) || (a(localzbdb3.a()))) {
              break;
            }
            f3 += localzbdb3.c.b();
            if (f3 > f2) {
              break;
            }
          }
          if (f3 < f2)
          {
            while (j < k)
            {
              localzbdb3 = (zbdb)paramArrayList.get(j);
              localzbdb3.a.a(localzo);
              localzbdb3.a.a(localzbdb3.c);
              if (f1 < localzbdb3.c.c()) {
                f1 = localzbdb3.c.c();
              }
              localzo.a(localzo.d() + localzbdb3.c.b());
              j++;
            }
            j--;
          }
          else if (f3 == f2)
          {
            while (j < k)
            {
              localzbdb3 = (zbdb)paramArrayList.get(j);
              localzbdb3.a.a(localzo);
              localzbdb3.a.a(localzbdb3.c);
              if (f1 < localzbdb3.c.c()) {
                f1 = localzbdb3.c.c();
              }
              localzo.a(localzo.d() + localzbdb3.c.b());
              j++;
            }
            j--;
          }
          else if (localzo.d() == this.c.f())
          {
            while (j < k)
            {
              localzbdb3 = (zbdb)paramArrayList.get(j);
              f2 -= localzbdb3.c.b();
              if (f2 < 0.0F) {
                if (localzo.d() == this.c.f())
                {
                  String[] arrayOfString2 = a(localzbdb3.a(), this.c.h(), localzbdb3.b());
                  zbdb localzbdb5 = new zbdb(arrayOfString2[0], localzbdb3.b(), localzbdb3.c(), 2);
                  localzbdb5.a = new zq(localzo, new zt(f2, localzbdb3.c.c()));
                  localzbdb5.c = localzbdb5.a.e();
                  paramArrayList.add(j, localzbdb5);
                  localzbdb3.a(arrayOfString2[1]);
                  localzbdb3.c = zbxz.a(this.a, this.b, localzbdb3.a(), localzbdb3.b());
                  if (f1 < localzbdb3.c.c()) {
                    f1 = localzbdb3.c.c();
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
              localzbdb3.a.a(localzo);
              localzbdb3.a.a(localzbdb3.c);
              if (f1 < localzbdb3.c.c()) {
                f1 = localzbdb3.c.c();
              }
              localzo.a(localzo.d() + localzbdb3.c.b());
              j++;
            }
            j--;
          }
          else
          {
            localzo.a(this.c.f());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
            j--;
          }
        }
        else
        {
          localzo.a(this.c.f());
          localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
          f1 = localzbdb1.c.c();
          f2 = this.c.l() - localzo.d();
          if (localzbdb1.c.b() < f2)
          {
            localzbdb1.a.a(localzo);
            localzbdb1.a.a(localzbdb1.c);
            if ((localzbdb2.b == 1) && (paramArrayList.size() == 2) && (localzbdb1.b != 1))
            {
              localzbdb1.a.a(f2 - localzbdb1.c.b());
              localzbdb1.a.b(this.c.g());
            }
            localzo.a(localzo.d() + localzbdb1.c.b());
          }
          else if (localzbdb1.c.b() == f2)
          {
            localzbdb1.a.a(localzo);
            localzbdb1.a.a(localzbdb1.c);
            localzo.a(this.c.f());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
          }
          else
          {
            localzbdb1.a.a(localzo);
            localzbdb1.a.a(localzbdb1.c);
            localzo.a(this.c.f());
            localzo.b(localzo.e() + (f1 == -3.4028235E38F ? this.f : f1));
            f1 = -3.4028235E38F;
          }
        }
      }
    }
  }
  
  private boolean a(String paramString)
  {
    if (("".equals(paramString)) || (zw.b(paramString, ""))) {
      return false;
    }
    return (paramString.charAt(0) > '一') && (paramString.charAt(0) < 40869);
  }
  
  private void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    zbdb localzbdb1 = 0;
    float f1 = Float.MAX_VALUE;
    float f2 = 0.0F;
    for (zbdb localzbdb2 = 0; localzbdb2 < paramArrayList.size(); localzbdb2++)
    {
      localzbdb3 = (zbdb)paramArrayList.get(localzbdb2);
      if (localzbdb3.b != 0)
      {
        if (localzbdb3.a.g() > f1)
        {
          for (int j = localzbdb2 - 1; j > localzbdb1; j--)
          {
            localzbdb5 = (zbdb)paramArrayList.get(j);
            if (localzbdb5.b == 2) {
              break;
            }
            if (localzbdb5.b == 1) {
              f2 -= localzbdb5.c.b();
            }
          }
          float f4 = 0.0F;
          if (paramBoolean) {
            f4 = (this.c.h() - f2) / 2.0F;
          } else {
            f4 = this.c.h() - f2;
          }
          for (zbdb localzbdb5 = localzbdb1; localzbdb5 < localzbdb2; localzbdb5++)
          {
            zbdb localzbdb6 = (zbdb)paramArrayList.get(localzbdb5);
            localzbdb6.a.a(localzbdb6.a.f() + f4);
          }
          f2 = 0.0F;
          localzbdb1 = localzbdb2;
        }
        f2 += localzbdb3.c.b();
        f1 = localzbdb3.a.g();
      }
    }
    for (localzbdb2 = paramArrayList.size() - 1; localzbdb2 > localzbdb1; localzbdb2--)
    {
      localzbdb3 = (zbdb)paramArrayList.get(localzbdb2);
      if (localzbdb3.b == 2) {
        break;
      }
      if (localzbdb3.b == 1) {
        f2 -= localzbdb3.c.b();
      }
    }
    float f3 = 0.0F;
    if (paramBoolean) {
      f3 = (this.c.h() - f2) / 2.0F;
    } else {
      f3 = this.c.h() - f2;
    }
    for (zbdb localzbdb3 = localzbdb1; localzbdb3 < paramArrayList.size(); localzbdb3++)
    {
      zbdb localzbdb4 = (zbdb)paramArrayList.get(localzbdb3);
      localzbdb4.a.a(localzbdb4.a.f() + f3);
    }
  }
  
  private void d(ArrayList paramArrayList)
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
      zbdb localzbdb1 = (zbdb)paramArrayList.get(f6);
      if (localzbdb1.b == 2)
      {
        if (localzbdb1.a.g() > f5)
        {
          if (f3 != f4)
          {
            zg localzg2 = ((zbdb)localObject1).b();
            f9 = a(localzg2) * localzg2.b().c(localzg2.k()) / localzg2.b().e(localzg2.k());
            f10 = a(localzg2) * localzg2.b().d(localzg2.k()) / localzg2.b().e(localzg2.k());
            f11 = a(localzg2) * localzg2.b().f(localzg2.k()) / localzg2.b().e(localzg2.k());
            f12 = f11 - f9 - f10;
            for (int j = f1; j < f6; j++)
            {
              localObject2 = (zbdb)paramArrayList.get(j);
              if ((((zbdb)localObject2).b == 2) && (((zbdb)localObject2).a.i() + f2 < f4))
              {
                zg localzg3 = ((zbdb)localObject2).b();
                f14 = a(localzg3);
                f15 = f14 * localzg3.b().d(localzg3.k()) / localzg3.b().e(localzg3.k());
                f16 = f14 * localzg3.b().c(localzg3.k()) / localzg3.b().e(localzg3.k());
                f17 = f14 * localzg3.b().f(localzg3.k()) / localzg3.b().e(localzg3.k());
                float f18 = f17 - f16 - f15;
                ((zbdb)localObject2).a.b(((zbdb)localObject2).a.g() + (f9 - f16 - f12) * this.h);
              }
            }
          }
          f1 = f6;
          f3 = Float.MAX_VALUE;
          f4 = -3.4028235E38F;
        }
        f5 = localzbdb1.a.g();
        if (localzbdb1.c.c() < f3) {
          f3 = localzbdb1.c.c();
        }
        if (localzbdb1.c.c() > f4)
        {
          f4 = localzbdb1.c.c();
          localObject1 = localzbdb1;
        }
      }
    }
    if ((f3 != f4) && (f3 != Float.MAX_VALUE) && (f4 != -3.4028235E38F) && (localObject1 != null))
    {
      zg localzg1 = ((zbdb)localObject1).b();
      float f7 = a(localzg1);
      float f8 = f7 * localzg1.b().c(localzg1.k()) / localzg1.b().e(localzg1.k());
      f9 = f7 * localzg1.b().d(localzg1.k()) / localzg1.b().e(localzg1.k());
      f10 = f7 * localzg1.b().f(localzg1.k()) / localzg1.b().e(localzg1.k());
      f11 = f10 - f8 - f9;
      for (f12 = f1; f12 < paramArrayList.size(); f12++)
      {
        zbdb localzbdb2 = (zbdb)paramArrayList.get(f12);
        if ((localzbdb2.b == 2) && (localzbdb2.a.i() + f2 < f4))
        {
          localObject2 = localzbdb2.b();
          float f13 = a((zg)localObject2);
          f14 = f13 * ((zg)localObject2).b().d(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
          f15 = f13 * ((zg)localObject2).b().c(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
          f16 = f13 * ((zg)localObject2).b().f(((zg)localObject2).k()) / ((zg)localObject2).b().e(((zg)localObject2).k());
          f17 = f16 - f15 - f14;
          localzbdb2.a.b(localzbdb2.a.g() + (f8 - f15 - f11) * this.h);
        }
      }
    }
  }
  
  private void b(ArrayList paramArrayList, boolean paramBoolean)
  {
    float f1 = -3.4028235E38F;
    float f2 = -3.4028235E38F;
    float f3 = 0.0F;
    zbdb localzbdb1;
    for (int j = paramArrayList.size() - 1; j >= 0; j--)
    {
      localzbdb1 = (zbdb)paramArrayList.get(j);
      if (localzbdb1.b == 0)
      {
        if (j < paramArrayList.size() - 1) {
          if (((zbdb)paramArrayList.get(j + 1)).b == 2) {
            f3 += f1;
          } else {
            f3 += this.f;
          }
        }
        if ((j == 0) && (!paramBoolean)) {
          f3 += this.f;
        }
        f1 = -3.4028235E38F;
        f2 = -3.4028235E38F;
      }
      else if (localzbdb1.b == 2)
      {
        if (localzbdb1.a.g() < f2)
        {
          f3 += f1;
          f1 = -3.4028235E38F;
        }
        f2 = localzbdb1.a.g();
        if (localzbdb1.c.c() > f1) {
          f1 = localzbdb1.c.c();
        }
      }
      else if (localzbdb1.b != 1) {}
    }
    if (f1 != -3.4028235E38F) {
      f3 += f1;
    }
    zbdb localzbdb2;
    float f4;
    if (paramBoolean)
    {
      localzbdb1 = (zbdb)paramArrayList.get(0);
      localzbdb2 = (zbdb)paramArrayList.get(paramArrayList.size() - 1);
      f4 = (this.c.i() - f3) / 2.0F;
    }
    else
    {
      f4 = this.c.i() - f3;
    }
    for (int k = paramArrayList.size() - 1; k >= 0; k--)
    {
      localzbdb2 = (zbdb)paramArrayList.get(k);
      if (localzbdb2.b == 2) {
        localzbdb2.a.b(localzbdb2.a.g() + f4);
      }
    }
  }
  
  private float a(zg paramzg)
  {
    return zbya.a(this.a.a().a(paramzg));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */