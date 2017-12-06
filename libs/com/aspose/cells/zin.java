package com.aspose.cells;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

class zin
  implements ICellsDataTable
{
  String[] a;
  ResultSet b;
  int c;
  int d;
  
  zin(ResultSet paramResultSet, int paramInt)
  {
    try
    {
      this.b = paramResultSet;
      this.c = paramResultSet.getRow();
      ResultSetMetaData localResultSetMetaData = paramResultSet.getMetaData();
      this.a = new String[localResultSetMetaData.getColumnCount()];
      for (int i = 1; i <= this.a.length; i++) {
        this.a[(i - 1)] = localResultSetMetaData.getColumnName(i);
      }
      if (paramInt == -1) {
        if (paramResultSet.getType() != 1003)
        {
          paramResultSet.last();
          paramInt = paramResultSet.getRow() - this.c + 1;
          if (this.c == 0) {
            paramResultSet.beforeFirst();
          } else {
            paramResultSet.relative(-paramInt + 1);
          }
        }
        else
        {
          paramInt = 0;
        }
      }
      this.d = paramInt;
    }
    catch (Exception localException)
    {
      throw new CellsException(6, "Invalid result set");
    }
  }
  
  public String[] getColumns()
  {
    return this.a;
  }
  
  public int getCount()
  {
    return this.d;
  }
  
  public void beforeFirst()
  {
    try
    {
      if (this.b.getType() != 1003)
      {
        int i = this.b.getRow() - this.c;
        if (this.c == 0) {
          this.b.beforeFirst();
        } else {
          this.b.relative(-i);
        }
      }
    }
    catch (Exception localException) {}
  }
  
  public Object get(int index)
  {
    try
    {
      return this.b.getObject(index + 1);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public Object get(String columnName)
  {
    try
    {
      return this.b.getObject(columnName);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public boolean next()
  {
    try
    {
      return this.b.next();
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */