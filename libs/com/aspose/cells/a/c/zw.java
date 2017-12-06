package com.aspose.cells.a.c;

import com.aspose.cells.Workbook;
import com.aspose.cells.b.a.d.zm;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class zw
{
  private static final String a = "/" + Workbook.class.getPackage().getName().replace('.', '/') + "/resources/";
  
  public static byte[] a()
  {
    return e("Aspose.Cells.Book1.xls");
  }
  
  public static byte[] b()
  {
    return e("Aspose.Cells.Theme2007.dat");
  }
  
  public static byte[] c()
  {
    return e("Aspose.Cells.Theme1.dat");
  }
  
  public static zm d()
    throws Exception
  {
    return a("Aspose.Cells.wa.bin");
  }
  
  public static byte[][] a(String paramString1, String paramString2)
  {
    byte[][] arrayOfByte = new byte[2][];
    try
    {
      zm localzm = a("Aspose.Cells.chartstyles.zip");
      com.aspose.cells.a.f.zi localzi = com.aspose.cells.a.f.zi.a(localzm);
      if (paramString1 != null) {
        arrayOfByte[0] = a(localzi, paramString1);
      }
      if (paramString2 != null) {
        arrayOfByte[1] = a(localzi, paramString2);
      }
    }
    catch (Exception localException) {}
    return arrayOfByte;
  }
  
  static byte[] a(com.aspose.cells.a.f.zi paramzi, String paramString)
    throws Exception
  {
    com.aspose.cells.a.f.zh localzh = paramzi.a(paramString);
    if (localzh == null) {
      return null;
    }
    zm localzm = paramzi.a(localzh);
    byte[] arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, (int)localzh.a());
    localzm.a();
    return arrayOfByte;
  }
  
  public static byte[] e()
  {
    return e("Aspose.Cells.OleObject.dat");
  }
  
  public static byte[] f()
  {
    return e("Aspose.Cells.PatternMasks.dat");
  }
  
  public static byte[] g()
  {
    return e("Aspose.Cells.PDF_A_DestOutputData.dat");
  }
  
  public static byte[] h()
  {
    return e("Aspose.Cells.AsposeXmlCharType.bin");
  }
  
  public static zm i()
    throws Exception
  {
    return a("Aspose.Cells.NoImage.png");
  }
  
  public static byte[] j()
    throws Exception
  {
    return zx.a(i(), true);
  }
  
  private static byte[] e(String paramString)
  {
    zm localzm = a(paramString);
    if (localzm == null) {
      throw new RuntimeException(paramString + " not found.");
    }
    return zx.a(localzm, true);
  }
  
  public static zm a(String paramString)
  {
    try
    {
      InputStream localInputStream = c(paramString);
      if (localInputStream == null) {
        return null;
      }
      return new com.aspose.cells.b.a.d.zi(localInputStream);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static com.aspose.cells.b.a.d.zh b(String paramString)
  {
    try
    {
      InputStream localInputStream = c(paramString);
      if (localInputStream == null) {
        return null;
      }
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
      byte[] arrayOfByte = new byte['Ѐ'];
      for (int i = localInputStream.read(arrayOfByte); i > -1; i = localInputStream.read(arrayOfByte)) {
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      return new com.aspose.cells.b.a.d.zh(localByteArrayOutputStream.toByteArray());
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static InputStream c(String paramString)
    throws Exception
  {
    return zw.class.getResourceAsStream(a + paramString);
  }
  
  public static zm d(String paramString)
    throws Exception
  {
    URL localURL = new URL(paramString);
    URLConnection localURLConnection = localURL.openConnection();
    InputStream localInputStream = localURLConnection.getInputStream();
    return new com.aspose.cells.b.a.d.zh(localInputStream);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */