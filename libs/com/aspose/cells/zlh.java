package com.aspose.cells;

import com.aspose.cells.b.a.zi;

class zlh
  implements zi
{
  private String a;
  private int b;
  private int c;
  
  zlh(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  String a()
  {
    return this.a;
  }
  
  int b()
  {
    return this.b;
  }
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  int c()
  {
    return this.c;
  }
  
  void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int compareTo(Object obj)
  {
    zlh localzlh = (zlh)obj;
    if (localzlh.b() == b()) {
      return 0;
    }
    if (localzlh.b() > b()) {
      return 1;
    }
    return -1;
  }
  
  public boolean equals(Object obj)
  {
    zlh localzlh = (zlh)obj;
    return a().equals(localzlh.a());
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */