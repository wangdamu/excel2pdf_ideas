package com.aspose.cells;

import java.util.Iterator;

public class zcjt
  implements Iterator
{
  private zcjs a;
  private zcjs b;
  private boolean c;
  
  public zcjt(zcjs paramzcjs)
  {
    this.a = paramzcjs;
    this.c = true;
  }
  
  public boolean hasNext()
  {
    if (this.c)
    {
      this.c = false;
      this.b = this.a.m();
    }
    else if (this.b != null)
    {
      if (this.b == this.a.d) {
        this.b = null;
      } else {
        this.b = this.b.c;
      }
    }
    return this.b != null;
  }
  
  public Object next()
  {
    return this.b;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */