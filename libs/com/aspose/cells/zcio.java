package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;
import java.util.ArrayList;
import java.util.HashMap;

class zcio
{
  private Workbook a;
  private zajl b;
  private zchd c;
  private zcbw d;
  private Worksheet e;
  private zqi f;
  private zqh g;
  private int h;
  private byte[] i;
  private int j;
  private boolean k;
  private boolean l;
  private Cells m;
  
  zcio(zchd paramzchd)
  {
    this.c = paramzchd;
    this.a = paramzchd.a;
    this.g = paramzchd.b;
    this.b = this.a.getWorksheets().g;
  }
  
  void a(zqi paramzqi, zcbw paramzcbw)
    throws Exception
  {
    this.c.d.a = paramzcbw;
    this.f = paramzqi;
    this.e = paramzqi.d;
    this.m = this.e.getCells();
    this.d = paramzcbw;
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 130: 
        this.d.a(1L);
        return;
      case 147: 
        q();
        break;
      case 133: 
        r();
        break;
      case 422: 
        b();
        break;
      case 485: 
        s();
        break;
      case 60: 
        p();
        break;
      case 145: 
        n();
        break;
      case 161: 
        g();
        break;
      case 535: 
        m();
        break;
      case 177: 
        c();
        break;
      case 392: 
        a(this.e.getHorizontalPageBreaks());
        break;
      case 394: 
        a(this.e.getVerticalPageBreaks());
        break;
      case 476: 
        b(this.e.getPageSetup());
        break;
      case 477: 
        a(this.e.getPageSetup());
        break;
      case 478: 
        a(this.e.getPageSetup(), null);
        break;
      case 479: 
        c(this.e.getPageSetup());
        break;
      case 494: 
        l();
        break;
      case 461: 
        i();
        break;
      case 1135: 
        h();
        break;
      case 573: 
        j();
        break;
      case 550: 
        this.i = this.c.a(this.d);
        paramzqi.h = zcgj.d(this.i, 0);
        break;
      case 551: 
        this.i = this.c.a(this.d);
        paramzqi.f = zcgj.d(this.i, 0);
        break;
      case 552: 
        this.i = this.c.a(this.d);
        paramzqi.g = zcgj.d(this.i, 0);
        break;
      case 562: 
        this.i = this.c.a(this.d);
        paramzqi.i = zcgj.d(this.i, 0);
        break;
      case 639: 
        e();
        break;
      case 644: 
        f();
        break;
      case 1054: 
        k();
        break;
      case 1041: 
        d();
        break;
      case 500: 
        a();
        break;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void d()
    throws Exception
  {
    this.i = this.c.a(this.d);
    SparklineGroup localSparklineGroup = new SparklineGroup(this.e.getSparklineGroupCollection());
    this.e.getSparklineGroupCollection().a(localSparklineGroup);
    localSparklineGroup.setType(0);
    localSparklineGroup.setPlotEmptyCellsType(1);
    int n = 0;
    zcfz localzcfz = new zcfz();
    n = localzcfz.a(this.i, n);
    localSparklineGroup.a = zc.b(this.i, n);
    n += 2;
    if (((localSparklineGroup.a & 0x1) != 0) && (localzcfz.c != null) && (localzcfz.c.length > 0)) {
      localSparklineGroup.b = localzcfz.c[0];
    }
    int i1 = 0;
    Object localObject = { i1 };
    zaml localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setSeriesColor(new CellsColor(this.f.m.a, localzaml));
    }
    i1 = 0;
    localObject = new boolean[] { i1 };
    localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setNegativePointsColor(new CellsColor(this.f.m.a, localzaml));
    }
    i1 = 0;
    localObject = new boolean[] { i1 };
    localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setHorizontalAxisColor(new CellsColor(this.f.m.a, localzaml));
    }
    i1 = 0;
    localObject = new boolean[] { i1 };
    localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setMarkersColor(new CellsColor(this.f.m.a, localzaml));
    }
    i1 = 0;
    localObject = new boolean[] { i1 };
    localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setFirstPointColor(new CellsColor(this.f.m.a, localzaml));
    }
    i1 = 0;
    localObject = new boolean[] { i1 };
    localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setLastPointColor(new CellsColor(this.f.m.a, localzaml));
    }
    i1 = 0;
    localObject = new boolean[] { i1 };
    localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setHighPointColor(new CellsColor(this.f.m.a, localzaml));
    }
    i1 = 0;
    localObject = new boolean[] { i1 };
    localzaml = zchu.a(this.i, n, (boolean[])localObject);
    i1 = localObject[0];
    n += 8;
    if (i1 == 0) {
      localSparklineGroup.setLowPointColor(new CellsColor(this.f.m.a, localzaml));
    }
    if (localSparklineGroup.getVerticalAxisMaxValueType() == 2) {
      localSparklineGroup.c = zc.f(this.i, n);
    }
    n += 8;
    if (localSparklineGroup.getVerticalAxisMinValueType() == 2) {
      localSparklineGroup.d = zc.f(this.i, n);
    }
    n += 8;
    localSparklineGroup.setLineWeight(zc.f(this.i, n));
    n += 8;
    switch (this.i[n])
    {
    case 0: 
      localSparklineGroup.setType(0);
      break;
    case 1: 
      localSparklineGroup.setType(1);
      break;
    case 2: 
      localSparklineGroup.setType(2);
    }
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 1043: 
        this.i = this.c.a(this.d);
        Sparkline localSparkline = new Sparkline(localSparklineGroup.getSparklineCollection());
        localSparklineGroup.getSparklineCollection().a(localSparkline);
        n = 0;
        localzcfz = new zcfz();
        n = localzcfz.a(this.i, n);
        localObject = (CellArea)localzcfz.a().get(0);
        localSparkline.a(((CellArea)localObject).StartRow);
        localSparkline.b(((CellArea)localObject).StartColumn);
        localSparkline.a = localzcfz.c[0];
        break;
      case 1059: 
        this.j = this.d.b();
        this.d.a(this.j);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  void a()
    throws Exception
  {
    this.i = this.c.a(this.d);
    ScenarioCollection localScenarioCollection = this.e.getScenarios();
    localScenarioCollection.a = zc.b(this.i, 0);
    localScenarioCollection.b = zc.b(this.i, 2);
    localScenarioCollection.c = zcgj.b(this.i, 4);
    Scenario localScenario = null;
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 502: 
        this.i = this.c.a(this.d);
        localScenario = new Scenario();
        localScenarioCollection.a(localScenario);
        int n = 2;
        localScenario.e = (this.i[n] == 1);
        n += 4;
        localScenario.d = (this.i[n] == 1);
        n += 4;
        localScenario.b = zcgj.d(this.i, n);
        n += 4 + (localScenario.b == null ? 0 : localScenario.b.length() * 2);
        localScenario.a = zcgj.d(this.i, n);
        n += 4 + (localScenario.getComment() == null ? 0 : localScenario.getComment().length() * 2);
        localScenario.c = zcgj.d(this.i, n);
        n += 4 + (localScenario.getUser() == null ? 0 : localScenario.getUser().length() * 2);
        break;
      case 504: 
        this.i = this.c.a(this.d);
        ScenarioInputCell localScenarioInputCell = new ScenarioInputCell();
        localScenario.getInputCells().a(localScenarioInputCell);
        int i1 = 0;
        localScenarioInputCell.a = zc.a(this.i, i1);
        i1 += 4;
        localScenarioInputCell.b = zc.a(this.i, i1);
        i1 += 12;
        localScenarioInputCell.d = zc.b(this.i, i1);
        i1 += 2;
        localScenarioInputCell.c = zcgj.d(this.i, i1);
        break;
      case 503: 
        this.d.a(1L);
        localScenario = null;
        break;
      case 501: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  void b()
    throws Exception
  {
    this.d.a(1L);
    zoh localzoh = null;
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 423: 
        localzoh = new zoh(this.e);
        this.e.K().a(localzoh);
        this.i = this.c.a(this.d);
        int n = 0;
        byte[] arrayOfByte = new byte[16];
        System.arraycopy(this.i, n, arrayOfByte, 0, 16);
        localzoh.n = new zh(arrayOfByte);
        n += 16;
        localzoh.q = zc.a(this.i, n);
        n += 4;
        localzoh.c(zc.a(this.i, n));
        n += 4;
        localzoh.g(zc.a(this.i, n));
        n += 4;
        int i1 = zc.a(this.i, n);
        n += 4;
        localzoh.d((i1 & 0x1) != 0);
        localzoh.l((i1 & 0x2) != 0);
        localzoh.m((i1 & 0x4) != 0);
        localzoh.n((i1 & 0x8) != 0);
        localzoh.r((i1 & 0x10) != 0);
        localzoh.q((i1 & 0x20) != 0);
        localzoh.e().setCenterHorizontally((i1 & 0x40) != 0);
        localzoh.e().setCenterVertically((i1 & 0x80) != 0);
        localzoh.e().setPrintHeadings((i1 & 0x100) != 0);
        localzoh.e().setPrintGridlines((i1 & 0x200) != 0);
        localzoh.e().setPercentScale((i1 & 0x400) != 0);
        localzoh.h((i1 & 0x800) != 0);
        localzoh.i((i1 & 0x1000) != 0);
        localzoh.f((i1 & 0x2000) != 0);
        localzoh.e((i1 & 0x4000) != 0);
        localzoh.k((i1 & 0x20000) != 0);
        localzoh.j((i1 & 0x40000) != 0);
        localzoh.a((i1 & 0x80000) != 0);
        localzoh.b((i1 & 0x200000) != 0);
        switch (i1 & 0xC00000)
        {
        case 0: 
          localzoh.e(0);
          break;
        case 4194304: 
          localzoh.e(1);
          break;
        case 8388608: 
          localzoh.e(2);
        }
        localzoh.g((i1 & 0x2000000) != 0);
        switch (i1 & 0xC000000)
        {
        case 0: 
          localzoh.d(0);
          break;
        case 67108864: 
          localzoh.d(1);
          break;
        case 134217728: 
          localzoh.d(2);
        }
        localzoh.s((i1 & 0x20000000) != 0);
        CellArea localCellArea = zcgj.a(this.i, n);
        localzoh.a(localCellArea.StartRow);
        localzoh.b(localCellArea.StartColumn);
        break;
      case 151: 
        a(localzoh.c());
        break;
      case 152: 
        a(localzoh.d());
        break;
      case 392: 
        a(localzoh.f());
        break;
      case 394: 
        a(localzoh.g());
        break;
      case 476: 
        b(localzoh.e());
        break;
      case 477: 
        a(localzoh.e());
        break;
      case 478: 
        a(localzoh.e(), localzoh);
        break;
      case 479: 
        c(localzoh.e());
        break;
      case 424: 
        this.d.a(1L);
        localzoh = null;
        break;
      case 425: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void e()
    throws Exception
  {
    this.i = this.c.a(this.d);
    zqf localzqf = new zqf(false);
    int n = 14;
    localzqf.j = (zc.a(this.i, 0) != 1);
    localzqf.i = ((this.i[4] & 0xFF & 0x1) == 1);
    localzqf.b = zauj.z(zc.a(this.i, 8));
    localzqf.l = ((this.i[12] & 0xFF & 0x1) == 1);
    localzqf.k = ((this.i[12] & 0xFF & 0x2) == 2);
    int[] arrayOfInt1 = { n };
    localzqf.g = zcgj.a(this.i, arrayOfInt1);
    n = arrayOfInt1[0];
    if (localzqf.l)
    {
      int i1 = zc.a(this.i, n);
      localzqf.m = new byte[i1 + 8];
      System.arraycopy(this.i, n, localzqf.m, 0, localzqf.m.length);
    }
    else
    {
      int[] arrayOfInt2 = { n };
      String str = zcgj.a(this.i, arrayOfInt2);
      n = arrayOfInt2[0];
      zrl localzrl = this.f.b(str);
      if (localzrl != null) {
        localzqf.c = localzrl.d;
      }
    }
    this.f.p.put("\000s" + localzqf.b, localzqf);
  }
  
  private void f()
    throws Exception
  {
    zqn localzqn = new zqn(false);
    this.i = this.c.a(this.d);
    int n = 4;
    localzqn.b = zauj.z(zc.a(this.i, 0));
    int[] arrayOfInt = { n };
    String str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    localzqn.c = this.f.a(str);
    arrayOfInt[0] = n;
    localzqn.a = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    this.f.p.put("\000s" + localzqn.b, localzqn);
  }
  
  private void a(HorizontalPageBreakCollection paramHorizontalPageBreakCollection)
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 393: 
        this.d.a(1L);
        return;
      case 396: 
        a(false, null, paramHorizontalPageBreakCollection);
        break;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void a(VerticalPageBreakCollection paramVerticalPageBreakCollection)
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 395: 
        this.d.a(1L);
        return;
      case 396: 
        a(true, paramVerticalPageBreakCollection, null);
        break;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void a(boolean paramBoolean, VerticalPageBreakCollection paramVerticalPageBreakCollection, HorizontalPageBreakCollection paramHorizontalPageBreakCollection)
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    int i1 = zc.a(this.i, 4);
    int i2 = zc.a(this.i, 8);
    if (i2 < i1)
    {
      int i3 = i1;
      i1 = i2;
      i2 = i3;
    }
    if (paramBoolean) {
      paramVerticalPageBreakCollection.a(i1, i2, n);
    } else {
      paramHorizontalPageBreakCollection.a(n, i1, i2);
    }
  }
  
  private void g()
    throws Exception
  {
    this.i = this.c.a(this.d);
    AutoFilter localAutoFilter = this.e.getAutoFilter();
    Name localName = this.a.getWorksheets().getNames().a("_FILTERDATABASE", this.e.getIndex());
    if (localName != null) {
      localAutoFilter.a(localName);
    }
    int n = zc.a(this.i, 0);
    int i1 = zc.a(this.i, 4);
    int i2 = zc.a(this.i, 8);
    int i3 = zc.a(this.i, 12);
    localAutoFilter.setRange(n, i2, i3);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 162: 
        this.d.a(1L);
        return;
      case 163: 
        a(localAutoFilter);
        break;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void a(AutoFilter paramAutoFilter)
    throws Exception
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    boolean bool1 = (this.i[4] & 0xFF & 0x1) == 1;
    boolean bool2 = (this.i[4] & 0xFF & 0x2) == 0;
    FilterColumn localFilterColumn = null;
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 164: 
        this.d.a(1L);
        if (localFilterColumn != null) {
          paramAutoFilter.c.a(localFilterColumn);
        }
        return;
      case 171: 
        this.i = this.c.a(this.d);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, n, bool1, bool2);
        localFilterColumn.setFilterType(2);
        DynamicFilter localDynamicFilter = new DynamicFilter();
        localFilterColumn.setFilter(localDynamicFilter);
        int i1 = zc.a(this.i, 0);
        localDynamicFilter.setDynamicFilterType(zcij.t(i1));
        int i2 = this.i[4] == 1 ? 1 : 0;
        double d1 = zc.f(this.i, 5);
        double d2 = zc.f(this.i, 13);
        if (i2 != 0) {
          localDynamicFilter.setMaxValue(Double.valueOf(d2));
        }
        localDynamicFilter.setValue(Double.valueOf(d1));
        break;
      case 170: 
        this.i = this.c.a(this.d);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, n, bool1, bool2);
        localFilterColumn.setFilterType(5);
        boolean bool3 = (this.i[0] & 0xFF & 0x1) != 0;
        boolean bool4 = (this.i[0] & 0xFF & 0x2) != 0;
        int i3 = (this.i[0] & 0xFF & 0x4) != 0 ? 1 : 0;
        double d3 = zc.f(this.i, 1);
        double d4 = zc.f(this.i, 9);
        int i4 = 10;
        if (i3 != 0) {
          i4 = (int)d3;
        }
        Top10Filter localTop10Filter = new Top10Filter(bool3, bool4, i4);
        localFilterColumn.setFilter(localTop10Filter);
        try
        {
          localTop10Filter.setCriteria(Double.valueOf(d4));
        }
        catch (Exception localException) {}
        break;
      case 168: 
        this.i = this.c.a(this.d);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, n, bool1, bool2);
        localFilterColumn.setFilterType(0);
        ColorFilter localColorFilter = new ColorFilter(localFilterColumn);
        localFilterColumn.setFilter(localColorFilter);
        localColorFilter.setFilterByFillColor(this.i[4] == 1);
        localColorFilter.a(zc.a(this.i, 0));
        break;
      case 169: 
        this.i = this.c.a(this.d);
        int i5 = zc.a(this.i, 0);
        int i6 = zc.a(this.i, 4);
        localFilterColumn = new FilterColumn(paramAutoFilter.c, n, bool1, bool2);
        localFilterColumn.setFilterType(4);
        IconFilter localIconFilter = new IconFilter(localFilterColumn);
        localFilterColumn.setFilter(localIconFilter);
        localIconFilter.setIconSetType(zcij.q(i5));
        localIconFilter.setIconId(i6);
        break;
      case 165: 
        localFilterColumn = new FilterColumn(paramAutoFilter.c, n, bool1, bool2);
        localFilterColumn.setFilterType(3);
        MultipleFilterCollection localMultipleFilterCollection = new MultipleFilterCollection();
        localFilterColumn.setFilter(localMultipleFilterCollection);
        a(localMultipleFilterCollection);
        break;
      case 172: 
        localFilterColumn = new FilterColumn(paramAutoFilter.c, n, bool1, bool2);
        localFilterColumn.setFilterType(1);
        CustomFilterCollection localCustomFilterCollection = new CustomFilterCollection();
        localFilterColumn.setFilter(localCustomFilterCollection);
        a(localCustomFilterCollection);
        break;
      case 166: 
      case 167: 
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void a(CustomFilterCollection paramCustomFilterCollection)
    throws Exception
  {
    this.i = this.c.a(this.d);
    boolean bool = this.i[0] == 1;
    paramCustomFilterCollection.setAnd(bool);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 173: 
        this.d.a(1L);
        return;
      case 174: 
        this.i = this.c.a(this.d);
        int n = this.i[0];
        int i1 = this.i[1];
        CustomFilter localCustomFilter = new CustomFilter();
        paramCustomFilterCollection.a(localCustomFilter);
        localCustomFilter.setFilterOperatorType(zcij.v(i1 & 0xFF));
        if (n == 6)
        {
          String str = zcgj.d(this.i, 10);
          localCustomFilter.setCriteria(str);
        }
        else
        {
          localCustomFilter.setCriteria(Double.valueOf(zc.f(this.i, 2)));
        }
        break;
      }
    }
  }
  
  private void a(MultipleFilterCollection paramMultipleFilterCollection)
    throws Exception
  {
    this.i = this.c.a(this.d);
    int n = this.i[0] == 1 ? 1 : 0;
    if (n != 0) {
      paramMultipleFilterCollection.setMatchBlank(true);
    }
    int i1 = zc.a(this.i, 4);
    paramMultipleFilterCollection.a = zcij.s(i1);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 166: 
        this.d.a(1L);
        return;
      case 167: 
        this.i = this.c.a(this.d);
        String str = zcgj.d(this.i, 0);
        paramMultipleFilterCollection.b(str);
        break;
      case 175: 
        this.i = this.c.a(this.d);
        DateTimeGroupItem localDateTimeGroupItem = new DateTimeGroupItem();
        paramMultipleFilterCollection.a(localDateTimeGroupItem);
        localDateTimeGroupItem.setYear(zc.b(this.i, 0));
        localDateTimeGroupItem.setMonth(zc.b(this.i, 2));
        localDateTimeGroupItem.setDay(zc.b(this.i, 4));
        localDateTimeGroupItem.setHour(zc.b(this.i, 6));
        localDateTimeGroupItem.setMinute(zc.b(this.i, 8));
        localDateTimeGroupItem.setSecond(zc.b(this.i, 10));
        localDateTimeGroupItem.setDateTimeGroupingType(zcij.x(zc.a(this.i, 20)));
        break;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void h()
    throws Exception
  {
    this.d.a(1L);
    FormatConditionCollection localFormatConditionCollection1 = null;
    Object localObject = null;
    for (;;)
    {
      this.h = this.d.a();
      int n;
      zcdi localzcdi;
      switch (this.h)
      {
      case 1136: 
        this.d.a(1L);
        return;
      case 1046: 
        n = 0;
        this.i = this.c.a(this.d);
        localFormatConditionCollection1 = new FormatConditionCollection(this.e.getConditionalFormattings());
        zcfz localzcfz1 = new zcfz();
        n = localzcfz1.a(this.i, n);
        localFormatConditionCollection1.d = (this.i[(n + 4)] == 1);
        localFormatConditionCollection1.b = localzcfz1.a();
        break;
      case 1047: 
        localObject = null;
        if (localFormatConditionCollection1.getCount() > 0) {
          this.e.getConditionalFormattings().a(localFormatConditionCollection1);
        }
        localFormatConditionCollection1 = null;
        this.d.a(1L);
        break;
      case 1048: 
        localObject = null;
        n = 1;
        this.i = this.c.a(this.d);
        int i1 = 0;
        zcfz localzcfz2 = new zcfz();
        i1 = localzcfz2.a(this.i, i1);
        int i2 = this.i[(i1 + 46 + 16)] == 1 ? 1 : 0;
        if (i2 != 0)
        {
          byte[] arrayOfByte = new byte[16];
          System.arraycopy(this.i, i1 + 46, arrayOfByte, 0, 16);
          zh localzh = new zh(arrayOfByte);
          i5 = this.e.getConditionalFormattings().getCount();
          if ((i5 > 0) && (i2 != 0)) {
            for (i6 = 0; i6 < i5; i6++)
            {
              FormatConditionCollection localFormatConditionCollection2 = this.e.getConditionalFormattings().get(i6);
              for (i8 = 0; i8 < localFormatConditionCollection2.getCount(); i8++)
              {
                FormatCondition localFormatCondition = localFormatConditionCollection2.get(i8);
                if (localzh.equals(localFormatCondition.b()))
                {
                  n = 0;
                  localObject = localFormatCondition;
                  break;
                }
              }
              if (localObject != null) {
                break;
              }
            }
          }
        }
        if (localObject == null) {
          localObject = new FormatCondition(localFormatConditionCollection1);
        }
        int i3 = this.i[i1] & 0xFF;
        int i4 = zc.a(this.i, i1 + 4);
        int i5 = zc.a(this.i, i1 + 8);
        int i6 = zc.b(this.i, i1 + 12);
        if (i6 != -1) {
          ((FormatCondition)localObject).setPriority(i6);
        }
        int i7 = zc.a(this.i, i1 + 16);
        zcij.a(this.i, i3, i4, i7, (FormatCondition)localObject);
        ((FormatCondition)localObject).setOperator(zcij.a(i7));
        if ((i5 >= 0) && (i5 < this.a.getWorksheets().getDxfs().getCount())) {
          ((FormatCondition)localObject).getStyle().copy(this.a.getWorksheets().getDxfs().get(i5));
        }
        ((FormatCondition)localObject).setStopIfTrue((this.i[(i1 + 28)] & 0xFF & 0x2) != 0);
        int i8 = zc.a(this.i, i1 + 30);
        int i9 = zc.a(this.i, i1 + 34);
        int i10 = zc.a(this.i, i1 + 38);
        if (localzcfz2.c != null) {
          for (int i11 = 0; i11 < localzcfz2.c.length; i11++) {
            if (i11 == 0) {
              ((FormatCondition)localObject).a(localzcfz2.c[0]);
            } else {
              ((FormatCondition)localObject).b(localzcfz2.c[i11]);
            }
          }
        }
        i1 += 46;
        i1 += 20;
        if (i1 < this.i.length) {
          ((FormatCondition)localObject).setText(zcgj.d(this.i, i1));
        }
        if (n != 0) {
          localFormatConditionCollection1.a((FormatCondition)localObject);
        }
        break;
      case 1049: 
        localObject = null;
        this.d.a(1L);
        break;
      case 507: 
        this.i = this.d.d();
        localzcdi = zchu.a(this.i, 4, this.e.c());
        ((FormatCondition)localObject).f = localzcdi.b;
        break;
      case 1171: 
        this.i = this.d.d();
        localzcdi = zchu.a(this.i, 4, this.e.c());
        ((FormatCondition)localObject).f = localzcdi.b;
        break;
      case 1052: 
        b((FormatCondition)localObject);
        break;
      case 1157: 
        h((FormatCondition)localObject);
        break;
      case 1051: 
        f((FormatCondition)localObject);
        break;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void i()
    throws Exception
  {
    this.i = this.c.a(this.d);
    int n = this.e.getConditionalFormattings().add();
    FormatConditionCollection localFormatConditionCollection = this.e.getConditionalFormattings().get(n);
    localFormatConditionCollection.d = (this.i[4] == 1);
    FormatCondition localFormatCondition = null;
    localFormatConditionCollection.b = zcgj.b(this.i, 8);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 462: 
        this.d.a(1L);
        return;
      case 463: 
        this.i = this.c.a(this.d);
        localFormatCondition = new FormatCondition(localFormatConditionCollection);
        localFormatConditionCollection.a(localFormatCondition);
        int i1 = this.i[0] & 0xFF;
        int i2 = zc.a(this.i, 4);
        int i3 = zc.a(this.i, 16);
        zcij.a(this.i, i1, i2, i3, localFormatCondition);
        localFormatCondition.setOperator(zcij.a(zc.a(this.i, 16)));
        int i4 = zc.a(this.i, 8);
        if ((i4 != -1) && (i4 < this.a.getWorksheets().getDxfs().getCount())) {
          localFormatCondition.getStyle().copy(this.a.getWorksheets().getDxfs().get(i4));
        }
        localFormatCondition.setStopIfTrue((this.i[28] & 0xFF & 0x2) != 0);
        localFormatCondition.setPriority(zc.b(this.i, 12));
        int i5 = zc.a(this.i, 30);
        int i6 = zc.a(this.i, 34);
        int i7 = zc.a(this.i, 38);
        localFormatCondition.setText(zcgj.d(this.i, 42));
        int i8 = 0;
        if (localFormatCondition.getText() != null)
        {
          i8 = 46 + localFormatCondition.getText().length() * 2;
        }
        else
        {
          i8 = 46;
          if (i5 != 0)
          {
            i5 = zc.a(this.i, i8);
            localFormatCondition.a(new byte[i5 + 8]);
            System.arraycopy(this.i, i8, localFormatCondition.a(), 0, localFormatCondition.a().length);
            i8 += localFormatCondition.a().length;
          }
          if (i6 != 0)
          {
            i6 = zc.a(this.i, i8);
            localFormatCondition.b(new byte[i6 + 8]);
            System.arraycopy(this.i, i8, localFormatCondition.c(), 0, localFormatCondition.c().length);
            i8 += localFormatCondition.c().length;
          }
          if (i7 == 0) {}
        }
        break;
      case 465: 
        a(localFormatCondition);
        break;
      case 469: 
        g(localFormatCondition);
        break;
      case 467: 
        e(localFormatCondition);
        break;
      case 1146: 
        this.i = this.c.a(this.d);
        int i9 = 4;
        byte[] arrayOfByte = new byte[16];
        System.arraycopy(this.i, i9, arrayOfByte, 0, 16);
        localFormatCondition.a(new zh(arrayOfByte));
        break;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void a(FormatCondition paramFormatCondition)
  {
    IconSet localIconSet = new IconSet(paramFormatCondition);
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    localIconSet.a(zcij.q(n));
    if ((this.i[4] & 0xFF & 0x2) == 0) {
      localIconSet.setShowValue(true);
    } else {
      localIconSet.setShowValue(false);
    }
    if ((this.i[4] & 0xFF & 0x4) != 0) {
      localIconSet.b = true;
    }
    paramFormatCondition.a(localIconSet);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 471: 
        ConditionalFormattingValue localConditionalFormattingValue = c(paramFormatCondition);
        localIconSet.getCfvos().a(localConditionalFormattingValue);
        break;
      case 466: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void b(FormatCondition paramFormatCondition)
    throws Exception
  {
    IconSet localIconSet = new IconSet(paramFormatCondition);
    this.i = this.c.a(this.d);
    int n = 4;
    int i1 = zc.a(this.i, n);
    localIconSet.a(zcij.q(i1));
    if ((this.i[(n + 4)] & 0xFF & 0x2) == 0) {
      localIconSet.setShowValue(true);
    } else {
      localIconSet.setShowValue(false);
    }
    if ((this.i[(n + 4)] & 0xFF & 0x4) != 0) {
      localIconSet.b = true;
    }
    paramFormatCondition.a(localIconSet);
    int i2 = 0;
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 1050: 
        ConditionalFormattingValue localConditionalFormattingValue = d(paramFormatCondition);
        localIconSet.getCfvos().a(localConditionalFormattingValue);
        break;
      case 1112: 
        this.i = this.c.a(this.d);
        n = 4;
        i1 = zc.a(this.i, n);
        n += 4;
        ConditionalFormattingIcon localConditionalFormattingIcon = localIconSet.getCfIcons().get(i2++);
        localConditionalFormattingIcon.setType(zcij.q(i1));
        localConditionalFormattingIcon.setIndex(zc.a(this.i, n));
        break;
      case 1155: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private ConditionalFormattingValue c(FormatCondition paramFormatCondition)
  {
    ConditionalFormattingValue localConditionalFormattingValue = new ConditionalFormattingValue(paramFormatCondition);
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    localConditionalFormattingValue.setType(zcij.z(n));
    double d1 = zc.f(this.i, 4);
    localConditionalFormattingValue.a(d1);
    if (this.i[12] == 1) {
      if (this.i[16] == 1) {
        localConditionalFormattingValue.setGTE(true);
      } else {
        localConditionalFormattingValue.setGTE(false);
      }
    }
    int i1 = 20;
    int i2 = zc.a(this.i, i1);
    if (i2 > 0)
    {
      byte[] arrayOfByte = new byte[this.i.length - 24];
      System.arraycopy(this.i, 24, arrayOfByte, 0, arrayOfByte.length);
      localConditionalFormattingValue.a(arrayOfByte);
    }
    return localConditionalFormattingValue;
  }
  
  private ConditionalFormattingValue d(FormatCondition paramFormatCondition)
    throws Exception
  {
    ConditionalFormattingValue localConditionalFormattingValue = new ConditionalFormattingValue(paramFormatCondition);
    this.i = this.c.a(this.d);
    int n = 0;
    zcfz localzcfz = new zcfz();
    n = localzcfz.a(this.i, n);
    int i1 = zc.a(this.i, n + 0);
    localConditionalFormattingValue.setType(zcij.z(i1));
    n += 4;
    double d1 = zc.f(this.i, n);
    localConditionalFormattingValue.a(d1);
    n += 8;
    if (this.i[n] == 1) {
      if (this.i[(n + 4)] == 1) {
        localConditionalFormattingValue.setGTE(true);
      } else {
        localConditionalFormattingValue.setGTE(false);
      }
    }
    n += 8;
    int i2 = zc.a(this.i, n);
    if (i2 > 0) {
      localConditionalFormattingValue.a(localzcfz.c[0]);
    }
    return localConditionalFormattingValue;
  }
  
  private void e(FormatCondition paramFormatCondition)
  {
    DataBar localDataBar = new DataBar(this.a, paramFormatCondition);
    this.i = this.c.a(this.d);
    localDataBar.setMinLength(this.i[0]);
    localDataBar.setMaxLength(this.i[1]);
    localDataBar.setShowValue(this.i[2] == 1);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 471: 
        ConditionalFormattingValue localConditionalFormattingValue = c(paramFormatCondition);
        if (localDataBar.a == null) {
          localDataBar.a = localConditionalFormattingValue;
        } else {
          localDataBar.b = localConditionalFormattingValue;
        }
        break;
      case 564: 
        int n = 0;
        int i1 = 0;
        this.i = this.c.a(this.d);
        boolean[] arrayOfBoolean = { i1 };
        localDataBar.b(zchu.a(this.i, n, arrayOfBoolean));
        i1 = arrayOfBoolean[0];
        break;
      case 468: 
        this.d.a(1L);
        paramFormatCondition.a(localDataBar);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void f(FormatCondition paramFormatCondition)
    throws Exception
  {
    DataBar localDataBar = paramFormatCondition.getDataBar();
    this.i = this.c.a(this.d);
    int n = 4;
    localDataBar.setMinLength(this.i[(n + 0)]);
    localDataBar.setMaxLength(this.i[(n + 1)]);
    localDataBar.setShowValue(this.i[(n + 2)] == 1);
    localDataBar.setDirection(zcij.i(this.i[(n + 3)] & 0xFF));
    localDataBar.setAxisPosition(zcij.k(this.i[(n + 4)] & 0xFF));
    int i1 = this.i[(n + 5)];
    if ((i1 & 0xFF & 0x1) != 0) {
      localDataBar.getBarBorder().setType(1);
    } else {
      localDataBar.getBarBorder().setType(0);
    }
    if ((i1 & 0xFF & 0x2) != 0) {
      localDataBar.setBarFillType(1);
    } else {
      localDataBar.setBarFillType(0);
    }
    if ((i1 & 0xFF & 0x4) != 0) {
      localDataBar.getNegativeBarFormat().setColorType(0);
    }
    if ((i1 & 0xFF & 0x8) != 0) {
      localDataBar.getNegativeBarFormat().setBorderColorType(0);
    }
    int i2 = 0;
    ArrayList localArrayList = new ArrayList();
    if (localDataBar.getBarBorder().getType() == 1) {
      zf.a(localArrayList, localDataBar.getBarBorder().a());
    }
    if (localDataBar.getNegativeBarFormat().getColorType() == 0) {
      zf.a(localArrayList, localDataBar.getNegativeBarFormat().b());
    }
    if (localDataBar.getNegativeBarFormat().getBorderColorType() == 0) {
      zf.a(localArrayList, localDataBar.getNegativeBarFormat().a());
    }
    if (localDataBar.getAxisPosition() != 2) {
      zf.a(localArrayList, localDataBar.a());
    }
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 1050: 
        ConditionalFormattingValue localConditionalFormattingValue = d(paramFormatCondition);
        if (localDataBar.a == null) {
          localDataBar.a = localConditionalFormattingValue;
        } else {
          localDataBar.b = localConditionalFormattingValue;
        }
        break;
      case 1055: 
        n = 4;
        int i3 = 0;
        this.i = this.c.a(this.d);
        boolean[] arrayOfBoolean = { i3 };
        zaml localzaml = zchu.a(this.i, n, arrayOfBoolean);
        i3 = arrayOfBoolean[0];
        if (i2 < localArrayList.size()) {
          ((zaml)localArrayList.get(i2)).f(localzaml);
        }
        i2++;
        break;
      case 1156: 
        this.d.a(1L);
        paramFormatCondition.a(localDataBar);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void g(FormatCondition paramFormatCondition)
  {
    ColorScale localColorScale = new ColorScale(this.a, paramFormatCondition);
    ConditionalFormattingValueCollection localConditionalFormattingValueCollection = new ConditionalFormattingValueCollection(paramFormatCondition);
    ArrayList localArrayList = new ArrayList(3);
    this.i = this.c.a(this.d);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 471: 
        ConditionalFormattingValue localConditionalFormattingValue = c(paramFormatCondition);
        localConditionalFormattingValueCollection.a(localConditionalFormattingValue);
        break;
      case 564: 
        int n = 0;
        int i1 = 0;
        this.i = this.c.a(this.d);
        boolean[] arrayOfBoolean = { i1 };
        zaml localzaml = zchu.a(this.i, n, arrayOfBoolean);
        i1 = arrayOfBoolean[0];
        zf.a(localArrayList, localzaml);
        break;
      case 470: 
        this.d.a(1L);
        if (localConditionalFormattingValueCollection.getCount() == 2)
        {
          localColorScale.a = localConditionalFormattingValueCollection.get(0);
          localColorScale.c = localConditionalFormattingValueCollection.get(1);
          localColorScale.d = ((zaml)localArrayList.get(0));
          localColorScale.c((zaml)localArrayList.get(1));
        }
        else if (localConditionalFormattingValueCollection.getCount() == 3)
        {
          localColorScale.a = localConditionalFormattingValueCollection.get(0);
          localColorScale.b = localConditionalFormattingValueCollection.get(1);
          localColorScale.c = localConditionalFormattingValueCollection.get(2);
          localColorScale.a((zaml)localArrayList.get(0));
          localColorScale.b((zaml)localArrayList.get(1));
          localColorScale.c((zaml)localArrayList.get(2));
        }
        paramFormatCondition.a(localColorScale);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void h(FormatCondition paramFormatCondition)
    throws Exception
  {
    ColorScale localColorScale = new ColorScale(this.a, paramFormatCondition);
    ConditionalFormattingValueCollection localConditionalFormattingValueCollection = new ConditionalFormattingValueCollection(paramFormatCondition);
    ArrayList localArrayList = new ArrayList(3);
    this.i = this.c.a(this.d);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 1050: 
        ConditionalFormattingValue localConditionalFormattingValue = d(paramFormatCondition);
        localConditionalFormattingValueCollection.a(localConditionalFormattingValue);
        break;
      case 1055: 
        int n = 4;
        int i1 = 0;
        this.i = this.c.a(this.d);
        boolean[] arrayOfBoolean = { i1 };
        zaml localzaml = zchu.a(this.i, n, arrayOfBoolean);
        i1 = arrayOfBoolean[0];
        zf.a(localArrayList, localzaml);
        break;
      case 1158: 
        this.d.a(1L);
        if (localConditionalFormattingValueCollection.getCount() == 2)
        {
          localColorScale.a = localConditionalFormattingValueCollection.get(0);
          localColorScale.c = localConditionalFormattingValueCollection.get(1);
          localColorScale.d = ((zaml)localArrayList.get(0));
          localColorScale.c((zaml)localArrayList.get(1));
        }
        else if (localConditionalFormattingValueCollection.getCount() == 3)
        {
          localColorScale.a = localConditionalFormattingValueCollection.get(0);
          localColorScale.b = localConditionalFormattingValueCollection.get(1);
          localColorScale.c = localConditionalFormattingValueCollection.get(2);
          localColorScale.a((zaml)localArrayList.get(0));
          localColorScale.b((zaml)localArrayList.get(1));
          localColorScale.c((zaml)localArrayList.get(2));
        }
        paramFormatCondition.a(localColorScale);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void j()
    throws Exception
  {
    this.i = this.c.a(this.d);
    ValidationCollection localValidationCollection = this.e.getValidations();
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 64: 
        this.i = this.c.a(this.d);
        Validation localValidation = new Validation(localValidationCollection);
        localValidationCollection.add(localValidation);
        int n = this.i[0] & 0xFF & 0xF;
        switch (n)
        {
        case 0: 
          localValidation.setType(0);
          break;
        case 1: 
          localValidation.setType(1);
          break;
        case 2: 
          localValidation.setType(2);
          break;
        case 3: 
          localValidation.setType(3);
          break;
        case 4: 
          localValidation.setType(4);
          break;
        case 5: 
          localValidation.setType(5);
          break;
        case 6: 
          localValidation.setType(6);
          break;
        case 7: 
          localValidation.setType(7);
          break;
        }
        n = this.i[0] & 0xFF & 0x70;
        switch (n)
        {
        case 0: 
          localValidation.setAlertStyle(1);
          break;
        case 16: 
          localValidation.setAlertStyle(2);
          break;
        case 32: 
          localValidation.setAlertStyle(0);
          break;
        }
        n = this.i[1] & 0xFF & 0x1;
        if (n != 0) {
          localValidation.setIgnoreBlank(true);
        } else {
          localValidation.setIgnoreBlank(false);
        }
        n = this.i[1] & 0xFF & 0x2;
        if (n == 0) {
          localValidation.setInCellDropDown(true);
        } else {
          localValidation.setInCellDropDown(false);
        }
        n = ((this.i[2] & 0xFF & 0x3) << 6) + ((this.i[1] & 0xFF & 0xFC) >> 2);
        switch (n)
        {
        case 0: 
          localValidation.a(0);
          break;
        case 1: 
          localValidation.a(1);
          break;
        case 2: 
          localValidation.a(2);
          break;
        case 4: 
          break;
        case 5: 
          break;
        case 6: 
          break;
        case 7: 
          break;
        case 8: 
          break;
        case 9: 
          break;
        case 10: 
          break;
        case 3: 
        default: 
          localValidation.a(0);
        }
        n = this.i[2] & 0xFF & 0x4;
        if (n == 0) {
          localValidation.setShowInput(false);
        } else {
          localValidation.setShowInput(true);
        }
        n = this.i[2] & 0xFF & 0x8;
        if (n == 0) {
          localValidation.setShowError(false);
        } else {
          localValidation.setShowError(true);
        }
        n = this.i[2] & 0xFF & 0xF0;
        switch (n)
        {
        case 0: 
          localValidation.setOperator(0);
          break;
        case 16: 
          localValidation.setOperator(7);
          break;
        case 32: 
          localValidation.setOperator(1);
          break;
        case 48: 
          localValidation.setOperator(8);
          break;
        case 64: 
          localValidation.setOperator(2);
          break;
        case 80: 
          localValidation.setOperator(4);
          break;
        case 96: 
          localValidation.setOperator(3);
          break;
        case 112: 
          localValidation.setOperator(5);
          break;
        }
        int i1 = 4;
        int i2 = zc.a(this.i, i1);
        i1 += 4;
        for (int i3 = 0; i3 < i2; i3++)
        {
          CellArea localCellArea1 = new CellArea();
          localCellArea1.StartRow = zc.a(this.i, i1);
          localCellArea1.EndRow = zc.a(this.i, i1 + 4);
          localCellArea1.StartColumn = zc.a(this.i, i1 + 8);
          localCellArea1.EndColumn = zc.a(this.i, i1 + 12);
          zf.a(localValidation.getAreaList(), localCellArea1);
          i1 += 16;
        }
        int[] arrayOfInt = { i1 };
        localValidation.setErrorTitle(zcgj.a(this.i, arrayOfInt));
        i1 = arrayOfInt[0];
        arrayOfInt[0] = i1;
        localValidation.setErrorMessage(zcgj.a(this.i, arrayOfInt));
        i1 = arrayOfInt[0];
        arrayOfInt[0] = i1;
        localValidation.setInputTitle(zcgj.a(this.i, arrayOfInt));
        i1 = arrayOfInt[0];
        arrayOfInt[0] = i1;
        localValidation.setInputMessage(zcgj.a(this.i, arrayOfInt));
        i1 = arrayOfInt[0];
        int i4 = zc.a(this.i, i1);
        localValidation.c = new byte[i4];
        i1 += 4;
        System.arraycopy(this.i, i1, (byte[])localValidation.c, 0, i4);
        i1 += i4 + 4;
        i4 = zc.a(this.i, i1);
        localValidation.d = new byte[i4];
        i1 += 4;
        System.arraycopy(this.i, i1, (byte[])localValidation.d, 0, i4);
        i1 += i4 + 4;
        int i5 = 1048575;
        int i6 = 0;
        for (int i7 = localValidation.getAreaList().size() - 1; i7 >= 0; i7--)
        {
          CellArea localCellArea2 = (CellArea)localValidation.getAreaList().get(i7);
          if (localCellArea2.StartRow < i5)
          {
            i5 = localCellArea2.StartRow;
            i6 = localCellArea2.StartColumn;
          }
        }
        break;
      case 574: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void k()
  {
    this.i = this.c.a(this.d);
    ValidationCollection localValidationCollection = this.e.getValidations();
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 1053: 
        this.i = this.c.a(this.d);
        Validation localValidation = new Validation(localValidationCollection);
        localValidationCollection.add(localValidation);
        int n = this.i[0];
        int i1 = (n & 0xFF & 0x2) != 0 ? 1 : 0;
        int i2 = (n & 0xFF & 0x4) != 0 ? 1 : 0;
        int i3 = 4;
        int i4 = zc.a(this.i, i3);
        i3 += 4;
        i3 += 4;
        int i5 = zc.a(this.i, i3);
        i3 += 4;
        int i6;
        if (i5 > 0) {
          for (i6 = 0; i6 < i5; i6++)
          {
            CellArea localCellArea1 = new CellArea();
            localCellArea1.StartRow = zc.a(this.i, i3);
            localCellArea1.EndRow = zc.a(this.i, i3 + 4);
            localCellArea1.StartColumn = zc.a(this.i, i3 + 8);
            localCellArea1.EndColumn = zc.a(this.i, i3 + 12);
            zf.a(localValidation.getAreaList(), localCellArea1);
            i3 += 16;
          }
        }
        if (i2 != 0)
        {
          i3 += 4;
          i3 += 4;
          i6 = zc.a(this.i, i3);
          localValidation.c = new byte[i6];
          i3 += 4;
          int i7 = zc.a(this.i, i3);
          localValidation.d = new byte[i7];
          i3 += 4;
          System.arraycopy(this.i, i3, (byte[])localValidation.c, 0, i6);
          i3 += i6;
          System.arraycopy(this.i, i3, (byte[])localValidation.d, 0, i7);
          i3 += i7;
          int i8 = 1048575;
          int i9 = 0;
          for (int i10 = localValidation.getAreaList().size() - 1; i10 >= 0; i10--)
          {
            CellArea localCellArea2 = (CellArea)localValidation.getAreaList().get(i10);
            if (localCellArea2.StartRow < i8)
            {
              i8 = localCellArea2.StartRow;
              i9 = localCellArea2.StartColumn;
            }
          }
        }
        a(i3, localValidation);
        break;
      case 1154: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void a(int paramInt, Validation paramValidation)
  {
    int n = this.i[paramInt] & 0xFF & 0xF;
    switch (n)
    {
    case 0: 
      paramValidation.setType(0);
      break;
    case 1: 
      paramValidation.setType(1);
      break;
    case 2: 
      paramValidation.setType(2);
      break;
    case 3: 
      paramValidation.setType(3);
      break;
    case 4: 
      paramValidation.setType(4);
      break;
    case 5: 
      paramValidation.setType(5);
      break;
    case 6: 
      paramValidation.setType(6);
      break;
    case 7: 
      paramValidation.setType(7);
      break;
    }
    n = this.i[paramInt] & 0xFF & 0x70;
    switch (n)
    {
    case 0: 
      paramValidation.setAlertStyle(1);
      break;
    case 16: 
      paramValidation.setAlertStyle(2);
      break;
    case 32: 
      paramValidation.setAlertStyle(0);
      break;
    }
    n = this.i[(paramInt + 1)] & 0xFF & 0x1;
    if (n != 0) {
      paramValidation.setIgnoreBlank(true);
    } else {
      paramValidation.setIgnoreBlank(false);
    }
    n = this.i[(paramInt + 1)] & 0xFF & 0x2;
    if (n == 0) {
      paramValidation.setInCellDropDown(true);
    } else {
      paramValidation.setInCellDropDown(false);
    }
    n = ((this.i[(paramInt + 2)] & 0xFF & 0x3) << 6) + ((this.i[(paramInt + 1)] & 0xFF & 0xFC) >> 2);
    switch (n)
    {
    case 0: 
      paramValidation.a(0);
      break;
    case 1: 
      paramValidation.a(1);
      break;
    case 2: 
      paramValidation.a(2);
      break;
    case 4: 
      break;
    case 5: 
      break;
    case 6: 
      break;
    case 7: 
      break;
    case 8: 
      break;
    case 9: 
      break;
    case 10: 
      break;
    case 3: 
    default: 
      paramValidation.a(0);
    }
    n = this.i[(paramInt + 2)] & 0xFF & 0x4;
    if (n == 0) {
      paramValidation.setShowInput(false);
    } else {
      paramValidation.setShowInput(true);
    }
    n = this.i[(paramInt + 2)] & 0xFF & 0x8;
    if (n == 0) {
      paramValidation.setShowError(false);
    } else {
      paramValidation.setShowError(true);
    }
    n = this.i[(paramInt + 2)] & 0xFF & 0xF0;
    switch (n)
    {
    case 0: 
      paramValidation.setOperator(0);
      break;
    case 16: 
      paramValidation.setOperator(7);
      break;
    case 32: 
      paramValidation.setOperator(1);
      break;
    case 48: 
      paramValidation.setOperator(8);
      break;
    case 64: 
      paramValidation.setOperator(2);
      break;
    case 80: 
      paramValidation.setOperator(4);
      break;
    case 96: 
      paramValidation.setOperator(3);
      break;
    case 112: 
      paramValidation.setOperator(5);
      break;
    }
  }
  
  private void c(PageSetup paramPageSetup)
    throws Exception
  {
    this.i = this.c.a(this.d);
    paramPageSetup.a(this.i[0]);
    int n = 2;
    int[] arrayOfInt = { n };
    String str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    String[] arrayOfString;
    int i1;
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (i1 = 0; i1 < arrayOfString.length; i1++) {
        if (arrayOfString[i1] != null) {
          paramPageSetup.setHeader(i1, arrayOfString[i1]);
        }
      }
    }
    arrayOfInt[0] = n;
    str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (i1 = 0; i1 < arrayOfString.length; i1++) {
        if (arrayOfString[i1] != null) {
          paramPageSetup.setFooter(i1, arrayOfString[i1]);
        }
      }
    }
    arrayOfInt[0] = n;
    str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (i1 = 0; i1 < arrayOfString.length; i1++) {
        if (arrayOfString[i1] != null) {
          paramPageSetup.setEvenHeader(i1, arrayOfString[i1]);
        }
      }
    }
    arrayOfInt[0] = n;
    str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (i1 = 0; i1 < arrayOfString.length; i1++) {
        if (arrayOfString[i1] != null) {
          paramPageSetup.setEvenFooter(i1, arrayOfString[i1]);
        }
      }
    }
    arrayOfInt[0] = n;
    str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (i1 = 0; i1 < arrayOfString.length; i1++) {
        if (arrayOfString[i1] != null) {
          paramPageSetup.setFirstPageHeader(i1, arrayOfString[i1]);
        }
      }
    }
    arrayOfInt[0] = n;
    str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    if ((str != null) && (!"".equals(str)))
    {
      arrayOfString = zauw.a(str);
      for (i1 = 0; i1 < arrayOfString.length; i1++) {
        if (arrayOfString[i1] != null) {
          paramPageSetup.setFirstPageFooter(i1, arrayOfString[i1]);
        }
      }
    }
  }
  
  private void l()
    throws Exception
  {
    this.i = this.c.a(this.d);
    CellArea localCellArea = zcgj.a(this.i, 0);
    int n = 16;
    int[] arrayOfInt = { n };
    String str1 = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    arrayOfInt[0] = n;
    String str2 = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    arrayOfInt[0] = n;
    String str3 = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    arrayOfInt[0] = n;
    String str4 = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    if (str1 != null)
    {
      HashMap localHashMap = this.f.e;
      if ((localHashMap != null) && (localHashMap.containsKey(str1)))
      {
        localObject = (zrl)localHashMap.get(str1);
        if ((str2 == null) || ("".equals(str2))) {
          str2 = ((zrl)localObject).d;
        }
      }
    }
    int i1 = this.e.getHyperlinks().a(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1, str2);
    Object localObject = this.e.getHyperlinks().get(i1);
    if ((str3 != null) && (str3.length() != 0)) {
      ((Hyperlink)localObject).setScreenTip(str3);
    }
  }
  
  void a(PageSetup paramPageSetup, zoh paramzoh)
    throws Exception
  {
    this.i = this.c.a(this.d);
    if ((this.i[32] & 0xFF & 0x4) == 0)
    {
      paramPageSetup.setPaperSize(zc.a(this.i, 0));
      if (this.k)
      {
        paramPageSetup.setFitToPagesWide(zc.a(this.i, 24));
        paramPageSetup.setFitToPagesTall(zc.a(this.i, 28));
      }
      else
      {
        n = zc.a(this.i, 4);
        if (n < 10) {
          n = 10;
        } else if (n > 400) {
          n = 400;
        }
        paramPageSetup.setZoom(n);
      }
      paramPageSetup.d(zc.a(this.i, 8));
      paramPageSetup.e(zc.a(this.i, 12));
      if ((this.i[32] & 0xFF & 0x40) == 0) {
        paramPageSetup.setOrientation((this.i[32] & 0xFF & 0x2) != 0 ? 0 : 1);
      }
    }
    if ((this.i[32] & 0xFF & 0x80) != 0)
    {
      paramPageSetup.setFirstPageNumber(zc.a(this.i, 20));
      paramPageSetup.setAutoFirstPageNumber(false);
    }
    paramPageSetup.setOrder((this.i[32] & 0xFF & 0x1) != 0 ? 1 : 0);
    paramPageSetup.setBlackAndWhite((this.i[32] & 0xFF & 0x8) != 0);
    paramPageSetup.setPrintDraft((this.i[32] & 0xFF & 0x10) != 0);
    if ((this.i[32] & 0xFF & 0x20) != 0) {
      paramPageSetup.setPrintComments(0);
    }
    if ((this.i[33] & 0xFF & 0x1) != 0) {
      paramPageSetup.setPrintComments(2);
    }
    switch ((this.i[33] & 0xFF & 0x6) >> 1)
    {
    case 0: 
      paramPageSetup.setPrintErrors(2);
      break;
    case 1: 
      paramPageSetup.setPrintErrors(0);
      break;
    case 2: 
      paramPageSetup.setPrintErrors(1);
      break;
    case 3: 
      paramPageSetup.setPrintErrors(3);
    }
    int n = 34;
    int[] arrayOfInt = { n };
    String str = zcgj.a(this.i, arrayOfInt);
    n = arrayOfInt[0];
    if (paramzoh == null) {
      this.f.j = str;
    } else {
      paramzoh.b = str;
    }
  }
  
  void a(PageSetup paramPageSetup)
  {
    this.i = this.c.a(this.d);
    paramPageSetup.setCenterHorizontally((this.i[0] & 0xFF & 0x1) != 0);
    paramPageSetup.setCenterVertically((this.i[0] & 0xFF & 0x2) != 0);
    paramPageSetup.setPrintHeadings((this.i[0] & 0xFF & 0x4) != 0);
    paramPageSetup.setPrintGridlines((this.i[0] & 0xFF & 0x18) == 24);
  }
  
  void b(PageSetup paramPageSetup)
  {
    this.i = this.c.a(this.d);
    paramPageSetup.setLeftMarginInch(zc.f(this.i, 0));
    paramPageSetup.setRightMarginInch(zc.f(this.i, 8));
    paramPageSetup.setTopMarginInch(zc.f(this.i, 16));
    paramPageSetup.setBottomMarginInch(zc.f(this.i, 24));
    paramPageSetup.setHeaderMarginInch(zc.f(this.i, 32));
    paramPageSetup.setFooterMarginInch(zc.f(this.i, 40));
  }
  
  void c()
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    zapd localzapd = this.e.getCells().o();
    for (int i1 = 0; i1 < n; i1++)
    {
      this.h = this.d.a();
      if (this.h != 176) {
        return;
      }
      this.i = this.c.a(this.d);
      localzapd.a(zcgj.a(this.i, 0));
    }
  }
  
  private void m()
  {
    this.i = this.c.a(this.d);
    Protection localProtection = this.e.getProtection();
    localProtection.a(zc.e(this.i, 0));
    localProtection.setAllowEditingContent(this.i[2] == 0);
    localProtection.setAllowEditingObject(this.i[6] == 1);
    localProtection.setAllowEditingScenario(this.i[10] == 1);
    localProtection.setAllowFormattingCell(this.i[14] == 1);
    localProtection.setAllowFormattingColumn(this.i[18] == 1);
    localProtection.setAllowFormattingRow(this.i[22] == 1);
    localProtection.setAllowInsertingColumn(this.i[26] == 1);
    localProtection.setAllowInsertingRow(this.i[30] == 1);
    localProtection.setAllowInsertingHyperlink(this.i[34] == 1);
    localProtection.setAllowDeletingColumn(this.i[38] == 1);
    localProtection.setAllowDeletingRow(this.i[42] == 1);
    localProtection.setAllowSelectingLockedCell(this.i[46] == 1);
    localProtection.setAllowSorting(this.i[50] == 1);
    localProtection.setAllowFiltering(this.i[54] == 1);
    localProtection.setAllowUsingPivotTable(this.i[58] == 1);
    localProtection.setAllowSelectingUnlockedCell(this.i[62] == 1);
  }
  
  private void n()
    throws Exception
  {
    this.d.a(1L);
    int n = 0;
    int i1 = 0;
    Cell localCell = null;
    for (;;)
    {
      this.h = this.d.a();
      Object localObject1;
      Object localObject2;
      byte[] arrayOfByte1;
      switch (this.h)
      {
      case 0: 
        n = o();
        break;
      case 1: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        break;
      case 2: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        localCell.a(6, Integer.valueOf(zc.a(this.i, 8)));
        break;
      case 3: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        localCell.a(3, Byte.valueOf(this.i[8]));
        break;
      case 4: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        localCell.a(2, this.i[8] != 0 ? znq.d : znq.e);
        break;
      case 5: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        localCell.a(1, Double.valueOf(zc.f(this.i, 8)));
        break;
      case 6: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        localCell.putValue(zcgj.d(this.i, 8));
        break;
      case 7: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        int i2 = zc.a(this.i, 8);
        if (i2 < this.b.c())
        {
          localObject1 = this.b.a(i2);
          localObject1.d += 1;
          localCell.a(4, localObject1, false);
        }
        break;
      case 8: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        i1 = 8;
        localObject1 = new int[] { i1 };
        localObject2 = zcgj.a(this.i, (int[])localObject1);
        i1 = localObject1[0];
        i1 += 2;
        arrayOfByte1 = new byte[this.i.length - 10 - 4 - ((String)localObject2).length() * 2];
        System.arraycopy(this.i, i1, arrayOfByte1, 0, arrayOfByte1.length);
        localCell.b(arrayOfByte1);
        localCell.a(4, localObject2);
        break;
      case 9: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        i1 = 18;
        localObject1 = new byte[this.i.length - 18];
        System.arraycopy(this.i, i1, localObject1, 0, this.i.length - 18);
        localCell.b((byte[])localObject1);
        localCell.a(1, Double.valueOf(zc.f(this.i, 8)));
        break;
      case 10: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        i1 = 11;
        localObject1 = new byte[this.i.length - 11];
        System.arraycopy(this.i, i1, localObject1, 0, this.i.length - 11);
        localCell.b((byte[])localObject1);
        localCell.a(2, this.i[8] == 1 ? znq.d : znq.e);
        break;
      case 11: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        i1 = 11;
        localObject1 = new byte[this.i.length - 11];
        System.arraycopy(this.i, i1, localObject1, 0, this.i.length - 11);
        localCell.b((byte[])localObject1);
        localCell.a(3, Byte.valueOf(this.i[8]));
        break;
      case 12: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, localCell);
        break;
      case 13: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, localCell);
        localCell.a(6, Integer.valueOf(zc.a(this.i, 4)));
        break;
      case 14: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, localCell);
        localCell.a(3, Byte.valueOf(this.i[4]));
        break;
      case 15: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, localCell);
        localCell.a(2, this.i[4] != 0 ? znq.d : znq.e);
        break;
      case 16: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, localCell);
        localCell.a(1, Double.valueOf(zc.f(this.i, 4)));
        break;
      case 17: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, localCell);
        localCell.putValue(zcgj.d(this.i, 4));
        break;
      case 18: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, localCell);
        int i3 = zc.a(this.i, 4);
        if (i3 < this.b.c())
        {
          localObject2 = this.b.a(i3);
          localObject2.d += 1;
          localCell.a(4, localObject2, false);
        }
        break;
      case 62: 
        this.i = this.c.a(this.d);
        localCell = a(this.i, 0, n);
        localObject2 = zchn.a(this.i, 8, this.f.m);
        localObject2 = this.b.c((zbbj)localObject2);
        localCell.a(4, localObject2, false);
        break;
      case 426: 
        this.i = this.c.a(this.d);
        localObject2 = zcgj.a(this.i, 0);
        arrayOfByte1 = new byte[this.i.length - 17];
        System.arraycopy(this.i, 17, arrayOfByte1, 0, arrayOfByte1.length);
        localCell.a(new zbf((CellArea)localObject2, true, arrayOfByte1));
        localCell.h().b(true);
        break;
      case 427: 
        this.i = this.c.a(this.d);
        CellArea localCellArea = zcgj.a(this.i, 0);
        byte[] arrayOfByte2 = new byte[this.i.length - 16];
        System.arraycopy(this.i, 16, arrayOfByte2, 0, arrayOfByte2.length);
        localCell.a(new zbf(localCellArea, false, arrayOfByte2));
        break;
      case 146: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private Cell a(byte[] paramArrayOfByte, int paramInt, Cell paramCell)
  {
    int n = ((Integer)this.g.d.get(Integer.valueOf(zc.a(paramArrayOfByte, paramInt) & 0xFFFFFF))).intValue();
    Cell localCell = this.m.getRows().a(paramCell.getRow(), paramCell.getColumn() + 1, false, false, false);
    localCell.b(n);
    return localCell;
  }
  
  private Cell a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int n = zc.a(paramArrayOfByte, paramInt1);
    int i1 = ((Integer)this.g.d.get(Integer.valueOf(zc.a(paramArrayOfByte, paramInt1 + 4) & 0xFFFFFF))).intValue();
    Cell localCell = this.m.getRows().a(paramInt2, n, false, false, false);
    localCell.b(i1);
    return localCell;
  }
  
  private int o()
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    Row localRow = this.m.getRows().a(n, false, false, false);
    localRow.f(zc.e(this.i, 8));
    localRow.a((byte)(this.i[11] & 0xFF & 0x7));
    localRow.a((this.i[11] & 0xFF & 0x8) != 0);
    localRow.setHidden((this.i[11] & 0xFF & 0x10) != 0);
    localRow.setHeightMatched((this.i[11] & 0xFF & 0x20) >> 5 != 1);
    localRow.c((this.i[11] & 0xFF & 0x40) != 0);
    if (localRow.h()) {
      localRow.e(((Integer)this.g.d.get(Integer.valueOf(zc.a(this.i, 4)))).intValue());
    }
    return n;
  }
  
  private void p()
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    int i1 = zc.a(this.i, 4);
    int i2 = zc.a(this.i, 8);
    int i3 = zc.a(this.i, 12);
    i3 = ((Integer)this.g.d.get(Integer.valueOf(i3))).intValue();
    int i4 = (this.i[16] & 0xFF & 0x1) != 0 ? 1 : 0;
    int i5 = (this.i[16] & 0xFF & 0x2) != 0 ? 1 : 0;
    boolean bool = (this.i[17] & 0xFF & 0x10) != 0;
    int i6 = this.i[17] & 0xFF & 0x7;
    ColumnCollection localColumnCollection = this.e.getCells().getColumns();
    for (int i7 = n; i7 <= i1; i7++)
    {
      Column localColumn = null;
      if (i1 >= 16383)
      {
        localColumn = localColumnCollection.a();
        localColumn.a(i7);
      }
      else
      {
        localColumn = localColumnCollection.get(i7);
      }
      localColumn.c(i3);
      int i8 = zlp.a(this.a.getWorksheets());
      if (i2 < 256 + i8) {
        localColumn.setWidth(i2 / (256 + i8));
      } else {
        localColumn.setWidth((i2 - i8) / 256.0D);
      }
      if (i4 != 0) {
        localColumn.setHidden(true);
      }
      localColumn.a((byte)i6);
      localColumn.c(bool);
      if (i1 >= 16383) {
        break;
      }
    }
  }
  
  private void q()
    throws Exception
  {
    int n = 0;
    this.i = this.c.a(this.d);
    this.k = ((this.i[1] & 0xFF & 0x1) != 0);
    this.e.setOutlineShown((this.i[1] & 0xFF & 0x4) != 0);
    this.l = ((this.i[2] & 0xFF & 0x1) != 0);
    boolean[] arrayOfBoolean = { n };
    zaml localzaml = a(this.i, 3, arrayOfBoolean);
    n = arrayOfBoolean[0];
    this.e.o = localzaml;
    int i1 = zc.a(this.i, 11);
    if (i1 != -1) {
      this.e.setFirstVisibleRow(i1);
    }
    i1 = zc.a(this.i, 15);
    if (i1 != -1) {
      this.e.setFirstVisibleColumn(i1);
    }
    this.e.p = zcgj.d(this.i, 19);
  }
  
  private void r()
  {
    this.d.a(1L);
    zbew localzbew = new zbew(this.e);
    this.e.a(localzbew);
    for (;;)
    {
      this.h = this.d.a();
      switch (this.h)
      {
      case 137: 
        this.i = this.c.a(this.d);
        this.e.setShowFormulas((this.i[0] & 0xFF & 0x2) != 0);
        this.e.setGridlinesVisible((this.i[0] & 0xFF & 0x4) != 0);
        this.e.setRowColumnHeadersVisible((this.i[0] & 0xFF & 0x8) != 0);
        this.e.setDisplayZeros((this.i[0] & 0xFF & 0x10) != 0);
        this.e.setDisplayRightToLeft((this.i[0] & 0xFF & 0x20) != 0);
        this.e.setSelected((this.i[0] & 0xFF & 0x40) != 0);
        this.e.setOutlineShown((this.i[1] & 0xFF & 0x1) != 0);
        switch (this.i[2])
        {
        case 1: 
          this.e.setViewType(1);
          break;
        case 2: 
          this.e.setViewType(2);
          break;
        }
        this.e.setFirstVisibleRow(zc.a(this.i, 6));
        this.e.setFirstVisibleColumn(zc.a(this.i, 10));
        this.e.d(zc.a(this.i, 14));
        this.e.setZoom(zc.b(this.i, 18));
        break;
      case 151: 
        a(this.e.b());
        break;
      case 152: 
        a(this.e.t());
        break;
      case 134: 
        this.d.a(1L);
        return;
      default: 
        this.j = this.d.b();
        this.d.a(this.j);
      }
    }
  }
  
  private void a(PaneCollection paramPaneCollection)
  {
    this.i = this.c.a(this.d);
    paramPaneCollection.d((int)zc.f(this.i, 0));
    paramPaneCollection.c((int)zc.f(this.i, 8));
    paramPaneCollection.a(zc.a(this.i, 16));
    paramPaneCollection.b(zc.a(this.i, 20));
    paramPaneCollection.a((byte)zc.a(this.i, 24));
    this.e.a((this.i[28] & 0xFF & 0x1) != 0);
    if ((this.i[28] & 0xFF & 0x2) != 0) {
      this.e.b(false);
    }
  }
  
  private void a(zbew paramzbew)
  {
    this.i = this.c.a(this.d);
    zbev localzbev = new zbev(zc.a(this.i, 0));
    localzbev.a(zc.a(this.i, 4));
    localzbev.b(zc.a(this.i, 8));
    localzbev.c(zc.a(this.i, 12));
    localzbev.a(zcgj.b(this.i, 16));
    zf.a(paramzbew, localzbev);
  }
  
  private void s()
  {
    this.i = this.c.a(this.d);
    int n = zc.a(this.i, 0);
    double d1 = 0.0D;
    if (n == -1)
    {
      i1 = zc.e(this.i, 4);
      int i2 = ((this.a.getWorksheets().U() * (i1 & 0xFFFF) + zlp.a) / (i1 & 0xFFFF) + 1) * (i1 & 0xFFFF);
      d1 = (i2 - zlp.a) / this.a.getWorksheets().U();
    }
    else
    {
      if (256 + zlp.a(this.a.getWorksheets()) > n) {
        d1 = n / (256.0D + zlp.a(this.a.getWorksheets()));
      } else {
        d1 = (n - zlp.a(this.a.getWorksheets())) / 256.0D;
      }
      if (d1 < 0.0D) {
        d1 = 0.0D;
      }
    }
    this.e.getCells().getColumns().a(d1);
    int i1 = zc.e(this.i, 6) & 0xFFFF;
    if ((this.i[8] & 0xFF & 0x2) != 0) {
      i1 = 0;
    }
    this.e.getCells().a(i1);
    this.e.getCells().c(this.i[10]);
    this.e.getCells().b(this.i[11]);
  }
  
  zaml a(byte[] paramArrayOfByte, int paramInt, boolean[] paramArrayOfBoolean)
  {
    int n = 0;
    paramArrayOfBoolean[0] = false;
    zaml localzaml = new zaml(false);
    switch ((paramArrayOfByte[paramInt] & 0xFF) >> 1)
    {
    case 0: 
      localzaml.b(true);
      break;
    case 1: 
      if ((paramArrayOfByte[(paramInt + 1)] & 0xFF) >= 64) {
        localzaml.b(true);
      } else {
        localzaml.a(3, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      }
      break;
    case 2: 
      paramInt += 4;
      localzaml.a(2, ((paramArrayOfByte[paramInt] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 2)] & 0xFF));
      break;
    case 3: 
      localzaml.a(4, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      localzaml.a(zc.b(paramArrayOfByte, paramInt + 2) / 32767.0D);
      break;
    default: 
      paramArrayOfBoolean[0] = true;
      localzaml.b(true);
    }
    return localzaml;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */