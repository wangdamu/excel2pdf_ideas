package com.aspose.cells.b.a.d;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ze
  extends zm
{
  private boolean a;
  private zl b;
  
  public ze(String paramString, int paramInt1, int paramInt2, int paramInt3)
    throws IOException
  {
    this(paramString, paramInt1, paramInt2);
  }
  
  public String h_()
  {
    return this.b.a();
  }
  
  public void g_()
    throws IOException
  {
    b();
    a();
  }
  
  public ze(String paramString, int paramInt)
    throws IOException
  {
    int i;
    switch (paramInt)
    {
    case 6: 
      i = 3;
      break;
    case 2: 
      i = 2;
      break;
    case 1: 
      i = 2;
      break;
    case 3: 
      i = 1;
      break;
    case 4: 
    case 5: 
    default: 
      i = 3;
    }
    a(paramString, paramInt, i);
  }
  
  private void a(String paramString, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramString == null) {
      throw new NullPointerException("File path can't be null.");
    }
    if ("".equals(paramString)) {
      throw new IllegalArgumentException("File path can't be \"\".");
    }
    if ((paramInt1 < 1) || (paramInt1 > 6)) {
      throw new IndexOutOfBoundsException("Illegal FileMode: " + paramInt1 + ".");
    }
    if ((paramInt2 < 1) || (paramInt2 > 3)) {
      throw new IndexOutOfBoundsException("access = " + paramInt2);
    }
    String str;
    if (paramInt2 == 1)
    {
      this.a = false;
      str = "r";
    }
    else
    {
      this.a = true;
      str = "rw";
    }
    File localFile = new File(paramString);
    if (localFile.exists())
    {
      if (paramInt1 == 1) {
        throw new IOException("Can't create new file. File '" + paramString + "' already exist.");
      }
      if ((paramInt1 == 2) || (paramInt1 == 5)) {
        localFile.delete();
      }
      this.b = new zl(localFile, str);
      if (paramInt1 == 6) {
        this.b.a(this.b.d());
      }
    }
    else
    {
      if ((paramInt1 == 3) || (paramInt1 == 5)) {
        throw new FileNotFoundException("Can't find file: " + paramString + ".");
      }
      this.b = new zl(localFile, str);
    }
  }
  
  public ze(String paramString, int paramInt1, int paramInt2)
    throws IOException
  {
    a(paramString, paramInt1, paramInt2);
  }
  
  public boolean d()
  {
    return true;
  }
  
  public boolean e()
  {
    return true;
  }
  
  public boolean f()
  {
    return this.a;
  }
  
  public long h()
    throws IOException
  {
    return this.b.d();
  }
  
  public long i()
    throws IOException
  {
    return this.b.c();
  }
  
  public void b(long paramLong)
    throws IOException
  {
    this.b.a(paramLong);
  }
  
  public void b()
    throws IOException
  {
    this.b.e();
  }
  
  public long a(long paramLong, int paramInt)
    throws IOException
  {
    switch (paramInt)
    {
    case 0: 
      this.b.a(paramLong);
      break;
    case 1: 
      this.b.a(this.b.c() + paramLong);
      break;
    case 2: 
      this.b.a(this.b.d() + paramLong);
      break;
    default: 
      throw new IllegalStateException("Unknown SeekOrigin type.");
    }
    return this.b.c();
  }
  
  public void a()
    throws IOException
  {
    this.b.b();
  }
  
  public void a(long paramLong)
    throws IOException
  {
    this.b.b(paramLong);
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = this.b.a(paramArrayOfByte, paramInt1, paramInt2);
    return i == -1 ? 0 : i;
  }
  
  public int c()
    throws IOException
  {
    return this.b.f();
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.b.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void a(byte paramByte)
    throws IOException
  {
    this.b.write(paramByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */