package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;

class zbwa
  implements zajo
{
  protected Color a;
  protected Color b;
  protected int c = 2;
  protected zc d = null;
  protected boolean e = true;
  
  public void a(Color paramColor1, Color paramColor2, int paramInt)
  {
    this.a = paramColor1;
    this.e = true;
    this.b = paramColor2;
    this.c = paramInt;
  }
  
  public void a(zc paramzc, Color paramColor, int paramInt)
  {
    this.d = paramzc;
    this.e = false;
    this.b = paramColor;
    this.c = paramInt;
  }
  
  public boolean a(zr paramzr, zh paramzh, int paramInt1, int paramInt2, String paramString, zn paramzn, zv paramzv)
  {
    ze localze = new ze();
    localze.a(paramString, paramzh, paramInt1, paramInt2, paramzn, paramzv);
    zs localzs = new zs(this.b, this.c);
    localzs.d(2);
    paramzr.a(localzs, localze);
    if (this.e)
    {
      zu localzu = new zu(this.a);
      paramzr.a(localzu, localze);
    }
    else
    {
      paramzr.a(this.d, localze);
    }
    return true;
  }
  
  public boolean a(zr paramzr, zh paramzh, int paramInt1, int paramInt2, String paramString, zn paramzn, zv paramzv, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    ze localze = new ze();
    localze.a(paramString, paramzh, paramInt1, paramInt2, paramzn, paramzv);
    paramArrayOfFloat1[0] = paramzn.a();
    paramArrayOfFloat2[0] = paramzn.b();
    boolean bool = zacy.a(paramzr, localze, paramArrayOfFloat1, paramArrayOfFloat2);
    if (!bool) {
      return false;
    }
    float f1 = 0.0F;
    float f2 = 0.0F;
    float[] arrayOfFloat1 = { f1 };
    float[] arrayOfFloat2 = { f2 };
    bool = zacy.a(paramzr, this.c, 0.0F, arrayOfFloat1, arrayOfFloat2);
    f1 = arrayOfFloat1[0];
    f2 = arrayOfFloat2[0];
    if (!bool) {
      return false;
    }
    paramArrayOfFloat1[0] += f1;
    paramArrayOfFloat2[0] += f1;
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */