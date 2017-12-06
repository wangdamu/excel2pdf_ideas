package com.aspose.cells;

public class WarningInfo
{
  private int a;
  private String b;
  
  WarningInfo(int warningType, String description)
  {
    this.a = warningType;
    this.b = description;
  }
  
  public int getWarningType()
  {
    return this.a;
  }
  
  public String getDescription()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WarningInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */