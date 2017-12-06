package com.aspose.cells;

class zbuu
{
  int a;
  String b;
  PivotField c;
  
  zbuu(PivotField paramPivotField)
  {
    this.c = paramPivotField;
    this.a = 1;
  }
  
  void a(zbuu paramzbuu)
  {
    this.b = paramzbuu.b;
    this.a = paramzbuu.a;
  }
  
  short a()
  {
    if (this.a == 1) {
      return 1;
    }
    if (this.a == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 0; j < 16; j++) {
      i += ((this.a & 0xFFFF) >> j & 0x1);
    }
    return (short)i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */