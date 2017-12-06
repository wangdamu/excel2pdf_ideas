package com.aspose.cells;

import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zur
{
  zj a;
  zxf b;
  Workbook c;
  ContentTypePropertyCollection d;
  
  zur(Workbook paramWorkbook, zj paramzj)
  {
    this.a = paramzj;
    this.c = paramWorkbook;
    this.d = paramWorkbook.e;
  }
  
  zur(Workbook paramWorkbook, zxf paramzxf)
  {
    this.b = paramzxf;
    this.c = paramWorkbook;
    this.d = paramWorkbook.e;
  }
  
  void a()
    throws Exception
  {
    if (this.b != null) {
      b();
    } else {
      c();
    }
  }
  
  void b()
    throws Exception
  {
    zaoz localzaoz1 = new zaoz();
    zaoz localzaoz2 = null;
    int i = 1;
    CustomXmlPartCollection localCustomXmlPartCollection = this.c.f;
    if ((localCustomXmlPartCollection != null) && (localCustomXmlPartCollection.getCount() > 0)) {
      for (i = 1; i <= localCustomXmlPartCollection.getCount(); i++)
      {
        localObject1 = localCustomXmlPartCollection.get(i - 1);
        localObject2 = zauj.z(i);
        localzaoz2 = new zaoz();
        localzaoz2.a("item", new zh(((CustomXmlPart)localObject1).a));
        localzaoz2.a("Properties", new zh(((CustomXmlPart)localObject1).b));
        localzaoz1.a(zauj.z(i), localzaoz2);
      }
    }
    if ((this.d == null) || (this.d.getCount() == 0))
    {
      if (localzaoz1.b() > 0) {
        this.b.a().a("MsoDataStore", localzaoz1);
      }
      return;
    }
    Object localObject1 = new HashMap();
    Object localObject2 = this.c.getCustomDocumentProperties();
    Object localObject3 = this.d.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (ContentTypeProperty)((Iterator)localObject3).next();
      ArrayList localArrayList = (ArrayList)((HashMap)localObject1).get(((ContentTypeProperty)localObject4).c);
      if (localArrayList == null)
      {
        localArrayList = new ArrayList();
        ((HashMap)localObject1).put(((ContentTypeProperty)localObject4).c, localArrayList);
      }
      zf.a(localArrayList, localObject4);
      if (((CustomDocumentPropertyCollection)localObject2).get(((ContentTypeProperty)localObject4).getName()) == null) {
        ((CustomDocumentPropertyCollection)localObject2).add(((ContentTypeProperty)localObject4).getName(), ((ContentTypeProperty)localObject4).getValue());
      } else {
        ((CustomDocumentPropertyCollection)localObject2).get(((ContentTypeProperty)localObject4).getName()).setValue(((ContentTypeProperty)localObject4).getValue());
      }
    }
    localObject3 = new zh();
    a(null, (HashMap)localObject1, (zh)localObject3);
    ((zh)localObject3).b();
    Object localObject4 = new zh();
    b(null, (HashMap)localObject1, (zh)localObject4);
    ((zh)localObject4).b();
    localzaoz2 = new zaoz();
    localzaoz2.a("item", (zh)localObject3);
    localzaoz2.a("Properties", (zh)localObject4);
    localzaoz1.a(zauj.z(i), localzaoz2);
    i++;
    localObject3 = new zh();
    b(null, (zh)localObject3);
    ((zh)localObject3).b();
    localObject4 = new zh();
    c(null, (zh)localObject4);
    ((zh)localObject4).b();
    localzaoz2 = new zaoz();
    localzaoz2.a("item", (zh)localObject3);
    localzaoz2.a("Properties", (zh)localObject4);
    localzaoz1.a(zauj.z(i), localzaoz2);
    this.b.a().a("MsoDataStore", localzaoz1);
  }
  
  void c()
    throws Exception
  {
    int i = 1;
    CustomXmlPartCollection localCustomXmlPartCollection = this.c.f;
    Object localObject4;
    if ((localCustomXmlPartCollection != null) && (localCustomXmlPartCollection.getCount() > 0)) {
      for (i = 1; i <= localCustomXmlPartCollection.getCount(); i++)
      {
        localObject1 = localCustomXmlPartCollection.get(i - 1);
        localObject2 = zauj.z(i);
        localObject3 = "customXml/item" + (String)localObject2 + ".xml";
        zvw.a(this.a, (String)localObject3, ((CustomXmlPart)localObject1).a, 0, ((CustomXmlPart)localObject1).a.length);
        if (((CustomXmlPart)localObject1).b != null)
        {
          localObject4 = "customXml/itemProps" + (String)localObject2 + ".xml";
          zvw.a(this.a, (String)localObject4, ((CustomXmlPart)localObject1).b, 0, ((CustomXmlPart)localObject1).b.length);
          a("item" + (String)localObject2 + ".xml", "itemProps" + (String)localObject2 + ".xml");
        }
      }
    }
    if ((this.d == null) || (this.d.getCount() == 0)) {
      return;
    }
    Object localObject1 = new HashMap();
    Object localObject2 = this.d.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (ContentTypeProperty)((Iterator)localObject2).next();
      localObject4 = (ArrayList)((HashMap)localObject1).get(((ContentTypeProperty)localObject3).c);
      if (localObject4 == null)
      {
        localObject4 = new ArrayList();
        ((HashMap)localObject1).put(((ContentTypeProperty)localObject3).c, localObject4);
      }
      zf.a((ArrayList)localObject4, localObject3);
    }
    localObject2 = "item" + zauj.z(i) + ".xml";
    Object localObject3 = "itemProps" + zauj.z(i) + ".xml";
    a((String)localObject2, (HashMap)localObject1, null);
    b((String)localObject3, (HashMap)localObject1, null);
    a((String)localObject2, (String)localObject3);
    i++;
    localObject2 = "item" + zauj.z(i) + ".xml";
    localObject3 = "itemProps" + zauj.z(i) + ".xml";
    a((String)localObject2);
    a((String)localObject3, (HashMap)localObject1);
    a((String)localObject2, (String)localObject3);
    i++;
    localObject2 = "item" + zauj.z(i) + ".xml";
    localObject3 = "itemProps" + zauj.z(i) + ".xml";
    b((String)localObject2, null);
    c((String)localObject3, null);
    a((String)localObject2, (String)localObject3);
  }
  
  private void a(String paramString)
    throws Exception
  {
    String str1 = "customXml/" + paramString;
    zcjz localzcjz = zauy.a(str1, this.a, true);
    localzcjz.b(true);
    localzcjz.b("p:properties");
    localzcjz.a("xmlns", "p", null, "http://schemas.microsoft.com/office/2006/metadata/properties");
    localzcjz.a("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
    localzcjz.b("documentManagement");
    for (int i = 0; i < this.d.getCount(); i++)
    {
      ContentTypeProperty localContentTypeProperty = this.d.get(i);
      String str2 = localContentTypeProperty.getName();
      String str3 = localContentTypeProperty.getValue();
      localzcjz.a(null, str2, true);
      localzcjz.a("xmlns", null, localContentTypeProperty.c);
      localzcjz.d(zauj.a(str3));
      localzcjz.a(true);
    }
    localzcjz.b();
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
  }
  
  private void a(String paramString, HashMap paramHashMap)
    throws Exception
  {
    String str1 = "customXml/" + paramString;
    zcjz localzcjz = zauy.a(str1, this.a, true);
    localzcjz.b(true);
    localzcjz.b("ds:datastoreItem");
    localzcjz.a("ds:itemID", null, "{BBB4F38B-0799-4886-B61C-8DBB46B47F73}");
    localzcjz.a("xmlns", "ds", null, "http://schemas.openxmlformats.org/officeDocument/2006/customXml");
    localzcjz.c("ds:schemaRefs", null);
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/2006/metadata/properties");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://purl.org/dc/elements/1.1/");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://purl.org/dc/dcmitype/");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/2006/documentManagement/types");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://purl.org/dc/terms/");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/infopath/2007/PartnerControls");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://www.w3.org/XML/1998/namespace");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    localzcjz.b();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      localzcjz.c("ds:schemaRef", null);
      localzcjz.a("ds:uri", str2);
      localzcjz.b();
    }
    localzcjz.b();
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
  }
  
  private zcjz a(String paramString, zh paramzh)
    throws Exception
  {
    zcjz localzcjz = null;
    if (paramzh == null) {
      localzcjz = zauy.a(paramString, this.a, true);
    } else {
      localzcjz = zauy.a(paramzh, true);
    }
    return localzcjz;
  }
  
  private void b(String paramString, zh paramzh)
    throws Exception
  {
    String str = "customXml/" + paramString;
    zcjz localzcjz = a(str, paramzh);
    localzcjz.b(true);
    localzcjz.b("FormTemplates");
    localzcjz.a("xmlns", null, "http://schemas.microsoft.com/sharepoint/v3/contenttype/forms");
    localzcjz.b("Display", "DocumentLibraryForm");
    localzcjz.b("Edit", "DocumentLibraryForm");
    localzcjz.b("New", "DocumentLibraryForm");
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
  }
  
  private void c(String paramString, zh paramzh)
    throws Exception
  {
    String str = "customXml/" + paramString;
    zcjz localzcjz = a(str, paramzh);
    localzcjz.b(true);
    localzcjz.b("ds:datastoreItem");
    localzcjz.a("ds:itemID", null, "{3847F8EF-8AAF-48C9-9DFE-A66AC49D528B}");
    localzcjz.a("xmlns", "ds", null, "http://schemas.openxmlformats.org/officeDocument/2006/customXml");
    localzcjz.c("ds:schemaRefs", null);
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/sharepoint/v3/contenttype/forms");
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
  }
  
  private void a(String paramString, HashMap paramHashMap, zh paramzh)
    throws Exception
  {
    String str1 = "customXml/" + paramString;
    zcjz localzcjz = a(str1, paramzh);
    localzcjz.b(true);
    localzcjz.b("ct:contentTypeSchema");
    localzcjz.a("ct:_", null, "");
    localzcjz.a("ma:_", null, "");
    localzcjz.a("ma:contentTypeName", null, "Document");
    localzcjz.a("ma:contentTypeID", null, "0x01010002CD4CE788C0924AAB9A9AF8274C3BA0");
    localzcjz.a("ma:contentTypeVersion", null, "4");
    localzcjz.a("ma:contentTypeDescription", null, "Create a new document.");
    localzcjz.a("ma:contentTypeScope", null, "");
    localzcjz.a("ma:versionID", null, "273ab99c845a0ab368c691b7cbc8d5c9");
    localzcjz.a("xmlns", "ct", null, "http://schemas.microsoft.com/office/2006/metadata/contentType");
    localzcjz.a("xmlns", "ma", null, "http://schemas.microsoft.com/office/2006/metadata/properties/metaAttributes");
    localzcjz.c("xsd:schema", null);
    localzcjz.a("targetNamespace", "http://schemas.microsoft.com/office/2006/metadata/properties");
    localzcjz.a("ma:root", "true");
    localzcjz.a("ma:fieldsID", "cc735bd373cf9519d82bcfd02363e949");
    localzcjz.a("ns1:_", "");
    localzcjz.a("xmlns", "xsd", null, "http://www.w3.org/2001/XMLSchema");
    localzcjz.a("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
    localzcjz.a("xmlns", "p", null, "http://schemas.microsoft.com/office/2006/metadata/properties");
    Set localSet = paramHashMap.keySet();
    int i = 1;
    Iterator localIterator1 = localSet.iterator();
    String str2;
    while (localIterator1.hasNext())
    {
      str2 = (String)localIterator1.next();
      localzcjz.a("xmlns", "ns" + i, null, str2);
      i++;
    }
    localIterator1 = localSet.iterator();
    while (localIterator1.hasNext())
    {
      str2 = (String)localIterator1.next();
      localzcjz.c("xsd:import", null);
      localzcjz.a("namespace", str2);
      localzcjz.b();
    }
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "properties");
    localzcjz.c("xsd:complexType", null);
    localzcjz.c("xsd:sequence", null);
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "documentManagement");
    localzcjz.c("xsd:complexType", null);
    localzcjz.c("xsd:all", null);
    i = 1;
    localIterator1 = localSet.iterator();
    ArrayList localArrayList;
    Iterator localIterator2;
    ContentTypeProperty localContentTypeProperty;
    while (localIterator1.hasNext())
    {
      str2 = (String)localIterator1.next();
      localArrayList = (ArrayList)paramHashMap.get(str2);
      localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
      {
        localContentTypeProperty = (ContentTypeProperty)localIterator2.next();
        localzcjz.c("xsd:element", null);
        localzcjz.a("ref", "ns" + i + ":" + localContentTypeProperty.getName());
        localzcjz.a("minOccurs", "0");
        localzcjz.b();
      }
      i++;
    }
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localIterator1 = localSet.iterator();
    while (localIterator1.hasNext())
    {
      str2 = (String)localIterator1.next();
      localzcjz.c("xsd:schema", null);
      localzcjz.a("targetNamespace", str2);
      localzcjz.a("elementFormDefault", "qualified");
      localzcjz.a("xmlns", "xsd", null, "http://www.w3.org/2001/XMLSchema");
      localzcjz.a("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
      localzcjz.a("xmlns", "dms", null, "http://schemas.microsoft.com/office/2006/documentManagement/types");
      localzcjz.a("xmlns", "pc", null, "http://schemas.microsoft.com/office/infopath/2007/PartnerControls");
      localzcjz.c("xsd:import", null);
      localzcjz.a("namespace", "http://schemas.microsoft.com/office/2006/documentManagement/types");
      localzcjz.b();
      localzcjz.c("xsd:import", null);
      localzcjz.a("namespace", "http://schemas.microsoft.com/office/infopath/2007/PartnerControls");
      localzcjz.b();
      localArrayList = (ArrayList)paramHashMap.get(str2);
      localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
      {
        localContentTypeProperty = (ContentTypeProperty)localIterator2.next();
        localzcjz.c("xsd:element", null);
        localzcjz.a("name", localContentTypeProperty.getName());
        localzcjz.a("ma:index", zauj.z(localContentTypeProperty.b));
        localzcjz.a("ma:displayName", localContentTypeProperty.g == null ? localContentTypeProperty.getName() : localContentTypeProperty.g);
        if (localContentTypeProperty.i != null) {
          localzcjz.a("ma:default", localContentTypeProperty.i);
        }
        if (localContentTypeProperty.e != null) {
          localzcjz.a("ma:format", localContentTypeProperty.e);
        }
        localzcjz.a("ma:internalName", localContentTypeProperty.h == null ? localContentTypeProperty.getName() : localContentTypeProperty.h);
        if (localContentTypeProperty.j != null)
        {
          Iterator localIterator3 = localContentTypeProperty.j.keySet().iterator();
          while (localIterator3.hasNext())
          {
            String str3 = (String)localIterator3.next();
            localzcjz.a(str3, (String)localContentTypeProperty.j.get(str3));
          }
        }
        if (localContentTypeProperty.l != null)
        {
          localzcjz.c("xsd:complexType", null);
          localzcjz.d(localContentTypeProperty.l);
          localzcjz.b();
        }
        else
        {
          localzcjz.c("xsd:simpleType", null);
          localzcjz.c("xsd:restriction", null);
          if (localContentTypeProperty.d != null) {
            localzcjz.a("base", localContentTypeProperty.d);
          } else {
            localzcjz.a("base", "dms:Text");
          }
          for (int j = 0; j < localContentTypeProperty.f.size(); j++)
          {
            localzcjz.c("xsd:enumeration ", null);
            localzcjz.a("value", (String)localContentTypeProperty.f.get(j));
            localzcjz.b();
          }
          localzcjz.b();
          localzcjz.b();
        }
        localzcjz.b();
      }
      localzcjz.b();
    }
    localzcjz.c("xsd:schema", null);
    localzcjz.a("targetNamespace", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    localzcjz.a("elementFormDefault", "qualified");
    localzcjz.a("attributeFormDefault", "unqualified");
    localzcjz.a("blockDefault", "#all");
    localzcjz.a("xmlns", null, "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    localzcjz.a("xmlns", "xsd", null, "http://www.w3.org/2001/XMLSchema");
    localzcjz.a("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
    localzcjz.a("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
    localzcjz.a("xmlns", "dcterms", null, "http://purl.org/dc/terms/");
    localzcjz.a("xmlns", "odoc", null, "http://schemas.microsoft.com/internal/obd");
    localzcjz.c("xsd:import", null);
    localzcjz.a("namespace", "http://purl.org/dc/elements/1.1/");
    localzcjz.a("schemaLocation", "http://dublincore.org/schemas/xmls/qdc/2003/04/02/dc.xsd");
    localzcjz.b();
    localzcjz.c("xsd:import", null);
    localzcjz.a("namespace", "http://purl.org/dc/terms/");
    localzcjz.a("schemaLocation", "http://dublincore.org/schemas/xmls/qdc/2003/04/02/dcterms.xsd");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "coreProperties");
    localzcjz.a("type", "CT_coreProperties");
    localzcjz.b();
    localzcjz.c("xsd:complexType ", null);
    localzcjz.a("name", "CT_coreProperties");
    localzcjz.c("xsd:all ", null);
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dc:creator");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dcterms:created");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dc:identifier");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "contentType");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.a("type", "xsd:string");
    localzcjz.a("ma:index", "0");
    localzcjz.a("ma:displayName", "Content Type");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dc:title");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dc:subject");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dc:description");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "keywords");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.a("type", "xsd:string");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dc:language");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "category");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.a("type", "xsd:string");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "version");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.a("type", "xsd:string");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "revision");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.a("type", "xsd:string");
    localzcjz.c("xsd:annotation", null);
    localzcjz.b("xsd:documentation", "This value indicates the number of saves or revisions. The application is responsible for updating this value after each revision.");
    localzcjz.b();
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "lastModifiedBy");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.a("type", "xsd:string");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("ref", "dcterms:modified");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.b();
    localzcjz.c("xsd:element", null);
    localzcjz.a("name", "contentStatus");
    localzcjz.a("minOccurs", "0");
    localzcjz.a("maxOccurs", "1");
    localzcjz.a("type", "xsd:string");
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
  }
  
  private void b(String paramString, HashMap paramHashMap, zh paramzh)
    throws Exception
  {
    String str1 = "customXml/" + paramString;
    zcjz localzcjz = a(str1, paramzh);
    localzcjz.b(true);
    localzcjz.b("ds:datastoreItem");
    localzcjz.a("ds:itemID", null, "{CFA01330-14A1-4347-A117-D4993E0979C9}");
    localzcjz.a("xmlns", "ds", null, "http://schemas.openxmlformats.org/officeDocument/2006/customXml");
    localzcjz.c("ds:schemaRefs", null);
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/2006/metadata/contentType");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/2006/metadata/properties/metaAttributes");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://www.w3.org/2001/XMLSchema");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/2006/metadata/properties");
    localzcjz.b();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      localzcjz.c("ds:schemaRef", null);
      localzcjz.a("ds:uri", str2);
      localzcjz.b();
    }
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/2006/documentManagement/types");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/office/infopath/2007/PartnerControls");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://purl.org/dc/elements/1.1/");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://purl.org/dc/terms/");
    localzcjz.b();
    localzcjz.c("ds:schemaRef", null);
    localzcjz.a("ds:uri", "http://schemas.microsoft.com/internal/obd");
    localzcjz.b();
    localzcjz.b();
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
  }
  
  private void a(String paramString1, String paramString2)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    zrl localzrl = new zrl();
    localzrl.b = "rId1";
    localzrl.c = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXmlProps";
    localzrl.d = paramString2;
    zf.a(localArrayList, localzrl);
    String str = "customXml/_rels/" + paramString1 + ".rels";
    zcjz localzcjz = zauy.a(str, this.a, true);
    zvh.a(localzcjz, localArrayList);
    localzcjz.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */