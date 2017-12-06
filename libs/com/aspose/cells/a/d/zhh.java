package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zhh
  extends zhi
{
  private zdk a;
  private zdm b;
  
  public zhh(zdk paramzdk)
  {
    super("/Resources");
    this.a = paramzdk;
  }
  
  public String a(zgs paramzgs)
  {
    String str = super.a(paramzgs);
    this.b.e().a("http://schemas.microsoft.com/xps/2005/06/required-resource", str, false);
    return str;
  }
  
  public zhn a(byte[] paramArrayOfByte)
    throws Exception
  {
    zhn localzhn = super.a(paramArrayOfByte);
    this.b.e().a("http://schemas.microsoft.com/xps/2005/06/required-resource", localzhn.a(), false);
    return localzhn;
  }
  
  public void a()
    throws Exception
  {
    Iterator localIterator = e().keySet().iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      this.a.b().a(zhm.a((zgw)e().get(localObject), (String)localObject));
    }
    localIterator = f().keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      zdm localzdm = a((zhn)f().get(localObject));
      this.a.b().a(localzdm);
    }
  }
  
  public void a(int paramInt)
    throws Exception
  {
    zdm localzdm = new zdm("/Documents/1/Pages/" + paramInt + ".fpage", "application/vnd.ms-package.xps-fixedpage+xml");
    this.b = localzdm;
  }
  
  public void b()
    throws Exception
  {
    this.a.b().a(this.b);
  }
  
  private static zdm a(zhn paramzhn)
    throws Exception
  {
    int i = zcc.a(paramzhn.c());
    zdm localzdm = new zdm(paramzhn.a(), b(i));
    localzdm.d().b(paramzhn.c(), 0, paramzhn.c().length);
    return localzdm;
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "image/jpeg";
    case 5: 
      return "image/png";
    case 8: 
      return "image/tiff";
    }
    throw new IllegalStateException("Unexpected image type.");
  }
  
  public zdm c()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */