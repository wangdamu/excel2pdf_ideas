package com.aspose.cells;

import com.aspose.cells.a.c.zj;
import com.aspose.cells.b.a.c.za;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

class zbpg
  extends zn
{
  private static final DateTime e = DateTime.b.addMilliseconds(-500.0D);
  private DateFormat f;
  private String g;
  
  public zbpg(zig paramzig, String paramString, boolean paramBoolean, int paramInt)
  {
    super(paramzig);
    this.d = paramInt;
    switch (this.a.e())
    {
    case -2048: 
      this.f = b(this.a.c());
      break;
    case -3072: 
      this.f = a(this.a.c());
      break;
    case 0: 
      this.g = a(paramString, paramBoolean);
      if ((b(128)) && (zamr.a((short)17, this.a.c().e()))) {
        this.f = new SimpleDateFormat(this.g, new Locale("ja", "JP", "JP"));
      } else {
        this.f = new SimpleDateFormat(this.g, this.a.c().a().h());
      }
      break;
    case -999: 
      this.g = a(paramString, paramBoolean);
      if (c())
      {
        DateFormatSymbols localDateFormatSymbols = new DateFormatSymbols(new Locale("ru", "RU"));
        localDateFormatSymbols.setMonths(new String[] { "января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря" });
        this.f = new SimpleDateFormat(this.g, localDateFormatSymbols);
      }
      else
      {
        this.f = new SimpleDateFormat(this.g, new Locale("ru", "RU"));
      }
      break;
    default: 
      this.g = a(paramString, paramBoolean);
      if ((b(128)) && (zamr.a((short)17, this.a.e()))) {
        this.f = new SimpleDateFormat(this.g, new Locale("ja", "JP", "JP"));
      } else {
        this.f = new SimpleDateFormat(this.g, zj.b(this.a.e()));
      }
      break;
    }
    this.f.setTimeZone(TimeZone.getTimeZone("GMT"));
  }
  
  private String a(String paramString, boolean paramBoolean)
  {
    char[] arrayOfChar = paramString.toCharArray();
    StringBuilder localStringBuilder = new StringBuilder(arrayOfChar.length);
    if (paramBoolean) {
      d(arrayOfChar, 0, arrayOfChar.length, localStringBuilder);
    } else {
      for (int i = 0; i < arrayOfChar.length; i = a(arrayOfChar, i, arrayOfChar.length, localStringBuilder)) {}
    }
    String str = localStringBuilder.toString();
    str = str.replace("dddd", "EEEE");
    str = str.replace("ddd", "EEE");
    return str;
  }
  
  public zzz a(zzu paramzzu, DateTime paramDateTime, double paramDouble, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramDateTime.compareTo(e) > 0)
      {
        localzzz = super.a(paramzzu, paramDateTime, paramDouble, paramBoolean);
        if (localzzz.f() == 7) {
          localzzz.a(paramzzu.c());
        }
        return localzzz;
      }
      paramDateTime = paramDateTime.addMilliseconds(500.0D);
    }
    zzz localzzz = super.a(paramzzu, paramDateTime, paramDouble, paramBoolean);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    String str = this.f.format(paramDateTime.j());
    if ((paramDateTime.getYear() == 1899) && (paramDateTime.getMonth() == 12) && (paramDateTime.getDay() == 31)) {
      str = a(this.g, str);
    }
    localzzz.a(3, str);
    return localzzz;
  }
  
  private DateFormat a(zzx paramzzx)
  {
    switch (paramzzx.e())
    {
    case 54: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("af"));
    case 1078: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("af", "ZA"));
    case 1: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar"));
    case 14337: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "AE"));
    case 15361: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "BH"));
    case 5121: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ar", "DZ"));
    case 3073: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "EG"));
    case 2049: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "IQ"));
    case 11265: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "JO"));
    case 13313: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "KW"));
    case 12289: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "LB"));
    case 4097: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "LY"));
    case 6145: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ar", "MA"));
    case 8193: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "OM"));
    case 16385: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "QA"));
    case 1025: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "SA"));
    case 10241: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "SY"));
    case 7169: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ar", "TN"));
    case 9217: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("ar", "YE"));
    case 44: 
      return new SimpleDateFormat("H:mm:ss", new Locale("az"));
    case 2092: 
      return new SimpleDateFormat("H:mm:ss", new Locale("az", "AZ", "Cyrl"));
    case 1068: 
      return new SimpleDateFormat("H:mm:ss", new Locale("az", "AZ", "Latn"));
    case 35: 
      return new SimpleDateFormat("H:mm:ss", new Locale("be"));
    case 1059: 
      return new SimpleDateFormat("H:mm:ss", new Locale("be", "BY"));
    case 2: 
      return new SimpleDateFormat("HH:mm:ss 'ч.'", new Locale("bg"));
    case 1026: 
      return new SimpleDateFormat("HH:mm:ss 'ч.'", new Locale("bg", "BG"));
    case 3: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("ca"));
    case 1027: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("ca", "ES"));
    case 5: 
      return new SimpleDateFormat("H:mm:ss", new Locale("cs"));
    case 1029: 
      return new SimpleDateFormat("H:mm:ss", new Locale("cs", "CZ"));
    case 6: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("da"));
    case 1030: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("da", "DK"));
    case 7: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("de"));
    case 3079: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("de", "AT"));
    case 2055: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("de", "CH"));
    case 1031: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("de", "DE"));
    case 5127: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("de", "LI"));
    case 4103: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("de", "LU"));
    case 101: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("div"));
    case 1125: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("div", "MV"));
    case 8: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("el"));
    case 1032: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("el", "GR"));
    case 9: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en"));
    case 3081: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "AU"));
    case 10249: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("en", "BZ"));
    case 4105: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "CA"));
    case 9225: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "CB"));
    case 2057: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("en", "GB"));
    case 6153: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("en", "IE"));
    case 16393: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("en", "IN"));
    case 8201: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("en", "JM"));
    case 5129: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "NZ"));
    case 13321: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "PH"));
    case 11273: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("en", "TT"));
    case 1033: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "US"));
    case 7177: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("en", "ZA"));
    case 12297: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "ZW"));
    case 18441: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("en", "SG"));
    case 10: 
      return new SimpleDateFormat("H:mm:ss", new Locale("es"));
    case 11274: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "AR"));
    case 16394: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "BO"));
    case 13322: 
      return new SimpleDateFormat("H:mm:ss", new Locale("es", "CL"));
    case 9226: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "CO"));
    case 5130: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "CR"));
    case 7178: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "DO"));
    case 12298: 
      return new SimpleDateFormat("H:mm:ss", new Locale("es", "EC"));
    case 3082: 
      return new SimpleDateFormat("H:mm:ss", new Locale("es", "ES"));
    case 4106: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "GT"));
    case 18442: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "HN"));
    case 2058: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "MX"));
    case 19466: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "NI"));
    case 6154: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "PA"));
    case 10250: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "PE"));
    case 20490: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "PR"));
    case 15370: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "PY"));
    case 17418: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "SV"));
    case 14346: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "UY"));
    case 8202: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("es", "VE"));
    case 37: 
      return new SimpleDateFormat("H:mm:ss", new Locale("et"));
    case 1061: 
      return new SimpleDateFormat("H:mm:ss", new Locale("et", "EE"));
    case 45: 
      return new SimpleDateFormat("H:mm:ss", new Locale("eu"));
    case 1069: 
      return new SimpleDateFormat("H:mm:ss", new Locale("eu", "ES"));
    case 56: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fo"));
    case 1080: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fo", "FO"));
    case 41: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("fa"));
    case 1065: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("fa", "IR"));
    case 11: 
      return new SimpleDateFormat("H:mm:ss", new Locale("fi"));
    case 1035: 
      return new SimpleDateFormat("H:mm:ss", new Locale("fi", "FI"));
    case 12: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fr"));
    case 2060: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fr", "BE"));
    case 3084: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fr", "CA"));
    case 1036: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fr", "FR"));
    case 5132: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fr", "LU"));
    case 6156: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fr", "MC"));
    case 4108: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("fr", "CH"));
    case 86: 
      return new SimpleDateFormat("H:mm:ss", new Locale("gl"));
    case 1110: 
      return new SimpleDateFormat("H:mm:ss", new Locale("gl", "ES"));
    case 71: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("gu"));
    case 1095: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("gu", "IN"));
    case 13: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("he"));
    case 1037: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("he", "IL"));
    case 57: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("hi"));
    case 1081: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("hi", "IN"));
    case 26: 
      return new SimpleDateFormat("H:mm:ss", new Locale("hr"));
    case 1050: 
      return new SimpleDateFormat("H:mm:ss", new Locale("hr", "HR"));
    case 14: 
      return new SimpleDateFormat("H:mm:ss", new Locale("hu"));
    case 1038: 
      return new SimpleDateFormat("H:mm:ss", new Locale("hu", "HU"));
    case 43: 
      return new SimpleDateFormat("H:mm:ss", new Locale("hy"));
    case 1067: 
      return new SimpleDateFormat("H:mm:ss", new Locale("hy", "AM"));
    case 33: 
      return new SimpleDateFormat("H:mm:ss", new Locale("id"));
    case 1057: 
      return new SimpleDateFormat("H:mm:ss", new Locale("id", "ID"));
    case 15: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("is", ""));
    case 1039: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("is", "IS"));
    case 16: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("it"));
    case 2064: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("it", "CH"));
    case 1040: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("it", "IT"));
    case 17: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ja"));
    case 1041: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ja", "JP", "JP"));
    case 55: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ka"));
    case 1079: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ka", "GE"));
    case 63: 
      return new SimpleDateFormat("H:mm:ss", new Locale("kk"));
    case 1087: 
      return new SimpleDateFormat("H:mm:ss", new Locale("kk", "KZ"));
    case 75: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("kn"));
    case 1099: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("kn", "IN"));
    case 18: 
      return new SimpleDateFormat("a h:mm:ss", new Locale("ko"));
    case 1042: 
      return new SimpleDateFormat("a h:mm:ss", new Locale("ko", "KR"));
    case 87: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("kok"));
    case 1111: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("kok", "IN"));
    case 64: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ky"));
    case 1088: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ky", "KG"));
    case 38: 
      return new SimpleDateFormat("H:mm:ss", new Locale("lv"));
    case 1062: 
      return new SimpleDateFormat("H:mm:ss", new Locale("lv", "LV"));
    case 39: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("lt"));
    case 1063: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("lt", "LT"));
    case 47: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("mk"));
    case 1071: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("mk", "MK"));
    case 62: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ms"));
    case 2110: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ms", "BN"));
    case 1086: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ms", "MY"));
    case 78: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("mr"));
    case 1102: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("mr", "IN"));
    case 80: 
      return new SimpleDateFormat("H:mm:ss", new Locale("mn"));
    case 1104: 
      return new SimpleDateFormat("H:mm:ss", new Locale("mn", "MN"));
    case 20: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("no"));
    case 1044: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("nb", "NO"));
    case 19: 
      return new SimpleDateFormat("H:mm:ss", new Locale("nl"));
    case 2067: 
      return new SimpleDateFormat("H:mm:ss", new Locale("nl", "BE"));
    case 1043: 
      return new SimpleDateFormat("H:mm:ss", new Locale("nl", "NL"));
    case 2068: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("nn", "NO"));
    case 70: 
      return new SimpleDateFormat("a hh:mm:ss", new Locale("pa"));
    case 1094: 
      return new SimpleDateFormat("a hh:mm:ss", new Locale("pa", "IN"));
    case 21: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("pl"));
    case 1045: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("pl", "PL"));
    case 22: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("pt"));
    case 1046: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("pt", "BR"));
    case 2070: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("pt", "PT"));
    case 24: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("ro"));
    case 1048: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("ro", "RO"));
    case 25: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ru"));
    case 1049: 
      return new SimpleDateFormat("H:mm:ss", new Locale("ru", "RU"));
    case 79: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("sa"));
    case 1103: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("sa", "IN"));
    case 27: 
      return new SimpleDateFormat("H:mm:ss", new Locale("sk"));
    case 1051: 
      return new SimpleDateFormat("H:mm:ss", new Locale("sk", "SK"));
    case 36: 
      return new SimpleDateFormat("H:mm:ss", new Locale("sl"));
    case 1060: 
      return new SimpleDateFormat("H:mm:ss", new Locale("sl", "SI"));
    case 28: 
      return new SimpleDateFormat("h:mm:ss.a", new Locale("sq"));
    case 1052: 
      return new SimpleDateFormat("h:mm:ss.a", new Locale("sq", "AL"));
    case 3098: 
      return new SimpleDateFormat("H:mm:ss", new Locale("sr", "SP", "Cyrl"));
    case 2074: 
      return new SimpleDateFormat("H:mm:ss", new Locale("sr", "SP", "Latn"));
    case 29: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("sv"));
    case 2077: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("sv", "FI"));
    case 1053: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("sv", "SE"));
    case 65: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("sw"));
    case 1089: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("sw", "KE"));
    case 90: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("syr"));
    case 1114: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("syr", "SY"));
    case 73: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("ta"));
    case 1097: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("ta", "IN"));
    case 74: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("te"));
    case 1098: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("te", "IN"));
    case 30: 
      return new SimpleDateFormat("H:mm:ss", new Locale("th"));
    case 1054: 
      return new SimpleDateFormat("H:mm:ss", new Locale("th", "TH"));
    case 31: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("tr"));
    case 1055: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("tr", "TR"));
    case 68: 
      return new SimpleDateFormat("H:mm:ss", new Locale("tt"));
    case 1092: 
      return new SimpleDateFormat("H:mm:ss", new Locale("tt", "RU"));
    case 34: 
      return new SimpleDateFormat("H:mm:ss", new Locale("uk"));
    case 1058: 
      return new SimpleDateFormat("H:mm:ss", new Locale("uk", "UA"));
    case 32: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("ur"));
    case 1056: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("ur", "PK"));
    case 67: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("uz"));
    case 2115: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("uz", "UZ", "Cyrl"));
    case 1091: 
      return new SimpleDateFormat("HH:mm:ss", new Locale("uz", "UZ", "Latn"));
    case 42: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("vi"));
    case 1066: 
      return new SimpleDateFormat("h:mm:ss a", new Locale("vi", "VN"));
    case 2052: 
      return new SimpleDateFormat("H:mm:ss", new Locale("zh", "CN"));
    case 4: 
      return new SimpleDateFormat("H:mm:ss", new Locale("zh", "CHS"));
    case 31748: 
      return new SimpleDateFormat("H:mm:ss", new Locale("zh", "CHT"));
    case 3076: 
      return new SimpleDateFormat("H:mm:ss", new Locale("zh", "HK"));
    case 5124: 
      return new SimpleDateFormat("H:mm:ss", new Locale("zh", "MO"));
    case 4100: 
      return new SimpleDateFormat("a h:mm:ss", new Locale("zh", "SG"));
    case 1028: 
      return new SimpleDateFormat("a hh:mm:ss", new Locale("zh", "TW"));
    case 1077: 
      return new SimpleDateFormat("hh:mm:ss a", new Locale("zu"));
    }
    return DateFormat.getTimeInstance(1, paramzzx.a().h());
  }
  
  private DateFormat b(zzx paramzzx)
  {
    switch (paramzzx.e())
    {
    case 54: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("af"));
    case 1078: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("af", "ZA"));
    case 1: 
      return new SimpleDateFormat("dd/MMMM/yyyy", new Locale("ar"));
    case 14337: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "AE"));
    case 15361: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "BH"));
    case 5121: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "DZ"));
    case 3073: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "EG"));
    case 2049: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "IQ"));
    case 11265: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "JO"));
    case 13313: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "KW"));
    case 12289: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "LB"));
    case 4097: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "LY"));
    case 6145: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "MA"));
    case 8193: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "OM"));
    case 16385: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "QA"));
    case 1025: 
      return new SimpleDateFormat("dd/MMMM/yyyy", new Locale("ar", "SA"));
    case 10241: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "SY"));
    case 7169: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "TN"));
    case 9217: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ar", "YE"));
    case 44: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("az"));
    case 2092: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("az", "AZ", "Cyrl"));
    case 1068: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("az", "AZ", "Latn"));
    case 35: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("be"));
    case 1059: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("be", "BY"));
    case 2: 
      return new SimpleDateFormat("dd MMMM yyyy 'г.'", new Locale("bg"));
    case 1026: 
      return new SimpleDateFormat("dd MMMM yyyy 'г.'", new Locale("bg", "BG"));
    case 3: 
      return new SimpleDateFormat("EEEE, d' / 'MMMM' / 'yyyy", new Locale("ca"));
    case 1027: 
      return new SimpleDateFormat("EEEE, d' / 'MMMM' / 'yyyy", new Locale("ca", "ES"));
    case 5: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("cs"));
    case 1029: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("cs", "CZ"));
    case 6: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("da"));
    case 1030: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("da", "DK"));
    case 7: 
      return new SimpleDateFormat("EEEE, d. MMMM yyyy", new Locale("de"));
    case 3079: 
      return new SimpleDateFormat("EEEE, dd. MMMM yyyy", new Locale("de", "AT"));
    case 2055: 
      return new SimpleDateFormat("EEEE, d. MMMM yyyy", new Locale("de", "CH"));
    case 1031: 
      return new SimpleDateFormat("EEEE, d. MMMM yyyy", new Locale("de", "DE"));
    case 5127: 
      return new SimpleDateFormat("EEEE, d. MMMM yyyy", new Locale("de", "LI"));
    case 4103: 
      return new SimpleDateFormat("EEEE, d. MMMM yyyy", new Locale("de", "LU"));
    case 101: 
      return new SimpleDateFormat("dd/MM/yyyy", new Locale("div"));
    case 1125: 
      return new SimpleDateFormat("dd/MM/yyyy", new Locale("div", "MV"));
    case 8: 
      return new SimpleDateFormat("EEEE, d MMMM yyyy", new Locale("el"));
    case 1032: 
      return new SimpleDateFormat("EEEE, d MMMM yyyy", new Locale("el", "GR"));
    case 9: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("en"));
    case 3081: 
      return new SimpleDateFormat("EEEE, d MMMM yyyy", new Locale("en", "AU"));
    case 10249: 
      return new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("en", "BZ"));
    case 4105: 
      return new SimpleDateFormat("MMMM-dd-yy", new Locale("en", "CA"));
    case 9225: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("en", "CB"));
    case 2057: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("en", "GB"));
    case 6153: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("en", "IE"));
    case 16393: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("en", "IN"));
    case 8201: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("en", "JM"));
    case 5129: 
      return new SimpleDateFormat("EEEE, d MMMM yyyy", new Locale("en", "NZ"));
    case 13321: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("en", "PH"));
    case 11273: 
      return new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("en", "TT"));
    case 1033: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("en", "US"));
    case 7177: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("en", "ZA"));
    case 12297: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("en", "ZW"));
    case 18441: 
      return new SimpleDateFormat("EEEE, d MMMM, yyyy", new Locale("en", "SG"));
    case 10: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es"));
    case 11274: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "AR"));
    case 16394: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "BO"));
    case 13322: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "CL"));
    case 9226: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "CO"));
    case 5130: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "CR"));
    case 7178: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "DO"));
    case 12298: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "EC"));
    case 3082: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "ES"));
    case 4106: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "GT"));
    case 18442: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "HN"));
    case 2058: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "MX"));
    case 19466: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "NI"));
    case 6154: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "PA"));
    case 10250: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "PE"));
    case 20490: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "PR"));
    case 15370: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "PY"));
    case 17418: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "SV"));
    case 14346: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "UY"));
    case 8202: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("es", "VE"));
    case 37: 
      return new SimpleDateFormat("d. MMMM yyyy'. a.'", new Locale("et"));
    case 1061: 
      return new SimpleDateFormat("d. MMMM yyyy'. a.'", new Locale("et", "EE"));
    case 45: 
      return new SimpleDateFormat("EEEE, yyyy.'eko' MMMM'k 'd", new Locale("eu"));
    case 1069: 
      return new SimpleDateFormat("EEEE, yyyy.'eko' MMMM'k 'd", new Locale("eu", "ES"));
    case 56: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("fo"));
    case 1080: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("fo", "FO"));
    case 41: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("fa"));
    case 1065: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("fa", "IR"));
    case 11: 
      return new SimpleDateFormat("d. MMMM'ta 'yyyy", new Locale("fi"));
    case 1035: 
      return new SimpleDateFormat("d. MMMM'ta 'yyyy", new Locale("fi", "FI"));
    case 12: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("fr"));
    case 2060: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("fr", "BE"));
    case 3084: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("fr", "CA"));
    case 1036: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("fr", "FR"));
    case 5132: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("fr", "LU"));
    case 6156: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("fr", "MC"));
    case 4108: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("fr", "CH"));
    case 86: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("gl"));
    case 1110: 
      return new SimpleDateFormat("EEEE, dd' de 'MMMM' de 'yyyy", new Locale("gl", "ES"));
    case 71: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("gu"));
    case 1095: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("gu", "IN"));
    case 13: 
      return new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("he"));
    case 1037: 
      return new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("he", "IL"));
    case 57: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("hi"));
    case 1081: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("hi", "IN"));
    case 26: 
      return new SimpleDateFormat("d. MMMM yyyy.", new Locale("hr"));
    case 1050: 
      return new SimpleDateFormat("d. MMMM yyyy.", new Locale("hr", "HR"));
    case 14: 
      return new SimpleDateFormat("yyyy. MMMM d.", new Locale("hu"));
    case 1038: 
      return new SimpleDateFormat("yyyy. MMMM d.", new Locale("hu", "HU"));
    case 43: 
      return new SimpleDateFormat("d MMMM, yyyy", new Locale("hy"));
    case 1067: 
      return new SimpleDateFormat("d MMMM, yyyy", new Locale("hy", "AM"));
    case 33: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("id"));
    case 1057: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("id", "ID"));
    case 15: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("is", ""));
    case 1039: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("is", "IS"));
    case 16: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("it"));
    case 2064: 
      return new SimpleDateFormat("EEEE, d. MMMM yyyy", new Locale("it", "CH"));
    case 1040: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("it", "IT"));
    case 17: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("ja"));
    case 1041: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("ja", "JP", "JP"));
    case 55: 
      return new SimpleDateFormat("yyyy 'წლის' dd MM, EEEE", new Locale("ka"));
    case 1079: 
      return new SimpleDateFormat("yyyy 'წლის' dd MM, EEEE", new Locale("ka", "GE"));
    case 63: 
      return new SimpleDateFormat("d MMMM yyyy 'ж.'", new Locale("kk"));
    case 1087: 
      return new SimpleDateFormat("d MMMM yyyy 'ж.'", new Locale("kk", "KZ"));
    case 75: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("kn"));
    case 1099: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("kn", "IN"));
    case 18: 
      return new SimpleDateFormat("yyyy'년' M'월' d'일' EEEE", new Locale("ko"));
    case 1042: 
      return new SimpleDateFormat("yyyy'년' M'월' d'일' EEEE", new Locale("ko", "KR"));
    case 87: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("kok"));
    case 1111: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("kok", "IN"));
    case 64: 
      return new SimpleDateFormat("d'-'MMMM yyyy'-ж.'", new Locale("ky"));
    case 1088: 
      return new SimpleDateFormat("d'-'MMMM yyyy'-ж.'", new Locale("ky", "KG"));
    case 38: 
      return new SimpleDateFormat("EEEE, yyyy'. gada 'd. MMMM", new Locale("lv"));
    case 1062: 
      return new SimpleDateFormat("EEEE, yyyy'. gada 'd. MMMM", new Locale("lv", "LV"));
    case 39: 
      return new SimpleDateFormat("yyyy 'm.' MMMM d 'd.'", new Locale("lt"));
    case 1063: 
      return new SimpleDateFormat("yyyy 'm.' MMMM d 'd.'", new Locale("lt", "LT"));
    case 47: 
      return new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("mk"));
    case 1071: 
      return new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("mk", "MK"));
    case 62: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("ms"));
    case 2110: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("ms", "BN"));
    case 1086: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("ms", "MY"));
    case 78: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("mr"));
    case 1102: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("mr", "IN"));
    case 80: 
      return new SimpleDateFormat("yyyy 'оны' MMMM d", new Locale("mn"));
    case 1104: 
      return new SimpleDateFormat("yyyy 'оны' MMMM d", new Locale("mn", "MN"));
    case 20: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("no"));
    case 1044: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("nb", "NO"));
    case 19: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("nl"));
    case 2067: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("nl", "BE"));
    case 1043: 
      return new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("nl", "NL"));
    case 2068: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("nn", "NO"));
    case 70: 
      return new SimpleDateFormat("dd MMMM yyyy EEEE", new Locale("pa"));
    case 1094: 
      return new SimpleDateFormat("dd MMMM yyyy EEEE", new Locale("pa", "IN"));
    case 21: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("pl"));
    case 1045: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("pl", "PL"));
    case 22: 
      return new SimpleDateFormat("EEEE, d' de 'MMMM' de 'yyyy", new Locale("pt"));
    case 1046: 
      return new SimpleDateFormat("EEEE, d' de 'MMMM' de 'yyyy", new Locale("pt", "BR"));
    case 2070: 
      return new SimpleDateFormat("EEEE, d' de 'MMMM' de 'yyyy", new Locale("pt", "PT"));
    case 24: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("ro"));
    case 1048: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("ro", "RO"));
    case 25: 
      return new SimpleDateFormat("d MMMM yyyy 'г.'", new Locale("ru"));
    case 1049: 
      return new SimpleDateFormat("d MMMM yyyy 'г.'", new Locale("ru", "RU"));
    case 79: 
      return new SimpleDateFormat("dd MMMM yyyy EEEE", new Locale("sa"));
    case 1103: 
      return new SimpleDateFormat("dd MMMM yyyy EEEE", new Locale("sa", "IN"));
    case 27: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("sk"));
    case 1051: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("sk", "SK"));
    case 36: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("sl"));
    case 1060: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("sl", "SI"));
    case 28: 
      return new SimpleDateFormat("yyyy-MM-dd", new Locale("sq"));
    case 1052: 
      return new SimpleDateFormat("yyyy-MM-dd", new Locale("sq", "AL"));
    case 3098: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("sr", "SP", "Cyrl"));
    case 2074: 
      return new SimpleDateFormat("d. MMMM yyyy", new Locale("sr", "SP", "Latn"));
    case 29: 
      return new SimpleDateFormat("'den 'd MMMM yyyy", new Locale("sv"));
    case 2077: 
      return new SimpleDateFormat("'den 'd MMMM yyyy", new Locale("sv", "FI"));
    case 1053: 
      return new SimpleDateFormat("'den 'd MMMM yyyy", new Locale("sv", "SE"));
    case 65: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("sw"));
    case 1089: 
      return new SimpleDateFormat("EEEE, MMMM dd, yyyy", new Locale("sw", "KE"));
    case 90: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("syr"));
    case 1114: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("syr", "SY"));
    case 73: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("ta"));
    case 1097: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("ta", "IN"));
    case 74: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("te"));
    case 1098: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("te", "IN"));
    case 30: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("th"));
    case 1054: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("th", "TH"));
    case 31: 
      return new SimpleDateFormat("dd MMMM yyyy EEEE", new Locale("tr"));
    case 1055: 
      return new SimpleDateFormat("dd MMMM yyyy EEEE", new Locale("tr", "TR"));
    case 68: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("tt"));
    case 1092: 
      return new SimpleDateFormat("d MMMM yyyy", new Locale("tt", "RU"));
    case 34: 
      return new SimpleDateFormat("d MMMM yyyy' р.'", new Locale("uk"));
    case 1058: 
      return new SimpleDateFormat("d MMMM yyyy' р.'", new Locale("uk", "UA"));
    case 32: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ur"));
    case 1056: 
      return new SimpleDateFormat("dd MMMM, yyyy", new Locale("ur", "PK"));
    case 67: 
      return new SimpleDateFormat("yyyy 'yil' d-MMMM", new Locale("uz"));
    case 2115: 
      return new SimpleDateFormat("yyyy 'йил' d-MMMM", new Locale("uz", "UZ", "Cyrl"));
    case 1091: 
      return new SimpleDateFormat("yyyy 'yil' d-MMMM", new Locale("uz", "UZ", "Latn"));
    case 42: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("vi"));
    case 1066: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("vi", "VN"));
    case 2052: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("zh", "CN"));
    case 4: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("zh", "CHS"));
    case 31748: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("zh", "CHT"));
    case 3076: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("zh", "HK"));
    case 5124: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("zh", "MO"));
    case 4100: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("zh", "SG"));
    case 1028: 
      return new SimpleDateFormat("yyyy'年'M'月'd'日'", new Locale("zh", "TW"));
    case 1077: 
      return new SimpleDateFormat("dd MMMM yyyy", new Locale("zu"));
    }
    return DateFormat.getDateInstance(1, paramzzx.a().h());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */