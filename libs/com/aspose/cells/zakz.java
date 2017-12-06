package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zakz
{
  private zqh a = null;
  private zqi b;
  private String c;
  private PivotTable d;
  private static final za e = new za(new String[] { "name", "cacheId", "gridDropZones", "itemPrintTitles", "fieldPrintTitles", "colGrandTotals", "rowGrandTotals", "subtotalHiddenItems", "pageOverThenDown", "useAutoFormatting", "preserveFormatting", "enableDrill", "showDrill", "showItems", "showMissing", "showHeaders", "missingCaption", "showError", "errorCaption", "dataCaption", "grandTotalCaption", "compact", "compactData", "outline", "outlineData", "mergeItem", "updatedVersion", "createdVersion", "indent", "rowHeaderCaption", "colHeaderCaption", "customListSort", "autoFormatId", "pageWrap", "disableFieldList", "enableWizard", "enableFieldProperties", "tag", "multipleFieldFilters", "showDataTips", "showMemberPropertyTips", "showEmptyCol", "showEmptyRow", "fieldListSortAscending", "printDrill", "editData", "ref", "firstHeaderRow", "firstDataRow", "firstDataCol", "rowPageCount", "colPageCount", "item", "fld", "hier", "cap", "baseField", "baseItem", "numFmtId", "subtotal", "showDataAs", "showRowHeaders", "showColHeaders", "showRowStripes", "showColStripes", "showLastColumn", "axis", "dataField", "subtotalTop", "defaultSubtotal", "showAll", "autoShow", "topAutoShow", "itemPageCount", "sortType", "rankBy", "multipleItemSelectionAllowed", "insertBlankRow", "insertPageBreak", "dragToRow", "dragToCol", "dragToPage", "dragToData", "dragOff", "includeNewItemsInFilter", "allDrilled", "dataSourceSort", "uri", "fieldPosition", "field", "selected", "collapsedLevelsAreSubtotals", "dataOnly", "grandCol", "grandRow", "labelOnly", "offset", "type", "avgSubtotal", "countASubtotal", "countSubtotal", "maxSubtotal", "minSubtotal", "productSubtotal", "stdDevPSubtotal", "stdDevSubtotal", "sumSubtotal", "varPSubtotal", "varSubtotal", "action", "dxfId", "evalOrder", "id", "iMeasureFld", "stringValue1", "stringValue2", "mpFld", "priority", "scope" });
  
  zakz(zqh paramzqh, zqi paramzqi, String paramString)
  {
    this.a = paramzqh;
    this.b = paramzqi;
    this.c = paramString;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.b.d.getWorkbook().i();
    this.d = new PivotTable(this.b.d.b);
    this.d.s = false;
    this.b.d.getPivotTables().a(this.d);
    y(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    if (("pivotTableDefinition".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
      e(paramzcjy);
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pivotFields".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        g(paramzcjy);
      } else if (("location".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        f(paramzcjy);
      } else if (("rowFields".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        h(paramzcjy);
      } else if (("rowItems".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        i(paramzcjy);
      } else if (("colFields".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        k(paramzcjy);
      } else if (("colItems".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        j(paramzcjy);
      } else if (("dataFields".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        n(paramzcjy);
      } else if (("pageFields".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        l(paramzcjy);
      } else if (("pivotTableStyleInfo".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        p(paramzcjy);
      } else if (("formats".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        t(paramzcjy);
      } else if (("filters".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        v(paramzcjy);
      } else if (("extLst".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        r(paramzcjy);
      } else if (("conditionalFormats".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        x(paramzcjy);
      } else if (("pivotHierarchies".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        d(paramzcjy);
      } else if (("rowHierarchiesUsage".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy);
      } else if (("colHierarchiesUsage".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        c(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.d.V = zauj.F(paramzcjy.a("count"));
    this.d.W = paramzcjy.b();
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.d.U = zauj.F(paramzcjy.a("count"));
    this.d.X = paramzcjy.b();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.d.T = zauj.F(paramzcjy.a("count"));
    this.d.S = paramzcjy.b();
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.d.D = true;
    this.d.setItemPrintTitles(false);
    this.d.setEnableFieldList(true);
    int i = 0;
    this.d.E = true;
    this.d.C = 1;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 0: 
          this.d.b.g = paramzcjy.t();
          break;
        case 1: 
          int j = zauj.F(paramzcjy.t());
          this.d.aa = j;
          break;
        case 2: 
          if ("1".equals(paramzcjy.t())) {
            this.d.t = true;
          }
          break;
        case 3: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setItemPrintTitles(true);
          }
          break;
        case 4: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setPrintTitles(true);
          }
          break;
        case 5: 
          if ("0".equals(paramzcjy.t())) {
            this.d.setRowGrand(false);
          }
          break;
        case 6: 
          if ("0".equals(paramzcjy.t())) {
            this.d.setColumnGrand(false);
          }
          break;
        case 7: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setSubtotalHiddenPageItems(true);
          }
          break;
        case 8: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setPageFieldOrder(1);
          }
          break;
        case 9: 
          i = 1;
          if ("1".equals(paramzcjy.t())) {
            this.d.setAutoFormat(true);
          }
          break;
        case 10: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setPreserveFormatting(true);
          } else {
            this.d.setPreserveFormatting(false);
          }
          break;
        case 11: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setEnableDrilldown(true);
          } else {
            this.d.setEnableDrilldown(false);
          }
          break;
        case 12: 
          if ("0".equals(paramzcjy.t())) {
            this.d.setShowDrill(false);
          }
          break;
        case 13: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setDisplayImmediateItems(true);
          } else {
            this.d.setDisplayImmediateItems(false);
          }
          break;
        case 14: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setDisplayNullString(true);
          } else {
            this.d.setDisplayNullString(false);
          }
          break;
        case 15: 
          if ("0".equals(paramzcjy.t())) {
            this.d.D = false;
          }
          break;
        case 16: 
          this.d.setNullString(paramzcjy.t());
          break;
        case 17: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setDisplayErrorString(true);
          }
          break;
        case 18: 
          this.d.setErrorString(paramzcjy.t());
          break;
        case 19: 
          this.d.b.h = paramzcjy.t();
          break;
        case 20: 
          if (this.d.e != null) {
            this.d.e.b = paramzcjy.t();
          }
          break;
        case 21: 
          if ("0".equals(paramzcjy.t())) {
            this.d.u = false;
          }
          break;
        case 22: 
          if ("0".equals(paramzcjy.t())) {
            this.d.v = false;
          }
          break;
        case 23: 
          if ("1".equals(paramzcjy.t())) {
            this.d.w = true;
          }
          break;
        case 24: 
          if ("1".equals(paramzcjy.t())) {
            this.d.x = true;
          }
          break;
        case 25: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setMergeLabels(true);
          }
          break;
        case 26: 
          this.d.y = true;
          this.d.z = zauj.F(paramzcjy.t());
          break;
        case 27: 
          this.d.A = true;
          this.d.B = zauj.F(paramzcjy.t());
          break;
        case 28: 
          this.d.C = zauj.F(paramzcjy.t());
          break;
        case 29: 
          this.d.setRowHeaderCaption(paramzcjy.t());
          break;
        case 30: 
          this.d.setColumnHeaderCaption(paramzcjy.t());
          break;
        case 31: 
          if ("0".equals(paramzcjy.t())) {
            this.d.E = false;
          }
          break;
        case 32: 
          this.d.setAutoFormatType(zauj.aa(zauj.F(paramzcjy.t())));
          break;
        case 33: 
          this.d.setPageFieldWrapCount(zauj.F(paramzcjy.t()));
          break;
        case 34: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setEnableFieldList(false);
          } else {
            this.d.setEnableFieldList(true);
          }
          break;
        case 35: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setEnableWizard(true);
          } else {
            this.d.setEnableWizard(false);
          }
          break;
        case 36: 
          if ("1".equals(paramzcjy.t())) {
            this.d.setEnableFieldDialog(true);
          } else {
            this.d.setEnableFieldDialog(false);
          }
          break;
        case 37: 
          this.d.setTag(paramzcjy.t());
          break;
        case 38: 
          this.d.setMultipleFieldFilters(zauj.aB(paramzcjy.t()));
          break;
        case 39: 
          this.d.setShowDataTips(zauj.aB(paramzcjy.t()));
          break;
        case 40: 
          this.d.setShowMemberPropertyTips(zauj.aB(paramzcjy.t()));
          break;
        case 41: 
          this.d.setShowEmptyCol(zauj.aB(paramzcjy.t()));
          break;
        case 42: 
          this.d.setShowEmptyRow(zauj.aB(paramzcjy.t()));
          break;
        case 43: 
          this.d.setFieldListSortAscending(zauj.aB(paramzcjy.t()));
          break;
        case 44: 
          this.d.N = zauj.aB(paramzcjy.t());
          break;
        case 45: 
          this.d.O = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (i == 0) {
      this.d.setAutoFormat(false);
    }
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 46: 
          CellArea localCellArea = (CellArea)CellArea.a(paramzcjy.t(), true);
          this.d.i = localCellArea.StartRow;
          this.d.k = localCellArea.StartColumn;
          this.d.j = localCellArea.EndRow;
          this.d.l = localCellArea.EndColumn;
          break;
        case 47: 
          this.d.m = (zauj.F(paramzcjy.t()) + this.d.i);
          break;
        case 48: 
          this.d.n = (zauj.F(paramzcjy.t()) + this.d.i);
          break;
        case 49: 
          this.d.o = (zauj.F(paramzcjy.t()) + this.d.k);
          break;
        case 50: 
          this.d.p = zauj.F(paramzcjy.t());
          break;
        case 51: 
          this.d.q = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pivotField".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        q(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.d.getRowFields();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("field".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        int i = zauj.F(paramzcjy.a("x"));
        if ("-2".equals(paramzcjy.a("x")))
        {
          this.d.f = new PivotField(this.d, this.d.getDataFields());
          this.d.f.t = -2;
          this.d.f.m = 1;
          localPivotFieldCollection.a(this.d.getDataField());
        }
        else
        {
          PivotField localPivotField = this.d.getBaseFields().get(i);
          localPivotField.t = i;
          localPivotFieldCollection.a(localPivotField);
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    this.d.s = true;
    ArrayList localArrayList1 = new ArrayList();
    this.d.g = localArrayList1;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("i".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        int i = 4 + this.d.getRowFields().getCount();
        int[] arrayOfInt1 = new int[i];
        for (int j = 4; j < i; j++) {
          arrayOfInt1[j] = 32767;
        }
        zf.a(localArrayList1, arrayOfInt1);
        if ((this.d.getDataField() != null) && (this.d.getDataField().m == 1)) {
          arrayOfInt1[3] |= 0x1000;
        }
        String str1 = paramzcjy.a("i");
        if (str1 != null) {
          arrayOfInt1[3] |= zauj.F(str1) << 1;
        }
        String str2 = paramzcjy.a("t");
        if (str2 != null)
        {
          arrayOfInt1[1] = zauj.aT(str2);
          if ("grand".equals(str2)) {
            arrayOfInt1[3] |= 0xA00;
          } else if ("blank".equals(str2)) {
            arrayOfInt1[3] = 8192;
          } else if ("default".equals(str2)) {
            arrayOfInt1[3] |= 0x200;
          }
          if (!"default".equals(str2)) {
            for (int k = 4; k < i; k++) {
              arrayOfInt1[k] = 0;
            }
          }
        }
        String str3 = paramzcjy.a("r");
        int m = 0;
        if (str3 != null) {
          m = zauj.F(str3);
        }
        arrayOfInt1[0] = m;
        if (m > 0)
        {
          ArrayList localArrayList2 = null;
          int[] arrayOfInt2 = null;
          localArrayList2 = this.d.g;
          int n = localArrayList2.size();
          if (n > 1) {
            arrayOfInt2 = (int[])localArrayList2.get(n - 2);
          } else {
            arrayOfInt2 = (int[])localArrayList2.get(n - 1);
          }
          for (int i1 = 0; i1 < m; i1++) {
            arrayOfInt1[(4 + i1)] = arrayOfInt2[(4 + i1)];
          }
        }
        a(paramzcjy, arrayOfInt1, m);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, int[] paramArrayOfInt, int paramInt)
    throws Exception
  {
    int i = 4;
    int j = 0;
    int k = paramArrayOfInt[0];
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("x".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        j++;
        if (paramzcjy.a("v") != null)
        {
          paramArrayOfInt[(i + k)] = zauj.F(paramzcjy.a("v"));
          i++;
        }
        else
        {
          paramArrayOfInt[(i + k)] = 0;
          i++;
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    paramArrayOfInt[2] = (j + k);
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    this.d.s = true;
    ArrayList localArrayList1 = new ArrayList();
    this.d.h = localArrayList1;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("i".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        int i = 4 + this.d.getColumnFields().getCount();
        int[] arrayOfInt1 = new int[i];
        zf.a(localArrayList1, arrayOfInt1);
        if ((this.d.getDataField() != null) && (this.d.getDataField().m == 2)) {
          arrayOfInt1[3] |= 0x1000;
        }
        String str1 = paramzcjy.a("i");
        if (str1 != null) {
          arrayOfInt1[3] = (zauj.F(str1) << 1 | arrayOfInt1[3]);
        }
        String str2 = paramzcjy.a("t");
        if (str2 != null)
        {
          arrayOfInt1[1] = zauj.aT(str2);
          if ("grand".equals(str2))
          {
            arrayOfInt1[3] |= 0xA00;
            if (this.d.getBaseFields().b() > 1) {
              arrayOfInt1[3] |= 0x1;
            }
          }
          else if ("blank".equals(str2))
          {
            arrayOfInt1[3] = 8192;
          }
          else if ("default".equals(str2))
          {
            arrayOfInt1[3] |= 0x200;
          }
          if (!"default".equals(str2)) {
            for (int j = 4; j < i; j++) {
              arrayOfInt1[j] = 0;
            }
          }
        }
        String str3 = paramzcjy.a("r");
        int k = 0;
        if (str3 != null) {
          k = zauj.F(str3);
        }
        arrayOfInt1[0] = k;
        if (k > 0)
        {
          ArrayList localArrayList2 = null;
          int[] arrayOfInt2 = null;
          localArrayList2 = this.d.h;
          int m = localArrayList2.size();
          if (m > 1) {
            arrayOfInt2 = (int[])localArrayList2.get(m - 2);
          } else {
            arrayOfInt2 = (int[])localArrayList2.get(m - 1);
          }
          for (int n = 0; n < k; n++) {
            arrayOfInt1[(4 + n)] = arrayOfInt2[(4 + n)];
          }
        }
        a(paramzcjy, arrayOfInt1, k);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.d.getColumnFields();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("field".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        int i = zauj.F(paramzcjy.a("x"));
        if ("-2".equals(paramzcjy.a("x")))
        {
          this.d.f = new PivotField(this.d, this.d.getDataFields());
          this.d.f.t = -2;
          this.d.f.m = 2;
          localPivotFieldCollection.a(this.d.getDataField());
        }
        else
        {
          PivotField localPivotField = this.d.getBaseFields().get(i);
          localPivotField.t = i;
          localPivotFieldCollection.a(localPivotField);
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void l(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pageField".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        m(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void m(zcjy paramzcjy)
    throws Exception
  {
    PivotField localPivotField = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 52: 
          int i = zauj.F(paramzcjy.t());
          localPivotField.j.b = ((short)i);
          localPivotField.j.c = localPivotField.e.get(i).getIndex();
          break;
        case 53: 
          int j = zauj.F(paramzcjy.t());
          localPivotField = this.d.getBaseFields().get(j);
          this.d.getPageFields().a(localPivotField);
          localPivotField.i = new zbtq();
          localPivotField.j = new zbuo(localPivotField);
          localPivotField.t = j;
          break;
        case 54: 
          localPivotField.j.d = zauj.F(paramzcjy.t());
          break;
        case 0: 
          localPivotField.j.e = paramzcjy.t();
          break;
        case 55: 
          localPivotField.j.f = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void n(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("dataField".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        o(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void o(zcjy paramzcjy)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.d.getDataFields();
    PivotField localPivotField = null;
    String str = null;
    zbtq localzbtq = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 0: 
          str = paramzcjy.t();
          break;
        case 53: 
          int i = zauj.F(paramzcjy.t());
          if (i < this.d.getBaseFields().getCount())
          {
            localPivotField = new PivotField();
            localPivotField.b = localPivotFieldCollection;
            localPivotField.k = this.d.getBaseFields().get(i);
            localPivotField.a(localPivotFieldCollection.getCount());
            localPivotFieldCollection.a(localPivotField);
            localPivotField.a(true);
            localPivotField.i = new zbtq();
            localzbtq = localPivotField.i;
            if (str != null) {
              localzbtq.g = str;
            }
            localzbtq.h = localPivotField;
            localzbtq.h.b(zauj.F(paramzcjy.t()));
          }
          break;
        case 56: 
          if (localzbtq != null) {
            localzbtq.c = zauj.F(paramzcjy.t());
          }
          break;
        case 57: 
          if (localzbtq != null) {
            try
            {
              localzbtq.d = zauj.F(paramzcjy.t());
            }
            catch (Exception localException)
            {
              localzbtq.d = 0;
            }
          }
          break;
        case 58: 
          if (localzbtq != null)
          {
            localzbtq.e = zauj.H(paramzcjy.t());
            localzbtq.f = this.a.a.getWorksheets().g(localzbtq.e);
          }
          break;
        case 59: 
          if (localzbtq != null) {
            localzbtq.a = zauj.ai(paramzcjy.t());
          }
          break;
        case 60: 
          if (localzbtq != null) {
            localzbtq.b = zauj.aj(paramzcjy.t());
          }
          break;
        }
      }
      paramzcjy.l();
    }
    if (this.d.getDataField() != null)
    {
      PivotItem localPivotItem = new PivotItem(this.d.f.e);
      this.d.f.e.a(localPivotItem);
      localPivotItem.setIndex(this.d.getDataFields().getCount() - 1);
      localPivotItem.e = localPivotField;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("extLst".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localPivotField);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void p(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 0: 
          this.d.setPivotTableStyleName(paramzcjy.t());
          break;
        case 61: 
          this.d.setShowPivotStyleRowHeader(zauj.aB(paramzcjy.t()));
          break;
        case 62: 
          this.d.setShowPivotStyleColumnHeader(zauj.aB(paramzcjy.t()));
          break;
        case 63: 
          this.d.setShowPivotStyleRowStripes(zauj.aB(paramzcjy.t()));
          break;
        case 64: 
          this.d.setShowPivotStyleColumnStripes(zauj.aB(paramzcjy.t()));
          break;
        case 65: 
          this.d.setShowPivotStyleLastColumn(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void q(zcjy paramzcjy)
    throws Exception
  {
    PivotField localPivotField = new PivotField(this.d.getBaseFields());
    localPivotField.a(this.d.getBaseFields().getCount());
    localPivotField.l = this.d;
    localPivotField.setShowInOutlineForm(true);
    localPivotField.setShowCompact(true);
    localPivotField.setShowSubtotalAtTop(true);
    localPivotField.setShowAllItems(true);
    this.d.getBaseFields().a(localPivotField);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 66: 
          if ("axisRow".equals(paramzcjy.t())) {
            localPivotField.m = 1;
          } else if ("axisCol".equals(paramzcjy.t())) {
            localPivotField.m = 2;
          } else if ("axisPage".equals(paramzcjy.t())) {
            localPivotField.m = 4;
          }
          break;
        case 67: 
          if ("1".equals(paramzcjy.t())) {
            localPivotField.u = true;
          }
          break;
        case 23: 
          if ("1".equals(paramzcjy.t())) {
            localPivotField.setShowInOutlineForm(true);
          } else {
            localPivotField.setShowInOutlineForm(false);
          }
          break;
        case 21: 
          if ("1".equals(paramzcjy.t())) {
            localPivotField.setShowCompact(true);
          } else {
            localPivotField.setShowCompact(false);
          }
          break;
        case 68: 
          if ("1".equals(paramzcjy.t())) {
            localPivotField.setShowSubtotalAtTop(true);
          } else {
            localPivotField.setShowSubtotalAtTop(false);
          }
          break;
        case 69: 
          if (("0".equals(paramzcjy.t())) && ((!localPivotField.h()) || (localPivotField.m != 8))) {
            localPivotField.setSubtotals(0, true);
          }
          break;
        case 70: 
          if ("1".equals(paramzcjy.t())) {
            localPivotField.setShowAllItems(true);
          } else {
            localPivotField.setShowAllItems(false);
          }
          break;
        case 71: 
          if ("1".equals(paramzcjy.t())) {
            localPivotField.setAutoShow(true);
          } else {
            localPivotField.setAutoShow(false);
          }
          break;
        case 72: 
          if ("1".equals(paramzcjy.t())) {
            localPivotField.setAscendShow(true);
          } else {
            localPivotField.setAscendShow(false);
          }
          break;
        case 73: 
          localPivotField.setAutoShowCount((byte)zauj.F(paramzcjy.t()));
          break;
        case 74: 
          localPivotField.setAutoSort(true);
          if ("ascending".equals(paramzcjy.t())) {
            localPivotField.setAscendSort(true);
          } else {
            localPivotField.setAscendSort(false);
          }
          break;
        case 75: 
          localPivotField.setAutoShowField(zauj.F(paramzcjy.t()));
          break;
        case 76: 
          localPivotField.n = zauj.aB(paramzcjy.t());
          break;
        case 58: 
          localPivotField.d.d = zauj.H(paramzcjy.t());
          localPivotField.d.e = this.a.a.getWorksheets().g(localPivotField.d.d);
          break;
        case 77: 
          localPivotField.setInsertBlankRow(zauj.aB(paramzcjy.t()));
          break;
        case 78: 
          localPivotField.setInsertPageBreaksBetweenItems(zauj.aB(paramzcjy.t()));
          break;
        case 0: 
          localPivotField.setDisplayName(paramzcjy.t());
          break;
        case 79: 
          localPivotField.setDragToRow(zauj.aB(paramzcjy.t()));
          break;
        case 80: 
          localPivotField.setDragToColumn(zauj.aB(paramzcjy.t()));
          break;
        case 81: 
          localPivotField.setDragToPage(zauj.aB(paramzcjy.t()));
          break;
        case 82: 
          localPivotField.setDragToData(zauj.aB(paramzcjy.t()));
          break;
        case 83: 
          localPivotField.setDragToHide(zauj.aB(paramzcjy.t()));
          break;
        case 84: 
          localPivotField.setIncludeNewItemsInFilter(zauj.aB(paramzcjy.t()));
          break;
        case 85: 
          localPivotField.o = zauj.aB(paramzcjy.t());
          break;
        case 86: 
          localPivotField.p = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("items".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        e(paramzcjy, localPivotField);
      } else if (("autoSortScope".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        c(paramzcjy, localPivotField);
      } else if (("extLst".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localPivotField);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void r(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("ext".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        s(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void s(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 87: 
          this.d.R = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("pivotTableDefinition".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        String str = paramzcjy.a("hideValuesRow");
        if ((str != null) && (str.equals("1"))) {
          this.d.J = true;
        }
        str = paramzcjy.a("enableEdit");
        if ((str != null) && (str.equals("1"))) {
          this.d.setEnableDataValueEditing(true);
        }
        this.d.P = paramzcjy.a("altText");
        this.d.Q = paramzcjy.a("altTextSummary");
        if (paramzcjy.o())
        {
          paramzcjy.a();
        }
        else
        {
          paramzcjy.d();
          while (paramzcjy.s() != 4)
          {
            paramzcjy.k();
            if (paramzcjy.s() != 1) {
              paramzcjy.a();
            } else if (("conditionalFormats".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
              x(paramzcjy);
            } else {
              paramzcjy.a();
            }
          }
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, PivotField paramPivotField)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("ext".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy, paramPivotField);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, PivotField paramPivotField)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 87: 
          paramPivotField.s = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str;
        if (("pivotField".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          str = paramzcjy.a("fillDownLabels");
          if ((str != null) && (str.equals("1"))) {
            paramPivotField.setRepeatItemLabels(true);
          }
          paramzcjy.a();
        }
        else if (("dataField".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          str = paramzcjy.a("pivotShowAs");
          if (str != null) {
            paramPivotField.i.b = zauj.aj(str);
          }
          if (zauj.b(paramzcjy.a("isCountDistinct"), false)) {
            paramPivotField.i.a = 11;
          }
          paramzcjy.a();
        }
        else if (("pivotTableDefinition".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          str = paramzcjy.a("hideValuesRow");
          if (str.equals("1")) {
            this.d.J = true;
          }
          str = paramzcjy.a("enableEdit");
          if (str.equals("1")) {
            this.d.O = true;
          } else {
            this.d.O = false;
          }
          paramzcjy.a();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy, PivotField paramPivotField)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("pivotArea".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        d(paramzcjy, paramPivotField);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void d(zcjy paramzcjy, PivotField paramPivotField)
    throws Exception
  {
    zbur localzbur = new zbur();
    paramPivotField.f = localzbur;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 23: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.f(true);
          } else {
            localzbur.f(false);
          }
          break;
        case 88: 
          localzbur.a = ((byte)zauj.H(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("references".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localzbur, paramPivotField);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zbur paramzbur, PivotField paramPivotField)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("reference".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy, paramzbur, paramPivotField);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, zbur paramzbur, PivotField paramPivotField)
    throws Exception
  {
    zbtz localzbtz = new zbtz();
    zf.a(paramzbur.e, localzbtz);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 89: 
          localzbtz.b((int)(zauj.G(paramzcjy.t()) & 0xFFFFFFFF));
          if ((localzbtz.b() & 0xFFFF) == 65534) {
            localzbtz.a((byte)8);
          }
          break;
        case 90: 
          if ("0".equals(paramzcjy.t())) {
            localzbtz.a(false);
          }
          break;
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("x".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        String str = paramzcjy.a("v");
        int i = zauj.F(str);
        if (localzbtz.c == null) {
          localzbtz.c = new ArrayList();
        }
        zf.a(localzbtz.c, Integer.valueOf(i));
        paramPivotField.setAutoSortField(i);
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, PivotFormatCondition paramPivotFormatCondition)
    throws Exception
  {
    zbur localzbur = new zbur();
    zf.a(paramPivotFormatCondition.b, localzbur);
    localzbur.f(true);
    localzbur.a(true);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 23: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.f(true);
          } else {
            localzbur.f(false);
          }
          break;
        case 88: 
          localzbur.a = ((byte)zauj.H(paramzcjy.t()));
          break;
        case 66: 
          if ("axisCol".equals(paramzcjy.t())) {
            localzbur.a((byte)2);
          } else if ("axisPage".equals(paramzcjy.t())) {
            localzbur.a((byte)4);
          } else if ("axisRow".equals(paramzcjy.t())) {
            localzbur.a((byte)1);
          } else if ("axisValues".equals(paramzcjy.t())) {
            localzbur.a((byte)8);
          }
          break;
        case 91: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.j = true;
          } else {
            localzbur.j = false;
          }
          break;
        case 92: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.a(true);
          } else {
            localzbur.a(false);
          }
          break;
        case 89: 
          localzbur.b = ((byte)zauj.H(paramzcjy.t()));
          break;
        case 93: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.d(true);
          } else {
            localzbur.d(false);
          }
          break;
        case 94: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.c(true);
          } else {
            localzbur.c(false);
          }
          break;
        case 95: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.b(true);
          } else {
            localzbur.b(false);
          }
          break;
        case 96: 
          CellArea localCellArea = (CellArea)CellArea.a(paramzcjy.t(), true);
          localzbur.f = ((byte)localCellArea.StartRow);
          localzbur.g = ((byte)localCellArea.EndRow);
          localzbur.h = ((byte)localCellArea.StartColumn);
          localzbur.i = ((byte)localCellArea.EndColumn);
          localzbur.h(true);
          break;
        case 97: 
          if ("topRight".equals(paramzcjy.t())) {
            localzbur.b((byte)6);
          } else if ("button".equals(paramzcjy.t())) {
            localzbur.b((byte)5);
          } else if ("origin".equals(paramzcjy.t())) {
            localzbur.b((byte)4);
          } else if ("all".equals(paramzcjy.t())) {
            localzbur.b((byte)3);
          } else if ("data".equals(paramzcjy.t())) {
            localzbur.b((byte)2);
          } else if ("normal".equals(paramzcjy.t())) {
            localzbur.b((byte)1);
          } else if ("none".equals(paramzcjy.t())) {
            localzbur.b((byte)0);
          }
          break;
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("references".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localzbur);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zbur paramzbur)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("reference".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy, paramzbur);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zbub paramzbub)
    throws Exception
  {
    zbur localzbur = new zbur();
    paramzbub.c = localzbur;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 23: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.f(true);
          } else {
            localzbur.f(false);
          }
          break;
        case 88: 
          localzbur.a = ((byte)zauj.H(paramzcjy.t()));
          break;
        case 66: 
          if ("axisCol".equals(paramzcjy.t())) {
            localzbur.a((byte)2);
          } else if ("axisPage".equals(paramzcjy.t())) {
            localzbur.a((byte)4);
          } else if ("axisRow".equals(paramzcjy.t())) {
            localzbur.a((byte)1);
          } else if ("axisValues".equals(paramzcjy.t())) {
            localzbur.a((byte)8);
          }
          break;
        case 91: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.j = true;
          } else {
            localzbur.j = false;
          }
          break;
        case 92: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.a(true);
          } else {
            localzbur.a(false);
          }
          break;
        case 89: 
          localzbur.b = ((byte)zauj.H(paramzcjy.t()));
          break;
        case 93: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.d(true);
          } else {
            localzbur.d(false);
          }
          break;
        case 94: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.c(true);
          } else {
            localzbur.c(false);
          }
          break;
        case 95: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.b(true);
          } else {
            localzbur.b(false);
          }
          break;
        case 96: 
          if (!zaxj.e(paramzcjy.t()))
          {
            CellArea localCellArea = (CellArea)CellArea.a(paramzcjy.t(), true);
            localzbur.f = ((byte)localCellArea.StartRow);
            localzbur.g = ((byte)localCellArea.EndRow);
            localzbur.h = ((byte)localCellArea.StartColumn);
            localzbur.i = ((byte)localCellArea.EndColumn);
            localzbur.h(true);
          }
          break;
        case 97: 
          if ("topRight".equals(paramzcjy.t())) {
            localzbur.b((byte)6);
          } else if ("button".equals(paramzcjy.t())) {
            localzbur.b((byte)5);
          } else if ("origin".equals(paramzcjy.t())) {
            localzbur.b((byte)4);
          } else if ("all".equals(paramzcjy.t())) {
            localzbur.b((byte)3);
          }
          break;
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("references".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localzbur);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, zbur paramzbur)
    throws Exception
  {
    zbtz localzbtz = new zbtz();
    zf.a(paramzbur.e, localzbtz);
    localzbtz.a(1);
    Object localObject;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 89: 
          localzbtz.b((int)(zauj.G(paramzcjy.t()) & 0xFFFFFFFF));
          if ((localzbtz.b() & 0xFFFF) == 65534)
          {
            localzbtz.a((byte)8);
          }
          else
          {
            localObject = this.d.getBaseFields().get(localzbtz.b() & 0xFFFF);
            if (((PivotField)localObject).m == 1) {
              localzbtz.a((byte)1);
            } else if (((PivotField)localObject).m == 2) {
              localzbtz.a((byte)2);
            } else if (((PivotField)localObject).m == 4) {
              localzbtz.a((byte)4);
            }
          }
          break;
        case 98: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.h = true;
          }
          break;
        case 99: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.g = true;
          }
          break;
        case 100: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.l = true;
          }
          break;
        case 69: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.e = true;
          }
          break;
        case 101: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.i = true;
          }
          break;
        case 102: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.j = true;
          }
          break;
        case 103: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.k = true;
          }
          break;
        case 104: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.n = true;
          }
          break;
        case 105: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.m = true;
          }
          break;
        case 106: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.f = true;
          }
          break;
        case 107: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.p = true;
          }
          break;
        case 108: 
          if ("1".equals(paramzcjy.t())) {
            localzbtz.o = true;
          }
          break;
        case 90: 
          if ("0".equals(paramzcjy.t())) {
            localzbtz.a(false);
          }
          break;
        }
      }
      paramzcjy.l();
    }
    if ((localzbtz.a() & 0xFFFF) == 0) {
      localzbtz.a(1);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("x".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        localObject = paramzcjy.a("v");
        if (localzbtz.c == null) {
          localzbtz.c = new ArrayList();
        }
        zf.a(localzbtz.c, Integer.valueOf(zauj.F((String)localObject)));
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void e(zcjy paramzcjy, PivotField paramPivotField)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.d.s = true;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("item".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        if (paramzcjy.a("t") == null)
        {
          f(paramzcjy, paramPivotField);
        }
        else
        {
          if (!"default".equals(paramzcjy.a("t"))) {
            paramPivotField.setSubtotals(zauj.ah(paramzcjy.a("t")), true);
          }
          paramzcjy.a();
        }
      }
      else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void f(zcjy paramzcjy, PivotField paramPivotField)
    throws Exception
  {
    PivotItem localPivotItem = new PivotItem(paramPivotField.getPivotItems());
    paramPivotField.getPivotItems().a(localPivotItem);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("x".equals(paramzcjy.q())) {
          localPivotItem.setIndex(zauj.F(paramzcjy.t()));
        } else if ("n".equals(paramzcjy.q())) {
          localPivotItem.d = paramzcjy.t();
        } else if ("h".equals(paramzcjy.q()))
        {
          if ("1".equals(paramzcjy.t())) {
            localPivotItem.setHidden(true);
          } else {
            localPivotItem.setHidden(false);
          }
        }
        else if ("sd".equals(paramzcjy.q()))
        {
          if ("1".equals(paramzcjy.t())) {
            localPivotItem.a(false);
          } else {
            localPivotItem.a(true);
          }
        }
        else if ("m".equals(paramzcjy.q()))
        {
          if ("1".equals(paramzcjy.t())) {
            localPivotItem.c(true);
          } else {
            localPivotItem.c(false);
          }
        }
        else if ("f".equals(paramzcjy.q()))
        {
          if ("1".equals(paramzcjy.t())) {
            localPivotItem.b(true);
          } else {
            localPivotItem.b(false);
          }
        }
        else if ("t".equals(paramzcjy.q()))
        {
          if (!"default".equals(paramzcjy.t())) {
            paramPivotField.setSubtotals(zauj.ah(paramzcjy.t()), true);
          }
        }
        else if ("c".equals(paramzcjy.q())) {
          localPivotItem.f = zauj.aB(paramzcjy.t());
        } else if ("d".equals(paramzcjy.q())) {
          localPivotItem.g = zauj.aB(paramzcjy.t());
        } else if ("s".equals(paramzcjy.q())) {
          localPivotItem.h = zauj.aB(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void t(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("format".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        u(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void u(zcjy paramzcjy)
    throws Exception
  {
    zbub localzbub = new zbub(this.d.ag);
    this.d.ag.a(localzbub);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 109: 
          if ("blank".equals(paramzcjy.t())) {
            localzbub.a = 0;
          }
          break;
        case 110: 
          localzbub.b = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pivotArea".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localzbub);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void v(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("filter".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        w(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void w(zcjy paramzcjy)
    throws Exception
  {
    PivotFilter localPivotFilter = new PivotFilter(this.b.d);
    this.d.ai.a(localPivotFilter);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 53: 
          localPivotFilter.a = zauj.F(paramzcjy.t());
          break;
        case 111: 
          localPivotFilter.e = zauj.F(paramzcjy.t());
          break;
        case 112: 
          localPivotFilter.c = zauj.F(paramzcjy.t());
          break;
        case 113: 
          localPivotFilter.d = zauj.F(paramzcjy.t());
          break;
        case 97: 
          localPivotFilter.b = zaxj.c(paramzcjy.t());
          break;
        case 114: 
          localPivotFilter.g = paramzcjy.t();
          break;
        case 115: 
          localPivotFilter.h = paramzcjy.t();
          break;
        case 0: 
          localPivotFilter.j = paramzcjy.t();
          break;
        case 116: 
          localPivotFilter.i = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("autoFilter".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        zalu.a(paramzcjy, localPivotFilter.f);
        for (int i = 0; i < localPivotFilter.f.getFilterColumns().getCount(); i++)
        {
          FilterColumn localFilterColumn = localPivotFilter.f.getFilterColumns().get(i);
          if (localFilterColumn.getFilterType() == 5)
          {
            PivotField localPivotField = this.d.getBaseFields().get(localPivotFilter.a);
            localPivotField.g = ((Top10Filter)localFilterColumn.getFilter()).getItems();
          }
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void x(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    PivotFormatConditionCollection localPivotFormatConditionCollection = this.d.getPivotFormatConditions();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("conditionalFormat".equals(paramzcjy.q())) {
        a(paramzcjy, localPivotFormatConditionCollection);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, PivotFormatConditionCollection paramPivotFormatConditionCollection)
    throws Exception
  {
    int i = paramPivotFormatConditionCollection.a();
    PivotFormatCondition localPivotFormatCondition = paramPivotFormatConditionCollection.get(i);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (e.a(paramzcjy.q()))
        {
        case 117: 
          localPivotFormatCondition.c = zauj.F(paramzcjy.t());
          break;
        case 118: 
          localPivotFormatCondition.d = zaxj.a(paramzcjy.t());
          break;
        case 97: 
          localPivotFormatCondition.e = zaxj.b(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pivotAreas".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy, localPivotFormatCondition);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, PivotFormatCondition paramPivotFormatCondition)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pivotArea".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, paramPivotFormatCondition);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void y(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"pivotTableDefinition".equals(paramzcjy.q()))) {
      throw new IllegalStateException("pivotTableDefinition root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */