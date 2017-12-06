package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbvt
  extends CollectionBase
{
  WebQueryConnection a;
  
  zbvt(WebQueryConnection paramWebQueryConnection)
  {
    this.a = paramWebQueryConnection;
  }
  
  public zbvs a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.InnerList.size())) {
      return null;
    }
    return (zbvs)this.InnerList.get(paramInt);
  }
  
  int a(zbvs paramzbvs)
  {
    zf.a(this.InnerList, paramzbvs);
    return getCount() - 1;
  }
  
  void a(zbvt paramzbvt)
  {
    zbvs localzbvs = null;
    for (int i = 0; i < paramzbvt.getCount(); i++)
    {
      localzbvs = new zbvs();
      localzbvs.a(paramzbvt.a(i));
      a(localzbvs);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */