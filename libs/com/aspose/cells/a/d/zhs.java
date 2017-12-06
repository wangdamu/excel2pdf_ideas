package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.zas;

public class zhs
{
  public static void a(zas paramzas, zt paramzt, boolean paramBoolean)
    throws Exception
  {
    b(paramzas);
    a(paramzas, paramzt);
    a(paramzas, paramBoolean);
    paramzas.b();
  }
  
  public static void a(zas paramzas)
    throws Exception
  {
    b(paramzas);
    paramzas.b();
  }
  
  private static void b(zas paramzas)
    throws Exception
  {
    paramzas.a("psf:PrintTicket");
    paramzas.c("version", "1");
    paramzas.c("xmlns:psf", "http://schemas.microsoft.com/windows/2003/08/printing/printschemaframework");
    paramzas.c("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
    paramzas.c("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
    paramzas.c("xmlns:ns0000", "http://schemas.microsoft.com/windows/2006/06/printing/printschemakeywords/microsoftxpsdocumentwriter");
    paramzas.c("xmlns:psk", "http://schemas.microsoft.com/windows/2003/08/printing/printschemakeywords");
  }
  
  private static void a(zas paramzas, zt paramzt)
    throws Exception
  {
    int i = paramzt.b() > paramzt.c() ? 1 : 0;
    int j = i != 0 ? zao.b(paramzt.c()) : zao.b(paramzt.b());
    int k = i != 0 ? zao.b(paramzt.b()) : zao.b(paramzt.c());
    a(paramzas, "psk:PageMediaSize");
    b(paramzas, zhr.a(paramzt));
    c(paramzas, "psk:MediaSizeWidth");
    a(paramzas, "xsd:integer", zp.a(j));
    paramzas.c();
    c(paramzas, "psk:MediaSizeHeight");
    a(paramzas, "xsd:integer", zp.a(k));
    paramzas.c();
    paramzas.c();
    paramzas.c();
    a(paramzas, "psk:PageOrientation");
    b(paramzas, i != 0 ? "psk:Landscape" : "psk:Portrait");
    paramzas.c();
    paramzas.c();
  }
  
  private static void a(zas paramzas, boolean paramBoolean)
    throws Exception
  {
    a(paramzas, paramBoolean ? "psk:PageInputBin" : "psk:JobInputBin");
    b(paramzas, "psk:AutoSelect");
    paramzas.c();
    paramzas.c();
  }
  
  private static void a(zas paramzas, String paramString)
    throws Exception
  {
    paramzas.b("psf:Feature");
    paramzas.c("name", paramString);
  }
  
  private static void b(zas paramzas, String paramString)
    throws Exception
  {
    paramzas.b("psf:Option");
    paramzas.c("name", paramString);
  }
  
  private static void c(zas paramzas, String paramString)
    throws Exception
  {
    paramzas.b("psf:ScoredProperty");
    paramzas.c("name", paramString);
  }
  
  private static void a(zas paramzas, String paramString1, String paramString2)
    throws Exception
  {
    paramzas.b("psf:Value");
    paramzas.c("xsi:type", paramString1);
    paramzas.c(paramString2);
    paramzas.c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */