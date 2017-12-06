package com.aspose.cells;

public class XpsSaveOptions
  extends SaveOptions
{
  private ImageOrPrintOptions a;
  
  public XpsSaveOptions()
  {
    this.m_SaveFormat = 20;
    this.a = new ImageOrPrintOptions();
    this.a.setSaveFormat(this.m_SaveFormat);
  }
  
  public XpsSaveOptions(int saveFormat)
  {
    this.m_SaveFormat = saveFormat;
    this.a = new ImageOrPrintOptions();
    this.a.setSaveFormat(this.m_SaveFormat);
  }
  
  static XpsSaveOptions a(SaveOptions paramSaveOptions)
  {
    if ((paramSaveOptions instanceof XpsSaveOptions))
    {
      localXpsSaveOptions = (XpsSaveOptions)paramSaveOptions;
      return localXpsSaveOptions;
    }
    XpsSaveOptions localXpsSaveOptions = new XpsSaveOptions();
    return localXpsSaveOptions;
  }
  
  ImageOrPrintOptions b()
  {
    return this.a;
  }
  
  public boolean getOnePagePerSheet()
  {
    return this.a.getOnePagePerSheet();
  }
  
  public void setOnePagePerSheet(boolean value)
  {
    this.a.setOnePagePerSheet(value);
  }
  
  public int getPageIndex()
  {
    return this.a.e();
  }
  
  public void setPageIndex(int value)
  {
    this.a.b(value);
  }
  
  public int getPageCount()
  {
    return this.a.f();
  }
  
  public void setPageCount(int value)
  {
    this.a.c(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/XpsSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */