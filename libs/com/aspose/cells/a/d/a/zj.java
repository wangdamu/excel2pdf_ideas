package com.aspose.cells.a.d.a;

import com.aspose.cells.a.d.a.a.zab;
import com.aspose.cells.a.d.a.a.zac;
import com.aspose.cells.a.d.a.a.zae;
import com.aspose.cells.a.d.a.a.zaf;
import com.aspose.cells.a.d.a.a.zai;
import com.aspose.cells.a.d.a.a.zaj;
import com.aspose.cells.a.d.a.a.zaq;
import com.aspose.cells.a.d.a.a.zat;
import com.aspose.cells.a.d.a.a.zbq;
import com.aspose.cells.a.d.a.a.zbs;
import com.aspose.cells.a.d.a.a.zbv;
import com.aspose.cells.a.d.a.a.zbw;
import com.aspose.cells.a.d.a.a.zca;
import com.aspose.cells.a.d.a.a.zcc;
import com.aspose.cells.a.d.a.a.zcg;
import com.aspose.cells.a.d.a.a.zci;
import com.aspose.cells.a.d.a.a.zcj;
import com.aspose.cells.a.d.a.a.zck;
import com.aspose.cells.a.d.a.a.zcl;
import com.aspose.cells.a.d.a.a.zcm;
import com.aspose.cells.a.d.a.a.zcr;
import com.aspose.cells.a.d.a.a.zcs;
import com.aspose.cells.a.d.a.a.zcu;
import com.aspose.cells.a.d.a.a.zcx;
import com.aspose.cells.a.d.a.b.zaa;
import com.aspose.cells.a.d.a.b.zg;
import com.aspose.cells.a.d.a.b.zn;
import com.aspose.cells.a.d.a.b.zp;
import com.aspose.cells.a.d.a.b.zq;
import com.aspose.cells.a.d.a.b.zt;
import com.aspose.cells.a.d.a.b.zv;
import com.aspose.cells.a.d.a.b.zw;
import com.aspose.cells.a.d.a.b.zy;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D.Float;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import javax.imageio.ImageIO;

public class zj
{
  private final zk a;
  private int b = 1;
  private zh c = null;
  private ByteArrayOutputStream d = null;
  private zd e = new zd();
  private Rectangle f;
  private Dimension g;
  private Dimension h;
  private zf i;
  private com.aspose.cells.a.d.a.b.zs[] j;
  private int k = 0;
  private int l = 0;
  private zaa m;
  private int n = 0;
  private boolean o = false;
  private int p = -1;
  
  public zj(Rectangle paramRectangle, Dimension paramDimension1, Dimension paramDimension2, zk paramzk)
  {
    this.a = paramzk;
    this.f = paramRectangle;
    this.g = paramDimension1;
    this.h = paramDimension2;
    this.i = new zf(this, this.c, paramRectangle);
    if (paramzk.a)
    {
      this.j = new com.aspose.cells.a.d.a.b.zs[8];
      this.m = new zaa(this.j, 0);
      this.j[0] = new com.aspose.cells.a.d.a.b.zh();
      this.m.a(1);
      this.c.a(this.m);
    }
  }
  
  public zc a()
  {
    zc localzc = new zc(this, this.f);
    return localzc;
  }
  
  public void a(OutputStream paramOutputStream)
    throws IOException
  {
    g();
    if (this.a.a) {
      b(new com.aspose.cells.a.d.a.b.zf());
    }
    this.c.a(new com.aspose.cells.a.d.a.a.zx());
    byte[] arrayOfByte = this.d.toByteArray();
    int i1 = arrayOfByte.length;
    int i2 = this.c.g();
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    zb localzb = new zb(localByteArrayOutputStream, true);
    i2++;
    ze localze = new ze(this.f, this.b, 0, i1, i2, this.e.c(), this.g, this.h);
    localze.a(localzb);
    paramOutputStream.write(localByteArrayOutputStream.toByteArray());
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.flush();
  }
  
  public void a(int paramInt)
  {
    this.c.a(new zcc(paramInt));
  }
  
  public void b(int paramInt)
  {
    this.c.a(new zcj(paramInt));
  }
  
  public void c(int paramInt)
  {
    this.c.a(new zck(paramInt));
  }
  
  public void d(int paramInt)
  {
    this.c.a(new zcl(paramInt));
  }
  
  public void a(Color paramColor)
  {
    this.c.a(new zcm(paramColor));
  }
  
  public void e(int paramInt)
  {
    this.c.a(new zci(paramInt));
  }
  
  public void a(Rectangle paramRectangle, int paramInt1, int paramInt2)
  {
    if (this.a.a)
    {
      b(new com.aspose.cells.a.d.a.b.zd(paramInt2, paramInt1));
      this.c.a(new zcu(paramRectangle));
      d();
    }
    else
    {
      this.c.a(new zcu(paramRectangle));
    }
  }
  
  public void b(Rectangle paramRectangle, int paramInt1, int paramInt2)
  {
    if (this.a.a)
    {
      b(new zg(paramInt2, paramInt1));
      this.c.a(new zaj(paramRectangle));
      d();
    }
    else
    {
      this.c.a(new zaj(paramRectangle));
    }
  }
  
  public void a(Rectangle paramRectangle, int paramInt1, float paramFloat1, float paramFloat2, zcx paramzcx, Color paramColor, int paramInt2)
  {
    if (this.a.a)
    {
      if (this.p < 0)
      {
        this.p = (this.e.a() - 1);
        a(new zq(this.p));
      }
      b(new com.aspose.cells.a.d.a.b.ze(paramColor, paramInt2 - 1, this.p, paramzcx.a(), paramRectangle));
      this.c.a(new zai(paramRectangle, paramInt1, paramFloat1, paramFloat2, paramzcx));
      d();
    }
    else
    {
      this.c.a(new zai(paramRectangle, paramInt1, paramFloat1, paramFloat2, paramzcx));
    }
  }
  
  public void f(int paramInt)
  {
    this.c.a(new zca(paramInt));
  }
  
  protected void a(RenderedImage paramRenderedImage, Color paramColor)
  {
    BufferedImage localBufferedImage = (BufferedImage)paramRenderedImage;
    float f1 = a(paramRenderedImage.getWidth());
    float f2 = a(paramRenderedImage.getHeight());
    zcs localzcs = new zcs(this.f, 0, (int)f2, (int)f1, -(int)f2, localBufferedImage, paramColor);
    if (this.a.a)
    {
      byte[] arrayOfByte = null;
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(paramRenderedImage, "PNG", localByteArrayOutputStream);
        arrayOfByte = localByteArrayOutputStream.toByteArray();
      }
      catch (Exception localException)
      {
        com.aspose.cells.a.c.zl.b(localException);
      }
      if (arrayOfByte != null)
      {
        b(new zn(this.e.c() - 1, new com.aspose.cells.a.d.a.b.zj(arrayOfByte)));
        Rectangle2D.Float localFloat = new Rectangle2D.Float(0.0F, 0.0F, f1, f2);
        b(new com.aspose.cells.a.d.a.b.zc(this.e.c() - 1, new Rectangle2D.Float(0.0F, 0.0F, paramRenderedImage.getWidth(), paramRenderedImage.getHeight()), localFloat));
        this.c.a(localzcs);
        d();
      }
      else
      {
        this.c.a(localzcs);
      }
    }
    else
    {
      this.c.a(localzcs);
    }
  }
  
  public void a(AffineTransform paramAffineTransform, int paramInt)
  {
    if (this.a.a) {
      switch (paramInt)
      {
      case 2: 
        a(new zy(paramAffineTransform, true));
        break;
      case 3: 
        a(new zy(paramAffineTransform, false));
      }
    }
    this.c.a(new zat(paramAffineTransform, paramInt));
  }
  
  public void a(AffineTransform paramAffineTransform)
  {
    if (this.a.a) {
      a(new com.aspose.cells.a.d.a.b.zz(paramAffineTransform));
    }
    this.c.a(new zcr(paramAffineTransform));
  }
  
  public void g(int paramInt)
  {
    this.c.a(new zbw(paramInt));
  }
  
  public void h(int paramInt)
  {
    this.c.a(new com.aspose.cells.a.d.a.a.zu(paramInt));
    this.e.a(paramInt);
  }
  
  public void b()
  {
    if (this.a.a)
    {
      a(new com.aspose.cells.a.d.a.b.zu(this.n));
      this.n += 1;
    }
    this.c.a(new zbs());
  }
  
  public void c()
  {
    if (this.a.a)
    {
      this.n -= 1;
      a(new zt(this.n));
    }
    this.c.a(new zbq());
  }
  
  public void a(com.aspose.cells.a.d.a.b.zs paramzs)
  {
    switch (paramzs.b())
    {
    case 16414: 
    case 16426: 
      if (this.k > 0)
      {
        if (paramzs.b() == this.j[(this.k - 1)].b())
        {
          this.j[(this.k - 1)] = paramzs;
          return;
        }
        if (this.k == 7) {
          f();
        }
      }
      break;
    case 16392: 
      if (this.k == 7) {
        f();
      }
      if (((com.aspose.cells.a.d.a.b.zk)paramzs).a() == 3) {
        this.o = true;
      }
      break;
    default: 
      if (this.k == 7) {
        f();
      }
      break;
    }
    this.j[this.k] = paramzs;
    this.k += 1;
    this.l += paramzs.c();
    if (this.l > 8192) {
      f();
    }
  }
  
  private void f()
  {
    this.m.a(this.k, this.l);
    this.c.a(this.m);
    this.k = 0;
    this.l = 0;
    this.o = false;
  }
  
  private void b(com.aspose.cells.a.d.a.b.zs paramzs)
  {
    this.j[this.k] = paramzs;
    this.k += 1;
    this.l += paramzs.c();
    this.m.a(this.k, this.l);
    this.c.a(this.m);
    this.k = 0;
    this.l = 0;
    this.o = false;
  }
  
  public void d() {}
  
  public void i(int paramInt)
  {
    if (this.a.a) {
      a(new zv(paramInt));
    }
  }
  
  public void j(int paramInt)
  {
    if (this.a.a) {
      a(new com.aspose.cells.a.d.a.b.zx(paramInt));
    }
  }
  
  public int a(Shape paramShape)
  {
    if (this.o) {
      f();
    }
    boolean bool = zf.a(paramShape);
    this.c.a(new zci(bool ? 1 : 2));
    int i1 = this.e.a();
    this.c.a(new com.aspose.cells.a.d.a.a.zm());
    this.i.a(paramShape, i1);
    this.c.a(new com.aspose.cells.a.d.a.a.zz());
    return i1;
  }
  
  public int b(Shape paramShape)
  {
    int i1 = a(paramShape);
    this.c.a(new zbv(5));
    if (this.a.a) {
      a(new zw(0, i1 - 1));
    }
    return i1;
  }
  
  public boolean e()
  {
    return this.a.a;
  }
  
  public int a(BasicStroke paramBasicStroke, Color paramColor, Stroke paramStroke, AffineTransform paramAffineTransform)
  {
    int i1 = 65536;
    switch (paramBasicStroke.getEndCap())
    {
    case 0: 
      i1 |= 0x200;
      break;
    case 1: 
      i1 |= 0x0;
      break;
    case 2: 
      i1 |= 0x100;
    }
    switch (paramBasicStroke.getLineJoin())
    {
    case 0: 
      i1 |= 0x2000;
      break;
    case 1: 
      i1 |= 0x0;
      break;
    case 2: 
      i1 |= 0x1000;
    }
    float[] arrayOfFloat = paramBasicStroke.getDashArray();
    float f1 = a(paramBasicStroke.getLineWidth());
    if (f1 < 1.0F) {
      f1 = 1.0F;
    }
    zaf localzaf = new zaf(i1, f1 < 1.0F ? 1 : (int)f1, paramColor, arrayOfFloat);
    int i2 = this.e.a();
    this.c.a(new zac(i2, localzaf));
    if (this.a.a) {
      a(new zp(i2 - 1, new com.aspose.cells.a.d.a.b.zr(0, f1, i1, arrayOfFloat, paramAffineTransform), new com.aspose.cells.a.d.a.b.zb(paramColor)));
    }
    this.c.a(new zbw(i2));
    if (paramStroke != null)
    {
      if ((!(paramStroke instanceof BasicStroke)) || (((BasicStroke)paramStroke).getMiterLimit() != paramBasicStroke.getMiterLimit())) {
        this.c.a(new zcg((int)a(paramBasicStroke.getMiterLimit())));
      }
    }
    else {
      this.c.a(new zcg((int)a(paramBasicStroke.getMiterLimit())));
    }
    return i2;
  }
  
  public int a(Paint paramPaint)
  {
    int i1 = this.e.a();
    Object localObject;
    if ((paramPaint instanceof Color))
    {
      localObject = (Color)paramPaint;
      int i2 = ((Color)localObject).getAlpha() == 0 ? 1 : 0;
      zaq localzaq1 = new zaq(i2, (Color)localObject, 0);
      if (this.a.a) {
        a(new com.aspose.cells.a.d.a.b.zl(i1 - 1, new com.aspose.cells.a.d.a.b.zb((Color)localObject)));
      }
      this.c.a(new com.aspose.cells.a.d.a.a.zr(i1, localzaq1));
    }
    else if ((paramPaint instanceof TexturePaint))
    {
      localObject = (TexturePaint)paramPaint;
      this.c.a(new com.aspose.cells.a.d.a.a.zs(i1, ((TexturePaint)localObject).getImage()));
    }
    else if ((paramPaint instanceof GradientPaint))
    {
      localObject = (GradientPaint)paramPaint;
      Color localColor = ((GradientPaint)localObject).getColor1();
      int i3 = 0;
      zaq localzaq2 = new zaq(i3, localColor, 0);
      this.c.a(new com.aspose.cells.a.d.a.a.zr(i1, localzaq2));
    }
    this.c.a(new zbw(i1));
    return i1;
  }
  
  public int a(Font paramFont, Map<TextAttribute, ?> paramMap)
  {
    zae localzae = new zae(paramFont, paramMap);
    int i1 = this.e.a();
    if (this.a.a) {
      a(new com.aspose.cells.a.d.a.b.zm(i1 - 1, paramFont.getSize2D(), 0, localzae.a(), paramFont.getFamily()));
    }
    this.c.a(new zab(i1, localzae));
    return i1;
  }
  
  private void g()
  {
    for (;;)
    {
      int i1 = this.e.b();
      if (i1 < 0) {
        break;
      }
      h(i1);
    }
  }
  
  private float a(double paramDouble)
  {
    return (float)Math.floor(paramDouble * 1.0D * 20.0D);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */