package com.aspose.cells;

class zpy
{
  private long a;
  
  boolean a(long paramLong)
  {
    return (this.a & 0xFFFFFFFF & paramLong & 0xFFFFFFFF) != 0L;
  }
  
  void b(long paramLong)
  {
    this.a |= paramLong;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */