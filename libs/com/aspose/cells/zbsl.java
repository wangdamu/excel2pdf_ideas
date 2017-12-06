package com.aspose.cells;

import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zm;

class zbsl
  implements IStreamProvider
{
  public void initStream(StreamProviderOptions options)
    throws Exception
  {
    String str = options.b;
    if (str == null) {
      return;
    }
    str = zit.a(str);
    if (zd.c(str)) {
      options.c = zd.b(str);
    } else {
      options.c = null;
    }
  }
  
  public void closeStream(StreamProviderOptions options)
    throws Exception
  {
    if (options.c != null)
    {
      options.c.a();
      options.c = null;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */