package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

public class SparklineCollection
  extends CollectionBase
{
  private SparklineGroup a;
  
  SparklineCollection(SparklineGroup group, String dataRange, boolean isVertical, CellArea locationRange)
  {
    this.a = group;
    a(dataRange, isVertical, locationRange);
  }
  
  SparklineCollection(SparklineGroup group)
  {
    this.a = group;
  }
  
  void a(CellArea paramCellArea)
  {
    int i = b(paramCellArea);
    if (i != this.InnerList.size()) {
      throw new CellsException(6, "Invalid Location range");
    }
    int j;
    Sparkline localSparkline;
    if (paramCellArea.StartColumn == paramCellArea.EndColumn) {
      for (j = 0; j < i; j++)
      {
        localSparkline = (Sparkline)this.InnerList.get(j);
        localSparkline.a(paramCellArea.StartRow + j);
        localSparkline.b(paramCellArea.StartColumn);
      }
    } else if (paramCellArea.StartRow == paramCellArea.EndRow) {
      for (j = 0; j < i; j++)
      {
        localSparkline = (Sparkline)this.InnerList.get(j);
        localSparkline.a(paramCellArea.StartRow);
        localSparkline.b(paramCellArea.StartColumn + j);
      }
    } else {
      throw new CellsException(6, "Location reference cells must in same column or row");
    }
  }
  
  void a(String paramString, boolean paramBoolean, CellArea paramCellArea)
  {
    Range localRange = c().createRange(paramString, b().getIndex());
    int i = a(localRange, paramBoolean);
    if (i != b(paramCellArea)) {
      throw new CellsException(6, "The reference for the location or data range is invalid");
    }
    this.InnerList.clear();
    for (int j = 0; j < i; j++)
    {
      Sparkline localSparkline = new Sparkline(this);
      zf.a(this.InnerList, localSparkline);
    }
    b(localRange, paramBoolean);
    a(paramCellArea);
  }
  
  SparklineGroup a()
  {
    return this.a;
  }
  
  public Sparkline get(int index)
  {
    return (Sparkline)this.InnerList.get(index);
  }
  
  void a(Sparkline paramSparkline)
  {
    zf.a(this.InnerList, paramSparkline);
  }
  
  public int add(String dataRange, int row, int column)
  {
    Sparkline localSparkline = new Sparkline(this);
    localSparkline.setDataRange(dataRange);
    localSparkline.a(row);
    localSparkline.b(column);
    zf.a(this.InnerList, localSparkline);
    return this.InnerList.size() - 1;
  }
  
  public void remove(Object o)
  {
    this.InnerList.remove((Sparkline)o);
  }
  
  Worksheet b()
  {
    return this.a.a().a();
  }
  
  WorksheetCollection c()
  {
    return this.a.a().a().d().getWorksheets();
  }
  
  private int a(Range paramRange, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramRange.getColumnCount();
    }
    return paramRange.getRowCount();
  }
  
  private int b(CellArea paramCellArea)
  {
    if (paramCellArea.StartColumn == paramCellArea.EndColumn) {
      return paramCellArea.EndRow - paramCellArea.StartRow + 1;
    }
    if (paramCellArea.StartRow == paramCellArea.EndRow) {
      return paramCellArea.EndColumn - paramCellArea.StartColumn + 1;
    }
    throw new CellsException(6, "Location reference cells must in same column or row");
  }
  
  private void b(Range paramRange, boolean paramBoolean)
  {
    int i = a(paramRange, paramBoolean);
    if (i != this.InnerList.size()) {
      throw new CellsException(6, "Invalid data range");
    }
    int j;
    String str1;
    String str2;
    Sparkline localSparkline;
    if (paramBoolean) {
      for (j = 0; j < i; j++)
      {
        str1 = a(paramRange.getFirstRow(), true, j + paramRange.getFirstColumn(), true);
        str2 = a(paramRange.getFirstRow() + paramRange.getRowCount() - 1, true, j + paramRange.getFirstColumn(), true);
        localSparkline = (Sparkline)this.InnerList.get(j);
        localSparkline.setDataRange(a(paramRange.b()) + "!" + str1 + ":" + str2);
      }
    } else {
      for (j = 0; j < i; j++)
      {
        str1 = a(j + paramRange.getFirstRow(), true, paramRange.getFirstColumn(), true);
        str2 = a(j + paramRange.getFirstRow(), true, paramRange.getFirstRow() + paramRange.getRowCount() - 1, true);
        localSparkline = (Sparkline)this.InnerList.get(j);
        localSparkline.setDataRange(a(paramRange.b()) + "!" + str1 + ":" + str2);
      }
    }
  }
  
  private String a(String paramString)
  {
    if (zamm.a(paramString)) {
      return "'" + paramString + "'";
    }
    return paramString;
  }
  
  private String a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    zamm.a(paramInt1, paramInt2);
    paramInt1++;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean2) {
      localStringBuilder.append("$");
    }
    CellsHelper.a(localStringBuilder, paramInt2);
    if (paramBoolean1) {
      localStringBuilder.append("$");
    }
    localStringBuilder.append(zp.a(paramInt1));
    return zs.a(localStringBuilder);
  }
  
  int a(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Sparkline localSparkline = (Sparkline)this.InnerList.get(i);
      if (localSparkline.a(paramCells, paramInt1, paramInt2, paramBoolean)) {
        remove(localSparkline);
      }
    }
    return getCount();
  }
  
  int b(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Sparkline localSparkline = (Sparkline)this.InnerList.get(i);
      if (localSparkline.b(paramCells, paramInt1, paramInt2, paramBoolean)) {
        remove(localSparkline);
      }
    }
    return getCount();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SparklineCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */