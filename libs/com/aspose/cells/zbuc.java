package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbuc
  extends CollectionBase
{
  PivotTable a;
  
  zbuc(PivotTable paramPivotTable)
  {
    this.a = paramPivotTable;
  }
  
  public zbub a(int paramInt)
  {
    return (zbub)this.InnerList.get(paramInt);
  }
  
  void a(zbub paramzbub)
  {
    zf.a(this.InnerList, paramzbub);
  }
  
  void b(zbub paramzbub)
  {
    this.InnerList.remove(paramzbub);
  }
  
  void a(zbuc paramzbuc)
  {
    this.InnerList.clear();
    DxfCollection localDxfCollection1 = paramzbuc.a.a.a.c().getDxfs();
    DxfCollection localDxfCollection2 = this.a.a.a.c().getDxfs();
    for (int j = 0; j < paramzbuc.getCount(); j++)
    {
      zbub localzbub = new zbub(this);
      int i = localDxfCollection2.b(localDxfCollection1.get(paramzbuc.a(j).b));
      localzbub.b = i;
      localzbub.c.a(paramzbuc.a(j).c);
      zf.a(this.InnerList, localzbub);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */