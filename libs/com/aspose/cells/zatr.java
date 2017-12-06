package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zatr
  implements com.aspose.cells.b.a.zj
{
  ArrayList a;
  private com.aspose.cells.a.f.zj c = null;
  private Workbook d = null;
  zasb b;
  private zcjz e;
  
  public void a()
  {
    dispose();
  }
  
  public void dispose()
  {
    if (this.b != null) {
      this.b.dispose();
    }
    this.b = null;
    this.a = null;
    this.d = null;
    this.e = null;
    this.c = null;
    com.aspose.cells.b.a.zg.a(this);
  }
  
  public zatr(Workbook paramWorkbook, SaveOptions paramSaveOptions)
  {
    zug.b(paramWorkbook.getWorksheets());
    this.d = paramWorkbook;
    OdsSaveOptions localOdsSaveOptions = null;
    if (!(paramSaveOptions instanceof OdsSaveOptions)) {
      localOdsSaveOptions = new OdsSaveOptions(paramSaveOptions);
    } else {
      localOdsSaveOptions = (OdsSaveOptions)paramSaveOptions;
    }
    this.b = new zasb(this.d, localOdsSaveOptions);
    this.a = new ArrayList();
  }
  
  void a(zm paramzm)
    throws Exception
  {
    this.c = new com.aspose.cells.a.f.zj(paramzm);
    this.c.b(2);
    this.c.d(0);
    f();
    this.b.b();
    zasr localzasr = new zasr(this.b.o.a ? "application/vnd.oasis.opendocument.spreadsheet-template" : "application/vnd.oasis.opendocument.spreadsheet", "/");
    zf.a(this.a, localzasr);
    c();
    zatp localzatp = new zatp(this.b);
    localzatp.a(this.a, this.c);
    zatf localzatf = new zatf(this.b);
    localzatf.a(this.a, this.c);
    e();
    b();
    d();
    this.c.f_();
    this.b.a();
  }
  
  void b()
    throws Exception
  {
    this.e = a("meta.xml", this.c);
    zasr localzasr = new zasr("text/xml", "meta.xml");
    zf.a(this.a, localzasr);
    zasw localzasw = new zasw(this.b);
    localzasw.a(this.e);
    this.e.e();
  }
  
  void c()
    throws Exception
  {
    this.e = a("content.xml", this.c);
    zasr localzasr = new zasr("text/xml", "content.xml");
    zf.a(this.a, localzasr);
    this.e.c();
    this.e.b("office:document-content");
    this.e.a("xmlns", "office", null, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
    this.e.a("xmlns", "style", null, "urn:oasis:names:tc:opendocument:xmlns:style:1.0");
    this.e.a("xmlns", "text", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
    this.e.a("xmlns", "table", null, "urn:oasis:names:tc:opendocument:xmlns:table:1.0");
    this.e.a("xmlns", "draw", null, "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0");
    this.e.a("xmlns", "fo", null, "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0");
    this.e.a("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
    this.e.a("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
    this.e.a("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
    this.e.a("xmlns", "number", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
    this.e.a("xmlns", "svg", null, "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0");
    this.e.a("xmlns", "chart", null, "urn:oasis:names:tc:opendocument:xmlns:chart:1.0");
    this.e.a("xmlns", "dr3d", null, "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0");
    this.e.a("xmlns", "math", null, "http://www.w3.org/1998/Math/MathML");
    this.e.a("xmlns", "form", null, "urn:oasis:names:tc:opendocument:xmlns:form:1.0");
    this.e.a("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
    this.e.a("xmlns", "ooo", null, "http://openoffice.org/2004/office");
    this.e.a("xmlns", "ooow", null, "http://openoffice.org/2004/writer");
    this.e.a("xmlns", "oooc", null, "http://openoffice.org/2004/calc");
    if (this.b.n) {
      this.e.a("xmlns", "of", null, "urn:oasis:names:tc:opendocument:xmlns:of:1.2");
    }
    this.e.a("xmlns", "dom", null, "http://www.w3.org/2001/xml-events");
    this.e.a("xmlns", "xforms", null, "http://www.w3.org/2002/xforms");
    this.e.a("xmlns", "xsd", null, "http://www.w3.org/2001/XMLSchema");
    this.e.a("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
    this.e.a("office", "version", null, this.b.m);
    zatn localzatn = new zatn(this.b);
    localzatn.a(this.e);
    g();
    this.e.b();
    this.e.d();
    this.e.e();
  }
  
  private void g()
    throws Exception
  {
    this.e.b("office:body");
    h();
    this.e.b();
  }
  
  private void h()
    throws Exception
  {
    this.e.b("office:spreadsheet");
    for (int i = 0; i < this.b.g.size(); i++)
    {
      this.d.i();
      zatt localzatt = new zatt((zasc)this.b.g.get(i));
      localzatt.a(this.e);
    }
    j();
    i();
    this.e.b();
  }
  
  private void i()
    throws Exception
  {
    int i = 0;
    for (int j = 0; j < this.b.g.size(); j++)
    {
      zasc localzasc = (zasc)this.b.g.get(j);
      if (localzasc.i.hasAutofilter())
      {
        if (i == 0)
        {
          i = 1;
          this.e.b("table:database-ranges");
        }
        this.e.b("table:database-range");
        String str = localzasc.i.getAutoFilter().i().a(1048575, 16383, false);
        String[] arrayOfString = zw.d(str, ':');
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localzasc.i.getName());
        localStringBuilder.append('.');
        localStringBuilder.append(arrayOfString[0]);
        localStringBuilder.append(':');
        localStringBuilder.append(localzasc.i.getName());
        localStringBuilder.append('.');
        localStringBuilder.append(arrayOfString.length > 1 ? arrayOfString[1] : arrayOfString[0]);
        this.e.a("table:target-range-address", zs.a(localStringBuilder));
        this.e.a("table:display-filter-buttons", "true");
        this.e.b();
      }
    }
    if (i != 0) {
      this.e.b();
    }
  }
  
  private void j()
    throws Exception
  {
    NameCollection localNameCollection = this.d.getWorksheets().getNames();
    if (localNameCollection.getCount() == 0) {
      return;
    }
    this.e.b("table:named-expressions");
    for (int i = 0; i < localNameCollection.getCount(); i++)
    {
      Name localName = localNameCollection.get(i);
      this.e.b("table:named-expression");
      String str1 = localName.getText();
      switch (localName.t())
      {
      case 13: 
        str1 = "Excel_BuiltIn__FilterDatabase_" + localName.getSheetIndex();
        break;
      case 6: 
        str1 = "Excel_BuiltIn_Print_Area_" + localName.getSheetIndex();
        break;
      case 7: 
        str1 = "Excel_BuiltIn_Print_Titles_" + localName.getSheetIndex();
      }
      this.e.a("table", "name", null, str1);
      int j = localName.getSheetIndex() - 1;
      if (j < 0)
      {
        j = localName.s();
        if ((j < 0) || (j >= this.d.getWorksheets().getCount())) {
          j = 0;
        }
      }
      this.e.a("table", "base-cell-address", null, "$" + this.d.getWorksheets().get(j).getName() + ".$A$1");
      String str2 = zasp.a(this.d.getWorksheets(), localName);
      if ((str2 != null) && (!"".equals(str2)) && (str2.charAt(0) == '=')) {
        str2 = str2.substring(1);
      }
      this.e.a("table", "expression", null, str2);
      this.e.b();
    }
    this.e.b();
  }
  
  void d()
    throws Exception
  {
    zcjz localzcjz = a("META-INF/manifest.xml", this.c);
    localzcjz.c();
    localzcjz.b("manifest:manifest");
    localzcjz.a("xmlns", "manifest", null, "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0");
    for (int i = 0; i < this.a.size(); i++)
    {
      zasr localzasr = (zasr)this.a.get(i);
      localzcjz.b("manifest:file-entry");
      localzcjz.a("manifest", "media-type", null, localzasr.a());
      localzcjz.a("manifest", "full-path", null, localzasr.b());
      localzcjz.b();
    }
    localzcjz.b();
    localzcjz.d();
    localzcjz.a(1);
    localzcjz.e();
  }
  
  void e()
    throws Exception
  {
    HashMap localHashMap = new HashMap();
    if ((this.b.a.getWorksheets() != null) && (this.b.a.getWorksheets().getCount() > 0))
    {
      Iterator localIterator1 = this.b.a.getWorksheets().iterator();
      while (localIterator1.hasNext())
      {
        Worksheet localWorksheet = (Worksheet)localIterator1.next();
        if ((localWorksheet.getShapes() != null) && (localWorksheet.getShapes().getCount() > 0))
        {
          Iterator localIterator2 = localWorksheet.getShapes().iterator();
          while (localIterator2.hasNext())
          {
            Shape localShape = (Shape)localIterator2.next();
            int i = localShape.getMsoDrawingType();
            Object localObject1;
            Object localObject2;
            switch (i)
            {
            case 6: 
              FillFormat localFillFormat = localShape.getFill();
              if (localFillFormat.getFillType() == 4)
              {
                localObject1 = localFillFormat.getTextureFill();
                if (((TextureFill)localObject1).getImageData() != null)
                {
                  localObject2 = ((TextureFill)localObject1).a;
                  b((String)localObject2, localFillFormat.getImageData());
                  zf.a(this.a, new zasr("image/jpeg", (String)localObject2));
                }
              }
              break;
            case 8: 
              localObject1 = (Picture)localShape;
              if ((((Picture)localObject1).getData() != null) && (localHashMap.get(Integer.valueOf(((Picture)localObject1).b())) == null))
              {
                localObject2 = "Pictures/" + ((Picture)localObject1).b() + "." + zcc.a(((Picture)localObject1).getImageFormat());
                b((String)localObject2, ((Picture)localObject1).getData());
                zf.a(this.a, new zasr("image/jpeg", (String)localObject2));
                localHashMap.put(Integer.valueOf(((Picture)localObject1).b()), Boolean.valueOf(true));
              }
              break;
            case 24: 
              localObject2 = (OleObject)localShape;
              String str1 = "MSO_OLE_OBJ" + zp.d(((OleObject)localObject2).s());
              if (!a(str1, ((OleObject)localObject2).getObjectData()))
              {
                b(str1, ((OleObject)localObject2).getObjectData());
                zf.a(this.a, new zasr("application/vnd.sun.star.oleobject", str1));
              }
              else
              {
                zf.a(this.a, new zasr("application/vnd.oasis.opendocument.text", str1));
              }
              if (localHashMap.get(Integer.valueOf(((OleObject)localObject2).e())) == null)
              {
                b("ObjectReplacements/Object " + ((OleObject)localObject2).e(), ((OleObject)localObject2).getImageData());
                zf.a(this.a, new zasr("application/x-openoffice-wmf;windows_formatname=&quot;Image WMF&quot;", "ObjectReplacements/Object " + ((OleObject)localObject2).e()));
                localHashMap.put(Integer.valueOf(((OleObject)localObject2).e()), Boolean.valueOf(true));
              }
              break;
            case 5: 
              String str2 = zasp.a((ChartShape)localShape);
              String str3 = "Object " + str2;
              zf.a(this.a, new zasr("text/xml", str3 + "/content.xml"));
              zf.a(this.a, new zasr("text/xml", str3 + "/styles.xml"));
              zf.a(this.a, new zasr("text/xml", str3 + "/meta.xml"));
              zf.a(this.a, new zasr("application/vnd.oasis.opendocument.chart", str3));
              zaru localzaru = new zaru(this.b, this.c, (ChartShape)localShape, str2);
              localzaru.a();
            }
          }
        }
      }
    }
  }
  
  private boolean a(String paramString, byte[] paramArrayOfByte)
    throws Exception
  {
    if (paramArrayOfByte == null) {
      return false;
    }
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(paramArrayOfByte);
    if (!FileFormatUtil.a(localzh)) {
      return false;
    }
    zi localzi = zi.a(localzh);
    Iterator localIterator = localzi.iterator();
    while (localIterator.hasNext())
    {
      com.aspose.cells.a.f.zh localzh1 = (com.aspose.cells.a.f.zh)localIterator.next();
      if ((!localzh1.c()) && (!"META-INF/manifest.xml".equals(localzh1.b())))
      {
        zm localzm = localzi.a(localzh1);
        byte[] arrayOfByte = new byte[(int)localzh1.a()];
        localzm.a(arrayOfByte, 0, (int)localzh1.a());
        localzm.a();
        com.aspose.cells.a.f.zh localzh2 = this.c.a(paramString + "/" + localzh1.b());
        localzh2.a(DateTime.getNow());
        this.c.a(localzh2);
        this.c.b(arrayOfByte, 0, arrayOfByte.length);
        this.c.b();
        zf.a(this.a, new zasr("text/xml", paramString + "/" + localzh1.b()));
      }
    }
    localzh.a();
    localzi.b();
    return true;
  }
  
  private void b(String paramString, byte[] paramArrayOfByte)
    throws Exception
  {
    if (paramArrayOfByte == null) {
      return;
    }
    com.aspose.cells.a.f.zh localzh = this.c.a(paramString);
    localzh.a(DateTime.getNow());
    this.c.a(localzh);
    this.c.b(paramArrayOfByte, 0, paramArrayOfByte.length);
    this.c.b();
  }
  
  static zcjz a(String paramString, com.aspose.cells.a.f.zj paramzj)
    throws Exception
  {
    com.aspose.cells.a.f.zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    zcjz localzcjz = new zcjz(paramzj, Encoding.getUTF8());
    return localzcjz;
  }
  
  void f()
    throws Exception
  {
    if (this.d.k().size() > 0)
    {
      zc localzc = com.aspose.cells.b.a.a.zg.a(this.d.k());
      while (localzc.c())
      {
        byte[] arrayOfByte = (byte[])localzc.b();
        com.aspose.cells.a.f.zh localzh = this.c.a((String)localzc.a());
        localzh.a(DateTime.getNow());
        this.c.b(arrayOfByte, 0, arrayOfByte.length);
        zasr localzasr = new zasr("text/xml", (String)localzc.a());
        zf.a(this.a, localzasr);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */