package com.aspose.cells;

public class Top10
{
  private boolean a = false;
  private boolean b = false;
  private int c = 10;
  
  void a(Top10 paramTop10)
  {
    this.a = paramTop10.a;
    this.b = paramTop10.b;
    this.c = paramTop10.c;
  }
  
  public boolean isPercent()
  {
    return this.a;
  }
  
  public void setPercent(boolean value)
  {
    this.a = value;
  }
  
  public boolean isBottom()
  {
    return this.b;
  }
  
  public void setBottom(boolean value)
  {
    this.b = value;
  }
  
  public int getRank()
  {
    return this.c;
  }
  
  public void setRank(int value)
  {
    if (this.a)
    {
      if ((value >= 0) && (value <= 100)) {}
    }
    else if ((value <= 0) || (value > 1000)) {
      return;
    }
    this.c = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Top10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */