package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbev
{
  private byte a;
  private int b;
  private short c;
  private short d;
  private ArrayList e;
  
  zbev(int paramInt)
  {
    this.a = ((byte)paramInt);
    this.e = new ArrayList();
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.e.clear();
    }
    zf.a(this.e, CellArea.createCellArea(paramInt1, paramInt2, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1));
    if (paramBoolean)
    {
      this.b = paramInt1;
      this.c = ((short)paramInt2);
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = ((short)paramInt2);
    this.d = -1;
    for (int i = 0; i < this.e.size(); i++)
    {
      CellArea localCellArea2 = (CellArea)this.e.get(i);
      if ((paramInt1 >= localCellArea2.StartRow) && (paramInt1 <= localCellArea2.EndRow) && (paramInt2 >= localCellArea2.StartColumn) && (paramInt2 <= localCellArea2.EndColumn))
      {
        this.d = ((short)i);
        break;
      }
    }
    if (this.d == -1)
    {
      CellArea localCellArea1 = new CellArea();
      localCellArea1.StartRow = paramInt1;
      localCellArea1.EndRow = paramInt1;
      localCellArea1.StartColumn = paramInt2;
      localCellArea1.EndColumn = paramInt2;
      this.d = ((short)this.e.size());
      zf.a(this.e, localCellArea1);
    }
  }
  
  byte a()
  {
    return this.a;
  }
  
  void a(byte paramByte)
  {
    this.a = paramByte;
  }
  
  public ArrayList b()
  {
    return this.e;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.e = paramArrayList;
  }
  
  int c()
  {
    return this.b;
  }
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  int d()
  {
    return this.c;
  }
  
  void b(int paramInt)
  {
    this.c = ((short)paramInt);
  }
  
  int e()
  {
    return this.d;
  }
  
  void c(int paramInt)
  {
    this.d = ((short)paramInt);
  }
  
  void a(zbev paramzbev)
  {
    this.c = paramzbev.c;
    this.d = paramzbev.d;
    this.b = paramzbev.b;
    this.a = paramzbev.a;
    this.e = new ArrayList();
    for (int i = 0; i < paramzbev.e.size(); i++) {
      zf.a(this.e, (CellArea)paramzbev.e.get(i));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */