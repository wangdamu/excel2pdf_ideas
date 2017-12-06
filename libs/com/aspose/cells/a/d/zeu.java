package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.zm;
import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zs;

public class zeu
{
  private zdz a;
  private zfu b;
  private zfp c;
  private static float[] d = new float[0];
  private static float[] e = { 3.0F, 1.0F };
  private static float[] f = { 1.0F, 1.0F };
  private static float[] g = { 3.0F, 1.0F, 1.0F, 1.0F };
  private static float[] h = { 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F };
  
  private zeu() {}
  
  public zeu(zdz paramzdz, zfp paramzfp, zfu paramzfu)
  {
    this.a = paramzdz;
    this.c = paramzfp;
    this.b = paramzfu;
  }
  
  public void a(zx paramzx)
    throws Exception
  {
    if (paramzx.i == 0)
    {
      Color localColor = paramzx.a;
      if ((this.a.b().u()) && ((localColor.getA() & 0xFF) < 255)) {
        localColor = a(localColor, Color.fromArgb(255, 255, 255, 255));
      }
      this.a.j().a(localColor, true, this.b);
    }
    else
    {
      a(paramzx.j, true);
    }
    this.a.j().c(paramzx.b < 0.0F ? 0.0F : paramzx.b, this.b);
    int i = b(paramzx);
    this.a.j().b(i, this.b);
    int j = c(paramzx);
    this.a.j().c(j, this.b);
    if (paramzx.f == 3) {
      this.a.j().d(paramzx.h, this.b);
    }
    if (paramzx.g != 0)
    {
      int k = 0;
      if (i == 0)
      {
        k = d(paramzx);
        this.a.j().b(k, this.b);
      }
      if ((paramzx.b() != null) && (paramzx.b().length > 0))
      {
        float[] arrayOfFloat = a(paramzx, (i != 0) || (k != 0));
        this.a.j().a(arrayOfFloat, paramzx.k, this.b);
      }
    }
  }
  
  public void a(zc paramzc, boolean paramBoolean)
    throws Exception
  {
    zu localzu = (zu)zm.a(paramzc, zu.class);
    if (localzu != null)
    {
      localObject = localzu.a();
      if ((this.a.b().u()) && ((((Color)localObject).getA() & 0xFF) < 255)) {
        localObject = a((Color)localObject, Color.fromArgb(255, 255, 255, 255));
      }
      this.a.j().a((Color)localObject, paramBoolean, this.b);
      return;
    }
    Object localObject = (com.aspose.cells.b.a.b.zx)zm.a(paramzc, com.aspose.cells.b.a.b.zx.class);
    zg localzg = (zg)zm.a(paramzc, zg.class);
    if ((localzg != null) || (localObject != null))
    {
      zfl localzfl = this.c.b(paramzc);
      if (this.a.i() != null) {
        localzfl.b(this.a.i().n());
      }
      this.a.j().a(zdy.d(), paramBoolean, this.b);
      this.b.c(zs.a(new StringBuilder(32).append("/").append(localzfl.q()).append(' ').append(paramBoolean ? "SCN" : "scn")));
      return;
    }
  }
  
  public void a(com.aspose.cells.b.a.b.za paramza, zo paramzo, zt paramzt, long paramLong)
    throws Exception
  {
    zdv localzdv = new zdv(paramza, this.a.b().u());
    a(localzdv, paramzo, paramzt, paramLong);
  }
  
  public void a(zex paramzex, zo paramzo, zt paramzt)
    throws Exception
  {
    this.a.j().a(this.b);
    zi localzi = new zi(paramzt.b(), 0.0F, 0.0F, -paramzt.c(), paramzo.d(), paramzo.e() + paramzt.c());
    this.a.j().a(localzi, this.b);
    if ((paramzex.g()) && (paramzex.e() != zdy.c()))
    {
      zew.a(this.b, paramzex);
    }
    else
    {
      zew localzew = this.c.a(paramzex);
      if (this.a.i() != null) {
        localzew.b(this.a.i().n());
      }
      this.b.c("/" + localzew.q() + " Do");
    }
    this.a.j().b(this.b);
    localzi = null;
  }
  
  public void a(zex paramzex, zo paramzo, zt paramzt, long paramLong)
    throws Exception
  {
    this.a.j().a(this.b);
    zi localzi = new zi(paramzt.b(), 0.0F, 0.0F, -paramzt.c(), paramzo.d(), paramzo.e() + paramzt.c());
    this.a.j().a(localzi, this.b);
    if ((paramzex.g()) && (paramzex.e() != zdy.c()))
    {
      zew.a(this.b, paramzex);
    }
    else
    {
      zew localzew = this.c.a(paramzex, paramLong);
      if (this.a.i() != null) {
        localzew.b(this.a.i().n());
      }
      this.b.c("/" + localzew.q() + " Do");
    }
    this.a.j().b(this.b);
  }
  
  private static int b(zx paramzx)
  {
    switch (paramzx.c)
    {
    case 2: 
      return 1;
    case 1: 
      return 2;
    }
    switch (paramzx.d)
    {
    case 2: 
      return 1;
    case 1: 
      return 2;
    }
    return 0;
  }
  
  private static int c(zx paramzx)
  {
    switch (paramzx.f)
    {
    case 2: 
      return 1;
    case 1: 
      return 2;
    }
    return 0;
  }
  
  private static int d(zx paramzx)
  {
    switch (paramzx.e)
    {
    case 2: 
      return 1;
    }
    return 0;
  }
  
  public static float[] a(zx paramzx, boolean paramBoolean)
    throws Exception
  {
    switch (paramzx.g)
    {
    case 0: 
      arrayOfFloat = d;
      break;
    case 1: 
      arrayOfFloat = e;
      break;
    case 2: 
      arrayOfFloat = f;
      break;
    case 3: 
      arrayOfFloat = g;
      break;
    case 4: 
      arrayOfFloat = h;
      break;
    case 5: 
      arrayOfFloat = paramzx.b();
      break;
    default: 
      throw new Exception("Unknown dash style.");
    }
    float[] arrayOfFloat = (float[])zm.a(com.aspose.cells.b.a.za.a(arrayOfFloat), float[].class);
    a(paramzx, arrayOfFloat, paramBoolean);
    return arrayOfFloat;
  }
  
  private static void a(zx paramzx, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    float f1 = Math.max(paramzx.b, 1.0F);
    for (int i = 0; i < paramArrayOfFloat.length; i++)
    {
      float f2;
      if (zdh.b(i))
      {
        f2 = paramArrayOfFloat[i];
        if (paramBoolean) {
          f2 += 1.0F;
        }
        paramArrayOfFloat[i] = (f2 * f1);
      }
      else
      {
        f2 = paramArrayOfFloat[i];
        if (paramBoolean) {
          f2 -= 1.0F;
        }
        paramArrayOfFloat[i] = (f2 * f1);
      }
    }
  }
  
  public static Color a(Color paramColor1, Color paramColor2)
  {
    double d1 = (paramColor1.getA() & 0xFF) / 255.0D;
    double d2 = 1.0D - d1;
    int i = (int)zr.a((paramColor1.getR() & 0xFF) * d1 + (paramColor2.getR() & 0xFF) * d2);
    int j = (int)zr.a((paramColor1.getG() & 0xFF) * d1 + (paramColor2.getG() & 0xFF) * d2);
    int k = (int)zr.a((paramColor1.getB() & 0xFF) * d1 + (paramColor2.getB() & 0xFF) * d2);
    return Color.fromArgb(255, i, j, k);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */