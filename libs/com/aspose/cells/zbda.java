package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zg;
import java.util.ArrayList;

class zbda
  extends CollectionBase
  implements zaiz
{
  public zaiy a(int paramInt)
  {
    if (paramInt >= this.InnerList.size()) {
      return null;
    }
    return (zaiy)this.InnerList.get(paramInt);
  }
  
  zbcz b(int paramInt)
  {
    if (paramInt >= this.InnerList.size()) {
      return null;
    }
    return (zbcz)this.InnerList.get(paramInt);
  }
  
  public zaiy a(String paramString, zg paramzg, Color paramColor, zaid paramzaid, int paramInt)
  {
    zbcz localzbcz = new zbcz(paramString, paramzg, paramColor, paramzaid, paramInt);
    zf.a(this.InnerList, localzbcz);
    return localzbcz;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */