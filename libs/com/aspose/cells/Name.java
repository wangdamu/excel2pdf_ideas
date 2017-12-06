package com.aspose.cells;

import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;
import java.util.Iterator;

public class Name
{
  zqq a = null;
  zaqg b = new zaqg();
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private byte j;
  private byte k;
  private WorksheetCollection l;
  String c;
  static ze d = new ze("^[_|\\u0080-\\u7FFF|\\\\|\\p{L}][_|\\u0080-\\u7FFF|\\\\|\\p{L}|\\p{N}|?|.|\\u061F]*");
  private static final za m = new za(new String[] { "CONSOLIDATE_AREA", "AUTO_OPEN", "AUTO_CLOSE", "EXTRACT", "DATABASE", "CRITERIA", "PRINT_AREA", "PRINT_TITLES", "RECORDER", "DATA_FORM", "AUTO_ACTIVATE", "AUTO_DEACTIVATE", "SHEET_TITLE", "_FILTERDATABASE" });
  
  int a()
  {
    return this.b.d;
  }
  
  void a(int paramInt)
  {
    this.b.d = paramInt;
  }
  
  byte[] b()
  {
    return this.b.e;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.b.e = paramArrayOfByte;
  }
  
  String c()
  {
    return this.e;
  }
  
  void a(String paramString)
  {
    this.e = paramString;
  }
  
  String d()
  {
    return this.f;
  }
  
  void b(String paramString)
  {
    this.f = paramString;
  }
  
  String e()
  {
    return this.g;
  }
  
  void c(String paramString)
  {
    this.g = paramString;
  }
  
  String f()
  {
    return this.h;
  }
  
  void d(String paramString)
  {
    this.h = paramString;
  }
  
  public String getComment()
  {
    return this.i;
  }
  
  public void setComment(String value)
  {
    this.i = value;
  }
  
  byte g()
  {
    return this.j;
  }
  
  void a(byte paramByte)
  {
    this.j = paramByte;
  }
  
  WorksheetCollection h()
  {
    return this.l;
  }
  
  Name(WorksheetCollection sheets)
  {
    this.l = sheets;
    this.b = new zaqg();
  }
  
  Name(WorksheetCollection sheets, String text)
  {
    if (!d.d(text)) {
      throw new CellsException(6, "Invalid text of the defined name.");
    }
    this.l = sheets;
    this.b = new zaqg();
    this.b.f = text;
  }
  
  Name(WorksheetCollection sheets, String text, int sheetIndex)
  {
    this(sheets);
    this.b.f = text;
    this.b.g = sheetIndex;
  }
  
  void i()
  {
    if (d.d(getText())) {
      return;
    }
    char[] arrayOfChar = getText().toCharArray();
    StringBuilder localStringBuilder = new StringBuilder(arrayOfChar.length);
    for (int n = 0; n < arrayOfChar.length; n++) {
      switch (arrayOfChar[n])
      {
      case '\000': 
      case '\025': 
      case '\026': 
      case '[': 
      case ']': 
        localStringBuilder.append('_');
        break;
      default: 
        localStringBuilder.append(arrayOfChar[n]);
      }
    }
    if (!zw.b(getText(), zs.a(localStringBuilder))) {
      setText(zs.a(localStringBuilder));
    }
  }
  
  static int e(String paramString)
  {
    int n = -1;
    switch (m.a(paramString.toUpperCase()))
    {
    case 0: 
      n = 0;
      break;
    case 1: 
      n = 1;
      break;
    case 2: 
      n = 2;
      break;
    case 3: 
      n = 3;
      break;
    case 4: 
      n = 4;
      break;
    case 5: 
      n = 5;
      break;
    case 6: 
      n = 6;
      break;
    case 7: 
      n = 7;
      break;
    case 8: 
      n = 8;
      break;
    case 9: 
      n = 9;
      break;
    case 10: 
      n = 10;
      break;
    case 11: 
      n = 11;
      break;
    case 12: 
      n = 12;
      break;
    case 13: 
      n = 13;
      break;
    default: 
      return -1;
    }
    return n;
  }
  
  void f(String paramString)
  {
    if (paramString.startsWith("_xlnm.")) {
      paramString = paramString.substring(6);
    }
    int n = e(paramString);
    if (n != -1)
    {
      this.k = ((byte)n);
      this.b.f = paramString;
      b(0);
    }
  }
  
  int j()
  {
    for (int n = 0; n < h().getNames().getCount(); n++) {
      if (this == h().getNames().get(n)) {
        return n;
      }
    }
    return -1;
  }
  
  public String getText()
  {
    return this.b.f;
  }
  
  public void setText(String value)
  {
    this.l.getNames().a(this, value);
    this.b.f = value;
  }
  
  public String getFullText()
  {
    if (getSheetIndex() != 0)
    {
      String str = this.l.get(this.b.g - 1).getName();
      if (zamm.a(str)) {
        str = "'" + str + "'";
      }
      return str + "!" + this.b.f;
    }
    return this.b.f;
  }
  
  String k()
  {
    return this.b.f;
  }
  
  void g(String paramString)
  {
    this.b.f = paramString;
  }
  
  public String getRefersTo()
  {
    if ((this.c == null) && (this.b.e != null)) {
      this.c = this.l.d().a(-1, -1, this.b.e, 0, 0, true, false);
    }
    return this.c;
  }
  
  public void setRefersTo(String value)
  {
    if ((value != null) && (!"".equals(value)))
    {
      if (zw.b(this.c, value))
      {
        if (this.b.e == null) {}
      }
      else if (value.charAt(0) != '=')
      {
        String str = "=" + value;
        if ((zw.b(this.c, value)) && (this.b.e != null)) {
          return;
        }
        this.c = str;
      }
      else
      {
        this.c = value;
      }
      this.b.e = this.l.y().a(-1, this.c, 0, 0, 2, 32, false, true, false);
    }
    else
    {
      this.c = null;
      if (this.b.e == null) {
        return;
      }
      this.b.e = null;
    }
    l();
  }
  
  void l()
  {
    this.b.a();
    if (this.l.p().getSettings().c)
    {
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext())
      {
        Worksheet localWorksheet = (Worksheet)localIterator.next();
        zabw localzabw = localWorksheet.getCells().a;
        if (localzabw.f != null)
        {
          HashMap localHashMap = new HashMap();
          zaai[] arrayOfzaai = localzabw.b;
          zaca localzaca = new zaca(localWorksheet);
          zacc localzacc = localzaca.j();
          for (int n = localzabw.d - 1; n > -1; n--)
          {
            zaai localzaai1 = arrayOfzaai[n];
            if ((localzaai1 != null) && (localzaai1.c() == 2))
            {
              localzacc.a(localzaai1.b, 0, -1);
              if (localzacc.h())
              {
                Long localLong = null;
                Object localObject;
                if (b()[localzacc.e()] == 1)
                {
                  zbap localzbap = localzacc.a(localzaca);
                  localLong = Long.valueOf(Cell.a(0, localzbap.b(), localzbap.d()));
                  localObject = localHashMap.get(localLong);
                  if (localObject != null)
                  {
                    if (((Boolean)localObject).booleanValue()) {
                      localzaai1.a((byte)0);
                    }
                  }
                  else
                  {
                    zaai localzaai2 = localzaai1.a(localzaca.g, localzbap.b(), localzbap.d());
                    if (localzaai2 != null)
                    {
                      zbf localzbf = localzaai2.a();
                      localzacc.a(localzbf.c(), 0, -1);
                    }
                  }
                }
                else
                {
                  int i1 = 1;
                  while ((i1 != 0) && (localzacc.h())) {
                    switch (localzacc.j())
                    {
                    case 35: 
                    case 57: 
                    case 67: 
                    case 89: 
                    case 99: 
                    case 121: 
                      localObject = localzacc.a(localzaca.p.d);
                      if (((zabf)localObject).c() == this) {
                        i1 = 0;
                      }
                      break;
                    default: 
                      localzacc.k();
                    }
                  }
                  if (localLong != null) {
                    localHashMap.put(localLong, Boolean.valueOf(i1 == 0));
                  }
                  if (i1 == 0) {
                    localzaai1.a((byte)0);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  void h(String paramString)
  {
    this.c = paramString;
    this.b.a();
  }
  
  String m()
  {
    if (this.b.e == null) {
      return null;
    }
    return this.l.d().a(-1, -1, this.b.e, 0, 0, true, false);
  }
  
  void i(String paramString)
  {
    this.c = paramString;
    if ((paramString == null) || ("".equals(paramString))) {
      return;
    }
    this.b.e = this.l.y().a(-1, this.c, 0, 0, 2, 32, false, true, false);
    if (this.l.y().b()) {
      this.b.e = null;
    } else {
      this.c = null;
    }
  }
  
  public String getR1C1RefersTo()
  {
    return this.l.e().a(-1, -1, this.b.e, 0, 0, true);
  }
  
  public void setR1C1RefersTo(String value)
  {
    String str = zauw.b(value, 0, 0);
    setRefersTo(str);
  }
  
  public boolean isReferred()
  {
    int n = this.l.getNames().b(this.b.f, getSheetIndex() - 1);
    if (n == -1) {
      return false;
    }
    for (int i1 = 0; i1 < this.l.getCount(); i1++)
    {
      Worksheet localWorksheet = this.l.get(i1);
      zabw localzabw = localWorksheet.getCells().a;
      Shape localShape;
      if (localzabw.c > 0)
      {
        localObject1 = localzabw.b;
        for (int i3 = localzabw.d - 1; i3 > -1; i3--) {
          if (localObject1[i3] != null)
          {
            localShape = localObject1[i3];
            if (localShape.a() != null)
            {
              if (zaaq.a(localShape.a().c(), -1, -1, n, h())) {
                return true;
              }
            }
            else if (zaaq.a(localShape.b, -1, -1, n, h())) {
              return true;
            }
          }
        }
      }
      if (localWorksheet.w() != null)
      {
        if ((localWorksheet.getCharts().getCount() > 0) && (localWorksheet.getCharts().a(n))) {
          return true;
        }
        localObject1 = localWorksheet.getShapes().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localShape = (Shape)((Iterator)localObject1).next();
          if (localShape.i(n)) {
            return true;
          }
        }
      }
      Object localObject1 = localWorksheet.getConditionalFormattings();
      Object localObject2;
      for (int i2 = 0; i2 < ((ConditionalFormattingCollection)localObject1).getCount(); i2++)
      {
        FormatConditionCollection localFormatConditionCollection = ((ConditionalFormattingCollection)localObject1).get(i2);
        for (int i5 = 0; i5 < localFormatConditionCollection.getCount(); i5++)
        {
          localObject2 = localFormatConditionCollection.get(i5);
          ((FormatCondition)localObject2).f();
          byte[] arrayOfByte;
          if (((FormatCondition)localObject2).a() != null)
          {
            arrayOfByte = ((FormatCondition)localObject2).a();
            if (zaaq.a(arrayOfByte, -1, arrayOfByte.length - 1, n, this.l)) {
              return true;
            }
          }
          if (((FormatCondition)localObject2).c() != null)
          {
            arrayOfByte = ((FormatCondition)localObject2).c();
            if (zaaq.a(arrayOfByte, -1, arrayOfByte.length - 1, n, this.l)) {
              return true;
            }
          }
        }
      }
      ValidationCollection localValidationCollection = localWorksheet.getValidations();
      for (int i4 = 0; i4 < localValidationCollection.getCount(); i4++)
      {
        Validation localValidation = localValidationCollection.get(i4);
        if (localValidation.c != null)
        {
          localObject2 = (byte[])localValidation.c;
          if (zaaq.a((byte[])localObject2, 0, localObject2.length - 1, n, this.l)) {
            return true;
          }
        }
        if (localValidation.d != null)
        {
          localObject2 = (byte[])localValidation.d;
          if (zaaq.a((byte[])localObject2, 0, localObject2.length - 1, n, this.l)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public boolean isVisible()
  {
    return !n();
  }
  
  public void setVisible(boolean value)
  {
    a(!value);
  }
  
  boolean n()
  {
    return (this.b.d & 0xFFFF & 0x1) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b.d |= 0x1;
    } else {
      this.b.d &= 0xFFFE;
    }
  }
  
  boolean o()
  {
    return (this.b.d & 0xFFFF & 0x4) != 0;
  }
  
  boolean p()
  {
    return (this.b.d & 0xFFFF & 0x8) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b.d |= 0x8;
    } else {
      this.b.d &= 0xFF7F;
    }
  }
  
  void q()
  {
    this.c = null;
  }
  
  int r()
  {
    if ((this.b.d & 0xFFFF & 0x20) != 0) {
      return 0;
    }
    if ((this.b.d & 0xFFFF & 0x4) != 0) {
      return 1;
    }
    return 2;
  }
  
  void b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      this.b.d |= 0x20;
      break;
    case 1: 
      this.b.d |= 0x4;
      break;
    case 2: 
      this.b.d = (this.b.d & 0xFFFF & 0xFFDB);
    }
  }
  
  public int getSheetIndex()
  {
    return this.b.g;
  }
  
  public void setSheetIndex(int value)
  {
    this.b.g = value;
  }
  
  int s()
  {
    int n = -1;
    int i1 = 4;
    if (!h().p().h()) {
      i1 = 2;
    }
    if ((this.b.e != null) && (this.b.e.length > i1)) {
      switch (this.b.e[i1])
      {
      case 58: 
      case 59: 
      case 90: 
      case 91: 
      case 122: 
      case 123: 
        int i2 = zc.e(this.b.e, i1 + 1) & 0xFFFF;
        n = this.l.r().d(i2, this.l.v());
        break;
      }
    }
    return n;
  }
  
  byte t()
  {
    return this.k;
  }
  
  void a(int paramInt, CellArea paramCellArea)
  {
    this.b.e = zabx.a(this.l, paramInt, paramCellArea);
    this.c = null;
    l();
  }
  
  static String b(byte paramByte)
  {
    String str = null;
    switch (paramByte)
    {
    case 0: 
      str = "CONSOLIDATE_AREA";
      break;
    case 1: 
      str = "AUTO_OPEN";
      break;
    case 2: 
      str = "AUTO_CLOSE";
      break;
    case 3: 
      str = "EXTRACT";
      break;
    case 4: 
      str = "DATABASE";
      break;
    case 5: 
      str = "CRITERIA";
      break;
    case 6: 
      str = "PRINT_AREA";
      break;
    case 7: 
      str = "PRINT_TITLES";
      break;
    case 8: 
      str = "RECORDER";
      break;
    case 9: 
      str = "DATA_FORM";
      break;
    case 10: 
      str = "AUTO_ACTIVATE";
      break;
    case 11: 
      str = "AUTO_DEACTIVATE";
      break;
    case 12: 
      str = "SHEET_TITLE";
      break;
    case 13: 
      str = "_FILTERDATABASE";
      break;
    }
    return str;
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.b.d = zc.e(paramArrayOfByte, 0);
    this.j = paramArrayOfByte[2];
    this.b.g = (zc.e(paramArrayOfByte, 8) & 0xFFFF);
    int n = 14;
    int i1 = paramArrayOfByte[3];
    if (r() == 0)
    {
      this.k = paramArrayOfByte[15];
      n = 16;
      this.b.f = b(paramArrayOfByte[15]);
    }
    else
    {
      i2 = paramArrayOfByte[14];
      Object localObject;
      if (i2 == 0)
      {
        localObject = new byte[2 * (i1 & 0xFF)];
        for (int i4 = 0; i4 < 2 * (i1 & 0xFF); i4++) {
          if (i4 % 2 == 0) {
            localObject[i4] = paramArrayOfByte[(15 + i4 / 2)];
          }
        }
        this.b.f = Encoding.getUnicode().a((byte[])localObject);
        n += (i1 & 0xFF) + 1;
      }
      else
      {
        i1 = (byte)((i1 & 0xFF) << 1);
        if (15 + (i1 & 0xFF) > paramArrayOfByte.length) {
          i1 = (byte)(paramArrayOfByte.length - 15);
        }
        this.b.f = Encoding.getUnicode().a(paramArrayOfByte, 15, i1 & 0xFF);
        n += (i1 & 0xFF) + 1;
      }
      if ((this.b.f != null) && (this.b.f.indexOf(' ') != -1)) {
        this.b.f = zw.a(this.b.f, " ", "");
      }
      if (this.b.f != null)
      {
        localObject = this.b.f.toUpperCase();
        switch (m.a((String)localObject))
        {
        case 0: 
          this.k = 0;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 1: 
          this.k = 1;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 2: 
          this.k = 2;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 3: 
          this.k = 3;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 4: 
          this.k = 4;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 5: 
          this.k = 5;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 6: 
          this.k = 6;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 7: 
          this.k = 7;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 8: 
          this.k = 8;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 9: 
          this.k = 9;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 10: 
          this.k = 10;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 11: 
          this.k = 11;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 12: 
          this.k = 12;
          this.b.f = ((String)localObject);
          b(0);
          break;
        case 13: 
          this.k = 13;
          this.b.f = ((String)localObject);
          b(0);
          break;
        }
      }
    }
    int i2 = zc.e(paramArrayOfByte, 4) & 0xFFFF;
    int i3 = (paramArrayOfByte[10] & 0xFF) + (paramArrayOfByte[11] & 0xFF) + (paramArrayOfByte[12] & 0xFF) + (paramArrayOfByte[13] & 0xFF);
    if (i3 == 0)
    {
      if (i2 != 0)
      {
        this.b.e = new byte[paramArrayOfByte.length - n + 2];
        System.arraycopy(paramArrayOfByte, 4, this.b.e, 0, 2);
        System.arraycopy(paramArrayOfByte, n, this.b.e, 2, this.b.e.length - 2);
      }
    }
    else
    {
      if (i2 != 0)
      {
        this.b.e = new byte[i2 + 2];
        System.arraycopy(paramArrayOfByte, 4, this.b.e, 0, 2);
        System.arraycopy(paramArrayOfByte, n, this.b.e, 2, this.b.e.length - 2);
        n += this.b.e.length - 2;
      }
      if (paramArrayOfByte[10] != 0) {
        if (paramArrayOfByte[n] == 0)
        {
          this.e = Encoding.getASCII().a(paramArrayOfByte, n + 1, paramArrayOfByte[10] & 0xFF);
          n += 1 + (paramArrayOfByte[10] & 0xFF);
        }
        else
        {
          this.e = Encoding.getUnicode().a(paramArrayOfByte, n + 1, (paramArrayOfByte[10] & 0xFF) * 2);
          n += 1 + (paramArrayOfByte[10] & 0xFF) * 2;
        }
      }
      if (paramArrayOfByte[11] != 0) {
        if (paramArrayOfByte[n] == 0)
        {
          this.f = Encoding.getASCII().a(paramArrayOfByte, n + 1, paramArrayOfByte[11] & 0xFF);
          n += 1 + (paramArrayOfByte[11] & 0xFF);
        }
        else
        {
          this.f = Encoding.getUnicode().a(paramArrayOfByte, n + 1, (paramArrayOfByte[11] & 0xFF) * 2);
          n += 1 + (paramArrayOfByte[11] & 0xFF) * 2;
        }
      }
      if (paramArrayOfByte[12] != 0) {
        if (paramArrayOfByte[n] == 0)
        {
          this.g = Encoding.getASCII().a(paramArrayOfByte, n + 1, paramArrayOfByte[12] & 0xFF);
          n += 1 + (paramArrayOfByte[12] & 0xFF);
        }
        else
        {
          this.g = Encoding.getUnicode().a(paramArrayOfByte, n + 1, (paramArrayOfByte[12] & 0xFF) * 2);
          n += 1 + (paramArrayOfByte[12] & 0xFF) * 2;
        }
      }
      if (paramArrayOfByte[13] != 0) {
        if (paramArrayOfByte[n] == 0)
        {
          this.h = Encoding.getASCII().a(paramArrayOfByte, n + 1, paramArrayOfByte[13] & 0xFF);
          n += 1 + (paramArrayOfByte[13] & 0xFF);
        }
        else
        {
          this.h = Encoding.getUnicode().a(paramArrayOfByte, n + 1, (paramArrayOfByte[13] & 0xFF) * 2);
          n += 1 + (paramArrayOfByte[13] & 0xFF) * 2;
        }
      }
    }
  }
  
  byte[] u()
  {
    if (this.b.e == null) {
      return null;
    }
    if (h().p().h())
    {
      arrayOfByte = new byte[this.b.e.length - 8];
      System.arraycopy(this.b.e, 4, arrayOfByte, 0, arrayOfByte.length);
      return arrayOfByte;
    }
    byte[] arrayOfByte = new byte[this.b.e.length - 2];
    System.arraycopy(this.b.e, 2, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  void a(Name paramName, CopyOptions paramCopyOptions)
  {
    this.k = paramName.k;
    if (paramCopyOptions.a()) {
      this.b.g = paramName.b.g;
    }
    this.b.d = paramName.b.d;
    this.b.f = paramName.b.f;
    this.b.e = zaam.a(paramName.b.e, -1, 0, 0, paramCopyOptions);
    this.i = paramName.i;
    this.e = paramName.e;
    this.f = paramName.f;
    this.g = paramName.g;
    this.j = paramName.j;
    if ((paramCopyOptions.a()) || (this.b.e == null)) {
      this.c = paramName.c;
    }
    this.h = paramName.h;
  }
  
  void v()
  {
    this.b.g -= 1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Aspose.Cells.Name [ ").append(getText()).append("; ReferTo:").append(getRefersTo()).append("]");
    return zs.a(localStringBuilder);
  }
  
  private zaca x()
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    zaca localzaca = new zaca(this.l.get(this.b.g > 1 ? this.b.g - 1 : 0), 3, localCalculationOptions);
    localzaca.a(this.b);
    localzaca.h = true;
    localzaca.l = CellArea.createCellArea(0, 0, 2, 2);
    return localzaca;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    zaaq.a(this.l.get(paramInt1), false, paramInt2, paramInt3, paramInt2, paramInt2, -1, -1, this.b.e);
    this.c = null;
    l();
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3)
  {
    zaaq.b(this.l.get(paramInt1), false, paramInt2, paramInt3, paramInt2, paramInt2, -1, -1, this.b.e);
    this.c = null;
    l();
  }
  
  public Range[] getRanges()
  {
    return c(17);
  }
  
  public Range[] getRanges(boolean recalculate)
  {
    return c(recalculate ? 17 : 1);
  }
  
  Range[] c(int paramInt)
  {
    if (this.b.a(h())) {
      return null;
    }
    zaie localzaie = null;
    zaca localzaca = null;
    Object localObject;
    if ((paramInt & 0x10) != 0)
    {
      localzaca = x();
      try
      {
        zaag localzaag = new zaag(localzaca, this.b.e, 0, -1);
        localzaie = localzaag.a();
      }
      catch (Exception localException1)
      {
        localzaca.c();
        return null;
      }
      localzaie = zabt.c(localzaie, localzaca);
    }
    else if (this.b.a == null)
    {
      localzaca = x();
      try
      {
        zabf localzabf = new zabf(32, this, -1);
        localzaie = localzabf.d(localzaca);
      }
      catch (Exception localException2)
      {
        localzaca.c();
        return null;
      }
      localzaie = zabt.c(localzaie, localzaca);
    }
    else
    {
      localzaie = this.b.a;
      switch (localzaie.b())
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 6: 
      case 12: 
      case 17: 
      case 19: 
        return null;
      case 9: 
        localObject = zabx.a(this.l, ((zabo)localzaie).o(), -1);
        if (localObject == null) {
          return null;
        }
        return new Range[] { localObject };
      }
      localzaca = x();
      localzaie = zabt.c(localzaie, localzaca);
    }
    paramInt &= 0xF;
    if (localzaie.b() == 9)
    {
      localObject = zabx.a(this.l, ((zabo)localzaie).o(), -1);
      localzaca.c();
      if (localObject == null) {
        return null;
      }
      return new Range[] { localObject };
    }
    if ((localzaie.b() == 5) && (((zabh)localzaie).a() == 16))
    {
      localObject = zabt.a((zabk)localzaie);
      Range[] arrayOfRange1 = new Range[localObject.length];
      int n = 0;
      for (int i1 = 0; i1 < localObject.length; i1++)
      {
        localzaie = zabt.c(localObject[i1], localzaca);
        if (localzaie.b() == 9)
        {
          Range localRange = zabx.a(this.l, ((zabo)localzaie).o(), -1);
          if ((paramInt == 2) || (localRange != null))
          {
            arrayOfRange1[n] = localRange;
            n++;
          }
          else if (paramInt == 0)
          {
            localzaca.c();
            return null;
          }
        }
        else if (paramInt == 2)
        {
          n++;
        }
        else if (paramInt == 0)
        {
          localzaca.c();
          return null;
        }
      }
      localzaca.c();
      if (n < arrayOfRange1.length)
      {
        Range[] arrayOfRange2 = new Range[n];
        System.arraycopy(arrayOfRange1, 0, arrayOfRange2, 0, n);
        return arrayOfRange2;
      }
      return arrayOfRange1;
    }
    localzaca.c();
    return null;
  }
  
  public Range getRange()
  {
    return getRange(true);
  }
  
  public Range getRange(boolean recalculate)
  {
    if (this.b.a(h())) {
      return null;
    }
    zaie localzaie = null;
    if (recalculate)
    {
      localObject = x();
      try
      {
        zaag localzaag = new zaag((zaca)localObject, this.b.e, 0, -1);
        localzaie = localzaag.a();
      }
      catch (Exception localException2)
      {
        return null;
      }
      localzaie = zabt.c(localzaie, (zaca)localObject);
      ((zaca)localObject).c();
      localObject = null;
      if (localzaie.b() != 9) {
        return null;
      }
    }
    else if (this.b.a == null)
    {
      localObject = x();
      try
      {
        zabf localzabf = new zabf(32, this, -1);
        localzaie = localzabf.d((zaca)localObject);
      }
      catch (Exception localException3)
      {
        ((zaca)localObject).c();
        return null;
      }
      localzaie = zabt.c(localzaie, (zaca)localObject);
      ((zaca)localObject).c();
      localObject = null;
      if (localzaie.b() != 9) {
        return null;
      }
    }
    else
    {
      localzaie = this.b.a;
      switch (localzaie.b())
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 6: 
      case 12: 
      case 17: 
      case 19: 
        return null;
      case 9: 
        break;
      case 5: 
      case 7: 
      case 8: 
      case 10: 
      case 11: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      case 18: 
      default: 
        localObject = x();
        localzaie = zabt.c(localzaie, (zaca)localObject);
        ((zaca)localObject).c();
        localObject = null;
        if (localzaie.b() != 9) {
          return null;
        }
        break;
      }
    }
    Object localObject = zabx.a(this.l, ((zabo)localzaie).o(), -1);
    if (localObject == null) {
      return null;
    }
    if (this.b.g != 0) {
      ((Range)localObject).a(this.l.get(this.b.g - 1).getName() + "!" + this.b.f);
    } else {
      ((Range)localObject).a(this.b.f);
    }
    return (Range)localObject;
  }
  
  public Range getRange(int sheetIndex, int row, int column)
  {
    if (this.b.a(h())) {
      return null;
    }
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    zaca localzaca = new zaca(this.l.get(sheetIndex), 3, localCalculationOptions);
    localzaca.a(this.b);
    localzaca.d = row;
    localzaca.e = ((short)column);
    localzaca.h = true;
    localzaca.l = CellArea.createCellArea(row, column, row + 2, column + 2);
    zaie localzaie = null;
    try
    {
      zaag localzaag = new zaag(localzaca, this.b.e, 0, -1);
      localzaie = localzaag.a();
    }
    catch (Exception localException1)
    {
      localzaca.c();
      return null;
    }
    localzaie = zabt.c(localzaie, localzaca);
    if (localzaie.b() != 9)
    {
      localzaca.c();
      return null;
    }
    Range localRange = ((zabo)localzaie).o().b(localzaca);
    if (localRange != null) {
      if (this.b.g != 0) {
        localRange.a(this.l.get(this.b.g - 1).getName() + "!" + this.b.f);
      } else {
        localRange.a(this.b.f);
      }
    }
    localzaca.c();
    return localRange;
  }
  
  void w()
  {
    this.b.e = null;
    this.c = null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Name.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */