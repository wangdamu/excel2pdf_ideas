package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zakx
{
  private zri c;
  private zawp d;
  private Workbook e;
  private HashMap f;
  String a;
  int b = 0;
  private static final za g = new za(new String[] { "formula", "cacheIndex", "outline", "fieldPosition", "field", "count", "name", "numFmtId", "databaseField", "base", "par", "groupBy", "autoEnd", "autoStart", "startDate", "endDate", "startNum", "endNum", "groupInterval", "containsBlank", "containsDate", "containsMixedTypes", "containsNumber", "containsInteger", "containsNonDate", "containsString", "containsSemiMixedTypes", "minDate", "maxDate", "longText", "id", "createdVersion", "refreshedVersion", "minRefreshableVersion", "refreshOnLoad", "saveData", "recordCount", "missingItemsLimit", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheRecords", "i1", "i2", "i3", "i4", "ref", "sheet" });
  
  zakx(zri paramzri, HashMap paramHashMap)
  {
    this.c = paramzri;
    this.d = this.c.b;
    this.f = paramHashMap;
    this.e = this.d.e.a.p();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.e.i();
    n(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    if (("pivotCacheDefinition".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
      h(paramzcjy);
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("cacheSource".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        i(paramzcjy);
        if (this.d.b()) {
          paramzcjy.h();
        }
      }
      else if (("cacheFields".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        f(paramzcjy);
      }
      else if (("calculatedItems".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        d(paramzcjy);
      }
      else if (("extLst".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        b(paramzcjy);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  void b(zcjy paramzcjy)
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
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("ext".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        c(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void c(zcjy paramzcjy)
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
      else if (("pivotCacheDefinition".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        if (paramzcjy.a("pivotCacheId") != null) {
          this.d.c = zauj.F(paramzcjy.a("pivotCacheId"));
        }
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("calculatedItem".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        e(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    zaxa localzaxa = new zaxa(this.d);
    if (this.d.m == null) {
      this.d.m = new zawz();
    }
    this.d.m.a(localzaxa);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 0: 
          String str = paramzcjy.t();
          if (!str.startsWith("=")) {
            str = "=" + str;
          }
          localzaxa.b(str);
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pivotArea".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localzaxa);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zaxa paramzaxa)
    throws Exception
  {
    zbur localzbur = new zbur();
    paramzaxa.g = localzbur;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 1: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.e(true);
          }
          break;
        case 2: 
          if ("1".equals(paramzcjy.t())) {
            localzbur.f(true);
          } else {
            localzbur.f(false);
          }
          break;
        case 3: 
          localzbur.a = ((byte)zauj.H(paramzcjy.t()));
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("references".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localzbur, paramzaxa);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zbur paramzbur, zaxa paramzaxa)
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
      if (("reference".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy, paramzbur, paramzaxa);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, zbur paramzbur, zaxa paramzaxa)
    throws Exception
  {
    zbtz localzbtz = new zbtz();
    zf.a(paramzbur.e, localzbtz);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 4: 
          localzbtz.b(zauj.H(paramzcjy.t()));
          paramzaxa.a(zauj.H(paramzcjy.t()));
          localzbtz.b = (paramzaxa.a() | 0x400);
          localzbtz.a(1);
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("x".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        String str = paramzcjy.a("v");
        if (localzbtz.c == null) {
          localzbtz.c = new ArrayList();
        }
        zf.a(localzbtz.c, Integer.valueOf(zauj.F(str)));
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("cacheField".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        g(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    this.d.h = new zawu(this.d);
  }
  
  private void g(zcjy paramzcjy)
    throws Exception
  {
    zbtv localzbtv = new zbtv(this.d);
    localzbtv.e(true);
    if (this.d.i == null) {
      this.d.i = new ArrayList();
    }
    zf.a(this.d.i, localzbtv);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 6: 
          localzbtv.a = paramzcjy.t();
          if ((localzbtv.c()) && (!localzbtv.m())) {
            localzbtv.c = new ArrayList();
          }
          break;
        case 7: 
          localzbtv.q = zauj.F(paramzcjy.t());
          break;
        case 8: 
          if ("0".equals(paramzcjy.t())) {
            localzbtv.o = true;
          }
          break;
        case 0: 
          localzbtv.g(true);
          localzbtv.d = ("=" + paramzcjy.t());
          localzbtv.f = new ArrayList();
          try
          {
            WorksheetCollection localWorksheetCollection = this.e.getWorksheets();
            localWorksheetCollection.a(this.d);
            localzbtv.e = localWorksheetCollection.y().a(-1, localzbtv.d, 0, 0, 0, 64, false, false, false);
            localWorksheetCollection.a(null);
          }
          catch (Exception localException) {}
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("sharedItems".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        b(paramzcjy, localzbtv);
      } else if (("fieldGroup".equals(paramzcjy.q())) && (paramzcjy.s() == 1)) {
        a(paramzcjy, localzbtv);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zbtv paramzbtv)
    throws Exception
  {
    SxRng localSxRng = new SxRng(paramzbtv);
    paramzbtv.j = localSxRng;
    paramzbtv.h(true);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 9: 
          localSxRng.k = zauj.F(paramzcjy.t());
          break;
        case 10: 
          localSxRng.l = zauj.F(paramzcjy.t());
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
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("rangePr".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        b(paramzcjy, localSxRng);
        paramzcjy.a();
      }
      else if (("discretePr".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        a(paramzcjy, localSxRng);
        paramzcjy.a();
      }
      else if (("groupItems".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        c(paramzcjy, localSxRng);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, SxRng paramSxRng)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramSxRng.n = new ArrayList();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("x".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        zf.a(paramSxRng.n, paramzcjy.a("v"));
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy, SxRng paramSxRng)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 11: 
          paramSxRng.c = zauj.aS(paramzcjy.t());
          break;
        case 12: 
          if ("1".equals(paramzcjy.t())) {
            paramSxRng.b = true;
          } else {
            paramSxRng.b = false;
          }
          break;
        case 13: 
          if ("1".equals(paramzcjy.t())) {
            paramSxRng.a = true;
          } else {
            paramSxRng.a = false;
          }
          break;
        case 14: 
          paramSxRng.f = DateTime.a(paramzcjy.t());
          break;
        case 15: 
          paramSxRng.g = DateTime.a(paramzcjy.t());
          break;
        case 16: 
          paramSxRng.h = zauj.C(paramzcjy.t());
          break;
        case 17: 
          paramSxRng.i = zauj.C(paramzcjy.t());
          break;
        case 18: 
          paramSxRng.j = zauj.C(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
  }
  
  private void c(zcjy paramzcjy, SxRng paramSxRng)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramSxRng.d = new ArrayList();
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
        zbos localzbos;
        if (("s".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = paramzcjy.a("v");
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramSxRng.d, localzbos);
          paramzcjy.a();
        }
        else if (("n".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = Double.valueOf(zauj.C(paramzcjy.a("v")));
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramSxRng.d, localzbos);
          paramzcjy.a();
        }
        else if (("d".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = ze.h(paramzcjy.a("v"));
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramSxRng.d, localzbos);
          paramzcjy.a();
        }
        else if (("b".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = Boolean.valueOf("1".equals(paramzcjy.a("v")));
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramSxRng.d, localzbos);
          paramzcjy.a();
        }
        else if (("m".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = null;
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramSxRng.d, localzbos);
          paramzcjy.a();
        }
        else if (("e".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = paramzcjy.a("v");
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramSxRng.d, localzbos);
          paramzcjy.a();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, zbtv paramzbtv)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 19: 
          if ("1".equals(paramzcjy.t())) {
            paramzbtv.j(true);
          } else {
            paramzbtv.j(false);
          }
          break;
        case 20: 
          if ("1".equals(paramzcjy.t())) {
            paramzbtv.f(true);
          } else {
            paramzbtv.f(false);
          }
          break;
        case 21: 
          if (("1".equals(paramzcjy.t())) && (paramzbtv.j())) {
            paramzbtv.b(true);
          }
          break;
        case 22: 
          if ("1".equals(paramzcjy.t())) {
            paramzbtv.b(true);
          } else {
            paramzbtv.b(false);
          }
          break;
        case 23: 
          if ("1".equals(paramzcjy.t())) {
            paramzbtv.c(true);
          } else {
            paramzbtv.c(false);
          }
          break;
        case 24: 
          break;
        case 25: 
          if ("1".equals(paramzcjy.t())) {
            paramzbtv.e(true);
          } else {
            paramzbtv.e(false);
          }
          break;
        case 26: 
          break;
        case 27: 
          paramzbtv.k = paramzcjy.t();
          break;
        case 28: 
          paramzbtv.l = paramzcjy.t();
          break;
        case 29: 
          if ("1".equals(paramzcjy.t())) {
            paramzbtv.p = true;
          } else {
            paramzbtv.p = false;
          }
          break;
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzbtv.a(false);
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
        paramzbtv.a(true);
        zbos localzbos;
        String str;
        if (("s".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          str = paramzcjy.a("v");
          localzbos.a = zauj.b(str);
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramzbtv.c, localzbos);
          paramzcjy.a();
        }
        else if (("n".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          str = paramzcjy.a("v");
          localzbos.a = Double.valueOf(zauj.C(str));
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          localzbos.d = str;
          zf.a(paramzbtv.c, localzbos);
          paramzcjy.a();
        }
        else if (("d".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = ze.h(paramzcjy.a("v"));
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramzbtv.c, localzbos);
          paramzcjy.a();
        }
        else if (("b".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = Boolean.valueOf("1".equals(paramzcjy.a("v")));
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramzbtv.c, localzbos);
          paramzcjy.a();
        }
        else if (("m".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = null;
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramzbtv.c, localzbos);
          paramzcjy.a();
        }
        else if (("e".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
        {
          localzbos = new zbos();
          localzbos.a = paramzcjy.a("v");
          if ("1".equals(paramzcjy.a("f"))) {
            localzbos.b = true;
          }
          if ("1".equals(paramzcjy.a("u"))) {
            localzbos.c = true;
          }
          zf.a(paramzbtv.c, localzbos);
          paramzcjy.a();
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
  }
  
  private void h(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.d.a(true, 1);
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 30: 
          this.a = paramzcjy.t();
          break;
        case 31: 
          this.d.o = paramzcjy.t();
          break;
        case 32: 
          this.d.p = paramzcjy.t();
          break;
        case 33: 
          this.d.q = paramzcjy.t();
          break;
        case 34: 
          if ("1".equals(paramzcjy.t())) {
            this.d.a(true);
          }
          break;
        case 35: 
          if ("0".equals(paramzcjy.t())) {
            this.d.a(false, 1);
          }
          break;
        case 36: 
          this.b = zauj.F(paramzcjy.t());
          break;
        case 37: 
          this.d.t = zauj.F(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
  }
  
  private void i(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("type");
    byte b1 = zauj.ag(str1);
    this.d.f = zawr.a(this.d, b1);
    if (this.d.b())
    {
      String str2 = paramzcjy.a("connectionId");
      zbxs localzbxs = (zbxs)this.d.f;
      if (str2 != null) {
        localzbxs.a = zauj.F(str2);
      }
      if (this.f != null)
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = this.f.values().iterator();
        while (localIterator.hasNext())
        {
          zrl localzrl = (zrl)localIterator.next();
          switch (g.a(localzrl.c))
          {
          case 38: 
            break;
          default: 
            zf.a(localArrayList, localzrl);
          }
        }
        if (localArrayList.size() > 0) {
          localzbxs.c = localArrayList;
        }
      }
      return;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ("worksheetSource".equals(paramzcjy.q())) {
        m(paramzcjy);
      } else if ("consolidation".equals(paramzcjy.q())) {
        j(paramzcjy);
      }
    }
    paramzcjy.h();
  }
  
  private void j(zcjy paramzcjy)
    throws Exception
  {
    zno localzno = (zno)this.d.f;
    localzno.a = zauj.b(paramzcjy.a("autoPage"), true);
    if (paramzcjy.o()) {
      throw new CellsException(6, "The file is corrupted.");
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (("pages".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        k(paramzcjy);
      }
      else if (("rangeSets".equals(paramzcjy.q())) && (paramzcjy.s() == 1))
      {
        int i = localzno.c == null ? 0 : localzno.c.length;
        a(paramzcjy, i);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    int i = 0;
    int j = zauj.F(paramzcjy.a("count"));
    zno localzno = (zno)this.d.f;
    localzno.b = new znp[j];
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ("rangeSet".equals(paramzcjy.q()))
      {
        znp localznp = new znp(localzno, paramInt);
        localzno.b[i] = localznp;
        a(paramzcjy, localznp);
        i++;
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    this.d.h = new zawu(this.d);
  }
  
  private void k(zcjy paramzcjy)
    throws Exception
  {
    int i = 0;
    int j = zauj.F(paramzcjy.a("count"));
    zno localzno = (zno)this.d.f;
    if (!localzno.a) {
      localzno.c = new String[j][];
    } else {
      localzno.c = new String[1][];
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      if ("page".equals(paramzcjy.q()))
      {
        localzno.c[i] = l(paramzcjy);
        i++;
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private String[] l(zcjy paramzcjy)
    throws Exception
  {
    int i = 0;
    int j = zauj.F(paramzcjy.a("count"));
    String[] arrayOfString = new String[j];
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return arrayOfString;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("pageItem".equals(paramzcjy.q()))
      {
        arrayOfString[i] = paramzcjy.a("name");
        i++;
      }
      paramzcjy.a();
    }
    return arrayOfString;
  }
  
  private void a(zcjy paramzcjy, znp paramznp)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    String str3 = null;
    if (paramzcjy.n())
    {
      if (paramzcjy.a("i4") != null) {
        paramznp.a = new int[4];
      } else if (paramzcjy.a("i3") != null) {
        paramznp.a = new int[3];
      } else if (paramzcjy.a("i2") != null) {
        paramznp.a = new int[2];
      } else {
        paramznp.a = new int[1];
      }
      while (paramzcjy.m()) {
        switch (g.a(paramzcjy.q()))
        {
        case 39: 
          paramznp.a[0] = zauj.F(paramzcjy.t());
          break;
        case 40: 
          paramznp.a[1] = zauj.F(paramzcjy.t());
          break;
        case 41: 
          paramznp.a[2] = zauj.F(paramzcjy.t());
          break;
        case 42: 
          paramznp.a[3] = zauj.F(paramzcjy.t());
          break;
        case 6: 
        case 43: 
          str1 = paramzcjy.t();
          break;
        case 44: 
          str2 = paramzcjy.t();
          break;
        case 30: 
          str3 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    String str4 = zboy.a(this.f, str3, str2, str1);
    paramznp.b.a(str4, null);
  }
  
  private void m(zcjy paramzcjy)
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    String str3 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("ref".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.t();
        }
        else if ("name".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.t();
          if (str1.startsWith("=")) {
            str1 = str1.substring(1);
          }
        }
        else if ("sheet".equals(paramzcjy.q()))
        {
          str2 = paramzcjy.t();
        }
        else if ("id".equals(paramzcjy.q()))
        {
          str3 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
    String str4 = zboy.a(this.f, str3, str2, str1);
    ((zboy)this.d.f).a(str4, null);
  }
  
  private void n(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"pivotCacheDefinition".equals(paramzcjy.q()))) {
      throw new IllegalStateException("pivotCacheDefinition root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */