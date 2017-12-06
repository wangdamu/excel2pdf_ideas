package com.aspose.cells;

import com.aspose.cells.b.a.za;

class zaad
{
  private WorksheetCollection b;
  zacg a;
  private zabv c;
  private zbzz d;
  private zcix e;
  
  zacg a()
  {
    return this.a;
  }
  
  zaad(WorksheetCollection paramWorksheetCollection)
  {
    this.b = paramWorksheetCollection;
    this.c = new zabv(this.b);
    this.a = new zacg(this.b);
    this.d = new zbzz(this.b);
    this.e = new zcix(this.b);
  }
  
  byte[] a(String paramString, String[] paramArrayOfString, Cell paramCell)
  {
    if (paramString.charAt(0) != '=') {
      throw new CellsException(5, "Invalid function format.");
    }
    zacf localzacf = a(paramString);
    if (localzacf.g() != 3) {
      throw new CellsException(5, "Invalid function format.");
    }
    localzacf.a(4);
    paramArrayOfString[0] = localzacf.a();
    byte[] arrayOfByte1 = this.a.a(localzacf, this.b, paramCell.d.g().getIndex(), 0, 0, 0, 64, 0, false);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 7];
    arrayOfByte2[0] = 57;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 7, arrayOfByte1.length);
    return arrayOfByte2;
  }
  
  boolean b()
  {
    return this.a.a();
  }
  
  byte[] a(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    try
    {
      zacf localzacf = a(paramString);
      return this.a.a(localzacf, this.b, paramInt1, paramInt2, paramInt3, zacg.a(paramBoolean1, paramBoolean3, false), paramInt5, paramInt4, paramBoolean2);
    }
    catch (Exception localException)
    {
      throw new CellsException(5, localException.getMessage() + "\"" + paramString + "\".");
    }
  }
  
  byte[] a(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
  {
    try
    {
      zacf localzacf = a(paramString);
      return this.a.a(localzacf, this.b, paramInt1, paramInt2, paramInt3, paramInt6, paramInt5, paramInt4, paramBoolean);
    }
    catch (Exception localException)
    {
      throw new CellsException(5, localException.getMessage() + "\"" + paramString + "\".");
    }
  }
  
  byte[] a(Cell paramCell, String paramString, byte paramByte)
  {
    int i = 1;
    if (paramString.charAt(0) != '=') {
      i = 0;
    }
    try
    {
      zacf localzacf = this.c.a(paramString, i);
      byte[] arrayOfByte = this.a.b(localzacf, this.b, paramCell.d.g().getIndex(), paramCell.getRow(), paramCell.getColumn(), paramByte & 0xFF, 64, 0, true);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      throw new CellsException(5, "Error in Cell: " + paramCell.getName() + "-" + localException.getMessage() + "\"" + paramString + "\".");
    }
  }
  
  void a(Cell paramCell, String paramString, byte paramByte, boolean paramBoolean)
  {
    int i = 1;
    if (paramString.charAt(0) != '=') {
      i = 0;
    }
    try
    {
      zacf localzacf = this.c.a(paramString, i);
      byte[] arrayOfByte = this.a.a(localzacf, this.b, paramCell.d.g().getIndex(), paramCell.getRow(), paramCell.getColumn(), paramByte & 0xFF, 64, 0, true);
      zaai localzaai = new zaai(paramCell.getRow(), paramCell.getColumn());
      localzaai.b = arrayOfByte;
      paramCell.a(localzaai);
    }
    catch (Exception localException)
    {
      throw new CellsException(5, "Error in Cell: " + paramCell.getName() + "-" + localException.getMessage() + "\"" + paramString + "\".");
    }
  }
  
  byte[] a(int paramInt1, int paramInt2, int paramInt3, String paramString, byte paramByte)
  {
    if (paramString.charAt(0) != '=') {
      throw new CellsException(5, "Invalid formula:\"" + paramString + "\".");
    }
    try
    {
      zacf localzacf = a(paramString);
      return this.a.a(localzacf, this.b, paramInt1, paramInt2, paramInt3, paramByte & 0xFF, 64, 0, true);
    }
    catch (Exception localException)
    {
      throw new CellsException(5, "Error in Cell: " + CellsHelper.cellIndexToName(paramInt2, paramInt3) + "-" + localException.getMessage() + "\"" + paramString + "\".");
    }
  }
  
  void a(Cell paramCell, String paramString, int paramInt1, int paramInt2)
  {
    if (paramString.charAt(0) != '=') {
      throw new CellsException(5, "Invalid formula:\"" + paramString + "\".");
    }
    zacf localzacf = a(paramString);
    byte[] arrayOfByte = this.a.a(localzacf, this.b, paramCell.d.g().getIndex(), paramCell.getRow(), paramCell.getColumn(), 0, 64, 1, true);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramCell.getRow();
    localCellArea.StartColumn = paramCell.getColumn();
    localCellArea.EndRow = (paramCell.getRow() + paramInt1 - 1);
    localCellArea.EndColumn = (paramCell.getColumn() + paramInt2 - 1);
    zbf localzbf = new zbf(localCellArea, true, arrayOfByte);
    arrayOfByte = this.a.a((byte)1, paramCell.getRow(), paramCell.getColumn());
    zaaj localzaaj = new zaaj(paramCell.getRow(), paramCell.getColumn(), localzbf);
    localzaaj.b = arrayOfByte;
    paramCell.a(localzaaj);
  }
  
  zacf a(String paramString)
  {
    int i = 1;
    if (paramString.charAt(0) != '=') {
      i = 0;
    }
    return this.c.a(paramString, i);
  }
  
  void b(Cell paramCell, String paramString, int paramInt1, int paramInt2)
  {
    if (paramString.charAt(0) != '=') {
      throw new CellsException(5, "Invalid formula:\"" + paramString + "\".");
    }
    try
    {
      zacf localzacf = a(paramString);
      byte[] arrayOfByte = this.a.a(localzacf, this.b, paramCell.d.g().getIndex(), paramCell.getRow(), paramCell.getColumn(), 1, 64, 0, true);
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = paramCell.getRow();
      localCellArea.StartColumn = paramCell.getColumn();
      localCellArea.EndRow = (paramCell.getRow() + paramInt1 - 1);
      localCellArea.EndColumn = (paramCell.getColumn() + paramInt2 - 1);
      zbf localzbf = new zbf(localCellArea, false, arrayOfByte);
      arrayOfByte = this.a.a((byte)1, paramCell.getRow(), paramCell.getColumn());
      zaaj localzaaj = new zaaj(paramCell.getRow(), paramCell.getColumn(), localzbf);
      localzaaj.b = arrayOfByte;
      paramCell.a(localzaaj);
    }
    catch (Exception localException)
    {
      throw new CellsException(5, "Error in Cell: " + paramCell.j() + "-" + localException.getMessage() + "\"" + paramString + "\".");
    }
  }
  
  boolean a(byte paramByte, byte[] paramArrayOfByte)
  {
    if (this.b.p().h())
    {
      int i = com.aspose.cells.b.a.zc.a(paramArrayOfByte, 0);
      return (i == 7) && (paramArrayOfByte[4] == paramByte);
    }
    return (paramArrayOfByte[0] == 5) && (paramArrayOfByte[2] == paramByte);
  }
  
  void a(byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (this.b.p().h())
    {
      paramArrayOfInt1[0] = com.aspose.cells.b.a.zc.a(paramArrayOfByte, 5);
      paramArrayOfInt2[0] = zcjb.a(paramArrayOfByte, 9);
    }
    else
    {
      paramArrayOfInt1[0] = (com.aspose.cells.b.a.zc.e(paramArrayOfByte, 3) & 0xFFFF);
      paramArrayOfInt2[0] = (paramArrayOfByte[5] & 0xFF);
    }
  }
  
  static void a(Object paramObject, Cell paramCell)
  {
    CellArea localCellArea = paramCell.F().a();
    Cells localCells = paramCell.d;
    Cell localCell = null;
    int i;
    if (paramObject == null)
    {
      if ((localCellArea.StartRow == localCellArea.EndRow) && (localCellArea.StartColumn == localCellArea.EndColumn))
      {
        localCell = localCells.a(localCellArea.StartRow, localCellArea.StartColumn, false);
        localCell.a(znq.g, (byte)2);
        return;
      }
      for (i = localCellArea.StartRow; i <= localCellArea.EndRow; i++) {
        for (j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
        {
          localCell = localCells.a(i, j, false);
          localCell.a(zuf.c, (byte)2);
        }
      }
      return;
    }
    if (!com.aspose.cells.a.c.zc.a(paramObject))
    {
      for (i = localCellArea.StartRow; i <= localCellArea.EndRow; i++) {
        for (j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
        {
          localCell = localCells.a(i, j, false);
          localCell.a(paramObject, (byte)2);
        }
      }
      return;
    }
    Object[] arrayOfObject1 = (Object[])paramObject;
    int k;
    for (int j = 0; (j < arrayOfObject1.length) && (localCellArea.StartRow + j <= localCellArea.EndRow); j++)
    {
      k = localCellArea.StartRow + j;
      Object localObject1 = za.a(arrayOfObject1, j);
      if (localObject1 == null)
      {
        for (int m = localCellArea.StartColumn; m <= localCellArea.EndColumn; m++)
        {
          localCell = localCells.a(k, m, false);
          localCell.a(zuf.c, (byte)2);
        }
      }
      else if (com.aspose.cells.a.c.zc.a(localObject1))
      {
        Object[] arrayOfObject2 = (Object[])localObject1;
        for (int n = 0; (n < arrayOfObject2.length) && (localCellArea.StartColumn + n <= localCellArea.EndColumn); n++)
        {
          localCell = localCells.a(k, localCellArea.StartColumn + n, false);
          Object localObject2 = za.a(arrayOfObject2, n);
          localCell.a(localObject2, (byte)2);
        }
        if (localCellArea.EndColumn - localCellArea.StartColumn + 1 > arrayOfObject2.length) {
          for (n = localCellArea.StartColumn + arrayOfObject2.length; n <= localCellArea.EndColumn; n++)
          {
            localCell = localCells.a(k, n, false);
            localCell.a(zuf.c, (byte)2);
          }
        }
      }
    }
    if (arrayOfObject1.length < localCellArea.EndRow - localCellArea.StartRow + 1) {
      for (j = localCellArea.StartRow + arrayOfObject1.length; j <= localCellArea.EndRow; j++) {
        for (k = localCellArea.StartColumn; k <= localCellArea.EndColumn; k++)
        {
          localCell = localCells.a(j, k, false);
          localCell.a(zuf.c, (byte)2);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */