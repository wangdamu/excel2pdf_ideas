package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zcin
  extends zcfo
{
  private zpt c;
  private Workbook d;
  private WorksheetCollection e;
  
  zcin(zpt paramzpt)
  {
    this.c = paramzpt;
    this.d = paramzpt.a;
    this.e = this.d.getWorksheets();
  }
  
  void d()
    throws Exception
  {
    zche localzche1 = new zche(131);
    localzche1.a(this.b);
    zcgc localzcgc = new zcgc();
    localzcgc.a(this.b);
    WriteProtection localWriteProtection = this.d.getSettings().q;
    if ((localWriteProtection != null) && (localWriteProtection.b()))
    {
      if ((localWriteProtection.b != null) && (localWriteProtection.a().a != null))
      {
        localObject = new zei(localWriteProtection);
        ((zche)localObject).a(this.b);
      }
      localObject = new zej(localWriteProtection);
      ((zej)localObject).a(this.b);
    }
    Object localObject = new zcik();
    ((zcik)localObject).a(this.d);
    ((zcik)localObject).a(this.b);
    k();
    j();
    h();
    i();
    e();
    l();
    zeh localzeh = new zeh(this.d.getSettings());
    localzeh.a(this.b);
    m();
    g();
    f();
    zche localzche2 = new zche(132);
    localzche2.a(this.b);
  }
  
  private void e()
    throws Exception
  {
    zok localzok = this.e.m();
    if ((localzok == null) || (localzok.getCount() == 0)) {
      return;
    }
    Iterator localIterator = localzok.iterator();
    while (localIterator.hasNext())
    {
      zoj localzoj = (zoj)localIterator.next();
      zet localzet = new zet(localzoj);
      localzet.a(this.b);
    }
  }
  
  private void f()
    throws Exception
  {
    HashMap localHashMap = this.c.e.a;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localHashMap.values().iterator();
    Object localObject1;
    while (localIterator.hasNext())
    {
      localObject1 = (zrl)localIterator.next();
      if (((zrl)localObject1).c.equals("http://schemas.microsoft.com/office/2007/relationships/slicerCache")) {
        zf.a(localArrayList, localObject1);
      }
    }
    int i = localArrayList.size();
    if (i > 0)
    {
      localObject1 = new zcdk();
      ((zcdk)localObject1).a(this.b);
      zche localzche1 = new zche(1070);
      localzche1.a(this.b);
      for (int j = 0; j < i; j++)
      {
        localObject2 = (zrl)localArrayList.get(j);
        zcdb localzcdb = new zcdb(((zrl)localObject2).b);
        localzcdb.a(this.b);
        zche localzche3 = new zche(1073);
        localzche3.a(this.b);
      }
      zche localzche2 = new zche(1071);
      localzche2.a(this.b);
      Object localObject2 = new zche(36);
      ((zche)localObject2).a(this.b);
    }
  }
  
  private void a(int paramInt, String paramString)
    throws Exception
  {
    zccv localzccv = new zccv(paramInt, paramString);
    localzccv.a(this.b);
    zche localzche = new zche(387);
    localzche.a(this.b);
  }
  
  private void g()
    throws Exception
  {
    ArrayList localArrayList = this.c.h;
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return;
    }
    zche localzche1 = new zche(384);
    localzche1.a(this.b);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zri localzri = (zri)localArrayList.get(i);
      a(localzri.b.b, localzri.c);
    }
    zche localzche2 = new zche(385);
    localzche2.a(this.b);
  }
  
  private void h()
    throws Exception
  {
    zche localzche1 = new zche(135);
    localzche1.a(this.b);
    zcbx localzcbx = new zcbx();
    localzcbx.a(this.d);
    localzcbx.a(this.b);
    zche localzche2 = new zche(136);
    localzche2.a(this.b);
  }
  
  private void i()
    throws Exception
  {
    zche localzche1 = new zche(143);
    localzche1.a(this.b);
    for (int i = 0; i < this.c.c.size(); i++)
    {
      zpu localzpu = (zpu)this.c.c.get(i);
      zceo localzceo = new zceo();
      localzceo.a(localzpu, localzpu.a.getTabId());
      localzceo.a(this.b);
    }
    zche localzche2 = new zche(144);
    localzche2.a(this.b);
  }
  
  private void j()
    throws Exception
  {
    if (!this.d.getWorksheets().F()) {
      return;
    }
    zcil localzcil = new zcil(this.d.getWorksheets().D());
    localzcil.a(this.b);
  }
  
  private void k()
    throws Exception
  {
    if (zw.b(this.d.getAbsolutePath())) {
      return;
    }
    zche.a(37, new byte[] { 1, 0, 3, 15, 0, Byte.MIN_VALUE }, this.b);
    zche.a(2071, this.d.getAbsolutePath(), this.b);
    zche.a(38, this.b);
  }
  
  private void l()
    throws Exception
  {
    zche localzche1 = new zche(353);
    localzche1.a(this.b);
    zbth localzbth = this.e.w();
    for (int i = 0; i < localzbth.getCount(); i++)
    {
      localObject = localzbth.a(i);
      switch (((zbti)localObject).a())
      {
      case 1: 
        zche localzche2 = new zche(357);
        localzche2.a(this.b);
        break;
      case 5: 
        zche localzche3 = new zche(358);
        localzche3.a(this.b);
        ArrayList localArrayList1 = ((zbti)localObject).b();
        if (localArrayList1.size() != 0) {
          a(localArrayList1);
        }
        break;
      case 2: 
        zche localzche4 = new zche(667);
        localzche4.a(this.b);
        ArrayList localArrayList2 = ((zbti)localObject).b();
        if (localArrayList2.size() != 0) {
          a(localArrayList2);
        }
        break;
      case 0: 
        a(i);
        break;
      case 4: 
        a(i);
      }
    }
    zcdj localzcdj = new zcdj(this.e);
    localzcdj.a(this.b);
    Object localObject = new zche(354);
    ((zche)localObject).a(this.b);
  }
  
  private void a(ArrayList paramArrayList)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zwh localzwh = (zwh)paramArrayList.get(i);
      zcgz localzcgz = new zcgz(localzwh);
      localzcgz.a(this.b);
    }
  }
  
  private void a(int paramInt)
    throws Exception
  {
    if (this.c.u.size() > 0)
    {
      zbth localzbth = this.c.a.getWorksheets().w();
      zrl localzrl = (zrl)this.c.u.get(Integer.valueOf(paramInt));
      if (localzrl != null)
      {
        zchw localzchw = new zchw(localzrl.b);
        localzchw.a(this.b);
      }
    }
  }
  
  private void m()
    throws Exception
  {
    NameCollection localNameCollection = this.d.getWorksheets().getNames();
    Iterator localIterator = localNameCollection.iterator();
    while (localIterator.hasNext())
    {
      Name localName = (Name)localIterator.next();
      zcgp localzcgp = new zcgp();
      localzcgp.a(localName);
      localzcgp.a(this.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */