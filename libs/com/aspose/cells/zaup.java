package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaup
  extends zcd
{
  zaup(PicFormatOption paramPicFormatOption)
  {
    c(4156);
    b(14);
    this.b = new byte[d()];
    switch (paramPicFormatOption.getType())
    {
    case 0: 
      this.b[0] = 1;
      break;
    case 1: 
      this.b[0] = 2;
      break;
    case 2: 
      this.b[0] = 3;
    }
    System.arraycopy(zc.a(paramPicFormatOption.a), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramPicFormatOption.a()), 0, this.b, 4, 2);
    System.arraycopy(zc.a(paramPicFormatOption.getScale()), 0, this.b, 6, 8);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */