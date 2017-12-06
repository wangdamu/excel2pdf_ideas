package com.aspose.cells.a.d;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.zas;
import java.util.ArrayList;
import java.util.Iterator;

public class zdq
{
  public static void a(zdl paramzdl, boolean paramBoolean)
    throws Exception
  {
    a(paramzdl, paramzdl.c(), "", paramBoolean);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramzdl.b().iterator();
    zdm localzdm;
    while (localIterator.hasNext())
    {
      localzdm = (zdm)localIterator.next();
      if (localzdm.e().a() > 0) {
        zf.a(localArrayList, localzdm);
      }
    }
    localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localzdm = (zdm)localIterator.next();
      a(paramzdl, localzdm.e(), localzdm.a(), paramBoolean);
    }
  }
  
  private static void a(zdl paramzdl, zdp paramzdp, String paramString, boolean paramBoolean)
    throws Exception
  {
    int i = paramString.lastIndexOf('/');
    String str1 = paramString.substring(0, 0 + (i + 1));
    String str2 = paramString.substring(i + 1);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1.startsWith("/") ? "" : "/");
    localStringBuilder.append(str1);
    localStringBuilder.append("_rels/");
    localStringBuilder.append(str2);
    localStringBuilder.append(".rels");
    String str3 = zs.a(localStringBuilder);
    zdm localzdm = new zdm(str3, "application/vnd.openxmlformats-package.relationships+xml");
    zas localzas = new zas(localzdm.d(), paramBoolean);
    localzas.a("Relationships");
    localzas.c("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
    Iterator localIterator = paramzdp.iterator();
    while (localIterator.hasNext())
    {
      zdo localzdo = (zdo)localIterator.next();
      localzas.b("Relationship");
      localzas.c("Id", localzdo.a());
      localzas.c("Type", localzdo.b());
      localzas.c("Target", localzdo.c());
      if (localzdo.d()) {
        localzas.c("TargetMode", "External");
      }
      localzas.c();
    }
    localzas.b();
    paramzdl.b().a(localzdm);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */