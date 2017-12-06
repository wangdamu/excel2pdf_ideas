package com.aspose.cells;

import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zg;
import com.sun.media.imageio.plugins.tiff.BaselineTIFFTagSet;
import com.sun.media.imageio.plugins.tiff.TIFFDirectory;
import com.sun.media.imageio.plugins.tiff.TIFFField;
import com.sun.media.imageio.plugins.tiff.TIFFImageWriteParam;
import com.sun.media.imageio.plugins.tiff.TIFFTag;
import java.awt.image.RenderedImage;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.MemoryCacheImageOutputStream;

class znv
{
  private static final boolean a;
  
  public void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions, ArrayList paramArrayList, zbyr paramzbyr)
    throws Exception
  {
    ImageWriter localImageWriter = (ImageWriter)ImageIO.getImageWritersByFormatName("tiff").next();
    MemoryCacheImageOutputStream localMemoryCacheImageOutputStream = new MemoryCacheImageOutputStream(paramzm.j());
    localImageWriter.setOutput(localMemoryCacheImageOutputStream);
    localImageWriter.prepareWriteSequence(null);
    TIFFImageWriteParam localTIFFImageWriteParam = null;
    if (a) {
      try
      {
        localTIFFImageWriteParam = zajz.a();
        localTIFFImageWriteParam.setCompressionMode(2);
        switch (paramImageOrPrintOptions.getTiffCompression())
        {
        case 1: 
          paramImageOrPrintOptions.e = true;
          localTIFFImageWriteParam.setCompressionType("CCITT RLE");
          break;
        case 3: 
          paramImageOrPrintOptions.e = true;
          localTIFFImageWriteParam.setCompressionType("CCITT T.4");
          break;
        case 4: 
          paramImageOrPrintOptions.e = true;
          localTIFFImageWriteParam.setCompressionType("CCITT T.6");
          break;
        case 2: 
          localTIFFImageWriteParam.setCompressionType("LZW");
        }
      }
      catch (Exception localException1)
      {
        com.aspose.cells.a.e.zf.a(localException1);
      }
    }
    int i = -1;
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zat localzat = (zat)paramArrayList.get(j);
      if ((localzat.b.getIndex() != i) && (i != -1)) {
        paramzbyr.a.c();
      }
      if ((j % 50 == 0) && (j != 0))
      {
        zg.a();
        zg.b();
      }
      try
      {
        za localza = paramzbyr.a(j, paramImageOrPrintOptions);
        ImageTypeSpecifier localImageTypeSpecifier = ImageTypeSpecifier.createFromRenderedImage(localza.f());
        IIOMetadata localIIOMetadata = localImageWriter.getDefaultImageMetadata(localImageTypeSpecifier, null);
        localIIOMetadata = a(localIIOMetadata, localza.j(), localza.k());
        if (paramImageOrPrintOptions.getTiffPhotometricInterpretation() > -1) {
          localIIOMetadata = a(localIIOMetadata, paramImageOrPrintOptions.getTiffPhotometricInterpretation());
        }
        if (paramImageOrPrintOptions.e)
        {
          RenderedImage localRenderedImage = zagt.a(localza);
          localImageWriter.writeToSequence(new IIOImage(localRenderedImage, null, localIIOMetadata), localTIFFImageWriteParam);
        }
        else
        {
          localImageWriter.writeToSequence(new IIOImage(localza.f(), null, localIIOMetadata), localTIFFImageWriteParam);
        }
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
      }
      i = localzat.b.getIndex();
    }
    localMemoryCacheImageOutputStream.flush();
    localMemoryCacheImageOutputStream.close();
  }
  
  public void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions, int paramInt, zbyr paramzbyr)
    throws Exception
  {
    za localza = null;
    try
    {
      localza = paramzbyr.a(paramInt, paramImageOrPrintOptions);
      a(paramzm, paramImageOrPrintOptions, localza);
    }
    finally
    {
      if (localza != null) {
        localza.d();
      }
    }
  }
  
  public void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions, za paramza)
    throws Exception
  {
    ImageWriter localImageWriter = (ImageWriter)ImageIO.getImageWritersByFormatName("tiff").next();
    MemoryCacheImageOutputStream localMemoryCacheImageOutputStream = new MemoryCacheImageOutputStream(paramzm.j());
    localImageWriter.setOutput(localMemoryCacheImageOutputStream);
    localImageWriter.prepareWriteSequence(null);
    TIFFImageWriteParam localTIFFImageWriteParam = null;
    if (a) {
      try
      {
        localTIFFImageWriteParam = zajz.a();
        localTIFFImageWriteParam.setCompressionMode(2);
        switch (paramImageOrPrintOptions.getTiffCompression())
        {
        case 1: 
          paramImageOrPrintOptions.e = true;
          localTIFFImageWriteParam.setCompressionType("CCITT RLE");
          break;
        case 3: 
          paramImageOrPrintOptions.e = true;
          localTIFFImageWriteParam.setCompressionType("CCITT T.4");
          break;
        case 4: 
          paramImageOrPrintOptions.e = true;
          localTIFFImageWriteParam.setCompressionType("CCITT T.6");
          break;
        case 2: 
          localTIFFImageWriteParam.setCompressionType("LZW");
        }
      }
      catch (Exception localException1)
      {
        com.aspose.cells.a.e.zf.a(localException1);
      }
    }
    try
    {
      ImageTypeSpecifier localImageTypeSpecifier = ImageTypeSpecifier.createFromRenderedImage(paramza.f());
      IIOMetadata localIIOMetadata = localImageWriter.getDefaultImageMetadata(localImageTypeSpecifier, null);
      localIIOMetadata = a(localIIOMetadata, paramza.j(), paramza.k());
      if (paramImageOrPrintOptions.getTiffPhotometricInterpretation() > -1) {
        localIIOMetadata = a(localIIOMetadata, paramImageOrPrintOptions.getTiffPhotometricInterpretation());
      }
      if (paramImageOrPrintOptions.e)
      {
        RenderedImage localRenderedImage = zagt.a(paramza);
        localImageWriter.writeToSequence(new IIOImage(localRenderedImage, null, localIIOMetadata), localTIFFImageWriteParam);
      }
      else
      {
        localImageWriter.writeToSequence(new IIOImage(paramza.f(), null, localIIOMetadata), localTIFFImageWriteParam);
      }
    }
    catch (Exception localException2)
    {
      com.aspose.cells.a.e.zf.a(localException2);
    }
    localMemoryCacheImageOutputStream.flush();
    localMemoryCacheImageOutputStream.close();
  }
  
  private IIOMetadata a(IIOMetadata paramIIOMetadata, float paramFloat1, float paramFloat2)
    throws IIOInvalidTreeException
  {
    TIFFDirectory localTIFFDirectory = TIFFDirectory.createFromMetadata(paramIIOMetadata);
    BaselineTIFFTagSet localBaselineTIFFTagSet = BaselineTIFFTagSet.getInstance();
    TIFFTag localTIFFTag1 = localBaselineTIFFTagSet.getTag(282);
    TIFFTag localTIFFTag2 = localBaselineTIFFTagSet.getTag(283);
    TIFFField localTIFFField1 = new TIFFField(localTIFFTag1, 5, 1, new long[][] { { paramFloat1, 1L } });
    TIFFField localTIFFField2 = new TIFFField(localTIFFTag2, 5, 1, new long[][] { { paramFloat2, 1L } });
    localTIFFDirectory.addTIFFField(localTIFFField1);
    localTIFFDirectory.addTIFFField(localTIFFField2);
    return localTIFFDirectory.getAsMetadata();
  }
  
  private IIOMetadata a(IIOMetadata paramIIOMetadata, int paramInt)
    throws IIOInvalidTreeException
  {
    TIFFDirectory localTIFFDirectory = TIFFDirectory.createFromMetadata(paramIIOMetadata);
    BaselineTIFFTagSet localBaselineTIFFTagSet = BaselineTIFFTagSet.getInstance();
    TIFFTag localTIFFTag = localBaselineTIFFTagSet.getTag(262);
    TIFFField localTIFFField = new TIFFField(localTIFFTag, 5, 1, new long[][] { { paramInt, 1L } });
    localTIFFDirectory.addTIFFField(localTIFFField);
    return localTIFFDirectory.getAsMetadata();
  }
  
  static
  {
    boolean bool = false;
    try
    {
      Class.forName("com.sun.media.imageio.plugins.tiff.TIFFImageWriteParam");
      bool = true;
    }
    catch (Exception localException)
    {
      bool = false;
      com.aspose.cells.a.e.zf.a(localException);
    }
    a = bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */