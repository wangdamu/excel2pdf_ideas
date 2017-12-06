package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PivotTable
{
  PivotTableCollection a;
  zbuz b;
  zbtt c;
  zawp d;
  zbva e;
  PivotField f;
  ArrayList g;
  ArrayList h;
  int i;
  int j;
  int k;
  int l;
  int m;
  int n;
  int o;
  int p = -1;
  int q = -1;
  boolean r;
  boolean s;
  boolean t;
  boolean u = true;
  boolean v = true;
  boolean w = false;
  boolean x = false;
  boolean y;
  int z;
  boolean A;
  int B;
  int C = 1;
  boolean D;
  boolean E;
  boolean F = true;
  boolean G = true;
  boolean H = true;
  boolean I = true;
  boolean J = false;
  boolean K = false;
  boolean L = false;
  boolean M;
  boolean N;
  boolean O;
  String P;
  String Q;
  String R = "{962EF5D1-5CA2-4c93-8EF4-DBF5C05439D2}";
  String S;
  int T;
  int U;
  int V;
  String W;
  String X;
  ArrayList Y;
  zbut Z;
  int aa;
  zawo ab;
  zaxk ac = null;
  int[][] ad;
  int[][] ae;
  boolean af = true;
  zbuc ag;
  boolean ah = false;
  PivotFilterCollection ai;
  PivotFormatConditionCollection aj;
  PivotField ak;
  int al = -1;
  private boolean am = true;
  private Object an;
  private boolean ao = true;
  private boolean ap = true;
  private String aq;
  private String ar;
  private zaxb as = null;
  private byte at = 19;
  
  public boolean isExcel2003Compatible()
  {
    return this.am;
  }
  
  public void setExcel2003Compatible(boolean value)
  {
    this.am = value;
  }
  
  void a()
  {
    if (this.as == null) {
      this.as = new zaxb(this);
    }
    this.a.a.getWorkbook().i();
    zaca localzaca = new zaca(this.a.a, 3, new CalculationOptions());
    this.as.c(localzaca);
    localzaca.c();
  }
  
  boolean b()
  {
    return this.Y != null;
  }
  
  private void h()
  {
    this.j = (this.i + 13);
    this.l = ((short)(this.k + 6));
    this.m = (this.n = this.i + 1);
    this.o = (this.k + 1);
  }
  
  private void a(CellArea paramCellArea)
  {
    ArrayList localArrayList1 = (ArrayList)this.b.b.a.clone();
    int i1 = localArrayList1.size();
    PivotFieldCollection localPivotFieldCollection = new PivotFieldCollection(this, this.d);
    ArrayList localArrayList2 = new ArrayList();
    for (int i2 = 0; i2 < localPivotFieldCollection.getCount(); i2++) {
      zf.a(localArrayList2, localPivotFieldCollection.get(i2).getName());
    }
    PivotField localPivotField2;
    for (i2 = 0; i2 < i1; i2++)
    {
      int i3 = 0;
      localPivotField2 = (PivotField)localArrayList1.get(i2);
      PivotField localPivotField4;
      for (int i4 = 0; i4 < localPivotFieldCollection.getCount(); i4++)
      {
        localPivotField4 = localPivotFieldCollection.get(i4);
        if (zy.a(localPivotField4.getName(), localPivotField2.getName()))
        {
          i3 = 1;
          localPivotField4.a(localPivotField2);
          localPivotField4.m = localPivotField2.m;
          localPivotField4.u = localPivotField2.u;
          localArrayList2.remove(localPivotField4.getName());
          break;
        }
      }
      PivotField localPivotField3 = (PivotField)localArrayList1.get(i2);
      if (localPivotField3.isCalculatedField())
      {
        i3 = 1;
        if (localPivotField3.c() != localPivotFieldCollection.getCount()) {
          localPivotField3.a(localPivotFieldCollection.getCount());
        }
        localPivotFieldCollection.a(localPivotField3);
      }
      if ((localPivotField3.getRange() != null) && (localPivotField3.getRange().d != null) && (localPivotField3.getRange().d.size() > 0) && (i3 == 0))
      {
        i3 = 1;
        if (localPivotField3.c() != localPivotFieldCollection.getCount()) {
          localPivotField3.a(localPivotFieldCollection.getCount());
        }
        localPivotFieldCollection.a(localPivotField3);
      }
      if (i3 == 0)
      {
        localPivotField4 = (PivotField)localArrayList1.get(i2);
        b(localPivotField4);
      }
    }
    this.b.b = localPivotFieldCollection;
    PivotField localPivotField1;
    for (i2 = 0; i2 < this.b.d.a.size(); i2++)
    {
      localPivotField1 = (PivotField)this.b.d.a.get(i2);
      localPivotField2 = this.b.b.get(localPivotField1.getName());
      if ((localPivotField1.c() != -2) && (localPivotField2 != null)) {
        localPivotField1.a(localPivotField2.c());
      }
    }
    for (i2 = 0; i2 < this.b.e.a.size(); i2++)
    {
      localPivotField1 = (PivotField)this.b.e.a.get(i2);
      localPivotField2 = this.b.b.get(localPivotField1.getName());
      if ((localPivotField1.c() != -2) && (localPivotField2 != null)) {
        localPivotField1.a(localPivotField2.c());
      }
    }
    for (i2 = 0; i2 < this.b.c.a.size(); i2++)
    {
      localPivotField1 = (PivotField)this.b.c.a.get(i2);
      localPivotField2 = this.b.b.get(localPivotField1.getName());
      if (localPivotField2 != null) {
        localPivotField1.setBaseIndex(localPivotField2.c());
      }
    }
    for (i2 = 0; i2 < this.b.f.a.size(); i2++)
    {
      localPivotField1 = (PivotField)this.b.f.a.get(i2);
      localPivotField2 = this.b.b.get(localPivotField1.getName());
      if (localPivotField2 != null) {
        localPivotField1.a(localPivotField2.c());
      }
    }
  }
  
  private static int a(ArrayList paramArrayList)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      Object localObject = paramArrayList.get(i1);
      if (localObject != null)
      {
        PivotItem localPivotItem = (PivotItem)localObject;
        if ((localPivotItem.getValue() == null) && (!localPivotItem.c())) {
          return i1;
        }
      }
    }
    return -1;
  }
  
  private void i()
  {
    if (this.d != null) {
      for (int i1 = 0; i1 < this.d.i.size(); i1++)
      {
        Object localObject1 = null;
        int i2 = 0;
        PivotField localPivotField = getBaseFields().get(i1);
        if (this.ag.getCount() > 0) {
          localPivotField.a = ((ArrayList)localPivotField.getPivotItems().b.clone());
        }
        if (!localPivotField.isCalculatedField())
        {
          int i5;
          Object localObject2;
          int i7;
          if ((localPivotField.getRange() != null) && (localPivotField.getRange().k != -1))
          {
            zbtv localzbtv1 = (zbtv)this.d.i.get(i1);
            zbtv localzbtv2 = (zbtv)this.d.i.get(localPivotField.getRange().k);
            if ((localzbtv1.o) && (localzbtv2.c.size() == 1) && (((zbos)localzbtv2.c.get(0)).a == null))
            {
              this.d.i.remove(localzbtv1);
              b(localPivotField);
              i1--;
            }
            else if ((localzbtv2.c.size() == 1) && (((zbos)localzbtv2.c.get(0)).a == null))
            {
              localPivotField.a();
              localPivotField.e();
              localPivotField.b();
              localzbtv2.j = null;
              localPivotField.h = ((zbtv)this.d.i.get(i1));
            }
            else if ((localPivotField.getRange().n != null) && (localzbtv2.c.size() != localPivotField.getRange().n.size()))
            {
              i5 = localzbtv2.c.size();
              int i6 = -1;
              localObject2 = localPivotField.getRange().n;
              localPivotField.getRange().n = new ArrayList();
              for (i7 = 0; i7 < ((ArrayList)localObject2).size(); i7++)
              {
                i6 = (((ArrayList)localObject2).get(i7) instanceof Integer) ? ((Integer)((ArrayList)localObject2).get(i7)).intValue() : zauj.F((String)((ArrayList)localObject2).get(i7));
                if ((i6 < i5) && (!localPivotField.getRange().n.contains(Integer.valueOf(i6)))) {
                  zf.a(localPivotField.getRange().n, Integer.valueOf(i6));
                }
              }
              if (i5 > localPivotField.getRange().n.size()) {
                for (i7 = 0; i7 < ((ArrayList)localObject2).size(); i7++)
                {
                  i6 = (((ArrayList)localObject2).get(i7) instanceof Integer) ? ((Integer)((ArrayList)localObject2).get(i7)).intValue() : zauj.F((String)((ArrayList)localObject2).get(i7));
                  if ((i6 < i5) && (localPivotField.getRange().n.contains(Integer.valueOf(i6))))
                  {
                    zf.a(localPivotField.getRange().n, Integer.valueOf(i6));
                    if (i5 == localPivotField.getRange().n.size()) {
                      break;
                    }
                  }
                }
              }
            }
          }
          else
          {
            int i3 = 0;
            int i4 = -1;
            i5 = 0;
            if (localPivotField.m == 4)
            {
              i3 = localPivotField.getCurrentPageItem();
              if ((i3 >= 0) && (i3 < localPivotField.getPivotItems().getCount()))
              {
                localObject1 = localPivotField.getPivotItems().get(i3).getValue();
                i2 = 1;
              }
            }
            localPivotField.f();
            ArrayList localArrayList = (ArrayList)localPivotField.getPivotItems().b.clone();
            localPivotField.h = ((zbtv)this.d.i.get(i1));
            if ((localPivotField.e != null) && (localPivotField.e.getCount() > 0))
            {
              localObject2 = new HashMap();
              if (localPivotField.h.c != null)
              {
                i7 = localPivotField.h.c.size();
                for (int i8 = 0; i8 < i7; i8++)
                {
                  Object localObject4 = ((zbos)localPivotField.h.c.get(i8)).a;
                  if (localObject4 != null) {
                    ((HashMap)localObject2).put(localObject4, Integer.valueOf(i8));
                  } else {
                    i4 = i8;
                  }
                }
                localPivotField.e.a();
                Object localObject3;
                Object localObject5;
                if (((HashMap)localObject2).size() > 0)
                {
                  localObject3 = new ArrayList();
                  boolean bool = a(localPivotField, localArrayList, (HashMap)localObject2, i4);
                  localObject5 = new HashMap();
                  int i11 = -1;
                  int i13 = localArrayList.size();
                  for (int i14 = 0; i14 < i13; i14++)
                  {
                    localObject6 = (PivotItem)localArrayList.get(i14);
                    if (((PivotItem)localObject6).i == null) {
                      i11 = i14;
                    } else if (!((HashMap)localObject5).containsKey(((PivotItem)localObject6).i)) {
                      ((HashMap)localObject5).put(((PivotItem)localObject6).i, Integer.valueOf(i14));
                    }
                  }
                  HashMap localHashMap = zg.b((HashMap)localObject2);
                  Object localObject6 = new ArrayList(((HashMap)localObject2).values());
                  if (getFieldListSortAscending()) {
                    Collections.sort((List)localObject6);
                  }
                  Iterator localIterator = ((Iterable)localObject6).iterator();
                  while (localIterator.hasNext())
                  {
                    int i15 = ((Integer)localIterator.next()).intValue();
                    com.aspose.cells.b.a.a.zc localzc = zg.a((HashMap)localObject2);
                    while (localzc.c()) {
                      if (((Integer)localzc.b()).intValue() == i15)
                      {
                        ((HashMap)localObject2).remove(localzc.a());
                        if (localPivotField.e.getCount() < i7)
                        {
                          PivotItem localPivotItem3 = new PivotItem(localPivotField.e);
                          if ((localPivotField.m == 4) && (localPivotField.isMultipleItemSelectionAllowed())) {
                            localPivotItem3.setHidden(true);
                          }
                          localPivotField.e.a(localPivotItem3);
                          int i16 = -1;
                          if (bool) {
                            i16 = localPivotField.e.getCount() - 1;
                          } else {
                            i16 = a(localPivotField, localArrayList, (ArrayList)localObject3, localHashMap, i4);
                          }
                          if (i4 == -1)
                          {
                            localPivotItem3.setIndex(i16);
                          }
                          else if ((localPivotField.e.getCount() == i4 + 1) && (i5 == 0))
                          {
                            localPivotItem3.setIndex(i16);
                            PivotItem localPivotItem4 = new PivotItem(localPivotField.e);
                            if ((localPivotField.m == 4) && (localPivotField.isMultipleItemSelectionAllowed())) {
                              localPivotItem4.setHidden(true);
                            }
                            localPivotField.e.a(localPivotItem4);
                            if (bool) {
                              i16 = localPivotField.e.getCount() - 1;
                            } else {
                              i16 = a(localPivotField, localArrayList, (ArrayList)localObject3, localHashMap, i4);
                            }
                            localPivotItem4.setIndex(i16);
                            i5 = 1;
                            a(localArrayList, localPivotItem4, (HashMap)localObject5, i11);
                          }
                          else
                          {
                            localPivotItem3.setIndex(i16);
                            int i17 = localPivotField.e.getCount() - 1;
                            if ((i5 == 0) && (i17 < localArrayList.size()) && (((PivotItem)localArrayList.get(i17)).i == null))
                            {
                              PivotItem localPivotItem5 = new PivotItem(localPivotField.e);
                              if ((localPivotField.m == 4) && (localPivotField.isMultipleItemSelectionAllowed())) {
                                localPivotItem5.setHidden(true);
                              }
                              if ((i17 == 0) && (localPivotField.e.get(0).getValue() != null)) {
                                localPivotField.e.b.add(0, localPivotItem5);
                              } else {
                                localPivotField.e.a(localPivotItem5);
                              }
                              if (bool) {
                                i16 = localPivotField.e.getCount() - 1;
                              } else {
                                i16 = a(localPivotField, localArrayList, (ArrayList)localObject3, localHashMap, i4);
                              }
                              localPivotItem5.setIndex(i16);
                              i5 = 1;
                              a(localArrayList, localPivotItem5, (HashMap)localObject5, i11);
                            }
                          }
                          a(localArrayList, localPivotItem3, (HashMap)localObject5, i11);
                        }
                      }
                    }
                  }
                }
                if ((localPivotField.h.u()) && (i5 == 0) && (i4 < i7))
                {
                  localObject3 = new PivotItem(localPivotField.e);
                  ((PivotItem)localObject3).setIndex(i4);
                  int i9 = a(localArrayList);
                  if ((i9 != -1) && (i9 < localPivotField.e.getCount())) {
                    localPivotField.e.b.add(i9, localObject3);
                  } else {
                    localPivotField.e.a((PivotItem)localObject3);
                  }
                  localObject5 = localArrayList.iterator();
                  while (((Iterator)localObject5).hasNext())
                  {
                    PivotItem localPivotItem1 = (PivotItem)((Iterator)localObject5).next();
                    if (localPivotItem1.getValue() == null)
                    {
                      ((PivotItem)localObject3).c = localPivotItem1.c;
                      ((PivotItem)localObject3).d = localPivotItem1.d;
                    }
                  }
                }
                if ((localPivotField.e.getCount() == 1) && (localPivotField.e.get(0).isHidden())) {
                  localPivotField.e.get(0).setHidden(false);
                }
                if (i2 != 0)
                {
                  double d1 = 0.0D;
                  int i10 = 0;
                  for (int i12 = 0; i12 < localPivotField.e.getCount(); i12++)
                  {
                    PivotItem localPivotItem2 = localPivotField.e.get(i12);
                    if ((localObject1 instanceof Double))
                    {
                      if ((localPivotItem2.getValue() instanceof Integer)) {
                        d1 = ((Integer)localPivotItem2.getValue()).intValue();
                      }
                      i10 = localObject1.equals(Double.valueOf(d1)) ? 1 : 0;
                    }
                    if (((localObject1 != null) && ((i10 != 0) || (localObject1.equals(localPivotItem2.getValue())))) || ((localObject1 == null) && (localPivotItem2.getValue() == null)))
                    {
                      localPivotField.setCurrentPageItem((short)i12);
                      break;
                    }
                    if ((localObject1 == null) && (localPivotItem2.getValue() != null))
                    {
                      localPivotField.setCurrentPageItem((short)32765);
                      break;
                    }
                  }
                  if (localPivotField.getCurrentPageItem() >= localPivotField.e.getCount()) {
                    localPivotField.setCurrentPageItem((short)32765);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void a(ArrayList paramArrayList, PivotItem paramPivotItem, HashMap paramHashMap, int paramInt)
  {
    PivotItem localPivotItem = null;
    if (paramPivotItem.getValue() == null)
    {
      if (paramInt != -1) {
        localPivotItem = (PivotItem)paramArrayList.get(paramInt);
      }
    }
    else if (paramHashMap.containsKey(paramPivotItem.getValue()))
    {
      int i1 = ((Integer)paramHashMap.get(paramPivotItem.getValue())).intValue();
      localPivotItem = (PivotItem)paramArrayList.get(i1);
    }
    if (localPivotItem != null)
    {
      paramPivotItem.c = localPivotItem.c;
      paramPivotItem.d = localPivotItem.d;
    }
  }
  
  private boolean a(PivotField paramPivotField, ArrayList paramArrayList, HashMap paramHashMap, int paramInt)
  {
    if (!paramPivotField.isAutoSort())
    {
      boolean bool1 = false;
      boolean bool2 = paramInt != -1;
      for (int i1 = 0; i1 < paramArrayList.size(); i1++)
      {
        boolean bool3 = false;
        PivotItem localPivotItem = (PivotItem)paramArrayList.get(i1);
        if (localPivotItem.c()) {
          bool1 = true;
        }
        if (localPivotItem.i == null) {
          bool3 = bool2;
        } else {
          bool3 = paramHashMap.containsKey(localPivotItem.i);
        }
        if (!bool3)
        {
          paramArrayList.remove(i1);
          i1--;
        }
      }
      return bool1;
    }
    return false;
  }
  
  private int a(PivotField paramPivotField, ArrayList paramArrayList1, ArrayList paramArrayList2, HashMap paramHashMap, int paramInt)
  {
    int i1 = paramPivotField.e.getCount() - 1;
    if (!paramPivotField.isAutoSort())
    {
      ArrayList localArrayList = paramPivotField.h.c;
      int i2 = localArrayList.size();
      if (i1 < paramArrayList1.size())
      {
        PivotItem localPivotItem = (PivotItem)paramArrayList1.get(i1);
        if (localPivotItem.i == null)
        {
          if (paramInt != -1)
          {
            i1 = paramInt;
            zf.a(paramArrayList2, Integer.valueOf(i1));
          }
        }
        else if (paramHashMap.containsKey(localPivotItem.i))
        {
          i1 = ((Integer)paramHashMap.get(localPivotItem.i)).intValue();
          zf.a(paramArrayList2, Integer.valueOf(i1));
        }
      }
      else
      {
        for (int i3 = 0; i3 < i2; i3++) {
          if (!paramArrayList2.contains(Integer.valueOf(i3)))
          {
            i1 = i3;
            zf.a(paramArrayList2, Integer.valueOf(i1));
            break;
          }
        }
      }
    }
    return i1;
  }
  
  PivotTable(PivotTableCollection pivotTables)
  {
    this.a = pivotTables;
    this.s = true;
    this.e = new zbva(this);
    this.b = new zbuz(this);
    this.c = new zbtt(this);
    this.Z = new zbut();
    this.ab = new zawo();
    this.D = true;
    this.E = true;
    this.ag = new zbuc(this);
    this.ai = new PivotFilterCollection(this);
  }
  
  PivotTable(PivotTableCollection pivotTables, zawp pivotCache, int row, short column, String tableName)
  {
    this.a = pivotTables;
    this.i = row;
    this.k = column;
    h();
    this.s = true;
    this.D = true;
    this.E = true;
    this.e = new zbva(this);
    this.d = pivotCache;
    this.b = new zbuz(this, tableName);
    this.c = new zbtt(this);
    this.Z = new zbut(tableName);
    this.ab = new zawo();
    this.ab.a(this);
    this.ag = new zbuc(this);
    this.ai = new PivotFilterCollection(this);
    if (pivotCache.a() == 4)
    {
      addFieldToArea(1, 0);
      addFieldToArea(2, 1);
      addFieldToArea(8, 2);
      for (int i1 = 3; i1 < getBaseFields().getCount(); i1++) {
        addFieldToArea(4, i1);
      }
    }
  }
  
  ArrayList a(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = this.g.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int[] arrayOfInt = (int[])this.g.get(i2);
      if (arrayOfInt[0] == paramInt) {
        zf.a(localArrayList, Integer.valueOf(i2 + this.n));
      }
    }
    return localArrayList;
  }
  
  int a(PivotField paramPivotField)
  {
    int i1;
    int i2;
    if (paramPivotField.m == 2)
    {
      i1 = getColumnFields().getCount();
      for (i2 = 0; i2 < i1; i2++) {
        if (a(getColumnFields().get(i2), paramPivotField)) {
          return i2 + this.i + 1;
        }
      }
    }
    else if (paramPivotField.m == 1)
    {
      i1 = getRowFields().getCount();
      for (i2 = 0; i2 < i1; i2++) {
        if (a(getRowFields().get(i2), paramPivotField)) {
          return i2;
        }
      }
    }
    else
    {
      i1 = getDataFields().getCount();
      for (i2 = 0; i2 < i1; i2++) {
        if (a(getDataFields().get(i2), paramPivotField)) {
          return i2;
        }
      }
    }
    return -1;
  }
  
  private boolean a(PivotField paramPivotField1, PivotField paramPivotField2)
  {
    int i1 = (paramPivotField1.getName() != null) && (paramPivotField2.getName() != null) && (zy.a(paramPivotField1.getName(), paramPivotField2.getName())) ? 1 : 0;
    int i2 = (paramPivotField1.getDisplayName() != null) && (paramPivotField2.getDisplayName() != null) && (zy.a(paramPivotField1.getDisplayName(), paramPivotField2.getDisplayName())) ? 1 : 0;
    return (i1 != 0) || (i2 != 0);
  }
  
  ArrayList a(zabi paramzabi, boolean paramBoolean, zaca paramzaca, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    CellArea localCellArea = new CellArea();
    if (paramBoolean)
    {
      localCellArea = getColumnRange();
    }
    else
    {
      localCellArea = getRowRange();
      localCellArea.StartColumn += paramInt;
      localCellArea.EndColumn = localCellArea.StartColumn;
    }
    Object localObject;
    if (localCellArea.e()) {
      localObject = new zif(this.a.a.getCells(), localCellArea.StartRow, localCellArea.EndRow, localCellArea.StartColumn, true, 5, false);
    } else {
      localObject = new zie(this.a.a.getCells(), localCellArea, true, 5);
    }
    while (((zahe)localObject).hasNext())
    {
      zgs localzgs = ((zahe)localObject).e();
      paramzabi.c(zabt.a(localzgs.c, localzgs.d));
      zaie localzaie = paramzabi.d(paramzaca);
      if ((localzaie.b() == 1) && (((zaba)localzaie).o())) {
        zf.a(localArrayList, new int[] { ((zahe)localObject).c().i(), localzgs.a });
      }
    }
    return localArrayList;
  }
  
  int b(int paramInt)
  {
    for (int i1 = 0; i1 < this.g.size(); i1++)
    {
      zbug localzbug = new zbug((int[])this.g.get(i1));
      if ((localzbug.b()) && (localzbug.d() == paramInt)) {
        return i1;
      }
    }
    return 0;
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = (int[])this.g.get(paramInt1 - this.n);
    int i1 = arrayOfInt[0];
    ArrayList localArrayList = new ArrayList();
    int i2 = this.g.size();
    for (int i3 = 0; i3 < i2; i3++)
    {
      zbug localzbug = new zbug((int[])this.g.get(i3));
      int i4 = 0;
      for (int i5 = 0; i5 <= paramInt2; i5++) {
        if (arrayOfInt[(4 + i5)] != localzbug.f[i5])
        {
          i4 = 1;
          break;
        }
      }
      if ((i4 == 0) && ((localzbug.a()) || (localzbug.e == paramInt2 + 1)))
      {
        for (i5 = paramInt2 + 1; i5 < localzbug.f.length; i5++) {
          if (localzbug.f[i5] != 32767)
          {
            i4 = 1;
            break;
          }
        }
        if (i4 == 0) {
          return i3 + this.n;
        }
      }
    }
    return 0;
  }
  
  TableStyle c()
  {
    if (this.an == null) {
      return this.a.a.c().getTableStyles().a(0);
    }
    if ((this.an instanceof String)) {
      return this.a.a.c().getTableStyles().get((String)this.an);
    }
    if ((this.an instanceof Integer)) {
      return this.a.a.c().getTableStyles().a(((Integer)this.an).intValue());
    }
    if ((this.an instanceof TableStyle)) {
      return (TableStyle)this.an;
    }
    return this.a.a.c().getTableStyles().a(37);
  }
  
  public String getPivotTableStyleName()
  {
    if (this.an == null) {
      return null;
    }
    if ((this.an instanceof String)) {
      return (String)this.an;
    }
    if ((this.an instanceof TableStyle)) {
      return ((TableStyle)this.an).getName();
    }
    return zaxj.h(((Integer)this.an).intValue());
  }
  
  public void setPivotTableStyleName(String value)
  {
    this.af = true;
    int i1 = zaxj.d(value);
    if ((i1 != 85) && (i1 != 0)) {
      this.an = Integer.valueOf(i1);
    } else {
      this.an = value;
    }
  }
  
  public int getPivotTableStyleType()
  {
    if (this.an == null) {
      return 0;
    }
    if ((this.an instanceof String)) {
      return 85;
    }
    if ((this.an instanceof TableStyle)) {
      return zaxj.d(((TableStyle)this.an).getName());
    }
    return ((Integer)this.an).intValue();
  }
  
  public void setPivotTableStyleType(int value)
  {
    this.af = true;
    this.an = Integer.valueOf(value);
  }
  
  public void copyStyle(PivotTable pivotTable)
  {
    CopyOptions localCopyOptions = new CopyOptions(1, pivotTable.a.a, this.a.a);
    b(pivotTable, localCopyOptions);
  }
  
  private void b(PivotTable paramPivotTable, CopyOptions paramCopyOptions)
  {
    Worksheet localWorksheet = this.a.a;
    this.e = new zbva(this);
    this.e.a(paramPivotTable.e);
    if ((paramPivotTable.ag != null) && (paramPivotTable.ag.getCount() != 0))
    {
      this.ag = new zbuc(this);
      this.ag.a(paramPivotTable.ag);
    }
    if ((paramPivotTable.aj != null) && (paramPivotTable.aj.getCount() != 0))
    {
      this.aj = new PivotFormatConditionCollection(this, localWorksheet);
      this.aj.a(paramPivotTable.aj);
    }
    setPivotTableStyleName(paramPivotTable.getPivotTableStyleName());
    if (getPivotTableStyleName() != null)
    {
      int i1 = zaxj.d(getPivotTableStyleName());
      if ((i1 == 85) && (i1 != 0))
      {
        setPivotTableStyleName(paramPivotTable.getPivotTableStyleName());
        WorksheetCollection localWorksheetCollection1 = paramPivotTable.a.a.d().getWorksheets();
        WorksheetCollection localWorksheetCollection2 = localWorksheet.c();
        if ((localWorksheetCollection1.getTableStyles().get(paramPivotTable.c().getName()) != null) && (localWorksheetCollection2.getTableStyles().get(paramPivotTable.c().getName()) == null))
        {
          int i2 = localWorksheetCollection2.getTableStyles().c(paramPivotTable.c().getName());
          TableStyle localTableStyle = localWorksheetCollection2.getTableStyles().get(i2);
          localTableStyle.a(paramPivotTable.c(), paramCopyOptions);
          setPivotTableStyleName(localTableStyle.getName());
          this.an = localTableStyle;
        }
      }
    }
  }
  
  void a(PivotTable paramPivotTable, CopyOptions paramCopyOptions)
  {
    Object localObject2;
    Object localObject3;
    if (paramPivotTable.Y != null)
    {
      this.Y = new ArrayList();
      localObject1 = paramPivotTable.Y.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (byte[])((Iterator)localObject1).next();
        localObject3 = new byte[localObject2.length];
        System.arraycopy(localObject2, 0, localObject3, 0, localObject3.length);
        zf.a(this.Y, localObject3);
      }
      return;
    }
    if (this.s)
    {
      if (paramPivotTable.g != null)
      {
        this.g = new ArrayList(paramPivotTable.g.size());
        localObject1 = paramPivotTable.g.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (int[])((Iterator)localObject1).next();
          localObject3 = new int[localObject2.length];
          System.arraycopy(localObject2, 0, localObject3, 0, localObject3.length);
          zf.a(this.g, localObject3);
        }
      }
      if (paramPivotTable.h != null)
      {
        this.h = new ArrayList(paramPivotTable.h.size());
        localObject1 = paramPivotTable.h.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (int[])((Iterator)localObject1).next();
          localObject3 = new int[localObject2.length];
          System.arraycopy(localObject2, 0, localObject3, 0, localObject3.length);
          zf.a(this.h, localObject3);
        }
      }
    }
    Object localObject1 = this.a.a;
    if ((paramPivotTable.ai != null) && (paramPivotTable.ai.getCount() != 0))
    {
      this.ai = new PivotFilterCollection(this);
      this.ai.a(paramPivotTable.ai);
    }
    b(paramPivotTable, paramCopyOptions);
    this.C = paramPivotTable.C;
    this.u = paramPivotTable.u;
    this.v = paramPivotTable.v;
    this.w = paramPivotTable.w;
    this.x = paramPivotTable.x;
    this.K = paramPivotTable.K;
    this.L = paramPivotTable.L;
    this.J = paramPivotTable.J;
    this.I = paramPivotTable.I;
    this.D = paramPivotTable.D;
    this.ar = paramPivotTable.getRowHeaderCaption();
    this.aq = paramPivotTable.getColumnHeaderCaption();
    setShowPivotStyleRowHeader(paramPivotTable.getShowPivotStyleRowHeader());
    setShowPivotStyleColumnHeader(paramPivotTable.getShowPivotStyleColumnHeader());
    setShowPivotStyleRowStripes(paramPivotTable.getShowPivotStyleRowStripes());
    setShowPivotStyleColumnStripes(paramPivotTable.getShowPivotStyleColumnStripes());
    setShowPivotStyleLastColumn(paramPivotTable.getShowPivotStyleLastColumn());
    this.aa = paramPivotTable.aa;
    this.F = paramPivotTable.F;
    this.H = paramPivotTable.getShowMemberPropertyTips();
    this.d = ((Worksheet)localObject1).c().W().a(paramPivotTable.d, (Worksheet)localObject1, paramCopyOptions);
    this.b = new zbuz(this, paramPivotTable.getName());
    this.b.a(paramPivotTable.b.b.getCount());
    if (getBaseFields().getCount() > 0) {
      this.b.a(paramPivotTable.b);
    }
    this.c = new zbtt(this);
    this.c.a(paramPivotTable.c);
    this.Z = new zbut();
    this.Z.a(paramPivotTable.Z);
    this.ab.a(paramPivotTable.ab);
    this.s = paramPivotTable.s;
    this.as = null;
    this.i = paramPivotTable.i;
    this.k = paramPivotTable.k;
    setPageFieldWrapCount(paramPivotTable.getPageFieldWrapCount());
    this.p = paramPivotTable.p;
    this.q = paramPivotTable.q;
    this.j = paramPivotTable.j;
    this.l = paramPivotTable.l;
    this.o = paramPivotTable.o;
    this.n = paramPivotTable.n;
    this.m = paramPivotTable.m;
    this.t = paramPivotTable.t;
  }
  
  void d()
  {
    this.s = true;
    zaxb localzaxb = new zaxb(this);
    if ((this.d != null) && (this.d.h != null))
    {
      zaca localzaca = new zaca(this.a.a, 3, new CalculationOptions());
      localzaxb.b(localzaca);
      localzaca.c();
    }
  }
  
  private void b(PivotField paramPivotField)
  {
    this.as = null;
    this.b.b.a.remove(paramPivotField);
    switch (paramPivotField.m)
    {
    case 1: 
      this.b.d.a.remove(paramPivotField);
      break;
    case 2: 
      this.b.e.a.remove(paramPivotField);
      break;
    case 8: 
      this.b.c.a.remove(paramPivotField);
      break;
    case 4: 
      this.b.f.a.remove(paramPivotField);
      break;
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      if (paramPivotField.h()) {
        this.b.c.a.remove(this.b.c.get(paramPivotField.getName()));
      }
      break;
    }
  }
  
  public void removeField(int fieldType, String fieldName)
  {
    if ((getDataField() != null) && (zw.b(fieldName, getDataField().getName())))
    {
      removeField(fieldType, getDataField());
      return;
    }
    for (int i1 = 0; i1 < getBaseFields().getCount(); i1++) {
      if (zw.b(getBaseFields().get(i1).getName(), fieldName))
      {
        removeField(fieldType, getBaseFields().get(i1));
        break;
      }
    }
  }
  
  public void removeField(int fieldType, int baseFieldIndex)
  {
    removeField(fieldType, getBaseFields().get(baseFieldIndex));
  }
  
  public void removeField(int fieldType, PivotField pivotField)
  {
    this.as = null;
    if (null == pivotField) {
      return;
    }
    if (fieldType != 0)
    {
      if ((pivotField.isCalculatedField()) && (fieldType != 8)) {
        throw new IllegalArgumentException("You could not del calculated field.");
      }
      fields(fieldType).c(pivotField);
    }
  }
  
  public int addFieldToArea(int fieldType, String fieldName)
  {
    for (int i1 = 0; i1 < getBaseFields().getCount(); i1++) {
      if (zw.b(getBaseFields().get(i1).getName(), fieldName)) {
        return addFieldToArea(fieldType, getBaseFields().get(i1));
      }
    }
    return -1;
  }
  
  public int addFieldToArea(int fieldType, int baseFieldIndex)
  {
    return addFieldToArea(fieldType, getBaseFields().get(baseFieldIndex));
  }
  
  public int addFieldToArea(int fieldType, PivotField pivotField)
  {
    this.as = null;
    if (fieldType != 0)
    {
      if ((pivotField.isCalculatedField()) && (fieldType != 8)) {
        throw new IllegalArgumentException("You could not drag calculated field to this area.");
      }
      return fields(fieldType).add(pivotField);
    }
    return -1;
  }
  
  public void addCalculatedField(String name, String formula, boolean dragToDataArea)
  {
    this.as = null;
    this.d.a(name, formula);
    if (dragToDataArea) {
      if (this.d.A >= 0) {
        addFieldToArea(8, this.d.A);
      } else {
        addFieldToArea(8, this.b.b.getCount() - 1);
      }
    }
  }
  
  public void addCalculatedField(String name, String formula)
  {
    addCalculatedField(name, formula, true);
  }
  
  public PivotFieldCollection fields(int fieldType)
  {
    switch (fieldType)
    {
    case 2: 
      return getColumnFields();
    case 8: 
      return getDataFields();
    case 4: 
      return getPageFields();
    case 1: 
      return getRowFields();
    case 0: 
      return getBaseFields();
    }
    throw new IllegalArgumentException("Invalid pivot field type");
  }
  
  public PivotFieldCollection getColumnFields()
  {
    return this.b.e;
  }
  
  public PivotFieldCollection getRowFields()
  {
    return this.b.d;
  }
  
  public PivotFieldCollection getPageFields()
  {
    return this.b.f;
  }
  
  public PivotFieldCollection getDataFields()
  {
    return this.b.c;
  }
  
  public PivotField getDataField()
  {
    return this.f;
  }
  
  public PivotFieldCollection getBaseFields()
  {
    return this.b.b;
  }
  
  public PivotFilterCollection getPivotFilters()
  {
    return this.ai;
  }
  
  int e()
  {
    return this.g == null ? 0 : this.g.size();
  }
  
  int f()
  {
    return this.h == null ? 0 : this.h.size();
  }
  
  public CellArea getColumnRange()
  {
    if (!this.s) {
      d();
    }
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = this.i;
    localCellArea.EndRow = (this.n - 1);
    localCellArea.StartColumn = this.o;
    if (getColumnFields().getCount() == 0) {
      localCellArea.EndColumn = this.o;
    } else {
      localCellArea.EndColumn = this.l;
    }
    return localCellArea;
  }
  
  public CellArea getRowRange()
  {
    if (!this.s) {
      d();
    }
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = this.n;
    if (getRowFields().getCount() == 0) {
      localCellArea.EndRow = this.n;
    } else {
      localCellArea.EndRow = this.j;
    }
    localCellArea.StartColumn = this.k;
    if (getRowFields().getCount() == 0) {
      localCellArea.EndColumn = this.o;
    } else {
      localCellArea.EndColumn = (this.o - 1);
    }
    return localCellArea;
  }
  
  public CellArea getDataBodyRange()
  {
    CellArea localCellArea1 = getColumnRange();
    CellArea localCellArea2 = getRowRange();
    CellArea localCellArea3 = new CellArea();
    localCellArea3.StartRow = (localCellArea1.EndRow + 1);
    localCellArea3.StartColumn = localCellArea1.StartColumn;
    localCellArea3.EndRow = localCellArea2.EndRow;
    localCellArea3.EndColumn = localCellArea1.EndColumn;
    return localCellArea3;
  }
  
  public CellArea getTableRange1()
  {
    CellArea localCellArea = new CellArea();
    Object localObject;
    if (b())
    {
      localObject = (byte[])this.Y.get(0);
      localCellArea.StartRow = (com.aspose.cells.b.a.zc.e((byte[])localObject, 4) & 0xFFFF);
      localCellArea.EndRow = (com.aspose.cells.b.a.zc.e((byte[])localObject, 6) & 0xFFFF);
      localCellArea.StartColumn = (com.aspose.cells.b.a.zc.e((byte[])localObject, 8) & 0xFFFF);
      localCellArea.EndColumn = (com.aspose.cells.b.a.zc.e((byte[])localObject, 12) & 0xFFFF);
      return localCellArea;
    }
    if ((getRefreshDataFlag()) && (this.d.h != null))
    {
      if (this.as == null) {
        this.as = new zaxb(this);
      }
      localObject = new zaca(this.a.a, 3, new CalculationOptions());
      this.as.b((zaca)localObject);
      ((zaca)localObject).c();
    }
    localCellArea.StartRow = this.i;
    localCellArea.StartColumn = this.k;
    localCellArea.EndRow = this.j;
    localCellArea.EndColumn = this.l;
    return localCellArea;
  }
  
  public CellArea getTableRange2()
  {
    int i1 = this.b.f.getCount() == 0 ? 2 : this.b.f.getCount() + 1;
    int i2 = this.i - i1;
    i2 = i2 > 0 ? i2 : 0;
    CellArea localCellArea = getTableRange1();
    localCellArea.StartRow = i2;
    return localCellArea;
  }
  
  public void move(int row, int column)
  {
    zamm.a(row);
    zamm.b(column);
    int i1 = row - this.i;
    int i2 = (short)(column - this.k);
    this.i = row;
    this.k = ((short)column);
    this.n += i1;
    this.m += i1;
    this.o += i2;
    this.l += i2;
    this.j += i1;
  }
  
  public void move(String destCellName)
  {
    int i1 = 0;
    int i2 = 0;
    int[] arrayOfInt1 = { i1 };
    int[] arrayOfInt2 = { i2 };
    CellsHelper.a(destCellName, arrayOfInt1, arrayOfInt2);
    i1 = arrayOfInt1[0];
    i2 = arrayOfInt2[0];
    move(i1, i2);
  }
  
  public boolean getColumnGrand()
  {
    return this.b.b(1);
  }
  
  public void setColumnGrand(boolean value)
  {
    this.b.a(value, 1);
  }
  
  public boolean isGridDropZones()
  {
    return this.t;
  }
  
  public void setGridDropZones(boolean value)
  {
    this.as = null;
    this.t = value;
    if (value)
    {
      this.u = false;
      this.v = false;
    }
  }
  
  public boolean getRowGrand()
  {
    return this.b.b(2);
  }
  
  public void setRowGrand(boolean value)
  {
    this.b.a(value, 2);
  }
  
  public boolean getDisplayNullString()
  {
    return this.c.a(64);
  }
  
  public void setDisplayNullString(boolean value)
  {
    this.c.a(value, 64);
  }
  
  public String getNullString()
  {
    if (this.c.c == null) {
      return "";
    }
    return this.c.c;
  }
  
  public void setNullString(String value)
  {
    this.c.c = value;
  }
  
  public boolean getDisplayErrorString()
  {
    return this.c.a(32);
  }
  
  public void setDisplayErrorString(boolean value)
  {
    this.c.a(value, 32);
  }
  
  public String getErrorString()
  {
    if (this.c.b == null) {
      return "";
    }
    return this.c.b;
  }
  
  public void setErrorString(String value)
  {
    this.c.b = value;
  }
  
  public boolean isAutoFormat()
  {
    return this.b.b(8);
  }
  
  public void setAutoFormat(boolean value)
  {
    this.b.a(value, 8);
    if (!value) {
      setAutoFormatType(1);
    }
  }
  
  public int getAutoFormatType()
  {
    return this.e.a();
  }
  
  public void setAutoFormatType(int value)
  {
    this.as = null;
    this.s = false;
    this.e.c(value);
    for (int i1 = 0; i1 < getBaseFields().getCount(); i1++)
    {
      zbuv localzbuv = getBaseFields().get(i1).d;
      int i2;
      switch (value)
      {
      case 2: 
      case 4: 
      case 10: 
        localzbuv.b = -96;
        if (getRowFields().getCount() > 1) {
          getRowFields().get(0).setInsertBlankRow(true);
        }
        break;
      case 7: 
      case 11: 
        localzbuv.b = -96;
        if (getRowFields().getCount() > 1) {
          for (i2 = 0; i2 < getRowFields().getCount() - 1; i2++) {
            getRowFields().get(i2).setInsertBlankRow(true);
          }
        }
        break;
      case 3: 
      case 9: 
        localzbuv.b = 32;
        if (getRowFields().getCount() > 1) {
          getRowFields().get(0).setInsertBlankRow(true);
        }
        break;
      case 5: 
      case 6: 
      case 8: 
        localzbuv.b = 32;
        if (getRowFields().getCount() > 1) {
          for (i2 = 0; i2 < getRowFields().getCount() - 1; i2++) {
            getRowFields().get(i2).setInsertBlankRow(true);
          }
        }
        break;
      case 12: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      case 18: 
        localzbuv.b = 0;
        if (getRowFields().getCount() > 1) {
          getRowFields().get(0).setInsertBlankRow(true);
        }
        break;
      }
    }
  }
  
  public boolean hasBlankRows()
  {
    return this.ao;
  }
  
  public void setHasBlankRows(boolean value)
  {
    this.ao = value;
    for (int i1 = 0; i1 < getRowFields().getCount(); i1++) {
      getRowFields().get(i1).setInsertBlankRow(value);
    }
  }
  
  public boolean getMergeLabels()
  {
    return this.c.a(16);
  }
  
  public void setMergeLabels(boolean value)
  {
    this.c.a(value, 16);
  }
  
  public boolean getPreserveFormatting()
  {
    return this.c.a(8);
  }
  
  public void setPreserveFormatting(boolean value)
  {
    this.c.a(value, 8);
  }
  
  public boolean getShowDrill()
  {
    return this.I;
  }
  
  public void setShowDrill(boolean value)
  {
    this.I = value;
  }
  
  public boolean getEnableDrilldown()
  {
    return this.c.a(2);
  }
  
  public void setEnableDrilldown(boolean value)
  {
    this.c.a(value, 2);
  }
  
  public boolean getEnableFieldDialog()
  {
    return this.c.a(4);
  }
  
  public void setEnableFieldDialog(boolean value)
  {
    this.c.a(value, 4);
  }
  
  public boolean getEnableFieldList()
  {
    return this.ap;
  }
  
  public void setEnableFieldList(boolean value)
  {
    this.ap = value;
  }
  
  public boolean getEnableWizard()
  {
    return this.c.a(1);
  }
  
  public void setEnableWizard(boolean value)
  {
    this.c.a(value, 1);
  }
  
  public boolean getSubtotalHiddenPageItems()
  {
    return this.c.a(128);
  }
  
  public void setSubtotalHiddenPageItems(boolean value)
  {
    this.c.a(value, 128);
  }
  
  public String getGrandTotalName()
  {
    if (this.e.b == null)
    {
      GlobalizationSettings localGlobalizationSettings = this.a.a.getWorkbook().getSettings().getGlobalizationSettings();
      return localGlobalizationSettings.getPivotGrandTotalName();
    }
    return this.e.b;
  }
  
  public void setGrandTotalName(String value)
  {
    this.e.b = value;
  }
  
  public boolean getManualUpdate()
  {
    return this.c.b(64);
  }
  
  public void setManualUpdate(boolean value)
  {
    this.c.b(value, 64);
  }
  
  public boolean isMultipleFieldFilters()
  {
    return this.F;
  }
  
  public void setMultipleFieldFilters(boolean value)
  {
    this.F = value;
  }
  
  public int getMissingItemsLimit()
  {
    if (this.d != null)
    {
      if (this.d.t > 32500) {
        return 1;
      }
      if (this.d.t == 0) {
        return 2;
      }
      return 0;
    }
    return 0;
  }
  
  public void setMissingItemsLimit(int value)
  {
    if (this.d != null) {
      switch (value)
      {
      case 1: 
        this.d.t = 1048576;
        break;
      case 2: 
        this.d.t = 0;
        break;
      default: 
        this.d.t = -1;
      }
    }
  }
  
  public boolean getEnableDataValueEditing()
  {
    return this.O;
  }
  
  public void setEnableDataValueEditing(boolean value)
  {
    this.O = value;
  }
  
  public boolean getShowDataTips()
  {
    return this.G;
  }
  
  public void setShowDataTips(boolean value)
  {
    this.G = value;
  }
  
  public boolean getShowMemberPropertyTips()
  {
    return this.H;
  }
  
  public void setShowMemberPropertyTips(boolean value)
  {
    this.H = value;
  }
  
  public boolean getShowValuesRow()
  {
    return !this.J;
  }
  
  public void setShowValuesRow(boolean value)
  {
    this.J = (!value);
  }
  
  public boolean getShowEmptyCol()
  {
    return this.K;
  }
  
  public void setShowEmptyCol(boolean value)
  {
    this.K = value;
  }
  
  public boolean getShowEmptyRow()
  {
    return this.L;
  }
  
  public void setShowEmptyRow(boolean value)
  {
    this.L = value;
  }
  
  public boolean getFieldListSortAscending()
  {
    return this.M;
  }
  
  public void setFieldListSortAscending(boolean value)
  {
    this.M = value;
  }
  
  public boolean getPrintDrill()
  {
    return this.N;
  }
  
  public void setPrintDrill(boolean value)
  {
    this.N = value;
  }
  
  public String getAltTextTitle()
  {
    return this.P;
  }
  
  public void setAltTextTitle(String value)
  {
    this.P = value;
  }
  
  public String getAltTextDescription()
  {
    return this.Q;
  }
  
  public void setAltTextDescription(String value)
  {
    this.Q = value;
  }
  
  public String getName()
  {
    return this.b.g;
  }
  
  public void setName(String value)
  {
    this.b.g = value;
  }
  
  public String getColumnHeaderCaption()
  {
    return this.aq;
  }
  
  public void setColumnHeaderCaption(String value)
  {
    this.aq = value;
  }
  
  public int getIndent()
  {
    if (this.C == 127) {
      return 0;
    }
    return this.C + 1;
  }
  
  public void setIndent(int value)
  {
    if (value == 0) {
      this.C = 127;
    } else {
      this.C = (value - 1);
    }
  }
  
  public String getRowHeaderCaption()
  {
    return this.ar;
  }
  
  public void setRowHeaderCaption(String value)
  {
    this.ar = value;
  }
  
  public boolean getShowRowHeaderCaption()
  {
    return this.D;
  }
  
  public void setShowRowHeaderCaption(boolean value)
  {
    this.D = value;
  }
  
  public boolean getCustomListSort()
  {
    return this.E;
  }
  
  public void setCustomListSort(boolean value)
  {
    this.E = value;
  }
  
  public PivotFormatConditionCollection getPivotFormatConditions()
  {
    if (this.aj == null) {
      this.aj = new PivotFormatConditionCollection(this, this.a.a);
    }
    return this.aj;
  }
  
  public int getPageFieldOrder()
  {
    switch ((byte)(this.c.f & 0xFFFF & 0x1))
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    }
    return 0;
  }
  
  public void setPageFieldOrder(int value)
  {
    switch (value)
    {
    case 0: 
      this.c.f &= 0xFFFE;
      break;
    case 1: 
      this.c.f |= 0x1;
      break;
    }
  }
  
  public int getPageFieldWrapCount()
  {
    return (this.c.f & 0xFFFF & 0x7E) >> 1;
  }
  
  public void setPageFieldWrapCount(int value)
  {
    int i1 = 126;
    this.c.f &= (i1 & 0xFFFF ^ 0xFFFFFFFF);
    this.c.f |= value << 1;
  }
  
  public String getTag()
  {
    return this.c.d;
  }
  
  public void setTag(String value)
  {
    this.c.d = value;
  }
  
  public boolean getSaveData()
  {
    return this.d.c(1);
  }
  
  public void setSaveData(boolean value)
  {
    this.d.a(value, 1);
  }
  
  public boolean getRefreshDataOnOpeningFile()
  {
    if (this.d != null) {
      return this.d.i();
    }
    return false;
  }
  
  public void setRefreshDataOnOpeningFile(boolean value)
  {
    if (this.d != null) {
      this.d.a(value);
    }
  }
  
  public boolean getRefreshDataFlag()
  {
    return this.r;
  }
  
  public void setRefreshDataFlag(boolean value)
  {
    this.r = value;
  }
  
  public String[] getDataSource()
  {
    return getSource();
  }
  
  public void setDataSource(String[] value)
  {
    changeDataSource(value);
  }
  
  public void changeDataSource(String[] source)
  {
    this.as = null;
    int i1 = 0;
    for (int i2 = 0; i2 < source.length; i2++)
    {
      String str = source[i2];
      if (str != null)
      {
        WorksheetCollection localWorksheetCollection = this.a.a.d().getWorksheets();
        Object localObject;
        for (int i3 = 0; i3 < localWorksheetCollection.getCount(); i3++)
        {
          localObject = localWorksheetCollection.get(i3);
          for (int i4 = 0; i4 < ((Worksheet)localObject).getPivotTables().getCount(); i4++)
          {
            PivotTable localPivotTable = ((Worksheet)localObject).getPivotTables().get(i4);
            if ((localPivotTable != this) && (localPivotTable.d == this.d))
            {
              i1 = 1;
              break;
            }
          }
        }
        if (i1 == 0)
        {
          this.d.f.a(source, this.a.a);
        }
        else
        {
          this.d.e.b += 1;
          zaws localzaws = new zaws(this.d.e);
          localObject = new CopyOptions(0, this.a.a, this.a.a);
          localzaws.a(this.d, (CopyOptions)localObject);
          localzaws.b = this.d.e.b;
          this.d = localzaws;
          this.d.e.a(localzaws);
          this.d.f.a(source, this.a.a);
        }
      }
    }
  }
  
  public String[] getSource()
  {
    if (this.d == null) {
      return null;
    }
    if ((this.d.a() != 1) && (this.d.a() != 4)) {
      return null;
    }
    return this.d.e();
  }
  
  public void refreshData()
  {
    this.as = null;
    if (this.d == null) {
      throw new CellsException(19, "this data source is not supported.");
    }
    if (this.d.a() != 1) {
      throw new CellsException(19, "this data source is not supported.");
    }
    this.d.a = isExcel2003Compatible();
    this.d.f.a();
    this.d.h();
    this.d.g();
    if (this.d.f.c() == 1)
    {
      zboy localzboy = (zboy)this.d.f;
      if (localzboy.g() != null)
      {
        Range localRange = localzboy.e;
        ArrayList localArrayList = new ArrayList();
        if (this.d.i != null) {
          this.d.a(localArrayList);
        }
        if (((localRange != null) && (!localzboy.g().a().a(localRange.a()))) || (getBaseFields().getCount() != this.d.c() + localArrayList.size()) || (this.d.x)) {
          a(localzboy.g().a());
        }
      }
    }
    else
    {
      throw new CellsException(19, "this name or range is not supported.");
    }
    i();
    n();
    m();
    k();
    j();
  }
  
  private void j()
  {
    zbpq localzbpq = this.a.a.c().J();
    int i1 = localzbpq.getCount();
    zbpp localzbpp = null;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localzbpp = localzbpq.a(i2);
      if ((null != this.d) && (-1 != this.d.c) && ((localzbpp.i & 0xFFFFFFFF) == this.d.c)) {
        localzbpp.h();
      }
    }
  }
  
  private void k()
  {
    PivotFormatCondition localPivotFormatCondition = null;
    ArrayList localArrayList1 = null;
    zbur localzbur = null;
    ArrayList localArrayList2 = null;
    for (int i1 = 0; i1 < getPivotFormatConditions().getCount(); i1++)
    {
      localPivotFormatCondition = getPivotFormatConditions().get(i1);
      localArrayList1 = localPivotFormatCondition.b;
      for (int i2 = 0; i2 < localArrayList1.size(); i2++)
      {
        localzbur = (zbur)localArrayList1.get(i2);
        localArrayList2 = localzbur.e;
        for (int i3 = 0; i3 < localArrayList2.size(); i3++) {
          if (a((zbtz)localArrayList2.get(i3)))
          {
            localArrayList2.remove(i3);
            i3--;
          }
        }
        if (localArrayList2.size() == 0)
        {
          localArrayList1.remove(i2);
          i2--;
        }
      }
      if (localArrayList1.size() == 0)
      {
        getPivotFormatConditions().removeAt(i1);
        i1--;
      }
    }
  }
  
  private boolean a(zbtz paramzbtz)
  {
    int i1 = paramzbtz.b() & 0xFFFF;
    int i2 = -1;
    if (i1 == 65534)
    {
      i2 = getDataFields().getCount();
    }
    else
    {
      if (i1 >= getBaseFields().getCount()) {
        return true;
      }
      if (getBaseFields().get(i1).h != null) {
        i2 = getBaseFields().get(i1).h.c.size();
      }
    }
    if ((i2 == -1) || (i2 == 0)) {
      return true;
    }
    ArrayList localArrayList = paramzbtz.c;
    for (int i3 = 0; i3 < localArrayList.size(); i3++) {
      if (((Integer)localArrayList.get(i3)).intValue() >= i2)
      {
        localArrayList.remove(i3);
        i3--;
      }
    }
    return localArrayList.size() == 0;
  }
  
  private void l()
  {
    ArrayList localArrayList1 = new ArrayList();
    for (int i1 = 0; i1 < this.ag.getCount(); i1++)
    {
      zbub localzbub = this.ag.a(i1);
      for (int i3 = 0; i3 < localzbub.c.e.size(); i3++)
      {
        zbtz localzbtz = (zbtz)localzbub.c.e.get(i3);
        if ((localzbtz != null) && ((localzbtz.b() & 0xFFFF) != 65534))
        {
          ArrayList localArrayList2 = localzbtz.c;
          for (int i4 = 0; i4 < localArrayList2.size(); i4++)
          {
            int i5 = a(localzbtz, ((Integer)localArrayList2.get(i4)).intValue());
            if (i5 == -1)
            {
              localArrayList2.remove(i4);
              i4--;
            }
            else
            {
              localArrayList2.set(i4, Integer.valueOf(i5));
            }
          }
        }
      }
    }
    i1 = getBaseFields().getCount();
    for (int i2 = 0; i2 < i1; i2++) {
      getBaseFields().get(i2).a = null;
    }
  }
  
  private int a(zbtz paramzbtz, int paramInt)
  {
    int i1 = paramzbtz.b();
    ArrayList localArrayList = getBaseFields().get(i1 & 0xFFFF).a;
    if (paramInt >= localArrayList.size()) {
      return -1;
    }
    PivotItem localPivotItem1 = (PivotItem)localArrayList.get(paramInt);
    PivotItemCollection localPivotItemCollection = getBaseFields().get(i1 & 0xFFFF).getPivotItems();
    int i2 = localPivotItemCollection.getCount();
    for (int i3 = 0; i3 < i2; i3++)
    {
      PivotItem localPivotItem2 = localPivotItemCollection.get(i3);
      if (((localPivotItem2.getValue() != null) && (localPivotItem2.getValue().equals(localPivotItem1.getValue()))) || (localPivotItem2.getValue() == localPivotItem1.getValue())) {
        return i3;
      }
    }
    return -1;
  }
  
  private void m()
  {
    l();
    int i1 = this.ag.getCount();
    ArrayList localArrayList = new ArrayList();
    zbub localzbub;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localzbub = this.ag.a(i2);
      if (((localzbub.c.b & 0xFF) != 255) && ((localzbub.c.b & 0xFF) >= getBaseFields().getCount())) {
        zf.a(localArrayList, this.ag.a(i2));
      } else if (localzbub.c.e.size() > 0) {
        for (int i3 = 0; i3 < localzbub.c.e.size(); i3++)
        {
          zbtz localzbtz = (zbtz)localzbub.c.e.get(i3);
          if (localzbtz != null)
          {
            int i4 = localzbtz.b();
            if ((((i4 & 0xFFFF) != 65534) && ((i4 & 0xFFFF) >= getBaseFields().getCount())) || (((i4 & 0xFFFF) != 65534) && (getBaseFields().get(i4 & 0xFFFF).h != null) && (getBaseFields().get(i4 & 0xFFFF).h.c != null) && (a(localzbtz.c, getBaseFields().get(i4 & 0xFFFF).h.c.size() - 1))) || (((i4 & 0xFFFF) == 65534) && (a(localzbtz.c, getDataFields().getCount() - 1))))
            {
              zf.a(localArrayList, this.ag.a(i2));
              break;
            }
          }
        }
      }
    }
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localzbub = (zbub)localIterator.next();
      this.ag.b(localzbub);
    }
  }
  
  private boolean a(ArrayList paramArrayList, int paramInt)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++) {
      if (((Integer)paramArrayList.get(i1)).intValue() > paramInt) {
        return true;
      }
    }
    return false;
  }
  
  private void n()
  {
    Iterator localIterator = getRowFields().a.iterator();
    PivotField localPivotField;
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      if ((localPivotField.getBaseIndex() != -2) && (localPivotField.getBaseIndex() != 65534)) {
        localPivotField.e.b = ((ArrayList)getBaseFields().get(localPivotField.getBaseIndex()).e.b.clone());
      }
    }
    localIterator = getColumnFields().a.iterator();
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      if ((localPivotField.getBaseIndex() != -2) && (localPivotField.getBaseIndex() != 65534)) {
        localPivotField.e.b = ((ArrayList)getBaseFields().get(localPivotField.getBaseIndex()).e.b.clone());
      }
    }
    localIterator = getPageFields().a.iterator();
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      if ((localPivotField.getBaseIndex() != -2) && (localPivotField.getBaseIndex() != 65534)) {
        localPivotField.e.b = ((ArrayList)getBaseFields().get(localPivotField.getBaseIndex()).e.b.clone());
      }
    }
    if (getDataField() != null)
    {
      getDataField().e.b.clear();
      for (int i1 = 0; i1 < getDataFields().a.size(); i1++)
      {
        localPivotField = (PivotField)getDataFields().a.get(i1);
        PivotItem localPivotItem = new PivotItem(this.f.e);
        this.f.e.a(localPivotItem);
        localPivotItem.setIndex(i1);
        localPivotItem.e = localPivotField;
      }
    }
  }
  
  public void calculateData()
    throws Exception
  {
    if (this.as == null) {
      this.as = new zaxb(this);
    }
    this.a.a.getWorkbook().i();
    zaca localzaca = new zaca(this.a.a, 3, new CalculationOptions());
    if (this.d.m != null)
    {
      a(this.d.m);
      zawz localzawz = this.d.m;
      int i1 = localzawz.getCount();
      zaxa localzaxa;
      for (int i2 = 0; i2 < i1; i2++)
      {
        localzaxa = localzawz.a(i2);
        localzaxa.a(localzaxa.a(), localzaxa.d, true);
      }
      this.as.a(localzaca);
      for (i2 = 0; i2 < i1; i2++)
      {
        localzaxa = localzawz.a(i2);
        localzaxa.a(localzaxa.a(), localzaxa.c());
      }
    }
    else
    {
      this.as.a(localzaca);
    }
    localzaca.c();
  }
  
  private int a(int paramInt1, int paramInt2, zawz paramzawz)
  {
    int i1 = paramzawz.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      zaxa localzaxa = paramzawz.a(i2);
      if ((localzaxa.a() == paramInt1) && (paramInt2 == ((Integer)((zbtz)localzaxa.g.e.get(0)).c.get(0)).intValue())) {
        return i2;
      }
    }
    return -1;
  }
  
  private HashMap a(zaxa paramzaxa, zawz paramzawz)
  {
    zawp localzawp = paramzaxa.a;
    zbtv localzbtv = (zbtv)localzawp.i.get(paramzaxa.a());
    ArrayList localArrayList = localzbtv.c;
    String[] arrayOfString = zw.d(paramzaxa.c(), new char[] { '+', '-', '*', '/' });
    int i1 = arrayOfString.length;
    HashMap localHashMap = new HashMap();
    for (int i2 = 0; i2 < i1; i2++)
    {
      String str1 = arrayOfString[i2];
      int i3 = str1.indexOf("[") + 1;
      int i4 = str1.lastIndexOf("]");
      String str2 = str1.substring(i3, i3 + (i4 - i3));
      int i5 = -1;
      int i6 = localArrayList.size();
      for (int i7 = 0; i7 < i6; i7++)
      {
        zbos localzbos = (zbos)localArrayList.get(i7);
        if ((str2 != null) && (str2.equals(localzbos.a)) && (localzbos.b))
        {
          i5 = a(paramzaxa.a(), i7, paramzawz);
          break;
        }
      }
      if (i5 != -1) {
        localHashMap.put(str2, Integer.valueOf(i5));
      }
    }
    return localHashMap;
  }
  
  private void a(zawz paramzawz)
  {
    int i1 = paramzawz.getCount();
    boolean[] arrayOfBoolean = new boolean[i1];
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject1 = paramzawz.a(i2);
      localObject2 = a((zaxa)localObject1, paramzawz);
      localObject3 = ((zaxa)localObject1).c();
      if (((HashMap)localObject2).size() == 0)
      {
        localObject3 = ((String)localObject3).substring(1);
        arrayOfBoolean[i2] = true;
        zf.a(localArrayList2, null);
      }
      else
      {
        zf.a(localArrayList2, localObject2);
      }
      zf.a(localArrayList1, localObject3);
    }
    while (a(arrayOfBoolean)) {
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject1 = (HashMap)localArrayList2.get(i2);
        if ((localObject1 != null) && (a((HashMap)localObject1, arrayOfBoolean)))
        {
          localObject2 = paramzawz.a(i2);
          localObject3 = ((HashMap)localObject1).entrySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            com.aspose.cells.b.a.a.za localza = (com.aspose.cells.b.a.a.za)((Iterator)localObject3).next();
            zawp localzawp = ((zaxa)localObject2).a;
            zbtv localzbtv = (zbtv)localzawp.i.get(((zaxa)localObject2).a());
            StringBuilder localStringBuilder1 = new StringBuilder(localzbtv.a);
            localStringBuilder1.append("[");
            localStringBuilder1.append(localza.getKey());
            localStringBuilder1.append("]");
            String str1 = zs.a(localStringBuilder1);
            StringBuilder localStringBuilder2 = new StringBuilder();
            localStringBuilder2.append("(");
            localStringBuilder2.append((String)localArrayList1.get(((Integer)localza.getValue()).intValue()));
            localStringBuilder2.append(")");
            String str2 = zs.a(localStringBuilder2);
            localArrayList1.set(i2, zw.a((String)localArrayList1.get(i2), str1, str2));
          }
          arrayOfBoolean[i2] = true;
        }
      }
    }
    for (i2 = 0; i2 < i1; i2++)
    {
      localObject1 = paramzawz.a(i2);
      ((zaxa)localObject1).d = ((String)localArrayList1.get(i2));
    }
  }
  
  private boolean a(HashMap paramHashMap, boolean[] paramArrayOfBoolean)
  {
    ArrayList localArrayList = new ArrayList(paramHashMap.values());
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      int i2 = ((Integer)localArrayList.get(i1)).intValue();
      if (paramArrayOfBoolean[i2] == 0) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(boolean[] paramArrayOfBoolean)
  {
    int i1 = paramArrayOfBoolean.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (paramArrayOfBoolean[i2] == 0) {
        return true;
      }
    }
    return false;
  }
  
  public void clearData()
  {
    int i1 = getPageFields().getCount();
    Cells localCells = this.a.a.getCells();
    if (i1 > 0) {
      localCells.clearRange(this.i - i1 - 1, this.k, this.i - 2, this.l);
    }
    localCells.clearRange(this.i, this.k, this.j, this.l);
    this.as = null;
  }
  
  void a(Chart paramChart, String paramString)
  {
    if (this.as == null) {
      this.as = new zaxb(this);
    }
    this.as.a(paramChart, paramString);
  }
  
  public void calculateRange()
  {
    if (this.as == null) {
      this.as = new zaxb(this);
    }
    this.a.a.getWorkbook().i();
    zaca localzaca = new zaca(this.a.a, 3, new CalculationOptions());
    this.as.b(localzaca);
    localzaca.c();
  }
  
  public void formatAll(Style style)
  {
    if (this.as == null) {
      this.as = new zaxb(this);
    }
    this.a.a.getWorkbook().i();
    this.as.a(style);
  }
  
  public void format(int row, int column, Style style)
  {
    if (this.as == null) {
      this.as = new zaxb(this);
    }
    this.a.a.getWorkbook().i();
    this.as.a(row, column, style);
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 0) && (paramInt1 <= this.i) && (paramInt1 - paramInt2 - 1 >= this.j)) {
      return true;
    }
    if (paramInt1 <= this.i)
    {
      this.i += paramInt2;
      this.m += paramInt2;
      this.n += paramInt2;
      this.j += paramInt2;
    }
    else if (paramInt1 <= this.j)
    {
      throw new IllegalArgumentException("The row index should not be inside the pivottable report");
    }
    return false;
  }
  
  boolean c(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 0) && (paramInt1 <= this.k) && (paramInt1 - paramInt2 - 1 >= this.l)) {
      return true;
    }
    if (paramInt1 <= this.k)
    {
      this.k += paramInt2;
      this.o += paramInt2;
      this.l += paramInt2;
    }
    else if (paramInt1 <= this.j)
    {
      throw new IllegalArgumentException("The column index should not be inside the pivottable report");
    }
    return false;
  }
  
  boolean a(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 4: 
      if ((paramCellArea.StartColumn <= this.k) && (paramCellArea.EndColumn >= this.l)) {
        return b(paramCellArea.StartRow, -paramInt1);
      }
      break;
    case 1: 
      if ((paramCellArea.StartRow <= this.i) && (paramCellArea.EndRow >= this.j)) {
        return c(paramCellArea.StartColumn, -paramInt1);
      }
      break;
    case 0: 
      if ((paramCellArea.StartColumn <= this.k) && (paramCellArea.EndColumn >= this.l)) {
        return b(paramCellArea.StartRow, paramInt1);
      }
      break;
    case 3: 
      if ((paramCellArea.StartRow <= this.i) && (paramCellArea.EndRow >= this.j)) {
        return c(paramCellArea.StartColumn, paramInt1);
      }
      break;
    }
    return false;
  }
  
  public boolean getItemPrintTitles()
  {
    return this.e.a(32);
  }
  
  public void setItemPrintTitles(boolean value)
  {
    this.e.a(value, 32);
  }
  
  public boolean getPrintTitles()
  {
    return this.e.a(2);
  }
  
  public void setPrintTitles(boolean value)
  {
    PageSetup localPageSetup = this.a.a.getPageSetup();
    if (value)
    {
      CellArea localCellArea1 = getColumnRange();
      CellArea localCellArea2 = getRowRange();
      String str1 = "$" + (localCellArea1.StartRow + 1) + ":$" + (localCellArea2.StartRow + 1);
      String str2 = "$" + CellsHelper.columnIndexToName(localCellArea2.StartColumn) + ":$" + CellsHelper.columnIndexToName(localCellArea2.StartColumn);
      localPageSetup.a(str1 + "," + str2);
    }
    else
    {
      localPageSetup.a(null);
    }
    this.e.a(value, 2);
  }
  
  public boolean getDisplayImmediateItems()
  {
    return this.ab.b();
  }
  
  public void setDisplayImmediateItems(boolean value)
  {
    this.ab.a(value);
    this.as = null;
  }
  
  void g()
  {
    this.as = null;
  }
  
  public boolean isSelected()
  {
    return this.Z.a();
  }
  
  public void setSelected(boolean value)
  {
    if (value)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        PivotTable localPivotTable = (PivotTable)localIterator.next();
        if (localPivotTable == this) {
          localPivotTable.Z.a(true);
        } else {
          localPivotTable.Z.a(false);
        }
      }
    }
    else
    {
      this.Z.a(value);
    }
  }
  
  public boolean getShowPivotStyleRowHeader()
  {
    return (this.at & 0xFF & 0x1) != 0;
  }
  
  public void setShowPivotStyleRowHeader(boolean value)
  {
    if (value) {
      this.at = ((byte)(this.at | 0x1));
    } else {
      this.at = ((byte)(this.at & 0xFE));
    }
  }
  
  public boolean getShowPivotStyleColumnHeader()
  {
    return (this.at & 0xFF & 0x2) != 0;
  }
  
  public void setShowPivotStyleColumnHeader(boolean value)
  {
    if (value) {
      this.at = ((byte)(this.at | 0x2));
    } else {
      this.at = ((byte)(this.at & 0xFD));
    }
  }
  
  public boolean getShowPivotStyleRowStripes()
  {
    return (this.at & 0xFF & 0x4) != 0;
  }
  
  public void setShowPivotStyleRowStripes(boolean value)
  {
    if (value) {
      this.at = ((byte)(this.at | 0x4));
    } else {
      this.at = ((byte)(this.at & 0xFB));
    }
  }
  
  public boolean getShowPivotStyleColumnStripes()
  {
    return (this.at & 0xFF & 0x8) != 0;
  }
  
  public void setShowPivotStyleColumnStripes(boolean value)
  {
    if (value) {
      this.at = ((byte)(this.at | 0x8));
    } else {
      this.at = ((byte)(this.at & 0xF7));
    }
  }
  
  public boolean getShowPivotStyleLastColumn()
  {
    return (this.at & 0xFF & 0x10) != 0;
  }
  
  public void setShowPivotStyleLastColumn(boolean value)
  {
    if (value) {
      this.at = ((byte)(this.at | 0x10));
    } else {
      this.at = ((byte)(this.at & 0xEF));
    }
  }
  
  public void setAutoGroupField(int baseFieldIndex)
  {
    PivotField localPivotField = getBaseFields().get(baseFieldIndex);
    if ((localPivotField == null) || ((localPivotField.m != 1) && (localPivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field index");
    }
    setAutoGroupField(localPivotField);
  }
  
  public void setAutoGroupField(PivotField pivotField)
  {
    if ((pivotField == null) || ((pivotField.m != 1) && (pivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field.");
    }
    zbtv localzbtv = pivotField.h;
    localzbtv.j = new SxRng(localzbtv);
    localzbtv.b |= 0x10;
    SxRng localSxRng = localzbtv.j;
    localSxRng.a = true;
    localSxRng.b = true;
    localSxRng.k = pivotField.t;
    String[] arrayOfString;
    zbos localzbos1;
    if (localzbtv.p())
    {
      arrayOfString = localzbtv.x();
      localSxRng.j = 1.0D;
      localSxRng.h = zauj.C(arrayOfString[0]);
      localSxRng.i = zauj.C(arrayOfString[1]);
      localSxRng.d = new ArrayList();
      if (localzbtv.u())
      {
        localObject1 = new zbos();
        ((zbos)localObject1).a = null;
        zf.a(localSxRng.d, localObject1);
      }
      Object localObject1 = localzbtv.a(localSxRng);
      for (localzbos1 : localObject1)
      {
        zbos localzbos2 = new zbos();
        localzbos2.a = localzbos1;
        zf.a(localSxRng.d, localzbos2);
      }
      pivotField.e();
      pivotField.d();
    }
    else if (localzbtv.o())
    {
      arrayOfString = localzbtv.x();
      localSxRng.c = 5;
      try
      {
        localSxRng.f = DateTime.a(arrayOfString[0]);
        localSxRng.g = DateTime.a(arrayOfString[1]);
      }
      catch (Exception localException1) {}
      localSxRng.j = 1.0D;
      localSxRng.d = new ArrayList();
      for (Object localObject3 : localzbtv.a(localSxRng))
      {
        localzbos1 = new zbos();
        localzbos1.a = localObject3;
        zf.a(localSxRng.d, localzbos1);
      }
      pivotField.e();
      pivotField.d();
    }
  }
  
  public void setManualGroupField(int baseFieldIndex, double startVal, double endVal, ArrayList groupByList, double intervalNum)
  {
    PivotField localPivotField = getBaseFields().get(baseFieldIndex);
    if ((localPivotField == null) || ((localPivotField.m != 1) && (localPivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field index.");
    }
    setManualGroupField(localPivotField, startVal, endVal, groupByList, intervalNum);
  }
  
  public void setManualGroupField(PivotField pivotField, double startVal, double endVal, ArrayList groupByList, double intervalNum)
  {
    if ((pivotField == null) || ((pivotField.m != 1) && (pivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field.");
    }
    if (groupByList != null)
    {
      zbtv localzbtv = pivotField.h;
      localzbtv.h(true);
      localzbtv.j = new SxRng(localzbtv);
      SxRng localSxRng = localzbtv.j;
      localSxRng.b = false;
      localSxRng.a = false;
      localSxRng.k = pivotField.t;
      if (endVal >= startVal)
      {
        if ((groupByList.size() == 1) && (((Integer)groupByList.get(0)).intValue() == 0) && (intervalNum > 0.0D))
        {
          localSxRng.h = startVal;
          localSxRng.i = endVal;
          localSxRng.j = intervalNum;
          localSxRng.c = 0;
          localSxRng.d = new ArrayList();
          Object[] arrayOfObject1 = localzbtv.a(zo.b(startVal), zo.b(endVal), groupByList, intervalNum, 0);
          for (Object localObject : arrayOfObject1)
          {
            zbos localzbos = new zbos();
            localzbos.a = localObject;
            zf.a(localSxRng.d, localzbos);
          }
          pivotField.e();
          pivotField.d();
        }
        else
        {
          throw new IllegalArgumentException("Invalid parameters for numeric grouping.");
        }
      }
      else {
        throw new IllegalArgumentException("The start value must not be greater than the end value.");
      }
    }
  }
  
  public void setManualGroupField(int baseFieldIndex, DateTime startVal, DateTime endVal, ArrayList groupByList, int intervalNum)
  {
    PivotField localPivotField = getBaseFields().get(baseFieldIndex);
    if ((localPivotField == null) || ((localPivotField.m != 1) && (localPivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field index.");
    }
    setManualGroupField(localPivotField, startVal, endVal, groupByList, intervalNum);
  }
  
  public void setManualGroupField(PivotField pivotField, DateTime startVal, DateTime endVal, ArrayList groupByList, int intervalNum)
  {
    if ((pivotField == null) || ((pivotField.m != 1) && (pivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field.");
    }
    if (groupByList != null)
    {
      zbtv localzbtv1 = pivotField.h;
      localzbtv1.h(true);
      localzbtv1.j = new SxRng(localzbtv1);
      SxRng localSxRng = localzbtv1.j;
      localSxRng.b = false;
      localSxRng.a = false;
      localSxRng.k = pivotField.t;
      String str1 = startVal.a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
      String str2 = endVal.a("yyyy-MM-dd\\THH:mm:ss.fff", com.aspose.cells.b.a.c.za.b());
      if (str2.compareTo(str1) >= 0)
      {
        try
        {
          pivotField.h.j.f = DateTime.a(str1);
          pivotField.h.j.g = DateTime.a(str2);
        }
        catch (Exception localException) {}
        if (groupByList.contains(Integer.valueOf(0))) {
          groupByList.remove(0);
        }
        Collections.sort(groupByList);
        Object localObject4;
        if ((groupByList.size() == 1) && (((Integer)groupByList.get(0)).intValue() == 4))
        {
          if ((intervalNum > 0) && (intervalNum < 32768))
          {
            pivotField.h.j.j = intervalNum;
            localSxRng.c = 4;
            localSxRng.d = new ArrayList();
            pivotField.e = new PivotItemCollection(pivotField);
            localException = localzbtv1.a(str1, str2, groupByList, intervalNum, 4);
            for (Object localObject3 : localException)
            {
              localObject4 = new zbos();
              ((zbos)localObject4).a = localObject3;
              zf.a(localSxRng.d, localObject4);
            }
            pivotField.e();
            pivotField.d();
          }
          else
          {
            throw new IllegalArgumentException("The number of days must be positive integer of nonzero, between 1 and 32767.");
          }
        }
        else
        {
          localException = ((Integer)groupByList.get(0)).intValue();
          localSxRng.c = localException;
          localSxRng.d = new ArrayList();
          pivotField.e = new PivotItemCollection(pivotField);
          ??? = localzbtv1.a(str1, str2, groupByList, 0.0D, localException);
          for (localObject4 : ???)
          {
            zbos localzbos1 = new zbos();
            localzbos1.a = localObject4;
            zf.a(localSxRng.d, localzbos1);
          }
          pivotField.e();
          pivotField.d();
          for (int i2 = 1; i2 < groupByList.size(); i2++)
          {
            PivotField localPivotField = new PivotField(getBaseFields());
            getBaseFields().a(localPivotField);
            localPivotField.t = (getBaseFields().getCount() - 1);
            localPivotField.setShowInOutlineForm(true);
            localPivotField.setShowCompact(true);
            localPivotField.setShowSubtotalAtTop(true);
            if (pivotField.m == 1) {
              getRowFields().a(localPivotField, 0);
            } else {
              getColumnFields().a(localPivotField, 0);
            }
            localPivotField.setAutoSubtotals(false);
            localPivotField.m = pivotField.m;
            zbtv localzbtv2 = new zbtv(this.d);
            localzbtv2.h(true);
            localPivotField.h = localzbtv2;
            localException = ((Integer)groupByList.get(i2)).intValue();
            localObject4 = new SxRng(localzbtv2);
            localzbtv2.j = ((SxRng)localObject4);
            ((SxRng)localObject4).c = localException;
            ((SxRng)localObject4).k = pivotField.t;
            try
            {
              ((SxRng)localObject4).f = DateTime.a(str1);
              ((SxRng)localObject4).g = DateTime.a(str2);
            }
            catch (Exception localException2) {}
            ((SxRng)localObject4).j = 1.0D;
            String str3 = zaxj.d(localException);
            localzbtv2.a = str3.replace(str3.charAt(0), (char)(str3.charAt(0) - ' '));
            localzbtv2.o = true;
            ((SxRng)localObject4).d = new ArrayList();
            ??? = localzbtv2.a(str1, str2, groupByList, 0.0D, localException);
            for (Object localObject6 : ???)
            {
              zbos localzbos2 = new zbos();
              localzbos2.a = localObject6;
              zf.a(((SxRng)localObject4).d, localzbos2);
            }
            localzbtv2.c = null;
            localPivotField.d();
            zf.a(this.d.i, localzbtv2);
          }
        }
      }
      else
      {
        throw new IllegalArgumentException("The start value must not be greater than the end value.");
      }
    }
  }
  
  public void setUngroup(int baseFieldIndex)
  {
    PivotField localPivotField = getBaseFields().get(baseFieldIndex);
    if ((localPivotField == null) || ((localPivotField.m != 1) && (localPivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field index.");
    }
    setUngroup(localPivotField);
  }
  
  public void setUngroup(PivotField pivotField)
  {
    if ((pivotField == null) || ((pivotField.m != 1) && (pivotField.m != 2))) {
      throw new IllegalArgumentException("Invalid pivot field.");
    }
    pivotField.h.j = null;
    pivotField.h.h(false);
    pivotField.e();
    pivotField.initPivotItems();
  }
  
  private void a(ArrayList paramArrayList, zrg paramzrg)
    throws Exception
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte = (byte[])localIterator.next();
      paramzrg.a(arrayOfByte);
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (this.Y != null)
    {
      a(this.Y, paramzrg);
      return;
    }
    zbvc localzbvc = new zbvc(this.b);
    localzbvc.a(paramzrg);
    b(paramzrg);
    c(paramzrg);
    zbuh localzbuh = new zbuh();
    localzbuh.a(this.g);
    localzbuh.a(paramzrg);
    localzbuh.a(this.h);
    localzbuh.a(paramzrg);
    this.c.a = ((short)this.ag.getCount());
    zbtu localzbtu = new zbtu(this.c);
    localzbtu.a(paramzrg);
    if (this.c.l != null) {
      a(this.c.l, paramzrg);
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    for (int i1 = 0; i1 < this.ag.getCount(); i1++)
    {
      localObject1 = this.ag.a(i1);
      if ((((zbub)localObject1).a != 1) || (((zbub)localObject1).b != -1))
      {
        zbud localzbud = new zbud((zbub)localObject1);
        localObject2 = ((zbub)localObject1).a();
        zbtr localzbtr = new zbtr((Style)localObject2);
        localzbud.b(localzbtr.d());
        localzbud.a(paramzrg);
        zbur localzbur = ((zbub)localObject1).c;
        localObject3 = new zbus(localzbur);
        ((zbus)localObject3).a(paramzrg);
        for (int i5 = 0; i5 < localzbur.e.size(); i5++)
        {
          zbtz localzbtz = (zbtz)localzbur.e.get(i5);
          zbua localzbua = new zbua(localzbtz);
          localzbua.a(paramzrg);
          if (localzbtz.c.size() > 0)
          {
            zbuf localzbuf = new zbuf(localzbtz.c);
            localzbuf.a(paramzrg);
          }
        }
        localzbtr.a(paramzrg);
      }
    }
    try
    {
      zbat localzbat = new zbat();
      localzbat.a(this.Z);
      localzbat.a(paramzrg);
    }
    catch (Exception localException) {}
    zbvb localzbvb = new zbvb(this.e);
    localzbvb.a(paramzrg);
    if (this.ab.getCount() > 0)
    {
      localObject1 = null;
      for (int i2 = 0; i2 < this.ab.getCount(); i2++)
      {
        localObject2 = this.ab.a(i2);
        if (localObject2[0] == 0)
        {
          if (localObject2[1] == 30) {
            zbbd.a(paramzrg, 0, 30, this, null, null);
          } else if (localObject2[1] == 2) {
            zbbd.a(paramzrg, 0, 2, this, null, null);
          } else {
            zbbd.a(paramzrg, (byte[])this.ab.a(i2));
          }
        }
        else if (localObject2[0] == 23)
        {
          if (localObject2[1] == 0)
          {
            int i3 = 8;
            int i4 = com.aspose.cells.b.a.zc.b((byte[])localObject2, i3);
            if (i4 > 0)
            {
              i3 += 2;
              localObject3 = new int[] { i3 };
              String str = zaxj.a((int[])localObject3, i4, (byte[])localObject2);
              i3 = localObject3[0];
              localObject1 = getBaseFields().get(str);
            }
            zbbd.a(paramzrg, (byte[])this.ab.a(i2));
          }
          else if (localObject2[1] == 25)
          {
            zbbd.a(paramzrg, 23, 25, this, null, (PivotField)localObject1);
          }
          else
          {
            zbbd.a(paramzrg, (byte[])this.ab.a(i2));
          }
        }
        else {
          zbbd.a(paramzrg, (byte[])this.ab.a(i2));
        }
      }
    }
    else
    {
      zbbd.a(paramzrg, this);
    }
  }
  
  void b(zrg paramzrg)
    throws Exception
  {
    Iterator localIterator = getBaseFields().a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      zbux localzbux = new zbux();
      localzbux.a(localPivotField.c);
      localzbux.a(paramzrg);
      if ((localPivotField.e != null) && (localPivotField.e.getCount() != 0)) {
        localPivotField.e.a(paramzrg);
      }
      zbuw localzbuw = new zbuw();
      localzbuw.a(localPivotField.d);
      localzbuw.a(paramzrg);
    }
  }
  
  void c(zrg paramzrg)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection1 = this.b.d;
    PivotFieldCollection localPivotFieldCollection2 = this.b.e;
    PivotFieldCollection localPivotFieldCollection3 = this.b.f;
    PivotFieldCollection localPivotFieldCollection4 = this.b.c;
    int i1 = localPivotFieldCollection1.getCount();
    int i2 = localPivotFieldCollection2.getCount();
    zbvd localzbvd = new zbvd();
    if (i1 != 0)
    {
      localzbvd.a(localPivotFieldCollection1);
      localzbvd.a(paramzrg);
    }
    if (i2 != 0)
    {
      localzbvd.a(localPivotFieldCollection2);
      localzbvd.a(paramzrg);
    }
    Object localObject;
    if (localPivotFieldCollection3.getCount() != 0)
    {
      localObject = new zbup();
      ((zbup)localObject).a(localPivotFieldCollection3);
      ((zbup)localObject).a(paramzrg);
    }
    if (localPivotFieldCollection4.getCount() != 0)
    {
      localObject = new zbts();
      for (int i3 = 0; i3 < localPivotFieldCollection4.getCount(); i3++)
      {
        ((zbts)localObject).a(localPivotFieldCollection4.get(i3).i);
        ((zbts)localObject).a(paramzrg);
      }
    }
  }
  
  public ArrayList getHorizontalBreaks()
  {
    ArrayList localArrayList = new ArrayList();
    if ((null != this) && (null != this.g))
    {
      int i1 = this.i;
      if ((getColumnFields() != null) && (getColumnFields().getCount() > 0)) {
        i1 += 1 + getColumnFields().getCount();
      } else {
        i1++;
      }
      int i2 = getRowFields().getCount();
      if (i2 < 1) {
        return localArrayList;
      }
      int[] arrayOfInt1 = new int[i2 - 1];
      PivotField localPivotField = null;
      for (int i3 = 0; i3 < i2 - 1; i3++)
      {
        localPivotField = getRowFields().get(i3);
        if (localPivotField.c() < 0) {
          arrayOfInt1[i3] = 0;
        } else {
          arrayOfInt1[i3] = (localPivotField.isInsertPageBreaksBetweenItems() ? 1 : 0);
        }
      }
      int[] arrayOfInt2 = new int[4 + i2];
      int[] arrayOfInt3 = new int[4 + i2];
      for (int i4 = 0; i4 < this.g.size() - 1; i4++)
      {
        i1++;
        arrayOfInt2 = (int[])this.g.get(i4);
        arrayOfInt3 = (int[])this.g.get(i4 + 1);
        if (i4 + 1 == this.g.size() - 1) {
          break;
        }
        for (int i5 = 0; i5 < arrayOfInt1.length; i5++) {
          if ((arrayOfInt2[(4 + i5)] != arrayOfInt3[(4 + i5)]) && (1 == arrayOfInt1[i5])) {
            zf.a(localArrayList, Integer.valueOf(i1));
          }
        }
      }
    }
    return localArrayList;
  }
  
  public void showInCompactForm()
  {
    this.u = true;
    this.v = true;
    this.w = true;
    this.x = true;
    int i1 = getBaseFields().getCount();
    PivotField localPivotField = null;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localPivotField = getBaseFields().get(i2);
      localPivotField.setShowCompact(true);
      localPivotField.setShowInOutlineForm(true);
    }
  }
  
  public void showInOutlineForm()
  {
    this.u = false;
    this.v = false;
    this.w = true;
    this.x = true;
    int i1 = getBaseFields().getCount();
    PivotField localPivotField = null;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localPivotField = getBaseFields().get(i2);
      localPivotField.setShowCompact(false);
      localPivotField.setShowInOutlineForm(true);
    }
  }
  
  public void showInTabularForm()
  {
    this.u = false;
    this.v = false;
    this.w = false;
    this.x = false;
    int i1 = getBaseFields().getCount();
    PivotField localPivotField = null;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localPivotField = getBaseFields().get(i2);
      localPivotField.setShowCompact(false);
      localPivotField.setShowInOutlineForm(false);
    }
  }
  
  public Cell getCellByDisplayName(String displayName)
  {
    Cells localCells = this.a.a.getCells();
    int i2;
    for (int i1 = this.i; i1 < this.n; i1++) {
      for (i2 = this.k; i2 <= this.l; i2++) {
        if ((displayName != null) && (displayName.equals(localCells.get(i1, i2).getStringValue()))) {
          return localCells.get(i1, i2);
        }
      }
    }
    for (i1 = this.n; i1 <= this.j; i1++) {
      for (i2 = this.k; i2 < this.o; i2++) {
        if ((displayName != null) && (displayName.equals(localCells.get(i1, i2).getStringValue()))) {
          return localCells.get(i1, i2);
        }
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */