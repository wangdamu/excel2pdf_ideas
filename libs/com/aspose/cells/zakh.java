package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zakh
{
  private zqh a = null;
  private Workbook b = null;
  private zcjy c = null;
  private static final za d = new za(new String[] { "webPr", "textPr", "dbPr", "olapPr", "parameters", "extLst", "ext", "connection", "id", "model", "autoDelete", "rangePr", "culture", "embeddedDataId", "local", "localConnection", "localRefresh", "sendLocale", "rowDrillCount", "serverFill", "serverNumberFormat", "serverFont", "serverFontColor", "commandType", "command", "serverCommand", "mac", "win", "dos", "doubleQuote", "none", "singleQuote", "prompt", "fileType", "codePage", "firstRow", "sourceFile", "delimited", "decimal", "thousands", "tab", "space", "comma", "semicolon", "consecutive", "qualifier", "delimiter", "DMY", "DYM", "EMD", "general", "MDY", "MYD", "skip", "YDM", "YMD", "editPage", "htmlFormat", "htmlTables", "parsePre", "post", "sourceData", "textDates", "url", "xl2000", "xl97", "xml", "m", "s", "x", "boolean", "cell", "double", "integer", "name", "parameterType", "refreshOnChange", "sqlType", "string", "background", "credentials", "deleted", "description", "interval", "keepAlive", "minRefreshableVersion", "new", "odcFile", "onlyUseConnectionFile", "reconnectionMethod", "refreshedVersion", "refreshOnLoad", "saveData", "savePassword", "singleSignOnId", "type" });
  
  zakh(zqh paramzqh)
  {
    this.a = paramzqh;
    this.b = paramzqh.a;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy == null) {
      return;
    }
    this.c = paramzcjy;
    paramzcjy.k();
    a();
  }
  
  private void a()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      if ("connection".equals(this.c.q())) {
        b();
      } else {
        this.c.a();
      }
    }
  }
  
  private void b()
    throws Exception
  {
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    Object localObject = null;
    int i = 0;
    if (this.c.n())
    {
      while (this.c.m())
      {
        localHashMap.put(this.c.q(), this.c.t());
        if ("type".equals(this.c.q())) {
          i = zauj.F(this.c.t());
        }
      }
      this.c.l();
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (d.a(this.c.q()))
      {
      case 0: 
        localObject = new WebQueryConnection(this.b.getDataConnections());
        a((WebQueryConnection)localObject);
        break;
      case 1: 
        localObject = new zbvu(this.b.getDataConnections());
        a((zbvu)localObject);
        break;
      case 2: 
        localObject = new DBConnection(this.b.getDataConnections());
        a((DBConnection)localObject);
        break;
      case 3: 
        if (localObject == null) {
          localObject = new DBConnection(this.b.getDataConnections());
        }
        c((ExternalConnection)localObject);
        break;
      case 4: 
        if (localObject == null) {
          localObject = new WebQueryConnection(this.b.getDataConnections());
        }
        d((ExternalConnection)localObject);
        break;
      case 5: 
        if (localObject == null) {
          localObject = zwl.a(i, this.b.getDataConnections());
        }
        a((ExternalConnection)localObject, null);
        break;
      default: 
        localArrayList.add(this.c.v());
      }
    }
    if (localObject == null) {
      localObject = zwl.a(i, this.b.getDataConnections());
    }
    ExternalConnectionCollection localExternalConnectionCollection = this.b.getDataConnections();
    a((ExternalConnection)localObject, localHashMap);
    ((ExternalConnection)localObject).x = localExternalConnectionCollection;
    localExternalConnectionCollection.a((ExternalConnection)localObject);
    if (localArrayList.size() != 0) {
      ((ExternalConnection)localObject).i = localArrayList;
    }
  }
  
  private void a(ExternalConnection paramExternalConnection, String paramString)
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (d.a(this.c.q()))
      {
      case 6: 
        paramString = this.c.a("uri");
        a(paramExternalConnection, paramString);
        break;
      case 7: 
        if (zy.a(paramString, "{D79990A0-CA42-45e3-83F4-45C500A0EAA5}")) {
          b(paramExternalConnection);
        } else if (zy.a(paramString, "{DE250136-89BD-433C-8126-D09CA5730AF9}")) {
          a(paramExternalConnection);
        } else {
          this.c.a();
        }
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void a(ExternalConnection paramExternalConnection)
    throws Exception
  {
    zwd localzwd = new zwd();
    paramExternalConnection.f = localzwd;
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q()))
        {
        case 8: 
          localzwd.b = (zw.b(this.c.t()) ? null : this.c.t());
          break;
        case 9: 
          localzwd.a(zauj.aB(this.c.t()));
          break;
        case 10: 
          localzwd.b(zauj.aB(this.c.t()));
        }
      }
      this.c.l();
    }
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (d.a(this.c.q()))
      {
      case 11: 
        a(this.c, localzwd);
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void a(zcjy paramzcjy, zwd paramzwd)
    throws Exception
  {
    zbao localzbao = new zbao();
    paramzwd.c = localzbao;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("sourceName".equals(paramzcjy.q())) {
          localzbao.a = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void b(ExternalConnection paramExternalConnection)
    throws Exception
  {
    zwc localzwc = new zwc();
    paramExternalConnection.e = localzwc;
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q()))
        {
        case 12: 
          localzwc.a = (zw.b(this.c.t()) ? null : this.c.t());
          break;
        case 13: 
          localzwc.b = this.c.t();
        }
      }
      this.c.l();
    }
    this.c.a();
  }
  
  private void c(ExternalConnection paramExternalConnection)
    throws Exception
  {
    znj localznj = new znj();
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q()))
        {
        case 14: 
          localznj.a(zauj.b(this.c.t(), false));
          break;
        case 15: 
          localznj.b = this.c.t();
          break;
        case 16: 
          localznj.b(zauj.b(this.c.t(), true));
          break;
        case 17: 
          localznj.g(zauj.b(this.c.t(), false));
          break;
        case 18: 
          localznj.a = zauj.F(this.c.t());
          break;
        case 19: 
          localznj.c(zauj.b(this.c.t(), true));
          break;
        case 20: 
          localznj.f(zauj.b(this.c.t(), true));
          break;
        case 21: 
          localznj.e(zauj.b(this.c.t(), true));
          break;
        case 22: 
          localznj.d(zauj.b(this.c.t(), true));
        }
      }
      this.c.l();
    }
    paramExternalConnection.h = localznj;
    this.c.a();
  }
  
  private void a(DBConnection paramDBConnection)
    throws Exception
  {
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q()))
        {
        case 23: 
          paramDBConnection.c = zwl.h(zauj.F(this.c.t()));
          break;
        case 24: 
          paramDBConnection.a = this.c.t();
          break;
        case 7: 
          paramDBConnection.d = this.c.t();
          break;
        case 25: 
          paramDBConnection.a(this.c.t());
        }
      }
      this.c.l();
    }
    this.c.a();
  }
  
  private int a(String paramString)
  {
    switch (d.a(paramString))
    {
    case 26: 
      return 0;
    case 27: 
      return 1;
    case 28: 
      return 2;
    }
    return 1;
  }
  
  private static int b(String paramString)
  {
    switch (d.a(paramString))
    {
    case 29: 
      return 0;
    case 30: 
      return 2;
    case 31: 
      return 1;
    }
    return 0;
  }
  
  private void a(zbvu paramzbvu)
    throws Exception
  {
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q()))
        {
        case 32: 
          paramzbvu.g(zauj.b(this.c.t(), true));
          break;
        case 33: 
          paramzbvu.a(a(this.c.t()));
          break;
        case 34: 
          paramzbvu.d = zauj.F(this.c.t());
          break;
        case 35: 
          paramzbvu.B = zauj.F(this.c.t());
          break;
        case 36: 
          paramzbvu.y = this.c.t();
          break;
        case 37: 
          paramzbvu.a(zauj.b(this.c.t(), true));
          break;
        case 38: 
          paramzbvu.a = this.c.t().charAt(0);
          break;
        case 39: 
          paramzbvu.b = this.c.t().charAt(0);
          break;
        case 40: 
          paramzbvu.b(zauj.b(this.c.t(), false));
          break;
        case 41: 
          paramzbvu.c(zauj.b(this.c.t(), false));
          break;
        case 42: 
          paramzbvu.d(zauj.b(this.c.t(), false));
          break;
        case 43: 
          paramzbvu.e(zauj.b(this.c.t(), false));
          break;
        case 44: 
          paramzbvu.f(zauj.b(this.c.t(), false));
          break;
        case 45: 
          paramzbvu.b(b(this.c.t()));
          break;
        case 46: 
          paramzbvu.a(this.c.t().charAt(0));
        }
      }
      this.c.l();
    }
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      if ("textFields".equals(this.c.q()))
      {
        if (this.c.o())
        {
          this.c.a();
          return;
        }
        this.c.d();
        while (zauz.a(this.c)) {
          if ("textField".equals(this.c.q()))
          {
            int i = 0;
            String str = null;
            if (this.c.n())
            {
              while (this.c.m()) {
                if ("position".equals(this.c.q())) {
                  i = zauj.F(this.c.t());
                } else if ("type".equals(this.c.q())) {
                  str = this.c.t();
                }
              }
              this.c.l();
            }
            paramzbvu.o().a(i, c(str));
            this.c.a();
          }
        }
      }
    }
  }
  
  private static int c(String paramString)
  {
    switch (d.a(paramString))
    {
    case 47: 
      return 3;
    case 48: 
      return 6;
    case 49: 
      return 9;
    case 50: 
      return 0;
    case 51: 
      return 2;
    case 52: 
      return 5;
    case 53: 
      return 8;
    case 54: 
      return 7;
    case 55: 
      return 4;
    }
    return 0;
  }
  
  private void a(WebQueryConnection paramWebQueryConnection)
    throws Exception
  {
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q()))
        {
        case 44: 
          paramWebQueryConnection.setConsecutive(zauj.b(this.c.t(), false));
          break;
        case 56: 
          paramWebQueryConnection.setEditWebPage(this.c.t());
          break;
        case 35: 
          paramWebQueryConnection.setFirstRow(zauj.b(this.c.t(), false));
          break;
        case 57: 
          paramWebQueryConnection.b = zwl.c(this.c.t());
          break;
        case 58: 
          paramWebQueryConnection.setHtmlTables(zauj.b(this.c.t(), false));
          break;
        case 59: 
          paramWebQueryConnection.setParsePre(zauj.b(this.c.t(), false));
          break;
        case 60: 
          paramWebQueryConnection.setPost(this.c.t());
          break;
        case 61: 
          paramWebQueryConnection.setSourceData(zauj.b(this.c.t(), false));
          break;
        case 62: 
          paramWebQueryConnection.setTextDates(zauj.b(this.c.t(), false));
          break;
        case 63: 
          paramWebQueryConnection.setUrl(this.c.t());
          break;
        case 64: 
          paramWebQueryConnection.setXl2000(zauj.b(this.c.t(), false));
          break;
        case 65: 
          paramWebQueryConnection.setXl97(zauj.b(this.c.t(), false));
          break;
        case 66: 
          paramWebQueryConnection.setXml(zauj.b(this.c.t(), false));
        }
      }
      this.c.l();
    }
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      if ("tables".equals(this.c.q())) {
        if (this.c.o())
        {
          this.c.a();
        }
        else
        {
          this.c.d();
          while (zauz.a(this.c))
          {
            zbvs localzbvs;
            switch (d.a(this.c.q()))
            {
            case 67: 
              localzbvs = new zbvs();
              localzbvs.b = true;
              localzbvs.a = null;
              paramWebQueryConnection.a().a(localzbvs);
              break;
            case 68: 
              localzbvs = new zbvs();
              localzbvs.b = false;
              localzbvs.a = this.c.a("v");
              paramWebQueryConnection.a().a(localzbvs);
              break;
            case 69: 
              localzbvs = new zbvs();
              localzbvs.b = false;
              localzbvs.a = Long.valueOf(zauj.G(this.c.a("v")) & 0xFFFFFFFF);
              paramWebQueryConnection.a().a(localzbvs);
            }
            this.c.a();
          }
        }
      }
    }
  }
  
  private void d(ExternalConnection paramExternalConnection)
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    ConnectionParameterCollection localConnectionParameterCollection = paramExternalConnection.getParameters();
    ConnectionParameter localConnectionParameter = null;
    while (zauz.a(this.c))
    {
      if ("parameter".equals(this.c.q()))
      {
        localConnectionParameter = new ConnectionParameter(paramExternalConnection);
        localConnectionParameterCollection.a(localConnectionParameter);
        if (this.c.n())
        {
          while (this.c.m()) {
            switch (d.a(this.c.q()))
            {
            case 70: 
              localConnectionParameter.a = (zauj.b(this.c.t(), false) ? znq.d : znq.e);
              break;
            case 71: 
              localConnectionParameter.setCellReference(this.c.t());
              break;
            case 72: 
              localConnectionParameter.a = Double.valueOf(zauj.C(this.c.t()));
              break;
            case 73: 
              localConnectionParameter.a = Integer.valueOf(zauj.F(this.c.t()));
              break;
            case 74: 
              localConnectionParameter.b = this.c.t();
              break;
            case 75: 
              localConnectionParameter.c = zwl.b(this.c.t());
              break;
            case 32: 
              localConnectionParameter.a = this.c.t();
              break;
            case 76: 
              localConnectionParameter.d = zauj.b(this.c.t(), false);
              break;
            case 77: 
              localConnectionParameter.e = zwl.f(zauj.F(this.c.t()));
              break;
            case 78: 
              localConnectionParameter.a = this.c.t();
            }
          }
          this.c.l();
        }
      }
      this.c.a();
    }
  }
  
  private void a(ExternalConnection paramExternalConnection, HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)paramHashMap.get(str1);
      switch (d.a(str1))
      {
      case 79: 
        paramExternalConnection.setBackgroundRefresh(zauj.b(str2, false));
        break;
      case 80: 
        paramExternalConnection.j = zwl.a(str2);
        break;
      case 81: 
        paramExternalConnection.setDeleted(zauj.b(str2, false));
        break;
      case 82: 
        paramExternalConnection.k = str2;
        break;
      case 8: 
        paramExternalConnection.l = zauj.F(str2);
        break;
      case 83: 
        paramExternalConnection.n = zauj.F(str2);
        break;
      case 84: 
        paramExternalConnection.setKeepAlive(zauj.b(str2, false));
        break;
      case 85: 
        paramExternalConnection.o = ((byte)zauj.F(str2));
        break;
      case 74: 
        paramExternalConnection.p = str2;
        break;
      case 86: 
        paramExternalConnection.setNew(zauj.b(str2, false));
        break;
      case 87: 
        paramExternalConnection.q = str2;
        break;
      case 88: 
        paramExternalConnection.setOnlyUseConnectionFile(zauj.b(str2, false));
        break;
      case 89: 
        paramExternalConnection.r = zwl.b(zauj.F(str2));
        break;
      case 90: 
        paramExternalConnection.s = ((byte)zauj.F(str2));
        break;
      case 91: 
        paramExternalConnection.setRefreshOnLoad(zauj.b(str2, false));
        break;
      case 92: 
        paramExternalConnection.setSaveData(zauj.b(str2, false));
        break;
      case 93: 
        paramExternalConnection.t = zauj.b(str2, false);
        break;
      case 94: 
        paramExternalConnection.u = str2;
        break;
      case 36: 
        paramExternalConnection.v = str2;
        break;
      case 95: 
        paramExternalConnection.w = zauj.F(str2);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */