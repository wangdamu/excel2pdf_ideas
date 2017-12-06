package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;

class zto
{
  private static zm a(zxf paramzxf, byte[] paramArrayOfByte, String paramString)
    throws Exception
  {
    int i = 8;
    int j = zc.a(paramArrayOfByte, i);
    long l1 = zc.d(paramArrayOfByte, i + 12);
    long l2 = zc.d(paramArrayOfByte, i + 16);
    long l3 = zc.d(paramArrayOfByte, i + 20);
    long l4 = zc.d(paramArrayOfByte, i + 24);
    i = 12 + j;
    j = zc.a(paramArrayOfByte, i);
    i += 4;
    byte[] arrayOfByte1 = new byte[j];
    byte[] arrayOfByte2 = new byte[j];
    System.arraycopy(paramArrayOfByte, i, arrayOfByte1, 0, j);
    i += j;
    System.arraycopy(paramArrayOfByte, i, arrayOfByte2, 0, j);
    i += j;
    i += 4;
    byte[] arrayOfByte3 = new byte[paramArrayOfByte.length - i];
    System.arraycopy(paramArrayOfByte, i, arrayOfByte3, 0, arrayOfByte3.length);
    i += j;
    try
    {
      zbz localzbz = null;
      if ((paramString == null) || ("".equals(paramString))) {
        paramString = "VelvetSweatshop";
      }
      localzbz = new zbz(paramString, arrayOfByte1, arrayOfByte2, arrayOfByte3, "", l4, 0L, l2, l1);
      if (localzbz.a()) {
        return localzbz.a(paramzxf.a().a("EncryptedPackage"));
      }
      throw new CellsException(8, "Invalid password.");
    }
    catch (Exception localException)
    {
      if ((paramString == null) || ("".equals(paramString))) {
        throw new CellsException(8, "Please provide password for the Workbook file.");
      }
      throw new CellsException(8, "Invalid password.");
    }
  }
  
  static boolean a(zxf paramzxf)
    throws Exception
  {
    zh localzh = paramzxf.a().a("EncryptionInfo");
    if (localzh == null) {
      return true;
    }
    byte[] arrayOfByte1 = new byte[(int)localzh.h()];
    localzh.a(arrayOfByte1, 0, arrayOfByte1.length);
    String str = "VelvetSweatshop";
    try
    {
      Object localObject;
      if ((arrayOfByte1[0] == 1) && (arrayOfByte1[2] == 1))
      {
        localObject = new byte[16];
        System.arraycopy(arrayOfByte1, 4, localObject, 0, 16);
        byte[] arrayOfByte2 = new byte[16];
        System.arraycopy(arrayOfByte1, 20, arrayOfByte2, 0, 16);
        byte[] arrayOfByte3 = new byte[16];
        System.arraycopy(arrayOfByte1, 36, arrayOfByte3, 0, 16);
        ztl localztl = new ztl(str, (byte[])localObject, arrayOfByte2, arrayOfByte3, 512);
        return false;
      }
      if ((arrayOfByte1[0] == 4) && (arrayOfByte1[2] == 4))
      {
        localObject = new zuh(paramzxf, arrayOfByte1, Encoding.getUnicode().a(str));
        if (((zuh)localObject).a()) {
          return false;
        }
      }
      else
      {
        int i = 8;
        int j = zc.a(arrayOfByte1, i);
        long l1 = zc.d(arrayOfByte1, i + 12);
        long l2 = zc.d(arrayOfByte1, i + 16);
        long l3 = zc.d(arrayOfByte1, i + 20);
        long l4 = zc.d(arrayOfByte1, i + 24);
        i = 12 + j;
        j = zc.a(arrayOfByte1, i);
        i += 4;
        byte[] arrayOfByte4 = new byte[j];
        byte[] arrayOfByte5 = new byte[j];
        System.arraycopy(arrayOfByte1, i, arrayOfByte4, 0, j);
        i += j;
        System.arraycopy(arrayOfByte1, i, arrayOfByte5, 0, j);
        i += j;
        i += 4;
        byte[] arrayOfByte6 = new byte[arrayOfByte1.length - i];
        System.arraycopy(arrayOfByte1, i, arrayOfByte6, 0, arrayOfByte6.length);
        i += j;
        zbz localzbz = null;
        localzbz = new zbz(str, arrayOfByte4, arrayOfByte5, arrayOfByte6, "", l4, 0L, l2, l1);
        if (localzbz.a()) {
          return false;
        }
      }
    }
    catch (Exception localException) {}
    return true;
  }
  
  static zm a(zxf paramzxf, String paramString)
    throws Exception
  {
    zh localzh1 = paramzxf.a().a("EncryptionInfo");
    if (localzh1 == null) {
      throw new CellsException(18, "File is corrupted");
    }
    byte[] arrayOfByte1 = new byte[(int)localzh1.h()];
    localzh1.a(arrayOfByte1, 0, arrayOfByte1.length);
    String str;
    Object localObject;
    if ((arrayOfByte1[0] == 1) && (arrayOfByte1[2] == 1))
    {
      str = "VelvetSweatshop";
      if ((paramString != null) && (!"".equals(paramString))) {
        str = paramString;
      }
      localObject = new byte[16];
      System.arraycopy(arrayOfByte1, 4, localObject, 0, 16);
      byte[] arrayOfByte2 = new byte[16];
      System.arraycopy(arrayOfByte1, 20, arrayOfByte2, 0, 16);
      byte[] arrayOfByte3 = new byte[16];
      System.arraycopy(arrayOfByte1, 36, arrayOfByte3, 0, 16);
      ztl localztl = new ztl(str, (byte[])localObject, arrayOfByte2, arrayOfByte3, 512);
      zh localzh2 = paramzxf.a().a("EncryptedPackage");
      byte[] arrayOfByte4 = new byte[16];
      localzh2.b(8L);
      zh localzh3 = new zh();
      for (int i = 0; i < (localzh2.h() - 8L + 15L) / 16L; i++)
      {
        int j = localzh2.a(arrayOfByte4, 0, arrayOfByte4.length);
        byte[] arrayOfByte5 = localztl.a(arrayOfByte4, 0, 16, (i & 0xFFFFFFFF) * 16L);
        localzh3.b(arrayOfByte5, 0, j);
      }
      localzh3.b(0L);
      return localzh3;
    }
    if ((arrayOfByte1[0] == 4) && (arrayOfByte1[2] == 4))
    {
      str = "VelvetSweatshop";
      if ((paramString != null) && (!"".equals(paramString))) {
        str = paramString;
      }
      localObject = new zuh(paramzxf, arrayOfByte1, Encoding.getUnicode().a(str));
      if (((zuh)localObject).a()) {
        return ((zuh)localObject).b();
      }
      throw new CellsException(8, "Invalid password.");
    }
    return a(paramzxf, arrayOfByte1, paramString);
  }
  
  static zm a(zm paramzm, String paramString)
    throws Exception
  {
    zxf localzxf = new zxf(paramzm);
    return a(localzxf, paramString);
  }
  
  static void a(zm paramzm, zh paramzh, String paramString, int paramInt)
    throws Exception
  {
    paramzh.a(0L, 0);
    zbz localzbz = new zbz(paramString, paramInt);
    zh localzh = localzbz.b();
    paramzh = localzbz.b(paramzh);
    zxf localzxf = new zxf(zaej.n);
    localzxf.a().a("EncryptionInfo", localzh);
    localzxf.a().a("EncryptedPackage", paramzh);
    localzxf.a(paramzm);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */