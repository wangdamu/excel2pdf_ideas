package com.aspose.cells.a.d.a.b;

import com.aspose.cells.a.d.a.zb;
import com.aspose.cells.a.d.a.zg;
import java.io.IOException;

public class zaa
  extends zg
{
  private zs[] b;
  private int c;
  private int d;
  
  public zaa()
  {
    this(null, 0, -1);
  }
  
  public zaa(zs[] paramArrayOfzs, int paramInt)
  {
    this(paramArrayOfzs, paramInt, -1);
  }
  
  public zaa(zs[] paramArrayOfzs, int paramInt1, int paramInt2)
  {
    super(70, 1);
    this.b = paramArrayOfzs;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
    this.d = -1;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    if (this.c > 0)
    {
      int i;
      if (this.d < 0)
      {
        this.d = 0;
        for (i = 0; i < this.c; i++) {
          this.d += this.b[i].c();
        }
      }
      if (this.d > 0)
      {
        paramzb.b(this.d + 4);
        paramzb.b(726027589);
        for (i = 0; i < this.c; i++) {
          this.b[i].a(paramzb);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/b/zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */