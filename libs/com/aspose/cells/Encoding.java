package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.e.zg;
import com.aspose.cells.b.a.g.zb;
import com.aspose.cells.b.a.g.zc;
import com.aspose.cells.b.a.g.zd;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public class Encoding
{
  private int b;
  private String c;
  private String d;
  private Charset e = null;
  private CharsetDecoder f = null;
  private CharsetEncoder g = null;
  
  public static Encoding getASCII()
  {
    return new Encoding(20127, "US-ASCII", "us-ascii");
  }
  
  public static Encoding getUTF7()
  {
    return new Encoding(65000, "UTF-7", "utf-7");
  }
  
  public static Encoding getUTF8()
  {
    return new zd(true);
  }
  
  public static Encoding getUTF8NoBOM()
  {
    return new zd(false);
  }
  
  public static Encoding getUnicode()
  {
    return new Encoding(1200, "UTF-16LE", "utf-16");
  }
  
  public static Encoding getBigEndianUnicode()
  {
    return new Encoding(1201, "UTF-16BE", "unicodeFFFE");
  }
  
  protected Encoding(int codePage, String charsetName, String headerName)
  {
    this.b = codePage;
    this.c = charsetName;
    this.d = headerName;
  }
  
  public static Encoding a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      return getBigEndianUnicode();
    }
    return getUnicode();
  }
  
  public static Encoding getDefault()
  {
    return getEncoding(Charset.defaultCharset().name());
  }
  
  public static Encoding b(boolean paramBoolean1, boolean paramBoolean2)
  {
    throw new UnsupportedOperationException("UTF32 Encoding not supported in java version.");
  }
  
  public static Encoding getEncoding(int codePage)
  {
    for (zc localzc : ) {
      if (localzc.S == codePage) {
        return new Encoding(codePage, localzc.T, localzc.U);
      }
    }
    return getUTF8();
  }
  
  public static Encoding getEncoding(String charsetName)
  {
    zg.b(charsetName, "charsetName");
    for (Object localObject2 : zc.a()) {
      if (charsetName.equalsIgnoreCase(((zc)localObject2).T)) {
        return new Encoding(((zc)localObject2).S, ((zc)localObject2).T, ((zc)localObject2).U);
      }
    }
    ??? = null;
    try
    {
      ??? = Charset.forName(charsetName);
    }
    catch (Exception localException1)
    {
      if (zl.a()) {
        zl.a("GetEncoding(" + charsetName + ")-" + zl.a(localException1));
      }
      return getUTF8();
    }
    Encoding localEncoding = new Encoding(0, charsetName, charsetName.toLowerCase());
    localEncoding.e = ((Charset)???);
    return localEncoding;
  }
  
  public static Encoding getEncoding(Charset charset)
  {
    String str = charset.displayName();
    for (Object localObject2 : zc.a()) {
      if (str.equalsIgnoreCase(((zc)localObject2).T)) {
        return new Encoding(((zc)localObject2).S, ((zc)localObject2).T, ((zc)localObject2).U);
      }
    }
    ??? = new Encoding(0, str, str.toLowerCase());
    ((Encoding)???).e = charset;
    return (Encoding)???;
  }
  
  public String a()
  {
    return this.d;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public com.aspose.cells.b.a.g.za c()
  {
    return new com.aspose.cells.b.a.g.za(h());
  }
  
  CharsetDecoder d()
  {
    if (this.f == null) {
      this.f = h().newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }
    return this.f;
  }
  
  public zb e()
    throws Exception
  {
    return new zb(h());
  }
  
  CharsetEncoder f()
    throws Exception
  {
    if (this.g == null) {
      this.g = h().newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }
    return this.g;
  }
  
  public int a(int paramInt)
    throws Exception
  {
    return (int)(paramInt * f().maxBytesPerChar());
  }
  
  public byte[] g()
  {
    switch (this.b)
    {
    case 65001: 
      return new byte[] { -17, -69, -65 };
    case 1200: 
      return new byte[] { -1, -2 };
    case 1201: 
      return new byte[] { -2, -1 };
    }
    return new byte[0];
  }
  
  public byte[] a(String paramString)
  {
    ByteBuffer localByteBuffer = h().encode(paramString);
    return a(localByteBuffer);
  }
  
  public byte[] a(char[] paramArrayOfChar)
  {
    CharBuffer localCharBuffer = CharBuffer.wrap(paramArrayOfChar);
    ByteBuffer localByteBuffer = h().encode(localCharBuffer);
    return a(localByteBuffer);
  }
  
  public int b(String paramString)
  {
    byte[] arrayOfByte = a(paramString);
    if (arrayOfByte != null) {
      return arrayOfByte.length;
    }
    return 0;
  }
  
  private byte[] a(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte1 = paramByteBuffer.array();
    int i = paramByteBuffer.remaining();
    if (i == arrayOfByte1.length) {
      return arrayOfByte1;
    }
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    return arrayOfByte2;
  }
  
  public String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    com.aspose.cells.a.e.za.a(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt2 == 0) {
      return "";
    }
    try
    {
      CharBuffer localCharBuffer = d().decode(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
      return localCharBuffer.toString();
    }
    catch (Exception localException)
    {
      a(localException);
    }
    return "";
  }
  
  private void a(Exception paramException)
  {
    throw new IllegalStateException("Invalid encoding: " + paramException.getMessage(), paramException);
  }
  
  public String a(byte[] paramArrayOfByte)
  {
    try
    {
      CharBuffer localCharBuffer = d().decode(ByteBuffer.wrap(paramArrayOfByte));
      return localCharBuffer.toString();
    }
    catch (Exception localException)
    {
      a(localException);
    }
    return "";
  }
  
  public Charset h()
  {
    if (this.e != null) {
      return this.e;
    }
    try
    {
      this.e = Charset.forName(this.c);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new IllegalStateException(localIllegalArgumentException);
    }
    return this.e;
  }
  
  public boolean equals(Object o)
  {
    return ((o instanceof Encoding)) && (equals((Encoding)o));
  }
  
  public boolean equals(Encoding other)
  {
    return this.c.equalsIgnoreCase(other.c);
  }
  
  public int i()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Encoding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */