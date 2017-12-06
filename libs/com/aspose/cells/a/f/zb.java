package com.aspose.cells.a.f;

import com.aspose.cells.zaux;
import java.util.Iterator;

class zb
  implements Iterator<zh>
{
  private int b = 0;
  
  zb(za paramza) {}
  
  public boolean hasNext()
  {
    return this.b < this.a.a.length;
  }
  
  public zh a()
  {
    return this.a.a(this.b++);
  }
  
  public void remove()
  {
    throw zaux.a(7, "Removing element from ZipFile's iterator is not supported");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/f/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */