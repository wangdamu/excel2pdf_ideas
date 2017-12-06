package com.aspose.cells.b.a.b;

import com.aspose.cells.ImageFormat;
import com.aspose.cells.a.d.zao;
import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.d.zcy;
import com.aspose.cells.a.d.zl;
import com.aspose.cells.b.a.b.b.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.zis;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import javax.imageio.ImageIO;

public abstract class zj
{
  protected BufferedImage a = null;
  protected ImageFormat b;
  protected zs c;
  protected float d = 96.0F;
  protected float e = 96.0F;
  public byte[] f;
  
  protected zj() {}
  
  protected zj(BufferedImage paramBufferedImage, ImageFormat paramImageFormat)
  {
    a(paramBufferedImage, paramImageFormat);
  }
  
  public abstract zj a();
  
  public void d()
  {
    this.a = null;
  }
  
  public ImageFormat e()
  {
    return this.b;
  }
  
  public static zj a(String paramString)
    throws Exception
  {
    return new za(paramString);
  }
  
  public static zj a(zm paramzm)
    throws Exception
  {
    switch (zcc.a(paramzm))
    {
    case 1: 
    case 2: 
      return new zf(paramzm);
    }
    return new za(paramzm);
  }
  
  protected void a(BufferedImage paramBufferedImage, ImageFormat paramImageFormat)
  {
    this.a = paramBufferedImage;
    this.c = new zs(this.a.getWidth(), this.a.getHeight());
    this.b = paramImageFormat;
  }
  
  public void b() {}
  
  public BufferedImage f()
  {
    if (this.a != null) {
      return this.a;
    }
    if (this.f != null)
    {
      int i = i();
      int j = h();
      if (i < 0) {
        i = 1;
      }
      if (j < 0) {
        j = 1;
      }
      zo localzo = new zo(0.0F, 0.0F);
      zt localzt = new zt(a(i), a(j));
      com.aspose.cells.a.d.zo localzo1 = new com.aspose.cells.a.d.zo(localzt);
      zl localzl = new zl(localzo, localzt, this.f);
      try
      {
        zis localzis = new zis();
        com.aspose.cells.a.d.zb localzb = zcy.a(localzl, localzis);
        localzo1.a(localzb);
        this.a = new BufferedImage(i, j, 5);
        Graphics2D localGraphics2D = this.a.createGraphics();
        zbh localzbh = new zbh(localzis);
        localzbh.a(localzo1, localGraphics2D, 0.0F, 0.0F, 1.0F);
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    return this.a;
  }
  
  private float a(float paramFloat)
  {
    return (float)zao.c(paramFloat);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.d = paramFloat1;
    this.e = paramFloat2;
  }
  
  public int g()
  {
    int i = 0;
    if (this.a.isAlphaPremultiplied()) {
      i |= 0x2;
    }
    int j = 3;
    j = this.a.getTransparency();
    if (j == 3) {
      i |= 0x4;
    }
    int k = this.a.getType();
    switch (k)
    {
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      i |= 0x10;
      break;
    case 10: 
    case 11: 
      i |= 0x40;
      break;
    }
    if (k == 5) {
      i |= 0x4;
    }
    return i;
  }
  
  public int h()
  {
    return this.a.getHeight();
  }
  
  public int i()
  {
    return this.a.getWidth();
  }
  
  public float j()
  {
    return this.d;
  }
  
  public float k()
  {
    return this.e;
  }
  
  public com.aspose.cells.b.a.b.b.za l()
  {
    throw new com.aspose.cells.a.c.zb("");
  }
  
  public int c()
  {
    return 139273;
  }
  
  public static int a(int paramInt)
  {
    return 24;
  }
  
  public zs m()
  {
    return this.c;
  }
  
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 397319: 
    case 925707: 
    case 2498570: 
      return true;
    }
    return false;
  }
  
  public void a(zm paramzm, ImageFormat paramImageFormat)
    throws Exception
  {
    a(paramzm.j(), paramImageFormat);
  }
  
  private void a(OutputStream paramOutputStream, ImageFormat paramImageFormat)
    throws Exception
  {
    String str = ImageFormat.a(paramImageFormat);
    if (str == null) {
      str = "BMP";
    }
    ImageIO.write(this.a, str, paramOutputStream);
    paramOutputStream.flush();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */