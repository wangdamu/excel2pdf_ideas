package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

public class Column
{
  double a;
  private Worksheet b;
  private short c;
  private int d = -1;
  private byte e;
  
  Column(int columnIndex, Worksheet sheet, double defaultWidth)
  {
    this.c = ((short)columnIndex);
    this.b = sheet;
    this.a = defaultWidth;
  }
  
  Column(int columnIndex, Worksheet sheet, double defaultWidth, Column defaultColumn)
  {
    this.c = ((short)columnIndex);
    this.b = sheet;
    this.a = defaultWidth;
    if ((defaultColumn != null) && (defaultColumn.getIndex() <= columnIndex)) {
      a(defaultColumn);
    }
  }
  
  public int getIndex()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = ((short)paramInt);
  }
  
  public double getWidth()
  {
    return this.a;
  }
  
  public void setWidth(double value)
  {
    this.a = value;
    if (value < Double.MIN_VALUE) {
      b(true);
    } else {
      b(false);
    }
    d(false);
  }
  
  int a(boolean paramBoolean)
  {
    if (d()) {
      return 0;
    }
    return a();
  }
  
  void a(Worksheet paramWorksheet, int paramInt)
  {
    if (this.b.getShowFormulas())
    {
      if (!paramWorksheet.getShowFormulas()) {
        paramInt <<= 1;
      }
    }
    else if (paramWorksheet.getShowFormulas()) {
      paramInt >>= 1;
    }
    b(paramInt);
  }
  
  int a()
  {
    int i = zlp.b(this.a, this.b.c());
    if (this.b.getShowFormulas()) {
      i <<= 1;
    }
    return i;
  }
  
  void b(int paramInt)
  {
    setWidth(zlp.a(this.b.getShowFormulas() ? paramInt >> 1 : paramInt, this.b.c()));
  }
  
  byte b()
  {
    return (byte)(this.e & 0xFF & 0xF);
  }
  
  void a(byte paramByte)
  {
    this.e = ((byte)(this.e & 0xF0));
    this.e = ((byte)(this.e | paramByte));
  }
  
  public byte getGroupLevel()
  {
    return b();
  }
  
  int c()
  {
    return this.d;
  }
  
  void c(int paramInt)
  {
    this.d = paramInt;
  }
  
  public boolean isHidden()
  {
    return d();
  }
  
  public void setHidden(boolean value)
  {
    b(value);
    d(false);
    if ((!value) && (this.a == 0.0D)) {
      this.a = this.b.getCells().getColumns().b();
    }
  }
  
  boolean d()
  {
    return (this.e & 0xFF & 0x20) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.e = ((byte)(this.e & 0xDF));
    } else {
      this.e = ((byte)(this.e | 0x20));
    }
  }
  
  void a(Column paramColumn)
  {
    this.a = paramColumn.a;
    this.d = paramColumn.d;
    this.e = paramColumn.e;
    if (paramColumn.b.c() != this.b.c()) {
      this.d = this.b.c().a(paramColumn.f());
    }
  }
  
  void a(Column paramColumn, CopyOptions paramCopyOptions)
  {
    this.c = paramColumn.c;
    this.a = paramColumn.a;
    this.d = paramColumn.d;
    this.e = paramColumn.e;
    if (paramColumn.c != -1)
    {
      if ((paramCopyOptions.a()) || (this.b.c() == paramColumn.b.c()))
      {
        this.d = paramColumn.d;
      }
      else if (paramCopyOptions.d.get(Integer.valueOf(paramColumn.d)) != null)
      {
        this.d = ((Integer)paramCopyOptions.d.get(Integer.valueOf(paramColumn.d))).intValue();
      }
      else
      {
        int i = paramColumn.d;
        Style localStyle = paramColumn.f();
        if (localStyle == null) {
          this.d = -1;
        } else {
          this.d = this.b.c().a(localStyle);
        }
        paramCopyOptions.d.put(Integer.valueOf(i), Integer.valueOf(this.d));
      }
    }
    else {
      this.c = -1;
    }
    if ((paramCopyOptions == null) || (!paramCopyOptions.f)) {
      a(paramColumn.b, paramColumn.a());
    }
  }
  
  boolean b(Column paramColumn)
  {
    if ((this.d == paramColumn.d) && (this.e == paramColumn.e)) {
      return Math.abs(this.a - paramColumn.a) <= Double.MIN_VALUE;
    }
    return false;
  }
  
  boolean e()
  {
    return (this.d != -1) && (this.d != 15);
  }
  
  boolean c(Column paramColumn)
  {
    if (paramColumn == null) {
      return (this.d == -1) || (this.d == 15);
    }
    return f().equals(paramColumn.f());
  }
  
  void a(byte[] paramArrayOfByte)
  {
    int i = zc.e(paramArrayOfByte, 4);
    this.a = (Math.floor(((i & 0xFFFF) - zlp.a(this.b.c())) / 2.56D + 0.5D) / 100.0D);
    if (this.a < 1.0D) {
      this.a = ((int)((i & 0xFFFF) * 100.0D / (256 + zlp.a(this.b.c())) + 0.5D) / 100.0D);
    }
    this.d = (zc.e(paramArrayOfByte, 6) & 0xFFFF);
    if (this.d == 65535) {
      this.d = -1;
    } else if (this.d >= this.b.c().C().b()) {
      this.d = 15;
    }
    a((byte)(paramArrayOfByte[9] & 0xFF & 0x7));
    int j = paramArrayOfByte[8] & 0xFF & 0x1;
    if (j != 0) {
      b(true);
    }
    if ((paramArrayOfByte[8] & 0xFF & 0x2) == 0) {
      e(true);
    }
    if ((paramArrayOfByte[8] & 0xFF & 0x4) != 0) {
      d(true);
    }
    j = paramArrayOfByte[9] & 0xFF & 0x10;
    if (j != 0) {
      c(true);
    }
  }
  
  public void applyStyle(Style style, StyleFlag flag)
  {
    Cells localCells = this.b.getCells();
    RowCollection localRowCollection = this.b.getCells().getRows();
    localCells.m();
    if (flag.getAll())
    {
      a(style);
      for (int i = 0; i < localCells.getRows().getCount(); i++)
      {
        Row localRow1 = localCells.getRows().getRowByIndex(i);
        localObject = localRow1.getCellOrNull(this.c);
        if (localObject != null)
        {
          ((Cell)localObject).b(this.d);
        }
        else if (localRow1.k())
        {
          localObject = localRow1.c(this.c);
          ((Cell)localObject).b(this.d);
        }
      }
      return;
    }
    HashMap localHashMap = new HashMap();
    int j = 0;
    Object localObject = null;
    for (int k = 0; k < localCells.getRows().getCount(); k++)
    {
      Row localRow2 = localCells.getRows().getRowByIndex(k);
      Cell localCell = localRow2.getCellOrNull(this.c);
      if ((localCell == null) && (localRow2.k())) {
        localCell = localRow2.c(this.c);
      }
      if (localCell != null)
      {
        j = localCell.r();
        if (localHashMap.get(Integer.valueOf(j)) != null)
        {
          localCell.b(((Integer)localHashMap.get(Integer.valueOf(j))).intValue());
        }
        else
        {
          Style localStyle = localCell.o();
          zbtc.a(style, localStyle, flag);
          localCell.a(localStyle);
          localHashMap.put(Integer.valueOf(j), Integer.valueOf(localCell.s()));
        }
      }
    }
    j = this.d;
    localObject = getStyle();
    zbtc.a(style, (Style)localObject, flag);
    a((Style)localObject);
  }
  
  public Style getStyle()
  {
    Style localStyle = new Style(this.b.c());
    if ((this.d == -1) || (this.d == 15)) {
      localStyle.a(this.b.c(), 15);
    } else {
      localStyle.a(this.b.c(), this.d);
    }
    return localStyle;
  }
  
  void a(Style paramStyle)
  {
    this.d = this.b.c().a(paramStyle);
  }
  
  Style f()
  {
    if ((this.d == -1) || (this.d == 15)) {
      return this.b.c().Q();
    }
    return this.b.c().C().a(this.d);
  }
  
  boolean g()
  {
    return (this.e & 0xFF & 0x10) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.e = ((byte)(this.e | 0x10));
    } else {
      this.e = ((byte)(this.e & 0xEF));
    }
  }
  
  boolean h()
  {
    return (this.e & 0xFF & 0x40) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.e = ((byte)(this.e | 0x40));
    } else {
      this.e = ((byte)(this.e & 0xBF));
    }
  }
  
  boolean i()
  {
    return (this.e & 0xFF & 0x80) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.e = ((byte)(this.e | 0x80));
    } else {
      this.e = ((byte)(this.e & 0x3F));
    }
  }
  
  boolean j()
  {
    return (e()) || (isHidden()) || (getGroupLevel() != 0) || (this.a != this.b.getCells().getColumns().b());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Column.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */