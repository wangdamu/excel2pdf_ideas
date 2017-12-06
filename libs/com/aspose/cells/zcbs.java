package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbs
  extends zche
{
  zcbs(ListObject paramListObject)
    throws Exception
  {
    this.d = 343;
    int i = 88;
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    String str = paramListObject.b();
    if (str != null) {
      i += str.length() * 2;
    }
    str = paramListObject.o();
    if (str != null) {
      i += str.length() * 2;
    }
    str = paramListObject.getComment();
    if (str != null) {
      i += str.length() * 2;
    }
    this.c = new byte[i];
    int j = 0;
    zcgj.a(a(paramListObject), this.c, 0);
    int k = zcij.C(paramListObject.getDataSourceType());
    System.arraycopy(zc.a(k), 0, this.c, 16, 4);
    System.arraycopy(zc.a(paramListObject.a()), 0, this.c, 20, 4);
    int m = paramListObject.x() == -1 ? 1 : paramListObject.x();
    System.arraycopy(zc.a(m), 0, this.c, 24, 4);
    if (!paramListObject.f())
    {
      j = (byte)(j | 0x0);
    }
    else
    {
      j = (byte)(j | 0x1);
      n = paramListObject.z() > 1 ? paramListObject.z() : 1;
      System.arraycopy(zc.a(n), 0, this.c, 28, 4);
    }
    if (paramListObject.g()) {
      j = (byte)(j | 0x2);
    }
    if (paramListObject.j()) {
      j = (byte)(j | 0x10);
    }
    if (paramListObject.e()) {
      j = (byte)(j | 0x8);
    }
    this.c[32] = j;
    System.arraycopy(zc.a(paramListObject.e), 0, this.c, 36, 4);
    System.arraycopy(zc.a(paramListObject.f), 0, this.c, 40, 4);
    System.arraycopy(zc.a(paramListObject.g), 0, this.c, 44, 4);
    System.arraycopy(zc.a(paramListObject.h), 0, this.c, 48, 4);
    System.arraycopy(zc.a(paramListObject.i), 0, this.c, 52, 4);
    System.arraycopy(zc.a(paramListObject.j), 0, this.c, 56, 4);
    if (paramListObject.k() != -1) {
      System.arraycopy(zc.a(paramListObject.k()), 0, this.c, 60, 4);
    }
    int n = 64;
    str = paramListObject.b();
    if (str != null)
    {
      n = zcgj.a(this.c, n, str);
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, n, 4);
      n += 4;
    }
    str = paramListObject.o();
    if (str != null)
    {
      n = zcgj.a(this.c, n, str);
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, n, 4);
      n += 4;
    }
    str = paramListObject.getComment();
    if (str != null)
    {
      n = zcgj.a(this.c, n, str);
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, n, 4);
      n += 4;
    }
    System.arraycopy(arrayOfByte, 0, this.c, n, 4);
    n += 4;
    System.arraycopy(arrayOfByte, 0, this.c, n, 4);
    n += 4;
    System.arraycopy(arrayOfByte, 0, this.c, n, 4);
    n += 4;
  }
  
  private CellArea a(ListObject paramListObject)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramListObject.getStartRow();
    localCellArea.StartColumn = paramListObject.getStartColumn();
    localCellArea.EndRow = paramListObject.getEndRow();
    localCellArea.EndColumn = paramListObject.getEndColumn();
    return localCellArea;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */