package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zxe
  extends zcd
{
  zxe(Workbook paramWorkbook)
    throws Exception
  {
    c(91);
    String str = paramWorkbook.getWorksheets().ac();
    if (str == null) {
      str = "Aspose";
    }
    byte[] arrayOfByte = Encoding.getASCII().a(str);
    a((short)(7 + arrayOfByte.length));
    this.b = new byte[d()];
    WriteProtection localWriteProtection = paramWorkbook.getSettings().getWriteProtection();
    if (localWriteProtection.getRecommendReadOnly()) {
      this.b[0] = 1;
    }
    System.arraycopy(zc.a(localWriteProtection.c()), 0, this.b, 2, 2);
    this.b[4] = ((byte)arrayOfByte.length);
    System.arraycopy(arrayOfByte, 0, this.b, 7, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */