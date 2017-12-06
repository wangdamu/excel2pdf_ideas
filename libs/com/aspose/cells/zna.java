package com.aspose.cells;

import com.aspose.cells.b.a.zi;

class zna
  implements zi
{
  private Series a;
  
  zna(Series paramSeries)
  {
    this.a = paramSeries;
  }
  
  Series a()
  {
    return this.a;
  }
  
  int b()
  {
    return this.a.b();
  }
  
  int c()
  {
    return this.a.C();
  }
  
  public int compareTo(Object obj)
  {
    if (obj == null) {
      return -1;
    }
    zna localzna = (zna)obj;
    if ((c() == localzna.c()) && (b() == localzna.b())) {
      return 0;
    }
    if (c() > localzna.c()) {
      return 1;
    }
    if (c() < localzna.c()) {
      return -1;
    }
    if (b() > localzna.b()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */