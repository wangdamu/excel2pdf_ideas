package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.g.a.za;
import com.aspose.cells.b.a.g.a.zb;
import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaua
  extends zbzq
{
  private static com.aspose.cells.b.a.g.a.ze d = new com.aspose.cells.b.a.g.a.ze("sig(\\d+)(\\x2Exml)$");
  private boolean e;
  
  public zaua(DigitalSignatureCollection paramDigitalSignatureCollection, boolean paramBoolean)
    throws Exception
  {
    super(paramDigitalSignatureCollection);
    this.e = paramBoolean;
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    b(paramzm);
  }
  
  private zbzm a(zi paramzi, String paramString1, String paramString2)
    throws Exception
  {
    if ((paramString1 == null) || (paramString1.length() <= 0)) {
      return null;
    }
    com.aspose.cells.a.f.zh localzh = paramzi.a(paramString1);
    if (localzh.a() <= 0L) {
      return null;
    }
    zm localzm = paramzi.a(localzh);
    zbzm localzbzm = a(localzm, paramString2);
    localzm.a();
    return localzbzm;
  }
  
  private zbzm a(zi paramzi, com.aspose.cells.a.f.zh paramzh)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    zm localzm = paramzi.a(paramzh);
    localzcjm.a(localzm);
    zbzm localzbzm1 = new zbzm("Reference", "");
    zf.a(localzbzm1.b, new zamo("URI", '/' + paramzh.b() + "?ContentType=application/vnd.openxmlformats-package.relationships+xml"));
    zbzm localzbzm2 = new zbzm("Transforms", "");
    localzbzm1.a(localzbzm2);
    zbzm localzbzm3 = new zbzm("Transform", "");
    zf.a(localzbzm3.b, new zamo("Algorithm", "http://schemas.openxmlformats.org/package/2006/RelationshipTransform"));
    localzbzm2.a(localzbzm3);
    zbzl localzbzl = new zbzl("Transform");
    zf.a(localzbzl.a, new zamo("Algorithm", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    localzbzm2.a(localzbzl);
    zcjn localzcjn = localzcjm.f();
    Object localObject1 = localzcjn.l().iterator();
    Object localObject4;
    while (((Iterator)localObject1).hasNext())
    {
      zcjs localzcjs = (zcjs)((Iterator)localObject1).next();
      localObject2 = zbzo.a(localzcjs, "TargetMode");
      if ((localObject2 == null) || (!((String)localObject2).startsWith("External")))
      {
        localObject3 = zbzo.a(localzcjs, "Target");
        if ((localObject3 != null) && (((String)localObject3).length() > 0) && (!((String)localObject3).startsWith("docProps/")))
        {
          localObject4 = new zbzl("mdssi:RelationshipReference");
          zf.a(((zbzl)localObject4).a, new zamo("SourceId", zbzo.a(localzcjs, "Id")));
          localzbzm3.a((zbzn)localObject4);
        }
      }
    }
    localObject1 = "";
    synchronized (zbzo.a)
    {
      zbzo.a();
      localObject2 = "";
      localObject3 = new String[] { localObject2 };
      localzbzm1.a((String[])localObject3);
      localObject2 = localObject3[0];
      localObject4 = new String[] { localObject1 };
      zbzo.a((String)localObject2, (String[])localObject4, paramzi);
      localObject1 = localObject4[0];
    }
    ??? = new zbzl("DigestMethod");
    zf.a(((zbzl)???).a, new zamo("Algorithm", "http://www.w3.org/2000/09/xmldsig#sha1"));
    localzbzm1.a((zbzn)???);
    Object localObject2 = a((String)localObject1);
    Object localObject3 = new zbzm("DigestValue", com.aspose.cells.b.a.ze.a((byte[])localObject2));
    localzbzm1.a((zbzn)localObject3);
    localzm.a();
    return localzbzm1;
  }
  
  private void a(zbzm paramzbzm)
  {
    zd localzd = new zd();
    Iterator localIterator = paramzbzm.d.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (zbzm)localIterator.next();
      zamo localzamo = (zamo)((zbzm)localObject).b.get(0);
      localzd.a(localzamo.b, localObject);
    }
    paramzbzm.d.clear();
    localIterator = localzd.c().iterator();
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      paramzbzm.a((zbzm)localzd.d(localObject));
    }
  }
  
  private zbzm a(zi paramzi)
    throws Exception
  {
    zbzm localzbzm1 = new zbzm("Object", "");
    zf.a(localzbzm1.b, new zamo("Id", "idPackageObject"));
    zf.a(localzbzm1.b, new zamo("xmlns:mdssi", "http://schemas.openxmlformats.org/package/2006/digital-signature"));
    zbzm localzbzm2 = new zbzm("Manifest", "");
    zbzm localzbzm3 = a();
    localzbzm1.a(localzbzm2);
    localzbzm1.a(localzbzm3);
    Object localObject1 = paramzi.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.aspose.cells.a.f.zh)((Iterator)localObject1).next();
      if ((((com.aspose.cells.a.f.zh)localObject2).b().indexOf("_rels/") >= 0) && (!((com.aspose.cells.a.f.zh)localObject2).b().startsWith("_xmlsignatures")) && (!((com.aspose.cells.a.f.zh)localObject2).c())) {
        localzbzm2.a(a(paramzi, (com.aspose.cells.a.f.zh)localObject2));
      }
    }
    localObject1 = paramzi.a("[Content_Types].xml");
    Object localObject2 = new zcjm();
    zm localzm = paramzi.a((com.aspose.cells.a.f.zh)localObject1);
    ((zcjm)localObject2).a(localzm);
    zcjn localzcjn = ((zcjm)localObject2).f();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Iterator localIterator = localzcjn.l().iterator();
    Object localObject3;
    while (localIterator.hasNext())
    {
      localObject3 = (zcjn)localIterator.next();
      String str1;
      String str2;
      if ("Override".equals(((zcjn)localObject3).k()))
      {
        str1 = zbzo.a((zcjs)localObject3, "PartName");
        str2 = zbzo.a((zcjs)localObject3, "ContentType");
        if (!str1.startsWith("/")) {
          str1 = "/" + str1;
        }
        localHashMap1.put(zw.a(str1, '/'), str1 + "?ContentType=" + str2);
      }
      else if ("Default".equals(((zcjn)localObject3).k()))
      {
        str1 = zbzo.a((zcjs)localObject3, "Extension");
        str2 = zbzo.a((zcjs)localObject3, "ContentType");
        localHashMap2.put("." + str1, "?ContentType=" + str2);
      }
    }
    try
    {
      localIterator = paramzi.iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (com.aspose.cells.a.f.zh)localIterator.next();
        if ((!((com.aspose.cells.a.f.zh)localObject3).b().endsWith(".rels")) && (!"[Content_Types].xml".equals(((com.aspose.cells.a.f.zh)localObject3).b())) && (((com.aspose.cells.a.f.zh)localObject3).b().startsWith("xl/"))) {
          if (localHashMap1.get(((com.aspose.cells.a.f.zh)localObject3).b()) != null) {
            localzbzm2.a(a(paramzi, ((com.aspose.cells.a.f.zh)localObject3).b(), (String)localHashMap1.get(((com.aspose.cells.a.f.zh)localObject3).b())));
          } else if (localHashMap2.get(zk.d(((com.aspose.cells.a.f.zh)localObject3).b())) != null) {
            localzbzm2.a(a(paramzi, ((com.aspose.cells.a.f.zh)localObject3).b(), "/" + ((com.aspose.cells.a.f.zh)localObject3).b() + (String)localHashMap2.get(zk.d(((com.aspose.cells.a.f.zh)localObject3).b()))));
          }
        }
      }
    }
    catch (Exception localException) {}
    a(localzbzm2);
    localzm.a();
    return localzbzm1;
  }
  
  private zbzk a(zi paramzi, DigitalSignature paramDigitalSignature, int paramInt)
    throws Exception
  {
    this.b = paramDigitalSignature;
    zbzk localzbzk = new zbzk();
    zbzm localzbzm1 = new zbzm("Signature", "");
    zf.a(localzbzm1.b, new zamo("Id", "idPackageSignature"));
    zf.a(localzbzm1.b, new zamo("xmlns", "http://www.w3.org/2000/09/xmldsig#"));
    zbzm localzbzm2 = a(paramzi);
    zbzm localzbzm3 = b(paramDigitalSignature);
    zbzm localzbzm4 = a(localzbzm2, localzbzm3);
    localzbzm1.a(localzbzm4);
    localzbzm1.a(a(paramDigitalSignature, localzbzm4));
    localzbzm1.a(a(paramDigitalSignature));
    localzbzm1.a(localzbzm2);
    localzbzm1.a(localzbzm3);
    localzbzk.a(localzbzm1);
    return localzbzk;
  }
  
  private zatw b(zi paramzi)
    throws Exception
  {
    zatw localzatw = new zatw("_xmlsignatures/");
    int i = 0;
    if (this.e) {
      i = c(paramzi);
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      DigitalSignature localDigitalSignature = (DigitalSignature)localIterator.next();
      i++;
      zatx localzatx = new zatx("_xmlsignatures/sig" + i + ".xml");
      localzatx.a(a(paramzi, localDigitalSignature, i));
      localzatw.a(localzatx);
    }
    return localzatw;
  }
  
  private void a(zatw paramzatw, zi paramzi, zj paramzj)
    throws Exception
  {
    zatx localzatx = new zatx("_xmlsignatures/_rels/origin.sigs.rels");
    zbzm localzbzm;
    if (this.e)
    {
      localzatx.a(paramzi, "_xmlsignatures/_rels/origin.sigs.rels");
      localzbzm = (zbzm)((zbzk)localzatx.d.get(0)).d.get(0);
    }
    else
    {
      localObject1 = new zbzk("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?>");
      localzatx.a((zbzn)localObject1);
      localzbzm = new zbzm("Relationships", "");
      ((zbzk)localObject1).a(localzbzm);
      zf.a(localzbzm.b, new zamo("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships"));
    }
    Object localObject1 = paramzatw.d.iterator();
    Object localObject2;
    Object localObject3;
    Object localObject4;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zatx)((Iterator)localObject1).next();
      localObject3 = d.a(((zatx)localObject2).c);
      if (((zc)localObject3).b().a() == 3)
      {
        localObject4 = ((zc)localObject3).b().a(0).b();
        String str = "rId" + ((zc)localObject3).b().a(1).b();
        zbzl localzbzl = new zbzl("Relationship");
        zf.a(localzbzl.a, new zamo("Id", str));
        zf.a(localzbzl.a, new zamo("Type", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/signature"));
        zf.a(localzbzl.a, new zamo("Target", (String)localObject4));
        localzbzm.a(localzbzl);
      }
    }
    localObject1 = new zaub(paramzj);
    localzatx.a((zbzs)localObject1);
    if (this.e)
    {
      localObject2 = paramzi.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (com.aspose.cells.a.f.zh)((Iterator)localObject2).next();
        if ((((com.aspose.cells.a.f.zh)localObject3).a() > 0L) && (((com.aspose.cells.a.f.zh)localObject3).b().startsWith("_xmlsignatures/")) && (((com.aspose.cells.a.f.zh)localObject3).b().endsWith(".xml")))
        {
          localObject4 = paramzj.a(((com.aspose.cells.a.f.zh)localObject3).b());
          ((com.aspose.cells.a.f.zh)localObject4).a(((com.aspose.cells.a.f.zh)localObject3).d());
          paramzj.a((com.aspose.cells.a.f.zh)localObject4);
          a(paramzi.a((com.aspose.cells.a.f.zh)localObject3), paramzj);
          paramzj.l();
        }
      }
    }
    paramzatw.a(new zatx("_xmlsignatures/origin.sigs"));
    localObject1 = new zaub(paramzj);
    paramzatw.a((zbzs)localObject1);
  }
  
  private void b(zm paramzm)
    throws Exception
  {
    zi localzi = zi.a(paramzm);
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zj localzj = new zj(localzh);
    localzj.b(2);
    localzj.d(0);
    zatw localzatw = b(localzi);
    a(localzatw, localzi, localzj);
    b(localzatw, localzi, localzj);
    c(localzatw, localzi, localzj);
    localzj.b();
    localzj.l();
    Iterator localIterator = localzi.iterator();
    while (localIterator.hasNext())
    {
      com.aspose.cells.a.f.zh localzh1 = (com.aspose.cells.a.f.zh)localIterator.next();
      if (localzh1.a() > 0L) {
        if ((!localzh1.b().startsWith("_rels/")) && (!localzh1.b().startsWith("_xmlsignatures/")) && (!localzh1.b().startsWith("[Content_Types].xml")))
        {
          com.aspose.cells.a.f.zh localzh2 = localzj.a(localzh1.b());
          localzh2.a(localzh1.d());
          localzj.a(localzh2);
          a(localzi.a(localzh1), localzj);
          localzj.l();
        }
      }
    }
    localzj.f_();
    localzi.b();
    paramzm.b(0L);
    paramzm.a(0L);
    localzh.b(0L);
    a(localzh, paramzm);
    paramzm.b();
    localzh = null;
  }
  
  private void b(zatw paramzatw, zi paramzi, zj paramzj)
    throws Exception
  {
    zatx localzatx = new zatx("_rels/.rels");
    localzatx.a(paramzi, "_rels/.rels");
    if (!this.e)
    {
      localObject = new zbzl("Relationship");
      zf.a(((zbzl)localObject).a, new zamo("Id", "rId"));
      zf.a(((zbzl)localObject).a, new zamo("Type", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin"));
      zf.a(((zbzl)localObject).a, new zamo("Target", "_xmlsignatures/origin.sigs"));
      localzatx.b("/Relationships/", (zbzn)localObject);
    }
    Object localObject = new zaub(paramzj);
    localzatx.a((zbzs)localObject);
  }
  
  private void a(zatx paramzatx)
  {
    ArrayList localArrayList = new ArrayList();
    zbzk localzbzk = (zbzk)paramzatx.d.get(0);
    zbzm localzbzm = (zbzm)localzbzk.d.get(0);
    Iterator localIterator1 = localzbzm.d.iterator();
    zbzl localzbzl;
    while (localIterator1.hasNext())
    {
      localzbzl = (zbzl)localIterator1.next();
      Iterator localIterator2 = localzbzl.a.iterator();
      while (localIterator2.hasNext())
      {
        zamo localzamo = (zamo)localIterator2.next();
        if (localzamo.b.startsWith("application/vnd.openxmlformats-package.digital-signature-"))
        {
          zf.a(localArrayList, localzbzl);
          break;
        }
      }
    }
    localIterator1 = localArrayList.iterator();
    while (localIterator1.hasNext())
    {
      localzbzl = (zbzl)localIterator1.next();
      localzbzm.d.remove(localzbzl);
    }
  }
  
  private void c(zatw paramzatw, zi paramzi, zj paramzj)
    throws Exception
  {
    zatx localzatx1 = new zatx("[Content_Types].xml");
    localzatx1.a(paramzi, "[Content_Types].xml");
    if (!this.e)
    {
      a(localzatx1);
      localObject = new zbzl("Default");
      zf.a(((zbzl)localObject).a, new zamo("Extension", "sigs"));
      zf.a(((zbzl)localObject).a, new zamo("ContentType", "application/vnd.openxmlformats-package.digital-signature-origin"));
      localzatx1.a("/Types/", (zbzn)localObject);
    }
    Object localObject = paramzatw.d.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zbzn localzbzn = (zbzn)((Iterator)localObject).next();
      if ((localzbzn instanceof zatx))
      {
        zatx localzatx2 = (zatx)localzbzn;
        if (localzatx2.c.startsWith("_xmlsignatures/sig"))
        {
          zbzl localzbzl = new zbzl("Override");
          zf.a(localzbzl.a, new zamo("PartName", "/" + localzatx2.c));
          zf.a(localzbzl.a, new zamo("ContentType", "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml"));
          localzatx1.a("/Types/", localzbzl);
        }
      }
    }
    localObject = new zaub(paramzj);
    localzatx1.a((zbzs)localObject);
  }
  
  public static void a(zm paramzm1, zm paramzm2)
    throws Exception
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    int i;
    while ((i = paramzm1.a(arrayOfByte, 0, arrayOfByte.length)) > 0) {
      paramzm2.b(arrayOfByte, 0, i);
    }
  }
  
  private int c(zi paramzi)
    throws Exception
  {
    int i = 0;
    com.aspose.cells.a.f.zh localzh = paramzi.a("[Content_Types].xml");
    zcjm localzcjm = new zcjm();
    zm localzm = paramzi.a(localzh);
    localzcjm.a(localzm);
    zcjn localzcjn1 = localzcjm.f();
    Iterator localIterator = localzcjn1.l().iterator();
    while (localIterator.hasNext())
    {
      zcjn localzcjn2 = (zcjn)localIterator.next();
      if ("Override".equals(localzcjn2.k()))
      {
        String str1 = zbzo.a(localzcjn2, "ContentType");
        if ("application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml".equals(str1))
        {
          String str2 = zbzo.a(localzcjn2, "PartName");
          zc localzc = d.a(str2);
          if (localzc.b().a() == 3)
          {
            int j = zp.a(localzc.b().a(1).b());
            if (j > i) {
              i = j;
            }
          }
        }
      }
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */