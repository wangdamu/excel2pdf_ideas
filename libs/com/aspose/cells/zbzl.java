package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zbzl
  extends zbzn
{
  ArrayList a = new ArrayList();
  
  zbzl(String paramString)
  {
    this.c = paramString;
  }
  
  void a(String[] paramArrayOfString)
  {
    int tmp9_8 = 0;
    String[] tmp9_7 = paramArrayOfString;
    tmp9_7[tmp9_8] = (tmp9_7[tmp9_8] + "<" + this.c);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zamo localzamo = (zamo)localIterator.next();
      int tmp68_67 = 0;
      String[] tmp68_66 = paramArrayOfString;
      tmp68_66[tmp68_67] = (tmp68_66[tmp68_67] + " " + localzamo.a + "=\"" + localzamo.b + "\"");
    }
    int tmp118_117 = 0;
    String[] tmp118_116 = paramArrayOfString;
    tmp118_116[tmp118_117] = (tmp118_116[tmp118_117] + "/>");
  }
  
  void a(zbzs paramzbzs)
  {
    zbzs tmp8_7 = paramzbzs;
    tmp8_7.c = (tmp8_7.c + "<" + this.c);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zamo localzamo = (zamo)localIterator.next();
      zbzs tmp70_69 = paramzbzs;
      tmp70_69.c = (tmp70_69.c + " " + localzamo.a + "=\"" + localzamo.b + "\"");
    }
    paramzbzs.c += "/>";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */