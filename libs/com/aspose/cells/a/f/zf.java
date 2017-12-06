package com.aspose.cells.a.f;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class zf
  extends za
{
  private byte[] c;
  private byte[][] d;
  private long[] e;
  private zc f;
  
  zf(InputStream paramInputStream)
    throws Exception
  {
    this.c = a(paramInputStream);
    e();
  }
  
  private void e()
    throws IOException
  {
    Object localObject1 = new String[50];
    Object localObject2 = new long[50];
    Object localObject3 = new long[50];
    Object localObject4 = new byte[20][];
    Object localObject5 = new int[20];
    Object localObject6 = new int[20];
    int i = -1;
    int j = -1;
    int k = 0;
    int m = -1;
    this.f = new zc(this.c);
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(this.f);
    byte[] arrayOfByte = new byte[1048576];
    for (;;)
    {
      if (zc.a(this.f)) {
        m = this.f.a();
      }
      ZipEntry localZipEntry = this.f.getNextEntry();
      if (localZipEntry == null) {
        break;
      }
      if (!localZipEntry.isDirectory())
      {
        i++;
        if (i == localObject1.length)
        {
          localObject7 = new String[i << 1];
          long[] arrayOfLong = new long[localObject7.length];
          System.arraycopy(localObject1, 0, localObject7, 0, i);
          System.arraycopy(localObject2, 0, arrayOfLong, 0, i);
          localObject1 = localObject7;
          localObject2 = arrayOfLong;
          if (zc.a(this.f))
          {
            arrayOfLong = new long[localObject7.length];
            System.arraycopy(localObject3, 0, arrayOfLong, 0, i);
            localObject3 = arrayOfLong;
          }
        }
        Object localObject7 = localZipEntry.getName().replace('\\', '/');
        if (((String)localObject7).charAt(0) == '/') {
          localObject7 = ((String)localObject7).substring(1);
        }
        localObject1[i] = localObject7;
        long l;
        if (zc.a(this.f))
        {
          localObject3[i] = m;
          for (l = 0L; localBufferedInputStream.read() > -1; l += localBufferedInputStream.skip(1048576L)) {
            l += 1L;
          }
          localObject2[i] = l;
        }
        else
        {
          l = 0L;
          int n = 0;
          while (l < 1048576L)
          {
            n = localBufferedInputStream.read(arrayOfByte, (int)l, (int)(1048576L - l));
            if (n < 1) {
              break;
            }
            l += n;
          }
          if (n > -1) {
            while (localBufferedInputStream.read() > -1)
            {
              l += 1L;
              l += localBufferedInputStream.skip(1048576L);
            }
          }
          if (l > 1048576L)
          {
            localObject2[i] = l;
          }
          else if (l > 0L)
          {
            Object localObject9;
            if (k + l >= 16777216L)
            {
              int i1 = localObject5[j];
              if (l < localObject4[i1].length)
              {
                localObject2[localObject6[i1]] = localObject4[i1].length;
                k -= localObject4[i1].length;
                k = (int)(k + l);
                localObject9 = new byte[(int)l];
                System.arraycopy(arrayOfByte, 0, localObject9, 0, (int)l);
                localObject4[i1] = localObject9;
                localObject6[i1] = i;
                localObject2[i] = (-i1 - 1);
                int i3 = a((int)l, (byte[][])localObject4, (int[])localObject5, j - 1);
                System.arraycopy(localObject5, i3, localObject5, i3 + 1, j - i3);
                localObject5[i3] = j;
              }
              else
              {
                localObject2[i] = l;
              }
            }
            else
            {
              j++;
              if (j == localObject4.length)
              {
                localObject8 = new byte[j << 1][];
                System.arraycopy(localObject4, 0, localObject8, 0, j);
                localObject4 = localObject8;
                localObject9 = new int[localObject8.length];
                System.arraycopy(localObject6, 0, localObject9, 0, j);
                localObject6 = localObject9;
                localObject9 = new int[localObject9.length];
                System.arraycopy(localObject5, 0, localObject9, 0, j);
                localObject5 = localObject9;
              }
              k = (int)(k + l);
              Object localObject8 = new byte[(int)l];
              System.arraycopy(arrayOfByte, 0, localObject8, 0, (int)l);
              localObject4[j] = localObject8;
              localObject6[j] = i;
              localObject2[i] = (-j - 1);
              int i2 = a((int)l, (byte[][])localObject4, (int[])localObject5, j - 1);
              System.arraycopy(localObject5, i2, localObject5, i2 + 1, j - i2);
              localObject5[i2] = j;
            }
          }
          else
          {
            localObject2[i] = l;
          }
        }
      }
      this.f.closeEntry();
    }
    i++;
    if (i == localObject1.length)
    {
      this.a = ((String[])localObject1);
      this.b = ((long[])localObject2);
      if (zc.a(this.f)) {
        this.e = ((long[])localObject3);
      }
    }
    else
    {
      this.a = new String[i];
      System.arraycopy(localObject1, 0, this.a, 0, i);
      this.b = new long[i];
      System.arraycopy(localObject2, 0, this.b, 0, i);
      if (zc.a(this.f))
      {
        this.e = new long[i];
        System.arraycopy(localObject3, 0, this.e, 0, i);
      }
    }
    if (!zc.a(this.f))
    {
      this.f = null;
      j++;
      if (j == localObject4.length)
      {
        this.d = ((byte[][])localObject4);
      }
      else
      {
        this.d = new byte[j][];
        System.arraycopy(localObject4, 0, this.d, 0, j);
      }
    }
  }
  
  private int a(int paramInt1, byte[][] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2)
  {
    while ((paramInt2 > -1) && (paramArrayOfByte[paramArrayOfInt[paramInt2]].length > paramInt1)) {
      paramInt2--;
    }
    return paramInt2 + 1;
  }
  
  public long b(int paramInt)
  {
    long l = this.b[paramInt];
    if (l < 0L) {
      return this.d[((int)(-l - 1L))].length;
    }
    return l;
  }
  
  public InputStream c(String paramString)
    throws Exception
  {
    int i = b(paramString);
    if (i < 0) {
      return null;
    }
    if (this.b[i] < 0L) {
      return new ByteArrayInputStream(this.d[((int)(-this.b[i] - 1L))]);
    }
    if (this.b[i] == 0L) {
      return new ByteArrayInputStream(new byte[0]);
    }
    if (this.f == null)
    {
      this.f = new zc(this.c);
    }
    else
    {
      if (zc.a(this.f))
      {
        if (!this.f.d()) {
          this.f = new zc(this.c);
        }
        a(this.e[i]);
        this.f.a((int)this.e[i]);
        this.f.getNextEntry();
        this.f.c();
        return this.f;
      }
      if (!this.f.b(i)) {
        this.f = new zc(this.c);
      }
    }
    for (;;)
    {
      ZipEntry localZipEntry = this.f.getNextEntry();
      if (localZipEntry == null)
      {
        this.f = null;
        break;
      }
      if ((!localZipEntry.isDirectory()) && (this.f.b() == i))
      {
        this.f.c();
        return this.f;
      }
      this.f.closeEntry();
    }
    return null;
  }
  
  public void c()
    throws Exception
  {}
  
  public boolean d()
    throws Exception
  {
    return true;
  }
  
  static byte[] a(InputStream paramInputStream)
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
  
  class zc
    extends ZipInputStream
  {
    private int b = -1;
    private boolean c = false;
    private boolean d = false;
    private final boolean e;
    
    zc(byte[] paramArrayOfByte)
    {
      super();
      if ((com.aspose.cells.a.za.a) && ((this.in instanceof PushbackInputStream)))
      {
        this.in = new zf.zb(zf.this, paramArrayOfByte, 512);
        this.e = true;
      }
      else
      {
        this.e = false;
      }
    }
    
    public int a()
    {
      return ((zf.zb)this.in).b();
    }
    
    public void a(int paramInt)
    {
      ((zf.zb)this.in).c();
      ((zf.za)((zf.zb)this.in).a()).a(paramInt);
    }
    
    public int b()
    {
      return this.b;
    }
    
    public void c()
    {
      this.c = true;
    }
    
    public boolean d()
      throws IOException
    {
      if (this.d) {
        return true;
      }
      if (this.c)
      {
        if (available() < 1)
        {
          closeEntry();
          return true;
        }
        return false;
      }
      closeEntry();
      return true;
    }
    
    public boolean b(int paramInt)
      throws IOException
    {
      if (this.b >= paramInt) {
        return false;
      }
      return d();
    }
    
    public ZipEntry getNextEntry()
      throws IOException
    {
      ZipEntry localZipEntry = super.getNextEntry();
      if (localZipEntry == null) {
        return null;
      }
      if (!localZipEntry.isDirectory()) {
        this.b += 1;
      }
      this.d = false;
      return localZipEntry;
    }
    
    public void close()
      throws IOException
    {
      closeEntry();
    }
    
    public void closeEntry()
      throws IOException
    {
      super.closeEntry();
      this.d = true;
      this.c = false;
    }
  }
  
  class zb
    extends PushbackInputStream
  {
    zb(byte[] paramArrayOfByte, int paramInt)
    {
      super(paramInt);
    }
    
    public InputStream a()
    {
      return this.in;
    }
    
    public int b()
    {
      return ((zf.za)this.in).a() - (this.buf.length - this.pos);
    }
    
    public void c()
    {
      this.pos = this.buf.length;
    }
  }
  
  class za
    extends ByteArrayInputStream
  {
    public za(byte[] paramArrayOfByte)
    {
      super();
    }
    
    public int a()
    {
      return this.pos;
    }
    
    public void a(int paramInt)
    {
      this.pos = paramInt;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/f/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */