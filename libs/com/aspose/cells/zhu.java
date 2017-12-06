package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Enumeration;

class zhu
{
  private X509Certificate a;
  private PrivateKey b = null;
  
  zhu(byte[] paramArrayOfByte)
    throws Exception
  {
    CertificateFactory localCertificateFactory = CertificateFactory.getInstance("X.509");
    this.a = ((X509Certificate)localCertificateFactory.generateCertificate(new ByteArrayInputStream(paramArrayOfByte)));
  }
  
  zhu(KeyStore paramKeyStore, String paramString)
    throws Exception
  {
    this.a = a(paramKeyStore);
    this.b = a(paramKeyStore, paramString);
  }
  
  byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      if ((this.b instanceof DSAPrivateKey))
      {
        localSignature = Signature.getInstance("SHA1withDSA");
        localSignature.initSign(this.b);
        localSignature.update(paramArrayOfByte);
        byte[] arrayOfByte = localSignature.sign();
        return c(arrayOfByte);
      }
      Signature localSignature = Signature.getInstance(b(paramInt));
      localSignature.initSign(this.b);
      localSignature.update(paramArrayOfByte);
      return localSignature.sign();
    }
    catch (Exception localException)
    {
      zl.b(localException);
    }
    return null;
  }
  
  boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
    throws Exception
  {
    PublicKey localPublicKey = this.a.getPublicKey();
    if ((localPublicKey instanceof DSAPublicKey))
    {
      localSignature = Signature.getInstance("SHA1withDSA");
      localSignature.initVerify(localPublicKey);
      localSignature.update(paramArrayOfByte1);
      return localSignature.verify(d(paramArrayOfByte2));
    }
    Signature localSignature = Signature.getInstance(b(paramInt));
    localSignature.initVerify(localPublicKey);
    localSignature.update(paramArrayOfByte1);
    return localSignature.verify(paramArrayOfByte2);
  }
  
  String a()
  {
    PublicKey localPublicKey = this.a.getPublicKey();
    if ((localPublicKey instanceof DSAPublicKey)) {
      return a((DSAPublicKey)localPublicKey);
    }
    return b(this.b.getEncoded());
  }
  
  byte[] b()
    throws Exception
  {
    return this.a.getEncoded();
  }
  
  X509Certificate c()
  {
    return this.a;
  }
  
  static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(a(paramInt));
      localMessageDigest.update(paramArrayOfByte);
      arrayOfByte = localMessageDigest.digest();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return arrayOfByte;
  }
  
  static byte[] a(zm paramzm, int paramInt)
  {
    byte[] arrayOfByte1 = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(a(paramInt));
      byte[] arrayOfByte2 = new byte[(int)paramzm.h()];
      paramzm.a(arrayOfByte2, 0, (int)paramzm.h());
      localMessageDigest.update(arrayOfByte2);
      arrayOfByte1 = localMessageDigest.digest();
    }
    catch (Exception localException) {}
    return arrayOfByte1;
  }
  
  private static String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 1: 
      str = "SHA-1";
      break;
    case 2: 
      str = "SHA-256";
      break;
    case 3: 
      str = "MD5";
      break;
    default: 
      str = "SHA-1";
    }
    return str;
  }
  
  private static String b(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 1: 
      str = "SHA1withRSA";
      break;
    case 2: 
      str = "SHA256withRSA";
      break;
    case 3: 
      str = "MD5withRSA";
    default: 
      str = "SHA1withRSA";
    }
    return str;
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte;
    if (paramArrayOfByte[0] == 0)
    {
      arrayOfByte = new byte[paramArrayOfByte.length - 1];
      System.arraycopy(paramArrayOfByte, 1, arrayOfByte, 0, i - 1);
    }
    else
    {
      arrayOfByte = paramArrayOfByte;
    }
    return arrayOfByte;
  }
  
  private String b(byte[] paramArrayOfByte)
  {
    try
    {
      StringBuffer localStringBuffer = new StringBuffer(1024);
      PKCS8EncodedKeySpec localPKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(paramArrayOfByte);
      KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
      RSAPrivateCrtKey localRSAPrivateCrtKey = (RSAPrivateCrtKey)localKeyFactory.generatePrivate(localPKCS8EncodedKeySpec);
      localStringBuffer.append("<RSAKeyValue>");
      localStringBuffer.append("<Modulus>");
      localStringBuffer.append(ze.a(a(localRSAPrivateCrtKey.getModulus().toByteArray())));
      localStringBuffer.append("</Modulus>");
      localStringBuffer.append("<Exponent>");
      localStringBuffer.append(ze.a(a(localRSAPrivateCrtKey.getPublicExponent().toByteArray())));
      localStringBuffer.append("</Exponent>");
      localStringBuffer.append("</RSAKeyValue>");
      return localStringBuffer.toString().replaceAll("[ \t\n\r]", "");
    }
    catch (Exception localException)
    {
      System.err.println(localException);
    }
    return null;
  }
  
  private String a(DSAPublicKey paramDSAPublicKey)
  {
    try
    {
      StringBuffer localStringBuffer = new StringBuffer(1024);
      DSAParams localDSAParams = paramDSAPublicKey.getParams();
      localStringBuffer.append("<DSAKeyValue>");
      localStringBuffer.append("<P>");
      localStringBuffer.append(ze.a(a(localDSAParams.getP().toByteArray())));
      localStringBuffer.append("</P>");
      localStringBuffer.append("<Q>");
      localStringBuffer.append(ze.a(a(localDSAParams.getQ().toByteArray())));
      localStringBuffer.append("</Q>");
      localStringBuffer.append("<G>");
      localStringBuffer.append(ze.a(a(localDSAParams.getG().toByteArray())));
      localStringBuffer.append("</G>");
      localStringBuffer.append("<Y>");
      localStringBuffer.append(ze.a(a(paramDSAPublicKey.getY().toByteArray())));
      localStringBuffer.append("</Y>");
      localStringBuffer.append("</DSAKeyValue>");
      return localStringBuffer.toString().replaceAll("[ \t\n\r]", "");
    }
    catch (Exception localException)
    {
      zl.b(localException);
    }
    return null;
  }
  
  private X509Certificate a(KeyStore paramKeyStore)
    throws Exception
  {
    Enumeration localEnumeration = paramKeyStore.aliases();
    while (localEnumeration.hasMoreElements())
    {
      Certificate[] arrayOfCertificate = paramKeyStore.getCertificateChain((String)localEnumeration.nextElement());
      if ((arrayOfCertificate != null) && (arrayOfCertificate.length != 0)) {
        for (int i = 0; i < arrayOfCertificate.length; i++)
        {
          X509Certificate localX509Certificate = (X509Certificate)arrayOfCertificate[i];
          boolean[] arrayOfBoolean = localX509Certificate.getKeyUsage();
          if ((arrayOfBoolean != null) && (arrayOfBoolean.length != 0) && (arrayOfBoolean[0] == 1)) {
            return localX509Certificate;
          }
        }
      }
    }
    return null;
  }
  
  private PrivateKey a(KeyStore paramKeyStore, String paramString)
  {
    PrivateKey localPrivateKey = null;
    try
    {
      Enumeration localEnumeration = paramKeyStore.aliases();
      while (localEnumeration.hasMoreElements())
      {
        String str = (String)localEnumeration.nextElement();
        localPrivateKey = (PrivateKey)paramKeyStore.getKey(str, paramString.toCharArray());
      }
    }
    catch (Exception localException) {}
    return localPrivateKey;
  }
  
  private static byte[] c(byte[] paramArrayOfByte)
    throws Exception
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    localByteArrayInputStream.read();
    localByteArrayInputStream.read();
    localByteArrayInputStream.read();
    int i = localByteArrayInputStream.read();
    byte[] arrayOfByte1 = new byte[i];
    localByteArrayInputStream.read(arrayOfByte1);
    localByteArrayInputStream.read();
    int j = localByteArrayInputStream.read();
    byte[] arrayOfByte2 = new byte[j];
    localByteArrayInputStream.read(arrayOfByte2);
    localByteArrayInputStream.close();
    byte[] arrayOfByte3 = new byte[40];
    int k;
    int m;
    if ((arrayOfByte1.length <= 21) && ((arrayOfByte1.length != 21) || (arrayOfByte1[0] == 0))) {
      if (arrayOfByte1.length == 21)
      {
        System.arraycopy(arrayOfByte1, 1, arrayOfByte3, 0, 20);
      }
      else if (arrayOfByte1.length == 20)
      {
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, 20);
      }
      else
      {
        k = arrayOfByte1.length;
        m = 20 - k;
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, m, k);
      }
    }
    if ((arrayOfByte2.length <= 21) && ((arrayOfByte2.length != 21) || (arrayOfByte2[0] == 0))) {
      if (arrayOfByte2.length == 21)
      {
        System.arraycopy(arrayOfByte2, 1, arrayOfByte3, 20, 20);
      }
      else if (arrayOfByte2.length == 20)
      {
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 20, 20);
      }
      else
      {
        k = arrayOfByte2.length;
        m = 40 - k;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, m, k);
      }
    }
    return arrayOfByte3;
  }
  
  private static byte[] d(byte[] paramArrayOfByte)
    throws Exception
  {
    int i = (paramArrayOfByte[0] & 0x80) != 0 ? 1 : 0;
    int j = (paramArrayOfByte[20] & 0x80) != 0 ? 1 : 0;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localByteArrayOutputStream.write(48);
    int k = 44 + (i != 0 ? 1 : 0) + (j != 0 ? 1 : 0);
    localByteArrayOutputStream.write((byte)k);
    localByteArrayOutputStream.write(2);
    localByteArrayOutputStream.write((byte)(i != 0 ? 21 : 20));
    if (i != 0) {
      localByteArrayOutputStream.write(0);
    }
    for (int m = 0; m < 20; m++) {
      localByteArrayOutputStream.write(paramArrayOfByte[m]);
    }
    localByteArrayOutputStream.write(2);
    localByteArrayOutputStream.write((byte)(j != 0 ? 21 : 20));
    if (j != 0) {
      localByteArrayOutputStream.write(0);
    }
    for (m = 20; m < 40; m++) {
      localByteArrayOutputStream.write(paramArrayOfByte[m]);
    }
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */