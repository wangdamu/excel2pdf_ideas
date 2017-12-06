package com.aspose.cells;

public class CustomFilter
{
  private int a = 6;
  private Object b;
  
  void a(CustomFilter paramCustomFilter)
  {
    this.a = paramCustomFilter.a;
    this.b = paramCustomFilter.b;
  }
  
  public int getFilterOperatorType()
  {
    return this.a;
  }
  
  public void setFilterOperatorType(int value)
  {
    this.a = value;
  }
  
  public Object getCriteria()
  {
    return this.b;
  }
  
  public void setCriteria(Object value)
  {
    this.b = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */