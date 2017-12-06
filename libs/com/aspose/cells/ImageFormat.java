package com.aspose.cells;

import com.aspose.cells.a.c.zb;
import com.aspose.cells.b.a.zh;
import java.util.Hashtable;

public class ImageFormat
{
  private int a;
  private static Hashtable<String, ImageFormat> b = new Hashtable();
  private static Hashtable<ImageFormat, String> c = new Hashtable();
  private static Hashtable<String, ImageFormat> d = new Hashtable();
  private static int e = 1;
  private static int f = 2;
  private static int g = 3;
  private static int h = 4;
  private static int i = 5;
  private static int j = 6;
  private static int k = 7;
  private static int l = 8;
  private static int m = 9;
  private static int n = 10;
  private static int o = 11;
  private static int p = 12;
  private static ImageFormat q = new ImageFormat(e);
  private static ImageFormat r = new ImageFormat(f);
  private static ImageFormat s = new ImageFormat(g);
  private static ImageFormat t = new ImageFormat(h);
  private static ImageFormat u = new ImageFormat(i);
  private static ImageFormat v = new ImageFormat(j);
  private static ImageFormat w = new ImageFormat(k);
  private static ImageFormat x = new ImageFormat(l);
  private static ImageFormat y = new ImageFormat(m);
  private static ImageFormat z = new ImageFormat(n);
  private static ImageFormat A = new ImageFormat(o);
  private static ImageFormat B = new ImageFormat(p);
  
  public ImageFormat(int imageFormatID)
  {
    this.a = imageFormatID;
  }
  
  public static ImageFormat getBmp()
  {
    return q;
  }
  
  public static ImageFormat getEmf()
  {
    return r;
  }
  
  public static ImageFormat getExif()
  {
    return s;
  }
  
  public static ImageFormat getGif()
  {
    return u;
  }
  
  public static ImageFormat getIcon()
  {
    return v;
  }
  
  public static ImageFormat getJpeg()
  {
    return w;
  }
  
  public static ImageFormat getMemoryBmp()
  {
    return x;
  }
  
  public static ImageFormat getPng()
  {
    return z;
  }
  
  public static ImageFormat getTiff()
  {
    return A;
  }
  
  public static ImageFormat getWmf()
  {
    return B;
  }
  
  public zh a()
  {
    throw new zb("");
  }
  
  public boolean equals(Object obj)
  {
    ImageFormat localImageFormat = (ImageFormat)obj;
    if (localImageFormat == null) {
      return false;
    }
    return this.a == localImageFormat.a;
  }
  
  public String getName()
  {
    if (this.a == e) {
      return "BMP";
    }
    if (this.a == f) {
      return "EMF";
    }
    if (this.a == g) {
      return "EXIF";
    }
    if (this.a == h) {
      return "FLASH_PIX";
    }
    if (this.a == i) {
      return "GIF";
    }
    if (this.a == j) {
      return "ICON";
    }
    if (this.a == k) {
      return "JPEG";
    }
    if (this.a == l) {
      return "MEMORY_BMP";
    }
    if (this.a == m) {
      return "PHOTO_CD";
    }
    if (this.a == n) {
      return "PNG";
    }
    if (this.a == o) {
      return "TIFF";
    }
    if (this.a == p) {
      return "WMF";
    }
    return "";
  }
  
  public static ImageFormat getImageFormatFromSuffixName(String name)
  {
    return (ImageFormat)b.get(name);
  }
  
  public static String a(ImageFormat paramImageFormat)
  {
    return (String)c.get(paramImageFormat);
  }
  
  public static ImageFormat a(String paramString)
  {
    return (ImageFormat)d.get(paramString.toUpperCase());
  }
  
  static
  {
    b.put("bmp", q);
    b.put("exif", s);
    b.put("pix", t);
    b.put("icon", v);
    b.put("gif", u);
    b.put("png", z);
    b.put("jpg", w);
    b.put("tif", A);
    c.put(q, "BMP");
    c.put(u, "GIF");
    c.put(z, "PNG");
    c.put(w, "JPEG");
    c.put(w, "JPG");
    d.put("BMP", q);
    d.put("GIF", u);
    d.put("PNG", z);
    d.put("JPEG", w);
    d.put("JPG", w);
    d.put("TIF", A);
    d.put("TIFF", A);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ImageFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */