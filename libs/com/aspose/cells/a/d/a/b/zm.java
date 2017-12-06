package com.aspose.cells.a.d.a.b;

import com.aspose.cells.a.d.a.zb;
import java.io.IOException;

public class zm
  extends zk
{
  private float a;
  private int b;
  private int c;
  private String d;
  
  public zm(int paramInt1, float paramFloat, int paramInt2, int paramInt3, String paramString)
  {
    super(paramInt1);
    this.a = paramFloat;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
  }
  
  public int a()
  {
    return 6;
  }
  
  public int d()
  {
    return ((this.d.length() & 0x1) != 0 ? 26 : 24) + (this.d.length() << 1);
  }
  
  public int a(zb paramzb)
    throws IOException
  {
    int i = b(paramzb);
    paramzb.b(-608169982);
    paramzb.a(this.a);
    paramzb.b(this.b);
    paramzb.b(this.c);
    paramzb.b(0);
    paramzb.b(this.d.length());
    paramzb.a(this.d);
    if ((this.d.length() & 0x1) != 0) {
      paramzb.c(0);
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/b/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */