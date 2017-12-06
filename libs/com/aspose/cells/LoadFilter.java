package com.aspose.cells;

public class LoadFilter
{
  private int a;
  
  public LoadFilter()
  {
    this.a = Integer.MAX_VALUE;
  }
  
  public LoadFilter(int opts)
  {
    this.a = opts;
  }
  
  public int getLoadDataFilterOptions()
  {
    return this.a;
  }
  
  public void setLoadDataFilterOptions(int value)
  {
    this.a = value;
  }
  
  public void startSheet(Worksheet sheet) {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LoadFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */