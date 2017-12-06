package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zaaq
{
  static byte[] a(WorksheetCollection paramWorksheetCollection, Object paramObject)
  {
    if (paramWorksheetCollection.p().h()) {
      return zciz.a(paramObject);
    }
    return zcae.a(paramObject);
  }
  
  static Object a(WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramWorksheetCollection.p().h()) {
      return zciz.a(paramArrayOfByte, paramInt);
    }
    return zcae.a(paramArrayOfByte, paramInt);
  }
  
  static boolean a(WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    if (paramWorksheetCollection.p().h()) {
      return zciz.a(paramArrayOfByte, paramInt, paramBoolean);
    }
    return zcae.a(paramArrayOfByte, paramInt, paramBoolean);
  }
  
  static boolean b(WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt == -1) {
      if (paramWorksheetCollection.p().h()) {
        paramInt = 4;
      } else {
        paramInt = 2;
      }
    }
    return (paramArrayOfByte.length > paramInt + 4) && (paramArrayOfByte[paramInt] == 25) && (paramArrayOfByte[(paramInt + 1)] == 1);
  }
  
  private static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection, int paramInt3, int paramInt4)
  {
    zacc localzacc = paramWorksheetCollection.ai();
    localzacc.a(paramArrayOfByte, paramInt1, paramInt2);
    int i = 0;
    while (localzacc.h())
    {
      i = localzacc.e();
      if ((paramArrayOfByte[i] == 24) && (paramArrayOfByte[(i + 1)] == 25) && (zbvl.a(paramArrayOfByte, i, paramWorksheetCollection, paramInt3, paramInt4))) {
        return true;
      }
      localzacc.k();
    }
    return false;
  }
  
  static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (!a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheetCollection, paramInt3, paramInt4)) {
      return paramArrayOfByte;
    }
    int i = paramInt2 == -1 ? 1 : 0;
    boolean bool = paramWorksheetCollection.p().h();
    zcy localzcy = new zcy(paramArrayOfByte.length);
    zacc localzacc = paramWorksheetCollection.ai();
    localzacc.a(paramArrayOfByte, paramInt1, paramInt2);
    int[] arrayOfInt1 = 0;
    int n;
    int m;
    while (localzacc.h())
    {
      arrayOfInt1 = localzacc.e();
      int j = 0;
      if ((paramArrayOfByte[arrayOfInt1] == 24) && (paramArrayOfByte[(arrayOfInt1 + 1)] == 25) && (zbvl.a(paramArrayOfByte, arrayOfInt1, paramWorksheetCollection, paramInt3, paramInt4)))
      {
        arrayOfInt2 = zbvl.a(paramWorksheetCollection, paramArrayOfByte, arrayOfInt1, paramInt5, paramInt6, false);
        byte[] arrayOfByte2 = null;
        n = 3;
        if (paramWorksheetCollection.p().h())
        {
          arrayOfByte2 = new byte[15];
          zcjb.a(arrayOfByte2, n, arrayOfInt2[1], 0, true, false);
          zcjb.a(arrayOfByte2, n + 4, arrayOfInt2[3], 0, true, false);
          zcjb.c(arrayOfByte2, n + 8, arrayOfInt2[2], 0, true, false);
          zcjb.c(arrayOfByte2, n + 10, arrayOfInt2[4], 0, true, false);
        }
        else
        {
          arrayOfByte2 = new byte[11];
          System.arraycopy(zc.a(arrayOfInt2[1]), 0, arrayOfByte2, n, 2);
          System.arraycopy(zc.a(arrayOfInt2[3]), 0, arrayOfByte2, n + 2, 2);
          System.arraycopy(zc.a(arrayOfInt2[2]), 0, arrayOfByte2, n + 4, 2);
          System.arraycopy(zc.a(arrayOfInt2[4]), 0, arrayOfByte2, n + 6, 2);
        }
        switch (arrayOfInt2[5] & 0xC00)
        {
        case 0: 
          arrayOfByte2[0] = 59;
          break;
        case 1024: 
          arrayOfByte2[0] = 91;
          break;
        case 2048: 
          arrayOfByte2[0] = 123;
          break;
        default: 
          arrayOfByte2[0] = 59;
        }
        System.arraycopy(zc.a(arrayOfInt2[0]), 0, arrayOfByte2, 1, 2);
        localzcy.a(arrayOfByte2, 0, arrayOfByte2.length);
        j = 1;
      }
      int[] arrayOfInt2 = arrayOfInt1;
      localzacc.k();
      if (j == 0)
      {
        m = localzacc.e() - arrayOfInt2;
        localzcy.a(paramArrayOfByte, arrayOfInt2, m);
      }
    }
    if (i != 0)
    {
      byte[] arrayOfByte1 = null;
      int k = localzcy.b();
      int i1;
      if (bool)
      {
        m = 8;
        n = zc.a(paramArrayOfByte, localzacc.e());
        arrayOfByte1 = new byte[k + m + n];
        i1 = 0;
        System.arraycopy(zc.a(k), 0, arrayOfByte1, i1, 4);
        i1 += 4;
        System.arraycopy(localzcy.a, 0, arrayOfByte1, i1, k);
        i1 += k;
        System.arraycopy(paramArrayOfByte, localzacc.e(), arrayOfByte1, i1, n + 4);
      }
      else
      {
        m = 2;
        n = paramArrayOfByte.length - localzacc.e();
        arrayOfByte1 = new byte[k + m + n];
        i1 = 0;
        System.arraycopy(zc.a(k), 0, arrayOfByte1, i1, 2);
        i1 += 2;
        System.arraycopy(localzcy.a, 0, arrayOfByte1, i1, k);
        i1 += k;
        System.arraycopy(paramArrayOfByte, localzacc.e(), arrayOfByte1, i1, n);
      }
      return arrayOfByte1;
    }
    return localzcy.a();
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, int paramInt3, zbti paramzbti, boolean paramBoolean, Workbook paramWorkbook)
  {
    if (paramWorkbook.h()) {
      zciz.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheetCollection1, paramWorksheetCollection2, paramInt3, paramzbti, paramBoolean);
    } else {
      zcae.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheetCollection1, paramWorksheetCollection2, paramInt3, paramzbti, paramBoolean);
    }
  }
  
  static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    if (paramWorksheet.c().p().h()) {
      return zciz.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheet);
    }
    return zcae.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheet);
  }
  
  static void a(WorksheetCollection paramWorksheetCollection, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte, int paramInt7, int paramInt8)
  {
    if (paramWorksheetCollection.p().h()) {
      zciz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfByte, paramInt7, paramInt8);
    } else {
      zcae.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfByte, paramInt7, paramInt8);
    }
  }
  
  static void a(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    if (paramWorksheet.c().p().h()) {
      zciz.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfByte);
    } else {
      zcae.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfByte);
    }
  }
  
  static void a(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, byte[] paramArrayOfByte)
  {
    byte[][] arrayOfByte;
    if (paramWorksheet.c().p().h())
    {
      arrayOfByte = new byte[][] { paramArrayOfByte };
      zciz.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, arrayOfByte);
      paramArrayOfByte = arrayOfByte[0];
    }
    else
    {
      arrayOfByte = new byte[][] { paramArrayOfByte };
      zcae.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, arrayOfByte);
      paramArrayOfByte = arrayOfByte[0];
    }
  }
  
  static void b(Worksheet paramWorksheet, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    if (paramWorksheet.c().p().h()) {
      zciz.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfByte);
    } else {
      zcae.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfByte);
    }
  }
  
  static boolean a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Cells paramCells, boolean paramBoolean, HashMap paramHashMap)
  {
    if (paramCells.p().p().h()) {
      return zciz.a(paramInt1, paramInt2, paramArrayOfByte, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramCells, paramBoolean, paramHashMap);
    }
    return zcae.a(paramInt1, paramInt2, paramArrayOfByte, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramCells, paramBoolean, paramHashMap);
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection)
  {
    if (paramWorksheetCollection.p().h()) {
      return zciz.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheetCollection);
    }
    return zcae.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheetCollection);
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    if (paramWorksheetCollection.p().h()) {
      return zciz.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheetCollection, paramHashMap1, paramHashMap2);
    }
    return zcae.a(paramArrayOfByte, paramInt1, paramInt2, paramWorksheetCollection, paramHashMap1, paramHashMap2);
  }
  
  static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, WorksheetCollection paramWorksheetCollection)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(paramInt3), Boolean.valueOf(false));
    a(paramArrayOfByte, paramInt1, paramInt2, localHashMap, paramWorksheetCollection);
    return ((Boolean)localHashMap.get(Integer.valueOf(paramInt3))).booleanValue();
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    if (paramWorksheetCollection.p().h()) {
      zciz.a(paramArrayOfByte, paramInt1, paramInt2, paramHashMap, paramWorksheetCollection);
    } else {
      zcae.a(paramArrayOfByte, paramInt1, paramInt2, paramHashMap, paramWorksheetCollection);
    }
  }
  
  static void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    if (paramWorksheetCollection.p().h()) {
      zciz.b(paramArrayOfByte, paramInt1, paramInt2, paramHashMap, paramWorksheetCollection);
    } else {
      zcae.b(paramArrayOfByte, paramInt1, paramInt2, paramHashMap, paramWorksheetCollection);
    }
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, WorksheetCollection paramWorksheetCollection)
  {
    if (paramWorksheetCollection.p().h()) {
      zciz.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      zcae.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    switch (paramInt2)
    {
    case 4: 
      b(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt3, paramInt4);
      break;
    case 1: 
      c(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt3, paramInt4);
      break;
    case 3: 
      a(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
      break;
    case 0: 
      a(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt3, paramInt4);
      break;
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramWorksheet.c().p().h()) {
      zciz.a(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3);
    } else {
      zcae.a(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3);
    }
  }
  
  static void b(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramWorksheet.c().p().h()) {
      zciz.b(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3);
    } else {
      zcae.b(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3);
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    if (paramWorksheet.c().p().h()) {
      zciz.a(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
    } else {
      zcae.a(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
    }
  }
  
  static void c(CellArea paramCellArea, int paramInt1, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramWorksheet.c().p().h()) {
      zciz.c(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3);
    } else {
      zcae.c(paramCellArea, paramInt1, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt2, paramInt3);
    }
  }
  
  static void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt3, int paramInt4)
  {
    if (paramWorksheet.c().p().h()) {
      zciz.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt3, paramInt4);
    } else {
      zcae.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, paramArrayOfByte, paramInt3, paramInt4);
    }
  }
  
  static boolean a(WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramWorksheetCollection.p().h()) {
      return zciz.b(paramArrayOfByte, paramInt1, paramInt2);
    }
    return zcae.b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  static byte[] a(Worksheet paramWorksheet, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, int paramInt3, boolean paramBoolean3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    if (paramWorksheet.c().p().h()) {
      return zciz.a(paramWorksheet, paramBoolean1, paramInt1, paramInt2, paramBoolean2, paramInt3, paramBoolean3, paramInt4, paramInt5, paramInt6, paramArrayOfByte);
    }
    return zcae.a(paramWorksheet, paramBoolean1, paramInt1, paramInt2, paramBoolean2, paramInt3, paramBoolean3, paramInt4, paramInt5, paramInt6, paramArrayOfByte);
  }
  
  static boolean a(byte paramByte)
  {
    return (paramByte & 0xFF & 0x80) != 0;
  }
  
  static boolean b(byte paramByte)
  {
    return (paramByte & 0xFF & 0x40) != 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */