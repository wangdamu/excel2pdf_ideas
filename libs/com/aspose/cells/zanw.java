package com.aspose.cells;

import com.aspose.cells.a.d.zam;
import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zf;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

abstract class zanw
{
  protected static float a = ;
  ArrayList b;
  float c = 0.0F;
  float d = 0.0F;
  float e = 0.0F;
  float f = 0.0F;
  float g = 0.0F;
  protected zt h;
  float i = 0.0F;
  protected float j;
  protected double[] k;
  boolean l = false;
  zf m = null;
  zgw n;
  protected boolean o;
  protected boolean[] p;
  protected float q;
  protected float r;
  
  protected zanw(boolean paramBoolean, boolean[] paramArrayOfBoolean, float paramFloat1, float paramFloat2, zgw paramzgw, float paramFloat3, double[] paramArrayOfDouble)
  {
    this.o = paramBoolean;
    this.p = paramArrayOfBoolean;
    this.q = paramFloat1;
    this.r = paramFloat2;
    this.k = paramArrayOfDouble;
    this.j = paramFloat3;
    this.n = paramzgw;
    this.b = new ArrayList();
    this.h = new zt();
  }
  
  public static int a(String paramString, float paramFloat, int paramInt)
    throws Exception
  {
    int i1 = 96;
    int i2 = (int)((paramFloat * 20.0F * i1 + 720.0F) / 1440.0F);
    i2 = (i2 ^ 0xFFFFFFFF) + 1;
    int[] arrayOfInt = new int[10];
    zgs localzgs = zav.a().b(paramString, paramInt, false);
    for (int i3 = 48; i3 < 58; i3++)
    {
      zam localzam = localzgs.a(Math.abs(i2), (char)i3, (int)paramFloat);
      arrayOfInt[(i3 - 48)] = localzam.i;
    }
    i3 = 0;
    int i4 = 0;
    int i5 = 0;
    i5 = arrayOfInt[0];
    for (int i6 = 0; i6 < 10; i6++)
    {
      i4 = arrayOfInt[i6];
      i3 += i4;
      if (i5 < i4) {
        i5 = i4;
      }
    }
    i6 = (i3 + 9) / 10;
    if (i5 < i6) {
      i5 = i6;
    }
    int i7 = (i6 + 3) / 4;
    return (int)(i7 * a / zap.a() + 0.5D);
  }
  
  protected float b(String paramString, float paramFloat, int paramInt)
    throws Exception
  {
    float f1 = zbra.a(paramString, paramFloat, this.j);
    if (f1 > -1.0F) {
      return f1;
    }
    return 2 * a(paramString, paramFloat, paramInt) + 1;
  }
  
  protected float a(zgs paramzgs, float paramFloat, zqb paramzqb)
  {
    float f1 = paramzgs.b(paramFloat);
    f1 = zbra.a(f1, paramzqb.b.getName(), this.j, this.m, this.n);
    return f1;
  }
  
  protected float a(zgs paramzgs, zqb paramzqb)
    throws Exception
  {
    return zgs.a(paramzqb.b.getName(), (float)paramzqb.b.getDoubleSize(), "|", paramzqb.b.p()).c();
  }
  
  protected abstract float a(double paramDouble, float paramFloat);
  
  protected abstract float a(zgs paramzgs, int paramInt, float paramFloat)
    throws Exception;
  
  protected abstract float a(zgs paramzgs, String paramString, float paramFloat)
    throws Exception;
  
  abstract void a()
    throws Exception;
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zanw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */