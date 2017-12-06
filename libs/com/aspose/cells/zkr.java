package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Iterator;

class zkr
{
  private ChartCollection b;
  private Chart c;
  private zrg d;
  private ArrayList e;
  boolean a;
  private int f;
  private WorksheetCollection g;
  private static final za h = new za(new String[] { "#N/A", "#DIV/0!", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  static byte[] a(Font paramFont, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = paramFont.getName().length();
    int j = 32 + i * 2;
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(Encoding.getUnicode().a(paramFont.getName()), 0, arrayOfByte, 0, i * 2);
    int k = i;
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramFont.j()), 0, arrayOfByte, k, 4);
    k += 4;
    if (paramFont.isBold())
    {
      int tmp79_77 = k;
      byte[] tmp79_75 = arrayOfByte;
      tmp79_75[tmp79_77] = ((byte)(tmp79_75[tmp79_77] | 0x1));
    }
    if (paramFont.isItalic())
    {
      int tmp96_94 = k;
      byte[] tmp96_92 = arrayOfByte;
      tmp96_92[tmp96_94] = ((byte)(tmp96_92[tmp96_94] | 0x2));
    }
    if (paramFont.getUnderline() != 0)
    {
      int tmp113_111 = k;
      byte[] tmp113_109 = arrayOfByte;
      tmp113_109[tmp113_111] = ((byte)(tmp113_109[tmp113_111] | 0x4));
    }
    if (paramFont.isStrikeout())
    {
      int tmp130_128 = k;
      byte[] tmp130_126 = arrayOfByte;
      tmp130_126[tmp130_128] = ((byte)(tmp130_126[tmp130_128] | 0x80));
    }
    arrayOfByte[(k + 1)] = 1;
    if (paramFont.getDoubleSize() * 96.0D / 72.0D < 6.0D)
    {
      int tmp171_170 = (k + 1);
      byte[] tmp171_165 = arrayOfByte;
      tmp171_165[tmp171_170] = ((byte)(tmp171_165[tmp171_170] | 0x2));
    }
    k += 2;
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramFont.g()), 0, arrayOfByte, k, 2);
    k += 2;
    arrayOfByte[k] = paramFont.e();
    k += 2;
    switch (paramFont.getUnderline())
    {
    case 3: 
      arrayOfByte[k] = 33;
      break;
    case 2: 
      arrayOfByte[k] = 2;
      break;
    case 4: 
      arrayOfByte[k] = 34;
      break;
    case 1: 
      arrayOfByte[k] = 1;
      break;
    }
    k++;
    arrayOfByte[(k++)] = paramFont.h();
    arrayOfByte[(k++)] = ((byte)paramFont.getCharset());
    k++;
    Color localColor = paramFont.getColor();
    arrayOfByte[(k++)] = localColor.getR();
    arrayOfByte[(k++)] = localColor.getG();
    arrayOfByte[(k++)] = localColor.getB();
    k++;
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramInt1), 0, arrayOfByte, k, 4);
    k += 4;
    arrayOfByte[(k++)] = ((byte)paramInt2);
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramInt3), 0, arrayOfByte, k, 4);
    k += 4;
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramInt4), 0, arrayOfByte, k, 4);
    k += 4;
    arrayOfByte[(k++)] = ((byte)paramInt5);
    return arrayOfByte;
  }
  
  zkr(WorksheetCollection paramWorksheetCollection, int paramInt, ChartCollection paramChartCollection, zrg paramzrg)
  {
    this.b = paramChartCollection;
    this.d = paramzrg;
    this.g = paramWorksheetCollection;
    this.f = paramInt;
    b();
  }
  
  private void b()
  {
    if (this.b.getCount() == 0) {
      return;
    }
    Worksheet localWorksheet = this.g.get(this.f);
    switch (localWorksheet.getType())
    {
    case 2: 
      b(this.b.get(0));
      break;
    case 1: 
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        Chart localChart = (Chart)localIterator.next();
        b(localChart);
      }
    }
  }
  
  private static void a(Chart paramChart, zjk paramzjk, int paramInt, zrg paramzrg)
    throws Exception
  {
    if (paramzjk == null) {
      return;
    }
    if ((paramzjk.a() != 1) && (paramzjk.a() != 3) && (paramzjk.k()) && (!zaaq.a(paramzjk.c, -1, -1, paramChart.n()))) {
      return;
    }
    ArrayList localArrayList = paramzjk.b;
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return;
    }
    int i = paramzjk.a();
    zamq localzamq = new zamq();
    zard localzard = new zard();
    for (int j = 0; j < localArrayList.size(); j++) {
      if ((localArrayList.get(j) instanceof String))
      {
        String str = (String)localArrayList.get(j);
        Object localObject;
        if (ztr.d(str))
        {
          localObject = new zdh();
          byte b1 = 0;
          switch (h.a(str))
          {
          case 0: 
            b1 = 42;
            break;
          case 1: 
            b1 = 7;
            break;
          case 2: 
            b1 = 29;
            break;
          case 3: 
            b1 = 0;
            break;
          case 4: 
            b1 = 36;
            break;
          case 5: 
            b1 = 23;
            break;
          case 6: 
            b1 = 15;
          }
          ((zdh)localObject).a(j, (byte)paramInt, 0, b1, false);
          ((zdh)localObject).a(paramzrg);
        }
        else if ("".equals(str))
        {
          localObject = new zdd(j, (byte)paramInt, 0);
          ((zdd)localObject).a(paramzrg);
        }
        else
        {
          localzamq.a(j, paramInt, 0, (String)localArrayList.get(j));
          localzamq.a(paramzrg);
        }
      }
      else if ((localArrayList.get(j) instanceof Double))
      {
        localzard.a(j, paramInt, 0, ((Double)localArrayList.get(j)).doubleValue());
        localzard.a(paramzrg);
      }
    }
  }
  
  void a(Chart paramChart)
    throws Exception
  {
    this.c = paramChart;
    g();
    zbau localzbau = new zbau();
    localzbau.a((byte)10);
    localzbau.a(this.d);
    paramChart.a(this.d);
    zaxr localzaxr = new zaxr(paramChart.getPrintSize());
    localzaxr.a(this.d);
    this.d.a(new byte[] { 18, 0, 2, 0, 0, 0 });
    this.d.a(new byte[] { 1, 16, 2, 0, 0, 0 });
    Object localObject2;
    Object localObject3;
    if (this.g.get(this.f).getType() == 2)
    {
      localObject1 = this.g.get(this.f).F();
      if (localObject1 != null) {
        if ((localObject1 instanceof ArrayList))
        {
          localObject2 = ((ArrayList)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (byte[])((Iterator)localObject2).next();
            this.d.a((byte[])localObject3);
          }
        }
        else if ((localObject1 instanceof byte[]))
        {
          localObject2 = new zch();
          ((zch)localObject2).a((byte[])localObject1);
          ((zch)localObject2).a(this.d);
        }
      }
    }
    if ((paramChart.G() != null) && (paramChart.G().size() != 0))
    {
      localObject1 = new zwu();
      localObject2 = paramChart.G().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (zbm)((Iterator)localObject2).next();
        ((zwu)localObject1).a((zbm)localObject3);
        ((zwu)localObject1).a(this.d);
      }
    }
    if ((paramChart.getPivotSource() != null) && (!"".equals(paramChart.getPivotSource())))
    {
      localObject1 = new zbba();
      localObject2 = paramChart.getPivotSource();
      if (((String)localObject2).indexOf('[') == -1) {
        localObject2 = "[Aspose.xls]" + (String)localObject2;
      }
      ((zbba)localObject1).a((String)localObject2);
      ((zbba)localObject1).a(this.d);
      localObject3 = new zbbb();
      ((zbbb)localObject3).a(paramChart.getHidePivotFieldButtons());
      ((zbbb)localObject3).a(this.d);
    }
    if ((paramChart.p() != null) && (paramChart.p().getCount() != 0))
    {
      localObject1 = new zapv(this.g, this.g.get(this.f), paramChart.getShapes(), this.d);
      ((zapv)localObject1).a();
    }
    i();
    f();
    c();
    Object localObject1 = this.g.get(this.f);
    if (((Worksheet)localObject1).getType() == 2)
    {
      localObject2 = ((Worksheet)localObject1).p;
      if ((localObject2 != null) && (!"".equals(localObject2)))
      {
        localObject3 = new zlb();
        ((zlb)localObject3).a((String)localObject2);
        ((zlb)localObject3).a(this.d);
      }
      if (!((Worksheet)localObject1).o.b())
      {
        int i = ((Worksheet)localObject1).z();
        Object localObject4;
        if (i != 64)
        {
          localObject4 = new zbow(i, ((Worksheet)localObject1).o);
          ((zbow)localObject4).a(this.d);
        }
        else if (i == 64)
        {
          localObject4 = this.g.get(this.f);
          int j = ((Worksheet)localObject4).o.a(((Worksheet)localObject4).d());
          int k = ((Worksheet)localObject4).c().o().c(j);
          int m = ((Worksheet)localObject4).c().o().b(k);
          zbow localzbow = new zbow(k, m, ((Worksheet)localObject4).o);
          localzbow.a(this.d);
        }
      }
    }
    if (this.c.g() != null)
    {
      localObject2 = paramChart.d().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        byte[] arrayOfByte = (byte[])((Iterator)localObject2).next();
        this.d.a(arrayOfByte);
      }
    }
    h();
    this.c.c(false);
  }
  
  private void c()
    throws Exception
  {
    if ((this.g.get(this.f).getType() != 2) || (this.c != this.g.get(this.f).getCharts().get(0))) {
      return;
    }
    this.d.c(574);
    this.d.c(10);
    if (this.f == this.g.getActiveSheetIndex()) {
      this.d.c(1538);
    } else {
      this.d.c(2);
    }
    this.d.a(0);
    this.d.a(0);
    m();
  }
  
  private void d()
    throws Exception
  {
    Object localObject;
    for (int i = 0; i < this.c.getNSeries().getCount(); i++)
    {
      localObject = this.c.getNSeries().get(i).m();
      a(this.c, (zjk)localObject, i, this.d);
    }
    if ((this.e != null) && (this.e.size() > this.c.getNSeries().getCount())) {
      for (i = this.c.getNSeries().getCount(); i < this.e.size(); i++)
      {
        localObject = (zip)this.e.get(i);
        if (((zip)localObject).b == 2)
        {
          ErrorBar localErrorBar = (ErrorBar)((zip)localObject).a;
          if (localErrorBar.a()) {
            if (((zip)localObject).c) {
              a(this.c, localErrorBar.b(), i, this.d);
            } else {
              a(this.c, localErrorBar.c(), i, this.d);
            }
          }
        }
      }
    }
  }
  
  private void e()
    throws Exception
  {
    Object localObject;
    for (int i = 0; i < this.c.getNSeries().getCount(); i++)
    {
      localObject = this.c.getNSeries().get(i).o();
      a(this.c, (zjk)localObject, i, this.d);
    }
    if ((this.e != null) && (this.e.size() > this.c.getNSeries().getCount())) {
      for (i = this.c.getNSeries().getCount(); i < this.e.size(); i++)
      {
        localObject = (zip)this.e.get(i);
        if (((zip)localObject).b == 2)
        {
          ErrorBar localErrorBar = (ErrorBar)((zip)localObject).a;
          if (!localErrorBar.a()) {
            if (((zip)localObject).c) {
              a(this.c, localErrorBar.b(), i, this.d);
            } else {
              a(this.c, localErrorBar.c(), i, this.d);
            }
          }
        }
      }
    }
  }
  
  void a()
    throws Exception
  {
    if (!ChartCollection.q(this.c.getType())) {
      return;
    }
    for (int i = 0; i < this.c.getNSeries().getCount(); i++)
    {
      zjk localzjk = this.c.getNSeries().get(i).p();
      a(this.c, localzjk, i, this.d);
    }
  }
  
  private void f()
    throws Exception
  {
    zbeb localzbeb = new zbeb((byte)2);
    localzbeb.a(this.d);
    e();
    localzbeb = new zbeb((byte)1);
    localzbeb.a(this.d);
    d();
    localzbeb = new zbeb((byte)3);
    localzbeb.a(this.d);
    a();
  }
  
  private void g()
    throws Exception
  {
    zce localzce = new zce(2);
    localzce.a(this.d);
  }
  
  private void h()
    throws Exception
  {
    zta localzta = new zta();
    localzta.a(this.d);
  }
  
  private void i()
    throws Exception
  {
    zby localzby = new zby(this.g, this.f, this.c, this, this.d);
    boolean bool = localzby.c();
    l();
    this.d.a(4147);
    if (this.c.b != null) {
      for (int i = 0; i < this.c.b.size(); i++)
      {
        localObject1 = (byte[])this.c.b.get(i);
        this.d.a((byte[])localObject1);
      }
    }
    localzby.a(this.c.getValueAxis(), this.c.getSecondValueAxis());
    m();
    n();
    if ((this.c.getChartArea().getBorder().isVisible()) || (this.c.getChartArea().getArea().getFormatting() != 1) || (!this.c.isRectangularCornered()))
    {
      this.c.getChartArea().getArea().setInvertIfNegative(!this.c.isRectangularCornered());
      a(this.c.getChartArea(), true);
    }
    zaqe localzaqe = new zaqe(this.d, this.g, this.f, this.c);
    this.e = localzaqe.a();
    a((short)2);
    a((short)3);
    localzby.a();
    Object localObject1 = this.c.getPlotArea();
    int j = (this.c.k() & 0xFF & 0x10) != 0 ? 1 : 0;
    if (((PlotArea)localObject1).n != null)
    {
      int k = (this.c.k() & 0xFF & 0x8) != 0 ? 1 : 0;
      if (k == j) {
        ((PlotArea)localObject1).n[12] = 1;
      } else {
        ((PlotArea)localObject1).n[12] = 0;
      }
      zoe localzoe = new zoe();
      localzoe.b(((PlotArea)localObject1).n);
      localzoe.a(this.d);
    }
    k();
    if (this.c.getShowDataTable()) {
      j();
    }
    localzaqe.a(this.c);
    PlotArea localPlotArea = this.c.getPlotArea();
    int m = (this.c.k() & 0xFF & 0x10) != 0 ? 1 : 0;
    int n;
    Object localObject2;
    if ((localPlotArea.n != null) && (m == 0))
    {
      n = (this.c.k() & 0xFF & 0x8) != 0 ? 1 : 0;
      if (n == m) {
        localPlotArea.n[12] = 1;
      } else {
        localPlotArea.n[12] = 0;
      }
      localObject2 = new zoe();
      ((zoe)localObject2).b(localPlotArea.n);
      ((zoe)localObject2).a(this.d);
    }
    if (localPlotArea.c() != null)
    {
      n = localPlotArea.c().length;
      localObject2 = new byte[n + 4];
      localObject2[0] = -91;
      localObject2[1] = 8;
      System.arraycopy(com.aspose.cells.b.a.zc.a(n), 0, localObject2, 2, 2);
      System.arraycopy(localPlotArea.c(), 0, localObject2, 4, n);
      this.d.a((byte[])localObject2);
    }
    if (localPlotArea.c != null)
    {
      n = localPlotArea.c.length;
      localObject2 = new byte[n + 4];
      localObject2[0] = -98;
      localObject2[1] = 8;
      System.arraycopy(com.aspose.cells.b.a.zc.a(n), 0, localObject2, 2, 2);
      System.arraycopy(localPlotArea.c, 0, localObject2, 4, n);
      this.d.a((byte[])localObject2);
    }
    if (this.a)
    {
      zbax localzbax = new zbax();
      localzbax.a(13, 0, 0, 0);
      localzbax.a(this.d);
      this.a = false;
    }
    this.d.a(4148);
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
    if (paramArrayList != null)
    {
      localObject = new zd();
      int i = ((zd)localObject).a(paramInt2, paramInt1, paramArrayList);
      zzs localzzs;
      if (i == -1)
      {
        localzzs = new zzs(paramInt1);
        localzzs.a(this.d);
        ((zd)localObject).a(this.d);
      }
      else
      {
        localzzs = new zzs(i);
        localzzs.a(this.d);
      }
    }
    else
    {
      localObject = new zzs(paramInt1);
      ((zzs)localObject).a(this.d);
    }
  }
  
  private void j()
    throws Exception
  {
    ChartDataTable localChartDataTable = this.c.getChartDataTable();
    zos localzos = new zos();
    if (localChartDataTable != null) {
      localzos.a(localChartDataTable);
    }
    localzos.a(this.d);
    this.d.a(4147);
    zanc localzanc = new zanc();
    localzanc.a();
    localzanc.a(this.d);
    this.d.a(4147);
    Font localFont = null;
    if (this.c.u() != null) {
      localFont = this.c.u().a();
    }
    zbwe localzbwe = new zbwe();
    localzbwe.a(localFont);
    if (this.c.u() != null) {
      localzbwe.a(this.c.u().getBackgroundMode());
    }
    localzbwe.a(this.d);
    this.d.a(4147);
    a(localFont, localChartDataTable.b(), 0, null);
    zc localzc = new zc();
    localzc.a();
    localzc.a(this.d);
    this.d.a(4148);
    if ((localChartDataTable != null) && (localChartDataTable.c() != null) && (!localChartDataTable.c().isAuto()))
    {
      zacl localzacl = new zacl((byte)3);
      localzacl.a(this.d);
      this.d.a(4147);
      zans localzans = new zans(this.g.o());
      localzans.a(localChartDataTable.getBorder(), false);
      localzans.a(this.d);
      zbc localzbc = new zbc(this.g.o());
      localzbc.a(this.d);
      this.d.a(4148);
    }
    this.d.a(4148);
    this.d.a(4148);
  }
  
  private void k()
    throws Exception
  {
    Title localTitle = this.c.r();
    if (localTitle == null) {
      return;
    }
    zbwe localzbwe = new zbwe();
    localzbwe.a(localTitle);
    localzbwe.a(this.d);
    this.d.a(4147);
    Object localObject2;
    if ((localTitle.getText() != null) && (!"".equals(localTitle.getText())))
    {
      localObject1 = new zaxo(false);
      ((zaxo)localObject1).a(localTitle);
      ((zaxo)localObject1).a(this.d);
      a(localTitle.j(), localTitle.l(), localTitle.getText().length(), localTitle.E());
      localObject1 = new zc();
      ((zc)localObject1).a(localTitle.G());
      ((zc)localObject1).a(this.d);
      localObject2 = new zbfk(localTitle.getText());
      ((zbfk)localObject2).a(this.d);
    }
    else
    {
      localObject1 = new zaxo(false);
      ((zaxo)localObject1).a(localTitle);
      ((zaxo)localObject1).a(this.d);
      a(localTitle.j(), localTitle.l(), 0, null);
      localObject2 = new zc();
      ((zc)localObject2).a(localTitle.G());
      ((zc)localObject2).a(this.d);
    }
    if ((!localTitle.isDeleted()) && (localTitle.J())) {
      a(localTitle, false);
    }
    Object localObject1 = new zaud();
    ((zaud)localObject1).a((byte)1);
    ((zaud)localObject1).a(this.d);
    if (localTitle.a != null)
    {
      int i = localTitle.a.length;
      byte[] arrayOfByte = new byte[i + 4];
      arrayOfByte[0] = -99;
      arrayOfByte[1] = 8;
      System.arraycopy(com.aspose.cells.b.a.zc.a(i), 0, arrayOfByte, 2, 2);
      System.arraycopy(localTitle.a, 0, arrayOfByte, 4, i);
      this.d.a(arrayOfByte);
      if (localTitle.c != null)
      {
        i = localTitle.c.length;
        arrayOfByte = new byte[i + 4];
        arrayOfByte[0] = -98;
        arrayOfByte[1] = 8;
        System.arraycopy(com.aspose.cells.b.a.zc.a(i), 0, arrayOfByte, 2, 2);
        System.arraycopy(localTitle.c, 0, arrayOfByte, 4, i);
        this.d.a(arrayOfByte);
      }
    }
    this.d.a(4148);
  }
  
  private void l()
    throws Exception
  {
    zkk localzkk = new zkk(this.c);
    localzkk.a(this.d);
  }
  
  private void m()
    throws Exception
  {
    if (this.g.get(this.f).getType() != 2)
    {
      this.d.c(160);
      this.d.c(4);
      this.d.a(65537);
    }
    else
    {
      zbdz localzbdz = new zbdz(this.g.get(this.f).getZoom());
      localzbdz.a(this.d);
    }
  }
  
  private void n()
    throws Exception
  {
    byte[] arrayOfByte = new byte[12];
    arrayOfByte[0] = 100;
    arrayOfByte[1] = 16;
    arrayOfByte[2] = 8;
    int i = 4;
    double d1 = 0.0D;
    d1 = this.c.I();
    if (d1 - (int)d1 != 0.0D) {
      System.arraycopy(com.aspose.cells.b.a.zc.a((int)((d1 - (int)d1) * 65536.0D)), 0, arrayOfByte, i, 2);
    }
    System.arraycopy(com.aspose.cells.b.a.zc.a((int)d1), 0, arrayOfByte, i + 2, 2);
    i += 4;
    d1 = this.c.J();
    if (d1 - (int)d1 != 0.0D) {
      System.arraycopy(com.aspose.cells.b.a.zc.a((int)((d1 - (int)d1) * 65536.0D)), 0, arrayOfByte, i, 2);
    }
    System.arraycopy(com.aspose.cells.b.a.zc.a((int)d1), 0, arrayOfByte, i + 2, 2);
    i += 4;
    this.d.a(arrayOfByte);
  }
  
  private void a(ChartFrame paramChartFrame, boolean paramBoolean)
    throws Exception
  {
    zacl localzacl;
    if (paramBoolean) {
      localzacl = new zacl((byte)2);
    } else if ((paramChartFrame.p()) && (paramChartFrame.m())) {
      localzacl = new zacl((byte)3);
    } else if (paramChartFrame.m()) {
      localzacl = new zacl((byte)2);
    } else if (paramChartFrame.p()) {
      localzacl = new zacl((byte)3);
    } else {
      localzacl = new zacl((byte)2);
    }
    localzacl.a(paramChartFrame);
    localzacl.a(this.d);
    this.d.a(4147);
    zans localzans = new zans(this.g.o());
    localzans.a(paramChartFrame.getBorder(), false);
    localzans.a(this.d);
    a(paramChartFrame.getArea());
    if ((paramBoolean) && (paramChartFrame.b() != null))
    {
      zbaw localzbaw1 = new zbaw();
      localzbaw1.a(13, 0, 0, 0);
      localzbaw1.a(this.d);
      this.a = true;
      zbaw localzbaw2 = new zbaw();
      localzbaw2.a(7, 2, 0, 0);
      localzbaw2.a(this.d);
      zbmf localzbmf = new zbmf();
      localzbmf.a(paramChartFrame.b());
      localzbmf.a(this.d);
      zbax localzbax = new zbax();
      localzbax.a(7, 0, 0, 0);
      localzbax.a(this.d);
    }
    this.d.a(4148);
  }
  
  private void a(Area paramArea)
    throws Exception
  {
    if (paramArea == null) {
      return;
    }
    zbc localzbc = new zbc(this.g.o());
    localzbc.a(paramArea);
    localzbc.a(this.d);
    zadb localzadb;
    if (paramArea.b())
    {
      localzadb = new zadb();
      localzadb.a(paramArea.getFillFormat());
      localzadb.a(this.d);
    }
    else if (localzbc.b())
    {
      localzadb = new zadb();
      localzadb.a(paramArea);
      localzadb.a(this.d);
    }
  }
  
  private void a(short paramShort)
    throws Exception
  {
    b(paramShort);
    zbwe localzbwe = new zbwe();
    localzbwe.a(this.c.getChartArea());
    localzbwe.a(this.d);
    this.d.a(4147);
    zaxo localzaxo = new zaxo(false);
    localzaxo.a(this.d);
    Object localObject;
    if (this.c.getChartArea().getAutoScaleFont())
    {
      int i = 0;
      localObject = this.c.getChartArea();
      switch (paramShort)
      {
      case 2: 
        i = ((ChartArea)localObject).l();
        break;
      case 3: 
        i = ((ChartArea)localObject).a();
        break;
      }
      a(null, i, 0, null);
    }
    else
    {
      a(this.c.getChartArea().j(), this.c.getChartArea().l(), 0, null);
    }
    this.d.c(4177);
    this.d.c(8);
    this.d.c(256);
    this.d.a(0);
    this.d.c(0);
    if ((paramShort == 2) && (this.c.getChartArea().c() != null))
    {
      zbaw localzbaw = new zbaw();
      localzbaw.a();
      localzbaw.a(this.d);
      localObject = new zbwd();
      ((zbwd)localObject).a(this.c.getChartArea().c());
      ((zbwd)localObject).a(this.d);
      zbax localzbax = new zbax();
      localzbax.a(2, 0, 0, 0);
      localzbax.a(this.d);
    }
    this.d.a(4148);
  }
  
  private void b(short paramShort)
    throws Exception
  {
    this.d.c(4132);
    this.d.c(2);
    this.d.a(paramShort);
  }
  
  private static void b(Chart paramChart) {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */