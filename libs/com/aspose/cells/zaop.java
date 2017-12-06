package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zaop
{
  zaop a = null;
  ArrayList b = new ArrayList();
  ArrayList c = new ArrayList();
  String d;
  boolean e = false;
  zcjq f = null;
  int g = 0;
  
  boolean a()
  {
    return this.f != null;
  }
  
  boolean b()
  {
    return this.g > 0;
  }
  
  zaoo a(String paramString)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      zaoo localzaoo = (zaoo)localIterator.next();
      if (localzaoo.d.equals(paramString)) {
        return localzaoo;
      }
    }
    return null;
  }
  
  zaoo c()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      zaoo localzaoo = (zaoo)localIterator.next();
      if (localzaoo.g) {
        return localzaoo;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */