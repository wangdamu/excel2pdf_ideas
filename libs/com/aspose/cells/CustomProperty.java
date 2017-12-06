package com.aspose.cells;

import com.aspose.cells.b.a.zs;

public class CustomProperty
{
  private String a;
  private Object b;
  
  public String getName()
  {
    return this.a;
  }
  
  public void setName(String value)
  {
    this.a = value;
  }
  
  /**
   * @deprecated
   */
  public String getStringValue()
  {
    return zs.a(this.b);
  }
  
  /**
   * @deprecated
   */
  public void setStringValue(String value)
  {
    this.b = value;
  }
  
  public String getValue()
  {
    return zs.a(this.b);
  }
  
  public void setValue(String value)
  {
    this.b = value;
  }
  
  void a(CustomProperty paramCustomProperty)
  {
    this.a = paramCustomProperty.a;
    this.b = paramCustomProperty.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomProperty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */