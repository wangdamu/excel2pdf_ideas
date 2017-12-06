package com.aspose.cells;

class zdp
  extends ztv
{
  boolean a = false;
  int b = 1;
  boolean c = false;
  boolean d = false;
  boolean e = false;
  private int f;
  
  zdp(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(paramWorkbook, paramFontSetting, paramInt);
  }
  
  boolean a(int paramInt)
  {
    return (this.f & paramInt) != 0;
  }
  
  void b(int paramInt)
  {
    this.f |= paramInt;
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zdp localzdp = (zdp)paramztv;
    this.f = localzdp.f;
    this.a = localzdp.a;
    this.b = localzdp.b;
    this.c = localzdp.c;
    this.d = localzdp.d;
    this.e = localzdp.e;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */