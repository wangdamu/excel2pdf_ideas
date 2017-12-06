package com.aspose.cells;

class zcie
  extends zche
{
  zcie(ListObject paramListObject)
    throws Exception
  {
    this.d = 513;
    int i = 6;
    if (paramListObject.getTableStyleName() != null) {
      i += paramListObject.getTableStyleName().length() * 2;
    }
    this.c = new byte[i];
    int j = 0;
    if (paramListObject.getShowTableStyleFirstColumn()) {
      j = (byte)(j | 0x1);
    }
    if (paramListObject.getShowTableStyleLastColumn()) {
      j = (byte)(j | 0x2);
    }
    if (paramListObject.getShowTableStyleRowStripes()) {
      j = (byte)(j | 0x4);
    }
    if (paramListObject.getShowTableStyleColumnStripes()) {
      j = (byte)(j | 0x8);
    }
    this.c[0] = j;
    int k = 2;
    if (paramListObject.getTableStyleName() != null) {
      k = zcgj.a(this.c, k, paramListObject.getTableStyleName());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */