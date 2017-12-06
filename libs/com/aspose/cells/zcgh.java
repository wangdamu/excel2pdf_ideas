package com.aspose.cells;

class zcgh
  extends zche
{
  zcgh()
  {
    this.d = 494;
  }
  
  void a(zpk paramzpk)
    throws Exception
  {
    int i = 32;
    if (paramzpk.a != null) {
      i += paramzpk.a.length() * 2;
    }
    String str = paramzpk.b.getTextToDisplay();
    if (str != null) {
      i += str.length() * 2;
    }
    if (paramzpk.b.getScreenTip() != null) {
      i += paramzpk.b.getScreenTip().length() * 2;
    }
    if (paramzpk.d == 2) {
      i += paramzpk.b.getAddress().length() * 2;
    }
    this.c = new byte[i];
    zcgj.a(paramzpk.b.getArea(), this.c, 0);
    int j = 16;
    j = zcgj.a(this.c, j, paramzpk.a);
    if (paramzpk.d == 2) {
      j = zcgj.a(this.c, j, paramzpk.b.getAddress());
    } else {
      j += 4;
    }
    j = zcgj.a(this.c, j, paramzpk.b.getScreenTip());
    j = zcgj.a(this.c, j, str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */