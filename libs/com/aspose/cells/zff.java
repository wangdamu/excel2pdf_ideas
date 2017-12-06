package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zff
  extends zcd
{
  private ArrayList a;
  private int c = 0;
  
  zff()
  {
    c(90);
  }
  
  int a(zwn paramzwn, ArrayList paramArrayList)
  {
    if (!paramzwn.d()) {
      return 0;
    }
    int i = ((zwj)paramArrayList.get(0)).a;
    int j = ((zwj)paramArrayList.get(paramArrayList.size() - 1)).a;
    int k = j - i + 1;
    k *= 9;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zwj localzwj = (zwj)paramArrayList.get(m);
      if (localzwj.b() == 2)
      {
        k -= 9;
        String str = zs.a(localzwj.b);
        if (zct.b(str)) {
          k += 4 + str.length();
        } else {
          k += 4 + str.length() * 2;
        }
      }
    }
    k += 4;
    return k;
  }
  
  private zcd a(zcd paramzcd, int[] paramArrayOfInt)
  {
    paramzcd.a((short)paramArrayOfInt[0]);
    this.c -= paramArrayOfInt[0];
    paramArrayOfInt[0] = 0;
    znt localznt = new znt();
    byte[] arrayOfByte = null;
    if (this.c < 8224) {
      arrayOfByte = new byte[this.c];
    } else {
      arrayOfByte = new byte['†'];
    }
    localznt.b(arrayOfByte);
    zf.a(this.a, localznt);
    return localznt;
  }
  
  void a(zwn paramzwn)
  {
    ArrayList localArrayList = paramzwn.f();
    this.c = a(paramzwn, localArrayList);
    int k;
    Object localObject2;
    Object localObject4;
    if (this.c > 8224)
    {
      byte[] arrayOfByte1 = this.b = new byte['†'];
      Object localObject1 = this;
      this.a = new ArrayList();
      k = 4;
      this.b[0] = ((byte)paramzwn.b());
      this.b[1] = ((byte)paramzwn.e());
      System.arraycopy(zc.a(paramzwn.a()), 0, this.b, 2, 2);
      for (int m = 0; m < localArrayList.size(); m++)
      {
        localObject2 = (zwj)localArrayList.get(m);
        Object localObject3;
        if (((zwj)localObject2).b() == 2)
        {
          localObject3 = zs.a(((zwj)localObject2).b);
          localObject4 = zct.c((String)localObject3);
          if (k + 4 + localObject4.length > arrayOfByte1.length)
          {
            int[] arrayOfInt1 = { k };
            localObject1 = a((zcd)localObject1, arrayOfInt1);
            k = arrayOfInt1[0];
            arrayOfByte1 = ((zcd)localObject1).e();
          }
          arrayOfByte1[k] = 2;
          System.arraycopy(zc.a(((String)localObject3).length()), 0, arrayOfByte1, k + 1, 2);
          arrayOfByte1[(k + 3)] = 0;
          if (localObject4 == null) {
            continue;
          }
          k += 3;
          int i1 = 0;
          int i2 = arrayOfByte1.length - k;
          int i3 = localObject4.length - i1 + 1;
          int i4 = localObject4.length == ((String)localObject3).length() ? 1 : 0;
          if (i2 >= i3)
          {
            arrayOfByte1[k] = ((byte)(i4 != 0 ? 0 : 1));
            k++;
            System.arraycopy(localObject4, 0, arrayOfByte1, k, localObject4.length);
            k += localObject4.length;
            continue;
          }
          int i5 = 1;
          for (;;)
          {
            if (i2 < i3)
            {
              if (i5 != 0)
              {
                arrayOfByte1[k] = ((byte)(i4 != 0 ? 0 : 1));
                k++;
                i2--;
                if ((i4 != 0) && (i2 % 2 != 0)) {
                  i2--;
                }
                i5 = 0;
              }
              System.arraycopy(localObject4, i1, arrayOfByte1, k, i2);
              i1 += i2;
              k += i2;
            }
            else
            {
              System.arraycopy(localObject4, i1, arrayOfByte1, k, i3);
              i1 += i3;
              k += i3;
              break;
            }
            int[] arrayOfInt2 = { k };
            localObject1 = a((zcd)localObject1, arrayOfInt2);
            k = arrayOfInt2[0];
            arrayOfByte1 = ((zcd)localObject1).e();
            k = 0;
            i2 = arrayOfByte1.length - k;
            i3 = localObject4.length - i1;
          }
        }
        else if (k + 9 > arrayOfByte1.length)
        {
          localObject3 = new int[] { k };
          localObject1 = a((zcd)localObject1, (int[])localObject3);
          k = localObject3[0];
          arrayOfByte1 = ((zcd)localObject1).e();
        }
        if (((zwj)localObject2).b == null) {
          k += 9;
        } else {
          switch (((zwj)localObject2).b())
          {
          case 0: 
            k += 9;
            break;
          case 3: 
            this.b[k] = 16;
            a(((zwj)localObject2).d(), this.b, k);
            k += 9;
            break;
          case 1: 
            arrayOfByte1[k] = 1;
            System.arraycopy(zc.a(((zwj)localObject2).c()), 0, arrayOfByte1, k + 1, 8);
            k += 9;
            break;
          case 4: 
            arrayOfByte1[k] = 4;
            if (((zwj)localObject2).e()) {
              arrayOfByte1[(k + 1)] = 1;
            }
            k += 9;
            break;
          case 2: 
          default: 
            if ((((zwj)localObject2).b instanceof zuf))
            {
              arrayOfByte1[k] = 16;
              a((zuf)((zwj)localObject2).b, arrayOfByte1, k);
              k += 9;
            }
            break;
          }
        }
      }
    }
    else
    {
      a((short)this.c);
      this.b = new byte[this.c];
      int i = 4;
      this.b[0] = ((byte)paramzwn.b());
      this.b[1] = ((byte)paramzwn.e());
      int j = (this.b[1] & 0xFF) - 1;
      System.arraycopy(zc.a(paramzwn.a()), 0, this.b, 2, 2);
      for (k = 0; k < localArrayList.size(); k++)
      {
        zwj localzwj = (zwj)localArrayList.get(k);
        if (j + 1 != localzwj.a) {
          i += (localzwj.a - j - 1) * 9;
        }
        j = localzwj.a;
        if (localzwj.b == null) {
          i += 9;
        } else {
          switch (localzwj.b())
          {
          case 0: 
            i += 9;
            break;
          case 3: 
            this.b[i] = 16;
            a(localzwj.d(), this.b, i);
            i += 9;
            break;
          case 1: 
            this.b[i] = 1;
            System.arraycopy(zc.a(localzwj.c()), 0, this.b, i + 1, 8);
            i += 9;
            break;
          case 4: 
            this.b[i] = 4;
            if (localzwj.e()) {
              this.b[(i + 1)] = 1;
            }
            i += 9;
            break;
          case 2: 
          default: 
            localObject2 = zs.a(localzwj.b);
            int n = 0;
            localObject4 = new boolean[] { n };
            zuf localzuf = ztr.a((String)localObject2, (boolean[])localObject4);
            n = localObject4[0];
            if ((n != 0) && (localzuf != zuf.h))
            {
              this.b[i] = 16;
              a(localzuf, this.b, i);
              i += 9;
            }
            else
            {
              this.b[i] = 2;
              byte[] arrayOfByte2 = zct.c((String)localObject2);
              if (arrayOfByte2 == null)
              {
                this.b[(i + 3)] = 0;
                i += 4;
              }
              else
              {
                if (arrayOfByte2.length == ((String)localObject2).length())
                {
                  System.arraycopy(zc.a(((String)localObject2).length()), 0, this.b, i + 1, 2);
                  this.b[(i + 3)] = 0;
                  System.arraycopy(arrayOfByte2, 0, this.b, i + 4, arrayOfByte2.length);
                }
                else
                {
                  System.arraycopy(zc.a(((String)localObject2).length()), 0, this.b, i + 1, 2);
                  this.b[(i + 3)] = 1;
                  System.arraycopy(arrayOfByte2, 0, this.b, i + 4, arrayOfByte2.length);
                }
                i += 4 + arrayOfByte2.length;
              }
            }
            break;
          }
        }
      }
    }
  }
  
  private void a(zuf paramzuf, byte[] paramArrayOfByte, int paramInt)
  {
    switch (zfg.a[paramzuf.ordinal()])
    {
    case 1: 
      this.b[(paramInt + 1)] = 7;
      break;
    case 2: 
      this.b[(paramInt + 1)] = 42;
      break;
    case 3: 
      this.b[(paramInt + 1)] = 29;
      break;
    case 4: 
      this.b[(paramInt + 1)] = 0;
      break;
    case 5: 
      this.b[(paramInt + 1)] = 36;
      break;
    case 6: 
      this.b[(paramInt + 1)] = 23;
      break;
    case 7: 
      this.b[(paramInt + 1)] = 15;
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    paramzrg.a(f());
    paramzrg.a(d());
    paramzrg.a(this.b, 0, d());
    if (this.a != null) {
      for (int i = 0; i < this.a.size(); i++)
      {
        znt localznt = (znt)this.a.get(i);
        localznt.a(paramzrg);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */