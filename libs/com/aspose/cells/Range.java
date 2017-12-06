package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Range
{
  CellArea a = new CellArea();
  Cells b;
  Object c;
  private String d;
  
  public Iterator iterator()
  {
    if (this.a.e()) {
      return new zif(this.b, this.a.StartRow, this.a.EndRow, this.a.StartColumn, false, 7, false);
    }
    return new zie(this.b, this.a, false, 7);
  }
  
  public boolean isIntersect(Range range)
  {
    if (this.b != range.b) {
      return false;
    }
    int i = this.a.StartRow < range.a.StartRow ? range.a.StartRow : this.a.StartRow;
    int j = this.a.EndRow > range.a.EndRow ? range.a.EndRow : this.a.EndRow;
    if (i > j) {
      return false;
    }
    i = this.a.StartColumn < range.a.StartColumn ? range.a.StartColumn : this.a.StartColumn;
    j = this.a.EndColumn > range.a.EndColumn ? range.a.EndColumn : this.a.EndColumn;
    return i <= j;
  }
  
  public Range intersect(Range range)
  {
    if (this.b != range.b) {
      return null;
    }
    int i = this.a.StartRow < range.a.StartRow ? range.a.StartRow : this.a.StartRow;
    int j = this.a.EndRow > range.a.EndRow ? range.a.EndRow : this.a.EndRow;
    if (i > j) {
      return null;
    }
    int k = this.a.StartColumn < range.a.StartColumn ? range.a.StartColumn : this.a.StartColumn;
    int m = this.a.EndColumn > range.a.EndColumn ? range.a.EndColumn : this.a.EndColumn;
    if (k > m) {
      return null;
    }
    if ((i == this.a.StartRow) && (k == this.a.StartColumn) && (j == this.a.EndRow) && (m == this.a.EndColumn)) {
      return this;
    }
    if ((i == range.a.StartRow) && (k == range.a.StartColumn) && (j == range.a.EndRow) && (m == range.a.EndColumn)) {
      return range;
    }
    Range localRange = new Range(i, k, j - i + 1, m - k + 1, this.b);
    return localRange;
  }
  
  public ArrayList union(Range range)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.b != range.b)
    {
      zf.a(localArrayList, this);
      zf.a(localArrayList, range);
      return localArrayList;
    }
    int i = this.a.StartRow < range.a.StartRow ? range.a.StartRow : this.a.StartRow;
    int j = this.a.EndRow > range.a.EndRow ? range.a.EndRow : this.a.EndRow;
    if (i > j)
    {
      if ((j + 1 == i) && (this.a.StartColumn == range.a.StartColumn) && (this.a.EndColumn == range.a.EndColumn))
      {
        k = this.a.StartRow > range.a.StartRow ? range.a.StartRow : this.a.StartRow;
        m = this.a.EndRow < range.a.EndRow ? range.a.EndRow : this.a.EndRow;
        Range localRange1 = new Range(k, this.a.StartColumn, m - k + 1, this.a.EndColumn - this.a.StartColumn + 1, this.b);
        zf.a(localArrayList, localRange1);
        return localArrayList;
      }
      zf.a(localArrayList, this);
      zf.a(localArrayList, range);
      return localArrayList;
    }
    int k = this.a.StartColumn < range.a.StartColumn ? range.a.StartColumn : this.a.StartColumn;
    int m = this.a.EndColumn > range.a.EndColumn ? range.a.EndColumn : this.a.EndColumn;
    int n;
    int i1;
    if (k > m)
    {
      if ((m + 1 == k) && (this.a.StartRow == range.a.StartRow) && (this.a.EndRow == range.a.EndRow))
      {
        n = this.a.StartColumn > range.a.StartColumn ? range.a.StartColumn : this.a.StartColumn;
        i1 = this.a.EndColumn < range.a.EndColumn ? range.a.EndColumn : this.a.EndColumn;
        localObject3 = new Range(this.a.StartRow, n, this.a.EndRow - this.a.StartRow + 1, i1 - n + 1, this.b);
        zf.a(localArrayList, localObject3);
        return localArrayList;
      }
      zf.a(localArrayList, this);
      zf.a(localArrayList, range);
      return localArrayList;
    }
    if ((i == this.a.StartRow) && (j == this.a.EndRow) && (k == this.a.StartColumn) && (m == this.a.EndColumn))
    {
      zf.a(localArrayList, range);
      return localArrayList;
    }
    if ((i == range.a.StartRow) && (j == range.a.EndRow) && (k == range.a.StartColumn) && (m == range.a.EndColumn))
    {
      zf.a(localArrayList, this);
      return localArrayList;
    }
    if ((this.a.StartRow == range.a.StartRow) && (this.a.EndRow == range.a.EndRow))
    {
      n = this.a.StartColumn > range.a.StartColumn ? range.a.StartColumn : this.a.StartColumn;
      i1 = this.a.EndColumn < range.a.EndColumn ? range.a.EndColumn : this.a.EndColumn;
      localObject3 = new Range(this.a.StartRow, n, this.a.EndRow - this.a.StartRow + 1, i1 - n + 1, this.b);
      zf.a(localArrayList, localObject3);
      return localArrayList;
    }
    if ((this.a.StartColumn == range.a.StartColumn) && (this.a.EndColumn == range.a.EndColumn))
    {
      n = this.a.StartRow > range.a.StartRow ? range.a.StartRow : this.a.StartRow;
      i1 = this.a.EndRow < range.a.EndRow ? range.a.EndRow : this.a.EndRow;
      localObject3 = new Range(n, this.a.StartColumn, i1 - n + 1, this.a.EndColumn - this.a.StartColumn + 1, this.b);
      zf.a(localArrayList, localObject3);
      return localArrayList;
    }
    Object localObject1 = this.a;
    Object localObject2 = range.a;
    if (((CellArea)localObject1).StartRow > ((CellArea)localObject2).StartRow)
    {
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
    Object localObject3 = null;
    if (((CellArea)localObject1).StartRow < ((CellArea)localObject2).StartRow)
    {
      localObject3 = new Range(((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, ((CellArea)localObject2).StartRow - ((CellArea)localObject1).StartRow, ((CellArea)localObject1).EndColumn - ((CellArea)localObject1).StartColumn + 1, this.b);
      zf.a(localArrayList, localObject3);
    }
    int i2 = this.a.StartColumn < range.a.StartColumn ? this.a.StartColumn : range.a.StartColumn;
    int i3 = this.a.EndColumn > range.a.EndColumn ? this.a.EndColumn : range.a.EndColumn;
    Object localObject4;
    if ((localObject3 != null) && (((Range)localObject3).a.StartColumn == i2) && (((Range)localObject3).a.EndColumn == i3))
    {
      ((Range)localObject3).a.EndRow = j;
      localObject4 = localObject3;
    }
    else
    {
      localObject4 = new Range(i, i2, j - i + 1, i3 - i2 + 1, this.b);
      zf.a(localArrayList, localObject4);
    }
    if (((CellArea)localObject1).EndRow != ((CellArea)localObject2).EndRow)
    {
      CellArea localCellArea = new CellArea();
      if (((CellArea)localObject1).EndRow > ((CellArea)localObject2).EndRow)
      {
        localCellArea.StartRow = (((CellArea)localObject2).EndRow + 1);
        localCellArea.EndRow = ((CellArea)localObject1).EndRow;
        localCellArea.StartColumn = ((CellArea)localObject1).StartColumn;
        localCellArea.EndColumn = ((CellArea)localObject1).EndColumn;
      }
      else
      {
        localCellArea.StartRow = (((CellArea)localObject1).EndRow + 1);
        localCellArea.EndRow = ((CellArea)localObject2).EndRow;
        localCellArea.StartColumn = ((CellArea)localObject2).StartColumn;
        localCellArea.EndColumn = ((CellArea)localObject2).EndColumn;
      }
      if ((localObject4 != null) && (((Range)localObject4).a.StartColumn == localCellArea.StartColumn) && (((Range)localObject4).a.EndColumn == localCellArea.EndColumn))
      {
        ((Range)localObject4).a.EndRow = localCellArea.EndRow;
      }
      else
      {
        Range localRange2 = new Range(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1, this.b);
        zf.a(localArrayList, localRange2);
      }
    }
    return localArrayList;
  }
  
  CellArea a()
  {
    return this.a;
  }
  
  Range(CellArea ca, Cells cells)
  {
    this.b = cells;
    this.a = ca;
  }
  
  Range(int firstRow, int firstColumn, int rowNumber, int columnNumber, Cells cells)
  {
    if ((rowNumber == 0) || (columnNumber == 0)) {
      throw new CellsException(6, "Number of rows or columns cannot be zero.");
    }
    this.b = cells;
    int i = firstRow + rowNumber - 1;
    int j = firstColumn + columnNumber - 1;
    this.a.StartRow = firstRow;
    this.a.StartColumn = firstColumn;
    this.a.EndRow = i;
    this.a.EndColumn = (j & 0xFFFF);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i = 0;
    boolean[] arrayOfBoolean = { i };
    this.a = zban.b(this.a, paramInt1, paramInt2, arrayOfBoolean);
    i = arrayOfBoolean[0];
  }
  
  void b(int paramInt1, int paramInt2)
  {
    int i;
    if (this.a.StartRow >= paramInt1)
    {
      i = this.a.StartRow + paramInt2;
      if (i < 0) {
        i = 0;
      } else if (i > 1048575) {
        this.a.StartRow = 1048575;
      } else {
        this.a.StartRow = i;
      }
      int j = this.a.EndRow + paramInt2;
      if (j > 1048575) {
        this.a.EndRow = 1048575;
      } else {
        this.a.EndRow = j;
      }
    }
    else if (this.a.EndRow >= paramInt1)
    {
      i = this.a.EndRow + paramInt2;
      if (i < 0) {
        i = 0;
      } else if (i > 1048575) {
        this.a.EndRow = 1048575;
      } else {
        this.a.EndRow = i;
      }
    }
  }
  
  public int getRowCount()
  {
    return this.a.EndRow - this.a.StartRow + 1;
  }
  
  public int getColumnCount()
  {
    return this.a.EndColumn - this.a.StartColumn + 1;
  }
  
  public String getName()
  {
    return this.d;
  }
  
  public void setName(String value)
  {
    String str = value.trim();
    if (str.length() > 255) {
      str = str.substring(0, 255);
    }
    this.d = str;
    int i = this.b.p().getNames().add(this.d);
    Name localName = this.b.p().getNames().get(i);
    localName.a(this.b.g().getIndex(), this.a);
  }
  
  void a(String paramString)
  {
    this.d = paramString;
  }
  
  public String getRefersTo()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("=");
    String str = this.b.g().getName();
    if (zamm.a(str)) {
      str = "'" + str + "'";
    }
    localStringBuilder.append(str);
    localStringBuilder.append("!");
    localStringBuilder.append("$");
    CellsHelper.a(localStringBuilder, a().StartColumn);
    localStringBuilder.append("$");
    localStringBuilder.append(a().StartRow + 1);
    if ((a().StartRow != a().EndRow) || (a().StartColumn != a().EndColumn))
    {
      localStringBuilder.append(":");
      localStringBuilder.append("$");
      CellsHelper.a(localStringBuilder, a().EndColumn);
      localStringBuilder.append("$");
      localStringBuilder.append(a().EndRow + 1);
    }
    return zs.a(localStringBuilder);
  }
  
  String b()
  {
    return this.b.g().getName();
  }
  
  String c()
  {
    return CellsHelper.a(a().StartRow, a().StartColumn, a().EndRow, a().EndColumn);
  }
  
  String a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a().a(paramInt1, paramInt2, paramBoolean);
  }
  
  boolean a(int paramInt)
  {
    return a().c(paramInt);
  }
  
  boolean b(int paramInt)
  {
    return a().d(paramInt);
  }
  
  boolean d()
  {
    zaja localzaja = this.b.getRows().a.a(this.a.StartRow, this.a.EndRow, false);
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      zaiv localzaiv = localzt.b(this.a.StartColumn, this.a.EndColumn, false);
      if (localzaiv != null) {
        for (;;)
        {
          int i = localzaiv.a();
          if (i < 0) {
            break;
          }
          if (localzt.h(i) != 0) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public int getFirstRow()
  {
    return this.a.StartRow;
  }
  
  public int getFirstColumn()
  {
    return this.a.StartColumn;
  }
  
  public void merge()
  {
    this.b.merge(getFirstRow(), getFirstColumn(), getRowCount(), getColumnCount());
  }
  
  public void unMerge()
  {
    this.b.unMerge(getFirstRow(), getFirstColumn(), getRowCount(), getColumnCount());
  }
  
  public void putValue(String stringValue, boolean isConverted, boolean setStyle)
  {
    CellArea localCellArea = this.a;
    for (int i = localCellArea.StartRow; i <= localCellArea.EndRow; i++) {
      for (int j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
      {
        Cell localCell = this.b.a(i, j, false);
        localCell.putValue(stringValue, isConverted, setStyle);
      }
    }
  }
  
  public Object getValue()
  {
    if ((a().StartRow == a().EndRow) && (a().StartColumn == a().EndColumn))
    {
      Cell localCell = this.b.checkCell(a().StartRow, a().StartColumn);
      if (localCell == null) {
        return null;
      }
      return localCell.getValue();
    }
    return this.b.exportArray(a().StartRow, a().StartColumn, a().EndRow - a().StartRow + 1, a().EndColumn - a().StartColumn + 1);
  }
  
  public void setValue(Object value)
  {
    CellArea localCellArea = this.a;
    int j;
    Object localObject;
    if ((value != null) && (zc.a(value)))
    {
      Object[] arrayOfObject1 = (Object[])value;
      if (arrayOfObject1.length == 0) {
        return;
      }
      j = 1;
      switch (j)
      {
      case 1: 
        localObject = za.a(arrayOfObject1, 0);
        int k;
        if (zc.a(localObject))
        {
          k = ((Object[])localObject).length;
          for (int m = 0; m < arrayOfObject1.length; m++)
          {
            Object[] arrayOfObject2 = (Object[])za.a(arrayOfObject1, m);
            for (int n = 0; n < k; n++)
            {
              Cell localCell2 = this.b.a(m + localCellArea.StartRow, n + localCellArea.StartColumn, false);
              localCell2.putValue(za.a(arrayOfObject2, n));
            }
          }
        }
        else
        {
          for (k = 0; k < arrayOfObject1.length; k++)
          {
            Cell localCell1 = this.b.a(localCellArea.StartRow, k + localCellArea.StartColumn, false);
            localCell1.putValue(za.a(arrayOfObject1, k));
          }
        }
        break;
      }
    }
    else
    {
      for (int i = localCellArea.StartRow; i <= localCellArea.EndRow; i++) {
        for (j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
        {
          localObject = this.b.a(i, j, false);
          ((Cell)localObject).putValue(value);
        }
      }
    }
  }
  
  public void applyStyle(Style style, StyleFlag flag)
  {
    if (style.e() == null) {
      style.a(this.b.p());
    }
    CellArea localCellArea = this.a;
    RowCollection localRowCollection = this.b.getRows();
    this.b.m();
    if (flag.getAll())
    {
      int i = -1;
      if (style != null) {
        i = getWorksheet().c().a(style);
      }
      for (j = localCellArea.StartRow; j <= localCellArea.EndRow; j++)
      {
        Row localRow1 = localRowCollection.a(j, false, true, false);
        for (int m = localCellArea.StartColumn; m <= localCellArea.EndColumn; m++)
        {
          Cell localCell1 = localRow1.c(m);
          if ((j == localCellArea.StartRow) && (j != 0) && (style.isModified(4))) {
            localCell1.setStyle(style);
          }
          localCell1.b(i);
        }
      }
      return;
    }
    HashMap localHashMap = new HashMap();
    int j = 0;
    for (int k = localCellArea.StartRow; k <= localCellArea.EndRow; k++)
    {
      Row localRow2 = localRowCollection.a(k, false, true, false);
      for (int n = localCellArea.StartColumn; n <= localCellArea.EndColumn; n++)
      {
        Cell localCell2 = localRow2.c(n);
        Style localStyle;
        if (((n == localCellArea.StartColumn) && ((flag.getBorders()) || (flag.getLeftBorder()))) || ((n == localCellArea.EndColumn) && ((flag.getBorders()) || (flag.getRightBorder()))) || ((k == localCellArea.StartRow) && ((flag.getBorders()) || (flag.getTopBorder()))) || ((k == localCellArea.EndRow) && ((flag.getBorders()) || (flag.getBottomBorder()))))
        {
          localStyle = localCell2.o();
          zbtc.a(style, localStyle, flag);
          localCell2.setStyle(localStyle);
        }
        else
        {
          j = localCell2.r();
          if (localHashMap.get(Integer.valueOf(j)) != null)
          {
            localCell2.b(((Integer)localHashMap.get(Integer.valueOf(j))).intValue());
          }
          else
          {
            localStyle = localCell2.o();
            zbtc.a(style, localStyle, flag);
            localCell2.a(localStyle);
            localHashMap.put(Integer.valueOf(j), Integer.valueOf(localCell2.s()));
          }
        }
      }
    }
  }
  
  public void setStyle(Style style)
  {
    int i = -1;
    if (style != null) {
      i = this.b.p().a(style);
    }
    c(i);
  }
  
  void c(int paramInt)
  {
    CellArea localCellArea = this.a;
    for (int i = localCellArea.StartRow; i <= localCellArea.EndRow; i++) {
      for (int j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
      {
        Cell localCell = this.b.a(i, j, false);
        localCell.b(paramInt);
      }
    }
  }
  
  public void setOutlineBorders(int borderStyle, Color borderColor)
  {
    Style localStyle = null;
    Cell localCell = null;
    int i = this.a.StartRow;
    int j = this.a.StartColumn;
    HashMap localHashMap;
    int k;
    if (this.a.StartRow == this.a.EndRow)
    {
      if (this.a.StartColumn == this.a.EndColumn)
      {
        localCell = this.b.a(i, this.a.StartColumn, false);
        localStyle = localCell.o();
        localStyle.setBorder(1, borderStyle, borderColor);
        localStyle.setBorder(2, borderStyle, borderColor);
        localStyle.setBorder(4, borderStyle, borderColor);
        localStyle.setBorder(8, borderStyle, borderColor);
        localCell.a(localStyle);
      }
      else
      {
        localCell = this.b.a(i, this.a.StartColumn, false);
        localStyle = localCell.o();
        localStyle.setBorder(1, borderStyle, borderColor);
        localStyle.setBorder(4, borderStyle, borderColor);
        localStyle.setBorder(8, borderStyle, borderColor);
        localCell.a(localStyle);
        localHashMap = new HashMap();
        for (j = this.a.StartColumn + 1; j < this.a.EndColumn; j++)
        {
          localCell = this.b.a(i, j, false);
          k = localCell.r();
          if (localHashMap.get(Integer.valueOf(k)) != null)
          {
            localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
          }
          else
          {
            localStyle = localCell.o();
            localStyle.setBorder(4, borderStyle, borderColor);
            localStyle.setBorder(8, borderStyle, borderColor);
            localCell.a(localStyle);
            localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
          }
        }
        localCell = this.b.a(this.a.StartRow, this.a.EndColumn, false);
        localStyle = localCell.o();
        localStyle.setBorder(2, borderStyle, borderColor);
        localStyle.setBorder(4, borderStyle, borderColor);
        localStyle.setBorder(8, borderStyle, borderColor);
        localCell.a(localStyle);
      }
    }
    else if (this.a.StartColumn == this.a.EndColumn)
    {
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyle, borderColor);
      localStyle.setBorder(2, borderStyle, borderColor);
      localStyle.setBorder(4, borderStyle, borderColor);
      localCell.a(localStyle);
      localHashMap = new HashMap();
      for (i = this.a.StartRow + 1; i < this.a.EndRow; i++)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(1, borderStyle, borderColor);
          localStyle.setBorder(2, borderStyle, borderColor);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
      }
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyle, borderColor);
      localStyle.setBorder(2, borderStyle, borderColor);
      localStyle.setBorder(8, borderStyle, borderColor);
      localCell.a(localStyle);
    }
    else
    {
      localHashMap = null;
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyle, borderColor);
      localStyle.setBorder(4, borderStyle, borderColor);
      localCell.a(localStyle);
      localHashMap = new HashMap();
      j++;
      while (j < this.a.EndColumn)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(4, borderStyle, borderColor);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        j++;
      }
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(2, borderStyle, borderColor);
      localStyle.setBorder(4, borderStyle, borderColor);
      localCell.a(localStyle);
      i = this.a.EndRow;
      j = this.a.StartColumn;
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyle, borderColor);
      localStyle.setBorder(8, borderStyle, borderColor);
      localCell.a(localStyle);
      localHashMap = new HashMap();
      j++;
      while (j < this.a.EndColumn)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(8, borderStyle, borderColor);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        j++;
      }
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(2, borderStyle, borderColor);
      localStyle.setBorder(8, borderStyle, borderColor);
      localCell.a(localStyle);
      i = this.a.StartRow + 1;
      j = this.a.StartColumn;
      localHashMap = new HashMap();
      while (i < this.a.EndRow)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(1, borderStyle, borderColor);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        i++;
      }
      i = this.a.StartRow + 1;
      j = this.a.EndColumn;
      localHashMap = new HashMap();
      while (i < this.a.EndRow)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(2, borderStyle, borderColor);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        i++;
      }
    }
  }
  
  public void setOutlineBorders(int[] borderStyles, Color[] borderColors)
  {
    Style localStyle = null;
    Cell localCell = null;
    int i = this.a.StartRow;
    int j = this.a.StartColumn;
    HashMap localHashMap;
    int k;
    if (this.a.StartRow == this.a.EndRow)
    {
      if (this.a.StartColumn == this.a.EndColumn)
      {
        localCell = this.b.a(i, this.a.StartColumn, false);
        localStyle = localCell.o();
        localStyle.setBorder(1, borderStyles[2], borderColors[2]);
        localStyle.setBorder(2, borderStyles[3], borderColors[3]);
        localStyle.setBorder(4, borderStyles[0], borderColors[0]);
        localStyle.setBorder(8, borderStyles[1], borderColors[1]);
        localCell.a(localStyle);
      }
      else
      {
        localCell = this.b.a(i, this.a.StartColumn, false);
        localStyle = localCell.o();
        localStyle.setBorder(1, borderStyles[2], borderColors[2]);
        localStyle.setBorder(4, borderStyles[0], borderColors[0]);
        localStyle.setBorder(8, borderStyles[1], borderColors[1]);
        localCell.a(localStyle);
        localHashMap = new HashMap();
        for (j = this.a.StartColumn + 1; j < this.a.EndColumn; j++)
        {
          localCell = this.b.a(i, j, false);
          k = localCell.r();
          if (localHashMap.get(Integer.valueOf(k)) != null)
          {
            localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
          }
          else
          {
            localStyle = localCell.o();
            localStyle.setBorder(4, borderStyles[0], borderColors[0]);
            localStyle.setBorder(8, borderStyles[1], borderColors[1]);
            localCell.a(localStyle);
            localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
          }
        }
        localCell = this.b.a(this.a.StartRow, this.a.EndColumn, false);
        localStyle = localCell.o();
        localStyle.setBorder(2, borderStyles[3], borderColors[3]);
        localStyle.setBorder(4, borderStyles[0], borderColors[0]);
        localStyle.setBorder(8, borderStyles[1], borderColors[1]);
        localCell.a(localStyle);
      }
    }
    else if (this.a.StartColumn == this.a.EndColumn)
    {
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyles[2], borderColors[2]);
      localStyle.setBorder(2, borderStyles[3], borderColors[3]);
      localStyle.setBorder(4, borderStyles[0], borderColors[0]);
      localCell.a(localStyle);
      localHashMap = new HashMap();
      for (i = this.a.StartRow + 1; i < this.a.EndRow; i++)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(1, borderStyles[2], borderColors[2]);
          localStyle.setBorder(2, borderStyles[3], borderColors[3]);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
      }
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyles[2], borderColors[2]);
      localStyle.setBorder(2, borderStyles[3], borderColors[3]);
      localStyle.setBorder(8, borderStyles[1], borderColors[1]);
      localCell.a(localStyle);
    }
    else
    {
      localHashMap = null;
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyles[2], borderColors[2]);
      localStyle.setBorder(4, borderStyles[0], borderColors[0]);
      localCell.a(localStyle);
      localHashMap = new HashMap();
      j++;
      while (j < this.a.EndColumn)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(4, borderStyles[0], borderColors[0]);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        j++;
      }
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(2, borderStyles[3], borderColors[3]);
      localStyle.setBorder(4, borderStyles[0], borderColors[0]);
      localCell.a(localStyle);
      i = this.a.EndRow;
      j = this.a.StartColumn;
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(1, borderStyles[2], borderColors[2]);
      localStyle.setBorder(8, borderStyles[1], borderColors[1]);
      localCell.a(localStyle);
      localHashMap = new HashMap();
      j++;
      while (j < this.a.EndColumn)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(8, borderStyles[1], borderColors[1]);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        j++;
      }
      localCell = this.b.a(i, j, false);
      localStyle = localCell.o();
      localStyle.setBorder(2, borderStyles[3], borderColors[3]);
      localStyle.setBorder(8, borderStyles[1], borderColors[1]);
      localCell.a(localStyle);
      i = this.a.StartRow + 1;
      j = this.a.StartColumn;
      localHashMap = new HashMap();
      while (i < this.a.EndRow)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(1, borderStyles[2], borderColors[2]);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        i++;
      }
      i = this.a.StartRow + 1;
      j = this.a.EndColumn;
      localHashMap = new HashMap();
      while (i < this.a.EndRow)
      {
        localCell = this.b.a(i, j, false);
        k = localCell.r();
        if (localHashMap.get(Integer.valueOf(k)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(k))).intValue());
        }
        else
        {
          localStyle = localCell.o();
          localStyle.setBorder(2, borderStyles[3], borderColors[3]);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
        }
        i++;
      }
    }
  }
  
  private void a(Cell paramCell, HashMap paramHashMap, int paramInt1, int paramInt2, Color paramColor)
  {
    int i = paramCell.r();
    if (paramHashMap.get(Integer.valueOf(i)) != null)
    {
      paramCell.b(((Integer)paramHashMap.get(Integer.valueOf(i))).intValue());
      return;
    }
    Style localStyle = paramCell.o();
    Border localBorder = localStyle.getBorders().getByBorderType(paramInt1);
    localBorder.setLineStyle(paramInt2);
    localBorder.setColor(paramColor);
    paramCell.a(localStyle);
    paramHashMap.put(Integer.valueOf(i), Integer.valueOf(paramCell.s()));
  }
  
  public void setOutlineBorder(int borderEdge, int borderStyle, Color borderColor)
  {
    int[] arrayOfInt = { 1, 2, 4, 8 };
    for (int i = 0; i < arrayOfInt.length; i++) {
      if ((borderEdge & arrayOfInt[i]) == arrayOfInt[i])
      {
        Style localStyle = null;
        CellArea localCellArea = this.a;
        HashMap localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        int j;
        Cell localCell;
        int k;
        Border localBorder;
        switch (arrayOfInt[i])
        {
        case 4: 
          for (j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
          {
            localCell = this.b.a(localCellArea.StartRow, j, false);
            a(localCell, localHashMap1, 4, borderStyle, borderColor);
            if (localCellArea.StartRow != 0)
            {
              localCell = this.b.a(localCellArea.StartRow - 1, j, true);
              if (localCell != null) {
                a(localCell, localHashMap2, 8, borderStyle, borderColor);
              }
            }
          }
          break;
        case 8: 
          for (j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
          {
            localCell = this.b.a(localCellArea.EndRow, j, false);
            k = localCell.r();
            if (localHashMap1.get(Integer.valueOf(k)) != null)
            {
              localCell.b(((Integer)localHashMap1.get(Integer.valueOf(k))).intValue());
            }
            else
            {
              localStyle = localCell.o();
              localBorder = localStyle.getBorders().getByBorderType(8);
              localBorder.setLineStyle(borderStyle);
              localBorder.setColor(borderColor);
              localCell.a(localStyle);
              localHashMap1.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
            }
          }
          break;
        case 1: 
          for (j = localCellArea.StartRow; j <= localCellArea.EndRow; j++)
          {
            localCell = this.b.a(j, localCellArea.StartColumn, false);
            k = localCell.r();
            if (localHashMap1.get(Integer.valueOf(k)) != null)
            {
              localCell.b(((Integer)localHashMap1.get(Integer.valueOf(k))).intValue());
            }
            else
            {
              localStyle = localCell.o();
              localBorder = localStyle.getBorders().getByBorderType(1);
              localBorder.setLineStyle(borderStyle);
              localBorder.setColor(borderColor);
              localCell.a(localStyle);
              localHashMap1.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
            }
          }
          break;
        case 2: 
          for (j = localCellArea.StartRow; j <= localCellArea.EndRow; j++)
          {
            localCell = this.b.a(j, localCellArea.EndColumn, false);
            k = localCell.r();
            if (localHashMap1.get(Integer.valueOf(k)) != null)
            {
              localCell.b(((Integer)localHashMap1.get(Integer.valueOf(k))).intValue());
            }
            else
            {
              localStyle = localCell.o();
              localBorder = localStyle.getBorders().getByBorderType(2);
              localBorder.setLineStyle(borderStyle);
              localBorder.setColor(borderColor);
              localCell.a(localStyle);
              localHashMap1.put(Integer.valueOf(k), Integer.valueOf(localCell.s()));
            }
          }
          break;
        case 3: 
        case 5: 
        case 6: 
        case 7: 
        default: 
          return;
        }
      }
    }
  }
  
  public double getColumnWidth()
  {
    return this.b.getColumnWidth(getFirstColumn());
  }
  
  public void setColumnWidth(double value)
  {
    if (getColumnCount() < 16384)
    {
      CellArea localCellArea = this.a;
      for (int i = localCellArea.StartColumn; i <= localCellArea.EndColumn; i++) {
        this.b.setColumnWidth(i, value);
      }
    }
    else
    {
      this.b.setStandardWidth(value);
    }
  }
  
  public double getRowHeight()
  {
    return this.b.getRowHeight(getFirstRow());
  }
  
  public void setRowHeight(double value)
  {
    if ((value < 0.0D) || (value > 409.0D)) {
      throw new IllegalArgumentException();
    }
    if (getRowCount() < 1048576)
    {
      CellArea localCellArea = this.a;
      for (int i = localCellArea.StartRow; i <= localCellArea.EndRow; i++) {
        this.b.setRowHeight(i, value);
      }
    }
    else
    {
      this.b.setStandardHeight(value);
    }
  }
  
  void a(Range paramRange)
  {
    this.a = paramRange.a;
    this.d = paramRange.getName();
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    int i = this.b.getColumns().e(paramInt1);
    if (i > -1)
    {
      Column localColumn1 = this.b.getColumns().getColumnByIndex(i);
      this.b.getColumns().removeAt(i);
      Column localColumn2 = this.b.getColumns().get(paramInt2);
      localColumn2.a(localColumn1);
    }
    else
    {
      i = this.b.getColumns().e(paramInt2);
      if (i > -1) {
        this.b.getColumns().removeAt(i);
      }
    }
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    int i = this.b.getRows().d(paramInt1);
    if (i != -1)
    {
      Row localRow1 = this.b.getRows().getRowByIndex(i);
      this.b.getRows().removeAt(i);
      Row localRow2 = this.b.getRows().a(paramInt2, false, true, false);
      localRow2.a(localRow1);
    }
    else
    {
      i = this.b.getRows().d(paramInt2);
      if (i != -1) {
        this.b.getRows().removeAt(i);
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Cell localCell1 = this.b.checkCell(this.a.StartRow + paramInt1, this.a.StartColumn + paramInt2);
    if (localCell1 != null)
    {
      localCell1.E();
      int i = this.b.getRows().e(paramInt3 + paramInt1);
      Cell localCell2;
      if (i < 0)
      {
        localCell2 = this.b.getRows().a(paramInt3 + paramInt1, -i - 1, true).a(paramInt4 + paramInt2, false, true);
        localCell1.b();
      }
      else
      {
        localObject = this.b.getRows().b(i, false);
        i = ((Row)localObject).c.b(paramInt4 + paramInt2);
        if (i < 0)
        {
          localCell2 = ((Row)localObject).a(this.b.getRows(), paramInt4 + paramInt2, -i - 1, true, true);
          localCell1.b();
        }
        else
        {
          localCell2 = ((Row)localObject).a(i);
        }
      }
      Object localObject = new CopyOptions(2, localCell1, localCell2);
      localCell2.c(localCell1, (CopyOptions)localObject);
      if (localCell2.g())
      {
        byte[] arrayOfByte = localCell2.v();
        zaaq.a(this.a, paramInt3, paramInt4, this.b.g(), true, arrayOfByte, -1, -1);
        localCell2.a(arrayOfByte);
      }
      this.b.c(this.a.StartRow + paramInt1, this.a.StartColumn + paramInt2);
    }
    else
    {
      this.b.c(paramInt3 + paramInt1, paramInt4 + paramInt2);
    }
  }
  
  public void moveTo(int destRow, int destColumn)
  {
    if ((destRow == this.a.StartRow) && (destColumn == this.a.StartColumn)) {
      return;
    }
    this.b.p().p().a();
    Range localRange = new Range(destRow, destColumn, getRowCount(), getColumnCount(), this.b);
    int i = 0;
    int j = getRowCount();
    int k = getColumnCount();
    if (getRowCount() == 65536) {
      if (this.a.StartColumn < destColumn) {
        for (m = k - 1; m >= 0; m--) {
          d(this.a.StartColumn + m, destColumn + m);
        }
      } else {
        for (m = 0; m < k; m++) {
          d(this.a.StartColumn + m, destColumn + m);
        }
      }
    }
    if (getColumnCount() == 256) {
      if (this.a.StartRow < destRow) {
        for (m = j - 1; m >= 0; m--) {
          e(this.a.StartRow + m, destRow + m);
        }
      } else {
        for (m = 0; m < j; m++) {
          e(this.a.StartRow + m, destRow + m);
        }
      }
    }
    int n;
    if (((destRow > this.a.StartRow) && (destRow <= this.a.EndRow) && (destColumn >= this.a.StartColumn) && (destColumn <= this.a.EndColumn)) || ((destRow >= this.a.StartRow) && (destRow <= this.a.EndRow) && (destColumn > this.a.StartColumn) && (destColumn <= this.a.EndColumn)))
    {
      i = 1;
      for (m = j - 1; m >= 0; m--) {
        for (n = k - 1; n >= 0; n--) {
          a(m, n, destRow, destColumn);
        }
      }
    }
    if (i == 0) {
      for (m = 0; m < j; m++) {
        for (n = 0; n < k; n++) {
          a(m, n, destRow, destColumn);
        }
      }
    }
    Cell localCell;
    Object localObject4;
    for (int m = 0; m < this.b.getRows().getCount(); m++)
    {
      localObject2 = this.b.getRows().getRowByIndex(m);
      for (int i1 = 0; i1 < ((Row)localObject2).a(); i1++)
      {
        localCell = ((Row)localObject2).getCellByIndex(i1);
        if ((localCell.g()) && ((localCell.getRow() < destRow) || (localCell.getRow() > localRange.a.EndRow) || (localCell.getColumn() < destColumn) || (localCell.getColumn() > localRange.a.EndColumn)))
        {
          if (localCell.y()) {
            localCell.J();
          }
          if (localCell.z())
          {
            if (localCell.h().a() != null)
            {
              localObject4 = localCell.h().a().c();
              zaaq.a(this.a, destRow, destColumn, this.b.g(), true, (byte[])localObject4, -1, -1);
              localCell.h().a().a((byte[])localObject4);
            }
          }
          else
          {
            localObject4 = localCell.v();
            zaaq.a(this.a, destRow, destColumn, this.b.g(), true, (byte[])localObject4, -1, -1);
            localCell.a((byte[])localObject4);
          }
        }
      }
    }
    Object localObject1 = this.b.p().iterator();
    byte[] arrayOfByte;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Worksheet)((Iterator)localObject1).next();
      if (localObject2 != this.b.g())
      {
        localObject3 = ((Worksheet)localObject2).getCells().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localCell = (Cell)((Iterator)localObject3).next();
          if (localCell.g())
          {
            localObject4 = localCell.h();
            if (((zaai)localObject4).a() != null)
            {
              arrayOfByte = ((zaai)localObject4).a().c();
              zaaq.a(this.a, destRow, destColumn, this.b.g(), false, arrayOfByte, -1, -1);
              ((zaai)localObject4).a().a(arrayOfByte);
            }
            else
            {
              arrayOfByte = localCell.v();
              zaaq.a(this.a, destRow, destColumn, this.b.g(), false, arrayOfByte, -1, -1);
              localCell.a(arrayOfByte);
            }
          }
        }
      }
    }
    localObject1 = this.b.g();
    Object localObject2 = new CopyOptions(2, (Worksheet)localObject1, (Worksheet)localObject1);
    if (((Worksheet)localObject1).G() != null) {
      ((Worksheet)localObject1).getConditionalFormattings().a(this.a, localRange.a);
    }
    if (((Worksheet)localObject1).getValidations().getCount() > 0)
    {
      ((Worksheet)localObject1).getValidations().a(((Worksheet)localObject1).getValidations(), this.a, localRange.a, (CopyOptions)localObject2, false);
      ((Worksheet)localObject1).getValidations().removeArea(this.a);
    }
    Object localObject3 = ((Worksheet)localObject1).c().getNames();
    for (int i2 = 0; i2 < ((NameCollection)localObject3).getCount(); i2++)
    {
      localObject4 = ((NameCollection)localObject3).get(i2);
      arrayOfByte = ((Name)localObject4).b();
      if (arrayOfByte != null)
      {
        zaaq.a(this.a, destRow, destColumn, this.b.g(), true, arrayOfByte, -1, -1);
        ((Name)localObject4).a(arrayOfByte);
        ((Name)localObject4).b.a();
      }
    }
    ((Worksheet)localObject1).getComments().a(this.a, destRow - this.a.StartRow, destColumn - this.a.StartColumn);
    this.b.o().a(this.a, j, k, destRow, destColumn);
    this.a = new CellArea();
    this.a.StartRow = destRow;
    this.a.StartColumn = destColumn;
    this.a.EndRow = (destRow + j - 1);
    this.a.EndColumn = (destColumn + k - 1);
    if (this.d != null) {
      setName(this.d);
    }
  }
  
  public void copyData(Range range)
    throws Exception
  {
    PasteOptions localPasteOptions = new PasteOptions();
    localPasteOptions.setPasteType(8);
    copy(range, localPasteOptions);
  }
  
  public void copyValue(Range range)
    throws Exception
  {
    PasteOptions localPasteOptions = new PasteOptions();
    localPasteOptions.setPasteType(11);
    copy(range, localPasteOptions);
  }
  
  void a(CellArea paramCellArea, PasteOptions paramPasteOptions)
  {
    switch (paramPasteOptions.getPasteType())
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 8: 
    case 9: 
    case 11: 
    case 12: 
      Iterator localIterator = getWorksheet().getListObjects().iterator();
      while (localIterator.hasNext())
      {
        ListObject localListObject = (ListObject)localIterator.next();
        if ((localListObject.getShowHeaderRow()) && (localListObject.getStartRow() >= paramCellArea.StartRow) && (localListObject.getStartRow() <= paramCellArea.EndRow) && (localListObject.getStartColumn() <= paramCellArea.EndColumn) && (localListObject.getEndColumn() >= paramCellArea.StartColumn)) {
          localListObject.updateColumnName();
        }
      }
    }
  }
  
  public void copyStyle(Range range)
  {
    CopyOptions localCopyOptions = new CopyOptions(2, range.b.g(), this.b.g());
    CellArea localCellArea1 = range.a;
    CellArea localCellArea2 = this.a;
    int i = localCellArea1.EndRow - localCellArea1.StartRow + 1;
    int j = localCellArea1.EndColumn - localCellArea1.StartColumn + 1;
    int k = localCellArea2.EndRow - localCellArea2.StartRow + 1;
    int m = localCellArea2.EndColumn - localCellArea2.StartColumn + 1;
    if (i > k) {
      i = k;
    }
    if (j > m) {
      j = m;
    }
    Object localObject1;
    Object localObject2;
    if (i == 65536)
    {
      for (n = localCellArea2.StartColumn; n < localCellArea2.StartColumn + j; n++)
      {
        i1 = this.b.getColumns().e(n);
        if (i1 > -1) {
          this.b.getColumns().removeAt(i1);
        }
      }
      for (n = localCellArea1.StartColumn; n <= localCellArea1.EndColumn; n++)
      {
        i1 = range.b.getColumns().e(n);
        if (i1 > -1)
        {
          localObject1 = range.b.getColumns().getColumnByIndex(i1);
          localObject2 = this.b.getColumns().get(((Column)localObject1).getIndex() + localCellArea2.StartColumn - localCellArea1.StartColumn);
          ((Column)localObject2).a((Column)localObject1);
        }
      }
    }
    if (j == 256)
    {
      for (n = localCellArea2.StartRow; n < localCellArea2.StartRow + i; n++)
      {
        i1 = this.b.getRows().d(n);
        if (i1 != -1) {
          this.b.getRows().removeAt(i1);
        }
      }
      for (n = localCellArea1.StartRow; n <= localCellArea1.EndRow; n++)
      {
        i1 = range.b.getRows().d(n);
        if (i1 != -1)
        {
          localObject1 = range.b.getRows().getRowByIndex(i1);
          localObject2 = this.b.getRows().a(((Row)localObject1).getIndex() + localCellArea2.StartRow - localCellArea1.StartRow, false, true, false);
          ((Row)localObject2).a((Row)localObject1);
        }
      }
    }
    int n = this.b.p() == range.b.p() ? 1 : 0;
    for (int i1 = 0; i1 < i; i1++) {
      for (int i2 = 0; i2 < j; i2++)
      {
        int i3 = range.c(localCellArea1.StartRow + i1, localCellArea1.StartColumn + i2);
        int i4 = this.b.d(localCellArea2.StartRow + i1, localCellArea2.StartColumn + i2);
        if (((i3 != i4) || (n == 0)) && (((i3 != -1) && (i3 != 15)) || ((i4 != -1) && (i4 != 15))))
        {
          Cell localCell = this.b.a(localCellArea2.StartRow + i1, localCellArea2.StartColumn + i2, false);
          if ((n != 0) || (i3 == -1) || (i3 == 15)) {
            localCell.b(i3);
          } else {
            localCell.a(range.b.p().e(i3));
          }
        }
      }
    }
    a(range, false);
    if (range.b.g().getConditionalFormattings().getCount() != 0) {
      this.b.g().getConditionalFormattings().a(range.b.g().getConditionalFormattings(), range.a, this.a, localCopyOptions, false);
    }
  }
  
  int c(int paramInt1, int paramInt2)
  {
    WorksheetCollection localWorksheetCollection = this.b.p();
    int i = this.b.d(paramInt1, paramInt2);
    Style localStyle1 = localWorksheetCollection.Q();
    Style localStyle2 = null;
    if ((i != -1) && (i != 15)) {
      localStyle1 = localWorksheetCollection.C().a(i);
    }
    Cell localCell = null;
    if ((paramInt1 == this.a.StartRow) && (paramInt1 != 0) && (localStyle1.getBorders().getByBorderType(4).getLineStyle() == 0))
    {
      localCell = this.b.checkCell(paramInt1 - 1, paramInt2);
      if ((localCell != null) && (localCell.q()))
      {
        Style localStyle3 = localCell.o();
        if (localStyle3.getBorders().getByBorderType(8).getLineStyle() != 0)
        {
          if (localStyle2 == null)
          {
            localStyle2 = new Style(localWorksheetCollection);
            localStyle2.copy(localStyle1);
          }
          Border localBorder = localStyle2.getBorders().getByBorderType(4);
          localBorder.setLineStyle(localStyle3.getBorders().getByBorderType(8).getLineStyle());
          localBorder.a.f(localStyle3.getBorders().getByBorderType(8).a);
        }
      }
    }
    if (localStyle2 != null) {
      i = localWorksheetCollection.C().a(localStyle2);
    }
    return i;
  }
  
  private void a(Range paramRange, boolean paramBoolean)
  {
    CellArea localCellArea1 = a();
    CellArea localCellArea2 = paramRange.a();
    for (int i = 0; i < this.b.o().getCount(); i++)
    {
      CellArea localCellArea3 = this.b.o().a(i);
      if (localCellArea1.b(localCellArea3))
      {
        this.b.o().removeAt(i);
        i--;
      }
    }
    i = paramRange.b.o().getCount();
    for (int j = 0; j < i; j++)
    {
      CellArea localCellArea4 = paramRange.b.o().a(j);
      if ((localCellArea4.StartRow >= localCellArea2.StartRow) && (localCellArea4.EndRow <= localCellArea2.EndRow) && (localCellArea4.StartColumn >= localCellArea2.StartColumn) && (localCellArea4.EndColumn <= localCellArea2.EndColumn))
      {
        int k = localCellArea4.StartRow - localCellArea2.StartRow;
        int m = localCellArea4.StartColumn - localCellArea2.StartColumn;
        int n = localCellArea4.EndRow - localCellArea4.StartRow + 1;
        int i1 = localCellArea4.EndColumn - localCellArea4.StartColumn + 1;
        CellArea localCellArea5;
        if (paramBoolean)
        {
          localCellArea5 = new CellArea();
          localCellArea1.StartRow += m;
          localCellArea5.EndRow = (localCellArea5.StartRow + i1 - 1);
          localCellArea1.StartColumn += k;
          localCellArea5.EndColumn = (localCellArea5.StartColumn + n - 1);
          this.b.o().a(localCellArea5);
        }
        else
        {
          localCellArea5 = new CellArea();
          localCellArea1.StartRow += k;
          localCellArea5.EndRow = (localCellArea5.StartRow + n - 1);
          localCellArea1.StartColumn += m;
          localCellArea5.EndColumn = (localCellArea5.StartColumn + i1 - 1);
          this.b.o().a(localCellArea5);
        }
      }
    }
  }
  
  private static boolean d(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 9: 
    case 12: 
      return true;
    }
    return false;
  }
  
  public void copy(Range range, PasteOptions options)
    throws Exception
  {
    if (options.getTranspose())
    {
      a(range, options);
      return;
    }
    CellArea localCellArea1 = CellArea.d(this.a);
    CellArea localCellArea2 = CellArea.d(range.a);
    int i = range.getColumnCount();
    int j = range.getRowCount();
    int k = 0;
    if (getRowCount() == 1)
    {
      if (getColumnCount() == 1)
      {
        this.a.EndRow = (this.a.StartRow + range.getRowCount() - 1);
        this.a.EndColumn = (this.a.StartColumn + range.getColumnCount() - 1);
        a(range, options);
        this.a = localCellArea1;
        return;
      }
      if ((i == 1) && (j == 1)) {
        k = 1;
      } else if (i == getColumnCount()) {
        k = 1;
      }
    }
    else if (i == getColumnCount())
    {
      if (j >= getRowCount())
      {
        this.a.EndColumn = (this.a.StartColumn + range.getColumnCount() - 1);
        a(range, options);
        this.a = localCellArea1;
        return;
      }
      k = getRowCount() % j == 0 ? 1 : 0;
    }
    else
    {
      k = (getRowCount() % j == 0) && (getColumnCount() % i == 0) ? 1 : 0;
    }
    if (k == 0)
    {
      if (i != getColumnCount())
      {
        this.a.EndColumn = (this.a.StartColumn + i - 1);
        if (this.a.EndColumn > 16383)
        {
          this.a.EndColumn = 16383;
          range.a.EndColumn = (range.a.StartColumn + 16383 - this.a.StartColumn);
        }
      }
      if (j != getRowCount())
      {
        this.a.EndRow = (this.a.StartRow + j - 1);
        if (this.a.EndRow > 1048575)
        {
          this.a.EndRow = 1048575;
          range.a.EndRow = (range.a.StartRow + 1048575 - this.a.StartRow);
        }
      }
    }
    int m = (int)Math.ceil(getColumnCount() / range.getColumnCount());
    int n = (int)Math.ceil(getRowCount() / range.getRowCount());
    int i1 = getFirstColumn();
    int i2 = getFirstRow();
    for (int i3 = 0; i3 < n; i3++)
    {
      int i4 = i2 + range.getRowCount() * i3;
      int i5 = i4 + range.getRowCount() - 1;
      if (i5 >= localCellArea1.EndRow)
      {
        i5 = localCellArea1.EndRow;
        range.a.EndRow = (range.a.StartRow + i5 - i4);
      }
      for (int i6 = 0; i6 < m; i6++)
      {
        int i7 = i1 + range.getColumnCount() * i6;
        int i8 = i7 + range.getColumnCount() - 1;
        if (i8 >= localCellArea1.EndColumn)
        {
          i8 = localCellArea1.EndColumn;
          range.a.EndColumn = (range.a.StartColumn + i8 - i7);
        }
        this.a = CellArea.createCellArea(i4, i7, i5, i8);
        a(range, options);
      }
    }
    this.a = localCellArea1;
    range.a = localCellArea2;
  }
  
  private boolean b(Range paramRange)
  {
    if (this.b == paramRange.b) {
      return (this.a.StartRow == paramRange.a.StartRow) && (this.a.StartColumn == paramRange.a.StartColumn) && (this.a.EndRow == paramRange.a.EndRow) && (this.a.EndColumn == paramRange.a.EndColumn);
    }
    return false;
  }
  
  private void a(Range paramRange, PasteOptions paramPasteOptions)
    throws Exception
  {
    if (b(paramRange)) {
      return;
    }
    Cells localCells = paramRange.b;
    if (this.b != paramRange.b) {
      switch (paramPasteOptions.getPasteType())
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
        this.b.clearRange(a());
        break;
      case 8: 
      case 9: 
      case 11: 
      case 12: 
        this.b.clearContents(a());
        break;
      case 7: 
        break;
      }
    }
    boolean[] arrayOfBoolean = null;
    if (paramPasteOptions.getOnlyVisibleCells())
    {
      arrayOfBoolean = new boolean[paramRange.getColumnCount()];
      for (i = paramRange.a().StartColumn; i <= paramRange.a().EndColumn; i++)
      {
        Column localColumn = localCells.getColumns().c(i);
        if ((localColumn != null) && (localColumn.isHidden())) {
          arrayOfBoolean[(i - paramRange.a().StartColumn)] = true;
        }
      }
    }
    int i = 0;
    if ((paramPasteOptions.getPasteType() == 4) || (paramPasteOptions.getPasteType() == 0) || (paramPasteOptions.getPasteType() == 2))
    {
      for (int j = paramRange.a().StartColumn; j <= paramRange.a().EndColumn; j++)
      {
        int k = j - paramRange.a().StartColumn;
        if ((paramPasteOptions.getOnlyVisibleCells()) && (arrayOfBoolean[k] != 0))
        {
          i++;
        }
        else
        {
          double d1 = localCells.getColumnWidth(j);
          k -= i;
          double d2 = this.b.getColumnWidth(a().StartColumn + k);
          if (Math.abs(d1 - d2) > Double.MIN_VALUE) {
            this.b.setColumnWidth(a().StartColumn + k, d1);
          }
        }
      }
      if (paramPasteOptions.getPasteType() == 4) {
        return;
      }
    }
    CellArea localCellArea1 = paramRange.a;
    CellArea localCellArea2 = this.a;
    if ((paramPasteOptions.getPasteType() == 5) || (paramPasteOptions.getPasteType() == 0) || (paramPasteOptions.getPasteType() == 2))
    {
      if ((this.b != localCells) || (localCellArea1.StartRow != localCellArea2.StartRow)) {
        for (int m = localCellArea1.StartRow; m <= localCellArea1.EndRow; m++)
        {
          int n = paramRange.b.getRows().d(m);
          if (n != -1)
          {
            Row localRow1 = paramRange.b.getRows().getRowByIndex(n);
            Row localRow2 = this.b.getRows().a(localRow1.getIndex() + localCellArea2.StartRow - localCellArea1.StartRow, false, true, false);
            localRow1.b();
            localRow2.f(localRow1.f());
            localRow2.setHidden(localRow1.isHidden());
          }
        }
      }
      if (paramPasteOptions.getPasteType() == 5) {
        return;
      }
    }
    boolean bool = d(paramPasteOptions.getPasteType());
    CopyOptions localCopyOptions = new CopyOptions(2, paramRange.b.g(), this.b.g());
    switch (paramPasteOptions.getPasteType())
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
      if (paramRange.b.g().getListObjects().getCount() > 0) {
        this.b.g().getListObjects().a(paramRange.b.g().getListObjects(), paramRange.a, this.a, localCopyOptions);
      }
      break;
    }
    int i1;
    int i2;
    int i3;
    Object localObject4;
    switch (paramPasteOptions.getPasteType())
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 7: 
      a(paramRange, paramPasteOptions.getTranspose());
      this.b.g().getConditionalFormattings().a(paramRange.b.g().getConditionalFormattings(), paramRange.a(), a(), localCopyOptions, paramPasteOptions.getTranspose());
      i1 = paramRange.getColumnCount();
      i2 = paramRange.getRowCount();
      int i4;
      Object localObject2;
      if ((paramRange.getFirstRow() == 0) && (i2 == 1048576))
      {
        for (i3 = localCellArea2.StartColumn; i3 < localCellArea2.StartColumn + i1; i3++)
        {
          i4 = this.b.getColumns().e(i3);
          if (i4 > -1) {
            this.b.getColumns().removeAt(i4);
          }
        }
        for (i3 = localCellArea1.StartColumn; i3 <= localCellArea1.EndColumn; i3++)
        {
          i4 = paramRange.b.getColumns().e(i3);
          if (i4 > -1)
          {
            localObject2 = paramRange.b.getColumns().getColumnByIndex(i4);
            localObject4 = this.b.getColumns().get(((Column)localObject2).getIndex() + localCellArea2.StartColumn - localCellArea1.StartColumn);
            ((Column)localObject4).a((Column)localObject2);
          }
        }
      }
      if ((paramRange.getFirstColumn() == 0) && (paramRange.getColumnCount() == 16384))
      {
        for (i3 = localCellArea2.StartRow; i3 < localCellArea2.StartRow + i2; i3++)
        {
          i4 = this.b.getRows().d(i3);
          if (i4 != -1) {
            this.b.getRows().removeAt(i4);
          }
        }
        for (i3 = localCellArea1.StartRow; i3 <= localCellArea1.EndRow; i3++)
        {
          i4 = paramRange.b.getRows().d(i3);
          if (i4 != -1)
          {
            localObject2 = paramRange.b.getRows().getRowByIndex(i4);
            localObject4 = this.b.getRows().a(((Row)localObject2).getIndex() + localCellArea2.StartRow - localCellArea1.StartRow, false, true, false);
            ((Row)localObject2).b();
            ((Row)localObject4).a((Row)localObject2);
          }
        }
      }
      break;
    }
    Object localObject1;
    Object localObject5;
    if (paramPasteOptions.getTranspose())
    {
      switch (paramPasteOptions.getPasteType())
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 7: 
      case 8: 
      case 9: 
      case 11: 
      case 12: 
        i1 = paramRange.a().EndRow - paramRange.a().StartRow + 1;
        i2 = paramRange.a().EndColumn - paramRange.a().StartColumn + 1;
        for (i3 = 0; i3 < i1; i3++)
        {
          localObject1 = paramRange.b.checkRow(i3 + paramRange.a().StartRow);
          int i6;
          if (localObject1 == null)
          {
            if (!paramPasteOptions.getSkipBlanks()) {
              for (i6 = 0; i6 < i2; i6++)
              {
                localObject4 = this.b.checkCell(i6 + a().StartRow, i3 + a().StartColumn);
                if (localObject4 != null) {
                  ((Cell)localObject4).b(null, paramPasteOptions.getPasteType(), localCopyOptions);
                }
              }
            }
          }
          else {
            for (i6 = 0; i6 < i2; i6++)
            {
              localObject4 = ((Row)localObject1).getCellOrNull(i6 + paramRange.a().StartColumn);
              if ((localObject4 != null) || (!paramPasteOptions.getSkipBlanks())) {
                if (localObject4 == null)
                {
                  if (!paramPasteOptions.getSkipBlanks())
                  {
                    localObject5 = this.b.checkCell(i6 + a().StartRow, i3 + a().StartColumn);
                    if (localObject5 != null) {
                      ((Cell)localObject5).b((Cell)localObject4, paramPasteOptions.getPasteType(), localCopyOptions);
                    }
                  }
                }
                else
                {
                  localObject5 = this.b.a(i6 + a().StartRow, i3 + a().StartColumn, false);
                  ((Cell)localObject4).b();
                  ((Cell)localObject5).b((Cell)localObject4, paramPasteOptions.getPasteType(), localCopyOptions);
                }
              }
            }
          }
        }
        a(this.a, paramPasteOptions);
        break;
      }
    }
    else
    {
      i1 = 0;
      switch (paramPasteOptions.getPasteType())
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 7: 
      case 8: 
      case 9: 
      case 11: 
      case 12: 
        i2 = paramRange.a().EndRow - paramRange.a().StartRow + 1;
        i3 = paramRange.a().EndColumn - paramRange.a().StartColumn + 1;
        Object localObject3;
        Object localObject6;
        if (this.b == localCells)
        {
          localObject1 = zban.e(paramRange.a(), a());
          if (localObject1 != null)
          {
            localObject3 = (CellArea)localObject1;
            localObject4 = new Cell[i2][];
            localObject5 = paramRange.b.a(i2, 10, i3, 5);
            localObject6 = new zbdx();
            ((zbdx)localObject6).a(0, paramRange.b);
            Row localRow3;
            Object localObject7;
            for (int i9 = 0; i9 < i2; i9++)
            {
              localRow3 = paramRange.b.checkRow(i9 + paramRange.a().StartRow);
              if (localRow3 != null)
              {
                localObject4[i9] = new Cell[i3];
                ((zbdx)localObject6).a = localRow3.getIndex();
                zt localzt = ((zv)localObject5).f(((zv)localObject5).a(-1, (zbdx)localObject6, i3));
                localObject7 = new Row(paramRange.b, paramRange.b.getRows(), localzt, false);
                for (int i12 = 0; i12 < i3; i12++)
                {
                  Cell localCell4 = localRow3.getCellOrNull(i12 + paramRange.a().StartColumn);
                  if (localCell4 != null) {
                    if ((localCell4.getRow() >= ((CellArea)localObject3).StartRow) && (localCell4.getRow() <= ((CellArea)localObject3).EndRow) && (localCell4.getColumn() >= ((CellArea)localObject3).StartColumn) && (localCell4.getColumn() <= ((CellArea)localObject3).EndColumn))
                    {
                      zgs localzgs = new zgs();
                      localzgs.a = ((short)localCell4.getColumn());
                      int i13 = localzt.a(-1, localzgs);
                      if (localzgs.a > paramRange.b.getMaxColumn()) {
                        paramRange.b.a(localzgs.a);
                      }
                      Cell localCell5 = new Cell((Row)localObject7, i13);
                      localCell5.c(localCell4, localCopyOptions);
                      localObject4[i9][i12] = localCell5;
                    }
                    else
                    {
                      localObject4[i9][i12] = localCell4;
                    }
                  }
                }
              }
            }
            for (i9 = 0; i9 < i2; i9++) {
              if (localObject4[i9] == null)
              {
                if (!paramPasteOptions.getSkipBlanks())
                {
                  localRow3 = this.b.checkRow(i9 + a().StartRow);
                  if (localRow3 != null) {
                    for (int i11 = 0; i11 < i3; i11++)
                    {
                      localObject7 = localRow3.getCellOrNull(i11 + a().StartColumn);
                      if (localObject7 != null) {
                        ((Cell)localObject7).b(null, paramPasteOptions.getPasteType(), localCopyOptions);
                      }
                    }
                  }
                }
              }
              else {
                for (int i10 = 0; i10 < i3; i10++)
                {
                  Cell localCell3;
                  if (localObject4[i9][i10] == null)
                  {
                    if (!paramPasteOptions.getSkipBlanks())
                    {
                      localCell3 = this.b.checkCell(i9 + a().StartRow, i10 + a().StartColumn);
                      if (localCell3 != null) {
                        localCell3.b(null, paramPasteOptions.getPasteType(), localCopyOptions);
                      }
                    }
                  }
                  else
                  {
                    localCell3 = this.b.a(i9 + a().StartRow, i10 + a().StartColumn, false);
                    localObject4[i9][i10].b();
                    localCell3.b(localObject4[i9][i10], paramPasteOptions.getPasteType(), localCopyOptions);
                  }
                }
              }
            }
            break;
          }
        }
        for (int i5 = 0; i5 < i2; i5++)
        {
          localObject3 = paramRange.b.checkRow(i5 + paramRange.a().StartRow);
          localObject4 = this.b.checkRow(i5 + a().StartRow);
          int i7;
          if (localObject3 == null)
          {
            if ((!paramPasteOptions.getSkipBlanks()) && (localObject4 != null)) {
              for (i7 = 0; i7 < i3; i7++)
              {
                localObject6 = ((Row)localObject4).getCellOrNull(i7 + a().StartColumn);
                if (localObject6 != null) {
                  ((Cell)localObject6).b(null, paramPasteOptions.getPasteType(), localCopyOptions);
                }
              }
            }
          }
          else if ((((Row)localObject3).isHidden()) && (paramPasteOptions.getOnlyVisibleCells()))
          {
            i1++;
          }
          else
          {
            i = 0;
            i7 = (bool) && (!((Row)localObject3).b((Row)localObject4)) ? 1 : 0;
            for (int i8 = 0; i8 < i3; i8++)
            {
              Cell localCell1 = ((Row)localObject3).getCellOrNull(i8 + paramRange.a().StartColumn);
              if ((paramPasteOptions.getOnlyVisibleCells()) && (arrayOfBoolean[i8] != 0))
              {
                i++;
              }
              else
              {
                Cell localCell2;
                if (localCell1 == null)
                {
                  if (!paramPasteOptions.getSkipBlanks())
                  {
                    localCell2 = this.b.a(i5 + a().StartRow - i1, i8 + a().StartColumn - i, i7 == 0);
                    if (localCell2 != null)
                    {
                      localCell2.b(null, paramPasteOptions.getPasteType(), localCopyOptions);
                      if (i7 != 0) {
                        if (localCopyOptions.c()) {
                          localCell2.b(((Row)localObject3).e());
                        } else {
                          localCell2.a(((Row)localObject3).getStyle(), localCopyOptions);
                        }
                      }
                    }
                  }
                }
                else
                {
                  localCell2 = this.b.a(i5 + a().StartRow - i1, i8 + a().StartColumn - i, false);
                  localCell1.b();
                  localCell2.b(localCell1, paramPasteOptions.getPasteType(), localCopyOptions);
                }
              }
            }
          }
        }
        a(this.a, paramPasteOptions);
        break;
      }
    }
    switch (paramPasteOptions.getPasteType())
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 6: 
      this.b.g().getComments().a(paramRange, this, paramPasteOptions.getTranspose(), localCopyOptions);
      break;
    }
    switch (paramPasteOptions.getPasteType())
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 10: 
      this.b.g().getValidations().a(paramRange.b.g().getValidations(), paramRange.a(), a(), localCopyOptions, paramPasteOptions.getTranspose());
      break;
    }
    switch (paramPasteOptions.getPasteType())
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
      if ((paramRange.b.g().getShapes().getCount() != 0) && (!paramPasteOptions.getTranspose())) {
        this.b.g().getShapes().a(paramRange.b.g().getShapes(), paramRange.a, this.a, localCopyOptions);
      }
      if (paramRange.b.g().getHyperlinks().getCount() != 0) {
        this.b.g().getHyperlinks().a(paramRange.b.g().getHyperlinks(), paramRange.a, this.a, localCopyOptions);
      }
      break;
    }
  }
  
  public void copy(Range range)
    throws Exception
  {
    PasteOptions localPasteOptions = new PasteOptions();
    localPasteOptions.setPasteType(1);
    copy(range, localPasteOptions);
  }
  
  public Cell get(int rowIndex, int columnIndex)
  {
    if ((rowIndex < 0) || (rowIndex >= getRowCount()) || (columnIndex < 0) || (columnIndex >= getColumnCount())) {
      throw new CellsException(6, "Row or column is out of the range.");
    }
    return this.b.a(getFirstRow() + rowIndex, getFirstColumn() + columnIndex, false);
  }
  
  public Cell getCellOrNull(int rowIndex, int columnIndex)
  {
    if ((rowIndex < 0) || (rowIndex >= getRowCount()) || (columnIndex < 0) || (columnIndex >= getColumnCount())) {
      throw new CellsException(6, "Row or column is out of the range.");
    }
    return this.b.checkCell(getFirstRow() + rowIndex, getFirstColumn() + columnIndex);
  }
  
  public Worksheet getWorksheet()
  {
    return this.b.g();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Aspose.Cells.Range [ ");
    if (this.d != null) {
      return zs.a(localStringBuilder.append(this.d).append(" : ").append(this.b.g().getName()).append("!").append(c()).append(" ]"));
    }
    return zs.a(localStringBuilder.append(this.b.g().getName()).append("!").append(c()).append(" ]"));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Range.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */