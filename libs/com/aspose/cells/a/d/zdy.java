package com.aspose.cells.a.d;

public class zdy
{
  private String a;
  private String b;
  private static zdy c = new zdy("DeviceGray", "G");
  private static zdy d = new zdy("DeviceRGB", "RGB");
  private static zdy e = new zdy("DeviceCMYK", "CMYK");
  private static zdy f = new zdy("Indexed", "I");
  private static zdy g = new zdy("Pattern", "");
  
  private zdy() {}
  
  protected zdy(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public static zdy a()
  {
    return c;
  }
  
  public static zdy b()
  {
    return d;
  }
  
  public static zdy c()
  {
    return f;
  }
  
  public static zdy d()
  {
    return g;
  }
  
  public String e()
  {
    return this.a;
  }
  
  public String f()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */