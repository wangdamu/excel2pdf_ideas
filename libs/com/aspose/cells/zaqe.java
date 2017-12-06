package com.aspose.cells;

import com.aspose.cells.a.e.zh;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zaqe
{
  private zrg a;
  private WorksheetCollection b;
  private Chart c;
  private int d;
  
  zaqe(zrg paramzrg, WorksheetCollection paramWorksheetCollection, int paramInt, Chart paramChart)
  {
    this.a = paramzrg;
    this.b = paramWorksheetCollection;
    this.c = paramChart;
    this.d = paramInt;
  }
  
  private void a(Area paramArea)
    throws Exception
  {
    if (paramArea == null) {
      return;
    }
    zbc localzbc = new zbc(this.b.o());
    localzbc.a(paramArea);
    localzbc.a(this.a);
    a(localzbc);
  }
  
  private zadb a(zbc paramzbc)
    throws Exception
  {
    zadb localzadb = null;
    if (paramzbc == null) {
      return null;
    }
    if (paramzbc.a().b())
    {
      FillFormat localFillFormat = paramzbc.a().getFillFormat();
      localzadb = new zadb();
      localzadb.a(localFillFormat);
      localzadb.a(this.a);
      PicFormatOption localPicFormatOption = null;
      if (localFillFormat.getFillType() == 4) {
        localPicFormatOption = localFillFormat.getTextureFill().d();
      }
      if (localPicFormatOption != null)
      {
        this.a.a(4147);
        zaup localzaup = new zaup(localPicFormatOption);
        localzaup.a(this.a);
        this.a.a(4148);
      }
    }
    else if (paramzbc.b())
    {
      localzadb = new zadb();
      localzadb.a(paramzbc.a());
      localzadb.a(this.a);
    }
    return localzadb;
  }
  
  private void a(Font paramFont, int paramInt1, int paramInt2, ArrayList paramArrayList)
    throws Exception
  {
    if ((paramFont == null) && (paramInt1 == -1)) {
      return;
    }
    if (paramFont != null) {
      paramInt1 = paramFont.m();
    }
    Object localObject;
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      localObject = new zd();
      int i = ((zd)localObject).a(paramInt2, paramInt1, paramArrayList);
      zzs localzzs;
      if (i == -1)
      {
        localzzs = new zzs(paramInt1);
        localzzs.a(this.a);
        ((zd)localObject).a(this.a);
      }
      else
      {
        localzzs = new zzs(i);
        localzzs.a(this.a);
      }
    }
    else
    {
      localObject = new zzs(paramInt1);
      ((zzs)localObject).a(this.a);
    }
  }
  
  ArrayList a()
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.c.getNSeries().getCount(); i++)
    {
      a(this.c.getNSeries().get(i), i);
      zf.a(localArrayList, new zip(this.c.getNSeries().get(i), (byte)0));
    }
    Series localSeries;
    for (i = 0; i < this.c.getNSeries().getCount(); i++)
    {
      localSeries = this.c.getNSeries().get(i);
      if ((localSeries.q() != null) && (localSeries.q().getCount() > 0)) {
        a(localSeries, i, localArrayList, this.c.getNSeries().getCount());
      }
    }
    a(localArrayList, this.c.getNSeries().getCount());
    for (i = 0; i < this.c.getNSeries().getCount(); i++)
    {
      localSeries = this.c.getNSeries().get(i);
      a(localSeries.z(), i, localArrayList);
      a(localSeries.y(), i, localArrayList);
    }
    zbpa localzbpa = new zbpa(this.c);
    localzbpa.a = this.a.b();
    localzbpa.a(this.a);
    this.c.a(localzbpa);
    return localArrayList;
  }
  
  void a(ErrorBar paramErrorBar, int paramInt, ArrayList paramArrayList)
    throws Exception
  {
    if ((paramErrorBar == null) || (paramErrorBar.getDisplayType() == 2)) {
      return;
    }
    if (paramErrorBar.getType() != 0)
    {
      if (paramErrorBar.getDisplayType() == 0)
      {
        paramErrorBar.a(3);
        a(paramErrorBar, this.b.o(), paramInt, null, paramArrayList.size());
        a(paramErrorBar, (byte)2, true, paramArrayList);
        paramErrorBar.a(1);
        a(paramErrorBar, this.b.o(), paramInt, null, paramArrayList.size());
        a(paramErrorBar, (byte)2, false, paramArrayList);
        paramErrorBar.a(0);
      }
      else
      {
        a(paramErrorBar, this.b.o(), paramInt, null, paramArrayList.size());
        a(paramErrorBar, (byte)2, paramErrorBar.getDisplayType() == 3, paramArrayList);
      }
    }
    else
    {
      int i = paramErrorBar.getDisplayType();
      if (paramErrorBar.b() != null)
      {
        paramErrorBar.a(3);
        a(paramErrorBar, this.b.o(), paramInt, paramErrorBar.b(), paramArrayList.size());
        a(paramErrorBar, (byte)2, true, paramArrayList);
      }
      if (paramErrorBar.c() != null)
      {
        paramErrorBar.a(1);
        a(paramErrorBar, this.b.o(), paramInt, paramErrorBar.c(), paramArrayList.size());
        a(paramErrorBar, (byte)2, false, paramArrayList);
      }
      paramErrorBar.a(i);
    }
  }
  
  void a(ErrorBar paramErrorBar, zava paramzava, int paramInt1, zjk paramzjk, int paramInt2)
    throws Exception
  {
    zbfj localzbfj = new zbfj();
    localzbfj.a(paramErrorBar);
    localzbfj.a(this.a);
    this.a.a(4147);
    for (int i = 0; i < 4; i++)
    {
      localObject = new zc();
      if ((i == 1) && (paramzjk != null))
      {
        ((zc)localObject).a((byte)1, paramzjk, this.d, this.a, 0);
      }
      else
      {
        ((zc)localObject).a(i);
        ((zc)localObject).a(this.a);
      }
    }
    zqa localzqa = new zqa();
    localzqa.a(paramInt2);
    localzqa.a(this.a);
    this.a.a(4147);
    Object localObject = new zcm();
    ((zcm)localObject).a(this.a);
    zans localzans = new zans(paramzava);
    if (!paramErrorBar.isAuto()) {
      localzans.a(paramErrorBar, false);
    }
    localzans.a(this.a);
    zbc localzbc = new zbc(paramzava);
    localzbc.a(this.a);
    zawi localzawi = new zawi();
    localzawi.a(this.a);
    zaot localzaot = new zaot(paramzava);
    localzaot.a(this.a);
    this.a.a(4148);
    zbfa localzbfa = new zbfa();
    localzbfa.a(paramInt1 + 1);
    localzbfa.a(this.a);
    zbey localzbey = new zbey();
    localzbey.a(paramErrorBar);
    localzbey.a(this.a);
    this.a.a(4148);
  }
  
  private void a(Object paramObject, byte paramByte, boolean paramBoolean, ArrayList paramArrayList)
  {
    zip localzip = new zip(paramObject, paramByte);
    localzip.c = paramBoolean;
    zf.a(paramArrayList, localzip);
  }
  
  private void a(Series paramSeries, int paramInt)
    throws Exception
  {
    a(paramSeries);
    this.a.a(4147);
    zc localzc = new zc();
    localzc.b(this.c, paramSeries, this.b, this.d, this.a);
    a(paramSeries, paramInt, paramSeries.b(), paramSeries.getType());
  }
  
  private void a(Series paramSeries)
    throws Exception
  {
    zbfj localzbfj = new zbfj();
    localzbfj.a(paramSeries, paramSeries.getType());
    localzbfj.a(this.a);
  }
  
  void a(Chart paramChart)
    throws Exception
  {
    for (int i = 0; i < paramChart.getNSeries().getCount(); i++)
    {
      Series localSeries1 = paramChart.getNSeries().get(i);
      if (localSeries1.c() != null) {
        for (int k = 0; k < localSeries1.getPoints().a(); k++)
        {
          ChartPoint localChartPoint = localSeries1.getPoints().c(k);
          if ((localChartPoint.j() != null) && ((localChartPoint.j().W()) || (localChartPoint.j().isDeleted()))) {
            a(localChartPoint.j(), i, localChartPoint.a);
          }
        }
      }
      if ((localSeries1.r() != null) && (localSeries1.r().W())) {
        a(localSeries1.r(), i, 65535);
      }
    }
    i = paramChart.getNSeries().getCount();
    for (int j = 0; j < paramChart.getNSeries().getCount(); j++)
    {
      Series localSeries2 = paramChart.getNSeries().get(j);
      if ((localSeries2.q() != null) && (localSeries2.getTrendLines().getCount() != 0)) {
        for (int m = 0; m < localSeries2.getTrendLines().getCount(); m++)
        {
          Trendline localTrendline = localSeries2.getTrendLines().get(m);
          if (localTrendline.b() != null) {
            a(localTrendline.getDataLabels(), i, 65535);
          }
          i++;
        }
      }
    }
  }
  
  void a(Series paramSeries, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    a(65535, paramInt1, paramInt2, (paramSeries.h() != null) && (paramSeries.g().c));
    this.a.a(4147);
    zcm localzcm = new zcm();
    if (ChartCollection.j(paramSeries.getType())) {
      localzcm.a(paramSeries.getBar3DShapeType());
    }
    localzcm.a(this.a);
    int i = (paramSeries.h() != null) && (!paramSeries.g().a()) ? 1 : 0;
    i |= (paramSeries.r() != null ? 1 : 0);
    if ((paramSeries.u().d() != null) && (!paramSeries.u().d().a()) && (i == 0)) {
      i = paramSeries.w() != null ? 1 : 0;
    }
    Line localLine = paramSeries.f();
    if ((localLine == null) && (i != 0)) {
      localLine = paramSeries.u().g();
    }
    zans localzans = null;
    if ((localLine != null) || (i != 0))
    {
      localzans = new zans(this.b.o());
      if (localLine != null) {
        localzans.a(localLine, paramInt1);
      }
      localzans.a(this.a);
    }
    Area localArea = paramSeries.e();
    if ((localArea == null) && (i != 0)) {
      localArea = paramSeries.u().h();
    }
    zbc localzbc = null;
    if ((localArea != null) || (i != 0))
    {
      localzbc = new zbc(this.b.o());
      if (localArea != null) {
        localzbc.a(localArea);
      }
      localzbc.a(this.a);
    }
    if (paramSeries.u().i() != null)
    {
      localObject1 = new zawi();
      ((zawi)localObject1).a(paramSeries.u().i());
      ((zawi)localObject1).a(this.a);
    }
    Object localObject1 = null;
    if (localArea != null) {
      localObject1 = a(localzbc);
    }
    if ((paramSeries.getSmooth()) || (paramSeries.getHas3DEffect()) || (paramSeries.getShadow()))
    {
      localObject2 = new zbfb(paramSeries.getSmooth(), paramSeries.getShadow(), paramSeries.getHas3DEffect());
      ((zbfb)localObject2).a(this.a);
    }
    Object localObject2 = paramSeries.w();
    if ((localObject2 == null) && (i != 0)) {
      localObject2 = paramSeries.u().f();
    }
    Object localObject3;
    if ((localObject2 != null) || (i != 0))
    {
      localObject3 = new zaot(this.b.o());
      if (localObject2 != null) {
        ((zaot)localObject3).a((Marker)localObject2, paramInt1);
      }
      ((zaot)localObject3).a(this.a);
      localObject3 = null;
    }
    if ((paramSeries.r() != null) && (paramSeries.r().V()))
    {
      localObject3 = new zbi();
      ((zbi)localObject3).a(paramSeries.r());
      ((zbi)localObject3).a(this.a);
    }
    int j = 0;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if ((paramSeries.h() != null) && (paramSeries.h().b != null))
    {
      localObject4 = paramSeries.h();
      j = 1;
      localObject5 = new zbaw();
      ((zbaw)localObject5).a(12, 0, paramInt1, 0);
      ((zbaw)localObject5).a(this.a);
      localObject6 = new zbaw();
      ((zbaw)localObject6).a(14, paramInt1, 65535, 0);
      ((zbaw)localObject6).a(this.a);
      zbmf localzbmf = new zbmf();
      localzbmf.a(((zpz)localObject4).b);
      localzbmf.a(this.a);
      if (((zpz)localObject4).a != null) {
        for (int k = 0; k < ((zpz)localObject4).a.size(); k++)
        {
          zof localzof = new zof();
          localzof.a((byte[])((zpz)localObject4).a.get(k));
          localzof.a(this.a);
        }
      }
      zbax localzbax = new zbax();
      localzbax.a(14, 0, 0, 0);
      localzbax.a(this.a);
    }
    this.a.a(4148);
    if ((paramSeries.c() != null) && (paramSeries.c().a() > 0)) {
      a(paramSeries, paramInt1, paramInt3);
    }
    this.a.c(4165);
    this.a.c(2);
    this.a.a((short)paramSeries.s());
    if ((this.c.t() != null) && (this.c.t().F() != null) && (this.c.getLegend().getLegendEntries().getCount() != 0))
    {
      localObject4 = this.c.getLegend().getLegendEntries();
      if ((ChartCollection.c(paramSeries.getType())) || (ChartCollection.m(paramSeries.getType())) || (ChartCollection.e(paramSeries.getType())) || ((this.c.getNSeries().getCount() == 1) && (paramSeries.isColorVaried())))
      {
        if (paramInt1 == 0)
        {
          localObject5 = ((Iterable)localObject4).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject6 = (LegendEntry)((Iterator)localObject5).next();
            a((LegendEntry)localObject6, ((LegendEntry)localObject6).c());
          }
        }
      }
      else
      {
        localObject5 = ((LegendEntryCollection)localObject4).a(paramInt1);
        if ((localObject5 != null) && ((((LegendEntry)localObject5).isDeleted()) || (((LegendEntry)localObject5).a() != null))) {
          a((LegendEntry)localObject5, 65535);
        }
      }
    }
    if (j != 0)
    {
      localObject4 = new zbax();
      ((zbax)localObject4).a(12, 0, 0, 0);
      ((zbax)localObject4).a(this.a);
    }
    this.a.a(4148);
  }
  
  private void a(LegendEntry paramLegendEntry, int paramInt)
    throws Exception
  {
    zand localzand = new zand(paramLegendEntry.isDeleted(), paramInt);
    localzand.a(this.a);
    if (paramLegendEntry.isDeleted()) {
      return;
    }
    this.a.a(4147);
    zbwe localzbwe = new zbwe();
    localzbwe.a(paramLegendEntry.getFont());
    localzbwe.a(paramLegendEntry.getBackgroundMode());
    localzbwe.a(this.a);
    this.a.a(4147);
    zaxo localzaxo = new zaxo(false);
    localzaxo.a(this.a);
    a(paramLegendEntry.a(), paramLegendEntry.b(), 0, null);
    zc localzc = new zc();
    localzc.a();
    localzc.a(this.a);
    this.a.a(4148);
    this.a.a(4148);
  }
  
  private void a(Series paramSeries, int paramInt1, int paramInt2)
    throws Exception
  {
    ChartPointCollection localChartPointCollection = paramSeries.c();
    for (int i = 0; i < paramSeries.c().a(); i++)
    {
      ChartPoint localChartPoint = localChartPointCollection.c(i);
      if (!localChartPoint.e())
      {
        a(localChartPoint.a, paramInt1, paramInt1, localChartPoint.c().c);
        this.a.a(4147);
        Object localObject = new zcm();
        ((zcm)localObject).d(paramSeries.t());
        ((zcm)localObject).a(this.a);
        localObject = new zans(this.b.o());
        ((zans)localObject).a(localChartPoint.getBorder(), false);
        ((zans)localObject).a(this.a);
        a(localChartPoint.getArea());
        zawi localzawi = new zawi();
        if (localChartPoint.i() != null) {
          localzawi.a(localChartPoint.i());
        }
        localzawi.a(this.a);
        zaot localzaot = new zaot(this.b.o());
        localzaot.a(localChartPoint.getMarker(), paramInt1);
        localzaot.a(this.a);
        if ((localChartPoint.j() != null) && (localChartPoint.j().V()))
        {
          zbi localzbi = new zbi();
          localzbi.a(localChartPoint.j());
          localzbi.a(this.a);
        }
        this.a.a(4148);
      }
    }
  }
  
  private void a(Series paramSeries, int paramInt1, ArrayList paramArrayList, int paramInt2)
  {
    TrendlineCollection localTrendlineCollection = paramSeries.q();
    for (int i = 0; i < localTrendlineCollection.getCount(); i++)
    {
      Trendline localTrendline1 = localTrendlineCollection.get(i);
      zip localzip = new zip(localTrendline1, (byte)1);
      localzip.e = paramInt1;
      localzip.f = i;
      for (int j = paramInt2; j < paramArrayList.size(); j++)
      {
        Trendline localTrendline2 = (Trendline)((zip)paramArrayList.get(j)).a;
        if (localTrendline1.d() < localTrendline2.d()) {
          break;
        }
      }
      if (j < paramArrayList.size()) {
        paramArrayList.add(j, localzip);
      } else {
        zf.a(paramArrayList, localzip);
      }
    }
  }
  
  private void a(ArrayList paramArrayList, int paramInt)
    throws Exception
  {
    for (int i = paramInt; i < paramArrayList.size(); i++)
    {
      zip localzip = (zip)paramArrayList.get(i);
      Trendline localTrendline = (Trendline)localzip.a;
      Series localSeries = localTrendline.a();
      int j = localSeries.getType();
      zbfj localzbfj = new zbfj();
      localzbfj.a(localTrendline);
      localzbfj.a(this.a);
      this.a.a(4147);
      for (int k = 0; k < 4; k++)
      {
        localObject1 = new zc();
        ((zc)localObject1).a(k);
        ((zc)localObject1).a(this.a);
        if ((k == 0) && (!localTrendline.isNameAuto()))
        {
          localObject2 = new zbfk(localTrendline.getName());
          ((zbfk)localObject2).a(this.a);
        }
      }
      zqa localzqa = new zqa();
      localzqa.a(i, localzip.f);
      localzqa.a(this.a);
      this.a.a(4147);
      Object localObject1 = new zcm();
      ((zcm)localObject1).a(this.a);
      Object localObject2 = new zans(this.b.o());
      if (!localTrendline.isAuto()) {
        ((zans)localObject2).a(localTrendline, false);
      }
      ((zans)localObject2).a(this.a);
      zbc localzbc = new zbc(this.b.o());
      localzbc.a(this.a);
      zawi localzawi = new zawi();
      localzawi.a(this.a);
      zaot localzaot = new zaot(this.b.o());
      localzaot.a(this.a);
      this.a.a(4148);
      zbfa localzbfa = new zbfa();
      localzbfa.a(localzip.e + 1);
      localzbfa.a(this.a);
      zbez localzbez = new zbez();
      localzbez.a(localTrendline);
      localzbez.a(this.a);
      if ((this.c.t() != null) && (this.c.t().F() != null) && (this.c.getLegend().getLegendEntries().getCount() != 0))
      {
        LegendEntryCollection localLegendEntryCollection = this.c.getLegend().getLegendEntries();
        if ((!ChartCollection.c(localSeries.getType())) && (!ChartCollection.m(localSeries.getType())) && (!ChartCollection.e(localSeries.getType())) && ((this.c.getNSeries().getCount() != 1) || (!localSeries.isColorVaried())))
        {
          LegendEntry localLegendEntry = localLegendEntryCollection.a(localTrendline.d() + paramInt);
          if ((localLegendEntry != null) && ((localLegendEntry.isDeleted()) || (localLegendEntry.a() != null))) {
            a(localLegendEntry, 65535);
          }
        }
      }
      this.a.a(4148);
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws Exception
  {
    this.a.c(4102);
    this.a.c(8);
    this.a.b(paramInt1);
    this.a.b(paramInt2);
    this.a.b(paramInt3);
    if (paramBoolean) {
      this.a.c(1);
    } else {
      this.a.c(0);
    }
  }
  
  void a(DataLabels paramDataLabels, int paramInt1, int paramInt2)
    throws Exception
  {
    zbwe localzbwe = new zbwe();
    int[] arrayOfInt = localzbwe.a(paramDataLabels);
    localzbwe.a(this.a);
    this.a.a(4147);
    zaxo localzaxo = new zaxo(false);
    localzaxo.a(paramDataLabels);
    localzaxo.a(this.a);
    if ((paramDataLabels.E() != null) && (paramDataLabels.E().size() > 0) && (paramDataLabels.F() != null) && (paramDataLabels.F().length() > 0) && (!paramDataLabels.isAutoText())) {
      a(paramDataLabels.i(), paramDataLabels.l(), paramDataLabels.F().length(), paramDataLabels.E());
    } else {
      a(paramDataLabels.i(), paramDataLabels.l(), 0, null);
    }
    zc localzc = new zc();
    localzc.a(paramDataLabels, this.b, paramDataLabels.i == null ? null : paramDataLabels.i.c);
    localzc.a(this.a);
    if ((!paramDataLabels.S()) && (paramDataLabels.F() != null) && (!"".equals(paramDataLabels.F())))
    {
      zbfk localzbfk = new zbfk(paramDataLabels.F());
      localzbfk.a(this.a);
    }
    if ((!paramDataLabels.u()) && (paramDataLabels.J())) {
      a(paramDataLabels);
    }
    boolean bool = paramDataLabels.U();
    int i = paramDataLabels.a != null ? 1 : 0;
    int j = (bool) || (i != 0) || (paramDataLabels.c() != null) ? 1 : 0;
    if (j != 0)
    {
      localObject1 = new zbaw();
      ((zbaw)localObject1).a(2, 5, paramInt2, paramInt1);
      ((zbaw)localObject1).a(this.a);
    }
    Object localObject1 = new zaud();
    ((zaud)localObject1).a((byte)4, paramInt1, paramInt2);
    ((zaud)localObject1).a(this.a);
    Font localFont = paramDataLabels.j();
    Object localObject2;
    int m;
    byte[] arrayOfByte2;
    if ((paramDataLabels.c() != null) && (localFont != null))
    {
      localObject2 = new zh();
      ((zh)localObject2).a(zkr.a(localFont, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3], arrayOfInt[4]));
      m = paramDataLabels.c().length;
      arrayOfByte2 = new byte[m + 4];
      arrayOfByte2[0] = -91;
      arrayOfByte2[1] = 8;
      System.arraycopy(com.aspose.cells.b.a.zc.a(m), 0, arrayOfByte2, 2, 2);
      System.arraycopy(paramDataLabels.c(), 0, arrayOfByte2, 4, m);
      this.a.a(arrayOfByte2);
    }
    if (bool)
    {
      localObject2 = new zaxq();
      ((zaxq)localObject2).a(paramDataLabels);
      ((zaxq)localObject2).a(this.a);
    }
    int k;
    if (i != 0)
    {
      k = 0;
      if (!paramDataLabels.m())
      {
        k = paramDataLabels.getX() ^ paramDataLabels.getY();
        k ^= 0x1;
      }
      System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, paramDataLabels.a, 12, 4);
      m = paramDataLabels.a.length;
      arrayOfByte2 = new byte[m + 4];
      arrayOfByte2[0] = -99;
      arrayOfByte2[1] = 8;
      System.arraycopy(com.aspose.cells.b.a.zc.a(m), 0, arrayOfByte2, 2, 2);
      System.arraycopy(paramDataLabels.a, 0, arrayOfByte2, 4, m);
      this.a.a(arrayOfByte2);
    }
    if (paramDataLabels.c != null)
    {
      k = paramDataLabels.c.length;
      byte[] arrayOfByte1 = new byte[k + 4];
      arrayOfByte1[0] = -98;
      arrayOfByte1[1] = 8;
      System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, arrayOfByte1, 2, 2);
      System.arraycopy(paramDataLabels.c, 0, arrayOfByte1, 4, k);
      this.a.a(arrayOfByte1);
    }
    if (j != 0)
    {
      zbax localzbax = new zbax();
      localzbax.a(2, 0, 0, 0);
      localzbax.a(this.a);
    }
    this.a.a(4148);
  }
  
  void a(ChartFrame paramChartFrame)
    throws Exception
  {
    zacl localzacl;
    if (paramChartFrame.p()) {
      localzacl = new zacl((byte)3);
    } else {
      localzacl = new zacl((byte)2);
    }
    localzacl.a(paramChartFrame);
    localzacl.a(this.a);
    this.a.a(4147);
    zans localzans = new zans(this.b.o());
    localzans.a(paramChartFrame.getBorder(), false);
    localzans.a(this.a);
    a(paramChartFrame.getArea());
    this.a.a(4148);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */