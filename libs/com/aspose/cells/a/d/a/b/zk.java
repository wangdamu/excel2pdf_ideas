package com.aspose.cells.a.d.a.b;

import com.aspose.cells.a.d.a.zb;
import java.io.IOException;

public abstract class zk
  extends zs
{
  private byte a;
  
  public abstract int a();
  
  public abstract int d();
  
  public zk(int paramInt)
  {
    this.a = ((byte)paramInt);
  }
  
  public int b()
  {
    return 16392;
  }
  
  public int c()
  {
    return 12 + d();
  }
  
  public int b(zb paramzb)
    throws IOException
  {
    paramzb.c(16392);
    paramzb.c(a() << 8 | this.a);
    int i = d();
    paramzb.b(i + 12);
    paramzb.b(i);
    return i + 12;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/b/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */