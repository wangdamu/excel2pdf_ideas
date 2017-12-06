package com.aspose.cells.a.f;

import com.aspose.cells.CellsException;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.zaux;
import java.util.Iterator;

public class zi
  implements Iterable
{
  private zc a;
  
  public zi(zm paramzm)
  {
    try
    {
      this.a = ze.a(paramzm.g(), true);
    }
    catch (CellsException localCellsException)
    {
      throw localCellsException;
    }
    catch (Exception localException)
    {
      throw zaux.a(18, "Error for ZipFile", localException);
    }
  }
  
  public static zi a(zm paramzm)
  {
    return new zi(paramzm);
  }
  
  public int a()
  {
    return this.a.a();
  }
  
  public zh a(int paramInt)
  {
    return this.a.a(paramInt);
  }
  
  public Iterator iterator()
  {
    return this.a.b();
  }
  
  public int a(String paramString, boolean paramBoolean)
  {
    try
    {
      long l = this.a.a(paramString);
      if (l < 0L) {
        return -1;
      }
      return 0;
    }
    catch (Exception localException)
    {
      a(localException);
    }
    return -1;
  }
  
  public zh a(String paramString)
    throws Exception
  {
    long l = this.a.a(paramString);
    if (l < 0L) {
      return null;
    }
    zh localzh = new zh(paramString);
    localzh.a(false);
    localzh.a(l);
    return localzh;
  }
  
  public zm a(zh paramzh)
    throws Exception
  {
    return new com.aspose.cells.b.a.d.zi(this.a.c(paramzh.b()), this.a.a(paramzh.b()));
  }
  
  public void b()
    throws Exception
  {
    this.a.c();
  }
  
  private static void a(Exception paramException)
  {
    throw new IllegalStateException("ZipFile Exception: " + paramException.getMessage(), paramException);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/f/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */