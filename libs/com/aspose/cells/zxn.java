package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;

final class zxn
{
  static void a(zje paramzje, zp paramzp, boolean paramBoolean)
  {
    if ((b(paramzje)) || (zbxz.a(paramzp))) {
      return;
    }
    double d1 = paramzje.m() / 100.0D;
    double d2 = paramzje.n() / 100.0D;
    double d3 = paramzje.o() / 100.0D;
    int i = 0;
    int j = paramzje.z().h();
    int k = paramzje.z().getCount();
    boolean bool = a(paramzje.M());
    if (bool) {
      k = 1;
    }
    if (paramzje.e().k() == 2)
    {
      if (b(paramzje.M()))
      {
        if ((paramzje.e().f()) || (paramzje.u()))
        {
          i = zbu.a(paramzje.e().j(), (int)paramzje.e().z(), (int)paramzje.e().D(), paramzje.U()) + 1;
        }
        else
        {
          i = zbu.a(paramzje.e().j(), (int)paramzje.e().z(), (int)paramzje.e().D(), paramzje.U());
          if (i == 0) {
            i = 1;
          }
        }
      }
      else {
        i = zbu.a(paramzje.e().j(), (int)paramzje.e().z(), (int)paramzje.e().D(), paramzje.U()) + 1;
      }
    }
    else if (b(paramzje.M()))
    {
      if ((paramzje.e().f()) || (paramzje.u()))
      {
        i = j;
      }
      else
      {
        i = j - 1;
        if (i == 0) {
          i = 1;
        }
      }
    }
    else {
      i = j;
    }
    double d4 = 0.0D;
    if (bool) {
      d4 = i / d1;
    } else if (!a(paramzje)) {
      d4 = i * (k + d3) / (d1 + d2 * d1);
    } else {
      d4 = i / (k * d1);
    }
    double d5 = Math.abs(Math.sin(paramzje.p() * 3.141592653589793D / 180.0D));
    int m = paramzje.D() % 90;
    if (m >= 45) {
      m = 90 - m;
    }
    double d6 = Math.sin(m * 3.141592653589793D / 180.0D);
    int n = paramzje.D() / 45;
    if (paramzje.r())
    {
      float f1 = 1.0F;
      if ((paramzje.z().getCount() == 1) && ((paramzje.M() == 17) || (paramzje.M() == 27) || (paramzje.M() == 34) || (paramzje.M() == 56))) {
        f1 = 0.67F;
      }
      double d8 = 0.0D;
      double d10 = 0.0D;
      double d12 = 0.0D;
      double d14 = 0.0D;
      switch (n)
      {
      case 0: 
      case 3: 
      case 4: 
      case 7: 
      case 8: 
        if (!paramBoolean)
        {
          d8 = paramzp.e() / (1.0D + d6 / d4);
          d12 = paramzp.f() * paramzp.e() / (paramzp.e() * d5 / d4 + paramzp.f());
        }
        else
        {
          d8 = paramzp.e() * paramzp.e() / (paramzp.f() * d6 / d4 + paramzp.e());
          d12 = paramzp.e() / (1.0D + d5 / d4);
        }
        break;
      case 1: 
      case 2: 
      case 5: 
      case 6: 
        d8 = paramzp.e() / (1.0D / d4 + d6);
        d12 = paramzp.f() * paramzp.e() / (paramzp.e() * d5 + paramzp.f());
      }
      d10 = d8 * paramzp.f() / paramzp.e();
      d14 = d12 * paramzp.f() / paramzp.e();
      if (d10 < d14)
      {
        paramzje.N().c((float)d8);
        paramzje.N().e((float)d10);
      }
      else
      {
        paramzje.N().c((float)d12);
        paramzje.N().e((float)d14);
      }
      paramzje.N().e(paramzje.N().i() * f1);
      paramzje.N().d(!paramBoolean ? (float)(paramzje.N().g() / d4) : (float)(paramzje.N().i() / d4));
      paramzje.N().a(paramzp.c() + (paramzp.e() - paramzje.N().g()) / 2.0F);
      paramzje.N().b(paramzp.d() + paramzp.f() - (paramzp.f() - paramzje.N().i()) / 2.0F);
    }
    else
    {
      double d7 = paramzje.q() / 100.0D;
      if ((paramzje.z().getCount() == 1) && ((paramzje.M() == 17) || (paramzje.M() == 27) || (paramzje.M() == 34) || (paramzje.M() == 56)))
      {
        float f2 = 0.67F;
        d7 *= f2;
      }
      double d9 = 0.0D;
      double d11 = 0.0D;
      double d13 = 0.0D;
      double d15 = 0.0D;
      switch (n)
      {
      case 0: 
      case 3: 
      case 4: 
      case 7: 
      case 8: 
        if (!paramBoolean)
        {
          d9 = paramzp.e() / (1.0D + d6 / d4);
          d13 = paramzp.f() / (d7 + d5 / d4);
        }
        else
        {
          d9 = paramzp.e() / (1.0D + d6 / d4 / d7);
          d13 = paramzp.f() * d7 / (1.0D + d5 / d4);
        }
        break;
      case 1: 
      case 2: 
      case 5: 
      case 6: 
        d9 = paramzp.e() / (1.0D / d4 + d6);
        d13 = paramzp.f() / (d5 + d7);
      }
      if (!paramBoolean)
      {
        d11 = d9 * d7;
        d15 = d13 * d7;
      }
      else
      {
        d11 = d9 / d7;
        d15 = d13 / d7;
      }
      if (d11 < d15)
      {
        paramzje.N().c((float)d9);
        paramzje.N().e((float)d11);
      }
      else
      {
        paramzje.N().c((float)d13);
        paramzje.N().e((float)d15);
      }
      paramzje.N().d(!paramBoolean ? (float)(paramzje.N().g() / d4) : (float)(paramzje.N().i() / d4));
      paramzje.N().a(paramzp.c() + (paramzp.e() - paramzje.N().g()) / 2.0F);
      paramzje.N().b(paramzp.d() + paramzp.f() - (paramzp.f() - paramzje.N().i()) / 2.0F);
    }
  }
  
  private static boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 10: 
    case 11: 
    case 19: 
    case 20: 
    case 22: 
    case 23: 
    case 25: 
    case 26: 
    case 29: 
    case 30: 
    case 32: 
    case 33: 
    case 51: 
    case 52: 
    case 54: 
    case 55: 
      return true;
    }
    return false;
  }
  
  private static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 4: 
    case 5: 
    case 43: 
      return true;
    }
    return false;
  }
  
  static void a(zr paramzr, zje paramzje, boolean paramBoolean)
    throws Exception
  {
    if ((b(paramzje)) || (paramzje.B().D())) {
      return;
    }
    float f1 = paramzje.N().j();
    float f2 = paramzje.N().f();
    zo localzo = new zo(f1, f2);
    int i = paramzje.D() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzje.D() / 45;
    float f3;
    float f4;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f3 = paramzje.N().g();
      f4 = paramzje.N().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f3 = paramzje.N().h();
      f4 = paramzje.N().g();
    }
    float f5 = f4 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f6 = f4 * (float)Math.sin(paramzje.p() * 3.141592653589793D / 180.0D);
    zo[] arrayOfzo1 = new zo[8];
    zbxz.a(arrayOfzo1);
    switch (j)
    {
    case 0: 
    case 8: 
      arrayOfzo1[0].a(localzo.d() - (f3 + f5) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() + f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f5);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f5);
      arrayOfzo1[0].b(localzo.e() + f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() - f6);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      break;
    case 1: 
      arrayOfzo1[0].a(localzo.d() - (f3 + f5) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() + f5);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f3);
      arrayOfzo1[0].b(localzo.e() - f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() + f6);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      break;
    case 2: 
      arrayOfzo1[1].a(localzo.d() - (f3 + f5) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() + f5);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[3].a(arrayOfzo1[0].d() + f3);
      arrayOfzo1[0].b(localzo.e() - f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() + f6);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      break;
    case 3: 
      arrayOfzo1[1].a(localzo.d() - (f3 + f5) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() + f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() + f5);
      arrayOfzo1[3].a(arrayOfzo1[2].d() + f3);
      arrayOfzo1[0].b(localzo.e() - f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() + f6);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      break;
    case 4: 
      arrayOfzo1[0].a(localzo.d() + (f3 + f5) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() - f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f5);
      arrayOfzo1[3].a(arrayOfzo1[2].d() + f3);
      arrayOfzo1[0].b(localzo.e() - f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() + f6);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
      break;
    case 5: 
      arrayOfzo1[0].a(localzo.d() + (f3 + f5) / 2.0F);
      arrayOfzo1[1].a(arrayOfzo1[0].d() - f5);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[3].a(arrayOfzo1[0].d() - f3);
      arrayOfzo1[0].b(localzo.e() + f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() - f6);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      break;
    case 6: 
      arrayOfzo1[1].a(localzo.d() + (f3 + f5) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() - f5);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[3].a(arrayOfzo1[0].d() - f3);
      arrayOfzo1[0].b(localzo.e() + f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e() - f6);
      arrayOfzo1[2].b(arrayOfzo1[1].e());
      arrayOfzo1[3].b(arrayOfzo1[0].e());
      break;
    case 7: 
      arrayOfzo1[1].a(localzo.d() + (f3 + f5) / 2.0F);
      arrayOfzo1[0].a(arrayOfzo1[1].d() - f3);
      arrayOfzo1[2].a(arrayOfzo1[1].d() - f5);
      arrayOfzo1[3].a(arrayOfzo1[2].d() - f3);
      arrayOfzo1[0].b(localzo.e() + f6 / 2.0F);
      arrayOfzo1[1].b(arrayOfzo1[0].e());
      arrayOfzo1[2].b(arrayOfzo1[1].e() - f6);
      arrayOfzo1[3].b(arrayOfzo1[2].e());
    }
    arrayOfzo1[4].a(arrayOfzo1[0].d());
    arrayOfzo1[5].a(arrayOfzo1[1].d());
    arrayOfzo1[6].a(arrayOfzo1[2].d());
    arrayOfzo1[7].a(arrayOfzo1[3].d());
    arrayOfzo1[4].b(arrayOfzo1[0].e() - paramzje.N().i());
    arrayOfzo1[5].b(arrayOfzo1[1].e() - paramzje.N().i());
    arrayOfzo1[6].b(arrayOfzo1[2].e() - paramzje.N().i());
    arrayOfzo1[7].b(arrayOfzo1[3].e() - paramzje.N().i());
    zf.a(paramzje.N().a, new zo(arrayOfzo1[0].d(), arrayOfzo1[0].e()));
    zf.a(paramzje.N().a, new zo(arrayOfzo1[1].d(), arrayOfzo1[1].e()));
    zf.a(paramzje.N().a, new zo(arrayOfzo1[2].d(), arrayOfzo1[2].e()));
    zf.a(paramzje.N().a, new zo(arrayOfzo1[3].d(), arrayOfzo1[3].e()));
    zf.a(paramzje.N().a, new zo(arrayOfzo1[4].d(), arrayOfzo1[4].e()));
    zf.a(paramzje.N().a, new zo(arrayOfzo1[5].d(), arrayOfzo1[5].e()));
    zf.a(paramzje.N().a, new zo(arrayOfzo1[6].d(), arrayOfzo1[6].e()));
    zf.a(paramzje.N().a, new zo(arrayOfzo1[7].d(), arrayOfzo1[7].e()));
    zo[] arrayOfzo2 = new zo[6];
    zbxz.a(arrayOfzo2);
    zq localzq;
    Object localObject1;
    Object localObject3;
    Object localObject5;
    if (paramBoolean)
    {
      if (paramzje.p() >= 0)
      {
        localzq = a(new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
        localObject1 = zbd.a(paramzje.s().c(), localzq);
        try
        {
          paramzr.a((zc)localObject1, new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
        }
        finally
        {
          if (localObject1 != null) {
            ((zc)localObject1).f();
          }
        }
      }
      localzq = a(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[3] });
      localObject1 = zbd.a(paramzje.N().d(), localzq);
      try
      {
        paramzr.a((zc)localObject1, new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[3] });
      }
      finally
      {
        if (localObject1 != null) {
          ((zc)localObject1).f();
        }
      }
      localzq = a(new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
      localObject3 = zbd.a(paramzje.N().d(), localzq);
      try
      {
        paramzr.a((zc)localObject3, new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
      }
      finally
      {
        if (localObject3 != null) {
          ((zc)localObject3).f();
        }
      }
      if (!paramzje.E().p())
      {
        arrayOfzo2[0] = arrayOfzo1[0];
        arrayOfzo2[1] = arrayOfzo1[1];
        arrayOfzo2[2] = arrayOfzo1[3];
        arrayOfzo2[3] = arrayOfzo1[2];
        arrayOfzo2[4] = arrayOfzo1[7];
        arrayOfzo2[5] = arrayOfzo1[6];
      }
      else
      {
        arrayOfzo2[0] = arrayOfzo1[1];
        arrayOfzo2[1] = arrayOfzo1[0];
        arrayOfzo2[2] = arrayOfzo1[2];
        arrayOfzo2[3] = arrayOfzo1[3];
        arrayOfzo2[4] = arrayOfzo1[6];
        arrayOfzo2[5] = arrayOfzo1[7];
      }
      a(paramzr, paramzje.E(), arrayOfzo2);
      if (!paramzje.e().p())
      {
        arrayOfzo2[0] = arrayOfzo1[0];
        arrayOfzo2[1] = arrayOfzo1[4];
        arrayOfzo2[2] = arrayOfzo1[3];
        arrayOfzo2[3] = arrayOfzo1[7];
        arrayOfzo2[4] = arrayOfzo1[2];
        arrayOfzo2[5] = arrayOfzo1[6];
      }
      else
      {
        arrayOfzo2[0] = arrayOfzo1[4];
        arrayOfzo2[1] = arrayOfzo1[0];
        arrayOfzo2[2] = arrayOfzo1[7];
        arrayOfzo2[3] = arrayOfzo1[3];
        arrayOfzo2[4] = arrayOfzo1[6];
        arrayOfzo2[5] = arrayOfzo1[2];
      }
      a(paramzr, paramzje.e(), arrayOfzo2);
      a(paramzr, paramzje, arrayOfzo1, paramBoolean);
      localObject5 = zanv.a(paramzje.N().c());
      try
      {
        paramzr.a((zs)localObject5, arrayOfzo1[0], arrayOfzo1[1]);
        paramzr.a((zs)localObject5, arrayOfzo1[1], arrayOfzo1[2]);
        paramzr.a((zs)localObject5, arrayOfzo1[2], arrayOfzo1[3]);
        paramzr.a((zs)localObject5, arrayOfzo1[0], arrayOfzo1[3]);
        paramzr.a((zs)localObject5, arrayOfzo1[2], arrayOfzo1[6]);
        paramzr.a((zs)localObject5, arrayOfzo1[6], arrayOfzo1[7]);
        paramzr.a((zs)localObject5, arrayOfzo1[7], arrayOfzo1[3]);
      }
      finally
      {
        if (localObject5 != null) {
          ((zs)localObject5).s();
        }
      }
    }
    else
    {
      if (paramzje.p() > 0)
      {
        localzq = a(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[3] });
        localObject1 = zbd.a(paramzje.s().c(), localzq);
        try
        {
          paramzr.a((zc)localObject1, new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[3] });
        }
        finally
        {
          if (localObject1 != null) {
            ((zc)localObject1).f();
          }
        }
      }
      localObject1 = zanv.a(paramzje.N().c());
      try
      {
        switch (j)
        {
        case 0: 
        case 1: 
        case 8: 
          localObject3 = new ze();
          ((ze)localObject3).b(new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
          localObject5 = zbd.a(paramzje.N().d(), zn.a((ze)localObject3));
          try
          {
            paramzr.a((zc)localObject5, new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
          }
          finally
          {
            if (localObject5 != null) {
              ((zc)localObject5).f();
            }
          }
          ze localze = new ze();
          localze.b(new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
          zc localzc1 = zbd.a(paramzje.N().d(), zn.a(localze));
          try
          {
            paramzr.a(localzc1, new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
          }
          finally
          {
            if (localzc1 != null) {
              localzc1.f();
            }
          }
          if (!paramzje.E().p())
          {
            arrayOfzo2[0] = arrayOfzo1[0];
            arrayOfzo2[1] = arrayOfzo1[4];
            arrayOfzo2[2] = arrayOfzo1[3];
            arrayOfzo2[3] = arrayOfzo1[7];
            arrayOfzo2[4] = arrayOfzo1[2];
            arrayOfzo2[5] = arrayOfzo1[6];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[4];
            arrayOfzo2[1] = arrayOfzo1[0];
            arrayOfzo2[2] = arrayOfzo1[7];
            arrayOfzo2[3] = arrayOfzo1[3];
            arrayOfzo2[4] = arrayOfzo1[6];
            arrayOfzo2[5] = arrayOfzo1[2];
          }
          a(paramzr, paramzje.E(), arrayOfzo2);
          if (!paramzje.e().p())
          {
            arrayOfzo2[0] = arrayOfzo1[0];
            arrayOfzo2[1] = arrayOfzo1[1];
            arrayOfzo2[2] = arrayOfzo1[3];
            arrayOfzo2[3] = arrayOfzo1[2];
            arrayOfzo2[4] = arrayOfzo1[7];
            arrayOfzo2[5] = arrayOfzo1[6];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[1];
            arrayOfzo2[1] = arrayOfzo1[0];
            arrayOfzo2[2] = arrayOfzo1[2];
            arrayOfzo2[3] = arrayOfzo1[3];
            arrayOfzo2[4] = arrayOfzo1[6];
            arrayOfzo2[5] = arrayOfzo1[7];
          }
          a(paramzr, paramzje.e(), arrayOfzo2);
          if (!paramzje.I().p())
          {
            arrayOfzo2[0] = arrayOfzo1[1];
            arrayOfzo2[1] = arrayOfzo1[2];
            arrayOfzo2[2] = arrayOfzo1[0];
            arrayOfzo2[3] = arrayOfzo1[3];
            arrayOfzo2[4] = arrayOfzo1[4];
            arrayOfzo2[5] = arrayOfzo1[7];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[2];
            arrayOfzo2[1] = arrayOfzo1[1];
            arrayOfzo2[2] = arrayOfzo1[3];
            arrayOfzo2[3] = arrayOfzo1[0];
            arrayOfzo2[4] = arrayOfzo1[7];
            arrayOfzo2[5] = arrayOfzo1[4];
          }
          a(paramzr, paramzje.I(), arrayOfzo2);
          a(paramzr, paramzje, arrayOfzo1, paramBoolean);
          paramzr.a((zs)localObject1, arrayOfzo1[0], arrayOfzo1[4]);
          paramzr.a((zs)localObject1, arrayOfzo1[3], arrayOfzo1[7]);
          paramzr.a((zs)localObject1, arrayOfzo1[2], arrayOfzo1[6]);
          paramzr.a((zs)localObject1, arrayOfzo1[0], arrayOfzo1[3]);
          paramzr.a((zs)localObject1, arrayOfzo1[3], arrayOfzo1[2]);
          paramzr.a((zs)localObject1, arrayOfzo1[7], arrayOfzo1[4]);
          paramzr.a((zs)localObject1, arrayOfzo1[7], arrayOfzo1[6]);
          break;
        case 2: 
        case 3: 
          localzq = a(new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
          zc localzc2 = zbd.a(paramzje.N().d(), localzq);
          try
          {
            paramzr.a(localzc2, new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
          }
          finally
          {
            if (localzc2 != null) {
              localzc2.f();
            }
          }
          localzq = a(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[5], arrayOfzo1[4] });
          zc localzc3 = zbd.a(paramzje.N().d(), localzq);
          try
          {
            paramzr.a(localzc3, new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[5], arrayOfzo1[4] });
          }
          finally
          {
            if (localzc3 != null) {
              localzc3.f();
            }
          }
          if (!paramzje.E().p())
          {
            arrayOfzo2[0] = arrayOfzo1[1];
            arrayOfzo2[1] = arrayOfzo1[5];
            arrayOfzo2[2] = arrayOfzo1[0];
            arrayOfzo2[3] = arrayOfzo1[4];
            arrayOfzo2[4] = arrayOfzo1[3];
            arrayOfzo2[5] = arrayOfzo1[7];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[5];
            arrayOfzo2[1] = arrayOfzo1[1];
            arrayOfzo2[2] = arrayOfzo1[4];
            arrayOfzo2[3] = arrayOfzo1[0];
            arrayOfzo2[4] = arrayOfzo1[7];
            arrayOfzo2[5] = arrayOfzo1[3];
          }
          a(paramzr, paramzje.E(), arrayOfzo2);
          if (!paramzje.e().p())
          {
            arrayOfzo2[0] = arrayOfzo1[3];
            arrayOfzo2[1] = arrayOfzo1[2];
            arrayOfzo2[2] = arrayOfzo1[0];
            arrayOfzo2[3] = arrayOfzo1[1];
            arrayOfzo2[4] = arrayOfzo1[4];
            arrayOfzo2[5] = arrayOfzo1[5];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[2];
            arrayOfzo2[1] = arrayOfzo1[3];
            arrayOfzo2[2] = arrayOfzo1[1];
            arrayOfzo2[3] = arrayOfzo1[0];
            arrayOfzo2[4] = arrayOfzo1[5];
            arrayOfzo2[5] = arrayOfzo1[4];
          }
          a(paramzr, paramzje.e(), arrayOfzo2);
          if (!paramzje.I().p())
          {
            arrayOfzo2[0] = arrayOfzo1[1];
            arrayOfzo2[1] = arrayOfzo1[2];
            arrayOfzo2[2] = arrayOfzo1[0];
            arrayOfzo2[3] = arrayOfzo1[3];
            arrayOfzo2[4] = arrayOfzo1[4];
            arrayOfzo2[5] = arrayOfzo1[7];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[2];
            arrayOfzo2[1] = arrayOfzo1[1];
            arrayOfzo2[2] = arrayOfzo1[3];
            arrayOfzo2[3] = arrayOfzo1[0];
            arrayOfzo2[4] = arrayOfzo1[7];
            arrayOfzo2[5] = arrayOfzo1[4];
          }
          a(paramzr, paramzje.I(), arrayOfzo2);
          a(paramzr, paramzje, arrayOfzo1, paramBoolean);
          paramzr.a((zs)localObject1, arrayOfzo1[0], arrayOfzo1[4]);
          paramzr.a((zs)localObject1, arrayOfzo1[3], arrayOfzo1[7]);
          paramzr.a((zs)localObject1, arrayOfzo1[1], arrayOfzo1[5]);
          paramzr.a((zs)localObject1, arrayOfzo1[0], arrayOfzo1[3]);
          paramzr.a((zs)localObject1, arrayOfzo1[0], arrayOfzo1[1]);
          paramzr.a((zs)localObject1, arrayOfzo1[7], arrayOfzo1[4]);
          paramzr.a((zs)localObject1, arrayOfzo1[4], arrayOfzo1[5]);
          break;
        case 4: 
        case 5: 
          localzq = a(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[5], arrayOfzo1[4] });
          zc localzc4 = zbd.a(paramzje.N().d(), localzq);
          try
          {
            paramzr.a(localzc4, new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[5], arrayOfzo1[4] });
          }
          finally
          {
            if (localzc4 != null) {
              localzc4.f();
            }
          }
          localzq = a(new zo[] { arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[6], arrayOfzo1[5] });
          zc localzc5 = zbd.a(paramzje.N().d(), localzq);
          try
          {
            paramzr.a(localzc5, new zo[] { arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[6], arrayOfzo1[5] });
          }
          finally
          {
            if (localzc5 != null) {
              localzc5.f();
            }
          }
          if (!paramzje.E().p())
          {
            arrayOfzo2[0] = arrayOfzo1[0];
            arrayOfzo2[1] = arrayOfzo1[4];
            arrayOfzo2[2] = arrayOfzo1[1];
            arrayOfzo2[3] = arrayOfzo1[5];
            arrayOfzo2[4] = arrayOfzo1[2];
            arrayOfzo2[5] = arrayOfzo1[6];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[4];
            arrayOfzo2[1] = arrayOfzo1[0];
            arrayOfzo2[2] = arrayOfzo1[5];
            arrayOfzo2[3] = arrayOfzo1[1];
            arrayOfzo2[4] = arrayOfzo1[6];
            arrayOfzo2[5] = arrayOfzo1[2];
          }
          a(paramzr, paramzje.E(), arrayOfzo2);
          if (!paramzje.e().p())
          {
            arrayOfzo2[0] = arrayOfzo1[3];
            arrayOfzo2[1] = arrayOfzo1[2];
            arrayOfzo2[2] = arrayOfzo1[0];
            arrayOfzo2[3] = arrayOfzo1[1];
            arrayOfzo2[4] = arrayOfzo1[4];
            arrayOfzo2[5] = arrayOfzo1[5];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[2];
            arrayOfzo2[1] = arrayOfzo1[3];
            arrayOfzo2[2] = arrayOfzo1[1];
            arrayOfzo2[3] = arrayOfzo1[0];
            arrayOfzo2[4] = arrayOfzo1[5];
            arrayOfzo2[5] = arrayOfzo1[4];
          }
          a(paramzr, paramzje.e(), arrayOfzo2);
          if (!paramzje.I().p())
          {
            arrayOfzo2[0] = arrayOfzo1[3];
            arrayOfzo2[1] = arrayOfzo1[0];
            arrayOfzo2[2] = arrayOfzo1[2];
            arrayOfzo2[3] = arrayOfzo1[1];
            arrayOfzo2[4] = arrayOfzo1[6];
            arrayOfzo2[5] = arrayOfzo1[5];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[0];
            arrayOfzo2[1] = arrayOfzo1[3];
            arrayOfzo2[2] = arrayOfzo1[1];
            arrayOfzo2[3] = arrayOfzo1[2];
            arrayOfzo2[4] = arrayOfzo1[5];
            arrayOfzo2[5] = arrayOfzo1[6];
          }
          a(paramzr, paramzje.I(), arrayOfzo2);
          a(paramzr, paramzje, arrayOfzo1, paramBoolean);
          paramzr.a((zs)localObject1, arrayOfzo1[0], arrayOfzo1[4]);
          paramzr.a((zs)localObject1, arrayOfzo1[1], arrayOfzo1[5]);
          paramzr.a((zs)localObject1, arrayOfzo1[2], arrayOfzo1[6]);
          paramzr.a((zs)localObject1, arrayOfzo1[0], arrayOfzo1[1]);
          paramzr.a((zs)localObject1, arrayOfzo1[1], arrayOfzo1[2]);
          paramzr.a((zs)localObject1, arrayOfzo1[4], arrayOfzo1[5]);
          paramzr.a((zs)localObject1, arrayOfzo1[5], arrayOfzo1[6]);
          break;
        case 6: 
        case 7: 
          localzq = a(new zo[] { arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[6], arrayOfzo1[5] });
          zc localzc6 = zbd.a(paramzje.N().d(), localzq);
          try
          {
            paramzr.a(localzc6, new zo[] { arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[6], arrayOfzo1[5] });
          }
          finally
          {
            if (localzc6 != null) {
              localzc6.f();
            }
          }
          localzq = a(new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
          zc localzc7 = zbd.a(paramzje.N().d(), localzq);
          try
          {
            paramzr.a(localzc7, new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
          }
          finally
          {
            if (localzc7 != null) {
              localzc7.f();
            }
          }
          if (!paramzje.E().p())
          {
            arrayOfzo2[0] = arrayOfzo1[3];
            arrayOfzo2[1] = arrayOfzo1[7];
            arrayOfzo2[2] = arrayOfzo1[2];
            arrayOfzo2[3] = arrayOfzo1[6];
            arrayOfzo2[4] = arrayOfzo1[1];
            arrayOfzo2[5] = arrayOfzo1[5];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[7];
            arrayOfzo2[1] = arrayOfzo1[3];
            arrayOfzo2[2] = arrayOfzo1[6];
            arrayOfzo2[3] = arrayOfzo1[2];
            arrayOfzo2[4] = arrayOfzo1[5];
            arrayOfzo2[5] = arrayOfzo1[1];
          }
          a(paramzr, paramzje.E(), arrayOfzo2);
          if (!paramzje.e().p())
          {
            arrayOfzo2[0] = arrayOfzo1[0];
            arrayOfzo2[1] = arrayOfzo1[1];
            arrayOfzo2[2] = arrayOfzo1[3];
            arrayOfzo2[3] = arrayOfzo1[2];
            arrayOfzo2[4] = arrayOfzo1[7];
            arrayOfzo2[5] = arrayOfzo1[6];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[1];
            arrayOfzo2[1] = arrayOfzo1[0];
            arrayOfzo2[2] = arrayOfzo1[2];
            arrayOfzo2[3] = arrayOfzo1[3];
            arrayOfzo2[4] = arrayOfzo1[6];
            arrayOfzo2[5] = arrayOfzo1[7];
          }
          a(paramzr, paramzje.e(), arrayOfzo2);
          if (!paramzje.I().p())
          {
            arrayOfzo2[0] = arrayOfzo1[3];
            arrayOfzo2[1] = arrayOfzo1[0];
            arrayOfzo2[2] = arrayOfzo1[2];
            arrayOfzo2[3] = arrayOfzo1[1];
            arrayOfzo2[4] = arrayOfzo1[6];
            arrayOfzo2[5] = arrayOfzo1[5];
          }
          else
          {
            arrayOfzo2[0] = arrayOfzo1[0];
            arrayOfzo2[1] = arrayOfzo1[3];
            arrayOfzo2[2] = arrayOfzo1[1];
            arrayOfzo2[3] = arrayOfzo1[2];
            arrayOfzo2[4] = arrayOfzo1[5];
            arrayOfzo2[5] = arrayOfzo1[6];
          }
          a(paramzr, paramzje.I(), arrayOfzo2);
          a(paramzr, paramzje, arrayOfzo1, paramBoolean);
          paramzr.a((zs)localObject1, arrayOfzo1[3], arrayOfzo1[7]);
          paramzr.a((zs)localObject1, arrayOfzo1[1], arrayOfzo1[5]);
          paramzr.a((zs)localObject1, arrayOfzo1[2], arrayOfzo1[6]);
          paramzr.a((zs)localObject1, arrayOfzo1[2], arrayOfzo1[3]);
          paramzr.a((zs)localObject1, arrayOfzo1[1], arrayOfzo1[2]);
          paramzr.a((zs)localObject1, arrayOfzo1[6], arrayOfzo1[7]);
          paramzr.a((zs)localObject1, arrayOfzo1[5], arrayOfzo1[6]);
        }
      }
      finally
      {
        if (localObject1 != null) {
          ((zs)localObject1).s();
        }
      }
    }
    int k = a(paramzje.E(), paramBoolean);
    if (k != 0)
    {
      localObject3 = zja.c(paramzje);
      if (paramBoolean) {
        zanv.a(paramzr, localObject3[2].d() + k, localObject3[2].e(), localObject3[2].d() + k, localObject3[2].e() - paramzje.N().i(), paramzje.e().g());
      } else {
        zanv.a(paramzr, localObject3[2].d(), localObject3[2].e() - k, localObject3[3].d(), localObject3[3].e() - k, paramzje.e().g());
      }
    }
  }
  
  private static void a(zr paramzr, zje paramzje, zo[] paramArrayOfzo, boolean paramBoolean)
  {
    zs localzs = zanv.a(paramzje.s().a());
    try
    {
      if (paramzje.p() > 0) {
        if (paramBoolean)
        {
          paramzr.a(localzs, paramArrayOfzo[0], paramArrayOfzo[3]);
          paramzr.a(localzs, paramArrayOfzo[3], paramArrayOfzo[7]);
          paramzr.a(localzs, paramArrayOfzo[7], paramArrayOfzo[4]);
          paramzr.a(localzs, paramArrayOfzo[4], paramArrayOfzo[0]);
        }
        else
        {
          paramzr.a(localzs, paramArrayOfzo[0], paramArrayOfzo[1]);
          paramzr.a(localzs, paramArrayOfzo[1], paramArrayOfzo[2]);
          paramzr.a(localzs, paramArrayOfzo[2], paramArrayOfzo[3]);
          paramzr.a(localzs, paramArrayOfzo[3], paramArrayOfzo[0]);
        }
      }
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  private static void a(zr paramzr, zbs paramzbs, zo[] paramArrayOfzo)
  {
    zje localzje = paramzbs.c();
    int i = paramzbs.j();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    double d4 = paramzbs.n() ? zbxz.e(paramzbs.x()) : paramzbs.x();
    double d5 = paramzbs.n() ? zbxz.e(paramzbs.B()) : paramzbs.B();
    double d1;
    if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
      d1 = zbu.a(i, (int)d2, (int)d3, localzje.U()) + 1;
    } else {
      d1 = d2 - d3;
    }
    double d6 = (paramArrayOfzo[1].d() - paramArrayOfzo[0].d()) / d1;
    double d7 = (paramArrayOfzo[1].e() - paramArrayOfzo[0].e()) / d1;
    double d8;
    zo localzo1;
    zo localzo2;
    zo localzo3;
    double d9;
    if ((paramzbs.s().e()) && (d4 > 0.0D))
    {
      if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
        d8 = zbu.a(paramzbs.j(), paramzbs.y(), (int)d4, (int)d3, localzje.U());
      } else {
        d8 = d3 + d4;
      }
      localzo1 = zbxz.a(paramArrayOfzo[0]);
      localzo2 = zbxz.a(paramArrayOfzo[2]);
      localzo3 = zbxz.a(paramArrayOfzo[4]);
      while ((d8 <= d2) || ((paramzbs.d() == 0) && (paramzbs.k() == 2) && (d8 <= d2)))
      {
        if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
          d9 = zbu.a(i, (int)d8, (int)d3, localzje.U());
        } else {
          d9 = d8 - d3;
        }
        localzo1.a(paramArrayOfzo[0].d() + (float)(d6 * d9));
        localzo1.b(paramArrayOfzo[0].e() + (float)(d7 * d9));
        localzo2.a(paramArrayOfzo[2].d() + (float)(d6 * d9));
        localzo2.b(paramArrayOfzo[2].e() + (float)(d7 * d9));
        localzo3.a(paramArrayOfzo[4].d() + (float)(d6 * d9));
        localzo3.b(paramArrayOfzo[4].e() + (float)(d7 * d9));
        zanv.a(paramzr, localzo1, localzo2, paramzbs.s());
        zanv.a(paramzr, localzo2, localzo3, paramzbs.s());
        if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
          d8 = zbu.a(paramzbs.j(), paramzbs.y(), (int)d4, (int)d8, localzje.U());
        } else {
          d8 += d4;
        }
      }
    }
    if ((paramzbs.u().e()) && (d5 > 0.0D))
    {
      if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
        d8 = zbu.a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), (int)d3, localzje.U());
      } else {
        d8 = d3 + d5;
      }
      localzo1 = zbxz.a(paramArrayOfzo[0]);
      localzo2 = zbxz.a(paramArrayOfzo[2]);
      localzo3 = zbxz.a(paramArrayOfzo[4]);
      while ((d8 <= d2) || ((paramzbs.d() == 0) && (paramzbs.k() == 2) && (d8 <= d2)))
      {
        if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
          d9 = zbu.a(i, (int)d8, (int)d3, localzje.U());
        } else {
          d9 = d8 - d3;
        }
        localzo1.a(paramArrayOfzo[0].d() + (float)(d6 * d9));
        localzo1.b(paramArrayOfzo[0].e() + (float)(d7 * d9));
        localzo2.a(paramArrayOfzo[2].d() + (float)(d6 * d9));
        localzo2.b(paramArrayOfzo[2].e() + (float)(d7 * d9));
        localzo3.a(paramArrayOfzo[4].d() + (float)(d6 * d9));
        localzo3.b(paramArrayOfzo[4].e() + (float)(d7 * d9));
        zanv.a(paramzr, localzo1, localzo2, paramzbs.u());
        zanv.a(paramzr, localzo2, localzo3, paramzbs.u());
        if ((paramzbs.d() == 0) && (paramzbs.k() == 2)) {
          d8 = zbu.a(paramzbs.j(), paramzbs.C(), (int)paramzbs.B(), (int)d8, paramzbs.c().U());
        } else {
          d8 += paramzbs.B();
        }
      }
    }
  }
  
  private static int a(zbs paramzbs, boolean paramBoolean)
  {
    zje localzje = paramzbs.c();
    double d1 = paramzbs.n() ? zbxz.e(paramzbs.l()) : paramzbs.l();
    double d2 = paramzbs.n() ? zbxz.e(paramzbs.z()) : paramzbs.z();
    double d3 = paramzbs.n() ? zbxz.e(paramzbs.D()) : paramzbs.D();
    if (paramzbs.p()) {
      d1 = d2 - d1;
    } else {
      d1 -= d3;
    }
    float f = localzje.N().i();
    if (paramBoolean) {
      f = localzje.N().g();
    }
    int i = (int)(d1 / (d2 - d3) * f);
    return i;
  }
  
  private static boolean b(zje paramzje)
  {
    switch (paramzje.M())
    {
    case 45: 
    case 48: 
      return true;
    }
    return false;
  }
  
  static boolean a(zje paramzje)
  {
    switch (paramzje.M())
    {
    case 3: 
    case 17: 
    case 27: 
    case 34: 
    case 43: 
    case 56: 
      return true;
    }
    return false;
  }
  
  private static zq a(zo[] paramArrayOfzo)
  {
    float f1 = 2.14748365E9F;
    float f2 = 0.0F;
    float f3 = 2.14748365E9F;
    float f4 = 0.0F;
    for (int i = 0; i < paramArrayOfzo.length; i++)
    {
      zo localzo = paramArrayOfzo[i];
      if (localzo.d() < f3) {
        f3 = localzo.d();
      }
      if (localzo.d() > f4) {
        f4 = localzo.d();
      }
      if (localzo.e() < f1) {
        f1 = localzo.e();
      }
      if (localzo.e() > f2) {
        f2 = localzo.e();
      }
    }
    return new zq((int)f3, (int)f1, (int)(f4 - f3), (int)(f2 - f1));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */