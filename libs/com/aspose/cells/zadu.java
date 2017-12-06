package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zadu
  extends CollectionBase
  implements zaij
{
  public zaii a(int paramInt)
  {
    return (zaii)this.InnerList.get(paramInt);
  }
  
  public void a(Color paramColor, float paramFloat)
  {
    zadt localzadt = new zadt();
    localzadt.a(paramColor);
    localzadt.a(paramFloat);
    zf.a(this.InnerList, localzadt);
  }
  
  zadt b(int paramInt)
  {
    return (zadt)this.InnerList.get(paramInt);
  }
  
  boolean a(zadu paramzadu)
  {
    if (getCount() != paramzadu.getCount()) {
      return false;
    }
    for (int i = 0; i < this.InnerList.size(); i++) {
      if (!b(i).a(paramzadu.b(i))) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */