package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zp;
import java.security.MessageDigest;

class zuh
{
  byte[] a = new byte[20];
  private zxf e;
  MessageDigest b;
  MessageDigest c;
  int d = 128;
  private byte[] f = { -13, 37, 115, -73, -5, -80, 94, 112, -52, 43, -38, 72, -22, -74, 124, -98 };
  private byte[] g = { -122, -39, -127, 105, -11, -77, -126, 51, 86, -80, 21, -69, 51, -7, -33, -53 };
  private byte[] h = { 26, -109, 86, 19, 26, 94, -86, -48, -38, 36, -71, -78, 23, -81, -73, -51 };
  private byte[] i = { -50, -111, 10, 82, 17, -44, -1, 18, 74, -12, 35, 45, -37, 29, -58, -5, -72, -122, 111, -93, -88, -65, 39, 29, -55, -26, 33, -45, 120, -50, 24, -15 };
  private byte[] j = { -57, -104, -55, -34, -51, -97, -53, -72, 39, 88, 114, Byte.MAX_VALUE, -18, -8, -26, -25 };
  
  zuh(zxf paramzxf, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws Exception
  {
    this.e = paramzxf;
    zh localzh = new zh(paramArrayOfByte1, 8, paramArrayOfByte1.length - 8);
    zcjm localzcjm = zauz.a(localzh);
    zcjn localzcjn1 = (zcjn)localzcjm.l().a(0);
    zcjn localzcjn2 = (zcjn)localzcjn1.l().a("keyData");
    zcjg localzcjg1 = localzcjn2.b("saltValue");
    this.f = ze.b(localzcjg1.a());
    String str = "SHA1";
    zcjg localzcjg2 = localzcjn2.b("hashAlgorithm");
    if (localzcjg2 != null) {
      str = localzcjg2.a();
    }
    this.b = a(str);
    zcjn localzcjn3 = (zcjn)localzcjn1.l().a("keyEncryptors");
    zcjn localzcjn4 = null;
    localzcjn4 = (zcjn)localzcjn3.l().a("keyEncryptor").l().a("encryptedKey");
    if (localzcjn4 == null) {
      localzcjn4 = (zcjn)localzcjn3.l().a("keyEncryptor").l().a("p:encryptedKey");
    }
    zcjg localzcjg3 = localzcjn4.b("keyBits");
    if (localzcjg3 != null) {
      this.d = zp.a(localzcjg3.a(), com.aspose.cells.b.a.c.za.b());
    }
    zcjg localzcjg4 = localzcjn4.b("hashAlgorithm");
    if (localzcjg4 != null) {
      str = localzcjg4.a();
    }
    zcjg localzcjg5 = localzcjn4.b("saltValue");
    this.g = ze.b(localzcjg5.a());
    zcjg localzcjg6 = localzcjn4.b("encryptedVerifierHashInput");
    this.h = ze.b(localzcjg6.a());
    zcjg localzcjg7 = localzcjn4.b("encryptedVerifierHashValue");
    this.i = ze.b(localzcjg7.a());
    zcjg localzcjg8 = localzcjn4.b("encryptedKeyValue");
    this.j = ze.b(localzcjg8.a());
    this.c = a(str);
    byte[] arrayOfByte1 = new byte[this.g.length + paramArrayOfByte2.length];
    System.arraycopy(this.g, 0, arrayOfByte1, 0, this.g.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte1, this.g.length, paramArrayOfByte2.length);
    this.a = a(this.c, arrayOfByte1);
    byte[] arrayOfByte2 = new byte[this.a.length + 4];
    for (int k = 0; k < 100000; k++)
    {
      System.arraycopy(zc.a(k), 0, arrayOfByte2, 0, 4);
      System.arraycopy(this.a, 0, arrayOfByte2, 4, this.a.length);
      this.a = a(this.c, arrayOfByte2);
    }
  }
  
  private byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
    throws Exception
  {
    byte[] arrayOfByte1 = { -2, -89, -46, 118, 59, 75, -98, 121 };
    byte[] arrayOfByte2 = new byte[paramArrayOfByte1.length + arrayOfByte1.length];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte2, 0, paramArrayOfByte1.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramArrayOfByte1.length, arrayOfByte1.length);
    byte[] arrayOfByte3 = new byte[this.d / 8];
    System.arraycopy(a(this.c, arrayOfByte2), 0, arrayOfByte3, 0, arrayOfByte3.length);
    za localza = new za("CBC", "ZeroBytePadding", paramArrayOfByte2, arrayOfByte3);
    Object localObject = localza.a(paramArrayOfByte3);
    int k = 16 - localObject.length;
    if (k > 0)
    {
      byte[] arrayOfByte4 = new byte[16];
      System.arraycopy(localObject, 0, arrayOfByte4, 0, localObject.length);
      localObject = arrayOfByte4;
    }
    return a(this.c, (byte[])localObject);
  }
  
  private byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
    throws Exception
  {
    byte[] arrayOfByte1 = { -41, -86, 15, 109, 48, 97, 52, 78 };
    byte[] arrayOfByte2 = new byte[paramArrayOfByte1.length + arrayOfByte1.length];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte2, 0, paramArrayOfByte1.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramArrayOfByte1.length, arrayOfByte1.length);
    byte[] arrayOfByte3 = new byte[this.d / 8];
    System.arraycopy(a(this.c, arrayOfByte2), 0, arrayOfByte3, 0, arrayOfByte3.length);
    int k = (paramArrayOfByte3.length + 15) / 16 * 16;
    byte[] arrayOfByte4 = new byte[k];
    byte[] arrayOfByte5 = new byte[k];
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte4, 0, paramArrayOfByte3.length);
    zb localzb = new zb("CBC", "ZeroBytePadding", paramArrayOfByte2, arrayOfByte3);
    return localzb.a(arrayOfByte4);
  }
  
  boolean a()
    throws Exception
  {
    byte[] arrayOfByte1 = a(this.a, this.g, this.h);
    byte[] arrayOfByte2 = b(this.a, this.g, arrayOfByte1);
    boolean bool = true;
    for (int k = 0; (k < arrayOfByte2.length) && (k < this.i.length); k++) {
      if (arrayOfByte2[k] != this.i[k])
      {
        bool = false;
        break;
      }
    }
    return bool;
  }
  
  zm b()
    throws Exception
  {
    int k = 8;
    byte[] arrayOfByte1 = new byte[this.a.length + 8];
    System.arraycopy(this.a, 0, arrayOfByte1, 0, this.a.length);
    System.arraycopy(new byte[] { 20, 110, 11, -25, -85, -84, -48, -42 }, 0, arrayOfByte1, this.a.length, 8);
    byte[] arrayOfByte2 = a(this.c, arrayOfByte1);
    arrayOfByte1 = new byte[this.d / 8];
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte1.length);
    za localza1 = new za("CBC", "ZeroBytePadding", this.g, arrayOfByte1);
    Object localObject = localza1.a(this.j);
    int m = localObject.length % 16;
    if (m > 0)
    {
      byte[] arrayOfByte3 = new byte[16 - m + localObject.length];
      System.arraycopy(localObject, 0, arrayOfByte3, 0, localObject.length);
      localObject = arrayOfByte3;
    }
    zh localzh1 = this.e.a().a("EncryptedPackage");
    long l1 = localzh1.h();
    long l2 = 0L;
    zh localzh2 = new zh((int)localzh1.h());
    byte[] arrayOfByte4 = new byte['က'];
    localzh1.b(8L);
    arrayOfByte1 = new byte[20];
    byte[] arrayOfByte5 = new byte[16];
    try
    {
      while (l2 < l1 - 8L)
      {
        System.arraycopy(this.f, 0, arrayOfByte1, 0, 16);
        System.arraycopy(zc.a(l2 / 4096L), 0, arrayOfByte1, 16, 4);
        System.arraycopy(a(this.b, arrayOfByte1), 0, arrayOfByte5, 0, 16);
        int n = localzh1.a(arrayOfByte4, 0, 4096);
        byte[] arrayOfByte6 = new byte[n];
        System.arraycopy(arrayOfByte4, 0, arrayOfByte6, 0, n);
        za localza2 = new za("CBC", "ZeroBytePadding", arrayOfByte5, (byte[])localObject);
        byte[] arrayOfByte7 = localza2.a(arrayOfByte6);
        localzh2.b(arrayOfByte7, 0, arrayOfByte7.length > n ? n : arrayOfByte7.length);
        if (n > arrayOfByte7.length)
        {
          byte[] arrayOfByte8 = new byte[n - arrayOfByte7.length];
          localzh2.b(arrayOfByte8, 0, arrayOfByte8.length);
        }
        l2 += n;
      }
    }
    catch (Exception localException)
    {
      throw new CellsException(6, "unkown excel content!");
    }
    localzh2.b(0L);
    return localzh2;
  }
  
  private byte[] a(MessageDigest paramMessageDigest, byte[] paramArrayOfByte)
  {
    paramMessageDigest.update(paramArrayOfByte);
    return paramMessageDigest.digest();
  }
  
  static boolean a(String paramString1, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    try
    {
      byte[] arrayOfByte1 = new byte[paramString1.length() * 2];
      for (int k = 0; k < paramString1.length(); k++)
      {
        arrayOfByte1[(k * 2 + 1)] = ((byte)(paramString1.charAt(k) >> '\b'));
        arrayOfByte1[(k * 2)] = ((byte)(paramString1.charAt(k) & 0xFF));
      }
      MessageDigest localMessageDigest = null;
      if ((paramString2.equals("SHA-256")) || (paramString2.equals("SHA-512")) || (paramString2.equals("SHA-1"))) {
        localMessageDigest = MessageDigest.getInstance(paramString2);
      } else {
        return false;
      }
      byte[] arrayOfByte2 = new byte[paramArrayOfByte2.length + arrayOfByte1.length];
      System.arraycopy(paramArrayOfByte2, 0, arrayOfByte2, 0, paramArrayOfByte2.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramArrayOfByte2.length, arrayOfByte1.length);
      byte[] arrayOfByte3 = localMessageDigest.digest(arrayOfByte2);
      if (arrayOfByte3.length != paramArrayOfByte1.length) {
        return false;
      }
      byte[] arrayOfByte4 = new byte[arrayOfByte3.length + 4];
      for (int m = 0; m < paramInt; m++)
      {
        System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, arrayOfByte3.length);
        System.arraycopy(zc.a(m), 0, arrayOfByte4, arrayOfByte3.length, 4);
        arrayOfByte3 = localMessageDigest.digest(arrayOfByte4);
      }
      m = 1;
      for (int n = 0; n < arrayOfByte3.length; n++) {
        if (arrayOfByte3[n] != paramArrayOfByte1[n])
        {
          m = 0;
          break;
        }
      }
      return m;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private static MessageDigest a(String paramString)
    throws Exception
  {
    MessageDigest localMessageDigest;
    if (paramString.equalsIgnoreCase("SHA256")) {
      localMessageDigest = MessageDigest.getInstance("SHA-256");
    } else if (paramString.equalsIgnoreCase("SHA512")) {
      localMessageDigest = MessageDigest.getInstance("SHA-512");
    } else {
      localMessageDigest = MessageDigest.getInstance("SHA-1");
    }
    return localMessageDigest;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */