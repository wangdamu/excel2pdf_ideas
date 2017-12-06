package com.aspose.cells;

class zdj
  extends ztv
{
  boolean a = false;
  boolean b = false;
  boolean c = false;
  boolean d = false;
  boolean e = false;
  boolean f = false;
  boolean g = false;
  boolean h = false;
  private int v;
  
  zdj(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(paramWorkbook, paramFontSetting, paramInt);
  }
  
  boolean a(int paramInt)
  {
    return (this.v & paramInt) != 0;
  }
  
  void b(int paramInt)
  {
    this.v |= paramInt;
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zdj localzdj = (zdj)paramztv;
    this.v = localzdj.v;
    this.a = localzdj.a;
    this.b = localzdj.b;
    this.c = localzdj.c;
    this.d = localzdj.d;
    this.e = localzdj.e;
    this.f = localzdj.f;
    this.g = localzdj.g;
    this.h = localzdj.h;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */