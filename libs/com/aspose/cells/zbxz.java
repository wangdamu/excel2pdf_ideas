package com.aspose.cells;

import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zcb;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.d.zcd;
import com.aspose.cells.a.d.zce;
import com.aspose.cells.a.d.zcn;
import com.aspose.cells.a.d.zgr;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.a.d.zgy;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.a.d.zht;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zv;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zl;
import com.aspose.cells.b.a.zw;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class zbxz
{
  private static String a = "[\\uFB50-\\uFDFF\\uFE70-\\uFEFF\\u0590-\\u05FF]+";
  private static Graphics2D b;
  private static final com.aspose.cells.b.c.a.za c = new com.aspose.cells.b.c.a.za(new String[] { ".bmp", ".dib", ".rle", ".emf", ".jpg", ".jpeg", ".jpe", ".jfif", ".png", ".gif", ".tif", ".tiff" });
  
  static void a(zm paramzm, com.aspose.cells.a.d.zn paramzn, ImageOrPrintOptions paramImageOrPrintOptions, int paramInt1, int paramInt2)
    throws Exception
  {
    float f1 = b(paramInt1);
    float f2 = b(paramInt2);
    ImageFormat localImageFormat = paramImageOrPrintOptions.getImageFormat();
    Object localObject1;
    Object localObject2;
    com.aspose.cells.a.d.zo localzo;
    if (paramImageOrPrintOptions.getSaveFormat() == 20)
    {
      localObject1 = new zis();
      localObject2 = new zht((zhb)localObject1, paramzm);
      localzo = new com.aspose.cells.a.d.zo(f1, f2);
      localzo.a(paramzn);
      ((zht)localObject2).a(localzo);
      ((zht)localObject2).a();
      paramzm.b(0L);
      return;
    }
    if (paramImageOrPrintOptions.getSaveFormat() == 22)
    {
      localObject1 = new zis();
      localObject2 = new zgr((zhb)localObject1, paramImageOrPrintOptions.getSVGFitToViewPort());
      localzo = new com.aspose.cells.a.d.zo(f1, f2);
      localzo.a(paramzn);
      ((zgr)localObject2).a(localzo, paramzm, paramImageOrPrintOptions.getEmbededImageNameInSvg());
      ((zgr)localObject2).a();
      paramzm.b(0L);
      return;
    }
    if (localImageFormat == ImageFormat.getEmf())
    {
      zau.a(paramzn, paramzm, paramImageOrPrintOptions, paramInt1, paramInt2);
      paramzm.b(0L);
      return;
    }
    if (localImageFormat == ImageFormat.getTiff())
    {
      localObject1 = null;
      try
      {
        localObject1 = a(paramzn, paramImageOrPrintOptions, paramInt1, paramInt2);
        localObject2 = new znv();
        ((znv)localObject2).a(paramzm, paramImageOrPrintOptions, (com.aspose.cells.b.a.b.za)localObject1);
      }
      finally
      {
        if (localObject1 != null) {
          ((com.aspose.cells.b.a.b.za)localObject1).d();
        }
      }
      return;
    }
    if ((localImageFormat == ImageFormat.getBmp()) || (localImageFormat == ImageFormat.getPng()) || (localImageFormat == ImageFormat.getGif()) || (localImageFormat == ImageFormat.getJpeg()))
    {
      localObject1 = a(paramzn, paramImageOrPrintOptions, paramInt1, paramInt2);
      try
      {
        if (localObject1 == null) {
          return;
        }
        if (localImageFormat == ImageFormat.getJpeg()) {
          zcc.a((zj)localObject1, paramzm, paramImageOrPrintOptions.getQuality());
        } else {
          ((com.aspose.cells.b.a.b.za)localObject1).a(paramzm, localImageFormat);
        }
        paramzm.b(0L);
      }
      finally
      {
        if (localObject1 != null) {
          ((com.aspose.cells.b.a.b.za)localObject1).b();
        }
      }
    }
    else
    {
      paramImageOrPrintOptions.setImageFormat(ImageFormat.getBmp());
      localObject1 = a(paramzn, paramImageOrPrintOptions, paramInt1, paramInt2);
      try
      {
        if (localObject1 == null) {
          return;
        }
        ((com.aspose.cells.b.a.b.za)localObject1).a(paramzm, paramImageOrPrintOptions.getImageFormat());
        paramzm.b(0L);
      }
      finally
      {
        if (localObject1 != null) {
          ((com.aspose.cells.b.a.b.za)localObject1).b();
        }
      }
    }
  }
  
  static com.aspose.cells.b.a.b.za a(com.aspose.cells.a.d.zn paramzn, ImageOrPrintOptions paramImageOrPrintOptions, int paramInt1, int paramInt2)
    throws Exception
  {
    int[] arrayOfInt = { 1, 1 };
    com.aspose.cells.b.a.b.za localza = null;
    try
    {
      float f1 = paramImageOrPrintOptions.getHorizontalResolution() / zap.b();
      float f2 = paramImageOrPrintOptions.getVerticalResolution() / zap.b();
      int i = (int)(paramInt1 * f1 + 0.5D);
      int j = (int)(paramInt2 * f2 + 0.5D);
      localza = new com.aspose.cells.b.a.b.za(i, j, paramImageOrPrintOptions.b());
      arrayOfInt[0] = localza.m().b();
      arrayOfInt[1] = localza.m().c();
      zi localzi = zi.a(localza);
      localzi.b().setRenderingHints(paramImageOrPrintOptions.h);
      localzi.a(2);
      localzi.a(Color.getEmpty());
      localzi.a(f1, f2);
      zis localzis = new zis();
      zbh localzbh = new zbh(localzis);
      localzbh.a(paramzn, localzi);
      localza.a(paramImageOrPrintOptions.getHorizontalResolution(), paramImageOrPrintOptions.getVerticalResolution());
      localzbh.a();
      localzi.e();
    }
    catch (Exception localException)
    {
      throw new CellsException(4, localException.getMessage());
    }
    return localza;
  }
  
  public static void a(String paramString, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    String str = com.aspose.cells.b.a.d.zk.d(paramString);
    if (str != null) {
      str = str.toLowerCase();
    }
    if (".svg".equals(str))
    {
      paramImageOrPrintOptions.setSaveFormat(22);
      paramImageOrPrintOptions.setImageFormat(ImageFormat.getIcon());
    }
    else if (".xps".equals(str))
    {
      paramImageOrPrintOptions.setSaveFormat(20);
      paramImageOrPrintOptions.setImageFormat(ImageFormat.getIcon());
    }
    else
    {
      switch (c.a(str))
      {
      case 0: 
      case 1: 
      case 2: 
        paramImageOrPrintOptions.setImageFormat(ImageFormat.getBmp());
        break;
      case 3: 
        paramImageOrPrintOptions.setImageFormat(ImageFormat.getEmf());
        break;
      case 4: 
      case 5: 
      case 6: 
      case 7: 
        paramImageOrPrintOptions.setImageFormat(ImageFormat.getJpeg());
        break;
      case 8: 
        paramImageOrPrintOptions.setImageFormat(ImageFormat.getPng());
        break;
      case 9: 
        paramImageOrPrintOptions.setImageFormat(ImageFormat.getGif());
        break;
      case 10: 
      case 11: 
        paramImageOrPrintOptions.setImageFormat(ImageFormat.getTiff());
        break;
      }
    }
  }
  
  public static ImageFormat a(String paramString, ImageFormat paramImageFormat)
  {
    paramString = paramString.toLowerCase();
    if (".png".equals(paramString)) {
      return ImageFormat.getPng();
    }
    if (".emf".equals(paramString)) {
      return ImageFormat.getEmf();
    }
    if (".gif".equals(paramString)) {
      return ImageFormat.getGif();
    }
    if ((".jpg".equals(paramString)) || (".jpeg".equals(paramString)) || (".jpe".equals(paramString)) || (".jfif".equals(paramString))) {
      return ImageFormat.getJpeg();
    }
    if ((".tiff".equals(paramString)) || (".tif".equals(paramString))) {
      return ImageFormat.getTiff();
    }
    if ((".bmp".equals(paramString)) || (".dib".equals(paramString)) || (".rle".equals(paramString))) {
      return ImageFormat.getBmp();
    }
    if ((paramImageFormat == null) || (paramImageFormat == ImageFormat.getIcon()) || (paramImageFormat == ImageFormat.getMemoryBmp()) || (paramImageFormat == ImageFormat.getWmf()) || (paramImageFormat == ImageFormat.getExif())) {
      return ImageFormat.getBmp();
    }
    return paramImageFormat;
  }
  
  public static void a(com.aspose.cells.b.a.b.zo[] paramArrayOfzo)
  {
    if (paramArrayOfzo == null) {
      return;
    }
    for (int i = 0; i < paramArrayOfzo.length; i++) {
      paramArrayOfzo[i] = new com.aspose.cells.b.a.b.zo(0.0F, 0.0F);
    }
  }
  
  public static com.aspose.cells.b.a.b.zo a(com.aspose.cells.b.a.b.zo paramzo)
  {
    return new com.aspose.cells.b.a.b.zo(paramzo.d(), paramzo.e());
  }
  
  static int a(double paramDouble)
  {
    return (int)Math.ceil(paramDouble);
  }
  
  static int b(double paramDouble)
  {
    return (int)Math.floor(paramDouble);
  }
  
  static int c(double paramDouble)
  {
    return (int)(paramDouble + 0.5D);
  }
  
  static void a(com.aspose.cells.b.a.b.zp[] paramArrayOfzp)
  {
    if (paramArrayOfzp[0].e() > paramArrayOfzp[0].f())
    {
      paramArrayOfzp[0].a(paramArrayOfzp[0].c() + (paramArrayOfzp[0].e() - paramArrayOfzp[0].f()) / 2);
      paramArrayOfzp[0].c(paramArrayOfzp[0].f());
    }
    else if (paramArrayOfzp[0].f() > paramArrayOfzp[0].e())
    {
      paramArrayOfzp[0].b(paramArrayOfzp[0].d() + (paramArrayOfzp[0].f() - paramArrayOfzp[0].e()) / 2);
      paramArrayOfzp[0].d(paramArrayOfzp[0].e());
    }
  }
  
  static boolean a(com.aspose.cells.b.a.b.zp paramzp)
  {
    return (paramzp.e() <= 0) || (paramzp.f() <= 0);
  }
  
  static void b(com.aspose.cells.b.a.b.zp[] paramArrayOfzp)
  {
    if (paramArrayOfzp[0].e() < 0) {
      paramArrayOfzp[0].c(0);
    }
    if (paramArrayOfzp[0].f() < 0) {
      paramArrayOfzp[0].d(0);
    }
  }
  
  public static float a(float paramFloat)
  {
    return paramFloat;
  }
  
  public static float b(float paramFloat)
  {
    return paramFloat * 72.0F / zap.b();
  }
  
  public static float d(double paramDouble)
  {
    return (float)(paramDouble * zap.b() / 72.0D);
  }
  
  public static float c(float paramFloat)
  {
    return paramFloat * zap.b() / 72.0F;
  }
  
  public static zq a(zq paramzq)
  {
    int i = (int)(paramzq.f() + 0.5D);
    int j = (int)(paramzq.g() + 0.5D);
    int k = (int)(paramzq.h() + 0.5D);
    int m = (int)(paramzq.i() + 0.5D);
    return new zq(i, j, k, m);
  }
  
  static zq b(com.aspose.cells.b.a.b.zp paramzp)
  {
    return new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
  }
  
  static zt a(com.aspose.cells.b.a.b.zs paramzs)
  {
    return new zt(paramzs.b(), paramzs.c());
  }
  
  static zq b(zq paramzq)
  {
    return new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
  }
  
  static com.aspose.cells.b.a.b.zp c(com.aspose.cells.b.a.b.zp paramzp)
  {
    return new com.aspose.cells.b.a.b.zp(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
  }
  
  static double e(double paramDouble)
  {
    double d = Math.log10(paramDouble);
    return d;
  }
  
  static double f(double paramDouble)
  {
    return Math.pow(10.0D, paramDouble);
  }
  
  static int g(double paramDouble)
  {
    char c1 = com.aspose.cells.b.a.ze.a(zc.a().c());
    int i = 1;
    String str1 = "";
    String str2 = com.aspose.cells.b.a.zo.b(paramDouble);
    int j = str2.indexOf("E");
    int k = str2.indexOf("e");
    int n;
    if ((j > 0) || (k > 0))
    {
      String[] arrayOfString;
      if (j > 0) {
        arrayOfString = zw.d(str2, 'E');
      } else {
        arrayOfString = zw.d(str2, 'e');
      }
      if (arrayOfString[0].charAt(0) == '-') {
        arrayOfString[0] = arrayOfString[0].substring(1);
      }
      n = arrayOfString[0].indexOf(c1);
      int i1 = Math.abs(com.aspose.cells.b.a.ze.f(arrayOfString[1]));
      int i2;
      if (n > 0)
      {
        str1 = arrayOfString[0].substring(0, 0 + n) + arrayOfString[0].substring(n + 1);
        if (arrayOfString[1].charAt(0) == '-')
        {
          i2 = i1 - (n - 1);
          if (i2 > 0)
          {
            while (i2 > 0)
            {
              str1 = "0" + str1;
              i2--;
            }
            str1 = Character.toString(str1.charAt(0)) + c1 + str1.substring(1);
          }
          else if (i2 < 0)
          {
            str1 = str1.substring(0, 0 + (n + i2)) + c1 + str1.substring(n + i2);
          }
        }
        else
        {
          while (i1 > 0)
          {
            str1 = str1 + "0";
            i1--;
          }
        }
      }
      else
      {
        str1 = arrayOfString[0];
        if (arrayOfString[1].charAt(0) == '-')
        {
          i2 = i1 - (str1.length() - 1);
          if (i2 > 0)
          {
            while (i2 > 0)
            {
              str1 = "0" + str1;
              i2--;
            }
            str1 = Character.toString(str1.charAt(0)) + c1 + str1.substring(1);
          }
          else if (i2 < 0)
          {
            str1 = str1.substring(0, 0 + (str1.length() + i2)) + c1 + str1.substring(str1.length() + i2);
          }
        }
        else
        {
          while (i1 > 0)
          {
            str1 = str1 + "0";
            i1--;
          }
        }
      }
      str2 = str1;
    }
    int m = str2.indexOf(c1, 0);
    if (m > 0) {
      for (n = m + 1; n < str2.length(); n++) {
        i++;
      }
    }
    return i;
  }
  
  static int a(double paramDouble1, double paramDouble2)
  {
    double[] arrayOfDouble = new double[2];
    arrayOfDouble[0] = paramDouble1;
    arrayOfDouble[1] = paramDouble2;
    return a(arrayOfDouble);
  }
  
  static int a(double[] paramArrayOfDouble)
  {
    int i = 0;
    for (int j = 0; j < paramArrayOfDouble.length; j++)
    {
      int k = g(paramArrayOfDouble[j]);
      if (k > i) {
        i = k;
      }
    }
    return i;
  }
  
  static double b(double paramDouble1, double paramDouble2)
  {
    int i = g(paramDouble1);
    int j = g(paramDouble2);
    int k = i > j ? i : j;
    return a(paramDouble1 - paramDouble2, k);
  }
  
  static double a(double paramDouble, int paramInt)
  {
    if (paramInt > 15)
    {
      double d1 = paramDouble * Math.pow(10.0D, paramInt - 15 - 1);
      double d2 = com.aspose.cells.b.a.zr.b(d1, 15);
      double d3 = d2 * Math.pow(10.0D, 16 - paramInt);
      return d3;
    }
    if (paramInt == 15) {
      return paramDouble;
    }
    return com.aspose.cells.b.a.zr.b(paramDouble, paramInt);
  }
  
  static double c(double paramDouble1, double paramDouble2)
  {
    int i = g(paramDouble1);
    int j = g(paramDouble2);
    int k = i > j ? i : j;
    return a(paramDouble1 + paramDouble2, k);
  }
  
  static int h(double paramDouble)
  {
    double d = e(paramDouble);
    int i = 1;
    if (d < 0.0D) {
      i = 0;
    }
    d = Math.abs(d);
    int j = b(d);
    if (j != d) {
      j++;
    }
    if (i == 0) {
      j = -j;
    }
    return j;
  }
  
  static DateTime a(double paramDouble, boolean paramBoolean)
  {
    if (paramDouble > 2958465.99D) {
      return DateTime.b;
    }
    if (paramBoolean) {
      paramDouble += 1462.0D;
    }
    if (paramDouble < 60.0D) {
      paramDouble += 1.0D;
    }
    return DateTime.b(paramDouble);
  }
  
  static double a(DateTime paramDateTime, boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean)
    {
      localObject = com.aspose.cells.a.c.zk.e(paramDateTime, new DateTime(1904, 1, 1));
      double d1 = ((zl)localObject).c();
      if (d1 < 0.0D) {
        return 0.0D;
      }
      return d1;
    }
    DateTime localDateTime2 = new DateTime(1900, 3, 1);
    zl localzl = com.aspose.cells.a.c.zk.e(paramDateTime, localDateTime2);
    if (localzl.c() > 0.0D) {
      localObject = new DateTime(1899, 12, 30);
    } else {
      localObject = new DateTime(1899, 12, 31);
    }
    DateTime localDateTime1 = new DateTime(9999, 12, 31, 23, 59, 59, 999);
    localzl = com.aspose.cells.a.c.zk.e(localDateTime1, paramDateTime);
    if (localzl.c() < 0.0D) {
      return -1.0D;
    }
    localzl = com.aspose.cells.a.c.zk.e(paramDateTime, (DateTime)localObject);
    if (localzl.c() < 0.0D) {
      return 0.0D;
    }
    double d2 = localzl.c();
    if ((paramDateTime.getYear() == 1900) && (paramDateTime.getMonth() == 3) && (paramDateTime.getDay() == 1)) {
      d2 += 1.0D;
    }
    return d2;
  }
  
  static int a(Object paramObject, int paramInt)
  {
    String str = com.aspose.cells.b.a.zs.a(paramObject);
    com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("^-?\\d+$");
    if ("".equals(str)) {
      return paramInt;
    }
    if (localze.d(str))
    {
      int i = com.aspose.cells.b.a.zp.a(str);
      return i;
    }
    return paramInt;
  }
  
  static zg a(String paramString, float paramFloat, int paramInt)
  {
    try
    {
      return new zg(paramString, paramFloat, paramInt);
    }
    catch (Exception localException)
    {
      zgs localzgs = com.aspose.cells.a.c.zn.a(paramString, paramInt);
      return new zg(paramString, paramFloat, localzgs.f());
    }
  }
  
  static zg a(zg paramzg)
  {
    return a(paramzg.g(), paramzg.h(), paramzg.k());
  }
  
  public static zt a(zr paramzr, String paramString, zg paramzg, com.aspose.cells.b.a.b.zs paramzs)
  {
    zt localzt = new zt(paramzs.b(), paramzs.c());
    return a(paramzr, paramString, paramzg, localzt);
  }
  
  public static zt a(zr paramzr, String paramString, zg paramzg, zt paramzt)
  {
    int i = paramzg.d();
    if ((paramString == null) || (paramString.length() == 0)) {
      return new zt(0.0F, i);
    }
    zv localzv = new zv(zv.c());
    localzv.b(localzv.d() | 0x800);
    zt localzt = paramzr.a(paramString, paramzg, paramzt, localzv);
    return localzt;
  }
  
  public static zt b(zr paramzr, String paramString, zg paramzg, zt paramzt)
    throws Exception
  {
    int i = paramzg.d();
    if ((paramString == null) || (paramString.length() == 0)) {
      return new zt(0.0F, i);
    }
    try
    {
      zgs localzgs = zav.a().b(paramzg.g(), paramzg.k(), false);
      float f = localzgs.c(paramString, paramzg.h()) * zap.b() / 72.0F;
      return new zt(f, paramzg.d());
    }
    catch (Exception localException)
    {
      zv localzv = new zv(zv.c());
      localzv.b(localzv.d() | 0x800);
      zt localzt = paramzr.a(paramString, paramzg, paramzt, localzv);
      return localzt;
    }
  }
  
  static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length != paramArrayOfByte2.length) {
      return false;
    }
    for (int i = 0; i < paramArrayOfByte1.length; i++) {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        return false;
      }
    }
    return true;
  }
  
  public static double a(String paramString, zzx paramzzx)
  {
    zik localzik = paramzzx.h();
    Object localObject = localzik.parseObject(paramString);
    if (localObject != null) {
      return ((Double)localObject).doubleValue();
    }
    return 0.0D;
  }
  
  public static int a(zr paramzr, zg paramzg)
  {
    int i = 0;
    if (paramzg != null)
    {
      int j = a(paramzr.a().a(paramzg));
      i = c(j * 0.2F);
    }
    else
    {
      return 0;
    }
    if (i < 2) {
      return 2;
    }
    return i;
  }
  
  static boolean a(String paramString)
  {
    boolean bool = false;
    bool = zax.b(paramString);
    return (bool) || (zax.a(paramString));
  }
  
  static boolean b(String paramString)
  {
    return zax.b(paramString);
  }
  
  static ArrayList a(String paramString, int paramInt, Font paramFont, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    boolean bool = false;
    bool = zax.b(paramString);
    if ((!bool) && (!zax.a(paramString)) && (!paramBoolean)) {
      return localArrayList;
    }
    com.aspose.cells.b.a.g.a.ze localze = new com.aspose.cells.b.a.g.a.ze("\\n");
    String[] arrayOfString = localze.c(paramString);
    Object localObject2;
    if (arrayOfString.length > 1)
    {
      for (int i = 0; i < arrayOfString.length; i++)
      {
        if (!"".equals(arrayOfString[i]))
        {
          localObject2 = a(arrayOfString[i], paramInt, paramFont, true);
          zf.a(localArrayList, (Collection)localObject2);
        }
        else
        {
          if (("".equals(arrayOfString[i])) && (i == arrayOfString.length - 1)) {
            break;
          }
        }
        if (i != arrayOfString.length - 1)
        {
          localObject2 = new zqb();
          ((zqb)localObject2).a = "\n";
          ((zqb)localObject2).b = paramFont;
          zf.a(localArrayList, localObject2);
        }
      }
      return localArrayList;
    }
    if (!zw.b(paramString))
    {
      Object localObject1;
      if ((bool) || (zax.a(paramString)))
      {
        localObject1 = new zcr();
        localObject2 = new zqb();
        ((zqb)localObject2).a = paramString;
        ((zqb)localObject2).b = paramFont;
        zf.a(localArrayList, localObject2);
        ((zcr)localObject1).a(localArrayList, bool);
        zgz.a(localArrayList, bool);
        for (int j = 0; j < localArrayList.size(); j++)
        {
          zqb localzqb = (zqb)localArrayList.get(j);
          if (com.aspose.cells.b.a.g.a.ze.b(localzqb.a, a, 66))
          {
            String str = localzqb.a;
            char[] arrayOfChar1 = str.toCharArray();
            str = "";
            for (char c1 : arrayOfChar1) {
              str = str + c1;
            }
            localzqb.a = str;
          }
          if (paramInt == 2) {
            if (localzqb.a.indexOf('(') >= 0) {
              localzqb.a = localzqb.a.replace('(', ')');
            } else if (localzqb.a.indexOf(')') >= 0) {
              localzqb.a = localzqb.a.replace(')', '(');
            }
          }
        }
      }
      else
      {
        localObject1 = new zqb();
        ((zqb)localObject1).a = paramString;
        ((zqb)localObject1).b = paramFont;
        zf.a(localArrayList, localObject1);
      }
    }
    return localArrayList;
  }
  
  static void a(ArrayList paramArrayList, zaiz paramzaiz, zg paramzg, Color paramColor, zaid paramzaid)
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zqb localzqb = (zqb)paramArrayList.get(i);
      paramzaiz.a(localzqb.a, paramzg, paramColor, paramzaid, 2);
    }
  }
  
  static zj a(byte[] paramArrayOfByte, zt paramzt)
    throws Exception
  {
    float f = zap.b();
    double d1 = f;
    zcb localzcb = zcc.b(paramArrayOfByte);
    d1 = localzcb.d();
    zh localzh = new zh(paramArrayOfByte);
    zj localzj = zj.a(localzh);
    if (a(localzj.m(), paramzt, d1, f))
    {
      double d2 = f / d1 * localzj.i();
      double d3 = f / d1 * localzj.h();
      d2 = d2 < 1.0D ? 1.0D : d2;
      d3 = d3 < 1.0D ? 1.0D : d3;
      com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za((int)d2, (int)d3);
      zi localzi = zi.a(localza);
      com.aspose.cells.a.c.zn.a(localzi);
      zq localzq1 = new zq(0.0F, 0.0F, localza.i(), localza.h());
      zq localzq2 = new zq(0.0F, 0.0F, localzj.i(), localzj.h());
      localzi.a(localzj, localzq1, localzq2, 2);
      localzj.d();
      localzi.e();
      localzh.a();
      return localza;
    }
    return localzj;
  }
  
  private static boolean a(com.aspose.cells.b.a.b.zs paramzs, zt paramzt, double paramDouble1, double paramDouble2)
  {
    if ((paramzs.b() < 5) || (paramzs.c() < 5)) {
      return false;
    }
    if (paramDouble1 < 10.0D) {
      return false;
    }
    int i = 3;
    if ((paramDouble1 < paramDouble2 + i) && (paramDouble1 > paramDouble2 - i)) {
      return false;
    }
    if (paramDouble1 > paramDouble2 + i)
    {
      double d1 = paramDouble2 / paramDouble1 * paramzs.b();
      double d2 = paramDouble2 / paramDouble1 * paramzs.c();
      if ((d1 + 1.0D < paramzt.b()) || (d2 + 1.0D < paramzt.c())) {
        return false;
      }
    }
    return true;
  }
  
  static zq a(zahj paramzahj, com.aspose.cells.b.a.b.zs paramzs, float paramFloat, boolean paramBoolean)
    throws Exception
  {
    float f1;
    float f2;
    zq localzq;
    if (!paramzahj.at())
    {
      float f3 = b(paramFloat);
      if (f3 < 0.75D)
      {
        if (!paramzahj.av())
        {
          f1 = paramzs.b() - 1 - paramFloat / 2.0F;
          f2 = paramzs.c() - 1 - paramFloat / 2.0F;
        }
        else
        {
          f1 = paramzahj.a() - 1;
          f2 = paramzahj.b() - 1;
        }
        localzq = new zq(0.0F, 0.0F, f1, f2);
      }
      else if (f3 == 0.75D)
      {
        if (!paramzahj.av())
        {
          f1 = paramzahj.a();
          f2 = paramzahj.b();
        }
        else
        {
          f1 = paramzahj.a();
          f2 = paramzahj.b();
        }
        localzq = new zq(0.0F, 0.0F, f1, f2);
      }
      else if (f3 < 1.25D)
      {
        if (!paramzahj.av())
        {
          f1 = paramzs.b() - 1 - (paramFloat - 1.0F) / 2.0F;
          f2 = paramzs.c() - 1 - (paramFloat - 1.0F) / 2.0F;
        }
        else
        {
          f1 = paramzahj.a();
          f2 = paramzahj.b();
        }
        localzq = new zq(0.0F, 0.0F, f1, f2);
      }
      else if (f3 <= 1.5D)
      {
        if (!paramzahj.av())
        {
          f1 = paramzahj.a();
          f2 = paramzahj.b();
        }
        else
        {
          f1 = paramzahj.a();
          f2 = paramzahj.b();
        }
        localzq = new zq(0.5F, 0.5F, f1, f2);
      }
      else
      {
        f1 = paramzahj.a();
        f2 = paramzahj.b();
        localzq = new zq((int)(paramFloat / 2.0F), (int)(paramFloat / 2.0F), f1, f2);
      }
      if ((paramzahj.as().getImageFormat() == ImageFormat.getEmf()) && (!paramzahj.av()))
      {
        f1 = paramzs.b() - paramFloat;
        f2 = paramzs.c() - paramFloat;
        localzq = new zq(paramFloat / 2.0F, paramFloat / 2.0F, f1, f2);
      }
      else if ((paramzahj.as().a) && ((paramzahj.as().getHorizontalResolution() > 100) || (paramzahj.as().getVerticalResolution() > 100)))
      {
        f1 = paramzs.b() - paramFloat;
        f2 = paramzs.c() - paramFloat;
        localzq = new zq(paramFloat / 2.0F, paramFloat / 2.0F, f1, f2);
      }
    }
    else
    {
      f1 = paramzahj.a();
      f2 = paramzahj.b();
      localzq = new zq(paramFloat / 2.0F, paramFloat / 2.0F, f1, f2);
    }
    if (!paramBoolean) {
      localzq = new zq(0.0F, 0.0F, paramzs.b(), paramzs.c());
    }
    return localzq;
  }
  
  static boolean a(zq paramzq, com.aspose.cells.b.a.b.zp paramzp)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    return a(paramzq, localzq);
  }
  
  static boolean a(zq paramzq1, zq paramzq2)
  {
    return (paramzq1.j() >= paramzq2.j()) && (paramzq1.l() <= paramzq2.l()) && (paramzq1.k() >= paramzq2.k()) && (paramzq1.m() <= paramzq2.m());
  }
  
  static boolean c(zq paramzq)
  {
    return (paramzq.h() <= 0.0F) || (paramzq.i() <= 0.0F);
  }
  
  static zt a(zr paramzr, boolean paramBoolean, String paramString, zg paramzg)
    throws Exception
  {
    zav localzav = zav.a();
    String str1 = localzav.a(paramzg.g());
    int i = paramzg.k();
    String str2 = a(paramString, str1, i);
    if (!zw.b(str1, str2)) {
      paramzg = new zg(str2, paramzg.h(), i);
    }
    boolean bool = a(paramzr.k());
    if ((paramBoolean) || (bool)) {
      return b(paramzr, paramString, paramzg, new zt(2.14748365E9F, 2.14748365E9F));
    }
    return a(paramzr, paramString, paramzg, new zt(2.14748365E9F, 2.14748365E9F));
  }
  
  private static boolean a(ImageOrPrintOptions paramImageOrPrintOptions)
  {
    if (paramImageOrPrintOptions == null) {
      return false;
    }
    if (paramImageOrPrintOptions.getImageFormat() == ImageFormat.getEmf()) {
      return true;
    }
    return paramImageOrPrintOptions.a;
  }
  
  static Graphics2D a()
  {
    if (b == null)
    {
      BufferedImage localBufferedImage = new BufferedImage(1, 1, 1);
      b = (Graphics2D)localBufferedImage.getGraphics();
    }
    return b;
  }
  
  static zg a(String paramString, Font paramFont)
    throws Exception
  {
    int i = a(paramFont);
    double d = paramFont.getDoubleSize();
    zav localzav = zav.a();
    String str = localzav.a(paramFont.getName());
    Object localObject;
    try
    {
      zg localzg = new zg(str, (float)d, i);
      if (zw.b(localzav.a(localzg.g()), str)) {
        return localzg;
      }
      localObject = FontConfigs.getFontSubstitutes(str);
      if ((localObject != null) && (localObject.length > 0))
      {
        str = localzav.a(localObject[0]);
        localzg = new zg(str, (float)d, i);
        if (zw.b(localzav.a(localzg.g()), str)) {
          return localzg;
        }
      }
      str = "Arial";
      localzg = new zg(str, (float)d, i);
      if (zw.b(localzav.a(localzg.g()), str)) {
        return localzg;
      }
      localzg = new zbj(str, (float)d, i).a(true);
      return localzg;
    }
    catch (Exception localException)
    {
      localObject = localzav.b(str, i, false);
    }
    return new zg(paramFont.getName(), (float)d, ((zgs)localObject).f());
  }
  
  static String a(String paramString1, String paramString2, int paramInt)
    throws Exception
  {
    if (paramString1 == null) {
      paramString1 = "";
    }
    zav localzav = zav.a();
    ArrayList localArrayList = zgz.a(paramString1);
    String str;
    if (localArrayList.size() > 1)
    {
      localObject = new com.aspose.cells.b.a.g.a.ze("([\\uF020-\\uF0FF]+)");
      for (int i = 0; i < localArrayList.size(); i++)
      {
        str = (String)localArrayList.get(i);
        boolean bool = ((com.aspose.cells.b.a.g.a.ze)localObject).d(str);
        if (bool) {
          return paramString2;
        }
      }
    }
    Object localObject = paramString2;
    if (!localzav.a((String)localObject, paramInt, paramString1))
    {
      zis localzis = new zis();
      str = localzis.a((String)localObject, paramInt, paramString1);
      if (str == null)
      {
        zgs localzgs = localzav.a(paramInt, paramString1);
        if (localzgs != null) {
          localObject = localzgs.a();
        } else {
          localObject = zcn.a;
        }
      }
      else
      {
        localObject = str;
      }
    }
    return (String)localObject;
  }
  
  static zj a(Picture paramPicture)
    throws Exception
  {
    zm localzm = b(paramPicture);
    if ((localzm == null) || (localzm.h() == 0L)) {
      return null;
    }
    return zj.a(localzm);
  }
  
  static zm b(Picture paramPicture)
    throws Exception
  {
    if (paramPicture == null) {
      return null;
    }
    Object localObject = null;
    if (paramPicture.getData() != null)
    {
      localObject = new zh(paramPicture.getData());
      if ((localObject == null) || (((zm)localObject).h() == 0L)) {
        return null;
      }
      return (zm)localObject;
    }
    if (paramPicture.d())
    {
      String str = paramPicture.getSourceFullName();
      if (str.indexOf("http:") >= 0) {
        try
        {
          localObject = new com.aspose.cells.b.a.e.za().a(str);
          if (localObject == null) {
            return null;
          }
          return (zm)localObject;
        }
        catch (Exception localException) {}
      }
      if (zd.c(str))
      {
        localObject = new com.aspose.cells.b.a.e.za().a(str);
        return (zm)localObject;
      }
      return null;
    }
    return null;
  }
  
  static zj a(zj paramzj, int paramInt1, int paramInt2, double paramDouble)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return paramzj;
    }
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(paramzj, paramInt1, paramInt2);
    for (int i = localza.i() - 1; i >= 0; i--) {
      for (int j = localza.h() - 1; j >= 0; j--)
      {
        Color localColor1 = localza.a(i, j);
        int k = localColor1.getA() & 0xFF;
        if (k != 0)
        {
          double d = 190.0D * (paramDouble / 100.0D);
          int m = (localColor1.getR() & 0xFF) + (int)d;
          m = Math.max(0, Math.min(m, 255));
          int n = (localColor1.getG() & 0xFF) + (int)d;
          n = Math.max(0, Math.min(n, 255));
          int i1 = (localColor1.getB() & 0xFF) + (int)d;
          i1 = Math.max(0, Math.min(i1, 255));
          Color localColor2 = Color.fromArgb(255, m, n, i1);
          localza.a(i, j, localColor2);
        }
      }
    }
    return localza;
  }
  
  static zj b(zj paramzj, int paramInt1, int paramInt2, double paramDouble)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return paramzj;
    }
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(paramzj, paramInt1, paramInt2);
    paramDouble = (100.0D + paramDouble) / 100.0D;
    for (int i = 0; i < localza.h(); i++) {
      for (int j = 0; j < localza.i(); j++)
      {
        Color localColor = localza.a(j, i);
        double d1 = localColor.getA() & 0xFF;
        double d2 = (localColor.getR() & 0xFF) / 255.0D;
        d2 -= 0.5D;
        d2 *= paramDouble;
        d2 += 0.5D;
        d2 *= 255.0D;
        if (d2 > 255.0D) {
          d2 = 255.0D;
        } else if (d2 < 0.0D) {
          d2 = 0.0D;
        }
        double d3 = (localColor.getG() & 0xFF) / 255.0D;
        d3 -= 0.5D;
        d3 *= paramDouble;
        d3 += 0.5D;
        d3 *= 255.0D;
        if (d3 > 255.0D) {
          d3 = 255.0D;
        } else if (d3 < 0.0D) {
          d3 = 0.0D;
        }
        double d4 = (localColor.getB() & 0xFF) / 255.0D;
        d4 -= 0.5D;
        d4 *= paramDouble;
        d4 += 0.5D;
        d4 *= 255.0D;
        if (d4 > 255.0D) {
          d4 = 255.0D;
        } else if (d4 < 0.0D) {
          d4 = 0.0D;
        }
        localza.a(j, i, Color.fromArgb((int)d1, (int)d2, (int)d3, (int)d4));
      }
    }
    return localza;
  }
  
  static boolean b(zg paramzg)
  {
    boolean bool = false;
    if ((-1 < paramzg.g().indexOf("Meiryo")) || (-1 < paramzg.g().indexOf("MS PGothic")) || (-1 < paramzg.g().indexOf("£Í£Ó £Ð¥´¥·¥Ã¥¯")) || (-1 < paramzg.g().indexOf("MS Gothic")) || (-1 < paramzg.g().indexOf("MS Gothic UI"))) {
      bool = true;
    }
    return bool;
  }
  
  static boolean a(FontSettingCollection paramFontSettingCollection)
    throws Exception
  {
    if (null == paramFontSettingCollection) {
      return false;
    }
    String str1 = paramFontSettingCollection.getText();
    Font localFont1 = paramFontSettingCollection.e();
    int i = a(localFont1);
    StyleFlag localStyleFlag = new StyleFlag();
    TextOptions localTextOptions = (TextOptions)localFont1;
    zav localzav = zav.a();
    String str2 = localzav.a(localFont1.getName());
    zgs localzgs = localzav.a(str2, i, false);
    if (null == localzgs) {
      return false;
    }
    int j = 0;
    int k = 0;
    zcd[] arrayOfzcd = zce.a().a(str1);
    for (int m = 0; m < arrayOfzcd.length; m++)
    {
      int n = arrayOfzcd[m].a;
      if ((n != 10) && (n != 13)) {
        if (localzgs.e().c(n))
        {
          if (0 != k)
          {
            int i1 = 0;
            j = m - k;
            String str3 = str1.substring(j, j + k);
            Iterator localIterator = localTextOptions.t().iterator();
            while (localIterator.hasNext())
            {
              zbwj localzbwj = (zbwj)localIterator.next();
              if (zw.b(localzbwj.a, str2))
              {
                i1++;
              }
              else
              {
                if (localzav.a(localzbwj.a, i, str3, false))
                {
                  Font localFont2 = new Font(paramFontSettingCollection.a, null, true);
                  localFont2.b(localzbwj.a);
                  localFont2.b(localTextOptions.getSize());
                  localStyleFlag.setAll(true);
                  paramFontSettingCollection.format(j, k, localFont2, localStyleFlag);
                  break;
                }
                i1++;
              }
            }
            if (localTextOptions.t().getCount() <= i1) {
              return false;
            }
            k = 0;
          }
        }
        else {
          k++;
        }
      }
    }
    return true;
  }
  
  static int a(Font paramFont)
  {
    int i = 0;
    if (paramFont.isBold()) {
      i |= 0x1;
    }
    if (paramFont.isItalic()) {
      i |= 0x2;
    }
    if (paramFont.isStrikeout()) {
      i |= 0x8;
    }
    if (paramFont.getUnderline() != 0) {
      i |= 0x4;
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */