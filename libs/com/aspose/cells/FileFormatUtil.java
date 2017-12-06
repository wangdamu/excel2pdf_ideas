package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class FileFormatUtil
{
  private static final com.aspose.cells.b.c.a.za a = new com.aspose.cells.b.c.a.za(new String[] { ".csv", ".txt", "application/vnd.oasis.opendocument.spreadsheet", "application/vnd.oasis.opendocument.spreadsheet-template", "application/vnd.oasis.opendocument.text", "application/vnd.oasis.opendocument.text-template", "application/vnd.oasis.opendocument.presentation", "application/vnd.oasis.opendocument.formula", "application/vnd.oasis.opendocument.graphics", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml", "application/vnd.ms-excel.sheet.macroEnabled.main+xml", "application/vnd.ms-excel.template.macroEnabled.main+xml", "application/vnd.ms-excel.sheet.binary.macroEnabled.main", "application/vnd.ms-word.document.macroEnabled.main+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml", "application/vnd.ms-word.template.macroEnabledTemplate.main+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.presentation.main+xml", "application/vnd.ms-powerpoint.presentation.macroEnabled.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.template.main+xml", "application/vnd.ms-powerpoint.template.macroEnabled.main+xml", "application/vnd.ms-powerpoint.slideshow.macroEnabled.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideshow.main+xml", "application/vnd.ms-visio.drawing.main+xml", "application/vnd.ms-package.xps-fixeddocumentsequence+xml", ".xls", ".xlt", ".xlsx", ".xlsm", ".xlam", ".xml", ".xltx", ".xlsb", ".xltm", ".htm", ".html", ".mht", ".mhtml", ".pdf", ".ods", ".ots", ".xps", ".tiff", ".svg", ".dif", ".docx", ".docm", ".dotm", ".dotx", ".pptx", ".pptm", ".ppsx", ".ppsm", ".potx", ".potm", ".sldx", ".doc", ".ppt", ".msg", ".vsd", ".vsdx" });
  
  static boolean a(zm paramzm)
    throws Exception
  {
    com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(paramzm);
    int i = localza.q();
    paramzm.a(-4L, 1);
    return i == 67324752;
  }
  
  static boolean a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 8)) {
      return false;
    }
    long l = zc.c(paramArrayOfByte, 0);
    return l == -2226271756974174256L;
  }
  
  static boolean a(zaoz paramzaoz)
    throws Exception
  {
    return paramzaoz.a("CONTENTS") == null;
  }
  
  static boolean b(zaoz paramzaoz)
    throws Exception
  {
    return paramzaoz.a("\001Ole10Native") != null;
  }
  
  static String a(ImageFormat paramImageFormat)
  {
    return "." + com.aspose.cells.a.d.zcc.a(paramImageFormat);
  }
  
  static FileFormatInfo b(zm paramzm)
    throws Exception
  {
    return a(null, paramzm, null);
  }
  
  public static FileFormatInfo detectFileFormat(String filePath)
    throws Exception
  {
    ze localze = zd.a(filePath, 3, 1, 3);
    try
    {
      FileFormatInfo localFileFormatInfo = a(filePath, localze, null);
      return localFileFormatInfo;
    }
    finally
    {
      if (localze != null) {
        localze.a();
      }
    }
  }
  
  static boolean c(zaoz paramzaoz)
  {
    zaoz localzaoz1 = paramzaoz.b("\006DataSpaces");
    if (localzaoz1 == null) {
      return false;
    }
    zaoz localzaoz2 = localzaoz1.b("DataSpaceInfo");
    if (localzaoz2 == null) {
      return false;
    }
    List localList = localzaoz2.d();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.toUpperCase().indexOf("DRM") != -1) {
        return true;
      }
    }
    return false;
  }
  
  static boolean[] a(zqj paramzqj)
    throws Exception
  {
    boolean[] arrayOfBoolean = new boolean[2];
    int i = 0;
    int j = 0;
    byte[] arrayOfByte1 = new byte[2];
    for (;;)
    {
      i = paramzqj.b(arrayOfByte1) & 0xFFFF;
      switch (i)
      {
      case 96: 
        arrayOfBoolean[1] = true;
        return arrayOfBoolean;
      case 47: 
        String str1 = "VelvetSweatshop";
        j = paramzqj.b(arrayOfByte1) & 0xFFFF;
        byte[] arrayOfByte2 = new byte[j];
        paramzqj.a(arrayOfByte2);
        if ((arrayOfByte2[0] == 0) && (arrayOfByte2[1] == 0))
        {
          int k = zc.e(arrayOfByte2, 2);
          int n = zc.e(arrayOfByte2, 4);
          arrayOfBoolean[0] = (!zca.a(str1, n, k) ? 1 : false);
        }
        else if (arrayOfByte2[4] == 1)
        {
          byte[] arrayOfByte3 = new byte[16];
          byte[] arrayOfByte4 = new byte[16];
          byte[] arrayOfByte5 = new byte[16];
          System.arraycopy(arrayOfByte2, 6, arrayOfByte3, 0, 16);
          System.arraycopy(arrayOfByte2, 22, arrayOfByte4, 0, 16);
          System.arraycopy(arrayOfByte2, 38, arrayOfByte5, 0, 16);
          try
          {
            ztl localztl = new ztl(str1, arrayOfByte3, arrayOfByte4, arrayOfByte5);
            arrayOfBoolean[0] = false;
          }
          catch (Exception localException1)
          {
            arrayOfBoolean[0] = true;
          }
        }
        else
        {
          int m = zc.a(arrayOfByte2, 10);
          int i1 = 10;
          long l1 = zc.d(arrayOfByte2, i1 + 12);
          long l2 = zc.d(arrayOfByte2, i1 + 16);
          long l3 = zc.d(arrayOfByte2, i1 + 20);
          long l4 = zc.d(arrayOfByte2, i1 + 24);
          String str2 = Encoding.getUnicode().a(arrayOfByte2, i1 + 36, m - 34);
          i1 = 14 + m;
          m = zc.a(arrayOfByte2, i1);
          i1 += 4;
          byte[] arrayOfByte6 = new byte[m];
          byte[] arrayOfByte7 = new byte[m];
          System.arraycopy(arrayOfByte2, i1, arrayOfByte6, 0, m);
          i1 += m;
          System.arraycopy(arrayOfByte2, i1, arrayOfByte7, 0, m);
          i1 += m;
          m = zc.a(arrayOfByte2, i1);
          byte[] arrayOfByte8 = new byte[m];
          i1 += 4;
          System.arraycopy(arrayOfByte2, i1, arrayOfByte8, 0, m);
          i1 += m;
          try
          {
            zcc localzcc = new zcc(str1, arrayOfByte6, str2, l4, 0L, l2, l1, l3);
            arrayOfBoolean[0] = (!localzcc.b(arrayOfByte7, arrayOfByte8) ? 1 : false);
          }
          catch (Exception localException2)
          {
            arrayOfBoolean[0] = true;
          }
        }
        break;
      case 134: 
      case 2057: 
        j = paramzqj.b(arrayOfByte1) & 0xFFFF;
        paramzqj.a(j);
      }
    }
    return arrayOfBoolean;
  }
  
  static FileFormatInfo a(String paramString, zm paramzm, zaoz paramzaoz)
    throws Exception
  {
    FileFormatInfo localFileFormatInfo = new FileFormatInfo();
    long l1 = 0L;
    com.aspose.cells.b.a.d.za localza = null;
    long l2 = -2226271756974174256L;
    if (paramzm != null)
    {
      if (paramzm.h() <= 8L)
      {
        localFileFormatInfo.a = 255;
        return localFileFormatInfo;
      }
      l1 = paramzm.i();
      localza = new com.aspose.cells.b.a.d.za(paramzm);
      l2 = localza.s();
      paramzm.a(-8L, 1);
    }
    int i = (int)(l2 & 0xFFFF);
    zxf localzxf = null;
    Object localObject1;
    Object localObject2;
    if (l2 == -2226271756974174256L)
    {
      try
      {
        if (paramzaoz == null)
        {
          localzxf = new zxf(paramzm, true);
          paramzaoz = localzxf.a();
        }
      }
      catch (Exception localException)
      {
        throw new CellsException(18, "This file is corrupted.");
      }
      localFileFormatInfo.d = paramzaoz.a();
      localFileFormatInfo.c = c(paramzaoz);
      if (paramzaoz.a("Workbook") != null)
      {
        localFileFormatInfo.a = 5;
        localObject1 = paramzaoz.a("Workbook");
        localObject2 = a(new zqj((com.aspose.cells.b.a.d.zh)localObject1));
        localFileFormatInfo.b = localObject2[0];
        if (localObject2[1] != 0) {
          localFileFormatInfo.a = 52;
        }
        ((com.aspose.cells.b.a.d.zh)localObject1).a(0L, 0);
      }
      else if (paramzaoz.a("WisoDocument") != null)
      {
        localFileFormatInfo.a = 36;
      }
      else if (paramzaoz.a("WordDocument") != null)
      {
        localFileFormatInfo.a = 31;
      }
      else if (paramzaoz.a("PowerPoint Document") != null)
      {
        localFileFormatInfo.a = 32;
      }
      else if (paramzaoz.a("EncryptedPackage") != null)
      {
        localFileFormatInfo.a = 46;
        if (localzxf != null) {
          localFileFormatInfo.b = zto.a(localzxf);
        } else {
          localFileFormatInfo.b = true;
        }
      }
      else if (paramzaoz.a("Book") != null)
      {
        localObject1 = paramzaoz.a("Book");
        localObject2 = new byte[6];
        ((com.aspose.cells.b.a.d.zh)localObject1).a((byte[])localObject2, 0, localObject2.length);
        if ((localObject2[0] == 9) && (localObject2[1] == 8) && (localObject2[2] == 16) && (localObject2[3] == 0) && (localObject2[4] == 0) && (localObject2[5] == 6))
        {
          localFileFormatInfo.a = 5;
          ((com.aspose.cells.b.a.d.zh)localObject1).a(0L, 0);
          boolean[] arrayOfBoolean = a(new zqj((com.aspose.cells.b.a.d.zh)localObject1));
          localFileFormatInfo.b = arrayOfBoolean[0];
          if (arrayOfBoolean[1] != 0) {
            localFileFormatInfo.a = 52;
          }
          ((com.aspose.cells.b.a.d.zh)localObject1).a(0L, 0);
        }
        else
        {
          localFileFormatInfo.a = 22;
        }
      }
      else if (paramzaoz.a("\001Ole10Native") != null)
      {
        localFileFormatInfo.a = 35;
      }
      else if (paramzaoz.a("Equation Native") != null)
      {
        localFileFormatInfo.a = 34;
      }
      else if (paramzaoz.b("MAPIMessage") != null)
      {
        localFileFormatInfo.a = 33;
      }
      else if (paramzaoz.a().a(zaej.l) == 0)
      {
        localFileFormatInfo.a = 33;
      }
      localObject1 = paramzaoz.c().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (((String)localObject2).startsWith("__substg1.0"))
        {
          localFileFormatInfo.a = 33;
          break;
        }
      }
      if (paramzm != null) {
        paramzm.a(l1, 0);
      }
    }
    else if (i == 1033)
    {
      localFileFormatInfo.a = 23;
    }
    else if (i == 521)
    {
      localFileFormatInfo.a = 24;
    }
    else if (i == 9)
    {
      localFileFormatInfo.a = 25;
    }
    else if ((l2 & 0xFFFFFFFF) == 526345L)
    {
      localFileFormatInfo.a = 22;
    }
    else if ((l2 & 0xFFFFFFFF) == 1178882085L)
    {
      localFileFormatInfo.a = 13;
    }
    else if ((l2 & 0xFFFFFFFF) == 67324752L)
    {
      localObject1 = zi.a(paramzm);
      if (!a((zi)localObject1, localFileFormatInfo)) {
        if (((zi)localObject1).a("content.xml", true) != -1) {
          a(localFileFormatInfo, (zi)localObject1);
        } else if (((zi)localObject1).a("index.xml", true) != -1) {
          localFileFormatInfo.a = 56;
        }
      }
      ((zi)localObject1).b();
      paramzm.a(l1, 0);
    }
    else if ((l2 & 0xFFFFFFFF) == 1178882085L)
    {
      localFileFormatInfo.a = 13;
    }
    else if ((l2 & 0xFFFF) == 19778L)
    {
      localFileFormatInfo.a = 54;
    }
    else
    {
      int j = zamm.a(paramzm, localza, l2);
      switch (j)
      {
      case 1: 
        localObject2 = new zcjy(paramzm);
        ((zcjy)localObject2).k();
        if ("Workbook".equals(((zcjy)localObject2).q())) {
          localFileFormatInfo.a = 15;
        } else {
          localFileFormatInfo.a = 51;
        }
        paramzm.a(0L, 0);
        break;
      case 2: 
        localFileFormatInfo.a = 12;
        break;
      case 3: 
        localFileFormatInfo.a = 17;
        break;
      }
      if ((localFileFormatInfo.a == 255) && (paramString != null))
      {
        localObject2 = zk.d(paramString);
        if (localObject2 != null) {
          switch (a.a(((String)localObject2).toLowerCase()))
          {
          case 0: 
            localFileFormatInfo.a = 1;
            break;
          case 1: 
            localFileFormatInfo.a = 11;
          }
        }
      }
    }
    return localFileFormatInfo;
  }
  
  static void a(FileFormatInfo paramFileFormatInfo, zi paramzi)
    throws Exception
  {
    paramFileFormatInfo.a = 14;
    zcjy localzcjy = zauy.a(paramzi, "META-INF/manifest.xml", true);
    if (localzcjy == null) {
      return;
    }
    localzcjy.k();
    if (localzcjy.o()) {
      return;
    }
    int i = 0;
    int j = 0;
    localzcjy.d();
    while (zauz.a(localzcjy)) {
      if ("file-entry".equals(localzcjy.q()))
      {
        String str = localzcjy.a("media-type");
        if (str == null)
        {
          localzcjy.a();
        }
        else
        {
          if (i == 0) {
            switch (a.a(str))
            {
            case 2: 
              i = 1;
              paramFileFormatInfo.a = 14;
              break;
            case 3: 
              i = 1;
              paramFileFormatInfo.a = 55;
              break;
            case 4: 
              i = 1;
              paramFileFormatInfo.a = 47;
              break;
            case 5: 
              i = 1;
              paramFileFormatInfo.a = 53;
              break;
            case 6: 
              i = 1;
              paramFileFormatInfo.a = 48;
              break;
            case 7: 
              i = 1;
              paramFileFormatInfo.a = 49;
              break;
            case 8: 
              i = 1;
              paramFileFormatInfo.a = 50;
              break;
            }
          }
          if ((j == 0) && ("text/xml".equals(str)) && ("content.xml".equals(localzcjy.a("full-path"))))
          {
            j = 1;
            if (!localzcjy.o()) {
              localzcjy.d();
            }
          }
          else
          {
            while (zauz.a(localzcjy))
            {
              if ("encryption-data".equals(localzcjy.q())) {
                paramFileFormatInfo.b = true;
              }
              localzcjy.a();
              continue;
              localzcjy.a();
            }
          }
          if ((i != 0) && (j != 0)) {
            return;
          }
        }
      }
    }
  }
  
  private static boolean a(zi paramzi, FileFormatInfo paramFileFormatInfo)
    throws Exception
  {
    zcjy localzcjy = zauy.a(paramzi, "[Content_Types].xml", true);
    paramFileFormatInfo.a = 255;
    if (localzcjy == null) {
      return false;
    }
    localzcjy.k();
    if (localzcjy.o()) {
      return true;
    }
    localzcjy.d();
    while (localzcjy.s() != 4)
    {
      localzcjy.k();
      if (localzcjy.s() != 1)
      {
        localzcjy.a();
      }
      else
      {
        String str = localzcjy.a("ContentType");
        switch (a.a(str))
        {
        case 9: 
          paramFileFormatInfo.a = 6;
          break;
        case 10: 
          paramFileFormatInfo.a = 8;
          break;
        case 11: 
          paramFileFormatInfo.a = 7;
          break;
        case 12: 
          paramFileFormatInfo.a = 9;
          break;
        case 13: 
          paramFileFormatInfo.a = 16;
          break;
        case 14: 
          paramFileFormatInfo.a = 38;
          break;
        case 15: 
          paramFileFormatInfo.a = 27;
          break;
        case 16: 
          paramFileFormatInfo.a = 40;
          break;
        case 17: 
          paramFileFormatInfo.a = 39;
          break;
        case 18: 
          paramFileFormatInfo.a = 26;
          break;
        case 19: 
          paramFileFormatInfo.a = 41;
          break;
        case 20: 
          paramFileFormatInfo.a = 42;
          break;
        case 21: 
          paramFileFormatInfo.a = 43;
          break;
        case 22: 
          paramFileFormatInfo.a = 45;
          break;
        case 23: 
          paramFileFormatInfo.a = 44;
          break;
        case 24: 
          paramFileFormatInfo.a = 37;
          break;
        case 25: 
          paramFileFormatInfo.a = 20;
          break;
        }
        if (paramFileFormatInfo.a != 255) {
          break;
        }
        localzcjy.a();
      }
    }
    return true;
  }
  
  static com.aspose.cells.b.a.zh a(int paramInt)
  {
    switch (paramInt)
    {
    case 36: 
      return zaej.j;
    case 31: 
      return zaej.k;
    case 33: 
      return zaej.l;
    case 32: 
      return zaej.m;
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 15: 
    case 16: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 52: 
      return zaej.n;
    case 26: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
      return zaej.c;
    case 27: 
      return zaej.d;
    case 38: 
      return zaej.e;
    case 39: 
      return zaej.f;
    case 40: 
      return zaej.g;
    case 13: 
      return zaej.h;
    case 54: 
      return zaej.i;
    }
    return zaej.b;
  }
  
  public static FileFormatInfo detectFileFormat(InputStream stream)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(stream);
    return b(localzh);
  }
  
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 5: 
    case 52: 
      return 5;
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 46: 
      return 6;
    case 16: 
      return 16;
    case 15: 
      return 15;
    case 12: 
      return 12;
    case 17: 
      return 13;
    case 14: 
    case 55: 
      return 14;
    }
    return 255;
  }
  
  static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 5: 
    case 52: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 9: 
      return 9;
    case 8: 
      return 8;
    case 10: 
      return 10;
    case 16: 
      return 16;
    case 15: 
      return 15;
    case 12: 
      return 12;
    case 17: 
      return 17;
    case 14: 
    case 55: 
      return 14;
    }
    return 255;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 0: 
      return 6;
    case 1: 
      return 1;
    case 15: 
      return 15;
    case 5: 
      return 5;
    case 12: 
      return 12;
    case 17: 
      return 17;
    case 14: 
      return 14;
    case 13: 
      return 13;
    case 11: 
      return 11;
    case 16: 
      return 16;
    case 7: 
      return 7;
    case 6: 
      return 6;
    case 8: 
      return 8;
    case 9: 
      return 9;
    case 10: 
      return 10;
    }
    return paramInt2;
  }
  
  static SaveOptions a(String paramString, int paramInt1, int paramInt2, SaveOptions paramSaveOptions)
    throws Exception
  {
    if (paramInt2 == 0)
    {
      if (paramString != null)
      {
        String str = zk.d(paramString);
        if (str != null) {
          paramInt2 = extensionToSaveFormat(str);
        }
      }
      else
      {
        paramInt2 = c(paramInt1);
      }
      if ((paramInt2 == 0) || (paramInt2 == 255)) {
        return new OoxmlSaveOptions(paramSaveOptions);
      }
    }
    switch (paramInt2)
    {
    case 1: 
    case 11: 
      return new TxtSaveOptions(paramInt2, paramSaveOptions);
    case 15: 
      return new SpreadsheetML2003SaveOptions(paramSaveOptions);
    case 5: 
      return new XlsSaveOptions(paramSaveOptions);
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      return new OoxmlSaveOptions(paramInt2, paramSaveOptions);
    case 16: 
      return new XlsbSaveOptions(paramSaveOptions);
    case 12: 
      return new HtmlSaveOptions(paramSaveOptions);
    case 17: 
      return new HtmlSaveOptions(17);
    case 14: 
      return new OdsSaveOptions(paramSaveOptions);
    case 13: 
      return new PdfSaveOptions(paramSaveOptions);
    case 20: 
      return new XpsSaveOptions(paramInt2);
    case 22: 
      return new SvgSaveOptions(paramInt2);
    case 21: 
      return new ImageSaveOptions(paramInt2);
    case 30: 
      return new DifSaveOptions();
    }
    return new OoxmlSaveOptions(paramSaveOptions);
  }
  
  static String d(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 16: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 52: 
      return "Worksheet";
    case 13: 
      return "Acrobat Document";
    case 27: 
    case 31: 
    case 38: 
    case 39: 
    case 40: 
      return "Document";
    case 26: 
    case 32: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
      return "Presentation";
    case 36: 
    case 37: 
      return "Visio";
    case 54: 
      return "Paint.Picture";
    }
    return "Package";
  }
  
  static String a(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case 1: 
      return ".csv";
    case 5: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
      return ".xls";
    case 52: 
      return ".xlt";
    case 12: 
      return ".html";
    case 14: 
      return ".ods";
    case 55: 
      return ".ots";
    case 13: 
      return ".pdf";
    case 15: 
      return ".xml";
    case 11: 
      return ".txt";
    case 16: 
      return ".xlsb";
    case 7: 
      return ".xlsm";
    case 6: 
      return ".xlsx";
    case 8: 
      return ".xltx";
    case 9: 
      return ".xltm";
    case 30: 
      return ".dif";
    case 31: 
      return ".doc";
    case 27: 
      return ".docx";
    case 38: 
      return ".docm";
    case 39: 
      return ".dotx";
    case 40: 
      return ".dotm";
    case 17: 
      return ".mht";
    case 34: 
      return ".bin";
    case 33: 
      return ".msg";
    case 32: 
      return ".ppt";
    case 26: 
      return ".pptx";
    case 41: 
      return ".pptm";
    case 42: 
      return ".potx";
    case 43: 
      return ".potm";
    case 44: 
      return ".ppsx";
    case 45: 
      return ".ppsm";
    case 28: 
      return ".svg";
    case 21: 
      return ".tiff";
    case 20: 
      return ".xps";
    case 36: 
      return ".vsd";
    case 37: 
      return ".vsdx";
    }
    return paramString;
  }
  
  static int a(String paramString, int paramInt)
  {
    int i = paramInt;
    if (paramString != null) {
      switch (a.a(paramString.toLowerCase()))
      {
      case 26: 
        i = 5;
        break;
      case 27: 
        i = 52;
        break;
      case 28: 
        i = 6;
        break;
      case 29: 
        i = 7;
        break;
      case 30: 
        i = 10;
        break;
      case 31: 
        i = 15;
        break;
      case 32: 
        i = 8;
        break;
      case 33: 
        i = 16;
        break;
      case 34: 
        i = 9;
        break;
      case 35: 
      case 36: 
        i = 12;
        break;
      case 37: 
      case 38: 
        i = 17;
        break;
      case 1: 
        i = 11;
        break;
      case 0: 
        i = 1;
        break;
      case 39: 
        i = 13;
        break;
      case 40: 
        i = 14;
        break;
      case 41: 
        i = 55;
        break;
      case 42: 
        i = 20;
        break;
      case 43: 
        i = 21;
        break;
      case 44: 
        i = 28;
        break;
      case 45: 
        i = 30;
        break;
      case 46: 
        i = 27;
        break;
      case 47: 
        i = 38;
        break;
      case 48: 
        i = 40;
        break;
      case 49: 
        i = 39;
        break;
      case 50: 
        i = 26;
        break;
      case 51: 
        i = 41;
        break;
      case 52: 
        i = 44;
        break;
      case 53: 
        i = 45;
        break;
      case 54: 
        i = 42;
        break;
      case 55: 
        i = 43;
        break;
      case 56: 
        i = 26;
        break;
      case 57: 
        i = 31;
        break;
      case 58: 
        i = 32;
        break;
      case 59: 
        i = 33;
        break;
      case 60: 
        i = 36;
        break;
      case 61: 
        i = 37;
      }
    }
    return i;
  }
  
  public static int extensionToSaveFormat(String extension)
  {
    if (extension.charAt(0) != '.') {
      extension = "." + extension;
    }
    switch (a.a(extension.toLowerCase()))
    {
    case 26: 
    case 27: 
      return 5;
    case 28: 
      return 6;
    case 29: 
      return 7;
    case 30: 
      return 10;
    case 31: 
      return 15;
    case 32: 
      return 8;
    case 33: 
      return 16;
    case 34: 
      return 9;
    case 35: 
    case 36: 
      return 12;
    case 37: 
    case 38: 
      return 17;
    case 1: 
      return 11;
    case 0: 
      return 1;
    case 39: 
      return 13;
    case 40: 
    case 41: 
      return 14;
    case 42: 
      return 20;
    case 45: 
      return 30;
    }
    return 255;
  }
  
  public static boolean isTemplateFormat(String extension)
  {
    if (extension.charAt(0) == '.') {
      extension = extension.toLowerCase();
    } else {
      extension = "." + extension.toLowerCase();
    }
    switch (a.a(extension))
    {
    case 27: 
    case 32: 
    case 34: 
    case 41: 
      return true;
    }
    return false;
  }
  
  public static String loadFormatToExtension(int loadFormat)
  {
    switch (loadFormat)
    {
    case 1: 
      return ".csv";
    case 5: 
      return ".xls";
    case 14: 
      return ".ods";
    case 15: 
      return ".xml";
    case 11: 
      return ".txt";
    case 16: 
      return ".xlsb";
    case 6: 
      return ".xlsx";
    case 56: 
      return ".numbers";
    }
    return null;
  }
  
  public static int loadFormatToSaveFormat(int loadFormat)
  {
    switch (loadFormat)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 5: 
      return 5;
    case 14: 
      return 14;
    case 15: 
      return 15;
    case 11: 
      return 11;
    case 16: 
      return 16;
    case 6: 
      return 6;
    case 56: 
      return 56;
    }
    return 255;
  }
  
  public static String saveFormatToExtension(int format)
  {
    switch (format)
    {
    case 1: 
      return ".csv";
    case 5: 
      return ".xls";
    case 12: 
      return ".html";
    case 14: 
      return ".ods";
    case 13: 
      return ".pdf";
    case 15: 
      return ".xml";
    case 11: 
      return ".txt";
    case 16: 
      return ".xlsb";
    case 7: 
      return ".xlsm";
    case 6: 
      return ".xlsx";
    case 8: 
      return ".xltx";
    case 9: 
      return ".xltm";
    case 10: 
      return ".xlam";
    case 56: 
      return ".numbers";
    }
    return null;
  }
  
  public static int saveFormatToLoadFormat(int saveFormat)
  {
    switch (saveFormat)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 5: 
      return 5;
    case 12: 
      return 255;
    case 14: 
      return 14;
    case 13: 
      return 255;
    case 15: 
      return 15;
    case 11: 
      return 11;
    case 16: 
      return 16;
    case 7: 
    case 9: 
    case 10: 
      return 6;
    case 6: 
    case 8: 
      return 6;
    case 56: 
      return 56;
    }
    return 255;
  }
  
  static SaveOptions a(int paramInt, SaveOptions paramSaveOptions)
  {
    switch (paramInt)
    {
    case 1: 
      return new TxtSaveOptions(1, paramSaveOptions);
    case 11: 
      return new TxtSaveOptions(11, paramSaveOptions);
    case 5: 
    case 52: 
      return new XlsSaveOptions(paramSaveOptions);
    case 15: 
      return new SpreadsheetML2003SaveOptions(paramSaveOptions);
    case 7: 
      return new OoxmlSaveOptions(7, paramSaveOptions);
    case 6: 
      return new OoxmlSaveOptions(6, paramSaveOptions);
    case 9: 
      return new OoxmlSaveOptions(9, paramSaveOptions);
    case 8: 
      return new OoxmlSaveOptions(8, paramSaveOptions);
    case 10: 
      return new OoxmlSaveOptions(10, paramSaveOptions);
    case 16: 
      return new XlsbSaveOptions(paramSaveOptions);
    case 12: 
      return new HtmlSaveOptions(paramSaveOptions);
    case 17: 
      return new HtmlSaveOptions(paramSaveOptions, true);
    case 14: 
    case 55: 
      OdsSaveOptions localOdsSaveOptions = new OdsSaveOptions(paramSaveOptions);
      localOdsSaveOptions.a = (paramInt == 55);
      return localOdsSaveOptions;
    case 13: 
      return new PdfSaveOptions(paramSaveOptions);
    case 20: 
      return XpsSaveOptions.a(paramSaveOptions);
    case 28: 
      return SvgSaveOptions.c(paramSaveOptions);
    case 21: 
      if (paramSaveOptions == null) {
        return new ImageSaveOptions(21);
      }
      paramSaveOptions.a(21);
      return ImageSaveOptions.a(paramSaveOptions);
    case 30: 
      return new DifSaveOptions(paramSaveOptions);
    }
    return new OoxmlSaveOptions(6, paramSaveOptions);
  }
  
  static boolean e(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 16: 
    case 26: 
    case 27: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FileFormatUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */