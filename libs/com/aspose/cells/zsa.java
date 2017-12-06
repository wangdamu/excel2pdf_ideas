package com.aspose.cells;

class zsa
  extends ztv
{
  String a = "(";
  String b = ")";
  boolean c = false;
  String d = "|";
  int e = 0;
  private int f;
  
  zsa(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
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
    zsa localzsa = (zsa)paramztv;
    this.f = localzsa.f;
    this.a = localzsa.a;
    this.b = localzsa.b;
    this.c = localzsa.c;
    this.d = localzsa.d;
    this.e = localzsa.e;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */