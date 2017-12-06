package com.aspose.cells;

public class IconFilter
{
  private FilterColumn a;
  private int b;
  private int c = -1;
  
  IconFilter(FilterColumn filterColumn)
  {
    this.a = filterColumn;
  }
  
  void a(IconFilter paramIconFilter)
  {
    this.b = paramIconFilter.b;
    this.c = paramIconFilter.c;
  }
  
  public int getIconSetType()
  {
    return this.b;
  }
  
  public void setIconSetType(int value)
  {
    this.b = value;
  }
  
  public int getIconId()
  {
    return this.c;
  }
  
  public void setIconId(int value)
  {
    this.c = value;
  }
  
  boolean a(Cell paramCell)
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/IconFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */