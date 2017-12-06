package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class zbzo
{
  public static HashMap a = new HashMap();
  
  static String a(zcjs paramzcjs, String paramString)
  {
    if ((paramzcjs.e() != null) && (paramzcjs.e().getCount() > 0))
    {
      Iterator localIterator = paramzcjs.e().iterator();
      while (localIterator.hasNext())
      {
        zcjg localzcjg = (zcjg)localIterator.next();
        if (zw.b(localzcjg.k(), paramString)) {
          return localzcjg.d();
        }
      }
    }
    return "";
  }
  
  public static void a()
  {
    a.clear();
  }
  
  public static void a(zcjn paramzcjn, String[] paramArrayOfString, String paramString)
  {
    int tmp9_8 = 0;
    String[] tmp9_7 = paramArrayOfString;
    tmp9_7[tmp9_8] = (tmp9_7[tmp9_8] + "<" + paramzcjn.k());
    String str1 = paramzcjn.a("xmlns");
    if ((str1 != null) && (!a.containsKey(str1)))
    {
      int tmp60_59 = 0;
      String[] tmp60_58 = paramArrayOfString;
      tmp60_58[tmp60_59] = (tmp60_58[tmp60_59] + " xmlns=\"" + str1 + "\"");
      a.put(str1, Integer.valueOf(0));
    }
    else if ((paramString != null) && (!a.containsKey(paramString)))
    {
      int tmp121_120 = 0;
      String[] tmp121_119 = paramArrayOfString;
      tmp121_119[tmp121_120] = (tmp121_119[tmp121_120] + " xmlns=\"" + paramString + "\"");
      a.put(paramString, Integer.valueOf(0));
    }
    Object localObject3;
    if (paramzcjn.g())
    {
      localObject1 = new ArrayList();
      localObject2 = new HashMap();
      localObject3 = paramzcjn.e().iterator();
      Object localObject4;
      Object localObject5;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (zcjg)((Iterator)localObject3).next();
        int i = ((zcjg)localObject4).k().charAt(0);
        localObject5 = ((zcjg)localObject4).k();
        if (i < 97) {
          localObject5 = "z" + (String)localObject5;
        }
        ((HashMap)localObject2).put(localObject5, ((zcjg)localObject4).k());
        zf.a((ArrayList)localObject1, localObject5);
      }
      Collections.sort((List)localObject1);
      localObject3 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (String)((Iterator)localObject3).next();
        String str2 = (String)((HashMap)localObject2).get(localObject4);
        localObject5 = paramzcjn.e().a(str2);
        if (((zcjg)localObject5).k().startsWith("xmlns"))
        {
          if ((((zcjg)localObject5).h != null) && (!a.containsKey(((zcjg)localObject5).h)))
          {
            int tmp388_387 = 0;
            String[] tmp388_386 = paramArrayOfString;
            tmp388_386[tmp388_387] = (tmp388_386[tmp388_387] + " " + ((zcjg)localObject5).k() + "=\"" + ((zcjg)localObject5).h + "\"");
          }
        }
        else
        {
          String str3 = ((zcjg)localObject5).h;
          if (((zcjg)localObject5).k().equals("URI")) {
            str3 = zbpd.c(str3);
          }
          int tmp467_466 = 0;
          String[] tmp467_465 = paramArrayOfString;
          tmp467_465[tmp467_466] = (tmp467_465[tmp467_466] + " " + ((zcjg)localObject5).k() + "=\"" + str3 + "\"");
        }
      }
    }
    int tmp516_515 = 0;
    String[] tmp516_514 = paramArrayOfString;
    tmp516_514[tmp516_515] = (tmp516_514[tmp516_515] + ">");
    Object localObject1 = paramzcjn.l();
    Object localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (zcjs)((Iterator)localObject2).next();
      if (((zcjs)localObject3).e == 3)
      {
        int tmp585_584 = 0;
        String[] tmp585_583 = paramArrayOfString;
        tmp585_583[tmp585_584] = (tmp585_583[tmp585_584] + ((zcjx)localObject3).h);
      }
      else
      {
        a((zcjn)localObject3, paramArrayOfString, paramString);
      }
    }
    int tmp630_629 = 0;
    String[] tmp630_628 = paramArrayOfString;
    tmp630_628[tmp630_629] = (tmp630_628[tmp630_629] + "</" + paramzcjn.k() + ">");
  }
  
  public static String a(zcjn paramzcjn, int[] paramArrayOfInt)
  {
    String str1 = "";
    str1 = str1 + "<SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\">";
    str1 = str1 + "<CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></CanonicalizationMethod>";
    String str2 = a(paramzcjn.e("SignatureMethod"), "Algorithm");
    String str3 = str2.substring(str2.lastIndexOf('-') + 1);
    if (str3.toLowerCase().equals("sha1")) {
      paramArrayOfInt[0] = 1;
    } else if (str3.toLowerCase().equals("sha256")) {
      paramArrayOfInt[0] = 2;
    } else {
      paramArrayOfInt[0] = 1;
    }
    str1 = str1 + "<SignatureMethod Algorithm=\"" + str2 + "\"></SignatureMethod>";
    Iterator localIterator1 = paramzcjn.l().iterator();
    while (localIterator1.hasNext())
    {
      zcjn localzcjn = (zcjn)localIterator1.next();
      if (localzcjn.k().startsWith("Reference"))
      {
        str1 = str1 + "<Reference Type=\"" + a(localzcjn, "Type") + "\" URI=\"" + a(localzcjn, "URI") + "\">";
        zcjs localzcjs1 = localzcjn.e("Transforms");
        if (localzcjs1 != null)
        {
          str1 = str1 + "<Transforms>";
          Iterator localIterator2 = localzcjs1.l().iterator();
          while (localIterator2.hasNext())
          {
            zcjs localzcjs2 = (zcjs)localIterator2.next();
            str1 = str1 + "<Transform Algorithm=\"" + a(localzcjs2, "Algorithm") + "\"></Transform>";
          }
          str1 = str1 + "</Transforms>";
        }
        str1 = str1 + "<DigestMethod Algorithm=\"" + a(localzcjn.e("DigestMethod"), "Algorithm") + "\"></DigestMethod><DigestValue>" + localzcjn.e("DigestValue").d() + "</DigestValue>";
        str1 = str1 + "</Reference>";
      }
    }
    str1 = str1 + "</SignedInfo>";
    return str1;
  }
  
  static void a(String paramString, String[] paramArrayOfString)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    try
    {
      localzcjm.a("<?xml version=\"1.0\" encoding=\"UTF-8\"?><B xmlns=\"http://www.w3.org/2000/09/xmldsig#\">" + paramString + "</B>", false, false);
    }
    catch (Exception localException) {}
    zcjn localzcjn = (zcjn)localzcjm.l().a(0).m();
    a(localzcjn, paramArrayOfString, "http://www.w3.org/2000/09/xmldsig#");
  }
  
  static void a(String paramString, String[] paramArrayOfString, zi paramzi)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    localzcjm.a("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Fix xmlns:mdssi=\"http://schemas.openxmlformats.org/package/2006/digital-signature\">" + paramString + "</Fix>", false, false);
    zcjn localzcjn = localzcjm.f();
    a(localzcjn, paramArrayOfString, paramzi);
  }
  
  static void a(zcjn paramzcjn, String[] paramArrayOfString, zi paramzi)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    zcju localzcju = paramzcjn.c("mdssi:RelationshipReference");
    Object localObject1 = localzcju.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zcjn)((Iterator)localObject1).next();
      zf.a(localArrayList, a((zcjs)localObject2, "SourceId"));
    }
    Collections.sort(localArrayList);
    localObject1 = new zbzm("Relationships", "");
    zf.a(((zbzm)localObject1).b, new zamo("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships"));
    Object localObject2 = ((zcjn)paramzcjn.m()).e().a("URI").d();
    localObject2 = ((String)localObject2).substring(0, 0 + ((String)localObject2).indexOf('?'));
    zh localzh = paramzi.a(zw.a((String)localObject2, '/'));
    if (localzh == null) {
      return;
    }
    zcjm localzcjm = new zcjm();
    zm localzm = paramzi.a(localzh);
    localzcjm.a(localzm);
    Iterator localIterator1 = localArrayList.iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      Iterator localIterator2 = localzcjm.f().l().iterator();
      while (localIterator2.hasNext())
      {
        zcjn localzcjn = (zcjn)localIterator2.next();
        if (zw.b(localzcjn.a("Id"), str))
        {
          zbzm localzbzm = new zbzm("Relationship", "");
          zf.a(localzbzm.b, new zamo("Id", str));
          zf.a(localzbzm.b, new zamo("Target", localzcjn.a("Target")));
          zf.a(localzbzm.b, new zamo("TargetMode", "Internal"));
          zf.a(localzbzm.b, new zamo("Type", localzcjn.a("Type")));
          ((zbzm)localObject1).a(localzbzm);
        }
      }
    }
    localzm.a();
    ((zbzm)localObject1).a(paramArrayOfString);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */