package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zatt
{
  private zasc a;
  private Worksheet b;
  private Cells c;
  private RowCollection d;
  private zcjz e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private Cell k;
  private int l;
  private int m;
  private int n;
  private int o;
  
  zatt(zasc paramzasc)
  {
    this.a = paramzasc;
    this.b = paramzasc.i;
    this.c = this.b.getCells();
    this.d = this.b.getCells().getRows();
    PageSetup localPageSetup = paramzasc.i.getPageSetup();
    int[] arrayOfInt = zasp.a(paramzasc.i);
    this.g = arrayOfInt[0];
    this.i = arrayOfInt[1];
    this.h = arrayOfInt[2];
    this.j = arrayOfInt[3];
    a();
  }
  
  private void a()
  {
    this.n = this.c.e(0);
    this.o = this.c.b((short)0);
    Object localObject2;
    for (int i1 = 0; i1 < this.c.o().getCount(); i1++)
    {
      localObject2 = this.c.o().a(i1);
      if (((CellArea)localObject2).EndColumn > this.o) {
        this.o = ((CellArea)localObject2).EndColumn;
      }
      if (((CellArea)localObject2).EndRow > this.n) {
        this.n = ((CellArea)localObject2).EndRow;
      }
    }
    for (i1 = 0; i1 < this.b.getHyperlinks().getCount(); i1++)
    {
      localObject2 = this.b.getHyperlinks().get(i1);
      if (((Hyperlink)localObject2).getArea().StartColumn > this.o) {
        this.o = ((Hyperlink)localObject2).getArea().StartColumn;
      }
      if (((Hyperlink)localObject2).getArea().StartRow > this.n) {
        this.n = ((Hyperlink)localObject2).getArea().StartRow;
      }
    }
    if ((this.b.w() != null) && (this.b.getShapes().getCount() > 0)) {
      for (i1 = 0; i1 < this.b.getShapes().getCount(); i1++)
      {
        localObject2 = this.b.getShapes().get(i1);
        if (((Shape)localObject2).getUpperLeftColumn() > this.o) {
          this.o = ((Shape)localObject2).getUpperLeftColumn();
        }
        if (((Shape)localObject2).getUpperLeftRow() > this.n) {
          this.n = ((Shape)localObject2).getUpperLeftRow();
        }
      }
    }
    this.m = this.o;
    Object localObject1;
    if (this.c.getColumns().getCount() > 0)
    {
      localObject1 = this.c.getColumns().getColumnByIndex(this.c.getColumns().getCount() - 1);
      if (((Column)localObject1).getIndex() > this.m) {
        this.m = ((Column)localObject1).getIndex();
      }
    }
    this.l = this.n;
    if (this.d.getCount() > 0)
    {
      localObject1 = this.d.getRowByIndex(this.d.getCount() - 1);
      if (((Row)localObject1).getIndex() > this.l) {
        this.l = ((Row)localObject1).getIndex();
      }
    }
    if (this.l < this.i) {
      this.l = this.i;
    }
    if (this.m < this.j) {
      this.m = this.j;
    }
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    int i1 = (this.b.w() != null) && (this.b.w().getCount() > 0) ? 1 : 0;
    try
    {
      this.c.c = new zlt(this.c, 16383);
      if (i1 != 0)
      {
        this.c.b = new zlx(this.c, 16383);
        this.c.getRows().b(0);
      }
      this.e = paramzcjz;
      paramzcjz.b("table:table");
      paramzcjz.a("table", "name", null, this.a.l);
      paramzcjz.a("table", "style-name", null, "ta" + (this.a.i.getIndex() + 1));
      paramzcjz.a("table", "print", null, this.a.m);
      String str = this.a.i.getPageSetup().getPrintArea();
      if ((str != null) && (!"".equals(str))) {
        paramzcjz.a("table", "print-ranges", null, zasp.a(str, this.a.l));
      }
      paramzcjz.b("office:forms");
      paramzcjz.a("form", "automatic-focus", null, "false");
      paramzcjz.a("form", "apply-design-mode", null, "false");
      paramzcjz.b();
      c();
      d();
      paramzcjz.b();
    }
    finally
    {
      this.c.l();
      if (i1 != 0)
      {
        this.c.k();
        this.c.getRows().b();
      }
    }
  }
  
  private void b()
    throws Exception
  {
    if (this.f != 0) {
      for (int i1 = 0; i1 < this.f; i1++) {
        this.e.b();
      }
    }
    this.f = 0;
  }
  
  private void c()
    throws Exception
  {
    int i1 = this.a.j.b((short)0);
    ColumnCollection localColumnCollection = this.a.j.getColumns();
    int i2 = -1;
    for (int i3 = 0; i3 < localColumnCollection.getCount(); i3++)
    {
      Column localColumn1 = localColumnCollection.getColumnByIndex(i3);
      if (localColumn1.getIndex() - i2 > 1)
      {
        b();
        a(i2 + 1, localColumn1.getIndex() - 1);
      }
      int i4 = localColumn1.c();
      for (int i5 = i3 + 1; i5 < localColumnCollection.getCount(); i5++)
      {
        Column localColumn2 = localColumnCollection.getColumnByIndex(i5);
        if ((localColumn2.getIndex() - localColumn1.getIndex() != i5 - i3) || (!localColumn1.b(localColumn2))) {
          break;
        }
      }
      a(i3, localColumn1, i5 - i3);
      i2 = localColumn1.getIndex() + i5 - i3 - 1;
      i3 = i5 - 1;
    }
    b();
    if (localColumnCollection.getCount() == 0)
    {
      a(0, 255);
      return;
    }
    if (i2 < 255) {
      a(i2 + 1, 255);
    }
  }
  
  void a(int paramInt1, int paramInt2)
    throws Exception
  {
    if (this.h != -1)
    {
      int[] arrayOfInt = zasp.a(paramInt1, paramInt2, this.h, this.j);
      if (arrayOfInt != null)
      {
        if (arrayOfInt[0] != paramInt1) {
          a(arrayOfInt[0] - paramInt1);
        }
        this.e.b("table:table-header-columns");
        a(arrayOfInt[1] - arrayOfInt[0] + 1);
        this.e.b();
        if (arrayOfInt[1] != paramInt2) {
          a(paramInt2 - arrayOfInt[1]);
        }
        return;
      }
    }
    a(paramInt2 - paramInt1 + 1);
  }
  
  private void a(int paramInt)
    throws Exception
  {
    this.e.b("table:table-column");
    this.e.a("table", "style-name", null, this.a.b.b());
    this.e.a("table", "default-cell-style-name", null, "ce15");
    if (paramInt != 1) {
      this.e.a("table", "number-columns-repeated", null, zasp.a(paramInt));
    }
    this.e.b();
  }
  
  private zarp a(zasu paramzasu, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = this.a.c(paramInt1, paramInt2);
    if (localArrayList != null)
    {
      zarp localzarp = new zarp();
      localzarp.a = paramInt1;
      localzarp.b = paramInt2;
      localzarp.d = localArrayList;
      return localzarp;
    }
    return null;
  }
  
  private boolean a(zarp paramzarp, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 == -1) {
      if (paramInt4 > -1)
      {
        paramInt3 = paramInt4;
      }
      else
      {
        int i1 = this.c.getColumns().e(paramInt2);
        if (i1 > -1) {
          paramInt3 = this.c.getColumns().getColumnByIndex(i1).c();
        }
      }
    }
    if (paramzarp.j != paramInt3) {
      return false;
    }
    zasu localzasu = this.a.d(paramInt1, paramInt2);
    if (localzasu != null) {
      return false;
    }
    if (this.a.b(paramInt1, paramInt2)) {
      return false;
    }
    Hyperlink localHyperlink = c(paramInt1, paramInt2);
    if (localHyperlink != null) {
      return false;
    }
    Comment localComment = this.a.a(paramInt1, paramInt2);
    return localComment == null;
  }
  
  private zarp a(Row paramRow, int paramInt1, int paramInt2)
  {
    zasu localzasu = this.a.d(paramInt1, paramInt2);
    ArrayList localArrayList = this.a.c(paramInt1, paramInt2);
    Hyperlink localHyperlink = null;
    Comment localComment = null;
    if ((localzasu == null) || ((localzasu.c == paramInt2) && (localzasu.a == paramInt1)))
    {
      localHyperlink = c(paramInt1, paramInt2);
      localComment = this.a.a(paramInt1, paramInt2);
    }
    if ((this.k != null) || (localzasu != null) || (localArrayList != null) || (localHyperlink != null) || (localComment != null))
    {
      zarp localzarp1 = new zarp();
      localzarp1.a = paramInt1;
      localzarp1.b = paramInt2;
      localzarp1.d = localArrayList;
      localzarp1.c = this.k;
      localzarp1.e = localzasu;
      localzarp1.g = localHyperlink;
      localzarp1.h = localComment;
      if (localzasu != null)
      {
        paramInt2++;
        while (paramInt2 <= localzasu.d)
        {
          zarp localzarp2 = a(localzasu, paramInt1, paramInt2);
          if (localzarp2 != null)
          {
            if (localzarp1.f == null) {
              localzarp1.f = new zarp[localzasu.d - localzasu.c];
            }
            localzarp1.f[(paramInt2 - localzasu.c - 1)] = localzarp2;
          }
          paramInt2++;
        }
      }
      localzarp1.j = (this.k == null ? -1 : this.k.s());
      if (localzarp1.j == -1) {
        if ((paramRow != null) && (paramRow.k())) {
          localzarp1.j = paramRow.e();
        } else {
          localzarp1.j = this.c.g(paramInt2);
        }
      }
      return localzarp1;
    }
    return null;
  }
  
  private void d()
    throws Exception
  {
    int i1 = (this.c.getColumns().a != null) && (this.c.getColumns().a.e()) ? this.c.getColumns().a.c() : 15;
    int i2 = -1;
    int i3 = 0;
    Workbook localWorkbook = this.c.p().p();
    zv localzv = this.c.e();
    Object localObject1 = null;
    Row localRow = null;
    zbdx localzbdx1 = new zbdx();
    int i5 = -1;
    zaiv localzaiv1 = null;
    zaiv localzaiv2 = null;
    Cell localCell = null;
    int i6 = -1;
    int i7 = -1;
    if (localzv.a() > 0)
    {
      localzaiv1 = localzv.a(-1, -1, false);
      i7 = localzaiv1.a();
      localRow = new Row(this.c, this.d, localzv.f(i7), false);
      i5 = localRow.getIndex();
    }
    for (int i8 = 0; i8 <= this.l; i8++)
    {
      localWorkbook.i();
      localObject1 = null;
      zbdx localzbdx2 = null;
      int i4 = -1;
      if (i5 == i8)
      {
        localObject1 = localRow;
        i7 = localzaiv1.a();
        if (i7 < 0)
        {
          localRow = null;
          i5 = -1;
        }
        else
        {
          localRow = new Row(this.c, this.d, localzv.f(i7), false);
          i5 = localRow.getIndex();
        }
      }
      else if ((i8 > i5) && (i5 > -1))
      {
        do
        {
          i7 = localzaiv1.a();
          if (i7 < 0)
          {
            localRow = null;
            i5 = -1;
            break;
          }
          i9 = localzv.a(i7);
          if (i9 == i8)
          {
            localObject1 = new Row(this.c, this.d, localzv.f(i7), false);
            i7 = localzaiv1.a();
            if (i7 < 0)
            {
              localRow = null;
              i5 = -1;
              break;
            }
            localRow = new Row(this.c, this.d, localzv.f(i7), false);
            i5 = localRow.getIndex();
            break;
          }
        } while (i9 <= i8);
        localRow = new Row(this.c, this.d, localzv.f(i7), false);
        i5 = localRow.getIndex();
      }
      if (localObject1 != null)
      {
        localzbdx2 = ((Row)localObject1).c.a(localzbdx1, 15);
        i4 = localzbdx2.d() ? localzbdx2.d : -1;
      }
      int i9 = 0;
      boolean bool = (this.g != -1) && (i8 >= this.g) && (i8 <= this.i);
      if (bool)
      {
        a(i2, i3, i8, localzbdx2, bool);
        i2 = i8;
        if (localObject1 == null) {
          i3 = 0;
        } else {
          i3 = localzbdx2.e() & 0xFF;
        }
        i9 = 1;
      }
      else if (localObject1 != null)
      {
        if ((i8 > this.n) && (((Row)localObject1).getGroupLevel() == 0)) {
          continue;
        }
        a(i2, i3, i8, localzbdx2, bool);
        i2 = i8;
        i3 = localzbdx2.e() & 0xFF;
        i9 = 1;
      }
      Object localObject2 = null;
      int i10;
      int i13;
      int i16;
      if (i8 <= this.n)
      {
        i6 = -1;
        if ((localObject1 != null) && (((Row)localObject1).a() > 0))
        {
          localzaiv2 = ((Row)localObject1).c.a(-1, -1, false);
          i7 = localzaiv2.a();
          localCell = new Cell((Row)localObject1, i7);
          i6 = localCell.getColumn();
        }
        for (i10 = 0; i10 <= this.o; i10++)
        {
          this.k = null;
          if (i10 == i6)
          {
            this.k = localCell;
            i7 = localzaiv2.a();
            if (i7 < 0)
            {
              localCell = null;
              i6 = -1;
            }
            else
            {
              localCell = new Cell((Row)localObject1, i7);
              i6 = localCell.c.a;
            }
          }
          else
          {
            this.k = null;
            if ((i6 > 0) && (i6 < i10))
            {
              int i11;
              do
              {
                i7 = localzaiv2.a();
                if (i7 < 0)
                {
                  localCell = null;
                  i6 = -1;
                  break;
                }
                i11 = ((Row)localObject1).c.a(i7);
                if (i11 == i10)
                {
                  this.k = new Cell((Row)localObject1, i7);
                  i7 = localzaiv2.a();
                  if (i7 < 0)
                  {
                    localCell = null;
                    i6 = -1;
                    break;
                  }
                  localCell = new Cell((Row)localObject1, i7);
                  i6 = localCell.c.a;
                  break;
                }
              } while (i11 <= i10);
              localCell = new Cell((Row)localObject1, i7);
              i6 = localCell.c.a;
            }
          }
          zarp localzarp = a((Row)localObject1, i8, i10);
          if (localzarp != null)
          {
            if (i9 == 0)
            {
              a(i2, i3, i8, localzbdx2, bool);
              i2 = i8;
              i3 = 0;
              i9 = 1;
            }
            i13 = localObject2 == null ? 0 : ((zarp)localObject2).b() + 1;
            int i14;
            if (i10 != i13) {
              if (i4 < 0)
              {
                i14 = this.c.g(i13);
                if (i14 == 15) {
                  i14 = -1;
                }
                for (i16 = i13 + 1; i16 < i10; i16++)
                {
                  int i17 = this.c.g(i16);
                  if (i17 == 15) {
                    i17 = -1;
                  }
                  if (i17 != i14)
                  {
                    b(i14, i16 - i13);
                    i13 = i16;
                    i14 = i17;
                  }
                }
                b(i14, i10 - i13);
              }
              else
              {
                b(i4, i10 - i13);
              }
            }
            if (localzarp.c()) {
              for (i14 = i10 + 1; i14 <= this.o; i14++) {
                if (i6 == i14)
                {
                  if ((!localCell.d()) || (!a(localzarp, i8, i14, localCell.s(), i4))) {
                    break;
                  }
                  localzarp.i += 1;
                  i7 = localzaiv2.a();
                  if (i7 < 0)
                  {
                    localCell = null;
                    i6 = -1;
                  }
                  else
                  {
                    localCell = new Cell((Row)localObject1, i7);
                    i6 = localCell.c.a;
                  }
                }
                else
                {
                  if (!a(localzarp, i8, i14, -1, i4)) {
                    break;
                  }
                  localzarp.i += 1;
                }
              }
            }
            a((Row)localObject1, localzarp, i8, i10);
            i10 = localzarp.b();
            localObject2 = localzarp;
          }
        }
      }
      if (i9 != 0)
      {
        if ((localObject2 != null) && (255 > ((zarp)localObject2).b())) {
          if (i4 < 0)
          {
            i10 = ((zarp)localObject2).b() + 1;
            int i12 = -1;
            if (this.c.getColumns().getCount() > 0) {
              for (i13 = this.c.getColumns().getCount() - 1; i13 > -1; i13--)
              {
                Column localColumn = this.c.getColumns().getColumnByIndex(i13);
                if (localColumn.getIndex() < i10) {
                  break;
                }
                i16 = localColumn.c();
                if ((i16 != 15) && (i16 > -1))
                {
                  i12 = localColumn.getIndex();
                  break;
                }
              }
            }
            if (i12 >= i10)
            {
              i13 = this.c.g(i10);
              if (i13 == 15) {
                i13 = -1;
              }
              for (int i15 = i10 + 1; i15 <= i12; i15++)
              {
                i16 = this.c.g(i15);
                if (i16 == 15) {
                  i16 = -1;
                }
                if (i16 != i13)
                {
                  b(i13, i15 - i10);
                  i10 = i15;
                  i13 = i16;
                }
              }
              b(i13, i12 + 1 - i10);
              i10 = i12 + 1;
            }
            if (i10 < 255) {
              b(-1, 255 - i10);
            }
          }
          else
          {
            b(i4, 255 - ((zarp)localObject2).b());
          }
        }
        if (bool) {
          this.e.b();
        }
        this.e.b();
      }
    }
    b();
    if ((this.a.o) && (this.l != 65535)) {
      c(65535 - this.l);
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, zbdx paramzbdx, boolean paramBoolean)
    throws Exception
  {
    if (paramInt3 > paramInt1 + 1)
    {
      b();
      c(paramInt3 - paramInt1 - 1);
    }
    if (paramzbdx == null)
    {
      b();
      if (paramBoolean) {
        this.e.b("table:table-header-rows");
      }
      this.e.b("table:table-row");
      if ((this.a.a != null) && (this.a.a.a() != null)) {
        this.e.a("table", "style-name", null, this.a.a.a());
      }
      return paramBoolean;
    }
    a(paramInt1, paramInt2, paramzbdx.a, paramzbdx.e() & 0xFF);
    if (paramBoolean) {
      this.e.b("table:table-header-rows");
    }
    this.e.b("table:table-row");
    this.e.a("table", "style-name", null, this.a.a(paramInt3));
    if (paramzbdx.b()) {
      this.e.a("table", "visibility", null, "collapse");
    }
    return paramBoolean;
  }
  
  private void a(Row paramRow, zarp paramzarp, int paramInt1, int paramInt2)
    throws Exception
  {
    if (paramzarp.a())
    {
      b(paramzarp);
      return;
    }
    Cell localCell = paramzarp.c;
    this.e.b("table:table-cell");
    if (paramzarp.i > 1) {
      this.e.a("table", "number-columns-repeated", null, zasp.a(paramzarp.i));
    }
    int i1;
    if (localCell != null)
    {
      i1 = localCell.getType();
      if ((i1 == 1) && (localCell.getDoubleValue() < 0.0D)) {
        i1 = 4;
      }
      int i3;
      if (paramzarp.i != 1) {
        this.e.a("table", "style-name", null, "ce" + localCell.r());
      } else if (localCell.s() == 15)
      {
        if ((paramRow != null) && (paramRow.k()))
        {
          this.e.a("table", "style-name", null, "ce15");
        }
        else
        {
          int i2 = this.c.getColumns().e(paramInt2);
          if (i2 > -1)
          {
            i3 = this.c.getColumns().getColumnByIndex(i2).c();
            if ((i3 != -1) && (i3 != 15)) {
              this.e.a("table", "style-name", null, "ce15");
            }
          }
        }
      }
      else if (paramzarp.j != -1) {
        this.e.a("table", "style-name", null, "ce" + localCell.r());
      }
      int i4;
      if (localCell.g()) {
        if (localCell.z())
        {
          if (localCell.isArrayHeader())
          {
            this.e.a("table", "formula", null, this.a.k.l + this.a.k.a(localCell));
            localObject = localCell.F();
            i3 = ((zbf)localObject).a().EndColumn - ((zbf)localObject).a().StartColumn + 1;
            i4 = ((zbf)localObject).a().EndRow - ((zbf)localObject).a().StartRow + 1;
            this.e.a("table", "number-matrix-columns-spanned", null, zasp.a(i3));
            this.e.a("table", "number-matrix-rows-spanned", null, zasp.a(i4));
          }
        }
        else {
          this.e.a("table", "formula", null, this.a.k.l + this.a.k.a(localCell));
        }
      }
      if (paramzarp.e != null)
      {
        this.e.a("table", "number-columns-spanned", null, zasp.a(paramzarp.e.d - paramzarp.e.c + 1));
        this.e.a("table", "number-rows-spanned", null, zasp.a(paramzarp.e.b - paramzarp.e.a + 1));
      }
      Object localObject = paramzarp.g;
      if (i1 != 3)
      {
        i3 = 1;
        i4 = this.a.k.h[localCell.r()];
        switch (i1)
        {
        case 0: 
          this.e.a("office", "value-type", null, "boolean");
          this.e.a("office", "boolean-value", null, localCell.getBoolValue() == true ? "true" : "false");
          break;
        case 1: 
          switch (i4)
          {
          case 2: 
            this.e.a("office", "value-type", null, "date");
            this.e.a("office", "date-value", null, localCell.getDateTimeValue().b("yyyy-MM-dd'T'HH:mm:ss"));
            break;
          case 3: 
            this.e.a("office", "value-type", null, "time");
            this.e.a("office", "time-value", null, zasp.c(localCell.getDoubleValue()));
            break;
          case 1: 
            this.e.a("office", "value-type", null, "float");
            this.e.a("office", "value", null, zasp.b(localCell.getDoubleValue()));
            break;
          default: 
            this.e.a("office", "value-type", null, "date");
            this.e.a("office", "date-value", null, localCell.getDateTimeValue().b("yyyy-MM-dd'T'HH:mm:ss"));
          }
          break;
        case 4: 
          switch (i4)
          {
          case 0: 
            this.e.a("office", "value-type", null, "currency");
            this.e.a("office", "value", null, zasp.b(localCell.getDoubleValue()));
            break;
          case 6: 
            this.e.a("office", "value-type", null, "percentage");
            this.e.a("office", "value", null, zasp.b(localCell.getDoubleValue()));
            break;
          default: 
            this.e.a("office", "value-type", null, "float");
            this.e.a("office", "value", null, zasp.b(localCell.getDoubleValue()));
          }
          break;
        case 5: 
          this.e.a("office", "value-type", null, "string");
          if (!localCell.H())
          {
            if (localObject != null) {
              this.e.a("office", "value", null, zs.a(localCell.getValue()));
            }
          }
          else
          {
            a(localCell);
            i3 = 0;
          }
          break;
        case 2: 
        case 3: 
        default: 
          this.e.a("office", "value-type", null, "string");
          this.e.a("office", "value", null, zs.a(localCell.getValue()));
        }
        if (i3 != 0)
        {
          int i5 = this.e.g();
          this.e.a(0);
          this.e.b("text:p");
          if (localObject == null)
          {
            this.e.a(localCell.k());
          }
          else
          {
            this.e.b("text:a");
            int i6 = ((Hyperlink)localObject).a(this.a.i.c());
            String str = ((Hyperlink)localObject).getAddress();
            if (i6 == 2) {
              str = "#" + str.replace('!', '.');
            } else if ((i6 == 1) && ((str.length() <= 1) || (str.charAt(1) != ':')) && (!str.startsWith("\\\\")) && (str.indexOf("\\") != -1)) {
              str = "../" + zw.a(str, "\\", "/");
            }
            this.e.a("xlink", "href", null, str);
            this.e.a(localCell.k());
            this.e.b();
          }
          this.e.b();
          this.e.a(i5);
        }
      }
    }
    else
    {
      if (paramzarp.e != null)
      {
        this.e.a("table", "number-columns-spanned", null, zasp.a(paramzarp.e.d - paramzarp.e.c + 1));
        this.e.a("table", "number-rows-spanned", null, zasp.a(paramzarp.e.b - paramzarp.e.a + 1));
      }
      i1 = -1;
      if ((paramRow != null) && (paramRow.k())) {
        i1 = paramRow.c.j();
      } else {
        i1 = this.c.c.a(paramInt2);
      }
      if ((i1 != -1) && (i1 != 15)) {
        this.e.a("table", "style-name", null, "ce" + i1);
      }
    }
    if (paramzarp.h != null) {
      a(paramzarp.h);
    }
    d(paramzarp);
    this.e.b();
    a(paramzarp);
  }
  
  private void a(zarp paramzarp)
    throws Exception
  {
    if ((paramzarp.e == null) || (paramzarp.e.c == paramzarp.e.d)) {
      return;
    }
    if (paramzarp.f == null)
    {
      b(paramzarp.e.d - paramzarp.e.c);
    }
    else
    {
      int i1 = paramzarp.b;
      for (int i2 = 0; i2 < paramzarp.f.length; i2++) {
        if (paramzarp.f[i2] != null)
        {
          if (paramzarp.f[i2].b != i1 + 1)
          {
            b(paramzarp.f[i2].b - i1 - 1);
            i1 = paramzarp.f[i2].b;
          }
          c(paramzarp.f[i2]);
        }
      }
      if (i1 != paramzarp.e.d) {
        b(paramzarp.e.d - i1 - 1);
      }
    }
  }
  
  private void b(zarp paramzarp)
    throws Exception
  {
    int i1 = paramzarp.b - 1;
    if ((paramzarp.d != null) && (paramzarp.d.size() > 0))
    {
      c(paramzarp);
      i1++;
    }
    if (paramzarp.f == null)
    {
      i2 = paramzarp.e.d - paramzarp.e.c;
      if (i1 == paramzarp.b - 1) {
        i2++;
      }
      b(i2);
      return;
    }
    for (int i2 = 0; i2 < paramzarp.f.length; i2++) {
      if (paramzarp.f[i2] != null)
      {
        if (paramzarp.f[i2].b != i1 + 1) {
          b(paramzarp.f[i2].b - i1 - 1);
        }
        c(paramzarp.f[i2]);
        i1 = paramzarp.f[i2].b;
      }
    }
    if (i1 != paramzarp.e.d) {
      b(paramzarp.e.d - i1 - 1);
    }
  }
  
  void a(int paramInt1, Column paramColumn, int paramInt2)
    throws Exception
  {
    int i2;
    if (paramColumn.b() == 0)
    {
      for (int i1 = 0; i1 < this.f; i1++) {
        this.e.b();
      }
      this.f = 0;
    }
    else if (paramInt1 != 0)
    {
      Column localColumn = this.a.i.getCells().getColumns().getColumnByIndex(paramInt1 - 1);
      int i3;
      if (localColumn.getIndex() + 1 == paramColumn.getIndex())
      {
        if ((localColumn.b() & 0xFF) > (paramColumn.b() & 0xFF))
        {
          this.e.b();
          this.f -= 1;
        }
        else if ((localColumn.b() & 0xFF) < (paramColumn.b() & 0xFF))
        {
          for (i3 = localColumn.b() & 0xFF; i3 < (paramColumn.b() & 0xFF); i3++)
          {
            this.e.b("table:table-column-group");
            this.f += 1;
          }
        }
      }
      else
      {
        b();
        for (i3 = 0; i3 < (paramColumn.b() & 0xFF); i3++)
        {
          this.e.b("table:table-column-group");
          this.f += 1;
        }
      }
    }
    else
    {
      for (i2 = 0; i2 < (paramColumn.b() & 0xFF); i2++)
      {
        this.e.b("table:table-column-group");
        this.f += 1;
      }
    }
    if (this.h != -1)
    {
      i2 = paramColumn.getIndex();
      int[] arrayOfInt = zasp.a(i2, i2 + paramInt2 - 1, this.h, this.j);
      if (arrayOfInt != null)
      {
        if (arrayOfInt[0] != i2) {
          a(paramColumn, arrayOfInt[0] - i2);
        }
        this.e.b("table:table-header-columns");
        a(paramColumn, arrayOfInt[1] - arrayOfInt[0] + 1);
        this.e.b();
        if (arrayOfInt[1] != i2 + paramInt2 - 1) {
          a(paramColumn, i2 + paramInt2 - arrayOfInt[1]);
        }
        return;
      }
    }
    a(paramColumn, paramInt2);
  }
  
  private void a(Column paramColumn, int paramInt)
    throws Exception
  {
    this.e.b("table:table-column");
    String str = this.a.b(paramColumn.getIndex());
    this.e.a("table", "style-name", null, str);
    if (paramInt != 1) {
      this.e.a("table", "number-columns-repeated", null, zasp.a(paramInt));
    }
    int i1 = paramColumn.c();
    this.e.a("table", "default-cell-style-name", null, "ce" + zasp.a(i1));
    if (paramColumn.isHidden()) {
      this.e.a("table", "visibility", null, "collapse");
    }
    this.e.b();
  }
  
  private void a(Cell paramCell)
    throws Exception
  {
    zbdd localzbdd = (zbdd)paramCell.c.d;
    String str1 = localzbdd.c;
    byte[] arrayOfByte = localzbdd.h();
    int i1 = this.e.g();
    this.e.a(0);
    this.e.b("text:p");
    for (int i2 = 0; i2 < arrayOfByte.length; i2 += 4)
    {
      int i3 = zc.e(arrayOfByte, i2) & 0xFFFF;
      int i4 = zc.e(arrayOfByte, i2 + 2) & 0xFFFF;
      if ((i2 == 0) && (i3 > 0)) {
        this.e.a(str1.substring(0, 0 + i3));
      }
      if (i3 >= str1.length()) {
        break;
      }
      String str2 = null;
      if (i2 + 4 >= arrayOfByte.length)
      {
        str2 = str1.substring(i3);
      }
      else
      {
        int i5 = zc.e(arrayOfByte, i2 + 4) & 0xFFFF;
        if (i5 >= str1.length())
        {
          str2 = str1.substring(i3);
          i2 = arrayOfByte.length;
        }
        else
        {
          str2 = str1.substring(i3, i3 + (i5 - i3));
        }
      }
      this.e.b("text:span");
      this.e.a("text", "style-name", null, "T" + i4);
      this.e.a(str2);
      this.e.b();
    }
    this.e.b();
    this.e.a(i1);
  }
  
  private void b(int paramInt1, int paramInt2)
    throws Exception
  {
    this.e.b("table:table-cell");
    if (paramInt2 != 1) {
      this.e.a("table", "number-columns-repeated", null, zasp.a(paramInt2));
    }
    if (paramInt1 > -1) {
      this.e.a("table", "style-name", null, "ce" + zasp.a(paramInt1));
    }
    this.e.b();
  }
  
  private void c(zarp paramzarp)
    throws Exception
  {
    this.e.b("table:covered-table-cell");
    d(paramzarp);
    this.e.b();
  }
  
  private void b(int paramInt)
    throws Exception
  {
    this.e.b("table:covered-table-cell");
    if (paramInt != 1) {
      this.e.a("table", "number-columns-repeated", null, zasp.a(paramInt));
    }
    this.e.b();
  }
  
  private void d(zarp paramzarp)
    throws Exception
  {
    if ((paramzarp.d == null) || (paramzarp.d.size() == 0)) {
      return;
    }
    if ((paramzarp.d != null) && (paramzarp.d.size() > 0))
    {
      Iterator localIterator = paramzarp.d.iterator();
      while (localIterator.hasNext())
      {
        zatg localzatg = (zatg)localIterator.next();
        Shape localShape = localzatg.a;
        switch (localShape.getMsoDrawingType())
        {
        case 6: 
        case 8: 
        case 24: 
          a(localzatg, "frame");
          break;
        case 5: 
          a((ChartShape)localShape, "frame");
          break;
        default: 
          a(localzatg, zasn.b(localzatg.a.getAutoShapeType()));
        }
      }
    }
  }
  
  private void a(ChartShape paramChartShape, String paramString)
    throws Exception
  {
    this.e.b("draw:" + paramString);
    int i1 = this.b.getIndex() + paramChartShape.w();
    int i2 = i1 + 1;
    this.e.a("table", "end-cell-address", null, paramChartShape.Q().getName() + "." + CellsHelper.cellIndexToName(paramChartShape.getLowerRightRow(), paramChartShape.getLowerRightColumn()));
    double d1 = paramChartShape.getLeftCM();
    double d2 = paramChartShape.getTopCM();
    double d3 = paramChartShape.getRight();
    double d4 = paramChartShape.getBottom();
    this.e.a("svg", "x", null, zasp.g(d1) + "cm");
    this.e.a("svg", "y", null, zasp.g(d2) + "cm");
    this.e.a("svg", "width", null, zasp.g(paramChartShape.getWidthCM()) + "cm");
    this.e.a("svg", "height", null, zasp.g(paramChartShape.getHeightCM()) + "cm");
    this.e.a("draw", "z-index", null, zasp.a(paramChartShape.getZOrderPosition()));
    this.e.a("draw", "name", null, paramChartShape.getName());
    this.e.a("draw", "style-name", null, "gr" + zasp.a(i2));
    if ("frame".equals(paramString))
    {
      a(paramChartShape);
      b(paramChartShape);
    }
    this.e.b();
  }
  
  private void a(ChartShape paramChartShape)
    throws Exception
  {
    this.e.b("draw:object");
    this.e.a("draw", "notify-on-update-of-ranges", null, a(paramChartShape.getChart().getNSeries()));
    this.e.a("xlink", "href", null, "./Object " + zasp.a(paramChartShape));
    this.e.a("xlink", "type", null, "simple");
    this.e.a("xlink", "show", null, "embed");
    this.e.a("xlink", "actuate", null, "onLoad");
    this.e.b();
  }
  
  private void b(ChartShape paramChartShape)
    throws Exception
  {
    this.e.b("draw:image");
    this.e.a("xlink", "href", null, "./ObjectReplacements/Object " + zasp.a(paramChartShape));
    this.e.a("xlink", "show", null, "embed");
    this.e.a("xlink", "actuate", null, "onLoad");
    this.e.b();
  }
  
  private void a(zatg paramzatg, String paramString)
    throws Exception
  {
    Shape localShape = paramzatg.a;
    this.e.b("draw:" + paramString);
    int i1 = this.b.getIndex() + localShape.w();
    int i2 = i1 + 1;
    this.e.a("draw", "style-name", null, "S" + zasp.a(i2));
    this.e.a("draw", "id", null, "id" + zasp.a(i1));
    this.e.a("draw", "z-index", null, zasp.a(localShape.getZOrderPosition()));
    if (localShape.getMsoDrawingType() == 6) {
      this.e.a("xmlns", "presentation", null, "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0");
    }
    this.e.a("draw", "name", null, localShape.getName());
    this.e.a("svg", "x", null, zasp.a(zbxp.a(), (int)paramzatg.b));
    this.e.a("svg", "y", null, zasp.a(zbxp.a(), (int)paramzatg.c));
    this.e.a("svg", "width", null, zasp.a(zbxp.a(), (int)paramzatg.e));
    this.e.a("svg", "height", null, zasp.a(zbxp.a(), (int)paramzatg.d));
    if ("frame".equals(paramString)) {
      switch (localShape.getMsoDrawingType())
      {
      case 6: 
        a(localShape);
        break;
      case 24: 
        b(localShape);
        a(localShape, false);
        break;
      case 8: 
        a(localShape, true);
        break;
      }
    }
    this.e.b();
  }
  
  private void a(Shape paramShape)
    throws Exception
  {
    this.e.b("draw:text-box");
    FontSettingCollection localFontSettingCollection = paramShape.getTextBody();
    zatk.a(this.e, localFontSettingCollection, "T" + zasp.a(localFontSettingCollection.f()));
    this.e.b();
  }
  
  private void b(Shape paramShape)
    throws Exception
  {
    this.e.b("draw:object-ole");
    OleObject localOleObject = (OleObject)paramShape;
    this.e.a("draw", "class-id", null, zs.a(localOleObject.t()));
    String str = "MSO_OLE_OBJ" + zp.d(localOleObject.s());
    this.e.a("xlink", "href", null, str);
    this.e.a("xlink", "show", null, "embed");
    this.e.a("xlink", "actuate", null, "onLoad");
    this.e.b();
  }
  
  private String a(SeriesCollection paramSeriesCollection)
  {
    String str1 = "";
    String str2 = "";
    for (int i1 = 0; i1 < paramSeriesCollection.getCount(); i1++)
    {
      String str3 = paramSeriesCollection.get(i1).m() == null ? null : paramSeriesCollection.get(i1).m().q();
      if (str3 != null)
      {
        String str4;
        if (str3.indexOf("$") < 0)
        {
          str4 = str2 + zw.a(zw.a(str3, "{", ""), "}", "");
          str1 = str1 + str3;
          str2 = ",";
        }
        else
        {
          str4 = zw.a(str3.substring(1), "$", "");
          String[] arrayOfString1 = zw.d(str4, '!');
          String str5 = arrayOfString1[0];
          String[] arrayOfString2 = zw.d(arrayOfString1[1], ':');
          if (arrayOfString2.length == 1) {
            str1 = str1 + str5 + "." + arrayOfString2[0] + ":" + str5 + "." + arrayOfString2[0] + " ";
          } else {
            str1 = str1 + str5 + "." + arrayOfString2[0] + ":" + str5 + "." + arrayOfString2[1] + " ";
          }
        }
      }
    }
    return str1;
  }
  
  private void a(Shape paramShape, boolean paramBoolean)
    throws Exception
  {
    if ((paramBoolean) && (((Picture)paramShape).getData() == null)) {
      return;
    }
    this.e.b("draw:image");
    if (paramBoolean)
    {
      localObject = (Picture)paramShape;
      this.e.a("xlink", "href", null, "Pictures/" + ((Picture)localObject).b() + FileFormatUtil.a(((Picture)localObject).getImageFormat()));
    }
    else
    {
      localObject = (OleObject)paramShape;
      this.e.a("xlink", "href", null, "ObjectReplacements/Object " + ((OleObject)localObject).e());
    }
    this.e.a("xlink", "show", null, "embed");
    this.e.a("xlink", "actuate", null, "onLoad");
    Object localObject = paramShape.getTextBody();
    zatk.a(this.e, (FontSettingCollection)localObject, "T" + zasp.a(((FontSettingCollection)localObject).f()));
    this.e.b();
  }
  
  private void c(int paramInt)
    throws Exception
  {
    this.e.b("table:table-row");
    this.e.a("table", "number-rows-repeated", null, zasp.a(paramInt));
    this.e.a("table", "style-name", null, this.a.a.a());
    if (this.a.o) {
      b(15, 256);
    }
    this.e.b();
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws Exception
  {
    if (paramInt4 == 0)
    {
      b();
    }
    else
    {
      int i1;
      if (paramInt1 > -1)
      {
        if (paramInt1 + 1 == paramInt3)
        {
          if (paramInt2 > paramInt4)
          {
            this.e.b();
            this.f -= 1;
          }
          else if (paramInt2 < paramInt4)
          {
            while (paramInt2 < paramInt4)
            {
              this.e.b("table:table-row-group");
              this.f += 1;
              paramInt2++;
            }
          }
        }
        else
        {
          b();
          for (i1 = 0; i1 < paramInt4; i1++)
          {
            this.e.b("table:table-row-group");
            this.f += 1;
          }
        }
      }
      else {
        for (i1 = 0; i1 < paramInt4; i1++)
        {
          this.e.b("table:table-row-group");
          this.f += 1;
        }
      }
    }
  }
  
  private void a(Comment paramComment)
    throws Exception
  {
    String str = "";
    this.e.b("office:annotation");
    CommentShape localCommentShape = paramComment.getCommentShape();
    int i1 = localCommentShape.getPlacement();
    localCommentShape.setPlacement(0);
    this.e.a("office", "display", null, paramComment.isVisible() ? "true" : "false");
    this.e.a("draw", "text-style-name", null, str);
    this.e.a("svg", "width", null, zasp.a(zbxp.a(), localCommentShape.getWidth()));
    this.e.a("svg", "height", null, zasp.a(zbxp.a(), localCommentShape.getHeight()));
    this.e.a("svg", "x", null, zasp.a(zbxp.a(), localCommentShape.getLeftToCorner()));
    this.e.a("svg", "y", null, zasp.a(zbxp.a(), localCommentShape.getTopToCorner()));
    zatk.a(this.e, paramComment.b(), str);
    localCommentShape.setPlacement(i1);
    this.e.b();
  }
  
  private Hyperlink c(int paramInt1, int paramInt2)
  {
    HyperlinkCollection localHyperlinkCollection = this.a.i.getHyperlinks();
    for (int i1 = 0; i1 < localHyperlinkCollection.getCount(); i1++)
    {
      Hyperlink localHyperlink = localHyperlinkCollection.get(i1);
      if ((localHyperlink.getArea().StartRow <= paramInt1) && (localHyperlink.getArea().EndRow >= paramInt1) && (localHyperlink.getArea().StartColumn <= paramInt2) && (localHyperlink.getArea().EndColumn >= paramInt2)) {
        return localHyperlink;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */