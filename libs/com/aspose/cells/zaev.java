package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zcd;
import com.aspose.cells.a.d.zce;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

abstract class zaev
  extends zanw
{
  protected zaev(boolean paramBoolean, boolean[] paramArrayOfBoolean, float paramFloat1, float paramFloat2, zgw paramzgw, float paramFloat3, double[] paramArrayOfDouble)
  {
    super(paramBoolean, paramArrayOfBoolean, paramFloat1, paramFloat2, paramzgw, paramFloat3, paramArrayOfDouble);
  }
  
  void a()
    throws Exception
  {
    ArrayList localArrayList = this.n.r();
    Font localFont = this.n.c().getFont();
    int i = -1;
    int j = -1;
    float f1 = 0.0F;
    boolean bool1 = this.n.c().getRotationAngle() == 255;
    float f2 = 0.0F;
    boolean bool2 = false;
    Object localObject1;
    Object localObject2;
    zqb localzqb2;
    float[] arrayOfFloat2;
    if (zgz.a(this.n.c()))
    {
      int[] arrayOfInt = { i };
      localObject1 = new int[] { j };
      localObject2 = new zt[] { this.h };
      float[] arrayOfFloat1 = { f1 };
      bool2 = a(localFont, this.q, localArrayList, this.o, this.p, this.r, this.n.c().getRotationAngle(), bool1, arrayOfInt, (int[])localObject1, (zt[])localObject2, arrayOfFloat1);
      i = arrayOfInt[0];
      j = localObject1[0];
      this.h = localObject2[0];
      f1 = arrayOfFloat1[0];
      if ((bool2) && (j >= 0) && (i >= 0))
      {
        for (int m = 0; m < i; m++)
        {
          localzqb2 = (zqb)localArrayList.get(0);
          if ((localzqb2.a != null) && (localzqb2.a.length() > 0))
          {
            arrayOfFloat2 = new float[] { f2 };
            a(localzqb2, arrayOfFloat2);
            f2 = arrayOfFloat2[0];
          }
          localArrayList.remove(0);
        }
        zqb localzqb1;
        if (localArrayList.size() > 0)
        {
          localzqb1 = (zqb)localArrayList.get(0);
          if ((localzqb1.a != null) && (localzqb1.a.length() > 0))
          {
            localzqb2 = new zqb();
            if (j == Integer.MAX_VALUE)
            {
              localzqb1.a = zw.a(localzqb1.a);
              arrayOfFloat2 = new float[] { f2 };
              a(localzqb1, arrayOfFloat2);
              f2 = arrayOfFloat2[0];
              localArrayList.remove(0);
            }
            else
            {
              localzqb2.a = localzqb1.a.substring(0, 0 + j);
              localzqb1.a = localzqb1.a.substring(j);
              localzqb1.a = zw.c(localzqb1.a);
              localzqb2.b = localzqb1.b;
              localzqb2.a = zw.a(localzqb2.a);
              if (localzqb1.a.length() == 0) {
                localArrayList.remove(localzqb1);
              }
              if (localzqb2.a.length() != 0)
              {
                arrayOfFloat2 = new float[] { f2 };
                a(localzqb2, arrayOfFloat2);
                f2 = arrayOfFloat2[0];
              }
            }
          }
          else
          {
            localArrayList.remove(0);
          }
        }
        if (localArrayList.size() > 0)
        {
          localzqb1 = (zqb)localArrayList.get(0);
          if ((this.p[0] == 0) && (localzqb1.d == 16)) {
            localArrayList.remove(0);
          }
        }
      }
      else
      {
        for (int n = 0; n < localArrayList.size(); n++)
        {
          localzqb2 = (zqb)localArrayList.get(n);
          if (((localzqb2.a != null) && (localzqb2.a.length() > 0)) || (this.n.b))
          {
            if (localzqb2.b == null) {
              localzqb2.b = localFont;
            }
            arrayOfFloat2 = new float[] { f2 };
            a(localzqb2, arrayOfFloat2);
            f2 = arrayOfFloat2[0];
          }
        }
        zf.a(localArrayList, 0, localArrayList.size());
      }
    }
    else
    {
      for (int k = 0; k < localArrayList.size(); k++)
      {
        localObject1 = null;
        localObject2 = null;
        localzqb2 = (zqb)localArrayList.get(k);
        if (localzqb2.b == null) {
          localzqb2.b = localFont;
        }
        if ((localObject1 == null) || (localObject2 == null) || (localzqb2.b != localObject2))
        {
          localObject1 = zav.a().b(localzqb2.b.getName(), localzqb2.b.p(), false);
          float f3 = a(localzqb2.b.getDoubleSize(), this.j);
          float f4 = a((zgs)localObject1, localzqb2);
          if (this.h.c() < f4) {
            this.h.b(f4);
          }
          localObject2 = localzqb2.b;
        }
        if (((localzqb2.a != null) && (localzqb2.a.length() > 0)) || (this.n.b))
        {
          localzqb2.a = zw.a(localzqb2.a, "\000", "");
          arrayOfFloat2 = new float[] { f2 };
          a(localzqb2, arrayOfFloat2);
          f2 = arrayOfFloat2[0];
        }
      }
      zf.a(localArrayList, 0, localArrayList.size());
    }
    this.e = (this.h.c() * 72.0F / a * (float)this.k[1]);
    this.d = f2;
    if ((this.b.size() == 0) && (this.p[0] == 0) && (bool2) && (!bool1)) {
      this.e = 0.0F;
    }
    this.l = this.p[0];
  }
  
  private boolean a(Font paramFont, float paramFloat1, ArrayList paramArrayList, boolean paramBoolean1, boolean[] paramArrayOfBoolean, float paramFloat2, int paramInt, boolean paramBoolean2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, zt[] paramArrayOfzt, float[] paramArrayOfFloat)
    throws Exception
  {
    Font localFont = null;
    zgs localzgs = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    int i = -1;
    int j = -1;
    int k = -1;
    int m = -1;
    float f3 = 0.0F;
    paramArrayOfInt2[0] = -1;
    paramArrayOfInt1[0] = -1;
    paramArrayOfzt[0] = new zt();
    paramArrayOfFloat[0] = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 2.0F;
    float f7 = 0.0F;
    if (paramArrayList.size() > 0)
    {
      zqb localzqb1 = (zqb)paramArrayList.get(0);
      if (localzqb1.b == null) {
        localzqb1.b = paramFont;
      }
      f4 = a(localzqb1.b.getDoubleSize(), this.j);
      f6 = b(localzqb1.b.getName(), f4, localzqb1.b.p());
    }
    for (int n = 0; n < paramArrayList.size(); n++)
    {
      zqb localzqb2 = (zqb)paramArrayList.get(n);
      if ((!paramBoolean2) && (n == 0) && (!paramBoolean1) && (paramArrayOfBoolean[0] == 0)) {
        localzqb2.a = zw.c(localzqb2.a);
      }
      paramArrayOfBoolean[0] = false;
      paramArrayOfInt1[0] += 1;
      if (localzqb2.b == null) {
        localzqb2.b = paramFont;
      }
      if ((localzgs == null) || (localFont == null) || (localzqb2.b != localFont))
      {
        localzgs = zav.a().b(localzqb2.b.getName(), localzqb2.b.p(), false);
        f4 = a(localzqb2.b.getDoubleSize(), this.j);
        f5 = a(localzgs, localzqb2);
        if (f2 < f5) {
          f2 = f5;
        }
        localFont = localzqb2.b;
      }
      if (localzqb2.d == 16)
      {
        paramArrayOfBoolean[0] = true;
        if ((m >= 0) && (m == i))
        {
          paramArrayOfInt1[0] = k;
          paramArrayOfInt2[0] = (j + 1);
          paramArrayOfzt[0].a(f3);
          paramArrayOfzt[0].b(f2);
          paramArrayList.remove(n);
        }
        else
        {
          paramArrayOfzt[0].a(1.0F);
          paramArrayOfzt[0].b(f2);
          paramArrayOfInt2[0] = 0;
        }
        return true;
      }
      localzqb2.a = zw.a(localzqb2.a, "\000", "");
      zcd[] arrayOfzcd = zce.a().a(localzqb2.a);
      for (int i1 = 0; i1 < arrayOfzcd.length; i1++)
      {
        i++;
        int i2 = arrayOfzcd[i1].a;
        float f8 = a(localzgs, i2, f4);
        if ((localzqb2.b.isSubscript()) || (localzqb2.b.isSuperscript())) {
          f8 = a(localzgs, i2, f4 * zgz.b);
        }
        if ((!paramBoolean2) && ((i2 == 45) || (i2 == 32)) && (m < i) && (i1 < arrayOfzcd.length))
        {
          k = paramArrayOfInt1[0];
          j = arrayOfzcd[i1].b;
          f3 = f1;
          m = i;
        }
        if (paramInt != 0)
        {
          if ((paramInt != 90) && (paramInt != -90)) {
            f7 = (float)Math.abs(paramFloat2 / Math.sin(paramInt / 180.0F * 3.141592653589793D) - f2 * this.k[1] / Math.tan(paramInt / 180.0F * 3.141592653589793D));
          } else {
            f7 = paramFloat2;
          }
        }
        else {
          f7 = paramFloat1;
        }
        if ((f1 + f8 - 1.0E-4F > f7 - f6) || ((paramBoolean2) && (i > 0)))
        {
          if (i1 == 0)
          {
            paramArrayOfInt1[0] -= 1;
            if ((localzqb2.b.isSubscript()) || (localzqb2.b.isSuperscript())) {
              paramArrayOfInt1[0] -= 1;
            }
            if (paramArrayOfInt1[0] < 0)
            {
              if (i1 + 1 >= arrayOfzcd.length)
              {
                paramArrayOfInt1[0] = 0;
                paramArrayOfInt2[0] = ((zqb)paramArrayList.get(paramArrayOfInt1[0])).a.length();
              }
              else
              {
                paramArrayOfInt1[0] = 0;
                paramArrayOfInt2[0] = arrayOfzcd[(i1 + 1)].b;
              }
              paramArrayOfzt[0].a(f1);
              paramArrayOfzt[0].b(f2);
              return true;
            }
            paramArrayOfInt2[0] = ((zqb)paramArrayList.get(paramArrayOfInt1[0])).a.length();
            paramArrayOfzt[0].a(f1);
            paramArrayOfzt[0].b(f2);
          }
          else if (m >= 0)
          {
            paramArrayOfInt1[0] = k;
            paramArrayOfInt2[0] = (j + 1);
            paramArrayOfzt[0].a(f3);
            paramArrayOfzt[0].b(f2);
          }
          else if ((paramArrayOfInt1[0] > 0) && (m < 0))
          {
            paramArrayOfInt1[0] -= 1;
            paramArrayOfInt2[0] = Integer.MAX_VALUE;
            paramArrayOfzt[0].a(f1);
            paramArrayOfzt[0].b(f2);
          }
          else
          {
            if (paramArrayOfInt1[0] >= 0) {
              paramArrayOfInt2[0] = arrayOfzcd[i1].b;
            }
            paramArrayOfzt[0].a(f1);
            paramArrayOfzt[0].b(f2);
          }
          return true;
        }
        f1 += f8;
      }
    }
    paramArrayOfzt[0].a(f1);
    paramArrayOfzt[0].b(f2);
    return false;
  }
  
  private void a(zqb paramzqb, float[] paramArrayOfFloat)
    throws Exception
  {
    float f1 = 0.0F;
    zgs localzgs = zav.a().b(paramzqb.b.getName(), paramzqb.b.p(), false);
    float f2 = a(paramzqb.b.getDoubleSize(), this.j);
    float f3 = a(localzgs, f2, paramzqb);
    if (this.g < f3) {
      this.g = f3;
    }
    if ((paramzqb.b.isSuperscript()) || (paramzqb.b.isSubscript())) {
      f1 = a(localzgs, paramzqb.a, f2 * zgz.b);
    } else {
      f1 = a(localzgs, paramzqb.a, f2);
    }
    zf.a(this.b, new zbeu(paramzqb, paramArrayOfFloat[0], f1));
    paramArrayOfFloat[0] += f1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */