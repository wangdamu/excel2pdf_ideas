package com.aspose.cells;

public class XlsSaveOptions
  extends SaveOptions
{
  boolean a;
  
  public XlsSaveOptions()
  {
    this.m_SaveFormat = 5;
  }
  
  public XlsSaveOptions(int format)
  {
    this.m_SaveFormat = format;
  }
  
  XlsSaveOptions(SaveOptions options)
  {
    this.m_SaveFormat = 5;
    b(options);
  }
  
  public LightCellsDataProvider getLightCellsDataProvider()
  {
    return this.i;
  }
  
  public void setLightCellsDataProvider(LightCellsDataProvider value)
  {
    this.i = value;
  }
  
  public boolean isTemplate()
  {
    return this.a;
  }
  
  public void setTemplate(boolean value)
  {
    this.a = value;
  }
  
  int a()
  {
    return 4095;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/XlsSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */