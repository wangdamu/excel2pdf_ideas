package com.aspose.cells;

import java.util.HashMap;
import java.util.Iterator;

public class Row
  implements Iterable
{
  RowCollection a;
  Cells b;
  zt c;
  zh d;
  
  Row(Cells cells, RowCollection rows, zt rowData, boolean cacheCell)
  {
    this.b = cells;
    this.a = rows;
    this.c = rowData;
    if (cells.getMultiThreadReading()) {
      this.d = new ztg(this);
    } else if (cacheCell) {
      this.d = new zbxl(5, this);
    } else {
      this.d = new zbpj(this);
    }
  }
  
  int a()
  {
    return this.c.a();
  }
  
  Cell a(int paramInt)
  {
    return this.d.a(paramInt);
  }
  
  void b()
  {
    if (this.c.g() < 0) {
      throw new CellsException(7, "Row has been removed: " + this.c.i());
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    b(this.c.c(paramInt1), paramInt2);
  }
  
  void b(int paramInt1, int paramInt2)
  {
    l().d().a();
    this.c.c(paramInt1, paramInt2);
    this.d.a();
    this.b.m();
  }
  
  void c()
  {
    l().d().a();
    this.b.m();
    this.d.a();
    this.c.e(-1);
  }
  
  /**
   * @deprecated
   */
  public Cell getCellByIndex(int index)
  {
    b();
    return a(this.c.c(index));
  }
  
  Cell b(int paramInt)
  {
    zgs localzgs = new zgs();
    localzgs.a = ((short)paramInt);
    int i = this.c.a(-1, localzgs);
    if (paramInt > this.b.getMaxColumn()) {
      this.b.a((short)paramInt);
    }
    return new Cell(this, i);
  }
  
  public boolean isBlank()
  {
    b();
    if (this.c.a() == 0) {
      return true;
    }
    zhk localzhk = new zhk();
    zaiv localzaiv = this.c.b();
    int i;
    do
    {
      i = localzaiv.a();
      if (i < 0) {
        break;
      }
    } while (!localzhk.a(this.c, i));
    return false;
    return true;
  }
  
  boolean d()
  {
    b();
    zbdx localzbdx = this.c.a(new zbdx(), 13);
    if (!localzbdx.a(this.b)) {
      return false;
    }
    if (this.c.a() != 0)
    {
      int i = localzbdx.d;
      zaiv localzaiv = this.c.b();
      zgs localzgs1 = new zgs();
      zgs localzgs2;
      do
      {
        int j = localzaiv.a();
        if (j < 0) {
          break;
        }
        localzgs2 = this.c.a(j, localzgs1, 7);
      } while (Cell.a(this.b, localzgs2, i));
      return false;
    }
    return true;
  }
  
  public Cell get(int column)
  {
    b();
    return a(column, false, true);
  }
  
  public Iterator iterator()
  {
    b();
    return new ztu(this);
  }
  
  Cell c(int paramInt)
  {
    return a(paramInt, false, true);
  }
  
  int d(int paramInt)
  {
    return this.d.d(paramInt);
  }
  
  Cell a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return this.d.a(paramInt, paramBoolean1, paramBoolean2);
  }
  
  Cell a(RowCollection paramRowCollection, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    Cell localCell = this.d.a(paramInt1, paramInt2, false, paramBoolean2);
    if (paramBoolean1) {
      paramRowCollection.a(localCell, this);
    }
    return localCell;
  }
  
  Cell a(RowCollection paramRowCollection, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Cell localCell = a(paramInt, paramBoolean1, paramBoolean3);
    if ((paramBoolean2) && (localCell != null) && (localCell.c.b == -1)) {
      paramRowCollection.a(localCell, this);
    }
    return localCell;
  }
  
  public Cell getCellOrNull(int column)
  {
    return a(column, true, false);
  }
  
  int e()
  {
    return e(this.c);
  }
  
  void e(int paramInt)
  {
    a(this.c, paramInt);
  }
  
  int f()
  {
    return this.c.k();
  }
  
  void f(int paramInt)
  {
    b(this.c, paramInt & 0xFFFF);
  }
  
  void a(boolean paramBoolean)
  {
    this.c.a(0, zbdx.a(this.c.l(0), paramBoolean));
  }
  
  public double getHeight()
  {
    return f(this.c);
  }
  
  public void setHeight(double value)
  {
    a(this.b, this.c, value);
  }
  
  public boolean isHidden()
  {
    return zbdx.c(this.c.l(0));
  }
  
  public void setHidden(boolean value)
  {
    this.c.a(0, zbdx.b(this.c.l(0), value));
  }
  
  void b(boolean paramBoolean)
  {
    a(paramBoolean);
  }
  
  double g()
  {
    return (f() & 0xFFFF) / 20.0D;
  }
  
  boolean h()
  {
    return zbdx.e(this.c.l(0));
  }
  
  void c(boolean paramBoolean)
  {
    this.c.a(0, zbdx.d(this.c.l(0), paramBoolean));
  }
  
  public int getIndex()
  {
    return this.c.i();
  }
  
  byte i()
  {
    return (byte)zbdx.f(this.c.l(0));
  }
  
  void a(byte paramByte)
  {
    this.c.a(0, zbdx.a(this.c.l(0), paramByte & 0xFF));
  }
  
  public byte getGroupLevel()
  {
    return i();
  }
  
  public boolean isHeightMatched()
  {
    return zbdx.d(this.c.l(0));
  }
  
  public void setHeightMatched(boolean value)
  {
    this.c.a(0, zbdx.c(this.c.l(0), value));
  }
  
  public Style getStyle()
  {
    Style localStyle = new Style(l().c());
    return a(this.b, this.c);
  }
  
  void a(Style paramStyle)
  {
    c(true);
    e(l().c().a(paramStyle));
  }
  
  Style j()
  {
    return b(this.b, this.c);
  }
  
  boolean k()
  {
    return d(this.c);
  }
  
  void a(Row paramRow)
  {
    zbdx localzbdx1 = new zbdx();
    zbdx localzbdx2 = paramRow.c.a(localzbdx1, 15);
    if (localzbdx2 != localzbdx1) {
      localzbdx1.a(localzbdx2);
    }
    if ((paramRow.k()) && (l().c() != paramRow.l().c())) {
      localzbdx1.d = l().c().a(paramRow.j());
    } else {
      localzbdx1.d = paramRow.c.j();
    }
    this.c.b(localzbdx1, 13);
  }
  
  Worksheet l()
  {
    return this.b.g();
  }
  
  void a(Row paramRow, CopyOptions paramCopyOptions)
  {
    zbdx localzbdx1 = new zbdx();
    zbdx localzbdx2 = paramRow.c.a(localzbdx1, 15);
    if (localzbdx2 != localzbdx1) {
      localzbdx1.a(localzbdx2);
    }
    if ((paramRow.k()) || (paramRow.isHeightMatched())) {
      if ((paramCopyOptions.a()) || (l().c() == paramRow.l().c()))
      {
        localzbdx1.d = paramRow.e();
      }
      else if (paramCopyOptions.d.get(Integer.valueOf(paramRow.e())) != null)
      {
        localzbdx1.d = ((Integer)paramCopyOptions.d.get(Integer.valueOf(paramRow.e()))).intValue();
      }
      else
      {
        int i = paramRow.e();
        Style localStyle = paramRow.j();
        if (localStyle == null) {
          localzbdx1.d = 15;
        } else {
          localzbdx1.d = l().c().a(localStyle);
        }
        paramCopyOptions.d.put(Integer.valueOf(i), Integer.valueOf(localzbdx1.d));
      }
    }
    this.c.b(localzbdx1, 13);
  }
  
  public Cell getFirstCell()
  {
    b();
    if (a() == 0) {
      return null;
    }
    return new Cell(this, this.c.a(-1, false));
  }
  
  public Cell getLastCell()
  {
    b();
    if (a() == 0) {
      return null;
    }
    return new Cell(this, this.c.a(-1, true));
  }
  
  public Cell getLastDataCell()
  {
    b();
    if (a() == 0) {
      return null;
    }
    zhk localzhk = new zhk();
    zaiv localzaiv = this.c.a(-1, -1, true);
    int i;
    do
    {
      i = localzaiv.a();
      if (i < 0) {
        break;
      }
    } while (!localzhk.a(this.c, i));
    return new Cell(this, i);
    return null;
  }
  
  private void a(Style paramStyle, StyleFlag paramStyleFlag)
  {
    int i = getIndex() + 1;
    Row localRow;
    StyleFlag localStyleFlag;
    Style localStyle;
    if (i <= 1048575)
    {
      localRow = this.b.getRow(i);
      if ((localRow != null) && ((paramStyleFlag.getBottomBorder()) || (paramStyleFlag.getAll())) && (paramStyle.isModified(5)))
      {
        localStyleFlag = new StyleFlag();
        localStyleFlag.setTopBorder(true);
        localStyle = new Style(paramStyle.e());
        localStyle.getBorders().getByBorderType(4).a(paramStyle.getBorders().getByBorderType(8));
        localRow.b(paramStyle, localStyleFlag);
      }
    }
    i = getIndex() - 1;
    if (i >= 0)
    {
      localRow = this.b.getRow(i);
      if ((localRow != null) && ((paramStyleFlag.getTopBorder()) || (paramStyleFlag.getAll())) && (paramStyle.isModified(4)))
      {
        localStyleFlag = new StyleFlag();
        localStyleFlag.setBottomBorder(true);
        localStyle = new Style(paramStyle.e());
        localStyle.getBorders().getByBorderType(8).a(paramStyle.getBorders().getByBorderType(4));
        localRow.b(paramStyle, localStyleFlag);
      }
    }
  }
  
  public void applyStyle(Style style, StyleFlag flag)
  {
    b(style, flag);
    a(style, flag);
  }
  
  private void b(Style paramStyle, StyleFlag paramStyleFlag)
  {
    b();
    Cells localCells = this.b;
    ColumnCollection localColumnCollection = localCells.getColumns();
    int i = -1;
    int j;
    if (!h())
    {
      localObject1 = localColumnCollection.a;
      i = -1;
      if ((localColumnCollection.a != null) && (localColumnCollection.a.e()) && (localColumnCollection.a.getIndex() < 8191)) {
        i = localColumnCollection.a.c();
      }
      if ((i != -1) && (i != 15))
      {
        j = -1;
        Object localObject2 = localColumnCollection.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          Column localColumn1 = (Column)((Iterator)localObject2).next();
          if (j + 1 != localColumn1.getIndex()) {
            for (int n = j + 1; n < localColumn1.getIndex(); n++) {
              a(n, false, true);
            }
          }
          if (localColumn1.c() != i) {
            a(localColumn1.getIndex(), false, true);
          }
          j = localColumn1.getIndex();
        }
        if (localColumnCollection.a != null)
        {
          localObject2 = localColumnCollection.a;
          if (j + 1 != ((Column)localObject2).getIndex()) {
            for (m = j + 1; m < ((Column)localObject2).getIndex(); m++) {
              a(m, false, true);
            }
          }
          if (((Column)localObject2).c() != i) {
            a(((Column)localObject2).getIndex(), false, true);
          }
        }
      }
    }
    Object localObject1 = this.c.b();
    if (paramStyleFlag.getAll())
    {
      a(paramStyle);
      int k = e();
      for (;;)
      {
        j = ((zaiv)localObject1).a();
        if (j < 0) {
          break;
        }
        this.c.j(j, k);
      }
      return;
    }
    HashMap localHashMap = new HashMap();
    int m = 0;
    Style localStyle = null;
    for (;;)
    {
      j = ((zaiv)localObject1).a();
      if (j < 0) {
        break;
      }
      m = Cell.a(localCells, this.c, j);
      if (localHashMap.get(Integer.valueOf(m)) != null)
      {
        this.c.j(j, ((Integer)localHashMap.get(Integer.valueOf(m))).intValue());
      }
      else
      {
        localStyle = new Style(this.b.p());
        localStyle.copy(localCells.p().C().a(m));
        zbtc.a(paramStyle, localStyle, paramStyleFlag);
        i1 = localCells.p().C().a(localStyle);
        this.c.j(j, i1);
        localHashMap.put(Integer.valueOf(m), Integer.valueOf(i1));
      }
    }
    if (!h()) {}
    int i1 = e();
    for (int i2 = 0; i2 < localColumnCollection.getCount(); i2++)
    {
      Column localColumn2 = localColumnCollection.getColumnByIndex(i2);
      if (localColumn2.e())
      {
        j = this.c.b(localColumn2.getIndex());
        if (j < 0)
        {
          zgs localzgs = new zgs();
          localzgs.a = ((short)localColumn2.getIndex());
          m = i1 < 0 ? localColumn2.c() : i1;
          if (localHashMap.get(Integer.valueOf(m)) != null)
          {
            localzgs.b = ((Integer)localHashMap.get(Integer.valueOf(m))).intValue();
          }
          else
          {
            localStyle = new Style(this.b.p());
            localStyle.copy(localCells.p().C().a(m));
            zbtc.a(paramStyle, localStyle, paramStyleFlag);
            localzgs.b = localCells.p().C().a(localStyle);
            localHashMap.put(Integer.valueOf(m), Integer.valueOf(localzgs.b));
          }
          this.c.a(-j - 1, localzgs);
        }
      }
    }
    if ((!h()) && (i != -1) && (i != 15))
    {
      localStyle = new Style(this.b.p());
      localStyle.a(this.b.p(), i);
    }
    else
    {
      localStyle = getStyle();
    }
    zbtc.a(paramStyle, localStyle, paramStyleFlag);
    a(localStyle);
  }
  
  boolean b(Row paramRow)
  {
    if (paramRow == null) {
      return !k();
    }
    return j().equals(paramRow.j());
  }
  
  public boolean equals(Object obj)
  {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Row)) {
      return false;
    }
    return equals((Row)obj);
  }
  
  public boolean equals(Row row)
  {
    return (row == this) || ((this.b == row.b) && ((this.c == row.c) || (this.c.i() == row.c.i())));
  }
  
  static boolean a(zt paramzt)
  {
    return zbdx.c(paramzt.l(0));
  }
  
  static void a(zt paramzt, boolean paramBoolean)
  {
    paramzt.a(0, zbdx.b(paramzt.l(0), paramBoolean));
  }
  
  static void b(zt paramzt, boolean paramBoolean)
  {
    paramzt.a(0, zbdx.c(paramzt.l(0), paramBoolean));
  }
  
  static boolean b(zt paramzt)
  {
    return zbdx.e(paramzt.l(0));
  }
  
  static void c(zt paramzt, boolean paramBoolean)
  {
    paramzt.a(0, zbdx.d(paramzt.l(0), paramBoolean));
  }
  
  static byte c(zt paramzt)
  {
    return (byte)(paramzt.l(0) & 0xFF & 0xF);
  }
  
  static boolean d(zt paramzt)
  {
    return b(paramzt);
  }
  
  static int e(zt paramzt)
  {
    if (!b(paramzt)) {
      return -1;
    }
    return paramzt.j();
  }
  
  static void a(zt paramzt, int paramInt)
  {
    if (paramInt == -1)
    {
      paramzt.k(15);
    }
    else
    {
      paramzt.k(paramInt);
      c(paramzt, true);
    }
  }
  
  static void a(Cells paramCells, zt paramzt, boolean paramBoolean)
  {
    a(paramzt, paramBoolean);
    if ((!paramBoolean) && (paramzt.k() == 0)) {
      paramzt.m(paramCells.a());
    }
  }
  
  static Style a(Cells paramCells, zt paramzt)
  {
    Style localStyle = new Style(paramCells.g().c());
    if (!b(paramzt))
    {
      localStyle.copy(paramCells.g().c().Q());
    }
    else
    {
      int i = paramzt.j();
      if (i < paramCells.g().c().C().b()) {
        localStyle.a(paramCells.g().c(), i);
      } else {
        localStyle.copy(paramCells.g().c().Q());
      }
    }
    return localStyle;
  }
  
  static Style b(Cells paramCells, zt paramzt)
  {
    if (!b(paramzt)) {
      return paramCells.g().c().Q();
    }
    return paramCells.g().c().C().a(paramzt.j());
  }
  
  static void b(zt paramzt, int paramInt)
  {
    if (paramInt > 0)
    {
      zbdx localzbdx = paramzt.a(new zbdx(), 5);
      localzbdx.b(false);
      localzbdx.e = ((short)paramInt);
      paramzt.b(localzbdx, 5);
    }
    else
    {
      a(paramzt, true);
    }
  }
  
  static double a(zv paramzv, int paramInt)
  {
    return paramzv.g(paramInt) / 20.0D;
  }
  
  static double f(zt paramzt)
  {
    zbdx localzbdx = paramzt.a(new zbdx(), 5);
    if (localzbdx.b()) {
      return 0.0D;
    }
    return localzbdx.e / 20.0D;
  }
  
  static int b(zv paramzv, int paramInt)
  {
    zbdx localzbdx = paramzv.b(paramInt, new zbdx(), 5);
    if (localzbdx.b()) {
      return 0;
    }
    return localzbdx.e;
  }
  
  static void a(Cells paramCells, zt paramzt, double paramDouble)
  {
    zbdx localzbdx = paramzt.a(new zbdx(), 5);
    if (paramDouble <= 0.0D)
    {
      localzbdx.b(true);
      localzbdx.e = 0;
    }
    else
    {
      localzbdx.e = ((short)(int)(paramDouble * 20.0D + 0.5D));
    }
    localzbdx.c(false);
    paramzt.b(localzbdx, 5);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Row.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */