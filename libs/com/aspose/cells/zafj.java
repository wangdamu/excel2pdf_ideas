package com.aspose.cells;

import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.HashMap;

class zafj
{
  private zafo a = null;
  private String b;
  private int c;
  private HtmlSaveOptions d;
  
  zafj(Workbook paramWorkbook, zm paramzm, String paramString, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    this.c = paramHtmlSaveOptions.getSaveFormat();
    this.d = paramHtmlSaveOptions;
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    zug.b(localWorksheetCollection);
    localWorksheetCollection.a(paramHtmlSaveOptions);
    this.a = new zafo(paramWorkbook, null, paramString, paramzm, paramHtmlSaveOptions);
  }
  
  zafj(Workbook paramWorkbook, zm paramzm, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    this.c = paramHtmlSaveOptions.getSaveFormat();
    this.d = paramHtmlSaveOptions;
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    zug.b(localWorksheetCollection);
    localWorksheetCollection.a(paramHtmlSaveOptions);
    String str1 = paramWorkbook.getFileName();
    String str2 = null;
    if ((str1 == null) || ("".equals(str1))) {
      str2 = "c://main.mht";
    } else {
      str2 = zk.e(str1) + zk.a + zk.c(str1) + ".mht";
    }
    this.a = new zafo(paramWorkbook, str2, null, paramzm, paramHtmlSaveOptions);
  }
  
  zafj(Workbook paramWorkbook, String paramString1, String paramString2, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    this.c = paramHtmlSaveOptions.getSaveFormat();
    this.d = paramHtmlSaveOptions;
    this.b = paramString1;
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    zug.b(localWorksheetCollection);
    this.a = new zafo(paramWorkbook, paramString1, paramString2, null, paramHtmlSaveOptions);
  }
  
  void a()
    throws Exception
  {
    zh localzh = new zh();
    Encoding localEncoding = this.a.c().getEncoding();
    if (localEncoding == null) {
      localEncoding = Encoding.getUTF8();
    }
    zaog localzaog = null;
    zago localzago = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    ArrayList localArrayList = null;
    String str7 = null;
    String str8 = zk.c(this.b);
    Object localObject1;
    if ((str8 == null) || ("".equals(str8)))
    {
      localObject1 = this.a.k().getFileName();
      if ((localObject1 == null) || ("".equals(localObject1))) {
        str8 = "main";
      } else {
        str8 = zk.c(this.a.k().getFileName());
      }
    }
    if (this.c == 17)
    {
      str1 = "----=_NextPart_aspose01.20120615";
      str2 = "file:///C:/aspose01/";
      str3 = "quoted-printable";
      str4 = "base64";
      str5 = "text/html; charset=\"" + Encoding.getUTF8().b() + "\"";
      str6 = "image/png";
      localArrayList = new ArrayList();
      localzaog = new zaog(localzh, localEncoding);
      localzago = localzaog.a(str1);
      localzago.a(17);
      localzago.a(Encoding.getUTF8());
      str1 = "--" + str1;
    }
    if (((this.a.q != null) && (!this.a.c().getExportImagesAsBase64())) || ((this.a.c().getExportImagesAsBase64()) && (this.a.c().getExportObjectListener() == null)))
    {
      localObject1 = new zafd(this.a);
      ((zafd)localObject1).a(localzago, str1, str2 + str8 + "_files/", str4, str6, false);
    }
    Object localObject3;
    if (this.c == 17)
    {
      localObject1 = new zafe(this.a, str2, this.d);
      str7 = str8 + ".htm";
      ((zafe)localObject1).a(localzago, str1, str2 + str7, str3, str5, this.d);
      if (localArrayList != null)
      {
        zf.a(localArrayList, str7);
        str2 = str2 + str8 + "_files/";
      }
      if (((this.a.q != null) && (!this.a.c().getExportImagesAsBase64())) || ((this.a.c().getExportImagesAsBase64()) && (this.a.c().getExportObjectListener() == null)))
      {
        localObject3 = new zafd(this.a);
        ((zafd)localObject3).a(localzago, str1, str2, str4, str6, true);
      }
    }
    if (this.a.u.size() <= 1)
    {
      if (this.c != 17)
      {
        localObject1 = new zafe(this.a, str2, this.d);
        str7 = str8 + ".htm";
        ((zafe)localObject1).a(localzago, str1, str2 + str7, str3, str5, this.d);
        if (localArrayList != null)
        {
          zf.a(localArrayList, str7);
          str2 = str2 + str8 + "_files/";
        }
      }
      if ((localzago != null) && (localzago.b().size() > 0))
      {
        localObject1 = zg.a(localzago.b());
        while (((zc)localObject1).c())
        {
          zafo.b(localzago, str1, (String)((zc)localObject1).a(), str4, str6);
          localzago.a(ze.a((byte[])((zc)localObject1).b()));
        }
      }
      if (localzaog != null)
      {
        localObject1 = new zafb(this.a);
        str7 = "filelist.xml";
        ((zafb)localObject1).a(localzago, str1, str2 + str7, str3, str5);
        if (localArrayList != null) {
          zf.a(localArrayList, str7);
        }
        localzaog.a(str1, false);
        localzh.b(0L);
        localzaog.a(this.b, localzh, Encoding.getUTF8(), str1);
      }
      return;
    }
    Object localObject4;
    for (int i = 0; i < this.a.u.size(); i++)
    {
      localObject3 = new zafi(this.a, i, str2, this.d);
      localObject4 = ((zafi)localObject3).a(localzago, str1, str2, str3, str5, this.d);
      if (localArrayList != null) {
        zf.a(localArrayList, localObject4);
      }
    }
    if (this.a.u.size() > 1)
    {
      localObject2 = null;
      str7 = "stylesheet.css";
      localObject3 = new StreamProviderOptions();
      localObject2 = this.a.b(localzago, str1, str2 + str7, str3, str5, (StreamProviderOptions)localObject3);
      localObject4 = new zaff(this.a);
      ((zaff)localObject4).a((zago)localObject2);
      if (localArrayList != null) {
        zf.a(localArrayList, str7);
      }
      this.a.x.closeStream((StreamProviderOptions)localObject3);
      zafh localzafh = new zafh(this.a);
      str7 = "tabstrip.htm";
      localzafh.a(localzago, str1, str2 + str7, str3, str5);
      if (localArrayList != null) {
        zf.a(localArrayList, str7);
      }
    }
    if ((localzago != null) && (localzago.b().size() > 0))
    {
      localObject2 = zg.a(localzago.b());
      while (((zc)localObject2).c())
      {
        zafo.b(localzago, str1, (String)((zc)localObject2).a(), str4, str6);
        localzago.a(ze.a((byte[])((zc)localObject2).b()));
      }
    }
    Object localObject2 = new zafb(this.a);
    str7 = "filelist.xml";
    ((zafb)localObject2).a(localzago, str1, str2 + str7, str3, str5);
    if (localArrayList != null) {
      zf.a(localArrayList, str7);
    }
    if (this.c != 17)
    {
      localObject3 = new zafe(this.a, str2, this.d);
      str7 = str8 + ".htm";
      ((zafe)localObject3).a(localzago, str1, str2 + str7, str3, str5, this.d);
      if (localArrayList != null)
      {
        zf.a(localArrayList, str7);
        str2 = str2 + str8 + "_files/";
      }
    }
    if (localzaog != null)
    {
      localzaog.a(str1, false);
      localzh.b(0L);
      localzaog.a(this.b, localzh, Encoding.getUTF8(), str1);
    }
  }
  
  void a(zm paramzm)
    throws Exception
  {
    zh localzh = new zh();
    Encoding localEncoding = this.a.c().getEncoding();
    if (localEncoding == null) {
      localEncoding = Encoding.getUTF8();
    }
    zaog localzaog = null;
    zago localzago = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    ArrayList localArrayList = null;
    String str7 = null;
    String str8 = zk.c(this.b);
    if ((str8 == null) || ("".equals(str8)))
    {
      localObject1 = this.a.k().getFileName();
      if ((localObject1 == null) || ("".equals(localObject1))) {
        str8 = "main";
      } else {
        str8 = zk.c(this.a.k().getFileName());
      }
    }
    if (this.c == 17)
    {
      str1 = "----=_NextPart_aspose01.20120615";
      str2 = "file:///C:/aspose01/";
      str3 = "quoted-printable";
      str4 = "base64";
      str5 = "text/html; charset=\"" + Encoding.getUTF8().b() + "\"";
      str6 = "image/png";
      localArrayList = new ArrayList();
      localzaog = new zaog(localzh, localEncoding);
      localzago = localzaog.a(str1);
      localzago.a(17);
      localzago.a(Encoding.getUTF8());
      str1 = "--" + str1;
    }
    if ((this.a.q != null) && (this.a.c().getExportObjectListener() == null))
    {
      localObject1 = new zafd(this.a);
      ((zafd)localObject1).a(localzago, str1, str2 + str8 + "_files/", str4, str6, false);
    }
    Object localObject1 = new zafe(this.a, str2, this.d);
    str7 = str8 + ".htm";
    ((zafe)localObject1).a(localzago, str1, str2 + str7, str3, str5, this.d);
    if (localArrayList != null)
    {
      zf.a(localArrayList, str7);
      str2 = str2 + str8 + "_files/";
    }
    Object localObject2;
    if ((localzago != null) && (this.a.q != null) && (this.a.c().getExportObjectListener() == null))
    {
      localObject2 = new zafd(this.a);
      ((zafd)localObject2).a(localzago, str1, str2, str4, str6, true);
    }
    if (this.a.u.size() <= 1)
    {
      if ((localzago != null) && (localzago.b().size() > 0))
      {
        localObject2 = zg.a(localzago.b());
        while (((zc)localObject2).c())
        {
          zafo.b(localzago, str1, (String)((zc)localObject2).a(), str4, str6);
          localzago.a(ze.a((byte[])((zc)localObject2).b()));
        }
      }
      if (localzaog != null)
      {
        localObject2 = new zafb(this.a);
        str7 = "filelist.xml";
        ((zafb)localObject2).a(localzago, str1, str2 + str7, str3, str5);
        if (localArrayList != null) {
          zf.a(localArrayList, str7);
        }
        localzaog.a(str1, false);
        localzh.b(0L);
        localzaog.a(paramzm, localzh, Encoding.getUTF8(), str1);
      }
      return;
    }
    Object localObject4;
    Object localObject5;
    for (int i = 0; i < this.a.u.size(); i++)
    {
      localObject4 = new zafi(this.a, i, str2, this.d);
      localObject5 = ((zafi)localObject4).a(localzago, str1, str2, str3, str5, this.d);
      if (localArrayList != null) {
        zf.a(localArrayList, localObject5);
      }
    }
    if (this.a.u.size() > 1)
    {
      localObject3 = null;
      str7 = "stylesheet.css";
      localObject4 = new StreamProviderOptions();
      localObject3 = this.a.b(localzago, str1, str2 + str7, str3, str5, (StreamProviderOptions)localObject4);
      localObject5 = new zaff(this.a);
      ((zaff)localObject5).a((zago)localObject3);
      if (localArrayList != null) {
        zf.a(localArrayList, str7);
      }
      this.a.x.closeStream((StreamProviderOptions)localObject4);
      zafh localzafh = new zafh(this.a);
      str7 = "tabstrip.htm";
      localzafh.a(localzago, str1, str2 + str7, str3, str5);
      if (localArrayList != null) {
        zf.a(localArrayList, str7);
      }
    }
    if ((localzago != null) && (localzago.b().size() > 0))
    {
      localObject3 = zg.a(localzago.b());
      while (((zc)localObject3).c())
      {
        zafo.b(localzago, str1, (String)((zc)localObject3).a(), str4, str6);
        localzago.a(ze.a((byte[])((zc)localObject3).b()));
      }
    }
    Object localObject3 = new zafb(this.a);
    str7 = "filelist.xml";
    ((zafb)localObject3).a(localzago, str1, str2 + str7, str3, str5);
    if (localArrayList != null) {
      zf.a(localArrayList, str7);
    }
    if (localzaog != null)
    {
      localzaog.a(str1, false);
      localzh.b(0L);
      localzaog.a(paramzm, localzh, Encoding.getUTF8(), str1);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */