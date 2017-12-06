package com.aspose.cells.b.a.d;

import java.io.File;
import java.io.IOException;

public final class zd
{
  public static ze a(String paramString, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    return new ze(paramString, paramInt1, paramInt2);
  }
  
  public static ze a(String paramString)
    throws Exception
  {
    return new ze(paramString, 2, 3);
  }
  
  public static ze b(String paramString)
    throws Exception
  {
    return new ze(paramString, 3, 1);
  }
  
  public static boolean c(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    File localFile = new File(paramString);
    return (localFile.exists()) && (!localFile.isDirectory());
  }
  
  public static void d(String paramString)
    throws IOException
  {
    File localFile = new File(paramString);
    if ((localFile.exists()) && (!localFile.delete())) {
      throw new IOException("Can't delete " + paramString + "!");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */