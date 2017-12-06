package com.aspose.cells.b.a.b;

import com.aspose.cells.Color;
import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zcn;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.d.a.zd;
import com.aspose.cells.zis;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D.Float;
import java.awt.image.BufferedImage;
import java.util.Map;

public class zi
{
  protected final Graphics2D a;
  float b = 1.0F;
  int c = 1;
  private com.aspose.cells.b.a.b.a.zi d;
  private static final float[] e = { 1.0F, 1.0F, 1.0F, c() / 72.0F, c(), c() / 300.0F, c() / 25.4F };
  
  public static final float[] a()
  {
    return e;
  }
  
  protected zi(Graphics2D paramGraphics2D)
  {
    this.a = paramGraphics2D;
    this.d = new com.aspose.cells.b.a.b.a.zi();
  }
  
  public Graphics2D b()
  {
    return this.a;
  }
  
  public static int c()
  {
    return 96;
  }
  
  public void a(Color paramColor)
  {
    throw new com.aspose.cells.a.c.zb("");
  }
  
  public void d()
  {
    e();
  }
  
  public void e()
  {
    this.a.finalize();
  }
  
  public void a(zj paramzj, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.a.drawImage(paramzj.f(), (int)paramFloat1, (int)paramFloat2, (int)paramFloat3, (int)paramFloat4, null);
  }
  
  public void a(zj paramzj, zn paramzn)
  {
    this.a.drawImage(paramzj.f(), paramzn.a(), paramzn.b(), null);
  }
  
  public void a(zj paramzj, int paramInt1, int paramInt2)
  {
    this.a.drawImage(paramzj.f(), paramInt1, paramInt2, null);
  }
  
  public void a(zj paramzj, zp paramzp)
  {
    a(paramzj, paramzp.c(), paramzp.d());
  }
  
  public void a(zj paramzj, zq paramzq1, zq paramzq2, int paramInt)
  {
    this.a.drawImage(paramzj.f(), (int)paramzq1.f(), (int)paramzq1.g(), (int)paramzq1.l(), (int)paramzq1.m(), (int)paramzq2.f(), (int)paramzq2.g(), (int)paramzq2.l(), (int)paramzq2.m(), null);
  }
  
  public void a(zj paramzj, zp paramzp1, zp paramzp2, int paramInt)
  {
    this.a.drawImage(paramzj.f(), paramzp1.c(), paramzp1.d(), paramzp1.i(), paramzp1.j(), paramzp2.c(), paramzp2.d(), paramzp2.i(), paramzp2.j(), null);
  }
  
  public void a(zm paramzm, zp paramzp)
  {
    this.a.drawRect(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
  }
  
  public void a(String paramString, zg paramzg, zc paramzc, zq paramzq, zv paramzv)
  {
    a(paramString, paramzg, paramzc, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramzv);
  }
  
  public void a(String paramString, zg paramzg, zc paramzc, float paramFloat1, float paramFloat2, zv paramzv)
  {
    a(paramString, paramzg, paramzc, paramFloat1, paramFloat2, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, paramzv);
  }
  
  private void a(String paramString, zg paramzg, zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zv paramzv)
  {
    if (paramzc == null) {
      throw new IllegalArgumentException("brush");
    }
    if (paramzg == null) {
      throw new IllegalArgumentException("font");
    }
    if ((paramzv != null) && (paramzv.b() != 0))
    {
      localObject1 = a(paramString, paramzg, paramzv, paramFloat3, paramFloat4, null);
      float f1 = paramFloat3;
      float f2 = paramFloat4;
      if (com.aspose.cells.b.a.zv.b(paramFloat3)) {
        f1 = f2 = 0.0F;
      }
      float f3 = paramzv.g() ? f1 - ((zt)localObject1).b() : f2 - ((zt)localObject1).c();
      float f4 = paramzv.b() == 1 ? f3 / 2.0F : f3;
      if (paramzv.g())
      {
        if ((!paramzv.h()) || (paramzv.b() != 2)) {
          paramFloat1 += f4;
        }
        if (!com.aspose.cells.b.a.zv.b(paramFloat3)) {
          paramFloat3 -= f3;
        }
      }
      else
      {
        paramFloat2 += f4;
        if (!com.aspose.cells.b.a.zv.b(paramFloat3)) {
          paramFloat4 -= f3;
        }
      }
    }
    Object localObject1 = this.a.getPaint();
    this.a.setPaint(paramzc.g());
    try
    {
      AffineTransform localAffineTransform = this.a.getTransform();
      try
      {
        int i = (com.aspose.cells.b.a.zv.b(paramFloat3)) || ((paramzv != null) && (paramzv.k())) ? 1 : 0;
        Shape localShape = null;
        if (i == 0)
        {
          localShape = this.a.getClip();
          this.a.clip(new Rectangle2D.Float(paramFloat1, paramFloat2, paramFloat3, paramFloat4));
        }
        try
        {
          zd localzd = new zd(paramString, paramzg, paramzv, paramFloat3, paramFloat4, this.a);
          this.a.transform(localzd.l());
          for (com.aspose.cells.b.a.b.d.a.zc localzc = localzd.m(); localzc != null; localzc = localzd.m()) {
            localzc.a(this.a, paramFloat1 * e[this.c], paramFloat2 * e[this.c]);
          }
        }
        finally
        {
          if (i != 0) {}
        }
      }
      finally
      {
        this.a.setTransform(localAffineTransform);
      }
    }
    finally
    {
      this.a.setPaint((Paint)localObject1);
    }
  }
  
  public void a(zc paramzc, zq paramzq)
  {
    a(paramzc, paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public void a(zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.a.setPaint(paramzc.g());
    this.a.fill(new Rectangle2D.Float(paramFloat1, paramFloat2, paramFloat3, paramFloat4));
  }
  
  public static zi a(zj paramzj)
  {
    zb localzb = new zb((Graphics2D)paramzj.f().getGraphics(), paramzj.i(), paramzj.h());
    return localzb;
  }
  
  public float f()
  {
    return 96.0F;
  }
  
  public zt a(String paramString, zg paramzg)
  {
    return a(paramString, paramzg, null, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, null);
  }
  
  public zt a(String paramString, zg paramzg, zt paramzt)
  {
    return a(paramString, paramzg, paramzt, null);
  }
  
  public zt a(String paramString, zg paramzg, zo paramzo, zv paramzv)
  {
    return a(paramString, paramzg, paramzv, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, null);
  }
  
  public zt a(String paramString, zg paramzg, zt paramzt, zv paramzv)
  {
    return a(paramString, paramzg, paramzv, paramzt.b(), paramzt.c(), null);
  }
  
  public zt a(String paramString, zg paramzg, int paramInt, zv paramzv)
  {
    return a(paramString, paramzg, paramzv, paramInt, Float.POSITIVE_INFINITY, null);
  }
  
  private final zt a(String paramString, zg paramzg, zv paramzv, float paramFloat1, float paramFloat2, int[] paramArrayOfInt)
  {
    try
    {
      if (paramArrayOfInt != null)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
      }
      String str = a(paramString, paramzg.b().b(), paramzg.k());
      zg localzg = new zg(str, paramzg.h(), paramzg.k());
      zd localzd = new zd(paramString, localzg, paramzv, paramFloat1, paramFloat2, this.a);
      float f1 = 0.0F;
      int i = 0;
      float f3;
      for (com.aspose.cells.b.a.b.d.a.zc localzc = localzd.m(); localzc != null; localzc = localzd.m())
      {
        i++;
        f3 = localzc.b();
        if (f3 > f1) {
          f1 = f3;
        }
      }
      if (i == 0) {
        return zt.a();
      }
      float f2 = localzd.j();
      if ((paramzv != null) && (paramzv.g()))
      {
        f3 = f2;
        f2 = f1;
        f1 = f3;
      }
      if ((paramzv == null) || (!paramzv.k()))
      {
        if (f1 > paramFloat1) {
          f1 = paramFloat1;
        }
        if (f2 > paramFloat2) {
          f2 = paramFloat2;
        }
      }
      if (paramArrayOfInt != null)
      {
        paramArrayOfInt[0] = i;
        paramArrayOfInt[1] = localzd.i();
      }
      if ((str.equals("Symbol")) && (paramString.length() == 1)) {
        f1 += 3.0F;
      }
      return new zt(f1, f2);
    }
    catch (Throwable localThrowable) {}
    return new zt(paramFloat1, paramFloat2);
  }
  
  public static String a(String paramString1, String paramString2, int paramInt)
    throws Exception
  {
    if (paramString1 == null) {
      paramString1 = "";
    }
    Object localObject = paramString2;
    zav localzav = zav.a();
    if (!localzav.a((String)localObject, paramInt, paramString1))
    {
      zis localzis = new zis();
      String str = localzis.a((String)localObject, paramInt, paramString1);
      if (str == null)
      {
        zgs localzgs = localzav.a(paramInt, paramString1);
        if (localzgs != null) {
          localObject = localzgs.a();
        } else {
          localObject = zcn.a;
        }
      }
      else
      {
        localObject = str;
      }
    }
    return (String)localObject;
  }
  
  public zf g()
  {
    return null;
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.a.scale(paramFloat1, paramFloat2);
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void b(int paramInt) {}
  
  public void c(int paramInt) {}
  
  public void a(com.aspose.cells.b.a.b.a.zi paramzi)
  {
    paramzi.a(this.d);
    this.a.setTransform(this.d.a());
  }
  
  public void a(Map<RenderingHints.Key, Object> paramMap)
  {
    this.a.setRenderingHints(paramMap);
  }
  
  public void a(RenderingHints.Key paramKey, Object paramObject)
  {
    this.a.setRenderingHint(paramKey, paramObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */