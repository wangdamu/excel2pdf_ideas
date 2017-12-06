package com.aspose.cells;

public class Metered
{
  public void setMeteredKey(String publicKey, String privateKey)
    throws Exception
  {
    if ((publicKey == null) || (privateKey == null) || (publicKey.length() == 0) || (privateKey.length() == 0)) {
      throw new Exception("Public key and private key should not be empty.");
    }
    zapi localzapi = new zapi();
    boolean bool = localzapi.a(publicKey, privateKey);
    if (!bool) {
      throw new Exception("Authentication failed.");
    }
  }
  
  public static double getConsumptionQuantity()
    throws Exception
  {
    return zapi.a().c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Metered.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */