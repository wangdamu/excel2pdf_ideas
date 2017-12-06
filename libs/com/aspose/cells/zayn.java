package com.aspose.cells;

class zayn
  extends ztv
{
  boolean a = false;
  float b = 0.0F;
  float c = 0.0F;
  float d = 0.0F;
  float e = 0.0F;
  float f = 0.0F;
  float g = 0.0F;
  float h = 0.0F;
  float v = 0.0F;
  float w = 0.0F;
  float x = 0.0F;
  private int y;
  
  zayn(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(paramWorkbook, paramFontSetting, paramInt);
  }
  
  boolean a(int paramInt)
  {
    return (this.y & paramInt) != 0;
  }
  
  void b(int paramInt)
  {
    this.y |= paramInt;
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zayn localzayn = (zayn)paramztv;
    this.y = localzayn.y;
    this.a = localzayn.a;
    this.b = localzayn.b;
    this.c = localzayn.c;
    this.d = localzayn.d;
    this.e = localzayn.e;
    this.f = localzayn.f;
    this.g = localzayn.g;
    this.h = localzayn.h;
    this.v = localzayn.v;
    this.w = localzayn.w;
    this.x = localzayn.v;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */