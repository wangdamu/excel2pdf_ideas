package com.aspose.cells;

import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zv;

class zauo
{
  protected zajo a = null;
  protected zajo b = null;
  protected zajo c = null;
  protected zajo d;
  protected zn e;
  protected Color f = Color.fromArgb(0, 0, 0);
  protected za g = null;
  protected boolean h = false;
  protected boolean i = false;
  protected boolean j;
  protected int k = 2;
  protected boolean l;
  
  public void a(Color paramColor1, Color paramColor2, int paramInt)
  {
    zbwa localzbwa = new zbwa();
    localzbwa.a(paramColor1, paramColor2, paramInt);
    this.a = localzbwa;
    zaxs localzaxs = new zaxs();
    localzaxs.a(paramColor1, paramColor2, paramInt);
    this.d = localzaxs;
  }
  
  public void a(zc paramzc, Color paramColor, int paramInt)
  {
    zbwa localzbwa = new zbwa();
    localzbwa.a(paramzc, paramColor, paramInt);
    this.a = localzbwa;
    zaxs localzaxs = new zaxs();
    localzaxs.a(paramzc, paramColor, paramInt);
    this.d = localzaxs;
  }
  
  public void a()
  {
    this.c = null;
    this.b = null;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void a(Color paramColor, int paramInt, zn paramzn)
  {
    zwt localzwt1 = new zwt();
    localzwt1.a(Color.fromArgb(0, 0, 0, 0), paramColor, paramInt, paramzn.a(), paramzn.b());
    this.f = paramColor;
    zwt localzwt2 = new zwt();
    localzwt2.a(Color.fromArgb(paramColor.getA() & 0xFF, 255, 255), Color.fromArgb(0, 0, 0, 0), 0, paramzn.a(), paramzn.b());
    this.c = localzwt2;
    this.e = paramzn;
    this.b = localzwt1;
    this.l = true;
    this.i = false;
    this.k = paramInt;
  }
  
  public boolean a(zr paramzr, zh paramzh, int paramInt1, int paramInt2, String paramString, zn paramzn, zv paramzv)
  {
    if ((this.h) && (this.b != null)) {
      this.b.a(paramzr, paramzh, paramInt1, paramInt2, paramString, new zn(paramzn.a() + this.e.a(), paramzn.b() + this.e.b()), paramzv);
    }
    if (this.j) {
      this.d.a(paramzr, paramzh, paramInt1, paramInt2, paramString, new zn(paramzn.a() + this.e.a(), paramzn.b() + this.e.b()), paramzv);
    }
    if (this.a != null) {
      return this.a.a(paramzr, paramzh, paramInt1, paramInt2, paramString, paramzn, paramzv);
    }
    return false;
  }
  
  public boolean a(zr paramzr, zh paramzh, int paramInt1, int paramInt2, String paramString, zn paramzn, zv paramzv, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float[] arrayOfFloat1 = { f1 };
    float[] arrayOfFloat2 = { f2 };
    boolean bool = this.a.a(paramzr, paramzh, paramInt1, paramInt2, paramString, paramzn, paramzv, arrayOfFloat1, arrayOfFloat2);
    f1 = arrayOfFloat1[0];
    f2 = arrayOfFloat2[0];
    if (!bool) {
      return false;
    }
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (this.h)
    {
      float[] arrayOfFloat3 = { f3 };
      float[] arrayOfFloat4 = { f4 };
      bool = this.b.a(paramzr, paramzh, paramInt1, paramInt2, paramString, paramzn, paramzv, arrayOfFloat3, arrayOfFloat4);
      f3 = arrayOfFloat3[0];
      f4 = arrayOfFloat4[0];
      if (bool)
      {
        float f5 = 0.0F;
        float f6 = 0.0F;
        float[] arrayOfFloat5 = { f5 };
        float[] arrayOfFloat6 = { f6 };
        bool = zacy.a(paramzr, this.e.a(), this.e.b(), arrayOfFloat5, arrayOfFloat6);
        f5 = arrayOfFloat5[0];
        f6 = arrayOfFloat6[0];
        if (bool)
        {
          f3 += f5;
          f4 += f6;
        }
      }
      else
      {
        return false;
      }
    }
    if ((f1 > f3) || (f2 > f4))
    {
      paramArrayOfFloat1[0] = f1;
      paramArrayOfFloat2[0] = f2;
    }
    else
    {
      paramArrayOfFloat1[0] = f3;
      paramArrayOfFloat2[0] = f4;
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */