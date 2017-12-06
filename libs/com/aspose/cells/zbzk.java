package com.aspose.cells;

import java.util.Iterator;

class zbzk
  extends zbzn
{
  String a = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
  
  zbzk(String paramString)
  {
    this.a = paramString;
  }
  
  zbzk() {}
  
  void a(zbzs paramzbzs)
    throws Exception
  {
    paramzbzs.c = this.a;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      zbzn localzbzn = (zbzn)localIterator.next();
      localzbzn.a(paramzbzs);
    }
  }
  
  void a(String[] paramArrayOfString)
  {
    int tmp9_8 = 0;
    String[] tmp9_7 = paramArrayOfString;
    tmp9_7[tmp9_8] = (tmp9_7[tmp9_8] + this.a);
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      zbzn localzbzn = (zbzn)localIterator.next();
      localzbzn.a(paramArrayOfString);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */