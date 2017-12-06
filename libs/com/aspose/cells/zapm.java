package com.aspose.cells;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

class zapm
  implements zapn
{
  private String a;
  private String b;
  
  public zapm(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public void a(StringBuilder paramStringBuilder, Map<String, String> paramMap)
  {
    String str1 = paramStringBuilder.toString();
    if (str1.startsWith("http")) {
      try
      {
        URL localURL = new URL(str1);
        paramStringBuilder.append(localURL.getQuery() == null ? "?" : "&").append("clientkey=").append(this.a);
        String str2 = a(paramStringBuilder.toString());
        paramStringBuilder.append("&signature=").append(str2);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        localMalformedURLException.printStackTrace();
      }
    } else {
      a(str1, paramMap);
    }
  }
  
  private void a(String paramString, Map<String, String> paramMap)
  {
    String str = a(paramString);
    paramMap.put("clientkey", this.a);
    paramMap.put("signature", str);
  }
  
  private String a(String paramString)
  {
    try
    {
      Mac localMac = Mac.getInstance("HmacSHA1");
      localMac.init(new SecretKeySpec(this.b.getBytes("UTF-8"), "HmacSHA1"));
      String str = DatatypeConverter.printBase64Binary(localMac.doFinal(paramString.toLowerCase().getBytes("UTF-8")));
      if (str.endsWith("=")) {
        str = str.substring(0, str.length() - 1);
      }
      return b(str);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      localInvalidKeyException.printStackTrace();
    }
    return null;
  }
  
  private static String b(String paramString)
  {
    return paramString.replaceAll("\\+", "-").replaceAll("\\/", "_");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */