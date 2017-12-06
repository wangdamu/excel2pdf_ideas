package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class zcr
{
  private byte[] b = null;
  private int[] c = null;
  protected static HashMap a = new HashMap();
  
  ArrayList a(zqb paramzqb, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar1 = paramzqb.a.toCharArray();
    char[] arrayOfChar2 = new char[paramzqb.a.length()];
    zcs localzcs = new zcs(arrayOfChar1, 0, paramzqb.a.length(), (byte)(paramBoolean ? 1 : 0));
    this.b = new byte[paramzqb.a.length()];
    this.c = new int[paramzqb.a.length()];
    byte[] arrayOfByte = localzcs.a();
    int i = a(arrayOfChar1, 0, arrayOfChar1.length - 1) + 1;
    for (int j = 0; j < i; j++)
    {
      this.b[j] = arrayOfByte[j];
      this.c[j] = j;
    }
    j = 0;
    int k = 0;
    int i1;
    int i2;
    for (;;)
    {
      if (j < i)
      {
        m = arrayOfChar1[j];
        if (((m < 1536) || (m > 1791)) && ((m < 1424) || (m > 1535)))
        {
          if (j != k)
          {
            arrayOfChar1[k] = arrayOfChar1[j];
            this.b[k] = this.b[j];
          }
          j++;
          k++;
          continue;
        }
      }
      if (j >= i)
      {
        i = k;
        break;
      }
      int m = j;
      j++;
      while (j < i)
      {
        n = arrayOfChar1[j];
        if (((n < 1536) || (n > 1791)) && ((n < 1424) || (n > 1535))) {
          break;
        }
        j++;
      }
      n = j - m;
      i1 = zax.a(arrayOfChar1, m, n, arrayOfChar1, k, n, 0);
      if (m != k) {
        for (i2 = 0; i2 < i1; i2++) {
          this.b[(k++)] = this.b[(m++)];
        }
      } else {
        k += i1;
      }
    }
    a(0, i - 1);
    StringBuilder localStringBuilder = new StringBuilder();
    a(arrayOfChar1);
    for (int n = 0; n < i; n++)
    {
      i1 = this.c[n];
      i2 = arrayOfChar1[i1];
      zqb localzqb = new zqb();
      localzqb.b = paramzqb.b;
      localzqb.a = ("" + i2);
      zf.a(localArrayList, localzqb);
    }
    return localArrayList;
  }
  
  void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zqb localzqb1 = (zqb)paramArrayList.get(i);
      if (localzqb1.d != 8)
      {
        zf.a(localArrayList, localzqb1);
      }
      else
      {
        char[] arrayOfChar1 = localzqb1.a.toCharArray();
        char[] arrayOfChar2 = new char[localzqb1.a.length()];
        zcs localzcs = new zcs(arrayOfChar1, 0, localzqb1.a.length(), (byte)(paramBoolean ? 1 : 0));
        this.b = new byte[localzqb1.a.length()];
        this.c = new int[localzqb1.a.length()];
        byte[] arrayOfByte = localzcs.a();
        for (int j = 0; j < arrayOfChar1.length; j++)
        {
          if (('/' == arrayOfChar1[j]) && (j > 0) && (j < arrayOfChar1.length - 1) && (arrayOfChar1[(j - 1)] >= '0') && (arrayOfChar1[(j - 1)] <= '9') && (arrayOfChar1[(j + 1)] >= '0') && (arrayOfChar1[(j + 1)] <= '9')) {
            arrayOfByte[j] = arrayOfByte[(j + 1)];
          }
          if (('-' == arrayOfChar1[j]) && (j > 0) && (j < arrayOfChar1.length - 1)) {
            arrayOfByte[j] = ((byte)Math.min(arrayOfByte[(j - 1)], arrayOfByte[(j + 1)]));
          }
        }
        j = arrayOfChar1.length;
        for (int k = 0; k < j; k++)
        {
          this.b[k] = arrayOfByte[k];
          this.c[k] = k;
        }
        k = 0;
        int m = 0;
        int i3;
        for (;;)
        {
          if (k < j)
          {
            n = arrayOfChar1[k];
            if (((n < 1536) || (n > 1791)) && ((n < 1424) || (n > 1535)))
            {
              if (k != m)
              {
                arrayOfChar1[m] = arrayOfChar1[k];
                this.b[m] = this.b[k];
              }
              k++;
              m++;
              continue;
            }
          }
          if (k >= j)
          {
            j = m;
            break;
          }
          int n = k;
          k++;
          while (k < j)
          {
            i1 = arrayOfChar1[k];
            if (((i1 < 1536) || (i1 > 1791)) && ((i1 < 1424) || (i1 > 1535))) {
              break;
            }
            k++;
          }
          int i1 = k - n;
          i2 = zax.a(arrayOfChar1, n, i1, arrayOfChar1, m, i1, 0);
          if (n != m) {
            for (i3 = 0; i3 < i2; i3++) {
              this.b[(m++)] = this.b[(n++)];
            }
          } else {
            m += i2;
          }
        }
        a(0, j - 1);
        StringBuilder localStringBuilder1 = new StringBuilder();
        a(arrayOfChar1);
        StringBuilder localStringBuilder2 = new StringBuilder();
        for (int i2 = 0; i2 < j; i2++)
        {
          i3 = this.c[i2];
          char c1 = arrayOfChar1[i3];
          if ((c1 == ' ') || (c1 == '-'))
          {
            a(localStringBuilder2, localArrayList, localzqb1);
            zqb localzqb2 = new zqb();
            localzqb2.a = ("" + c1);
            localzqb2.b = localzqb1.b;
            zf.a(localArrayList, localzqb2);
          }
          else if (!b(c1))
          {
            localStringBuilder2.append(c1);
          }
        }
        a(localStringBuilder2, localArrayList, localzqb1);
      }
    }
    if (paramBoolean) {
      Collections.reverse(localArrayList);
    }
    paramArrayList.clear();
    zf.a(paramArrayList, localArrayList);
  }
  
  private static boolean b(char paramChar)
  {
    return ((paramChar >= '‪') && (paramChar <= '‮')) || ((paramChar >= '⁦') && (paramChar <= '⁩')) || (paramChar == '‎') || (paramChar == '‏');
  }
  
  private void a(StringBuilder paramStringBuilder, ArrayList paramArrayList, zqb paramzqb)
  {
    if (paramStringBuilder.length() > 0)
    {
      String str = zs.a(paramStringBuilder);
      zqb localzqb = new zqb();
      localzqb.a = str;
      localzqb.b = paramzqb.b;
      zf.a(paramArrayList, localzqb);
      paramStringBuilder.delete(0, 0 + paramStringBuilder.length());
    }
  }
  
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    for (int i = paramInt2; i >= paramInt1; i--)
    {
      char c1 = paramArrayOfChar[i];
      if (!a(c1)) {
        break;
      }
    }
    return i;
  }
  
  public static boolean a(char paramChar)
  {
    return paramChar <= ' ';
  }
  
  public void a(char[] paramArrayOfChar)
  {
    for (int i = 0; i < paramArrayOfChar.length; i++)
    {
      int j = paramArrayOfChar[i];
      if (((this.b[i] & 0xFF & 0x1) == 1) && (a.containsKey(Integer.valueOf(paramArrayOfChar[i]))))
      {
        int k = ((Integer)a.get(Integer.valueOf(paramArrayOfChar[i]))).intValue();
        paramArrayOfChar[i] = ((char)k);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i = this.b[paramInt1];
    int j = i;
    int k = i;
    int m = i;
    int i1;
    for (int n = paramInt1 + 1; n <= paramInt2; n++)
    {
      i1 = this.b[n];
      if ((i1 & 0xFF) > (i & 0xFF)) {
        i = i1;
      } else if ((i1 & 0xFF) < (j & 0xFF)) {
        j = i1;
      }
      k = (byte)(k & i1);
      m = (byte)(m | i1);
    }
    if ((m & 0xFF & 0x1) == 0) {
      return;
    }
    if ((k & 0xFF & 0x1) == 1)
    {
      b(paramInt1, paramInt2 + 1);
      return;
    }
    j = (byte)(j | 0x1);
    while ((i & 0xFF) >= (j & 0xFF))
    {
      n = paramInt1;
      for (;;)
      {
        if ((n <= paramInt2) && ((this.b[n] & 0xFF) < (i & 0xFF)))
        {
          n++;
        }
        else
        {
          if (n > paramInt2) {
            break;
          }
          for (i1 = n + 1; (i1 <= paramInt2) && ((this.b[i1] & 0xFF) >= (i & 0xFF)); i1++) {}
          b(n, i1);
          n = i1 + 1;
        }
      }
      i = (byte)(i - 1);
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    int i = (paramInt1 + paramInt2) / 2;
    paramInt2--;
    while (paramInt1 < i)
    {
      int j = this.c[paramInt1];
      this.c[paramInt1] = this.c[paramInt2];
      this.c[paramInt2] = j;
      paramInt1++;
      paramInt2--;
    }
  }
  
  static
  {
    a.put(Integer.valueOf(40), Integer.valueOf(41));
    a.put(Integer.valueOf(41), Integer.valueOf(40));
    a.put(Integer.valueOf(60), Integer.valueOf(62));
    a.put(Integer.valueOf(62), Integer.valueOf(60));
    a.put(Integer.valueOf(91), Integer.valueOf(93));
    a.put(Integer.valueOf(93), Integer.valueOf(91));
    a.put(Integer.valueOf(123), Integer.valueOf(125));
    a.put(Integer.valueOf(125), Integer.valueOf(123));
    a.put(Integer.valueOf(171), Integer.valueOf(187));
    a.put(Integer.valueOf(187), Integer.valueOf(171));
    a.put(Integer.valueOf(8249), Integer.valueOf(8250));
    a.put(Integer.valueOf(8250), Integer.valueOf(8249));
    a.put(Integer.valueOf(8261), Integer.valueOf(8262));
    a.put(Integer.valueOf(8262), Integer.valueOf(8261));
    a.put(Integer.valueOf(8317), Integer.valueOf(8318));
    a.put(Integer.valueOf(8318), Integer.valueOf(8317));
    a.put(Integer.valueOf(8333), Integer.valueOf(8334));
    a.put(Integer.valueOf(8334), Integer.valueOf(8333));
    a.put(Integer.valueOf(8712), Integer.valueOf(8715));
    a.put(Integer.valueOf(8713), Integer.valueOf(8716));
    a.put(Integer.valueOf(8714), Integer.valueOf(8717));
    a.put(Integer.valueOf(8715), Integer.valueOf(8712));
    a.put(Integer.valueOf(8716), Integer.valueOf(8713));
    a.put(Integer.valueOf(8717), Integer.valueOf(8714));
    a.put(Integer.valueOf(8725), Integer.valueOf(10741));
    a.put(Integer.valueOf(8764), Integer.valueOf(8765));
    a.put(Integer.valueOf(8765), Integer.valueOf(8764));
    a.put(Integer.valueOf(8771), Integer.valueOf(8909));
    a.put(Integer.valueOf(8786), Integer.valueOf(8787));
    a.put(Integer.valueOf(8787), Integer.valueOf(8786));
    a.put(Integer.valueOf(8788), Integer.valueOf(8789));
    a.put(Integer.valueOf(8789), Integer.valueOf(8788));
    a.put(Integer.valueOf(8804), Integer.valueOf(8805));
    a.put(Integer.valueOf(8805), Integer.valueOf(8804));
    a.put(Integer.valueOf(8806), Integer.valueOf(8807));
    a.put(Integer.valueOf(8807), Integer.valueOf(8806));
    a.put(Integer.valueOf(8808), Integer.valueOf(8809));
    a.put(Integer.valueOf(8809), Integer.valueOf(8808));
    a.put(Integer.valueOf(8810), Integer.valueOf(8811));
    a.put(Integer.valueOf(8811), Integer.valueOf(8810));
    a.put(Integer.valueOf(8814), Integer.valueOf(8815));
    a.put(Integer.valueOf(8815), Integer.valueOf(8814));
    a.put(Integer.valueOf(8816), Integer.valueOf(8817));
    a.put(Integer.valueOf(8817), Integer.valueOf(8816));
    a.put(Integer.valueOf(8818), Integer.valueOf(8819));
    a.put(Integer.valueOf(8819), Integer.valueOf(8818));
    a.put(Integer.valueOf(8820), Integer.valueOf(8821));
    a.put(Integer.valueOf(8821), Integer.valueOf(8820));
    a.put(Integer.valueOf(8822), Integer.valueOf(8823));
    a.put(Integer.valueOf(8823), Integer.valueOf(8822));
    a.put(Integer.valueOf(8824), Integer.valueOf(8825));
    a.put(Integer.valueOf(8825), Integer.valueOf(8824));
    a.put(Integer.valueOf(8826), Integer.valueOf(8827));
    a.put(Integer.valueOf(8827), Integer.valueOf(8826));
    a.put(Integer.valueOf(8828), Integer.valueOf(8829));
    a.put(Integer.valueOf(8829), Integer.valueOf(8828));
    a.put(Integer.valueOf(8830), Integer.valueOf(8831));
    a.put(Integer.valueOf(8831), Integer.valueOf(8830));
    a.put(Integer.valueOf(8832), Integer.valueOf(8833));
    a.put(Integer.valueOf(8833), Integer.valueOf(8832));
    a.put(Integer.valueOf(8834), Integer.valueOf(8835));
    a.put(Integer.valueOf(8835), Integer.valueOf(8834));
    a.put(Integer.valueOf(8836), Integer.valueOf(8837));
    a.put(Integer.valueOf(8837), Integer.valueOf(8836));
    a.put(Integer.valueOf(8838), Integer.valueOf(8839));
    a.put(Integer.valueOf(8839), Integer.valueOf(8838));
    a.put(Integer.valueOf(8840), Integer.valueOf(8841));
    a.put(Integer.valueOf(8841), Integer.valueOf(8840));
    a.put(Integer.valueOf(8842), Integer.valueOf(8843));
    a.put(Integer.valueOf(8843), Integer.valueOf(8842));
    a.put(Integer.valueOf(8847), Integer.valueOf(8848));
    a.put(Integer.valueOf(8848), Integer.valueOf(8847));
    a.put(Integer.valueOf(8849), Integer.valueOf(8850));
    a.put(Integer.valueOf(8850), Integer.valueOf(8849));
    a.put(Integer.valueOf(8856), Integer.valueOf(10680));
    a.put(Integer.valueOf(8866), Integer.valueOf(8867));
    a.put(Integer.valueOf(8867), Integer.valueOf(8866));
    a.put(Integer.valueOf(8870), Integer.valueOf(10974));
    a.put(Integer.valueOf(8872), Integer.valueOf(10980));
    a.put(Integer.valueOf(8873), Integer.valueOf(10979));
    a.put(Integer.valueOf(8875), Integer.valueOf(10981));
    a.put(Integer.valueOf(8880), Integer.valueOf(8881));
    a.put(Integer.valueOf(8881), Integer.valueOf(8880));
    a.put(Integer.valueOf(8882), Integer.valueOf(8883));
    a.put(Integer.valueOf(8883), Integer.valueOf(8882));
    a.put(Integer.valueOf(8884), Integer.valueOf(8885));
    a.put(Integer.valueOf(8885), Integer.valueOf(8884));
    a.put(Integer.valueOf(8886), Integer.valueOf(8887));
    a.put(Integer.valueOf(8887), Integer.valueOf(8886));
    a.put(Integer.valueOf(8905), Integer.valueOf(8906));
    a.put(Integer.valueOf(8906), Integer.valueOf(8905));
    a.put(Integer.valueOf(8907), Integer.valueOf(8908));
    a.put(Integer.valueOf(8908), Integer.valueOf(8907));
    a.put(Integer.valueOf(8909), Integer.valueOf(8771));
    a.put(Integer.valueOf(8912), Integer.valueOf(8913));
    a.put(Integer.valueOf(8913), Integer.valueOf(8912));
    a.put(Integer.valueOf(8918), Integer.valueOf(8919));
    a.put(Integer.valueOf(8919), Integer.valueOf(8918));
    a.put(Integer.valueOf(8920), Integer.valueOf(8921));
    a.put(Integer.valueOf(8921), Integer.valueOf(8920));
    a.put(Integer.valueOf(8922), Integer.valueOf(8923));
    a.put(Integer.valueOf(8923), Integer.valueOf(8922));
    a.put(Integer.valueOf(8924), Integer.valueOf(8925));
    a.put(Integer.valueOf(8925), Integer.valueOf(8924));
    a.put(Integer.valueOf(8926), Integer.valueOf(8927));
    a.put(Integer.valueOf(8927), Integer.valueOf(8926));
    a.put(Integer.valueOf(8928), Integer.valueOf(8929));
    a.put(Integer.valueOf(8929), Integer.valueOf(8928));
    a.put(Integer.valueOf(8930), Integer.valueOf(8931));
    a.put(Integer.valueOf(8931), Integer.valueOf(8930));
    a.put(Integer.valueOf(8932), Integer.valueOf(8933));
    a.put(Integer.valueOf(8933), Integer.valueOf(8932));
    a.put(Integer.valueOf(8934), Integer.valueOf(8935));
    a.put(Integer.valueOf(8935), Integer.valueOf(8934));
    a.put(Integer.valueOf(8936), Integer.valueOf(8937));
    a.put(Integer.valueOf(8937), Integer.valueOf(8936));
    a.put(Integer.valueOf(8938), Integer.valueOf(8939));
    a.put(Integer.valueOf(8939), Integer.valueOf(8938));
    a.put(Integer.valueOf(8940), Integer.valueOf(8941));
    a.put(Integer.valueOf(8941), Integer.valueOf(8940));
    a.put(Integer.valueOf(8944), Integer.valueOf(8945));
    a.put(Integer.valueOf(8945), Integer.valueOf(8944));
    a.put(Integer.valueOf(8946), Integer.valueOf(8954));
    a.put(Integer.valueOf(8947), Integer.valueOf(8955));
    a.put(Integer.valueOf(8948), Integer.valueOf(8956));
    a.put(Integer.valueOf(8950), Integer.valueOf(8957));
    a.put(Integer.valueOf(8951), Integer.valueOf(8958));
    a.put(Integer.valueOf(8954), Integer.valueOf(8946));
    a.put(Integer.valueOf(8955), Integer.valueOf(8947));
    a.put(Integer.valueOf(8956), Integer.valueOf(8948));
    a.put(Integer.valueOf(8957), Integer.valueOf(8950));
    a.put(Integer.valueOf(8958), Integer.valueOf(8951));
    a.put(Integer.valueOf(8968), Integer.valueOf(8969));
    a.put(Integer.valueOf(8969), Integer.valueOf(8968));
    a.put(Integer.valueOf(8970), Integer.valueOf(8971));
    a.put(Integer.valueOf(8971), Integer.valueOf(8970));
    a.put(Integer.valueOf(9001), Integer.valueOf(9002));
    a.put(Integer.valueOf(9002), Integer.valueOf(9001));
    a.put(Integer.valueOf(10088), Integer.valueOf(10089));
    a.put(Integer.valueOf(10089), Integer.valueOf(10088));
    a.put(Integer.valueOf(10090), Integer.valueOf(10091));
    a.put(Integer.valueOf(10091), Integer.valueOf(10090));
    a.put(Integer.valueOf(10092), Integer.valueOf(10093));
    a.put(Integer.valueOf(10093), Integer.valueOf(10092));
    a.put(Integer.valueOf(10094), Integer.valueOf(10095));
    a.put(Integer.valueOf(10095), Integer.valueOf(10094));
    a.put(Integer.valueOf(10096), Integer.valueOf(10097));
    a.put(Integer.valueOf(10097), Integer.valueOf(10096));
    a.put(Integer.valueOf(10098), Integer.valueOf(10099));
    a.put(Integer.valueOf(10099), Integer.valueOf(10098));
    a.put(Integer.valueOf(10100), Integer.valueOf(10101));
    a.put(Integer.valueOf(10101), Integer.valueOf(10100));
    a.put(Integer.valueOf(10197), Integer.valueOf(10198));
    a.put(Integer.valueOf(10198), Integer.valueOf(10197));
    a.put(Integer.valueOf(10205), Integer.valueOf(10206));
    a.put(Integer.valueOf(10206), Integer.valueOf(10205));
    a.put(Integer.valueOf(10210), Integer.valueOf(10211));
    a.put(Integer.valueOf(10211), Integer.valueOf(10210));
    a.put(Integer.valueOf(10212), Integer.valueOf(10213));
    a.put(Integer.valueOf(10213), Integer.valueOf(10212));
    a.put(Integer.valueOf(10214), Integer.valueOf(10215));
    a.put(Integer.valueOf(10215), Integer.valueOf(10214));
    a.put(Integer.valueOf(10216), Integer.valueOf(10217));
    a.put(Integer.valueOf(10217), Integer.valueOf(10216));
    a.put(Integer.valueOf(10218), Integer.valueOf(10219));
    a.put(Integer.valueOf(10219), Integer.valueOf(10218));
    a.put(Integer.valueOf(10627), Integer.valueOf(10628));
    a.put(Integer.valueOf(10628), Integer.valueOf(10627));
    a.put(Integer.valueOf(10629), Integer.valueOf(10630));
    a.put(Integer.valueOf(10630), Integer.valueOf(10629));
    a.put(Integer.valueOf(10631), Integer.valueOf(10632));
    a.put(Integer.valueOf(10632), Integer.valueOf(10631));
    a.put(Integer.valueOf(10633), Integer.valueOf(10634));
    a.put(Integer.valueOf(10634), Integer.valueOf(10633));
    a.put(Integer.valueOf(10635), Integer.valueOf(10636));
    a.put(Integer.valueOf(10636), Integer.valueOf(10635));
    a.put(Integer.valueOf(10637), Integer.valueOf(10640));
    a.put(Integer.valueOf(10638), Integer.valueOf(10639));
    a.put(Integer.valueOf(10639), Integer.valueOf(10638));
    a.put(Integer.valueOf(10640), Integer.valueOf(10637));
    a.put(Integer.valueOf(10641), Integer.valueOf(10642));
    a.put(Integer.valueOf(10642), Integer.valueOf(10641));
    a.put(Integer.valueOf(10643), Integer.valueOf(10644));
    a.put(Integer.valueOf(10644), Integer.valueOf(10643));
    a.put(Integer.valueOf(10645), Integer.valueOf(10646));
    a.put(Integer.valueOf(10646), Integer.valueOf(10645));
    a.put(Integer.valueOf(10647), Integer.valueOf(10648));
    a.put(Integer.valueOf(10648), Integer.valueOf(10647));
    a.put(Integer.valueOf(10680), Integer.valueOf(8856));
    a.put(Integer.valueOf(10688), Integer.valueOf(10689));
    a.put(Integer.valueOf(10689), Integer.valueOf(10688));
    a.put(Integer.valueOf(10692), Integer.valueOf(10693));
    a.put(Integer.valueOf(10693), Integer.valueOf(10692));
    a.put(Integer.valueOf(10703), Integer.valueOf(10704));
    a.put(Integer.valueOf(10704), Integer.valueOf(10703));
    a.put(Integer.valueOf(10705), Integer.valueOf(10706));
    a.put(Integer.valueOf(10706), Integer.valueOf(10705));
    a.put(Integer.valueOf(10708), Integer.valueOf(10709));
    a.put(Integer.valueOf(10709), Integer.valueOf(10708));
    a.put(Integer.valueOf(10712), Integer.valueOf(10713));
    a.put(Integer.valueOf(10713), Integer.valueOf(10712));
    a.put(Integer.valueOf(10714), Integer.valueOf(10715));
    a.put(Integer.valueOf(10715), Integer.valueOf(10714));
    a.put(Integer.valueOf(10741), Integer.valueOf(8725));
    a.put(Integer.valueOf(10744), Integer.valueOf(10745));
    a.put(Integer.valueOf(10745), Integer.valueOf(10744));
    a.put(Integer.valueOf(10748), Integer.valueOf(10749));
    a.put(Integer.valueOf(10749), Integer.valueOf(10748));
    a.put(Integer.valueOf(10795), Integer.valueOf(10796));
    a.put(Integer.valueOf(10796), Integer.valueOf(10795));
    a.put(Integer.valueOf(10797), Integer.valueOf(10796));
    a.put(Integer.valueOf(10798), Integer.valueOf(10797));
    a.put(Integer.valueOf(10804), Integer.valueOf(10805));
    a.put(Integer.valueOf(10805), Integer.valueOf(10804));
    a.put(Integer.valueOf(10812), Integer.valueOf(10813));
    a.put(Integer.valueOf(10813), Integer.valueOf(10812));
    a.put(Integer.valueOf(10852), Integer.valueOf(10853));
    a.put(Integer.valueOf(10853), Integer.valueOf(10852));
    a.put(Integer.valueOf(10873), Integer.valueOf(10874));
    a.put(Integer.valueOf(10874), Integer.valueOf(10873));
    a.put(Integer.valueOf(10877), Integer.valueOf(10878));
    a.put(Integer.valueOf(10878), Integer.valueOf(10877));
    a.put(Integer.valueOf(10879), Integer.valueOf(10880));
    a.put(Integer.valueOf(10880), Integer.valueOf(10879));
    a.put(Integer.valueOf(10881), Integer.valueOf(10882));
    a.put(Integer.valueOf(10882), Integer.valueOf(10881));
    a.put(Integer.valueOf(10883), Integer.valueOf(10884));
    a.put(Integer.valueOf(10884), Integer.valueOf(10883));
    a.put(Integer.valueOf(10891), Integer.valueOf(10892));
    a.put(Integer.valueOf(10892), Integer.valueOf(10891));
    a.put(Integer.valueOf(10897), Integer.valueOf(10898));
    a.put(Integer.valueOf(10898), Integer.valueOf(10897));
    a.put(Integer.valueOf(10899), Integer.valueOf(10900));
    a.put(Integer.valueOf(10900), Integer.valueOf(10899));
    a.put(Integer.valueOf(10901), Integer.valueOf(10902));
    a.put(Integer.valueOf(10902), Integer.valueOf(10901));
    a.put(Integer.valueOf(10903), Integer.valueOf(10904));
    a.put(Integer.valueOf(10904), Integer.valueOf(10903));
    a.put(Integer.valueOf(10905), Integer.valueOf(10906));
    a.put(Integer.valueOf(10906), Integer.valueOf(10905));
    a.put(Integer.valueOf(10907), Integer.valueOf(10908));
    a.put(Integer.valueOf(10908), Integer.valueOf(10907));
    a.put(Integer.valueOf(10913), Integer.valueOf(10914));
    a.put(Integer.valueOf(10914), Integer.valueOf(10913));
    a.put(Integer.valueOf(10918), Integer.valueOf(10919));
    a.put(Integer.valueOf(10919), Integer.valueOf(10918));
    a.put(Integer.valueOf(10920), Integer.valueOf(10921));
    a.put(Integer.valueOf(10921), Integer.valueOf(10920));
    a.put(Integer.valueOf(10922), Integer.valueOf(10923));
    a.put(Integer.valueOf(10923), Integer.valueOf(10922));
    a.put(Integer.valueOf(10924), Integer.valueOf(10925));
    a.put(Integer.valueOf(10925), Integer.valueOf(10924));
    a.put(Integer.valueOf(10927), Integer.valueOf(10928));
    a.put(Integer.valueOf(10928), Integer.valueOf(10927));
    a.put(Integer.valueOf(10931), Integer.valueOf(10932));
    a.put(Integer.valueOf(10932), Integer.valueOf(10931));
    a.put(Integer.valueOf(10939), Integer.valueOf(10940));
    a.put(Integer.valueOf(10940), Integer.valueOf(10939));
    a.put(Integer.valueOf(10941), Integer.valueOf(10942));
    a.put(Integer.valueOf(10942), Integer.valueOf(10941));
    a.put(Integer.valueOf(10943), Integer.valueOf(10944));
    a.put(Integer.valueOf(10944), Integer.valueOf(10943));
    a.put(Integer.valueOf(10945), Integer.valueOf(10946));
    a.put(Integer.valueOf(10946), Integer.valueOf(10945));
    a.put(Integer.valueOf(10947), Integer.valueOf(10948));
    a.put(Integer.valueOf(10948), Integer.valueOf(10947));
    a.put(Integer.valueOf(10949), Integer.valueOf(10950));
    a.put(Integer.valueOf(10950), Integer.valueOf(10949));
    a.put(Integer.valueOf(10957), Integer.valueOf(10958));
    a.put(Integer.valueOf(10958), Integer.valueOf(10957));
    a.put(Integer.valueOf(10959), Integer.valueOf(10960));
    a.put(Integer.valueOf(10960), Integer.valueOf(10959));
    a.put(Integer.valueOf(10961), Integer.valueOf(10962));
    a.put(Integer.valueOf(10962), Integer.valueOf(10961));
    a.put(Integer.valueOf(10963), Integer.valueOf(10964));
    a.put(Integer.valueOf(10964), Integer.valueOf(10963));
    a.put(Integer.valueOf(10965), Integer.valueOf(10966));
    a.put(Integer.valueOf(10966), Integer.valueOf(10965));
    a.put(Integer.valueOf(10974), Integer.valueOf(8870));
    a.put(Integer.valueOf(10979), Integer.valueOf(8873));
    a.put(Integer.valueOf(10980), Integer.valueOf(8872));
    a.put(Integer.valueOf(10981), Integer.valueOf(8875));
    a.put(Integer.valueOf(10988), Integer.valueOf(10989));
    a.put(Integer.valueOf(10989), Integer.valueOf(10988));
    a.put(Integer.valueOf(10999), Integer.valueOf(11000));
    a.put(Integer.valueOf(11000), Integer.valueOf(10999));
    a.put(Integer.valueOf(11001), Integer.valueOf(11002));
    a.put(Integer.valueOf(11002), Integer.valueOf(11001));
    a.put(Integer.valueOf(12296), Integer.valueOf(12297));
    a.put(Integer.valueOf(12297), Integer.valueOf(12296));
    a.put(Integer.valueOf(12298), Integer.valueOf(12299));
    a.put(Integer.valueOf(12299), Integer.valueOf(12298));
    a.put(Integer.valueOf(12300), Integer.valueOf(12301));
    a.put(Integer.valueOf(12301), Integer.valueOf(12300));
    a.put(Integer.valueOf(12302), Integer.valueOf(12303));
    a.put(Integer.valueOf(12303), Integer.valueOf(12302));
    a.put(Integer.valueOf(12304), Integer.valueOf(12305));
    a.put(Integer.valueOf(12305), Integer.valueOf(12304));
    a.put(Integer.valueOf(12308), Integer.valueOf(12309));
    a.put(Integer.valueOf(12309), Integer.valueOf(12308));
    a.put(Integer.valueOf(12310), Integer.valueOf(12311));
    a.put(Integer.valueOf(12311), Integer.valueOf(12310));
    a.put(Integer.valueOf(12312), Integer.valueOf(12313));
    a.put(Integer.valueOf(12313), Integer.valueOf(12312));
    a.put(Integer.valueOf(12314), Integer.valueOf(12315));
    a.put(Integer.valueOf(12315), Integer.valueOf(12314));
    a.put(Integer.valueOf(65288), Integer.valueOf(65289));
    a.put(Integer.valueOf(65289), Integer.valueOf(65288));
    a.put(Integer.valueOf(65308), Integer.valueOf(65310));
    a.put(Integer.valueOf(65310), Integer.valueOf(65308));
    a.put(Integer.valueOf(65339), Integer.valueOf(65341));
    a.put(Integer.valueOf(65341), Integer.valueOf(65339));
    a.put(Integer.valueOf(65371), Integer.valueOf(65373));
    a.put(Integer.valueOf(65373), Integer.valueOf(65371));
    a.put(Integer.valueOf(65375), Integer.valueOf(65376));
    a.put(Integer.valueOf(65376), Integer.valueOf(65375));
    a.put(Integer.valueOf(65378), Integer.valueOf(65379));
    a.put(Integer.valueOf(65379), Integer.valueOf(65378));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */