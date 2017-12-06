package com.aspose.cells;

class zaqk
  extends ztv
{
  String a = "";
  boolean b = false;
  int c = 0;
  boolean d = false;
  boolean e = false;
  float f = 0.0F;
  float g = 0.0F;
  float h = 0.0F;
  float v = 0.0F;
  float w = 0.0F;
  float x = 0.0F;
  float y = 0.0F;
  float z = 0.0F;
  float A = 0.0F;
  float B = 0.0F;
  float C = 0.0F;
  float D = 0.0F;
  float E = 0.0F;
  private int F;
  
  zaqk(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(paramWorkbook, paramFontSetting, paramInt);
  }
  
  boolean a(int paramInt)
  {
    return (this.F & paramInt) != 0;
  }
  
  void b(int paramInt)
  {
    this.F |= paramInt;
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zaqk localzaqk = (zaqk)paramztv;
    this.F = localzaqk.F;
    this.a = localzaqk.a;
    this.b = localzaqk.b;
    this.c = localzaqk.c;
    this.d = localzaqk.d;
    this.e = localzaqk.e;
    this.f = localzaqk.f;
    this.g = localzaqk.g;
    this.h = localzaqk.h;
    this.v = localzaqk.v;
    this.w = localzaqk.w;
    this.x = localzaqk.x;
    this.y = localzaqk.y;
    this.z = localzaqk.z;
    this.A = localzaqk.A;
    this.C = localzaqk.C;
    this.B = localzaqk.B;
    this.D = localzaqk.D;
    this.E = localzaqk.E;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */