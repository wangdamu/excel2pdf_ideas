package com.aspose.cells;

import java.util.Iterator;

class zchg
  extends zcfo
{
  private zbcj c;
  
  zchg(zbcj paramzbcj)
  {
    this.c = paramzbcj;
  }
  
  void d()
    throws Exception
  {
    zcdm localzcdm = new zcdm(this.c);
    localzcdm.a(this.b);
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      zbci localzbci = (zbci)localIterator.next();
      zcdy localzcdy = new zcdy(localzbci);
      localzcdy.a(this.b);
    }
    zche.a(403, this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */