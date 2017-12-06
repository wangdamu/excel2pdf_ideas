package com.aspose.cells;

import com.aspose.cells.a.d.zao;
import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zcf;
import com.aspose.cells.a.d.zcy;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.d.a.zd;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zr;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.d.zm;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.imageio.ImageIO;

class zav
  extends zg
{
  private static boolean v = true;
  private static boolean w = true;
  private zbic x;
  private Graphics2D y;
  private BufferedImage z;
  private ImageFormat A;
  
  public zav(int paramInt1, int paramInt2, ImageFormat paramImageFormat, ImageOrPrintOptions paramImageOrPrintOptions, zm paramzm, zbic paramzbic, zhb paramzhb)
  {
    super(paramInt1, paramInt2, paramImageFormat, paramImageOrPrintOptions, paramzm, paramzbic, paramzhb);
    this.x = paramzbic;
    if (paramzbic != null) {
      this.x.a(this);
    }
    this.A = paramImageFormat;
    o();
  }
  
  public zav() {}
  
  private void o()
  {
    int i = a(this.m);
    this.z = new BufferedImage(p(), q(), i);
    this.y = this.z.createGraphics();
    if ((this.n != null) && (this.n.h.size() > 0))
    {
      this.y.setRenderingHints(this.n.h);
      if ((this.n.h.containsKey(RenderingHints.KEY_ANTIALIASING)) && ((this.n.h.containsValue(RenderingHints.VALUE_ANTIALIAS_ON)) || (this.n.h.containsValue(RenderingHints.VALUE_ANTIALIAS_DEFAULT)))) {
        a(4, false);
      }
      if ((this.n.h.containsKey(RenderingHints.KEY_TEXT_ANTIALIASING)) && ((this.n.h.containsValue(RenderingHints.VALUE_TEXT_ANTIALIAS_ON)) || (this.n.h.containsValue(RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT)) || (this.n.h.containsValue(RenderingHints.VALUE_TEXT_ANTIALIAS_GASP)))) {
        b(4, false);
      }
    }
  }
  
  public ImageOrPrintOptions k()
  {
    return this.n;
  }
  
  private int p()
  {
    if (this.n == null) {
      return this.k;
    }
    return (int)Math.ceil(this.k * this.n.getHorizontalResolution() / 96.0F);
  }
  
  private int q()
  {
    if (this.n == null) {
      return this.l;
    }
    return (int)Math.ceil(this.l * this.n.getVerticalResolution() / 96.0F);
  }
  
  public za m()
    throws Exception
  {
    if (this.m.equals(ImageFormat.getEmf())) {
      return null;
    }
    if (this.z == null)
    {
      int i = a(this.m);
      this.z = new BufferedImage(p(), q(), i);
      this.y = this.z.createGraphics();
    }
    com.aspose.cells.a.d.zo localzo = r();
    zbh localzbh = new zbh(this.u);
    localzbh.a(localzo, this.y, 0.0F, 0.0F, 1.0F);
    return new za(this.z, this.A);
  }
  
  public void a(zj paramzj, com.aspose.cells.b.a.b.zp paramzp, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramzj == null) {
      return;
    }
    if ((paramzj instanceof za))
    {
      BufferedImage localBufferedImage1 = paramzj.f();
      if (localBufferedImage1 == null) {
        return;
      }
      paramInt1 = paramInt1 < 0 ? 0 : paramInt1;
      paramInt2 = paramInt2 < 0 ? 0 : paramInt2;
      paramInt3 = paramInt3 > localBufferedImage1.getWidth() ? localBufferedImage1.getWidth() : paramInt3;
      paramInt4 = paramInt4 > localBufferedImage1.getHeight() ? localBufferedImage1.getHeight() : paramInt4;
      if (paramInt4 > localBufferedImage1.getHeight() - paramInt2) {
        paramInt4 = localBufferedImage1.getHeight() - paramInt2;
      }
      if (paramInt3 > localBufferedImage1.getWidth() - paramInt1) {
        paramInt3 = localBufferedImage1.getWidth() - paramInt1;
      }
      BufferedImage localBufferedImage2 = new BufferedImage(paramInt3, paramInt4, localBufferedImage1.getType());
      Raster localRaster = localBufferedImage1.getData(new Rectangle(paramInt1, paramInt2, paramInt3, paramInt4)).createTranslatedChild(0, 0);
      localBufferedImage2.setData(localRaster);
      a(new za(localBufferedImage2, paramzj.e()), paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    }
    if ((paramzj instanceof com.aspose.cells.b.a.b.b.zf)) {
      a(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f(), paramzj);
    }
  }
  
  protected void b(zr paramzr, int paramInt)
  {
    zr localzr = paramzr;
    switch (paramInt)
    {
    case 0: 
      localzr = paramzr;
      break;
    default: 
      localzr = paramzr;
    }
    this.b.a(localzr);
    com.aspose.cells.a.d.zp localzp = zaee.a(localzr, this);
    localzp.a(this.b.b().b());
    zb localzb = new zb();
    localzb.a(localzp);
    this.f.a(localzb);
    this.f = localzb;
    b(this.b.d());
    c(this.b.e());
  }
  
  protected void a(String paramString, com.aspose.cells.b.a.b.zg paramzg, com.aspose.cells.b.a.b.zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zv paramzv)
  {
    if (paramzc == null) {
      throw new IllegalArgumentException("brush");
    }
    if (paramzg == null) {
      throw new IllegalArgumentException("font");
    }
    int i = 0;
    if (paramzv != null) {
      i = (paramzv.d() & 0x2) != 0 ? 1 : 0;
    }
    if (i != 0) {
      throw new IllegalArgumentException("DrawString in Vertical not supported.");
    }
    b(paramString, paramzg, paramzc, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramzv);
  }
  
  private void b(String paramString, com.aspose.cells.b.a.b.zg paramzg, com.aspose.cells.b.a.b.zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zv paramzv)
  {
    try
    {
      String str1 = zbxz.a(paramString, paramzg.b().b(), paramzg.k());
      zbj localzbj = new zbj(str1, a(paramzg), paramzg.k());
      com.aspose.cells.b.a.b.zg localzg = new com.aspose.cells.b.a.b.zg(str1, paramzg.h(), paramzg.k());
      if ((paramzv != null) && (paramzv.b() != 0))
      {
        f1 = 0.0F;
        localObject = a(paramString, localzg, new zt(paramFloat3, paramFloat4), paramzv);
        if (paramzv.b() == 1) {
          f1 = (paramFloat4 - ((zt)localObject).c()) / 2.0F;
        } else if (paramzv.b() == 2) {
          f1 = paramFloat4 - ((zt)localObject).c();
        }
        paramFloat2 += f1;
      }
      float f1 = 0.0F;
      Object localObject = new zd(paramString, localzg, paramzv, paramFloat3, paramFloat4, this.y);
      int i = 0;
      for (com.aspose.cells.b.a.b.d.a.zc localzc = ((zd)localObject).m(); localzc != null; localzc = ((zd)localObject).m())
      {
        i++;
        String str2 = localzc.j();
        float f2 = localzc.c() + localzc.d();
        if (i == 1) {
          f2 += localzc.e();
        }
        f2 = ((zd)localObject).b(f2);
        f1 += f2;
        if ((paramzv != null) && (paramzv.i()) && (f1 > paramFloat4)) {
          break;
        }
        if (i == 1) {
          a(str2, localzbj, paramzc, paramFloat1 + localzc.g(), paramFloat2 + localzc.e());
        } else {
          a(str2, localzbj, paramzc, paramFloat1 + localzc.g(), paramFloat2);
        }
        paramFloat2 += f2;
      }
    }
    catch (Exception localException)
    {
      com.aspose.cells.a.e.zf.a(localException);
    }
  }
  
  protected void a(String paramString, zbj paramzbj, com.aspose.cells.b.a.b.zc paramzc, float paramFloat1, float paramFloat2)
  {
    com.aspose.cells.a.d.zh localzh = new com.aspose.cells.a.d.zh();
    localzh.a(this.b.b().b());
    localzh.a(paramString);
    localzh.a(paramzbj);
    if ((paramzc instanceof zu)) {
      localzh.a(Color.fromArgb(((zu)paramzc).a().toArgb()));
    } else {
      localzh.a(Color.getBlack());
    }
    int i = zao.b(localzh.d().h(), g());
    localzh.a(new com.aspose.cells.b.a.b.zo(b(paramFloat1), b(paramFloat2 + i)));
    if (paramzbj.g()) {
      localzh.c = 1;
    }
    this.f.a(localzh);
  }
  
  protected void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, zj paramzj)
  {
    if (paramzj == null) {
      return;
    }
    byte[] arrayOfByte = null;
    try
    {
      Object localObject1;
      Object localObject2;
      if ((paramzj instanceof za))
      {
        localObject1 = ImageFormat.a(paramzj.e());
        if (localObject1 == null) {
          localObject1 = "PNG";
        }
        localObject2 = new ByteArrayOutputStream();
        ImageIO.write(paramzj.f(), (String)localObject1, (OutputStream)localObject2);
        arrayOfByte = ((ByteArrayOutputStream)localObject2).toByteArray();
      }
      else if ((paramzj instanceof com.aspose.cells.b.a.b.b.zf))
      {
        localObject1 = new com.aspose.cells.a.d.zl(new com.aspose.cells.b.a.b.zo(b(paramFloat1), b(paramFloat2)), new zt(b(paramFloat3), b(paramFloat4)), paramzj.f);
        localObject2 = zcy.a((com.aspose.cells.a.d.zl)localObject1, this.u);
        zb localzb = new zb();
        localzb.a(this.b.b().b());
        localzb.a((zn)localObject2);
        this.f.a(localzb);
      }
      if (arrayOfByte != null)
      {
        localObject1 = new com.aspose.cells.a.d.zl(new com.aspose.cells.b.a.b.zo(b(paramFloat1), b(paramFloat2)), new zt(b(paramFloat3), b(paramFloat4)), arrayOfByte);
        localObject2 = new zb();
        ((zb)localObject2).a(this.b.b().b());
        ((zb)localObject2).a((zn)localObject1);
        this.f.a((zn)localObject2);
      }
    }
    catch (Exception localException)
    {
      com.aspose.cells.a.c.zl.b(localException);
    }
  }
  
  public float c(float paramFloat1, float paramFloat2)
  {
    return (float)zao.c(paramFloat1, paramFloat2);
  }
  
  public float b(float paramFloat)
  {
    return c(paramFloat, f());
  }
  
  public void l()
    throws Exception
  {
    if (this.z == null)
    {
      int i = a(this.m);
      this.z = new BufferedImage(p(), q(), i);
      this.y = this.z.createGraphics();
    }
    com.aspose.cells.a.d.zo localzo = r();
    float f1 = this.n == null ? 1.0F : this.n.getHorizontalResolution() / 96.0F;
    float f2 = this.n == null ? 1.0F : this.n.getVerticalResolution() / 96.0F;
    Object localObject;
    if (this.m.equals(ImageFormat.getEmf()))
    {
      localObject = new com.aspose.cells.a.d.zg(this.u);
      ((com.aspose.cells.a.d.zg)localObject).a(localzo, this.o.j(), 0.0F, 0.0F, f1, f2);
    }
    else
    {
      localObject = b(this.m);
      if (localObject == null) {
        throw new Exception(" Image format(" + this.m.getName() + ") is not supported.");
      }
      zbh localzbh = new zbh(this.u);
      localzbh.a(localzo, this.y, 0.0F, 0.0F, f1, f2);
      OutputStream localOutputStream = this.o.j();
      String str = ((String)localObject).toUpperCase();
      if ((str.equals("JPG")) || (str.equals("JPEG")))
      {
        zcf.a(this.z, this.n, localOutputStream);
      }
      else
      {
        ImageIO.write(this.z, (String)localObject, localOutputStream);
        localOutputStream.flush();
      }
    }
  }
  
  public zb n()
    throws Exception
  {
    if (this.x != null) {
      this.x.aq();
    }
    return this.e;
  }
  
  private com.aspose.cells.a.d.zo r()
    throws Exception
  {
    if (this.x != null) {
      this.x.aq();
    }
    float f1 = (float)zao.c(this.k, f());
    float f2 = (float)zao.c(this.l, g());
    com.aspose.cells.a.d.zo localzo = new com.aspose.cells.a.d.zo(new zt(f1, f2));
    localzo.a(this.e);
    return localzo;
  }
  
  private float a(com.aspose.cells.b.a.b.zg paramzg)
  {
    float f = 10.0F;
    if (paramzg.m() == 3) {
      f = paramzg.h();
    } else if ((paramzg.m() == 2) || (paramzg.m() == 1)) {
      f = (float)zao.c(paramzg.h(), f());
    } else {
      throw new UnsupportedOperationException();
    }
    return f * this.a;
  }
  
  private int a(ImageFormat paramImageFormat)
  {
    if (this.m.equals(ImageFormat.getPng())) {
      return 2;
    }
    return 5;
  }
  
  private String b(ImageFormat paramImageFormat)
  {
    return ImageFormat.a(paramImageFormat);
  }
  
  public void b(int paramInt)
  {
    super.b(paramInt);
    if (this.f != null) {
      switch (paramInt)
      {
      case 0: 
      case 3: 
        this.f.a(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        this.f.a(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_DEFAULT);
        break;
      case 2: 
      case 4: 
        this.f.a(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.f.a(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        break;
      case 1: 
        this.f.a(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        this.f.a(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
        break;
      case -1: 
        break;
      }
    }
  }
  
  public void c(int paramInt)
  {
    super.c(paramInt);
    if (this.f != null) {
      switch (paramInt)
      {
      case 4: 
        this.f.a(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        break;
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 5: 
        this.f.a(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        break;
      }
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) || (this.n == null))
    {
      b(paramInt);
    }
    else
    {
      super.b(paramInt);
      if (this.f != null) {
        switch (paramInt)
        {
        case 0: 
        case 3: 
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_ANTIALIASING))) {
            this.f.a(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
          }
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_RENDERING))) {
            this.f.a(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_DEFAULT);
          }
          break;
        case 2: 
        case 4: 
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_ANTIALIASING))) {
            this.f.a(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          }
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_RENDERING))) {
            this.f.a(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
          }
          break;
        case 1: 
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_ANTIALIASING))) {
            this.f.a(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
          }
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_RENDERING))) {
            this.f.a(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
          }
          break;
        case -1: 
          break;
        }
      }
    }
  }
  
  public void b(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) || (this.n == null))
    {
      c(paramInt);
    }
    else
    {
      super.c(paramInt);
      if (this.f != null) {
        switch (paramInt)
        {
        case 4: 
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_TEXT_ANTIALIASING))) {
            this.f.a(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
          }
          break;
        case 0: 
        case 1: 
        case 2: 
        case 3: 
        case 5: 
          if ((this.n == null) || (!this.n.h.containsKey(RenderingHints.KEY_TEXT_ANTIALIASING))) {
            this.f.a(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
          }
          break;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */