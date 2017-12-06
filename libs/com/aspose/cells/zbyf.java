package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zcd;
import com.aspose.cells.a.d.zce;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

abstract class zbyf
  extends zanw
{
  protected zbyf(boolean paramBoolean, boolean[] paramArrayOfBoolean, float paramFloat1, float paramFloat2, zgw paramzgw, float paramFloat3, double[] paramArrayOfDouble)
  {
    super(paramBoolean, paramArrayOfBoolean, paramFloat1, paramFloat2, paramzgw, paramFloat3, paramArrayOfDouble);
  }
  
  void a()
    throws Exception
  {
    ArrayList localArrayList = this.n.r();
    Font localFont = this.n.c().getFont();
    int i = -1;
    boolean bool = false;
    float f = 0.0F;
    Object localObject;
    if ((this.n.c().isTextWrapped()) || (this.n.c().getVerticalAlignment() == 6) || (this.n.c().getHorizontalAlignment() == 6))
    {
      int[] arrayOfInt = { i };
      bool = a(localFont, this.q, localArrayList, this.o, this.p, this.r, arrayOfInt);
      i = arrayOfInt[0];
      float[] arrayOfFloat;
      if (bool)
      {
        for (int k = 0; k < i; k++)
        {
          localObject = (zqb)localArrayList.get(0);
          if ((((zqb)localObject).a != null) && (((zqb)localObject).a.length() > 0))
          {
            arrayOfFloat = new float[] { f };
            a((zqb)localObject, arrayOfFloat);
            f = arrayOfFloat[0];
          }
          localArrayList.remove(0);
        }
        zqb localzqb1 = (zqb)localArrayList.get(0);
        if ((localzqb1.a == null) || (localzqb1.a.length() == 0)) {
          localArrayList.remove(0);
        }
      }
      else
      {
        for (int m = 0; m < localArrayList.size(); m++)
        {
          localObject = (zqb)localArrayList.get(m);
          if (((((zqb)localObject).a != null) && (((zqb)localObject).a.length() > 0)) || (this.n.b))
          {
            if (((zqb)localObject).b == null) {
              ((zqb)localObject).b = localFont;
            }
            arrayOfFloat = new float[] { f };
            a((zqb)localObject, arrayOfFloat);
            f = arrayOfFloat[0];
          }
        }
        zf.a(localArrayList, 0, localArrayList.size());
      }
    }
    else
    {
      for (int j = 0; j < localArrayList.size(); j++)
      {
        zqb localzqb2 = (zqb)localArrayList.get(j);
        if (((localzqb2.a != null) && (localzqb2.a.length() > 0)) || (this.n.b))
        {
          if (localzqb2.b == null) {
            localzqb2.b = localFont;
          }
          localzqb2.a = zw.a(localzqb2.a, "\000", "");
          localObject = new float[] { f };
          a(localzqb2, (float[])localObject);
          f = localObject[0];
        }
      }
      zf.a(localArrayList, 0, localArrayList.size());
    }
    this.e = f;
    this.l = this.p[0];
  }
  
  private boolean a(Font paramFont, float paramFloat1, ArrayList paramArrayList, boolean paramBoolean, boolean[] paramArrayOfBoolean, float paramFloat2, int[] paramArrayOfInt)
    throws Exception
  {
    Font localFont = null;
    zgs localzgs = null;
    paramArrayOfInt[0] = -1;
    float f1 = 0.0F;
    float f2 = 0.0F;
    int i = -1;
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zqb localzqb = (zqb)paramArrayList.get(j);
      paramArrayOfBoolean[0] = false;
      paramArrayOfInt[0] += 1;
      if (localzqb.b == null) {
        localzqb.b = paramFont;
      }
      if ((localzgs == null) || (localFont == null) || (localzqb.b != localFont))
      {
        localzgs = zav.a().b(localzqb.b.getName(), localzqb.b.p(), false);
        f1 = a(localzgs, localzqb) * (float)this.k[1];
        localFont = localzqb.b;
      }
      if (localzqb.d == 16)
      {
        paramArrayOfBoolean[0] = true;
        if (i > -1)
        {
          zf.a(paramArrayList, i, paramArrayOfInt[0] - i);
          paramArrayOfInt[0] = i;
        }
        return true;
      }
      localzqb.a = zw.a(localzqb.a, "\000", "");
      zcd[] arrayOfzcd = zce.a().a(localzqb.a);
      for (int k = 0; k < arrayOfzcd.length; k++)
      {
        int m = arrayOfzcd[k].a;
        if (m == 32)
        {
          if (i == -1) {
            i = paramArrayOfInt[0];
          }
        }
        else {
          i = -1;
        }
        if (f2 + f1 - 1.0E-4F > paramFloat2)
        {
          if (paramArrayOfInt[0] == 0) {
            paramArrayOfInt[0] += 1;
          }
          return true;
        }
        f2 += f1;
      }
    }
    return false;
  }
  
  private void a(zqb paramzqb, float[] paramArrayOfFloat)
    throws Exception
  {
    float f1 = 0.0F;
    zgs localzgs = zav.a().b(paramzqb.b.getName(), paramzqb.b.p(), false);
    float f2 = a(paramzqb.b.getDoubleSize(), this.j);
    float f3 = a(localzgs, f2, paramzqb);
    float f4 = a(localzgs, paramzqb) * 72.0F / a * (float)this.k[1];
    if ((paramzqb.b.isSuperscript()) || (paramzqb.b.isSubscript())) {
      f1 = a(localzgs, paramzqb.a, f2 * zgz.b);
    } else {
      f1 = a(localzgs, paramzqb.a, f2);
    }
    if (f1 > this.d) {
      this.d = f1;
    }
    paramArrayOfFloat[0] += f4;
    zf.a(this.b, new zbeu(paramzqb, 0.0F, paramArrayOfFloat[0], f1, f4, f3));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */