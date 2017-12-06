package com.aspose.cells.a.d;

import com.aspose.cells.ImageFormat;
import com.aspose.cells.ImageOrPrintOptions;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class zcc
{
  public static float a = 96.0F;
  private static final com.aspose.cells.b.c.a.za c = new com.aspose.cells.b.c.a.za(new String[] { "bmp", "emf", "jpg", "jpeg", "png", "wmf", "pict", "gif", "tif", "tiff", "IHDR", "pHYs", "IEND" });
  
  public static int a(zm paramzm)
    throws Exception
  {
    paramzm.b(0L);
    byte[] arrayOfByte = new byte[64];
    paramzm.a(arrayOfByte, 0, arrayOfByte.length);
    paramzm.b(0L);
    return a(arrayOfByte);
  }
  
  public static int a(byte[] paramArrayOfByte)
    throws Exception
  {
    if (j(paramArrayOfByte)) {
      return 2;
    }
    if (k(paramArrayOfByte)) {
      return 2;
    }
    if (m(paramArrayOfByte)) {
      return 1;
    }
    if (d(paramArrayOfByte)) {
      return 4;
    }
    if (e(paramArrayOfByte)) {
      return 5;
    }
    if (f(paramArrayOfByte)) {
      return 6;
    }
    if (h(paramArrayOfByte)) {
      return 3;
    }
    if (g(paramArrayOfByte)) {
      return 7;
    }
    if (c(paramArrayOfByte)) {
      return 8;
    }
    return 0;
  }
  
  public static String a(ImageFormat paramImageFormat)
  {
    return a(b(paramImageFormat));
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
      return "bmp";
    case 1: 
      return "emf";
    case 4: 
      return "jpeg";
    case 5: 
      return "png";
    case 2: 
      return "wmf";
    case 3: 
      return "pict";
    case 7: 
      return "gif";
    case 8: 
      return "tif";
    }
    throw new IllegalStateException("Cannot convert image type to string.");
  }
  
  public static int b(ImageFormat paramImageFormat)
  {
    if (paramImageFormat.equals(ImageFormat.getJpeg())) {
      return 4;
    }
    if (paramImageFormat.equals(ImageFormat.getPng())) {
      return 5;
    }
    if (paramImageFormat.equals(ImageFormat.getEmf())) {
      return 1;
    }
    if (paramImageFormat.equals(ImageFormat.getWmf())) {
      return 2;
    }
    if (paramImageFormat.equals(ImageFormat.getBmp())) {
      return 6;
    }
    if (paramImageFormat.equals(ImageFormat.getGif())) {
      return 7;
    }
    if (paramImageFormat.equals(ImageFormat.getTiff())) {
      return 8;
    }
    return 0;
  }
  
  public static ImageFormat b(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return ImageFormat.getWmf();
    case 1: 
      return ImageFormat.getEmf();
    case 6: 
      return ImageFormat.getBmp();
    case 5: 
      return ImageFormat.getPng();
    case 4: 
      return ImageFormat.getJpeg();
    case 7: 
      return ImageFormat.getGif();
    case 8: 
      return ImageFormat.getTiff();
    }
    throw new IllegalStateException("Unexpected image type.");
  }
  
  public static zcb b(byte[] paramArrayOfByte)
    throws Exception
  {
    return a(paramArrayOfByte, a(paramArrayOfByte));
  }
  
  public static zcb a(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    switch (paramInt)
    {
    case 2: 
      return t(paramArrayOfByte);
    case 1: 
      return u(paramArrayOfByte);
    case 3: 
      return v(paramArrayOfByte);
    case 6: 
      return p(paramArrayOfByte);
    case 5: 
      return r(paramArrayOfByte);
    case 4: 
      return s(paramArrayOfByte);
    case 7: 
      return q(paramArrayOfByte);
    }
    return zcb.a(100, 100, a, a);
  }
  
  public static boolean c(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      int i = localza.n();
      boolean bool = (i == 18761) || (i == 19789);
      return bool;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean d(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      long l = localza.p() & 0xFFFF;
      if ((l & 0xFFFFFFFF) != 55551L)
      {
        bool = false;
        return bool;
      }
      boolean bool = true;
      return bool;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean e(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      long l1 = localza.r();
      if ((l1 & 0xFFFFFFFF) != 1196314761L)
      {
        boolean bool1 = false;
        return bool1;
      }
      long l2 = localza.r();
      if ((l2 & 0xFFFFFFFF) != 169478669L)
      {
        bool2 = false;
        return bool2;
      }
      boolean bool2 = true;
      return bool2;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean f(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      long l1 = localza.p() & 0xFFFF;
      if ((l1 & 0xFFFFFFFF) != 19778L)
      {
        boolean bool1 = false;
        return bool1;
      }
      long l2 = localza.r();
      localza.r();
      long l3 = localza.r();
      if (((l2 & 0xFFFFFFFF) != 0L) && ((l3 & 0xFFFFFFFF) > (l2 & 0xFFFFFFFF)))
      {
        boolean bool2 = false;
        return bool2;
      }
      long l4 = 12L;
      long l5 = 16L;
      long l6 = localza.r();
      int i = l6 == l4 ? 1 : 0;
      if ((i == 0) && ((l6 & 0xFFFFFFFF) < (l5 & 0xFFFFFFFF)))
      {
        boolean bool3 = false;
        return bool3;
      }
      if (i != 0)
      {
        localza.r();
      }
      else
      {
        localza.q();
        localza.q();
      }
      long l7 = localza.p() & 0xFFFF;
      if ((l7 & 0xFFFFFFFF) != 1L)
      {
        boolean bool4 = false;
        return bool4;
      }
      long l8 = localza.p() & 0xFFFF;
      if (((l8 & 0xFFFFFFFF) != 1L) && ((l8 & 0xFFFFFFFF) != 4L) && ((l8 & 0xFFFFFFFF) != 8L) && ((l8 & 0xFFFFFFFF) != 16L) && ((l8 & 0xFFFFFFFF) != 24L) && ((l8 & 0xFFFFFFFF) != 32L))
      {
        bool5 = false;
        return bool5;
      }
      boolean bool5 = true;
      return bool5;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean g(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      int i = localza.q() & 0xFFFFFF;
      boolean bool = i == 4606279;
      return bool;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean h(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      localza.p();
      localza.p();
      localza.p();
      localza.p();
      localza.p();
      int i = zdh.b(localza.p()) & 0xFFFF;
      if (i == 273)
      {
        boolean bool1 = true;
        return bool1;
      }
      if (i == 17)
      {
        j = zdh.b(localza.p()) & 0xFFFF;
        if (j == 767)
        {
          boolean bool2 = true;
          return bool2;
        }
      }
      int j = 0;
      return j;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean i(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      long l = localza.p() & 0xFFFF;
      if ((l & 0xFFFFFFFF) != 40L)
      {
        bool = false;
        return bool;
      }
      boolean bool = true;
      return bool;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean j(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      int i = localza.n();
      if ((i != 0) && (i != 1))
      {
        boolean bool1 = false;
        return bool1;
      }
      int j = localza.n();
      if (j != 9)
      {
        boolean bool2 = false;
        return bool2;
      }
      localza.n();
      localza.q();
      localza.n();
      localza.q();
      int k = localza.n();
      if (k != 0)
      {
        bool3 = false;
        return bool3;
      }
      boolean bool3 = true;
      return bool3;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean k(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      long l = localza.r();
      if ((l & 0xFFFFFFFF) != 2596720087L)
      {
        boolean bool1 = false;
        return bool1;
      }
      int i = localza.n();
      if (i != 0)
      {
        bool2 = false;
        return bool2;
      }
      boolean bool2 = true;
      return bool2;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static boolean l(byte[] paramArrayOfByte)
    throws Exception
  {
    return (j(paramArrayOfByte)) || (k(paramArrayOfByte));
  }
  
  public static boolean m(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      long l1 = localza.r();
      if ((l1 & 0xFFFFFFFF) != 1L)
      {
        boolean bool1 = false;
        return bool1;
      }
      localza.k().b(40L);
      long l2 = localza.r();
      if ((l2 & 0xFFFFFFFF) != 1179469088L)
      {
        bool2 = false;
        return bool2;
      }
      boolean bool2 = true;
      return bool2;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static int n(byte[] paramArrayOfByte)
    throws Exception
  {
    if (m(paramArrayOfByte))
    {
      zh localzh = new zh(paramArrayOfByte);
      try
      {
        com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
        localza.r();
        long l1 = localza.r();
        localza.k().b(l1);
        long l2 = localza.r();
        if ((l2 & 0xFFFFFFFF) != 70L)
        {
          i = 3;
          return i;
        }
        localza.q();
        localza.q();
        int i = localza.q();
        if (i == 726027589)
        {
          j = localza.p() & 0xFFFF;
          if (j != 16385)
          {
            k = 3;
            return k;
          }
          int k = localza.p() & 0xFFFF;
          if ((k & 0x1) == 1)
          {
            m = 5;
            return m;
          }
          int m = 4;
          return m;
        }
        int j = 3;
        return j;
      }
      finally
      {
        if (localzh != null) {
          localzh.a();
        }
      }
    }
    return 0;
  }
  
  public static byte[] o(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (paramArrayOfByte == null)) {
      throw new AssertionError();
    }
    if ((!b) && (!i(paramArrayOfByte))) {
      throw new AssertionError("Expected a DIB here.");
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      byte[] arrayOfByte = b(localza, paramArrayOfByte.length);
      return arrayOfByte;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  private static byte[] b(com.aspose.cells.b.a.d.za paramza, int paramInt)
    throws Exception
  {
    int i = (int)paramza.k().i();
    zae localzae = new zae();
    localzae.a(paramza);
    paramza.k().b(i);
    byte[] arrayOfByte1 = new byte[14 + paramInt];
    zh localzh = new zh(arrayOfByte1);
    try
    {
      zb localzb = new zb(localzh);
      zad localzad = new zad();
      localzad.b = (14 + paramInt);
      localzad.e = (54 + localzae.a());
      localzad.a(localzb);
      localzb.b();
      paramza.a(arrayOfByte1, 14, paramInt);
      byte[] arrayOfByte2 = arrayOfByte1;
      return arrayOfByte2;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static byte[] a(com.aspose.cells.b.a.d.za paramza, int paramInt1, int paramInt2)
    throws Exception
  {
    long l = paramza.k().i();
    return a(paramza, l, paramInt1, l + paramInt1, paramInt2);
  }
  
  public static byte[] a(com.aspose.cells.b.a.d.za paramza, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    throws Exception
  {
    paramza.k().b(paramLong1);
    zae localzae = new zae();
    localzae.a(paramza);
    int i = 40 + localzae.a();
    byte[] arrayOfByte1 = paramza.f(localzae.a());
    paramza.k().b(paramLong3);
    byte[] arrayOfByte2 = new byte[14 + i + (int)paramLong4];
    zh localzh = new zh(arrayOfByte2);
    try
    {
      zb localzb = new zb(localzh);
      zad localzad = new zad();
      localzad.b = (14 + i + paramLong4);
      localzad.e = (14 + i);
      localzad.a(localzb);
      localzae.a(localzb);
      localzb.a(arrayOfByte1);
      localzb.b();
      paramza.a(arrayOfByte2, 14 + i, (int)paramLong4);
      byte[] arrayOfByte3 = arrayOfByte2;
      return arrayOfByte3;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static com.aspose.cells.b.a.b.za a(com.aspose.cells.b.a.d.za paramza, int paramInt)
    throws Exception
  {
    zh localzh = new zh(b(paramza, paramInt));
    return (com.aspose.cells.b.a.b.za)zj.a(localzh);
  }
  
  public static com.aspose.cells.b.a.b.za b(com.aspose.cells.b.a.d.za paramza, int paramInt1, int paramInt2)
    throws Exception
  {
    zh localzh = new zh(a(paramza, paramInt1, paramInt2));
    com.aspose.cells.b.a.b.za localza = null;
    try
    {
      localza = (com.aspose.cells.b.a.b.za)zj.a(localzh);
    }
    catch (Exception localException) {}
    return localza;
  }
  
  public static zcb p(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (!f(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      localzh.b(14L);
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      zae localzae = new zae();
      localzae.a(localza);
      zcb localzcb1 = zcb.a(localzae.b, localzae.c, localzae.h / 39.37007874015748D, localzae.i / 39.37007874015748D);
      if (localzcb1.d() == 0.0D) {
        localzcb1.a(a);
      }
      if (localzcb1.e() == 0.0D) {
        localzcb1.b(a);
      }
      zcb localzcb2 = localzcb1;
      return localzcb2;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static zcb q(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (!g(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      localzh.b(6L);
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      int i = localza.p();
      int j = localza.p();
      zcb localzcb = zcb.a(i & 0xFFFF, j & 0xFFFF, a, a);
      return localzcb;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static zcb r(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (!e(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zcb localzcb1 = zcb.a();
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      zz localzz = new zz(localzh);
      int i = 8;
      localzh.b(i);
      int j = 0;
      while ((j == 0) && (localzh.i() < localzh.h()))
      {
        long l1 = localzz.c();
        String str = new String(localzz.b(4));
        switch (c.a(str))
        {
        case 10: 
          localzcb1.a(localzz.b());
          localzcb1.b(localzz.b());
          localzh.a(-8L, 1);
          break;
        case 11: 
          long l2 = localzz.c();
          long l3 = localzz.c();
          int k = localzz.f();
          if (k == 1)
          {
            localzcb1.a((l2 & 0xFFFFFFFF) / 39.37007874015748D);
            localzcb1.b((l3 & 0xFFFFFFFF) / 39.37007874015748D);
          }
          j = 1;
          break;
        case 12: 
          j = 1;
          break;
        }
        localzh.a((l1 & 0xFFFFFFFF) + 4L, 1);
      }
      zcb localzcb2 = localzcb1;
      return localzcb2;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static zcb s(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (!d(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      zcb localzcb1 = zcb.a();
      zz localzz = new zz(localzh);
      localzz.e();
      for (int i = localzz.e(); ((i & 0xFFFF & 0xFFF0) != 65472) || ((i & 0xFFFF) == 65476) || ((i & 0xFFFF) == 65484); i = localzz.e()) {
        if (!a(i, localzz, localzcb1))
        {
          j = localzz.e();
          localzh.a((j & 0xFFFF) - 2, 1);
        }
      }
      if (localzcb1.d() == 0.0D) {
        localzcb1.a(96.0D);
      }
      if (localzcb1.e() == 0.0D) {
        localzcb1.b(96.0D);
      }
      int j = 2;
      int k = 1;
      localzh.a(j + k, 1);
      localzcb1.b(localzz.e());
      localzcb1.a(localzz.e());
      zcb localzcb2 = localzcb1;
      return localzcb2;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  private static boolean a(int paramInt, zz paramzz, zcb paramzcb)
    throws Exception
  {
    if ((paramInt & 0xFFFF) == 65504)
    {
      a(paramzz, paramzcb);
      return true;
    }
    if ((paramInt & 0xFFFF) == 65505)
    {
      b(paramzz, paramzcb);
      return true;
    }
    return false;
  }
  
  private static void a(zz paramzz, zcb paramzcb)
    throws Exception
  {
    int i = paramzz.e();
    int j = 5;
    int k = 2;
    paramzz.a().a(j + k, 1);
    int m = paramzz.f();
    int n = paramzz.e();
    int i1 = paramzz.e();
    switch (m)
    {
    case 0: 
      break;
    case 1: 
      paramzcb.a(n);
      paramzcb.b(i1);
      break;
    case 2: 
      double d = 2.54D;
      paramzcb.a((n & 0xFFFF) * d);
      paramzcb.b((i1 & 0xFFFF) * d);
      break;
    }
    paramzz.a().a((i & 0xFFFF) - (2 + j + k + 1 + 2 + 2), 1);
  }
  
  private static void b(zz paramzz, zcb paramzcb)
    throws Exception
  {
    long l1 = paramzz.a().i();
    int i = paramzz.e();
    String str = new String(paramzz.b(6));
    if (str.startsWith("Exif"))
    {
      long l2 = paramzz.a().i();
      int j = paramzz.d();
      boolean bool = j == 19789;
      int k = a(paramzz, bool);
      long l3 = b(paramzz, bool);
      paramzz.a().a((l3 & 0xFFFFFFFF) - 8L, 1);
      int m = a(paramzz, bool);
      for (int n = 0; n < (m & 0xFFFF); n++)
      {
        int i1 = a(paramzz, bool);
        int i2 = a(paramzz, bool);
        long l4 = b(paramzz, bool);
        long l5 = b(paramzz, bool);
        if ((i1 & 0xFFFF) == 282) {
          paramzcb.a(a(paramzz, l2 + (l5 & 0xFFFFFFFF), bool));
        }
        if ((i1 & 0xFFFF) == 283) {
          paramzcb.b(a(paramzz, l2 + (l5 & 0xFFFFFFFF), bool));
        }
      }
    }
    paramzz.a().b(l1 + (i & 0xFFFF));
  }
  
  private static double a(zz paramzz, long paramLong, boolean paramBoolean)
    throws Exception
  {
    long l1 = paramzz.a().i();
    paramzz.a().b(paramLong);
    long l2 = b(paramzz, paramBoolean);
    long l3 = b(paramzz, paramBoolean);
    paramzz.a().b(l1);
    return (l2 & 0xFFFFFFFF) / (l3 & 0xFFFFFFFF);
  }
  
  private static int a(zz paramzz, boolean paramBoolean)
    throws Exception
  {
    int i = paramzz.e();
    if (!paramBoolean) {
      i = zdh.b(i);
    }
    return i;
  }
  
  private static long b(zz paramzz, boolean paramBoolean)
    throws Exception
  {
    long l = paramzz.c();
    if (!paramBoolean) {
      l = zdh.a(l);
    }
    return l;
  }
  
  public static zcb t(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (!l(paramArrayOfByte))) {
      throw new AssertionError();
    }
    if (j(paramArrayOfByte)) {
      return w(paramArrayOfByte);
    }
    if (k(paramArrayOfByte))
    {
      zh localzh = new zh(paramArrayOfByte);
      try
      {
        com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
        zcz localzcz = new zcz();
        localzcz.a(localza);
        zcb localzcb1 = zcb.a(localzcz.b().g(), localzcz.b().h(), localzcz.b().i(), localzcz.b().j(), localzcz.c(), localzcz.c());
        if ((localzcb1.b() > 0) || (localzcb1.c() > 0))
        {
          localzcb2 = localzcb1;
          return localzcb2;
        }
        zcb localzcb2 = w(paramArrayOfByte);
        return localzcb2;
      }
      finally
      {
        if (localzh != null) {
          localzh.a();
        }
      }
    }
    throw new IllegalStateException("Unexpected image type.");
  }
  
  private static zcb w(byte[] paramArrayOfByte)
    throws Exception
  {
    zas localzas = new zas(paramArrayOfByte);
    return zcb.a((int)localzas.i().b(), (int)localzas.i().c(), localzas.g(), localzas.h());
  }
  
  public static zcb u(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (!m(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      zct localzct = new zct();
      localzct.a(localza);
      zcb localzcb = zcb.a(localzct.a().g(), localzct.a().h(), localzct.a().i(), localzct.a().j(), localzct.c(), localzct.d());
      return localzcb;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static zcb v(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((!b) && (!h(paramArrayOfByte))) {
      throw new AssertionError();
    }
    zh localzh = new zh(paramArrayOfByte);
    try
    {
      com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(localzh);
      localza.p();
      int i = zdh.b(localza.p()) & 0xFFFF;
      int j = zdh.b(localza.p()) & 0xFFFF;
      int k = zdh.b(localza.p()) & 0xFFFF;
      int m = zdh.b(localza.p()) & 0xFFFF;
      int n = zao.f(m - j);
      int i1 = zao.f(k - i);
      zcb localzcb = zcb.a(j, i, m, k, n, i1);
      return localzcb;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  public static com.aspose.cells.b.a.b.za a(int paramInt1, int paramInt2)
  {
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(paramInt1, paramInt2, 2498570);
    localza.a(a, a);
    return localza;
  }
  
  static com.aspose.cells.b.a.b.za a(com.aspose.cells.b.a.b.za paramza)
  {
    com.aspose.cells.b.a.b.za localza = a(paramza.i(), paramza.h());
    localza.a(paramza.j(), paramza.k());
    BufferedImage localBufferedImage = localza.f();
    Graphics2D localGraphics2D = localBufferedImage.createGraphics();
    localGraphics2D.drawImage(paramza.f(), 0, 0, Color.white, null);
    localGraphics2D.dispose();
    return localza;
  }
  
  public static void a(zj paramzj, zm paramzm)
    throws Exception
  {
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(paramzj.i(), paramzj.h(), 139273);
    localza.a(paramzj.j(), paramzj.k());
    Graphics2D localGraphics2D = localza.f().createGraphics();
    localGraphics2D.drawImage(paramzj.f(), 0, 0, null);
    localGraphics2D.setColor(Color.white);
    localGraphics2D.clearRect(0, 0, paramzj.i(), paramzj.h());
    ImageIO.write(localza.f(), "BMP", paramzm.j());
  }
  
  public static void b(zj paramzj, zm paramzm)
    throws IOException, Exception
  {
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(paramzj.i(), paramzj.h(), 2498570);
    localza.a(paramzj.j(), paramzj.k());
    Graphics2D localGraphics2D = localza.f().createGraphics();
    localGraphics2D.drawImage(paramzj.f(), 0, 0, null);
    ImageIO.write(localza.f(), "PNG", paramzm.j());
  }
  
  public static void a(zj paramzj, zm paramzm, long paramLong)
    throws Exception
  {
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(paramzj.i(), paramzj.h(), 139273);
    Graphics2D localGraphics2D = localza.f().createGraphics();
    localGraphics2D.drawImage(paramzj.f(), 0, 0, null);
    localGraphics2D.dispose();
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    localImageOrPrintOptions.setHorizontalResolution((int)paramzj.j());
    localImageOrPrintOptions.setVerticalResolution((int)paramzj.k());
    localImageOrPrintOptions.setQuality((int)paramLong);
    zcf.a(localza.f(), localImageOrPrintOptions, paramzm.j());
    localza.d();
    localza = null;
  }
  
  public static com.aspose.cells.b.a.b.za a(com.aspose.cells.b.a.b.za paramza, int paramInt)
  {
    return paramza;
  }
  
  public static com.aspose.cells.b.a.b.za a(int paramInt1, int paramInt2, int paramInt3)
  {
    return new com.aspose.cells.b.a.b.za(paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */