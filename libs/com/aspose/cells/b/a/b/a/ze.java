package com.aspose.cells.b.a.b.a;

import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.e.zf;
import com.aspose.cells.b.a.b.d.a.zc;
import com.aspose.cells.b.a.b.d.a.zd;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.b.zm;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zv;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.CubicCurve2D.Float;
import java.awt.geom.Ellipse2D.Float;
import java.awt.geom.Line2D.Float;
import java.awt.geom.PathIterator;

public class ze
  extends com.aspose.cells.b.a.b.e.za
{
  private com.aspose.cells.b.a.b.a.a.za a;
  
  public ze()
  {
    this(0);
  }
  
  public ze(com.aspose.cells.b.a.b.a.a.za paramza)
  {
    super(paramza);
    this.a = paramza;
  }
  
  public ze(int paramInt)
  {
    this(new com.aspose.cells.b.a.b.a.a.za());
    a(paramInt);
  }
  
  public ze(zo[] paramArrayOfzo, byte[] paramArrayOfByte)
  {
    this(paramArrayOfzo, paramArrayOfByte, 0);
  }
  
  public ze(zo[] paramArrayOfzo, byte[] paramArrayOfByte, int paramInt)
  {
    this(new com.aspose.cells.b.a.b.a.a.za());
    a(paramInt);
    a(paramArrayOfzo, paramArrayOfByte);
  }
  
  protected Object clone()
  {
    return new ze((com.aspose.cells.b.a.b.a.a.za)a().clone());
  }
  
  public com.aspose.cells.b.a.b.a.a.za a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0) {
      a().a(0);
    } else {
      a().a(1);
    }
  }
  
  public zj b()
  {
    return a().g();
  }
  
  public zo[] c()
  {
    return b().a();
  }
  
  public byte[] d()
  {
    return b().b();
  }
  
  public int e()
  {
    return a().f();
  }
  
  public ze f()
  {
    return (ze)clone();
  }
  
  public void g() {}
  
  public void h()
  {
    g();
  }
  
  public void a(zq paramzq, float paramFloat1, float paramFloat2)
  {
    a(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramFloat1, paramFloat2);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    Object localObject = null;
    if (paramFloat6 >= 360.0F)
    {
      localObject = new Ellipse2D.Float(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    }
    else
    {
      double d1 = paramFloat3 / paramFloat4;
      double d2 = d1 * d1;
      double d3 = a(d2, paramFloat5);
      double d4 = a(d2, paramFloat5 + paramFloat6) - d3;
      localObject = new Arc2D.Double(paramFloat1, paramFloat2, paramFloat3, paramFloat4, -d3, -d4, 0);
    }
    a().a((Shape)localObject);
  }
  
  public void a(zo paramzo1, zo paramzo2, zo paramzo3, zo paramzo4)
  {
    a(paramzo1.d(), paramzo1.e(), paramzo2.d(), paramzo2.e(), paramzo3.d(), paramzo3.e(), paramzo4.d(), paramzo4.e());
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    CubicCurve2D.Float localFloat = new CubicCurve2D.Float(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8);
    a().a(localFloat);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Ellipse2D.Float localFloat = new Ellipse2D.Float(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    a().a(localFloat, false);
  }
  
  public void a(zq paramzq)
  {
    a(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Line2D.Float localFloat = new Line2D.Float(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    a().a(localFloat);
  }
  
  public void a(zo paramzo1, zo paramzo2)
  {
    b(paramzo1.d(), paramzo1.e(), paramzo2.d(), paramzo2.e());
  }
  
  public void a(zo[] paramArrayOfzo)
  {
    if (paramArrayOfzo == null) {
      throw new IllegalArgumentException("points can not be null");
    }
    if (paramArrayOfzo.length == 0) {
      return;
    }
    if (a().e()) {
      a().b(paramArrayOfzo[0].d(), paramArrayOfzo[0].e());
    } else {
      a().a(paramArrayOfzo[0].d(), paramArrayOfzo[0].e());
    }
    for (int i = 1; i < paramArrayOfzo.length; i++) {
      a().a(paramArrayOfzo[i].d(), paramArrayOfzo[i].e());
    }
  }
  
  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    Object localObject = null;
    if (paramFloat6 >= 360.0F)
    {
      localObject = new Ellipse2D.Float(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    }
    else
    {
      double d1 = paramFloat3 / paramFloat4;
      double d2 = d1 * d1;
      double d3 = a(d2, paramFloat5);
      double d4 = a(d2, paramFloat5 + paramFloat6) - d3;
      localObject = new Arc2D.Double(paramFloat1, paramFloat2, paramFloat3, paramFloat4, -d3, -d4, 2);
    }
    a().a((Shape)localObject, false);
  }
  
  public void a(zp paramzp, float paramFloat1, float paramFloat2)
  {
    b(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f(), paramFloat1, paramFloat2);
  }
  
  public void b(zo[] paramArrayOfzo)
  {
    if (paramArrayOfzo == null) {
      throw new IllegalArgumentException("points can not be null");
    }
    if (paramArrayOfzo.length < 3) {
      throw new IllegalArgumentException("Invalid parameter used. points.length can not be less than three.");
    }
    a().b(paramArrayOfzo[0].d(), paramArrayOfzo[0].e());
    for (int i = 1; i < paramArrayOfzo.length; i++) {
      a().a(paramArrayOfzo[i].d(), paramArrayOfzo[i].e());
    }
    a().h();
  }
  
  public void c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a().b(paramFloat1, paramFloat2);
    a().a(paramFloat1 + paramFloat3, paramFloat2);
    a().a(paramFloat1 + paramFloat3, paramFloat2 + paramFloat4);
    a().a(paramFloat1, paramFloat2 + paramFloat4);
    a().h();
  }
  
  public void b(zq paramzq)
  {
    c(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  public void a(ze paramze, boolean paramBoolean)
  {
    if ((a().e()) || (paramze.a().e())) {
      paramBoolean = false;
    }
    a().a(paramze.a(), paramBoolean);
  }
  
  public zo i()
  {
    return a().m();
  }
  
  public void a(zi paramzi)
  {
    if (paramzi == null) {
      return;
    }
    a().a(paramzi.a());
  }
  
  public void c(zo[] paramArrayOfzo)
  {
    a(paramArrayOfzo, 0.5F);
  }
  
  public void a(zo[] paramArrayOfzo, float paramFloat)
  {
    a(paramArrayOfzo, 0, paramArrayOfzo.length - 1, paramFloat);
  }
  
  public void a(zo[] paramArrayOfzo, int paramInt1, int paramInt2, float paramFloat)
  {
    int i = paramInt2 + 1;
    int j = i * 2 + 4;
    float[] arrayOfFloat = new float[j];
    int k = paramInt1 + i;
    if (k == paramArrayOfzo.length)
    {
      k--;
      arrayOfFloat[(--j)] = paramArrayOfzo[k].e();
      arrayOfFloat[(--j)] = paramArrayOfzo[k].d();
    }
    while ((j > 0) && (k >= 0))
    {
      arrayOfFloat[(--j)] = paramArrayOfzo[k].e();
      arrayOfFloat[(--j)] = paramArrayOfzo[k].d();
      k--;
    }
    if (j > 0)
    {
      arrayOfFloat[1] = paramArrayOfzo[0].e();
      arrayOfFloat[0] = paramArrayOfzo[0].d();
    }
    a(arrayOfFloat, !a().e(), paramFloat);
  }
  
  void a(float[] paramArrayOfFloat, boolean paramBoolean, float paramFloat)
  {
    paramFloat /= 3.0F;
    if (paramBoolean) {
      a().a(paramArrayOfFloat[2], paramArrayOfFloat[3]);
    } else {
      a().b(paramArrayOfFloat[2], paramArrayOfFloat[3]);
    }
    float f1 = paramArrayOfFloat[4] - paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[5] - paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2] + paramFloat * f1;
    float f4 = paramArrayOfFloat[3] + paramFloat * f2;
    int i = 2;
    int j = paramArrayOfFloat.length - 4;
    while (i < j)
    {
      int k = i;
      int m = k++;
      int n = k++;
      int i1 = k++;
      int i2 = k++;
      int i3 = k++;
      int i4 = k++;
      f1 = paramArrayOfFloat[i3] - paramArrayOfFloat[m];
      f2 = paramArrayOfFloat[i4] - paramArrayOfFloat[n];
      float f5 = paramArrayOfFloat[i1] - paramFloat * f1;
      float f6 = paramArrayOfFloat[i2] - paramFloat * f2;
      a().a(f3, f4, f5, f6, paramArrayOfFloat[i1], paramArrayOfFloat[i2]);
      f3 = paramArrayOfFloat[i1] + paramFloat * f1;
      f4 = paramArrayOfFloat[i2] + paramFloat * f2;
      i += 2;
    }
  }
  
  public void a(String paramString, zh paramzh, int paramInt, float paramFloat, zn paramzn, zv paramzv)
  {
    a(paramString, new zg(paramzh, paramFloat, paramInt, 0), paramzn.a(), paramzn.b(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, paramzv);
  }
  
  public void a(String paramString, zh paramzh, int paramInt, float paramFloat, zq paramzq, zv paramzv)
  {
    a(paramString, new zg(paramzh, paramFloat, paramInt, 0), paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i(), paramzv);
  }
  
  void a(String paramString, zg paramzg, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zv paramzv)
  {
    try
    {
      String str1 = com.aspose.cells.b.a.b.zi.a(paramString, paramzg.b().b(), paramzg.k());
      if (!str1.equals(paramzg.b().b())) {
        paramzg = new zg(str1, paramzg.i(), paramzg.k());
      }
    }
    catch (Exception localException)
    {
      zf.a(localException);
    }
    String str2 = zbh.a(paramString);
    zd localzd = new zd(str2, paramzg, paramzv, paramFloat3, paramFloat4, null);
    int i = a().d();
    int j = 0;
    for (Object localObject = localzd.m(); localObject != null; localObject = localzd.m())
    {
      j++;
      TextLayout localTextLayout = new TextLayout(((zc)localObject).j(), paramzg.a(), localzd.a().getFontRenderContext());
      AffineTransform localAffineTransform = (AffineTransform)localzd.l().clone();
      if (localzd.g().g())
      {
        localAffineTransform.translate(paramFloat2 + ((zc)localObject).f(), -(paramFloat1 + ((zc)localObject).g()));
      }
      else
      {
        float f = paramFloat2 + ((zc)localObject).f();
        if (j == 1) {
          f += ((zc)localObject).e() / 2.0F;
        }
        localAffineTransform.translate(paramFloat1 + ((zc)localObject).g(), f);
      }
      a().a(localTextLayout.getOutline(localAffineTransform), false);
    }
    localObject = localzd.n();
    if (localObject != null) {
      a().a((AffineTransform)localObject, i, a().d() - i);
    }
  }
  
  public void j()
  {
    if (!a().e()) {
      a().h();
    }
  }
  
  public void k()
  {
    a().k();
  }
  
  public void a(zm paramzm)
  {
    a(paramzm, null);
  }
  
  public void a(zm paramzm, zi paramzi)
  {
    a(paramzm, paramzi, 0.6666667F);
  }
  
  public void a(zm paramzm, zi paramzi, float paramFloat)
  {
    if (paramzm == null) {
      throw new IllegalArgumentException("pen");
    }
    a(new com.aspose.cells.b.a.b.a.a.za(paramzm.p().createStrokedShape(this)));
    a(paramzi, paramFloat);
  }
  
  public void a(zi paramzi, float paramFloat)
  {
    AffineTransform localAffineTransform = null;
    if (paramzi != null) {
      localAffineTransform = paramzi.a();
    }
    PathIterator localPathIterator = a().getPathIterator(localAffineTransform, paramFloat);
    com.aspose.cells.b.a.b.a.a.za localza = new com.aspose.cells.b.a.b.a.a.za();
    localza.a(localPathIterator, false);
    a(localza);
  }
  
  private void a(zo[] paramArrayOfzo, byte[] paramArrayOfByte)
  {
    a().l();
    if ((paramArrayOfByte[0] & 0x7) != 0) {
      a().b(paramArrayOfzo[0].d(), paramArrayOfzo[0].e());
    }
    for (int i = 0; i < paramArrayOfzo.length; i++)
    {
      switch (paramArrayOfByte[i] & 0x7)
      {
      case 0: 
        a().b(paramArrayOfzo[i].d(), paramArrayOfzo[i].e());
        break;
      case 1: 
        a().a(paramArrayOfzo[i].d(), paramArrayOfzo[i].e());
        break;
      case 3: 
        float f1 = paramArrayOfzo[i].d();
        float f2 = paramArrayOfzo[i].e();
        i++;
        float f3 = paramArrayOfzo[i].d();
        float f4 = paramArrayOfzo[i].e();
        i++;
        float f5 = paramArrayOfzo[i].d();
        float f6 = paramArrayOfzo[i].e();
        a().a(f1, f2, f3, f4, f5, f6);
      }
      if ((paramArrayOfByte[i] & 0x80) != 0) {
        a().h();
      }
      if ((paramArrayOfByte[i] & 0x20) != 0) {
        a().j();
      }
    }
  }
  
  private static double a(double paramDouble1, double paramDouble2)
  {
    double d1 = Math.toRadians(paramDouble2);
    double d2 = Math.tan(d1);
    double d3 = 1.0D / Math.sqrt(paramDouble1 * (d2 * d2) + 1.0D);
    double d4 = Math.acos(d3);
    double d5 = Math.toDegrees(d4);
    int i = Math.abs((int)paramDouble2) / 90;
    switch (i & 0x3)
    {
    case 1: 
      d5 = 180.0D - d5;
      break;
    case 2: 
      d5 = 180.0D + d5;
      break;
    case 3: 
      d5 = 360.0D - d5;
    }
    if (paramDouble2 < 0.0D) {
      d5 = -d5;
    }
    d5 += (int)paramDouble2 / 360 * 360;
    return d5;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */