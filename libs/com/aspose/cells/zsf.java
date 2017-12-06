package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zo;
import java.util.Iterator;

class zsf
{
  private Workbook a;
  private zo b;
  
  public zsf(Workbook paramWorkbook)
  {
    this.a = paramWorkbook;
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    this.b = new zo(paramzm, this.a.getSettings().g());
    a();
    this.b.c();
  }
  
  void a()
    throws Exception
  {
    Cells localCells;
    if (zug.a(this.a.getWorksheets())) {
      localCells = this.a.getWorksheets().get(0).getCells();
    } else {
      localCells = this.a.getWorksheets().get(this.a.getWorksheets().getActiveSheetIndex()).getCells();
    }
    int i = localCells.getMaxRow();
    int j = localCells.getMaxDataColumn();
    this.b.c("TABLE");
    this.b.c("0,1");
    this.b.c("\"EXCEL\"");
    this.b.c("VECTORS");
    this.b.c("0," + (i + 1));
    this.b.c("\"\"");
    this.b.c("TUPLES");
    this.b.c("0," + (j + 1));
    this.b.c("\"\"");
    this.b.c("DATA");
    this.b.c("0,0");
    this.b.c("\"\"");
    int k = -1;
    for (int m = 0; m < localCells.getRows().getCount(); m++)
    {
      Row localRow = localCells.getRows().getRowByIndex(m);
      a(k, localRow.getIndex(), j);
      k = localRow.getIndex();
      this.b.c("-1,0\r\nBOT");
      int n = -1;
      Iterator localIterator = localRow.iterator();
      while (localIterator.hasNext())
      {
        Cell localCell = (Cell)localIterator.next();
        a(n, localCell.getColumn());
        switch (localCell.getType())
        {
        case 0: 
          this.b.c("0,1");
          this.b.c(localCell.getBoolValue() ? "TRUE" : "FALSE");
          break;
        case 3: 
        case 5: 
          this.b.c("1,0");
          this.b.c("\"" + localCell.k() + "\"");
          break;
        case 1: 
        case 4: 
          this.b.c("0," + localCell.k());
          this.b.c("V");
          break;
        case 2: 
          this.b.c("0,0");
          this.b.c("ERROR");
        }
        n = localCell.getColumn();
      }
      a(n, j + 1);
    }
    this.b.c("-1,0");
    this.b.c("EOD");
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    
    while (paramInt1 < paramInt2)
    {
      this.b.c("-1,0\r\nBOT");
      a(-1, paramInt3 + 1);
      paramInt1++;
    }
  }
  
  void a(int paramInt1, int paramInt2)
    throws Exception
  {
    
    while (paramInt1 < paramInt2)
    {
      this.b.c("1,0");
      this.b.c("\"\"");
      paramInt1++;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */