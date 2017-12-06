package com.aspose.cells;

import com.aspose.cells.a.d.zcm;
import com.aspose.cells.b.a.b.zn;

final class zbo
{
  private static zbbi[] w = { new zbbi(0, 0, 21600, 21600) };
  public zn[] a;
  public int[] b;
  public zbgf[] c;
  public int[] d;
  public zbbi[] e;
  public int f;
  public int g;
  public zn[] h;
  public int[] i;
  static int[] j = { 0 };
  static int[] k = { 1400 };
  static int[] l = { 1800 };
  static int[] m = { 2500 };
  static int[] n = { 2700 };
  static int[] o = { 3600 };
  static int[] p = { 3700 };
  static int[] q = { 5400 };
  static int[] r = { 8100 };
  static int[] s = { 10800 };
  static int[] t = { 16200, 5400 };
  static int[] u = { 17694720, 0 };
  static zn[] v = { new zn(10800, 0), new zn(0, 10800), new zn(10800, 21600), new zn(21600, 10800) };
  
  zbo(zn[] paramArrayOfzn1, int[] paramArrayOfInt1, zbgf[] paramArrayOfzbgf, int[] paramArrayOfInt2, zbbi[] paramArrayOfzbbi, int paramInt1, int paramInt2, int paramInt3, int paramInt4, zn[] paramArrayOfzn2)
  {
    this(paramArrayOfzn1, paramArrayOfInt1, paramArrayOfzbgf, paramArrayOfInt2, paramArrayOfzbbi, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfzn2, null);
  }
  
  zbo(zn[] paramArrayOfzn1, int[] paramArrayOfInt1, zbgf[] paramArrayOfzbgf, int[] paramArrayOfInt2, zbbi[] paramArrayOfzbbi, int paramInt1, int paramInt2, int paramInt3, int paramInt4, zn[] paramArrayOfzn2, int[] paramArrayOfInt3)
  {
    this.a = paramArrayOfzn1;
    this.b = paramArrayOfInt1;
    this.c = paramArrayOfzbgf;
    this.d = paramArrayOfInt2;
    if (paramArrayOfzbbi == null) {
      paramArrayOfzbbi = w;
    }
    this.e = paramArrayOfzbbi;
    this.f = paramInt1;
    this.g = paramInt2;
    if (paramArrayOfzn2 != null) {
      this.h = paramArrayOfzn2;
    } else {
      this.h = v;
    }
    this.i = paramArrayOfInt3;
  }
  
  float a(short paramShort, int[] paramArrayOfInt, byte[] paramArrayOfByte)
  {
    if (this.c == null) {
      throw new IllegalStateException("Autoshape haven't calculation data");
    }
    int i1 = this.c[paramShort].a;
    int[] arrayOfInt = { this.c[paramShort].b, this.c[paramShort].c, this.c[paramShort].d };
    double[] arrayOfDouble = { this.c[paramShort].b, this.c[paramShort].c, this.c[paramShort].d };
    for (int i2 = 0; i2 < 3; i2++) {
      if ((i1 & 8192 << i2) != 0) {
        if ((arrayOfInt[i2] & 0x400) != 0) {
          arrayOfDouble[i2] = a((short)(arrayOfInt[i2] & 0xFF), paramArrayOfInt, paramArrayOfByte);
        } else {
          switch (arrayOfInt[i2])
          {
          case 327: 
          case 328: 
          case 329: 
          case 330: 
          case 331: 
          case 332: 
          case 333: 
          case 334: 
          case 335: 
          case 336: 
            try
            {
              arrayOfDouble[i2] = paramArrayOfInt[(arrayOfInt[i2] - 327)];
            }
            catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
          case 322: 
            arrayOfDouble[i2] = this.f;
            int tmp297_296 = 0;
            byte[] tmp297_295 = paramArrayOfByte;
            tmp297_295[tmp297_296] = ((byte)(tmp297_295[tmp297_296] | 0x2));
            break;
          case 323: 
            arrayOfDouble[i2] = this.g;
            int tmp318_317 = 0;
            byte[] tmp318_316 = paramArrayOfByte;
            tmp318_316[tmp318_317] = ((byte)(tmp318_316[tmp318_317] | 0x8));
            break;
          case 320: 
            arrayOfDouble[i2] = 0.0D;
            int tmp336_335 = 0;
            byte[] tmp336_334 = paramArrayOfByte;
            tmp336_334[tmp336_335] = ((byte)(tmp336_334[tmp336_335] | 0x1));
            break;
          case 321: 
            arrayOfDouble[i2] = 0.0D;
            int tmp353_352 = 0;
            byte[] tmp353_351 = paramArrayOfByte;
            tmp353_351[tmp353_352] = ((byte)(tmp353_351[tmp353_352] | 0x4));
            break;
          case 324: 
          case 325: 
          case 326: 
          default: 
            arrayOfDouble[i2] = 0.0D;
          }
        }
      }
    }
    switch (i1 & 0xFF)
    {
    case 0: 
      arrayOfDouble[0] += arrayOfDouble[1] - arrayOfDouble[2];
      break;
    case 1: 
      if (arrayOfDouble[1] != 0.0D) {
        arrayOfDouble[0] *= arrayOfDouble[1];
      }
      if (arrayOfDouble[2] != 0.0D) {
        arrayOfDouble[0] /= arrayOfDouble[2];
      }
      break;
    case 2: 
      arrayOfDouble[0] = ((arrayOfDouble[0] + arrayOfDouble[1]) / 2.0D);
      break;
    case 3: 
      arrayOfDouble[0] = Math.abs(arrayOfDouble[0]);
      break;
    case 4: 
      if (arrayOfDouble[0] > arrayOfDouble[1]) {
        arrayOfDouble[0] = arrayOfDouble[1];
      }
      break;
    case 5: 
      if (arrayOfDouble[0] < arrayOfDouble[1]) {
        arrayOfDouble[0] = arrayOfDouble[1];
      }
      break;
    case 6: 
      if (arrayOfDouble[0] > 0.0D) {
        arrayOfDouble[0] = arrayOfDouble[1];
      } else {
        arrayOfDouble[0] = arrayOfDouble[2];
      }
      break;
    case 7: 
      arrayOfDouble[0] = Math.sqrt(arrayOfDouble[0] * arrayOfDouble[0] + arrayOfDouble[1] * arrayOfDouble[1] + arrayOfDouble[2] * arrayOfDouble[2]);
      break;
    case 8: 
      arrayOfDouble[0] = (zcm.b(Math.atan2(arrayOfDouble[1], arrayOfDouble[0])) * 65536.0D);
      break;
    case 9: 
      arrayOfDouble[0] *= Math.sin(zcm.a(arrayOfDouble[1]) / 65536.0D);
      break;
    case 10: 
      arrayOfDouble[0] *= Math.cos(zcm.a(arrayOfDouble[1]) / 65536.0D);
      break;
    case 11: 
      arrayOfDouble[0] *= Math.cos(Math.atan2(arrayOfDouble[2], arrayOfDouble[1]));
      break;
    case 12: 
      arrayOfDouble[0] *= Math.sin(Math.atan2(arrayOfDouble[2], arrayOfDouble[1]));
      break;
    case 13: 
      arrayOfDouble[0] = Math.sqrt(arrayOfDouble[0]);
      break;
    case 14: 
      arrayOfDouble[0] += (arrayOfDouble[1] - arrayOfDouble[2]) * 65536.0D;
      break;
    case 15: 
      if (arrayOfDouble[1] != 0.0D)
      {
        arrayOfDouble[0] /= arrayOfDouble[1];
        arrayOfDouble[0] = (arrayOfDouble[2] * Math.sqrt(1.0D - arrayOfDouble[0] * arrayOfDouble[0]));
      }
      break;
    case 16: 
      arrayOfDouble[0] *= Math.tan(arrayOfDouble[1]);
      break;
    case 128: 
      if (arrayOfDouble[2] == 0.0D)
      {
        arrayOfDouble[0] = Math.sqrt(arrayOfDouble[0] * arrayOfDouble[0] + arrayOfDouble[1] * arrayOfDouble[1]);
      }
      else
      {
        if (arrayOfDouble[0] == 0.0D) {
          arrayOfDouble[0] = arrayOfDouble[1];
        }
        arrayOfDouble[0] = Math.sqrt(arrayOfDouble[2] * arrayOfDouble[2] - arrayOfDouble[0] * arrayOfDouble[0]);
      }
      break;
    case 129: 
      arrayOfDouble[2] *= 0.0017453292519943296D;
      arrayOfDouble[0] = (10800.0D + Math.cos(arrayOfDouble[2]) * (arrayOfDouble[0] - 10800.0D) + Math.sin(arrayOfDouble[2]) * (arrayOfDouble[1] - 10800.0D));
      break;
    case 130: 
      arrayOfDouble[2] *= 0.0017453292519943296D;
      arrayOfDouble[0] = (10800.0D - Math.sin(arrayOfDouble[2]) * (arrayOfDouble[0] - 10800.0D) + Math.cos(arrayOfDouble[2]) * (arrayOfDouble[1] - 10800.0D));
      break;
    }
    return (float)arrayOfDouble[0];
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */