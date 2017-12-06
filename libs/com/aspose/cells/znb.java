package com.aspose.cells;

import com.aspose.cells.b.a.zi;

class znb
  implements zi
{
  private Series a;
  
  znb(Series paramSeries)
  {
    this.a = paramSeries;
  }
  
  Series a()
  {
    return this.a;
  }
  
  int b()
  {
    return this.a.E();
  }
  
  int c()
  {
    return this.a.b();
  }
  
  public int compareTo(Object obj)
  {
    if (obj == null) {
      return -1;
    }
    znb localznb = (znb)obj;
    if ((c() == localznb.c()) && (b() == localznb.b())) {
      return 0;
    }
    if (c() > localznb.c()) {
      return 1;
    }
    if (c() < localznb.c()) {
      return -1;
    }
    if (b() > localznb.b()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */