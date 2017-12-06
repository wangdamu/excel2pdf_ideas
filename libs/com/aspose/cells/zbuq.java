package com.aspose.cells;

class zbuq
  extends zcd
{
  zbuq(SxRng paramSxRng)
  {
    c(216);
    b(2);
    this.b = new byte[2];
    int i = 0;
    if (paramSxRng.a) {
      i = (byte)(i | 0x1);
    }
    if (paramSxRng.b) {
      i = (byte)(i | 0x2);
    }
    int j = zaxj.e(paramSxRng.c);
    i = (byte)(i | (byte)(j << 2));
    System.arraycopy(paramSxRng.e, 0, this.b, 0, 2);
    this.b[0] = i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */