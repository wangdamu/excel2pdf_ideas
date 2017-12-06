package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbas
  extends zcd
{
  zbas()
  {
    c(2048);
  }
  
  void a(CellArea paramCellArea, String paramString)
    throws Exception
  {
    byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
    a((short)(arrayOfByte.length + 12));
    this.b = new byte[d()];
    this.b[1] = 8;
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, this.b, 4, 2);
    this.b[6] = ((byte)paramCellArea.StartColumn);
    this.b[8] = ((byte)paramCellArea.EndColumn);
    System.arraycopy(arrayOfByte, 0, this.b, 10, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */