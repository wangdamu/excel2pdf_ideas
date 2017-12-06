package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbvn
  extends CollectionBase
{
  private Worksheet a;
  
  int a()
  {
    zbpn localzbpn = new zbpn(this.a);
    localzbpn.a(++this.a.c().e);
    zf.a(this.InnerList, localzbpn);
    return this.InnerList.size() - 1;
  }
  
  int a(zbpn paramzbpn)
  {
    if (this.a.c().e < paramzbpn.a()) {
      this.a.c().e = paramzbpn.a();
    }
    zf.a(this.InnerList, paramzbpn);
    return this.InnerList.size() - 1;
  }
  
  public zbpn a(int paramInt)
  {
    return (zbpn)this.InnerList.get(paramInt);
  }
  
  zbvn(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */