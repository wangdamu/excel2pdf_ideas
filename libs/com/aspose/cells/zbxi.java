package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbxi
  extends CollectionBase
  implements zaju
{
  private zbfd a;
  private zjf b;
  
  zbxi(zjf paramzjf, zbfd paramzbfd)
  {
    this.b = paramzjf;
    this.a = paramzbfd;
  }
  
  public zbfd a()
  {
    return this.a;
  }
  
  public zajt a(int paramInt)
  {
    return (zbxg)this.InnerList.get(paramInt);
  }
  
  zbxg c(int paramInt)
  {
    return (zbxg)this.InnerList.get(paramInt);
  }
  
  public int b(int paramInt)
  {
    zbxg localzbxg = new zbxg(this.b, this);
    localzbxg.d(paramInt);
    zf.a(this.InnerList, localzbxg);
    return this.InnerList.size() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */