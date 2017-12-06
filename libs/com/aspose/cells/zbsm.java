package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import java.util.ArrayList;
import java.util.Iterator;

class zbsm
  implements IStreamProvider
{
  private ArrayList a;
  
  public void initStream(StreamProviderOptions options)
  {
    options.c = a(options.getDefaultPath());
  }
  
  public void closeStream(StreamProviderOptions options)
    throws Exception
  {
    if (options.c != null) {
      options.c.a();
    }
  }
  
  public ArrayList a()
  {
    return this.a;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.a = paramArrayList;
  }
  
  private zm a(String paramString)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zapo localzapo = (zapo)localIterator.next();
      if (localzapo.a != null) {
        if (localzapo.a.endsWith(paramString)) {
          return localzapo.b;
        }
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */