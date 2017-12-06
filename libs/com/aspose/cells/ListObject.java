package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListObject
{
  int a;
  Object b;
  HashMap c;
  byte[] d;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private String p;
  private ListColumnCollection q;
  private ListObjectCollection r;
  private int s = 14548992;
  private String t;
  private String u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z = -1;
  private byte[] A;
  private AutoFilter B;
  private String C;
  private String D;
  private byte E = 4;
  private Object F;
  int e = -1;
  int f = -1;
  int g = -1;
  int h = -1;
  int i = -1;
  int j = -1;
  private int G = 1;
  private int H = 0;
  private za I = null;
  
  int a()
  {
    return this.k;
  }
  
  ListObject(ListObjectCollection parent, String name, int id)
  {
    this.r = parent;
    this.p = name;
    this.C = name;
    this.k = id;
    this.B = new AutoFilter(c().d(), this);
    if (c().d().c().Z() == null) {
      this.F = Integer.valueOf(30);
    }
    this.q = new ListColumnCollection(this);
  }
  
  ListObject(ListObjectCollection parent)
  {
    this.r = parent;
    this.B = new AutoFilter(c().d(), this);
    this.q = new ListColumnCollection(this);
  }
  
  void a(ListObject paramListObject, CopyOptions paramCopyOptions)
  {
    if (paramCopyOptions.a())
    {
      this.k = paramListObject.k;
      this.p = paramListObject.p;
      this.C = paramListObject.C;
    }
    if (paramListObject.d != null)
    {
      this.d = new byte[paramListObject.d.length];
      System.arraycopy(paramListObject.d, 0, this.d, 0, this.d.length);
    }
    this.c = paramListObject.c;
    this.l = paramListObject.l;
    this.m = paramListObject.m;
    this.n = paramListObject.n;
    this.o = paramListObject.o;
    if (paramListObject.B != null)
    {
      this.B = new AutoFilter(c().d(), this);
      this.B.a(paramListObject.B);
    }
    this.w = paramListObject.w;
    this.x = paramListObject.x;
    this.D = paramListObject.D;
    this.z = paramListObject.z;
    this.t = paramListObject.t;
    this.a = paramListObject.a;
    this.u = paramListObject.u;
    this.A = paramListObject.A;
    this.G = paramListObject.G;
    this.y = paramListObject.y;
    this.s = paramListObject.s;
    this.v = paramListObject.v;
    this.E = paramListObject.E;
    this.F = paramListObject.F;
    if ((!paramCopyOptions.b()) && (paramListObject.F != null) && ((paramListObject.F instanceof String)))
    {
      String str = (String)paramListObject.F;
      WorksheetCollection localWorksheetCollection1 = c().d().c();
      TableStyleCollection localTableStyleCollection1 = localWorksheetCollection1.getTableStyles();
      TableStyle localTableStyle1 = localTableStyleCollection1.get(str);
      if (localTableStyle1 == null)
      {
        int i1 = localTableStyleCollection1.addTableStyle(str);
        localTableStyle1 = localTableStyleCollection1.get(i1);
        WorksheetCollection localWorksheetCollection2 = paramListObject.c().d().c();
        TableStyleCollection localTableStyleCollection2 = localWorksheetCollection2.getTableStyles();
        TableStyle localTableStyle2 = localTableStyleCollection2.get(str);
        if (localTableStyle2 != null) {
          localTableStyle1.a(localTableStyle2, paramCopyOptions);
        }
      }
    }
    this.H = paramListObject.H;
    this.q = new ListColumnCollection(this);
    this.q.a(paramListObject.getListColumns(), paramCopyOptions);
    if ((paramCopyOptions.b()) || (paramCopyOptions.a()))
    {
      this.e = paramListObject.e;
      this.f = paramListObject.f;
      this.g = paramListObject.g;
      this.h = paramListObject.h;
      this.i = paramListObject.i;
      this.j = paramListObject.j;
    }
    else
    {
      b(paramListObject.r());
      c(paramListObject.s());
      f(paramListObject.v());
      d(paramListObject.t());
      e(paramListObject.u());
      g(paramListObject.w());
    }
  }
  
  private WorksheetCollection F()
  {
    return c().d().c();
  }
  
  public int getStartRow()
  {
    return this.l;
  }
  
  void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  public int getStartColumn()
  {
    return this.n;
  }
  
  void b(int paramInt)
  {
    this.n = paramInt;
  }
  
  public int getEndRow()
  {
    return this.m;
  }
  
  void c(int paramInt)
  {
    this.m = paramInt;
  }
  
  public int getEndColumn()
  {
    return this.o;
  }
  
  void d(int paramInt)
  {
    this.o = paramInt;
  }
  
  public ListColumnCollection getListColumns()
  {
    return this.q;
  }
  
  private void o(int paramInt)
  {
    Worksheet localWorksheet = this.r.d();
    Cells localCells = this.r.d().getCells();
    int i1 = 0;
    Object localObject1;
    int i3;
    Object localObject2;
    if (paramInt != 0)
    {
      Row localRow = localCells.getRows().get(paramInt - 1);
      localObject1 = new Cell[getListColumns().getCount()];
      for (i3 = 0; i3 < getListColumns().getCount(); i3++)
      {
        localObject1[i3] = localRow.a(i3 + this.n, true, false);
        if (localObject1[i3] != null) {
          i1 = 1;
        }
      }
      if (i1 != 0) {
        for (i3 = paramInt; i3 <= this.m; i3++)
        {
          localObject2 = localCells.getRows().get(i3);
          for (int i4 = 0; i4 < localObject1.length; i4++) {
            if (localObject1[i4] != null)
            {
              Cell localCell1 = localObject1[i4];
              Cell localCell2 = ((Row)localObject2).get(i4 + this.n);
              if ((localCell2.e()) && (localObject1[i4].isFormula())) {
                localCell2.copy(localCell1);
              }
              if ((localCell2.s() == 15) || (localCell2.s() < 0)) {
                localCell2.b(localCell1.s());
              }
            }
          }
        }
      }
    }
    for (int i2 = 0; i2 < localWorksheet.getConditionalFormattings().getCount(); i2++)
    {
      localObject1 = localWorksheet.getConditionalFormattings().get(i2);
      for (i3 = 0; i3 < ((FormatConditionCollection)localObject1).b.size(); i3++)
      {
        localObject2 = (CellArea)((FormatConditionCollection)localObject1).b.get(i3);
        if ((((CellArea)localObject2).EndRow == paramInt - 1) && (((CellArea)localObject2).StartColumn >= this.n) && (((CellArea)localObject2).EndColumn <= this.o))
        {
          ((CellArea)localObject2).EndRow = this.m;
          ((FormatConditionCollection)localObject1).b.set(i3, localObject2);
          break;
        }
      }
    }
    for (i2 = 0; i2 < localWorksheet.getValidations().getCount(); i2++)
    {
      localObject1 = localWorksheet.getValidations().get(i2);
      for (i3 = 0; i3 < ((Validation)localObject1).b.size(); i3++)
      {
        localObject2 = (CellArea)((Validation)localObject1).b.get(i3);
        if ((((CellArea)localObject2).EndRow == paramInt - 1) && (((CellArea)localObject2).StartColumn >= this.n) && (((CellArea)localObject2).EndColumn <= this.o))
        {
          ((CellArea)localObject2).EndRow = this.m;
          ((Validation)localObject1).b.set(i3, localObject2);
          break;
        }
      }
    }
  }
  
  public void resize(int startRow, int startColumn, int endRow, int endColumn, boolean hasHeaders)
  {
    if ((this.l == startRow) && (this.n == startColumn) && (this.m == endRow) && (this.o == endColumn) && (hasHeaders)) {
      return;
    }
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartRow = this.l;
    localCellArea1.StartColumn = this.n;
    localCellArea1.EndRow = this.m;
    localCellArea1.EndColumn = this.o;
    Worksheet localWorksheet1 = this.r.d();
    Cells localCells = localWorksheet1.getCells();
    WorksheetCollection localWorksheetCollection = localWorksheet1.c();
    int i5;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.l == startRow)
    {
      i1 = localWorksheetCollection.r().b(localWorksheet1.c().v(), localWorksheet1.getIndex());
      int i2 = getShowHeaderRow() ? this.l + 1 : this.l;
      i4 = f() ? this.m - 1 : this.m;
      i5 = endRow - startRow - (this.m - this.l);
      localObject1 = localWorksheetCollection.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Worksheet localWorksheet2 = (Worksheet)((Iterator)localObject1).next();
        localObject2 = localWorksheet2.getCharts().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Chart)((Iterator)localObject2).next();
          ((Chart)localObject3).a(localWorksheet1, i1, i2, this.n, i4, this.o, i5);
        }
      }
    }
    this.l = startRow;
    this.n = startColumn;
    this.m = (endRow + (hasHeaders ? 0 : 1));
    this.o = endColumn;
    if (m()) {
      getAutoFilter().setRange(startRow, startColumn, endColumn);
    }
    int i1 = (localCellArea1.EndColumn < startColumn) || (localCellArea1.StartColumn > endColumn) ? 1 : 0;
    ListColumn[] arrayOfListColumn = null;
    int i4 = 1;
    if (i1 == 0)
    {
      arrayOfListColumn = new ListColumn[this.q.getCount()];
      for (i5 = 0; i5 < this.q.getCount(); i5++)
      {
        arrayOfListColumn[i5] = this.q.get(i5);
        if (i4 < arrayOfListColumn[i5].n) {
          i4 = arrayOfListColumn[i5].n;
        }
      }
    }
    this.q.clear();
    if (!hasHeaders)
    {
      CellArea localCellArea2 = new CellArea();
      localCellArea2.StartRow = startRow;
      localCellArea2.StartColumn = startColumn;
      localCellArea2.EndRow = endRow;
      localCellArea2.EndColumn = endColumn;
      localCells.insertRange(localCellArea2, 1, 0, false);
    }
    for (int i6 = 1; i6 <= this.o - this.n + 1; i6++)
    {
      localObject1 = null;
      int i7 = i6 + this.n - 1;
      localObject2 = localCells.a(this.l, i7, false);
      if (hasHeaders)
      {
        if ("".equals(((Cell)localObject2).k()))
        {
          localObject1 = "Column" + com.aspose.cells.b.a.zp.a(i6);
          ((Cell)localObject2).putValue((String)localObject1);
        }
        else
        {
          localObject1 = ((Cell)localObject2).k();
          ((Cell)localObject2).putValue((String)localObject1);
        }
      }
      else
      {
        localObject1 = "Column" + com.aspose.cells.b.a.zp.a(i6);
        ((Cell)localObject2).putValue((String)localObject1);
      }
      localObject3 = ((Cell)localObject2).o();
      ((Style)localObject3).getFont().setBold(true);
      ((Cell)localObject2).a((Style)localObject3);
      ListColumn localListColumn = null;
      if ((i7 >= localCellArea1.StartColumn) && (i7 <= localCellArea1.EndColumn))
      {
        localListColumn = arrayOfListColumn[(i7 - localCellArea1.StartColumn)];
      }
      else
      {
        localListColumn = new ListColumn(this.q, (String)localObject1, i4);
        i4++;
      }
      this.q.a(localListColumn);
    }
    localCellArea1.StartColumn = startColumn;
    localCellArea1.EndColumn = endColumn;
    if (endRow > localCellArea1.EndRow) {
      o(localCellArea1.EndRow + 1);
    }
    QueryTable localQueryTable = getQueryTable();
    if ((localQueryTable != null) && (!zw.b(localQueryTable.getName())))
    {
      int i3 = localWorksheet1.getIndex();
      i4 = localWorksheetCollection.getNames().a(localQueryTable.getName(), i3, true);
      if (i4 == -1) {
        i4 = localWorksheetCollection.getNames().a(localQueryTable.a(), i3, true);
      }
      if (i4 != -1)
      {
        Name localName = localWorksheetCollection.getNames().get(i4);
        localObject1 = new Range(D(), localCells);
        localName.setRefersTo(((Range)localObject1).getRefersTo());
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    this.l = paramInt1;
    this.n = paramInt2;
    this.m = (paramInt3 + (paramBoolean ? 0 : 1));
    this.o = paramInt4;
    getAutoFilter().setRange(paramInt1, paramInt2, paramInt4);
    this.q = new ListColumnCollection(this);
    Cells localCells = this.r.d().getCells();
    if (!paramBoolean)
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = paramInt1;
      localCellArea.StartColumn = paramInt2;
      localCellArea.EndRow = paramInt3;
      localCellArea.EndColumn = paramInt4;
      localCells.insertRange(localCellArea, 1, 0, false);
    }
    for (int i1 = 1; i1 <= this.o - this.n + 1; i1++)
    {
      String str = null;
      Cell localCell = localCells.a(this.l, i1 + this.n - 1, false);
      if (paramBoolean)
      {
        if ("".equals(localCell.k()))
        {
          str = "Column" + com.aspose.cells.b.a.zp.a(i1);
          localCell.putValue(str);
        }
        else
        {
          str = localCell.k();
          localCell.putValue(str);
        }
      }
      else
      {
        str = "Column" + com.aspose.cells.b.a.zp.a(i1);
        localCell.putValue(str);
      }
      Style localStyle = localCell.o();
      localStyle.getFont().setBold(true);
      localCell.a(localStyle);
      ListColumn localListColumn = new ListColumn(this.q, str, i1 - 1);
      this.q.a(localListColumn);
    }
  }
  
  public void putCellValue(int rowOffset, int columnOffset, Object value)
  {
    Worksheet localWorksheet = c().d();
    Cells localCells = localWorksheet.getCells();
    int i1 = this.l + rowOffset;
    int i2 = this.n + columnOffset;
    Cell localCell1 = localWorksheet.getCells().get(i1, i2);
    if (i1 == this.m + 1)
    {
      localCell1.putValue(value);
      if ((columnOffset >= 0) && (i2 <= this.o))
      {
        this.m = i1;
        o(i1);
      }
      return;
    }
    Object localObject1;
    if (i2 == this.o + 1)
    {
      localCell1.putValue(value);
      if ((i1 >= this.l) && (i1 <= this.m))
      {
        this.o += 1;
        localObject1 = "Column" + com.aspose.cells.a.c.zp.a(columnOffset);
        if (getShowHeaderRow()) {
          if (i1 == this.l)
          {
            localObject1 = localCell1.getStringValue();
          }
          else
          {
            localObject2 = localCells.get(this.l, this.o);
            ((Cell)localObject2).putValue((String)localObject1);
          }
        }
        Object localObject2 = new ListColumn(this.q, (String)localObject1, columnOffset);
        this.q.a((ListColumn)localObject2);
      }
    }
    else if ((i2 <= this.o) && (i2 >= this.n))
    {
      if ((getShowHeaderRow()) && (i1 == this.l))
      {
        localCell1.putValue(value);
        getListColumns().get(columnOffset).a(localCell1.getStringValue());
      }
      else if ((i1 >= this.l) && (i1 <= this.m))
      {
        localObject1 = localCells.createRange(i1, this.n, 1, this.o - this.n + 1);
        if (((Range)localObject1).d())
        {
          localCell1.putValue(value);
          for (int i3 = this.n; i3 <= this.o; i3++) {
            if (i3 != columnOffset)
            {
              ListColumn localListColumn = getListColumns().get(i3 - this.n);
              String str = localListColumn.i();
              if (str != null)
              {
                Cell localCell2 = localCells.get(i1, i3);
                localCell2.setFormula(str);
                int i4 = this.l + 1;
                int i5 = rowOffset - 1;
                if (!getShowHeaderRow())
                {
                  i4--;
                  i5++;
                }
                zaaq.a(localWorksheet, true, i4, i5, i4, i1, -1, -1, localCell2.h().b);
              }
            }
          }
        }
        else
        {
          localCell1.putValue(value);
        }
      }
    }
    else
    {
      localCell1.putValue(value);
    }
  }
  
  public boolean getShowHeaderRow()
  {
    return x() == 1;
  }
  
  public void setShowHeaderRow(boolean value)
  {
    if ((x() == 1) == value) {
      return;
    }
    if (value)
    {
      G();
      Cells localCells = c().d().getCells();
      Cell localCell = localCells.a(getStartRow(), getStartColumn(), false);
      Style localStyle = localCell.o();
      localStyle.getFont().setBold(true);
      localCell.a(localStyle);
      for (int i1 = 1; i1 < getListColumns().getCount(); i1++)
      {
        localCell = localCells.a(getStartRow(), getStartColumn() + i1, false);
        localCell.b(localCell.s());
      }
      if (x() == 0) {
        l(1);
      }
    }
    else
    {
      if (x() == 1) {
        H();
      }
      l(0);
    }
  }
  
  private void G()
  {
    Cells localCells = c().d().getCells();
    this.l -= 1;
    Row localRow = localCells.getRows().a(this.l, false, true, false);
    for (int i1 = 0; i1 < getListColumns().getCount(); i1++) {
      localRow.get(this.n + i1).putValue(getListColumns().get(i1).getName());
    }
    i1 = getEndRow();
    if (getListColumns().b()) {
      i1--;
    }
    getAutoFilter().setRange(CellsHelper.a(getStartRow(), getStartColumn(), i1, getEndColumn()));
  }
  
  private void H()
  {
    Cells localCells = c().d().getCells();
    int i1 = localCells.getRows().d(this.l);
    if (i1 != -1) {
      localCells.getRows().removeAt(i1);
    }
    this.l += 1;
    getAutoFilter().setRange(null);
  }
  
  public boolean getShowTotals()
  {
    return f();
  }
  
  public void setShowTotals(boolean value)
  {
    if (f() == value) {
      return;
    }
    b(value);
    if (value)
    {
      I();
      Cells localCells = c().d().getCells();
      Cell localCell = localCells.a(getEndRow(), getStartColumn(), false);
      localCell.putValue("Total");
      Style localStyle = localCell.o();
      localStyle.getFont().setBold(true);
      localCell.a(localStyle);
      for (int i1 = 1; i1 < getListColumns().getCount(); i1++)
      {
        localCell = localCells.a(getEndRow(), getStartColumn() + i1, false);
        localCell.b(localCell.s());
        if (getListColumns().get(i1).l() != null) {
          localCell.putValue(getListColumns().get(i1).l());
        }
      }
      ListColumn localListColumn = getListColumns().get(getListColumns().getCount() - 1);
      if ((localListColumn.l() == null) && (localListColumn.getTotalsCalculation() == 0)) {
        getListColumns().get(getListColumns().getCount() - 1).setTotalsCalculation(6);
      }
      if (z() == 0) {
        m(1);
      }
    }
    else
    {
      if (getListColumns().b()) {
        J();
      }
      m(0);
    }
  }
  
  private void I()
  {
    Cells localCells = c().d().getCells();
    CellArea localCellArea = new CellArea();
    localCellArea.StartColumn = getStartColumn();
    localCellArea.EndColumn = getEndColumn();
    localCellArea.StartRow = (getEndRow() + 1);
    localCellArea.EndRow = (getEndRow() + 1);
    localCells.insertRange(localCellArea, 0);
    this.m += 1;
  }
  
  private void J()
  {
    Cells localCells = c().d().getCells();
    localCells.deleteRange(getEndRow(), getStartColumn(), getEndRow(), getEndColumn(), 4);
  }
  
  public Range getDataRange()
  {
    int i1 = getEndRow() - getStartRow();
    int i2 = getStartRow() + 1;
    if (!getShowHeaderRow())
    {
      i1++;
      i2 = getStartRow();
    }
    if (getShowTotals()) {
      i1--;
    }
    Range localRange = new Range(i2, getStartColumn(), i1, getListColumns().getCount(), c().d().getCells());
    return localRange;
  }
  
  public void updateColumnName()
  {
    if (!getShowHeaderRow()) {
      return;
    }
    Cells localCells = c().d().getCells();
    Row localRow = localCells.checkRow(this.l);
    if (localRow == null) {
      return;
    }
    for (int i1 = 0; i1 < this.q.getCount(); i1++)
    {
      ListColumn localListColumn = this.q.get(i1);
      Cell localCell = localRow.c(localListColumn.e());
      switch (localCell.getType())
      {
      case 3: 
        break;
      case 5: 
        localListColumn.a(localCell.k());
        break;
      default: 
        localCell.putValue(localCell.k());
        localListColumn.a(localCell.k());
      }
    }
  }
  
  boolean a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return false;
    }
    CellArea localCellArea = new CellArea();
    localCellArea.StartColumn = this.n;
    localCellArea.EndColumn = this.o;
    localCellArea.StartRow = this.l;
    localCellArea.EndRow = this.m;
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    localCellArea = zban.b(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    if (i1 != 0) {
      return true;
    }
    for (int i2 = 0; i2 < this.q.getCount(); i2++)
    {
      ListColumn localListColumn1 = this.q.get(i2);
      localListColumn1.b(paramInt1, paramInt2);
    }
    QueryTable localQueryTable = getQueryTable();
    int i3;
    int i4;
    int i5;
    int i6;
    if (paramInt2 < 0)
    {
      i3 = paramInt1 - paramInt2 - 1;
      if (i3 >= this.n) {
        if (paramInt1 < this.n)
        {
          i4 = i3 - this.n + 1;
          for (i5 = 0; i5 < i4; i5++) {
            this.q.removeAt(0);
          }
        }
        else if (paramInt1 <= this.o)
        {
          i4 = paramInt1 - this.n;
          if (i3 < this.o)
          {
            for (i5 = 0; i5 < -paramInt2; i5++) {
              this.q.removeAt(i4);
            }
          }
          else
          {
            i5 = this.o - paramInt1 + 1;
            for (i6 = 0; i6 < i5; i6++) {
              this.q.removeAt(i4);
            }
          }
        }
      }
    }
    else if ((paramInt1 > this.n) && (paramInt1 <= this.o))
    {
      i3 = paramInt1 - this.n;
      i4 = getListColumns().getCount();
      i5 = getListColumns().a();
      i6 = -1;
      if (localQueryTable != null) {
        i6 = localQueryTable.k;
      }
      for (int i7 = 0; i7 < paramInt2; i7++)
      {
        String str = "Column" + (i7 + i4 + 1);
        ListColumn localListColumn2 = new ListColumn(getListColumns(), str, i5);
        this.q.a(i3 + i7, localListColumn2);
        localListColumn2.setName(str);
        i5++;
        if (i6 != -1)
        {
          localListColumn2.b(i6);
          localListColumn2.d("" + i5);
          zaye localzaye = new zaye();
          localzaye.a = i6;
          localzaye.b = str;
          localzaye.c = i5;
          localzaye.a(false);
          localQueryTable.c().a(i3, localzaye);
          localQueryTable.k += 1;
          i6++;
        }
      }
    }
    this.l = localCellArea.StartRow;
    this.n = localCellArea.StartColumn;
    this.m = localCellArea.EndRow;
    this.o = localCellArea.EndColumn;
    if (this.B != null) {
      this.B.b(paramInt1, paramInt2);
    }
    return false;
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > this.o) || (paramInt2 + paramInt4 - 1 < this.n)) {
      return true;
    }
    int i1 = paramInt1 + paramInt3 - 1;
    if ((i1 < this.l) || (paramInt1 > this.l)) {
      return true;
    }
    return i1 >= this.m;
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartColumn = this.n;
    localCellArea.EndColumn = this.o;
    localCellArea.StartRow = this.l;
    localCellArea.EndRow = this.m;
    if (paramInt1 > localCellArea.EndRow) {
      return false;
    }
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    localCellArea = zban.a(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    if (i1 != 0) {
      return true;
    }
    if ((paramInt2 < 0) && (localCellArea.StartRow == localCellArea.EndRow) && (getShowHeaderRow())) {
      localCellArea.EndRow += 1;
    }
    int i2 = this.q.c().getStartRow() + this.q.c().x();
    int i3 = this.m;
    this.l = localCellArea.StartRow;
    this.n = localCellArea.StartColumn;
    this.m = localCellArea.EndRow;
    this.o = localCellArea.EndColumn;
    if ((paramInt2 > 0) && (i2 <= paramInt1) && (i3 >= paramInt1)) {
      for (int i4 = 0; i4 < this.q.getCount(); i4++)
      {
        ListColumn localListColumn = this.q.get(i4);
        localListColumn.a(paramInt1, paramInt2);
      }
    }
    if (this.B != null) {
      this.B.a(paramInt1, paramInt2);
    }
    return false;
  }
  
  boolean a(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 4: 
      if ((paramCellArea.StartColumn <= getStartColumn()) && (paramCellArea.EndColumn >= getEndColumn())) {
        return b(paramCellArea.StartRow, -paramInt1);
      }
      break;
    case 1: 
      if ((paramCellArea.StartRow <= getStartRow()) && (paramCellArea.EndRow >= getEndRow())) {
        return a(paramCellArea.StartColumn, -paramInt1);
      }
      break;
    case 0: 
      if ((paramCellArea.StartColumn <= getStartColumn()) && (paramCellArea.EndColumn >= getEndColumn())) {
        return b(paramCellArea.StartRow, paramInt1);
      }
      break;
    case 3: 
      if ((paramCellArea.StartRow <= getStartRow()) && (paramCellArea.EndRow >= getEndRow())) {
        return a(paramCellArea.StartColumn, paramInt1);
      }
      break;
    }
    return false;
  }
  
  String b()
  {
    return this.p;
  }
  
  ListObjectCollection c()
  {
    return this.r;
  }
  
  public QueryTable getQueryTable()
  {
    if ((this.a == 3) && (this.b != null) && ((this.b instanceof QueryTable))) {
      return (QueryTable)this.b;
    }
    return null;
  }
  
  public int getDataSourceType()
  {
    return this.a;
  }
  
  int d()
  {
    return this.s;
  }
  
  void e(int paramInt)
  {
    this.s = paramInt;
  }
  
  boolean e()
  {
    return (this.s & 0x10) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.s |= 0x10;
    } else {
      this.s &= 0xFFFFFFEF;
    }
  }
  
  boolean f()
  {
    return (this.s & 0x40) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.s |= 0x40;
    } else {
      this.s &= 0xFFFFFFBF;
    }
  }
  
  boolean g()
  {
    return (this.s & 0x200) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.s |= 0x200;
    } else {
      this.s &= 0xFDFF;
    }
  }
  
  boolean h()
  {
    return (this.s & 0x4000) != 0;
  }
  
  boolean i()
  {
    return (this.s & 0x100000) != 0;
  }
  
  boolean j()
  {
    return (this.s & 0x1000000) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.s |= 0x1000000;
    } else {
      this.s &= 0xFEFFFFFF;
    }
  }
  
  void a(String paramString)
  {
    this.t = paramString;
  }
  
  void b(String paramString)
  {
    this.u = paramString;
  }
  
  void f(int paramInt)
  {
    this.v = paramInt;
  }
  
  void g(int paramInt)
  {
    this.w = paramInt;
  }
  
  void h(int paramInt)
  {
    this.x = paramInt;
  }
  
  void i(int paramInt)
  {
    this.y = paramInt;
  }
  
  int k()
  {
    return this.z;
  }
  
  void j(int paramInt)
  {
    this.z = paramInt;
  }
  
  byte[] l()
  {
    return this.A;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.A = paramArrayOfByte;
  }
  
  boolean m()
  {
    if (this.B == null) {
      return false;
    }
    return this.B.g() != 0;
  }
  
  AutoFilter n()
  {
    return this.B;
  }
  
  public AutoFilter getAutoFilter()
  {
    if (this.B == null) {
      this.B = new AutoFilter(this.r.d(), this);
    }
    return this.B;
  }
  
  public String getDisplayName()
  {
    return o();
  }
  
  public void setDisplayName(String value)
  {
    if (value.indexOf(' ') != -1) {
      throw new CellsException(6, "Invalid name of the table.");
    }
    if (!Name.d.d(value)) {
      throw new CellsException(6, "Invalid name of the table.");
    }
    c(value);
    this.p = value;
  }
  
  String o()
  {
    if (this.C == null) {
      return this.p;
    }
    return this.C;
  }
  
  void c(String paramString)
  {
    if (zw.b(paramString)) {
      paramString = null;
    }
    if (!zw.b(this.C, paramString))
    {
      if (this.C != null) {
        F().i.remove(this.C);
      }
      if (paramString != null) {
        F().i.put(paramString.toUpperCase(), this);
      }
    }
    this.C = paramString;
  }
  
  public String getComment()
  {
    return this.D;
  }
  
  public void setComment(String value)
  {
    this.D = value;
  }
  
  byte p()
  {
    return this.E;
  }
  
  public boolean getShowTableStyleFirstColumn()
  {
    return (this.E & 0xFF & 0x1) != 0;
  }
  
  public void setShowTableStyleFirstColumn(boolean value)
  {
    if (value) {
      this.E = ((byte)(this.E | 0x1));
    } else {
      this.E = ((byte)(this.E & 0xFE));
    }
  }
  
  public boolean getShowTableStyleLastColumn()
  {
    return (this.E & 0xFF & 0x2) != 0;
  }
  
  public void setShowTableStyleLastColumn(boolean value)
  {
    if (value) {
      this.E = ((byte)(this.E | 0x2));
    } else {
      this.E = ((byte)(this.E & 0xFD));
    }
  }
  
  public boolean getShowTableStyleRowStripes()
  {
    return (this.E & 0xFF & 0x4) != 0;
  }
  
  public void setShowTableStyleRowStripes(boolean value)
  {
    if (value) {
      this.E = ((byte)(this.E | 0x4));
    } else {
      this.E = ((byte)(this.E & 0xFB));
    }
  }
  
  public boolean getShowTableStyleColumnStripes()
  {
    return (this.E & 0xFF & 0x8) != 0;
  }
  
  public void setShowTableStyleColumnStripes(boolean value)
  {
    if (value) {
      this.E = ((byte)(this.E | 0x8));
    } else {
      this.E = ((byte)(this.E & 0xF7));
    }
  }
  
  public void applyStyleToRange()
  {
    Style localStyle1 = F().Q();
    for (int i1 = getStartRow(); i1 <= getEndRow(); i1++)
    {
      Row localRow = c().d().getCells().getRows().get(i1);
      for (int i2 = getStartColumn(); i2 <= getEndColumn(); i2++)
      {
        Style localStyle2 = d(i1, i2);
        Cell localCell = localRow.a(i2, false, true);
        Style localStyle3 = localCell.getStyle();
        zla.a(localStyle3, localStyle2, localStyle1);
        localCell.setStyle(localStyle3);
      }
    }
  }
  
  public void convertToRange()
  {
    applyStyleToRange();
    F().b(c().d().getIndex(), a());
    c().b(this);
  }
  
  TableStyle q()
  {
    if (this.F == null) {
      return this.r.d().c().getTableStyles().getBuiltinTableStyle(30);
    }
    if ((this.F instanceof String)) {
      return this.r.d().c().getTableStyles().get((String)this.F);
    }
    if ((this.F instanceof Integer)) {
      return this.r.d().c().getTableStyles().getBuiltinTableStyle(((Integer)this.F).intValue());
    }
    return this.r.d().c().getTableStyles().getBuiltinTableStyle(30);
  }
  
  public int getTableStyleType()
  {
    if (this.F == null) {
      return 0;
    }
    if ((this.F instanceof String)) {
      return 61;
    }
    return ((Integer)this.F).intValue();
  }
  
  public void setTableStyleType(int value)
  {
    this.F = Integer.valueOf(value);
    L();
  }
  
  public String getTableStyleName()
  {
    if (this.F == null) {
      return null;
    }
    if ((this.F instanceof String)) {
      return (String)this.F;
    }
    return zbvp.a(((Integer)this.F).intValue());
  }
  
  public void setTableStyleName(String value)
  {
    int i1 = zbvp.a(value);
    if (i1 != 61) {
      this.F = Integer.valueOf(i1);
    } else {
      this.F = value;
    }
    L();
  }
  
  zbzi a(Style paramStyle)
  {
    if (paramStyle != null)
    {
      zbzi localzbzi = new zbzi();
      localzbzi.a(paramStyle);
      if (localzbzi.getCount() < 1) {
        localzbzi = null;
      }
      return localzbzi;
    }
    return null;
  }
  
  Style r()
  {
    if (this.e != -1) {
      return F().getDxfs().get(this.e);
    }
    return null;
  }
  
  void b(Style paramStyle)
  {
    this.e = (paramStyle == null ? -1 : F().getDxfs().a(paramStyle));
  }
  
  Style s()
  {
    if (this.f != -1) {
      return F().getDxfs().get(this.f);
    }
    return null;
  }
  
  void c(Style paramStyle)
  {
    this.f = (paramStyle == null ? -1 : F().getDxfs().a(paramStyle));
  }
  
  Style t()
  {
    if (this.h != -1) {
      return F().getDxfs().get(this.h);
    }
    return null;
  }
  
  void d(Style paramStyle)
  {
    this.h = (paramStyle == null ? -1 : F().getDxfs().a(paramStyle));
  }
  
  Style u()
  {
    if (this.i != -1) {
      return F().getDxfs().get(this.i);
    }
    return null;
  }
  
  void e(Style paramStyle)
  {
    this.i = (paramStyle == null ? -1 : F().getDxfs().a(paramStyle));
  }
  
  Style v()
  {
    if (this.g != -1) {
      return F().getDxfs().get(this.g);
    }
    return null;
  }
  
  void f(Style paramStyle)
  {
    this.g = (paramStyle == null ? -1 : F().getDxfs().a(paramStyle));
  }
  
  Style w()
  {
    if (this.j != -1) {
      return F().getDxfs().get(this.j);
    }
    return null;
  }
  
  void g(Style paramStyle)
  {
    this.j = (paramStyle == null ? -1 : F().getDxfs().a(paramStyle));
  }
  
  private boolean K()
  {
    Style localStyle = t();
    return (localStyle != null) && (localStyle.isModified(1));
  }
  
  private Style[] a(TableStyle paramTableStyle)
  {
    Style[] arrayOfStyle = new Style[32];
    TableStyleElementCollection localTableStyleElementCollection = paramTableStyle.getTableStyleElements();
    for (int i1 = localTableStyleElementCollection.getCount() - 1; i1 > -1; i1--)
    {
      TableStyleElement localTableStyleElement = localTableStyleElementCollection.get(i1);
      if (localTableStyleElement.a() != null) {
        arrayOfStyle[localTableStyleElement.getType()] = localTableStyleElement.a();
      }
    }
    return arrayOfStyle;
  }
  
  void k(int paramInt)
  {
    this.k = paramInt;
    if (paramInt > c().d().c().e) {
      c().d().c().e = paramInt;
    }
  }
  
  void d(String paramString)
  {
    this.p = paramString;
  }
  
  int x()
  {
    return this.G;
  }
  
  void l(int paramInt)
  {
    this.G = paramInt;
  }
  
  String y()
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = getStartRow();
    localCellArea.StartColumn = getStartColumn();
    localCellArea.EndRow = getEndRow();
    if (getEndRow() - getStartRow() == 0) {
      localCellArea.EndRow += 1;
    }
    localCellArea.EndColumn = getEndColumn();
    return zauj.a(localCellArea);
  }
  
  int z()
  {
    return this.H;
  }
  
  void m(int paramInt)
  {
    this.H = paramInt;
  }
  
  boolean A()
  {
    return (this.B != null) && (this.B.getRange() != null);
  }
  
  void B()
  {
    if (f())
    {
      Cells localCells = c().d().getCells();
      for (int i2 = 0; i2 < getListColumns().getCount(); i2++)
      {
        ListColumn localListColumn2 = getListColumns().get(i2);
        if ((localListColumn2.l() != null) && (localListColumn2.getTotalsCalculation() == 0))
        {
          Cell localCell = localCells.a(this.m, this.n + i2, false);
          if (localCell.d()) {
            localCell.putValue(localListColumn2.l());
          }
        }
      }
    }
    for (int i1 = 0; i1 < getListColumns().getCount(); i1++)
    {
      ListColumn localListColumn1 = getListColumns().get(i1);
      try
      {
        localListColumn1.j();
      }
      catch (Exception localException) {}
    }
  }
  
  int c(int paramInt1, int paramInt2)
  {
    if (this.I == null) {
      this.I = new za(this);
    }
    return this.I.a(paramInt1, paramInt2);
  }
  
  Style n(int paramInt)
  {
    return this.I.a(paramInt);
  }
  
  Style d(int paramInt1, int paramInt2)
  {
    if (this.I == null) {
      this.I = new za(this);
    }
    return this.I.b(paramInt1, paramInt2);
  }
  
  void C()
  {
    if (this.I == null) {
      this.I = new za(this);
    }
  }
  
  private void L()
  {
    this.I = null;
  }
  
  private zdk a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    zdk localzdk = new zdk();
    switch (paramInt1)
    {
    case 3: 
    case 4: 
      if (paramInt4 == 0)
      {
        localzdk.c = true;
        if (paramInt4 == paramInt5 - 1) {
          localzdk.d = true;
        } else {
          localzdk.h = true;
        }
      }
      else if (paramInt4 > 0)
      {
        localzdk.g = true;
        if (paramInt4 == paramInt5 - 1) {
          localzdk.d = true;
        } else {
          localzdk.h = true;
        }
      }
      if (paramInt2 == this.l) {
        localzdk.a = true;
      } else {
        localzdk.e = true;
      }
      if (paramInt2 == this.m) {
        localzdk.b = true;
      } else {
        localzdk.f = true;
      }
      break;
    case 5: 
    case 6: 
      if (paramInt4 == 0)
      {
        localzdk.a = true;
        if (paramInt4 == paramInt5 - 1) {
          localzdk.b = true;
        } else {
          localzdk.f = true;
        }
      }
      else if (paramInt4 > 0)
      {
        localzdk.e = true;
        if (paramInt4 == paramInt5 - 1) {
          localzdk.b = true;
        } else {
          localzdk.f = true;
        }
      }
      if (paramInt3 == this.n) {
        localzdk.c = true;
      } else {
        localzdk.g = true;
      }
      if (paramInt3 == this.o) {
        localzdk.d = true;
      } else {
        localzdk.h = true;
      }
      break;
    case 7: 
    case 8: 
      localzdk.c = (localzdk.d = 1);
      if (paramInt2 == this.l) {
        localzdk.a = true;
      } else {
        localzdk.e = true;
      }
      if (paramInt2 == this.m) {
        localzdk.b = true;
      } else {
        localzdk.f = true;
      }
      break;
    case 9: 
    case 10: 
      localzdk.a = (localzdk.b = 1);
      if (paramInt3 == this.n) {
        localzdk.c = true;
      } else {
        localzdk.g = true;
      }
      if (paramInt3 == this.o) {
        localzdk.d = true;
      } else {
        localzdk.h = true;
      }
      break;
    case 11: 
    case 12: 
    case 13: 
    case 14: 
      localzdk.a = (localzdk.b = localzdk.c = localzdk.d = 1);
      break;
    default: 
      if (paramInt2 == this.l) {
        localzdk.a = true;
      } else {
        localzdk.e = true;
      }
      if (paramInt2 == this.m) {
        localzdk.b = true;
      } else {
        localzdk.f = true;
      }
      if (paramInt3 == this.n) {
        localzdk.c = true;
      } else {
        localzdk.g = true;
      }
      if (paramInt3 == this.o) {
        localzdk.d = true;
      } else {
        localzdk.h = true;
      }
      break;
    }
    return localzdk;
  }
  
  CellArea D()
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = this.l;
    localCellArea.StartColumn = this.n;
    localCellArea.EndRow = this.m;
    localCellArea.EndColumn = this.o;
    return localCellArea;
  }
  
  int E()
  {
    int i1 = -1;
    Iterator localIterator = getListColumns().iterator();
    while (localIterator.hasNext())
    {
      ListColumn localListColumn = (ListColumn)localIterator.next();
      XmlColumnProperty localXmlColumnProperty = localListColumn.a();
      if (localXmlColumnProperty != null)
      {
        i1 = localXmlColumnProperty.a();
        break;
      }
    }
    return i1;
  }
  
  void a(boolean paramBoolean, zbcq paramzbcq)
  {
    Iterator localIterator = getListColumns().iterator();
    while (localIterator.hasNext())
    {
      ListColumn localListColumn = (ListColumn)localIterator.next();
      if (localListColumn.f != null) {
        localListColumn.f = zcx.a(F(), paramBoolean, localListColumn.f, -1, 0, 0, false, paramzbcq);
      }
      if (localListColumn.e != null) {
        localListColumn.e = zcx.a(F(), paramBoolean, localListColumn.e, -1, 0, 0, false, paramzbcq);
      }
    }
  }
  
  private class za
  {
    private ListObject b;
    private WorksheetCollection c;
    private zbzv d;
    private int[][] e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int[] j = null;
    private int[] k = null;
    
    int a(int paramInt1, int paramInt2)
    {
      if (this.f < 0) {
        return this.f;
      }
      int m;
      if ((this.k != null) && (paramInt2 != ListObject.a(this.b)) && (paramInt2 != ListObject.b(this.b)))
      {
        m = za.a(this.k, paramInt2);
        if (m < 0) {
          m = -m - 1;
        }
        paramInt2 -= m;
      }
      if (paramInt1 == ListObject.c(this.b)) {
        return this.e[0][(paramInt2 - ListObject.b(this.b))];
      }
      if (paramInt1 == ListObject.d(this.b)) {
        return this.e[(this.e.length - 1)][(paramInt2 - ListObject.b(this.b))];
      }
      if ((this.b.f()) && (paramInt1 == this.h)) {
        return this.e[(this.e.length - 2)][(paramInt2 - ListObject.b(this.b))];
      }
      if (this.j != null)
      {
        m = za.a(this.j, paramInt1);
        if (m < 0) {
          m = -m - 1;
        }
        paramInt1 -= m;
      }
      paramInt1 -= ListObject.c(this.b);
      if (this.i)
      {
        if (paramInt1 == 1) {
          return this.e[1][(paramInt2 - ListObject.b(this.b))];
        }
        return this.e[((paramInt1 - 2) % this.g + 2)][(paramInt2 - ListObject.b(this.b))];
      }
      return this.e[((paramInt1 - 1) % this.g + 1)][(paramInt2 - ListObject.b(this.b))];
    }
    
    Style b(int paramInt1, int paramInt2)
    {
      return a(a(paramInt1, paramInt2));
    }
    
    Style a(int paramInt)
    {
      if (paramInt < 0) {
        return null;
      }
      return this.d.c(paramInt);
    }
    
    za(ListObject paramListObject)
    {
      this.b = paramListObject;
      this.c = ListObject.e(paramListObject);
      TableStyle localTableStyle = paramListObject.q();
      int m = -1;
      int n = -1;
      int i1 = ListObject.c(this.b);
      int i2 = ListObject.d(this.b);
      if ((localTableStyle == null) && (!ListObject.f(paramListObject)))
      {
        this.d = null;
        this.e = ((int[][])null);
        this.j = null;
        this.k = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = false;
        return;
      }
      if (localTableStyle == null) {
        localTableStyle = new TableStyle(this.c.getTableStyles(), "Temp");
      }
      this.d = new zbzv(this.c);
      this.f = this.d.b(new Style(this.c));
      int i3 = 4;
      if (ListObject.g(this.b) > 0)
      {
        this.i = true;
        i1++;
        i3++;
      }
      else
      {
        this.i = false;
      }
      if (paramListObject.getShowTableStyleRowStripes())
      {
        TableStyleElement localTableStyleElement = localTableStyle.getTableStyleElements().getByTableStyleElementType(5);
        m = 1;
        if (localTableStyleElement != null) {
          m = localTableStyleElement.getSize();
        }
        localTableStyleElement = localTableStyle.getTableStyleElements().getByTableStyleElementType(6);
        n = 1;
        if (localTableStyleElement != null) {
          n = localTableStyleElement.getSize();
        }
        this.g = (m + n);
        i3 += this.g;
        if (this.b.f())
        {
          i2--;
          i3++;
        }
      }
      else
      {
        if (this.b.f())
        {
          i2--;
          i3++;
        }
        this.g = 1;
        i3++;
      }
      this.j = c(i1, i2);
      this.k = a();
      this.e = new int[i3][];
      this.h = i2;
      a(localTableStyle, i1, m, n);
    }
    
    private int[] c(int paramInt1, int paramInt2)
    {
      if (paramInt1 > paramInt2) {
        return null;
      }
      Cells localCells = this.b.c().d().getCells();
      zv localzv = localCells.e();
      zaiv localzaiv = localzv.b(paramInt1, paramInt2, false);
      if (localzaiv == null) {
        return null;
      }
      zami localzami = new zami();
      int m;
      if (localCells.isDefaultRowHidden()) {
        for (m = paramInt1;; m++)
        {
          n = localzaiv.a();
          if (n < 0) {
            break;
          }
          int i1 = localzv.a(n);
          if (i1 > m) {
            for (;;)
            {
              localzami.a(m);
              m++;
              if (m == i1) {
                break;
              }
            }
          }
          if (zbdx.c(localzv.k(n, 0))) {
            localzami.a(i1);
          }
        }
      } else {
        for (;;)
        {
          m = localzaiv.a();
          if (m < 0) {
            break;
          }
          if (zbdx.c(localzv.k(m, 0))) {
            localzami.a(localzv.a(m));
          }
        }
      }
      if (localzami.a() < 1) {
        return null;
      }
      int[] arrayOfInt = new int[localzami.a()];
      for (int n = 0; n < arrayOfInt.length; n++) {
        arrayOfInt[n] = localzami.b(n);
      }
      return arrayOfInt;
    }
    
    private int[] a()
    {
      zami localzami = new zami();
      Cells localCells = this.b.c().d().getCells();
      for (int m = ListObject.b(this.b); m < ListObject.a(this.b); m++) {
        if (localCells.isColumnHidden(m)) {
          localzami.a(m);
        }
      }
      if (localzami.a() < 1) {
        return null;
      }
      int[] arrayOfInt = new int[localzami.a()];
      for (int n = 0; n < arrayOfInt.length; n++) {
        arrayOfInt[n] = localzami.b(n);
      }
      return arrayOfInt;
    }
    
    private int[] b()
    {
      int m = this.h - 1 - ListObject.c(this.b);
      if (this.j != null)
      {
        m -= this.j.length;
        if (this.j[(this.j.length - 1)] == this.h) {
          m++;
        }
      }
      int[] arrayOfInt1 = this.i ? this.e[((m - 2) % this.g + 2)] : this.e[((m - 1) % this.g + 1)];
      int[] arrayOfInt2 = new int[arrayOfInt1.length];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt2.length);
      return arrayOfInt2;
    }
    
    private void a(TableStyle paramTableStyle, int paramInt1, int paramInt2, int paramInt3)
    {
      Style[] arrayOfStyle = ListObject.a(this.b, paramTableStyle);
      int[] arrayOfInt = new int[arrayOfStyle.length];
      zdk[] arrayOfzdk = new zdk[arrayOfStyle.length];
      StringBuilder localStringBuilder = new StringBuilder(6 * arrayOfStyle.length);
      HashMap localHashMap = new HashMap();
      int m = -1;
      int n = -1;
      if (this.b.getShowTableStyleColumnStripes())
      {
        localObject1 = paramTableStyle.getTableStyleElements().getByTableStyleElementType(3);
        m = 1;
        if (localObject1 != null) {
          m = ((TableStyleElement)localObject1).getSize();
        }
        localObject1 = paramTableStyle.getTableStyleElements().getByTableStyleElementType(4);
        n = 1;
        if (localObject1 != null) {
          n = ((TableStyleElement)localObject1).getSize();
        }
      }
      Object localObject1 = new int[ListObject.a(this.b) - ListObject.b(this.b) + 1];
      zc.a((int[])localObject1, 0, localObject1.length, -1);
      Object localObject2 = new int[localObject1.length];
      int i1 = 0;
      Style localStyle = this.b.t();
      for (int i2 = 0; i2 < this.e.length; i2++)
      {
        int i3;
        if (i2 == this.e.length - 1)
        {
          i3 = ListObject.d(this.b);
        }
        else if (i2 == this.e.length - 2)
        {
          if (this.b.f())
          {
            i3 = this.h;
          }
          else
          {
            this.e[i2] = b();
            continue;
          }
        }
        else
        {
          if ((this.b.f()) && (i2 == this.e.length - 3))
          {
            this.e[i2] = b();
            continue;
          }
          i3 = i2 + ListObject.c(this.b);
          if (i3 > this.h)
          {
            this.e[i2] = new int[localObject2.length];
            System.arraycopy(this.e[(i2 - 1)], 0, this.e[i2], 0, localObject2.length);
            continue;
          }
        }
        zc.a((int[])localObject2, 0, localObject2.length, -1);
        Object localObject3 = new int[localObject2.length];
        this.e[i2] = localObject3;
        int i4 = (i3 >= paramInt1) && (i3 <= this.h) ? 1 : 0;
        for (int i5 = 0; i5 < localObject2.length; i5++)
        {
          int i6 = i5 + ListObject.b(this.b);
          i1 = 0;
          if (arrayOfStyle[0] != null)
          {
            arrayOfInt[i1] = 0;
            arrayOfzdk[i1] = ListObject.a(this.b, 0, i3, i6, -1, -1);
            i1++;
          }
          int i7;
          if (i4 != 0)
          {
            if (m > -1)
            {
              i7 = (i6 - ListObject.b(this.b)) % (m + n);
              if (i7 < m)
              {
                if (arrayOfStyle[3] != null)
                {
                  arrayOfInt[i1] = 3;
                  arrayOfzdk[i1] = ListObject.a(this.b, 3, i3, i6, i7, m);
                  i1++;
                }
              }
              else
              {
                i7 -= m;
                if (arrayOfStyle[4] != null)
                {
                  arrayOfInt[i1] = 4;
                  arrayOfzdk[i1] = ListObject.a(this.b, 4, i3, i6, i7, n);
                  i1++;
                }
              }
            }
            if (paramInt2 > -1)
            {
              if ((this.j != null) && (i3 == this.h))
              {
                int i8 = za.a(this.j, i3);
                if (i8 < 0) {
                  i8 = -i8 - 1;
                }
                i7 = (i3 - i8 - paramInt1) % this.g;
              }
              else
              {
                i7 = (i3 - paramInt1) % this.g;
              }
              if (i7 < paramInt2)
              {
                if (arrayOfStyle[5] != null)
                {
                  arrayOfInt[i1] = 5;
                  arrayOfzdk[i1] = ListObject.a(this.b, 5, i3, i6, i7, paramInt2);
                  i1++;
                }
              }
              else
              {
                i7 -= paramInt2;
                if (arrayOfStyle[6] != null)
                {
                  arrayOfInt[i1] = 6;
                  arrayOfzdk[i1] = ListObject.a(this.b, 6, i3, i6, i7, paramInt3);
                  i1++;
                }
              }
            }
          }
          if ((this.b.getShowTableStyleLastColumn()) && (i6 == ListObject.a(this.b)) && (arrayOfStyle[7] != null))
          {
            arrayOfInt[i1] = 7;
            arrayOfzdk[i1] = ListObject.a(this.b, 7, i3, i6, -1, -1);
            i1++;
          }
          if ((this.b.getShowTableStyleFirstColumn()) && (i6 == ListObject.b(this.b)) && (arrayOfStyle[8] != null))
          {
            arrayOfInt[i1] = 8;
            arrayOfzdk[i1] = ListObject.a(this.b, 8, i3, i6, -1, -1);
            i1++;
          }
          if (i4 == 0)
          {
            if (i3 == ListObject.c(this.b))
            {
              if (arrayOfStyle[9] != null)
              {
                arrayOfInt[i1] = 9;
                arrayOfzdk[i1] = ListObject.a(this.b, 9, i3, i6, -1, -1);
                i1++;
              }
              if ((i6 == ListObject.b(this.b)) && (arrayOfStyle[11] != null))
              {
                arrayOfInt[i1] = 11;
                arrayOfzdk[i1] = ListObject.a(this.b, 11, i3, i6, -1, -1);
                i1++;
              }
              if ((i6 == ListObject.a(this.b)) && (arrayOfStyle[12] != null))
              {
                arrayOfInt[i1] = 12;
                arrayOfzdk[i1] = ListObject.a(this.b, 12, i3, i6, -1, -1);
                i1++;
              }
            }
            if (i3 == ListObject.d(this.b))
            {
              if (arrayOfStyle[10] != null)
              {
                arrayOfInt[i1] = 10;
                arrayOfzdk[i1] = ListObject.a(this.b, 10, i3, i6, -1, -1);
                i1++;
              }
              if ((i6 == ListObject.b(this.b)) && (arrayOfStyle[13] != null))
              {
                arrayOfInt[i1] = 13;
                arrayOfzdk[i1] = ListObject.a(this.b, 13, i3, i6, -1, -1);
                i1++;
              }
              if ((i6 == ListObject.a(this.b)) && (arrayOfStyle[14] != null))
              {
                arrayOfInt[i1] = 14;
                arrayOfzdk[i1] = ListObject.a(this.b, 14, i3, i6, -1, -1);
                i1++;
              }
            }
          }
          Object localObject4 = null;
          Object[] arrayOfObject = null;
          int i9;
          Object localObject5;
          if (i1 < 1)
          {
            i7 = this.f;
            i9 = -1;
          }
          else
          {
            localStringBuilder.setLength(0);
            localStringBuilder.append(a(arrayOfInt[0], arrayOfzdk[0]));
            if (i1 > 1) {
              for (int i10 = 1; i10 < i1; i10++)
              {
                localStringBuilder.append('-');
                localStringBuilder.append(a(arrayOfInt[i10], arrayOfzdk[i10]));
              }
            }
            localObject5 = zs.a(localStringBuilder);
            Object localObject6 = localHashMap.get(localObject5);
            if (localObject6 != null)
            {
              arrayOfObject = (Object[])localObject6;
              localObject4 = (Style)arrayOfObject[0];
              i9 = ((Integer)arrayOfObject[2]).intValue();
            }
            else
            {
              i9 = -1;
              localObject4 = new Style(this.c);
              for (int i11 = 0; i11 < i1; i11++) {
                i9 = zla.a((Style)localObject4, arrayOfStyle[arrayOfInt[i11]], arrayOfzdk[i11], arrayOfInt[i11], i9);
              }
              arrayOfObject = new Object[] { localObject4, Integer.valueOf(-1), Integer.valueOf(i9) };
              localHashMap.put(localObject5, arrayOfObject);
            }
            localObject2[i5] = i9;
            i7 = -2;
          }
          if (i2 > 0) {
            if ((zla.a(i9, 4) > zla.a(localObject1[i5], 8)) && (((Style)localObject4).isModified(4)))
            {
              localObject5 = new Style(this.c);
              ((Style)localObject5).copy(this.d.c(this.e[(i2 - 1)][i5]));
              ((Style)localObject5).getBorders().getByBorderType(8).a(((Style)localObject4).getBorders().getByBorderType(4));
              ((Style)localObject5).b(5);
              this.e[(i2 - 1)][i5] = this.d.b((Style)localObject5);
            }
            else if ((zla.a(localObject1[i5], 8) > zla.a(i9, 4)) && (this.d.c(this.e[(i2 - 1)][i5]).isModified(5)))
            {
              if (i7 > -1)
              {
                localObject4 = new Style(this.c);
                i7 = -1;
              }
              else
              {
                localObject5 = new Style(this.c);
                ((Style)localObject5).copy((Style)localObject4);
                localObject4 = localObject5;
                i7 = -1;
              }
              ((Style)localObject4).getBorders().getByBorderType(4).a(this.d.c(this.e[(i2 - 1)][i5]).getBorders().getByBorderType(8));
              ((Style)localObject4).b(4);
            }
          }
          if (i5 > 0) {
            if ((zla.a(i9, 1) > zla.a(localObject2[(i5 - 1)], 2)) && (((Style)localObject4).isModified(2)))
            {
              localObject5 = new Style(this.c);
              ((Style)localObject5).copy(this.d.c(localObject3[(i5 - 1)]));
              ((Style)localObject5).getBorders().getByBorderType(2).a(((Style)localObject4).getBorders().getByBorderType(1));
              ((Style)localObject5).b(3);
              localObject3[(i5 - 1)] = this.d.b((Style)localObject5);
            }
            else if ((zla.a(localObject2[(i5 - 1)], 2) > zla.a(i9, 1)) && (this.d.c(localObject3[(i5 - 1)]).isModified(3)))
            {
              if (i7 > -1)
              {
                localObject4 = new Style(this.c);
                i7 = -1;
              }
              else if (i7 < -1)
              {
                localObject5 = new Style(this.c);
                ((Style)localObject5).copy((Style)localObject4);
                localObject4 = localObject5;
                i7 = -1;
              }
              ((Style)localObject4).getBorders().getByBorderType(1).a(this.d.c(localObject3[(i5 - 1)]).getBorders().getByBorderType(2));
              ((Style)localObject4).b(2);
            }
          }
          if (localStyle != null)
          {
            if ((i2 == 0) && (localStyle.isModified(4)))
            {
              if (i7 > -1)
              {
                localObject4 = new Style(this.c);
                i7 = -1;
              }
              else if (i7 < -1)
              {
                localObject5 = new Style(this.c);
                ((Style)localObject5).copy((Style)localObject4);
                localObject4 = localObject5;
                i7 = -1;
              }
              ((Style)localObject4).getBorders().getByBorderType(4).a(localStyle.getBorders().getByBorderType(4));
              ((Style)localObject4).b(4);
            }
            if ((i3 == ListObject.d(this.b)) && (localStyle.isModified(5)))
            {
              if (i7 > -1)
              {
                localObject4 = new Style(this.c);
                i7 = -1;
              }
              else if (i7 < -1)
              {
                localObject5 = new Style(this.c);
                ((Style)localObject5).copy((Style)localObject4);
                localObject4 = localObject5;
                i7 = -1;
              }
              ((Style)localObject4).getBorders().getByBorderType(8).a(localStyle.getBorders().getByBorderType(8));
              ((Style)localObject4).b(5);
            }
            if ((i6 == ListObject.b(this.b)) && (localStyle.isModified(2)))
            {
              if (i7 > -1)
              {
                localObject4 = new Style(this.c);
                i7 = -1;
              }
              else if (i7 < -1)
              {
                localObject5 = new Style(this.c);
                ((Style)localObject5).copy((Style)localObject4);
                localObject4 = localObject5;
                i7 = -1;
              }
              ((Style)localObject4).getBorders().getByBorderType(1).a(localStyle.getBorders().getByBorderType(1));
              ((Style)localObject4).b(2);
            }
            if ((i6 == ListObject.a(this.b)) && (localStyle.isModified(3)))
            {
              if (i7 > -1)
              {
                localObject4 = new Style(this.c);
                i7 = -1;
              }
              else if (i7 < -1)
              {
                localObject5 = new Style(this.c);
                ((Style)localObject5).copy((Style)localObject4);
                localObject4 = localObject5;
                i7 = -1;
              }
              ((Style)localObject4).getBorders().getByBorderType(2).a(localStyle.getBorders().getByBorderType(2));
              ((Style)localObject4).b(3);
            }
          }
          if (i7 > -1)
          {
            localObject3[i5] = i7;
          }
          else if (i7 < -1)
          {
            i7 = ((Integer)arrayOfObject[1]).intValue();
            if (i7 < 0)
            {
              i7 = this.d.b((Style)localObject4);
              arrayOfObject[1] = Integer.valueOf(i7);
            }
            localObject3[i5] = i7;
          }
          else
          {
            localObject3[i5] = this.d.b((Style)localObject4);
          }
        }
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
    }
    
    private int a(int paramInt, zdk paramzdk)
    {
      int m = paramInt << 8;
      if (paramzdk.b) {
        m |= 0x1;
      }
      if (paramzdk.f) {
        m |= 0x2;
      }
      if (paramzdk.e) {
        m |= 0x4;
      }
      if (paramzdk.c) {
        m |= 0x8;
      }
      if (paramzdk.d) {
        m |= 0x10;
      }
      if (paramzdk.a) {
        m |= 0x20;
      }
      if (paramzdk.g) {
        m |= 0x40;
      }
      if (paramzdk.h) {
        m |= 0x80;
      }
      return m;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ListObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */