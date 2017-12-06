package com.aspose.cells;

import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class zalx
{
  private String a;
  private Workbook b;
  private Worksheet c;
  private int d;
  private int e;
  private XmlMapCollection f;
  private zcjl g;
  private HashMap h = null;
  private HashMap i = null;
  private static String j = zcjl.a;
  
  zalx(String paramString, Workbook paramWorkbook, Worksheet paramWorksheet, int paramInt1, int paramInt2)
  {
    this.a = paramString;
    this.b = paramWorkbook;
    this.c = paramWorksheet;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramWorkbook.getWorksheets().getXmlMaps();
    this.g = new zcjl(paramString);
  }
  
  public void a()
    throws Exception
  {
    if (!this.g.a()) {
      return;
    }
    String str = this.g.b().g;
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.f.iterator();
    while (((Iterator)localObject).hasNext())
    {
      XmlMap localXmlMap = (XmlMap)((Iterator)localObject).next();
      if (localXmlMap.g().equals(str)) {
        zf.a(localArrayList, localXmlMap);
      }
    }
    b();
    if (localArrayList.size() == 0)
    {
      c();
    }
    else if (localArrayList.size() == 1)
    {
      a((XmlMap)localArrayList.get(0));
    }
    else
    {
      localObject = a(localArrayList, this.c, this.d, this.e);
      if (localObject != null) {
        a((XmlMap)localObject);
      }
    }
  }
  
  private void b()
    throws Exception
  {
    this.h = this.g.c();
    this.i = this.g.d();
  }
  
  private void a(XmlMap paramXmlMap)
    throws Exception
  {
    int k;
    if (paramXmlMap.j() != null)
    {
      k = paramXmlMap.j().a();
      this.b.getDataConnections().a(k, this.a);
    }
    else
    {
      k = this.b.getDataConnections().a(this.a);
      int m = this.b.getDataConnections().get(k).l;
      paramXmlMap.a(new zcjk());
      paramXmlMap.j().a(m);
      paramXmlMap.j().a(true);
    }
    a(paramXmlMap, this.b.getWorksheets());
  }
  
  private void c()
    throws Exception
  {
    int k = this.f.a(this.a, this.g);
    XmlMap localXmlMap = this.f.get(k);
    int m = this.c.getListObjects().c();
    ListObject localListObject = this.c.getListObjects().get(m);
    localListObject.j(localXmlMap.j().a());
    a(localXmlMap, localListObject);
  }
  
  void a(XmlMap paramXmlMap, ListObject paramListObject)
    throws Exception
  {
    int k = a(null);
    ArrayList localArrayList1 = new ArrayList(this.i.values());
    ArrayList localArrayList2 = new ArrayList();
    Collections.sort(localArrayList1);
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
    {
      n = ((Integer)localIterator.next()).intValue();
      zc localzc = zg.a(this.i);
      while (localzc.c())
      {
        i2 = ((Integer)localzc.b()).intValue();
        if (n == i2) {
          zf.a(localArrayList2, localzc.a());
        }
      }
    }
    int m = 0;
    int n = this.d + 1;
    int i1 = this.e;
    int i2 = 0;
    int i3 = i2;
    for (int i4 = 0; i4 < localArrayList2.size(); i4++)
    {
      String str = (String)localArrayList2.get(i4);
      ArrayList localArrayList3 = (ArrayList)this.h.get(str);
      if (localArrayList3.size() == 0)
      {
        a(paramXmlMap, paramListObject, str, m, null);
        m++;
        i1++;
      }
      int i5 = 0;
      for (int i6 = 0; i6 < localArrayList3.size(); i6++)
      {
        zaoo localzaoo = (zaoo)localArrayList3.get(i6);
        a(paramXmlMap, paramListObject, str, m, localzaoo);
        ArrayList localArrayList4 = localzaoo.e;
        if ((i5 < localArrayList4.size()) && (!localzaoo.g)) {
          i5 = localArrayList4.size();
        }
        int i7;
        if (localArrayList4.size() > 1)
        {
          if (localzaoo.g) {
            i7 = i3;
          } else {
            i7 = i2;
          }
          for (int i8 = 0; i8 < localArrayList4.size(); i8++) {
            this.c.getCells().get(n + i7 + i8, i1).putValue(localArrayList4.get(i8));
          }
        }
        else
        {
          for (i7 = 0; i7 < k; i7++) {
            this.c.getCells().get(n + i7, i1).putValue(localArrayList4.get(0));
          }
        }
        m++;
        i1++;
      }
      if (i5 > 1)
      {
        i3 = i2;
        i2 += i5;
      }
    }
    for (i4 = 0; i4 < paramListObject.getListColumns().getCount(); i4++) {
      this.c.getCells().get(this.d, i4 + this.e).putValue(paramListObject.getListColumns().get(i4).getName());
    }
    paramListObject.a(this.d);
    paramListObject.b(this.e);
    paramListObject.c(this.d + k);
    paramListObject.d(this.e + paramListObject.getListColumns().getCount() - 1);
    paramListObject.getAutoFilter().setRange(a(paramListObject));
    paramListObject.setTableStyleType(23);
    paramListObject.a = 2;
    this.c.autoFitColumns(paramListObject.getStartRow(), paramListObject.getStartColumn(), paramListObject.getEndRow(), paramListObject.getEndColumn());
  }
  
  private int a(HashMap paramHashMap)
  {
    int k = 0;
    int m = 0;
    ArrayList localArrayList1 = new ArrayList(this.h.keySet());
    Collections.sort(localArrayList1);
    for (int n = 0; n < localArrayList1.size(); n++)
    {
      String str = (String)localArrayList1.get(n);
      if ((paramHashMap == null) || (paramHashMap.containsKey(str)))
      {
        ArrayList localArrayList2 = (ArrayList)this.h.get(str);
        int i1 = 0;
        for (int i2 = 0; i2 < localArrayList2.size(); i2++)
        {
          zaoo localzaoo = (zaoo)localArrayList2.get(i2);
          if ((i1 < localzaoo.e.size()) && (!localzaoo.g)) {
            if (paramHashMap != null)
            {
              ArrayList localArrayList3 = (ArrayList)paramHashMap.get(str);
              int i3 = 0;
              Iterator localIterator = localArrayList3.iterator();
              while (localIterator.hasNext())
              {
                zaoe localzaoe = (zaoe)localIterator.next();
                if (localzaoo.d.equals(localzaoe.b))
                {
                  i3 = 1;
                  break;
                }
              }
              if (i3 == 0) {}
            }
            else
            {
              i1 = localzaoo.e.size();
            }
          }
        }
        if (i1 > 1) {
          k += i1;
        } else if (m < i1) {
          m = i1;
        }
      }
    }
    return Math.max(k, m);
  }
  
  static ListColumn a(XmlMap paramXmlMap, ListObject paramListObject, String paramString, int paramInt, zaoo paramzaoo)
  {
    return a(paramXmlMap, paramListObject, paramString, paramInt, paramzaoo, paramListObject.getListColumns().getCount());
  }
  
  static ListColumn a(XmlMap paramXmlMap, ListObject paramListObject, String paramString, int paramInt1, zaoo paramzaoo, int paramInt2)
  {
    String str2;
    String str1;
    String str3;
    if ((paramzaoo != null) && (paramzaoo.d.length() > 0) && (!paramzaoo.g))
    {
      str2 = paramzaoo.d;
      str1 = str2;
      str3 = paramString + "/@" + paramzaoo.d;
    }
    else
    {
      str2 = paramString.substring(paramString.lastIndexOf("/") + 1);
      str1 = str2;
      str3 = paramString;
    }
    int k = 0;
    String str4 = str1;
    for (;;)
    {
      localListColumn = paramListObject.getListColumns().get(str1);
      if (localListColumn == null) {
        break;
      }
      k++;
      str1 = str4 + (k + 1);
    }
    ListColumn localListColumn = new ListColumn(paramListObject.getListColumns(), str1, paramInt1);
    localListColumn.d(str2);
    localListColumn.a(new XmlColumnProperty());
    localListColumn.a().a(paramXmlMap.d());
    if ((paramzaoo != null) && (paramzaoo.h != null) && ("xsd:integer".equals(paramzaoo.h))) {
      localListColumn.a().b(8);
    } else {
      localListColumn.a().b(1);
    }
    localListColumn.a().a(str3);
    paramListObject.getListColumns().a(paramInt2, localListColumn);
    return localListColumn;
  }
  
  static String a(ListObject paramListObject)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramListObject.getStartRow();
    localCellArea.StartColumn = paramListObject.getStartColumn();
    localCellArea.EndRow = paramListObject.getEndRow();
    if (paramListObject.getEndRow() - paramListObject.getStartRow() == 0) {
      localCellArea.EndRow += 1;
    }
    localCellArea.EndColumn = paramListObject.getEndColumn();
    return zauj.a(localCellArea);
  }
  
  private void a(XmlMap paramXmlMap, WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    c(paramXmlMap, paramWorksheetCollection);
    b(paramXmlMap, paramWorksheetCollection);
  }
  
  private void b(XmlMap paramXmlMap, WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    Iterator localIterator1 = paramWorksheetCollection.iterator();
    while (localIterator1.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator1.next();
      Iterator localIterator2 = localWorksheet.l().iterator();
      while (localIterator2.hasNext())
      {
        zbpn localzbpn = (zbpn)localIterator2.next();
        if ((localzbpn.d() != null) && (localzbpn.d().c() != null))
        {
          XmlColumnProperty localXmlColumnProperty = localzbpn.d().c();
          if (localXmlColumnProperty.a() == paramXmlMap.d())
          {
            int k = localXmlColumnProperty.b().lastIndexOf("/@");
            String str1;
            String str2;
            if (k >= 0)
            {
              str1 = localXmlColumnProperty.b().substring(0, 0 + k);
              str2 = localXmlColumnProperty.b().substring(k + 2);
            }
            else
            {
              str1 = localXmlColumnProperty.b();
              str2 = j;
            }
            Cells localCells = localWorksheet.getCells();
            Cell localCell = localCells.get(localzbpn.b());
            localCell.putValue((String)null);
            localzbpn.b(paramXmlMap.j().a());
            ArrayList localArrayList = (ArrayList)this.h.get(str1);
            if ((localArrayList != null) && (localArrayList.size() > 0))
            {
              Iterator localIterator3 = localArrayList.iterator();
              while (localIterator3.hasNext())
              {
                zaoo localzaoo = (zaoo)localIterator3.next();
                if ((zw.b(localzaoo.d, str2)) && (localzaoo.e.size() > 0))
                {
                  localCell.putValue(a((String)localzaoo.e.get(0), localXmlColumnProperty.c()));
                  int m = localCell.getWidthOfValue();
                  int n = localCells.getColumnWidthPixel(localCell.getColumn());
                  if (n < m) {
                    localCells.setColumnWidthPixel(localCell.getColumn(), m);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void c(XmlMap paramXmlMap, WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    Iterator localIterator1 = paramWorksheetCollection.iterator();
    while (localIterator1.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator1.next();
      Iterator localIterator2 = localWorksheet.getListObjects().iterator();
      while (localIterator2.hasNext())
      {
        ListObject localListObject = (ListObject)localIterator2.next();
        int k = 1;
        Object localObject1 = localListObject.getListColumns().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          ListColumn localListColumn = (ListColumn)((Iterator)localObject1).next();
          if (localListColumn.a().a() != paramXmlMap.d())
          {
            k = 0;
            break;
          }
        }
        if (k != 0)
        {
          localObject1 = new HashMap();
          Object localObject2;
          int i1;
          Object localObject3;
          Object localObject4;
          Object localObject5;
          for (int m = 0; m < localListObject.getListColumns().getCount(); m++)
          {
            localObject2 = localListObject.getListColumns().get(m);
            i1 = ((ListColumn)localObject2).a().b().lastIndexOf("/@");
            if (i1 >= 0)
            {
              localObject3 = ((ListColumn)localObject2).a().b().substring(0, 0 + i1);
              localObject4 = ((ListColumn)localObject2).a().b().substring(i1 + 2);
            }
            else
            {
              localObject3 = ((ListColumn)localObject2).a().b();
              localObject4 = j;
            }
            if (((HashMap)localObject1).get(localObject3) == null) {
              ((HashMap)localObject1).put(localObject3, new ArrayList());
            }
            localObject5 = (ArrayList)((HashMap)localObject1).get(localObject3);
            zf.a((ArrayList)localObject5, new zaoe((ListColumn)localObject2, (String)localObject4, m));
          }
          m = a((HashMap)localObject1);
          localWorksheet.getCells().clearRange(localListObject.getStartRow() + 1, localListObject.getStartColumn(), localListObject.getEndRow(), localListObject.getEndColumn());
          localListObject.j(paramXmlMap.j().a());
          if (m > 0)
          {
            localObject2 = new ArrayList(this.i.values());
            localObject3 = new ArrayList();
            Collections.sort((List)localObject2);
            localObject4 = ((Iterable)localObject2).iterator();
            while (((Iterator)localObject4).hasNext())
            {
              i1 = ((Integer)((Iterator)localObject4).next()).intValue();
              localObject5 = zg.a(this.i);
              while (((zc)localObject5).c())
              {
                i3 = ((Integer)((zc)localObject5).b()).intValue();
                if (i1 == i3) {
                  zf.a((ArrayList)localObject3, ((zc)localObject5).a());
                }
              }
            }
            int n = localListObject.getStartRow() + 1;
            i1 = localListObject.getStartColumn();
            int i2 = 0;
            for (int i3 = 0; i3 < ((ArrayList)localObject3).size(); i3++)
            {
              String str = (String)((ArrayList)localObject3).get(i3);
              ArrayList localArrayList1 = (ArrayList)((HashMap)localObject1).get(str);
              if (localArrayList1 != null)
              {
                ArrayList localArrayList2 = (ArrayList)this.h.get(str);
                int i4 = 0;
                for (int i5 = 0; i5 < localArrayList2.size(); i5++)
                {
                  zaoo localzaoo = (zaoo)localArrayList2.get(i5);
                  Object localObject6 = null;
                  Object localObject7 = localArrayList1.iterator();
                  Object localObject8;
                  while (((Iterator)localObject7).hasNext())
                  {
                    localObject8 = (zaoe)((Iterator)localObject7).next();
                    if (localzaoo.d.equals(((zaoe)localObject8).b))
                    {
                      localObject6 = localObject8;
                      break;
                    }
                  }
                  if (localObject6 != null)
                  {
                    localObject7 = localzaoo.e;
                    if (i4 < ((ArrayList)localObject7).size()) {
                      i4 = ((ArrayList)localObject7).size();
                    }
                    localObject8 = ((zaoe)localObject6).a;
                    int i6 = i1 + ((zaoe)localObject6).c;
                    if (((ArrayList)localObject7).size() > 1)
                    {
                      for (int i7 = 0; i7 < ((ArrayList)localObject7).size(); i7++)
                      {
                        Object localObject10 = a((String)((ArrayList)localObject7).get(i7), ((ListColumn)localObject8).a().c());
                        localWorksheet.getCells().get(n + i2 + i7, i6).putValue(localObject10);
                      }
                    }
                    else if (((ArrayList)localObject7).size() == 1)
                    {
                      Object localObject9 = a((String)((ArrayList)localObject7).get(0), ((ListColumn)localObject8).a().c());
                      for (int i8 = 0; i8 < m; i8++) {
                        localWorksheet.getCells().get(n + i8, i6).putValue(localObject9);
                      }
                    }
                  }
                }
                if (i4 > 1) {
                  i2 += i4;
                }
              }
            }
          }
          localListObject.c(localListObject.getStartRow() + m);
          localListObject.getAutoFilter().setRange(a(localListObject));
          localWorksheet.autoFitColumns(localListObject.getStartRow(), localListObject.getStartColumn(), localListObject.getEndRow(), localListObject.getEndColumn());
        }
      }
    }
  }
  
  private static Object a(String paramString, int paramInt)
  {
    Object localObject = null;
    if (paramInt == 8) {
      try
      {
        localObject = Integer.valueOf(zauj.F(paramString));
      }
      catch (Exception localException)
      {
        localObject = paramString;
      }
    } else {
      localObject = paramString;
    }
    return localObject;
  }
  
  private static XmlMap a(ArrayList paramArrayList, Worksheet paramWorksheet, int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    Iterator localIterator1 = paramArrayList.iterator();
    while (localIterator1.hasNext())
    {
      XmlMap localXmlMap = (XmlMap)localIterator1.next();
      Iterator localIterator2 = paramWorksheet.getListObjects().iterator();
      Object localObject2;
      while (localIterator2.hasNext())
      {
        localObject2 = (ListObject)localIterator2.next();
        int k = 1;
        Iterator localIterator3 = ((ListObject)localObject2).getListColumns().iterator();
        while (localIterator3.hasNext())
        {
          ListColumn localListColumn = (ListColumn)localIterator3.next();
          if (localListColumn.a().a() != localXmlMap.d())
          {
            k = 0;
            break;
          }
        }
        if (k != 0) {
          if (((ListObject)localObject2).D().a(paramInt1, paramInt2))
          {
            localObject1 = localXmlMap;
            return (XmlMap)localObject1;
          }
        }
      }
      localIterator2 = paramWorksheet.l().iterator();
      while (localIterator2.hasNext())
      {
        localObject2 = (zbpn)localIterator2.next();
        if ((((zbpn)localObject2).d() != null) && (((zbpn)localObject2).d().c() != null))
        {
          XmlColumnProperty localXmlColumnProperty = ((zbpn)localObject2).d().c();
          if (localXmlColumnProperty.a() == localXmlMap.d()) {
            if (((zbpn)localObject2).b().equals(CellsHelper.cellIndexToName(paramInt1, paramInt2)))
            {
              localObject1 = localXmlMap;
              return (XmlMap)localObject1;
            }
          }
        }
      }
    }
    return (XmlMap)localObject1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */