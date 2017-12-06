package com.aspose.cells;

public class zaux
{
  static int a(zse paramzse, byte[] paramArrayOfByte)
  {
    try
    {
      return paramzse.b().a(paramArrayOfByte) + 1;
    }
    catch (Exception localException)
    {
      throw new CellsException(13, "Adding Image Error. " + localException.getMessage(), localException);
    }
  }
  
  public static CellsException a(int paramInt, String paramString)
  {
    return new CellsException(paramInt, paramString);
  }
  
  public static CellsException a(int paramInt, String paramString, Exception paramException)
  {
    return new CellsException(paramInt, paramString, paramException);
  }
  
  public static void a(int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    zaac.a(paramInt1, paramInt2, paramStringBuilder);
  }
  
  public static void a(DateTime paramDateTime, StringBuilder paramStringBuilder)
  {
    zaac.a(paramDateTime, paramStringBuilder);
  }
  
  public static void b(DateTime paramDateTime, StringBuilder paramStringBuilder)
  {
    zaac.b(paramDateTime, paramStringBuilder);
  }
  
  public static void a(zane paramzane, FontSettingCollection paramFontSettingCollection)
  {
    try
    {
      zalg.a(paramzane, paramFontSettingCollection);
    }
    catch (Exception localException) {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */