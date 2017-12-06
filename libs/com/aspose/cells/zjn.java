package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zjn
  extends ArrayList
{
  zjm a(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zjm localzjm = (zjm)localIterator.next();
      if (localzjm.a == paramInt) {
        return localzjm;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */