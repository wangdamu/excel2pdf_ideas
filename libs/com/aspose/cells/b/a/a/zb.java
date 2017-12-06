package com.aspose.cells.b.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zb
  implements zc
{
  private HashMap a;
  private Iterator b;
  private za c;
  
  public zb(HashMap paramHashMap)
  {
    this.a = paramHashMap;
    this.b = this.a.keySet().iterator();
  }
  
  public Object a()
  {
    if (this.c != null) {
      return this.c.getKey();
    }
    return null;
  }
  
  public Object b()
  {
    if (this.c != null) {
      return this.c.getValue();
    }
    return null;
  }
  
  public boolean c()
  {
    boolean bool = this.b.hasNext();
    if (bool)
    {
      Object localObject = this.b.next();
      this.c = new za(localObject, this.a.get(localObject));
    }
    else
    {
      this.c = null;
    }
    return bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */