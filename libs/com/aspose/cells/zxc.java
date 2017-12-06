package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

class zxc
{
  private WorksheetCollection a;
  private ReplaceOptions b;
  
  zxc(WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramWorksheetCollection;
    this.b = new ReplaceOptions();
    this.b.setCaseSensitive(true);
  }
  
  zxc(WorksheetCollection paramWorksheetCollection, ReplaceOptions paramReplaceOptions)
  {
    this.a = paramWorksheetCollection;
    this.b = paramReplaceOptions;
  }
  
  int a(boolean paramBoolean, Object paramObject)
  {
    int i = 0;
    for (int j = 0; j < this.a.getCount(); j++)
    {
      RowCollection localRowCollection = this.a.get(j).getCells().getRows();
      for (int k = 0; k < localRowCollection.getCount(); k++)
      {
        Row localRow = localRowCollection.getRowByIndex(k);
        for (int m = 0; m < localRow.a(); m++)
        {
          Cell localCell = localRow.getCellByIndex(m);
          if ((localCell.c.c == 2) && (localCell.getBoolValue() == paramBoolean))
          {
            localCell.putValue(paramObject);
            i++;
          }
        }
      }
    }
    return i;
  }
  
  int a(int paramInt, Object paramObject)
  {
    int i = 0;
    for (int j = 0; j < this.a.getCount(); j++)
    {
      RowCollection localRowCollection = this.a.get(j).getCells().getRows();
      for (int k = 0; k < localRowCollection.getCount(); k++)
      {
        Row localRow = localRowCollection.getRowByIndex(k);
        for (int m = 0; m < localRow.a(); m++)
        {
          Cell localCell = localRow.getCellByIndex(m);
          if ((localCell.c.f()) && (localCell.getIntValue() == paramInt))
          {
            i++;
            localCell.putValue(paramObject);
          }
        }
      }
    }
    return i;
  }
  
  int a(String paramString1, String paramString2)
  {
    if (!this.b.getCaseSensitive()) {
      paramString1 = paramString1.toUpperCase();
    }
    int i = 0;
    for (int j = 0; j < this.a.getCount(); j++)
    {
      RowCollection localRowCollection = this.a.get(j).getCells().getRows();
      for (int k = 0; k < localRowCollection.getCount(); k++)
      {
        Row localRow = localRowCollection.getRowByIndex(k);
        for (int m = 0; m < localRow.a(); m++)
        {
          Cell localCell = localRow.getCellByIndex(m);
          if (localCell.c.c == 4)
          {
            String str1 = localCell.k();
            if (this.b.getMatchEntireCellContents())
            {
              if (zy.a(str1, paramString1, !this.b.getCaseSensitive()))
              {
                localCell.putValue(paramString2);
                i++;
              }
            }
            else if (this.b.getCaseSensitive())
            {
              if (str1.indexOf(paramString1) != -1)
              {
                localCell.putValue(zw.a(str1, paramString1, paramString2));
                i++;
              }
            }
            else
            {
              String str2 = str1.toUpperCase();
              if (str2.indexOf(paramString1) != -1)
              {
                StringBuilder localStringBuilder = new StringBuilder();
                int i1;
                for (int n = 0;; n = i1 + paramString1.length())
                {
                  i1 = str2.indexOf(paramString1, n);
                  if (i1 == -1)
                  {
                    localStringBuilder.append(str1.substring(n));
                    break;
                  }
                  localStringBuilder.append(str1.substring(n, n + (i1 - n)));
                  localStringBuilder.append(paramString2);
                }
                i++;
                localCell.putValue(zs.a(localStringBuilder));
              }
            }
          }
        }
      }
    }
    return i;
  }
  
  int a(String paramString, int paramInt)
  {
    int i = 0;
    for (int j = 0; j < this.a.getCount(); j++)
    {
      RowCollection localRowCollection = this.a.get(j).getCells().getRows();
      for (int k = 0; k < localRowCollection.getCount(); k++)
      {
        Row localRow = localRowCollection.getRowByIndex(k);
        for (int m = 0; m < localRow.a(); m++)
        {
          Cell localCell = localRow.getCellByIndex(m);
          if ((localCell.c.c == 4) && (zw.b(localCell.k(), paramString)))
          {
            i++;
            localCell.putValue(paramInt);
          }
        }
      }
    }
    return i;
  }
  
  int a(String paramString, double paramDouble)
  {
    int i = 0;
    for (int j = 0; j < this.a.getCount(); j++)
    {
      RowCollection localRowCollection = this.a.get(j).getCells().getRows();
      for (int k = 0; k < localRowCollection.getCount(); k++)
      {
        Row localRow = localRowCollection.getRowByIndex(k);
        for (int m = 0; m < localRow.a(); m++)
        {
          Cell localCell = localRow.getCellByIndex(m);
          if ((localCell.c.c == 4) && (zw.b(localCell.k(), paramString)))
          {
            i++;
            localCell.putValue(paramDouble);
          }
        }
      }
    }
    return i;
  }
  
  public int a(String paramString, double[] paramArrayOfDouble, boolean paramBoolean)
  {
    int m = 0;
    for (int n = 0; n < this.a.getCount(); n++)
    {
      RowCollection localRowCollection = this.a.get(n).getCells().getRows();
      Cells localCells = this.a.get(n).getCells();
      for (int i1 = 0; i1 < localRowCollection.getCount(); i1++)
      {
        Row localRow = localRowCollection.getRowByIndex(i1);
        for (int i2 = 0; i2 < localRow.a(); i2++)
        {
          Cell localCell = localRow.getCellByIndex(i2);
          if ((localCell.c.c == 4) && (zw.b(localCell.k(), paramString)))
          {
            m++;
            localCell.putValue(paramArrayOfDouble[0]);
            int k = localCell.s();
            int i;
            int j;
            int i3;
            if (paramBoolean)
            {
              i = localCell.getRow() + 1;
              j = localCell.getColumn();
              for (i3 = i; i3 < i + paramArrayOfDouble.length - 1; i3++) {
                if (i3 <= 16384)
                {
                  localCell = localCells.a(i3, j, false);
                  localCell.putValue(paramArrayOfDouble[(i3 - i + 1)]);
                  if (localCell.s() == -1) {
                    localCell.b(k);
                  }
                }
              }
            }
            else
            {
              i = localCell.getRow();
              if (localCell.getColumn() < 255)
              {
                j = (byte)(localCell.getColumn() + 1) & 0xFF;
                for (i3 = j; i3 < j + paramArrayOfDouble.length - 1; i3++) {
                  if (i3 <= 255)
                  {
                    localCell = localCells.a(i, i3, false);
                    localCell.putValue(paramArrayOfDouble[(i3 - j + 1)]);
                    if (localCell.s() == -1) {
                      localCell.b(k);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return m;
  }
  
  public int a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int m = 0;
    for (int n = 0; n < this.a.getCount(); n++)
    {
      RowCollection localRowCollection = this.a.get(n).getCells().getRows();
      Cells localCells = this.a.get(n).getCells();
      for (int i1 = 0; i1 < localRowCollection.getCount(); i1++)
      {
        Row localRow = localRowCollection.getRowByIndex(i1);
        for (int i2 = 0; i2 < localRow.a(); i2++)
        {
          Cell localCell = localRow.getCellByIndex(i2);
          if ((localCell.c.c == 4) && (zw.b(localCell.k(), paramString)))
          {
            m++;
            localCell.putValue(paramArrayOfInt[0]);
            int k = localCell.s();
            int i;
            int j;
            int i3;
            if (paramBoolean)
            {
              i = localCell.getRow() + 1;
              j = localCell.getColumn();
              for (i3 = i; i3 < i + paramArrayOfInt.length - 1; i3++) {
                if (i3 <= 16384)
                {
                  localCell = localCells.a(i3, j, false);
                  localCell.putValue(paramArrayOfInt[(i3 - i + 1)]);
                  if (localCell.s() == -1) {
                    localCell.b(k);
                  }
                }
              }
            }
            else
            {
              i = localCell.getRow();
              if (localCell.getColumn() < 255)
              {
                j = (byte)(localCell.getColumn() + 1) & 0xFF;
                for (i3 = j; i3 < j + paramArrayOfInt.length - 1; i3++) {
                  if (i3 <= 255)
                  {
                    localCell = localCells.a(i, i3, false);
                    localCell.putValue(paramArrayOfInt[(i3 - j + 1)]);
                    if (localCell.s() == -1) {
                      localCell.b(k);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return m;
  }
  
  int a(String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    int m = 0;
    for (int n = 0; n < this.a.getCount(); n++)
    {
      RowCollection localRowCollection = this.a.get(n).getCells().getRows();
      Cells localCells = this.a.get(n).getCells();
      for (int i1 = 0; i1 < localRowCollection.getCount(); i1++)
      {
        Row localRow = localRowCollection.getRowByIndex(i1);
        for (int i2 = 0; i2 < localRow.a(); i2++)
        {
          Cell localCell = localRow.getCellByIndex(i2);
          if ((localCell.c.c == 4) && (zw.b(localCell.k(), paramString)))
          {
            m++;
            if (paramArrayOfString[0] == null) {
              return 0;
            }
            localCell.putValue(paramArrayOfString[0]);
            int k = localCell.s();
            int i;
            int j;
            int i3;
            if (paramBoolean)
            {
              i = localCell.getRow() + 1;
              j = localCell.getColumn();
              for (i3 = i; i3 < i + paramArrayOfString.length - 1; i3++) {
                if (i3 <= 16384)
                {
                  localCell = localCells.a(i3, j, false);
                  if (paramArrayOfString[(i3 - i + 1)] == null) {
                    return 0;
                  }
                  localCell.putValue(paramArrayOfString[(i3 - i + 1)]);
                  if (localCell.s() == -1) {
                    localCell.b(k);
                  }
                }
              }
            }
            else
            {
              i = localCell.getRow();
              if (localCell.getColumn() < 255)
              {
                j = (byte)(localCell.getColumn() + 1) & 0xFF;
                for (i3 = j; i3 < j + paramArrayOfString.length - 1; i3++) {
                  if (i3 <= 255)
                  {
                    localCell = localCells.a(i, i3, false);
                    if (paramArrayOfString[(i3 - j + 1)] == null) {
                      return 0;
                    }
                    localCell.putValue(paramArrayOfString[(i3 - j + 1)]);
                    if (localCell.s() == -1) {
                      localCell.b(k);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return m;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */