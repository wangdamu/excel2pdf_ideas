package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import java.util.Iterator;

public class zcju
  implements Iterable
{
  public zcjs a;
  
  public zcju(zcjs paramzcjs)
  {
    this.a = paramzcjs;
  }
  
  public Iterator iterator()
  {
    return new zcjt(this.a);
  }
  
  public int a()
  {
    int i = 0;
    for (zcjs localzcjs = this.a.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      i++;
    }
    return i;
  }
  
  public zcjs a(int paramInt)
  {
    if (paramInt >= 0)
    {
      zcjs localzcjs = this.a.m();
      while (localzcjs != null)
      {
        if (paramInt == 0) {
          return localzcjs;
        }
        localzcjs = localzcjs.n();
        paramInt--;
      }
    }
    return null;
  }
  
  public zcjs a(String paramString)
  {
    for (zcjs localzcjs = this.a.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (zw.b(localzcjs.k(), paramString)) {
        return localzcjs;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */