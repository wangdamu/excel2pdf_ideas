package com.aspose.cells;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;

class zva
{
  public static int a(Cells paramCells, ResultSet paramResultSet, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    throws SQLException
  {
    return a(paramCells, paramResultSet, paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, null, false);
  }
  
  public static int a(Cells paramCells, ResultSet paramResultSet, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
    throws SQLException
  {
    int[] arrayOfInt = CellsHelper.cellNameToIndex(paramString);
    return a(paramCells, paramResultSet, arrayOfInt[0], arrayOfInt[1], paramInt1, paramInt2, paramBoolean);
  }
  
  public static int a(Cells paramCells, ResultSet paramResultSet, int paramInt1, int paramInt2, boolean paramBoolean)
    throws SQLException
  {
    return a(paramCells, paramResultSet, paramInt1, paramInt2, -1, -1, paramBoolean);
  }
  
  public static int a(Cells paramCells, ResultSet paramResultSet, String paramString, boolean paramBoolean)
    throws SQLException
  {
    return a(paramCells, paramResultSet, paramString, -1, -1, paramBoolean);
  }
  
  public static int a(Cells paramCells, ResultSet paramResultSet, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, String paramString, boolean paramBoolean2)
    throws SQLException
  {
    ImportTableOptions localImportTableOptions = new ImportTableOptions();
    localImportTableOptions.setTotalRows(paramInt3);
    localImportTableOptions.setTotalColumns(paramInt4);
    localImportTableOptions.setFieldNameShown(paramBoolean1);
    if (paramString != null) {
      localImportTableOptions.setDateFormat(paramString);
    }
    ResultSetMetaData localResultSetMetaData = paramResultSet.getMetaData();
    Object[] arrayOfObject = new Object[localResultSetMetaData.getColumnCount()];
    localImportTableOptions.setDefaultValues(arrayOfObject);
    for (int i = 0; i < arrayOfObject.length; i++) {
      switch (localResultSetMetaData.getColumnType(i + 1))
      {
      case -6: 
      case -5: 
      case 4: 
      case 5: 
        arrayOfObject[i] = Integer.valueOf(0);
        break;
      case 2: 
      case 3: 
      case 6: 
      case 7: 
      case 8: 
        arrayOfObject[i] = Double.valueOf(0.0D);
        break;
      case 16: 
        arrayOfObject[i] = Boolean.FALSE;
      }
    }
    return a(paramCells, paramResultSet, paramInt1, paramInt2, localImportTableOptions);
  }
  
  public static int a(Cells paramCells, ResultSet paramResultSet, String paramString, ImportTableOptions paramImportTableOptions)
    throws SQLException
  {
    int[] arrayOfInt = CellsHelper.cellNameToIndex(paramString);
    return a(paramCells, paramResultSet, arrayOfInt[0], arrayOfInt[1], paramImportTableOptions);
  }
  
  public static int a(Cells paramCells, ResultSet paramResultSet, int paramInt1, int paramInt2, ImportTableOptions paramImportTableOptions)
    throws SQLException
  {
    int i = paramImportTableOptions.getTotalRows();
    if ((i == 0) || (paramImportTableOptions.getTotalColumns() == 0)) {
      return 0;
    }
    zamm.a(paramInt1);
    zamm.b(paramInt2);
    ResultSetMetaData localResultSetMetaData = paramResultSet.getMetaData();
    Object localObject1 = paramImportTableOptions.getColumnIndexes();
    if (localObject1 == null)
    {
      int j = paramImportTableOptions.getTotalColumns();
      if (j < 0) {
        j = localResultSetMetaData.getColumnCount();
      } else {
        j = Math.min(localResultSetMetaData.getColumnCount(), paramImportTableOptions.getTotalColumns());
      }
      if (paramInt2 + j - 1 > 16383) {
        j = 16383 - paramInt2 + 1;
      }
      localObject1 = new int[j];
      for (int k = 0; k < localObject1.length; k++) {
        localObject1[k] = k;
      }
    }
    else if (paramInt2 + localObject1.length - 1 > 16383)
    {
      localObject2 = new int[16383 - paramInt2 + 1];
      System.arraycopy(localObject1, 0, localObject2, 0, localObject2.length);
      localObject1 = localObject2;
    }
    Object localObject2 = null;
    Style localStyle1 = null;
    if (paramImportTableOptions.getNumberFormats() != null)
    {
      localObject3 = paramImportTableOptions.getNumberFormats();
      localObject2 = new Style[localObject1.length];
      for (int m = Math.min(localObject1.length, localObject3.length) - 1; m > -1; m--) {
        if (localObject3[m] != null)
        {
          Style localStyle2 = paramCells.g().getWorkbook().createStyle();
          localObject2[m] = localStyle2;
          localStyle2.setCustom(localObject3[m]);
        }
      }
    }
    else if (paramImportTableOptions.getDateFormat() != null)
    {
      localStyle1 = paramCells.g().getWorkbook().createStyle();
      localStyle1.setCustom(paramImportTableOptions.getDateFormat());
    }
    Object localObject3 = paramImportTableOptions.getDefaultValues();
    if ((localObject3 != null) && (localObject3.length < localObject1.length))
    {
      Object[] arrayOfObject = new Object[localObject1.length];
      System.arraycopy(localObject3, 0, arrayOfObject, 0, localObject3.length);
      localObject3 = arrayOfObject;
    }
    boolean bool1 = paramImportTableOptions.getConvertNumericData();
    boolean bool2 = paramImportTableOptions.getConvertGridStyle();
    RowCollection localRowCollection = paramCells.getRows();
    if (paramImportTableOptions.isFieldNameShown())
    {
      Row localRow1 = localRowCollection.get(paramInt1);
      for (int i1 = 0; i1 < localObject1.length; i1++)
      {
        Cell localCell1 = localRow1.get(paramInt2 + i1);
        localCell1.setValue(localResultSetMetaData.getColumnName(i1 + 1));
      }
      paramInt1++;
    }
    int n = 0;
    while ((paramResultSet.next()) && (paramInt1 <= 1048575) && ((i <= 0) || (n != i)))
    {
      Row localRow2 = localRowCollection.get(paramInt1);
      for (int i2 = 0; i2 < localObject1.length; i2++)
      {
        Cell localCell2 = localRow2.get(paramInt2 + i2);
        int i3 = localObject1[i2] + 1;
        Object localObject4 = null;
        int i4 = 1;
        int i5 = 1;
        Object localObject5;
        switch (localResultSetMetaData.getColumnType(i3))
        {
        case 0: 
          localObject4 = null;
          break;
        case -6: 
        case -5: 
        case 4: 
        case 5: 
          int i6 = paramResultSet.getInt(i3);
          if (i6 != 0) {
            localObject4 = Integer.valueOf(i6);
          } else {
            localObject4 = paramResultSet.getObject(i3);
          }
          break;
        case 2: 
        case 3: 
        case 6: 
        case 7: 
        case 8: 
          double d = paramResultSet.getDouble(i3);
          if (d != 0.0D) {
            localObject4 = Double.valueOf(d);
          } else {
            localObject4 = paramResultSet.getObject(i3);
          }
          break;
        case 16: 
          boolean bool3 = paramResultSet.getBoolean(i3);
          if (bool3) {
            localObject4 = Boolean.TRUE;
          } else {
            localObject4 = paramResultSet.getObject(i3);
          }
          break;
        case 91: 
        case 92: 
        case 93: 
          Timestamp localTimestamp = paramResultSet.getTimestamp(i3);
          if (localTimestamp != null)
          {
            localObject5 = Calendar.getInstance();
            ((Calendar)localObject5).setTime(localTimestamp);
            localObject4 = localObject5;
          }
          if ((localObject2 != null) && (localObject2[i2] != null)) {
            localCell2.setStyle(localObject2[i2]);
          } else if (localStyle1 != null) {
            localCell2.setStyle(localStyle1);
          }
          i4 = 0;
          break;
        default: 
          if (bool1)
          {
            i4 = 0;
            i5 = 0;
            localObject5 = paramResultSet.getString(i3);
            if ((localObject2 != null) && (localObject2[i2] != null)) {
              localCell2.setStyle(localObject2[i2]);
            }
            localCell2.putValue((String)localObject5, true, bool2);
          }
          else
          {
            localObject4 = paramResultSet.getString(i3);
          }
          break;
        }
        if (i5 != 0) {
          if (localObject4 != null) {
            localCell2.setValue(localObject4);
          } else if ((localObject3 != null) && (localObject3[i2] != null)) {
            localCell2.setValue(localObject3[i2]);
          } else {
            localCell2.f();
          }
        }
        if ((i4 != 0) && (localObject2 != null) && (localObject2[i2] != null)) {
          localCell2.setStyle(localObject2[i2]);
        }
      }
      n++;
      paramInt1++;
    }
    return n;
  }
  
  public static int a(Cells paramCells, ResultSet paramResultSet, int paramInt1, int paramInt2, boolean paramBoolean1, String paramString, boolean paramBoolean2)
    throws SQLException
  {
    return a(paramCells, paramResultSet, paramInt1, paramInt2, -1, -1, paramBoolean1, paramString, paramBoolean2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */