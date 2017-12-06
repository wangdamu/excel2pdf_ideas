package com.aspose.cells;

import com.aspose.cells.a.d.zp;
import com.aspose.cells.a.d.zq;
import com.aspose.cells.a.d.zt;
import com.aspose.cells.a.d.zu;
import com.aspose.cells.a.d.zy;
import com.aspose.cells.a.e.zf;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zr;
import java.awt.geom.PathIterator;

public class zaee
{
  public static zp a(ze paramze)
  {
    zav localzav = new zav();
    localzav.a(2);
    return a(paramze, localzav);
  }
  
  public static zp a(ze paramze, zg paramzg)
  {
    PathIterator localPathIterator = paramze.getPathIterator(null);
    return a(localPathIterator, paramzg);
  }
  
  public static zp a(zr paramzr, zg paramzg)
  {
    PathIterator localPathIterator = paramzr.getPathIterator(null);
    return a(localPathIterator, paramzg);
  }
  
  public static zp a(PathIterator paramPathIterator, zg paramzg)
  {
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    zp localzp = null;
    zq localzq = null;
    float f = 1.0F;
    try
    {
      localzp = new zp();
      double[] arrayOfDouble = new double[6];
      double d1 = 0.0D;
      double d2 = 0.0D;
      int i = 0;
      zo[] arrayOfzo = new zo[4];
      d5 = 0.0D;
      d6 = 0.0D;
      while (!paramPathIterator.isDone())
      {
        int j = paramPathIterator.currentSegment(arrayOfDouble);
        for (int k = 0; k < arrayOfDouble.length; k++) {
          arrayOfDouble[k] = paramzg.b((float)arrayOfDouble[k]);
        }
        switch (j)
        {
        case 0: 
          if (i > 0)
          {
            a(localzq, new zo(d5, d6), arrayOfzo, i, f);
            i = 0;
          }
          localzq = new zq();
          localzq.a(false);
          localzp.a(localzq);
          d3 = arrayOfDouble[0];
          d4 = arrayOfDouble[1];
          localzq.a(new zo(d3 * f, d4 * f));
          d5 = arrayOfDouble[0];
          d6 = arrayOfDouble[1];
          d1 = arrayOfDouble[0];
          d2 = arrayOfDouble[1];
          break;
        case 1: 
          arrayOfzo = a(arrayOfzo, i++, (float)arrayOfDouble[0], (float)arrayOfDouble[1]);
          d1 = arrayOfDouble[0];
          d2 = arrayOfDouble[1];
          break;
        case 2: 
          if (i > 0) {
            a(localzq, new zo(d5, d6), arrayOfzo, i, f);
          }
          i = 0;
          double d7 = arrayOfDouble[0];
          double d8 = arrayOfDouble[1];
          double d9 = arrayOfDouble[2];
          double d10 = arrayOfDouble[3];
          double d11 = d7 + (d1 - d7) / 3.0D;
          double d12 = d8 + (d2 - d8) / 3.0D;
          double d13 = d7 + (d9 - d7) / 3.0D;
          double d14 = d8 + (d10 - d8) / 3.0D;
          zy localzy2 = new zy();
          localzy2.a(new zo(d1 * f, d2 * f));
          localzy2.b(new zo(d11 * f, d12 * f));
          localzy2.c(new zo(d13 * f, d14 * f));
          localzy2.d(new zo(d9 * f, d10 * f));
          zt localzt2 = new zt();
          localzt2.a(localzy2);
          localzq.a(localzt2);
          d1 = d9;
          d2 = d10;
          d5 = d1;
          d6 = d2;
          break;
        case 3: 
          if (i > 0) {
            a(localzq, new zo(d5, d6), arrayOfzo, i, f);
          }
          i = 0;
          zy localzy1 = new zy();
          localzy1.a(new zo(d1 * f, d2 * f));
          localzy1.b(new zo(arrayOfDouble[0] * f, arrayOfDouble[1] * f));
          localzy1.c(new zo(arrayOfDouble[2] * f, arrayOfDouble[3] * f));
          localzy1.d(new zo(arrayOfDouble[4] * f, arrayOfDouble[5] * f));
          zt localzt1 = new zt();
          localzt1.a(localzy1);
          localzq.a(localzt1);
          d1 = arrayOfDouble[4];
          d2 = arrayOfDouble[5];
          d5 = d1;
          d6 = d2;
          break;
        case 4: 
          if (i > 0) {
            a(localzq, new zo(d5, d6), arrayOfzo, i, f);
          }
          localzq.a(true);
          d1 = d3;
          d2 = d4;
          i = 0;
        }
        paramPathIterator.next();
      }
      if (i > 0) {
        a(localzq, new zo(d5, d6), arrayOfzo, i, f);
      }
    }
    catch (Exception localException)
    {
      zf.a(localException);
    }
    return localzp;
  }
  
  private static zo[] a(zo[] paramArrayOfzo, int paramInt, float paramFloat1, float paramFloat2)
  {
    zo[] arrayOfzo = null;
    if (paramInt >= paramArrayOfzo.length)
    {
      arrayOfzo = new zo[paramInt << 1];
      System.arraycopy(paramArrayOfzo, 0, arrayOfzo, 0, paramArrayOfzo.length);
    }
    else
    {
      arrayOfzo = paramArrayOfzo;
    }
    if (arrayOfzo[paramInt] == null)
    {
      arrayOfzo[paramInt] = new zo(paramFloat1, paramFloat2);
    }
    else
    {
      arrayOfzo[paramInt].a(paramFloat1);
      arrayOfzo[paramInt].b(paramFloat2);
    }
    return arrayOfzo;
  }
  
  private static void a(zq paramzq, zo paramzo, zo[] paramArrayOfzo, int paramInt, double paramDouble)
    throws Exception
  {
    zo[] arrayOfzo = new zo[paramInt + 1];
    arrayOfzo[0] = new zo(paramzo.d() * paramDouble, paramzo.e() * paramDouble);
    for (int i = 1; i <= paramInt; i++) {
      arrayOfzo[i] = new zo(paramArrayOfzo[(i - 1)].d() * paramDouble, paramArrayOfzo[(i - 1)].e() * paramDouble);
    }
    float[] arrayOfFloat = new float[arrayOfzo.length * 2];
    for (int j = 0; j < arrayOfzo.length; j++)
    {
      arrayOfFloat[(j * 2)] = arrayOfzo[j].d();
      arrayOfFloat[(j * 2 + 1)] = arrayOfzo[j].e();
    }
    zu localzu = new zu(arrayOfFloat);
    paramzq.a(localzu);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */