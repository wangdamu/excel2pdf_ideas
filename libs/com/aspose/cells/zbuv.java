package com.aspose.cells;

class zbuv
{
  int a;
  byte b;
  byte c;
  short d;
  String e;
  PivotField f;
  String g;
  short h;
  short i;
  
  zbuv(PivotField paramPivotField)
  {
    this.f = paramPivotField;
    this.a = 5150;
    this.c = 10;
    this.i = (this.h = -1);
  }
  
  String a()
  {
    return this.e;
  }
  
  void a(String paramString)
  {
    this.e = paramString;
  }
  
  void a(zbuv paramzbuv)
  {
    this.a = paramzbuv.a;
    this.b = paramzbuv.b;
    this.g = paramzbuv.g;
    this.d = paramzbuv.d;
    this.e = paramzbuv.e;
    this.c = paramzbuv.c;
    PivotFieldCollection localPivotFieldCollection = this.f.b.b.getDataFields();
    this.h = paramzbuv.h;
    this.i = paramzbuv.i;
  }
  
  boolean a(int paramInt)
  {
    return (this.a & 0xFFFF & paramInt) != 0;
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    this.a &= (paramInt ^ 0xFFFFFFFF);
    this.a |= (paramBoolean ? paramInt : 0);
  }
  
  short b()
  {
    return this.i;
  }
  
  short c()
  {
    return this.h;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */