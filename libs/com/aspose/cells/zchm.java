package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zchm
  extends zche
{
  zchm()
  {
    this.d = 19;
  }
  
  void a(String paramString)
    throws Exception
  {
    this.c = new byte[5 + paramString.length() * 2];
    int i = 1;
    i = zcgj.a(this.c, i, paramString);
  }
  
  void a(zbdd paramzbdd, Workbook paramWorkbook)
    throws Exception
  {
    byte[] arrayOfByte = paramzbdd.h();
    int i = arrayOfByte.length;
    this.c = new byte[5 + paramzbdd.c.length() * 2 + 4 + i];
    this.c[0] = 1;
    int j = 1;
    j = zcgj.a(this.c, j, paramzbdd.c);
    System.arraycopy(zc.a(arrayOfByte.length / 4), 0, this.c, j, 4);
    j += 4;
    for (int k = 0; k < i; k += 4)
    {
      int m = zauj.a(arrayOfByte, k);
      int n = zauj.a(arrayOfByte, k + 2);
      int i1 = a(n, paramWorkbook.getWorksheets());
      System.arraycopy(zc.a(m), 0, this.c, j, 2);
      j += 2;
      System.arraycopy(zc.a(i1), 0, this.c, j, 2);
      j += 2;
    }
  }
  
  private int a(int paramInt, WorksheetCollection paramWorksheetCollection)
  {
    for (int i = 0; i < paramWorksheetCollection.A().size(); i++)
    {
      Font localFont = (Font)paramWorksheetCollection.A().get(i);
      if (paramInt == localFont.m()) {
        return i;
      }
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */