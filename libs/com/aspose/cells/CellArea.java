package com.aspose.cells;

import com.aspose.cells.b.a.zi;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

public final class CellArea
  implements zi
{
  static CellArea a = createCellArea(1, 1, 0, 0);
  public int StartRow;
  public int EndRow;
  public int StartColumn;
  public int EndColumn;
  
  public int compareTo(Object obj)
  {
    CellArea localCellArea = (CellArea)obj;
    if (this.StartRow > localCellArea.StartRow) {
      return 1;
    }
    if (this.StartRow < localCellArea.StartRow) {
      return -1;
    }
    if (this.StartColumn > localCellArea.StartColumn) {
      return 1;
    }
    if (this.StartColumn < localCellArea.StartColumn) {
      return -1;
    }
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Aspose.Cells.CellArea(");
    CellsHelper.a(localStringBuilder, this.StartRow, this.StartColumn, this.EndRow, this.EndColumn);
    localStringBuilder.append(")");
    localStringBuilder.append("[");
    localStringBuilder.append(this.StartRow);
    localStringBuilder.append(",");
    localStringBuilder.append(this.StartColumn);
    localStringBuilder.append(",");
    localStringBuilder.append(this.EndRow);
    localStringBuilder.append(",");
    localStringBuilder.append(this.EndColumn);
    localStringBuilder.append("]");
    return zs.a(localStringBuilder);
  }
  
  boolean a(CellArea paramCellArea)
  {
    if (this.StartRow != paramCellArea.StartRow) {
      return false;
    }
    if (this.EndRow != paramCellArea.EndRow) {
      return false;
    }
    if (this.StartColumn != paramCellArea.StartColumn) {
      return false;
    }
    return this.EndColumn == paramCellArea.EndColumn;
  }
  
  String a()
  {
    return a(1048575, 16383, false);
  }
  
  boolean b(CellArea paramCellArea)
  {
    return (this.EndRow >= paramCellArea.StartRow) && (this.StartRow <= paramCellArea.EndRow) && (this.EndColumn >= paramCellArea.StartColumn) && (this.StartColumn <= paramCellArea.EndColumn);
  }
  
  int c(CellArea paramCellArea)
  {
    if ((this.EndRow < paramCellArea.StartRow) || (this.StartRow > paramCellArea.EndRow) || (this.EndColumn < paramCellArea.StartColumn) || (this.StartColumn > paramCellArea.EndColumn)) {
      return 0;
    }
    if (this.StartRow < paramCellArea.StartRow)
    {
      if ((this.EndRow >= paramCellArea.EndRow) && (this.StartColumn <= paramCellArea.StartColumn) && (this.EndColumn >= paramCellArea.EndColumn)) {
        return 4;
      }
      return 2;
    }
    if (this.StartRow == paramCellArea.StartRow)
    {
      if (this.EndRow < paramCellArea.EndRow)
      {
        if ((this.StartColumn >= paramCellArea.StartColumn) && (this.EndColumn <= paramCellArea.EndColumn)) {
          return 3;
        }
        return 2;
      }
      if (this.EndRow == paramCellArea.EndRow)
      {
        if (this.StartColumn < paramCellArea.StartColumn)
        {
          if (this.EndColumn >= paramCellArea.EndColumn) {
            return 4;
          }
          return 2;
        }
        if (this.StartColumn == paramCellArea.StartColumn)
        {
          if (this.EndColumn < paramCellArea.EndColumn) {
            return 3;
          }
          if (this.EndColumn == paramCellArea.EndColumn) {
            return 1;
          }
          return 4;
        }
        if (this.EndColumn <= paramCellArea.EndColumn) {
          return 3;
        }
        return 2;
      }
      if ((this.StartColumn <= paramCellArea.StartColumn) && (this.EndColumn >= paramCellArea.EndColumn)) {
        return 4;
      }
      return 2;
    }
    if ((this.EndRow <= paramCellArea.EndRow) && (this.StartColumn >= paramCellArea.StartColumn) && (this.EndColumn <= paramCellArea.EndColumn)) {
      return 3;
    }
    return 2;
  }
  
  boolean b()
  {
    return this.EndRow < this.StartRow;
  }
  
  boolean c()
  {
    return (this.StartRow == this.EndRow) && (this.StartColumn == this.EndColumn);
  }
  
  boolean d()
  {
    return this.StartRow == this.EndRow;
  }
  
  boolean e()
  {
    return this.StartColumn == this.EndColumn;
  }
  
  boolean a(int paramInt)
  {
    return (paramInt >= this.StartRow) && (paramInt <= this.EndRow);
  }
  
  boolean b(int paramInt)
  {
    return (paramInt >= this.StartColumn) && (paramInt <= this.EndColumn);
  }
  
  boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 >= this.StartRow) && (paramInt1 <= this.EndRow) && (paramInt2 >= this.StartColumn) && (paramInt2 <= this.EndColumn);
  }
  
  int f()
  {
    return this.EndRow - this.StartRow + 1;
  }
  
  int g()
  {
    return this.EndColumn - this.StartColumn + 1;
  }
  
  String a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    StringBuilder localStringBuilder;
    if (paramBoolean)
    {
      localStringBuilder = new StringBuilder();
      if ((this.StartRow == this.EndRow) && (this.StartColumn == this.EndColumn))
      {
        localStringBuilder.append("$");
        CellsHelper.a(localStringBuilder, this.StartColumn);
        localStringBuilder.append("$");
        localStringBuilder.append(this.StartRow + 1);
      }
      else if ((this.StartRow == 0) && (this.EndRow >= paramInt1))
      {
        localStringBuilder.append("$");
        CellsHelper.a(localStringBuilder, this.StartColumn);
        localStringBuilder.append(":$");
        CellsHelper.a(localStringBuilder, this.EndColumn);
      }
      else if ((this.StartColumn == 0) && (this.EndColumn >= paramInt2))
      {
        localStringBuilder.append("$");
        localStringBuilder.append(this.StartRow + 1);
        localStringBuilder.append(":$");
        localStringBuilder.append(this.EndRow + 1);
      }
      else
      {
        localStringBuilder.append("$");
        CellsHelper.a(localStringBuilder, this.StartColumn);
        localStringBuilder.append("$");
        localStringBuilder.append(this.StartRow + 1);
        localStringBuilder.append(":");
        localStringBuilder.append("$");
        CellsHelper.a(localStringBuilder, this.EndColumn);
        localStringBuilder.append("$");
        localStringBuilder.append(this.EndRow + 1);
      }
      return zs.a(localStringBuilder);
    }
    if ((this.StartRow == this.EndRow) && (this.StartColumn == this.EndColumn)) {
      return CellsHelper.cellIndexToName(this.StartRow, this.StartColumn);
    }
    if ((this.StartRow == 0) && (this.EndRow >= paramInt1))
    {
      localStringBuilder = new StringBuilder();
      CellsHelper.a(localStringBuilder, this.StartColumn);
      localStringBuilder.append(":");
      CellsHelper.a(localStringBuilder, this.EndColumn);
      return zs.a(localStringBuilder);
    }
    if ((this.StartColumn == 0) && (this.EndColumn >= paramInt2)) {
      return this.StartRow + 1 + ":" + (this.EndRow + 1);
    }
    return CellsHelper.a(this.StartRow, this.StartColumn, this.EndRow, this.EndColumn);
  }
  
  boolean c(int paramInt)
  {
    return (this.StartColumn == 0) && (this.EndColumn >= paramInt);
  }
  
  boolean d(int paramInt)
  {
    return (this.StartRow == 0) && (this.EndRow >= paramInt);
  }
  
  static CellArea d(CellArea paramCellArea)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramCellArea.StartRow;
    localCellArea.StartColumn = paramCellArea.StartColumn;
    localCellArea.EndRow = paramCellArea.EndRow;
    localCellArea.EndColumn = paramCellArea.EndColumn;
    return localCellArea;
  }
  
  public static CellArea createCellArea(int startRow, int startColumn, int endRow, int endColumn)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = startRow;
    localCellArea.StartColumn = startColumn;
    localCellArea.EndRow = endRow;
    localCellArea.EndColumn = endColumn;
    return localCellArea;
  }
  
  static CellArea a(String paramString)
  {
    String[] arrayOfString = zw.d(paramString, ':');
    if (arrayOfString.length > 1) {
      return createCellArea(arrayOfString[0], arrayOfString[1]);
    }
    return createCellArea(arrayOfString[0], null);
  }
  
  public static CellArea createCellArea(String startCellName, String endCellName)
  {
    startCellName = zw.a(startCellName, "$", "");
    CellArea localCellArea = new CellArea();
    int[] arrayOfInt = CellsHelper.a(startCellName.toCharArray(), 0, startCellName.length() - 1, true, 1048575, 16383);
    if (arrayOfInt != null)
    {
      if (arrayOfInt[0] != -1) {
        localCellArea.StartRow = arrayOfInt[0];
      }
      if (arrayOfInt[1] != -1) {
        localCellArea.StartColumn = arrayOfInt[1];
      }
    }
    if (endCellName != null)
    {
      arrayOfInt = CellsHelper.a(endCellName.toCharArray(), 0, endCellName.length() - 1, true, 1048575, 16383);
      if (arrayOfInt != null)
      {
        localCellArea.EndRow = (arrayOfInt[0] == -1 ? 1048575 : arrayOfInt[0]);
        localCellArea.EndColumn = (arrayOfInt[1] == -1 ? 16383 : arrayOfInt[1]);
      }
    }
    return localCellArea;
  }
  
  static Object a(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    char[] arrayOfChar = paramString.toCharArray();
    CellArea localCellArea1 = new CellArea();
    CellArea localCellArea2 = null;
    if (paramBoolean) {
      localCellArea2 = localCellArea1;
    }
    int i = paramString.indexOf(':');
    int[] arrayOfInt;
    if (i == -1)
    {
      arrayOfInt = CellsHelper.a(arrayOfChar, 0, arrayOfChar.length - 1, false, 1048575, 16383);
      if (arrayOfInt == null) {
        return localCellArea2;
      }
      localCellArea1.StartColumn = (localCellArea1.EndColumn = arrayOfInt[1]);
      localCellArea1.StartRow = (localCellArea1.EndRow = arrayOfInt[0]);
    }
    else
    {
      arrayOfInt = CellsHelper.a(arrayOfChar, 0, i - 1, true, 1048575, 16383);
      if (arrayOfInt == null) {
        return localCellArea2;
      }
      localCellArea1.StartColumn = arrayOfInt[1];
      localCellArea1.StartRow = arrayOfInt[0];
      arrayOfInt = CellsHelper.a(arrayOfChar, i + 1, arrayOfChar.length - 1, true, 1048575, 16383);
      if (arrayOfInt == null) {
        return localCellArea2;
      }
      localCellArea1.EndColumn = arrayOfInt[1];
      localCellArea1.EndRow = arrayOfInt[0];
      if (localCellArea1.StartColumn == -1)
      {
        if (localCellArea1.EndColumn != -1) {
          return localCellArea2;
        }
        localCellArea1.StartColumn = 0;
        localCellArea1.EndColumn = 16383;
      }
      else if (localCellArea1.EndColumn == -1)
      {
        return localCellArea2;
      }
      if (localCellArea1.StartRow == -1)
      {
        if (localCellArea1.EndRow != -1) {
          return localCellArea2;
        }
        localCellArea1.StartRow = 0;
        localCellArea1.EndRow = 1048575;
      }
      else if (localCellArea1.EndRow == -1)
      {
        return localCellArea2;
      }
      int j;
      if (localCellArea1.StartColumn > localCellArea1.EndColumn)
      {
        j = localCellArea1.StartColumn;
        localCellArea1.StartColumn = localCellArea1.EndColumn;
        localCellArea1.EndColumn = j;
      }
      if (localCellArea1.StartRow > localCellArea1.EndRow)
      {
        j = localCellArea1.StartRow;
        localCellArea1.StartRow = localCellArea1.EndRow;
        localCellArea1.EndRow = j;
      }
    }
    return localCellArea1;
  }
  
  void e(CellArea paramCellArea)
  {
    this.StartRow = paramCellArea.StartRow;
    this.EndRow = paramCellArea.EndRow;
    this.StartColumn = paramCellArea.StartColumn;
    this.EndColumn = paramCellArea.EndColumn;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CellArea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */