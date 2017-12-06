package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaob
{
  private Cells a;
  private String b;
  private int c;
  private int d;
  private int e;
  private int f;
  private String g;
  private Worksheet h;
  private WorksheetCollection i;
  private int j = 0;
  
  zaob(Cells paramCells, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.a = paramCells;
    this.h = paramCells.g();
    this.i = paramCells.p();
    this.b = paramString1;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramString2;
  }
  
  void a()
    throws Exception
  {
    XmlMapCollection localXmlMapCollection = this.i.getXmlMaps();
    XmlMap localXmlMap = localXmlMapCollection.c(this.b);
    if (localXmlMap == null) {
      return;
    }
    HashMap localHashMap = localXmlMap.k();
    ArrayList localArrayList = b();
    zaop localzaop = (zaop)localHashMap.get(this.g);
    Object localObject1;
    Object localObject2;
    if (localzaop == null)
    {
      int k = this.g.lastIndexOf("/");
      String str2 = this.g.substring(0, 0 + k);
      localzaop = (zaop)localHashMap.get(str2);
      if (localzaop == null) {
        return;
      }
      localObject1 = this.g.substring(k + 1);
      localObject2 = localzaop.a((String)localObject1);
      if (localObject2 == null) {
        return;
      }
      if (((zaoo)localObject2).a()) {
        throw new IllegalArgumentException("The element[" + this.g + "] already been mapped.");
      }
      this.j = 1;
      CellArea localCellArea;
      ListObject localListObject;
      boolean bool3;
      if (!localzaop.e)
      {
        localCellArea = new CellArea();
        localCellArea.StartRow = this.c;
        localCellArea.StartColumn = this.d;
        localCellArea.EndRow = this.c;
        localCellArea.EndColumn = this.d;
        localListObject = a(localArrayList, localCellArea, localXmlMap.d());
        bool3 = a(localListObject, (zaoo)localObject2, str2, localXmlMap, localCellArea, localArrayList);
        if (bool3) {
          return;
        }
        a(localXmlMap, str2, (zaoo)localObject2);
        this.f += 1;
      }
      else
      {
        localCellArea = new CellArea();
        localCellArea.StartRow = this.c;
        localCellArea.StartColumn = this.d;
        localCellArea.EndRow = (this.c + 1);
        localCellArea.EndColumn = this.d;
        localListObject = a(localArrayList, localCellArea, localXmlMap.d());
        bool3 = a(localListObject, (zaoo)localObject2, str2, localXmlMap, localCellArea, localArrayList);
        if (bool3) {
          return;
        }
        int n = this.h.getListObjects().c();
        localListObject = this.h.getListObjects().get(n);
        localListObject.a(this.c);
        localListObject.c(this.c + 1);
        ListColumn localListColumn = zalx.a(localXmlMap, localListObject, str2, 0, (zaoo)localObject2);
        this.a.get(this.e, this.f).putValue(localListColumn.getName());
        this.f += 1;
        localListObject.b(this.d);
        localListObject.d(this.d + localListObject.getListColumns().getCount() - 1);
        a(localListObject, localXmlMap);
        this.h.autoFitColumns(localListObject.getStartRow(), localListObject.getStartColumn(), localListObject.getEndRow(), localListObject.getEndColumn());
      }
    }
    else
    {
      String str1 = this.g.substring(0, 0 + this.g.lastIndexOf("/"));
      a(localzaop, str1);
      boolean bool1 = a(localzaop);
      b(localzaop, str1);
      boolean bool2;
      if (!bool1)
      {
        localObject1 = new CellArea();
        ((CellArea)localObject1).StartRow = this.c;
        ((CellArea)localObject1).StartColumn = this.d;
        ((CellArea)localObject1).EndRow = this.c;
        ((CellArea)localObject1).EndColumn = (this.d + this.j - 1);
        localObject2 = a(localArrayList, (CellArea)localObject1, localXmlMap.d());
        bool2 = a((ListObject)localObject2, localzaop, str1, localXmlMap, (CellArea)localObject1, localArrayList);
        if (bool2) {
          return;
        }
        a(localzaop, str1, localXmlMap);
      }
      else
      {
        localObject1 = new CellArea();
        ((CellArea)localObject1).StartRow = this.c;
        ((CellArea)localObject1).StartColumn = this.d;
        ((CellArea)localObject1).EndRow = (this.c + 1);
        ((CellArea)localObject1).EndColumn = (this.d + this.j - 1);
        localObject2 = a(localArrayList, (CellArea)localObject1, localXmlMap.d());
        bool2 = a((ListObject)localObject2, localzaop, str1, localXmlMap, (CellArea)localObject1, localArrayList);
        if (bool2) {
          return;
        }
        int m = this.h.getListObjects().c();
        localObject2 = this.h.getListObjects().get(m);
        ((ListObject)localObject2).a(this.c);
        ((ListObject)localObject2).c(this.c + 1);
        a(localzaop, str1, localXmlMap, (ListObject)localObject2, 0);
        ((ListObject)localObject2).b(this.d);
        ((ListObject)localObject2).d(this.d + ((ListObject)localObject2).getListColumns().getCount() - 1);
        a((ListObject)localObject2, localXmlMap);
        this.h.autoFitColumns(((ListObject)localObject2).getStartRow(), ((ListObject)localObject2).getStartColumn(), ((ListObject)localObject2).getEndRow(), ((ListObject)localObject2).getEndColumn());
      }
    }
  }
  
  private boolean a(ListObject paramListObject, zaop paramzaop, String paramString, XmlMap paramXmlMap, CellArea paramCellArea, ArrayList paramArrayList)
    throws Exception
  {
    ListObject localListObject = paramListObject;
    if (localListObject != null)
    {
      boolean bool = a(localListObject, paramCellArea, paramArrayList, paramXmlMap);
      if (!bool) {
        throw new IllegalArgumentException("This operation would overlap an existing mapping.");
      }
      if (localListObject.E() == -1) {
        a(localListObject);
      }
      a(paramzaop, paramString, paramXmlMap, localListObject, localListObject.getListColumns().a());
      int m = localListObject.getEndColumn();
      localListObject.d(localListObject.getStartColumn() + localListObject.getListColumns().getCount() - 1);
      a(localListObject, paramXmlMap);
      if (m < paramCellArea.EndColumn) {
        this.h.autoFitColumns(localListObject.getStartRow(), m + 1, localListObject.getEndRow(), paramCellArea.EndColumn);
      }
      return true;
    }
    if (paramCellArea.StartColumn > 0)
    {
      localListObject = a(paramArrayList, paramCellArea.StartRow, paramCellArea.StartColumn - 1);
      if ((localListObject != null) && (a(localListObject, paramCellArea, paramArrayList, paramXmlMap)))
      {
        if (localListObject.E() == -1) {
          a(localListObject);
        }
        a(paramzaop, paramString, paramXmlMap, localListObject, localListObject.getListColumns().a());
        localListObject.d(localListObject.getStartColumn() + localListObject.getListColumns().getCount() - 1);
        a(localListObject, paramXmlMap);
        this.h.autoFitColumns(localListObject.getStartRow(), paramCellArea.StartColumn, localListObject.getEndRow(), paramCellArea.EndColumn);
        return true;
      }
    }
    int k = a(this.h.d());
    if (paramCellArea.EndColumn < k)
    {
      localListObject = b(paramArrayList, paramCellArea.StartRow, paramCellArea.EndColumn + 1);
      if ((localListObject != null) && (a(localListObject, paramCellArea, paramArrayList, paramXmlMap)))
      {
        if (localListObject.E() == -1) {
          a(localListObject);
        }
        a(paramzaop, paramString, paramXmlMap, localListObject, localListObject.getListColumns().a());
        localListObject.b(this.d);
        localListObject.d(localListObject.getStartColumn() + localListObject.getListColumns().getCount() - 1);
        a(localListObject, paramXmlMap);
        this.h.autoFitColumns(localListObject.getStartRow(), paramCellArea.StartColumn, localListObject.getEndRow(), paramCellArea.EndColumn);
        return true;
      }
    }
    return false;
  }
  
  private boolean a(ListObject paramListObject, zaoo paramzaoo, String paramString, XmlMap paramXmlMap, CellArea paramCellArea, ArrayList paramArrayList)
    throws Exception
  {
    ListObject localListObject = paramListObject;
    ListColumn localListColumn1;
    if ((localListObject != null) && (a(localListObject, paramCellArea, paramArrayList, paramXmlMap)))
    {
      if (localListObject.E() == -1) {
        a(localListObject);
      }
      localListColumn1 = localListObject.getListColumns().get(paramCellArea.StartColumn - localListObject.getStartColumn());
      a(paramXmlMap, localListColumn1, paramString, paramzaoo);
      this.f += 1;
      a(localListObject, paramXmlMap);
      return true;
    }
    if (paramCellArea.StartColumn > 0)
    {
      localListObject = a(paramArrayList, paramCellArea.StartRow, paramCellArea.StartColumn - 1);
      if ((localListObject != null) && (a(localListObject, paramCellArea, paramArrayList, paramXmlMap)))
      {
        if (localListObject.E() == -1) {
          a(localListObject);
        }
        localListColumn1 = zalx.a(paramXmlMap, localListObject, paramString, localListObject.getListColumns().a(), paramzaoo);
        this.a.get(this.e, this.f).putValue(localListColumn1.getName());
        this.f += 1;
        localListObject.d(localListObject.getStartColumn() + localListObject.getListColumns().getCount() - 1);
        a(localListObject, paramXmlMap);
        this.h.autoFitColumns(localListObject.getStartRow(), paramCellArea.StartColumn, localListObject.getEndRow(), paramCellArea.EndColumn);
        return true;
      }
    }
    int k = a(this.h.d());
    if (paramCellArea.EndColumn < k)
    {
      localListObject = b(paramArrayList, paramCellArea.StartRow, paramCellArea.EndColumn + 1);
      if ((localListObject != null) && (a(localListObject, paramCellArea, paramArrayList, paramXmlMap)))
      {
        if (localListObject.E() == -1) {
          a(localListObject);
        }
        ListColumn localListColumn2 = zalx.a(paramXmlMap, localListObject, paramString, localListObject.getListColumns().a(), paramzaoo, 0);
        this.a.get(this.e, this.f).putValue(localListColumn2.getName());
        this.f += 1;
        localListObject.b(this.d);
        localListObject.d(localListObject.getStartColumn() + localListObject.getListColumns().getCount() - 1);
        a(localListObject, paramXmlMap);
        this.h.autoFitColumns(localListObject.getStartRow(), paramCellArea.StartColumn, localListObject.getEndRow(), paramCellArea.EndColumn);
        return true;
      }
    }
    return false;
  }
  
  private boolean a(ListObject paramListObject, CellArea paramCellArea, ArrayList paramArrayList, XmlMap paramXmlMap)
  {
    boolean bool = true;
    if ((paramCellArea.EndColumn > paramListObject.getEndColumn()) || (paramCellArea.StartColumn < paramListObject.getStartColumn()))
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = paramListObject.getStartRow();
      if (paramCellArea.EndColumn > paramListObject.getEndColumn()) {
        localCellArea.StartColumn = (paramListObject.getEndColumn() + 1);
      } else {
        localCellArea.StartColumn = paramCellArea.StartColumn;
      }
      localCellArea.EndRow = paramListObject.getEndRow();
      if (paramCellArea.StartColumn < paramListObject.getStartColumn()) {
        localCellArea.EndColumn = (paramListObject.getStartColumn() - 1);
      } else {
        localCellArea.EndColumn = paramCellArea.EndColumn;
      }
      try
      {
        a(paramArrayList, localCellArea, paramXmlMap.d());
      }
      catch (Exception localException)
      {
        bool = false;
      }
    }
    return bool;
  }
  
  private void a(ListObject paramListObject)
  {
    Iterator localIterator = paramListObject.getListColumns().iterator();
    while (localIterator.hasNext())
    {
      ListColumn localListColumn = (ListColumn)localIterator.next();
      localListColumn.d(zauj.z(localListColumn.n));
    }
  }
  
  private void a(ListObject paramListObject, XmlMap paramXmlMap)
  {
    paramListObject.getAutoFilter().setRange(zalx.a(paramListObject));
    paramListObject.setTableStyleType(23);
    paramListObject.a = 2;
    if (paramXmlMap.j() != null) {
      paramListObject.j(paramXmlMap.j().a());
    }
  }
  
  private void a(zaop paramzaop, String paramString, XmlMap paramXmlMap, ListObject paramListObject, int paramInt)
  {
    int k = paramInt;
    paramString = paramString + "/" + paramzaop.d;
    if ((paramzaop.c.size() == 0) && (paramzaop.b.size() == 0))
    {
      if ((this.f > paramListObject.getEndColumn()) || (paramListObject.getListColumns() == null) || (paramListObject.getListColumns().getCount() == 0))
      {
        localObject1 = zalx.a(paramXmlMap, paramListObject, paramString, k, null);
        k++;
        this.a.get(paramListObject.getStartRow(), this.f).putValue(((ListColumn)localObject1).getName());
      }
      else if (this.f < paramListObject.getStartColumn())
      {
        localObject1 = zalx.a(paramXmlMap, paramListObject, paramString, k, null, this.f - this.d);
        k++;
        this.a.get(paramListObject.getStartRow(), this.f).putValue(((ListColumn)localObject1).getName());
      }
      else
      {
        localObject1 = paramListObject.getListColumns().get(this.f - paramListObject.getStartColumn());
        a(paramXmlMap, (ListColumn)localObject1, paramString, null);
      }
      this.f += 1;
    }
    Object localObject1 = paramzaop.c.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zaoo)((Iterator)localObject1).next();
      ListColumn localListColumn;
      if ((this.f > paramListObject.getEndColumn()) || (paramListObject.getListColumns() == null) || (paramListObject.getListColumns().getCount() == 0))
      {
        localListColumn = zalx.a(paramXmlMap, paramListObject, paramString, k, (zaoo)localObject2);
        k++;
        this.a.get(paramListObject.getStartRow(), this.f).putValue(localListColumn.getName());
      }
      else if (this.f < paramListObject.getStartColumn())
      {
        localListColumn = zalx.a(paramXmlMap, paramListObject, paramString, k, (zaoo)localObject2, this.f - this.d);
        k++;
        this.a.get(paramListObject.getStartRow(), this.f).putValue(localListColumn.getName());
      }
      else
      {
        localListColumn = paramListObject.getListColumns().get(this.f - paramListObject.getStartColumn());
        a(paramXmlMap, localListColumn, paramString, (zaoo)localObject2);
      }
      this.f += 1;
    }
    localObject1 = paramzaop.b.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zaop)((Iterator)localObject1).next();
      a((zaop)localObject2, paramString, paramXmlMap, paramListObject, k);
    }
  }
  
  private static ListColumn a(XmlMap paramXmlMap, ListColumn paramListColumn, String paramString, zaoo paramzaoo)
  {
    String str1;
    String str2;
    if ((paramzaoo != null) && (paramzaoo.d.length() > 0) && (!paramzaoo.g))
    {
      str1 = paramzaoo.d;
      str2 = paramString + "/@" + paramzaoo.d;
    }
    else
    {
      str1 = paramString.substring(paramString.lastIndexOf("/") + 1);
      str2 = paramString;
    }
    paramListColumn.d(str1);
    paramListColumn.a(new XmlColumnProperty());
    paramListColumn.a().a(paramXmlMap.d());
    if ((paramzaoo != null) && (paramzaoo.h != null) && ("xsd:integer".equals(paramzaoo.h))) {
      paramListColumn.a().b(8);
    } else {
      paramListColumn.a().b(1);
    }
    paramListColumn.a().a(str2);
    return paramListColumn;
  }
  
  private ListObject a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zbvh localzbvh = (zbvh)localIterator.next();
      if ((!localzbvh.c()) && (localzbvh.a().StartRow == paramInt1) && (localzbvh.a().EndColumn == paramInt2)) {
        return localzbvh.b();
      }
    }
    return null;
  }
  
  private ListObject b(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zbvh localzbvh = (zbvh)localIterator.next();
      if ((!localzbvh.c()) && (localzbvh.a().StartRow == paramInt1) && (localzbvh.a().StartColumn == paramInt2)) {
        return localzbvh.b();
      }
    }
    return null;
  }
  
  private static int a(Workbook paramWorkbook)
  {
    if (paramWorkbook.h()) {
      return 16383;
    }
    return 255;
  }
  
  private void a(zaop paramzaop, String paramString, XmlMap paramXmlMap)
  {
    paramString = paramString + "/" + paramzaop.d;
    if ((paramzaop.c.size() == 0) && (paramzaop.b.size() == 0))
    {
      a(paramXmlMap, paramString, null);
      this.f += 1;
    }
    Iterator localIterator = paramzaop.c.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zaoo)localIterator.next();
      a(paramXmlMap, paramString, (zaoo)localObject);
      this.f += 1;
    }
    localIterator = paramzaop.b.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zaop)localIterator.next();
      a((zaop)localObject, paramString, paramXmlMap);
    }
  }
  
  private zbpn a(XmlMap paramXmlMap, String paramString, zaoo paramzaoo)
  {
    int k = this.h.l().a();
    zbpn localzbpn = this.h.l().a(k);
    localzbpn.a(CellsHelper.cellIndexToName(this.e, this.f));
    if (paramXmlMap.j() != null) {
      localzbpn.b(paramXmlMap.j().a());
    } else {
      localzbpn.b(0);
    }
    zcji localzcji = new zcji();
    localzbpn.a(localzcji);
    localzcji.a(1);
    String str1;
    String str2;
    if ((paramzaoo == null) || (paramzaoo.g))
    {
      str1 = paramString.substring(paramString.lastIndexOf("/") + 1);
      str2 = paramString;
    }
    else
    {
      str2 = paramString + "/@" + paramzaoo.d;
      str1 = paramzaoo.d;
    }
    localzcji.a(str1);
    XmlColumnProperty localXmlColumnProperty = new XmlColumnProperty();
    localzcji.a(localXmlColumnProperty);
    localXmlColumnProperty.a(paramXmlMap.d());
    localXmlColumnProperty.a(str2);
    if ((paramzaoo != null) && ("xsd:integer".equals(paramzaoo.h))) {
      localXmlColumnProperty.b(8);
    } else {
      localXmlColumnProperty.b(1);
    }
    return localzbpn;
  }
  
  private boolean a(zaop paramzaop)
  {
    if (paramzaop.e) {
      return true;
    }
    Iterator localIterator = paramzaop.b.iterator();
    while (localIterator.hasNext())
    {
      zaop localzaop = (zaop)localIterator.next();
      if (a(localzaop)) {
        return true;
      }
    }
    return false;
  }
  
  private ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.h.l().iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zbpn)localIterator.next();
      if ((((zbpn)localObject).d() != null) && (((zbpn)localObject).d().c() != null))
      {
        int k = 0;
        int m = 0;
        int[] arrayOfInt1 = { k };
        int[] arrayOfInt2 = { m };
        CellsHelper.a(((zbpn)localObject).b(), arrayOfInt1, arrayOfInt2);
        k = arrayOfInt1[0];
        m = arrayOfInt2[0];
        zbvh localzbvh2 = new zbvh(k, m, k, m, null);
        zf.a(localArrayList, localzbvh2);
      }
    }
    localIterator = this.h.getListObjects().iterator();
    while (localIterator.hasNext())
    {
      localObject = (ListObject)localIterator.next();
      zbvh localzbvh1 = new zbvh(((ListObject)localObject).getStartRow(), ((ListObject)localObject).getStartColumn(), ((ListObject)localObject).getEndRow(), ((ListObject)localObject).getEndColumn(), (ListObject)localObject);
      zf.a(localArrayList, localzbvh1);
    }
    return localArrayList;
  }
  
  private static ListObject a(ArrayList paramArrayList, CellArea paramCellArea, int paramInt)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zbvh localzbvh = (zbvh)localIterator.next();
      if (localzbvh.a(paramCellArea))
      {
        if (localzbvh.c()) {
          throw new IllegalArgumentException("The cell or table column is already mapped.");
        }
        if ((paramCellArea.StartRow < localzbvh.a().StartRow) || (paramCellArea.StartColumn < localzbvh.a().StartColumn)) {
          throw new IllegalArgumentException("This operation would overlap an existing table.");
        }
        ListObject localListObject = localzbvh.b();
        int k = localListObject.E();
        if ((k != -1) && (k != paramInt)) {
          throw new IllegalArgumentException("The XML table is bound to a different XML map");
        }
        if (k == -1) {
          return localListObject;
        }
        int m = Math.min(paramCellArea.EndColumn, localListObject.getEndColumn());
        for (int n = paramCellArea.StartColumn; n <= m; n++)
        {
          ListColumn localListColumn = localListObject.getListColumns().get(n - localListObject.getStartColumn());
          if (localListColumn.a() != null) {
            throw new IllegalArgumentException("The cell or table column is already mapped.");
          }
        }
        return localListObject;
      }
    }
    return null;
  }
  
  private static void a(zaop paramzaop, String paramString)
  {
    paramString = paramString + "/" + paramzaop.d;
    if (paramzaop.a()) {
      throw new IllegalArgumentException("The element[" + paramString + "] already been mapped.");
    }
    Iterator localIterator = paramzaop.c.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zaoo)localIterator.next();
      if (((zaoo)localObject).a()) {
        throw new IllegalArgumentException("The element[" + paramString + "/" + ((zaoo)localObject).d + "] already been mapped.");
      }
    }
    localIterator = paramzaop.b.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zaop)localIterator.next();
      a((zaop)localObject, paramString);
    }
  }
  
  private void b(zaop paramzaop, String paramString)
  {
    paramString = paramString + "/" + paramzaop.d;
    if ((paramzaop.c.size() == 0) && (paramzaop.b.size() == 0)) {
      this.j += 1;
    }
    Iterator localIterator = paramzaop.c.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zaoo)localIterator.next();
      this.j += 1;
    }
    localIterator = paramzaop.b.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zaop)localIterator.next();
      b((zaop)localObject, paramString);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */