package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.HashMap;

class zabv
{
  private WorksheetCollection a;
  private static String b = "Invalid formula:";
  
  zabv(WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramWorksheetCollection;
  }
  
  zacf a(String paramString, int paramInt)
  {
    zach localzach = new zach();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    while (paramInt < arrayOfChar.length)
    {
      zacf localzacf;
      switch (arrayOfChar[paramInt])
      {
      case '\n': 
      case '\r': 
        break;
      case '#': 
        if (localStringBuilder.length() == 0) {
          paramInt = c(localStringBuilder, arrayOfChar, paramInt);
        } else {
          localStringBuilder.append(arrayOfChar[paramInt]);
        }
        break;
      case '"': 
        paramInt = b(arrayOfChar, localStringBuilder, paramInt);
        break;
      case '\'': 
        paramInt = a(arrayOfChar, localStringBuilder, paramInt);
        break;
      case '{': 
        if (localStringBuilder.length() != 0) {
          throw new CellsException(5, b);
        }
        localzacf = new zacf();
        paramInt = a(localzacf, arrayOfChar, paramInt);
        localzach.a(localzacf);
        break;
      case '(': 
        localzacf = new zacf();
        paramInt = a(localzacf, localStringBuilder, arrayOfChar, paramInt);
        localzach.a(localzacf);
        break;
      case '+': 
        if (!a(localStringBuilder, arrayOfChar, paramInt)) {
          localzach.a(localStringBuilder, "+", true);
        }
        break;
      case '-': 
        if (a(localStringBuilder, arrayOfChar, paramInt)) {
          localStringBuilder.append(arrayOfChar[paramInt]);
        } else {
          localzach.a(localStringBuilder, "-", false);
        }
        break;
      case '%': 
        if (!localzach.a(localStringBuilder)) {
          throw new CellsException(5, b);
        }
        break;
      case '&': 
        localzach.a(localStringBuilder, "&", 2, zaul.k);
        break;
      case '*': 
        localzach.a(localStringBuilder, "*", 4, zaul.h);
        break;
      case '/': 
        localzach.a(localStringBuilder, "/", 4, zaul.i);
        break;
      case '^': 
        localzach.a(localStringBuilder, "^", 5, zaul.j);
        break;
      case '=': 
        localzach.a(localStringBuilder, "=", 1, zaul.n);
        break;
      case '<': 
        if (paramInt + 1 != arrayOfChar.length) {
          switch (arrayOfChar[(paramInt + 1)])
          {
          case '=': 
            localzach.a(localStringBuilder, "<=", 1, zaul.m);
            paramInt++;
            break;
          case '>': 
            localzach.a(localStringBuilder, "<>", 1, zaul.q);
            paramInt++;
            break;
          default: 
            localzach.a(localStringBuilder, "<", 1, zaul.l);
          }
        }
        break;
      case '>': 
        if ((paramInt + 1 != arrayOfChar.length) && (arrayOfChar[(paramInt + 1)] == '='))
        {
          localzach.a(localStringBuilder, ">=", 1, zaul.o);
          paramInt++;
        }
        else
        {
          localzach.a(localStringBuilder, ">", 1, zaul.p);
        }
        break;
      case ',': 
        localzach.a(localStringBuilder, ",", 9, null);
        break;
      case ' ': 
        i = paramInt;
        for (i = paramInt + 1; (i < arrayOfChar.length) && (arrayOfChar[i] == ' '); i++) {}
        int j = paramInt == 0 ? 1 : 0;
        if (j == 0) {
          switch (arrayOfChar[(paramInt - 1)])
          {
          case '\n': 
          case '\r': 
          case ' ': 
          case '%': 
          case '&': 
          case '(': 
          case ')': 
          case '*': 
          case '+': 
          case ',': 
          case '-': 
          case '/': 
          case ':': 
          case '<': 
          case '=': 
          case '>': 
          case '^': 
            j = 1;
          }
        }
        if (j == 0) {
          j = i == arrayOfChar.length ? 1 : 0;
        }
        if (j == 0) {
          switch (arrayOfChar[i])
          {
          case ' ': 
          case '%': 
          case '&': 
          case ')': 
          case '*': 
          case '+': 
          case ',': 
          case '-': 
          case '/': 
          case ':': 
          case '<': 
          case '=': 
          case '>': 
          case '^': 
            j = 1;
          }
        }
        if (j == 0) {
          localzach.a(localStringBuilder, " ", 15, null);
        }
        paramInt = i - 1;
        break;
      case ':': 
        if ((localStringBuilder.length() == 0) || (a(arrayOfChar, paramInt, localStringBuilder))) {
          localzach.a(localStringBuilder, ":", 17, null);
        } else {
          localStringBuilder.append(arrayOfChar[paramInt]);
        }
        break;
      case '[': 
        paramInt = b(localStringBuilder, arrayOfChar, paramInt);
        break;
      default: 
        localStringBuilder.append(arrayOfChar[paramInt]);
      }
      paramInt++;
    }
    if (localStringBuilder.length() != 0) {
      localzach.b(localStringBuilder);
    }
    switch (localzach.getCount())
    {
    case 0: 
      return null;
    case 1: 
      return localzach.a(0);
    }
    zacf[] arrayOfzacf = new zacf[localzach.getCount()];
    for (int k = 0; k < arrayOfzacf.length; k++) {
      arrayOfzacf[k] = localzach.a(k);
    }
    return a(arrayOfzacf, 0, arrayOfzacf.length - 1, 1);
  }
  
  private static boolean a(StringBuilder paramStringBuilder, char[] paramArrayOfChar, int paramInt)
  {
    if ((paramInt + 1 < paramArrayOfChar.length) && (Character.isDigit(paramArrayOfChar[(paramInt + 1)])))
    {
      int i = paramStringBuilder.length();
      if ((i >= 2) && ((paramStringBuilder.charAt(i - 1) == 'E') || (paramStringBuilder.charAt(i - 1) == 'e')))
      {
        for (int j = i - 2; j >= 0; j--) {
          switch (paramStringBuilder.charAt(j))
          {
          case '+': 
          case ',': 
          case '-': 
          case '.': 
          case '0': 
          case '1': 
          case '2': 
          case '3': 
          case '4': 
          case '5': 
          case '6': 
          case '7': 
          case '8': 
          case '9': 
            break;
          case '/': 
          default: 
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }
  
  private int b(StringBuilder paramStringBuilder, char[] paramArrayOfChar, int paramInt)
  {
    int i = 1;
    paramStringBuilder.append(paramArrayOfChar[paramInt]);
    paramInt++;
    while (paramInt < paramArrayOfChar.length)
    {
      switch (paramArrayOfChar[paramInt])
      {
      case ']': 
        paramStringBuilder.append(paramArrayOfChar[paramInt]);
        i--;
        if (i == 0) {
          return paramInt;
        }
        break;
      case '[': 
        paramStringBuilder.append(paramArrayOfChar[paramInt]);
        i++;
        break;
      case '\'': 
        if (paramInt + 1 < paramArrayOfChar.length) {
          switch (paramArrayOfChar[(paramInt + 1)])
          {
          case '#': 
          case '[': 
          case ']': 
            paramStringBuilder.append(paramArrayOfChar[paramInt]);
            paramInt++;
            paramStringBuilder.append(paramArrayOfChar[paramInt]);
            break;
          default: 
            paramInt = a(paramArrayOfChar, paramStringBuilder, paramInt);
            break;
          }
        } else {
          paramInt = a(paramArrayOfChar, paramStringBuilder, paramInt);
        }
        break;
      default: 
        paramStringBuilder.append(paramArrayOfChar[paramInt]);
      }
      paramInt++;
    }
    return paramInt;
  }
  
  private int c(StringBuilder paramStringBuilder, char[] paramArrayOfChar, int paramInt)
  {
    switch (paramArrayOfChar[(paramInt + 1)])
    {
    case 'N': 
    case 'n': 
      switch (paramArrayOfChar[(paramInt + 2)])
      {
      case 'A': 
      case 'a': 
        if (((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'm') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'e') && (paramArrayOfChar[(paramInt + 5)] == '?'))
        {
          paramStringBuilder.append("#NAME?");
          paramInt += 5;
          return paramInt;
        }
        break;
      case 'U': 
      case 'u': 
        if (((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'l') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'l') && (paramArrayOfChar[(paramInt + 5)] == '!'))
        {
          paramStringBuilder.append("#NULL!");
          paramInt += 5;
          return paramInt;
        }
        if (((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'm') && (paramArrayOfChar[(paramInt + 4)] == '!'))
        {
          paramStringBuilder.append("#NUM!");
          paramInt += 4;
          return paramInt;
        }
        break;
      case '/': 
        if ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'a')
        {
          paramStringBuilder.append("#N/A");
          paramInt += 3;
          return paramInt;
        }
        break;
      }
      break;
    case 'D': 
    case 'd': 
      if (((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'i') && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'v') && (paramArrayOfChar[(paramInt + 4)] == '/') && (paramArrayOfChar[(paramInt + 5)] == '0') && (paramArrayOfChar[(paramInt + 6)] == '!'))
      {
        paramStringBuilder.append("#DIV/0!");
        paramInt += 6;
        return paramInt;
      }
      break;
    case 'V': 
    case 'v': 
      if (((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'a') && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'l') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'u') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 'e') && (paramArrayOfChar[(paramInt + 6)] == '!'))
      {
        paramStringBuilder.append("#VALUE!");
        paramInt += 6;
        return paramInt;
      }
      break;
    case 'R': 
    case 'r': 
      if (((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'f') && (paramArrayOfChar[(paramInt + 4)] == '!'))
      {
        paramStringBuilder.append("#REF!");
        paramInt += 4;
        return paramInt;
      }
      break;
    }
    throw new CellsException(5, b);
  }
  
  private int a(zacf paramzacf, char[] paramArrayOfChar, int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    paramInt = a(localArrayList1, paramArrayOfChar, paramInt);
    int i = -1;
    for (int j = 0; j < localArrayList1.size(); j++)
    {
      ArrayList localArrayList2 = (ArrayList)localArrayList1.get(j);
      if (i == -1) {
        i = localArrayList2.size();
      } else if (localArrayList2.size() != i) {
        throw new CellsException(5, "Invalid formula");
      }
    }
    paramzacf.a("{}");
    paramzacf.a(0);
    zacf[][] arrayOfzacf = new zacf[localArrayList1.size()][];
    for (int k = 0; k < arrayOfzacf.length; k++)
    {
      ArrayList localArrayList3 = (ArrayList)localArrayList1.get(k);
      arrayOfzacf[k] = new zacf[localArrayList3.size()];
      for (int m = 0; m < localArrayList3.size(); m++)
      {
        String str = (String)localArrayList3.get(m);
        zacf localzacf = new zacf();
        localzacf.b(paramzacf);
        localzacf.a(str);
        localzacf.a(1);
        arrayOfzacf[k][m] = localzacf;
      }
    }
    paramzacf.a(arrayOfzacf);
    return paramInt;
  }
  
  private int a(ArrayList paramArrayList, char[] paramArrayOfChar, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(paramArrayList, localArrayList);
    StringBuilder localStringBuilder = new StringBuilder();
    paramInt++;
    while (paramInt < paramArrayOfChar.length)
    {
      switch (paramArrayOfChar[paramInt])
      {
      case '\n': 
      case '\r': 
        break;
      case '}': 
        zf.a(localArrayList, zs.a(localStringBuilder));
        localStringBuilder.delete(0, 0 + localStringBuilder.length());
        return paramInt;
      case '"': 
        paramInt = b(paramArrayOfChar, localStringBuilder, paramInt);
        break;
      case '\'': 
        paramInt = a(paramArrayOfChar, localStringBuilder, paramInt);
        break;
      case ',': 
        zf.a(localArrayList, zs.a(localStringBuilder));
        localStringBuilder.delete(0, 0 + localStringBuilder.length());
        break;
      case ';': 
        zf.a(localArrayList, zs.a(localStringBuilder));
        localStringBuilder.delete(0, 0 + localStringBuilder.length());
        localArrayList = new ArrayList();
        zf.a(paramArrayList, localArrayList);
        break;
      default: 
        localStringBuilder.append(paramArrayOfChar[paramInt]);
      }
      paramInt++;
    }
    return paramInt;
  }
  
  private int a(zacf paramzacf, StringBuilder paramStringBuilder, char[] paramArrayOfChar, int paramInt)
  {
    if (paramStringBuilder.length() == 0)
    {
      paramzacf.a("()");
      paramzacf.a(1);
    }
    else
    {
      paramzacf.a(3);
      paramzacf.a(zs.a(paramStringBuilder).toUpperCase());
      paramzacf.a = zs.a(paramStringBuilder);
      paramStringBuilder.delete(0, 0 + paramStringBuilder.length());
    }
    zach localzach = new zach();
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    int j = 0;
    int k = paramInt;
    paramInt++;
    while (paramInt < paramArrayOfChar.length)
    {
      zacf localzacf;
      switch (paramArrayOfChar[paramInt])
      {
      case '\n': 
      case '\r': 
        break;
      case '#': 
        if (localStringBuilder.length() == 0) {
          paramInt = c(localStringBuilder, paramArrayOfChar, paramInt);
        } else {
          localStringBuilder.append(paramArrayOfChar[paramInt]);
        }
        break;
      case ')': 
        if (localStringBuilder.length() != 0)
        {
          localzach.b(localStringBuilder);
        }
        else if ((k + j + 1 == paramInt) && (paramArrayOfChar[k] == ','))
        {
          localzacf = new zacf();
          localzacf.a(1);
          paramzacf.a(localzacf);
          if ((paramzacf.g() != 3) && (paramzacf.c().size() > 1)) {
            a(paramzacf.c());
          }
          return paramInt;
        }
        if (localzach.getCount() != 0) {
          paramzacf.a(a(localzach));
        }
        if ((paramzacf.g() != 3) && (paramzacf.c().size() > 1)) {
          a(paramzacf.c());
        }
        return paramInt;
      case ',': 
        if (localStringBuilder.length() != 0)
        {
          localzach.b(localStringBuilder);
        }
        else if (k + j + 1 == paramInt)
        {
          localzacf = new zacf();
          localzacf.a(1);
          paramzacf.a(localzacf);
          k = paramInt;
          j = 0;
          break;
        }
        k = paramInt;
        j = 0;
        if (localzach.getCount() != 0)
        {
          paramzacf.a(a(localzach));
          localzach.clear();
        }
        break;
      case '(': 
        localzacf = new zacf();
        paramInt = a(localzacf, localStringBuilder, paramArrayOfChar, paramInt);
        localzach.a(localzacf);
        break;
      case '{': 
        if (localStringBuilder.length() != 0) {
          throw new CellsException(5, b);
        }
        localzacf = new zacf();
        paramInt = a(localzacf, paramArrayOfChar, paramInt);
        localzach.a(localzacf);
        break;
      case '\'': 
        paramInt = a(paramArrayOfChar, localStringBuilder, paramInt);
        break;
      case '"': 
        paramInt = b(paramArrayOfChar, localStringBuilder, paramInt);
        break;
      case '+': 
        if (!a(localStringBuilder, paramArrayOfChar, paramInt)) {
          localzach.a(localStringBuilder, "+", true);
        }
        break;
      case '-': 
        if (a(localStringBuilder, paramArrayOfChar, paramInt)) {
          localStringBuilder.append(paramArrayOfChar[paramInt]);
        } else {
          localzach.a(localStringBuilder, "-", false);
        }
        break;
      case '%': 
        if (!localzach.a(localStringBuilder)) {
          throw new CellsException(5, b);
        }
        break;
      case '&': 
        localzach.a(localStringBuilder, "&", 2, zaul.k);
        break;
      case '*': 
        localzach.a(localStringBuilder, "*", 4, zaul.h);
        break;
      case '/': 
        localzach.a(localStringBuilder, "/", 4, zaul.i);
        break;
      case '^': 
        localzach.a(localStringBuilder, "^", 5, zaul.j);
        break;
      case '=': 
        localzach.a(localStringBuilder, "=", 1, zaul.n);
        break;
      case '<': 
        if (paramInt + 1 != paramArrayOfChar.length) {
          switch (paramArrayOfChar[(paramInt + 1)])
          {
          case '=': 
            localzach.a(localStringBuilder, "<=", 1, zaul.m);
            paramInt++;
            break;
          case '>': 
            localzach.a(localStringBuilder, "<>", 1, zaul.q);
            paramInt++;
            break;
          default: 
            localzach.a(localStringBuilder, "<", 1, zaul.l);
          }
        }
        break;
      case '>': 
        if ((paramInt + 1 != paramArrayOfChar.length) && (paramArrayOfChar[(paramInt + 1)] == '='))
        {
          localzach.a(localStringBuilder, ">=", 1, zaul.o);
          paramInt++;
        }
        else
        {
          localzach.a(localStringBuilder, ">", 1, zaul.p);
        }
        break;
      case ' ': 
        i = paramInt;
        int m = paramInt;
        for (i = paramInt - 1; (i >= 0) && ((paramArrayOfChar[i] == '\r') || (paramArrayOfChar[i] == '\n')); i--) {
          paramInt--;
        }
        for (i = m + 1; (i < paramArrayOfChar.length) && ((paramArrayOfChar[i] == ' ') || (paramArrayOfChar[i] == '\r') || (paramArrayOfChar[i] == '\n')); i++) {}
        j += i - paramInt;
        int n = paramInt == 0 ? 1 : 0;
        if (n == 0) {
          switch (paramArrayOfChar[(paramInt - 1)])
          {
          case ' ': 
          case '%': 
          case '&': 
          case '(': 
          case ')': 
          case '*': 
          case '+': 
          case ',': 
          case '-': 
          case '/': 
          case ':': 
          case '<': 
          case '=': 
          case '>': 
          case '^': 
            n = 1;
          }
        }
        if (n == 0) {
          n = i == paramArrayOfChar.length ? 1 : 0;
        }
        if (n == 0) {
          switch (paramArrayOfChar[i])
          {
          case ' ': 
          case '%': 
          case '&': 
          case '(': 
          case ')': 
          case '*': 
          case '+': 
          case ',': 
          case '-': 
          case '/': 
          case ':': 
          case '<': 
          case '=': 
          case '>': 
          case '^': 
            n = 1;
          }
        }
        if (n == 0) {
          localzach.a(localStringBuilder, " ", 15, null);
        }
        paramInt = i - 1;
        break;
      case ':': 
        if ((localStringBuilder.length() == 0) || (a(paramArrayOfChar, paramInt, localStringBuilder))) {
          localzach.a(localStringBuilder, ":", 17, null);
        } else {
          localStringBuilder.append(paramArrayOfChar[paramInt]);
        }
        break;
      case '[': 
        a(localStringBuilder, localzach);
        paramInt = b(localStringBuilder, paramArrayOfChar, paramInt);
        break;
      default: 
        localStringBuilder.append(paramArrayOfChar[paramInt]);
      }
      paramInt++;
    }
    if (paramzacf.g() == 3) {
      throw new CellsException(5, "Invalid Formula.");
    }
    if ((paramzacf.g() != 3) && (paramzacf.c().size() > 1)) {
      a(paramzacf.c());
    }
    return paramInt;
  }
  
  void a(StringBuilder paramStringBuilder, zach paramzach)
  {
    for (int i = 0; i < paramStringBuilder.length(); i++) {
      switch (paramStringBuilder.charAt(i))
      {
      case '#': 
      case '@': 
      case '[': 
      case ']': 
        return;
      case ':': 
        paramzach.a(paramStringBuilder.substring(0, 0 + i), ":", 17, null);
        paramStringBuilder.delete(0, 0 + (i + 1));
        return;
      }
    }
  }
  
  boolean a(char[] paramArrayOfChar, int paramInt, StringBuilder paramStringBuilder)
  {
    
    while (paramInt < paramArrayOfChar.length)
    {
      switch (paramArrayOfChar[paramInt])
      {
      case '!': 
      case '\'': 
        if ((paramStringBuilder.charAt(0) == '[') || ((paramStringBuilder.charAt(0) == '\'') && (paramArrayOfChar[(paramInt - 1)] == '\''))) {
          return false;
        }
        return this.a.f().get(zs.a(paramStringBuilder).toUpperCase()) == null;
      case ':': 
        for (int i = paramStringBuilder.length() - 1; i >= 1; i--)
        {
          if (paramStringBuilder.charAt(i) == ':') {
            return true;
          }
          if (paramStringBuilder.charAt(i) == '!') {
            break;
          }
        }
        return false;
      case '"': 
      case '(': 
        return true;
      case ' ': 
      case '%': 
      case '&': 
      case ')': 
      case '*': 
      case '+': 
      case ',': 
      case '-': 
      case '/': 
      case '<': 
      case '=': 
      case '>': 
      case '^': 
      case '{': 
      case '}': 
        return false;
      }
      paramInt++;
    }
    return false;
  }
  
  int a(char[] paramArrayOfChar, StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder.append(paramArrayOfChar[paramInt]);
    paramInt += 1;
    while (paramInt < paramArrayOfChar.length)
    {
      paramStringBuilder.append(paramArrayOfChar[paramInt]);
      if (paramArrayOfChar[paramInt] == '\'')
      {
        if ((paramInt + 1 == paramArrayOfChar.length) || (paramArrayOfChar[(paramInt + 1)] != '\'')) {
          break;
        }
        paramInt++;
      }
      else if (paramArrayOfChar[paramInt] == '’')
      {
        if ((paramInt + 1 == paramArrayOfChar.length) || (paramArrayOfChar[(paramInt + 1)] != '’')) {
          break;
        }
        paramInt++;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  int b(char[] paramArrayOfChar, StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder.append(paramArrayOfChar[paramInt]);
    paramInt += 1;
    while (paramInt < paramArrayOfChar.length)
    {
      paramStringBuilder.append(paramArrayOfChar[paramInt]);
      if (paramArrayOfChar[paramInt] == '"')
      {
        if ((paramInt + 1 == paramArrayOfChar.length) || (paramArrayOfChar[(paramInt + 1)] != '"')) {
          break;
        }
        paramInt++;
      }
      paramInt++;
    }
    if (paramInt == paramArrayOfChar.length) {
      throw new CellsException(5, b);
    }
    return paramInt;
  }
  
  void a(ArrayList paramArrayList)
  {
    Object localObject = (zacf)paramArrayList.get(0);
    for (int i = 1; i < paramArrayList.size(); i++)
    {
      zacf localzacf = new zacf();
      localzacf.a(2);
      localzacf.a(",");
      localzacf.a(new ArrayList());
      zf.a(localzacf.c(), localObject);
      zf.a(localzacf.c(), paramArrayList.get(i));
      localObject = localzacf;
    }
    paramArrayList.clear();
    zf.a(paramArrayList, localObject);
  }
  
  zacf a(zach paramzach)
  {
    switch (paramzach.getCount())
    {
    case 0: 
      return null;
    case 1: 
      return paramzach.a(0);
    }
    zacf[] arrayOfzacf = new zacf[paramzach.getCount()];
    for (int i = 0; i < arrayOfzacf.length; i++) {
      arrayOfzacf[i] = paramzach.a(i);
    }
    return a(arrayOfzacf, 0, arrayOfzacf.length - 1, 1);
  }
  
  zacf a(zacf[] paramArrayOfzacf, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 255;
    int j = -1;
    for (int k = paramInt2; k >= paramInt1; k--)
    {
      zacf localzacf2 = paramArrayOfzacf[k];
      if (localzacf2.g() == 2)
      {
        if (localzacf2.b == paramInt3)
        {
          i = paramInt3;
          j = k;
          break;
        }
        if (localzacf2.b < i)
        {
          i = localzacf2.b;
          j = k;
        }
      }
    }
    if (j != -1)
    {
      zacf localzacf1 = paramArrayOfzacf[j];
      if (j - 1 == paramInt1) {
        localzacf1.a(paramArrayOfzacf[(j - 1)]);
      } else {
        localzacf1.a(a(paramArrayOfzacf, paramInt1, j - 1, i));
      }
      if (j + 1 == paramInt2) {
        localzacf1.a(paramArrayOfzacf[(j + 1)]);
      } else {
        localzacf1.a(a(paramArrayOfzacf, j + 1, paramInt2, i));
      }
      return localzacf1;
    }
    return paramArrayOfzacf[paramInt1];
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */