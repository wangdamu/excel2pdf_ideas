package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.HashMap;

class zcgj
{
  static void a(WorksheetCollection paramWorksheetCollection, HashMap paramHashMap, FontSettingCollection paramFontSettingCollection, byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    int i = (paramArrayOfByte[paramInt] & 0xFF & 0x1) != 0 ? 1 : 0;
    int j = (paramArrayOfByte[paramInt] & 0xFF & 0x2) != 0 ? 1 : 0;
    paramInt++;
    int[] arrayOfInt = { paramInt };
    paramFontSettingCollection.c = a(paramArrayOfByte, arrayOfInt);
    paramInt = arrayOfInt[0];
    if (i != 0)
    {
      int k = zc.a(paramArrayOfByte, paramInt);
      paramInt += 4;
      int m = 0;
      int n = 0;
      int i1 = 0;
      int i2 = paramInt;
      for (int i3 = 0; i3 < k; i3++)
      {
        i1 = zc.e(paramArrayOfByte, i2) & 0xFFFF;
        if (i2 + 4 != paramArrayOfByte.length) {
          n = zc.e(paramArrayOfByte, i2 + 4) & 0xFFFF;
        } else {
          n = paramFontSettingCollection.getText().length();
        }
        FontSetting localFontSetting = paramFontSettingCollection.b(i1, n - i1);
        m = zc.e(paramArrayOfByte, i2 + 2) & 0xFFFF;
        if (m < paramHashMap.size())
        {
          m = ((Integer)paramHashMap.get(Integer.valueOf(m))).intValue();
          localFontSetting.getFont().a(paramWorksheetCollection.i(m), null);
        }
        i2 += 4;
      }
    }
  }
  
  static CellArea a(byte[] paramArrayOfByte, int paramInt)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = zc.a(paramArrayOfByte, paramInt);
    localCellArea.EndRow = zc.a(paramArrayOfByte, paramInt + 4);
    localCellArea.StartColumn = zc.a(paramArrayOfByte, paramInt + 8);
    localCellArea.EndColumn = zc.a(paramArrayOfByte, paramInt + 12);
    return localCellArea;
  }
  
  static ArrayList b(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    int j = zc.a(paramArrayOfByte, i);
    ArrayList localArrayList = new ArrayList();
    i += 4;
    for (int k = 0; (k < j) && (i < paramArrayOfByte.length); k++)
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = zc.a(paramArrayOfByte, i);
      localCellArea.EndRow = zc.a(paramArrayOfByte, i + 4);
      localCellArea.StartColumn = zc.a(paramArrayOfByte, i + 8);
      localCellArea.EndColumn = zc.a(paramArrayOfByte, i + 12);
      zf.a(localArrayList, localCellArea);
      i += 16;
    }
    return localArrayList;
  }
  
  static void a(ArrayList paramArrayList, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      System.arraycopy(zc.a(-1), 0, paramArrayOfByte, i, 4);
      return;
    }
    System.arraycopy(zc.a(paramArrayList.size()), 0, paramArrayOfByte, i, 4);
    i += 4;
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      CellArea localCellArea = (CellArea)paramArrayList.get(j);
      System.arraycopy(zc.a(localCellArea.StartRow), 0, paramArrayOfByte, i, 4);
      System.arraycopy(zc.a(localCellArea.EndRow), 0, paramArrayOfByte, i + 4, 4);
      System.arraycopy(zc.a(localCellArea.StartColumn), 0, paramArrayOfByte, i + 8, 4);
      System.arraycopy(zc.a(localCellArea.EndColumn), 0, paramArrayOfByte, i + 12, 4);
      i += 16;
    }
  }
  
  static void a(CellArea paramCellArea, byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, paramArrayOfByte, paramInt, 4);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, paramArrayOfByte, paramInt + 4, 4);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, paramArrayOfByte, paramInt + 8, 4);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, paramArrayOfByte, paramInt + 12, 4);
  }
  
  static String a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
    throws Exception
  {
    if (paramArrayOfInt[0] >= paramArrayOfByte.length) {
      return null;
    }
    int i = zc.a(paramArrayOfByte, paramArrayOfInt[0]);
    paramArrayOfInt[0] += 4;
    if (i < 0) {
      return null;
    }
    if (i == 0) {
      return "";
    }
    String str = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0], i * 2);
    paramArrayOfInt[0] += i * 2;
    return str;
  }
  
  static DateTime c(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    int i = zc.e(paramArrayOfByte, 0 + paramInt) & 0xFFFF;
    int j = zc.e(paramArrayOfByte, 2 + paramInt) & 0xFFFF;
    int k = paramArrayOfByte[(4 + paramInt)];
    DateTime localDateTime = new DateTime(1900, 1, 1);
    if (k == 0) {
      localDateTime = new DateTime(i, j, 1);
    } else {
      localDateTime = new DateTime(i, j, paramArrayOfByte[(4 + paramInt)] & 0xFF, paramArrayOfByte[(5 + paramInt)] & 0xFF, paramArrayOfByte[(6 + paramInt)] & 0xFF, paramArrayOfByte[(7 + paramInt)] & 0xFF);
    }
    return localDateTime;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, String paramString)
    throws Exception
  {
    int i = paramInt;
    int j;
    if (paramString == null)
    {
      for (j = 0; j < 4; j++) {
        paramArrayOfByte[(i++)] = -1;
      }
    }
    else if (paramString.length() == 0)
    {
      for (j = 0; j < 4; j++) {
        paramArrayOfByte[(i++)] = 0;
      }
    }
    else
    {
      System.arraycopy(zc.a(paramString.length()), 0, paramArrayOfByte, i, 4);
      i += 4;
      byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
      System.arraycopy(arrayOfByte, 0, paramArrayOfByte, i, arrayOfByte.length);
      i += arrayOfByte.length;
    }
    return i;
  }
  
  static String d(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    int i = zc.a(paramArrayOfByte, paramInt);
    paramInt += 4;
    if (i < 0) {
      return null;
    }
    if (i == 0) {
      return "";
    }
    return Encoding.getUnicode().a(paramArrayOfByte, paramInt, i * 2);
  }
  
  static String e(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    int i = zc.b(paramArrayOfByte, paramInt);
    paramInt += 2;
    if (i < 0) {
      return null;
    }
    if (i == 0) {
      return "";
    }
    return Encoding.getUnicode().a(paramArrayOfByte, paramInt, i * 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */