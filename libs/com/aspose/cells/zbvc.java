package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbvc
  extends zcd
{
  private zbuz a = null;
  
  zbvc(zbuz paramzbuz)
  {
    c(176);
    this.a = paramzbuz;
    a();
  }
  
  int a(byte[] paramArrayOfByte, int paramInt, CellArea paramCellArea)
  {
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, paramArrayOfByte, paramInt, 2);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, paramArrayOfByte, paramInt + 2, 2);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, paramArrayOfByte, paramInt + 4, 2);
    int i = 0;
    if (paramCellArea.EndColumn > 255)
    {
      i = 255;
      System.arraycopy(zc.a(i), 0, paramArrayOfByte, paramInt + 6, 2);
    }
    else
    {
      System.arraycopy(zc.a(paramCellArea.EndColumn), 0, paramArrayOfByte, paramInt + 6, 2);
    }
    return 8;
  }
  
  void a()
  {
    int i = zct.a(this.a.g);
    i += zct.a(this.a.h);
    a((short)(44 + i));
    this.b = new byte[d()];
    int j = 0;
    PivotTable localPivotTable = this.a.a;
    a(this.b, j, localPivotTable.getTableRange1());
    j += 8;
    CellArea localCellArea = localPivotTable.getColumnRange();
    int k = localCellArea.StartRow + 1;
    int m = localCellArea.EndRow + 1;
    if ((this.a.c.getCount() != 0) && (this.a.d.getCount() != 0) && (this.a.e.getCount() == 0)) {
      k = m = localCellArea.EndRow + 1;
    }
    System.arraycopy(zc.a(localPivotTable.m), 0, this.b, j, 2);
    System.arraycopy(zc.a(m), 0, this.b, j + 2, 2);
    System.arraycopy(zc.a(localCellArea.StartColumn), 0, this.b, j + 4, 2);
    j += 6;
    if (localPivotTable.d != null) {
      System.arraycopy(zc.a((short)localPivotTable.d.f()), 0, this.b, j, 2);
    }
    System.arraycopy(zc.a((short)0), 0, this.b, j + 2, 2);
    j += 4;
    if (this.a.c.getCount() < 2)
    {
      System.arraycopy(zc.a((short)1), 0, this.b, j, 2);
      System.arraycopy(zc.a(65535), 0, this.b, j + 2, 2);
    }
    else
    {
      PivotField localPivotField = localPivotTable.getDataField();
      int i1 = localPivotField.getPosition();
      switch (localPivotField.m)
      {
      case 2: 
        System.arraycopy(zc.a((short)2), 0, this.b, j, 2);
        if (i1 == localPivotTable.getColumnFields().getCount() - 1) {
          i1 = -1;
        }
        break;
      case 1: 
        System.arraycopy(zc.a((short)1), 0, this.b, j, 2);
        if (i1 == localPivotTable.getRowFields().getCount() - 1) {
          i1 = -1;
        }
        break;
      }
      if (i1 == -1) {
        System.arraycopy(zc.a(65535), 0, this.b, j + 2, 2);
      } else {
        System.arraycopy(zc.a(i1), 0, this.b, j + 2, 2);
      }
    }
    j += 4;
    int n = this.a.b.getCount();
    System.arraycopy(zc.a((short)n), 0, this.b, j, 2);
    j += 2;
    n = this.a.d.getCount();
    System.arraycopy(zc.a((short)n), 0, this.b, j, 2);
    n = this.a.e.getCount();
    System.arraycopy(zc.a((short)n), 0, this.b, j + 2, 2);
    n = this.a.f.getCount();
    System.arraycopy(zc.a((short)n), 0, this.b, j + 4, 2);
    n = this.a.c.getCount();
    System.arraycopy(zc.a((short)n), 0, this.b, j + 6, 2);
    j += 8;
    int[] arrayOfInt = { localPivotTable.e(), localPivotTable.f() };
    arrayOfInt[0] = (arrayOfInt[0] == 0 ? 1 : arrayOfInt[0]);
    arrayOfInt[1] = (arrayOfInt[1] == 0 ? 1 : arrayOfInt[1]);
    System.arraycopy(zc.a((short)arrayOfInt[0]), 0, this.b, j, 2);
    System.arraycopy(zc.a((short)arrayOfInt[1]), 0, this.b, j + 2, 2);
    j += 4;
    System.arraycopy(zc.a(this.a.i), 0, this.b, j, 2);
    j += 2;
    System.arraycopy(zc.a(this.a.j), 0, this.b, j, 2);
    j += 2;
    n = this.a.g.length();
    System.arraycopy(zc.a((short)n), 0, this.b, j, 2);
    j += 2;
    n = this.a.h.length();
    System.arraycopy(zc.a((short)n), 0, this.b, j, 2);
    j += 2;
    j += zct.b(this.b, j, this.a.g);
    j += zct.b(this.b, j, this.a.h);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */