package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutoFilter
{
  CellArea a;
  boolean b = false;
  FilterColumnCollection c;
  Object d;
  private Worksheet e;
  private DataSorter f;
  private String g;
  
  Worksheet a()
  {
    return this.e;
  }
  
  AutoFilter(Worksheet sheet, Object parent)
  {
    this.e = sheet;
    this.a = new CellArea();
    this.d = parent;
    this.c = new FilterColumnCollection(this);
  }
  
  CellArea b()
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (this.a.StartRow + 1);
    localCellArea.EndRow = this.e.getCells().getMaxRow();
    localCellArea.StartColumn = this.a.StartColumn;
    localCellArea.EndColumn = this.a.EndColumn;
    if (this.d != null)
    {
      Object localObject;
      if ((this.d instanceof ListObject))
      {
        localObject = (ListObject)this.d;
        localCellArea.StartRow = (((ListObject)localObject).getStartRow() + (((ListObject)localObject).getShowHeaderRow() ? 1 : 0));
        localCellArea.EndRow = ((ListObject)localObject).getEndRow();
        if (((ListObject)localObject).f()) {
          localCellArea.EndRow -= 1;
        }
      }
      else if ((this.d instanceof PivotTable))
      {
        localObject = (PivotTable)this.d;
        localCellArea.StartRow = ((PivotTable)localObject).n;
        localCellArea.EndRow = ((PivotTable)localObject).j;
      }
    }
    return localCellArea;
  }
  
  DataSorter c()
  {
    return this.f;
  }
  
  public DataSorter getSorter()
  {
    if (this.f == null) {
      this.f = new DataSorter(this);
    }
    return this.f;
  }
  
  void a(AutoFilter paramAutoFilter)
  {
    this.g = paramAutoFilter.g;
    if (this.g != null)
    {
      this.a = CellArea.d(paramAutoFilter.a);
      this.c.a(paramAutoFilter.c);
    }
  }
  
  public void setRange(int row, int startColumn, int endColumn)
  {
    a(row, row, startColumn, endColumn);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g = CellsHelper.a(paramInt1, paramInt3, paramInt2, paramInt4);
    this.a.StartRow = paramInt1;
    this.a.EndRow = paramInt2;
    this.a.StartColumn = paramInt3;
    this.a.EndColumn = paramInt4;
  }
  
  public String getRange()
  {
    return this.g;
  }
  
  public void setRange(String value)
  {
    this.g = value;
    if ((value != null) && (!"".equals(value))) {
      j();
    } else {
      this.c.clear();
    }
  }
  
  void d()
  {
    if ((this.g == null) || ("".equals(this.g))) {
      return;
    }
    int i = this.a.StartRow;
    zapd localzapd = this.e.getCells().o();
    for (int j = this.a.StartColumn; j <= this.a.EndColumn; j++) {
      for (int k = 0; k < localzapd.getCount(); k++)
      {
        CellArea localCellArea = localzapd.a(k);
        if ((i >= localCellArea.StartRow) && (i <= localCellArea.EndRow) && (j >= localCellArea.StartColumn) && (j <= localCellArea.EndColumn))
        {
          int m = localCellArea.EndColumn;
          if (localCellArea.EndColumn > this.a.EndColumn) {
            m = this.a.EndColumn;
          }
          int n = localCellArea.StartColumn;
          if (localCellArea.StartColumn < this.a.StartColumn) {
            n = this.a.StartColumn;
          }
          for (int i1 = n; i1 < m; i1++)
          {
            FilterColumn localFilterColumn = getFilterColumns().get(i1 - this.a.StartColumn);
            localFilterColumn.b(false);
          }
          j = localCellArea.EndColumn;
          break;
        }
      }
    }
  }
  
  void a(Name paramName)
  {
    Range localRange = paramName.getRange();
    if (localRange == null) {
      return;
    }
    this.a.e(localRange.a());
    this.g = CellsHelper.a(this.a.StartRow, this.a.StartColumn, this.a.EndRow, this.a.EndColumn);
  }
  
  public void addFilter(int fieldIndex, String criteria)
  {
    if ((fieldIndex < 0) || (fieldIndex > this.a.EndColumn - this.a.StartColumn)) {
      throw new CellsException(6, "Field index is out of range.");
    }
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.b(criteria);
    this.b = true;
  }
  
  public void addDateFilter(int fieldIndex, int dateTimeGroupingType, int year, int month, int day, int hour, int minute, int second)
  {
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.b(fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second);
    this.b = true;
  }
  
  public void removeDateFilter(int fieldIndex, int dateTimeGroupingType, int year, int month, int day, int hour, int minute, int second)
  {
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second);
    this.b = true;
  }
  
  public void removeFilter(int fieldIndex, String criteria)
  {
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(criteria);
    this.b = true;
  }
  
  public void filter(int fieldIndex, String criteria)
  {
    if ((fieldIndex < 0) || (fieldIndex > this.a.EndColumn - this.a.StartColumn)) {
      throw new CellsException(6, "Field index is out of range.");
    }
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.c(criteria);
    this.b = true;
  }
  
  public void filterTop10(int fieldIndex, boolean isTop, boolean isPercent, int itemCount)
  {
    if ((fieldIndex < 0) || (fieldIndex > this.a.EndColumn - this.a.StartColumn)) {
      throw new CellsException(6, "Field index is out of range.");
    }
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(isTop, isPercent, itemCount);
    this.b = true;
  }
  
  public void dynamicFilter(int fieldIndex, int dynamicFilterType)
  {
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(dynamicFilterType);
    this.b = true;
  }
  
  public void addFontColorFilter(int fieldIndex, CellsColor color)
  {
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(color);
    this.b = true;
  }
  
  public void addFillColorFilter(int fieldIndex, int pattern, CellsColor foregroundColor, CellsColor backgroundColor)
  {
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(pattern, foregroundColor, backgroundColor);
    this.b = true;
  }
  
  public void addIconFilter(int fieldIndex, int iconSetType, int iconId)
  {
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(iconSetType, iconId);
    this.b = true;
  }
  
  public void matchBlanks(int fieldIndex)
  {
    if ((fieldIndex < 0) || (fieldIndex > this.a.EndColumn - this.a.StartColumn)) {
      throw new CellsException(6, "Field index is out of range.");
    }
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.d();
    this.b = true;
  }
  
  public void matchNonBlanks(int fieldIndex)
  {
    if ((fieldIndex < 0) || (fieldIndex > this.a.EndColumn - this.a.StartColumn)) {
      throw new CellsException(6, "Field index is out of range.");
    }
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.e();
    this.b = true;
  }
  
  public void custom(int fieldIndex, int operatorType1, Object criteria1)
  {
    if (criteria1 == null) {
      throw new CellsException(6, "The custom criteria of auto filter could not be null");
    }
    custom(fieldIndex, operatorType1, criteria1, false, 6, null);
    this.b = true;
  }
  
  public void custom(int fieldIndex, int operatorType1, Object criteria1, boolean isAnd, int operatorType2, Object criteria2)
  {
    if ((fieldIndex < 0) || (fieldIndex > this.a.EndColumn - this.a.StartColumn)) {
      throw new CellsException(6, "Field index is out of range.");
    }
    if ((operatorType2 != 6) && (criteria2 == null)) {
      throw new CellsException(6, "The custom criteria of auto filter could not be null");
    }
    FilterColumn localFilterColumn = this.c.get(fieldIndex);
    localFilterColumn.a(operatorType1, criteria1, isAnd, operatorType2, criteria2);
    this.b = true;
  }
  
  public void showAll()
  {
    this.c.clear();
    Cells localCells = this.e.getCells();
    for (int i = 0; i < localCells.getRows().getCount(); i++)
    {
      Row localRow = localCells.getRows().getRowByIndex(i);
      if (localRow.isHidden()) {
        localRow.setHidden(false);
      }
    }
  }
  
  public void removeFilter(int fieldIndex)
  {
    for (int i = 0; i < this.c.getCount(); i++)
    {
      FilterColumn localFilterColumn = this.c.getByIndex(i);
      if (localFilterColumn.getFieldIndex() == fieldIndex)
      {
        this.c.removeAt(i);
        return;
      }
    }
  }
  
  boolean a(Object paramObject)
  {
    for (int i = 0; i < this.c.getCount(); i++)
    {
      FilterColumn localFilterColumn = this.c.getByIndex(i);
      if (!localFilterColumn.a(paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public void refresh()
  {
    if (this.c.getCount() == 0) {
      return;
    }
    Cells localCells = this.e.getCells();
    int i = this.a.StartRow + 1;
    int j = 0;
    int k = this.a.StartColumn;
    int m = localCells.getMaxDataRow();
    if (m == -1) {
      m = 0;
    }
    int n = this.a.EndRow;
    int i1 = this.a.EndRow;
    Object localObject1;
    for (int i2 = 0; i2 < localCells.getRows().getCount(); i2++)
    {
      localObject1 = localCells.getRows().getRowByIndex(i2);
      if (((Row)localObject1).getIndex() >= i)
      {
        if (((Row)localObject1).getIndex() > m) {
          break;
        }
        if ((((Row)localObject1).g() == 0.0D) || (((Row)localObject1).isHidden())) {
          localCells.unhideRow(((Row)localObject1).getIndex(), localCells.getStandardHeight());
        }
        if ((((Row)localObject1).getIndex() > n) && (!((Row)localObject1).isBlank()))
        {
          if (n + 1 == ((Row)localObject1).getIndex()) {
            i1 = ((Row)localObject1).getIndex();
          }
          n = ((Row)localObject1).getIndex();
        }
      }
    }
    Object localObject2;
    for (i2 = 0; i2 < this.c.getCount(); i2++)
    {
      localObject1 = this.c.getByIndex(i2);
      switch (((FilterColumn)localObject1).getFilterType())
      {
      case 2: 
        ((DynamicFilter)((FilterColumn)localObject1).getFilter()).a(localCells, k + ((FilterColumn)localObject1).getFieldIndex(), i, i1);
        break;
      }
      if (((FilterColumn)localObject1).getFilterType() == 5)
      {
        j = k + ((FilterColumn)localObject1).getFieldIndex();
        localObject2 = new zd();
        int i4 = 0;
        for (i = this.a.StartRow + 1; i <= i1; i++)
        {
          localObject3 = localCells.checkCell(i, j);
          if (localObject3 == null)
          {
            localCells.hideRow(i);
          }
          else if ((((Cell)localObject3).getType() == 4) || (((Cell)localObject3).getType() == 1))
          {
            i4++;
            double d1 = ((Cell)localObject3).getDoubleValue();
            ArrayList localArrayList1 = (ArrayList)((zd)localObject2).d(Double.valueOf(d1));
            if (localArrayList1 == null)
            {
              localArrayList1 = new ArrayList();
              ((zd)localObject2).b(Double.valueOf(d1), localArrayList1);
            }
            zf.a(localArrayList1, Integer.valueOf(i));
          }
        }
        Object localObject3 = (Top10Filter)((FilterColumn)localObject1).getFilter();
        boolean bool1 = ((Top10Filter)localObject3).isTop();
        boolean bool2 = ((Top10Filter)localObject3).isPercent();
        int i5 = ((Top10Filter)localObject3).getItems();
        if (bool2) {
          i5 = i4 * i5 / 100;
        }
        List localList;
        int i6;
        int i7;
        ArrayList localArrayList2;
        Iterator localIterator;
        int i8;
        if (!bool1)
        {
          localList = ((zd)localObject2).e();
          i6 = 0;
          i7 = 0;
          for (i7 = 0; i7 < ((zd)localObject2).b(); i7++)
          {
            localArrayList2 = (ArrayList)localList.get(i7);
            i6 += localArrayList2.size();
            if (i6 >= i5)
            {
              i7++;
              ((Top10Filter)localObject3).setCriteria(Double.valueOf(localCells.a(((Integer)localArrayList2.get(0)).intValue(), j, false).getDoubleValue()));
              break;
            }
          }
          while (i7 < localList.size())
          {
            localArrayList2 = (ArrayList)localList.get(i7);
            localIterator = localArrayList2.iterator();
            while (localIterator.hasNext())
            {
              i8 = ((Integer)localIterator.next()).intValue();
              localCells.hideRow(i8);
            }
            i7++;
          }
        }
        else
        {
          localList = ((zd)localObject2).e();
          i6 = 0;
          i7 = 0;
          for (i7 = ((zd)localObject2).b() - 1; i7 >= 0; i7--)
          {
            localArrayList2 = (ArrayList)localList.get(i7);
            i6 += localArrayList2.size();
            if (i6 > i5)
            {
              i7--;
              ((Top10Filter)localObject3).setCriteria(Double.valueOf(localCells.a(((Integer)localArrayList2.get(0)).intValue(), j, false).getDoubleValue()));
              break;
            }
          }
          while (i7 >= 0)
          {
            localArrayList2 = (ArrayList)localList.get(i7);
            localIterator = localArrayList2.iterator();
            while (localIterator.hasNext())
            {
              i8 = ((Integer)localIterator.next()).intValue();
              localCells.hideRow(i8);
            }
            i7--;
          }
        }
      }
    }
    for (i = this.a.StartRow + 1; i <= i1; i++)
    {
      i2 = localCells.getRows().d(i);
      if (i2 != -1)
      {
        localObject1 = localCells.getRows().getRowByIndex(i2);
        if ((((Row)localObject1).isHidden()) || (((Row)localObject1).g() == 0.0D)) {}
      }
      else
      {
        for (int i3 = 0; i3 < this.c.getCount(); i3++)
        {
          localObject2 = this.c.getByIndex(i3);
          if (((FilterColumn)localObject2).getFilterType() != 5)
          {
            j = k + ((FilterColumn)localObject2).getFieldIndex();
            Cell localCell = localCells.checkCell(i, j);
            if (!((FilterColumn)localObject2).a(localCell, i, j))
            {
              localCells.hideRow(i);
              break;
            }
          }
        }
      }
    }
    this.b = false;
  }
  
  public FilterColumnCollection getFilterColumns()
  {
    if (this.c == null) {
      this.c = new FilterColumnCollection(this);
    }
    return this.c;
  }
  
  boolean e()
  {
    return (this.c != null) && (this.c.getCount() > 0);
  }
  
  int f()
  {
    if ((this.g == null) || ("".equals(this.g))) {
      return 0;
    }
    int i = this.a.EndColumn - this.a.StartColumn + 1;
    int j = this.a.StartRow;
    zapd localzapd = this.e.getCells().o();
    for (int k = this.a.StartColumn; k <= this.a.EndColumn; k++) {
      for (int m = 0; m < localzapd.getCount(); m++)
      {
        CellArea localCellArea = localzapd.a(m);
        if ((j >= localCellArea.StartRow) && (j <= localCellArea.EndRow) && (k >= localCellArea.StartColumn) && (k <= localCellArea.EndColumn))
        {
          int n = localCellArea.EndColumn;
          if (localCellArea.EndColumn > this.a.EndColumn) {
            n = this.a.EndColumn;
          }
          int i1 = localCellArea.StartColumn;
          if (localCellArea.StartColumn < this.a.StartColumn) {
            i1 = this.a.StartColumn;
          }
          i -= n - i1;
          k = localCellArea.EndColumn;
          break;
        }
      }
    }
    return i;
  }
  
  int g()
  {
    if ((this.g == null) || ("".equals(this.g))) {
      return 0;
    }
    return this.a.EndColumn - this.a.StartColumn + 1;
  }
  
  int h()
  {
    return this.a.StartRow;
  }
  
  CellArea i()
  {
    return this.a;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    CellArea localCellArea = this.a;
    if ((paramInt2 < 0) && (localCellArea.StartRow >= paramInt1) && (localCellArea.StartRow <= paramInt1 - paramInt2 - 1))
    {
      this.g = null;
      showAll();
      return;
    }
    int i = 0;
    boolean[] arrayOfBoolean = { i };
    localCellArea = zban.a(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
    i = arrayOfBoolean[0];
    if (i != 0)
    {
      this.g = null;
      showAll();
      return;
    }
    this.a = localCellArea;
    this.g = CellsHelper.a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
  }
  
  void b(int paramInt1, int paramInt2)
  {
    CellArea localCellArea = this.a;
    int i;
    int j;
    if (paramInt2 > 0)
    {
      if (paramInt1 <= this.a.StartColumn)
      {
        localCellArea.StartColumn += paramInt2;
        localCellArea.EndColumn += paramInt2;
        this.a = localCellArea;
        this.g = CellsHelper.a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
      }
      else if (paramInt1 <= this.a.EndColumn)
      {
        localCellArea.EndColumn += paramInt2;
        this.a = localCellArea;
        this.g = CellsHelper.a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
        i = paramInt1 - localCellArea.StartColumn;
        for (j = 0; j < this.c.getCount(); j++)
        {
          FilterColumn localFilterColumn1 = this.c.getByIndex(j);
          if (localFilterColumn1.getFieldIndex() >= i) {
            localFilterColumn1.setFieldIndex(localFilterColumn1.getFieldIndex() + paramInt2);
          }
        }
      }
    }
    else
    {
      i = 0;
      j = paramInt1 - paramInt2 - 1;
      int k;
      int m;
      if (paramInt1 <= this.a.StartColumn)
      {
        if (j < this.a.StartColumn)
        {
          localCellArea.StartColumn += paramInt2;
          localCellArea.EndColumn += paramInt2;
          this.a = localCellArea;
          this.g = CellsHelper.a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
        }
        else if (j <= this.a.EndColumn)
        {
          k = j - localCellArea.StartColumn;
          localCellArea.StartColumn = paramInt1;
          localCellArea.EndColumn += paramInt2;
          this.a = localCellArea;
          this.g = CellsHelper.a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
          this.b = true;
          for (m = 0; m < this.c.getCount(); m++)
          {
            FilterColumn localFilterColumn2 = this.c.getByIndex(m);
            if (localFilterColumn2.getFieldIndex() <= k)
            {
              this.c.removeAt(m--);
              i = 1;
            }
            else
            {
              localFilterColumn2.setFieldIndex(localFilterColumn2.getFieldIndex() + paramInt2);
            }
          }
        }
        else
        {
          this.g = null;
        }
      }
      else if (paramInt1 < this.a.EndColumn) {
        if (j < this.a.EndColumn)
        {
          k = paramInt1 - localCellArea.StartColumn;
          m = k - paramInt2 - 1;
          localCellArea.EndColumn += paramInt2;
          this.a = localCellArea;
          this.g = CellsHelper.a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
          for (int n = 0; n < this.c.getCount(); n++)
          {
            FilterColumn localFilterColumn4 = this.c.getByIndex(n);
            if (localFilterColumn4.getFieldIndex() >= k) {
              if (localFilterColumn4.getFieldIndex() <= m) {
                this.c.removeAt(n--);
              } else {
                localFilterColumn4.setFieldIndex(localFilterColumn4.getFieldIndex() + paramInt2);
              }
            }
          }
        }
        else
        {
          k = paramInt1 - localCellArea.StartColumn;
          localCellArea.EndColumn += j - 1;
          this.a = localCellArea;
          this.g = CellsHelper.a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
          for (m = 0; m < this.c.getCount(); m++)
          {
            FilterColumn localFilterColumn3 = this.c.getByIndex(m);
            if (localFilterColumn3.getFieldIndex() >= k) {
              this.c.removeAt(m--);
            }
          }
        }
      }
      if ((i != 0) && (this.c.getCount() == 0)) {
        showAll();
      }
    }
  }
  
  private void j()
  {
    if ((this.g == null) || ("".equals(this.g))) {
      throw new CellsException(6, "Range of AutoFilter is not set.");
    }
    int i = 0;
    int j = 0;
    int[] arrayOfInt2;
    if (this.g.indexOf(':') == -1)
    {
      try
      {
        int[] arrayOfInt1 = { i };
        arrayOfInt2 = new int[] { j };
        CellsHelper.a(zw.a(this.g, "$", ""), arrayOfInt1, arrayOfInt2);
        i = arrayOfInt1[0];
        j = arrayOfInt2[0];
        this.a.StartColumn = j;
        this.a.EndColumn = j;
        this.a.StartRow = i;
        this.a.EndRow = i;
      }
      catch (Exception localException1)
      {
        throw new CellsException(6, "Range of AutoFilter is not valid.");
      }
    }
    else
    {
      String[] arrayOfString = zw.d(this.g, ':');
      if (arrayOfString.length != 2) {
        throw new CellsException(6, "Range of AutoFilter is not valid.");
      }
      try
      {
        arrayOfInt2 = new int[] { i };
        int[] arrayOfInt3 = { j };
        CellsHelper.a(zw.a(arrayOfString[0], "$", ""), arrayOfInt2, arrayOfInt3);
        i = arrayOfInt2[0];
        j = arrayOfInt3[0];
        this.a.StartColumn = j;
        this.a.StartRow = i;
        arrayOfInt2[0] = i;
        arrayOfInt3[0] = j;
        CellsHelper.a(zw.a(arrayOfString[1], "$", ""), arrayOfInt2, arrayOfInt3);
        i = arrayOfInt2[0];
        j = arrayOfInt3[0];
        this.a.EndColumn = j;
        this.a.EndRow = i;
      }
      catch (Exception localException2)
      {
        throw new CellsException(6, "Range of AutoFilter is not valid.");
      }
      if (this.a.StartRow > this.a.EndRow)
      {
        if (this.a.StartColumn >= this.a.EndColumn)
        {
          i = this.a.StartRow;
          this.a.StartRow = this.a.EndRow;
          this.a.EndRow = i;
          j = this.a.StartColumn;
          this.a.StartColumn = this.a.EndColumn;
          this.a.EndColumn = j;
        }
        else
        {
          i = this.a.StartRow;
          this.a.StartRow = this.a.EndRow;
          this.a.EndRow = i;
        }
      }
      else if (this.a.StartRow == this.a.EndRow)
      {
        if (this.a.StartColumn > this.a.EndColumn)
        {
          j = this.a.StartColumn;
          this.a.StartColumn = this.a.EndColumn;
          this.a.EndColumn = j;
        }
      }
      else if (this.a.StartColumn > this.a.EndColumn)
      {
        j = this.a.StartColumn;
        this.a.StartColumn = this.a.EndColumn;
        this.a.EndColumn = j;
      }
    }
  }
  
  static String b(Object paramObject)
  {
    switch (zaoj.a(paramObject.getClass()))
    {
    case 18: 
      return zs.a(paramObject);
    case 14: 
      return zauj.b(((Double)paramObject).doubleValue());
    case 9: 
      return zauj.z(((Integer)paramObject).intValue());
    case 3: 
      if (((Boolean)paramObject).booleanValue()) {
        return "True";
      }
      return "False";
    }
    return zs.a(paramObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/AutoFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */