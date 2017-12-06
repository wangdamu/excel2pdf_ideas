package com.aspose.cells.a.d.b;

import com.aspose.cells.a.e.zf;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;

public class zb
{
  public static RenderedImage a(Image paramImage, ImageObserver paramImageObserver, Color paramColor)
  {
    if ((paramColor == null) && ((paramImage instanceof RenderedImage))) {
      return (RenderedImage)paramImage;
    }
    BufferedImage localBufferedImage = new BufferedImage(paramImage.getWidth(paramImageObserver), paramImage.getHeight(paramImageObserver), paramColor == null ? 2 : 1);
    Graphics localGraphics = localBufferedImage.getGraphics();
    if (paramColor == null) {
      localGraphics.drawImage(paramImage, 0, 0, paramImageObserver);
    } else {
      localGraphics.drawImage(paramImage, 0, 0, paramColor, paramImageObserver);
    }
    return localBufferedImage;
  }
  
  public static byte[] a(RenderedImage paramRenderedImage, Color paramColor, String paramString, int paramInt)
  {
    if (paramInt < 1) {
      paramInt = 1;
    }
    Raster localRaster = paramRenderedImage.getData();
    int i = paramRenderedImage.getWidth();
    int j = paramRenderedImage.getHeight();
    int k = paramString.charAt(0) == '*' ? 1 : 0;
    if (k != 0) {
      paramString = paramString.substring(1);
    }
    int m = paramString.length();
    int n = i * j * m;
    n += i % paramInt * j;
    int i1 = 0;
    byte[] arrayOfByte = new byte[n];
    ColorModel localColorModel = paramRenderedImage.getColorModel();
    for (int i2 = 0; i2 < j; i2++)
    {
      for (int i3 = 0; i3 < i; i3++)
      {
        int i4 = localColorModel.getRGB(localRaster.getDataElements(i3, i2, null));
        int i5 = i4 >> 24 & 0xFF;
        int i6 = i4 >> 16 & 0xFF;
        int i7 = i4 >> 8 & 0xFF;
        int i8 = i4 >> 0 & 0xFF;
        if ((k != 0) && (i5 < 255))
        {
          if (paramColor == null) {
            paramColor = Color.BLACK;
          }
          double d = i5 / 255.0D;
          i6 = (int)(d * i6 + (1.0D - d) * paramColor.getRed());
          i7 = (int)(d * i7 + (1.0D - d) * paramColor.getGreen());
          i8 = (int)(d * i8 + (1.0D - d) * paramColor.getBlue());
        }
        for (int i9 = 0; i9 < paramString.length(); i9++)
        {
          switch (paramString.charAt(i9))
          {
          case 'A': 
          case 'a': 
            arrayOfByte[i1] = ((byte)i5);
            break;
          case 'R': 
          case 'r': 
            arrayOfByte[i1] = ((byte)i6);
            break;
          case 'G': 
          case 'g': 
            arrayOfByte[i1] = ((byte)i7);
            break;
          case 'B': 
          case 'b': 
            arrayOfByte[i1] = ((byte)i8);
            break;
          default: 
            zf.a(zb.class.getClass() + ": Invalid code in '" + paramString + "'");
          }
          i1++;
        }
      }
      for (i3 = 0; i3 < i % paramInt; i3++)
      {
        arrayOfByte[i1] = 0;
        i1++;
      }
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/b/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */