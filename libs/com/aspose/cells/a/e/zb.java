package com.aspose.cells.a.e;

import java.util.HashMap;

public class zb
  extends HashMap
{
  private zd a(Object paramObject)
  {
    zd localzd;
    if ((paramObject instanceof zd)) {
      localzd = (zd)paramObject;
    } else {
      localzd = new zd(paramObject.toString());
    }
    return localzd;
  }
  
  public boolean containsKey(Object j)
  {
    return super.containsKey(a(j));
  }
  
  public Object put(Object key, Object value)
  {
    return super.put(a(key), value);
  }
  
  public Object get(Object j)
  {
    return super.get(a(j));
  }
  
  public Object remove(Object j)
  {
    return super.remove(a(j));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/e/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */