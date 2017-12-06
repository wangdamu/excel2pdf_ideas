package com.aspose.cells;

import com.aspose.cells.b.a.d.zc;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;

class zbsk
  implements IStreamProvider
{
  private String a;
  private int b;
  
  zbsk(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public void initStream(StreamProviderOptions options)
    throws Exception
  {
    String str = this.a + options.a.substring(this.b);
    zc.b(zit.a(zk.e(str)));
    options.c = zd.a(str);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */