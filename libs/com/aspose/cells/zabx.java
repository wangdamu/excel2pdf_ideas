package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zabx
{
  static zaca a(int paramInt1, Object paramObject, WorksheetCollection paramWorksheetCollection, int paramInt2, int paramInt3, int paramInt4)
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    int i = 0;
    if ((paramInt2 > 0) && (paramInt2 < paramWorksheetCollection.getCount())) {
      i = paramInt2;
    }
    zaca localzaca = new zaca(paramWorksheetCollection.get(i), 3, localCalculationOptions);
    localzaca.a(paramInt1, paramObject);
    localzaca.d = paramInt3;
    localzaca.e = ((short)paramInt4);
    return localzaca;
  }
  
  static zbap[] a(int paramInt1, Object paramObject, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5, WorksheetCollection paramWorksheetCollection, int paramInt6)
  {
    zaca localzaca = a(paramInt1, paramObject, paramWorksheetCollection, paramInt6, paramInt4, paramInt5);
    zaie localzaie = null;
    try
    {
      zaag localzaag = new zaag(localzaca, paramArrayOfByte, paramInt2, paramInt3);
      localzaie = localzaag.a();
    }
    catch (Exception localException)
    {
      return null;
    }
    localzaie = zabt.b(localzaie, localzaca);
    localzaca.c();
    localzaca = null;
    if (localzaie.b() == 9) {
      return new zbap[] { ((zabo)localzaie).o() };
    }
    if (localzaie.b() == 5)
    {
      zabh localzabh = (zabh)localzaie;
      if (localzabh.a() == 16)
      {
        zaie[] arrayOfzaie = zabt.a((zabk)localzabh);
        ArrayList localArrayList = new ArrayList(arrayOfzaie.length);
        for (int i = 0; i < arrayOfzaie.length; i++) {
          if (arrayOfzaie[i].b() == 9) {
            zf.a(localArrayList, ((zabo)arrayOfzaie[i]).o());
          }
        }
        if (localArrayList.size() > 0)
        {
          zbap[] arrayOfzbap = new zbap[localArrayList.size()];
          for (int j = 0; j < arrayOfzbap.length; j++) {
            arrayOfzbap[j] = ((zbap)localArrayList.get(j));
          }
          return arrayOfzbap;
        }
      }
    }
    return null;
  }
  
  static Range b(int paramInt1, Object paramObject, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5, WorksheetCollection paramWorksheetCollection, int paramInt6)
  {
    zbap[] arrayOfzbap = a(paramInt1, paramObject, paramBoolean, paramArrayOfByte, paramInt2, paramInt3, paramInt4, paramInt5, paramWorksheetCollection, paramInt6);
    if (arrayOfzbap == null) {
      return null;
    }
    return a(paramWorksheetCollection, arrayOfzbap[0], paramInt6);
  }
  
  static Range[] c(int paramInt1, Object paramObject, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5, WorksheetCollection paramWorksheetCollection, int paramInt6)
  {
    zbap[] arrayOfzbap = a(paramInt1, paramObject, paramBoolean, paramArrayOfByte, paramInt2, paramInt3, paramInt4, paramInt5, paramWorksheetCollection, paramInt6);
    if ((arrayOfzbap == null) || (arrayOfzbap.length == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(arrayOfzbap.length);
    for (int i = 0; i < arrayOfzbap.length; i++)
    {
      Range localRange = a(paramWorksheetCollection, arrayOfzbap[i], paramInt6);
      if (localRange != null) {
        localArrayList.add(localRange);
      }
    }
    if (localArrayList.size() > 0)
    {
      Range[] arrayOfRange = new Range[localArrayList.size()];
      for (int j = 0; j < arrayOfRange.length; j++) {
        arrayOfRange[j] = ((Range)localArrayList.get(j));
      }
      return arrayOfRange;
    }
    return null;
  }
  
  static Range a(WorksheetCollection paramWorksheetCollection, zbap paramzbap, int paramInt)
  {
    if (paramzbap.a() != null)
    {
      if ((paramzbap.a().a & 0xFFFF) != paramWorksheetCollection.v()) {
        return null;
      }
      paramInt = paramzbap.a().b & 0xFFFF;
      if (paramInt != (paramzbap.a().c & 0xFFFF)) {
        return null;
      }
    }
    if ((paramInt < 0) || (paramInt >= paramWorksheetCollection.getCount())) {
      return null;
    }
    Cells localCells = paramWorksheetCollection.get(paramInt).getCells();
    return localCells.createRange(paramzbap.b(), paramzbap.d(), paramzbap.q(), paramzbap.p());
  }
  
  static Object a(Worksheet paramWorksheet, int paramInt1, Object paramObject, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.m = false;
    localCalculationOptions.b = true;
    zaca localzaca = new zaca(paramWorksheet, 3, localCalculationOptions);
    localzaca.d = paramInt4;
    localzaca.e = ((short)paramInt5);
    localzaca.a(paramInt1, paramObject);
    zaag localzaag = new zaag(localzaca, paramArrayOfByte, paramInt2, paramInt3);
    zaie localzaie = localzaag.a();
    localzaie = zabt.c(localzaie, localzaca);
    Object localObject = null;
    if (localzaie.b() == 9)
    {
      zbap localzbap = ((zabo)localzaie).o();
      if ((paramBoolean) && (localzbap != null)) {
        localObject = localzbap.b(localzaca);
      } else {
        localObject = localzbap;
      }
    }
    localzaca.c();
    return localObject;
  }
  
  static byte[] a(WorksheetCollection paramWorksheetCollection, int paramInt, CellArea paramCellArea)
  {
    if (paramWorksheetCollection.p().h()) {
      return zcjc.a(paramWorksheetCollection, paramInt, paramCellArea);
    }
    return zcag.a(paramWorksheetCollection, paramInt, paramCellArea);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */