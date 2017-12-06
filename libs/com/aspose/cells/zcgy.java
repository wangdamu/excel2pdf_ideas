package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import java.util.ArrayList;
import java.util.Iterator;

class zcgy
  extends zcfo
{
  private PivotTable c;
  private int d;
  
  zcgy(PivotTable paramPivotTable, int paramInt)
  {
    this.c = paramPivotTable;
    this.d = paramInt;
  }
  
  void d()
    throws Exception
  {
    this.c.a.a.getWorkbook().i();
    zcbq localzcbq = new zcbq(this.c, this.d);
    localzcbq.a(this.b);
    zcbm localzcbm = new zcbm(this.c);
    localzcbm.a(this.b);
    zche localzche1 = new zche(313);
    localzche1.a(this.b);
    l(this.b);
    a(this.b);
    b(this.b);
    m(this.b);
    c(this.b);
    e(this.b);
    d(this.b);
    f(this.b);
    g(this.b);
    h(this.b);
    i(this.b);
    j(this.b);
    zche localzche2 = new zche(315);
    localzche2.a(this.b);
  }
  
  void a(zh paramzh)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.c.getRowFields();
    if (localPivotFieldCollection.getCount() == 0) {
      return;
    }
    zcbc localzcbc = new zcbc(309, localPivotFieldCollection);
    localzcbc.a(paramzh);
    zche localzche = new zche(310);
    localzche.a(paramzh);
  }
  
  void b(zh paramzh)
    throws Exception
  {
    ArrayList localArrayList = this.c.g;
    if (localArrayList == null) {
      return;
    }
    int i = localArrayList.size();
    if (i == 0) {
      return;
    }
    zche localzche1 = new zche(299, i);
    localzche1.a(paramzh);
    for (int j = 0; j < i; j++)
    {
      int[] arrayOfInt = (int[])localArrayList.get(j);
      a(paramzh, arrayOfInt);
    }
    zche localzche2 = new zche(300);
    localzche2.a(paramzh);
  }
  
  private void a(zh paramzh, int[] paramArrayOfInt)
    throws Exception
  {
    zcbl localzcbl = new zcbl(paramArrayOfInt);
    localzcbl.a(paramzh);
    if ((paramArrayOfInt.length != 4) || (paramArrayOfInt[2] - paramArrayOfInt[0] != 0))
    {
      localObject = new zcbd(paramArrayOfInt);
      ((zcbd)localObject).a(paramzh);
      zche localzche = new zche(389);
      localzche.a(paramzh);
    }
    Object localObject = new zche(298);
    ((zche)localObject).a(paramzh);
  }
  
  private void m(zh paramzh)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.c.getColumnFields();
    if (localPivotFieldCollection.getCount() == 0) {
      return;
    }
    zcbc localzcbc = new zcbc(311, localPivotFieldCollection);
    localzcbc.a(paramzh);
    zche localzche = new zche(312);
    localzche.a(paramzh);
  }
  
  void c(zh paramzh)
    throws Exception
  {
    ArrayList localArrayList = this.c.h;
    if (localArrayList == null) {
      return;
    }
    int i = localArrayList.size();
    if (i == 0) {
      return;
    }
    zche localzche1 = new zche(301, i);
    localzche1.a(paramzh);
    for (int j = 0; j < i; j++)
    {
      int[] arrayOfInt = (int[])localArrayList.get(j);
      a(paramzh, arrayOfInt);
    }
    zche localzche2 = new zche(302);
    localzche2.a(paramzh);
  }
  
  void d(zh paramzh)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.c.getDataFields();
    int i = localPivotFieldCollection.getCount();
    if (i == 0) {
      return;
    }
    zche localzche1 = new zche(295, i);
    localzche1.a(paramzh);
    for (int j = 0; j < i; j++)
    {
      PivotField localPivotField = localPivotFieldCollection.get(j);
      zcbk localzcbk = new zcbk(localPivotField);
      localzcbk.a(paramzh);
      zche localzche3 = new zche(294);
      localzche3.a(paramzh);
    }
    zche localzche2 = new zche(296);
    localzche2.a(paramzh);
  }
  
  void e(zh paramzh)
    throws Exception
  {
    PivotFieldCollection localPivotFieldCollection = this.c.getPageFields();
    int i = localPivotFieldCollection.getCount();
    if (i == 0) {
      return;
    }
    zche localzche1 = new zche(291, i);
    localzche1.a(paramzh);
    for (int j = 0; j < i; j++)
    {
      PivotField localPivotField = localPivotFieldCollection.get(j);
      zcbn localzcbn = new zcbn(localPivotField);
      localzcbn.a(paramzh);
      zche localzche3 = new zche(290);
      localzche3.a(paramzh);
    }
    zche localzche2 = new zche(292);
    localzche2.a(paramzh);
  }
  
  void f(zh paramzh)
    throws Exception
  {
    zbuc localzbuc = this.c.ag;
    if ((localzbuc == null) || (0 == localzbuc.getCount())) {
      return;
    }
    zche localzche = null;
    localzche = new zche(305, localzbuc.getCount());
    localzche.a(paramzh);
    zbub localzbub = null;
    zcda localzcda = null;
    for (int i = 0; i < localzbuc.getCount(); i++)
    {
      localzbub = localzbuc.a(i);
      if (localzbub.c != null)
      {
        localzcda = new zcda(localzbub);
        localzcda.a(paramzh);
        b(localzbub.c, paramzh);
        localzche = new zche(304);
        localzche.a(paramzh);
      }
    }
    localzche = new zche(306);
    localzche.a(paramzh);
  }
  
  void g(zh paramzh)
    throws Exception
  {
    PivotFormatConditionCollection localPivotFormatConditionCollection = this.c.getPivotFormatConditions();
    if ((null == localPivotFormatConditionCollection) || (0 == localPivotFormatConditionCollection.getCount())) {
      return;
    }
    int i = zaxj.a(localPivotFormatConditionCollection);
    int j = localPivotFormatConditionCollection.getCount();
    int k = j - i;
    if (k < 1) {
      return;
    }
    zche localzche = null;
    localzche = new zche(560, k);
    localzche.a(paramzh);
    PivotFormatCondition localPivotFormatCondition = null;
    zccy localzccy = null;
    for (int m = 0; m < localPivotFormatConditionCollection.getCount(); m++)
    {
      localPivotFormatCondition = localPivotFormatConditionCollection.get(m);
      FormatConditionCollection localFormatConditionCollection = localPivotFormatCondition.a();
      if ((localFormatConditionCollection != null) && (!localFormatConditionCollection.a(false)))
      {
        localzccy = new zccy(localPivotFormatCondition);
        localzccy.a(paramzh);
        if ((localPivotFormatCondition.b != null) && (0 != localPivotFormatCondition.b.size()))
        {
          localzche = new zche(641, localPivotFormatCondition.b.size());
          localzche.a(paramzh);
          for (int n = 0; n < localPivotFormatCondition.b.size(); n++) {
            if ((zbur)localPivotFormatCondition.b.get(n) != null) {
              b((zbur)localPivotFormatCondition.b.get(n), paramzh);
            }
          }
          localzche = new zche(642);
          localzche.a(paramzh);
          localzche = new zche(559);
          localzche.a(paramzh);
        }
      }
    }
    localzche = new zche(561);
    localzche.a(paramzh);
  }
  
  void h(zh paramzh)
    throws Exception
  {
    zcei localzcei = new zcei(this.c);
    localzcei.a(paramzh);
  }
  
  void i(zh paramzh)
    throws Exception
  {
    if ((this.c.getPivotFilters() == null) || (this.c.getPivotFilters().getCount() == 0)) {
      return;
    }
    zche localzche1 = new zche(599, this.c.getPivotFilters().getCount());
    localzche1.a(paramzh);
    for (int i = 0; i < this.c.getPivotFilters().getCount(); i++)
    {
      PivotFilter localPivotFilter = this.c.getPivotFilters().get(i);
      zccz localzccz = new zccz(localPivotFilter);
      localzccz.a(paramzh);
      if (localPivotFilter.getAutoFilter() != null) {
        zcip.a(localPivotFilter.getAutoFilter(), paramzh);
      }
      zche localzche3 = new zche(602);
      localzche3.a(paramzh);
    }
    zche localzche2 = new zche(600);
    localzche2.a(paramzh);
  }
  
  void j(zh paramzh)
    throws Exception
  {
    zcdk localzcdk = new zcdk();
    localzcdk.a(paramzh);
    zcdf localzcdf = new zcdf(this.c);
    localzcdf.a(paramzh);
    k(paramzh);
    zche localzche1 = new zche(1063);
    localzche1.a(paramzh);
    zche localzche2 = new zche(36);
    localzche2.a(paramzh);
  }
  
  void k(zh paramzh)
    throws Exception
  {
    PivotFormatConditionCollection localPivotFormatConditionCollection = this.c.getPivotFormatConditions();
    if ((null == localPivotFormatConditionCollection) || (0 == localPivotFormatConditionCollection.getCount())) {
      return;
    }
    int i = zaxj.a(localPivotFormatConditionCollection);
    if (i < 1) {
      return;
    }
    zche localzche = null;
    zccw localzccw = new zccw(i);
    localzccw.a(paramzh);
    PivotFormatCondition localPivotFormatCondition = null;
    zccx localzccx = null;
    zcde localzcde = null;
    for (int j = 0; j < localPivotFormatConditionCollection.getCount(); j++)
    {
      localPivotFormatCondition = localPivotFormatConditionCollection.get(j);
      FormatConditionCollection localFormatConditionCollection = localPivotFormatCondition.a();
      if ((localFormatConditionCollection != null) && (localFormatConditionCollection.a(true)))
      {
        localzccx = new zccx(localPivotFormatCondition);
        localzccx.a(paramzh);
        if ((localPivotFormatCondition.b != null) && (0 != localPivotFormatCondition.b.size()))
        {
          localzcde = new zcde(localPivotFormatCondition.b.size());
          localzcde.a(paramzh);
          for (int k = 0; k < localPivotFormatCondition.b.size(); k++) {
            if ((zbur)localPivotFormatCondition.b.get(k) != null) {
              a((zbur)localPivotFormatCondition.b.get(k), paramzh);
            }
          }
          localzche = new zche(1160);
          localzche.a(paramzh);
          localzche = new zche(1148);
          localzche.a(paramzh);
        }
      }
    }
    localzche = new zche(1150);
    localzche.a(paramzh);
  }
  
  void a(zbur paramzbur, zh paramzh)
    throws Exception
  {
    zccs localzccs = new zccs(paramzbur);
    localzccs.a(paramzh);
    if ((paramzbur.e != null) && (paramzbur.e.size() > 0))
    {
      localObject = new zccq(paramzbur.e.size());
      ((zccq)localObject).a(paramzh);
      zcco localzcco = null;
      zche localzche1 = null;
      zche localzche2 = null;
      zccm localzccm = null;
      zbtz localzbtz = null;
      ArrayList localArrayList = null;
      for (int i = 0; i < paramzbur.e.size(); i++)
      {
        localzbtz = (zbtz)paramzbur.e.get(i);
        localzcco = new zcco(localzbtz);
        localzcco.a(paramzh);
        localArrayList = localzbtz.c;
        for (int j = 0; j < localArrayList.size(); j++)
        {
          localzccm = new zccm(((Integer)localArrayList.get(j)).intValue());
          localzccm.a(paramzh);
          localzche2 = new zche(1168);
          localzche2.a(paramzh);
        }
        localzche1 = new zche(1166);
        localzche1.a(paramzh);
      }
      zche localzche3 = new zche(1164);
      localzche3.a(paramzh);
    }
    Object localObject = new zche(1162);
    ((zche)localObject).a(paramzh);
  }
  
  void b(zbur paramzbur, zh paramzh)
    throws Exception
  {
    zcct localzcct = new zcct(paramzbur);
    localzcct.a(paramzh);
    if ((paramzbur.e != null) && (paramzbur.e.size() > 0))
    {
      localObject = new zccr(paramzbur);
      ((zccr)localObject).a(paramzh);
      zccp localzccp = null;
      zche localzche1 = null;
      zche localzche2 = null;
      zccn localzccn = null;
      zbtz localzbtz = null;
      ArrayList localArrayList = null;
      for (int i = 0; i < paramzbur.e.size(); i++)
      {
        localzbtz = (zbtz)paramzbur.e.get(i);
        localzccp = new zccp(localzbtz);
        localzccp.a(paramzh);
        localArrayList = localzbtz.c;
        for (int j = 0; j < localArrayList.size(); j++)
        {
          localzccn = new zccn(((Integer)localArrayList.get(j)).intValue());
          localzccn.a(paramzh);
          localzche2 = new zche(383);
          localzche2.a(paramzh);
        }
        localzche1 = new zche(252);
        localzche1.a(paramzh);
      }
      zche localzche3 = new zche(250);
      localzche3.a(paramzh);
    }
    Object localObject = new zche(248);
    ((zche)localObject).a(paramzh);
  }
  
  void l(zh paramzh)
    throws Exception
  {
    zche localzche1 = new zche(287, this.c.getBaseFields().getCount());
    localzche1.a(paramzh);
    Object localObject = this.c.getBaseFields().a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      PivotField localPivotField = (PivotField)((Iterator)localObject).next();
      zcbp localzcbp = new zcbp(localPivotField);
      localzcbp.a(paramzh);
      c(localPivotField, paramzh);
      b(localPivotField, paramzh);
      a(localPivotField, paramzh);
      zche localzche2 = new zche(286);
      localzche2.a(paramzh);
    }
    localObject = new zche(288);
    ((zche)localObject).a(paramzh);
  }
  
  void a(PivotField paramPivotField, zh paramzh)
    throws Exception
  {
    if (!paramPivotField.isRepeatItemLabels()) {
      return;
    }
    zcdk localzcdk = new zcdk();
    localzcdk.a(paramzh);
    zceg localzceg = new zceg(paramPivotField);
    localzceg.a(paramzh);
    zche localzche = new zche(36);
    localzche.a(paramzh);
  }
  
  void b(PivotField paramPivotField, zh paramzh)
    throws Exception
  {
    if (paramPivotField.f == null) {
      return;
    }
    zbur localzbur = paramPivotField.f;
    zche localzche1 = new zche(459);
    localzche1.a(paramzh);
    if (null != localzbur) {
      b(localzbur, paramzh);
    }
    zche localzche2 = new zche(460);
    localzche2.a(paramzh);
  }
  
  void c(PivotField paramPivotField, zh paramzh)
    throws Exception
  {
    if ((paramPivotField.e == null) || (paramPivotField.e.getCount() == 0)) {
      return;
    }
    int i = a(paramPivotField);
    zche localzche1 = new zche(283, i);
    localzche1.a(paramzh);
    int j = 0;
    if (paramPivotField.isAutoSubtotals()) {
      j = i - 1;
    } else {
      j = i;
    }
    j = Math.min(j, paramPivotField.e.getCount());
    Object localObject;
    for (int k = 0; k < j; k++)
    {
      localObject = paramPivotField.e.get(k);
      if (((PivotItem)localObject).getIndex() != -1)
      {
        zcbo localzcbo2 = new zcbo((PivotItem)localObject);
        localzcbo2.a(paramzh);
        zche localzche3 = new zche(281);
        localzche3.a(paramzh);
      }
    }
    if (paramPivotField.isAutoSubtotals())
    {
      zcbo localzcbo1 = new zcbo(paramPivotField.isAutoSubtotals());
      localzcbo1.a(paramzh);
      localObject = new zche(281);
      ((zche)localObject).a(paramzh);
    }
    else if (!paramPivotField.getSubtotals(0))
    {
      int m = paramPivotField.c.a;
      for (int n = 1; n < 14; n++) {
        if (((m & 0xFFFF) >> n & 0x1) != 0)
        {
          int i1 = 1 << n;
          byte b = zcij.H(i1);
          zcbo localzcbo3 = new zcbo(b);
          localzcbo3.a(paramzh);
          zche localzche4 = new zche(281);
          localzche4.a(paramzh);
        }
      }
    }
    zche localzche2 = new zche(284);
    localzche2.a(paramzh);
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
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */