package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zp;
import java.util.HashMap;

class zcim
{
  private Workbook a;
  private WorksheetCollection b;
  private int c;
  private int d;
  private byte[] e;
  private zchd f;
  private zcbw g;
  private zi h;
  
  zcim(zchd paramzchd)
  {
    this.f = paramzchd;
    this.a = paramzchd.a;
    this.b = this.a.getWorksheets();
  }
  
  void a(zcbw paramzcbw, zi paramzi)
    throws Exception
  {
    this.h = paramzi;
    this.g = paramzcbw;
    for (;;)
    {
      this.c = this.g.a();
      switch (this.c)
      {
      case 132: 
        this.g.a(1L);
        return;
      case 676: 
        h();
        break;
      case 548: 
        b();
        break;
      case 153: 
        c();
        break;
      case 157: 
        a();
        break;
      case 135: 
        d();
        break;
      case 143: 
        f();
        break;
      case 397: 
        e();
        break;
      case 353: 
        m();
        break;
      case 39: 
        l();
        break;
      case 2071: 
        g();
        break;
      case 549: 
        k();
        break;
      case 534: 
        i();
        break;
      case 386: 
        j();
        break;
      default: 
        this.d = this.g.b();
        if (this.d != 0) {
          this.g.a(this.d);
        }
        break;
      }
    }
  }
  
  private void g()
    throws Exception
  {
    this.e = this.f.a(this.g);
    this.a.setAbsolutePath(zcgj.d(this.e, 0));
  }
  
  private void h()
    throws Exception
  {
    this.e = this.f.a(this.g);
    WriteProtection localWriteProtection = this.a.getSettings().getWriteProtection();
    int i = 0;
    localWriteProtection.a().d = zc.a(this.e, i);
    i += 4;
    localWriteProtection.setRecommendReadOnly(zc.b(this.e, i) != 0);
    i += 2;
    localWriteProtection.a = zcgj.d(this.e, i);
    i += 4 + (localWriteProtection.a != null ? localWriteProtection.a.length() * 2 : 0);
    int j = zc.a(this.e, i);
    i += 4;
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(this.e, i, arrayOfByte, 0, j);
    i += j;
    localWriteProtection.a().b = arrayOfByte;
    j = zc.a(this.e, i);
    i += 4;
    arrayOfByte = new byte[j];
    System.arraycopy(this.e, i, arrayOfByte, 0, j);
    i += j;
    localWriteProtection.a().c = arrayOfByte;
    localWriteProtection.a().a = zcgj.d(this.e, i);
  }
  
  private void i()
  {
    this.e = this.f.a(this.g);
    WorksheetCollection localWorksheetCollection = this.a.getWorksheets();
    int i = zc.e(this.e, 0);
    boolean bool1 = (this.e[4] & 0xFF & 0x1) != 0;
    boolean bool2 = (this.e[4] & 0xFF & 0x2) != 0;
    int j = (this.e[4] & 0xFF & 0x4) != 0 ? 1 : 0;
    if ((bool1) || (bool2))
    {
      zbyy localzbyy = localWorksheetCollection.D();
      localzbyy.b = bool1;
      localzbyy.a = bool2;
      localzbyy.a(i);
    }
  }
  
  private void j()
    throws Exception
  {
    this.e = this.f.a(this.g);
    int i = zc.a(this.e, 0);
    int j = 4;
    int[] arrayOfInt = { j };
    String str = zcgj.a(this.e, arrayOfInt);
    j = arrayOfInt[0];
    zawq localzawq = this.a.getWorksheets().W();
    zaws localzaws = new zaws(localzawq);
    localzawq.b(localzaws);
    zri localzri = new zri(localzaws);
    localzaws.b = i;
    if (i > localzawq.b) {
      localzawq.b = i;
    }
    localzri.c = str;
    zf.a(this.f.b.h, localzri);
  }
  
  private void k()
  {
    this.e = this.f.a(this.g);
    this.b.setOleSize(zcgj.a(this.e, 0));
  }
  
  private void l()
    throws Exception
  {
    this.e = this.f.a(this.g);
    Name localName = new Name(this.b);
    localName.a(zc.a(this.e, 0));
    localName.a(this.e[4]);
    localName.setSheetIndex(zc.a(this.e, 5) + 1);
    int i = 9;
    Object localObject = { i };
    String str = zcgj.a(this.e, (int[])localObject);
    i = localObject[0];
    if (localName.r() == 0) {
      localName.f(str);
    }
    if (localName.k() == null) {
      localName.g(str);
    }
    localObject = new byte[this.e.length - i];
    System.arraycopy(this.e, i, localObject, 0, localObject.length);
    int j = zc.a(this.e, i);
    int k = zc.a(this.e, i + 4 + j);
    localName.a(new byte[j + 8 + k]);
    System.arraycopy(this.e, i, localName.b(), 0, j + 8 + k);
    if (localName.b().length == 8) {
      localName.a(null);
    }
    i += j + 8 + k;
    int[] arrayOfInt = { i };
    localName.setComment(zcgj.a(this.e, arrayOfInt));
    i = arrayOfInt[0];
    if ((localName.p()) && (!localName.o()))
    {
      arrayOfInt = new int[] { i };
      localName.a(zcgj.a(this.e, arrayOfInt));
      i = arrayOfInt[0];
      arrayOfInt[0] = i;
      localName.b(zcgj.a(this.e, arrayOfInt));
      i = arrayOfInt[0];
      arrayOfInt[0] = i;
      localName.c(zcgj.a(this.e, arrayOfInt));
      i = arrayOfInt[0];
      arrayOfInt[0] = i;
      localName.d(zcgj.a(this.e, arrayOfInt));
      i = arrayOfInt[0];
    }
    this.b.getNames().a(localName, false);
  }
  
  private void m()
    throws Exception
  {
    this.g.a(1L);
    zbth localzbth = new zbth();
    this.a.getWorksheets().a(localzbth);
    zbti localzbti = null;
    boolean bool = false;
    for (;;)
    {
      this.c = this.g.a();
      switch (this.c)
      {
      case 354: 
        this.g.a(1L);
        if (!bool)
        {
          bool = a(localzbth, bool);
          for (int i = 0; i < this.b.getCount(); i++) {
            this.b.r().b(this.b.v() & 0xFFFF, i & 0xFFFF, i & 0xFFFF);
          }
        }
        return;
      case 355: 
        this.e = this.f.a(this.g);
        String str1 = zcgj.d(this.e, 0);
        zrl localzrl = (zrl)this.f.b.b().get(str1);
        HashMap localHashMap = null;
        String str2 = zk.b(localzrl.d);
        String str3 = "xl/externalLinks/_rels/" + str2 + ".rels";
        if (this.h.a(str3, false) != -1)
        {
          localObject = zauy.a(this.h, str3, true);
          localHashMap = zalb.b((zcjy)localObject);
          ((zcjy)localObject).c();
        }
        Object localObject = "xl/" + localzrl.d;
        localzbti = new zbti(0);
        zcfw localzcfw = new zcfw(this.f, localzbti);
        localzcfw.a(zchd.b(this.h, (String)localObject), localHashMap);
        localzbth.a(localzbti);
        break;
      case 357: 
        this.g.a(1L);
        bool = true;
        localzbti = new zbti(1);
        localzbth.a(localzbti);
        this.b.c(localzbth.getCount() - 1);
        break;
      case 358: 
        this.g.a(1L);
        localzbti = new zbti(5);
        localzbth.a(localzbti);
        break;
      case 667: 
        this.g.a(1L);
        localzbti = new zbti(2);
        localzbth.a(localzbti);
        break;
      case 361: 
        this.e = this.f.a(this.g);
        String str4 = zcgj.d(this.e, 0);
        zwh localzwh = new zwh(localzbti);
        localzwh.a(str4);
        zf.a(localzbti.b(), localzwh);
        break;
      case 362: 
        bool = a(localzbth, bool);
        n();
        break;
      default: 
        this.d = this.g.b();
        this.g.a(this.d);
      }
    }
  }
  
  private boolean a(zbth paramzbth, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      zbti localzbti = new zbti(1);
      paramzbth.a(localzbti);
      this.b.c(paramzbth.getCount() - 1);
    }
    return true;
  }
  
  private void n()
    throws Exception
  {
    this.b.r().clear();
    this.e = this.f.a(this.g);
    int i = zc.a(this.e, 0);
    boolean[] arrayOfBoolean = new boolean[this.b.getCount()];
    for (int j = 0; j < i; j++)
    {
      int k = zc.a(this.e, 4 + j * 12);
      int m = zc.a(this.e, 8 + j * 12);
      int n = zc.a(this.e, 12 + j * 12);
      this.b.r().b(k & 0xFFFF, m & 0xFFFF, n & 0xFFFF);
      if ((k == this.b.v()) && (m == n) && (m < this.b.getCount()) && (m > 0)) {
        arrayOfBoolean[m] = true;
      }
    }
    for (j = 0; j < arrayOfBoolean.length; j++) {
      if (arrayOfBoolean[j] == 0) {
        this.b.r().b(this.b.v() & 0xFFFF, j & 0xFFFF, j & 0xFFFF);
      }
    }
  }
  
  void a()
  {
    this.e = this.f.a(this.g);
    int i = 0;
    int j = zc.b(this.e, 24);
    WorkbookSettings localWorkbookSettings = this.a.getSettings();
    if ((j & 0x1) != 0)
    {
      localWorkbookSettings.setReCalculateOnOpen(true);
    }
    else
    {
      localWorkbookSettings.setReCalculateOnOpen(false);
      int k = zc.a(this.e, i);
      localWorkbookSettings.b = zauj.z(k);
    }
    i += 4;
    switch (this.e[i])
    {
    case 0: 
      localWorkbookSettings.setCalcMode(2);
      break;
    case 1: 
      localWorkbookSettings.setCalcMode(0);
      break;
    case 2: 
      localWorkbookSettings.setCalcMode(1);
    }
    i += 4;
    if ((j & 0x4) != 0)
    {
      localWorkbookSettings.setIteration(true);
      localWorkbookSettings.setMaxIteration(zc.a(this.e, i));
      localWorkbookSettings.setMaxChange(zc.f(this.e, i + 4));
    }
    else
    {
      localWorkbookSettings.setIteration(false);
    }
    i += 12;
    if ((j & 0x2) == 0) {
      localWorkbookSettings.a(true);
    }
    if ((j & 0x8) == 0) {
      localWorkbookSettings.setPrecisionAsDisplayed(true);
    }
    if ((j & 0x20) != 0) {
      localWorkbookSettings.setRecalculateBeforeSave(true);
    }
  }
  
  void b()
    throws Exception
  {
    this.e = this.f.a(this.g);
    WriteProtection localWriteProtection = this.a.getSettings().getWriteProtection();
    localWriteProtection.setRecommendReadOnly(this.e[0] == 1);
    localWriteProtection.a(zc.e(this.e, 2));
    localWriteProtection.a = zcgj.d(this.e, 4);
  }
  
  void c()
    throws Exception
  {
    zql localzql = this.a.a.g;
    this.e = this.f.a(this.g);
    if ((this.e[0] & 0xFF & 0x1) != 0) {
      this.a.getSettings().setDate1904(true);
    }
    this.a.getSettings().setRemovePersonalInformation((this.e[0] & 0xFF & 0x8) != 0);
    int i = 0;
    switch (this.e[1] & 0xFF & 0x3)
    {
    case 0: 
      i = 0;
      break;
    case 1: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    }
    this.a.getSettings().setUpdateLinksType(i);
    this.a.getSettings().setHidePivotFieldList((this.e[1] & 0xFF & 0x4) != 0);
    localzql.c = ((this.e[1] & 0xFF & 0x8) >> 3 != 0);
    localzql.b = zp.a(zc.a(this.e, 4));
    int j = 8;
    int[] arrayOfInt = { j };
    String str = zcgj.a(this.e, arrayOfInt);
    j = arrayOfInt[0];
    if (str.length() > 0) {
      this.a.getWorksheets().b(str);
    }
  }
  
  void d()
  {
    this.g.a(1L);
    for (;;)
    {
      this.c = this.g.a();
      switch (this.c)
      {
      case 158: 
        this.e = this.f.a(this.g);
        int i = 0;
        this.b.p().getSettings().c(zc.a(this.e, i));
        i += 4;
        this.b.p().getSettings().d(zc.a(this.e, i));
        i += 4;
        this.b.p().getSettings().e(zc.a(this.e, i));
        i += 4;
        this.b.p().getSettings().f(zc.a(this.e, i));
        i += 4;
        this.b.p().getSettings().setSheetTabBarWidth(zc.a(this.e, i));
        i += 4;
        this.b.k(zc.a(this.e, i));
        i += 4;
        this.b.b(zc.a(this.e, i));
        i += 4;
        this.b.p().getSettings().setHidden((this.e[i] & 0xFF & 0x1) != 0);
        this.b.p().getSettings().setMinimized((this.e[i] & 0xFF & 0x4) != 0);
        this.b.p().getSettings().setHScrollBarVisible((this.e[i] & 0xFF & 0x8) != 0);
        this.b.p().getSettings().setVScrollBarVisible((this.e[i] & 0xFF & 0x10) != 0);
        this.b.p().getSettings().setShowTabs((this.e[i] & 0xFF & 0x20) != 0);
        break;
      case 136: 
        this.g.a(1L);
        return;
      default: 
        this.d = this.g.b();
        if (this.d != 0) {
          this.g.a(this.d);
        }
        break;
      }
    }
  }
  
  void e()
    throws Exception
  {
    this.e = this.f.a(this.g);
    zoj localzoj = new zoj();
    this.b.n().a(localzoj);
    int i = 0;
    localzoj.c = zc.a(this.e, i);
    i += 4;
    localzoj.e = (zc.a(this.e, i) - localzoj.c);
    i += 4;
    localzoj.d = zc.a(this.e, i);
    i += 4;
    localzoj.f = (zc.a(this.e, i) - localzoj.d);
    i += 4;
    localzoj.a = zc.a(this.e, i);
    i += 4;
    localzoj.h = zc.a(this.e, i);
    i += 4;
    byte[] arrayOfByte = new byte[16];
    System.arraycopy(this.e, i, arrayOfByte, 0, 16);
    localzoj.b = new zh(arrayOfByte);
    i += 16;
    localzoj.i = zc.b(this.e, i);
    i += 2;
    int j = zc.a(this.e, i);
    localzoj.l((j & 0x1) != 0);
    localzoj.n((j & 0x2) != 0);
    localzoj.c((j & 0x4) != 0);
    localzoj.d((j & 0x8) != 0);
    localzoj.m((j & 0x10) != 0);
    localzoj.a((j & 0x20) != 0);
    localzoj.b((j & 0x40) != 0);
    switch (j & 0x180)
    {
    case 0: 
      localzoj.a(2);
      break;
    case 128: 
      localzoj.a(1);
      break;
    case 256: 
      localzoj.a(0);
    }
    switch (j & 0x600)
    {
    case 0: 
      localzoj.b(0);
      break;
    case 512: 
      localzoj.b(2);
      break;
    case 1024: 
      localzoj.b(1);
    }
    localzoj.e((j & 0x800) != 0);
    localzoj.f((j & 0x1000) != 0);
    localzoj.h((j & 0x2000) != 0);
    localzoj.i((j & 0x4000) != 0);
    localzoj.j((j & 0x8000) != 0);
    localzoj.k((j & 0x10000) != 0);
    i += 4;
    localzoj.j = zcgj.d(this.e, i);
  }
  
  void f()
    throws Exception
  {
    this.g.a(1L);
    zug.a(this.b.p());
    this.a.getWorksheets().clear();
    int i = 0;
    int j = 1;
    for (;;)
    {
      this.c = this.g.a();
      switch (this.c)
      {
      case 156: 
        this.e = this.f.a(this.g);
        int k = 4;
        int m = zc.a(this.e, k);
        k += 4;
        int[] arrayOfInt = { k };
        String str1 = zcgj.a(this.e, arrayOfInt);
        k = arrayOfInt[0];
        arrayOfInt[0] = k;
        String str2 = zcgj.a(this.e, arrayOfInt);
        k = arrayOfInt[0];
        Worksheet localWorksheet = this.a.getWorksheets().add(str2);
        localWorksheet.k = new zqv();
        localWorksheet.setTabId(m);
        if (m > j) {
          j = m;
        }
        if (this.e[0] == 1) {
          localWorksheet.a(false, false);
        } else if (this.e[0] == 2) {
          localWorksheet.a(false, true);
        }
        zqh localzqh = null;
        zqi localzqi = new zqi(localzqh, localWorksheet);
        localzqi.d = localWorksheet;
        localzqi.a = i;
        localzqi.b = zp.a(m);
        localzqi.c = str1;
        zf.a(this.f.b.c, localzqi);
        this.f.b.b.put(Integer.valueOf(i), localzqi);
        i++;
      }
    }
    this.b.c = j;
    this.g.a(1L);
    return;
    throw new CellsException(6, "Invalid workbook setting in the xlsb workbook.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */