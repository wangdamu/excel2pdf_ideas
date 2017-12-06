package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import java.awt.Color;
import java.io.IOException;

public class zaf
  extends ze
{
  private int a;
  private int b;
  private int c;
  private Color d;
  private int e;
  private float[] f;
  
  public zaf(int paramInt1, int paramInt2, Color paramColor, float[] paramArrayOfFloat)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
    {
      this.c = 0;
      this.e = 0;
    }
    else
    {
      this.a |= 0x7;
      this.c = 2;
      this.e = 8;
    }
    this.d = paramColor;
    this.f = paramArrayOfFloat;
  }
  
  public void a(zb paramzb)
    throws IOException
  {
    paramzb.b(this.a);
    paramzb.b(this.b);
    paramzb.d(this.c);
    paramzb.a(this.d);
    paramzb.e(this.e);
    if ((this.f == null) || (this.f.length == 0))
    {
      paramzb.b(0);
      paramzb.b(0);
    }
    else
    {
      paramzb.b(this.f.length);
      for (int j = 0; j < this.f.length; j++)
      {
        int i = (int)(this.f[j] * 1.0F * 20.0F);
        if (i < 1) {
          i = 1;
        }
        paramzb.b(i);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */