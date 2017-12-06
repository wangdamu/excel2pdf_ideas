package com.aspose.cells;

public class SmartTagOptions
{
  private boolean a = false;
  private int b = 0;
  
  public boolean getEmbedSmartTags()
  {
    return this.a;
  }
  
  public void setEmbedSmartTags(boolean value)
  {
    this.a = value;
  }
  
  public int getShowType()
  {
    return this.b;
  }
  
  public void setShowType(int value)
  {
    this.b = value;
  }
  
  void a(SmartTagOptions paramSmartTagOptions)
  {
    this.b = paramSmartTagOptions.b;
    this.a = paramSmartTagOptions.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SmartTagOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */