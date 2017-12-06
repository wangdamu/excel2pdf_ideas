package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class zbxh
  extends CollectionBase
  implements zaju
{
  private zbfc a;
  private zje b;
  
  zbxh(zje paramzje, zbfc paramzbfc)
  {
    this.b = paramzje;
    this.a = paramzbfc;
  }
  
  public zbfc a()
  {
    return this.a;
  }
  
  public zajt a(int paramInt)
  {
    return (zajt)this.InnerList.get(paramInt);
  }
  
  zbxf c(int paramInt)
  {
    return (zbxf)this.InnerList.get(paramInt);
  }
  
  public int b(int paramInt)
  {
    zbxf localzbxf = new zbxf(this.b, this);
    localzbxf.d(paramInt);
    zf.a(this.InnerList, localzbxf);
    return this.InnerList.size() - 1;
  }
  
  List b()
  {
    return this.InnerList;
  }
  
  public ArrayList c()
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, this.InnerList);
    zbxe localzbxe = new zbxe();
    Collections.sort(localArrayList, localzbxe);
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */