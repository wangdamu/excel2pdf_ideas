package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zban
{
  static void a(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() < 2)) {
      return;
    }
    for (;;)
    {
      int i = paramArrayList.size();
      b(paramArrayList);
      int j = paramArrayList.size();
      if (i == j) {
        break;
      }
    }
  }
  
  static void b(ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      CellArea localCellArea1 = (CellArea)paramArrayList.get(j);
      for (int k = j + 1; k < i; k++)
      {
        CellArea localCellArea2 = (CellArea)paramArrayList.get(k);
        int m = 0;
        boolean[] arrayOfBoolean = { m };
        localCellArea1 = a(localCellArea1, localCellArea2, arrayOfBoolean);
        m = arrayOfBoolean[0];
        if (m != 0)
        {
          paramArrayList.set(j, localCellArea1);
          paramArrayList.remove(k);
          k--;
          i--;
        }
      }
    }
  }
  
  static CellArea a(CellArea paramCellArea1, CellArea paramCellArea2, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    if ((paramCellArea1.StartColumn == paramCellArea2.StartColumn) && (paramCellArea1.EndColumn == paramCellArea2.EndColumn))
    {
      if (paramCellArea2.StartRow <= paramCellArea1.StartRow)
      {
        if (paramCellArea2.EndRow >= paramCellArea1.StartRow - 1)
        {
          paramCellArea1.StartRow = paramCellArea2.StartRow;
          paramArrayOfBoolean[0] = true;
        }
        if (paramCellArea2.EndRow > paramCellArea1.EndRow)
        {
          paramCellArea1.EndRow = paramCellArea2.EndRow;
          paramArrayOfBoolean[0] = true;
        }
      }
      else if ((paramCellArea2.StartRow <= paramCellArea1.EndRow + 1) && (paramCellArea2.EndRow > paramCellArea1.EndRow))
      {
        paramCellArea1.EndRow = paramCellArea2.EndRow;
        paramArrayOfBoolean[0] = true;
      }
    }
    else if ((paramCellArea1.StartRow == paramCellArea2.StartRow) && (paramCellArea1.EndRow == paramCellArea2.EndRow)) {
      if (paramCellArea2.StartColumn <= paramCellArea1.StartColumn)
      {
        if (paramCellArea2.EndColumn >= paramCellArea1.StartColumn - 1)
        {
          paramCellArea1.StartColumn = paramCellArea2.StartColumn;
          paramArrayOfBoolean[0] = true;
        }
        if (paramCellArea2.EndColumn > paramCellArea1.EndColumn)
        {
          paramCellArea1.EndColumn = paramCellArea2.EndColumn;
          paramArrayOfBoolean[0] = true;
        }
      }
      else if ((paramCellArea2.StartColumn <= paramCellArea1.EndColumn + 1) && (paramCellArea2.EndColumn > paramCellArea1.EndColumn))
      {
        paramCellArea1.EndColumn = paramCellArea2.EndColumn;
        paramArrayOfBoolean[0] = true;
      }
    }
    return paramCellArea1;
  }
  
  static boolean a(ArrayList paramArrayList, CellArea paramCellArea)
  {
    boolean bool = false;
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      CellArea localCellArea1 = (CellArea)paramArrayList.get(i);
      Object localObject = e(localCellArea1, paramCellArea);
      if (localObject != null)
      {
        CellArea localCellArea2 = (CellArea)localObject;
        if (a(localCellArea2, paramCellArea)) {
          paramArrayList.set(i, localCellArea1);
        } else if (a(localCellArea2, localCellArea1)) {
          paramArrayList.set(i, paramCellArea);
        }
        bool = true;
        break;
      }
      if ((localCellArea1.StartRow == paramCellArea.StartRow) && (localCellArea1.EndRow == paramCellArea.EndRow))
      {
        if (paramCellArea.StartColumn == localCellArea1.EndColumn + 1)
        {
          localCellArea1.EndColumn = paramCellArea.EndColumn;
          paramArrayList.set(i, localCellArea1);
          bool = true;
          break;
        }
        if (paramCellArea.EndColumn == localCellArea1.StartColumn + 1)
        {
          localCellArea1.StartColumn = paramCellArea.StartColumn;
          paramArrayList.set(i, localCellArea1);
          bool = true;
          break;
        }
      }
      else if ((localCellArea1.StartColumn == paramCellArea.StartColumn) && (localCellArea1.EndColumn == paramCellArea.StartColumn))
      {
        if (paramCellArea.StartRow == localCellArea1.EndRow + 1)
        {
          localCellArea1.EndRow = paramCellArea.EndRow;
          paramArrayList.set(i, localCellArea1);
          bool = true;
          break;
        }
        if (paramCellArea.EndRow == localCellArea1.StartRow + 1)
        {
          localCellArea1.StartRow = paramCellArea.StartRow;
          paramArrayList.set(i, localCellArea1);
          bool = true;
          break;
        }
      }
    }
    if (!bool) {
      zf.a(paramArrayList, paramCellArea);
    }
    return bool;
  }
  
  static Object a(CellArea paramCellArea, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = b(paramCellArea, paramInt1, paramInt2);
    if (localObject == null) {
      return null;
    }
    paramCellArea = (CellArea)localObject;
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (paramInt3 + paramCellArea.StartRow - paramInt1);
    localCellArea.StartColumn = paramCellArea.StartColumn;
    localCellArea.EndRow = (paramCellArea.EndRow - paramCellArea.StartRow + localCellArea.StartRow);
    localCellArea.EndColumn = paramCellArea.EndColumn;
    return localCellArea;
  }
  
  static CellArea a(CellArea paramCellArea, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    if (paramInt2 == 0) {
      return paramCellArea;
    }
    if ((paramInt2 < 0) && (paramCellArea.StartRow >= paramInt1) && (paramInt1 - paramInt2 - 1 >= paramCellArea.EndRow))
    {
      paramArrayOfBoolean[0] = true;
      return paramCellArea;
    }
    if (paramCellArea.StartRow >= paramInt1)
    {
      paramCellArea.StartRow += paramInt2;
      if (paramCellArea.StartRow < paramInt1) {
        paramCellArea.StartRow = paramInt1;
      }
      if (paramCellArea.StartRow > 1048575)
      {
        paramArrayOfBoolean[0] = true;
        return paramCellArea;
      }
    }
    if (paramCellArea.EndRow >= paramInt1)
    {
      paramCellArea.EndRow += paramInt2;
      if (paramCellArea.EndRow > 1048575) {
        paramCellArea.EndRow = 1048575;
      } else if (paramCellArea.EndRow < paramInt1) {
        paramCellArea.EndRow = (paramInt1 - 1);
      }
    }
    paramArrayOfBoolean[0] = false;
    return paramCellArea;
  }
  
  static CellArea b(CellArea paramCellArea, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    if (paramInt2 == 0) {
      return paramCellArea;
    }
    if ((paramInt2 < 0) && (paramCellArea.StartColumn >= paramInt1) && (paramInt1 - paramInt2 - 1 >= paramCellArea.EndColumn))
    {
      paramArrayOfBoolean[0] = true;
      return paramCellArea;
    }
    if (paramCellArea.StartColumn >= paramInt1)
    {
      paramCellArea.StartColumn += paramInt2;
      if (paramCellArea.StartColumn < paramInt1) {
        paramCellArea.StartColumn = paramInt1;
      }
      if (paramCellArea.StartColumn > 16383)
      {
        paramArrayOfBoolean[0] = true;
        return paramCellArea;
      }
    }
    if (paramCellArea.EndColumn > paramInt1 - 1)
    {
      paramCellArea.EndColumn += paramInt2;
      if (paramCellArea.EndColumn > 16383) {
        paramCellArea.EndColumn = 16383;
      } else if (paramCellArea.EndColumn < paramInt1) {
        paramCellArea.EndColumn = (paramInt1 - 1);
      }
    }
    paramArrayOfBoolean[0] = false;
    return paramCellArea;
  }
  
  static boolean a(CellArea paramCellArea1, CellArea paramCellArea2)
  {
    return (paramCellArea1.StartRow == paramCellArea2.StartRow) && (paramCellArea1.StartColumn == paramCellArea2.StartColumn) && (paramCellArea1.EndRow == paramCellArea2.EndRow) && (paramCellArea1.EndColumn == paramCellArea2.EndColumn);
  }
  
  static boolean b(CellArea paramCellArea1, CellArea paramCellArea2)
  {
    Object localObject = e(paramCellArea1, paramCellArea2);
    if (localObject != null) {
      return (paramCellArea1.StartRow <= paramCellArea2.StartRow) && (paramCellArea1.EndRow >= paramCellArea2.EndRow) && (paramCellArea1.StartColumn <= paramCellArea2.StartColumn) && (paramCellArea1.StartColumn >= paramCellArea2.EndColumn);
    }
    return true;
  }
  
  static CellArea c(CellArea paramCellArea1, CellArea paramCellArea2)
  {
    int i = paramCellArea1.StartRow < paramCellArea2.StartRow ? paramCellArea1.StartRow : paramCellArea2.StartRow;
    int j = paramCellArea1.StartColumn < paramCellArea2.StartColumn ? paramCellArea1.StartColumn : paramCellArea2.StartColumn;
    int k = paramCellArea1.EndRow > paramCellArea2.EndRow ? paramCellArea1.EndRow : paramCellArea2.EndRow;
    int m = paramCellArea1.EndColumn > paramCellArea2.EndColumn ? paramCellArea1.EndColumn : paramCellArea2.EndColumn;
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = i;
    localCellArea.StartColumn = j;
    localCellArea.EndRow = k;
    localCellArea.EndColumn = m;
    return localCellArea;
  }
  
  static ArrayList d(CellArea paramCellArea1, CellArea paramCellArea2)
  {
    ArrayList localArrayList = new ArrayList();
    CellArea localCellArea;
    if (paramCellArea2.StartRow > paramCellArea1.StartRow)
    {
      localCellArea = new CellArea();
      localCellArea.StartRow = paramCellArea1.StartRow;
      localCellArea.EndRow = (paramCellArea2.StartRow - 1);
      localCellArea.StartColumn = paramCellArea1.StartColumn;
      localCellArea.EndColumn = paramCellArea1.EndColumn;
      zf.a(localArrayList, localCellArea);
    }
    if (paramCellArea2.EndRow < paramCellArea1.EndRow)
    {
      localCellArea = new CellArea();
      localCellArea.StartRow = (paramCellArea2.EndRow + 1);
      localCellArea.EndRow = paramCellArea1.EndRow;
      localCellArea.StartColumn = paramCellArea1.StartColumn;
      localCellArea.EndColumn = paramCellArea1.EndColumn;
      zf.a(localArrayList, localCellArea);
    }
    if (paramCellArea2.StartColumn > paramCellArea1.StartColumn)
    {
      localCellArea = new CellArea();
      localCellArea.StartRow = paramCellArea2.StartRow;
      localCellArea.EndRow = paramCellArea2.EndRow;
      localCellArea.StartColumn = paramCellArea1.StartColumn;
      localCellArea.EndColumn = (paramCellArea2.StartColumn - 1);
      zf.a(localArrayList, localCellArea);
    }
    if (paramCellArea2.EndColumn < paramCellArea1.EndColumn)
    {
      localCellArea = new CellArea();
      localCellArea.StartRow = paramCellArea2.StartRow;
      localCellArea.EndRow = paramCellArea2.EndRow;
      localCellArea.StartColumn = (paramCellArea2.EndColumn + 1);
      localCellArea.EndColumn = paramCellArea1.EndColumn;
      zf.a(localArrayList, localCellArea);
    }
    return localArrayList;
  }
  
  static Object e(CellArea paramCellArea1, CellArea paramCellArea2)
  {
    int i = paramCellArea1.StartRow < paramCellArea2.StartRow ? paramCellArea2.StartRow : paramCellArea1.StartRow;
    int j = paramCellArea1.EndRow > paramCellArea2.EndRow ? paramCellArea2.EndRow : paramCellArea1.EndRow;
    if (i > j) {
      return null;
    }
    int k = paramCellArea1.StartColumn < paramCellArea2.StartColumn ? paramCellArea2.StartColumn : paramCellArea1.StartColumn;
    int m = paramCellArea1.EndColumn > paramCellArea2.EndColumn ? paramCellArea2.EndColumn : paramCellArea1.EndColumn;
    if (k > m) {
      return null;
    }
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = i;
    localCellArea.EndRow = j;
    localCellArea.StartColumn = k;
    localCellArea.EndColumn = m;
    return localCellArea;
  }
  
  static boolean b(ArrayList paramArrayList, CellArea paramCellArea)
  {
    CellArea localCellArea = (CellArea)paramArrayList.get(0);
    int i = localCellArea.StartRow;
    int j = localCellArea.StartColumn;
    int k = localCellArea.EndRow;
    int m = localCellArea.EndColumn;
    for (int n = 1; n < paramArrayList.size(); n++)
    {
      localCellArea = (CellArea)paramArrayList.get(n);
      if (localCellArea.StartRow < i) {
        i = localCellArea.StartRow;
      }
      if (localCellArea.StartColumn < j) {
        j = localCellArea.StartColumn;
      }
      if (localCellArea.EndRow > k) {
        k = localCellArea.EndRow;
      }
      if (localCellArea.EndColumn > m) {
        m = localCellArea.EndColumn;
      }
    }
    return localCellArea.b(paramCellArea);
  }
  
  static ArrayList a(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramInt1 + paramInt2 - 1;
    CellArea localCellArea = new CellArea();
    localCellArea.StartColumn = paramCellArea.StartColumn;
    localCellArea.EndColumn = paramCellArea.EndColumn;
    if (paramInt1 < paramCellArea.StartRow)
    {
      if (i < paramCellArea.StartRow)
      {
        zf.a(localArrayList, paramCellArea);
      }
      else if (i < paramCellArea.EndRow)
      {
        localCellArea.StartRow = (i + 1);
        localCellArea.EndRow = paramCellArea.EndRow;
      }
    }
    else if (paramInt1 >= paramCellArea.StartRow) {
      if (paramInt1 > paramCellArea.EndRow)
      {
        zf.a(localArrayList, paramCellArea);
      }
      else
      {
        if (paramInt1 != paramCellArea.StartRow)
        {
          localCellArea.StartRow = paramCellArea.StartRow;
          localCellArea.EndRow = (paramInt1 - 1);
          zf.a(localArrayList, localCellArea);
        }
        if (i < paramCellArea.EndRow)
        {
          paramCellArea.StartRow = (i + 1);
          zf.a(localArrayList, paramCellArea);
        }
      }
    }
    return localArrayList;
  }
  
  static Object b(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2 - 1;
    CellArea localCellArea = new CellArea();
    localCellArea.StartColumn = paramCellArea.StartColumn;
    localCellArea.EndColumn = paramCellArea.EndColumn;
    if (paramInt1 < paramCellArea.StartRow)
    {
      if (i < paramCellArea.StartRow) {
        return null;
      }
      if (i <= paramCellArea.EndRow)
      {
        localCellArea.StartRow = paramCellArea.StartRow;
        localCellArea.EndRow = i;
      }
      else
      {
        localCellArea.StartRow = paramCellArea.StartRow;
        localCellArea.EndRow = paramCellArea.EndRow;
      }
    }
    else if (paramInt1 >= paramCellArea.StartRow)
    {
      if (paramInt1 > paramCellArea.EndRow) {
        return null;
      }
      if (i <= paramCellArea.EndRow)
      {
        localCellArea.StartRow = paramInt1;
        localCellArea.EndRow = i;
      }
      else
      {
        localCellArea.StartRow = paramInt1;
        localCellArea.EndRow = paramCellArea.EndRow;
      }
    }
    return localCellArea;
  }
  
  static Object c(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2 - 1;
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramCellArea.StartRow;
    localCellArea.EndRow = paramCellArea.EndRow;
    if (paramInt1 < paramCellArea.EndColumn)
    {
      if (i < paramCellArea.StartColumn) {
        return null;
      }
      if (i <= paramCellArea.EndColumn)
      {
        localCellArea.StartColumn = paramCellArea.StartColumn;
        localCellArea.EndColumn = i;
      }
      else
      {
        localCellArea.StartColumn = paramCellArea.StartColumn;
        localCellArea.EndColumn = paramCellArea.EndColumn;
      }
    }
    else if (paramInt1 >= paramCellArea.EndColumn)
    {
      if (paramInt1 > paramCellArea.EndColumn) {
        return null;
      }
      if (i <= paramCellArea.EndColumn)
      {
        localCellArea.StartColumn = paramInt1;
        localCellArea.EndColumn = i;
      }
      else
      {
        localCellArea.StartColumn = paramInt1;
        localCellArea.EndColumn = paramCellArea.EndColumn;
      }
    }
    return localCellArea;
  }
  
  static ArrayList a(boolean paramBoolean, CellArea paramCellArea1, int paramInt, CellArea paramCellArea2, boolean[] paramArrayOfBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramCellArea1.StartColumn > paramCellArea2.EndColumn) || (paramCellArea1.EndColumn < paramCellArea2.StartColumn) || (paramCellArea1.StartRow > paramCellArea2.EndRow))
    {
      paramArrayOfBoolean[0] = false;
      return localArrayList;
    }
    if (!paramBoolean)
    {
      if ((paramCellArea2.StartRow == 0) && (paramCellArea2.EndRow >= 65535))
      {
        paramArrayOfBoolean[0] = false;
        return localArrayList;
      }
      if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
      {
        if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
        {
          if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
          {
            paramCellArea2.StartRow += paramInt;
            paramCellArea2.EndRow += paramInt;
            if (paramCellArea2.EndRow > 65535) {
              paramCellArea2.EndRow = 65535;
            }
            zf.a(localArrayList, paramCellArea2);
            paramArrayOfBoolean[0] = true;
            return localArrayList;
          }
          paramCellArea2.EndRow += paramInt;
          zf.a(localArrayList, paramCellArea2);
          paramArrayOfBoolean[0] = true;
          return localArrayList;
        }
        if (paramCellArea1.StartRow <= paramCellArea2.EndRow)
        {
          localCellArea1 = new CellArea();
          localCellArea1.StartColumn = paramCellArea2.StartColumn;
          localCellArea1.EndColumn = paramCellArea1.EndColumn;
          paramCellArea2.StartRow += paramInt;
          paramCellArea2.EndRow += paramInt;
          zf.a(localArrayList, localCellArea1);
        }
        else
        {
          localCellArea1 = new CellArea();
          localCellArea1.StartColumn = paramCellArea2.StartColumn;
          localCellArea1.EndColumn = paramCellArea1.EndColumn;
          localCellArea1.StartRow = paramCellArea2.StartRow;
          paramCellArea2.EndRow += paramInt;
          zf.a(localArrayList, localCellArea1);
        }
        localCellArea1 = new CellArea();
        localCellArea1.StartRow = paramCellArea2.StartRow;
        localCellArea1.EndRow = paramCellArea2.EndRow;
        localCellArea1.StartColumn = (paramCellArea1.EndColumn + 1);
        localCellArea1.EndColumn = paramCellArea2.EndColumn;
        zf.a(localArrayList, localCellArea1);
        paramArrayOfBoolean[0] = true;
        return localArrayList;
      }
      localCellArea1 = new CellArea();
      localCellArea1.StartRow = paramCellArea2.StartRow;
      localCellArea1.EndRow = paramCellArea2.EndRow;
      localCellArea1.StartColumn = paramCellArea2.StartColumn;
      localCellArea1.EndColumn = (paramCellArea1.StartColumn - 1);
      zf.a(localArrayList, localCellArea1);
      if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
      {
        if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartColumn = paramCellArea1.StartColumn;
          localCellArea2.EndColumn = paramCellArea2.EndColumn;
          paramCellArea2.StartRow += paramInt;
          paramCellArea2.EndRow += paramInt;
          zf.a(localArrayList, localCellArea2);
        }
        else
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartColumn = paramCellArea1.StartColumn;
          localCellArea2.EndColumn = paramCellArea2.EndColumn;
          localCellArea2.StartRow = paramCellArea2.StartRow;
          paramCellArea2.EndRow += paramInt;
          zf.a(localArrayList, localCellArea2);
        }
        paramArrayOfBoolean[0] = true;
        return localArrayList;
      }
      if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
      {
        localCellArea2 = new CellArea();
        localCellArea2.StartColumn = paramCellArea1.StartColumn;
        localCellArea2.EndColumn = paramCellArea1.EndColumn;
        paramCellArea2.StartRow += paramInt;
        paramCellArea2.EndRow += paramInt;
        if (localCellArea2.EndRow > 65535) {
          localCellArea2.EndRow = 65535;
        }
        zf.a(localArrayList, localCellArea2);
      }
      else
      {
        localCellArea2 = new CellArea();
        localCellArea2.StartColumn = paramCellArea1.StartColumn;
        localCellArea2.EndColumn = paramCellArea1.EndColumn;
        localCellArea2.StartRow = paramCellArea2.StartRow;
        paramCellArea2.EndRow += paramInt;
        zf.a(localArrayList, localCellArea2);
      }
      localCellArea2 = new CellArea();
      localCellArea2.StartRow = paramCellArea2.StartRow;
      localCellArea2.EndRow = paramCellArea2.EndRow;
      localCellArea2.StartColumn = (paramCellArea1.EndColumn + 1);
      localCellArea2.EndColumn = paramCellArea2.EndColumn;
      zf.a(localArrayList, localCellArea2);
      paramArrayOfBoolean[0] = true;
      return localArrayList;
    }
    if ((paramCellArea2.StartRow == 0) && (paramCellArea2.EndRow >= 1048575))
    {
      paramArrayOfBoolean[0] = false;
      return localArrayList;
    }
    if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
    {
      if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
      {
        if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
        {
          paramCellArea2.StartRow += paramInt;
          paramCellArea2.EndRow += paramInt;
          if (paramCellArea2.EndRow > 1048575) {
            paramCellArea2.EndRow = 1048575;
          }
          zf.a(localArrayList, paramCellArea2);
          paramArrayOfBoolean[0] = true;
          return localArrayList;
        }
        paramCellArea2.EndRow += paramInt;
        zf.a(localArrayList, paramCellArea2);
        paramArrayOfBoolean[0] = true;
        return localArrayList;
      }
      if (paramCellArea1.StartRow <= paramCellArea2.EndRow)
      {
        localCellArea1 = new CellArea();
        localCellArea1.StartColumn = paramCellArea2.StartColumn;
        localCellArea1.EndColumn = paramCellArea1.EndColumn;
        paramCellArea2.StartRow += paramInt;
        paramCellArea2.EndRow += paramInt;
        zf.a(localArrayList, localCellArea1);
      }
      else
      {
        localCellArea1 = new CellArea();
        localCellArea1.StartColumn = paramCellArea2.StartColumn;
        localCellArea1.EndColumn = paramCellArea1.EndColumn;
        localCellArea1.StartRow = paramCellArea2.StartRow;
        paramCellArea2.EndRow += paramInt;
        zf.a(localArrayList, localCellArea1);
      }
      localCellArea1 = new CellArea();
      localCellArea1.StartRow = paramCellArea2.StartRow;
      localCellArea1.EndRow = paramCellArea2.EndRow;
      localCellArea1.StartColumn = (paramCellArea1.EndColumn + 1);
      localCellArea1.EndColumn = paramCellArea2.EndColumn;
      zf.a(localArrayList, localCellArea1);
      paramArrayOfBoolean[0] = true;
      return localArrayList;
    }
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartRow = paramCellArea2.StartRow;
    localCellArea1.EndRow = paramCellArea2.EndRow;
    localCellArea1.StartColumn = paramCellArea2.StartColumn;
    localCellArea1.EndColumn = (paramCellArea1.StartColumn - 1);
    zf.a(localArrayList, localCellArea1);
    if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
    {
      if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
      {
        localCellArea2 = new CellArea();
        localCellArea2.StartColumn = paramCellArea1.StartColumn;
        localCellArea2.EndColumn = paramCellArea2.EndColumn;
        paramCellArea2.StartRow += paramInt;
        paramCellArea2.EndRow += paramInt;
        zf.a(localArrayList, localCellArea2);
      }
      else
      {
        localCellArea2 = new CellArea();
        localCellArea2.StartColumn = paramCellArea1.StartColumn;
        localCellArea2.EndColumn = paramCellArea2.EndColumn;
        localCellArea2.StartRow = paramCellArea2.StartRow;
        paramCellArea2.EndRow += paramInt;
        zf.a(localArrayList, localCellArea2);
      }
      paramArrayOfBoolean[0] = true;
      return localArrayList;
    }
    if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
    {
      localCellArea2 = new CellArea();
      localCellArea2.StartColumn = paramCellArea1.StartColumn;
      localCellArea2.EndColumn = paramCellArea1.EndColumn;
      paramCellArea2.StartRow += paramInt;
      paramCellArea2.EndRow += paramInt;
      zf.a(localArrayList, localCellArea2);
    }
    else
    {
      localCellArea2 = new CellArea();
      localCellArea2.StartColumn = paramCellArea1.StartColumn;
      localCellArea2.EndColumn = paramCellArea1.EndColumn;
      localCellArea2.StartRow = paramCellArea2.StartRow;
      paramCellArea2.EndRow += paramInt;
      zf.a(localArrayList, localCellArea2);
    }
    CellArea localCellArea2 = new CellArea();
    localCellArea2.StartRow = paramCellArea2.StartRow;
    localCellArea2.EndRow = paramCellArea2.EndRow;
    localCellArea2.StartColumn = (paramCellArea1.EndColumn + 1);
    localCellArea2.EndColumn = paramCellArea2.EndColumn;
    zf.a(localArrayList, localCellArea2);
    paramArrayOfBoolean[0] = true;
    return localArrayList;
  }
  
  static void a(ArrayList paramArrayList1, boolean paramBoolean, CellArea paramCellArea, int paramInt, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    for (int i = 0; i < paramArrayList1.size(); i++) {
      a(paramBoolean, paramCellArea, paramInt, (CellArea)paramArrayList1.get(i), paramArrayList2, paramArrayList3);
    }
  }
  
  static void b(ArrayList paramArrayList1, boolean paramBoolean, CellArea paramCellArea, int paramInt, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    for (int i = 0; i < paramArrayList1.size(); i++) {
      c(paramBoolean, paramCellArea, paramInt, (CellArea)paramArrayList1.get(i), paramArrayList2, paramArrayList3);
    }
  }
  
  static void a(boolean paramBoolean, CellArea paramCellArea1, int paramInt, CellArea paramCellArea2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if ((paramCellArea1.StartColumn > paramCellArea2.EndColumn) || (paramCellArea1.EndColumn < paramCellArea2.StartColumn) || (paramCellArea1.StartRow > paramCellArea2.EndRow))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    if (!paramBoolean)
    {
      if ((paramCellArea2.StartRow == 0) && (paramCellArea2.EndRow >= 65535)) {
        zf.a(paramArrayList1, paramCellArea2);
      }
    }
    else if ((paramCellArea2.StartRow == 0) && (paramCellArea2.EndRow >= 1048575))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    CellArea localCellArea1;
    if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
    {
      if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
      {
        if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
        {
          paramCellArea2.StartRow += paramInt;
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList2, paramCellArea2);
        }
        else
        {
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList1, paramCellArea2);
        }
      }
      else
      {
        if (paramCellArea1.StartRow <= paramCellArea2.EndRow)
        {
          localCellArea1 = new CellArea();
          localCellArea1.StartColumn = paramCellArea2.StartColumn;
          localCellArea1.EndColumn = paramCellArea1.EndColumn;
          paramCellArea2.StartRow += paramInt;
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList2, localCellArea1);
        }
        else
        {
          localCellArea1 = new CellArea();
          localCellArea1.StartColumn = paramCellArea2.StartColumn;
          localCellArea1.EndColumn = paramCellArea1.EndColumn;
          localCellArea1.StartRow = paramCellArea2.StartRow;
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList1, localCellArea1);
        }
        localCellArea1 = new CellArea();
        localCellArea1.StartRow = paramCellArea2.StartRow;
        localCellArea1.EndRow = paramCellArea2.EndRow;
        localCellArea1.StartColumn = (paramCellArea1.EndColumn + 1);
        localCellArea1.EndColumn = paramCellArea2.EndColumn;
        zf.a(paramArrayList1, localCellArea1);
      }
    }
    else
    {
      localCellArea1 = new CellArea();
      localCellArea1.StartRow = paramCellArea2.StartRow;
      localCellArea1.EndRow = paramCellArea2.EndRow;
      localCellArea1.StartColumn = paramCellArea2.StartColumn;
      localCellArea1.EndColumn = (paramCellArea1.StartColumn - 1);
      zf.a(paramArrayList1, localCellArea1);
      CellArea localCellArea2;
      if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
      {
        if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartColumn = paramCellArea1.StartColumn;
          localCellArea2.EndColumn = paramCellArea2.EndColumn;
          paramCellArea2.StartRow += paramInt;
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList2, localCellArea2);
        }
        else
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartColumn = paramCellArea1.StartColumn;
          localCellArea2.EndColumn = paramCellArea2.EndColumn;
          localCellArea2.StartRow = paramCellArea2.StartRow;
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList1, localCellArea2);
        }
      }
      else
      {
        if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartColumn = paramCellArea1.StartColumn;
          localCellArea2.EndColumn = paramCellArea1.EndColumn;
          paramCellArea2.StartRow += paramInt;
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList2, localCellArea2);
        }
        else
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartColumn = paramCellArea1.StartColumn;
          localCellArea2.EndColumn = paramCellArea1.EndColumn;
          localCellArea2.StartRow = paramCellArea2.StartRow;
          paramCellArea2.EndRow += paramInt;
          zf.a(paramArrayList1, localCellArea2);
        }
        localCellArea2 = new CellArea();
        localCellArea2.StartRow = paramCellArea2.StartRow;
        localCellArea2.EndRow = paramCellArea2.EndRow;
        localCellArea2.StartColumn = (paramCellArea1.EndColumn + 1);
        localCellArea2.EndColumn = paramCellArea2.EndColumn;
        zf.a(paramArrayList1, localCellArea2);
      }
    }
  }
  
  static void b(boolean paramBoolean, CellArea paramCellArea1, int paramInt, CellArea paramCellArea2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
    {
      if (paramCellArea1.EndRow < paramCellArea2.StartRow)
      {
        paramCellArea2.StartRow -= paramInt;
        paramCellArea2.EndRow -= paramInt;
        zf.a(paramArrayList2, paramCellArea2);
      }
      else if (paramCellArea1.EndRow < paramCellArea2.EndRow)
      {
        CellArea localCellArea = CellArea.createCellArea(paramCellArea1.EndRow + 1, paramCellArea2.StartColumn, paramCellArea2.EndRow, paramCellArea2.EndColumn);
        localCellArea.StartRow -= paramInt;
        localCellArea.EndRow -= paramInt;
        zf.a(paramArrayList2, localCellArea);
      }
    }
    else if (paramCellArea1.EndRow < paramCellArea2.EndRow)
    {
      paramCellArea2.EndRow -= paramInt;
      zf.a(paramArrayList2, paramCellArea2);
    }
    else
    {
      paramCellArea2.EndRow = (paramCellArea1.StartRow - 1);
      zf.a(paramArrayList2, paramCellArea2);
    }
  }
  
  static Object a(CellArea paramCellArea1, int paramInt, CellArea paramCellArea2)
  {
    if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
    {
      if (paramCellArea1.EndRow < paramCellArea2.StartRow)
      {
        paramCellArea2.StartRow -= paramInt;
        paramCellArea2.EndRow -= paramInt;
      }
      else
      {
        if (paramCellArea1.EndRow < paramCellArea2.EndRow)
        {
          CellArea localCellArea = CellArea.createCellArea(paramCellArea1.EndRow + 1, paramCellArea2.StartColumn, paramCellArea2.EndRow, paramCellArea2.EndColumn);
          localCellArea.StartRow -= paramInt;
          localCellArea.EndRow -= paramInt;
          return localCellArea;
        }
        return null;
      }
    }
    else if (paramCellArea1.StartRow <= paramCellArea2.EndRow) {
      if (paramCellArea1.EndRow < paramCellArea2.EndRow) {
        paramCellArea2.EndRow -= paramInt;
      } else {
        paramCellArea2.EndRow = (paramCellArea1.StartRow - 1);
      }
    }
    return paramCellArea2;
  }
  
  static void c(boolean paramBoolean, CellArea paramCellArea1, int paramInt, CellArea paramCellArea2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if ((paramCellArea1.StartColumn > paramCellArea2.EndColumn) || (paramCellArea1.EndColumn < paramCellArea2.StartColumn) || (paramCellArea1.StartRow > paramCellArea2.EndRow))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    if (!paramBoolean)
    {
      if ((paramCellArea2.StartRow == 0) && (paramCellArea2.EndRow >= 65535)) {
        zf.a(paramArrayList1, paramCellArea2);
      }
    }
    else if ((paramCellArea2.StartRow == 0) && (paramCellArea2.EndRow >= 1048575))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    CellArea localCellArea1;
    CellArea localCellArea2;
    if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
    {
      if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
      {
        b(paramBoolean, paramCellArea1, paramInt, paramCellArea2, paramArrayList1, paramArrayList2);
      }
      else
      {
        localCellArea1 = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea2.StartColumn, paramCellArea2.EndRow, paramCellArea1.EndColumn);
        b(paramBoolean, paramCellArea1, paramInt, localCellArea1, paramArrayList1, paramArrayList2);
        localCellArea2 = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea1.EndColumn + 1, paramCellArea2.EndRow, paramCellArea2.EndColumn);
        zf.a(paramArrayList1, localCellArea2);
      }
    }
    else
    {
      localCellArea1 = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea2.StartColumn, paramCellArea2.EndRow, paramCellArea1.StartColumn - 1);
      zf.a(paramArrayList1, localCellArea1);
      localCellArea2 = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea1.StartColumn, paramCellArea2.EndRow, paramCellArea2.EndColumn);
      if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
      {
        b(paramBoolean, paramCellArea1, paramInt, localCellArea2, paramArrayList1, paramArrayList2);
      }
      else
      {
        CellArea localCellArea3 = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea1.StartColumn, paramCellArea2.EndRow, paramCellArea1.EndColumn);
        b(paramBoolean, paramCellArea1, paramInt, localCellArea3, paramArrayList1, paramArrayList2);
        localCellArea2.StartColumn = (paramCellArea1.EndColumn + 1);
        zf.a(paramArrayList1, localCellArea2);
      }
    }
  }
  
  static ArrayList b(CellArea paramCellArea1, CellArea paramCellArea2, boolean[] paramArrayOfBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramCellArea1.StartColumn > paramCellArea2.EndColumn) || (paramCellArea1.EndColumn < paramCellArea2.StartColumn) || (paramCellArea1.StartRow > paramCellArea2.EndRow))
    {
      paramArrayOfBoolean[0] = false;
      return localArrayList;
    }
    if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
    {
      if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
      {
        paramArrayOfBoolean[0] = true;
        return localArrayList;
      }
      localCellArea1 = new CellArea();
      localCellArea1.StartColumn = paramCellArea2.StartColumn;
      localCellArea1.EndColumn = paramCellArea1.EndColumn;
      localCellArea1.StartRow = paramCellArea2.StartRow;
      localCellArea1.EndRow = paramCellArea2.EndRow;
      zf.a(localArrayList, localCellArea1);
      localCellArea2 = new CellArea();
      localCellArea2.StartRow = paramCellArea2.StartRow;
      localCellArea2.EndRow = paramCellArea2.EndRow;
      localCellArea2.StartColumn = (paramCellArea1.EndColumn + 1);
      localCellArea2.EndColumn = paramCellArea2.EndColumn;
      zf.a(localArrayList, localCellArea2);
      paramArrayOfBoolean[0] = true;
      return localArrayList;
    }
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartRow = paramCellArea2.StartRow;
    localCellArea1.EndRow = paramCellArea2.EndRow;
    localCellArea1.StartColumn = paramCellArea2.StartColumn;
    localCellArea1.EndColumn = (paramCellArea1.StartColumn - 1);
    zf.a(localArrayList, localCellArea1);
    if (paramCellArea1.EndColumn >= paramCellArea2.EndColumn)
    {
      localCellArea2 = new CellArea();
      localCellArea2.StartColumn = paramCellArea1.StartColumn;
      localCellArea2.EndColumn = paramCellArea2.EndColumn;
      localCellArea2.StartRow = paramCellArea2.StartRow;
      localCellArea2.EndRow = paramCellArea2.EndRow;
      zf.a(localArrayList, localCellArea2);
      paramArrayOfBoolean[0] = true;
      return localArrayList;
    }
    CellArea localCellArea2 = new CellArea();
    localCellArea2.StartColumn = paramCellArea1.StartColumn;
    localCellArea2.EndColumn = paramCellArea1.EndColumn;
    localCellArea2.StartRow = paramCellArea2.StartRow;
    localCellArea2.EndRow = paramCellArea2.EndRow;
    zf.a(localArrayList, localCellArea2);
    CellArea localCellArea3 = new CellArea();
    localCellArea3.StartRow = paramCellArea2.StartRow;
    localCellArea3.EndRow = paramCellArea2.EndRow;
    localCellArea3.StartColumn = (paramCellArea1.EndColumn + 1);
    localCellArea3.EndColumn = paramCellArea2.EndColumn;
    zf.a(localArrayList, localCellArea3);
    paramArrayOfBoolean[0] = true;
    return localArrayList;
  }
  
  static void c(ArrayList paramArrayList1, boolean paramBoolean, CellArea paramCellArea, int paramInt, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    for (int i = 0; i < paramArrayList1.size(); i++) {
      f(paramBoolean, paramCellArea, paramInt, (CellArea)paramArrayList1.get(i), paramArrayList2, paramArrayList3);
    }
  }
  
  static void d(ArrayList paramArrayList1, boolean paramBoolean, CellArea paramCellArea, int paramInt, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    for (int i = 0; i < paramArrayList1.size(); i++) {
      d(paramBoolean, paramCellArea, paramInt, (CellArea)paramArrayList1.get(i), paramArrayList2, paramArrayList3);
    }
  }
  
  static void d(boolean paramBoolean, CellArea paramCellArea1, int paramInt, CellArea paramCellArea2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if ((paramCellArea1.StartRow > paramCellArea2.EndRow) || (paramCellArea1.EndRow < paramCellArea2.StartRow) || (paramCellArea1.StartColumn > paramCellArea2.EndColumn))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    if (paramBoolean)
    {
      if ((paramCellArea2.StartColumn == 0) && (paramCellArea2.EndColumn == 16383)) {
        zf.a(paramArrayList1, paramCellArea2);
      }
    }
    else if ((paramCellArea2.StartColumn == 0) && (paramCellArea2.EndColumn == 255))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
    {
      if (paramCellArea1.EndRow >= paramCellArea2.EndRow)
      {
        if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
        {
          paramCellArea2.StartColumn += paramInt;
          paramCellArea2.EndColumn += paramInt;
          zf.a(paramArrayList2, paramCellArea2);
          return;
        }
        paramCellArea2.EndColumn += paramInt;
        zf.a(paramArrayList1, paramCellArea2);
        return;
      }
      if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
      {
        localCellArea1 = new CellArea();
        localCellArea1.StartRow = paramCellArea2.StartRow;
        localCellArea1.EndRow = paramCellArea1.EndRow;
        paramCellArea2.StartColumn += paramInt;
        paramCellArea2.EndColumn += paramInt;
        zf.a(paramArrayList2, localCellArea1);
        localCellArea2 = new CellArea();
        localCellArea2.StartRow = (paramCellArea1.EndRow + 1);
        localCellArea2.EndRow = paramCellArea2.EndRow;
        localCellArea2.StartColumn = paramCellArea2.StartColumn;
        localCellArea2.EndColumn = paramCellArea2.EndColumn;
        zf.a(paramArrayList1, localCellArea2);
        return;
      }
      localCellArea1 = new CellArea();
      localCellArea1.StartRow = paramCellArea2.StartRow;
      localCellArea1.EndRow = paramCellArea1.EndRow;
      localCellArea1.StartColumn = paramCellArea2.StartColumn;
      paramCellArea2.EndColumn += paramInt;
      zf.a(paramArrayList1, localCellArea1);
      localCellArea2 = new CellArea();
      localCellArea2.StartRow = (paramCellArea1.EndRow + 1);
      localCellArea2.EndRow = paramCellArea2.EndRow;
      localCellArea2.StartColumn = paramCellArea2.StartColumn;
      localCellArea2.EndColumn = paramCellArea2.EndColumn;
      zf.a(paramArrayList1, localCellArea2);
      return;
    }
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartColumn = paramCellArea2.StartColumn;
    localCellArea1.EndColumn = paramCellArea2.EndColumn;
    localCellArea1.StartRow = paramCellArea2.StartRow;
    localCellArea1.EndRow = (paramCellArea1.StartRow - 1);
    zf.a(paramArrayList1, localCellArea1);
    if (paramCellArea1.EndRow >= paramCellArea2.EndRow)
    {
      if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
      {
        localCellArea2 = new CellArea();
        localCellArea2.StartRow = paramCellArea1.StartRow;
        localCellArea2.EndRow = paramCellArea2.EndRow;
        paramCellArea2.StartColumn += paramInt;
        paramCellArea2.EndColumn += paramInt;
        zf.a(paramArrayList2, localCellArea2);
        return;
      }
      localCellArea2 = new CellArea();
      localCellArea2.StartRow = paramCellArea1.StartRow;
      localCellArea2.EndRow = paramCellArea2.EndRow;
      localCellArea2.StartColumn = paramCellArea2.StartColumn;
      paramCellArea2.EndColumn += paramInt;
      zf.a(paramArrayList1, localCellArea2);
      return;
    }
    if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
    {
      localCellArea2 = new CellArea();
      localCellArea2.StartRow = paramCellArea1.StartRow;
      localCellArea2.EndRow = paramCellArea1.EndRow;
      paramCellArea2.StartColumn += paramInt;
      paramCellArea2.EndColumn += paramInt;
      zf.a(paramArrayList2, localCellArea2);
    }
    else
    {
      localCellArea2 = new CellArea();
      localCellArea2.StartRow = paramCellArea1.StartRow;
      localCellArea2.EndRow = paramCellArea1.EndRow;
      localCellArea2.StartColumn = paramCellArea2.StartColumn;
      paramCellArea2.EndColumn += paramInt;
      zf.a(paramArrayList1, localCellArea2);
    }
    CellArea localCellArea2 = new CellArea();
    localCellArea2.StartColumn = paramCellArea2.StartColumn;
    localCellArea2.EndColumn = paramCellArea2.EndColumn;
    localCellArea2.StartRow = (paramCellArea1.EndRow + 1);
    localCellArea2.EndRow = paramCellArea2.EndRow;
    zf.a(paramArrayList1, localCellArea2);
  }
  
  static void e(boolean paramBoolean, CellArea paramCellArea1, int paramInt, CellArea paramCellArea2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
    {
      if (paramCellArea1.EndColumn < paramCellArea2.StartColumn)
      {
        paramCellArea2.StartColumn -= paramInt;
        paramCellArea2.EndColumn -= paramInt;
        zf.a(paramArrayList2, paramCellArea2);
      }
      else if (paramCellArea1.EndColumn < paramCellArea2.EndColumn)
      {
        CellArea localCellArea = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea1.EndColumn + 1, paramCellArea2.EndRow, paramCellArea2.EndColumn);
        localCellArea.StartColumn -= paramInt;
        localCellArea.EndColumn -= paramInt;
        zf.a(paramArrayList2, localCellArea);
      }
    }
    else if (paramCellArea1.EndColumn < paramCellArea2.EndColumn)
    {
      paramCellArea2.EndColumn -= paramInt;
      zf.a(paramArrayList2, paramCellArea2);
    }
    else
    {
      paramCellArea2.EndColumn = (paramCellArea1.StartColumn - 1);
      zf.a(paramArrayList2, paramCellArea2);
    }
  }
  
  static Object b(CellArea paramCellArea1, int paramInt, CellArea paramCellArea2)
  {
    if (paramCellArea1.StartColumn <= paramCellArea2.StartColumn)
    {
      if (paramCellArea1.EndColumn < paramCellArea2.StartColumn)
      {
        paramCellArea2.StartColumn -= paramInt;
        paramCellArea2.EndColumn -= paramInt;
      }
      else
      {
        if (paramCellArea1.EndColumn < paramCellArea2.EndColumn)
        {
          CellArea localCellArea = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea1.EndColumn + 1, paramCellArea2.EndRow, paramCellArea2.EndColumn);
          localCellArea.StartColumn -= paramInt;
          localCellArea.EndColumn -= paramInt;
          return localCellArea;
        }
        return null;
      }
    }
    else if (paramCellArea1.StartColumn <= paramCellArea2.EndColumn) {
      if (paramCellArea1.EndColumn < paramCellArea2.EndColumn) {
        paramCellArea2.EndColumn -= paramInt;
      } else {
        paramCellArea2.EndColumn = (paramCellArea1.StartColumn - 1);
      }
    }
    return paramCellArea2;
  }
  
  static void f(boolean paramBoolean, CellArea paramCellArea1, int paramInt, CellArea paramCellArea2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if ((paramCellArea1.StartRow > paramCellArea2.EndRow) || (paramCellArea1.EndRow < paramCellArea2.StartRow) || (paramCellArea1.StartColumn > paramCellArea2.EndColumn))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    if (paramBoolean)
    {
      if ((paramCellArea2.StartColumn == 0) && (paramCellArea2.EndColumn == 16383)) {
        zf.a(paramArrayList1, paramCellArea2);
      }
    }
    else if ((paramCellArea2.StartColumn == 0) && (paramCellArea2.EndColumn == 255))
    {
      zf.a(paramArrayList1, paramCellArea2);
      return;
    }
    CellArea localCellArea1;
    CellArea localCellArea2;
    if (paramCellArea1.StartRow <= paramCellArea2.StartRow)
    {
      if (paramCellArea1.EndRow >= paramCellArea2.EndRow)
      {
        e(paramBoolean, paramCellArea1, paramInt, paramCellArea2, paramArrayList1, paramArrayList2);
      }
      else
      {
        localCellArea1 = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea2.StartColumn, paramCellArea1.EndRow, paramCellArea2.EndColumn);
        e(paramBoolean, paramCellArea1, paramInt, localCellArea1, paramArrayList1, paramArrayList2);
        localCellArea2 = CellArea.createCellArea(paramCellArea1.EndRow + 1, paramCellArea2.StartColumn, paramCellArea2.EndRow, paramCellArea2.EndColumn);
        zf.a(paramArrayList1, localCellArea2);
      }
    }
    else
    {
      localCellArea1 = CellArea.createCellArea(paramCellArea2.StartRow, paramCellArea2.StartColumn, paramCellArea1.StartRow - 1, paramCellArea2.EndColumn);
      zf.a(paramArrayList1, localCellArea1);
      localCellArea2 = CellArea.createCellArea(paramCellArea1.StartRow, paramCellArea2.StartColumn, paramCellArea2.EndRow, paramCellArea2.EndColumn);
      if (paramCellArea1.EndRow >= paramCellArea2.EndRow)
      {
        e(paramBoolean, paramCellArea1, paramInt, localCellArea2, paramArrayList1, paramArrayList2);
      }
      else
      {
        CellArea localCellArea3 = CellArea.createCellArea(paramCellArea1.StartRow, paramCellArea2.StartColumn, paramCellArea1.EndRow, paramCellArea2.EndColumn);
        e(paramBoolean, paramCellArea1, paramInt, localCellArea3, paramArrayList1, paramArrayList2);
        localCellArea2.StartRow = (paramCellArea1.EndRow + 1);
        zf.a(paramArrayList1, localCellArea2);
        return;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zban.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */