package com.aspose.cells;

public class Top10Filter
{
  private boolean a;
  private boolean b;
  private int c;
  private Object d;
  
  void a(Top10Filter paramTop10Filter)
  {
    this.a = paramTop10Filter.a;
    this.b = paramTop10Filter.b;
    this.c = paramTop10Filter.c;
    this.d = Integer.valueOf(paramTop10Filter.c);
  }
  
  Top10Filter() {}
  
  Top10Filter(boolean isTop, boolean isPercent, int items)
  {
    this.a = isTop;
    this.b = isPercent;
    this.c = items;
  }
  
  public boolean isTop()
  {
    return this.a;
  }
  
  public void setTop(boolean value)
  {
    this.a = value;
  }
  
  public boolean isPercent()
  {
    return this.b;
  }
  
  public void setPercent(boolean value)
  {
    this.b = value;
  }
  
  public int getItems()
  {
    return this.c;
  }
  
  public void setItems(int value)
  {
    this.c = value;
  }
  
  public Object getCriteria()
  {
    return this.d;
  }
  
  public void setCriteria(Object value)
  {
    this.d = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Top10Filter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */