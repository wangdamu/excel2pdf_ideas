package com.aspose.cells;

public class VerticalPageBreak
{
  private int a;
  private int b = 0;
  private int c = 65535;
  
  VerticalPageBreak(int column)
  {
    this.a = column;
  }
  
  public int getStartRow()
  {
    return this.b;
  }
  
  public int getEndRow()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int getColumn()
  {
    return this.a;
  }
  
  void c(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/VerticalPageBreak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */