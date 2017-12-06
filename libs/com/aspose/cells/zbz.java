package com.aspose.cells;

import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class zbz
{
  private MessageDigest a;
  private Cipher b;
  private int c;
  private byte[] d;
  private byte[] e;
  private byte[] f;
  private byte[] g;
  
  public zbz(String paramString1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    throws Exception
  {
    this(paramString1, paramArrayOfByte1, (int)paramLong4);
    this.f = paramArrayOfByte2;
    this.g = paramArrayOfByte3;
  }
  
  public zbz(String paramString, byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    a(paramString, paramArrayOfByte, b(paramInt), 2);
  }
  
  public zbz(String paramString, int paramInt)
    throws Exception
  {
    a(paramString, new byte[] { 83, 15, -37, -89, 86, -75, -10, -115, 61, -31, -106, 31, 16, 81, 36, 2 }, paramInt, 1);
  }
  
  private void a(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    if ((paramString == null) || (paramString.length() < 1)) {
      throw new IllegalArgumentException("The password could not be null or empty.");
    }
    this.d = paramString.getBytes("UTF-16LE");
    if (this.d.length < 1) {
      throw new IllegalArgumentException("The password could not be null or empty.");
    }
    this.c = paramInt1;
    this.e = paramArrayOfByte;
    this.a = MessageDigest.getInstance("SHA-1");
    this.b = Cipher.getInstance("AES/ECB/NoPadding");
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(c(), "AES");
    this.b.init(paramInt2, localSecretKeySpec);
  }
  
  private byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte1 = new byte[paramArrayOfByte1.length + paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte1, 0, paramArrayOfByte2.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, paramArrayOfByte2.length, paramArrayOfByte1.length);
    byte[] arrayOfByte2 = a(arrayOfByte1);
    arrayOfByte1 = new byte[24];
    byte[] arrayOfByte3 = new byte[4];
    for (int i = 0; i < 50000; i++)
    {
      zamp.a(arrayOfByte3, 0, i);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte1, 0, 4);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 4, 20);
      arrayOfByte2 = a(arrayOfByte1);
    }
    return arrayOfByte2;
  }
  
  private byte[] c()
  {
    byte[] arrayOfByte1 = b(this.d, this.e);
    byte[] arrayOfByte2 = new byte[24];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    arrayOfByte1 = null;
    arrayOfByte2 = a(arrayOfByte2);
    byte[] arrayOfByte3 = new byte[64];
    Arrays.fill(arrayOfByte3, (byte)54);
    for (int i = 0; i < 20; i++)
    {
      int tmp59_57 = i;
      byte[] tmp59_56 = arrayOfByte3;
      tmp59_56[tmp59_57] = ((byte)(tmp59_56[tmp59_57] ^ arrayOfByte2[i]));
    }
    byte[] arrayOfByte4 = new byte[64];
    Arrays.fill(arrayOfByte4, (byte)92);
    for (int j = 0; j < 20; j++)
    {
      int tmp101_99 = j;
      byte[] tmp101_97 = arrayOfByte4;
      tmp101_97[tmp101_99] = ((byte)(tmp101_97[tmp101_99] ^ arrayOfByte2[j]));
    }
    byte[] arrayOfByte5;
    switch (this.c)
    {
    case 128: 
      arrayOfByte5 = new byte[16];
      System.arraycopy(a(arrayOfByte3), 0, arrayOfByte5, 0, 16);
      return arrayOfByte5;
    case 192: 
      arrayOfByte5 = new byte[24];
      System.arraycopy(a(arrayOfByte3), 0, arrayOfByte5, 0, 16);
      System.arraycopy(a(arrayOfByte4), 0, arrayOfByte5, 16, 8);
      return arrayOfByte5;
    case 256: 
      arrayOfByte5 = new byte[32];
      System.arraycopy(a(arrayOfByte3), 0, arrayOfByte5, 0, 16);
      System.arraycopy(a(arrayOfByte4), 0, arrayOfByte5, 16, 16);
      return arrayOfByte5;
    }
    throw new IllegalArgumentException("Unsupported key size: " + this.c);
  }
  
  public boolean a()
  {
    return a(this.f, this.g);
  }
  
  public boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      byte[] arrayOfByte = this.b.doFinal(paramArrayOfByte1);
      arrayOfByte = a(arrayOfByte);
      paramArrayOfByte2 = this.b.doFinal(paramArrayOfByte2);
      for (int i = 0; i < 20; i++) {
        if (arrayOfByte[i] != paramArrayOfByte2[i]) {
          return false;
        }
      }
      return true;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
  
  public zh a(zh paramzh)
    throws Exception
  {
    za localza = new za(paramzh);
    int i = (int)((paramzh.h() + 15L) / 16L);
    zh localzh = new zh(i * 16);
    zb localzb = new zb(localzh);
    localza.k().a(8L, 0);
    byte[] arrayOfByte = new byte[16];
    for (int j = 0; j < i - 1; j++)
    {
      localza.a(arrayOfByte, 0, 16);
      this.b.doFinal(arrayOfByte, 0, 16, arrayOfByte);
      localzb.a(arrayOfByte);
    }
    j = localza.a(arrayOfByte, 0, 16);
    if (j > 0)
    {
      if (j < 16) {
        Arrays.fill(arrayOfByte, j, 16, (byte)0);
      }
      this.b.doFinal(arrayOfByte, 0, 16, arrayOfByte);
      localzb.a(arrayOfByte);
    }
    localza.l();
    localzh.a(0L, 0);
    return localzh;
  }
  
  public zh b()
    throws Exception
  {
    zh localzh = new zh(248);
    zb localzb = new zb(localzh);
    byte[] arrayOfByte1 = new byte[16];
    arrayOfByte1[0] = 3;
    arrayOfByte1[2] = 2;
    arrayOfByte1[4] = 36;
    arrayOfByte1[8] = -92;
    arrayOfByte1[12] = 36;
    localzb.a(arrayOfByte1);
    Arrays.fill(arrayOfByte1, (byte)0);
    zamp.a(arrayOfByte1, 4, a(this.c));
    arrayOfByte1[8] = 4;
    arrayOfByte1[9] = Byte.MIN_VALUE;
    arrayOfByte1[12] = ((byte)this.c);
    localzb.a(arrayOfByte1);
    Arrays.fill(arrayOfByte1, (byte)0);
    arrayOfByte1[0] = 24;
    localzb.a(arrayOfByte1, 0, 12);
    localzb.a("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)\000".getBytes("UTF-16LE"));
    arrayOfByte1[0] = 16;
    Arrays.fill(arrayOfByte1, 1, 4, (byte)0);
    localzb.a(arrayOfByte1, 0, 4);
    localzb.a(this.e);
    byte[] arrayOfByte2 = new byte[32];
    byte[] arrayOfByte3 = { 0, 17, 17, 34, 34, 50, 51, 67, 68, 84, 85, 69, 36, 60, 68, 4 };
    System.arraycopy(a(arrayOfByte3), 0, arrayOfByte2, 0, 20);
    this.b.doFinal(arrayOfByte3, 0, arrayOfByte3.length, arrayOfByte3);
    localzb.a(arrayOfByte3);
    arrayOfByte1[0] = 20;
    Arrays.fill(arrayOfByte1, 1, 4, (byte)0);
    localzb.a(arrayOfByte1, 0, 4);
    this.b.doFinal(arrayOfByte2, 0, 16, arrayOfByte2);
    this.b.doFinal(arrayOfByte2, 16, 16, arrayOfByte2, 16);
    localzb.a(arrayOfByte2);
    localzb.a().a(0L, 0);
    return localzh;
  }
  
  public zh b(zh paramzh)
    throws Exception
  {
    za localza = new za(paramzh);
    byte[] arrayOfByte = new byte[8];
    zamp.a(arrayOfByte, 0, paramzh.h());
    int i = ((int)paramzh.h() + 15) / 16;
    zh localzh = new zh(i * 16 + 8);
    zb localzb = new zb(localzh);
    localzb.a(arrayOfByte);
    arrayOfByte = new byte[16];
    for (int j = 0; j < i - 1; j++)
    {
      localza.a(arrayOfByte, 0, 16);
      this.b.doFinal(arrayOfByte, 0, arrayOfByte.length, arrayOfByte);
      localzb.a(arrayOfByte);
    }
    j = localza.a(arrayOfByte, 0, 16);
    if (j > 0)
    {
      if (j < 16) {
        Arrays.fill(arrayOfByte, j, 16, (byte)0);
      }
      this.b.doFinal(arrayOfByte, 0, 16, arrayOfByte);
      localzb.a(arrayOfByte);
    }
    localzh.a(0L, 0);
    return localzh;
  }
  
  private short a(int paramInt)
  {
    switch (paramInt)
    {
    case 128: 
      return 26126;
    case 192: 
      return 26127;
    case 256: 
      return 26128;
    }
    throw new IllegalArgumentException("Unsupported key size: " + paramInt);
  }
  
  private int b(int paramInt)
  {
    switch (paramInt)
    {
    case 26126: 
      return 128;
    case 26127: 
      return 192;
    case 26128: 
      return 256;
    }
    throw new IllegalArgumentException("Unsupported keyAlgId: " + paramInt);
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    this.a.update(paramArrayOfByte);
    return this.a.digest();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */