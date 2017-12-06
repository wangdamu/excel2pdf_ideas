package com.aspose.cells;

import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zm;

class zbet
{
  static long a(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {
      return ((paramLong & 0xFFFFFFFF) + 1L) * 512L;
    }
    return (paramLong & 0xFFFFFFFF) * 64L;
  }
  
  static long b(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramLong / 512L - 1L;
    }
    return paramLong / 64L;
  }
  
  static void a(zb paramzb)
    throws Exception
  {
    while (paramzb.a().i() % 512L != 0L) {
      paramzb.a(4294967295L);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */