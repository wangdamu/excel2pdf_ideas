package com.aspose.cells.a.d;

import com.aspose.cells.zas;
import java.util.Iterator;

public class zdi
{
  private static final com.aspose.cells.b.c.a.za a = new com.aspose.cells.b.c.a.za(new String[] { "application/vnd.openxmlformats-package.relationships+xml", "image/bmp", "image/x-emf", "image/gif", "image/jpeg", "image/x-pcz", "image/png", "image/x-wmf" });
  
  public static void a(zdk paramzdk, boolean paramBoolean)
    throws Exception
  {
    zgm localzgm1 = new zgm();
    zgm localzgm2 = new zgm();
    Object localObject1 = paramzdk.b().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zdm)((Iterator)localObject1).next();
      switch (a.a(((zdm)localObject2).c()))
      {
      case 0: 
        break;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
        if (!localzgm1.a(((zdm)localObject2).b())) {
          localzgm1.a(((zdm)localObject2).b(), ((zdm)localObject2).c());
        }
        break;
      default: 
        localzgm2.a(((zdm)localObject2).a(), ((zdm)localObject2).c());
      }
    }
    localObject1 = new zdm("/[Content_Types].xml", "");
    Object localObject2 = new zas(((zdm)localObject1).d(), paramBoolean);
    ((zas)localObject2).a("Types");
    ((zas)localObject2).c("xmlns", "http://schemas.openxmlformats.org/package/2006/content-types");
    Iterator localIterator = localzgm1.iterator();
    com.aspose.cells.b.a.a.za localza;
    while (localIterator.hasNext())
    {
      localza = (com.aspose.cells.b.a.a.za)localIterator.next();
      a((String)localza.getKey(), (String)localza.getValue(), (zas)localObject2);
    }
    a("rels", "application/vnd.openxmlformats-package.relationships+xml", (zas)localObject2);
    a("xml", "application/xml", (zas)localObject2);
    localIterator = localzgm2.iterator();
    while (localIterator.hasNext())
    {
      localza = (com.aspose.cells.b.a.a.za)localIterator.next();
      b((String)localza.getKey(), (String)localza.getValue(), (zas)localObject2);
    }
    ((zas)localObject2).b();
    paramzdk.b().a((zdm)localObject1);
  }
  
  private static void a(String paramString1, String paramString2, zas paramzas)
    throws Exception
  {
    paramzas.b("Default");
    paramzas.c("Extension", paramString1);
    paramzas.c("ContentType", paramString2);
    paramzas.c();
  }
  
  private static void b(String paramString1, String paramString2, zas paramzas)
    throws Exception
  {
    paramzas.b("Override");
    paramzas.c("PartName", paramString1);
    paramzas.c("ContentType", paramString2);
    paramzas.c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */