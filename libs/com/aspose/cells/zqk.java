package com.aspose.cells;

import com.aspose.cells.b.a.a.zg;
import java.util.HashMap;

class zqk
{
  HashMap a = new HashMap();
  
  void a(int paramInt, Object paramObject)
  {
    if (this.a.containsKey(Integer.valueOf(paramInt))) {
      this.a.remove(Integer.valueOf(paramInt));
    }
    this.a.put(Integer.valueOf(paramInt), paramObject);
  }
  
  void a(zqk paramzqk)
  {
    this.a = zg.b(paramzqk.a);
  }
  
  Object a(int paramInt)
  {
    return this.a.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */