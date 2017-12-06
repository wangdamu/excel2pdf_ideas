package com.aspose.cells;

class zag
{
  int a = 27;
  int b = -2147483630;
  int c = -2147483633;
  byte d;
  int e = -2147483642;
  byte f;
  byte g;
  int h;
  int i;
  byte[] j;
  byte[] k;
  int l = 458753;
  char m = '\000';
  String n;
  byte o;
  byte p;
  byte q;
  
  boolean a(int paramInt)
  {
    int i1 = 1 << paramInt;
    return (this.a & i1) != 0;
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    int i1 = 1 << paramInt;
    if (paramBoolean) {
      this.a |= i1;
    } else {
      this.a &= (i1 ^ 0xFFFFFFFF);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */