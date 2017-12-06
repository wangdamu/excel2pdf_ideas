package com.aspose.cells;

class zcjd
  extends zciw
{
  private zbcq e;
  
  zcjd(WorksheetCollection paramWorksheetCollection)
  {
    super(paramWorksheetCollection);
    this.e = new zbcq(paramWorksheetCollection);
  }
  
  void a(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    paramStringBuilder.append(this.e.i(paramArrayOfByte, this.c));
    this.c = this.e.a;
  }
  
  void b(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    paramStringBuilder.append(this.e.h(paramArrayOfByte, this.c));
    this.c = this.e.a;
  }
  
  String a(int paramInt)
  {
    String str = this.e.g(this.d, this.c);
    this.c = this.e.a;
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */