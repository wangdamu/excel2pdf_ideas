package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zgp
  extends CollectionBase
  implements zagz
{
  private zgn a;
  
  zgp(zgn paramzgn)
  {
    this.a = paramzgn;
  }
  
  public zagy a(int paramInt)
  {
    return (zagy)this.InnerList.get(paramInt);
  }
  
  public zagy a(Object paramObject)
  {
    zgn localzgn = new zgn(this.a, paramObject);
    zf.a(this.InnerList, localzgn);
    return localzgn;
  }
  
  public void a(int paramInt, zagy paramzagy)
  {
    this.InnerList.add(paramInt, paramzagy);
  }
  
  public void b(int paramInt)
  {
    this.InnerList.remove(paramInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */