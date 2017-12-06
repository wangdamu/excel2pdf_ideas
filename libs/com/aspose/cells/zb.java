package com.aspose.cells;

import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

class zb
{
  Cipher a;
  
  zb(String paramString1, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws Exception
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte2, "AES");
    String str = "AES/" + paramString1 + "/" + paramString2;
    this.a = Cipher.getInstance(str, "BC");
    this.a.init(1, localSecretKeySpec, new IvParameterSpec(paramArrayOfByte1));
  }
  
  byte[] a(byte[] paramArrayOfByte)
    throws Exception
  {
    return this.a.doFinal(paramArrayOfByte);
  }
  
  static
  {
    Security.addProvider(new BouncyCastleProvider());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */