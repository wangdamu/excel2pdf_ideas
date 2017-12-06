package com.aspose.cells;

class zaf
  extends ztv
{
  String a = "";
  private int b;
  
  zaf(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
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
    zaf localzaf = (zaf)paramztv;
    this.b = localzaf.b;
    this.a = localzaf.a;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */