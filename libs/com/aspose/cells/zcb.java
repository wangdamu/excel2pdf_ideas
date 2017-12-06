package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zcb
{
  private Workbook a;
  private WorksheetCollection b;
  private zcac c;
  private int d;
  private static final za e = new za(new String[] { "Normal", "Comma", "Currency", "Percent", "Comma [0]", "Currency [0]" });
  
  public zcb(Workbook paramWorkbook, zcac paramzcac)
  {
    this.a = paramWorkbook;
    this.b = paramWorkbook.getWorksheets();
    this.d = this.b.getCount();
    this.c = paramzcac;
  }
  
  void a(zrg paramzrg, int[] paramArrayOfInt)
    throws Exception
  {
    zce localzce = new zce();
    localzce.a(paramzrg);
    if ((this.a.getSettings().q != null) && (this.a.getSettings().q.isWriteProtected())) {
      paramzrg.a(134);
    }
    Object localObject1;
    Object localObject2;
    Object localObject4;
    if ((this.a.getSettings().getPassword() != null) && (!"".equals(this.a.getSettings().getPassword())))
    {
      if (this.a.getSettings().h() == 0)
      {
        localObject1 = new zxd();
        ((zxd)localObject1).a(this.a.getSettings().getPassword());
        ((zxd)localObject1).a(paramzrg);
      }
      else if (this.a.getSettings().h() == 1)
      {
        localObject1 = com.aspose.cells.b.a.zh.b().a();
        localObject2 = new byte[32];
        byte[] arrayOfByte2 = Encoding.getUnicode().a(this.a.getSettings().getPassword());
        System.arraycopy(arrayOfByte2, 0, localObject2, 0, arrayOfByte2.length);
        zaok localzaok = new zaok();
        localObject4 = new byte[16];
        localObject5 = new byte[16];
        localzaok.a((byte[])localObject2, (byte[])localObject1);
        localzaok.a((byte[])localObject1, (byte[])localObject4, (byte[])localObject5);
        localObject6 = new ztl(this.a.getSettings().getPassword(), (byte[])localObject1, (byte[])localObject4, (byte[])localObject5);
        this.c.h = ((ztl)localObject6);
        localObject7 = new zxd();
        ((zxd)localObject7).a((ztl)localObject6);
        ((zxd)localObject7).a(paramzrg);
      }
      else
      {
        localObject1 = zcc.a(this.a.getSettings().getPassword(), this.a.getSettings().h(), this.a.getSettings().i());
        localObject2 = new zxd();
        ((zxd)localObject2).a((zcc)localObject1);
        ((zxd)localObject2).a(paramzrg);
        this.c.g = ((zcc)localObject1);
      }
    }
    else if ((this.a.getWorksheets().F()) && ((this.a.getWorksheets().D().b() & 0xFFFF) != 0))
    {
      this.c.h = ztl.a();
      localObject1 = new zxd();
      ((zxd)localObject1).a(this.c.h);
      ((zxd)localObject1).a(paramzrg);
    }
    if ((this.c.f != null) && (this.c.f.a)) {
      paramzrg.a(96);
    }
    if ((this.a.getSettings().q != null) && (this.a.getSettings().q.b()))
    {
      localObject1 = new zxe(this.a);
      ((zxe)localObject1).a(paramzrg);
    }
    if ((this.b.z() != null) && (this.b.z().a() != null) && (this.b.z().a().size() != 0)) {
      for (int i = 0; i < this.b.z().a().size(); i++)
      {
        localObject2 = (byte[])this.b.z().a().get(i);
        paramzrg.a((byte[])localObject2);
      }
    }
    byte[] arrayOfByte1 = { 66, 0, 2, 0, -80, 4 };
    System.arraycopy(zc.a(this.a.getSettings().e), 0, arrayOfByte1, 4, 2);
    paramzrg.a(arrayOfByte1);
    if ((this.b.k()) || (this.b.G() != null))
    {
      paramzrg.a(211);
      if (this.b.l()) {
        paramzrg.a(445);
      }
    }
    if (this.b.j() != null)
    {
      localObject2 = new zlb();
      ((zlb)localObject2).a(this.b.j());
      ((zlb)localObject2).a(paramzrg);
    }
    if (this.d < 4113)
    {
      paramzrg.c(317);
      paramzrg.c(2 * this.d);
      for (int j = 0; j < this.d; j++) {
        paramzrg.c(this.b.get(j).getTabId());
      }
    }
    if (this.b.getOleSize() != null)
    {
      localObject3 = new zaug((CellArea)this.b.getOleSize());
      ((zaug)localObject3).a(paramzrg);
    }
    if (this.b.F())
    {
      localObject3 = this.b.h;
      paramzrg.c(25);
      paramzrg.c(2);
      if (((zbyy)localObject3).a) {
        paramzrg.c(1);
      } else {
        paramzrg.c(0);
      }
      paramzrg.c(18);
      paramzrg.c(2);
      if (((zbyy)localObject3).b) {
        paramzrg.c(1);
      } else {
        paramzrg.c(0);
      }
      paramzrg.c(19);
      int k = ((zbyy)localObject3).b();
      if ((k & 0xFFFF) == 0)
      {
        paramzrg.c(2);
        paramzrg.c(0);
      }
      else
      {
        paramzrg.c(2);
        paramzrg.b(k);
      }
    }
    if (this.b.z() != null) {
      this.b.z().a(paramzrg);
    }
    c(paramzrg);
    Object localObject3 = new zzr();
    HashMap localHashMap = new HashMap();
    for (int m = 0; m < this.b.A().size(); m++)
    {
      localObject4 = (Font)this.b.A().get(m);
      localObject5 = ((zzr)localObject3).a((Font)localObject4);
      if ((localObject5 != null) && (((zbzi)localObject5).getCount() != 0)) {
        localHashMap.put(Integer.valueOf(m >= 4 ? m + 1 : m), localObject5);
      }
      ((zzr)localObject3).a(paramzrg);
    }
    for (int n = 0; n < this.b.B().size(); n++)
    {
      zzw localzzw = (zzw)this.b.B().get(n);
      localzzw.a(paramzrg);
    }
    zbzj localzbzj = new zbzj();
    Object localObject5 = new HashMap();
    Object localObject6 = new com.aspose.cells.a.e.zh();
    Object localObject7 = this.b.C();
    int i1 = ((zajm)localObject7).b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Style localStyle = ((zajm)localObject7).a(i2);
      a(localStyle, i2, localzbzj, (com.aspose.cells.a.e.zh)localObject6, localHashMap, (HashMap)localObject5);
      localzbzj.a(paramzrg);
    }
    Object localObject9;
    Object localObject10;
    if (((HashMap)localObject5).size() != 0)
    {
      zbzf localzbzf = new zbzf();
      localzbzf.a(this.b.C().b(), ((com.aspose.cells.a.e.zh)localObject6).a());
      localzbzf.a(paramzrg);
      for (int i4 = 0; i4 < this.b.C().b(); i4++)
      {
        localObject9 = (zbzi)((HashMap)localObject5).get(Integer.valueOf(i4));
        if (localObject9 != null)
        {
          localObject10 = new zbzh();
          ((zbzh)localObject10).a(i4, (zbzi)localObject9);
          ((zbzh)localObject10).a(paramzrg);
        }
      }
    }
    localObject6 = null;
    a(paramzrg);
    for (int i3 = 0; i3 < i1; i3++)
    {
      localObject8 = ((zajm)localObject7).a(i3);
      if ((((Style)localObject8).getName() != null) && (!"".equals(((Style)localObject8).getName())))
      {
        localObject9 = new zbtb();
        switch (e.a(((Style)localObject8).getName()))
        {
        case 0: 
          ((zbtb)localObject9).a(i3, (byte)0);
          break;
        case 1: 
          ((zbtb)localObject9).a(i3, (byte)3);
          break;
        case 2: 
          ((zbtb)localObject9).a(i3, (byte)4);
          break;
        case 3: 
          ((zbtb)localObject9).a(i3, (byte)5);
          break;
        case 4: 
          ((zbtb)localObject9).a(i3, (byte)6);
          break;
        case 5: 
          ((zbtb)localObject9).a(i3, (byte)7);
          break;
        default: 
          ((zbtb)localObject9).a(i3, ((Style)localObject8).getName());
        }
        ((zbtb)localObject9).a(paramzrg);
      }
    }
    b(paramzrg);
    zavc localzavc = new zavc();
    localzavc.a(this.b.o());
    localzavc.a(paramzrg);
    Object localObject8 = this.b.m();
    if (localObject8 != null)
    {
      for (int i5 = 0; i5 < ((zok)localObject8).getCount(); i5++)
      {
        localObject10 = new zbxu();
        ((zbxu)localObject10).a(((zok)localObject8).a(i5));
        ((zbxu)localObject10).a(paramzrg);
      }
      paramzrg.c(352);
      paramzrg.c(2);
      if (this.b.i()) {
        paramzrg.c(1);
      } else {
        paramzrg.c(0);
      }
    }
    if (this.c.b != null) {
      for (zri localzri : this.c.b)
      {
        localObject13 = new zawy(localzri);
        ((zawy)localObject13).a(paramzrg);
      }
    }
    if (this.b.i())
    {
      paramzrg.c(352);
      paramzrg.c(2);
      paramzrg.c(1);
    }
    for (int i6 = 0; i6 < this.d; i6++)
    {
      paramArrayOfInt[i6] = ((int)(paramzrg.b() + 4L));
      Worksheet localWorksheet = this.b.get(i6);
      String str = localWorksheet.getName();
      short s = (short)(localWorksheet.n() & 0xFF);
      if (localWorksheet.getType() == 0) {
        s = (short)(s + 1536);
      } else if (localWorksheet.getType() == 2) {
        s = (short)(s + 512);
      } else if (localWorksheet.getType() == 3) {
        s = (short)(s + 256);
      }
      localObject13 = new zdn(s, str);
      ((zdn)localObject13).a(paramzrg);
    }
    znw localznw = new znw(this.a.getSettings().getLanguageCode(), this.a.getSettings().getRegion());
    localznw.a(paramzrg);
    int i8 = -1;
    if ((this.b.w() != null) && (this.b.w().getCount() != 0)) {
      for (int i10 = 0; i10 < this.b.w().getCount(); i10++)
      {
        localObject12 = this.b.w().a(i10);
        localObject13 = new zbtj();
        ((zbtj)localObject13).a((zbti)localObject12, this.d);
        ((zbtj)localObject13).a(paramzrg);
        for (int i11 = 0; i11 < ((zbti)localObject12).b().size(); i11++)
        {
          zwi localzwi = new zwi();
          localzwi.a((zwh)((zbti)localObject12).b().get(i11));
          localzwi.a(paramzrg);
        }
        if (((zbti)localObject12).d() != null)
        {
          localObject14 = ((zbti)localObject12).d();
          for (int i12 = 0; i12 < ((ArrayList)localObject14).size(); i12++)
          {
            zwr localzwr = (zwr)((ArrayList)localObject14).get(i12);
            if ((localzwr != null) && (localzwr.c())) {
              a(paramzrg, localzwr, i12);
            }
          }
        }
      }
    }
    b(paramzrg, i8);
    a(paramzrg, i8);
    try
    {
      zbar localzbar = new zbar(zauj.F(this.b.p().getSettings().b));
      localzbar.a(paramzrg);
    }
    catch (Exception localException) {}
    if ((this.b.O() != null) && (this.b.O().b().getCount() != 0))
    {
      localObject11 = new zbbe();
      ((zbbe)localObject11).a(this.b, this.b.O());
      ((zbbe)localObject11).b(paramzrg);
    }
    if (this.b.M() != null)
    {
      localObject11 = new zaom(this.b, 0);
      ((zaom)localObject11).a(this.b.M());
      ((zaom)localObject11).a(paramzrg);
    }
    Object localObject11 = new zbot();
    ((zbot)localObject11).a(this.b.g);
    ((zbot)localObject11).a(paramzrg);
    if ((this.a.getSettings().g != null) && (this.a.getSettings().g.d != 0)) {
      paramzrg.a(this.a.getSettings().g.a());
    }
    if (this.b.z() != null) {
      this.b.z().b(paramzrg);
    }
    Object localObject12 = this.a.d();
    if (((zrs)localObject12).b())
    {
      localObject13 = new zbwp();
      ((zbwp)localObject13).a(this.a, ((zrs)localObject12).c);
      ((zbwp)localObject13).a(paramzrg);
    }
    else if (((zrs)localObject12).c != -1)
    {
      localObject13 = new zbwp(((zrs)localObject12).c);
      ((zbwp)localObject13).a(paramzrg);
    }
    Object localObject13 = new znd(0, this.b.p().getSettings().getCheckCompatibility());
    ((znd)localObject13).a(paramzrg);
    Object localObject14 = new zta();
    ((zta)localObject14).a(paramzrg);
  }
  
  private void a(zrg paramzrg)
    throws Exception
  {
    TableStyleCollection localTableStyleCollection = this.a.getWorksheets().Z();
    if ((localTableStyleCollection == null) || (localTableStyleCollection.getCount() == 0)) {
      return;
    }
    DxfCollection localDxfCollection = this.a.getWorksheets().getDxfs();
    int i = localDxfCollection.getCount();
    if (i == 0) {
      return;
    }
    for (int j = 0; j < localDxfCollection.getCount(); j++)
    {
      Style localStyle = localDxfCollection.get(j);
      zsy localzsy = new zsy();
      localzsy.a(localStyle, false, this.a);
      localzsy.a(paramzrg);
    }
  }
  
  private void b(zrg paramzrg)
    throws Exception
  {
    TableStyleCollection localTableStyleCollection = this.a.getWorksheets().Z();
    if (localTableStyleCollection == null) {
      return;
    }
    int i = localTableStyleCollection.getCount();
    if (i == 0) {
      return;
    }
    zbvr localzbvr = new zbvr(localTableStyleCollection);
    localzbvr.a(paramzrg);
    for (int j = 0; j < i; j++)
    {
      TableStyle localTableStyle = localTableStyleCollection.get(j);
      a(localTableStyle, paramzrg);
    }
  }
  
  private void a(TableStyle paramTableStyle, zrg paramzrg)
    throws Exception
  {
    zbvq localzbvq = new zbvq(paramTableStyle);
    localzbvq.a(paramzrg);
    int i = paramTableStyle.getTableStyleElements().getCount();
    for (int j = 0; j < i; j++)
    {
      TableStyleElement localTableStyleElement = paramTableStyle.getTableStyleElements().get(j);
      zbvo localzbvo = new zbvo(localTableStyleElement);
      localzbvo.a(paramzrg);
    }
  }
  
  private void c(zrg paramzrg)
    throws Exception
  {
    WorkbookSettings localWorkbookSettings = this.a.getSettings();
    if (this.b.getActiveSheetIndex() - this.b.P() > 10) {
      this.b.k(this.b.getActiveSheetIndex() - 10);
    }
    zbyw localzbyw = new zbyw(this.b);
    localzbyw.a(paramzrg);
    paramzrg.c(64);
    paramzrg.c(2);
    paramzrg.c(0);
    paramzrg.c(141);
    paramzrg.c(2);
    switch (localWorkbookSettings.getDisplayDrawingObjects())
    {
    case 0: 
      paramzrg.c(0);
      break;
    case 2: 
      paramzrg.c(2);
      break;
    case 1: 
      paramzrg.c(1);
      break;
    default: 
      paramzrg.c(0);
    }
    paramzrg.c(34);
    paramzrg.c(2);
    if (localWorkbookSettings.getDate1904()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    paramzrg.c(14);
    paramzrg.c(2);
    if (localWorkbookSettings.getPrecisionAsDisplayed()) {
      paramzrg.c(0);
    } else {
      paramzrg.c(1);
    }
    paramzrg.c(439);
    paramzrg.c(2);
    paramzrg.c(0);
    paramzrg.c(218);
    paramzrg.c(2);
    paramzrg.a(localWorkbookSettings.l());
  }
  
  private void a(zrg paramzrg, zwr paramzwr, int paramInt)
    throws Exception
  {
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = 89;
    arrayOfByte[2] = 4;
    System.arraycopy(zc.a(paramzwr.a.size()), 0, arrayOfByte, 4, 2);
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte, 6, 2);
    paramzrg.a(arrayOfByte);
    for (int i = 0; i < paramzwr.a.size(); i++)
    {
      zwn localzwn = (zwn)paramzwr.a.get(i);
      if (localzwn.d())
      {
        zff localzff = new zff();
        localzff.a(localzwn);
        localzff.a(paramzrg);
      }
    }
  }
  
  private void a(zrg paramzrg, int paramInt)
    throws Exception
  {
    NameCollection localNameCollection = this.b.getNames();
    for (int i = 0; i < localNameCollection.getCount(); i++)
    {
      Name localName = localNameCollection.get(i);
      zaqh localzaqh = new zaqh(localName);
      localzaqh.a(paramzrg);
      if ((localName.getComment() != null) && (!"".equals(localName.getComment())))
      {
        zaqf localzaqf = new zaqf();
        localzaqf.a(localName);
        localzaqf.a(paramzrg);
      }
    }
  }
  
  private void b(zrg paramzrg, int paramInt)
    throws Exception
  {
    zbth localzbth = this.b.w();
    if ((localzbth != null) && (localzbth.getCount() != 0)) {
      for (int i = 0; i < localzbth.getCount(); i++)
      {
        zbti localzbti = localzbth.a(i);
        if (localzbti.e()) {
          break;
        }
      }
    }
    zws localzws = new zws();
    this.b.r().a(localzws.a);
    localzws.a(paramzrg);
  }
  
  private void a(Style paramStyle, int paramInt, zbzj paramzbzj, com.aspose.cells.a.e.zh paramzh, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    paramzbzj.a();
    paramzbzj.a(paramStyle.getFont().m());
    zbzi localzbzi1 = paramzbzj.a(paramStyle, paramInt);
    paramzh.a(paramzbzj.e());
    zbzi localzbzi2 = (zbzi)paramHashMap1.get(Integer.valueOf(paramStyle.getFont().m()));
    if (localzbzi2 != null) {
      localzbzi1.a(localzbzi2);
    }
    if (localzbzi1.getCount() != 0) {
      paramHashMap2.put(Integer.valueOf(paramInt), localzbzi1);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */