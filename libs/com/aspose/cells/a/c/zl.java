package com.aspose.cells.a.c;

import com.aspose.cells.CellsException;
import com.aspose.cells.a.e.zf;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class zl
{
  private static final boolean a;
  
  public static String a(Exception paramException)
  {
    if ((paramException instanceof CellsException)) {
      return a((CellsException)paramException);
    }
    return paramException.getClass().getName() + ": " + paramException.getMessage();
  }
  
  public static String a(CellsException paramCellsException)
  {
    return "CellsException[Code=" + paramCellsException.getCode() + "; Message=" + paramCellsException.getMessage() + "]";
  }
  
  public static boolean a()
  {
    return false;
  }
  
  public static void a(String paramString)
  {
    zf.a(paramString);
  }
  
  public static void b(Exception paramException) {}
  
  public static void b(String paramString) {}
  
  public static void c(String paramString)
  {
    if (a)
    {
      if (paramString != null) {
        System.out.println(paramString);
      }
      System.out.println("Press Enter key to continue...");
      try
      {
        System.in.read();
      }
      catch (IOException localIOException)
      {
        System.out.println("Exception while pause process by System.in: " + localIOException.getMessage());
      }
    }
  }
  
  static
  {
    boolean bool = false;
    a = bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */