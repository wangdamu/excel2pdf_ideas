package com.aspose.cells;

class zbf
{
  private CellArea a;
  private byte[] b;
  private byte c;
  
  zbf(CellArea paramCellArea, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    this.a = paramCellArea;
    a(paramBoolean);
    this.b = paramArrayOfByte;
  }
  
  zbf() {}
  
  void a(zbf paramzbf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CopyOptions paramCopyOptions)
  {
    this.c = paramzbf.c;
    this.b = zaam.a(paramzbf.b, -1, paramzbf.a.StartRow, paramzbf.a.StartColumn, paramCopyOptions);
    this.a = new CellArea();
    this.a.StartRow = (paramInt3 + paramzbf.a.StartRow - paramInt1);
    this.a.StartColumn = (paramInt4 + paramzbf.a.StartColumn - paramInt2);
    this.a.EndRow = (this.a.StartRow + paramzbf.a.EndRow - paramzbf.a.StartRow);
    this.a.EndColumn = (this.a.StartColumn + paramzbf.a.EndColumn - paramzbf.a.StartColumn);
  }
  
  CellArea a()
  {
    return this.a;
  }
  
  void a(CellArea paramCellArea)
  {
    this.a = paramCellArea;
  }
  
  boolean b()
  {
    return (this.c & 0xFF & 0x10) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c = ((byte)(this.c | 0x10));
    } else {
      this.c = ((byte)(this.c & 0xFE));
    }
  }
  
  byte[] c()
  {
    return this.b;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  void a(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 == 0) {
      return;
    }
    int i = 0;
    if (paramBoolean)
    {
      boolean[] arrayOfBoolean = { i };
      this.a = zban.a(this.a, paramInt4, paramInt3, arrayOfBoolean);
      i = arrayOfBoolean[0];
    }
    zaaq.a(paramWorksheet, paramBoolean, paramInt4, paramInt3, paramInt1, paramInt2, -1, this.b.length - 1, this.b);
  }
  
  void a(Worksheet paramWorksheet, boolean paramBoolean, CellArea paramCellArea, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (paramBoolean) {
      switch (paramInt2)
      {
      case 0: 
        if (paramCellArea.StartRow <= a().StartRow)
        {
          if ((paramCellArea.StartColumn <= this.a.StartColumn) && (paramCellArea.EndColumn >= this.a.EndColumn))
          {
            this.a.StartRow += paramInt1;
            this.a.EndRow += paramInt1;
          }
        }
        else {
          if (paramCellArea.StartRow < a().EndRow) {
            break;
          }
        }
        break;
      }
    }
    zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, this.b, -1, -1, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  void b(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 == 0) {
      return;
    }
    int i = 0;
    if (paramBoolean)
    {
      boolean[] arrayOfBoolean = { i };
      this.a = zban.b(this.a, paramInt4, paramInt3, arrayOfBoolean);
      i = arrayOfBoolean[0];
    }
    zaaq.b(paramWorksheet, paramBoolean, paramInt4, paramInt3, paramInt1, paramInt2, -1, this.b.length - 1, this.b);
  }
  
  void a(Worksheet paramWorksheet, boolean paramBoolean, CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    this.a.StartRow = paramInt1;
    this.a.StartColumn = paramInt2;
    this.a.EndRow = (paramInt1 + paramCellArea.EndRow - paramCellArea.StartRow);
    this.a.EndColumn = (paramInt2 + paramCellArea.EndColumn - paramCellArea.StartColumn);
    zaaq.a(paramWorksheet.c(), paramInt1, paramInt1 - paramCellArea.StartRow, paramCellArea.StartRow, paramInt2, paramInt2 - paramCellArea.StartColumn, paramCellArea.StartColumn, this.b, -1, -1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */