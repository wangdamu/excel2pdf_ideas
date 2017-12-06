package com.aspose.cells.a.c;

import java.security.MessageDigest;

public class zq
{
  public static byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramArrayOfByte);
      return localMessageDigest.digest();
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */