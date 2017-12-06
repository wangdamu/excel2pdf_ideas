package com.aspose.cells;

public class OdsSaveOptions
  extends SaveOptions
{
  boolean a;
  private boolean b = false;
  
  public OdsSaveOptions()
  {
    this.m_SaveFormat = 14;
  }
  
  public OdsSaveOptions(int saveFormat)
  {
    this.m_SaveFormat = 14;
  }
  
  OdsSaveOptions(SaveOptions saveOptions)
  {
    this.m_SaveFormat = 14;
    b(saveOptions);
  }
  
  public boolean isStrictSchema11()
  {
    return this.b;
  }
  
  public void setStrictSchema11(boolean value)
  {
    this.b = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/OdsSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */