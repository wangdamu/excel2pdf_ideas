package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbqj
  extends zcd
{
  zbqj()
  {
    c(2175);
  }
  
  void a(zrr paramzrr, CellArea paramCellArea)
  {
    int i = 42;
    byte[] arrayOfByte = null;
    if (paramzrr.d() == 0)
    {
      String str = paramzrr.g();
      if ((str != null) && (!"".equals(str)))
      {
        arrayOfByte = Encoding.getUnicode().a(str);
        i += arrayOfByte.length + 1;
      }
    }
    a((short)i);
    this.b = new byte[i];
    this.b[0] = Byte.MAX_VALUE;
    this.b[1] = 8;
    if (paramzrr.b() == 1)
    {
      byte[] tmp95_90 = this.b;
      tmp95_90[12] = ((byte)(tmp95_90[12] | 0x1));
    }
    switch (paramzrr.d())
    {
    case 0: 
      if (arrayOfByte != null)
      {
        System.arraycopy(zc.a(arrayOfByte.length / 2), 0, this.b, 38, 4);
        this.b[42] = 1;
        System.arraycopy(arrayOfByte, 0, this.b, 43, arrayOfByte.length);
      }
      break;
    case 3: 
      byte[] tmp188_183 = this.b;
      tmp188_183[12] = ((byte)(tmp188_183[12] | 0x6));
      System.arraycopy(zc.a(ztr.i(paramzrr.h())), 0, this.b, 30, 4);
      System.arraycopy(zc.a(paramzrr.i()), 0, this.b, 34, 4);
    }
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, this.b, 14, 4);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, this.b, 18, 4);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, this.b, 22, 4);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, this.b, 26, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */