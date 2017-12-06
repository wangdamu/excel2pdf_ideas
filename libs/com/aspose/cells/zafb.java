package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zafb
{
  private zafo a = null;
  
  zafb(zafo paramzafo)
  {
    this.a = paramzafo;
  }
  
  void a(zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4)
    throws Exception
  {
    StreamProviderOptions localStreamProviderOptions = new StreamProviderOptions();
    zago localzago = this.a.c(paramzago, paramString1, paramString2, paramString3, paramString4, localStreamProviderOptions);
    ArrayList localArrayList = a();
    localzago.a((String)localArrayList.get(0));
    for (int i = 1; i < localArrayList.size(); i++)
    {
      String str = (String)localArrayList.get(i);
      localzago.b(str);
    }
    localzago.h();
    this.a.x.closeStream(localStreamProviderOptions);
  }
  
  private ArrayList a()
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, "<xml xmlns:o=\"urn:schemas-microsoft-com:office:office\">");
    if (this.a.m != null) {
      zf.a(localArrayList, " <o:MainFile HRef=\"../" + this.a.m + "\"/>");
    }
    zf.a(localArrayList, " <o:File HRef=\"editdata.mso\"/>");
    String str1 = (String)this.a.y.get("filelist.xml");
    String str2 = (String)this.a.y.get("stylesheet.css");
    String str3 = (String)this.a.y.get("tabstrip.htm");
    if ((str2 != null) && (this.a.c().isFullPathLink())) {
      zf.a(localArrayList, " <o:File HRef=\"" + str2 + "\"/>");
    } else {
      zf.a(localArrayList, " <o:File HRef=\"stylesheet.css\"/>");
    }
    if ((str3 != null) && (this.a.c().isFullPathLink())) {
      zf.a(localArrayList, " <o:File HRef=\"" + str3 + "\"/>");
    } else {
      zf.a(localArrayList, " <o:File HRef=\"tabstrip.htm\"/>");
    }
    for (int i = 0; i < this.a.u.size(); i++)
    {
      String str4 = "sheet" + zagn.a(i + 1, 3) + ".htm";
      String str5 = (String)this.a.y.get(str4);
      if ((str5 != null) && (this.a.c().isFullPathLink())) {
        zf.a(localArrayList, " <o:File HRef=\"" + str5 + "\"/>");
      } else {
        zf.a(localArrayList, " <o:File HRef=\"" + str4 + "\"/>");
      }
    }
    if ((str1 != null) && (this.a.c().isFullPathLink())) {
      zf.a(localArrayList, " <o:File HRef=\"" + str1 + "\"/>");
    } else {
      zf.a(localArrayList, " <o:File HRef=\"filelist.xml\"/>");
    }
    zf.a(localArrayList, "</xml>");
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */