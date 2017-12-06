package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zbti
{
  private int c;
  private ArrayList d;
  private String[] e;
  private ArrayList f;
  String a;
  String b;
  
  zbti()
  {
    this.d = new ArrayList();
  }
  
  zbti(int paramInt)
  {
    this.c = paramInt;
    this.d = new ArrayList();
  }
  
  zbti(Workbook paramWorkbook)
  {
    this.c = 0;
    this.e = new String[paramWorkbook.getWorksheets().getCount()];
    for (int i = 0; i < this.e.length; i++) {
      this.e[i] = paramWorkbook.getWorksheets().get(i).getName();
    }
    String str = paramWorkbook.getFileName();
    if ((str == null) || ("".equals(str)))
    {
      DateTime localDateTime = DateTime.getNow();
      str = localDateTime.b("yyyyMMddhhmmss") + FileFormatUtil.a(paramWorkbook.getFileFormat(), ".xlsx");
    }
    c(a(str, 0));
    this.d = new ArrayList();
  }
  
  int a()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  ArrayList b()
  {
    return this.d;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.d = paramArrayList;
  }
  
  int a(WorksheetCollection paramWorksheetCollection, String paramString)
  {
    int i = -1;
    int j = 0;
    for (int k = 0; k < b().size(); k++)
    {
      zwh localzwh2 = (zwh)b().get(k);
      if (zw.b(localzwh2.e().toUpperCase(), paramString.toUpperCase()))
      {
        i = k + 1;
        j = 1;
        break;
      }
    }
    if (j == 0)
    {
      zwh localzwh1 = new zwh(this);
      zf.a(b(), localzwh1);
      i = b().size();
    }
    return i;
  }
  
  void a(String paramString)
  {
    if (this.e == null)
    {
      this.e = new String[] { paramString };
      return;
    }
    String[] arrayOfString = new String[this.e.length + 1];
    for (int i = 0; i < this.e.length; i++) {
      arrayOfString[i] = this.e[i];
    }
    arrayOfString[(arrayOfString.length - 1)] = paramString;
    this.e = arrayOfString;
  }
  
  String[] c()
  {
    return this.e;
  }
  
  void a(String[] paramArrayOfString)
  {
    this.e = paramArrayOfString;
  }
  
  int b(String paramString)
  {
    if ((this.e == null) || (this.e.length == 0)) {
      return -1;
    }
    for (int i = 0; i < this.e.length; i++) {
      if (zw.a(this.e[i], paramString, true) == 0) {
        return i;
      }
    }
    return -1;
  }
  
  boolean a(zbti paramzbti)
  {
    if ((this.c != paramzbti.c) || (this.a == null) || (paramzbti.a == null)) {
      return false;
    }
    boolean bool = false;
    if (zw.b(this.a, paramzbti.a))
    {
      bool = true;
    }
    else
    {
      String str1 = l();
      String str2 = paramzbti.l();
      if ((str1.endsWith(str2)) || (str2.endsWith(str1))) {
        bool = true;
      }
    }
    if (bool) {
      if (this.e == null) {
        this.e = paramzbti.e;
      } else if (paramzbti.e != null) {
        if (this.e.length == paramzbti.e.length) {
          for (int i = 0; i < paramzbti.e.length; i++) {
            if (!zy.a(this.e[i], paramzbti.e[i]))
            {
              bool = false;
              break;
            }
          }
        } else {
          bool = false;
        }
      }
    }
    return bool;
  }
  
  ArrayList d()
  {
    return this.f;
  }
  
  void b(ArrayList paramArrayList)
  {
    this.f = paramArrayList;
  }
  
  zwr b(int paramInt)
  {
    if (this.f == null) {
      this.f = new ArrayList();
    }
    if (paramInt >= this.f.size()) {
      for (int i = this.f.size(); i < paramInt + 1; i++) {
        zf.a(this.f, null);
      }
    }
    zwr localzwr = (zwr)this.f.get(paramInt);
    if (localzwr == null)
    {
      localzwr = new zwr();
      this.f.set(paramInt, localzwr);
    }
    return localzwr;
  }
  
  zwr c(int paramInt)
  {
    if (this.f == null) {
      return null;
    }
    if ((paramInt < 0) || (paramInt >= this.f.size())) {
      return null;
    }
    return (zwr)this.f.get(paramInt);
  }
  
  zwr a(String paramString, boolean paramBoolean)
  {
    if (this.e != null) {
      for (int i = 0; i < this.e.length; i++) {
        if (zy.a(this.e[i], paramString))
        {
          if (paramBoolean) {
            return b(i);
          }
          return c(i);
        }
      }
    }
    return null;
  }
  
  boolean e()
  {
    return this.c == 1;
  }
  
  boolean f()
  {
    return this.c == 2;
  }
  
  boolean g()
  {
    return l().indexOf("\\AddIns\\") != -1;
  }
  
  boolean h()
  {
    return this.c == 0;
  }
  
  int a(zwh paramzwh, int paramInt)
  {
    if (this.d == null) {
      return -1;
    }
    if (paramInt < this.d.size())
    {
      zwh localzwh1 = (zwh)this.d.get(paramInt);
      if ((zw.b(localzwh1.e(), paramzwh.e())) && (localzwh1.d() == paramzwh.d())) {
        return paramInt;
      }
    }
    for (int i = 0; i < this.d.size(); i++)
    {
      zwh localzwh2 = (zwh)this.d.get(i);
      if ((zw.b(localzwh2.e(), paramzwh.e())) && (localzwh2.d() == paramzwh.d())) {
        return i;
      }
    }
    return -1;
  }
  
  void b(zbti paramzbti)
  {
    this.c = paramzbti.c;
    this.a = paramzbti.a;
    int i;
    if (paramzbti.e != null)
    {
      this.e = new String[paramzbti.e.length];
      for (i = 0; i < paramzbti.e.length; i++) {
        this.e[i] = paramzbti.e[i];
      }
    }
    Object localObject1;
    Object localObject2;
    if ((paramzbti.d != null) && (paramzbti.d.size() > 0))
    {
      this.d = new ArrayList();
      for (i = 0; i < paramzbti.d.size(); i++)
      {
        localObject1 = (zwh)paramzbti.d.get(i);
        localObject2 = new zwh(this);
        ((zwh)localObject2).a((zwh)localObject1);
        zf.a(this.d, localObject2);
      }
    }
    if (paramzbti.f != null)
    {
      this.f = new ArrayList();
      for (i = 0; i < paramzbti.f.size(); i++)
      {
        localObject1 = (zwr)paramzbti.f.get(i);
        if (localObject1 == null)
        {
          zf.a(this.f, null);
        }
        else
        {
          localObject2 = new zwr();
          ((zwr)localObject2).a((zwr)localObject1);
          zf.a(this.f, localObject2);
        }
      }
    }
  }
  
  String i()
  {
    return this.a;
  }
  
  void c(String paramString)
  {
    this.a = paramString;
  }
  
  String j()
  {
    if (this.b != null) {
      return this.b;
    }
    if ((this.a == null) || ("".equals(this.a))) {
      return null;
    }
    return e(this.a);
  }
  
  String k()
  {
    if ((this.a == null) || ("".equals(this.a))) {
      return null;
    }
    return e(this.a);
  }
  
  static String a(String paramString, Workbook paramWorkbook)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    String str1 = paramString;
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar = str1.toCharArray();
    switch (arrayOfChar[0])
    {
    case '\000': 
    case '\002': 
      return "";
    case '\001': 
      break;
    default: 
      if (paramWorkbook.getWorksheets().b() != null)
      {
        str2 = paramWorkbook.getWorksheets().b();
        localStringBuilder.append(str2);
        if ((str2.length() > 0) && (str2.charAt(str2.length() - 1) != '\\') && (str2.charAt(str2.length() - 1) != '/')) {
          localStringBuilder.append('/');
        }
      }
      else if (paramWorkbook.e() != null)
      {
        localStringBuilder.append(paramWorkbook.e());
      }
      localStringBuilder.append(str1);
      return zs.a(localStringBuilder);
    }
    String str2 = paramWorkbook.getWorksheets().b();
    if (str2 == null) {
      str2 = paramWorkbook.e();
    }
    for (int i = 1; i < arrayOfChar.length; i++) {
      switch (arrayOfChar[i])
      {
      case '\001': 
        if (arrayOfChar[(i + 1)] == '@')
        {
          i++;
          localStringBuilder.append("\\\\");
        }
        else
        {
          localStringBuilder.append(arrayOfChar[(i + 1)]);
          i++;
          localStringBuilder.append(":\\");
        }
        break;
      case '\002': 
        if (str2 != null) {
          localStringBuilder.append(zu.a(str2));
        } else {
          localStringBuilder.append("C:\\");
        }
        break;
      case '\003': 
        if ((str2 != null) && (localStringBuilder.length() == 0)) {
          localStringBuilder.append(str2);
        } else {
          localStringBuilder.append("\\");
        }
        break;
      case '\004': 
        if (str2 != null)
        {
          int j = str2.lastIndexOf('\\');
          if ((j != -1) && (j != str2.length() - 1)) {
            localStringBuilder.append(str2.substring(0, 0 + (j + 1)));
          } else {
            localStringBuilder.append(str2);
          }
        }
        else
        {
          localStringBuilder.append("../");
        }
        break;
      case '\005': 
        if (i == 1) {
          return paramString.substring(i + 2);
        }
        localStringBuilder.append(arrayOfChar[i]);
        break;
      case '\006': 
        if (CellsHelper.getStartupPath() != null) {
          localStringBuilder.append(CellsHelper.getStartupPath());
        }
        break;
      case '\007': 
        if (CellsHelper.getLibraryPath() != null) {
          localStringBuilder.append(CellsHelper.getLibraryPath());
        }
        break;
      case '\b': 
        if (CellsHelper.getAltStartPath() != null) {
          localStringBuilder.append(CellsHelper.getAltStartPath());
        }
        break;
      default: 
        if ((i == 1) && (paramWorkbook.e() != null)) {
          localStringBuilder.append(paramWorkbook.e());
        }
        localStringBuilder.append(arrayOfChar[i]);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  String a(Workbook paramWorkbook)
  {
    return a(this.a, paramWorkbook);
  }
  
  void a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    paramArrayOfString2[0] = (paramArrayOfString1[0] = "");
    if ((this.c == 3) || (this.c == 4))
    {
      String[] arrayOfString = zw.d(this.a, '\003');
      paramArrayOfString1[0] = arrayOfString[0];
      paramArrayOfString2[0] = arrayOfString[1];
    }
  }
  
  void a(String paramString1, String paramString2)
  {
    this.a = (paramString1 + '\003' + paramString2);
  }
  
  void b(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    paramArrayOfString1[0] = (paramArrayOfString2[0] = "");
    if ((this.c == 3) || (this.c == 4))
    {
      String[] arrayOfString = zw.d(this.a, '\003');
      paramArrayOfString1[0] = arrayOfString[0];
      paramArrayOfString2[0] = arrayOfString[1];
      if ((paramArrayOfString2[0] != null) && (paramArrayOfString2[0].length() > 2)) {
        if (paramArrayOfString2[0].charAt(1) == ':') {
          paramArrayOfString2[0] = ("file:///" + paramArrayOfString2[0]);
        } else if ((paramArrayOfString2[0].charAt(0) == '\\') && (paramArrayOfString2[0].charAt(1) == '\\')) {
          paramArrayOfString2[0] = ("file:///" + paramArrayOfString2[0]);
        }
      }
    }
  }
  
  void b(String paramString1, String paramString2)
  {
    if (paramString2.startsWith("file:///")) {
      paramString2 = paramString2.substring(8);
    }
    this.a = (paramString1 + '\003' + paramString2);
  }
  
  void a(String paramString, String[] paramArrayOfString, int paramInt)
  {
    this.b = paramString;
    if ((paramString == null) || ("".equals(paramString))) {
      this.a = null;
    }
    this.a = a(paramString, paramInt);
    this.e = paramArrayOfString;
  }
  
  String l()
  {
    if ((this.c == 3) || (this.c == 4))
    {
      String[] arrayOfString = zw.d(this.a, '\003');
      return arrayOfString[1];
    }
    return e(this.a);
  }
  
  String m()
  {
    String str = null;
    if ((this.c == 3) || (this.c == 4))
    {
      String[] arrayOfString = zw.d(this.a, '\003');
      str = arrayOfString[1];
    }
    else
    {
      str = e(this.a);
    }
    if ((str != null) && (str.length() > 2)) {
      if (str.charAt(1) == ':') {
        str = "file:///" + str;
      } else if ((str.charAt(0) == '\\') && (str.charAt(1) == '\\')) {
        str = "file:///" + str;
      }
    }
    return str;
  }
  
  void d(String paramString)
  {
    String str = paramString;
    if (str.startsWith("file:///")) {
      str = str.substring(8);
    }
    this.b = str;
    this.a = a(str, 0);
  }
  
  static String a(String paramString, int paramInt)
  {
    if (paramString.startsWith("file:///")) {
      paramString = paramString.substring(8);
    }
    paramString = paramString.replace('/', '\\');
    if ((paramInt == 0) && (paramString.indexOf('\\') == -1)) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramString.startsWith("http:\\\\")) || (paramString.startsWith("https:\\\\")) || (paramString.startsWith("ftp:\\\\")))
    {
      localStringBuilder.append('\001');
      localStringBuilder.append('\005');
      localStringBuilder.append('\\');
      localStringBuilder.append(paramString);
    }
    else
    {
      char[] arrayOfChar = paramString.toCharArray();
      localStringBuilder.append('\001');
      int i = 0;
      int j = 0;
      if (arrayOfChar.length >= 2) {
        if (arrayOfChar[0] == '\\')
        {
          if (arrayOfChar[1] == '\\')
          {
            j = 1;
            localStringBuilder.append(d(1));
            localStringBuilder.append('@');
            i = 2;
          }
          else
          {
            localStringBuilder.append(d(2));
            i = 1;
          }
        }
        else if ((arrayOfChar[0] == '.') && (arrayOfChar[1] == '.'))
        {
          localStringBuilder.append(d(4));
          i = 3;
        }
        else if (arrayOfChar[1] == ':')
        {
          j = 1;
          localStringBuilder.append(d(1));
          localStringBuilder.append(arrayOfChar[0]);
          i = 3;
        }
      }
      if (j == 0) {
        switch (paramInt)
        {
        case 6: 
        case 7: 
        case 8: 
          if (localStringBuilder.length() < 2) {
            localStringBuilder.append(d(paramInt));
          } else {
            localStringBuilder.insert(1, d(paramInt));
          }
          break;
        }
      }
      while (i < arrayOfChar.length)
      {
        switch (arrayOfChar[i])
        {
        case '\\': 
          localStringBuilder.append(d(3));
          break;
        default: 
          localStringBuilder.append(arrayOfChar[i]);
        }
        i++;
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static String e(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar = paramString.toCharArray();
    switch (arrayOfChar[0])
    {
    case '\000': 
    case '\002': 
      return "";
    case '\001': 
      break;
    default: 
      return paramString;
    }
    for (int i = 1; i < arrayOfChar.length; i++) {
      switch (arrayOfChar[i])
      {
      case '\001': 
        if (i + 1 < arrayOfChar.length)
        {
          if (arrayOfChar[(i + 1)] == '@')
          {
            i++;
            localStringBuilder.append("\\\\");
          }
          else
          {
            localStringBuilder.append(arrayOfChar[(i + 1)]);
            i++;
            localStringBuilder.append(":\\");
          }
        }
        else {
          localStringBuilder.append(arrayOfChar[i]);
        }
        break;
      case '\002': 
        localStringBuilder.append("\\");
        break;
      case '\003': 
        localStringBuilder.append("\\");
        break;
      case '\004': 
        localStringBuilder.append("../");
        break;
      case '\005': 
        i++;
        break;
      case '\006': 
      case '\007': 
      case '\b': 
        break;
      default: 
        localStringBuilder.append(arrayOfChar[i]);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static char d(int paramInt)
  {
    return (char)paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */