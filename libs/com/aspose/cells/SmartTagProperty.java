package com.aspose.cells;

public class SmartTagProperty
{
  private String a;
  private String b;
  
  SmartTagProperty(String name, String value)
  {
    this.a = name;
    this.b = value;
  }
  
  public String getName()
  {
    return this.a;
  }
  
  public void setName(String value)
  {
    this.a = value;
  }
  
  public String getValue()
  {
    return this.b;
  }
  
  public void setValue(String value)
  {
    this.b = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SmartTagProperty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */