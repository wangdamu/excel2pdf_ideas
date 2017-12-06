package com.aspose.cells;

import com.aspose.cells.b.a.zg;

class zaaf
{
  private zbzy a;
  private zciw b;
  private Workbook c;
  
  void a()
  {
    this.c = null;
    if (this.a != null) {
      this.a.a();
    }
    if (this.b != null) {
      this.b.a();
    }
    this.a = null;
    this.b = null;
    zg.a(this);
  }
  
  int b()
  {
    if (this.c.h()) {
      return this.b.a;
    }
    return this.a.a;
  }
  
  void a(int paramInt)
  {
    if (this.a != null) {
      this.a.a = paramInt;
    }
    if (this.b != null) {
      this.b.a = paramInt;
    }
  }
  
  void c()
  {
    if (this.c.h()) {
      this.b.b();
    } else {
      this.a.b();
    }
  }
  
  void d()
  {
    if (this.c.h()) {
      this.b.c();
    } else {
      this.a.c();
    }
  }
  
  zaaf(WorksheetCollection paramWorksheetCollection)
  {
    this.c = paramWorksheetCollection.p();
    this.a = new zbzy(paramWorksheetCollection);
    this.b = new zciw(paramWorksheetCollection);
  }
  
  String a(Cell paramCell)
  {
    if (this.c.h()) {
      return this.b.a(paramCell);
    }
    return this.a.a(paramCell);
  }
  
  String a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return a(paramInt1, -1, paramArrayOfByte, paramInt2, paramInt3, paramBoolean, false);
  }
  
  String a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.c.h()) {
      return this.b.a(paramInt1, paramInt2, paramArrayOfByte, paramInt3, paramInt4, paramBoolean1, paramBoolean2);
    }
    return this.a.a(paramInt1, paramInt2, paramArrayOfByte, paramInt3, paramInt4, paramBoolean1, paramBoolean2);
  }
  
  String a(zwh paramzwh)
  {
    if (this.c.h())
    {
      localzciy = new zciy();
      return localzciy.a(paramzwh, false);
    }
    zciy localzciy = new zciy();
    return localzciy.a(paramzwh, true);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */