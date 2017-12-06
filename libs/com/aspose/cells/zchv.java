package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

class zchv
  extends zcfo
{
  private zpt c;
  private Workbook d;
  
  zchv(zpt paramzpt)
  {
    this.c = paramzpt;
    this.d = paramzpt.a;
  }
  
  void d()
    throws Exception
  {
    zche localzche1 = new zche(278);
    localzche1.a(this.b);
    g();
    h();
    a(this.c.d);
    b(this.c.d);
    c(this.c.d);
    d(this.c.d);
    e(this.c.d);
    i();
    f();
    e();
    zche localzche2 = new zche(279);
    localzche2.a(this.b);
  }
  
  private void e()
    throws Exception
  {
    zche localzche1 = new zche(473);
    localzche1.a(this.b);
    zche localzche2 = new zche(565);
    localzche2.a(this.b);
    for (int i = 0; i < 64; i++)
    {
      localObject = this.d.getWorksheets().o().e(i);
      zcdl localzcdl = new zcdl(((Color)localObject).getA(), ((Color)localObject).getR(), ((Color)localObject).getG(), ((Color)localObject).getB());
      localzcdl.a(this.b);
    }
    zche localzche3 = new zche(566);
    localzche3.a(this.b);
    Object localObject = new zche(474);
    ((zche)localObject).a(this.b);
  }
  
  private void f()
    throws Exception
  {
    TableStyleCollection localTableStyleCollection = this.d.getWorksheets().Z();
    if (localTableStyleCollection == null) {
      return;
    }
    int i = localTableStyleCollection.getCount();
    zcbu localzcbu = new zcbu(localTableStyleCollection);
    localzcbu.a(this.b);
    for (int j = 0; j < i; j++)
    {
      TableStyle localTableStyle = localTableStyleCollection.get(j);
      a(localTableStyle);
    }
    zche localzche = new zche(509);
    localzche.a(this.b);
  }
  
  private void a(TableStyle paramTableStyle)
    throws Exception
  {
    zcbt localzcbt = new zcbt(paramTableStyle);
    localzcbt.a(this.b);
    int i = paramTableStyle.getTableStyleElements().getCount();
    for (int j = 0; j < i; j++)
    {
      TableStyleElement localTableStyleElement = paramTableStyle.getTableStyleElements().get(j);
      zcif localzcif = new zcif(localTableStyleElement);
      localzcif.a(this.b);
    }
    zche localzche = new zche(511);
    localzche.a(this.b);
  }
  
  private void g()
    throws Exception
  {
    ArrayList localArrayList = this.d.getWorksheets().B();
    if (localArrayList.size() == 0) {
      return;
    }
    zche localzche1 = new zche(615, localArrayList.size());
    localzche1.a(this.b);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zzw localzzw = (zzw)localArrayList.get(i);
      zcgf localzcgf = new zcgf();
      localzcgf.a(localzzw.b(), localzzw.a());
      localzcgf.a(this.b);
    }
    zche localzche2 = new zche(616);
    localzche2.a(this.b);
  }
  
  private void h()
    throws Exception
  {
    ArrayList localArrayList = this.d.getWorksheets().A();
    if (localArrayList.size() == 0) {
      return;
    }
    zche localzche = new zche(611, localArrayList.size());
    localzche.a(this.b);
    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      Font localFont = (Font)((Iterator)localObject).next();
      zcgg localzcgg = new zcgg();
      localzcgg.a(localFont, this.d);
      localzcgg.a(this.b);
    }
    localObject = new zche(612);
    ((zche)localObject).a(this.b);
  }
  
  private void a(zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.a;
    if (localArrayList.size() == 0) {
      return;
    }
    zche localzche = new zche(603, localArrayList.size());
    localzche.a(this.b);
    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zpv localzpv = (zpv)((Iterator)localObject).next();
      zcgd localzcgd = new zcgd(this.d);
      localzcgd.a(localzpv);
      localzcgd.a(this.b);
    }
    localObject = new zche(604);
    ((zche)localObject).a(this.b);
  }
  
  private void b(zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.b;
    if (localArrayList.size() == 0) {
      return;
    }
    zche localzche = new zche(613, localArrayList.size());
    localzche.a(this.b);
    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zow localzow = (zow)((Iterator)localObject).next();
      zcby localzcby = new zcby(this.d);
      localzcby.a(localzow);
      localzcby.a(this.b);
    }
    localObject = new zche(614);
    ((zche)localObject).a(this.b);
  }
  
  private void c(zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.c;
    if (localArrayList.size() == 0) {
      return;
    }
    zche localzche1 = new zche(626, localArrayList.size());
    localzche1.a(this.b);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrv localzrv = (zrv)localArrayList.get(i);
      zcit localzcit = new zcit();
      localzcit.a(localzrv);
      localzcit.a(this.b);
    }
    zche localzche2 = new zche(627);
    localzche2.a(this.b);
  }
  
  private void d(zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.d;
    if (localArrayList.size() == 0) {
      return;
    }
    zche localzche1 = new zche(617, localArrayList.size());
    localzche1.a(this.b);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zrv localzrv = (zrv)localArrayList.get(i);
      zcit localzcit = new zcit();
      localzcit.a(localzrv);
      localzcit.a(this.b);
    }
    zche localzche2 = new zche(618);
    localzche2.a(this.b);
  }
  
  private void e(zpo paramzpo)
    throws Exception
  {
    ArrayList localArrayList = paramzpo.e;
    if (localArrayList.size() == 0) {
      return;
    }
    zche localzche1 = new zche(619, localArrayList.size());
    localzche1.a(this.b);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zoz localzoz = (zoz)localArrayList.get(i);
      zcht localzcht = new zcht();
      localzcht.a(localzoz);
      localzcht.a(this.b);
    }
    zche localzche2 = new zche(620);
    localzche2.a(this.b);
  }
  
  private void i()
    throws Exception
  {
    DxfCollection localDxfCollection = this.d.getWorksheets().getDxfs();
    int i = localDxfCollection.getCount();
    if (i == 0) {
      return;
    }
    zche localzche1 = new zche(505, i);
    localzche1.a(this.b);
    for (int j = 0; j < localDxfCollection.getCount(); j++)
    {
      Style localStyle = localDxfCollection.get(j);
      zcfm localzcfm = new zcfm();
      localzcfm.a(localStyle, false, this.d);
      localzcfm.a(this.b);
    }
    zche localzche2 = new zche(506);
    localzche2.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */