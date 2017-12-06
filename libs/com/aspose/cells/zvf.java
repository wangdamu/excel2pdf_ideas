package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zvf
  extends ztp
{
  private PivotTable b;
  private String c;
  
  zvf(PivotTable paramPivotTable, String paramString)
  {
    this.b = paramPivotTable;
    this.c = paramString;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.b.a.a.getWorkbook().i();
    paramzcjz.b(true);
    paramzcjz.b("pivotTableDefinition");
    paramzcjz.a("xmlns", zaty.a);
    t(paramzcjz);
    r(paramzcjz);
    p(paramzcjz);
    g(paramzcjz);
    i(paramzcjz);
    h(paramzcjz);
    j(paramzcjz);
    f(paramzcjz);
    e(paramzcjz);
    n(paramzcjz);
    d(paramzcjz);
    m(paramzcjz);
    o(paramzcjz);
    k(paramzcjz);
    b(paramzcjz);
    c(paramzcjz);
    q(paramzcjz);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    int i = this.b.V;
    if (i == 0) {
      return;
    }
    paramzcjz.b("rowHierarchiesUsage");
    paramzcjz.a("count", zauj.z(i));
    paramzcjz.d(this.b.W);
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    int i = this.b.U;
    if (i == 0) {
      return;
    }
    paramzcjz.b("colHierarchiesUsage");
    paramzcjz.a("count", zauj.z(i));
    paramzcjz.d(this.b.X);
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    int i = this.b.T;
    if (i == 0) {
      return;
    }
    paramzcjz.b("pivotHierarchies");
    paramzcjz.a("count", zauj.z(i));
    paramzcjz.d(this.b.S);
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.b.getDataFields();
    int i = localPivotFieldCollection.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("dataFields");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      PivotField localPivotField = localPivotFieldCollection.get(j);
      zbtq localzbtq = localPivotField.i;
      paramzcjz.b("dataField");
      if (localzbtq.b() != null) {
        paramzcjz.a("name", localzbtq.b());
      }
      paramzcjz.a("fld", zauj.z(localzbtq.h.getBaseIndex()));
      if (localzbtq.a != 0) {
        paramzcjz.a("subtotal", zauj.ad(localzbtq.a));
      }
      if ((localzbtq.b != 0) && (localzbtq.b != 10) && (localzbtq.b != 9) && (localzbtq.b != 11) && (localzbtq.b != 14) && (localzbtq.b != 13) && (localzbtq.b != 12)) {
        paramzcjz.a("showDataAs", zauj.ae(localzbtq.b));
      }
      paramzcjz.a("baseField", zauj.z(localzbtq.c));
      if (localPivotField.getBaseItemPosition() == 0) {
        paramzcjz.a("baseItem", zauj.z(1048828));
      } else if (localPivotField.getBaseItemPosition() == 1) {
        paramzcjz.a("baseItem", zauj.z(1048829));
      } else {
        paramzcjz.a("baseItem", zauj.z(localzbtq.d));
      }
      if (localzbtq.e > 0) {
        paramzcjz.a("numFmtId", zauj.a(localzbtq.e));
      }
      d(paramzcjz, localPivotField);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.b.getPageFields();
    int i = localPivotFieldCollection.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("pageFields");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      PivotField localPivotField = localPivotFieldCollection.get(j);
      paramzcjz.b("pageField");
      paramzcjz.a("fld", zauj.z(localPivotField.t));
      if ((localPivotField.j.b != 32765) && (!localPivotField.isMultipleItemSelectionAllowed())) {
        paramzcjz.a("item", zauj.a(localPivotField.j.b));
      }
      paramzcjz.a("hier", zauj.z(localPivotField.j.d));
      if (localPivotField.j.e != null) {
        paramzcjz.a("name", localPivotField.j.e);
      }
      if (localPivotField.j.f != null) {
        paramzcjz.a("cap", localPivotField.j.f);
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.b.getRowFields();
    int i = localPivotFieldCollection.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("rowFields");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      PivotField localPivotField = localPivotFieldCollection.get(j);
      paramzcjz.b("field");
      paramzcjz.a("x", zauj.a((short)localPivotField.t));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.b.getColumnFields();
    int i = localPivotFieldCollection.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("colFields");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      PivotField localPivotField = localPivotFieldCollection.get(j);
      paramzcjz.b("field");
      paramzcjz.a("x", zauj.a((short)localPivotField.t));
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void i(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.b.g;
    if (localArrayList == null) {
      return;
    }
    int i = localArrayList.size();
    if (i == 0)
    {
      if (this.b.getRowFields().getCount() == 0)
      {
        paramzcjz.b("rowItems");
        paramzcjz.a("count", zauj.z(1));
        paramzcjz.b("i");
        paramzcjz.b();
        paramzcjz.b();
      }
      return;
    }
    paramzcjz.b("rowItems");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      int[] arrayOfInt = (int[])localArrayList.get(j);
      a(paramzcjz, arrayOfInt);
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, int[] paramArrayOfInt)
    throws Exception
  {
    paramzcjz.b("i");
    if (paramArrayOfInt[1] != 0) {
      paramzcjz.a("t", zauj.aM(paramArrayOfInt[1]));
    }
    int i = (paramArrayOfInt[3] & 0x1FE) >> 1;
    if (i != 0) {
      paramzcjz.a("i", zauj.z(i));
    }
    if (paramArrayOfInt[0] != 0) {
      paramzcjz.a("r", zauj.z(paramArrayOfInt[0]));
    }
    if (paramArrayOfInt[2] > 0) {
      for (int j = paramArrayOfInt[0]; j < paramArrayOfInt[2]; j++)
      {
        paramzcjz.b("x");
        if (paramArrayOfInt[(4 + j)] != 0) {
          paramzcjz.a("v", zauj.z(paramArrayOfInt[(4 + j)]));
        }
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void j(zcjz paramzcjz)
    throws Exception
  {
    ArrayList localArrayList = this.b.h;
    if (localArrayList == null) {
      return;
    }
    int i = localArrayList.size();
    if (i == 0)
    {
      if (this.b.getColumnFields().getCount() == 0)
      {
        paramzcjz.b("colItems");
        paramzcjz.a("count", zauj.z(1));
        paramzcjz.b("i");
        paramzcjz.b();
        paramzcjz.b();
      }
      return;
    }
    paramzcjz.b("colItems");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      int[] arrayOfInt = (int[])localArrayList.get(j);
      a(paramzcjz, arrayOfInt);
    }
    paramzcjz.b();
  }
  
  private void k(zcjz paramzcjz)
    throws Exception
  {
    PivotFilterCollection localPivotFilterCollection = this.b.ai;
    if (localPivotFilterCollection == null) {
      return;
    }
    int i = localPivotFilterCollection.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("filters");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      PivotFilter localPivotFilter = localPivotFilterCollection.get(j);
      paramzcjz.b("filter");
      paramzcjz.a("fld", zauj.z(localPivotFilter.a));
      paramzcjz.a("type", zaxj.f(localPivotFilter.b));
      paramzcjz.a("evalOrder", zauj.z(localPivotFilter.e));
      paramzcjz.a("id", zauj.z(localPivotFilter.c));
      paramzcjz.a("iMeasureFld", zauj.z(localPivotFilter.d));
      if (localPivotFilter.j != null) {
        paramzcjz.a("name", localPivotFilter.j);
      }
      if (localPivotFilter.getValue1() != null) {
        paramzcjz.a("stringValue1", localPivotFilter.getValue1());
      }
      if (localPivotFilter.getValue2() != null) {
        paramzcjz.a("stringValue2", localPivotFilter.getValue2());
      }
      if (localPivotFilter.i != -1) {
        paramzcjz.a("mpFld", zauj.z(localPivotFilter.i));
      }
      zvy.a(paramzcjz, localPivotFilter.f, true);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, zbur paramzbur)
    throws Exception
  {
    paramzcjz.b("pivotArea");
    if (paramzbur.h()) {
      paramzcjz.a("outline", "1");
    } else {
      paramzcjz.a("outline", "0");
    }
    paramzcjz.a("fieldPosition", zauj.a(paramzbur.a));
    if (paramzbur.f() == 2) {
      paramzcjz.a("axis", "axisCol");
    } else if (paramzbur.f() == 4) {
      paramzcjz.a("axis", "axisPage");
    } else if (paramzbur.f() == 1) {
      paramzcjz.a("axis", "axisRow");
    } else if (paramzbur.f() == 8) {
      paramzcjz.a("axis", "axisValues");
    }
    if (paramzbur.j) {
      paramzcjz.a("collapsedLevelsAreSubtotals", "1");
    }
    if (!paramzbur.a()) {
      paramzcjz.a("dataOnly", "0");
    }
    if ((paramzbur.b & 0xFF) != 255) {
      if ((paramzbur.b & 0xFF) == 254) {
        paramzcjz.a("field", "-2");
      } else {
        paramzcjz.a("field", zauj.a(paramzbur.b));
      }
    }
    if (paramzbur.d()) {
      paramzcjz.a("grandCol", "1");
    }
    if (paramzbur.c()) {
      paramzcjz.a("grandRow", "1");
    }
    if (paramzbur.b()) {
      paramzcjz.a("labelOnly", "1");
    }
    if (paramzbur.j())
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = (paramzbur.f & 0xFF);
      localCellArea.EndRow = (paramzbur.g & 0xFF);
      localCellArea.StartColumn = (paramzbur.h & 0xFF);
      localCellArea.EndColumn = (paramzbur.i & 0xFF);
      paramzcjz.a("offset", zauj.a(localCellArea));
    }
    switch (paramzbur.g())
    {
    case 6: 
      paramzcjz.a("type", "topRight");
      break;
    case 5: 
      paramzcjz.a("type", "button");
      break;
    case 4: 
      paramzcjz.a("type", "origin");
      break;
    case 3: 
      paramzcjz.a("type", "all");
      break;
    case 2: 
      paramzcjz.a("type", "data");
      break;
    case 1: 
      paramzcjz.a("type", "normal");
      break;
    case 0: 
      paramzcjz.a("type", "none");
    }
    if (paramzbur.e.size() > 0)
    {
      int i = paramzbur.e.size();
      paramzcjz.b("references");
      paramzcjz.a("count", zauj.z(i));
      for (int j = 0; j < paramzbur.e.size(); j++)
      {
        zbtz localzbtz = (zbtz)paramzbur.e.get(j);
        paramzcjz.b("reference");
        paramzcjz.a("field", zauj.a((short)(localzbtz.b() & 0xFFFF) & 0xFFFFFFFF & 0xFFFFFFFF));
        if (localzbtz.h) {
          paramzcjz.a("avgSubtotal", "1");
        }
        if (localzbtz.g) {
          paramzcjz.a("countASubtotal", "1");
        }
        if (localzbtz.l) {
          paramzcjz.a("countSubtotal", "1");
        }
        if (localzbtz.e) {
          paramzcjz.a("defaultSubtotal", "1");
        }
        if (localzbtz.i) {
          paramzcjz.a("maxSubtotal", "1");
        }
        if (localzbtz.j) {
          paramzcjz.a("minSubtotal", "1");
        }
        if (localzbtz.k) {
          paramzcjz.a("productSubtotal", "1");
        }
        if (localzbtz.n) {
          paramzcjz.a("stdDevPSubtotal", "1");
        }
        if (localzbtz.m) {
          paramzcjz.a("stdDevSubtotal", "1");
        }
        if (localzbtz.f) {
          paramzcjz.a("sumSubtotal", "1");
        }
        if (localzbtz.p) {
          paramzcjz.a("varPSubtotal", "1");
        }
        if (localzbtz.o) {
          paramzcjz.a("varSubtotal", "1");
        }
        if (!localzbtz.c()) {
          paramzcjz.a("selected", "0");
        }
        int k = localzbtz.c.size();
        paramzcjz.a("count", zauj.z(k));
        for (int m = 0; m < k; m++)
        {
          paramzcjz.b("x");
          paramzcjz.a("v", zauj.z(((Integer)localzbtz.c.get(m)).intValue()));
          paramzcjz.b();
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private int d()
  {
    int i = 1;
    Worksheet localWorksheet1 = this.b.a.a;
    Worksheet localWorksheet2 = localWorksheet1;
    if (localWorksheet2 != null)
    {
      Object localObject;
      int k;
      for (int j = 0; j < this.b.a.a.getConditionalFormattings().getCount(); j++)
      {
        localObject = localWorksheet2.getConditionalFormattings().get(j);
        for (k = 0; k < ((FormatConditionCollection)localObject).getCount(); k++) {
          i++;
        }
      }
      if (localWorksheet2.b != null)
      {
        for (j = 0; j < localWorksheet2.b.getCount(); j++)
        {
          localObject = localWorksheet2.b.get(j);
          if (((PivotTable)localObject).aj != null) {
            for (k = 0; k < ((PivotTable)localObject).aj.getCount(); k++) {
              i++;
            }
          }
        }
        i--;
      }
    }
    return i;
  }
  
  private void l(zcjz paramzcjz)
    throws Exception
  {
    PivotFormatConditionCollection localPivotFormatConditionCollection = this.b.aj;
    if ((localPivotFormatConditionCollection == null) || (localPivotFormatConditionCollection.getCount() == 0)) {
      return;
    }
    int i = d();
    int j = localPivotFormatConditionCollection.getCount();
    int k = zaxj.a(localPivotFormatConditionCollection);
    if (k < 1) {
      return;
    }
    paramzcjz.b("x14:conditionalFormats");
    paramzcjz.a("count", zauj.z(k));
    for (int m = 0; m < j; m++)
    {
      PivotFormatCondition localPivotFormatCondition = localPivotFormatConditionCollection.get(m);
      FormatConditionCollection localFormatConditionCollection = localPivotFormatCondition.a();
      if ((localFormatConditionCollection != null) && (localFormatConditionCollection.a(true)))
      {
        paramzcjz.b("x14:conditionalFormat");
        if (localPivotFormatCondition.c == 0) {
          paramzcjz.a("priority", zauj.z(i));
        } else {
          paramzcjz.a("priority", zauj.z(localPivotFormatCondition.c));
        }
        i--;
        if (localPivotFormatCondition.d != 2) {
          paramzcjz.a("scope", zaxj.a(localPivotFormatCondition.d));
        }
        if (localPivotFormatCondition.e != 0) {
          paramzcjz.a("type", zaxj.b(localPivotFormatCondition.e));
        }
        if (localFormatConditionCollection.getCount() > 0) {
          paramzcjz.a("id", "{" + zs.a(localFormatConditionCollection.get(0).b()) + "}");
        }
        int n = localPivotFormatCondition.b.size();
        paramzcjz.b("x14:pivotAreas");
        paramzcjz.a("count", zauj.z(n));
        for (int i1 = 0; i1 < n; i1++)
        {
          zbur localzbur = (zbur)localPivotFormatCondition.b.get(i1);
          a(paramzcjz, localzbur);
        }
        paramzcjz.b();
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void m(zcjz paramzcjz)
    throws Exception
  {
    PivotFormatConditionCollection localPivotFormatConditionCollection = this.b.aj;
    if ((localPivotFormatConditionCollection == null) || (localPivotFormatConditionCollection.getCount() == 0)) {
      return;
    }
    int i = d();
    int j = zaxj.a(localPivotFormatConditionCollection);
    int k = localPivotFormatConditionCollection.getCount();
    int m = k - j;
    if (m < 1) {
      return;
    }
    paramzcjz.b("conditionalFormats");
    paramzcjz.a("count", zauj.z(m));
    for (int n = 0; n < k; n++)
    {
      PivotFormatCondition localPivotFormatCondition = localPivotFormatConditionCollection.get(n);
      FormatConditionCollection localFormatConditionCollection = localPivotFormatCondition.a();
      if ((localFormatConditionCollection != null) && (!localFormatConditionCollection.a(false)))
      {
        paramzcjz.b("conditionalFormat");
        if (localPivotFormatCondition.c == 0) {
          paramzcjz.a("priority", zauj.z(i));
        } else {
          paramzcjz.a("priority", zauj.z(localPivotFormatCondition.c));
        }
        i--;
        if (localPivotFormatCondition.d != 2) {
          paramzcjz.a("scope", zaxj.a(localPivotFormatCondition.d));
        }
        if (localPivotFormatCondition.e != 0) {
          paramzcjz.a("type", zaxj.b(localPivotFormatCondition.e));
        }
        int i1 = localPivotFormatCondition.b.size();
        paramzcjz.b("pivotAreas");
        paramzcjz.a("count", zauj.z(i1));
        for (int i2 = 0; i2 < i1; i2++)
        {
          zbur localzbur = (zbur)localPivotFormatCondition.b.get(i2);
          a(paramzcjz, localzbur);
        }
        paramzcjz.b();
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void n(zcjz paramzcjz)
    throws Exception
  {
    zbuc localzbuc = this.b.ag;
    int i = localzbuc.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("formats");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < localzbuc.getCount(); j++)
    {
      zbub localzbub = localzbuc.a(j);
      paramzcjz.b("format");
      if (localzbub.a == 0) {
        paramzcjz.a("action", "blank");
      }
      if (localzbub.b != -1) {
        paramzcjz.a("dxfId", zauj.z(localzbub.b));
      }
      zbur localzbur = localzbub.c;
      paramzcjz.b("pivotArea");
      if (localzbur.h()) {
        paramzcjz.a("outline", "1");
      } else {
        paramzcjz.a("outline", "0");
      }
      paramzcjz.a("fieldPosition", zauj.a(localzbur.a));
      if (localzbur.f() == 2) {
        paramzcjz.a("axis", "axisCol");
      } else if (localzbur.f() == 4) {
        paramzcjz.a("axis", "axisPage");
      } else if (localzbur.f() == 1) {
        paramzcjz.a("axis", "axisRow");
      } else if (localzbur.f() == 8) {
        paramzcjz.a("axis", "axisValues");
      }
      if (localzbur.j) {
        paramzcjz.a("collapsedLevelsAreSubtotals", "1");
      }
      if (!localzbur.a()) {
        paramzcjz.a("dataOnly", "0");
      }
      if ((localzbur.b & 0xFF) != 255) {
        if ((localzbur.b & 0xFF) == 254) {
          paramzcjz.a("field", "-2");
        } else {
          paramzcjz.a("field", zauj.a(localzbur.b));
        }
      }
      if (localzbur.d()) {
        paramzcjz.a("grandCol", "1");
      }
      if (localzbur.c()) {
        paramzcjz.a("grandRow", "1");
      }
      if (localzbur.b()) {
        paramzcjz.a("labelOnly", "1");
      }
      if (localzbur.j())
      {
        CellArea localCellArea = new CellArea();
        localCellArea.StartRow = (localzbur.f & 0xFF);
        localCellArea.EndRow = (localzbur.g & 0xFF);
        localCellArea.StartColumn = (localzbur.h & 0xFF);
        localCellArea.EndColumn = (localzbur.i & 0xFF);
        paramzcjz.a("offset", zauj.a(localCellArea));
      }
      switch (localzbur.g())
      {
      case 6: 
        paramzcjz.a("type", "topRight");
        break;
      case 5: 
        paramzcjz.a("type", "button");
        break;
      case 4: 
        paramzcjz.a("type", "origin");
        break;
      case 3: 
        paramzcjz.a("type", "all");
      }
      if (localzbur.e.size() > 0)
      {
        int k = localzbur.e.size();
        paramzcjz.b("references");
        paramzcjz.a("count", zauj.z(k));
        for (int m = 0; m < localzbur.e.size(); m++)
        {
          zbtz localzbtz = (zbtz)localzbur.e.get(m);
          paramzcjz.b("reference");
          paramzcjz.a("field", zauj.a((short)(localzbtz.b() & 0xFFFF) & 0xFFFFFFFF & 0xFFFFFFFF));
          if (localzbtz.h) {
            paramzcjz.a("avgSubtotal", "1");
          }
          if (localzbtz.g) {
            paramzcjz.a("countASubtotal", "1");
          }
          if (localzbtz.l) {
            paramzcjz.a("countSubtotal", "1");
          }
          if (localzbtz.e) {
            paramzcjz.a("defaultSubtotal", "1");
          }
          if (localzbtz.i) {
            paramzcjz.a("maxSubtotal", "1");
          }
          if (localzbtz.j) {
            paramzcjz.a("minSubtotal", "1");
          }
          if (localzbtz.k) {
            paramzcjz.a("productSubtotal", "1");
          }
          if (localzbtz.n) {
            paramzcjz.a("stdDevPSubtotal", "1");
          }
          if (localzbtz.m) {
            paramzcjz.a("stdDevSubtotal", "1");
          }
          if (localzbtz.f) {
            paramzcjz.a("sumSubtotal", "1");
          }
          if (localzbtz.p) {
            paramzcjz.a("varPSubtotal", "1");
          }
          if (localzbtz.o) {
            paramzcjz.a("varSubtotal", "1");
          }
          if (!localzbtz.c()) {
            paramzcjz.a("selected", "0");
          }
          int n = localzbtz.c.size();
          paramzcjz.a("count", zauj.z(n));
          for (int i1 = 0; i1 < n; i1++)
          {
            paramzcjz.b("x");
            if (((Integer)localzbtz.c.get(i1)).intValue() == 32767) {
              paramzcjz.a("v", zauj.z(1048832));
            } else {
              paramzcjz.a("v", zauj.z(((Integer)localzbtz.c.get(i1)).intValue()));
            }
            paramzcjz.b();
          }
          paramzcjz.b();
        }
        paramzcjz.b();
      }
      paramzcjz.b();
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void o(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("pivotTableStyleInfo");
    if ((this.b.getPivotTableStyleName() != null) && (this.b.getPivotTableStyleName().length() != 0)) {
      paramzcjz.a("name", this.b.getPivotTableStyleName());
    }
    paramzcjz.a("showRowHeaders", this.b.getShowPivotStyleRowHeader() ? "1" : "0");
    paramzcjz.a("showColHeaders", this.b.getShowPivotStyleColumnHeader() ? "1" : "0");
    paramzcjz.a("showRowStripes", this.b.getShowPivotStyleRowStripes() ? "1" : "0");
    paramzcjz.a("showColStripes", this.b.getShowPivotStyleColumnStripes() ? "1" : "0");
    paramzcjz.a("showLastColumn", this.b.getShowPivotStyleLastColumn() ? "1" : "0");
    paramzcjz.b();
  }
  
  private int a(PivotField paramPivotField)
  {
    int i = paramPivotField.e.getCount();
    if (paramPivotField.isAutoSubtotals())
    {
      i++;
    }
    else if (!paramPivotField.getSubtotals(0))
    {
      int j = paramPivotField.c.a;
      for (int k = 1; k < 14; k++) {
        if (((j & 0xFFFF) >> k & 0x1) != 0) {
          i++;
        }
      }
    }
    return i;
  }
  
  private void a(zcjz paramzcjz, PivotField paramPivotField)
    throws Exception
  {
    if (paramPivotField.getSubtotals(0)) {
      paramzcjz.a("defaultSubtotal", "0");
    }
    if (paramPivotField.getSubtotals(2)) {
      paramzcjz.a("sumSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(4)) {
      paramzcjz.a("countSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(128)) {
      paramzcjz.a("countASubtotal", "1");
    }
    if (paramPivotField.getSubtotals(256)) {
      paramzcjz.a("stdDevSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(512)) {
      paramzcjz.a("stdDevPSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(1024)) {
      paramzcjz.a("varSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(2048)) {
      paramzcjz.a("varPSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(8)) {
      paramzcjz.a("avgSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(16)) {
      paramzcjz.a("maxSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(32)) {
      paramzcjz.a("minSubtotal", "1");
    }
    if (paramPivotField.getSubtotals(64)) {
      paramzcjz.a("productSubtotal", "1");
    }
  }
  
  private boolean e()
  {
    return (this.b.getAutoFormatType() == 12) || (this.b.getAutoFormatType() == 13) || (this.b.getAutoFormatType() == 14) || (this.b.getAutoFormatType() == 15) || (this.b.getAutoFormatType() == 16) || (this.b.getAutoFormatType() == 18);
  }
  
  private void a(zcjz paramzcjz, PivotField paramPivotField, int paramInt)
    throws Exception
  {
    if (paramPivotField.m != 0) {
      paramzcjz.a("axis", zauj.ab(paramPivotField.m));
    }
    if (paramPivotField.h()) {
      paramzcjz.a("dataField", "1");
    }
    if (paramPivotField.getShowInOutlineForm())
    {
      if (!paramPivotField.getShowCompact()) {
        paramzcjz.a("compact", "0");
      }
      if (!paramPivotField.getShowSubtotalAtTop()) {
        paramzcjz.a("subtotalTop", "0");
      }
    }
    else
    {
      if (!paramPivotField.getShowCompact()) {
        paramzcjz.a("compact", "0");
      }
      paramzcjz.a("outline", "0");
      if (!paramPivotField.getShowSubtotalAtTop()) {
        paramzcjz.a("subtotalTop", "0");
      }
    }
    if (paramPivotField.o) {
      paramzcjz.a("allDrilled", "1");
    }
    if (!paramPivotField.getShowAllItems()) {
      paramzcjz.a("showAll", "0");
    }
    if (paramPivotField.isAutoShow())
    {
      paramzcjz.a("autoShow", "1");
      if (!paramPivotField.isAscendShow()) {
        paramzcjz.a("topAutoShow", "0");
      }
    }
    if (paramInt == 0)
    {
      if ((e()) || (paramPivotField.getInsertBlankRow())) {
        paramzcjz.a("insertBlankRow", "1");
      }
    }
    else if (paramPivotField.getInsertBlankRow()) {
      paramzcjz.a("insertBlankRow", "1");
    }
    if (paramPivotField.isIncludeNewItemsInFilter()) {
      paramzcjz.a("includeNewItemsInFilter", "1");
    }
    if (paramPivotField.isAutoShow())
    {
      short s = (short)paramPivotField.getAutoShowCount();
      if (s != 10) {
        paramzcjz.a("itemPageCount", zauj.a(s));
      }
    }
    if (paramPivotField.n) {
      paramzcjz.a("multipleItemSelectionAllowed", "1");
    }
    if (paramPivotField.isAutoSort())
    {
      String str = paramPivotField.isAscendSort() ? "ascending" : "descending";
      paramzcjz.a("sortType", str);
    }
    if (paramPivotField.getAutoShowField() >= 0) {
      paramzcjz.a("rankBy", zauj.z(paramPivotField.getAutoShowField()));
    }
    if (paramPivotField.d.d > 0) {
      paramzcjz.a("numFmtId", zauj.a(paramPivotField.d.d));
    }
    if (paramPivotField.getDisplayName() != null) {
      paramzcjz.a("name", paramPivotField.getDisplayName());
    }
    if (paramPivotField.isInsertPageBreaksBetweenItems()) {
      paramzcjz.a("insertPageBreak", "1");
    }
    if (!paramPivotField.getDragToRow()) {
      paramzcjz.a("dragToRow", "0");
    }
    if (!paramPivotField.getDragToColumn()) {
      paramzcjz.a("dragToCol", "0");
    }
    if (!paramPivotField.getDragToPage()) {
      paramzcjz.a("dragToPage", "0");
    }
    if (!paramPivotField.getDragToData()) {
      paramzcjz.a("dragToData", "0");
    }
    if (!paramPivotField.getDragToHide()) {
      paramzcjz.a("dragOff", "0");
    }
    if (paramPivotField.p) {
      paramzcjz.a("dataSourceSort", "1");
    }
    a(paramzcjz, paramPivotField);
  }
  
  private void b(zcjz paramzcjz, PivotField paramPivotField)
    throws Exception
  {
    paramzcjz.b("autoSortScope");
    a(paramzcjz, paramPivotField.f);
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz, PivotField paramPivotField)
    throws Exception
  {
    PivotItemCollection localPivotItemCollection = paramPivotField.e;
    if (localPivotItemCollection == null) {
      return;
    }
    if ((localPivotItemCollection.getCount() == 0) && ((paramPivotField.m != 4) || (!paramPivotField.isAutoSubtotals()))) {
      return;
    }
    paramzcjz.b("items");
    int i = a(paramPivotField);
    int j = 0;
    paramzcjz.a("count", zauj.z(i));
    if (paramPivotField.isAutoSubtotals()) {
      j = i - 1;
    } else {
      j = i;
    }
    j = Math.min(j, localPivotItemCollection.getCount());
    for (int k = 0; k < j; k++)
    {
      PivotItem localPivotItem = localPivotItemCollection.get(k);
      if (localPivotItem.getIndex() != -1)
      {
        paramzcjz.b("item");
        if ((localPivotItem.d != null) && (localPivotItem.d.length() > 0)) {
          paramzcjz.a("n", localPivotItem.d);
        }
        if (localPivotItem.isHidden()) {
          paramzcjz.a("h", "1");
        }
        if (localPivotItem.a()) {
          paramzcjz.a("sd", "0");
        }
        if (localPivotItem.b()) {
          paramzcjz.a("f", "1");
        }
        if (localPivotItem.c()) {
          paramzcjz.a("m", "1");
        }
        if (localPivotItem.h) {
          paramzcjz.a("s", "1");
        }
        if (localPivotItem.f) {
          paramzcjz.a("c", "1");
        }
        paramzcjz.a("x", zauj.z(localPivotItem.getIndex()));
        if (localPivotItem.g) {
          paramzcjz.a("d", "1");
        }
        paramzcjz.b();
      }
    }
    if (paramPivotField.isAutoSubtotals())
    {
      a(paramzcjz, "t", "default");
    }
    else if (!paramPivotField.getSubtotals(0))
    {
      k = paramPivotField.c.a;
      for (int m = 1; m < 14; m++) {
        if (((k & 0xFFFF) >> m & 0x1) != 0)
        {
          int n = 1 << m;
          String str = zauj.ac(n);
          a(paramzcjz, "t", str);
        }
      }
    }
    paramzcjz.b();
  }
  
  private void p(zcjz paramzcjz)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.b.getBaseFields();
    int i = localPivotFieldCollection.getCount();
    if (i == 0) {
      return;
    }
    paramzcjz.b("pivotFields");
    paramzcjz.a("count", zauj.z(i));
    for (int j = 0; j < i; j++)
    {
      PivotField localPivotField = localPivotFieldCollection.get(j);
      paramzcjz.b("pivotField");
      a(paramzcjz, localPivotField, j);
      c(paramzcjz, localPivotField);
      if ((localPivotField.isAutoSort()) && (localPivotField.getAutoSortField() >= 0) && (localPivotField.f != null)) {
        b(paramzcjz, localPivotField);
      }
      if (localPivotField.isRepeatItemLabels()) {
        e(paramzcjz, localPivotField);
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void q(zcjz paramzcjz)
    throws Exception
  {
    int i = 0;
    PivotFormatConditionCollection localPivotFormatConditionCollection = this.b.aj;
    if ((localPivotFormatConditionCollection != null) && (localPivotFormatConditionCollection.getCount() != 0)) {
      i = zaxj.a(this.b.aj);
    }
    if ((this.b.J) || (this.b.getEnableDataValueEditing()) || (this.b.P != null) || (this.b.Q != null) || (i > 0))
    {
      paramzcjz.b("extLst");
      paramzcjz.b("ext");
      paramzcjz.a("uri", this.b.R);
      paramzcjz.a("xmlns:x14", zaty.c);
      paramzcjz.b("x14:pivotTableDefinition");
      if (this.b.J) {
        paramzcjz.a("hideValuesRow", "1");
      }
      if (this.b.getEnableDataValueEditing()) {
        paramzcjz.a("enableEdit", "1");
      }
      if (this.b.P != null) {
        paramzcjz.a("altText", this.b.P);
      }
      if (this.b.Q != null) {
        paramzcjz.a("altTextSummary", this.b.Q);
      }
      if (i > 0)
      {
        paramzcjz.a("xmlns:xm", "http://schemas.microsoft.com/office/excel/2006/main");
        l(paramzcjz);
      }
      paramzcjz.b();
      paramzcjz.b();
      paramzcjz.b();
    }
  }
  
  private void d(zcjz paramzcjz, PivotField paramPivotField)
    throws Exception
  {
    int i = 0;
    switch (paramPivotField.i.b)
    {
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
      i = 1;
      break;
    }
    int j = (i != 0) || (paramPivotField.getFunction() == 11) ? 1 : 0;
    if (j == 0) {
      return;
    }
    paramzcjz.b("extLst");
    if (i != 0)
    {
      paramzcjz.b("ext");
      paramzcjz.a("uri", "{E15A36E0-9728-4e99-A89B-3F7291B0FE68}");
      paramzcjz.a("xmlns:x14", zaty.c);
      paramzcjz.b("x14:dataField");
      paramzcjz.a("pivotShowAs", zauj.ae(paramPivotField.i.b));
      paramzcjz.b();
      paramzcjz.b();
    }
    if (paramPivotField.getFunction() == 11)
    {
      paramzcjz.b("ext");
      paramzcjz.a("uri", "{FABC7310-3BB5-11E1-824E-6D434824019B}");
      paramzcjz.a("xmlns:x15", zaty.d);
      paramzcjz.b("x15:dataField");
      paramzcjz.a("isCountDistinct", "1");
      paramzcjz.b();
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void e(zcjz paramzcjz, PivotField paramPivotField)
    throws Exception
  {
    paramzcjz.b("extLst");
    paramzcjz.b("ext");
    paramzcjz.a("uri", paramPivotField.s);
    paramzcjz.a("xmlns:x14", zaty.c);
    paramzcjz.b("x14:pivotField");
    paramzcjz.a("fillDownLabels", "1");
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.b("item");
    paramzcjz.a(paramString1, paramString2);
    paramzcjz.b();
  }
  
  private void r(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("location");
    paramzcjz.a("ref", zauj.a(this.b.getTableRange1()));
    int i = this.b.m - this.b.i > 0 ? this.b.m - this.b.i : 0;
    int j = this.b.n - this.b.i > 0 ? this.b.n - this.b.i : 0;
    int k = this.b.o - this.b.k > 0 ? this.b.o - this.b.k : 1;
    paramzcjz.a("firstHeaderRow", zauj.z(i));
    paramzcjz.a("firstDataRow", zauj.z(j));
    paramzcjz.a("firstDataCol", zauj.z(k));
    if (this.b.getPageFields().getCount() > 0) {
      if ((this.b.p == -1) || (this.b.q == -1))
      {
        paramzcjz.a("rowPageCount", zauj.z(this.b.getPageFields().getCount()));
        paramzcjz.a("colPageCount", "1");
      }
      else
      {
        paramzcjz.a("rowPageCount", zauj.z(this.b.p));
        paramzcjz.a("colPageCount", zauj.z(this.b.q));
      }
    }
    paramzcjz.b();
  }
  
  private void s(zcjz paramzcjz)
    throws Exception
  {
    int i = 0;
    int j = -1;
    if (this.b.b.c.getCount() > 1)
    {
      PivotField localPivotField = this.b.getDataField();
      if (localPivotField != null)
      {
        j = localPivotField.getPosition();
        switch (localPivotField.m)
        {
        case 2: 
          if (j == this.b.getColumnFields().getCount() - 1) {
            j = -1;
          }
          break;
        case 1: 
          i = 1;
          if (j == this.b.getRowFields().getCount() - 1) {
            j = -1;
          }
          break;
        }
      }
    }
    if (i != 0) {
      paramzcjz.a("dataOnRows", "1");
    }
    if (j != -1) {
      paramzcjz.a("dataPosition", zauj.z(j));
    }
  }
  
  private void t(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.a("name", this.b.getName());
    paramzcjz.a("cacheId", this.c);
    s(paramzcjz);
    String str = "0";
    if (this.b.getAutoFormatType() != 1)
    {
      int i = zauj.Z(this.b.getAutoFormatType());
      paramzcjz.a("autoFormatId", zauj.z(i));
      str = "1";
    }
    paramzcjz.a("applyNumberFormats", str);
    paramzcjz.a("applyBorderFormats", str);
    paramzcjz.a("applyFontFormats", str);
    paramzcjz.a("applyPatternFormats", str);
    paramzcjz.a("applyAlignmentFormats", str);
    paramzcjz.a("applyWidthHeightFormats", "1");
    paramzcjz.a("dataCaption", this.b.b.h);
    if (!"".equals(this.b.getErrorString())) {
      paramzcjz.a("errorCaption", this.b.getErrorString());
    }
    if ((this.b.e != null) && (this.b.e.b != null)) {
      paramzcjz.a("grandTotalCaption", this.b.getGrandTotalName());
    }
    if (this.b.getDisplayErrorString()) {
      paramzcjz.a("showError", "1");
    }
    if (!"".equals(this.b.getNullString())) {
      paramzcjz.a("missingCaption", this.b.getNullString());
    }
    if (this.b.getDisplayNullString()) {
      paramzcjz.a("showMissing", "1");
    } else {
      paramzcjz.a("showMissing", "0");
    }
    if (!this.b.getDisplayImmediateItems()) {
      paramzcjz.a("showItems", "0");
    }
    if (!this.b.D) {
      paramzcjz.a("showHeaders", "0");
    }
    if (!this.b.E) {
      paramzcjz.a("customListSort", "0");
    }
    if (!this.b.getEnableDrilldown()) {
      paramzcjz.a("enableDrill", "0");
    }
    if (!this.b.getShowDrill()) {
      paramzcjz.a("showDrill", "0");
    }
    if (this.b.getPreserveFormatting()) {
      paramzcjz.a("preserveFormatting", "1");
    } else {
      paramzcjz.a("preserveFormatting", "0");
    }
    if (this.b.isAutoFormat()) {
      paramzcjz.a("useAutoFormatting", "1");
    }
    if (this.b.getPageFieldWrapCount() > 0) {
      paramzcjz.a("pageWrap", zauj.z(this.b.getPageFieldWrapCount()));
    }
    if (this.b.getPageFieldOrder() == 1) {
      paramzcjz.a("pageOverThenDown", "1");
    }
    if (this.b.getSubtotalHiddenPageItems()) {
      paramzcjz.a("subtotalHiddenItems", "1");
    }
    if (!this.b.getColumnGrand()) {
      paramzcjz.a("rowGrandTotals", "0");
    }
    if (!this.b.getRowGrand()) {
      paramzcjz.a("colGrandTotals", "0");
    }
    if (!this.b.getEnableFieldList()) {
      paramzcjz.a("disableFieldList", "1");
    }
    if (!this.b.getEnableWizard()) {
      paramzcjz.a("EnableWizard", "0");
    }
    if (!this.b.getEnableFieldDialog()) {
      paramzcjz.a("enableFieldProperties", "0");
    }
    if (this.b.getPrintTitles()) {
      paramzcjz.a("fieldPrintTitles", "1");
    }
    if (this.b.getItemPrintTitles()) {
      paramzcjz.a("itemPrintTitles", "1");
    }
    if (!this.b.u) {
      paramzcjz.a("compact", "0");
    }
    if (!this.b.v) {
      paramzcjz.a("compactData", "0");
    }
    if (this.b.w) {
      paramzcjz.a("outline", "1");
    }
    if (this.b.x) {
      paramzcjz.a("outlineData", "1");
    }
    if (this.b.getMergeLabels()) {
      paramzcjz.a("mergeItem", "1");
    }
    if (this.b.A) {
      paramzcjz.a("createdVersion", zauj.z(this.b.B));
    } else {
      paramzcjz.a("createdVersion", zauj.z(4));
    }
    if (this.b.y) {
      paramzcjz.a("updatedVersion", zauj.z(this.b.z));
    } else if ((this.b.J) || (b(this.b.getBaseFields()))) {
      paramzcjz.a("updatedVersion", zauj.z(4));
    } else if (a(this.b.getDataFields())) {
      paramzcjz.a("updatedVersion", zauj.z(5));
    }
    if (this.b.C != -1) {
      paramzcjz.a("indent", zauj.z(this.b.C));
    }
    if (this.b.t) {
      paramzcjz.a("gridDropZones", "1");
    }
    if (this.b.getRowHeaderCaption() != null) {
      paramzcjz.a("rowHeaderCaption", this.b.getRowHeaderCaption());
    }
    if (this.b.getColumnHeaderCaption() != null) {
      paramzcjz.a("colHeaderCaption", this.b.getColumnHeaderCaption());
    }
    if (this.b.getTag() != null) {
      paramzcjz.a("tag", this.b.getTag());
    }
    if (!this.b.isMultipleFieldFilters()) {
      paramzcjz.a("multipleFieldFilters", "0");
    }
    if (!this.b.getShowDataTips()) {
      paramzcjz.a("showDataTips", "0");
    }
    if (this.b.getShowMemberPropertyTips()) {
      paramzcjz.a("showMemberPropertyTips", "1");
    } else {
      paramzcjz.a("showMemberPropertyTips", "0");
    }
    if (this.b.getShowEmptyCol()) {
      paramzcjz.a("showEmptyCol", "1");
    }
    if (this.b.getShowEmptyRow()) {
      paramzcjz.a("showEmptyRow", "1");
    }
    if (this.b.getFieldListSortAscending()) {
      paramzcjz.a("fieldListSortAscending", "1");
    }
    if (this.b.getPrintDrill()) {
      paramzcjz.a("printDrill", "1");
    }
    if (this.b.getEnableDataValueEditing()) {
      paramzcjz.a("editData", "1");
    }
  }
  
  private boolean a(PivotFieldCollection paramPivotFieldCollection)
  {
    if ((paramPivotFieldCollection == null) || (paramPivotFieldCollection.getCount() == 0)) {
      return false;
    }
    int i = paramPivotFieldCollection.getCount();
    for (int j = 0; j < i; j++) {
      if (paramPivotFieldCollection.get(j).getDataDisplayFormat() != 0) {
        return true;
      }
    }
    return false;
  }
  
  private boolean b(PivotFieldCollection paramPivotFieldCollection)
  {
    if ((paramPivotFieldCollection == null) || (paramPivotFieldCollection.getCount() == 0)) {
      return false;
    }
    int i = paramPivotFieldCollection.getCount();
    for (int j = 0; j < i; j++) {
      if (paramPivotFieldCollection.get(j).isRepeatItemLabels()) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */