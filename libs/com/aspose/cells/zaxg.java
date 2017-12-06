package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zaxg
{
  private PivotTable c;
  private Cells d;
  private Worksheet e;
  private WorksheetCollection f = null;
  private zaxf g;
  private zaxf h;
  private boolean i = false;
  private int j = 0;
  private int k = 0;
  private int[][] l = (int[][])null;
  private int[][] m = (int[][])null;
  private int n = 0;
  private int o = 0;
  private HashMap p = new HashMap();
  private ArrayList q = new ArrayList();
  private HashMap r = new HashMap();
  static int a = 50;
  private int s = 0;
  private int t = 0;
  boolean b;
  private ArrayList u;
  private ArrayList v;
  private int w = 0;
  private int x = 0;
  private int y = 0;
  private int z = 0;
  private zaxb A;
  
  zaxg(zaxb paramzaxb)
  {
    this.A = paramzaxb;
    a();
  }
  
  void a()
  {
    this.c = this.A.a;
    this.g = this.A.f;
    this.h = this.A.g;
    this.d = this.A.b;
    this.e = this.A.c;
    this.f = this.A.d;
    this.t = this.A.k;
    this.s = this.A.j;
    this.b = this.A.m;
    this.u = this.A.w;
    this.v = this.A.x;
    this.w = this.A.s;
    this.x = this.A.t;
    this.y = this.A.u;
    this.z = this.A.v;
  }
  
  void b()
  {
    this.f.p().i();
    this.n = 0;
    this.o = 0;
    this.p = new HashMap();
    this.r = new HashMap();
    a(this.g, this.c.getRowFields(), 0);
    g();
    b(this.h, this.c.getColumnFields(), 0);
  }
  
  private void g()
  {
    PivotFieldCollection localPivotFieldCollection = this.c.getRowFields();
    if (localPivotFieldCollection.a())
    {
      int i1 = this.p.size() - 1;
      for (int i2 = 0; i2 < i1; i2++) {
        if ((!((String)this.p.get(Integer.valueOf(i2 + 1))).startsWith("rowsubtitle1")) && (!"grandtotalrow".equals((String)this.p.get(Integer.valueOf(i2 + 1)))) && ("blank".equals((String)this.p.get(Integer.valueOf(i2))))) {
          this.p.remove(Integer.valueOf(i2));
        }
      }
      if ("blank".equals((String)this.p.get(Integer.valueOf(i1)))) {
        this.p.remove(Integer.valueOf(i1));
      }
    }
  }
  
  private void a(zaxf paramzaxf, PivotFieldCollection paramPivotFieldCollection, int paramInt)
  {
    if ((paramzaxf == null) || (paramzaxf.d == null) || (paramzaxf.d.size() == 0)) {
      return;
    }
    for (int i1 = 0; i1 < paramzaxf.d.size(); i1++)
    {
      zaxf localzaxf = (zaxf)paramzaxf.d.get(i1);
      Object localObject1;
      if (paramInt + 1 == paramPivotFieldCollection.getCount())
      {
        localObject1 = (String)this.p.get(Integer.valueOf(this.n));
        if ((localObject1 != null) && (((String)localObject1).startsWith("rowsubtitle"))) {
          this.p.put(Integer.valueOf(this.n), (String)localObject1 + "+" + (paramInt + 1));
        } else {
          this.p.put(Integer.valueOf(this.n), "rowsubtitle" + (paramInt + 1));
        }
        this.n += 1;
      }
      else
      {
        Object localObject2;
        if (localzaxf.a.a())
        {
          localObject1 = (String)this.p.get(Integer.valueOf(this.n));
          if ((localObject1 != null) && (((String)localObject1).startsWith("rowsubtitle"))) {
            this.p.put(Integer.valueOf(this.n), (String)localObject1 + "+" + (paramInt + 1));
          } else {
            this.p.put(Integer.valueOf(this.n), "rowsubtitle" + (paramInt + 1));
          }
          zf.a(this.q, Integer.valueOf(this.n));
          this.n += 1;
          localObject2 = paramPivotFieldCollection.get(paramInt);
          if (((PivotField)localObject2).getInsertBlankRow())
          {
            this.p.put(Integer.valueOf(this.n), "blank");
            this.n += 1;
          }
        }
        else
        {
          localObject1 = paramPivotFieldCollection.get(paramInt);
          localObject2 = (String)this.p.get(Integer.valueOf(this.n));
          if ((localObject2 != null) && (((String)localObject2).startsWith("rowsubtitle"))) {
            this.p.put(Integer.valueOf(this.n), (String)localObject2 + "+" + (paramInt + 1));
          } else {
            this.p.put(Integer.valueOf(this.n), "rowsubtitle" + (paramInt + 1));
          }
          if (((PivotField)localObject1).getShowInOutlineForm()) {
            this.n += 1;
          }
          a(localzaxf, paramPivotFieldCollection, paramInt + 1);
        }
      }
    }
    int i2;
    if (paramInt == 0)
    {
      if (this.c.getColumnGrand()) {
        if (this.s == 1)
        {
          if (this.w > 1)
          {
            i1 = this.y;
            for (i2 = 0; i2 < i1; i2++)
            {
              this.p.put(Integer.valueOf(this.n), "grandtotalrow");
              this.n += 1;
            }
          }
        }
        else
        {
          this.p.put(Integer.valueOf(this.n), "grandtotalrow");
          this.n += 1;
        }
      }
    }
    else if (paramInt + 1 <= paramPivotFieldCollection.getCount())
    {
      PivotField localPivotField = paramPivotFieldCollection.get(paramInt - 1);
      if (!localPivotField.k()) {
        if (this.s == 1)
        {
          if (((paramPivotFieldCollection.getCount() > 2) && (!localPivotField.k()) && (this.c.getDataField() != null) && (localPivotField.getPosition() < this.c.getDataField().getPosition()) && ((this.c.getDataField().getPosition() != paramPivotFieldCollection.getCount() - 1) || ((this.c.getDataField().getPosition() == paramPivotFieldCollection.getCount() - 1) && (localPivotField.getPosition() < paramPivotFieldCollection.getCount() - 2)))) || ((!localPivotField.getShowInOutlineForm()) && (!localPivotField.k()) && (localPivotField.getPosition() + 1 < paramPivotFieldCollection.getCount()) && (!paramPivotFieldCollection.get(localPivotField.getPosition() + 1).i())) || ((localPivotField.getShowInOutlineForm()) && (!localPivotField.getShowSubtotalAtTop())))
          {
            i2 = this.y;
            for (int i3 = 0; i3 < i2; i3++)
            {
              this.p.put(Integer.valueOf(this.n), "rowsubtotal" + paramInt);
              this.n += 1;
            }
          }
        }
        else if (((localPivotField.getShowInOutlineForm()) && (!localPivotField.getShowSubtotalAtTop())) || (!localPivotField.getShowInOutlineForm()))
        {
          this.p.put(Integer.valueOf(this.n), "rowsubtotal" + paramInt);
          this.n += 1;
        }
      }
      if ((localPivotField.getInsertBlankRow()) && (!localPivotField.i()))
      {
        String str = (String)this.p.get(Integer.valueOf(this.n - 1));
        if ((str == null) || (!"blank".equals(str)))
        {
          this.p.put(Integer.valueOf(this.n), "blank");
          this.n += 1;
        }
      }
    }
  }
  
  private void b(zaxf paramzaxf, PivotFieldCollection paramPivotFieldCollection, int paramInt)
  {
    if ((paramzaxf == null) || (paramzaxf.d == null) || (paramzaxf.d.size() == 0)) {
      return;
    }
    for (int i1 = 0; i1 < paramzaxf.d.size(); i1++)
    {
      zaxf localzaxf = (zaxf)paramzaxf.d.get(i1);
      String str;
      if (paramInt + 1 == paramPivotFieldCollection.getCount())
      {
        str = (String)this.r.get(Integer.valueOf(this.o));
        if ((str != null) && (str.startsWith("columnsubtitle"))) {
          this.r.put(Integer.valueOf(this.o), str + "+" + (paramInt + 1));
        } else {
          this.r.put(Integer.valueOf(this.o), "columnsubtitle" + (paramInt + 1));
        }
        this.o += 1;
      }
      else if (localzaxf.a.a())
      {
        str = (String)this.r.get(Integer.valueOf(this.o));
        if ((str != null) && (str.startsWith("columnsubtitle"))) {
          this.r.put(Integer.valueOf(this.o), str + "+" + (paramInt + 1));
        } else {
          this.r.put(Integer.valueOf(this.o), "columnsubtitle" + (paramInt + 1));
        }
        this.o += 1;
      }
      else
      {
        str = (String)this.r.get(Integer.valueOf(this.o));
        if ((str != null) && (str.startsWith("columnsubtitle"))) {
          this.r.put(Integer.valueOf(this.o), str + "+" + (paramInt + 1));
        } else {
          this.r.put(Integer.valueOf(this.o), "columnsubtitle" + (paramInt + 1));
        }
        b(localzaxf, paramPivotFieldCollection, paramInt + 1);
      }
    }
    int i2;
    if (paramInt == 0)
    {
      if (this.c.getRowGrand()) {
        if (this.s == 2)
        {
          if (this.x > 1)
          {
            i1 = this.y;
            for (i2 = 0; i2 < i1; i2++)
            {
              this.r.put(Integer.valueOf(this.o), "grandtotalcolumn");
              this.o += 1;
            }
          }
        }
        else
        {
          this.r.put(Integer.valueOf(this.o), "grandtotalcolumn");
          this.o += 1;
        }
      }
    }
    else if (paramInt + 1 <= paramPivotFieldCollection.getCount())
    {
      PivotField localPivotField = paramPivotFieldCollection.get(paramInt - 1);
      if (!localPivotField.k()) {
        if (this.s == 2)
        {
          if ((localPivotField.getPosition() - this.t != -1) && (localPivotField.getPosition() != this.t)) {
            if (localPivotField.getPosition() < this.t)
            {
              i2 = this.y;
              for (int i3 = 0; i3 < i2; i3++)
              {
                this.r.put(Integer.valueOf(this.o), "columnsubtotal" + paramInt);
                this.o += 1;
              }
            }
            else
            {
              this.r.put(Integer.valueOf(this.o), "columnsubtotal" + paramInt);
              this.o += 1;
            }
          }
        }
        else
        {
          this.r.put(Integer.valueOf(this.o), "columnsubtotal" + paramInt);
          this.o += 1;
        }
      }
    }
  }
  
  void c()
  {
    this.f.p().i();
    int i1;
    int i2;
    Cell localCell;
    Style localStyle;
    if (this.c.ad != null) {
      for (i1 = this.c.i; i1 <= this.c.j; i1++) {
        for (i2 = this.c.k; i2 <= this.c.l; i2++)
        {
          localCell = this.d.a(i1, i2, false);
          localStyle = this.c.ac.a(this.c.ad[(i1 - this.c.i)][(i2 - this.c.k)]);
          zla.a(localStyle, localCell.getStyle());
          localCell.a(localStyle);
        }
      }
    }
    if ((this.c.ae != null) && (this.z > 0)) {
      for (i1 = 0; i1 < this.z; i1++) {
        for (i2 = 0; i2 < 2; i2++)
        {
          localCell = this.d.a(this.c.i - 1 - this.z + i1, this.c.k + i2, false);
          localStyle = this.c.ac.a(this.c.ae[i1][i2]);
          zla.a(localStyle, localCell.getStyle());
          localCell.a(localStyle);
        }
      }
    }
  }
  
  private void h()
  {
    this.c.ac = new zaxk(this.f);
    Style localStyle = new Style(this.f);
    localStyle.a(this.f, 15);
    this.c.ac.b(localStyle);
    this.i = (this.z > 0);
    int i2;
    if (this.i)
    {
      this.c.ae = new int[this.z][2];
      this.m = new int[this.z][2];
      for (i1 = 0; i1 < this.z; i1++) {
        for (i2 = 0; i2 < 2; i2++) {
          this.m[i1][i2] = -1;
        }
      }
    }
    this.j = (this.c.j - this.c.i + 1);
    this.k = (this.c.l - this.c.k + 1);
    this.c.ad = new int[this.j][this.k];
    this.l = new int[this.j][this.k];
    for (int i1 = 0; i1 < this.j; i1++) {
      for (i2 = 0; i2 < this.k; i2++) {
        this.l[i1][i2] = -1;
      }
    }
  }
  
  private void i()
  {
    int i1 = this.c.n - this.c.i;
    Object localObject1 = this.j - 1;
    int i2 = 0;
    if (this.c.ad.length == 0) {
      return;
    }
    Object localObject5;
    Object localObject6;
    for (Object localObject2 = i1; localObject2 <= localObject1; localObject2++)
    {
      String str = (String)this.p.get(Integer.valueOf(localObject2 - i1));
      if (str != null) {
        if (str.startsWith("rowsubtitle"))
        {
          int[] arrayOfInt = a(zw.d(str.substring("rowsubtitle".length()), '+'));
          for (int i5 = 0; i5 < arrayOfInt.length; i5++)
          {
            localObject5 = this.c.getRowFields().get(arrayOfInt[i5] - 1);
            if (!((PivotField)localObject5).i())
            {
              i2 = c(arrayOfInt[i5] - 1);
              localObject6 = g(this.c.ad[localObject2][i2]);
              ((Style)localObject6).b(((PivotField)localObject5).getNumberFormat());
              ((Style)localObject6).f(((PivotField)localObject5).getNumber());
              a((PivotField)localObject5, (Style)localObject6);
              this.c.ad[localObject2][i2] = this.c.ac.a((Style)localObject6);
            }
          }
        }
        else if (str.startsWith("rowsubtotal"))
        {
          int i3 = zp.a(str.substring("rowsubtotal".length()));
          localObject4 = this.c.getRowFields().get(i3 - 1);
          if (!((PivotField)localObject4).i())
          {
            i2 = c(i3 - 1);
            localObject5 = g(this.c.ad[localObject2][i2]);
            ((Style)localObject5).b(((PivotField)localObject4).getNumberFormat());
            ((Style)localObject5).f(((PivotField)localObject4).getNumber());
            a((PivotField)localObject4, (Style)localObject5);
            this.c.ad[localObject2][i2] = this.c.ac.a((Style)localObject5);
          }
        }
        else if (("grandtotalrow".equals(str)) && (this.w > 0))
        {
          PivotField localPivotField1 = this.c.getRowFields().get(0);
          i2 = 0;
          localObject4 = g(this.c.ad[localObject2][i2]);
          ((Style)localObject4).b(localPivotField1.getNumberFormat());
          ((Style)localObject4).f(localPivotField1.getNumber());
          a(localPivotField1, (Style)localObject4);
          this.c.ad[localObject2][i2] = this.c.ac.a((Style)localObject4);
        }
      }
    }
    localObject2 = this.c.o - this.c.k;
    Object localObject3 = this.k - 1;
    int i4 = 0;
    Object localObject8;
    Object localObject7;
    PivotField localPivotField2;
    for (Object localObject4 = localObject2; localObject4 <= localObject3; localObject4++)
    {
      localObject5 = (String)this.r.get(Integer.valueOf(localObject4 - localObject2));
      if (localObject5 != null) {
        if (((String)localObject5).startsWith("columnsubtitle"))
        {
          localObject6 = a(zw.d(((String)localObject5).substring("columnsubtitle".length()), '+'));
          for (int i9 = 0; i9 < localObject6.length; i9++)
          {
            localObject8 = this.c.getColumnFields().get(localObject6[i9] - 1);
            if (!((PivotField)localObject8).i())
            {
              i4 = localObject6[i9];
              Style localStyle = g(this.c.ad[i4][localObject4]);
              localStyle.b(((PivotField)localObject8).getNumberFormat());
              localStyle.f(((PivotField)localObject8).getNumber());
              a((PivotField)localObject8, localStyle);
              this.c.ad[i4][localObject4] = this.c.ac.a(localStyle);
            }
          }
        }
        else if (((String)localObject5).startsWith("columnsubtotal"))
        {
          int i7 = zp.a(((String)localObject5).substring("columnsubtotal".length()));
          localObject7 = this.c.getColumnFields().get(i7 - 1);
          if (!((PivotField)localObject7).i())
          {
            i4 = i7;
            localObject8 = g(this.c.ad[i4][localObject4]);
            ((Style)localObject8).b(((PivotField)localObject7).getNumberFormat());
            ((Style)localObject8).f(((PivotField)localObject7).getNumber());
            a((PivotField)localObject7, (Style)localObject8);
            this.c.ad[i4][localObject4] = this.c.ac.a((Style)localObject8);
          }
        }
        else if (("grandtotalcolumn".equals(localObject5)) && (this.x > 0))
        {
          localPivotField2 = this.c.getColumnFields().get(0);
          i4 = 1;
          localObject7 = g(this.c.ad[i4][localObject4]);
          ((Style)localObject7).b(localPivotField2.getNumberFormat());
          ((Style)localObject7).f(localPivotField2.getNumber());
          a(localPivotField2, (Style)localObject7);
          this.c.ad[i4][localObject4] = this.c.ac.a((Style)localObject7);
        }
      }
    }
    int i6;
    if (this.y > 0)
    {
      i6 = this.y;
      for (localObject5 = localObject2; localObject5 <= localObject3; localObject5++)
      {
        localPivotField2 = this.c.getDataFields().get((localObject5 - localObject2) % i6);
        for (localObject7 = i1; localObject7 <= localObject1; localObject7++)
        {
          localObject8 = g(this.c.ad[localObject7][localObject5]);
          ((Style)localObject8).b(localPivotField2.getNumberFormat());
          ((Style)localObject8).f(localPivotField2.getNumber());
          a(localPivotField2, (Style)localObject8);
          this.c.ad[localObject7][localObject5] = this.c.ac.a((Style)localObject8);
        }
      }
    }
    if (this.i)
    {
      i6 = this.z;
      localObject5 = null;
      for (int i8 = 0; i8 < i6; i8++)
      {
        localObject5 = this.c.getPageFields().get(i8);
        for (int i10 = 0; i10 < 2; i10++)
        {
          localObject8 = g(this.c.ae[i8][i10]);
          ((Style)localObject8).b(((PivotField)localObject5).getNumberFormat());
          ((Style)localObject8).f(((PivotField)localObject5).getNumber());
          a((PivotField)localObject5, (Style)localObject8);
          this.c.ae[i8][i10] = this.c.ac.a((Style)localObject8);
        }
      }
    }
  }
  
  private void a(PivotField paramPivotField, Style paramStyle)
  {
    ArrayList localArrayList = this.c.d.i;
    if ((paramPivotField.getBaseIndex() >= localArrayList.size()) || (paramPivotField.getBaseIndex() < 0)) {
      return;
    }
    zbtv localzbtv = (zbtv)localArrayList.get(paramPivotField.getBaseIndex());
    if ((localzbtv.j()) && (!localzbtv.k()) && (paramStyle.getNumber() == 0) && (zw.b(paramStyle.s()))) {
      paramStyle.f(14);
    }
  }
  
  void d()
  {
    this.f.p().i();
    h();
    i();
    if (this.c.af)
    {
      F();
      if (this.c.c() == null) {
        return;
      }
      TableStyleElement localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(0);
      Style localStyle1 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(1);
      Style localStyle2 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(2);
      Style localStyle3 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(3);
      Style localStyle4 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i2 = localStyle4 != null ? localTableStyleElement1.getSize() : 1;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(4);
      Style localStyle5 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i3 = localStyle5 != null ? localTableStyleElement1.getSize() : 1;
      int i4 = i2 + i3;
      int i5 = this.c.o - this.c.k;
      int i6 = this.c.n - this.c.i;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(5);
      Style localStyle6 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i7 = localStyle6 != null ? localTableStyleElement1.getSize() : 1;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(6);
      Style localStyle7 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i8 = localStyle7 != null ? localTableStyleElement1.getSize() : 1;
      int i9 = i7 + i8;
      int i10 = 0;
      int i11 = this.c.n - this.c.i;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(8);
      Style localStyle8 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i12 = this.c.o - 1 - this.c.k;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(9);
      Style localStyle9 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i13 = this.c.n - 1 - this.c.i;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(11);
      Style localStyle10 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i14 = this.c.n - 2 - this.c.i;
      int i15 = this.c.o - 1 - this.c.k;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(15);
      Object localObject1 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(16);
      Object localObject2 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(17);
      Object localObject3 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i16 = this.c.o - this.c.k;
      Style[] arrayOfStyle = { localObject1, localObject2, localObject3 };
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(18);
      Style localStyle11 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i17 = this.c.n - this.c.i;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(19);
      Object localObject4 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(20);
      Object localObject5 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(21);
      Object localObject6 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      int i18 = this.c.n - this.c.i;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(28);
      Style localStyle12 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      localTableStyleElement1 = this.c.c().getTableStyleElements().getByTableStyleElementType(29);
      Style localStyle13 = localTableStyleElement1 != null ? localTableStyleElement1.a() : null;
      Object localObject7;
      Object localObject9;
      if (this.i) {
        for (i19 = 0; i19 < this.z; i19++)
        {
          for (int i20 = 0; i20 < 2; i20++) {
            if (localStyle1 != null)
            {
              localObject7 = new zdk();
              a((zdk)localObject7, i19, 0, this.z - 1);
              b((zdk)localObject7, i20, 0, 1);
              localObject9 = g(this.c.ae[i19][i20]);
              this.m[i19][i20] = zla.a((Style)localObject9, localStyle1, (zdk)localObject7, 0, this.m[i19][i20]);
              this.c.ae[i19][i20] = this.c.ac.a((Style)localObject9);
            }
          }
          zdk localzdk1;
          if (localStyle2 != null)
          {
            localzdk1 = new zdk();
            localzdk1.c = true;
            localzdk1.d = true;
            a(localzdk1, i19, 0, this.z - 1);
            localObject7 = g(this.c.ae[i19][0]);
            this.m[i19][0] = zla.a((Style)localObject7, localStyle2, localzdk1, 1, this.m[i19][0]);
            this.c.ae[i19][0] = this.c.ac.a((Style)localObject7);
          }
          if (localStyle3 != null)
          {
            localzdk1 = new zdk();
            localzdk1.c = true;
            localzdk1.d = true;
            a(localzdk1, i19, 0, this.z - 1);
            localObject7 = g(this.c.ae[i19][1]);
            this.m[i19][1] = zla.a((Style)localObject7, localStyle3, localzdk1, 2, this.m[i19][1]);
            this.c.ae[i19][1] = this.c.ac.a((Style)localObject7);
          }
        }
      }
      for (int i19 = 0; i19 < this.j; i19++) {
        for (int i21 = 0; i21 < this.k; i21++)
        {
          if (localStyle1 != null)
          {
            localObject7 = new zdk();
            a((zdk)localObject7, i19, 0, this.j - 1);
            b((zdk)localObject7, i21, 0, this.k - 1);
            localObject9 = g(this.c.ad[i19][i21]);
            this.l[i19][i21] = zla.a((Style)localObject9, localStyle1, (zdk)localObject7, 0, this.l[i19][i21]);
            this.c.ad[i19][i21] = this.c.ac.a((Style)localObject9);
          }
          int i22;
          Object localObject10;
          Style localStyle18;
          if ((this.c.getShowPivotStyleColumnStripes()) && ((localStyle4 != null) || (localStyle5 != null)) && (i21 >= i5) && (i19 >= i6))
          {
            i22 = (i21 - i5) % i4;
            if ((i22 >= 0) && (i22 < i2) && (localStyle4 != null))
            {
              localObject9 = new zdk();
              b((zdk)localObject9, i22, 0, i2 - 1);
              a((zdk)localObject9, i19, i6, this.j - 1);
              localObject10 = g(this.c.ad[i19][i21]);
              this.l[i19][i21] = zla.a((Style)localObject10, localStyle4, (zdk)localObject9, 3, this.l[i19][i21]);
              this.c.ad[i19][i21] = this.c.ac.a((Style)localObject10);
            }
            int i24 = i22 - i2;
            if ((i24 >= 0) && (i24 < i3) && (localStyle5 != null))
            {
              localObject10 = new zdk();
              b((zdk)localObject10, i24, 0, i3 - 1);
              a((zdk)localObject10, i19, i6, this.j - 1);
              localStyle18 = g(this.c.ad[i19][i21]);
              this.l[i19][i21] = zla.a(localStyle18, localStyle5, (zdk)localObject10, 4, this.l[i19][i21]);
              this.c.ad[i19][i21] = this.c.ac.a(localStyle18);
            }
          }
          if ((this.c.getShowPivotStyleRowStripes()) && ((localStyle6 != null) || (localStyle7 != null)) && (i19 >= i11) && (i21 >= i10))
          {
            i22 = (i19 - i11) % i9;
            if ((i22 >= 0) && (i22 < i7) && (localStyle6 != null))
            {
              zdk localzdk2 = new zdk();
              a(localzdk2, i22, 0, i7 - 1);
              b(localzdk2, i21, i10, this.k - 1);
              localObject10 = g(this.c.ad[i19][i21]);
              this.l[i19][i21] = zla.a((Style)localObject10, localStyle6, localzdk2, 5, this.l[i19][i21]);
              this.c.ad[i19][i21] = this.c.ac.a((Style)localObject10);
            }
            int i25 = i22 - i7;
            if ((i25 >= 0) && (i25 < i8) && (localStyle7 != null))
            {
              localObject10 = new zdk();
              a((zdk)localObject10, i25, 0, i8 - 1);
              b((zdk)localObject10, i21, i10, this.k - 1);
              localStyle18 = g(this.c.ad[i19][i21]);
              this.l[i19][i21] = zla.a(localStyle18, localStyle7, (zdk)localObject10, 6, this.l[i19][i21]);
              this.c.ad[i19][i21] = this.c.ac.a(localStyle18);
            }
          }
          Object localObject8;
          Style localStyle14;
          if ((this.c.getShowPivotStyleRowHeader()) && ((this.w > 0) || (this.x > 0)) && (localStyle8 != null) && (i21 <= i12))
          {
            localObject8 = new zdk();
            a((zdk)localObject8, i19, 0, this.j - 1);
            b((zdk)localObject8, i21, 0, i12);
            if (i19 == i13)
            {
              ((zdk)localObject8).c = true;
              ((zdk)localObject8).d = true;
            }
            localStyle14 = g(this.c.ad[i19][i21]);
            this.l[i19][i21] = zla.a(localStyle14, localStyle8, (zdk)localObject8, 8, this.l[i19][i21]);
            this.c.ad[i19][i21] = this.c.ac.a(localStyle14);
          }
          if ((this.c.getShowPivotStyleColumnHeader()) && (localStyle9 != null) && (i19 <= i13))
          {
            localObject8 = new zdk();
            a((zdk)localObject8, i19, 0, i13);
            b((zdk)localObject8, i21, 0, this.k - 1);
            localStyle14 = g(this.c.ad[i19][i21]);
            this.l[i19][i21] = zla.a(localStyle14, localStyle9, (zdk)localObject8, 9, this.l[i19][i21]);
            this.c.ad[i19][i21] = this.c.ac.a(localStyle14);
          }
          if ((this.c.getShowPivotStyleRowHeader()) && (this.c.getShowPivotStyleColumnHeader()) && (this.x > 0) && (localStyle10 != null) && (i19 <= i14) && (i21 <= i15))
          {
            localObject8 = new zdk();
            a((zdk)localObject8, i19, 0, i14);
            b((zdk)localObject8, i21, 0, i15);
            localStyle14 = g(this.c.ad[i19][i21]);
            this.l[i19][i21] = zla.a(localStyle14, localStyle10, (zdk)localObject8, 11, this.l[i19][i21]);
            this.c.ad[i19][i21] = this.c.ac.a(localStyle14);
          }
          int i29;
          int i30;
          zdk localzdk5;
          Style localStyle21;
          if ((this.x > 1) && ((localObject1 != null) || (localObject2 != null) || (localObject3 != null)) && (i21 >= i16))
          {
            localObject8 = (String)this.r.get(Integer.valueOf(i21 - i16));
            if ((localObject8 != null) && (((String)localObject8).startsWith("columnsubtotal")))
            {
              int i26 = zp.a(((String)localObject8).substring("columnsubtotal".length()));
              localObject10 = a(i26, arrayOfStyle);
              localStyle18 = (Style)localObject10[0];
              i29 = ((Integer)localObject10[1]).intValue();
              i30 = i26;
              if ((i19 >= i30) && (localStyle18 != null))
              {
                localzdk5 = new zdk();
                a(localzdk5, i19, i30, this.j - 1);
                localzdk5.c = true;
                localzdk5.d = true;
                localStyle21 = g(this.c.ad[i19][i21]);
                this.l[i19][i21] = zla.a(localStyle21, localStyle18, localzdk5, i29, this.l[i19][i21]);
                this.c.ad[i19][i21] = this.c.ac.a(localStyle21);
              }
            }
          }
          if ((this.w > 1) && (localStyle11 != null) && (i19 >= i17))
          {
            localObject8 = (String)this.p.get(Integer.valueOf(i19 - i17));
            if ((localObject8 != null) && ("blank".equals(localObject8)))
            {
              zdk localzdk3 = new zdk();
              b(localzdk3, i21, 0, this.k - 1);
              localzdk3.a = true;
              localzdk3.b = true;
              localObject10 = g(this.c.ad[i19][i21]);
              this.l[i19][i21] = zla.a((Style)localObject10, localStyle11, localzdk3, 18, this.l[i19][i21]);
              this.c.ad[i19][i21] = this.c.ac.a((Style)localObject10);
            }
          }
          int i27;
          if ((this.w > 1) && ((localObject4 != null) || (localObject5 != null) || (localObject6 != null)) && (i19 >= i18))
          {
            localObject8 = (String)this.p.get(Integer.valueOf(i19 - i18));
            if ((localObject8 != null) && (((String)localObject8).startsWith("rowsubtotal")))
            {
              i27 = zp.a(((String)localObject8).substring("rowsubtotal".length()));
              localObject10 = b(i27, new Style[] { localObject4, localObject5, localObject6 });
              localStyle18 = (Style)localObject10[0];
              i29 = ((Integer)localObject10[1]).intValue();
              i30 = c(i27 - 1);
              if ((i21 >= i30) && (localStyle18 != null))
              {
                localzdk5 = new zdk();
                b(localzdk5, i21, i30, this.k - 1);
                localzdk5.a = true;
                localzdk5.b = true;
                localStyle21 = g(this.c.ad[i19][i21]);
                this.l[i19][i21] = zla.a(localStyle21, localStyle18, localzdk5, i29, this.l[i19][i21]);
                this.c.ad[i19][i21] = this.c.ac.a(localStyle21);
              }
            }
          }
          int i23;
          Style localStyle16;
          int i28;
          zdk localzdk4;
          Style localStyle20;
          if ((this.c.getRowGrand()) && (localStyle12 != null) && ((this.x != 1) || (!this.c.getColumnFields().get(0).i())))
          {
            i23 = 1;
            if (this.x == 0) {
              i23 = 0;
            }
            i27 = this.j - 1;
            localStyle16 = this.k - 1;
            localStyle18 = localStyle16;
            if ((this.s == 2) && (this.x > 1)) {
              i28 = localStyle18 - this.y + 1;
            }
            if ((i19 >= i23) && (i19 <= i27) && (i21 >= i28) && (i21 <= localStyle16))
            {
              localzdk4 = new zdk();
              a(localzdk4, i19, i23, i27);
              b(localzdk4, i21, i28, localStyle16);
              localStyle20 = g(this.c.ad[i19][i21]);
              this.l[i19][i21] = zla.a(localStyle20, localStyle12, localzdk4, 28, this.l[i19][i21]);
              this.c.ad[i19][i21] = this.c.ac.a(localStyle20);
            }
          }
          if ((this.c.getColumnGrand()) && (localStyle13 != null) && ((this.w != 1) || (!this.c.getRowFields().get(0).i())) && ((this.w != 0) || (this.y <= 1)))
          {
            i23 = 0;
            i27 = this.k - 1;
            localStyle16 = this.j - 1;
            i28 = localStyle16;
            if ((this.s == 1) && (this.x > 1)) {
              i28 = i28 - this.y + 1;
            }
            if ((i19 >= i28) && (i19 <= localStyle16) && (i21 >= i23) && (i21 <= i27))
            {
              localzdk4 = new zdk();
              b(localzdk4, i21, i23, i27);
              a(localzdk4, i19, i28, localStyle16);
              localStyle20 = g(this.c.ad[i19][i21]);
              this.l[i19][i21] = zla.a(localStyle20, localStyle13, localzdk4, 29, this.l[i19][i21]);
              this.c.ad[i19][i21] = this.c.ac.a(localStyle20);
            }
          }
        }
      }
      TableStyleElement localTableStyleElement2 = this.c.c().getTableStyleElements().getByTableStyleElementType(22);
      TableStyleElement localTableStyleElement3 = this.c.c().getTableStyleElements().getByTableStyleElementType(23);
      TableStyleElement localTableStyleElement4 = this.c.c().getTableStyleElements().getByTableStyleElementType(24);
      Style localStyle15 = null;
      Style localStyle17 = null;
      Style localStyle19 = null;
      localStyle15 = localTableStyleElement2 != null ? localTableStyleElement2.a() : null;
      localStyle17 = localTableStyleElement3 != null ? localTableStyleElement3.a() : null;
      localStyle19 = localTableStyleElement4 != null ? localTableStyleElement4.a() : null;
      if ((localStyle15 != null) || (localStyle17 != null) || (localStyle19 != null)) {
        d(localStyle15, localStyle17, localStyle19);
      }
      localTableStyleElement2 = this.c.c().getTableStyleElements().getByTableStyleElementType(25);
      localTableStyleElement3 = this.c.c().getTableStyleElements().getByTableStyleElementType(26);
      localTableStyleElement4 = this.c.c().getTableStyleElements().getByTableStyleElementType(27);
      localStyle15 = localTableStyleElement2 != null ? localTableStyleElement2.a() : null;
      localStyle17 = localTableStyleElement3 != null ? localTableStyleElement3.a() : null;
      localStyle19 = localTableStyleElement4 != null ? localTableStyleElement4.a() : null;
      if ((localStyle15 != null) || (localStyle17 != null) || (localStyle19 != null)) {
        e(localStyle15, localStyle17, localStyle19);
      }
    }
    else
    {
      int i1 = this.c.e.a();
      switch (i1)
      {
      case 12: 
        t();
        break;
      case 13: 
        u();
        break;
      case 14: 
        v();
        break;
      case 15: 
        w();
        break;
      case 16: 
        x();
        break;
      case 17: 
        y();
        break;
      case 18: 
        z();
        break;
      case 19: 
        A();
        break;
      case 20: 
        B();
        break;
      case 21: 
        C();
        break;
      case 1: 
        D();
        break;
      case 0: 
        E();
        break;
      case 2: 
        j();
        break;
      case 3: 
        k();
        break;
      case 4: 
        l();
        break;
      case 5: 
        m();
        break;
      case 6: 
        n();
        break;
      case 7: 
        o();
        break;
      case 8: 
        p();
        break;
      case 9: 
        q();
        break;
      case 10: 
        r();
        break;
      case 11: 
        s();
      }
    }
    if (this.i) {
      a(this.c.ae, this.m, this.z, 2);
    }
    b(this.c.ad, this.l, this.j, this.k);
  }
  
  private void j()
  {
    Style localStyle1 = zaxi.cM(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.cN(this.f);
    k(localStyle2);
    Style localStyle3 = zaxi.cO(this.f);
    c(localStyle3);
    Style localStyle4 = zaxi.cP(this.f);
    Style localStyle5 = zaxi.cQ(this.f);
    Style localStyle6 = zaxi.cR(this.f);
    Style localStyle7 = zaxi.cS(this.f);
    Style localStyle8 = zaxi.cT(this.f);
    Style localStyle9 = zaxi.cU(this.f);
    Style localStyle10 = zaxi.cV(this.f);
    Style localStyle11 = zaxi.cW(this.f);
    a(localStyle4, localStyle5, localStyle6, localStyle7, null, localStyle8, localStyle9, localStyle10, localStyle11, null, null);
    Style localStyle12 = zaxi.cX(this.f);
    y(localStyle12);
    Style localStyle13 = zaxi.cY(this.f);
    x(localStyle13);
  }
  
  private void k()
  {
    Style localStyle1 = zaxi.dk(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.cZ(this.f);
    o(localStyle2);
    p(localStyle2);
    Style localStyle3 = zaxi.da(this.f);
    k(localStyle3);
    Style localStyle4 = zaxi.db(this.f);
    c(localStyle4);
    Style localStyle5 = zaxi.dl(this.f);
    Style localStyle6 = zaxi.dm(this.f);
    Style localStyle7 = zaxi.dn(this.f);
    b(localStyle5, localStyle6, localStyle7);
    Style localStyle8 = zaxi.dc(this.f);
    Style localStyle9 = zaxi.dd(this.f);
    Style localStyle10 = zaxi.de(this.f);
    Style localStyle11 = zaxi.df(this.f);
    Style localStyle12 = zaxi.dg(this.f);
    Style localStyle13 = zaxi.dh(this.f);
    Style localStyle14 = zaxi.di(this.f);
    a(localStyle8, null, null, localStyle9, null, localStyle10, localStyle11, null, localStyle12, localStyle13, localStyle14);
    Style localStyle15 = zaxi.dj(this.f);
    y(localStyle15);
  }
  
  private void l()
  {
    Style localStyle1 = zaxi.jdMethod_do(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.dp(this.f);
    k(localStyle2);
    Style localStyle3 = zaxi.dq(this.f);
    c(localStyle3);
    Style localStyle4 = zaxi.dr(this.f);
    Style localStyle5 = zaxi.ds(this.f);
    Style localStyle6 = zaxi.dt(this.f);
    Style localStyle7 = zaxi.du(this.f);
    Style localStyle8 = zaxi.dv(this.f);
    Style localStyle9 = zaxi.dw(this.f);
    a(localStyle4, localStyle5, localStyle4, localStyle6, null, localStyle6, localStyle7, localStyle8, localStyle9, null, null);
    Style localStyle10 = zaxi.dx(this.f);
    y(localStyle10);
  }
  
  private void m()
  {
    Style localStyle1 = zaxi.dy(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.dz(this.f);
    k(localStyle2);
    Style localStyle3 = zaxi.dA(this.f);
    c(localStyle3);
    Style localStyle4 = zaxi.dB(this.f);
    Style localStyle5 = zaxi.dC(this.f);
    Style localStyle6 = zaxi.dD(this.f);
    b(localStyle4, localStyle5, localStyle6);
    Style localStyle7 = zaxi.dE(this.f);
    Style localStyle8 = zaxi.dF(this.f);
    Style localStyle9 = zaxi.dG(this.f);
    Style localStyle10 = zaxi.dH(this.f);
    Style localStyle11 = zaxi.dI(this.f);
    Style localStyle12 = zaxi.dJ(this.f);
    a(localStyle7, null, null, localStyle8, null, null, localStyle9, null, localStyle10, localStyle11, localStyle12);
    Style localStyle13 = zaxi.dK(this.f);
    y(localStyle13);
  }
  
  private void n()
  {
    Style localStyle1 = zaxi.dL(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.dM(this.f);
    k(localStyle2);
    j(localStyle2);
    Style localStyle3 = zaxi.dN(this.f);
    c(localStyle3);
    Style localStyle4 = zaxi.dO(this.f);
    Style localStyle5 = zaxi.dP(this.f);
    Style localStyle6 = zaxi.dQ(this.f);
    b(localStyle4, localStyle5, localStyle6);
    Style localStyle7 = zaxi.dR(this.f);
    Style localStyle8 = zaxi.dS(this.f);
    Style localStyle9 = zaxi.dT(this.f);
    Style localStyle10 = zaxi.dU(this.f);
    Style localStyle11 = zaxi.dV(this.f);
    Style localStyle12 = zaxi.dW(this.f);
    Style localStyle13 = zaxi.dX(this.f);
    a(localStyle7, null, null, localStyle8, null, localStyle9, localStyle10, null, localStyle11, localStyle12, localStyle13);
    Style localStyle14 = zaxi.dY(this.f);
    y(localStyle14);
  }
  
  private void o()
  {
    Style localStyle1 = zaxi.dZ(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.ea(this.f);
    o(localStyle2);
    p(localStyle2);
    Style localStyle3 = zaxi.eb(this.f);
    k(localStyle3);
    j(localStyle3);
    Style localStyle4 = zaxi.ec(this.f);
    c(localStyle4);
    Style localStyle5 = zaxi.ed(this.f);
    Style localStyle6 = zaxi.ee(this.f);
    Style localStyle7 = zaxi.ef(this.f);
    Style localStyle8 = zaxi.eg(this.f);
    Style localStyle9 = zaxi.eh(this.f);
    Style localStyle10 = zaxi.ei(this.f);
    Style localStyle11 = zaxi.ej(this.f);
    Style localStyle12 = zaxi.ek(this.f);
    Style localStyle13 = zaxi.el(this.f);
    Style localStyle14 = zaxi.em(this.f);
    a(localStyle5, localStyle6, localStyle7, localStyle8, localStyle9, localStyle10, localStyle11, null, localStyle12, localStyle13, localStyle14);
    Style localStyle15 = zaxi.en(this.f);
    y(localStyle15);
  }
  
  private void p()
  {
    Style localStyle1 = zaxi.eo(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.ep(this.f);
    o(localStyle2);
    p(localStyle2);
    Style localStyle3 = zaxi.eq(this.f);
    k(localStyle3);
    Style localStyle4 = zaxi.er(this.f);
    c(localStyle4);
    Style localStyle5 = zaxi.es(this.f);
    Style localStyle6 = zaxi.et(this.f);
    Style localStyle7 = zaxi.eu(this.f);
    b(localStyle5, localStyle6, localStyle7);
    Style localStyle8 = zaxi.ev(this.f);
    Style localStyle9 = zaxi.ew(this.f);
    Style localStyle10 = zaxi.ex(this.f);
    Style localStyle11 = zaxi.ey(this.f);
    Style localStyle12 = zaxi.ez(this.f);
    Style localStyle13 = zaxi.eA(this.f);
    a(localStyle8, null, null, localStyle9, null, null, localStyle10, null, localStyle11, localStyle12, localStyle13);
    Style localStyle14 = zaxi.eB(this.f);
    y(localStyle14);
  }
  
  private void q()
  {
    Style localStyle1 = zaxi.eC(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.eD(this.f);
    k(localStyle2);
    Style localStyle3 = zaxi.eE(this.f);
    c(localStyle3);
    Style localStyle4 = zaxi.eF(this.f);
    Style localStyle5 = zaxi.eG(this.f);
    Style localStyle6 = zaxi.eH(this.f);
    a(localStyle4, 19, localStyle5, 21, localStyle6, 20);
    Style localStyle7 = zaxi.eI(this.f);
    Style localStyle8 = zaxi.eJ(this.f);
    Style localStyle9 = zaxi.eJ(this.f);
    Style localStyle10 = zaxi.eK(this.f);
    Style localStyle11 = zaxi.eL(this.f);
    Style localStyle12 = zaxi.eM(this.f);
    Style localStyle13 = zaxi.eN(this.f);
    a(localStyle7, null, null, localStyle8, null, localStyle9, localStyle10, null, localStyle11, localStyle12, localStyle13);
    Style localStyle14 = zaxi.eO(this.f);
    y(localStyle14);
  }
  
  private void r()
  {
    Style localStyle1 = zaxi.eP(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.eQ(this.f);
    k(localStyle2);
    Style localStyle3 = zaxi.eR(this.f);
    c(localStyle3);
    Style localStyle4 = zaxi.eS(this.f);
    Style localStyle5 = zaxi.eT(this.f);
    Style localStyle6 = zaxi.eU(this.f);
    Style localStyle7 = zaxi.eV(this.f);
    Style localStyle8 = zaxi.eW(this.f);
    Style localStyle9 = zaxi.eX(this.f);
    a(localStyle4, localStyle4, null, localStyle5, localStyle6, null, localStyle7, localStyle8, null, localStyle9, null);
    Style localStyle10 = zaxi.eY(this.f);
    y(localStyle10);
  }
  
  private void s()
  {
    Style localStyle1 = zaxi.fm(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.eZ(this.f);
    o(localStyle2);
    p(localStyle2);
    Style localStyle3 = zaxi.fa(this.f);
    k(localStyle3);
    Style localStyle4 = zaxi.fb(this.f);
    c(localStyle4);
    Style localStyle5 = zaxi.fc(this.f);
    Style localStyle6 = zaxi.fd(this.f);
    Style localStyle7 = zaxi.fe(this.f);
    Style localStyle8 = zaxi.ff(this.f);
    Style localStyle9 = zaxi.fg(this.f);
    Style localStyle10 = zaxi.fh(this.f);
    Style localStyle11 = zaxi.fi(this.f);
    Style localStyle12 = zaxi.fj(this.f);
    Style localStyle13 = zaxi.fk(this.f);
    a(localStyle5, null, localStyle6, localStyle7, localStyle8, localStyle9, localStyle10, localStyle10, localStyle11, localStyle12, localStyle13);
    Style localStyle14 = zaxi.fl(this.f);
    y(localStyle14);
  }
  
  private void t()
  {
    Style localStyle1 = zaxi.l(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.g(this.f);
    o(localStyle2);
    Style localStyle3 = zaxi.o(this.f);
    i(localStyle3);
    Style localStyle4 = zaxi.p(this.f);
    k(localStyle4);
    Style localStyle5 = zaxi.d(this.f);
    r(localStyle5);
    Style localStyle6 = zaxi.c(this.f);
    q(localStyle6);
    Style localStyle7 = zaxi.m(this.f);
    s(localStyle7);
    Style localStyle8 = zaxi.q(this.f);
    a(localStyle8, localStyle8, localStyle8);
    Style localStyle9 = zaxi.h(this.f);
    int i1 = this.c.o - this.c.k;
    int i2 = 0;
    if (this.x > 0) {
      i2 = 1;
    }
    for (int i3 = i1; i3 < this.k; i3++)
    {
      localObject1 = new zdk();
      localObject2 = g(this.c.ad[i2][i3]);
      this.l[i2][i3] = zla.a((Style)localObject2, localStyle9, (zdk)localObject1, 22, this.l[i2][i3]);
      this.c.ad[i2][i3] = this.c.ac.a((Style)localObject2);
    }
    Style localStyle10 = zaxi.i(this.f);
    Object localObject1 = zaxi.j(this.f);
    Object localObject2 = localObject1;
    d(localStyle10, (Style)localObject1, (Style)localObject2);
    Style localStyle11 = zaxi.k(this.f);
    m(localStyle1);
    Style localStyle12 = zaxi.n(this.f);
    l(localStyle12);
    boolean bool = a(this.c.getRowFields());
    Style localStyle13 = zaxi.a(this.f, bool);
    Style localStyle14 = zaxi.b(this.f, bool);
    Style localStyle15 = localStyle13;
    e(localStyle13, localStyle14, localStyle15);
    Style localStyle16 = zaxi.s(this.f);
    Style localStyle17 = zaxi.t(this.f);
    Style localStyle18 = zaxi.u(this.f);
    b(localStyle16, localStyle17, localStyle18);
    if (bool)
    {
      localStyle19 = zaxi.cK(this.f);
      u(localStyle19);
    }
    Style localStyle19 = zaxi.e(this.f);
    b(localStyle19);
    Style localStyle20 = zaxi.w(this.f);
    v(localStyle20);
    Style localStyle21 = zaxi.v(this.f);
    t(localStyle21);
    Style localStyle22 = zaxi.x(this.f);
    y(localStyle22);
  }
  
  private void u()
  {
    Style localStyle1 = zaxi.A(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.z(this.f);
    r(localStyle2);
    Style localStyle3 = zaxi.y(this.f);
    q(localStyle3);
    Style localStyle4 = zaxi.B(this.f);
    i(localStyle4);
    Style localStyle5 = zaxi.C(this.f);
    k(localStyle5);
    Style localStyle6 = zaxi.D(this.f);
    s(localStyle6);
    Style localStyle7 = zaxi.H(this.f);
    a(localStyle7, localStyle7, localStyle7);
    Style localStyle8 = zaxi.E(this.f);
    int i1 = this.c.o - this.c.k;
    int i2 = 0;
    if (this.x > 0) {
      i2 = 1;
    }
    for (int i3 = i1; i3 < this.k; i3++)
    {
      localObject1 = new zdk();
      localObject2 = g(this.c.ad[i2][i3]);
      this.l[i2][i3] = zla.a((Style)localObject2, localStyle8, (zdk)localObject1, 22, this.l[i2][i3]);
      this.c.ad[i2][i3] = this.c.ac.a((Style)localObject2);
    }
    Style localStyle9 = zaxi.F(this.f);
    Object localObject1 = zaxi.G(this.f);
    Object localObject2 = localObject1;
    d(localStyle9, (Style)localObject1, (Style)localObject2);
    boolean bool = a(this.c.getRowFields());
    Style localStyle10 = zaxi.c(this.f, bool);
    Style localStyle11 = zaxi.d(this.f, bool);
    Style localStyle12 = localStyle10;
    e(localStyle10, localStyle11, localStyle12);
    Style localStyle13 = zaxi.I(this.f);
    l(localStyle13);
    Style localStyle14 = zaxi.N(this.f);
    v(localStyle14);
    if (bool)
    {
      localStyle15 = zaxi.cK(this.f);
      u(localStyle15);
    }
    Style localStyle15 = zaxi.e(this.f);
    b(localStyle15);
    Style localStyle16 = zaxi.J(this.f);
    Style localStyle17 = zaxi.K(this.f);
    Style localStyle18 = zaxi.L(this.f);
    b(localStyle16, localStyle17, localStyle18);
    Style localStyle19 = zaxi.M(this.f);
    y(localStyle19);
  }
  
  private void v()
  {
    Style localStyle1 = zaxi.O(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.P(this.f);
    o(localStyle2);
    Style localStyle3 = zaxi.Q(this.f);
    q(localStyle3);
    Style localStyle4 = zaxi.R(this.f);
    s(localStyle4);
    Style localStyle5 = zaxi.S(this.f);
    k(localStyle5);
    Style localStyle6 = zaxi.T(this.f);
    i(localStyle6);
    Style localStyle7 = zaxi.U(this.f);
    Style localStyle8 = localStyle7;
    Style localStyle9 = localStyle7;
    d(localStyle7, localStyle8, localStyle9);
    Style localStyle10 = zaxi.V(this.f);
    l(localStyle10);
    Style localStyle11 = zaxi.W(this.f);
    Style localStyle12 = zaxi.X(this.f);
    Style localStyle13 = localStyle12;
    b(localStyle11, localStyle12, localStyle13);
    Style localStyle14 = zaxi.b(this.f);
    f(localStyle14);
    Style localStyle15 = zaxi.a(this.f);
    g(localStyle15);
    Style localStyle16 = zaxi.a(this.f);
    d(localStyle16);
    Style localStyle17 = zaxi.ac(this.f);
    y(localStyle17);
    Style localStyle18 = zaxi.ah(this.f);
    v(localStyle18);
    Style localStyle19 = zaxi.ag(this.f);
    a(localStyle19, false);
    String str1 = this.c.n - this.c.i;
    Object localObject4;
    Style localStyle21;
    Object localObject5;
    Style localStyle22;
    Object localObject7;
    if (this.x >= 2)
    {
      str2 = this.c.o - this.c.k;
      int i1 = str2;
      int i2 = str2;
      int i5 = 1;
      while (i1 < this.k)
      {
        String str6 = (String)this.r.get(Integer.valueOf(i1 - str2));
        int i3;
        if ((str6 != null) && (str6.startsWith("columnsubtitle")))
        {
          localObject4 = a(zw.d(str6.substring("columnsubtitle".length()), '+'));
          if (localObject4[0] == 1) {
            if (i5 == 0)
            {
              i5 = 1;
            }
            else
            {
              i5 = 0;
              for (String str3 = i1 + 1; str3 < this.k; str3++)
              {
                str6 = (String)this.r.get(Integer.valueOf(str3 - str2));
                if (str6 != null)
                {
                  if ("columnsubtotal1".equals(str6)) {
                    break;
                  }
                  if (str6.startsWith("columnsubtitle"))
                  {
                    localObject4 = a(zw.d(str6.substring("columnsubtitle".length()), '+'));
                    if (localObject4[0] == 1) {
                      break;
                    }
                  }
                }
              }
              if (str3 == this.k) {
                i3 = this.k - 1;
              }
              localStyle21 = zaxi.Y(this.f);
              localObject5 = zaxi.Z(this.f);
              localStyle22 = zaxi.aa(this.f);
              Object localObject6 = null;
              for (localObject7 = i1; localObject7 < i3; localObject7++)
              {
                zdk localzdk2 = new zdk();
                Style localStyle23 = g(this.c.ad[1][localObject7]);
                this.l[1][localObject7] = zla.a(localStyle23, localStyle21, localzdk2, 3, this.l[1][localObject7]);
                this.c.ad[1][localObject7] = this.c.ac.a(localStyle23);
                str1 = this.c.n - this.c.i;
                str6 = (String)this.r.get(Integer.valueOf(localObject7 - str2));
                if ((str6 != null) && (str6.startsWith("columnsubtitle"))) {
                  localObject6 = localObject5;
                } else {
                  localObject6 = localStyle22;
                }
                for (String str7 = str1; str7 < this.j; str7++)
                {
                  String str8 = (String)this.p.get(Integer.valueOf(str7 - str1));
                  if ((str8 == null) || (!"blank".equals(str8)))
                  {
                    Style localStyle24 = g(this.c.ad[str7][localObject7]);
                    this.l[str7][localObject7] = zla.a(localStyle24, (Style)localObject6, localzdk2, 3, this.l[str7][localObject7]);
                    this.c.ad[str7][localObject7] = this.c.ac.a(localStyle24);
                  }
                }
              }
            }
          }
        }
        i3++;
        i1 = i3;
      }
    }
    str1 = this.c.n - this.c.i;
    Object localObject1;
    Object localObject2;
    for (String str2 = str1; str2 < this.j; str2++)
    {
      localObject1 = (String)this.p.get(Integer.valueOf(str2 - str1));
      if ((localObject1 != null) && (((String)localObject1).startsWith("rowsubtitle")))
      {
        int[] arrayOfInt = a(zw.d(((String)localObject1).substring("rowsubtitle".length()), '+'));
        int i6;
        if (arrayOfInt[0] == 1)
        {
          localObject2 = zaxi.ad(this.f);
          for (i6 = 0; i6 < this.k; i6++)
          {
            localObject4 = new zdk();
            ((zdk)localObject4).a = true;
            localStyle21 = g(this.c.ad[str2][i6]);
            this.l[str2][i6] = zla.a(localStyle21, (Style)localObject2, (zdk)localObject4, a, this.l[str2][i6]);
            this.c.ad[str2][i6] = this.c.ac.a(localStyle21);
          }
        }
        if (arrayOfInt[(arrayOfInt.length - 1)] == this.w)
        {
          localObject2 = zaxi.ae(this.f);
          for (i6 = this.c.o - this.c.k; i6 < this.k; i6++)
          {
            localObject4 = new zdk();
            b((zdk)localObject4, i6, this.c.o - this.c.k, this.k - 1);
            ((zdk)localObject4).b = true;
            localStyle21 = g(this.c.ad[str2][i6]);
            this.l[str2][i6] = zla.a(localStyle21, (Style)localObject2, (zdk)localObject4, 0, this.l[str2][i6]);
            this.c.ad[str2][i6] = this.c.ac.a(localStyle21);
          }
        }
      }
    }
    Object localObject3;
    Style localStyle20;
    if (this.x >= 3)
    {
      str2 = this.c.o - this.c.k;
      localObject1 = str2;
      int i4 = str2;
      while (localObject1 < this.k)
      {
        localObject2 = (String)this.r.get(Integer.valueOf(localObject1 - str2));
        if ((localObject2 != null) && (((String)localObject2).startsWith("columnsubtitle")))
        {
          localObject3 = a(zw.d(((String)localObject2).substring("columnsubtitle".length()), '+'));
          if ((localObject3[0] == 2) || ((localObject3.length >= 2) && (localObject3[1] == 2)))
          {
            for (String str4 = localObject1 + 1; str4 < this.k; str4++)
            {
              localObject2 = (String)this.r.get(Integer.valueOf(str4 - str2));
              if (localObject2 != null)
              {
                if ("columnsubtotal2".equals(localObject2)) {
                  break;
                }
                if (((String)localObject2).startsWith("columnsubtitle"))
                {
                  localObject3 = a(zw.d(((String)localObject2).substring("columnsubtitle".length()), '+'));
                  if ((localObject3[0] == 2) || ((localObject3.length >= 2) && (localObject3[1] == 2))) {
                    break;
                  }
                }
              }
            }
            if (str4 == this.k) {
              localStyle20 = this.k - 1;
            }
            localObject4 = zaxi.ab(this.f);
            for (localStyle21 = localObject1; localStyle21 < localStyle20; localStyle21++)
            {
              localObject5 = new zdk();
              ((zdk)localObject5).c = true;
              localStyle22 = g(this.c.ad[2][localStyle21]);
              this.l[1][localStyle21] = zla.a(localStyle22, (Style)localObject4, (zdk)localObject5, a, this.l[1][localStyle21]);
              this.c.ad[2][localStyle21] = this.c.ac.a(localStyle22);
              str1 = this.c.n - this.c.i;
              for (int i9 = str1; i9 < this.j; i9++)
              {
                localObject7 = g(this.c.ad[i9][localStyle21]);
                this.l[i9][localStyle21] = zla.a((Style)localObject7, (Style)localObject4, (zdk)localObject5, a, this.l[i9][localStyle21]);
                this.c.ad[i9][localStyle21] = this.c.ac.a((Style)localObject7);
              }
            }
          }
        }
        localStyle20++;
        localObject1 = localStyle20;
      }
    }
    if (this.w >= 3)
    {
      str2 = (this.w - 1) / 2;
      localObject1 = new ArrayList();
      localStyle20 = -1;
      for (String str5 = 0; str5 < str2; str5++)
      {
        localStyle20 += 2;
        zf.a((ArrayList)localObject1, Integer.valueOf(localStyle20));
      }
      for (str5 = str1; str5 < this.j; str5++)
      {
        localObject3 = (String)this.p.get(Integer.valueOf(str5 - str1));
        if ((localObject3 != null) && (((String)localObject3).startsWith("rowsubtitle")))
        {
          localObject4 = a(zw.d(((String)localObject3).substring("rowsubtitle".length()), '+'));
          int i7 = 0;
          for (int i8 = 0; i8 < localObject4.length; i8++)
          {
            i7 = 0;
            if (localObject4[i8] - 1 == 0) {
              i7 = 1;
            }
            if (((ArrayList)localObject1).contains(Integer.valueOf(localObject4[i8] - 1))) {
              i7 = 1;
            }
            if (i7 != 0)
            {
              localStyle22 = zaxi.af(this.f);
              zdk localzdk1 = new zdk();
              localzdk1.c = true;
              localObject7 = g(this.c.ad[str5][(localObject4[i8] - 1)]);
              this.l[str5][(localObject4[i8] - 1)] = zla.a((Style)localObject7, localStyle22, localzdk1, a, this.l[str5][(localObject4[i8] - 1)]);
              this.c.ad[str5][(localObject4[i8] - 1)] = this.c.ac.a((Style)localObject7);
            }
          }
        }
      }
    }
  }
  
  private void w()
  {
    Style localStyle1 = zaxi.ai(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.aj(this.f);
    o(localStyle2);
    Style localStyle3 = zaxi.c(this.f);
    q(localStyle3);
    Style localStyle4 = zaxi.ak(this.f);
    s(localStyle4);
    Style localStyle5 = zaxi.al(this.f);
    k(localStyle5);
    Style localStyle6 = zaxi.am(this.f);
    i(localStyle6);
    Style localStyle7 = zaxi.an(this.f);
    Style localStyle8 = localStyle7;
    Style localStyle9 = localStyle7;
    d(localStyle7, localStyle8, localStyle9);
    Style localStyle10 = null;
    Style localStyle11 = zaxi.av(this.f);
    Style localStyle12 = null;
    e(localStyle10, localStyle11, localStyle12);
    Style localStyle13 = zaxi.ao(this.f);
    l(localStyle13);
    Style localStyle14 = zaxi.ap(this.f);
    Style localStyle15 = zaxi.aq(this.f);
    Style localStyle16 = null;
    b(localStyle14, localStyle15, localStyle16);
    Style localStyle17 = zaxi.ar(this.f);
    t(localStyle17);
    Style localStyle18 = zaxi.r(this.f);
    h(localStyle18);
    Style localStyle19 = zaxi.as(this.f);
    y(localStyle19);
    Style localStyle20 = zaxi.au(this.f);
    v(localStyle20);
    Style localStyle21 = zaxi.at(this.f);
    a(localStyle21, false);
    int i1 = this.c.n - this.c.i;
    Object localObject1;
    Object localObject2;
    if (this.x >= 2)
    {
      i2 = this.c.o - this.c.k;
      int i3 = i2;
      int i4 = i2;
      int i5 = 0;
      Style localStyle23 = zaxi.ay(this.f);
      while (i3 < this.k)
      {
        localObject1 = (String)this.r.get(Integer.valueOf(i3 - i2));
        if ((localObject1 != null) && (((String)localObject1).startsWith("columnsubtitle")))
        {
          localObject2 = a(zw.d(((String)localObject1).substring("columnsubtitle".length()), '+'));
          if (localObject2[0] != 1)
          {
            a(localStyle23, i1, i3, false);
          }
          else if (i5 == 0)
          {
            a(localStyle23, i1, i3, true);
            i5 = 1;
          }
          else
          {
            i5 = 0;
            for (i4 = i3 + 1; i4 < this.k; i4++)
            {
              localObject1 = (String)this.r.get(Integer.valueOf(i4 - i2));
              if (localObject1 != null)
              {
                if ("columnsubtotal1".equals(localObject1)) {
                  break;
                }
                if (((String)localObject1).startsWith("columnsubtitle"))
                {
                  localObject2 = a(zw.d(((String)localObject1).substring("columnsubtitle".length()), '+'));
                  if (localObject2[0] == 1) {
                    break;
                  }
                }
              }
            }
            if (i4 == this.k) {
              i4 = this.k - 1;
            }
            Style localStyle24 = zaxi.aw(this.f);
            Style localStyle25 = zaxi.ax(this.f);
            Style localStyle26 = null;
            for (int i7 = i3; i7 < i4; i7++)
            {
              if (i7 == i3) {
                a(localStyle23, i1, i7, true);
              } else {
                a(localStyle23, i1, i7, false);
              }
              zdk localzdk = new zdk();
              Style localStyle27 = g(this.c.ad[1][i7]);
              this.l[1][i7] = zla.a(localStyle27, localStyle24, localzdk, 3, this.l[1][i7]);
              this.c.ad[1][i7] = this.c.ac.a(localStyle27);
              localObject1 = (String)this.r.get(Integer.valueOf(i7 - i2));
              if ((localObject1 != null) && (((String)localObject1).startsWith("columnsubtitle"))) {
                localStyle26 = localStyle25;
              } else {
                localStyle26 = localStyle24;
              }
              i1 = this.c.n - this.c.i;
              for (int i8 = i1; i8 < this.j; i8++)
              {
                String str2 = (String)this.p.get(Integer.valueOf(i8 - i1));
                if ((str2 == null) || ((!"blank".equals(str2)) && (!"rowsubtotal1".equals(str2))))
                {
                  Style localStyle28 = g(this.c.ad[i8][i7]);
                  this.l[i8][i7] = zla.a(localStyle28, localStyle26, localzdk, 3, this.l[i8][i7]);
                  this.c.ad[i8][i7] = this.c.ac.a(localStyle28);
                }
              }
            }
            a(localStyle23, i1, i4, false);
          }
        }
        else
        {
          a(localStyle23, i1, i3, false);
        }
        i4++;
        i3 = i4;
      }
    }
    for (int i2 = i1; i2 < this.j; i2++)
    {
      String str1 = (String)this.p.get(Integer.valueOf(i2 - i1));
      if ((str1 != null) && (str1.startsWith("rowsubtitle")))
      {
        int[] arrayOfInt = a(zw.d(str1.substring("rowsubtitle".length()), '+'));
        if (arrayOfInt[0] == 1)
        {
          Style localStyle22 = zaxi.az(this.f);
          for (int i6 = 0; i6 < this.k; i6++)
          {
            localObject1 = new zdk();
            ((zdk)localObject1).a = true;
            localObject2 = g(this.c.ad[i2][i6]);
            this.l[i2][i6] = zla.a((Style)localObject2, localStyle22, (zdk)localObject1, a, this.l[i2][i6]);
            this.c.ad[i2][i6] = this.c.ac.a((Style)localObject2);
          }
        }
      }
    }
  }
  
  private void x()
  {
    Style localStyle1 = zaxi.aA(this.f);
    o(localStyle1);
    Style localStyle2 = zaxi.aB(this.f);
    p(localStyle2);
    Style localStyle3 = zaxi.aC(this.f);
    s(localStyle3);
    Style localStyle4 = zaxi.aI(this.f);
    k(localStyle4);
    Style localStyle5 = zaxi.aJ(this.f);
    i(localStyle5);
    Style localStyle6 = zaxi.aD(this.f);
    Style localStyle7 = localStyle6;
    Style localStyle8 = localStyle6;
    a(localStyle6, localStyle7, localStyle8);
    Style localStyle9 = zaxi.aE(this.f);
    int i1 = this.c.o - this.c.k;
    int i2 = 0;
    if (this.x > 0) {
      i2 = 1;
    }
    for (int i3 = i1; i3 < this.k; i3++)
    {
      int i4 = 0;
      localObject1 = (String)this.r.get(Integer.valueOf(i3 - i1));
      if (localObject1 != null) {
        if (((String)localObject1).startsWith("columnsubtitle"))
        {
          localObject2 = a(zw.d(((String)localObject1).substring("columnsubtitle".length()), '+'));
          if (localObject2[0] == 1) {
            i4 = 1;
          }
        }
        else if ("columnsubtotal1".equals(localObject1))
        {
          i4 = 1;
        }
        else if ("grandtotalcolumn".equals(localObject1))
        {
          i4 = 1;
        }
      }
      if (i4 != 0)
      {
        localObject2 = new zdk();
        localStyle12 = g(this.c.ad[i2][i3]);
        this.l[i2][i3] = zla.a(localStyle12, localStyle9, (zdk)localObject2, 22, this.l[i2][i3]);
        this.c.ad[i2][i3] = this.c.ac.a(localStyle12);
      }
    }
    Style localStyle10 = zaxi.aF(this.f);
    Style localStyle11 = zaxi.aG(this.f);
    Object localObject1 = localStyle11;
    d(localStyle10, localStyle11, (Style)localObject1);
    Object localObject2 = zaxi.aH(this.f);
    m((Style)localObject2);
    Style localStyle12 = zaxi.aK(this.f);
    e(localStyle12, null, null);
    if (this.w > 1)
    {
      i1 = this.c.o - 1 - this.c.k;
      i2 = this.c.n - this.c.i - 1;
      localStyle13 = zaxi.aP(this.f);
      for (int i5 = i1; i5 < this.k; i5++)
      {
        localObject3 = new zdk();
        ((zdk)localObject3).b = true;
        localStyle15 = g(this.c.ad[i2][i5]);
        this.l[i2][i5] = zla.a(localStyle15, localStyle13, (zdk)localObject3, 22, this.l[i2][i5]);
        this.c.ad[i2][i5] = this.c.ac.a(localStyle15);
      }
    }
    Style localStyle13 = zaxi.a(this.f);
    g(localStyle13);
    Style localStyle14 = zaxi.a(this.f);
    d(localStyle14);
    Object localObject3 = zaxi.aL(this.f);
    b((Style)localObject3, null, null);
    Style localStyle15 = zaxi.aM(this.f);
    c(null, localStyle15, localStyle15);
    i1 = this.c.o - this.c.k;
    int i6 = this.c.n - this.c.i;
    Style localStyle16 = zaxi.a(this.f, 1);
    Style localStyle17 = zaxi.a(this.f, 2);
    Style localStyle18 = zaxi.a(this.f, 5);
    a(localStyle16, i6, i1, true);
    if (this.x > 1) {
      for (int i7 = i1; i7 < this.k; i7++)
      {
        localObject4 = (String)this.r.get(Integer.valueOf(i7 - i1));
        if ((localObject4 != null) && (((String)localObject4).startsWith("columnsubtitle")))
        {
          int[] arrayOfInt = a(zw.d(((String)localObject4).substring("columnsubtitle".length()), '+'));
          if (arrayOfInt[0] == 1) {
            a(localStyle17, 1, i7, true);
          }
          if ((arrayOfInt[0] == 2) || ((arrayOfInt.length >= 2) && (arrayOfInt[1] == 2))) {
            a(localStyle18, 2, i7, true);
          }
        }
      }
    }
    Style localStyle19 = zaxi.aN(this.f);
    v(localStyle19);
    Object localObject4 = zaxi.aO(this.f);
    y((Style)localObject4);
  }
  
  private void y()
  {
    Style localStyle1 = zaxi.aQ(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.aR(this.f);
    o(localStyle2);
    p(localStyle2);
    Style localStyle3 = zaxi.aS(this.f);
    q(localStyle3);
    Style localStyle4 = zaxi.aT(this.f);
    s(localStyle4);
    Style localStyle5 = zaxi.aU(this.f);
    k(localStyle5);
    Style localStyle6 = zaxi.aV(this.f);
    i(localStyle6);
    Style localStyle7 = zaxi.aW(this.f);
    int i1 = this.c.o - this.c.k;
    int i2 = 0;
    if (this.x > 0) {
      i2 = 1;
    }
    for (int i3 = i1; i3 < this.k; i3++)
    {
      localObject = new zdk();
      localStyle9 = g(this.c.ad[i2][i3]);
      this.l[i2][i3] = zla.a(localStyle9, localStyle7, (zdk)localObject, 22, this.l[i2][i3]);
      this.c.ad[i2][i3] = this.c.ac.a(localStyle9);
    }
    Style localStyle8 = zaxi.aX(this.f);
    a(localStyle8, localStyle8, localStyle8);
    Object localObject = zaxi.aY(this.f);
    a((Style)localObject, true);
    Style localStyle9 = zaxi.aZ(this.f);
    e(localStyle9, localStyle9, localStyle9);
    Style localStyle10 = zaxi.ba(this.f);
    Style localStyle11 = zaxi.bb(this.f);
    b(localStyle10, localStyle11, localStyle11);
    boolean bool = a(this.c.getRowFields());
    if (bool)
    {
      localStyle12 = zaxi.cK(this.f);
      u(localStyle12);
    }
    Style localStyle12 = zaxi.bg(this.f);
    t(localStyle12);
    Style localStyle13 = zaxi.bd(this.f);
    y(localStyle13);
    Style localStyle14 = zaxi.bc(this.f);
    v(localStyle14);
    if (this.x > 1)
    {
      Style localStyle15 = zaxi.be(this.f);
      Style localStyle16 = zaxi.bf(this.f);
      i1 = this.c.o - this.c.k;
      for (int i4 = i1; i4 < this.k; i4++)
      {
        String str = (String)this.r.get(Integer.valueOf(i4 - i1));
        if (str != null) {
          if (str.startsWith("columnsubtitle"))
          {
            int[] arrayOfInt = a(zw.d(str.substring("columnsubtitle".length()), '+'));
            if (arrayOfInt[0] == 1) {
              a(localStyle15, 1, i4, true);
            }
          }
          else if ("grandtotalcolumn".equals(str))
          {
            a(localStyle15, 1, i4, true);
          }
          else if ("columnsubtotal1".equals(str))
          {
            a(localStyle16, 1, i4, true);
          }
        }
      }
    }
  }
  
  private void z()
  {
    Style localStyle1 = zaxi.bh(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.bi(this.f);
    s(localStyle2);
    Style localStyle3 = zaxi.bj(this.f);
    k(localStyle3);
    Style localStyle4 = zaxi.bk(this.f);
    i(localStyle4);
    if (this.x >= 2)
    {
      localStyle5 = zaxi.bl(this.f);
      int i1 = this.c.o - this.c.k;
      int i2 = 1;
      for (int i3 = i1; i3 < this.k; i3++)
      {
        localObject1 = (String)this.r.get(Integer.valueOf(i3 - i1));
        if ((localObject1 == null) || ((!"columnsubtotal1".equals(localObject1)) && (!"grandtotalcolumn".equals(localObject1))))
        {
          zdk localzdk1 = new zdk();
          localStyle9 = g(this.c.ad[i2][i3]);
          this.l[i2][i3] = zla.a(localStyle9, localStyle5, localzdk1, 22, this.l[i2][i3]);
          this.c.ad[i2][i3] = this.c.ac.a(localStyle9);
        }
      }
    }
    Style localStyle5 = zaxi.bm(this.f);
    d(localStyle5, localStyle5, localStyle5);
    Style localStyle6 = zaxi.bn(this.f);
    m(localStyle6);
    Style localStyle7 = zaxi.bo(this.f);
    Style localStyle8 = zaxi.bp(this.f);
    Object localObject1 = zaxi.bq(this.f);
    b(localStyle7, localStyle8, (Style)localObject1);
    boolean bool = a(this.c.getRowFields());
    Style localStyle9 = zaxi.e(this.f, bool);
    Style localStyle10 = zaxi.f(this.f, bool);
    e(localStyle9, localStyle9, localStyle10);
    Style localStyle11 = zaxi.b(this.f);
    f(localStyle11);
    Style localStyle12 = zaxi.bu(this.f);
    y(localStyle12);
    Style localStyle13 = zaxi.bt(this.f);
    b(localStyle13, false);
    Style localStyle14 = zaxi.bs(this.f);
    v(localStyle14);
    Style localStyle15 = zaxi.br(this.f);
    a(localStyle15, false);
    Style localStyle16 = zaxi.bv(this.f);
    if (this.w > 1) {
      a(localStyle16, this.c.n - this.c.i, 0, true);
    }
    if (this.x > 1)
    {
      int i4 = this.c.o - this.c.k;
      for (int i5 = i4; i5 < this.k; i5++)
      {
        String str1 = (String)this.r.get(Integer.valueOf(i5 - i4));
        if (str1 != null) {
          if (str1.startsWith("columnsubtitle"))
          {
            arrayOfInt2 = a(zw.d(str1.substring("columnsubtitle".length()), '+'));
            if (arrayOfInt2[0] == 1) {
              a(localStyle16, 1, i5, true);
            }
          }
          else if ("columnsubtotal1".equals(str1))
          {
            a(localStyle16, 1, i5, true);
          }
        }
      }
    }
    Style localStyle17 = zaxi.bz(this.f);
    t(localStyle17);
    if (bool)
    {
      localStyle18 = zaxi.cK(this.f);
      u(localStyle18);
    }
    Style localStyle18 = zaxi.bw(this.f);
    e(localStyle18);
    int[] arrayOfInt1 = this.c.n - this.c.i;
    Object localObject2;
    int i8;
    Object localObject3;
    for (int[] arrayOfInt2 = arrayOfInt1; arrayOfInt2 < this.j; arrayOfInt2++)
    {
      String str2 = (String)this.p.get(Integer.valueOf(arrayOfInt2 - arrayOfInt1));
      if ((str2 != null) && (str2.startsWith("rowsubtitle")))
      {
        localObject2 = a(zw.d(str2.substring("rowsubtitle".length()), '+'));
        if ((localObject2[0] == 1) && (this.w > 1) && (localObject2[(localObject2.length - 1)] == this.w))
        {
          Style localStyle19 = zaxi.bx(this.f);
          i8 = this.c.o - 1 - this.c.k;
          localObject3 = new zdk();
          ((zdk)localObject3).c = true;
          Style localStyle20 = g(this.c.ad[arrayOfInt2][i8]);
          this.l[arrayOfInt2][i8] = zla.a(localStyle20, localStyle19, (zdk)localObject3, a, this.l[arrayOfInt2][i8]);
          this.c.ad[arrayOfInt2][i8] = this.c.ac.a(localStyle20);
        }
      }
    }
    if ((this.w > 2) && (this.x > 2))
    {
      arrayOfInt1 = this.c.n - this.c.i;
      int i6 = this.c.o - this.c.k;
      localStyle16 = zaxi.by(this.f);
      for (int[] arrayOfInt3 = arrayOfInt1; arrayOfInt3 < this.j; arrayOfInt3++)
      {
        localObject2 = (String)this.p.get(Integer.valueOf(arrayOfInt3 - arrayOfInt1));
        if ((localObject2 != null) && (((String)localObject2).startsWith("rowsubtotal")))
        {
          int i7 = zp.a(((String)localObject2).substring("rowsubtotal".length()));
          if (i7 != 1) {
            for (i8 = i6; i8 < this.k; i8++)
            {
              localObject3 = (String)this.r.get(Integer.valueOf(i8 - i6));
              if ((localObject3 != null) && (((String)localObject3).startsWith("columnsubtotal")))
              {
                int i9 = zp.a(((String)localObject3).substring("columnsubtotal".length()));
                if (i9 != 1)
                {
                  zdk localzdk2 = new zdk();
                  localzdk2.c = true;
                  Style localStyle21 = g(this.c.ad[arrayOfInt3][i8]);
                  this.l[arrayOfInt3][i8] = zla.a(localStyle21, localStyle16, localzdk2, a, this.l[arrayOfInt3][i8]);
                  this.c.ad[arrayOfInt3][i8] = this.c.ac.a(localStyle21);
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void A()
  {
    Style localStyle1 = zaxi.bA(this.f);
    o(localStyle1);
    p(localStyle1);
    int i1 = this.c.n - this.c.i;
    int i2 = this.c.o - this.c.k;
    Style localStyle2 = zaxi.bM(this.f);
    a(localStyle2, i1, i2, true);
    a(localStyle2, i1, 0, true);
    Style localStyle3 = zaxi.bB(this.f);
    k(localStyle3);
    Style localStyle4 = zaxi.bC(this.f);
    if (this.x == 1) {
      localStyle4 = zaxi.bD(this.f);
    }
    Style localStyle5 = zaxi.bE(this.f);
    d(localStyle4, localStyle5, localStyle5);
    Style localStyle6 = zaxi.bF(this.f);
    a(localStyle6, true);
    Style localStyle7 = zaxi.bG(this.f);
    a(localStyle7, localStyle7, localStyle7);
    Style localStyle8 = zaxi.bH(this.f);
    Style localStyle9 = zaxi.bI(this.f);
    b(localStyle8, localStyle9, localStyle9);
    boolean bool = a(this.c.getRowFields());
    Style localStyle10 = zaxi.g(this.f, bool);
    e(localStyle10, localStyle10, localStyle10);
    Style localStyle11 = zaxi.bQ(this.f);
    t(localStyle11);
    Style localStyle12 = zaxi.b(this.f);
    f(localStyle12);
    Style localStyle13 = zaxi.bJ(this.f);
    y(localStyle13);
    Style localStyle14 = zaxi.bL(this.f);
    v(localStyle14);
    Style localStyle15 = zaxi.bK(this.f);
    w(localStyle15);
    Style localStyle16;
    if (bool)
    {
      localStyle16 = zaxi.cK(this.f);
      u(localStyle16);
    }
    if (this.x > 1)
    {
      localStyle2 = zaxi.bN(this.f);
      localStyle16 = zaxi.bO(this.f);
      Style localStyle17 = zaxi.bP(this.f);
      int i3 = this.c.n - this.c.i;
      if (this.x > 1)
      {
        i2 = this.c.o - this.c.k;
        for (int i4 = i2; i4 < this.k; i4++)
        {
          String str = (String)this.r.get(Integer.valueOf(i4 - i2));
          if (str != null) {
            if (str.startsWith("columnsubtitle"))
            {
              int[] arrayOfInt = a(zw.d(str.substring("columnsubtitle".length()), '+'));
              if (arrayOfInt[0] == 1) {
                a(localStyle2, 1, i4, true);
              }
              Style localStyle18 = null;
              zdk localzdk;
              if ((this.x >= 3) && (arrayOfInt[1] == 2))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[2][i4]);
                this.l[2][i4] = zla.a(localStyle18, localStyle16, localzdk, a, this.l[2][i4]);
                this.c.ad[2][i4] = this.c.ac.a(localStyle18);
              }
              if ((this.x >= 4) && ((arrayOfInt[2] == 3) || (arrayOfInt[1] == 3)))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[3][i4]);
                this.l[3][i4] = zla.a(localStyle18, localStyle17, localzdk, a, this.l[3][i4]);
                this.c.ad[3][i4] = this.c.ac.a(localStyle18);
              }
              if ((this.x >= 3) && (arrayOfInt[0] == 2))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[2][i4]);
                this.l[2][i4] = zla.a(localStyle18, localStyle16, localzdk, a, this.l[2][i4]);
                this.c.ad[2][i4] = this.c.ac.a(localStyle18);
                a(localStyle16, i3, i4, true);
              }
              if ((this.x >= 4) && (arrayOfInt[0] == 3))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[3][i4]);
                this.l[3][i4] = zla.a(localStyle18, localStyle17, localzdk, a, this.l[3][i4]);
                this.c.ad[3][i4] = this.c.ac.a(localStyle18);
                a(localStyle17, i3, i4, true);
              }
            }
            else if ("columnsubtotal1".equals(str))
            {
              a(localStyle2, 1, i4, true);
            }
          }
        }
      }
    }
  }
  
  private void B()
  {
    Style localStyle1 = zaxi.bR(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.f(this.f);
    r(localStyle2);
    Style localStyle3 = zaxi.bS(this.f);
    s(localStyle3);
    Style localStyle4 = zaxi.bT(this.f);
    k(localStyle4);
    Style localStyle5 = zaxi.bU(this.f);
    i(localStyle5);
    int i1 = this.c.o - this.c.k;
    if (this.x >= 2)
    {
      localStyle6 = zaxi.bV(this.f);
      int i2 = 1;
      for (int i3 = i1; i3 < this.k; i3++)
      {
        localObject1 = (String)this.r.get(Integer.valueOf(i3 - i1));
        if ((localObject1 != null) && (((String)localObject1).startsWith("columnsubtitle")))
        {
          localObject2 = a(zw.d(((String)localObject1).substring("columnsubtitle".length()), '+'));
          if (localObject2[0] == 1)
          {
            zdk localzdk1 = new zdk();
            localStyle9 = g(this.c.ad[i2][i3]);
            this.l[i2][i3] = zla.a(localStyle9, localStyle6, localzdk1, 22, this.l[i2][i3]);
            this.c.ad[i2][i3] = this.c.ac.a(localStyle9);
          }
        }
      }
    }
    Style localStyle6 = zaxi.bW(this.f);
    Style localStyle7 = zaxi.bX(this.f);
    d(localStyle6, localStyle7, localStyle7);
    Style localStyle8 = zaxi.ci(this.f);
    t(localStyle8);
    Object localObject1 = zaxi.bY(this.f);
    m((Style)localObject1);
    Object localObject2 = zaxi.bZ(this.f);
    a((Style)localObject2, (Style)localObject2, (Style)localObject2);
    int i4 = this.c.n - this.c.i;
    i1 = this.c.o - this.c.k;
    Style localStyle9 = zaxi.ca(this.f);
    a(localStyle9, i4, i1, true);
    a(localStyle9, i4, 0, true);
    Style localStyle10 = zaxi.cb(this.f);
    Style localStyle11 = zaxi.cc(this.f);
    Style localStyle12 = zaxi.cd(this.f);
    b(localStyle10, localStyle11, localStyle12);
    boolean bool = a(this.c.getRowFields());
    Style localStyle13 = zaxi.h(this.f, bool);
    Style localStyle14 = zaxi.i(this.f, bool);
    e(localStyle13, localStyle14, localStyle14);
    if (bool)
    {
      localStyle15 = zaxi.cK(this.f);
      u(localStyle15);
    }
    Style localStyle15 = zaxi.b(this.f);
    f(localStyle15);
    Style localStyle16 = zaxi.cg(this.f);
    y(localStyle16);
    Style localStyle17 = zaxi.cf(this.f);
    v(localStyle17);
    Style localStyle18 = zaxi.ce(this.f);
    a(localStyle18, false);
    if (this.x > 1)
    {
      Style localStyle19 = zaxi.ch(this.f);
      i1 = this.c.o - this.c.k;
      for (int i5 = i1; i5 < this.k; i5++)
      {
        String str = (String)this.r.get(Integer.valueOf(i5 - i1));
        if (str != null) {
          if (str.startsWith("columnsubtitle"))
          {
            int[] arrayOfInt = a(zw.d(str.substring("columnsubtitle".length()), '+'));
            if (arrayOfInt[0] != this.x)
            {
              a(localStyle19, arrayOfInt[0], i5, true);
            }
            else
            {
              zdk localzdk2 = new zdk();
              localzdk2.c = true;
              Style localStyle20 = g(this.c.ad[arrayOfInt[0]][i5]);
              this.l[arrayOfInt[0]][i5] = zla.a(localStyle20, localStyle19, localzdk2, a, this.l[arrayOfInt[0]][i5]);
              this.c.ad[arrayOfInt[0]][i5] = this.c.ac.a(localStyle20);
            }
          }
          else if ("columnsubtotal1".equals(str))
          {
            a(localStyle19, 1, i5, true);
          }
        }
      }
    }
  }
  
  private void C()
  {
    Style localStyle1 = zaxi.cj(this.f);
    o(localStyle1);
    p(localStyle1);
    Style localStyle2 = zaxi.ck(this.f);
    s(localStyle2);
    Style localStyle3 = zaxi.cl(this.f);
    k(localStyle3);
    Style localStyle4 = zaxi.cm(this.f);
    i(localStyle4);
    Style localStyle5 = zaxi.cn(this.f);
    int i1 = this.c.o - this.c.k;
    int i2 = 0;
    if (this.x > 0) {
      i2 = 1;
    }
    for (int i3 = i1; i3 < this.k; i3++)
    {
      localObject = new zdk();
      localStyle7 = g(this.c.ad[i2][i3]);
      this.l[i2][i3] = zla.a(localStyle7, localStyle5, (zdk)localObject, 22, this.l[i2][i3]);
      this.c.ad[i2][i3] = this.c.ac.a(localStyle7);
    }
    Style localStyle6 = zaxi.co(this.f);
    d(localStyle6, localStyle6, localStyle6);
    Object localObject = zaxi.cp(this.f);
    t((Style)localObject);
    Style localStyle7 = zaxi.cq(this.f);
    m(localStyle7);
    Style localStyle8 = zaxi.cr(this.f);
    a(localStyle8, localStyle8, localStyle8);
    int i4 = this.c.n - this.c.i;
    i1 = this.c.o - this.c.k;
    Style localStyle9 = zaxi.cs(this.f);
    a(localStyle9, i4, i1, true);
    a(localStyle9, i4, 0, true);
    Style localStyle10 = zaxi.ct(this.f);
    Style localStyle11 = zaxi.cu(this.f);
    b(localStyle10, localStyle11, localStyle11);
    boolean bool = a(this.c.getRowFields());
    Style localStyle12 = zaxi.j(this.f, bool);
    e(localStyle12, localStyle12, localStyle12);
    if (bool)
    {
      localStyle13 = zaxi.cK(this.f);
      u(localStyle13);
    }
    Style localStyle13 = zaxi.b(this.f);
    f(localStyle13);
    Style localStyle14 = zaxi.cv(this.f);
    y(localStyle14);
    Style localStyle15 = zaxi.cw(this.f);
    v(localStyle15);
    if (this.x > 1)
    {
      localStyle9 = zaxi.cs(this.f);
      Style localStyle16 = zaxi.cx(this.f);
      Style localStyle17 = zaxi.cy(this.f);
      i2 = this.c.n - this.c.i;
      if (this.x > 1)
      {
        i1 = this.c.o - this.c.k;
        for (int i5 = i1; i5 < this.k; i5++)
        {
          String str = (String)this.r.get(Integer.valueOf(i5 - i1));
          if (str != null) {
            if (str.startsWith("columnsubtitle"))
            {
              int[] arrayOfInt = a(zw.d(str.substring("columnsubtitle".length()), '+'));
              if (arrayOfInt[0] == 1) {
                a(localStyle9, 1, i5, true);
              }
              Style localStyle18 = null;
              zdk localzdk;
              if ((this.x >= 3) && (arrayOfInt[1] == 2))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[2][i5]);
                this.l[2][i5] = zla.a(localStyle18, localStyle16, localzdk, a, this.l[2][i5]);
                this.c.ad[2][i5] = this.c.ac.a(localStyle18);
              }
              if ((this.x >= 4) && ((arrayOfInt[2] == 3) || (arrayOfInt[1] == 3)))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[3][i5]);
                this.l[3][i5] = zla.a(localStyle18, localStyle17, localzdk, a, this.l[3][i5]);
                this.c.ad[3][i5] = this.c.ac.a(localStyle18);
              }
              if ((this.x >= 3) && (arrayOfInt[0] == 2))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[2][i5]);
                this.l[2][i5] = zla.a(localStyle18, localStyle16, localzdk, a, this.l[2][i5]);
                this.c.ad[2][i5] = this.c.ac.a(localStyle18);
                a(localStyle16, i2, i5, true);
              }
              if ((this.x >= 4) && (arrayOfInt[0] == 3))
              {
                localzdk = new zdk();
                localzdk.c = true;
                localStyle18 = g(this.c.ad[3][i5]);
                this.l[3][i5] = zla.a(localStyle18, localStyle17, localzdk, a, this.l[3][i5]);
                this.c.ad[3][i5] = this.c.ac.a(localStyle18);
                a(localStyle17, i2, i5, true);
              }
            }
            else if ("columnsubtotal1".equals(str))
            {
              a(localStyle9, 1, i5, true);
            }
          }
        }
      }
    }
  }
  
  private void D()
  {
    Style localStyle1 = zaxi.cz(this.f);
    n(localStyle1);
    Style localStyle2 = zaxi.cA(this.f);
    o(localStyle2);
    Style localStyle3 = zaxi.cB(this.f);
    s(localStyle3);
    Style localStyle4 = zaxi.d(this.f);
    r(localStyle4);
    Style localStyle5 = zaxi.c(this.f);
    q(localStyle5);
    Style localStyle6 = zaxi.cC(this.f);
    k(localStyle6);
    Style localStyle7 = zaxi.cD(this.f);
    i(localStyle7);
    Style localStyle8 = zaxi.cE(this.f);
    d(localStyle8, localStyle8, localStyle8);
    Style localStyle9 = zaxi.cF(this.f);
    t(localStyle9);
    Style localStyle10 = zaxi.cG(this.f);
    a(localStyle10, localStyle10, localStyle10);
    Style localStyle11 = zaxi.cH(this.f);
    b(localStyle11, localStyle11, localStyle11);
    boolean bool = a(this.c.getRowFields());
    Style localStyle12 = zaxi.k(this.f, bool);
    e(localStyle12, localStyle12, localStyle12);
    if (bool)
    {
      localStyle13 = zaxi.cK(this.f);
      u(localStyle13);
    }
    Style localStyle13 = zaxi.cI(this.f);
    y(localStyle13);
    Style localStyle14 = zaxi.cJ(this.f);
    v(localStyle14);
    Style localStyle15 = zaxi.e(this.f);
    b(localStyle15);
  }
  
  private void E()
  {
    Style localStyle = zaxi.cL(this.f);
    o(localStyle);
    p(localStyle);
  }
  
  private void b(Style paramStyle)
  {
    if (this.x > 1)
    {
      int i1 = this.c.o - this.c.k;
      for (int i2 = i1; i2 < this.k; i2++)
      {
        String str = (String)this.r.get(Integer.valueOf(i2 - i1));
        if ((str != null) && (str.startsWith("columnsubtitle")))
        {
          int[] arrayOfInt = a(zw.d(str.substring("columnsubtitle".length()), '+'));
          if (arrayOfInt[0] == 1) {
            a(paramStyle, 1, i2, true);
          }
        }
      }
    }
  }
  
  private void c(Style paramStyle)
  {
    zdk localzdk = new zdk();
    localzdk.a = true;
    localzdk.b = true;
    localzdk.c = true;
    localzdk.d = true;
    Style localStyle = g(this.c.ad[0][(this.k - 1)]);
    this.l[0][(this.k - 1)] = zla.a(localStyle, paramStyle, localzdk, a, this.l[0][(this.k - 1)]);
    this.c.ad[0][(this.k - 1)] = this.c.ac.a(localStyle);
  }
  
  private void d(Style paramStyle)
  {
    if (this.w > 0)
    {
      int i1 = this.c.o - 1 - this.c.k;
      int i2 = this.c.n - this.c.i;
      for (int i3 = i2; i3 < this.k; i3++)
      {
        String str = (String)this.p.get(Integer.valueOf(i3 - i2));
        if ((str != null) && (str.startsWith("rowsubtitle")))
        {
          int[] arrayOfInt = a(zw.d(str.substring("rowsubtitle".length()), '+'));
          if (arrayOfInt[(arrayOfInt.length - 1)] == this.w)
          {
            zdk localzdk = new zdk();
            Style localStyle = g(this.c.ad[i3][i1]);
            this.l[i3][i1] = zla.a(localStyle, paramStyle, localzdk, a, this.l[i3][i1]);
            this.c.ad[i3][i1] = this.c.ac.a(localStyle);
          }
        }
      }
    }
  }
  
  private void e(Style paramStyle)
  {
    if (this.w > 1)
    {
      int i1 = this.c.n - this.c.i;
      for (int i2 = i1; i2 < this.j; i2++)
      {
        String str = (String)this.p.get(Integer.valueOf(i2 - i1));
        if ((str != null) && (str.startsWith("rowsubtitle")))
        {
          int[] arrayOfInt = a(zw.d(str.substring("rowsubtitle".length()), '+'));
          if (arrayOfInt[0] == 1) {
            for (int i3 = 0; i3 < this.k; i3++)
            {
              zdk localzdk = new zdk();
              localzdk.a = true;
              Style localStyle = g(this.c.ad[i2][i3]);
              this.l[i2][i3] = zla.a(localStyle, paramStyle, localzdk, a, this.l[i2][i3]);
              this.c.ad[i2][i3] = this.c.ac.a(localStyle);
            }
          }
        }
      }
    }
  }
  
  private void f(Style paramStyle)
  {
    int i1 = this.c.o - this.c.k;
    int i2 = this.c.n - this.c.i;
    for (int i3 = i1; i3 < this.k; i3++)
    {
      String str = (String)this.r.get(Integer.valueOf(i3 - i1));
      if ((str != null) && (str.startsWith("columnsubtitle"))) {
        for (int i4 = i2; i4 < this.j; i4++)
        {
          zdk localzdk = new zdk();
          Style localStyle = g(this.c.ad[i4][i3]);
          this.l[i4][i3] = zla.a(localStyle, paramStyle, localzdk, a, this.l[i4][i3]);
          this.c.ad[i4][i3] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void g(Style paramStyle)
  {
    int i1 = this.c.o - this.c.k;
    int i2 = this.c.n - this.c.i;
    for (int i3 = i1; i3 < this.k; i3++) {
      for (int i4 = i2; i4 < this.j; i4++)
      {
        String str = (String)this.p.get(Integer.valueOf(i4 - i2));
        if ((str == null) || ((!str.startsWith("rowsubtotal")) && (!"grandtotalrow".equals(str))))
        {
          zdk localzdk = new zdk();
          Style localStyle = g(this.c.ad[i4][i3]);
          this.l[i4][i3] = zla.a(localStyle, paramStyle, localzdk, a, this.l[i4][i3]);
          this.c.ad[i4][i3] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void a(Style paramStyle, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = this.j - 1;
    if ((!paramBoolean) && (this.c.getColumnGrand())) {
      if (this.s == 1)
      {
        if (this.w > 1) {
          i1 -= this.y;
        }
      }
      else {
        i1--;
      }
    }
    for (int i2 = paramInt1; i2 <= i1; i2++)
    {
      zdk localzdk = new zdk();
      localzdk.c = true;
      Style localStyle = g(this.c.ad[i2][paramInt2]);
      this.l[i2][paramInt2] = zla.a(localStyle, paramStyle, localzdk, a, this.l[i2][paramInt2]);
      this.c.ad[i2][paramInt2] = this.c.ac.a(localStyle);
    }
  }
  
  private boolean a(PivotFieldCollection paramPivotFieldCollection)
  {
    for (int i1 = 0; i1 < paramPivotFieldCollection.getCount(); i1++) {
      if (paramPivotFieldCollection.get(i1).getShowInOutlineForm()) {
        return false;
      }
    }
    return true;
  }
  
  private int a(int paramInt)
  {
    if (this.z == this.c.getPageFieldWrapCount()) {
      return paramInt - 1;
    }
    int i1 = 0;
    int i2 = paramInt % this.c.getPageFieldWrapCount() != 0 ? 1 : 0;
    int i3 = paramInt / this.c.getPageFieldWrapCount();
    if (this.c.getPageFieldOrder() == 0)
    {
      if (i2 != 0) {
        i1 = i3 * this.c.getPageFieldWrapCount() + paramInt % this.c.getPageFieldWrapCount() - 1;
      } else {
        i1 = -1;
      }
    }
    else if (i3 == 0) {
      i1 = -1;
    } else {
      i1 = paramInt - this.c.getPageFieldWrapCount();
    }
    return i1;
  }
  
  private void a(int[][] paramArrayOfInt1, int[][] paramArrayOfInt2, int paramInt1, int paramInt2)
  {
    Style localStyle1 = null;
    Style localStyle2 = null;
    int i1 = -1;
    int i3;
    for (int i2 = 1; i2 < paramInt1; i2++)
    {
      i1 = a(i2);
      if (i1 != -1) {
        for (i3 = 0; i3 < paramInt2; i3++)
        {
          localStyle1 = g(paramArrayOfInt1[i2][i3]);
          if ((localStyle1.isModified(4)) && (zla.a(paramArrayOfInt2[i2][i3], 4) > zla.a(paramArrayOfInt2[i1][i3], 8)))
          {
            localStyle2 = g(paramArrayOfInt1[i1][i3]);
            localStyle2.getBorders().getByBorderType(8).a(localStyle1.getBorders().getByBorderType(4));
            localStyle2.b(5);
            paramArrayOfInt1[i1][i3] = this.c.ac.a(localStyle2);
          }
          localStyle1 = g(paramArrayOfInt1[i1][i3]);
          if ((localStyle1.isModified(5)) && (zla.a(paramArrayOfInt2[i1][i3], 8) > zla.a(paramArrayOfInt2[i2][i3], 4)))
          {
            localStyle2 = g(paramArrayOfInt1[i2][i3]);
            localStyle2.getBorders().getByBorderType(4).a(localStyle1.getBorders().getByBorderType(8));
            localStyle2.b(4);
            paramArrayOfInt1[i2][i3] = this.c.ac.a(localStyle2);
          }
        }
      }
    }
    for (i2 = 0; i2 < paramInt1; i2++) {
      for (i3 = 1; i3 < paramInt2; i3++)
      {
        localStyle1 = g(paramArrayOfInt1[i2][i3]);
        if ((localStyle1.isModified(2)) && (zla.a(paramArrayOfInt2[i2][i3], 1) > zla.a(paramArrayOfInt2[i2][(i3 - 1)], 2)))
        {
          localStyle2 = g(paramArrayOfInt1[i2][(i3 - 1)]);
          localStyle2.getBorders().getByBorderType(2).a(localStyle1.getBorders().getByBorderType(1));
          localStyle2.b(3);
          paramArrayOfInt1[i2][(i3 - 1)] = this.c.ac.a(localStyle2);
        }
        localStyle1 = g(paramArrayOfInt1[i2][(i3 - 1)]);
        if ((localStyle1.isModified(3)) && (zla.a(paramArrayOfInt2[i2][(i3 - 1)], 2) > zla.a(paramArrayOfInt2[i2][i3], 1)))
        {
          localStyle2 = g(paramArrayOfInt1[i2][i3]);
          localStyle2.getBorders().getByBorderType(1).a(localStyle1.getBorders().getByBorderType(2));
          localStyle2.b(2);
          paramArrayOfInt1[i2][i3] = this.c.ac.a(localStyle2);
        }
      }
    }
  }
  
  private void b(int[][] paramArrayOfInt1, int[][] paramArrayOfInt2, int paramInt1, int paramInt2)
  {
    Style localStyle1 = null;
    Style localStyle2 = null;
    int i2;
    for (int i1 = 1; i1 < paramInt1; i1++) {
      for (i2 = 0; i2 < paramInt2; i2++)
      {
        localStyle1 = g(paramArrayOfInt1[i1][i2]);
        if ((localStyle1.isModified(4)) && (zla.a(paramArrayOfInt2[i1][i2], 4) > zla.a(paramArrayOfInt2[(i1 - 1)][i2], 8)))
        {
          localStyle2 = g(paramArrayOfInt1[(i1 - 1)][i2]);
          localStyle2.getBorders().getByBorderType(8).a(localStyle1.getBorders().getByBorderType(4));
          localStyle2.b(5);
          paramArrayOfInt1[(i1 - 1)][i2] = this.c.ac.a(localStyle2);
        }
        localStyle1 = g(paramArrayOfInt1[(i1 - 1)][i2]);
        if ((localStyle1.isModified(5)) && (zla.a(paramArrayOfInt2[(i1 - 1)][i2], 8) > zla.a(paramArrayOfInt2[i1][i2], 4)))
        {
          localStyle2 = g(paramArrayOfInt1[i1][i2]);
          localStyle2.getBorders().getByBorderType(4).a(localStyle1.getBorders().getByBorderType(8));
          localStyle2.b(4);
          paramArrayOfInt1[i1][i2] = this.c.ac.a(localStyle2);
        }
      }
    }
    for (i1 = 0; i1 < paramInt1; i1++) {
      for (i2 = 1; i2 < paramInt2; i2++)
      {
        localStyle1 = g(paramArrayOfInt1[i1][i2]);
        if ((localStyle1.isModified(2)) && (zla.a(paramArrayOfInt2[i1][i2], 1) > zla.a(paramArrayOfInt2[i1][(i2 - 1)], 2)))
        {
          localStyle2 = g(paramArrayOfInt1[i1][(i2 - 1)]);
          localStyle2.getBorders().getByBorderType(2).a(localStyle1.getBorders().getByBorderType(1));
          localStyle2.b(3);
          paramArrayOfInt1[i1][(i2 - 1)] = this.c.ac.a(localStyle2);
        }
        localStyle1 = g(paramArrayOfInt1[i1][(i2 - 1)]);
        if ((localStyle1.isModified(3)) && (zla.a(paramArrayOfInt2[i1][(i2 - 1)], 2) > zla.a(paramArrayOfInt2[i1][i2], 1)))
        {
          localStyle2 = g(paramArrayOfInt1[i1][i2]);
          localStyle2.getBorders().getByBorderType(1).a(localStyle1.getBorders().getByBorderType(2));
          localStyle2.b(2);
          paramArrayOfInt1[i1][i2] = this.c.ac.a(localStyle2);
        }
      }
    }
  }
  
  private void a(Style paramStyle, boolean paramBoolean)
  {
    int i1 = this.c.n - 1 - this.c.i;
    int i2 = this.c.o - this.c.k;
    for (int i3 = i2; i3 < this.k; i3++)
    {
      String str1 = (String)this.r.get(Integer.valueOf(i3 - i2));
      String str2 = "columnsubtotal";
      if (!paramBoolean) {
        str2 = "grandtotalcolumn";
      }
      if ((str1 != null) && (str1.startsWith(str2))) {
        for (int i4 = 1; i4 <= i1; i4++)
        {
          zdk localzdk = new zdk();
          a(localzdk, i4, 1, i1);
          localzdk.c = true;
          localzdk.d = true;
          Style localStyle = g(this.c.ad[i4][i3]);
          this.l[i4][i3] = zla.a(localStyle, paramStyle, localzdk, a, this.l[i4][i3]);
          this.c.ad[i4][i3] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void b(Style paramStyle, boolean paramBoolean)
  {
    int i1 = this.c.o - 1 - this.c.k;
    int i2 = this.c.n - this.c.i;
    for (int i3 = i2; i3 < this.j; i3++)
    {
      String str1 = (String)this.p.get(Integer.valueOf(i3 - i2));
      String str2 = "rowsubtotal";
      if (!paramBoolean) {
        str2 = "grandtotalrow";
      }
      if ((str1 != null) && (str1.startsWith(str2))) {
        for (int i4 = 0; i4 <= i1; i4++)
        {
          zdk localzdk = new zdk();
          b(localzdk, i4, 0, i1);
          localzdk.a = true;
          localzdk.b = true;
          Style localStyle = g(this.c.ad[i3][i4]);
          this.l[i3][i4] = zla.a(localStyle, paramStyle, localzdk, 19, this.l[i3][i4]);
          this.c.ad[i3][i4] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void h(Style paramStyle)
  {
    int i1 = this.c.o - 1 - this.c.k;
    int i2 = this.c.n - this.c.i;
    for (int i3 = i2; i3 < this.j; i3++)
    {
      String str = (String)this.p.get(Integer.valueOf(i3 - i2));
      if ((str != null) && (str.startsWith("blank"))) {
        for (int i4 = 0; i4 <= i1; i4++)
        {
          zdk localzdk = new zdk();
          b(localzdk, i4, 0, i1);
          localzdk.a = true;
          localzdk.b = true;
          Style localStyle = g(this.c.ad[i3][i4]);
          this.l[i3][i4] = zla.a(localStyle, paramStyle, localzdk, 19, this.l[i3][i4]);
          this.c.ad[i3][i4] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void i(Style paramStyle)
  {
    if (this.x > 0)
    {
      int i1 = this.c.o - this.c.k;
      int i2 = 0;
      for (int i3 = i1; i3 < this.k; i3++)
      {
        zdk localzdk = new zdk();
        b(localzdk, i3, i1, this.k - 1);
        localzdk.a = true;
        localzdk.b = true;
        Style localStyle = g(this.c.ad[i2][i3]);
        this.l[i2][i3] = zla.a(localStyle, paramStyle, localzdk, 22, this.l[i2][i3]);
        this.c.ad[i2][i3] = this.c.ac.a(localStyle);
      }
    }
  }
  
  private void j(Style paramStyle)
  {
    if (this.x > 0)
    {
      int i1 = this.c.o - this.c.k;
      int i2 = this.c.n - 1 - this.c.i;
      for (int i3 = 0; i3 <= i2; i3++) {
        for (int i4 = i1; i4 < this.k; i4++)
        {
          zdk localzdk = new zdk();
          b(localzdk, i4, i1, this.k - 1);
          localzdk.a = true;
          localzdk.b = true;
          Style localStyle = g(this.c.ad[i3][i4]);
          this.l[i3][i4] = zla.a(localStyle, paramStyle, localzdk, 22, this.l[i2][i4]);
          this.c.ad[i3][i4] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void k(Style paramStyle)
  {
    if (this.w > 0)
    {
      int i1 = this.c.o - 1 - this.c.k;
      int i2 = this.c.n - 1 - this.c.i;
      if (i2 < 0) {
        return;
      }
      for (int i3 = 0; i3 <= i2; i3++) {
        for (int i4 = 0; i4 <= i1; i4++)
        {
          zdk localzdk = new zdk();
          b(localzdk, i4, 0, i1);
          localzdk.a = true;
          localzdk.b = true;
          Style localStyle = g(this.c.ad[i3][i4]);
          this.l[i3][i4] = zla.a(localStyle, paramStyle, localzdk, 22, this.l[i2][i4]);
          this.c.ad[i3][i4] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void l(Style paramStyle)
  {
    if (this.w > 1)
    {
      int i1 = this.c.n - this.c.i;
      int i2 = this.j - 1;
      if (this.c.getColumnGrand()) {
        if (this.s == 1)
        {
          if (this.w > 1) {
            i2 -= this.y;
          }
        }
        else {
          i2--;
        }
      }
      for (int i3 = i1; i3 <= i2; i3++)
      {
        String str = (String)this.p.get(Integer.valueOf(i3 - i1));
        if ((str != null) && (str.startsWith("rowsubtitle")))
        {
          int[] arrayOfInt = a(zw.d(str.substring("rowsubtitle".length()), '+'));
          if ((arrayOfInt != null) && (arrayOfInt.length != 0) && (arrayOfInt[0] == 1))
          {
            zdk localzdk = new zdk();
            localzdk.b = true;
            localzdk.c = true;
            localzdk.d = true;
            localzdk.a = true;
            int i4 = 0;
            int i5 = 0;
            if ((arrayOfInt.length == 1) && (!this.q.contains(Integer.valueOf(i3 - i1)))) {
              i5 = this.c.o - 1 - this.c.k;
            }
            for (int i6 = i4; i6 <= i5; i6++)
            {
              Style localStyle = g(this.c.ad[i3][i6]);
              this.l[i3][i6] = zla.a(localStyle, paramStyle, localzdk, a, this.l[i3][i6]);
              this.c.ad[i3][i6] = this.c.ac.a(localStyle);
            }
          }
        }
      }
    }
  }
  
  private void m(Style paramStyle)
  {
    int i1 = this.c.o - this.c.k;
    int i2 = 0;
    if (this.x > 0) {
      i2 = this.x;
    }
    for (int i3 = i1; i3 < this.k; i3++)
    {
      String str = (String)this.r.get(Integer.valueOf(i3 - i1));
      if ((str == null) || ((!str.startsWith("columnsubtotal")) && (!str.startsWith("grandtotalcolumn"))))
      {
        zdk localzdk = new zdk();
        Style localStyle = g(this.c.ad[i2][i3]);
        this.l[i2][i3] = zla.a(localStyle, paramStyle, localzdk, 24, this.l[i2][i3]);
        this.c.ad[i2][i3] = this.c.ac.a(localStyle);
      }
    }
  }
  
  private void n(Style paramStyle)
  {
    int i2;
    zdk localzdk;
    Style localStyle;
    if (this.i) {
      for (i1 = 0; i1 < this.z; i1++) {
        for (i2 = 0; i2 < 2; i2++)
        {
          localzdk = new zdk();
          a(localzdk, i1, 0, this.z - 1);
          b(localzdk, i2, 0, 1);
          localStyle = g(this.c.ae[i1][i2]);
          this.m[i1][i2] = zla.a(localStyle, paramStyle, localzdk, 0, this.m[i1][i2]);
          this.c.ae[i1][i2] = this.c.ac.a(localStyle);
        }
      }
    }
    for (int i1 = 0; i1 < this.j; i1++) {
      for (i2 = 0; i2 < this.k; i2++)
      {
        localzdk = new zdk();
        a(localzdk, i1, 0, this.j - 1);
        b(localzdk, i2, 0, this.k - 1);
        localStyle = g(this.c.ad[i1][i2]);
        this.l[i1][i2] = zla.a(localStyle, paramStyle, localzdk, 0, this.l[i1][i2]);
        this.c.ad[i1][i2] = this.c.ac.a(localStyle);
      }
    }
  }
  
  private void o(Style paramStyle)
  {
    if (this.i) {
      for (int i1 = 0; i1 < this.z; i1++)
      {
        zdk localzdk = new zdk();
        localzdk.c = true;
        localzdk.d = true;
        a(localzdk, i1, 0, this.c.getPageFields().getCount() - 1);
        Style localStyle = g(this.c.ae[i1][0]);
        this.m[i1][0] = zla.a(localStyle, paramStyle, localzdk, 1, this.m[i1][0]);
        this.c.ae[i1][0] = this.c.ac.a(localStyle);
      }
    }
  }
  
  private void p(Style paramStyle)
  {
    if (this.i) {
      for (int i1 = 0; i1 < this.z; i1++)
      {
        zdk localzdk = new zdk();
        localzdk.c = true;
        localzdk.d = true;
        a(localzdk, i1, 0, this.c.getPageFields().getCount() - 1);
        Style localStyle = g(this.c.ae[i1][1]);
        this.m[i1][1] = zla.a(localStyle, paramStyle, localzdk, 2, this.m[i1][1]);
        this.c.ae[i1][1] = this.c.ac.a(localStyle);
      }
    }
  }
  
  private void q(Style paramStyle)
  {
    if ((this.c.getShowPivotStyleRowHeader()) && ((this.w > 0) || (this.x > 0)))
    {
      int i1 = this.c.o - 1 - this.c.k;
      for (int i2 = 0; i2 < this.j; i2++) {
        for (int i3 = 0; i3 <= i1; i3++)
        {
          zdk localzdk = new zdk();
          a(localzdk, i2, 0, this.j - 1);
          b(localzdk, i3, 0, i1);
          Style localStyle = g(this.c.ad[i2][i3]);
          this.l[i2][i3] = zla.a(localStyle, paramStyle, localzdk, 8, this.l[i2][i3]);
          this.c.ad[i2][i3] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void r(Style paramStyle)
  {
    if (this.c.getShowPivotStyleColumnHeader())
    {
      int i1 = this.c.n - 1 - this.c.i;
      for (int i2 = 0; i2 <= i1; i2++) {
        for (int i3 = 0; i3 < this.k; i3++)
        {
          zdk localzdk = new zdk();
          a(localzdk, i2, 0, i1);
          b(localzdk, i3, 0, this.k - 1);
          Style localStyle = g(this.c.ad[i2][i3]);
          this.l[i2][i3] = zla.a(localStyle, paramStyle, localzdk, 9, this.l[i2][i3]);
          this.c.ad[i2][i3] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void s(Style paramStyle)
  {
    if ((this.c.getShowPivotStyleRowHeader()) && (this.c.getShowPivotStyleColumnHeader()) && (this.x > 0))
    {
      int i1 = this.c.n - 2 - this.c.i;
      int i2 = this.c.o - 1 - this.c.k;
      for (int i3 = 0; i3 <= i1; i3++) {
        for (int i4 = 0; i4 <= i2; i4++)
        {
          zdk localzdk = new zdk();
          a(localzdk, i3, 0, i1);
          b(localzdk, i4, 0, i2);
          Style localStyle = g(this.c.ad[i3][i4]);
          this.l[i3][i4] = zla.a(localStyle, paramStyle, localzdk, 11, this.l[i3][i4]);
          this.c.ad[i3][i4] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void a(Style paramStyle1, Style paramStyle2, Style paramStyle3)
  {
    if (this.x > 1)
    {
      int i1 = this.c.o - this.c.k;
      for (int i2 = i1; i2 < this.k; i2++)
      {
        String str = (String)this.r.get(Integer.valueOf(i2 - i1));
        if ((str != null) && (str.startsWith("columnsubtotal")))
        {
          int i3 = zp.a(str.substring("columnsubtotal".length()));
          Object[] arrayOfObject = a(i3, new Style[] { paramStyle1, paramStyle2, paramStyle3 });
          Style localStyle1 = (Style)arrayOfObject[0];
          int i4 = ((Integer)arrayOfObject[1]).intValue();
          if (localStyle1 != null)
          {
            int i5 = i3;
            for (int i6 = i5; i6 < this.j; i6++)
            {
              zdk localzdk = new zdk();
              a(localzdk, i6, i5, this.j - 1);
              localzdk.c = true;
              localzdk.d = true;
              Style localStyle2 = g(this.c.ad[i6][i2]);
              this.l[i6][i2] = zla.a(localStyle2, localStyle1, localzdk, i4, this.l[i6][i2]);
              this.c.ad[i6][i2] = this.c.ac.a(localStyle2);
            }
          }
        }
      }
    }
  }
  
  private Object[] a(int paramInt, Style[] paramArrayOfStyle)
  {
    Style localStyle = null;
    int i1 = 0;
    if (paramInt == 1)
    {
      localStyle = paramArrayOfStyle[0];
      i1 = 15;
    }
    else if (paramInt == 2)
    {
      localStyle = paramArrayOfStyle[1];
      i1 = 16;
    }
    else if (paramInt == 3)
    {
      localStyle = paramArrayOfStyle[2];
      i1 = 17;
    }
    else if (paramInt > 0)
    {
      int i2 = paramInt % 2;
      if (i2 == 0)
      {
        localStyle = paramArrayOfStyle[1];
        i1 = 16;
      }
      else
      {
        localStyle = paramArrayOfStyle[2];
        i1 = 17;
      }
    }
    return new Object[] { localStyle, Integer.valueOf(i1) };
  }
  
  private void t(Style paramStyle)
  {
    if (this.w > 1)
    {
      int i1 = this.c.n - this.c.i;
      for (int i2 = i1; i2 < this.j; i2++)
      {
        String str = (String)this.p.get(Integer.valueOf(i2 - i1));
        if ((str != null) && ("blank".equals(str)))
        {
          int i3 = 0;
          for (int i4 = i3; i4 < this.k; i4++)
          {
            zdk localzdk = new zdk();
            b(localzdk, i4, i3, this.k - 1);
            localzdk.a = true;
            localzdk.b = true;
            Style localStyle = g(this.c.ad[i2][i4]);
            this.l[i2][i4] = zla.a(localStyle, paramStyle, localzdk, 18, this.l[i2][i4]);
            this.c.ad[i2][i4] = this.c.ac.a(localStyle);
          }
        }
      }
    }
  }
  
  private void b(Style paramStyle1, Style paramStyle2, Style paramStyle3)
  {
    if (this.w > 1)
    {
      int i1 = this.c.n - this.c.i;
      for (int i2 = i1; i2 < this.j; i2++)
      {
        String str = (String)this.p.get(Integer.valueOf(i2 - i1));
        if ((str != null) && (str.startsWith("rowsubtotal")))
        {
          int i3 = zp.a(str.substring("rowsubtotal".length()));
          Object[] arrayOfObject = b(i3, new Style[] { paramStyle1, paramStyle2, paramStyle3 });
          Style localStyle1 = (Style)arrayOfObject[0];
          int i4 = ((Integer)arrayOfObject[1]).intValue();
          if (localStyle1 != null)
          {
            int i5 = c(i3 - 1);
            for (int i6 = i5; i6 < this.k; i6++)
            {
              zdk localzdk = new zdk();
              b(localzdk, i6, i5, this.k - 1);
              localzdk.a = true;
              localzdk.b = true;
              Style localStyle2 = g(this.c.ad[i2][i6]);
              this.l[i2][i6] = zla.a(localStyle2, localStyle1, localzdk, i4, this.l[i2][i6]);
              this.c.ad[i2][i6] = this.c.ac.a(localStyle2);
            }
          }
        }
      }
    }
  }
  
  private void c(Style paramStyle1, Style paramStyle2, Style paramStyle3)
  {
    if (this.w > 1)
    {
      int i1 = this.c.n - this.c.i;
      for (int i2 = i1; i2 < this.j; i2++)
      {
        String str = (String)this.p.get(Integer.valueOf(i2 - i1));
        if ((str != null) && (str.startsWith("rowsubtotal")))
        {
          int i3 = zp.a(str.substring("rowsubtotal".length()));
          Object[] arrayOfObject = b(i3, new Style[] { paramStyle1, paramStyle2, paramStyle3 });
          Style localStyle1 = (Style)arrayOfObject[0];
          int i4 = ((Integer)arrayOfObject[1]).intValue();
          if (localStyle1 != null)
          {
            int i5 = c(i3 - 1);
            int i6 = this.c.o - 1 - this.c.k;
            for (int i7 = i5; i7 <= i6; i7++)
            {
              zdk localzdk = new zdk();
              b(localzdk, i7, i5, i6);
              localzdk.a = true;
              localzdk.b = true;
              Style localStyle2 = g(this.c.ad[i2][i7]);
              this.l[i2][i7] = zla.a(localStyle2, localStyle1, localzdk, i4, this.l[i2][i7]);
              this.c.ad[i2][i7] = this.c.ac.a(localStyle2);
            }
          }
        }
      }
    }
  }
  
  private void a(Style paramStyle1, int paramInt1, Style paramStyle2, int paramInt2, Style paramStyle3, int paramInt3)
  {
    if (this.w > 1)
    {
      int i1 = this.c.n - this.c.i;
      for (int i2 = i1; i2 < this.j; i2++)
      {
        String str = (String)this.p.get(Integer.valueOf(i2 - i1));
        if ((str != null) && (str.startsWith("rowsubtotal")))
        {
          int i3 = zp.a(str.substring("rowsubtotal".length()));
          Object[] arrayOfObject = a(i3, new Style[] { paramStyle1, paramStyle2, paramStyle3 }, new int[] { paramInt1, paramInt2, paramInt3 });
          Style localStyle1 = (Style)arrayOfObject[0];
          int i4 = ((Integer)arrayOfObject[1]).intValue();
          if (localStyle1 != null)
          {
            int i5 = c(i3 - 1);
            for (int i6 = i5; i6 < this.k; i6++)
            {
              zdk localzdk = new zdk();
              b(localzdk, i6, i5, this.k - 1);
              localzdk.a = true;
              localzdk.b = true;
              Style localStyle2 = g(this.c.ad[i2][i6]);
              this.l[i2][i6] = zla.a(localStyle2, localStyle1, localzdk, i4, this.l[i2][i6]);
              this.c.ad[i2][i6] = this.c.ac.a(localStyle2);
            }
          }
        }
      }
    }
  }
  
  private Object[] a(int paramInt, Style[] paramArrayOfStyle, int[] paramArrayOfInt)
  {
    Style localStyle = null;
    int i1 = 0;
    if (paramInt == 1)
    {
      localStyle = paramArrayOfStyle[0];
      i1 = paramArrayOfInt[0];
    }
    else if (paramInt == 2)
    {
      localStyle = paramArrayOfStyle[1];
      i1 = paramArrayOfInt[1];
    }
    else if (paramInt == 3)
    {
      localStyle = paramArrayOfStyle[2];
      i1 = paramArrayOfInt[2];
    }
    else if (paramInt > 0)
    {
      int i2 = paramInt % 2;
      if (i2 == 0)
      {
        localStyle = paramArrayOfStyle[1];
        i1 = paramArrayOfInt[1];
      }
      else
      {
        localStyle = paramArrayOfStyle[2];
        i1 = paramArrayOfInt[2];
      }
    }
    return new Object[] { localStyle, Integer.valueOf(i1) };
  }
  
  private Object[] b(int paramInt, Style[] paramArrayOfStyle)
  {
    Style localStyle = null;
    int i1 = 0;
    if (paramInt == 1)
    {
      localStyle = paramArrayOfStyle[0];
      i1 = 19;
    }
    else if (paramInt == 2)
    {
      localStyle = paramArrayOfStyle[1];
      i1 = 20;
    }
    else if (paramInt == 3)
    {
      localStyle = paramArrayOfStyle[2];
      i1 = 21;
    }
    else if (paramInt > 0)
    {
      int i2 = paramInt % 2;
      if (i2 == 0)
      {
        localStyle = paramArrayOfStyle[1];
        i1 = 20;
      }
      else
      {
        localStyle = paramArrayOfStyle[2];
        i1 = 21;
      }
    }
    return new Object[] { localStyle, Integer.valueOf(i1) };
  }
  
  private void d(Style paramStyle1, Style paramStyle2, Style paramStyle3)
  {
    if ((this.c.getShowPivotStyleColumnHeader()) && (this.x > 0))
    {
      String str1 = this.c.o - this.c.k;
      Style localStyle1 = null;
      String str7;
      zdk localzdk2;
      for (zdk localzdk1 = str1; localzdk1 < this.k; localzdk1++)
      {
        i1 = 0;
        str4 = (String)this.r.get(Integer.valueOf(localzdk1 - str1));
        if ((str4 != null) && (str4.startsWith("columnsubtotal")))
        {
          String str5 = zp.a(str4.substring("columnsubtotal".length()));
          Object[] arrayOfObject2 = c(str5, new Style[] { paramStyle1, paramStyle2, paramStyle3 });
          if (arrayOfObject2 != null)
          {
            localStyle1 = (Style)arrayOfObject2[0];
            i1 = ((Integer)arrayOfObject2[1]).intValue();
          }
          if (localStyle1 != null)
          {
            str2 = str5;
            str3 = this.c.n - 1 - this.c.i;
            for (str7 = str2; str7 <= str3; str7++)
            {
              localzdk2 = new zdk();
              a(localzdk2, str7, str2, str3);
              localzdk2.c = true;
              localzdk2.d = true;
              Style localStyle2 = g(this.c.ad[str7][localzdk1]);
              this.l[str7][localzdk1] = zla.a(localStyle2, localStyle1, localzdk2, i1, this.l[str7][localzdk1]);
              this.c.ad[str7][localzdk1] = this.c.ac.a(localStyle2);
            }
          }
        }
      }
      String str2 = 1;
      String str3 = this.c.n - 1 - this.c.i;
      localStyle1 = null;
      int i1 = 0;
      localzdk1 = this.k - 1;
      if (this.c.getRowGrand()) {
        if (this.s == 2)
        {
          if (this.x > 1) {
            localzdk1 -= this.y;
          }
        }
        else {
          localzdk1--;
        }
      }
      for (String str4 = str2; str4 <= str3; str4++)
      {
        Object[] arrayOfObject1 = c(str4, new Style[] { paramStyle1, paramStyle2, paramStyle3 });
        if (arrayOfObject1 != null)
        {
          localStyle1 = (Style)arrayOfObject1[0];
          i1 = ((Integer)arrayOfObject1[1]).intValue();
        }
        if (localStyle1 != null)
        {
          String str6 = -1;
          str7 = str1;
          localzdk2 = localzdk1;
          int i2 = 0;
          for (zdk localzdk3 = str1; localzdk3 <= localzdk1; localzdk3++) {
            if (i2 != 0)
            {
              i2 = 0;
            }
            else
            {
              if (str6 != -1)
              {
                str7 = str6;
                localzdk2 = localzdk1;
                str6 = -1;
              }
              String str8 = (String)this.r.get(Integer.valueOf(localzdk3 - str1));
              if ((str8 != null) && (str8.startsWith("columnsubtotal")))
              {
                String str9 = zp.a(str8.substring("columnsubtotal".length()));
                if (str9 <= str4)
                {
                  str6 = localzdk3 + 1;
                  continue;
                }
              }
              if (localzdk3 < localzdk1)
              {
                str8 = (String)this.r.get(Integer.valueOf(localzdk3 + 1 - str1));
                if ((str8 != null) && (str8.startsWith("columnsubtotal")))
                {
                  localObject = zp.a(str8.substring("columnsubtotal".length()));
                  if (localObject <= str4)
                  {
                    i2 = 1;
                    str6 = localzdk3 + 2;
                    localzdk2 = localzdk3;
                  }
                }
              }
              Object localObject = new zdk();
              b((zdk)localObject, localzdk3, str7, localzdk2);
              ((zdk)localObject).a = true;
              ((zdk)localObject).b = true;
              Style localStyle3 = g(this.c.ad[str4][localzdk3]);
              this.l[str4][localzdk3] = zla.a(localStyle3, localStyle1, (zdk)localObject, i1, this.l[str4][localzdk3]);
              this.c.ad[str4][localzdk3] = this.c.ac.a(localStyle3);
            }
          }
        }
      }
    }
  }
  
  private Object[] c(int paramInt, Style[] paramArrayOfStyle)
  {
    Style localStyle = null;
    int i1 = 0;
    if (paramInt == 1)
    {
      localStyle = paramArrayOfStyle[0];
      i1 = 22;
    }
    else if (paramInt == 2)
    {
      localStyle = paramArrayOfStyle[1];
      i1 = 23;
    }
    else if (paramInt == 3)
    {
      localStyle = paramArrayOfStyle[2];
      i1 = 24;
    }
    else if (paramInt > 0)
    {
      int i2 = paramInt % 2;
      if (i2 == 0)
      {
        localStyle = paramArrayOfStyle[1];
        i1 = 23;
      }
      else
      {
        localStyle = paramArrayOfStyle[2];
        i1 = 24;
      }
    }
    return new Object[] { localStyle, Integer.valueOf(i1) };
  }
  
  private void e(Style paramStyle1, Style paramStyle2, Style paramStyle3)
  {
    if ((this.c.getShowPivotStyleRowHeader()) && (this.w > 1))
    {
      int i1 = this.c.n - this.c.i;
      int i2 = this.j - 1;
      if (this.c.getColumnGrand()) {
        if (this.s == 1)
        {
          if (this.w > 1) {
            i2 -= this.y;
          }
        }
        else {
          i2--;
        }
      }
      int i3 = 0;
      int i4 = i1;
      Object localObject1;
      Object localObject2;
      int i6;
      Object localObject3;
      int i8;
      int i10;
      Object localObject5;
      Object localObject6;
      Style localStyle2;
      for (int i5 = 0; i5 < this.w - 1; i5++)
      {
        localObject1 = this.c.getRowFields().get(i5);
        if (!((PivotField)localObject1).getShowInOutlineForm())
        {
          localObject2 = null;
          i6 = 0;
          localObject3 = d(i5, new Style[] { paramStyle1, paramStyle2, paramStyle3 });
          if (localObject3 != null)
          {
            localObject2 = (Style)localObject3[0];
            i6 = ((Integer)localObject3[1]).intValue();
          }
          if (localObject2 != null)
          {
            int i7 = -1;
            i8 = 0;
            int i9 = i4;
            i10 = i2;
            for (int i11 = i4; i11 <= i2; i11++) {
              if (i8 != 0)
              {
                i8 = 0;
              }
              else
              {
                if (i7 != -1)
                {
                  i9 = i7;
                  i10 = i2;
                  i7 = -1;
                }
                localObject5 = (String)this.p.get(Integer.valueOf(i11 - i1));
                int i12;
                if (localObject5 != null) {
                  if (((String)localObject5).startsWith("rowsubtotal"))
                  {
                    i12 = zp.a(((String)localObject5).substring("rowsubtotal".length()));
                    if (i12 <= i5 + 1)
                    {
                      i7 = i11 + 1;
                      continue;
                    }
                  }
                  else if (((String)localObject5).startsWith("blank"))
                  {
                    i7 = i11 + 1;
                    continue;
                  }
                }
                if (i11 < i2)
                {
                  localObject5 = (String)this.p.get(Integer.valueOf(i11 + 1 - i1));
                  if (localObject5 != null) {
                    if (((String)localObject5).startsWith("rowsubtotal"))
                    {
                      i12 = zp.a(((String)localObject5).substring("rowsubtotal".length()));
                      if (i12 <= i5 + 1)
                      {
                        i8 = 1;
                        i7 = i11 + 2;
                        i10 = i11;
                      }
                    }
                    else if (((String)localObject5).startsWith("blank"))
                    {
                      i8 = 1;
                      i7 = i11 + 2;
                      i10 = i11;
                    }
                    else if (((String)localObject5).startsWith("rowsubtitle"))
                    {
                      localObject6 = a(zw.d(((String)localObject5).substring("rowsubtitle".length()), '+'));
                      if (localObject6 != null) {
                        for (int i13 = 0; i13 < localObject6.length; i13++) {
                          if (localObject6[i13] <= i5 + 1)
                          {
                            i7 = i11 + 1;
                            i10 = i11;
                            break;
                          }
                        }
                      }
                    }
                  }
                }
                localObject6 = new zdk();
                a((zdk)localObject6, i11, i9, i10);
                ((zdk)localObject6).c = true;
                ((zdk)localObject6).d = true;
                localStyle2 = g(this.c.ad[i11][i3]);
                this.l[i11][i3] = zla.a(localStyle2, (Style)localObject2, (zdk)localObject6, i6, this.l[i11][i3]);
                this.c.ad[i11][i3] = this.c.ac.a(localStyle2);
                if ((this.c.getPivotTableStyleType() == 0) && (i3 + 2 == this.c.o))
                {
                  ((zdk)localObject6).c = false;
                  ((zdk)localObject6).d = false;
                  for (int i14 = i3 + 1; i14 <= this.c.l; i14++)
                  {
                    Style localStyle3 = g(this.c.ad[i11][i14]);
                    this.l[i11][i14] = zla.a(localStyle3, (Style)localObject2, (zdk)localObject6, i6, this.l[i11][i14]);
                    this.c.ad[i11][i14] = this.c.ac.a(localStyle3);
                  }
                }
              }
            }
            i3++;
          }
        }
        else
        {
          i4++;
          if (!((PivotField)localObject1).getShowCompact()) {
            i3++;
          }
        }
      }
      for (i5 = i1; i5 <= i2; i5++)
      {
        localObject1 = (String)this.p.get(Integer.valueOf(i5 - i1));
        if ((localObject1 != null) && (((String)localObject1).startsWith("rowsubtitle")))
        {
          localObject2 = a(zw.d(((String)localObject1).substring("rowsubtitle".length()), '+'));
          if ((localObject2 != null) && ((localObject2.length != 1) || (localObject2[(localObject2.length - 1)] != this.w))) {
            for (i6 = 0; i6 < localObject2.length; i6++)
            {
              localObject3 = this.c.getRowFields().get(localObject2[i6] - 1);
              if (((PivotField)localObject3).getShowInOutlineForm())
              {
                Style localStyle1 = null;
                i8 = 0;
                Object[] arrayOfObject = d(localObject2[i6] - 1, new Style[] { paramStyle1, paramStyle2, paramStyle3 });
                if (arrayOfObject != null)
                {
                  localStyle1 = (Style)arrayOfObject[0];
                  i8 = ((Integer)arrayOfObject[1]).intValue();
                }
                if (localStyle1 != null)
                {
                  i10 = c(localObject2[i6] - 1);
                  if (i6 != localObject2.length - 1)
                  {
                    zdk localzdk = new zdk();
                    localzdk.a = true;
                    localzdk.b = true;
                    localzdk.c = true;
                    localzdk.d = true;
                    localObject5 = g(this.c.ad[i5][i10]);
                    this.l[i5][i10] = zla.a((Style)localObject5, localStyle1, localzdk, i8, this.l[i5][i10]);
                    this.c.ad[i5][i10] = this.c.ac.a((Style)localObject5);
                  }
                  else if (localObject2[i6] != this.w)
                  {
                    Object localObject4 = this.k - 1;
                    if (b(localObject2[i6] - 1)) {
                      localObject4 = this.c.o - 1 - this.c.k;
                    }
                    for (localObject5 = i10; localObject5 <= localObject4; localObject5++)
                    {
                      localObject6 = new zdk();
                      b((zdk)localObject6, localObject5, i10, localObject4);
                      ((zdk)localObject6).a = true;
                      ((zdk)localObject6).b = true;
                      localStyle2 = g(this.c.ad[i5][localObject5]);
                      this.l[i5][localObject5] = zla.a(localStyle2, localStyle1, (zdk)localObject6, i8, this.l[i5][localObject5]);
                      this.c.ad[i5][localObject5] = this.c.ac.a(localStyle2);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void u(Style paramStyle)
  {
    if (this.w > 1)
    {
      int i1 = this.c.o - 1 - this.c.k;
      int i2 = this.k - 1;
      int i3 = this.c.n - this.c.i;
      int i4 = 0;
      int i5 = this.w - 2;
      for (int i6 = i3; i6 < this.j; i6++)
      {
        i4 = 0;
        String str = (String)this.p.get(Integer.valueOf(i6 - i3));
        if ((str == null) || ((!str.startsWith("rowsubtotal")) && (!str.startsWith("blank"))))
        {
          Object localObject;
          int i7;
          if (i6 < this.j - 1)
          {
            str = (String)this.p.get(Integer.valueOf(i6 + 1 - i3));
            if (str != null) {
              if (str.startsWith("rowsubtotal"))
              {
                i4 = 1;
              }
              else if (str.startsWith("blank"))
              {
                i4 = 1;
              }
              else if (str.startsWith("rowsubtitle"))
              {
                localObject = a(zw.d(str.substring("rowsubtitle".length()), '+'));
                if (localObject != null) {
                  for (i7 = 0; i7 < localObject.length; i7++) {
                    if (localObject[i7] <= i5 + 1)
                    {
                      i4 = 1;
                      break;
                    }
                  }
                }
              }
            }
          }
          if (i4 != 0)
          {
            localObject = new zdk();
            ((zdk)localObject).b = true;
            for (i7 = i1; i7 <= i2; i7++)
            {
              Style localStyle = g(this.c.ad[i6][i7]);
              this.l[i6][i7] = zla.a(localStyle, paramStyle, (zdk)localObject, a, this.l[i6][i7]);
              this.c.ad[i6][i7] = this.c.ac.a(localStyle);
            }
          }
        }
      }
    }
  }
  
  private void F()
  {
    int i1 = this.c.n - this.c.i;
    int i2 = this.j - 1;
    Style localStyle1 = null;
    int i3 = 0;
    int i4 = 0;
    boolean bool = a(this.c.getRowFields());
    for (int i5 = i1; i5 <= i2; i5++)
    {
      String str = (String)this.p.get(Integer.valueOf(i5 - i1));
      if (str != null)
      {
        Object localObject2;
        if (str.startsWith("rowsubtitle"))
        {
          int[] arrayOfInt = a(zw.d(str.substring("rowsubtitle".length()), '+'));
          for (int i7 = 0; i7 < arrayOfInt.length; i7++)
          {
            i3 = c(arrayOfInt[i7] - 1);
            i4 = d(arrayOfInt[i7] - 1);
            if ((!bool) || (i4 != 0))
            {
              localStyle1 = zaxi.a(this.f, i4, this.e.getDisplayRightToLeft());
              localObject2 = new zdk();
              Style localStyle2 = g(this.c.ad[i5][i3]);
              this.l[i5][i3] = zla.a(localStyle2, localStyle1, (zdk)localObject2, 25, this.l[i5][i3]);
              this.c.ad[i5][i3] = this.c.ac.a(localStyle2);
            }
          }
        }
        else
        {
          Object localObject1;
          if (str.startsWith("rowsubtotal"))
          {
            int i6 = zp.a(str.substring("rowsubtotal".length()));
            i3 = c(i6 - 1);
            i4 = d(i6 - 1);
            if ((!bool) || (i4 != 0))
            {
              localStyle1 = zaxi.a(this.f, i4, this.e.getDisplayRightToLeft());
              localObject1 = new zdk();
              localObject2 = g(this.c.ad[i5][i3]);
              this.l[i5][i3] = zla.a((Style)localObject2, localStyle1, (zdk)localObject1, 25, this.l[i5][i3]);
              this.c.ad[i5][i3] = this.c.ac.a((Style)localObject2);
            }
          }
          else if ("grandtotalrow".equals(str))
          {
            i3 = 0;
            if (!bool)
            {
              localStyle1 = zaxi.a(this.f, 0, this.e.getDisplayRightToLeft());
              zdk localzdk = new zdk();
              localObject1 = g(this.c.ad[i5][i3]);
              this.l[i5][i3] = zla.a((Style)localObject1, localStyle1, localzdk, 29, this.l[i5][i3]);
              this.c.ad[i5][i3] = this.c.ac.a((Style)localObject1);
            }
          }
        }
      }
    }
  }
  
  private void a(Style paramStyle1, Style paramStyle2, Style paramStyle3, Style paramStyle4, Style paramStyle5, Style paramStyle6, Style paramStyle7, Style paramStyle8, Style paramStyle9, Style paramStyle10, Style paramStyle11)
  {
    if ((this.c.getShowPivotStyleRowHeader()) && (this.w > 1))
    {
      int i1 = this.c.n - this.c.i;
      int i2 = this.j - 1;
      if (this.c.getColumnGrand()) {
        if (this.s == 1)
        {
          if (this.w > 1) {
            i2 -= this.y;
          }
        }
        else {
          i2--;
        }
      }
      int i3 = 0;
      int i4 = i1;
      Object localObject1;
      Object localObject2;
      int i6;
      int i10;
      Object localObject5;
      zdk localzdk3;
      Style localStyle2;
      for (int i5 = 0; i5 < this.w - 1; i5++)
      {
        localObject1 = this.c.getRowFields().get(i5);
        if (!((PivotField)localObject1).getShowInOutlineForm())
        {
          localObject2 = null;
          i6 = 0;
          Object[] arrayOfObject1 = d(i5, new Style[] { paramStyle1, paramStyle4, paramStyle7 });
          if (arrayOfObject1 != null)
          {
            localObject2 = (Style)arrayOfObject1[0];
            i6 = ((Integer)arrayOfObject1[1]).intValue();
          }
          if (localObject2 != null)
          {
            int i8 = -1;
            int i9 = 0;
            i10 = i4;
            int i11 = i2;
            for (int i12 = i4; i12 <= i2; i12++) {
              if (i9 != 0)
              {
                i9 = 0;
              }
              else
              {
                if (i8 != -1)
                {
                  i10 = i8;
                  i11 = i2;
                  i8 = -1;
                }
                localObject5 = (String)this.p.get(Integer.valueOf(i12 - i1));
                int i13;
                if (localObject5 != null) {
                  if (((String)localObject5).startsWith("rowsubtotal"))
                  {
                    i13 = zp.a(((String)localObject5).substring("rowsubtotal".length()));
                    if (i13 <= i5 + 1)
                    {
                      i8 = i12 + 1;
                      continue;
                    }
                  }
                  else if (((String)localObject5).startsWith("blank"))
                  {
                    i8 = i12 + 1;
                    continue;
                  }
                }
                if (i12 < i2)
                {
                  localObject5 = (String)this.p.get(Integer.valueOf(i12 + 1 - i1));
                  if (localObject5 != null) {
                    if (((String)localObject5).startsWith("rowsubtotal"))
                    {
                      i13 = zp.a(((String)localObject5).substring("rowsubtotal".length()));
                      if (i13 <= i5 + 1)
                      {
                        i9 = 1;
                        i8 = i12 + 2;
                        i11 = i12;
                      }
                    }
                    else if (((String)localObject5).startsWith("blank"))
                    {
                      i9 = 1;
                      i8 = i12 + 2;
                      i11 = i12;
                    }
                  }
                }
                localzdk3 = new zdk();
                a(localzdk3, i12, i10, i11);
                localzdk3.c = true;
                localzdk3.d = true;
                localStyle2 = g(this.c.ad[i12][i3]);
                this.l[i12][i3] = zla.a(localStyle2, (Style)localObject2, localzdk3, i6, this.l[i12][i3]);
                this.c.ad[i12][i3] = this.c.ac.a(localStyle2);
              }
            }
            i3++;
          }
        }
        else
        {
          i4++;
          if (!((PivotField)localObject1).getShowCompact()) {
            i3++;
          }
        }
      }
      for (i5 = i1; i5 <= i2; i5++)
      {
        localObject1 = (String)this.p.get(Integer.valueOf(i5 - i1));
        if ((localObject1 != null) && (((String)localObject1).startsWith("rowsubtitle")))
        {
          localObject2 = a(zw.d(((String)localObject1).substring("rowsubtitle".length()), '+'));
          for (i6 = 0; i6 < localObject2.length; i6++)
          {
            int i7 = c(localObject2[i6] - 1);
            Object localObject3;
            Style localStyle1;
            if (localObject2[i6] == this.w)
            {
              if (paramStyle10 != null)
              {
                localObject3 = new zdk();
                ((zdk)localObject3).a = true;
                ((zdk)localObject3).b = true;
                ((zdk)localObject3).c = true;
                ((zdk)localObject3).d = true;
                localStyle1 = g(this.c.ad[i5][i7]);
                this.l[i5][i7] = zla.a(localStyle1, paramStyle10, (zdk)localObject3, 27, this.l[i5][i7]);
                this.c.ad[i5][i7] = this.c.ac.a(localStyle1);
              }
              if (paramStyle11 != null)
              {
                localObject3 = new zdk();
                ((zdk)localObject3).a = true;
                ((zdk)localObject3).b = true;
                ((zdk)localObject3).c = true;
                ((zdk)localObject3).d = true;
                localStyle1 = g(this.c.ad[i5][(this.k - 1)]);
                this.l[i5][(this.k - 1)] = zla.a(localStyle1, paramStyle11, (zdk)localObject3, 27, this.l[i5][(this.k - 1)]);
                this.c.ad[i5][(this.k - 1)] = this.c.ac.a(localStyle1);
              }
            }
            else
            {
              localObject3 = this.c.getRowFields().get(localObject2[i6] - 1);
              if (((PivotField)localObject3).getShowInOutlineForm())
              {
                localStyle1 = null;
                i10 = 0;
                Object[] arrayOfObject2;
                if (i6 != localObject2.length - 1)
                {
                  arrayOfObject2 = d(localObject2[i6] - 1, new Style[] { paramStyle1, paramStyle4, paramStyle7 });
                  if (arrayOfObject2 != null)
                  {
                    localStyle1 = (Style)arrayOfObject2[0];
                    i10 = ((Integer)arrayOfObject2[1]).intValue();
                  }
                  if (localStyle1 != null)
                  {
                    zdk localzdk1 = new zdk();
                    localzdk1.a = true;
                    localzdk1.b = true;
                    localzdk1.c = true;
                    localzdk1.d = true;
                    localObject5 = g(this.c.ad[i5][i7]);
                    this.l[i5][i7] = zla.a((Style)localObject5, localStyle1, localzdk1, i10, this.l[i5][i7]);
                    this.c.ad[i5][i7] = this.c.ac.a((Style)localObject5);
                  }
                  localStyle1 = null;
                }
                else
                {
                  arrayOfObject2 = d(localObject2[i6] - 1, new Style[] { paramStyle2, paramStyle5, paramStyle8 });
                  if (arrayOfObject2 != null)
                  {
                    localStyle1 = (Style)arrayOfObject2[0];
                    i10 = ((Integer)arrayOfObject2[1]).intValue();
                  }
                  if (localStyle1 != null)
                  {
                    Object localObject4 = this.k - 1;
                    if (b(localObject2[i6] - 1)) {
                      localObject4 = this.c.o - 1 - this.c.k;
                    }
                    for (localObject5 = i7; localObject5 <= localObject4; localObject5++)
                    {
                      localzdk3 = new zdk();
                      b(localzdk3, localObject5, i7, localObject4);
                      localzdk3.a = true;
                      localzdk3.b = true;
                      localStyle2 = g(this.c.ad[i5][localObject5]);
                      this.l[i5][localObject5] = zla.a(localStyle2, localStyle1, localzdk3, i10, this.l[i5][localObject5]);
                      this.c.ad[i5][localObject5] = this.c.ac.a(localStyle2);
                    }
                    localStyle1 = null;
                  }
                  arrayOfObject2 = d(localObject2[i6] - 1, new Style[] { paramStyle1, paramStyle4, paramStyle7 });
                  if (arrayOfObject2 != null)
                  {
                    localStyle1 = (Style)arrayOfObject2[0];
                    i10 = ((Integer)arrayOfObject2[1]).intValue();
                  }
                  zdk localzdk2;
                  int i14;
                  if (localStyle1 != null)
                  {
                    localzdk2 = new zdk();
                    localzdk2.a = true;
                    localzdk2.b = true;
                    localzdk2.c = true;
                    localzdk2.d = true;
                    localObject5 = g(this.c.ad[i5][i7]);
                    this.l[i5][i7] = zla.a((Style)localObject5, localStyle1, localzdk2, i10, this.l[i5][i7]);
                    this.c.ad[i5][i7] = this.c.ac.a((Style)localObject5);
                    if ((!this.c.af) && (this.c.e.a() == 6) && (i5 + 1 - i1 < this.p.size()) && (((String)this.p.get(Integer.valueOf(i5 + 1 - i1))).indexOf("rowsubtitle") == -1))
                    {
                      i14 = 0;
                      for (int i15 = i7 + 1; i15 < this.k; i15++)
                      {
                        if (i14 == 0)
                        {
                          Style localStyle3 = g(this.c.ad[i5][i15]);
                          int i16 = localStyle3.getHorizontalAlignment();
                          int i17 = localStyle3.getVerticalAlignment();
                          Style localStyle4 = this.c.ac.a(this.c.ad[i5][i7]);
                          localStyle3.copy(localStyle4);
                          localStyle3.setHorizontalAlignment(i16);
                          localStyle3.setVerticalAlignment(i17);
                          i14 = this.c.ac.a(localStyle3);
                        }
                        this.c.ad[i5][i15] = i14;
                      }
                    }
                  }
                  localStyle1 = null;
                  arrayOfObject2 = d(localObject2[i6] - 1, new Style[] { paramStyle3, paramStyle6, paramStyle9 });
                  if (arrayOfObject2 != null)
                  {
                    localStyle1 = (Style)arrayOfObject2[0];
                    i10 = ((Integer)arrayOfObject2[1]).intValue();
                  }
                  if (localStyle1 != null)
                  {
                    localzdk2 = new zdk();
                    localzdk2.a = true;
                    localzdk2.b = true;
                    localzdk2.c = true;
                    localzdk2.d = true;
                    localObject5 = g(this.c.ad[i5][(this.k - 1)]);
                    this.l[i5][(this.k - 1)] = zla.a((Style)localObject5, localStyle1, localzdk2, i10, this.l[i5][(this.k - 1)]);
                    this.c.ad[i5][(this.k - 1)] = this.c.ac.a((Style)localObject5);
                    localStyle1 = null;
                    if ((!this.c.af) && (this.c.e.a() == 7)) {
                      for (i14 = this.c.o - i7; i14 < this.k - 1; i14++) {
                        this.c.ad[i5][i14] = this.c.ad[i5][(this.k - 1)];
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void v(Style paramStyle)
  {
    if (this.c.getRowGrand())
    {
      if ((this.x == 1) && (this.c.getColumnFields().get(0).i())) {
        return;
      }
      int i1 = 1;
      if (this.x == 0) {
        i1 = 0;
      }
      int i2 = this.j - 1;
      int i3 = this.k - 1;
      int i4 = i3;
      if ((this.s == 2) && (this.x > 1)) {
        i4 = i4 - this.y + 1;
      }
      for (int i5 = i1; i5 <= i2; i5++) {
        for (int i6 = i4; i6 <= i3; i6++)
        {
          zdk localzdk = new zdk();
          a(localzdk, i5, i1, i2);
          b(localzdk, i6, i4, i3);
          Style localStyle = g(this.c.ad[i5][i6]);
          this.l[i5][i6] = zla.a(localStyle, paramStyle, localzdk, 28, this.l[i5][i6]);
          this.c.ad[i5][i6] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private void w(Style paramStyle)
  {
    if (this.c.getRowGrand())
    {
      if ((this.x == 1) && (this.c.getColumnFields().get(0).i())) {
        return;
      }
      int i1 = 1;
      if (this.x == 0) {
        i1 = 0;
      }
      int i2 = this.k - 1;
      int i3 = i2;
      if ((this.s == 2) && (this.x > 1)) {
        i3 = i3 - this.y + 1;
      }
      for (int i4 = i3; i4 <= i2; i4++)
      {
        zdk localzdk = new zdk();
        b(localzdk, i4, i3, i2);
        localzdk.a = true;
        localzdk.b = true;
        Style localStyle = g(this.c.ad[i1][i4]);
        this.l[i1][i4] = zla.a(localStyle, paramStyle, localzdk, 28, this.l[i1][i4]);
        this.c.ad[i1][i4] = this.c.ac.a(localStyle);
      }
    }
  }
  
  private void x(Style paramStyle)
  {
    if (this.c.getColumnGrand())
    {
      if ((this.w == 1) && (this.c.getRowFields().get(0).i())) {
        return;
      }
      if ((this.w == 0) && (this.y > 1)) {
        return;
      }
      int i1 = this.j - 1;
      int i2 = i1;
      if ((this.s == 1) && (this.x > 1)) {
        i2 = i2 - this.y + 1;
      }
      for (int i3 = i2; i3 <= i1; i3++)
      {
        zdk localzdk = new zdk();
        a(localzdk, i3, i2, i1);
        localzdk.c = true;
        localzdk.d = true;
        Style localStyle = g(this.c.ad[i3][0]);
        this.l[i3][0] = zla.a(localStyle, paramStyle, localzdk, 29, this.l[i3][0]);
        this.c.ad[i3][0] = this.c.ac.a(localStyle);
      }
    }
  }
  
  private void y(Style paramStyle)
  {
    if (this.c.getColumnGrand())
    {
      if ((this.w == 1) && (this.c.getRowFields().get(0).i())) {
        return;
      }
      if ((this.w == 0) && (this.y > 1)) {
        return;
      }
      int i1 = 0;
      int i2 = this.k - 1;
      int i3 = this.j - 1;
      int i4 = i3;
      if ((this.s == 1) && (this.x > 1)) {
        i4 = i4 - this.y + 1;
      }
      for (int i5 = i1; i5 <= i2; i5++) {
        for (int i6 = i4; i6 <= i3; i6++)
        {
          zdk localzdk = new zdk();
          b(localzdk, i5, i1, i2);
          a(localzdk, i6, i4, i3);
          Style localStyle = g(this.c.ad[i6][i5]);
          this.l[i6][i5] = zla.a(localStyle, paramStyle, localzdk, 29, this.l[i6][i5]);
          this.c.ad[i6][i5] = this.c.ac.a(localStyle);
        }
      }
    }
  }
  
  private boolean b(int paramInt)
  {
    for (int i1 = paramInt; i1 < this.w - 1; i1++)
    {
      PivotField localPivotField = this.c.getRowFields().get(i1);
      if (localPivotField.getShowInOutlineForm()) {
        return false;
      }
    }
    return true;
  }
  
  private int c(int paramInt)
  {
    int i1 = 0;
    if (paramInt >= this.w) {
      paramInt = this.w - 1;
    }
    for (int i2 = 0; i2 < paramInt; i2++)
    {
      PivotField localPivotField = this.c.getRowFields().get(i2);
      if (((!localPivotField.getShowInOutlineForm()) || (!localPivotField.getShowCompact()) || (localPivotField.i())) && ((!localPivotField.i()) || (!this.c.x) || (!this.c.v))) {
        i1++;
      }
    }
    return i1;
  }
  
  private int d(int paramInt)
  {
    int i1 = 0;
    if (paramInt >= this.w) {
      paramInt = this.w - 1;
    }
    for (int i2 = paramInt - 1; i2 >= 0; i2--)
    {
      PivotField localPivotField = this.c.getRowFields().get(i2);
      if (((!localPivotField.i()) && (localPivotField.getShowInOutlineForm()) && (localPivotField.getShowCompact())) || ((localPivotField.i()) && (this.c.x) && (this.c.v))) {
        i1++;
      }
    }
    return i1;
  }
  
  private Object[] d(int paramInt, Style[] paramArrayOfStyle)
  {
    Style localStyle = null;
    int i1 = 0;
    if (paramInt == 0)
    {
      localStyle = paramArrayOfStyle[0];
      i1 = 25;
    }
    else if (paramInt == 1)
    {
      localStyle = paramArrayOfStyle[1];
      i1 = 26;
    }
    else if (paramInt == 2)
    {
      localStyle = paramArrayOfStyle[2];
      i1 = 27;
    }
    else
    {
      int i2 = paramInt % 2;
      if (i2 == 1)
      {
        localStyle = paramArrayOfStyle[1];
        i1 = 26;
      }
      else
      {
        localStyle = paramArrayOfStyle[2];
        i1 = 27;
      }
    }
    return new Object[] { localStyle, Integer.valueOf(i1) };
  }
  
  private int[] a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return null;
    }
    int[] arrayOfInt = new int[paramArrayOfString.length];
    for (int i1 = 0; i1 < paramArrayOfString.length; i1++) {
      arrayOfInt[i1] = zp.a(paramArrayOfString[i1]);
    }
    return arrayOfInt;
  }
  
  private void a(zdk paramzdk, int paramInt1, int paramInt2, int paramInt3)
  {
    paramzdk.a = false;
    paramzdk.b = false;
    paramzdk.e = false;
    paramzdk.f = false;
    if (paramInt1 == paramInt2)
    {
      paramzdk.a = true;
      if (paramInt1 == paramInt3) {
        paramzdk.b = true;
      } else {
        paramzdk.f = true;
      }
    }
    else if (paramInt1 == paramInt3)
    {
      paramzdk.b = true;
      if (paramInt1 == paramInt2) {
        paramzdk.a = true;
      } else {
        paramzdk.e = true;
      }
    }
    else
    {
      paramzdk.f = true;
      paramzdk.e = true;
    }
  }
  
  private void b(zdk paramzdk, int paramInt1, int paramInt2, int paramInt3)
  {
    paramzdk.c = false;
    paramzdk.d = false;
    paramzdk.g = false;
    paramzdk.h = false;
    if (paramInt1 == paramInt2)
    {
      paramzdk.c = true;
      if (paramInt1 == paramInt3) {
        paramzdk.d = true;
      } else {
        paramzdk.h = true;
      }
    }
    else if (paramInt1 == paramInt3)
    {
      paramzdk.d = true;
      if (paramInt1 == paramInt2) {
        paramzdk.c = true;
      } else {
        paramzdk.g = true;
      }
    }
    else
    {
      paramzdk.g = true;
      paramzdk.h = true;
    }
  }
  
  void a(Style paramStyle)
  {
    zbub localzbub = new zbub(this.c.ag);
    this.c.ag.a(localzbub);
    localzbub.b = this.f.getDxfs().a(paramStyle);
    zbur localzbur = new zbur();
    localzbub.c = localzbur;
    localzbur.a(false);
    localzbur.b(false);
    localzbur.b((byte)3);
    a(localzbub);
  }
  
  void a(int paramInt1, int paramInt2, Style paramStyle)
  {
    int i1 = 0;
    int i2 = 0;
    if ((paramInt1 >= this.c.i) && (paramInt1 <= this.c.j) && (paramInt2 >= this.c.k) && (paramInt2 <= this.c.l)) {
      i1 = 1;
    }
    if (this.z > 0)
    {
      int i3 = this.c.i - this.z - 1;
      int i7 = this.c.i - 2;
      int i10 = this.c.k;
      int i11 = this.c.k + 1;
      if ((paramInt1 >= i3) && (paramInt1 <= i7) && (paramInt2 >= i10) && (paramInt2 <= i11))
      {
        i2 = 1;
        i1 = 1;
      }
    }
    if (i1 == 0) {
      return;
    }
    Object localObject1;
    if ((this.u == null) || (this.v == null))
    {
      localObject1 = new zaca(this.A.c, 3, new CalculationOptions());
      this.A.i = this.A.a(-1);
      this.A.b();
      this.A.e((zaca)localObject1);
      this.A.d((zaca)localObject1);
      this.A.a();
      ((zaca)localObject1).c();
      a();
    }
    Object localObject2;
    Object localObject4;
    if (i2 != 0)
    {
      if (paramInt2 == this.c.k)
      {
        localObject1 = new zbub(this.c.ag);
        this.c.ag.a((zbub)localObject1);
        ((zbub)localObject1).b = this.f.getDxfs().a(paramStyle);
        localObject2 = new zbur();
        ((zbub)localObject1).c = ((zbur)localObject2);
        ((zbur)localObject2).a = ((byte)(paramInt1 - (this.c.i - 1 - this.z)));
        ((zbur)localObject2).a((byte)4);
        ((zbur)localObject2).a(false);
        ((zbur)localObject2).b(true);
        ((zbur)localObject2).b = ((byte)this.c.getPageFields().get(((zbur)localObject2).a & 0xFF).getBaseIndex());
        ((zbur)localObject2).b((byte)5);
        a((zbub)localObject1);
      }
      else
      {
        localObject1 = new zbub(this.c.ag);
        this.c.ag.a((zbub)localObject1);
        ((zbub)localObject1).b = this.f.getDxfs().a(paramStyle);
        localObject2 = new zbur();
        ((zbub)localObject1).c = ((zbur)localObject2);
        ((zbur)localObject2).a(false);
        ((zbur)localObject2).b(true);
        localObject4 = new zbtz();
        zf.a(((zbur)localObject2).e, localObject4);
        ((zbtz)localObject4).a(1);
        ((zbtz)localObject4).b(this.c.getPageFields().get(paramInt1 - (this.c.i - 1 - this.z)).getBaseIndex());
        a((zbub)localObject1);
      }
    }
    else
    {
      Object localObject5;
      int i13;
      int i14;
      int i15;
      zbtz localzbtz2;
      if (this.x > 0)
      {
        int i4 = this.c.n - 2;
        if (this.w == 0) {
          i4 = this.c.n - 1;
        }
        if ((paramInt1 >= this.c.i) && (paramInt1 <= i4) && (paramInt2 >= this.c.k) && (paramInt2 <= this.c.o - 1))
        {
          localObject2 = new zbub(this.c.ag);
          this.c.ag.a((zbub)localObject2);
          ((zbub)localObject2).b = this.f.getDxfs().a(paramStyle);
          localObject4 = new zbur();
          ((zbub)localObject2).c = ((zbur)localObject4);
          ((zbur)localObject4).a(false);
          ((zbur)localObject4).b(true);
          ((zbur)localObject4).b((byte)4);
          ((zbur)localObject4).h(true);
          ((zbur)localObject4).f = (((zbur)localObject4).g = (byte)(paramInt1 - this.c.i));
          ((zbur)localObject4).h = (((zbur)localObject4).i = (byte)(paramInt2 - this.c.k));
          a((zbub)localObject2);
          return;
        }
        if ((paramInt1 == this.c.i) && (paramInt2 >= this.c.o) && (paramInt2 <= this.c.o + this.x - 1))
        {
          localObject2 = new zbub(this.c.ag);
          this.c.ag.a((zbub)localObject2);
          ((zbub)localObject2).b = this.f.getDxfs().a(paramStyle);
          localObject4 = new zbur();
          ((zbub)localObject2).c = ((zbur)localObject4);
          ((zbur)localObject4).a(false);
          ((zbur)localObject4).b(true);
          ((zbur)localObject4).b((byte)5);
          ((zbur)localObject4).a = ((byte)(paramInt2 - this.c.o));
          ((zbur)localObject4).a((byte)2);
          ((zbur)localObject4).b = ((byte)this.c.getColumnFields().get(((zbur)localObject4).a & 0xFF).getBaseIndex());
          a((zbub)localObject2);
          return;
        }
        if ((paramInt1 == this.c.i) && (paramInt2 >= this.c.o + this.x) && (paramInt2 <= this.c.l))
        {
          localObject2 = new zbub(this.c.ag);
          this.c.ag.a((zbub)localObject2);
          ((zbub)localObject2).b = this.f.getDxfs().a(paramStyle);
          localObject4 = new zbur();
          ((zbub)localObject2).c = ((zbur)localObject4);
          ((zbur)localObject4).a(false);
          ((zbur)localObject4).b(true);
          ((zbur)localObject4).b((byte)6);
          ((zbur)localObject4).h(true);
          ((zbur)localObject4).f = (((zbur)localObject4).g = 0);
          ((zbur)localObject4).h = (((zbur)localObject4).i = (byte)(paramInt2 - this.c.o - this.x));
          a((zbub)localObject2);
          return;
        }
        if ((paramInt1 > this.c.i) && (paramInt1 < this.c.n) && (paramInt2 >= this.c.o))
        {
          int i8 = paramInt2 - this.c.o;
          if (i8 < this.v.size())
          {
            localObject4 = new zbub(this.c.ag);
            this.c.ag.a((zbub)localObject4);
            ((zbub)localObject4).b = this.f.getDxfs().a(paramStyle);
            localObject5 = new zbur();
            ((zbub)localObject4).c = ((zbur)localObject5);
            ((zbur)localObject5).a(false);
            ((zbur)localObject5).b(true);
            ((zbur)localObject5).e(false);
            zbug localzbug1 = (zbug)this.v.get(i8);
            if (localzbug1.c == 13)
            {
              ((zbur)localObject5).d(true);
              ((zbur)localObject5).h(true);
              ((zbur)localObject5).h = (((zbur)localObject5).i = -1);
              ((zbur)localObject5).f = (((zbur)localObject5).g = (byte)(paramInt1 - this.c.i - 1 - localzbug1.b));
              a((zbub)localObject4);
              return;
            }
            if (paramInt1 - this.c.i - 1 >= localzbug1.b)
            {
              i13 = 0;
              i14 = Math.min(paramInt1 - this.c.i - 1, localzbug1.e - 1);
              for (i15 = 0; i15 <= i14; i15++)
              {
                localzbtz2 = new zbtz();
                zf.a(((zbur)localObject5).e, localzbtz2);
                localzbtz2.b(this.c.getColumnFields().get(i15).getBaseIndex());
                localzbtz2.b((byte)i15);
                localzbtz2.a((byte)2);
                localzbtz2.a(true);
                if (i15 == localzbug1.e - 1)
                {
                  if ((localzbug1.c != 0) && (localzbug1.c != 14) && (localzbug1.c != 13))
                  {
                    i13 = 1;
                    localzbtz2.a(f(localzbug1.c));
                  }
                  else
                  {
                    localzbtz2.a(1);
                  }
                }
                else {
                  localzbtz2.a(1);
                }
                zf.a(localzbtz2.c, Integer.valueOf(localzbug1.f[i15]));
              }
              if (i13 != 0)
              {
                ((zbur)localObject5).h(true);
                ((zbur)localObject5).h = (((zbur)localObject5).i = -1);
                ((zbur)localObject5).f = (((zbur)localObject5).g = (byte)(paramInt1 - this.c.i - 1 - localzbug1.b));
              }
            }
            else
            {
              i13 = paramInt1 - this.c.i - 1;
              i14 = b(i8, i13, 2);
              localzbug1 = (zbug)this.v.get(i14);
              for (i15 = 0; i15 <= i13; i15++)
              {
                localzbtz2 = new zbtz();
                zf.a(((zbur)localObject5).e, localzbtz2);
                localzbtz2.b(this.c.getColumnFields().get(i15).getBaseIndex());
                localzbtz2.b((byte)i15);
                localzbtz2.a((byte)2);
                localzbtz2.a(true);
                localzbtz2.a(1);
                zf.a(localzbtz2.c, Integer.valueOf(localzbug1.f[i15]));
              }
              ((zbur)localObject5).h(true);
              ((zbur)localObject5).h = (((zbur)localObject5).i = (byte)(i8 - i14));
              ((zbur)localObject5).f = (((zbur)localObject5).g = -1);
            }
            a((zbub)localObject4);
            return;
          }
        }
      }
      zbub localzbub1;
      Object localObject3;
      if ((this.x == 0) && (this.w > 0) && (this.s != 1) && (paramInt1 == this.c.n - 1) && (paramInt2 >= this.c.o))
      {
        localzbub1 = new zbub(this.c.ag);
        this.c.ag.a(localzbub1);
        localzbub1.b = this.f.getDxfs().a(paramStyle);
        localObject3 = new zbur();
        localzbub1.c = ((zbur)localObject3);
        ((zbur)localObject3).a(false);
        ((zbur)localObject3).a((byte)8);
        ((zbur)localObject3).a = ((byte)(paramInt2 - this.c.o));
        a(localzbub1);
        return;
      }
      if (this.w > 0)
      {
        if ((paramInt1 == this.c.n - 1) && (paramInt2 < this.c.o))
        {
          localzbub1 = new zbub(this.c.ag);
          this.c.ag.a(localzbub1);
          localzbub1.b = this.f.getDxfs().a(paramStyle);
          localObject3 = new zbur();
          localzbub1.c = ((zbur)localObject3);
          ((zbur)localObject3).a(false);
          ((zbur)localObject3).b(true);
          ((zbur)localObject3).b((byte)5);
          ((zbur)localObject3).a = ((byte)(paramInt2 - this.c.k));
          ((zbur)localObject3).a((byte)1);
          ((zbur)localObject3).b = ((byte)this.c.getRowFields().get(((zbur)localObject3).a & 0xFF).getBaseIndex());
          a(localzbub1);
          return;
        }
        if ((paramInt1 >= this.c.n) && (paramInt2 < this.c.o))
        {
          int i5 = paramInt1 - this.c.n;
          if (i5 < this.u.size())
          {
            localObject3 = new zbub(this.c.ag);
            this.c.ag.a((zbub)localObject3);
            ((zbub)localObject3).b = this.f.getDxfs().a(paramStyle);
            localObject4 = new zbur();
            ((zbub)localObject3).c = ((zbur)localObject4);
            ((zbur)localObject4).a(false);
            ((zbur)localObject4).b(true);
            localObject5 = (zbug)this.u.get(i5);
            int i12 = c(((zbug)localObject5).b);
            if (((zbug)localObject5).c == 13)
            {
              ((zbur)localObject4).c(true);
              ((zbur)localObject4).h(true);
              ((zbur)localObject4).h = (((zbur)localObject4).i = (byte)(paramInt2 - this.c.k - i12));
              ((zbur)localObject4).f = (((zbur)localObject4).g = -1);
              a((zbub)localObject3);
              return;
            }
            if (paramInt2 - this.c.k >= i12)
            {
              i13 = Math.min(((zbug)localObject5).e - 1, paramInt2 - this.c.k);
              i14 = 0;
              for (i15 = 0; i15 <= i13; i15++)
              {
                localzbtz2 = new zbtz();
                zf.a(((zbur)localObject4).e, localzbtz2);
                localzbtz2.b(this.c.getRowFields().get(i15).getBaseIndex());
                localzbtz2.b((byte)i15);
                localzbtz2.a((byte)1);
                localzbtz2.a(true);
                if (i15 == ((zbug)localObject5).e - 1)
                {
                  if ((((zbug)localObject5).c != 0) && (((zbug)localObject5).c != 14) && (((zbug)localObject5).c != 13))
                  {
                    i14 = 1;
                    localzbtz2.a(f(((zbug)localObject5).c));
                  }
                  else
                  {
                    localzbtz2.a(1);
                  }
                }
                else {
                  localzbtz2.a(1);
                }
                zf.a(localzbtz2.c, Integer.valueOf(localObject5.f[i15]));
              }
              if ((i14 != 0) || ((i13 < this.w - 1) && (this.c.getRowFields().get(i13).getShowInOutlineForm())))
              {
                ((zbur)localObject4).h(true);
                ((zbur)localObject4).h = (((zbur)localObject4).i = (byte)(paramInt2 - this.c.k - i12));
                ((zbur)localObject4).f = (((zbur)localObject4).g = -1);
              }
            }
            else
            {
              i13 = paramInt2 - this.c.k;
              i14 = e(i13);
              i15 = b(i5, i14, 1);
              localObject5 = (zbug)this.u.get(i15);
              for (int i16 = 0; i16 < ((zbug)localObject5).e; i16++)
              {
                zbtz localzbtz3 = new zbtz();
                zf.a(((zbur)localObject4).e, localzbtz3);
                localzbtz3.b(this.c.getRowFields().get(i16).getBaseIndex());
                localzbtz3.b((byte)i16);
                localzbtz3.a((byte)1);
                localzbtz3.a(true);
                localzbtz3.a(1);
                zf.a(localzbtz3.c, Integer.valueOf(localObject5.f[i16]));
              }
              ((zbur)localObject4).h(true);
              ((zbur)localObject4).h = (((zbur)localObject4).i = -1);
              ((zbur)localObject4).f = (((zbur)localObject4).g = (byte)(i5 - i15));
            }
            a((zbub)localObject3);
          }
          return;
        }
      }
      if ((this.w == 0) && (this.x > 0) && (this.s != 2) && (paramInt1 == this.c.n) && (paramInt2 == this.c.o - 1))
      {
        zbub localzbub2 = new zbub(this.c.ag);
        this.c.ag.a(localzbub2);
        localzbub2.b = this.f.getDxfs().a(paramStyle);
        localObject3 = new zbur();
        localzbub2.c = ((zbur)localObject3);
        ((zbur)localObject3).a(false);
        ((zbur)localObject3).b(true);
        ((zbur)localObject3).a((byte)8);
        ((zbur)localObject3).a = 0;
        a(localzbub2);
        return;
      }
      if ((this.w > 0) || (this.x > 0))
      {
        if ((paramInt1 >= this.c.n) && (paramInt2 >= this.c.o))
        {
          int i6 = paramInt1 - this.c.n;
          int i9 = paramInt2 - this.c.o;
          localObject4 = new zbub(this.c.ag);
          this.c.ag.a((zbub)localObject4);
          ((zbub)localObject4).b = this.f.getDxfs().a(paramStyle);
          localObject5 = new zbur();
          ((zbub)localObject4).c = ((zbur)localObject5);
          ((zbur)localObject5).a(true);
          ((zbur)localObject5).b(false);
          zbug localzbug2;
          zbtz localzbtz1;
          if ((i6 < this.u.size()) && (this.w > 0))
          {
            localzbug2 = (zbug)this.u.get(i6);
            if (localzbug2.c == 13) {
              ((zbur)localObject5).c(true);
            } else {
              for (i13 = 0; i13 < localzbug2.e; i13++)
              {
                localzbtz1 = new zbtz();
                zf.a(((zbur)localObject5).e, localzbtz1);
                localzbtz1.b(this.c.getRowFields().get(i13).getBaseIndex());
                localzbtz1.b((byte)i13);
                localzbtz1.a((byte)1);
                if (i13 == localzbug2.e - 1)
                {
                  if ((localzbug2.c != 0) && (localzbug2.c != 14) && (localzbug2.c != 13))
                  {
                    localzbtz1.a(f(localzbug2.c));
                  }
                  else
                  {
                    ((zbur)localObject5).j = true;
                    localzbtz1.a(1);
                  }
                }
                else {
                  localzbtz1.a(1);
                }
                zf.a(localzbtz1.c, Integer.valueOf(a(localzbug2.f[i13], 1, this.c.getRowFields().get(i13).getPosition())));
              }
            }
          }
          if ((i9 < this.v.size()) && (this.x > 0))
          {
            localzbug2 = (zbug)this.v.get(i9);
            if (localzbug2.c == 13) {
              ((zbur)localObject5).d(true);
            } else {
              for (i13 = 0; i13 < localzbug2.e; i13++)
              {
                localzbtz1 = new zbtz();
                zf.a(((zbur)localObject5).e, localzbtz1);
                localzbtz1.b(this.c.getColumnFields().get(i13).getBaseIndex());
                localzbtz1.b((byte)i13);
                localzbtz1.a((byte)2);
                if (i13 == localzbug2.e - 1)
                {
                  if ((localzbug2.c != 0) && (localzbug2.c != 14) && (localzbug2.c != 13)) {
                    localzbtz1.a(f(localzbug2.c));
                  } else {
                    localzbtz1.a(1);
                  }
                }
                else {
                  localzbtz1.a(1);
                }
                zf.a(localzbtz1.c, Integer.valueOf(a(localzbug2.f[i13], 2, this.c.getColumnFields().get(i13).getPosition())));
              }
            }
          }
          a((zbub)localObject4);
          return;
        }
        return;
      }
    }
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = null;
    if ((paramInt2 == 1) && (this.A.z != null)) {
      arrayOfInt = this.A.z[paramInt3];
    } else if ((paramInt2 == 2) && (this.A.y != null)) {
      arrayOfInt = this.A.y[paramInt3];
    }
    if (arrayOfInt == null) {
      return paramInt1;
    }
    if (paramInt1 < arrayOfInt.length) {
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        if (arrayOfInt[i1] == paramInt1) {
          return i1;
        }
      }
    }
    return -1;
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    ArrayList localArrayList = null;
    if (paramInt3 == 1) {
      localArrayList = this.u;
    } else {
      localArrayList = this.v;
    }
    for (int i1 = paramInt1 - 1; i1 >= 0; i1++)
    {
      zbug localzbug = (zbug)localArrayList.get(i1);
      if (localzbug.b <= paramInt2) {
        return i1;
      }
    }
    return 0;
  }
  
  private int e(int paramInt)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.w - 1; i2++) {
      if ((!this.c.getRowFields().get(i2).getShowInOutlineForm()) || (!this.c.getRowFields().get(i2).getShowCompact()))
      {
        i1++;
        if (i1 > paramInt) {
          return i2;
        }
      }
    }
    return this.w - 1;
  }
  
  private int f(int paramInt)
  {
    int i1 = 1;
    switch (paramInt)
    {
    case 5: 
      i1 = 16;
      break;
    case 3: 
      i1 = 8;
      break;
    case 4: 
      i1 = 256;
      break;
    case 1: 
      i1 = 2;
      break;
    case 6: 
      i1 = 32;
      break;
    case 7: 
      i1 = 64;
      break;
    case 8: 
      i1 = 128;
      break;
    case 10: 
      i1 = 1024;
      break;
    case 9: 
      i1 = 512;
      break;
    case 2: 
      i1 = 4;
      break;
    case 12: 
      i1 = 4096;
      break;
    case 11: 
      i1 = 2048;
    }
    return i1;
  }
  
  void e()
  {
    this.f.p().i();
    ConditionalFormattingCollection localConditionalFormattingCollection = this.e.getConditionalFormattings();
    int i1 = localConditionalFormattingCollection.getCount();
    int i2 = this.c.getPivotFormatConditions().getCount();
    if ((i1 == 0) || (i2 == 0)) {
      return;
    }
    for (int i3 = 0; i3 < i2; i3++)
    {
      PivotFormatCondition localPivotFormatCondition = this.c.getPivotFormatConditions().get(i3);
      ArrayList localArrayList1 = localPivotFormatCondition.b;
      ArrayList localArrayList2 = new ArrayList();
      Object localObject;
      for (int i4 = 0; i4 < localArrayList1.size(); i4++)
      {
        localObject = (zbur)localArrayList1.get(i4);
        ArrayList localArrayList3 = a((zbur)localObject);
        localArrayList3 = a(localArrayList3);
        if ((localArrayList3.size() > 0) && ((localArrayList3.get(0) instanceof CellArea))) {
          zf.a(localArrayList2, localArrayList3.get(0));
        }
      }
      if (localArrayList2.size() > 0) {
        for (i4 = 0; i4 < i1; i4++)
        {
          localObject = localConditionalFormattingCollection.get(i4);
          if ((((FormatConditionCollection)localObject).d) && (((FormatConditionCollection)localObject).getCount() > 0) && (((FormatConditionCollection)localObject).get(0).getPriority() == localPivotFormatCondition.c))
          {
            ((FormatConditionCollection)localObject).b = localArrayList2;
            break;
          }
        }
      }
    }
  }
  
  private ArrayList a(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = -1;
    int i2 = -1;
    int i3 = 1;
    int i4 = 1;
    int i5 = -1;
    int i6 = -1;
    for (int i7 = 0; i7 < paramArrayList.size(); i7++)
    {
      i5 = ((int[])(int[])paramArrayList.get(i7))[0];
      i6 = ((int[])(int[])paramArrayList.get(i7))[1];
      if ((i5 >= this.c.n) && (i6 >= this.c.o))
      {
        Cell localCell = this.d.a(i5, i6, false);
        if (-1 == i1) {
          i1 = localCell.getRow();
        }
        if (-1 == i2) {
          i2 = localCell.getColumn();
        }
        if ((localCell.getRow() != i1) || (localCell.getColumn() != i2))
        {
          CellArea localCellArea;
          Object localObject;
          if ((localCell.getRow() == i1 + i3) && (localCell.getColumn() == i2))
          {
            i3++;
            if (i7 == paramArrayList.size() - 1)
            {
              localCellArea = CellArea.createCellArea(i1, i2, i1 + i3 - 1, i2 + i4 - 1);
              localObject = localArrayList.get(localArrayList.size() - 1);
              if ((!(localObject instanceof CellArea)) && (((int[])(int[])localObject)[0] == i1) && (((int[])(int[])localObject)[1] == i2)) {
                localArrayList.remove(localArrayList.size() - 1);
              }
              zf.a(localArrayList, localCellArea);
              i1 = i5;
              i2 = i6;
              i3 = 1;
              i4 = 1;
            }
          }
          else if ((localCell.getRow() == i1) && (localCell.getColumn() == i2 + i4))
          {
            i4++;
            if (i7 == paramArrayList.size() - 1)
            {
              localCellArea = CellArea.createCellArea(i1, i2, i1 + i3 - 1, i2 + i4 - 1);
              localObject = localArrayList.get(localArrayList.size() - 1);
              if ((!(localObject instanceof CellArea)) && (((int[])(int[])localObject)[0] == i1) && (((int[])(int[])localObject)[1] == i2)) {
                localArrayList.remove(localArrayList.size() - 1);
              }
              zf.a(localArrayList, localCellArea);
              i1 = i5;
              i2 = i6;
              i3 = 1;
              i4 = 1;
            }
          }
          else if ((localCell.getRow() == i1 + i3 - 1) && (localCell.getColumn() < i2 + i4) && (i7 == paramArrayList.size() - 1))
          {
            localCellArea = CellArea.createCellArea(i1, i2, i1 + i3 - 1, i2 + i4 - 1);
            localObject = localArrayList.get(localArrayList.size() - 1);
            if ((!(localObject instanceof CellArea)) && (((int[])(int[])localObject)[0] == i1) && (((int[])(int[])localObject)[1] == i2)) {
              localArrayList.remove(localArrayList.size() - 1);
            }
            zf.a(localArrayList, localCellArea);
            i1 = i5;
            i2 = i6;
            i3 = 1;
            i4 = 1;
          }
        }
        else
        {
          zf.a(localArrayList, paramArrayList.get(i7));
        }
      }
    }
    return localArrayList;
  }
  
  void f()
  {
    if (this.b) {
      return;
    }
    for (int i1 = 0; i1 < this.c.ag.getCount(); i1++)
    {
      zbub localzbub = this.c.ag.a(i1);
      a(localzbub);
    }
    if (this.c.getMergeLabels())
    {
      if (I()) {
        H();
      }
      G();
    }
  }
  
  private void G()
  {
    Cell localCell = null;
    String str = null;
    Style localStyle = null;
    int i1 = -1;
    int i4;
    int i5;
    int i6;
    Range localRange2;
    for (int i2 = this.c.k; i2 < this.c.o; i2++)
    {
      i3 = 1;
      i4 = 0;
      for (i5 = this.c.n; i5 <= this.c.j; i5++)
      {
        localCell = this.d.get(i5, i2);
        str = localCell.getStringValue();
        Range localRange1;
        if (("".equals(str)) || (null == str))
        {
          if ((i4 != 0) && (!a(localCell)) && (localCell.getRow() == i1 + i3))
          {
            i3++;
            if (i5 == this.c.j)
            {
              this.d.merge(i1, i5, i3, 1);
              localRange1 = this.d.createRange(i1, i5, i3, 1);
              localStyle.setHorizontalAlignment(1);
              localStyle.setVerticalAlignment(1);
              localStyle.setTextWrapped(true);
              localRange1.setStyle(localStyle);
              i1 = i5;
              localStyle = localCell.getStyle();
              i3 = 1;
            }
          }
        }
        else
        {
          i4 = 1;
          int i7;
          if (i3 > 1)
          {
            this.d.merge(i1, i2, i3, 1);
            localRange1 = this.d.createRange(i1, i2, i3, 1);
            localStyle.setHorizontalAlignment(1);
            localStyle.setVerticalAlignment(1);
            localStyle.setTextWrapped(true);
            localRange1.setStyle(localStyle);
            i1 = i5;
            localStyle = localCell.getStyle();
            i3 = 1;
            if (((i1 + 1 <= this.c.j) && (this.d.get(i1 + 1, i2).getStringValue() != null) && (!this.d.get(i1 + 1, i2).getStringValue().equals(""))) || (i1 == this.c.j) || (a(this.d.get(i1 + 1, i2))))
            {
              i7 = 1;
              for (int i9 = i2 + 1; (i9 < this.c.o) && ((this.d.get(i1, i9).getStringValue() == null) || ("".equals(this.d.get(i1, i9).getStringValue()))); i9++) {
                i7++;
              }
              if (i7 > 1)
              {
                this.d.merge(i1, i2, 1, i7);
                Range localRange3 = this.d.createRange(i1, i2, 1, i7);
                localStyle.setHorizontalAlignment(1);
                localStyle.setVerticalAlignment(1);
                localStyle.setTextWrapped(true);
                localRange3.setStyle(localStyle);
              }
            }
          }
          else
          {
            i1 = i5;
            localStyle = localCell.getStyle();
            if (((i1 + 1 <= this.c.j) && (this.d.get(i1 + 1, i2).getStringValue() != null) && (!this.d.get(i1 + 1, i2).getStringValue().equals(""))) || (i1 == this.c.j) || (a(this.d.get(i1 + 1, i2))))
            {
              i6 = 1;
              for (i7 = i2 + 1; (i7 < this.c.o) && ((this.d.get(i1, i7).getStringValue() == null) || ("".equals(this.d.get(i1, i7).getStringValue()))); i7++) {
                i6++;
              }
              if (i6 > 1)
              {
                this.d.merge(i1, i2, 1, i6);
                localRange2 = this.d.createRange(i1, i2, 1, i6);
                localStyle.setHorizontalAlignment(1);
                localStyle.setVerticalAlignment(1);
                localStyle.setTextWrapped(true);
                localRange2.setStyle(localStyle);
              }
            }
          }
        }
      }
    }
    i2 = this.x > 0 ? this.c.i + 1 : this.c.i;
    for (int i3 = this.c.o; i3 <= this.c.l; i3++)
    {
      i4 = 1;
      i5 = 0;
      for (i6 = i2; i6 < this.c.n; i6++)
      {
        localCell = this.d.get(i6, i3);
        str = localCell.getStringValue();
        if (("".equals(str)) || (null == str))
        {
          if ((i5 != 0) && (!a(localCell)))
          {
            i4++;
            if (i6 == this.c.n - 1)
            {
              this.d.merge(i1, i3, i4, 1);
              localRange2 = this.d.createRange(i1, i3, i4, 1);
              localStyle.setHorizontalAlignment(1);
              localStyle.setVerticalAlignment(1);
              localStyle.setTextWrapped(true);
              localRange2.setStyle(localStyle);
              i1 = i6;
              localStyle = localCell.getStyle();
              i4 = 1;
            }
          }
        }
        else
        {
          i5 = 1;
          int i10;
          if (i4 > 1)
          {
            this.d.merge(i1, i3, i4, 1);
            localRange2 = this.d.createRange(i1, i3, i4, 1);
            localStyle.setHorizontalAlignment(1);
            localStyle.setVerticalAlignment(1);
            localStyle.setTextWrapped(true);
            localRange2.setStyle(localStyle);
            i1 = i6;
            localStyle = localCell.getStyle();
            i4 = 1;
            if (((i1 + 1 < this.c.n) && (this.d.get(i1 + 1, i3).getStringValue() != null) && (!this.d.get(i1 + 1, i3).getStringValue().equals(""))) || (a(this.d.get(i1 + 1, i3))))
            {
              i10 = 1;
              for (int i11 = i3 + 1; (i11 < this.c.l) && ((this.d.get(i1, i11).getStringValue() == null) || ("".equals(this.d.get(i1, i11).getStringValue()))); i11++) {
                i10++;
              }
              if (i10 > 1)
              {
                this.d.merge(i1, i3, 1, i10);
                Range localRange5 = this.d.createRange(i1, i3, 1, i10);
                localStyle.setHorizontalAlignment(1);
                localStyle.setVerticalAlignment(1);
                localStyle.setTextWrapped(true);
                localRange5.setStyle(localStyle);
              }
            }
          }
          else
          {
            i1 = i6;
            localStyle = localCell.getStyle();
            if (((i1 + 1 < this.c.n) && (this.d.get(i1 + 1, i3).getStringValue() != null) && (!this.d.get(i1 + 1, i3).getStringValue().equals(""))) || (a(this.d.get(i1 + 1, i3))))
            {
              int i8 = 1;
              for (i10 = i3 + 1; (i10 < this.c.l) && ((this.d.get(i1, i10).getStringValue() == null) || ("".equals(this.d.get(i1, i10).getStringValue()))); i10++) {
                i8++;
              }
              if (i8 > 1)
              {
                this.d.merge(i1, i3, 1, i8);
                Range localRange4 = this.d.createRange(i1, i3, 1, i8);
                localStyle.setHorizontalAlignment(1);
                localStyle.setVerticalAlignment(1);
                localStyle.setTextWrapped(true);
                localRange4.setStyle(localStyle);
              }
            }
          }
        }
      }
    }
  }
  
  private boolean a(Cell paramCell)
  {
    zapd localzapd = this.d.o();
    if (null != localzapd) {
      for (int i1 = 0; i1 < localzapd.getCount(); i1++)
      {
        CellArea localCellArea = localzapd.a(i1);
        if ((localCellArea.StartRow >= this.c.i) && (localCellArea.EndRow <= this.c.j) && (localCellArea.StartColumn >= this.c.k) && (localCellArea.EndColumn <= this.c.l) && (paramCell.getRow() >= localCellArea.StartRow) && (paramCell.getRow() <= localCellArea.EndRow) && (paramCell.getColumn() >= localCellArea.StartColumn) && (paramCell.getColumn() <= localCellArea.EndColumn)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void H()
  {
    zapd localzapd = this.d.o();
    if (null != localzapd) {
      for (int i1 = 0; i1 < localzapd.getCount(); i1++)
      {
        CellArea localCellArea = localzapd.a(i1);
        if ((localCellArea.StartRow >= this.c.i) && (localCellArea.EndRow <= this.c.j) && (localCellArea.StartColumn >= this.c.k) && (localCellArea.EndColumn <= this.c.l))
        {
          localzapd.removeAt(i1);
          i1--;
        }
      }
    }
  }
  
  private boolean I()
  {
    zapd localzapd = this.d.o();
    if (null != localzapd) {
      for (int i1 = 0; i1 < localzapd.getCount(); i1++)
      {
        CellArea localCellArea = localzapd.a(i1);
        if ((localCellArea.StartRow >= this.c.i) && (localCellArea.EndRow <= this.c.j) && (localCellArea.StartColumn >= this.c.k) && (localCellArea.EndColumn <= this.c.l)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void a(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle2.isModified(11))
    {
      if (paramStyle2.isModified(13)) {
        paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, paramStyle2.getFont().n());
      }
      if (paramStyle2.isModified(12)) {
        paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
      }
      if (paramStyle2.isModified(16))
      {
        paramStyle1.getFont().e(paramStyle2.getFont());
        paramStyle1.b(16);
      }
      if (paramStyle2.isModified(18)) {
        paramStyle1.getFont().setItalic(paramStyle2.getFont().isItalic());
      }
      if (paramStyle2.isModified(17)) {
        paramStyle1.getFont().setBold(paramStyle2.getFont().isBold());
      }
      if (paramStyle2.isModified(19)) {
        paramStyle1.getFont().setUnderline(paramStyle2.getFont().getUnderline());
      }
      if (paramStyle2.isModified(23)) {
        paramStyle1.getFont().a(paramStyle2.getFont().f());
      }
      if (paramStyle2.isModified(20)) {
        paramStyle1.getFont().setStrikeout(paramStyle2.getFont().isStrikeout());
      }
    }
    if (paramStyle2.isModified(1))
    {
      if ((paramStyle2.isModified(2)) && (paramStyle2.getBorders().getByBorderType(1).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().getByBorderType(1));
        paramStyle1.b(2);
      }
      if ((paramStyle2.isModified(3)) && (paramStyle2.getBorders().getByBorderType(2).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().getByBorderType(2));
        paramStyle1.b(3);
      }
      if ((paramStyle2.isModified(4)) && (paramStyle2.getBorders().getByBorderType(4).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().getByBorderType(4));
        paramStyle1.b(4);
      }
      if ((paramStyle2.isModified(5)) && (paramStyle2.getBorders().getByBorderType(8).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().getByBorderType(8));
        paramStyle1.b(5);
      }
      if ((paramStyle2.isModified(10)) && (paramStyle2.getBorders().getByBorderType(32).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(32).a(paramStyle2.getBorders().getByBorderType(32));
        paramStyle1.b(10);
      }
      if ((paramStyle2.isModified(9)) && (paramStyle2.getBorders().getByBorderType(16).getLineStyle() != 0))
      {
        paramStyle1.getBorders().getByBorderType(16).a(paramStyle2.getBorders().getByBorderType(16));
        paramStyle1.b(9);
      }
    }
    if (paramStyle2.isModified(32))
    {
      if (paramStyle1.isGradient()) {
        paramStyle1.setGradient(false);
      }
      if (paramStyle2.isModified(33)) {
        paramStyle1.setPattern(paramStyle2.getPattern());
      }
      if (paramStyle2.isModified(34))
      {
        paramStyle1.b.f(paramStyle2.b);
        paramStyle1.b(34);
        if ((paramStyle1.getPattern() == 0) && (!paramStyle2.isModified(35))) {
          paramStyle1.setPattern(1);
        }
      }
      if (paramStyle2.isModified(35)) {
        if ((paramStyle1.getPattern() == 0) || (paramStyle1.getPattern() == 1))
        {
          paramStyle1.setGradient(false);
          paramStyle1.setPattern(1);
          paramStyle1.b.f(paramStyle2.a);
          paramStyle1.b(34);
        }
        else
        {
          paramStyle1.a.f(paramStyle2.a);
          paramStyle1.b(35);
        }
      }
    }
    if (paramStyle2.isGradient())
    {
      paramStyle1.setGradient(true);
      paramStyle1.h(paramStyle2.z());
      paramStyle1.g(paramStyle2.y());
      paramStyle1.setForegroundColor(paramStyle2.getForegroundColor());
      paramStyle1.b(34);
      paramStyle1.setBackgroundColor(paramStyle2.getBackgroundColor());
      paramStyle1.b(35);
    }
    if (paramStyle2.isModified(25)) {
      paramStyle1.setHorizontalAlignment(paramStyle2.getHorizontalAlignment());
    }
    if (paramStyle2.isModified(26)) {
      paramStyle1.setVerticalAlignment(paramStyle2.getVerticalAlignment());
    }
    if (paramStyle2.isModified(28)) {
      paramStyle1.setRotationAngle(paramStyle2.getRotationAngle());
    }
    if (paramStyle2.isModified(27)) {
      paramStyle1.setIndentLevel(paramStyle2.getIndentLevel());
    }
    if (paramStyle2.isModified(48))
    {
      int i1 = paramStyle1.getIndentLevel() + paramStyle2.p();
      i1 = i1 < 0 ? 0 : i1;
      paramStyle1.setIndentLevel(i1);
    }
    if (paramStyle2.isModified(24))
    {
      paramStyle1.b(paramStyle2.s());
      paramStyle1.f(paramStyle2.getNumber());
    }
    if (paramStyle2.isModified(29)) {
      paramStyle1.setTextWrapped(paramStyle2.isTextWrapped());
    }
    if (paramStyle2.isModified(30)) {
      paramStyle1.setShrinkToFit(paramStyle2.getShrinkToFit());
    }
  }
  
  private void a(zbub paramzbub)
  {
    this.f.p().i();
    Style localStyle1 = paramzbub.a();
    int i1 = paramzbub.a & 0xFF;
    ArrayList localArrayList = a(paramzbub.c);
    for (int i2 = 0; i2 < localArrayList.size(); i2++)
    {
      int i3 = ((int[])(int[])localArrayList.get(i2))[0];
      int i4 = ((int[])(int[])localArrayList.get(i2))[1];
      if ((i3 >= 0) && (i4 >= 0))
      {
        Cell localCell = this.d.a(i3, i4, false);
        if (i1 == 1)
        {
          Style localStyle2 = localCell.getStyle();
          if (localStyle1 != null) {
            a(localStyle2, localStyle1);
          }
          if (this.c.getMergeLabels()) {
            if (localCell.getRow() < this.c.n)
            {
              localStyle2.setHorizontalAlignment(1);
              if ((localCell.getRow() > this.c.i) && (localCell.getColumn() >= this.c.o))
              {
                localStyle2.setVerticalAlignment(1);
                localStyle2.setTextWrapped(true);
              }
            }
            else if (localCell.getColumn() < this.c.o)
            {
              localStyle2.setHorizontalAlignment(1);
              localStyle2.setVerticalAlignment(1);
              localStyle2.setTextWrapped(true);
            }
          }
          localCell.a(localStyle2, true);
        }
        else if (i1 == 0)
        {
          localCell.a(new Style(this.f));
        }
      }
    }
  }
  
  private ArrayList a(zbur paramzbur)
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramzbur.g() == 6)
    {
      int i1;
      if (paramzbur.j())
      {
        if ((paramzbur.h & 0xFF) == 255) {
          zf.a(localArrayList1, new int[] { this.c.i, this.c.l });
        } else {
          for (i1 = paramzbur.h & 0xFF; i1 <= (paramzbur.i & 0xFF); i1++) {
            zf.a(localArrayList1, new int[] { this.c.i, this.c.o + this.x + i1 });
          }
        }
      }
      else {
        for (i1 = this.c.o + this.x; i1 <= this.c.l; i1++) {
          zf.a(localArrayList1, new int[] { this.c.i, i1 });
        }
      }
    }
    else if (paramzbur.g() == 5)
    {
      if (paramzbur.f() == 1)
      {
        if (this.c.k + (paramzbur.a & 0xFF) < this.c.o) {
          zf.a(localArrayList1, new int[] { this.c.n - 1, this.c.k + (paramzbur.a & 0xFF) });
        }
      }
      else if (paramzbur.f() == 2) {
        zf.a(localArrayList1, new int[] { this.c.i, this.c.o + (paramzbur.a & 0xFF) });
      } else if (paramzbur.f() == 4) {
        zf.a(localArrayList1, new int[] { this.c.i - 1 - this.z + (paramzbur.a & 0xFF), this.c.k });
      }
    }
    else
    {
      int i2;
      int i3;
      if (paramzbur.g() == 4)
      {
        if (paramzbur.j())
        {
          ArrayList localArrayList2 = new ArrayList();
          ArrayList localArrayList3 = new ArrayList();
          if ((paramzbur.h & 0xFF) == 255) {
            zf.a(localArrayList2, Integer.valueOf(this.c.o - 1));
          } else {
            for (i4 = paramzbur.h & 0xFF; i4 <= (paramzbur.i & 0xFF); i4++) {
              zf.a(localArrayList2, Integer.valueOf(this.c.k + i4));
            }
          }
          if ((paramzbur.f & 0xFF) == 255) {
            zf.a(localArrayList3, Integer.valueOf(this.c.n - 2));
          } else {
            for (i4 = paramzbur.f & 0xFF; i4 <= (paramzbur.g & 0xFF); i4++) {
              zf.a(localArrayList3, Integer.valueOf(this.c.i + i4));
            }
          }
          for (int i4 = 0; i4 < localArrayList3.size(); i4++) {
            for (int i5 = 0; i5 < localArrayList2.size(); i5++) {
              zf.a(localArrayList1, new int[] { ((Integer)localArrayList3.get(i4)).intValue(), ((Integer)localArrayList2.get(i5)).intValue() });
            }
          }
        }
        else
        {
          for (i2 = this.c.i; i2 <= this.c.n - 2; i2++) {
            for (i3 = this.c.k; i3 <= this.c.o - 1; i3++) {
              zf.a(localArrayList1, new int[] { i2, i3 });
            }
          }
        }
      }
      else if (paramzbur.g() == 3)
      {
        if (this.z > 0) {
          for (i2 = this.c.i - 1 - this.z; i2 < this.c.i - 1; i2++) {
            for (i3 = this.c.k; i3 <= this.c.k + 1; i3++) {
              zf.a(localArrayList1, new int[] { i2, i3 });
            }
          }
        }
        for (i2 = this.c.i; i2 <= this.c.j; i2++) {
          for (i3 = this.c.k; i3 <= this.c.l; i3++) {
            zf.a(localArrayList1, new int[] { i2, i3 });
          }
        }
      }
      else if ((paramzbur.d()) || (paramzbur.c()))
      {
        if ((paramzbur.c()) && (paramzbur.d())) {
          a(paramzbur.e, localArrayList1, paramzbur, true, true);
        } else if (paramzbur.c())
        {
          if (paramzbur.a())
          {
            if (paramzbur.e.size() == 0)
            {
              if (this.c.getColumnGrand()) {
                for (i2 = this.c.k; i2 <= this.c.l; i2++) {
                  zf.a(localArrayList1, new int[] { this.c.j, i2 });
                }
              }
            }
            else {
              a(paramzbur.e, localArrayList1, paramzbur, true, false);
            }
          }
          else if (paramzbur.b())
          {
            a(paramzbur.e, localArrayList1, paramzbur, true);
          }
          else
          {
            if (this.c.o == this.c.l) {
              return localArrayList1;
            }
            for (i2 = this.c.k; i2 <= this.c.l; i2++) {
              zf.a(localArrayList1, new int[] { this.c.j, i2 });
            }
          }
        }
        else if (paramzbur.d()) {
          if (paramzbur.a())
          {
            if ((paramzbur.j) && ((paramzbur.e.size() == 0) || ((paramzbur.e.size() == 1) && ((((zbtz)paramzbur.e.get(0)).b() & 0xFFFF) == 65534)))) {
              for (i2 = this.c.i; i2 <= this.c.j; i2++) {
                zf.a(localArrayList1, new int[] { i2, this.c.l });
              }
            } else {
              a(paramzbur.e, localArrayList1, paramzbur, false, true);
            }
          }
          else if (paramzbur.b()) {
            a(paramzbur.e, localArrayList1, paramzbur, false);
          } else {
            for (i2 = this.c.i; i2 <= this.c.j; i2++) {
              zf.a(localArrayList1, new int[] { i2, this.c.l });
            }
          }
        }
      }
      else if (paramzbur.a())
      {
        a(paramzbur.e, localArrayList1, paramzbur.j);
      }
      else if (paramzbur.b())
      {
        a(paramzbur.e, localArrayList1, paramzbur);
      }
      else
      {
        a(paramzbur.e, localArrayList1, paramzbur);
        a(paramzbur.e, localArrayList1, paramzbur.j);
      }
    }
    return localArrayList1;
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, zbur paramzbur)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    a(paramArrayList1, localArrayList1, localArrayList2, localArrayList3);
    int i1;
    if ((localArrayList1.size() == 0) && (localArrayList2.size() == 0) && (localArrayList3.size() == 0))
    {
      if ((paramArrayList1.size() == 0) && (paramzbur.f() == 8) && (paramzbur.a == 0)) {
        if ((this.w == 0) && (this.x > 0) && (this.y == 1)) {
          zf.a(paramArrayList2, new int[] { this.c.n, this.c.k });
        } else if ((this.x == 0) && (this.w > 0) && (this.y == 1)) {
          zf.a(paramArrayList2, new int[] { this.c.i, this.c.o });
        } else if ((this.x == 0) && (this.w == 0)) {
          zf.a(paramArrayList2, new int[] { this.c.i, this.c.k });
        } else if (this.y != 0) {
          for (i1 = this.c.o; i1 <= this.c.l; i1++) {
            zf.a(paramArrayList2, new int[] { this.c.i, i1 });
          }
        }
      }
      return;
    }
    int i3;
    int i4;
    if (localArrayList3.size() > 0) {
      for (i1 = 0; i1 < localArrayList3.size(); i1++)
      {
        zbtz localzbtz = (zbtz)localArrayList3.get(i1);
        i3 = localzbtz.b() & 0xFFFF;
        if ((i3 != -2) && (localzbtz.c()))
        {
          i4 = this.c.getBaseFields().get(i3).getPosition();
          zf.a(paramArrayList2, new int[] { this.c.i - 1 - this.z + i4, this.c.k + 1 });
        }
      }
    }
    if ((localArrayList1.size() > 0) && (localArrayList2.size() > 0)) {
      return;
    }
    Object localObject;
    int i2;
    ArrayList localArrayList4;
    int i9;
    int i10;
    int i7;
    if (localArrayList1.size() > 0)
    {
      localObject = a(localArrayList1, 1, paramzbur.j);
      if (((ArrayList)localObject).size() == 0) {
        return;
      }
      i2 = (short)(((zbtz)localArrayList1.get(localArrayList1.size() - 1)).b() & 0xFFFF);
      i3 = 0;
      if (i2 == -2) {
        i3 = this.t;
      } else {
        i3 = this.c.getBaseFields().get(i2).getPosition();
      }
      i4 = c(i3);
      localArrayList4 = new ArrayList();
      if (((((zbtz)localArrayList1.get(localArrayList1.size() - 1)).a() & 0xFFFF) != 1) && (!this.c.getRowFields().get(i3).k()))
      {
        int i5;
        if (paramzbur.j())
        {
          if ((paramzbur.h & 0xFF) == 255) {
            zf.a(localArrayList4, Integer.valueOf(this.c.o - 1 - this.c.k));
          } else {
            for (i5 = i4 + (paramzbur.h & 0xFF); i5 <= i4 + (paramzbur.i & 0xFF); i5++) {
              zf.a(localArrayList4, Integer.valueOf(i5));
            }
          }
        }
        else {
          for (i5 = i4; i5 < this.c.o - this.c.k; i5++) {
            zf.a(localArrayList4, Integer.valueOf(i5));
          }
        }
      }
      else if ((i3 != this.w - 1) && (this.c.getRowFields().get(i3).getShowInOutlineForm()))
      {
        if (paramzbur.j())
        {
          if ((paramzbur.f & 0xFF) == 255)
          {
            if ((paramzbur.h & 0xFF) == 255)
            {
              ArrayList localArrayList5 = new ArrayList();
              for (i9 = 0; i9 < ((ArrayList)localObject).size(); i9++) {
                zf.a(localArrayList5, Integer.valueOf(c(((Integer)((ArrayList)localObject).get(i9)).intValue(), i3, 1)));
              }
              localObject = localArrayList5;
              zf.a(localArrayList4, Integer.valueOf(i4));
            }
            else
            {
              for (int i6 = i4 + (paramzbur.h & 0xFF); i6 <= i4 + (paramzbur.i & 0xFF); i6++) {
                zf.a(localArrayList4, Integer.valueOf(i6));
              }
            }
          }
          else
          {
            ArrayList localArrayList6 = new ArrayList();
            for (i9 = 0; i9 < ((ArrayList)localObject).size(); i9++) {
              for (i10 = paramzbur.f & 0xFF; i10 <= (paramzbur.g & 0xFF); i10++) {
                zf.a(localArrayList6, Integer.valueOf(((Integer)((ArrayList)localObject).get(i9)).intValue() + i10));
              }
            }
            localObject = localArrayList6;
            zf.a(localArrayList4, Integer.valueOf(i4));
          }
        }
        else {
          zf.a(localArrayList4, Integer.valueOf(i4));
        }
      }
      else
      {
        zf.a(localArrayList4, Integer.valueOf(i4));
      }
      for (i7 = 0; i7 < ((ArrayList)localObject).size(); i7++) {
        for (i9 = 0; i9 < localArrayList4.size(); i9++) {
          zf.a(paramArrayList2, new int[] { this.c.n + ((Integer)((ArrayList)localObject).get(i7)).intValue(), this.c.k + ((Integer)localArrayList4.get(i9)).intValue() });
        }
      }
    }
    if (localArrayList2.size() > 0)
    {
      localObject = a(localArrayList2, 2, paramzbur.j);
      if (((ArrayList)localObject).size() == 0) {
        return;
      }
      i2 = (short)(((zbtz)localArrayList2.get(localArrayList2.size() - 1)).b() & 0xFFFF);
      i3 = 0;
      if (i2 == -2)
      {
        if ((!this.c.J) || (this.c.D)) {
          i3 = this.t;
        } else {
          i3 = this.t - 1;
        }
      }
      else {
        i3 = this.c.getBaseFields().get(i2).getPosition();
      }
      i4 = i3 + 1;
      if ((this.c.J) && (i2 == -2)) {
        i4 = i3;
      }
      localArrayList4 = new ArrayList();
      if ((((zbtz)localArrayList2.get(localArrayList2.size() - 1)).a() & 0xFFFF) != 1)
      {
        if (paramzbur.j())
        {
          if ((paramzbur.f & 0xFF) == 255) {
            zf.a(localArrayList4, Integer.valueOf(this.c.n - 1 - this.c.i));
          } else {
            for (i7 = i4 + (paramzbur.f & 0xFF); i7 <= i4 + (paramzbur.g & 0xFF); i7++) {
              zf.a(localArrayList4, Integer.valueOf(i7));
            }
          }
        }
        else {
          for (i7 = i4; i7 <= this.c.n - 1 - this.c.i; i7++) {
            zf.a(localArrayList4, Integer.valueOf(i7));
          }
        }
      }
      else if (paramzbur.j())
      {
        ArrayList localArrayList7;
        if ((paramzbur.h & 0xFF) == 255)
        {
          localArrayList7 = new ArrayList();
          for (i9 = 0; i9 < ((ArrayList)localObject).size(); i9++) {
            zf.a(localArrayList7, Integer.valueOf(c(((Integer)((ArrayList)localObject).get(i9)).intValue(), i3, 2)));
          }
          localObject = localArrayList7;
          zf.a(localArrayList4, Integer.valueOf(i4));
        }
        else
        {
          localArrayList7 = new ArrayList();
          for (i9 = 0; i9 < ((ArrayList)localObject).size(); i9++) {
            for (i10 = paramzbur.h & 0xFF; i10 <= (paramzbur.i & 0xFF); i10++) {
              zf.a(localArrayList7, Integer.valueOf(((Integer)((ArrayList)localObject).get(i9)).intValue() + i10));
            }
          }
          localObject = localArrayList7;
          zf.a(localArrayList4, Integer.valueOf(i4));
        }
      }
      else
      {
        zf.a(localArrayList4, Integer.valueOf(i4));
      }
      for (int i8 = 0; i8 < localArrayList4.size(); i8++) {
        for (i9 = 0; i9 < ((ArrayList)localObject).size(); i9++) {
          zf.a(paramArrayList2, new int[] { this.c.i + ((Integer)localArrayList4.get(i8)).intValue(), this.c.o + ((Integer)((ArrayList)localObject).get(i9)).intValue() });
        }
      }
    }
  }
  
  private int c(int paramInt1, int paramInt2, int paramInt3)
  {
    ArrayList localArrayList = null;
    if (paramInt3 == 1) {
      localArrayList = this.u;
    } else {
      localArrayList = this.v;
    }
    for (int i1 = paramInt1 + 1; i1 < localArrayList.size(); i1++)
    {
      zbug localzbug = (zbug)localArrayList.get(i1);
      if (localzbug.b <= paramInt2) {
        return i1 - 1;
      }
    }
    return localArrayList.size() - 1;
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, zbur paramzbur, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    ArrayList localArrayList3;
    int i3;
    if ((paramBoolean1) && (paramBoolean2))
    {
      if ((this.c.getColumnGrand()) && (this.c.getRowGrand()))
      {
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        localArrayList3 = new ArrayList();
        a(paramArrayList1, localArrayList1, localArrayList2, localArrayList3);
        ArrayList localArrayList4 = new ArrayList();
        zbtz localzbtz1;
        int i7;
        if (this.s == 1)
        {
          for (i3 = 0; i3 < localArrayList1.size(); i3++)
          {
            localzbtz1 = (zbtz)localArrayList1.get(i3);
            for (i7 = 0; i7 < localzbtz1.c.size(); i7++) {
              zf.a(localArrayList4, (Integer)localzbtz1.c.get(i7));
            }
          }
          for (i3 = 0; i3 < localArrayList4.size(); i3++) {
            zf.a(paramArrayList2, new int[] { this.c.j - this.y + 1 + ((Integer)localArrayList4.get(i3)).intValue(), this.c.l });
          }
        }
        else if (this.s == 2)
        {
          for (i3 = 0; i3 < localArrayList2.size(); i3++)
          {
            localzbtz1 = (zbtz)localArrayList2.get(i3);
            for (i7 = 0; i7 < localzbtz1.c.size(); i7++) {
              zf.a(localArrayList4, (Integer)localzbtz1.c.get(i7));
            }
          }
          for (i3 = 0; i3 < localArrayList4.size(); i3++) {
            zf.a(paramArrayList2, new int[] { this.c.j, this.c.l - this.y + 1 + ((Integer)localArrayList4.get(i3)).intValue() });
          }
        }
        else
        {
          zf.a(paramArrayList2, new int[] { this.c.j, this.c.l });
        }
      }
    }
    else
    {
      int i6;
      int i10;
      int i4;
      if (paramBoolean1)
      {
        if (this.c.getColumnGrand())
        {
          localArrayList1 = new ArrayList();
          localArrayList2 = new ArrayList();
          localArrayList3 = new ArrayList();
          if (paramArrayList1.size() == 0)
          {
            for (int i1 = this.c.n; i1 <= this.c.j; i1++) {
              for (i3 = this.c.o; i3 <= this.c.l; i3++) {
                zf.a(paramArrayList2, new int[] { i1, i3 });
              }
            }
            return;
          }
          a(paramArrayList1, localArrayList1, localArrayList2, localArrayList3);
          if (localArrayList2.size() == 0) {
            return;
          }
          ArrayList localArrayList5 = a(localArrayList2, 2, paramzbur.j);
          if (this.s == 1)
          {
            if (localArrayList1.size() > 0)
            {
              ArrayList localArrayList7 = new ArrayList();
              for (i6 = 0; i6 < localArrayList1.size(); i6++)
              {
                zbtz localzbtz2 = (zbtz)localArrayList1.get(i6);
                for (i10 = 0; i10 < localzbtz2.c.size(); i10++) {
                  zf.a(localArrayList7, (Integer)localzbtz2.c.get(i10));
                }
              }
              for (i6 = 0; i6 < localArrayList5.size(); i6++) {
                for (int i8 = 0; i8 < localArrayList7.size(); i8++) {
                  zf.a(paramArrayList2, new int[] { this.c.j - this.y + 1 + ((Integer)localArrayList7.get(i6)).intValue(), this.c.o + ((Integer)localArrayList5.get(i6)).intValue() });
                }
              }
            }
          }
          else {
            for (i4 = 0; i4 < localArrayList5.size(); i4++) {
              zf.a(paramArrayList2, new int[] { this.c.j, this.c.o + ((Integer)localArrayList5.get(i4)).intValue() });
            }
          }
        }
      }
      else if ((paramBoolean2) && (this.c.getRowGrand()))
      {
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        localArrayList3 = new ArrayList();
        a(paramArrayList1, localArrayList1, localArrayList2, localArrayList3);
        if (paramArrayList1.size() == 0)
        {
          for (int i2 = this.c.n; i2 <= this.c.j; i2++) {
            for (i4 = this.c.o; i4 <= this.c.l; i4++) {
              zf.a(paramArrayList2, new int[] { i2, i4 });
            }
          }
          return;
        }
        if (localArrayList1.size() == 0) {
          return;
        }
        ArrayList localArrayList6 = a(localArrayList1, 1, paramzbur.j);
        if (this.s == 2)
        {
          if (localArrayList2.size() > 0)
          {
            ArrayList localArrayList8 = new ArrayList();
            for (i6 = 0; i6 < localArrayList2.size(); i6++)
            {
              zbtz localzbtz3 = (zbtz)localArrayList2.get(i6);
              for (i10 = 0; i10 < localzbtz3.c.size(); i10++) {
                zf.a(localArrayList8, (Integer)localzbtz3.c.get(i10));
              }
            }
            for (i6 = 0; i6 < localArrayList6.size(); i6++) {
              for (int i9 = 0; i9 < localArrayList8.size(); i9++) {
                zf.a(paramArrayList2, new int[] { this.c.n + ((Integer)localArrayList6.get(i6)).intValue(), this.c.l - this.y + 1 + ((Integer)localArrayList8.get(i6)).intValue() });
              }
            }
          }
        }
        else {
          for (int i5 = 0; i5 < localArrayList6.size(); i5++) {
            zf.a(paramArrayList2, new int[] { this.c.n + ((Integer)localArrayList6.get(i5)).intValue(), this.c.l });
          }
        }
      }
    }
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, zbur paramzbur, boolean paramBoolean)
  {
    int i1;
    ArrayList localArrayList1;
    ArrayList localArrayList6;
    int i7;
    zbtz localzbtz;
    int i8;
    if ((paramBoolean) && (this.c.getColumnGrand()))
    {
      i1 = 0;
      localArrayList1 = new ArrayList();
      if (this.s == 1)
      {
        i1 = 1;
        ArrayList localArrayList2 = new ArrayList();
        ArrayList localArrayList4 = new ArrayList();
        localArrayList6 = new ArrayList();
        a(paramArrayList1, localArrayList2, localArrayList4, localArrayList6);
        for (i7 = 0; i7 < localArrayList2.size(); i7++)
        {
          localzbtz = (zbtz)localArrayList2.get(i7);
          for (i8 = 0; i8 < localzbtz.c.size(); i8++) {
            zf.a(localArrayList1, (Integer)localzbtz.c.get(i8));
          }
        }
      }
      int i2;
      int i4;
      if (paramzbur.j())
      {
        if ((paramzbur.h & 0xFF) == 255)
        {
          if (i1 != 0) {
            for (i2 = 0; i2 < localArrayList1.size(); i2++) {
              zf.a(paramArrayList2, new int[] { this.c.j - this.y + 1 + ((Integer)localArrayList1.get(i2)).intValue(), this.c.o - 1 });
            }
          } else {
            zf.a(paramArrayList2, new int[] { this.c.j, this.c.o - 1 });
          }
        }
        else {
          for (i2 = this.c.k + (paramzbur.h & 0xFF); (i2 <= this.c.k + (paramzbur.i & 0xFF)) && (i2 < this.c.o + this.c.k); i2++) {
            if (i1 != 0) {
              for (i4 = 0; i4 < localArrayList1.size(); i4++) {
                zf.a(paramArrayList2, new int[] { this.c.j - this.y + 1 + ((Integer)localArrayList1.get(i4)).intValue(), i2 });
              }
            } else {
              zf.a(paramArrayList2, new int[] { this.c.j, i2 });
            }
          }
        }
      }
      else {
        for (i2 = 0; i2 <= this.c.o - 1 - this.c.k; i2++) {
          if (i1 != 0) {
            for (i4 = 0; i4 < localArrayList1.size(); i4++) {
              zf.a(paramArrayList2, new int[] { this.c.j - this.y + 1 + ((Integer)localArrayList1.get(i4)).intValue(), this.c.k + i2 });
            }
          } else {
            zf.a(paramArrayList2, new int[] { this.c.j, this.c.k + i2 });
          }
        }
      }
    }
    else if ((!paramBoolean) && (this.c.getRowGrand()))
    {
      i1 = 0;
      localArrayList1 = new ArrayList();
      if (this.s == 2)
      {
        i1 = 1;
        ArrayList localArrayList3 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        localArrayList6 = new ArrayList();
        a(paramArrayList1, localArrayList3, localArrayList5, localArrayList6);
        for (i7 = 0; i7 < localArrayList5.size(); i7++)
        {
          localzbtz = (zbtz)localArrayList5.get(i7);
          for (i8 = 0; i8 < localzbtz.c.size(); i8++) {
            zf.a(localArrayList1, (Integer)localzbtz.c.get(i8));
          }
        }
      }
      int i3 = this.c.i + 1;
      if (this.w == 0) {
        i3 = this.c.i;
      }
      int i5;
      int i6;
      if (paramzbur.j())
      {
        if ((paramzbur.f & 0xFF) == 255)
        {
          if (i1 != 0) {
            for (i5 = 0; i5 < localArrayList1.size(); i5++) {
              zf.a(paramArrayList2, new int[] { this.c.n - 1, this.c.l - this.y + 1 + ((Integer)localArrayList1.get(i5)).intValue() });
            }
          } else {
            zf.a(paramArrayList2, new int[] { this.c.n - 1, this.c.l });
          }
        }
        else {
          for (i5 = i3 + (paramzbur.f & 0xFF); i5 <= i3 + (paramzbur.g & 0xFF); i5++) {
            if (i1 != 0) {
              for (i6 = 0; i6 < localArrayList1.size(); i6++) {
                zf.a(paramArrayList2, new int[] { i5, this.c.l - this.y + 1 + ((Integer)localArrayList1.get(i6)).intValue() });
              }
            } else {
              zf.a(paramArrayList2, new int[] { i5, this.c.l });
            }
          }
        }
      }
      else {
        for (i5 = i3; i5 <= this.c.n - 1; i5++) {
          if (i1 != 0) {
            for (i6 = 0; i6 < localArrayList1.size(); i6++) {
              zf.a(paramArrayList2, new int[] { i5, this.c.l - this.y + 1 + ((Integer)localArrayList1.get(i6)).intValue() });
            }
          } else {
            zf.a(paramArrayList2, new int[] { i5, this.c.l });
          }
        }
      }
    }
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, boolean paramBoolean)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    a(paramArrayList1, localArrayList1, localArrayList2, localArrayList3);
    ArrayList localArrayList4 = null;
    ArrayList localArrayList5 = null;
    if (localArrayList1.size() > 0) {
      localArrayList4 = a(localArrayList1, 1, paramBoolean);
    }
    if (localArrayList2.size() > 0) {
      localArrayList5 = a(localArrayList2, 2, paramBoolean);
    }
    int i2;
    if ((localArrayList4 == null) && (localArrayList5 == null))
    {
      for (i1 = this.c.n; i1 <= this.c.j; i1++) {
        for (i2 = this.c.o; i2 <= this.c.l; i2++) {
          zf.a(paramArrayList2, new int[] { i1, i2 });
        }
      }
      return;
    }
    if (((localArrayList4 == null) || (localArrayList4.size() == 0)) && ((localArrayList5 == null) || (localArrayList5.size() == 0))) {
      return;
    }
    if (localArrayList4 == null) {
      if (this.w == 0)
      {
        localArrayList4 = new ArrayList();
        zf.a(localArrayList4, Integer.valueOf(0));
      }
      else
      {
        localArrayList4 = a(1, (byte)2);
      }
    }
    if (localArrayList5 == null) {
      if (this.x == 0)
      {
        localArrayList5 = new ArrayList();
        zf.a(localArrayList5, Integer.valueOf(0));
      }
      else
      {
        localArrayList5 = a(2, (byte)2);
      }
    }
    for (int i1 = 0; i1 < localArrayList4.size(); i1++) {
      for (i2 = 0; i2 < localArrayList5.size(); i2++) {
        zf.a(paramArrayList2, new int[] { this.c.n + ((Integer)localArrayList4.get(i1)).intValue(), this.c.o + ((Integer)localArrayList5.get(i2)).intValue() });
      }
    }
  }
  
  private void a(zbtz paramzbtz, ArrayList paramArrayList, int paramInt1, boolean paramBoolean1, byte paramByte, boolean paramBoolean2, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    zbug localzbug2;
    if (paramzbtz.c.size() > 0) {
      for (i1 = 0; i1 < paramArrayList.size(); i1++)
      {
        int i2 = 1;
        localzbug2 = null;
        if (paramInt1 == 1) {
          localzbug2 = (zbug)this.u.get(((Integer)paramArrayList.get(i1)).intValue());
        } else {
          localzbug2 = (zbug)this.v.get(((Integer)paramArrayList.get(i1)).intValue());
        }
        int i4 = (short)(paramzbtz.b() & 0xFFFF);
        int i5 = 0;
        if ((i4 == -2) || (i4 == 254)) {
          i5 = this.t;
        } else {
          i5 = this.c.getBaseFields().get(i4).getPosition();
        }
        if ((paramBoolean2) && (localzbug2.d() != paramInt2)) {
          i2 = 1;
        } else if ((paramBoolean1) && (paramByte == 3) && (i5 != localzbug2.e - 1)) {
          i2 = 1;
        } else if (i5 > localzbug2.e - 1) {
          i2 = 1;
        } else {
          for (int i6 = 0; i6 < paramzbtz.c.size(); i6++) {
            if ((i4 == -2) || (i4 == 254))
            {
              if (localzbug2.d() == ((Integer)paramzbtz.c.get(i6)).intValue())
              {
                i2 = 0;
                break;
              }
            }
            else if (localzbug2.f[i5] == d(((Integer)paramzbtz.c.get(i6)).intValue(), paramInt1, i5))
            {
              i2 = 0;
              break;
            }
          }
        }
        if (i2 != 0) {
          zf.a(localArrayList, paramArrayList.get(i1));
        }
      }
    } else if ((paramzbtz.e) && (paramzbtz.c.size() == 0)) {
      for (i1 = 0; i1 < paramArrayList.size(); i1++)
      {
        zbug localzbug1 = null;
        if (paramInt1 == 1) {
          localzbug1 = (zbug)this.u.get(((Integer)paramArrayList.get(i1)).intValue());
        } else {
          localzbug1 = (zbug)this.v.get(((Integer)paramArrayList.get(i1)).intValue());
        }
        if ((!localzbug1.a()) || (this.c.getBaseFields().get(paramzbtz.b() & 0xFFFF).getPosition() != localzbug1.b)) {
          zf.a(localArrayList, paramArrayList.get(i1));
        }
      }
    }
    if (!paramzbtz.e) {
      for (i1 = 0; i1 < localArrayList.size(); i1++)
      {
        int i3 = ((Integer)localArrayList.get(i1)).intValue();
        localzbug2 = null;
        if (paramInt1 == 1) {
          localzbug2 = (zbug)this.u.get(i3);
        } else {
          localzbug2 = (zbug)this.v.get(i3);
        }
        if (localzbug2.a()) {
          localArrayList.remove(i1);
        }
      }
    }
    for (int i1 = 0; i1 < localArrayList.size(); i1++) {
      paramArrayList.remove(localArrayList.get(i1));
    }
  }
  
  private int d(int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = null;
    if ((paramInt2 == 1) && (this.A.z != null)) {
      arrayOfInt = this.A.z[paramInt3];
    } else if ((paramInt2 == 2) && (this.A.y != null)) {
      arrayOfInt = this.A.y[paramInt3];
    }
    if (arrayOfInt == null) {
      return paramInt1;
    }
    if (paramInt1 < arrayOfInt.length) {
      return arrayOfInt[paramInt1];
    }
    return -1;
  }
  
  private ArrayList a(int paramInt, byte paramByte)
  {
    ArrayList localArrayList = new ArrayList();
    int i1;
    zbug localzbug;
    if (paramInt == 1) {
      for (i1 = 0; i1 < this.u.size(); i1++)
      {
        localzbug = (zbug)this.u.get(i1);
        if (paramByte == 1 ? (localzbug.c == 0) || (localzbug.c == 13) || (localzbug.c == 14) : paramByte == 0 ? localzbug.c != 0 : (paramByte != 3) || (localzbug.c != 13)) {
          zf.a(localArrayList, Integer.valueOf(i1));
        }
      }
    } else if (paramInt == 2) {
      for (i1 = 0; i1 < this.v.size(); i1++)
      {
        localzbug = (zbug)this.v.get(i1);
        if (paramByte == 1 ? (localzbug.c == 0) || (localzbug.c == 13) || (localzbug.c == 14) : (paramByte != 0) || (localzbug.c == 0)) {
          zf.a(localArrayList, Integer.valueOf(i1));
        }
      }
    }
    return localArrayList;
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4)
  {
    for (int i1 = 0; i1 < paramArrayList1.size(); i1++)
    {
      zbtz localzbtz = (zbtz)paramArrayList1.get(i1);
      int i2 = (short)(localzbtz.b() & 0xFFFF);
      if ((i2 == -2) || (i2 == 254))
      {
        if (this.s == 1) {
          a(this.t, localzbtz, paramArrayList2);
        } else if (this.s == 2) {
          a(this.t, localzbtz, paramArrayList3);
        }
      }
      else
      {
        int i3 = this.c.getBaseFields().get(i2).m;
        if (i3 == 1) {
          a(this.c.getBaseFields().get(i2).getPosition(), localzbtz, paramArrayList2);
        } else if (i3 == 2) {
          a(this.c.getBaseFields().get(i2).getPosition(), localzbtz, paramArrayList3);
        } else if (i3 == 4) {
          a(this.c.getBaseFields().get(i2).getPosition(), localzbtz, paramArrayList4);
        }
      }
    }
  }
  
  private void a(int paramInt, zbtz paramzbtz, ArrayList paramArrayList)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < paramArrayList.size(); i2++)
    {
      zbtz localzbtz = (zbtz)paramArrayList.get(i2);
      int i3 = 0;
      int i4 = (short)(localzbtz.b() & 0xFFFF);
      if ((i4 == -2) || (i4 == 254)) {
        i3 = this.t;
      } else {
        i3 = this.c.getBaseFields().get(i4).getPosition();
      }
      if (paramInt < i3)
      {
        paramArrayList.add(i2, paramzbtz);
        i1 = 1;
        break;
      }
    }
    if (i1 == 0) {
      zf.a(paramArrayList, paramzbtz);
    }
  }
  
  private ArrayList a(ArrayList paramArrayList, int paramInt, boolean paramBoolean)
  {
    byte b1 = 0;
    zbtz localzbtz = (zbtz)paramArrayList.get(paramArrayList.size() - 1);
    boolean bool = false;
    int i1 = 0;
    if ((((zbtz)paramArrayList.get(paramArrayList.size() - 1)).a() & 0xFFFF) > 1)
    {
      if (!((zbtz)paramArrayList.get(paramArrayList.size() - 1)).d) {
        b1 = 1;
      } else {
        b1 = 3;
      }
    }
    else if (((short)(localzbtz.b() & 0xFFFF) == -2) && (paramArrayList.size() >= 2) && ((((zbtz)paramArrayList.get(paramArrayList.size() - 2)).a() & 0xFFFF) > 1))
    {
      if (!((zbtz)paramArrayList.get(paramArrayList.size() - 2)).d)
      {
        b1 = 1;
        if (localzbtz.c.size() > 0)
        {
          bool = true;
          i1 = ((Integer)localzbtz.c.get(0)).intValue();
          paramArrayList.remove(paramArrayList.size() - 1);
        }
      }
      else
      {
        b1 = 3;
      }
    }
    else if ((paramInt == 1) && (paramArrayList.size() < this.w))
    {
      int i2 = (short)(((zbtz)paramArrayList.get(paramArrayList.size() - 1)).b() & 0xFFFF);
      i3 = 0;
      if (i2 == -2) {
        i3 = this.t;
      } else {
        i3 = this.c.getBaseFields().get(i2).getPosition();
      }
      if ((i2 >= 0) && (i3 < this.w - 1) && (this.c.getBaseFields().get(i2).getShowInOutlineForm())) {
        b1 = 3;
      }
    }
    Object localObject = a(paramInt, b1);
    if (((ArrayList)localObject).size() == 0) {
      return (ArrayList)localObject;
    }
    for (int i3 = 0; i3 < paramArrayList.size(); i3++) {
      a((zbtz)paramArrayList.get(i3), (ArrayList)localObject, paramInt, false, b1, bool, i1);
    }
    if (b1 == 3)
    {
      i3 = (short)(((zbtz)paramArrayList.get(paramArrayList.size() - 1)).b() & 0xFFFF);
      if ((i3 != -2) && (this.c.getBaseFields().get(i3).getShowInOutlineForm()))
      {
        int i4 = this.c.getBaseFields().get(i3).getPosition();
        ArrayList localArrayList = new ArrayList();
        for (int i5 = 0; i5 < ((ArrayList)localObject).size(); i5++)
        {
          zbug localzbug = (zbug)this.u.get(((Integer)((ArrayList)localObject).get(i5)).intValue());
          if (paramBoolean)
          {
            if ((localzbug.c != 0) && (localzbug.c != 13) && (localzbug.c != 14)) {
              zf.a(localArrayList, ((ArrayList)localObject).get(i5));
            }
          }
          else if ((localzbug.c == 0) && (localzbug.b == i4)) {
            zf.a(localArrayList, ((ArrayList)localObject).get(i5));
          }
        }
        if (localArrayList.size() > 0) {
          localObject = localArrayList;
        }
      }
    }
    return (ArrayList)localObject;
  }
  
  private Style g(int paramInt)
  {
    Style localStyle = null;
    if ((paramInt >= 0) && (paramInt < this.c.ac.getCount()))
    {
      localStyle = new Style(this.f);
      localStyle.copy(this.c.ac.a(paramInt));
    }
    return localStyle;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */