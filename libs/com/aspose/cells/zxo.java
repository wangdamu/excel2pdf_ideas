package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;

final class zxo
{
  static void a(zjf paramzjf, zp paramzp, boolean paramBoolean)
  {
    if (b(paramzjf)) {
      return;
    }
    double d1 = paramzjf.m() / 100.0D;
    double d2 = paramzjf.n() / 100.0D;
    double d3 = paramzjf.o() / 100.0D;
    int i = 0;
    int j = paramzjf.z().h();
    int k = paramzjf.z().getCount();
    boolean bool = a(paramzjf.N());
    if (bool) {
      k = 1;
    }
    if (paramzjf.e().k() == 2)
    {
      if (b(paramzjf.N()))
      {
        if ((paramzjf.e().f()) || (paramzjf.u()))
        {
          i = zbv.a(paramzjf.e().j(), (int)paramzjf.e().z(), (int)paramzjf.e().D(), paramzjf.U()) + 1;
        }
        else
        {
          i = zbv.a(paramzjf.e().j(), (int)paramzjf.e().z(), (int)paramzjf.e().D(), paramzjf.U());
          if (i == 0) {
            i = 1;
          }
        }
      }
      else {
        i = zbv.a(paramzjf.e().j(), (int)paramzjf.e().z(), (int)paramzjf.e().D(), paramzjf.U()) + 1;
      }
    }
    else if (b(paramzjf.N()))
    {
      if ((paramzjf.e().f()) || (paramzjf.u()))
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
    if (!a(paramzjf)) {
      d4 = i * (k + d3) / (d1 + d2 * d1);
    } else {
      d4 = i / (k * d1);
    }
    double d5 = Math.abs(Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D));
    int m = paramzjf.E() % 90;
    if (m >= 45) {
      m = 90 - m;
    }
    double d6 = Math.sin(m * 3.141592653589793D / 180.0D);
    int n = paramzjf.E() / 45;
    if (paramzjf.r())
    {
      float f1 = 1.0F;
      if ((paramzjf.z().getCount() == 1) && ((paramzjf.N() == 17) || (paramzjf.N() == 27) || (paramzjf.N() == 34) || (paramzjf.N() == 56))) {
        f1 = 0.67F;
      }
      if ((paramzjf.N() == 3) || (paramzjf.N() == 5) || (paramzjf.N() == 4)) {
        f1 = 0.65F;
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
        paramzjf.S().c((float)d8);
        paramzjf.S().e((float)d10);
      }
      else
      {
        paramzjf.S().c((float)d12);
        paramzjf.S().e((float)d14);
      }
      paramzjf.S().e(paramzjf.S().i() * f1);
      paramzjf.S().d(!paramBoolean ? (float)(paramzjf.S().g() / d4) : (float)(paramzjf.S().i() / d4));
      paramzjf.S().a(paramzp.c() + (paramzp.e() - paramzjf.S().g()) / 2.0F);
      paramzjf.S().b(paramzp.d() + paramzp.f() - (paramzp.f() - paramzjf.S().i()) / 2.0F);
    }
    else
    {
      double d7 = paramzjf.q() / 100.0D;
      float f2;
      if ((paramzjf.z().getCount() == 1) && ((paramzjf.N() == 17) || (paramzjf.N() == 27) || (paramzjf.N() == 34) || (paramzjf.N() == 56)))
      {
        f2 = 0.67F;
        d7 *= f2;
      }
      if ((paramzjf.N() == 3) || (paramzjf.N() == 5) || (paramzjf.N() == 4))
      {
        f2 = 0.65F;
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
        paramzjf.S().c((float)d9);
        paramzjf.S().e((float)d11);
      }
      else
      {
        paramzjf.S().c((float)d13);
        paramzjf.S().e((float)d15);
      }
      paramzjf.S().d(!paramBoolean ? (float)(paramzjf.S().g() / d4) : (float)(paramzjf.S().i() / d4));
      paramzjf.S().a(paramzp.c() + (paramzp.e() - paramzjf.S().g()) / 2.0F);
      paramzjf.S().b(paramzp.j() - (paramzp.f() - paramzjf.S().i()) / 2.0F);
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
  
  static void a(zr paramzr, zjf paramzjf, boolean paramBoolean)
    throws Exception
  {
    if ((b(paramzjf)) || (paramzjf.B().E())) {
      return;
    }
    float f1 = paramzjf.S().j();
    float f2 = paramzjf.S().f();
    zo localzo = new zo(f1, f2);
    int i = paramzjf.E() % 90;
    if (i >= 45) {
      i = 90 - i;
    }
    int j = paramzjf.E() / 45;
    float f3;
    float f4;
    switch (j)
    {
    case 0: 
    case 3: 
    case 4: 
    case 7: 
    case 8: 
      f3 = paramzjf.S().g();
      f4 = paramzjf.S().h();
      break;
    case 1: 
    case 2: 
    case 5: 
    case 6: 
    default: 
      f3 = paramzjf.S().h();
      f4 = paramzjf.S().g();
    }
    float f5 = f4 * (float)Math.sin(i * 3.141592653589793D / 180.0D);
    float f6 = f4 * (float)Math.sin(paramzjf.p() * 3.141592653589793D / 180.0D);
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
    arrayOfzo1[4].b(arrayOfzo1[0].e() - paramzjf.S().i());
    arrayOfzo1[5].b(arrayOfzo1[1].e() - paramzjf.S().i());
    arrayOfzo1[6].b(arrayOfzo1[2].e() - paramzjf.S().i());
    arrayOfzo1[7].b(arrayOfzo1[3].e() - paramzjf.S().i());
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[0].d(), arrayOfzo1[0].e()));
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[1].d(), arrayOfzo1[1].e()));
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[2].d(), arrayOfzo1[2].e()));
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[3].d(), arrayOfzo1[3].e()));
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[4].d(), arrayOfzo1[4].e()));
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[5].d(), arrayOfzo1[5].e()));
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[6].d(), arrayOfzo1[6].e()));
    zf.a(paramzjf.S().a, new zo(arrayOfzo1[7].d(), arrayOfzo1[7].e()));
    zo[] arrayOfzo2 = new zo[6];
    zbxz.a(arrayOfzo2);
    float f7 = 0.7F;
    ze localze1;
    Object localObject;
    if (paramBoolean)
    {
      if (paramzjf.p() >= 0)
      {
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
        paramzjf.s().c().a(localze1, f7);
      }
      localze1 = new ze();
      localze1.b(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[3] });
      paramzjf.T().d().a(localze1, f7);
      localObject = new ze();
      ((ze)localObject).b(new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
      paramzjf.W().d().a((ze)localObject);
      if (!paramzjf.G().p())
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
      a(paramzr, paramzjf.G(), arrayOfzo2);
      if (!paramzjf.e().p())
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
      a(paramzr, paramzjf.e(), arrayOfzo2);
      a(paramzr, paramzjf, arrayOfzo1, paramBoolean);
      paramzjf.W().c().a((ze)localObject);
      paramzjf.T().c().a(localze1);
    }
    else
    {
      localze1 = null;
      localObject = null;
      if (paramzjf.p() > 0)
      {
        ze localze2 = new ze();
        localze2.b(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[3] });
        paramzjf.s().c().a(localze2, f7);
      }
      switch (j)
      {
      case 0: 
      case 1: 
      case 8: 
        localObject = new ze();
        ((ze)localObject).b(new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
        paramzjf.T().d().a((ze)localObject, f7);
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
        paramzjf.W().d().a(localze1);
        if (!paramzjf.G().p())
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
        a(paramzr, paramzjf.G(), arrayOfzo2);
        if (!paramzjf.e().p())
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
        a(paramzr, paramzjf.e(), arrayOfzo2);
        if (!paramzjf.K().p())
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
        a(paramzr, paramzjf.K(), arrayOfzo2);
        a(paramzr, paramzjf, arrayOfzo1, paramBoolean);
        paramzjf.W().c().a(localze1);
        paramzjf.T().c().a((ze)localObject);
        break;
      case 2: 
      case 3: 
        localObject = new ze();
        ((ze)localObject).b(new zo[] { arrayOfzo1[0], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[4] });
        paramzjf.T().d().a((ze)localObject, f7);
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[5], arrayOfzo1[4] });
        paramzjf.W().d().a(localze1);
        if (!paramzjf.G().p())
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
        a(paramzr, paramzjf.G(), arrayOfzo2);
        if (!paramzjf.e().p())
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
        a(paramzr, paramzjf.e(), arrayOfzo2);
        if (!paramzjf.K().p())
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
        a(paramzr, paramzjf.K(), arrayOfzo2);
        a(paramzr, paramzjf, arrayOfzo1, paramBoolean);
        paramzjf.W().c().a(localze1);
        paramzjf.T().c().a((ze)localObject);
        break;
      case 4: 
      case 5: 
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo1[0], arrayOfzo1[1], arrayOfzo1[5], arrayOfzo1[4] });
        paramzjf.W().d().a(localze1);
        localObject = new ze();
        ((ze)localObject).b(new zo[] { arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[6], arrayOfzo1[5] });
        paramzjf.T().d().a((ze)localObject, f7);
        if (!paramzjf.G().p())
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
        a(paramzr, paramzjf.G(), arrayOfzo2);
        if (!paramzjf.e().p())
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
        a(paramzr, paramzjf.e(), arrayOfzo2);
        if (!paramzjf.K().p())
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
        a(paramzr, paramzjf.K(), arrayOfzo2);
        a(paramzr, paramzjf, arrayOfzo1, paramBoolean);
        paramzjf.W().c().a(localze1);
        paramzjf.T().c().a((ze)localObject);
        break;
      case 6: 
      case 7: 
        localObject = new ze();
        ((ze)localObject).b(new zo[] { arrayOfzo1[1], arrayOfzo1[2], arrayOfzo1[6], arrayOfzo1[5] });
        paramzjf.T().d().a((ze)localObject, f7);
        localze1 = new ze();
        localze1.b(new zo[] { arrayOfzo1[2], arrayOfzo1[3], arrayOfzo1[7], arrayOfzo1[6] });
        paramzjf.W().d().a(localze1);
        if (!paramzjf.G().p())
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
        a(paramzr, paramzjf.G(), arrayOfzo2);
        if (!paramzjf.e().p())
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
        a(paramzr, paramzjf.e(), arrayOfzo2);
        if (!paramzjf.K().p())
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
        a(paramzr, paramzjf.K(), arrayOfzo2);
        a(paramzr, paramzjf, arrayOfzo1, paramBoolean);
        paramzjf.W().c().a(localze1);
        paramzjf.T().c().a((ze)localObject);
      }
    }
    int k = a(paramzjf.G(), paramBoolean);
    if (k != 0)
    {
      localObject = zjb.c(paramzjf);
      if (paramBoolean) {
        paramzjf.e().m().a(localObject[2].d() + k, localObject[2].e(), localObject[2].d() + k, localObject[2].e() - paramzjf.S().i());
      } else {
        paramzjf.e().m().a(localObject[2].d(), localObject[2].e() - k, localObject[3].d(), localObject[3].e() - k);
      }
    }
  }
  
  private static int a(zbt paramzbt, boolean paramBoolean)
  {
    zjf localzjf = paramzbt.e();
    double d1 = paramzbt.n() ? paramzbt.g(paramzbt.l()) : paramzbt.l();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    if (paramzbt.p()) {
      d1 = d2 - d1;
    } else {
      d1 -= d3;
    }
    float f = localzjf.S().i();
    if (paramBoolean) {
      f = localzjf.S().g();
    }
    int i = (int)(d1 / (d2 - d3) * f);
    return i;
  }
  
  private static void a(zr paramzr, zjf paramzjf, zo[] paramArrayOfzo, boolean paramBoolean)
  {
    if (paramzjf.p() > 0)
    {
      ze localze = new ze();
      if (paramBoolean)
      {
        localze.a(paramArrayOfzo[0], paramArrayOfzo[3]);
        localze.a(paramArrayOfzo[3], paramArrayOfzo[7]);
        localze.a(paramArrayOfzo[7], paramArrayOfzo[4]);
        localze.a(paramArrayOfzo[4], paramArrayOfzo[0]);
      }
      else
      {
        localze.a(paramArrayOfzo[0], paramArrayOfzo[1]);
        localze.a(paramArrayOfzo[1], paramArrayOfzo[2]);
        localze.a(paramArrayOfzo[2], paramArrayOfzo[3]);
        localze.a(paramArrayOfzo[3], paramArrayOfzo[0]);
      }
      paramzjf.s().a().a(localze);
    }
  }
  
  private static void a(zr paramzr, zbt paramzbt, zo[] paramArrayOfzo)
  {
    zjf localzjf = paramzbt.e();
    int i = paramzbt.j();
    double d2 = paramzbt.n() ? paramzbt.g(paramzbt.z()) : paramzbt.z();
    double d3 = paramzbt.n() ? paramzbt.g(paramzbt.D()) : paramzbt.D();
    double d4 = paramzbt.n() ? paramzbt.g(paramzbt.x()) : paramzbt.x();
    double d5 = paramzbt.n() ? paramzbt.g(paramzbt.B()) : paramzbt.B();
    double d1;
    if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
      d1 = zbv.a(i, (int)d2, (int)d3, localzjf.U()) + 1;
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
    if ((paramzbt.w().h()) && (d4 > 0.0D))
    {
      if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
        d8 = zbv.a(paramzbt.j(), paramzbt.y(), (int)d4, (int)d3, localzjf.U());
      } else {
        d8 = d3;
      }
      localzo1 = zbxz.a(paramArrayOfzo[0]);
      localzo2 = zbxz.a(paramArrayOfzo[2]);
      localzo3 = zbxz.a(paramArrayOfzo[4]);
      while ((d8 <= d2) || ((paramzbt.g() == 0) && (paramzbt.k() == 2) && (d8 <= d2)))
      {
        if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
          d9 = zbv.a(i, (int)d8, (int)d3, localzjf.U());
        } else {
          d9 = d8 - d3;
        }
        localzo1.a(paramArrayOfzo[0].d() + (float)(d6 * d9));
        localzo1.b(paramArrayOfzo[0].e() + (float)(d7 * d9));
        localzo2.a(paramArrayOfzo[2].d() + (float)(d6 * d9));
        localzo2.b(paramArrayOfzo[2].e() + (float)(d7 * d9));
        localzo3.a(paramArrayOfzo[4].d() + (float)(d6 * d9));
        localzo3.b(paramArrayOfzo[4].e() + (float)(d7 * d9));
        paramzbt.w().a(localzo1, localzo2);
        paramzbt.w().a(localzo2, localzo3);
        if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
          d8 = zbv.a(paramzbt.j(), paramzbt.y(), (int)d4, (int)d8, localzjf.U());
        } else {
          d8 += d4;
        }
      }
    }
    if ((paramzbt.A().h()) && (d5 > 0.0D))
    {
      if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
        d8 = zbv.a(paramzbt.j(), paramzbt.C(), (int)d5, (int)d3, localzjf.U());
      } else {
        d8 = d3 + d5;
      }
      localzo1 = zbxz.a(paramArrayOfzo[0]);
      localzo2 = zbxz.a(paramArrayOfzo[2]);
      localzo3 = zbxz.a(paramArrayOfzo[4]);
      while ((d8 <= d2) || ((paramzbt.g() == 0) && (paramzbt.k() == 2) && (d8 <= d2)))
      {
        if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
          d9 = zbv.a(i, (int)d8, (int)d3, localzjf.U());
        } else {
          d9 = d8 - d3;
        }
        localzo1.a(paramArrayOfzo[0].d() + (float)(d6 * d9));
        localzo1.b(paramArrayOfzo[0].e() + (float)(d7 * d9));
        localzo2.a(paramArrayOfzo[2].d() + (float)(d6 * d9));
        localzo2.b(paramArrayOfzo[2].e() + (float)(d7 * d9));
        localzo3.a(paramArrayOfzo[4].d() + (float)(d6 * d9));
        localzo3.b(paramArrayOfzo[4].e() + (float)(d7 * d9));
        paramzbt.A().a(localzo1, localzo2);
        paramzbt.A().a(localzo2, localzo3);
        if ((paramzbt.g() == 0) && (paramzbt.k() == 2)) {
          d8 = zbv.a(paramzbt.j(), paramzbt.C(), (int)d5, (int)d8, paramzbt.e().U());
        } else {
          d8 += d5;
        }
      }
    }
  }
  
  private static boolean b(zjf paramzjf)
  {
    switch (paramzjf.N())
    {
    case 45: 
    case 48: 
      return true;
    }
    return false;
  }
  
  static boolean a(zjf paramzjf)
  {
    switch (paramzjf.N())
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
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */