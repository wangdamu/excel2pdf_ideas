package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.zs;

public class zca
{
  private String a;
  private String b;
  private String c;
  private int d;
  
  public zca(String paramString)
    throws Exception
  {
    if (paramString != null)
    {
      this.a = zk.e(paramString);
      this.b = "";
      this.c = zk.c(paramString);
    }
    else
    {
      throw new UnsupportedOperationException("later");
    }
  }
  
  public String a(int paramInt)
    throws Exception
  {
    this.d += 1;
    StringBuilder localStringBuilder = new StringBuilder(16);
    localStringBuilder.append(this.c);
    localStringBuilder.append('.');
    zp.a(this.d, 3, localStringBuilder);
    localStringBuilder.append('.');
    localStringBuilder.append(zcc.a(paramInt));
    String str = zs.a(localStringBuilder);
    return zk.a(this.a, str);
  }
  
  public String a(String paramString)
    throws Exception
  {
    return zhf.a(paramString) ? paramString : zhf.a(this.b, zk.b(paramString));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */