package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zalz
{
  public static boolean a(ICellsDataTable paramICellsDataTable, int paramInt, ImportTableOptions paramImportTableOptions)
  {
    String[] arrayOfString = paramICellsDataTable.getColumns();
    if (arrayOfString == null) {
      throw new CellsException(6, "Columns must be defined for ICellsDataTable");
    }
    if (arrayOfString.length == 0) {
      return false;
    }
    int i = paramImportTableOptions.getTotalColumns();
    if (paramImportTableOptions.getColumnIndexes() != null) {
      i = paramImportTableOptions.getColumnIndexes().length;
    } else if (i < 0) {
      i = arrayOfString.length;
    }
    if (i == 0) {
      return false;
    }
    if (paramInt + i > 16383) {
      i = 16383 - paramInt + 1;
    }
    paramImportTableOptions.setTotalColumns(i);
    if (paramImportTableOptions.getColumnIndexes() == null)
    {
      paramImportTableOptions.setColumnIndexes(new int[i]);
      for (int j = 0; j < i; j++) {
        paramImportTableOptions.getColumnIndexes()[j] = j;
      }
    }
    else if (i < paramImportTableOptions.getColumnIndexes().length)
    {
      int[] arrayOfInt = new int[i];
      for (int k = 0; k < i; k++) {
        arrayOfInt[k] = paramImportTableOptions.getColumnIndexes()[k];
      }
      paramImportTableOptions.setColumnIndexes(arrayOfInt);
    }
    return true;
  }
  
  static int a(ICellsDataTable paramICellsDataTable, Cells paramCells, int paramInt1, int paramInt2, ImportTableOptions paramImportTableOptions)
  {
    paramCells.getRows().d.a();
    paramCells.m();
    paramCells.p().p().a();
    zamm.a(paramInt1, paramInt2);
    if (paramImportTableOptions == null) {
      paramImportTableOptions = new ImportTableOptions();
    }
    if (!a(paramICellsDataTable, paramInt2, paramImportTableOptions)) {
      return 0;
    }
    int[] arrayOfInt = paramImportTableOptions.getColumnIndexes();
    int i = paramImportTableOptions.getTotalRows();
    if (i < 0) {
      i = paramICellsDataTable.getCount();
    }
    boolean bool1 = paramImportTableOptions.getInsertRows();
    RowCollection localRowCollection;
    if (i > -1)
    {
      if (paramImportTableOptions.isFieldNameShown()) {
        i++;
      }
      if (paramInt1 + i > 1048575) {
        i = 1048575 - paramInt1 + 1;
      }
      localRowCollection = new RowCollection(paramCells, paramCells.a(i, 10, paramImportTableOptions.getTotalColumns(), 5));
    }
    else
    {
      i = 1048575 - paramInt1 + 1;
      localRowCollection = new RowCollection(paramCells, paramCells.a(64, 32, 20, 5));
    }
    Row localRow = null;
    int j = 0;
    Object localObject1 = null;
    HashMap localHashMap = new HashMap();
    Object localObject2 = null;
    boolean bool2 = false;
    int k = paramImportTableOptions.getTotalColumns();
    Object localObject3;
    int i1;
    Object localObject4;
    int i2;
    int i4;
    Cell localCell1;
    if (bool1)
    {
      localRow = paramCells.getRows().a(paramInt1, true, false, false);
      int[][] arrayOfInt1 = (int[][])null;
      localObject3 = (int[][])null;
      i1 = 0;
      localObject4 = new HashMap();
      i2 = paramInt2 + k - 1;
      int i5;
      if (localRow != null)
      {
        localObject5 = new ArrayList();
        ArrayList localArrayList = new ArrayList();
        for (i5 = 0; i5 < localRow.a(); i5++)
        {
          Cell localCell2 = localRow.getCellByIndex(i5);
          if (localCell2.getColumn() < paramInt2) {
            zf.a((ArrayList)localObject5, new int[] { localCell2.getColumn(), localCell2.s() });
          } else if (localCell2.getColumn() > i2) {
            zf.a(localArrayList, new int[] { localCell2.getColumn(), localCell2.s() });
          } else {
            ((HashMap)localObject4).put(Integer.valueOf(localCell2.getColumn()), Integer.valueOf(localCell2.s()));
          }
        }
        if (((ArrayList)localObject5).size() > 0)
        {
          arrayOfInt1 = new int[((ArrayList)localObject5).size()][];
          for (i5 = 0; i5 < ((ArrayList)localObject5).size(); i5++) {
            arrayOfInt1[i5] = ((int[])(int[])((ArrayList)localObject5).get(i5));
          }
          i1 += ((ArrayList)localObject5).size();
        }
        if (localArrayList.size() > 0)
        {
          localObject3 = new int[localArrayList.size()][];
          for (i5 = 0; i5 < localArrayList.size(); i5++) {
            localObject3[i5] = ((int[])(int[])localArrayList.get(i5));
          }
          i1 += localArrayList.size();
        }
      }
      Object localObject5 = localRow;
      i4 = paramInt1;
      j = 0;
      if (paramImportTableOptions.isFieldNameShown())
      {
        localRow = localRowCollection.a(paramInt1, k + i1);
        if (localObject5 != null) {
          localRow.a((Row)localObject5);
        }
        if (arrayOfInt1 != null) {
          for (i5 = 0; i5 < arrayOfInt1.length; i5++)
          {
            localCell1 = localRow.b(arrayOfInt1[i5][0]);
            localCell1.b(arrayOfInt1[i5][1]);
          }
        }
        String[] arrayOfString = paramICellsDataTable.getColumns();
        for (int i7 = 0; i7 < arrayOfInt.length; i7++)
        {
          localCell1 = localRow.a(paramInt2 + i7, false, false);
          Object localObject7 = ((HashMap)localObject4).get(Integer.valueOf(paramInt2 + i7));
          if (localObject7 != null) {
            localCell1.b(((Integer)localObject7).intValue());
          }
          localCell1.putValue(arrayOfString[arrayOfInt[i7]]);
        }
        if (localObject3 != null) {
          for (i7 = 0; i7 < localObject3.length; i7++)
          {
            localCell1 = localRow.b(localObject3[i7][0]);
            localCell1.b(localObject3[i7][1]);
          }
        }
        j++;
        i4++;
      }
      while ((paramICellsDataTable.next()) && (i != -1 ? j < i : i4 <= 1048575))
      {
        j++;
        localRow = localRowCollection.a(i4, k + i1);
        if (localObject5 != null) {
          localRow.a((Row)localObject5);
        }
        if (arrayOfInt1 != null) {
          for (i6 = 0; i6 < arrayOfInt1.length; i6++)
          {
            localCell1 = localRow.b(arrayOfInt1[i6][0]);
            localCell1.b(arrayOfInt1[i6][1]);
          }
        }
        for (int i6 = 0; i6 < k; i6++)
        {
          localObject2 = paramICellsDataTable.get(arrayOfInt[i6]);
          bool2 = a(localObject2);
          Object localObject6 = ((HashMap)localObject4).get(Integer.valueOf(paramInt2 + i6));
          localObject1 = paramImportTableOptions.a(i6);
          if ((!bool2) || (localObject6 != null) || (localObject1 != null))
          {
            localCell1 = localRow.b(paramInt2 + i6);
            if (localObject6 != null) {
              localCell1.b(((Integer)localObject6).intValue());
            }
            a(localCell1, localObject2, bool2, localObject1, paramImportTableOptions, i6, localHashMap);
          }
        }
        if (localObject3 != null) {
          for (i6 = 0; i6 < localObject3.length; i6++)
          {
            localCell1 = localRow.b(localObject3[i6][0]);
            localCell1.b(localObject3[i6][1]);
          }
        }
        i4++;
      }
      if (localRowCollection.getCount() > 0)
      {
        zamh localzamh = new zamh();
        localzamh.c = false;
        localzamh.a = false;
        if (paramImportTableOptions.getShiftFirstRowDown()) {
          paramCells.a(paramInt1, localRowCollection.getCount(), localzamh);
        } else {
          paramCells.a(paramInt1 + 1, localRowCollection.getCount() - 1, localzamh);
        }
        paramCells.getRows().a(-1, -1, 0, localRowCollection);
      }
    }
    else
    {
      int m = 0;
      if (paramImportTableOptions.isFieldNameShown())
      {
        localObject3 = paramICellsDataTable.getColumns();
        localRow = paramCells.getRows().a(paramInt1, false, false, false);
        for (i1 = 0; i1 < arrayOfInt.length; i1++)
        {
          localCell1 = localRow.a(paramInt2 + i1, false, true);
          localCell1.putValue(localObject3[arrayOfInt[i1]]);
        }
        paramInt1++;
        j = 1;
      }
      int n = paramInt1;
      i1 = 0;
      localObject4 = new int[] { i1 };
      paramCells.getRows().a(n, (int[])localObject4);
      i1 = localObject4[0];
      i2 = i1;
      int i3 = 0;
      while ((paramICellsDataTable.next()) && (i != -1 ? j < i : n <= 1048575))
      {
        j++;
        i3 = 0;
        if ((i1 != -1) && (i1 < paramCells.getRows().getCount()))
        {
          localRow = paramCells.getRows().getRowByIndex(i1);
          if (localRow.getIndex() == n)
          {
            m += localRow.a();
            i1++;
            localRow = localRowCollection.a(localRow);
          }
          else
          {
            localRow = localRowCollection.a(n, k);
            i3 = 1;
          }
        }
        else
        {
          localRow = localRowCollection.a(n, k);
          i3 = 1;
        }
        if (i3 != 0) {
          for (i4 = 0; i4 < k; i4++)
          {
            localObject2 = paramICellsDataTable.get(arrayOfInt[i4]);
            bool2 = a(localObject2);
            localObject1 = paramImportTableOptions.a(i4);
            if ((!bool2) || (localObject1 != null))
            {
              localCell1 = localRow.b(paramInt2 + i4);
              a(localCell1, localObject2, bool2, localObject1, paramImportTableOptions, i4, localHashMap);
            }
          }
        } else {
          for (i4 = 0; i4 < k; i4++)
          {
            localObject2 = paramICellsDataTable.get(arrayOfInt[i4]);
            bool2 = a(localObject2);
            localObject1 = paramImportTableOptions.a(i4);
            localCell1 = localRow.a(paramInt2 + i4, (bool2) && (localObject1 == null), false);
            a(localCell1, localObject2, bool2, localObject1, paramImportTableOptions, i4, localHashMap);
          }
        }
        n++;
      }
      if (localRowCollection.getCount() > 0) {
        paramCells.getRows().a(i2, i1 - 1, m, localRowCollection);
      }
    }
    return j;
  }
  
  static boolean a(Object paramObject)
  {
    if (paramObject == null) {
      return true;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 0: 
    case 2: 
      return true;
    }
    return false;
  }
  
  static void a(Cell paramCell, Object paramObject1, boolean paramBoolean, Object paramObject2, ImportTableOptions paramImportTableOptions, int paramInt, HashMap paramHashMap)
  {
    if (paramCell == null) {
      return;
    }
    if (paramBoolean)
    {
      paramCell.putValue(paramObject2);
    }
    else
    {
      boolean bool1 = paramObject1 instanceof String;
      if (paramImportTableOptions.getConvertNumericData())
      {
        if (bool1)
        {
          paramCell.putValue((String)paramObject1, true);
          if ((paramCell.getType() == 5) && (paramImportTableOptions.isHtmlString())) {
            paramCell.setHtmlString((String)paramObject1);
          }
        }
        else
        {
          paramCell.putValue(paramObject1);
        }
      }
      else if ((bool1) && (paramImportTableOptions.isHtmlString())) {
        paramCell.setHtmlString((String)paramObject1);
      } else {
        paramCell.putValue(paramObject1);
      }
    }
    Style localStyle1;
    if ((paramImportTableOptions.getNumberFormats() != null) && (paramInt < paramImportTableOptions.getNumberFormats().length) && (paramImportTableOptions.getNumberFormats()[paramInt] != null) && (!"".equals(paramImportTableOptions.getNumberFormats()[paramInt])))
    {
      localStyle1 = paramCell.o();
      localStyle1.b(paramImportTableOptions.getNumberFormats()[paramInt]);
      paramCell.a(localStyle1);
    }
    else if (zk.a(paramObject1))
    {
      if ((paramImportTableOptions.getDateFormat() != null) && (!"".equals(paramImportTableOptions.getDateFormat())))
      {
        localStyle1 = paramCell.o();
        localStyle1.b(paramImportTableOptions.getDateFormat());
        paramCell.a(localStyle1);
      }
      else
      {
        int i = paramCell.r();
        boolean bool2 = false;
        Style localStyle2;
        if (paramHashMap.get(Integer.valueOf(i)) != null)
        {
          bool2 = ((Boolean)paramHashMap.get(Integer.valueOf(i))).booleanValue();
        }
        else
        {
          localStyle2 = null;
          WorksheetCollection localWorksheetCollection = paramCell.d.p();
          localStyle2 = localWorksheetCollection.C().a(i);
          bool2 = (localStyle2.getNumber() != 0) || ((localStyle2.s() != null) && (!"".equals(localStyle2.s())));
          paramHashMap.put(Integer.valueOf(i), Boolean.valueOf(bool2));
        }
        if (!bool2)
        {
          localStyle2 = paramCell.o();
          localStyle2.setNumber(14);
          paramCell.a(localStyle2);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */