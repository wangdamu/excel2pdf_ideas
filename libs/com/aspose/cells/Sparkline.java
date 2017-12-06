package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.io.OutputStream;

public class Sparkline
{
  private SparklineCollection b;
  byte[] a;
  private int c;
  private short d;
  
  Sparkline(SparklineCollection sparklines)
  {
    this.b = sparklines;
  }
  
  Range a()
  {
    if (this.a == null) {
      return null;
    }
    Worksheet localWorksheet = this.b.a().a().a();
    return zabx.b(9, this, true, this.a, 0, -1, 0, 0, localWorksheet.c(), localWorksheet.getIndex());
  }
  
  public String getDataRange()
  {
    if (this.a == null) {
      return null;
    }
    Worksheet localWorksheet = this.b.a().a().a();
    String str = localWorksheet.c().d().a(-1, -1, this.a, 0, 0, false, false);
    return zauj.L(str);
  }
  
  public void setDataRange(String value)
  {
    if (zw.b(value))
    {
      this.a = null;
      return;
    }
    Worksheet localWorksheet = this.b.a().a().a();
    this.a = localWorksheet.c().y().a(localWorksheet.getIndex(), value, 0, 0, 0, 32, false, true, value.indexOf('!') == -1);
    Range localRange = a();
    if ((localRange.getRowCount() != 1) && (localRange.getColumnCount() != 1)) {
      throw new CellsException(14, "Data range cells must in same column or row");
    }
  }
  
  zbqw[] b()
  {
    return a(a());
  }
  
  static zbqw[] a(Range paramRange)
  {
    if (paramRange == null) {
      return null;
    }
    Cells localCells = paramRange.b;
    int i = paramRange.getFirstRow();
    int j = paramRange.getFirstColumn();
    int k = paramRange.getFirstRow() + paramRange.getRowCount() - 1;
    int m = paramRange.getFirstColumn() + paramRange.getColumnCount() - 1;
    zbqw[] arrayOfzbqw;
    int n;
    Cell localCell;
    zbqw localzbqw;
    if (i == k)
    {
      arrayOfzbqw = new zbqw[m - j + 1];
      for (n = 0; n < arrayOfzbqw.length; n++)
      {
        localCell = localCells.checkCell(i, n + j);
        localzbqw = new zbqw();
        arrayOfzbqw[n] = localzbqw;
        if (localCell == null)
        {
          localzbqw.b = 3;
        }
        else
        {
          localzbqw.b = localCell.getType();
          localzbqw.a = localCell.getValue();
        }
      }
    }
    else
    {
      arrayOfzbqw = new zbqw[k - i + 1];
      for (n = 0; n < arrayOfzbqw.length; n++)
      {
        localCell = localCells.checkCell(i + n, j);
        localzbqw = new zbqw();
        arrayOfzbqw[n] = localzbqw;
        if (localCell == null)
        {
          localzbqw.b = 3;
        }
        else
        {
          localzbqw.b = localCell.getType();
          localzbqw.a = localCell.getValue();
        }
      }
    }
    return arrayOfzbqw;
  }
  
  public int getRow()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int getColumn()
  {
    return this.d;
  }
  
  void b(int paramInt)
  {
    this.d = ((short)paramInt);
  }
  
  private int e()
  {
    CellArea localCellArea = g();
    int i = 0;
    Cells localCells = this.b.a().a().a().getCells();
    for (int j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++) {
      i += localCells.getColumnWidthPixel(j);
    }
    return i;
  }
  
  private int f()
  {
    CellArea localCellArea = g();
    int i = 0;
    Cells localCells = this.b.a().a().a().getCells();
    for (int j = localCellArea.StartRow; j <= localCellArea.EndRow; j++) {
      i += localCells.getRowHeightPixel(j);
    }
    return i;
  }
  
  private CellArea g()
  {
    Cells localCells = this.b.a().a().a().getCells();
    for (int i = 0; i < localCells.o().getCount(); i++)
    {
      CellArea localCellArea2 = localCells.o().a(i);
      if (a(localCellArea2)) {
        return localCellArea2;
      }
    }
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartRow = this.c;
    localCellArea1.EndRow = this.c;
    localCellArea1.StartColumn = this.d;
    localCellArea1.EndColumn = this.d;
    return localCellArea1;
  }
  
  boolean c()
  {
    return (e() > 0) && (f() > 0);
  }
  
  public void toImage(String fileName, ImageOrPrintOptions options)
    throws Exception
  {
    if (options == null) {
      options = new ImageOrPrintOptions();
    }
    if (c())
    {
      zbxz.a(fileName, options);
      ze localze = new ze(fileName, 2);
      try
      {
        a(localze, options);
      }
      finally
      {
        if (localze != null) {
          localze.a();
        }
      }
    }
  }
  
  void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    if (!c()) {
      return;
    }
    zb localzb = d();
    zbxz.a(paramzm, localzb, paramImageOrPrintOptions, e(), f());
  }
  
  public void toImage(OutputStream stream, ImageOrPrintOptions options)
    throws Exception
  {
    zh localzh = new zh();
    a(localzh, options);
    localzh.a(0L, 0);
    localzh.a(stream);
  }
  
  zb d()
  {
    zkl localzkl = new zkl(this.b.a(), b(), e(), f());
    localzkl.b();
    return localzkl.a();
  }
  
  boolean a(CellArea paramCellArea)
  {
    return (this.c >= paramCellArea.StartRow) && (this.c <= paramCellArea.EndRow) && (this.d >= paramCellArea.StartColumn) && (this.d <= paramCellArea.EndColumn);
  }
  
  boolean a(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramInt2 < 0) && (this.c >= paramInt1) && (this.c < paramInt1 - paramInt2)) {
      return true;
    }
    int i = this.c;
    if ((paramBoolean) && (this.c >= paramInt1)) {
      this.c += paramInt2;
    }
    int j = this.c;
    if (this.a != null) {
      zaaq.a(paramCells.g(), paramBoolean, paramInt1, paramInt2, i, j, -1, -1, this.a);
    }
    return false;
  }
  
  boolean b(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramInt2 < 0) && (this.d >= paramInt1) && (this.d < paramInt1 - paramInt2)) {
      return true;
    }
    int i = this.d;
    if ((paramBoolean) && (this.d >= paramInt1)) {
      this.d = ((short)(this.d + (short)paramInt2));
    }
    int j = this.d;
    if (this.a != null) {
      zaaq.b(paramCells.g(), paramBoolean, paramInt1, paramInt2, i, j, -1, -1, this.a);
    }
    return false;
  }
  
  void a(Sparkline paramSparkline, CopyOptions paramCopyOptions)
  {
    this.d = paramSparkline.d;
    this.c = paramSparkline.c;
    if (paramSparkline.a != null) {
      this.a = zaam.a(paramSparkline.a, -1, 0, 0, paramCopyOptions);
    }
  }
  
  void a(Sparkline paramSparkline, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    this.d = paramSparkline.d;
    this.c = paramSparkline.c;
    int i = paramInt2 - paramInt1;
    if (paramBoolean) {
      paramSparkline.c += i;
    } else {
      this.d = ((short)(paramSparkline.d + i));
    }
    if (paramSparkline.a != null)
    {
      this.a = zaam.a(paramSparkline.a, -1, 0, 0, paramCopyOptions);
      if (paramBoolean) {
        zaaq.a(this.b.c(), paramInt1, i, paramSparkline.c, 0, 0, 0, this.a, -1, -1);
      } else {
        zaaq.a(this.b.c(), 0, 0, 0, paramInt1, i, paramSparkline.d, this.a, -1, -1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Sparkline.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */