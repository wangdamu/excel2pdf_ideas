package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcid
{
  private Workbook a;
  private zchd b;
  private zcbw c;
  private Worksheet d;
  private zqi e;
  private zqh f;
  private int g;
  private byte[] h;
  private int i;
  private Cells j;
  private ListObject k = null;
  
  public ListObject a()
  {
    return this.k;
  }
  
  zcid(zchd paramzchd)
  {
    this.b = paramzchd;
    this.a = paramzchd.a;
    this.f = paramzchd.b;
  }
  
  void a(zqi paramzqi, zcbw paramzcbw)
    throws Exception
  {
    this.e = paramzqi;
    this.d = paramzqi.d;
    this.j = this.d.getCells();
    this.c = paramzcbw;
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 343: 
        b();
        break;
      case 344: 
        this.c.a(1L);
        return;
      case 161: 
        f();
        break;
      case 345: 
        c();
        break;
      case 513: 
        e();
        break;
      default: 
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
  
  private void b()
    throws Exception
  {
    this.h = this.b.a(this.c);
    CellArea localCellArea = zcgj.a(this.h, 0);
    this.k = new ListObject(this.d.getListObjects());
    this.k.a(localCellArea.StartRow);
    this.k.b(localCellArea.StartColumn);
    this.k.c(localCellArea.EndRow);
    this.k.d(localCellArea.EndColumn);
    this.d.getListObjects().a(this.k);
    int m = zc.a(this.h, 16);
    this.k.a = zcij.B(m);
    int n = zc.a(this.h, 20);
    this.k.k(n);
    int i1 = zc.a(this.h, 24);
    this.k.l(i1);
    int i2 = this.h[32];
    this.k.b((i2 & 0xFF & 0x1) != 0);
    this.k.c((i2 & 0xFF & 0x2) != 0);
    this.k.a((i2 & 0xFF & 0x8) != 0);
    this.k.d((i2 & 0xFF & 0x10) != 0);
    int i3 = zc.a(this.h, 28);
    if (i3 != 0) {
      this.k.m(i3);
    } else {
      this.k.b(false);
    }
    this.k.e = zc.a(this.h, 36);
    this.k.f = zc.a(this.h, 40);
    this.k.g = zc.a(this.h, 44);
    this.k.h = zc.a(this.h, 48);
    this.k.i = zc.a(this.h, 52);
    this.k.j = zc.a(this.h, 56);
    this.k.j(zc.a(this.h, 60));
    int i4 = 64;
    int[] arrayOfInt = { i4 };
    String str1 = zcgj.a(this.h, arrayOfInt);
    i4 = arrayOfInt[0];
    if ((str1 != null) && (str1.length() > 0)) {
      this.k.d(str1);
    }
    arrayOfInt[0] = i4;
    String str2 = zcgj.a(this.h, arrayOfInt);
    i4 = arrayOfInt[0];
    if ((str2 != null) && (str2.length() > 0)) {
      this.k.c(str2);
    }
    arrayOfInt[0] = i4;
    this.k.setComment(zcgj.a(this.h, arrayOfInt));
    i4 = arrayOfInt[0];
  }
  
  private void c()
    throws Exception
  {
    this.h = this.b.a(this.c);
    int m = zc.a(this.h, 0);
    int n = 0;
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 347: 
        a(n);
        n++;
        break;
      case 346: 
        this.c.a(1L);
        return;
      default: 
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
  
  private void d()
    throws Exception
  {
    this.h = this.b.a(this.c);
    ListColumn localListColumn = this.k.getListColumns().get(this.k.getListColumns().getCount() - 1);
    int m = 0;
    localListColumn.a(new XmlColumnProperty());
    localListColumn.a().a(zc.a(this.h, m));
    m += 4;
    localListColumn.a().a = ((this.h[m] & 0xFF & 0x2) != 0);
    m += 4;
    localListColumn.a().b(ztr.c(this.h[m] & 0xFF));
    m += 4;
    localListColumn.a().a(zcgj.d(this.h, m));
  }
  
  private void a(int paramInt)
    throws Exception
  {
    this.h = this.b.a(this.c);
    int m = 24;
    int[] arrayOfInt = { m };
    String str1 = zcgj.a(this.h, arrayOfInt);
    m = arrayOfInt[0];
    ListColumn localListColumn = new ListColumn(this.k.getListColumns(), str1, paramInt);
    localListColumn.d(str1);
    this.k.getListColumns().a(localListColumn);
    localListColumn.n = zc.a(this.h, 0);
    int n = zcij.D(zc.a(this.h, 4));
    localListColumn.a(n);
    localListColumn.k = zc.a(this.h, 8);
    localListColumn.j = zc.a(this.h, 12);
    localListColumn.l = zc.a(this.h, 16);
    localListColumn.b(zc.a(this.h, 20));
    arrayOfInt[0] = m;
    String str2 = zcgj.a(this.h, arrayOfInt);
    m = arrayOfInt[0];
    localListColumn.b(str2);
    localListColumn.a(str2);
    arrayOfInt[0] = m;
    String str3 = zcgj.a(this.h, arrayOfInt);
    m = arrayOfInt[0];
    localListColumn.e(str3);
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 348: 
        this.c.a(1L);
        return;
      case 351: 
        this.h = this.b.a(this.c);
        localListColumn.d = ((this.h[0] & 0xFF & 0x2) != 0);
        localListColumn.e = new byte[this.h.length - 1];
        System.arraycopy(this.h, 1, localListColumn.e, 0, this.h.length - 1);
        break;
      case 352: 
        this.h = this.b.a(this.c);
        localListColumn.b = ((this.h[0] & 0xFF & 0x2) != 0);
        localListColumn.f = new byte[this.h.length - 1];
        System.arraycopy(this.h, 1, localListColumn.f, 0, this.h.length - 1);
        break;
      case 349: 
        d();
        break;
      case 350: 
      default: 
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
  
  private void e()
    throws Exception
  {
    this.h = this.b.a(this.c);
    int m = this.h[0];
    this.k.setShowTableStyleFirstColumn((m & 0xFF & 0x1) != 0);
    this.k.setShowTableStyleLastColumn((m & 0xFF & 0x2) != 0);
    this.k.setShowTableStyleRowStripes((m & 0xFF & 0x4) != 0);
    this.k.setShowTableStyleColumnStripes((m & 0xFF & 0x8) != 0);
    this.k.setTableStyleName(zcgj.d(this.h, 2));
  }
  
  private void f()
    throws Exception
  {
    this.h = this.b.a(this.c);
    AutoFilter localAutoFilter = this.k.getAutoFilter();
    int m = zc.a(this.h, 0);
    int n = zc.a(this.h, 4);
    int i1 = zc.a(this.h, 8);
    int i2 = zc.a(this.h, 12);
    localAutoFilter.a(m, n, i1, i2);
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 162: 
        this.c.a(1L);
        return;
      case 163: 
        a(localAutoFilter);
        break;
      default: 
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
  
  private void a(AutoFilter paramAutoFilter)
    throws Exception
  {
    this.h = this.b.a(this.c);
    int m = zc.a(this.h, 0);
    boolean bool1 = (this.h[4] & 0xFF & 0x1) == 1;
    boolean bool2 = (this.h[4] & 0xFF & 0x2) == 0;
    FilterColumn localFilterColumn = null;
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 164: 
        this.c.a(1L);
        if (localFilterColumn != null) {
          paramAutoFilter.c.a(localFilterColumn);
        }
        return;
      case 171: 
        this.h = this.b.a(this.c);
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
        this.h = this.b.a(this.c);
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
        this.h = this.b.a(this.c);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, m, bool1, bool2);
        localFilterColumn.setFilterType(0);
        ColorFilter localColorFilter = new ColorFilter(localFilterColumn);
        localFilterColumn.setFilter(localColorFilter);
        localColorFilter.setFilterByFillColor(this.h[4] == 1);
        localColorFilter.a(zc.a(this.h, 0));
        break;
      case 169: 
        this.h = this.b.a(this.c);
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
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
  
  private void a(CustomFilterCollection paramCustomFilterCollection)
    throws Exception
  {
    this.h = this.b.a(this.c);
    boolean bool = this.h[0] == 1;
    paramCustomFilterCollection.setAnd(bool);
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 173: 
        this.c.a(1L);
        return;
      case 174: 
        this.h = this.b.a(this.c);
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
    this.h = this.b.a(this.c);
    int m = this.h[0] == 1 ? 1 : 0;
    if (m != 0) {
      paramMultipleFilterCollection.setMatchBlank(true);
    }
    int n = zc.a(this.h, 4);
    paramMultipleFilterCollection.a = zcij.s(n);
    for (;;)
    {
      this.g = this.c.a();
      switch (this.g)
      {
      case 166: 
        this.c.a(1L);
        return;
      case 167: 
        this.h = this.b.a(this.c);
        int i1 = 0;
        int[] arrayOfInt = { i1 };
        String str = zcgj.a(this.h, arrayOfInt);
        i1 = arrayOfInt[0];
        paramMultipleFilterCollection.b(str);
        break;
      case 175: 
        this.h = this.b.a(this.c);
        DateTimeGroupItem localDateTimeGroupItem = new DateTimeGroupItem();
        paramMultipleFilterCollection.a(localDateTimeGroupItem);
        localDateTimeGroupItem.setYear(zc.b(this.h, 0));
        localDateTimeGroupItem.setMonth(zc.b(this.h, 2));
        localDateTimeGroupItem.setDay(zc.b(this.h, 4));
        localDateTimeGroupItem.setHour(zc.b(this.h, 6));
        localDateTimeGroupItem.setMinute(zc.b(this.h, 8));
        localDateTimeGroupItem.setSecond(zc.b(this.h, 10));
        localDateTimeGroupItem.setDateTimeGroupingType(zcij.x(zc.a(this.h, 20)));
        break;
      default: 
        this.i = this.c.b();
        this.c.a(this.i);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */