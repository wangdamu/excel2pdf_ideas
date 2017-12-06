package com.aspose.cells;

import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zatp
{
  private zcjz a;
  private zasb b;
  
  public zatp(zasb paramzasb)
  {
    this.b = paramzasb;
  }
  
  void a(ArrayList paramArrayList, zj paramzj)
    throws Exception
  {
    this.a = zatr.a("styles.xml", paramzj);
    zasr localzasr = new zasr("text/xml", "styles.xml");
    zf.a(paramArrayList, localzasr);
    this.a.c();
    this.a.b("office:document-styles");
    this.a.a("xmlns", "office", null, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
    this.a.a("xmlns", "style", null, "urn:oasis:names:tc:opendocument:xmlns:style:1.0");
    this.a.a("xmlns", "text", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
    this.a.a("xmlns", "table", null, "urn:oasis:names:tc:opendocument:xmlns:table:1.0");
    this.a.a("xmlns", "draw", null, "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0");
    this.a.a("xmlns", "fo", null, "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0");
    this.a.a("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
    this.a.a("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
    this.a.a("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
    this.a.a("xmlns", "number", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
    this.a.a("xmlns", "svg", null, "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0");
    this.a.a("xmlns", "chart", null, "urn:oasis:names:tc:opendocument:xmlns:chart:1.0");
    this.a.a("xmlns", "dr3d", null, "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0");
    this.a.a("xmlns", "math", null, "http://www.w3.org/1998/Math/MathML");
    this.a.a("xmlns", "form", null, "urn:oasis:names:tc:opendocument:xmlns:form:1.0");
    this.a.a("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
    this.a.a("xmlns", "ooo", null, "http://openoffice.org/2004/office");
    this.a.a("xmlns", "ooow", null, "http://openoffice.org/2004/writer");
    this.a.a("xmlns", "oooc", null, "http://openoffice.org/2004/calc");
    if (this.b.n) {
      this.a.a("xmlns", "of", null, "urn:oasis:names:tc:opendocument:xmlns:of:1.2");
    }
    this.a.a("xmlns", "dom", null, "http://www.w3.org/2001/xml-events");
    this.a.a("office", "version", null, this.b.m);
    a();
    b();
    zaro localzaro = new zaro(this.b);
    localzaro.a(this.a);
    zast localzast = new zast(this.b);
    localzast.a(this.a);
    this.a.b();
    this.a.d();
    this.a.e();
  }
  
  private void a()
    throws Exception
  {
    this.a.b("office:font-face-decls");
    Iterator localIterator = this.b.b.iterator();
    while (localIterator.hasNext())
    {
      zase localzase = (zase)localIterator.next();
      a(localzase);
    }
    this.a.b();
  }
  
  private void b()
    throws Exception
  {
    this.a.b("office:styles");
    Object localObject1 = this.b.e.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zasj)((Iterator)localObject1).next();
      a((zasj)localObject2);
    }
    localObject1 = new zatn(this.b, this.a);
    Object localObject2 = this.b.f.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (zary)((Iterator)localObject2).next();
      if (((zary)localObject3).c.getName() != null) {
        ((zatn)localObject1).a((zary)localObject3);
      }
    }
    if ((this.b.a.getWorksheets() != null) && (this.b.a.getWorksheets().getCount() > 0))
    {
      localObject2 = this.b.a.getWorksheets().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Worksheet)((Iterator)localObject2).next();
        if ((((Worksheet)localObject3).getShapes() != null) && (((Worksheet)localObject3).getShapes().getCount() > 0))
        {
          Iterator localIterator = ((Worksheet)localObject3).getShapes().iterator();
          while (localIterator.hasNext())
          {
            Shape localShape = (Shape)localIterator.next();
            a(localShape);
          }
        }
      }
    }
    this.a.b();
  }
  
  private void a(Shape paramShape)
    throws Exception
  {
    if (paramShape == null) {
      return;
    }
    this.a.b("draw:fill-image");
    int i = paramShape.Q().getIndex() + paramShape.w() + 1;
    this.a.a("draw", "name", null, "D" + i);
    FillFormat localFillFormat = paramShape.getFill();
    String str = null;
    int j = 0;
    if (localFillFormat.getFillType() == 4)
    {
      TextureFill localTextureFill = localFillFormat.getTextureFill();
      if (localTextureFill.getImageData() != null)
      {
        str = localTextureFill.a;
        j = localTextureFill.b;
        if ((str == null) || ("".equals(str)))
        {
          localTextureFill.a = ("Pictures/" + i + ".jpg");
          localTextureFill.b = 2;
          str = localTextureFill.a;
          j = localTextureFill.b;
        }
      }
    }
    switch (j)
    {
    case 2: 
      this.a.a("xlink", "href", null, str);
      break;
    }
    this.a.a("xlink", "show", null, "embed");
    this.a.a("xlink", "actuate", null, "onLoad");
    this.a.b();
  }
  
  private void a(zase paramzase)
    throws Exception
  {
    this.a.b("style:font-face ");
    this.a.a("style", "name", null, paramzase.a());
    this.a.a("svg", "font-family", null, paramzase.a());
    if (!zasp.e(paramzase.b())) {
      this.a.a("style", "font-family-generic", null, paramzase.b());
    }
    if (!zasp.e(paramzase.c())) {
      this.a.a("style", "font-pitch", null, paramzase.c());
    }
    this.a.b();
  }
  
  private void a(zasy paramzasy, String paramString)
    throws Exception
  {
    for (int i = 0; i < paramzasy.b.size(); i++)
    {
      String[] arrayOfString = (String[])paramzasy.b.get(i);
      this.a.a(paramString, arrayOfString[0], null, arrayOfString[1]);
    }
  }
  
  private void a(zasj paramzasj)
    throws Exception
  {
    String str = null;
    switch (paramzasj.d)
    {
    case 1: 
      str = "number:number-style";
      break;
    case 6: 
      str = "number:percentage-style";
      break;
    case 2: 
      str = "number:date-style";
      break;
    case 0: 
      str = "number:currency-style";
      break;
    case 4: 
      str = "boolean-style";
      break;
    case 5: 
      str = "number:text-style";
      break;
    case 3: 
      str = "number:time-style";
      break;
    case 7: 
      str = "number:text-style";
    }
    this.a.b(str);
    this.a.a("style", "name", null, paramzasj.a);
    Object localObject;
    for (int i = 0; i < paramzasj.e.size(); i++)
    {
      localObject = (String[])paramzasj.e.get(i);
      String[] arrayOfString = zw.d(localObject[0], ':');
      this.a.a(arrayOfString[0], arrayOfString[1], null, localObject[1]);
    }
    for (i = 0; i < paramzasj.f.size(); i++)
    {
      localObject = (zasy)paramzasj.f.get(i);
      switch (((zasy)localObject).a)
      {
      case 4: 
        this.a.b("number:number");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 0: 
        this.a.b("number:text");
        if (!zasp.e(((zasy)localObject).c)) {
          this.a.a(((zasy)localObject).c);
        }
        this.a.b();
        break;
      case 5: 
        this.a.b("style:map");
        a((zasy)localObject, "style");
        this.a.b();
        break;
      case 2: 
        this.a.b("style:text-properties");
        a((zasy)localObject, "fo");
        this.a.b();
        break;
      case 3: 
        this.a.b("number:currency-symbol");
        if (!zasp.e(((zasy)localObject).c)) {
          this.a.a(((zasy)localObject).c);
        }
        this.a.b();
        break;
      case 1: 
        this.a.b("number:text-content");
        this.a.b();
        break;
      case 14: 
        this.a.b("number:scientific-number");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 13: 
        this.a.b("number:fraction");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 7: 
        this.a.b("number:month");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 8: 
        this.a.b("number:day");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 15: 
        this.a.b("number:day-of-week");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 6: 
        this.a.b("number:year");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 9: 
        this.a.b("number:hours");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 10: 
        this.a.b("number:minutes");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 11: 
        this.a.b("number:seconds");
        a((zasy)localObject, "number");
        this.a.b();
        break;
      case 12: 
        this.a.b("number:am-pm");
        this.a.b();
      }
    }
    this.a.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */