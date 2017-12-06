package com.aspose.cells;

import com.aspose.cells.a.d.zcm;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.za;
import java.util.ArrayList;
import java.util.Iterator;

class zbn
{
  int[] a;
  private zbo b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private Color h;
  private float i;
  private Color j;
  private boolean k;
  private boolean l;
  private float m = 0.0F;
  
  zbn(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Color paramColor1, float paramFloat, Color paramColor2, zbo paramzbo)
  {
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramInt1;
    this.h = paramColor1;
    this.i = paramFloat;
    this.j = paramColor2;
    this.b = paramzbo;
    if (paramzbo == null) {
      return;
    }
    if (paramzbo.d == null) {
      return;
    }
    this.a = ((int[])za.a(paramzbo.d));
  }
  
  zbo a()
  {
    return this.b;
  }
  
  private int f()
  {
    int n = a().f;
    if (((n & 0x80000000) != 0) && (n < -1073741824)) {
      return (int)a((short)(n & 0xFFFF), d(), e());
    }
    return n;
  }
  
  private int g()
  {
    int n = a().g;
    if (((n & 0x80000000) != 0) && (n < -1073741824)) {
      return (int)a((short)(n & 0xFFFF), d(), e());
    }
    return n;
  }
  
  private zo[] h()
  {
    zn[] arrayOfzn = a().a;
    zo[] arrayOfzo = new zo[arrayOfzn.length];
    float f1 = d();
    float f2 = e();
    for (int n = 0; n < arrayOfzn.length; n++)
    {
      zn localzn = arrayOfzn[n];
      arrayOfzo[n] = new zo(((localzn.a() & 0x80000000) != 0) && (localzn.a() < -1073741824) ? a((short)(localzn.a() & 0xFFFF), f1, f2) : localzn.a(), ((localzn.b() & 0x80000000) != 0) && (localzn.b() < -1073741824) ? a((short)(localzn.b() & 0xFFFF), f1, f2) : localzn.b());
    }
    return arrayOfzo;
  }
  
  private float a(short paramShort, float paramFloat1, float paramFloat2)
  {
    int n = 0;
    byte[] arrayOfByte = { n };
    float f1 = a().a(paramShort, this.a, arrayOfByte);
    n = arrayOfByte[0];
    float f2;
    if (paramFloat1 > paramFloat2)
    {
      f2 = paramFloat2 / paramFloat1;
      if ((n & 0xFF & 0x1) != 0)
      {
        if ((n & 0xFF & 0x2) == 0) {
          f1 *= f2;
        } else {
          f1 = (f1 - 10800.0F) * f2 + 10800.0F;
        }
      }
      else if ((n & 0xFF & 0x2) != 0) {
        f1 = f() - (f() - f1) * f2;
      }
    }
    else
    {
      f2 = paramFloat1 / paramFloat2;
      if ((n & 0xFF & 0x4) != 0)
      {
        if ((n & 0xFF & 0x8) == 0) {
          f1 *= f2;
        } else {
          f1 = (f1 - 10800.0F) * f2 + 10800.0F;
        }
      }
      else if ((n & 0xFF & 0x8) != 0) {
        f1 = g() - (g() - f1) * f2;
      }
    }
    return f1;
  }
  
  private ze a(zbq[] paramArrayOfzbq, int[] paramArrayOfInt1, zo[] paramArrayOfzo, int[] paramArrayOfInt2, int[] paramArrayOfInt3, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    paramArrayOfInt2[0] = 3;
    paramArrayOfInt3[0] = 1;
    paramArrayOfBoolean1[0] = false;
    paramArrayOfBoolean2[0] = true;
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length == 0))
    {
      if ((paramArrayOfzo == null) || (paramArrayOfzo.length == 0) || (paramArrayOfzbq[0].a != 0)) {
        return null;
      }
      localze = new ze();
      localze.a(paramArrayOfzo);
      localze.j();
      paramArrayOfzbq[0].a = 1;
      paramArrayOfzbq[0].b = paramArrayOfzo.length;
      return localze;
    }
    ze localze = new ze();
    int n = paramArrayOfzbq[0].a;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = paramArrayOfzbq[0].b;
    int i7 = paramArrayOfzbq[0].b;
    int i8 = paramArrayOfzbq[0].b;
    while (n < paramArrayOfInt1.length)
    {
      try
      {
        int i9 = paramArrayOfInt1[(n++)];
        int i10 = (byte)((i9 & 0xFFFF) >> 12);
        int i13;
        int i14;
        switch (i10)
        {
        case 0: 
          i13 = i9 & 0xFFFF & 0xFFF;
          if ((i1 != 0) || (localze.e() == 0)) {
            i6++;
          }
          i1 = 0;
          i7 = i6 + i13;
          for (i14 = 0; i14 < i13; i14++)
          {
            localze.a(paramArrayOfzo[(i6 - 1)], paramArrayOfzo[i6]);
            i6++;
          }
          break;
        case 2: 
          i13 = i9 & 0xFFFF & 0xFFF;
          if ((i1 != 0) || (localze.e() == 0)) {
            i6++;
          }
          i1 = 0;
          i7 = i6 + i13 * 3;
          for (i14 = 0; i14 < i13; i14++)
          {
            localze.a(paramArrayOfzo[(i6 - 1)], paramArrayOfzo[i6], paramArrayOfzo[(i6 + 1)], paramArrayOfzo[(i6 + 2)]);
            i6 += 3;
          }
          break;
        case 4: 
          if (i1 != 0) {
            i7++;
          }
          localze.k();
          i2 |= i3;
          i3 = 0;
          i8 = i6;
          i1 = 1;
          break;
        case 8: 
          zo[] arrayOfzo = localze.c();
          int i15 = localze.e();
          if (i15 != 0)
          {
            if ((i3 == 0) && (i15 > 1) && (zo.a(arrayOfzo[(i15 - 1)], paramArrayOfzo[i8])))
            {
              i3 = 1;
              localze.j();
            }
            i2 |= i3;
            if (i4 == 0) {
              switch (i9 & 0xFFFF & 0xF)
              {
              case 0: 
              default: 
                paramArrayOfInt2[0] = 3;
                break;
              case 1: 
                paramArrayOfInt2[0] = 2;
                break;
              case 2: 
                paramArrayOfInt2[0] = 4;
                break;
              case 3: 
                paramArrayOfInt2[0] = 0;
                break;
              case 4: 
                paramArrayOfInt2[0] = 3;
                paramArrayOfBoolean1[0] = true;
                break;
              case 5: 
                paramArrayOfInt2[0] = 1;
                break;
              case 6: 
                paramArrayOfInt2[0] = 5;
                break;
              }
            } else {
              paramArrayOfInt2[0] = 0;
            }
            if (((i9 & 0xFFFF & 0x10) == 0) && (i5 == 0)) {
              paramArrayOfInt3[0] = ((i9 & 0xFFFF & 0x20) != 0 ? 2 : 1);
            } else {
              paramArrayOfInt3[0] = 0;
            }
            paramArrayOfBoolean2[0] = ((i9 & 0xFFFF & 0x100) == 0 ? 1 : false);
            paramArrayOfzbq[0].b = i7;
            paramArrayOfzbq[0].a = n;
            return localze;
          }
          break;
        case 6: 
          localze.j();
          i3 = 1;
          if (localze.e() > 0) {
            i2 = 1;
          }
          break;
        case 10: 
        case 11: 
          i13 = i9 & 0xFFFF & 0xFF;
          int i11 = (byte)((i9 & 0xFFFF & 0xF00) >> 8);
          switch (i11)
          {
          case 3: 
          case 4: 
          case 5: 
            if (i13 != 0)
            {
              i7 = i6 + i13;
              if (i13 == 2)
              {
                if (i1 != 0)
                {
                  i6++;
                  i7++;
                  localze.a(paramArrayOfzo[(i6 - 1)], paramArrayOfzo[(i6 - 1)]);
                }
                i1 = 0;
                localze.a(paramArrayOfzo[i6].d(), paramArrayOfzo[i6].e(), paramArrayOfzo[(i6 + 1)].d() - paramArrayOfzo[i6].d(), paramArrayOfzo[(i6 + 1)].e() - paramArrayOfzo[i6].e());
                i6 += 2;
                i3 = 1;
              }
              else
              {
                if (i13 % 4 != 0) {
                  throw new Exception("Invalid data autoshape segment" + Integer.toString(i9));
                }
                if (i1 != 0)
                {
                  i6++;
                  i7++;
                  localze.a(paramArrayOfzo[(i6 - 1)], paramArrayOfzo[(i6 - 1)]);
                }
                i1 = 0;
              }
            }
            break;
          case 10: 
          case 11: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          default: 
            while (i13 > 0)
            {
              zq localzq = new zq(paramArrayOfzo[i6].d(), paramArrayOfzo[i6].e(), paramArrayOfzo[(i6 + 1)].d() - paramArrayOfzo[i6].d(), paramArrayOfzo[(i6 + 1)].e() - paramArrayOfzo[i6].e());
              zo localzo1 = paramArrayOfzo[(i6 + 2)];
              zo localzo2 = paramArrayOfzo[(i6 + 3)];
              zo localzo3 = new zo(localzq.j() + localzq.h() / 2.0F, localzq.k() + localzq.i() / 2.0F);
              float f2 = localzo1.d() - localzo3.d();
              float f3 = localzo1.e() - localzo3.e();
              float f4 = a(f2, f3);
              f2 = localzo2.d() - localzo3.d();
              f3 = localzo2.e() - localzo3.e();
              float f5 = a(f2, f3);
              float f6 = f4;
              float f7 = f5 - f4;
              if (f7 < 0.0F) {
                f7 += 360.0F;
              }
              if (i11 != 5) {
                f7 -= 360.0F;
              }
              localze.a(localzq, f6, f7);
              i6 += 4;
              i13 -= 4;
              continue;
              i4 = 1;
              break;
              i5 = 1;
              break;
              if (i13 != 0)
              {
                if ((i1 != 0) || (localze.e() == 0)) {
                  i6++;
                }
                i1 = 0;
                i7 = i6 + i13;
                int i12 = Math.signum(paramArrayOfzo[i6].d() - paramArrayOfzo[(i6 - 1)].d()) == Math.signum(paramArrayOfzo[i6].e() - paramArrayOfzo[(i6 - 1)].e()) ? 1 : 0;
                int i16 = 0;
                while (i16 < i13)
                {
                  localzo1 = paramArrayOfzo[(i6 - 1)];
                  localzo2 = paramArrayOfzo[i6];
                  float f1 = localzo2.d() - localzo1.d();
                  f2 = localzo2.e() - localzo1.e();
                  int i17 = i12 != (Math.signum(f1) == Math.signum(f2) ? 1 : 0) ? 1 : 0;
                  if (i11 == 7) {
                    i17 = i17 == 0 ? 1 : 0;
                  }
                  if (i17 != 0) {
                    localze.a(localzo1, new zo(localzo1.d() + f1 / 2.0F, localzo1.e()), new zo(localzo2.d(), localzo2.e() - f2 / 2.0F), localzo2);
                  } else {
                    localze.a(localzo1, new zo(localzo1.d(), localzo1.e() + f2 / 2.0F), new zo(localzo2.d() - f1 / 2.0F, localzo2.e()), localzo2);
                  }
                  i16++;
                  i6++;
                }
              }
            }
          }
          break;
        }
      }
      catch (Exception localException) {}
      i6 = i7;
    }
    if (localze.e() > 0)
    {
      paramArrayOfInt2[0] = (i2 != 0 ? 3 : 0);
      paramArrayOfzbq[0].b = paramArrayOfzo.length;
      paramArrayOfzbq[0].a = paramArrayOfInt1.length;
      return localze;
    }
    return null;
  }
  
  void a(zr paramzr, zbnh paramzbnh, zq paramzq)
    throws Exception
  {
    com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
    paramzr.a(2, true);
    zs localzs1 = new zs(this.h, this.i);
    zs localzs2 = new zs(this.h, this.i);
    localzs2.e(0);
    localzs2.c(0);
    zu localzu1 = new zu(this.j);
    zu localzu2 = new zu(Color.fromArgb(this.j.getA() & 0xFF, (int)((this.j.getR() & 0xFF) * 0.8D + 0.5D), (int)((this.j.getG() & 0xFF) * 0.8D + 0.5D), (int)((this.j.getB() & 0xFF) * 0.8D + 0.5D)));
    zu localzu3 = new zu(Color.fromArgb(this.j.getA() & 0xFF, 255 - (int)((255 - (this.j.getR() & 0xFF)) * 0.8D + 0.5D), 255 - (int)((255 - (this.j.getG() & 0xFF)) * 0.8D + 0.5D), 255 - (int)((255 - (this.j.getB() & 0xFF)) * 0.8D + 0.5D)));
    zu localzu4 = new zu(Color.fromArgb(this.j.getA() & 0xFF, (int)((this.j.getR() & 0xFF) * 0.6D + 0.5D), (int)((this.j.getG() & 0xFF) * 0.6D + 0.5D), (int)((this.j.getB() & 0xFF) * 0.6D + 0.5D)));
    zu localzu5 = new zu(Color.fromArgb(this.j.getA() & 0xFF, 255 - (int)((255 - (this.j.getR() & 0xFF)) * 0.6D + 0.5D), 255 - (int)((255 - (this.j.getG() & 0xFF)) * 0.6D + 0.5D), 255 - (int)((255 - (this.j.getB() & 0xFF)) * 0.6D + 0.5D)));
    try
    {
      int[] arrayOfInt1 = this.b.b;
      float f1 = f();
      float f2 = g();
      zi localzi = new zi();
      localzi.b(paramzq.f(), paramzq.g(), 0);
      localzi.a(paramzq.h() / f1, paramzq.i() / f2, 0);
      zo[] arrayOfzo = h();
      if (b() == 19) {
        a(arrayOfzo);
      }
      localzi.a(arrayOfzo);
      ArrayList localArrayList = new ArrayList();
      zbq localzbq = new zbq(0);
      for (;;)
      {
        int n = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        zbq[] arrayOfzbq = { localzbq };
        int[] arrayOfInt2 = { n };
        int[] arrayOfInt3 = { i1 };
        boolean[] arrayOfBoolean1 = { i2 };
        boolean[] arrayOfBoolean2 = { i3 };
        ze localze = a(arrayOfzbq, arrayOfInt1, arrayOfzo, arrayOfInt2, arrayOfInt3, arrayOfBoolean1, arrayOfBoolean2);
        localzbq = arrayOfzbq[0];
        n = arrayOfInt2[0];
        i1 = arrayOfInt3[0];
        i2 = arrayOfBoolean1[0];
        i3 = arrayOfBoolean2[0];
        if (localze == null) {
          break;
        }
        zc localzc = null;
        if (!this.j.isEmpty()) {
          switch (n)
          {
          case 0: 
            break;
          case 3: 
          default: 
            localzc = zbya.a(paramzbnh.m(), localze);
            break;
          case 1: 
            localzc = zbya.a(paramzbnh.m(), localze);
            break;
          case 2: 
            localzc = zbya.a(paramzbnh.m(), localze);
            break;
          case 4: 
            localzc = zbya.a(paramzbnh.m(), localze);
            break;
          case 5: 
            localzc = zbya.a(paramzbnh.m(), localze);
          }
        }
        zs localzs3 = null;
        if (!this.h.isEmpty()) {
          switch (i1)
          {
          case 1: 
          default: 
            localzs3 = zbya.a(paramzbnh.n());
            break;
          case 2: 
            localzs3 = localzs2;
            break;
          }
        }
        com.aspose.cells.b.a.a.zf.a(localArrayList, new zbp(localze, localzc, localzs3, i3));
      }
      Iterator localIterator = localArrayList.iterator();
      zbp localzbp;
      while (localIterator.hasNext())
      {
        localzbp = (zbp)localIterator.next();
        if (localzbp.b != null) {
          paramzr.a(localzbp.b, localzbp.a);
        }
      }
      localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        localzbp = (zbp)localIterator.next();
        if (localzbp.c != null) {
          paramzr.a(localzbp.c, localzbp.a);
        }
      }
    }
    catch (Exception localException) {}finally
    {
      paramzr.a(localzf);
    }
  }
  
  public int b()
  {
    return this.g;
  }
  
  zao c()
  {
    return this.a != null ? new zao(this) : null;
  }
  
  private static float a(float paramFloat1, float paramFloat2)
  {
    float f1 = (float)zcm.b(Math.atan2(paramFloat2, paramFloat1));
    if (f1 < 0.0F) {
      f1 += 360.0F;
    }
    return f1;
  }
  
  private void a(zo[] paramArrayOfzo)
  {
    float f1 = c().a(0) / 65536 % 360;
    float f2 = c().a(1) / 65536 % 360;
    if (f1 < 0.0F) {
      f1 += 360.0F;
    }
    if (f2 < 0.0F) {
      f2 += 360.0F;
    }
    if (f1 < f2)
    {
      f3 = (f1 < 270.0F) && (f2 > 270.0F) ? paramArrayOfzo[0].e() : Math.min(paramArrayOfzo[2].e(), paramArrayOfzo[3].e());
      f4 = (f1 < 180.0F) && (f2 > 180.0F) ? paramArrayOfzo[0].d() : Math.min(paramArrayOfzo[2].d(), paramArrayOfzo[3].d());
      f5 = (f1 < 90.0F) && (f2 > 90.0F) ? paramArrayOfzo[1].e() : Math.max(paramArrayOfzo[2].e(), paramArrayOfzo[3].e());
      f6 = Math.max(paramArrayOfzo[2].d(), paramArrayOfzo[3].d());
    }
    else
    {
      f3 = (f1 < 270.0F) || (f2 > 270.0F) ? paramArrayOfzo[0].e() : Math.min(paramArrayOfzo[2].e(), paramArrayOfzo[3].e());
      f4 = (f1 < 180.0F) || (f2 > 180.0F) ? paramArrayOfzo[0].d() : Math.min(paramArrayOfzo[2].d(), paramArrayOfzo[3].d());
      f5 = (f1 < 90.0F) || (f2 > 90.0F) ? paramArrayOfzo[1].e() : Math.max(paramArrayOfzo[2].e(), paramArrayOfzo[3].e());
      f6 = paramArrayOfzo[1].d();
    }
    float f3 = Math.min(f3, 10800.0F);
    float f4 = Math.min(f4, 10800.0F);
    float f5 = Math.max(f5, 10800.0F);
    float f6 = Math.max(f6, 10800.0F);
    float f7 = f6 - f4;
    float f8 = f5 - f3;
    float f9 = paramArrayOfzo[1].d();
    float f10 = paramArrayOfzo[1].e();
    if ((f8 < 1.0F) || (f7 < 1.0F)) {
      return;
    }
    for (int n = 0; n < paramArrayOfzo.length; n++)
    {
      paramArrayOfzo[n].a((paramArrayOfzo[n].d() - f4) / f7 * f9);
      paramArrayOfzo[n].b((paramArrayOfzo[n].e() - f3) / f8 * f10);
    }
  }
  
  public int d()
  {
    return this.e;
  }
  
  public float e()
  {
    return this.f;
  }
  
  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public void a(float paramFloat)
  {
    this.m = paramFloat;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */