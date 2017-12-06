package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zg;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zdu
{
  public ArrayList a = new ArrayList();
  public HashMap b = zg.a();
  
  public void a(zdt paramzdt)
  {
    try
    {
      zf.a(this.a, paramzdt);
    }
    catch (Exception localException) {}
  }
  
  public void a(String paramString, zed paramzed)
  {
    try
    {
      this.b.put(paramString, paramzed);
    }
    catch (Exception localException) {}
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    Object localObject;
    for (int i = 0; i < this.a.size(); i++)
    {
      localObject = (zdt)this.a.get(i);
      if (((zdt)localObject).c()) {
        ((zdt)localObject).a((zed)this.b.get(((zdt)localObject).b()));
      }
      ((zdt)localObject).a(paramzez);
    }
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      zeb localzeb = (zeb)zm.a(this.b.get(localObject), zeb.class);
      if (localzeb != null) {
        localzeb.a(paramzez);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */