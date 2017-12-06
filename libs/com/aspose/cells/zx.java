package com.aspose.cells;

abstract class zx
  implements zail
{
  int a;
  
  protected abstract Object[] a();
  
  protected abstract void a(Object[] paramArrayOfObject);
  
  protected abstract Object[] a(int paramInt);
  
  public int b()
  {
    return this.a;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a < 1) {
      return -1;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    } else if (paramInt2 >= this.a) {
      return -this.a - 1;
    }
    if (paramInt3 < 0) {
      paramInt3 = this.a - 1;
    }
    return zld.a(this, paramInt1, paramInt2, paramInt3);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 < 0)
    {
      paramInt1++;
      if (this.a > paramInt1) {
        System.arraycopy(a(), paramInt1, a(), paramInt1 + paramInt2, this.a - paramInt1);
      }
      this.a += paramInt2;
    }
    else
    {
      this.a -= paramInt2;
      if (this.a > paramInt1) {
        System.arraycopy(a(), paramInt1 + paramInt2, a(), paramInt1, this.a - paramInt1);
      }
    }
  }
  
  public int b(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 < 0)
    {
      paramInt2 = this.a;
    }
    else
    {
      paramInt2++;
      if (this.a > paramInt2) {
        System.arraycopy(a(), paramInt2, a(), paramInt1, this.a - paramInt2);
      }
    }
    paramInt2 -= paramInt1;
    this.a -= paramInt2;
    return paramInt2;
  }
  
  public int c(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 < 0) {
      paramInt2 = this.a;
    } else {
      paramInt2++;
    }
    return paramInt2 - paramInt1;
  }
  
  public void b(int paramInt)
  {
    this.a = 0;
    if ((paramInt > -1) && (paramInt < a().length)) {
      a(a(paramInt));
    }
  }
  
  public boolean d(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject1 = a();
    if (paramInt1 < -1) {
      paramInt1 = (int)(arrayOfObject1.length / 100.0F * (-paramInt1 - 1));
    } else if (paramInt1 < 0) {
      return false;
    }
    if (arrayOfObject1.length <= this.a + paramInt1) {
      return false;
    }
    if (paramInt2 < 0) {
      return false;
    }
    paramInt2 += this.a;
    if (arrayOfObject1.length <= paramInt2) {
      return false;
    }
    Object[] arrayOfObject2 = a(paramInt2);
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, this.a);
    a(arrayOfObject2);
    return true;
  }
  
  public int a(int paramInt, Object paramObject)
  {
    if (paramInt < 0) {
      paramInt = this.a;
    }
    Object localObject = a();
    if (this.a == localObject.length)
    {
      Object[] arrayOfObject = a(this.a > 0 ? this.a << 1 : 16);
      if (paramInt > 0) {
        System.arraycopy(localObject, 0, arrayOfObject, 0, paramInt);
      }
      if (paramInt < this.a) {
        System.arraycopy(localObject, paramInt, arrayOfObject, paramInt + 1, this.a - paramInt);
      }
      a(arrayOfObject);
      localObject = arrayOfObject;
    }
    else if (paramInt < this.a)
    {
      System.arraycopy(localObject, paramInt, localObject, paramInt + 1, this.a - paramInt);
    }
    localObject[paramInt] = paramObject;
    this.a += 1;
    return paramInt;
  }
  
  public int a(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 0) {
      paramInt1 = this.a;
    }
    Object localObject = a();
    if (this.a + paramInt3 > localObject.length)
    {
      Object[] arrayOfObject = a(Math.max(this.a + paramInt3, localObject.length << 1));
      if (paramInt1 > 0) {
        System.arraycopy(localObject, 0, arrayOfObject, 0, paramInt1);
      }
      if (paramInt1 < this.a) {
        System.arraycopy(localObject, paramInt1, arrayOfObject, paramInt1 + paramInt3, this.a - paramInt1);
      }
      a(arrayOfObject);
      localObject = arrayOfObject;
    }
    else if (paramInt1 < this.a)
    {
      System.arraycopy(localObject, paramInt1, localObject, paramInt1 + paramInt3, this.a - paramInt1);
    }
    System.arraycopy(paramArrayOfObject, paramInt2, localObject, paramInt1, paramInt3);
    this.a += paramInt3;
    return paramInt1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */