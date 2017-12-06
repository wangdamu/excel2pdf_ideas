package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcgx
{
  private zchd a;
  private Workbook b;
  private zqh c;
  private WorksheetCollection d;
  private zcbw e;
  private PivotTable f;
  private int g;
  private byte[] h;
  private int i;
  private ArrayList j;
  private zqi k;
  private Worksheet l;
  
  zcgx(zchd paramzchd)
  {
    this.a = paramzchd;
    this.b = paramzchd.a;
    this.c = paramzchd.b;
    this.j = new ArrayList();
  }
  
  void a(zqi paramzqi, zcbw paramzcbw)
    throws Exception
  {
    this.b.i();
    this.e = paramzcbw;
    this.k = paramzqi;
    this.l = paramzqi.d;
    this.d = paramzqi.d.c();
    this.f = new PivotTable(this.l.getPivotTables());
    this.f.s = false;
    this.l.getPivotTables().a(this.f);
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 315: 
        this.e.a(1L);
        return;
      case 280: 
        a();
        break;
      case 314: 
        b();
        break;
      case 285: 
        c();
        break;
      case 309: 
        d();
        break;
      case 299: 
        h();
        break;
      case 311: 
        e();
        break;
      case 301: 
        i();
        break;
      case 303: 
        m();
        break;
      case 558: 
        b(this.f.getPivotFormatConditions());
        break;
      case 1147: 
        a(this.f.getPivotFormatConditions());
        break;
      case 289: 
        f();
        break;
      case 293: 
        g();
        break;
      case 513: 
        j();
        break;
      case 601: 
        k();
        break;
      case 1062: 
        l();
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private boolean a()
    throws Exception
  {
    this.h = this.a.a(this.e);
    int m = zc.a(this.h, 0);
    int n = zc.a(this.h, 4);
    int i1 = zc.a(this.h, 8);
    this.f.setDisplayImmediateItems(((m & 0xF00) >> 8 & 0x1) != 0);
    this.f.O = (((m & 0xF00) >> 8 & 0x2) != 0);
    this.f.setEnableFieldList(((m & 0xF00) >> 8 & 0x4) == 0);
    this.f.setShowDrill(((m & 0xF00000) >> 20 & 0x1) == 0);
    this.f.setPrintDrill(((m & 0xF00000) >> 20 & 0x2) != 0);
    this.f.H = (((m & 0xF00000) >> 20 & 0x4) != 0);
    this.f.setShowDataTips(((m & 0xF00000) >> 20 & 0x8) == 0);
    this.f.C = ((m & 0x7F000000) >> 24);
    this.f.setShowRowHeaderCaption(((m & 0x80000000) >> 31 & 1L) == 0L);
    this.f.setShowEmptyRow((n & 0xF & 0x4) != 0);
    this.f.setShowEmptyCol((n & 0xF & 0x8) != 0);
    this.f.setEnableWizard(((n & 0xF0) >> 4 & 0x1) != 0);
    this.f.setEnableDrilldown(((n & 0xF0) >> 4 & 0x2) != 0);
    this.f.setEnableFieldDialog(((n & 0xF0) >> 4 & 0x4) != 0);
    this.f.setPreserveFormatting(((n & 0xF0) >> 4 & 0x8) != 0);
    this.f.setAutoFormat(((n & 0xF00) >> 8 & 0x1) != 0);
    this.f.setDisplayErrorString(((n & 0xF00) >> 8 & 0x2) != 0);
    this.f.setDisplayNullString(((n & 0xF00) >> 8 & 0x4) != 0);
    this.f.setPageFieldOrder(((n & 0xF00) >> 8 & 0x8) != 0 ? 1 : 0);
    this.f.setSubtotalHiddenPageItems(((n & 0xF000) >> 12 & 0x1) != 0);
    this.f.setColumnGrand(((n & 0xF000) >> 12 & 0x2) != 0);
    this.f.setRowGrand(((n & 0xF000) >> 12 & 0x4) != 0);
    this.f.setPrintTitles(((n & 0xF000) >> 12 & 0x8) != 0);
    this.f.setItemPrintTitles(((n & 0xF0000) >> 16 & 0x2) != 0);
    this.f.setMergeLabels(((n & 0xF0000) >> 16 & 0x4) != 0);
    int i2 = ((n & 0xF0000) >> 16 & 0x8) != 0 ? 1 : 0;
    int i3 = ((n & 0xF00000) >> 20 & 0x1) != 0 ? 1 : 0;
    int i4 = ((n & 0xF00000) >> 20 & 0x2) != 0 ? 1 : 0;
    int i5 = ((n & 0xF00000) >> 20 & 0x4) != 0 ? 1 : 0;
    int i6 = ((n & 0xF00000) >> 20 & 0x8) != 0 ? 1 : 0;
    int i7 = ((n & 0xF0000000) >> 28 & 0x4) != 0L ? 1 : 0;
    this.f.u = ((i1 & 0xF & 0x1) != 0);
    this.f.w = ((i1 & 0xF & 0x2) != 0);
    this.f.x = ((i1 & 0xF & 0x4) != 0);
    this.f.v = ((i1 & 0xF & 0x8) != 0);
    this.f.t = (((i1 & 0xF0) >> 4 & 0x1) == 0);
    int i8 = ((i1 & 0xF0) >> 4 & 0x4) == 0 ? 1 : 0;
    int i9 = ((i1 & 0xF0) >> 4 & 0x8) == 0 ? 1 : 0;
    int i10 = ((i1 & 0xF00) >> 8 & 0x4) != 0 ? 1 : 0;
    int i11 = ((i1 & 0xF00) >> 8 & 0x8) != 0 ? 1 : 0;
    this.f.setMultipleFieldFilters(((i1 & 0xF00) >> 8 & 0x2) == 0);
    this.f.setFieldListSortAscending(((i1 & 0x1000) >> 12 & 0x1) != 0);
    this.f.setCustomListSort((i1 & 0x4000) >> 12 == 0);
    this.f.setPageFieldWrapCount(this.h[13]);
    this.f.y = true;
    this.f.A = true;
    this.f.B = (this.h[14] & 0xFF);
    this.f.z = (this.h[14] & 0xFF);
    int i12 = zc.b(this.h, 20);
    this.f.setAutoFormatType(zauj.aa(i12));
    this.f.aa = zc.a(this.h, 28);
    int i13 = 32;
    int[] arrayOfInt = { i13 };
    this.f.b.g = zcgj.a(this.h, arrayOfInt);
    i13 = arrayOfInt[0];
    if (i2 != 0)
    {
      arrayOfInt = new int[] { i13 };
      this.f.b.h = zcgj.a(this.h, arrayOfInt);
      i13 = arrayOfInt[0];
    }
    String str;
    if (i3 != 0)
    {
      arrayOfInt = new int[] { i13 };
      str = zcgj.a(this.h, arrayOfInt);
      i13 = arrayOfInt[0];
    }
    if (i8 != 0)
    {
      arrayOfInt = new int[] { i13 };
      this.f.setErrorString(zcgj.a(this.h, arrayOfInt));
      i13 = arrayOfInt[0];
    }
    if (i9 != 0)
    {
      arrayOfInt = new int[] { i13 };
      this.f.setNullString(zcgj.a(this.h, arrayOfInt));
      i13 = arrayOfInt[0];
    }
    if (i4 != 0)
    {
      arrayOfInt = new int[] { i13 };
      str = zcgj.a(this.h, arrayOfInt);
      i13 = arrayOfInt[0];
    }
    if (i5 != 0)
    {
      arrayOfInt = new int[] { i13 };
      this.f.setPivotTableStyleName(zcgj.a(this.h, arrayOfInt));
      i13 = arrayOfInt[0];
    }
    if (i6 != 0)
    {
      arrayOfInt = new int[] { i13 };
      str = zcgj.a(this.h, arrayOfInt);
      i13 = arrayOfInt[0];
    }
    if (i7 != 0)
    {
      arrayOfInt = new int[] { i13 };
      this.f.setTag(zcgj.a(this.h, arrayOfInt));
      i13 = arrayOfInt[0];
    }
    if (i11 != 0)
    {
      arrayOfInt = new int[] { i13 };
      this.f.setColumnHeaderCaption(zcgj.a(this.h, arrayOfInt));
      i13 = arrayOfInt[0];
    }
    if (i10 != 0)
    {
      arrayOfInt = new int[] { i13 };
      this.f.setRowHeaderCaption(zcgj.a(this.h, arrayOfInt));
      i13 = arrayOfInt[0];
    }
    return true;
  }
  
  private void b()
  {
    this.h = this.a.a(this.e);
    this.f.i = zc.a(this.h, 0);
    this.f.j = zc.a(this.h, 4);
    this.f.k = zc.a(this.h, 8);
    this.f.l = zc.a(this.h, 12);
    this.f.m = zc.a(this.h, 16);
    this.f.n = zc.a(this.h, 20);
    this.f.o = zc.a(this.h, 24);
  }
  
  private void c()
    throws Exception
  {
    PivotField localPivotField = new PivotField(this.f.getBaseFields());
    localPivotField.l = this.f;
    localPivotField.t = this.f.getBaseFields().getCount();
    if ((this.f.d != null) && (this.f.d.i != null) && (localPivotField.t < this.f.d.i.size())) {
      localPivotField.h = ((zbtv)this.f.d.i.get(this.f.getBaseFields().getCount()));
    }
    localPivotField.setShowInOutlineForm(true);
    localPivotField.setShowCompact(true);
    localPivotField.setShowSubtotalAtTop(true);
    localPivotField.setShowAllItems(true);
    this.f.getBaseFields().a(localPivotField);
    this.h = this.a.a(this.e);
    int m = this.h[0] & 0xFF & 0xF;
    localPivotField.a((this.h[0] & 0xFF & 0x8) != 0);
    if ((m & 0x1) != 0) {
      localPivotField.m = 1;
    } else if ((m & 0x2) != 0) {
      localPivotField.m = 2;
    } else if ((m & 0x4) != 0) {
      localPivotField.m = 4;
    } else if ((m & 0x8) != 0) {
      localPivotField.m = 8;
    }
    int n = zc.a(this.h, 4);
    localPivotField.d.d = ((short)n);
    localPivotField.d.e = this.d.g(localPivotField.d.d);
    int i1 = zc.b(this.h, 1);
    if (((i1 & 0x1) == 0) && ((!localPivotField.h()) || (localPivotField.m != 8))) {
      localPivotField.setSubtotals(0, true);
    }
    int i2 = this.h[3];
    localPivotField.setShowCompact((i2 & 0xFF & 0x10) != 0);
    localPivotField.p = ((i2 & 0xFF & 0x80) != 0);
    int i3 = zc.b(this.h, 8);
    localPivotField.setDragToRow((i3 & 0x1) != 0);
    localPivotField.setDragToColumn((i3 & 0x2) != 0);
    localPivotField.setDragToPage((i3 & 0x4) != 0);
    localPivotField.setDragToHide((i3 & 0x8) != 0);
    localPivotField.setDragToData((i3 & 0x10) != 0);
    localPivotField.setShowAllItems((i3 & 0x20) != 0);
    localPivotField.setShowInOutlineForm((i3 & 0x40) != 0);
    localPivotField.setInsertBlankRow((i3 & 0x80) != 0);
    localPivotField.setShowSubtotalAtTop((i3 & 0x100) != 0);
    localPivotField.setInsertPageBreaksBetweenItems((i3 & 0x800) != 0);
    localPivotField.setAscendSort((i3 & 0x2000) != 0);
    localPivotField.setAutoSort((i3 & 0x1000) != 0);
    localPivotField.setAutoShow((i3 & 0x4000) != 0);
    localPivotField.setAscendShow((i3 & 0x8000) != 0);
    int i4 = zc.b(this.h, 10);
    localPivotField.setIncludeNewItemsInFilter((i4 & 0x4) == 0);
    localPivotField.setMultipleItemSelectionAllowed((i4 & 0x8) != 0);
    int i5 = 20;
    int[] arrayOfInt = { i5 };
    localPivotField.setDisplayName(zcgj.a(this.h, arrayOfInt));
    i5 = arrayOfInt[0];
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 286: 
        this.e.a(1L);
        return;
      case 282: 
        a(localPivotField);
        break;
      case 459: 
        this.h = this.a.a(this.e);
        localPivotField.f = new zbur();
        b(localPivotField.f);
        break;
      case 1061: 
        b(localPivotField);
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void a(PivotField paramPivotField)
    throws Exception
  {
    this.h = this.a.a(this.e);
    byte b1 = this.h[0];
    if (b1 != 0) {
      if (b1 != 1) {
        paramPivotField.setSubtotals(zcij.a(b1), true);
      } else {
        return;
      }
    }
    PivotItem localPivotItem = new PivotItem(paramPivotField.getPivotItems());
    paramPivotField.getPivotItems().a(localPivotItem);
    int m = zc.b(this.h, 1);
    localPivotItem.setHidden((m & 0x1) != 0);
    localPivotItem.a((m & 0x2) != 0);
    localPivotItem.b((m & 0x4) != 0);
    localPivotItem.c((m & 0x8) != 0);
    localPivotItem.g = ((m & 0x20) != 0);
    localPivotItem.f = ((m & 0x40) != 0);
    localPivotItem.setIndex(zc.a(this.h, 3));
    int n = 7;
    int[] arrayOfInt = { n };
    localPivotItem.d = zcgj.a(this.h, arrayOfInt);
    n = arrayOfInt[0];
  }
  
  private void d()
  {
    this.h = this.a.a(this.e);
    int m = zc.a(this.h, 0);
    PivotFieldCollection localPivotFieldCollection = this.f.getRowFields();
    int n = 4;
    for (int i1 = 0; i1 < m; i1++)
    {
      int i2 = zc.a(this.h, n);
      if (i2 == -2)
      {
        this.f.f = new PivotField(this.f, this.f.getDataFields());
        this.f.f.t = -2;
        this.f.f.m = 1;
        localPivotFieldCollection.a(this.f.getDataField());
      }
      else
      {
        PivotField localPivotField = this.f.getBaseFields().get(i2);
        localPivotField.t = i2;
        localPivotFieldCollection.a(localPivotField);
      }
      n += 4;
    }
  }
  
  private void e()
  {
    this.h = this.a.a(this.e);
    int m = zc.a(this.h, 0);
    PivotFieldCollection localPivotFieldCollection = this.f.getColumnFields();
    int n = 4;
    for (int i1 = 0; i1 < m; i1++)
    {
      int i2 = zc.a(this.h, n);
      if (i2 == -2)
      {
        this.f.f = new PivotField(this.f, this.f.getDataFields());
        this.f.f.t = -2;
        this.f.f.m = 2;
        localPivotFieldCollection.a(this.f.getDataField());
      }
      else
      {
        PivotField localPivotField = this.f.getBaseFields().get(i2);
        localPivotField.t = i2;
        localPivotFieldCollection.a(localPivotField);
      }
      n += 4;
    }
  }
  
  private void f()
    throws Exception
  {
    this.h = this.a.a(this.e);
    int m = zc.a(this.h, 0);
    PivotField localPivotField = this.f.getBaseFields().get(m);
    this.f.getPageFields().a(localPivotField);
    localPivotField.i = new zbtq();
    localPivotField.j = new zbuo(localPivotField);
    zbtq localzbtq = localPivotField.i;
    localPivotField.t = m;
    int n = zc.a(this.h, 4);
    if (n != 1048830)
    {
      localPivotField.j.b = ((short)n);
      localPivotField.j.c = localPivotField.e.get(n).getIndex();
    }
    localPivotField.j.d = zc.a(this.h, 8);
    int i1 = this.h[12];
    int i2 = 13;
    int[] arrayOfInt;
    if ((i1 & 0xFF & 0x1) == 1)
    {
      arrayOfInt = new int[] { i2 };
      localPivotField.j.f = zcgj.a(this.h, arrayOfInt);
      i2 = arrayOfInt[0];
    }
    if ((i1 & 0xFF & 0x2) != 0)
    {
      arrayOfInt = new int[] { i2 };
      localPivotField.j.e = zcgj.a(this.h, arrayOfInt);
      i2 = arrayOfInt[0];
    }
  }
  
  private void g()
    throws Exception
  {
    this.h = this.a.a(this.e);
    PivotFieldCollection localPivotFieldCollection = this.f.getDataFields();
    PivotField localPivotField = new PivotField();
    localPivotField.b = localPivotFieldCollection;
    localPivotField.a(localPivotFieldCollection.getCount());
    localPivotFieldCollection.a(localPivotField);
    int m = zc.a(this.h, 0);
    localPivotField.k = this.f.getBaseFields().get(m);
    localPivotField.a(true);
    zbtq localzbtq = localPivotField.i = new zbtq();
    localzbtq.h = localPivotField;
    switch (this.h[4])
    {
    case 0: 
      localzbtq.a = 0;
      break;
    case 1: 
      localzbtq.a = 1;
      break;
    case 2: 
      localzbtq.a = 2;
      break;
    case 3: 
      localzbtq.a = 3;
      break;
    case 4: 
      localzbtq.a = 4;
      break;
    case 5: 
      localzbtq.a = 5;
      break;
    case 6: 
      localzbtq.a = 6;
      break;
    case 7: 
      localzbtq.a = 7;
      break;
    case 8: 
      localzbtq.a = 8;
      break;
    case 9: 
      localzbtq.a = 9;
      break;
    case 10: 
      localzbtq.a = 10;
    }
    localzbtq.b = (this.h[8] & 0xFF);
    localzbtq.c = zc.a(this.h, 12);
    try
    {
      localzbtq.d = zc.a(this.h, 16);
    }
    catch (Exception localException)
    {
      localzbtq.d = 0;
    }
    localzbtq.e = ((short)zc.a(this.h, 20));
    localzbtq.f = this.d.g(localzbtq.e);
    int n = 25;
    Object localObject;
    if (this.h[24] == 1)
    {
      localObject = new int[] { n };
      localzbtq.g = zcgj.a(this.h, (int[])localObject);
      n = localObject[0];
    }
    if (this.f.getDataField() != null)
    {
      localObject = new PivotItem(this.f.f.e);
      this.f.f.e.a((PivotItem)localObject);
      ((PivotItem)localObject).setIndex(this.f.getDataFields().getCount() - 1);
      ((PivotItem)localObject).e = localPivotField;
    }
  }
  
  private void h()
  {
    this.f.s = true;
    this.h = this.a.a(this.e);
    int m = zc.a(this.h, 0);
    ArrayList localArrayList1 = null;
    int n = 0;
    this.f.g = (localArrayList1 = new ArrayList(m));
    n = 4 + this.f.getRowFields().getCount();
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 300: 
        this.e.a(1L);
        return;
      case 297: 
        int[] arrayOfInt1 = new int[n];
        for (int i1 = 4; i1 < n; i1++) {
          arrayOfInt1[i1] = 32767;
        }
        zf.a(localArrayList1, arrayOfInt1);
        if ((this.f.getDataField() != null) && (this.f.getDataField().m == 1)) {
          arrayOfInt1[3] |= 0x1000;
        }
        this.h = this.a.a(this.e);
        i1 = zc.b(this.h, 0);
        int i2 = zc.b(this.h, 2);
        int i3 = zc.a(this.h, 8);
        arrayOfInt1[3] = (i3 << 1 | arrayOfInt1[3]);
        arrayOfInt1[1] = i2;
        if (i2 == 13)
        {
          arrayOfInt1[3] |= 0xA00;
          if (this.f.getBaseFields().b() > 1) {
            arrayOfInt1[3] |= 0x1;
          }
        }
        else if (i2 == 14)
        {
          arrayOfInt1[3] = 8192;
        }
        else if (i2 == 1)
        {
          arrayOfInt1[3] |= 0x200;
        }
        if (i2 != 1) {
          for (int i4 = 4; i4 < n; i4++) {
            arrayOfInt1[i4] = 0;
          }
        }
        arrayOfInt1[0] = i1;
        if (i1 > 0)
        {
          ArrayList localArrayList2 = null;
          int[] arrayOfInt2 = null;
          localArrayList2 = this.f.g;
          int i5 = localArrayList2.size();
          if (i5 > 1) {
            arrayOfInt2 = (int[])localArrayList2.get(i5 - 2);
          } else {
            arrayOfInt2 = (int[])localArrayList2.get(i5 - 1);
          }
          for (int i6 = 0; i6 < i1; i6++) {
            arrayOfInt1[(4 + i6)] = arrayOfInt2[(4 + i6)];
          }
        }
        a(arrayOfInt1, i1);
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void a(int[] paramArrayOfInt, int paramInt)
  {
    int m = 4;
    int n = 0;
    int i1 = paramArrayOfInt[0];
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 298: 
        this.e.a(1L);
        return;
      case 389: 
        paramArrayOfInt[2] = (n + i1);
        this.e.a(1L);
        return;
      case 388: 
        this.h = this.a.a(this.e);
        int i2 = this.h.length / 4;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++)
        {
          paramArrayOfInt[(m + i1)] = zc.a(this.h, i3);
          i3 += 4;
          m++;
          n++;
        }
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void i()
  {
    this.h = this.a.a(this.e);
    int m = zc.a(this.h, 0);
    ArrayList localArrayList1 = null;
    int n = 0;
    this.f.h = (localArrayList1 = new ArrayList(m));
    n = 4 + this.f.getColumnFields().getCount();
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 302: 
        this.e.a(1L);
        return;
      case 297: 
        int[] arrayOfInt1 = new int[n];
        for (int i1 = 4; i1 < n; i1++) {
          arrayOfInt1[i1] = 32767;
        }
        zf.a(localArrayList1, arrayOfInt1);
        if ((this.f.getDataField() != null) && (this.f.getDataField().m == 2)) {
          arrayOfInt1[3] |= 0x1000;
        }
        this.h = this.a.a(this.e);
        i1 = zc.b(this.h, 0);
        int i2 = zc.b(this.h, 2);
        int i3 = zc.a(this.h, 8);
        arrayOfInt1[3] = (i3 << 1 | arrayOfInt1[3]);
        arrayOfInt1[1] = i2;
        if (i2 == 13)
        {
          arrayOfInt1[3] |= 0xA00;
          if (this.f.getBaseFields().b() > 1) {
            arrayOfInt1[3] |= 0x1;
          }
        }
        else if (i2 == 14)
        {
          arrayOfInt1[3] = 8192;
        }
        else if (i2 == 1)
        {
          arrayOfInt1[3] |= 0x200;
        }
        if (i2 != 1) {
          for (int i4 = 4; i4 < n; i4++) {
            arrayOfInt1[i4] = 0;
          }
        }
        arrayOfInt1[0] = i1;
        if (i1 > 0)
        {
          ArrayList localArrayList2 = null;
          int[] arrayOfInt2 = null;
          localArrayList2 = this.f.h;
          int i5 = localArrayList2.size();
          if (i5 > 1) {
            arrayOfInt2 = (int[])localArrayList2.get(i5 - 2);
          } else {
            arrayOfInt2 = (int[])localArrayList2.get(i5 - 1);
          }
          for (int i6 = 0; i6 < i1; i6++) {
            arrayOfInt1[(4 + i6)] = arrayOfInt2[(4 + i6)];
          }
        }
        a(arrayOfInt1, i1);
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void j()
    throws Exception
  {
    this.h = this.a.a(this.e);
    int m = this.h[0];
    this.f.setShowPivotStyleLastColumn((m & 0xFF & 0x2) != 0);
    this.f.setShowPivotStyleRowStripes((m & 0xFF & 0x4) != 0);
    this.f.setShowPivotStyleColumnStripes((m & 0xFF & 0x8) != 0);
    this.f.setShowPivotStyleRowHeader((m & 0xFF & 0x10) != 0);
    this.f.setShowPivotStyleColumnHeader((m & 0xFF & 0x20) != 0);
    int n = 2;
    int[] arrayOfInt = { n };
    this.f.setPivotTableStyleName(zcgj.a(this.h, arrayOfInt));
    n = arrayOfInt[0];
  }
  
  private void k()
    throws Exception
  {
    this.h = this.a.a(this.e);
    PivotFilter localPivotFilter = new PivotFilter(this.l);
    this.f.ai.a(localPivotFilter);
    localPivotFilter.a = zc.a(this.h, 0);
    localPivotFilter.i = zc.a(this.h, 4);
    int m = zc.a(this.h, 8);
    localPivotFilter.b = zcij.J(m);
    localPivotFilter.e = zc.a(this.h, 12);
    localPivotFilter.c = zc.a(this.h, 16);
    localPivotFilter.d = zc.a(this.h, 20);
    int n = this.h[28];
    int i1 = (n & 0xFF & 0x1) != 0 ? 1 : 0;
    int i2 = (n & 0xFF & 0x4) != 0 ? 1 : 0;
    int i3 = (n & 0xFF & 0x8) != 0 ? 1 : 0;
    int i4 = 30;
    int[] arrayOfInt;
    if (i1 != 0)
    {
      arrayOfInt = new int[] { i4 };
      localPivotFilter.j = zcgj.a(this.h, arrayOfInt);
      i4 = arrayOfInt[0];
    }
    if (i2 != 0)
    {
      arrayOfInt = new int[] { i4 };
      localPivotFilter.g = zcgj.a(this.h, arrayOfInt);
      i4 = arrayOfInt[0];
    }
    if (i3 != 0)
    {
      arrayOfInt = new int[] { i4 };
      localPivotFilter.h = zcgj.a(this.h, arrayOfInt);
      i4 = arrayOfInt[0];
    }
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 161: 
        a(localPivotFilter.f);
        break;
      case 602: 
        for (int i5 = 0; i5 < localPivotFilter.f.c.getCount(); i5++)
        {
          FilterColumn localFilterColumn = localPivotFilter.f.c.get(i5);
          if (localFilterColumn.getFilterType() == 5)
          {
            PivotField localPivotField = this.f.getBaseFields().get(localPivotFilter.a);
            localPivotField.g = ((Top10Filter)localFilterColumn.getFilter()).getItems();
          }
        }
        this.e.a(1L);
        return;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void b(PivotField paramPivotField)
  {
    this.h = this.a.a(this.e);
    paramPivotField.setRepeatItemLabels((this.h[4] & 0xFF & 0x1) != 0);
  }
  
  private void l()
    throws Exception
  {
    this.h = this.a.a(this.e);
    this.f.J = ((this.h[4] & 0xFF & 0x10) == 0);
    this.f.setEnableDataValueEditing((this.h[4] & 0xFF & 0x4) != 0);
    int m = 9;
    int[] arrayOfInt = { m };
    this.f.setAltTextTitle(zcgj.a(this.h, arrayOfInt));
    m = arrayOfInt[0];
    arrayOfInt[0] = m;
    this.f.setAltTextDescription(zcgj.a(this.h, arrayOfInt));
    m = arrayOfInt[0];
  }
  
  private void a(AutoFilter paramAutoFilter)
    throws Exception
  {
    this.h = this.a.a(this.e);
    Name localName = this.b.getWorksheets().getNames().a("_FILTERDATABASE", this.l.getIndex());
    if (localName != null) {
      paramAutoFilter.a(localName);
    }
    int m = zc.a(this.h, 0);
    int n = zc.a(this.h, 4);
    int i1 = zc.a(this.h, 8);
    int i2 = zc.a(this.h, 12);
    paramAutoFilter.setRange(m, i1, i2);
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 162: 
        this.e.a(1L);
        return;
      case 163: 
        b(paramAutoFilter);
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void b(AutoFilter paramAutoFilter)
    throws Exception
  {
    this.h = this.a.a(this.e);
    int m = zc.a(this.h, 0);
    boolean bool1 = (this.h[4] & 0xFF & 0x1) == 1;
    boolean bool2 = (this.h[4] & 0xFF & 0x2) == 0;
    FilterColumn localFilterColumn = null;
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 164: 
        this.e.a(1L);
        if (localFilterColumn != null) {
          paramAutoFilter.c.a(localFilterColumn);
        }
        return;
      case 171: 
        this.h = this.a.a(this.e);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, m, bool1, bool2);
        localFilterColumn.setFilterType(2);
        DynamicFilter localDynamicFilter = new DynamicFilter();
        localFilterColumn.setFilter(localDynamicFilter);
        int n = zc.a(this.h, 0);
        localDynamicFilter.setDynamicFilterType(zcij.t(n));
        int i1 = this.h[4] == 1 ? 1 : 0;
        double d1 = zc.f(this.h, 5);
        double d2 = zc.f(this.h, 13);
        if (i1 != 0) {
          localDynamicFilter.setMaxValue(Double.valueOf(d2));
        }
        localDynamicFilter.setValue(Double.valueOf(d1));
        break;
      case 170: 
        this.h = this.a.a(this.e);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, m, bool1, bool2);
        localFilterColumn.setFilterType(5);
        boolean bool3 = (this.h[0] & 0xFF & 0x1) != 0;
        boolean bool4 = (this.h[0] & 0xFF & 0x2) != 0;
        int i2 = (this.h[0] & 0xFF & 0x4) != 0 ? 1 : 0;
        double d3 = zc.f(this.h, 1);
        double d4 = zc.f(this.h, 9);
        int i3 = 10;
        if (i2 != 0) {
          i3 = (int)d3;
        }
        Top10Filter localTop10Filter = new Top10Filter(bool3, bool4, i3);
        localFilterColumn.setFilter(localTop10Filter);
        try
        {
          localTop10Filter.setCriteria(Double.valueOf(d4));
        }
        catch (Exception localException) {}
        break;
      case 168: 
        this.h = this.a.a(this.e);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, m, bool1, bool2);
        localFilterColumn.setFilterType(0);
        ColorFilter localColorFilter = new ColorFilter(localFilterColumn);
        localFilterColumn.setFilter(localColorFilter);
        localColorFilter.setFilterByFillColor(this.h[4] == 1);
        localColorFilter.a(zc.a(this.h, 0));
        break;
      case 169: 
        this.h = this.a.a(this.e);
        int i4 = zc.a(this.h, 0);
        int i5 = zc.a(this.h, 4);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, m, bool1, bool2);
        localFilterColumn.setFilterType(4);
        IconFilter localIconFilter = new IconFilter(localFilterColumn);
        localFilterColumn.setFilter(localIconFilter);
        localIconFilter.setIconSetType(zcij.q(i4));
        localIconFilter.setIconId(i5);
        break;
      case 165: 
        localFilterColumn = new FilterColumn(paramAutoFilter.c, m, bool1, bool2);
        localFilterColumn.setFilterType(3);
        MultipleFilterCollection localMultipleFilterCollection = new MultipleFilterCollection();
        localFilterColumn.setFilter(localMultipleFilterCollection);
        a(localMultipleFilterCollection);
        break;
      case 172: 
        localFilterColumn = new FilterColumn(paramAutoFilter.c, m, bool1, bool2);
        localFilterColumn.setFilterType(1);
        CustomFilterCollection localCustomFilterCollection = new CustomFilterCollection();
        localFilterColumn.setFilter(localCustomFilterCollection);
        a(localCustomFilterCollection);
        break;
      case 166: 
      case 167: 
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void a(CustomFilterCollection paramCustomFilterCollection)
    throws Exception
  {
    this.h = this.a.a(this.e);
    boolean bool = this.h[0] == 1;
    paramCustomFilterCollection.setAnd(bool);
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 173: 
        this.e.a(1L);
        return;
      case 174: 
        this.h = this.a.a(this.e);
        int m = this.h[0];
        int n = this.h[1];
        CustomFilter localCustomFilter = new CustomFilter();
        paramCustomFilterCollection.a(localCustomFilter);
        localCustomFilter.setFilterOperatorType(zcij.v(n & 0xFF));
        if (m == 6)
        {
          String str = zcgj.d(this.h, 10);
          localCustomFilter.setCriteria(str);
        }
        else
        {
          localCustomFilter.setCriteria(Double.valueOf(zc.f(this.h, 2)));
        }
        break;
      }
    }
  }
  
  private void a(MultipleFilterCollection paramMultipleFilterCollection)
    throws Exception
  {
    this.h = this.a.a(this.e);
    int m = this.h[0] == 1 ? 1 : 0;
    if (m != 0) {
      paramMultipleFilterCollection.setMatchBlank(true);
    }
    int n = zc.a(this.h, 4);
    paramMultipleFilterCollection.a = zcij.s(n);
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 166: 
        this.e.a(1L);
        return;
      case 167: 
        this.h = this.a.a(this.e);
        String str = zcgj.d(this.h, 0);
        paramMultipleFilterCollection.b(str);
        break;
      case 175: 
        this.h = this.a.a(this.e);
        DateTimeGroupItem localDateTimeGroupItem = new DateTimeGroupItem();
        paramMultipleFilterCollection.a(localDateTimeGroupItem);
        localDateTimeGroupItem.setYear(zc.b(this.h, 0));
        localDateTimeGroupItem.setMonth(zc.b(this.h, 2));
        localDateTimeGroupItem.setDay(zc.a(this.h, 4));
        localDateTimeGroupItem.setHour(zc.b(this.h, 8));
        localDateTimeGroupItem.setMinute(zc.b(this.h, 10));
        localDateTimeGroupItem.setSecond(zc.b(this.h, 12));
        localDateTimeGroupItem.setDateTimeGroupingType(zcij.x(zc.a(this.h, 20)));
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void m()
  {
    this.h = this.a.a(this.e);
    zbub localzbub = new zbub(this.f.ag);
    this.f.ag.a(localzbub);
    localzbub.a = this.h[0];
    localzbub.b = zc.a(this.h, 2);
    b(localzbub.c);
  }
  
  private void a(PivotFormatConditionCollection paramPivotFormatConditionCollection)
  {
    this.h = this.a.a(this.e);
    int m = paramPivotFormatConditionCollection.a();
    PivotFormatCondition localPivotFormatCondition = paramPivotFormatConditionCollection.get(m);
    localPivotFormatCondition.d = zcij.L(zc.a(this.h, 20));
    localPivotFormatCondition.e = zcij.N(zc.a(this.h, 24));
    localPivotFormatCondition.c = zc.a(this.h, 28);
    zbur localzbur = new zbur();
    zf.a(localPivotFormatCondition.b, localzbur);
    a(localzbur);
  }
  
  private void a(zbur paramzbur)
  {
    zbtz localzbtz = null;
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 1162: 
        this.e.a(1L);
        return;
      case 1161: 
        this.h = this.a.a(this.e);
        paramzbur.b = this.h[4];
        int m = zc.a(this.h, 8);
        paramzbur.b(this.h[8]);
        paramzbur.a((m & 0x100) != 0);
        paramzbur.b((m & 0x200) != 0);
        paramzbur.c((m & 0x400) != 0);
        paramzbur.d((m & 0x800) != 0);
        paramzbur.e((m & 0x1000) != 0);
        paramzbur.f((m & 0x2000) != 0);
        paramzbur.h((m & 0x4000) != 0);
        paramzbur.g((m & 0x8000) != 0);
        paramzbur.a((byte)(this.h[10] & 0xFF & 0xF));
        paramzbur.a = ((byte)((this.h[10] & 0xFF & 0xF0) >> 4 + (this.h[11] & 0xFF) & 0xF));
        if ((paramzbur.j()) && (this.h.length == 28))
        {
          paramzbur.f = this.h[12];
          paramzbur.g = this.h[16];
          paramzbur.h = this.h[20];
          paramzbur.i = this.h[24];
        }
        break;
      case 1165: 
        this.h = this.a.a(this.e);
        localzbtz = new zbtz();
        zf.a(paramzbur.e, localzbtz);
        localzbtz.b(zc.a(this.h, 4));
        int n = zc.b(this.h, 12);
        localzbtz.q = ((n & 0x1) == 0);
        localzbtz.e = ((n & 0x2) != 0);
        localzbtz.f = ((n & 0x4) != 0);
        localzbtz.g = ((n & 0x8) != 0);
        localzbtz.h = ((n & 0x10) != 0);
        localzbtz.i = ((n & 0x20) != 0);
        localzbtz.j = ((n & 0x40) != 0);
        localzbtz.k = ((n & 0x80) != 0);
        localzbtz.l = ((n & 0x100) != 0);
        localzbtz.m = ((n & 0x200) != 0);
        localzbtz.n = ((n & 0x400) != 0);
        localzbtz.o = ((n & 0x800) != 0);
        localzbtz.p = ((n & 0x1000) != 0);
        localzbtz.a((this.h[14] & 0xFF & 0x1) != 0);
        break;
      case 1167: 
        this.h = this.a.a(this.e);
        if (localzbtz.c == null) {
          localzbtz.c = new ArrayList();
        }
        zf.a(localzbtz.c, Integer.valueOf(zc.a(this.h, 4)));
        break;
      case 1163: 
      case 1164: 
      case 1166: 
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
  
  private void b(PivotFormatConditionCollection paramPivotFormatConditionCollection)
  {
    this.h = this.a.a(this.e);
    int m = paramPivotFormatConditionCollection.a();
    PivotFormatCondition localPivotFormatCondition = paramPivotFormatConditionCollection.get(m);
    localPivotFormatCondition.d = zcij.L(zc.a(this.h, 0));
    localPivotFormatCondition.e = zcij.N(zc.a(this.h, 4));
    localPivotFormatCondition.c = zc.a(this.h, 8);
    zbur localzbur = new zbur();
    zf.a(localPivotFormatCondition.b, localzbur);
    b(localzbur);
  }
  
  private void b(zbur paramzbur)
  {
    zbtz localzbtz = null;
    for (;;)
    {
      this.g = this.e.a();
      switch (this.g)
      {
      case 248: 
        this.e.a(1L);
        return;
      case 247: 
        this.h = this.a.a(this.e);
        paramzbur.b = this.h[0];
        int m = zc.a(this.h, 4);
        paramzbur.b(this.h[4]);
        paramzbur.a((m & 0x100) != 0);
        paramzbur.b((m & 0x200) != 0);
        paramzbur.c((m & 0x400) != 0);
        paramzbur.d((m & 0x800) != 0);
        paramzbur.e((m & 0x1000) != 0);
        paramzbur.f((m & 0x2000) != 0);
        paramzbur.h((m & 0x4000) != 0);
        paramzbur.g((m & 0x8000) != 0);
        paramzbur.a((byte)(this.h[6] & 0xFF & 0xF));
        paramzbur.a = ((byte)(((this.h[6] & 0xFF & 0xF0) >> 4) + ((this.h[7] & 0xFF & 0xF) << 4)));
        if ((paramzbur.j()) && (this.h.length == 24))
        {
          paramzbur.f = this.h[8];
          paramzbur.g = this.h[12];
          paramzbur.h = this.h[16];
          paramzbur.i = this.h[20];
        }
        break;
      case 251: 
        this.h = this.a.a(this.e);
        localzbtz = new zbtz();
        zf.a(paramzbur.e, localzbtz);
        localzbtz.b(zc.a(this.h, 0));
        int n = zc.b(this.h, 8);
        localzbtz.q = ((n & 0x1) == 0);
        localzbtz.e = ((n & 0x2) != 0);
        localzbtz.f = ((n & 0x4) != 0);
        localzbtz.g = ((n & 0x8) != 0);
        localzbtz.h = ((n & 0x10) != 0);
        localzbtz.i = ((n & 0x20) != 0);
        localzbtz.j = ((n & 0x40) != 0);
        localzbtz.k = ((n & 0x80) != 0);
        localzbtz.l = ((n & 0x100) != 0);
        localzbtz.m = ((n & 0x200) != 0);
        localzbtz.n = ((n & 0x400) != 0);
        localzbtz.o = ((n & 0x800) != 0);
        localzbtz.p = ((n & 0x1000) != 0);
        localzbtz.a((this.h[10] & 0xFF & 0x1) != 0);
        break;
      case 382: 
        this.h = this.a.a(this.e);
        if (localzbtz.c == null) {
          localzbtz.c = new ArrayList();
        }
        zf.a(localzbtz.c, Integer.valueOf(zc.a(this.h, 0)));
        break;
      default: 
        this.i = this.e.b();
        this.e.a(this.i);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */