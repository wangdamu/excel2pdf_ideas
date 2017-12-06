package com.aspose.cells.a.d;

import com.aspose.cells.Color;

public class zhe
{
  public int a;
  public int b;
  public Color c;
  
  public zhe(zcw paramzcw)
    throws Exception
  {
    this.a = paramzcw.q();
    this.b = paramzcw.q();
    int i = (byte)((paramzcw.p() & 0xFFFF) >> 8) & 0xFF;
    int j = (byte)((paramzcw.p() & 0xFFFF) >> 8) & 0xFF;
    int k = (byte)((paramzcw.p() & 0xFFFF) >> 8) & 0xFF;
    int m = (byte)((paramzcw.p() & 0xFFFF) >> 8) & 0xFF;
    this.c = Color.fromArgb(m, i, j, k);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */