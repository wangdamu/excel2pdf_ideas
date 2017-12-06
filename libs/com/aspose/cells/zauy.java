package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.g.zd;

public class zauy
{
  public static zcjz a(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    zo localzo = new zo(paramzm, paramEncoding);
    localzo.b("\r\n");
    return new zcjz(localzo);
  }
  
  public static zcjy b(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    return new zcjy(paramzm, paramEncoding);
  }
  
  public static zcjy a(zm paramzm)
    throws Exception
  {
    return new zcjy(paramzm);
  }
  
  public static zcjy a(String paramString, boolean paramBoolean)
    throws Exception
  {
    return new zcjy(paramString, paramBoolean);
  }
  
  public static zcjy a(zi paramzi, String paramString, boolean paramBoolean)
    throws Exception
  {
    zh localzh = paramzi.a(paramString);
    if (localzh == null) {
      return null;
    }
    zm localzm = paramzi.a(localzh);
    zcjy localzcjy = new zcjy(localzm);
    if (localzcjy != null) {
      localzcjy.b(paramBoolean);
    }
    return localzcjy;
  }
  
  public static zcjy a(zi paramzi, String paramString)
    throws Exception
  {
    zh localzh = paramzi.a(paramString);
    if (localzh == null) {
      return null;
    }
    zm localzm = paramzi.a(localzh);
    zbyt localzbyt = new zbyt(localzm);
    if (localzbyt != null) {
      localzbyt.b(true);
    }
    return localzbyt;
  }
  
  public static zcjz a(String paramString, zj paramzj, boolean paramBoolean)
    throws Exception
  {
    zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    zcjz localzcjz = new zcjz(paramzj, new zd(false));
    localzcjz.c(paramBoolean);
    return localzcjz;
  }
  
  public static zcjz a(zm paramzm, boolean paramBoolean)
    throws Exception
  {
    zcjz localzcjz = new zcjz(paramzm, new zd(false));
    localzcjz.c(paramBoolean);
    return localzcjz;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */