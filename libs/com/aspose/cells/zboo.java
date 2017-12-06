package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zboo
  extends CollectionBase
{
  private Object a;
  
  zboo(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public zbnh a(int paramInt)
  {
    return (zbnh)this.InnerList.get(paramInt);
  }
  
  public zbnh b(int paramInt)
  {
    zbnh localzbnh = new zbnh(this, paramInt);
    com.aspose.cells.b.a.a.zf.a(this.InnerList, localzbnh);
    return localzbnh;
  }
  
  public void a(zr paramzr)
    throws Exception
  {
    zje localzje = null;
    if ((this.a instanceof zje)) {
      localzje = (zje)this.a;
    }
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zbnh localzbnh = (zbnh)localIterator.next();
      com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
      localzbnh.a(paramzr, false);
      paramzr.a(localzf);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */