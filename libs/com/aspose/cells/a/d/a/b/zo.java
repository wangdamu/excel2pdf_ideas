package com.aspose.cells.a.d.a.b;

import com.aspose.cells.a.d.a.zb;
import java.io.IOException;

public class zo
  extends zk
{
  private int a;
  private final float[] b;
  private final float[] c;
  private final byte[] d;
  private final int e;
  
  public zo(int paramInt1, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, byte[] paramArrayOfByte, int paramInt2)
  {
    super(paramInt1);
    this.e = paramInt2;
    this.b = paramArrayOfFloat1;
    this.c = paramArrayOfFloat2;
    this.d = paramArrayOfByte;
    this.a = 0;
  }
  
  public int a()
  {
    return 3;
  }
  
  public int d()
  {
    return 12 + this.e + (4 - this.e % 4) % 4 + (this.e << ((this.a & 0x4000) != 0 ? 2 : (this.a & 0x800) != 0 ? 1 : 3));
  }
  
  public int a(zb paramzb)
    throws IOException
  {
    int i = b(paramzb);
    paramzb.b(-608169982);
    paramzb.b(this.e);
    paramzb.c(this.a);
    paramzb.c(0);
    for (int j = 0; j < this.e; j++)
    {
      paramzb.a(this.b[j]);
      paramzb.a(this.c[j]);
    }
    paramzb.a(this.d, 0, this.e);
    for (j = (4 - this.e % 4) % 4; j > 0; j--) {
      paramzb.g(0);
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/b/zo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */