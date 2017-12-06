package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zcan
{
  private Worksheet a;
  private Cells b;
  private Workbook c;
  private WorksheetCollection d;
  private zcaa e;
  private SaveOptions f;
  
  zcan(Worksheet paramWorksheet, zcaa paramzcaa, SaveOptions paramSaveOptions)
  {
    this.a = paramWorksheet;
    this.b = this.a.getCells();
    this.c = paramWorksheet.d();
    this.d = this.c.getWorksheets();
    this.e = paramzcaa;
    this.f = paramSaveOptions;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    zce localzce = new zce(this.a.getType());
    localzce.a(paramzrg);
    int i = (this.a.w() != null) && (this.a.w().getCount() > 0) ? 1 : 0;
    try
    {
      this.b.c = new zlt(this.b, 255);
      if (i != 0)
      {
        this.b.b = new zlx(this.b, 255);
        this.b.getRows().b(0);
      }
      long l = paramzrg.b();
      a(paramzrg, this.e.e.a());
      a(paramzrg, l);
      paramzrg.c(512);
      paramzrg.c(14);
      for (int j = 0; j < 14; j++) {
        paramzrg.a((byte)0);
      }
      j = (int)paramzrg.b();
      this.e.a(paramzrg);
      a(this.e, paramzrg, l, j);
      b(paramzrg);
      if (this.f.getClearData()) {
        this.b.clear();
      }
    }
    finally
    {
      this.b.l();
      if (i != 0)
      {
        this.b.k();
        this.b.getRows().b();
      }
    }
    zta localzta = new zta();
    localzta.a(paramzrg);
  }
  
  void a(zrg paramzrg, long paramLong)
    throws Exception
  {
    paramzrg.c(13);
    paramzrg.c(2);
    switch (this.a.d().getSettings().getCalcMode())
    {
    case 1: 
      paramzrg.b(2);
      break;
    case 2: 
      paramzrg.c(0);
      break;
    default: 
      paramzrg.c(1);
    }
    paramzrg.c(12);
    paramzrg.c(2);
    paramzrg.b(this.a.d().getSettings().getMaxIteration());
    paramzrg.c(15);
    paramzrg.c(2);
    paramzrg.c(this.a.d().getSettings().e() ? 0 : 1);
    paramzrg.c(17);
    paramzrg.c(2);
    if (this.a.d().getSettings().getIteration()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    paramzrg.c(16);
    paramzrg.c(8);
    paramzrg.a(this.a.d().getSettings().getMaxChange());
    paramzrg.c(95);
    paramzrg.c(2);
    if (this.a.d().getSettings().getRecalculateBeforeSave()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    Cells localCells = this.a.getCells();
    PageSetup localPageSetup = localCells.h();
    paramzrg.c(42);
    paramzrg.c(2);
    if (localPageSetup.getPrintHeadings()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    paramzrg.c(43);
    paramzrg.c(2);
    if (localPageSetup.getPrintGridlines()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    paramzrg.c(130);
    paramzrg.c(2);
    paramzrg.c(1);
    if (((localCells.r() & 0xFF) > 0) || ((localCells.s() & 0xFF) > 0))
    {
      localObject1 = new zaek();
      if ((localCells.r() & 0xFF) > 0)
      {
        ((zaek)localObject1).a(17 + (localCells.r() & 0xFF) * 12);
        ((zaek)localObject1).a((byte)((localCells.r() & 0xFF) + 1));
      }
      if ((localCells.s() & 0xFF) > 0)
      {
        ((zaek)localObject1).d(17 + (localCells.s() & 0xFF) * 12);
        ((zaek)localObject1).b((byte)((localCells.s() & 0xFF) + 1));
      }
      ((zaek)localObject1).a(paramzrg);
    }
    f(paramzrg);
    paramzrg.a(131201);
    Object localObject1 = zc.a(this.a.i);
    if (localPageSetup.isPercentScale())
    {
      int tmp514_513 = 1;
      Object tmp514_511 = localObject1;
      tmp514_511[tmp514_513] = ((byte)(tmp514_511[tmp514_513] & 0xFE));
    }
    else
    {
      int tmp528_527 = 1;
      Object tmp528_525 = localObject1;
      tmp528_525[tmp528_527] = ((byte)(tmp528_525[tmp528_527] | 0x1));
    }
    if (this.a.getOutline().SummaryRowBelow)
    {
      int tmp550_549 = 0;
      Object tmp550_547 = localObject1;
      tmp550_547[tmp550_549] = ((byte)(tmp550_547[tmp550_549] | 0x40));
    }
    else
    {
      int tmp563_562 = 0;
      Object tmp563_560 = localObject1;
      tmp563_560[tmp563_562] = ((byte)(tmp563_560[tmp563_562] & 0xBF));
    }
    if (this.a.getOutline().SummaryColumnRight)
    {
      int tmp587_586 = 0;
      Object tmp587_584 = localObject1;
      tmp587_584[tmp587_586] = ((byte)(tmp587_584[tmp587_586] | 0x80));
    }
    else
    {
      int tmp601_600 = 0;
      Object tmp601_598 = localObject1;
      tmp601_598[tmp601_600] = ((byte)(tmp601_598[tmp601_600] & 0x7F));
    }
    paramzrg.a((byte[])localObject1);
    a(paramzrg, this.a.getHorizontalPageBreaks());
    a(paramzrg, this.a.getVerticalPageBreaks());
    zags localzags1 = new zags(true);
    localzags1.a(localPageSetup.f);
    localzags1.a(paramzrg);
    zags localzags2 = new zags(false);
    localzags2.a(localPageSetup.e);
    localzags2.a(paramzrg);
    paramzrg.c(131);
    paramzrg.c(2);
    if (localPageSetup.getCenterHorizontally()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    paramzrg.c(132);
    paramzrg.c(2);
    if (localPageSetup.getCenterVertically()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    if (localPageSetup.getLeftMargin() >= 0.0D)
    {
      paramzrg.c(38);
      paramzrg.c(8);
      paramzrg.a(localPageSetup.getLeftMarginInch());
    }
    if (localPageSetup.getRightMargin() >= 0.0D)
    {
      paramzrg.c(39);
      paramzrg.c(8);
      paramzrg.a(localPageSetup.getRightMarginInch());
    }
    if (localPageSetup.getTopMargin() >= 0.0D)
    {
      paramzrg.c(40);
      paramzrg.c(8);
      paramzrg.a(localPageSetup.getTopMarginInch());
    }
    if (localPageSetup.getBottomMargin() >= 0.0D)
    {
      paramzrg.c(41);
      paramzrg.c(8);
      paramzrg.a(localPageSetup.getBottomMarginInch());
    }
    if (localPageSetup.getPrinterSettings() != null)
    {
      localObject2 = new zauq();
      ((zauq)localObject2).a(localPageSetup.getPrinterSettings());
      ((zauq)localObject2).a(paramzrg);
    }
    Object localObject2 = new zbfl();
    ((zbfl)localObject2).b(localPageSetup.d());
    ((zbfl)localObject2).a(paramzrg);
    zagq localzagq = new zagq();
    localzagq.a(localPageSetup, null);
    localzagq.a(paramzrg);
    Object localObject3 = this.a.F();
    Object localObject5;
    if (localObject3 != null)
    {
      Object localObject4;
      if ((localObject3 instanceof ArrayList))
      {
        localObject4 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (byte[])((Iterator)localObject4).next();
          paramzrg.a((byte[])localObject5);
        }
      }
      else if ((localObject3 instanceof byte[]))
      {
        localObject4 = new zch();
        ((zch)localObject4).a((byte[])localObject3);
        ((zch)localObject4).a(paramzrg);
      }
    }
    Object localObject6;
    if ((this.a.I() != null) && (this.a.getCustomProperties().getCount() > 0)) {
      for (int i = 0; i < this.a.getCustomProperties().getCount(); i++)
      {
        localObject5 = this.a.getCustomProperties().get(i);
        localObject6 = new zcu((CustomProperty)localObject5);
        ((zcu)localObject6).a(paramzrg);
      }
    }
    if (this.a.isProtected())
    {
      if (!this.a.getProtection().getAllowEditingContent())
      {
        paramzrg.c(18);
        paramzrg.c(2);
        paramzrg.c(1);
      }
      if (!this.a.getProtection().getAllowEditingScenario())
      {
        paramzrg.c(221);
        paramzrg.c(2);
        paramzrg.c(1);
      }
      if (!this.a.getProtection().getAllowEditingObject())
      {
        paramzrg.c(99);
        paramzrg.c(2);
        paramzrg.c(1);
      }
      if ((this.a.getProtection().b() & 0xFFFF) != 0)
      {
        paramzrg.c(19);
        paramzrg.c(2);
        paramzrg.a(zc.a((short)(this.a.getProtection().b() & 0xFFFF)));
      }
    }
    if (localCells.getColumns().c >= 0.0D) {
      b(paramzrg, paramLong);
    }
    e(paramzrg);
    if ((this.a.t != null) && (this.a.t.getCount() > 0))
    {
      zben localzben = new zben(this.a.t);
      localzben.a(paramzrg);
      for (int j = 0; j < this.a.t.getCount(); j++)
      {
        localObject6 = new zbeo(this.a.t.get(j));
        ((zbeo)localObject6).a(paramzrg);
      }
    }
    k(paramzrg);
    if (this.a.q() != null) {
      this.a.q().a(paramzrg);
    }
    a(this.a.r(), paramzrg);
  }
  
  void b(zrg paramzrg)
    throws Exception
  {
    if ((this.a.w() != null) && (this.a.w().getCount() != 0))
    {
      localObject1 = new zapv(this.d, this.a, this.a.w(), paramzrg);
      ((zapv)localObject1).a();
    }
    if ((this.a.getCells().h().j() != null) && (this.a.getCells().h().j().getCount() != 0))
    {
      localObject1 = new zbbe();
      ((zbbe)localObject1).a(this.b.h().j());
      ((zbbe)localObject1).c(paramzrg);
    }
    Object localObject1 = this.a.getComments();
    Object localObject4;
    if (this.a.getComments().getCount() > 0)
    {
      localObject2 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Comment)((Iterator)localObject2).next();
        if (((Comment)localObject3).a())
        {
          localObject4 = new zaqu();
          ((zaqu)localObject4).a(((Comment)localObject3).getRow(), (byte)((Comment)localObject3).getColumn(), ((Comment)localObject3).getCommentShape().O(), ((Comment)localObject3).isVisible(), ((Comment)localObject3).getAuthor());
          ((zaqu)localObject4).a(paramzrg);
        }
      }
    }
    if ((this.a.b != null) && (this.a.b.getCount() != 0))
    {
      localObject2 = this.a.b.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (PivotTable)((Iterator)localObject2).next();
        ((PivotTable)localObject3).a(paramzrg);
      }
    }
    Object localObject2 = new zbyx();
    ((zbyx)localObject2).a(this.a);
    ((zbyx)localObject2).a(paramzrg);
    if (this.a.getZoom() != 100)
    {
      localObject3 = new zbdz(this.a.getZoom());
      ((zbdz)localObject3).a(paramzrg);
    }
    if (this.a.getViewType() == 2)
    {
      localObject3 = new zaur();
      ((zaur)localObject3).a(this.a);
      ((zaur)localObject3).a(paramzrg);
    }
    if (this.a.getPanes() != null)
    {
      localObject3 = new zavd();
      if (this.a.i()) {
        ((zavd)localObject3).a(this.a.getPanes());
      } else {
        ((zavd)localObject3).b(this.a.getPanes());
      }
      ((zavd)localObject3).a(paramzrg);
    }
    Object localObject3 = this.a.t();
    if ((localObject3 != null) && (((zbew)localObject3).size() > 0))
    {
      localObject4 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        zbev localzbev = (zbev)((Iterator)localObject4).next();
        zbex localzbex = new zbex();
        localzbex.a(localzbev);
        localzbex.a(paramzrg);
      }
    }
    g(paramzrg);
    if (this.a.s != null) {
      d(paramzrg);
    }
    h(paramzrg);
    i(paramzrg);
    j(paramzrg);
    Object localObject7;
    Object localObject6;
    if (this.a.getValidations().getCount() != 0)
    {
      localObject4 = new ArrayList();
      int k = 0;
      for (int i1 = 0; i1 < this.a.getValidations().getCount(); i1++)
      {
        Validation localValidation = this.a.getValidations().get(i1);
        localObject7 = new zop(this.a);
        if (((zop)localObject7).a(localValidation))
        {
          zf.a((ArrayList)localObject4, localObject7);
          k += ((zop)localObject7).c / ((zop)localObject7).a;
          if (((zop)localObject7).c % ((zop)localObject7).a != 0) {
            k++;
          }
        }
      }
      if (k > 0)
      {
        localObject6 = new zoo();
        ((zoo)localObject6).a(this.a.getValidations(), k);
        ((zoo)localObject6).a(paramzrg);
        for (int i3 = 0; i3 < ((ArrayList)localObject4).size(); i3++)
        {
          localObject7 = (zop)((ArrayList)localObject4).get(i3);
          while (((zop)localObject7).a()) {
            ((zop)localObject7).a(paramzrg);
          }
        }
      }
    }
    if (this.e.f != null)
    {
      localObject4 = new zavx();
      ((zavx)localObject4).a(this.e.f, paramzrg);
    }
    Object localObject5;
    if (this.a.p() != null)
    {
      localObject4 = this.a.p();
      if (((ArrayList)localObject4).size() > 0)
      {
        localObject5 = ((Iterable)localObject4).iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = (byte[])((Iterator)localObject5).next();
          paramzrg.a((byte[])localObject6);
        }
      }
    }
    if ((this.a.p != null) && (!"".equals(this.a.p)))
    {
      localObject4 = new zlb();
      ((zlb)localObject4).a(this.a.p);
      ((zlb)localObject4).a(paramzrg);
    }
    if (this.a.H() != null)
    {
      localObject4 = this.a.H().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (byte[])((Iterator)localObject4).next();
        paramzrg.a((byte[])localObject5);
      }
    }
    c(paramzrg);
    if (this.a.a() != null)
    {
      localObject4 = new zbbf();
      ((zbbf)localObject4).a(this.a.a());
      ((zbbf)localObject4).a(paramzrg);
    }
    if ((this.a.m != null) && (this.a.m.getCount() > 0)) {
      for (int i = 0; i < this.a.m.getCount(); i++)
      {
        localObject5 = new zxa();
        ((zxa)localObject5).a(this.a.m.get(i));
        ((zxa)localObject5).a(paramzrg);
      }
    }
    if (this.a.getAllowEditRanges() != null)
    {
      ProtectedRangeCollection localProtectedRangeCollection = this.a.getAllowEditRanges();
      for (int m = 0; m < localProtectedRangeCollection.getCount(); m++)
      {
        localObject6 = localProtectedRangeCollection.get(m);
        zbbg localzbbg = new zbbg();
        localzbbg.a((ProtectedRange)localObject6);
        localzbbg.a(paramzrg);
      }
    }
    if (!this.a.o.b())
    {
      int j = this.a.z();
      if (j != 64)
      {
        zbow localzbow = new zbow(j, this.a.o);
        localzbow.a(paramzrg);
      }
      else if (j == 64)
      {
        int n = this.a.o.a(this.a.d());
        int i2 = this.a.c().o().c(n);
        int i4 = this.a.c().o().b(i2);
        localObject7 = new zbow(i2, i4, this.a.o);
        ((zbow)localObject7).a(paramzrg);
      }
    }
  }
  
  private void c(zrg paramzrg)
    throws Exception
  {
    if (this.a.d != null)
    {
      ListObjectCollection localListObjectCollection = this.a.d;
      if (localListObjectCollection.getCount() > 0)
      {
        zbbh localzbbh = new zbbh();
        localzbbh.a(paramzrg);
        for (int i = 0; i < localListObjectCollection.getCount(); i++)
        {
          ListObject localListObject = localListObjectCollection.get(i);
          zxb localzxb = new zxb();
          localzxb.b(i, localListObject);
          localzxb.a(paramzrg);
          zaod localzaod = new zaod();
          localzaod.a(localListObject);
          localzaod.a(paramzrg);
          HashMap localHashMap = localzxb.a;
          if (localHashMap != null)
          {
            Iterator localIterator = localListObject.getListColumns().iterator();
            while (localIterator.hasNext())
            {
              ListColumn localListColumn = (ListColumn)localIterator.next();
              zbk localzbk = (zbk)localHashMap.get(localListColumn);
              if ((localzbk != null) && (localzbk.a != null)) {
                localzbk.a.a(paramzrg);
              }
            }
          }
          localzaod = new zaod();
          localzaod.c(localListObject);
          localzaod.a(paramzrg);
          localzaod = new zaod();
          localzaod.b(localListObject);
          localzaod.a(paramzrg);
        }
      }
    }
  }
  
  private void d(zrg paramzrg)
    throws Exception
  {
    for (int i = 0; i < this.a.s.getCount(); i++)
    {
      zoh localzoh = this.a.s.a(i);
      zbxv localzbxv = new zbxv();
      localzbxv.a(localzoh);
      localzbxv.a(paramzrg);
      zbew localzbew = localzoh.i;
      if ((localzbew != null) && (localzbew.size() > 0))
      {
        localObject1 = localzbew.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (zbev)((Iterator)localObject1).next();
          localObject3 = new zbex();
          ((zbex)localObject3).a((zbev)localObject2);
          ((zbex)localObject3).a(paramzrg);
        }
      }
      Object localObject1 = localzoh.e();
      a(paramzrg, localzoh.f());
      a(paramzrg, localzoh.g());
      Object localObject2 = new zags(true);
      ((zags)localObject2).a(((PageSetup)localObject1).f);
      ((zags)localObject2).a(paramzrg);
      Object localObject3 = new zags(false);
      ((zags)localObject3).a(((PageSetup)localObject1).e);
      ((zags)localObject3).a(paramzrg);
      paramzrg.c(131);
      paramzrg.c(2);
      if (((PageSetup)localObject1).getCenterHorizontally()) {
        paramzrg.c(1);
      } else {
        paramzrg.c(0);
      }
      paramzrg.c(132);
      paramzrg.c(2);
      if (((PageSetup)localObject1).getCenterVertically()) {
        paramzrg.c(1);
      } else {
        paramzrg.c(0);
      }
      if (((PageSetup)localObject1).getLeftMargin() >= 0.0D)
      {
        paramzrg.c(38);
        paramzrg.c(8);
        paramzrg.a(((PageSetup)localObject1).getLeftMarginInch());
      }
      if (((PageSetup)localObject1).getRightMargin() >= 0.0D)
      {
        paramzrg.c(39);
        paramzrg.c(8);
        paramzrg.a(((PageSetup)localObject1).getRightMarginInch());
      }
      if (((PageSetup)localObject1).getTopMargin() >= 0.0D)
      {
        paramzrg.c(40);
        paramzrg.c(8);
        paramzrg.a(((PageSetup)localObject1).getTopMarginInch());
      }
      if (((PageSetup)localObject1).getBottomMargin() >= 0.0D)
      {
        paramzrg.c(41);
        paramzrg.c(8);
        paramzrg.a(((PageSetup)localObject1).getBottomMarginInch());
      }
      if (((PageSetup)localObject1).getPrinterSettings() != null)
      {
        localObject4 = new zauq();
        ((zauq)localObject4).a(((PageSetup)localObject1).getPrinterSettings());
        ((zauq)localObject4).a(paramzrg);
      }
      Object localObject4 = new zbfl();
      ((zbfl)localObject4).b(((PageSetup)localObject1).d());
      ((zbfl)localObject4).a(paramzrg);
      zagq localzagq = new zagq();
      localzagq.a((PageSetup)localObject1, localzoh.n.a());
      localzagq.a(paramzrg);
      if (localzoh.a() != 0)
      {
        paramzrg.c(157);
        paramzrg.c(2);
        paramzrg.b(localzoh.a());
      }
      if ((localzoh.d != null) && (localzoh.b().c != null) && (localzoh.b().c.getCount() > 0))
      {
        localObject5 = localzoh.b().c;
        for (int j = 0; j < ((FilterColumnCollection)localObject5).getCount(); j++)
        {
          FilterColumn localFilterColumn = ((FilterColumnCollection)localObject5).getByIndex(j);
          if (localFilterColumn != null)
          {
            zbk localzbk = new zbk();
            localzbk.a(localFilterColumn);
            localzbk.a(paramzrg);
          }
        }
      }
      Object localObject5 = new zbxw();
      ((zbxw)localObject5).a(paramzrg);
    }
  }
  
  private void a(zrg paramzrg, HorizontalPageBreakCollection paramHorizontalPageBreakCollection)
    throws Exception
  {
    if (paramHorizontalPageBreakCollection.getCount() > 0)
    {
      zaey localzaey = new zaey();
      localzaey.a(paramHorizontalPageBreakCollection);
      localzaey.a(paramzrg);
    }
  }
  
  private void a(zrg paramzrg, VerticalPageBreakCollection paramVerticalPageBreakCollection)
    throws Exception
  {
    if (paramVerticalPageBreakCollection.getCount() > 0)
    {
      zbyh localzbyh = new zbyh();
      localzbyh.a(paramVerticalPageBreakCollection);
      localzbyh.a(paramzrg);
    }
  }
  
  private void b(zrg paramzrg, long paramLong)
    throws Exception
  {
    long l = paramzrg.b();
    paramzrg.b((paramLong & 0xFFFFFFFF) + 16L);
    paramzrg.a(l);
    paramzrg.b(l);
    zrw localzrw = new zrw((int)this.b.getColumns().c);
    localzrw.a(paramzrg);
  }
  
  private void e(zrg paramzrg)
    throws Exception
  {
    ArrayList localArrayList = this.b.getColumns().c();
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zlc localzlc = (zlc)localIterator.next();
      localzlc.a(paramzrg);
    }
  }
  
  private void f(zrg paramzrg)
    throws Exception
  {
    zrx localzrx = new zrx();
    if (this.b.a() >= 0) {
      localzrx.a(this.b.q(), this.b.a());
    }
    localzrx.a(paramzrg);
  }
  
  private void a(zrg paramzrg, int paramInt)
    throws Exception
  {
    paramzrg.a((short)523);
    paramzrg.a((short)(16 + 4 * paramInt));
    paramzrg.a(0);
    paramzrg.a(0);
    paramzrg.a(0);
    paramzrg.a(0);
    for (int i = 0; i < paramInt; i++) {
      paramzrg.a(0);
    }
  }
  
  private void a(zcaa paramzcaa, zrg paramzrg, long paramLong, int paramInt)
    throws Exception
  {
    int i = (int)paramzrg.b();
    paramzrg.b(paramInt - 14);
    paramzrg.a(paramzcaa.a);
    paramzrg.a(paramzcaa.b);
    paramzrg.a((short)this.e.c);
    paramzrg.a((short)this.e.d);
    paramzrg.b(paramLong + 8L);
    paramzrg.a(paramzcaa.a);
    paramzrg.a(paramzcaa.b);
    paramzrg.b(paramLong + 20L);
    int j = paramzcaa.e.a();
    for (int k = 0; k < j; k++) {
      paramzrg.a(paramzcaa.e.b(k) + paramInt);
    }
    paramzrg.b(i);
  }
  
  private void g(zrg paramzrg)
    throws Exception
  {
    zacx localzacx = new zacx();
    ColumnCollection localColumnCollection = this.b.getColumns();
    for (int i = 0; i < localColumnCollection.getCount(); i++)
    {
      Column localColumn = localColumnCollection.getColumnByIndex(i);
      localzacx.a((byte)localColumn.getIndex());
    }
    localzacx.a(paramzrg);
    if (this.b.getColumns().b)
    {
      zbrh localzbrh = new zbrh(this.b.getColumns().b(), zlp.a(this.d));
      localzbrh.a(paramzrg);
    }
  }
  
  private void h(zrg paramzrg)
    throws Exception
  {
    if (this.b.o().getCount() > 0) {
      if (this.b.o().getCount() <= 1024)
      {
        zapb localzapb1 = new zapb(this.b.o());
        localzapb1.a(paramzrg);
      }
      else
      {
        int i = 0;
        int j = 1024;
        while (i < this.b.o().getCount())
        {
          zapb localzapb2 = new zapb(this.b.o(), i, j);
          localzapb2.a(paramzrg);
          i = j;
          if (j + 1024 < this.b.o().getCount()) {
            j += 1024;
          } else {
            j = this.b.o().getCount();
          }
        }
      }
    }
  }
  
  private void i(zrg paramzrg)
    throws Exception
  {
    if (this.a.r == null) {
      return;
    }
    ConditionalFormattingCollection localConditionalFormattingCollection = this.a.r;
    int i = localConditionalFormattingCollection.getCount();
    if (i < 1) {
      return;
    }
    CopyOptions localCopyOptions = new CopyOptions(0, localConditionalFormattingCollection.a, localConditionalFormattingCollection.a);
    int j = 1026;
    int i1;
    int i2;
    for (int k = 0; k < i; k++)
    {
      FormatConditionCollection localFormatConditionCollection1 = localConditionalFormattingCollection.get(k);
      int n = localFormatConditionCollection1.getRangeCount();
      if (n > j)
      {
        i1 = j;
        while (i1 < n)
        {
          i2 = n - i1;
          if (i2 > j) {
            i2 = j;
          }
          FormatConditionCollection localFormatConditionCollection2 = new FormatConditionCollection(localConditionalFormattingCollection);
          localFormatConditionCollection2.b(localFormatConditionCollection1, localCopyOptions);
          if (i1 + i2 < n) {
            zf.a(localFormatConditionCollection2.b, i1 + i2, n - (i1 + i2));
          }
          zf.a(localFormatConditionCollection2.b, 0, i1);
          localConditionalFormattingCollection.a(localFormatConditionCollection2);
          i1 += i2;
        }
        zf.a(localFormatConditionCollection1.b, j, n - j);
      }
    }
    i = localConditionalFormattingCollection.getCount();
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    for (int m = 0; m < i; m++)
    {
      localObject1 = localConditionalFormattingCollection.get(m);
      i1 = 0;
      i2 = localArrayList.size();
      int i3 = ((FormatConditionCollection)localObject1).getCount();
      for (int i4 = 0; i4 < i3; i4++)
      {
        zzt localzzt1 = new zzt(m, ((FormatConditionCollection)localObject1).get(i4), i1);
        if (i4 == 0) {
          zf.a(localArrayList, localzzt1);
        } else if (localzzt1.a.getPriority() < ((zzt)localArrayList.get(i2 + i4 - 1)).a.getPriority()) {
          localArrayList.add(i2 + i4 - 1, localzzt1);
        } else {
          zf.a(localArrayList, localzzt1);
        }
        if (localzzt1.a()) {
          i1++;
        }
      }
      Object localObject2;
      int i5;
      if (i1 < 1)
      {
        localObject2 = new znh();
        ((znh)localObject2).a((FormatConditionCollection)localObject1, ((FormatConditionCollection)localObject1).getCount(), m);
        ((znh)localObject2).a(paramzrg);
        for (i5 = 0; i5 < i3; i5++)
        {
          zfb localzfb2 = new zfb();
          localzfb2.a((zzt)localArrayList.get(i2 + i5));
          localzfb2.a(paramzrg);
        }
        for (i5 = localArrayList.size() - 1; i5 >= i2; i5--) {
          localArrayList.remove(i5);
        }
      }
      else
      {
        localObject2 = new zni();
        ((zni)localObject2).a((FormatConditionCollection)localObject1, i1, m);
        ((zni)localObject2).a(paramzrg);
        i5 = 1;
        for (int i6 = 0; i6 < i3; i6++)
        {
          zzt localzzt2 = (zzt)localArrayList.get(i2 + i6);
          if (localzzt2.a())
          {
            zfd localzfd = new zfd();
            localzfd.a(localzzt2);
            localzfd.a(paramzrg);
            if ((i5 != 0) && (localzzt2.b())) {
              i5 = 0;
            }
          }
          else
          {
            i5 = 0;
          }
        }
        if (i5 != 0) {
          for (i6 = localArrayList.size() - 1; i6 >= i2; i6--) {
            localArrayList.remove(i6);
          }
        }
      }
    }
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (zzt)localIterator.next();
      zfc localzfc = new zfc();
      if (((zzt)localObject1).a())
      {
        localzfc.a((zzt)localObject1);
        localzfc.a(paramzrg);
      }
      else
      {
        localzfc.a(((zzt)localObject1).e);
        localzfc.a(paramzrg);
        zfb localzfb1 = new zfb();
        localzfb1.a((zzt)localObject1);
        localzfb1.a(paramzrg);
      }
    }
  }
  
  private void j(zrg paramzrg)
    throws Exception
  {
    if ((this.a.g == null) || (this.a.g.getCount() == 0)) {
      return;
    }
    for (int i = 0; i < this.a.getHyperlinks().getCount(); i++)
    {
      Hyperlink localHyperlink = this.a.getHyperlinks().get(i);
      if (!zw.b(localHyperlink.getAddress()))
      {
        zaex localzaex = new zaex(localHyperlink.getArea(), localHyperlink.b, localHyperlink.getAddress(), localHyperlink);
        localzaex.a(paramzrg);
        if (!zw.b(localHyperlink.getScreenTip()))
        {
          zbas localzbas = new zbas();
          localzbas.a(localHyperlink.getArea(), localHyperlink.getScreenTip());
          localzbas.a(paramzrg);
        }
      }
    }
  }
  
  private void k(zrg paramzrg)
    throws Exception
  {
    if (!this.a.hasAutofilter()) {
      return;
    }
    if (this.a.getAutoFilter().e()) {
      paramzrg.a(155);
    }
    paramzrg.c(157);
    paramzrg.c(2);
    paramzrg.b(this.a.getAutoFilter().g());
    if ((this.a.getAutoFilter().c != null) && (this.a.getAutoFilter().c.getCount() > 0))
    {
      if (this.a.getAutoFilter().b) {
        this.a.getAutoFilter().refresh();
      }
      FilterColumnCollection localFilterColumnCollection = this.a.getAutoFilter().c;
      for (int i = 0; i < localFilterColumnCollection.getCount(); i++)
      {
        FilterColumn localFilterColumn = localFilterColumnCollection.getByIndex(i);
        if (localFilterColumn != null)
        {
          zbk localzbk = new zbk();
          localzbk.a(localFilterColumn);
          localzbk.a(paramzrg);
        }
      }
    }
    a(this.a.getAutoFilter().c(), paramzrg);
  }
  
  private void a(DataSorter paramDataSorter, zrg paramzrg)
    throws Exception
  {
    if ((paramDataSorter != null) && (paramDataSorter.a().size() > 0))
    {
      CellArea localCellArea1 = paramDataSorter.b();
      zbqk localzbqk = new zbqk();
      localzbqk.a(paramDataSorter, localCellArea1);
      localzbqk.a(paramzrg);
      Iterator localIterator = paramDataSorter.a().iterator();
      while (localIterator.hasNext())
      {
        zrr localzrr = (zrr)localIterator.next();
        zbqj localzbqj = new zbqj();
        CellArea localCellArea2 = new CellArea();
        if (paramDataSorter.getSortLeftToRight())
        {
          localCellArea2.StartRow = localzrr.c();
          localCellArea2.EndRow = localzrr.c();
          localCellArea2.StartColumn = localCellArea1.StartColumn;
          localCellArea2.EndColumn = localCellArea1.EndColumn;
        }
        else
        {
          localCellArea2.StartRow = localCellArea1.StartRow;
          localCellArea2.EndRow = localCellArea1.EndRow;
          localCellArea2.StartColumn = localzrr.c();
          localCellArea2.EndColumn = localzrr.c();
        }
        localzbqj.a(localzrr, localCellArea2);
        localzbqj.a(paramzrg);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */