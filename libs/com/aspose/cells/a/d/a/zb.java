package com.aspose.cells.a.d.a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.io.DataOutput;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UTFDataFormatException;

public class zb
  extends FilterOutputStream
  implements DataOutput
{
  protected boolean a;
  protected int b;
  private int c;
  private int d;
  
  public zb(OutputStream paramOutputStream, boolean paramBoolean)
  {
    super(paramOutputStream);
    this.a = paramBoolean;
    this.b = 0;
    this.c = 0;
    this.d = 0;
  }
  
  public void c()
    throws IOException
  {
    d();
    if ((this.out instanceof zb)) {
      ((zb)this.out).c();
    }
  }
  
  public void close()
    throws IOException
  {
    c();
    super.close();
  }
  
  protected void d()
    throws IOException
  {
    if (this.d == 0) {
      return;
    }
    write(this.c);
    this.c = 0;
    this.d = 0;
  }
  
  public void e()
    throws IOException
  {
    d();
  }
  
  public synchronized void write(int b)
    throws IOException
  {
    super.write(b);
    this.b += 1;
  }
  
  public void writeBoolean(boolean b)
    throws IOException
  {
    if (b) {
      write(1);
    } else {
      write(0);
    }
  }
  
  public void writeChar(int c)
    throws IOException
  {
    if (this.a)
    {
      write(c & 0xFF);
      write(c >>> 8 & 0xFF);
    }
    else
    {
      write(c >>> 8 & 0xFF);
      write(c & 0xFF);
    }
  }
  
  public void writeByte(int b)
    throws IOException
  {
    e();
    write(b);
  }
  
  public void a(byte[] paramArrayOfByte)
    throws IOException
  {
    e();
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      write(paramArrayOfByte[i]);
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    e();
    paramInt2 += paramInt1;
    while (paramInt1 < paramInt2)
    {
      write(paramArrayOfByte[paramInt1]);
      paramInt1++;
    }
  }
  
  public void a(int[] paramArrayOfInt)
    throws IOException
  {
    e();
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      write(paramArrayOfInt[i]);
    }
  }
  
  public void writeShort(int s)
    throws IOException
  {
    e();
    if (this.a)
    {
      write(s & 0xFF);
      write(s >>> 8 & 0xFF);
    }
    else
    {
      write(s >>> 8 & 0xFF);
      write(s & 0xFF);
    }
  }
  
  public void a(int paramInt)
    throws IOException
  {
    e();
    if (this.a)
    {
      write(paramInt & 0xFF);
      write(paramInt >>> 8 & 0xFF);
    }
    else
    {
      write(paramInt >>> 8 & 0xFF);
      write(paramInt & 0xFF);
    }
  }
  
  public void writeInt(int i)
    throws IOException
  {
    if (this.a)
    {
      write(i & 0xFF);
      write(i >>> 8 & 0xFF);
      write(i >>> 16 & 0xFF);
      write(i >>> 24 & 0xFF);
    }
    else
    {
      write(i >>> 24 & 0xFF);
      write(i >>> 16 & 0xFF);
      write(i >>> 8 & 0xFF);
      write(i & 0xFF);
    }
  }
  
  public void a(long paramLong)
    throws IOException
  {
    if (this.a)
    {
      write((int)(paramLong & 0xFF));
      write((int)(paramLong >>> 8 & 0xFF));
      write((int)(paramLong >>> 16 & 0xFF));
      write((int)(paramLong >>> 24 & 0xFF));
    }
    else
    {
      write((int)(paramLong >>> 24 & 0xFF));
      write((int)(paramLong >>> 16 & 0xFF));
      write((int)(paramLong >>> 8 & 0xFF));
      write((int)(paramLong & 0xFF));
    }
  }
  
  public void writeLong(long l)
    throws IOException
  {
    if (this.a)
    {
      write((int)(l & 0xFF));
      write((int)(l >>> 8 & 0xFF));
      write((int)(l >>> 16 & 0xFF));
      write((int)(l >>> 24 & 0xFF));
      write((int)(l >>> 32 & 0xFF));
      write((int)(l >>> 40 & 0xFF));
      write((int)(l >>> 48 & 0xFF));
      write((int)(l >>> 56 & 0xFF));
    }
    else
    {
      write((int)(l >>> 56 & 0xFF));
      write((int)(l >>> 48 & 0xFF));
      write((int)(l >>> 40 & 0xFF));
      write((int)(l >>> 32 & 0xFF));
      write((int)(l >>> 24 & 0xFF));
      write((int)(l >>> 16 & 0xFF));
      write((int)(l >>> 8 & 0xFF));
      write((int)(l & 0xFF));
    }
  }
  
  public void writeFloat(float f)
    throws IOException
  {
    writeInt(Float.floatToIntBits(f));
  }
  
  public void writeDouble(double d)
    throws IOException
  {
    writeLong(Double.doubleToLongBits(d));
  }
  
  public void writeBytes(String s)
    throws IOException
  {
    for (int i = 0; i < s.length(); i++) {
      writeByte(s.charAt(i));
    }
  }
  
  public void writeChars(String s)
    throws IOException
  {
    for (int i = 0; i < s.length(); i++) {
      writeChar(s.charAt(i));
    }
  }
  
  public void writeUTF(String s)
    throws IOException
  {
    a(s, this);
  }
  
  public static void a(String paramString, DataOutput paramDataOutput)
    throws IOException
  {
    int i = paramString.length();
    int j = 0;
    char[] arrayOfChar = new char[i];
    int m = 0;
    paramString.getChars(0, i, arrayOfChar, 0);
    int k;
    for (int n = 0; n < i; n++)
    {
      k = arrayOfChar[n];
      if ((k >= 1) && (k <= 127)) {
        j++;
      } else if (k > 2047) {
        j += 3;
      } else {
        j += 2;
      }
    }
    if (j > 65535) {
      throw new UTFDataFormatException();
    }
    byte[] arrayOfByte = new byte[j + 2];
    arrayOfByte[(m++)] = ((byte)(j >>> 8 & 0xFF));
    arrayOfByte[(m++)] = ((byte)(j >>> 0 & 0xFF));
    for (int i1 = 0; i1 < i; i1++)
    {
      k = arrayOfChar[i1];
      if ((k >= 1) && (k <= 127))
      {
        arrayOfByte[(m++)] = ((byte)k);
      }
      else if (k > 2047)
      {
        arrayOfByte[(m++)] = ((byte)(0xE0 | k >> 12 & 0xF));
        arrayOfByte[(m++)] = ((byte)(0x80 | k >> 6 & 0x3F));
        arrayOfByte[(m++)] = ((byte)(0x80 | k >> 0 & 0x3F));
      }
      else
      {
        arrayOfByte[(m++)] = ((byte)(0xC0 | k >> 6 & 0x1F));
        arrayOfByte[(m++)] = ((byte)(0x80 | k >> 0 & 0x3F));
      }
    }
    paramDataOutput.write(arrayOfByte);
  }
  
  public void b(int paramInt)
    throws IOException
  {
    a(paramInt);
  }
  
  public void c(int paramInt)
    throws IOException
  {
    a(paramInt);
  }
  
  public void a(float paramFloat)
    throws IOException
  {
    writeFloat(paramFloat);
  }
  
  public void a(Color paramColor)
    throws IOException
  {
    writeByte(paramColor.getRed());
    writeByte(paramColor.getGreen());
    writeByte(paramColor.getBlue());
    writeByte(0);
  }
  
  public void b(Color paramColor)
    throws IOException
  {
    writeShort(paramColor.getRed() << 8);
    writeShort(paramColor.getGreen() << 8);
    writeShort(paramColor.getBlue() << 8);
    writeShort(paramColor.getAlpha() << 8);
  }
  
  public void a(AffineTransform paramAffineTransform)
    throws IOException
  {
    a((float)paramAffineTransform.getScaleX());
    a((float)paramAffineTransform.getShearY());
    a((float)paramAffineTransform.getShearX());
    a((float)paramAffineTransform.getScaleY());
    a((float)paramAffineTransform.getTranslateX());
    a((float)paramAffineTransform.getTranslateY());
  }
  
  public void a(Point[] paramArrayOfPoint)
    throws IOException
  {
    a(paramArrayOfPoint.length, paramArrayOfPoint);
  }
  
  public void a(int paramInt, Point[] paramArrayOfPoint)
    throws IOException
  {
    for (int i = 0; i < paramInt; i++) {
      a(paramArrayOfPoint[i]);
    }
  }
  
  public void a(Point paramPoint)
    throws IOException
  {
    a((short)paramPoint.x);
    a((short)paramPoint.y);
  }
  
  public void b(Point[] paramArrayOfPoint)
    throws IOException
  {
    b(paramArrayOfPoint.length, paramArrayOfPoint);
  }
  
  public void b(int paramInt, Point[] paramArrayOfPoint)
    throws IOException
  {
    for (int i = 0; i < paramInt; i++) {
      b(paramArrayOfPoint[i]);
    }
  }
  
  public void b(Point paramPoint)
    throws IOException
  {
    f(paramPoint.x);
    f(paramPoint.y);
  }
  
  public void a(Rectangle paramRectangle)
    throws IOException
  {
    f(paramRectangle.x);
    f(paramRectangle.y);
    f(paramRectangle.x + paramRectangle.width);
    f(paramRectangle.y + paramRectangle.height);
  }
  
  public void a(Rectangle2D paramRectangle2D)
    throws IOException
  {
    a((float)paramRectangle2D.getX());
    a((float)paramRectangle2D.getY());
    a((float)paramRectangle2D.getWidth());
    a((float)paramRectangle2D.getHeight());
  }
  
  public void a(Dimension paramDimension)
    throws IOException
  {
    f(paramDimension.width);
    f(paramDimension.height);
  }
  
  public void d(int paramInt)
    throws IOException
  {
    a(paramInt);
  }
  
  public void e(int paramInt)
    throws IOException
  {
    a(paramInt);
  }
  
  public void f(int paramInt)
    throws IOException
  {
    writeInt(paramInt);
  }
  
  public void a(short paramShort)
    throws IOException
  {
    writeShort(paramShort);
  }
  
  public void b(byte[] paramArrayOfByte)
    throws IOException
  {
    a(paramArrayOfByte);
  }
  
  public void g(int paramInt)
    throws IOException
  {
    writeByte(paramInt);
  }
  
  public void b(boolean paramBoolean)
    throws IOException
  {
    g(paramBoolean ? 1 : 0);
  }
  
  public void c(boolean paramBoolean)
    throws IOException
  {
    b(paramBoolean ? 1 : 0);
  }
  
  public void a(String paramString)
    throws IOException
  {
    a(paramString.getBytes("UTF-16LE"));
  }
  
  public void a(String paramString, int paramInt)
    throws IOException
  {
    a(paramString);
    for (int i = paramInt - paramString.length(); i > 0; i--) {
      c(0);
    }
  }
  
  protected int f()
  {
    return 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */