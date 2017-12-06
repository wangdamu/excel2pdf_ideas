package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zsm
  implements Iterator
{
  private ArrayList a;
  private int b = -1;
  
  public zsm(ArrayList paramArrayList)
  {
    this.a = paramArrayList;
  }
  
  public boolean hasNext()
  {
    this.b += 1;
    return this.b < this.a.size();
  }
  
  public Object next()
  {
    try
    {
      return this.a.get(this.b);
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new IllegalStateException();
    }
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */