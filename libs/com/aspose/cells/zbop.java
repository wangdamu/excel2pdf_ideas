package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zbop
  extends CollectionBase
{
  private Object a;
  
  zbop(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public zbni a(int paramInt)
  {
    return (zbni)this.InnerList.get(paramInt);
  }
  
  public zbni b(int paramInt)
  {
    zbni localzbni = new zbni(this, paramInt);
    com.aspose.cells.b.a.a.zf.a(this.InnerList, localzbni);
    return localzbni;
  }
  
  public void a(zr paramzr)
    throws Exception
  {
    zjf localzjf = null;
    if ((this.a instanceof zjf)) {
      localzjf = (zjf)this.a;
    }
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zbni localzbni = (zbni)localIterator.next();
      if ((localzjf != null) && (!localzjf.i().c().k())) {
        localzbni.a = false;
      }
      com.aspose.cells.b.a.b.a.zf localzf = paramzr.d();
      localzbni.a(paramzr, false);
      paramzr.a(localzf);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */