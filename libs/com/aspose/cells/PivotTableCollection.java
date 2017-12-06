package com.aspose.cells;

import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PivotTableCollection
  extends CollectionBase
{
  Worksheet a;
  
  PivotTableCollection(Worksheet worksheet)
  {
    this.a = worksheet;
  }
  
  void a(PivotTableCollection paramPivotTableCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramPivotTableCollection.getCount(); i++)
    {
      PivotTable localPivotTable = new PivotTable(this);
      try
      {
        localPivotTable.a(paramPivotTableCollection.get(i), paramCopyOptions);
      }
      catch (Exception localException)
      {
        if (!"Unkown Area".equals(localException.getMessage())) {
          break label52;
        }
      }
      continue;
      label52:
      zf.a(this.InnerList, localPivotTable);
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).a(paramCellArea, paramInt1, paramInt2)) {
        removeAt(i--);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      PivotTable localPivotTable = get(i);
      if (localPivotTable.b(paramInt1, paramInt2))
      {
        removeAt(i);
        if (!a(localPivotTable.d)) {
          b(localPivotTable.d);
        }
      }
    }
  }
  
  boolean a(zawp paramzawp)
  {
    for (int i = 0; i < getCount(); i++)
    {
      PivotTable localPivotTable = get(i);
      if (localPivotTable.d == paramzawp) {
        return true;
      }
    }
    return false;
  }
  
  zaie[] a(PivotTable paramPivotTable, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    zd localzd1 = new zd();
    zd localzd2 = new zd();
    zd localzd3 = new zd();
    String str = null;
    PivotField localPivotField = null;
    int i = paramArrayOfzaie.length;
    for (int j = 2; j < i; j += 2)
    {
      str = paramArrayOfzaie[j].i(paramzaca).o();
      localPivotField = paramPivotTable.getBaseFields().a(str);
      if (localPivotField != null) {
        if (localPivotField.m == 1) {
          localzd1.a(Integer.valueOf(localPivotField.getPosition()), new int[] { j, j + 1 });
        } else if (localPivotField.m == 2) {
          localzd2.a(Integer.valueOf(localPivotField.getPosition()), new int[] { j, j + 1 });
        } else {
          localzd3.a(Integer.valueOf(localPivotField.getPosition()), new int[] { j, j + 1 });
        }
      }
    }
    zaie[] arrayOfzaie = new zaie[i - 2];
    int k = 0;
    Iterator localIterator;
    int[] arrayOfInt;
    if (localzd1.b() > 0)
    {
      localIterator = localzd1.f().iterator();
      while (localIterator.hasNext())
      {
        arrayOfInt = (int[])localIterator.next();
        arrayOfzaie[(k++)] = paramArrayOfzaie[arrayOfInt[0]];
        arrayOfzaie[(k++)] = paramArrayOfzaie[arrayOfInt[1]];
      }
    }
    if (localzd2.b() > 0)
    {
      localIterator = localzd2.f().iterator();
      while (localIterator.hasNext())
      {
        arrayOfInt = (int[])localIterator.next();
        arrayOfzaie[(k++)] = paramArrayOfzaie[arrayOfInt[0]];
        arrayOfzaie[(k++)] = paramArrayOfzaie[arrayOfInt[1]];
      }
    }
    if (localzd3.b() > 0)
    {
      localIterator = localzd3.f().iterator();
      while (localIterator.hasNext())
      {
        arrayOfInt = (int[])localIterator.next();
        arrayOfzaie[(k++)] = paramArrayOfzaie[arrayOfInt[0]];
        arrayOfzaie[(k++)] = paramArrayOfzaie[arrayOfInt[1]];
      }
    }
    return arrayOfzaie;
  }
  
  zaie a(int paramInt1, int paramInt2, String paramString, zaie[] paramArrayOfzaie, zaca paramzaca)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    zabi localzabi = zabi.q();
    int i = 0;
    int j = -1;
    int k = getCount();
    for (int m = 0; m < k; m++)
    {
      PivotTable localPivotTable = get(m);
      if ((paramInt1 >= localPivotTable.i) && (paramInt1 <= localPivotTable.j) && (paramInt2 >= localPivotTable.k) && (paramInt2 <= localPivotTable.l))
      {
        PivotFieldCollection localPivotFieldCollection = localPivotTable.getDataFields();
        int n = localPivotFieldCollection.getCount();
        for (int i1 = 0; i1 < n; i1++)
        {
          PivotField localPivotField1 = localPivotFieldCollection.get(i1);
          if (((localPivotField1.getName() != null) && (localPivotField1.getName().toUpperCase().endsWith(paramString.toUpperCase()))) || ((localPivotField1.getDisplayName() != null) && (localPivotField1.getDisplayName().toUpperCase().endsWith(paramString.toUpperCase()))))
          {
            if ((localPivotTable.getDataField() != null) && (localPivotTable.getDataField().m == 2))
            {
              i = 1;
              i2 = localPivotTable.a(localPivotField1);
              localHashMap1.put(Integer.valueOf(i2 + localPivotTable.o), Integer.valueOf(i2 + localPivotTable.o));
            }
            int i5;
            if (paramArrayOfzaie.length > 2)
            {
              paramArrayOfzaie = a(localPivotTable, paramArrayOfzaie, paramzaca);
              i2 = paramArrayOfzaie.length;
              Object localObject1;
              int i8;
              for (int i3 = 0; i3 < i2; i3 += 2)
              {
                if (paramArrayOfzaie[i3] != null) {
                  localObject1 = paramArrayOfzaie[i3].i(paramzaca).o();
                } else {
                  localObject1 = "";
                }
                localzabi.d(paramArrayOfzaie[(i3 + 1)]);
                PivotField localPivotField2 = localPivotTable.getBaseFields().a((String)localObject1);
                if (localPivotField2 != null)
                {
                  int i7;
                  int i9;
                  if (localPivotField2.m == 2)
                  {
                    localArrayList1 = localPivotTable.a(localzabi, true, paramzaca, 0);
                    i7 = localArrayList1.size();
                    if (i7 == 0) {
                      return zabc.c;
                    }
                    i8 = localPivotTable.a(localPivotField2);
                    for (i9 = 0; i9 < i7; i9++)
                    {
                      int[] arrayOfInt1 = (int[])localArrayList1.get(i9);
                      if (arrayOfInt1[0] == i8) {
                        if (localHashMap1.containsKey(Integer.valueOf(arrayOfInt1[1]))) {
                          if (i != 0) {
                            break;
                          }
                        } else if (localHashMap1.size() == 0) {
                          localHashMap1.put(Integer.valueOf(arrayOfInt1[1]), Integer.valueOf(arrayOfInt1[1]));
                        } else {
                          return zabc.c;
                        }
                      }
                    }
                  }
                  else if (localPivotField2.m == 1)
                  {
                    j++;
                    i7 = localPivotTable.a(localPivotField2);
                    i8 = -1;
                    i9 = i7;
                    for (int i10 = i7 - 1; i10 >= 0; i10--) {
                      if ((localPivotTable.getRowFields().get(i10).getShowInOutlineForm()) && (localPivotTable.getRowFields().get(i10).getShowCompact())) {
                        i9--;
                      }
                    }
                    localArrayList1 = localPivotTable.a(localzabi, false, paramzaca, i9);
                    if (localArrayList1.size() == 0) {
                      return zabc.c;
                    }
                    i9 += localPivotTable.k;
                    ArrayList localArrayList3 = new ArrayList();
                    if (i7 > 0)
                    {
                      if ((localPivotTable.getRowFields().get(i7 - 1).getShowInOutlineForm()) && (localPivotTable.getRowFields().get(i7 - 1).getShowCompact()))
                      {
                        localArrayList3 = localPivotTable.a(i7);
                      }
                      else
                      {
                        i8 = i7;
                        for (i11 = i7 - 1; i11 >= 0; i11--) {
                          if ((localPivotTable.getRowFields().get(i11).getShowInOutlineForm()) && (localPivotTable.getRowFields().get(i11).getShowCompact())) {
                            i8--;
                          }
                        }
                      }
                    }
                    else if ((localPivotTable.getRowFields().get(0).getShowInOutlineForm()) && (localPivotTable.getRowFields().get(0).getShowCompact())) {
                      localArrayList3 = localPivotTable.a(i7);
                    } else {
                      i8 = 0;
                    }
                    if (i8 >= 0)
                    {
                      i8 += localPivotTable.k;
                      localArrayList2 = a(localArrayList1, i8, i7);
                    }
                    else
                    {
                      localArrayList2 = a(localArrayList1, localArrayList3, i7, i9);
                    }
                    int i11 = localArrayList2.size();
                    Object localObject2;
                    if ((localHashMap2.size() == 0) && (j == 0))
                    {
                      for (int i12 = 0; i12 < i11; i12++) {
                        if (!localHashMap2.containsKey(Integer.valueOf(((int[])(int[])localArrayList2.get(i12))[0]))) {
                          localHashMap2.put(Integer.valueOf(((int[])(int[])localArrayList2.get(i12))[0]), Integer.valueOf(((int[])(int[])localArrayList2.get(i12))[1]));
                        }
                      }
                    }
                    else
                    {
                      localObject2 = zg.b(localHashMap2);
                      int i13 = 0;
                      for (int i14 = 0; i14 < i11; i14++)
                      {
                        int[] arrayOfInt2 = (int[])localArrayList2.get(i14);
                        int i15 = arrayOfInt2[0];
                        int i16 = arrayOfInt2[1];
                        zc localzc = zg.a((HashMap)localObject2);
                        while (localzc.c())
                        {
                          int i17 = ((Integer)localzc.a()).intValue();
                          int i18 = ((Integer)localzc.b()).intValue();
                          int i19 = Math.min(i18, i16);
                          int i20 = 0;
                          for (int i21 = 0; i21 <= i19; i21++) {
                            if (((int[])(int[])localPivotTable.g.get(i15 - localPivotTable.n))[(4 + i21)] != ((int[])(int[])localPivotTable.g.get(i17 - localPivotTable.n))[(4 + i21)])
                            {
                              i20 = 1;
                              break;
                            }
                          }
                          if ((i20 == 0) && (i18 < i16))
                          {
                            localHashMap2.remove(Integer.valueOf(i17));
                            if (localHashMap2.containsKey(Integer.valueOf(i15))) {
                              localHashMap2.remove(Integer.valueOf(i15));
                            }
                            localHashMap2.put(Integer.valueOf(i15), Integer.valueOf(i16));
                            i13 = 1;
                            break;
                          }
                        }
                        if (i13 != 0) {
                          break;
                        }
                      }
                    }
                    if (localHashMap2.size() == 1)
                    {
                      localObject2 = zg.a(localHashMap2);
                      if ((((zc)localObject2).c()) && (i8 != -1) && (((Integer)((zc)localObject2).b()).intValue() != i8 - localPivotTable.k)) {
                        return zabc.c;
                      }
                    }
                  }
                  else
                  {
                    return zabc.c;
                  }
                }
                else
                {
                  return zabc.c;
                }
              }
              if (localHashMap1.size() == 0)
              {
                if ((localHashMap2.size() == 0) || (localHashMap2.size() > 1)) {
                  return zabc.c;
                }
                i3 = -1;
                localObject1 = localHashMap2.keySet().iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  i6 = ((Integer)((Iterator)localObject1).next()).intValue();
                  i3 = i6;
                }
                int i4 = ((Integer)localHashMap2.get(Integer.valueOf(i3))).intValue();
                if (((!localPivotTable.getRowFields().get(i4).getShowSubtotalAtTop()) || (!localPivotTable.getRowFields().get(i4).getShowInOutlineForm())) && (i4 != localPivotTable.getRowFields().getCount() - 1)) {
                  i3 = localPivotTable.a(i3, i4);
                }
                return zabt.a(this.a.getCells(), i3, localPivotTable.l, true, paramzaca);
              }
              i3 = -1;
              Iterator localIterator2 = localHashMap1.keySet().iterator();
              while (localIterator2.hasNext())
              {
                i6 = ((Integer)localIterator2.next()).intValue();
                i3 = i6;
              }
              if (localHashMap2.size() == 0)
              {
                i5 = localPivotTable.b(localPivotTable.a(localPivotField1));
                return zabt.a(this.a.getCells(), i5 + localPivotTable.n, i3, true, paramzaca);
              }
              if (localHashMap2.size() > 1) {
                return zabc.c;
              }
              i5 = -1;
              int i6 = -1;
              Iterator localIterator3 = localHashMap2.keySet().iterator();
              while (localIterator3.hasNext())
              {
                i8 = ((Integer)localIterator3.next()).intValue();
                i5 = i8;
                i6 = ((Integer)localHashMap2.get(Integer.valueOf(i8))).intValue();
              }
              if (((!localPivotTable.getRowFields().get(i6).getShowSubtotalAtTop()) || (!localPivotTable.getRowFields().get(i6).getShowInOutlineForm())) && (i6 != localPivotTable.getRowFields().getCount() - 1)) {
                i5 = localPivotTable.a(i5, i6);
              }
              return zabt.a(this.a.getCells(), i5, i3, true, paramzaca);
            }
            int i2 = -1;
            if (localHashMap1.size() == 0)
            {
              i2 = localPivotTable.l;
            }
            else
            {
              Iterator localIterator1 = localHashMap1.keySet().iterator();
              while (localIterator1.hasNext())
              {
                i5 = ((Integer)localIterator1.next()).intValue();
                i2 = i5;
              }
            }
            if (i2 < 0) {
              return zabg.a;
            }
            return zabt.a(this.a.getCells(), localPivotTable.j, i2, true, paramzaca);
          }
        }
      }
    }
    return zabc.c;
  }
  
  ArrayList a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList1.size();
    int j = paramArrayList2.size();
    for (int k = 0; k < i; k++) {
      for (int m = 0; m < j; m++) {
        if ((((int[])(int[])paramArrayList1.get(k))[0] == ((Integer)paramArrayList2.get(m)).intValue()) && (((int[])(int[])paramArrayList1.get(k))[1] == paramInt2)) {
          zf.a(localArrayList, new int[] { ((Integer)paramArrayList2.get(m)).intValue(), paramInt1 });
        }
      }
    }
    return localArrayList;
  }
  
  ArrayList a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList.size();
    int[] arrayOfInt = null;
    for (int j = 0; j < i; j++)
    {
      arrayOfInt = (int[])paramArrayList.get(j);
      if (arrayOfInt[1] == paramInt1) {
        zf.a(localArrayList, new int[] { arrayOfInt[0], paramInt2 });
      }
    }
    return localArrayList;
  }
  
  void b(zawp paramzawp)
  {
    int i = 0;
    if (this.a.d().getWorksheets().W() != null) {
      i = this.a.d().getWorksheets().W().getCount();
    }
    for (int j = 0; j < i; j++)
    {
      zawp localzawp = this.a.d().getWorksheets().W().a(j);
      if (paramzawp == localzawp) {
        this.a.d().getWorksheets().W().removeAt(j);
      }
    }
  }
  
  ArrayList a()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getCount(); i++)
    {
      PivotTable localPivotTable = get(i);
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = localPivotTable.i;
      localCellArea.EndRow = localPivotTable.j;
      localCellArea.StartColumn = localPivotTable.k;
      localCellArea.EndColumn = localPivotTable.l;
      zf.a(localArrayList, localCellArea);
    }
    return localArrayList;
  }
  
  public int add(String sourceData, String destCellName, String tableName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(destCellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return add(sourceData, i, j, tableName);
  }
  
  public int add(String sourceData, String destCellName, String tableName, boolean useSameSource)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(destCellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return add(sourceData, i, j, tableName, useSameSource);
  }
  
  public int add(String sourceData, int row, int column, String tableName)
  {
    zawq localzawq = this.a.c().W();
    int i = localzawq.a(sourceData, this.a, true);
    return a(localzawq.a(i), row, column, tableName);
  }
  
  public int add(String sourceData, int row, int column, String tableName, boolean useSameSource)
  {
    zawq localzawq = this.a.c().W();
    int i = localzawq.a(sourceData, this.a, useSameSource);
    return a(localzawq.a(i), row, column, tableName);
  }
  
  public int add(PivotTable pivotTable, String destCellName, String tableName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(destCellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return add(pivotTable, i, j, tableName);
  }
  
  public int add(PivotTable pivotTable, int row, int column, String tableName)
  {
    return a(pivotTable.d, row, column, tableName);
  }
  
  public int add(String[] sourceData, boolean isAutoPage, PivotPageFields pageFields, String destCellName, String tableName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(destCellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return add(sourceData, isAutoPage, pageFields, i, j, tableName);
  }
  
  public int add(String[] sourceData, boolean isAutoPage, PivotPageFields pageFields, int row, int column, String tableName)
  {
    zawq localzawq = this.a.c().W();
    int i = localzawq.a((byte)4, sourceData, isAutoPage, pageFields);
    zawp localzawp = localzawq.a(i);
    return a(localzawp, row, column, tableName);
  }
  
  int a(zawp paramzawp, int paramInt1, int paramInt2, String paramString)
  {
    PivotTable localPivotTable = new PivotTable(this, paramzawp, paramInt1, (short)paramInt2, paramString);
    this.a.d().getSettings().b();
    zf.a(this.InnerList, localPivotTable);
    return getCount() - 1;
  }
  
  public PivotTable get(int index)
  {
    return (PivotTable)this.InnerList.get(index);
  }
  
  public PivotTable get(String name)
  {
    if (null == name) {
      return null;
    }
    String str = name.toUpperCase();
    for (int i = 0; i < getCount(); i++)
    {
      PivotTable localPivotTable = (PivotTable)this.InnerList.get(i);
      if ((localPivotTable.getName() != null) && (localPivotTable.getName().toUpperCase().equals(str))) {
        return localPivotTable;
      }
    }
    return null;
  }
  
  public PivotTable get(int row, int column)
  {
    for (int i = 0; i < getCount(); i++)
    {
      PivotTable localPivotTable = (PivotTable)this.InnerList.get(i);
      if ((row >= localPivotTable.i) && (row <= localPivotTable.j) && (column >= localPivotTable.k) && (column <= localPivotTable.l)) {
        return localPivotTable;
      }
    }
    return null;
  }
  
  public void clear()
  {
    for (int i = getCount() - 1; i >= 0; i--) {
      removeAt(i);
    }
  }
  
  void a(PivotTable paramPivotTable)
  {
    this.a.d().getSettings().b();
    zf.a(this.InnerList, paramPivotTable);
  }
  
  public void remove(PivotTable pivotTable)
  {
    if (!pivotTable.d.a(pivotTable)) {
      this.a.c().W().c(pivotTable.d);
    }
    pivotTable.clearData();
    this.InnerList.remove(pivotTable);
  }
  
  public void removeAt(int index)
  {
    remove(get(index));
  }
  
  private String b()
  {
    GlobalizationSettings localGlobalizationSettings = this.a.getWorkbook().getSettings().getGlobalizationSettings();
    return localGlobalizationSettings.getRowLablesName();
  }
  
  private String c()
  {
    GlobalizationSettings localGlobalizationSettings = this.a.getWorkbook().getSettings().getGlobalizationSettings();
    return localGlobalizationSettings.getColumnLablesName();
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    int i = getCount();
    PivotTable localPivotTable = null;
    Cell localCell = null;
    for (int j = 0; j < i; j++)
    {
      localPivotTable = get(j);
      if ((localPivotTable.D) && (paramInt1 >= localPivotTable.i) && (paramInt1 <= localPivotTable.n) && (paramInt2 >= localPivotTable.k) && (paramInt2 <= localPivotTable.o + localPivotTable.getColumnFields().getCount()))
      {
        localCell = this.a.getCells().a(paramInt1, paramInt2, false);
        if ((b().equals(localCell.getStringValue())) || (c().equals(localCell.getStringValue()))) {
          return true;
        }
        if (paramInt2 < localPivotTable.o)
        {
          if (a(localCell.getStringValue(), localPivotTable)) {
            return true;
          }
        }
        else if (b(localCell.getStringValue(), localPivotTable)) {
          return true;
        }
      }
    }
    return false;
  }
  
  boolean a(String paramString, PivotTable paramPivotTable)
  {
    PivotFieldCollection localPivotFieldCollection = paramPivotTable.getRowFields();
    int i = localPivotFieldCollection.getCount();
    PivotField localPivotField = null;
    for (int j = 0; j < i; j++)
    {
      localPivotField = localPivotFieldCollection.get(j);
      if ((localPivotField.getName().equals(paramString)) || ((localPivotField.getDisplayName() != null) && (localPivotField.getDisplayName().equals(paramString)))) {
        return true;
      }
    }
    return false;
  }
  
  boolean b(String paramString, PivotTable paramPivotTable)
  {
    PivotFieldCollection localPivotFieldCollection = paramPivotTable.getColumnFields();
    int i = localPivotFieldCollection.getCount();
    PivotField localPivotField = null;
    for (int j = 0; j < i; j++)
    {
      localPivotField = localPivotFieldCollection.get(j);
      if ((localPivotField.getName().equals(paramString)) || ((localPivotField.getDisplayName() != null) && (localPivotField.getDisplayName().equals(paramString)))) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotTableCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */