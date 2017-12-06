package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zbzm
  extends zbzn
{
  public String a;
  ArrayList b = new ArrayList();
  
  zbzm(String paramString1, String paramString2)
  {
    this.c = paramString1;
    if ((paramString2 == null) || (paramString2.length() == 0)) {
      this.a = "";
    } else {
      this.a = paramString2;
    }
  }
  
  void a(String[] paramArrayOfString)
  {
    int tmp9_8 = 0;
    String[] tmp9_7 = paramArrayOfString;
    tmp9_7[tmp9_8] = (tmp9_7[tmp9_8] + "<" + this.c);
    Iterator localIterator = this.b.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zamo)localIterator.next();
      int tmp68_67 = 0;
      String[] tmp68_66 = paramArrayOfString;
      tmp68_66[tmp68_67] = (tmp68_66[tmp68_67] + " " + ((zamo)localObject).a + "=\"" + ((zamo)localObject).b + "\"");
    }
    int tmp118_117 = 0;
    String[] tmp118_116 = paramArrayOfString;
    tmp118_116[tmp118_117] = (tmp118_116[tmp118_117] + ">");
    localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zbzn)localIterator.next();
      ((zbzn)localObject).a(paramArrayOfString);
    }
    int tmp178_177 = 0;
    String[] tmp178_176 = paramArrayOfString;
    tmp178_176[tmp178_177] = (tmp178_176[tmp178_177] + this.a + "</" + this.c + ">");
  }
  
  void a(zbzs paramzbzs)
    throws Exception
  {
    zbzs tmp8_7 = paramzbzs;
    tmp8_7.c = (tmp8_7.c + "<" + this.c);
    Iterator localIterator = this.b.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zamo)localIterator.next();
      zbzs tmp70_69 = paramzbzs;
      tmp70_69.c = (tmp70_69.c + " " + ((zamo)localObject).a + "=\"" + ((zamo)localObject).b + "\"");
    }
    paramzbzs.c += ">";
    localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zbzn)localIterator.next();
      ((zbzn)localObject).a(paramzbzs);
    }
    zbzs tmp186_185 = paramzbzs;
    tmp186_185.c = (tmp186_185.c + this.a + "</" + this.c + ">");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */