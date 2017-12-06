package com.aspose.cells;

public class OoxmlSaveOptions
  extends SaveOptions
{
  private boolean a;
  private boolean b = false;
  
  public OoxmlSaveOptions()
  {
    this.m_SaveFormat = 6;
  }
  
  public OoxmlSaveOptions(int saveFormat)
  {
    this.m_SaveFormat = saveFormat;
  }
  
  OoxmlSaveOptions(int saveFormat, SaveOptions options)
  {
    this.m_SaveFormat = saveFormat;
    b(options);
  }
  
  OoxmlSaveOptions(SaveOptions options)
  {
    this.m_SaveFormat = 6;
    if ((options != null) && (options.getSaveFormat() != 0)) {
      this.m_SaveFormat = options.getSaveFormat();
    }
    b(options);
  }
  
  public boolean getExportCellName()
  {
    return this.f;
  }
  
  public void setExportCellName(boolean value)
  {
    this.f = value;
  }
  
  public LightCellsDataProvider getLightCellsDataProvider()
  {
    return this.i;
  }
  
  public void setLightCellsDataProvider(LightCellsDataProvider value)
  {
    this.i = value;
  }
  
  public boolean getUpdateZoom()
  {
    return this.a;
  }
  
  public void setUpdateZoom(boolean value)
  {
    this.a = value;
  }
  
  public boolean getEnableZip64()
  {
    return this.b;
  }
  
  public void setEnableZip64(boolean value)
  {
    this.b = true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/OoxmlSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */