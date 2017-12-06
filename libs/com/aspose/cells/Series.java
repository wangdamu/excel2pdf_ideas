package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Series
{
  private int i;
  boolean a = false;
  private zbfi j;
  private ChartPointCollection k;
  private zpz l;
  zqt b = null;
  private int m = -1;
  private SeriesCollection n;
  private Object o;
  String c = null;
  private String p = "";
  private zjk q;
  private zjk r;
  private zjk s;
  private TrendlineCollection t;
  int d = 0;
  int e = -1;
  DataLabels f;
  private zka u;
  private boolean v;
  private ErrorBar w;
  private ErrorBar x;
  private boolean y = true;
  private int z = -1;
  private Line A = null;
  private ShapePropertyCollection B;
  private ShapePropertyCollection C;
  int g;
  int h;
  
  zbfi a()
  {
    if (this.j == null) {
      this.j = new zbfi();
    }
    return this.j;
  }
  
  int b()
  {
    return this.i;
  }
  
  void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  void b(int paramInt)
  {
    this.m = paramInt;
  }
  
  public void move(int count)
  {
    int i1 = this.i + count;
    int i2;
    int i3;
    if (count < 0)
    {
      i2 = E();
      i3 = E() + count;
      if (i3 < 0) {
        i3 = 0;
      }
      this.n.b(i2, i3);
    }
    else
    {
      i2 = E();
      i3 = i2 + count + 1;
      if (i3 >= this.n.getCount()) {
        i3 = this.n.getCount() - 1;
      }
      this.n.c(i2, i3);
    }
  }
  
  public ChartPointCollection getPoints()
  {
    if (this.k == null) {
      this.k = new ChartPointCollection(this);
    }
    return this.k;
  }
  
  ChartPointCollection c()
  {
    return this.k;
  }
  
  void d()
  {
    this.k = null;
  }
  
  public Area getArea()
  {
    return g().e();
  }
  
  Area e()
  {
    if (this.l == null) {
      return null;
    }
    return this.l.h();
  }
  
  /**
   * @deprecated
   */
  public Line getLine()
  {
    return g().f();
  }
  
  public Line getBorder()
  {
    return g().f();
  }
  
  Line f()
  {
    if (this.l == null) {
      return null;
    }
    return this.l.g();
  }
  
  zpz g()
  {
    if (this.l == null)
    {
      this.l = new zpz(this);
      if (this.u.d() != null) {
        this.l.a(this.u.d(), null);
      }
    }
    return this.l;
  }
  
  void a(zpz paramzpz)
  {
    this.l = paramzpz;
  }
  
  zpz h()
  {
    return this.l;
  }
  
  Series(WorksheetCollection sheets, SeriesCollection nSeries, int seriesIndex)
  {
    this.i = seriesIndex;
    this.n = nSeries;
    this.b = new zqt();
  }
  
  SeriesCollection i()
  {
    return this.n;
  }
  
  WorksheetCollection j()
  {
    return this.n.b();
  }
  
  Worksheet k()
  {
    return this.n.a();
  }
  
  public String getName()
  {
    if (this.o == null) {
      return "";
    }
    if ((this.o instanceof String)) {
      return (String)this.o;
    }
    if ((this.o instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])this.o;
      return j().d().a(-1, -1, arrayOfByte, 0, 0, false, false);
    }
    return "";
  }
  
  public void setName(String value)
  {
    this.c = null;
    if (value == null)
    {
      this.o = null;
      return;
    }
    String str = value.trim();
    if ("".equals(str))
    {
      this.o = "";
      this.c = "";
      return;
    }
    if (str.charAt(0) != '=')
    {
      this.o = str;
      return;
    }
    str = str.substring(1);
    zjk localzjk = new zjk(this.n.e(), str, null);
    this.o = localzjk.c;
  }
  
  private String H()
  {
    int i1 = 0;
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = i() != null ? i() : null;
    Object localObject2 = localObject1 != null ? ((SeriesCollection)localObject1).e().i : null;
    if ((localObject2 != null) && (localObject1 != null))
    {
      Iterator localIterator1 = ((Iterable)localObject2).iterator();
      Object localObject3;
      while (localIterator1.hasNext())
      {
        localObject3 = (zka)localIterator1.next();
        Iterator localIterator2 = ((Iterable)localObject1).iterator();
        while (localIterator2.hasNext())
        {
          Series localSeries = (Series)localIterator2.next();
          if ((localSeries.v()) && (localSeries.u() == localObject3))
          {
            zbqo localzbqo = new zbqo(localSeries);
            localzbqo.a(i1);
            i1++;
            zf.a(localArrayList, localzbqo);
          }
        }
      }
      Collections.sort(localArrayList);
      for (int i2 = 0; i2 < localArrayList.size(); i2++)
      {
        localObject3 = (zbqo)localArrayList.get(i2);
        if (((zbqo)localObject3).b() == this) {
          return "Series" + zp.a(i2 + 1);
        }
      }
    }
    return "";
  }
  
  void a(String paramString)
  {
    this.c = null;
    if (paramString == null)
    {
      this.o = null;
      return;
    }
    String str = paramString.trim();
    if ("".equals(str))
    {
      this.o = "";
      this.c = "";
      return;
    }
    if (str.charAt(0) != '=')
    {
      this.o = str;
      return;
    }
    str = str.substring(1);
    try
    {
      zjk localzjk = new zjk(this.n.e(), str, null);
      this.o = localzjk.c;
    }
    catch (Exception localException)
    {
      zl.b(localException);
    }
  }
  
  void a(Object paramObject)
  {
    this.o = paramObject;
  }
  
  Object l()
  {
    return this.o;
  }
  
  public String getDisplayName()
  {
    Chart localChart = i().e();
    if (this.o == null) {
      return H();
    }
    if ((this.o instanceof String)) {
      return (String)this.o;
    }
    boolean bool = (localChart.getPivotSource() != null) && (localChart.getPivotSource().length() > 0);
    if ((bool) && (this.c != null)) {
      return this.c;
    }
    if ((this.o instanceof byte[]))
    {
      int i1 = 0;
      zjk localzjk = new zjk(localChart, null);
      localzjk.c = ((byte[])l());
      boolean[] arrayOfBoolean = { i1 };
      ArrayList localArrayList = localzjk.a(false, bool, arrayOfBoolean, true);
      i1 = arrayOfBoolean[0];
      if (i1 != 0)
      {
        if (this.c != null) {
          return this.c;
        }
      }
      else if ((localArrayList != null) && (localArrayList.size() != 0))
      {
        String str1 = "";
        for (int i2 = 0; i2 < localArrayList.size(); i2++)
        {
          zjt localzjt = (zjt)localArrayList.get(i2);
          String str2 = a(localzjt, localChart);
          if ("".equals(str2)) {
            str1 = str1 + " ";
          } else {
            str1 = str1 + a(localzjt, localChart);
          }
          if (i2 != localArrayList.size() - 1) {
            str1 = str1 + " ";
          }
        }
        return str1;
      }
    }
    return this.p;
  }
  
  void b(String paramString)
  {
    this.p = paramString;
  }
  
  String a(zjt paramzjt, Chart paramChart)
  {
    switch (paramzjt.g)
    {
    case 1: 
      if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
      {
        double d1 = 0.0D;
        try
        {
          d1 = ((Double)paramzjt.a).doubleValue();
        }
        catch (Exception localException)
        {
          return paramzjt.a();
        }
        String str2 = null;
        str2 = paramzjt.c;
        if (((str2 == null) || ("".equals(str2))) && (paramzjt.b != 0)) {
          str2 = paramChart.n().p().getSettings().f().d(paramzjt.b);
        }
        DateTime localDateTime = CellsHelper.getDateTimeFromDouble(d1, paramChart.getWorksheet().d().getSettings().getDate1904());
        if ((str2 != null) && ("".equals(str2))) {
          str2 = null;
        }
        zzz localzzz2 = paramChart.n().p().getSettings().f().a(str2, localDateTime, false);
        return localzzz2.h();
      }
      return paramzjt.a();
    }
    if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
    {
      String str1 = null;
      str1 = paramzjt.c;
      if (((str1 == null) || ("".equals(str1))) && (paramzjt.b != 0)) {
        str1 = paramChart.n().p().getSettings().f().d(paramzjt.b);
      }
      if ((str1 != null) && ("".equals(str1))) {
        str1 = null;
      }
      zzz localzzz1 = paramChart.n().p().getSettings().f().a(str1, paramzjt.a, false);
      return localzzz1.h();
    }
    return paramzjt.a();
  }
  
  public int getCountOfDataValues()
  {
    if (this.q == null) {
      return 0;
    }
    return this.q.s();
  }
  
  public boolean isVerticalValues()
  {
    if (this.q != null) {
      return this.q.m();
    }
    return false;
  }
  
  public String getValues()
  {
    if (this.q == null) {
      return null;
    }
    return this.q.b(getType());
  }
  
  public void setValues(String value)
  {
    String str = c(value);
    if ((str == null) || ("".equals(str)))
    {
      this.q = null;
      return;
    }
    this.q = new zjk(this.n.e(), str, this.q);
    this.v = true;
    if (this.k != null) {
      this.k.b();
    }
  }
  
  private String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.trim();
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    if (paramString.charAt(0) == '=') {
      paramString = paramString.substring(1);
    }
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    return paramString;
  }
  
  zjk m()
  {
    return this.q;
  }
  
  void a(zjk paramzjk)
  {
    this.q = paramzjk;
  }
  
  public String getValuesFormatCode()
  {
    if (this.q != null) {
      return this.q.b();
    }
    return null;
  }
  
  public void setValuesFormatCode(String value)
  {
    if (this.q != null) {
      this.q.a(value);
    }
  }
  
  void n()
  {
    Chart localChart = i().e();
    boolean bool1 = localChart.h();
    boolean bool2 = localChart.N();
    int i1 = 0;
    Object localObject = { i1 };
    ArrayList localArrayList = m().a(true, (bool1) || (bool2), (boolean[])localObject, false);
    i1 = localObject[0];
    localObject = getPoints();
    int i2 = ((ChartPointCollection)localObject).getCount();
    int i3 = 0;
    for (int i4 = 0; i4 < localArrayList.size(); i4++)
    {
      zjt localzjt = (zjt)localArrayList.get(i4);
      if ((!localChart.getPlotVisibleCells()) || (localzjt.d))
      {
        double d1 = 0.0D;
        double[] arrayOfDouble = { d1 };
        zkq.a(localzjt, arrayOfDouble);
        d1 = arrayOfDouble[0];
        if (i3 < i2) {
          ((ChartPointCollection)localObject).get(i3).setYValue(Double.valueOf(d1));
        }
        i3++;
      }
    }
  }
  
  public String getXValues()
  {
    if (this.r == null) {
      return null;
    }
    return this.r.b(getType());
  }
  
  public void setXValues(String value)
  {
    String str = c(value);
    if ((str == null) || ("".equals(str)))
    {
      this.r = null;
      return;
    }
    this.r = new zjk(this.n.e(), str, this.r);
  }
  
  zjk o()
  {
    return this.r;
  }
  
  void b(zjk paramzjk)
  {
    this.r = paramzjk;
  }
  
  public String getBubbleSizes()
  {
    if (this.s == null) {
      return null;
    }
    return this.s.b(getType());
  }
  
  public void setBubbleSizes(String value)
  {
    String str = c(value);
    if ((str == null) || ("".equals(str)))
    {
      this.s = null;
      return;
    }
    this.s = new zjk(this.n.e(), str, this.s);
  }
  
  zjk p()
  {
    return this.s;
  }
  
  void c(zjk paramzjk)
  {
    this.s = paramzjk;
  }
  
  public TrendlineCollection getTrendLines()
  {
    if (this.t == null) {
      this.t = new TrendlineCollection(this);
    }
    return this.t;
  }
  
  TrendlineCollection q()
  {
    return this.t;
  }
  
  public boolean getSmooth()
  {
    if ((this.l == null) || (!this.l.n()))
    {
      if (this.u.e() != null) {
        return this.u.d().m();
      }
      return false;
    }
    return g().m();
  }
  
  public void setSmooth(boolean value)
  {
    g().b(value);
  }
  
  public boolean getShadow()
  {
    if (this.l == null) {
      return false;
    }
    return g().q();
  }
  
  public void setShadow(boolean value)
  {
    g().f(value);
  }
  
  public boolean getHas3DEffect()
  {
    if (ChartCollection.q(getType()))
    {
      if ((this.l != null) && (this.l.p())) {
        return g().o();
      }
      if (this.u.d() != null) {
        return this.u.d().o();
      }
    }
    return false;
  }
  
  public void setHas3DEffect(boolean value)
  {
    if (ChartCollection.q(getType())) {
      g().d(value);
    }
  }
  
  public int getBar3DShapeType()
  {
    if (!ChartCollection.b(getType())) {
      return 0;
    }
    if (this.l == null)
    {
      if (this.u.d() == null) {
        return 0;
      }
      return this.u.d().c();
    }
    return g().c();
  }
  
  public void setBar3DShapeType(int value)
  {
    if (ChartCollection.b(getType())) {
      g().a(value);
    }
  }
  
  void c(int paramInt)
  {
    g().b(paramInt);
  }
  
  /**
   * @deprecated
   */
  public int getBarShape()
  {
    return getBar3DShapeType();
  }
  
  /**
   * @deprecated
   */
  public void setBarShape(int value)
  {
    setBar3DShapeType(value);
  }
  
  void a(Series paramSeries, CopyOptions paramCopyOptions)
  {
    a(this.n.e().i.a(paramSeries.u().k()));
    if (paramSeries.l != null)
    {
      this.l = new zpz(this);
      this.l.a(paramSeries.l, paramCopyOptions);
    }
    if (paramSeries.w != null) {
      getXErrorBar().a(paramSeries.getXErrorBar(), paramCopyOptions);
    }
    if (paramSeries.x != null) {
      getYErrorBar().a(paramSeries.getYErrorBar(), paramCopyOptions);
    }
    if (paramSeries.o != null)
    {
      this.c = paramSeries.c;
      if ((paramSeries.o instanceof String))
      {
        this.o = paramSeries.o;
      }
      else if ((paramSeries.o instanceof byte[]))
      {
        zjk localzjk1 = new zjk(paramSeries.n.e());
        localzjk1.c = ((byte[])paramSeries.o);
        zjk localzjk2 = new zjk(this.n.e());
        localzjk2.a(localzjk1, paramSeries.k().getIndex(), paramCopyOptions);
        this.o = localzjk2.c;
      }
    }
    if (paramSeries.q != null)
    {
      this.q = new zjk(this.n.e(), this.q);
      this.q.a(paramSeries.q, k().getIndex(), paramCopyOptions);
    }
    if (paramSeries.r != null)
    {
      this.r = new zjk(this.n.e(), this.r);
      this.r.a(paramSeries.r, k().getIndex(), paramCopyOptions);
    }
    if (paramSeries.s != null)
    {
      this.s = new zjk(this.n.e(), this.s);
      this.s.a(paramSeries.s, k().getIndex(), paramCopyOptions);
    }
    if (paramSeries.f != null)
    {
      if (this.f == null) {
        this.f = new DataLabels(this, i().e());
      }
      this.f.a(paramSeries.f, paramCopyOptions);
    }
    else
    {
      this.f = null;
    }
    if ((paramSeries.k != null) && (paramSeries.k.a() != 0)) {
      getPoints().a(paramSeries.k, paramCopyOptions);
    }
    if ((paramSeries.t != null) && (paramSeries.t.getCount() != 0)) {
      getTrendLines().a(paramSeries.getTrendLines(), paramCopyOptions);
    }
    this.i = paramSeries.i;
    this.v = paramSeries.v;
    if (paramSeries.C != null)
    {
      this.C = new ShapePropertyCollection(this.n.e(), this, 8);
      this.C.a(paramSeries.C, paramCopyOptions);
    }
    this.A = paramSeries.A;
    if (paramSeries.B != null)
    {
      this.B = new ShapePropertyCollection(this.u.a().a(), this, 15);
      this.B.a(paramSeries.B, paramCopyOptions);
    }
    if (paramSeries.j != null) {
      a().a(paramSeries.j, paramCopyOptions);
    }
    e(paramSeries.C());
    this.g = paramSeries.g;
    this.h = paramSeries.h;
  }
  
  public DataLabels getDataLabels()
  {
    if (this.f == null) {
      this.f = new DataLabels(this, i().e());
    }
    return this.f;
  }
  
  DataLabels r()
  {
    return this.f;
  }
  
  int s()
  {
    return this.u.k();
  }
  
  public int getType()
  {
    return this.u.j();
  }
  
  public void setType(int value)
  {
    if (this.u.j() == value) {
      return;
    }
    Chart localChart = this.n.e();
    if (this.n.getCount() == 1)
    {
      localChart.setType(value);
      return;
    }
    if (ChartCollection.b(value))
    {
      localChart.setType(value);
      return;
    }
    if (ChartCollection.b(localChart.getType()))
    {
      localChart.setType(value);
      return;
    }
    if (ChartCollection.r(value)) {
      throw new CellsException(0, "Some chart types could not be combined with other chart types.");
    }
    if ((ChartCollection.k(value)) && (ChartCollection.k(this.u.j())))
    {
      switch (value)
      {
      case 60: 
        getBorder().setVisible(false);
        getMarker().setMarkerStyle(5);
        break;
      case 61: 
        getBorder().setVisible(true);
        setSmooth(true);
        getMarker().setMarkerStyle(0);
        break;
      case 62: 
        getBorder().setVisible(true);
        setSmooth(true);
        getMarker().setMarkerStyle(5);
        break;
      case 63: 
        getBorder().setVisible(true);
        setSmooth(false);
        getMarker().setMarkerStyle(5);
        break;
      case 64: 
        getBorder().setVisible(true);
        setSmooth(false);
        getMarker().setMarkerStyle(5);
        break;
      }
      return;
    }
    if (ChartCollection.n(value)) {
      switch (value)
      {
      case 37: 
        if (this.u.j() == 40)
        {
          getMarker().setMarkerStyle(5);
          return;
        }
        break;
      case 39: 
        if (this.u.j() == 42)
        {
          getMarker().setMarkerStyle(5);
          return;
        }
        break;
      case 42: 
        if (this.u.j() == 39)
        {
          getMarker().setMarkerStyle(0);
          return;
        }
        break;
      case 38: 
        if (this.u.j() == 41)
        {
          getMarker().setMarkerStyle(5);
          return;
        }
        break;
      case 41: 
        if (this.u.j() == 38)
        {
          getMarker().setMarkerStyle(0);
          return;
        }
        break;
      case 40: 
        if (this.u.j() == 37)
        {
          getMarker().setMarkerStyle(0);
          return;
        }
        break;
      }
    }
    if (ChartCollection.o(this.u.j())) {
      switch (value)
      {
      case 57: 
        switch (this.u.j())
        {
        case 58: 
          getArea().setFormatting(1);
          getMarker().setMarkerStyle(5);
          return;
        case 59: 
          this.u.a(value);
          return;
        }
        break;
      case 58: 
        switch (this.u.j())
        {
        case 58: 
          getArea().setFormatting(1);
          getMarker().setMarkerStyle(0);
          return;
        case 59: 
          this.u.a(value);
          return;
        }
        break;
      case 59: 
        this.u.a(value);
        break;
      }
    }
    zka localzka1 = this.u;
    int i1 = localzka1.l() == 1 ? 1 : 0;
    boolean bool = localzka1.m();
    d();
    if (!ChartCollection.b(localzka1.j(), value))
    {
      if (localzka1.m()) {
        throw new CellsException(0, "Some chart types could not be combined with other chart types.");
      }
      bool = true;
      if (!localChart.i.b())
      {
        if (i1 != 0)
        {
          this.u.a(value);
          if (!u().m()) {
            u().a(true);
          }
        }
        else
        {
          int i2 = this.u.k();
          this.u = new zka(localChart.i, value, true);
          localChart.i.a(this.u);
        }
        return;
      }
      if (!ChartCollection.b(localChart.i.a(true).j(), value)) {
        throw new CellsException(0, "Some chart types could not be combined with other chart types.");
      }
    }
    if (i1 != 0) {
      localChart.i.c(this.u);
    }
    Iterator localIterator = localChart.i.iterator();
    while (localIterator.hasNext())
    {
      zka localzka2 = (zka)localIterator.next();
      if (localzka2.m() == bool)
      {
        if (localzka2.j() == value)
        {
          this.u = localzka2;
          return;
        }
        if (ChartCollection.a(localzka2.j(), value))
        {
          this.u = localzka2;
          localzka2.a(value);
          return;
        }
      }
    }
    this.u = new zka(localChart.i, value, bool);
    localChart.i.a(this.u);
  }
  
  void d(int paramInt)
  {
    this.u = this.n.e().i.a(0);
  }
  
  int t()
  {
    return this.u.j();
  }
  
  zka u()
  {
    return this.u;
  }
  
  void a(zka paramzka)
  {
    this.u = paramzka;
  }
  
  boolean v()
  {
    if (this.n.e().getPlotVisibleCells())
    {
      if (this.q == null) {
        return false;
      }
      return this.q.l();
    }
    return true;
  }
  
  public Marker getMarker()
  {
    return g().j();
  }
  
  Marker w()
  {
    if (this.l == null) {
      return null;
    }
    return this.l.k();
  }
  
  Marker x()
  {
    if ((this.l != null) && (this.l.k() != null)) {
      return this.l.k();
    }
    if (this.u.e() != null) {
      return this.u.e().k();
    }
    return null;
  }
  
  /**
   * @deprecated
   */
  public int getMarkerStyle()
  {
    return getMarker().getMarkerStyle();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerStyle(int value)
  {
    getMarker().setMarkerStyle(value);
  }
  
  /**
   * @deprecated
   */
  public int getMarkerSize()
  {
    return getMarker().getMarkerSize();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerSize(int value)
  {
    if ((value >= 2) && (value <= 72)) {
      getMarker().setMarkerSize(value);
    }
  }
  
  /**
   * @deprecated
   */
  public Color getMarkerForegroundColor()
  {
    return getMarker().d();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerForegroundColor(Color value)
  {
    getMarker().a(value);
  }
  
  /**
   * @deprecated
   */
  public int getMarkerForegroundColorSetType()
  {
    return getMarker().e();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerForegroundColorSetType(int value)
  {
    getMarker().c(value);
  }
  
  /**
   * @deprecated
   */
  public Color getMarkerBackgroundColor()
  {
    return getMarker().f();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerBackgroundColor(Color value)
  {
    getMarker().b(value);
  }
  
  /**
   * @deprecated
   */
  public int getMarkerBackgroundColorSetType()
  {
    return getMarker().g();
  }
  
  /**
   * @deprecated
   */
  public void setMarkerBackgroundColorSetType(int value)
  {
    getMarker().d(value);
  }
  
  public boolean getPlotOnSecondAxis()
  {
    return this.u.m();
  }
  
  public void setPlotOnSecondAxis(boolean value)
  {
    if (this.u.m() == value) {
      return;
    }
    if (ChartCollection.b(this.u.j())) {
      throw new CellsException(0, "If the chart type is 3-D chart type, you could not plot the series to the second axis ");
    }
    Chart localChart = this.n.e();
    if ((!this.u.m()) && (this.n.a(false) <= 1))
    {
      if (this.n.a(true) == 0) {
        return;
      }
      localzka1 = localChart.i.a(true);
      if (!ChartCollection.b(localzka1.j(), this.u.j())) {
        throw new CellsException(0, "Some chart types could not be combined with other chart types");
      }
      localChart.i.c(this.u);
      if (localzka1.m()) {
        localzka1.a(false);
      }
      this.u = localzka1;
      localObject = new CopyOptions(0);
      localChart.getCategoryAxis().a(localChart.getSecondCategoryAxis(), (CopyOptions)localObject);
      localChart.getValueAxis().a(localChart.getSecondValueAxis(), (CopyOptions)localObject);
      localChart.getSecondCategoryAxis().setVisible(false);
      localChart.getSecondValueAxis().setVisible(false);
      return;
    }
    if (this.u.l() == 1) {
      localChart.i.c(this.u);
    }
    zka localzka1 = localChart.i.a(value);
    if (localzka1 == null)
    {
      localObject = new zka(localChart.i);
      ((zka)localObject).a(this.u, null);
      ((zka)localObject).a(value);
      this.u = ((zka)localObject);
      localChart.i.a((zka)localObject);
      if ((value) && (!localChart.getCategoryAxis().isPlotOrderReversed()) && (!localChart.getSecondCategoryAxis().isPlotOrderReversed()) && (localChart.getSecondValueAxis().getCrossType() == 0)) {
        localChart.getSecondCategoryAxis().setCrossType(1);
      }
      return;
    }
    if (!ChartCollection.b(localzka1.j(), this.u.j())) {
      throw new CellsException(0, "Some chart types could not be combined with other chart types");
    }
    Object localObject = localChart.i.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zka localzka2 = (zka)((Iterator)localObject).next();
      if (localzka2.m() == value)
      {
        if (localzka2.j() == this.u.j())
        {
          this.u = localzka2;
          return;
        }
        if (ChartCollection.a(localzka2.j(), this.u.j()))
        {
          localzka2.a(this.u.j());
          this.u = localzka2;
          return;
        }
      }
    }
    localObject = new zka(localChart.i);
    ((zka)localObject).a(this.u, null);
    ((zka)localObject).a(value);
    this.u = ((zka)localObject);
    localChart.i.a((zka)localObject);
  }
  
  public ErrorBar getXErrorBar()
  {
    if (this.w == null) {
      this.w = new ErrorBar(this, false);
    }
    return this.w;
  }
  
  ErrorBar y()
  {
    return this.w;
  }
  
  public ErrorBar getYErrorBar()
  {
    if (this.x == null) {
      this.x = new ErrorBar(this, true);
    }
    return this.x;
  }
  
  ErrorBar z()
  {
    return this.x;
  }
  
  void a(ErrorBar paramErrorBar)
  {
    if (paramErrorBar.a()) {
      this.x = paramErrorBar;
    } else {
      this.w = paramErrorBar;
    }
  }
  
  public boolean hasHiLoLines()
  {
    return this.u.n();
  }
  
  public void setHasHiLoLines(boolean value)
  {
    this.u.c(value);
  }
  
  public Line getHiLoLines()
  {
    return this.u.o();
  }
  
  public boolean hasSeriesLines()
  {
    return this.u.p();
  }
  
  public void setHasSeriesLines(boolean value)
  {
    this.u.e(value);
  }
  
  public Line getSeriesLines()
  {
    return this.u.q();
  }
  
  public boolean hasDropLines()
  {
    return this.u.r();
  }
  
  public void setHasDropLines(boolean value)
  {
    this.u.g(value);
  }
  
  public Line getDropLines()
  {
    return this.u.s();
  }
  
  public boolean hasUpDownBars()
  {
    return this.u.t();
  }
  
  public void setHasUpDownBars(boolean value)
  {
    this.u.i(value);
  }
  
  public DropBars getUpBars()
  {
    return this.u.u();
  }
  
  public DropBars getDownBars()
  {
    return this.u.v();
  }
  
  public boolean isColorVaried()
  {
    return this.u.y();
  }
  
  public void setColorVaried(boolean value)
  {
    this.u.k(value);
  }
  
  public short getGapWidth()
  {
    return (short)this.u.z();
  }
  
  public void setGapWidth(short value)
  {
    this.u.c(value);
  }
  
  public short getFirstSliceAngle()
  {
    return (short)this.u.A();
  }
  
  public void setFirstSliceAngle(short value)
  {
    this.u.d(value);
    int i1 = this.u.j();
    if ((i1 == 45) || (i1 == 48)) {
      this.u.a().a().setRotationAngle(value);
    }
  }
  
  public short getOverlap()
  {
    return (short)this.u.B();
  }
  
  public void setOverlap(short value)
  {
    this.u.e(value);
  }
  
  public short getSecondPlotSize()
  {
    return (short)this.u.C();
  }
  
  public void setSecondPlotSize(short value)
  {
    this.u.f(value);
  }
  
  public int getSplitType()
  {
    return this.u.D();
  }
  
  public void setSplitType(int value)
  {
    this.u.g(value);
  }
  
  public double getSplitValue()
  {
    return this.u.E();
  }
  
  public void setSplitValue(double value)
  {
    this.u.a(value);
  }
  
  int[] A()
  {
    return this.u.F();
  }
  
  void a(int[] paramArrayOfInt)
  {
    this.u.a(paramArrayOfInt);
  }
  
  public boolean isAutoSplit()
  {
    return this.u.G();
  }
  
  public int getBubbleScale()
  {
    return this.u.H();
  }
  
  public void setBubbleScale(int value)
  {
    this.u.h(value);
  }
  
  public int getSizeRepresents()
  {
    return this.u.I();
  }
  
  public void setSizeRepresents(int value)
  {
    this.u.i(value);
  }
  
  public boolean getShowNegativeBubbles()
  {
    return this.u.J();
  }
  
  public void setShowNegativeBubbles(boolean value)
  {
    this.u.l(value);
  }
  
  public int getDoughnutHoleSize()
  {
    return this.u.K();
  }
  
  public void setDoughnutHoleSize(int value)
  {
    this.u.j(value);
  }
  
  public int getExplosion()
  {
    if ((this.l != null) && (this.l.i() != null)) {
      return this.l.i().a();
    }
    if ((this.u.e() != null) && (this.u.d().i() != null)) {
      return this.u.d().l().a();
    }
    return 0;
  }
  
  public void setExplosion(int value)
  {
    if ((ChartCollection.c(this.u.j())) || (ChartCollection.m(this.u.j())))
    {
      g().l().a(value);
      if ((this.u.e() != null) && (this.u.d().i() != null)) {
        this.u.d().l().a(value);
      }
    }
  }
  
  boolean B()
  {
    if ((this.l != null) && (this.l.i() != null)) {
      return false;
    }
    return (this.u.e() == null) || (this.u.d().i() == null);
  }
  
  public boolean hasRadarAxisLabels()
  {
    return this.u.M();
  }
  
  public void setHasRadarAxisLabels(boolean value)
  {
    this.u.n(value);
  }
  
  public boolean hasLeaderLines()
  {
    return a(1, this.u.N());
  }
  
  public void setHasLeaderLines(boolean value)
  {
    this.u.o(value);
    b(1, value);
  }
  
  int C()
  {
    if ((this.y) || (this.z < 0)) {
      return b();
    }
    return this.z;
  }
  
  void e(int paramInt)
  {
    this.z = paramInt;
    this.y = false;
  }
  
  public Line getLeaderLines()
  {
    return this.u.O();
  }
  
  Line D()
  {
    return this.A;
  }
  
  int E()
  {
    for (int i1 = 0; i1 < i().getCount(); i1++) {
      if (this.n.get(i1) == this) {
        return i1;
      }
    }
    return 0;
  }
  
  public LegendEntry getLegendEntry()
  {
    LegendEntryCollection localLegendEntryCollection = i().e().getLegend().getLegendEntries();
    return localLegendEntryCollection.get(E());
  }
  
  boolean F()
  {
    if (this.l == null)
    {
      if (this.u.e() != null) {
        return this.u.d().c;
      }
      return false;
    }
    return this.l.c;
  }
  
  public ShapePropertyCollection getShapeProperties()
  {
    if (this.C == null) {
      this.C = new ShapePropertyCollection(this.n.e(), this, 8);
    }
    return this.C;
  }
  
  ShapePropertyCollection G()
  {
    return this.C;
  }
  
  boolean a(int paramInt, boolean paramBoolean)
  {
    if (f(paramInt)) {
      return (this.g & paramInt) != 0;
    }
    return paramBoolean;
  }
  
  boolean f(int paramInt)
  {
    return (this.h & paramInt) != 0;
  }
  
  void b(int paramInt, boolean paramBoolean)
  {
    this.h |= paramInt;
    if (paramBoolean) {
      this.g |= paramInt;
    } else {
      this.g &= (paramInt ^ 0xFFFFFFFF);
    }
  }
  
  /**
   * @deprecated
   */
  public int getBubbleSizeRepresents()
  {
    return getSizeRepresents();
  }
  
  /**
   * @deprecated
   */
  public void setBubbleSizeRepresents(int value)
  {
    setSizeRepresents(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Series.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */