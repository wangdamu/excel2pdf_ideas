package com.aspose.cells.b.a.b;

import com.aspose.cells.a.e.zg;
import java.util.HashMap;

public enum zk
{
  private int cm;
  private static HashMap<String, zk> cn;
  private static HashMap<Integer, String> co;
  
  public static zk[] a()
  {
    return (zk[])cp.clone();
  }
  
  private zk(int paramInt)
  {
    this.cm = paramInt;
  }
  
  public int b()
  {
    return this.cm;
  }
  
  public static zk a(String paramString)
  {
    if (!zg.a(paramString)) {
      return a;
    }
    if (cn == null)
    {
      cn = new HashMap(167);
      for (Object localObject2 : a()) {
        cn.put(((zk)localObject2).name().toLowerCase(), localObject2);
      }
    }
    ??? = (zk)cn.get(paramString.toLowerCase());
    return (zk)(??? != null ? ??? : a);
  }
  
  static
  {
    co = new HashMap();
    for (zk localzk : a()) {
      co.put(Integer.valueOf(localzk.b()), localzk.name().toLowerCase());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */