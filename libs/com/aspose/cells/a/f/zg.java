package com.aspose.cells.a.f;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tools.zip.ZipFile;

class zg
  extends zd
{
  private byte[] d;
  private File e;
  
  zg(InputStream paramInputStream)
    throws Exception
  {
    this.d = a(paramInputStream);
    f();
    e();
  }
  
  public void c()
    throws Exception
  {
    if (this.c != null)
    {
      this.c.close();
      this.c = null;
      this.e.delete();
      this.e = null;
    }
  }
  
  public boolean d()
    throws Exception
  {
    if (this.e == null) {
      f();
    }
    return true;
  }
  
  private void f()
    throws Exception
  {
    this.e = File.createTempFile("AsposeCells", ".zip");
    this.e.deleteOnExit();
    BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.e));
    localBufferedOutputStream.write(this.d);
    localBufferedOutputStream.close();
    this.c = new ZipFile(this.e);
  }
  
  private static byte[] a(InputStream paramInputStream)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramInputStream);
    byte[] arrayOfByte = new byte['Ѐ'];
    int i;
    while ((i = localBufferedInputStream.read(arrayOfByte)) > 0) {
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/f/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */