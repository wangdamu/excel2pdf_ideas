package com.aspose.cells;

import java.util.Iterator;

class zatw
  extends zbzn
{
  zatw(String paramString)
  {
    this.c = paramString;
  }
  
  void a(String[] paramArrayOfString) {}
  
  void a(zbzs paramzbzs)
    throws Exception
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      zbzn localzbzn = (zbzn)localIterator.next();
      localzbzn.a(paramzbzs);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */