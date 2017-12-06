package com.aspose.cells.a.d;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class zd
  extends zn
{
  private ArrayList a = new ArrayList();
  
  public void a(zf paramzf)
    throws Exception
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zn localzn = (zn)localIterator.next();
      localzn.a(paramzf);
    }
  }
  
  public int a(zn paramzn)
  {
    if (paramzn == null) {
      throw new IllegalArgumentException("node");
    }
    paramzn.a(this);
    return com.aspose.cells.b.a.a.zf.a(this.a, paramzn);
  }
  
  public zn a(int paramInt)
  {
    return (zn)this.a.get(paramInt);
  }
  
  public ArrayList h()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */