package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zaq
{
  private Cells a;
  
  zaq(Cells paramCells)
  {
    this.a = paramCells;
  }
  
  public void a(boolean paramBoolean1, String paramString1, String paramString2, String paramString3, boolean paramBoolean2)
  {
    this.a.g().h = true;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("=DGET(");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(",");
    int i = paramString1.indexOf(":");
    localStringBuilder.append(i == -1 ? paramString1 : paramString1.substring(0, 0 + i));
    localStringBuilder.append(",");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(")");
    Object localObject1 = this.a.g().calculateFormula(zs.a(localStringBuilder));
    int[] arrayOfInt = null;
    CellArea localCellArea1 = CellArea.a(paramString1);
    if ((localObject1 != null) && ((localObject1 instanceof Object[][])))
    {
      localObject2 = (Object[][])localObject1;
      arrayOfInt = new int[localObject2[0].length];
      for (j = 0; j < arrayOfInt.length; j++)
      {
        double d = ((Double)localObject2[0][j]).doubleValue();
        arrayOfInt[j] = ((int)d + localCellArea1.StartRow + 1);
      }
    }
    Object localObject2 = null;
    if (paramBoolean2) {
      localObject2 = new ArrayList();
    }
    int j = -1;
    int k = -1;
    int m = -1;
    if (!paramBoolean1)
    {
      if (paramString3 == null)
      {
        j = localCellArea1.EndRow + 1;
        k = localCellArea1.StartColumn;
        m = localCellArea1.EndColumn;
      }
      else
      {
        CellArea localCellArea2 = CellArea.a(paramString3);
        j = localCellArea2.StartRow;
        k = localCellArea2.StartColumn;
        m = k + localCellArea1.EndColumn - localCellArea1.StartColumn;
      }
      a(this.a, localCellArea1.StartRow, j, k, m);
      j++;
    }
    int n = 0;
    for (int i1 = localCellArea1.StartRow + 1; i1 <= localCellArea1.EndRow; i1++)
    {
      int i2 = 0;
      if ((arrayOfInt != null) && (n < arrayOfInt.length) && (arrayOfInt[n] == i1))
      {
        i2 = 1;
        n++;
      }
      if ((i2 != 0) && (paramBoolean2) && (!a((ArrayList)localObject2, i1, localCellArea1.StartColumn, localCellArea1.EndColumn))) {
        i2 = 0;
      }
      Row localRow = null;
      if (paramBoolean1)
      {
        if (i2 != 0)
        {
          localRow = this.a.getRows().a(i1, true, false, false);
          if ((localRow != null) && (localRow.isHidden())) {
            localRow.setHidden(false);
          }
        }
        else
        {
          localRow = this.a.getRows().get(i1);
          localRow.setHidden(true);
        }
      }
      else if (i2 != 0)
      {
        a(this.a, i1, j, k, m);
        j++;
      }
    }
    this.a.g().h = false;
  }
  
  private static void a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Row localRow1 = paramCells.getRows().a(paramInt1, true, false, false);
    Row localRow2;
    if (localRow1 == null)
    {
      localRow2 = paramCells.getRows().a(paramInt2, true, false, false);
      if (localRow2 != null) {
        localRow2.c();
      }
    }
    else
    {
      localRow2 = paramCells.getRows().get(paramInt2);
      for (int i = paramInt3; i <= paramInt4; i++)
      {
        Cell localCell1 = localRow1.a(i, true, false);
        Cell localCell2;
        if (localCell1 == null)
        {
          localCell2 = localRow2.a(i, true, false);
          if (localCell2 != null) {
            localCell2.f();
          }
        }
        else
        {
          localCell2 = localRow2.get(i);
          localCell2.copy(localCell1);
        }
      }
    }
  }
  
  private boolean a(ArrayList paramArrayList, int paramInt1, int paramInt2, int paramInt3)
  {
    Row localRow1 = this.a.getRows().a(paramInt1, true, false, false);
    boolean bool = (localRow1 == null) || (localRow1.isBlank());
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Row localRow2 = (Row)localIterator.next();
      if (a(localRow2, localRow1, bool, paramInt2, paramInt3)) {
        return false;
      }
    }
    paramArrayList.add(localRow1);
    return true;
  }
  
  private static boolean a(Row paramRow1, Row paramRow2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = (paramRow1 == null) || (paramRow1.isBlank()) ? 1 : 0;
    if (i != 0) {
      return paramBoolean;
    }
    if (paramBoolean) {
      return false;
    }
    for (int j = paramInt1; j <= paramInt2; j++)
    {
      Cell localCell1 = paramRow2.a(j, false, false);
      Cell localCell2 = paramRow1.a(j, false, false);
      int k = (localCell1 == null) || (localCell1.getType() == 3) ? 1 : 0;
      int m = (localCell2 == null) || (localCell2.getType() == 3) ? 1 : 0;
      if (m != 0)
      {
        if (k == 0) {
          return false;
        }
      }
      else
      {
        if (k != 0) {
          return false;
        }
        if (localCell2.getType() != localCell1.getType()) {
          return false;
        }
        switch (localCell2.getType())
        {
        case 0: 
          if (localCell2.getBoolValue() != localCell1.getBoolValue()) {
            return false;
          }
          break;
        case 1: 
        case 4: 
          if (localCell2.getDoubleValue() != localCell1.getDoubleValue()) {
            return false;
          }
          break;
        case 2: 
        case 3: 
        default: 
          if (!zw.b(localCell2.getStringValue(), localCell1.getStringValue())) {
            return false;
          }
          break;
        }
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */