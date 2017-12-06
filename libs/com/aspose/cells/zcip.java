package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zcip
  extends zcfo
{
  private zpt c;
  private Workbook d;
  private zpu e;
  
  zcip(zpt paramzpt, zpu paramzpu)
  {
    this.c = paramzpt;
    this.d = paramzpt.a;
    this.e = paramzpu;
  }
  
  void d()
    throws Exception
  {
    Worksheet localWorksheet = this.e.a;
    zche localzche = new zche(129);
    localzche.a(this.b);
    zcis localzcis = new zcis();
    localzcis.a(localWorksheet);
    localzcis.a(this.b);
    e();
    q();
    a(localWorksheet, this.d);
    o();
    p();
    if (this.e.a.a() != null)
    {
      localObject = new zchr(localWorksheet.getProtection());
      ((zchr)localObject).a(this.b);
    }
    f();
    if (localWorksheet.hasAutofilter()) {
      a(localWorksheet.getAutoFilter(), this.b);
    }
    g();
    if ((localWorksheet.getCells().o() != null) && (localWorksheet.getCells().o().getCount() != 0)) {
      c(localWorksheet);
    }
    if ((localWorksheet.r != null) && (localWorksheet.getConditionalFormattings().getCount() != 0)) {
      b(localWorksheet);
    }
    if (localWorksheet.getValidations().getCount() != 0) {
      a(localWorksheet);
    }
    if ((this.e.f != null) && (this.e.f.size() > 0)) {
      n();
    }
    a(localWorksheet.getPageSetup(), this.e.o, localWorksheet.getHorizontalPageBreaks(), localWorksheet.getVerticalPageBreaks());
    if (this.e.j.a != null)
    {
      localObject = new zcfk(this.e.j.a);
      ((zcfk)localObject).a(this.b);
    }
    if (this.e.v != null)
    {
      localObject = new zcgm(this.e.v);
      ((zcgm)localObject).a(this.b);
    }
    if (this.e.u != null)
    {
      localObject = new zcgl(this.e.u);
      ((zcgl)localObject).a(this.b);
    }
    if (this.e.n != null)
    {
      localObject = new zcaq(this.e.n);
      ((zcaq)localObject).a(this.b);
    }
    k();
    l();
    m();
    h();
    i();
    j();
    Object localObject = new zche(130);
    ((zche)localObject).a(this.b);
    if (this.c.A.getClearData()) {
      this.e.a.getCells().clear();
    }
  }
  
  private void e()
    throws Exception
  {
    Cells localCells = this.e.a.getCells();
    int i = localCells.e(0);
    int j = localCells.b((short)-1);
    int k = 0;
    int m = 0;
    if ((i < 0) || (j < 0))
    {
      i = j = 0;
    }
    else
    {
      k = localCells.getMinRow();
      m = localCells.getMinColumn();
    }
    byte[] arrayOfByte = new byte[19];
    arrayOfByte[0] = -108;
    arrayOfByte[1] = 1;
    arrayOfByte[2] = 16;
    zcgj.a(CellArea.createCellArea(k, m, i, j), arrayOfByte, 3);
    this.b.b(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private void f()
    throws Exception
  {
    Worksheet localWorksheet = this.e.a;
    ScenarioCollection localScenarioCollection = localWorksheet.t;
    if ((localScenarioCollection == null) || (localScenarioCollection.getCount() == 0)) {
      return;
    }
    zee localzee = new zee(localScenarioCollection);
    localzee.a(this.b);
    Iterator localIterator1 = localScenarioCollection.iterator();
    while (localIterator1.hasNext())
    {
      Scenario localScenario = (Scenario)localIterator1.next();
      zef localzef = new zef(localScenario);
      localzef.a(this.b);
      Iterator localIterator2 = localScenario.getInputCells().iterator();
      while (localIterator2.hasNext())
      {
        ScenarioInputCell localScenarioInputCell = (ScenarioInputCell)localIterator2.next();
        zes localzes = new zes(localScenarioInputCell);
        localzes.a(this.b);
      }
      zche.a(503, this.b);
    }
    zche.a(501, this.b);
  }
  
  private void g()
    throws Exception
  {
    Worksheet localWorksheet = this.e.a;
    if ((localWorksheet.s == null) || (localWorksheet.s.getCount() == 0)) {
      return;
    }
    zche localzche1 = new zche(422);
    localzche1.a(this.b);
    Object localObject = localWorksheet.s.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zoh localzoh = (zoh)((Iterator)localObject).next();
      zeg localzeg = new zeg(localzoh);
      localzeg.a(this.b);
      if (localzoh.h != null) {
        a(localzoh.h, localzoh.y());
      }
      if (localzoh.i != null) {
        a(localzoh.i);
      }
      a(localzoh.j, localzoh.b, localzoh.k, localzoh.l);
      zche localzche2 = new zche(424);
      localzche2.a(this.b);
    }
    localObject = new zche(425);
    ((zche)localObject).a(this.b);
  }
  
  private void h()
    throws Exception
  {
    Worksheet localWorksheet = this.e.a;
    if (!localWorksheet.getConditionalFormattings().b()) {
      return;
    }
    zcdk localzcdk = new zcdk();
    localzcdk.a(this.b);
    zche localzche1 = new zche(1135);
    localzche1.a(this.b);
    for (int i = 0; i < localWorksheet.getConditionalFormattings().getCount(); i++)
    {
      localObject = localWorksheet.getConditionalFormattings().get(i);
      if (((FormatConditionCollection)localObject).a(true))
      {
        zcaw localzcaw = new zcaw();
        localzcaw.a((FormatConditionCollection)localObject);
        localzcaw.a(this.b);
        for (int j = 0; j < ((FormatConditionCollection)localObject).getCount(); j++)
        {
          FormatCondition localFormatCondition = ((FormatConditionCollection)localObject).get(j);
          zcbg localzcbg = new zcbg();
          localzcbg.a(localFormatCondition);
          localzcbg.a(this.b);
          switch (localFormatCondition.getType())
          {
          case 4: 
            b(localFormatCondition);
            break;
          case 3: 
            d(localFormatCondition);
            break;
          case 2: 
            f(localFormatCondition);
            break;
          }
          zche localzche4 = new zche(1049);
          localzche4.a(this.b);
        }
        zche localzche3 = new zche(1047);
        localzche3.a(this.b);
      }
    }
    zche localzche2 = new zche(1136);
    localzche2.a(this.b);
    Object localObject = new zche(36);
    ((zche)localObject).a(this.b);
  }
  
  private void i()
    throws Exception
  {
    Worksheet localWorksheet = this.e.a;
    if ((localWorksheet.getSparklineGroupCollection() == null) || (localWorksheet.getSparklineGroupCollection().getCount() == 0)) {
      return;
    }
    zcdk localzcdk = new zcdk();
    localzcdk.a(this.b);
    Object localObject = new zche(1058);
    ((zche)localObject).a(this.b);
    Iterator localIterator1 = localWorksheet.getSparklineGroupCollection().iterator();
    while (localIterator1.hasNext())
    {
      SparklineGroup localSparklineGroup = (SparklineGroup)localIterator1.next();
      localObject = new zcdd(localSparklineGroup);
      ((zche)localObject).a(this.b);
      localObject = new zche(1056);
      ((zche)localObject).a(this.b);
      Iterator localIterator2 = localSparklineGroup.getSparklineCollection().iterator();
      while (localIterator2.hasNext())
      {
        Sparkline localSparkline = (Sparkline)localIterator2.next();
        localObject = new zceh(localSparkline);
        ((zche)localObject).a(this.b);
      }
      localObject = new zche(1057);
      ((zche)localObject).a(this.b);
      localObject = new zche(1042);
      ((zche)localObject).a(this.b);
    }
    localObject = new zche(1059);
    ((zche)localObject).a(this.b);
    localObject = new zche(36);
    ((zche)localObject).a(this.b);
  }
  
  private void j()
    throws Exception
  {
    zbbs localzbbs = this.e.g;
    if (localzbbs != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localzbbs.a.values().iterator();
      Object localObject1;
      while (localIterator.hasNext())
      {
        localObject1 = (zrl)localIterator.next();
        if (((zrl)localObject1).c.equals("http://schemas.microsoft.com/office/2007/relationships/slicer")) {
          zf.a(localArrayList, localObject1);
        }
      }
      int i = localArrayList.size();
      if (i > 0)
      {
        localObject1 = new zcdk();
        ((zcdk)localObject1).a(this.b);
        zche localzche1 = new zche(1079);
        localzche1.a(this.b);
        for (int j = 0; j < i; j++)
        {
          localObject2 = (zrl)localArrayList.get(j);
          zcdc localzcdc = new zcdc(((zrl)localObject2).b);
          localzcdc.a(this.b);
          zche localzche3 = new zche(1082);
          localzche3.a(this.b);
        }
        zche localzche2 = new zche(1080);
        localzche2.a(this.b);
        Object localObject2 = new zche(36);
        ((zche)localObject2).a(this.b);
      }
    }
  }
  
  private void k()
    throws Exception
  {
    ArrayList localArrayList = this.e.l;
    int i = localArrayList.size();
    if (i == 0) {
      return;
    }
    zche localzche1 = new zche(638);
    localzche1.a(this.b);
    for (int j = 0; j < localArrayList.size(); j++)
    {
      zpl localzpl = (zpl)localArrayList.get(j);
      zcgq localzcgq = new zcgq(localzpl);
      localzcgq.a(this.b);
    }
    zche localzche2 = new zche(640);
    localzche2.a(this.b);
  }
  
  private void l()
    throws Exception
  {
    if (this.e.m.size() == 0) {
      return;
    }
    zche localzche1 = new zche(643);
    localzche1.a(this.b);
    ArrayList localArrayList = this.e.m;
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zpf localzpf = (zpf)localArrayList.get(i);
      zcao localzcao = new zcao(localzpf);
      localzcao.a(this.b);
    }
    zche localzche2 = new zche(645);
    localzche2.a(this.b);
  }
  
  private void m()
    throws Exception
  {
    int i = this.e.q.size();
    if (i == 0) {
      return;
    }
    zche localzche = new zche(660, i);
    localzche.a(this.b);
    Iterator localIterator = this.e.q.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zrc)localIterator.next();
      zcic localzcic = new zcic(((zrc)localObject).b.b);
      localzcic.a(this.b);
    }
    Object localObject = new zche(662);
    ((zche)localObject).a(this.b);
  }
  
  private void a(Worksheet paramWorksheet, Workbook paramWorkbook)
    throws Exception
  {
    zcir localzcir = new zcir(paramWorksheet, paramWorkbook);
    localzcir.a(this.b);
  }
  
  static void a(AutoFilter paramAutoFilter, com.aspose.cells.b.a.d.zh paramzh)
    throws Exception
  {
    zcas localzcas = new zcas(paramAutoFilter.i());
    localzcas.a(paramzh);
    for (int i = 0; i < paramAutoFilter.c.getCount(); i++)
    {
      FilterColumn localFilterColumn = paramAutoFilter.c.get(i);
      if (localFilterColumn.getFilterType() != 6)
      {
        zcba localzcba = new zcba(localFilterColumn);
        localzcba.a(paramzh);
        Object localObject2;
        Object localObject4;
        Object localObject3;
        switch (localFilterColumn.getFilterType())
        {
        case 5: 
          localObject1 = (Top10Filter)localFilterColumn.getFilter();
          localObject2 = new zcii();
          ((zcii)localObject2).a((Top10Filter)localObject1);
          ((zcii)localObject2).a(paramzh);
          break;
        case 2: 
          localObject1 = (DynamicFilter)localFilterColumn.getFilter();
          localObject2 = new zcfn();
          ((zcfn)localObject2).a((DynamicFilter)localObject1);
          ((zcfn)localObject2).a(paramzh);
          break;
        case 4: 
          localObject1 = (IconFilter)localFilterColumn.getFilter();
          localObject2 = new zcgk();
          ((zcgk)localObject2).a((IconFilter)localObject1);
          ((zcgk)localObject2).a(paramzh);
          break;
        case 0: 
          localObject1 = (ColorFilter)localFilterColumn.getFilter();
          localObject2 = new zcez();
          ((zcez)localObject2).a((ColorFilter)localObject1);
          ((zcez)localObject2).a(paramzh);
          break;
        case 1: 
          localObject1 = (CustomFilterCollection)localFilterColumn.getFilter();
          int j = 0;
          if ((((CustomFilterCollection)localObject1).getAnd()) && (((CustomFilterCollection)localObject1).getCount() > 1)) {
            j = 1;
          }
          zche localzche2 = new zche(172, j);
          localzche2.a(paramzh);
          for (int m = 0; m < ((CustomFilterCollection)localObject1).getCount(); m++)
          {
            localObject4 = ((CustomFilterCollection)localObject1).get(m);
            zcfi localzcfi = new zcfi();
            localzcfi.a((CustomFilter)localObject4);
            localzcfi.a(paramzh);
          }
          localObject3 = new zche(173);
          ((zche)localObject3).a(paramzh);
          break;
        case 3: 
          localObject1 = (MultipleFilterCollection)localFilterColumn.getFilter();
          zcbb localzcbb = new zcbb((MultipleFilterCollection)localObject1);
          localzcbb.a(paramzh);
          for (int k = 0; k < ((MultipleFilterCollection)localObject1).getCount(); k++)
          {
            localObject3 = ((MultipleFilterCollection)localObject1).get(k);
            if ((localObject3 instanceof DateTimeGroupItem))
            {
              localObject4 = new zcfj();
              ((zcfj)localObject4).a((DateTimeGroupItem)localObject3);
              ((zcfj)localObject4).a(paramzh);
            }
            else
            {
              localObject4 = new zcge((String)localObject3);
              ((zcge)localObject4).a(paramzh);
            }
          }
          zche localzche3 = new zche(166);
          localzche3.a(paramzh);
          break;
        }
        Object localObject1 = new zche(164);
        ((zche)localObject1).a(paramzh);
      }
    }
    zche localzche1 = new zche(162);
    localzche1.a(paramzh);
  }
  
  private void a(PageSetup paramPageSetup, String paramString, HorizontalPageBreakCollection paramHorizontalPageBreakCollection, VerticalPageBreakCollection paramVerticalPageBreakCollection)
    throws Exception
  {
    Object localObject1;
    Object localObject2;
    if (paramPageSetup != null)
    {
      localObject1 = new zcha(paramPageSetup);
      ((zcha)localObject1).a(this.b);
      zcgn localzcgn = new zcgn(paramPageSetup);
      localzcgn.a(this.b);
      localObject2 = new zcgr(paramPageSetup, paramString);
      ((zcgr)localObject2).a(this.b);
    }
    if ((paramHorizontalPageBreakCollection != null) && (paramHorizontalPageBreakCollection.getCount() > 0))
    {
      localObject1 = new zcbf(paramHorizontalPageBreakCollection);
      ((zcbf)localObject1).a(this.b);
      for (int i = 0; i < paramHorizontalPageBreakCollection.getCount(); i++)
      {
        localObject2 = new zcar();
        ((zcar)localObject2).a(paramHorizontalPageBreakCollection.get(i));
        ((zcar)localObject2).a(this.b);
      }
      zche localzche1 = new zche(393);
      localzche1.a(this.b);
    }
    if ((paramVerticalPageBreakCollection != null) && (paramVerticalPageBreakCollection.getCount() > 0))
    {
      localObject1 = new zcat(paramVerticalPageBreakCollection);
      ((zcat)localObject1).a(this.b);
      for (int j = 0; j < paramVerticalPageBreakCollection.getCount(); j++)
      {
        localObject2 = new zcar();
        ((zcar)localObject2).a(paramVerticalPageBreakCollection.get(j));
        ((zcar)localObject2).a(this.b);
      }
      zche localzche2 = new zche(395);
      localzche2.a(this.b);
    }
    if (paramPageSetup != null) {
      a(paramPageSetup);
    }
  }
  
  private void a(PageSetup paramPageSetup)
    throws Exception
  {
    zcgi localzcgi = new zcgi();
    localzcgi.a(paramPageSetup);
    localzcgi.a(this.b);
    zche localzche = new zche(480);
    localzche.a(this.b);
  }
  
  private void n()
    throws Exception
  {
    for (int i = 0; i < this.e.f.size(); i++)
    {
      zpk localzpk = (zpk)this.e.f.get(i);
      zcgh localzcgh = new zcgh();
      localzcgh.a(localzpk);
      localzcgh.a(this.b);
    }
  }
  
  private void a(Worksheet paramWorksheet)
    throws Exception
  {
    if (paramWorksheet.getValidations().getCount() == 0) {
      return;
    }
    zcay localzcay = new zcay();
    localzcay.a(paramWorksheet.getValidations());
    localzcay.a(this.b);
    for (int i = 0; i < paramWorksheet.getValidations().getCount(); i++)
    {
      Validation localValidation = paramWorksheet.getValidations().get(i);
      zcfl localzcfl = new zcfl();
      localzcfl.a(localValidation);
      localzcfl.a(this.b);
    }
    zche localzche = new zche(574);
    localzche.a(this.b);
  }
  
  private void b(Worksheet paramWorksheet)
    throws Exception
  {
    if (paramWorksheet.getConditionalFormattings().getCount() == 0) {
      return;
    }
    paramWorksheet.getConditionalFormattings().a();
    for (int i = 0; i < paramWorksheet.getConditionalFormattings().getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = paramWorksheet.getConditionalFormattings().get(i);
      if (localFormatConditionCollection.b(false) == 0)
      {
        zcav localzcav = new zcav();
        localzcav.a(localFormatConditionCollection);
        localzcav.a(this.b);
        for (int j = 0; j < localFormatConditionCollection.getCount(); j++)
        {
          FormatCondition localFormatCondition = localFormatConditionCollection.get(j);
          zcbh localzcbh = new zcbh();
          localzcbh.a(localFormatCondition);
          localzcbh.a(this.b);
          if (localFormatCondition.getType() == 4)
          {
            a(localFormatCondition);
          }
          else if (localFormatCondition.getType() == 3)
          {
            c(localFormatCondition);
            localObject = new zcdk();
            ((zcdk)localObject).a(this.b);
            zcdh localzcdh = new zcdh(localFormatCondition.b().a());
            localzcdh.a(this.b);
            zche localzche2 = new zche(36);
            localzche2.a(this.b);
          }
          else if (localFormatCondition.getType() == 2)
          {
            e(localFormatCondition);
          }
          Object localObject = new zche(464);
          ((zche)localObject).a(this.b);
        }
        zche localzche1 = new zche(462);
        localzche1.a(this.b);
      }
    }
  }
  
  private void a(FormatCondition paramFormatCondition)
    throws Exception
  {
    IconSet localIconSet = paramFormatCondition.getIconSet();
    zcbe localzcbe = new zcbe(false);
    localzcbe.a(localIconSet);
    localzcbe.a(this.b);
    for (int i = 0; i < localIconSet.getCfvos().getCount(); i++)
    {
      ConditionalFormattingValue localConditionalFormattingValue = localIconSet.getCfvos().get(i);
      a(localConditionalFormattingValue, false);
    }
    zche localzche = new zche(466);
    localzche.a(this.b);
  }
  
  private void b(FormatCondition paramFormatCondition)
    throws Exception
  {
    IconSet localIconSet = paramFormatCondition.getIconSet();
    zcbe localzcbe = new zcbe(true);
    localzcbe.a(localIconSet);
    localzcbe.a(this.b);
    Object localObject;
    for (int i = 0; i < localIconSet.getCfvos().getCount(); i++)
    {
      localObject = localIconSet.getCfvos().get(i);
      a((ConditionalFormattingValue)localObject, true);
    }
    if (localIconSet.isCustom()) {
      for (i = 0; i < localIconSet.getCfIcons().getCount(); i++)
      {
        localObject = localIconSet.getCfIcons().get(i);
        zcdg localzcdg = new zcdg((ConditionalFormattingIcon)localObject);
        localzcdg.a(this.b);
      }
    }
    zche localzche = new zche(1155);
    localzche.a(this.b);
  }
  
  private void a(ConditionalFormattingValue paramConditionalFormattingValue, boolean paramBoolean)
    throws Exception
  {
    zcev localzcev = new zcev(paramConditionalFormattingValue, paramBoolean);
    localzcev.a(this.b);
  }
  
  private void c(FormatCondition paramFormatCondition)
    throws Exception
  {
    DataBar localDataBar = paramFormatCondition.getDataBar();
    zcaz localzcaz = new zcaz(localDataBar, false);
    localzcaz.a(this.b);
    a(localDataBar.a, false);
    a(localDataBar.b, false);
    zcfa localzcfa = new zcfa(localDataBar.b(), this.d, false);
    localzcfa.a(this.b);
    zche localzche = new zche(468);
    localzche.a(this.b);
  }
  
  private void d(FormatCondition paramFormatCondition)
    throws Exception
  {
    DataBar localDataBar = paramFormatCondition.getDataBar();
    zcaz localzcaz = new zcaz(localDataBar, true);
    localzcaz.a(this.b);
    a(localDataBar.a, true);
    a(localDataBar.b, true);
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
    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zaml localzaml = (zaml)((Iterator)localObject).next();
      zcfa localzcfa = new zcfa(localzaml, this.d, true);
      localzcfa.a(this.b);
    }
    localObject = new zche(1156);
    ((zche)localObject).a(this.b);
  }
  
  private void e(FormatCondition paramFormatCondition)
    throws Exception
  {
    ColorScale localColorScale = paramFormatCondition.getColorScale();
    zche localzche1 = new zche(469);
    localzche1.a(this.b);
    a(localColorScale.a, false);
    if (localColorScale.b != null) {
      a(localColorScale.b, false);
    }
    a(localColorScale.c, false);
    zcfa localzcfa = new zcfa(localColorScale.b(), this.d, false);
    localzcfa.a(this.b);
    if (localColorScale.b != null)
    {
      localzcfa = new zcfa(localColorScale.c(), this.d, false);
      localzcfa.a(this.b);
    }
    localzcfa = new zcfa(localColorScale.d(), this.d, false);
    localzcfa.a(this.b);
    zche localzche2 = new zche(470);
    localzche2.a(this.b);
  }
  
  private void f(FormatCondition paramFormatCondition)
    throws Exception
  {
    zche localzche1 = new zche(1157);
    localzche1.a(this.b);
    ColorScale localColorScale = paramFormatCondition.getColorScale();
    a(localColorScale.a, true);
    if (localColorScale.b != null) {
      a(localColorScale.b, true);
    }
    a(localColorScale.c, true);
    zcfa localzcfa = new zcfa(localColorScale.b(), this.d, true);
    localzcfa.a(this.b);
    if (localColorScale.b != null)
    {
      localzcfa = new zcfa(localColorScale.c(), this.d, true);
      localzcfa.a(this.b);
    }
    localzcfa = new zcfa(localColorScale.d(), this.d, true);
    localzcfa.a(this.b);
    zche localzche2 = new zche(1158);
    localzche2.a(this.b);
  }
  
  private void c(Worksheet paramWorksheet)
    throws Exception
  {
    zapd localzapd = paramWorksheet.getCells().o();
    zche localzche1 = new zche(177, localzapd.getCount());
    localzche1.a(this.b);
    for (int i = 0; i < localzapd.getCount(); i++)
    {
      CellArea localCellArea = localzapd.a(i);
      zcgo localzcgo = new zcgo(localCellArea);
      localzcgo.a(this.b);
    }
    zche localzche2 = new zche(178);
    localzche2.a(this.b);
  }
  
  private void o()
    throws Exception
  {
    ColumnCollection localColumnCollection = this.e.a.getCells().getColumns();
    if ((localColumnCollection.getCount() == 0) && ((localColumnCollection.a == null) || (!localColumnCollection.a.j()))) {
      return;
    }
    zche localzche = new zche(390);
    localzche.a(this.b);
    int i = 16383;
    Object localObject1 = localColumnCollection.a;
    if (localObject1 != null) {
      if (((Column)localObject1).j())
      {
        Column localColumn1 = new Column(((Column)localObject1).getIndex(), this.e.a, localColumnCollection.b(), (Column)localObject1);
        localObject1 = localColumn1;
        i = localColumn1.getIndex();
      }
      else
      {
        localObject1 = null;
      }
    }
    int j = 0;
    for (int k = 0; k < localColumnCollection.getCount(); k++)
    {
      Column localColumn2 = localColumnCollection.getColumnByIndex(k);
      if ((localColumn2.getIndex() - j != 0) && (localObject1 != null) && (localColumn2.getIndex() > i))
      {
        if (j < i) {
          j = i;
        }
        ((Column)localObject1).a(j);
        zcey localzcey = new zcey();
        localzcey.a((Column)localObject1, localColumn2.getIndex() - 1, zlp.a(this.d.getWorksheets()), this.c.d.f);
        localzcey.a(this.b);
      }
      int m = localColumn2.c();
      int n = 0;
      k += 1;
      while (k < localColumnCollection.getCount())
      {
        localObject3 = localColumnCollection.getColumnByIndex(k);
        if ((((Column)localObject3).getIndex() == localColumn2.getIndex() + n + 1) && (localColumn2.b((Column)localObject3)))
        {
          n++;
        }
        else
        {
          k--;
          break;
        }
        k++;
      }
      Object localObject3 = new zcey();
      ((zcey)localObject3).a(localColumn2, localColumn2.getIndex() + n, zlp.a(this.d.getWorksheets()), this.c.d.f);
      ((zcey)localObject3).a(this.b);
      j = localColumn2.getIndex() + n + 1;
    }
    if ((localObject1 != null) && (j <= 16383))
    {
      if (j < i) {
        j = i;
      }
      ((Column)localObject1).a(j);
      localObject2 = new zcey();
      ((zcey)localObject2).a((Column)localObject1, 16383, zlp.a(this.d.getWorksheets()), this.c.d.f);
      ((zcey)localObject2).a(this.b);
    }
    Object localObject2 = new zche(391);
    ((zche)localObject2).a(this.b);
  }
  
  private void p()
    throws Exception
  {
    zche localzche = new zche(145);
    localzche.a(this.b);
    Cells localCells = this.e.a.getCells();
    zv localzv = localCells.e();
    if (localzv.a() > 0)
    {
      localObject = localCells.getRows();
      zaiv localzaiv = localzv.a(-1, -1, false);
      for (;;)
      {
        int i = localzaiv.a();
        if (i < 0) {
          break;
        }
        Row localRow = ((RowCollection)localObject).b(i, false);
        if (localRow.c.a() == 0) {
          a(localRow.c);
        } else {
          a(localCells, localRow);
        }
      }
    }
    Object localObject = new zche(146);
    ((zche)localObject).a(this.b);
  }
  
  private void a(zt paramzt)
    throws Exception
  {
    zchl localzchl = new zchl();
    localzchl.a(paramzt, 0, 0, this.c.d.f);
    localzchl.a(this.b);
  }
  
  private void a(Cells paramCells, Row paramRow)
    throws Exception
  {
    zt localzt = paramRow.c;
    zchl localzchl = new zchl();
    HashMap localHashMap = this.c.d.f;
    int i = localzt.a(localzt.c(0));
    int j = localzt.a(localzt.c(localzt.a() - 1));
    localzchl.a(localzt, i, j, localHashMap);
    localzchl.a(this.b);
    RowCollection localRowCollection = paramCells.getRows();
    Object localObject1 = null;
    boolean bool1 = false;
    zaiv localzaiv = localzt.a(-1, -1, false);
    byte[] arrayOfByte = new byte[18];
    int m = 0;
    for (;;)
    {
      int k = localzaiv.a();
      if (k < 0) {
        break;
      }
      Cell localCell = new Cell(paramRow, k);
      bool1 = (localObject1 == null) || (((Cell)localObject1).getColumn() + 1 != localCell.getColumn());
      switch (localCell.c.c)
      {
      case 2: 
        m = zceq.a(arrayOfByte, bool1, localCell, localHashMap);
        this.b.b(arrayOfByte, 0, m);
        break;
      case 0: 
        m = zcep.a(arrayOfByte, bool1, localCell, localHashMap);
        this.b.b(arrayOfByte, 0, m);
        break;
      case 4: 
        m = zceu.a(arrayOfByte, bool1, localCell, localHashMap);
        this.b.b(arrayOfByte, 0, m);
        break;
      case 5: 
        zces localzces = new zces();
        localzces.a(localCell, localHashMap);
        localzces.a(this.b);
        break;
      case 1: 
      case 6: 
        m = zcet.a(arrayOfByte, bool1, localCell, localHashMap);
        this.b.b(arrayOfByte, 0, m);
        break;
      case 3: 
        m = zcer.a(arrayOfByte, localCell, localHashMap);
        this.b.b(arrayOfByte, 0, m);
        break;
      }
      localObject1 = localCell;
      boolean bool2 = localCell.g();
      if (bool2)
      {
        Object localObject2;
        if (localCell.isArrayHeader())
        {
          localObject2 = new zcap(localCell.F());
          ((zcap)localObject2).a(this.b);
        }
        else if (localCell.y())
        {
          localObject2 = new zchs(localCell.F());
          ((zchs)localObject2).a(this.b);
        }
      }
    }
  }
  
  private void q()
    throws Exception
  {
    zche localzche1 = new zche(133);
    localzche1.a(this.b);
    zcbv localzcbv = new zcbv();
    localzcbv.a(this.e.a);
    localzcbv.a(this.b);
    a(this.e.a.getPanes(), this.e.a.i());
    a(this.e.a.t());
    zche localzche2 = new zche(138);
    localzche2.a(this.b);
    zche localzche3 = new zche(134);
    localzche3.a(this.b);
  }
  
  private void a(PaneCollection paramPaneCollection, boolean paramBoolean)
    throws Exception
  {
    if (paramPaneCollection == null) {
      return;
    }
    zcgs localzcgs = new zcgs();
    localzcgs.a(paramPaneCollection, paramBoolean, this.e.a.j());
    localzcgs.a(this.b);
  }
  
  private void a(zbew paramzbew)
    throws Exception
  {
    if (paramzbew == null) {
      return;
    }
    for (int i = 0; i < paramzbew.size(); i++)
    {
      zbev localzbev = (zbev)paramzbew.get(i);
      zchp localzchp = new zchp();
      localzchp.a(localzbev);
      localzchp.a(this.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */