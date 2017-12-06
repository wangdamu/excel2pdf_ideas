package com.aspose.cells;

import java.util.Iterator;

class zchj
  extends zcfo
{
  private zbcj c;
  
  zchj(zbcj paramzbcj)
  {
    this.c = paramzbcj;
  }
  
  void d()
    throws Exception
  {
    if (this.c.n == null) {
      return;
    }
    zche.a(399, this.c.n.getCount(), 2, this.b);
    zche.a(401, this.b);
    Iterator localIterator = this.c.n.iterator();
    while (localIterator.hasNext())
    {
      zbct localzbct = (zbct)localIterator.next();
      zcej localzcej = new zcej(localzbct);
      localzcej.a(this.b);
    }
    zche.a(403, this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */