package com.aspose.cells.a.c;

class za
{
  private final byte[] a = new byte[64];
  private int b;
  private long c;
  private int[] d = new int[4];
  private int[] e = new int[16];
  
  za()
  {
    a();
  }
  
  public void a()
  {
    this.b = 0;
    this.c = 0L;
    this.d[0] = 1732584193;
    this.d[1] = -271733879;
    this.d[2] = -1732584194;
    this.d[3] = 271733878;
  }
  
  public byte[] b()
  {
    byte[] arrayOfByte = new byte[16];
    b(arrayOfByte, 0, 16);
    return arrayOfByte;
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        paramArrayOfByte[(paramInt + (i * 4 + j))] = ((byte)(this.d[i] >>> 8 * j));
      }
    }
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a[(this.b++)] = Byte.MIN_VALUE;
    int i = 8;
    int j = 64 - i;
    if (this.b > j)
    {
      while (this.b < 64) {
        this.a[(this.b++)] = 0;
      }
      b(this.a, 0);
      this.b = 0;
    }
    while (this.b < j) {
      this.a[(this.b++)] = 0;
    }
    long l = this.c * 8L;
    for (int k = 0; k < 64; k += 8) {
      this.a[(this.b++)] = ((byte)(int)(l >>> k));
    }
    b(this.a, 0);
    a(paramArrayOfByte, paramInt1);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.c += paramInt2;
    int i;
    while (paramInt2 >= (i = 64 - this.b))
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.b, i);
      b(this.a, 0);
      paramInt2 -= i;
      paramInt1 += i;
      this.b = 0;
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.b, paramInt2);
    this.b += paramInt2;
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt)
  {
    for (int i = 0; i < 16; i++) {
      this.e[i] = (paramArrayOfByte[(paramInt++)] & 0xFF | (paramArrayOfByte[(paramInt++)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt++)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt++)] & 0xFF) << 24);
    }
    i = this.d[0];
    int j = this.d[1];
    int k = this.d[2];
    int m = this.d[3];
    i = a(i, j, k, m, this.e[0], 3);
    m = a(m, i, j, k, this.e[1], 7);
    k = a(k, m, i, j, this.e[2], 11);
    j = a(j, k, m, i, this.e[3], 19);
    i = a(i, j, k, m, this.e[4], 3);
    m = a(m, i, j, k, this.e[5], 7);
    k = a(k, m, i, j, this.e[6], 11);
    j = a(j, k, m, i, this.e[7], 19);
    i = a(i, j, k, m, this.e[8], 3);
    m = a(m, i, j, k, this.e[9], 7);
    k = a(k, m, i, j, this.e[10], 11);
    j = a(j, k, m, i, this.e[11], 19);
    i = a(i, j, k, m, this.e[12], 3);
    m = a(m, i, j, k, this.e[13], 7);
    k = a(k, m, i, j, this.e[14], 11);
    j = a(j, k, m, i, this.e[15], 19);
    i = b(i, j, k, m, this.e[0], 3);
    m = b(m, i, j, k, this.e[4], 5);
    k = b(k, m, i, j, this.e[8], 9);
    j = b(j, k, m, i, this.e[12], 13);
    i = b(i, j, k, m, this.e[1], 3);
    m = b(m, i, j, k, this.e[5], 5);
    k = b(k, m, i, j, this.e[9], 9);
    j = b(j, k, m, i, this.e[13], 13);
    i = b(i, j, k, m, this.e[2], 3);
    m = b(m, i, j, k, this.e[6], 5);
    k = b(k, m, i, j, this.e[10], 9);
    j = b(j, k, m, i, this.e[14], 13);
    i = b(i, j, k, m, this.e[3], 3);
    m = b(m, i, j, k, this.e[7], 5);
    k = b(k, m, i, j, this.e[11], 9);
    j = b(j, k, m, i, this.e[15], 13);
    i = c(i, j, k, m, this.e[0], 3);
    m = c(m, i, j, k, this.e[8], 9);
    k = c(k, m, i, j, this.e[4], 11);
    j = c(j, k, m, i, this.e[12], 15);
    i = c(i, j, k, m, this.e[2], 3);
    m = c(m, i, j, k, this.e[10], 9);
    k = c(k, m, i, j, this.e[6], 11);
    j = c(j, k, m, i, this.e[14], 15);
    i = c(i, j, k, m, this.e[1], 3);
    m = c(m, i, j, k, this.e[9], 9);
    k = c(k, m, i, j, this.e[5], 11);
    j = c(j, k, m, i, this.e[13], 15);
    i = c(i, j, k, m, this.e[3], 3);
    m = c(m, i, j, k, this.e[11], 9);
    k = c(k, m, i, j, this.e[7], 11);
    j = c(j, k, m, i, this.e[15], 15);
    this.d[0] += i;
    this.d[1] += j;
    this.d[2] += k;
    this.d[3] += m;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i = paramInt1 + (paramInt2 & paramInt3 | (paramInt2 ^ 0xFFFFFFFF) & paramInt4) + paramInt5;
    return i << paramInt6 | i >>> 32 - paramInt6;
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i = paramInt1 + (paramInt2 & (paramInt3 | paramInt4) | paramInt3 & paramInt4) + paramInt5 + 1518500249;
    return i << paramInt6 | i >>> 32 - paramInt6;
  }
  
  private int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i = paramInt1 + (paramInt2 ^ paramInt3 ^ paramInt4) + paramInt5 + 1859775393;
    return i << paramInt6 | i >>> 32 - paramInt6;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */