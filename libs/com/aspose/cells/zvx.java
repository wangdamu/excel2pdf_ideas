package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zvx
  extends ztp
{
  private Workbook b;
  private zpt c;
  private HashMap d;
  
  zvx(zpt paramzpt)
  {
    this.c = paramzpt;
    this.b = paramzpt.a;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    d(paramzcjz);
    n(paramzcjz);
    e(paramzcjz);
    p(paramzcjz);
    b(paramzcjz);
    o(paramzcjz);
    m(paramzcjz);
    l(paramzcjz);
    q(paramzcjz);
    r(paramzcjz);
    j(paramzcjz);
    k(paramzcjz);
    f(paramzcjz);
    g(paramzcjz);
    i(paramzcjz);
    b(paramzcjz, null, null, null);
    c(paramzcjz);
    h(paramzcjz);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    if ((this.b.getWorksheets().b() == null) || ("".equals(this.b.getWorksheets().b()))) {
      return;
    }
    paramzcjz.b("mc:AlternateContent");
    paramzcjz.a("xmlns:mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
    paramzcjz.b("mc:Choice");
    paramzcjz.a("Requires", "x15");
    paramzcjz.b("x15ac:absPath");
    paramzcjz.a("url", this.b.getWorksheets().b());
    paramzcjz.a("xmlns:x15ac", "http://schemas.microsoft.com/office/spreadsheetml/2010/11/ac");
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    WorkbookSettings localWorkbookSettings = this.b.getSettings();
    if (localWorkbookSettings.n == 0) {
      return;
    }
    paramzcjz.b("fileRecoveryPr");
    if (!localWorkbookSettings.getAutoRecover()) {
      paramzcjz.a("autoRecover", "0");
    }
    if (localWorkbookSettings.getCrashSave()) {
      paramzcjz.a("crashSave", "1");
    }
    if (localWorkbookSettings.getDataExtractLoad()) {
      paramzcjz.a("dataExtractLoad", "1");
    }
    if (localWorkbookSettings.getRepairLoad()) {
      paramzcjz.a("repairLoad", "1");
    }
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("workbook");
    if (zauj.a) {
      paramzcjz.a("xmlns", zaty.a);
    } else {
      paramzcjz.a("xmlns", zaty.b);
    }
    paramzcjz.a("xmlns", "r", null, zaty.e);
    HashMap localHashMap = null;
    if ((this.b.a != null) && (this.b.a.g != null))
    {
      localHashMap = this.b.a.g.f;
      if (localHashMap != null)
      {
        Iterator localIterator = localHashMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          paramzcjz.a(str, (String)localHashMap.get(str));
        }
      }
    }
    if ((localHashMap == null) || (localHashMap.get("xmlns:mc") == null)) {
      paramzcjz.a("xmlns:mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
    }
    if ((localHashMap == null) || (localHashMap.get("mc:Ignorable") == null)) {
      paramzcjz.a("mc:Ignorable", "x15");
    }
    if ((localHashMap == null) || (localHashMap.get("xmlns:x15") == null)) {
      paramzcjz.a("xmlns:x15", zaty.d);
    }
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    WriteProtection localWriteProtection = this.b.getSettings().q;
    if ((localWriteProtection != null) && (localWriteProtection.b()))
    {
      paramzcjz.b("fileSharing");
      if (localWriteProtection.getRecommendReadOnly()) {
        paramzcjz.a("readOnlyRecommended", "1");
      }
      String str = localWriteProtection.a;
      if (str == null) {
        str = "Aspose";
      }
      paramzcjz.a("userName", str);
      ztm localztm = localWriteProtection.b;
      if (localztm != null) {
        if (localztm.a == null)
        {
          if (localztm.b() != 0) {
            paramzcjz.a("reservationPassword", zp.c(localztm.b()));
          }
        }
        else
        {
          paramzcjz.a("algorithmName", localztm.a);
          paramzcjz.a("hashValue", ze.a(localztm.b));
          paramzcjz.a("saltValue", ze.a(localztm.c));
          paramzcjz.a("spinCount", zauj.z(localztm.d));
        }
      }
      paramzcjz.b();
    }
  }
  
  private void f(zcjz paramzcjz)
    throws Exception
  {
    SmartTagOptions localSmartTagOptions = this.b.getSettings().p();
    if (localSmartTagOptions != null)
    {
      paramzcjz.b("smartTagPr");
      paramzcjz.a("embed", localSmartTagOptions.getEmbedSmartTags() ? "1" : "0");
      switch (localSmartTagOptions.getShowType())
      {
      case 2: 
        paramzcjz.a("show", "none");
        break;
      case 1: 
        paramzcjz.a("show", "noIndicator");
      }
      paramzcjz.b();
    }
  }
  
  private void g(zcjz paramzcjz)
    throws Exception
  {
    zbqg localzbqg = this.b.getWorksheets().ab();
    if ((localzbqg == null) || (localzbqg.getCount() == 0)) {
      return;
    }
    paramzcjz.b("smartTagTypes");
    for (int i = 0; i < localzbqg.getCount(); i++)
    {
      zbqf localzbqf = localzbqg.a(i);
      paramzcjz.b("smartTagType");
      paramzcjz.a("namespaceUri", localzbqf.a());
      paramzcjz.a("name", localzbqf.b());
      if (localzbqf.a != null) {
        paramzcjz.a("url", localzbqf.a);
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private boolean d()
  {
    if ((this.b.a != null) && (this.b.a.g != null))
    {
      this.d = this.b.a.g.h;
      if ((this.d != null) && (this.d.size() > 0)) {
        return true;
      }
    }
    zbpq localzbpq = this.b.getWorksheets().I();
    if (localzbpq != null)
    {
      int i = localzbpq.getCount();
      if (i > 0) {
        return true;
      }
    }
    ArrayList localArrayList = this.c.h;
    if (localArrayList != null)
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zri localzri = (zri)localIterator.next();
        if ((localzri.b != null) && (localzri.b.d != null)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void a(zcjz paramzcjz, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    zbpq localzbpq = this.b.getWorksheets().I();
    if ((localzbpq == null) || (localzbpq.getCount() == 0)) {
      return;
    }
    ArrayList localArrayList = null;
    Iterator localIterator = localzbpq.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zbpp)localIterator.next();
      if (zw.b(((zbpp)localObject).a, paramString1))
      {
        if (localArrayList == null) {
          localArrayList = new ArrayList();
        }
        zf.a(localArrayList, ((zbpp)localObject).b);
      }
    }
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return;
    }
    paramzcjz.b("ext");
    paramzcjz.a("uri", paramString1);
    paramzcjz.a("xmlns", paramString2, null, paramString3);
    paramzcjz.a(paramString2, "slicerCaches", false);
    if ("{46BE6895-7355-4a93-B00E-2C351335B9C9}".equals(paramString1))
    {
      paramString2 = "x14";
      paramzcjz.a("xmlns", paramString2, null, zaty.c);
    }
    localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      paramzcjz.a(paramString2, "slicerCache", false);
      paramzcjz.a("r:id", (String)localObject);
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void h(zcjz paramzcjz)
    throws Exception
  {
    if (!d()) {
      return;
    }
    paramzcjz.b("extLst");
    b(paramzcjz, "{876F7934-8845-4945-9796-88D515C7AA90}", "x14", zaty.c);
    a(paramzcjz, "{BBE1A952-AA13-448e-AADC-164F8A28A991}", "x14", zaty.c);
    a(paramzcjz, "{79F54976-1DA5-4618-B147-4CDE4B953A38}");
    b(paramzcjz, "{841E416B-1EF1-43b6-AB56-02D37102CBD5}", "x15", zaty.d);
    a(paramzcjz, "{A2CB5862-8E78-49c6-8D9D-AF26E26ADB89}");
    a(paramzcjz, "{983426D0-5260-488c-9760-48F4B6AC55F4}");
    a(paramzcjz, "{46BE6895-7355-4a93-B00E-2C351335B9C9}", "x15", zaty.d);
    a(paramzcjz, "{D0CA8CA8-9F24-4464-BF8E-62219DCF47F9}");
    a(paramzcjz, "{140A7094-0E35-4892-8432-C4D2E57EDEB5}");
    a(paramzcjz, "{FCE2AD5D-F65C-4FA6-A056-5C36A1767C68}");
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString)
    throws Exception
  {
    if ((this.d == null) || (this.d.get(paramString) == null)) {
      return;
    }
    String str = (String)this.d.get(paramString);
    paramzcjz.d(str);
  }
  
  private void i(zcjz paramzcjz)
    throws Exception
  {
    zok localzok = this.b.getWorksheets().m();
    if ((localzok != null) && (localzok.getCount() > 0))
    {
      paramzcjz.b("customWorkbookViews");
      for (int i = 0; i < localzok.getCount(); i++)
      {
        zoj localzoj = localzok.a(i);
        paramzcjz.b("customWorkbookView");
        paramzcjz.a("name", localzoj.j);
        paramzcjz.a("guid", "{" + zs.a(localzoj.b) + "}");
        paramzcjz.a("activeSheetId", zauj.z(localzoj.a));
        paramzcjz.a("xWindow", zauj.z(localzoj.c));
        paramzcjz.a("yWindow", zauj.z(localzoj.d));
        paramzcjz.a("windowWidth", zauj.z(localzoj.e));
        paramzcjz.a("windowHeight", zauj.z(localzoj.f));
        paramzcjz.a("mergeInterval", zauj.z(localzoj.i));
        if (localzoj.m()) {
          paramzcjz.a("personalView", "1");
        }
        if (localzoj.o()) {
          paramzcjz.a("maximized", "1");
        }
        if (localzoj.j()) {
          paramzcjz.a("autoUpdate", "1");
        }
        if (localzoj.k()) {
          paramzcjz.a("changesSavedWin", "1");
        }
        if (!localzoj.h()) {
          paramzcjz.a("includeHiddenRowCol", "0");
        }
        if (!localzoj.g()) {
          paramzcjz.a("includePrintSettings", "0");
        }
        if (localzoj.n()) {
          paramzcjz.a("minimized", "0");
        }
        if (localzoj.l()) {
          paramzcjz.a("onlySync", "1");
        }
        switch (localzoj.c())
        {
        case 2: 
          paramzcjz.a("showComments", "commNone");
          break;
        case 0: 
          paramzcjz.a("showComments", "commIndAndComment");
        }
        if (!localzoj.a()) {
          paramzcjz.a("showFormulaBar", "0");
        }
        if (!localzoj.p()) {
          paramzcjz.a("showHorizontalScroll", "0");
        }
        if (!localzoj.d()) {
          paramzcjz.a("showVerticalScroll", "0");
        }
        switch (localzoj.f())
        {
        case 0: 
          break;
        case 1: 
          paramzcjz.a("showObjects", "none");
          break;
        case 2: 
          paramzcjz.a("showObjects", "placeholders");
        }
        if (!localzoj.e()) {
          paramzcjz.a("showSheetTabs", "0");
        }
        if (!localzoj.b()) {
          paramzcjz.a("showStatusbar", "0");
        }
        if (localzoj.h != 600) {
          paramzcjz.a("tabRatio", zauj.z(localzoj.h));
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
  }
  
  private void j(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("calcPr");
    if (!this.b.getSettings().getReCalculateOnOpen()) {
      paramzcjz.a("calcId", this.b.getSettings().b);
    }
    if (this.b.getSettings().getCalcMode() != 0) {
      paramzcjz.a("calcMode", zauj.aq(this.b.getSettings().getCalcMode()));
    } else if (this.b.getSettings().getReCalculateOnOpen()) {
      paramzcjz.a("fullCalcOnLoad", "1");
    }
    if (this.b.getSettings().getPrecisionAsDisplayed()) {
      paramzcjz.a("fullPrecision", "0");
    }
    if ((this.b.getSettings().getCalcMode() == 2) && (!this.b.getSettings().getRecalculateBeforeSave()))
    {
      paramzcjz.a("calcCompleted", "0");
      paramzcjz.a("calcOnSave", "0");
    }
    if (this.b.getSettings().getIteration())
    {
      paramzcjz.a("iterate", "1");
      paramzcjz.a("iterateCount", zauj.z(this.b.getSettings().getMaxIteration()));
      paramzcjz.a("iterateDelta", zauj.b(this.b.getSettings().getMaxChange()));
    }
    if (this.b.getSettings().e()) {
      paramzcjz.a("refMode", "R1C1");
    }
    paramzcjz.b();
  }
  
  private void k(zcjz paramzcjz)
    throws Exception
  {
    if (this.b.getWorksheets().getOleSize() != null)
    {
      paramzcjz.b("oleSize");
      paramzcjz.a("ref", zauj.a((CellArea)this.b.getWorksheets().getOleSize()));
      paramzcjz.b();
    }
  }
  
  private void l(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("sheets");
    for (int i = 0; i < this.c.c.size(); i++)
    {
      zpu localzpu = (zpu)this.c.c.get(i);
      paramzcjz.b("sheet");
      paramzcjz.a("name", localzpu.a.getName());
      String str1 = zauj.z(localzpu.a.getTabId());
      paramzcjz.a("sheetId", str1);
      if (!localzpu.a.isVisible())
      {
        String str2 = "hidden";
        if (localzpu.a.o()) {
          str2 = "veryHidden";
        }
        paramzcjz.a("state", str2);
      }
      paramzcjz.a("r:id", null, localzpu.h);
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void m(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("bookViews");
    paramzcjz.b("workbookView");
    if (this.b.getSettings().isHidden()) {
      paramzcjz.a("visibility", "hidden");
    }
    if (this.b.getSettings().isMinimized()) {
      paramzcjz.a("minimized", "1");
    }
    if (!this.b.getSettings().isHScrollBarVisible()) {
      paramzcjz.a("showHorizontalScroll", "0");
    }
    if (!this.b.getSettings().isVScrollBarVisible()) {
      paramzcjz.a("showVerticalScroll", "0");
    }
    if (!this.b.getSettings().getShowTabs()) {
      paramzcjz.a("showSheetTabs", "0");
    }
    paramzcjz.a("xWindow", zauj.z(this.b.getSettings().s()));
    paramzcjz.a("yWindow", zauj.z(this.b.getSettings().t()));
    paramzcjz.a("windowWidth", zauj.z(this.b.getSettings().u()));
    paramzcjz.a("windowHeight", zauj.z(this.b.getSettings().v()));
    if (this.b.getSettings().getSheetTabBarWidth() != 600) {
      paramzcjz.a("tabRatio", zauj.z(this.b.getSettings().getSheetTabBarWidth()));
    }
    int i;
    zpu localzpu;
    if (this.b.getWorksheets().P() != 0) {
      for (i = 0; i < this.c.c.size(); i++)
      {
        localzpu = (zpu)this.c.c.get(i);
        if (localzpu.a.getIndex() == this.b.getWorksheets().P())
        {
          paramzcjz.a("firstSheet", zauj.z(localzpu.c - 1));
          break;
        }
      }
    }
    if (this.b.getWorksheets().getActiveSheetIndex() >= 0) {
      for (i = 0; i < this.c.c.size(); i++)
      {
        localzpu = (zpu)this.c.c.get(i);
        if (localzpu.a.getIndex() == this.b.getWorksheets().getActiveSheetIndex()) {
          paramzcjz.a("activeTab", zauj.z(localzpu.c - 1));
        }
      }
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, int paramInt, String paramString)
    throws Exception
  {
    paramzcjz.b("pivotCache");
    paramzcjz.a("cacheId", zauj.z(paramInt));
    paramzcjz.a("r:id", paramString);
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    if (this.c.h == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.c.h.iterator();
    zri localzri;
    while (localIterator.hasNext())
    {
      localzri = (zri)localIterator.next();
      if (zw.b(localzri.b.d, paramString1)) {
        zf.a(localArrayList, localzri);
      }
    }
    if (localArrayList.size() == 0) {
      return;
    }
    if (paramString1 != null)
    {
      paramzcjz.b("ext");
      paramzcjz.a("uri", paramString1);
      paramzcjz.a("xmlns", paramString2, null, paramString3);
      paramzcjz.a(paramString2, "pivotCaches", false);
    }
    else
    {
      paramzcjz.b("pivotCaches");
    }
    localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localzri = (zri)localIterator.next();
      if (zw.b(localzri.b.d, paramString1)) {
        a(paramzcjz, localzri.b.b, localzri.c);
      }
    }
    paramzcjz.b();
    if (paramString1 != null) {
      paramzcjz.b();
    }
  }
  
  private void n(zcjz paramzcjz)
    throws Exception
  {
    zqp localzqp = this.b.getSettings().x();
    if (localzqp == null)
    {
      String str = "<fileVersion appName=\"xl\" lastEdited=\"4\" lowestEdited=\"4\" rupBuild=\"9302\" />";
      paramzcjz.d(str);
      return;
    }
    if (localzqp != null)
    {
      paramzcjz.b("fileVersion");
      if (localzqp.a != null) {
        paramzcjz.a("appName", localzqp.a);
      }
      if (localzqp.b != null) {
        paramzcjz.a("lastEdited", localzqp.b);
      }
      if (localzqp.c != null) {
        paramzcjz.a("lowestEdited", localzqp.c);
      }
      if (localzqp.d != null) {
        paramzcjz.a("rupBuild", localzqp.d);
      }
      if (localzqp.e != null) {
        paramzcjz.a("codeName", localzqp.e);
      }
      paramzcjz.b();
    }
  }
  
  private void o(zcjz paramzcjz)
    throws Exception
  {
    if (!this.b.getWorksheets().F()) {
      return;
    }
    paramzcjz.b("workbookProtection");
    zbyy localzbyy = this.b.getWorksheets().D();
    if (localzbyy.c != null)
    {
      ztm localztm = localzbyy.c;
      if (localztm.a == null)
      {
        if (localztm.b() != 0) {
          paramzcjz.a("workbookPassword", zp.c(localztm.b()));
        }
      }
      else
      {
        paramzcjz.a("workbookAlgorithmName", localztm.a);
        paramzcjz.a("workbookHashValue", ze.a(localztm.b));
        paramzcjz.a("workbookSaltValue", ze.a(localztm.c));
        paramzcjz.a("workbookSpinCount", zauj.z(localztm.d));
      }
    }
    if (localzbyy.b) {
      paramzcjz.a("lockStructure", "1");
    }
    if (localzbyy.a) {
      paramzcjz.a("lockWindows", "1");
    }
    paramzcjz.b();
  }
  
  private void p(zcjz paramzcjz)
    throws Exception
  {
    String str1 = null;
    String str2 = this.b.getWorksheets().j();
    boolean bool = false;
    if (this.b.a != null)
    {
      zql localzql = this.b.a.g;
      str1 = localzql.b;
      bool = localzql.c;
    }
    paramzcjz.b("workbookPr");
    if (this.b.getSettings().getDate1904()) {
      paramzcjz.a("date1904", "1");
    }
    switch (this.b.getSettings().getUpdateLinksType())
    {
    case 2: 
      paramzcjz.a("updateLinks", "always");
      break;
    case 1: 
      paramzcjz.a("updateLinks", "never");
      break;
    }
    if (str2 != null) {
      paramzcjz.a("codeName", str2);
    }
    if (this.b.getSettings().getRemovePersonalInformation()) {
      paramzcjz.a("filterPrivacy", "1");
    }
    if (this.b.getSettings().getHidePivotFieldList()) {
      paramzcjz.a("hidePivotFieldList", "1");
    }
    if (this.b.getWorksheets().isRefreshAllConnections()) {
      paramzcjz.a("refreshAllConnections", "1");
    }
    if (bool) {
      paramzcjz.a("publishItems", "1");
    }
    if ((str1 != null) && (!this.b.c)) {
      paramzcjz.a("defaultThemeVersion", str1);
    }
    if (!this.b.getSettings().getAutoCompressPictures()) {
      paramzcjz.a("autoCompressPictures", "0");
    }
    paramzcjz.b();
  }
  
  private void q(zcjz paramzcjz)
    throws Exception
  {
    zbth localzbth = this.b.getWorksheets().w();
    if (this.c.u.size() == 0) {
      return;
    }
    paramzcjz.b("externalReferences");
    for (int i = 0; i < localzbth.getCount(); i++)
    {
      zrl localzrl = (zrl)this.c.u.get(Integer.valueOf(i));
      if (localzrl != null)
      {
        paramzcjz.b("externalReference");
        paramzcjz.a("r:id", null, localzrl.b);
        paramzcjz.b();
      }
    }
    paramzcjz.b();
  }
  
  private void r(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("definedNames");
    Iterator localIterator = this.b.getWorksheets().getNames().iterator();
    while (localIterator.hasNext())
    {
      Name localName = (Name)localIterator.next();
      if (localName.r() != 1)
      {
        String str1 = localName.m();
        if ((str1 != null) && (str1.length() > 1))
        {
          if (str1.charAt(0) == '=') {
            str1 = str1.substring(1);
          }
          if (str1.equals("{}")) {
            str1 = "#REF!";
          }
          if ((localName.r() == 0) && (str1.startsWith("#REF!"))) {}
          switch (localName.t())
          {
          case 6: 
          case 7: 
          case 13: 
            break;
          default: 
            int i = -1;
            if (localName.getSheetIndex() != 0) {
              for (int j = 0; j < this.c.c.size(); j++)
              {
                zpu localzpu = (zpu)this.c.c.get(j);
                if (localName.getSheetIndex() - 1 == localzpu.a.getIndex())
                {
                  i = localzpu.c - 1;
                  break;
                }
              }
            }
            String str2 = localName.getText();
            if (localName.t() != 0) {
              switch (localName.t())
              {
              case 4: 
                str2 = "_xlnm.Database";
                break;
              case 7: 
                str2 = "_xlnm.Print_Titles";
                break;
              case 6: 
                str2 = "_xlnm.Print_Area";
                break;
              case 13: 
                str2 = "_xlnm._FilterDatabase";
                break;
              }
            } else if (zw.a(str2, "_FilterDatabase", true, za.b()) == 0) {
              str2 = "_xlnm._FilterDatabase";
            } else if (zw.a(str2, "Print_Area", true, za.b()) == 0) {
              str2 = "_xlnm.Print_Area";
            } else if (zw.a(str2, "Print_Titles", true, za.b()) == 0) {
              str2 = "_xlnm.Print_Titles";
            } else if (zw.a(str2, "Database", true, za.b()) == 0) {
              str2 = "_xlnm.Database";
            }
            if (localName.a == null) {
              a(paramzcjz, str2, i, str1, localName.n(), null, null, localName.getComment());
            } else {
              a(paramzcjz, str2, i, str1, localName.n(), localName.a.b, localName.a.a, localName.getComment());
            }
            break;
          }
        }
      }
    }
    s(paramzcjz);
    paramzcjz.b();
  }
  
  private void s(zcjz paramzcjz)
    throws Exception
  {
    if ((this.b.a == null) || (this.b.a.g.g.size() == 0)) {
      return;
    }
    ArrayList localArrayList = this.b.a.g.g;
    for (int i = 0; i < localArrayList.size(); i++)
    {
      int j = -1;
      zrf localzrf = (zrf)localArrayList.get(i);
      if (localzrf.c != null) {
        for (int k = 0; k < this.c.c.size(); k++)
        {
          zpu localzpu = (zpu)this.c.c.get(k);
          if (localzrf.c == localzpu.a)
          {
            j = localzpu.c - 1;
            break;
          }
        }
      }
      a(paramzcjz, localzrf.a, j, localzrf.b, false, localzrf.e, localzrf.d, null);
    }
  }
  
  private void a(zcjz paramzcjz, String paramString1, int paramInt, String paramString2, boolean paramBoolean, String paramString3, String paramString4, String paramString5)
    throws Exception
  {
    paramzcjz.b("definedName");
    paramzcjz.a("name", paramString1);
    if (paramInt != -1) {
      paramzcjz.a("localSheetId", zauj.z(paramInt));
    }
    if (paramBoolean) {
      paramzcjz.a("hidden", "1");
    }
    if (paramString3 != null) {
      paramzcjz.a("publishToServer", paramString3);
    }
    if (paramString4 != null) {
      paramzcjz.a("workbookParameter", paramString4);
    }
    if (paramString5 != null) {
      paramzcjz.a("comment", paramString5);
    }
    paramzcjz.a(paramString2);
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */