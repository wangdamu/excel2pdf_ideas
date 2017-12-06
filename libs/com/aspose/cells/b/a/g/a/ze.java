package com.aspose.cells.b.a.g.a;

import com.aspose.cells.b.a.g.a.a.zb;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ze
{
  private static final int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 3, 4, 0, 0, 0, 4, 4, 5, 5, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 4, 0, 0, 0 };
  private com.aspose.cells.b.a.g.a.a.zc b;
  
  public ze(String paramString)
  {
    this.b = com.aspose.cells.b.a.g.a.a.zc.a(paramString, 32);
  }
  
  public ze(String paramString, int paramInt)
  {
    int i = com.aspose.cells.b.b.zc.a(paramInt);
    this.b = com.aspose.cells.b.a.g.a.a.zc.a(paramString, 0x20 | i);
  }
  
  public zc a(String paramString)
  {
    return new zc(this.b, paramString);
  }
  
  public zc a(String paramString, int paramInt)
  {
    return new zc(this.b, paramString, paramInt);
  }
  
  public static zc a(String paramString1, String paramString2, int paramInt)
  {
    return new ze(paramString2, paramInt).a(paramString1);
  }
  
  public zd b(String paramString)
  {
    return a(this, paramString);
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    Pattern localPattern = Pattern.compile(paramString2);
    Matcher localMatcher = localPattern.matcher(paramString1);
    return localMatcher.matches();
  }
  
  public String[] c(String paramString)
  {
    return this.b.a(paramString, -1);
  }
  
  public static zd a(ze paramze, String paramString)
  {
    return a(paramze.b, paramString);
  }
  
  public static zd a(com.aspose.cells.b.a.g.a.a.zc paramzc, String paramString)
  {
    zd localzd = new zd();
    int i = 0;
    int j = paramString.length();
    while (i < j)
    {
      zb localzb = paramzc.a(paramString);
      if (!localzb.a(i)) {
        break;
      }
      localzd.a(new zc(localzb, true, paramString));
      i = localzb.end();
      if (i == localzb.start()) {
        break;
      }
    }
    return localzd;
  }
  
  public static boolean b(String paramString1, String paramString2, int paramInt)
  {
    ze localze = new ze(paramString2, paramInt);
    return localze.d(paramString1);
  }
  
  public boolean d(String paramString)
  {
    zb localzb = this.b.a(paramString);
    return localzb.a();
  }
  
  public String b(String paramString1, String paramString2)
  {
    return this.b.a(paramString1).a(paramString2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/a/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */