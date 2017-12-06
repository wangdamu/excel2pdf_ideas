package com.aspose.cells;

import com.aspose.cells.b.a.zi;

final class zbqo
  implements zi
{
  private int a;
  private Series b;
  
  public zbqo() {}
  
  zbqo(Series paramSeries)
  {
    this.b = paramSeries;
    this.a = -1;
  }
  
  int a()
  {
    return this.a;
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  Series b()
  {
    return this.b;
  }
  
  int c()
  {
    return this.b.b();
  }
  
  public int compareTo(Object obj)
  {
    if (obj == null) {
      return -1;
    }
    zbqo localzbqo = (zbqo)obj;
    if (c() == localzbqo.c()) {
      return 0;
    }
    if (c() > localzbqo.c()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */