package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Cells
  implements zj, Iterable
{
  zabw a;
  zahq b;
  zahp c;
  private int e;
  private boolean f;
  private HorizontalPageBreakCollection g;
  private VerticalPageBreakCollection h;
  private zv i;
  private RowCollection j;
  private Worksheet k;
  private PageSetup l;
  private boolean m = znq.t;
  private int n = -1;
  private int o = -1;
  private int p = -1;
  private int q = -1;
  private Row r = null;
  private int s = -1;
  private int t = -1;
  private zapd u;
  short d = -1;
  private byte v = 0;
  private ColumnCollection w;
  private byte x;
  private byte y;
  private RangeCollection z;
  
  public void dispose()
  {
    this.r = null;
    this.c = null;
    this.b = null;
    this.a = null;
    this.g = null;
    this.w = null;
    this.j = null;
    this.i = null;
    this.u = null;
    this.l = null;
    this.z = null;
    this.k = null;
    this.h = null;
    zg.a(this);
  }
  
  public int getCount()
  {
    if (this.t < 0)
    {
      this.t = 0;
      zaiv localzaiv = this.i.b();
      for (;;)
      {
        int i1 = localzaiv.a();
        if (i1 < 0) {
          break;
        }
        zt localzt = this.i.f(i1);
        this.t += localzt.a();
      }
    }
    return this.t;
  }
  
  public Iterator iterator()
  {
    return new zie(this, false, 7);
  }
  
  public Iterator getRowEnumerator()
  {
    return this.j.a.a(-1, -1, false);
  }
  
  int a()
  {
    return this.e;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  HorizontalPageBreakCollection b()
  {
    return this.g;
  }
  
  VerticalPageBreakCollection c()
  {
    return this.h;
  }
  
  void a(zajl paramzajl)
  {
    this.i.a(paramzajl);
    this.j.d.a(paramzajl);
  }
  
  zajl d()
  {
    return this.k.d().getWorksheets().g;
  }
  
  zv e()
  {
    return this.i;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.i = a(paramInt1, paramInt2, 20, paramInt3);
    this.j.a(this.i);
  }
  
  void f()
  {
    this.i.j(64, 32);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.i.j(paramInt1, paramInt2);
  }
  
  zv a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.i.d()) {
      return a(1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    return a(0, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private zv a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Object localObject;
    switch (paramInt1)
    {
    case 1: 
      localObject = new zbdl(paramInt2, paramInt3, paramInt4, paramInt5, this.k.c().g, this.a);
      break;
    default: 
      localObject = new zbdm(paramInt2, paramInt4, this.k.c().g, this.a);
    }
    ((zv)localObject).a(this.m);
    return (zv)localObject;
  }
  
  public RowCollection getRows()
  {
    return this.j;
  }
  
  Cells(Worksheet sheet)
  {
    this.k = sheet;
    u();
  }
  
  Worksheet g()
  {
    return this.k;
  }
  
  private void u()
  {
    this.a = new zabw(this.k);
    this.z = new RangeCollection();
    this.g = new HorizontalPageBreakCollection();
    this.h = new VerticalPageBreakCollection();
    this.u = new zapd();
    int i1 = p().U() * 8 + zlp.a;
    int i2 = (i1 / 8 + 1) * 8;
    double d1 = 8.0D + (i2 - i1) * 1.0D / p().U();
    this.e = ((int)p().a);
    this.f = false;
    this.i = a(this.k.d().getSettings().getMemorySetting(), 64, 32, 16, 16);
    this.j = new RowCollection(this, this.i);
    this.l = new PageSetup(this.k, this.k);
    this.w = new ColumnCollection(this.k, d1);
    l();
    k();
  }
  
  PageSetup h()
  {
    return this.l;
  }
  
  public ArrayList getMergedCells()
  {
    ArrayList localArrayList = this.u.a();
    return localArrayList;
  }
  
  void i()
  {
    if ((this.u == null) || (this.u.getCount() < 1)) {
      return;
    }
    for (int i1 = 0; i1 < this.u.getCount() - 1; i1++)
    {
      CellArea localCellArea1 = this.u.a(i1);
      for (int i2 = this.u.getCount() - 1; i2 > i1; i2--)
      {
        CellArea localCellArea2 = this.u.a(i2);
        if (zban.e(localCellArea1, localCellArea2) != null) {
          if ((!p().p().h()) && (!zban.a(localCellArea1, localCellArea2)))
          {
            localCellArea1 = zban.c(localCellArea1, localCellArea2);
            this.u.removeAt(i2);
            i2 = this.u.getCount();
          }
          else
          {
            this.u.removeAt(i2);
          }
        }
      }
      this.u.a(i1, localCellArea1);
    }
  }
  
  void j()
  {
    p().p().a();
    Column localColumn = null;
    for (int i1 = this.w.getCount() - 1; i1 >= 0; i1--)
    {
      localColumn = this.w.getColumnByIndex(i1);
      if (localColumn.getIndex() <= 255) {
        break;
      }
      this.w.removeAt(i1);
    }
    m();
    this.j.d.a();
    i1 = e().b(65536);
    if (i1 < 0) {
      i1 = -i1 - 1;
    }
    e().d(i1, -1);
    Object localObject;
    if (this.d > 255)
    {
      zaiv localzaiv = e().b();
      localObject = null;
      for (;;)
      {
        i1 = localzaiv.a();
        if (i1 < 0) {
          break;
        }
        localObject = e().f(i1);
        i1 = ((zt)localObject).b(256);
        if (i1 < 0) {
          i1 = -i1 - 1;
        }
        ((zt)localObject).d(i1, -1);
      }
      this.d = 255;
    }
    if (this.u != null) {
      this.u.b();
    }
    int i2;
    if ((this.g != null) && (this.g.getCount() > 0)) {
      for (i2 = this.g.getCount() - 1; i2 >= 0; i2--)
      {
        localObject = this.g.get(i2);
        if ((((HorizontalPageBreak)localObject).getRow() > 65535) || (((HorizontalPageBreak)localObject).getStartColumn() > 255)) {
          this.g.removeAt(i2);
        } else if (((HorizontalPageBreak)localObject).getEndColumn() > 255) {
          ((HorizontalPageBreak)localObject).b(255);
        }
      }
    }
    if ((this.h != null) && (this.h.getCount() > 0)) {
      for (i2 = this.h.getCount() - 1; i2 >= 0; i2--)
      {
        localObject = this.h.get(i2);
        if ((((VerticalPageBreak)localObject).getColumn() > 255) || (((VerticalPageBreak)localObject).getStartRow() > 65535)) {
          this.h.removeAt(i2);
        } else if (((VerticalPageBreak)localObject).getEndRow() > 65535) {
          ((VerticalPageBreak)localObject).b(65535);
        }
      }
    }
    if (this.k.getListObjects().getCount() != 0)
    {
      ListObjectCollection localListObjectCollection = this.k.getListObjects();
      for (int i3 = 0; i3 < localListObjectCollection.getCount(); i3++)
      {
        ListObject localListObject = localListObjectCollection.get(i3);
        if ((localListObject.getStartRow() > 65535) || (localListObject.getStartColumn() > 255) || (localListObject.getEndRow() > 65535) || (localListObject.getEndColumn() > 255)) {
          localListObjectCollection.removeAt(i3--);
        } else {
          for (int i4 = localListObject.getStartRow(); i4 <= localListObject.getEndRow(); i4++)
          {
            Row localRow = checkRow(i4);
            if (localRow != null) {
              for (int i5 = localListObject.getStartColumn(); i5 <= localListObject.getEndColumn(); i5++)
              {
                Cell localCell = localRow.getCellOrNull(i5);
                if ((localCell != null) && (localCell.g()))
                {
                  byte[] arrayOfByte = localCell.v();
                  arrayOfByte = zaaq.a(arrayOfByte, -1, -1, this.k);
                  localCell.a(arrayOfByte);
                }
              }
            }
          }
        }
      }
    }
  }
  
  void k()
  {
    this.b = new zlu(this);
  }
  
  void l()
  {
    this.c = new zls(this);
  }
  
  /**
   * @deprecated
   */
  public Cell getCell(int row, int column)
  {
    return get(row, column);
  }
  
  /**
   * @deprecated
   */
  public Row getRow(int row)
  {
    return getRows().get(row);
  }
  
  /**
   * @deprecated
   */
  public Column getColumn(int columnIndex)
  {
    return getColumns().get(columnIndex);
  }
  
  public Cell checkCell(int row, int column)
  {
    return this.j.a.a(row, column);
  }
  
  public Row checkRow(int row)
  {
    return this.j.a.b(row);
  }
  
  public Column checkColumn(int columnIndex)
  {
    return getColumns().c(columnIndex);
  }
  
  public boolean isRowHidden(int rowIndex)
  {
    zt localzt = this.j.a.a(rowIndex);
    if (localzt == null) {
      return isDefaultRowHidden();
    }
    return Row.a(localzt);
  }
  
  public boolean isColumnHidden(int columnIndex)
  {
    Column localColumn = getColumns().c(columnIndex);
    if (localColumn == null) {
      return getColumns().b(columnIndex);
    }
    return localColumn.isHidden();
  }
  
  public void addRange(Range rangeObject)
  {
    this.z.add(rangeObject);
  }
  
  public Range createRange(String upperLeftCell, String lowerRightCell)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int[] arrayOfInt1 = { i1 };
    int[] arrayOfInt2 = { i3 };
    CellsHelper.a(upperLeftCell, arrayOfInt1, arrayOfInt2);
    i1 = arrayOfInt1[0];
    i3 = arrayOfInt2[0];
    int[] arrayOfInt3 = { i2 };
    int[] arrayOfInt4 = { i4 };
    CellsHelper.a(lowerRightCell, arrayOfInt3, arrayOfInt4);
    i2 = arrayOfInt3[0];
    i4 = arrayOfInt4[0];
    if ((i1 > i2) || (i3 > i4)) {
      throw new IllegalArgumentException("The row and column index of upper left cell should be no more than lower right cell.");
    }
    return createRange(i1, i3, i2 - i1 + 1, i4 - i3 + 1);
  }
  
  public Range createRange(int firstRow, int firstColumn, int totalRows, int totalColumns)
  {
    if ((totalRows == 0) || (totalColumns == 0)) {
      throw new IllegalArgumentException("Row number or column number cannot be zero");
    }
    zamm.a(firstRow, firstColumn, firstRow + totalRows - 1, firstColumn + totalColumns - 1);
    Range localRange = new Range(firstRow, firstColumn, totalRows, totalColumns, this);
    return localRange;
  }
  
  public Range createRange(String address)
  {
    String str1 = address;
    int i1 = str1.lastIndexOf('!');
    if (i1 != -1) {
      str1 = str1.substring(i1 + 1);
    }
    i1 = str1.indexOf(':');
    if (i1 != -1)
    {
      String str2 = zw.a(str1.substring(0, 0 + i1), "$", "");
      String str3 = zw.a(str1.substring(i1 + 1), "$", "");
      if (Character.isDigit(str2.charAt(0)))
      {
        i4 = zp.a(str2) - 1;
        i5 = zp.a(str3) - 1;
        return createRange(i4, i5 - i4 + 1, false);
      }
      if (Character.isDigit(str2.charAt(str2.length() - 1))) {
        return createRange(str2, str3);
      }
      int i4 = CellsHelper.columnNameToIndex(str2);
      int i5 = CellsHelper.columnNameToIndex(str3);
      return createRange(i4, i5 - i4 + 1, true);
    }
    str1 = zw.a(str1, "$", "");
    int i2 = 0;
    int i3 = 0;
    int[] arrayOfInt1 = { i2 };
    int[] arrayOfInt2 = { i3 };
    CellsHelper.a(str1, arrayOfInt1, arrayOfInt2);
    i2 = arrayOfInt1[0];
    i3 = arrayOfInt2[0];
    return createRange(i2, i3, 1, 1);
  }
  
  public Range createRange(int firstIndex, int number, boolean isVertical)
  {
    if ((firstIndex < 0) || (number <= 0)) {
      throw new IllegalArgumentException();
    }
    if (isVertical)
    {
      zamm.b(firstIndex + number - 1);
      localRange = new Range(0, firstIndex, 1048576, number, this);
      return localRange;
    }
    zamm.a(firstIndex + number - 1);
    Range localRange = new Range(firstIndex, 0, number, 16384, this);
    return localRange;
  }
  
  /**
   * @deprecated
   */
  public Cell get(int index)
  {
    return b(index);
  }
  
  public Cell get(int row, int column)
  {
    zamm.a(row, column);
    return this.j.a(row, column, false, true, true);
  }
  
  public Cell get(String cellName)
  {
    int i1 = 0;
    int i2 = 0;
    int[] arrayOfInt1 = { i1 };
    int[] arrayOfInt2 = { i2 };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i1 = arrayOfInt1[0];
    i2 = arrayOfInt2[0];
    return this.j.a(i1, i2, false, true, true);
  }
  
  public boolean getMultiThreadReading()
  {
    return this.m;
  }
  
  public void setMultiThreadReading(boolean value)
  {
    if (this.m != value)
    {
      this.m = value;
      this.i.a(value);
      this.j.a(this.i);
    }
  }
  
  public int getMemorySetting()
  {
    return this.i.d() ? 1 : 0;
  }
  
  public void setMemorySetting(int value)
  {
    switch (value)
    {
    case 0: 
      if (!this.i.d()) {
        return;
      }
      break;
    case 1: 
      if (this.i.d()) {
        return;
      }
      break;
    }
    m();
    this.j.d.a();
    zv localzv = this.i;
    int i1 = localzv.a();
    if (i1 > 0)
    {
      this.i = a(value, i1, 128, 1, 16);
      this.i.a(-1, localzv, -1, i1, false);
      localzv.e(0);
    }
    else
    {
      this.i = a(value, 128, 128, 16, 16);
    }
    this.j.a(this.i);
  }
  
  void m()
  {
    this.t = -1;
    this.n = -1;
    this.o = -1;
    this.r = null;
  }
  
  Cell b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getCount())) {
      return null;
    }
    if (this.o < 0)
    {
      this.s = paramInt;
      return h(paramInt);
    }
    int i1 = e().b(this.o, this.n);
    if (i1 != this.n)
    {
      this.s = paramInt;
      return h(paramInt);
    }
    i1 = this.r.c.b(this.q, this.p);
    if (i1 != this.p)
    {
      this.s = paramInt;
      return h(paramInt);
    }
    if (paramInt == this.s) {
      return this.r.a(this.p);
    }
    if (paramInt == this.s - 1)
    {
      this.s -= 1;
      this.p = this.r.c.a(this.p, true);
      if (this.p < 0)
      {
        localObject = e().a(-1, this.n, true);
        ((zaiv)localObject).a();
        return a((zaiv)localObject, 0, true);
      }
      localObject = this.r.a(this.p);
      this.q = ((Cell)localObject).getColumn();
      return (Cell)localObject;
    }
    if (paramInt == this.s + 1)
    {
      this.s += 1;
      this.p = this.r.c.a(this.p, false);
      if (this.p < 0)
      {
        localObject = e().a(this.n, -1, false);
        ((zaiv)localObject).a();
        return a((zaiv)localObject, 0, false);
      }
      localObject = this.r.a(this.p);
      this.q = ((Cell)localObject).getColumn();
      return (Cell)localObject;
    }
    if (paramInt < this.s)
    {
      if (this.s - paramInt > this.s / 2)
      {
        this.s = paramInt;
        return a(e().a(-1, -1, false), paramInt, false);
      }
      localObject = this.r.c.a(-1, this.p, true);
      ((zaiv)localObject).a();
      do
      {
        this.p = ((zaiv)localObject).a();
        if (this.p < 0) {
          break;
        }
        this.s -= 1;
      } while (this.s != paramInt);
      localCell = this.r.a(this.p);
      this.q = localCell.getColumn();
      return localCell;
      localObject = e().a(-1, this.n, true);
      ((zaiv)localObject).a();
      paramInt = this.s - paramInt - 1;
      this.s = (this.s - paramInt - 1);
      return a((zaiv)localObject, paramInt, true);
    }
    if (paramInt - this.s > (getCount() - this.s) / 2)
    {
      this.s = paramInt;
      return a(e().a(-1, -1, true), getCount() - paramInt - 1, true);
    }
    Object localObject = this.r.c.a(this.p, -1, false);
    ((zaiv)localObject).a();
    do
    {
      this.p = ((zaiv)localObject).a();
      if (this.p < 0) {
        break;
      }
      this.s += 1;
    } while (this.s != paramInt);
    Cell localCell = this.r.a(this.p);
    this.q = localCell.getColumn();
    return localCell;
    localObject = e().a(-1, this.n, false);
    ((zaiv)localObject).a();
    paramInt = paramInt - this.s - 1;
    this.s = (this.s + paramInt + 1);
    return a((zaiv)localObject, paramInt, false);
  }
  
  private Cell h(int paramInt)
  {
    if (paramInt < (getCount() + 1) / 2) {
      return a(e().a(-1, -1, false), paramInt, false);
    }
    return a(e().a(-1, -1, true), getCount() - paramInt - 1, true);
  }
  
  private Cell a(zaiv paramzaiv, int paramInt)
  {
    for (;;)
    {
      
      if (paramInt < 0)
      {
        this.o = this.r.getIndex();
        this.p = paramzaiv.a();
        Cell localCell = this.r.a(this.p);
        this.q = localCell.getColumn();
        return localCell;
      }
      paramzaiv.a();
    }
  }
  
  private Cell a(zaiv paramzaiv, int paramInt, boolean paramBoolean)
  {
    int i1 = paramInt;
    for (;;)
    {
      this.n = paramzaiv.a();
      if (this.n < 0) {
        break;
      }
      this.r = this.j.b(this.n, false);
      int i2 = this.r.c.a();
      if (i1 < i2) {
        return a(this.r.c.a(-1, -1, paramBoolean), i1);
      }
      i1 -= i2;
    }
    this.t -= i1 + 1;
    m();
    return null;
  }
  
  Cell a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return this.j.a(paramInt1, paramInt2, paramBoolean, true, true);
  }
  
  public void clear()
  {
    this.j.clear();
  }
  
  public Style getStyle()
  {
    return getColumns().a().getStyle();
  }
  
  public void setStyle(Style value)
  {
    getColumns().a().a(value);
  }
  
  public double getStandardWidthInch()
  {
    return getStandardWidthPixels() * 1.0F / zbxp.a();
  }
  
  public void setStandardWidthInch(double value)
  {
    setStandardWidthPixels((int)(value * zbxp.a() + 0.5D));
  }
  
  public int getStandardWidthPixels()
  {
    if (this.k.getShowFormulas()) {
      return zlp.b(getColumns().b(), p()) << 1;
    }
    return zlp.b(getColumns().b(), p());
  }
  
  public void setStandardWidthPixels(int value)
  {
    getColumns().a(zlp.a(this.k, this.k.getShowFormulas() ? value >> 1 : value, p()));
  }
  
  public double getStandardWidth()
  {
    return getColumns().b();
  }
  
  public void setStandardWidth(double value)
  {
    if ((value >= 0.0D) && (value < 256.0D))
    {
      int i1 = zlp.b(value, p());
      double d1 = zlp.a(i1, p());
      getColumns().a(d1);
    }
  }
  
  int n()
  {
    if ((this.v & 0xFF & 0x1) != 0) {
      return this.e;
    }
    return (int)(Math.ceil(this.e / 1440.0D * zbxp.a()) * 1440.0D / zbxp.a());
  }
  
  public double getStandardHeight()
  {
    if ((this.v & 0xFF & 0x1) != 0) {
      return this.e / 20.0D;
    }
    return Math.ceil(this.e / 20.0D * zbxp.a() / 72.0D) * 72.0D / zbxp.a();
  }
  
  public void setStandardHeight(double value)
  {
    if ((value <= 409.5D) && (value >= 0.0D))
    {
      this.e = ((int)(value * 20.0D + 0.5D));
      this.j.a(this.e, false);
      this.v = ((byte)(this.v | 0x1));
    }
  }
  
  public int getStandardHeightPixels()
  {
    return (int)(getStandardHeight() * zbxp.a() / 72.0D + 0.5D);
  }
  
  public void setStandardHeightPixels(int value)
  {
    setStandardHeight(value * 72.0F / zbxp.a());
  }
  
  public int importData(ICellsDataTable table, int firstRow, int firstColumn, ImportTableOptions options)
  {
    return zalz.a(table, this, firstRow, firstColumn, options);
  }
  
  public void importTwoDimensionArray(Object[][] objArray, int firstRow, int firstColumn)
  {
    importTwoDimensionArray(objArray, firstRow, firstColumn, false);
  }
  
  public void importTwoDimensionArray(Object[][] objArray, int firstRow, int firstColumn, boolean convertStringToNumber)
  {
    importTwoDimensionArray(objArray, (Object[][])null, firstRow, firstColumn, convertStringToNumber);
  }
  
  public void importTwoDimensionArray(Object[][] objArray, Object[][] styles, int firstRow, int firstColumn, boolean convertStringToNumber)
  {
    TxtLoadOptions localTxtLoadOptions = new TxtLoadOptions();
    localTxtLoadOptions.setConvertDateTimeData(convertStringToNumber);
    localTxtLoadOptions.setConvertNumericData(convertStringToNumber);
    localTxtLoadOptions.setLoadStyleStrategy(0);
    importTwoDimensionArray(objArray, styles, firstRow, firstColumn, localTxtLoadOptions);
  }
  
  public void importTwoDimensionArray(Object[][] objArray, Object[][] styles, int firstRow, int firstColumn, TxtLoadOptions opts)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = zc.a(objArray, 0);
    int i2 = zc.a(objArray, 1);
    if (i1 + firstRow > 1048575) {
      i1 = 1048575 - firstRow;
    }
    if (i2 + firstColumn > 16383) {
      i2 = 16383 - firstColumn;
    }
    zzx localzzx = this.k.d().getSettings().f();
    zik localzik;
    int i3;
    if (opts.getConvertNumericData())
    {
      localzik = localzzx.h();
      i3 = 1;
    }
    else
    {
      localzik = null;
      i3 = 0;
    }
    zhz localzhz;
    boolean bool;
    int i4;
    if (opts.getConvertDateTimeData())
    {
      localzhz = localzzx.i();
      bool = localzzx.c();
      i4 = 1;
    }
    else
    {
      localzhz = null;
      bool = false;
      i4 = 0;
    }
    zgs localzgs = new zgs();
    zbzv localzbzv = (zbzv)this.k.c().C();
    int i7 = styles != null ? 1 : 0;
    Style localStyle = null;
    for (int i8 = 0; i8 <= i1; i8++)
    {
      Row localRow = getRows().a(i8 + firstRow, false, false, false);
      for (int i9 = 0; i9 <= i2; i9++)
      {
        Cell localCell = localRow.a(firstColumn + i9, false, true);
        if ((i7 != 0) && (styles[i8][i9] != null)) {
          localStyle = (Style)styles[i8][i9];
        } else {
          localStyle = null;
        }
        if ((objArray[i8][i9] instanceof String))
        {
          String str2 = (String)objArray[i8][i9];
          if (str2.startsWith("="))
          {
            localCell.setFormula(str2);
          }
          else
          {
            int i5 = 0;
            int i6 = -1;
            String str1 = "";
            if ((!"".equals(str2)) && (str2.length() < 30) && ((i3 != 0) || (i4 != 0)))
            {
              int i10 = 1;
              Object localObject;
              if (opts.getLoadStyleStrategy() != 2)
              {
                localObject = localCell.p();
                String str3 = ((Style)localObject).s();
                if ((str3 == null) || ("".equals(str3)))
                {
                  int i11 = zzx.b(((Style)localObject).getNumber());
                  if (i11 == 1) {
                    i10 = 0;
                  }
                }
                else if (zaac.a(str3))
                {
                  i10 = 0;
                }
              }
              if (i10 != 0) {
                if ((i3 != 0) && (localzik.parseObject(str2) != null))
                {
                  i5 = 1;
                  localObject = localzik.a();
                  str1 = ((zavq)localObject).e();
                  zayi.a(((zavq)localObject).i(), localzgs);
                  if ((opts.getLoadStyleStrategy() == 1) && (localStyle == null)) {
                    i6 = ((zavq)localObject).b();
                  }
                }
                else if ((i4 != 0) && (localzhz.parseObject(str2) != null))
                {
                  localObject = localzhz.a();
                  if (((zavo)localObject).a(localzzx))
                  {
                    i5 = 1;
                    str1 = ((zavo)localObject).e();
                    if ((opts.getLoadStyleStrategy() == 1) && (localStyle == null)) {
                      i6 = ((zavo)localObject).b();
                    }
                    if (((zavo)localObject).a() == 1) {
                      zayi.a(zbxa.a((DateTime)((zavo)localObject).d(), bool), localzgs);
                    } else {
                      zayi.a(((Double)((zavo)localObject).d()).doubleValue(), localzgs);
                    }
                  }
                }
              }
            }
            if (i5 != 0)
            {
              if (opts.getLoadStyleStrategy() == 0)
              {
                localCell.a(localzgs.c, localzgs.d, true);
              }
              else
              {
                if (localStyle == null) {
                  localzgs.b = localzbzv.a(i6, str1, localCell.r());
                } else {
                  localzgs.b = localzbzv.a(localStyle);
                }
                localCell.a(localzgs, 6, true);
              }
            }
            else
            {
              localCell.putValue(str2);
              if (localStyle != null) {
                localCell.b(localzbzv.a(localStyle));
              }
            }
          }
        }
        else
        {
          localCell.putValue(objArray[i8][i9]);
          if (localStyle != null) {
            localCell.b(localzbzv.a(localStyle));
          }
        }
      }
    }
  }
  
  public void importObjectArray(Object[] objArray, int firstRow, int firstColumn, boolean isVertical)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = objArray.length;
    int i2;
    if (isVertical)
    {
      if (firstRow + i1 > 1048575) {
        i1 = 1048575 - firstRow + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow + i2, firstColumn, false).putValue(objArray[i2]);
      }
    }
    else
    {
      if (firstColumn + i1 > 16383) {
        i1 = 16383 - firstColumn + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow, firstColumn + i2, false).putValue(objArray[i2]);
      }
    }
  }
  
  public void importArrayList(ArrayList arrayList, int firstRow, int firstColumn, boolean isVertical)
  {
    zamm.a(firstRow, firstColumn);
    p().p().a();
    int i1 = arrayList.size();
    int i2;
    if (isVertical)
    {
      if (firstRow + i1 > 1048575) {
        i1 = 1048575 - firstRow + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow + i2, firstColumn, false).putValue(arrayList.get(i2));
      }
    }
    else
    {
      if (firstColumn + i1 > 16383) {
        i1 = 16383 - firstColumn + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow, firstColumn + i2, false).putValue(arrayList.get(i2));
      }
    }
  }
  
  public void importObjectArray(Object[] objArray, int firstRow, int firstColumn, boolean isVertical, int skip)
  {
    p().p().a();
    if ((firstRow < 0) || (skip < 0)) {
      throw new IllegalArgumentException();
    }
    int i1 = objArray.length;
    int i4;
    if (isVertical) {
      for (i4 = 0; i4 < i1; i4++)
      {
        int i2 = firstRow + i4 * (skip + 1);
        if (i2 > 1048575) {
          return;
        }
        a(i2, firstColumn, false).putValue(objArray[i4]);
      }
    } else {
      for (i4 = 0; i4 < i1; i4++)
      {
        int i3 = firstColumn + i4 * (skip + 1);
        if (i3 > 16383) {
          return;
        }
        a(firstRow, i3, false).putValue(objArray[i4]);
      }
    }
  }
  
  public void importArray(String[][] stringArray, int firstRow, int firstColumn)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = zc.a(stringArray, 0);
    int i2 = zc.a(stringArray, 1);
    if (i1 + firstRow > 1048575) {
      i1 = 1048575 - firstRow;
    }
    if (i2 + firstColumn > 16383) {
      i2 = 16383 - firstColumn;
    }
    for (int i3 = 0; i3 <= i1; i3++) {
      for (int i4 = 0; i4 <= i2; i4++) {
        a(firstRow + i3, firstColumn + i4, false).putValue(stringArray[i3][i4]);
      }
    }
  }
  
  public void importFormulaArray(String[] stringArray, int firstRow, int firstColumn, boolean isVertical)
  {
    p().p().a();
    int i1 = stringArray.length;
    int i2;
    if (isVertical)
    {
      if (firstRow + i1 > 1048575) {
        i1 = 1048575 - firstRow + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow + i2, firstColumn, false).setFormula(stringArray[i2]);
      }
    }
    else
    {
      if (firstColumn + i1 > 16383) {
        i1 = 16383 - firstColumn + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow, firstColumn + i2, false).setFormula(stringArray[i2]);
      }
    }
  }
  
  public void importArray(String[] stringArray, int firstRow, int firstColumn, boolean isVertical)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = stringArray.length;
    int i2;
    if (isVertical)
    {
      if (firstRow + i1 > 1048575) {
        i1 = 1048575 - firstRow + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow + i2, firstColumn, false).putValue(stringArray[i2]);
      }
    }
    else
    {
      if (firstColumn + i1 > 16383) {
        i1 = 16383 - firstColumn + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow, firstColumn + i2, false).putValue(stringArray[i2]);
      }
    }
  }
  
  public void importArray(int[][] intArray, int firstRow, int firstColumn)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = zc.a(intArray, 0);
    int i2 = zc.a(intArray, 1);
    if (i1 + firstRow > 1048575) {
      i1 = 1048575 - firstRow;
    }
    if (i2 + firstColumn > 16383) {
      i2 = 16383 - firstColumn;
    }
    for (int i3 = 0; i3 <= i1; i3++) {
      for (int i4 = 0; i4 <= i2; i4++) {
        a(firstRow + i3, firstColumn + i4, false).putValue(intArray[i3][i4]);
      }
    }
  }
  
  public void importArray(int[] intArray, int firstRow, int firstColumn, boolean isVertical)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = intArray.length;
    int i2;
    if (isVertical)
    {
      if (firstRow + i1 > 1048575) {
        i1 = 1048575 - firstRow + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow + i2, firstColumn, false).putValue(intArray[i2]);
      }
    }
    else
    {
      if (firstColumn + i1 > 16383) {
        i1 = 16383 - firstColumn + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow, firstColumn + i2, false).putValue(intArray[i2]);
      }
    }
  }
  
  public void importArray(double[][] doubleArray, int firstRow, int firstColumn)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = zc.a(doubleArray, 0);
    int i2 = zc.a(doubleArray, 1);
    if (i1 + firstRow > 1048575) {
      i1 = 1048575 - firstRow;
    }
    if (i2 + firstColumn > 16383) {
      i2 = 16383 - firstColumn;
    }
    for (int i3 = 0; i3 <= i1; i3++) {
      for (int i4 = 0; i4 <= i2; i4++) {
        a(firstRow + i3, firstColumn + i4, false).putValue(doubleArray[i3][i4]);
      }
    }
  }
  
  public void importArray(double[] doubleArray, int firstRow, int firstColumn, boolean isVertical)
  {
    p().p().a();
    if ((firstRow < 0) || (firstRow > 1048575)) {
      throw new IllegalArgumentException("First row index is out of range.");
    }
    if ((firstColumn < 0) || (firstColumn > 16383)) {
      throw new IllegalArgumentException("First column index is out of range.");
    }
    int i1 = doubleArray.length;
    int i2;
    if (isVertical)
    {
      if (firstRow + i1 > 1048575) {
        i1 = 1048575 - firstRow + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow + i2, firstColumn, false).putValue(doubleArray[i2]);
      }
    }
    else
    {
      if (firstColumn + i1 > 16383) {
        i1 = 16383 - firstColumn + 1;
      }
      for (i2 = 0; i2 < i1; i2++) {
        a(firstRow, firstColumn + i2, false).putValue(doubleArray[i2]);
      }
    }
  }
  
  public void textToColumns(int row, int column, int totalRows, TxtLoadOptions options)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zo localzo = new zo(localzh);
    for (int i1 = 0; i1 < totalRows; i1++)
    {
      Cell localCell = getCell(row + i1, column);
      if (localCell == null) {
        localzo.f();
      } else {
        localzo.c(localCell.getDisplayStringValue());
      }
    }
    localzo.c();
    localzh.b();
    a(localzh, options, row, column);
  }
  
  public void importCSV(String fileName, String spliter, boolean convertNumericData, int firstRow, int firstColumn)
    throws Exception
  {
    TxtLoadOptions localTxtLoadOptions = new TxtLoadOptions();
    localTxtLoadOptions.setSeparatorString(spliter);
    localTxtLoadOptions.setConvertNumericData(convertNumericData);
    localTxtLoadOptions.setConvertDateTimeData(convertNumericData);
    if (!p().p().getSettings().l) {
      localTxtLoadOptions.setEncoding(p().p().getSettings().g());
    }
    zbyz.a(fileName, this, firstRow, firstColumn, localTxtLoadOptions);
  }
  
  void a(zm paramzm, String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
    throws Exception
  {
    TxtLoadOptions localTxtLoadOptions = new TxtLoadOptions();
    localTxtLoadOptions.setSeparatorString(paramString);
    localTxtLoadOptions.setConvertNumericData(paramBoolean);
    localTxtLoadOptions.setConvertDateTimeData(paramBoolean);
    zn localzn;
    if (p().p().getSettings().l)
    {
      localzn = new zn(paramzm);
    }
    else
    {
      localzn = new zn(paramzm, p().p().getSettings().g());
      localTxtLoadOptions.setEncoding(p().p().getSettings().g());
    }
    zbyz.a(localzn, this, paramInt1, paramInt2, localTxtLoadOptions);
  }
  
  public void importCSV(InputStream stream, String spliter, boolean convertNumericData, int firstRow, int firstColumn)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(stream);
    a(localzh, spliter, convertNumericData, firstRow, firstColumn);
  }
  
  public void importCSV(String fileName, TxtLoadOptions options, int firstRow, int firstColumn)
    throws Exception
  {
    zbyz.a(fileName, this, firstRow, firstColumn, options);
  }
  
  void a(zm paramzm, TxtLoadOptions paramTxtLoadOptions, int paramInt1, int paramInt2)
    throws Exception
  {
    zn localzn;
    if (paramTxtLoadOptions.a) {
      localzn = new zn(paramzm);
    } else {
      localzn = new zn(paramzm, paramTxtLoadOptions.getEncoding());
    }
    zbyz.a(localzn, this, paramInt1, paramInt2, paramTxtLoadOptions);
  }
  
  public void importCSV(InputStream stream, TxtLoadOptions options, int firstRow, int firstColumn)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(stream);
    a(localzh, options, firstRow, firstColumn);
  }
  
  public boolean getPreserveString()
  {
    return this.f;
  }
  
  public void setPreserveString(boolean value)
  {
    this.f = value;
  }
  
  public void merge(int firstRow, int firstColumn, int totalRows, int totalColumns)
  {
    this.u.a(this, firstRow, firstColumn, totalRows, totalColumns);
  }
  
  public void merge(int firstRow, int firstColumn, int totalRows, int totalColumns, boolean mergeConflict)
  {
    this.u.a(this, firstRow, firstColumn, totalRows, totalColumns, true, mergeConflict);
  }
  
  public void merge(int firstRow, int firstColumn, int totalRows, int totalColumns, boolean checkConflict, boolean mergeConflict)
  {
    this.u.a(this, firstRow, firstColumn, totalRows, totalColumns, checkConflict, mergeConflict);
  }
  
  public void unMerge(int firstRow, int firstColumn, int totalRows, int totalColumns)
  {
    this.u.a(firstRow, firstColumn, totalRows, totalColumns);
  }
  
  public void hideRow(int row)
  {
    this.j.get(row).setHidden(true);
  }
  
  public void unhideRow(int row, double height)
  {
    int i1 = this.j.e(row);
    if (i1 > -1)
    {
      byte b1 = this.i.k(i1, 0);
      if (zbdx.c(b1)) {
        this.i.a(i1, 0, zbdx.b(b1, false));
      }
    }
  }
  
  public void hideRows(int row, int totalRows)
  {
    for (int i1 = 0; i1 < totalRows; i1++) {
      getRows().a(row + i1, false, false, false).setHidden(true);
    }
  }
  
  public void unhideRows(int row, int totalRows, double height)
  {
    if (totalRows == 1)
    {
      unhideRow(row, height);
      return;
    }
    zaiv localzaiv = this.i.b(row, row + totalRows - 1, false);
    if (localzaiv != null)
    {
      int i2;
      int i1;
      if (height > 0.0D)
      {
        i2 = (short)(int)(height * 20.0D + 0.5D);
        int i3 = 5;
        zbdx localzbdx1 = new zbdx();
        for (;;)
        {
          i1 = localzaiv.a();
          if (i1 < 0) {
            return;
          }
          zbdx localzbdx2 = this.i.b(i1, localzbdx1, 1);
          if (localzbdx2.b())
          {
            localzbdx2.b(false);
            localzbdx2.e = i2;
            this.i.c(i1, localzbdx2, i3);
          }
        }
      }
      for (;;)
      {
        i1 = localzaiv.a();
        if (i1 < 0) {
          return;
        }
        i2 = this.i.k(i1, 0);
        if (zbdx.c(i2)) {
          this.i.a(i1, 0, zbdx.b(i2, false));
        }
      }
    }
  }
  
  public void setRowHeightPixel(int row, int pixels)
  {
    double d1 = pixels * 72.0F / zbxp.a();
    setRowHeight(row, d1);
  }
  
  public void setRowHeightInch(int row, double inches)
  {
    setRowHeight(row, inches * 72.0D);
  }
  
  public void setRowHeight(int row, double height)
  {
    if ((height < 0.0D) || (height > 409.5D)) {
      throw new CellsException(6, "Row height must be between 0 and 409.");
    }
    int i1 = (int)(height * 20.0D + 0.5D);
    int i2 = i1;
    Row localRow = this.j.a(row, false, true, false);
    localRow.f(i2);
    if (height != 0.0D) {
      localRow.setHeightMatched(false);
    } else {
      localRow.setHeightMatched(true);
    }
  }
  
  public double getRowHeight(int row)
  {
    zamm.a(row);
    return this.j.b.b(row);
  }
  
  int c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 1048575)) {
      return (int)(getStandardHeight() * zbxp.a() / 72.0D);
    }
    int i1 = this.j.e(paramInt);
    if (i1 < 0) {
      return (int)(getStandardHeight() * zbxp.a() / 72.0D);
    }
    return (int)(Row.a(this.i, i1) * zbxp.a() / 72.0D);
  }
  
  public void hideColumn(int column)
  {
    getColumns().get(column).setHidden(true);
  }
  
  public void unhideColumn(int column, double width)
  {
    unhideColumns(column, 1, width);
  }
  
  public void hideColumns(int column, int totalColumns)
  {
    for (int i1 = 0; i1 < totalColumns; i1++) {
      getColumns().get(i1 + column).setHidden(true);
    }
  }
  
  public void unhideColumns(int column, int totlaColumns, double width)
  {
    if (width > 0.0D) {
      width = zlp.a(width, p());
    }
    for (int i1 = 0; i1 < totlaColumns; i1++)
    {
      boolean bool = this.w.b(column + i1);
      Column localColumn;
      if (bool)
      {
        localColumn = this.w.get(column + i1);
        localColumn.setHidden(false);
        if (width > 0.0D) {
          localColumn.setWidth(width);
        } else if (localColumn.a == 0.0D) {
          localColumn.a = getStandardWidth();
        }
      }
      else
      {
        localColumn = this.w.c(column + i1);
        if ((localColumn != null) && (localColumn.isHidden()))
        {
          localColumn.setHidden(false);
          if (width > 0.0D) {
            localColumn.setWidth(width);
          } else if (localColumn.a == 0.0D) {
            localColumn.a = getStandardWidth();
          }
        }
      }
    }
  }
  
  public int getRowHeightPixel(int row)
  {
    zamm.a(row);
    return this.j.b.a(row);
  }
  
  public double getRowHeightInch(int row)
  {
    zamm.a(row);
    return this.j.b.c(row);
  }
  
  public void setColumnWidthPixel(int column, int pixel)
  {
    setColumnWidth(column, zlp.a(this.k, this.k.getShowFormulas() ? pixel >> 1 : pixel, p()));
  }
  
  public void setColumnWidthInch(int column, double inches)
  {
    setColumnWidthPixel(column, (int)(zbxp.a() * inches + 0.5D));
  }
  
  public void setColumnWidth(int column, double width)
  {
    if ((width > 255.0D) || (width < 0.0D)) {
      throw new CellsException(6, "Column width must be between 0 and 255");
    }
    int i1 = zlp.b(width, p());
    width = zlp.a(i1, p());
    Column localColumn = this.w.get(column);
    localColumn.setWidth(width);
  }
  
  int d(int paramInt)
  {
    zamm.b(paramInt);
    int i1 = this.w.e(paramInt);
    double d1;
    if (i1 > -1)
    {
      Column localColumn = this.w.getColumnByIndex(i1);
      d1 = localColumn.getWidth();
    }
    else
    {
      d1 = getColumns().a(paramInt, true);
    }
    if (this.k.getShowFormulas()) {
      return zlp.b(d1, p()) << 1;
    }
    return zlp.b(d1, p());
  }
  
  public int getViewColumnWidthPixel(int column)
  {
    if (this.k.getShowFormulas()) {
      return zlp.a(getColumnWidth(column), this.k) << 1;
    }
    return zlp.a(getColumnWidth(column), this.k);
  }
  
  public int getColumnWidthPixel(int column)
  {
    zamm.b(column);
    return this.b.a(column);
  }
  
  public double getColumnWidthInch(int column)
  {
    zamm.b(column);
    return this.b.b(column);
  }
  
  public double getColumnWidth(int column)
  {
    zamm.b(column);
    int i1 = this.w.e(column);
    if (i1 > -1)
    {
      Column localColumn = this.w.getColumnByIndex(i1);
      if (localColumn.isHidden()) {
        return 0.0D;
      }
      return localColumn.getWidth();
    }
    return getColumns().a(column, false);
  }
  
  zapd o()
  {
    return this.u;
  }
  
  WorksheetCollection p()
  {
    return this.k.c();
  }
  
  public int getMinRow()
  {
    zaiv localzaiv = this.i.a(-1, -1, false);
    zt localzt;
    do
    {
      int i1 = localzaiv.a();
      if (i1 < 0) {
        break;
      }
      localzt = this.i.f(i1);
    } while (localzt.a() <= 0);
    return localzt.i();
    return 0;
  }
  
  public int getMaxRow()
  {
    return this.j.a.a();
  }
  
  public int getMinColumn()
  {
    int i1 = -1;
    zaiv localzaiv = this.i.a(-1, -1, false);
    for (;;)
    {
      int i2 = localzaiv.a();
      if (i2 < 0) {
        break;
      }
      zt localzt = this.i.f(i2);
      if (localzt.a() > 0)
      {
        int i3 = localzt.a(localzt.a(-1, false));
        if (i3 == 0) {
          return 0;
        }
        if ((i3 < i1) || (i1 < 0)) {
          i1 = i3;
        }
      }
    }
    return i1 < 0 ? 0 : i1;
  }
  
  public int getMaxColumn()
  {
    return this.d;
  }
  
  public int getMinDataRow()
  {
    zaiv localzaiv1 = this.i.a(-1, -1, false);
    int i1 = localzaiv1.a();
    if (i1 >= 0)
    {
      zt localzt = this.i.f(i1);
      zaiv localzaiv2 = localzt.b();
      do
      {
        i1 = localzaiv2.a();
        if (i1 < 0) {
          break;
        }
      } while (localzt.h(i1) == 0);
      return localzt.i();
    }
    return -1;
  }
  
  public int getMaxDataRow()
  {
    return this.j.a.a_();
  }
  
  public int getMinDataColumn()
  {
    int i1 = Integer.MAX_VALUE;
    zaiv localzaiv1 = this.i.b();
    for (;;)
    {
      int i2 = localzaiv1.a();
      if (i2 < 0) {
        break;
      }
      zt localzt = this.i.f(i2);
      zaiv localzaiv2 = localzt.a(-1, -1, false);
      int i3;
      do
      {
        i2 = localzaiv2.a();
        if (i2 < 0) {
          break;
        }
        i3 = localzt.a(i2);
        if (i3 > i1) {
          break;
        }
      } while (localzt.h(i2) == 0);
      if (i3 == 0) {
        return 0;
      }
      i1 = i3;
    }
    if (i1 == Integer.MAX_VALUE) {
      return -1;
    }
    return i1;
  }
  
  public int getMaxDataColumn()
  {
    int i1 = -1;
    zaiv localzaiv1 = this.i.b();
    for (;;)
    {
      int i2 = localzaiv1.a();
      if (i2 < 0) {
        break;
      }
      zt localzt = this.i.f(i2);
      zaiv localzaiv2 = localzt.a(-1, -1, true);
      int i3;
      do
      {
        i2 = localzaiv2.a();
        if (i2 < 0) {
          break;
        }
        i3 = localzt.a(i2);
        if (i3 < i1) {
          break;
        }
      } while (localzt.h(i2) == 0);
      i1 = i3;
    }
    return i1;
  }
  
  public int getLastDataRow(int column)
  {
    if (this.i.a() > 0)
    {
      zaiv localzaiv = this.i.a(-1, -1, true);
      for (;;)
      {
        int i1 = localzaiv.a();
        if (i1 < 0) {
          break;
        }
        zt localzt = this.i.f(i1);
        if (localzt.a() > 0)
        {
          i1 = localzt.b(column);
          if ((i1 > -1) && (localzt.h(i1) != 0)) {
            return localzt.i();
          }
        }
      }
    }
    return 0;
  }
  
  int e(int paramInt)
  {
    int i1 = this.j.a.a();
    if (i1 < 0) {
      return paramInt;
    }
    return i1;
  }
  
  void a(short paramShort)
  {
    this.d = paramShort;
  }
  
  int b(short paramShort)
  {
    if (this.d < 0) {
      return paramShort;
    }
    return this.d;
  }
  
  byte q()
  {
    return this.v;
  }
  
  void a(byte paramByte)
  {
    this.v = paramByte;
  }
  
  public boolean isDefaultRowHeightMatched()
  {
    return (this.v & 0xFF & 0x1) == 0;
  }
  
  public void setDefaultRowHeightMatched(boolean value)
  {
    if (!value) {
      this.v = ((byte)(this.v | 0x1));
    } else {
      this.v = ((byte)(this.v & 0xFE));
    }
  }
  
  public boolean isDefaultRowHidden()
  {
    return (this.v & 0xFF & 0x2) != 0;
  }
  
  public void setDefaultRowHidden(boolean value)
  {
    if (value) {
      this.v = ((byte)(this.v | 0x2));
    } else {
      this.v = ((byte)(this.v & 0xFE));
    }
  }
  
  public ColumnCollection getColumns()
  {
    return this.w;
  }
  
  byte r()
  {
    return this.x;
  }
  
  void b(byte paramByte)
  {
    this.x = paramByte;
  }
  
  byte s()
  {
    return this.y;
  }
  
  void c(byte paramByte)
  {
    this.y = paramByte;
  }
  
  public void applyColumnStyle(int column, Style style, StyleFlag flag)
  {
    getColumns().get(column).applyStyle(style, flag);
  }
  
  public void applyRowStyle(int row, Style style, StyleFlag flag)
  {
    zamm.a(row);
    getRows().a(row, false, true, false).applyStyle(style, flag);
  }
  
  public void applyStyle(Style style, StyleFlag flag)
  {
    Column localColumn1 = null;
    Object localObject1;
    if (this.w.a == null)
    {
      localColumn1 = this.w.a = new Column(0, this.k, this.w.b());
    }
    else
    {
      localColumn1 = this.w.a;
      int i1 = this.w.a.getIndex();
      if (this.w.getCount() != 0) {
        for (int i2 = 0; i2 <= i1; i2++) {
          localObject1 = this.w.get(i2);
        }
      }
    }
    zaiv localzaiv1 = this.i.b();
    int i5;
    zaiv localzaiv2;
    int i4;
    if (flag.getAll())
    {
      i5 = p().a(style);
      localColumn1.c(i5);
      for (int i6 = 0; i6 < this.w.getCount(); i6++) {
        this.w.getColumnByIndex(i6).c(i5);
      }
      i3 = localzaiv1.a();
      if (i3 >= 0)
      {
        localObject1 = this.i.f(i3);
        ((zt)localObject1).k(i5);
        localzaiv2 = ((zt)localObject1).b();
        for (;;)
        {
          i4 = localzaiv2.a();
          if (i4 < 0) {
            break;
          }
          ((zt)localObject1).j(i4, i5);
          if (((zt)localObject1).h(i4) == 4)
          {
            localObject2 = (zbbj)((zt)localObject1).i(i4);
            if (((zbbj)localObject2).f())
            {
              p().g.d((zbbj)localObject2);
              ((zt)localObject1).k(i4, p().g.a(((zbbj)localObject2).c).e);
            }
          }
        }
      }
      return;
    }
    Object localObject2 = new HashMap();
    int i7 = 0;
    Style localStyle1 = localColumn1.getStyle();
    zbtc.a(style, localStyle1, flag);
    i7 = localColumn1.c();
    localColumn1.c(p().a(localStyle1));
    ((HashMap)localObject2).put(Integer.valueOf(i7), Integer.valueOf(localColumn1.c()));
    for (int i8 = 0; i8 < this.w.getCount(); i8++)
    {
      Column localColumn2 = this.w.getColumnByIndex(i8);
      if (((HashMap)localObject2).get(Integer.valueOf(localColumn2.c())) != null)
      {
        localColumn2.c(((Integer)((HashMap)localObject2).get(Integer.valueOf(localColumn2.c()))).intValue());
      }
      else
      {
        Style localStyle2 = localColumn2.getStyle();
        zbtc.a(style, localStyle2, flag);
        i7 = localColumn2.c();
        localColumn2.c(p().a(localStyle2));
        ((HashMap)localObject2).put(Integer.valueOf(i7), Integer.valueOf(localColumn2.c()));
      }
    }
    int i3 = localzaiv1.a();
    if (i3 >= 0)
    {
      localObject1 = this.i.f(i3);
      i5 = Row.e((zt)localObject1);
      Object localObject3;
      if (((HashMap)localObject2).get(Integer.valueOf(i5)) != null)
      {
        ((zt)localObject1).k(((Integer)((HashMap)localObject2).get(Integer.valueOf(i5))).intValue());
      }
      else
      {
        localObject3 = Row.a(this, (zt)localObject1);
        zbtc.a(style, (Style)localObject3, flag);
        i7 = i5;
        i5 = p().a((Style)localObject3);
        ((zt)localObject1).k(i5);
        ((HashMap)localObject2).put(Integer.valueOf(i7), Integer.valueOf(i5));
      }
      localzaiv2 = ((zt)localObject1).b();
      for (;;)
      {
        i4 = localzaiv2.a();
        if (i4 < 0) {
          break;
        }
        if (((zt)localObject1).h(i4) == 4)
        {
          localObject3 = (zbbj)((zt)localObject1).i(i4);
          if (((zbbj)localObject3).f()) {
            ((zbdd)localObject3).a(this, style, flag);
          }
        }
        i5 = ((zt)localObject1).g(i4);
        if (((HashMap)localObject2).get(Integer.valueOf(i5)) != null)
        {
          ((zt)localObject1).j(i4, ((Integer)((HashMap)localObject2).get(Integer.valueOf(i5))).intValue());
        }
        else
        {
          localObject3 = Cell.b(this, (zt)localObject1, i4);
          zbtc.a(style, (Style)localObject3, flag);
          i7 = i5;
          i5 = p().a((Style)localObject3);
          ((zt)localObject1).j(i4, i5);
          ((HashMap)localObject2).put(Integer.valueOf(i7), Integer.valueOf(i5));
        }
      }
    }
  }
  
  public void copyColumn(Cells sourceCells, int sourceColumnIndex, int destinationColumnIndex)
  {
    copyColumns(sourceCells, sourceColumnIndex, destinationColumnIndex, 1);
  }
  
  public void copyColumns(Cells sourceCells0, int sourceColumnIndex, int destinationColumnIndex, int columnNumber)
  {
    Cells localCells = sourceCells0;
    p().p().a();
    zamm.b(sourceColumnIndex);
    zamm.b(destinationColumnIndex);
    if ((localCells == this) && (sourceColumnIndex == destinationColumnIndex)) {
      return;
    }
    CopyOptions localCopyOptions = new CopyOptions(2, localCells.k, this.k);
    localCopyOptions.b(0);
    Object localObject;
    for (int i1 = 0; i1 < localCells.w.getCount(); i1++)
    {
      localObject = localCells.w.getColumnByIndex(i1);
      if (((Column)localObject).getIndex() >= sourceColumnIndex)
      {
        if (((Column)localObject).getIndex() >= sourceColumnIndex + columnNumber) {
          break;
        }
        Column localColumn = this.w.get(destinationColumnIndex + ((Column)localObject).getIndex() - sourceColumnIndex);
        localColumn.a((Column)localObject);
      }
    }
    if (localCells.k.k() != null)
    {
      CellArea localCellArea = CellArea.createCellArea(0, sourceColumnIndex, 1048575, sourceColumnIndex + columnNumber - 1);
      localObject = CellArea.createCellArea(0, destinationColumnIndex, 1048575, destinationColumnIndex + columnNumber - 1);
      this.k.getListObjects().a(localCells.k.k(), localCellArea, (CellArea)localObject, localCopyOptions);
    }
    this.j.b(localCells.j, sourceColumnIndex, destinationColumnIndex, columnNumber, localCopyOptions);
    this.u.a(localCells.u, sourceColumnIndex, destinationColumnIndex, columnNumber);
    this.k.getHyperlinks().a(localCells.k.getHyperlinks(), sourceColumnIndex, destinationColumnIndex, columnNumber, localCopyOptions);
    if (localCells.k.getValidations().getCount() != 0) {
      this.k.getValidations().b(localCells.k.getValidations(), sourceColumnIndex, destinationColumnIndex, columnNumber, localCopyOptions);
    }
    if (localCells.k.getConditionalFormattings().getCount() != 0) {
      this.k.getConditionalFormattings().a(localCells.k.getConditionalFormattings(), sourceColumnIndex, destinationColumnIndex, columnNumber, localCopyOptions, false);
    }
    if (localCells.k.getShapes().getCount() != 0) {
      this.k.getShapes().a(localCells.k.getShapes(), sourceColumnIndex, destinationColumnIndex, columnNumber, localCopyOptions);
    }
    this.k.getSparklineGroupCollection().a(localCells.k.getSparklineGroupCollection(), false, sourceColumnIndex, destinationColumnIndex, columnNumber, localCopyOptions);
  }
  
  public void copyColumns(Cells sourceCells, int sourceColumnIndex, int sourceTotalColumns, int destinationColumnIndex, int destinationTotalColumns)
  {
    int i1 = destinationTotalColumns;
    int i2 = destinationColumnIndex;
    while (i1 > 0)
    {
      int i3 = i1 > sourceTotalColumns ? sourceTotalColumns : i1;
      copyColumns(sourceCells, sourceColumnIndex, i2, i3);
      i2 += i3;
      i1 -= i3;
    }
  }
  
  public void copyRow(Cells sourceCells, int sourceRowIndex, int destinationRowIndex)
    throws Exception
  {
    copyRows(sourceCells, sourceRowIndex, destinationRowIndex, 1);
  }
  
  public void copyRows(Cells sourceCells, int sourceRowIndex, int destinationRowIndex, int rowNumber)
    throws Exception
  {
    copyRows(sourceCells, sourceRowIndex, destinationRowIndex, rowNumber, null);
  }
  
  public void copyRows(Cells sourceCells0, int sourceRowIndex, int destinationRowIndex, int rowNumber, CopyOptions copyOptions)
    throws Exception
  {
    Cells localCells = sourceCells0;
    p().p().a();
    if ((sourceRowIndex < 0) || (sourceRowIndex > 1048575) || (destinationRowIndex < 0) || (destinationRowIndex > 1048575)) {
      throw new IllegalArgumentException("Row index is out of range.");
    }
    if ((localCells == this) && (sourceRowIndex == destinationRowIndex)) {
      return;
    }
    CopyOptions localCopyOptions = new CopyOptions(2, localCells.k, this.k);
    if (copyOptions != null)
    {
      localCopyOptions.setReferToDestinationSheet(copyOptions.getReferToDestinationSheet());
      localCopyOptions.setExtendToAdjacentRange(copyOptions.getExtendToAdjacentRange());
    }
    localCopyOptions.b(0);
    if (localCopyOptions.getCopyNames()) {
      localCopyOptions.a(0);
    }
    if (localCells.k.k() != null)
    {
      CellArea localCellArea1 = CellArea.createCellArea(sourceRowIndex, 0, sourceRowIndex + rowNumber - 1, 16383);
      CellArea localCellArea2 = CellArea.createCellArea(destinationRowIndex, 0, destinationRowIndex + rowNumber - 1, 16383);
      this.k.getListObjects().a(localCells.k.getListObjects(), localCellArea1, localCellArea2, localCopyOptions);
    }
    this.j.a(localCells.getRows(), sourceRowIndex, destinationRowIndex, rowNumber, localCopyOptions);
    this.u.b(localCells.u, sourceRowIndex, destinationRowIndex, rowNumber);
    this.k.getHyperlinks().b(localCells.k.getHyperlinks(), sourceRowIndex, destinationRowIndex, rowNumber, localCopyOptions);
    if (localCells.k.getConditionalFormattings().getCount() != 0) {
      this.k.getConditionalFormattings().a(localCells.k.getConditionalFormattings(), sourceRowIndex, destinationRowIndex, rowNumber, localCopyOptions);
    }
    if (localCells.k.getValidations().getCount() != 0) {
      this.k.getValidations().a(localCells.k.getValidations(), sourceRowIndex, destinationRowIndex, rowNumber, localCopyOptions);
    }
    if ((localCells.k.w() != null) && (localCells.k.w().getCount() != 0)) {
      this.k.getShapes().b(localCells.k.w(), sourceRowIndex, destinationRowIndex, rowNumber, localCopyOptions);
    }
    if (localCells.k.getSparklineGroupCollection().getCount() != 0) {
      this.k.getSparklineGroupCollection().a(localCells.k.getSparklineGroupCollection(), true, sourceRowIndex, destinationRowIndex, rowNumber, localCopyOptions);
    }
  }
  
  void a(Cells paramCells, CopyOptions paramCopyOptions)
  {
    p().p().a();
    this.x = paramCells.x;
    this.y = paramCells.y;
    int i1 = paramCells.getRows().getCount() > 32 ? paramCells.getRows().getCount() : 32;
    this.i = a(i1, 10, 20, 5);
    this.j = new RowCollection(this, this.i);
    if (paramCopyOptions != null) {
      paramCopyOptions.d();
    }
    this.e = paramCells.e;
    if ((paramCopyOptions != null) && (paramCopyOptions.f)) {
      a(paramCells.q());
    } else {
      setDefaultRowHeightMatched(false);
    }
    this.j.a(paramCells.j, paramCopyOptions);
    this.w.a(paramCells.w, paramCopyOptions);
    if (paramCells.g.getCount() > 0) {
      this.g.a(paramCells.g);
    }
    this.f = paramCells.f;
    if (paramCells.u.getCount() > 0) {
      this.u.a(paramCells.u);
    }
    this.l.copy(paramCells.l, paramCopyOptions);
    if (paramCells.z.getCount() > 0) {
      for (int i2 = 0; i2 < paramCells.z.getCount(); i2++)
      {
        Range localRange1 = paramCells.z.get(i2);
        Range localRange2 = new Range(localRange1.getFirstRow(), localRange1.getFirstColumn(), localRange1.getRowCount(), localRange1.getColumnCount(), this);
        localRange2.a(localRange1);
      }
    }
    if (paramCells.h.getCount() > 0) {
      this.h.a(paramCells.h);
    }
  }
  
  public int getGroupedRowOutlineLevel(int rowIndex)
  {
    Row localRow = this.j.a(rowIndex, true, false, false);
    if (localRow == null) {
      return 0;
    }
    return localRow.i();
  }
  
  public int getGroupedColumnOutlineLevel(int columnIndex)
  {
    int i1 = this.w.e(columnIndex);
    if (i1 < 0) {
      return 0;
    }
    Column localColumn = this.w.getColumnByIndex(i1);
    return localColumn.b();
  }
  
  public int getMaxGroupedColumnOutlineLevel()
  {
    return this.x;
  }
  
  public int getMaxGroupedRowOutlineLevel()
  {
    return this.y;
  }
  
  public void showGroupDetail(boolean isVertical, int index)
  {
    a(isVertical, index, false);
  }
  
  public void hideGroupDetail(boolean isVertical, int index)
  {
    a(isVertical, index, true);
  }
  
  private void a(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    int i1;
    Object localObject;
    int i3;
    if (paramBoolean1)
    {
      i1 = this.i.b(paramInt);
      if (i1 > -1)
      {
        localObject = this.i.f(i1);
        int i2 = Row.c((zt)localObject) & 0xFF;
        if (i2 == 0) {
          return;
        }
        i3 = paramInt;
        zaiv localzaiv = this.i.a(i1, -1, false);
        for (;;)
        {
          i1 = localzaiv.a();
          if (i1 < 0) {
            break;
          }
          localObject = this.i.f(i1);
          if ((((zt)localObject).i() != i3) || ((Row.c((zt)localObject) & 0xFF) < i2)) {
            break;
          }
          Row.a(this, (zt)localObject, paramBoolean2);
          i3++;
        }
        i1 = this.i.a(i1, true);
        if (i1 > 0)
        {
          i3 = paramInt - 1;
          localzaiv = this.i.a(-1, i1, true);
          for (;;)
          {
            i1 = localzaiv.a();
            if (i1 < 0) {
              break;
            }
            localObject = e().f(i1);
            if ((((zt)localObject).i() != i3) || ((Row.c((zt)localObject) & 0xFF) < i2)) {
              break;
            }
            Row.a(this, (zt)localObject, paramBoolean2);
            i3--;
          }
        }
      }
    }
    else
    {
      i1 = this.w.e(paramInt);
      if (i1 < 0) {
        return;
      }
      localObject = this.w.getColumnByIndex(i1);
      if (((Column)localObject).b() == 0) {
        return;
      }
      Column localColumn = null;
      for (i3 = i1; i3 < this.w.getCount(); i3++)
      {
        localColumn = this.w.getColumnByIndex(i3);
        if ((localColumn.getIndex() != ((Column)localObject).getIndex() + i3 - i1) || ((((Column)localObject).b() & 0xFF) > (localColumn.b() & 0xFF))) {
          break;
        }
        localColumn.setHidden(paramBoolean2);
      }
      for (i3 = i1 - 1; i3 >= 0; i3--)
      {
        localColumn = this.w.getColumnByIndex(i3);
        if ((localColumn.getIndex() != ((Column)localObject).getIndex() - (i1 - i3)) || ((((Column)localObject).b() & 0xFF) > (localColumn.b() & 0xFF))) {
          break;
        }
        localColumn.setHidden(paramBoolean2);
      }
    }
  }
  
  public void ungroupColumns(int firstIndex, int lastIndex)
  {
    Column localColumn;
    for (int i1 = firstIndex; i1 <= lastIndex; i1++)
    {
      i2 = this.w.e(i1);
      if (i2 > -1)
      {
        localColumn = this.w.getColumnByIndex(i2);
        localColumn.a((byte)0);
      }
    }
    i1 = 0;
    for (int i2 = 0; i2 < this.w.getCount(); i2++)
    {
      localColumn = this.w.getColumnByIndex(i2);
      if ((localColumn.b() & 0xFF) > i1) {
        i1 = localColumn.b() & 0xFF;
      }
    }
    this.x = ((byte)i1);
  }
  
  public void groupColumns(int firstIndex, int lastIndex)
  {
    for (int i1 = firstIndex; i1 <= lastIndex; i1++)
    {
      int i2 = this.w.e(i1);
      Column localColumn;
      if (i2 < 0)
      {
        localColumn = this.w.a(i1, -i2 - 1);
        localColumn.c(15);
        localColumn.a((byte)1);
        if ((localColumn.b() & 0xFF) > (this.x & 0xFF)) {
          this.x = localColumn.b();
        }
      }
      else
      {
        localColumn = this.w.getColumnByIndex(i2);
        if ((localColumn.b() & 0xFF) < 7) {
          localColumn.a((byte)((localColumn.b() & 0xFF) + 1));
        }
        if ((localColumn.b() & 0xFF) > (this.x & 0xFF)) {
          this.x = localColumn.b();
        }
      }
    }
  }
  
  public void groupColumns(int firstIndex, int lastIndex, boolean isHidden)
  {
    for (int i1 = firstIndex; i1 <= lastIndex; i1++)
    {
      int i2 = this.w.e(i1);
      Column localColumn;
      if (i2 < 0)
      {
        localColumn = this.w.a(i1, -i2 - 1);
        localColumn.c(15);
        localColumn.a((byte)1);
        localColumn.setHidden(isHidden);
        if ((localColumn.b() & 0xFF) > (this.x & 0xFF)) {
          this.x = localColumn.b();
        }
      }
      else
      {
        localColumn = this.w.getColumnByIndex(i2);
        if ((localColumn.b() & 0xFF) < 7) {
          localColumn.a((byte)((localColumn.b() & 0xFF) + 1));
        }
        localColumn.setHidden(isHidden);
        if ((localColumn.b() & 0xFF) > (this.x & 0xFF)) {
          this.x = localColumn.b();
        }
      }
      if (isHidden) {
        if ((i1 == lastIndex) && (this.k.getOutline().SummaryColumnRight))
        {
          localColumn.c(true);
          if (i1 < 16383)
          {
            i2 = this.w.e(i1 + 1);
            if (i2 > -1)
            {
              localColumn = this.w.getColumnByIndex(i2);
            }
            else
            {
              localColumn = this.w.a(i1 + 1, -i2 - 1);
              localColumn.c(15);
            }
            localColumn.c(true);
          }
        }
        else if ((i1 == firstIndex) && (!this.k.getOutline().SummaryColumnRight))
        {
          localColumn.c(true);
          if (i1 > 0)
          {
            i2 = this.w.e(i1 - 1);
            if (i2 > -1)
            {
              localColumn = this.w.getColumnByIndex(i2);
            }
            else
            {
              localColumn = this.w.a(i1 - 1, -i2 - 1);
              localColumn.c(15);
            }
            localColumn.c(true);
          }
        }
      }
    }
  }
  
  public void ungroupRows(int firstIndex, int lastIndex, boolean isAll)
  {
    zamm.b(firstIndex, lastIndex);
    zaiv localzaiv = this.i.b(firstIndex, lastIndex, false);
    int i1;
    byte b1;
    if (isAll) {
      for (;;)
      {
        i1 = localzaiv.a();
        if (i1 < 0) {
          break;
        }
        b1 = this.i.k(i1, 0);
        b1 = zbdx.a(b1, 0);
        b1 = zbdx.a(b1, false);
        this.i.a(i1, 0, b1);
      }
    }
    for (;;)
    {
      i1 = localzaiv.a();
      if (i1 < 0) {
        break;
      }
      b1 = this.i.k(i1, 0);
      i2 = (byte)zbdx.f(b1);
      if ((i2 & 0xFF) > 0)
      {
        i2 = (byte)(i2 - 1);
        b1 = zbdx.a(b1, i2 & 0xFF);
        if (i2 == 0) {
          b1 = zbdx.a(b1, false);
        }
        this.i.a(i1, 0, b1);
      }
      else if (zbdx.b(b1))
      {
        b1 = zbdx.a(b1, false);
        this.i.a(i1, 0, b1);
      }
    }
    int i2 = 0;
    int i3 = 0;
    localzaiv = this.i.b();
    for (;;)
    {
      i1 = localzaiv.a();
      if (i1 < 0) {
        break;
      }
      i3 = zbdx.f(this.i.k(i1, 0));
      if (i3 >= (this.y & 0xFF)) {
        return;
      }
      if (i3 > i2) {
        i2 = i3;
      }
    }
    this.y = ((byte)i3);
  }
  
  public void ungroupRows(int firstIndex, int lastIndex)
  {
    ungroupRows(firstIndex, lastIndex, false);
  }
  
  public void groupRows(int firstIndex, int lastIndex, boolean isHidden)
  {
    zamm.b(firstIndex, lastIndex);
    int i2 = 0;
    for (int i3 = firstIndex; i3 <= lastIndex; i3++)
    {
      Row localRow = this.j.a(i3, false, true, false);
      byte b1 = localRow.c.l(0);
      int i1 = (byte)zbdx.f(b1);
      if ((i1 & 0xFF) < 7)
      {
        i1 = (byte)(i1 + 1);
        b1 = zbdx.a(b1, i1 & 0xFF);
      }
      if (i3 == firstIndex) {
        i2 = i1;
      }
      if ((isHidden) || ((i2 & 0xFF) >= (i1 & 0xFF))) {
        b1 = zbdx.b(b1, isHidden);
      }
      if ((i1 & 0xFF) > (this.y & 0xFF)) {
        this.y = i1;
      }
      if (isHidden) {
        if ((i3 == lastIndex) && (this.k.getOutline().SummaryRowBelow))
        {
          if (i3 < 1048575)
          {
            localRow.c.a(0, b1);
            localRow = this.j.a(i3 + 1, false, true, false);
            b1 = localRow.c.l(0);
            b1 = zbdx.a(b1, true);
          }
        }
        else if ((i3 == firstIndex) && (!this.k.getOutline().SummaryRowBelow) && (i3 > 0))
        {
          localRow.c.a(0, b1);
          localRow = this.j.a(i3 - 1, false, true, false);
          b1 = localRow.c.l(0);
          b1 = zbdx.a(b1, true);
        }
      }
      localRow.c.a(0, b1);
    }
  }
  
  public void groupRows(int firstIndex, int lastIndex)
  {
    zamm.b(firstIndex, lastIndex);
    for (int i1 = firstIndex; i1 <= lastIndex; i1++)
    {
      Row localRow = this.j.a(i1, false, true, false);
      if ((localRow.i() & 0xFF) < 7) {
        localRow.a((byte)((localRow.i() & 0xFF) + 1));
      }
      if ((localRow.i() & 0xFF) > (this.y & 0xFF)) {
        this.y = localRow.i();
      }
    }
  }
  
  public void deleteColumn(int columnIndex, boolean updateReference)
  {
    deleteColumns(columnIndex, 1, updateReference);
  }
  
  public void deleteColumn(int columnIndex)
  {
    deleteColumns(columnIndex, 1, false);
  }
  
  public void deleteColumns(int columnIndex, int totalColumns, boolean updateReference)
  {
    if (totalColumns < 1) {
      return;
    }
    p().p().a();
    zamm.b(columnIndex);
    this.w.b(columnIndex, totalColumns);
    if (this.d >= columnIndex) {
      this.d = ((short)(this.d - (short)totalColumns));
    }
    this.j.c(columnIndex, totalColumns);
    Object localObject2;
    if (updateReference) {
      for (int i1 = 0; i1 < p().getCount(); i1++) {
        if (i1 != this.k.getIndex())
        {
          localObject2 = p().get(i1);
          Cells localCells = ((Worksheet)localObject2).getCells();
          if (localCells.a.c > 0)
          {
            zaai[] arrayOfzaai = localCells.a.b;
            for (int i2 = localCells.a.d - 1; i2 > -1; i2--) {
              if (arrayOfzaai[i2] != null) {
                arrayOfzaai[i2].b(columnIndex, -totalColumns, this.k, false);
              }
            }
          }
          if (((Worksheet)localObject2).getCharts().getCount() > 0) {
            ((Worksheet)localObject2).getCharts().b(columnIndex, -totalColumns, this.k, false);
          }
        }
      }
    }
    this.h.b(columnIndex, -totalColumns);
    this.u.b(columnIndex, -totalColumns);
    if (this.k.w() != null) {
      this.k.getShapes().b(columnIndex, -totalColumns, this.k, true);
    }
    this.k.getHyperlinks().b(columnIndex, -totalColumns);
    Object localObject1 = this.z.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Range)((Iterator)localObject1).next();
      ((Range)localObject2).a(columnIndex, -totalColumns);
    }
    p().getNames().a(this.k.getIndex(), columnIndex, -totalColumns);
    this.k.getValidations().a(columnIndex, -totalColumns);
    localObject1 = this.k.G();
    if (localObject1 != null) {
      ((ConditionalFormattingCollection)localObject1).b(columnIndex, -totalColumns);
    }
    if (this.k.i()) {
      this.k.b().a(columnIndex, -totalColumns);
    }
    if (this.k.hasAutofilter()) {
      this.k.getAutoFilter().b(columnIndex, -totalColumns);
    }
    if (this.k.getSparklineGroupCollection().getCount() != 0) {
      this.k.getSparklineGroupCollection().b(this, columnIndex, -totalColumns, true);
    }
    if (this.k.getListObjects().getCount() != 0) {
      this.k.getListObjects().e(columnIndex, -totalColumns);
    }
  }
  
  public boolean isDeletingRangeEnabled(int startRow, int startColumn, int totalRows, int totalColumns)
  {
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartRow = startRow;
    localCellArea1.EndRow = (startRow + totalRows - 1);
    localCellArea1.StartColumn = startColumn;
    localCellArea1.EndColumn = (startColumn + totalColumns - 1);
    if ((this.k.getListObjects().getCount() != 0) && (!this.k.getListObjects().b(startRow, startColumn, totalRows, totalColumns))) {
      return false;
    }
    int i1;
    Object localObject2;
    if (this.a.c > 0)
    {
      localObject1 = this.a.b;
      for (i1 = this.a.d - 1; i1 > -1; i1--) {
        if ((localObject1[i1] != null) && (localObject1[i1].k()))
        {
          localObject2 = localObject1[i1].a().a();
          if (!zban.b(localCellArea1, (CellArea)localObject2)) {
            return false;
          }
        }
      }
    }
    Object localObject1 = this.k.e();
    if (localObject1 != null) {
      for (i1 = 0; i1 < ((PivotTableCollection)localObject1).getCount(); i1++)
      {
        localObject2 = ((PivotTableCollection)localObject1).get(i1);
        CellArea localCellArea2 = ((PivotTable)localObject2).getTableRange2();
        if (!zban.b(localCellArea1, localCellArea2)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public boolean deleteRows(int rowIndex, int totalRows)
  {
    DeleteOptions localDeleteOptions = new DeleteOptions();
    localDeleteOptions.b = false;
    return a(rowIndex, totalRows, localDeleteOptions);
  }
  
  public void deleteRow(int rowIndex)
  {
    zamm.a(rowIndex);
    deleteRows(rowIndex, 1);
  }
  
  public boolean deleteRows(int rowIndex, int totalRows, boolean updateReference)
  {
    DeleteOptions localDeleteOptions = new DeleteOptions();
    localDeleteOptions.b = updateReference;
    return a(rowIndex, totalRows, localDeleteOptions);
  }
  
  boolean a(int paramInt1, int paramInt2, DeleteOptions paramDeleteOptions)
  {
    if (paramInt2 <= 0) {
      return false;
    }
    p().p().a();
    zamm.a(paramInt1);
    if (paramInt1 + paramInt2 > 1048576) {
      paramInt2 = 1048576 - paramInt1;
    }
    this.j.d(paramInt1, paramInt2);
    p().getNames().b(this.k.getIndex(), paramInt1, -paramInt2);
    this.u.a(paramInt1, -paramInt2);
    Object localObject1 = this.z.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Range)((Iterator)localObject1).next();
      ((Range)localObject2).b(paramInt1, -paramInt2);
    }
    if (this.k.hasAutofilter()) {
      this.k.getAutoFilter().a(paramInt1, -paramInt2);
    }
    this.k.getHyperlinks().a(paramInt1, -paramInt2);
    this.k.getValidations().b(paramInt1, -paramInt2);
    localObject1 = this.k.G();
    if (localObject1 != null) {
      ((ConditionalFormattingCollection)localObject1).a(paramInt1, -paramInt2);
    }
    if (!paramDeleteOptions.a)
    {
      if (this.k.w() != null) {
        this.k.getShapes().a(paramInt1, -paramInt2, this.k, true);
      }
      if (this.k.i()) {
        this.k.b().b(paramInt1, -paramInt2);
      }
      if (this.k.getHorizontalPageBreaks().getCount() != 0) {
        this.k.getHorizontalPageBreaks().b(paramInt1, -paramInt2);
      }
      if (this.k.getListObjects().getCount() != 0) {
        this.k.getListObjects().d(paramInt1, -paramInt2);
      }
      if (this.k.getSparklineGroupCollection().getCount() != 0) {
        this.k.getSparklineGroupCollection().a(this, paramInt1, -paramInt2, true);
      }
      localObject2 = this.k.e();
      if ((localObject2 != null) && (((PivotTableCollection)localObject2).getCount() != 0)) {
        ((PivotTableCollection)localObject2).a(paramInt1, -paramInt2);
      }
      if ((p().W() != null) && (p().W().getCount() != 0)) {
        p().W().a(paramInt1, -paramInt2, this.k);
      }
    }
    if (paramDeleteOptions.b) {
      for (int i1 = 0; i1 < p().getCount(); i1++) {
        if (i1 != this.k.getIndex())
        {
          Worksheet localWorksheet = p().get(i1);
          Cells localCells = localWorksheet.getCells();
          if (localCells.a.c > 0)
          {
            zaai[] arrayOfzaai = localCells.a.b;
            for (int i2 = localCells.a.d - 1; i2 > -1; i2--) {
              if (arrayOfzaai[i2] != null) {
                arrayOfzaai[i2].a(paramInt1, -paramInt2, this.k, false);
              }
            }
          }
          if (localWorksheet.getCharts().getCount() > 0) {
            localWorksheet.getCharts().a(paramInt1, -paramInt2, this.k, false);
          }
        }
      }
    }
    return true;
  }
  
  public void deleteBlankColumns()
  {
    DeleteOptions localDeleteOptions = new DeleteOptions();
    localDeleteOptions.a = true;
    deleteBlankColumns(localDeleteOptions);
  }
  
  public void deleteBlankColumns(DeleteOptions options)
  {
    p().p().a();
    if ((getCount() == 0) && ((this.k.l == null) || (this.k.l.getCount() == 0)))
    {
      this.j.clear();
      this.w.clear();
    }
    Range localRange = getMaxDisplayRange();
    Column localColumn1 = localRange.getFirstColumn() + localRange.getColumnCount() - 1;
    Column localColumn3;
    if ((this.w.getCount() > 0) && (localColumn1 < this.w.getColumnByIndex(this.w.getCount() - 1).getIndex())) {
      for (localColumn2 = this.w.getCount() - 1; localColumn2 >= 0; localColumn2--)
      {
        localColumn3 = this.w.getColumnByIndex(localColumn2);
        if (localColumn3.getIndex() <= localColumn1) {
          break;
        }
        this.w.removeAt(localColumn2);
        if ((this.w.a != null) && (localColumn3.getIndex() + 1 == this.w.a.getIndex())) {
          this.w.a.a(this.w.a.getIndex() - 1);
        }
      }
    }
    for (Column localColumn2 = localColumn1; localColumn2 >= 0; localColumn2--) {
      if (i(localColumn2))
      {
        localColumn3 = localColumn2;
        localColumn2--;
        while ((localColumn2 >= 0) && (i(localColumn2))) {
          localColumn2--;
        }
        deleteColumns(localColumn2 + 1, localColumn3 - localColumn2, options.b);
      }
    }
  }
  
  private boolean i(int paramInt)
  {
    if (!isBlankColumn(paramInt)) {
      return false;
    }
    if (this.k.l != null)
    {
      Iterator localIterator = this.k.l.iterator();
      while (localIterator.hasNext())
      {
        Shape localShape = (Shape)localIterator.next();
        int i1 = localShape.getUpperLeftColumn();
        int i2 = localShape.getLowerRightColumn();
        if ((paramInt >= i1) && (paramInt <= i2)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public boolean isBlankColumn(int columnIndex)
  {
    p().p().a();
    Cell localCell = null;
    for (int i1 = 0; i1 < this.j.getCount(); i1++)
    {
      Row localRow = this.j.getRowByIndex(i1);
      localCell = localRow.getCellOrNull(columnIndex);
      if ((localCell != null) && (!localCell.d())) {
        return false;
      }
    }
    return true;
  }
  
  private boolean j(int paramInt)
  {
    Row localRow = this.j.a(paramInt, true, false, false);
    if ((localRow != null) && (!localRow.isBlank())) {
      return false;
    }
    if (this.k.l != null)
    {
      Iterator localIterator = this.k.l.iterator();
      while (localIterator.hasNext())
      {
        Shape localShape = (Shape)localIterator.next();
        int i1 = localShape.getUpperLeftRow();
        int i2 = localShape.getLowerRightRow();
        if ((paramInt >= i1) && (paramInt <= i2)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public void deleteBlankRows()
  {
    DeleteOptions localDeleteOptions = new DeleteOptions();
    localDeleteOptions.a = true;
    deleteBlankRows(localDeleteOptions);
  }
  
  public void deleteBlankRows(DeleteOptions options)
  {
    p().p().a();
    if ((getCount() == 0) && ((this.k.l == null) || (this.k.l.getCount() == 0)))
    {
      this.j.clear();
      this.w.clear();
      return;
    }
    int i1 = -1;
    Range localRange = getMaxDisplayRange();
    int i2 = localRange.getFirstRow() + localRange.getRowCount() - 1;
    for (int i3 = getRows().getCount() - 1; i3 >= 0; i3--)
    {
      Row localRow = getRows().getRowByIndex(i3);
      if (localRow.getIndex() <= i2) {
        break;
      }
      getRows().removeAt(localRow.getIndex());
    }
    for (i3 = i2; i3 >= 0; i3--) {
      if (!j(i3))
      {
        if (i1 == -1)
        {
          i1 = i3;
        }
        else if (i1 != i3)
        {
          if (i1 - i3 > 1) {
            a(i3 + 1, i1 - i3 - 1, options);
          }
          i1 = i3;
        }
      }
      else if (i1 == -1) {
        i1 = i3 + 1;
      }
    }
    if (i1 >= 0)
    {
      a(0, i1, options);
    }
    else
    {
      this.j.clear();
      this.w.clear();
    }
  }
  
  public void insertColumns(int columnIndex, int totalColumns)
  {
    p().p().a();
    zamm.b(columnIndex);
    this.j.e(columnIndex, totalColumns);
    if (columnIndex <= this.d)
    {
      this.d = ((short)(this.d + (short)totalColumns));
      if (this.d > 16383) {
        this.d = 16383;
      }
    }
    this.w.c(columnIndex, totalColumns);
    if (this.k.w() != null) {
      this.k.getShapes().b(columnIndex, totalColumns, this.k, true);
    }
    this.k.getValidations().a(columnIndex, totalColumns);
    ConditionalFormattingCollection localConditionalFormattingCollection = this.k.G();
    if (localConditionalFormattingCollection != null) {
      localConditionalFormattingCollection.b(columnIndex, totalColumns);
    }
    this.h.b(columnIndex, totalColumns);
    this.k.getHyperlinks().b(columnIndex, totalColumns);
    this.u.b(columnIndex, totalColumns);
    e(columnIndex, totalColumns);
    Iterator localIterator = this.z.iterator();
    while (localIterator.hasNext())
    {
      Range localRange = (Range)localIterator.next();
      localRange.a(columnIndex, totalColumns);
    }
    p().getNames().a(this.k.getIndex(), columnIndex, totalColumns);
    if (this.k.i()) {
      this.k.b().a(columnIndex, totalColumns);
    }
    if (this.k.hasAutofilter()) {
      this.k.getAutoFilter().b(columnIndex, totalColumns);
    }
    if (this.k.getSparklineGroupCollection().getCount() != 0) {
      this.k.getSparklineGroupCollection().b(this, columnIndex, totalColumns, true);
    }
    if (this.k.getListObjects().getCount() != 0) {
      this.k.getListObjects().e(columnIndex, totalColumns);
    }
  }
  
  public void insertColumns(int columnIndex, int totalColumns, boolean updateReference)
  {
    p().p().a();
    insertColumns(columnIndex, totalColumns);
    if (updateReference) {
      for (int i1 = 0; i1 < p().getCount(); i1++) {
        if (i1 != this.k.getIndex())
        {
          Worksheet localWorksheet = p().get(i1);
          Cells localCells = localWorksheet.getCells();
          if (localCells.a.c > 0)
          {
            zaai[] arrayOfzaai = localCells.a.b;
            for (int i2 = localCells.a.d - 1; i2 > -1; i2--) {
              if (arrayOfzaai[i2] != null) {
                arrayOfzaai[i2].b(columnIndex, totalColumns, this.k, false);
              }
            }
          }
          if (localWorksheet.getCharts().getCount() > 0) {
            localWorksheet.getCharts().b(columnIndex, totalColumns, this.k, false);
          }
        }
      }
    }
  }
  
  public void insertColumn(int columnIndex, boolean updateReference)
  {
    insertColumns(columnIndex, 1, updateReference);
  }
  
  public void insertColumn(int columnIndex)
  {
    insertColumns(columnIndex, 1);
  }
  
  public void insertRows(int rowIndex, int totalRows, boolean updateReference)
  {
    insertRows(rowIndex, totalRows);
    if (updateReference)
    {
      int i1 = p().r().b(p().v(), this.k.getIndex());
      for (int i2 = 0; i2 < p().getCount(); i2++) {
        if (i2 != this.k.getIndex())
        {
          Worksheet localWorksheet = p().get(i2);
          Cells localCells = localWorksheet.getCells();
          if (localCells.a.c > 0)
          {
            localCells.b(-1, -1);
            zaai[] arrayOfzaai = localCells.a.b;
            for (int i3 = localCells.a.d - 1; i3 > -1; i3--) {
              if (arrayOfzaai[i3] != null) {
                arrayOfzaai[i3].a(rowIndex, totalRows, this.k, false);
              }
            }
          }
          if (localWorksheet.getCharts().getCount() != 0) {
            localWorksheet.getCharts().a(rowIndex, totalRows, this.k, false);
          }
        }
      }
    }
  }
  
  public void insertRows(int rowIndex, int totalRows)
  {
    a(rowIndex, totalRows, null);
  }
  
  void a(int paramInt1, int paramInt2, zamh paramzamh)
  {
    if (paramzamh == null) {
      paramzamh = new zamh();
    }
    p().p().a();
    zamm.a(paramInt1);
    if (paramInt1 + paramInt2 > 1048575) {
      paramInt2 = 1048575 - paramInt1 + 1;
    }
    if (paramInt2 == 0) {
      return;
    }
    this.j.a(paramInt1, paramInt2, paramzamh);
    p().getNames().b(this.k.getIndex(), paramInt1, paramInt2);
    if ((this.k.w() != null) && (this.k.w().getCount() != 0)) {
      this.k.getShapes().a(paramInt1, paramInt2, this.k, true);
    }
    this.k.getHyperlinks().a(paramInt1, paramInt2);
    this.u.a(paramInt1, paramInt2);
    Object localObject = this.z.iterator();
    while (((Iterator)localObject).hasNext())
    {
      Range localRange = (Range)((Iterator)localObject).next();
      localRange.b(paramInt1, paramInt2);
    }
    if (this.k.hasAutofilter()) {
      this.k.getAutoFilter().a(paramInt1, paramInt2);
    }
    this.k.getValidations().b(paramInt1, paramInt2);
    this.k.getConditionalFormattings().a(paramInt1, paramInt2);
    if (this.k.i()) {
      this.k.b().b(paramInt1, paramInt2);
    }
    if (this.k.getHorizontalPageBreaks().getCount() != 0) {
      this.k.getHorizontalPageBreaks().b(paramInt1, paramInt2);
    }
    if (this.k.getListObjects().getCount() != 0) {
      this.k.getListObjects().d(paramInt1, paramInt2);
    }
    if (this.k.getSparklineGroupCollection().getCount() != 0) {
      this.k.getSparklineGroupCollection().a(this, paramInt1, paramInt2, true);
    }
    localObject = this.k.e();
    if ((localObject != null) && (((PivotTableCollection)localObject).getCount() != 0)) {
      ((PivotTableCollection)localObject).a(paramInt1, paramInt2);
    }
    if ((p().W() != null) && (p().W().getCount() != 0)) {
      p().W().a(paramInt1, paramInt2, this.k);
    }
  }
  
  public void insertRow(int rowIndex)
  {
    insertRows(rowIndex, 1);
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Object localObject;
    for (int i1 = 0; i1 < getRows().getCount(); i1++)
    {
      localObject = getRows().getRowByIndex(i1);
      Cell localCell1 = ((Row)localObject).getCellOrNull(paramInt1 - 1);
      if (localCell1 != null) {
        localHashMap.put(Integer.valueOf(localCell1.getRow()), localCell1);
      }
    }
    if (localHashMap.size() == 0) {
      return;
    }
    for (i1 = 0; i1 < paramInt2; i1++)
    {
      localObject = localHashMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        int i2 = ((Integer)((Iterator)localObject).next()).intValue();
        Cell localCell2 = (Cell)localHashMap.get(Integer.valueOf(i2));
        a(i2, paramInt1 + i1, false).b(localCell2.s());
      }
    }
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 <= 0) {
      return;
    }
    HashMap localHashMap = new HashMap();
    int i1 = this.w.e(paramInt1 - 1);
    int i2 = -1;
    if (i1 > -1)
    {
      Column localColumn = this.w.getColumnByIndex(i1);
      if (localColumn.e()) {
        i2 = localColumn.c();
      }
    }
    Object localObject;
    for (int i3 = 0; i3 < getRows().getCount(); i3++)
    {
      localObject = getRows().getRowByIndex(i3);
      if (((Row)localObject).getIndex() >= paramInt3)
      {
        if (((Row)localObject).getIndex() > paramInt4) {
          break;
        }
        Cell localCell = ((Row)localObject).getCellOrNull(paramInt1 - 1);
        if (localCell != null) {
          localHashMap.put(Integer.valueOf(localCell.getRow()), Integer.valueOf(localCell.r()));
        }
      }
    }
    int i4;
    if (i2 != -1) {
      for (i3 = paramInt3; i3 <= paramInt4; i3++) {
        if (localHashMap.get(Integer.valueOf(i3)) == null) {
          localHashMap.put(Integer.valueOf(i3), Integer.valueOf(i2));
        }
      }
    } else {
      for (i3 = 0; i3 < paramInt2; i3++)
      {
        i1 = this.w.e(paramInt1 + i3);
        if (i1 > -1)
        {
          localObject = this.w.getColumnByIndex(i1);
          if (((Column)localObject).e()) {
            for (i4 = paramInt3; i4 <= paramInt4; i4++) {
              if (localHashMap.get(Integer.valueOf(i4)) == null)
              {
                Row localRow = getRows().a(i4, true, false, false);
                if ((localRow != null) && (!localRow.k())) {
                  localHashMap.put(Integer.valueOf(i4), Integer.valueOf(15));
                }
              }
            }
          }
        }
      }
    }
    if (localHashMap.size() == 0) {
      return;
    }
    for (i3 = 0; i3 < paramInt2; i3++)
    {
      localObject = localHashMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        i4 = ((Integer)((Iterator)localObject).next()).intValue();
        a(i4, paramInt1 + i3, false).b(((Integer)localHashMap.get(Integer.valueOf(i4))).intValue());
      }
    }
  }
  
  public RangeCollection getRanges()
  {
    return this.z;
  }
  
  public void clearRange(CellArea range)
  {
    clearRange(range.StartRow, range.StartColumn, range.EndRow, range.EndColumn);
  }
  
  public void clearRange(int startRow, int startColumn, int endRow, int endColumn)
  {
    p().p().a();
    zamm.a(startRow, startColumn, endRow, endColumn);
    getRows().a(startRow, startColumn, endRow, endColumn);
    g().getListObjects().a(startRow, startColumn, endRow, endColumn);
  }
  
  public void clearContents(CellArea range)
  {
    clearContents(range.StartRow, range.StartColumn, range.EndRow, range.EndColumn);
  }
  
  public void clearContents(int startRow, int startColumn, int endRow, int endColumn)
  {
    p().p().a();
    zamm.a(startRow, startColumn, endRow, endColumn);
    b(startRow, endRow);
    zajl localzajl = p().g;
    zaiv localzaiv = this.i.b(startRow, endRow, false);
    if (localzaiv != null)
    {
      zgs localzgs = new zgs();
      for (;;)
      {
        int i2 = localzaiv.a();
        if (i2 < 0) {
          break;
        }
        zt localzt = this.i.f(i2);
        localObject1 = localzt.b(startColumn, endColumn, false);
        if (localObject1 != null)
        {
          for (;;)
          {
            i2 = ((zaiv)localObject1).a();
            if (i2 < 0) {
              break;
            }
            switch (localzt.h(i2))
            {
            case 5: 
              this.a.b(localzt.j(i2));
              break;
            case 4: 
              localzajl.b(localzt.j(i2));
            }
            localzt.b(i2, localzgs);
          }
          localzt.l(-1, -1);
        }
      }
    }
    Object localObject1 = this.k.getListObjects();
    int i1;
    Object localObject2;
    if (((ListObjectCollection)localObject1).getCount() != 0) {
      for (i1 = 0; i1 < ((ListObjectCollection)localObject1).getCount(); i1++)
      {
        localObject2 = ((ListObjectCollection)localObject1).get(i1);
        if ((((ListObject)localObject2).getStartRow() >= startRow) && (((ListObject)localObject2).getEndRow() <= endRow) && (((ListObject)localObject2).getStartColumn() >= startColumn) && (((ListObject)localObject2).getEndColumn() <= endColumn)) {
          ((ListObjectCollection)localObject1).removeAt(i1--);
        }
      }
    }
    if (this.k.getHyperlinks() != null) {
      for (i1 = 0; i1 < this.k.getHyperlinks().getCount(); i1++)
      {
        localObject2 = this.k.getHyperlinks().get(i1);
        if ((((Hyperlink)localObject2).getArea().StartRow >= startRow) && (((Hyperlink)localObject2).getArea().StartColumn >= startColumn) && (((Hyperlink)localObject2).getArea().EndRow <= endRow) && (((Hyperlink)localObject2).getArea().EndColumn <= endColumn)) {
          this.k.getHyperlinks().a(i1--);
        }
      }
    }
  }
  
  public void clearFormats(CellArea range)
  {
    clearFormats(range.StartRow, range.StartColumn, range.EndRow, range.EndColumn);
  }
  
  public void clearFormats(int startRow, int startColumn, int endRow, int endColumn)
  {
    p().p().a();
    zamm.a(startRow, startColumn, endRow, endColumn);
    int i1 = this.j.b(startRow, endRow);
    if (i1 == -1) {
      return;
    }
    m();
    int i2 = (startColumn == 0) && (endColumn == 16383) ? 1 : 0;
    int i3 = (startRow == 0) && (endRow == 1048575) ? 1 : 0;
    Object localObject;
    if (i3 != 0) {
      while (i1 < this.w.getCount())
      {
        localObject = this.w.getColumnByIndex(i1);
        if (((Column)localObject).getIndex() >= startColumn)
        {
          if (((Column)localObject).getIndex() > endColumn) {
            break;
          }
          ((Column)localObject).c(15);
        }
        i1++;
      }
    }
    while (i1 < this.j.getCount())
    {
      localObject = this.j.getRowByIndex(i1);
      if (((Row)localObject).getIndex() > endRow) {
        break;
      }
      if (i2 != 0) {
        ((Row)localObject).e(15);
      }
      for (int i4 = startColumn; i4 <= endColumn; i4++)
      {
        Cell localCell = ((Row)localObject).getCellOrNull(i4);
        if (localCell != null)
        {
          localCell.b(15);
        }
        else if (((Row)localObject).k())
        {
          ((Row)localObject).c(i4).b(15);
        }
        else if (i3 == 0)
        {
          int i5 = this.w.e(i4);
          if (i5 > -1)
          {
            Column localColumn = this.w.getColumnByIndex(i5);
            if ((localColumn.c() != 15) && (localColumn.c() != -1)) {
              ((Row)localObject).c(i4).b(15);
            }
          }
        }
      }
      i1++;
    }
  }
  
  /**
   * @deprecated
   */
  public Cell getEnd()
  {
    return getLastCell();
  }
  
  public Cell getLastCell()
  {
    zaja localzaja = this.j.a.a(-1, -1, true);
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      if (localzt.a() > 0)
      {
        zaiv localzaiv = localzt.a(-1, -1, true);
        int i1;
        do
        {
          i1 = localzaiv.a();
          if (i1 < 0) {
            break;
          }
        } while (localzt.h(i1) == 0);
        return new Cell(localzaja.f(), i1);
      }
    }
    return null;
  }
  
  public void linkToXmlMap(String mapName, int row, int column, String path)
    throws Exception
  {
    zaob localzaob = new zaob(this, mapName, row, column, path);
    localzaob.a();
  }
  
  public Range getMaxDisplayRange()
  {
    int i1 = getMaxRow();
    int i2 = getMaxColumn();
    Object localObject;
    for (int i3 = 0; i3 < this.u.getCount(); i3++)
    {
      localObject = this.u.a(i3);
      if (((CellArea)localObject).EndRow > i1) {
        i1 = ((CellArea)localObject).EndRow;
      }
      if (((CellArea)localObject).EndColumn > i2) {
        i2 = ((CellArea)localObject).EndColumn;
      }
    }
    for (i3 = 0; i3 < this.k.getShapes().getCount(); i3++)
    {
      localObject = this.k.getShapes().get(i3);
      if (!((Shape)localObject).isHidden())
      {
        int i4 = ((Shape)localObject).getLowerRightRow();
        int i5 = ((Shape)localObject).getLowerRightColumn();
        if (i4 > i1)
        {
          int i6 = 1;
          if (i4 >= 1048575)
          {
            int i7 = ((Shape)localObject).getUpperLeftRow();
            if (i7 >= 1048575) {
              i6 = 0;
            }
          }
          if (i6 != 0) {
            i1 = i4;
          }
        }
        if (i5 > i2) {
          i2 = i5;
        }
      }
    }
    if ((i1 < 0) || (i2 < 0)) {
      return createRange(0, 0, 1, 1);
    }
    return createRange(0, 0, i1 == 1048576 ? i1 : i1 + 1, i2 == 16384 ? i2 : i2 + 1);
  }
  
  /**
   * @deprecated
   */
  public Cell getStart()
  {
    return getFirstCell();
  }
  
  public Cell getFirstCell()
  {
    zaja localzaja = this.j.a.a(-1, -1, false);
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      if (localzt.a() > 0)
      {
        zaiv localzaiv = localzt.a(-1, -1, false);
        int i1;
        do
        {
          i1 = localzaiv.a();
          if (i1 < 0) {
            break;
          }
        } while (localzt.h(i1) == 0);
        return new Cell(localzaja.f(), i1);
      }
    }
    return null;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if ((this.i.a() < 1) || (this.a.c < 1)) {
      return;
    }
    Row localRow;
    if (this.i.a() > this.a.c << 1)
    {
      localObject = this.a.b;
      int i1 = 1;
      for (int i2 = this.a.d - 1; i2 > -1; i2--)
      {
        localRow = localObject[i2];
        if ((localRow != null) && (localRow.l()) && ((paramInt1 < 0) || ((localRow.e >= paramInt1) && (localRow.e <= paramInt2))))
        {
          i1 = 0;
          break;
        }
      }
      if (i1 != 0) {
        return;
      }
    }
    Object localObject = null;
    if (paramInt1 == -1) {
      localObject = this.i.b();
    } else {
      localObject = this.i.b(paramInt1, paramInt2, false);
    }
    if (localObject == null) {
      return;
    }
    zgs localzgs1 = new zgs();
    localzgs1.c = 5;
    int i3;
    zt localzt;
    do
    {
      i3 = ((zaiv)localObject).a();
      if (i3 < 0) {
        break;
      }
      localRow = this.j.b(i3, false);
      localzt = localRow.c;
    } while (localzt.a() <= 0);
    zaiv localzaiv = localzt.b();
    for (;;)
    {
      i3 = localzaiv.a();
      if (i3 < 0) {
        break;
      }
      if (localzt.h(i3) == 5)
      {
        zaai localzaai = (zaai)localzt.i(i3);
        if (localzaai.l())
        {
          localzgs1.d = localzaai;
          zgs localzgs2 = localzt.a(i3, localzgs1, 3);
          Cell localCell = new Cell(localRow, i3, localzgs2, localzgs2 == localzgs1);
          localCell.J();
        }
      }
    }
  }
  
  Cell a(CellArea paramCellArea, int paramInt1, int paramInt2, zaha paramzaha, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject;
    if (paramCellArea.d())
    {
      localObject = this.j.a.a(paramInt1);
      if (localObject == null) {
        return null;
      }
      if (paramCellArea.e())
      {
        i1 = ((zt)localObject).b(paramInt2);
        if ((i1 > -1) && (paramzaha.a((zt)localObject, i1))) {
          return this.j.a.b(paramInt1).a(i1);
        }
        return null;
      }
      zaiv localzaiv1;
      if (paramBoolean1) {
        localzaiv1 = ((zt)localObject).b(paramCellArea.StartColumn, paramInt2, paramBoolean1);
      } else {
        localzaiv1 = ((zt)localObject).b(paramInt2, paramCellArea.EndColumn, paramBoolean1);
      }
      int i1 = a((zt)localObject, localzaiv1, paramzaha, paramBoolean2);
      if ((paramBoolean2) && (i1 > -1)) {
        return this.j.a.b(paramInt1).a(i1);
      }
      return null;
    }
    if (paramBoolean1) {
      localObject = this.j.a.a(paramCellArea.StartRow, paramInt1, paramBoolean1);
    } else {
      localObject = this.j.a.a(paramInt1, paramCellArea.EndRow, paramBoolean1);
    }
    if (localObject == null) {
      return null;
    }
    if (!((zaja)localObject).hasNext()) {
      return null;
    }
    zt localzt = ((zaja)localObject).e();
    int i2 = paramCellArea.StartColumn;
    if (paramCellArea.e())
    {
      for (;;)
      {
        i3 = localzt.b(i2);
        if ((i3 > -1) && (paramzaha.a(localzt, i3)) && (paramBoolean2)) {
          return ((zaja)localObject).f().a(i3);
        }
        if (!((zaja)localObject).hasNext()) {
          break;
        }
        localzt = ((zaja)localObject).e();
      }
      return null;
    }
    int i4 = paramCellArea.EndColumn;
    zaiv localzaiv2;
    if (localzt.i() == paramInt1)
    {
      if (paramBoolean1) {
        localzaiv2 = localzt.b(i2, paramInt2, paramBoolean1);
      } else {
        localzaiv2 = localzt.b(paramInt2, i4, paramBoolean1);
      }
    }
    else {
      localzaiv2 = localzt.b(i2, i4, paramBoolean1);
    }
    int i3 = a(localzt, localzaiv2, paramzaha, paramBoolean2);
    if ((paramBoolean2) && (i3 > -1)) {
      return ((zaja)localObject).f().a(i3);
    }
    while (((zaja)localObject).hasNext())
    {
      localzt = ((zaja)localObject).e();
      i3 = a(localzt, localzt.b(i2, i4, paramBoolean1), paramzaha, paramBoolean2);
      if ((paramBoolean2) && (i3 > -1)) {
        return ((zaja)localObject).f().a(i3);
      }
    }
    return null;
  }
  
  Cell a(int paramInt1, int paramInt2, zaha paramzaha, boolean paramBoolean1, boolean paramBoolean2)
  {
    zaja localzaja;
    if (paramInt1 < 0) {
      localzaja = this.j.a.a(-1, -1, paramBoolean1);
    } else if (paramBoolean1) {
      localzaja = this.j.a.a(-1, paramInt1, paramBoolean1);
    } else {
      localzaja = this.j.a.a(paramInt1, -1, paramBoolean1);
    }
    if (localzaja == null) {
      return null;
    }
    if (!localzaja.hasNext()) {
      return null;
    }
    zt localzt = localzaja.e();
    zaiv localzaiv;
    if ((localzt.i() == paramInt1) && (paramInt2 >= 0))
    {
      if (paramBoolean1) {
        localzaiv = localzt.b(-1, paramInt2, paramBoolean1);
      } else {
        localzaiv = localzt.b(paramInt2, -1, paramBoolean1);
      }
    }
    else {
      localzaiv = localzt.a(-1, -1, paramBoolean1);
    }
    int i1 = a(localzt, localzaiv, paramzaha, paramBoolean2);
    if ((paramBoolean2) && (i1 > -1)) {
      return localzaja.f().a(i1);
    }
    while (localzaja.hasNext())
    {
      localzt = localzaja.e();
      i1 = a(localzt, localzt.a(-1, -1, paramBoolean1), paramzaha, paramBoolean2);
      if ((paramBoolean2) && (i1 > -1)) {
        return localzaja.f().a(i1);
      }
    }
    return null;
  }
  
  Cell b(CellArea paramCellArea, int paramInt1, int paramInt2, zaha paramzaha, boolean paramBoolean1, boolean paramBoolean2)
  {
    zt[] arrayOfzt = this.i.l(paramCellArea.StartRow, paramCellArea.EndRow);
    if (arrayOfzt == null) {
      return null;
    }
    int i2;
    zt localzt;
    int i1;
    if (paramBoolean1)
    {
      for (i2 = arrayOfzt.length - 1; i2 > -1; i2--)
      {
        localzt = arrayOfzt[i2];
        if (localzt.i() <= paramInt1)
        {
          i1 = localzt.b(paramInt2);
          if ((i1 > -1) && (paramzaha.a(localzt, i1)) && (paramBoolean2)) {
            return new Cell(new Row(this, this.j, localzt, false), i1);
          }
        }
      }
      paramInt2--;
      if (paramInt2 < paramCellArea.StartColumn) {
        return null;
      }
      do
      {
        for (i2 = arrayOfzt.length - 1; i2 > -1; i2--)
        {
          localzt = arrayOfzt[i2];
          i1 = localzt.b(paramInt2);
          if ((i1 > -1) && (paramzaha.a(localzt, i1)) && (paramBoolean2)) {
            return new Cell(new Row(this, this.j, localzt, false), i1);
          }
        }
        paramInt2--;
      } while (paramInt2 >= paramCellArea.StartColumn);
    }
    else
    {
      for (i2 = 0; i2 < arrayOfzt.length; i2++)
      {
        localzt = arrayOfzt[i2];
        if (localzt.i() >= paramInt1)
        {
          i1 = localzt.b(paramInt2);
          if ((i1 > -1) && (paramzaha.a(localzt, i1)) && (paramBoolean2)) {
            return new Cell(new Row(this, this.j, localzt, false), i1);
          }
        }
      }
      paramInt2++;
      if (paramInt2 > paramCellArea.EndColumn) {
        return null;
      }
      do
      {
        for (i2 = 0; i2 < arrayOfzt.length; i2++)
        {
          localzt = arrayOfzt[i2];
          i1 = localzt.b(paramInt2);
          if ((i1 > -1) && (paramzaha.a(localzt, i1)) && (paramBoolean2)) {
            return new Cell(new Row(this, this.j, localzt, false), i1);
          }
        }
        paramInt2++;
      } while (paramInt2 <= paramCellArea.EndColumn);
    }
    return null;
  }
  
  private CellArea v()
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartColumn = getMinColumn();
    localCellArea.EndColumn = b((short)0);
    localCellArea.StartRow = getMinRow();
    localCellArea.EndRow = e(0);
    return localCellArea;
  }
  
  private int a(zt paramzt, zaiv paramzaiv, zaha paramzaha, boolean paramBoolean)
  {
    if (paramzaiv == null) {
      return -1;
    }
    int i1;
    do
    {
      i1 = paramzaiv.a();
      if (i1 < 0) {
        return -1;
      }
    } while ((!paramzaha.a(paramzt, i1)) || (!paramBoolean));
    return i1;
  }
  
  private Cell a(Cell paramCell, zaha paramzaha, boolean paramBoolean)
  {
    if (paramCell != null)
    {
      int i1 = paramCell.getRow();
      int i2 = paramCell.getColumn();
      if (paramBoolean)
      {
        i2--;
        if (i2 < 0)
        {
          i1--;
          if (i1 < 0) {
            return null;
          }
        }
      }
      else if (i2 == 16383)
      {
        if (i1 == 1048575) {
          return null;
        }
        i1++;
        i2 = -1;
      }
      else
      {
        i2++;
      }
      return a(i1, i2, paramzaha, paramBoolean, true);
    }
    return a(-1, -1, paramzaha, paramBoolean, true);
  }
  
  private Cell a(CellArea paramCellArea, Cell paramCell, zaha paramzaha, boolean paramBoolean)
  {
    if (paramCell != null)
    {
      int i1 = paramCell.getRow();
      int i2 = paramCell.getColumn();
      if (paramBoolean)
      {
        i2--;
        if (i2 < paramCellArea.StartColumn)
        {
          i1--;
          if (i1 < paramCellArea.StartRow) {
            return null;
          }
          i2 = paramCellArea.EndColumn;
        }
      }
      else
      {
        i2++;
        if (i2 > paramCellArea.EndColumn)
        {
          i1++;
          if (i1 > paramCellArea.EndRow) {
            return null;
          }
          i2 = paramCellArea.StartColumn;
        }
      }
      return a(paramCellArea, i1, i2, paramzaha, paramBoolean, true);
    }
    if (paramBoolean) {
      return a(paramCellArea, paramCellArea.EndRow, paramCellArea.EndColumn, paramzaha, paramBoolean, true);
    }
    return a(paramCellArea, paramCellArea.StartRow, paramCellArea.StartColumn, paramzaha, paramBoolean, true);
  }
  
  private Cell b(CellArea paramCellArea, Cell paramCell, zaha paramzaha, boolean paramBoolean)
  {
    if (paramCell != null)
    {
      int i1 = paramCell.getRow();
      int i2 = paramCell.getColumn();
      if (paramBoolean)
      {
        i1--;
        if (i1 < paramCellArea.StartRow)
        {
          i2--;
          if (i2 < paramCellArea.StartColumn) {
            return null;
          }
          i1 = paramCellArea.EndRow;
        }
      }
      else
      {
        i1++;
        if (i1 > paramCellArea.EndRow)
        {
          i2++;
          if (i2 > paramCellArea.EndColumn) {
            return null;
          }
          i1 = paramCellArea.StartRow;
        }
      }
      return b(paramCellArea, i1, i2, paramzaha, paramBoolean, true);
    }
    if (paramBoolean) {
      return b(paramCellArea, paramCellArea.EndRow, paramCellArea.EndColumn, paramzaha, paramBoolean, true);
    }
    return b(paramCellArea, paramCellArea.StartRow, paramCellArea.StartColumn, paramzaha, paramBoolean, true);
  }
  
  public Cell findFormula(String formula, Cell previousCell)
  {
    return a(previousCell, new zhj(this, formula, false), false);
  }
  
  public Cell findFormulaContains(String formula, Cell previousCell)
  {
    return a(previousCell, new zhj(this, formula.toUpperCase(), true), false);
  }
  
  /**
   * @deprecated
   */
  public Cell findString(String inputString, Cell previousCell)
  {
    return findString(inputString, previousCell, false);
  }
  
  /**
   * @deprecated
   */
  public Cell findString(String inputString, Cell previousCell, CellArea area)
  {
    return findString(inputString, previousCell, area, false);
  }
  
  /**
   * @deprecated
   */
  public Cell findString(String inputString, Cell previousCell, CellArea area, boolean upDown)
  {
    return a(area, previousCell, new zhl(new zbsr(inputString, false, false)), upDown);
  }
  
  /**
   * @deprecated
   */
  public Cell findString(String inputString, Cell previousCell, boolean upDown)
  {
    return a(previousCell, new zhl(new zbsr(inputString, false)), upDown);
  }
  
  /**
   * @deprecated
   */
  public Cell findString(String inputString, Cell previousCell, FindOptions findOptions)
  {
    return a(previousCell, new zhl(new zbsr(inputString, !findOptions.getCaseSensitive())), false);
  }
  
  /**
   * @deprecated
   */
  public Cell findStringStartsWith(String inputString, Cell previousCell)
  {
    FindOptions localFindOptions = new FindOptions();
    localFindOptions.setCaseSensitive(true);
    localFindOptions.setLookAtType(1);
    return a(previousCell, new zhm(this, new zbso(inputString, localFindOptions)), false);
  }
  
  /**
   * @deprecated
   */
  public Cell findStringEndsWith(String inputString, Cell previousCell)
  {
    FindOptions localFindOptions = new FindOptions();
    localFindOptions.setCaseSensitive(true);
    localFindOptions.setLookAtType(2);
    return a(previousCell, new zhm(this, new zbso(inputString, localFindOptions)), false);
  }
  
  /**
   * @deprecated
   */
  public Cell findStringContains(String inputString, Cell previousCell)
  {
    return findStringContains(inputString, previousCell, false);
  }
  
  /**
   * @deprecated
   */
  public Cell findStringContains(String inputString, Cell previousCell, boolean isCaseSensitive, CellArea area)
  {
    FindOptions localFindOptions = new FindOptions();
    localFindOptions.setCaseSensitive(isCaseSensitive);
    localFindOptions.setLookAtType(0);
    return a(area, previousCell, new zhm(this, new zbso(inputString, localFindOptions)), false);
  }
  
  /**
   * @deprecated
   */
  public Cell findStringContains(String inputString, Cell previousCell, boolean isCaseSensitive)
  {
    FindOptions localFindOptions = new FindOptions();
    localFindOptions.setCaseSensitive(isCaseSensitive);
    localFindOptions.setLookAtType(0);
    return a(previousCell, new zhm(this, new zbso(inputString, localFindOptions)), false);
  }
  
  /**
   * @deprecated
   */
  public Cell findNumber(int inputNumber, Cell previousCell)
  {
    FindOptions localFindOptions = new FindOptions();
    localFindOptions.setLookAtType(3);
    localFindOptions.a(true);
    return a(previousCell, new zhh(this, Integer.valueOf(inputNumber), localFindOptions), false);
  }
  
  /**
   * @deprecated
   */
  public Cell findNumber(double inputNumber, Cell previousCell)
  {
    FindOptions localFindOptions = new FindOptions();
    localFindOptions.setLookAtType(3);
    localFindOptions.a(true);
    return a(previousCell, new zhh(this, Double.valueOf(inputNumber), localFindOptions), false);
  }
  
  public Cell find(Object what, Cell previousCell, FindOptions findOptions)
  {
    if (findOptions.getLookInType() == 3)
    {
      localObject = g().getComments();
      for (int i1 = 0; i1 < ((CommentCollection)localObject).getCount(); i1++)
      {
        Comment localComment = ((CommentCollection)localObject).get(i1);
        Cell localCell = a(localComment.getRow(), localComment.getColumn(), false);
      }
    }
    if (findOptions.getSeachOrderByRows())
    {
      if (findOptions.isRangeSet()) {
        return a(findOptions.getRange(), previousCell, new zhh(this, what, findOptions), !findOptions.getSearchNext());
      }
      return a(previousCell, new zhh(this, what, findOptions), !findOptions.getSearchNext());
    }
    Object localObject = v();
    if (findOptions.isRangeSet())
    {
      CellArea localCellArea = findOptions.getRange();
      if (((CellArea)localObject).StartColumn < localCellArea.StartColumn) {
        ((CellArea)localObject).StartColumn = localCellArea.StartColumn;
      }
      if (((CellArea)localObject).EndColumn > localCellArea.EndColumn) {
        ((CellArea)localObject).EndColumn = localCellArea.EndColumn;
      }
      if (((CellArea)localObject).StartColumn > ((CellArea)localObject).EndColumn) {
        return null;
      }
      if (((CellArea)localObject).StartRow < localCellArea.StartRow) {
        ((CellArea)localObject).StartRow = localCellArea.StartRow;
      }
      if (((CellArea)localObject).EndRow > localCellArea.EndRow) {
        ((CellArea)localObject).EndRow = localCellArea.EndRow;
      }
      if (((CellArea)localObject).StartRow > ((CellArea)localObject).EndRow) {
        return null;
      }
    }
    return b((CellArea)localObject, previousCell, new zhh(this, what, findOptions), !findOptions.getSearchNext());
  }
  
  public Cell endCellInRow(int rowIndex)
  {
    zamm.a(rowIndex);
    Row localRow = this.j.a.b(rowIndex);
    if (localRow == null) {
      return null;
    }
    zt localzt = localRow.c;
    if (localzt.a() < 1) {
      return null;
    }
    zaiv localzaiv = localzt.a(-1, -1, true);
    int i1;
    do
    {
      i1 = localzaiv.a();
      if (i1 < 0) {
        return null;
      }
    } while (localzt.h(i1) == 0);
    return new Cell(localRow, i1);
  }
  
  public Cell endCellInColumn(short columnIndex)
  {
    return a(this.j.a.a(-1, -1, true), columnIndex);
  }
  
  public Cell endCellInColumn(int startRow, int endRow, short startColumn, short endColumn)
  {
    zamm.a(startRow, startColumn, endRow, endColumn);
    zaja localzaja = this.j.a.a(startRow, endRow, true);
    Cell localCell1 = null;
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      zaiv localzaiv = localzt.b(startColumn, endColumn, true);
      if (localzaiv != null)
      {
        int i1;
        do
        {
          i1 = localzaiv.a();
          if (i1 < 0) {
            break;
          }
        } while (localzt.h(i1) == 0);
        localCell1 = new Cell(localzaja.f(), i1);
        if (localCell1.getColumn() == endColumn) {
          return localCell1;
        }
        startColumn = (short)(localCell1.getColumn() + 1);
        if (startColumn == endColumn)
        {
          Cell localCell2 = a(localzaja, startColumn);
          if (localCell2 != null) {
            return localCell2;
          }
          return localCell1;
        }
      }
    }
    return localCell1;
  }
  
  private Cell a(zaja paramzaja, int paramInt)
  {
    while (paramzaja.hasNext())
    {
      zt localzt = paramzaja.e();
      int i1 = localzt.b(paramInt);
      if ((i1 > -1) && (localzt.h(i1) != 0)) {
        return new Cell(paramzaja.f(), i1);
      }
    }
    return null;
  }
  
  public Cell endCellInRow(int startRow, int endRow, int startColumn, int endColumn)
  {
    zamm.a(startRow, startColumn, endRow, endColumn);
    zaja localzaja = this.j.a.a(startRow, endRow, true);
    if (startColumn == endColumn) {
      return a(localzaja, startColumn);
    }
    if (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      zaiv localzaiv = localzt.b(startColumn, endColumn, true);
      int i1;
      do
      {
        i1 = localzaiv.a();
        if (i1 < 0) {
          break;
        }
      } while (localzt.h(i1) == 0);
      return new Cell(localzaja.f(), i1);
    }
    return null;
  }
  
  public void moveRange(CellArea sourceArea, int destRow, int destColumn)
  {
    p().p().a();
    Range localRange = new Range(sourceArea.StartRow, sourceArea.StartColumn, sourceArea.EndRow - sourceArea.StartRow + 1, sourceArea.EndColumn - sourceArea.StartColumn + 1, this);
    localRange.moveTo(destRow, destColumn);
  }
  
  public void insertRange(CellArea area, int shiftNumber, int shiftType, boolean updateReference)
  {
    p().p().a();
    if ((shiftType == 1) || (shiftType == 4) || (shiftType == 2)) {
      throw new CellsException(6, "Invalid shift option.");
    }
    CopyOptions localCopyOptions = new CopyOptions(0, this.k, this.k);
    this.j.a(area, shiftNumber, shiftType, this.k, true, localCopyOptions);
    a(area, shiftNumber, shiftType, this.k, true);
    if (updateReference)
    {
      int i1 = p().r().b(p().v(), this.k.getIndex());
      for (int i2 = 0; i2 < p().getCount(); i2++) {
        if (i2 != this.k.getIndex())
        {
          Worksheet localWorksheet = p().get(i2);
          Cells localCells = p().get(i2).getCells();
          RowCollection localRowCollection = localCells.getRows();
          for (int i3 = 0; i3 < localRowCollection.getCount(); i3++)
          {
            Row localRow = localRowCollection.getRowByIndex(i3);
            for (int i4 = 0; i4 < localRow.a(); i4++)
            {
              Cell localCell = localRow.getCellByIndex(i4);
              if (localCell.g())
              {
                byte[] arrayOfByte = localCell.v();
                zaaq.a(area, shiftNumber, shiftType, this.k, false, arrayOfByte, -1, -1, localCell.getRow(), localCell.getColumn(), localCell.getRow(), localCell.getColumn());
              }
            }
          }
          localCells.a(area, shiftNumber, shiftType, this.k, false);
        }
      }
    }
  }
  
  public void insertRange(CellArea area, int shiftType)
  {
    p().p().a();
    int i1 = 0;
    if (shiftType == 3) {
      i1 = area.EndColumn - area.StartColumn + 1;
    } else {
      i1 = area.EndRow - area.StartRow + 1;
    }
    insertRange(area, i1, shiftType, true);
  }
  
  public void insertRange(CellArea area, int shiftNumber, int shiftType)
  {
    insertRange(area, shiftNumber, shiftType, true);
  }
  
  void f(int paramInt)
  {
    this.d = ((short)paramInt);
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramBoolean) {
      switch (paramInt2)
      {
      case 1: 
        this.u.a(paramCellArea, paramInt1);
        break;
      case 4: 
        this.u.b(paramCellArea, paramInt1);
        break;
      case 3: 
        b(paramCellArea.StartColumn, paramInt1, paramCellArea.StartRow, paramCellArea.EndRow);
        this.u.c(paramCellArea, paramInt1);
        break;
      case 0: 
        this.u.d(paramCellArea, paramInt1);
        break;
      }
    }
    if (this.k.w() != null) {
      this.k.getShapes().a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean);
    }
    if (paramBoolean)
    {
      ConditionalFormattingCollection localConditionalFormattingCollection = this.k.G();
      if (localConditionalFormattingCollection != null) {
        localConditionalFormattingCollection.a(paramCellArea, paramInt1, paramInt2, this.k, true);
      }
      this.k.getValidations().a(paramCellArea, paramInt1, paramInt2, this.k, true);
      p().getNames().a(this.k, paramCellArea, paramInt1, paramInt2);
      this.k.getHyperlinks().a(paramCellArea, paramInt1, paramInt2);
      this.k.getListObjects().a(paramCellArea, paramInt1, paramInt2);
      this.k.getPivotTables().a(paramCellArea, paramInt1, paramInt2);
    }
  }
  
  public void deleteRange(int startRow, int startColumn, int endRow, int endColumn, int shiftType)
  {
    p().p().a();
    if ((shiftType == 3) || (shiftType == 0)) {
      throw new CellsException(6, "Invalid shift option.");
    }
    zamm.a(startRow, startColumn, endRow, endColumn);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = startRow;
    localCellArea.StartColumn = startColumn;
    localCellArea.EndRow = endRow;
    localCellArea.EndColumn = endColumn;
    int i1 = this.j.a(startRow, startColumn, endRow, endColumn, shiftType, this.k, true);
    if (shiftType != 2) {
      for (int i2 = 0; i2 < p().getCount(); i2++)
      {
        Worksheet localWorksheet = p().get(i2);
        if (this.k != localWorksheet)
        {
          zv localzv = localWorksheet.getCells().e();
          zaiv localzaiv1 = localzv.b();
          int i3;
          zt localzt;
          do
          {
            i3 = localzaiv1.a();
            if (i3 < 0) {
              break;
            }
            localzt = localzv.f(i3);
          } while (localzt.a() <= 0);
          zaiv localzaiv2 = localzt.b();
          int i4 = localzt.i();
          for (;;)
          {
            i3 = localzaiv2.a();
            if (i3 < 0) {
              break;
            }
            if (localzt.h(i3) == 5) {
              Cell.a((zaai)localzt.i(i3), shiftType, localCellArea, i1, this.k, false);
            }
          }
        }
      }
    }
    a(localCellArea, i1, shiftType, this.k, true);
  }
  
  public Object[][] exportArray(int firstRow, int firstColumn, int totalRows, int totalColumns)
  {
    if ((totalRows == 0) || (totalColumns == 0)) {
      return (Object[][])null;
    }
    zamm.a(firstRow, firstColumn, firstRow + totalRows - 1, firstColumn + totalColumns - 1);
    Object[][] arrayOfObject = new Object[totalRows][totalColumns];
    for (int i1 = 0; i1 < totalRows; i1++)
    {
      Row localRow = this.j.a(firstRow + i1, true, false, false);
      if ((localRow != null) && (localRow.a() != 0)) {
        for (int i2 = 0; i2 < totalColumns; i2++)
        {
          Cell localCell = localRow.getCellOrNull(firstColumn + i2);
          if (localCell != null) {
            switch (localCell.getType())
            {
            case 1: 
              arrayOfObject[i1][i2] = localCell.getDateTimeValue();
              break;
            case 4: 
              double d1 = localCell.getDoubleValue();
              if ((d1 <= 2.147483647E9D) && (d1 >= -2.147483648E9D) && (Math.abs(d1 - (int)d1) < Double.MIN_VALUE)) {
                arrayOfObject[i1][i2] = Integer.valueOf((int)d1);
              } else {
                arrayOfObject[i1][i2] = Double.valueOf(d1);
              }
              break;
            default: 
              arrayOfObject[i1][i2] = localCell.getValue();
            }
          }
        }
      }
    }
    return arrayOfObject;
  }
  
  public int[][] exportTypeArray(int firstRow, int firstColumn, int totalRows, int totalColumns)
  {
    if ((totalRows == 0) || (totalColumns == 0)) {
      return (int[][])null;
    }
    zamm.a(firstRow, firstColumn, firstRow + totalRows - 1, firstColumn + totalColumns - 1);
    int[][] arrayOfInt = new int[totalRows][totalColumns];
    for (int i1 = 0; i1 < totalRows; i1++)
    {
      Row localRow = this.j.a(firstRow + i1, true, false, false);
      int i2;
      if ((localRow == null) || (localRow.a() == 0)) {
        for (i2 = 0; i2 < totalColumns; i2++) {
          arrayOfInt[i1][i2] = 3;
        }
      } else {
        for (i2 = 0; i2 < totalColumns; i2++)
        {
          Cell localCell = localRow.getCellOrNull(i2 + firstColumn);
          if (localCell != null) {
            arrayOfInt[i1][i2] = localCell.getType();
          } else {
            arrayOfInt[i1][i2] = 3;
          }
        }
      }
    }
    return arrayOfInt;
  }
  
  public int importCustomObjects(Collection list, String[] propertyNames, boolean isPropertyNameShown, int firstRow, int firstColumn, int rowNumber, boolean insertRows, String dateFormatString, boolean convertStringToNumber)
  {
    ImportTableOptions localImportTableOptions = new ImportTableOptions();
    localImportTableOptions.setFieldNameShown(isPropertyNameShown);
    localImportTableOptions.setTotalRows(rowNumber);
    localImportTableOptions.setInsertRows(insertRows);
    localImportTableOptions.setDateFormat(dateFormatString);
    localImportTableOptions.setConvertNumericData(convertStringToNumber);
    ICellsDataTable localICellsDataTable = zbqd.a(list);
    if (localICellsDataTable == null)
    {
      if ((isPropertyNameShown) && (propertyNames != null))
      {
        for (int i1 = 0; i1 < propertyNames.length; i1++) {
          get(firstRow, firstColumn + i1).putValue(propertyNames[i1]);
        }
        return 1;
      }
      return 0;
    }
    if (propertyNames != null)
    {
      localImportTableOptions.setColumnIndexes(new int[propertyNames.length]);
      String[] arrayOfString = localICellsDataTable.getColumns();
      for (int i2 = 0; i2 < propertyNames.length; i2++) {
        for (int i3 = 0; i3 < arrayOfString.length; i3++) {
          if (zw.c(propertyNames[i2], arrayOfString[i3]) == 0)
          {
            localImportTableOptions.getColumnIndexes()[i2] = i3;
            break;
          }
        }
      }
    }
    return importData(localICellsDataTable, firstRow, firstColumn, localImportTableOptions);
  }
  
  public int importCustomObjects(Collection list, int firstRow, int firstColumn, ImportTableOptions options)
  {
    ICellsDataTable localICellsDataTable = zbqd.a(list);
    if (localICellsDataTable == null) {
      return 0;
    }
    return importData(localICellsDataTable, firstRow, firstColumn, options);
  }
  
  public void subtotal(CellArea ca, int groupBy, int function, int[] totalList)
  {
    subtotal(ca, groupBy, function, totalList, true, false, true);
  }
  
  public void subtotal(CellArea ca, int groupBy, int function, int[] totalList, boolean replace, boolean pageBreaks, boolean summaryBelowData)
  {
    if (totalList == null) {
      return;
    }
    zbtg localzbtg = new zbtg(this);
    localzbtg.a(ca, groupBy, function, totalList, replace, pageBreaks, summaryBelowData);
  }
  
  void c(int paramInt1, int paramInt2)
  {
    Row localRow = this.j.d.a(paramInt1);
    zt localzt = null;
    if (localRow != null)
    {
      localzt = localRow.c;
      localzt.g();
    }
    else
    {
      i1 = this.i.b(paramInt1);
      if (i1 < 0) {
        return;
      }
      localzt = this.i.f(i1);
    }
    int i1 = localzt.b(paramInt2);
    if (i1 < 0) {
      return;
    }
    zhw.a(this, localzt, i1);
    if (localRow != null) {
      localRow.d.a();
    }
    m();
  }
  
  public void removeFormulas()
  {
    if (this.i.a() < 1)
    {
      this.a.b();
      return;
    }
    zaiv localzaiv1 = this.i.b();
    zgs localzgs = new zgs();
    int i1;
    zt localzt;
    do
    {
      i1 = localzaiv1.a();
      if (i1 < 0) {
        break;
      }
      localzt = this.i.f(i1);
    } while (localzt.a() <= 0);
    zaiv localzaiv2 = localzt.b();
    for (;;)
    {
      i1 = localzaiv2.a();
      if (i1 < 0) {
        break;
      }
      if (localzt.h(i1) == 5)
      {
        zaai localzaai = (zaai)localzt.i(i1);
        localzgs.c = localzaai.c;
        if (localzaai.c == 4) {
          localzgs.d = p().g.a((String)localzaai.d);
        } else {
          localzgs.d = localzaai.d;
        }
        localzt.b(i1, localzgs, 4);
      }
    }
  }
  
  public void removeDuplicates(int startRow, int startColumn, int endRow, int endColumn)
  {
    int i1 = endRow;
    i1 = Math.min(i1, e(0));
    if (i1 == -1) {
      return;
    }
    boolean[] arrayOfBoolean = new boolean[i1 - startRow + 1];
    int i4;
    int i5;
    int i7;
    for (int i2 = startRow; i2 <= i1; i2++) {
      if (arrayOfBoolean[(i2 - startRow)] == 0)
      {
        Row localRow1 = checkRow(i2);
        for (i4 = i2 + 1; i4 <= i1; i4++) {
          if (arrayOfBoolean[(i4 - startRow)] == 0)
          {
            i5 = 1;
            Row localRow2 = checkRow(i4);
            if ((localRow1 == null) && (localRow2 == null))
            {
              arrayOfBoolean[(i4 - startRow)] = true;
            }
            else
            {
              for (i7 = startColumn; i7 <= endColumn; i7++)
              {
                Cell localCell1 = localRow1 == null ? null : localRow1.getCellOrNull(i7);
                Cell localCell2 = localRow2 == null ? null : localRow2.getCellOrNull(i7);
                if ((localCell1 == null) || (localCell1.getType() == 3))
                {
                  if ((localCell2 != null) && (localCell2.getType() != 3))
                  {
                    i5 = 0;
                    break;
                  }
                }
                else
                {
                  if (localCell2 == null)
                  {
                    i5 = 0;
                    break;
                  }
                  if (!localCell1.c.b(localCell2.c))
                  {
                    i5 = 0;
                    break;
                  }
                }
              }
              if (i5 != 0) {
                arrayOfBoolean[(i4 - startRow)] = true;
              }
            }
          }
        }
      }
    }
    i2 = 0;
    for (int i3 = 0; i3 < arrayOfBoolean.length; i3++) {
      if (arrayOfBoolean[i3] != 0)
      {
        i4 = 1;
        i5 = i3;
        i3++;
        while (i3 < arrayOfBoolean.length)
        {
          if (arrayOfBoolean[i3] == 0)
          {
            i3--;
            break;
          }
          i4++;
          i3++;
        }
        int i6 = startRow + i5 - i2;
        i7 = i6 + i4 - 1;
        deleteRange(i6, startColumn, i7, endColumn, 4);
        i2 += i4;
      }
    }
  }
  
  public void convertStringToNumericValue()
  {
    zaiv localzaiv1 = this.i.b();
    zajl localzajl = p().g;
    zgs localzgs = new zgs();
    int i1;
    zt localzt;
    do
    {
      i1 = localzaiv1.a();
      if (i1 < 0) {
        break;
      }
      localzt = this.i.f(i1);
    } while (localzt.a() <= 0);
    zaiv localzaiv2 = localzt.b();
    for (;;)
    {
      i1 = localzaiv2.a();
      if (i1 < 0) {
        break;
      }
      if (localzt.h(i1) == 4)
      {
        zbbj localzbbj = (zbbj)localzt.i(i1);
        zavp localzavp = zaac.a(localzbbj.c, p().p().getSettings().f());
        if (localzavp != null)
        {
          localzgs.c = 0;
          switch (localzavp.a())
          {
          case 1: 
            localzgs.a((DateTime)localzavp.d(), g().d().getSettings().getDate1904());
            break;
          case 4: 
            localzgs.c = 1;
            localzgs.d = ((Double)localzavp.d());
            break;
          default: 
            if (!localzgs.a(localzavp.d(), this.i.d())) {
              localzgs.c = 0;
            }
            break;
          }
          int i2 = 0;
          int i3;
          if ((localzavp.e() != null) && (!"".equals(localzavp.e())))
          {
            i2 = 1;
            i3 = localzt.g(i1);
            int i4 = localzt.a(i1);
            Style localStyle = new Style(p());
            localStyle.copy(Cell.a(this, localzt, i4, i3));
            localStyle.b(localzavp.e());
            localzgs.b = p().C().a(localStyle);
          }
          if (localzgs.c != 0)
          {
            localzajl.d(localzbbj);
            i3 = 4;
            if (i2 != 0) {
              i3 |= 0x2;
            }
            localzt.b(i1, localzgs, i3);
          }
        }
      }
    }
  }
  
  public Cell[] getDependents(boolean isAll, int row, int column)
  {
    int i1 = p().r().f(p().v(), this.k.getIndex(), this.k.getIndex());
    HashMap localHashMap = new HashMap();
    Object localObject1;
    Range localRange;
    for (int i2 = 0; i2 < p().getNames().getCount(); i2++)
    {
      localObject1 = p().getNames().get(i2);
      if (((Name)localObject1).b() != null)
      {
        localRange = ((Name)localObject1).getRange();
        if ((localRange != null) && (localRange.getWorksheet().getIndex() == this.k.getIndex()) && (localRange.getFirstRow() <= row) && (localRange.getFirstRow() + localRange.getRowCount() - 1 >= row) && (localRange.getFirstColumn() <= column) && (localRange.getFirstColumn() + localRange.getColumnCount() - 1 >= column)) {
          localHashMap.put(Integer.valueOf(i2), Boolean.valueOf(true));
        } else if (zaaq.a(0, 0, ((Name)localObject1).b(), -1, -1, row, column, i1, this, false, localHashMap)) {
          localHashMap.put(Integer.valueOf(i2), Boolean.valueOf(true));
        }
      }
    }
    ArrayList localArrayList = new ArrayList();
    zgs localzgs1 = new zgs();
    for (int i3 = p().getCount() - 1; i3 > -1; i3--)
    {
      Cells localCells = p().get(i3).getCells();
      boolean bool = localCells == this;
      if (((bool) || (isAll)) && (localCells.a.c >= 1))
      {
        localObject1 = localCells.a.b;
        localCells.getRows().a(16);
        zahb localzahb = localCells.getRows().a;
        try
        {
          for (int i5 = localCells.a.d - 1; i5 > -1; i5--) {
            if (localObject1[i5] != null)
            {
              localRange = localObject1[i5];
              localzgs1.a = localRange.f;
              zgs localzgs2 = localzahb.a(localRange.e, localzgs1, 4);
              if ((localzgs2 == null) || (localzgs2.c != 5) || (localzgs2.d != localRange)) {
                localCells.a.b(i5);
              }
              if (zaaq.a(localRange.e, localRange.f, localRange.b, -1, -1, row, column, i1, localCells, bool, localHashMap)) {
                zf.a(localArrayList, localzahb.a(localRange.e, localRange.f));
              }
            }
          }
        }
        finally
        {
          localCells.getRows().a();
        }
      }
    }
    Cell[] arrayOfCell = new Cell[localArrayList.size()];
    for (int i4 = arrayOfCell.length - 1; i4 > -1; i4--) {
      arrayOfCell[i4] = ((Cell)localArrayList.get(arrayOfCell.length - 1 - i4));
    }
    localArrayList.clear();
    localArrayList = null;
    return arrayOfCell;
  }
  
  Style a(Style paramStyle, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, zahb paramzahb)
  {
    Object localObject1;
    Object localObject2;
    if ((paramInt1 != paramInt3) && ((paramStyle.d() == null) || (paramStyle.getBorders().getByBorderType(4).getLineStyle() == 0)))
    {
      Row localRow = paramzahb.b(paramInt1 - 1);
      if ((localRow != null) && (!localRow.isHidden()))
      {
        localObject1 = localRow.getCellOrNull(paramInt2);
        if (localObject1 != null)
        {
          localObject2 = ((Cell)localObject1).p();
          if ((((Style)localObject2).d() != null) && (((Style)localObject2).getBorders().getByBorderType(8).getLineStyle() != 0))
          {
            if (paramBoolean)
            {
              paramStyle = new Style(paramStyle.e());
              paramBoolean = false;
            }
            paramStyle.getBorders().getByBorderType(4).setLineStyle(((Style)localObject2).getBorders().getByBorderType(8).getLineStyle());
            paramStyle.getBorders().getByBorderType(4).a.f(((Style)localObject2).getBorders().getByBorderType(8).a);
          }
        }
      }
    }
    if (paramInt1 != paramInt4)
    {
      int i1 = paramStyle.d() == null ? 0 : paramStyle.getBorders().getByBorderType(8).getLineStyle();
      localObject1 = paramzahb.b(paramInt1 + 1);
      if ((localObject1 != null) && (!((Row)localObject1).isHidden()))
      {
        localObject2 = ((Row)localObject1).getCellOrNull(paramInt2);
        if (localObject2 != null)
        {
          Style localStyle = ((Cell)localObject2).p();
          int i2 = localStyle.d() == null ? 0 : localStyle.getBorders().getByBorderType(4).getLineStyle();
          if (ztr.a(i1, i2))
          {
            if (paramBoolean)
            {
              paramStyle = new Style(paramStyle.e());
              paramBoolean = false;
            }
            paramStyle.getBorders().getByBorderType(8).setLineStyle(localStyle.getBorders().getByBorderType(4).getLineStyle());
            paramStyle.getBorders().getByBorderType(8).a.f(localStyle.getBorders().getByBorderType(4).a);
          }
        }
      }
    }
    return paramStyle;
  }
  
  Style a(Style paramStyle, zt paramzt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    Style localStyle1 = paramStyle;
    int i1 = paramInt2;
    if (i1 < 0) {
      i1 = -i1 - 1;
    }
    int i2;
    Style localStyle2;
    if ((paramInt1 != paramInt3) && ((localStyle1.d() == null) || (localStyle1.getBorders().getByBorderType(1).getLineStyle() == 0)) && (!isColumnHidden(paramInt1 - 1)))
    {
      i2 = paramzt.a(paramInt1 - 1, i1);
      if (i2 > -1)
      {
        localStyle2 = Cell.c(this, paramzt, i2);
        if ((localStyle2.d() != null) && (localStyle2.getBorders().getByBorderType(2).getLineStyle() != 0))
        {
          if (paramBoolean)
          {
            localStyle1 = new Style(localStyle1.e());
            paramBoolean = false;
          }
          localStyle1.getBorders().getByBorderType(1).setLineStyle(localStyle2.getBorders().getByBorderType(2).getLineStyle());
          localStyle1.getBorders().getByBorderType(1).a.f(localStyle2.getBorders().getByBorderType(2).a);
        }
      }
    }
    if ((paramInt1 != paramInt4) && ((localStyle1.d() == null) || (localStyle1.getBorders().getByBorderType(2).getLineStyle() == 0)) && (!isColumnHidden(paramInt1 + 1)))
    {
      i2 = paramzt.a(paramInt1 + 1, i1);
      if (i2 > -1)
      {
        localStyle2 = Cell.c(this, paramzt, i2);
        if ((localStyle2.d() != null) && (localStyle2.getBorders().getByBorderType(1).getLineStyle() != 0))
        {
          if (paramBoolean)
          {
            localStyle1 = new Style(localStyle1.e());
            paramBoolean = false;
          }
          localStyle1.getBorders().getByBorderType(2).setLineStyle(localStyle2.getBorders().getByBorderType(1).getLineStyle());
          localStyle1.getBorders().getByBorderType(2).a.f(localStyle2.getBorders().getByBorderType(1).a);
        }
      }
    }
    return localStyle1;
  }
  
  public Style getCellStyle(int row, int column)
  {
    return a(this.j.a.b(row), row, column, true);
  }
  
  Style b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a(this.j.a.b(paramInt1), paramInt1, paramInt2, paramBoolean);
  }
  
  Style a(Row paramRow, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = -1;
    int i2 = -1;
    if (paramRow != null)
    {
      i2 = paramRow.d(paramInt2);
      if (i2 > -1) {
        i1 = paramRow.c.g(i2);
      }
      if (i1 < 0)
      {
        i1 = Row.e(paramRow.c);
        if (i1 < 0)
        {
          i1 = g(paramInt2);
          if (i1 < 0) {
            i1 = 15;
          }
        }
      }
    }
    else
    {
      i1 = g(paramInt2);
      if (i1 == -1) {
        i1 = 15;
      }
    }
    Style localStyle = new Style(p());
    localStyle.a(p(), i1);
    if (paramBoolean) {
      a(localStyle, paramInt1, paramInt2, 0, 1048575, false, this.j.a);
    }
    if ((paramRow != null) && (paramBoolean)) {
      a(localStyle, paramRow.c, paramInt2, i2, 0, 16383, false);
    }
    return localStyle;
  }
  
  int d(int paramInt1, int paramInt2)
  {
    Row localRow = this.j.a.b(paramInt1);
    if (localRow != null)
    {
      int i1 = localRow.d(paramInt2);
      if (i1 > -1)
      {
        i2 = localRow.c.g(i1);
        if (i2 > -1) {
          return i2;
        }
      }
      int i2 = Row.e(localRow.c);
      if (i2 > -1) {
        return i2;
      }
    }
    return g(paramInt2);
  }
  
  int g(int paramInt)
  {
    return this.c.a(paramInt);
  }
  
  ArrayList t()
  {
    ArrayList localArrayList1 = new ArrayList();
    PivotTableCollection localPivotTableCollection = this.k.e();
    if (localPivotTableCollection != null)
    {
      ArrayList localArrayList2 = localPivotTableCollection.a();
      zf.a(localArrayList1, localArrayList2);
    }
    if (localArrayList1.size() == 0) {
      return null;
    }
    return localArrayList1;
  }
  
  public int importResultSet(ResultSet rs, String startCell, ImportTableOptions options)
    throws Exception
  {
    return zva.a(this, rs, startCell, options);
  }
  
  public int importResultSet(ResultSet rs, int rowIndex, int columnIndex, ImportTableOptions options)
    throws Exception
  {
    return zva.a(this, rs, rowIndex, columnIndex, options);
  }
  
  public int importResultSet(ResultSet rs, int rowIndex, int columnIndex, int rowNum, int columnNum, boolean isFieldNameShown)
    throws Exception
  {
    return zva.a(this, rs, rowIndex, columnIndex, rowNum, columnNum, isFieldNameShown, null, false);
  }
  
  public int importResultSet(ResultSet rs, String startCell, int rowNum, int columnNum, boolean isFieldNameShown)
    throws Exception
  {
    return zva.a(this, rs, startCell, rowNum, columnNum, isFieldNameShown);
  }
  
  public int importResultSet(ResultSet rs, int rowIndex, int columnIndex, boolean isFieldNameShown)
    throws Exception
  {
    return zva.a(this, rs, rowIndex, columnIndex, isFieldNameShown);
  }
  
  public int importResultSet(ResultSet rs, String startCell, boolean isFieldNameShown)
    throws Exception
  {
    return zva.a(this, rs, startCell, isFieldNameShown);
  }
  
  public int importResultSet(ResultSet rs, int rowIndex, int columnIndex, int rowNum, int columnNum, boolean isFieldNameShown, String customDateFormatString, boolean convertStringToNumber)
    throws Exception
  {
    return zva.a(this, rs, rowIndex, columnIndex, rowNum, columnNum, isFieldNameShown, customDateFormatString, convertStringToNumber);
  }
  
  public int importResultSet(ResultSet rs, int rowIndex, int columnIndex, boolean isFieldNameShown, String customDateFormatString, boolean convertStringToNumber)
    throws Exception
  {
    return zva.a(this, rs, rowIndex, columnIndex, isFieldNameShown, customDateFormatString, convertStringToNumber);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Cells.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */