package org.toxiccloudgaming.blockminer.resource;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import org.toxiccloudgaming.blockminer.language.Localizable;

//Main file for loading BlockMiner assets.
public abstract class Asset {

    //Asset file suffixes and types.
    public static final String IMG_SUFF_PNG = ".png";
    public static final String IMG_SUFF_JPG = ".jpg";
    public static final String IMG_SUFF_BMP = ".bmp";
    public static final String TEXT_SUFF_TXT = ".txt";
    public static final String TEXT_SUFF_BIN = ".bin";

    public enum FileType {
        TYPE_IMG_PNG, TYPE_IMG_JPG, TYPE_IMG_BMP,
        TYPE_TEXT_TXT, TYPE_TEXT_BIN, TYPE_LANG
    };

    //Asset directories.
    public static final String DIR_TEXTURE = "texture/";
    public static final String DIR_LANGUAGE = "language/";

    /*
     *
     *  End of directory constants for Assets.
     *
     */

    //Parse type for different files.
    public static String parseType(FileType fileType) {
        switch(fileType) {
            case TYPE_IMG_PNG:
                return IMG_SUFF_PNG;
            case TYPE_IMG_JPG:
                return IMG_SUFF_JPG;
            case TYPE_IMG_BMP:
                return IMG_SUFF_BMP;
            case TYPE_TEXT_TXT:
                return TEXT_SUFF_TXT;
            case TYPE_TEXT_BIN:
                return TEXT_SUFF_BIN;
            case TYPE_LANG:
                return Localizable.LANG_SUFF;
            default:
                return null;
        }
    }

    //Asset method for loading a texture.
    public static Texture loadTexture(String file) {
        return new Texture(Gdx.files.internal(file));
    }
}
