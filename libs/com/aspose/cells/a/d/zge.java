package com.aspose.cells.a.d;

import com.aspose.cells.DateTime;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.zw;

public class zge
  extends zey
{
  private zfa a;
  private zh b;
  
  public zge(zdz paramzdz, zfa paramzfa)
    throws Exception
  {
    super(paramzdz);
    this.a = paramzfa;
    if (DateTime.a(this.a.f(), DateTime.a)) {
      return;
    }
    this.b = new zh();
    zo localzo = new zo(this.b);
    localzo.c("<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
    localzo.c("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Aspose.Cells\">");
    localzo.c("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
    localzo.c("<rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\">");
    localzo.c("<xmp:CreateDate>" + zp.a(this.a.f()) + "</xmp:CreateDate>");
    localzo.c("<xmp:ModifyDate>" + zp.a(this.a.f()) + "</xmp:ModifyDate>");
    localzo.c("<xmp:CreatorTool>Aspose.Cells</xmp:CreatorTool>");
    localzo.c("</rdf:Description>");
    localzo.c("<rdf:Description rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\">");
    localzo.c("<dc:format>application/pdf</dc:format>");
    if (!zw.b(this.a.b())) {
      localzo.c("<dc:title><rdf:Alt><rdf:li xml:lang=\"x-default\">" + a(this.a.b()) + "</rdf:li></rdf:Alt></dc:title>");
    }
    if (!zw.b(this.a.c())) {
      localzo.c("<dc:creator><rdf:Seq><rdf:li>" + a(this.a.c()) + "</rdf:li></rdf:Seq></dc:creator>");
    }
    if (!zw.b(this.a.d())) {
      localzo.c("<dc:description><rdf:Alt><rdf:li xml:lang=\"x-default\">" + a(this.a.d()) + "</rdf:li></rdf:Alt></dc:description>");
    }
    localzo.c("</rdf:Description>");
    localzo.c("<rdf:Description rdf:about=\"\" xmlns:pdf=\"http://ns.adobe.com/pdf/1.3/\">");
    localzo.c("<pdf:Producer>" + this.a.g() + "</pdf:Producer>");
    if (!zw.b(this.a.e())) {
      localzo.c("<pdf:Keywords>" + a(this.a.e()) + "</pdf:Keywords>");
    }
    localzo.c("</rdf:Description>");
    localzo.c("<rdf:Description rdf:about=\"\" xmlns:pdfaid=\"http://www.aiim.org/pdfa/ns/id/\">");
    localzo.c("<pdfaid:part>1</pdfaid:part>");
    localzo.c("<pdfaid:conformance>" + (this.e.b().v() ? "A" : "B") + "</pdfaid:conformance>");
    localzo.c("</rdf:Description>");
    localzo.c("</rdf:RDF>");
    localzo.c("</x:xmpmeta>");
    localzo.c("<?xpacket end=\"w\"?>");
    localzo.c();
    localzo.b();
  }
  
  private static String a(String paramString)
  {
    return zw.a(paramString, "&", "&amp;");
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/Metadata");
    paramzez.a("/Subtype", "/XML");
    byte[] arrayOfByte = this.b.o();
    paramzez.a("/Length", arrayOfByte.length);
    paramzez.h();
    paramzez.a("stream\r\n");
    paramzez.a(arrayOfByte, 0, arrayOfByte.length);
    paramzez.a("\r\nendstream\r\n");
    paramzez.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */