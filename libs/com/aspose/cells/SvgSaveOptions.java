package com.aspose.cells;

public class SvgSaveOptions
  extends ImageSaveOptions
{
  private int a = -1;
  
  public SvgSaveOptions()
  {
    super(22);
  }
  
  public SvgSaveOptions(int saveFormat)
  {
    super(22);
    this.m_SaveFormat = saveFormat;
  }
  
  static SvgSaveOptions c(SaveOptions paramSaveOptions)
  {
    if ((paramSaveOptions instanceof SvgSaveOptions))
    {
      localSvgSaveOptions = (SvgSaveOptions)paramSaveOptions;
      return localSvgSaveOptions;
    }
    SvgSaveOptions localSvgSaveOptions = new SvgSaveOptions();
    if ((paramSaveOptions instanceof ImageSaveOptions))
    {
      ImageSaveOptions localImageSaveOptions = (ImageSaveOptions)paramSaveOptions;
      localSvgSaveOptions.a(localImageSaveOptions);
      localSvgSaveOptions.getImageOrPrintOptions().setSaveFormat(22);
    }
    return localSvgSaveOptions;
  }
  
  public int getSheetIndex()
  {
    return this.a;
  }
  
  public void setSheetIndex(int value)
  {
    this.a = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SvgSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */