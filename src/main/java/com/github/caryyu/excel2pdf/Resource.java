package com.github.caryyu.excel2pdf;

import com.itextpdf.text.pdf.BaseFont;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cary on 6/15/17.
 */
public class Resource {
    /**
     * 中文字体支持
     */
    public static BaseFont BASE_FONT_CHINESE;

    private static Map<String, BaseFont> fontMap = new HashMap<>();

    static {
        try {
//            BASE_FONT_CHINESE = BaseFont.createFont("/home/peter/.fonts/simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            //BASE_FONT_CHINESE = BaseFont.createFont("/home/peter/.fonts/simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            BASE_FONT_CHINESE = addBaseFont("classpath:fonts/Arial.ttf", null,"arial");

            addBaseFont("classpath:fonts/simsun.ttc", 1,"宋体", "simsun", "arial");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BaseFont addBaseFont(String path, Integer index, String... names){
        try {
//            BASE_FONT_CHINESE = BaseFont.createFont("/home/peter/.fonts/simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            File fontFile = ResourceUtils.getFile(path);
            //BASE_FONT_CHINESE = BaseFont.createFont("/home/peter/.fonts/simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            String fontFilePath = fontFile.getAbsolutePath();
            if(index != null){
                fontFilePath += "," + index;
            }
            BaseFont baseFont = BaseFont.createFont(fontFilePath, BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);

            for(String name : names){
                fontMap.put(name, baseFont);
            }
            return baseFont;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static BaseFont getBaseFont(String fontName){
        fontName = fontName.toLowerCase();
        BaseFont baseFont = fontMap.get(fontName);
        if(baseFont == null){
            return BASE_FONT_CHINESE;
        }
        return baseFont;
    }
}