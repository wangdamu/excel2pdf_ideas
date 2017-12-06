package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zab;
import com.aspose.cells.a.c.zg;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class zdn
  implements Iterable
{
  private zab a;
  private ArrayList b = new ArrayList();
  private Map c;
  
  public zdn(zab paramzab)
  {
    this.a = paramzab;
    this.c = zg.a();
  }
  
  public void a(zdm paramzdm)
    throws Exception
  {
    paramzdm.d().b(0L);
    this.a.a(b(paramzdm.a()), paramzdm.d());
    paramzdm.d().a();
    paramzdm.a(null);
    this.c.put(paramzdm.a(), paramzdm);
  }
  
  public void b(zdm paramzdm)
    throws Exception
  {
    paramzdm.d().b(0L);
    zf.a(this.b, paramzdm);
    this.c.put(paramzdm.a(), paramzdm);
  }
  
  public void a()
    throws Exception
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      zdm localzdm = (zdm)localIterator.next();
      localzdm.d().b(0L);
      this.a.a(b(localzdm.a()), localzdm.d());
      localzdm.d().a();
      localzdm.a(null);
    }
  }
  
  public zdm a(String paramString)
  {
    return (zdm)this.c.get(paramString);
  }
  
  public Iterator iterator()
  {
    return this.c.values().iterator();
  }
  
  private static String b(String paramString)
  {
    return zw.a(paramString, '/');
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */