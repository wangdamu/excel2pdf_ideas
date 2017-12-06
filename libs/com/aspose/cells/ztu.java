package com.aspose.cells;

import java.util.Iterator;

class ztu
  implements Iterator
{
  private Row a;
  private zaiv b;
  private int c;
  private Cell d;
  
  public ztu(Row paramRow)
  {
    this.a = paramRow;
    this.b = paramRow.c.a(-1, -1, false);
  }
  
  public boolean hasNext()
  {
    if (this.b == null) {
      return false;
    }
    this.d = null;
    this.c = this.b.a();
    return this.c > -1;
  }
  
  public Object next()
  {
    if (this.d != null) {
      return this.d;
    }
    this.d = new Cell(this.a, this.c);
    return this.d;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */