package com.aspose.cells.b.a.b;

import com.aspose.cells.Color;
import com.aspose.cells.ImageFormat;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zm;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.util.Iterator;
import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class za
  extends zj
{
  public za(BufferedImage paramBufferedImage, ImageFormat paramImageFormat)
  {
    super(paramBufferedImage, paramImageFormat);
  }
  
  public za(zj paramzj)
  {
    this(paramzj, paramzj.m());
  }
  
  public za(zj paramzj, zs paramzs)
  {
    this(paramzj, paramzs.b(), paramzs.c());
  }
  
  public za(zj paramzj, int paramInt1, int paramInt2)
  {
    super(a(paramzj, paramInt1, paramInt2), ImageFormat.getMemoryBmp());
  }
  
  public za(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, 2498570);
  }
  
  public za(int paramInt1, int paramInt2, int paramInt3)
  {
    super(new BufferedImage(paramInt1, paramInt2, c(paramInt3)), ImageFormat.getBmp());
  }
  
  public za(String paramString)
    throws Exception
  {
    this(new ze(paramString, 3, 1, 1), b(paramString));
  }
  
  public za(zm paramzm)
    throws Exception
  {
    ImageInputStream localImageInputStream = ImageIO.createImageInputStream(paramzm.g());
    Iterator localIterator = ImageIO.getImageReaders(localImageInputStream);
    if (localIterator.hasNext())
    {
      ImageReader localImageReader = (ImageReader)localIterator.next();
      String str = localImageReader.getFormatName();
      ImageFormat localImageFormat = ImageFormat.a(str);
      Object localObject1 = null;
      Object localObject2;
      try
      {
        localObject1 = ImageIO.read(localImageInputStream);
      }
      catch (IIOException localIIOException)
      {
        localImageReader.setInput(ImageIO.createImageInputStream(paramzm.g()));
        localObject2 = localImageReader.readRaster(0, null);
        localObject1 = new BufferedImage(((Raster)localObject2).getWidth(), ((Raster)localObject2).getHeight(), 2);
        ((BufferedImage)localObject1).setData((Raster)localObject2);
        BufferedImage localBufferedImage2 = new BufferedImage(((BufferedImage)localObject1).getWidth(), ((BufferedImage)localObject1).getHeight(), 5);
        Graphics2D localGraphics2D = localBufferedImage2.createGraphics();
        localGraphics2D.drawImage((Image)localObject1, 0, 0, null);
        localGraphics2D.dispose();
        localObject1 = localBufferedImage2;
      }
      catch (Exception localException)
      {
        throw localException;
      }
      if ((!localImageFormat.equals(ImageFormat.getJpeg())) && (((BufferedImage)localObject1).getType() != 1))
      {
        BufferedImage localBufferedImage1 = new BufferedImage(((BufferedImage)localObject1).getWidth(), ((BufferedImage)localObject1).getHeight(), 1);
        localObject2 = localBufferedImage1.createGraphics();
        localBufferedImage1 = ((Graphics2D)localObject2).getDeviceConfiguration().createCompatibleImage(((BufferedImage)localObject1).getWidth(), ((BufferedImage)localObject1).getHeight(), 3);
        ((Graphics2D)localObject2).dispose();
        localObject2 = localBufferedImage1.createGraphics();
        ((Graphics2D)localObject2).drawImage((Image)localObject1, 0, 0, null, null);
        ((Graphics2D)localObject2).dispose();
        localObject1 = localBufferedImage1;
      }
      a((BufferedImage)localObject1, localImageFormat);
    }
    else
    {
      throw new Exception("invalid image stream or image format is not supported.");
    }
  }
  
  public za(zm paramzm, ImageFormat paramImageFormat)
    throws Exception
  {
    ImageInputStream localImageInputStream = ImageIO.createImageInputStream(paramzm.g());
    BufferedImage localBufferedImage = ImageIO.read(localImageInputStream);
    a(localBufferedImage, paramImageFormat);
  }
  
  public zj a()
  {
    BufferedImage localBufferedImage = new BufferedImage(this.a.getWidth(), this.a.getHeight(), this.a.getType());
    localBufferedImage.setData(this.a.getData());
    return new za(localBufferedImage, this.b);
  }
  
  public void b()
  {
    super.b();
  }
  
  public Color a(int paramInt1, int paramInt2)
  {
    return Color.fromArgb(this.a.getRGB(paramInt1, paramInt2));
  }
  
  public void a(int paramInt1, int paramInt2, Color paramColor)
  {
    this.a.setRGB(paramInt1, paramInt2, paramColor.toArgb());
  }
  
  private static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 1052676: 
      return 11;
    case 196865: 
      return 10;
    case 2498570: 
      return 2;
    case 139273: 
      return 1;
    case 925707: 
      return 3;
    case 135173: 
      return 9;
    case 135174: 
      return 8;
    case 65536: 
      return 13;
    }
    return 2;
  }
  
  public int c()
  {
    int i = this.a.getType();
    switch (i)
    {
    case 11: 
      return 1052676;
    case 10: 
      return 196865;
    case 2: 
      return 2498570;
    case 1: 
      return 139273;
    case 3: 
      return 925707;
    case 9: 
      return 135173;
    case 8: 
      return 135174;
    case 13: 
      return 65536;
    case 5: 
      return 137224;
    }
    return 0;
  }
  
  private static BufferedImage a(zj paramzj, int paramInt1, int paramInt2)
  {
    Image localImage = paramzj.f().getScaledInstance(paramInt1, paramInt2, 1);
    BufferedImage localBufferedImage = new BufferedImage(localImage.getWidth(null), localImage.getHeight(null), 2);
    Graphics2D localGraphics2D = localBufferedImage.createGraphics();
    localGraphics2D.drawImage(localImage, 0, 0, null);
    localGraphics2D.dispose();
    return localBufferedImage;
  }
  
  private static ImageFormat b(String paramString)
  {
    int i = paramString.lastIndexOf(".");
    if (i == -1) {
      return ImageFormat.getBmp();
    }
    String str = paramString.substring(i + 1);
    ImageFormat localImageFormat = ImageFormat.getImageFormatFromSuffixName(str);
    if (localImageFormat == null) {
      return ImageFormat.getEmf();
    }
    return localImageFormat;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */