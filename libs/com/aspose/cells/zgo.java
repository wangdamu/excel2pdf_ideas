package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zgo
  extends CollectionBase
  implements zagz
{
  private zgm a;
  
  zgo(zgm paramzgm)
  {
    this.a = paramzgm;
  }
  
  public zagy a(int paramInt)
  {
    return (zagy)this.InnerList.get(paramInt);
  }
  
  public zagy a(Object paramObject)
  {
    zgm localzgm = new zgm(this.a, paramObject);
    zf.a(this.InnerList, localzgm);
    return localzgm;
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */