package com.aspose.cells;

public class SpreadsheetML2003SaveOptions
  extends SaveOptions
{
  private boolean a = true;
  private boolean b = true;
  private boolean c = false;
  
  public SpreadsheetML2003SaveOptions()
  {
    this.m_SaveFormat = 15;
  }
  
  public SpreadsheetML2003SaveOptions(int saveFormat)
  {
    this.m_SaveFormat = saveFormat;
  }
  
  SpreadsheetML2003SaveOptions(SaveOptions saveOptions)
  {
    this.m_SaveFormat = 15;
    b(saveOptions);
  }
  
  public boolean isIndentedFormatting()
  {
    return this.a;
  }
  
  public void setIndentedFormatting(boolean value)
  {
    this.a = value;
  }
  
  public boolean getLimitAsXls()
  {
    return this.b;
  }
  
  public void setLimitAsXls(boolean value)
  {
    this.b = value;
  }
  
  public boolean getExportColumnIndexOfCell()
  {
    return this.c;
  }
  
  public void setExportColumnIndexOfCell(boolean value)
  {
    this.c = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SpreadsheetML2003SaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */