package com.aspose.cells;

class zack
  extends ztv
{
  float a = 0.0F;
  float b = 0.0F;
  float c = 0.0F;
  float d = 0.0F;
  float e = 0.0F;
  int f = 0;
  private int g;
  
  zack(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(paramWorkbook, paramFontSetting, paramInt);
  }
  
  boolean a(int paramInt)
  {
    return (this.g & paramInt) != 0;
  }
  
  void b(int paramInt)
  {
    this.g |= paramInt;
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zack localzack = (zack)paramztv;
    this.g = localzack.g;
    this.f = localzack.f;
    this.a = localzack.a;
    this.b = localzack.b;
    this.c = localzack.c;
    this.d = localzack.d;
    this.e = localzack.e;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */