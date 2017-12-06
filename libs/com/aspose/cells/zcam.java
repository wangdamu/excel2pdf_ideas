package com.aspose.cells;

import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import java.util.Iterator;

class zcam
  implements zj
{
  private Workbook a;
  private WorksheetCollection b;
  private zcac c;
  private zcaa[] d;
  private int e;
  private SaveOptions f;
  private zsd g;
  private zfk[] h;
  
  public void a()
  {
    dispose();
  }
  
  public void dispose()
  {
    this.d = null;
    this.f = null;
    this.a = null;
    this.b = null;
    this.g = null;
    this.h = null;
    this.c.dispose();
    this.c = null;
    zg.a(this);
  }
  
  public zcam(Workbook paramWorkbook, SaveOptions paramSaveOptions)
    throws Exception
  {
    this.a = paramWorkbook;
    this.b = paramWorkbook.getWorksheets();
    this.f = paramSaveOptions;
    zug.b(this.b);
    zadm localzadm = this.b.a(paramSaveOptions);
    this.c = new zcac(localzadm, paramWorkbook, paramSaveOptions);
    if (this.c.d != null)
    {
      this.b.a(new zbsz(this.c.d));
      this.b.a(new zbsu(this.c.d));
    }
    this.e = this.b.getCount();
    this.d = new zcaa[this.e];
    for (int i = 0; i < this.e; i++)
    {
      Worksheet localWorksheet = this.b.get(i);
      if (localWorksheet.getType() != 2) {
        this.d[i] = new zcaa(this.c, i);
      }
    }
  }
  
  void a(zm paramzm)
    throws Exception
  {
    boolean bool = this.b.h() == null;
    this.a.j();
    if ((this.a.getSettings().d != null) && (this.a.getSettings().d.getOnlyLoadDocumentProperties()))
    {
      b();
      this.b.h().a(paramzm);
      return;
    }
    Object localObject1;
    if (this.c.e != null)
    {
      localObject1 = this.c.e + "_Wb.xls";
      ze localze = zd.a((String)localObject1);
      try
      {
        b(localze);
        this.b.h().a(paramzm);
        a(bool);
      }
      finally
      {
        if (localze != null) {
          localze.a();
        }
      }
      zd.d((String)localObject1);
    }
    else
    {
      localObject1 = new com.aspose.cells.b.a.d.zh();
      b((zm)localObject1);
      this.a.a(this.b.h());
      this.b.h().a(paramzm);
      a(bool);
      ((com.aspose.cells.b.a.d.zh)localObject1).a();
      localObject1 = null;
    }
  }
  
  private void b(zm paramzm)
    throws Exception
  {
    zrg localzrg = new zrg(paramzm);
    Object localObject1 = this.b.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Worksheet)((Iterator)localObject1).next();
      ((Worksheet)localObject2).g();
    }
    if (this.b.h() == null) {
      this.b.a(new zxf(zaej.n));
    }
    if (this.b.k != null) {
      this.b.k.a(this.b.h());
    }
    c();
    a(localzrg);
    this.b.h().a().a("Workbook", paramzm);
    if ((this.b.getXmlMaps().getCount() > 0) && (this.b.h().a().a("XML") == null))
    {
      localObject1 = new com.aspose.cells.b.a.d.zh();
      localObject2 = new zcjz((zm)localObject1, Encoding.getUTF8());
      this.b.getXmlMaps().b("");
      zwa localzwa = new zwa(this.b.p());
      localzwa.a((zcjz)localObject2);
      ((zcjz)localObject2).e();
      this.b.h().a().a("XML", (com.aspose.cells.b.a.d.zh)localObject1);
    }
    Object localObject6;
    Object localObject7;
    Object localObject8;
    if (this.b.X() != null)
    {
      localObject1 = this.b.X();
      if (((zawq)localObject1).getCount() > 0)
      {
        localObject2 = this.b.h().a().b("_SX_DB_CUR");
        if (localObject2 == null)
        {
          localObject2 = new zaoz(com.aspose.cells.b.a.zh.a);
          this.b.h().a().a("_SX_DB_CUR", (zaoz)localObject2);
        }
        int j = ((zaoz)localObject2).b();
        if (this.c.b != null) {
          for (localObject6 : this.c.b)
          {
            localObject7 = new zawy((zri)localObject6);
            localObject8 = new com.aspose.cells.b.a.d.zh();
            ((zawy)localObject7).a((com.aspose.cells.b.a.d.zh)localObject8);
            String str2 = com.aspose.cells.a.c.zp.c(((zri)localObject6).b.b);
            if (!((zaoz)localObject2).a(str2)) {
              ((zaoz)localObject2).a(str2, (com.aspose.cells.b.a.d.zh)localObject8);
            }
          }
        }
      }
    }
    Object localObject3;
    if (this.b.p().getSettings().getShared())
    {
      if ((this.b.m != null) && (this.b.m.getCount() > 0))
      {
        localObject1 = new com.aspose.cells.b.a.d.zh();
        localObject2 = new zrg((zm)localObject1);
        localObject3 = new zcaj(this.a);
        ((zcaj)localObject3).a((zrg)localObject2);
        this.b.h().a().a("Revision Log", (com.aspose.cells.b.a.d.zh)localObject1);
        localObject1 = new com.aspose.cells.b.a.d.zh();
        localObject2 = new zrg((zm)localObject1);
        ??? = new zcai();
        ((zcai)???).a((zrg)localObject2);
        this.b.h().a().b("User Names", localObject1);
      }
      else if (this.b.h().a().a("Revision Log") == null)
      {
        localObject1 = new com.aspose.cells.b.a.d.zh(com.aspose.cells.a.c.zw.a());
        localObject2 = new zxf((zm)localObject1);
        localObject3 = ((zxf)localObject2).a().a("User Names");
        this.b.h().a().b("User Names", localObject3);
        localObject3 = ((zxf)localObject2).a().a("Revision Log");
        this.b.h().a().b("Revision Log", localObject3);
      }
    }
    else {
      this.b.h().a().g("User Names");
    }
    for (int i = 0; i < this.e; i++)
    {
      localObject2 = this.b.get(i);
      if ((((Worksheet)localObject2).v() != null) && (!((Worksheet)localObject2).getOleObjects().a()) && (((Worksheet)localObject2).getOleObjects().getCount() > 0))
      {
        if (this.b.h().a().a("\001CompObj") == null)
        {
          localObject3 = com.aspose.cells.a.c.zw.e();
          ??? = new com.aspose.cells.b.a.d.zh();
          ((com.aspose.cells.b.a.d.zh)???).b((byte[])localObject3, 0, localObject3.length);
          this.b.h().a().a("\001CompObj", (com.aspose.cells.b.a.d.zh)???);
        }
        for (int k = 0; k < ((Worksheet)localObject2).getOleObjects().getCount(); k++)
        {
          ??? = ((Worksheet)localObject2).getOleObjects().get(k);
          if ((!((OleObject)???).a()) && (((OleObject)???).getObjectData() != null))
          {
            String str1 = "MBD" + com.aspose.cells.a.c.zp.d(((OleObject)???).s());
            Object localObject5;
            if (((OleObject)???).l())
            {
              localObject5 = ((OleObject)???).t();
              localObject6 = new zaoz((com.aspose.cells.b.a.zh)localObject5);
              localObject7 = new com.aspose.cells.b.a.d.zh(((OleObject)???).j());
              ((zaoz)localObject6).a("\001Ole10Native", (com.aspose.cells.b.a.d.zh)localObject7);
              this.b.h().a().a(str1, (zaoz)localObject6);
            }
            else if (((OleObject)???).g())
            {
              localObject5 = new zaoz(((OleObject)???).t());
              localObject6 = new com.aspose.cells.b.a.d.zh(((OleObject)???).getObjectData());
              ((zaoz)localObject5).a("Package", (com.aspose.cells.b.a.d.zh)localObject6);
              this.b.h().a().a(str1, (zaoz)localObject5);
            }
            else if (FileFormatUtil.a(((OleObject)???).getObjectData()))
            {
              localObject5 = new com.aspose.cells.b.a.d.zh(((OleObject)???).getObjectData());
              localObject6 = new zxf((zm)localObject5);
              localObject7 = ((zxf)localObject6).a();
              ((zaoz)localObject7).a(((OleObject)???).t());
              if ((((OleObject)???).m() == 33) && (((zaoz)localObject7).b("MAPIMessage") == null))
              {
                localObject8 = new zaoz(((OleObject)???).t());
                ((zaoz)localObject8).a("MAPIMessage", (zaoz)localObject7);
                localObject7 = localObject8;
              }
              this.b.h().a().a(str1, (zaoz)localObject7);
            }
            else
            {
              localObject5 = new zaoz(((OleObject)???).t());
              localObject6 = new com.aspose.cells.b.a.d.zh(((OleObject)???).getObjectData());
              ((zaoz)localObject5).a("CONTENTS", (com.aspose.cells.b.a.d.zh)localObject6);
              this.b.h().a().a(str1, (zaoz)localObject5);
            }
          }
        }
      }
    }
    b();
    if (this.c.h != null)
    {
      a(paramzm, this.b.h(), this.c.h);
    }
    else if (this.c.g != null)
    {
      a(paramzm, this.b.h(), this.c.g);
      this.c.g = null;
    }
    else if ((this.a.getSettings().getPassword() != null) && (!"".equals(this.a.getSettings().getPassword())))
    {
      zca localzca = new zca(this.a.getSettings().getPassword());
      a(paramzm, this.b.h(), localzca);
    }
  }
  
  private void b()
    throws Exception
  {
    if ((this.b.R() != null) || (this.b.S() != null) || (this.c.g != null))
    {
      String str = null;
      if (this.b.getBuiltInDocumentProperties().contains("Version"))
      {
        str = this.b.getBuiltInDocumentProperties().getVersion();
        arrayOfString = com.aspose.cells.b.a.zw.d(this.b.getBuiltInDocumentProperties().getVersion(), '.');
        if ((arrayOfString.length == 2) && (zarb.c(arrayOfString[0])) && (zarb.c(arrayOfString[1])))
        {
          int i = com.aspose.cells.b.a.zp.a(arrayOfString[0]) << 16 | com.aspose.cells.b.a.zp.a(arrayOfString[1]);
          this.b.getBuiltInDocumentProperties().get("Version").setValue(Integer.valueOf(i));
        }
      }
      String[] arrayOfString = this.b.k != null ? this.b.k.b() : null;
      if (arrayOfString != null) {
        this.b.getBuiltInDocumentProperties().a(1, 24, "DigSig", arrayOfString, false);
      }
      zsr localzsr = new zsr();
      localzsr.a(this.b.getBuiltInDocumentProperties(), this.b.getCustomDocumentProperties(), this.b.h().a());
      if (str != null) {
        this.b.getBuiltInDocumentProperties().get("Version").setValue(str);
      }
      if (arrayOfString != null) {
        this.b.getBuiltInDocumentProperties().remove("DigSig");
      }
    }
  }
  
  private void c()
    throws Exception
  {
    Object localObject;
    if ((this.a.f != null) && (this.a.f.getCount() > 0) && (this.a.e == null))
    {
      this.a.e = new ContentTypePropertyCollection();
      localObject = new zakk(this.a);
      ((zakk)localObject).a();
    }
    if (((this.a.f != null) && (this.a.f.getCount() > 0)) || ((this.a.e != null) && (this.a.e.getCount() > 0)))
    {
      localObject = new zur(this.a, this.b.h());
      ((zur)localObject).a();
    }
  }
  
  private void a(zrg paramzrg)
    throws Exception
  {
    d();
    long l1 = paramzrg.b();
    int[] arrayOfInt = new int[this.e];
    zcb localzcb = new zcb(this.a, this.c);
    localzcb.a(paramzrg, arrayOfInt);
    if (this.b.getActiveSheetIndex() >= this.e) {
      this.b.b(0);
    }
    Worksheet localWorksheet1 = this.b.get(this.b.getActiveSheetIndex());
    localWorksheet1.setSelected(true);
    for (int i = 0; i < this.e; i++)
    {
      this.c.a.f.i();
      long l2 = paramzrg.b();
      paramzrg.b(arrayOfInt[i]);
      paramzrg.a(l2);
      paramzrg.b(l2);
      Worksheet localWorksheet2 = this.b.get(i);
      Object localObject;
      if (localWorksheet2.getType() == 2)
      {
        localObject = new zkr(this.b, i, localWorksheet2.getCharts(), paramzrg);
        ((zkr)localObject).a(localWorksheet2.getCharts().get(0));
      }
      else
      {
        localObject = new zcan(localWorksheet2, this.d[i], this.f);
        ((zcan)localObject).a(paramzrg);
        this.d[i] = null;
      }
    }
  }
  
  private void d()
  {
    if (this.b.M() != null)
    {
      this.g = new zsd(this.b.L());
      this.g.a(this.b.L().d());
    }
    this.h = new zfk[this.e];
    for (int i = 0; i < this.e; i++)
    {
      Worksheet localWorksheet = this.b.get(i);
      this.h[i] = new zfk();
      if (localWorksheet.w() != null)
      {
        this.h[i].a = new zsb(0);
        this.h[i].a.a(localWorksheet.getShapes().d().c());
      }
      int j = localWorksheet.hasAutofilter() ? localWorksheet.getAutoFilter().f() : 0;
      int k = localWorksheet.getValidations().c() ? 1 : 0;
      int m = 0;
      if ((localWorksheet.b != null) && (localWorksheet.b.getCount() > 0))
      {
        Iterator localIterator = localWorksheet.b.iterator();
        while (localIterator.hasNext())
        {
          PivotTable localPivotTable1 = (PivotTable)localIterator.next();
          PivotFieldCollection localPivotFieldCollection1 = localPivotTable1.getPageFields();
          m += localPivotFieldCollection1.getCount();
        }
      }
      int n = j + k + m;
      if (n != 0)
      {
        this.h[i].b = n;
        if (localWorksheet.w() != null)
        {
          int i1 = this.b.L().d().a(localWorksheet.getShapes().d().c().a() & 0xFFFF, n);
          if (i1 != -1) {
            localWorksheet.getShapes().d().c().b(i1);
          }
        }
        Object localObject;
        if (localWorksheet.hasAutofilter())
        {
          localObject = new ComboBox(localWorksheet.getShapes(), localWorksheet.getAutoFilter());
          localWorksheet.getShapes().c((Shape)localObject);
          int i2 = localWorksheet.getAutoFilter().f();
          localWorksheet.getShapes().b(localWorksheet.getShapes().f() + (i2 - 1));
          localWorksheet.getShapes().d().c().b(localWorksheet.getShapes().d().c().c() + (i2 - 1));
          localWorksheet.getShapes().d().c().a(localWorksheet.getShapes().d().c().b() + (i2 - 1));
          this.b.L().d().b(localWorksheet.getShapes().d().c().a() & 0xFFFF, i2 - 1);
        }
        if (localWorksheet.getValidations().c())
        {
          localObject = new ComboBox(localWorksheet.getShapes(), localWorksheet.getValidations());
          localWorksheet.getShapes().c((Shape)localObject);
          localWorksheet.getValidations().a(((ComboBox)localObject).O());
        }
        if ((localWorksheet.b != null) && (localWorksheet.b.getCount() > 0))
        {
          localObject = localWorksheet.b.iterator();
          while (((Iterator)localObject).hasNext())
          {
            PivotTable localPivotTable2 = (PivotTable)((Iterator)localObject).next();
            PivotFieldCollection localPivotFieldCollection2 = localPivotTable2.getPageFields();
            if (localPivotFieldCollection2.getCount() != 0)
            {
              ComboBox localComboBox = new ComboBox(localWorksheet.getShapes(), localPivotTable2);
              localWorksheet.getShapes().c(localComboBox);
              localPivotFieldCollection2.d = localComboBox.O();
              localWorksheet.getShapes().b(localWorksheet.getShapes().f() + (localPivotFieldCollection2.getCount() - 1));
              localWorksheet.getShapes().d().c().b(localWorksheet.getShapes().d().c().c() + (localPivotFieldCollection2.getCount() - 1));
              localWorksheet.getShapes().d().c().a(localWorksheet.getShapes().d().c().b() + (localPivotFieldCollection2.getCount() - 1));
              this.b.L().d().b(localWorksheet.getShapes().d().c().a() & 0xFFFF, localPivotFieldCollection2.getCount() - 1);
            }
          }
        }
      }
    }
  }
  
  private void a(zm paramzm, zxf paramzxf, zca paramzca)
    throws Exception
  {
    ztn localztn = new ztn();
    long l = paramzm.i();
    localztn.b(paramzm, paramzca);
    paramzm.b(l);
    zaoz localzaoz = paramzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    for (int i = 0; i < localzaoz.b(); i++)
    {
      com.aspose.cells.b.a.d.zh localzh = (com.aspose.cells.b.a.d.zh)localzaoz.b(i);
      localztn.b(localzh, paramzca);
      localzh.b(0L);
    }
  }
  
  private void a(zm paramzm, zxf paramzxf, ztl paramztl)
    throws Exception
  {
    ztn localztn = new ztn();
    long l = paramzm.i();
    localztn.a(paramzm, paramztl);
    paramzm.b(l);
    zaoz localzaoz = paramzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    for (int i = 0; i < localzaoz.b(); i++)
    {
      com.aspose.cells.b.a.d.zh localzh = (com.aspose.cells.b.a.d.zh)localzaoz.b(i);
      localztn.a(localzh, paramztl);
      localzh.b(0L);
    }
  }
  
  private void a(zm paramzm, zxf paramzxf, zcc paramzcc)
    throws Exception
  {
    ztn localztn = new ztn();
    long l = paramzm.i();
    localztn.a(paramzm, paramzcc);
    paramzm.b(l);
    ztj.a(paramzxf, paramzcc);
    zaoz localzaoz = paramzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    for (int i = 0; i < localzaoz.b(); i++)
    {
      com.aspose.cells.b.a.d.zh localzh = (com.aspose.cells.b.a.d.zh)localzaoz.b(i);
      paramzcc.a();
      localztn.a(localzh, paramzcc);
      localzh.b(0L);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    ContentTypePropertyCollection localContentTypePropertyCollection = this.b.p().n();
    Object localObject1;
    if ((localContentTypePropertyCollection != null) && (localContentTypePropertyCollection.getCount() > 0))
    {
      this.b.h().a().g("MsoDataStore");
      localObject1 = localContentTypePropertyCollection.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ContentTypeProperty)((Iterator)localObject1).next();
        this.b.getCustomDocumentProperties().remove(((ContentTypeProperty)localObject2).getName());
      }
    }
    if (paramBoolean)
    {
      this.b.a(null);
      return;
    }
    this.b.h().a().g("_VBA_PROJECT_CUR");
    this.b.h().a().g("Workbook");
    if (this.b.R() != null)
    {
      this.b.h().a().g("\005SummaryInformation");
      this.b.h().a().g("\005DocumentSummaryInformation");
    }
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (this.b.X() != null)
    {
      localObject1 = this.b.X();
      if (((zawq)localObject1).getCount() > 0)
      {
        localObject2 = this.b.h().a().b("_SX_DB_CUR");
        localObject3 = ((Iterable)localObject1).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (zawp)((Iterator)localObject3).next();
          localObject5 = com.aspose.cells.a.c.zp.c(((zawp)localObject4).b);
          ((zaoz)localObject2).g(localObject5);
        }
      }
    }
    int i = -1;
    Object localObject2 = this.b.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Worksheet)((Iterator)localObject2).next();
      i++;
      localObject4 = ((Worksheet)localObject3).w();
      if (localObject4 != null)
      {
        localObject5 = this.h[i];
        if (localObject5 != null)
        {
          ((ShapeCollection)localObject4).b(((ShapeCollection)localObject4).f() - ((zfk)localObject5).b);
          if (((zfk)localObject5).a == null) {
            ((Worksheet)localObject3).a(null);
          } else {
            ((ShapeCollection)localObject4).d().c().a(((zfk)localObject5).a);
          }
        }
        for (int j = 0; j < ((ShapeCollection)localObject4).getCount(); j++) {
          switch (((ShapeCollection)localObject4).get(j).getMsoDrawingType())
          {
          case 24: 
            OleObject localOleObject = (OleObject)((ShapeCollection)localObject4).get(j);
            if (!localOleObject.a()) {
              this.b.h().a().g("MBD" + com.aspose.cells.a.c.zp.d(localOleObject.s()));
            }
            break;
          }
        }
      }
    }
    if (this.g != null) {
      this.b.L().d().a(this.g);
    } else {
      this.b.a(null);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */