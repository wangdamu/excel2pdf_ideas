package com.aspose.cells;

import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaxb
{
  PivotTable a;
  Cells b;
  Worksheet c;
  WorksheetCollection d;
  Workbook e;
  zaxf f;
  zaxf g;
  ArrayList h;
  int[][] i;
  private boolean[] B;
  int j = 0;
  int k = 0;
  private boolean C = false;
  private boolean[] D = null;
  private boolean[] E = null;
  private boolean F = false;
  private boolean G = false;
  boolean l;
  boolean m;
  boolean n;
  private int H = 1;
  boolean o = false;
  int p = 0;
  int q = 0;
  boolean r = false;
  int s = 0;
  int t = 0;
  int u = 0;
  int v = 0;
  private String I = "(blank)";
  private String J = "";
  private String K = "";
  private String L = "";
  private String M = "";
  private String N = "";
  private double[][] O = (double[][])null;
  private ArrayList P;
  private ArrayList Q;
  private ArrayList R;
  private ArrayList S;
  private ArrayList T;
  ArrayList w;
  ArrayList x;
  int[][] y;
  int[][] z;
  static boolean A = false;
  private static final com.aspose.cells.b.c.a.za U = new com.aspose.cells.b.c.a.za(new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "JAN", "FEB", "MAR", "APR", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" });
  
  private void c()
  {
    GlobalizationSettings localGlobalizationSettings = this.e.getSettings().getGlobalizationSettings();
    this.I = localGlobalizationSettings.getEmptyDataName();
    this.J = localGlobalizationSettings.getRowLablesName();
    this.K = localGlobalizationSettings.getColumnLablesName();
    this.L = localGlobalizationSettings.getAllName();
    this.M = localGlobalizationSettings.getMultipleItemsName();
    String str = localGlobalizationSettings.getPivotGrandTotalName();
    if (!"Grand Total".equals(str)) {
      this.a.setGrandTotalName(str);
    }
    this.N = localGlobalizationSettings.getPivotTotalName();
    this.s = this.a.getRowFields().getCount();
    this.t = this.a.getColumnFields().getCount();
    this.u = this.a.getDataFields().getCount();
    this.v = this.a.getPageFields().getCount();
    this.a.setPageFieldWrapCount(Math.min(this.v, this.a.getPageFieldWrapCount()));
    int i2;
    if (this.v > 0)
    {
      if (this.a.getPageFieldWrapCount() == 0) {
        this.a.setPageFieldWrapCount(this.v);
      }
      i1 = this.v % this.a.getPageFieldWrapCount() != 0 ? 1 : 0;
      i2 = this.v / this.a.getPageFieldWrapCount();
      if (this.a.getPageFieldOrder() == 0)
      {
        this.a.q = (i2 + (i1 != 0 ? 1 : 0));
        this.a.p = this.a.getPageFieldWrapCount();
      }
      else
      {
        this.a.p = (i2 + (i1 != 0 ? 1 : 0));
        this.a.q = this.a.getPageFieldWrapCount();
      }
    }
    if ((this.t == 0) && (this.s == 0) && (this.u == 0))
    {
      this.m = true;
      this.l = true;
      return;
    }
    this.n = true;
    if ((this.u == 0) && (!this.a.getDisplayImmediateItems())) {
      this.n = false;
    }
    if (this.a.getAutoFormatType() == 1) {
      this.l = true;
    } else if (this.t == 0) {
      this.l = true;
    } else if (this.t == 1)
    {
      if ((this.u > 1) && (this.a.getDataField() == this.a.getColumnFields().get(0))) {
        this.l = false;
      } else {
        this.l = true;
      }
    }
    else {
      this.l = true;
    }
    if (this.a.f != null)
    {
      this.j = this.a.f.m;
      this.k = this.a.f.getPosition();
    }
    if ((this.a.d.m != null) && (this.a.d.m.getCount() != 0))
    {
      i1 = -1;
      PivotField localPivotField2;
      int i3;
      PivotItem localPivotItem;
      for (i2 = 0; i2 < this.s; i2++)
      {
        localPivotField2 = this.a.getRowFields().get(i2);
        i1 = localPivotField2.getPivotItems().getCount();
        for (i3 = 0; i3 < i1; i3++)
        {
          localPivotItem = localPivotField2.getPivotItems().get(i3);
          if (localPivotItem.b())
          {
            this.F = true;
            break;
          }
        }
        if (this.F) {
          break;
        }
      }
      for (i2 = 0; i2 < this.t; i2++)
      {
        localPivotField2 = this.a.getColumnFields().get(i2);
        i1 = localPivotField2.getPivotItems().getCount();
        for (i3 = 0; i3 < i1; i3++)
        {
          localPivotItem = localPivotField2.getPivotItems().get(i3);
          if (localPivotItem.b())
          {
            this.G = true;
            break;
          }
        }
        if (this.G) {
          break;
        }
      }
      this.C = true;
    }
    for (int i1 = 0; i1 < this.s; i1++)
    {
      PivotField localPivotField1 = this.a.getRowFields().get(i1);
      if (((localPivotField1.getShowInOutlineForm()) && (localPivotField1.getShowCompact())) || (((!localPivotField1.i()) || ((localPivotField1.i()) && ((!this.a.v) || (!this.a.x)))) && (i1 != this.s - 1))) {
        this.H += 1;
      }
    }
    if ((!this.a.isGridDropZones()) && (this.s == 0) && (this.e.h()) && (this.H == 1) && ((this.u == 0) || (this.t == 0))) {
      this.H = 0;
    }
  }
  
  zaxb(PivotTable paramPivotTable)
  {
    this.a = paramPivotTable;
    this.c = this.a.a.a;
    this.d = this.c.c();
    this.b = this.c.getCells();
    this.e = this.c.d();
    c();
  }
  
  void a(Style paramStyle)
  {
    zaxg localzaxg = new zaxg(this);
    localzaxg.a(paramStyle);
  }
  
  void a(int paramInt1, int paramInt2, Style paramStyle)
  {
    zaxg localzaxg = new zaxg(this);
    localzaxg.a(paramInt1, paramInt2, paramStyle);
  }
  
  void a(Chart paramChart, String paramString)
  {
    if (this.a.d.h == null) {
      return;
    }
    this.i = a(-1);
    b();
    zaca localzaca = new zaca(this.c, 3, new CalculationOptions());
    e(localzaca);
    d(localzaca);
    a();
    a(paramChart, paramString, localzaca);
    localzaca.c();
  }
  
  private void a(Chart paramChart, String paramString, zaca paramzaca)
  {
    Object localObject4;
    Object localObject5;
    if ((this.t == 0) || (this.s == 0))
    {
      if (this.u == 0)
      {
        paramChart.getNSeries().clear();
        return;
      }
      if ((this.t == 0) && (this.s == 0))
      {
        if (paramChart.getNSeries().getCount() > 1) {
          paramChart.getNSeries().a(1, paramChart.getNSeries().getCount() - 1);
        }
        localObject1 = null;
        localCellArea = this.a.getDataBodyRange();
        localObject2 = a(true, paramString, localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
        if (paramChart.getNSeries().getCount() < 1)
        {
          paramChart.getNSeries().add((String)localObject2, true);
          localObject1 = paramChart.getNSeries().get(0);
        }
        else
        {
          localObject1 = paramChart.getNSeries().get(0);
          ((Series)localObject1).setValues((String)localObject2);
        }
        ((Series)localObject1).setXValues(a(true, paramString, localCellArea.StartRow - 1, localCellArea.StartColumn, localCellArea.StartRow - 1, localCellArea.EndColumn));
        ((Series)localObject1).setName("Total");
        return;
      }
      if (this.t == 0)
      {
        if (paramChart.getNSeries().getCount() > 1) {
          paramChart.getNSeries().a(1, paramChart.getNSeries().getCount() - 1);
        }
        localObject1 = this.a.getDataBodyRange();
        localCellArea = this.a.getRowRange();
        localObject2 = a(true, paramString, ((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, ((CellArea)localObject1).EndRow, ((CellArea)localObject1).EndColumn);
        localObject3 = null;
        if (paramChart.getNSeries().getCount() < 1)
        {
          paramChart.getNSeries().add((String)localObject2, true);
          localObject3 = paramChart.getNSeries().get(0);
        }
        else
        {
          localObject3 = paramChart.getNSeries().get(0);
          ((Series)localObject3).setValues((String)localObject2);
        }
        ((Series)localObject3).setXValues(a(true, paramString, ((CellArea)localObject1).StartRow, localCellArea.StartColumn, ((CellArea)localObject1).EndRow, localCellArea.EndColumn));
        ((Series)localObject3).setName("Total");
        String str1 = null;
        String[] arrayOfString1 = { str1 };
        ((Series)localObject3).o().b = a(arrayOfString1);
        str1 = arrayOfString1[0];
        ((Series)localObject3).o().a(str1);
        localArrayList1 = new ArrayList();
        for (int i3 = 0; i3 < this.S.size(); i3++)
        {
          zbug localzbug1 = (zbug)this.S.get(i3);
          if ((localzbug1.c != 14) && (localzbug1.e == this.s) && (localzbug1.c != 13))
          {
            PivotField localPivotField1 = a(localzbug1, null);
            if (("".equals(((Series)localObject3).m().b())) || (((Series)localObject3).m().b() == null)) {
              ((Series)localObject3).m().a(localPivotField1.getNumberFormat());
            }
            localObject4 = b(localzbug1.d, localzbug1, this.j == 1, this.a.getRowFields());
            if (localPivotField1 != null)
            {
              this.p = i3;
              localObject5 = a(null, null, (ArrayList)localObject4, true, localPivotField1, 0, null, paramzaca);
              localObject5 = a((zaie)localObject5);
              zf.a(localArrayList1, ((zaie)localObject5).b(paramzaca));
            }
          }
        }
        ((Series)localObject3).m().b = localArrayList1;
        return;
      }
    }
    Object localObject1 = this.a.getRowRange();
    CellArea localCellArea = this.a.getDataBodyRange();
    Object localObject2 = this.a.getColumnRange();
    Object localObject3 = this.a.h;
    int i1 = 0;
    int i2 = ((CellArea)localObject2).StartColumn;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i4 = 0;
    for (int i5 = 0; i5 < ((ArrayList)localObject3).size(); i5++)
    {
      localObject4 = (int[])((ArrayList)localObject3).get(i5);
      if ((localObject4[2] > 0) && (localObject4[1] == 0)) {
        i4++;
      }
    }
    while (paramChart.getNSeries().getCount() > i4) {
      paramChart.getNSeries().removeAt(paramChart.getNSeries().getCount() - 1);
    }
    ArrayList localArrayList3 = paramChart.getNSeries().d();
    for (int i6 = 0; i6 < ((ArrayList)localObject3).size(); i6++)
    {
      localArrayList2 = new ArrayList();
      localObject5 = (int[])((ArrayList)localObject3).get(i6);
      zbug localzbug2 = new zbug((int[])localObject5);
      if ((localObject5[2] > 0) && (localObject5[1] == 0))
      {
        Series localSeries = null;
        String str2 = a(true, paramString, localCellArea.StartRow, localCellArea.StartColumn + i6, localCellArea.EndRow, localCellArea.StartColumn + i6);
        if (i1 >= paramChart.getNSeries().getCount())
        {
          paramChart.getNSeries().add(str2, true);
          localSeries = paramChart.getNSeries().get(i1);
        }
        else
        {
          localSeries = ((znb)localArrayList3.get(i1)).a();
          localSeries.setValues(str2);
        }
        if ((this.s == 0) || ((this.t == 1) && (this.a.getColumnFields().get(0).t == -2)) || ((this.s > 0) && (this.a.getDataField() != null) && (this.a.getDataField().m == 1))) {
          localSeries.setXValues(a(true, paramString, ((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, ((CellArea)localObject1).EndRow, ((CellArea)localObject1).EndColumn));
        } else {
          localSeries.setXValues(a(true, paramString, ((CellArea)localObject1).StartRow + 1, ((CellArea)localObject1).StartColumn, ((CellArea)localObject1).EndRow, ((CellArea)localObject1).EndColumn));
        }
        localSeries.setName(a(true, paramString, ((CellArea)localObject2).StartRow, ((CellArea)localObject2).StartColumn + i6, ((CellArea)localObject2).EndRow, ((CellArea)localObject2).StartColumn + i6));
        StringBuilder localStringBuilder = new StringBuilder();
        for (int i7 = 0; i7 < localzbug2.e; i7++)
        {
          int i8 = localzbug2.f[i7];
          PivotItem localPivotItem = this.a.getColumnFields().get(i7).getPivotItems().get(i8);
          if (localPivotItem.getValue() != null)
          {
            localStringBuilder.append(zs.a(localPivotItem.getValue()));
            if ((localzbug2.e > 0) && (i7 != localzbug2.e - 1)) {
              localStringBuilder.append(" - ");
            }
          }
          else if ((localPivotItem.e != null) && (localPivotItem.e.t < this.u))
          {
            localStringBuilder.append(this.a.getDataFields().get(localPivotItem.e.t).getDisplayName());
          }
        }
        localSeries.c = zs.a(localStringBuilder);
        String str3 = null;
        String[] arrayOfString2 = { str3 };
        localSeries.o().b = a(arrayOfString2);
        str3 = arrayOfString2[0];
        localSeries.o().a(str3);
        if (this.S != null) {
          for (int i9 = 0; i9 < this.S.size(); i9++)
          {
            zbug localzbug3 = (zbug)this.S.get(i9);
            if ((localzbug3.c != 14) && (localzbug3.e == this.s) && (localzbug3.c != 13))
            {
              zbug localzbug4 = (zbug)this.T.get(i6);
              PivotField localPivotField2 = a(localzbug3, localzbug4);
              if (("".equals(localSeries.m().b())) || (localSeries.m().b() == null)) {
                if ((!"".equals(localPivotField2.getNumberFormat())) && (localPivotField2.getNumberFormat() != null)) {
                  localSeries.m().a(localPivotField2.getNumberFormat());
                } else if (localPivotField2.getNumber() != 0) {
                  localSeries.m().a(this.e.getSettings().f().d(localPivotField2.getNumber()));
                }
              }
              ArrayList localArrayList4 = b(localzbug3.d, localzbug4, this.j == 2, this.a.getColumnFields());
              if (localPivotField2 != null)
              {
                this.p = i9;
                this.q = i6;
                zaie localzaie = a(null, null, localArrayList4, true, localPivotField2, i6, localzbug4, paramzaca);
                localzaie = a(localzaie);
                zf.a(localArrayList2, localzaie.b(paramzaca));
              }
            }
          }
        }
        localSeries.m().b = localArrayList2;
        i1++;
      }
    }
  }
  
  private ArrayList a(String[] paramArrayOfString)
  {
    paramArrayOfString[0] = "";
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject = null;
    int i1 = -1;
    int i2 = -1;
    for (int i3 = 0; i3 < this.a.g.size(); i3++)
    {
      if (localArrayList1.size() > 0)
      {
        localStringBuilder2 = new StringBuilder();
        if (localArrayList1.size() == 1)
        {
          if ((i1 != i2) && (i2 > i1))
          {
            localArrayList2.set(localArrayList2.size() - 1, localArrayList1.get(0) + "\n" + localArrayList2.get(localArrayList2.size() - 1));
            i1 = -1;
          }
          else
          {
            zf.a(localArrayList2, localArrayList1.get(0));
          }
        }
        else
        {
          for (int i4 = localArrayList1.size() - 1; i4 > 0; i4--)
          {
            localStringBuilder2.append(localArrayList1.get(i4));
            localStringBuilder2.append("\n");
          }
          localStringBuilder2.append(localArrayList1.get(0));
          if ((i1 != i2) && (i2 > i1))
          {
            localArrayList2.set(localArrayList2.size() - 1, zs.a(localStringBuilder2) + "\n" + localArrayList2.get(localArrayList2.size() - 1));
            i1 = -1;
          }
          else
          {
            zf.a(localArrayList2, zs.a(localStringBuilder2));
          }
        }
        localArrayList1 = new ArrayList();
      }
      zbug localzbug = new zbug((int[])this.a.g.get(i3));
      if ((!localzbug.a()) && (!localzbug.b()) && (localzbug.c != 13))
      {
        if ((i1 == -1) || (i1 > localzbug.b)) {
          i1 = localzbug.b;
        }
        i2 = localzbug.b;
        for (int i5 = localzbug.b; i5 < localzbug.e; i5++)
        {
          int i6 = localzbug.f[i5];
          PivotItem localPivotItem = this.a.getRowFields().get(i5).getPivotItems().get(i6);
          if ((this.a.getDataField() != null) && (this.a.getDataField().m == 1) && (this.k >= 0) && (i5 == this.k))
          {
            int i7 = localzbug.d();
            if (i7 < this.u)
            {
              if ("".equals(paramArrayOfString[0])) {
                if ((!"".equals(this.a.getDataFields().get(i7).getNumberFormat())) && (this.a.getDataFields().get(i7).getNumberFormat() != null)) {
                  paramArrayOfString[0] = this.a.getDataFields().get(i7).getNumberFormat();
                } else if (this.a.getDataFields().get(i7).getNumber() != 0) {
                  paramArrayOfString[0] = this.e.getSettings().f().d(this.a.getDataFields().get(i7).getNumber());
                }
              }
              localObject = this.a.getDataFields().get(i7).getDisplayName();
              if (null == localObject) {
                zf.a(localArrayList1, this.I);
              } else {
                zf.a(localArrayList1, localObject);
              }
            }
          }
          else
          {
            if ("".equals(paramArrayOfString[0])) {
              if ((!"".equals(this.a.getRowFields().get(i5).getNumberFormat())) && (this.a.getRowFields().get(i5).getNumberFormat() != null)) {
                paramArrayOfString[0] = this.a.getRowFields().get(i5).getNumberFormat();
              } else if (this.a.getRowFields().get(i5).getNumber() != 0) {
                paramArrayOfString[0] = this.e.getSettings().f().d(this.a.getRowFields().get(i5).getNumber());
              }
            }
            localObject = localPivotItem.getValue();
            if (null == localObject) {
              zf.a(localArrayList1, this.I);
            } else {
              zf.a(localArrayList1, localObject);
            }
          }
        }
      }
    }
    if ((localArrayList2.size() < this.a.g.size()) && (localArrayList1.size() > 0))
    {
      localStringBuilder2 = new StringBuilder();
      if (localArrayList1.size() == 1)
      {
        if ((i1 != i2) && (i2 > i1))
        {
          localArrayList2.set(localArrayList2.size() - 1, localArrayList1.get(0) + "\n" + localArrayList2.get(localArrayList2.size() - 1));
          i1 = -1;
        }
        else
        {
          zf.a(localArrayList2, localArrayList1.get(0));
        }
      }
      else
      {
        for (i3 = localArrayList1.size() - 1; i3 > 0; i3--)
        {
          localStringBuilder2.append(localArrayList1.get(i3));
          localStringBuilder2.append("\n");
        }
        localStringBuilder2.append(localArrayList1.get(0));
        if ((i1 != i2) && (i2 > i1))
        {
          localArrayList2.set(localArrayList2.size() - 1, zs.a(localStringBuilder2) + "\n" + localArrayList2.get(localArrayList2.size() - 1));
          i1 = -1;
        }
        else
        {
          zf.a(localArrayList2, zs.a(localStringBuilder2));
        }
      }
    }
    return localArrayList2;
  }
  
  private String a(boolean paramBoolean, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('=');
    localStringBuilder.append(paramString);
    localStringBuilder.append('!');
    CellsHelper.a(localStringBuilder, paramInt1, paramInt2);
    if (paramBoolean)
    {
      localStringBuilder.append(':');
      CellsHelper.a(localStringBuilder, paramInt3, paramInt4);
    }
    return zs.a(localStringBuilder);
  }
  
  private void d()
  {
    Cell localCell = null;
    Style localStyle1 = new Style(this.d);
    localStyle1.setBorder(1, 1, Color.getBlack());
    for (int i1 = this.a.i + 1; i1 < this.a.j; i1++)
    {
      localCell = this.b.a(i1, this.a.k, false);
      localCell.a(localStyle1);
    }
    Style localStyle2 = new Style(this.d);
    localStyle2.setBorder(2, 1, Color.getBlack());
    for (int i2 = this.a.i + 1; i2 < this.a.j; i2++)
    {
      localCell = this.b.a(i2, this.a.l, false);
      localCell.a(localStyle2);
    }
    Style localStyle3 = new Style(this.d);
    localStyle3.setBorder(4, 1, Color.getBlack());
    for (int i3 = this.a.k + 1; i3 < this.a.l; i3++)
    {
      localCell = this.b.a(this.a.i, i3, false);
      localCell.a(localStyle3);
    }
    Style localStyle4 = new Style(this.d);
    localStyle4.setBorder(8, 1, Color.getBlack());
    for (int i4 = this.a.k + 1; i4 < this.a.l; i4++)
    {
      localCell = this.b.a(this.a.j, i4, false);
      localCell.a(localStyle4);
    }
    localCell = this.b.a(this.a.i, this.a.k, false);
    Style localStyle5 = new Style(this.d);
    localStyle5.setBorder(1, 1, Color.getBlack());
    localStyle5.setBorder(4, 1, Color.getBlack());
    localCell.a(localStyle5);
    localCell = this.b.a(this.a.i, this.a.l, false);
    localStyle5 = new Style(this.d);
    localStyle5.setBorder(2, 1, Color.getBlack());
    localStyle5.setBorder(4, 1, Color.getBlack());
    localCell.a(localStyle5);
    localCell = this.b.a(this.a.j, this.a.k, false);
    localStyle5 = new Style(this.d);
    localStyle5.setBorder(1, 1, Color.getBlack());
    localStyle5.setBorder(8, 1, Color.getBlack());
    localCell.a(localStyle5);
    localCell = this.b.a(this.a.j, this.a.l, false);
    localStyle5 = new Style(this.d);
    localStyle5.setBorder(2, 1, Color.getBlack());
    localStyle5.setBorder(8, 1, Color.getBlack());
    localCell.a(localStyle5);
  }
  
  void a(zaca paramzaca)
    throws Exception
  {
    if ((this.a.d.h == null) || (this.a.d.h.a == null)) {
      return;
    }
    i();
    e();
    this.i = a(-1);
    b();
    e(paramzaca);
    d(paramzaca);
    a();
    Object localObject;
    if (!this.m)
    {
      localObject = new zaxg(this);
      ((zaxg)localObject).b();
      ((zaxg)localObject).d();
      g();
      f(paramzaca);
      ((zaxg)localObject).f();
      ((zaxg)localObject).e();
      this.a.ah = true;
    }
    else
    {
      d();
    }
    if (this.a.isAutoFormat())
    {
      localObject = new AutoFitterOptions();
      ((AutoFitterOptions)localObject).setIgnoreHidden(true);
      this.c.autoFitColumns(this.a.i, this.a.k, this.a.j, this.a.l, (AutoFitterOptions)localObject);
    }
  }
  
  void b(zaca paramzaca)
  {
    if (this.a.d.h == null) {
      return;
    }
    this.i = a(-1);
    b();
    e(paramzaca);
    d(paramzaca);
    a();
  }
  
  private boolean b(int paramInt1, int paramInt2)
  {
    int i1 = this.b.d(paramInt1, paramInt2);
    return (i1 != -1) && (i1 != 15);
  }
  
  private void e()
  {
    this.a.ad = ((int[][])null);
    this.a.ae = ((int[][])null);
    this.a.ac = null;
    int i1 = this.d.C().a(new Style(this.d));
    int i3;
    Cell localCell;
    for (int i2 = this.a.i; i2 <= this.a.j; i2++) {
      for (i3 = this.a.k; i3 <= this.a.l; i3++) {
        if (b(i2, i3))
        {
          localCell = this.b.a(i2, i3, false);
          localCell.b(i1);
        }
      }
    }
    if (this.v > 0)
    {
      CellArea localCellArea = h();
      i3 = 0;
      localCell = null;
      int i4;
      int i5;
      if (this.a.getPageFieldOrder() == 0) {
        for (i4 = localCellArea.StartColumn; (i4 <= localCellArea.EndColumn) && (i3 < this.v); i4 += 3) {
          for (i5 = localCellArea.StartRow; (i5 <= localCellArea.EndRow) && (i3 < this.v); i5++)
          {
            localCell = this.b.a(i5, i4, false);
            localCell.b(i1);
            localCell = this.b.a(i5, i4 + 1, false);
            localCell.b(i1);
            i3++;
          }
        }
      } else {
        for (i4 = localCellArea.StartRow; (i4 <= localCellArea.EndRow) && (i3 < this.v); i4++) {
          for (i5 = localCellArea.StartColumn; (i5 <= localCellArea.EndColumn) && (i3 < this.v); i5 += 3)
          {
            localCell = this.b.a(i4, i5, false);
            localCell.b(i1);
            localCell = this.b.a(i4, i5 + 1, false);
            localCell.b(i1);
            i3++;
          }
        }
      }
    }
  }
  
  void c(zaca paramzaca)
  {
    if ((this.a.d == null) || (this.a.d.h == null)) {
      return;
    }
    try
    {
      e();
      this.i = f();
      if (this.a.d.h.b == null) {
        this.a.refreshData();
      }
      b();
      e(paramzaca);
      if (!this.m)
      {
        zaxg localzaxg = new zaxg(this);
        localzaxg.b();
        localzaxg.d();
        localzaxg.c();
        d(paramzaca);
        localzaxg.a();
        localzaxg.f();
        localzaxg.e();
        this.a.ah = true;
      }
      else
      {
        e();
        d();
      }
    }
    catch (Exception localException)
    {
      this.a.ae = ((int[][])null);
      this.a.ad = ((int[][])null);
      this.a.ac = null;
    }
  }
  
  private void a(PivotField paramPivotField, int paramInt, Cell paramCell, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!this.a.D)
    {
      a(paramCell);
      return;
    }
    if (paramInt == 0)
    {
      if ((!paramPivotField.getShowCompact()) && (!this.a.v))
      {
        if ((paramPivotField.getDisplayName() != null) && (paramPivotField.getDisplayName().length() > 0)) {
          paramCell.putValue(paramPivotField.getDisplayName());
        } else {
          paramCell.putValue(paramPivotField.getName());
        }
      }
      else if (this.a.getRowHeaderCaption() != null) {
        paramCell.putValue(this.a.getRowHeaderCaption());
      } else {
        paramCell.putValue(this.J);
      }
    }
    else if ((paramPivotField.getDisplayName() != null) && (paramPivotField.getDisplayName().length() > 0)) {
      paramCell.putValue(paramPivotField.getDisplayName());
    } else {
      paramCell.putValue(paramPivotField.getName());
    }
    a(paramCell);
  }
  
  private void f(zaca paramzaca)
  {
    if (this.m) {
      return;
    }
    Cell localCell1 = null;
    Cell localCell2 = this.a.i;
    Cell localCell3 = this.a.k;
    Cell localCell4 = this.a.o;
    int i1 = this.a.m;
    int i2 = this.a.n;
    Cell localCell5;
    if (this.l)
    {
      Cell localCell6;
      Object localObject;
      if (this.u == 1)
      {
        localCell5 = (this.t != 0) || (this.a.isGridDropZones()) ? localCell3 : localCell4;
        localCell6 = this.b.a(localCell2, localCell5, false);
        localCell6.putValue(this.a.getDataFields().get(0).getDisplayName());
        a(localCell6);
        for (int i4 = localCell2; i4 < i2; i4++) {
          for (Cell localCell8 = localCell3; localCell8 < localCell4; localCell8++) {
            if ((i4 != localCell2) || (localCell8 != localCell5))
            {
              Style localStyle1 = f(i4, localCell8);
              if (localStyle1 != null)
              {
                localCell1 = this.b.a(i4, localCell8, false);
                a(localCell1, localStyle1);
              }
            }
          }
        }
      }
      else
      {
        for (localCell5 = localCell2; localCell5 < i2; localCell5++) {
          for (localCell6 = localCell3; localCell6 < localCell4; localCell6++)
          {
            localObject = f(localCell5, localCell6);
            if (localObject != null)
            {
              localCell1 = this.b.a(localCell5, localCell6, false);
              a(localCell1, (Style)localObject);
            }
          }
        }
      }
      if (this.t != 0)
      {
        localCell5 = localCell4;
        if (this.a.D)
        {
          for (Cell localCell7 = 0; localCell7 < this.t; localCell7++) {
            if (localCell4 + localCell7 <= this.a.l) {
              if ((localCell7 > 0) && (this.a.getColumnFields().get(localCell7 - 1).getShowCompact()) && (this.a.getColumnFields().get(localCell7 - 1).getShowInOutlineForm()))
              {
                localObject = f(localCell2, localCell4 + localCell7);
                if (localObject != null)
                {
                  localCell1 = this.b.a(localCell2, localCell4 + localCell7, false);
                  a(localCell1, (Style)localObject);
                }
              }
              else
              {
                localObject = this.a.getColumnFields().get(localCell7).getDisplayName();
                localCell1 = this.b.a(localCell2, localCell4 + localCell7, false);
                if (localCell7 == 0)
                {
                  if (this.a.v)
                  {
                    if (this.a.getColumnHeaderCaption() != null) {
                      localCell1.putValue(this.a.getColumnHeaderCaption());
                    } else {
                      localCell1.putValue(this.K);
                    }
                  }
                  else if ((localObject != null) && (((String)localObject).length() > 0)) {
                    localCell1.putValue((String)localObject);
                  } else {
                    localCell1.putValue(this.a.getColumnFields().get(localCell7).getName());
                  }
                }
                else if (!this.a.v) {
                  if ((localObject != null) && (((String)localObject).length() > 0)) {
                    localCell1.putValue((String)localObject);
                  } else {
                    localCell1.putValue(this.a.getColumnFields().get(localCell7).getName());
                  }
                }
                a(localCell1);
              }
            }
          }
          if (localCell4 + this.t <= this.a.l) {
            for (int i3 = localCell4 + this.t; i3 <= this.a.l; i3++)
            {
              localObject = f(localCell2, i3);
              if (localObject != null)
              {
                localCell1 = this.b.a(localCell2, i3, false);
                a(localCell1, (Style)localObject);
              }
            }
          }
          if (this.n) {
            if ((!this.a.isGridDropZones()) && (this.t == 1) && ((this.a.getColumnFields().get(0).c() < 0) || (this.a.getColumnFields().get(0).c() == 65534)) && (this.a.J)) {
              d(localCell2, localCell4);
            } else {
              d(localCell2 + 1, localCell4);
            }
          }
        }
        else if (this.n)
        {
          if ((this.a.isGridDropZones()) || ((this.u == 1) && (this.t > 0))) {
            d(localCell2 + 1, localCell4);
          } else {
            d(localCell2, localCell4);
          }
        }
      }
      else if ((this.n) && (this.u != 0))
      {
        if (this.a.getDataField() == null)
        {
          if ((this.S != null) && (this.S.size() != 0) && (localCell2 + 1 < this.a.n))
          {
            localCell1 = this.b.a(localCell2 + 1, localCell4, false);
            localCell1.putValue("Total");
            a(localCell1);
          }
        }
        else if ((this.S != null) && (this.S.size() != 0))
        {
          localCell1 = this.b.a(localCell2, localCell4, false);
          localCell1.putValue("Total");
          a(localCell1);
        }
      }
    }
    else if (this.n)
    {
      d(localCell2, localCell4);
    }
    if (this.s != 0)
    {
      localCell5 = localCell4;
      boolean bool1 = this.a.getRowFields().get(0).getShowCompact();
      boolean bool2 = this.a.getRowFields().get(0).getShowInOutlineForm();
      int i5 = 0;
      int i6 = 0;
      if ((this.a.getDataField() == null) && (this.a.isGridDropZones())) {
        i5 = localCell2 + 1;
      } else {
        i5 = localCell2;
      }
      for (int i7 = 0; i7 < this.s; i7++)
      {
        PivotField localPivotField = this.a.getRowFields().get(i7);
        if ((bool1) && (i7 > 0) && (bool2))
        {
          bool1 = this.a.getRowFields().get(i7).getShowCompact();
          bool2 = this.a.getRowFields().get(i7).getShowInOutlineForm();
          i6++;
        }
        else
        {
          if (this.t != 0)
          {
            if (this.a.getShowRowHeaderCaption()) {
              if ((this.t == 1) && ((this.a.getColumnFields().get(0).t == -2) || (this.a.getColumnFields().get(0).t == 65534)) && (this.a.J) && (!this.a.isGridDropZones()))
              {
                localCell1 = this.b.a(localCell2, localCell3 + i7 - i6, false);
                a(localPivotField, i7, localCell1, bool1, bool2);
              }
              else
              {
                localCell1 = this.b.a(localCell2 + 1 + this.t - 1, localCell3 + i7 - i6, false);
                a(localPivotField, i7, localCell1, bool1, bool2);
              }
            }
          }
          else
          {
            localCell1 = this.b.a(i5, localCell3 + i7 - i6, false);
            a(localPivotField, i7, localCell1, bool1, bool2);
          }
          bool1 = this.a.getRowFields().get(i7).getShowCompact();
          bool2 = this.a.getRowFields().get(i7).getShowInOutlineForm();
        }
      }
      if (this.n) {
        c(i2, localCell3);
      }
      int i8;
      if ((this.C & this.F))
      {
        i7 = this.S.size();
        for (i8 = 0; i8 < i7; i8++)
        {
          zbug localzbug1 = (zbug)this.S.get(i8);
          if (localzbug1.c != 14) {
            b(i2 + i8, localCell4, localzbug1, localzbug1.d, paramzaca);
          }
        }
      }
      else
      {
        i7 = this.S.size();
        i8 = this.T != null ? this.T.size() : 0;
        for (int i9 = 0; i9 < i7; i9++)
        {
          zbug localzbug2 = (zbug)this.S.get(i9);
          int i10 = localzbug2.c == 14 ? 1 : 0;
          int i11 = (localzbug2.b < this.s - 1) && (this.a.getRowFields().get(localzbug2.b).k()) && (this.a.getRowFields().get(localzbug2.b).getShowInOutlineForm()) && (localzbug2.c != 13) ? 1 : 0;
          int i12 = (localzbug2.c != 13) && (localzbug2.c()) && (!localzbug2.a()) && (((this.a.getDataField().getPosition() < this.s - 1) && (localzbug2.e - 1 <= this.a.getDataField().getPosition())) || ((this.a.getDataField().getPosition() == this.s - 1) && (localzbug2.e <= this.a.getDataField().getPosition()))) ? 1 : 0;
          if ((i10 != 0) || (i11 != 0) || (i12 != 0))
          {
            Cell localCell9 = null;
            for (Cell localCell10 = 0; localCell10 < i8; localCell10++)
            {
              Style localStyle2 = f(i2 + i9, localCell4 + localCell10);
              if (localStyle2 != null)
              {
                localCell9 = this.b.a(i2 + i9, localCell4 + localCell10, false);
                a(localCell9, localStyle2);
              }
            }
          }
          else
          {
            b(i2 + i9, localCell4, localzbug2, localzbug2.d, paramzaca);
          }
        }
      }
    }
    else if ((this.n) && (this.u != 0))
    {
      localCell1 = this.b.a(i2, localCell3, false);
      localCell1.putValue("Total");
      a(localCell1);
      if (this.G) {
        a(i2, localCell4, null, this.h, paramzaca);
      } else {
        b(i2, localCell4, null, this.h, paramzaca);
      }
    }
  }
  
  private Object a(PivotItem paramPivotItem)
  {
    if (paramPivotItem.getValue() == null)
    {
      if ((paramPivotItem.getName() != null) && (paramPivotItem.getName().length() > 0)) {
        return paramPivotItem.getName();
      }
      return this.I;
    }
    if ((paramPivotItem.getValue() instanceof DateTime)) {
      return (DateTime)paramPivotItem.getValue();
    }
    return paramPivotItem.getValue();
  }
  
  private int a(PivotFieldCollection paramPivotFieldCollection, int paramInt)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < paramInt; i2++)
    {
      PivotField localPivotField = paramPivotFieldCollection.get(i2);
      if (((localPivotField.getShowCompact()) && (localPivotField.getShowInOutlineForm())) || ((localPivotField.i()) && (this.a.x) && (this.a.v))) {
        i1++;
      }
    }
    return i1;
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    Cell localCell = null;
    int i1 = this.S.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      zbug localzbug = (zbug)this.S.get(i2);
      int i3;
      Object localObject1;
      if (localzbug.b > 0) {
        for (i3 = 0; i3 < localzbug.b; i3++)
        {
          localObject1 = this.a.getRowFields().get(i3);
          if ((((PivotField)localObject1).q) && (paramInt1 + i2 - 1 >= 0)) {
            this.b.a(paramInt1 + i2, paramInt2 + i3, false).copy(this.b.a(paramInt1 + i2 - 1, paramInt2 + i3, false));
          }
        }
      }
      if (localzbug.c == 14)
      {
        for (i3 = this.a.k; i3 < this.a.o; i3++)
        {
          localObject1 = f(paramInt1 + i2, i3);
          if (localObject1 != null)
          {
            localCell = this.b.a(paramInt1 + i2, i3, false);
            a(localCell, (Style)localObject1);
          }
        }
      }
      else
      {
        i3 = localzbug.b;
        int i9;
        int i10;
        Object localObject6;
        int i5;
        Object localObject5;
        Style localStyle2;
        if (localzbug.c())
        {
          Object localObject2;
          if (localzbug.a())
          {
            if (localzbug.b > 0) {
              for (int i4 = 0; i4 < localzbug.b; i4++) {
                if (i4 + paramInt2 < this.a.o)
                {
                  localObject2 = f(paramInt1 + i2, i4 + paramInt2);
                  if (localObject2 != null)
                  {
                    localCell = this.b.a(paramInt1 + i2, i4 + paramInt2, false);
                    a(localCell, (Style)localObject2);
                  }
                }
              }
            }
            PivotItem localPivotItem1 = this.a.getRowFields().get(i3).getPivotItems().get(localzbug.f[i3]);
            localObject2 = a(localPivotItem1);
            i9 = a(this.a.getRowFields(), i3);
            i10 = paramInt2 + i3 - i9;
            localCell = this.b.a(paramInt1 + i2, i10, false);
            if (localCell != null)
            {
              Style localStyle1 = a(this.a.getRowFields().get(i3), localPivotItem1);
              if (((localObject2 instanceof DateTime)) || (!localStyle1.s().equals("")) || (localStyle1.getNumber() != 0))
              {
                localCell.putValue(localObject2);
                localCell.setStyle(localStyle1);
                localObject2 = localCell.getStringValue();
              }
              if (localzbug.b < this.k)
              {
                int i13 = localzbug.d();
                localCell.putValue(localObject2 + " " + this.a.getDataFields().get(i13).getDisplayName());
              }
              else
              {
                localCell.putValue(localObject2 + localzbug.a(this.e));
              }
              a(localCell);
            }
            if (paramInt2 + i3 + 1 < this.a.o) {
              for (int i11 = paramInt2 + i3 + 1; i11 < this.a.o; i11++)
              {
                localObject6 = f(paramInt1 + i2, i11);
                if (localObject6 != null)
                {
                  localCell = this.b.a(paramInt1 + i2, i11, false);
                  a(localCell, (Style)localObject6);
                }
              }
            }
          }
          else if (localzbug.b())
          {
            if (this.u == 1)
            {
              localCell = this.b.a(paramInt1 + i2, paramInt2, false);
              localCell.putValue(this.a.getGrandTotalName());
            }
            else
            {
              i5 = localzbug.e();
              localCell = this.b.a(paramInt1 + i2, paramInt2, false);
              localCell.putValue(this.N + " " + this.a.getDataFields().get(i5).getDisplayName());
            }
            a(localCell);
            if (paramInt2 + 1 < this.a.o) {
              for (i5 = paramInt2 + 1; i5 < this.a.o; i5++)
              {
                localObject2 = f(paramInt1 + i2, i5);
                if (localObject2 != null)
                {
                  localCell = this.b.a(paramInt1 + i2, i5, false);
                  a(localCell, (Style)localObject2);
                }
              }
            }
          }
          else
          {
            if (localzbug.b > 0) {
              for (i5 = 0; i5 < localzbug.b; i5++) {
                if (i5 + paramInt2 < this.a.o)
                {
                  localObject2 = f(paramInt1 + i2, i5 + paramInt2);
                  if (localObject2 != null)
                  {
                    localCell = this.b.a(paramInt1 + i2, i5 + paramInt2, false);
                    a(localCell, (Style)localObject2);
                  }
                }
              }
            }
            if (localzbug.e + paramInt2 < this.a.o) {
              for (i5 = localzbug.e + paramInt2; i5 < this.a.o; i5++)
              {
                localObject2 = f(paramInt1 + i2, i5);
                if (localObject2 != null)
                {
                  localCell = this.b.a(paramInt1 + i2, i5, false);
                  a(localCell, (Style)localObject2);
                }
              }
            }
            for (i5 = localzbug.b; i5 < localzbug.e; i5++)
            {
              int i7 = a(this.a.getRowFields(), i5);
              i9 = paramInt2 + i5 - i7;
              if (i5 == this.k)
              {
                i10 = localzbug.d();
                if (i10 < this.u)
                {
                  localCell = this.b.a(paramInt1 + i2, i9, false);
                  localCell.putValue(this.a.getDataFields().get(i10).getDisplayName());
                  a(localCell);
                }
              }
              else
              {
                i10 = localzbug.f[i5];
                localObject5 = this.a.getRowFields().get(i5).getPivotItems().get(i10);
                localObject6 = a((PivotItem)localObject5);
                localCell = this.b.a(paramInt1 + i2, i9, false);
                if (localCell != null)
                {
                  localCell.putValue(localObject6);
                  localStyle2 = a(this.a.getRowFields().get(i5), (PivotItem)localObject5);
                  if (((localObject6 instanceof DateTime)) || (!localStyle2.s().equals("")) || (localStyle2.getNumber() != 0)) {
                    localCell.setStyle(localStyle2);
                  }
                  a(localCell);
                }
              }
            }
          }
        }
        else
        {
          Object localObject3;
          int i12;
          if (localzbug.a())
          {
            if (localzbug.b > 0) {
              for (i5 = 0; i5 < localzbug.b; i5++) {
                if (i5 + paramInt2 < this.a.o)
                {
                  localObject3 = f(paramInt1 + i2, i5 + paramInt2);
                  if (localObject3 != null)
                  {
                    localCell = this.b.a(paramInt1 + i2, i5 + paramInt2, false);
                    a(localCell, (Style)localObject3);
                  }
                }
              }
            }
            PivotItem localPivotItem2 = this.a.getRowFields().get(i3).getPivotItems().get(localzbug.f[i3]);
            localObject3 = a(localPivotItem2);
            i9 = a(this.a.getRowFields(), i3);
            i10 = paramInt2 + i3 - i9;
            localCell = this.b.a(paramInt1 + i2, i10, false);
            if (localCell != null)
            {
              localObject5 = a(this.a.getRowFields().get(i3), localPivotItem2);
              if (((localObject3 instanceof DateTime)) || (!((Style)localObject5).s().equals("")) || (((Style)localObject5).getNumber() != 0))
              {
                localCell.putValue(localObject3);
                localCell.a((Style)localObject5);
                localObject3 = localCell.getStringValue();
              }
              localCell.putValue(localObject3 + localzbug.a(this.e));
              a(localCell);
            }
            if (paramInt2 + i3 + 1 < this.a.o) {
              for (i12 = paramInt2 + i3 + 1; i12 < this.a.o; i12++)
              {
                localObject6 = f(paramInt1 + i2, i12);
                if (localObject6 != null)
                {
                  localCell = this.b.a(paramInt1 + i2, i12, false);
                  a(localCell, (Style)localObject6);
                }
              }
            }
          }
          else
          {
            int i6;
            if (localzbug.b())
            {
              if (localzbug.b > 0) {
                for (i6 = 0; i6 < localzbug.b; i6++) {
                  if (i6 + paramInt2 < this.a.o)
                  {
                    localObject3 = f(paramInt1 + i2, i6 + paramInt2);
                    if (localObject3 != null)
                    {
                      localCell = this.b.a(paramInt1 + i2, i6 + paramInt2, false);
                      a(localCell, (Style)localObject3);
                    }
                  }
                }
              }
              localCell = this.b.a(paramInt1 + i2, paramInt2 + i3, false);
              if ((this.a.e != null) && (this.a.e.b != null)) {
                localCell.putValue(this.a.e.b);
              } else {
                localCell.putValue(this.a.getGrandTotalName());
              }
              a(localCell);
              if (paramInt2 + i3 + 1 < this.a.o) {
                for (i6 = paramInt2 + i3 + 1; i6 < this.a.o; i6++)
                {
                  localObject3 = f(paramInt1 + i2, i6);
                  if (localObject3 != null)
                  {
                    localCell = this.b.a(paramInt1 + i2, i6, false);
                    a(localCell, (Style)localObject3);
                  }
                }
              }
            }
            else
            {
              if (localzbug.b > 0) {
                for (i6 = 0; i6 < localzbug.b; i6++) {
                  if (i6 + paramInt2 < this.a.o)
                  {
                    localObject3 = f(paramInt1 + i2, i6 + paramInt2);
                    if (localObject3 != null)
                    {
                      localCell = this.b.a(paramInt1 + i2, i6 + paramInt2, false);
                      a(localCell, (Style)localObject3);
                    }
                  }
                }
              }
              if (localzbug.e + paramInt2 < this.a.o) {
                for (i6 = localzbug.e + paramInt2; i6 < this.a.o; i6++)
                {
                  localObject3 = f(paramInt1 + i2, i6);
                  if (localObject3 != null)
                  {
                    localCell = this.b.a(paramInt1 + i2, i6, false);
                    a(localCell, (Style)localObject3);
                  }
                }
              }
              for (i6 = localzbug.b; i6 < localzbug.e; i6++)
              {
                int i8 = localzbug.f[i6];
                PivotItem localPivotItem3 = this.a.getRowFields().get(i6).getPivotItems().get(i8);
                Object localObject4 = a(localPivotItem3);
                i12 = a(this.a.getRowFields(), i6);
                int i14 = paramInt2 + i6 - i12;
                if ((i6 > 0) && (this.a.getRowFields().get(i6 - 1).getShowInOutlineForm()) && (this.a.getRowFields().get(i6 - 1).getShowCompact()))
                {
                  localCell = this.b.a(paramInt1 + i2, i14, false);
                  localCell.putValue(localObject4);
                }
                else
                {
                  localCell = this.b.a(paramInt1 + i2, i14, false);
                  localCell.putValue(localObject4);
                }
                localStyle2 = a(this.a.getRowFields().get(i6), localPivotItem3);
                if (((localObject4 instanceof DateTime)) || (!localStyle2.s().equals("")) || (localStyle2.getNumber() != 0))
                {
                  if (((localObject4 instanceof DateTime)) && (localStyle2.getNumber() == 0)) {
                    localStyle2.setNumber(14);
                  }
                  if (localCell != null) {
                    localCell.setStyle(localStyle2);
                  }
                }
                a(localCell);
              }
            }
          }
        }
      }
    }
  }
  
  private Style a(PivotField paramPivotField, PivotItem paramPivotItem)
  {
    Style localStyle = new Style();
    int i1 = paramPivotField.d.d;
    String str = paramPivotField.d.e;
    if (zw.b(str))
    {
      if (i1 != 0)
      {
        localStyle.setNumber(i1);
      }
      else if ("".equals(paramPivotField.getNumberFormat()))
      {
        str = this.e.getWorksheets().g(paramPivotItem.d().q);
        if ("".equals(str)) {
          localStyle.setNumber(paramPivotItem.d().q);
        } else {
          localStyle.b(str);
        }
      }
      else
      {
        localStyle.b(paramPivotField.getNumberFormat());
      }
    }
    else {
      localStyle.b(str);
    }
    return localStyle;
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    if (!this.l)
    {
      localCell = null;
      if (this.u == 0)
      {
        localCell = this.b.a(paramInt1, paramInt2, false);
        localCell.putValue("Total");
        a(localCell);
      }
      else
      {
        for (i1 = 0; i1 < this.u; i1++)
        {
          localCell = this.b.a(paramInt1, paramInt2 + i1, false);
          localCell.putValue(this.a.getDataFields().get(i1).getDisplayName());
          a(localCell);
        }
      }
      return;
    }
    Cell localCell = null;
    int i1 = this.T.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      zbug localzbug = (zbug)this.T.get(i2);
      if (localzbug.b > 0) {
        for (i3 = 0; i3 < localzbug.b; i3++)
        {
          PivotField localPivotField = this.a.getColumnFields().get(i3);
          if ((localPivotField.q) && (paramInt2 + i2 - 1 >= 0)) {
            this.b.a(paramInt1 + i3, paramInt2 + i2, false).copy(this.b.a(paramInt1 + i3, paramInt2 + i2 - 1, false));
          }
        }
      }
      int i3 = localzbug.b;
      Object localObject1;
      Object localObject2;
      Style localStyle3;
      int i5;
      if (localzbug.c())
      {
        if (localzbug.a())
        {
          if (localzbug.b > 0) {
            for (int i4 = 0; i4 < localzbug.b; i4++)
            {
              localObject1 = f(paramInt1 + i4, i2 + paramInt2);
              if (localObject1 != null)
              {
                localCell = this.b.a(paramInt1 + i4, i2 + paramInt2, false);
                a(localCell, (Style)localObject1);
              }
            }
          }
          PivotItem localPivotItem1 = this.a.getColumnFields().get(i3).getPivotItems().get(localzbug.f[i3]);
          localObject1 = a(localPivotItem1);
          localCell = this.b.a(paramInt1 + i3, paramInt2 + i2, false);
          localObject2 = a(this.a.getColumnFields().get(i3), localPivotItem1);
          if (((localObject1 instanceof DateTime)) || (!((Style)localObject2).s().equals("")) || (((Style)localObject2).getNumber() != 0))
          {
            localCell.putValue(localObject1);
            localCell.setStyle((Style)localObject2);
            localObject1 = localCell.getStringValue();
          }
          int i7;
          if (localzbug.b < this.k)
          {
            i7 = localzbug.d();
            localCell.putValue(localObject1 + " " + this.a.getDataFields().get(i7).getDisplayName());
          }
          else
          {
            localCell.putValue(localObject1 + localzbug.a(this.e));
          }
          a(localCell);
          if (paramInt1 + i3 + 1 < this.a.n) {
            for (i7 = paramInt1 + i3 + 1; i7 < this.a.n; i7++)
            {
              localStyle3 = f(i7, i2 + paramInt2);
              if (localStyle3 != null)
              {
                localCell = this.b.a(i7, i2 + paramInt2, false);
                a(localCell, localStyle3);
              }
            }
          }
        }
        else if (localzbug.b())
        {
          localCell = this.b.a(paramInt1, paramInt2 + i2, false);
          if (this.a.getDataField() == null) {
            localCell.putValue(this.a.getGrandTotalName());
          } else {
            localCell.putValue(this.N + " " + this.a.getDataFields().get(localzbug.d()).getDisplayName());
          }
          a(localCell);
          for (i5 = paramInt1 + 1; i5 < this.a.n; i5++)
          {
            localObject1 = f(i5, paramInt2 + i2);
            if (localObject1 != null)
            {
              localCell = this.b.a(i5, paramInt2 + i2, false);
              a(localCell, (Style)localObject1);
            }
          }
        }
        else
        {
          if (localzbug.b > 0) {
            for (i5 = 0; i5 < localzbug.b; i5++)
            {
              localObject1 = f(paramInt1 + i5, i2 + paramInt2);
              if (localObject1 != null)
              {
                localCell = this.b.a(paramInt1 + i5, i2 + paramInt2, false);
                a(localCell, (Style)localObject1);
              }
            }
          }
          if (localzbug.e + paramInt1 < this.a.n) {
            for (i5 = localzbug.e + paramInt1; i5 < this.a.n; i5++)
            {
              localObject1 = f(i5, i2 + paramInt2);
              if (localObject1 != null)
              {
                localCell = this.b.a(i5, i2 + paramInt2, false);
                a(localCell, (Style)localObject1);
              }
            }
          }
          for (i3 = localzbug.b; i3 < localzbug.e; i3++) {
            if (i3 == this.k)
            {
              i5 = localzbug.d();
              localCell = this.b.a(paramInt1 + i3, paramInt2 + i2, false);
              localCell.putValue(this.a.getDataFields().get(i5).getDisplayName());
              a(localCell);
            }
            else
            {
              i5 = localzbug.f[i3];
              localObject1 = this.a.getColumnFields().get(i3).getPivotItems().get(i5);
              localCell = this.b.a(paramInt1 + i3, paramInt2 + i2, false);
              localObject2 = a((PivotItem)localObject1);
              localCell.putValue(localObject2);
              Style localStyle1 = a(this.a.getColumnFields().get(i3), (PivotItem)localObject1);
              if (((localObject2 instanceof DateTime)) || (!localStyle1.s().equals("")) || (localStyle1.getNumber() != 0)) {
                localCell.setStyle(localStyle1);
              }
              a(localCell);
            }
          }
        }
      }
      else if (localzbug.a())
      {
        if (localzbug.b > 0) {
          for (i5 = 0; i5 < localzbug.b; i5++)
          {
            localObject1 = f(paramInt1 + i5, i2 + paramInt2);
            if (localObject1 != null)
            {
              localCell = this.b.a(paramInt1 + i5, i2 + paramInt2, false);
              a(localCell, (Style)localObject1);
            }
          }
        }
        PivotItem localPivotItem2 = this.a.getColumnFields().get(i3).getPivotItems().get(localzbug.f[i3]);
        localObject1 = a(localPivotItem2);
        localCell = this.b.a(paramInt1 + i3, paramInt2 + i2, false);
        localObject2 = a(this.a.getColumnFields().get(i3), localPivotItem2);
        if (((localObject1 instanceof DateTime)) || (!((Style)localObject2).s().equals("")) || (((Style)localObject2).getNumber() != 0))
        {
          localCell.putValue(localObject1);
          localCell.setStyle((Style)localObject2);
          localObject1 = localCell.getStringValue();
        }
        localCell.putValue(localObject1 + localzbug.a(this.e));
        a(localCell);
        if (paramInt1 + i3 + 1 < this.a.n) {
          for (int i8 = paramInt1 + i3 + 1; i8 < this.a.n; i8++)
          {
            localStyle3 = f(i8, i2 + paramInt2);
            if (localStyle3 != null)
            {
              localCell = this.b.a(i8, i2 + paramInt2, false);
              a(localCell, localStyle3);
            }
          }
        }
      }
      else
      {
        int i6;
        if (localzbug.b())
        {
          if (localzbug.b > 0) {
            for (i6 = 0; i6 < localzbug.b; i6++)
            {
              localObject1 = f(paramInt1 + i6, i2 + paramInt2);
              if (localObject1 != null)
              {
                localCell = this.b.a(paramInt1 + i6, i2 + paramInt2, false);
                a(localCell, (Style)localObject1);
              }
            }
          }
          localCell = this.b.a(paramInt1 + i3, paramInt2 + i2, false);
          localCell.putValue(this.a.getGrandTotalName());
          a(localCell);
          if (paramInt1 + i3 + 1 < this.a.n) {
            for (i6 = paramInt1 + i3 + 1; i6 < this.a.n; i6++)
            {
              localObject1 = f(i6, i2 + paramInt2);
              if (localObject1 != null)
              {
                localCell = this.b.a(i6, i2 + paramInt2, false);
                a(localCell, (Style)localObject1);
              }
            }
          }
        }
        else
        {
          if (localzbug.b > 0) {
            for (i6 = 0; i6 < localzbug.b; i6++)
            {
              localObject1 = f(paramInt1 + i6, i2 + paramInt2);
              if (localObject1 != null)
              {
                localCell = this.b.a(paramInt1 + i6, i2 + paramInt2, false);
                a(localCell, (Style)localObject1);
              }
            }
          }
          if (localzbug.e + paramInt1 < this.a.n) {
            for (i6 = localzbug.e + paramInt1; i6 < this.a.n; i6++)
            {
              localObject1 = f(i6, i2 + paramInt2);
              if (localObject1 != null)
              {
                localCell = this.b.a(i6, i2 + paramInt2, false);
                a(localCell, (Style)localObject1);
              }
            }
          }
          for (i3 = localzbug.b; i3 < localzbug.e; i3++)
          {
            i6 = localzbug.f[i3];
            localObject1 = this.a.getColumnFields().get(i3).getPivotItems().get(i6);
            localCell = this.b.a(paramInt1 + i3, paramInt2 + i2, false);
            localObject2 = a((PivotItem)localObject1);
            localCell.putValue(localObject2);
            Style localStyle2 = a(this.a.getColumnFields().get(i3), (PivotItem)localObject1);
            if (((localObject2 instanceof DateTime)) || (!localStyle2.s().equals("")) || (localStyle2.getNumber() != 0)) {
              localCell.setStyle(localStyle2);
            }
            a(localCell);
          }
        }
      }
    }
  }
  
  private boolean a(zbug paramzbug, PivotFieldCollection paramPivotFieldCollection)
  {
    PivotItem localPivotItem = null;
    for (int i1 = paramzbug.b; i1 < paramzbug.e; i1++)
    {
      localPivotItem = paramPivotFieldCollection.get(i1).getPivotItems().get(paramzbug.f[i1]);
      if (localPivotItem.b()) {
        return true;
      }
    }
    if (paramzbug.c != 0)
    {
      int i2;
      if (paramPivotFieldCollection.getType() == 1)
      {
        i1 = this.D.length;
        for (i2 = paramzbug.b + paramzbug.e; i2 < i1; i2++) {
          if (this.D[i2] != 0) {
            return true;
          }
        }
      }
      else
      {
        i1 = this.E.length;
        for (i2 = paramzbug.b + paramzbug.e; i2 < i1; i2++) {
          if (this.E[i2] != 0) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private PivotField a(zbug paramzbug1, zbug paramzbug2)
  {
    if ((this.a.getDataFields() == null) || (this.u == 0)) {
      return null;
    }
    if ((paramzbug1 != null) && (paramzbug1.c())) {
      return this.a.getDataFields().get(paramzbug1.d());
    }
    if ((paramzbug2 != null) && (paramzbug2.c())) {
      return this.a.getDataFields().get(paramzbug2.d());
    }
    return this.a.getDataFields().get(0);
  }
  
  private void a(int paramInt1, int paramInt2, zbug paramzbug, ArrayList paramArrayList, zaca paramzaca)
  {
    if ((paramzbug != null) && (a(paramzbug, this.a.getRowFields()))) {
      return;
    }
    PivotFieldCollection localPivotFieldCollection = this.a.getColumnFields();
    if (paramzbug != null)
    {
      if (paramzbug.c == 14) {
        return;
      }
      if ((paramzbug.c == 0) && (paramzbug.e < paramzbug.f.length) && (paramzbug.b != paramzbug.f.length - 1)) {
        return;
      }
      paramArrayList = b(paramArrayList, paramzbug, this.j == 1, this.a.getRowFields());
    }
    Cell localCell = null;
    if ((this.T == null) || (this.T.size() == 0))
    {
      zaie localzaie1 = a(null, null, paramArrayList, true, a(paramzbug, null), 0, null, paramzaca);
      localzaie1 = a(localzaie1);
      localCell = a(paramInt1, paramInt2, localzaie1);
      a(paramInt1, paramInt2, localCell);
      return;
    }
    int i1 = this.T.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      zbug localzbug1 = (zbug)this.T.get(i2);
      ArrayList localArrayList;
      zaie localzaie2;
      int i3;
      int i4;
      if (localzbug1.b())
      {
        localArrayList = new ArrayList();
        localzaie2 = null;
        i3 = 0;
        zbug localzbug2;
        int[] arrayOfInt1;
        int i7;
        if ((this.t > 0) && (localPivotFieldCollection.get(0).isAutoSubtotals())) {
          for (i4 = i2 - 1; i4 >= 0; i4--)
          {
            localzbug2 = (zbug)this.T.get(i2);
            if ((localzbug2.a()) && (localzbug2.b == 0))
            {
              localCell = this.b.checkCell(paramInt1, paramInt2 + i4);
              if ((localCell != null) && (!localCell.d()))
              {
                arrayOfInt1 = new int[] { i3 };
                i7 = !zaxc.a(localArrayList, localCell, arrayOfInt1) ? 1 : 0;
                i3 = arrayOfInt1[0];
                if (i7 != 0)
                {
                  localzaie2 = zabt.a(localCell.c.e(), paramzaca);
                  break;
                }
              }
            }
          }
        } else {
          for (i4 = i2 - 1; i4 >= 0; i4--)
          {
            localzbug2 = (zbug)this.T.get(i2);
            if (!localzbug2.a())
            {
              localCell = this.b.checkCell(paramInt1, paramInt2 + i4);
              if ((localCell != null) && (!localCell.d()))
              {
                arrayOfInt1 = new int[] { i3 };
                i7 = !zaxc.a(localArrayList, localCell, arrayOfInt1) ? 1 : 0;
                i3 = arrayOfInt1[0];
                if (i7 != 0)
                {
                  localzaie2 = zabt.a(localCell.c.e(), paramzaca);
                  break;
                }
              }
            }
          }
        }
        if (localzaie2 != null) {
          localCell = a(paramInt1, paramInt2 + i2, a(localzaie2));
        } else {
          localCell = a(paramInt1, paramInt2 + i2, zaxd.a(a(paramzbug, localzbug1).getFunction(), i3, localArrayList, false));
        }
        a(paramInt1, paramInt2 + i2, localCell);
      }
      else if (localzbug1.a())
      {
        localArrayList = new ArrayList();
        localzaie2 = null;
        i3 = 0;
        i4 = localzbug1.b;
        int i5 = 1;
        int i6;
        zbug localzbug3;
        int i10;
        if ((i4 == this.t - 1) || (!localPivotFieldCollection.get(i4 + 1).isAutoSubtotals())) {
          for (i6 = i2 - 1; i6 >= 0; i6--)
          {
            localzbug3 = (zbug)this.T.get(i6);
            if (localzbug3.a()) {
              break;
            }
            i5 = 1;
            for (int i8 = 0; i8 <= i4; i8++) {
              if (localzbug1.f[i8] != localzbug3.f[i8])
              {
                i5 = 0;
                break;
              }
            }
            if (i5 != 0)
            {
              localCell = this.b.checkCell(paramInt1, paramInt2 + i6);
              if ((localCell != null) && (!localCell.d()))
              {
                int[] arrayOfInt2 = { i3 };
                i10 = !zaxc.a(localArrayList, localCell, arrayOfInt2) ? 1 : 0;
                i3 = arrayOfInt2[0];
                if (i10 != 0)
                {
                  localzaie2 = zabt.a(localCell.c.e(), paramzaca);
                  break;
                }
              }
            }
          }
        } else {
          for (i6 = i2 - 1; i6 >= 0; i6--)
          {
            localzbug3 = (zbug)this.T.get(i6);
            if (localzbug3.a())
            {
              i5 = 1;
              for (int i9 = 0; i9 <= i4; i9++) {
                if (localzbug1.f[i9] != localzbug3.f[i9])
                {
                  i5 = 0;
                  break;
                }
              }
              if (i5 != 0)
              {
                localCell = this.b.checkCell(paramInt1, paramInt2 + i6);
                if ((localCell != null) && (!localCell.d()))
                {
                  int[] arrayOfInt3 = { i3 };
                  i10 = !zaxc.a(localArrayList, localCell, arrayOfInt3) ? 1 : 0;
                  i3 = arrayOfInt3[0];
                  if (i10 != 0)
                  {
                    localzaie2 = zabt.a(localCell.c.e(), paramzaca);
                    break;
                  }
                }
              }
            }
          }
        }
        if (localzaie2 != null) {
          localCell = a(paramInt1, paramInt2 + i2, a(localzaie2));
        } else {
          localCell = a(paramInt1, paramInt2 + i2, zaxd.a(a(paramzbug, localzbug1).getFunction(), i3, localArrayList, false));
        }
        a(paramInt1, paramInt2 + i2, localCell);
      }
      else if (a(localzbug1, this.a.getColumnFields()))
      {
        localArrayList = a(paramArrayList, localzbug1, this.j == 2, this.a.getColumnFields());
        localCell = this.b.a(paramInt1, paramInt2 + i2, false);
        localCell.putValue(a(localArrayList, true, paramzbug, localzbug1));
        a(localCell);
      }
      else
      {
        localArrayList = b(paramArrayList, localzbug1, this.j == 2, this.a.getColumnFields());
        localzaie2 = a(null, null, localArrayList, true, a(paramzbug, localzbug1), 0, null, paramzaca);
        localzaie2 = a(localzaie2);
        localCell = a(paramInt1, paramInt2 + i2, localzaie2);
        a(paramInt1, paramInt2 + i2, localCell);
      }
    }
  }
  
  private Cell a(int paramInt1, int paramInt2, zaie paramzaie)
  {
    int i1 = 0;
    Object localObject = paramzaie.c();
    switch (paramzaie.b())
    {
    case 1: 
      i1 = 2;
      break;
    case 3: 
      i1 = 1;
      break;
    case 0: 
      i1 = 3;
      break;
    case 2: 
      localCell = this.b.a(paramInt1, paramInt2, false);
      localCell.a((String)paramzaie.c());
      return localCell;
    }
    if (i1 == 0)
    {
      localCell = this.b.checkCell(paramInt1, paramInt2);
      if (localCell != null) {
        localCell.a(i1, localObject, true);
      }
      return localCell;
    }
    Cell localCell = this.b.a(paramInt1, paramInt2, false);
    localCell.a(i1, localObject, true);
    return localCell;
  }
  
  private zaie a(zaie paramzaie)
  {
    switch (paramzaie.b())
    {
    case 0: 
      if (this.a.getDisplayErrorString())
      {
        if (this.a.getErrorString().equals("-")) {
          return zabb.a;
        }
        if (this.a.getErrorString().equals("")) {
          return zabg.a;
        }
        return new zabp(this.a.getErrorString());
      }
      break;
    case 12: 
      if (this.a.getDisplayNullString())
      {
        if ("".equals(this.a.getNullString())) {
          return zabg.a;
        }
        return new zabp(this.a.getNullString());
      }
      break;
    case 2: 
      if (((zabp)paramzaie).p()) {
        return zabg.a;
      }
      break;
    }
    return paramzaie;
  }
  
  private void b(int paramInt1, int paramInt2, zbug paramzbug, ArrayList paramArrayList, zaca paramzaca)
  {
    this.p = (paramInt1 - this.a.n);
    PivotField localPivotField = null;
    ArrayList localArrayList1 = null;
    Cell localCell = null;
    if (paramzbug != null)
    {
      if (paramzbug.c == 14) {
        return;
      }
      if (paramArrayList == null)
      {
        if ((!paramzbug.b()) && ((paramzbug.e() >= this.s) || (!this.a.getRowFields().get(paramzbug.e()).getShowSubtotalAtTop()))) {
          return;
        }
        paramArrayList = b(this.h, paramzbug, this.j == 1, this.a.getRowFields());
      }
    }
    int i9;
    Object localObject3;
    if ((this.T == null) || (this.T.size() == 0))
    {
      localPivotField = a(paramzbug, null);
      if (localPivotField != null)
      {
        Object localObject1 = zabg.a;
        Object localObject2;
        if ((paramzbug != null) && ((paramzbug.a()) || (paramzbug.b())) && (this.a.d.m != null) && (this.a.d.m.getCount() > 0))
        {
          int i2 = paramInt2 - this.a.o;
          int i4 = 0;
          int i5 = 0;
          if (paramzbug.b())
          {
            i4 = this.S.size() - 1;
            i5 = 0;
          }
          else
          {
            i4 = paramInt1;
            for (int i6 = paramInt1 - 1; i6 >= 0; i6--) {
              if (((zbug)this.T.get(i6)).a())
              {
                i5 = i6 + 1;
                break;
              }
            }
          }
          double d1 = 0.0D;
          for (i9 = i5; i9 < i4; i9++) {
            d1 += this.O[i9][i2];
          }
          localObject1 = zabt.a(d1);
        }
        else if (c(paramzbug, this.a.getRowFields()))
        {
          localObject2 = b(paramzbug, this.a.getRowFields());
          if ((((zawz)localObject2).getCount() > 0) && (paramArrayList.size() > 0))
          {
            this.r = true;
            localObject3 = a(paramArrayList, ((zawz)localObject2).a(0));
            localObject1 = a(((zawz)localObject2).a(0), (zawz)localObject2, 0, localPivotField, (ArrayList)localObject3, paramzaca);
            this.r = false;
          }
        }
        else
        {
          localObject1 = a(null, null, paramArrayList, true, localPivotField, 0, null, paramzaca);
        }
        localObject1 = a((zaie)localObject1);
        localCell = a(paramInt1, paramInt2, (zaie)localObject1);
        if ((this.O != null) && (((zaie)localObject1).b() == 3) && (!paramzbug.a()) && (!paramzbug.b())) {
          this.O[(paramInt1 - this.a.n)][(paramInt2 - this.a.o)] = ((Double)((zaie)localObject1).c()).doubleValue();
        }
        if (!"".equals(localPivotField.getNumberFormat()))
        {
          if (localCell == null) {
            localCell = this.b.a(paramInt1, paramInt2, false);
          }
          localObject2 = new Style();
          ((Style)localObject2).b(localPivotField.getNumberFormat());
          localCell.setStyle((Style)localObject2);
        }
        else if (localPivotField.getNumber() != 0)
        {
          if (localCell == null) {
            localCell = this.b.a(paramInt1, paramInt2, false);
          }
          localObject2 = new Style();
          ((Style)localObject2).setNumber(localPivotField.getNumber());
          localCell.setStyle((Style)localObject2);
        }
        a(paramInt1, paramInt2, localCell);
      }
      return;
    }
    int i1 = this.T.size();
    for (int i3 = 0; i3 < i1; i3++)
    {
      localObject3 = (zbug)this.T.get(i3);
      localPivotField = a(paramzbug, (zbug)localObject3);
      if (localPivotField != null)
      {
        if (paramArrayList == null) {
          localArrayList1 = b(this.h, (zbug)localObject3, this.j == 2, this.a.getColumnFields());
        } else {
          localArrayList1 = b(paramArrayList, (zbug)localObject3, this.j == 2, this.a.getColumnFields());
        }
        Object localObject4 = zabg.a;
        Object localObject5;
        if ((localObject3 != null) && ((((zbug)localObject3).a()) || (((zbug)localObject3).b())) && (this.a.d.m != null) && (this.a.d.m.getCount() > 0))
        {
          int i7 = paramInt1 - this.a.n;
          int i8 = 0;
          i9 = 0;
          if (((zbug)localObject3).b())
          {
            i8 = this.T.size() - 1;
            i9 = 0;
          }
          else
          {
            i8 = i3;
            for (int i10 = i3 - 1; i10 >= 0; i10--) {
              if (((zbug)this.T.get(i10)).a())
              {
                i9 = i10 + 1;
                break;
              }
            }
          }
          double d2 = 0.0D;
          for (int i11 = i9; i11 < i8; i11++) {
            d2 += this.O[i7][i11];
          }
          localObject4 = zabt.a(d2);
        }
        else if (c((zbug)localObject3, this.a.getColumnFields()))
        {
          localObject5 = b((zbug)localObject3, this.a.getColumnFields());
          if ((((zawz)localObject5).getCount() > 0) && (localArrayList1.size() > 0))
          {
            this.r = true;
            ArrayList localArrayList2 = a(localArrayList1, ((zawz)localObject5).a(0));
            localObject4 = a(((zawz)localObject5).a(0), (zawz)localObject5, 0, localPivotField, localArrayList2, paramzaca);
            this.r = false;
          }
        }
        else
        {
          localObject4 = a(null, null, localArrayList1, true, localPivotField, i3, (zbug)localObject3, paramzaca);
        }
        localObject4 = a((zaie)localObject4);
        localCell = a(paramInt1, paramInt2 + i3, (zaie)localObject4);
        if ((this.O != null) && (((zaie)localObject4).b() == 3) && (!((zbug)localObject3).a()) && (!((zbug)localObject3).b())) {
          this.O[(paramInt1 - this.a.n)][(paramInt2 + i3 - this.a.o)] = ((Double)((zaie)localObject4).c()).doubleValue();
        }
        if (!"".equals(localPivotField.getNumberFormat()))
        {
          if (localCell == null) {
            localCell = this.b.a(paramInt1, paramInt2 + i3, false);
          }
          localObject5 = new Style();
          ((Style)localObject5).b(localPivotField.getNumberFormat());
          localCell.setStyle((Style)localObject5);
        }
        else if (localPivotField.getNumber() != 0)
        {
          if (localCell == null) {
            localCell = this.b.a(paramInt1, paramInt2 + i3, false);
          }
          localObject5 = new Style();
          ((Style)localObject5).setNumber(localPivotField.getNumber());
          localCell.setStyle((Style)localObject5);
        }
        a(paramInt1, paramInt2 + i3, localCell);
      }
    }
  }
  
  zaie a(int paramInt, zaca paramzaca)
  {
    if ((this.a.d.B == null) || (this.a.d.C == null) || (this.a.d.D >= this.a.d.C.getCount())) {
      return zabg.a;
    }
    ArrayList localArrayList1 = this.a.d.E;
    zawz localzawz = this.a.d.C;
    int i1 = this.a.d.D;
    Object localObject2;
    int i7;
    if (i1 < localzawz.getCount() - 1)
    {
      localObject1 = localzawz.a(i1);
      int i2 = i1 + 1;
      ArrayList localArrayList3 = new ArrayList();
      localObject2 = ((zaxa)localObject1).e.a(paramInt);
      for (int i5 = 0; i5 < localArrayList1.size(); i5++)
      {
        localObject3 = (zfa)localArrayList1.get(i5);
        i7 = 0;
        zbul localzbul = ((zbui)localObject2).b();
        int i9 = localzbul.getCount();
        for (int i10 = 0; i10 < i9; i10++)
        {
          zbuj localzbuj2 = localzbul.a(i10);
          if (((Integer)localObject3.a[(localzbuj2.a & 0xFFFF)]).intValue() == localzbuj2.b)
          {
            i7 = 1;
            break;
          }
        }
        if (i7 != 0) {
          zf.a(localArrayList3, localObject3);
        }
      }
      this.a.d.D = i2;
      this.a.d.E = localArrayList3;
      zaie localzaie = a(((zaxa)localObject1).c, paramzaca);
      this.a.d.D = i1;
      this.a.d.E = localArrayList1;
      return localzaie;
    }
    Object localObject1 = localzawz.a(i1).e.a(paramInt);
    ArrayList localArrayList2 = new ArrayList();
    for (int i3 = 0; i3 < localArrayList1.size(); i3++)
    {
      localObject2 = (zfa)localArrayList1.get(i3);
      int i6 = 0;
      localObject3 = ((zbui)localObject1).b();
      i7 = ((zbul)localObject3).getCount();
      for (int i8 = 0; i8 < i7; i8++)
      {
        zbuj localzbuj1 = ((zbul)localObject3).a(i8);
        if (((Integer)localObject2.a[(localzbuj1.a & 0xFFFF)]).intValue() == localzbuj1.b)
        {
          i6 = 1;
          break;
        }
      }
      if (i6 != 0) {
        zf.a(localArrayList2, localObject2);
      }
    }
    i3 = 0;
    int i4 = 0;
    PivotField localPivotField = this.a.getBaseFields().get(this.a.d.B.w());
    Object localObject3 = { i3 };
    boolean[] arrayOfBoolean = { i4 };
    ArrayList localArrayList4 = zaxc.a(localArrayList2, false, localPivotField, this.B, 0, this.a.d, 0, null, (int[])localObject3, arrayOfBoolean);
    i3 = localObject3[0];
    i4 = arrayOfBoolean[0];
    return zaxd.a(0, i3, localArrayList4, i4);
  }
  
  private ArrayList a(ArrayList paramArrayList, zaxa paramzaxa)
  {
    zbun localzbun = paramzaxa.e;
    int i1 = localzbun.getCount();
    for (int i2 = 0; i2 < paramArrayList.size(); i2++)
    {
      zfa localzfa = (zfa)paramArrayList.get(i2);
      int i3 = 0;
      for (int i4 = 0; i4 < i1; i4++)
      {
        zbul localzbul = localzbun.a(i4).b();
        int i5 = localzbul.getCount();
        for (int i6 = 0; i6 < i5; i6++)
        {
          zbuj localzbuj = localzbul.a(i6);
          if (((Integer)localzfa.a[(localzbuj.a & 0xFFFF)]).intValue() == localzbuj.b)
          {
            i3 = 1;
            break;
          }
        }
        if (i3 != 0) {
          break;
        }
      }
      if (i3 == 0)
      {
        paramArrayList.remove(i2);
        i2--;
      }
    }
    return paramArrayList;
  }
  
  private zaie a(zaxa paramzaxa, zawz paramzawz, int paramInt, PivotField paramPivotField, ArrayList paramArrayList, zaca paramzaca)
  {
    this.b.p().a(this);
    this.a.d.B = paramPivotField.k.h;
    this.a.d.C = paramzawz;
    this.a.d.D = paramInt;
    this.a.d.E = paramArrayList;
    zaie localzaie = a(paramzaxa.c, paramzaca);
    this.b.p().a(null);
    return localzaie;
  }
  
  private zawz b(zbug paramzbug, PivotFieldCollection paramPivotFieldCollection)
  {
    zawz localzawz = new zawz();
    for (int i1 = paramzbug.e - 1; i1 >= 0; i1--)
    {
      int i2 = paramzbug.f[i1];
      PivotItem localPivotItem = paramPivotFieldCollection.get(i1).getPivotItems().get(i2);
      if (localPivotItem.b())
      {
        zaxa localzaxa = e(paramPivotFieldCollection.get(i1).c(), localPivotItem.getIndex());
        if (null != localPivotItem) {
          localzawz.a(localzaxa);
        }
      }
    }
    return localzawz;
  }
  
  private zaxa e(int paramInt1, int paramInt2)
  {
    zawz localzawz = this.a.d.m;
    if ((localzawz == null) || (localzawz.getCount() == 0)) {
      return null;
    }
    int i1 = localzawz.getCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      zaxa localzaxa = localzawz.a(i2);
      if ((localzaxa.a() == paramInt1) && (localzaxa.g != null) && (localzaxa.g.e.size() == 1))
      {
        ArrayList localArrayList = ((zbtz)localzaxa.g.e.get(0)).c;
        if ((localArrayList.size() == 1) && (((Integer)localArrayList.get(0)).intValue() == paramInt2)) {
          return localzaxa;
        }
      }
    }
    return null;
  }
  
  private boolean c(zbug paramzbug, PivotFieldCollection paramPivotFieldCollection)
  {
    if ((paramzbug == null) || (paramPivotFieldCollection == null)) {
      return false;
    }
    for (int i1 = paramzbug.e - 1; i1 >= 0; i1--)
    {
      int i2 = paramzbug.f[i1];
      PivotItem localPivotItem = paramPivotFieldCollection.get(i1).getPivotItems().get(i2);
      if (localPivotItem.b()) {
        return true;
      }
    }
    return false;
  }
  
  private void a(int[] paramArrayOfInt)
  {
    zf.a(this.P, com.aspose.cells.b.a.za.a(paramArrayOfInt));
    zf.a(this.Q, new zbug(paramArrayOfInt));
    zf.a(this.R, new zbug(paramArrayOfInt, this.R));
  }
  
  private void a(int[] paramArrayOfInt, ArrayList paramArrayList)
  {
    zf.a(this.P, com.aspose.cells.b.a.za.a(paramArrayOfInt));
    zf.a(this.Q, new zbug(paramArrayOfInt, paramArrayList, true));
    zf.a(this.R, new zbug(paramArrayOfInt, this.R));
  }
  
  void d(zaca paramzaca)
  {
    boolean bool = false;
    int[] arrayOfInt;
    int i2;
    PivotField localPivotField;
    if (this.s > 0)
    {
      arrayOfInt = new int[4 + this.s];
      for (i2 = 0; i2 < this.s; i2++)
      {
        localPivotField = this.a.getRowFields().get(i2);
        if (localPivotField.i()) {
          bool = true;
        }
        arrayOfInt[(4 + i2)] = 32767;
      }
      if (this.j == 1) {
        arrayOfInt[3] |= 0x1000;
      }
      this.a.g = (this.P = new ArrayList());
      this.S = (this.Q = new ArrayList());
      this.w = (this.R = new ArrayList());
      this.a.getRowFields().c();
      a(this.f, this.a.getRowFields(), arrayOfInt, 0, bool, paramzaca);
    }
    else
    {
      this.a.g = (this.P = new ArrayList());
      this.w = new ArrayList();
    }
    bool = false;
    if (this.t > 0)
    {
      arrayOfInt = new int[4 + this.t];
      for (i2 = 0; i2 < this.t; i2++)
      {
        localPivotField = this.a.getColumnFields().get(i2);
        if (localPivotField.i()) {
          bool = true;
        }
        arrayOfInt[(4 + i2)] = 32767;
      }
      if (this.j == 2) {
        arrayOfInt[3] |= 0x1000;
      }
      this.a.h = (this.P = new ArrayList());
      this.T = (this.Q = new ArrayList());
      this.x = (this.R = new ArrayList());
      this.a.getColumnFields().c();
      a(this.g, this.a.getColumnFields(), arrayOfInt, 0, bool, paramzaca);
    }
    else
    {
      this.a.h = (this.P = new ArrayList());
      this.x = new ArrayList();
    }
    if (((this.S != null) && (this.S.size() > 0)) || ((this.T != null) && (this.T.size() > 0)))
    {
      int i1 = (this.S == null) || (this.S.size() == 0) ? 1 : this.S.size();
      i2 = (this.T == null) || (this.T.size() == 0) ? 1 : this.T.size();
      this.O = new double[i1][i2];
    }
    else
    {
      this.O = ((double[][])null);
    }
  }
  
  void a()
  {
    int i1 = this.a.i;
    int i2 = this.a.k;
    if (this.m)
    {
      if (!this.e.h())
      {
        this.a.j = (i1 + 13);
        this.a.l = (i2 + 6);
        this.a.m = (this.a.n = i1 + 1);
        this.a.o = (i2 + 1);
      }
      else
      {
        this.a.j = (i1 + 17);
        this.a.l = (i2 + 2);
        this.a.m = (this.a.n = i1 + 1);
        this.a.o = (i2 + 1);
      }
      return;
    }
    int i3 = i1 + 1;
    int i4 = (this.a.isGridDropZones()) && ((this.a.getDataField() == null) || ((this.a.getDataField() != null) && (this.a.getDataField().m != 1))) ? 1 : 0;
    int i5 = (this.t > 1) && (this.a.getShowRowHeaderCaption()) ? 1 : 0;
    int i6 = (this.t == 1) && (this.a.getColumnFields().get(0).t != -2) && (this.a.getColumnFields().get(0).t != 65534) ? 1 : 0;
    int i7 = (this.t == 1) && ((this.a.getColumnFields().get(0).t == -2) || (this.a.getColumnFields().get(0).t == 65534)) && (!this.a.J) ? 1 : 0;
    if ((i4 == 0) && (i5 == 0) && (i6 == 0) && (i7 == 0)) {
      i3 = i1;
    }
    if (this.l)
    {
      if ((this.u == 0) && (!this.a.getDisplayImmediateItems()))
      {
        this.a.j = (i1 + 13);
        this.a.l = (i2 + this.H + 5);
        this.a.m = i3;
        this.a.n = (i1 + this.t == 0 ? 1 : this.t);
        this.a.o = (i2 + this.H);
      }
      else
      {
        if ((!this.a.isGridDropZones()) && (this.s == 0) && (this.t == 1) && (this.a.getColumnFields().get(0).c() < 0)) {
          this.a.o = i2;
        } else {
          this.a.o = (i2 + this.H);
        }
        if ((this.t == 0) && ((this.a.isGridDropZones()) || (!this.e.h())) && ((this.a.getDataField() == null) || (this.a.getDataField().m != 1)))
        {
          this.a.m = (i3 + 1);
        }
        else
        {
          this.a.m = i3;
          if ((this.t == 0) && (((this.a.getDataField() == null) && (!this.a.isGridDropZones())) || ((this.a.getDataField() != null) && (this.a.getDataField().m == 1) && ((this.a.isGridDropZones()) || (this.a.D))))) {
            this.a.m += 1;
          }
        }
        if (this.t != 0)
        {
          this.a.l = (this.a.o + this.a.h.size() - 1);
          if (this.a.h.size() == 0) {
            this.a.l = (this.a.o + this.t - 1);
          }
          if (((this.a.getShowRowHeaderCaption()) || (this.u > 0)) && ((this.a.getDataField() == null) || ((this.a.getDataField() != null) && (this.a.getDataField().m != 2) && (this.a.getShowRowHeaderCaption())) || (this.t > 1) || (this.a.isGridDropZones()) || ((!this.a.J) && (this.a.getShowRowHeaderCaption()) && (this.t == 1) && (this.a.getDataField() != null) && (this.a.getDataField().m == 2)))) {
            this.a.n = (i1 + this.t + 1);
          } else {
            this.a.n = (i1 + this.t);
          }
        }
        else
        {
          if ((this.u == 0) && (this.a.isGridDropZones())) {
            this.a.l = (this.a.o + 6);
          } else if ((this.H != 0) && (this.u == 0) && (this.t == 0)) {
            this.a.l = (this.a.o - 1);
          } else {
            this.a.l = this.a.o;
          }
          if (((!this.a.isGridDropZones()) && ((this.e.getFileFormat() == 6) || (this.e.getFileFormat() == 8))) || ((this.a.getDataField() != null) && (this.a.getDataField().m == 1)))
          {
            this.a.n = i3;
            if ((this.t == 0) && (((this.a.getDataField() == null) && (!this.a.isGridDropZones())) || ((this.a.getDataField() != null) && (this.a.getDataField().m == 1) && ((this.a.isGridDropZones()) || (this.a.D))))) {
              this.a.n += 1;
            }
          }
          else
          {
            this.a.n = (i3 + 1);
          }
        }
        if (this.s != 0) {
          this.a.j = (this.a.n + this.a.g.size() - 1);
        } else if (this.u == 0) {
          this.a.j = (this.a.n + 13);
        } else {
          this.a.j = this.a.n;
        }
      }
    }
    else if ((this.u == 0) && (!this.a.getDisplayImmediateItems()))
    {
      this.a.j = (i1 + 13);
      this.a.m = (this.a.n = i3);
      this.a.o = (i2 + this.H);
      this.a.l = (i2 + 5 + this.H);
    }
    else
    {
      this.a.o = (i2 + this.H);
      this.a.m = i3;
      this.a.l = (this.a.o + (this.u == 0 ? 0 : this.u - 1));
      this.a.n = (i1 + 1);
      if (this.s != 0) {
        this.a.j = (this.a.n + this.a.g.size() - 1);
      } else {
        this.a.j = this.a.n;
      }
    }
  }
  
  private boolean a(PivotItemCollection paramPivotItemCollection)
  {
    PivotItem localPivotItem = null;
    for (int i1 = 0; i1 < paramPivotItemCollection.getCount(); i1++)
    {
      localPivotItem = paramPivotItemCollection.get(i1);
      if ((localPivotItem.b()) && (!localPivotItem.isHidden())) {
        return true;
      }
    }
    return false;
  }
  
  private boolean a(zaxf paramzaxf, int paramInt)
  {
    if ((paramzaxf.c == null) || (paramzaxf.c.size() == 0)) {
      return false;
    }
    PivotFieldCollection localPivotFieldCollection = null;
    if (paramInt == 1) {
      localPivotFieldCollection = this.a.getColumnFields();
    } else if (paramInt == 2) {
      localPivotFieldCollection = this.a.getRowFields();
    }
    if ((localPivotFieldCollection == null) || (localPivotFieldCollection.getCount() == 0)) {
      return false;
    }
    int i1 = localPivotFieldCollection.getCount();
    ArrayList localArrayList = new ArrayList();
    for (int i2 = 0; i2 < i1; i2++) {
      if (!localPivotFieldCollection.get(i2).i()) {
        zf.a(localArrayList, localPivotFieldCollection.get(i2));
      }
    }
    i1 = localArrayList.size();
    if (i1 == 0) {
      return false;
    }
    i2 = paramzaxf.c.size();
    zfa localzfa = null;
    PivotField localPivotField = null;
    int i3 = -1;
    PivotItemCollection localPivotItemCollection = null;
    PivotItem localPivotItem = null;
    for (int i4 = 0; i4 < i2; i4++)
    {
      localzfa = (zfa)paramzaxf.c.get(i4);
      Object[] arrayOfObject = localzfa.a;
      int i5 = 0;
      for (int i6 = 0; i6 < i1; i6++)
      {
        localPivotField = (PivotField)localArrayList.get(i6);
        i3 = localPivotField.c();
        localPivotItemCollection = localPivotField.getPivotItems();
        if (((i3 >= arrayOfObject.length) && (localPivotField.h.j != null)) || (a(localPivotItemCollection)))
        {
          i5++;
        }
        else
        {
          int i7 = ((Integer)arrayOfObject[i3]).intValue();
          if ((i7 >= localPivotItemCollection.getCount()) && (localPivotField.h.j != null) && (localPivotField.h.j.d != null) && (localPivotField.h.j.d.size() == localPivotItemCollection.getCount()))
          {
            i5++;
          }
          else if (i7 < localPivotItemCollection.getCount())
          {
            for (int i8 = 0; i8 < localPivotItemCollection.getCount(); i8++)
            {
              localPivotItem = localPivotItemCollection.get(i8);
              if (localPivotItemCollection.get(i8).getIndex() == i7) {
                break;
              }
            }
            if ((!localPivotItem.isHidden()) || (localPivotItem.b())) {
              i5++;
            }
          }
        }
      }
      if (i5 == i1) {
        return false;
      }
    }
    return true;
  }
  
  private void a(zaxf paramzaxf, PivotFieldCollection paramPivotFieldCollection, int[] paramArrayOfInt, int paramInt, boolean paramBoolean, zaca paramzaca)
  {
    this.e.i();
    PivotField localPivotField = paramPivotFieldCollection.get(paramInt);
    int i1 = paramPivotFieldCollection.getCount();
    int i2 = paramArrayOfInt[0];
    boolean bool = localPivotField.i();
    if ((!bool) && (localPivotField.isAutoSort()) && (localPivotField.getAutoSortField() > 0) && (localPivotField.getAutoSortField() < this.u)) {
      a(paramzaxf, paramPivotFieldCollection, paramInt, paramzaca);
    }
    int i3 = paramzaxf.d.size();
    for (int i4 = 0; i4 < i3; i4++)
    {
      zaxf localzaxf = (zaxf)paramzaxf.d.get(i4);
      if (!a(localzaxf, paramPivotFieldCollection.getType()))
      {
        paramArrayOfInt[(4 + paramInt)] = localzaxf.b;
        if (bool)
        {
          paramArrayOfInt[3] |= localzaxf.a.getIndex() << 1;
          if ((localzaxf.a.getIndex() > 255) && (!this.a.isExcel2003Compatible())) {
            paramArrayOfInt[3] |= localzaxf.a.getIndex() / 256 << 16;
          }
        }
        int i5;
        if (paramInt + 1 == paramPivotFieldCollection.getCount())
        {
          paramArrayOfInt[2] = (paramInt + 1);
          a(paramArrayOfInt, localzaxf.c);
          paramArrayOfInt[0] = paramInt;
        }
        else if (localzaxf.a.a())
        {
          paramArrayOfInt[2] = (paramInt + 1);
          for (i5 = paramInt + 1; i5 < i1; i5++) {
            paramArrayOfInt[(4 + i5)] = 32767;
          }
          if ((this.j == paramPivotFieldCollection.getType()) && (paramInt < this.k))
          {
            if (localPivotField.getShowInOutlineForm())
            {
              a(paramArrayOfInt, localzaxf.c);
              paramArrayOfInt[2] = (this.k + 1);
              paramArrayOfInt[0] = this.k;
              for (i5 = 0; i5 < this.u; i5++)
              {
                paramArrayOfInt[3] |= i5 << 1;
                if ((i5 > 255) && (!this.a.isExcel2003Compatible())) {
                  paramArrayOfInt[3] |= i5 / 256 << 16;
                }
                paramArrayOfInt[(4 + this.k)] = i5;
                a(paramArrayOfInt, localzaxf.c);
                paramArrayOfInt[3] &= 0xFE01;
              }
            }
            else
            {
              paramArrayOfInt[(4 + this.k)] = 0;
              a(paramArrayOfInt, localzaxf.c);
              paramArrayOfInt[2] = (this.k + 1);
              paramArrayOfInt[0] = this.k;
              for (i5 = 1; i5 < this.u; i5++)
              {
                paramArrayOfInt[3] |= i5 << 1;
                if ((i5 > 255) && (!this.a.isExcel2003Compatible())) {
                  paramArrayOfInt[3] |= i5 / 256 << 16;
                }
                paramArrayOfInt[(4 + this.k)] = i5;
                a(paramArrayOfInt, localzaxf.c);
                paramArrayOfInt[3] &= 0xFE01;
              }
            }
            paramArrayOfInt[0] = paramInt;
          }
          else
          {
            a(paramArrayOfInt, localzaxf.c);
            paramArrayOfInt[0] = paramInt;
          }
          paramArrayOfInt[2] = (paramInt + 1);
        }
        else if (bool)
        {
          if ((paramInt != i1 - 1) && (this.j == 1))
          {
            paramArrayOfInt[0] = paramInt;
            paramArrayOfInt[2] = (paramInt + 1);
            a(paramArrayOfInt, null);
            paramArrayOfInt[0] += 1;
          }
          a(localzaxf, paramPivotFieldCollection, paramArrayOfInt, paramInt + 1, paramBoolean, paramzaca);
        }
        else
        {
          i5 = 0;
          if (paramPivotFieldCollection.getType() == 1) {
            if ((paramInt > 0) && (!paramPivotFieldCollection.get(paramInt - 1).getShowInOutlineForm()) && (paramPivotFieldCollection.get(paramInt).getShowInOutlineForm()))
            {
              if (i4 == 0)
              {
                paramArrayOfInt[2] = (paramInt + 1);
                a(paramArrayOfInt, localzaxf.c);
                paramArrayOfInt[0] = (paramInt + 1);
              }
              else
              {
                paramArrayOfInt[0] = paramInt;
                paramArrayOfInt[2] = (paramInt + 1);
                a(paramArrayOfInt, localzaxf.c);
                paramArrayOfInt[0] = (paramInt + 1);
              }
            }
            else if (localPivotField.getShowInOutlineForm())
            {
              paramArrayOfInt[0] = paramInt;
              paramArrayOfInt[2] = (paramInt + 1);
              for (int i6 = paramInt + 1; i6 < i1; i6++) {
                paramArrayOfInt[(4 + i6)] = 32767;
              }
              if (!localPivotField.getShowSubtotalAtTop()) {
                a(paramArrayOfInt, null);
              } else {
                a(paramArrayOfInt, localzaxf.c);
              }
              paramArrayOfInt[0] += 1;
              i5 = 1;
            }
            else if ((localzaxf.d.size() > 0) && (i4 > 0))
            {
              paramArrayOfInt[0] = paramInt;
            }
          }
          a(localzaxf, paramPivotFieldCollection, paramArrayOfInt, paramInt + 1, paramBoolean, paramzaca);
          if ((i4 == 0) && (i5 == 0) && (localPivotField.getShowInOutlineForm()))
          {
            paramArrayOfInt[0] += 1;
            i5 = 0;
          }
          if (localzaxf.d.size() > 0) {
            if (paramPivotFieldCollection.getType() == 2)
            {
              if (((!paramBoolean) || ((paramBoolean) && (i1 > 2) && (!localPivotField.k()))) && (localPivotField.getPosition() + 1 < i1) && (!paramPivotFieldCollection.get(localPivotField.getPosition() + 1).i()))
              {
                paramArrayOfInt[0] = paramInt;
                paramArrayOfInt[1] = 1;
                paramArrayOfInt[2] = 1;
                a(paramArrayOfInt, paramInt, paramPivotFieldCollection, localPivotField, localzaxf.c);
              }
              if (paramBoolean) {
                paramArrayOfInt[0] = i2;
              }
            }
            else if (((paramBoolean) && ((!paramBoolean) || (i1 <= 2) || (localPivotField.k()))) || (((this.a.getDataField() != null) && (localPivotField.getPosition() < this.a.getDataField().getPosition()) && ((this.a.getDataField().getPosition() != i1 - 1) || ((this.a.getDataField().getPosition() == i1 - 1) && (localPivotField.getPosition() < i1 - 2)))) || ((!localPivotField.getShowInOutlineForm()) && (!localPivotField.k()) && (localPivotField.getPosition() + 1 < paramPivotFieldCollection.getCount()) && (!paramPivotFieldCollection.get(localPivotField.getPosition() + 1).i())) || ((localPivotField.getShowInOutlineForm()) && (!localPivotField.getShowSubtotalAtTop()))))
            {
              paramArrayOfInt[0] = paramInt;
              a(paramArrayOfInt, paramInt, paramPivotFieldCollection, localPivotField, localzaxf.c);
            }
          }
        }
        if (bool) {
          paramArrayOfInt[3] &= 0xFE01;
        }
        if ((!localPivotField.i()) && (localPivotField.getInsertBlankRow()) && (paramPivotFieldCollection.getType() == 1) && (paramInt != paramPivotFieldCollection.getCount() - 1) && (this.P != null) && (this.P.size() > 0) && (((int[])(int[])this.P.get(this.P.size() - 1))[1] != 14))
        {
          i5 = paramArrayOfInt[1];
          paramArrayOfInt[1] = 14;
          a(paramArrayOfInt, localzaxf.c);
          paramArrayOfInt[1] = i5;
        }
      }
    }
    paramArrayOfInt[0] = i2;
    if (paramInt == 0)
    {
      if (a(paramPivotFieldCollection)) {
        a(paramArrayOfInt, paramPivotFieldCollection);
      }
      if (((this.t == 1) && ((this.a.getColumnFields().get(0).t == -2) || (this.a.getColumnFields().get(0).t == 65534)) && (paramPivotFieldCollection.getType() == 2)) || ((this.s == 1) && ((this.a.getRowFields().get(0).t == -2) || (this.a.getRowFields().get(0).t == 65534)) && (paramPivotFieldCollection.getType() == 1))) {
        return;
      }
      if (((this.a.getRowGrand()) && (paramPivotFieldCollection.getType() == 2)) || ((this.a.getColumnGrand()) && (paramPivotFieldCollection.getType() == 1)))
      {
        if ((paramPivotFieldCollection.a()) && (paramPivotFieldCollection.getType() == 1) && (this.P != null) && (this.P.size() > 0) && (((int[])(int[])this.P.get(this.P.size() - 1))[1] != 14))
        {
          i4 = paramArrayOfInt[1];
          paramArrayOfInt[1] = 14;
          a(paramArrayOfInt, this.h);
          paramArrayOfInt[1] = i4;
        }
        if (((this.a.getDataField() != null) && (this.a.getDataField().m == 1) && (paramPivotFieldCollection.c == 1)) || ((this.a.getDataField() != null) && (this.a.getDataField().m == 2) && (paramPivotFieldCollection.c == 2))) {
          paramArrayOfInt[3] |= 0x1;
        }
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 13;
        paramArrayOfInt[2] = 1;
        paramArrayOfInt[3] |= 0xA00;
        paramArrayOfInt[4] = 0;
        for (i4 = 1; i4 < i1; i4++) {
          paramArrayOfInt[(4 + i4)] = 32767;
        }
        if (this.j == paramPivotFieldCollection.getType()) {
          a(paramArrayOfInt, paramInt);
        } else {
          a(paramArrayOfInt, this.h);
        }
      }
    }
  }
  
  private void a(int[] paramArrayOfInt, PivotFieldCollection paramPivotFieldCollection)
  {
    int i1 = paramPivotFieldCollection.getCount() - 1;
    PivotField localPivotField = paramPivotFieldCollection.get(i1);
    paramArrayOfInt[0] = (i1 + 1);
    paramArrayOfInt[2] = i1;
    paramArrayOfInt[3] |= 0x400;
    int i2 = paramPivotFieldCollection.getCount();
    for (int i3 = 0; i3 < i2 - 1; i3++) {
      paramArrayOfInt[(4 + i3)] = 32767;
    }
    i3 = localPivotField.getPivotItems().getCount();
    for (int i4 = 0; i4 < i3; i4++)
    {
      PivotItem localPivotItem = localPivotField.getPivotItems().get(i4);
      if (!localPivotItem.isHidden())
      {
        paramArrayOfInt[i1] = i4;
        a(paramArrayOfInt, i1, paramPivotFieldCollection, localPivotField);
      }
    }
    paramArrayOfInt[3] &= 0xFBFF;
    paramArrayOfInt[1] = 0;
  }
  
  private void a(int[] paramArrayOfInt, int paramInt)
  {
    for (int i1 = 0; i1 < this.u; i1++)
    {
      PivotField localPivotField = this.a.getDataFields().get(i1);
      paramArrayOfInt[3] |= i1 << 1;
      if ((i1 > 255) && (!this.a.isExcel2003Compatible())) {
        paramArrayOfInt[3] |= i1 / 256 << 16;
      }
      if (localPivotField.isCalculatedField()) {
        a(paramArrayOfInt, this.h);
      } else {
        a(paramArrayOfInt);
      }
      paramArrayOfInt[3] &= 0xFE01;
    }
  }
  
  private void a(int[] paramArrayOfInt, int paramInt, PivotFieldCollection paramPivotFieldCollection, PivotField paramPivotField)
  {
    if (paramPivotField.getSubtotals(0)) {
      return;
    }
    if ((this.C) || (paramPivotField.isAutoSubtotals()))
    {
      paramArrayOfInt[1] = 1;
      a(paramArrayOfInt, paramInt);
    }
    else
    {
      if (paramPivotField.getSubtotals(2))
      {
        paramArrayOfInt[1] = 2;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(128))
      {
        paramArrayOfInt[1] = 3;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(4))
      {
        paramArrayOfInt[1] = 4;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(8))
      {
        paramArrayOfInt[1] = 5;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(16))
      {
        paramArrayOfInt[1] = 6;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(32))
      {
        paramArrayOfInt[1] = 7;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(64))
      {
        paramArrayOfInt[1] = 8;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(256))
      {
        paramArrayOfInt[1] = 9;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(512))
      {
        paramArrayOfInt[1] = 10;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(1024))
      {
        paramArrayOfInt[1] = 11;
        a(paramArrayOfInt, paramInt);
      }
      if (paramPivotField.getSubtotals(2048))
      {
        paramArrayOfInt[1] = 12;
        a(paramArrayOfInt, paramInt);
      }
    }
    paramArrayOfInt[1] = 0;
  }
  
  private void a(int[] paramArrayOfInt, int paramInt, PivotFieldCollection paramPivotFieldCollection, PivotField paramPivotField, ArrayList paramArrayList)
  {
    paramArrayOfInt[2] = (paramInt + 1);
    paramArrayOfInt[3] |= 0x200;
    if ((paramPivotFieldCollection.getType() == this.j) && (paramInt < this.k)) {
      a(paramArrayOfInt, paramInt, paramPivotFieldCollection, paramPivotField);
    } else if (!paramPivotField.getSubtotals(0)) {
      if ((this.C) || (paramPivotField.isAutoSubtotals()))
      {
        paramArrayOfInt[1] = 1;
        a(paramArrayOfInt, paramArrayList);
      }
      else
      {
        if (paramPivotField.getSubtotals(2))
        {
          paramArrayOfInt[1] = 2;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(128))
        {
          paramArrayOfInt[1] = 3;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(4))
        {
          paramArrayOfInt[1] = 4;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(8))
        {
          paramArrayOfInt[1] = 5;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(16))
        {
          paramArrayOfInt[1] = 6;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(32))
        {
          paramArrayOfInt[1] = 7;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(64))
        {
          paramArrayOfInt[1] = 8;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(256))
        {
          paramArrayOfInt[1] = 9;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(512))
        {
          paramArrayOfInt[1] = 10;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(1024))
        {
          paramArrayOfInt[1] = 11;
          a(paramArrayOfInt, paramArrayList);
        }
        if (paramPivotField.getSubtotals(2048))
        {
          paramArrayOfInt[1] = 12;
          a(paramArrayOfInt, paramArrayList);
        }
      }
    }
    paramArrayOfInt[3] &= 0xFDFF;
    paramArrayOfInt[1] = 0;
  }
  
  private int[][] f()
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.v; i2++)
    {
      PivotField localPivotField = this.a.getPageFields().get(i2);
      if ((localPivotField.getCurrentPageItem() >= 0) && (localPivotField.getCurrentPageItem() <= localPivotField.getPivotItems().getCount())) {
        i1++;
      }
    }
    if (i1 == 0) {
      return (int[][])null;
    }
    return a(i1);
  }
  
  boolean a(int paramInt1, int paramInt2)
  {
    zawz localzawz = this.a.d.m;
    if ((localzawz == null) || (localzawz.getCount() == 0)) {
      return false;
    }
    int i1 = localzawz.getCount();
    zaxa localzaxa = null;
    int i2 = 0;
    zbui localzbui = null;
    zbuj localzbuj = null;
    int i3 = 0;
    for (int i4 = 0; i4 < i1; i4++)
    {
      localzaxa = localzawz.a(i4);
      if (null != localzaxa.e)
      {
        i2 = localzaxa.e.getCount();
        for (int i5 = 0; i5 < i2; i5++)
        {
          localzbui = localzaxa.e.a(i5);
          if (localzbui.b().getCount() != 0)
          {
            i3 = localzbui.b().getCount();
            for (int i6 = 0; i6 < i3; i6++)
            {
              localzbuj = localzbui.b().a(i6);
              if (((localzbuj.b & 0xFFFF) == paramInt2) && ((localzbuj.a & 0xFFFF) == paramInt1)) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  void b()
  {
    this.B = this.a.d.h.b;
    this.h = new ArrayList();
    ArrayList localArrayList = this.a.d.h.a;
    if ((localArrayList == null) || (this.B == null)) {
      return;
    }
    int i1 = 0;
    int i2 = 0;
    HashMap[] arrayOfHashMap = new HashMap[this.B.length];
    PivotField localPivotField1;
    int i5;
    PivotItem localPivotItem1;
    Object localObject2;
    for (int i3 = 0; i3 < this.s; i3++)
    {
      localPivotField1 = this.a.getRowFields().get(i3);
      if ((!localPivotField1.i()) && ((localPivotField1.h == null) || (localPivotField1.h.j == null) || (localPivotField1.h.j.k == -1)))
      {
        i2 = localPivotField1.getPivotItems().getCount();
        for (i5 = 0; i5 < i2; i5++)
        {
          localPivotItem1 = localPivotField1.getPivotItems().get(i5);
          if ((localPivotField1.getPivotItems().get(i5).isHidden()) && (!a(localPivotField1.getBaseIndex(), i5)))
          {
            localObject2 = arrayOfHashMap[localPivotField1.k.c()];
            if (localObject2 == null)
            {
              localObject2 = new HashMap();
              arrayOfHashMap[localPivotField1.k.c()] = localObject2;
              i1++;
            }
            ((HashMap)localObject2).put(Integer.valueOf(localPivotItem1.getIndex()), Boolean.valueOf(true));
          }
        }
      }
    }
    for (i3 = 0; i3 < this.t; i3++)
    {
      localPivotField1 = this.a.getColumnFields().get(i3);
      if ((!localPivotField1.i()) && ((localPivotField1.h == null) || (localPivotField1.h.j == null) || (localPivotField1.h.j.k == -1)))
      {
        i2 = localPivotField1.getPivotItems().getCount();
        for (i5 = 0; i5 < i2; i5++)
        {
          localPivotItem1 = localPivotField1.getPivotItems().get(i5);
          if ((localPivotField1.getPivotItems().get(i5).isHidden()) && (!a(localPivotField1.getBaseIndex(), i5)))
          {
            localObject2 = arrayOfHashMap[localPivotField1.k.c()];
            if (localObject2 == null)
            {
              localObject2 = new HashMap();
              arrayOfHashMap[localPivotField1.k.c()] = localObject2;
              i1++;
            }
            ((HashMap)localObject2).put(Integer.valueOf(localPivotItem1.getIndex()), Boolean.valueOf(true));
          }
        }
      }
    }
    for (i3 = 0; i3 < this.v; i3++)
    {
      localPivotField1 = this.a.getPageFields().get(i3);
      i2 = localPivotField1.getPivotItems().getCount();
      for (i5 = 0; i5 < i2; i5++)
      {
        localPivotItem1 = localPivotField1.getPivotItems().get(i5);
        if (localPivotField1.getPivotItems().get(i5).isHidden())
        {
          localObject2 = arrayOfHashMap[localPivotField1.k.c()];
          if (localObject2 == null)
          {
            localObject2 = new HashMap();
            arrayOfHashMap[localPivotField1.k.c()] = localObject2;
            i1++;
          }
          ((HashMap)localObject2).put(Integer.valueOf(localPivotItem1.getIndex()), Boolean.valueOf(true));
        }
      }
    }
    Object localObject1;
    int i6;
    int i9;
    if ((this.a.getPivotFilters() != null) && (this.a.getPivotFilters().getCount() > 0))
    {
      i3 = this.a.getPivotFilters().getCount();
      for (i4 = 0; i4 < i3; i4++)
      {
        localObject1 = this.a.getPivotFilters().get(i4);
        if (!zaxj.g(((PivotFilter)localObject1).b))
        {
          i6 = ((PivotFilter)localObject1).a;
          localObject2 = ((PivotFilter)localObject1).getAutoFilter();
          PivotField localPivotField2 = this.a.getBaseFields().get(i6);
          if (!localPivotField2.i())
          {
            if (arrayOfHashMap[localPivotField2.k.c()] != null)
            {
              arrayOfHashMap[localPivotField2.k.c()].clear();
              for (i9 = 0; i9 < localPivotField2.getPivotItems().getCount(); i9++) {
                localPivotField2.getPivotItems().get(i9).setHidden(false);
              }
            }
            i2 = localPivotField2.getPivotItems().getCount();
            for (i9 = 0; i9 < i2; i9++)
            {
              PivotItem localPivotItem2 = localPivotField2.getPivotItems().get(i9);
              Object localObject3 = localPivotItem2.getValue();
              if (localObject3 == null) {
                localObject3 = this.I;
              }
              if (((AutoFilter)localObject2).a(localObject3))
              {
                HashMap localHashMap2 = arrayOfHashMap[localPivotField2.k.c()];
                if (localHashMap2 == null)
                {
                  localHashMap2 = new HashMap();
                  arrayOfHashMap[localPivotField2.k.c()] = localHashMap2;
                  i1++;
                }
                localHashMap2.put(Integer.valueOf(localPivotItem2.getIndex()), Boolean.valueOf(true));
              }
            }
          }
        }
      }
    }
    i3 = localArrayList.size();
    for (int i4 = 0; i4 < i3; i4++)
    {
      localObject1 = (Object[])localArrayList.get(i4);
      i6 = 1;
      int i7;
      int i8;
      if (this.i != null)
      {
        i7 = this.i.length;
        for (i8 = 0; i8 < i7; i8++)
        {
          i9 = this.i[i8][0];
          int i10 = this.i[i8][1];
          if ((localObject1[i9] != null) && (((Integer)localObject1[i9]).intValue() != i10))
          {
            i6 = 0;
            break;
          }
        }
        if (i6 == 0) {}
      }
      else if (i1 != 0)
      {
        i7 = arrayOfHashMap.length;
        for (i8 = 0; i8 < i7; i8++) {
          if (arrayOfHashMap[i8] != null)
          {
            HashMap localHashMap1 = arrayOfHashMap[i8];
            if ((localObject1[i8] != null) && ((localObject1[i8] instanceof Integer)) && (localHashMap1.get((Integer)localObject1[i8]) != null))
            {
              i6 = 0;
              break;
            }
          }
        }
        if (i6 == 0) {}
      }
      else
      {
        zf.a(this.h, new zfa((Object[])localObject1));
      }
    }
  }
  
  ArrayList a(ArrayList paramArrayList, zbug paramzbug, boolean paramBoolean, PivotFieldCollection paramPivotFieldCollection)
  {
    return null;
  }
  
  ArrayList b(ArrayList paramArrayList, zbug paramzbug, boolean paramBoolean, PivotFieldCollection paramPivotFieldCollection)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramzbug.c == 14) {
      return localArrayList;
    }
    if (paramzbug.b()) {
      return paramArrayList;
    }
    if (paramArrayList == null) {
      return localArrayList;
    }
    int i1 = 1;
    PivotField localPivotField = null;
    int i2 = 0;
    int i3 = paramArrayList.size();
    for (int i4 = 0; i4 < i3; i4++)
    {
      zfa localzfa1 = (zfa)paramArrayList.get(i4);
      i1 = 1;
      if (paramPivotFieldCollection.getType() == 2) {
        i2 = 0;
      } else {
        i2 = paramzbug.b;
      }
      for (int i5 = i2; i5 < paramzbug.e; i5++) {
        if ((!paramBoolean) || (i5 != this.k))
        {
          localPivotField = paramPivotFieldCollection.get(i5);
          if ((paramzbug.f[i5] < localPivotField.getPivotItems().getCount()) && (localPivotField.c() >= 0))
          {
            PivotItem localPivotItem = localPivotField.getPivotItems().get(paramzbug.f[i5]);
            if (!localPivotItem.b()) {
              if ((localPivotField.h.j != null) && (localPivotField.m == 2) && (localPivotField.h.j.k != -1))
              {
                int i6 = localPivotField.h.j.k;
                int i7 = 0;
                int i8 = paramzbug.d.size();
                for (int i9 = 0; i9 < i8; i9++)
                {
                  zfa localzfa2 = (zfa)paramzbug.d.get(i9);
                  if ((localzfa1.a[i6] == null) || (localzfa2.a[i6] == null)) {
                    break;
                  }
                  if ((Integer)localzfa1.a[i6] == (Integer)localzfa2.a[i6])
                  {
                    i7 = 1;
                    break;
                  }
                }
                if (i7 == 0) {
                  i1 = 0;
                }
              }
              else
              {
                if (localzfa1.a[localPivotField.t] == null)
                {
                  i1 = 0;
                  break;
                }
                if (((Integer)localzfa1.a[localPivotField.t]).intValue() != localPivotItem.getIndex())
                {
                  i1 = 0;
                  break;
                }
              }
            }
          }
        }
      }
      if (i1 != 0) {
        zf.a(localArrayList, localzfa1);
      }
    }
    return localArrayList;
  }
  
  ArrayList a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      zfa localzfa = (zfa)paramArrayList.get(i1);
      if ((localzfa.a[paramInt1] != null) && (((Integer)localzfa.a[paramInt1]).intValue() == paramInt2))
      {
        zf.a(localArrayList, localzfa);
        paramArrayList.remove(i1);
        i1--;
      }
    }
    return localArrayList;
  }
  
  private ArrayList a(int paramInt1, PivotField paramPivotField, PivotItem paramPivotItem, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    PivotField localPivotField = this.a.getBaseFields().get(paramInt2);
    int i1 = 0;
    int i2;
    Object localObject;
    zbos localzbos;
    DateTime localDateTime;
    if (paramPivotField.h.j.c == 6)
    {
      i1 = localPivotField.h.c.size();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = localPivotField.h.c.get(i2);
        localzbos = (zbos)localObject;
        if ((localzbos.a instanceof DateTime))
        {
          localDateTime = (DateTime)localzbos.a;
          if (paramInt1 == 1)
          {
            if ((localDateTime.getMonth() >= 1) && (localDateTime.getMonth() <= 3)) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 2)
          {
            if ((localDateTime.getMonth() >= 4) && (localDateTime.getMonth() <= 6)) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 3)
          {
            if ((localDateTime.getMonth() >= 7) && (localDateTime.getMonth() <= 9)) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if ((paramInt1 == 4) && (localDateTime.getMonth() >= 10) && (localDateTime.getMonth() <= 12)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
      }
    }
    else if (paramPivotField.h.j.c == 5)
    {
      i1 = localPivotField.h.c.size();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = localPivotField.h.c.get(i2);
        localzbos = (zbos)localObject;
        if ((localzbos.a instanceof DateTime))
        {
          localDateTime = (DateTime)localzbos.a;
          if (paramInt1 == 1)
          {
            if (localDateTime.getMonth() == 1) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 2)
          {
            if (localDateTime.getMonth() == 2) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 3)
          {
            if (localDateTime.getMonth() == 3) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 4)
          {
            if (localDateTime.getMonth() == 4) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 5)
          {
            if (localDateTime.getMonth() == 5) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 6)
          {
            if (localDateTime.getMonth() == 6) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 7)
          {
            if (localDateTime.getMonth() == 7) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 8)
          {
            if (localDateTime.getMonth() == 8) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 9)
          {
            if (localDateTime.getMonth() == 9) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 10)
          {
            if (localDateTime.getMonth() == 10) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt1 == 11)
          {
            if (localDateTime.getMonth() == 11) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if ((paramInt1 == 12) && (localDateTime.getMonth() == 12)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
      }
    }
    else if (paramPivotField.h.j.c == 7)
    {
      i1 = localPivotField.h.c.size();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = localPivotField.h.c.get(i2);
        localzbos = (zbos)localObject;
        if ((localzbos.a instanceof DateTime))
        {
          localDateTime = (DateTime)localzbos.a;
          if ((paramInt1 != 0) && (paramInt1 != paramPivotField.h.j.d.size() - 1))
          {
            String str1 = (String)paramPivotItem.getValue();
            str1 = zw.a(zw.a(zw.a(str1, "<", ""), ">", ""), "=", "");
            String str2 = str1.substring(0, 4);
            if (!zarb.c(str2)) {
              str2 = str1.substring(str1.length() - 4);
            }
            int i3 = zauj.F(str2);
            if (localDateTime.getYear() == i3) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
        }
      }
    }
    else if (paramPivotField.h.j.c == 4)
    {
      i1 = localPivotField.h.c.size();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = localPivotField.h.c.get(i2);
        localzbos = (zbos)localObject;
        if ((localzbos.a instanceof DateTime))
        {
          localDateTime = (DateTime)localzbos.a;
          if ((paramInt1 != 0) && (paramInt1 != paramPivotField.h.j.d.size() - 1) && (paramInt1 == localDateTime.getDayOfYear() + 1)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
      }
    }
    else if (paramPivotField.h.j.c == 3)
    {
      i1 = localPivotField.h.c.size();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = localPivotField.h.c.get(i2);
        localzbos = (zbos)localObject;
        if ((localzbos.a instanceof DateTime))
        {
          localDateTime = (DateTime)localzbos.a;
          if ((paramInt1 != 0) && (paramInt1 != paramPivotField.h.j.d.size() - 1) && (localDateTime.getHour() == paramInt1 - 1)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
      }
    }
    else if (paramPivotField.h.j.c == 2)
    {
      i1 = localPivotField.h.c.size();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = localPivotField.h.c.get(i2);
        localzbos = (zbos)localObject;
        if ((localzbos.a instanceof DateTime))
        {
          localDateTime = (DateTime)localzbos.a;
          if ((paramInt1 != 0) && (paramInt1 != paramPivotField.h.j.d.size() - 1) && (localDateTime.getMinute() == paramInt1 - 1)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
      }
    }
    else if (paramPivotField.h.j.c == 1)
    {
      i1 = localPivotField.h.c.size();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = localPivotField.h.c.get(i2);
        localzbos = (zbos)localObject;
        if ((localzbos.a instanceof DateTime))
        {
          localDateTime = (DateTime)localzbos.a;
          if ((paramInt1 != 0) && (paramInt1 != paramPivotField.h.j.d.size() - 1) && (localDateTime.getSecond() == paramInt1 - 1)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
      }
    }
    return localArrayList;
  }
  
  private ArrayList a(int paramInt, PivotField paramPivotField, PivotItem paramPivotItem)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = paramPivotField.h.c.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = paramPivotField.h.c.get(i2);
      zbos localzbos = (zbos)localObject;
      if ((localzbos.a instanceof DateTime))
      {
        DateTime localDateTime = (DateTime)localzbos.a;
        if (paramPivotField.h.j.c == 6)
        {
          if (paramInt == 1)
          {
            if ((localDateTime.getMonth() >= 1) && (localDateTime.getMonth() <= 3)) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 2)
          {
            if ((localDateTime.getMonth() >= 4) && (localDateTime.getMonth() <= 6)) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 3)
          {
            if ((localDateTime.getMonth() >= 7) && (localDateTime.getMonth() <= 9)) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if ((paramInt == 4) && (localDateTime.getMonth() >= 10) && (localDateTime.getMonth() <= 12)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else if (paramPivotField.h.j.c == 5)
        {
          if (paramInt == 1)
          {
            if (localDateTime.getMonth() == 1) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 2)
          {
            if (localDateTime.getMonth() == 2) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 3)
          {
            if (localDateTime.getMonth() == 3) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 4)
          {
            if (localDateTime.getMonth() == 4) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 5)
          {
            if (localDateTime.getMonth() == 5) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 6)
          {
            if (localDateTime.getMonth() == 6) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 7)
          {
            if (localDateTime.getMonth() == 7) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 8)
          {
            if (localDateTime.getMonth() == 8) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 9)
          {
            if (localDateTime.getMonth() == 9) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 10)
          {
            if (localDateTime.getMonth() == 10) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if (paramInt == 11)
          {
            if (localDateTime.getMonth() == 11) {
              zf.a(localArrayList, Integer.valueOf(i2));
            }
          }
          else if ((paramInt == 12) && (localDateTime.getMonth() == 12)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else if (paramPivotField.h.j.c == 7)
        {
          String str = (String)paramPivotItem.getValue();
          int i3 = -1;
          try
          {
            i3 = zauj.F(str.substring(0, 4));
          }
          catch (Exception localException)
          {
            continue;
          }
          if (localDateTime.getYear() == i3) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else if (paramPivotField.h.j.c == 4)
        {
          if ((paramInt != 0) && (paramInt != paramPivotField.h.j.d.size() - 1) && (paramInt == localDateTime.getDayOfYear() + 1)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else if (paramPivotField.h.j.c == 3)
        {
          if ((paramInt != 0) && (paramInt != paramPivotField.h.j.d.size() - 1) && (localDateTime.getHour() == paramInt - 1)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else if (paramPivotField.h.j.c == 2)
        {
          if ((paramInt != 0) && (paramInt != paramPivotField.h.j.d.size() - 1) && (localDateTime.getMinute() == paramInt - 1)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else if ((paramPivotField.h.j.c == 1) && (paramInt != 0) && (paramInt != paramPivotField.h.j.d.size() - 1) && (localDateTime.getSecond() == paramInt - 1))
        {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
      }
      else if (((localzbos.a instanceof Integer)) || ((localzbos.a instanceof Double)))
      {
        double d1 = 0.0D;
        if ((localzbos.a instanceof Integer)) {
          d1 = ((Integer)localzbos.a).intValue();
        } else {
          d1 = ((Double)localzbos.a).doubleValue();
        }
        if (zs.a(paramPivotItem.getValue()).indexOf('<') != -1)
        {
          double d2 = zauj.C(zs.a(paramPivotItem.getValue()).substring(1));
          if (d1 < d2) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else if (zs.a(paramPivotItem.getValue()).indexOf("-") != -1)
        {
          int i4 = zs.a(paramPivotItem.getValue()).indexOf('-');
          double d4 = zauj.C(zs.a(paramPivotItem.getValue()).substring(0, 0 + i4));
          double d5 = zauj.C(zs.a(paramPivotItem.getValue()).substring(i4 + 1));
          if ((d1 >= d4) && (d1 <= d5)) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
        else
        {
          double d3 = zauj.C(zs.a(paramPivotItem.getValue()).substring(1));
          if (d1 > d3) {
            zf.a(localArrayList, Integer.valueOf(i2));
          }
        }
      }
    }
    return localArrayList;
  }
  
  private void a(zaxf paramzaxf, PivotFieldCollection paramPivotFieldCollection, int paramInt, boolean paramBoolean, zaca paramzaca)
  {
    this.e.i();
    PivotField localPivotField1 = paramPivotFieldCollection.get(paramInt);
    PivotItemCollection localPivotItemCollection = localPivotField1.getPivotItems();
    int i1 = localPivotItemCollection.getCount();
    int[] arrayOfInt = null;
    if (localPivotField1.isAutoSort())
    {
      if (!A)
      {
        j();
        A = true;
      }
      if (localPivotField1.getAutoSortField() == -1) {
        if (paramPivotFieldCollection.getType() == 1)
        {
          if (this.z != null) {
            arrayOfInt = this.z[paramInt];
          }
        }
        else if (this.y != null) {
          arrayOfInt = this.y[paramInt];
        }
      }
    }
    int i2 = (localPivotField1.h != null) && (localPivotField1.h.j != null) ? 1 : 0;
    PivotItem localPivotItem = null;
    int i3 = arrayOfInt != null ? 1 : 0;
    int i4 = localPivotField1.k.c();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = paramzaxf.c;
    int i5 = localArrayList2.size();
    for (int i6 = 0; i6 < i5; i6++) {
      zf.a(localArrayList1, localArrayList2.get(i6));
    }
    Object localObject1;
    Object localObject3;
    Object localObject2;
    for (i6 = 0; i6 < i1; i6++)
    {
      if (i6 % 1000 == 0) {
        this.e.i();
      }
      if (i3 != 0) {
        localPivotItem = localPivotItemCollection.get(arrayOfInt[i6]);
      } else {
        localPivotItem = localPivotItemCollection.get(i6);
      }
      if (!localPivotItem.isHidden()) {
        if ((localPivotField1.i()) || (localPivotItem.b()))
        {
          localObject1 = new zaxf();
          zf.a(paramzaxf.d, localObject1);
          ((zaxf)localObject1).a = localPivotItem;
          if (i3 != 0) {
            ((zaxf)localObject1).b = arrayOfInt[i6];
          } else {
            ((zaxf)localObject1).b = i6;
          }
          ((zaxf)localObject1).c = paramzaxf.c;
        }
        else if ((i2 != 0) && (localPivotField1.h.j.k != -1))
        {
          localObject1 = null;
          int i8 = localPivotField1.h.j.k;
          if ((localPivotField1.h.c == null) || (localPivotField1.h.c.size() == 0)) {
            localObject1 = a(i6, localPivotField1, localPivotItem, i8);
          } else if (localPivotField1.h.c != null) {
            localObject1 = a(i6, localPivotField1, localPivotItem);
          }
          ArrayList localArrayList3 = new ArrayList();
          ArrayList localArrayList4 = new ArrayList();
          int i12 = ((ArrayList)localObject1).size();
          for (int i13 = 0; i13 < i12; i13++) {
            if (i8 >= 0)
            {
              localArrayList3 = a(localArrayList1, i8, ((Integer)((ArrayList)localObject1).get(i13)).intValue());
              if (localArrayList3.size() != 0) {
                zf.a(localArrayList4, localArrayList3);
              }
            }
          }
          if (localArrayList4.size() != 0)
          {
            localObject3 = new zaxf();
            zf.a(paramzaxf.d, localObject3);
            ((zaxf)localObject3).a = localPivotItem;
            if (i3 != 0) {
              ((zaxf)localObject3).b = arrayOfInt[i6];
            } else {
              ((zaxf)localObject3).b = i6;
            }
            ((zaxf)localObject3).c = localArrayList4;
          }
        }
        else if (i4 >= 0)
        {
          localObject1 = a(localArrayList1, i4, localPivotItem.getIndex());
          if (((ArrayList)localObject1).size() == 0)
          {
            if (localPivotField1.getShowAllItems())
            {
              localObject2 = new zaxf();
              zf.a(paramzaxf.d, localObject2);
              ((zaxf)localObject2).a = localPivotItem;
              if (i3 != 0) {
                ((zaxf)localObject2).b = arrayOfInt[i6];
              } else {
                ((zaxf)localObject2).b = i6;
              }
              ((zaxf)localObject2).c = ((ArrayList)localObject1);
            }
          }
          else
          {
            localObject2 = new zaxf();
            zf.a(paramzaxf.d, localObject2);
            ((zaxf)localObject2).a = localPivotItem;
            if (i3 != 0) {
              ((zaxf)localObject2).b = arrayOfInt[i6];
            } else {
              ((zaxf)localObject2).b = i6;
            }
            ((zaxf)localObject2).c = ((ArrayList)localObject1);
          }
        }
      }
    }
    if (localPivotField1.isAutoShow())
    {
      i6 = localPivotField1.getAutoShowField();
      localObject1 = this.a.getDataFields().get(i6);
      a((PivotField)localObject1, paramzaxf, localPivotField1.isAscendShow(), localPivotField1.getAutoShowCount(), paramzaca);
    }
    if ((this.a.getPivotFilters() != null) && (this.a.getPivotFilters().getCount() > 0))
    {
      i6 = this.a.getPivotFilters().getCount();
      for (i7 = 0; i7 < i6; i7++)
      {
        localObject2 = this.a.getPivotFilters().get(i7);
        int i10 = ((PivotFilter)localObject2).a;
        int i11 = ((PivotFilter)localObject2).getMeasureFldIndex();
        if (this.u != 0)
        {
          PivotField localPivotField2 = this.a.getDataFields().get(i11);
          localObject3 = ((PivotFilter)localObject2).getAutoFilter();
          if (i10 == localPivotField1.c()) {
            if ((((PivotFilter)localObject2).b == 14) || (((PivotFilter)localObject2).b == 43))
            {
              FilterColumnCollection localFilterColumnCollection = ((AutoFilter)localObject3).c;
              int i14 = localFilterColumnCollection.getCount();
              for (int i15 = 0; i15 < i14; i15++)
              {
                FilterColumn localFilterColumn = localFilterColumnCollection.getByIndex(i15);
                if (localFilterColumn.getFilterType() == 5)
                {
                  Top10Filter localTop10Filter = (Top10Filter)localFilterColumn.getFilter();
                  boolean bool1 = localTop10Filter.isTop();
                  boolean bool2 = localTop10Filter.isPercent();
                  int i16 = localTop10Filter.getItems();
                  if (bool2)
                  {
                    i16 = i16 * this.h.size() / 100;
                    if (i16 == 0) {
                      i16 = 1;
                    }
                  }
                  a(localPivotField2, paramzaxf, bool1, i16, paramzaca);
                  break;
                }
              }
            }
            else if (zaxj.g(((PivotFilter)localObject2).b))
            {
              a(localPivotField2, paramzaxf, (AutoFilter)localObject3, paramzaca);
            }
          }
        }
      }
    }
    i6 = paramzaxf.d.size();
    int i7 = paramPivotFieldCollection.getCount();
    zaxf localzaxf;
    for (int i9 = 0; i9 < i6; i9++)
    {
      localzaxf = (zaxf)paramzaxf.d.get(i9);
      if ((!localzaxf.a.a()) && (localzaxf.c != null) && (paramInt + 1 != i7)) {
        a(localzaxf, paramPivotFieldCollection, paramInt + 1, paramBoolean, paramzaca);
      }
    }
    if (paramBoolean) {
      for (i9 = 0; i9 < i6; i9++)
      {
        localzaxf = paramzaxf;
        localzaxf.c = null;
      }
    }
  }
  
  private int a(PivotField paramPivotField)
  {
    int i1 = 0;
    int i2 = paramPivotField.getItemCount();
    for (int i3 = 0; i3 < i2; i3++) {
      if (!paramPivotField.getPivotItems().get(i3).isHidden()) {
        i1++;
      }
    }
    return i1;
  }
  
  private Cell[] a(CellArea paramCellArea, int paramInt)
  {
    Cell[] arrayOfCell = new Cell[2];
    int i1 = (paramInt + 1) % this.a.getPageFieldWrapCount();
    int i2 = (paramInt + 1) / this.a.getPageFieldWrapCount();
    int i3 = paramCellArea.StartRow;
    int i4 = paramCellArea.StartColumn;
    if (this.a.getPageFieldOrder() == 0)
    {
      if (i1 > 0) {
        i3 += i1 - 1;
      } else {
        i3 = paramCellArea.EndRow;
      }
      if (i2 > 0)
      {
        i4 += i2 * 3;
        if (i1 == 0) {
          i4 -= 3;
        }
      }
    }
    else
    {
      if (i2 > 0)
      {
        i3 += i2;
        if (i1 == 0) {
          i3--;
        }
      }
      if (i1 > 0) {
        i4 += (i1 - 1) * 3;
      } else {
        i4 = paramCellArea.EndColumn - 1;
      }
    }
    arrayOfCell[0] = this.b.checkCell(i3, i4);
    arrayOfCell[1] = this.b.checkCell(i3, i4 + 1);
    return arrayOfCell;
  }
  
  private void g()
  {
    Cell localCell = null;
    this.a.al = this.v;
    if (this.a.al > 0)
    {
      CellArea localCellArea = h();
      int i1 = this.a.i - this.a.al - 1;
      for (int i2 = 0; i2 < this.a.al; i2++)
      {
        Cell[] arrayOfCell = a(localCellArea, i2);
        PivotField localPivotField = this.a.getPageFields().get(i2);
        int i3 = localPivotField.getPivotItems().getCount();
        localCell = arrayOfCell[0];
        if (localCell != null)
        {
          if ((localPivotField.getDisplayName() != null) && (localPivotField.getDisplayName().length() > 0)) {
            localCell.putValue(localPivotField.getDisplayName());
          } else {
            localCell.putValue(localPivotField.getName());
          }
          a(localCell, i2, 0);
        }
        PivotItem localPivotItem;
        Style localStyle;
        if ((localPivotField.getCurrentPageItem() == 32765) && (localPivotField.isMultipleItemSelectionAllowed()) && (i3 == 1))
        {
          localCell = arrayOfCell[1];
          if (localCell != null)
          {
            localPivotItem = localPivotField.getPivotItems().get(0);
            Object localObject1 = a(localPivotItem);
            localCell.putValue(localObject1);
            localStyle = a(localPivotField, localPivotItem);
            if (((localObject1 instanceof DateTime)) || (!localStyle.s().equals("")) || (localStyle.getNumber() != 0)) {
              localCell.setStyle(localStyle);
            }
            a(localCell, i2, 1);
          }
        }
        else if (((localPivotField.getCurrentPageItem() == 32765) && (!localPivotField.isMultipleItemSelectionAllowed())) || ((localPivotField.isMultipleItemSelectionAllowed()) && (i3 == a(localPivotField))))
        {
          localCell = arrayOfCell[1];
          if (localCell != null)
          {
            localCell.putValue(this.L);
            a(localCell, i2, 1);
          }
        }
        else if ((!localPivotField.isMultipleItemSelectionAllowed()) || ((localPivotField.isMultipleItemSelectionAllowed()) && (i3 - localPivotField.getPivotItems().b() == 1)))
        {
          localCell = arrayOfCell[1];
          localPivotItem = null;
          int i4;
          if (localPivotField.isMultipleItemSelectionAllowed())
          {
            for (i4 = 0; i4 < i3; i4++) {
              if (!localPivotField.getPivotItems().get(i4).isHidden())
              {
                localPivotItem = localPivotField.getPivotItems().get(i4);
                break;
              }
            }
          }
          else
          {
            if (((localPivotField.getCurrentPageItem() >= i3) || (localPivotField.getCurrentPageItem() == 32765)) && (i3 > 0)) {
              for (i4 = 0; i4 < i3; i4++) {
                if (!localPivotField.getPivotItems().get(i4).isHidden())
                {
                  localPivotField.setCurrentPageItem((short)i4);
                  break;
                }
              }
            }
            if (localPivotField.getCurrentPageItem() == 32765)
            {
              localCell.putValue(this.M);
              a(localCell, i2, 1);
              continue;
            }
            localPivotItem = localPivotField.getPivotItems().get(localPivotField.getCurrentPageItem());
          }
          Object localObject2 = a(localPivotItem);
          localCell.putValue(localObject2);
          localStyle = a(localPivotField, localPivotItem);
          if (((localObject2 instanceof DateTime)) || (!localStyle.s().equals("")) || (localStyle.getNumber() != 0)) {
            localCell.setStyle(localStyle);
          }
          a(localCell, i2, 1);
        }
        else if (localPivotField.isMultipleItemSelectionAllowed())
        {
          localCell = arrayOfCell[1];
          if (localCell != null)
          {
            localCell.putValue(this.M);
            a(localCell, i2, 1);
          }
        }
      }
    }
  }
  
  private CellArea h()
  {
    CellArea localCellArea = new CellArea();
    if (this.v > 0)
    {
      int i1 = this.v % this.a.getPageFieldWrapCount() != 0 ? 1 : 0;
      int i2 = this.v / this.a.getPageFieldWrapCount();
      if (this.a.getPageFieldOrder() == 0)
      {
        localCellArea.StartRow = (this.a.i - this.a.getPageFieldWrapCount() - 1);
        localCellArea.EndRow = (this.a.i - 1 - 1);
        localCellArea.StartColumn = this.a.k;
        if ((i2 > 1) || ((i2 == 1) && (i1 != 0)))
        {
          localCellArea.EndColumn = (this.a.k + 2 + (i2 - 1) * 3);
          localCellArea.EndColumn += (i1 != 0 ? 2 : -1);
        }
        else
        {
          localCellArea.EndColumn = (this.a.k + 1);
        }
      }
      else
      {
        localCellArea.StartRow = (this.a.i - 1 - i2);
        localCellArea.StartRow += (i1 != 0 ? -1 : 0);
        localCellArea.EndRow = (this.a.i - 1 - 1);
        localCellArea.StartColumn = this.a.k;
        localCellArea.EndColumn = (this.a.k + 2 + (this.a.getPageFieldWrapCount() - 1) * 3 - 1);
      }
    }
    return localCellArea;
  }
  
  private void i()
  {
    Cell localCell = null;
    this.a.al = this.v;
    int i2;
    if (this.a.al > 0)
    {
      CellArea localCellArea = h();
      i2 = 0;
      int i3;
      int i4;
      if (this.a.getPageFieldOrder() == 0) {
        for (i3 = localCellArea.StartColumn; (i3 <= localCellArea.EndColumn) && (i2 < this.v); i3 += 3) {
          for (i4 = localCellArea.StartRow; (i4 <= localCellArea.EndRow) && (i2 < this.v); i4++)
          {
            localCell = this.b.checkCell(i4, i3);
            if (localCell != null)
            {
              localCell.b(-1);
              localCell.f();
            }
            localCell = this.b.checkCell(i4, i3 + 1);
            if (localCell != null)
            {
              localCell.b(-1);
              localCell.f();
            }
            i2++;
          }
        }
      } else {
        for (i3 = localCellArea.StartRow; (i3 <= localCellArea.EndRow) && (i2 < this.v); i3++) {
          for (i4 = localCellArea.StartColumn; (i4 <= localCellArea.EndColumn) && (i2 < this.v); i4 += 3)
          {
            localCell = this.b.checkCell(i3, i4);
            if (localCell != null)
            {
              localCell.b(-1);
              localCell.f();
            }
            localCell = this.b.checkCell(i3, i4 + 1);
            if (localCell != null)
            {
              localCell.b(-1);
              localCell.f();
            }
            i2++;
          }
        }
      }
    }
    for (int i1 = this.a.i; i1 <= this.a.j; i1++) {
      for (i2 = this.a.k; i2 <= this.a.l; i2++)
      {
        localCell = this.b.checkCell(i1, i2);
        if (localCell != null)
        {
          localCell.b(-1);
          localCell.f();
        }
      }
    }
  }
  
  private void j()
  {
    if (this.B == null) {
      return;
    }
    PivotField localPivotField;
    for (int i1 = 0; i1 < this.t; i1++)
    {
      localPivotField = this.a.getColumnFields().get(i1);
      if ((localPivotField.isAutoSort()) && (localPivotField.getAutoSortField() == -1))
      {
        if (this.y == null) {
          this.y = new int[this.B.length][];
        }
        this.y[i1] = b(localPivotField);
      }
    }
    for (i1 = 0; i1 < this.s; i1++)
    {
      localPivotField = this.a.getRowFields().get(i1);
      if ((localPivotField.isAutoSort()) && (localPivotField.getAutoSortField() == -1))
      {
        if (this.z == null) {
          this.z = new int[this.B.length][];
        }
        this.z[i1] = b(localPivotField);
      }
    }
  }
  
  void e(zaca paramzaca)
  {
    if (this.t != 0)
    {
      this.g = new zaxf();
      this.g.c = this.h;
      a(this.g, this.a.getColumnFields(), 0, this.s != 0, paramzaca);
      this.g.c = null;
    }
    if (this.s != 0)
    {
      this.f = new zaxf();
      this.f.c = this.h;
      a(this.f, this.a.getRowFields(), 0, false, paramzaca);
      this.f.c = null;
    }
    A = false;
  }
  
  private int[] b(PivotField paramPivotField)
  {
    if ((paramPivotField.c() == -2) || (paramPivotField.c() == 65534)) {
      return null;
    }
    boolean bool = paramPivotField.isAscendSort();
    PivotItemCollection localPivotItemCollection = paramPivotField.getPivotItems();
    int i1 = localPivotItemCollection.getCount();
    int[] arrayOfInt = new int[i1];
    ArrayList localArrayList = new ArrayList();
    int i2 = -1;
    HashMap localHashMap = new HashMap();
    for (int i3 = 0; i3 < i1; i3++)
    {
      Object localObject1 = localPivotItemCollection.get(i3).getValue();
      if ((localObject1 != null) && ((localObject1 instanceof String)))
      {
        localObject2 = (String)localObject1;
        switch (U.a(((String)localObject2).toUpperCase()))
        {
        case 0: 
          localHashMap.put(localObject2, Integer.valueOf(0));
          break;
        case 1: 
          localHashMap.put(localObject2, Integer.valueOf(1));
          break;
        case 2: 
          localHashMap.put(localObject2, Integer.valueOf(2));
          break;
        case 3: 
          localHashMap.put(localObject2, Integer.valueOf(3));
          break;
        case 4: 
          localHashMap.put(localObject2, Integer.valueOf(4));
          break;
        case 5: 
          localHashMap.put(localObject2, Integer.valueOf(5));
          break;
        case 6: 
          localHashMap.put(localObject2, Integer.valueOf(6));
          break;
        case 7: 
          localHashMap.put(localObject2, Integer.valueOf(7));
          break;
        case 8: 
          localHashMap.put(localObject2, Integer.valueOf(8));
          break;
        case 9: 
          localHashMap.put(localObject2, Integer.valueOf(9));
          break;
        case 10: 
          localHashMap.put(localObject2, Integer.valueOf(10));
          break;
        case 11: 
          localHashMap.put(localObject2, Integer.valueOf(11));
          break;
        case 12: 
          localHashMap.put(localObject2, Integer.valueOf(12));
          break;
        case 13: 
          localHashMap.put(localObject2, Integer.valueOf(13));
          break;
        case 14: 
          localHashMap.put(localObject2, Integer.valueOf(14));
          break;
        case 15: 
          localHashMap.put(localObject2, Integer.valueOf(15));
          break;
        case 16: 
          localHashMap.put(localObject2, Integer.valueOf(16));
          break;
        case 17: 
          localHashMap.put(localObject2, Integer.valueOf(17));
          break;
        case 18: 
          localHashMap.put(localObject2, Integer.valueOf(18));
          break;
        case 19: 
          localHashMap.put(localObject2, Integer.valueOf(19));
          break;
        case 20: 
          localHashMap.put(localObject2, Integer.valueOf(20));
          break;
        case 21: 
          localHashMap.put(localObject2, Integer.valueOf(21));
          break;
        case 22: 
          localHashMap.put(localObject2, Integer.valueOf(22));
          break;
        case 23: 
          localHashMap.put(localObject2, Integer.valueOf(23));
          break;
        case 24: 
          localHashMap.put(localObject2, Integer.valueOf(24));
          break;
        case 25: 
          localHashMap.put(localObject2, Integer.valueOf(25));
          break;
        case 26: 
          localHashMap.put(localObject2, Integer.valueOf(26));
          break;
        case 27: 
          localHashMap.put(localObject2, Integer.valueOf(27));
          break;
        case 28: 
          localHashMap.put(localObject2, Integer.valueOf(28));
          break;
        case 29: 
          localHashMap.put(localObject2, Integer.valueOf(29));
          break;
        case 30: 
          localHashMap.put(localObject2, Integer.valueOf(30));
          break;
        case 31: 
          localHashMap.put(localObject2, Integer.valueOf(31));
          break;
        case 32: 
          localHashMap.put(localObject2, Integer.valueOf(32));
          break;
        case 33: 
          localHashMap.put(localObject2, Integer.valueOf(33));
          break;
        case 34: 
          localHashMap.put(localObject2, Integer.valueOf(34));
          break;
        case 35: 
          localHashMap.put(localObject2, Integer.valueOf(35));
          break;
        case 36: 
          localHashMap.put(localObject2, Integer.valueOf(36));
        }
      }
    }
    zd localzd = new zd(new zbqi(bool, localHashMap));
    for (int i4 = 0; i4 < i1; i4++) {
      if (localPivotItemCollection.get(i4).getValue() != null) {
        localzd.a(localPivotItemCollection.get(i4).getValue(), Integer.valueOf(i4));
      } else if (localPivotItemCollection.get(i4).e == null) {
        i2 = i4;
      }
    }
    i4 = 0;
    if ((!bool) && (i2 >= 0)) {
      arrayOfInt[(i4++)] = i2;
    }
    Object localObject2 = localzd.f().iterator();
    while (((Iterator)localObject2).hasNext()) {
      arrayOfInt[(i4++)] = ((Integer)((Iterator)localObject2).next()).intValue();
    }
    if ((bool) && (i2 >= 0)) {
      arrayOfInt[(i4++)] = i2;
    }
    return arrayOfInt;
  }
  
  private void a(PivotField paramPivotField, zaxf paramzaxf, boolean paramBoolean, int paramInt, zaca paramzaca)
  {
    zaww localzaww = new zaww(paramBoolean, paramInt);
    int i1 = paramzaxf.d.size();
    Object localObject;
    for (int i2 = 0; i2 < i1; i2++)
    {
      zaxf localzaxf = (zaxf)paramzaxf.d.get(i2);
      localObject = a(localzaxf.a, null, localzaxf.c, true, paramPivotField, i2, null, paramzaca);
      localObject = a((zaie)localObject);
      localzaww.a(((zaie)localObject).b(paramzaca), localzaxf.b);
    }
    HashMap localHashMap = localzaww.a();
    for (int i3 = 0; i3 < paramzaxf.d.size(); i3++)
    {
      localObject = (zaxf)paramzaxf.d.get(i3);
      if (localHashMap.get(Integer.valueOf(((zaxf)localObject).b)) == null)
      {
        if (((zaxf)localObject).c != null)
        {
          int i4 = ((zaxf)localObject).c.size();
          for (int i5 = 0; i5 < i4; i5++)
          {
            zfa localzfa = (zfa)((zaxf)localObject).c.get(i5);
            localzfa.b = true;
          }
        }
        paramzaxf.d.remove(i3--);
      }
    }
  }
  
  private void a(PivotField paramPivotField, zaxf paramzaxf, AutoFilter paramAutoFilter, zaca paramzaca)
  {
    HashMap localHashMap = new HashMap();
    int i1 = paramzaxf.d.size();
    zaxf localzaxf;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localzaxf = (zaxf)paramzaxf.d.get(i2);
      zaie localzaie = a(localzaxf.a, null, localzaxf.c, true, paramPivotField, i2, null, paramzaca);
      localzaie = a(localzaie);
      if (localzaie.b() != 12)
      {
        Object localObject = localzaie.b(paramzaca);
        if (!paramAutoFilter.a(localObject)) {
          localHashMap.put(Integer.valueOf(localzaxf.b), localObject);
        }
      }
    }
    for (i2 = 0; i2 < paramzaxf.d.size(); i2++)
    {
      localzaxf = (zaxf)paramzaxf.d.get(i2);
      if (!localHashMap.containsKey(Integer.valueOf(localzaxf.b)))
      {
        if (localzaxf.c != null)
        {
          int i3 = localzaxf.c.size();
          for (int i4 = 0; i4 < i3; i4++)
          {
            zfa localzfa = (zfa)localzaxf.c.get(i4);
            localzfa.b = true;
          }
        }
        paramzaxf.d.remove(i2--);
      }
    }
  }
  
  int[][] a(int paramInt)
  {
    if (paramInt < 0)
    {
      paramInt = 0;
      for (int i1 = 0; i1 < this.v; i1++)
      {
        PivotField localPivotField1 = this.a.getPageFields().get(i1);
        if ((localPivotField1.getCurrentPageItem() >= 0) && (localPivotField1.getCurrentPageItem() < localPivotField1.getPivotItems().getCount())) {
          paramInt++;
        }
      }
    }
    if (paramInt == 0) {
      return (int[][])null;
    }
    int[][] arrayOfInt = new int[paramInt][];
    paramInt = 0;
    for (int i2 = 0; i2 < this.v; i2++)
    {
      PivotField localPivotField2 = this.a.getPageFields().get(i2);
      if ((localPivotField2.getCurrentPageItem() >= 0) && (localPivotField2.getCurrentPageItem() <= localPivotField2.getPivotItems().getCount()))
      {
        PivotItem localPivotItem = localPivotField2.getPivotItems().get(localPivotField2.getCurrentPageItem());
        arrayOfInt[paramInt] = new int[2];
        arrayOfInt[paramInt][0] = localPivotField2.k.c();
        arrayOfInt[paramInt][1] = localPivotItem.getIndex();
        paramInt++;
      }
    }
    return arrayOfInt;
  }
  
  Object a(ArrayList paramArrayList, boolean paramBoolean, zbug paramzbug1, zbug paramzbug2)
  {
    return null;
  }
  
  zaie b(int paramInt, zaca paramzaca)
  {
    if ((this.a.d.B == null) || (paramInt >= this.a.d.B.f.size())) {
      return zabg.a;
    }
    zbui localzbui = (zbui)this.a.d.B.f.get(paramInt);
    if ((localzbui.b & 0xFFFF) >= this.a.d.i.size()) {
      return zabg.a;
    }
    if ((localzbui.b & 0xFFFF) >= this.B.length)
    {
      localzbtv = (zbtv)this.a.d.i.get(localzbui.b & 0xFFFF);
      if ((localzbtv != null) && (localzbtv.m()))
      {
        localObject1 = this.a.d.B;
        this.a.d.B = localzbtv;
        localObject2 = a(localzbtv.e, paramzaca);
        this.a.d.B = ((zbtv)localObject1);
        return (zaie)localObject2;
      }
    }
    zbtv localzbtv = (zbtv)this.a.d.i.get(localzbui.b & 0xFFFF);
    if ((this.S == null) || (this.T == null))
    {
      int i1;
      PivotField localPivotField;
      if ((this.S == null) && (this.T != null))
      {
        if (this.q >= this.T.size()) {
          return zabg.a;
        }
        localObject1 = (zbug)this.T.get(this.q);
        localObject2 = b(((zbug)localObject1).d, (zbug)localObject1, this.j == 2, this.a.getColumnFields());
        if (localObject2 == null) {
          return zabg.a;
        }
        i1 = 0;
        int i2 = 0;
        localPivotField = this.a.getBaseFields().get(localzbtv.w());
        localObject3 = new int[] { i1 };
        localObject4 = new boolean[] { i2 };
        localObject5 = zaxc.a((ArrayList)localObject2, false, localPivotField, this.B, localPivotField.getFunction(), this.a.d, 0, null, (int[])localObject3, (boolean[])localObject4);
        i1 = localObject3[0];
        i2 = localObject4[0];
        return zaxd.a(localPivotField.getFunction(), i1, (ArrayList)localObject5, i2);
      }
      if ((this.S != null) && (this.T == null))
      {
        if (this.p >= this.S.size()) {
          return zabg.a;
        }
        localObject1 = (zbug)this.S.get(this.p);
        localObject2 = b(((zbug)localObject1).d, (zbug)localObject1, this.j == 1, this.a.getRowFields());
        if (localObject2 == null) {
          return zabg.a;
        }
        i1 = 0;
        int i3 = 0;
        localPivotField = this.a.getBaseFields().get(localzbtv.w());
        localObject3 = new int[] { i1 };
        localObject4 = new boolean[] { i3 };
        localObject5 = zaxc.a((ArrayList)localObject2, false, localPivotField, this.B, localPivotField.getFunction(), this.a.d, 0, null, (int[])localObject3, (boolean[])localObject4);
        i1 = localObject3[0];
        i3 = localObject4[0];
        return zaxd.a(localPivotField.getFunction(), i1, (ArrayList)localObject5, i3);
      }
      return zabg.a;
    }
    if ((this.p >= this.S.size()) || (this.q >= this.T.size())) {
      return null;
    }
    Object localObject1 = (zbug)this.S.get(this.p);
    Object localObject2 = (zbug)this.T.get(this.q);
    ArrayList localArrayList1 = new ArrayList();
    if (this.a.getBaseFields().get(localzbui.b & 0xFFFF).m == 1) {
      localArrayList1 = b(((zbug)localObject1).d, (zbug)localObject1, this.j == 1, this.a.getRowFields());
    } else {
      localArrayList1 = b(((zbug)localObject1).d, (zbug)localObject2, this.j == 2, this.a.getColumnFields());
    }
    if (localArrayList1 == null) {
      return zabg.a;
    }
    int i4 = 0;
    int i5 = 0;
    Object localObject3 = this.a.getBaseFields().get(localzbtv.w());
    Object localObject4 = { i4 };
    Object localObject5 = { i5 };
    ArrayList localArrayList2 = zaxc.a(localArrayList1, false, (PivotField)localObject3, this.B, ((PivotField)localObject3).getFunction(), this.a.d, 0, null, (int[])localObject4, (boolean[])localObject5);
    i4 = localObject4[0];
    i5 = localObject5[0];
    return zaxd.a(((PivotField)localObject3).getFunction(), i4, localArrayList2, i5);
  }
  
  zaie a(byte[] paramArrayOfByte, zaca paramzaca)
  {
    if (paramArrayOfByte == null) {
      return zabg.a;
    }
    zaag localzaag = new zaag(paramzaca, paramArrayOfByte, 0, paramArrayOfByte.length);
    return localzaag.a().e(paramzaca);
  }
  
  zaie a(PivotItem paramPivotItem1, PivotItem paramPivotItem2, ArrayList paramArrayList, boolean paramBoolean, PivotField paramPivotField, int paramInt, zbug paramzbug, zaca paramzaca)
  {
    if ((paramPivotField.isCalculatedField()) && (paramArrayList.size() != 0))
    {
      this.o = true;
      this.b.p().a(this);
      this.q = paramInt;
      this.a.d.B = paramPivotField.k.h;
      zaie localzaie = a(paramPivotField.k.h.e, paramzaca);
      this.b.p().a(null);
      return localzaie;
    }
    int i1 = 0;
    int i2 = 0;
    int[] arrayOfInt = { i1 };
    boolean[] arrayOfBoolean = { i2 };
    ArrayList localArrayList = zaxc.a(paramArrayList, paramBoolean, paramPivotField, this.B, paramPivotField.getFunction(), this.a.d, paramInt, paramzbug, arrayOfInt, arrayOfBoolean);
    i1 = arrayOfInt[0];
    i2 = arrayOfBoolean[0];
    return zaxd.a(paramPivotField.getFunction(), i1, localArrayList, i2);
  }
  
  private void a(zaxf paramzaxf, PivotFieldCollection paramPivotFieldCollection, int paramInt, zaca paramzaca)
  {
    PivotField localPivotField1 = paramPivotFieldCollection.get(paramInt);
    int i1 = localPivotField1.getAutoShowField();
    if ((i1 >= this.u) || (i1 < 0)) {
      return;
    }
    PivotField localPivotField2 = this.a.getDataFields().get(i1);
    zawv localzawv = new zawv(true, localPivotField1.isAscendSort());
    int i2 = paramzaxf.d.size();
    for (int i3 = 0; i3 < i2; i3++)
    {
      localObject = (zaxf)paramzaxf.d.get(i3);
      zaie localzaie = a(((zaxf)localObject).a, null, ((zaxf)localObject).c, true, localPivotField2, i3, null, paramzaca);
      localzaie = a(localzaie);
      localzawv.a(localzaie.b(paramzaca), i3);
    }
    int[] arrayOfInt = localzawv.a();
    Object localObject = new ArrayList();
    int i4 = arrayOfInt.length;
    for (int i5 = 0; i5 < i4; i5++) {
      zf.a((ArrayList)localObject, paramzaxf.d.get(arrayOfInt[i5]));
    }
    paramzaxf.d = ((ArrayList)localObject);
  }
  
  private boolean a(PivotFieldCollection paramPivotFieldCollection)
  {
    if (paramPivotFieldCollection.getCount() > 1)
    {
      PivotField localPivotField = paramPivotFieldCollection.get(paramPivotFieldCollection.getCount() - 1);
      if ((this.u > 1) && (localPivotField == this.a.getDataField())) {
        return false;
      }
      if (localPivotField.getSubtotals(1)) {
        return false;
      }
      return !localPivotField.getSubtotals(0);
    }
    return false;
  }
  
  private Style f(int paramInt1, int paramInt2)
  {
    Style localStyle = this.a.ac.a(this.a.ad[(paramInt1 - this.a.i)][(paramInt2 - this.a.k)]);
    int i1 = this.b.d(paramInt1, paramInt2);
    int i2 = this.d.C().a(localStyle);
    if (i2 == 15) {
      return null;
    }
    if (i2 != i1) {
      return localStyle;
    }
    return null;
  }
  
  private void a(Cell paramCell, Style paramStyle)
  {
    Style localStyle1 = paramCell.getStyle();
    if ((localStyle1.isModified(24)) && (localStyle1.j()))
    {
      Style localStyle2 = new Style();
      localStyle2.copy(paramStyle);
      localStyle2.b(localStyle1.s());
      localStyle2.f(localStyle1.getNumber());
      paramCell.a(localStyle2);
    }
    else
    {
      paramCell.a(paramStyle);
    }
  }
  
  private void a(Cell paramCell)
  {
    a(paramCell.getRow(), paramCell.getColumn(), paramCell);
  }
  
  private void a(int paramInt1, int paramInt2, Cell paramCell)
  {
    Style localStyle1 = this.a.ac.a(this.a.ad[(paramInt1 - this.a.i)][(paramInt2 - this.a.k)]);
    if (paramCell == null) {
      paramCell = this.b.a(paramInt1, paramInt2, false);
    }
    Style localStyle2 = paramCell.getStyle();
    if ((localStyle2.isModified(24)) && (localStyle2.j()))
    {
      Style localStyle3 = new Style();
      localStyle3.copy(localStyle1);
      localStyle3.b(localStyle2.s());
      localStyle3.f(localStyle2.getNumber());
      paramCell.a(localStyle3);
    }
    else
    {
      paramCell.a(localStyle1);
    }
  }
  
  private void a(Cell paramCell, int paramInt1, int paramInt2)
  {
    if (paramCell == null) {
      return;
    }
    Style localStyle1 = this.a.ac.a(this.a.ae[paramInt1][paramInt2]);
    Style localStyle2 = paramCell.getStyle();
    if ((localStyle2.isModified(24)) && (localStyle2.j()))
    {
      Style localStyle3 = new Style();
      localStyle3.copy(localStyle1);
      localStyle3.b(localStyle2.s());
      localStyle3.f(localStyle2.getNumber());
      paramCell.a(localStyle3);
    }
    else
    {
      paramCell.a(localStyle1);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */