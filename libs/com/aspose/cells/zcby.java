package com.aspose.cells;

class zcby
  extends zche
{
  Workbook a;
  
  zcby(Workbook paramWorkbook)
  {
    this.d = 46;
    this.a = paramWorkbook;
  }
  
  void a(zow paramzow)
  {
    this.c = new byte[51];
    int i = 0;
    if (paramzow.j) {
      i |= 0x2;
    }
    if (paramzow.i) {
      i |= 0x1;
    }
    this.c[0] = ((byte)i);
    a(1, paramzow.b);
    a(11, paramzow.d);
    a(21, paramzow.c);
    a(31, paramzow.e);
    if ((paramzow.j) || (paramzow.i)) {
      a(41, paramzow.f);
    }
  }
  
  private void a(int paramInt, zox paramzox)
  {
    this.c[paramInt] = ((byte)zcij.n(paramzox.c));
    zche.a(this.c, paramInt + 2, paramzox.b, 64, this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */