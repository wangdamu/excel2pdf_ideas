package com.aspose.cells;

class zbtd
  extends ztv
{
  int a = 0;
  private int b;
  
  zbtd(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(paramWorkbook, paramFontSetting, paramInt);
  }
  
  boolean a(int paramInt)
  {
    return (this.b & paramInt) != 0;
  }
  
  void b(int paramInt)
  {
    this.b |= paramInt;
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zbtd localzbtd = (zbtd)paramztv;
    this.b = localzbtd.b;
    this.a = localzbtd.a;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */