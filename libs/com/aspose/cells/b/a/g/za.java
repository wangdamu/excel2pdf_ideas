package com.aspose.cells.b.a.g;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class za
{
  private CharsetDecoder b;
  private int c = 0;
  private byte[] d;
  
  public za(Charset paramCharset)
  {
    this.b = paramCharset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
    throws CharacterCodingException
  {
    if ((paramArrayOfChar == null) || (paramArrayOfByte == null)) {
      throw new NullPointerException(paramArrayOfChar == null ? "chars" : "bytes");
    }
    if ((paramInt2 < 0) || (paramInt3 < 0)) {
      throw new IndexOutOfBoundsException(paramInt2 < 0 ? "byteCount" : "charIndex");
    }
    if ((paramInt3 > paramArrayOfChar.length) || (paramInt2 < 0) || (paramInt2 > paramArrayOfByte.length + paramInt1)) {
      throw new IndexOutOfBoundsException(paramInt3 > paramArrayOfChar.length ? "charIndex" : "byteCount");
    }
    int i = paramArrayOfChar.length - paramInt3;
    CharBuffer localCharBuffer = CharBuffer.wrap(paramArrayOfChar, paramInt3, i);
    ByteBuffer localByteBuffer;
    if (this.c > 0)
    {
      localByteBuffer = ByteBuffer.allocate(this.c + paramInt2 - paramInt1);
      localByteBuffer.put(this.d);
      localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
      localByteBuffer.rewind();
      this.d = null;
    }
    else
    {
      localByteBuffer = ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2);
    }
    CoderResult localCoderResult = this.b.decode(localByteBuffer, localCharBuffer, false);
    this.c = localByteBuffer.remaining();
    if (this.c > 0)
    {
      this.d = new byte[this.c];
      localByteBuffer.get(this.d);
    }
    if (localCoderResult.isError())
    {
      j = localCoderResult.length();
      this.d = new byte[j];
      localByteBuffer.position(localByteBuffer.position() - j);
      localByteBuffer.get(this.d);
      this.c = j;
    }
    if (localCoderResult.isOverflow()) {
      throw new IllegalArgumentException("Decode Overflow: insufficient space in the 'chars' array.");
    }
    int j = i - localCharBuffer.remaining();
    return j;
  }
  
  public int a(int paramInt)
  {
    if ((!a) && (paramInt < 0)) {
      throw new AssertionError();
    }
    return (int)(this.b.maxCharsPerByte() * paramInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */