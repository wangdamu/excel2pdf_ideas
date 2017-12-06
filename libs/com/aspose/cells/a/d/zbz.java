package com.aspose.cells.a.d;

import com.aspose.cells.ImageFormat;
import com.aspose.cells.a.e.zf;
import com.aspose.cells.b.a.b.b.zb;
import com.aspose.cells.b.a.b.b.zc;
import com.aspose.cells.b.a.b.b.zd;
import com.aspose.cells.b.a.b.b.ze;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zh;
import java.util.HashMap;

class zbz
{
  private static HashMap b;
  
  public static void a(zj paramzj, zm paramzm, int paramInt)
  {
    if ((!a) && (paramzj == null)) {
      throw new AssertionError();
    }
    if ((!a) && (paramzm == null)) {
      throw new AssertionError();
    }
    if ((!a) && ((paramInt < 0) || (paramInt > 100))) {
      throw new AssertionError();
    }
    try
    {
      zcc.a(paramzj, paramzm, paramInt);
    }
    catch (Exception localException)
    {
      zf.a(localException);
    }
  }
  
  public static zhc a(zj paramzj, zm paramzm, int paramInt, boolean paramBoolean)
  {
    if ((!a) && (paramzj == null)) {
      throw new AssertionError();
    }
    if ((!a) && (paramzm == null)) {
      throw new AssertionError();
    }
    if ((b(paramInt)) && (paramzj.c() != 196865)) {
      paramzj = a((za)paramzj);
    }
    zd localzd = a(paramInt, paramBoolean);
    ze localze = a(ImageFormat.getTiff());
    zhc localzhc = new zhc();
    localzhc.a(paramzj);
    localzhc.a(paramInt);
    localzhc.a(localzd);
    return localzhc;
  }
  
  private static za a(za paramza)
  {
    return paramza;
  }
  
  private static zd a(int paramInt, boolean paramBoolean)
  {
    zc localzc = new zc(zb.c, a(paramInt));
    if (paramBoolean)
    {
      zd localzd = new zd(2);
      localzd.a()[0] = new zc(zb.g, 18L);
      localzd.a()[1] = localzc;
      return localzd;
    }
    return null;
  }
  
  private static int a(int paramInt)
  {
    return ((Integer)b.get(Integer.valueOf(paramInt))).intValue();
  }
  
  private static ze a(ImageFormat paramImageFormat)
  {
    ze[] arrayOfze = ze.a();
    for (int i = 0; i < arrayOfze.length; i++) {
      if (zh.a(arrayOfze[i].b(), paramImageFormat.a())) {
        return arrayOfze[i];
      }
    }
    throw new IllegalArgumentException("Cannot find a codec for " + paramImageFormat + ".");
  }
  
  private static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 3: 
    case 4: 
      return true;
    }
    return false;
  }
  
  static
  {
    b = new HashMap();
    b.put(Integer.valueOf(1), Integer.valueOf(6));
    b.put(Integer.valueOf(2), Integer.valueOf(5));
    b.put(Integer.valueOf(5), Integer.valueOf(2));
    b.put(Integer.valueOf(3), Integer.valueOf(3));
    b.put(Integer.valueOf(4), Integer.valueOf(4));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */