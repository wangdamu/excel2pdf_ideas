package com.aspose.cells;

class zbdt
  implements zajc
{
  private int a;
  
  zbdt(int paramInt)
  {
    this.a = paramInt;
  }
  
  public int a(int paramInt)
  {
    return this.a;
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return (paramInt2 - paramInt1 + 1) * this.a;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j;
    int k;
    if (paramArrayOfInt[2] < 0)
    {
      j = -paramArrayOfInt[2] - paramArrayOfInt[1];
      if (j <= 0)
      {
        paramArrayOfInt[2] = (-j);
        paramArrayOfInt[1] = 0;
        a(paramArrayOfInt);
        return;
      }
      if (this.a == 0)
      {
        paramArrayOfInt[0] = i;
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = this.a;
        return;
      }
      k = (j - 1) / this.a;
      if (i < k)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = this.a;
      }
      j -= k * this.a;
      paramArrayOfInt[0] = (i - k);
      paramArrayOfInt[1] = (this.a - j);
      paramArrayOfInt[2] = j;
    }
    else
    {
      j = paramArrayOfInt[1] + paramArrayOfInt[2];
      if (this.a == 0)
      {
        paramArrayOfInt[0] = (i - 1);
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-j);
        return;
      }
      k = (j - 1) / this.a;
      j -= k * this.a;
      paramArrayOfInt[0] = (i + k);
      paramArrayOfInt[1] = j;
      paramArrayOfInt[2] = (this.a - j);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */