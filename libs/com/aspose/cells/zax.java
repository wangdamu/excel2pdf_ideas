package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zax
{
  private static char[][] a = { { 'ء', 65152 }, { 'آ', 65153, 65154 }, { 'أ', 65155, 65156 }, { 'ؤ', 65157, 65158 }, { 'إ', 65159, 65160 }, { 'ئ', 65161, 65162, 65163, 65164 }, { 'ا', 65165, 65166 }, { 'ب', 65167, 65168, 65169, 65170 }, { 'ة', 65171, 65172 }, { 'ت', 65173, 65174, 65175, 65176 }, { 'ث', 65177, 65178, 65179, 65180 }, { 'ج', 65181, 65182, 65183, 65184 }, { 'ح', 65185, 65186, 65187, 65188 }, { 'خ', 65189, 65190, 65191, 65192 }, { 'د', 65193, 65194 }, { 'ذ', 65195, 65196 }, { 'ر', 65197, 65198 }, { 'ز', 65199, 65200 }, { 'س', 65201, 65202, 65203, 65204 }, { 'ش', 65205, 65206, 65207, 65208 }, { 'ص', 65209, 65210, 65211, 65212 }, { 'ض', 65213, 65214, 65215, 65216 }, { 'ط', 65217, 65218, 65219, 65220 }, { 'ظ', 65221, 65222, 65223, 65224 }, { 'ع', 65225, 65226, 65227, 65228 }, { 'غ', 65229, 65230, 65231, 65232 }, { 'ـ', 'ـ', 'ـ', 'ـ', 'ـ' }, { 'ف', 65233, 65234, 65235, 65236 }, { 'ق', 65237, 65238, 65239, 65240 }, { 'ك', 65241, 65242, 65243, 65244 }, { 'ل', 65245, 65246, 65247, 65248 }, { 'م', 65249, 65250, 65251, 65252 }, { 'ن', 65253, 65254, 65255, 65256 }, { 'ه', 65257, 65258, 65259, 65260 }, { 'و', 65261, 65262 }, { 'ى', 65263, 65264, 64488, 64489 }, { 'ي', 65265, 65266, 65267, 65268 }, { 'ٱ', 64336, 64337 }, { 'ٹ', 64358, 64359, 64360, 64361 }, { 'ٺ', 64350, 64351, 64352, 64353 }, { 'ٻ', 64338, 64339, 64340, 64341 }, { 'پ', 64342, 64343, 64344, 64345 }, { 'ٿ', 64354, 64355, 64356, 64357 }, { 'ڀ', 64346, 64347, 64348, 64349 }, { 'ڃ', 64374, 64375, 64376, 64377 }, { 'ڄ', 64370, 64371, 64372, 64373 }, { 'چ', 64378, 64379, 64380, 64381 }, { 'ڇ', 64382, 64383, 64384, 64385 }, { 'ڈ', 64392, 64393 }, { 'ڌ', 64388, 64389 }, { 'ڍ', 64386, 64387 }, { 'ڎ', 64390, 64391 }, { 'ڑ', 64396, 64397 }, { 'ژ', 64394, 64395 }, { 'ڤ', 64362, 64363, 64364, 64365 }, { 'ڦ', 64366, 64367, 64368, 64369 }, { 'ک', 64398, 64399, 64400, 64401 }, { 'ڭ', 64467, 64468, 64469, 64470 }, { 'گ', 64402, 64403, 64404, 64405 }, { 'ڱ', 64410, 64411, 64412, 64413 }, { 'ڳ', 64406, 64407, 64408, 64409 }, { 'ں', 64414, 64415 }, { 'ڻ', 64416, 64417, 64418, 64419 }, { 'ھ', 64426, 64427, 64428, 64429 }, { 'ۀ', 64420, 64421 }, { 'ہ', 64422, 64423, 64424, 64425 }, { 'ۅ', 64480, 64481 }, { 'ۆ', 64473, 64474 }, { 'ۇ', 64471, 64472 }, { 'ۈ', 64475, 64476 }, { 'ۉ', 64482, 64483 }, { 'ۋ', 64478, 64479 }, { 'ی', 64508, 64509, 64510, 64511 }, { 'ې', 64484, 64485, 64486, 64487 }, { 'ے', 64430, 64431 }, { 'ۓ', 64432, 64433 } };
  
  static boolean a(ArrayList paramArrayList)
  {
    if ((paramArrayList != null) && (paramArrayList.size() > 0)) {
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        zqb localzqb = (zqb)paramArrayList.get(i);
        if ((localzqb != null) && (a(localzqb.a))) {
          return true;
        }
      }
    }
    return false;
  }
  
  static boolean a(String paramString)
  {
    if ((paramString != null) && (paramString.trim().length() > 0))
    {
      String str = paramString.trim();
      for (int i = 0; i < str.length(); i++)
      {
        int j = str.charAt(i);
        if (((j >= 1424) && (j <= 1791)) || ((j >= 64336) && (j <= 65023)) || ((j >= 65136) && (j <= 65279))) {
          return true;
        }
      }
    }
    return false;
  }
  
  static boolean b(ArrayList paramArrayList)
  {
    if ((paramArrayList != null) && (paramArrayList.size() > 0)) {
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        zqb localzqb = (zqb)paramArrayList.get(i);
        if ((localzqb != null) && (localzqb.a != null) && (localzqb.a.trim().length() > 0))
        {
          String str = localzqb.a.trim();
          for (int j = 0; j < str.length(); j++)
          {
            int k = str.charAt(j);
            if (k == 47) {
              return false;
            }
            if (((k >= 1424) && (k <= 1791)) || ((k >= 64336) && (k <= 65023)) || ((k >= 65136) && (k <= 65279))) {
              return true;
            }
            if (k > 127) {
              return false;
            }
            if (((k >= 97) && (k <= 122)) || ((k >= 65) && (k <= 90))) {
              return false;
            }
          }
        }
      }
    }
    return false;
  }
  
  static boolean b(String paramString)
  {
    for (int i = 0; i < paramString.length(); i++)
    {
      int j = paramString.charAt(i);
      if (j == 47) {
        return false;
      }
      if (((j >= 1424) && (j <= 1791)) || ((j >= 64336) && (j <= 65023)) || ((j >= 65136) && (j <= 65279))) {
        return true;
      }
      if (j > 127) {
        return false;
      }
      if (((j >= 97) && (j <= 122)) || ((j >= 65) && (j <= 90))) {
        return false;
      }
    }
    return false;
  }
  
  static boolean a(char paramChar)
  {
    return ((paramChar >= 'ً') && (paramChar <= 'ٕ')) || (paramChar == 'ٰ');
  }
  
  static char a(char paramChar, int paramInt)
  {
    int i;
    int j;
    if ((paramChar >= 'ء') && (paramChar <= 'ۓ'))
    {
      i = 0;
      j = a.length - 1;
    }
    while (i <= j)
    {
      int k = (i + j) / 2;
      if (paramChar == a[k][0]) {
        return a[k][(paramInt + 1)];
      }
      if (paramChar < a[k][0])
      {
        j = k - 1;
      }
      else
      {
        i = k + 1;
        continue;
        if ((paramChar >= 65269) && (paramChar <= 65275)) {
          return (char)(paramChar + paramInt);
        }
      }
    }
    return paramChar;
  }
  
  static int b(char paramChar)
  {
    int i;
    int j;
    if ((paramChar >= 'ء') && (paramChar <= 'ۓ') && (!a(paramChar)))
    {
      i = 0;
      j = a.length - 1;
    }
    while (i <= j)
    {
      int k = (i + j) / 2;
      if (paramChar == a[k][0]) {
        return a[k].length - 1;
      }
      if (paramChar < a[k][0])
      {
        j = k - 1;
      }
      else
      {
        i = k + 1;
        continue;
        if (paramChar == '‍') {
          return 4;
        }
      }
    }
    return 1;
  }
  
  static int a(char paramChar, zix paramzix)
  {
    int i = 0;
    if (paramzix.a == 0) {
      return 0;
    }
    if (a(paramChar))
    {
      i = 1;
      if ((paramzix.c != 0) && (paramChar != 'ّ')) {
        i = 2;
      }
      switch (paramChar)
      {
      case 'ّ': 
        if (paramzix.b == 0) {
          paramzix.b = 'ّ';
        } else {
          return 0;
        }
        break;
      case 'ٕ': 
        switch (paramzix.a)
        {
        case 'ا': 
          paramzix.a = 'إ';
          i = 2;
          break;
        case 'ﻻ': 
          paramzix.a = 65273;
          i = 2;
          break;
        default: 
          paramzix.b = 'ٕ';
        }
        break;
      case 'ٔ': 
        switch (paramzix.a)
        {
        case 'ا': 
          paramzix.a = 'أ';
          i = 2;
          break;
        case 'ﻻ': 
          paramzix.a = 65271;
          i = 2;
          break;
        case 'و': 
          paramzix.a = 'ؤ';
          i = 2;
          break;
        case 'ى': 
        case 'ي': 
        case 'ی': 
          paramzix.a = 'ئ';
          i = 2;
          break;
        default: 
          paramzix.b = 'ٔ';
        }
        break;
      case 'ٓ': 
        switch (paramzix.a)
        {
        case 'ا': 
          paramzix.a = 'آ';
          i = 2;
        }
        break;
      case 'ْ': 
      default: 
        paramzix.c = paramChar;
      }
      if (i == 1) {
        paramzix.d += 1;
      }
      return i;
    }
    if (paramzix.c != 0) {
      return 0;
    }
    switch (paramzix.a)
    {
    case 'ل': 
      switch (paramChar)
      {
      case 'ا': 
        paramzix.a = 65275;
        paramzix.e = 2;
        i = 3;
        break;
      case 'أ': 
        paramzix.a = 65271;
        paramzix.e = 2;
        i = 3;
        break;
      case 'إ': 
        paramzix.a = 65273;
        paramzix.e = 2;
        i = 3;
        break;
      case 'آ': 
        paramzix.a = 65269;
        paramzix.e = 2;
        i = 3;
      }
      break;
    case '\000': 
      paramzix.a = paramChar;
      paramzix.e = b(paramChar);
      i = 1;
    }
    return i;
  }
  
  static void a(StringBuilder paramStringBuilder, zix paramzix, int paramInt)
  {
    if (paramzix.a == 0) {
      return;
    }
    paramStringBuilder.append(paramzix.a);
    paramzix.d -= 1;
    if (paramzix.b != 0) {
      if ((paramInt & 0x1) == 0)
      {
        paramStringBuilder.append(paramzix.b);
        paramzix.d -= 1;
      }
      else
      {
        paramzix.d -= 1;
      }
    }
    if (paramzix.c != 0) {
      if ((paramInt & 0x1) == 0)
      {
        paramStringBuilder.append(paramzix.c);
        paramzix.d -= 1;
      }
      else
      {
        paramzix.d -= 1;
      }
    }
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    int i;
    int j = i = paramStringBuilder.length();
    int k = 0;
    int m = 1;
    while (m < j)
    {
      int n = 0;
      if ((paramInt & 0x4) != 0) {
        switch (paramStringBuilder.charAt(k))
        {
        case 'ّ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ِ': 
            n = 64610;
            break;
          case 'َ': 
            n = 64608;
            break;
          case 'ُ': 
            n = 64609;
            break;
          case 'ٌ': 
            n = 64606;
            break;
          case 'ٍ': 
            n = 64607;
          }
          break;
        case 'ِ': 
          if (paramStringBuilder.charAt(m) == 'ّ') {
            n = 64610;
          }
          break;
        case 'َ': 
          if (paramStringBuilder.charAt(m) == 'ّ') {
            n = 64608;
          }
          break;
        case 'ُ': 
          if (paramStringBuilder.charAt(m) == 'ّ') {
            n = 64609;
          }
          break;
        }
      }
      if ((paramInt & 0x8) != 0) {
        switch (paramStringBuilder.charAt(k))
        {
        case 'ﻟ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ﺞ': 
            n = 64575;
            break;
          case 'ﺠ': 
            n = 64713;
            break;
          case 'ﺢ': 
            n = 64576;
            break;
          case 'ﺤ': 
            n = 64714;
            break;
          case 'ﺦ': 
            n = 64577;
            break;
          case 'ﺨ': 
            n = 64715;
            break;
          case 'ﻢ': 
            n = 64578;
            break;
          case 'ﻤ': 
            n = 64716;
          }
          break;
        case 'ﺗ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ﺠ': 
            n = 64673;
            break;
          case 'ﺤ': 
            n = 64674;
            break;
          case 'ﺨ': 
            n = 64675;
          }
          break;
        case 'ﺑ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ﺠ': 
            n = 64668;
            break;
          case 'ﺤ': 
            n = 64669;
            break;
          case 'ﺨ': 
            n = 64670;
          }
          break;
        case 'ﻧ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ﺠ': 
            n = 64722;
            break;
          case 'ﺤ': 
            n = 64723;
            break;
          case 'ﺨ': 
            n = 64724;
          }
          break;
        case 'ﻨ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ﺮ': 
            n = 64650;
            break;
          case 'ﺰ': 
            n = 64651;
          }
          break;
        case 'ﻣ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ﺠ': 
            n = 64718;
            break;
          case 'ﺤ': 
            n = 64719;
            break;
          case 'ﺨ': 
            n = 64720;
            break;
          case 'ﻤ': 
            n = 64721;
          }
          break;
        case 'ﻓ': 
          switch (paramStringBuilder.charAt(m))
          {
          case 'ﻲ': 
            n = 64562;
          }
          break;
        }
      }
      if (n != 0)
      {
        paramStringBuilder.setCharAt(k, n);
        i--;
        m++;
      }
      else
      {
        k++;
        paramStringBuilder.setCharAt(k, paramStringBuilder.charAt(m));
        m++;
      }
    }
    paramStringBuilder.setLength(i);
  }
  
  static boolean a(zix paramzix)
  {
    return paramzix.e > 2;
  }
  
  static void a(char[] paramArrayOfChar, StringBuilder paramStringBuilder, int paramInt)
  {
    int k = 0;
    Object localObject = new zix();
    zix localzix = new zix();
    int j;
    while (k < paramArrayOfChar.length)
    {
      char c = paramArrayOfChar[(k++)];
      int i = a(c, localzix);
      if (i == 0)
      {
        int m = b(c);
        if (m == 1) {
          j = 0;
        } else {
          j = 2;
        }
        if (a((zix)localObject)) {
          j++;
        }
        j %= localzix.e;
        localzix.a = a(localzix.a, j);
        a(paramStringBuilder, (zix)localObject, paramInt);
        localObject = localzix;
        localzix = new zix();
        localzix.a = c;
        localzix.e = m;
        localzix.d += 1;
      }
      else if (i != 1) {}
    }
    if (a((zix)localObject)) {
      j = 1;
    } else {
      j = 0;
    }
    j %= localzix.e;
    localzix.a = a(localzix.a, j);
    a(paramStringBuilder, (zix)localObject, paramInt);
    a(paramStringBuilder, localzix, paramInt);
  }
  
  static int a(char[] paramArrayOfChar1, int paramInt1, int paramInt2, char[] paramArrayOfChar2, int paramInt3, int paramInt4, int paramInt5)
  {
    char[] arrayOfChar = new char[paramInt2];
    for (int i = paramInt2 + paramInt1 - 1; i >= paramInt1; i--) {
      arrayOfChar[(i - paramInt1)] = paramArrayOfChar1[i];
    }
    StringBuilder localStringBuilder = new StringBuilder(paramInt2);
    a(arrayOfChar, localStringBuilder, paramInt5);
    if ((paramInt5 & 0xC) != 0) {
      a(localStringBuilder, paramInt5);
    }
    System.arraycopy(zs.a(localStringBuilder).toCharArray(), 0, paramArrayOfChar2, paramInt3, localStringBuilder.length());
    return localStringBuilder.length();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */