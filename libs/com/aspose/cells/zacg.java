package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zacg
{
  private Workbook a;
  private zcak b;
  private zcjf c;
  
  zacg(WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramWorksheetCollection.p();
    this.b = new zcak(paramWorksheetCollection);
    this.c = new zcjf(paramWorksheetCollection);
  }
  
  boolean a()
  {
    if (this.a.h()) {
      return this.c.f();
    }
    return this.b.f();
  }
  
  static int a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 0;
    if (paramBoolean1) {
      i |= 0x1;
    }
    if (paramBoolean2) {
      i |= 0x2;
    }
    if (paramBoolean3) {
      i |= 0x4;
    }
    return i;
  }
  
  byte[] a(zacf paramzacf, WorksheetCollection paramWorksheetCollection, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    if (this.a.h())
    {
      localObject = this.c;
      ((zcjf)localObject).a(paramInt1, paramInt2, paramInt3, paramInt4);
      return ((zcjf)localObject).a(paramzacf, paramInt5, paramInt6, paramBoolean);
    }
    Object localObject = this.b;
    ((zcak)localObject).a(paramInt1, paramInt2, paramInt3, paramInt4);
    return ((zcak)localObject).a(paramzacf, paramInt5, paramInt6, paramBoolean);
  }
  
  byte[] b(zacf paramzacf, WorksheetCollection paramWorksheetCollection, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    zcak localzcak = this.b;
    localzcak.a(paramInt1, paramInt2, paramInt3, paramInt4);
    return localzcak.a(paramzacf, paramInt5, paramInt6, paramBoolean);
  }
  
  byte[] a(byte paramByte, int paramInt1, int paramInt2)
  {
    if (this.a.h())
    {
      arrayOfByte = new byte[15];
      arrayOfByte[0] = 7;
      arrayOfByte[4] = paramByte;
      System.arraycopy(zc.a(paramInt1), 0, arrayOfByte, 5, 4);
      System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, 9, 2);
      return arrayOfByte;
    }
    byte[] arrayOfByte = new byte[7];
    arrayOfByte[0] = 5;
    arrayOfByte[2] = paramByte;
    System.arraycopy(zc.a(paramInt1), 0, arrayOfByte, 3, 2);
    arrayOfByte[5] = ((byte)paramInt2);
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */