package com.aspose.cells;

class zem
  extends zche
{
  zem(Object paramObject)
  {
    this.d = 23;
    this.c = new byte[1];
    if ("#NULL!".equals((String)paramObject)) {
      this.c[0] = 0;
    } else if ("#DIV/0!".equals((String)paramObject)) {
      this.c[0] = 7;
    } else if ("#VALUE!".equals((String)paramObject)) {
      this.c[0] = 15;
    } else if ("#REF!".equals((String)paramObject)) {
      this.c[0] = 23;
    } else if ("#NAME?".equals((String)paramObject)) {
      this.c[0] = 29;
    } else if ("#NUM!".equals((String)paramObject)) {
      this.c[0] = 36;
    } else if ("#N/A".equals((String)paramObject)) {
      this.c[0] = 42;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */