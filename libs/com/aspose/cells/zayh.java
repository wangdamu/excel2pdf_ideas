package com.aspose.cells;

class zayh
{
  private WorksheetCollection a;
  private zbzx b;
  private zciv c;
  
  zayh(WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramWorksheetCollection;
    this.b = new zbzx(paramWorksheetCollection);
    this.c = new zciv(paramWorksheetCollection);
  }
  
  String a(Cell paramCell)
  {
    if (this.a.p().h()) {
      return this.c.a(paramCell);
    }
    return this.b.a(paramCell);
  }
  
  String a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return a(paramInt1, -1, paramArrayOfByte, paramInt2, paramInt3, paramBoolean);
  }
  
  String a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (this.a.p().h()) {
      return this.c.a(paramInt1, paramInt2, paramArrayOfByte, paramInt3, paramInt4, paramBoolean);
    }
    return this.b.a(paramInt1, paramInt2, paramArrayOfByte, paramInt3, paramInt4, paramBoolean);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */