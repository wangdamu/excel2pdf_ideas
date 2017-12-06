package com.aspose.cells.b.a;

import com.aspose.cells.b.a.c.za;
import java.util.UUID;

public final class zh
  implements Comparable<zh>
{
  public static final zh a = new zh();
  private int b;
  private short c;
  private short d;
  private byte e;
  private byte f;
  private byte g;
  private byte h;
  private byte i;
  private byte j;
  private byte k;
  private byte l;
  
  public String a(String paramString, za paramza)
  {
    return a(paramString);
  }
  
  public zh(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("b");
    }
    if (paramArrayOfByte.length != 16) {
      throw new IllegalArgumentException("Guid array ctor: b length should be 16.");
    }
    this.b = (paramArrayOfByte[3] << 24 | (paramArrayOfByte[2] & 0xFF) << 16 | (paramArrayOfByte[1] & 0xFF) << 8 | paramArrayOfByte[0] & 0xFF);
    this.c = ((short)(paramArrayOfByte[5] << 8 | paramArrayOfByte[4] & 0xFF));
    this.d = ((short)(paramArrayOfByte[7] << 8 | paramArrayOfByte[6] & 0xFF));
    this.e = paramArrayOfByte[8];
    this.f = paramArrayOfByte[9];
    this.g = paramArrayOfByte[10];
    this.h = paramArrayOfByte[11];
    this.i = paramArrayOfByte[12];
    this.j = paramArrayOfByte[13];
    this.k = paramArrayOfByte[14];
    this.l = paramArrayOfByte[15];
  }
  
  public zh()
  {
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = 0;
    this.h = 0;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    this.l = 0;
  }
  
  public static zh a(UUID paramUUID)
  {
    long l1 = paramUUID.getMostSignificantBits();
    long l2 = paramUUID.getLeastSignificantBits();
    return new zh(l1, l2);
  }
  
  public zh(long paramLong1, long paramLong2)
  {
    this.b = ((int)(paramLong1 >> 32));
    this.c = ((short)(int)(paramLong1 >> 16));
    this.d = ((short)(int)paramLong1);
    this.e = ((byte)(int)(paramLong2 >> 56));
    this.f = ((byte)(int)(paramLong2 >> 48));
    this.g = ((byte)(int)(paramLong2 >> 40));
    this.h = ((byte)(int)(paramLong2 >> 32));
    this.i = ((byte)(int)(paramLong2 >> 24));
    this.j = ((byte)(int)(paramLong2 >> 16));
    this.k = ((byte)(int)(paramLong2 >> 8));
    this.l = ((byte)(int)paramLong2);
  }
  
  public zh(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("g");
    }
    int m = 0;
    int[] arrayOfInt = { 0 };
    try
    {
      if (paramString.indexOf('-', 0) >= 0)
      {
        String str = paramString.trim();
        if (str.charAt(0) == '{')
        {
          if ((str.length() != 38) || (str.charAt(37) != '}')) {
            throw new IllegalStateException("Wrong Guid format sting length: " + paramString);
          }
          m = 1;
        }
        else if (str.charAt(0) == '(')
        {
          if ((str.length() != 38) || (str.charAt(37) != ')')) {
            throw new IllegalStateException("Wrong Guid format sting length: " + paramString);
          }
          m = 1;
        }
        else if (str.length() != 36)
        {
          throw new IllegalStateException("Wrong Guid format sting length: " + paramString);
        }
        if ((str.charAt(8 + m) != '-') || (str.charAt(13 + m) != '-') || (str.charAt(18 + m) != '-') || (str.charAt(23 + m) != '-')) {
          throw new IllegalStateException("Wrong format: missed or misplaced dashes: " + paramString);
        }
        arrayOfInt[0] = m;
        this.b = a(str, arrayOfInt, 8);
        arrayOfInt[0] += 1;
        this.c = ((short)a(str, arrayOfInt, 4));
        arrayOfInt[0] += 1;
        this.d = ((short)a(str, arrayOfInt, 4));
        arrayOfInt[0] += 1;
        int n = a(str, arrayOfInt, 4);
        arrayOfInt[0] += 1;
        m = arrayOfInt[0];
        long l1 = zk.a(str, 16, 8192, arrayOfInt);
        if (arrayOfInt[0] - m != 12) {
          throw new IllegalStateException("Wrong Guid format sting length: " + paramString);
        }
        this.e = ((byte)(n >> 8));
        this.f = ((byte)n);
        n = (int)(l1 >> 32);
        this.g = ((byte)(n >> 8));
        this.h = ((byte)n);
        n = (int)l1;
        this.i = ((byte)(n >> 24));
        this.j = ((byte)(n >> 16));
        this.k = ((byte)(n >> 8));
        this.l = ((byte)n);
      }
      else
      {
        throw new IllegalStateException("Unsupported Guid Format: " + paramString);
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new IllegalStateException("Format_GuidUnrecognized");
    }
  }
  
  private static int a(String paramString, int[] paramArrayOfInt, int paramInt)
  {
    int m = paramArrayOfInt[0];
    int n = (int)zk.a(paramString, 16, 8192, paramArrayOfInt);
    if (paramArrayOfInt[0] - m != paramInt) {
      throw new IllegalStateException("Wrong Guid Format: Invalid Char: " + paramString);
    }
    return n;
  }
  
  public byte[] a()
  {
    byte[] arrayOfByte = new byte[16];
    arrayOfByte[0] = ((byte)this.b);
    arrayOfByte[1] = ((byte)(this.b >> 8));
    arrayOfByte[2] = ((byte)(this.b >> 16));
    arrayOfByte[3] = ((byte)(this.b >> 24));
    arrayOfByte[4] = ((byte)this.c);
    arrayOfByte[5] = ((byte)(this.c >> 8));
    arrayOfByte[6] = ((byte)this.d);
    arrayOfByte[7] = ((byte)(this.d >> 8));
    arrayOfByte[8] = this.e;
    arrayOfByte[9] = this.f;
    arrayOfByte[10] = this.g;
    arrayOfByte[11] = this.h;
    arrayOfByte[12] = this.i;
    arrayOfByte[13] = this.j;
    arrayOfByte[14] = this.k;
    arrayOfByte[15] = this.l;
    return arrayOfByte;
  }
  
  public String toString()
  {
    return a("D");
  }
  
  public int hashCode()
  {
    return this.b ^ ((this.c & 0xFFFF) << 16 | this.d & 0xFFFF) ^ ((this.g & 0xFF) << 24 | this.l & 0xFF);
  }
  
  public boolean equals(Object obj)
  {
    return ((obj instanceof zh)) && (a(this, (zh)obj));
  }
  
  public static boolean a(zh paramzh1, zh paramzh2)
  {
    if (paramzh1 == paramzh2) {
      return true;
    }
    if ((paramzh1 == null) || (paramzh2 == null)) {
      return false;
    }
    if (paramzh1.b != paramzh2.b) {
      return false;
    }
    if (paramzh1.c != paramzh2.c) {
      return false;
    }
    if (paramzh1.d != paramzh2.d) {
      return false;
    }
    if (paramzh1.e != paramzh2.e) {
      return false;
    }
    if (paramzh1.f != paramzh2.f) {
      return false;
    }
    if (paramzh1.g != paramzh2.g) {
      return false;
    }
    if (paramzh1.h != paramzh2.h) {
      return false;
    }
    if (paramzh1.i != paramzh2.i) {
      return false;
    }
    if (paramzh1.j != paramzh2.j) {
      return false;
    }
    if (paramzh1.k != paramzh2.k) {
      return false;
    }
    return paramzh1.l == paramzh2.l;
  }
  
  private int a(long paramLong1, long paramLong2)
  {
    if (paramLong1 < paramLong2) {
      return -1;
    }
    return 1;
  }
  
  public int a(zh paramzh)
  {
    if (paramzh == null) {
      return 1;
    }
    if (paramzh.b != this.b) {
      return a(this.b, paramzh.b);
    }
    if (paramzh.c != this.c) {
      return a(this.c, paramzh.c);
    }
    if (paramzh.d != this.d) {
      return a(this.d, paramzh.d);
    }
    if (paramzh.e != this.e) {
      return a(this.e, paramzh.e);
    }
    if (paramzh.f != this.f) {
      return a(this.f, paramzh.f);
    }
    if (paramzh.g != this.g) {
      return a(this.g, paramzh.g);
    }
    if (paramzh.h != this.h) {
      return a(this.h, paramzh.h);
    }
    if (paramzh.i != this.i) {
      return a(this.i, paramzh.i);
    }
    if (paramzh.j != this.j) {
      return a(this.j, paramzh.j);
    }
    if (paramzh.k != this.k) {
      return a(this.k, paramzh.k);
    }
    if (paramzh.l != this.l) {
      return a(this.l, paramzh.l);
    }
    return 0;
  }
  
  public static zh b()
  {
    return a(UUID.randomUUID());
  }
  
  private static char a(int paramInt)
  {
    paramInt &= 0xF;
    return (char)(paramInt > 9 ? paramInt - 10 + 97 : paramInt + 48);
  }
  
  private static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    paramArrayOfChar[(paramInt1++)] = a(paramInt2 >> 4);
    paramArrayOfChar[(paramInt1++)] = a(paramInt2);
    paramArrayOfChar[(paramInt1++)] = a(paramInt3 >> 4);
    paramArrayOfChar[(paramInt1++)] = a(paramInt3);
    return paramInt1;
  }
  
  public String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = "D";
    }
    int m = 0;
    int n = 38;
    int i1 = 1;
    if (paramString.length() != 1) {
      throw new IllegalStateException("Format_InvalidGuidFormatSpecification");
    }
    int i2 = paramString.charAt(0);
    char[] arrayOfChar;
    if ((i2 == 68) || (i2 == 100))
    {
      arrayOfChar = new char[36];
      n = 36;
    }
    else if ((i2 == 78) || (i2 == 110))
    {
      arrayOfChar = new char[32];
      n = 32;
      i1 = 0;
    }
    else if ((i2 == 66) || (i2 == 98))
    {
      arrayOfChar = new char[38];
      arrayOfChar[(m++)] = '{';
      arrayOfChar[37] = '}';
    }
    else if ((i2 == 80) || (i2 == 112))
    {
      arrayOfChar = new char[38];
      arrayOfChar[(m++)] = '(';
      arrayOfChar[37] = ')';
    }
    else
    {
      throw new IllegalStateException("Format_InvalidGuidFormatSpecification");
    }
    m = a(arrayOfChar, m, this.b >> 24, this.b >> 16);
    m = a(arrayOfChar, m, this.b >> 8, this.b);
    if (i1 != 0) {
      arrayOfChar[(m++)] = '-';
    }
    m = a(arrayOfChar, m, this.c >> 8, this.c);
    if (i1 != 0) {
      arrayOfChar[(m++)] = '-';
    }
    m = a(arrayOfChar, m, this.d >> 8, this.d);
    if (i1 != 0) {
      arrayOfChar[(m++)] = '-';
    }
    m = a(arrayOfChar, m, this.e, this.f);
    if (i1 != 0) {
      arrayOfChar[(m++)] = '-';
    }
    m = a(arrayOfChar, m, this.g, this.h);
    m = a(arrayOfChar, m, this.i, this.j);
    m = a(arrayOfChar, m, this.k, this.l);
    return new String(arrayOfChar, 0, n);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */