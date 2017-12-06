package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zab;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;

public abstract class zdl
{
  private zdp c = new zdp("/");
  protected zdn a;
  protected zab b;
  private static final za d = new za(new String[] { "Relationship", "Id", "Type", "Target", "TargetMode" });
  
  public zdn b()
  {
    return this.a;
  }
  
  public void a(zdn paramzdn)
  {
    this.a = paramzdn;
  }
  
  public zdp c()
  {
    return this.c;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (!paramString2.startsWith("/")) {
      return paramString2;
    }
    int i = 0;
    int j = Math.min(paramString1.length(), paramString2.length());
    for (int k = 0; k < j; k++)
    {
      if (paramString1.charAt(k) == '/') {
        i = k;
      }
      if (paramString1.charAt(k) != paramString2.charAt(k)) {
        break;
      }
    }
    k = i + 1;
    StringBuilder localStringBuilder = new StringBuilder();
    for (int m = k; m < paramString1.length(); m++) {
      if (paramString1.charAt(m) == '/') {
        localStringBuilder.append("../");
      }
    }
    localStringBuilder.append(paramString2, k, k + (paramString2.length() - k));
    return zs.a(localStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */