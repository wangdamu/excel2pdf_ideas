package com.aspose.cells.a.f;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.b.za;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zj
  extends zm
{
  private ZipOutputStream a;
  private zm b;
  private zh c;
  private boolean d = false;
  
  public zj(zm paramzm)
    throws Exception
  {
    this.b = paramzm;
    this.a = new ZipOutputStream(paramzm.j());
  }
  
  public InputStream g()
    throws Exception
  {
    return null;
  }
  
  public OutputStream j()
    throws Exception
  {
    return this.a;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long h()
    throws IOException
  {
    throw new UnsupportedOperationException("getLength() is not supported.");
  }
  
  public long i()
    throws Exception
  {
    return this.b.i();
  }
  
  public void b(long paramLong)
    throws Exception
  {
    this.b.b(paramLong);
  }
  
  public long a(long paramLong, int paramInt)
    throws Exception
  {
    throw new UnsupportedOperationException("seek() is not supported.");
  }
  
  public void a(long paramLong)
    throws Exception
  {
    throw new UnsupportedOperationException("setLength() is not supported.");
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    throw new UnsupportedOperationException("read() is not supported.");
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    if (this.d)
    {
      if (this.c != paramzh)
      {
        this.a.putNextEntry(b(this.c));
        this.a.closeEntry();
      }
      this.d = false;
    }
    this.a.putNextEntry(b(paramzh));
  }
  
  public zh a(String paramString)
  {
    this.c = new zh(paramString);
    this.d = true;
    return this.c;
  }
  
  public void a(byte paramByte)
    throws Exception
  {
    if (this.d)
    {
      this.a.putNextEntry(b(this.c));
      this.d = false;
    }
    this.a.write(paramByte);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    if (paramInt2 < 0) {
      return;
    }
    if (this.d)
    {
      this.a.putNextEntry(b(this.c));
      this.d = false;
    }
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public int c()
    throws Exception
  {
    throw new IllegalStateException("You must override the method in child classes.");
  }
  
  public void b()
    throws Exception
  {
    this.a.flush();
  }
  
  public void f_()
    throws Exception
  {
    this.a.flush();
    this.a.finish();
  }
  
  public void a()
    throws Exception
  {
    this.a.close();
  }
  
  public void a(int paramInt)
  {
    this.a.setLevel(paramInt);
  }
  
  public void b(int paramInt)
  {
    this.a.setLevel(paramInt);
  }
  
  public void c(int paramInt) {}
  
  public void d(int paramInt) {}
  
  private ZipEntry b(zh paramzh)
  {
    ZipEntry localZipEntry = new ZipEntry(paramzh.b());
    localZipEntry.setSize(paramzh.a());
    if (paramzh.d() != null) {
      localZipEntry.setTime(za.a(paramzh.d()));
    }
    return localZipEntry;
  }
  
  public void l()
    throws IOException
  {
    this.a.closeEntry();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/f/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */