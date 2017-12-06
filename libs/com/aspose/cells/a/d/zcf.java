package com.aspose.cells.a.d;

import com.aspose.cells.ImageOrPrintOptions;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.imageio.ImageIO;

public class zcf
{
  private static boolean a = true;
  private static boolean b = true;
  
  public static void a(BufferedImage paramBufferedImage, ImageOrPrintOptions paramImageOrPrintOptions, OutputStream paramOutputStream)
    throws Exception
  {
    Object localObject1 = null;
    if (a)
    {
      a = false;
      try
      {
        localObject1 = Class.forName("com.sun.image.codec.jpeg.JPEGCodec").getMethod("createJPEGEncoder", new Class[] { OutputStream.class }).invoke(null, new Object[] { paramOutputStream });
      }
      catch (Throwable localThrowable)
      {
        b = false;
      }
    }
    else if (b)
    {
      localObject1 = Class.forName("com.sun.image.codec.jpeg.JPEGCodec").getMethod("createJPEGEncoder", new Class[] { OutputStream.class }).invoke(null, new Object[] { paramOutputStream });
    }
    if (b)
    {
      Class localClass1 = Class.forName("com.sun.image.codec.jpeg.JPEGImageEncoder");
      Object localObject2 = localClass1.getMethod("getDefaultJPEGEncodeParam", new Class[] { BufferedImage.class }).invoke(localObject1, new Object[] { paramBufferedImage });
      Class localClass2 = Class.forName("com.sun.image.codec.jpeg.JPEGEncodeParam");
      float f = 1.0F;
      if (paramImageOrPrintOptions != null) {
        f = paramImageOrPrintOptions.getQuality() / 100.0F;
      }
      localClass2.getMethod("setQuality", new Class[] { Float.TYPE, Boolean.TYPE }).invoke(localObject2, new Object[] { Float.valueOf(f), Boolean.valueOf(false) });
      if (paramImageOrPrintOptions != null)
      {
        localClass2.getMethod("setDensityUnit", new Class[] { Integer.TYPE }).invoke(localObject2, new Object[] { Integer.valueOf(localClass2.getField("DENSITY_UNIT_DOTS_INCH").getInt(null)) });
        localClass2.getMethod("setXDensity", new Class[] { Integer.TYPE }).invoke(localObject2, new Object[] { Integer.valueOf(paramImageOrPrintOptions.getHorizontalResolution()) });
        localClass2.getMethod("setYDensity", new Class[] { Integer.TYPE }).invoke(localObject2, new Object[] { Integer.valueOf(paramImageOrPrintOptions.getVerticalResolution()) });
      }
      localClass1.getMethod("setJPEGEncodeParam", new Class[] { localClass2 }).invoke(localObject1, new Object[] { localObject2 });
      localClass1.getMethod("encode", new Class[] { BufferedImage.class }).invoke(localObject1, new Object[] { paramBufferedImage });
    }
    else
    {
      ImageIO.write(paramBufferedImage, "jpeg", paramOutputStream);
    }
    paramOutputStream.flush();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */