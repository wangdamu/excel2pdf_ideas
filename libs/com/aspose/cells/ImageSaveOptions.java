package com.aspose.cells;

public class ImageSaveOptions
  extends SaveOptions
{
  private ImageOrPrintOptions a;
  
  public ImageSaveOptions()
  {
    this.m_SaveFormat = 21;
    this.a = new ImageOrPrintOptions();
    this.a.setImageFormat(ImageFormat.getTiff());
  }
  
  public ImageSaveOptions(int saveFormat)
  {
    this.m_SaveFormat = saveFormat;
    this.a = new ImageOrPrintOptions();
    this.a.setImageFormat(ImageFormat.getTiff());
  }
  
  public ImageOrPrintOptions getImageOrPrintOptions()
  {
    return this.a;
  }
  
  void a(ImageSaveOptions paramImageSaveOptions)
  {
    super.b(paramImageSaveOptions);
    this.a = paramImageSaveOptions.a;
  }
  
  static ImageSaveOptions a(SaveOptions paramSaveOptions)
  {
    if ((paramSaveOptions instanceof ImageSaveOptions))
    {
      localImageSaveOptions = (ImageSaveOptions)paramSaveOptions;
      return localImageSaveOptions;
    }
    ImageSaveOptions localImageSaveOptions = new ImageSaveOptions(paramSaveOptions.getSaveFormat());
    return localImageSaveOptions;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ImageSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */