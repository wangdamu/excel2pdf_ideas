package com.aspose.cells.a.f;

import com.aspose.cells.a.e.zf;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;

abstract class zd
  extends za
{
  protected ZipFile c;
  
  public InputStream c(String paramString)
    throws Exception
  {
    int i = b(paramString);
    if (i < 0) {
      return null;
    }
    if (this.c == null) {
      d();
    }
    return this.c.getInputStream(this.c.getEntry(this.a[i]));
  }
  
  void e()
    throws Exception
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Enumeration localEnumeration = this.c.getEntries();
    while (localEnumeration.hasMoreElements())
    {
      ZipEntry localZipEntry = (ZipEntry)localEnumeration.nextElement();
      if ((localZipEntry != null) && (!localZipEntry.isDirectory())) {
        try
        {
          InputStream localInputStream = this.c.getInputStream(localZipEntry);
          for (long l = 0L; localInputStream.read() > -1; l += localInputStream.skip(1024000L)) {
            l += 1L;
          }
          localArrayList2.add(Long.valueOf(l));
          localArrayList1.add(localZipEntry.getName());
        }
        catch (IOException localIOException)
        {
          zf.a("Unable to read data from ZipEntry: " + localZipEntry.getName());
        }
      }
    }
    this.a = new String[localArrayList1.size()];
    localArrayList1.toArray(this.a);
    this.b = new long[localArrayList2.size()];
    for (int i = 0; i < this.b.length; i++) {
      this.b[i] = ((Long)localArrayList2.get(i)).longValue();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/f/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */