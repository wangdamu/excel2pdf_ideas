package com.aspose.cells;

import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;

class zafa
{
  private static final za a = new za(new String[] { "&quot;", "&apos;", "&amp;", "&lt;", "&gt;", "&nbsp", "&nbsp;", "&iexcl;", "&cent;", "&pound;", "&curren;", "&yen;", "&brvbar;", "&sect;", "&uml;", "&copy;", "&ordf;", "&laquo;", "&not;", "&shy;", "&reg;", "&macr;", "&deg;", "&plusmn;", "&sup2;", "&sup3;", "&acute;", "&micro;", "&para;", "&middot;", "&cedil;", "&sup1;", "&ordm;", "&raquo;", "&frac14;", "&frac12;", "&frac34;", "&iquest;", "&Agrave;", "&Aacute;", "&Acirc;", "&Atilde;", "&Auml;", "&Aring;", "&AElig;", "&Ccedil;", "&Egrave;", "&Eacute;", "&Ecirc;", "&Euml;", "&Igrave;", "&Iacute;", "&Icirc;", "&Iuml;", "&ETH;", "&Ntilde;", "&Ograve;", "&Oacute;", "&Ocirc;", "&Otilde;", "&Ouml;", "&times;", "&Oslash;", "&Ugrave;", "&Uacute;", "&Ucirc;", "&Uuml;", "&Yacute;", "&THORN;", "&szlig;", "&agrave;", "&aacute;", "&acirc;", "&atilde;", "&auml;", "&aring;", "&aelig;", "&ccedil;", "&egrave;", "&eacute;", "&ecirc;", "&euml;", "&igrave;", "&iacute;", "&icirc;", "&iuml;", "&eth;", "&ntilde;", "&ograve;", "&oacute;", "&ocirc;", "&otilde;", "&ouml;", "&divide;", "&oslash;", "&ugrave;", "&uacute;", "&ucirc;", "&uuml;", "&yacute;", "&thorn;", "&yuml;", "&lsquo;", "&rsquo;", "&hellip;", "&euro;", "&lsaquo;", "&rsaquo;", "&oelig;", "&Yuml;", "&sbquo;", "&fnof;", "&bdquo;", "&dagger;", "&Dagger;", "&circ;", "&permil;", "&Scaron;", "&OElig;", "&ldquo;", "&rdquo;", "&bull;", "&ndash;", "&mdash;", "&tilde;", "&trade;", "&scaron;", "&ne;", "&le;", "&ge;", "&infin;" });
  
  public static String a(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder1 = new StringBuilder();
    for (int j = 0; j < i; j++)
    {
      char c1 = paramString.charAt(j);
      if ((c1 == '&') && (j + 2 < i))
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        for (char c2 = c1; (c2 > 0) && (c2 != ';'); c2 = a(paramString, j))
        {
          localStringBuilder2.append(c2);
          j++;
        }
        if (c2 == ';') {
          localStringBuilder2.append(';');
        }
        a(localStringBuilder1, localStringBuilder2);
      }
      else
      {
        localStringBuilder1.append(c1);
      }
    }
    return zs.a(localStringBuilder1);
  }
  
  static void a(StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2)
  {
    try
    {
      char c;
      if (paramStringBuilder2.charAt(1) == '#')
      {
        c = paramStringBuilder2.charAt(2);
        if ((c == 'x') || (c == 'X')) {
          paramStringBuilder1.append((char)ze.b(zs.a(paramStringBuilder2).substring(3, 3 + (paramStringBuilder2.length() - 4)), 16));
        } else {
          paramStringBuilder1.append((char)zp.a(zs.a(paramStringBuilder2).substring(2, 2 + (paramStringBuilder2.length() - 3))));
        }
      }
      else
      {
        c = b(zs.a(paramStringBuilder2));
        if (c == 0) {
          paramStringBuilder1.append(paramStringBuilder2);
        } else {
          paramStringBuilder1.append(c);
        }
      }
    }
    catch (Exception localException)
    {
      paramStringBuilder1.append(paramStringBuilder2);
    }
  }
  
  private static char a(String paramString, int paramInt)
  {
    char c;
    if (paramInt < paramString.length()) {
      c = paramString.charAt(paramInt);
    } else {
      c = '\000';
    }
    return c;
  }
  
  static char b(String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      return '"';
    case 1: 
      return '\'';
    case 2: 
      return '&';
    case 3: 
      return '<';
    case 4: 
      return '>';
    case 5: 
    case 6: 
      return ' ';
    case 7: 
      return '¡';
    case 8: 
      return '¢';
    case 9: 
      return '£';
    case 10: 
      return '¤';
    case 11: 
      return '¥';
    case 12: 
      return '¦';
    case 13: 
      return '§';
    case 14: 
      return '¨';
    case 15: 
      return '©';
    case 16: 
      return 'ª';
    case 17: 
      return '«';
    case 18: 
      return '¬';
    case 19: 
      return '­';
    case 20: 
      return '®';
    case 21: 
      return '¯';
    case 22: 
      return '°';
    case 23: 
      return '±';
    case 24: 
      return '²';
    case 25: 
      return '³';
    case 26: 
      return '´';
    case 27: 
      return 'µ';
    case 28: 
      return '¶';
    case 29: 
      return '·';
    case 30: 
      return '¸';
    case 31: 
      return '¹';
    case 32: 
      return 'º';
    case 33: 
      return '»';
    case 34: 
      return '¼';
    case 35: 
      return '½';
    case 36: 
      return '¾';
    case 37: 
      return '¿';
    case 38: 
      return 'À';
    case 39: 
      return 'Á';
    case 40: 
      return 'Â';
    case 41: 
      return 'Ã';
    case 42: 
      return 'Ä';
    case 43: 
      return 'Å';
    case 44: 
      return 'Æ';
    case 45: 
      return 'Ç';
    case 46: 
      return 'È';
    case 47: 
      return 'É';
    case 48: 
      return 'Ê';
    case 49: 
      return 'Ë';
    case 50: 
      return 'Ì';
    case 51: 
      return 'Í';
    case 52: 
      return 'Î';
    case 53: 
      return 'Ï';
    case 54: 
      return 'Ð';
    case 55: 
      return 'Ñ';
    case 56: 
      return 'Ò';
    case 57: 
      return 'Ó';
    case 58: 
      return 'Ô';
    case 59: 
      return 'Õ';
    case 60: 
      return 'Ö';
    case 61: 
      return '×';
    case 62: 
      return 'Ø';
    case 63: 
      return 'Ù';
    case 64: 
      return 'Ú';
    case 65: 
      return 'Û';
    case 66: 
      return 'Ü';
    case 67: 
      return 'Ý';
    case 68: 
      return 'Þ';
    case 69: 
      return 'ß';
    case 70: 
      return 'à';
    case 71: 
      return 'á';
    case 72: 
      return 'â';
    case 73: 
      return 'ã';
    case 74: 
      return 'ä';
    case 75: 
      return 'å';
    case 76: 
      return 'æ';
    case 77: 
      return 'ç';
    case 78: 
      return 'è';
    case 79: 
      return 'é';
    case 80: 
      return 'ê';
    case 81: 
      return 'ë';
    case 82: 
      return 'ì';
    case 83: 
      return 'í';
    case 84: 
      return 'î';
    case 85: 
      return 'ï';
    case 86: 
      return 'ð';
    case 87: 
      return 'ñ';
    case 88: 
      return 'ò';
    case 89: 
      return 'ó';
    case 90: 
      return 'ô';
    case 91: 
      return 'õ';
    case 92: 
      return 'ö';
    case 93: 
      return '÷';
    case 94: 
      return 'ø';
    case 95: 
      return 'ù';
    case 96: 
      return 'ú';
    case 97: 
      return 'û';
    case 98: 
      return 'ü';
    case 99: 
      return 'ý';
    case 100: 
      return 'þ';
    case 101: 
      return 'ÿ';
    case 102: 
      return '‘';
    case 103: 
      return '’';
    case 104: 
      return '…';
    case 105: 
      return '€';
    case 106: 
      return '‹';
    case 107: 
      return '›';
    case 108: 
      return 'œ';
    case 109: 
      return 'Ÿ';
    case 110: 
      return '‚';
    case 111: 
      return 'ƒ';
    case 112: 
      return '„';
    case 113: 
      return '†';
    case 114: 
      return '‡';
    case 115: 
      return 'ˆ';
    case 116: 
      return '‰';
    case 117: 
      return 'Š';
    case 118: 
      return 'Œ';
    case 119: 
      return '“';
    case 120: 
      return '”';
    case 121: 
      return '•';
    case 122: 
      return '–';
    case 123: 
      return '—';
    case 124: 
      return '˜';
    case 125: 
      return '™';
    case 126: 
      return 'š';
    case 127: 
      return '≠';
    case 128: 
      return '≤';
    case 129: 
      return '≥';
    case 130: 
      return '∞';
    }
    return '\000';
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */