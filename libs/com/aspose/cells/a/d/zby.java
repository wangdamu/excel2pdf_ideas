package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zm;
import com.aspose.cells.b.a.zh;

public class zby
{
  private double a;
  private double b;
  private double c;
  private double d;
  
  public int hashCode()
  {
    return zm.a(this.a) >> 1 ^ zm.a(this.b) << 3 ^ zm.a(this.c) << 1 ^ zm.a(this.d) >> 3;
  }
  
  public static int a(byte[] paramArrayOfByte)
    throws Exception
  {
    zh localzh = zbo.a(paramArrayOfByte);
    int i = localzh.hashCode();
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */