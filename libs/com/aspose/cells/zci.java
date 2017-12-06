package com.aspose.cells;

class zci
  extends ztv
{
  int a = 0;
  private int b;
  
  zci(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
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
    zci localzci = (zci)paramztv;
    this.b = localzci.b;
    this.a = localzci.a;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */