package com.aspose.cells;

class zacb
{
  CellArea a;
  int b;
  int c;
  int d;
  int e;
  private byte f;
  
  void a(zacb paramzacb, int paramInt1, int paramInt2)
  {
    this.a = new CellArea();
    this.a.StartRow = paramInt1;
    this.a.EndRow = (paramInt1 + paramzacb.a.EndRow - paramzacb.a.StartRow);
    this.a.StartColumn = paramInt2;
    this.a.EndColumn = (paramInt2 + paramzacb.a.EndColumn - paramzacb.a.StartColumn);
    this.b = paramzacb.b;
    this.d = paramzacb.d;
    this.c = paramzacb.c;
    this.e = paramzacb.e;
    this.f = paramzacb.f;
  }
  
  byte a()
  {
    return this.f;
  }
  
  void a(byte paramByte)
  {
    this.f = paramByte;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f | 0x1));
    } else {
      this.f = ((byte)(this.f & 0xFE));
    }
  }
  
  boolean b()
  {
    return (this.f & 0xFF & 0x10) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f | 0x10));
    } else {
      this.f = ((byte)(this.f & 0xEF));
    }
  }
  
  boolean c()
  {
    return (this.f & 0xFF & 0x20) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f | 0x20));
    } else {
      this.f = ((byte)(this.f & 0xDF));
    }
  }
  
  boolean d()
  {
    return (this.f & 0xFF & 0x8) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f | 0x8));
    } else {
      this.f = ((byte)(this.f & 0xF7));
    }
  }
  
  boolean e()
  {
    return (d()) || ((this.f & 0xFF & 0x4) != 0);
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f | 0x4));
    } else {
      this.f = ((byte)(this.f & 0xFB));
    }
  }
  
  boolean f()
  {
    return (d()) || ((this.f & 0xFF & 0x4) == 0);
  }
  
  String g()
  {
    if (e())
    {
      if ((this.b == 65535) || (this.c == 65535)) {
        return "#REF!";
      }
      return CellsHelper.cellIndexToName(this.b, this.c);
    }
    return null;
  }
  
  void a(String paramString)
  {
    int[] arrayOfInt = CellsHelper.cellNameToIndex(paramString);
    this.b = arrayOfInt[0];
    this.c = arrayOfInt[1];
  }
  
  String h()
  {
    if (f())
    {
      if ((this.e == 65535) || (this.d == 65535)) {
        return "#REF!";
      }
      return CellsHelper.cellIndexToName(this.d, this.e);
    }
    return null;
  }
  
  void b(String paramString)
  {
    int[] arrayOfInt = CellsHelper.cellNameToIndex(paramString);
    this.d = arrayOfInt[0];
    this.e = arrayOfInt[1];
  }
  
  void a(zaai paramzaai, int paramInt1, CellArea paramCellArea, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    switch (paramInt1)
    {
    case 0: 
      if (e())
      {
        if ((this.b >= paramCellArea.StartRow) && (this.c >= paramCellArea.StartColumn) && (this.c <= paramCellArea.EndColumn)) {
          this.b += paramInt2;
        }
      }
      else if ((f()) && (this.d >= paramCellArea.StartRow) && (this.e >= paramCellArea.StartColumn) && (this.e <= paramCellArea.EndColumn)) {
        this.d += paramInt2;
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */