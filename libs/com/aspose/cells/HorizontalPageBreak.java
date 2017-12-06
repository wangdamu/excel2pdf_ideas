package com.aspose.cells;

public class HorizontalPageBreak
{
  private int a;
  private int b = 0;
  private int c = 255;
  
  HorizontalPageBreak(int row)
  {
    this.a = row;
  }
  
  public int getStartColumn()
  {
    return this.b;
  }
  
  public int getEndColumn()
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
  
  public int getRow()
  {
    return this.a;
  }
  
  void c(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/HorizontalPageBreak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */