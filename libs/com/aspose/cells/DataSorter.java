package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class DataSorter
{
  Workbook a;
  private Object c;
  private Cells d;
  private CellArea e;
  private boolean f;
  private ArrayList g = new ArrayList();
  String b;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  
  DataSorter(Object parent)
  {
    a(parent);
  }
  
  ArrayList a()
  {
    return this.g;
  }
  
  CellArea b()
  {
    if (this.f) {
      return this.e;
    }
    if ((this.c instanceof AutoFilter)) {
      return ((AutoFilter)this.c).b();
    }
    return this.e;
  }
  
  void a(CellArea paramCellArea)
  {
    this.f = true;
    this.e = paramCellArea;
    this.g.clear();
  }
  
  Object c()
  {
    return this.c;
  }
  
  void a(Object paramObject)
  {
    this.c = paramObject;
    if ((paramObject instanceof Workbook))
    {
      this.a = ((Workbook)paramObject);
    }
    else
    {
      Object localObject;
      if ((paramObject instanceof AutoFilter))
      {
        localObject = (AutoFilter)paramObject;
        this.d = ((AutoFilter)localObject).a().getCells();
        this.a = ((AutoFilter)localObject).a().d();
      }
      else if ((paramObject instanceof Worksheet))
      {
        localObject = (Worksheet)paramObject;
        this.d = ((Worksheet)localObject).getCells();
        this.a = ((Worksheet)localObject).d();
      }
    }
  }
  
  public void clear()
  {
    this.j = false;
    this.h = false;
    this.g = new ArrayList();
  }
  
  public boolean hasHeaders()
  {
    return this.h;
  }
  
  public void setHasHeaders(boolean value)
  {
    this.h = value;
  }
  
  public void addKey(int key, int order)
  {
    zrr localzrr = new zrr(this);
    localzrr.b(key);
    localzrr.a(order);
    zf.a(this.g, localzrr);
  }
  
  public void addKey(int key, int order, String customList)
  {
    zrr localzrr = new zrr(this);
    localzrr.b(key);
    localzrr.a(order);
    localzrr.a(customList);
    zf.a(this.g, localzrr);
  }
  
  public void addKey(int key, int order, String[] customList)
  {
    zrr localzrr = new zrr(this);
    localzrr.b(key);
    localzrr.a(order);
    localzrr.a(customList);
    zf.a(this.g, localzrr);
  }
  
  void a(zrr paramzrr)
  {
    zf.a(this.g, paramzrr);
  }
  
  public int getKey1()
  {
    if (this.g.size() > 0) {
      return ((zrr)this.g.get(0)).c();
    }
    return -1;
  }
  
  public void setKey1(int value)
  {
    zrr localzrr;
    if (this.g.size() > 0)
    {
      localzrr = (zrr)this.g.get(0);
      localzrr.b(value);
    }
    else
    {
      localzrr = new zrr(this);
      localzrr.b(value);
      zf.a(this.g, localzrr);
    }
  }
  
  public int getOrder1()
  {
    if (this.g.size() > 0) {
      return ((zrr)this.g.get(0)).b();
    }
    return 0;
  }
  
  public void setOrder1(int value)
  {
    zrr localzrr;
    if (this.g.size() > 0)
    {
      localzrr = (zrr)this.g.get(0);
      localzrr.a(value);
    }
    else
    {
      localzrr = new zrr(this);
      localzrr.a(value);
      zf.a(this.g, localzrr);
    }
  }
  
  public int getKey2()
  {
    if (this.g.size() > 1) {
      return ((zrr)this.g.get(1)).c();
    }
    return -1;
  }
  
  public void setKey2(int value)
  {
    zrr localzrr;
    if (this.g.size() > 1)
    {
      localzrr = (zrr)this.g.get(1);
      localzrr.b(value);
    }
    else
    {
      localzrr = new zrr(this);
      localzrr.b(value);
      zf.a(this.g, localzrr);
    }
  }
  
  public int getOrder2()
  {
    if (this.g.size() > 1) {
      return ((zrr)this.g.get(1)).b();
    }
    return 0;
  }
  
  public void setOrder2(int value)
  {
    zrr localzrr;
    if (this.g.size() > 1)
    {
      localzrr = (zrr)this.g.get(1);
      localzrr.a(value);
    }
    else
    {
      localzrr = new zrr(this);
      localzrr.a(value);
      zf.a(this.g, localzrr);
    }
  }
  
  public int getKey3()
  {
    if (this.g.size() > 2) {
      return ((zrr)this.g.get(2)).c();
    }
    return -1;
  }
  
  public void setKey3(int value)
  {
    zrr localzrr;
    if (this.g.size() > 2)
    {
      localzrr = (zrr)this.g.get(2);
      localzrr.b(value);
    }
    else
    {
      localzrr = new zrr(this);
      localzrr.b(value);
      zf.a(this.g, localzrr);
    }
  }
  
  public int getOrder3()
  {
    if (this.g.size() > 2) {
      return ((zrr)this.g.get(2)).b();
    }
    return 0;
  }
  
  public void setOrder3(int value)
  {
    zrr localzrr;
    if (this.g.size() > 2)
    {
      localzrr = (zrr)this.g.get(2);
      localzrr.a(value);
    }
    else
    {
      localzrr = new zrr(this);
      localzrr.a(value);
      zf.a(this.g, localzrr);
    }
  }
  
  public boolean getSortLeftToRight()
  {
    return this.i;
  }
  
  public void setSortLeftToRight(boolean value)
  {
    this.i = value;
  }
  
  public boolean getCaseSensitive()
  {
    return this.j;
  }
  
  public void setCaseSensitive(boolean value)
  {
    this.j = value;
  }
  
  public boolean getSortAsNumber()
  {
    return this.k;
  }
  
  public void setSortAsNumber(boolean value)
  {
    this.k = value;
  }
  
  public void sort(Cells cells, int startRow, int startColumn, int endRow, int endColumn)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = startRow;
    localCellArea.StartColumn = startColumn;
    localCellArea.EndRow = endRow;
    localCellArea.EndColumn = endColumn;
    sort(cells, localCellArea);
  }
  
  public void sort(Cells cells, CellArea area)
  {
    this.d = cells;
    this.e = area;
    sort();
    this.d = null;
  }
  
  public void sort()
  {
    if ((this.c instanceof AutoFilter))
    {
      AutoFilter localAutoFilter = (AutoFilter)this.c;
      this.e = localAutoFilter.b();
    }
    this.d.p().p().c();
    for (int m = 0; m < this.g.size(); m++)
    {
      zrr localzrr = (zrr)this.g.get(m);
      if (localzrr.c() < 0) {
        this.g.remove(m--);
      }
    }
    if (this.g.size() == 0) {
      return;
    }
    HashMap localHashMap = new HashMap();
    for (int n = this.d.g().getComments().getCount() - 1; n >= 0; n--)
    {
      Comment localComment = this.d.g().getComments().get(n);
      if ((localComment.getRow() >= this.e.StartRow) && (localComment.getRow() <= this.e.EndRow) && (localComment.getColumn() >= this.e.StartColumn) && (localComment.getColumn() <= this.e.EndColumn))
      {
        localHashMap.put(Long.valueOf(Cell.a(0, localComment.getRow(), localComment.getColumn())), localComment);
        this.d.g().getComments().a(n);
      }
    }
    this.d.b(this.e.StartRow, this.e.EndRow);
    if (this.i)
    {
      a(localHashMap);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int i1 = this.h ? this.e.StartRow + 1 : this.e.StartRow;
    int i2 = -1;
    int i3 = -1;
    int i4 = -1;
    for (int i5 = i1; i5 <= this.e.EndRow; i5++)
    {
      localObject = this.d.getRows().a(i5, true, false, false);
      if ((localObject != null) && (((Row)localObject).i() != 0) && ((((Row)localObject).getIndex() == i1) || (((Row)localObject).getIndex() == i1 + 1)))
      {
        i3 = i4 = ((Row)localObject).getIndex();
        i5++;
        while (i5 <= this.e.EndRow)
        {
          localObject = this.d.getRows().a(i5, true, false, false);
          if ((localObject == null) || (((Row)localObject).i() == 0))
          {
            i2 = ((Row)localObject).getIndex();
            break;
          }
          i4 = i5;
          i5++;
        }
        if (i4 == this.e.EndRow)
        {
          i3 = i4 = -1;
          for (i5 = i1; i5 < this.e.EndRow; i5++) {
            zf.a(localArrayList, Integer.valueOf(i5));
          }
        }
      }
      zf.a(localArrayList, Integer.valueOf(i5));
    }
    a(0, (zrr)this.g.get(0), localArrayList);
    i5 = i1;
    this.d.m();
    this.d.getRows().d.a();
    Object localObject = this.d.g().getHyperlinks();
    CellArea[] arrayOfCellArea = new CellArea[((HyperlinkCollection)localObject).getCount()];
    for (int i6 = 0; i6 < arrayOfCellArea.length; i6++) {
      arrayOfCellArea[i6] = CellArea.d(((HyperlinkCollection)localObject).get(i6).getArea());
    }
    RowCollection localRowCollection = new RowCollection(this.d, this.d.a(this.e.EndRow - this.e.StartRow + 1, 10, this.e.EndColumn - this.e.StartColumn + 1, 5));
    Row localRow1 = null;
    int i9;
    for (int i7 = i1; i7 <= this.e.EndRow; i7++)
    {
      Row localRow2 = this.d.getRows().a(i7, true, false, false);
      if (localRow2 != null)
      {
        localRow1 = localRowCollection.a(i7, Math.min(localRow2.a(), this.e.EndColumn - this.e.StartColumn + 1));
        localRow1.a(localRow2);
        if ((localRow2.getIndex() >= i3) && (localRow2.getIndex() <= i4)) {
          localRow2.a((byte)0);
        }
        i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < localRow2.a(); i11++)
        {
          Cell localCell = localRow2.getCellByIndex(i11);
          if (localCell.getColumn() >= this.e.StartColumn)
          {
            if (localCell.getColumn() > this.e.EndColumn) {
              break;
            }
            if (i9 == -1) {
              i9 = i11;
            }
            i10 = i11;
            localRow1.c.a(-1, localCell.c);
          }
        }
        if (i9 != -1) {
          localRow2.a(i9, i10 - i9 + 1);
        }
      }
    }
    for (i7 = 0; i7 < localArrayList.size(); i7++)
    {
      int i8 = ((Integer)localArrayList.get(i7)).intValue();
      if (i8 == i2) {
        for (i9 = i3; i9 <= i4; i9++)
        {
          localRow1 = localRowCollection.a(i9, true, false, false);
          a(localRow1, i5, this.e.StartColumn, this.e.EndColumn, true, arrayOfCellArea, localHashMap);
          i5++;
        }
      }
      localRow1 = localRowCollection.a(i8, true, false, false);
      a(localRow1, i5, this.e.StartColumn, this.e.EndColumn, false, arrayOfCellArea, localHashMap);
      i5++;
    }
    for (i7 = 0; i7 < arrayOfCellArea.length; i7++) {
      ((HyperlinkCollection)localObject).get(i7).a(arrayOfCellArea[i7]);
    }
  }
  
  private void a(Row paramRow, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, CellArea[] paramArrayOfCellArea, HashMap paramHashMap)
  {
    if (paramRow == null) {
      return;
    }
    HyperlinkCollection localHyperlinkCollection = this.d.g().getHyperlinks();
    Object localObject;
    for (int m = 0; m < localHyperlinkCollection.getCount(); m++)
    {
      Hyperlink localHyperlink = localHyperlinkCollection.get(m);
      localObject = CellArea.d(localHyperlink.getArea());
      if ((((CellArea)localObject).EndRow == ((CellArea)localObject).StartRow) && (((CellArea)localObject).StartRow == paramRow.getIndex()) && (((CellArea)localObject).StartColumn >= paramInt2) && (((CellArea)localObject).EndColumn <= paramInt3))
      {
        ((CellArea)localObject).StartRow = (((CellArea)localObject).EndRow = paramInt1);
        paramArrayOfCellArea[m] = localObject;
      }
    }
    Row localRow = null;
    if (paramBoolean)
    {
      localRow = this.d.getRows().a(paramInt1, false, true, false);
      localRow.a(paramRow.i());
    }
    if ((!paramRow.k()) && (paramRow.a() == 0)) {
      return;
    }
    if (localRow == null) {
      localRow = this.d.getRows().a(paramInt1, false, true, false);
    }
    int n;
    Cell localCell;
    if (paramRow.k()) {
      for (n = paramInt2; n <= paramInt3; n++)
      {
        localObject = localRow.c(n);
        localCell = paramRow.getCellOrNull(n);
        if (localCell == null) {
          ((Cell)localObject).b(paramRow.e());
        } else {
          a(localCell, (Cell)localObject, paramHashMap);
        }
      }
    } else {
      for (n = paramInt2; n <= paramInt3; n++)
      {
        localObject = paramRow.getCellOrNull(n);
        if (localObject != null)
        {
          localCell = localRow.c(n);
          a((Cell)localObject, localCell, paramHashMap);
        }
      }
    }
  }
  
  private int a(ArrayList paramArrayList, int paramInt)
  {
    for (int m = 0; m < paramArrayList.size(); m++) {
      if (((Integer)paramArrayList.get(m)).intValue() == paramInt) {
        return m;
      }
    }
    return -1;
  }
  
  private void a(Cell paramCell1, Cell paramCell2, HashMap paramHashMap)
  {
    int m = paramCell1.getRow() - paramCell2.getRow();
    int n = paramCell1.getColumn() - paramCell2.getColumn();
    Object localObject;
    int i3;
    if (paramHashMap != null)
    {
      long l = Cell.a(0, paramCell1.getRow(), paramCell1.getColumn());
      Comment localComment = (Comment)paramHashMap.get(Long.valueOf(l));
      if (localComment != null)
      {
        localComment.a(paramCell2.getRow());
        localComment.b(paramCell2.getColumn());
        localObject = localComment.getCommentShape();
        i3 = ((Shape)localObject).getPlacement();
        ((Shape)localObject).setPlacement(1);
        int i4 = ((Shape)localObject).getUpperLeftRow();
        int i5 = ((Shape)localObject).getUpperLeftColumn();
        i4 -= m;
        i5 -= n;
        i4 = i4 < 0 ? 0 : i4;
        i5 = i5 < 0 ? 0 : i5;
        ((Shape)localObject).setUpperLeftRow(i4);
        ((Shape)localObject).setUpperLeftColumn(i5);
        ((Shape)localObject).setPlacement(i3);
        paramCell1.d.g().getComments().a(localComment);
      }
    }
    paramCell2.b(paramCell1.s());
    if (paramCell1.g())
    {
      zaai localzaai = paramCell1.h();
      localzaai.e = paramCell2.getRow();
      localzaai.f = paramCell2.c.a;
      paramCell2.a(5, localzaai, false);
      int i1 = paramCell2.getRow() - paramCell1.getRow();
      int i2 = paramCell2.getColumn() - paramCell1.getColumn();
      if ((i1 != 0) || (i2 != 0)) {
        if (paramCell1.isArrayHeader())
        {
          localObject = paramCell2.v();
          zaaq.a(this.d.g(), true, 0, i1, 0, 0, 0, i2, 0, 0, -1, -1, (byte[])localObject);
          zaaq.a(this.d.g(), true, 0, i1, 0, 0, 0, i2, 0, 0, -1, -1, paramCell2.F().c());
          i3 = 0;
          CellArea localCellArea = new CellArea();
          boolean[] arrayOfBoolean;
          if (i1 != 0)
          {
            arrayOfBoolean = new boolean[] { i3 };
            localCellArea = zban.a(paramCell2.F().a(), 0, paramCell2.getRow() - paramCell1.getRow(), arrayOfBoolean);
            i3 = arrayOfBoolean[0];
          }
          else
          {
            arrayOfBoolean = new boolean[] { i3 };
            localCellArea = zban.b(paramCell2.F().a(), 0, i2, arrayOfBoolean);
            i3 = arrayOfBoolean[0];
          }
          paramCell2.F().a(localCellArea);
        }
        else
        {
          localObject = paramCell2.v();
          zaaq.a(this.d.g(), true, 0, i1, 0, 0, 0, i2, 0, 0, -1, -1, (byte[])localObject);
        }
      }
      return;
    }
    paramCell2.a(paramCell1.c, 6, false);
  }
  
  private int d()
  {
    return this.g.size() - 1;
  }
  
  private void a(zd paramzd, int paramInt, zrr paramzrr, ArrayList paramArrayList)
  {
    ArrayList localArrayList;
    if (paramzrr == null)
    {
      localIterator = paramzd.f().iterator();
      while (localIterator.hasNext())
      {
        localArrayList = (ArrayList)localIterator.next();
        zf.a(paramArrayList, localArrayList);
      }
      return;
    }
    Iterator localIterator = paramzd.f().iterator();
    while (localIterator.hasNext())
    {
      localArrayList = (ArrayList)localIterator.next();
      if (localArrayList.size() == 1)
      {
        zf.a(paramArrayList, localArrayList.get(0));
      }
      else
      {
        a(paramInt, paramzrr, localArrayList);
        zf.a(paramArrayList, localArrayList);
      }
    }
  }
  
  private void a(HashMap paramHashMap)
  {
    this.d.m();
    this.d.getRows().d.a();
    ArrayList localArrayList1 = new ArrayList();
    int m = this.h ? this.e.StartColumn + 1 : this.e.StartColumn;
    for (int n = m; n <= this.e.EndColumn; n++) {
      zf.a(localArrayList1, Integer.valueOf(n));
    }
    a(0, (zrr)this.g.get(0), localArrayList1);
    n = m;
    int i1 = 0;
    int i2 = 0;
    for (int i3 = 0; i3 < localArrayList1.size(); i3++)
    {
      int i4 = ((Integer)localArrayList1.get(i3)).intValue();
      if ((i4 == -1) || (i4 == m + i3))
      {
        localArrayList1.set(i3, Integer.valueOf(-1));
      }
      else
      {
        n = m + i3;
        ArrayList localArrayList2 = new ArrayList();
        i2 = n;
        i1 = i3;
        a(this.e.StartRow, this.e.EndRow, i4, localArrayList2);
        while (i1 != -1)
        {
          localArrayList2 = a(i2, localArrayList2, this.e.StartRow, this.e.EndRow, paramHashMap);
          localArrayList1.set(i1, Integer.valueOf(-1));
          i1 = a(localArrayList1, i2);
          i2 = m + i1;
        }
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, ArrayList paramArrayList)
  {
    zgs localzgs1 = new zgs();
    zaiv localzaiv = this.d.e().b(paramInt1, paramInt2, false);
    for (;;)
    {
      int m = localzaiv.a();
      if (m < 0) {
        break;
      }
      zt localzt = this.d.e().f(m);
      int n = localzt.b(paramInt3);
      if (n > -1)
      {
        zgs localzgs2 = localzt.a(n, localzgs1, 7);
        if (localzgs2 == localzgs1) {
          localzgs2 = new zgs(localzgs1);
        }
        zf.a(paramArrayList, new za(localzt.i(), m, localzgs2));
        localzt.c(n, 1);
      }
    }
  }
  
  private ArrayList a(int paramInt1, ArrayList paramArrayList, int paramInt2, int paramInt3, HashMap paramHashMap)
  {
    ArrayList localArrayList = new ArrayList();
    a(paramInt2, paramInt3, paramInt1, localArrayList);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      za localza = (za)localIterator.next();
      a(localza, paramInt1, paramHashMap);
    }
    return localArrayList;
  }
  
  private void a(za paramza, int paramInt, HashMap paramHashMap)
  {
    paramza.b = this.d.e().b(paramza.a, paramza.b);
    Row localRow = new Row(this.d, this.d.getRows(), this.d.e().f(paramza.b), false);
    Cell localCell1 = new Cell(localRow, -1, paramza.c, false);
    Cell localCell2 = localRow.a(this.d.getRows(), paramInt, -1, false, true);
    a(localCell1, localCell2, paramHashMap);
  }
  
  void a(int paramInt, zrr paramzrr, ArrayList paramArrayList)
  {
    zd localzd = new zd(new zbqm(paramzrr, this.d));
    ArrayList localArrayList = new ArrayList();
    a(paramzrr, paramArrayList, localzd, localArrayList);
    int m = 0;
    if (paramInt < d())
    {
      paramInt++;
      paramzrr = (zrr)this.g.get(paramInt);
      m = 1;
    }
    else
    {
      paramzrr = null;
    }
    paramArrayList.clear();
    a(localzd, paramInt, paramzrr, paramArrayList);
    if (m != 0) {
      a(paramInt, paramzrr, localArrayList);
    }
    zf.a(paramArrayList, localArrayList);
  }
  
  void a(zrr paramzrr, ArrayList paramArrayList1, zd paramzd, ArrayList paramArrayList2)
  {
    zbqn localzbqn = null;
    int m = paramzrr.c();
    Iterator localIterator = paramArrayList1.iterator();
    while (localIterator.hasNext())
    {
      int n = ((Integer)localIterator.next()).intValue();
      if (this.i) {
        localzbqn = a(paramzrr, m, n);
      } else {
        localzbqn = a(paramzrr, n, m);
      }
      if (localzbqn == null)
      {
        zf.a(paramArrayList2, Integer.valueOf(n));
      }
      else
      {
        Object localObject = paramzd.d(localzbqn);
        ArrayList localArrayList;
        if (localObject == null)
        {
          localArrayList = new ArrayList();
          zf.a(localArrayList, Integer.valueOf(n));
          paramzd.a(localzbqn, localArrayList);
        }
        else
        {
          localArrayList = (ArrayList)localObject;
          zf.a(localArrayList, Integer.valueOf(n));
        }
      }
    }
  }
  
  private zbqn a(zrr paramzrr, int paramInt1, int paramInt2)
  {
    Cell localCell = this.d.a(paramInt1, paramInt2, true);
    if (localCell == null) {
      return null;
    }
    Object localObject1 = null;
    int m = localCell.getType();
    switch (m)
    {
    case 0: 
      localObject1 = localCell.getValue();
      break;
    case 3: 
      return null;
    case 1: 
    case 4: 
      m = 4;
      localObject1 = Double.valueOf(localCell.getDoubleValue());
      break;
    case 2: 
      localObject1 = localCell.getStringValue();
      break;
    default: 
      localObject2 = localCell.getStringValue();
      if (getSortAsNumber())
      {
        localObject3 = zaac.a((String)localObject2, this.d.p().p().getSettings().f());
        if (localObject3 != null)
        {
          localObject1 = ((zavp)localObject3).d();
          m = ((zavp)localObject3).a();
          if (m == 1)
          {
            DateTime localDateTime = (DateTime)((zavp)localObject3).d();
            double d1 = zbxa.a(localDateTime, this.d.g().d().getSettings().getDate1904());
            if (d1 < 0.0D)
            {
              localObject1 = null;
            }
            else
            {
              localObject1 = Double.valueOf(d1);
              m = 4;
            }
          }
        }
      }
      if (localObject1 == null)
      {
        localObject1 = localObject2;
        m = 5;
      }
      break;
    }
    Object localObject2 = new zbqn();
    ((zbqn)localObject2).b = localObject1;
    ((zbqn)localObject2).a = m;
    switch (m)
    {
    case 0: 
      ((zbqn)localObject2).c = 2;
      return (zbqn)localObject2;
    case 1: 
    case 4: 
      ((zbqn)localObject2).c = 0;
      return (zbqn)localObject2;
    case 2: 
      ((zbqn)localObject2).c = 3;
      return (zbqn)localObject2;
    }
    Object localObject3 = (String)localObject1;
    ((zbqn)localObject2).b = (getCaseSensitive() ? localCell.getStringValue() : localCell.getStringValue().toUpperCase());
    ((zbqn)localObject2).a = 5;
    ((zbqn)localObject2).c = 2;
    if ((paramzrr.f() != null) && (paramzrr.f().get(localObject3) != null)) {
      ((zbqn)localObject2).d = ((Integer)paramzrr.f().get(localObject3)).intValue();
    }
    return (zbqn)localObject2;
  }
  
  private class za
  {
    int a;
    int b;
    zgs c;
    
    za(int paramInt1, int paramInt2, zgs paramzgs)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramzgs;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DataSorter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */