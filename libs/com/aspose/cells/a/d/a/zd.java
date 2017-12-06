package com.aspose.cells.a.d.a;

import java.util.BitSet;

public class zd
{
  private BitSet a = new BitSet();
  private int b;
  
  public int a()
  {
    int i = d();
    this.a.set(i);
    if (i > this.b) {
      this.b = i;
    }
    return i;
  }
  
  public int a(int paramInt)
  {
    this.a.clear(paramInt);
    return paramInt;
  }
  
  private int d()
  {
    for (int i = 1;; i++) {
      if (!this.a.get(i)) {
        return i;
      }
    }
  }
  
  public int b()
  {
    return this.a.length() - 1;
  }
  
  public int c()
  {
    return this.b + 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */