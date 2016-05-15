package org.toxiccloudgaming.blockminer.registry;

import org.toxiccloudgaming.blockminer.info.WIP;

//Interface used for any game objects which have names that can be translated between languages.
@WIP
public interface Localizable {

    /*
     *
     *  The default language for this game is English - United States.
     *
     */

    //Get the unlocalized name of an object.
    String getUnlocalizedName();

    //Suffix to use for language files.
    String LANG_SUFF = ".lang";

    //List of all languages BlockMiner supports.
    String EN = "en";       //English
    String EN_GB = "en_gb"; //English - Great Britain
    String EN_US = "en_us"; //English - United States
    String ES = "es";       //Spanish
    String ES_MX = "es_mx"; //Spanish - Mexico
}
