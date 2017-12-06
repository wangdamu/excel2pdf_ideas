package com.aspose.cells;

import java.util.Iterator;

class zbwb
  implements Iterator
{
  private FontSettingCollection a;
  private int b = -1;
  
  zbwb(FontSettingCollection paramFontSettingCollection)
  {
    this.a = paramFontSettingCollection;
  }
  
  public Object next()
  {
    return this.a.get(this.b);
  }
  
  public boolean hasNext()
  {
    for (this.b += 1; this.b < this.a.getCount(); this.b += 1) {
      if (this.a.get(this.b).getType() == 1) {
        return true;
      }
    }
    return false;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */