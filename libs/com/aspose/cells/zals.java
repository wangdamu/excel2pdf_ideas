package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.HashMap;

class zals
{
  private zqh a = null;
  private int b;
  private static final com.aspose.cells.b.c.a.za c = new com.aspose.cells.b.c.a.za(new String[] { "{BBE1A952-AA13-448e-AADC-164F8A28A991}", "{46BE6895-7355-4a93-B00E-2C351335B9C9}", "{876F7934-8845-4945-9796-88D515C7AA90}", "{841E416B-1EF1-43b6-AB56-02D37102CBD5}", "slicerCaches", "pivotCaches", "autoRecover", "crashSave", "dataExtractLoad", "repairLoad", "name", "guid", "activeSheetId", "xWindow", "yWindow", "windowWidth", "windowHeight", "mergeInterval", "personalView", "maximized", "autoUpdate", "changesSavedWin", "includeHiddenRowCol", "includePrintSettings", "minimized", "onlySync", "showFormulaBar", "showHorizontalScroll", "showVerticalScroll", "showSheetTabs", "showStatusbar", "tabRatio", "showComments", "ObjectDisplayType", "commNone", "commIndicator", "none", "placeholders", "embed", "show", "all", "noIndicator", "namespaceUri", "url", "readOnlyRecommended", "reservationPassword", "userName", "algorithmName", "hashValue", "saltValue", "spinCount" });
  
  zals(zqh paramzqh)
  {
    this.a = paramzqh;
  }
  
  void a(zcjy paramzcjy, boolean paramBoolean)
    throws Exception
  {
    Object localObject;
    if (paramBoolean)
    {
      r(paramzcjy);
      localObject = null;
      if (paramzcjy.n())
      {
        while (paramzcjy.m()) {
          if ((!"xmlns".equals(paramzcjy.p())) && (!"xmlns:r".equals(paramzcjy.p())))
          {
            if (localObject == null)
            {
              localObject = new HashMap();
              this.a.a.a.g.f = ((HashMap)localObject);
            }
            ((HashMap)localObject).put(paramzcjy.p(), paramzcjy.t());
          }
        }
        paramzcjy.l();
      }
    }
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("bookViews".equals(paramzcjy.q()))
      {
        o(paramzcjy);
      }
      else if ("sheets".equals(paramzcjy.q()))
      {
        p(paramzcjy);
      }
      else if ("externalReferences".equals(paramzcjy.q()))
      {
        k(paramzcjy);
      }
      else if ("definedNames".equals(paramzcjy.q()))
      {
        q(paramzcjy);
      }
      else if ("workbookPr".equals(paramzcjy.q()))
      {
        n(paramzcjy);
      }
      else if ("AlternateContent".equals(paramzcjy.q()))
      {
        l(paramzcjy);
      }
      else if ("absPath".equals(paramzcjy.q()))
      {
        m(paramzcjy);
      }
      else if ("fileVersion".equals(paramzcjy.q()))
      {
        j(paramzcjy);
      }
      else if ("fileSharing".equals(paramzcjy.q()))
      {
        i(paramzcjy);
      }
      else if ("pivotCaches".equals(paramzcjy.q()))
      {
        c(paramzcjy, null);
      }
      else if ("workbookProtection".equals(paramzcjy.q()))
      {
        h(paramzcjy);
      }
      else if ("calcPr".equals(paramzcjy.q()))
      {
        g(paramzcjy);
      }
      else if ("oleSize".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("ref", null);
        if ((localObject != null) && (!"".equals(localObject))) {
          this.a.a.getWorksheets().setOleSize((CellArea)CellArea.a((String)localObject, true));
        }
        paramzcjy.a();
      }
      else if ("customWorkbookViews".equals(paramzcjy.q()))
      {
        d(paramzcjy);
      }
      else if ("extLst".equals(paramzcjy.q()))
      {
        b(paramzcjy);
      }
      else if ("smartTagPr".equals(paramzcjy.q()))
      {
        e(paramzcjy);
      }
      else if ("smartTagTypes".equals(paramzcjy.q()))
      {
        f(paramzcjy);
      }
      else if ("fileRecoveryPr".equals(paramzcjy.q()))
      {
        c(paramzcjy);
      }
      else
      {
        paramzcjy.a();
      }
    }
    if (this.a.a.getWorksheets().getCount() == 0) {
      throw new CellsException(18, "File is corrupted.");
    }
    this.a.a.getWorksheets().setActiveSheetIndex(this.b);
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    HashMap localHashMap = this.a.a.a.g.h;
    Object localObject;
    if (paramzcjy.n())
    {
      localObject = null;
      while (paramzcjy.m())
      {
        String str = paramzcjy.p();
        if ((str.startsWith("xmlns")) && (!"xmlns".equals(paramzcjy.p())) && (!"xmlns:r".equals(paramzcjy.p())))
        {
          if (localObject == null)
          {
            localObject = new HashMap();
            this.a.a.a.g.f = ((HashMap)localObject);
          }
          ((HashMap)localObject).put(paramzcjy.p(), paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      localObject = paramzcjy.a("uri");
      switch (c.a((String)localObject))
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
        a(paramzcjy, (String)localObject);
        break;
      default: 
        localHashMap.put(localObject, paramzcjy.v());
      }
    }
  }
  
  private void a(zcjy paramzcjy, String paramString)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q()))
      {
      case 4: 
        b(paramzcjy, paramString);
        break;
      case 5: 
        c(paramzcjy, paramString);
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy, String paramString)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("slicerCache".equals(paramzcjy.q()))
      {
        zrl localzrl = (zrl)this.a.b().get(paramzcjy.a("id"));
        localzrl.a = paramString;
        if (this.a.q == null) {
          this.a.q = new ArrayList();
        }
        zf.a(this.a.q, localzrl);
      }
      paramzcjy.a();
    }
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    WorkbookSettings localWorkbookSettings = this.a.a.getSettings();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 6: 
          localWorkbookSettings.setAutoRecover(zauj.aB(paramzcjy.t()));
          break;
        case 7: 
          localWorkbookSettings.setCrashSave(zauj.aB(paramzcjy.t()));
          break;
        case 8: 
          localWorkbookSettings.setDataExtractLoad(zauj.aB(paramzcjy.t()));
          break;
        case 9: 
          localWorkbookSettings.setRepairLoad(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if (("customWorkbookView".equals(paramzcjy.q())) && (paramzcjy.n()))
      {
        zoj localzoj = new zoj();
        this.a.a.getWorksheets().n().a(localzoj);
        while (paramzcjy.m())
        {
          int i;
          switch (c.a(paramzcjy.q()))
          {
          case 10: 
            localzoj.j = paramzcjy.t();
            break;
          case 11: 
            localzoj.b = new zh(paramzcjy.t().substring(1, 1 + (paramzcjy.t().length() - 2)));
            break;
          case 12: 
            i = (int)(zauj.G(paramzcjy.t()) & 0xFFFFFFFF);
            if (i > 0) {
              localzoj.a = i;
            }
            break;
          case 13: 
            i = zauj.F(paramzcjy.t());
            if (i < 0) {
              i = 0;
            }
            localzoj.c = i;
            break;
          case 14: 
            localzoj.d = zauj.F(paramzcjy.t());
            break;
          case 15: 
            localzoj.e = zauj.F(paramzcjy.t());
            break;
          case 16: 
            localzoj.f = zauj.F(paramzcjy.t());
            break;
          case 17: 
            localzoj.i = zauj.F(paramzcjy.t());
            break;
          case 18: 
            localzoj.k(zauj.aB(paramzcjy.t()));
            break;
          case 19: 
            localzoj.m(zauj.aB(paramzcjy.t()));
            break;
          case 20: 
            localzoj.h(zauj.aB(paramzcjy.t()));
            break;
          case 21: 
            localzoj.i(zauj.aB(paramzcjy.t()));
            break;
          case 22: 
            localzoj.f(zauj.aB(paramzcjy.t()));
            break;
          case 23: 
            localzoj.e(zauj.aB(paramzcjy.t()));
            break;
          case 24: 
            localzoj.l(zauj.aB(paramzcjy.t()));
            break;
          case 25: 
            localzoj.j(zauj.aB(paramzcjy.t()));
            break;
          case 26: 
            localzoj.a(zauj.aB(paramzcjy.t()));
            break;
          case 27: 
            localzoj.n(zauj.aB(paramzcjy.t()));
            break;
          case 28: 
            localzoj.c(zauj.aB(paramzcjy.t()));
            break;
          case 29: 
            localzoj.d(zauj.aB(paramzcjy.t()));
            break;
          case 30: 
            localzoj.b(zauj.aB(paramzcjy.t()));
            break;
          case 31: 
            localzoj.h = zauj.F(paramzcjy.t());
            break;
          case 32: 
            switch (c.a(paramzcjy.t()))
            {
            case 34: 
              localzoj.a(2);
              break;
            case 35: 
              localzoj.a(1);
            }
            break;
          case 33: 
            switch (c.a(paramzcjy.t()))
            {
            case 36: 
              localzoj.b(1);
              break;
            case 37: 
              localzoj.b(2);
            }
            break;
          }
        }
        paramzcjy.l();
      }
      paramzcjy.a();
    }
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      Workbook localWorkbook = this.a.a;
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 38: 
          if ("1".equals(paramzcjy.t())) {
            localWorkbook.getSettings().o().setEmbedSmartTags(true);
          }
          break;
        case 39: 
          switch (c.a(paramzcjy.t()))
          {
          case 40: 
            localWorkbook.getSettings().o().setShowType(0);
            break;
          case 36: 
            localWorkbook.getSettings().o().setShowType(2);
            break;
          case 41: 
            localWorkbook.getSettings().o().setShowType(1);
          }
          break;
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        if (("smartTagType".equals(paramzcjy.q())) && (paramzcjy.n()))
        {
          String str1 = null;
          String str2 = null;
          String str3 = null;
          while (paramzcjy.m()) {
            switch (c.a(paramzcjy.q()))
            {
            case 42: 
              str1 = paramzcjy.t();
              break;
            case 10: 
              str2 = paramzcjy.t();
              break;
            case 43: 
              str3 = paramzcjy.t();
            }
          }
          paramzcjy.l();
          if ((str1 != null) && (str2 != null)) {
            this.a.a.getWorksheets().aa().a(str1, str2, str3);
          }
        }
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      WorksheetCollection localWorksheetCollection = this.a.a.getWorksheets();
      try
      {
        while (paramzcjy.m()) {
          if ("calcMode".equals(paramzcjy.q())) {
            this.a.a.getSettings().setCalcMode(zauj.ay(paramzcjy.t()));
          } else if ("fullPrecision".equals(paramzcjy.q())) {
            localWorksheetCollection.p().getSettings().setPrecisionAsDisplayed(!zauj.aB(paramzcjy.t()));
          } else if ("calcOnSave".equals(paramzcjy.q())) {
            this.a.a.getSettings().setRecalculateBeforeSave(zauj.aB(paramzcjy.t()));
          } else if ("fullCalcOnLoad".equals(paramzcjy.q())) {
            this.a.a.getSettings().setReCalculateOnOpen(zauj.aB(paramzcjy.t()));
          } else if ("iterate".equals(paramzcjy.q())) {
            this.a.a.getSettings().setIteration(zauj.aB(paramzcjy.t()));
          } else if ("iterateCount".equals(paramzcjy.q())) {
            this.a.a.getSettings().setMaxIteration(zauj.F(paramzcjy.t()));
          } else if ("iterateDelta".equals(paramzcjy.q())) {
            this.a.a.getSettings().setMaxChange(zauj.C(paramzcjy.t()));
          } else if ("refMode".equals(paramzcjy.q())) {
            this.a.a.getSettings().a("R1C1".equals(paramzcjy.t()));
          } else if ("calcId".equals(paramzcjy.q())) {
            this.a.a.getSettings().b = paramzcjy.t();
          }
        }
      }
      catch (Exception localException) {}
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      WorksheetCollection localWorksheetCollection = this.a.a.getWorksheets();
      zbyy localzbyy = localWorksheetCollection.D();
      while (paramzcjy.m()) {
        if ("workbookPassword".equals(paramzcjy.q())) {
          localzbyy.a().a(zp.a(paramzcjy.t(), 515, com.aspose.cells.b.a.c.za.b()));
        } else if ("lockStructure".equals(paramzcjy.q())) {
          localzbyy.b = zauj.aB(paramzcjy.t());
        } else if ("lockWindows".equals(paramzcjy.q())) {
          localzbyy.a = zauj.aB(paramzcjy.t());
        } else if ("workbookAlgorithmName".equals(paramzcjy.q())) {
          localzbyy.a().a = paramzcjy.t();
        } else if ("workbookHashValue".equals(paramzcjy.q())) {
          localzbyy.a().b = ze.b(paramzcjy.t());
        } else if ("workbookSaltValue".equals(paramzcjy.q())) {
          localzbyy.a().c = ze.b(paramzcjy.t());
        } else if ("workbookSpinCount".equals(paramzcjy.q())) {
          localzbyy.a().d = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    r(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("externalReferences".equals(paramzcjy.q())) {
        k(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    this.a.a.getWorksheets().setActiveSheetIndex(this.b);
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    WriteProtection localWriteProtection = this.a.a.getSettings().getWriteProtection();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 44: 
          localWriteProtection.setRecommendReadOnly(zauj.aB(paramzcjy.t()));
          break;
        case 45: 
          if (!"0".equals(paramzcjy.t())) {
            localWriteProtection.a(ze.b(paramzcjy.t(), 16));
          }
          break;
        case 46: 
          localWriteProtection.a = paramzcjy.t();
          break;
        case 47: 
          localWriteProtection.a().a = paramzcjy.t();
          break;
        case 48: 
          localWriteProtection.a().b = ze.b(paramzcjy.t());
          break;
        case 49: 
          localWriteProtection.a().c = ze.b(paramzcjy.t());
          break;
        case 50: 
          localWriteProtection.a().d = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      zqp localzqp = new zqp(false);
      while (paramzcjy.m()) {
        if ("appName".equals(paramzcjy.q())) {
          localzqp.a = paramzcjy.t();
        } else if ("lastEdited".equals(paramzcjy.q())) {
          localzqp.b = paramzcjy.t();
        } else if ("lowestEdited".equals(paramzcjy.q())) {
          localzqp.c = paramzcjy.t();
        } else if ("rupBuild".equals(paramzcjy.q())) {
          localzqp.d = paramzcjy.t();
        } else if ("codeName".equals(paramzcjy.q())) {
          localzqp.e = paramzcjy.t();
        }
      }
      paramzcjy.l();
      this.a.a.getSettings().a(localzqp);
    }
    paramzcjy.a();
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("externalReference".equals(paramzcjy.q()))
      {
        zqs localzqs = new zqs();
        String str = paramzcjy.a("id", null);
        HashMap localHashMap = this.a.b();
        if (!localHashMap.containsKey(str)) {
          throw new CellsException(6, "externalReference rid " + str + " not found in workbook rels file");
        }
        zrl localzrl = (zrl)localHashMap.get(str);
        localzqs.a = localzrl.d;
        zf.a(this.a.r, localzqs);
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private void c(zcjy paramzcjy, String paramString)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    zawq localzawq = this.a.a.getWorksheets().W();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("pivotCache".equals(paramzcjy.q()))
      {
        zaws localzaws = new zaws(localzawq);
        localzaws.d = paramString;
        localzawq.b(localzaws);
        zri localzri = new zri(localzaws);
        localzaws.b = zauj.F(paramzcjy.a("cacheId"));
        if (localzaws.b > localzawq.b) {
          localzawq.b = localzaws.b;
        }
        String str = paramzcjy.a("id", null);
        localzri.c = str;
        zf.a(this.a.h, localzri);
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void l(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("Choice".equals(paramzcjy.q())) {
        a(paramzcjy, false);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void m(zcjy paramzcjy)
    throws Exception
  {
    this.a.a.getWorksheets().a(paramzcjy.a("url"));
    paramzcjy.a();
  }
  
  private void n(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      zql localzql = this.a.a.a.g;
      while (paramzcjy.m()) {
        if ("codeName".equals(paramzcjy.q())) {
          this.a.a.getWorksheets().b(paramzcjy.t());
        } else if ("defaultThemeVersion".equals(paramzcjy.q())) {
          localzql.b = paramzcjy.t();
        } else if ("filterPrivacy".equals(paramzcjy.q())) {
          this.a.a.getSettings().setRemovePersonalInformation(zauj.aB(paramzcjy.t()));
        } else if (("hidePivotFieldList".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
          this.a.a.getSettings().setHidePivotFieldList(true);
        } else if ("refreshAllConnections".equals(paramzcjy.q()))
        {
          if ("1".equals(paramzcjy.t())) {
            this.a.a.getWorksheets().setRefreshAllConnections(true);
          }
        }
        else if ("updateLinks".equals(paramzcjy.q())) {
          this.a.a.getSettings().setUpdateLinksType(zauj.aA(paramzcjy.t()));
        } else if ("publishItems".equals(paramzcjy.q())) {
          localzql.c = zauj.aB(paramzcjy.t());
        } else if ("date1904".equals(paramzcjy.q())) {
          this.a.a.getSettings().setDate1904(zauj.aB(paramzcjy.t()));
        } else if ("autoCompressPictures".equals(paramzcjy.q())) {
          this.a.a.getSettings().setAutoCompressPictures(zauj.aB(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void o(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        if (paramzcjy.s() == 4) {
          break;
        }
        paramzcjy.a();
      }
      else if ("workbookView".equals(paramzcjy.q()))
      {
        if (paramzcjy.n())
        {
          while (paramzcjy.m()) {
            if ("activeTab".equals(paramzcjy.q())) {
              this.b = zauj.F(paramzcjy.t());
            } else if ("firstSheet".equals(paramzcjy.q())) {
              this.a.a.getWorksheets().k(zauj.F(paramzcjy.t()));
            } else if (("showHorizontalScroll".equals(paramzcjy.q())) && ("0".equals(paramzcjy.t()))) {
              this.a.a.getSettings().setVScrollBarVisible(false);
            } else if (("showVerticalScroll".equals(paramzcjy.q())) && ("0".equals(paramzcjy.t()))) {
              this.a.a.getSettings().setVScrollBarVisible(false);
            } else if (("showSheetTabs".equals(paramzcjy.q())) && ("0".equals(paramzcjy.t()))) {
              this.a.a.getSettings().setShowTabs(false);
            } else if (("minimized".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t()))) {
              this.a.a.getSettings().setMinimized(true);
            } else if ("visibility".equals(paramzcjy.q()))
            {
              if ("hidden".equals(paramzcjy.t())) {
                this.a.a.getSettings().setHidden(true);
              } else if ("veryHidden".equals(paramzcjy.t())) {
                this.a.a.getSettings().setHidden(true);
              }
            }
            else if ("tabRatio".equals(paramzcjy.q())) {
              this.a.a.getSettings().setSheetTabBarWidth(zauj.F(paramzcjy.t()));
            } else if ("windowHeight".equals(paramzcjy.q())) {
              this.a.a.getSettings().f(zauj.F(paramzcjy.t()));
            } else if ("windowWidth".equals(paramzcjy.q())) {
              this.a.a.getSettings().e(zauj.F(paramzcjy.t()));
            } else if ("xWindow".equals(paramzcjy.q())) {
              this.a.a.getSettings().c(zauj.F(paramzcjy.t()));
            } else if ("yWindow".equals(paramzcjy.q())) {
              this.a.a.getSettings().d(zauj.F(paramzcjy.t()));
            }
          }
          paramzcjy.l();
        }
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void p(zcjy paramzcjy)
    throws Exception
  {
    this.a.a.getWorksheets().clear();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int i = 0;
    zug.a(this.a.a);
    int j = 0;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("sheet".equals(paramzcjy.q()))
      {
        if (paramzcjy.n())
        {
          String str1 = null;
          String str2 = null;
          String str3 = null;
          String str4 = null;
          String str5 = null;
          while (paramzcjy.m()) {
            if ("name".equals(paramzcjy.q()))
            {
              str1 = paramzcjy.t();
            }
            else if ("sheetId".equals(paramzcjy.q()))
            {
              zauj.F(paramzcjy.t());
              str2 = paramzcjy.t();
            }
            else if ("id".equals(paramzcjy.q()))
            {
              str3 = paramzcjy.t();
            }
            else if ("type".equals(paramzcjy.q()))
            {
              str4 = paramzcjy.t();
            }
            else if ("state".equals(paramzcjy.q()))
            {
              str5 = paramzcjy.t();
            }
          }
          if ((str4 == null) || ("chartsheet".equals(str4)))
          {
            if ((str1 == null) || (str1.length() == 0) || (str2 == null)) {
              throw new CellsException(6, "invalid sheet attributes data");
            }
            Worksheet localWorksheet = this.a.a.getWorksheets().get(this.a.a.getWorksheets().add());
            localWorksheet.b(str1);
            localWorksheet.k = new zqv();
            localWorksheet.setTabId(zauj.F(str2));
            if (localWorksheet.getTabId() > i) {
              i = localWorksheet.getTabId();
            }
            if (str5 != null) {
              if ("hidden".equals(str5)) {
                localWorksheet.a(false, false);
              } else if ("veryHidden".equals(str5)) {
                localWorksheet.a(false, true);
              }
            }
            this.a.a(localWorksheet, j, str2, str3);
          }
          paramzcjy.l();
          j++;
        }
        paramzcjy.a();
      }
    }
    this.a.a.getWorksheets().c = i;
    this.a.a.getWorksheets().r().a(this.a.a.getWorksheets().v());
    paramzcjy.h();
  }
  
  private void q(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    WorksheetCollection localWorksheetCollection = this.a.a.getWorksheets();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("definedName".equals(paramzcjy.q()))
      {
        int i = -1;
        boolean bool1 = false;
        String str1 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        if (paramzcjy.n())
        {
          while (paramzcjy.m()) {
            if ("name".equals(paramzcjy.q())) {
              str1 = paramzcjy.t();
            } else if ("localSheetId".equals(paramzcjy.q()))
            {
              if (zarb.b(paramzcjy.t())) {
                i = zauj.F(paramzcjy.t());
              }
            }
            else if ("hidden".equals(paramzcjy.q())) {
              bool1 = "1".equals(paramzcjy.t());
            } else if ("publishToServer".equals(paramzcjy.q())) {
              str3 = paramzcjy.t();
            } else if ("workbookParameter".equals(paramzcjy.q())) {
              str4 = paramzcjy.t();
            } else if ("comment".equals(paramzcjy.q())) {
              str5 = paramzcjy.t();
            }
          }
          paramzcjy.l();
        }
        str2 = paramzcjy.j();
        if ((str1 != null) && (str2 != null))
        {
          String str6 = str1.toUpperCase();
          boolean bool2 = str6.startsWith("_XLNM.");
          if (bool2)
          {
            str1 = str1.substring(6);
            str6 = str1.toUpperCase(com.aspose.cells.b.a.c.za.b().h());
          }
          if (i != -1) {
            i = this.a.a(i).getIndex();
          }
          int j = -1;
          if (localWorksheetCollection.p().getSettings().getWarningCallback() != null)
          {
            j = localWorksheetCollection.getNames().a(str1, i, false);
            if (j != -1)
            {
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append("Name:").append(str6);
              ((StringBuilder)localObject).append(";ReferTo:").append(str2);
              WarningInfo localWarningInfo = new WarningInfo(1, zs.a(localObject));
              localWorksheetCollection.p().getSettings().getWarningCallback().warning(localWarningInfo);
            }
          }
          if (j == -1) {
            j = localWorksheetCollection.getNames().b(i, str1);
          }
          Object localObject = localWorksheetCollection.getNames().get(j);
          ((Name)localObject).setComment(str5);
          if (bool2) {
            ((Name)localObject).f(str6);
          }
          ((Name)localObject).c = ("=" + str2);
          ((Name)localObject).a(bool1);
          if ((str3 != null) || (str4 != null))
          {
            ((Name)localObject).a = new zqq();
            ((Name)localObject).a.a = str4;
            ((Name)localObject).a.b = str3;
          }
        }
        else
        {
          throw new CellsException(6, "Invalid name data");
        }
      }
    }
    localWorksheetCollection.getNames().a(false);
    paramzcjy.h();
  }
  
  private void r(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.a(0);
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"workbook".equals(paramzcjy.q()))) {
      throw new CellsException(6, "workbook root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zals.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */