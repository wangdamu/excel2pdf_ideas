package com.aspose.cells.b.a.g;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class zb
{
  private Charset b;
  private CharsetEncoder c = null;
  
  public zb(Charset paramCharset)
  {
    this.b = paramCharset;
    this.c = this.b.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
  }
  
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, boolean paramBoolean)
    throws Exception
  {
    if (paramArrayOfChar == null) {
      throw new NullPointerException("chars");
    }
    if (paramArrayOfByte == null) {
      throw new NullPointerException("bytes");
    }
    if ((paramInt2 < 0) || (paramInt1 < 0) || (paramInt1 + paramInt2 > paramArrayOfChar.length)) {
      throw new IndexOutOfBoundsException("charIndex, charCount");
    }
    if ((paramInt3 < 0) || (paramInt3 > paramArrayOfByte.length)) {
      throw new IndexOutOfBoundsException("byteIndex");
    }
    if ((!a) && (paramInt2 * this.c.maxBytesPerChar() > paramArrayOfByte.length - paramInt3)) {
      throw new AssertionError();
    }
    CharBuffer localCharBuffer = CharBuffer.wrap(paramArrayOfChar, paramInt1, paramInt2);
    int i = paramArrayOfByte.length - paramInt3;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte, paramInt3, i);
    CoderResult localCoderResult = this.c.encode(localCharBuffer, localByteBuffer, false);
    if (localCoderResult.isOverflow())
    {
      this.c.encode(localCharBuffer, localByteBuffer, true);
      localCoderResult = this.c.flush(localByteBuffer);
    }
    if (localCoderResult.isOverflow()) {
      throw new IllegalArgumentException("Encode Overflow: insufficient space in the 'bytes' array.");
    }
    int j = i - localByteBuffer.remaining();
    return j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */