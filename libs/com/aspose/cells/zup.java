package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import java.util.Iterator;

class zup
  extends ztp
{
  private Workbook b = null;
  
  zup(zpt paramzpt)
  {
    this.b = paramzpt.a;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    ExternalConnectionCollection localExternalConnectionCollection = this.b.getDataConnections();
    paramzcjz.b(true);
    if (localExternalConnectionCollection != null)
    {
      paramzcjz.b("connections");
      if (localExternalConnectionCollection.a.length() > 0) {
        paramzcjz.a("xmlns", localExternalConnectionCollection.a);
      }
      Iterator localIterator = localExternalConnectionCollection.iterator();
      while (localIterator.hasNext())
      {
        ExternalConnection localExternalConnection = (ExternalConnection)localIterator.next();
        a(localExternalConnection, paramzcjz);
      }
      paramzcjz.b();
    }
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void a(ExternalConnection paramExternalConnection, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("connection");
    paramzcjz.a("id", zauj.z(paramExternalConnection.getConnectionId()));
    if (!zw.b(paramExternalConnection.getSourceFile())) {
      paramzcjz.a("sourceFile", paramExternalConnection.getSourceFile());
    }
    if (!zw.b(paramExternalConnection.getOdcFile())) {
      paramzcjz.a("odcFile", paramExternalConnection.getOdcFile());
    }
    if (paramExternalConnection.getKeepAlive()) {
      paramzcjz.a("keepAlive", "1");
    }
    if (paramExternalConnection.getRefreshInternal() != 0) {
      paramzcjz.a("interval", zauj.z(paramExternalConnection.getRefreshInternal()));
    }
    if (!zw.b(paramExternalConnection.getName())) {
      paramzcjz.a("name", paramExternalConnection.getName());
    }
    if (!zw.b(paramExternalConnection.getConnectionDescription())) {
      paramzcjz.a("description", paramExternalConnection.getConnectionDescription());
    }
    if (paramExternalConnection.w != 0) {
      paramzcjz.a("type", zauj.z(paramExternalConnection.w));
    }
    if (paramExternalConnection.r != 1)
    {
      int i = zwl.c(paramExternalConnection.getReconnectionMethodType());
      paramzcjz.a("reconnectionMethod", zauj.z(i));
    }
    paramzcjz.a("refreshedVersion", zauj.a(paramExternalConnection.c()));
    if (0 != paramExternalConnection.d()) {
      paramzcjz.a("minRefreshableVersion", zauj.a(paramExternalConnection.d()));
    }
    if (paramExternalConnection.getSavePassword()) {
      paramzcjz.a("savePassword", "1");
    }
    if (paramExternalConnection.isNew()) {
      paramzcjz.a("new", "1");
    }
    if (paramExternalConnection.isDeleted()) {
      paramzcjz.a("deleted", "1");
    }
    if (paramExternalConnection.getOnlyUseConnectionFile()) {
      paramzcjz.a("onlyUseConnectionFile", "1");
    }
    if (paramExternalConnection.getBackgroundRefresh()) {
      paramzcjz.a("background", "1");
    }
    if (paramExternalConnection.getRefreshOnLoad()) {
      paramzcjz.a("refreshOnLoad", "1");
    }
    if (paramExternalConnection.getSaveData()) {
      paramzcjz.a("saveData", "1");
    }
    if (paramExternalConnection.getCredentialsMethodType() != 0) {
      paramzcjz.a("credentials", zwl.a(paramExternalConnection.getCredentialsMethodType()));
    }
    if (!zw.b(paramExternalConnection.getSSOId())) {
      paramzcjz.a("singleSignOnId", paramExternalConnection.getSSOId());
    }
    if ((paramExternalConnection instanceof DBConnection)) {
      a((DBConnection)paramExternalConnection, paramzcjz);
    } else if ((paramExternalConnection instanceof zbvu)) {
      a((zbvu)paramExternalConnection, paramzcjz);
    } else if ((paramExternalConnection instanceof WebQueryConnection)) {
      a((WebQueryConnection)paramExternalConnection, paramzcjz);
    }
    if (paramExternalConnection.h != null) {
      a(paramExternalConnection.h, paramzcjz);
    }
    if ((paramExternalConnection.g != null) && (paramExternalConnection.getParameters().getCount() > 0)) {
      a(paramExternalConnection.getParameters(), paramzcjz);
    }
    if (paramExternalConnection.i != null)
    {
      Iterator localIterator = paramExternalConnection.i.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramzcjz.d(str);
      }
    }
    b(paramExternalConnection, paramzcjz);
    paramzcjz.b();
  }
  
  private void b(ExternalConnection paramExternalConnection, zcjz paramzcjz)
    throws Exception
  {
    if ((paramExternalConnection.e == null) && (paramExternalConnection.f == null)) {
      return;
    }
    paramzcjz.b("extLst");
    if (paramExternalConnection.e != null) {
      c(paramExternalConnection, paramzcjz);
    }
    if (paramExternalConnection.f != null) {
      d(paramExternalConnection, paramzcjz);
    }
    paramzcjz.b();
  }
  
  private void c(ExternalConnection paramExternalConnection, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("ext");
    paramzcjz.a("uri", "{D79990A0-CA42-45e3-83F4-45C500A0EAA5}");
    paramzcjz.a("xmlns:x14", zaty.c);
    paramzcjz.b("x14:connection");
    paramzcjz.a("culture", paramExternalConnection.e.a);
    paramzcjz.a("embeddedDataId", paramExternalConnection.e.b);
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void d(ExternalConnection paramExternalConnection, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("ext");
    paramzcjz.a("uri", "{DE250136-89BD-433C-8126-D09CA5730AF9}");
    paramzcjz.a("xmlns:x15", zaty.d);
    paramzcjz.b("x15:connection");
    zwd localzwd = paramExternalConnection.f;
    paramzcjz.a("id", localzwd.b);
    if (localzwd.a()) {
      paramzcjz.a("model", "1");
    }
    if (localzwd.b()) {
      paramzcjz.a("autoDelete", "1");
    }
    if (localzwd.c != null)
    {
      zwe localzwe = localzwd.c;
      if (localzwe.a() == 3)
      {
        zbao localzbao = (zbao)localzwe;
        paramzcjz.b("x15:rangePr");
        paramzcjz.a("sourceName", localzbao.a);
        paramzcjz.b();
      }
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(DBConnection paramDBConnection, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("dbPr");
    if (!zw.b(paramDBConnection.getConnectionInfo())) {
      paramzcjz.a("connection", paramDBConnection.getConnectionInfo());
    } else {
      paramzcjz.a("connection", "");
    }
    if (paramDBConnection.getCommand() != null) {
      paramzcjz.a("command", paramDBConnection.getCommand());
    }
    if (paramDBConnection.getCommandType() != 2)
    {
      int i = zwl.i(paramDBConnection.getCommandType());
      paramzcjz.a("commandType", zauj.z(i));
    }
    if (!zw.b(paramDBConnection.a())) {
      paramzcjz.a("serverCommand", paramDBConnection.a());
    }
    paramzcjz.b();
  }
  
  private static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "mac";
    case 1: 
      return "win";
    case 2: 
      return "dos";
    }
    return "win";
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "doubleQuote";
    case 2: 
      return "none";
    case 1: 
      return "singleQuote";
    }
    return "doubleQuote";
  }
  
  private void a(zbvu paramzbvu, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("textPr");
    if (!paramzbvu.l()) {
      paramzcjz.a("prompt", "0");
    }
    if (paramzbvu.a() != 1) {
      paramzcjz.a("fileType", a(paramzbvu.a()));
    }
    if (paramzbvu.d != 1252) {
      paramzcjz.a("codePage", zauj.z(paramzbvu.d));
    }
    if (paramzbvu.B != 1) {
      paramzcjz.a("firstRow", zauj.z(paramzbvu.B));
    }
    if (paramzbvu.y != null) {
      paramzcjz.a("sourceFile", paramzbvu.y);
    }
    if (!paramzbvu.e()) {
      paramzcjz.a("delimited", "0");
    }
    if (paramzbvu.a != '.') {
      paramzcjz.a("decimal", "" + paramzbvu.a);
    }
    if (paramzbvu.b != ',') {
      paramzcjz.a("thousands", "" + paramzbvu.b);
    }
    if (!paramzbvu.f()) {
      paramzcjz.a("tab", "0");
    }
    if (paramzbvu.g()) {
      paramzcjz.a("space", "1");
    }
    if (paramzbvu.h()) {
      paramzcjz.a("comma", "1");
    }
    if (paramzbvu.i()) {
      paramzcjz.a("semicolon", "1");
    }
    if (paramzbvu.j()) {
      paramzcjz.a("consecutive", "1");
    }
    if (paramzbvu.k() != 0) {
      paramzcjz.a("qualifier", b(paramzbvu.k()));
    }
    if ((paramzbvu.m()) && (paramzbvu.c != 0)) {
      paramzcjz.a("delimiter", "" + paramzbvu.n());
    }
    if ((paramzbvu.C != null) && (paramzbvu.C.getCount() > 0))
    {
      paramzcjz.b("textFields");
      if (paramzbvu.C.getCount() != 1) {
        paramzcjz.a("count", zauj.z(paramzbvu.C.getCount()));
      }
      Iterator localIterator = paramzbvu.C.iterator();
      while (localIterator.hasNext())
      {
        znl localznl = (znl)localIterator.next();
        paramzcjz.b("textField");
        if (localznl.a != 0) {
          paramzcjz.a("position", zauj.z(localznl.a));
        }
        if (localznl.b != 0) {
          paramzcjz.a("type", c(localznl.b));
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private String c(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "DMY";
    case 6: 
      return "DYM";
    case 9: 
      return "EMD";
    case 0: 
      return "general";
    case 2: 
      return "MDY";
    case 5: 
      return "MYD";
    case 8: 
      return "skip";
    case 7: 
      return "YDM";
    case 4: 
      return "YMD";
    }
    return "general";
  }
  
  private void a(WebQueryConnection paramWebQueryConnection, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("webPr");
    if (paramWebQueryConnection.isConsecutive()) {
      paramzcjz.a("consecutive", "1");
    }
    if (!zw.b(paramWebQueryConnection.getEditWebPage())) {
      paramzcjz.a("editPage", paramWebQueryConnection.getEditWebPage());
    }
    if (paramWebQueryConnection.isFirstRow()) {
      paramzcjz.a("firstRow", "1");
    }
    if (paramWebQueryConnection.b != 1) {
      paramzcjz.a("htmlFormat", zwl.k(paramWebQueryConnection.getHtmlFormat()));
    }
    if (paramWebQueryConnection.isHtmlTables()) {
      paramzcjz.a("htmlTables", "1");
    }
    if (paramWebQueryConnection.isParsePre()) {
      paramzcjz.a("parsePre", "1");
    }
    if (!zw.b(paramWebQueryConnection.getPost())) {
      paramzcjz.a("post", paramWebQueryConnection.getPost());
    }
    if (paramWebQueryConnection.isSourceData()) {
      paramzcjz.a("sourceData", "1");
    }
    if (paramWebQueryConnection.isTextDates()) {
      paramzcjz.a("textDates", "1");
    }
    if (!zw.b(paramWebQueryConnection.getUrl())) {
      paramzcjz.a("url", paramWebQueryConnection.getUrl());
    }
    if (paramWebQueryConnection.isXl2000()) {
      paramzcjz.a("xl2000", "1");
    }
    if (paramWebQueryConnection.isXl97()) {
      paramzcjz.a("xl97", "1");
    }
    if (paramWebQueryConnection.isXml()) {
      paramzcjz.a("xml", "1");
    }
    int i = paramWebQueryConnection.a().getCount();
    if (i > 0)
    {
      paramzcjz.b("tables");
      paramzcjz.a("count", zauj.z(i));
      for (int j = 0; j < i; j++)
      {
        zbvs localzbvs = paramWebQueryConnection.a().a(j);
        if (localzbvs.b)
        {
          paramzcjz.b("m");
        }
        else if ((localzbvs.a instanceof String))
        {
          paramzcjz.b("s");
          paramzcjz.a("v", (String)localzbvs.a);
        }
        else
        {
          paramzcjz.b("x");
          paramzcjz.a("v", zauj.a(((Long)localzbvs.a).longValue() & 0xFFFFFFFF));
        }
        paramzcjz.b();
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(ConnectionParameterCollection paramConnectionParameterCollection, zcjz paramzcjz)
    throws Exception
  {
    int i = paramConnectionParameterCollection.getCount();
    paramzcjz.b("parameters");
    paramzcjz.a("count", zauj.z(i));
    ConnectionParameter localConnectionParameter = null;
    for (int j = 0; j < i; j++)
    {
      localConnectionParameter = paramConnectionParameterCollection.get(j);
      paramzcjz.b("parameter");
      if (!zw.b(localConnectionParameter.getName())) {
        paramzcjz.a("name", localConnectionParameter.getName());
      }
      if (localConnectionParameter.getSqlType() != 0)
      {
        int k = zwl.g(localConnectionParameter.getSqlType());
        paramzcjz.a("sqlType", zauj.z(k));
      }
      if (!zw.b(localConnectionParameter.getPrompt())) {
        paramzcjz.a("prompt", localConnectionParameter.getPrompt());
      }
      if (localConnectionParameter.getType() != 1) {
        paramzcjz.a("parameterType", zwl.j(localConnectionParameter.getType()));
      }
      if (localConnectionParameter.getRefreshOnChange()) {
        paramzcjz.a("refreshOnChange", "1");
      }
      if (!zw.b(localConnectionParameter.getCellReference())) {
        paramzcjz.a("cell", localConnectionParameter.getCellReference());
      }
      if ((localConnectionParameter.getValue() instanceof Boolean))
      {
        if (((Boolean)localConnectionParameter.getValue()).booleanValue()) {
          paramzcjz.a("boolean", "1");
        } else {
          paramzcjz.a("boolean", "0");
        }
      }
      else if ((localConnectionParameter.getValue() instanceof Double)) {
        paramzcjz.a("double", zauj.b(((Double)localConnectionParameter.getValue()).doubleValue()));
      } else if ((localConnectionParameter.getValue() instanceof Integer)) {
        paramzcjz.a("integer", zauj.z(((Integer)localConnectionParameter.getValue()).intValue()));
      } else if ((localConnectionParameter.getValue() instanceof String)) {
        paramzcjz.a("string", (String)localConnectionParameter.getValue());
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(znj paramznj, zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("olapPr");
    if (paramznj.a()) {
      paramzcjz.a("local", "1");
    }
    if (!zw.b(paramznj.b)) {
      paramzcjz.a("localConnection", paramznj.b);
    }
    if (!paramznj.b()) {
      paramzcjz.a("localRefresh", "0");
    }
    if (paramznj.g()) {
      paramzcjz.a("sendLocale", "1");
    }
    if (paramznj.a >= 0) {
      paramzcjz.a("rowDrillCount", zauj.z(paramznj.a));
    }
    if (!paramznj.c()) {
      paramzcjz.a("serverFill", "0");
    }
    if (!paramznj.f()) {
      paramzcjz.a("serverNumberFormat", "0");
    }
    if (!paramznj.e()) {
      paramzcjz.a("serverFont", "0");
    }
    if (!paramznj.d()) {
      paramzcjz.a("serverFontColor", "0");
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */