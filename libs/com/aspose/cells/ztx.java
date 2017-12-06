package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import java.util.ArrayList;
import java.util.Iterator;

class ztx
{
  private zo a = new zo(0.0F, 0.0F);
  private zv b = new zv();
  private float c = 0.75F;
  private float d = 0.35F;
  private float e = 1.1F;
  
  public void a(zr paramzr, ztw paramztw, int paramInt1, int paramInt2)
  {
    int i = 0;
    this.b.a(0);
    this.b.c(1);
    b(paramzr, paramztw, paramInt1, paramInt2);
    this.a.b(paramztw.m);
    Iterator localIterator = paramztw.c().iterator();
    while (localIterator.hasNext())
    {
      ztv localztv1 = (ztv)localIterator.next();
      ztv localztv2 = localztv1;
      b(paramzr, localztv2, i, paramInt1, paramInt2);
      i++;
    }
  }
  
  void b(zr paramzr, ztw paramztw, int paramInt1, int paramInt2)
  {
    int i = 0;
    Iterator localIterator = paramztw.c().iterator();
    while (localIterator.hasNext())
    {
      ztv localztv1 = (ztv)localIterator.next();
      ztv localztv2 = localztv1;
      a(paramzr, localztv2, i, paramInt1, paramInt2);
      i++;
    }
    a(paramztw);
  }
  
  private void a(ztv paramztv)
  {
    Iterator localIterator = paramztv.c().iterator();
    while (localIterator.hasNext())
    {
      ztv localztv = (ztv)localIterator.next();
      paramztv.j.a(paramztv.j.b() + localztv.j.b());
      paramztv.j.b(Math.max(paramztv.j.c(), localztv.j.c()));
      switch (localztv.b())
      {
      case 22: 
        float f = localztv.j.c() / 2.0F;
        paramztv.l = Math.max(paramztv.l, f);
        paramztv.m = Math.max(paramztv.m, f);
        break;
      default: 
        paramztv.l = Math.max(paramztv.l, localztv.l);
        paramztv.m = Math.max(paramztv.m, localztv.m);
      }
    }
    switch (paramztv.b())
    {
    case 6: 
    case 7: 
      paramztv.j.b(paramztv.l + paramztv.m);
      break;
    }
  }
  
  private void a(zr paramzr, ztv paramztv, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    zg localzg1 = b(paramztv);
    Object localObject3 = paramztv.c().iterator();
    Object localObject4;
    Object localObject5;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (ztv)((Iterator)localObject3).next();
      Object localObject1 = localObject4;
      switch (((ztv)localObject1).b())
      {
      case 0: 
        b(paramzr, (ztw)localObject1, paramInt2, paramInt3);
        break;
      case 4: 
      case 12: 
      case 17: 
        a(paramzr, (ztv)localObject1, i, paramInt2 + 1, paramInt3);
        break;
      case 5: 
        a(paramzr, (ztv)localObject1, i, paramInt2, paramInt3 + 1);
        break;
      case 22: 
        localObject5 = (zbwg)localObject4;
        a(paramzr, (zbwg)localObject5, i, paramInt2, paramInt3);
        break;
      default: 
        a(paramzr, (ztv)localObject1, i, paramInt2, paramInt3);
      }
      i++;
    }
    paramztv.j.a(0.0F);
    paramztv.j.b(0.0F);
    Object localObject2;
    zt localzt;
    float f1;
    zg localzg2;
    switch (paramztv.b())
    {
    case 2: 
      localObject3 = (zbtl)paramztv;
      localObject4 = paramztv.c().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (ztv)((Iterator)localObject4).next();
        paramztv.j.a(paramztv.j.b() + ((ztv)localObject5).j.b());
        localObject2 = localObject5;
        if (((ztv)localObject2).b() == 3)
        {
          ((zbtl)localObject3).a = ((ztv)localObject5).j.c();
          ((zbtl)localObject3).c = ((ztv)localObject2).l;
          ((zbtl)localObject3).d = ((ztv)localObject2).m;
          paramztv.l = ((ztv)localObject2).l;
        }
        else if (((ztv)localObject2).b() == 4)
        {
          ((zbtl)localObject3).b = ((ztv)localObject5).j.c();
          ((zbtl)localObject3).e = ((ztv)localObject2).l;
          ((zbtl)localObject3).f = ((ztv)localObject2).m;
        }
      }
      if (((zbtl)localObject3).a >= ((zbtl)localObject3).b)
      {
        paramztv.j.b(((zbtl)localObject3).a + ((zbtl)localObject3).b / 2.0F);
        paramztv.m = (((zbtl)localObject3).d + ((zbtl)localObject3).b / 2.0F);
      }
      else
      {
        paramztv.j.b(((zbtl)localObject3).a / 2.0F + ((zbtl)localObject3).b);
        paramztv.m = ((zbtl)localObject3).b;
      }
      break;
    case 15: 
      localObject3 = (zbtf)paramztv;
      localObject4 = paramztv.c().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (ztv)((Iterator)localObject4).next();
        paramztv.j.a(paramztv.j.b() + ((ztv)localObject5).j.b());
        localObject2 = localObject5;
        if (((ztv)localObject2).b() == 3)
        {
          ((zbtf)localObject3).a = ((ztv)localObject5).j.c();
          ((zbtf)localObject3).c = ((ztv)localObject2).l;
          ((zbtf)localObject3).d = ((ztv)localObject2).m;
          paramztv.m = ((ztv)localObject2).m;
        }
        else if (((ztv)localObject2).b() == 12)
        {
          ((zbtf)localObject3).b = ((ztv)localObject5).j.c();
          ((zbtf)localObject3).e = ((ztv)localObject2).l;
          ((zbtf)localObject3).f = ((ztv)localObject2).m;
        }
      }
      if (((zbtf)localObject3).a >= ((zbtf)localObject3).b)
      {
        paramztv.j.b(((zbtf)localObject3).a + ((zbtf)localObject3).b / 2.0F);
        paramztv.l = (((zbtf)localObject3).c + ((zbtf)localObject3).b / 2.0F);
      }
      else
      {
        paramztv.j.b(((zbtf)localObject3).a / 2.0F + ((zbtf)localObject3).b);
        paramztv.l = ((zbtf)localObject3).b;
      }
      break;
    case 13: 
      localObject3 = (zayn)paramztv;
      localzt = a("+", paramzr, localzg1);
      ((zayn)localObject3).b = (localzt.b() / 2.0F);
      ((zayn)localObject3).c = (localzt.c() / 8.0F);
      localObject4 = paramztv.c().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (ztv)((Iterator)localObject4).next();
        localObject2 = localObject5;
        if (((ztv)localObject2).b() == 3)
        {
          paramztv.j.a(paramztv.j.b() + ((ztv)localObject5).j.b());
          ((zayn)localObject3).d = ((ztv)localObject5).j.c();
          ((zayn)localObject3).f = ((ztv)localObject5).j.b();
          ((zayn)localObject3).h = ((ztv)localObject2).l;
          ((zayn)localObject3).v = ((ztv)localObject2).m;
          paramztv.l = ((ztv)localObject2).l;
        }
        else if ((((ztv)localObject2).b() == 17) && (!((zayn)localObject3).a))
        {
          paramztv.j.a(paramztv.j.b() + ((ztv)localObject5).j.b());
          ((zayn)localObject3).e = ((ztv)localObject5).j.c();
          ((zayn)localObject3).g = ((ztv)localObject5).j.b();
          ((zayn)localObject3).w = ((ztv)localObject2).l;
          ((zayn)localObject3).x = ((ztv)localObject2).m;
        }
      }
      if (((zayn)localObject3).a)
      {
        paramztv.j.a(paramztv.j.b() + ((zayn)localObject3).b);
        paramztv.j.b(((zayn)localObject3).d + ((zayn)localObject3).c);
        paramztv.m = (((zayn)localObject3).v + ((zayn)localObject3).c * 2.0F);
      }
      else
      {
        paramztv.j.a(paramztv.j.b() + ((zayn)localObject3).b / 2.0F);
        if (((zayn)localObject3).d >= ((zayn)localObject3).e)
        {
          paramztv.j.b(((zayn)localObject3).d + ((zayn)localObject3).e / 2.0F);
          paramztv.m = (((zayn)localObject3).v + ((zayn)localObject3).e / 2.0F);
        }
        else
        {
          paramztv.j.b(((zayn)localObject3).d * 0.75F + ((zayn)localObject3).e);
          paramztv.m = ((zayn)localObject3).e;
        }
      }
      break;
    case 5: 
      localzt = a("+", paramzr, localzg1);
      localObject3 = (zack)paramztv;
      localObject4 = paramztv.c().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (ztv)((Iterator)localObject4).next();
        localObject2 = localObject5;
        if (((ztv)localObject2).b() == 7)
        {
          ((zack)localObject3).a = ((ztv)localObject5).j.c();
          ((zack)localObject3).c = ((ztv)localObject5).j.b();
        }
        else if (((ztv)localObject2).b() == 6)
        {
          ((zack)localObject3).b = ((ztv)localObject5).j.c();
          ((zack)localObject3).d = ((ztv)localObject5).j.b();
        }
      }
      if ((((zack)paramztv).f == 0) || (((zack)paramztv).f == 2))
      {
        paramztv.j.a(Math.max(((zack)localObject3).c, ((zack)localObject3).d));
        f1 = a(paramInt2, paramInt3);
        ((zack)localObject3).e = (localzt.b() * f1);
        paramztv.j.a(paramztv.j.b() + ((zack)localObject3).e);
        paramztv.j.b(((zack)localObject3).a + ((zack)localObject3).b);
        paramztv.l = ((zack)localObject3).b;
        paramztv.m = ((zack)localObject3).a;
      }
      else if (((zack)paramztv).f == 1)
      {
        paramztv.j.a(((zack)localObject3).c + ((zack)localObject3).d);
        paramztv.j.b(Math.max(((zack)localObject3).a, ((zack)localObject3).b));
        localzt = a("/", paramzr, localzg1);
        paramztv.j.a(paramztv.j.b() + localzt.b());
        paramztv.l = (paramztv.j.c() / 2.0F);
        paramztv.m = (paramztv.j.c() / 2.0F);
      }
      else if (((zack)paramztv).f == 3)
      {
        paramztv.j.a(((zack)localObject3).c + ((zack)localObject3).d);
        paramztv.j.b(((zack)localObject3).a + ((zack)localObject3).b);
        localzt = a("/", paramzr, localzg1);
        paramztv.j.a(paramztv.j.b() + localzt.b() / 2.0F);
        paramztv.l = ((zack)localObject3).b;
        paramztv.m = ((zack)localObject3).a;
      }
      break;
    case 10: 
      a(paramztv);
      localzg2 = localzg1;
      localzt = a(((zsa)paramztv).a, paramzr, localzg2);
      paramztv.j.a(paramztv.j.b() + localzt.b());
      localzt = a(((zsa)paramztv).b, paramzr, localzg2);
      paramztv.j.a(paramztv.j.b() + localzt.b());
      int j = paramztv.c().size();
      if (j > 1)
      {
        localzt = a(((zsa)paramztv).d, paramzr, localzg1);
        paramztv.j.a(paramztv.j.b() + localzt.b() * (j - 1));
      }
      break;
    case 11: 
      localzt = a("+", paramzr, localzg1);
      zaqk localzaqk = (zaqk)paramztv;
      f1 = localzg1.h() * a(paramInt2, paramInt3, localzaqk.b);
      localzg2 = new zg(localzg1.g(), f1, localzg1.k());
      localzt = a(localzaqk.a, paramzr, localzg2);
      localzaqk.A = localzt.b();
      localzaqk.B = localzt.b();
      localObject4 = paramztv.c().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (ztv)((Iterator)localObject4).next();
        localObject2 = localObject5;
        switch (((ztv)localObject2).b())
        {
        case 4: 
          localzaqk.h = ((ztv)localObject2).j.b();
          localzaqk.v = ((ztv)localObject2).j.c();
          break;
        case 12: 
          localzaqk.f = ((ztv)localObject2).j.b();
          localzaqk.g = ((ztv)localObject2).j.c();
          break;
        case 3: 
          localzaqk.w = ((ztv)localObject2).j.b();
          localzaqk.x = ((ztv)localObject2).j.c();
          localzaqk.y = ((ztv)localObject2).l;
          localzaqk.z = ((ztv)localObject2).m;
        }
      }
      if (localzaqk.d)
      {
        localzaqk.f = 0.0F;
        localzaqk.g = 0.0F;
      }
      if (localzaqk.e)
      {
        localzaqk.h = 0.0F;
        localzaqk.v = 0.0F;
      }
      if ((localzaqk.c == 1) || (paramInt2 > 0) || (paramInt3 > 0))
      {
        localzaqk.C = Math.max(localzaqk.h, localzaqk.f);
        localzaqk.E = (localzt.b() / 10.0F);
        localzaqk.C = (localzaqk.C + localzaqk.A + localzaqk.E);
        f1 = localzaqk.B / 2.0F;
        float f2 = Math.max(f1, localzaqk.v);
        float f3 = Math.max(f1, localzaqk.g);
        localzaqk.D = (f2 + f3);
        localzaqk.l = f3;
        localzaqk.l = Math.max(localzaqk.l, localzaqk.y);
        localzaqk.m = f2;
        localzaqk.m = Math.max(localzaqk.m, localzaqk.z);
      }
      else
      {
        localzaqk.E = (localzt.b() / 10.0F);
        f1 = Math.max(localzaqk.h, localzaqk.f);
        localzaqk.C = Math.max(f1, localzaqk.A);
        localzaqk.D = (localzaqk.g + localzaqk.v + localzaqk.B);
        localzaqk.l = (localzaqk.B / 2.0F + localzaqk.g);
        localzaqk.l = Math.max(localzaqk.l, localzaqk.y);
        localzaqk.m = (localzaqk.B / 2.0F + localzaqk.v);
        localzaqk.m = Math.max(localzaqk.m, localzaqk.z);
      }
      paramztv.j.a(localzaqk.C + localzaqk.w);
      paramztv.j.b(Math.max(localzaqk.D, localzaqk.x));
      break;
    case 1: 
    case 3: 
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 12: 
    case 14: 
    default: 
      a(paramztv);
    }
  }
  
  private float a(int paramInt1, int paramInt2)
  {
    float f = 0.3F;
    if (paramInt1 > 0) {
      return f;
    }
    switch (paramInt2)
    {
    case 0: 
    case 1: 
      f = 0.5F;
      break;
    case 2: 
      f = 0.3F;
      break;
    default: 
      f = 0.15F;
    }
    return f;
  }
  
  private float a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    float f = 1.0F;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramBoolean) {
        f = 1.8F;
      } else {
        f = 2.0F;
      }
      return f;
    }
    if (paramInt1 > 0) {
      f = this.c;
    }
    return f;
  }
  
  private void a(zr paramzr, zbwg paramzbwg, int paramInt1, int paramInt2, int paramInt3)
  {
    TextOptions localTextOptions;
    if (paramzbwg.p() != null) {
      localTextOptions = paramzbwg.p();
    } else {
      localTextOptions = c((ztv)paramzbwg.i);
    }
    zg localzg1 = a(localTextOptions);
    zg localzg2 = new zg(localzg1.g(), localzg1.h() * a(paramInt2), localzg1.k());
    paramzbwg.j = a(paramzbwg.o(), paramzr, localzg2);
    if (paramInt2 == 0)
    {
      paramzbwg.b = new ArrayList();
      int i = a(paramzbwg, paramInt1);
      if (i > 0)
      {
        zt localzt = a("+", paramzr, localzg2);
        float f = localzt.b() * this.d;
        paramzbwg.j.a(paramzbwg.j.b() + f * i);
      }
    }
    if ((paramInt3 > 1) || (paramInt2 > 0)) {
      paramzbwg.j.b(paramzbwg.j.c() * 0.795F);
    }
  }
  
  private int a(zbwg paramzbwg, int paramInt)
  {
    String str = paramzbwg.o();
    int i = 0;
    int j = str.length();
    ztv localztv = (ztv)paramzbwg.i;
    int m = localztv.c().size();
    for (int n = 0; n < j; n++)
    {
      int k = a(str.charAt(n));
      zauk localzauk;
      if (k == 1)
      {
        localzauk = new zauk(n, (short)0, (short)0);
        if (n == 0)
        {
          if (paramInt > 0)
          {
            i += 1;
            localzauk.b = 1;
          }
          if (n == j - 1)
          {
            if (paramInt > 0)
            {
              i += 1;
              localzauk.c = 1;
            }
          }
          else if ((a(str.charAt(n + 1)) == 0) && (paramInt > 0))
          {
            i += 1;
            localzauk.c = 1;
          }
        }
        else if (n == j - 1)
        {
          if (a(str.charAt(n - 1)) == 0)
          {
            i += 1;
            localzauk.b = 1;
          }
          if (paramInt != m - 1)
          {
            i += 1;
            localzauk.c = 1;
          }
        }
        else
        {
          if (a(str.charAt(n - 1)) == 0)
          {
            i += 1;
            localzauk.b = 1;
          }
          if (a(str.charAt(n + 1)) == 0)
          {
            i += 1;
            localzauk.c = 1;
          }
        }
        com.aspose.cells.b.a.a.zf.a(paramzbwg.b, localzauk);
      }
      else if (k > 1)
      {
        i += 2;
        localzauk = new zauk(n, (short)1, (short)1);
        com.aspose.cells.b.a.a.zf.a(paramzbwg.b, localzauk);
      }
    }
    return i;
  }
  
  private int a(char paramChar)
  {
    int i = 0;
    switch (paramChar)
    {
    case '+': 
    case '-': 
      i = 1;
      break;
    }
    return i;
  }
  
  private float a(int paramInt)
  {
    if (paramInt <= 0) {
      return 1.0F;
    }
    float f = 1.0F;
    if (paramInt == 0) {
      f = 1.0F;
    } else if (paramInt == 1) {
      f = this.c;
    } else if (paramInt >= 2) {
      f = this.c * this.c;
    }
    return f;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 < paramFloat2) {
      this.a.a(this.a.d() + (paramFloat2 - paramFloat1) / 2.0F);
    }
  }
  
  private void b(zr paramzr, ztv paramztv, int paramInt1, int paramInt2, int paramInt3)
  {
    float f1 = this.a.d();
    float f2 = this.a.e();
    int i = 1;
    int j = 0;
    float f5 = 0.0F;
    ztv localztv = (ztv)paramztv.i;
    zg localzg1 = b(paramztv);
    Color localColor = paramztv.getTextOptions().getColor();
    float f3 = 0.0F;
    zg localzg2;
    zt localzt1;
    float f4;
    Object localObject2;
    zt localzt2;
    Object localObject3;
    Object localObject4;
    switch (paramztv.b())
    {
    case 3: 
      if ((localztv.b() == 10) && (paramInt1 > 0))
      {
        localzg2 = b(localztv);
        localzt1 = a(((zsa)localztv).d, paramzr, localzg2);
        paramzr.a(((zsa)localztv).d, localzg2, new zu(localColor), this.a, this.b);
        this.a.a(this.a.d() + localzt1.b());
      }
      break;
    case 4: 
      switch (localztv.b())
      {
      case 2: 
      case 16: 
        localObject1 = (zbtl)localztv;
        f4 = this.a.e() - ((zbtl)localObject1).d + ((zbtl)localObject1).e / 2.0F;
        if (f4 + ((zbtl)localObject1).e >= this.a.e() + ((zbtl)localObject1).c / 2.0F) {
          f4 = this.a.e() - ((zbtl)localObject1).e + ((zbtl)localObject1).d / 2.0F;
        }
        this.a.b(f4);
        break;
      case 11: 
        localObject2 = (zaqk)localztv;
        f4 = ((zaqk)localObject2).B / 2.0F;
        if ((((zaqk)localObject2).c == 1) || (paramInt2 > 1) || (paramInt3 > 0))
        {
          this.a.b(this.a.e() - Math.max(paramztv.l, f4));
        }
        else
        {
          a(paramztv.j.b(), ((zaqk)localObject2).C);
          this.a.b(this.a.e() - f4 - paramztv.l);
          this.a.b(this.a.e() - ((zaqk)localObject2).E);
        }
        break;
      case 14: 
        break;
      default: 
        this.a.b(this.a.e() - paramztv.j.c() / 3.0F);
      }
      break;
    case 12: 
      switch (localztv.b())
      {
      case 15: 
      case 16: 
        localObject1 = (zbtf)localztv;
        f4 = this.a.e() + ((zbtf)localObject1).c - ((zbtf)localObject1).f / 2.0F;
        if (f4 - ((zbtf)localObject1).f <= this.a.e() - ((zbtf)localObject1).d / 2.0F) {
          f4 = this.a.e() + ((zbtf)localObject1).f - ((zbtf)localObject1).c / 2.0F;
        }
        this.a.b(f4);
        break;
      case 11: 
        localObject2 = (zaqk)localztv;
        f4 = ((zaqk)localObject2).B / 2.0F;
        if ((((zaqk)localObject2).c == 1) || (paramInt2 > 1) || (paramInt3 > 0))
        {
          this.a.b(this.a.e() + Math.max(paramztv.m, f4));
        }
        else
        {
          a(paramztv.j.b(), ((zaqk)localObject2).C);
          this.a.b(this.a.e() + f4 + paramztv.m * 1.5F);
          this.a.b(this.a.e() + ((zaqk)localObject2).E);
        }
        break;
      case 14: 
        break;
      case 12: 
      case 13: 
      default: 
        this.a.b(this.a.e() + paramztv.j.c() / 3.0F);
      }
      if (localztv.b() != 15) {
        i = 0;
      }
      break;
    case 17: 
      localObject1 = (zayn)localztv;
      f4 = this.a.e() - ((zayn)localObject1).v + ((zayn)localObject1).w / 2.0F;
      if ((((zayn)localObject1).e > ((zayn)localObject1).d) && (f4 + ((zayn)localObject1).w >= this.a.e() - ((zayn)localObject1).h / 2.0F)) {
        f4 = this.a.e() - ((zayn)localObject1).w - ((zayn)localObject1).h / 2.0F;
      }
      this.a.b(f4);
      break;
    case 7: 
      localzt1 = paramztv.j;
      localzt2 = localztv.j;
      localObject1 = (zack)localztv;
      switch (((zack)localObject1).f)
      {
      case 0: 
      case 2: 
        i = 0;
        this.a.b(this.a.e() - paramztv.l);
        a(localzt1.b(), localzt2.b());
        break;
      case 1: 
        break;
      case 3: 
        this.a.b(this.a.e() - paramztv.l);
      }
      break;
    case 6: 
      localzt1 = paramztv.j;
      localzt2 = localztv.j;
      localObject1 = (zack)localztv;
      switch (((zack)localObject1).f)
      {
      case 0: 
      case 2: 
        this.a.b(this.a.e() + paramztv.m);
        a(localzt1.b(), localzt2.b());
        break;
      case 1: 
        break;
      case 3: 
        this.a.b(this.a.e() + paramztv.m);
      }
      break;
    case 10: 
      localObject1 = (zsa)paramztv;
      localzt1 = a(((zsa)localObject1).a, paramzr, localzg1);
      f4 = paramztv.j.c() - localzt1.c();
      f5 = paramztv.j.c() / localzt1.c();
      if ((f4 > 1.0F) && (f5 > this.e))
      {
        j = 1;
        localObject2 = new zt(1.0F, f5 * this.e);
        localObject3 = paramzr.d();
        localObject4 = new zi();
        ((zi)localObject4).a(((zt)localObject2).b(), ((zt)localObject2).c(), 0);
        paramzr.a((zi)localObject4);
        float f9 = this.a.e();
        if (paramztv.l > paramztv.m) {
          f9 += (paramztv.l - paramztv.m) / 2.0F;
        } else if (paramztv.m > paramztv.l) {
          f9 -= (paramztv.m - paramztv.l) / 2.0F;
        }
        f9 /= f5 * this.e;
        paramzr.a(((zsa)localObject1).a, localzg1, new zu(localColor), this.a.d(), f9, this.b);
        this.a.a(this.a.d() + localzt1.b());
        paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject3);
      }
      else
      {
        paramzr.a(((zsa)localObject1).a, localzg1, new zu(localColor), this.a, this.b);
        this.a.a(this.a.d() + localzt1.b());
      }
      localzt1 = a(((zsa)localObject1).b, paramzr, localzg1);
      f3 = localzt1.b();
      break;
    case 11: 
      localObject1 = (zaqk)paramztv;
      if (!"".equals(((zaqk)localObject1).a))
      {
        f4 = localzg1.h() * a(paramInt2, paramInt3, ((zaqk)localObject1).b);
        localzg2 = new zg(localzg1.g(), f4, localzg1.k());
        if ((((zaqk)localObject1).c == 1) || (paramInt2 > 0) || (paramInt3 > 0))
        {
          paramzr.a(((zaqk)localObject1).a, localzg2, new zu(localColor), this.a, this.b);
          this.a.a(this.a.d() + ((zaqk)localObject1).A + ((zaqk)localObject1).E);
        }
        else
        {
          f5 = this.a.d();
          a(((zaqk)localObject1).A, ((zaqk)localObject1).C);
          this.a.a(this.a.d() - ((zaqk)localObject1).E * 2.0F);
          paramzr.a(((zaqk)localObject1).a, localzg2, new zu(localColor), this.a, this.b);
          this.a.a(f5);
        }
      }
      break;
    case 1: 
    case 2: 
    case 5: 
    case 8: 
    case 9: 
    case 15: 
      break;
    }
    int k = 0;
    Object localObject1 = paramztv.c().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (FontSetting)((Iterator)localObject1).next();
      localObject3 = (ztv)localObject2;
      switch (((ztv)localObject3).b())
      {
      case 0: 
        localObject4 = (ztw)localObject2;
        ztx localztx = new ztx();
        localztx.a(paramzr, (ztw)localObject4, paramInt2, paramInt3);
        break;
      case 4: 
      case 12: 
      case 17: 
        b(paramzr, (ztv)localObject3, k, paramInt2 + 1, paramInt3);
        break;
      case 5: 
        b(paramzr, (ztv)localObject3, k, paramInt2, paramInt3 + 1);
        break;
      case 22: 
        zbwg localzbwg = (zbwg)localObject2;
        a(paramzr, localzbwg, paramInt2, paramInt3);
        break;
      default: 
        b(paramzr, (ztv)localObject3, k, paramInt2, paramInt3);
      }
      k++;
    }
    float f8;
    switch (paramztv.b())
    {
    case 10: 
      if (j != 0)
      {
        localObject1 = new zt(1.0F, f5 * this.e);
        localObject2 = paramzr.d();
        localObject3 = new zi();
        ((zi)localObject3).a(((zt)localObject1).b(), ((zt)localObject1).c(), 0);
        paramzr.a((zi)localObject3);
        f8 = this.a.e();
        if (paramztv.l > paramztv.m) {
          f8 += (paramztv.l - paramztv.m) / 2.0F;
        } else if (paramztv.m > paramztv.l) {
          f8 -= (paramztv.m - paramztv.l) / 2.0F;
        }
        f8 /= f5 * this.e;
        paramzr.a(((zsa)paramztv).b, localzg1, new zu(localColor), this.a.d(), f8, this.b);
        this.a.a(this.a.d() + f3);
        paramzr.a((com.aspose.cells.b.a.b.a.zf)localObject2);
      }
      else
      {
        paramzr.a(((zsa)paramztv).b, localzg1, new zu(localColor), this.a, this.b);
        this.a.a(this.a.d() + f3);
      }
      break;
    }
    this.a.a(f1);
    this.a.b(f2);
    switch (paramztv.b())
    {
    case 5: 
      localObject1 = (zack)paramztv;
      switch (((zack)localObject1).f)
      {
      case 0: 
        localObject2 = new zs(localColor);
        ((zs)localObject2).b(a(localzg1));
        paramzr.b((zs)localObject2, this.a.d() + ((zack)localObject1).e * 0.55F, this.a.e(), this.a.d() + paramztv.j.b() - ((zack)localObject1).e * 0.2F, this.a.e());
        break;
      }
      this.a.a(this.a.d() + paramztv.j.b());
      break;
    case 7: 
      localObject1 = (zack)localztv;
      switch (((zack)localObject1).f)
      {
      case 1: 
      case 3: 
        this.a.a(this.a.d() + paramztv.j.b());
        localzt2 = a("/", paramzr, localzg1);
        paramzr.a("/", localzg1, new zu(localColor), this.a, this.b);
        this.a.a(this.a.d() + localzt2.b());
      }
      break;
    case 4: 
      if (localztv.b() == 11)
      {
        localObject1 = (zaqk)localztv;
        if ((((zaqk)localObject1).c == 1) || (paramInt2 > 1) || (paramInt3 > 0)) {
          this.a.a(this.a.d() + ((zaqk)localObject1).C - ((zaqk)localObject1).A);
        } else {
          this.a.a(this.a.d() + ((zaqk)localObject1).C);
        }
      }
      break;
    case 17: 
      localObject1 = (zayn)localztv;
      float f6 = this.a.d();
      float f7 = this.a.e();
      f8 = ((zayn)localObject1).d + ((zayn)localObject1).c;
      this.a.b(this.a.e() - ((zayn)localObject1).v - ((zayn)localObject1).c);
      if (((zayn)localObject1).a)
      {
        this.a.a(this.a.d() + ((zayn)localObject1).b);
        a(paramzr, localColor, this.a, ((zayn)localObject1).f, f8, ((zayn)localObject1).b);
        this.a.b(f7);
      }
      else
      {
        this.a.a(this.a.d() + ((zayn)localObject1).g + ((zayn)localObject1).b / 2.0F);
        a(paramzr, localColor, this.a, ((zayn)localObject1).f, f8, ((zayn)localObject1).b);
        this.a.b(f7);
      }
      break;
    default: 
      if (i != 0) {
        this.a.a(this.a.d() + paramztv.j.b());
      }
      break;
    }
  }
  
  private float a(zg paramzg)
  {
    float f = paramzg.h() / 25.4F;
    if (paramzg.c()) {
      f *= 1.65F;
    }
    return f;
  }
  
  private void a(zr paramzr, Color paramColor, zo paramzo, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    zs localzs = new zs(paramColor);
    float f1 = paramzo.d();
    float f2 = paramzo.e();
    float f3 = paramzo.d() - paramFloat3 / 2.0F;
    float f4 = paramzo.e() + paramFloat2;
    float f5 = paramzo.d() + paramFloat1;
    float f6 = f2;
    paramzr.b(localzs, f1, f2, f3, f4);
    paramzr.b(localzs, f1, f2, f5, f6);
    float f7 = paramzo.d() - paramFloat3;
    float f8 = f4 - paramFloat3 / 5.0F;
    float f9 = paramzo.d() - paramFloat3 * 0.8F;
    float f10 = f4 - paramFloat3 / 3.0F;
    paramzr.b(localzs, f3, f4, f9, f10);
    paramzr.b(localzs, f9, f10, f7, f8);
  }
  
  private zt a(String paramString, zr paramzr, zg paramzg)
  {
    zv localzv = new zv(zv.c());
    zt localzt1 = paramzr.a(paramString, paramzg, Integer.MAX_VALUE, localzv);
    zg localzg = new zg("Cambria", paramzg.h(), paramzg.k());
    zt localzt2 = paramzr.a(paramString, localzg, Integer.MAX_VALUE, localzv);
    localzt1.b(localzt2.c());
    return localzt1;
  }
  
  private void a(zr paramzr, zbwg paramzbwg, int paramInt1, int paramInt2)
  {
    ztv localztv = (ztv)paramzbwg.i;
    TextOptions localTextOptions;
    if (paramzbwg.p() != null) {
      localTextOptions = paramzbwg.p();
    } else {
      localTextOptions = c(localztv);
    }
    zg localzg1 = a(localTextOptions);
    zg localzg2 = new zg(localzg1.g(), localzg1.h() * a(paramInt1), localzg1.k());
    Color localColor = localTextOptions.getColor();
    String str1 = paramzbwg.o();
    zt localzt1 = paramzbwg.j;
    if (paramInt1 == 0)
    {
      int k = paramzbwg.b.size() - 1;
      if (k > -1)
      {
        zt localzt3 = a("+", paramzr, localzg2);
        float f = localzt3.b() * this.d;
        int m = str1.length();
        zauk localzauk = (zauk)paramzbwg.b.get(0);
        int i = localzauk.a;
        String str2 = str1.substring(0, 0 + i);
        zt localzt2;
        if (str2.length() > 0)
        {
          localzt2 = a(str2, paramzr, localzg2);
          paramzr.a(str2, localzg2, new zu(localColor), this.a, this.b);
          this.a.a(this.a.d() + localzt2.b());
        }
        if (localzauk.b == 1) {
          this.a.a(this.a.d() + f);
        }
        String str3 = str1.substring(i, i + 1);
        paramzr.a(str3, localzg2, new zu(localColor), this.a, this.b);
        this.a.a(this.a.d() + localzt3.b());
        if (localzauk.c == 1) {
          this.a.a(this.a.d() + f);
        }
        if (k == 0)
        {
          if (m > i + 1)
          {
            String str4 = str1.substring(i + 1, i + 1 + (m - i - 1));
            localzt2 = a(str4, paramzr, localzg2);
            paramzr.a(str4, localzg2, new zu(localColor), this.a, this.b);
            this.a.a(this.a.d() + localzt2.b());
          }
        }
        else
        {
          if (k > 1) {
            for (int n = 1; n < k; n++)
            {
              j = i;
              localzauk = (zauk)paramzbwg.b.get(n);
              i = localzauk.a;
              str2 = str1.substring(j + 1, j + 1 + (i - j - 1));
              if (str2.length() > 0)
              {
                localzt2 = a(str2, paramzr, localzg2);
                paramzr.a(str2, localzg2, new zu(localColor), this.a, this.b);
                this.a.a(this.a.d() + localzt2.b());
              }
              str3 = str1.substring(i, i + 1);
              if (localzauk.b == 1) {
                this.a.a(this.a.d() + f);
              }
              paramzr.a(str3, localzg2, new zu(localColor), this.a, this.b);
              this.a.a(this.a.d() + localzt3.b());
              if (localzauk.c == 1) {
                this.a.a(this.a.d() + f);
              }
            }
          }
          int j = i;
          localzauk = (zauk)paramzbwg.b.get(k);
          i = localzauk.a;
          str2 = str1.substring(j + 1, j + 1 + (i - j - 1));
          if (str2.length() > 0)
          {
            localzt2 = a(str2, paramzr, localzg2);
            paramzr.a(str2, localzg2, new zu(localColor), this.a, this.b);
            this.a.a(this.a.d() + localzt2.b());
          }
          str3 = str1.substring(i, i + 1);
          if (localzauk.b == 1) {
            this.a.a(this.a.d() + f);
          }
          paramzr.a(str3, localzg2, new zu(localColor), this.a, this.b);
          this.a.a(this.a.d() + localzt3.b());
          if (localzauk.c == 1) {
            this.a.a(this.a.d() + f);
          }
          str2 = str1.substring(i + 1, i + 1 + (m - i - 1));
          if (str2.length() > 0)
          {
            localzt2 = a(str2, paramzr, localzg2);
            paramzr.a(str2, localzg2, new zu(localColor), this.a, this.b);
            this.a.a(this.a.d() + localzt2.b());
          }
        }
      }
      else
      {
        paramzr.a(str1, localzg2, new zu(localColor), this.a, this.b);
        this.a.a(this.a.d() + localzt1.b());
      }
    }
    else
    {
      paramzr.a(str1, localzg2, new zu(localColor), this.a, this.b);
      this.a.a(this.a.d() + localzt1.b());
    }
  }
  
  private zg b(ztv paramztv)
  {
    TextOptions localTextOptions = c(paramztv);
    if (localTextOptions != null) {
      return a(localTextOptions);
    }
    return a();
  }
  
  private zg a()
  {
    zg localzg = new zg("Cambria Math", 11.0F, 0);
    return localzg;
  }
  
  private TextOptions c(ztv paramztv)
  {
    if (paramztv.q != null) {
      return paramztv.getTextOptions();
    }
    if ((paramztv.i != null) && ((paramztv.i instanceof ztv))) {
      return c((ztv)paramztv.i);
    }
    return null;
  }
  
  private zg a(TextOptions paramTextOptions)
  {
    float f = paramTextOptions.getSize();
    if (f <= 0.0F) {
      f = 11.0F;
    }
    int i = 0;
    if (paramTextOptions.isBold()) {
      i |= 0x1;
    }
    if ((!paramTextOptions.isItalic()) || ((paramTextOptions.getUnderline() == 0) || (paramTextOptions.getStrikeType() != 2))) {
      i |= 0x8;
    }
    String str = "Cambria Math";
    zg localzg = new zg(str, f, i);
    return localzg;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */